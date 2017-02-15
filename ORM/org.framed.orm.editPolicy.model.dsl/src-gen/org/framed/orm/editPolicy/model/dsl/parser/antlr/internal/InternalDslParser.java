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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Model'", "'{'", "'configuration'", "'policies'", "','", "'}'", "'Configuration'", "'mappings'", "'Policy'", "'Mapping'", "'rule'", "'policy'", "'FeatureNameMappingRule'", "'AndMappingRule'", "'NotMappingRule'", "'OrMappingRule'", "'ImplicationMappingRule'", "'if'", "'then'", "'TrueMappingRule'", "'AndRule'", "'RelationNameRule'", "'OrRule'", "'NotRule'", "'ImplicationRule'", "'SourceTypeRule'", "'TargetTypeRule'", "'CommandNameRule'", "'ShapeTypeRule'", "'ParentTypeRule'", "'StepInRule'", "'TrueRule'", "'FalseRule'", "'ShapeNameRule'"
    };
    public static final int RULE_ID=5;
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
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=6;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__44=44;
    public static final int RULE_SL_COMMENT=8;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_STRING=4;
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
    // InternalDsl.g:183:1: ruleAbstractRule returns [EObject current=null] : (this_AndRule_0= ruleAndRule | this_RelationNameRule_1= ruleRelationNameRule | this_OrRule_2= ruleOrRule | this_NotRule_3= ruleNotRule | this_ImplicationRule_4= ruleImplicationRule | this_SourceTypeRule_5= ruleSourceTypeRule | this_TargetTypeRule_6= ruleTargetTypeRule | this_CommandNameRule_7= ruleCommandNameRule | this_ShapeTypeRule_8= ruleShapeTypeRule | this_ParentTypeRule_9= ruleParentTypeRule | this_StepInRule_10= ruleStepInRule | this_TrueRule_11= ruleTrueRule | this_FalseRule_12= ruleFalseRule | this_ShapeNameRule_13= ruleShapeNameRule ) ;
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



        	enterRule();

        try {
            // InternalDsl.g:189:2: ( (this_AndRule_0= ruleAndRule | this_RelationNameRule_1= ruleRelationNameRule | this_OrRule_2= ruleOrRule | this_NotRule_3= ruleNotRule | this_ImplicationRule_4= ruleImplicationRule | this_SourceTypeRule_5= ruleSourceTypeRule | this_TargetTypeRule_6= ruleTargetTypeRule | this_CommandNameRule_7= ruleCommandNameRule | this_ShapeTypeRule_8= ruleShapeTypeRule | this_ParentTypeRule_9= ruleParentTypeRule | this_StepInRule_10= ruleStepInRule | this_TrueRule_11= ruleTrueRule | this_FalseRule_12= ruleFalseRule | this_ShapeNameRule_13= ruleShapeNameRule ) )
            // InternalDsl.g:190:2: (this_AndRule_0= ruleAndRule | this_RelationNameRule_1= ruleRelationNameRule | this_OrRule_2= ruleOrRule | this_NotRule_3= ruleNotRule | this_ImplicationRule_4= ruleImplicationRule | this_SourceTypeRule_5= ruleSourceTypeRule | this_TargetTypeRule_6= ruleTargetTypeRule | this_CommandNameRule_7= ruleCommandNameRule | this_ShapeTypeRule_8= ruleShapeTypeRule | this_ParentTypeRule_9= ruleParentTypeRule | this_StepInRule_10= ruleStepInRule | this_TrueRule_11= ruleTrueRule | this_FalseRule_12= ruleFalseRule | this_ShapeNameRule_13= ruleShapeNameRule )
            {
            // InternalDsl.g:190:2: (this_AndRule_0= ruleAndRule | this_RelationNameRule_1= ruleRelationNameRule | this_OrRule_2= ruleOrRule | this_NotRule_3= ruleNotRule | this_ImplicationRule_4= ruleImplicationRule | this_SourceTypeRule_5= ruleSourceTypeRule | this_TargetTypeRule_6= ruleTargetTypeRule | this_CommandNameRule_7= ruleCommandNameRule | this_ShapeTypeRule_8= ruleShapeTypeRule | this_ParentTypeRule_9= ruleParentTypeRule | this_StepInRule_10= ruleStepInRule | this_TrueRule_11= ruleTrueRule | this_FalseRule_12= ruleFalseRule | this_ShapeNameRule_13= ruleShapeNameRule )
            int alt3=14;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt3=1;
                }
                break;
            case 32:
                {
                alt3=2;
                }
                break;
            case 33:
                {
                alt3=3;
                }
                break;
            case 34:
                {
                alt3=4;
                }
                break;
            case 35:
                {
                alt3=5;
                }
                break;
            case 36:
                {
                alt3=6;
                }
                break;
            case 37:
                {
                alt3=7;
                }
                break;
            case 38:
                {
                alt3=8;
                }
                break;
            case 39:
                {
                alt3=9;
                }
                break;
            case 40:
                {
                alt3=10;
                }
                break;
            case 41:
                {
                alt3=11;
                }
                break;
            case 42:
                {
                alt3=12;
                }
                break;
            case 43:
                {
                alt3=13;
                }
                break;
            case 44:
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
    // InternalDsl.g:320:1: entryRuleAbstractMappingRule returns [EObject current=null] : iv_ruleAbstractMappingRule= ruleAbstractMappingRule EOF ;
    public final EObject entryRuleAbstractMappingRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractMappingRule = null;


        try {
            // InternalDsl.g:320:60: (iv_ruleAbstractMappingRule= ruleAbstractMappingRule EOF )
            // InternalDsl.g:321:2: iv_ruleAbstractMappingRule= ruleAbstractMappingRule EOF
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
    // InternalDsl.g:327:1: ruleAbstractMappingRule returns [EObject current=null] : (this_FeatureNameMappingRule_0= ruleFeatureNameMappingRule | this_AndMappingRule_1= ruleAndMappingRule | this_NotMappingRule_2= ruleNotMappingRule | this_OrMappingRule_3= ruleOrMappingRule | this_ImplicationMappingRule_4= ruleImplicationMappingRule | this_TrueMappingRule_5= ruleTrueMappingRule ) ;
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
            // InternalDsl.g:333:2: ( (this_FeatureNameMappingRule_0= ruleFeatureNameMappingRule | this_AndMappingRule_1= ruleAndMappingRule | this_NotMappingRule_2= ruleNotMappingRule | this_OrMappingRule_3= ruleOrMappingRule | this_ImplicationMappingRule_4= ruleImplicationMappingRule | this_TrueMappingRule_5= ruleTrueMappingRule ) )
            // InternalDsl.g:334:2: (this_FeatureNameMappingRule_0= ruleFeatureNameMappingRule | this_AndMappingRule_1= ruleAndMappingRule | this_NotMappingRule_2= ruleNotMappingRule | this_OrMappingRule_3= ruleOrMappingRule | this_ImplicationMappingRule_4= ruleImplicationMappingRule | this_TrueMappingRule_5= ruleTrueMappingRule )
            {
            // InternalDsl.g:334:2: (this_FeatureNameMappingRule_0= ruleFeatureNameMappingRule | this_AndMappingRule_1= ruleAndMappingRule | this_NotMappingRule_2= ruleNotMappingRule | this_OrMappingRule_3= ruleOrMappingRule | this_ImplicationMappingRule_4= ruleImplicationMappingRule | this_TrueMappingRule_5= ruleTrueMappingRule )
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
                    // InternalDsl.g:335:3: this_FeatureNameMappingRule_0= ruleFeatureNameMappingRule
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
                    // InternalDsl.g:344:3: this_AndMappingRule_1= ruleAndMappingRule
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
                    // InternalDsl.g:353:3: this_NotMappingRule_2= ruleNotMappingRule
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
                    // InternalDsl.g:362:3: this_OrMappingRule_3= ruleOrMappingRule
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
                    // InternalDsl.g:371:3: this_ImplicationMappingRule_4= ruleImplicationMappingRule
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
                    // InternalDsl.g:380:3: this_TrueMappingRule_5= ruleTrueMappingRule
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
    // InternalDsl.g:392:1: entryRuleConfiguration returns [EObject current=null] : iv_ruleConfiguration= ruleConfiguration EOF ;
    public final EObject entryRuleConfiguration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConfiguration = null;


        try {
            // InternalDsl.g:392:54: (iv_ruleConfiguration= ruleConfiguration EOF )
            // InternalDsl.g:393:2: iv_ruleConfiguration= ruleConfiguration EOF
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
    // InternalDsl.g:399:1: ruleConfiguration returns [EObject current=null] : ( () otherlv_1= 'Configuration' otherlv_2= '{' (otherlv_3= 'mappings' otherlv_4= '{' ( (lv_mappings_5_0= ruleMapping ) ) (otherlv_6= ',' ( (lv_mappings_7_0= ruleMapping ) ) )* otherlv_8= '}' )? otherlv_9= '}' ) ;
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
            // InternalDsl.g:405:2: ( ( () otherlv_1= 'Configuration' otherlv_2= '{' (otherlv_3= 'mappings' otherlv_4= '{' ( (lv_mappings_5_0= ruleMapping ) ) (otherlv_6= ',' ( (lv_mappings_7_0= ruleMapping ) ) )* otherlv_8= '}' )? otherlv_9= '}' ) )
            // InternalDsl.g:406:2: ( () otherlv_1= 'Configuration' otherlv_2= '{' (otherlv_3= 'mappings' otherlv_4= '{' ( (lv_mappings_5_0= ruleMapping ) ) (otherlv_6= ',' ( (lv_mappings_7_0= ruleMapping ) ) )* otherlv_8= '}' )? otherlv_9= '}' )
            {
            // InternalDsl.g:406:2: ( () otherlv_1= 'Configuration' otherlv_2= '{' (otherlv_3= 'mappings' otherlv_4= '{' ( (lv_mappings_5_0= ruleMapping ) ) (otherlv_6= ',' ( (lv_mappings_7_0= ruleMapping ) ) )* otherlv_8= '}' )? otherlv_9= '}' )
            // InternalDsl.g:407:3: () otherlv_1= 'Configuration' otherlv_2= '{' (otherlv_3= 'mappings' otherlv_4= '{' ( (lv_mappings_5_0= ruleMapping ) ) (otherlv_6= ',' ( (lv_mappings_7_0= ruleMapping ) ) )* otherlv_8= '}' )? otherlv_9= '}'
            {
            // InternalDsl.g:407:3: ()
            // InternalDsl.g:408:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getConfigurationAccess().getConfigurationAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,17,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getConfigurationAccess().getConfigurationKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getConfigurationAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalDsl.g:422:3: (otherlv_3= 'mappings' otherlv_4= '{' ( (lv_mappings_5_0= ruleMapping ) ) (otherlv_6= ',' ( (lv_mappings_7_0= ruleMapping ) ) )* otherlv_8= '}' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==18) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalDsl.g:423:4: otherlv_3= 'mappings' otherlv_4= '{' ( (lv_mappings_5_0= ruleMapping ) ) (otherlv_6= ',' ( (lv_mappings_7_0= ruleMapping ) ) )* otherlv_8= '}'
                    {
                    otherlv_3=(Token)match(input,18,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getConfigurationAccess().getMappingsKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,12,FOLLOW_11); 

                    				newLeafNode(otherlv_4, grammarAccess.getConfigurationAccess().getLeftCurlyBracketKeyword_3_1());
                    			
                    // InternalDsl.g:431:4: ( (lv_mappings_5_0= ruleMapping ) )
                    // InternalDsl.g:432:5: (lv_mappings_5_0= ruleMapping )
                    {
                    // InternalDsl.g:432:5: (lv_mappings_5_0= ruleMapping )
                    // InternalDsl.g:433:6: lv_mappings_5_0= ruleMapping
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

                    // InternalDsl.g:450:4: (otherlv_6= ',' ( (lv_mappings_7_0= ruleMapping ) ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==15) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalDsl.g:451:5: otherlv_6= ',' ( (lv_mappings_7_0= ruleMapping ) )
                    	    {
                    	    otherlv_6=(Token)match(input,15,FOLLOW_11); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getConfigurationAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalDsl.g:455:5: ( (lv_mappings_7_0= ruleMapping ) )
                    	    // InternalDsl.g:456:6: (lv_mappings_7_0= ruleMapping )
                    	    {
                    	    // InternalDsl.g:456:6: (lv_mappings_7_0= ruleMapping )
                    	    // InternalDsl.g:457:7: lv_mappings_7_0= ruleMapping
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
    // InternalDsl.g:488:1: entryRulePolicy returns [EObject current=null] : iv_rulePolicy= rulePolicy EOF ;
    public final EObject entryRulePolicy() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePolicy = null;


        try {
            // InternalDsl.g:488:47: (iv_rulePolicy= rulePolicy EOF )
            // InternalDsl.g:489:2: iv_rulePolicy= rulePolicy EOF
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
    // InternalDsl.g:495:1: rulePolicy returns [EObject current=null] : (otherlv_0= 'Policy' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( (lv_rule_3_0= ruleAbstractRule ) ) otherlv_4= '}' ) ;
    public final EObject rulePolicy() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_rule_3_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:501:2: ( (otherlv_0= 'Policy' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( (lv_rule_3_0= ruleAbstractRule ) ) otherlv_4= '}' ) )
            // InternalDsl.g:502:2: (otherlv_0= 'Policy' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( (lv_rule_3_0= ruleAbstractRule ) ) otherlv_4= '}' )
            {
            // InternalDsl.g:502:2: (otherlv_0= 'Policy' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( (lv_rule_3_0= ruleAbstractRule ) ) otherlv_4= '}' )
            // InternalDsl.g:503:3: otherlv_0= 'Policy' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( (lv_rule_3_0= ruleAbstractRule ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getPolicyAccess().getPolicyKeyword_0());
            		
            // InternalDsl.g:507:3: ( (lv_name_1_0= ruleEString ) )
            // InternalDsl.g:508:4: (lv_name_1_0= ruleEString )
            {
            // InternalDsl.g:508:4: (lv_name_1_0= ruleEString )
            // InternalDsl.g:509:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getPolicyAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPolicyRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.framed.orm.editPolicy.model.dsl.Dsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_13); 

            			newLeafNode(otherlv_2, grammarAccess.getPolicyAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalDsl.g:530:3: ( (lv_rule_3_0= ruleAbstractRule ) )
            // InternalDsl.g:531:4: (lv_rule_3_0= ruleAbstractRule )
            {
            // InternalDsl.g:531:4: (lv_rule_3_0= ruleAbstractRule )
            // InternalDsl.g:532:5: lv_rule_3_0= ruleAbstractRule
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
    // InternalDsl.g:557:1: entryRuleMapping returns [EObject current=null] : iv_ruleMapping= ruleMapping EOF ;
    public final EObject entryRuleMapping() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMapping = null;


        try {
            // InternalDsl.g:557:48: (iv_ruleMapping= ruleMapping EOF )
            // InternalDsl.g:558:2: iv_ruleMapping= ruleMapping EOF
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
    // InternalDsl.g:564:1: ruleMapping returns [EObject current=null] : (otherlv_0= 'Mapping' otherlv_1= '{' otherlv_2= 'rule' ( (lv_rule_3_0= ruleAbstractMappingRule ) ) otherlv_4= 'policy' ( ( ruleEString ) ) otherlv_6= '}' ) ;
    public final EObject ruleMapping() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_rule_3_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:570:2: ( (otherlv_0= 'Mapping' otherlv_1= '{' otherlv_2= 'rule' ( (lv_rule_3_0= ruleAbstractMappingRule ) ) otherlv_4= 'policy' ( ( ruleEString ) ) otherlv_6= '}' ) )
            // InternalDsl.g:571:2: (otherlv_0= 'Mapping' otherlv_1= '{' otherlv_2= 'rule' ( (lv_rule_3_0= ruleAbstractMappingRule ) ) otherlv_4= 'policy' ( ( ruleEString ) ) otherlv_6= '}' )
            {
            // InternalDsl.g:571:2: (otherlv_0= 'Mapping' otherlv_1= '{' otherlv_2= 'rule' ( (lv_rule_3_0= ruleAbstractMappingRule ) ) otherlv_4= 'policy' ( ( ruleEString ) ) otherlv_6= '}' )
            // InternalDsl.g:572:3: otherlv_0= 'Mapping' otherlv_1= '{' otherlv_2= 'rule' ( (lv_rule_3_0= ruleAbstractMappingRule ) ) otherlv_4= 'policy' ( ( ruleEString ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getMappingAccess().getMappingKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getMappingAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,21,FOLLOW_15); 

            			newLeafNode(otherlv_2, grammarAccess.getMappingAccess().getRuleKeyword_2());
            		
            // InternalDsl.g:584:3: ( (lv_rule_3_0= ruleAbstractMappingRule ) )
            // InternalDsl.g:585:4: (lv_rule_3_0= ruleAbstractMappingRule )
            {
            // InternalDsl.g:585:4: (lv_rule_3_0= ruleAbstractMappingRule )
            // InternalDsl.g:586:5: lv_rule_3_0= ruleAbstractMappingRule
            {

            					newCompositeNode(grammarAccess.getMappingAccess().getRuleAbstractMappingRuleParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_16);
            lv_rule_3_0=ruleAbstractMappingRule();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMappingRule());
            					}
            					set(
            						current,
            						"rule",
            						lv_rule_3_0,
            						"org.framed.orm.editPolicy.model.dsl.Dsl.AbstractMappingRule");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,22,FOLLOW_12); 

            			newLeafNode(otherlv_4, grammarAccess.getMappingAccess().getPolicyKeyword_4());
            		
            // InternalDsl.g:607:3: ( ( ruleEString ) )
            // InternalDsl.g:608:4: ( ruleEString )
            {
            // InternalDsl.g:608:4: ( ruleEString )
            // InternalDsl.g:609:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMappingRule());
            					}
            				

            					newCompositeNode(grammarAccess.getMappingAccess().getPolicyPolicyCrossReference_5_0());
            				
            pushFollow(FOLLOW_9);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

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
    // InternalDsl.g:631:1: entryRuleFeatureNameMappingRule returns [EObject current=null] : iv_ruleFeatureNameMappingRule= ruleFeatureNameMappingRule EOF ;
    public final EObject entryRuleFeatureNameMappingRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeatureNameMappingRule = null;


        try {
            // InternalDsl.g:631:63: (iv_ruleFeatureNameMappingRule= ruleFeatureNameMappingRule EOF )
            // InternalDsl.g:632:2: iv_ruleFeatureNameMappingRule= ruleFeatureNameMappingRule EOF
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
    // InternalDsl.g:638:1: ruleFeatureNameMappingRule returns [EObject current=null] : ( () otherlv_1= 'FeatureNameMappingRule' ( (lv_name_2_0= ruleEString ) ) ) ;
    public final EObject ruleFeatureNameMappingRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:644:2: ( ( () otherlv_1= 'FeatureNameMappingRule' ( (lv_name_2_0= ruleEString ) ) ) )
            // InternalDsl.g:645:2: ( () otherlv_1= 'FeatureNameMappingRule' ( (lv_name_2_0= ruleEString ) ) )
            {
            // InternalDsl.g:645:2: ( () otherlv_1= 'FeatureNameMappingRule' ( (lv_name_2_0= ruleEString ) ) )
            // InternalDsl.g:646:3: () otherlv_1= 'FeatureNameMappingRule' ( (lv_name_2_0= ruleEString ) )
            {
            // InternalDsl.g:646:3: ()
            // InternalDsl.g:647:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getFeatureNameMappingRuleAccess().getFeatureNameMappingRuleAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,23,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getFeatureNameMappingRuleAccess().getFeatureNameMappingRuleKeyword_1());
            		
            // InternalDsl.g:657:3: ( (lv_name_2_0= ruleEString ) )
            // InternalDsl.g:658:4: (lv_name_2_0= ruleEString )
            {
            // InternalDsl.g:658:4: (lv_name_2_0= ruleEString )
            // InternalDsl.g:659:5: lv_name_2_0= ruleEString
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
    // InternalDsl.g:680:1: entryRuleAndMappingRule returns [EObject current=null] : iv_ruleAndMappingRule= ruleAndMappingRule EOF ;
    public final EObject entryRuleAndMappingRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAndMappingRule = null;


        try {
            // InternalDsl.g:680:55: (iv_ruleAndMappingRule= ruleAndMappingRule EOF )
            // InternalDsl.g:681:2: iv_ruleAndMappingRule= ruleAndMappingRule EOF
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
    // InternalDsl.g:687:1: ruleAndMappingRule returns [EObject current=null] : (otherlv_0= 'AndMappingRule' otherlv_1= '{' ( (lv_rules_2_0= ruleAbstractMappingRule ) ) (otherlv_3= ',' ( (lv_rules_4_0= ruleAbstractMappingRule ) ) )* otherlv_5= '}' ) ;
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
            // InternalDsl.g:693:2: ( (otherlv_0= 'AndMappingRule' otherlv_1= '{' ( (lv_rules_2_0= ruleAbstractMappingRule ) ) (otherlv_3= ',' ( (lv_rules_4_0= ruleAbstractMappingRule ) ) )* otherlv_5= '}' ) )
            // InternalDsl.g:694:2: (otherlv_0= 'AndMappingRule' otherlv_1= '{' ( (lv_rules_2_0= ruleAbstractMappingRule ) ) (otherlv_3= ',' ( (lv_rules_4_0= ruleAbstractMappingRule ) ) )* otherlv_5= '}' )
            {
            // InternalDsl.g:694:2: (otherlv_0= 'AndMappingRule' otherlv_1= '{' ( (lv_rules_2_0= ruleAbstractMappingRule ) ) (otherlv_3= ',' ( (lv_rules_4_0= ruleAbstractMappingRule ) ) )* otherlv_5= '}' )
            // InternalDsl.g:695:3: otherlv_0= 'AndMappingRule' otherlv_1= '{' ( (lv_rules_2_0= ruleAbstractMappingRule ) ) (otherlv_3= ',' ( (lv_rules_4_0= ruleAbstractMappingRule ) ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getAndMappingRuleAccess().getAndMappingRuleKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_15); 

            			newLeafNode(otherlv_1, grammarAccess.getAndMappingRuleAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalDsl.g:703:3: ( (lv_rules_2_0= ruleAbstractMappingRule ) )
            // InternalDsl.g:704:4: (lv_rules_2_0= ruleAbstractMappingRule )
            {
            // InternalDsl.g:704:4: (lv_rules_2_0= ruleAbstractMappingRule )
            // InternalDsl.g:705:5: lv_rules_2_0= ruleAbstractMappingRule
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

            // InternalDsl.g:722:3: (otherlv_3= ',' ( (lv_rules_4_0= ruleAbstractMappingRule ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==15) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalDsl.g:723:4: otherlv_3= ',' ( (lv_rules_4_0= ruleAbstractMappingRule ) )
            	    {
            	    otherlv_3=(Token)match(input,15,FOLLOW_15); 

            	    				newLeafNode(otherlv_3, grammarAccess.getAndMappingRuleAccess().getCommaKeyword_3_0());
            	    			
            	    // InternalDsl.g:727:4: ( (lv_rules_4_0= ruleAbstractMappingRule ) )
            	    // InternalDsl.g:728:5: (lv_rules_4_0= ruleAbstractMappingRule )
            	    {
            	    // InternalDsl.g:728:5: (lv_rules_4_0= ruleAbstractMappingRule )
            	    // InternalDsl.g:729:6: lv_rules_4_0= ruleAbstractMappingRule
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
            	    break loop7;
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
    // InternalDsl.g:755:1: entryRuleNotMappingRule returns [EObject current=null] : iv_ruleNotMappingRule= ruleNotMappingRule EOF ;
    public final EObject entryRuleNotMappingRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNotMappingRule = null;


        try {
            // InternalDsl.g:755:55: (iv_ruleNotMappingRule= ruleNotMappingRule EOF )
            // InternalDsl.g:756:2: iv_ruleNotMappingRule= ruleNotMappingRule EOF
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
    // InternalDsl.g:762:1: ruleNotMappingRule returns [EObject current=null] : (otherlv_0= 'NotMappingRule' otherlv_1= '{' ( (lv_rule_2_0= ruleAbstractMappingRule ) ) otherlv_3= '}' ) ;
    public final EObject ruleNotMappingRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_rule_2_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:768:2: ( (otherlv_0= 'NotMappingRule' otherlv_1= '{' ( (lv_rule_2_0= ruleAbstractMappingRule ) ) otherlv_3= '}' ) )
            // InternalDsl.g:769:2: (otherlv_0= 'NotMappingRule' otherlv_1= '{' ( (lv_rule_2_0= ruleAbstractMappingRule ) ) otherlv_3= '}' )
            {
            // InternalDsl.g:769:2: (otherlv_0= 'NotMappingRule' otherlv_1= '{' ( (lv_rule_2_0= ruleAbstractMappingRule ) ) otherlv_3= '}' )
            // InternalDsl.g:770:3: otherlv_0= 'NotMappingRule' otherlv_1= '{' ( (lv_rule_2_0= ruleAbstractMappingRule ) ) otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getNotMappingRuleAccess().getNotMappingRuleKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_15); 

            			newLeafNode(otherlv_1, grammarAccess.getNotMappingRuleAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalDsl.g:778:3: ( (lv_rule_2_0= ruleAbstractMappingRule ) )
            // InternalDsl.g:779:4: (lv_rule_2_0= ruleAbstractMappingRule )
            {
            // InternalDsl.g:779:4: (lv_rule_2_0= ruleAbstractMappingRule )
            // InternalDsl.g:780:5: lv_rule_2_0= ruleAbstractMappingRule
            {

            					newCompositeNode(grammarAccess.getNotMappingRuleAccess().getRuleAbstractMappingRuleParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_9);
            lv_rule_2_0=ruleAbstractMappingRule();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNotMappingRuleRule());
            					}
            					set(
            						current,
            						"rule",
            						lv_rule_2_0,
            						"org.framed.orm.editPolicy.model.dsl.Dsl.AbstractMappingRule");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getNotMappingRuleAccess().getRightCurlyBracketKeyword_3());
            		

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
    // InternalDsl.g:805:1: entryRuleOrMappingRule returns [EObject current=null] : iv_ruleOrMappingRule= ruleOrMappingRule EOF ;
    public final EObject entryRuleOrMappingRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrMappingRule = null;


        try {
            // InternalDsl.g:805:54: (iv_ruleOrMappingRule= ruleOrMappingRule EOF )
            // InternalDsl.g:806:2: iv_ruleOrMappingRule= ruleOrMappingRule EOF
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
    // InternalDsl.g:812:1: ruleOrMappingRule returns [EObject current=null] : (otherlv_0= 'OrMappingRule' otherlv_1= '{' ( (lv_rules_2_0= ruleAbstractMappingRule ) ) (otherlv_3= ',' ( (lv_rules_4_0= ruleAbstractMappingRule ) ) )* otherlv_5= '}' ) ;
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
            // InternalDsl.g:818:2: ( (otherlv_0= 'OrMappingRule' otherlv_1= '{' ( (lv_rules_2_0= ruleAbstractMappingRule ) ) (otherlv_3= ',' ( (lv_rules_4_0= ruleAbstractMappingRule ) ) )* otherlv_5= '}' ) )
            // InternalDsl.g:819:2: (otherlv_0= 'OrMappingRule' otherlv_1= '{' ( (lv_rules_2_0= ruleAbstractMappingRule ) ) (otherlv_3= ',' ( (lv_rules_4_0= ruleAbstractMappingRule ) ) )* otherlv_5= '}' )
            {
            // InternalDsl.g:819:2: (otherlv_0= 'OrMappingRule' otherlv_1= '{' ( (lv_rules_2_0= ruleAbstractMappingRule ) ) (otherlv_3= ',' ( (lv_rules_4_0= ruleAbstractMappingRule ) ) )* otherlv_5= '}' )
            // InternalDsl.g:820:3: otherlv_0= 'OrMappingRule' otherlv_1= '{' ( (lv_rules_2_0= ruleAbstractMappingRule ) ) (otherlv_3= ',' ( (lv_rules_4_0= ruleAbstractMappingRule ) ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,26,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getOrMappingRuleAccess().getOrMappingRuleKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_15); 

            			newLeafNode(otherlv_1, grammarAccess.getOrMappingRuleAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalDsl.g:828:3: ( (lv_rules_2_0= ruleAbstractMappingRule ) )
            // InternalDsl.g:829:4: (lv_rules_2_0= ruleAbstractMappingRule )
            {
            // InternalDsl.g:829:4: (lv_rules_2_0= ruleAbstractMappingRule )
            // InternalDsl.g:830:5: lv_rules_2_0= ruleAbstractMappingRule
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

            // InternalDsl.g:847:3: (otherlv_3= ',' ( (lv_rules_4_0= ruleAbstractMappingRule ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==15) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalDsl.g:848:4: otherlv_3= ',' ( (lv_rules_4_0= ruleAbstractMappingRule ) )
            	    {
            	    otherlv_3=(Token)match(input,15,FOLLOW_15); 

            	    				newLeafNode(otherlv_3, grammarAccess.getOrMappingRuleAccess().getCommaKeyword_3_0());
            	    			
            	    // InternalDsl.g:852:4: ( (lv_rules_4_0= ruleAbstractMappingRule ) )
            	    // InternalDsl.g:853:5: (lv_rules_4_0= ruleAbstractMappingRule )
            	    {
            	    // InternalDsl.g:853:5: (lv_rules_4_0= ruleAbstractMappingRule )
            	    // InternalDsl.g:854:6: lv_rules_4_0= ruleAbstractMappingRule
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
            	    break loop8;
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
    // InternalDsl.g:880:1: entryRuleImplicationMappingRule returns [EObject current=null] : iv_ruleImplicationMappingRule= ruleImplicationMappingRule EOF ;
    public final EObject entryRuleImplicationMappingRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImplicationMappingRule = null;


        try {
            // InternalDsl.g:880:63: (iv_ruleImplicationMappingRule= ruleImplicationMappingRule EOF )
            // InternalDsl.g:881:2: iv_ruleImplicationMappingRule= ruleImplicationMappingRule EOF
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
    // InternalDsl.g:887:1: ruleImplicationMappingRule returns [EObject current=null] : (otherlv_0= 'ImplicationMappingRule' otherlv_1= '{' otherlv_2= 'if' ( (lv_antecedent_3_0= ruleAbstractMappingRule ) ) otherlv_4= 'then' ( (lv_consequent_5_0= ruleAbstractMappingRule ) ) otherlv_6= '}' ) ;
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
            // InternalDsl.g:893:2: ( (otherlv_0= 'ImplicationMappingRule' otherlv_1= '{' otherlv_2= 'if' ( (lv_antecedent_3_0= ruleAbstractMappingRule ) ) otherlv_4= 'then' ( (lv_consequent_5_0= ruleAbstractMappingRule ) ) otherlv_6= '}' ) )
            // InternalDsl.g:894:2: (otherlv_0= 'ImplicationMappingRule' otherlv_1= '{' otherlv_2= 'if' ( (lv_antecedent_3_0= ruleAbstractMappingRule ) ) otherlv_4= 'then' ( (lv_consequent_5_0= ruleAbstractMappingRule ) ) otherlv_6= '}' )
            {
            // InternalDsl.g:894:2: (otherlv_0= 'ImplicationMappingRule' otherlv_1= '{' otherlv_2= 'if' ( (lv_antecedent_3_0= ruleAbstractMappingRule ) ) otherlv_4= 'then' ( (lv_consequent_5_0= ruleAbstractMappingRule ) ) otherlv_6= '}' )
            // InternalDsl.g:895:3: otherlv_0= 'ImplicationMappingRule' otherlv_1= '{' otherlv_2= 'if' ( (lv_antecedent_3_0= ruleAbstractMappingRule ) ) otherlv_4= 'then' ( (lv_consequent_5_0= ruleAbstractMappingRule ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,27,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getImplicationMappingRuleAccess().getImplicationMappingRuleKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_17); 

            			newLeafNode(otherlv_1, grammarAccess.getImplicationMappingRuleAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,28,FOLLOW_15); 

            			newLeafNode(otherlv_2, grammarAccess.getImplicationMappingRuleAccess().getIfKeyword_2());
            		
            // InternalDsl.g:907:3: ( (lv_antecedent_3_0= ruleAbstractMappingRule ) )
            // InternalDsl.g:908:4: (lv_antecedent_3_0= ruleAbstractMappingRule )
            {
            // InternalDsl.g:908:4: (lv_antecedent_3_0= ruleAbstractMappingRule )
            // InternalDsl.g:909:5: lv_antecedent_3_0= ruleAbstractMappingRule
            {

            					newCompositeNode(grammarAccess.getImplicationMappingRuleAccess().getAntecedentAbstractMappingRuleParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_18);
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

            otherlv_4=(Token)match(input,29,FOLLOW_15); 

            			newLeafNode(otherlv_4, grammarAccess.getImplicationMappingRuleAccess().getThenKeyword_4());
            		
            // InternalDsl.g:930:3: ( (lv_consequent_5_0= ruleAbstractMappingRule ) )
            // InternalDsl.g:931:4: (lv_consequent_5_0= ruleAbstractMappingRule )
            {
            // InternalDsl.g:931:4: (lv_consequent_5_0= ruleAbstractMappingRule )
            // InternalDsl.g:932:5: lv_consequent_5_0= ruleAbstractMappingRule
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
    // InternalDsl.g:957:1: entryRuleTrueMappingRule returns [EObject current=null] : iv_ruleTrueMappingRule= ruleTrueMappingRule EOF ;
    public final EObject entryRuleTrueMappingRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTrueMappingRule = null;


        try {
            // InternalDsl.g:957:56: (iv_ruleTrueMappingRule= ruleTrueMappingRule EOF )
            // InternalDsl.g:958:2: iv_ruleTrueMappingRule= ruleTrueMappingRule EOF
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
    // InternalDsl.g:964:1: ruleTrueMappingRule returns [EObject current=null] : ( () otherlv_1= 'TrueMappingRule' ) ;
    public final EObject ruleTrueMappingRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalDsl.g:970:2: ( ( () otherlv_1= 'TrueMappingRule' ) )
            // InternalDsl.g:971:2: ( () otherlv_1= 'TrueMappingRule' )
            {
            // InternalDsl.g:971:2: ( () otherlv_1= 'TrueMappingRule' )
            // InternalDsl.g:972:3: () otherlv_1= 'TrueMappingRule'
            {
            // InternalDsl.g:972:3: ()
            // InternalDsl.g:973:4: 
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


    // $ANTLR start "entryRuleEString"
    // InternalDsl.g:987:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalDsl.g:987:47: (iv_ruleEString= ruleEString EOF )
            // InternalDsl.g:988:2: iv_ruleEString= ruleEString EOF
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
    // InternalDsl.g:994:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalDsl.g:1000:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalDsl.g:1001:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalDsl.g:1001:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_STRING) ) {
                alt9=1;
            }
            else if ( (LA9_0==RULE_ID) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalDsl.g:1002:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalDsl.g:1010:3: this_ID_1= RULE_ID
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
    // InternalDsl.g:1021:1: entryRuleAndRule returns [EObject current=null] : iv_ruleAndRule= ruleAndRule EOF ;
    public final EObject entryRuleAndRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAndRule = null;


        try {
            // InternalDsl.g:1021:48: (iv_ruleAndRule= ruleAndRule EOF )
            // InternalDsl.g:1022:2: iv_ruleAndRule= ruleAndRule EOF
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
    // InternalDsl.g:1028:1: ruleAndRule returns [EObject current=null] : (otherlv_0= 'AndRule' otherlv_1= '{' ( (lv_rules_2_0= ruleAbstractRule ) ) (otherlv_3= ',' ( (lv_rules_4_0= ruleAbstractRule ) ) )* otherlv_5= '}' ) ;
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
            // InternalDsl.g:1034:2: ( (otherlv_0= 'AndRule' otherlv_1= '{' ( (lv_rules_2_0= ruleAbstractRule ) ) (otherlv_3= ',' ( (lv_rules_4_0= ruleAbstractRule ) ) )* otherlv_5= '}' ) )
            // InternalDsl.g:1035:2: (otherlv_0= 'AndRule' otherlv_1= '{' ( (lv_rules_2_0= ruleAbstractRule ) ) (otherlv_3= ',' ( (lv_rules_4_0= ruleAbstractRule ) ) )* otherlv_5= '}' )
            {
            // InternalDsl.g:1035:2: (otherlv_0= 'AndRule' otherlv_1= '{' ( (lv_rules_2_0= ruleAbstractRule ) ) (otherlv_3= ',' ( (lv_rules_4_0= ruleAbstractRule ) ) )* otherlv_5= '}' )
            // InternalDsl.g:1036:3: otherlv_0= 'AndRule' otherlv_1= '{' ( (lv_rules_2_0= ruleAbstractRule ) ) (otherlv_3= ',' ( (lv_rules_4_0= ruleAbstractRule ) ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,31,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getAndRuleAccess().getAndRuleKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getAndRuleAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalDsl.g:1044:3: ( (lv_rules_2_0= ruleAbstractRule ) )
            // InternalDsl.g:1045:4: (lv_rules_2_0= ruleAbstractRule )
            {
            // InternalDsl.g:1045:4: (lv_rules_2_0= ruleAbstractRule )
            // InternalDsl.g:1046:5: lv_rules_2_0= ruleAbstractRule
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

            // InternalDsl.g:1063:3: (otherlv_3= ',' ( (lv_rules_4_0= ruleAbstractRule ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==15) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalDsl.g:1064:4: otherlv_3= ',' ( (lv_rules_4_0= ruleAbstractRule ) )
            	    {
            	    otherlv_3=(Token)match(input,15,FOLLOW_13); 

            	    				newLeafNode(otherlv_3, grammarAccess.getAndRuleAccess().getCommaKeyword_3_0());
            	    			
            	    // InternalDsl.g:1068:4: ( (lv_rules_4_0= ruleAbstractRule ) )
            	    // InternalDsl.g:1069:5: (lv_rules_4_0= ruleAbstractRule )
            	    {
            	    // InternalDsl.g:1069:5: (lv_rules_4_0= ruleAbstractRule )
            	    // InternalDsl.g:1070:6: lv_rules_4_0= ruleAbstractRule
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
            	    break loop10;
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
    // InternalDsl.g:1096:1: entryRuleRelationNameRule returns [EObject current=null] : iv_ruleRelationNameRule= ruleRelationNameRule EOF ;
    public final EObject entryRuleRelationNameRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelationNameRule = null;


        try {
            // InternalDsl.g:1096:57: (iv_ruleRelationNameRule= ruleRelationNameRule EOF )
            // InternalDsl.g:1097:2: iv_ruleRelationNameRule= ruleRelationNameRule EOF
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
    // InternalDsl.g:1103:1: ruleRelationNameRule returns [EObject current=null] : ( () otherlv_1= 'RelationNameRule' ( (lv_name_2_0= ruleEString ) ) ) ;
    public final EObject ruleRelationNameRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:1109:2: ( ( () otherlv_1= 'RelationNameRule' ( (lv_name_2_0= ruleEString ) ) ) )
            // InternalDsl.g:1110:2: ( () otherlv_1= 'RelationNameRule' ( (lv_name_2_0= ruleEString ) ) )
            {
            // InternalDsl.g:1110:2: ( () otherlv_1= 'RelationNameRule' ( (lv_name_2_0= ruleEString ) ) )
            // InternalDsl.g:1111:3: () otherlv_1= 'RelationNameRule' ( (lv_name_2_0= ruleEString ) )
            {
            // InternalDsl.g:1111:3: ()
            // InternalDsl.g:1112:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRelationNameRuleAccess().getRelationNameRuleAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,32,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getRelationNameRuleAccess().getRelationNameRuleKeyword_1());
            		
            // InternalDsl.g:1122:3: ( (lv_name_2_0= ruleEString ) )
            // InternalDsl.g:1123:4: (lv_name_2_0= ruleEString )
            {
            // InternalDsl.g:1123:4: (lv_name_2_0= ruleEString )
            // InternalDsl.g:1124:5: lv_name_2_0= ruleEString
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
    // InternalDsl.g:1145:1: entryRuleOrRule returns [EObject current=null] : iv_ruleOrRule= ruleOrRule EOF ;
    public final EObject entryRuleOrRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrRule = null;


        try {
            // InternalDsl.g:1145:47: (iv_ruleOrRule= ruleOrRule EOF )
            // InternalDsl.g:1146:2: iv_ruleOrRule= ruleOrRule EOF
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
    // InternalDsl.g:1152:1: ruleOrRule returns [EObject current=null] : (otherlv_0= 'OrRule' otherlv_1= '{' ( (lv_rules_2_0= ruleAbstractRule ) ) (otherlv_3= ',' ( (lv_rules_4_0= ruleAbstractRule ) ) )* otherlv_5= '}' ) ;
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
            // InternalDsl.g:1158:2: ( (otherlv_0= 'OrRule' otherlv_1= '{' ( (lv_rules_2_0= ruleAbstractRule ) ) (otherlv_3= ',' ( (lv_rules_4_0= ruleAbstractRule ) ) )* otherlv_5= '}' ) )
            // InternalDsl.g:1159:2: (otherlv_0= 'OrRule' otherlv_1= '{' ( (lv_rules_2_0= ruleAbstractRule ) ) (otherlv_3= ',' ( (lv_rules_4_0= ruleAbstractRule ) ) )* otherlv_5= '}' )
            {
            // InternalDsl.g:1159:2: (otherlv_0= 'OrRule' otherlv_1= '{' ( (lv_rules_2_0= ruleAbstractRule ) ) (otherlv_3= ',' ( (lv_rules_4_0= ruleAbstractRule ) ) )* otherlv_5= '}' )
            // InternalDsl.g:1160:3: otherlv_0= 'OrRule' otherlv_1= '{' ( (lv_rules_2_0= ruleAbstractRule ) ) (otherlv_3= ',' ( (lv_rules_4_0= ruleAbstractRule ) ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,33,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getOrRuleAccess().getOrRuleKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getOrRuleAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalDsl.g:1168:3: ( (lv_rules_2_0= ruleAbstractRule ) )
            // InternalDsl.g:1169:4: (lv_rules_2_0= ruleAbstractRule )
            {
            // InternalDsl.g:1169:4: (lv_rules_2_0= ruleAbstractRule )
            // InternalDsl.g:1170:5: lv_rules_2_0= ruleAbstractRule
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

            // InternalDsl.g:1187:3: (otherlv_3= ',' ( (lv_rules_4_0= ruleAbstractRule ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==15) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalDsl.g:1188:4: otherlv_3= ',' ( (lv_rules_4_0= ruleAbstractRule ) )
            	    {
            	    otherlv_3=(Token)match(input,15,FOLLOW_13); 

            	    				newLeafNode(otherlv_3, grammarAccess.getOrRuleAccess().getCommaKeyword_3_0());
            	    			
            	    // InternalDsl.g:1192:4: ( (lv_rules_4_0= ruleAbstractRule ) )
            	    // InternalDsl.g:1193:5: (lv_rules_4_0= ruleAbstractRule )
            	    {
            	    // InternalDsl.g:1193:5: (lv_rules_4_0= ruleAbstractRule )
            	    // InternalDsl.g:1194:6: lv_rules_4_0= ruleAbstractRule
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
            	    break loop11;
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
    // InternalDsl.g:1220:1: entryRuleNotRule returns [EObject current=null] : iv_ruleNotRule= ruleNotRule EOF ;
    public final EObject entryRuleNotRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNotRule = null;


        try {
            // InternalDsl.g:1220:48: (iv_ruleNotRule= ruleNotRule EOF )
            // InternalDsl.g:1221:2: iv_ruleNotRule= ruleNotRule EOF
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
    // InternalDsl.g:1227:1: ruleNotRule returns [EObject current=null] : (otherlv_0= 'NotRule' otherlv_1= '{' ( (lv_rule_2_0= ruleAbstractRule ) ) otherlv_3= '}' ) ;
    public final EObject ruleNotRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_rule_2_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:1233:2: ( (otherlv_0= 'NotRule' otherlv_1= '{' ( (lv_rule_2_0= ruleAbstractRule ) ) otherlv_3= '}' ) )
            // InternalDsl.g:1234:2: (otherlv_0= 'NotRule' otherlv_1= '{' ( (lv_rule_2_0= ruleAbstractRule ) ) otherlv_3= '}' )
            {
            // InternalDsl.g:1234:2: (otherlv_0= 'NotRule' otherlv_1= '{' ( (lv_rule_2_0= ruleAbstractRule ) ) otherlv_3= '}' )
            // InternalDsl.g:1235:3: otherlv_0= 'NotRule' otherlv_1= '{' ( (lv_rule_2_0= ruleAbstractRule ) ) otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,34,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getNotRuleAccess().getNotRuleKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getNotRuleAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalDsl.g:1243:3: ( (lv_rule_2_0= ruleAbstractRule ) )
            // InternalDsl.g:1244:4: (lv_rule_2_0= ruleAbstractRule )
            {
            // InternalDsl.g:1244:4: (lv_rule_2_0= ruleAbstractRule )
            // InternalDsl.g:1245:5: lv_rule_2_0= ruleAbstractRule
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
    // InternalDsl.g:1270:1: entryRuleImplicationRule returns [EObject current=null] : iv_ruleImplicationRule= ruleImplicationRule EOF ;
    public final EObject entryRuleImplicationRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImplicationRule = null;


        try {
            // InternalDsl.g:1270:56: (iv_ruleImplicationRule= ruleImplicationRule EOF )
            // InternalDsl.g:1271:2: iv_ruleImplicationRule= ruleImplicationRule EOF
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
    // InternalDsl.g:1277:1: ruleImplicationRule returns [EObject current=null] : (otherlv_0= 'ImplicationRule' otherlv_1= '{' otherlv_2= 'if' ( (lv_antecedent_3_0= ruleAbstractRule ) ) otherlv_4= 'then' ( (lv_consequent_5_0= ruleAbstractRule ) ) otherlv_6= '}' ) ;
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
            // InternalDsl.g:1283:2: ( (otherlv_0= 'ImplicationRule' otherlv_1= '{' otherlv_2= 'if' ( (lv_antecedent_3_0= ruleAbstractRule ) ) otherlv_4= 'then' ( (lv_consequent_5_0= ruleAbstractRule ) ) otherlv_6= '}' ) )
            // InternalDsl.g:1284:2: (otherlv_0= 'ImplicationRule' otherlv_1= '{' otherlv_2= 'if' ( (lv_antecedent_3_0= ruleAbstractRule ) ) otherlv_4= 'then' ( (lv_consequent_5_0= ruleAbstractRule ) ) otherlv_6= '}' )
            {
            // InternalDsl.g:1284:2: (otherlv_0= 'ImplicationRule' otherlv_1= '{' otherlv_2= 'if' ( (lv_antecedent_3_0= ruleAbstractRule ) ) otherlv_4= 'then' ( (lv_consequent_5_0= ruleAbstractRule ) ) otherlv_6= '}' )
            // InternalDsl.g:1285:3: otherlv_0= 'ImplicationRule' otherlv_1= '{' otherlv_2= 'if' ( (lv_antecedent_3_0= ruleAbstractRule ) ) otherlv_4= 'then' ( (lv_consequent_5_0= ruleAbstractRule ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,35,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getImplicationRuleAccess().getImplicationRuleKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_17); 

            			newLeafNode(otherlv_1, grammarAccess.getImplicationRuleAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,28,FOLLOW_13); 

            			newLeafNode(otherlv_2, grammarAccess.getImplicationRuleAccess().getIfKeyword_2());
            		
            // InternalDsl.g:1297:3: ( (lv_antecedent_3_0= ruleAbstractRule ) )
            // InternalDsl.g:1298:4: (lv_antecedent_3_0= ruleAbstractRule )
            {
            // InternalDsl.g:1298:4: (lv_antecedent_3_0= ruleAbstractRule )
            // InternalDsl.g:1299:5: lv_antecedent_3_0= ruleAbstractRule
            {

            					newCompositeNode(grammarAccess.getImplicationRuleAccess().getAntecedentAbstractRuleParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_18);
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
            		
            // InternalDsl.g:1320:3: ( (lv_consequent_5_0= ruleAbstractRule ) )
            // InternalDsl.g:1321:4: (lv_consequent_5_0= ruleAbstractRule )
            {
            // InternalDsl.g:1321:4: (lv_consequent_5_0= ruleAbstractRule )
            // InternalDsl.g:1322:5: lv_consequent_5_0= ruleAbstractRule
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
    // InternalDsl.g:1347:1: entryRuleSourceTypeRule returns [EObject current=null] : iv_ruleSourceTypeRule= ruleSourceTypeRule EOF ;
    public final EObject entryRuleSourceTypeRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSourceTypeRule = null;


        try {
            // InternalDsl.g:1347:55: (iv_ruleSourceTypeRule= ruleSourceTypeRule EOF )
            // InternalDsl.g:1348:2: iv_ruleSourceTypeRule= ruleSourceTypeRule EOF
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
    // InternalDsl.g:1354:1: ruleSourceTypeRule returns [EObject current=null] : ( () otherlv_1= 'SourceTypeRule' ( (lv_name_2_0= ruleEString ) ) ) ;
    public final EObject ruleSourceTypeRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:1360:2: ( ( () otherlv_1= 'SourceTypeRule' ( (lv_name_2_0= ruleEString ) ) ) )
            // InternalDsl.g:1361:2: ( () otherlv_1= 'SourceTypeRule' ( (lv_name_2_0= ruleEString ) ) )
            {
            // InternalDsl.g:1361:2: ( () otherlv_1= 'SourceTypeRule' ( (lv_name_2_0= ruleEString ) ) )
            // InternalDsl.g:1362:3: () otherlv_1= 'SourceTypeRule' ( (lv_name_2_0= ruleEString ) )
            {
            // InternalDsl.g:1362:3: ()
            // InternalDsl.g:1363:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSourceTypeRuleAccess().getSourceTypeRuleAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,36,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getSourceTypeRuleAccess().getSourceTypeRuleKeyword_1());
            		
            // InternalDsl.g:1373:3: ( (lv_name_2_0= ruleEString ) )
            // InternalDsl.g:1374:4: (lv_name_2_0= ruleEString )
            {
            // InternalDsl.g:1374:4: (lv_name_2_0= ruleEString )
            // InternalDsl.g:1375:5: lv_name_2_0= ruleEString
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
    // InternalDsl.g:1396:1: entryRuleTargetTypeRule returns [EObject current=null] : iv_ruleTargetTypeRule= ruleTargetTypeRule EOF ;
    public final EObject entryRuleTargetTypeRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTargetTypeRule = null;


        try {
            // InternalDsl.g:1396:55: (iv_ruleTargetTypeRule= ruleTargetTypeRule EOF )
            // InternalDsl.g:1397:2: iv_ruleTargetTypeRule= ruleTargetTypeRule EOF
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
    // InternalDsl.g:1403:1: ruleTargetTypeRule returns [EObject current=null] : ( () otherlv_1= 'TargetTypeRule' ( (lv_name_2_0= ruleEString ) ) ) ;
    public final EObject ruleTargetTypeRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:1409:2: ( ( () otherlv_1= 'TargetTypeRule' ( (lv_name_2_0= ruleEString ) ) ) )
            // InternalDsl.g:1410:2: ( () otherlv_1= 'TargetTypeRule' ( (lv_name_2_0= ruleEString ) ) )
            {
            // InternalDsl.g:1410:2: ( () otherlv_1= 'TargetTypeRule' ( (lv_name_2_0= ruleEString ) ) )
            // InternalDsl.g:1411:3: () otherlv_1= 'TargetTypeRule' ( (lv_name_2_0= ruleEString ) )
            {
            // InternalDsl.g:1411:3: ()
            // InternalDsl.g:1412:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTargetTypeRuleAccess().getTargetTypeRuleAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,37,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getTargetTypeRuleAccess().getTargetTypeRuleKeyword_1());
            		
            // InternalDsl.g:1422:3: ( (lv_name_2_0= ruleEString ) )
            // InternalDsl.g:1423:4: (lv_name_2_0= ruleEString )
            {
            // InternalDsl.g:1423:4: (lv_name_2_0= ruleEString )
            // InternalDsl.g:1424:5: lv_name_2_0= ruleEString
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
    // InternalDsl.g:1445:1: entryRuleCommandNameRule returns [EObject current=null] : iv_ruleCommandNameRule= ruleCommandNameRule EOF ;
    public final EObject entryRuleCommandNameRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommandNameRule = null;


        try {
            // InternalDsl.g:1445:56: (iv_ruleCommandNameRule= ruleCommandNameRule EOF )
            // InternalDsl.g:1446:2: iv_ruleCommandNameRule= ruleCommandNameRule EOF
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
    // InternalDsl.g:1452:1: ruleCommandNameRule returns [EObject current=null] : ( () otherlv_1= 'CommandNameRule' ( (lv_name_2_0= ruleEString ) ) ) ;
    public final EObject ruleCommandNameRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:1458:2: ( ( () otherlv_1= 'CommandNameRule' ( (lv_name_2_0= ruleEString ) ) ) )
            // InternalDsl.g:1459:2: ( () otherlv_1= 'CommandNameRule' ( (lv_name_2_0= ruleEString ) ) )
            {
            // InternalDsl.g:1459:2: ( () otherlv_1= 'CommandNameRule' ( (lv_name_2_0= ruleEString ) ) )
            // InternalDsl.g:1460:3: () otherlv_1= 'CommandNameRule' ( (lv_name_2_0= ruleEString ) )
            {
            // InternalDsl.g:1460:3: ()
            // InternalDsl.g:1461:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCommandNameRuleAccess().getCommandNameRuleAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,38,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getCommandNameRuleAccess().getCommandNameRuleKeyword_1());
            		
            // InternalDsl.g:1471:3: ( (lv_name_2_0= ruleEString ) )
            // InternalDsl.g:1472:4: (lv_name_2_0= ruleEString )
            {
            // InternalDsl.g:1472:4: (lv_name_2_0= ruleEString )
            // InternalDsl.g:1473:5: lv_name_2_0= ruleEString
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
    // InternalDsl.g:1494:1: entryRuleShapeTypeRule returns [EObject current=null] : iv_ruleShapeTypeRule= ruleShapeTypeRule EOF ;
    public final EObject entryRuleShapeTypeRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleShapeTypeRule = null;


        try {
            // InternalDsl.g:1494:54: (iv_ruleShapeTypeRule= ruleShapeTypeRule EOF )
            // InternalDsl.g:1495:2: iv_ruleShapeTypeRule= ruleShapeTypeRule EOF
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
    // InternalDsl.g:1501:1: ruleShapeTypeRule returns [EObject current=null] : ( () otherlv_1= 'ShapeTypeRule' ( (lv_name_2_0= ruleEString ) ) ) ;
    public final EObject ruleShapeTypeRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:1507:2: ( ( () otherlv_1= 'ShapeTypeRule' ( (lv_name_2_0= ruleEString ) ) ) )
            // InternalDsl.g:1508:2: ( () otherlv_1= 'ShapeTypeRule' ( (lv_name_2_0= ruleEString ) ) )
            {
            // InternalDsl.g:1508:2: ( () otherlv_1= 'ShapeTypeRule' ( (lv_name_2_0= ruleEString ) ) )
            // InternalDsl.g:1509:3: () otherlv_1= 'ShapeTypeRule' ( (lv_name_2_0= ruleEString ) )
            {
            // InternalDsl.g:1509:3: ()
            // InternalDsl.g:1510:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getShapeTypeRuleAccess().getShapeTypeRuleAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,39,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getShapeTypeRuleAccess().getShapeTypeRuleKeyword_1());
            		
            // InternalDsl.g:1520:3: ( (lv_name_2_0= ruleEString ) )
            // InternalDsl.g:1521:4: (lv_name_2_0= ruleEString )
            {
            // InternalDsl.g:1521:4: (lv_name_2_0= ruleEString )
            // InternalDsl.g:1522:5: lv_name_2_0= ruleEString
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
    // InternalDsl.g:1543:1: entryRuleParentTypeRule returns [EObject current=null] : iv_ruleParentTypeRule= ruleParentTypeRule EOF ;
    public final EObject entryRuleParentTypeRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParentTypeRule = null;


        try {
            // InternalDsl.g:1543:55: (iv_ruleParentTypeRule= ruleParentTypeRule EOF )
            // InternalDsl.g:1544:2: iv_ruleParentTypeRule= ruleParentTypeRule EOF
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
    // InternalDsl.g:1550:1: ruleParentTypeRule returns [EObject current=null] : ( () otherlv_1= 'ParentTypeRule' ( (lv_name_2_0= ruleEString ) ) ) ;
    public final EObject ruleParentTypeRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:1556:2: ( ( () otherlv_1= 'ParentTypeRule' ( (lv_name_2_0= ruleEString ) ) ) )
            // InternalDsl.g:1557:2: ( () otherlv_1= 'ParentTypeRule' ( (lv_name_2_0= ruleEString ) ) )
            {
            // InternalDsl.g:1557:2: ( () otherlv_1= 'ParentTypeRule' ( (lv_name_2_0= ruleEString ) ) )
            // InternalDsl.g:1558:3: () otherlv_1= 'ParentTypeRule' ( (lv_name_2_0= ruleEString ) )
            {
            // InternalDsl.g:1558:3: ()
            // InternalDsl.g:1559:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getParentTypeRuleAccess().getParentTypeRuleAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,40,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getParentTypeRuleAccess().getParentTypeRuleKeyword_1());
            		
            // InternalDsl.g:1569:3: ( (lv_name_2_0= ruleEString ) )
            // InternalDsl.g:1570:4: (lv_name_2_0= ruleEString )
            {
            // InternalDsl.g:1570:4: (lv_name_2_0= ruleEString )
            // InternalDsl.g:1571:5: lv_name_2_0= ruleEString
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
    // InternalDsl.g:1592:1: entryRuleStepInRule returns [EObject current=null] : iv_ruleStepInRule= ruleStepInRule EOF ;
    public final EObject entryRuleStepInRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStepInRule = null;


        try {
            // InternalDsl.g:1592:51: (iv_ruleStepInRule= ruleStepInRule EOF )
            // InternalDsl.g:1593:2: iv_ruleStepInRule= ruleStepInRule EOF
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
    // InternalDsl.g:1599:1: ruleStepInRule returns [EObject current=null] : ( () otherlv_1= 'StepInRule' ) ;
    public final EObject ruleStepInRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalDsl.g:1605:2: ( ( () otherlv_1= 'StepInRule' ) )
            // InternalDsl.g:1606:2: ( () otherlv_1= 'StepInRule' )
            {
            // InternalDsl.g:1606:2: ( () otherlv_1= 'StepInRule' )
            // InternalDsl.g:1607:3: () otherlv_1= 'StepInRule'
            {
            // InternalDsl.g:1607:3: ()
            // InternalDsl.g:1608:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getStepInRuleAccess().getStepInRuleAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,41,FOLLOW_2); 

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
    // InternalDsl.g:1622:1: entryRuleTrueRule returns [EObject current=null] : iv_ruleTrueRule= ruleTrueRule EOF ;
    public final EObject entryRuleTrueRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTrueRule = null;


        try {
            // InternalDsl.g:1622:49: (iv_ruleTrueRule= ruleTrueRule EOF )
            // InternalDsl.g:1623:2: iv_ruleTrueRule= ruleTrueRule EOF
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
    // InternalDsl.g:1629:1: ruleTrueRule returns [EObject current=null] : ( () otherlv_1= 'TrueRule' ) ;
    public final EObject ruleTrueRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalDsl.g:1635:2: ( ( () otherlv_1= 'TrueRule' ) )
            // InternalDsl.g:1636:2: ( () otherlv_1= 'TrueRule' )
            {
            // InternalDsl.g:1636:2: ( () otherlv_1= 'TrueRule' )
            // InternalDsl.g:1637:3: () otherlv_1= 'TrueRule'
            {
            // InternalDsl.g:1637:3: ()
            // InternalDsl.g:1638:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTrueRuleAccess().getTrueRuleAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,42,FOLLOW_2); 

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
    // InternalDsl.g:1652:1: entryRuleFalseRule returns [EObject current=null] : iv_ruleFalseRule= ruleFalseRule EOF ;
    public final EObject entryRuleFalseRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFalseRule = null;


        try {
            // InternalDsl.g:1652:50: (iv_ruleFalseRule= ruleFalseRule EOF )
            // InternalDsl.g:1653:2: iv_ruleFalseRule= ruleFalseRule EOF
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
    // InternalDsl.g:1659:1: ruleFalseRule returns [EObject current=null] : ( () otherlv_1= 'FalseRule' ) ;
    public final EObject ruleFalseRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalDsl.g:1665:2: ( ( () otherlv_1= 'FalseRule' ) )
            // InternalDsl.g:1666:2: ( () otherlv_1= 'FalseRule' )
            {
            // InternalDsl.g:1666:2: ( () otherlv_1= 'FalseRule' )
            // InternalDsl.g:1667:3: () otherlv_1= 'FalseRule'
            {
            // InternalDsl.g:1667:3: ()
            // InternalDsl.g:1668:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getFalseRuleAccess().getFalseRuleAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,43,FOLLOW_2); 

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
    // InternalDsl.g:1682:1: entryRuleShapeNameRule returns [EObject current=null] : iv_ruleShapeNameRule= ruleShapeNameRule EOF ;
    public final EObject entryRuleShapeNameRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleShapeNameRule = null;


        try {
            // InternalDsl.g:1682:54: (iv_ruleShapeNameRule= ruleShapeNameRule EOF )
            // InternalDsl.g:1683:2: iv_ruleShapeNameRule= ruleShapeNameRule EOF
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
    // InternalDsl.g:1689:1: ruleShapeNameRule returns [EObject current=null] : ( () otherlv_1= 'ShapeNameRule' ( (lv_name_2_0= ruleEString ) ) ) ;
    public final EObject ruleShapeNameRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:1695:2: ( ( () otherlv_1= 'ShapeNameRule' ( (lv_name_2_0= ruleEString ) ) ) )
            // InternalDsl.g:1696:2: ( () otherlv_1= 'ShapeNameRule' ( (lv_name_2_0= ruleEString ) ) )
            {
            // InternalDsl.g:1696:2: ( () otherlv_1= 'ShapeNameRule' ( (lv_name_2_0= ruleEString ) ) )
            // InternalDsl.g:1697:3: () otherlv_1= 'ShapeNameRule' ( (lv_name_2_0= ruleEString ) )
            {
            // InternalDsl.g:1697:3: ()
            // InternalDsl.g:1698:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getShapeNameRuleAccess().getShapeNameRuleAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,44,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getShapeNameRuleAccess().getShapeNameRuleKeyword_1());
            		
            // InternalDsl.g:1708:3: ( (lv_name_2_0= ruleEString ) )
            // InternalDsl.g:1709:4: (lv_name_2_0= ruleEString )
            {
            // InternalDsl.g:1709:4: (lv_name_2_0= ruleEString )
            // InternalDsl.g:1710:5: lv_name_2_0= ruleEString
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

    // Delegated rules


 

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
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x00001FFF80000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x000000004F800000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000020000000L});

}