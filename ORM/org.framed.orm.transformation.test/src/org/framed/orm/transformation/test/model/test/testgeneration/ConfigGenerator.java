package org.framed.orm.transformation.test.model.test.testgeneration;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.BitSet;
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
 * @author Kevin Kassin
 * This class generate valid feature configurations in compact manner to test transformations.
 */

public class ConfigGenerator {
	
/*
 	config[index] = features
 	------------------------
	config[0] = Role_Properties, Role_Behavior
	config[1] = Role_Inheritance
	config[2] = Compartments
	config[3] = Dates
	config[4] = Role_Implication
	config[5] = Role_Prohibtion
	config[6] = Role_Equivalence
	config[7] = Group_Constraints
	config[8] = Occurence_Constraints
	config[9] = Relationship
	config[10] = Relationship_Cardinality
	config[11] = Intra_Relationship_Constraints
	config[12] = Inter_Relationship_Constraints
	config[13] = Compartment_Types
	config[14] = Compartment_Properties, Compartment_Behavior
	config[15] = Compartment_Inheritance
	config[16] = Playable_By_Defining_Compartment
	config[17] = Data_Types
	config[18] = Data_Type_Inheritance
*/
	/**
	 * reduced number of feature, which are relevant to test the transformations 
	 */
	public static int reducedFeatures=19;
	
	/**
	 * used to save prior valid configurations
	 */
	public BitSet configBefore1;
	
	/**
	 * used to save prior valid configurations
	 */
	public BitSet configBefore2;
	
	/**
	* The file of the corresponding feature model.
	*/
	File featureModelFile = null;
	
	/**
	* The actual feature model used for the configuration
	*/
	private FeatureModel featureModel = new FeatureModel();
	
	/**
	 * constructor
	 */
	public ConfigGenerator() {
		configBefore1=null;
		configBefore2=null;
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
		BitSet bitSetCopy = new BitSet(19);
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
	 * This method created the model configuration based on the generated bitSet_config
	 * @param bitSet_config
	 * @return model configuration based on bitSet_config
	 */
	public Configuration buildFramedConfiguration(BitSet bitSet_config) {
		Configuration configuration = new Configuration(featureModel);
	    configuration.setPropagate(true);
	    configuration.resetValues();
	    configuration.update();
	 
	    //features that are always selected
		configuration.setManual("RML_Feature_Model", Selection.SELECTED);
		configuration.setManual("Role_Types", Selection.SELECTED);
		configuration.setManual("Playable", Selection.SELECTED);
		configuration.setManual("Players", Selection.SELECTED);
		configuration.setManual("Naturals", Selection.SELECTED);
		configuration.setManual("Roles", Selection.SELECTED);
		    
		//features depending on bitSet_config
		//Role_Properties and Role_Behavior, Role_Properties equals Role_Behavior
		if(bitSet_config.get(0)) {	configuration.setManual("Role_Properties", Selection.SELECTED); 
		    						configuration.setManual("Role_Behavior", Selection.SELECTED); } 
		    else { configuration.setManual("Role_Properties", Selection.UNSELECTED); 
		    	   configuration.setManual("Role_Behavior", Selection.UNSELECTED); }
		//Role_Inheritance
		if(bitSet_config.get(1)) configuration.setManual("Role_Inheritance", Selection.SELECTED);
		    else configuration.setManual("Role_Inheritance", Selection.UNSELECTED);
		//Compartments
		if(bitSet_config.get(2)) configuration.setManual("Compartments", Selection.SELECTED);
		    else configuration.setManual("Compartments", Selection.UNSELECTED);
		//Dates
		if(bitSet_config.get(3)) configuration.setManual("Dates", Selection.SELECTED);
    		else configuration.setManual("Dates", Selection.UNSELECTED);
		//Role_Implication
		if(bitSet_config.get(4)) configuration.setManual("Role_Implication", Selection.SELECTED);
	    	else configuration.setManual("Role_Implication", Selection.UNSELECTED);
		//Role_Prohibition
		if(bitSet_config.get(5)) configuration.setManual("Role_Prohibition", Selection.SELECTED);
	    	else configuration.setManual("Role_Prohibition", Selection.UNSELECTED);
		//Role_Equivalence, Role_Implication implies Role_Equivalence
		//Selection stays on UNDEFINED if !Role_Equivalence and Role_Implication -> checked later in validCheck
		if(bitSet_config.get(6)) configuration.setManual("Role_Equivalence", Selection.SELECTED); 
		    else if(!bitSet_config.get(4)) configuration.setManual("Role_Equivalence", Selection.UNSELECTED);
		//Group_Constraints
		if(bitSet_config.get(7)) configuration.setManual("Group_Constraints", Selection.SELECTED);
	    	else configuration.setManual("Group_Constraints", Selection.UNSELECTED);	
		//Occurrence_Constraints
		if(bitSet_config.get(8)) configuration.setManual("Occurrence_Constraints", Selection.SELECTED);
	    	else configuration.setManual("Occurrence_Constraints", Selection.UNSELECTED);
		//Relationships, On_Relationship equals Relationships
		if(bitSet_config.get(9)) { 	configuration.setManual("Relationships", Selection.SELECTED);
			   						configuration.setManual("On_Relationships", Selection.SELECTED); }
		   	else { 	configuration.setManual("Relationships", Selection.UNSELECTED);
		    		configuration.setManual("On_Relationships", Selection.UNSELECTED); }
		//Relationship_Cardinality
		if(bitSet_config.get(10) && bitSet_config.get(9)) configuration.setManual("Relationship_Cardinality", Selection.SELECTED);
	    	else configuration.setManual("Relationship_Cardinality", Selection.UNSELECTED);
		//Intra_Relationship_Constraints and Parthood_Constraints
		if(bitSet_config.get(11) && bitSet_config.get(9)) { 
		    	configuration.setManual("Intra_Relationship_Constraints", Selection.SELECTED); 
		    	configuration.setManual("Parthood_Constraints", Selection.SELECTED); }
		    else { configuration.setManual("Intra_Relationship_Constraints", Selection.UNSELECTED);
		    	   configuration.setManual("Parthood_Constraints", Selection.UNSELECTED); }
		//Inter_Relationship_Constraints
		if(bitSet_config.get(12) && bitSet_config.get(9)) configuration.setManual("Inter_Relationship_Constraints", Selection.SELECTED);
	    	else configuration.setManual("Inter_Relationship_Constraints", Selection.UNSELECTED);
		//Compartment_Types/ Participants and Contains_Compartments, On_Compartments equals Compartment_Types
		//Selection stays on UNDEFINED if !Compartments and Compartment_Types -> checked later in validCheck
		if(bitSet_config.get(13)) { configuration.setManual("Compartment_Types", Selection.SELECTED);
									configuration.setManual("Contains_Compartments", Selection.SELECTED); 
									configuration.setManual("Participants", Selection.SELECTED);
									configuration.setManual("On_Compartments", Selection.SELECTED); } 
		    else if(!bitSet_config.get(2)) { configuration.setManual("Compartment_Types", Selection.UNSELECTED);
		    		  						 configuration.setManual("Contains_Compartments", Selection.UNSELECTED); 
		    		  						 configuration.setManual("Participants", Selection.UNSELECTED); 
		    		  						 configuration.setManual("On_Compartments", Selection.UNSELECTED); }
		//Compartment_Properties and Compartment_Behavior, Compartment_Properties equals Compartment_Behavior
		if(bitSet_config.get(14) && configuration.getSelectablefeature("Compartment_Types").getSelection()==Selection.SELECTED) 
		    { configuration.setManual("Compartment_Properties", Selection.SELECTED);
			  configuration.setManual("Compartment_Behavior", Selection.SELECTED); } 
		    else { configuration.setManual("Compartment_Properties", Selection.UNSELECTED);
		    	   configuration.setManual("Compartment_Behavior", Selection.UNSELECTED); }
		//Compartment_Inheritance
		if(bitSet_config.get(15) && configuration.getSelectablefeature("Compartment_Types").getSelection()==Selection.SELECTED) 
		    	 configuration.setManual("Compartment_Inheritance", Selection.SELECTED);
		    else configuration.setManual("Compartment_Inheritance", Selection.UNSELECTED);
		//Playable_by_Defining_Compartment
		if(bitSet_config.get(16) && configuration.getSelectablefeature("Compartment_Types").getSelection()==Selection.SELECTED) 
		    	 configuration.setManual("Playable_by_Defining_Compartment", Selection.SELECTED);
		    else configuration.setManual("Playable_by_Defining_Compartment", Selection.UNSELECTED);
		//Data_Types, Dates implies Data_Types
		//Selection stays on UNDEFINED if !Data_Types and Dates -> checked later in validCheck
		if(bitSet_config.get(17)) configuration.setManual("Data_Types", Selection.SELECTED);
		    else if(!bitSet_config.get(3)) configuration.setManual("Data_Types", Selection.UNSELECTED);
		//Data_Type_Inheritance
		if(bitSet_config.get(18) && configuration.getSelectablefeature("Data_Types").getSelection()==Selection.SELECTED) 
		    	 configuration.setManual("Data_Type_Inheritance", Selection.SELECTED);
    		else configuration.setManual("Data_Type_Inheritance", Selection.UNSELECTED);
		return configuration;
	}
	
	/**
	 * This method checks if a configuration is valid.
	 * @param bitSet_config_config 
	 * @return boolean if configuration is valid
	 */
	public boolean validCheck(BitSet bitSet_config) {
		Configuration configuration; 
		Boolean containsUndefined=false;
	    
		int reducedFeaturesOn=0, differenceToConfigBefore1=0, differenceToConfigBefore2=0;
		//count number of choosed reduced features
		for(int i=0; i<reducedFeatures; i++) if(bitSet_config.get(i)) reducedFeaturesOn++;
		//copy config and xor BitSets to count differences
		BitSet configCopy = new BitSet(19);
		for(int i=0; i<reducedFeatures; i++) {if(bitSet_config.get(i)) configCopy.set(i);} 
		if(configBefore1!=null) {configCopy.xor(configBefore1); differenceToConfigBefore1 = configCopy.cardinality();}
		else differenceToConfigBefore1=reducedFeatures+1;
		for(int i=0; i<reducedFeatures; i++) {if(bitSet_config.get(i)) configCopy.set(i);}
		if(configBefore2!=null) {configCopy.xor(configBefore2); differenceToConfigBefore2 = configCopy.cardinality();}	
		else differenceToConfigBefore2=reducedFeatures+1;
		
		if((reducedFeaturesOn!=0 && reducedFeaturesOn<=9) || 		//configurations with 0 or more than 9 reduced Features
		   (differenceToConfigBefore1<=8)				  || 	    //configuration differs on more than 8 places to the two accepted before
		   (differenceToConfigBefore2<=8)
		) return false;  			
		configuration = buildFramedConfiguration(bitSet_config);
		for(SelectableFeature feature : configuration.getFeatures()) if(feature.getSelection()==Selection.UNDEFINED) containsUndefined=true;
		if(!(configuration.isValid()) || 							//configuration is valid
		   containsUndefined) return false;    	 					//configuration does not contain any undefined features
		
		configBefore2=configBefore1; 
		configBefore1=bitSet_config;
		return true;
	}
	
	/**
	 * This method creates valid configurations;
	 * @return List of valid configurations
	 * @throws UnsupportedModelException 
	 * @throws FileNotFoundException 
	 */
	public List<BitSet> generateConfigurations() throws FileNotFoundException, UnsupportedModelException {
		int int_config = 0b0000000000000000000;
		List<BitSet> configList = new ArrayList<BitSet>();
		BitSet bitSet_config = new BitSet(19);
	
		readFeatureModel();
		while(int_config<=0b1111111111111111111) {
			bitSet_config = BitSet.valueOf(new long[]{int_config});
			bitSet_config = shiftBitSet(bitSet_config);
			if(validCheck(bitSet_config)) configList.add(bitSet_config);
			int_config++; 
		}
		/*
		int_config = 0b1111110110000100001;
		bitSet_config = BitSet.valueOf(new long[]{int_config});
		bitSet_config = shiftBitSet(bitSet_config);
		configList.add(bitSet_config);
		int_config = 0b1011101100000101101;
		bitSet_config = BitSet.valueOf(new long[]{int_config});
		bitSet_config = shiftBitSet(bitSet_config);
		configList.add(bitSet_config);
		int_config = 0b1001100000001111111;
		bitSet_config = BitSet.valueOf(new long[]{int_config});
		bitSet_config = shiftBitSet(bitSet_config);
		configList.add(bitSet_config);
		int_config = 0b0110110011111100000;
		bitSet_config = BitSet.valueOf(new long[]{int_config});
		bitSet_config = shiftBitSet(bitSet_config);
		configList.add(bitSet_config);
		int_config = 0b0011110000000111111;
		bitSet_config = BitSet.valueOf(new long[]{int_config});
		bitSet_config = shiftBitSet(bitSet_config);
		configList.add(bitSet_config);
		int_config = 0b1111111001110100001;
		bitSet_config = BitSet.valueOf(new long[]{int_config});
		bitSet_config = shiftBitSet(bitSet_config);
		configList.add(bitSet_config);
		int_config = 0b1111111111111111111;
		bitSet_config = BitSet.valueOf(new long[]{int_config});
		bitSet_config = shiftBitSet(bitSet_config);
		configList.add(bitSet_config);
		int_config = 0b0000000000000000000;
		bitSet_config = BitSet.valueOf(new long[]{int_config});
		bitSet_config = shiftBitSet(bitSet_config);
		configList.add(bitSet_config);
		int_config = 0b0000111110000011111;
		bitSet_config = BitSet.valueOf(new long[]{int_config});
		bitSet_config = shiftBitSet(bitSet_config);
		configList.add(bitSet_config);
		int_config = 0b0101100111110000011;
		bitSet_config = BitSet.valueOf(new long[]{int_config});
		bitSet_config = shiftBitSet(bitSet_config);
		configList.add(bitSet_config);*/
		return configList;
	}
}
