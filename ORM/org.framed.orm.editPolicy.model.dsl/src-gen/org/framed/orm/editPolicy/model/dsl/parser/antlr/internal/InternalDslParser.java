package org.framed.orm.editPolicy.model.dsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.framed.orm.editPolicy.model.dsl.services.DslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "':'", "'true'", "'RelationIsCyclic'", "'RelationTypesAreEqual'", "'RelationIsReflexiv'", "'RelationType'", "'TypeExists'", "'SourceType'", "'TargetType'", "'CommandName'", "'ShapeType'", "'ParentType'", "'StepIn'", "'false'", "'ShapeName'", "'=>'", "'||'", "'&&'", "'!'", "'('", "')'"
    };
    public static final int RULE_ID=4;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__30=30;
    public static final int T__19=19;
    public static final int T__31=31;
    public static final int RULE_STRING=5;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=6;
    public static final int RULE_WS=9;

    // delegates
    // delegators


        public InternalDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalDsl.g"; }



     	private DslGrammarAccess grammarAccess;

        public InternalDslParser(TokenStream input, DslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected DslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalDsl.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalDsl.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalDsl.g:65:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalDsl.g:71:1: ruleModel returns [EObject current=null] : ( ( (lv_configuration_0_0= ruleConfiguration ) ) ( ( (lv_policies_1_0= rulePolicy ) ) ( (lv_policies_2_0= rulePolicy ) )* )? ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_configuration_0_0 = null;

        EObject lv_policies_1_0 = null;

        EObject lv_policies_2_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:77:2: ( ( ( (lv_configuration_0_0= ruleConfiguration ) ) ( ( (lv_policies_1_0= rulePolicy ) ) ( (lv_policies_2_0= rulePolicy ) )* )? ) )
            // InternalDsl.g:78:2: ( ( (lv_configuration_0_0= ruleConfiguration ) ) ( ( (lv_policies_1_0= rulePolicy ) ) ( (lv_policies_2_0= rulePolicy ) )* )? )
            {
            // InternalDsl.g:78:2: ( ( (lv_configuration_0_0= ruleConfiguration ) ) ( ( (lv_policies_1_0= rulePolicy ) ) ( (lv_policies_2_0= rulePolicy ) )* )? )
            // InternalDsl.g:79:3: ( (lv_configuration_0_0= ruleConfiguration ) ) ( ( (lv_policies_1_0= rulePolicy ) ) ( (lv_policies_2_0= rulePolicy ) )* )?
            {
            // InternalDsl.g:79:3: ( (lv_configuration_0_0= ruleConfiguration ) )
            // InternalDsl.g:80:4: (lv_configuration_0_0= ruleConfiguration )
            {
            // InternalDsl.g:80:4: (lv_configuration_0_0= ruleConfiguration )
            // InternalDsl.g:81:5: lv_configuration_0_0= ruleConfiguration
            {

            					newCompositeNode(grammarAccess.getModelAccess().getConfigurationConfigurationParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_3);
            lv_configuration_0_0=ruleConfiguration();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getModelRule());
            					}
            					set(
            						current,
            						"configuration",
            						lv_configuration_0_0,
            						"org.framed.orm.editPolicy.model.dsl.Dsl.Configuration");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDsl.g:98:3: ( ( (lv_policies_1_0= rulePolicy ) ) ( (lv_policies_2_0= rulePolicy ) )* )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_ID) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalDsl.g:99:4: ( (lv_policies_1_0= rulePolicy ) ) ( (lv_policies_2_0= rulePolicy ) )*
                    {
                    // InternalDsl.g:99:4: ( (lv_policies_1_0= rulePolicy ) )
                    // InternalDsl.g:100:5: (lv_policies_1_0= rulePolicy )
                    {
                    // InternalDsl.g:100:5: (lv_policies_1_0= rulePolicy )
                    // InternalDsl.g:101:6: lv_policies_1_0= rulePolicy
                    {

                    						newCompositeNode(grammarAccess.getModelAccess().getPoliciesPolicyParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_3);
                    lv_policies_1_0=rulePolicy();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getModelRule());
                    						}
                    						add(
                    							current,
                    							"policies",
                    							lv_policies_1_0,
                    							"org.framed.orm.editPolicy.model.dsl.Dsl.Policy");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDsl.g:118:4: ( (lv_policies_2_0= rulePolicy ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==RULE_ID) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalDsl.g:119:5: (lv_policies_2_0= rulePolicy )
                    	    {
                    	    // InternalDsl.g:119:5: (lv_policies_2_0= rulePolicy )
                    	    // InternalDsl.g:120:6: lv_policies_2_0= rulePolicy
                    	    {

                    	    						newCompositeNode(grammarAccess.getModelAccess().getPoliciesPolicyParserRuleCall_1_1_0());
                    	    					
                    	    pushFollow(FOLLOW_3);
                    	    lv_policies_2_0=rulePolicy();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getModelRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"policies",
                    	    							lv_policies_2_0,
                    	    							"org.framed.orm.editPolicy.model.dsl.Dsl.Policy");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRulePolicyRule"
    // InternalDsl.g:142:1: entryRulePolicyRule returns [EObject current=null] : iv_rulePolicyRule= rulePolicyRule EOF ;
    public final EObject entryRulePolicyRule() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePolicyRule = null;


        try {
            // InternalDsl.g:142:51: (iv_rulePolicyRule= rulePolicyRule EOF )
            // InternalDsl.g:143:2: iv_rulePolicyRule= rulePolicyRule EOF
            {
             newCompositeNode(grammarAccess.getPolicyRuleRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePolicyRule=rulePolicyRule();

            state._fsp--;

             current =iv_rulePolicyRule; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePolicyRule"


    // $ANTLR start "rulePolicyRule"
    // InternalDsl.g:149:1: rulePolicyRule returns [EObject current=null] : (this_TrueRule_0= ruleTrueRule | this_FalseRule_1= ruleFalseRule | this_CommandNameRule_2= ruleCommandNameRule | this_ShapeTypeRule_3= ruleShapeTypeRule | this_ParentTypeRule_4= ruleParentTypeRule | this_StepInRule_5= ruleStepInRule | this_SourceTypeRule_6= ruleSourceTypeRule | this_TargetTypeRule_7= ruleTargetTypeRule | this_RelationIsCyclicRule_8= ruleRelationIsCyclicRule | this_RelationIsReflexivRule_9= ruleRelationIsReflexivRule | this_RelationTypesAreEqualRule_10= ruleRelationTypesAreEqualRule | this_TypeExistsRule_11= ruleTypeExistsRule | this_ShapeNameRule_12= ruleShapeNameRule | this_RelationTypeRule_13= ruleRelationTypeRule ) ;
    public final EObject rulePolicyRule() throws RecognitionException {
        EObject current = null;

        EObject this_TrueRule_0 = null;

        EObject this_FalseRule_1 = null;

        EObject this_CommandNameRule_2 = null;

        EObject this_ShapeTypeRule_3 = null;

        EObject this_ParentTypeRule_4 = null;

        EObject this_StepInRule_5 = null;

        EObject this_SourceTypeRule_6 = null;

        EObject this_TargetTypeRule_7 = null;

        EObject this_RelationIsCyclicRule_8 = null;

        EObject this_RelationIsReflexivRule_9 = null;

        EObject this_RelationTypesAreEqualRule_10 = null;

        EObject this_TypeExistsRule_11 = null;

        EObject this_ShapeNameRule_12 = null;

        EObject this_RelationTypeRule_13 = null;



        	enterRule();

        try {
            // InternalDsl.g:155:2: ( (this_TrueRule_0= ruleTrueRule | this_FalseRule_1= ruleFalseRule | this_CommandNameRule_2= ruleCommandNameRule | this_ShapeTypeRule_3= ruleShapeTypeRule | this_ParentTypeRule_4= ruleParentTypeRule | this_StepInRule_5= ruleStepInRule | this_SourceTypeRule_6= ruleSourceTypeRule | this_TargetTypeRule_7= ruleTargetTypeRule | this_RelationIsCyclicRule_8= ruleRelationIsCyclicRule | this_RelationIsReflexivRule_9= ruleRelationIsReflexivRule | this_RelationTypesAreEqualRule_10= ruleRelationTypesAreEqualRule | this_TypeExistsRule_11= ruleTypeExistsRule | this_ShapeNameRule_12= ruleShapeNameRule | this_RelationTypeRule_13= ruleRelationTypeRule ) )
            // InternalDsl.g:156:2: (this_TrueRule_0= ruleTrueRule | this_FalseRule_1= ruleFalseRule | this_CommandNameRule_2= ruleCommandNameRule | this_ShapeTypeRule_3= ruleShapeTypeRule | this_ParentTypeRule_4= ruleParentTypeRule | this_StepInRule_5= ruleStepInRule | this_SourceTypeRule_6= ruleSourceTypeRule | this_TargetTypeRule_7= ruleTargetTypeRule | this_RelationIsCyclicRule_8= ruleRelationIsCyclicRule | this_RelationIsReflexivRule_9= ruleRelationIsReflexivRule | this_RelationTypesAreEqualRule_10= ruleRelationTypesAreEqualRule | this_TypeExistsRule_11= ruleTypeExistsRule | this_ShapeNameRule_12= ruleShapeNameRule | this_RelationTypeRule_13= ruleRelationTypeRule )
            {
            // InternalDsl.g:156:2: (this_TrueRule_0= ruleTrueRule | this_FalseRule_1= ruleFalseRule | this_CommandNameRule_2= ruleCommandNameRule | this_ShapeTypeRule_3= ruleShapeTypeRule | this_ParentTypeRule_4= ruleParentTypeRule | this_StepInRule_5= ruleStepInRule | this_SourceTypeRule_6= ruleSourceTypeRule | this_TargetTypeRule_7= ruleTargetTypeRule | this_RelationIsCyclicRule_8= ruleRelationIsCyclicRule | this_RelationIsReflexivRule_9= ruleRelationIsReflexivRule | this_RelationTypesAreEqualRule_10= ruleRelationTypesAreEqualRule | this_TypeExistsRule_11= ruleTypeExistsRule | this_ShapeNameRule_12= ruleShapeNameRule | this_RelationTypeRule_13= ruleRelationTypeRule )
            int alt3=14;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt3=1;
                }
                break;
            case 24:
                {
                alt3=2;
                }
                break;
            case 20:
                {
                alt3=3;
                }
                break;
            case 21:
                {
                alt3=4;
                }
                break;
            case 22:
                {
                alt3=5;
                }
                break;
            case 23:
                {
                alt3=6;
                }
                break;
            case 18:
                {
                alt3=7;
                }
                break;
            case 19:
                {
                alt3=8;
                }
                break;
            case 13:
                {
                alt3=9;
                }
                break;
            case 15:
                {
                alt3=10;
                }
                break;
            case 14:
                {
                alt3=11;
                }
                break;
            case 17:
                {
                alt3=12;
                }
                break;
            case 25:
                {
                alt3=13;
                }
                break;
            case 16:
                {
                alt3=14;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalDsl.g:157:3: this_TrueRule_0= ruleTrueRule
                    {

                    			newCompositeNode(grammarAccess.getPolicyRuleAccess().getTrueRuleParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_TrueRule_0=ruleTrueRule();

                    state._fsp--;


                    			current = this_TrueRule_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalDsl.g:166:3: this_FalseRule_1= ruleFalseRule
                    {

                    			newCompositeNode(grammarAccess.getPolicyRuleAccess().getFalseRuleParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_FalseRule_1=ruleFalseRule();

                    state._fsp--;


                    			current = this_FalseRule_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalDsl.g:175:3: this_CommandNameRule_2= ruleCommandNameRule
                    {

                    			newCompositeNode(grammarAccess.getPolicyRuleAccess().getCommandNameRuleParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_CommandNameRule_2=ruleCommandNameRule();

                    state._fsp--;


                    			current = this_CommandNameRule_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalDsl.g:184:3: this_ShapeTypeRule_3= ruleShapeTypeRule
                    {

                    			newCompositeNode(grammarAccess.getPolicyRuleAccess().getShapeTypeRuleParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_ShapeTypeRule_3=ruleShapeTypeRule();

                    state._fsp--;


                    			current = this_ShapeTypeRule_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalDsl.g:193:3: this_ParentTypeRule_4= ruleParentTypeRule
                    {

                    			newCompositeNode(grammarAccess.getPolicyRuleAccess().getParentTypeRuleParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_ParentTypeRule_4=ruleParentTypeRule();

                    state._fsp--;


                    			current = this_ParentTypeRule_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalDsl.g:202:3: this_StepInRule_5= ruleStepInRule
                    {

                    			newCompositeNode(grammarAccess.getPolicyRuleAccess().getStepInRuleParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_StepInRule_5=ruleStepInRule();

                    state._fsp--;


                    			current = this_StepInRule_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalDsl.g:211:3: this_SourceTypeRule_6= ruleSourceTypeRule
                    {

                    			newCompositeNode(grammarAccess.getPolicyRuleAccess().getSourceTypeRuleParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_SourceTypeRule_6=ruleSourceTypeRule();

                    state._fsp--;


                    			current = this_SourceTypeRule_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 8 :
                    // InternalDsl.g:220:3: this_TargetTypeRule_7= ruleTargetTypeRule
                    {

                    			newCompositeNode(grammarAccess.getPolicyRuleAccess().getTargetTypeRuleParserRuleCall_7());
                    		
                    pushFollow(FOLLOW_2);
                    this_TargetTypeRule_7=ruleTargetTypeRule();

                    state._fsp--;


                    			current = this_TargetTypeRule_7;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 9 :
                    // InternalDsl.g:229:3: this_RelationIsCyclicRule_8= ruleRelationIsCyclicRule
                    {

                    			newCompositeNode(grammarAccess.getPolicyRuleAccess().getRelationIsCyclicRuleParserRuleCall_8());
                    		
                    pushFollow(FOLLOW_2);
                    this_RelationIsCyclicRule_8=ruleRelationIsCyclicRule();

                    state._fsp--;


                    			current = this_RelationIsCyclicRule_8;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 10 :
                    // InternalDsl.g:238:3: this_RelationIsReflexivRule_9= ruleRelationIsReflexivRule
                    {

                    			newCompositeNode(grammarAccess.getPolicyRuleAccess().getRelationIsReflexivRuleParserRuleCall_9());
                    		
                    pushFollow(FOLLOW_2);
                    this_RelationIsReflexivRule_9=ruleRelationIsReflexivRule();

                    state._fsp--;


                    			current = this_RelationIsReflexivRule_9;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 11 :
                    // InternalDsl.g:247:3: this_RelationTypesAreEqualRule_10= ruleRelationTypesAreEqualRule
                    {

                    			newCompositeNode(grammarAccess.getPolicyRuleAccess().getRelationTypesAreEqualRuleParserRuleCall_10());
                    		
                    pushFollow(FOLLOW_2);
                    this_RelationTypesAreEqualRule_10=ruleRelationTypesAreEqualRule();

                    state._fsp--;


                    			current = this_RelationTypesAreEqualRule_10;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 12 :
                    // InternalDsl.g:256:3: this_TypeExistsRule_11= ruleTypeExistsRule
                    {

                    			newCompositeNode(grammarAccess.getPolicyRuleAccess().getTypeExistsRuleParserRuleCall_11());
                    		
                    pushFollow(FOLLOW_2);
                    this_TypeExistsRule_11=ruleTypeExistsRule();

                    state._fsp--;


                    			current = this_TypeExistsRule_11;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 13 :
                    // InternalDsl.g:265:3: this_ShapeNameRule_12= ruleShapeNameRule
                    {

                    			newCompositeNode(grammarAccess.getPolicyRuleAccess().getShapeNameRuleParserRuleCall_12());
                    		
                    pushFollow(FOLLOW_2);
                    this_ShapeNameRule_12=ruleShapeNameRule();

                    state._fsp--;


                    			current = this_ShapeNameRule_12;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 14 :
                    // InternalDsl.g:274:3: this_RelationTypeRule_13= ruleRelationTypeRule
                    {

                    			newCompositeNode(grammarAccess.getPolicyRuleAccess().getRelationTypeRuleParserRuleCall_13());
                    		
                    pushFollow(FOLLOW_2);
                    this_RelationTypeRule_13=ruleRelationTypeRule();

                    state._fsp--;


                    			current = this_RelationTypeRule_13;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePolicyRule"


    // $ANTLR start "entryRuleMappingRule"
    // InternalDsl.g:286:1: entryRuleMappingRule returns [EObject current=null] : iv_ruleMappingRule= ruleMappingRule EOF ;
    public final EObject entryRuleMappingRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMappingRule = null;


        try {
            // InternalDsl.g:286:52: (iv_ruleMappingRule= ruleMappingRule EOF )
            // InternalDsl.g:287:2: iv_ruleMappingRule= ruleMappingRule EOF
            {
             newCompositeNode(grammarAccess.getMappingRuleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMappingRule=ruleMappingRule();

            state._fsp--;

             current =iv_ruleMappingRule; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMappingRule"


    // $ANTLR start "ruleMappingRule"
    // InternalDsl.g:293:1: ruleMappingRule returns [EObject current=null] : (this_FeatureNameMappingRule_0= ruleFeatureNameMappingRule | this_TrueMappingRule_1= ruleTrueMappingRule ) ;
    public final EObject ruleMappingRule() throws RecognitionException {
        EObject current = null;

        EObject this_FeatureNameMappingRule_0 = null;

        EObject this_TrueMappingRule_1 = null;



        	enterRule();

        try {
            // InternalDsl.g:299:2: ( (this_FeatureNameMappingRule_0= ruleFeatureNameMappingRule | this_TrueMappingRule_1= ruleTrueMappingRule ) )
            // InternalDsl.g:300:2: (this_FeatureNameMappingRule_0= ruleFeatureNameMappingRule | this_TrueMappingRule_1= ruleTrueMappingRule )
            {
            // InternalDsl.g:300:2: (this_FeatureNameMappingRule_0= ruleFeatureNameMappingRule | this_TrueMappingRule_1= ruleTrueMappingRule )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( ((LA4_0>=RULE_ID && LA4_0<=RULE_STRING)) ) {
                alt4=1;
            }
            else if ( (LA4_0==12) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalDsl.g:301:3: this_FeatureNameMappingRule_0= ruleFeatureNameMappingRule
                    {

                    			newCompositeNode(grammarAccess.getMappingRuleAccess().getFeatureNameMappingRuleParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_FeatureNameMappingRule_0=ruleFeatureNameMappingRule();

                    state._fsp--;


                    			current = this_FeatureNameMappingRule_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalDsl.g:310:3: this_TrueMappingRule_1= ruleTrueMappingRule
                    {

                    			newCompositeNode(grammarAccess.getMappingRuleAccess().getTrueMappingRuleParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_TrueMappingRule_1=ruleTrueMappingRule();

                    state._fsp--;


                    			current = this_TrueMappingRule_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMappingRule"


    // $ANTLR start "entryRuleConfiguration"
    // InternalDsl.g:322:1: entryRuleConfiguration returns [EObject current=null] : iv_ruleConfiguration= ruleConfiguration EOF ;
    public final EObject entryRuleConfiguration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConfiguration = null;


        try {
            // InternalDsl.g:322:54: (iv_ruleConfiguration= ruleConfiguration EOF )
            // InternalDsl.g:323:2: iv_ruleConfiguration= ruleConfiguration EOF
            {
             newCompositeNode(grammarAccess.getConfigurationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConfiguration=ruleConfiguration();

            state._fsp--;

             current =iv_ruleConfiguration; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConfiguration"


    // $ANTLR start "ruleConfiguration"
    // InternalDsl.g:329:1: ruleConfiguration returns [EObject current=null] : ( () ( ( (lv_mappings_1_0= ruleMapping ) ) ( (lv_mappings_2_0= ruleMapping ) )* )? ) ;
    public final EObject ruleConfiguration() throws RecognitionException {
        EObject current = null;

        EObject lv_mappings_1_0 = null;

        EObject lv_mappings_2_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:335:2: ( ( () ( ( (lv_mappings_1_0= ruleMapping ) ) ( (lv_mappings_2_0= ruleMapping ) )* )? ) )
            // InternalDsl.g:336:2: ( () ( ( (lv_mappings_1_0= ruleMapping ) ) ( (lv_mappings_2_0= ruleMapping ) )* )? )
            {
            // InternalDsl.g:336:2: ( () ( ( (lv_mappings_1_0= ruleMapping ) ) ( (lv_mappings_2_0= ruleMapping ) )* )? )
            // InternalDsl.g:337:3: () ( ( (lv_mappings_1_0= ruleMapping ) ) ( (lv_mappings_2_0= ruleMapping ) )* )?
            {
            // InternalDsl.g:337:3: ()
            // InternalDsl.g:338:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getConfigurationAccess().getConfigurationAction_0(),
            					current);
            			

            }

            // InternalDsl.g:344:3: ( ( (lv_mappings_1_0= ruleMapping ) ) ( (lv_mappings_2_0= ruleMapping ) )* )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_STRING||LA6_0==12||(LA6_0>=29 && LA6_0<=30)) ) {
                alt6=1;
            }
            else if ( (LA6_0==RULE_ID) ) {
                int LA6_2 = input.LA(2);

                if ( ((LA6_2>=26 && LA6_2<=28)) ) {
                    alt6=1;
                }
                else if ( (LA6_2==11) ) {
                    int LA6_4 = input.LA(3);

                    if ( (LA6_4==RULE_ID) ) {
                        alt6=1;
                    }
                }
            }
            switch (alt6) {
                case 1 :
                    // InternalDsl.g:345:4: ( (lv_mappings_1_0= ruleMapping ) ) ( (lv_mappings_2_0= ruleMapping ) )*
                    {
                    // InternalDsl.g:345:4: ( (lv_mappings_1_0= ruleMapping ) )
                    // InternalDsl.g:346:5: (lv_mappings_1_0= ruleMapping )
                    {
                    // InternalDsl.g:346:5: (lv_mappings_1_0= ruleMapping )
                    // InternalDsl.g:347:6: lv_mappings_1_0= ruleMapping
                    {

                    						newCompositeNode(grammarAccess.getConfigurationAccess().getMappingsMappingParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_4);
                    lv_mappings_1_0=ruleMapping();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getConfigurationRule());
                    						}
                    						add(
                    							current,
                    							"mappings",
                    							lv_mappings_1_0,
                    							"org.framed.orm.editPolicy.model.dsl.Dsl.Mapping");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDsl.g:364:4: ( (lv_mappings_2_0= ruleMapping ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==RULE_ID) ) {
                            int LA5_1 = input.LA(2);

                            if ( ((LA5_1>=26 && LA5_1<=28)) ) {
                                alt5=1;
                            }
                            else if ( (LA5_1==11) ) {
                                int LA5_4 = input.LA(3);

                                if ( (LA5_4==RULE_ID) ) {
                                    alt5=1;
                                }


                            }


                        }
                        else if ( (LA5_0==RULE_STRING||LA5_0==12||(LA5_0>=29 && LA5_0<=30)) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalDsl.g:365:5: (lv_mappings_2_0= ruleMapping )
                    	    {
                    	    // InternalDsl.g:365:5: (lv_mappings_2_0= ruleMapping )
                    	    // InternalDsl.g:366:6: lv_mappings_2_0= ruleMapping
                    	    {

                    	    						newCompositeNode(grammarAccess.getConfigurationAccess().getMappingsMappingParserRuleCall_1_1_0());
                    	    					
                    	    pushFollow(FOLLOW_4);
                    	    lv_mappings_2_0=ruleMapping();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getConfigurationRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"mappings",
                    	    							lv_mappings_2_0,
                    	    							"org.framed.orm.editPolicy.model.dsl.Dsl.Mapping");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConfiguration"


    // $ANTLR start "entryRulePolicy"
    // InternalDsl.g:388:1: entryRulePolicy returns [EObject current=null] : iv_rulePolicy= rulePolicy EOF ;
    public final EObject entryRulePolicy() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePolicy = null;


        try {
            // InternalDsl.g:388:47: (iv_rulePolicy= rulePolicy EOF )
            // InternalDsl.g:389:2: iv_rulePolicy= rulePolicy EOF
            {
             newCompositeNode(grammarAccess.getPolicyRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePolicy=rulePolicy();

            state._fsp--;

             current =iv_rulePolicy; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePolicy"


    // $ANTLR start "rulePolicy"
    // InternalDsl.g:395:1: rulePolicy returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_rule_2_0= rulePolicyExpression ) ) ) ;
    public final EObject rulePolicy() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_rule_2_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:401:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_rule_2_0= rulePolicyExpression ) ) ) )
            // InternalDsl.g:402:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_rule_2_0= rulePolicyExpression ) ) )
            {
            // InternalDsl.g:402:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_rule_2_0= rulePolicyExpression ) ) )
            // InternalDsl.g:403:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_rule_2_0= rulePolicyExpression ) )
            {
            // InternalDsl.g:403:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalDsl.g:404:4: (lv_name_0_0= RULE_ID )
            {
            // InternalDsl.g:404:4: (lv_name_0_0= RULE_ID )
            // InternalDsl.g:405:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_0_0, grammarAccess.getPolicyAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPolicyRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,11,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getPolicyAccess().getColonKeyword_1());
            		
            // InternalDsl.g:425:3: ( (lv_rule_2_0= rulePolicyExpression ) )
            // InternalDsl.g:426:4: (lv_rule_2_0= rulePolicyExpression )
            {
            // InternalDsl.g:426:4: (lv_rule_2_0= rulePolicyExpression )
            // InternalDsl.g:427:5: lv_rule_2_0= rulePolicyExpression
            {

            					newCompositeNode(grammarAccess.getPolicyAccess().getRulePolicyExpressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_rule_2_0=rulePolicyExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPolicyRule());
            					}
            					set(
            						current,
            						"rule",
            						lv_rule_2_0,
            						"org.framed.orm.editPolicy.model.dsl.Dsl.PolicyExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePolicy"


    // $ANTLR start "entryRuleMapping"
    // InternalDsl.g:448:1: entryRuleMapping returns [EObject current=null] : iv_ruleMapping= ruleMapping EOF ;
    public final EObject entryRuleMapping() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMapping = null;


        try {
            // InternalDsl.g:448:48: (iv_ruleMapping= ruleMapping EOF )
            // InternalDsl.g:449:2: iv_ruleMapping= ruleMapping EOF
            {
             newCompositeNode(grammarAccess.getMappingRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMapping=ruleMapping();

            state._fsp--;

             current =iv_ruleMapping; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMapping"


    // $ANTLR start "ruleMapping"
    // InternalDsl.g:455:1: ruleMapping returns [EObject current=null] : ( ( (lv_rule_0_0= ruleMappingExpression ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) ) ;
    public final EObject ruleMapping() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_rule_0_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:461:2: ( ( ( (lv_rule_0_0= ruleMappingExpression ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) ) )
            // InternalDsl.g:462:2: ( ( (lv_rule_0_0= ruleMappingExpression ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) )
            {
            // InternalDsl.g:462:2: ( ( (lv_rule_0_0= ruleMappingExpression ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) )
            // InternalDsl.g:463:3: ( (lv_rule_0_0= ruleMappingExpression ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) )
            {
            // InternalDsl.g:463:3: ( (lv_rule_0_0= ruleMappingExpression ) )
            // InternalDsl.g:464:4: (lv_rule_0_0= ruleMappingExpression )
            {
            // InternalDsl.g:464:4: (lv_rule_0_0= ruleMappingExpression )
            // InternalDsl.g:465:5: lv_rule_0_0= ruleMappingExpression
            {

            					newCompositeNode(grammarAccess.getMappingAccess().getRuleMappingExpressionParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_5);
            lv_rule_0_0=ruleMappingExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMappingRule());
            					}
            					set(
            						current,
            						"rule",
            						lv_rule_0_0,
            						"org.framed.orm.editPolicy.model.dsl.Dsl.MappingExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,11,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getMappingAccess().getColonKeyword_1());
            		
            // InternalDsl.g:486:3: ( (otherlv_2= RULE_ID ) )
            // InternalDsl.g:487:4: (otherlv_2= RULE_ID )
            {
            // InternalDsl.g:487:4: (otherlv_2= RULE_ID )
            // InternalDsl.g:488:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMappingRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_2, grammarAccess.getMappingAccess().getPolicyPolicyCrossReference_2_0());
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMapping"


    // $ANTLR start "entryRuleFeatureNameMappingRule"
    // InternalDsl.g:503:1: entryRuleFeatureNameMappingRule returns [EObject current=null] : iv_ruleFeatureNameMappingRule= ruleFeatureNameMappingRule EOF ;
    public final EObject entryRuleFeatureNameMappingRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeatureNameMappingRule = null;


        try {
            // InternalDsl.g:503:63: (iv_ruleFeatureNameMappingRule= ruleFeatureNameMappingRule EOF )
            // InternalDsl.g:504:2: iv_ruleFeatureNameMappingRule= ruleFeatureNameMappingRule EOF
            {
             newCompositeNode(grammarAccess.getFeatureNameMappingRuleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFeatureNameMappingRule=ruleFeatureNameMappingRule();

            state._fsp--;

             current =iv_ruleFeatureNameMappingRule; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFeatureNameMappingRule"


    // $ANTLR start "ruleFeatureNameMappingRule"
    // InternalDsl.g:510:1: ruleFeatureNameMappingRule returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) ) ;
    public final EObject ruleFeatureNameMappingRule() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:516:2: ( ( () ( (lv_name_1_0= ruleEString ) ) ) )
            // InternalDsl.g:517:2: ( () ( (lv_name_1_0= ruleEString ) ) )
            {
            // InternalDsl.g:517:2: ( () ( (lv_name_1_0= ruleEString ) ) )
            // InternalDsl.g:518:3: () ( (lv_name_1_0= ruleEString ) )
            {
            // InternalDsl.g:518:3: ()
            // InternalDsl.g:519:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getFeatureNameMappingRuleAccess().getFeatureNameMappingRuleAction_0(),
            					current);
            			

            }

            // InternalDsl.g:525:3: ( (lv_name_1_0= ruleEString ) )
            // InternalDsl.g:526:4: (lv_name_1_0= ruleEString )
            {
            // InternalDsl.g:526:4: (lv_name_1_0= ruleEString )
            // InternalDsl.g:527:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getFeatureNameMappingRuleAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFeatureNameMappingRuleRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.framed.orm.editPolicy.model.dsl.Dsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFeatureNameMappingRule"


    // $ANTLR start "entryRuleTrueMappingRule"
    // InternalDsl.g:548:1: entryRuleTrueMappingRule returns [EObject current=null] : iv_ruleTrueMappingRule= ruleTrueMappingRule EOF ;
    public final EObject entryRuleTrueMappingRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTrueMappingRule = null;


        try {
            // InternalDsl.g:548:56: (iv_ruleTrueMappingRule= ruleTrueMappingRule EOF )
            // InternalDsl.g:549:2: iv_ruleTrueMappingRule= ruleTrueMappingRule EOF
            {
             newCompositeNode(grammarAccess.getTrueMappingRuleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTrueMappingRule=ruleTrueMappingRule();

            state._fsp--;

             current =iv_ruleTrueMappingRule; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTrueMappingRule"


    // $ANTLR start "ruleTrueMappingRule"
    // InternalDsl.g:555:1: ruleTrueMappingRule returns [EObject current=null] : ( () otherlv_1= 'true' ) ;
    public final EObject ruleTrueMappingRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalDsl.g:561:2: ( ( () otherlv_1= 'true' ) )
            // InternalDsl.g:562:2: ( () otherlv_1= 'true' )
            {
            // InternalDsl.g:562:2: ( () otherlv_1= 'true' )
            // InternalDsl.g:563:3: () otherlv_1= 'true'
            {
            // InternalDsl.g:563:3: ()
            // InternalDsl.g:564:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTrueMappingRuleAccess().getTrueMappingRuleAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,12,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getTrueMappingRuleAccess().getTrueKeyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTrueMappingRule"


    // $ANTLR start "entryRuleRelationIsCyclicRule"
    // InternalDsl.g:578:1: entryRuleRelationIsCyclicRule returns [EObject current=null] : iv_ruleRelationIsCyclicRule= ruleRelationIsCyclicRule EOF ;
    public final EObject entryRuleRelationIsCyclicRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelationIsCyclicRule = null;


        try {
            // InternalDsl.g:578:61: (iv_ruleRelationIsCyclicRule= ruleRelationIsCyclicRule EOF )
            // InternalDsl.g:579:2: iv_ruleRelationIsCyclicRule= ruleRelationIsCyclicRule EOF
            {
             newCompositeNode(grammarAccess.getRelationIsCyclicRuleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRelationIsCyclicRule=ruleRelationIsCyclicRule();

            state._fsp--;

             current =iv_ruleRelationIsCyclicRule; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRelationIsCyclicRule"


    // $ANTLR start "ruleRelationIsCyclicRule"
    // InternalDsl.g:585:1: ruleRelationIsCyclicRule returns [EObject current=null] : ( () otherlv_1= 'RelationIsCyclic' ) ;
    public final EObject ruleRelationIsCyclicRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalDsl.g:591:2: ( ( () otherlv_1= 'RelationIsCyclic' ) )
            // InternalDsl.g:592:2: ( () otherlv_1= 'RelationIsCyclic' )
            {
            // InternalDsl.g:592:2: ( () otherlv_1= 'RelationIsCyclic' )
            // InternalDsl.g:593:3: () otherlv_1= 'RelationIsCyclic'
            {
            // InternalDsl.g:593:3: ()
            // InternalDsl.g:594:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRelationIsCyclicRuleAccess().getRelationIsCyclicRuleAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getRelationIsCyclicRuleAccess().getRelationIsCyclicKeyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRelationIsCyclicRule"


    // $ANTLR start "entryRuleRelationTypesAreEqualRule"
    // InternalDsl.g:608:1: entryRuleRelationTypesAreEqualRule returns [EObject current=null] : iv_ruleRelationTypesAreEqualRule= ruleRelationTypesAreEqualRule EOF ;
    public final EObject entryRuleRelationTypesAreEqualRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelationTypesAreEqualRule = null;


        try {
            // InternalDsl.g:608:66: (iv_ruleRelationTypesAreEqualRule= ruleRelationTypesAreEqualRule EOF )
            // InternalDsl.g:609:2: iv_ruleRelationTypesAreEqualRule= ruleRelationTypesAreEqualRule EOF
            {
             newCompositeNode(grammarAccess.getRelationTypesAreEqualRuleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRelationTypesAreEqualRule=ruleRelationTypesAreEqualRule();

            state._fsp--;

             current =iv_ruleRelationTypesAreEqualRule; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRelationTypesAreEqualRule"


    // $ANTLR start "ruleRelationTypesAreEqualRule"
    // InternalDsl.g:615:1: ruleRelationTypesAreEqualRule returns [EObject current=null] : ( () otherlv_1= 'RelationTypesAreEqual' ) ;
    public final EObject ruleRelationTypesAreEqualRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalDsl.g:621:2: ( ( () otherlv_1= 'RelationTypesAreEqual' ) )
            // InternalDsl.g:622:2: ( () otherlv_1= 'RelationTypesAreEqual' )
            {
            // InternalDsl.g:622:2: ( () otherlv_1= 'RelationTypesAreEqual' )
            // InternalDsl.g:623:3: () otherlv_1= 'RelationTypesAreEqual'
            {
            // InternalDsl.g:623:3: ()
            // InternalDsl.g:624:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRelationTypesAreEqualRuleAccess().getRelationTypesAreEqualRuleAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getRelationTypesAreEqualRuleAccess().getRelationTypesAreEqualKeyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRelationTypesAreEqualRule"


    // $ANTLR start "entryRuleRelationIsReflexivRule"
    // InternalDsl.g:638:1: entryRuleRelationIsReflexivRule returns [EObject current=null] : iv_ruleRelationIsReflexivRule= ruleRelationIsReflexivRule EOF ;
    public final EObject entryRuleRelationIsReflexivRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelationIsReflexivRule = null;


        try {
            // InternalDsl.g:638:63: (iv_ruleRelationIsReflexivRule= ruleRelationIsReflexivRule EOF )
            // InternalDsl.g:639:2: iv_ruleRelationIsReflexivRule= ruleRelationIsReflexivRule EOF
            {
             newCompositeNode(grammarAccess.getRelationIsReflexivRuleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRelationIsReflexivRule=ruleRelationIsReflexivRule();

            state._fsp--;

             current =iv_ruleRelationIsReflexivRule; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRelationIsReflexivRule"


    // $ANTLR start "ruleRelationIsReflexivRule"
    // InternalDsl.g:645:1: ruleRelationIsReflexivRule returns [EObject current=null] : ( () otherlv_1= 'RelationIsReflexiv' ) ;
    public final EObject ruleRelationIsReflexivRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalDsl.g:651:2: ( ( () otherlv_1= 'RelationIsReflexiv' ) )
            // InternalDsl.g:652:2: ( () otherlv_1= 'RelationIsReflexiv' )
            {
            // InternalDsl.g:652:2: ( () otherlv_1= 'RelationIsReflexiv' )
            // InternalDsl.g:653:3: () otherlv_1= 'RelationIsReflexiv'
            {
            // InternalDsl.g:653:3: ()
            // InternalDsl.g:654:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRelationIsReflexivRuleAccess().getRelationIsReflexivRuleAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getRelationIsReflexivRuleAccess().getRelationIsReflexivKeyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRelationIsReflexivRule"


    // $ANTLR start "entryRuleEString"
    // InternalDsl.g:668:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalDsl.g:668:47: (iv_ruleEString= ruleEString EOF )
            // InternalDsl.g:669:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalDsl.g:675:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalDsl.g:681:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalDsl.g:682:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalDsl.g:682:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_STRING) ) {
                alt7=1;
            }
            else if ( (LA7_0==RULE_ID) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalDsl.g:683:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalDsl.g:691:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleRelationTypeRule"
    // InternalDsl.g:702:1: entryRuleRelationTypeRule returns [EObject current=null] : iv_ruleRelationTypeRule= ruleRelationTypeRule EOF ;
    public final EObject entryRuleRelationTypeRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelationTypeRule = null;


        try {
            // InternalDsl.g:702:57: (iv_ruleRelationTypeRule= ruleRelationTypeRule EOF )
            // InternalDsl.g:703:2: iv_ruleRelationTypeRule= ruleRelationTypeRule EOF
            {
             newCompositeNode(grammarAccess.getRelationTypeRuleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRelationTypeRule=ruleRelationTypeRule();

            state._fsp--;

             current =iv_ruleRelationTypeRule; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRelationTypeRule"


    // $ANTLR start "ruleRelationTypeRule"
    // InternalDsl.g:709:1: ruleRelationTypeRule returns [EObject current=null] : ( () otherlv_1= 'RelationType' ( (lv_name_2_0= ruleEString ) ) ) ;
    public final EObject ruleRelationTypeRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:715:2: ( ( () otherlv_1= 'RelationType' ( (lv_name_2_0= ruleEString ) ) ) )
            // InternalDsl.g:716:2: ( () otherlv_1= 'RelationType' ( (lv_name_2_0= ruleEString ) ) )
            {
            // InternalDsl.g:716:2: ( () otherlv_1= 'RelationType' ( (lv_name_2_0= ruleEString ) ) )
            // InternalDsl.g:717:3: () otherlv_1= 'RelationType' ( (lv_name_2_0= ruleEString ) )
            {
            // InternalDsl.g:717:3: ()
            // InternalDsl.g:718:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRelationTypeRuleAccess().getRelationTypeRuleAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,16,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getRelationTypeRuleAccess().getRelationTypeKeyword_1());
            		
            // InternalDsl.g:728:3: ( (lv_name_2_0= ruleEString ) )
            // InternalDsl.g:729:4: (lv_name_2_0= ruleEString )
            {
            // InternalDsl.g:729:4: (lv_name_2_0= ruleEString )
            // InternalDsl.g:730:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getRelationTypeRuleAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRelationTypeRuleRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.framed.orm.editPolicy.model.dsl.Dsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRelationTypeRule"


    // $ANTLR start "entryRuleTypeExistsRule"
    // InternalDsl.g:751:1: entryRuleTypeExistsRule returns [EObject current=null] : iv_ruleTypeExistsRule= ruleTypeExistsRule EOF ;
    public final EObject entryRuleTypeExistsRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeExistsRule = null;


        try {
            // InternalDsl.g:751:55: (iv_ruleTypeExistsRule= ruleTypeExistsRule EOF )
            // InternalDsl.g:752:2: iv_ruleTypeExistsRule= ruleTypeExistsRule EOF
            {
             newCompositeNode(grammarAccess.getTypeExistsRuleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTypeExistsRule=ruleTypeExistsRule();

            state._fsp--;

             current =iv_ruleTypeExistsRule; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTypeExistsRule"


    // $ANTLR start "ruleTypeExistsRule"
    // InternalDsl.g:758:1: ruleTypeExistsRule returns [EObject current=null] : ( () otherlv_1= 'TypeExists' ( (lv_name_2_0= ruleEString ) ) ) ;
    public final EObject ruleTypeExistsRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:764:2: ( ( () otherlv_1= 'TypeExists' ( (lv_name_2_0= ruleEString ) ) ) )
            // InternalDsl.g:765:2: ( () otherlv_1= 'TypeExists' ( (lv_name_2_0= ruleEString ) ) )
            {
            // InternalDsl.g:765:2: ( () otherlv_1= 'TypeExists' ( (lv_name_2_0= ruleEString ) ) )
            // InternalDsl.g:766:3: () otherlv_1= 'TypeExists' ( (lv_name_2_0= ruleEString ) )
            {
            // InternalDsl.g:766:3: ()
            // InternalDsl.g:767:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTypeExistsRuleAccess().getTypeExistsRuleAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,17,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getTypeExistsRuleAccess().getTypeExistsKeyword_1());
            		
            // InternalDsl.g:777:3: ( (lv_name_2_0= ruleEString ) )
            // InternalDsl.g:778:4: (lv_name_2_0= ruleEString )
            {
            // InternalDsl.g:778:4: (lv_name_2_0= ruleEString )
            // InternalDsl.g:779:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getTypeExistsRuleAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTypeExistsRuleRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.framed.orm.editPolicy.model.dsl.Dsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTypeExistsRule"


    // $ANTLR start "entryRuleSourceTypeRule"
    // InternalDsl.g:800:1: entryRuleSourceTypeRule returns [EObject current=null] : iv_ruleSourceTypeRule= ruleSourceTypeRule EOF ;
    public final EObject entryRuleSourceTypeRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSourceTypeRule = null;


        try {
            // InternalDsl.g:800:55: (iv_ruleSourceTypeRule= ruleSourceTypeRule EOF )
            // InternalDsl.g:801:2: iv_ruleSourceTypeRule= ruleSourceTypeRule EOF
            {
             newCompositeNode(grammarAccess.getSourceTypeRuleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSourceTypeRule=ruleSourceTypeRule();

            state._fsp--;

             current =iv_ruleSourceTypeRule; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSourceTypeRule"


    // $ANTLR start "ruleSourceTypeRule"
    // InternalDsl.g:807:1: ruleSourceTypeRule returns [EObject current=null] : ( () otherlv_1= 'SourceType' ( (lv_name_2_0= ruleEString ) ) ) ;
    public final EObject ruleSourceTypeRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:813:2: ( ( () otherlv_1= 'SourceType' ( (lv_name_2_0= ruleEString ) ) ) )
            // InternalDsl.g:814:2: ( () otherlv_1= 'SourceType' ( (lv_name_2_0= ruleEString ) ) )
            {
            // InternalDsl.g:814:2: ( () otherlv_1= 'SourceType' ( (lv_name_2_0= ruleEString ) ) )
            // InternalDsl.g:815:3: () otherlv_1= 'SourceType' ( (lv_name_2_0= ruleEString ) )
            {
            // InternalDsl.g:815:3: ()
            // InternalDsl.g:816:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSourceTypeRuleAccess().getSourceTypeRuleAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,18,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getSourceTypeRuleAccess().getSourceTypeKeyword_1());
            		
            // InternalDsl.g:826:3: ( (lv_name_2_0= ruleEString ) )
            // InternalDsl.g:827:4: (lv_name_2_0= ruleEString )
            {
            // InternalDsl.g:827:4: (lv_name_2_0= ruleEString )
            // InternalDsl.g:828:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getSourceTypeRuleAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSourceTypeRuleRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.framed.orm.editPolicy.model.dsl.Dsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSourceTypeRule"


    // $ANTLR start "entryRuleTargetTypeRule"
    // InternalDsl.g:849:1: entryRuleTargetTypeRule returns [EObject current=null] : iv_ruleTargetTypeRule= ruleTargetTypeRule EOF ;
    public final EObject entryRuleTargetTypeRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTargetTypeRule = null;


        try {
            // InternalDsl.g:849:55: (iv_ruleTargetTypeRule= ruleTargetTypeRule EOF )
            // InternalDsl.g:850:2: iv_ruleTargetTypeRule= ruleTargetTypeRule EOF
            {
             newCompositeNode(grammarAccess.getTargetTypeRuleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTargetTypeRule=ruleTargetTypeRule();

            state._fsp--;

             current =iv_ruleTargetTypeRule; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTargetTypeRule"


    // $ANTLR start "ruleTargetTypeRule"
    // InternalDsl.g:856:1: ruleTargetTypeRule returns [EObject current=null] : ( () otherlv_1= 'TargetType' ( (lv_name_2_0= ruleEString ) ) ) ;
    public final EObject ruleTargetTypeRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:862:2: ( ( () otherlv_1= 'TargetType' ( (lv_name_2_0= ruleEString ) ) ) )
            // InternalDsl.g:863:2: ( () otherlv_1= 'TargetType' ( (lv_name_2_0= ruleEString ) ) )
            {
            // InternalDsl.g:863:2: ( () otherlv_1= 'TargetType' ( (lv_name_2_0= ruleEString ) ) )
            // InternalDsl.g:864:3: () otherlv_1= 'TargetType' ( (lv_name_2_0= ruleEString ) )
            {
            // InternalDsl.g:864:3: ()
            // InternalDsl.g:865:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTargetTypeRuleAccess().getTargetTypeRuleAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,19,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getTargetTypeRuleAccess().getTargetTypeKeyword_1());
            		
            // InternalDsl.g:875:3: ( (lv_name_2_0= ruleEString ) )
            // InternalDsl.g:876:4: (lv_name_2_0= ruleEString )
            {
            // InternalDsl.g:876:4: (lv_name_2_0= ruleEString )
            // InternalDsl.g:877:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getTargetTypeRuleAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTargetTypeRuleRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.framed.orm.editPolicy.model.dsl.Dsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTargetTypeRule"


    // $ANTLR start "entryRuleCommandNameRule"
    // InternalDsl.g:898:1: entryRuleCommandNameRule returns [EObject current=null] : iv_ruleCommandNameRule= ruleCommandNameRule EOF ;
    public final EObject entryRuleCommandNameRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommandNameRule = null;


        try {
            // InternalDsl.g:898:56: (iv_ruleCommandNameRule= ruleCommandNameRule EOF )
            // InternalDsl.g:899:2: iv_ruleCommandNameRule= ruleCommandNameRule EOF
            {
             newCompositeNode(grammarAccess.getCommandNameRuleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCommandNameRule=ruleCommandNameRule();

            state._fsp--;

             current =iv_ruleCommandNameRule; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCommandNameRule"


    // $ANTLR start "ruleCommandNameRule"
    // InternalDsl.g:905:1: ruleCommandNameRule returns [EObject current=null] : ( () otherlv_1= 'CommandName' ( (lv_name_2_0= ruleEString ) ) ) ;
    public final EObject ruleCommandNameRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:911:2: ( ( () otherlv_1= 'CommandName' ( (lv_name_2_0= ruleEString ) ) ) )
            // InternalDsl.g:912:2: ( () otherlv_1= 'CommandName' ( (lv_name_2_0= ruleEString ) ) )
            {
            // InternalDsl.g:912:2: ( () otherlv_1= 'CommandName' ( (lv_name_2_0= ruleEString ) ) )
            // InternalDsl.g:913:3: () otherlv_1= 'CommandName' ( (lv_name_2_0= ruleEString ) )
            {
            // InternalDsl.g:913:3: ()
            // InternalDsl.g:914:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCommandNameRuleAccess().getCommandNameRuleAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,20,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getCommandNameRuleAccess().getCommandNameKeyword_1());
            		
            // InternalDsl.g:924:3: ( (lv_name_2_0= ruleEString ) )
            // InternalDsl.g:925:4: (lv_name_2_0= ruleEString )
            {
            // InternalDsl.g:925:4: (lv_name_2_0= ruleEString )
            // InternalDsl.g:926:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getCommandNameRuleAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCommandNameRuleRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.framed.orm.editPolicy.model.dsl.Dsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCommandNameRule"


    // $ANTLR start "entryRuleShapeTypeRule"
    // InternalDsl.g:947:1: entryRuleShapeTypeRule returns [EObject current=null] : iv_ruleShapeTypeRule= ruleShapeTypeRule EOF ;
    public final EObject entryRuleShapeTypeRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleShapeTypeRule = null;


        try {
            // InternalDsl.g:947:54: (iv_ruleShapeTypeRule= ruleShapeTypeRule EOF )
            // InternalDsl.g:948:2: iv_ruleShapeTypeRule= ruleShapeTypeRule EOF
            {
             newCompositeNode(grammarAccess.getShapeTypeRuleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleShapeTypeRule=ruleShapeTypeRule();

            state._fsp--;

             current =iv_ruleShapeTypeRule; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleShapeTypeRule"


    // $ANTLR start "ruleShapeTypeRule"
    // InternalDsl.g:954:1: ruleShapeTypeRule returns [EObject current=null] : ( () otherlv_1= 'ShapeType' ( (lv_name_2_0= ruleEString ) ) ) ;
    public final EObject ruleShapeTypeRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:960:2: ( ( () otherlv_1= 'ShapeType' ( (lv_name_2_0= ruleEString ) ) ) )
            // InternalDsl.g:961:2: ( () otherlv_1= 'ShapeType' ( (lv_name_2_0= ruleEString ) ) )
            {
            // InternalDsl.g:961:2: ( () otherlv_1= 'ShapeType' ( (lv_name_2_0= ruleEString ) ) )
            // InternalDsl.g:962:3: () otherlv_1= 'ShapeType' ( (lv_name_2_0= ruleEString ) )
            {
            // InternalDsl.g:962:3: ()
            // InternalDsl.g:963:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getShapeTypeRuleAccess().getShapeTypeRuleAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,21,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getShapeTypeRuleAccess().getShapeTypeKeyword_1());
            		
            // InternalDsl.g:973:3: ( (lv_name_2_0= ruleEString ) )
            // InternalDsl.g:974:4: (lv_name_2_0= ruleEString )
            {
            // InternalDsl.g:974:4: (lv_name_2_0= ruleEString )
            // InternalDsl.g:975:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getShapeTypeRuleAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getShapeTypeRuleRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.framed.orm.editPolicy.model.dsl.Dsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleShapeTypeRule"


    // $ANTLR start "entryRuleParentTypeRule"
    // InternalDsl.g:996:1: entryRuleParentTypeRule returns [EObject current=null] : iv_ruleParentTypeRule= ruleParentTypeRule EOF ;
    public final EObject entryRuleParentTypeRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParentTypeRule = null;


        try {
            // InternalDsl.g:996:55: (iv_ruleParentTypeRule= ruleParentTypeRule EOF )
            // InternalDsl.g:997:2: iv_ruleParentTypeRule= ruleParentTypeRule EOF
            {
             newCompositeNode(grammarAccess.getParentTypeRuleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParentTypeRule=ruleParentTypeRule();

            state._fsp--;

             current =iv_ruleParentTypeRule; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParentTypeRule"


    // $ANTLR start "ruleParentTypeRule"
    // InternalDsl.g:1003:1: ruleParentTypeRule returns [EObject current=null] : ( () otherlv_1= 'ParentType' ( (lv_name_2_0= ruleEString ) ) ) ;
    public final EObject ruleParentTypeRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:1009:2: ( ( () otherlv_1= 'ParentType' ( (lv_name_2_0= ruleEString ) ) ) )
            // InternalDsl.g:1010:2: ( () otherlv_1= 'ParentType' ( (lv_name_2_0= ruleEString ) ) )
            {
            // InternalDsl.g:1010:2: ( () otherlv_1= 'ParentType' ( (lv_name_2_0= ruleEString ) ) )
            // InternalDsl.g:1011:3: () otherlv_1= 'ParentType' ( (lv_name_2_0= ruleEString ) )
            {
            // InternalDsl.g:1011:3: ()
            // InternalDsl.g:1012:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getParentTypeRuleAccess().getParentTypeRuleAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,22,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getParentTypeRuleAccess().getParentTypeKeyword_1());
            		
            // InternalDsl.g:1022:3: ( (lv_name_2_0= ruleEString ) )
            // InternalDsl.g:1023:4: (lv_name_2_0= ruleEString )
            {
            // InternalDsl.g:1023:4: (lv_name_2_0= ruleEString )
            // InternalDsl.g:1024:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getParentTypeRuleAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParentTypeRuleRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.framed.orm.editPolicy.model.dsl.Dsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParentTypeRule"


    // $ANTLR start "entryRuleStepInRule"
    // InternalDsl.g:1045:1: entryRuleStepInRule returns [EObject current=null] : iv_ruleStepInRule= ruleStepInRule EOF ;
    public final EObject entryRuleStepInRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStepInRule = null;


        try {
            // InternalDsl.g:1045:51: (iv_ruleStepInRule= ruleStepInRule EOF )
            // InternalDsl.g:1046:2: iv_ruleStepInRule= ruleStepInRule EOF
            {
             newCompositeNode(grammarAccess.getStepInRuleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStepInRule=ruleStepInRule();

            state._fsp--;

             current =iv_ruleStepInRule; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStepInRule"


    // $ANTLR start "ruleStepInRule"
    // InternalDsl.g:1052:1: ruleStepInRule returns [EObject current=null] : ( () otherlv_1= 'StepIn' ) ;
    public final EObject ruleStepInRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalDsl.g:1058:2: ( ( () otherlv_1= 'StepIn' ) )
            // InternalDsl.g:1059:2: ( () otherlv_1= 'StepIn' )
            {
            // InternalDsl.g:1059:2: ( () otherlv_1= 'StepIn' )
            // InternalDsl.g:1060:3: () otherlv_1= 'StepIn'
            {
            // InternalDsl.g:1060:3: ()
            // InternalDsl.g:1061:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getStepInRuleAccess().getStepInRuleAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,23,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getStepInRuleAccess().getStepInKeyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStepInRule"


    // $ANTLR start "entryRuleTrueRule"
    // InternalDsl.g:1075:1: entryRuleTrueRule returns [EObject current=null] : iv_ruleTrueRule= ruleTrueRule EOF ;
    public final EObject entryRuleTrueRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTrueRule = null;


        try {
            // InternalDsl.g:1075:49: (iv_ruleTrueRule= ruleTrueRule EOF )
            // InternalDsl.g:1076:2: iv_ruleTrueRule= ruleTrueRule EOF
            {
             newCompositeNode(grammarAccess.getTrueRuleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTrueRule=ruleTrueRule();

            state._fsp--;

             current =iv_ruleTrueRule; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTrueRule"


    // $ANTLR start "ruleTrueRule"
    // InternalDsl.g:1082:1: ruleTrueRule returns [EObject current=null] : ( () otherlv_1= 'true' ) ;
    public final EObject ruleTrueRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalDsl.g:1088:2: ( ( () otherlv_1= 'true' ) )
            // InternalDsl.g:1089:2: ( () otherlv_1= 'true' )
            {
            // InternalDsl.g:1089:2: ( () otherlv_1= 'true' )
            // InternalDsl.g:1090:3: () otherlv_1= 'true'
            {
            // InternalDsl.g:1090:3: ()
            // InternalDsl.g:1091:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTrueRuleAccess().getTrueRuleAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,12,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getTrueRuleAccess().getTrueKeyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTrueRule"


    // $ANTLR start "entryRuleFalseRule"
    // InternalDsl.g:1105:1: entryRuleFalseRule returns [EObject current=null] : iv_ruleFalseRule= ruleFalseRule EOF ;
    public final EObject entryRuleFalseRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFalseRule = null;


        try {
            // InternalDsl.g:1105:50: (iv_ruleFalseRule= ruleFalseRule EOF )
            // InternalDsl.g:1106:2: iv_ruleFalseRule= ruleFalseRule EOF
            {
             newCompositeNode(grammarAccess.getFalseRuleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFalseRule=ruleFalseRule();

            state._fsp--;

             current =iv_ruleFalseRule; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFalseRule"


    // $ANTLR start "ruleFalseRule"
    // InternalDsl.g:1112:1: ruleFalseRule returns [EObject current=null] : ( () otherlv_1= 'false' ) ;
    public final EObject ruleFalseRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalDsl.g:1118:2: ( ( () otherlv_1= 'false' ) )
            // InternalDsl.g:1119:2: ( () otherlv_1= 'false' )
            {
            // InternalDsl.g:1119:2: ( () otherlv_1= 'false' )
            // InternalDsl.g:1120:3: () otherlv_1= 'false'
            {
            // InternalDsl.g:1120:3: ()
            // InternalDsl.g:1121:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getFalseRuleAccess().getFalseRuleAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,24,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getFalseRuleAccess().getFalseKeyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFalseRule"


    // $ANTLR start "entryRuleShapeNameRule"
    // InternalDsl.g:1135:1: entryRuleShapeNameRule returns [EObject current=null] : iv_ruleShapeNameRule= ruleShapeNameRule EOF ;
    public final EObject entryRuleShapeNameRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleShapeNameRule = null;


        try {
            // InternalDsl.g:1135:54: (iv_ruleShapeNameRule= ruleShapeNameRule EOF )
            // InternalDsl.g:1136:2: iv_ruleShapeNameRule= ruleShapeNameRule EOF
            {
             newCompositeNode(grammarAccess.getShapeNameRuleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleShapeNameRule=ruleShapeNameRule();

            state._fsp--;

             current =iv_ruleShapeNameRule; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleShapeNameRule"


    // $ANTLR start "ruleShapeNameRule"
    // InternalDsl.g:1142:1: ruleShapeNameRule returns [EObject current=null] : ( () otherlv_1= 'ShapeName' ( (lv_name_2_0= ruleEString ) ) ) ;
    public final EObject ruleShapeNameRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:1148:2: ( ( () otherlv_1= 'ShapeName' ( (lv_name_2_0= ruleEString ) ) ) )
            // InternalDsl.g:1149:2: ( () otherlv_1= 'ShapeName' ( (lv_name_2_0= ruleEString ) ) )
            {
            // InternalDsl.g:1149:2: ( () otherlv_1= 'ShapeName' ( (lv_name_2_0= ruleEString ) ) )
            // InternalDsl.g:1150:3: () otherlv_1= 'ShapeName' ( (lv_name_2_0= ruleEString ) )
            {
            // InternalDsl.g:1150:3: ()
            // InternalDsl.g:1151:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getShapeNameRuleAccess().getShapeNameRuleAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,25,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getShapeNameRuleAccess().getShapeNameKeyword_1());
            		
            // InternalDsl.g:1161:3: ( (lv_name_2_0= ruleEString ) )
            // InternalDsl.g:1162:4: (lv_name_2_0= ruleEString )
            {
            // InternalDsl.g:1162:4: (lv_name_2_0= ruleEString )
            // InternalDsl.g:1163:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getShapeNameRuleAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getShapeNameRuleRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.framed.orm.editPolicy.model.dsl.Dsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleShapeNameRule"


    // $ANTLR start "entryRuleMappingExpression"
    // InternalDsl.g:1184:1: entryRuleMappingExpression returns [EObject current=null] : iv_ruleMappingExpression= ruleMappingExpression EOF ;
    public final EObject entryRuleMappingExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMappingExpression = null;


        try {
            // InternalDsl.g:1184:58: (iv_ruleMappingExpression= ruleMappingExpression EOF )
            // InternalDsl.g:1185:2: iv_ruleMappingExpression= ruleMappingExpression EOF
            {
             newCompositeNode(grammarAccess.getMappingExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMappingExpression=ruleMappingExpression();

            state._fsp--;

             current =iv_ruleMappingExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMappingExpression"


    // $ANTLR start "ruleMappingExpression"
    // InternalDsl.g:1191:1: ruleMappingExpression returns [EObject current=null] : this_ImplicationMapping_0= ruleImplicationMapping ;
    public final EObject ruleMappingExpression() throws RecognitionException {
        EObject current = null;

        EObject this_ImplicationMapping_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:1197:2: (this_ImplicationMapping_0= ruleImplicationMapping )
            // InternalDsl.g:1198:2: this_ImplicationMapping_0= ruleImplicationMapping
            {

            		newCompositeNode(grammarAccess.getMappingExpressionAccess().getImplicationMappingParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_ImplicationMapping_0=ruleImplicationMapping();

            state._fsp--;


            		current = this_ImplicationMapping_0;
            		afterParserOrEnumRuleCall();
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMappingExpression"


    // $ANTLR start "entryRuleImplicationMapping"
    // InternalDsl.g:1209:1: entryRuleImplicationMapping returns [EObject current=null] : iv_ruleImplicationMapping= ruleImplicationMapping EOF ;
    public final EObject entryRuleImplicationMapping() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImplicationMapping = null;


        try {
            // InternalDsl.g:1209:59: (iv_ruleImplicationMapping= ruleImplicationMapping EOF )
            // InternalDsl.g:1210:2: iv_ruleImplicationMapping= ruleImplicationMapping EOF
            {
             newCompositeNode(grammarAccess.getImplicationMappingRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleImplicationMapping=ruleImplicationMapping();

            state._fsp--;

             current =iv_ruleImplicationMapping; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleImplicationMapping"


    // $ANTLR start "ruleImplicationMapping"
    // InternalDsl.g:1216:1: ruleImplicationMapping returns [EObject current=null] : (this_OrMapping_0= ruleOrMapping ( () otherlv_2= '=>' ( (lv_consequent_3_0= ruleOrMapping ) ) )? ) ;
    public final EObject ruleImplicationMapping() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_OrMapping_0 = null;

        EObject lv_consequent_3_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:1222:2: ( (this_OrMapping_0= ruleOrMapping ( () otherlv_2= '=>' ( (lv_consequent_3_0= ruleOrMapping ) ) )? ) )
            // InternalDsl.g:1223:2: (this_OrMapping_0= ruleOrMapping ( () otherlv_2= '=>' ( (lv_consequent_3_0= ruleOrMapping ) ) )? )
            {
            // InternalDsl.g:1223:2: (this_OrMapping_0= ruleOrMapping ( () otherlv_2= '=>' ( (lv_consequent_3_0= ruleOrMapping ) ) )? )
            // InternalDsl.g:1224:3: this_OrMapping_0= ruleOrMapping ( () otherlv_2= '=>' ( (lv_consequent_3_0= ruleOrMapping ) ) )?
            {

            			newCompositeNode(grammarAccess.getImplicationMappingAccess().getOrMappingParserRuleCall_0());
            		
            pushFollow(FOLLOW_9);
            this_OrMapping_0=ruleOrMapping();

            state._fsp--;


            			current = this_OrMapping_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalDsl.g:1232:3: ( () otherlv_2= '=>' ( (lv_consequent_3_0= ruleOrMapping ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==26) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalDsl.g:1233:4: () otherlv_2= '=>' ( (lv_consequent_3_0= ruleOrMapping ) )
                    {
                    // InternalDsl.g:1233:4: ()
                    // InternalDsl.g:1234:5: 
                    {

                    					current = forceCreateModelElementAndSet(
                    						grammarAccess.getImplicationMappingAccess().getImplicationMappingRuleAntecedentAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_2=(Token)match(input,26,FOLLOW_10); 

                    				newLeafNode(otherlv_2, grammarAccess.getImplicationMappingAccess().getEqualsSignGreaterThanSignKeyword_1_1());
                    			
                    // InternalDsl.g:1244:4: ( (lv_consequent_3_0= ruleOrMapping ) )
                    // InternalDsl.g:1245:5: (lv_consequent_3_0= ruleOrMapping )
                    {
                    // InternalDsl.g:1245:5: (lv_consequent_3_0= ruleOrMapping )
                    // InternalDsl.g:1246:6: lv_consequent_3_0= ruleOrMapping
                    {

                    						newCompositeNode(grammarAccess.getImplicationMappingAccess().getConsequentOrMappingParserRuleCall_1_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_consequent_3_0=ruleOrMapping();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getImplicationMappingRule());
                    						}
                    						set(
                    							current,
                    							"consequent",
                    							lv_consequent_3_0,
                    							"org.framed.orm.editPolicy.model.dsl.Dsl.OrMapping");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleImplicationMapping"


    // $ANTLR start "entryRuleOrMapping"
    // InternalDsl.g:1268:1: entryRuleOrMapping returns [EObject current=null] : iv_ruleOrMapping= ruleOrMapping EOF ;
    public final EObject entryRuleOrMapping() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrMapping = null;


        try {
            // InternalDsl.g:1268:50: (iv_ruleOrMapping= ruleOrMapping EOF )
            // InternalDsl.g:1269:2: iv_ruleOrMapping= ruleOrMapping EOF
            {
             newCompositeNode(grammarAccess.getOrMappingRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOrMapping=ruleOrMapping();

            state._fsp--;

             current =iv_ruleOrMapping; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOrMapping"


    // $ANTLR start "ruleOrMapping"
    // InternalDsl.g:1275:1: ruleOrMapping returns [EObject current=null] : (this_AndMapping_0= ruleAndMapping ( () otherlv_2= '||' ( (lv_rules_3_0= ruleAndMapping ) ) )* ) ;
    public final EObject ruleOrMapping() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_AndMapping_0 = null;

        EObject lv_rules_3_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:1281:2: ( (this_AndMapping_0= ruleAndMapping ( () otherlv_2= '||' ( (lv_rules_3_0= ruleAndMapping ) ) )* ) )
            // InternalDsl.g:1282:2: (this_AndMapping_0= ruleAndMapping ( () otherlv_2= '||' ( (lv_rules_3_0= ruleAndMapping ) ) )* )
            {
            // InternalDsl.g:1282:2: (this_AndMapping_0= ruleAndMapping ( () otherlv_2= '||' ( (lv_rules_3_0= ruleAndMapping ) ) )* )
            // InternalDsl.g:1283:3: this_AndMapping_0= ruleAndMapping ( () otherlv_2= '||' ( (lv_rules_3_0= ruleAndMapping ) ) )*
            {

            			newCompositeNode(grammarAccess.getOrMappingAccess().getAndMappingParserRuleCall_0());
            		
            pushFollow(FOLLOW_11);
            this_AndMapping_0=ruleAndMapping();

            state._fsp--;


            			current = this_AndMapping_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalDsl.g:1291:3: ( () otherlv_2= '||' ( (lv_rules_3_0= ruleAndMapping ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==27) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalDsl.g:1292:4: () otherlv_2= '||' ( (lv_rules_3_0= ruleAndMapping ) )
            	    {
            	    // InternalDsl.g:1292:4: ()
            	    // InternalDsl.g:1293:5: 
            	    {

            	    					current = forceCreateModelElementAndAdd(
            	    						grammarAccess.getOrMappingAccess().getOrMappingRuleRulesAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,27,FOLLOW_10); 

            	    				newLeafNode(otherlv_2, grammarAccess.getOrMappingAccess().getVerticalLineVerticalLineKeyword_1_1());
            	    			
            	    // InternalDsl.g:1303:4: ( (lv_rules_3_0= ruleAndMapping ) )
            	    // InternalDsl.g:1304:5: (lv_rules_3_0= ruleAndMapping )
            	    {
            	    // InternalDsl.g:1304:5: (lv_rules_3_0= ruleAndMapping )
            	    // InternalDsl.g:1305:6: lv_rules_3_0= ruleAndMapping
            	    {

            	    						newCompositeNode(grammarAccess.getOrMappingAccess().getRulesAndMappingParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_11);
            	    lv_rules_3_0=ruleAndMapping();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getOrMappingRule());
            	    						}
            	    						add(
            	    							current,
            	    							"rules",
            	    							lv_rules_3_0,
            	    							"org.framed.orm.editPolicy.model.dsl.Dsl.AndMapping");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOrMapping"


    // $ANTLR start "entryRuleAndMapping"
    // InternalDsl.g:1327:1: entryRuleAndMapping returns [EObject current=null] : iv_ruleAndMapping= ruleAndMapping EOF ;
    public final EObject entryRuleAndMapping() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAndMapping = null;


        try {
            // InternalDsl.g:1327:51: (iv_ruleAndMapping= ruleAndMapping EOF )
            // InternalDsl.g:1328:2: iv_ruleAndMapping= ruleAndMapping EOF
            {
             newCompositeNode(grammarAccess.getAndMappingRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAndMapping=ruleAndMapping();

            state._fsp--;

             current =iv_ruleAndMapping; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAndMapping"


    // $ANTLR start "ruleAndMapping"
    // InternalDsl.g:1334:1: ruleAndMapping returns [EObject current=null] : (this_NotMappingExpression_0= ruleNotMappingExpression ( () otherlv_2= '&&' ( (lv_rules_3_0= ruleNotMappingExpression ) ) )* ) ;
    public final EObject ruleAndMapping() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_NotMappingExpression_0 = null;

        EObject lv_rules_3_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:1340:2: ( (this_NotMappingExpression_0= ruleNotMappingExpression ( () otherlv_2= '&&' ( (lv_rules_3_0= ruleNotMappingExpression ) ) )* ) )
            // InternalDsl.g:1341:2: (this_NotMappingExpression_0= ruleNotMappingExpression ( () otherlv_2= '&&' ( (lv_rules_3_0= ruleNotMappingExpression ) ) )* )
            {
            // InternalDsl.g:1341:2: (this_NotMappingExpression_0= ruleNotMappingExpression ( () otherlv_2= '&&' ( (lv_rules_3_0= ruleNotMappingExpression ) ) )* )
            // InternalDsl.g:1342:3: this_NotMappingExpression_0= ruleNotMappingExpression ( () otherlv_2= '&&' ( (lv_rules_3_0= ruleNotMappingExpression ) ) )*
            {

            			newCompositeNode(grammarAccess.getAndMappingAccess().getNotMappingExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_12);
            this_NotMappingExpression_0=ruleNotMappingExpression();

            state._fsp--;


            			current = this_NotMappingExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalDsl.g:1350:3: ( () otherlv_2= '&&' ( (lv_rules_3_0= ruleNotMappingExpression ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==28) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalDsl.g:1351:4: () otherlv_2= '&&' ( (lv_rules_3_0= ruleNotMappingExpression ) )
            	    {
            	    // InternalDsl.g:1351:4: ()
            	    // InternalDsl.g:1352:5: 
            	    {

            	    					current = forceCreateModelElementAndAdd(
            	    						grammarAccess.getAndMappingAccess().getAndMappingRuleRulesAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,28,FOLLOW_10); 

            	    				newLeafNode(otherlv_2, grammarAccess.getAndMappingAccess().getAmpersandAmpersandKeyword_1_1());
            	    			
            	    // InternalDsl.g:1362:4: ( (lv_rules_3_0= ruleNotMappingExpression ) )
            	    // InternalDsl.g:1363:5: (lv_rules_3_0= ruleNotMappingExpression )
            	    {
            	    // InternalDsl.g:1363:5: (lv_rules_3_0= ruleNotMappingExpression )
            	    // InternalDsl.g:1364:6: lv_rules_3_0= ruleNotMappingExpression
            	    {

            	    						newCompositeNode(grammarAccess.getAndMappingAccess().getRulesNotMappingExpressionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_12);
            	    lv_rules_3_0=ruleNotMappingExpression();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getAndMappingRule());
            	    						}
            	    						add(
            	    							current,
            	    							"rules",
            	    							lv_rules_3_0,
            	    							"org.framed.orm.editPolicy.model.dsl.Dsl.NotMappingExpression");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAndMapping"


    // $ANTLR start "entryRuleNotMappingExpression"
    // InternalDsl.g:1386:1: entryRuleNotMappingExpression returns [EObject current=null] : iv_ruleNotMappingExpression= ruleNotMappingExpression EOF ;
    public final EObject entryRuleNotMappingExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNotMappingExpression = null;


        try {
            // InternalDsl.g:1386:61: (iv_ruleNotMappingExpression= ruleNotMappingExpression EOF )
            // InternalDsl.g:1387:2: iv_ruleNotMappingExpression= ruleNotMappingExpression EOF
            {
             newCompositeNode(grammarAccess.getNotMappingExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNotMappingExpression=ruleNotMappingExpression();

            state._fsp--;

             current =iv_ruleNotMappingExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNotMappingExpression"


    // $ANTLR start "ruleNotMappingExpression"
    // InternalDsl.g:1393:1: ruleNotMappingExpression returns [EObject current=null] : (this_PrimaryMapping_0= rulePrimaryMapping | (otherlv_1= '!' () ( (lv_rule_3_0= rulePrimaryMapping ) ) ) ) ;
    public final EObject ruleNotMappingExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject this_PrimaryMapping_0 = null;

        EObject lv_rule_3_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:1399:2: ( (this_PrimaryMapping_0= rulePrimaryMapping | (otherlv_1= '!' () ( (lv_rule_3_0= rulePrimaryMapping ) ) ) ) )
            // InternalDsl.g:1400:2: (this_PrimaryMapping_0= rulePrimaryMapping | (otherlv_1= '!' () ( (lv_rule_3_0= rulePrimaryMapping ) ) ) )
            {
            // InternalDsl.g:1400:2: (this_PrimaryMapping_0= rulePrimaryMapping | (otherlv_1= '!' () ( (lv_rule_3_0= rulePrimaryMapping ) ) ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( ((LA11_0>=RULE_ID && LA11_0<=RULE_STRING)||LA11_0==12||LA11_0==30) ) {
                alt11=1;
            }
            else if ( (LA11_0==29) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalDsl.g:1401:3: this_PrimaryMapping_0= rulePrimaryMapping
                    {

                    			newCompositeNode(grammarAccess.getNotMappingExpressionAccess().getPrimaryMappingParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_PrimaryMapping_0=rulePrimaryMapping();

                    state._fsp--;


                    			current = this_PrimaryMapping_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalDsl.g:1410:3: (otherlv_1= '!' () ( (lv_rule_3_0= rulePrimaryMapping ) ) )
                    {
                    // InternalDsl.g:1410:3: (otherlv_1= '!' () ( (lv_rule_3_0= rulePrimaryMapping ) ) )
                    // InternalDsl.g:1411:4: otherlv_1= '!' () ( (lv_rule_3_0= rulePrimaryMapping ) )
                    {
                    otherlv_1=(Token)match(input,29,FOLLOW_13); 

                    				newLeafNode(otherlv_1, grammarAccess.getNotMappingExpressionAccess().getExclamationMarkKeyword_1_0());
                    			
                    // InternalDsl.g:1415:4: ()
                    // InternalDsl.g:1416:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getNotMappingExpressionAccess().getNotMappingRuleAction_1_1(),
                    						current);
                    				

                    }

                    // InternalDsl.g:1422:4: ( (lv_rule_3_0= rulePrimaryMapping ) )
                    // InternalDsl.g:1423:5: (lv_rule_3_0= rulePrimaryMapping )
                    {
                    // InternalDsl.g:1423:5: (lv_rule_3_0= rulePrimaryMapping )
                    // InternalDsl.g:1424:6: lv_rule_3_0= rulePrimaryMapping
                    {

                    						newCompositeNode(grammarAccess.getNotMappingExpressionAccess().getRulePrimaryMappingParserRuleCall_1_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_rule_3_0=rulePrimaryMapping();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getNotMappingExpressionRule());
                    						}
                    						set(
                    							current,
                    							"rule",
                    							lv_rule_3_0,
                    							"org.framed.orm.editPolicy.model.dsl.Dsl.PrimaryMapping");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNotMappingExpression"


    // $ANTLR start "entryRulePrimaryMapping"
    // InternalDsl.g:1446:1: entryRulePrimaryMapping returns [EObject current=null] : iv_rulePrimaryMapping= rulePrimaryMapping EOF ;
    public final EObject entryRulePrimaryMapping() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryMapping = null;


        try {
            // InternalDsl.g:1446:55: (iv_rulePrimaryMapping= rulePrimaryMapping EOF )
            // InternalDsl.g:1447:2: iv_rulePrimaryMapping= rulePrimaryMapping EOF
            {
             newCompositeNode(grammarAccess.getPrimaryMappingRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrimaryMapping=rulePrimaryMapping();

            state._fsp--;

             current =iv_rulePrimaryMapping; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrimaryMapping"


    // $ANTLR start "rulePrimaryMapping"
    // InternalDsl.g:1453:1: rulePrimaryMapping returns [EObject current=null] : (this_MappingRule_0= ruleMappingRule | (otherlv_1= '(' this_MappingExpression_2= ruleMappingExpression otherlv_3= ')' ) ) ;
    public final EObject rulePrimaryMapping() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject this_MappingRule_0 = null;

        EObject this_MappingExpression_2 = null;



        	enterRule();

        try {
            // InternalDsl.g:1459:2: ( (this_MappingRule_0= ruleMappingRule | (otherlv_1= '(' this_MappingExpression_2= ruleMappingExpression otherlv_3= ')' ) ) )
            // InternalDsl.g:1460:2: (this_MappingRule_0= ruleMappingRule | (otherlv_1= '(' this_MappingExpression_2= ruleMappingExpression otherlv_3= ')' ) )
            {
            // InternalDsl.g:1460:2: (this_MappingRule_0= ruleMappingRule | (otherlv_1= '(' this_MappingExpression_2= ruleMappingExpression otherlv_3= ')' ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( ((LA12_0>=RULE_ID && LA12_0<=RULE_STRING)||LA12_0==12) ) {
                alt12=1;
            }
            else if ( (LA12_0==30) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalDsl.g:1461:3: this_MappingRule_0= ruleMappingRule
                    {

                    			newCompositeNode(grammarAccess.getPrimaryMappingAccess().getMappingRuleParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_MappingRule_0=ruleMappingRule();

                    state._fsp--;


                    			current = this_MappingRule_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalDsl.g:1470:3: (otherlv_1= '(' this_MappingExpression_2= ruleMappingExpression otherlv_3= ')' )
                    {
                    // InternalDsl.g:1470:3: (otherlv_1= '(' this_MappingExpression_2= ruleMappingExpression otherlv_3= ')' )
                    // InternalDsl.g:1471:4: otherlv_1= '(' this_MappingExpression_2= ruleMappingExpression otherlv_3= ')'
                    {
                    otherlv_1=(Token)match(input,30,FOLLOW_10); 

                    				newLeafNode(otherlv_1, grammarAccess.getPrimaryMappingAccess().getLeftParenthesisKeyword_1_0());
                    			

                    				newCompositeNode(grammarAccess.getPrimaryMappingAccess().getMappingExpressionParserRuleCall_1_1());
                    			
                    pushFollow(FOLLOW_14);
                    this_MappingExpression_2=ruleMappingExpression();

                    state._fsp--;


                    				current = this_MappingExpression_2;
                    				afterParserOrEnumRuleCall();
                    			
                    otherlv_3=(Token)match(input,31,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getPrimaryMappingAccess().getRightParenthesisKeyword_1_2());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrimaryMapping"


    // $ANTLR start "entryRulePolicyExpression"
    // InternalDsl.g:1492:1: entryRulePolicyExpression returns [EObject current=null] : iv_rulePolicyExpression= rulePolicyExpression EOF ;
    public final EObject entryRulePolicyExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePolicyExpression = null;


        try {
            // InternalDsl.g:1492:57: (iv_rulePolicyExpression= rulePolicyExpression EOF )
            // InternalDsl.g:1493:2: iv_rulePolicyExpression= rulePolicyExpression EOF
            {
             newCompositeNode(grammarAccess.getPolicyExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePolicyExpression=rulePolicyExpression();

            state._fsp--;

             current =iv_rulePolicyExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePolicyExpression"


    // $ANTLR start "rulePolicyExpression"
    // InternalDsl.g:1499:1: rulePolicyExpression returns [EObject current=null] : this_ImplicationPolicy_0= ruleImplicationPolicy ;
    public final EObject rulePolicyExpression() throws RecognitionException {
        EObject current = null;

        EObject this_ImplicationPolicy_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:1505:2: (this_ImplicationPolicy_0= ruleImplicationPolicy )
            // InternalDsl.g:1506:2: this_ImplicationPolicy_0= ruleImplicationPolicy
            {

            		newCompositeNode(grammarAccess.getPolicyExpressionAccess().getImplicationPolicyParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_ImplicationPolicy_0=ruleImplicationPolicy();

            state._fsp--;


            		current = this_ImplicationPolicy_0;
            		afterParserOrEnumRuleCall();
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePolicyExpression"


    // $ANTLR start "entryRuleImplicationPolicy"
    // InternalDsl.g:1517:1: entryRuleImplicationPolicy returns [EObject current=null] : iv_ruleImplicationPolicy= ruleImplicationPolicy EOF ;
    public final EObject entryRuleImplicationPolicy() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImplicationPolicy = null;


        try {
            // InternalDsl.g:1517:58: (iv_ruleImplicationPolicy= ruleImplicationPolicy EOF )
            // InternalDsl.g:1518:2: iv_ruleImplicationPolicy= ruleImplicationPolicy EOF
            {
             newCompositeNode(grammarAccess.getImplicationPolicyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleImplicationPolicy=ruleImplicationPolicy();

            state._fsp--;

             current =iv_ruleImplicationPolicy; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleImplicationPolicy"


    // $ANTLR start "ruleImplicationPolicy"
    // InternalDsl.g:1524:1: ruleImplicationPolicy returns [EObject current=null] : (this_OrPolicy_0= ruleOrPolicy ( () otherlv_2= '=>' ( (lv_consequent_3_0= ruleOrPolicy ) ) )? ) ;
    public final EObject ruleImplicationPolicy() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_OrPolicy_0 = null;

        EObject lv_consequent_3_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:1530:2: ( (this_OrPolicy_0= ruleOrPolicy ( () otherlv_2= '=>' ( (lv_consequent_3_0= ruleOrPolicy ) ) )? ) )
            // InternalDsl.g:1531:2: (this_OrPolicy_0= ruleOrPolicy ( () otherlv_2= '=>' ( (lv_consequent_3_0= ruleOrPolicy ) ) )? )
            {
            // InternalDsl.g:1531:2: (this_OrPolicy_0= ruleOrPolicy ( () otherlv_2= '=>' ( (lv_consequent_3_0= ruleOrPolicy ) ) )? )
            // InternalDsl.g:1532:3: this_OrPolicy_0= ruleOrPolicy ( () otherlv_2= '=>' ( (lv_consequent_3_0= ruleOrPolicy ) ) )?
            {

            			newCompositeNode(grammarAccess.getImplicationPolicyAccess().getOrPolicyParserRuleCall_0());
            		
            pushFollow(FOLLOW_9);
            this_OrPolicy_0=ruleOrPolicy();

            state._fsp--;


            			current = this_OrPolicy_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalDsl.g:1540:3: ( () otherlv_2= '=>' ( (lv_consequent_3_0= ruleOrPolicy ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==26) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalDsl.g:1541:4: () otherlv_2= '=>' ( (lv_consequent_3_0= ruleOrPolicy ) )
                    {
                    // InternalDsl.g:1541:4: ()
                    // InternalDsl.g:1542:5: 
                    {

                    					current = forceCreateModelElementAndSet(
                    						grammarAccess.getImplicationPolicyAccess().getImplicationRuleAntecedentAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_2=(Token)match(input,26,FOLLOW_6); 

                    				newLeafNode(otherlv_2, grammarAccess.getImplicationPolicyAccess().getEqualsSignGreaterThanSignKeyword_1_1());
                    			
                    // InternalDsl.g:1552:4: ( (lv_consequent_3_0= ruleOrPolicy ) )
                    // InternalDsl.g:1553:5: (lv_consequent_3_0= ruleOrPolicy )
                    {
                    // InternalDsl.g:1553:5: (lv_consequent_3_0= ruleOrPolicy )
                    // InternalDsl.g:1554:6: lv_consequent_3_0= ruleOrPolicy
                    {

                    						newCompositeNode(grammarAccess.getImplicationPolicyAccess().getConsequentOrPolicyParserRuleCall_1_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_consequent_3_0=ruleOrPolicy();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getImplicationPolicyRule());
                    						}
                    						set(
                    							current,
                    							"consequent",
                    							lv_consequent_3_0,
                    							"org.framed.orm.editPolicy.model.dsl.Dsl.OrPolicy");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleImplicationPolicy"


    // $ANTLR start "entryRuleOrPolicy"
    // InternalDsl.g:1576:1: entryRuleOrPolicy returns [EObject current=null] : iv_ruleOrPolicy= ruleOrPolicy EOF ;
    public final EObject entryRuleOrPolicy() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrPolicy = null;


        try {
            // InternalDsl.g:1576:49: (iv_ruleOrPolicy= ruleOrPolicy EOF )
            // InternalDsl.g:1577:2: iv_ruleOrPolicy= ruleOrPolicy EOF
            {
             newCompositeNode(grammarAccess.getOrPolicyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOrPolicy=ruleOrPolicy();

            state._fsp--;

             current =iv_ruleOrPolicy; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOrPolicy"


    // $ANTLR start "ruleOrPolicy"
    // InternalDsl.g:1583:1: ruleOrPolicy returns [EObject current=null] : (this_AndPolicy_0= ruleAndPolicy ( () otherlv_2= '||' ( (lv_rules_3_0= ruleAndPolicy ) ) )* ) ;
    public final EObject ruleOrPolicy() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_AndPolicy_0 = null;

        EObject lv_rules_3_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:1589:2: ( (this_AndPolicy_0= ruleAndPolicy ( () otherlv_2= '||' ( (lv_rules_3_0= ruleAndPolicy ) ) )* ) )
            // InternalDsl.g:1590:2: (this_AndPolicy_0= ruleAndPolicy ( () otherlv_2= '||' ( (lv_rules_3_0= ruleAndPolicy ) ) )* )
            {
            // InternalDsl.g:1590:2: (this_AndPolicy_0= ruleAndPolicy ( () otherlv_2= '||' ( (lv_rules_3_0= ruleAndPolicy ) ) )* )
            // InternalDsl.g:1591:3: this_AndPolicy_0= ruleAndPolicy ( () otherlv_2= '||' ( (lv_rules_3_0= ruleAndPolicy ) ) )*
            {

            			newCompositeNode(grammarAccess.getOrPolicyAccess().getAndPolicyParserRuleCall_0());
            		
            pushFollow(FOLLOW_11);
            this_AndPolicy_0=ruleAndPolicy();

            state._fsp--;


            			current = this_AndPolicy_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalDsl.g:1599:3: ( () otherlv_2= '||' ( (lv_rules_3_0= ruleAndPolicy ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==27) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalDsl.g:1600:4: () otherlv_2= '||' ( (lv_rules_3_0= ruleAndPolicy ) )
            	    {
            	    // InternalDsl.g:1600:4: ()
            	    // InternalDsl.g:1601:5: 
            	    {

            	    					current = forceCreateModelElementAndAdd(
            	    						grammarAccess.getOrPolicyAccess().getOrRuleRulesAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,27,FOLLOW_6); 

            	    				newLeafNode(otherlv_2, grammarAccess.getOrPolicyAccess().getVerticalLineVerticalLineKeyword_1_1());
            	    			
            	    // InternalDsl.g:1611:4: ( (lv_rules_3_0= ruleAndPolicy ) )
            	    // InternalDsl.g:1612:5: (lv_rules_3_0= ruleAndPolicy )
            	    {
            	    // InternalDsl.g:1612:5: (lv_rules_3_0= ruleAndPolicy )
            	    // InternalDsl.g:1613:6: lv_rules_3_0= ruleAndPolicy
            	    {

            	    						newCompositeNode(grammarAccess.getOrPolicyAccess().getRulesAndPolicyParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_11);
            	    lv_rules_3_0=ruleAndPolicy();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getOrPolicyRule());
            	    						}
            	    						add(
            	    							current,
            	    							"rules",
            	    							lv_rules_3_0,
            	    							"org.framed.orm.editPolicy.model.dsl.Dsl.AndPolicy");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOrPolicy"


    // $ANTLR start "entryRuleAndPolicy"
    // InternalDsl.g:1635:1: entryRuleAndPolicy returns [EObject current=null] : iv_ruleAndPolicy= ruleAndPolicy EOF ;
    public final EObject entryRuleAndPolicy() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAndPolicy = null;


        try {
            // InternalDsl.g:1635:50: (iv_ruleAndPolicy= ruleAndPolicy EOF )
            // InternalDsl.g:1636:2: iv_ruleAndPolicy= ruleAndPolicy EOF
            {
             newCompositeNode(grammarAccess.getAndPolicyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAndPolicy=ruleAndPolicy();

            state._fsp--;

             current =iv_ruleAndPolicy; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAndPolicy"


    // $ANTLR start "ruleAndPolicy"
    // InternalDsl.g:1642:1: ruleAndPolicy returns [EObject current=null] : (this_NotExpression_0= ruleNotExpression ( () otherlv_2= '&&' ( (lv_rules_3_0= ruleNotExpression ) ) )* ) ;
    public final EObject ruleAndPolicy() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_NotExpression_0 = null;

        EObject lv_rules_3_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:1648:2: ( (this_NotExpression_0= ruleNotExpression ( () otherlv_2= '&&' ( (lv_rules_3_0= ruleNotExpression ) ) )* ) )
            // InternalDsl.g:1649:2: (this_NotExpression_0= ruleNotExpression ( () otherlv_2= '&&' ( (lv_rules_3_0= ruleNotExpression ) ) )* )
            {
            // InternalDsl.g:1649:2: (this_NotExpression_0= ruleNotExpression ( () otherlv_2= '&&' ( (lv_rules_3_0= ruleNotExpression ) ) )* )
            // InternalDsl.g:1650:3: this_NotExpression_0= ruleNotExpression ( () otherlv_2= '&&' ( (lv_rules_3_0= ruleNotExpression ) ) )*
            {

            			newCompositeNode(grammarAccess.getAndPolicyAccess().getNotExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_12);
            this_NotExpression_0=ruleNotExpression();

            state._fsp--;


            			current = this_NotExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalDsl.g:1658:3: ( () otherlv_2= '&&' ( (lv_rules_3_0= ruleNotExpression ) ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==28) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalDsl.g:1659:4: () otherlv_2= '&&' ( (lv_rules_3_0= ruleNotExpression ) )
            	    {
            	    // InternalDsl.g:1659:4: ()
            	    // InternalDsl.g:1660:5: 
            	    {

            	    					current = forceCreateModelElementAndAdd(
            	    						grammarAccess.getAndPolicyAccess().getAndRuleRulesAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,28,FOLLOW_6); 

            	    				newLeafNode(otherlv_2, grammarAccess.getAndPolicyAccess().getAmpersandAmpersandKeyword_1_1());
            	    			
            	    // InternalDsl.g:1670:4: ( (lv_rules_3_0= ruleNotExpression ) )
            	    // InternalDsl.g:1671:5: (lv_rules_3_0= ruleNotExpression )
            	    {
            	    // InternalDsl.g:1671:5: (lv_rules_3_0= ruleNotExpression )
            	    // InternalDsl.g:1672:6: lv_rules_3_0= ruleNotExpression
            	    {

            	    						newCompositeNode(grammarAccess.getAndPolicyAccess().getRulesNotExpressionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_12);
            	    lv_rules_3_0=ruleNotExpression();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getAndPolicyRule());
            	    						}
            	    						add(
            	    							current,
            	    							"rules",
            	    							lv_rules_3_0,
            	    							"org.framed.orm.editPolicy.model.dsl.Dsl.NotExpression");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAndPolicy"


    // $ANTLR start "entryRuleNotExpression"
    // InternalDsl.g:1694:1: entryRuleNotExpression returns [EObject current=null] : iv_ruleNotExpression= ruleNotExpression EOF ;
    public final EObject entryRuleNotExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNotExpression = null;


        try {
            // InternalDsl.g:1694:54: (iv_ruleNotExpression= ruleNotExpression EOF )
            // InternalDsl.g:1695:2: iv_ruleNotExpression= ruleNotExpression EOF
            {
             newCompositeNode(grammarAccess.getNotExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNotExpression=ruleNotExpression();

            state._fsp--;

             current =iv_ruleNotExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNotExpression"


    // $ANTLR start "ruleNotExpression"
    // InternalDsl.g:1701:1: ruleNotExpression returns [EObject current=null] : (this_Primary_0= rulePrimary | (otherlv_1= '!' () ( (lv_rule_3_0= rulePrimary ) ) ) ) ;
    public final EObject ruleNotExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject this_Primary_0 = null;

        EObject lv_rule_3_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:1707:2: ( (this_Primary_0= rulePrimary | (otherlv_1= '!' () ( (lv_rule_3_0= rulePrimary ) ) ) ) )
            // InternalDsl.g:1708:2: (this_Primary_0= rulePrimary | (otherlv_1= '!' () ( (lv_rule_3_0= rulePrimary ) ) ) )
            {
            // InternalDsl.g:1708:2: (this_Primary_0= rulePrimary | (otherlv_1= '!' () ( (lv_rule_3_0= rulePrimary ) ) ) )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( ((LA16_0>=12 && LA16_0<=25)||LA16_0==30) ) {
                alt16=1;
            }
            else if ( (LA16_0==29) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalDsl.g:1709:3: this_Primary_0= rulePrimary
                    {

                    			newCompositeNode(grammarAccess.getNotExpressionAccess().getPrimaryParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Primary_0=rulePrimary();

                    state._fsp--;


                    			current = this_Primary_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalDsl.g:1718:3: (otherlv_1= '!' () ( (lv_rule_3_0= rulePrimary ) ) )
                    {
                    // InternalDsl.g:1718:3: (otherlv_1= '!' () ( (lv_rule_3_0= rulePrimary ) ) )
                    // InternalDsl.g:1719:4: otherlv_1= '!' () ( (lv_rule_3_0= rulePrimary ) )
                    {
                    otherlv_1=(Token)match(input,29,FOLLOW_15); 

                    				newLeafNode(otherlv_1, grammarAccess.getNotExpressionAccess().getExclamationMarkKeyword_1_0());
                    			
                    // InternalDsl.g:1723:4: ()
                    // InternalDsl.g:1724:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getNotExpressionAccess().getNotRuleAction_1_1(),
                    						current);
                    				

                    }

                    // InternalDsl.g:1730:4: ( (lv_rule_3_0= rulePrimary ) )
                    // InternalDsl.g:1731:5: (lv_rule_3_0= rulePrimary )
                    {
                    // InternalDsl.g:1731:5: (lv_rule_3_0= rulePrimary )
                    // InternalDsl.g:1732:6: lv_rule_3_0= rulePrimary
                    {

                    						newCompositeNode(grammarAccess.getNotExpressionAccess().getRulePrimaryParserRuleCall_1_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_rule_3_0=rulePrimary();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getNotExpressionRule());
                    						}
                    						set(
                    							current,
                    							"rule",
                    							lv_rule_3_0,
                    							"org.framed.orm.editPolicy.model.dsl.Dsl.Primary");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNotExpression"


    // $ANTLR start "entryRulePrimary"
    // InternalDsl.g:1754:1: entryRulePrimary returns [EObject current=null] : iv_rulePrimary= rulePrimary EOF ;
    public final EObject entryRulePrimary() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimary = null;


        try {
            // InternalDsl.g:1754:48: (iv_rulePrimary= rulePrimary EOF )
            // InternalDsl.g:1755:2: iv_rulePrimary= rulePrimary EOF
            {
             newCompositeNode(grammarAccess.getPrimaryRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrimary=rulePrimary();

            state._fsp--;

             current =iv_rulePrimary; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrimary"


    // $ANTLR start "rulePrimary"
    // InternalDsl.g:1761:1: rulePrimary returns [EObject current=null] : (this_PolicyRule_0= rulePolicyRule | (otherlv_1= '(' this_PolicyExpression_2= rulePolicyExpression otherlv_3= ')' ) ) ;
    public final EObject rulePrimary() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject this_PolicyRule_0 = null;

        EObject this_PolicyExpression_2 = null;



        	enterRule();

        try {
            // InternalDsl.g:1767:2: ( (this_PolicyRule_0= rulePolicyRule | (otherlv_1= '(' this_PolicyExpression_2= rulePolicyExpression otherlv_3= ')' ) ) )
            // InternalDsl.g:1768:2: (this_PolicyRule_0= rulePolicyRule | (otherlv_1= '(' this_PolicyExpression_2= rulePolicyExpression otherlv_3= ')' ) )
            {
            // InternalDsl.g:1768:2: (this_PolicyRule_0= rulePolicyRule | (otherlv_1= '(' this_PolicyExpression_2= rulePolicyExpression otherlv_3= ')' ) )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( ((LA17_0>=12 && LA17_0<=25)) ) {
                alt17=1;
            }
            else if ( (LA17_0==30) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // InternalDsl.g:1769:3: this_PolicyRule_0= rulePolicyRule
                    {

                    			newCompositeNode(grammarAccess.getPrimaryAccess().getPolicyRuleParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_PolicyRule_0=rulePolicyRule();

                    state._fsp--;


                    			current = this_PolicyRule_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalDsl.g:1778:3: (otherlv_1= '(' this_PolicyExpression_2= rulePolicyExpression otherlv_3= ')' )
                    {
                    // InternalDsl.g:1778:3: (otherlv_1= '(' this_PolicyExpression_2= rulePolicyExpression otherlv_3= ')' )
                    // InternalDsl.g:1779:4: otherlv_1= '(' this_PolicyExpression_2= rulePolicyExpression otherlv_3= ')'
                    {
                    otherlv_1=(Token)match(input,30,FOLLOW_6); 

                    				newLeafNode(otherlv_1, grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_1_0());
                    			

                    				newCompositeNode(grammarAccess.getPrimaryAccess().getPolicyExpressionParserRuleCall_1_1());
                    			
                    pushFollow(FOLLOW_14);
                    this_PolicyExpression_2=rulePolicyExpression();

                    state._fsp--;


                    				current = this_PolicyExpression_2;
                    				afterParserOrEnumRuleCall();
                    			
                    otherlv_3=(Token)match(input,31,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_1_2());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrimary"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000060001032L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000063FFF000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000060001030L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000040001030L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000043FFF000L});

}