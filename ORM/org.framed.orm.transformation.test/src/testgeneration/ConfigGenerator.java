package testgeneration;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
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
	public String configBefore;
	
	public ConfigGenerator() {
		configBefore=null;
	}
	
	/**
	 * This checks a configuration if it is valid.
	 * @param str_config 
	 * @return boolean if configuration is valid
	 */
	public boolean validCheck(String str_config) {
		int reducedFeaturesOn=0, differenceToConfigBefore=0;
		for(int i=0; i<reducedFeatures; i++) if(str_config.charAt(i)=='1') reducedFeaturesOn++;
		if(configBefore!=null) {
			for(int i=0; i<reducedFeatures; i++) {
				if(str_config.charAt(i)!=configBefore.charAt(i)) differenceToConfigBefore++;
			}	
		} else differenceToConfigBefore=reducedFeatures+1;
		if((str_config.charAt(2)=='1' && str_config.charAt(13)=='0') || //Compartments implies Compartment_Types
		   (str_config.charAt(4)=='1' && str_config.charAt(6)=='0')  || //Role_Implication implies Role_Equivalence		
		   (str_config.charAt(3)=='1' && str_config.charAt(17)=='0') || //Dates implies Data_Types 	
		   (str_config.charAt(10)=='1' && str_config.charAt(9)=='0') || //Relationship is implied by its child elements
		   (str_config.charAt(11)=='1' && str_config.charAt(9)=='0') ||
		   (str_config.charAt(12)=='1' && str_config.charAt(9)=='0') ||
		   (str_config.charAt(14)=='1' && str_config.charAt(13)=='0')|| //Compartment is implied by its child elements  
		   (str_config.charAt(15)=='1' && str_config.charAt(13)=='0')||
		   (str_config.charAt(16)=='1' && str_config.charAt(13)=='0')||
		   (reducedFeaturesOn!=0 && reducedFeaturesOn<=9)			 || //configurations with 0 or more than 5 reduced Features
		   (differenceToConfigBefore<=8)								//configuration differs on more than 4 places to the one accepted before
		) return false; 
		else {configBefore=str_config; return true; }
	}
	
	/**
	 * This creates a limited amount of valid configurations;
	 * @param limit
	 * @return List of valid configurations
	 */
	public List<String> generateConfigurations(int limit) {
		int config = 0b0000000000000000000, i = 0;
		List<String> configList = new ArrayList<String>();
		if(limit==0) limit=0b1111111111111111111;
		while(i<limit) {
			//Add leading zeros to the binary number in string format
			String str_config=("0000000000000000000" + Integer.toBinaryString(config)).substring(Integer.toBinaryString(config).length());
			if(validCheck(str_config)) {configList.add(str_config); i++;}
			config++;
		}
		return configList;
	}
}
