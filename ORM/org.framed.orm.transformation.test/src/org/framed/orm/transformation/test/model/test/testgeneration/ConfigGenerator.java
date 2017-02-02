package org.framed.orm.transformation.test.model.test.testgeneration;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Platform;
import org.osgi.framework.Bundle;

import de.ovgu.featureide.fm.core.FeatureModel;
import de.ovgu.featureide.fm.core.configuration.Configuration;
import de.ovgu.featureide.fm.core.configuration.SelectableFeature;
import de.ovgu.featureide.fm.core.configuration.Selection;
import de.ovgu.featureide.fm.core.io.UnsupportedModelException;
import de.ovgu.featureide.fm.core.io.xml.XmlFeatureModelReader;

/**
 * @author Kevin Kassin<br>
 * This class generate valid feature configurations in structured manner to test transformations.<br>
 *  config[index] = features<br>
 	------------------------<br>
	config[0] = Role_Properties, Role_Behavior<br>
	config[1] = Role_Inheritance<br>
	config[2] = Compartments<br>
	config[3] = Dates<br>
	config[4] = Role_Implication<br>
	config[5] = Role_Prohibtion<br>
	config[6] = Role_Equivalence<br>
	config[7] = Group_Constraints<br>
	config[8] = Occurence_Constraints<br>
	config[9] = Relationship<br>
	config[10] = Relationship_Cardinality<br>
	config[11] = Intra_Relationship_Constraints<br>
	config[12] = Inter_Relationship_Constraints<br>
	config[13] = Compartment_Types<br>
	config[14] = Compartment_Properties, Compartment_Behavior<br>
	config[15] = Compartment_Inheritance<br>
	config[16] = Playable_By_Defining_Compartment<br>
	config[17] = Data_Types<br>
	config[18] = Data_Type_Inheritance
 */
public class ConfigGenerator {
	/**
	 * requirementConfigTuple, list of requirement with its corresponding configurations 
	 */
	public static List<String> rCT;
	
	/**
	 * list of configurations
	 */
	public static List<String> configList;
	
	/**
	 * reduced number of feature, which are relevant to test the transformations 
	 */
	public static int reducedFeatures=19;
	
	/**
	* the file of the corresponding feature model.
	*/
	File featureModelFile = null;
	
	/**
	* the actual feature model used for the configuration
	*/
	private FeatureModel featureModel = new FeatureModel();
	
	/**
	 * Constructor
	 */
	public ConfigGenerator() {
		rCT=calculateRequirementConfigTuple();
		configList = new ArrayList<String>();
	}
	
	/**
	 * This method transforms a BitSet to a String
	 * @param bitSet_config
	 * @return configuration in form of a bit string
	 */
	public String bitSetToString(BitSet bitSet_config) {
		String str_config="";
		for(int i=0; i<ConfigGenerator.reducedFeatures; i++) str_config = str_config + "0";
		for(int i=0; i<ConfigGenerator.reducedFeatures; i++) {
			if(bitSet_config.get(i)) { 
				if(i==0) str_config = "1" + str_config.substring(1);
				else if(i==ConfigGenerator.reducedFeatures) str_config = str_config.substring(0, ConfigGenerator.reducedFeatures-1) + "1";
					 else str_config = str_config.substring(0, i) + "1" + str_config.substring(i+1);
			}	
		}
		return str_config;
	}
	
	/**
	 * This method shifts the values of a BitSet to most right bits
	 * @param bitset
	 * @return shifted BitSet 
	 */
	public BitSet shiftBitSet(BitSet bitset) {
		BitSet bitSetCopy = new BitSet(reducedFeatures);
		int j=bitset.length()-1;
		for(int i=reducedFeatures-bitset.length(); i<reducedFeatures; i++) {
			if(bitset.get(j)) bitSetCopy.set(i);
			j--;
		}
		return bitSetCopy;
	}
	
	/**
	* Reads the included Feature Model from the bundle org.framed.orm.featuremodel
	* 
	* @throws FileNotFoundException
	* @throws UnsupportedModelException
	*/
	public void readFeatureModel() throws FileNotFoundException, UnsupportedModelException {
		final FeatureModel featureModel = new FeatureModel();
		
	    Bundle bundle = Platform.getBundle("org.framed.orm.featuremodel");
	    URL fileURL = bundle.getEntry("model.xml");
	    try {
	      featureModelFile = new File(FileLocator.resolve(fileURL).toURI());
	    } catch (URISyntaxException e1) {
	      e1.printStackTrace();
	    } catch (IOException e1) {
	      e1.printStackTrace();
	    };

	    new XmlFeatureModelReader(featureModel).readFromFile(featureModelFile);
	    this.featureModel = featureModel;
	}
	
	/**
	 * Set Requirements that are used to generate valid configurations that cover every requirement.<br>
	 * <br>
	 * <!-- begin-user-doc -->
	 * Example 1<br>
	 * ---------<br>
	 * indexes in the strings are the same as listed as above in this class.<br> 
	 * <br>
	 * Role Implication (Bit 4) Implies Role Equivalence (Bit 6)<br> 
	 * rCT.add("****1*1************"); //R9: role implications are transformed<br>
	 * <br>
	 * If Role Implication is not transformed, Feature Role Equivalence can be choosen or not<br>
	 * rCT.add("****0*0************"); //R10_1: role implications are not transformed<br>
	 * rCT.add("****0*1************"); //R10_2<br>
	 * <br>
	 * Example 2<br>
	 * ---------<br>
	 * Playable_By_Defining_Compartment (Bit 16) implies Compartments (Bit 2) and Compartment_Types (Bit 13)<br>
	 * rCT.add("**1**********1**1**"); //R31: fulfillments of compartment to its self are transformed<br> 
	 * <br>
	 * If Playable_By_Defining_Compartment is not choosen, Compartments and Compartment_Types can be choosen<br>
	 * Compartments imples Compartment_Types<br>
	 * rCT.add("**0**********0**0**"); //R32_1: fulfillments of compartment to its self are not transformed<br>
	 * rCT.add("**0**********1**0**"); //R32_2<br>
	 * rCT.add("**1**********1**0**"); //R32_3<br>
	 * <!-- end-user-doc -->
	 * @return list of requirements and its corresponding configurations
	 */
	public static List<String> calculateRequirementConfigTuple() {
		rCT = new ArrayList<String>();//rCT = requirementConfigTuple
		
		//set requirements and their relevant feature configuration
		rCT.add("1******************"); //Requirement 1: role properties and operations are transformed
		rCT.add("0******************"); //R2: role properties and operations are not transformed
		rCT.add("*1*****************"); //R3: role inheritances are transformed
		rCT.add("*0*****************"); //R4: role inheritances are not transformed
		rCT.add("**1**********1*****"); //R5: fulfillments with compartment types as player are transformed
		rCT.add("**0**********0*****"); //R6_1: fulfillments with compartment types as player are not transformed
		rCT.add("**0**********1*****"); //R6_2
		rCT.add("***1**********1****"); //R7: fulfillments with data types as player are transformed
		rCT.add("***0**********0****"); //R8_1: fulfillments with data types as player are not transformed
		rCT.add("***0**********1****"); //R8_2 
		rCT.add("****1*1************"); //R9: role implications are transformed
		rCT.add("****0*0************"); //R10_1: role implications are not transformed
		rCT.add("****0*1************"); //R10_2
		rCT.add("*****1*************"); //R11: role prohibitions are transformed
		rCT.add("*****0*************"); //R12: role prohibitions are not transformed
		//R13_1: role equivalences are transformed = R9
		//R13_2 = R10_2
		//R14: role equivalences are not transformed = R10_1
		rCT.add("*******1***********"); //R15: group constraints are transformed
		rCT.add("*******0***********"); //R16: group constraints are not transformed
		rCT.add("********1**********"); //R17: occurrence constraints are transformed
		rCT.add("********0**********"); //R18: occurrence constraints are not transformed
		rCT.add("*********1000******"); //R19_1: relationships are transformed
		rCT.add("*********1001******"); //R19_2		connected to its child
		rCT.add("*********1010******"); //R19_3     features, every combination
		rCT.add("*********1011******"); //R19_4     of child features used
		rCT.add("*********1100******"); //R19_5     
		rCT.add("*********1101******"); //R19_6
		rCT.add("*********1110******"); //R19_7
		rCT.add("*********1111******"); //R19_8
		rCT.add("*********0000******"); //R20: relationships are not transformed
		rCT.add("*********11********"); //R21: relationship cardinalities are transformed
		rCT.add("*********00********"); //R22_1: relationship cardinalities are not transformed
		rCT.add("*********10********"); //R22_2
		rCT.add("*********1*1*******"); //R23: relationship cardinalities are transformed
		rCT.add("*********0*0*******"); //R24_1: relationship cardinalities are not transformed
		rCT.add("*********1*0*******"); //R24_2
		rCT.add("*********1**1******"); //R25: relationship cardinalities are transformed
		rCT.add("*********0**0******"); //R26_1: relationship cardinalities are not transformed
		rCT.add("*********1**0******"); //R26_2
		rCT.add("*************11****"); //R27: compartment type attributes and operations are transformed
		rCT.add("*************00****"); //R28_1: compartment type attributes and operations are not transformed
		rCT.add("*************10****"); //R28_2
		rCT.add("*************1*1***"); //R29: compartment inheritance are transformed
		rCT.add("*************0*0***"); //R30_1: compartment inheritance are not transformed
		rCT.add("*************1*0***"); //R30_2
		rCT.add("**1**********1**1**"); //R31: fulfillments of compartment to its self are transformed 
		rCT.add("**0**********0**0**"); //R32_1: fulfillments of compartment to its self are not transformed
		rCT.add("**0**********1**0**"); //R32_2
		rCT.add("**1**********1**0**"); //R32_3
		rCT.add("*****************11"); //R33_1: data types are transformed
		rCT.add("*****************10"); //R33_2 
		rCT.add("*****************00"); //R34: data types are not transformed
		//R35: data type inheritance are transformed = R33_1
		//R36_1: data type inheritance are not transformed = R34
		//R36_2 = R33_2
		rCT.add("0000000000000000000"); //R37_1: Corner case empty configuration
		rCT.add("1111111111111111111"); //R37_2: Corner case full configuration

		return rCT;
	}
	
	/**
	 * Checks if all entries of requirementConfigTuple/ rCT are used
	 * @param used 
	 * @return boolean if all entries of requirementConfigTuple are used
	 */
	public static boolean allEntriesUsed(List<Boolean> used) {
		for(boolean b : used) if(!b) return false;
		return true;
	}
	
	/**
	 * Calculates the configurations using requirementConfigTuple/rCT 
	 */
	public static void calculateCofigurations() {
		String config;
		boolean noContradiction;
		List<Boolean> used = new ArrayList<Boolean>();
		for(int h=0; h<rCT.size(); h++) used.add(false);
		
		while(!allEntriesUsed(used)) {
			config=null;
			//find first unused entry
			for(String entry : rCT) {
				if(!used.get(rCT.indexOf(entry)) && config==null) {
					config=entry;
					used.set(rCT.indexOf(entry), true);
				}
			}
			
			for(String entry : rCT) {
				noContradiction=true;
				//check other unused entries for contradictions
				if(!used.get(rCT.indexOf(entry))) {
					for(int i=0; i<reducedFeatures; i++) { 
						if(config.charAt(i)!='*' && entry.charAt(i)!='*' && config.charAt(i)!=entry.charAt(i)) noContradiction=false;	
					}
					//if no contradictions, migrate the entries into each other
					if(noContradiction) {
						for(int j=0; j<reducedFeatures; j++) {
							if(config.charAt(j)=='*')
								if(j==reducedFeatures-1) config = config.substring(0, j) + entry.charAt(j);
								else if(j==0) config = entry.charAt(j) + config.substring(j+1);
								     else config = config.substring(0, j) + entry.charAt(j) + config.substring(j+1);
						}
						used.set(rCT.indexOf(entry), true);
					}
				}	
			}
			config = config.replace('*', '0');
			configList.add(config);
		}	
	}
	
	/**
	 * This method creates valid configurations;
	 * @return List of valid configurations
	 * @throws UnsupportedModelException 
	 * @throws FileNotFoundException 
	 */
	public List<BitSet> generateConfigurations() throws FileNotFoundException, UnsupportedModelException {
		List<BitSet> bitSet_configList = new ArrayList<BitSet>();
		
		calculateCofigurations();
		
		for(String str_config : configList) 
			bitSet_configList.add(shiftBitSet(BitSet.valueOf(new long[]{Integer.parseInt(str_config, 2)})));
		return bitSet_configList;
	}
}
