package org.framed.orm.transformation.test.model.test.testgeneration;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;

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
	 * used to save the prior valid configuration
	 */
	public BitSet configBefore;
	
	/**
	 * constructor
	 */
	public ConfigGenerator() {
		configBefore=null;
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
	 * This method checks if a configuration is valid.
	 * @param str_config 
	 * @return boolean if configuration is valid
	 */
	public boolean validCheck(BitSet bitSet_config) {
		int reducedFeaturesOn=0, differenceToConfigBefore=0;
		//count number of choosed reduced features
		for(int i=0; i<reducedFeatures; i++) if(bitSet_config.get(i)) reducedFeaturesOn++;
		//copy config and xor BitSets to count differences
		BitSet configCopy = new BitSet(19);
		for(int i=0; i<reducedFeatures; i++) {if(bitSet_config.get(i)) configCopy.set(i);} 
		if(configBefore!=null) {configCopy.xor(configBefore); differenceToConfigBefore = configCopy.cardinality();}	
		else differenceToConfigBefore=reducedFeatures+1;
		if((bitSet_config.get(2) && !(bitSet_config.get(13))) || //Compartments implies Compartment_Types
		   (bitSet_config.get(4) && !(bitSet_config.get(6)))  || //Role_Implication implies Role_Equivalence		
		   (bitSet_config.get(3) && !(bitSet_config.get(17))) || //Dates implies Data_Types 	
		   (bitSet_config.get(10) && !(bitSet_config.get(9))) || //Relationship is implied by its child elements
		   (bitSet_config.get(11) && !(bitSet_config.get(9))) ||
		   (bitSet_config.get(12) && !(bitSet_config.get(9))) ||
		   (bitSet_config.get(14) && !(bitSet_config.get(13)))|| //Compartment is implied by its child elements  
		   (bitSet_config.get(15) && !(bitSet_config.get(13)))||
		   (bitSet_config.get(16) && !(bitSet_config.get(13)))||
		   (reducedFeaturesOn!=0 && reducedFeaturesOn<=9)|| //configurations with 0 or more than 9 reduced Features
		   (differenceToConfigBefore<=8)					//configuration differs on more than 8 places to the one accepted before
		) return false; 
		else { configBefore=bitSet_config; return true; }
	}
	
	/**
	 * This method creates valid configurations;
	 * @return List of valid configurations
	 */
	public List<BitSet> generateConfigurations() {
		int int_config = 0b0000000000000000000;
		List<BitSet> configList = new ArrayList<BitSet>();
		BitSet bitSet_config = new BitSet(19);
	
		while(int_config<=0b1111111111111111111) {
			bitSet_config = BitSet.valueOf(new long[]{int_config});
			bitSet_config = shiftBitSet(bitSet_config);
			if(validCheck(bitSet_config)) {configList.add(bitSet_config);}
			int_config++; 
		}
		return configList;
	}
}
