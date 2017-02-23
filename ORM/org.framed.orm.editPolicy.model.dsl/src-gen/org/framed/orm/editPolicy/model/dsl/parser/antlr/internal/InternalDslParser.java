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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Model'", "'{'", "'configuration'", "'policies'", "','", "'}'", "'Configuration'", "'mappings'", "'Policy'", "'Mapping'", "'rule'", "'policy'", "'FeatureNameMappingRule'", "'AndMappingRule'", "'!'", "'OrMappingRule'", "'ImplicationMappingRule'", "'if'", "'then'", "'TrueMappingRule'", "'RelationIsCyclicRule'", "'RelationTypesAreEqualRule'", "'RelationIsReflexivRule'", "'AndRule'", "'RelationNameRule'", "'OrRule'", "'NotRule'", "'ImplicationRule'", "'SourceTypeRule'", "'TargetTypeRule'", "'CommandNameRule'", "'ShapeTypeRule'", "'ParentTypeRule'", "'StepInRule'", "'TrueRule'", "'FalseRule'", "'ShapeNameRule'", "'&&'", "'||'", "'('", "')'"
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
    public static final int EOF=-1;
    public static final int T__19=19;
    public static final int T__51=51;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=6;
    public static final int T__50=50;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int RULE_SL_COMMENT=8;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_STRING=5;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
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
    // InternalDsl.g:71:1: ruleModel returns [EObject current=null] : (otherlv_0= 'Model' otherlv_1= '{' otherlv_2= 'configuration' ( (lv_configuration_3_0= ruleConfiguration ) ) (otherlv_4= 'policies' otherlv_5= '{' ( (lv_policies_6_0= rulePolicy ) ) (otherlv_7= ',' ( (lv_policies_8_0= rulePolicy ) ) )* otherlv_9= '}' )? otherlv_10= '}' ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        EObject lv_configuration_3_0 = null;

        EObject lv_policies_6_0 = null;

        EObject lv_policies_8_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:77:2: ( (otherlv_0= 'Model' otherlv_1= '{' otherlv_2= 'configuration' ( (lv_configuration_3_0= ruleConfiguration ) ) (otherlv_4= 'policies' otherlv_5= '{' ( (lv_policies_6_0= rulePolicy ) ) (otherlv_7= ',' ( (lv_policies_8_0= rulePolicy ) ) )* otherlv_9= '}' )? otherlv_10= '}' ) )
            // InternalDsl.g:78:2: (otherlv_0= 'Model' otherlv_1= '{' otherlv_2= 'configuration' ( (lv_configuration_3_0= ruleConfiguration ) ) (otherlv_4= 'policies' otherlv_5= '{' ( (lv_policies_6_0= rulePolicy ) ) (otherlv_7= ',' ( (lv_policies_8_0= rulePolicy ) ) )* otherlv_9= '}' )? otherlv_10= '}' )
            {
            // InternalDsl.g:78:2: (otherlv_0= 'Model' otherlv_1= '{' otherlv_2= 'configuration' ( (lv_configuration_3_0= ruleConfiguration ) ) (otherlv_4= 'policies' otherlv_5= '{' ( (lv_policies_6_0= rulePolicy ) ) (otherlv_7= ',' ( (lv_policies_8_0= rulePolicy ) ) )* otherlv_9= '}' )? otherlv_10= '}' )
            // InternalDsl.g:79:3: otherlv_0= 'Model' otherlv_1= '{' otherlv_2= 'configuration' ( (lv_configuration_3_0= ruleConfiguration ) ) (otherlv_4= 'policies' otherlv_5= '{' ( (lv_policies_6_0= rulePolicy ) ) (otherlv_7= ',' ( (lv_policies_8_0= rulePolicy ) ) )* otherlv_9= '}' )? otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getModelAccess().getModelKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,13,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getModelAccess().getConfigurationKeyword_2());
            		
            // InternalDsl.g:91:3: ( (lv_configuration_3_0= ruleConfiguration ) )
            // InternalDsl.g:92:4: (lv_configuration_3_0= ruleConfiguration )
            {
            // InternalDsl.g:92:4: (lv_configuration_3_0= ruleConfiguration )
            // InternalDsl.g:93:5: lv_configuration_3_0= ruleConfiguration
            {

            					newCompositeNode(grammarAccess.getModelAccess().getConfigurationConfigurationParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_6);
            lv_configuration_3_0=ruleConfiguration();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getModelRule());
            					}
            					set(
            						current,
            						"configuration",
            						lv_configuration_3_0,
            						"org.framed.orm.editPolicy.model.dsl.Dsl.Configuration");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDsl.g:110:3: (otherlv_4= 'policies' otherlv_5= '{' ( (lv_policies_6_0= rulePolicy ) ) (otherlv_7= ',' ( (lv_policies_8_0= rulePolicy ) ) )* otherlv_9= '}' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==14) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalDsl.g:111:4: otherlv_4= 'policies' otherlv_5= '{' ( (lv_policies_6_0= rulePolicy ) ) (otherlv_7= ',' ( (lv_policies_8_0= rulePolicy ) ) )* otherlv_9= '}'
                    {
                    otherlv_4=(Token)match(input,14,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getModelAccess().getPoliciesKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,12,FOLLOW_7); 

                    				newLeafNode(otherlv_5, grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalDsl.g:119:4: ( (lv_policies_6_0= rulePolicy ) )
                    // InternalDsl.g:120:5: (lv_policies_6_0= rulePolicy )
                    {
                    // InternalDsl.g:120:5: (lv_policies_6_0= rulePolicy )
                    // InternalDsl.g:121:6: lv_policies_6_0= rulePolicy
                    {

                    						newCompositeNode(grammarAccess.getModelAccess().getPoliciesPolicyParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_policies_6_0=rulePolicy();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getModelRule());
                    						}
                    						add(
                    							current,
                    							"policies",
                    							lv_policies_6_0,
                    							"org.framed.orm.editPolicy.model.dsl.Dsl.Policy");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDsl.g:138:4: (otherlv_7= ',' ( (lv_policies_8_0= rulePolicy ) ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==15) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalDsl.g:139:5: otherlv_7= ',' ( (lv_policies_8_0= rulePolicy ) )
                    	    {
                    	    otherlv_7=(Token)match(input,15,FOLLOW_7); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getModelAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalDsl.g:143:5: ( (lv_policies_8_0= rulePolicy ) )
                    	    // InternalDsl.g:144:6: (lv_policies_8_0= rulePolicy )
                    	    {
                    	    // InternalDsl.g:144:6: (lv_policies_8_0= rulePolicy )
                    	    // InternalDsl.g:145:7: lv_policies_8_0= rulePolicy
                    	    {

                    	    							newCompositeNode(grammarAccess.getModelAccess().getPoliciesPolicyParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_8);
                    	    lv_policies_8_0=rulePolicy();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getModelRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"policies",
                    	    								lv_policies_8_0,
                    	    								"org.framed.orm.editPolicy.model.dsl.Dsl.Policy");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,16,FOLLOW_9); 

                    				newLeafNode(otherlv_9, grammarAccess.getModelAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            otherlv_10=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getModelAccess().getRightCurlyBracketKeyword_5());
            		

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


    // $ANTLR start "entryRuleAbstractRule"
    // InternalDsl.g:176:1: entryRuleAbstractRule returns [EObject current=null] : iv_ruleAbstractRule= ruleAbstractRule EOF ;
    public final EObject entryRuleAbstractRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractRule = null;


        try {
            // InternalDsl.g:176:53: (iv_ruleAbstractRule= ruleAbstractRule EOF )
            // InternalDsl.g:177:2: iv_ruleAbstractRule= ruleAbstractRule EOF
            {
             newCompositeNode(grammarAccess.getAbstractRuleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAbstractRule=ruleAbstractRule();

            state._fsp--;

             current =iv_ruleAbstractRule; 
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
    // $ANTLR end "entryRuleAbstractRule"


    // $ANTLR start "ruleAbstractRule"
    // InternalDsl.g:183:1: ruleAbstractRule returns [EObject current=null] : (this_AndRule_0= ruleAndRule | this_RelationNameRule_1= ruleRelationNameRule | this_OrRule_2= ruleOrRule | this_NotRule_3= ruleNotRule | this_ImplicationRule_4= ruleImplicationRule | this_SourceTypeRule_5= ruleSourceTypeRule | this_TargetTypeRule_6= ruleTargetTypeRule | this_CommandNameRule_7= ruleCommandNameRule | this_ShapeTypeRule_8= ruleShapeTypeRule | this_ParentTypeRule_9= ruleParentTypeRule | this_StepInRule_10= ruleStepInRule | this_TrueRule_11= ruleTrueRule | this_FalseRule_12= ruleFalseRule | this_ShapeNameRule_13= ruleShapeNameRule | this_RelationIsCyclicRule_14= ruleRelationIsCyclicRule | this_RelationIsReflexivRule_15= ruleRelationIsReflexivRule | this_RelationTypesAreEqualRule_16= ruleRelationTypesAreEqualRule ) ;
    public final EObject ruleAbstractRule() throws RecognitionException {
        EObject current = null;

        EObject this_AndRule_0 = null;

        EObject this_RelationNameRule_1 = null;

        EObject this_OrRule_2 = null;

        EObject this_NotRule_3 = null;

        EObject this_ImplicationRule_4 = null;

        EObject this_SourceTypeRule_5 = null;

        EObject this_TargetTypeRule_6 = null;

        EObject this_CommandNameRule_7 = null;

        EObject this_ShapeTypeRule_8 = null;

        EObject this_ParentTypeRule_9 = null;

        EObject this_StepInRule_10 = null;

        EObject this_TrueRule_11 = null;

        EObject this_FalseRule_12 = null;

        EObject this_ShapeNameRule_13 = null;

        EObject this_RelationIsCyclicRule_14 = null;

        EObject this_RelationIsReflexivRule_15 = null;

        EObject this_RelationTypesAreEqualRule_16 = null;



        	enterRule();

        try {
            // InternalDsl.g:189:2: ( (this_AndRule_0= ruleAndRule | this_RelationNameRule_1= ruleRelationNameRule | this_OrRule_2= ruleOrRule | this_NotRule_3= ruleNotRule | this_ImplicationRule_4= ruleImplicationRule | this_SourceTypeRule_5= ruleSourceTypeRule | this_TargetTypeRule_6= ruleTargetTypeRule | this_CommandNameRule_7= ruleCommandNameRule | this_ShapeTypeRule_8= ruleShapeTypeRule | this_ParentTypeRule_9= ruleParentTypeRule | this_StepInRule_10= ruleStepInRule | this_TrueRule_11= ruleTrueRule | this_FalseRule_12= ruleFalseRule | this_ShapeNameRule_13= ruleShapeNameRule | this_RelationIsCyclicRule_14= ruleRelationIsCyclicRule | this_RelationIsReflexivRule_15= ruleRelationIsReflexivRule | this_RelationTypesAreEqualRule_16= ruleRelationTypesAreEqualRule ) )
            // InternalDsl.g:190:2: (this_AndRule_0= ruleAndRule | this_RelationNameRule_1= ruleRelationNameRule | this_OrRule_2= ruleOrRule | this_NotRule_3= ruleNotRule | this_ImplicationRule_4= ruleImplicationRule | this_SourceTypeRule_5= ruleSourceTypeRule | this_TargetTypeRule_6= ruleTargetTypeRule | this_CommandNameRule_7= ruleCommandNameRule | this_ShapeTypeRule_8= ruleShapeTypeRule | this_ParentTypeRule_9= ruleParentTypeRule | this_StepInRule_10= ruleStepInRule | this_TrueRule_11= ruleTrueRule | this_FalseRule_12= ruleFalseRule | this_ShapeNameRule_13= ruleShapeNameRule | this_RelationIsCyclicRule_14= ruleRelationIsCyclicRule | this_RelationIsReflexivRule_15= ruleRelationIsReflexivRule | this_RelationTypesAreEqualRule_16= ruleRelationTypesAreEqualRule )
            {
            // InternalDsl.g:190:2: (this_AndRule_0= ruleAndRule | this_RelationNameRule_1= ruleRelationNameRule | this_OrRule_2= ruleOrRule | this_NotRule_3= ruleNotRule | this_ImplicationRule_4= ruleImplicationRule | this_SourceTypeRule_5= ruleSourceTypeRule | this_TargetTypeRule_6= ruleTargetTypeRule | this_CommandNameRule_7= ruleCommandNameRule | this_ShapeTypeRule_8= ruleShapeTypeRule | this_ParentTypeRule_9= ruleParentTypeRule | this_StepInRule_10= ruleStepInRule | this_TrueRule_11= ruleTrueRule | this_FalseRule_12= ruleFalseRule | this_ShapeNameRule_13= ruleShapeNameRule | this_RelationIsCyclicRule_14= ruleRelationIsCyclicRule | this_RelationIsReflexivRule_15= ruleRelationIsReflexivRule | this_RelationTypesAreEqualRule_16= ruleRelationTypesAreEqualRule )
            int alt3=17;
            switch ( input.LA(1) ) {
            case 34:
                {
                alt3=1;
                }
                break;
            case 35:
                {
                alt3=2;
                }
                break;
            case 36:
                {
                alt3=3;
                }
                break;
            case 37:
                {
                alt3=4;
                }
                break;
            case 38:
                {
                alt3=5;
                }
                break;
            case 39:
                {
                alt3=6;
                }
                break;
            case 40:
                {
                alt3=7;
                }
                break;
            case 41:
                {
                alt3=8;
                }
                break;
            case 42:
                {
                alt3=9;
                }
                break;
            case 43:
                {
                alt3=10;
                }
                break;
            case 44:
                {
                alt3=11;
                }
                break;
            case 45:
                {
                alt3=12;
                }
                break;
            case 46:
                {
                alt3=13;
                }
                break;
            case 47:
                {
                alt3=14;
                }
                break;
            case 31:
                {
                alt3=15;
                }
                break;
            case 33:
                {
                alt3=16;
                }
                break;
            case 32:
                {
                alt3=17;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalDsl.g:191:3: this_AndRule_0= ruleAndRule
                    {

                    			newCompositeNode(grammarAccess.getAbstractRuleAccess().getAndRuleParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_AndRule_0=ruleAndRule();

                    state._fsp--;


                    			current = this_AndRule_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalDsl.g:200:3: this_RelationNameRule_1= ruleRelationNameRule
                    {

                    			newCompositeNode(grammarAccess.getAbstractRuleAccess().getRelationNameRuleParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_RelationNameRule_1=ruleRelationNameRule();

                    state._fsp--;


                    			current = this_RelationNameRule_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalDsl.g:209:3: this_OrRule_2= ruleOrRule
                    {

                    			newCompositeNode(grammarAccess.getAbstractRuleAccess().getOrRuleParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_OrRule_2=ruleOrRule();

                    state._fsp--;


                    			current = this_OrRule_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalDsl.g:218:3: this_NotRule_3= ruleNotRule
                    {

                    			newCompositeNode(grammarAccess.getAbstractRuleAccess().getNotRuleParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_NotRule_3=ruleNotRule();

                    state._fsp--;


                    			current = this_NotRule_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalDsl.g:227:3: this_ImplicationRule_4= ruleImplicationRule
                    {

                    			newCompositeNode(grammarAccess.getAbstractRuleAccess().getImplicationRuleParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_ImplicationRule_4=ruleImplicationRule();

                    state._fsp--;


                    			current = this_ImplicationRule_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalDsl.g:236:3: this_SourceTypeRule_5= ruleSourceTypeRule
                    {

                    			newCompositeNode(grammarAccess.getAbstractRuleAccess().getSourceTypeRuleParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_SourceTypeRule_5=ruleSourceTypeRule();

                    state._fsp--;


                    			current = this_SourceTypeRule_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalDsl.g:245:3: this_TargetTypeRule_6= ruleTargetTypeRule
                    {

                    			newCompositeNode(grammarAccess.getAbstractRuleAccess().getTargetTypeRuleParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_TargetTypeRule_6=ruleTargetTypeRule();

                    state._fsp--;


                    			current = this_TargetTypeRule_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 8 :
                    // InternalDsl.g:254:3: this_CommandNameRule_7= ruleCommandNameRule
                    {

                    			newCompositeNode(grammarAccess.getAbstractRuleAccess().getCommandNameRuleParserRuleCall_7());
                    		
                    pushFollow(FOLLOW_2);
                    this_CommandNameRule_7=ruleCommandNameRule();

                    state._fsp--;


                    			current = this_CommandNameRule_7;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 9 :
                    // InternalDsl.g:263:3: this_ShapeTypeRule_8= ruleShapeTypeRule
                    {

                    			newCompositeNode(grammarAccess.getAbstractRuleAccess().getShapeTypeRuleParserRuleCall_8());
                    		
                    pushFollow(FOLLOW_2);
                    this_ShapeTypeRule_8=ruleShapeTypeRule();

                    state._fsp--;


                    			current = this_ShapeTypeRule_8;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 10 :
                    // InternalDsl.g:272:3: this_ParentTypeRule_9= ruleParentTypeRule
                    {

                    			newCompositeNode(grammarAccess.getAbstractRuleAccess().getParentTypeRuleParserRuleCall_9());
                    		
                    pushFollow(FOLLOW_2);
                    this_ParentTypeRule_9=ruleParentTypeRule();

                    state._fsp--;


                    			current = this_ParentTypeRule_9;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 11 :
                    // InternalDsl.g:281:3: this_StepInRule_10= ruleStepInRule
                    {

                    			newCompositeNode(grammarAccess.getAbstractRuleAccess().getStepInRuleParserRuleCall_10());
                    		
                    pushFollow(FOLLOW_2);
                    this_StepInRule_10=ruleStepInRule();

                    state._fsp--;


                    			current = this_StepInRule_10;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 12 :
                    // InternalDsl.g:290:3: this_TrueRule_11= ruleTrueRule
                    {

                    			newCompositeNode(grammarAccess.getAbstractRuleAccess().getTrueRuleParserRuleCall_11());
                    		
                    pushFollow(FOLLOW_2);
                    this_TrueRule_11=ruleTrueRule();

                    state._fsp--;


                    			current = this_TrueRule_11;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 13 :
                    // InternalDsl.g:299:3: this_FalseRule_12= ruleFalseRule
                    {

                    			newCompositeNode(grammarAccess.getAbstractRuleAccess().getFalseRuleParserRuleCall_12());
                    		
                    pushFollow(FOLLOW_2);
                    this_FalseRule_12=ruleFalseRule();

                    state._fsp--;


                    			current = this_FalseRule_12;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 14 :
                    // InternalDsl.g:308:3: this_ShapeNameRule_13= ruleShapeNameRule
                    {

                    			newCompositeNode(grammarAccess.getAbstractRuleAccess().getShapeNameRuleParserRuleCall_13());
                    		
                    pushFollow(FOLLOW_2);
                    this_ShapeNameRule_13=ruleShapeNameRule();

                    state._fsp--;


                    			current = this_ShapeNameRule_13;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 15 :
                    // InternalDsl.g:317:3: this_RelationIsCyclicRule_14= ruleRelationIsCyclicRule
                    {

                    			newCompositeNode(grammarAccess.getAbstractRuleAccess().getRelationIsCyclicRuleParserRuleCall_14());
                    		
                    pushFollow(FOLLOW_2);
                    this_RelationIsCyclicRule_14=ruleRelationIsCyclicRule();

                    state._fsp--;


                    			current = this_RelationIsCyclicRule_14;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 16 :
                    // InternalDsl.g:326:3: this_RelationIsReflexivRule_15= ruleRelationIsReflexivRule
                    {

                    			newCompositeNode(grammarAccess.getAbstractRuleAccess().getRelationIsReflexivRuleParserRuleCall_15());
                    		
                    pushFollow(FOLLOW_2);
                    this_RelationIsReflexivRule_15=ruleRelationIsReflexivRule();

                    state._fsp--;


                    			current = this_RelationIsReflexivRule_15;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 17 :
                    // InternalDsl.g:335:3: this_RelationTypesAreEqualRule_16= ruleRelationTypesAreEqualRule
                    {

                    			newCompositeNode(grammarAccess.getAbstractRuleAccess().getRelationTypesAreEqualRuleParserRuleCall_16());
                    		
                    pushFollow(FOLLOW_2);
                    this_RelationTypesAreEqualRule_16=ruleRelationTypesAreEqualRule();

                    state._fsp--;


                    			current = this_RelationTypesAreEqualRule_16;
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
    // $ANTLR end "ruleAbstractRule"


    // $ANTLR start "entryRuleAbstractMappingRule"
    // InternalDsl.g:347:1: entryRuleAbstractMappingRule returns [EObject current=null] : iv_ruleAbstractMappingRule= ruleAbstractMappingRule EOF ;
    public final EObject entryRuleAbstractMappingRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractMappingRule = null;


        try {
            // InternalDsl.g:347:60: (iv_ruleAbstractMappingRule= ruleAbstractMappingRule EOF )
            // InternalDsl.g:348:2: iv_ruleAbstractMappingRule= ruleAbstractMappingRule EOF
            {
             newCompositeNode(grammarAccess.getAbstractMappingRuleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAbstractMappingRule=ruleAbstractMappingRule();

            state._fsp--;

             current =iv_ruleAbstractMappingRule; 
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
    // $ANTLR end "entryRuleAbstractMappingRule"


    // $ANTLR start "ruleAbstractMappingRule"
    // InternalDsl.g:354:1: ruleAbstractMappingRule returns [EObject current=null] : (this_FeatureNameMappingRule_0= ruleFeatureNameMappingRule | this_AndMappingRule_1= ruleAndMappingRule | this_NotMappingRule_2= ruleNotMappingRule | this_OrMappingRule_3= ruleOrMappingRule | this_ImplicationMappingRule_4= ruleImplicationMappingRule | this_TrueMappingRule_5= ruleTrueMappingRule ) ;
    public final EObject ruleAbstractMappingRule() throws RecognitionException {
        EObject current = null;

        EObject this_FeatureNameMappingRule_0 = null;

        EObject this_AndMappingRule_1 = null;

        EObject this_NotMappingRule_2 = null;

        EObject this_OrMappingRule_3 = null;

        EObject this_ImplicationMappingRule_4 = null;

        EObject this_TrueMappingRule_5 = null;



        	enterRule();

        try {
            // InternalDsl.g:360:2: ( (this_FeatureNameMappingRule_0= ruleFeatureNameMappingRule | this_AndMappingRule_1= ruleAndMappingRule | this_NotMappingRule_2= ruleNotMappingRule | this_OrMappingRule_3= ruleOrMappingRule | this_ImplicationMappingRule_4= ruleImplicationMappingRule | this_TrueMappingRule_5= ruleTrueMappingRule ) )
            // InternalDsl.g:361:2: (this_FeatureNameMappingRule_0= ruleFeatureNameMappingRule | this_AndMappingRule_1= ruleAndMappingRule | this_NotMappingRule_2= ruleNotMappingRule | this_OrMappingRule_3= ruleOrMappingRule | this_ImplicationMappingRule_4= ruleImplicationMappingRule | this_TrueMappingRule_5= ruleTrueMappingRule )
            {
            // InternalDsl.g:361:2: (this_FeatureNameMappingRule_0= ruleFeatureNameMappingRule | this_AndMappingRule_1= ruleAndMappingRule | this_NotMappingRule_2= ruleNotMappingRule | this_OrMappingRule_3= ruleOrMappingRule | this_ImplicationMappingRule_4= ruleImplicationMappingRule | this_TrueMappingRule_5= ruleTrueMappingRule )
            int alt4=6;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt4=1;
                }
                break;
            case 24:
                {
                alt4=2;
                }
                break;
            case 25:
                {
                alt4=3;
                }
                break;
            case 26:
                {
                alt4=4;
                }
                break;
            case 27:
                {
                alt4=5;
                }
                break;
            case 30:
                {
                alt4=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalDsl.g:362:3: this_FeatureNameMappingRule_0= ruleFeatureNameMappingRule
                    {

                    			newCompositeNode(grammarAccess.getAbstractMappingRuleAccess().getFeatureNameMappingRuleParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_FeatureNameMappingRule_0=ruleFeatureNameMappingRule();

                    state._fsp--;


                    			current = this_FeatureNameMappingRule_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalDsl.g:371:3: this_AndMappingRule_1= ruleAndMappingRule
                    {

                    			newCompositeNode(grammarAccess.getAbstractMappingRuleAccess().getAndMappingRuleParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_AndMappingRule_1=ruleAndMappingRule();

                    state._fsp--;


                    			current = this_AndMappingRule_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalDsl.g:380:3: this_NotMappingRule_2= ruleNotMappingRule
                    {

                    			newCompositeNode(grammarAccess.getAbstractMappingRuleAccess().getNotMappingRuleParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_NotMappingRule_2=ruleNotMappingRule();

                    state._fsp--;


                    			current = this_NotMappingRule_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalDsl.g:389:3: this_OrMappingRule_3= ruleOrMappingRule
                    {

                    			newCompositeNode(grammarAccess.getAbstractMappingRuleAccess().getOrMappingRuleParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_OrMappingRule_3=ruleOrMappingRule();

                    state._fsp--;


                    			current = this_OrMappingRule_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalDsl.g:398:3: this_ImplicationMappingRule_4= ruleImplicationMappingRule
                    {

                    			newCompositeNode(grammarAccess.getAbstractMappingRuleAccess().getImplicationMappingRuleParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_ImplicationMappingRule_4=ruleImplicationMappingRule();

                    state._fsp--;


                    			current = this_ImplicationMappingRule_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalDsl.g:407:3: this_TrueMappingRule_5= ruleTrueMappingRule
                    {

                    			newCompositeNode(grammarAccess.getAbstractMappingRuleAccess().getTrueMappingRuleParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_TrueMappingRule_5=ruleTrueMappingRule();

                    state._fsp--;


                    			current = this_TrueMappingRule_5;
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
    // $ANTLR end "ruleAbstractMappingRule"


    // $ANTLR start "entryRuleConfiguration"
    // InternalDsl.g:419:1: entryRuleConfiguration returns [EObject current=null] : iv_ruleConfiguration= ruleConfiguration EOF ;
    public final EObject entryRuleConfiguration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConfiguration = null;


        try {
            // InternalDsl.g:419:54: (iv_ruleConfiguration= ruleConfiguration EOF )
            // InternalDsl.g:420:2: iv_ruleConfiguration= ruleConfiguration EOF
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
    // InternalDsl.g:426:1: ruleConfiguration returns [EObject current=null] : ( () otherlv_1= 'Configuration' otherlv_2= '{' (otherlv_3= 'mappings' otherlv_4= '{' ( (lv_mappings_5_0= ruleMapping ) ) (otherlv_6= ',' ( (lv_mappings_7_0= ruleMapping ) ) )* otherlv_8= '}' )? otherlv_9= '}' ) ;
    public final EObject ruleConfiguration() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        EObject lv_mappings_5_0 = null;

        EObject lv_mappings_7_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:432:2: ( ( () otherlv_1= 'Configuration' otherlv_2= '{' (otherlv_3= 'mappings' otherlv_4= '{' ( (lv_mappings_5_0= ruleMapping ) ) (otherlv_6= ',' ( (lv_mappings_7_0= ruleMapping ) ) )* otherlv_8= '}' )? otherlv_9= '}' ) )
            // InternalDsl.g:433:2: ( () otherlv_1= 'Configuration' otherlv_2= '{' (otherlv_3= 'mappings' otherlv_4= '{' ( (lv_mappings_5_0= ruleMapping ) ) (otherlv_6= ',' ( (lv_mappings_7_0= ruleMapping ) ) )* otherlv_8= '}' )? otherlv_9= '}' )
            {
            // InternalDsl.g:433:2: ( () otherlv_1= 'Configuration' otherlv_2= '{' (otherlv_3= 'mappings' otherlv_4= '{' ( (lv_mappings_5_0= ruleMapping ) ) (otherlv_6= ',' ( (lv_mappings_7_0= ruleMapping ) ) )* otherlv_8= '}' )? otherlv_9= '}' )
            // InternalDsl.g:434:3: () otherlv_1= 'Configuration' otherlv_2= '{' (otherlv_3= 'mappings' otherlv_4= '{' ( (lv_mappings_5_0= ruleMapping ) ) (otherlv_6= ',' ( (lv_mappings_7_0= ruleMapping ) ) )* otherlv_8= '}' )? otherlv_9= '}'
            {
            // InternalDsl.g:434:3: ()
            // InternalDsl.g:435:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getConfigurationAccess().getConfigurationAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,17,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getConfigurationAccess().getConfigurationKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getConfigurationAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalDsl.g:449:3: (otherlv_3= 'mappings' otherlv_4= '{' ( (lv_mappings_5_0= ruleMapping ) ) (otherlv_6= ',' ( (lv_mappings_7_0= ruleMapping ) ) )* otherlv_8= '}' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==18) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalDsl.g:450:4: otherlv_3= 'mappings' otherlv_4= '{' ( (lv_mappings_5_0= ruleMapping ) ) (otherlv_6= ',' ( (lv_mappings_7_0= ruleMapping ) ) )* otherlv_8= '}'
                    {
                    otherlv_3=(Token)match(input,18,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getConfigurationAccess().getMappingsKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,12,FOLLOW_11); 

                    				newLeafNode(otherlv_4, grammarAccess.getConfigurationAccess().getLeftCurlyBracketKeyword_3_1());
                    			
                    // InternalDsl.g:458:4: ( (lv_mappings_5_0= ruleMapping ) )
                    // InternalDsl.g:459:5: (lv_mappings_5_0= ruleMapping )
                    {
                    // InternalDsl.g:459:5: (lv_mappings_5_0= ruleMapping )
                    // InternalDsl.g:460:6: lv_mappings_5_0= ruleMapping
                    {

                    						newCompositeNode(grammarAccess.getConfigurationAccess().getMappingsMappingParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_mappings_5_0=ruleMapping();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getConfigurationRule());
                    						}
                    						add(
                    							current,
                    							"mappings",
                    							lv_mappings_5_0,
                    							"org.framed.orm.editPolicy.model.dsl.Dsl.Mapping");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDsl.g:477:4: (otherlv_6= ',' ( (lv_mappings_7_0= ruleMapping ) ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==15) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalDsl.g:478:5: otherlv_6= ',' ( (lv_mappings_7_0= ruleMapping ) )
                    	    {
                    	    otherlv_6=(Token)match(input,15,FOLLOW_11); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getConfigurationAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalDsl.g:482:5: ( (lv_mappings_7_0= ruleMapping ) )
                    	    // InternalDsl.g:483:6: (lv_mappings_7_0= ruleMapping )
                    	    {
                    	    // InternalDsl.g:483:6: (lv_mappings_7_0= ruleMapping )
                    	    // InternalDsl.g:484:7: lv_mappings_7_0= ruleMapping
                    	    {

                    	    							newCompositeNode(grammarAccess.getConfigurationAccess().getMappingsMappingParserRuleCall_3_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_8);
                    	    lv_mappings_7_0=ruleMapping();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getConfigurationRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"mappings",
                    	    								lv_mappings_7_0,
                    	    								"org.framed.orm.editPolicy.model.dsl.Dsl.Mapping");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,16,FOLLOW_9); 

                    				newLeafNode(otherlv_8, grammarAccess.getConfigurationAccess().getRightCurlyBracketKeyword_3_4());
                    			

                    }
                    break;

            }

            otherlv_9=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getConfigurationAccess().getRightCurlyBracketKeyword_4());
            		

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
    // InternalDsl.g:515:1: entryRulePolicy returns [EObject current=null] : iv_rulePolicy= rulePolicy EOF ;
    public final EObject entryRulePolicy() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePolicy = null;


        try {
            // InternalDsl.g:515:47: (iv_rulePolicy= rulePolicy EOF )
            // InternalDsl.g:516:2: iv_rulePolicy= rulePolicy EOF
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
    // InternalDsl.g:522:1: rulePolicy returns [EObject current=null] : (otherlv_0= 'Policy' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_rule_3_0= ruleAbstractRule ) ) otherlv_4= '}' ) ;
    public final EObject rulePolicy() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_rule_3_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:528:2: ( (otherlv_0= 'Policy' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_rule_3_0= ruleAbstractRule ) ) otherlv_4= '}' ) )
            // InternalDsl.g:529:2: (otherlv_0= 'Policy' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_rule_3_0= ruleAbstractRule ) ) otherlv_4= '}' )
            {
            // InternalDsl.g:529:2: (otherlv_0= 'Policy' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_rule_3_0= ruleAbstractRule ) ) otherlv_4= '}' )
            // InternalDsl.g:530:3: otherlv_0= 'Policy' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_rule_3_0= ruleAbstractRule ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getPolicyAccess().getPolicyKeyword_0());
            		
            // InternalDsl.g:534:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDsl.g:535:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDsl.g:535:4: (lv_name_1_0= RULE_ID )
            // InternalDsl.g:536:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_3); 

            					newLeafNode(lv_name_1_0, grammarAccess.getPolicyAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPolicyRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_13); 

            			newLeafNode(otherlv_2, grammarAccess.getPolicyAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalDsl.g:556:3: ( (lv_rule_3_0= ruleAbstractRule ) )
            // InternalDsl.g:557:4: (lv_rule_3_0= ruleAbstractRule )
            {
            // InternalDsl.g:557:4: (lv_rule_3_0= ruleAbstractRule )
            // InternalDsl.g:558:5: lv_rule_3_0= ruleAbstractRule
            {

            					newCompositeNode(grammarAccess.getPolicyAccess().getRuleAbstractRuleParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_9);
            lv_rule_3_0=ruleAbstractRule();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPolicyRule());
            					}
            					set(
            						current,
            						"rule",
            						lv_rule_3_0,
            						"org.framed.orm.editPolicy.model.dsl.Dsl.AbstractRule");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getPolicyAccess().getRightCurlyBracketKeyword_4());
            		

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
    // InternalDsl.g:583:1: entryRuleMapping returns [EObject current=null] : iv_ruleMapping= ruleMapping EOF ;
    public final EObject entryRuleMapping() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMapping = null;


        try {
            // InternalDsl.g:583:48: (iv_ruleMapping= ruleMapping EOF )
            // InternalDsl.g:584:2: iv_ruleMapping= ruleMapping EOF
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
    // InternalDsl.g:590:1: ruleMapping returns [EObject current=null] : (otherlv_0= 'Mapping' otherlv_1= '{' otherlv_2= 'rule' ( ( (lv_rule_3_1= ruleAbstractMappingRule | lv_rule_3_2= ruleMappingExpression ) ) ) otherlv_4= 'policy' ( (otherlv_5= RULE_ID ) ) otherlv_6= '}' ) ;
    public final EObject ruleMapping() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        EObject lv_rule_3_1 = null;

        EObject lv_rule_3_2 = null;



        	enterRule();

        try {
            // InternalDsl.g:596:2: ( (otherlv_0= 'Mapping' otherlv_1= '{' otherlv_2= 'rule' ( ( (lv_rule_3_1= ruleAbstractMappingRule | lv_rule_3_2= ruleMappingExpression ) ) ) otherlv_4= 'policy' ( (otherlv_5= RULE_ID ) ) otherlv_6= '}' ) )
            // InternalDsl.g:597:2: (otherlv_0= 'Mapping' otherlv_1= '{' otherlv_2= 'rule' ( ( (lv_rule_3_1= ruleAbstractMappingRule | lv_rule_3_2= ruleMappingExpression ) ) ) otherlv_4= 'policy' ( (otherlv_5= RULE_ID ) ) otherlv_6= '}' )
            {
            // InternalDsl.g:597:2: (otherlv_0= 'Mapping' otherlv_1= '{' otherlv_2= 'rule' ( ( (lv_rule_3_1= ruleAbstractMappingRule | lv_rule_3_2= ruleMappingExpression ) ) ) otherlv_4= 'policy' ( (otherlv_5= RULE_ID ) ) otherlv_6= '}' )
            // InternalDsl.g:598:3: otherlv_0= 'Mapping' otherlv_1= '{' otherlv_2= 'rule' ( ( (lv_rule_3_1= ruleAbstractMappingRule | lv_rule_3_2= ruleMappingExpression ) ) ) otherlv_4= 'policy' ( (otherlv_5= RULE_ID ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getMappingAccess().getMappingKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getMappingAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,21,FOLLOW_15); 

            			newLeafNode(otherlv_2, grammarAccess.getMappingAccess().getRuleKeyword_2());
            		
            // InternalDsl.g:610:3: ( ( (lv_rule_3_1= ruleAbstractMappingRule | lv_rule_3_2= ruleMappingExpression ) ) )
            // InternalDsl.g:611:4: ( (lv_rule_3_1= ruleAbstractMappingRule | lv_rule_3_2= ruleMappingExpression ) )
            {
            // InternalDsl.g:611:4: ( (lv_rule_3_1= ruleAbstractMappingRule | lv_rule_3_2= ruleMappingExpression ) )
            // InternalDsl.g:612:5: (lv_rule_3_1= ruleAbstractMappingRule | lv_rule_3_2= ruleMappingExpression )
            {
            // InternalDsl.g:612:5: (lv_rule_3_1= ruleAbstractMappingRule | lv_rule_3_2= ruleMappingExpression )
            int alt7=2;
            alt7 = dfa7.predict(input);
            switch (alt7) {
                case 1 :
                    // InternalDsl.g:613:6: lv_rule_3_1= ruleAbstractMappingRule
                    {

                    						newCompositeNode(grammarAccess.getMappingAccess().getRuleAbstractMappingRuleParserRuleCall_3_0_0());
                    					
                    pushFollow(FOLLOW_16);
                    lv_rule_3_1=ruleAbstractMappingRule();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMappingRule());
                    						}
                    						set(
                    							current,
                    							"rule",
                    							lv_rule_3_1,
                    							"org.framed.orm.editPolicy.model.dsl.Dsl.AbstractMappingRule");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;
                case 2 :
                    // InternalDsl.g:629:6: lv_rule_3_2= ruleMappingExpression
                    {

                    						newCompositeNode(grammarAccess.getMappingAccess().getRuleMappingExpressionParserRuleCall_3_0_1());
                    					
                    pushFollow(FOLLOW_16);
                    lv_rule_3_2=ruleMappingExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMappingRule());
                    						}
                    						set(
                    							current,
                    							"rule",
                    							lv_rule_3_2,
                    							"org.framed.orm.editPolicy.model.dsl.Dsl.MappingExpression");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;

            }


            }


            }

            otherlv_4=(Token)match(input,22,FOLLOW_12); 

            			newLeafNode(otherlv_4, grammarAccess.getMappingAccess().getPolicyKeyword_4());
            		
            // InternalDsl.g:651:3: ( (otherlv_5= RULE_ID ) )
            // InternalDsl.g:652:4: (otherlv_5= RULE_ID )
            {
            // InternalDsl.g:652:4: (otherlv_5= RULE_ID )
            // InternalDsl.g:653:5: otherlv_5= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMappingRule());
            					}
            				
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(otherlv_5, grammarAccess.getMappingAccess().getPolicyPolicyCrossReference_5_0());
            				

            }


            }

            otherlv_6=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getMappingAccess().getRightCurlyBracketKeyword_6());
            		

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
    // InternalDsl.g:672:1: entryRuleFeatureNameMappingRule returns [EObject current=null] : iv_ruleFeatureNameMappingRule= ruleFeatureNameMappingRule EOF ;
    public final EObject entryRuleFeatureNameMappingRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeatureNameMappingRule = null;


        try {
            // InternalDsl.g:672:63: (iv_ruleFeatureNameMappingRule= ruleFeatureNameMappingRule EOF )
            // InternalDsl.g:673:2: iv_ruleFeatureNameMappingRule= ruleFeatureNameMappingRule EOF
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
    // InternalDsl.g:679:1: ruleFeatureNameMappingRule returns [EObject current=null] : ( () otherlv_1= 'FeatureNameMappingRule' ( (lv_name_2_0= ruleEString ) ) ) ;
    public final EObject ruleFeatureNameMappingRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:685:2: ( ( () otherlv_1= 'FeatureNameMappingRule' ( (lv_name_2_0= ruleEString ) ) ) )
            // InternalDsl.g:686:2: ( () otherlv_1= 'FeatureNameMappingRule' ( (lv_name_2_0= ruleEString ) ) )
            {
            // InternalDsl.g:686:2: ( () otherlv_1= 'FeatureNameMappingRule' ( (lv_name_2_0= ruleEString ) ) )
            // InternalDsl.g:687:3: () otherlv_1= 'FeatureNameMappingRule' ( (lv_name_2_0= ruleEString ) )
            {
            // InternalDsl.g:687:3: ()
            // InternalDsl.g:688:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getFeatureNameMappingRuleAccess().getFeatureNameMappingRuleAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,23,FOLLOW_17); 

            			newLeafNode(otherlv_1, grammarAccess.getFeatureNameMappingRuleAccess().getFeatureNameMappingRuleKeyword_1());
            		
            // InternalDsl.g:698:3: ( (lv_name_2_0= ruleEString ) )
            // InternalDsl.g:699:4: (lv_name_2_0= ruleEString )
            {
            // InternalDsl.g:699:4: (lv_name_2_0= ruleEString )
            // InternalDsl.g:700:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getFeatureNameMappingRuleAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFeatureNameMappingRuleRule());
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
    // $ANTLR end "ruleFeatureNameMappingRule"


    // $ANTLR start "entryRuleAndMappingRule"
    // InternalDsl.g:721:1: entryRuleAndMappingRule returns [EObject current=null] : iv_ruleAndMappingRule= ruleAndMappingRule EOF ;
    public final EObject entryRuleAndMappingRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAndMappingRule = null;


        try {
            // InternalDsl.g:721:55: (iv_ruleAndMappingRule= ruleAndMappingRule EOF )
            // InternalDsl.g:722:2: iv_ruleAndMappingRule= ruleAndMappingRule EOF
            {
             newCompositeNode(grammarAccess.getAndMappingRuleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAndMappingRule=ruleAndMappingRule();

            state._fsp--;

             current =iv_ruleAndMappingRule; 
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
    // $ANTLR end "entryRuleAndMappingRule"


    // $ANTLR start "ruleAndMappingRule"
    // InternalDsl.g:728:1: ruleAndMappingRule returns [EObject current=null] : (otherlv_0= 'AndMappingRule' otherlv_1= '{' ( (lv_rules_2_0= ruleAbstractMappingRule ) ) (otherlv_3= ',' ( (lv_rules_4_0= ruleAbstractMappingRule ) ) )* otherlv_5= '}' ) ;
    public final EObject ruleAndMappingRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_rules_2_0 = null;

        EObject lv_rules_4_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:734:2: ( (otherlv_0= 'AndMappingRule' otherlv_1= '{' ( (lv_rules_2_0= ruleAbstractMappingRule ) ) (otherlv_3= ',' ( (lv_rules_4_0= ruleAbstractMappingRule ) ) )* otherlv_5= '}' ) )
            // InternalDsl.g:735:2: (otherlv_0= 'AndMappingRule' otherlv_1= '{' ( (lv_rules_2_0= ruleAbstractMappingRule ) ) (otherlv_3= ',' ( (lv_rules_4_0= ruleAbstractMappingRule ) ) )* otherlv_5= '}' )
            {
            // InternalDsl.g:735:2: (otherlv_0= 'AndMappingRule' otherlv_1= '{' ( (lv_rules_2_0= ruleAbstractMappingRule ) ) (otherlv_3= ',' ( (lv_rules_4_0= ruleAbstractMappingRule ) ) )* otherlv_5= '}' )
            // InternalDsl.g:736:3: otherlv_0= 'AndMappingRule' otherlv_1= '{' ( (lv_rules_2_0= ruleAbstractMappingRule ) ) (otherlv_3= ',' ( (lv_rules_4_0= ruleAbstractMappingRule ) ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getAndMappingRuleAccess().getAndMappingRuleKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_18); 

            			newLeafNode(otherlv_1, grammarAccess.getAndMappingRuleAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalDsl.g:744:3: ( (lv_rules_2_0= ruleAbstractMappingRule ) )
            // InternalDsl.g:745:4: (lv_rules_2_0= ruleAbstractMappingRule )
            {
            // InternalDsl.g:745:4: (lv_rules_2_0= ruleAbstractMappingRule )
            // InternalDsl.g:746:5: lv_rules_2_0= ruleAbstractMappingRule
            {

            					newCompositeNode(grammarAccess.getAndMappingRuleAccess().getRulesAbstractMappingRuleParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_8);
            lv_rules_2_0=ruleAbstractMappingRule();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAndMappingRuleRule());
            					}
            					add(
            						current,
            						"rules",
            						lv_rules_2_0,
            						"org.framed.orm.editPolicy.model.dsl.Dsl.AbstractMappingRule");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDsl.g:763:3: (otherlv_3= ',' ( (lv_rules_4_0= ruleAbstractMappingRule ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==15) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalDsl.g:764:4: otherlv_3= ',' ( (lv_rules_4_0= ruleAbstractMappingRule ) )
            	    {
            	    otherlv_3=(Token)match(input,15,FOLLOW_18); 

            	    				newLeafNode(otherlv_3, grammarAccess.getAndMappingRuleAccess().getCommaKeyword_3_0());
            	    			
            	    // InternalDsl.g:768:4: ( (lv_rules_4_0= ruleAbstractMappingRule ) )
            	    // InternalDsl.g:769:5: (lv_rules_4_0= ruleAbstractMappingRule )
            	    {
            	    // InternalDsl.g:769:5: (lv_rules_4_0= ruleAbstractMappingRule )
            	    // InternalDsl.g:770:6: lv_rules_4_0= ruleAbstractMappingRule
            	    {

            	    						newCompositeNode(grammarAccess.getAndMappingRuleAccess().getRulesAbstractMappingRuleParserRuleCall_3_1_0());
            	    					
            	    pushFollow(FOLLOW_8);
            	    lv_rules_4_0=ruleAbstractMappingRule();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getAndMappingRuleRule());
            	    						}
            	    						add(
            	    							current,
            	    							"rules",
            	    							lv_rules_4_0,
            	    							"org.framed.orm.editPolicy.model.dsl.Dsl.AbstractMappingRule");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            otherlv_5=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getAndMappingRuleAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleAndMappingRule"


    // $ANTLR start "entryRuleNotMappingRule"
    // InternalDsl.g:796:1: entryRuleNotMappingRule returns [EObject current=null] : iv_ruleNotMappingRule= ruleNotMappingRule EOF ;
    public final EObject entryRuleNotMappingRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNotMappingRule = null;


        try {
            // InternalDsl.g:796:55: (iv_ruleNotMappingRule= ruleNotMappingRule EOF )
            // InternalDsl.g:797:2: iv_ruleNotMappingRule= ruleNotMappingRule EOF
            {
             newCompositeNode(grammarAccess.getNotMappingRuleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNotMappingRule=ruleNotMappingRule();

            state._fsp--;

             current =iv_ruleNotMappingRule; 
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
    // $ANTLR end "entryRuleNotMappingRule"


    // $ANTLR start "ruleNotMappingRule"
    // InternalDsl.g:803:1: ruleNotMappingRule returns [EObject current=null] : (otherlv_0= '!' ( (lv_rule_1_0= ruleAbstractMappingRule ) ) ) ;
    public final EObject ruleNotMappingRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_rule_1_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:809:2: ( (otherlv_0= '!' ( (lv_rule_1_0= ruleAbstractMappingRule ) ) ) )
            // InternalDsl.g:810:2: (otherlv_0= '!' ( (lv_rule_1_0= ruleAbstractMappingRule ) ) )
            {
            // InternalDsl.g:810:2: (otherlv_0= '!' ( (lv_rule_1_0= ruleAbstractMappingRule ) ) )
            // InternalDsl.g:811:3: otherlv_0= '!' ( (lv_rule_1_0= ruleAbstractMappingRule ) )
            {
            otherlv_0=(Token)match(input,25,FOLLOW_18); 

            			newLeafNode(otherlv_0, grammarAccess.getNotMappingRuleAccess().getExclamationMarkKeyword_0());
            		
            // InternalDsl.g:815:3: ( (lv_rule_1_0= ruleAbstractMappingRule ) )
            // InternalDsl.g:816:4: (lv_rule_1_0= ruleAbstractMappingRule )
            {
            // InternalDsl.g:816:4: (lv_rule_1_0= ruleAbstractMappingRule )
            // InternalDsl.g:817:5: lv_rule_1_0= ruleAbstractMappingRule
            {

            					newCompositeNode(grammarAccess.getNotMappingRuleAccess().getRuleAbstractMappingRuleParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_rule_1_0=ruleAbstractMappingRule();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNotMappingRuleRule());
            					}
            					set(
            						current,
            						"rule",
            						lv_rule_1_0,
            						"org.framed.orm.editPolicy.model.dsl.Dsl.AbstractMappingRule");
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
    // $ANTLR end "ruleNotMappingRule"


    // $ANTLR start "entryRuleOrMappingRule"
    // InternalDsl.g:838:1: entryRuleOrMappingRule returns [EObject current=null] : iv_ruleOrMappingRule= ruleOrMappingRule EOF ;
    public final EObject entryRuleOrMappingRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrMappingRule = null;


        try {
            // InternalDsl.g:838:54: (iv_ruleOrMappingRule= ruleOrMappingRule EOF )
            // InternalDsl.g:839:2: iv_ruleOrMappingRule= ruleOrMappingRule EOF
            {
             newCompositeNode(grammarAccess.getOrMappingRuleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOrMappingRule=ruleOrMappingRule();

            state._fsp--;

             current =iv_ruleOrMappingRule; 
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
    // $ANTLR end "entryRuleOrMappingRule"


    // $ANTLR start "ruleOrMappingRule"
    // InternalDsl.g:845:1: ruleOrMappingRule returns [EObject current=null] : (otherlv_0= 'OrMappingRule' otherlv_1= '{' ( (lv_rules_2_0= ruleAbstractMappingRule ) ) (otherlv_3= ',' ( (lv_rules_4_0= ruleAbstractMappingRule ) ) )* otherlv_5= '}' ) ;
    public final EObject ruleOrMappingRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_rules_2_0 = null;

        EObject lv_rules_4_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:851:2: ( (otherlv_0= 'OrMappingRule' otherlv_1= '{' ( (lv_rules_2_0= ruleAbstractMappingRule ) ) (otherlv_3= ',' ( (lv_rules_4_0= ruleAbstractMappingRule ) ) )* otherlv_5= '}' ) )
            // InternalDsl.g:852:2: (otherlv_0= 'OrMappingRule' otherlv_1= '{' ( (lv_rules_2_0= ruleAbstractMappingRule ) ) (otherlv_3= ',' ( (lv_rules_4_0= ruleAbstractMappingRule ) ) )* otherlv_5= '}' )
            {
            // InternalDsl.g:852:2: (otherlv_0= 'OrMappingRule' otherlv_1= '{' ( (lv_rules_2_0= ruleAbstractMappingRule ) ) (otherlv_3= ',' ( (lv_rules_4_0= ruleAbstractMappingRule ) ) )* otherlv_5= '}' )
            // InternalDsl.g:853:3: otherlv_0= 'OrMappingRule' otherlv_1= '{' ( (lv_rules_2_0= ruleAbstractMappingRule ) ) (otherlv_3= ',' ( (lv_rules_4_0= ruleAbstractMappingRule ) ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,26,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getOrMappingRuleAccess().getOrMappingRuleKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_18); 

            			newLeafNode(otherlv_1, grammarAccess.getOrMappingRuleAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalDsl.g:861:3: ( (lv_rules_2_0= ruleAbstractMappingRule ) )
            // InternalDsl.g:862:4: (lv_rules_2_0= ruleAbstractMappingRule )
            {
            // InternalDsl.g:862:4: (lv_rules_2_0= ruleAbstractMappingRule )
            // InternalDsl.g:863:5: lv_rules_2_0= ruleAbstractMappingRule
            {

            					newCompositeNode(grammarAccess.getOrMappingRuleAccess().getRulesAbstractMappingRuleParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_8);
            lv_rules_2_0=ruleAbstractMappingRule();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOrMappingRuleRule());
            					}
            					add(
            						current,
            						"rules",
            						lv_rules_2_0,
            						"org.framed.orm.editPolicy.model.dsl.Dsl.AbstractMappingRule");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDsl.g:880:3: (otherlv_3= ',' ( (lv_rules_4_0= ruleAbstractMappingRule ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==15) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalDsl.g:881:4: otherlv_3= ',' ( (lv_rules_4_0= ruleAbstractMappingRule ) )
            	    {
            	    otherlv_3=(Token)match(input,15,FOLLOW_18); 

            	    				newLeafNode(otherlv_3, grammarAccess.getOrMappingRuleAccess().getCommaKeyword_3_0());
            	    			
            	    // InternalDsl.g:885:4: ( (lv_rules_4_0= ruleAbstractMappingRule ) )
            	    // InternalDsl.g:886:5: (lv_rules_4_0= ruleAbstractMappingRule )
            	    {
            	    // InternalDsl.g:886:5: (lv_rules_4_0= ruleAbstractMappingRule )
            	    // InternalDsl.g:887:6: lv_rules_4_0= ruleAbstractMappingRule
            	    {

            	    						newCompositeNode(grammarAccess.getOrMappingRuleAccess().getRulesAbstractMappingRuleParserRuleCall_3_1_0());
            	    					
            	    pushFollow(FOLLOW_8);
            	    lv_rules_4_0=ruleAbstractMappingRule();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getOrMappingRuleRule());
            	    						}
            	    						add(
            	    							current,
            	    							"rules",
            	    							lv_rules_4_0,
            	    							"org.framed.orm.editPolicy.model.dsl.Dsl.AbstractMappingRule");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            otherlv_5=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getOrMappingRuleAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleOrMappingRule"


    // $ANTLR start "entryRuleImplicationMappingRule"
    // InternalDsl.g:913:1: entryRuleImplicationMappingRule returns [EObject current=null] : iv_ruleImplicationMappingRule= ruleImplicationMappingRule EOF ;
    public final EObject entryRuleImplicationMappingRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImplicationMappingRule = null;


        try {
            // InternalDsl.g:913:63: (iv_ruleImplicationMappingRule= ruleImplicationMappingRule EOF )
            // InternalDsl.g:914:2: iv_ruleImplicationMappingRule= ruleImplicationMappingRule EOF
            {
             newCompositeNode(grammarAccess.getImplicationMappingRuleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleImplicationMappingRule=ruleImplicationMappingRule();

            state._fsp--;

             current =iv_ruleImplicationMappingRule; 
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
    // $ANTLR end "entryRuleImplicationMappingRule"


    // $ANTLR start "ruleImplicationMappingRule"
    // InternalDsl.g:920:1: ruleImplicationMappingRule returns [EObject current=null] : (otherlv_0= 'ImplicationMappingRule' otherlv_1= '{' otherlv_2= 'if' ( (lv_antecedent_3_0= ruleAbstractMappingRule ) ) otherlv_4= 'then' ( (lv_consequent_5_0= ruleAbstractMappingRule ) ) otherlv_6= '}' ) ;
    public final EObject ruleImplicationMappingRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_antecedent_3_0 = null;

        EObject lv_consequent_5_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:926:2: ( (otherlv_0= 'ImplicationMappingRule' otherlv_1= '{' otherlv_2= 'if' ( (lv_antecedent_3_0= ruleAbstractMappingRule ) ) otherlv_4= 'then' ( (lv_consequent_5_0= ruleAbstractMappingRule ) ) otherlv_6= '}' ) )
            // InternalDsl.g:927:2: (otherlv_0= 'ImplicationMappingRule' otherlv_1= '{' otherlv_2= 'if' ( (lv_antecedent_3_0= ruleAbstractMappingRule ) ) otherlv_4= 'then' ( (lv_consequent_5_0= ruleAbstractMappingRule ) ) otherlv_6= '}' )
            {
            // InternalDsl.g:927:2: (otherlv_0= 'ImplicationMappingRule' otherlv_1= '{' otherlv_2= 'if' ( (lv_antecedent_3_0= ruleAbstractMappingRule ) ) otherlv_4= 'then' ( (lv_consequent_5_0= ruleAbstractMappingRule ) ) otherlv_6= '}' )
            // InternalDsl.g:928:3: otherlv_0= 'ImplicationMappingRule' otherlv_1= '{' otherlv_2= 'if' ( (lv_antecedent_3_0= ruleAbstractMappingRule ) ) otherlv_4= 'then' ( (lv_consequent_5_0= ruleAbstractMappingRule ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,27,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getImplicationMappingRuleAccess().getImplicationMappingRuleKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_19); 

            			newLeafNode(otherlv_1, grammarAccess.getImplicationMappingRuleAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,28,FOLLOW_18); 

            			newLeafNode(otherlv_2, grammarAccess.getImplicationMappingRuleAccess().getIfKeyword_2());
            		
            // InternalDsl.g:940:3: ( (lv_antecedent_3_0= ruleAbstractMappingRule ) )
            // InternalDsl.g:941:4: (lv_antecedent_3_0= ruleAbstractMappingRule )
            {
            // InternalDsl.g:941:4: (lv_antecedent_3_0= ruleAbstractMappingRule )
            // InternalDsl.g:942:5: lv_antecedent_3_0= ruleAbstractMappingRule
            {

            					newCompositeNode(grammarAccess.getImplicationMappingRuleAccess().getAntecedentAbstractMappingRuleParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_20);
            lv_antecedent_3_0=ruleAbstractMappingRule();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getImplicationMappingRuleRule());
            					}
            					set(
            						current,
            						"antecedent",
            						lv_antecedent_3_0,
            						"org.framed.orm.editPolicy.model.dsl.Dsl.AbstractMappingRule");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,29,FOLLOW_18); 

            			newLeafNode(otherlv_4, grammarAccess.getImplicationMappingRuleAccess().getThenKeyword_4());
            		
            // InternalDsl.g:963:3: ( (lv_consequent_5_0= ruleAbstractMappingRule ) )
            // InternalDsl.g:964:4: (lv_consequent_5_0= ruleAbstractMappingRule )
            {
            // InternalDsl.g:964:4: (lv_consequent_5_0= ruleAbstractMappingRule )
            // InternalDsl.g:965:5: lv_consequent_5_0= ruleAbstractMappingRule
            {

            					newCompositeNode(grammarAccess.getImplicationMappingRuleAccess().getConsequentAbstractMappingRuleParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_9);
            lv_consequent_5_0=ruleAbstractMappingRule();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getImplicationMappingRuleRule());
            					}
            					set(
            						current,
            						"consequent",
            						lv_consequent_5_0,
            						"org.framed.orm.editPolicy.model.dsl.Dsl.AbstractMappingRule");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getImplicationMappingRuleAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleImplicationMappingRule"


    // $ANTLR start "entryRuleTrueMappingRule"
    // InternalDsl.g:990:1: entryRuleTrueMappingRule returns [EObject current=null] : iv_ruleTrueMappingRule= ruleTrueMappingRule EOF ;
    public final EObject entryRuleTrueMappingRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTrueMappingRule = null;


        try {
            // InternalDsl.g:990:56: (iv_ruleTrueMappingRule= ruleTrueMappingRule EOF )
            // InternalDsl.g:991:2: iv_ruleTrueMappingRule= ruleTrueMappingRule EOF
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
    // InternalDsl.g:997:1: ruleTrueMappingRule returns [EObject current=null] : ( () otherlv_1= 'TrueMappingRule' ) ;
    public final EObject ruleTrueMappingRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalDsl.g:1003:2: ( ( () otherlv_1= 'TrueMappingRule' ) )
            // InternalDsl.g:1004:2: ( () otherlv_1= 'TrueMappingRule' )
            {
            // InternalDsl.g:1004:2: ( () otherlv_1= 'TrueMappingRule' )
            // InternalDsl.g:1005:3: () otherlv_1= 'TrueMappingRule'
            {
            // InternalDsl.g:1005:3: ()
            // InternalDsl.g:1006:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTrueMappingRuleAccess().getTrueMappingRuleAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,30,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getTrueMappingRuleAccess().getTrueMappingRuleKeyword_1());
            		

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
    // InternalDsl.g:1020:1: entryRuleRelationIsCyclicRule returns [EObject current=null] : iv_ruleRelationIsCyclicRule= ruleRelationIsCyclicRule EOF ;
    public final EObject entryRuleRelationIsCyclicRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelationIsCyclicRule = null;


        try {
            // InternalDsl.g:1020:61: (iv_ruleRelationIsCyclicRule= ruleRelationIsCyclicRule EOF )
            // InternalDsl.g:1021:2: iv_ruleRelationIsCyclicRule= ruleRelationIsCyclicRule EOF
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
    // InternalDsl.g:1027:1: ruleRelationIsCyclicRule returns [EObject current=null] : ( () otherlv_1= 'RelationIsCyclicRule' ) ;
    public final EObject ruleRelationIsCyclicRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalDsl.g:1033:2: ( ( () otherlv_1= 'RelationIsCyclicRule' ) )
            // InternalDsl.g:1034:2: ( () otherlv_1= 'RelationIsCyclicRule' )
            {
            // InternalDsl.g:1034:2: ( () otherlv_1= 'RelationIsCyclicRule' )
            // InternalDsl.g:1035:3: () otherlv_1= 'RelationIsCyclicRule'
            {
            // InternalDsl.g:1035:3: ()
            // InternalDsl.g:1036:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRelationIsCyclicRuleAccess().getRelationIsCyclicRuleAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,31,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getRelationIsCyclicRuleAccess().getRelationIsCyclicRuleKeyword_1());
            		

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
    // InternalDsl.g:1050:1: entryRuleRelationTypesAreEqualRule returns [EObject current=null] : iv_ruleRelationTypesAreEqualRule= ruleRelationTypesAreEqualRule EOF ;
    public final EObject entryRuleRelationTypesAreEqualRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelationTypesAreEqualRule = null;


        try {
            // InternalDsl.g:1050:66: (iv_ruleRelationTypesAreEqualRule= ruleRelationTypesAreEqualRule EOF )
            // InternalDsl.g:1051:2: iv_ruleRelationTypesAreEqualRule= ruleRelationTypesAreEqualRule EOF
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
    // InternalDsl.g:1057:1: ruleRelationTypesAreEqualRule returns [EObject current=null] : ( () otherlv_1= 'RelationTypesAreEqualRule' ) ;
    public final EObject ruleRelationTypesAreEqualRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalDsl.g:1063:2: ( ( () otherlv_1= 'RelationTypesAreEqualRule' ) )
            // InternalDsl.g:1064:2: ( () otherlv_1= 'RelationTypesAreEqualRule' )
            {
            // InternalDsl.g:1064:2: ( () otherlv_1= 'RelationTypesAreEqualRule' )
            // InternalDsl.g:1065:3: () otherlv_1= 'RelationTypesAreEqualRule'
            {
            // InternalDsl.g:1065:3: ()
            // InternalDsl.g:1066:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRelationTypesAreEqualRuleAccess().getRelationTypesAreEqualRuleAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,32,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getRelationTypesAreEqualRuleAccess().getRelationTypesAreEqualRuleKeyword_1());
            		

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
    // InternalDsl.g:1080:1: entryRuleRelationIsReflexivRule returns [EObject current=null] : iv_ruleRelationIsReflexivRule= ruleRelationIsReflexivRule EOF ;
    public final EObject entryRuleRelationIsReflexivRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelationIsReflexivRule = null;


        try {
            // InternalDsl.g:1080:63: (iv_ruleRelationIsReflexivRule= ruleRelationIsReflexivRule EOF )
            // InternalDsl.g:1081:2: iv_ruleRelationIsReflexivRule= ruleRelationIsReflexivRule EOF
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
    // InternalDsl.g:1087:1: ruleRelationIsReflexivRule returns [EObject current=null] : ( () otherlv_1= 'RelationIsReflexivRule' ) ;
    public final EObject ruleRelationIsReflexivRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalDsl.g:1093:2: ( ( () otherlv_1= 'RelationIsReflexivRule' ) )
            // InternalDsl.g:1094:2: ( () otherlv_1= 'RelationIsReflexivRule' )
            {
            // InternalDsl.g:1094:2: ( () otherlv_1= 'RelationIsReflexivRule' )
            // InternalDsl.g:1095:3: () otherlv_1= 'RelationIsReflexivRule'
            {
            // InternalDsl.g:1095:3: ()
            // InternalDsl.g:1096:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRelationIsReflexivRuleAccess().getRelationIsReflexivRuleAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,33,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getRelationIsReflexivRuleAccess().getRelationIsReflexivRuleKeyword_1());
            		

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
    // InternalDsl.g:1110:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalDsl.g:1110:47: (iv_ruleEString= ruleEString EOF )
            // InternalDsl.g:1111:2: iv_ruleEString= ruleEString EOF
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
    // InternalDsl.g:1117:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalDsl.g:1123:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalDsl.g:1124:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalDsl.g:1124:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_STRING) ) {
                alt10=1;
            }
            else if ( (LA10_0==RULE_ID) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalDsl.g:1125:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalDsl.g:1133:3: this_ID_1= RULE_ID
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


    // $ANTLR start "entryRuleAndRule"
    // InternalDsl.g:1144:1: entryRuleAndRule returns [EObject current=null] : iv_ruleAndRule= ruleAndRule EOF ;
    public final EObject entryRuleAndRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAndRule = null;


        try {
            // InternalDsl.g:1144:48: (iv_ruleAndRule= ruleAndRule EOF )
            // InternalDsl.g:1145:2: iv_ruleAndRule= ruleAndRule EOF
            {
             newCompositeNode(grammarAccess.getAndRuleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAndRule=ruleAndRule();

            state._fsp--;

             current =iv_ruleAndRule; 
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
    // $ANTLR end "entryRuleAndRule"


    // $ANTLR start "ruleAndRule"
    // InternalDsl.g:1151:1: ruleAndRule returns [EObject current=null] : (otherlv_0= 'AndRule' otherlv_1= '{' ( (lv_rules_2_0= ruleAbstractRule ) ) (otherlv_3= ',' ( (lv_rules_4_0= ruleAbstractRule ) ) )* otherlv_5= '}' ) ;
    public final EObject ruleAndRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_rules_2_0 = null;

        EObject lv_rules_4_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:1157:2: ( (otherlv_0= 'AndRule' otherlv_1= '{' ( (lv_rules_2_0= ruleAbstractRule ) ) (otherlv_3= ',' ( (lv_rules_4_0= ruleAbstractRule ) ) )* otherlv_5= '}' ) )
            // InternalDsl.g:1158:2: (otherlv_0= 'AndRule' otherlv_1= '{' ( (lv_rules_2_0= ruleAbstractRule ) ) (otherlv_3= ',' ( (lv_rules_4_0= ruleAbstractRule ) ) )* otherlv_5= '}' )
            {
            // InternalDsl.g:1158:2: (otherlv_0= 'AndRule' otherlv_1= '{' ( (lv_rules_2_0= ruleAbstractRule ) ) (otherlv_3= ',' ( (lv_rules_4_0= ruleAbstractRule ) ) )* otherlv_5= '}' )
            // InternalDsl.g:1159:3: otherlv_0= 'AndRule' otherlv_1= '{' ( (lv_rules_2_0= ruleAbstractRule ) ) (otherlv_3= ',' ( (lv_rules_4_0= ruleAbstractRule ) ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,34,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getAndRuleAccess().getAndRuleKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getAndRuleAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalDsl.g:1167:3: ( (lv_rules_2_0= ruleAbstractRule ) )
            // InternalDsl.g:1168:4: (lv_rules_2_0= ruleAbstractRule )
            {
            // InternalDsl.g:1168:4: (lv_rules_2_0= ruleAbstractRule )
            // InternalDsl.g:1169:5: lv_rules_2_0= ruleAbstractRule
            {

            					newCompositeNode(grammarAccess.getAndRuleAccess().getRulesAbstractRuleParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_8);
            lv_rules_2_0=ruleAbstractRule();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAndRuleRule());
            					}
            					add(
            						current,
            						"rules",
            						lv_rules_2_0,
            						"org.framed.orm.editPolicy.model.dsl.Dsl.AbstractRule");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDsl.g:1186:3: (otherlv_3= ',' ( (lv_rules_4_0= ruleAbstractRule ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==15) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalDsl.g:1187:4: otherlv_3= ',' ( (lv_rules_4_0= ruleAbstractRule ) )
            	    {
            	    otherlv_3=(Token)match(input,15,FOLLOW_13); 

            	    				newLeafNode(otherlv_3, grammarAccess.getAndRuleAccess().getCommaKeyword_3_0());
            	    			
            	    // InternalDsl.g:1191:4: ( (lv_rules_4_0= ruleAbstractRule ) )
            	    // InternalDsl.g:1192:5: (lv_rules_4_0= ruleAbstractRule )
            	    {
            	    // InternalDsl.g:1192:5: (lv_rules_4_0= ruleAbstractRule )
            	    // InternalDsl.g:1193:6: lv_rules_4_0= ruleAbstractRule
            	    {

            	    						newCompositeNode(grammarAccess.getAndRuleAccess().getRulesAbstractRuleParserRuleCall_3_1_0());
            	    					
            	    pushFollow(FOLLOW_8);
            	    lv_rules_4_0=ruleAbstractRule();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getAndRuleRule());
            	    						}
            	    						add(
            	    							current,
            	    							"rules",
            	    							lv_rules_4_0,
            	    							"org.framed.orm.editPolicy.model.dsl.Dsl.AbstractRule");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            otherlv_5=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getAndRuleAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleAndRule"


    // $ANTLR start "entryRuleRelationNameRule"
    // InternalDsl.g:1219:1: entryRuleRelationNameRule returns [EObject current=null] : iv_ruleRelationNameRule= ruleRelationNameRule EOF ;
    public final EObject entryRuleRelationNameRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelationNameRule = null;


        try {
            // InternalDsl.g:1219:57: (iv_ruleRelationNameRule= ruleRelationNameRule EOF )
            // InternalDsl.g:1220:2: iv_ruleRelationNameRule= ruleRelationNameRule EOF
            {
             newCompositeNode(grammarAccess.getRelationNameRuleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRelationNameRule=ruleRelationNameRule();

            state._fsp--;

             current =iv_ruleRelationNameRule; 
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
    // $ANTLR end "entryRuleRelationNameRule"


    // $ANTLR start "ruleRelationNameRule"
    // InternalDsl.g:1226:1: ruleRelationNameRule returns [EObject current=null] : ( () otherlv_1= 'RelationNameRule' ( (lv_name_2_0= ruleEString ) ) ) ;
    public final EObject ruleRelationNameRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:1232:2: ( ( () otherlv_1= 'RelationNameRule' ( (lv_name_2_0= ruleEString ) ) ) )
            // InternalDsl.g:1233:2: ( () otherlv_1= 'RelationNameRule' ( (lv_name_2_0= ruleEString ) ) )
            {
            // InternalDsl.g:1233:2: ( () otherlv_1= 'RelationNameRule' ( (lv_name_2_0= ruleEString ) ) )
            // InternalDsl.g:1234:3: () otherlv_1= 'RelationNameRule' ( (lv_name_2_0= ruleEString ) )
            {
            // InternalDsl.g:1234:3: ()
            // InternalDsl.g:1235:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRelationNameRuleAccess().getRelationNameRuleAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,35,FOLLOW_17); 

            			newLeafNode(otherlv_1, grammarAccess.getRelationNameRuleAccess().getRelationNameRuleKeyword_1());
            		
            // InternalDsl.g:1245:3: ( (lv_name_2_0= ruleEString ) )
            // InternalDsl.g:1246:4: (lv_name_2_0= ruleEString )
            {
            // InternalDsl.g:1246:4: (lv_name_2_0= ruleEString )
            // InternalDsl.g:1247:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getRelationNameRuleAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRelationNameRuleRule());
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
    // $ANTLR end "ruleRelationNameRule"


    // $ANTLR start "entryRuleOrRule"
    // InternalDsl.g:1268:1: entryRuleOrRule returns [EObject current=null] : iv_ruleOrRule= ruleOrRule EOF ;
    public final EObject entryRuleOrRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrRule = null;


        try {
            // InternalDsl.g:1268:47: (iv_ruleOrRule= ruleOrRule EOF )
            // InternalDsl.g:1269:2: iv_ruleOrRule= ruleOrRule EOF
            {
             newCompositeNode(grammarAccess.getOrRuleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOrRule=ruleOrRule();

            state._fsp--;

             current =iv_ruleOrRule; 
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
    // $ANTLR end "entryRuleOrRule"


    // $ANTLR start "ruleOrRule"
    // InternalDsl.g:1275:1: ruleOrRule returns [EObject current=null] : (otherlv_0= 'OrRule' otherlv_1= '{' ( (lv_rules_2_0= ruleAbstractRule ) ) (otherlv_3= ',' ( (lv_rules_4_0= ruleAbstractRule ) ) )* otherlv_5= '}' ) ;
    public final EObject ruleOrRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_rules_2_0 = null;

        EObject lv_rules_4_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:1281:2: ( (otherlv_0= 'OrRule' otherlv_1= '{' ( (lv_rules_2_0= ruleAbstractRule ) ) (otherlv_3= ',' ( (lv_rules_4_0= ruleAbstractRule ) ) )* otherlv_5= '}' ) )
            // InternalDsl.g:1282:2: (otherlv_0= 'OrRule' otherlv_1= '{' ( (lv_rules_2_0= ruleAbstractRule ) ) (otherlv_3= ',' ( (lv_rules_4_0= ruleAbstractRule ) ) )* otherlv_5= '}' )
            {
            // InternalDsl.g:1282:2: (otherlv_0= 'OrRule' otherlv_1= '{' ( (lv_rules_2_0= ruleAbstractRule ) ) (otherlv_3= ',' ( (lv_rules_4_0= ruleAbstractRule ) ) )* otherlv_5= '}' )
            // InternalDsl.g:1283:3: otherlv_0= 'OrRule' otherlv_1= '{' ( (lv_rules_2_0= ruleAbstractRule ) ) (otherlv_3= ',' ( (lv_rules_4_0= ruleAbstractRule ) ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,36,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getOrRuleAccess().getOrRuleKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getOrRuleAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalDsl.g:1291:3: ( (lv_rules_2_0= ruleAbstractRule ) )
            // InternalDsl.g:1292:4: (lv_rules_2_0= ruleAbstractRule )
            {
            // InternalDsl.g:1292:4: (lv_rules_2_0= ruleAbstractRule )
            // InternalDsl.g:1293:5: lv_rules_2_0= ruleAbstractRule
            {

            					newCompositeNode(grammarAccess.getOrRuleAccess().getRulesAbstractRuleParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_8);
            lv_rules_2_0=ruleAbstractRule();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOrRuleRule());
            					}
            					add(
            						current,
            						"rules",
            						lv_rules_2_0,
            						"org.framed.orm.editPolicy.model.dsl.Dsl.AbstractRule");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDsl.g:1310:3: (otherlv_3= ',' ( (lv_rules_4_0= ruleAbstractRule ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==15) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalDsl.g:1311:4: otherlv_3= ',' ( (lv_rules_4_0= ruleAbstractRule ) )
            	    {
            	    otherlv_3=(Token)match(input,15,FOLLOW_13); 

            	    				newLeafNode(otherlv_3, grammarAccess.getOrRuleAccess().getCommaKeyword_3_0());
            	    			
            	    // InternalDsl.g:1315:4: ( (lv_rules_4_0= ruleAbstractRule ) )
            	    // InternalDsl.g:1316:5: (lv_rules_4_0= ruleAbstractRule )
            	    {
            	    // InternalDsl.g:1316:5: (lv_rules_4_0= ruleAbstractRule )
            	    // InternalDsl.g:1317:6: lv_rules_4_0= ruleAbstractRule
            	    {

            	    						newCompositeNode(grammarAccess.getOrRuleAccess().getRulesAbstractRuleParserRuleCall_3_1_0());
            	    					
            	    pushFollow(FOLLOW_8);
            	    lv_rules_4_0=ruleAbstractRule();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getOrRuleRule());
            	    						}
            	    						add(
            	    							current,
            	    							"rules",
            	    							lv_rules_4_0,
            	    							"org.framed.orm.editPolicy.model.dsl.Dsl.AbstractRule");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            otherlv_5=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getOrRuleAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleOrRule"


    // $ANTLR start "entryRuleNotRule"
    // InternalDsl.g:1343:1: entryRuleNotRule returns [EObject current=null] : iv_ruleNotRule= ruleNotRule EOF ;
    public final EObject entryRuleNotRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNotRule = null;


        try {
            // InternalDsl.g:1343:48: (iv_ruleNotRule= ruleNotRule EOF )
            // InternalDsl.g:1344:2: iv_ruleNotRule= ruleNotRule EOF
            {
             newCompositeNode(grammarAccess.getNotRuleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNotRule=ruleNotRule();

            state._fsp--;

             current =iv_ruleNotRule; 
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
    // $ANTLR end "entryRuleNotRule"


    // $ANTLR start "ruleNotRule"
    // InternalDsl.g:1350:1: ruleNotRule returns [EObject current=null] : (otherlv_0= 'NotRule' otherlv_1= '{' ( (lv_rule_2_0= ruleAbstractRule ) ) otherlv_3= '}' ) ;
    public final EObject ruleNotRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_rule_2_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:1356:2: ( (otherlv_0= 'NotRule' otherlv_1= '{' ( (lv_rule_2_0= ruleAbstractRule ) ) otherlv_3= '}' ) )
            // InternalDsl.g:1357:2: (otherlv_0= 'NotRule' otherlv_1= '{' ( (lv_rule_2_0= ruleAbstractRule ) ) otherlv_3= '}' )
            {
            // InternalDsl.g:1357:2: (otherlv_0= 'NotRule' otherlv_1= '{' ( (lv_rule_2_0= ruleAbstractRule ) ) otherlv_3= '}' )
            // InternalDsl.g:1358:3: otherlv_0= 'NotRule' otherlv_1= '{' ( (lv_rule_2_0= ruleAbstractRule ) ) otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,37,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getNotRuleAccess().getNotRuleKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getNotRuleAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalDsl.g:1366:3: ( (lv_rule_2_0= ruleAbstractRule ) )
            // InternalDsl.g:1367:4: (lv_rule_2_0= ruleAbstractRule )
            {
            // InternalDsl.g:1367:4: (lv_rule_2_0= ruleAbstractRule )
            // InternalDsl.g:1368:5: lv_rule_2_0= ruleAbstractRule
            {

            					newCompositeNode(grammarAccess.getNotRuleAccess().getRuleAbstractRuleParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_9);
            lv_rule_2_0=ruleAbstractRule();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNotRuleRule());
            					}
            					set(
            						current,
            						"rule",
            						lv_rule_2_0,
            						"org.framed.orm.editPolicy.model.dsl.Dsl.AbstractRule");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getNotRuleAccess().getRightCurlyBracketKeyword_3());
            		

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
    // $ANTLR end "ruleNotRule"


    // $ANTLR start "entryRuleImplicationRule"
    // InternalDsl.g:1393:1: entryRuleImplicationRule returns [EObject current=null] : iv_ruleImplicationRule= ruleImplicationRule EOF ;
    public final EObject entryRuleImplicationRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImplicationRule = null;


        try {
            // InternalDsl.g:1393:56: (iv_ruleImplicationRule= ruleImplicationRule EOF )
            // InternalDsl.g:1394:2: iv_ruleImplicationRule= ruleImplicationRule EOF
            {
             newCompositeNode(grammarAccess.getImplicationRuleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleImplicationRule=ruleImplicationRule();

            state._fsp--;

             current =iv_ruleImplicationRule; 
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
    // $ANTLR end "entryRuleImplicationRule"


    // $ANTLR start "ruleImplicationRule"
    // InternalDsl.g:1400:1: ruleImplicationRule returns [EObject current=null] : (otherlv_0= 'ImplicationRule' otherlv_1= '{' otherlv_2= 'if' ( (lv_antecedent_3_0= ruleAbstractRule ) ) otherlv_4= 'then' ( (lv_consequent_5_0= ruleAbstractRule ) ) otherlv_6= '}' ) ;
    public final EObject ruleImplicationRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_antecedent_3_0 = null;

        EObject lv_consequent_5_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:1406:2: ( (otherlv_0= 'ImplicationRule' otherlv_1= '{' otherlv_2= 'if' ( (lv_antecedent_3_0= ruleAbstractRule ) ) otherlv_4= 'then' ( (lv_consequent_5_0= ruleAbstractRule ) ) otherlv_6= '}' ) )
            // InternalDsl.g:1407:2: (otherlv_0= 'ImplicationRule' otherlv_1= '{' otherlv_2= 'if' ( (lv_antecedent_3_0= ruleAbstractRule ) ) otherlv_4= 'then' ( (lv_consequent_5_0= ruleAbstractRule ) ) otherlv_6= '}' )
            {
            // InternalDsl.g:1407:2: (otherlv_0= 'ImplicationRule' otherlv_1= '{' otherlv_2= 'if' ( (lv_antecedent_3_0= ruleAbstractRule ) ) otherlv_4= 'then' ( (lv_consequent_5_0= ruleAbstractRule ) ) otherlv_6= '}' )
            // InternalDsl.g:1408:3: otherlv_0= 'ImplicationRule' otherlv_1= '{' otherlv_2= 'if' ( (lv_antecedent_3_0= ruleAbstractRule ) ) otherlv_4= 'then' ( (lv_consequent_5_0= ruleAbstractRule ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,38,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getImplicationRuleAccess().getImplicationRuleKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_19); 

            			newLeafNode(otherlv_1, grammarAccess.getImplicationRuleAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,28,FOLLOW_13); 

            			newLeafNode(otherlv_2, grammarAccess.getImplicationRuleAccess().getIfKeyword_2());
            		
            // InternalDsl.g:1420:3: ( (lv_antecedent_3_0= ruleAbstractRule ) )
            // InternalDsl.g:1421:4: (lv_antecedent_3_0= ruleAbstractRule )
            {
            // InternalDsl.g:1421:4: (lv_antecedent_3_0= ruleAbstractRule )
            // InternalDsl.g:1422:5: lv_antecedent_3_0= ruleAbstractRule
            {

            					newCompositeNode(grammarAccess.getImplicationRuleAccess().getAntecedentAbstractRuleParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_20);
            lv_antecedent_3_0=ruleAbstractRule();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getImplicationRuleRule());
            					}
            					set(
            						current,
            						"antecedent",
            						lv_antecedent_3_0,
            						"org.framed.orm.editPolicy.model.dsl.Dsl.AbstractRule");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,29,FOLLOW_13); 

            			newLeafNode(otherlv_4, grammarAccess.getImplicationRuleAccess().getThenKeyword_4());
            		
            // InternalDsl.g:1443:3: ( (lv_consequent_5_0= ruleAbstractRule ) )
            // InternalDsl.g:1444:4: (lv_consequent_5_0= ruleAbstractRule )
            {
            // InternalDsl.g:1444:4: (lv_consequent_5_0= ruleAbstractRule )
            // InternalDsl.g:1445:5: lv_consequent_5_0= ruleAbstractRule
            {

            					newCompositeNode(grammarAccess.getImplicationRuleAccess().getConsequentAbstractRuleParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_9);
            lv_consequent_5_0=ruleAbstractRule();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getImplicationRuleRule());
            					}
            					set(
            						current,
            						"consequent",
            						lv_consequent_5_0,
            						"org.framed.orm.editPolicy.model.dsl.Dsl.AbstractRule");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getImplicationRuleAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleImplicationRule"


    // $ANTLR start "entryRuleSourceTypeRule"
    // InternalDsl.g:1470:1: entryRuleSourceTypeRule returns [EObject current=null] : iv_ruleSourceTypeRule= ruleSourceTypeRule EOF ;
    public final EObject entryRuleSourceTypeRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSourceTypeRule = null;


        try {
            // InternalDsl.g:1470:55: (iv_ruleSourceTypeRule= ruleSourceTypeRule EOF )
            // InternalDsl.g:1471:2: iv_ruleSourceTypeRule= ruleSourceTypeRule EOF
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
    // InternalDsl.g:1477:1: ruleSourceTypeRule returns [EObject current=null] : ( () otherlv_1= 'SourceTypeRule' ( (lv_name_2_0= ruleEString ) ) ) ;
    public final EObject ruleSourceTypeRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:1483:2: ( ( () otherlv_1= 'SourceTypeRule' ( (lv_name_2_0= ruleEString ) ) ) )
            // InternalDsl.g:1484:2: ( () otherlv_1= 'SourceTypeRule' ( (lv_name_2_0= ruleEString ) ) )
            {
            // InternalDsl.g:1484:2: ( () otherlv_1= 'SourceTypeRule' ( (lv_name_2_0= ruleEString ) ) )
            // InternalDsl.g:1485:3: () otherlv_1= 'SourceTypeRule' ( (lv_name_2_0= ruleEString ) )
            {
            // InternalDsl.g:1485:3: ()
            // InternalDsl.g:1486:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSourceTypeRuleAccess().getSourceTypeRuleAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,39,FOLLOW_17); 

            			newLeafNode(otherlv_1, grammarAccess.getSourceTypeRuleAccess().getSourceTypeRuleKeyword_1());
            		
            // InternalDsl.g:1496:3: ( (lv_name_2_0= ruleEString ) )
            // InternalDsl.g:1497:4: (lv_name_2_0= ruleEString )
            {
            // InternalDsl.g:1497:4: (lv_name_2_0= ruleEString )
            // InternalDsl.g:1498:5: lv_name_2_0= ruleEString
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
    // InternalDsl.g:1519:1: entryRuleTargetTypeRule returns [EObject current=null] : iv_ruleTargetTypeRule= ruleTargetTypeRule EOF ;
    public final EObject entryRuleTargetTypeRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTargetTypeRule = null;


        try {
            // InternalDsl.g:1519:55: (iv_ruleTargetTypeRule= ruleTargetTypeRule EOF )
            // InternalDsl.g:1520:2: iv_ruleTargetTypeRule= ruleTargetTypeRule EOF
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
    // InternalDsl.g:1526:1: ruleTargetTypeRule returns [EObject current=null] : ( () otherlv_1= 'TargetTypeRule' ( (lv_name_2_0= ruleEString ) ) ) ;
    public final EObject ruleTargetTypeRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:1532:2: ( ( () otherlv_1= 'TargetTypeRule' ( (lv_name_2_0= ruleEString ) ) ) )
            // InternalDsl.g:1533:2: ( () otherlv_1= 'TargetTypeRule' ( (lv_name_2_0= ruleEString ) ) )
            {
            // InternalDsl.g:1533:2: ( () otherlv_1= 'TargetTypeRule' ( (lv_name_2_0= ruleEString ) ) )
            // InternalDsl.g:1534:3: () otherlv_1= 'TargetTypeRule' ( (lv_name_2_0= ruleEString ) )
            {
            // InternalDsl.g:1534:3: ()
            // InternalDsl.g:1535:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTargetTypeRuleAccess().getTargetTypeRuleAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,40,FOLLOW_17); 

            			newLeafNode(otherlv_1, grammarAccess.getTargetTypeRuleAccess().getTargetTypeRuleKeyword_1());
            		
            // InternalDsl.g:1545:3: ( (lv_name_2_0= ruleEString ) )
            // InternalDsl.g:1546:4: (lv_name_2_0= ruleEString )
            {
            // InternalDsl.g:1546:4: (lv_name_2_0= ruleEString )
            // InternalDsl.g:1547:5: lv_name_2_0= ruleEString
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
    // InternalDsl.g:1568:1: entryRuleCommandNameRule returns [EObject current=null] : iv_ruleCommandNameRule= ruleCommandNameRule EOF ;
    public final EObject entryRuleCommandNameRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommandNameRule = null;


        try {
            // InternalDsl.g:1568:56: (iv_ruleCommandNameRule= ruleCommandNameRule EOF )
            // InternalDsl.g:1569:2: iv_ruleCommandNameRule= ruleCommandNameRule EOF
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
    // InternalDsl.g:1575:1: ruleCommandNameRule returns [EObject current=null] : ( () otherlv_1= 'CommandNameRule' ( (lv_name_2_0= ruleEString ) ) ) ;
    public final EObject ruleCommandNameRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:1581:2: ( ( () otherlv_1= 'CommandNameRule' ( (lv_name_2_0= ruleEString ) ) ) )
            // InternalDsl.g:1582:2: ( () otherlv_1= 'CommandNameRule' ( (lv_name_2_0= ruleEString ) ) )
            {
            // InternalDsl.g:1582:2: ( () otherlv_1= 'CommandNameRule' ( (lv_name_2_0= ruleEString ) ) )
            // InternalDsl.g:1583:3: () otherlv_1= 'CommandNameRule' ( (lv_name_2_0= ruleEString ) )
            {
            // InternalDsl.g:1583:3: ()
            // InternalDsl.g:1584:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCommandNameRuleAccess().getCommandNameRuleAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,41,FOLLOW_17); 

            			newLeafNode(otherlv_1, grammarAccess.getCommandNameRuleAccess().getCommandNameRuleKeyword_1());
            		
            // InternalDsl.g:1594:3: ( (lv_name_2_0= ruleEString ) )
            // InternalDsl.g:1595:4: (lv_name_2_0= ruleEString )
            {
            // InternalDsl.g:1595:4: (lv_name_2_0= ruleEString )
            // InternalDsl.g:1596:5: lv_name_2_0= ruleEString
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
    // InternalDsl.g:1617:1: entryRuleShapeTypeRule returns [EObject current=null] : iv_ruleShapeTypeRule= ruleShapeTypeRule EOF ;
    public final EObject entryRuleShapeTypeRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleShapeTypeRule = null;


        try {
            // InternalDsl.g:1617:54: (iv_ruleShapeTypeRule= ruleShapeTypeRule EOF )
            // InternalDsl.g:1618:2: iv_ruleShapeTypeRule= ruleShapeTypeRule EOF
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
    // InternalDsl.g:1624:1: ruleShapeTypeRule returns [EObject current=null] : ( () otherlv_1= 'ShapeTypeRule' ( (lv_name_2_0= ruleEString ) ) ) ;
    public final EObject ruleShapeTypeRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:1630:2: ( ( () otherlv_1= 'ShapeTypeRule' ( (lv_name_2_0= ruleEString ) ) ) )
            // InternalDsl.g:1631:2: ( () otherlv_1= 'ShapeTypeRule' ( (lv_name_2_0= ruleEString ) ) )
            {
            // InternalDsl.g:1631:2: ( () otherlv_1= 'ShapeTypeRule' ( (lv_name_2_0= ruleEString ) ) )
            // InternalDsl.g:1632:3: () otherlv_1= 'ShapeTypeRule' ( (lv_name_2_0= ruleEString ) )
            {
            // InternalDsl.g:1632:3: ()
            // InternalDsl.g:1633:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getShapeTypeRuleAccess().getShapeTypeRuleAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,42,FOLLOW_17); 

            			newLeafNode(otherlv_1, grammarAccess.getShapeTypeRuleAccess().getShapeTypeRuleKeyword_1());
            		
            // InternalDsl.g:1643:3: ( (lv_name_2_0= ruleEString ) )
            // InternalDsl.g:1644:4: (lv_name_2_0= ruleEString )
            {
            // InternalDsl.g:1644:4: (lv_name_2_0= ruleEString )
            // InternalDsl.g:1645:5: lv_name_2_0= ruleEString
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
    // InternalDsl.g:1666:1: entryRuleParentTypeRule returns [EObject current=null] : iv_ruleParentTypeRule= ruleParentTypeRule EOF ;
    public final EObject entryRuleParentTypeRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParentTypeRule = null;


        try {
            // InternalDsl.g:1666:55: (iv_ruleParentTypeRule= ruleParentTypeRule EOF )
            // InternalDsl.g:1667:2: iv_ruleParentTypeRule= ruleParentTypeRule EOF
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
    // InternalDsl.g:1673:1: ruleParentTypeRule returns [EObject current=null] : ( () otherlv_1= 'ParentTypeRule' ( (lv_name_2_0= ruleEString ) ) ) ;
    public final EObject ruleParentTypeRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:1679:2: ( ( () otherlv_1= 'ParentTypeRule' ( (lv_name_2_0= ruleEString ) ) ) )
            // InternalDsl.g:1680:2: ( () otherlv_1= 'ParentTypeRule' ( (lv_name_2_0= ruleEString ) ) )
            {
            // InternalDsl.g:1680:2: ( () otherlv_1= 'ParentTypeRule' ( (lv_name_2_0= ruleEString ) ) )
            // InternalDsl.g:1681:3: () otherlv_1= 'ParentTypeRule' ( (lv_name_2_0= ruleEString ) )
            {
            // InternalDsl.g:1681:3: ()
            // InternalDsl.g:1682:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getParentTypeRuleAccess().getParentTypeRuleAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,43,FOLLOW_17); 

            			newLeafNode(otherlv_1, grammarAccess.getParentTypeRuleAccess().getParentTypeRuleKeyword_1());
            		
            // InternalDsl.g:1692:3: ( (lv_name_2_0= ruleEString ) )
            // InternalDsl.g:1693:4: (lv_name_2_0= ruleEString )
            {
            // InternalDsl.g:1693:4: (lv_name_2_0= ruleEString )
            // InternalDsl.g:1694:5: lv_name_2_0= ruleEString
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
    // InternalDsl.g:1715:1: entryRuleStepInRule returns [EObject current=null] : iv_ruleStepInRule= ruleStepInRule EOF ;
    public final EObject entryRuleStepInRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStepInRule = null;


        try {
            // InternalDsl.g:1715:51: (iv_ruleStepInRule= ruleStepInRule EOF )
            // InternalDsl.g:1716:2: iv_ruleStepInRule= ruleStepInRule EOF
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
    // InternalDsl.g:1722:1: ruleStepInRule returns [EObject current=null] : ( () otherlv_1= 'StepInRule' ) ;
    public final EObject ruleStepInRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalDsl.g:1728:2: ( ( () otherlv_1= 'StepInRule' ) )
            // InternalDsl.g:1729:2: ( () otherlv_1= 'StepInRule' )
            {
            // InternalDsl.g:1729:2: ( () otherlv_1= 'StepInRule' )
            // InternalDsl.g:1730:3: () otherlv_1= 'StepInRule'
            {
            // InternalDsl.g:1730:3: ()
            // InternalDsl.g:1731:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getStepInRuleAccess().getStepInRuleAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,44,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getStepInRuleAccess().getStepInRuleKeyword_1());
            		

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
    // InternalDsl.g:1745:1: entryRuleTrueRule returns [EObject current=null] : iv_ruleTrueRule= ruleTrueRule EOF ;
    public final EObject entryRuleTrueRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTrueRule = null;


        try {
            // InternalDsl.g:1745:49: (iv_ruleTrueRule= ruleTrueRule EOF )
            // InternalDsl.g:1746:2: iv_ruleTrueRule= ruleTrueRule EOF
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
    // InternalDsl.g:1752:1: ruleTrueRule returns [EObject current=null] : ( () otherlv_1= 'TrueRule' ) ;
    public final EObject ruleTrueRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalDsl.g:1758:2: ( ( () otherlv_1= 'TrueRule' ) )
            // InternalDsl.g:1759:2: ( () otherlv_1= 'TrueRule' )
            {
            // InternalDsl.g:1759:2: ( () otherlv_1= 'TrueRule' )
            // InternalDsl.g:1760:3: () otherlv_1= 'TrueRule'
            {
            // InternalDsl.g:1760:3: ()
            // InternalDsl.g:1761:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTrueRuleAccess().getTrueRuleAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,45,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getTrueRuleAccess().getTrueRuleKeyword_1());
            		

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
    // InternalDsl.g:1775:1: entryRuleFalseRule returns [EObject current=null] : iv_ruleFalseRule= ruleFalseRule EOF ;
    public final EObject entryRuleFalseRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFalseRule = null;


        try {
            // InternalDsl.g:1775:50: (iv_ruleFalseRule= ruleFalseRule EOF )
            // InternalDsl.g:1776:2: iv_ruleFalseRule= ruleFalseRule EOF
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
    // InternalDsl.g:1782:1: ruleFalseRule returns [EObject current=null] : ( () otherlv_1= 'FalseRule' ) ;
    public final EObject ruleFalseRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalDsl.g:1788:2: ( ( () otherlv_1= 'FalseRule' ) )
            // InternalDsl.g:1789:2: ( () otherlv_1= 'FalseRule' )
            {
            // InternalDsl.g:1789:2: ( () otherlv_1= 'FalseRule' )
            // InternalDsl.g:1790:3: () otherlv_1= 'FalseRule'
            {
            // InternalDsl.g:1790:3: ()
            // InternalDsl.g:1791:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getFalseRuleAccess().getFalseRuleAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,46,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getFalseRuleAccess().getFalseRuleKeyword_1());
            		

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
    // InternalDsl.g:1805:1: entryRuleShapeNameRule returns [EObject current=null] : iv_ruleShapeNameRule= ruleShapeNameRule EOF ;
    public final EObject entryRuleShapeNameRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleShapeNameRule = null;


        try {
            // InternalDsl.g:1805:54: (iv_ruleShapeNameRule= ruleShapeNameRule EOF )
            // InternalDsl.g:1806:2: iv_ruleShapeNameRule= ruleShapeNameRule EOF
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
    // InternalDsl.g:1812:1: ruleShapeNameRule returns [EObject current=null] : ( () otherlv_1= 'ShapeNameRule' ( (lv_name_2_0= ruleEString ) ) ) ;
    public final EObject ruleShapeNameRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:1818:2: ( ( () otherlv_1= 'ShapeNameRule' ( (lv_name_2_0= ruleEString ) ) ) )
            // InternalDsl.g:1819:2: ( () otherlv_1= 'ShapeNameRule' ( (lv_name_2_0= ruleEString ) ) )
            {
            // InternalDsl.g:1819:2: ( () otherlv_1= 'ShapeNameRule' ( (lv_name_2_0= ruleEString ) ) )
            // InternalDsl.g:1820:3: () otherlv_1= 'ShapeNameRule' ( (lv_name_2_0= ruleEString ) )
            {
            // InternalDsl.g:1820:3: ()
            // InternalDsl.g:1821:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getShapeNameRuleAccess().getShapeNameRuleAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,47,FOLLOW_17); 

            			newLeafNode(otherlv_1, grammarAccess.getShapeNameRuleAccess().getShapeNameRuleKeyword_1());
            		
            // InternalDsl.g:1831:3: ( (lv_name_2_0= ruleEString ) )
            // InternalDsl.g:1832:4: (lv_name_2_0= ruleEString )
            {
            // InternalDsl.g:1832:4: (lv_name_2_0= ruleEString )
            // InternalDsl.g:1833:5: lv_name_2_0= ruleEString
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
    // InternalDsl.g:1854:1: entryRuleMappingExpression returns [EObject current=null] : iv_ruleMappingExpression= ruleMappingExpression EOF ;
    public final EObject entryRuleMappingExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMappingExpression = null;


        try {
            // InternalDsl.g:1854:58: (iv_ruleMappingExpression= ruleMappingExpression EOF )
            // InternalDsl.g:1855:2: iv_ruleMappingExpression= ruleMappingExpression EOF
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
    // InternalDsl.g:1861:1: ruleMappingExpression returns [EObject current=null] : (this_AndMapping_0= ruleAndMapping | (otherlv_1= '!' () ( (lv_rule_3_0= ruleAndMapping ) ) ) ) ;
    public final EObject ruleMappingExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject this_AndMapping_0 = null;

        EObject lv_rule_3_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:1867:2: ( (this_AndMapping_0= ruleAndMapping | (otherlv_1= '!' () ( (lv_rule_3_0= ruleAndMapping ) ) ) ) )
            // InternalDsl.g:1868:2: (this_AndMapping_0= ruleAndMapping | (otherlv_1= '!' () ( (lv_rule_3_0= ruleAndMapping ) ) ) )
            {
            // InternalDsl.g:1868:2: (this_AndMapping_0= ruleAndMapping | (otherlv_1= '!' () ( (lv_rule_3_0= ruleAndMapping ) ) ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==23||LA13_0==30||LA13_0==50) ) {
                alt13=1;
            }
            else if ( (LA13_0==25) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalDsl.g:1869:3: this_AndMapping_0= ruleAndMapping
                    {

                    			newCompositeNode(grammarAccess.getMappingExpressionAccess().getAndMappingParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_AndMapping_0=ruleAndMapping();

                    state._fsp--;


                    			current = this_AndMapping_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalDsl.g:1878:3: (otherlv_1= '!' () ( (lv_rule_3_0= ruleAndMapping ) ) )
                    {
                    // InternalDsl.g:1878:3: (otherlv_1= '!' () ( (lv_rule_3_0= ruleAndMapping ) ) )
                    // InternalDsl.g:1879:4: otherlv_1= '!' () ( (lv_rule_3_0= ruleAndMapping ) )
                    {
                    otherlv_1=(Token)match(input,25,FOLLOW_15); 

                    				newLeafNode(otherlv_1, grammarAccess.getMappingExpressionAccess().getExclamationMarkKeyword_1_0());
                    			
                    // InternalDsl.g:1883:4: ()
                    // InternalDsl.g:1884:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getMappingExpressionAccess().getNotMappingRuleAction_1_1(),
                    						current);
                    				

                    }

                    // InternalDsl.g:1890:4: ( (lv_rule_3_0= ruleAndMapping ) )
                    // InternalDsl.g:1891:5: (lv_rule_3_0= ruleAndMapping )
                    {
                    // InternalDsl.g:1891:5: (lv_rule_3_0= ruleAndMapping )
                    // InternalDsl.g:1892:6: lv_rule_3_0= ruleAndMapping
                    {

                    						newCompositeNode(grammarAccess.getMappingExpressionAccess().getRuleAndMappingParserRuleCall_1_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_rule_3_0=ruleAndMapping();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMappingExpressionRule());
                    						}
                    						set(
                    							current,
                    							"rule",
                    							lv_rule_3_0,
                    							"org.framed.orm.editPolicy.model.dsl.Dsl.AndMapping");
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
    // $ANTLR end "ruleMappingExpression"


    // $ANTLR start "entryRuleAndMapping"
    // InternalDsl.g:1914:1: entryRuleAndMapping returns [EObject current=null] : iv_ruleAndMapping= ruleAndMapping EOF ;
    public final EObject entryRuleAndMapping() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAndMapping = null;


        try {
            // InternalDsl.g:1914:51: (iv_ruleAndMapping= ruleAndMapping EOF )
            // InternalDsl.g:1915:2: iv_ruleAndMapping= ruleAndMapping EOF
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
    // InternalDsl.g:1921:1: ruleAndMapping returns [EObject current=null] : (this_OrMapping_0= ruleOrMapping ( () otherlv_2= '&&' ( (lv_rules_3_0= ruleOrMapping ) ) )* ) ;
    public final EObject ruleAndMapping() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_OrMapping_0 = null;

        EObject lv_rules_3_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:1927:2: ( (this_OrMapping_0= ruleOrMapping ( () otherlv_2= '&&' ( (lv_rules_3_0= ruleOrMapping ) ) )* ) )
            // InternalDsl.g:1928:2: (this_OrMapping_0= ruleOrMapping ( () otherlv_2= '&&' ( (lv_rules_3_0= ruleOrMapping ) ) )* )
            {
            // InternalDsl.g:1928:2: (this_OrMapping_0= ruleOrMapping ( () otherlv_2= '&&' ( (lv_rules_3_0= ruleOrMapping ) ) )* )
            // InternalDsl.g:1929:3: this_OrMapping_0= ruleOrMapping ( () otherlv_2= '&&' ( (lv_rules_3_0= ruleOrMapping ) ) )*
            {

            			newCompositeNode(grammarAccess.getAndMappingAccess().getOrMappingParserRuleCall_0());
            		
            pushFollow(FOLLOW_21);
            this_OrMapping_0=ruleOrMapping();

            state._fsp--;


            			current = this_OrMapping_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalDsl.g:1937:3: ( () otherlv_2= '&&' ( (lv_rules_3_0= ruleOrMapping ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==48) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalDsl.g:1938:4: () otherlv_2= '&&' ( (lv_rules_3_0= ruleOrMapping ) )
            	    {
            	    // InternalDsl.g:1938:4: ()
            	    // InternalDsl.g:1939:5: 
            	    {

            	    					current = forceCreateModelElementAndAdd(
            	    						grammarAccess.getAndMappingAccess().getAndMappingRuleRulesAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,48,FOLLOW_15); 

            	    				newLeafNode(otherlv_2, grammarAccess.getAndMappingAccess().getAmpersandAmpersandKeyword_1_1());
            	    			
            	    // InternalDsl.g:1949:4: ( (lv_rules_3_0= ruleOrMapping ) )
            	    // InternalDsl.g:1950:5: (lv_rules_3_0= ruleOrMapping )
            	    {
            	    // InternalDsl.g:1950:5: (lv_rules_3_0= ruleOrMapping )
            	    // InternalDsl.g:1951:6: lv_rules_3_0= ruleOrMapping
            	    {

            	    						newCompositeNode(grammarAccess.getAndMappingAccess().getRulesOrMappingParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_21);
            	    lv_rules_3_0=ruleOrMapping();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getAndMappingRule());
            	    						}
            	    						add(
            	    							current,
            	    							"rules",
            	    							lv_rules_3_0,
            	    							"org.framed.orm.editPolicy.model.dsl.Dsl.OrMapping");
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
    // $ANTLR end "ruleAndMapping"


    // $ANTLR start "entryRuleOrMapping"
    // InternalDsl.g:1973:1: entryRuleOrMapping returns [EObject current=null] : iv_ruleOrMapping= ruleOrMapping EOF ;
    public final EObject entryRuleOrMapping() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrMapping = null;


        try {
            // InternalDsl.g:1973:50: (iv_ruleOrMapping= ruleOrMapping EOF )
            // InternalDsl.g:1974:2: iv_ruleOrMapping= ruleOrMapping EOF
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
    // InternalDsl.g:1980:1: ruleOrMapping returns [EObject current=null] : (this_Primary_0= rulePrimary ( () otherlv_2= '||' ( (lv_rules_3_0= rulePrimary ) ) )* ) ;
    public final EObject ruleOrMapping() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Primary_0 = null;

        EObject lv_rules_3_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:1986:2: ( (this_Primary_0= rulePrimary ( () otherlv_2= '||' ( (lv_rules_3_0= rulePrimary ) ) )* ) )
            // InternalDsl.g:1987:2: (this_Primary_0= rulePrimary ( () otherlv_2= '||' ( (lv_rules_3_0= rulePrimary ) ) )* )
            {
            // InternalDsl.g:1987:2: (this_Primary_0= rulePrimary ( () otherlv_2= '||' ( (lv_rules_3_0= rulePrimary ) ) )* )
            // InternalDsl.g:1988:3: this_Primary_0= rulePrimary ( () otherlv_2= '||' ( (lv_rules_3_0= rulePrimary ) ) )*
            {

            			newCompositeNode(grammarAccess.getOrMappingAccess().getPrimaryParserRuleCall_0());
            		
            pushFollow(FOLLOW_22);
            this_Primary_0=rulePrimary();

            state._fsp--;


            			current = this_Primary_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalDsl.g:1996:3: ( () otherlv_2= '||' ( (lv_rules_3_0= rulePrimary ) ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==49) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalDsl.g:1997:4: () otherlv_2= '||' ( (lv_rules_3_0= rulePrimary ) )
            	    {
            	    // InternalDsl.g:1997:4: ()
            	    // InternalDsl.g:1998:5: 
            	    {

            	    					current = forceCreateModelElementAndAdd(
            	    						grammarAccess.getOrMappingAccess().getOrMappingRuleRulesAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,49,FOLLOW_15); 

            	    				newLeafNode(otherlv_2, grammarAccess.getOrMappingAccess().getVerticalLineVerticalLineKeyword_1_1());
            	    			
            	    // InternalDsl.g:2008:4: ( (lv_rules_3_0= rulePrimary ) )
            	    // InternalDsl.g:2009:5: (lv_rules_3_0= rulePrimary )
            	    {
            	    // InternalDsl.g:2009:5: (lv_rules_3_0= rulePrimary )
            	    // InternalDsl.g:2010:6: lv_rules_3_0= rulePrimary
            	    {

            	    						newCompositeNode(grammarAccess.getOrMappingAccess().getRulesPrimaryParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_22);
            	    lv_rules_3_0=rulePrimary();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getOrMappingRule());
            	    						}
            	    						add(
            	    							current,
            	    							"rules",
            	    							lv_rules_3_0,
            	    							"org.framed.orm.editPolicy.model.dsl.Dsl.Primary");
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
    // $ANTLR end "ruleOrMapping"


    // $ANTLR start "entryRulePrimary"
    // InternalDsl.g:2032:1: entryRulePrimary returns [EObject current=null] : iv_rulePrimary= rulePrimary EOF ;
    public final EObject entryRulePrimary() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimary = null;


        try {
            // InternalDsl.g:2032:48: (iv_rulePrimary= rulePrimary EOF )
            // InternalDsl.g:2033:2: iv_rulePrimary= rulePrimary EOF
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
    // InternalDsl.g:2039:1: rulePrimary returns [EObject current=null] : (this_TrueMappingRule_0= ruleTrueMappingRule | this_FeatureNameMappingRule_1= ruleFeatureNameMappingRule | (otherlv_2= '(' this_MappingExpression_3= ruleMappingExpression otherlv_4= ')' ) ) ;
    public final EObject rulePrimary() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_TrueMappingRule_0 = null;

        EObject this_FeatureNameMappingRule_1 = null;

        EObject this_MappingExpression_3 = null;



        	enterRule();

        try {
            // InternalDsl.g:2045:2: ( (this_TrueMappingRule_0= ruleTrueMappingRule | this_FeatureNameMappingRule_1= ruleFeatureNameMappingRule | (otherlv_2= '(' this_MappingExpression_3= ruleMappingExpression otherlv_4= ')' ) ) )
            // InternalDsl.g:2046:2: (this_TrueMappingRule_0= ruleTrueMappingRule | this_FeatureNameMappingRule_1= ruleFeatureNameMappingRule | (otherlv_2= '(' this_MappingExpression_3= ruleMappingExpression otherlv_4= ')' ) )
            {
            // InternalDsl.g:2046:2: (this_TrueMappingRule_0= ruleTrueMappingRule | this_FeatureNameMappingRule_1= ruleFeatureNameMappingRule | (otherlv_2= '(' this_MappingExpression_3= ruleMappingExpression otherlv_4= ')' ) )
            int alt16=3;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt16=1;
                }
                break;
            case 23:
                {
                alt16=2;
                }
                break;
            case 50:
                {
                alt16=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // InternalDsl.g:2047:3: this_TrueMappingRule_0= ruleTrueMappingRule
                    {

                    			newCompositeNode(grammarAccess.getPrimaryAccess().getTrueMappingRuleParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_TrueMappingRule_0=ruleTrueMappingRule();

                    state._fsp--;


                    			current = this_TrueMappingRule_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalDsl.g:2056:3: this_FeatureNameMappingRule_1= ruleFeatureNameMappingRule
                    {

                    			newCompositeNode(grammarAccess.getPrimaryAccess().getFeatureNameMappingRuleParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_FeatureNameMappingRule_1=ruleFeatureNameMappingRule();

                    state._fsp--;


                    			current = this_FeatureNameMappingRule_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalDsl.g:2065:3: (otherlv_2= '(' this_MappingExpression_3= ruleMappingExpression otherlv_4= ')' )
                    {
                    // InternalDsl.g:2065:3: (otherlv_2= '(' this_MappingExpression_3= ruleMappingExpression otherlv_4= ')' )
                    // InternalDsl.g:2066:4: otherlv_2= '(' this_MappingExpression_3= ruleMappingExpression otherlv_4= ')'
                    {
                    otherlv_2=(Token)match(input,50,FOLLOW_15); 

                    				newLeafNode(otherlv_2, grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_2_0());
                    			

                    				newCompositeNode(grammarAccess.getPrimaryAccess().getMappingExpressionParserRuleCall_2_1());
                    			
                    pushFollow(FOLLOW_23);
                    this_MappingExpression_3=ruleMappingExpression();

                    state._fsp--;


                    				current = this_MappingExpression_3;
                    				afterParserOrEnumRuleCall();
                    			
                    otherlv_4=(Token)match(input,51,FOLLOW_2); 

                    				newLeafNode(otherlv_4, grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_2_2());
                    			

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


    protected DFA7 dfa7 = new DFA7(this);
    static final String dfa_1s = "\14\uffff";
    static final String dfa_2s = "\1\27\1\4\1\uffff\1\27\5\uffff\1\4\2\uffff";
    static final String dfa_3s = "\1\62\1\5\1\uffff\1\62\5\uffff\1\5\2\uffff";
    static final String dfa_4s = "\2\uffff\1\1\1\uffff\1\1\1\2\3\1\1\uffff\2\1";
    static final String dfa_5s = "\14\uffff}>";
    static final String[] dfa_6s = {
            "\1\1\1\2\1\3\2\2\2\uffff\1\4\23\uffff\1\5",
            "\1\7\1\6",
            "",
            "\1\11\4\10\2\uffff\1\10\23\uffff\1\5",
            "",
            "",
            "",
            "",
            "",
            "\1\13\1\12",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA7 extends DFA {

        public DFA7(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 7;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "612:5: (lv_rule_3_1= ruleAbstractMappingRule | lv_rule_3_2= ruleMappingExpression )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000014000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000050000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000FFFF80000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x000400004F800000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x000000004F800000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0008000000000000L});

}