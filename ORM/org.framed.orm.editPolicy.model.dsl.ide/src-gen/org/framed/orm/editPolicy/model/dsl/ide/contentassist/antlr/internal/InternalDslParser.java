package org.framed.orm.editPolicy.model.dsl.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.framed.orm.editPolicy.model.dsl.services.DslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "':'", "'true'", "'RelationIsCyclic'", "'RelationTypesAreEqual'", "'RelationIsReflexiv'", "'RelationName'", "'TypeExists'", "'SourceType'", "'TargetType'", "'CommandName'", "'ShapeType'", "'ParentType'", "'StepIn'", "'false'", "'ShapeName'", "'=>'", "'||'", "'&&'", "'!'", "'('", "')'"
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
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__30=30;
    public static final int T__19=19;
    public static final int T__31=31;
    public static final int RULE_STRING=4;
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

    	public void setGrammarAccess(DslGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleModel"
    // InternalDsl.g:53:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalDsl.g:54:1: ( ruleModel EOF )
            // InternalDsl.g:55:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalDsl.g:62:1: ruleModel : ( ( rule__Model__Group__0 ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:66:2: ( ( ( rule__Model__Group__0 ) ) )
            // InternalDsl.g:67:2: ( ( rule__Model__Group__0 ) )
            {
            // InternalDsl.g:67:2: ( ( rule__Model__Group__0 ) )
            // InternalDsl.g:68:3: ( rule__Model__Group__0 )
            {
             before(grammarAccess.getModelAccess().getGroup()); 
            // InternalDsl.g:69:3: ( rule__Model__Group__0 )
            // InternalDsl.g:69:4: rule__Model__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRulePolicyRule"
    // InternalDsl.g:78:1: entryRulePolicyRule : rulePolicyRule EOF ;
    public final void entryRulePolicyRule() throws RecognitionException {
        try {
            // InternalDsl.g:79:1: ( rulePolicyRule EOF )
            // InternalDsl.g:80:1: rulePolicyRule EOF
            {
             before(grammarAccess.getPolicyRuleRule()); 
            pushFollow(FOLLOW_1);
            rulePolicyRule();

            state._fsp--;

             after(grammarAccess.getPolicyRuleRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePolicyRule"


    // $ANTLR start "rulePolicyRule"
    // InternalDsl.g:87:1: rulePolicyRule : ( ( rule__PolicyRule__Alternatives ) ) ;
    public final void rulePolicyRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:91:2: ( ( ( rule__PolicyRule__Alternatives ) ) )
            // InternalDsl.g:92:2: ( ( rule__PolicyRule__Alternatives ) )
            {
            // InternalDsl.g:92:2: ( ( rule__PolicyRule__Alternatives ) )
            // InternalDsl.g:93:3: ( rule__PolicyRule__Alternatives )
            {
             before(grammarAccess.getPolicyRuleAccess().getAlternatives()); 
            // InternalDsl.g:94:3: ( rule__PolicyRule__Alternatives )
            // InternalDsl.g:94:4: rule__PolicyRule__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__PolicyRule__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPolicyRuleAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePolicyRule"


    // $ANTLR start "entryRuleMappingRule"
    // InternalDsl.g:103:1: entryRuleMappingRule : ruleMappingRule EOF ;
    public final void entryRuleMappingRule() throws RecognitionException {
        try {
            // InternalDsl.g:104:1: ( ruleMappingRule EOF )
            // InternalDsl.g:105:1: ruleMappingRule EOF
            {
             before(grammarAccess.getMappingRuleRule()); 
            pushFollow(FOLLOW_1);
            ruleMappingRule();

            state._fsp--;

             after(grammarAccess.getMappingRuleRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMappingRule"


    // $ANTLR start "ruleMappingRule"
    // InternalDsl.g:112:1: ruleMappingRule : ( ( rule__MappingRule__Alternatives ) ) ;
    public final void ruleMappingRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:116:2: ( ( ( rule__MappingRule__Alternatives ) ) )
            // InternalDsl.g:117:2: ( ( rule__MappingRule__Alternatives ) )
            {
            // InternalDsl.g:117:2: ( ( rule__MappingRule__Alternatives ) )
            // InternalDsl.g:118:3: ( rule__MappingRule__Alternatives )
            {
             before(grammarAccess.getMappingRuleAccess().getAlternatives()); 
            // InternalDsl.g:119:3: ( rule__MappingRule__Alternatives )
            // InternalDsl.g:119:4: rule__MappingRule__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__MappingRule__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getMappingRuleAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMappingRule"


    // $ANTLR start "entryRuleConfiguration"
    // InternalDsl.g:128:1: entryRuleConfiguration : ruleConfiguration EOF ;
    public final void entryRuleConfiguration() throws RecognitionException {
        try {
            // InternalDsl.g:129:1: ( ruleConfiguration EOF )
            // InternalDsl.g:130:1: ruleConfiguration EOF
            {
             before(grammarAccess.getConfigurationRule()); 
            pushFollow(FOLLOW_1);
            ruleConfiguration();

            state._fsp--;

             after(grammarAccess.getConfigurationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleConfiguration"


    // $ANTLR start "ruleConfiguration"
    // InternalDsl.g:137:1: ruleConfiguration : ( ( rule__Configuration__Group__0 ) ) ;
    public final void ruleConfiguration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:141:2: ( ( ( rule__Configuration__Group__0 ) ) )
            // InternalDsl.g:142:2: ( ( rule__Configuration__Group__0 ) )
            {
            // InternalDsl.g:142:2: ( ( rule__Configuration__Group__0 ) )
            // InternalDsl.g:143:3: ( rule__Configuration__Group__0 )
            {
             before(grammarAccess.getConfigurationAccess().getGroup()); 
            // InternalDsl.g:144:3: ( rule__Configuration__Group__0 )
            // InternalDsl.g:144:4: rule__Configuration__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Configuration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConfigurationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConfiguration"


    // $ANTLR start "entryRulePolicy"
    // InternalDsl.g:153:1: entryRulePolicy : rulePolicy EOF ;
    public final void entryRulePolicy() throws RecognitionException {
        try {
            // InternalDsl.g:154:1: ( rulePolicy EOF )
            // InternalDsl.g:155:1: rulePolicy EOF
            {
             before(grammarAccess.getPolicyRule()); 
            pushFollow(FOLLOW_1);
            rulePolicy();

            state._fsp--;

             after(grammarAccess.getPolicyRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePolicy"


    // $ANTLR start "rulePolicy"
    // InternalDsl.g:162:1: rulePolicy : ( ( rule__Policy__Group__0 ) ) ;
    public final void rulePolicy() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:166:2: ( ( ( rule__Policy__Group__0 ) ) )
            // InternalDsl.g:167:2: ( ( rule__Policy__Group__0 ) )
            {
            // InternalDsl.g:167:2: ( ( rule__Policy__Group__0 ) )
            // InternalDsl.g:168:3: ( rule__Policy__Group__0 )
            {
             before(grammarAccess.getPolicyAccess().getGroup()); 
            // InternalDsl.g:169:3: ( rule__Policy__Group__0 )
            // InternalDsl.g:169:4: rule__Policy__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Policy__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPolicyAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePolicy"


    // $ANTLR start "entryRuleMapping"
    // InternalDsl.g:178:1: entryRuleMapping : ruleMapping EOF ;
    public final void entryRuleMapping() throws RecognitionException {
        try {
            // InternalDsl.g:179:1: ( ruleMapping EOF )
            // InternalDsl.g:180:1: ruleMapping EOF
            {
             before(grammarAccess.getMappingRule()); 
            pushFollow(FOLLOW_1);
            ruleMapping();

            state._fsp--;

             after(grammarAccess.getMappingRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMapping"


    // $ANTLR start "ruleMapping"
    // InternalDsl.g:187:1: ruleMapping : ( ( rule__Mapping__Group__0 ) ) ;
    public final void ruleMapping() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:191:2: ( ( ( rule__Mapping__Group__0 ) ) )
            // InternalDsl.g:192:2: ( ( rule__Mapping__Group__0 ) )
            {
            // InternalDsl.g:192:2: ( ( rule__Mapping__Group__0 ) )
            // InternalDsl.g:193:3: ( rule__Mapping__Group__0 )
            {
             before(grammarAccess.getMappingAccess().getGroup()); 
            // InternalDsl.g:194:3: ( rule__Mapping__Group__0 )
            // InternalDsl.g:194:4: rule__Mapping__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Mapping__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMappingAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMapping"


    // $ANTLR start "entryRuleFeatureNameMappingRule"
    // InternalDsl.g:203:1: entryRuleFeatureNameMappingRule : ruleFeatureNameMappingRule EOF ;
    public final void entryRuleFeatureNameMappingRule() throws RecognitionException {
        try {
            // InternalDsl.g:204:1: ( ruleFeatureNameMappingRule EOF )
            // InternalDsl.g:205:1: ruleFeatureNameMappingRule EOF
            {
             before(grammarAccess.getFeatureNameMappingRuleRule()); 
            pushFollow(FOLLOW_1);
            ruleFeatureNameMappingRule();

            state._fsp--;

             after(grammarAccess.getFeatureNameMappingRuleRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFeatureNameMappingRule"


    // $ANTLR start "ruleFeatureNameMappingRule"
    // InternalDsl.g:212:1: ruleFeatureNameMappingRule : ( ( rule__FeatureNameMappingRule__Group__0 ) ) ;
    public final void ruleFeatureNameMappingRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:216:2: ( ( ( rule__FeatureNameMappingRule__Group__0 ) ) )
            // InternalDsl.g:217:2: ( ( rule__FeatureNameMappingRule__Group__0 ) )
            {
            // InternalDsl.g:217:2: ( ( rule__FeatureNameMappingRule__Group__0 ) )
            // InternalDsl.g:218:3: ( rule__FeatureNameMappingRule__Group__0 )
            {
             before(grammarAccess.getFeatureNameMappingRuleAccess().getGroup()); 
            // InternalDsl.g:219:3: ( rule__FeatureNameMappingRule__Group__0 )
            // InternalDsl.g:219:4: rule__FeatureNameMappingRule__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FeatureNameMappingRule__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFeatureNameMappingRuleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFeatureNameMappingRule"


    // $ANTLR start "entryRuleTrueMappingRule"
    // InternalDsl.g:228:1: entryRuleTrueMappingRule : ruleTrueMappingRule EOF ;
    public final void entryRuleTrueMappingRule() throws RecognitionException {
        try {
            // InternalDsl.g:229:1: ( ruleTrueMappingRule EOF )
            // InternalDsl.g:230:1: ruleTrueMappingRule EOF
            {
             before(grammarAccess.getTrueMappingRuleRule()); 
            pushFollow(FOLLOW_1);
            ruleTrueMappingRule();

            state._fsp--;

             after(grammarAccess.getTrueMappingRuleRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTrueMappingRule"


    // $ANTLR start "ruleTrueMappingRule"
    // InternalDsl.g:237:1: ruleTrueMappingRule : ( ( rule__TrueMappingRule__Group__0 ) ) ;
    public final void ruleTrueMappingRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:241:2: ( ( ( rule__TrueMappingRule__Group__0 ) ) )
            // InternalDsl.g:242:2: ( ( rule__TrueMappingRule__Group__0 ) )
            {
            // InternalDsl.g:242:2: ( ( rule__TrueMappingRule__Group__0 ) )
            // InternalDsl.g:243:3: ( rule__TrueMappingRule__Group__0 )
            {
             before(grammarAccess.getTrueMappingRuleAccess().getGroup()); 
            // InternalDsl.g:244:3: ( rule__TrueMappingRule__Group__0 )
            // InternalDsl.g:244:4: rule__TrueMappingRule__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TrueMappingRule__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTrueMappingRuleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTrueMappingRule"


    // $ANTLR start "entryRuleRelationIsCyclicRule"
    // InternalDsl.g:253:1: entryRuleRelationIsCyclicRule : ruleRelationIsCyclicRule EOF ;
    public final void entryRuleRelationIsCyclicRule() throws RecognitionException {
        try {
            // InternalDsl.g:254:1: ( ruleRelationIsCyclicRule EOF )
            // InternalDsl.g:255:1: ruleRelationIsCyclicRule EOF
            {
             before(grammarAccess.getRelationIsCyclicRuleRule()); 
            pushFollow(FOLLOW_1);
            ruleRelationIsCyclicRule();

            state._fsp--;

             after(grammarAccess.getRelationIsCyclicRuleRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRelationIsCyclicRule"


    // $ANTLR start "ruleRelationIsCyclicRule"
    // InternalDsl.g:262:1: ruleRelationIsCyclicRule : ( ( rule__RelationIsCyclicRule__Group__0 ) ) ;
    public final void ruleRelationIsCyclicRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:266:2: ( ( ( rule__RelationIsCyclicRule__Group__0 ) ) )
            // InternalDsl.g:267:2: ( ( rule__RelationIsCyclicRule__Group__0 ) )
            {
            // InternalDsl.g:267:2: ( ( rule__RelationIsCyclicRule__Group__0 ) )
            // InternalDsl.g:268:3: ( rule__RelationIsCyclicRule__Group__0 )
            {
             before(grammarAccess.getRelationIsCyclicRuleAccess().getGroup()); 
            // InternalDsl.g:269:3: ( rule__RelationIsCyclicRule__Group__0 )
            // InternalDsl.g:269:4: rule__RelationIsCyclicRule__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RelationIsCyclicRule__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRelationIsCyclicRuleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRelationIsCyclicRule"


    // $ANTLR start "entryRuleRelationTypesAreEqualRule"
    // InternalDsl.g:278:1: entryRuleRelationTypesAreEqualRule : ruleRelationTypesAreEqualRule EOF ;
    public final void entryRuleRelationTypesAreEqualRule() throws RecognitionException {
        try {
            // InternalDsl.g:279:1: ( ruleRelationTypesAreEqualRule EOF )
            // InternalDsl.g:280:1: ruleRelationTypesAreEqualRule EOF
            {
             before(grammarAccess.getRelationTypesAreEqualRuleRule()); 
            pushFollow(FOLLOW_1);
            ruleRelationTypesAreEqualRule();

            state._fsp--;

             after(grammarAccess.getRelationTypesAreEqualRuleRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRelationTypesAreEqualRule"


    // $ANTLR start "ruleRelationTypesAreEqualRule"
    // InternalDsl.g:287:1: ruleRelationTypesAreEqualRule : ( ( rule__RelationTypesAreEqualRule__Group__0 ) ) ;
    public final void ruleRelationTypesAreEqualRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:291:2: ( ( ( rule__RelationTypesAreEqualRule__Group__0 ) ) )
            // InternalDsl.g:292:2: ( ( rule__RelationTypesAreEqualRule__Group__0 ) )
            {
            // InternalDsl.g:292:2: ( ( rule__RelationTypesAreEqualRule__Group__0 ) )
            // InternalDsl.g:293:3: ( rule__RelationTypesAreEqualRule__Group__0 )
            {
             before(grammarAccess.getRelationTypesAreEqualRuleAccess().getGroup()); 
            // InternalDsl.g:294:3: ( rule__RelationTypesAreEqualRule__Group__0 )
            // InternalDsl.g:294:4: rule__RelationTypesAreEqualRule__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RelationTypesAreEqualRule__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRelationTypesAreEqualRuleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRelationTypesAreEqualRule"


    // $ANTLR start "entryRuleRelationIsReflexivRule"
    // InternalDsl.g:303:1: entryRuleRelationIsReflexivRule : ruleRelationIsReflexivRule EOF ;
    public final void entryRuleRelationIsReflexivRule() throws RecognitionException {
        try {
            // InternalDsl.g:304:1: ( ruleRelationIsReflexivRule EOF )
            // InternalDsl.g:305:1: ruleRelationIsReflexivRule EOF
            {
             before(grammarAccess.getRelationIsReflexivRuleRule()); 
            pushFollow(FOLLOW_1);
            ruleRelationIsReflexivRule();

            state._fsp--;

             after(grammarAccess.getRelationIsReflexivRuleRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRelationIsReflexivRule"


    // $ANTLR start "ruleRelationIsReflexivRule"
    // InternalDsl.g:312:1: ruleRelationIsReflexivRule : ( ( rule__RelationIsReflexivRule__Group__0 ) ) ;
    public final void ruleRelationIsReflexivRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:316:2: ( ( ( rule__RelationIsReflexivRule__Group__0 ) ) )
            // InternalDsl.g:317:2: ( ( rule__RelationIsReflexivRule__Group__0 ) )
            {
            // InternalDsl.g:317:2: ( ( rule__RelationIsReflexivRule__Group__0 ) )
            // InternalDsl.g:318:3: ( rule__RelationIsReflexivRule__Group__0 )
            {
             before(grammarAccess.getRelationIsReflexivRuleAccess().getGroup()); 
            // InternalDsl.g:319:3: ( rule__RelationIsReflexivRule__Group__0 )
            // InternalDsl.g:319:4: rule__RelationIsReflexivRule__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RelationIsReflexivRule__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRelationIsReflexivRuleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRelationIsReflexivRule"


    // $ANTLR start "entryRuleEString"
    // InternalDsl.g:328:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalDsl.g:329:1: ( ruleEString EOF )
            // InternalDsl.g:330:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalDsl.g:337:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:341:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalDsl.g:342:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalDsl.g:342:2: ( ( rule__EString__Alternatives ) )
            // InternalDsl.g:343:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalDsl.g:344:3: ( rule__EString__Alternatives )
            // InternalDsl.g:344:4: rule__EString__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EString__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEStringAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleRelationNameRule"
    // InternalDsl.g:353:1: entryRuleRelationNameRule : ruleRelationNameRule EOF ;
    public final void entryRuleRelationNameRule() throws RecognitionException {
        try {
            // InternalDsl.g:354:1: ( ruleRelationNameRule EOF )
            // InternalDsl.g:355:1: ruleRelationNameRule EOF
            {
             before(grammarAccess.getRelationNameRuleRule()); 
            pushFollow(FOLLOW_1);
            ruleRelationNameRule();

            state._fsp--;

             after(grammarAccess.getRelationNameRuleRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRelationNameRule"


    // $ANTLR start "ruleRelationNameRule"
    // InternalDsl.g:362:1: ruleRelationNameRule : ( ( rule__RelationNameRule__Group__0 ) ) ;
    public final void ruleRelationNameRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:366:2: ( ( ( rule__RelationNameRule__Group__0 ) ) )
            // InternalDsl.g:367:2: ( ( rule__RelationNameRule__Group__0 ) )
            {
            // InternalDsl.g:367:2: ( ( rule__RelationNameRule__Group__0 ) )
            // InternalDsl.g:368:3: ( rule__RelationNameRule__Group__0 )
            {
             before(grammarAccess.getRelationNameRuleAccess().getGroup()); 
            // InternalDsl.g:369:3: ( rule__RelationNameRule__Group__0 )
            // InternalDsl.g:369:4: rule__RelationNameRule__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RelationNameRule__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRelationNameRuleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRelationNameRule"


    // $ANTLR start "entryRuleTypeExistsRule"
    // InternalDsl.g:378:1: entryRuleTypeExistsRule : ruleTypeExistsRule EOF ;
    public final void entryRuleTypeExistsRule() throws RecognitionException {
        try {
            // InternalDsl.g:379:1: ( ruleTypeExistsRule EOF )
            // InternalDsl.g:380:1: ruleTypeExistsRule EOF
            {
             before(grammarAccess.getTypeExistsRuleRule()); 
            pushFollow(FOLLOW_1);
            ruleTypeExistsRule();

            state._fsp--;

             after(grammarAccess.getTypeExistsRuleRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTypeExistsRule"


    // $ANTLR start "ruleTypeExistsRule"
    // InternalDsl.g:387:1: ruleTypeExistsRule : ( ( rule__TypeExistsRule__Group__0 ) ) ;
    public final void ruleTypeExistsRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:391:2: ( ( ( rule__TypeExistsRule__Group__0 ) ) )
            // InternalDsl.g:392:2: ( ( rule__TypeExistsRule__Group__0 ) )
            {
            // InternalDsl.g:392:2: ( ( rule__TypeExistsRule__Group__0 ) )
            // InternalDsl.g:393:3: ( rule__TypeExistsRule__Group__0 )
            {
             before(grammarAccess.getTypeExistsRuleAccess().getGroup()); 
            // InternalDsl.g:394:3: ( rule__TypeExistsRule__Group__0 )
            // InternalDsl.g:394:4: rule__TypeExistsRule__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TypeExistsRule__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTypeExistsRuleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTypeExistsRule"


    // $ANTLR start "entryRuleSourceTypeRule"
    // InternalDsl.g:403:1: entryRuleSourceTypeRule : ruleSourceTypeRule EOF ;
    public final void entryRuleSourceTypeRule() throws RecognitionException {
        try {
            // InternalDsl.g:404:1: ( ruleSourceTypeRule EOF )
            // InternalDsl.g:405:1: ruleSourceTypeRule EOF
            {
             before(grammarAccess.getSourceTypeRuleRule()); 
            pushFollow(FOLLOW_1);
            ruleSourceTypeRule();

            state._fsp--;

             after(grammarAccess.getSourceTypeRuleRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSourceTypeRule"


    // $ANTLR start "ruleSourceTypeRule"
    // InternalDsl.g:412:1: ruleSourceTypeRule : ( ( rule__SourceTypeRule__Group__0 ) ) ;
    public final void ruleSourceTypeRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:416:2: ( ( ( rule__SourceTypeRule__Group__0 ) ) )
            // InternalDsl.g:417:2: ( ( rule__SourceTypeRule__Group__0 ) )
            {
            // InternalDsl.g:417:2: ( ( rule__SourceTypeRule__Group__0 ) )
            // InternalDsl.g:418:3: ( rule__SourceTypeRule__Group__0 )
            {
             before(grammarAccess.getSourceTypeRuleAccess().getGroup()); 
            // InternalDsl.g:419:3: ( rule__SourceTypeRule__Group__0 )
            // InternalDsl.g:419:4: rule__SourceTypeRule__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SourceTypeRule__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSourceTypeRuleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSourceTypeRule"


    // $ANTLR start "entryRuleTargetTypeRule"
    // InternalDsl.g:428:1: entryRuleTargetTypeRule : ruleTargetTypeRule EOF ;
    public final void entryRuleTargetTypeRule() throws RecognitionException {
        try {
            // InternalDsl.g:429:1: ( ruleTargetTypeRule EOF )
            // InternalDsl.g:430:1: ruleTargetTypeRule EOF
            {
             before(grammarAccess.getTargetTypeRuleRule()); 
            pushFollow(FOLLOW_1);
            ruleTargetTypeRule();

            state._fsp--;

             after(grammarAccess.getTargetTypeRuleRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTargetTypeRule"


    // $ANTLR start "ruleTargetTypeRule"
    // InternalDsl.g:437:1: ruleTargetTypeRule : ( ( rule__TargetTypeRule__Group__0 ) ) ;
    public final void ruleTargetTypeRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:441:2: ( ( ( rule__TargetTypeRule__Group__0 ) ) )
            // InternalDsl.g:442:2: ( ( rule__TargetTypeRule__Group__0 ) )
            {
            // InternalDsl.g:442:2: ( ( rule__TargetTypeRule__Group__0 ) )
            // InternalDsl.g:443:3: ( rule__TargetTypeRule__Group__0 )
            {
             before(grammarAccess.getTargetTypeRuleAccess().getGroup()); 
            // InternalDsl.g:444:3: ( rule__TargetTypeRule__Group__0 )
            // InternalDsl.g:444:4: rule__TargetTypeRule__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TargetTypeRule__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTargetTypeRuleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTargetTypeRule"


    // $ANTLR start "entryRuleCommandNameRule"
    // InternalDsl.g:453:1: entryRuleCommandNameRule : ruleCommandNameRule EOF ;
    public final void entryRuleCommandNameRule() throws RecognitionException {
        try {
            // InternalDsl.g:454:1: ( ruleCommandNameRule EOF )
            // InternalDsl.g:455:1: ruleCommandNameRule EOF
            {
             before(grammarAccess.getCommandNameRuleRule()); 
            pushFollow(FOLLOW_1);
            ruleCommandNameRule();

            state._fsp--;

             after(grammarAccess.getCommandNameRuleRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCommandNameRule"


    // $ANTLR start "ruleCommandNameRule"
    // InternalDsl.g:462:1: ruleCommandNameRule : ( ( rule__CommandNameRule__Group__0 ) ) ;
    public final void ruleCommandNameRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:466:2: ( ( ( rule__CommandNameRule__Group__0 ) ) )
            // InternalDsl.g:467:2: ( ( rule__CommandNameRule__Group__0 ) )
            {
            // InternalDsl.g:467:2: ( ( rule__CommandNameRule__Group__0 ) )
            // InternalDsl.g:468:3: ( rule__CommandNameRule__Group__0 )
            {
             before(grammarAccess.getCommandNameRuleAccess().getGroup()); 
            // InternalDsl.g:469:3: ( rule__CommandNameRule__Group__0 )
            // InternalDsl.g:469:4: rule__CommandNameRule__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CommandNameRule__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCommandNameRuleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCommandNameRule"


    // $ANTLR start "entryRuleShapeTypeRule"
    // InternalDsl.g:478:1: entryRuleShapeTypeRule : ruleShapeTypeRule EOF ;
    public final void entryRuleShapeTypeRule() throws RecognitionException {
        try {
            // InternalDsl.g:479:1: ( ruleShapeTypeRule EOF )
            // InternalDsl.g:480:1: ruleShapeTypeRule EOF
            {
             before(grammarAccess.getShapeTypeRuleRule()); 
            pushFollow(FOLLOW_1);
            ruleShapeTypeRule();

            state._fsp--;

             after(grammarAccess.getShapeTypeRuleRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleShapeTypeRule"


    // $ANTLR start "ruleShapeTypeRule"
    // InternalDsl.g:487:1: ruleShapeTypeRule : ( ( rule__ShapeTypeRule__Group__0 ) ) ;
    public final void ruleShapeTypeRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:491:2: ( ( ( rule__ShapeTypeRule__Group__0 ) ) )
            // InternalDsl.g:492:2: ( ( rule__ShapeTypeRule__Group__0 ) )
            {
            // InternalDsl.g:492:2: ( ( rule__ShapeTypeRule__Group__0 ) )
            // InternalDsl.g:493:3: ( rule__ShapeTypeRule__Group__0 )
            {
             before(grammarAccess.getShapeTypeRuleAccess().getGroup()); 
            // InternalDsl.g:494:3: ( rule__ShapeTypeRule__Group__0 )
            // InternalDsl.g:494:4: rule__ShapeTypeRule__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ShapeTypeRule__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getShapeTypeRuleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleShapeTypeRule"


    // $ANTLR start "entryRuleParentTypeRule"
    // InternalDsl.g:503:1: entryRuleParentTypeRule : ruleParentTypeRule EOF ;
    public final void entryRuleParentTypeRule() throws RecognitionException {
        try {
            // InternalDsl.g:504:1: ( ruleParentTypeRule EOF )
            // InternalDsl.g:505:1: ruleParentTypeRule EOF
            {
             before(grammarAccess.getParentTypeRuleRule()); 
            pushFollow(FOLLOW_1);
            ruleParentTypeRule();

            state._fsp--;

             after(grammarAccess.getParentTypeRuleRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleParentTypeRule"


    // $ANTLR start "ruleParentTypeRule"
    // InternalDsl.g:512:1: ruleParentTypeRule : ( ( rule__ParentTypeRule__Group__0 ) ) ;
    public final void ruleParentTypeRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:516:2: ( ( ( rule__ParentTypeRule__Group__0 ) ) )
            // InternalDsl.g:517:2: ( ( rule__ParentTypeRule__Group__0 ) )
            {
            // InternalDsl.g:517:2: ( ( rule__ParentTypeRule__Group__0 ) )
            // InternalDsl.g:518:3: ( rule__ParentTypeRule__Group__0 )
            {
             before(grammarAccess.getParentTypeRuleAccess().getGroup()); 
            // InternalDsl.g:519:3: ( rule__ParentTypeRule__Group__0 )
            // InternalDsl.g:519:4: rule__ParentTypeRule__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ParentTypeRule__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getParentTypeRuleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParentTypeRule"


    // $ANTLR start "entryRuleStepInRule"
    // InternalDsl.g:528:1: entryRuleStepInRule : ruleStepInRule EOF ;
    public final void entryRuleStepInRule() throws RecognitionException {
        try {
            // InternalDsl.g:529:1: ( ruleStepInRule EOF )
            // InternalDsl.g:530:1: ruleStepInRule EOF
            {
             before(grammarAccess.getStepInRuleRule()); 
            pushFollow(FOLLOW_1);
            ruleStepInRule();

            state._fsp--;

             after(grammarAccess.getStepInRuleRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStepInRule"


    // $ANTLR start "ruleStepInRule"
    // InternalDsl.g:537:1: ruleStepInRule : ( ( rule__StepInRule__Group__0 ) ) ;
    public final void ruleStepInRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:541:2: ( ( ( rule__StepInRule__Group__0 ) ) )
            // InternalDsl.g:542:2: ( ( rule__StepInRule__Group__0 ) )
            {
            // InternalDsl.g:542:2: ( ( rule__StepInRule__Group__0 ) )
            // InternalDsl.g:543:3: ( rule__StepInRule__Group__0 )
            {
             before(grammarAccess.getStepInRuleAccess().getGroup()); 
            // InternalDsl.g:544:3: ( rule__StepInRule__Group__0 )
            // InternalDsl.g:544:4: rule__StepInRule__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__StepInRule__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStepInRuleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStepInRule"


    // $ANTLR start "entryRuleTrueRule"
    // InternalDsl.g:553:1: entryRuleTrueRule : ruleTrueRule EOF ;
    public final void entryRuleTrueRule() throws RecognitionException {
        try {
            // InternalDsl.g:554:1: ( ruleTrueRule EOF )
            // InternalDsl.g:555:1: ruleTrueRule EOF
            {
             before(grammarAccess.getTrueRuleRule()); 
            pushFollow(FOLLOW_1);
            ruleTrueRule();

            state._fsp--;

             after(grammarAccess.getTrueRuleRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTrueRule"


    // $ANTLR start "ruleTrueRule"
    // InternalDsl.g:562:1: ruleTrueRule : ( ( rule__TrueRule__Group__0 ) ) ;
    public final void ruleTrueRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:566:2: ( ( ( rule__TrueRule__Group__0 ) ) )
            // InternalDsl.g:567:2: ( ( rule__TrueRule__Group__0 ) )
            {
            // InternalDsl.g:567:2: ( ( rule__TrueRule__Group__0 ) )
            // InternalDsl.g:568:3: ( rule__TrueRule__Group__0 )
            {
             before(grammarAccess.getTrueRuleAccess().getGroup()); 
            // InternalDsl.g:569:3: ( rule__TrueRule__Group__0 )
            // InternalDsl.g:569:4: rule__TrueRule__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TrueRule__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTrueRuleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTrueRule"


    // $ANTLR start "entryRuleFalseRule"
    // InternalDsl.g:578:1: entryRuleFalseRule : ruleFalseRule EOF ;
    public final void entryRuleFalseRule() throws RecognitionException {
        try {
            // InternalDsl.g:579:1: ( ruleFalseRule EOF )
            // InternalDsl.g:580:1: ruleFalseRule EOF
            {
             before(grammarAccess.getFalseRuleRule()); 
            pushFollow(FOLLOW_1);
            ruleFalseRule();

            state._fsp--;

             after(grammarAccess.getFalseRuleRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFalseRule"


    // $ANTLR start "ruleFalseRule"
    // InternalDsl.g:587:1: ruleFalseRule : ( ( rule__FalseRule__Group__0 ) ) ;
    public final void ruleFalseRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:591:2: ( ( ( rule__FalseRule__Group__0 ) ) )
            // InternalDsl.g:592:2: ( ( rule__FalseRule__Group__0 ) )
            {
            // InternalDsl.g:592:2: ( ( rule__FalseRule__Group__0 ) )
            // InternalDsl.g:593:3: ( rule__FalseRule__Group__0 )
            {
             before(grammarAccess.getFalseRuleAccess().getGroup()); 
            // InternalDsl.g:594:3: ( rule__FalseRule__Group__0 )
            // InternalDsl.g:594:4: rule__FalseRule__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FalseRule__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFalseRuleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFalseRule"


    // $ANTLR start "entryRuleShapeNameRule"
    // InternalDsl.g:603:1: entryRuleShapeNameRule : ruleShapeNameRule EOF ;
    public final void entryRuleShapeNameRule() throws RecognitionException {
        try {
            // InternalDsl.g:604:1: ( ruleShapeNameRule EOF )
            // InternalDsl.g:605:1: ruleShapeNameRule EOF
            {
             before(grammarAccess.getShapeNameRuleRule()); 
            pushFollow(FOLLOW_1);
            ruleShapeNameRule();

            state._fsp--;

             after(grammarAccess.getShapeNameRuleRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleShapeNameRule"


    // $ANTLR start "ruleShapeNameRule"
    // InternalDsl.g:612:1: ruleShapeNameRule : ( ( rule__ShapeNameRule__Group__0 ) ) ;
    public final void ruleShapeNameRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:616:2: ( ( ( rule__ShapeNameRule__Group__0 ) ) )
            // InternalDsl.g:617:2: ( ( rule__ShapeNameRule__Group__0 ) )
            {
            // InternalDsl.g:617:2: ( ( rule__ShapeNameRule__Group__0 ) )
            // InternalDsl.g:618:3: ( rule__ShapeNameRule__Group__0 )
            {
             before(grammarAccess.getShapeNameRuleAccess().getGroup()); 
            // InternalDsl.g:619:3: ( rule__ShapeNameRule__Group__0 )
            // InternalDsl.g:619:4: rule__ShapeNameRule__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ShapeNameRule__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getShapeNameRuleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleShapeNameRule"


    // $ANTLR start "entryRuleMappingExpression"
    // InternalDsl.g:628:1: entryRuleMappingExpression : ruleMappingExpression EOF ;
    public final void entryRuleMappingExpression() throws RecognitionException {
        try {
            // InternalDsl.g:629:1: ( ruleMappingExpression EOF )
            // InternalDsl.g:630:1: ruleMappingExpression EOF
            {
             before(grammarAccess.getMappingExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleMappingExpression();

            state._fsp--;

             after(grammarAccess.getMappingExpressionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMappingExpression"


    // $ANTLR start "ruleMappingExpression"
    // InternalDsl.g:637:1: ruleMappingExpression : ( ruleImplicationMapping ) ;
    public final void ruleMappingExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:641:2: ( ( ruleImplicationMapping ) )
            // InternalDsl.g:642:2: ( ruleImplicationMapping )
            {
            // InternalDsl.g:642:2: ( ruleImplicationMapping )
            // InternalDsl.g:643:3: ruleImplicationMapping
            {
             before(grammarAccess.getMappingExpressionAccess().getImplicationMappingParserRuleCall()); 
            pushFollow(FOLLOW_2);
            ruleImplicationMapping();

            state._fsp--;

             after(grammarAccess.getMappingExpressionAccess().getImplicationMappingParserRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMappingExpression"


    // $ANTLR start "entryRuleImplicationMapping"
    // InternalDsl.g:653:1: entryRuleImplicationMapping : ruleImplicationMapping EOF ;
    public final void entryRuleImplicationMapping() throws RecognitionException {
        try {
            // InternalDsl.g:654:1: ( ruleImplicationMapping EOF )
            // InternalDsl.g:655:1: ruleImplicationMapping EOF
            {
             before(grammarAccess.getImplicationMappingRule()); 
            pushFollow(FOLLOW_1);
            ruleImplicationMapping();

            state._fsp--;

             after(grammarAccess.getImplicationMappingRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleImplicationMapping"


    // $ANTLR start "ruleImplicationMapping"
    // InternalDsl.g:662:1: ruleImplicationMapping : ( ( rule__ImplicationMapping__Group__0 ) ) ;
    public final void ruleImplicationMapping() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:666:2: ( ( ( rule__ImplicationMapping__Group__0 ) ) )
            // InternalDsl.g:667:2: ( ( rule__ImplicationMapping__Group__0 ) )
            {
            // InternalDsl.g:667:2: ( ( rule__ImplicationMapping__Group__0 ) )
            // InternalDsl.g:668:3: ( rule__ImplicationMapping__Group__0 )
            {
             before(grammarAccess.getImplicationMappingAccess().getGroup()); 
            // InternalDsl.g:669:3: ( rule__ImplicationMapping__Group__0 )
            // InternalDsl.g:669:4: rule__ImplicationMapping__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ImplicationMapping__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getImplicationMappingAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleImplicationMapping"


    // $ANTLR start "entryRuleOrMapping"
    // InternalDsl.g:678:1: entryRuleOrMapping : ruleOrMapping EOF ;
    public final void entryRuleOrMapping() throws RecognitionException {
        try {
            // InternalDsl.g:679:1: ( ruleOrMapping EOF )
            // InternalDsl.g:680:1: ruleOrMapping EOF
            {
             before(grammarAccess.getOrMappingRule()); 
            pushFollow(FOLLOW_1);
            ruleOrMapping();

            state._fsp--;

             after(grammarAccess.getOrMappingRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOrMapping"


    // $ANTLR start "ruleOrMapping"
    // InternalDsl.g:687:1: ruleOrMapping : ( ( rule__OrMapping__Group__0 ) ) ;
    public final void ruleOrMapping() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:691:2: ( ( ( rule__OrMapping__Group__0 ) ) )
            // InternalDsl.g:692:2: ( ( rule__OrMapping__Group__0 ) )
            {
            // InternalDsl.g:692:2: ( ( rule__OrMapping__Group__0 ) )
            // InternalDsl.g:693:3: ( rule__OrMapping__Group__0 )
            {
             before(grammarAccess.getOrMappingAccess().getGroup()); 
            // InternalDsl.g:694:3: ( rule__OrMapping__Group__0 )
            // InternalDsl.g:694:4: rule__OrMapping__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__OrMapping__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOrMappingAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOrMapping"


    // $ANTLR start "entryRuleAndMapping"
    // InternalDsl.g:703:1: entryRuleAndMapping : ruleAndMapping EOF ;
    public final void entryRuleAndMapping() throws RecognitionException {
        try {
            // InternalDsl.g:704:1: ( ruleAndMapping EOF )
            // InternalDsl.g:705:1: ruleAndMapping EOF
            {
             before(grammarAccess.getAndMappingRule()); 
            pushFollow(FOLLOW_1);
            ruleAndMapping();

            state._fsp--;

             after(grammarAccess.getAndMappingRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAndMapping"


    // $ANTLR start "ruleAndMapping"
    // InternalDsl.g:712:1: ruleAndMapping : ( ( rule__AndMapping__Group__0 ) ) ;
    public final void ruleAndMapping() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:716:2: ( ( ( rule__AndMapping__Group__0 ) ) )
            // InternalDsl.g:717:2: ( ( rule__AndMapping__Group__0 ) )
            {
            // InternalDsl.g:717:2: ( ( rule__AndMapping__Group__0 ) )
            // InternalDsl.g:718:3: ( rule__AndMapping__Group__0 )
            {
             before(grammarAccess.getAndMappingAccess().getGroup()); 
            // InternalDsl.g:719:3: ( rule__AndMapping__Group__0 )
            // InternalDsl.g:719:4: rule__AndMapping__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AndMapping__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAndMappingAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAndMapping"


    // $ANTLR start "entryRuleNotMappingExpression"
    // InternalDsl.g:728:1: entryRuleNotMappingExpression : ruleNotMappingExpression EOF ;
    public final void entryRuleNotMappingExpression() throws RecognitionException {
        try {
            // InternalDsl.g:729:1: ( ruleNotMappingExpression EOF )
            // InternalDsl.g:730:1: ruleNotMappingExpression EOF
            {
             before(grammarAccess.getNotMappingExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleNotMappingExpression();

            state._fsp--;

             after(grammarAccess.getNotMappingExpressionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNotMappingExpression"


    // $ANTLR start "ruleNotMappingExpression"
    // InternalDsl.g:737:1: ruleNotMappingExpression : ( ( rule__NotMappingExpression__Alternatives ) ) ;
    public final void ruleNotMappingExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:741:2: ( ( ( rule__NotMappingExpression__Alternatives ) ) )
            // InternalDsl.g:742:2: ( ( rule__NotMappingExpression__Alternatives ) )
            {
            // InternalDsl.g:742:2: ( ( rule__NotMappingExpression__Alternatives ) )
            // InternalDsl.g:743:3: ( rule__NotMappingExpression__Alternatives )
            {
             before(grammarAccess.getNotMappingExpressionAccess().getAlternatives()); 
            // InternalDsl.g:744:3: ( rule__NotMappingExpression__Alternatives )
            // InternalDsl.g:744:4: rule__NotMappingExpression__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__NotMappingExpression__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getNotMappingExpressionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNotMappingExpression"


    // $ANTLR start "entryRulePrimaryMapping"
    // InternalDsl.g:753:1: entryRulePrimaryMapping : rulePrimaryMapping EOF ;
    public final void entryRulePrimaryMapping() throws RecognitionException {
        try {
            // InternalDsl.g:754:1: ( rulePrimaryMapping EOF )
            // InternalDsl.g:755:1: rulePrimaryMapping EOF
            {
             before(grammarAccess.getPrimaryMappingRule()); 
            pushFollow(FOLLOW_1);
            rulePrimaryMapping();

            state._fsp--;

             after(grammarAccess.getPrimaryMappingRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePrimaryMapping"


    // $ANTLR start "rulePrimaryMapping"
    // InternalDsl.g:762:1: rulePrimaryMapping : ( ( rule__PrimaryMapping__Alternatives ) ) ;
    public final void rulePrimaryMapping() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:766:2: ( ( ( rule__PrimaryMapping__Alternatives ) ) )
            // InternalDsl.g:767:2: ( ( rule__PrimaryMapping__Alternatives ) )
            {
            // InternalDsl.g:767:2: ( ( rule__PrimaryMapping__Alternatives ) )
            // InternalDsl.g:768:3: ( rule__PrimaryMapping__Alternatives )
            {
             before(grammarAccess.getPrimaryMappingAccess().getAlternatives()); 
            // InternalDsl.g:769:3: ( rule__PrimaryMapping__Alternatives )
            // InternalDsl.g:769:4: rule__PrimaryMapping__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__PrimaryMapping__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPrimaryMappingAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePrimaryMapping"


    // $ANTLR start "entryRulePolicyExpression"
    // InternalDsl.g:778:1: entryRulePolicyExpression : rulePolicyExpression EOF ;
    public final void entryRulePolicyExpression() throws RecognitionException {
        try {
            // InternalDsl.g:779:1: ( rulePolicyExpression EOF )
            // InternalDsl.g:780:1: rulePolicyExpression EOF
            {
             before(grammarAccess.getPolicyExpressionRule()); 
            pushFollow(FOLLOW_1);
            rulePolicyExpression();

            state._fsp--;

             after(grammarAccess.getPolicyExpressionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePolicyExpression"


    // $ANTLR start "rulePolicyExpression"
    // InternalDsl.g:787:1: rulePolicyExpression : ( ruleImplicationPolicy ) ;
    public final void rulePolicyExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:791:2: ( ( ruleImplicationPolicy ) )
            // InternalDsl.g:792:2: ( ruleImplicationPolicy )
            {
            // InternalDsl.g:792:2: ( ruleImplicationPolicy )
            // InternalDsl.g:793:3: ruleImplicationPolicy
            {
             before(grammarAccess.getPolicyExpressionAccess().getImplicationPolicyParserRuleCall()); 
            pushFollow(FOLLOW_2);
            ruleImplicationPolicy();

            state._fsp--;

             after(grammarAccess.getPolicyExpressionAccess().getImplicationPolicyParserRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePolicyExpression"


    // $ANTLR start "entryRuleImplicationPolicy"
    // InternalDsl.g:803:1: entryRuleImplicationPolicy : ruleImplicationPolicy EOF ;
    public final void entryRuleImplicationPolicy() throws RecognitionException {
        try {
            // InternalDsl.g:804:1: ( ruleImplicationPolicy EOF )
            // InternalDsl.g:805:1: ruleImplicationPolicy EOF
            {
             before(grammarAccess.getImplicationPolicyRule()); 
            pushFollow(FOLLOW_1);
            ruleImplicationPolicy();

            state._fsp--;

             after(grammarAccess.getImplicationPolicyRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleImplicationPolicy"


    // $ANTLR start "ruleImplicationPolicy"
    // InternalDsl.g:812:1: ruleImplicationPolicy : ( ( rule__ImplicationPolicy__Group__0 ) ) ;
    public final void ruleImplicationPolicy() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:816:2: ( ( ( rule__ImplicationPolicy__Group__0 ) ) )
            // InternalDsl.g:817:2: ( ( rule__ImplicationPolicy__Group__0 ) )
            {
            // InternalDsl.g:817:2: ( ( rule__ImplicationPolicy__Group__0 ) )
            // InternalDsl.g:818:3: ( rule__ImplicationPolicy__Group__0 )
            {
             before(grammarAccess.getImplicationPolicyAccess().getGroup()); 
            // InternalDsl.g:819:3: ( rule__ImplicationPolicy__Group__0 )
            // InternalDsl.g:819:4: rule__ImplicationPolicy__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ImplicationPolicy__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getImplicationPolicyAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleImplicationPolicy"


    // $ANTLR start "entryRuleOrPolicy"
    // InternalDsl.g:828:1: entryRuleOrPolicy : ruleOrPolicy EOF ;
    public final void entryRuleOrPolicy() throws RecognitionException {
        try {
            // InternalDsl.g:829:1: ( ruleOrPolicy EOF )
            // InternalDsl.g:830:1: ruleOrPolicy EOF
            {
             before(grammarAccess.getOrPolicyRule()); 
            pushFollow(FOLLOW_1);
            ruleOrPolicy();

            state._fsp--;

             after(grammarAccess.getOrPolicyRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOrPolicy"


    // $ANTLR start "ruleOrPolicy"
    // InternalDsl.g:837:1: ruleOrPolicy : ( ( rule__OrPolicy__Group__0 ) ) ;
    public final void ruleOrPolicy() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:841:2: ( ( ( rule__OrPolicy__Group__0 ) ) )
            // InternalDsl.g:842:2: ( ( rule__OrPolicy__Group__0 ) )
            {
            // InternalDsl.g:842:2: ( ( rule__OrPolicy__Group__0 ) )
            // InternalDsl.g:843:3: ( rule__OrPolicy__Group__0 )
            {
             before(grammarAccess.getOrPolicyAccess().getGroup()); 
            // InternalDsl.g:844:3: ( rule__OrPolicy__Group__0 )
            // InternalDsl.g:844:4: rule__OrPolicy__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__OrPolicy__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOrPolicyAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOrPolicy"


    // $ANTLR start "entryRuleAndPolicy"
    // InternalDsl.g:853:1: entryRuleAndPolicy : ruleAndPolicy EOF ;
    public final void entryRuleAndPolicy() throws RecognitionException {
        try {
            // InternalDsl.g:854:1: ( ruleAndPolicy EOF )
            // InternalDsl.g:855:1: ruleAndPolicy EOF
            {
             before(grammarAccess.getAndPolicyRule()); 
            pushFollow(FOLLOW_1);
            ruleAndPolicy();

            state._fsp--;

             after(grammarAccess.getAndPolicyRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAndPolicy"


    // $ANTLR start "ruleAndPolicy"
    // InternalDsl.g:862:1: ruleAndPolicy : ( ( rule__AndPolicy__Group__0 ) ) ;
    public final void ruleAndPolicy() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:866:2: ( ( ( rule__AndPolicy__Group__0 ) ) )
            // InternalDsl.g:867:2: ( ( rule__AndPolicy__Group__0 ) )
            {
            // InternalDsl.g:867:2: ( ( rule__AndPolicy__Group__0 ) )
            // InternalDsl.g:868:3: ( rule__AndPolicy__Group__0 )
            {
             before(grammarAccess.getAndPolicyAccess().getGroup()); 
            // InternalDsl.g:869:3: ( rule__AndPolicy__Group__0 )
            // InternalDsl.g:869:4: rule__AndPolicy__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AndPolicy__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAndPolicyAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAndPolicy"


    // $ANTLR start "entryRuleNotExpression"
    // InternalDsl.g:878:1: entryRuleNotExpression : ruleNotExpression EOF ;
    public final void entryRuleNotExpression() throws RecognitionException {
        try {
            // InternalDsl.g:879:1: ( ruleNotExpression EOF )
            // InternalDsl.g:880:1: ruleNotExpression EOF
            {
             before(grammarAccess.getNotExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleNotExpression();

            state._fsp--;

             after(grammarAccess.getNotExpressionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNotExpression"


    // $ANTLR start "ruleNotExpression"
    // InternalDsl.g:887:1: ruleNotExpression : ( ( rule__NotExpression__Alternatives ) ) ;
    public final void ruleNotExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:891:2: ( ( ( rule__NotExpression__Alternatives ) ) )
            // InternalDsl.g:892:2: ( ( rule__NotExpression__Alternatives ) )
            {
            // InternalDsl.g:892:2: ( ( rule__NotExpression__Alternatives ) )
            // InternalDsl.g:893:3: ( rule__NotExpression__Alternatives )
            {
             before(grammarAccess.getNotExpressionAccess().getAlternatives()); 
            // InternalDsl.g:894:3: ( rule__NotExpression__Alternatives )
            // InternalDsl.g:894:4: rule__NotExpression__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__NotExpression__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getNotExpressionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNotExpression"


    // $ANTLR start "entryRulePrimary"
    // InternalDsl.g:903:1: entryRulePrimary : rulePrimary EOF ;
    public final void entryRulePrimary() throws RecognitionException {
        try {
            // InternalDsl.g:904:1: ( rulePrimary EOF )
            // InternalDsl.g:905:1: rulePrimary EOF
            {
             before(grammarAccess.getPrimaryRule()); 
            pushFollow(FOLLOW_1);
            rulePrimary();

            state._fsp--;

             after(grammarAccess.getPrimaryRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePrimary"


    // $ANTLR start "rulePrimary"
    // InternalDsl.g:912:1: rulePrimary : ( ( rule__Primary__Alternatives ) ) ;
    public final void rulePrimary() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:916:2: ( ( ( rule__Primary__Alternatives ) ) )
            // InternalDsl.g:917:2: ( ( rule__Primary__Alternatives ) )
            {
            // InternalDsl.g:917:2: ( ( rule__Primary__Alternatives ) )
            // InternalDsl.g:918:3: ( rule__Primary__Alternatives )
            {
             before(grammarAccess.getPrimaryAccess().getAlternatives()); 
            // InternalDsl.g:919:3: ( rule__Primary__Alternatives )
            // InternalDsl.g:919:4: rule__Primary__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Primary__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPrimaryAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePrimary"


    // $ANTLR start "rule__PolicyRule__Alternatives"
    // InternalDsl.g:927:1: rule__PolicyRule__Alternatives : ( ( ruleTrueRule ) | ( ruleFalseRule ) | ( ruleCommandNameRule ) | ( ruleShapeTypeRule ) | ( ruleParentTypeRule ) | ( ruleStepInRule ) | ( ruleSourceTypeRule ) | ( ruleTargetTypeRule ) | ( ruleRelationIsCyclicRule ) | ( ruleRelationIsReflexivRule ) | ( ruleRelationTypesAreEqualRule ) | ( ruleTypeExistsRule ) | ( ruleShapeNameRule ) | ( ruleRelationNameRule ) );
    public final void rule__PolicyRule__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:931:1: ( ( ruleTrueRule ) | ( ruleFalseRule ) | ( ruleCommandNameRule ) | ( ruleShapeTypeRule ) | ( ruleParentTypeRule ) | ( ruleStepInRule ) | ( ruleSourceTypeRule ) | ( ruleTargetTypeRule ) | ( ruleRelationIsCyclicRule ) | ( ruleRelationIsReflexivRule ) | ( ruleRelationTypesAreEqualRule ) | ( ruleTypeExistsRule ) | ( ruleShapeNameRule ) | ( ruleRelationNameRule ) )
            int alt1=14;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt1=1;
                }
                break;
            case 24:
                {
                alt1=2;
                }
                break;
            case 20:
                {
                alt1=3;
                }
                break;
            case 21:
                {
                alt1=4;
                }
                break;
            case 22:
                {
                alt1=5;
                }
                break;
            case 23:
                {
                alt1=6;
                }
                break;
            case 18:
                {
                alt1=7;
                }
                break;
            case 19:
                {
                alt1=8;
                }
                break;
            case 13:
                {
                alt1=9;
                }
                break;
            case 15:
                {
                alt1=10;
                }
                break;
            case 14:
                {
                alt1=11;
                }
                break;
            case 17:
                {
                alt1=12;
                }
                break;
            case 25:
                {
                alt1=13;
                }
                break;
            case 16:
                {
                alt1=14;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalDsl.g:932:2: ( ruleTrueRule )
                    {
                    // InternalDsl.g:932:2: ( ruleTrueRule )
                    // InternalDsl.g:933:3: ruleTrueRule
                    {
                     before(grammarAccess.getPolicyRuleAccess().getTrueRuleParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleTrueRule();

                    state._fsp--;

                     after(grammarAccess.getPolicyRuleAccess().getTrueRuleParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:938:2: ( ruleFalseRule )
                    {
                    // InternalDsl.g:938:2: ( ruleFalseRule )
                    // InternalDsl.g:939:3: ruleFalseRule
                    {
                     before(grammarAccess.getPolicyRuleAccess().getFalseRuleParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleFalseRule();

                    state._fsp--;

                     after(grammarAccess.getPolicyRuleAccess().getFalseRuleParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDsl.g:944:2: ( ruleCommandNameRule )
                    {
                    // InternalDsl.g:944:2: ( ruleCommandNameRule )
                    // InternalDsl.g:945:3: ruleCommandNameRule
                    {
                     before(grammarAccess.getPolicyRuleAccess().getCommandNameRuleParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleCommandNameRule();

                    state._fsp--;

                     after(grammarAccess.getPolicyRuleAccess().getCommandNameRuleParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalDsl.g:950:2: ( ruleShapeTypeRule )
                    {
                    // InternalDsl.g:950:2: ( ruleShapeTypeRule )
                    // InternalDsl.g:951:3: ruleShapeTypeRule
                    {
                     before(grammarAccess.getPolicyRuleAccess().getShapeTypeRuleParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleShapeTypeRule();

                    state._fsp--;

                     after(grammarAccess.getPolicyRuleAccess().getShapeTypeRuleParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalDsl.g:956:2: ( ruleParentTypeRule )
                    {
                    // InternalDsl.g:956:2: ( ruleParentTypeRule )
                    // InternalDsl.g:957:3: ruleParentTypeRule
                    {
                     before(grammarAccess.getPolicyRuleAccess().getParentTypeRuleParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleParentTypeRule();

                    state._fsp--;

                     after(grammarAccess.getPolicyRuleAccess().getParentTypeRuleParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalDsl.g:962:2: ( ruleStepInRule )
                    {
                    // InternalDsl.g:962:2: ( ruleStepInRule )
                    // InternalDsl.g:963:3: ruleStepInRule
                    {
                     before(grammarAccess.getPolicyRuleAccess().getStepInRuleParserRuleCall_5()); 
                    pushFollow(FOLLOW_2);
                    ruleStepInRule();

                    state._fsp--;

                     after(grammarAccess.getPolicyRuleAccess().getStepInRuleParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalDsl.g:968:2: ( ruleSourceTypeRule )
                    {
                    // InternalDsl.g:968:2: ( ruleSourceTypeRule )
                    // InternalDsl.g:969:3: ruleSourceTypeRule
                    {
                     before(grammarAccess.getPolicyRuleAccess().getSourceTypeRuleParserRuleCall_6()); 
                    pushFollow(FOLLOW_2);
                    ruleSourceTypeRule();

                    state._fsp--;

                     after(grammarAccess.getPolicyRuleAccess().getSourceTypeRuleParserRuleCall_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalDsl.g:974:2: ( ruleTargetTypeRule )
                    {
                    // InternalDsl.g:974:2: ( ruleTargetTypeRule )
                    // InternalDsl.g:975:3: ruleTargetTypeRule
                    {
                     before(grammarAccess.getPolicyRuleAccess().getTargetTypeRuleParserRuleCall_7()); 
                    pushFollow(FOLLOW_2);
                    ruleTargetTypeRule();

                    state._fsp--;

                     after(grammarAccess.getPolicyRuleAccess().getTargetTypeRuleParserRuleCall_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalDsl.g:980:2: ( ruleRelationIsCyclicRule )
                    {
                    // InternalDsl.g:980:2: ( ruleRelationIsCyclicRule )
                    // InternalDsl.g:981:3: ruleRelationIsCyclicRule
                    {
                     before(grammarAccess.getPolicyRuleAccess().getRelationIsCyclicRuleParserRuleCall_8()); 
                    pushFollow(FOLLOW_2);
                    ruleRelationIsCyclicRule();

                    state._fsp--;

                     after(grammarAccess.getPolicyRuleAccess().getRelationIsCyclicRuleParserRuleCall_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalDsl.g:986:2: ( ruleRelationIsReflexivRule )
                    {
                    // InternalDsl.g:986:2: ( ruleRelationIsReflexivRule )
                    // InternalDsl.g:987:3: ruleRelationIsReflexivRule
                    {
                     before(grammarAccess.getPolicyRuleAccess().getRelationIsReflexivRuleParserRuleCall_9()); 
                    pushFollow(FOLLOW_2);
                    ruleRelationIsReflexivRule();

                    state._fsp--;

                     after(grammarAccess.getPolicyRuleAccess().getRelationIsReflexivRuleParserRuleCall_9()); 

                    }


                    }
                    break;
                case 11 :
                    // InternalDsl.g:992:2: ( ruleRelationTypesAreEqualRule )
                    {
                    // InternalDsl.g:992:2: ( ruleRelationTypesAreEqualRule )
                    // InternalDsl.g:993:3: ruleRelationTypesAreEqualRule
                    {
                     before(grammarAccess.getPolicyRuleAccess().getRelationTypesAreEqualRuleParserRuleCall_10()); 
                    pushFollow(FOLLOW_2);
                    ruleRelationTypesAreEqualRule();

                    state._fsp--;

                     after(grammarAccess.getPolicyRuleAccess().getRelationTypesAreEqualRuleParserRuleCall_10()); 

                    }


                    }
                    break;
                case 12 :
                    // InternalDsl.g:998:2: ( ruleTypeExistsRule )
                    {
                    // InternalDsl.g:998:2: ( ruleTypeExistsRule )
                    // InternalDsl.g:999:3: ruleTypeExistsRule
                    {
                     before(grammarAccess.getPolicyRuleAccess().getTypeExistsRuleParserRuleCall_11()); 
                    pushFollow(FOLLOW_2);
                    ruleTypeExistsRule();

                    state._fsp--;

                     after(grammarAccess.getPolicyRuleAccess().getTypeExistsRuleParserRuleCall_11()); 

                    }


                    }
                    break;
                case 13 :
                    // InternalDsl.g:1004:2: ( ruleShapeNameRule )
                    {
                    // InternalDsl.g:1004:2: ( ruleShapeNameRule )
                    // InternalDsl.g:1005:3: ruleShapeNameRule
                    {
                     before(grammarAccess.getPolicyRuleAccess().getShapeNameRuleParserRuleCall_12()); 
                    pushFollow(FOLLOW_2);
                    ruleShapeNameRule();

                    state._fsp--;

                     after(grammarAccess.getPolicyRuleAccess().getShapeNameRuleParserRuleCall_12()); 

                    }


                    }
                    break;
                case 14 :
                    // InternalDsl.g:1010:2: ( ruleRelationNameRule )
                    {
                    // InternalDsl.g:1010:2: ( ruleRelationNameRule )
                    // InternalDsl.g:1011:3: ruleRelationNameRule
                    {
                     before(grammarAccess.getPolicyRuleAccess().getRelationNameRuleParserRuleCall_13()); 
                    pushFollow(FOLLOW_2);
                    ruleRelationNameRule();

                    state._fsp--;

                     after(grammarAccess.getPolicyRuleAccess().getRelationNameRuleParserRuleCall_13()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PolicyRule__Alternatives"


    // $ANTLR start "rule__MappingRule__Alternatives"
    // InternalDsl.g:1020:1: rule__MappingRule__Alternatives : ( ( ruleFeatureNameMappingRule ) | ( ruleTrueMappingRule ) );
    public final void rule__MappingRule__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1024:1: ( ( ruleFeatureNameMappingRule ) | ( ruleTrueMappingRule ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0>=RULE_STRING && LA2_0<=RULE_ID)) ) {
                alt2=1;
            }
            else if ( (LA2_0==12) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalDsl.g:1025:2: ( ruleFeatureNameMappingRule )
                    {
                    // InternalDsl.g:1025:2: ( ruleFeatureNameMappingRule )
                    // InternalDsl.g:1026:3: ruleFeatureNameMappingRule
                    {
                     before(grammarAccess.getMappingRuleAccess().getFeatureNameMappingRuleParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleFeatureNameMappingRule();

                    state._fsp--;

                     after(grammarAccess.getMappingRuleAccess().getFeatureNameMappingRuleParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:1031:2: ( ruleTrueMappingRule )
                    {
                    // InternalDsl.g:1031:2: ( ruleTrueMappingRule )
                    // InternalDsl.g:1032:3: ruleTrueMappingRule
                    {
                     before(grammarAccess.getMappingRuleAccess().getTrueMappingRuleParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleTrueMappingRule();

                    state._fsp--;

                     after(grammarAccess.getMappingRuleAccess().getTrueMappingRuleParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingRule__Alternatives"


    // $ANTLR start "rule__EString__Alternatives"
    // InternalDsl.g:1041:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1045:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_STRING) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_ID) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalDsl.g:1046:2: ( RULE_STRING )
                    {
                    // InternalDsl.g:1046:2: ( RULE_STRING )
                    // InternalDsl.g:1047:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:1052:2: ( RULE_ID )
                    {
                    // InternalDsl.g:1052:2: ( RULE_ID )
                    // InternalDsl.g:1053:3: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EString__Alternatives"


    // $ANTLR start "rule__NotMappingExpression__Alternatives"
    // InternalDsl.g:1062:1: rule__NotMappingExpression__Alternatives : ( ( rulePrimaryMapping ) | ( ( rule__NotMappingExpression__Group_1__0 ) ) );
    public final void rule__NotMappingExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1066:1: ( ( rulePrimaryMapping ) | ( ( rule__NotMappingExpression__Group_1__0 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( ((LA4_0>=RULE_STRING && LA4_0<=RULE_ID)||LA4_0==12||LA4_0==30) ) {
                alt4=1;
            }
            else if ( (LA4_0==29) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalDsl.g:1067:2: ( rulePrimaryMapping )
                    {
                    // InternalDsl.g:1067:2: ( rulePrimaryMapping )
                    // InternalDsl.g:1068:3: rulePrimaryMapping
                    {
                     before(grammarAccess.getNotMappingExpressionAccess().getPrimaryMappingParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    rulePrimaryMapping();

                    state._fsp--;

                     after(grammarAccess.getNotMappingExpressionAccess().getPrimaryMappingParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:1073:2: ( ( rule__NotMappingExpression__Group_1__0 ) )
                    {
                    // InternalDsl.g:1073:2: ( ( rule__NotMappingExpression__Group_1__0 ) )
                    // InternalDsl.g:1074:3: ( rule__NotMappingExpression__Group_1__0 )
                    {
                     before(grammarAccess.getNotMappingExpressionAccess().getGroup_1()); 
                    // InternalDsl.g:1075:3: ( rule__NotMappingExpression__Group_1__0 )
                    // InternalDsl.g:1075:4: rule__NotMappingExpression__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__NotMappingExpression__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getNotMappingExpressionAccess().getGroup_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NotMappingExpression__Alternatives"


    // $ANTLR start "rule__PrimaryMapping__Alternatives"
    // InternalDsl.g:1083:1: rule__PrimaryMapping__Alternatives : ( ( ruleMappingRule ) | ( ( rule__PrimaryMapping__Group_1__0 ) ) );
    public final void rule__PrimaryMapping__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1087:1: ( ( ruleMappingRule ) | ( ( rule__PrimaryMapping__Group_1__0 ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>=RULE_STRING && LA5_0<=RULE_ID)||LA5_0==12) ) {
                alt5=1;
            }
            else if ( (LA5_0==30) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalDsl.g:1088:2: ( ruleMappingRule )
                    {
                    // InternalDsl.g:1088:2: ( ruleMappingRule )
                    // InternalDsl.g:1089:3: ruleMappingRule
                    {
                     before(grammarAccess.getPrimaryMappingAccess().getMappingRuleParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleMappingRule();

                    state._fsp--;

                     after(grammarAccess.getPrimaryMappingAccess().getMappingRuleParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:1094:2: ( ( rule__PrimaryMapping__Group_1__0 ) )
                    {
                    // InternalDsl.g:1094:2: ( ( rule__PrimaryMapping__Group_1__0 ) )
                    // InternalDsl.g:1095:3: ( rule__PrimaryMapping__Group_1__0 )
                    {
                     before(grammarAccess.getPrimaryMappingAccess().getGroup_1()); 
                    // InternalDsl.g:1096:3: ( rule__PrimaryMapping__Group_1__0 )
                    // InternalDsl.g:1096:4: rule__PrimaryMapping__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PrimaryMapping__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrimaryMappingAccess().getGroup_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryMapping__Alternatives"


    // $ANTLR start "rule__NotExpression__Alternatives"
    // InternalDsl.g:1104:1: rule__NotExpression__Alternatives : ( ( rulePrimary ) | ( ( rule__NotExpression__Group_1__0 ) ) );
    public final void rule__NotExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1108:1: ( ( rulePrimary ) | ( ( rule__NotExpression__Group_1__0 ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0>=12 && LA6_0<=25)||LA6_0==30) ) {
                alt6=1;
            }
            else if ( (LA6_0==29) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalDsl.g:1109:2: ( rulePrimary )
                    {
                    // InternalDsl.g:1109:2: ( rulePrimary )
                    // InternalDsl.g:1110:3: rulePrimary
                    {
                     before(grammarAccess.getNotExpressionAccess().getPrimaryParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    rulePrimary();

                    state._fsp--;

                     after(grammarAccess.getNotExpressionAccess().getPrimaryParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:1115:2: ( ( rule__NotExpression__Group_1__0 ) )
                    {
                    // InternalDsl.g:1115:2: ( ( rule__NotExpression__Group_1__0 ) )
                    // InternalDsl.g:1116:3: ( rule__NotExpression__Group_1__0 )
                    {
                     before(grammarAccess.getNotExpressionAccess().getGroup_1()); 
                    // InternalDsl.g:1117:3: ( rule__NotExpression__Group_1__0 )
                    // InternalDsl.g:1117:4: rule__NotExpression__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__NotExpression__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getNotExpressionAccess().getGroup_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NotExpression__Alternatives"


    // $ANTLR start "rule__Primary__Alternatives"
    // InternalDsl.g:1125:1: rule__Primary__Alternatives : ( ( rulePolicyRule ) | ( ( rule__Primary__Group_1__0 ) ) );
    public final void rule__Primary__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1129:1: ( ( rulePolicyRule ) | ( ( rule__Primary__Group_1__0 ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>=12 && LA7_0<=25)) ) {
                alt7=1;
            }
            else if ( (LA7_0==30) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalDsl.g:1130:2: ( rulePolicyRule )
                    {
                    // InternalDsl.g:1130:2: ( rulePolicyRule )
                    // InternalDsl.g:1131:3: rulePolicyRule
                    {
                     before(grammarAccess.getPrimaryAccess().getPolicyRuleParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    rulePolicyRule();

                    state._fsp--;

                     after(grammarAccess.getPrimaryAccess().getPolicyRuleParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:1136:2: ( ( rule__Primary__Group_1__0 ) )
                    {
                    // InternalDsl.g:1136:2: ( ( rule__Primary__Group_1__0 ) )
                    // InternalDsl.g:1137:3: ( rule__Primary__Group_1__0 )
                    {
                     before(grammarAccess.getPrimaryAccess().getGroup_1()); 
                    // InternalDsl.g:1138:3: ( rule__Primary__Group_1__0 )
                    // InternalDsl.g:1138:4: rule__Primary__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Primary__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrimaryAccess().getGroup_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Alternatives"


    // $ANTLR start "rule__Model__Group__0"
    // InternalDsl.g:1146:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1150:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // InternalDsl.g:1151:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Model__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__0"


    // $ANTLR start "rule__Model__Group__0__Impl"
    // InternalDsl.g:1158:1: rule__Model__Group__0__Impl : ( ( rule__Model__ConfigurationAssignment_0 ) ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1162:1: ( ( ( rule__Model__ConfigurationAssignment_0 ) ) )
            // InternalDsl.g:1163:1: ( ( rule__Model__ConfigurationAssignment_0 ) )
            {
            // InternalDsl.g:1163:1: ( ( rule__Model__ConfigurationAssignment_0 ) )
            // InternalDsl.g:1164:2: ( rule__Model__ConfigurationAssignment_0 )
            {
             before(grammarAccess.getModelAccess().getConfigurationAssignment_0()); 
            // InternalDsl.g:1165:2: ( rule__Model__ConfigurationAssignment_0 )
            // InternalDsl.g:1165:3: rule__Model__ConfigurationAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Model__ConfigurationAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getConfigurationAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__0__Impl"


    // $ANTLR start "rule__Model__Group__1"
    // InternalDsl.g:1173:1: rule__Model__Group__1 : rule__Model__Group__1__Impl ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1177:1: ( rule__Model__Group__1__Impl )
            // InternalDsl.g:1178:2: rule__Model__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__1"


    // $ANTLR start "rule__Model__Group__1__Impl"
    // InternalDsl.g:1184:1: rule__Model__Group__1__Impl : ( ( rule__Model__Group_1__0 )? ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1188:1: ( ( ( rule__Model__Group_1__0 )? ) )
            // InternalDsl.g:1189:1: ( ( rule__Model__Group_1__0 )? )
            {
            // InternalDsl.g:1189:1: ( ( rule__Model__Group_1__0 )? )
            // InternalDsl.g:1190:2: ( rule__Model__Group_1__0 )?
            {
             before(grammarAccess.getModelAccess().getGroup_1()); 
            // InternalDsl.g:1191:2: ( rule__Model__Group_1__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_ID) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalDsl.g:1191:3: rule__Model__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Model__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getModelAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__1__Impl"


    // $ANTLR start "rule__Model__Group_1__0"
    // InternalDsl.g:1200:1: rule__Model__Group_1__0 : rule__Model__Group_1__0__Impl rule__Model__Group_1__1 ;
    public final void rule__Model__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1204:1: ( rule__Model__Group_1__0__Impl rule__Model__Group_1__1 )
            // InternalDsl.g:1205:2: rule__Model__Group_1__0__Impl rule__Model__Group_1__1
            {
            pushFollow(FOLLOW_3);
            rule__Model__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_1__0"


    // $ANTLR start "rule__Model__Group_1__0__Impl"
    // InternalDsl.g:1212:1: rule__Model__Group_1__0__Impl : ( ( rule__Model__PoliciesAssignment_1_0 ) ) ;
    public final void rule__Model__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1216:1: ( ( ( rule__Model__PoliciesAssignment_1_0 ) ) )
            // InternalDsl.g:1217:1: ( ( rule__Model__PoliciesAssignment_1_0 ) )
            {
            // InternalDsl.g:1217:1: ( ( rule__Model__PoliciesAssignment_1_0 ) )
            // InternalDsl.g:1218:2: ( rule__Model__PoliciesAssignment_1_0 )
            {
             before(grammarAccess.getModelAccess().getPoliciesAssignment_1_0()); 
            // InternalDsl.g:1219:2: ( rule__Model__PoliciesAssignment_1_0 )
            // InternalDsl.g:1219:3: rule__Model__PoliciesAssignment_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Model__PoliciesAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getPoliciesAssignment_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_1__0__Impl"


    // $ANTLR start "rule__Model__Group_1__1"
    // InternalDsl.g:1227:1: rule__Model__Group_1__1 : rule__Model__Group_1__1__Impl ;
    public final void rule__Model__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1231:1: ( rule__Model__Group_1__1__Impl )
            // InternalDsl.g:1232:2: rule__Model__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_1__1"


    // $ANTLR start "rule__Model__Group_1__1__Impl"
    // InternalDsl.g:1238:1: rule__Model__Group_1__1__Impl : ( ( rule__Model__PoliciesAssignment_1_1 )* ) ;
    public final void rule__Model__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1242:1: ( ( ( rule__Model__PoliciesAssignment_1_1 )* ) )
            // InternalDsl.g:1243:1: ( ( rule__Model__PoliciesAssignment_1_1 )* )
            {
            // InternalDsl.g:1243:1: ( ( rule__Model__PoliciesAssignment_1_1 )* )
            // InternalDsl.g:1244:2: ( rule__Model__PoliciesAssignment_1_1 )*
            {
             before(grammarAccess.getModelAccess().getPoliciesAssignment_1_1()); 
            // InternalDsl.g:1245:2: ( rule__Model__PoliciesAssignment_1_1 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_ID) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalDsl.g:1245:3: rule__Model__PoliciesAssignment_1_1
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__Model__PoliciesAssignment_1_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getPoliciesAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_1__1__Impl"


    // $ANTLR start "rule__Configuration__Group__0"
    // InternalDsl.g:1254:1: rule__Configuration__Group__0 : rule__Configuration__Group__0__Impl rule__Configuration__Group__1 ;
    public final void rule__Configuration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1258:1: ( rule__Configuration__Group__0__Impl rule__Configuration__Group__1 )
            // InternalDsl.g:1259:2: rule__Configuration__Group__0__Impl rule__Configuration__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Configuration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Configuration__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configuration__Group__0"


    // $ANTLR start "rule__Configuration__Group__0__Impl"
    // InternalDsl.g:1266:1: rule__Configuration__Group__0__Impl : ( () ) ;
    public final void rule__Configuration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1270:1: ( ( () ) )
            // InternalDsl.g:1271:1: ( () )
            {
            // InternalDsl.g:1271:1: ( () )
            // InternalDsl.g:1272:2: ()
            {
             before(grammarAccess.getConfigurationAccess().getConfigurationAction_0()); 
            // InternalDsl.g:1273:2: ()
            // InternalDsl.g:1273:3: 
            {
            }

             after(grammarAccess.getConfigurationAccess().getConfigurationAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configuration__Group__0__Impl"


    // $ANTLR start "rule__Configuration__Group__1"
    // InternalDsl.g:1281:1: rule__Configuration__Group__1 : rule__Configuration__Group__1__Impl ;
    public final void rule__Configuration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1285:1: ( rule__Configuration__Group__1__Impl )
            // InternalDsl.g:1286:2: rule__Configuration__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Configuration__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configuration__Group__1"


    // $ANTLR start "rule__Configuration__Group__1__Impl"
    // InternalDsl.g:1292:1: rule__Configuration__Group__1__Impl : ( ( rule__Configuration__Group_1__0 )? ) ;
    public final void rule__Configuration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1296:1: ( ( ( rule__Configuration__Group_1__0 )? ) )
            // InternalDsl.g:1297:1: ( ( rule__Configuration__Group_1__0 )? )
            {
            // InternalDsl.g:1297:1: ( ( rule__Configuration__Group_1__0 )? )
            // InternalDsl.g:1298:2: ( rule__Configuration__Group_1__0 )?
            {
             before(grammarAccess.getConfigurationAccess().getGroup_1()); 
            // InternalDsl.g:1299:2: ( rule__Configuration__Group_1__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_STRING||LA10_0==12||(LA10_0>=29 && LA10_0<=30)) ) {
                alt10=1;
            }
            else if ( (LA10_0==RULE_ID) ) {
                int LA10_2 = input.LA(2);

                if ( (LA10_2==11) ) {
                    int LA10_4 = input.LA(3);

                    if ( (LA10_4==RULE_ID) ) {
                        alt10=1;
                    }
                }
                else if ( ((LA10_2>=26 && LA10_2<=28)) ) {
                    alt10=1;
                }
            }
            switch (alt10) {
                case 1 :
                    // InternalDsl.g:1299:3: rule__Configuration__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Configuration__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getConfigurationAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configuration__Group__1__Impl"


    // $ANTLR start "rule__Configuration__Group_1__0"
    // InternalDsl.g:1308:1: rule__Configuration__Group_1__0 : rule__Configuration__Group_1__0__Impl rule__Configuration__Group_1__1 ;
    public final void rule__Configuration__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1312:1: ( rule__Configuration__Group_1__0__Impl rule__Configuration__Group_1__1 )
            // InternalDsl.g:1313:2: rule__Configuration__Group_1__0__Impl rule__Configuration__Group_1__1
            {
            pushFollow(FOLLOW_5);
            rule__Configuration__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Configuration__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configuration__Group_1__0"


    // $ANTLR start "rule__Configuration__Group_1__0__Impl"
    // InternalDsl.g:1320:1: rule__Configuration__Group_1__0__Impl : ( ( rule__Configuration__MappingsAssignment_1_0 ) ) ;
    public final void rule__Configuration__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1324:1: ( ( ( rule__Configuration__MappingsAssignment_1_0 ) ) )
            // InternalDsl.g:1325:1: ( ( rule__Configuration__MappingsAssignment_1_0 ) )
            {
            // InternalDsl.g:1325:1: ( ( rule__Configuration__MappingsAssignment_1_0 ) )
            // InternalDsl.g:1326:2: ( rule__Configuration__MappingsAssignment_1_0 )
            {
             before(grammarAccess.getConfigurationAccess().getMappingsAssignment_1_0()); 
            // InternalDsl.g:1327:2: ( rule__Configuration__MappingsAssignment_1_0 )
            // InternalDsl.g:1327:3: rule__Configuration__MappingsAssignment_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Configuration__MappingsAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getConfigurationAccess().getMappingsAssignment_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configuration__Group_1__0__Impl"


    // $ANTLR start "rule__Configuration__Group_1__1"
    // InternalDsl.g:1335:1: rule__Configuration__Group_1__1 : rule__Configuration__Group_1__1__Impl ;
    public final void rule__Configuration__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1339:1: ( rule__Configuration__Group_1__1__Impl )
            // InternalDsl.g:1340:2: rule__Configuration__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Configuration__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configuration__Group_1__1"


    // $ANTLR start "rule__Configuration__Group_1__1__Impl"
    // InternalDsl.g:1346:1: rule__Configuration__Group_1__1__Impl : ( ( rule__Configuration__MappingsAssignment_1_1 )* ) ;
    public final void rule__Configuration__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1350:1: ( ( ( rule__Configuration__MappingsAssignment_1_1 )* ) )
            // InternalDsl.g:1351:1: ( ( rule__Configuration__MappingsAssignment_1_1 )* )
            {
            // InternalDsl.g:1351:1: ( ( rule__Configuration__MappingsAssignment_1_1 )* )
            // InternalDsl.g:1352:2: ( rule__Configuration__MappingsAssignment_1_1 )*
            {
             before(grammarAccess.getConfigurationAccess().getMappingsAssignment_1_1()); 
            // InternalDsl.g:1353:2: ( rule__Configuration__MappingsAssignment_1_1 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_ID) ) {
                    int LA11_2 = input.LA(2);

                    if ( (LA11_2==11) ) {
                        int LA11_4 = input.LA(3);

                        if ( (LA11_4==RULE_ID) ) {
                            alt11=1;
                        }


                    }
                    else if ( ((LA11_2>=26 && LA11_2<=28)) ) {
                        alt11=1;
                    }


                }
                else if ( (LA11_0==RULE_STRING||LA11_0==12||(LA11_0>=29 && LA11_0<=30)) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalDsl.g:1353:3: rule__Configuration__MappingsAssignment_1_1
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__Configuration__MappingsAssignment_1_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getConfigurationAccess().getMappingsAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configuration__Group_1__1__Impl"


    // $ANTLR start "rule__Policy__Group__0"
    // InternalDsl.g:1362:1: rule__Policy__Group__0 : rule__Policy__Group__0__Impl rule__Policy__Group__1 ;
    public final void rule__Policy__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1366:1: ( rule__Policy__Group__0__Impl rule__Policy__Group__1 )
            // InternalDsl.g:1367:2: rule__Policy__Group__0__Impl rule__Policy__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__Policy__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Policy__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Policy__Group__0"


    // $ANTLR start "rule__Policy__Group__0__Impl"
    // InternalDsl.g:1374:1: rule__Policy__Group__0__Impl : ( ( rule__Policy__NameAssignment_0 ) ) ;
    public final void rule__Policy__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1378:1: ( ( ( rule__Policy__NameAssignment_0 ) ) )
            // InternalDsl.g:1379:1: ( ( rule__Policy__NameAssignment_0 ) )
            {
            // InternalDsl.g:1379:1: ( ( rule__Policy__NameAssignment_0 ) )
            // InternalDsl.g:1380:2: ( rule__Policy__NameAssignment_0 )
            {
             before(grammarAccess.getPolicyAccess().getNameAssignment_0()); 
            // InternalDsl.g:1381:2: ( rule__Policy__NameAssignment_0 )
            // InternalDsl.g:1381:3: rule__Policy__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Policy__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getPolicyAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Policy__Group__0__Impl"


    // $ANTLR start "rule__Policy__Group__1"
    // InternalDsl.g:1389:1: rule__Policy__Group__1 : rule__Policy__Group__1__Impl rule__Policy__Group__2 ;
    public final void rule__Policy__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1393:1: ( rule__Policy__Group__1__Impl rule__Policy__Group__2 )
            // InternalDsl.g:1394:2: rule__Policy__Group__1__Impl rule__Policy__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__Policy__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Policy__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Policy__Group__1"


    // $ANTLR start "rule__Policy__Group__1__Impl"
    // InternalDsl.g:1401:1: rule__Policy__Group__1__Impl : ( ':' ) ;
    public final void rule__Policy__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1405:1: ( ( ':' ) )
            // InternalDsl.g:1406:1: ( ':' )
            {
            // InternalDsl.g:1406:1: ( ':' )
            // InternalDsl.g:1407:2: ':'
            {
             before(grammarAccess.getPolicyAccess().getColonKeyword_1()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getPolicyAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Policy__Group__1__Impl"


    // $ANTLR start "rule__Policy__Group__2"
    // InternalDsl.g:1416:1: rule__Policy__Group__2 : rule__Policy__Group__2__Impl ;
    public final void rule__Policy__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1420:1: ( rule__Policy__Group__2__Impl )
            // InternalDsl.g:1421:2: rule__Policy__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Policy__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Policy__Group__2"


    // $ANTLR start "rule__Policy__Group__2__Impl"
    // InternalDsl.g:1427:1: rule__Policy__Group__2__Impl : ( ( rule__Policy__RuleAssignment_2 ) ) ;
    public final void rule__Policy__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1431:1: ( ( ( rule__Policy__RuleAssignment_2 ) ) )
            // InternalDsl.g:1432:1: ( ( rule__Policy__RuleAssignment_2 ) )
            {
            // InternalDsl.g:1432:1: ( ( rule__Policy__RuleAssignment_2 ) )
            // InternalDsl.g:1433:2: ( rule__Policy__RuleAssignment_2 )
            {
             before(grammarAccess.getPolicyAccess().getRuleAssignment_2()); 
            // InternalDsl.g:1434:2: ( rule__Policy__RuleAssignment_2 )
            // InternalDsl.g:1434:3: rule__Policy__RuleAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Policy__RuleAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getPolicyAccess().getRuleAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Policy__Group__2__Impl"


    // $ANTLR start "rule__Mapping__Group__0"
    // InternalDsl.g:1443:1: rule__Mapping__Group__0 : rule__Mapping__Group__0__Impl rule__Mapping__Group__1 ;
    public final void rule__Mapping__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1447:1: ( rule__Mapping__Group__0__Impl rule__Mapping__Group__1 )
            // InternalDsl.g:1448:2: rule__Mapping__Group__0__Impl rule__Mapping__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__Mapping__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mapping__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mapping__Group__0"


    // $ANTLR start "rule__Mapping__Group__0__Impl"
    // InternalDsl.g:1455:1: rule__Mapping__Group__0__Impl : ( ( rule__Mapping__RuleAssignment_0 ) ) ;
    public final void rule__Mapping__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1459:1: ( ( ( rule__Mapping__RuleAssignment_0 ) ) )
            // InternalDsl.g:1460:1: ( ( rule__Mapping__RuleAssignment_0 ) )
            {
            // InternalDsl.g:1460:1: ( ( rule__Mapping__RuleAssignment_0 ) )
            // InternalDsl.g:1461:2: ( rule__Mapping__RuleAssignment_0 )
            {
             before(grammarAccess.getMappingAccess().getRuleAssignment_0()); 
            // InternalDsl.g:1462:2: ( rule__Mapping__RuleAssignment_0 )
            // InternalDsl.g:1462:3: rule__Mapping__RuleAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Mapping__RuleAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getMappingAccess().getRuleAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mapping__Group__0__Impl"


    // $ANTLR start "rule__Mapping__Group__1"
    // InternalDsl.g:1470:1: rule__Mapping__Group__1 : rule__Mapping__Group__1__Impl rule__Mapping__Group__2 ;
    public final void rule__Mapping__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1474:1: ( rule__Mapping__Group__1__Impl rule__Mapping__Group__2 )
            // InternalDsl.g:1475:2: rule__Mapping__Group__1__Impl rule__Mapping__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__Mapping__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mapping__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mapping__Group__1"


    // $ANTLR start "rule__Mapping__Group__1__Impl"
    // InternalDsl.g:1482:1: rule__Mapping__Group__1__Impl : ( ':' ) ;
    public final void rule__Mapping__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1486:1: ( ( ':' ) )
            // InternalDsl.g:1487:1: ( ':' )
            {
            // InternalDsl.g:1487:1: ( ':' )
            // InternalDsl.g:1488:2: ':'
            {
             before(grammarAccess.getMappingAccess().getColonKeyword_1()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getMappingAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mapping__Group__1__Impl"


    // $ANTLR start "rule__Mapping__Group__2"
    // InternalDsl.g:1497:1: rule__Mapping__Group__2 : rule__Mapping__Group__2__Impl ;
    public final void rule__Mapping__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1501:1: ( rule__Mapping__Group__2__Impl )
            // InternalDsl.g:1502:2: rule__Mapping__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Mapping__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mapping__Group__2"


    // $ANTLR start "rule__Mapping__Group__2__Impl"
    // InternalDsl.g:1508:1: rule__Mapping__Group__2__Impl : ( ( rule__Mapping__PolicyAssignment_2 ) ) ;
    public final void rule__Mapping__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1512:1: ( ( ( rule__Mapping__PolicyAssignment_2 ) ) )
            // InternalDsl.g:1513:1: ( ( rule__Mapping__PolicyAssignment_2 ) )
            {
            // InternalDsl.g:1513:1: ( ( rule__Mapping__PolicyAssignment_2 ) )
            // InternalDsl.g:1514:2: ( rule__Mapping__PolicyAssignment_2 )
            {
             before(grammarAccess.getMappingAccess().getPolicyAssignment_2()); 
            // InternalDsl.g:1515:2: ( rule__Mapping__PolicyAssignment_2 )
            // InternalDsl.g:1515:3: rule__Mapping__PolicyAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Mapping__PolicyAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getMappingAccess().getPolicyAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mapping__Group__2__Impl"


    // $ANTLR start "rule__FeatureNameMappingRule__Group__0"
    // InternalDsl.g:1524:1: rule__FeatureNameMappingRule__Group__0 : rule__FeatureNameMappingRule__Group__0__Impl rule__FeatureNameMappingRule__Group__1 ;
    public final void rule__FeatureNameMappingRule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1528:1: ( rule__FeatureNameMappingRule__Group__0__Impl rule__FeatureNameMappingRule__Group__1 )
            // InternalDsl.g:1529:2: rule__FeatureNameMappingRule__Group__0__Impl rule__FeatureNameMappingRule__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__FeatureNameMappingRule__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FeatureNameMappingRule__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureNameMappingRule__Group__0"


    // $ANTLR start "rule__FeatureNameMappingRule__Group__0__Impl"
    // InternalDsl.g:1536:1: rule__FeatureNameMappingRule__Group__0__Impl : ( () ) ;
    public final void rule__FeatureNameMappingRule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1540:1: ( ( () ) )
            // InternalDsl.g:1541:1: ( () )
            {
            // InternalDsl.g:1541:1: ( () )
            // InternalDsl.g:1542:2: ()
            {
             before(grammarAccess.getFeatureNameMappingRuleAccess().getFeatureNameMappingRuleAction_0()); 
            // InternalDsl.g:1543:2: ()
            // InternalDsl.g:1543:3: 
            {
            }

             after(grammarAccess.getFeatureNameMappingRuleAccess().getFeatureNameMappingRuleAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureNameMappingRule__Group__0__Impl"


    // $ANTLR start "rule__FeatureNameMappingRule__Group__1"
    // InternalDsl.g:1551:1: rule__FeatureNameMappingRule__Group__1 : rule__FeatureNameMappingRule__Group__1__Impl ;
    public final void rule__FeatureNameMappingRule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1555:1: ( rule__FeatureNameMappingRule__Group__1__Impl )
            // InternalDsl.g:1556:2: rule__FeatureNameMappingRule__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FeatureNameMappingRule__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureNameMappingRule__Group__1"


    // $ANTLR start "rule__FeatureNameMappingRule__Group__1__Impl"
    // InternalDsl.g:1562:1: rule__FeatureNameMappingRule__Group__1__Impl : ( ( rule__FeatureNameMappingRule__NameAssignment_1 ) ) ;
    public final void rule__FeatureNameMappingRule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1566:1: ( ( ( rule__FeatureNameMappingRule__NameAssignment_1 ) ) )
            // InternalDsl.g:1567:1: ( ( rule__FeatureNameMappingRule__NameAssignment_1 ) )
            {
            // InternalDsl.g:1567:1: ( ( rule__FeatureNameMappingRule__NameAssignment_1 ) )
            // InternalDsl.g:1568:2: ( rule__FeatureNameMappingRule__NameAssignment_1 )
            {
             before(grammarAccess.getFeatureNameMappingRuleAccess().getNameAssignment_1()); 
            // InternalDsl.g:1569:2: ( rule__FeatureNameMappingRule__NameAssignment_1 )
            // InternalDsl.g:1569:3: rule__FeatureNameMappingRule__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__FeatureNameMappingRule__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFeatureNameMappingRuleAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureNameMappingRule__Group__1__Impl"


    // $ANTLR start "rule__TrueMappingRule__Group__0"
    // InternalDsl.g:1578:1: rule__TrueMappingRule__Group__0 : rule__TrueMappingRule__Group__0__Impl rule__TrueMappingRule__Group__1 ;
    public final void rule__TrueMappingRule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1582:1: ( rule__TrueMappingRule__Group__0__Impl rule__TrueMappingRule__Group__1 )
            // InternalDsl.g:1583:2: rule__TrueMappingRule__Group__0__Impl rule__TrueMappingRule__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__TrueMappingRule__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TrueMappingRule__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrueMappingRule__Group__0"


    // $ANTLR start "rule__TrueMappingRule__Group__0__Impl"
    // InternalDsl.g:1590:1: rule__TrueMappingRule__Group__0__Impl : ( () ) ;
    public final void rule__TrueMappingRule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1594:1: ( ( () ) )
            // InternalDsl.g:1595:1: ( () )
            {
            // InternalDsl.g:1595:1: ( () )
            // InternalDsl.g:1596:2: ()
            {
             before(grammarAccess.getTrueMappingRuleAccess().getTrueMappingRuleAction_0()); 
            // InternalDsl.g:1597:2: ()
            // InternalDsl.g:1597:3: 
            {
            }

             after(grammarAccess.getTrueMappingRuleAccess().getTrueMappingRuleAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrueMappingRule__Group__0__Impl"


    // $ANTLR start "rule__TrueMappingRule__Group__1"
    // InternalDsl.g:1605:1: rule__TrueMappingRule__Group__1 : rule__TrueMappingRule__Group__1__Impl ;
    public final void rule__TrueMappingRule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1609:1: ( rule__TrueMappingRule__Group__1__Impl )
            // InternalDsl.g:1610:2: rule__TrueMappingRule__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TrueMappingRule__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrueMappingRule__Group__1"


    // $ANTLR start "rule__TrueMappingRule__Group__1__Impl"
    // InternalDsl.g:1616:1: rule__TrueMappingRule__Group__1__Impl : ( 'true' ) ;
    public final void rule__TrueMappingRule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1620:1: ( ( 'true' ) )
            // InternalDsl.g:1621:1: ( 'true' )
            {
            // InternalDsl.g:1621:1: ( 'true' )
            // InternalDsl.g:1622:2: 'true'
            {
             before(grammarAccess.getTrueMappingRuleAccess().getTrueKeyword_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getTrueMappingRuleAccess().getTrueKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrueMappingRule__Group__1__Impl"


    // $ANTLR start "rule__RelationIsCyclicRule__Group__0"
    // InternalDsl.g:1632:1: rule__RelationIsCyclicRule__Group__0 : rule__RelationIsCyclicRule__Group__0__Impl rule__RelationIsCyclicRule__Group__1 ;
    public final void rule__RelationIsCyclicRule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1636:1: ( rule__RelationIsCyclicRule__Group__0__Impl rule__RelationIsCyclicRule__Group__1 )
            // InternalDsl.g:1637:2: rule__RelationIsCyclicRule__Group__0__Impl rule__RelationIsCyclicRule__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__RelationIsCyclicRule__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RelationIsCyclicRule__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationIsCyclicRule__Group__0"


    // $ANTLR start "rule__RelationIsCyclicRule__Group__0__Impl"
    // InternalDsl.g:1644:1: rule__RelationIsCyclicRule__Group__0__Impl : ( () ) ;
    public final void rule__RelationIsCyclicRule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1648:1: ( ( () ) )
            // InternalDsl.g:1649:1: ( () )
            {
            // InternalDsl.g:1649:1: ( () )
            // InternalDsl.g:1650:2: ()
            {
             before(grammarAccess.getRelationIsCyclicRuleAccess().getRelationIsCyclicRuleAction_0()); 
            // InternalDsl.g:1651:2: ()
            // InternalDsl.g:1651:3: 
            {
            }

             after(grammarAccess.getRelationIsCyclicRuleAccess().getRelationIsCyclicRuleAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationIsCyclicRule__Group__0__Impl"


    // $ANTLR start "rule__RelationIsCyclicRule__Group__1"
    // InternalDsl.g:1659:1: rule__RelationIsCyclicRule__Group__1 : rule__RelationIsCyclicRule__Group__1__Impl ;
    public final void rule__RelationIsCyclicRule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1663:1: ( rule__RelationIsCyclicRule__Group__1__Impl )
            // InternalDsl.g:1664:2: rule__RelationIsCyclicRule__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RelationIsCyclicRule__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationIsCyclicRule__Group__1"


    // $ANTLR start "rule__RelationIsCyclicRule__Group__1__Impl"
    // InternalDsl.g:1670:1: rule__RelationIsCyclicRule__Group__1__Impl : ( 'RelationIsCyclic' ) ;
    public final void rule__RelationIsCyclicRule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1674:1: ( ( 'RelationIsCyclic' ) )
            // InternalDsl.g:1675:1: ( 'RelationIsCyclic' )
            {
            // InternalDsl.g:1675:1: ( 'RelationIsCyclic' )
            // InternalDsl.g:1676:2: 'RelationIsCyclic'
            {
             before(grammarAccess.getRelationIsCyclicRuleAccess().getRelationIsCyclicKeyword_1()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getRelationIsCyclicRuleAccess().getRelationIsCyclicKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationIsCyclicRule__Group__1__Impl"


    // $ANTLR start "rule__RelationTypesAreEqualRule__Group__0"
    // InternalDsl.g:1686:1: rule__RelationTypesAreEqualRule__Group__0 : rule__RelationTypesAreEqualRule__Group__0__Impl rule__RelationTypesAreEqualRule__Group__1 ;
    public final void rule__RelationTypesAreEqualRule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1690:1: ( rule__RelationTypesAreEqualRule__Group__0__Impl rule__RelationTypesAreEqualRule__Group__1 )
            // InternalDsl.g:1691:2: rule__RelationTypesAreEqualRule__Group__0__Impl rule__RelationTypesAreEqualRule__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__RelationTypesAreEqualRule__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RelationTypesAreEqualRule__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationTypesAreEqualRule__Group__0"


    // $ANTLR start "rule__RelationTypesAreEqualRule__Group__0__Impl"
    // InternalDsl.g:1698:1: rule__RelationTypesAreEqualRule__Group__0__Impl : ( () ) ;
    public final void rule__RelationTypesAreEqualRule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1702:1: ( ( () ) )
            // InternalDsl.g:1703:1: ( () )
            {
            // InternalDsl.g:1703:1: ( () )
            // InternalDsl.g:1704:2: ()
            {
             before(grammarAccess.getRelationTypesAreEqualRuleAccess().getRelationTypesAreEqualRuleAction_0()); 
            // InternalDsl.g:1705:2: ()
            // InternalDsl.g:1705:3: 
            {
            }

             after(grammarAccess.getRelationTypesAreEqualRuleAccess().getRelationTypesAreEqualRuleAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationTypesAreEqualRule__Group__0__Impl"


    // $ANTLR start "rule__RelationTypesAreEqualRule__Group__1"
    // InternalDsl.g:1713:1: rule__RelationTypesAreEqualRule__Group__1 : rule__RelationTypesAreEqualRule__Group__1__Impl ;
    public final void rule__RelationTypesAreEqualRule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1717:1: ( rule__RelationTypesAreEqualRule__Group__1__Impl )
            // InternalDsl.g:1718:2: rule__RelationTypesAreEqualRule__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RelationTypesAreEqualRule__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationTypesAreEqualRule__Group__1"


    // $ANTLR start "rule__RelationTypesAreEqualRule__Group__1__Impl"
    // InternalDsl.g:1724:1: rule__RelationTypesAreEqualRule__Group__1__Impl : ( 'RelationTypesAreEqual' ) ;
    public final void rule__RelationTypesAreEqualRule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1728:1: ( ( 'RelationTypesAreEqual' ) )
            // InternalDsl.g:1729:1: ( 'RelationTypesAreEqual' )
            {
            // InternalDsl.g:1729:1: ( 'RelationTypesAreEqual' )
            // InternalDsl.g:1730:2: 'RelationTypesAreEqual'
            {
             before(grammarAccess.getRelationTypesAreEqualRuleAccess().getRelationTypesAreEqualKeyword_1()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getRelationTypesAreEqualRuleAccess().getRelationTypesAreEqualKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationTypesAreEqualRule__Group__1__Impl"


    // $ANTLR start "rule__RelationIsReflexivRule__Group__0"
    // InternalDsl.g:1740:1: rule__RelationIsReflexivRule__Group__0 : rule__RelationIsReflexivRule__Group__0__Impl rule__RelationIsReflexivRule__Group__1 ;
    public final void rule__RelationIsReflexivRule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1744:1: ( rule__RelationIsReflexivRule__Group__0__Impl rule__RelationIsReflexivRule__Group__1 )
            // InternalDsl.g:1745:2: rule__RelationIsReflexivRule__Group__0__Impl rule__RelationIsReflexivRule__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__RelationIsReflexivRule__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RelationIsReflexivRule__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationIsReflexivRule__Group__0"


    // $ANTLR start "rule__RelationIsReflexivRule__Group__0__Impl"
    // InternalDsl.g:1752:1: rule__RelationIsReflexivRule__Group__0__Impl : ( () ) ;
    public final void rule__RelationIsReflexivRule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1756:1: ( ( () ) )
            // InternalDsl.g:1757:1: ( () )
            {
            // InternalDsl.g:1757:1: ( () )
            // InternalDsl.g:1758:2: ()
            {
             before(grammarAccess.getRelationIsReflexivRuleAccess().getRelationIsReflexivRuleAction_0()); 
            // InternalDsl.g:1759:2: ()
            // InternalDsl.g:1759:3: 
            {
            }

             after(grammarAccess.getRelationIsReflexivRuleAccess().getRelationIsReflexivRuleAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationIsReflexivRule__Group__0__Impl"


    // $ANTLR start "rule__RelationIsReflexivRule__Group__1"
    // InternalDsl.g:1767:1: rule__RelationIsReflexivRule__Group__1 : rule__RelationIsReflexivRule__Group__1__Impl ;
    public final void rule__RelationIsReflexivRule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1771:1: ( rule__RelationIsReflexivRule__Group__1__Impl )
            // InternalDsl.g:1772:2: rule__RelationIsReflexivRule__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RelationIsReflexivRule__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationIsReflexivRule__Group__1"


    // $ANTLR start "rule__RelationIsReflexivRule__Group__1__Impl"
    // InternalDsl.g:1778:1: rule__RelationIsReflexivRule__Group__1__Impl : ( 'RelationIsReflexiv' ) ;
    public final void rule__RelationIsReflexivRule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1782:1: ( ( 'RelationIsReflexiv' ) )
            // InternalDsl.g:1783:1: ( 'RelationIsReflexiv' )
            {
            // InternalDsl.g:1783:1: ( 'RelationIsReflexiv' )
            // InternalDsl.g:1784:2: 'RelationIsReflexiv'
            {
             before(grammarAccess.getRelationIsReflexivRuleAccess().getRelationIsReflexivKeyword_1()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getRelationIsReflexivRuleAccess().getRelationIsReflexivKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationIsReflexivRule__Group__1__Impl"


    // $ANTLR start "rule__RelationNameRule__Group__0"
    // InternalDsl.g:1794:1: rule__RelationNameRule__Group__0 : rule__RelationNameRule__Group__0__Impl rule__RelationNameRule__Group__1 ;
    public final void rule__RelationNameRule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1798:1: ( rule__RelationNameRule__Group__0__Impl rule__RelationNameRule__Group__1 )
            // InternalDsl.g:1799:2: rule__RelationNameRule__Group__0__Impl rule__RelationNameRule__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__RelationNameRule__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RelationNameRule__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationNameRule__Group__0"


    // $ANTLR start "rule__RelationNameRule__Group__0__Impl"
    // InternalDsl.g:1806:1: rule__RelationNameRule__Group__0__Impl : ( () ) ;
    public final void rule__RelationNameRule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1810:1: ( ( () ) )
            // InternalDsl.g:1811:1: ( () )
            {
            // InternalDsl.g:1811:1: ( () )
            // InternalDsl.g:1812:2: ()
            {
             before(grammarAccess.getRelationNameRuleAccess().getRelationNameRuleAction_0()); 
            // InternalDsl.g:1813:2: ()
            // InternalDsl.g:1813:3: 
            {
            }

             after(grammarAccess.getRelationNameRuleAccess().getRelationNameRuleAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationNameRule__Group__0__Impl"


    // $ANTLR start "rule__RelationNameRule__Group__1"
    // InternalDsl.g:1821:1: rule__RelationNameRule__Group__1 : rule__RelationNameRule__Group__1__Impl rule__RelationNameRule__Group__2 ;
    public final void rule__RelationNameRule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1825:1: ( rule__RelationNameRule__Group__1__Impl rule__RelationNameRule__Group__2 )
            // InternalDsl.g:1826:2: rule__RelationNameRule__Group__1__Impl rule__RelationNameRule__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__RelationNameRule__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RelationNameRule__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationNameRule__Group__1"


    // $ANTLR start "rule__RelationNameRule__Group__1__Impl"
    // InternalDsl.g:1833:1: rule__RelationNameRule__Group__1__Impl : ( 'RelationName' ) ;
    public final void rule__RelationNameRule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1837:1: ( ( 'RelationName' ) )
            // InternalDsl.g:1838:1: ( 'RelationName' )
            {
            // InternalDsl.g:1838:1: ( 'RelationName' )
            // InternalDsl.g:1839:2: 'RelationName'
            {
             before(grammarAccess.getRelationNameRuleAccess().getRelationNameKeyword_1()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getRelationNameRuleAccess().getRelationNameKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationNameRule__Group__1__Impl"


    // $ANTLR start "rule__RelationNameRule__Group__2"
    // InternalDsl.g:1848:1: rule__RelationNameRule__Group__2 : rule__RelationNameRule__Group__2__Impl ;
    public final void rule__RelationNameRule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1852:1: ( rule__RelationNameRule__Group__2__Impl )
            // InternalDsl.g:1853:2: rule__RelationNameRule__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RelationNameRule__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationNameRule__Group__2"


    // $ANTLR start "rule__RelationNameRule__Group__2__Impl"
    // InternalDsl.g:1859:1: rule__RelationNameRule__Group__2__Impl : ( ( rule__RelationNameRule__NameAssignment_2 ) ) ;
    public final void rule__RelationNameRule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1863:1: ( ( ( rule__RelationNameRule__NameAssignment_2 ) ) )
            // InternalDsl.g:1864:1: ( ( rule__RelationNameRule__NameAssignment_2 ) )
            {
            // InternalDsl.g:1864:1: ( ( rule__RelationNameRule__NameAssignment_2 ) )
            // InternalDsl.g:1865:2: ( rule__RelationNameRule__NameAssignment_2 )
            {
             before(grammarAccess.getRelationNameRuleAccess().getNameAssignment_2()); 
            // InternalDsl.g:1866:2: ( rule__RelationNameRule__NameAssignment_2 )
            // InternalDsl.g:1866:3: rule__RelationNameRule__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__RelationNameRule__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getRelationNameRuleAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationNameRule__Group__2__Impl"


    // $ANTLR start "rule__TypeExistsRule__Group__0"
    // InternalDsl.g:1875:1: rule__TypeExistsRule__Group__0 : rule__TypeExistsRule__Group__0__Impl rule__TypeExistsRule__Group__1 ;
    public final void rule__TypeExistsRule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1879:1: ( rule__TypeExistsRule__Group__0__Impl rule__TypeExistsRule__Group__1 )
            // InternalDsl.g:1880:2: rule__TypeExistsRule__Group__0__Impl rule__TypeExistsRule__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__TypeExistsRule__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TypeExistsRule__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeExistsRule__Group__0"


    // $ANTLR start "rule__TypeExistsRule__Group__0__Impl"
    // InternalDsl.g:1887:1: rule__TypeExistsRule__Group__0__Impl : ( () ) ;
    public final void rule__TypeExistsRule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1891:1: ( ( () ) )
            // InternalDsl.g:1892:1: ( () )
            {
            // InternalDsl.g:1892:1: ( () )
            // InternalDsl.g:1893:2: ()
            {
             before(grammarAccess.getTypeExistsRuleAccess().getTypeExistsRuleAction_0()); 
            // InternalDsl.g:1894:2: ()
            // InternalDsl.g:1894:3: 
            {
            }

             after(grammarAccess.getTypeExistsRuleAccess().getTypeExistsRuleAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeExistsRule__Group__0__Impl"


    // $ANTLR start "rule__TypeExistsRule__Group__1"
    // InternalDsl.g:1902:1: rule__TypeExistsRule__Group__1 : rule__TypeExistsRule__Group__1__Impl rule__TypeExistsRule__Group__2 ;
    public final void rule__TypeExistsRule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1906:1: ( rule__TypeExistsRule__Group__1__Impl rule__TypeExistsRule__Group__2 )
            // InternalDsl.g:1907:2: rule__TypeExistsRule__Group__1__Impl rule__TypeExistsRule__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__TypeExistsRule__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TypeExistsRule__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeExistsRule__Group__1"


    // $ANTLR start "rule__TypeExistsRule__Group__1__Impl"
    // InternalDsl.g:1914:1: rule__TypeExistsRule__Group__1__Impl : ( 'TypeExists' ) ;
    public final void rule__TypeExistsRule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1918:1: ( ( 'TypeExists' ) )
            // InternalDsl.g:1919:1: ( 'TypeExists' )
            {
            // InternalDsl.g:1919:1: ( 'TypeExists' )
            // InternalDsl.g:1920:2: 'TypeExists'
            {
             before(grammarAccess.getTypeExistsRuleAccess().getTypeExistsKeyword_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getTypeExistsRuleAccess().getTypeExistsKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeExistsRule__Group__1__Impl"


    // $ANTLR start "rule__TypeExistsRule__Group__2"
    // InternalDsl.g:1929:1: rule__TypeExistsRule__Group__2 : rule__TypeExistsRule__Group__2__Impl ;
    public final void rule__TypeExistsRule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1933:1: ( rule__TypeExistsRule__Group__2__Impl )
            // InternalDsl.g:1934:2: rule__TypeExistsRule__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TypeExistsRule__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeExistsRule__Group__2"


    // $ANTLR start "rule__TypeExistsRule__Group__2__Impl"
    // InternalDsl.g:1940:1: rule__TypeExistsRule__Group__2__Impl : ( ( rule__TypeExistsRule__NameAssignment_2 ) ) ;
    public final void rule__TypeExistsRule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1944:1: ( ( ( rule__TypeExistsRule__NameAssignment_2 ) ) )
            // InternalDsl.g:1945:1: ( ( rule__TypeExistsRule__NameAssignment_2 ) )
            {
            // InternalDsl.g:1945:1: ( ( rule__TypeExistsRule__NameAssignment_2 ) )
            // InternalDsl.g:1946:2: ( rule__TypeExistsRule__NameAssignment_2 )
            {
             before(grammarAccess.getTypeExistsRuleAccess().getNameAssignment_2()); 
            // InternalDsl.g:1947:2: ( rule__TypeExistsRule__NameAssignment_2 )
            // InternalDsl.g:1947:3: rule__TypeExistsRule__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__TypeExistsRule__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getTypeExistsRuleAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeExistsRule__Group__2__Impl"


    // $ANTLR start "rule__SourceTypeRule__Group__0"
    // InternalDsl.g:1956:1: rule__SourceTypeRule__Group__0 : rule__SourceTypeRule__Group__0__Impl rule__SourceTypeRule__Group__1 ;
    public final void rule__SourceTypeRule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1960:1: ( rule__SourceTypeRule__Group__0__Impl rule__SourceTypeRule__Group__1 )
            // InternalDsl.g:1961:2: rule__SourceTypeRule__Group__0__Impl rule__SourceTypeRule__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__SourceTypeRule__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SourceTypeRule__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SourceTypeRule__Group__0"


    // $ANTLR start "rule__SourceTypeRule__Group__0__Impl"
    // InternalDsl.g:1968:1: rule__SourceTypeRule__Group__0__Impl : ( () ) ;
    public final void rule__SourceTypeRule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1972:1: ( ( () ) )
            // InternalDsl.g:1973:1: ( () )
            {
            // InternalDsl.g:1973:1: ( () )
            // InternalDsl.g:1974:2: ()
            {
             before(grammarAccess.getSourceTypeRuleAccess().getSourceTypeRuleAction_0()); 
            // InternalDsl.g:1975:2: ()
            // InternalDsl.g:1975:3: 
            {
            }

             after(grammarAccess.getSourceTypeRuleAccess().getSourceTypeRuleAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SourceTypeRule__Group__0__Impl"


    // $ANTLR start "rule__SourceTypeRule__Group__1"
    // InternalDsl.g:1983:1: rule__SourceTypeRule__Group__1 : rule__SourceTypeRule__Group__1__Impl rule__SourceTypeRule__Group__2 ;
    public final void rule__SourceTypeRule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1987:1: ( rule__SourceTypeRule__Group__1__Impl rule__SourceTypeRule__Group__2 )
            // InternalDsl.g:1988:2: rule__SourceTypeRule__Group__1__Impl rule__SourceTypeRule__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__SourceTypeRule__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SourceTypeRule__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SourceTypeRule__Group__1"


    // $ANTLR start "rule__SourceTypeRule__Group__1__Impl"
    // InternalDsl.g:1995:1: rule__SourceTypeRule__Group__1__Impl : ( 'SourceType' ) ;
    public final void rule__SourceTypeRule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1999:1: ( ( 'SourceType' ) )
            // InternalDsl.g:2000:1: ( 'SourceType' )
            {
            // InternalDsl.g:2000:1: ( 'SourceType' )
            // InternalDsl.g:2001:2: 'SourceType'
            {
             before(grammarAccess.getSourceTypeRuleAccess().getSourceTypeKeyword_1()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getSourceTypeRuleAccess().getSourceTypeKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SourceTypeRule__Group__1__Impl"


    // $ANTLR start "rule__SourceTypeRule__Group__2"
    // InternalDsl.g:2010:1: rule__SourceTypeRule__Group__2 : rule__SourceTypeRule__Group__2__Impl ;
    public final void rule__SourceTypeRule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2014:1: ( rule__SourceTypeRule__Group__2__Impl )
            // InternalDsl.g:2015:2: rule__SourceTypeRule__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SourceTypeRule__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SourceTypeRule__Group__2"


    // $ANTLR start "rule__SourceTypeRule__Group__2__Impl"
    // InternalDsl.g:2021:1: rule__SourceTypeRule__Group__2__Impl : ( ( rule__SourceTypeRule__NameAssignment_2 ) ) ;
    public final void rule__SourceTypeRule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2025:1: ( ( ( rule__SourceTypeRule__NameAssignment_2 ) ) )
            // InternalDsl.g:2026:1: ( ( rule__SourceTypeRule__NameAssignment_2 ) )
            {
            // InternalDsl.g:2026:1: ( ( rule__SourceTypeRule__NameAssignment_2 ) )
            // InternalDsl.g:2027:2: ( rule__SourceTypeRule__NameAssignment_2 )
            {
             before(grammarAccess.getSourceTypeRuleAccess().getNameAssignment_2()); 
            // InternalDsl.g:2028:2: ( rule__SourceTypeRule__NameAssignment_2 )
            // InternalDsl.g:2028:3: rule__SourceTypeRule__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__SourceTypeRule__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSourceTypeRuleAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SourceTypeRule__Group__2__Impl"


    // $ANTLR start "rule__TargetTypeRule__Group__0"
    // InternalDsl.g:2037:1: rule__TargetTypeRule__Group__0 : rule__TargetTypeRule__Group__0__Impl rule__TargetTypeRule__Group__1 ;
    public final void rule__TargetTypeRule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2041:1: ( rule__TargetTypeRule__Group__0__Impl rule__TargetTypeRule__Group__1 )
            // InternalDsl.g:2042:2: rule__TargetTypeRule__Group__0__Impl rule__TargetTypeRule__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__TargetTypeRule__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TargetTypeRule__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TargetTypeRule__Group__0"


    // $ANTLR start "rule__TargetTypeRule__Group__0__Impl"
    // InternalDsl.g:2049:1: rule__TargetTypeRule__Group__0__Impl : ( () ) ;
    public final void rule__TargetTypeRule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2053:1: ( ( () ) )
            // InternalDsl.g:2054:1: ( () )
            {
            // InternalDsl.g:2054:1: ( () )
            // InternalDsl.g:2055:2: ()
            {
             before(grammarAccess.getTargetTypeRuleAccess().getTargetTypeRuleAction_0()); 
            // InternalDsl.g:2056:2: ()
            // InternalDsl.g:2056:3: 
            {
            }

             after(grammarAccess.getTargetTypeRuleAccess().getTargetTypeRuleAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TargetTypeRule__Group__0__Impl"


    // $ANTLR start "rule__TargetTypeRule__Group__1"
    // InternalDsl.g:2064:1: rule__TargetTypeRule__Group__1 : rule__TargetTypeRule__Group__1__Impl rule__TargetTypeRule__Group__2 ;
    public final void rule__TargetTypeRule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2068:1: ( rule__TargetTypeRule__Group__1__Impl rule__TargetTypeRule__Group__2 )
            // InternalDsl.g:2069:2: rule__TargetTypeRule__Group__1__Impl rule__TargetTypeRule__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__TargetTypeRule__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TargetTypeRule__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TargetTypeRule__Group__1"


    // $ANTLR start "rule__TargetTypeRule__Group__1__Impl"
    // InternalDsl.g:2076:1: rule__TargetTypeRule__Group__1__Impl : ( 'TargetType' ) ;
    public final void rule__TargetTypeRule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2080:1: ( ( 'TargetType' ) )
            // InternalDsl.g:2081:1: ( 'TargetType' )
            {
            // InternalDsl.g:2081:1: ( 'TargetType' )
            // InternalDsl.g:2082:2: 'TargetType'
            {
             before(grammarAccess.getTargetTypeRuleAccess().getTargetTypeKeyword_1()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getTargetTypeRuleAccess().getTargetTypeKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TargetTypeRule__Group__1__Impl"


    // $ANTLR start "rule__TargetTypeRule__Group__2"
    // InternalDsl.g:2091:1: rule__TargetTypeRule__Group__2 : rule__TargetTypeRule__Group__2__Impl ;
    public final void rule__TargetTypeRule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2095:1: ( rule__TargetTypeRule__Group__2__Impl )
            // InternalDsl.g:2096:2: rule__TargetTypeRule__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TargetTypeRule__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TargetTypeRule__Group__2"


    // $ANTLR start "rule__TargetTypeRule__Group__2__Impl"
    // InternalDsl.g:2102:1: rule__TargetTypeRule__Group__2__Impl : ( ( rule__TargetTypeRule__NameAssignment_2 ) ) ;
    public final void rule__TargetTypeRule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2106:1: ( ( ( rule__TargetTypeRule__NameAssignment_2 ) ) )
            // InternalDsl.g:2107:1: ( ( rule__TargetTypeRule__NameAssignment_2 ) )
            {
            // InternalDsl.g:2107:1: ( ( rule__TargetTypeRule__NameAssignment_2 ) )
            // InternalDsl.g:2108:2: ( rule__TargetTypeRule__NameAssignment_2 )
            {
             before(grammarAccess.getTargetTypeRuleAccess().getNameAssignment_2()); 
            // InternalDsl.g:2109:2: ( rule__TargetTypeRule__NameAssignment_2 )
            // InternalDsl.g:2109:3: rule__TargetTypeRule__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__TargetTypeRule__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getTargetTypeRuleAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TargetTypeRule__Group__2__Impl"


    // $ANTLR start "rule__CommandNameRule__Group__0"
    // InternalDsl.g:2118:1: rule__CommandNameRule__Group__0 : rule__CommandNameRule__Group__0__Impl rule__CommandNameRule__Group__1 ;
    public final void rule__CommandNameRule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2122:1: ( rule__CommandNameRule__Group__0__Impl rule__CommandNameRule__Group__1 )
            // InternalDsl.g:2123:2: rule__CommandNameRule__Group__0__Impl rule__CommandNameRule__Group__1
            {
            pushFollow(FOLLOW_18);
            rule__CommandNameRule__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CommandNameRule__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandNameRule__Group__0"


    // $ANTLR start "rule__CommandNameRule__Group__0__Impl"
    // InternalDsl.g:2130:1: rule__CommandNameRule__Group__0__Impl : ( () ) ;
    public final void rule__CommandNameRule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2134:1: ( ( () ) )
            // InternalDsl.g:2135:1: ( () )
            {
            // InternalDsl.g:2135:1: ( () )
            // InternalDsl.g:2136:2: ()
            {
             before(grammarAccess.getCommandNameRuleAccess().getCommandNameRuleAction_0()); 
            // InternalDsl.g:2137:2: ()
            // InternalDsl.g:2137:3: 
            {
            }

             after(grammarAccess.getCommandNameRuleAccess().getCommandNameRuleAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandNameRule__Group__0__Impl"


    // $ANTLR start "rule__CommandNameRule__Group__1"
    // InternalDsl.g:2145:1: rule__CommandNameRule__Group__1 : rule__CommandNameRule__Group__1__Impl rule__CommandNameRule__Group__2 ;
    public final void rule__CommandNameRule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2149:1: ( rule__CommandNameRule__Group__1__Impl rule__CommandNameRule__Group__2 )
            // InternalDsl.g:2150:2: rule__CommandNameRule__Group__1__Impl rule__CommandNameRule__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__CommandNameRule__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CommandNameRule__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandNameRule__Group__1"


    // $ANTLR start "rule__CommandNameRule__Group__1__Impl"
    // InternalDsl.g:2157:1: rule__CommandNameRule__Group__1__Impl : ( 'CommandName' ) ;
    public final void rule__CommandNameRule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2161:1: ( ( 'CommandName' ) )
            // InternalDsl.g:2162:1: ( 'CommandName' )
            {
            // InternalDsl.g:2162:1: ( 'CommandName' )
            // InternalDsl.g:2163:2: 'CommandName'
            {
             before(grammarAccess.getCommandNameRuleAccess().getCommandNameKeyword_1()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getCommandNameRuleAccess().getCommandNameKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandNameRule__Group__1__Impl"


    // $ANTLR start "rule__CommandNameRule__Group__2"
    // InternalDsl.g:2172:1: rule__CommandNameRule__Group__2 : rule__CommandNameRule__Group__2__Impl ;
    public final void rule__CommandNameRule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2176:1: ( rule__CommandNameRule__Group__2__Impl )
            // InternalDsl.g:2177:2: rule__CommandNameRule__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CommandNameRule__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandNameRule__Group__2"


    // $ANTLR start "rule__CommandNameRule__Group__2__Impl"
    // InternalDsl.g:2183:1: rule__CommandNameRule__Group__2__Impl : ( ( rule__CommandNameRule__NameAssignment_2 ) ) ;
    public final void rule__CommandNameRule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2187:1: ( ( ( rule__CommandNameRule__NameAssignment_2 ) ) )
            // InternalDsl.g:2188:1: ( ( rule__CommandNameRule__NameAssignment_2 ) )
            {
            // InternalDsl.g:2188:1: ( ( rule__CommandNameRule__NameAssignment_2 ) )
            // InternalDsl.g:2189:2: ( rule__CommandNameRule__NameAssignment_2 )
            {
             before(grammarAccess.getCommandNameRuleAccess().getNameAssignment_2()); 
            // InternalDsl.g:2190:2: ( rule__CommandNameRule__NameAssignment_2 )
            // InternalDsl.g:2190:3: rule__CommandNameRule__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__CommandNameRule__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getCommandNameRuleAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandNameRule__Group__2__Impl"


    // $ANTLR start "rule__ShapeTypeRule__Group__0"
    // InternalDsl.g:2199:1: rule__ShapeTypeRule__Group__0 : rule__ShapeTypeRule__Group__0__Impl rule__ShapeTypeRule__Group__1 ;
    public final void rule__ShapeTypeRule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2203:1: ( rule__ShapeTypeRule__Group__0__Impl rule__ShapeTypeRule__Group__1 )
            // InternalDsl.g:2204:2: rule__ShapeTypeRule__Group__0__Impl rule__ShapeTypeRule__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__ShapeTypeRule__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ShapeTypeRule__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShapeTypeRule__Group__0"


    // $ANTLR start "rule__ShapeTypeRule__Group__0__Impl"
    // InternalDsl.g:2211:1: rule__ShapeTypeRule__Group__0__Impl : ( () ) ;
    public final void rule__ShapeTypeRule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2215:1: ( ( () ) )
            // InternalDsl.g:2216:1: ( () )
            {
            // InternalDsl.g:2216:1: ( () )
            // InternalDsl.g:2217:2: ()
            {
             before(grammarAccess.getShapeTypeRuleAccess().getShapeTypeRuleAction_0()); 
            // InternalDsl.g:2218:2: ()
            // InternalDsl.g:2218:3: 
            {
            }

             after(grammarAccess.getShapeTypeRuleAccess().getShapeTypeRuleAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShapeTypeRule__Group__0__Impl"


    // $ANTLR start "rule__ShapeTypeRule__Group__1"
    // InternalDsl.g:2226:1: rule__ShapeTypeRule__Group__1 : rule__ShapeTypeRule__Group__1__Impl rule__ShapeTypeRule__Group__2 ;
    public final void rule__ShapeTypeRule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2230:1: ( rule__ShapeTypeRule__Group__1__Impl rule__ShapeTypeRule__Group__2 )
            // InternalDsl.g:2231:2: rule__ShapeTypeRule__Group__1__Impl rule__ShapeTypeRule__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__ShapeTypeRule__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ShapeTypeRule__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShapeTypeRule__Group__1"


    // $ANTLR start "rule__ShapeTypeRule__Group__1__Impl"
    // InternalDsl.g:2238:1: rule__ShapeTypeRule__Group__1__Impl : ( 'ShapeType' ) ;
    public final void rule__ShapeTypeRule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2242:1: ( ( 'ShapeType' ) )
            // InternalDsl.g:2243:1: ( 'ShapeType' )
            {
            // InternalDsl.g:2243:1: ( 'ShapeType' )
            // InternalDsl.g:2244:2: 'ShapeType'
            {
             before(grammarAccess.getShapeTypeRuleAccess().getShapeTypeKeyword_1()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getShapeTypeRuleAccess().getShapeTypeKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShapeTypeRule__Group__1__Impl"


    // $ANTLR start "rule__ShapeTypeRule__Group__2"
    // InternalDsl.g:2253:1: rule__ShapeTypeRule__Group__2 : rule__ShapeTypeRule__Group__2__Impl ;
    public final void rule__ShapeTypeRule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2257:1: ( rule__ShapeTypeRule__Group__2__Impl )
            // InternalDsl.g:2258:2: rule__ShapeTypeRule__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ShapeTypeRule__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShapeTypeRule__Group__2"


    // $ANTLR start "rule__ShapeTypeRule__Group__2__Impl"
    // InternalDsl.g:2264:1: rule__ShapeTypeRule__Group__2__Impl : ( ( rule__ShapeTypeRule__NameAssignment_2 ) ) ;
    public final void rule__ShapeTypeRule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2268:1: ( ( ( rule__ShapeTypeRule__NameAssignment_2 ) ) )
            // InternalDsl.g:2269:1: ( ( rule__ShapeTypeRule__NameAssignment_2 ) )
            {
            // InternalDsl.g:2269:1: ( ( rule__ShapeTypeRule__NameAssignment_2 ) )
            // InternalDsl.g:2270:2: ( rule__ShapeTypeRule__NameAssignment_2 )
            {
             before(grammarAccess.getShapeTypeRuleAccess().getNameAssignment_2()); 
            // InternalDsl.g:2271:2: ( rule__ShapeTypeRule__NameAssignment_2 )
            // InternalDsl.g:2271:3: rule__ShapeTypeRule__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ShapeTypeRule__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getShapeTypeRuleAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShapeTypeRule__Group__2__Impl"


    // $ANTLR start "rule__ParentTypeRule__Group__0"
    // InternalDsl.g:2280:1: rule__ParentTypeRule__Group__0 : rule__ParentTypeRule__Group__0__Impl rule__ParentTypeRule__Group__1 ;
    public final void rule__ParentTypeRule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2284:1: ( rule__ParentTypeRule__Group__0__Impl rule__ParentTypeRule__Group__1 )
            // InternalDsl.g:2285:2: rule__ParentTypeRule__Group__0__Impl rule__ParentTypeRule__Group__1
            {
            pushFollow(FOLLOW_20);
            rule__ParentTypeRule__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParentTypeRule__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParentTypeRule__Group__0"


    // $ANTLR start "rule__ParentTypeRule__Group__0__Impl"
    // InternalDsl.g:2292:1: rule__ParentTypeRule__Group__0__Impl : ( () ) ;
    public final void rule__ParentTypeRule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2296:1: ( ( () ) )
            // InternalDsl.g:2297:1: ( () )
            {
            // InternalDsl.g:2297:1: ( () )
            // InternalDsl.g:2298:2: ()
            {
             before(grammarAccess.getParentTypeRuleAccess().getParentTypeRuleAction_0()); 
            // InternalDsl.g:2299:2: ()
            // InternalDsl.g:2299:3: 
            {
            }

             after(grammarAccess.getParentTypeRuleAccess().getParentTypeRuleAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParentTypeRule__Group__0__Impl"


    // $ANTLR start "rule__ParentTypeRule__Group__1"
    // InternalDsl.g:2307:1: rule__ParentTypeRule__Group__1 : rule__ParentTypeRule__Group__1__Impl rule__ParentTypeRule__Group__2 ;
    public final void rule__ParentTypeRule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2311:1: ( rule__ParentTypeRule__Group__1__Impl rule__ParentTypeRule__Group__2 )
            // InternalDsl.g:2312:2: rule__ParentTypeRule__Group__1__Impl rule__ParentTypeRule__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__ParentTypeRule__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParentTypeRule__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParentTypeRule__Group__1"


    // $ANTLR start "rule__ParentTypeRule__Group__1__Impl"
    // InternalDsl.g:2319:1: rule__ParentTypeRule__Group__1__Impl : ( 'ParentType' ) ;
    public final void rule__ParentTypeRule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2323:1: ( ( 'ParentType' ) )
            // InternalDsl.g:2324:1: ( 'ParentType' )
            {
            // InternalDsl.g:2324:1: ( 'ParentType' )
            // InternalDsl.g:2325:2: 'ParentType'
            {
             before(grammarAccess.getParentTypeRuleAccess().getParentTypeKeyword_1()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getParentTypeRuleAccess().getParentTypeKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParentTypeRule__Group__1__Impl"


    // $ANTLR start "rule__ParentTypeRule__Group__2"
    // InternalDsl.g:2334:1: rule__ParentTypeRule__Group__2 : rule__ParentTypeRule__Group__2__Impl ;
    public final void rule__ParentTypeRule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2338:1: ( rule__ParentTypeRule__Group__2__Impl )
            // InternalDsl.g:2339:2: rule__ParentTypeRule__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ParentTypeRule__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParentTypeRule__Group__2"


    // $ANTLR start "rule__ParentTypeRule__Group__2__Impl"
    // InternalDsl.g:2345:1: rule__ParentTypeRule__Group__2__Impl : ( ( rule__ParentTypeRule__NameAssignment_2 ) ) ;
    public final void rule__ParentTypeRule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2349:1: ( ( ( rule__ParentTypeRule__NameAssignment_2 ) ) )
            // InternalDsl.g:2350:1: ( ( rule__ParentTypeRule__NameAssignment_2 ) )
            {
            // InternalDsl.g:2350:1: ( ( rule__ParentTypeRule__NameAssignment_2 ) )
            // InternalDsl.g:2351:2: ( rule__ParentTypeRule__NameAssignment_2 )
            {
             before(grammarAccess.getParentTypeRuleAccess().getNameAssignment_2()); 
            // InternalDsl.g:2352:2: ( rule__ParentTypeRule__NameAssignment_2 )
            // InternalDsl.g:2352:3: rule__ParentTypeRule__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ParentTypeRule__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getParentTypeRuleAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParentTypeRule__Group__2__Impl"


    // $ANTLR start "rule__StepInRule__Group__0"
    // InternalDsl.g:2361:1: rule__StepInRule__Group__0 : rule__StepInRule__Group__0__Impl rule__StepInRule__Group__1 ;
    public final void rule__StepInRule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2365:1: ( rule__StepInRule__Group__0__Impl rule__StepInRule__Group__1 )
            // InternalDsl.g:2366:2: rule__StepInRule__Group__0__Impl rule__StepInRule__Group__1
            {
            pushFollow(FOLLOW_21);
            rule__StepInRule__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StepInRule__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StepInRule__Group__0"


    // $ANTLR start "rule__StepInRule__Group__0__Impl"
    // InternalDsl.g:2373:1: rule__StepInRule__Group__0__Impl : ( () ) ;
    public final void rule__StepInRule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2377:1: ( ( () ) )
            // InternalDsl.g:2378:1: ( () )
            {
            // InternalDsl.g:2378:1: ( () )
            // InternalDsl.g:2379:2: ()
            {
             before(grammarAccess.getStepInRuleAccess().getStepInRuleAction_0()); 
            // InternalDsl.g:2380:2: ()
            // InternalDsl.g:2380:3: 
            {
            }

             after(grammarAccess.getStepInRuleAccess().getStepInRuleAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StepInRule__Group__0__Impl"


    // $ANTLR start "rule__StepInRule__Group__1"
    // InternalDsl.g:2388:1: rule__StepInRule__Group__1 : rule__StepInRule__Group__1__Impl ;
    public final void rule__StepInRule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2392:1: ( rule__StepInRule__Group__1__Impl )
            // InternalDsl.g:2393:2: rule__StepInRule__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StepInRule__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StepInRule__Group__1"


    // $ANTLR start "rule__StepInRule__Group__1__Impl"
    // InternalDsl.g:2399:1: rule__StepInRule__Group__1__Impl : ( 'StepIn' ) ;
    public final void rule__StepInRule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2403:1: ( ( 'StepIn' ) )
            // InternalDsl.g:2404:1: ( 'StepIn' )
            {
            // InternalDsl.g:2404:1: ( 'StepIn' )
            // InternalDsl.g:2405:2: 'StepIn'
            {
             before(grammarAccess.getStepInRuleAccess().getStepInKeyword_1()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getStepInRuleAccess().getStepInKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StepInRule__Group__1__Impl"


    // $ANTLR start "rule__TrueRule__Group__0"
    // InternalDsl.g:2415:1: rule__TrueRule__Group__0 : rule__TrueRule__Group__0__Impl rule__TrueRule__Group__1 ;
    public final void rule__TrueRule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2419:1: ( rule__TrueRule__Group__0__Impl rule__TrueRule__Group__1 )
            // InternalDsl.g:2420:2: rule__TrueRule__Group__0__Impl rule__TrueRule__Group__1
            {
            pushFollow(FOLLOW_22);
            rule__TrueRule__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TrueRule__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrueRule__Group__0"


    // $ANTLR start "rule__TrueRule__Group__0__Impl"
    // InternalDsl.g:2427:1: rule__TrueRule__Group__0__Impl : ( () ) ;
    public final void rule__TrueRule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2431:1: ( ( () ) )
            // InternalDsl.g:2432:1: ( () )
            {
            // InternalDsl.g:2432:1: ( () )
            // InternalDsl.g:2433:2: ()
            {
             before(grammarAccess.getTrueRuleAccess().getTrueRuleAction_0()); 
            // InternalDsl.g:2434:2: ()
            // InternalDsl.g:2434:3: 
            {
            }

             after(grammarAccess.getTrueRuleAccess().getTrueRuleAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrueRule__Group__0__Impl"


    // $ANTLR start "rule__TrueRule__Group__1"
    // InternalDsl.g:2442:1: rule__TrueRule__Group__1 : rule__TrueRule__Group__1__Impl ;
    public final void rule__TrueRule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2446:1: ( rule__TrueRule__Group__1__Impl )
            // InternalDsl.g:2447:2: rule__TrueRule__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TrueRule__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrueRule__Group__1"


    // $ANTLR start "rule__TrueRule__Group__1__Impl"
    // InternalDsl.g:2453:1: rule__TrueRule__Group__1__Impl : ( 'true' ) ;
    public final void rule__TrueRule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2457:1: ( ( 'true' ) )
            // InternalDsl.g:2458:1: ( 'true' )
            {
            // InternalDsl.g:2458:1: ( 'true' )
            // InternalDsl.g:2459:2: 'true'
            {
             before(grammarAccess.getTrueRuleAccess().getTrueKeyword_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getTrueRuleAccess().getTrueKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrueRule__Group__1__Impl"


    // $ANTLR start "rule__FalseRule__Group__0"
    // InternalDsl.g:2469:1: rule__FalseRule__Group__0 : rule__FalseRule__Group__0__Impl rule__FalseRule__Group__1 ;
    public final void rule__FalseRule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2473:1: ( rule__FalseRule__Group__0__Impl rule__FalseRule__Group__1 )
            // InternalDsl.g:2474:2: rule__FalseRule__Group__0__Impl rule__FalseRule__Group__1
            {
            pushFollow(FOLLOW_23);
            rule__FalseRule__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FalseRule__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FalseRule__Group__0"


    // $ANTLR start "rule__FalseRule__Group__0__Impl"
    // InternalDsl.g:2481:1: rule__FalseRule__Group__0__Impl : ( () ) ;
    public final void rule__FalseRule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2485:1: ( ( () ) )
            // InternalDsl.g:2486:1: ( () )
            {
            // InternalDsl.g:2486:1: ( () )
            // InternalDsl.g:2487:2: ()
            {
             before(grammarAccess.getFalseRuleAccess().getFalseRuleAction_0()); 
            // InternalDsl.g:2488:2: ()
            // InternalDsl.g:2488:3: 
            {
            }

             after(grammarAccess.getFalseRuleAccess().getFalseRuleAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FalseRule__Group__0__Impl"


    // $ANTLR start "rule__FalseRule__Group__1"
    // InternalDsl.g:2496:1: rule__FalseRule__Group__1 : rule__FalseRule__Group__1__Impl ;
    public final void rule__FalseRule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2500:1: ( rule__FalseRule__Group__1__Impl )
            // InternalDsl.g:2501:2: rule__FalseRule__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FalseRule__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FalseRule__Group__1"


    // $ANTLR start "rule__FalseRule__Group__1__Impl"
    // InternalDsl.g:2507:1: rule__FalseRule__Group__1__Impl : ( 'false' ) ;
    public final void rule__FalseRule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2511:1: ( ( 'false' ) )
            // InternalDsl.g:2512:1: ( 'false' )
            {
            // InternalDsl.g:2512:1: ( 'false' )
            // InternalDsl.g:2513:2: 'false'
            {
             before(grammarAccess.getFalseRuleAccess().getFalseKeyword_1()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getFalseRuleAccess().getFalseKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FalseRule__Group__1__Impl"


    // $ANTLR start "rule__ShapeNameRule__Group__0"
    // InternalDsl.g:2523:1: rule__ShapeNameRule__Group__0 : rule__ShapeNameRule__Group__0__Impl rule__ShapeNameRule__Group__1 ;
    public final void rule__ShapeNameRule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2527:1: ( rule__ShapeNameRule__Group__0__Impl rule__ShapeNameRule__Group__1 )
            // InternalDsl.g:2528:2: rule__ShapeNameRule__Group__0__Impl rule__ShapeNameRule__Group__1
            {
            pushFollow(FOLLOW_24);
            rule__ShapeNameRule__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ShapeNameRule__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShapeNameRule__Group__0"


    // $ANTLR start "rule__ShapeNameRule__Group__0__Impl"
    // InternalDsl.g:2535:1: rule__ShapeNameRule__Group__0__Impl : ( () ) ;
    public final void rule__ShapeNameRule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2539:1: ( ( () ) )
            // InternalDsl.g:2540:1: ( () )
            {
            // InternalDsl.g:2540:1: ( () )
            // InternalDsl.g:2541:2: ()
            {
             before(grammarAccess.getShapeNameRuleAccess().getShapeNameRuleAction_0()); 
            // InternalDsl.g:2542:2: ()
            // InternalDsl.g:2542:3: 
            {
            }

             after(grammarAccess.getShapeNameRuleAccess().getShapeNameRuleAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShapeNameRule__Group__0__Impl"


    // $ANTLR start "rule__ShapeNameRule__Group__1"
    // InternalDsl.g:2550:1: rule__ShapeNameRule__Group__1 : rule__ShapeNameRule__Group__1__Impl rule__ShapeNameRule__Group__2 ;
    public final void rule__ShapeNameRule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2554:1: ( rule__ShapeNameRule__Group__1__Impl rule__ShapeNameRule__Group__2 )
            // InternalDsl.g:2555:2: rule__ShapeNameRule__Group__1__Impl rule__ShapeNameRule__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__ShapeNameRule__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ShapeNameRule__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShapeNameRule__Group__1"


    // $ANTLR start "rule__ShapeNameRule__Group__1__Impl"
    // InternalDsl.g:2562:1: rule__ShapeNameRule__Group__1__Impl : ( 'ShapeName' ) ;
    public final void rule__ShapeNameRule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2566:1: ( ( 'ShapeName' ) )
            // InternalDsl.g:2567:1: ( 'ShapeName' )
            {
            // InternalDsl.g:2567:1: ( 'ShapeName' )
            // InternalDsl.g:2568:2: 'ShapeName'
            {
             before(grammarAccess.getShapeNameRuleAccess().getShapeNameKeyword_1()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getShapeNameRuleAccess().getShapeNameKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShapeNameRule__Group__1__Impl"


    // $ANTLR start "rule__ShapeNameRule__Group__2"
    // InternalDsl.g:2577:1: rule__ShapeNameRule__Group__2 : rule__ShapeNameRule__Group__2__Impl ;
    public final void rule__ShapeNameRule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2581:1: ( rule__ShapeNameRule__Group__2__Impl )
            // InternalDsl.g:2582:2: rule__ShapeNameRule__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ShapeNameRule__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShapeNameRule__Group__2"


    // $ANTLR start "rule__ShapeNameRule__Group__2__Impl"
    // InternalDsl.g:2588:1: rule__ShapeNameRule__Group__2__Impl : ( ( rule__ShapeNameRule__NameAssignment_2 ) ) ;
    public final void rule__ShapeNameRule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2592:1: ( ( ( rule__ShapeNameRule__NameAssignment_2 ) ) )
            // InternalDsl.g:2593:1: ( ( rule__ShapeNameRule__NameAssignment_2 ) )
            {
            // InternalDsl.g:2593:1: ( ( rule__ShapeNameRule__NameAssignment_2 ) )
            // InternalDsl.g:2594:2: ( rule__ShapeNameRule__NameAssignment_2 )
            {
             before(grammarAccess.getShapeNameRuleAccess().getNameAssignment_2()); 
            // InternalDsl.g:2595:2: ( rule__ShapeNameRule__NameAssignment_2 )
            // InternalDsl.g:2595:3: rule__ShapeNameRule__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ShapeNameRule__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getShapeNameRuleAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShapeNameRule__Group__2__Impl"


    // $ANTLR start "rule__ImplicationMapping__Group__0"
    // InternalDsl.g:2604:1: rule__ImplicationMapping__Group__0 : rule__ImplicationMapping__Group__0__Impl rule__ImplicationMapping__Group__1 ;
    public final void rule__ImplicationMapping__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2608:1: ( rule__ImplicationMapping__Group__0__Impl rule__ImplicationMapping__Group__1 )
            // InternalDsl.g:2609:2: rule__ImplicationMapping__Group__0__Impl rule__ImplicationMapping__Group__1
            {
            pushFollow(FOLLOW_25);
            rule__ImplicationMapping__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ImplicationMapping__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImplicationMapping__Group__0"


    // $ANTLR start "rule__ImplicationMapping__Group__0__Impl"
    // InternalDsl.g:2616:1: rule__ImplicationMapping__Group__0__Impl : ( ruleOrMapping ) ;
    public final void rule__ImplicationMapping__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2620:1: ( ( ruleOrMapping ) )
            // InternalDsl.g:2621:1: ( ruleOrMapping )
            {
            // InternalDsl.g:2621:1: ( ruleOrMapping )
            // InternalDsl.g:2622:2: ruleOrMapping
            {
             before(grammarAccess.getImplicationMappingAccess().getOrMappingParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleOrMapping();

            state._fsp--;

             after(grammarAccess.getImplicationMappingAccess().getOrMappingParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImplicationMapping__Group__0__Impl"


    // $ANTLR start "rule__ImplicationMapping__Group__1"
    // InternalDsl.g:2631:1: rule__ImplicationMapping__Group__1 : rule__ImplicationMapping__Group__1__Impl ;
    public final void rule__ImplicationMapping__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2635:1: ( rule__ImplicationMapping__Group__1__Impl )
            // InternalDsl.g:2636:2: rule__ImplicationMapping__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ImplicationMapping__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImplicationMapping__Group__1"


    // $ANTLR start "rule__ImplicationMapping__Group__1__Impl"
    // InternalDsl.g:2642:1: rule__ImplicationMapping__Group__1__Impl : ( ( rule__ImplicationMapping__Group_1__0 )? ) ;
    public final void rule__ImplicationMapping__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2646:1: ( ( ( rule__ImplicationMapping__Group_1__0 )? ) )
            // InternalDsl.g:2647:1: ( ( rule__ImplicationMapping__Group_1__0 )? )
            {
            // InternalDsl.g:2647:1: ( ( rule__ImplicationMapping__Group_1__0 )? )
            // InternalDsl.g:2648:2: ( rule__ImplicationMapping__Group_1__0 )?
            {
             before(grammarAccess.getImplicationMappingAccess().getGroup_1()); 
            // InternalDsl.g:2649:2: ( rule__ImplicationMapping__Group_1__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==26) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalDsl.g:2649:3: rule__ImplicationMapping__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ImplicationMapping__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getImplicationMappingAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImplicationMapping__Group__1__Impl"


    // $ANTLR start "rule__ImplicationMapping__Group_1__0"
    // InternalDsl.g:2658:1: rule__ImplicationMapping__Group_1__0 : rule__ImplicationMapping__Group_1__0__Impl rule__ImplicationMapping__Group_1__1 ;
    public final void rule__ImplicationMapping__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2662:1: ( rule__ImplicationMapping__Group_1__0__Impl rule__ImplicationMapping__Group_1__1 )
            // InternalDsl.g:2663:2: rule__ImplicationMapping__Group_1__0__Impl rule__ImplicationMapping__Group_1__1
            {
            pushFollow(FOLLOW_25);
            rule__ImplicationMapping__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ImplicationMapping__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImplicationMapping__Group_1__0"


    // $ANTLR start "rule__ImplicationMapping__Group_1__0__Impl"
    // InternalDsl.g:2670:1: rule__ImplicationMapping__Group_1__0__Impl : ( () ) ;
    public final void rule__ImplicationMapping__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2674:1: ( ( () ) )
            // InternalDsl.g:2675:1: ( () )
            {
            // InternalDsl.g:2675:1: ( () )
            // InternalDsl.g:2676:2: ()
            {
             before(grammarAccess.getImplicationMappingAccess().getImplicationMappingRuleAntecedentAction_1_0()); 
            // InternalDsl.g:2677:2: ()
            // InternalDsl.g:2677:3: 
            {
            }

             after(grammarAccess.getImplicationMappingAccess().getImplicationMappingRuleAntecedentAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImplicationMapping__Group_1__0__Impl"


    // $ANTLR start "rule__ImplicationMapping__Group_1__1"
    // InternalDsl.g:2685:1: rule__ImplicationMapping__Group_1__1 : rule__ImplicationMapping__Group_1__1__Impl rule__ImplicationMapping__Group_1__2 ;
    public final void rule__ImplicationMapping__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2689:1: ( rule__ImplicationMapping__Group_1__1__Impl rule__ImplicationMapping__Group_1__2 )
            // InternalDsl.g:2690:2: rule__ImplicationMapping__Group_1__1__Impl rule__ImplicationMapping__Group_1__2
            {
            pushFollow(FOLLOW_5);
            rule__ImplicationMapping__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ImplicationMapping__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImplicationMapping__Group_1__1"


    // $ANTLR start "rule__ImplicationMapping__Group_1__1__Impl"
    // InternalDsl.g:2697:1: rule__ImplicationMapping__Group_1__1__Impl : ( '=>' ) ;
    public final void rule__ImplicationMapping__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2701:1: ( ( '=>' ) )
            // InternalDsl.g:2702:1: ( '=>' )
            {
            // InternalDsl.g:2702:1: ( '=>' )
            // InternalDsl.g:2703:2: '=>'
            {
             before(grammarAccess.getImplicationMappingAccess().getEqualsSignGreaterThanSignKeyword_1_1()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getImplicationMappingAccess().getEqualsSignGreaterThanSignKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImplicationMapping__Group_1__1__Impl"


    // $ANTLR start "rule__ImplicationMapping__Group_1__2"
    // InternalDsl.g:2712:1: rule__ImplicationMapping__Group_1__2 : rule__ImplicationMapping__Group_1__2__Impl ;
    public final void rule__ImplicationMapping__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2716:1: ( rule__ImplicationMapping__Group_1__2__Impl )
            // InternalDsl.g:2717:2: rule__ImplicationMapping__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ImplicationMapping__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImplicationMapping__Group_1__2"


    // $ANTLR start "rule__ImplicationMapping__Group_1__2__Impl"
    // InternalDsl.g:2723:1: rule__ImplicationMapping__Group_1__2__Impl : ( ( rule__ImplicationMapping__ConsequentAssignment_1_2 ) ) ;
    public final void rule__ImplicationMapping__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2727:1: ( ( ( rule__ImplicationMapping__ConsequentAssignment_1_2 ) ) )
            // InternalDsl.g:2728:1: ( ( rule__ImplicationMapping__ConsequentAssignment_1_2 ) )
            {
            // InternalDsl.g:2728:1: ( ( rule__ImplicationMapping__ConsequentAssignment_1_2 ) )
            // InternalDsl.g:2729:2: ( rule__ImplicationMapping__ConsequentAssignment_1_2 )
            {
             before(grammarAccess.getImplicationMappingAccess().getConsequentAssignment_1_2()); 
            // InternalDsl.g:2730:2: ( rule__ImplicationMapping__ConsequentAssignment_1_2 )
            // InternalDsl.g:2730:3: rule__ImplicationMapping__ConsequentAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__ImplicationMapping__ConsequentAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getImplicationMappingAccess().getConsequentAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImplicationMapping__Group_1__2__Impl"


    // $ANTLR start "rule__OrMapping__Group__0"
    // InternalDsl.g:2739:1: rule__OrMapping__Group__0 : rule__OrMapping__Group__0__Impl rule__OrMapping__Group__1 ;
    public final void rule__OrMapping__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2743:1: ( rule__OrMapping__Group__0__Impl rule__OrMapping__Group__1 )
            // InternalDsl.g:2744:2: rule__OrMapping__Group__0__Impl rule__OrMapping__Group__1
            {
            pushFollow(FOLLOW_26);
            rule__OrMapping__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OrMapping__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrMapping__Group__0"


    // $ANTLR start "rule__OrMapping__Group__0__Impl"
    // InternalDsl.g:2751:1: rule__OrMapping__Group__0__Impl : ( ruleAndMapping ) ;
    public final void rule__OrMapping__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2755:1: ( ( ruleAndMapping ) )
            // InternalDsl.g:2756:1: ( ruleAndMapping )
            {
            // InternalDsl.g:2756:1: ( ruleAndMapping )
            // InternalDsl.g:2757:2: ruleAndMapping
            {
             before(grammarAccess.getOrMappingAccess().getAndMappingParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleAndMapping();

            state._fsp--;

             after(grammarAccess.getOrMappingAccess().getAndMappingParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrMapping__Group__0__Impl"


    // $ANTLR start "rule__OrMapping__Group__1"
    // InternalDsl.g:2766:1: rule__OrMapping__Group__1 : rule__OrMapping__Group__1__Impl ;
    public final void rule__OrMapping__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2770:1: ( rule__OrMapping__Group__1__Impl )
            // InternalDsl.g:2771:2: rule__OrMapping__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OrMapping__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrMapping__Group__1"


    // $ANTLR start "rule__OrMapping__Group__1__Impl"
    // InternalDsl.g:2777:1: rule__OrMapping__Group__1__Impl : ( ( rule__OrMapping__Group_1__0 )* ) ;
    public final void rule__OrMapping__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2781:1: ( ( ( rule__OrMapping__Group_1__0 )* ) )
            // InternalDsl.g:2782:1: ( ( rule__OrMapping__Group_1__0 )* )
            {
            // InternalDsl.g:2782:1: ( ( rule__OrMapping__Group_1__0 )* )
            // InternalDsl.g:2783:2: ( rule__OrMapping__Group_1__0 )*
            {
             before(grammarAccess.getOrMappingAccess().getGroup_1()); 
            // InternalDsl.g:2784:2: ( rule__OrMapping__Group_1__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==27) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalDsl.g:2784:3: rule__OrMapping__Group_1__0
            	    {
            	    pushFollow(FOLLOW_27);
            	    rule__OrMapping__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getOrMappingAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrMapping__Group__1__Impl"


    // $ANTLR start "rule__OrMapping__Group_1__0"
    // InternalDsl.g:2793:1: rule__OrMapping__Group_1__0 : rule__OrMapping__Group_1__0__Impl rule__OrMapping__Group_1__1 ;
    public final void rule__OrMapping__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2797:1: ( rule__OrMapping__Group_1__0__Impl rule__OrMapping__Group_1__1 )
            // InternalDsl.g:2798:2: rule__OrMapping__Group_1__0__Impl rule__OrMapping__Group_1__1
            {
            pushFollow(FOLLOW_26);
            rule__OrMapping__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OrMapping__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrMapping__Group_1__0"


    // $ANTLR start "rule__OrMapping__Group_1__0__Impl"
    // InternalDsl.g:2805:1: rule__OrMapping__Group_1__0__Impl : ( () ) ;
    public final void rule__OrMapping__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2809:1: ( ( () ) )
            // InternalDsl.g:2810:1: ( () )
            {
            // InternalDsl.g:2810:1: ( () )
            // InternalDsl.g:2811:2: ()
            {
             before(grammarAccess.getOrMappingAccess().getOrMappingRuleRulesAction_1_0()); 
            // InternalDsl.g:2812:2: ()
            // InternalDsl.g:2812:3: 
            {
            }

             after(grammarAccess.getOrMappingAccess().getOrMappingRuleRulesAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrMapping__Group_1__0__Impl"


    // $ANTLR start "rule__OrMapping__Group_1__1"
    // InternalDsl.g:2820:1: rule__OrMapping__Group_1__1 : rule__OrMapping__Group_1__1__Impl rule__OrMapping__Group_1__2 ;
    public final void rule__OrMapping__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2824:1: ( rule__OrMapping__Group_1__1__Impl rule__OrMapping__Group_1__2 )
            // InternalDsl.g:2825:2: rule__OrMapping__Group_1__1__Impl rule__OrMapping__Group_1__2
            {
            pushFollow(FOLLOW_5);
            rule__OrMapping__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OrMapping__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrMapping__Group_1__1"


    // $ANTLR start "rule__OrMapping__Group_1__1__Impl"
    // InternalDsl.g:2832:1: rule__OrMapping__Group_1__1__Impl : ( '||' ) ;
    public final void rule__OrMapping__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2836:1: ( ( '||' ) )
            // InternalDsl.g:2837:1: ( '||' )
            {
            // InternalDsl.g:2837:1: ( '||' )
            // InternalDsl.g:2838:2: '||'
            {
             before(grammarAccess.getOrMappingAccess().getVerticalLineVerticalLineKeyword_1_1()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getOrMappingAccess().getVerticalLineVerticalLineKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrMapping__Group_1__1__Impl"


    // $ANTLR start "rule__OrMapping__Group_1__2"
    // InternalDsl.g:2847:1: rule__OrMapping__Group_1__2 : rule__OrMapping__Group_1__2__Impl ;
    public final void rule__OrMapping__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2851:1: ( rule__OrMapping__Group_1__2__Impl )
            // InternalDsl.g:2852:2: rule__OrMapping__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OrMapping__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrMapping__Group_1__2"


    // $ANTLR start "rule__OrMapping__Group_1__2__Impl"
    // InternalDsl.g:2858:1: rule__OrMapping__Group_1__2__Impl : ( ( rule__OrMapping__RulesAssignment_1_2 ) ) ;
    public final void rule__OrMapping__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2862:1: ( ( ( rule__OrMapping__RulesAssignment_1_2 ) ) )
            // InternalDsl.g:2863:1: ( ( rule__OrMapping__RulesAssignment_1_2 ) )
            {
            // InternalDsl.g:2863:1: ( ( rule__OrMapping__RulesAssignment_1_2 ) )
            // InternalDsl.g:2864:2: ( rule__OrMapping__RulesAssignment_1_2 )
            {
             before(grammarAccess.getOrMappingAccess().getRulesAssignment_1_2()); 
            // InternalDsl.g:2865:2: ( rule__OrMapping__RulesAssignment_1_2 )
            // InternalDsl.g:2865:3: rule__OrMapping__RulesAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__OrMapping__RulesAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getOrMappingAccess().getRulesAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrMapping__Group_1__2__Impl"


    // $ANTLR start "rule__AndMapping__Group__0"
    // InternalDsl.g:2874:1: rule__AndMapping__Group__0 : rule__AndMapping__Group__0__Impl rule__AndMapping__Group__1 ;
    public final void rule__AndMapping__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2878:1: ( rule__AndMapping__Group__0__Impl rule__AndMapping__Group__1 )
            // InternalDsl.g:2879:2: rule__AndMapping__Group__0__Impl rule__AndMapping__Group__1
            {
            pushFollow(FOLLOW_28);
            rule__AndMapping__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AndMapping__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndMapping__Group__0"


    // $ANTLR start "rule__AndMapping__Group__0__Impl"
    // InternalDsl.g:2886:1: rule__AndMapping__Group__0__Impl : ( ruleNotMappingExpression ) ;
    public final void rule__AndMapping__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2890:1: ( ( ruleNotMappingExpression ) )
            // InternalDsl.g:2891:1: ( ruleNotMappingExpression )
            {
            // InternalDsl.g:2891:1: ( ruleNotMappingExpression )
            // InternalDsl.g:2892:2: ruleNotMappingExpression
            {
             before(grammarAccess.getAndMappingAccess().getNotMappingExpressionParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleNotMappingExpression();

            state._fsp--;

             after(grammarAccess.getAndMappingAccess().getNotMappingExpressionParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndMapping__Group__0__Impl"


    // $ANTLR start "rule__AndMapping__Group__1"
    // InternalDsl.g:2901:1: rule__AndMapping__Group__1 : rule__AndMapping__Group__1__Impl ;
    public final void rule__AndMapping__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2905:1: ( rule__AndMapping__Group__1__Impl )
            // InternalDsl.g:2906:2: rule__AndMapping__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AndMapping__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndMapping__Group__1"


    // $ANTLR start "rule__AndMapping__Group__1__Impl"
    // InternalDsl.g:2912:1: rule__AndMapping__Group__1__Impl : ( ( rule__AndMapping__Group_1__0 )* ) ;
    public final void rule__AndMapping__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2916:1: ( ( ( rule__AndMapping__Group_1__0 )* ) )
            // InternalDsl.g:2917:1: ( ( rule__AndMapping__Group_1__0 )* )
            {
            // InternalDsl.g:2917:1: ( ( rule__AndMapping__Group_1__0 )* )
            // InternalDsl.g:2918:2: ( rule__AndMapping__Group_1__0 )*
            {
             before(grammarAccess.getAndMappingAccess().getGroup_1()); 
            // InternalDsl.g:2919:2: ( rule__AndMapping__Group_1__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==28) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalDsl.g:2919:3: rule__AndMapping__Group_1__0
            	    {
            	    pushFollow(FOLLOW_29);
            	    rule__AndMapping__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getAndMappingAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndMapping__Group__1__Impl"


    // $ANTLR start "rule__AndMapping__Group_1__0"
    // InternalDsl.g:2928:1: rule__AndMapping__Group_1__0 : rule__AndMapping__Group_1__0__Impl rule__AndMapping__Group_1__1 ;
    public final void rule__AndMapping__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2932:1: ( rule__AndMapping__Group_1__0__Impl rule__AndMapping__Group_1__1 )
            // InternalDsl.g:2933:2: rule__AndMapping__Group_1__0__Impl rule__AndMapping__Group_1__1
            {
            pushFollow(FOLLOW_28);
            rule__AndMapping__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AndMapping__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndMapping__Group_1__0"


    // $ANTLR start "rule__AndMapping__Group_1__0__Impl"
    // InternalDsl.g:2940:1: rule__AndMapping__Group_1__0__Impl : ( () ) ;
    public final void rule__AndMapping__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2944:1: ( ( () ) )
            // InternalDsl.g:2945:1: ( () )
            {
            // InternalDsl.g:2945:1: ( () )
            // InternalDsl.g:2946:2: ()
            {
             before(grammarAccess.getAndMappingAccess().getAndMappingRuleRulesAction_1_0()); 
            // InternalDsl.g:2947:2: ()
            // InternalDsl.g:2947:3: 
            {
            }

             after(grammarAccess.getAndMappingAccess().getAndMappingRuleRulesAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndMapping__Group_1__0__Impl"


    // $ANTLR start "rule__AndMapping__Group_1__1"
    // InternalDsl.g:2955:1: rule__AndMapping__Group_1__1 : rule__AndMapping__Group_1__1__Impl rule__AndMapping__Group_1__2 ;
    public final void rule__AndMapping__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2959:1: ( rule__AndMapping__Group_1__1__Impl rule__AndMapping__Group_1__2 )
            // InternalDsl.g:2960:2: rule__AndMapping__Group_1__1__Impl rule__AndMapping__Group_1__2
            {
            pushFollow(FOLLOW_5);
            rule__AndMapping__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AndMapping__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndMapping__Group_1__1"


    // $ANTLR start "rule__AndMapping__Group_1__1__Impl"
    // InternalDsl.g:2967:1: rule__AndMapping__Group_1__1__Impl : ( '&&' ) ;
    public final void rule__AndMapping__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2971:1: ( ( '&&' ) )
            // InternalDsl.g:2972:1: ( '&&' )
            {
            // InternalDsl.g:2972:1: ( '&&' )
            // InternalDsl.g:2973:2: '&&'
            {
             before(grammarAccess.getAndMappingAccess().getAmpersandAmpersandKeyword_1_1()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getAndMappingAccess().getAmpersandAmpersandKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndMapping__Group_1__1__Impl"


    // $ANTLR start "rule__AndMapping__Group_1__2"
    // InternalDsl.g:2982:1: rule__AndMapping__Group_1__2 : rule__AndMapping__Group_1__2__Impl ;
    public final void rule__AndMapping__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2986:1: ( rule__AndMapping__Group_1__2__Impl )
            // InternalDsl.g:2987:2: rule__AndMapping__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AndMapping__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndMapping__Group_1__2"


    // $ANTLR start "rule__AndMapping__Group_1__2__Impl"
    // InternalDsl.g:2993:1: rule__AndMapping__Group_1__2__Impl : ( ( rule__AndMapping__RulesAssignment_1_2 ) ) ;
    public final void rule__AndMapping__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2997:1: ( ( ( rule__AndMapping__RulesAssignment_1_2 ) ) )
            // InternalDsl.g:2998:1: ( ( rule__AndMapping__RulesAssignment_1_2 ) )
            {
            // InternalDsl.g:2998:1: ( ( rule__AndMapping__RulesAssignment_1_2 ) )
            // InternalDsl.g:2999:2: ( rule__AndMapping__RulesAssignment_1_2 )
            {
             before(grammarAccess.getAndMappingAccess().getRulesAssignment_1_2()); 
            // InternalDsl.g:3000:2: ( rule__AndMapping__RulesAssignment_1_2 )
            // InternalDsl.g:3000:3: rule__AndMapping__RulesAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__AndMapping__RulesAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getAndMappingAccess().getRulesAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndMapping__Group_1__2__Impl"


    // $ANTLR start "rule__NotMappingExpression__Group_1__0"
    // InternalDsl.g:3009:1: rule__NotMappingExpression__Group_1__0 : rule__NotMappingExpression__Group_1__0__Impl rule__NotMappingExpression__Group_1__1 ;
    public final void rule__NotMappingExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3013:1: ( rule__NotMappingExpression__Group_1__0__Impl rule__NotMappingExpression__Group_1__1 )
            // InternalDsl.g:3014:2: rule__NotMappingExpression__Group_1__0__Impl rule__NotMappingExpression__Group_1__1
            {
            pushFollow(FOLLOW_30);
            rule__NotMappingExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NotMappingExpression__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NotMappingExpression__Group_1__0"


    // $ANTLR start "rule__NotMappingExpression__Group_1__0__Impl"
    // InternalDsl.g:3021:1: rule__NotMappingExpression__Group_1__0__Impl : ( '!' ) ;
    public final void rule__NotMappingExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3025:1: ( ( '!' ) )
            // InternalDsl.g:3026:1: ( '!' )
            {
            // InternalDsl.g:3026:1: ( '!' )
            // InternalDsl.g:3027:2: '!'
            {
             before(grammarAccess.getNotMappingExpressionAccess().getExclamationMarkKeyword_1_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getNotMappingExpressionAccess().getExclamationMarkKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NotMappingExpression__Group_1__0__Impl"


    // $ANTLR start "rule__NotMappingExpression__Group_1__1"
    // InternalDsl.g:3036:1: rule__NotMappingExpression__Group_1__1 : rule__NotMappingExpression__Group_1__1__Impl rule__NotMappingExpression__Group_1__2 ;
    public final void rule__NotMappingExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3040:1: ( rule__NotMappingExpression__Group_1__1__Impl rule__NotMappingExpression__Group_1__2 )
            // InternalDsl.g:3041:2: rule__NotMappingExpression__Group_1__1__Impl rule__NotMappingExpression__Group_1__2
            {
            pushFollow(FOLLOW_30);
            rule__NotMappingExpression__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NotMappingExpression__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NotMappingExpression__Group_1__1"


    // $ANTLR start "rule__NotMappingExpression__Group_1__1__Impl"
    // InternalDsl.g:3048:1: rule__NotMappingExpression__Group_1__1__Impl : ( () ) ;
    public final void rule__NotMappingExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3052:1: ( ( () ) )
            // InternalDsl.g:3053:1: ( () )
            {
            // InternalDsl.g:3053:1: ( () )
            // InternalDsl.g:3054:2: ()
            {
             before(grammarAccess.getNotMappingExpressionAccess().getNotMappingRuleAction_1_1()); 
            // InternalDsl.g:3055:2: ()
            // InternalDsl.g:3055:3: 
            {
            }

             after(grammarAccess.getNotMappingExpressionAccess().getNotMappingRuleAction_1_1()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NotMappingExpression__Group_1__1__Impl"


    // $ANTLR start "rule__NotMappingExpression__Group_1__2"
    // InternalDsl.g:3063:1: rule__NotMappingExpression__Group_1__2 : rule__NotMappingExpression__Group_1__2__Impl ;
    public final void rule__NotMappingExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3067:1: ( rule__NotMappingExpression__Group_1__2__Impl )
            // InternalDsl.g:3068:2: rule__NotMappingExpression__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NotMappingExpression__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NotMappingExpression__Group_1__2"


    // $ANTLR start "rule__NotMappingExpression__Group_1__2__Impl"
    // InternalDsl.g:3074:1: rule__NotMappingExpression__Group_1__2__Impl : ( ( rule__NotMappingExpression__RuleAssignment_1_2 ) ) ;
    public final void rule__NotMappingExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3078:1: ( ( ( rule__NotMappingExpression__RuleAssignment_1_2 ) ) )
            // InternalDsl.g:3079:1: ( ( rule__NotMappingExpression__RuleAssignment_1_2 ) )
            {
            // InternalDsl.g:3079:1: ( ( rule__NotMappingExpression__RuleAssignment_1_2 ) )
            // InternalDsl.g:3080:2: ( rule__NotMappingExpression__RuleAssignment_1_2 )
            {
             before(grammarAccess.getNotMappingExpressionAccess().getRuleAssignment_1_2()); 
            // InternalDsl.g:3081:2: ( rule__NotMappingExpression__RuleAssignment_1_2 )
            // InternalDsl.g:3081:3: rule__NotMappingExpression__RuleAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__NotMappingExpression__RuleAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getNotMappingExpressionAccess().getRuleAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NotMappingExpression__Group_1__2__Impl"


    // $ANTLR start "rule__PrimaryMapping__Group_1__0"
    // InternalDsl.g:3090:1: rule__PrimaryMapping__Group_1__0 : rule__PrimaryMapping__Group_1__0__Impl rule__PrimaryMapping__Group_1__1 ;
    public final void rule__PrimaryMapping__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3094:1: ( rule__PrimaryMapping__Group_1__0__Impl rule__PrimaryMapping__Group_1__1 )
            // InternalDsl.g:3095:2: rule__PrimaryMapping__Group_1__0__Impl rule__PrimaryMapping__Group_1__1
            {
            pushFollow(FOLLOW_5);
            rule__PrimaryMapping__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrimaryMapping__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryMapping__Group_1__0"


    // $ANTLR start "rule__PrimaryMapping__Group_1__0__Impl"
    // InternalDsl.g:3102:1: rule__PrimaryMapping__Group_1__0__Impl : ( '(' ) ;
    public final void rule__PrimaryMapping__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3106:1: ( ( '(' ) )
            // InternalDsl.g:3107:1: ( '(' )
            {
            // InternalDsl.g:3107:1: ( '(' )
            // InternalDsl.g:3108:2: '('
            {
             before(grammarAccess.getPrimaryMappingAccess().getLeftParenthesisKeyword_1_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getPrimaryMappingAccess().getLeftParenthesisKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryMapping__Group_1__0__Impl"


    // $ANTLR start "rule__PrimaryMapping__Group_1__1"
    // InternalDsl.g:3117:1: rule__PrimaryMapping__Group_1__1 : rule__PrimaryMapping__Group_1__1__Impl rule__PrimaryMapping__Group_1__2 ;
    public final void rule__PrimaryMapping__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3121:1: ( rule__PrimaryMapping__Group_1__1__Impl rule__PrimaryMapping__Group_1__2 )
            // InternalDsl.g:3122:2: rule__PrimaryMapping__Group_1__1__Impl rule__PrimaryMapping__Group_1__2
            {
            pushFollow(FOLLOW_31);
            rule__PrimaryMapping__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrimaryMapping__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryMapping__Group_1__1"


    // $ANTLR start "rule__PrimaryMapping__Group_1__1__Impl"
    // InternalDsl.g:3129:1: rule__PrimaryMapping__Group_1__1__Impl : ( ruleMappingExpression ) ;
    public final void rule__PrimaryMapping__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3133:1: ( ( ruleMappingExpression ) )
            // InternalDsl.g:3134:1: ( ruleMappingExpression )
            {
            // InternalDsl.g:3134:1: ( ruleMappingExpression )
            // InternalDsl.g:3135:2: ruleMappingExpression
            {
             before(grammarAccess.getPrimaryMappingAccess().getMappingExpressionParserRuleCall_1_1()); 
            pushFollow(FOLLOW_2);
            ruleMappingExpression();

            state._fsp--;

             after(grammarAccess.getPrimaryMappingAccess().getMappingExpressionParserRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryMapping__Group_1__1__Impl"


    // $ANTLR start "rule__PrimaryMapping__Group_1__2"
    // InternalDsl.g:3144:1: rule__PrimaryMapping__Group_1__2 : rule__PrimaryMapping__Group_1__2__Impl ;
    public final void rule__PrimaryMapping__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3148:1: ( rule__PrimaryMapping__Group_1__2__Impl )
            // InternalDsl.g:3149:2: rule__PrimaryMapping__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PrimaryMapping__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryMapping__Group_1__2"


    // $ANTLR start "rule__PrimaryMapping__Group_1__2__Impl"
    // InternalDsl.g:3155:1: rule__PrimaryMapping__Group_1__2__Impl : ( ')' ) ;
    public final void rule__PrimaryMapping__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3159:1: ( ( ')' ) )
            // InternalDsl.g:3160:1: ( ')' )
            {
            // InternalDsl.g:3160:1: ( ')' )
            // InternalDsl.g:3161:2: ')'
            {
             before(grammarAccess.getPrimaryMappingAccess().getRightParenthesisKeyword_1_2()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getPrimaryMappingAccess().getRightParenthesisKeyword_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryMapping__Group_1__2__Impl"


    // $ANTLR start "rule__ImplicationPolicy__Group__0"
    // InternalDsl.g:3171:1: rule__ImplicationPolicy__Group__0 : rule__ImplicationPolicy__Group__0__Impl rule__ImplicationPolicy__Group__1 ;
    public final void rule__ImplicationPolicy__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3175:1: ( rule__ImplicationPolicy__Group__0__Impl rule__ImplicationPolicy__Group__1 )
            // InternalDsl.g:3176:2: rule__ImplicationPolicy__Group__0__Impl rule__ImplicationPolicy__Group__1
            {
            pushFollow(FOLLOW_25);
            rule__ImplicationPolicy__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ImplicationPolicy__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImplicationPolicy__Group__0"


    // $ANTLR start "rule__ImplicationPolicy__Group__0__Impl"
    // InternalDsl.g:3183:1: rule__ImplicationPolicy__Group__0__Impl : ( ruleOrPolicy ) ;
    public final void rule__ImplicationPolicy__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3187:1: ( ( ruleOrPolicy ) )
            // InternalDsl.g:3188:1: ( ruleOrPolicy )
            {
            // InternalDsl.g:3188:1: ( ruleOrPolicy )
            // InternalDsl.g:3189:2: ruleOrPolicy
            {
             before(grammarAccess.getImplicationPolicyAccess().getOrPolicyParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleOrPolicy();

            state._fsp--;

             after(grammarAccess.getImplicationPolicyAccess().getOrPolicyParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImplicationPolicy__Group__0__Impl"


    // $ANTLR start "rule__ImplicationPolicy__Group__1"
    // InternalDsl.g:3198:1: rule__ImplicationPolicy__Group__1 : rule__ImplicationPolicy__Group__1__Impl ;
    public final void rule__ImplicationPolicy__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3202:1: ( rule__ImplicationPolicy__Group__1__Impl )
            // InternalDsl.g:3203:2: rule__ImplicationPolicy__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ImplicationPolicy__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImplicationPolicy__Group__1"


    // $ANTLR start "rule__ImplicationPolicy__Group__1__Impl"
    // InternalDsl.g:3209:1: rule__ImplicationPolicy__Group__1__Impl : ( ( rule__ImplicationPolicy__Group_1__0 )? ) ;
    public final void rule__ImplicationPolicy__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3213:1: ( ( ( rule__ImplicationPolicy__Group_1__0 )? ) )
            // InternalDsl.g:3214:1: ( ( rule__ImplicationPolicy__Group_1__0 )? )
            {
            // InternalDsl.g:3214:1: ( ( rule__ImplicationPolicy__Group_1__0 )? )
            // InternalDsl.g:3215:2: ( rule__ImplicationPolicy__Group_1__0 )?
            {
             before(grammarAccess.getImplicationPolicyAccess().getGroup_1()); 
            // InternalDsl.g:3216:2: ( rule__ImplicationPolicy__Group_1__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==26) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalDsl.g:3216:3: rule__ImplicationPolicy__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ImplicationPolicy__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getImplicationPolicyAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImplicationPolicy__Group__1__Impl"


    // $ANTLR start "rule__ImplicationPolicy__Group_1__0"
    // InternalDsl.g:3225:1: rule__ImplicationPolicy__Group_1__0 : rule__ImplicationPolicy__Group_1__0__Impl rule__ImplicationPolicy__Group_1__1 ;
    public final void rule__ImplicationPolicy__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3229:1: ( rule__ImplicationPolicy__Group_1__0__Impl rule__ImplicationPolicy__Group_1__1 )
            // InternalDsl.g:3230:2: rule__ImplicationPolicy__Group_1__0__Impl rule__ImplicationPolicy__Group_1__1
            {
            pushFollow(FOLLOW_25);
            rule__ImplicationPolicy__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ImplicationPolicy__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImplicationPolicy__Group_1__0"


    // $ANTLR start "rule__ImplicationPolicy__Group_1__0__Impl"
    // InternalDsl.g:3237:1: rule__ImplicationPolicy__Group_1__0__Impl : ( () ) ;
    public final void rule__ImplicationPolicy__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3241:1: ( ( () ) )
            // InternalDsl.g:3242:1: ( () )
            {
            // InternalDsl.g:3242:1: ( () )
            // InternalDsl.g:3243:2: ()
            {
             before(grammarAccess.getImplicationPolicyAccess().getImplicationRuleAntecedentAction_1_0()); 
            // InternalDsl.g:3244:2: ()
            // InternalDsl.g:3244:3: 
            {
            }

             after(grammarAccess.getImplicationPolicyAccess().getImplicationRuleAntecedentAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImplicationPolicy__Group_1__0__Impl"


    // $ANTLR start "rule__ImplicationPolicy__Group_1__1"
    // InternalDsl.g:3252:1: rule__ImplicationPolicy__Group_1__1 : rule__ImplicationPolicy__Group_1__1__Impl rule__ImplicationPolicy__Group_1__2 ;
    public final void rule__ImplicationPolicy__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3256:1: ( rule__ImplicationPolicy__Group_1__1__Impl rule__ImplicationPolicy__Group_1__2 )
            // InternalDsl.g:3257:2: rule__ImplicationPolicy__Group_1__1__Impl rule__ImplicationPolicy__Group_1__2
            {
            pushFollow(FOLLOW_8);
            rule__ImplicationPolicy__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ImplicationPolicy__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImplicationPolicy__Group_1__1"


    // $ANTLR start "rule__ImplicationPolicy__Group_1__1__Impl"
    // InternalDsl.g:3264:1: rule__ImplicationPolicy__Group_1__1__Impl : ( '=>' ) ;
    public final void rule__ImplicationPolicy__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3268:1: ( ( '=>' ) )
            // InternalDsl.g:3269:1: ( '=>' )
            {
            // InternalDsl.g:3269:1: ( '=>' )
            // InternalDsl.g:3270:2: '=>'
            {
             before(grammarAccess.getImplicationPolicyAccess().getEqualsSignGreaterThanSignKeyword_1_1()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getImplicationPolicyAccess().getEqualsSignGreaterThanSignKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImplicationPolicy__Group_1__1__Impl"


    // $ANTLR start "rule__ImplicationPolicy__Group_1__2"
    // InternalDsl.g:3279:1: rule__ImplicationPolicy__Group_1__2 : rule__ImplicationPolicy__Group_1__2__Impl ;
    public final void rule__ImplicationPolicy__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3283:1: ( rule__ImplicationPolicy__Group_1__2__Impl )
            // InternalDsl.g:3284:2: rule__ImplicationPolicy__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ImplicationPolicy__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImplicationPolicy__Group_1__2"


    // $ANTLR start "rule__ImplicationPolicy__Group_1__2__Impl"
    // InternalDsl.g:3290:1: rule__ImplicationPolicy__Group_1__2__Impl : ( ( rule__ImplicationPolicy__ConsequentAssignment_1_2 ) ) ;
    public final void rule__ImplicationPolicy__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3294:1: ( ( ( rule__ImplicationPolicy__ConsequentAssignment_1_2 ) ) )
            // InternalDsl.g:3295:1: ( ( rule__ImplicationPolicy__ConsequentAssignment_1_2 ) )
            {
            // InternalDsl.g:3295:1: ( ( rule__ImplicationPolicy__ConsequentAssignment_1_2 ) )
            // InternalDsl.g:3296:2: ( rule__ImplicationPolicy__ConsequentAssignment_1_2 )
            {
             before(grammarAccess.getImplicationPolicyAccess().getConsequentAssignment_1_2()); 
            // InternalDsl.g:3297:2: ( rule__ImplicationPolicy__ConsequentAssignment_1_2 )
            // InternalDsl.g:3297:3: rule__ImplicationPolicy__ConsequentAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__ImplicationPolicy__ConsequentAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getImplicationPolicyAccess().getConsequentAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImplicationPolicy__Group_1__2__Impl"


    // $ANTLR start "rule__OrPolicy__Group__0"
    // InternalDsl.g:3306:1: rule__OrPolicy__Group__0 : rule__OrPolicy__Group__0__Impl rule__OrPolicy__Group__1 ;
    public final void rule__OrPolicy__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3310:1: ( rule__OrPolicy__Group__0__Impl rule__OrPolicy__Group__1 )
            // InternalDsl.g:3311:2: rule__OrPolicy__Group__0__Impl rule__OrPolicy__Group__1
            {
            pushFollow(FOLLOW_26);
            rule__OrPolicy__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OrPolicy__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrPolicy__Group__0"


    // $ANTLR start "rule__OrPolicy__Group__0__Impl"
    // InternalDsl.g:3318:1: rule__OrPolicy__Group__0__Impl : ( ruleAndPolicy ) ;
    public final void rule__OrPolicy__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3322:1: ( ( ruleAndPolicy ) )
            // InternalDsl.g:3323:1: ( ruleAndPolicy )
            {
            // InternalDsl.g:3323:1: ( ruleAndPolicy )
            // InternalDsl.g:3324:2: ruleAndPolicy
            {
             before(grammarAccess.getOrPolicyAccess().getAndPolicyParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleAndPolicy();

            state._fsp--;

             after(grammarAccess.getOrPolicyAccess().getAndPolicyParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrPolicy__Group__0__Impl"


    // $ANTLR start "rule__OrPolicy__Group__1"
    // InternalDsl.g:3333:1: rule__OrPolicy__Group__1 : rule__OrPolicy__Group__1__Impl ;
    public final void rule__OrPolicy__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3337:1: ( rule__OrPolicy__Group__1__Impl )
            // InternalDsl.g:3338:2: rule__OrPolicy__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OrPolicy__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrPolicy__Group__1"


    // $ANTLR start "rule__OrPolicy__Group__1__Impl"
    // InternalDsl.g:3344:1: rule__OrPolicy__Group__1__Impl : ( ( rule__OrPolicy__Group_1__0 )* ) ;
    public final void rule__OrPolicy__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3348:1: ( ( ( rule__OrPolicy__Group_1__0 )* ) )
            // InternalDsl.g:3349:1: ( ( rule__OrPolicy__Group_1__0 )* )
            {
            // InternalDsl.g:3349:1: ( ( rule__OrPolicy__Group_1__0 )* )
            // InternalDsl.g:3350:2: ( rule__OrPolicy__Group_1__0 )*
            {
             before(grammarAccess.getOrPolicyAccess().getGroup_1()); 
            // InternalDsl.g:3351:2: ( rule__OrPolicy__Group_1__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==27) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalDsl.g:3351:3: rule__OrPolicy__Group_1__0
            	    {
            	    pushFollow(FOLLOW_27);
            	    rule__OrPolicy__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getOrPolicyAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrPolicy__Group__1__Impl"


    // $ANTLR start "rule__OrPolicy__Group_1__0"
    // InternalDsl.g:3360:1: rule__OrPolicy__Group_1__0 : rule__OrPolicy__Group_1__0__Impl rule__OrPolicy__Group_1__1 ;
    public final void rule__OrPolicy__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3364:1: ( rule__OrPolicy__Group_1__0__Impl rule__OrPolicy__Group_1__1 )
            // InternalDsl.g:3365:2: rule__OrPolicy__Group_1__0__Impl rule__OrPolicy__Group_1__1
            {
            pushFollow(FOLLOW_26);
            rule__OrPolicy__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OrPolicy__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrPolicy__Group_1__0"


    // $ANTLR start "rule__OrPolicy__Group_1__0__Impl"
    // InternalDsl.g:3372:1: rule__OrPolicy__Group_1__0__Impl : ( () ) ;
    public final void rule__OrPolicy__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3376:1: ( ( () ) )
            // InternalDsl.g:3377:1: ( () )
            {
            // InternalDsl.g:3377:1: ( () )
            // InternalDsl.g:3378:2: ()
            {
             before(grammarAccess.getOrPolicyAccess().getOrRuleRulesAction_1_0()); 
            // InternalDsl.g:3379:2: ()
            // InternalDsl.g:3379:3: 
            {
            }

             after(grammarAccess.getOrPolicyAccess().getOrRuleRulesAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrPolicy__Group_1__0__Impl"


    // $ANTLR start "rule__OrPolicy__Group_1__1"
    // InternalDsl.g:3387:1: rule__OrPolicy__Group_1__1 : rule__OrPolicy__Group_1__1__Impl rule__OrPolicy__Group_1__2 ;
    public final void rule__OrPolicy__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3391:1: ( rule__OrPolicy__Group_1__1__Impl rule__OrPolicy__Group_1__2 )
            // InternalDsl.g:3392:2: rule__OrPolicy__Group_1__1__Impl rule__OrPolicy__Group_1__2
            {
            pushFollow(FOLLOW_8);
            rule__OrPolicy__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OrPolicy__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrPolicy__Group_1__1"


    // $ANTLR start "rule__OrPolicy__Group_1__1__Impl"
    // InternalDsl.g:3399:1: rule__OrPolicy__Group_1__1__Impl : ( '||' ) ;
    public final void rule__OrPolicy__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3403:1: ( ( '||' ) )
            // InternalDsl.g:3404:1: ( '||' )
            {
            // InternalDsl.g:3404:1: ( '||' )
            // InternalDsl.g:3405:2: '||'
            {
             before(grammarAccess.getOrPolicyAccess().getVerticalLineVerticalLineKeyword_1_1()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getOrPolicyAccess().getVerticalLineVerticalLineKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrPolicy__Group_1__1__Impl"


    // $ANTLR start "rule__OrPolicy__Group_1__2"
    // InternalDsl.g:3414:1: rule__OrPolicy__Group_1__2 : rule__OrPolicy__Group_1__2__Impl ;
    public final void rule__OrPolicy__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3418:1: ( rule__OrPolicy__Group_1__2__Impl )
            // InternalDsl.g:3419:2: rule__OrPolicy__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OrPolicy__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrPolicy__Group_1__2"


    // $ANTLR start "rule__OrPolicy__Group_1__2__Impl"
    // InternalDsl.g:3425:1: rule__OrPolicy__Group_1__2__Impl : ( ( rule__OrPolicy__RulesAssignment_1_2 ) ) ;
    public final void rule__OrPolicy__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3429:1: ( ( ( rule__OrPolicy__RulesAssignment_1_2 ) ) )
            // InternalDsl.g:3430:1: ( ( rule__OrPolicy__RulesAssignment_1_2 ) )
            {
            // InternalDsl.g:3430:1: ( ( rule__OrPolicy__RulesAssignment_1_2 ) )
            // InternalDsl.g:3431:2: ( rule__OrPolicy__RulesAssignment_1_2 )
            {
             before(grammarAccess.getOrPolicyAccess().getRulesAssignment_1_2()); 
            // InternalDsl.g:3432:2: ( rule__OrPolicy__RulesAssignment_1_2 )
            // InternalDsl.g:3432:3: rule__OrPolicy__RulesAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__OrPolicy__RulesAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getOrPolicyAccess().getRulesAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrPolicy__Group_1__2__Impl"


    // $ANTLR start "rule__AndPolicy__Group__0"
    // InternalDsl.g:3441:1: rule__AndPolicy__Group__0 : rule__AndPolicy__Group__0__Impl rule__AndPolicy__Group__1 ;
    public final void rule__AndPolicy__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3445:1: ( rule__AndPolicy__Group__0__Impl rule__AndPolicy__Group__1 )
            // InternalDsl.g:3446:2: rule__AndPolicy__Group__0__Impl rule__AndPolicy__Group__1
            {
            pushFollow(FOLLOW_28);
            rule__AndPolicy__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AndPolicy__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndPolicy__Group__0"


    // $ANTLR start "rule__AndPolicy__Group__0__Impl"
    // InternalDsl.g:3453:1: rule__AndPolicy__Group__0__Impl : ( ruleNotExpression ) ;
    public final void rule__AndPolicy__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3457:1: ( ( ruleNotExpression ) )
            // InternalDsl.g:3458:1: ( ruleNotExpression )
            {
            // InternalDsl.g:3458:1: ( ruleNotExpression )
            // InternalDsl.g:3459:2: ruleNotExpression
            {
             before(grammarAccess.getAndPolicyAccess().getNotExpressionParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleNotExpression();

            state._fsp--;

             after(grammarAccess.getAndPolicyAccess().getNotExpressionParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndPolicy__Group__0__Impl"


    // $ANTLR start "rule__AndPolicy__Group__1"
    // InternalDsl.g:3468:1: rule__AndPolicy__Group__1 : rule__AndPolicy__Group__1__Impl ;
    public final void rule__AndPolicy__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3472:1: ( rule__AndPolicy__Group__1__Impl )
            // InternalDsl.g:3473:2: rule__AndPolicy__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AndPolicy__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndPolicy__Group__1"


    // $ANTLR start "rule__AndPolicy__Group__1__Impl"
    // InternalDsl.g:3479:1: rule__AndPolicy__Group__1__Impl : ( ( rule__AndPolicy__Group_1__0 )* ) ;
    public final void rule__AndPolicy__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3483:1: ( ( ( rule__AndPolicy__Group_1__0 )* ) )
            // InternalDsl.g:3484:1: ( ( rule__AndPolicy__Group_1__0 )* )
            {
            // InternalDsl.g:3484:1: ( ( rule__AndPolicy__Group_1__0 )* )
            // InternalDsl.g:3485:2: ( rule__AndPolicy__Group_1__0 )*
            {
             before(grammarAccess.getAndPolicyAccess().getGroup_1()); 
            // InternalDsl.g:3486:2: ( rule__AndPolicy__Group_1__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==28) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalDsl.g:3486:3: rule__AndPolicy__Group_1__0
            	    {
            	    pushFollow(FOLLOW_29);
            	    rule__AndPolicy__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getAndPolicyAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndPolicy__Group__1__Impl"


    // $ANTLR start "rule__AndPolicy__Group_1__0"
    // InternalDsl.g:3495:1: rule__AndPolicy__Group_1__0 : rule__AndPolicy__Group_1__0__Impl rule__AndPolicy__Group_1__1 ;
    public final void rule__AndPolicy__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3499:1: ( rule__AndPolicy__Group_1__0__Impl rule__AndPolicy__Group_1__1 )
            // InternalDsl.g:3500:2: rule__AndPolicy__Group_1__0__Impl rule__AndPolicy__Group_1__1
            {
            pushFollow(FOLLOW_28);
            rule__AndPolicy__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AndPolicy__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndPolicy__Group_1__0"


    // $ANTLR start "rule__AndPolicy__Group_1__0__Impl"
    // InternalDsl.g:3507:1: rule__AndPolicy__Group_1__0__Impl : ( () ) ;
    public final void rule__AndPolicy__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3511:1: ( ( () ) )
            // InternalDsl.g:3512:1: ( () )
            {
            // InternalDsl.g:3512:1: ( () )
            // InternalDsl.g:3513:2: ()
            {
             before(grammarAccess.getAndPolicyAccess().getAndRuleRulesAction_1_0()); 
            // InternalDsl.g:3514:2: ()
            // InternalDsl.g:3514:3: 
            {
            }

             after(grammarAccess.getAndPolicyAccess().getAndRuleRulesAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndPolicy__Group_1__0__Impl"


    // $ANTLR start "rule__AndPolicy__Group_1__1"
    // InternalDsl.g:3522:1: rule__AndPolicy__Group_1__1 : rule__AndPolicy__Group_1__1__Impl rule__AndPolicy__Group_1__2 ;
    public final void rule__AndPolicy__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3526:1: ( rule__AndPolicy__Group_1__1__Impl rule__AndPolicy__Group_1__2 )
            // InternalDsl.g:3527:2: rule__AndPolicy__Group_1__1__Impl rule__AndPolicy__Group_1__2
            {
            pushFollow(FOLLOW_8);
            rule__AndPolicy__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AndPolicy__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndPolicy__Group_1__1"


    // $ANTLR start "rule__AndPolicy__Group_1__1__Impl"
    // InternalDsl.g:3534:1: rule__AndPolicy__Group_1__1__Impl : ( '&&' ) ;
    public final void rule__AndPolicy__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3538:1: ( ( '&&' ) )
            // InternalDsl.g:3539:1: ( '&&' )
            {
            // InternalDsl.g:3539:1: ( '&&' )
            // InternalDsl.g:3540:2: '&&'
            {
             before(grammarAccess.getAndPolicyAccess().getAmpersandAmpersandKeyword_1_1()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getAndPolicyAccess().getAmpersandAmpersandKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndPolicy__Group_1__1__Impl"


    // $ANTLR start "rule__AndPolicy__Group_1__2"
    // InternalDsl.g:3549:1: rule__AndPolicy__Group_1__2 : rule__AndPolicy__Group_1__2__Impl ;
    public final void rule__AndPolicy__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3553:1: ( rule__AndPolicy__Group_1__2__Impl )
            // InternalDsl.g:3554:2: rule__AndPolicy__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AndPolicy__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndPolicy__Group_1__2"


    // $ANTLR start "rule__AndPolicy__Group_1__2__Impl"
    // InternalDsl.g:3560:1: rule__AndPolicy__Group_1__2__Impl : ( ( rule__AndPolicy__RulesAssignment_1_2 ) ) ;
    public final void rule__AndPolicy__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3564:1: ( ( ( rule__AndPolicy__RulesAssignment_1_2 ) ) )
            // InternalDsl.g:3565:1: ( ( rule__AndPolicy__RulesAssignment_1_2 ) )
            {
            // InternalDsl.g:3565:1: ( ( rule__AndPolicy__RulesAssignment_1_2 ) )
            // InternalDsl.g:3566:2: ( rule__AndPolicy__RulesAssignment_1_2 )
            {
             before(grammarAccess.getAndPolicyAccess().getRulesAssignment_1_2()); 
            // InternalDsl.g:3567:2: ( rule__AndPolicy__RulesAssignment_1_2 )
            // InternalDsl.g:3567:3: rule__AndPolicy__RulesAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__AndPolicy__RulesAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getAndPolicyAccess().getRulesAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndPolicy__Group_1__2__Impl"


    // $ANTLR start "rule__NotExpression__Group_1__0"
    // InternalDsl.g:3576:1: rule__NotExpression__Group_1__0 : rule__NotExpression__Group_1__0__Impl rule__NotExpression__Group_1__1 ;
    public final void rule__NotExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3580:1: ( rule__NotExpression__Group_1__0__Impl rule__NotExpression__Group_1__1 )
            // InternalDsl.g:3581:2: rule__NotExpression__Group_1__0__Impl rule__NotExpression__Group_1__1
            {
            pushFollow(FOLLOW_32);
            rule__NotExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NotExpression__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NotExpression__Group_1__0"


    // $ANTLR start "rule__NotExpression__Group_1__0__Impl"
    // InternalDsl.g:3588:1: rule__NotExpression__Group_1__0__Impl : ( '!' ) ;
    public final void rule__NotExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3592:1: ( ( '!' ) )
            // InternalDsl.g:3593:1: ( '!' )
            {
            // InternalDsl.g:3593:1: ( '!' )
            // InternalDsl.g:3594:2: '!'
            {
             before(grammarAccess.getNotExpressionAccess().getExclamationMarkKeyword_1_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getNotExpressionAccess().getExclamationMarkKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NotExpression__Group_1__0__Impl"


    // $ANTLR start "rule__NotExpression__Group_1__1"
    // InternalDsl.g:3603:1: rule__NotExpression__Group_1__1 : rule__NotExpression__Group_1__1__Impl rule__NotExpression__Group_1__2 ;
    public final void rule__NotExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3607:1: ( rule__NotExpression__Group_1__1__Impl rule__NotExpression__Group_1__2 )
            // InternalDsl.g:3608:2: rule__NotExpression__Group_1__1__Impl rule__NotExpression__Group_1__2
            {
            pushFollow(FOLLOW_32);
            rule__NotExpression__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NotExpression__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NotExpression__Group_1__1"


    // $ANTLR start "rule__NotExpression__Group_1__1__Impl"
    // InternalDsl.g:3615:1: rule__NotExpression__Group_1__1__Impl : ( () ) ;
    public final void rule__NotExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3619:1: ( ( () ) )
            // InternalDsl.g:3620:1: ( () )
            {
            // InternalDsl.g:3620:1: ( () )
            // InternalDsl.g:3621:2: ()
            {
             before(grammarAccess.getNotExpressionAccess().getNotRuleAction_1_1()); 
            // InternalDsl.g:3622:2: ()
            // InternalDsl.g:3622:3: 
            {
            }

             after(grammarAccess.getNotExpressionAccess().getNotRuleAction_1_1()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NotExpression__Group_1__1__Impl"


    // $ANTLR start "rule__NotExpression__Group_1__2"
    // InternalDsl.g:3630:1: rule__NotExpression__Group_1__2 : rule__NotExpression__Group_1__2__Impl ;
    public final void rule__NotExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3634:1: ( rule__NotExpression__Group_1__2__Impl )
            // InternalDsl.g:3635:2: rule__NotExpression__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NotExpression__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NotExpression__Group_1__2"


    // $ANTLR start "rule__NotExpression__Group_1__2__Impl"
    // InternalDsl.g:3641:1: rule__NotExpression__Group_1__2__Impl : ( ( rule__NotExpression__RuleAssignment_1_2 ) ) ;
    public final void rule__NotExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3645:1: ( ( ( rule__NotExpression__RuleAssignment_1_2 ) ) )
            // InternalDsl.g:3646:1: ( ( rule__NotExpression__RuleAssignment_1_2 ) )
            {
            // InternalDsl.g:3646:1: ( ( rule__NotExpression__RuleAssignment_1_2 ) )
            // InternalDsl.g:3647:2: ( rule__NotExpression__RuleAssignment_1_2 )
            {
             before(grammarAccess.getNotExpressionAccess().getRuleAssignment_1_2()); 
            // InternalDsl.g:3648:2: ( rule__NotExpression__RuleAssignment_1_2 )
            // InternalDsl.g:3648:3: rule__NotExpression__RuleAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__NotExpression__RuleAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getNotExpressionAccess().getRuleAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NotExpression__Group_1__2__Impl"


    // $ANTLR start "rule__Primary__Group_1__0"
    // InternalDsl.g:3657:1: rule__Primary__Group_1__0 : rule__Primary__Group_1__0__Impl rule__Primary__Group_1__1 ;
    public final void rule__Primary__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3661:1: ( rule__Primary__Group_1__0__Impl rule__Primary__Group_1__1 )
            // InternalDsl.g:3662:2: rule__Primary__Group_1__0__Impl rule__Primary__Group_1__1
            {
            pushFollow(FOLLOW_8);
            rule__Primary__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Primary__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_1__0"


    // $ANTLR start "rule__Primary__Group_1__0__Impl"
    // InternalDsl.g:3669:1: rule__Primary__Group_1__0__Impl : ( '(' ) ;
    public final void rule__Primary__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3673:1: ( ( '(' ) )
            // InternalDsl.g:3674:1: ( '(' )
            {
            // InternalDsl.g:3674:1: ( '(' )
            // InternalDsl.g:3675:2: '('
            {
             before(grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_1_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_1__0__Impl"


    // $ANTLR start "rule__Primary__Group_1__1"
    // InternalDsl.g:3684:1: rule__Primary__Group_1__1 : rule__Primary__Group_1__1__Impl rule__Primary__Group_1__2 ;
    public final void rule__Primary__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3688:1: ( rule__Primary__Group_1__1__Impl rule__Primary__Group_1__2 )
            // InternalDsl.g:3689:2: rule__Primary__Group_1__1__Impl rule__Primary__Group_1__2
            {
            pushFollow(FOLLOW_31);
            rule__Primary__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Primary__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_1__1"


    // $ANTLR start "rule__Primary__Group_1__1__Impl"
    // InternalDsl.g:3696:1: rule__Primary__Group_1__1__Impl : ( rulePolicyExpression ) ;
    public final void rule__Primary__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3700:1: ( ( rulePolicyExpression ) )
            // InternalDsl.g:3701:1: ( rulePolicyExpression )
            {
            // InternalDsl.g:3701:1: ( rulePolicyExpression )
            // InternalDsl.g:3702:2: rulePolicyExpression
            {
             before(grammarAccess.getPrimaryAccess().getPolicyExpressionParserRuleCall_1_1()); 
            pushFollow(FOLLOW_2);
            rulePolicyExpression();

            state._fsp--;

             after(grammarAccess.getPrimaryAccess().getPolicyExpressionParserRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_1__1__Impl"


    // $ANTLR start "rule__Primary__Group_1__2"
    // InternalDsl.g:3711:1: rule__Primary__Group_1__2 : rule__Primary__Group_1__2__Impl ;
    public final void rule__Primary__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3715:1: ( rule__Primary__Group_1__2__Impl )
            // InternalDsl.g:3716:2: rule__Primary__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Primary__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_1__2"


    // $ANTLR start "rule__Primary__Group_1__2__Impl"
    // InternalDsl.g:3722:1: rule__Primary__Group_1__2__Impl : ( ')' ) ;
    public final void rule__Primary__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3726:1: ( ( ')' ) )
            // InternalDsl.g:3727:1: ( ')' )
            {
            // InternalDsl.g:3727:1: ( ')' )
            // InternalDsl.g:3728:2: ')'
            {
             before(grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_1_2()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_1__2__Impl"


    // $ANTLR start "rule__Model__ConfigurationAssignment_0"
    // InternalDsl.g:3738:1: rule__Model__ConfigurationAssignment_0 : ( ruleConfiguration ) ;
    public final void rule__Model__ConfigurationAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3742:1: ( ( ruleConfiguration ) )
            // InternalDsl.g:3743:2: ( ruleConfiguration )
            {
            // InternalDsl.g:3743:2: ( ruleConfiguration )
            // InternalDsl.g:3744:3: ruleConfiguration
            {
             before(grammarAccess.getModelAccess().getConfigurationConfigurationParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleConfiguration();

            state._fsp--;

             after(grammarAccess.getModelAccess().getConfigurationConfigurationParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__ConfigurationAssignment_0"


    // $ANTLR start "rule__Model__PoliciesAssignment_1_0"
    // InternalDsl.g:3753:1: rule__Model__PoliciesAssignment_1_0 : ( rulePolicy ) ;
    public final void rule__Model__PoliciesAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3757:1: ( ( rulePolicy ) )
            // InternalDsl.g:3758:2: ( rulePolicy )
            {
            // InternalDsl.g:3758:2: ( rulePolicy )
            // InternalDsl.g:3759:3: rulePolicy
            {
             before(grammarAccess.getModelAccess().getPoliciesPolicyParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_2);
            rulePolicy();

            state._fsp--;

             after(grammarAccess.getModelAccess().getPoliciesPolicyParserRuleCall_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__PoliciesAssignment_1_0"


    // $ANTLR start "rule__Model__PoliciesAssignment_1_1"
    // InternalDsl.g:3768:1: rule__Model__PoliciesAssignment_1_1 : ( rulePolicy ) ;
    public final void rule__Model__PoliciesAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3772:1: ( ( rulePolicy ) )
            // InternalDsl.g:3773:2: ( rulePolicy )
            {
            // InternalDsl.g:3773:2: ( rulePolicy )
            // InternalDsl.g:3774:3: rulePolicy
            {
             before(grammarAccess.getModelAccess().getPoliciesPolicyParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            rulePolicy();

            state._fsp--;

             after(grammarAccess.getModelAccess().getPoliciesPolicyParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__PoliciesAssignment_1_1"


    // $ANTLR start "rule__Configuration__MappingsAssignment_1_0"
    // InternalDsl.g:3783:1: rule__Configuration__MappingsAssignment_1_0 : ( ruleMapping ) ;
    public final void rule__Configuration__MappingsAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3787:1: ( ( ruleMapping ) )
            // InternalDsl.g:3788:2: ( ruleMapping )
            {
            // InternalDsl.g:3788:2: ( ruleMapping )
            // InternalDsl.g:3789:3: ruleMapping
            {
             before(grammarAccess.getConfigurationAccess().getMappingsMappingParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_2);
            ruleMapping();

            state._fsp--;

             after(grammarAccess.getConfigurationAccess().getMappingsMappingParserRuleCall_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configuration__MappingsAssignment_1_0"


    // $ANTLR start "rule__Configuration__MappingsAssignment_1_1"
    // InternalDsl.g:3798:1: rule__Configuration__MappingsAssignment_1_1 : ( ruleMapping ) ;
    public final void rule__Configuration__MappingsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3802:1: ( ( ruleMapping ) )
            // InternalDsl.g:3803:2: ( ruleMapping )
            {
            // InternalDsl.g:3803:2: ( ruleMapping )
            // InternalDsl.g:3804:3: ruleMapping
            {
             before(grammarAccess.getConfigurationAccess().getMappingsMappingParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleMapping();

            state._fsp--;

             after(grammarAccess.getConfigurationAccess().getMappingsMappingParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configuration__MappingsAssignment_1_1"


    // $ANTLR start "rule__Policy__NameAssignment_0"
    // InternalDsl.g:3813:1: rule__Policy__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Policy__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3817:1: ( ( RULE_ID ) )
            // InternalDsl.g:3818:2: ( RULE_ID )
            {
            // InternalDsl.g:3818:2: ( RULE_ID )
            // InternalDsl.g:3819:3: RULE_ID
            {
             before(grammarAccess.getPolicyAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPolicyAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Policy__NameAssignment_0"


    // $ANTLR start "rule__Policy__RuleAssignment_2"
    // InternalDsl.g:3828:1: rule__Policy__RuleAssignment_2 : ( rulePolicyExpression ) ;
    public final void rule__Policy__RuleAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3832:1: ( ( rulePolicyExpression ) )
            // InternalDsl.g:3833:2: ( rulePolicyExpression )
            {
            // InternalDsl.g:3833:2: ( rulePolicyExpression )
            // InternalDsl.g:3834:3: rulePolicyExpression
            {
             before(grammarAccess.getPolicyAccess().getRulePolicyExpressionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            rulePolicyExpression();

            state._fsp--;

             after(grammarAccess.getPolicyAccess().getRulePolicyExpressionParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Policy__RuleAssignment_2"


    // $ANTLR start "rule__Mapping__RuleAssignment_0"
    // InternalDsl.g:3843:1: rule__Mapping__RuleAssignment_0 : ( ruleMappingExpression ) ;
    public final void rule__Mapping__RuleAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3847:1: ( ( ruleMappingExpression ) )
            // InternalDsl.g:3848:2: ( ruleMappingExpression )
            {
            // InternalDsl.g:3848:2: ( ruleMappingExpression )
            // InternalDsl.g:3849:3: ruleMappingExpression
            {
             before(grammarAccess.getMappingAccess().getRuleMappingExpressionParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleMappingExpression();

            state._fsp--;

             after(grammarAccess.getMappingAccess().getRuleMappingExpressionParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mapping__RuleAssignment_0"


    // $ANTLR start "rule__Mapping__PolicyAssignment_2"
    // InternalDsl.g:3858:1: rule__Mapping__PolicyAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Mapping__PolicyAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3862:1: ( ( ( RULE_ID ) ) )
            // InternalDsl.g:3863:2: ( ( RULE_ID ) )
            {
            // InternalDsl.g:3863:2: ( ( RULE_ID ) )
            // InternalDsl.g:3864:3: ( RULE_ID )
            {
             before(grammarAccess.getMappingAccess().getPolicyPolicyCrossReference_2_0()); 
            // InternalDsl.g:3865:3: ( RULE_ID )
            // InternalDsl.g:3866:4: RULE_ID
            {
             before(grammarAccess.getMappingAccess().getPolicyPolicyIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMappingAccess().getPolicyPolicyIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getMappingAccess().getPolicyPolicyCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mapping__PolicyAssignment_2"


    // $ANTLR start "rule__FeatureNameMappingRule__NameAssignment_1"
    // InternalDsl.g:3877:1: rule__FeatureNameMappingRule__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__FeatureNameMappingRule__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3881:1: ( ( ruleEString ) )
            // InternalDsl.g:3882:2: ( ruleEString )
            {
            // InternalDsl.g:3882:2: ( ruleEString )
            // InternalDsl.g:3883:3: ruleEString
            {
             before(grammarAccess.getFeatureNameMappingRuleAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getFeatureNameMappingRuleAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureNameMappingRule__NameAssignment_1"


    // $ANTLR start "rule__RelationNameRule__NameAssignment_2"
    // InternalDsl.g:3892:1: rule__RelationNameRule__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__RelationNameRule__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3896:1: ( ( ruleEString ) )
            // InternalDsl.g:3897:2: ( ruleEString )
            {
            // InternalDsl.g:3897:2: ( ruleEString )
            // InternalDsl.g:3898:3: ruleEString
            {
             before(grammarAccess.getRelationNameRuleAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRelationNameRuleAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationNameRule__NameAssignment_2"


    // $ANTLR start "rule__TypeExistsRule__NameAssignment_2"
    // InternalDsl.g:3907:1: rule__TypeExistsRule__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__TypeExistsRule__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3911:1: ( ( ruleEString ) )
            // InternalDsl.g:3912:2: ( ruleEString )
            {
            // InternalDsl.g:3912:2: ( ruleEString )
            // InternalDsl.g:3913:3: ruleEString
            {
             before(grammarAccess.getTypeExistsRuleAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTypeExistsRuleAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeExistsRule__NameAssignment_2"


    // $ANTLR start "rule__SourceTypeRule__NameAssignment_2"
    // InternalDsl.g:3922:1: rule__SourceTypeRule__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__SourceTypeRule__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3926:1: ( ( ruleEString ) )
            // InternalDsl.g:3927:2: ( ruleEString )
            {
            // InternalDsl.g:3927:2: ( ruleEString )
            // InternalDsl.g:3928:3: ruleEString
            {
             before(grammarAccess.getSourceTypeRuleAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSourceTypeRuleAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SourceTypeRule__NameAssignment_2"


    // $ANTLR start "rule__TargetTypeRule__NameAssignment_2"
    // InternalDsl.g:3937:1: rule__TargetTypeRule__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__TargetTypeRule__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3941:1: ( ( ruleEString ) )
            // InternalDsl.g:3942:2: ( ruleEString )
            {
            // InternalDsl.g:3942:2: ( ruleEString )
            // InternalDsl.g:3943:3: ruleEString
            {
             before(grammarAccess.getTargetTypeRuleAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTargetTypeRuleAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TargetTypeRule__NameAssignment_2"


    // $ANTLR start "rule__CommandNameRule__NameAssignment_2"
    // InternalDsl.g:3952:1: rule__CommandNameRule__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__CommandNameRule__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3956:1: ( ( ruleEString ) )
            // InternalDsl.g:3957:2: ( ruleEString )
            {
            // InternalDsl.g:3957:2: ( ruleEString )
            // InternalDsl.g:3958:3: ruleEString
            {
             before(grammarAccess.getCommandNameRuleAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getCommandNameRuleAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandNameRule__NameAssignment_2"


    // $ANTLR start "rule__ShapeTypeRule__NameAssignment_2"
    // InternalDsl.g:3967:1: rule__ShapeTypeRule__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__ShapeTypeRule__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3971:1: ( ( ruleEString ) )
            // InternalDsl.g:3972:2: ( ruleEString )
            {
            // InternalDsl.g:3972:2: ( ruleEString )
            // InternalDsl.g:3973:3: ruleEString
            {
             before(grammarAccess.getShapeTypeRuleAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getShapeTypeRuleAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShapeTypeRule__NameAssignment_2"


    // $ANTLR start "rule__ParentTypeRule__NameAssignment_2"
    // InternalDsl.g:3982:1: rule__ParentTypeRule__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__ParentTypeRule__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3986:1: ( ( ruleEString ) )
            // InternalDsl.g:3987:2: ( ruleEString )
            {
            // InternalDsl.g:3987:2: ( ruleEString )
            // InternalDsl.g:3988:3: ruleEString
            {
             before(grammarAccess.getParentTypeRuleAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getParentTypeRuleAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParentTypeRule__NameAssignment_2"


    // $ANTLR start "rule__ShapeNameRule__NameAssignment_2"
    // InternalDsl.g:3997:1: rule__ShapeNameRule__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__ShapeNameRule__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4001:1: ( ( ruleEString ) )
            // InternalDsl.g:4002:2: ( ruleEString )
            {
            // InternalDsl.g:4002:2: ( ruleEString )
            // InternalDsl.g:4003:3: ruleEString
            {
             before(grammarAccess.getShapeNameRuleAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getShapeNameRuleAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShapeNameRule__NameAssignment_2"


    // $ANTLR start "rule__ImplicationMapping__ConsequentAssignment_1_2"
    // InternalDsl.g:4012:1: rule__ImplicationMapping__ConsequentAssignment_1_2 : ( ruleOrMapping ) ;
    public final void rule__ImplicationMapping__ConsequentAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4016:1: ( ( ruleOrMapping ) )
            // InternalDsl.g:4017:2: ( ruleOrMapping )
            {
            // InternalDsl.g:4017:2: ( ruleOrMapping )
            // InternalDsl.g:4018:3: ruleOrMapping
            {
             before(grammarAccess.getImplicationMappingAccess().getConsequentOrMappingParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleOrMapping();

            state._fsp--;

             after(grammarAccess.getImplicationMappingAccess().getConsequentOrMappingParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImplicationMapping__ConsequentAssignment_1_2"


    // $ANTLR start "rule__OrMapping__RulesAssignment_1_2"
    // InternalDsl.g:4027:1: rule__OrMapping__RulesAssignment_1_2 : ( ruleAndMapping ) ;
    public final void rule__OrMapping__RulesAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4031:1: ( ( ruleAndMapping ) )
            // InternalDsl.g:4032:2: ( ruleAndMapping )
            {
            // InternalDsl.g:4032:2: ( ruleAndMapping )
            // InternalDsl.g:4033:3: ruleAndMapping
            {
             before(grammarAccess.getOrMappingAccess().getRulesAndMappingParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleAndMapping();

            state._fsp--;

             after(grammarAccess.getOrMappingAccess().getRulesAndMappingParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrMapping__RulesAssignment_1_2"


    // $ANTLR start "rule__AndMapping__RulesAssignment_1_2"
    // InternalDsl.g:4042:1: rule__AndMapping__RulesAssignment_1_2 : ( ruleNotMappingExpression ) ;
    public final void rule__AndMapping__RulesAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4046:1: ( ( ruleNotMappingExpression ) )
            // InternalDsl.g:4047:2: ( ruleNotMappingExpression )
            {
            // InternalDsl.g:4047:2: ( ruleNotMappingExpression )
            // InternalDsl.g:4048:3: ruleNotMappingExpression
            {
             before(grammarAccess.getAndMappingAccess().getRulesNotMappingExpressionParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleNotMappingExpression();

            state._fsp--;

             after(grammarAccess.getAndMappingAccess().getRulesNotMappingExpressionParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndMapping__RulesAssignment_1_2"


    // $ANTLR start "rule__NotMappingExpression__RuleAssignment_1_2"
    // InternalDsl.g:4057:1: rule__NotMappingExpression__RuleAssignment_1_2 : ( rulePrimaryMapping ) ;
    public final void rule__NotMappingExpression__RuleAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4061:1: ( ( rulePrimaryMapping ) )
            // InternalDsl.g:4062:2: ( rulePrimaryMapping )
            {
            // InternalDsl.g:4062:2: ( rulePrimaryMapping )
            // InternalDsl.g:4063:3: rulePrimaryMapping
            {
             before(grammarAccess.getNotMappingExpressionAccess().getRulePrimaryMappingParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            rulePrimaryMapping();

            state._fsp--;

             after(grammarAccess.getNotMappingExpressionAccess().getRulePrimaryMappingParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NotMappingExpression__RuleAssignment_1_2"


    // $ANTLR start "rule__ImplicationPolicy__ConsequentAssignment_1_2"
    // InternalDsl.g:4072:1: rule__ImplicationPolicy__ConsequentAssignment_1_2 : ( ruleOrPolicy ) ;
    public final void rule__ImplicationPolicy__ConsequentAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4076:1: ( ( ruleOrPolicy ) )
            // InternalDsl.g:4077:2: ( ruleOrPolicy )
            {
            // InternalDsl.g:4077:2: ( ruleOrPolicy )
            // InternalDsl.g:4078:3: ruleOrPolicy
            {
             before(grammarAccess.getImplicationPolicyAccess().getConsequentOrPolicyParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleOrPolicy();

            state._fsp--;

             after(grammarAccess.getImplicationPolicyAccess().getConsequentOrPolicyParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImplicationPolicy__ConsequentAssignment_1_2"


    // $ANTLR start "rule__OrPolicy__RulesAssignment_1_2"
    // InternalDsl.g:4087:1: rule__OrPolicy__RulesAssignment_1_2 : ( ruleAndPolicy ) ;
    public final void rule__OrPolicy__RulesAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4091:1: ( ( ruleAndPolicy ) )
            // InternalDsl.g:4092:2: ( ruleAndPolicy )
            {
            // InternalDsl.g:4092:2: ( ruleAndPolicy )
            // InternalDsl.g:4093:3: ruleAndPolicy
            {
             before(grammarAccess.getOrPolicyAccess().getRulesAndPolicyParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleAndPolicy();

            state._fsp--;

             after(grammarAccess.getOrPolicyAccess().getRulesAndPolicyParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrPolicy__RulesAssignment_1_2"


    // $ANTLR start "rule__AndPolicy__RulesAssignment_1_2"
    // InternalDsl.g:4102:1: rule__AndPolicy__RulesAssignment_1_2 : ( ruleNotExpression ) ;
    public final void rule__AndPolicy__RulesAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4106:1: ( ( ruleNotExpression ) )
            // InternalDsl.g:4107:2: ( ruleNotExpression )
            {
            // InternalDsl.g:4107:2: ( ruleNotExpression )
            // InternalDsl.g:4108:3: ruleNotExpression
            {
             before(grammarAccess.getAndPolicyAccess().getRulesNotExpressionParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleNotExpression();

            state._fsp--;

             after(grammarAccess.getAndPolicyAccess().getRulesNotExpressionParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndPolicy__RulesAssignment_1_2"


    // $ANTLR start "rule__NotExpression__RuleAssignment_1_2"
    // InternalDsl.g:4117:1: rule__NotExpression__RuleAssignment_1_2 : ( rulePrimary ) ;
    public final void rule__NotExpression__RuleAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4121:1: ( ( rulePrimary ) )
            // InternalDsl.g:4122:2: ( rulePrimary )
            {
            // InternalDsl.g:4122:2: ( rulePrimary )
            // InternalDsl.g:4123:3: rulePrimary
            {
             before(grammarAccess.getNotExpressionAccess().getRulePrimaryParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            rulePrimary();

            state._fsp--;

             after(grammarAccess.getNotExpressionAccess().getRulePrimaryParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NotExpression__RuleAssignment_1_2"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000060001030L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000060001032L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000063FFF000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000001030L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000003FFF000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000040001030L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000043FFF000L});

}