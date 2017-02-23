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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Model'", "'{'", "'configuration'", "'}'", "'policies'", "','", "'Configuration'", "'mappings'", "'Policy'", "'Mapping'", "'rule'", "'policy'", "'FeatureNameMappingRule'", "'AndMappingRule'", "'!'", "'OrMappingRule'", "'ImplicationMappingRule'", "'if'", "'then'", "'TrueMappingRule'", "'RelationIsCyclicRule'", "'RelationTypesAreEqualRule'", "'RelationIsReflexivRule'", "'AndRule'", "'RelationNameRule'", "'TypeExistsRule'", "'OrRule'", "'NotRule'", "'ImplicationRule'", "'SourceTypeRule'", "'TargetTypeRule'", "'CommandNameRule'", "'ShapeTypeRule'", "'ParentTypeRule'", "'StepInRule'", "'TrueRule'", "'FalseRule'", "'ShapeNameRule'", "'&&'", "'||'", "'('", "')'"
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
    public static final int T__51=51;
    public static final int T__16=16;
    public static final int T__52=52;
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
    public static final int RULE_STRING=4;
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


    // $ANTLR start "entryRuleAbstractRule"
    // InternalDsl.g:78:1: entryRuleAbstractRule : ruleAbstractRule EOF ;
    public final void entryRuleAbstractRule() throws RecognitionException {
        try {
            // InternalDsl.g:79:1: ( ruleAbstractRule EOF )
            // InternalDsl.g:80:1: ruleAbstractRule EOF
            {
             before(grammarAccess.getAbstractRuleRule()); 
            pushFollow(FOLLOW_1);
            ruleAbstractRule();

            state._fsp--;

             after(grammarAccess.getAbstractRuleRule()); 
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
    // $ANTLR end "entryRuleAbstractRule"


    // $ANTLR start "ruleAbstractRule"
    // InternalDsl.g:87:1: ruleAbstractRule : ( ( rule__AbstractRule__Alternatives ) ) ;
    public final void ruleAbstractRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:91:2: ( ( ( rule__AbstractRule__Alternatives ) ) )
            // InternalDsl.g:92:2: ( ( rule__AbstractRule__Alternatives ) )
            {
            // InternalDsl.g:92:2: ( ( rule__AbstractRule__Alternatives ) )
            // InternalDsl.g:93:3: ( rule__AbstractRule__Alternatives )
            {
             before(grammarAccess.getAbstractRuleAccess().getAlternatives()); 
            // InternalDsl.g:94:3: ( rule__AbstractRule__Alternatives )
            // InternalDsl.g:94:4: rule__AbstractRule__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__AbstractRule__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAbstractRuleAccess().getAlternatives()); 

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
    // $ANTLR end "ruleAbstractRule"


    // $ANTLR start "entryRuleAbstractMappingRule"
    // InternalDsl.g:103:1: entryRuleAbstractMappingRule : ruleAbstractMappingRule EOF ;
    public final void entryRuleAbstractMappingRule() throws RecognitionException {
        try {
            // InternalDsl.g:104:1: ( ruleAbstractMappingRule EOF )
            // InternalDsl.g:105:1: ruleAbstractMappingRule EOF
            {
             before(grammarAccess.getAbstractMappingRuleRule()); 
            pushFollow(FOLLOW_1);
            ruleAbstractMappingRule();

            state._fsp--;

             after(grammarAccess.getAbstractMappingRuleRule()); 
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
    // $ANTLR end "entryRuleAbstractMappingRule"


    // $ANTLR start "ruleAbstractMappingRule"
    // InternalDsl.g:112:1: ruleAbstractMappingRule : ( ( rule__AbstractMappingRule__Alternatives ) ) ;
    public final void ruleAbstractMappingRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:116:2: ( ( ( rule__AbstractMappingRule__Alternatives ) ) )
            // InternalDsl.g:117:2: ( ( rule__AbstractMappingRule__Alternatives ) )
            {
            // InternalDsl.g:117:2: ( ( rule__AbstractMappingRule__Alternatives ) )
            // InternalDsl.g:118:3: ( rule__AbstractMappingRule__Alternatives )
            {
             before(grammarAccess.getAbstractMappingRuleAccess().getAlternatives()); 
            // InternalDsl.g:119:3: ( rule__AbstractMappingRule__Alternatives )
            // InternalDsl.g:119:4: rule__AbstractMappingRule__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__AbstractMappingRule__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAbstractMappingRuleAccess().getAlternatives()); 

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
    // $ANTLR end "ruleAbstractMappingRule"


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


    // $ANTLR start "entryRuleAndMappingRule"
    // InternalDsl.g:228:1: entryRuleAndMappingRule : ruleAndMappingRule EOF ;
    public final void entryRuleAndMappingRule() throws RecognitionException {
        try {
            // InternalDsl.g:229:1: ( ruleAndMappingRule EOF )
            // InternalDsl.g:230:1: ruleAndMappingRule EOF
            {
             before(grammarAccess.getAndMappingRuleRule()); 
            pushFollow(FOLLOW_1);
            ruleAndMappingRule();

            state._fsp--;

             after(grammarAccess.getAndMappingRuleRule()); 
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
    // $ANTLR end "entryRuleAndMappingRule"


    // $ANTLR start "ruleAndMappingRule"
    // InternalDsl.g:237:1: ruleAndMappingRule : ( ( rule__AndMappingRule__Group__0 ) ) ;
    public final void ruleAndMappingRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:241:2: ( ( ( rule__AndMappingRule__Group__0 ) ) )
            // InternalDsl.g:242:2: ( ( rule__AndMappingRule__Group__0 ) )
            {
            // InternalDsl.g:242:2: ( ( rule__AndMappingRule__Group__0 ) )
            // InternalDsl.g:243:3: ( rule__AndMappingRule__Group__0 )
            {
             before(grammarAccess.getAndMappingRuleAccess().getGroup()); 
            // InternalDsl.g:244:3: ( rule__AndMappingRule__Group__0 )
            // InternalDsl.g:244:4: rule__AndMappingRule__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AndMappingRule__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAndMappingRuleAccess().getGroup()); 

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
    // $ANTLR end "ruleAndMappingRule"


    // $ANTLR start "entryRuleNotMappingRule"
    // InternalDsl.g:253:1: entryRuleNotMappingRule : ruleNotMappingRule EOF ;
    public final void entryRuleNotMappingRule() throws RecognitionException {
        try {
            // InternalDsl.g:254:1: ( ruleNotMappingRule EOF )
            // InternalDsl.g:255:1: ruleNotMappingRule EOF
            {
             before(grammarAccess.getNotMappingRuleRule()); 
            pushFollow(FOLLOW_1);
            ruleNotMappingRule();

            state._fsp--;

             after(grammarAccess.getNotMappingRuleRule()); 
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
    // $ANTLR end "entryRuleNotMappingRule"


    // $ANTLR start "ruleNotMappingRule"
    // InternalDsl.g:262:1: ruleNotMappingRule : ( ( rule__NotMappingRule__Group__0 ) ) ;
    public final void ruleNotMappingRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:266:2: ( ( ( rule__NotMappingRule__Group__0 ) ) )
            // InternalDsl.g:267:2: ( ( rule__NotMappingRule__Group__0 ) )
            {
            // InternalDsl.g:267:2: ( ( rule__NotMappingRule__Group__0 ) )
            // InternalDsl.g:268:3: ( rule__NotMappingRule__Group__0 )
            {
             before(grammarAccess.getNotMappingRuleAccess().getGroup()); 
            // InternalDsl.g:269:3: ( rule__NotMappingRule__Group__0 )
            // InternalDsl.g:269:4: rule__NotMappingRule__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__NotMappingRule__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNotMappingRuleAccess().getGroup()); 

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
    // $ANTLR end "ruleNotMappingRule"


    // $ANTLR start "entryRuleOrMappingRule"
    // InternalDsl.g:278:1: entryRuleOrMappingRule : ruleOrMappingRule EOF ;
    public final void entryRuleOrMappingRule() throws RecognitionException {
        try {
            // InternalDsl.g:279:1: ( ruleOrMappingRule EOF )
            // InternalDsl.g:280:1: ruleOrMappingRule EOF
            {
             before(grammarAccess.getOrMappingRuleRule()); 
            pushFollow(FOLLOW_1);
            ruleOrMappingRule();

            state._fsp--;

             after(grammarAccess.getOrMappingRuleRule()); 
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
    // $ANTLR end "entryRuleOrMappingRule"


    // $ANTLR start "ruleOrMappingRule"
    // InternalDsl.g:287:1: ruleOrMappingRule : ( ( rule__OrMappingRule__Group__0 ) ) ;
    public final void ruleOrMappingRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:291:2: ( ( ( rule__OrMappingRule__Group__0 ) ) )
            // InternalDsl.g:292:2: ( ( rule__OrMappingRule__Group__0 ) )
            {
            // InternalDsl.g:292:2: ( ( rule__OrMappingRule__Group__0 ) )
            // InternalDsl.g:293:3: ( rule__OrMappingRule__Group__0 )
            {
             before(grammarAccess.getOrMappingRuleAccess().getGroup()); 
            // InternalDsl.g:294:3: ( rule__OrMappingRule__Group__0 )
            // InternalDsl.g:294:4: rule__OrMappingRule__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__OrMappingRule__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOrMappingRuleAccess().getGroup()); 

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
    // $ANTLR end "ruleOrMappingRule"


    // $ANTLR start "entryRuleImplicationMappingRule"
    // InternalDsl.g:303:1: entryRuleImplicationMappingRule : ruleImplicationMappingRule EOF ;
    public final void entryRuleImplicationMappingRule() throws RecognitionException {
        try {
            // InternalDsl.g:304:1: ( ruleImplicationMappingRule EOF )
            // InternalDsl.g:305:1: ruleImplicationMappingRule EOF
            {
             before(grammarAccess.getImplicationMappingRuleRule()); 
            pushFollow(FOLLOW_1);
            ruleImplicationMappingRule();

            state._fsp--;

             after(grammarAccess.getImplicationMappingRuleRule()); 
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
    // $ANTLR end "entryRuleImplicationMappingRule"


    // $ANTLR start "ruleImplicationMappingRule"
    // InternalDsl.g:312:1: ruleImplicationMappingRule : ( ( rule__ImplicationMappingRule__Group__0 ) ) ;
    public final void ruleImplicationMappingRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:316:2: ( ( ( rule__ImplicationMappingRule__Group__0 ) ) )
            // InternalDsl.g:317:2: ( ( rule__ImplicationMappingRule__Group__0 ) )
            {
            // InternalDsl.g:317:2: ( ( rule__ImplicationMappingRule__Group__0 ) )
            // InternalDsl.g:318:3: ( rule__ImplicationMappingRule__Group__0 )
            {
             before(grammarAccess.getImplicationMappingRuleAccess().getGroup()); 
            // InternalDsl.g:319:3: ( rule__ImplicationMappingRule__Group__0 )
            // InternalDsl.g:319:4: rule__ImplicationMappingRule__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ImplicationMappingRule__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getImplicationMappingRuleAccess().getGroup()); 

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
    // $ANTLR end "ruleImplicationMappingRule"


    // $ANTLR start "entryRuleTrueMappingRule"
    // InternalDsl.g:328:1: entryRuleTrueMappingRule : ruleTrueMappingRule EOF ;
    public final void entryRuleTrueMappingRule() throws RecognitionException {
        try {
            // InternalDsl.g:329:1: ( ruleTrueMappingRule EOF )
            // InternalDsl.g:330:1: ruleTrueMappingRule EOF
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
    // InternalDsl.g:337:1: ruleTrueMappingRule : ( ( rule__TrueMappingRule__Group__0 ) ) ;
    public final void ruleTrueMappingRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:341:2: ( ( ( rule__TrueMappingRule__Group__0 ) ) )
            // InternalDsl.g:342:2: ( ( rule__TrueMappingRule__Group__0 ) )
            {
            // InternalDsl.g:342:2: ( ( rule__TrueMappingRule__Group__0 ) )
            // InternalDsl.g:343:3: ( rule__TrueMappingRule__Group__0 )
            {
             before(grammarAccess.getTrueMappingRuleAccess().getGroup()); 
            // InternalDsl.g:344:3: ( rule__TrueMappingRule__Group__0 )
            // InternalDsl.g:344:4: rule__TrueMappingRule__Group__0
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
    // InternalDsl.g:353:1: entryRuleRelationIsCyclicRule : ruleRelationIsCyclicRule EOF ;
    public final void entryRuleRelationIsCyclicRule() throws RecognitionException {
        try {
            // InternalDsl.g:354:1: ( ruleRelationIsCyclicRule EOF )
            // InternalDsl.g:355:1: ruleRelationIsCyclicRule EOF
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
    // InternalDsl.g:362:1: ruleRelationIsCyclicRule : ( ( rule__RelationIsCyclicRule__Group__0 ) ) ;
    public final void ruleRelationIsCyclicRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:366:2: ( ( ( rule__RelationIsCyclicRule__Group__0 ) ) )
            // InternalDsl.g:367:2: ( ( rule__RelationIsCyclicRule__Group__0 ) )
            {
            // InternalDsl.g:367:2: ( ( rule__RelationIsCyclicRule__Group__0 ) )
            // InternalDsl.g:368:3: ( rule__RelationIsCyclicRule__Group__0 )
            {
             before(grammarAccess.getRelationIsCyclicRuleAccess().getGroup()); 
            // InternalDsl.g:369:3: ( rule__RelationIsCyclicRule__Group__0 )
            // InternalDsl.g:369:4: rule__RelationIsCyclicRule__Group__0
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
    // InternalDsl.g:378:1: entryRuleRelationTypesAreEqualRule : ruleRelationTypesAreEqualRule EOF ;
    public final void entryRuleRelationTypesAreEqualRule() throws RecognitionException {
        try {
            // InternalDsl.g:379:1: ( ruleRelationTypesAreEqualRule EOF )
            // InternalDsl.g:380:1: ruleRelationTypesAreEqualRule EOF
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
    // InternalDsl.g:387:1: ruleRelationTypesAreEqualRule : ( ( rule__RelationTypesAreEqualRule__Group__0 ) ) ;
    public final void ruleRelationTypesAreEqualRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:391:2: ( ( ( rule__RelationTypesAreEqualRule__Group__0 ) ) )
            // InternalDsl.g:392:2: ( ( rule__RelationTypesAreEqualRule__Group__0 ) )
            {
            // InternalDsl.g:392:2: ( ( rule__RelationTypesAreEqualRule__Group__0 ) )
            // InternalDsl.g:393:3: ( rule__RelationTypesAreEqualRule__Group__0 )
            {
             before(grammarAccess.getRelationTypesAreEqualRuleAccess().getGroup()); 
            // InternalDsl.g:394:3: ( rule__RelationTypesAreEqualRule__Group__0 )
            // InternalDsl.g:394:4: rule__RelationTypesAreEqualRule__Group__0
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
    // InternalDsl.g:403:1: entryRuleRelationIsReflexivRule : ruleRelationIsReflexivRule EOF ;
    public final void entryRuleRelationIsReflexivRule() throws RecognitionException {
        try {
            // InternalDsl.g:404:1: ( ruleRelationIsReflexivRule EOF )
            // InternalDsl.g:405:1: ruleRelationIsReflexivRule EOF
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
    // InternalDsl.g:412:1: ruleRelationIsReflexivRule : ( ( rule__RelationIsReflexivRule__Group__0 ) ) ;
    public final void ruleRelationIsReflexivRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:416:2: ( ( ( rule__RelationIsReflexivRule__Group__0 ) ) )
            // InternalDsl.g:417:2: ( ( rule__RelationIsReflexivRule__Group__0 ) )
            {
            // InternalDsl.g:417:2: ( ( rule__RelationIsReflexivRule__Group__0 ) )
            // InternalDsl.g:418:3: ( rule__RelationIsReflexivRule__Group__0 )
            {
             before(grammarAccess.getRelationIsReflexivRuleAccess().getGroup()); 
            // InternalDsl.g:419:3: ( rule__RelationIsReflexivRule__Group__0 )
            // InternalDsl.g:419:4: rule__RelationIsReflexivRule__Group__0
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
    // InternalDsl.g:428:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalDsl.g:429:1: ( ruleEString EOF )
            // InternalDsl.g:430:1: ruleEString EOF
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
    // InternalDsl.g:437:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:441:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalDsl.g:442:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalDsl.g:442:2: ( ( rule__EString__Alternatives ) )
            // InternalDsl.g:443:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalDsl.g:444:3: ( rule__EString__Alternatives )
            // InternalDsl.g:444:4: rule__EString__Alternatives
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


    // $ANTLR start "entryRuleAndRule"
    // InternalDsl.g:453:1: entryRuleAndRule : ruleAndRule EOF ;
    public final void entryRuleAndRule() throws RecognitionException {
        try {
            // InternalDsl.g:454:1: ( ruleAndRule EOF )
            // InternalDsl.g:455:1: ruleAndRule EOF
            {
             before(grammarAccess.getAndRuleRule()); 
            pushFollow(FOLLOW_1);
            ruleAndRule();

            state._fsp--;

             after(grammarAccess.getAndRuleRule()); 
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
    // $ANTLR end "entryRuleAndRule"


    // $ANTLR start "ruleAndRule"
    // InternalDsl.g:462:1: ruleAndRule : ( ( rule__AndRule__Group__0 ) ) ;
    public final void ruleAndRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:466:2: ( ( ( rule__AndRule__Group__0 ) ) )
            // InternalDsl.g:467:2: ( ( rule__AndRule__Group__0 ) )
            {
            // InternalDsl.g:467:2: ( ( rule__AndRule__Group__0 ) )
            // InternalDsl.g:468:3: ( rule__AndRule__Group__0 )
            {
             before(grammarAccess.getAndRuleAccess().getGroup()); 
            // InternalDsl.g:469:3: ( rule__AndRule__Group__0 )
            // InternalDsl.g:469:4: rule__AndRule__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AndRule__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAndRuleAccess().getGroup()); 

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
    // $ANTLR end "ruleAndRule"


    // $ANTLR start "entryRuleRelationNameRule"
    // InternalDsl.g:478:1: entryRuleRelationNameRule : ruleRelationNameRule EOF ;
    public final void entryRuleRelationNameRule() throws RecognitionException {
        try {
            // InternalDsl.g:479:1: ( ruleRelationNameRule EOF )
            // InternalDsl.g:480:1: ruleRelationNameRule EOF
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
    // InternalDsl.g:487:1: ruleRelationNameRule : ( ( rule__RelationNameRule__Group__0 ) ) ;
    public final void ruleRelationNameRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:491:2: ( ( ( rule__RelationNameRule__Group__0 ) ) )
            // InternalDsl.g:492:2: ( ( rule__RelationNameRule__Group__0 ) )
            {
            // InternalDsl.g:492:2: ( ( rule__RelationNameRule__Group__0 ) )
            // InternalDsl.g:493:3: ( rule__RelationNameRule__Group__0 )
            {
             before(grammarAccess.getRelationNameRuleAccess().getGroup()); 
            // InternalDsl.g:494:3: ( rule__RelationNameRule__Group__0 )
            // InternalDsl.g:494:4: rule__RelationNameRule__Group__0
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
    // InternalDsl.g:503:1: entryRuleTypeExistsRule : ruleTypeExistsRule EOF ;
    public final void entryRuleTypeExistsRule() throws RecognitionException {
        try {
            // InternalDsl.g:504:1: ( ruleTypeExistsRule EOF )
            // InternalDsl.g:505:1: ruleTypeExistsRule EOF
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
    // InternalDsl.g:512:1: ruleTypeExistsRule : ( ( rule__TypeExistsRule__Group__0 ) ) ;
    public final void ruleTypeExistsRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:516:2: ( ( ( rule__TypeExistsRule__Group__0 ) ) )
            // InternalDsl.g:517:2: ( ( rule__TypeExistsRule__Group__0 ) )
            {
            // InternalDsl.g:517:2: ( ( rule__TypeExistsRule__Group__0 ) )
            // InternalDsl.g:518:3: ( rule__TypeExistsRule__Group__0 )
            {
             before(grammarAccess.getTypeExistsRuleAccess().getGroup()); 
            // InternalDsl.g:519:3: ( rule__TypeExistsRule__Group__0 )
            // InternalDsl.g:519:4: rule__TypeExistsRule__Group__0
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


    // $ANTLR start "entryRuleOrRule"
    // InternalDsl.g:528:1: entryRuleOrRule : ruleOrRule EOF ;
    public final void entryRuleOrRule() throws RecognitionException {
        try {
            // InternalDsl.g:529:1: ( ruleOrRule EOF )
            // InternalDsl.g:530:1: ruleOrRule EOF
            {
             before(grammarAccess.getOrRuleRule()); 
            pushFollow(FOLLOW_1);
            ruleOrRule();

            state._fsp--;

             after(grammarAccess.getOrRuleRule()); 
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
    // $ANTLR end "entryRuleOrRule"


    // $ANTLR start "ruleOrRule"
    // InternalDsl.g:537:1: ruleOrRule : ( ( rule__OrRule__Group__0 ) ) ;
    public final void ruleOrRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:541:2: ( ( ( rule__OrRule__Group__0 ) ) )
            // InternalDsl.g:542:2: ( ( rule__OrRule__Group__0 ) )
            {
            // InternalDsl.g:542:2: ( ( rule__OrRule__Group__0 ) )
            // InternalDsl.g:543:3: ( rule__OrRule__Group__0 )
            {
             before(grammarAccess.getOrRuleAccess().getGroup()); 
            // InternalDsl.g:544:3: ( rule__OrRule__Group__0 )
            // InternalDsl.g:544:4: rule__OrRule__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__OrRule__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOrRuleAccess().getGroup()); 

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
    // $ANTLR end "ruleOrRule"


    // $ANTLR start "entryRuleNotRule"
    // InternalDsl.g:553:1: entryRuleNotRule : ruleNotRule EOF ;
    public final void entryRuleNotRule() throws RecognitionException {
        try {
            // InternalDsl.g:554:1: ( ruleNotRule EOF )
            // InternalDsl.g:555:1: ruleNotRule EOF
            {
             before(grammarAccess.getNotRuleRule()); 
            pushFollow(FOLLOW_1);
            ruleNotRule();

            state._fsp--;

             after(grammarAccess.getNotRuleRule()); 
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
    // $ANTLR end "entryRuleNotRule"


    // $ANTLR start "ruleNotRule"
    // InternalDsl.g:562:1: ruleNotRule : ( ( rule__NotRule__Group__0 ) ) ;
    public final void ruleNotRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:566:2: ( ( ( rule__NotRule__Group__0 ) ) )
            // InternalDsl.g:567:2: ( ( rule__NotRule__Group__0 ) )
            {
            // InternalDsl.g:567:2: ( ( rule__NotRule__Group__0 ) )
            // InternalDsl.g:568:3: ( rule__NotRule__Group__0 )
            {
             before(grammarAccess.getNotRuleAccess().getGroup()); 
            // InternalDsl.g:569:3: ( rule__NotRule__Group__0 )
            // InternalDsl.g:569:4: rule__NotRule__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__NotRule__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNotRuleAccess().getGroup()); 

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
    // $ANTLR end "ruleNotRule"


    // $ANTLR start "entryRuleImplicationRule"
    // InternalDsl.g:578:1: entryRuleImplicationRule : ruleImplicationRule EOF ;
    public final void entryRuleImplicationRule() throws RecognitionException {
        try {
            // InternalDsl.g:579:1: ( ruleImplicationRule EOF )
            // InternalDsl.g:580:1: ruleImplicationRule EOF
            {
             before(grammarAccess.getImplicationRuleRule()); 
            pushFollow(FOLLOW_1);
            ruleImplicationRule();

            state._fsp--;

             after(grammarAccess.getImplicationRuleRule()); 
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
    // $ANTLR end "entryRuleImplicationRule"


    // $ANTLR start "ruleImplicationRule"
    // InternalDsl.g:587:1: ruleImplicationRule : ( ( rule__ImplicationRule__Group__0 ) ) ;
    public final void ruleImplicationRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:591:2: ( ( ( rule__ImplicationRule__Group__0 ) ) )
            // InternalDsl.g:592:2: ( ( rule__ImplicationRule__Group__0 ) )
            {
            // InternalDsl.g:592:2: ( ( rule__ImplicationRule__Group__0 ) )
            // InternalDsl.g:593:3: ( rule__ImplicationRule__Group__0 )
            {
             before(grammarAccess.getImplicationRuleAccess().getGroup()); 
            // InternalDsl.g:594:3: ( rule__ImplicationRule__Group__0 )
            // InternalDsl.g:594:4: rule__ImplicationRule__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ImplicationRule__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getImplicationRuleAccess().getGroup()); 

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
    // $ANTLR end "ruleImplicationRule"


    // $ANTLR start "entryRuleSourceTypeRule"
    // InternalDsl.g:603:1: entryRuleSourceTypeRule : ruleSourceTypeRule EOF ;
    public final void entryRuleSourceTypeRule() throws RecognitionException {
        try {
            // InternalDsl.g:604:1: ( ruleSourceTypeRule EOF )
            // InternalDsl.g:605:1: ruleSourceTypeRule EOF
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
    // InternalDsl.g:612:1: ruleSourceTypeRule : ( ( rule__SourceTypeRule__Group__0 ) ) ;
    public final void ruleSourceTypeRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:616:2: ( ( ( rule__SourceTypeRule__Group__0 ) ) )
            // InternalDsl.g:617:2: ( ( rule__SourceTypeRule__Group__0 ) )
            {
            // InternalDsl.g:617:2: ( ( rule__SourceTypeRule__Group__0 ) )
            // InternalDsl.g:618:3: ( rule__SourceTypeRule__Group__0 )
            {
             before(grammarAccess.getSourceTypeRuleAccess().getGroup()); 
            // InternalDsl.g:619:3: ( rule__SourceTypeRule__Group__0 )
            // InternalDsl.g:619:4: rule__SourceTypeRule__Group__0
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
    // InternalDsl.g:628:1: entryRuleTargetTypeRule : ruleTargetTypeRule EOF ;
    public final void entryRuleTargetTypeRule() throws RecognitionException {
        try {
            // InternalDsl.g:629:1: ( ruleTargetTypeRule EOF )
            // InternalDsl.g:630:1: ruleTargetTypeRule EOF
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
    // InternalDsl.g:637:1: ruleTargetTypeRule : ( ( rule__TargetTypeRule__Group__0 ) ) ;
    public final void ruleTargetTypeRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:641:2: ( ( ( rule__TargetTypeRule__Group__0 ) ) )
            // InternalDsl.g:642:2: ( ( rule__TargetTypeRule__Group__0 ) )
            {
            // InternalDsl.g:642:2: ( ( rule__TargetTypeRule__Group__0 ) )
            // InternalDsl.g:643:3: ( rule__TargetTypeRule__Group__0 )
            {
             before(grammarAccess.getTargetTypeRuleAccess().getGroup()); 
            // InternalDsl.g:644:3: ( rule__TargetTypeRule__Group__0 )
            // InternalDsl.g:644:4: rule__TargetTypeRule__Group__0
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
    // InternalDsl.g:653:1: entryRuleCommandNameRule : ruleCommandNameRule EOF ;
    public final void entryRuleCommandNameRule() throws RecognitionException {
        try {
            // InternalDsl.g:654:1: ( ruleCommandNameRule EOF )
            // InternalDsl.g:655:1: ruleCommandNameRule EOF
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
    // InternalDsl.g:662:1: ruleCommandNameRule : ( ( rule__CommandNameRule__Group__0 ) ) ;
    public final void ruleCommandNameRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:666:2: ( ( ( rule__CommandNameRule__Group__0 ) ) )
            // InternalDsl.g:667:2: ( ( rule__CommandNameRule__Group__0 ) )
            {
            // InternalDsl.g:667:2: ( ( rule__CommandNameRule__Group__0 ) )
            // InternalDsl.g:668:3: ( rule__CommandNameRule__Group__0 )
            {
             before(grammarAccess.getCommandNameRuleAccess().getGroup()); 
            // InternalDsl.g:669:3: ( rule__CommandNameRule__Group__0 )
            // InternalDsl.g:669:4: rule__CommandNameRule__Group__0
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
    // InternalDsl.g:678:1: entryRuleShapeTypeRule : ruleShapeTypeRule EOF ;
    public final void entryRuleShapeTypeRule() throws RecognitionException {
        try {
            // InternalDsl.g:679:1: ( ruleShapeTypeRule EOF )
            // InternalDsl.g:680:1: ruleShapeTypeRule EOF
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
    // InternalDsl.g:687:1: ruleShapeTypeRule : ( ( rule__ShapeTypeRule__Group__0 ) ) ;
    public final void ruleShapeTypeRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:691:2: ( ( ( rule__ShapeTypeRule__Group__0 ) ) )
            // InternalDsl.g:692:2: ( ( rule__ShapeTypeRule__Group__0 ) )
            {
            // InternalDsl.g:692:2: ( ( rule__ShapeTypeRule__Group__0 ) )
            // InternalDsl.g:693:3: ( rule__ShapeTypeRule__Group__0 )
            {
             before(grammarAccess.getShapeTypeRuleAccess().getGroup()); 
            // InternalDsl.g:694:3: ( rule__ShapeTypeRule__Group__0 )
            // InternalDsl.g:694:4: rule__ShapeTypeRule__Group__0
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
    // InternalDsl.g:703:1: entryRuleParentTypeRule : ruleParentTypeRule EOF ;
    public final void entryRuleParentTypeRule() throws RecognitionException {
        try {
            // InternalDsl.g:704:1: ( ruleParentTypeRule EOF )
            // InternalDsl.g:705:1: ruleParentTypeRule EOF
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
    // InternalDsl.g:712:1: ruleParentTypeRule : ( ( rule__ParentTypeRule__Group__0 ) ) ;
    public final void ruleParentTypeRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:716:2: ( ( ( rule__ParentTypeRule__Group__0 ) ) )
            // InternalDsl.g:717:2: ( ( rule__ParentTypeRule__Group__0 ) )
            {
            // InternalDsl.g:717:2: ( ( rule__ParentTypeRule__Group__0 ) )
            // InternalDsl.g:718:3: ( rule__ParentTypeRule__Group__0 )
            {
             before(grammarAccess.getParentTypeRuleAccess().getGroup()); 
            // InternalDsl.g:719:3: ( rule__ParentTypeRule__Group__0 )
            // InternalDsl.g:719:4: rule__ParentTypeRule__Group__0
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
    // InternalDsl.g:728:1: entryRuleStepInRule : ruleStepInRule EOF ;
    public final void entryRuleStepInRule() throws RecognitionException {
        try {
            // InternalDsl.g:729:1: ( ruleStepInRule EOF )
            // InternalDsl.g:730:1: ruleStepInRule EOF
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
    // InternalDsl.g:737:1: ruleStepInRule : ( ( rule__StepInRule__Group__0 ) ) ;
    public final void ruleStepInRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:741:2: ( ( ( rule__StepInRule__Group__0 ) ) )
            // InternalDsl.g:742:2: ( ( rule__StepInRule__Group__0 ) )
            {
            // InternalDsl.g:742:2: ( ( rule__StepInRule__Group__0 ) )
            // InternalDsl.g:743:3: ( rule__StepInRule__Group__0 )
            {
             before(grammarAccess.getStepInRuleAccess().getGroup()); 
            // InternalDsl.g:744:3: ( rule__StepInRule__Group__0 )
            // InternalDsl.g:744:4: rule__StepInRule__Group__0
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
    // InternalDsl.g:753:1: entryRuleTrueRule : ruleTrueRule EOF ;
    public final void entryRuleTrueRule() throws RecognitionException {
        try {
            // InternalDsl.g:754:1: ( ruleTrueRule EOF )
            // InternalDsl.g:755:1: ruleTrueRule EOF
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
    // InternalDsl.g:762:1: ruleTrueRule : ( ( rule__TrueRule__Group__0 ) ) ;
    public final void ruleTrueRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:766:2: ( ( ( rule__TrueRule__Group__0 ) ) )
            // InternalDsl.g:767:2: ( ( rule__TrueRule__Group__0 ) )
            {
            // InternalDsl.g:767:2: ( ( rule__TrueRule__Group__0 ) )
            // InternalDsl.g:768:3: ( rule__TrueRule__Group__0 )
            {
             before(grammarAccess.getTrueRuleAccess().getGroup()); 
            // InternalDsl.g:769:3: ( rule__TrueRule__Group__0 )
            // InternalDsl.g:769:4: rule__TrueRule__Group__0
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
    // InternalDsl.g:778:1: entryRuleFalseRule : ruleFalseRule EOF ;
    public final void entryRuleFalseRule() throws RecognitionException {
        try {
            // InternalDsl.g:779:1: ( ruleFalseRule EOF )
            // InternalDsl.g:780:1: ruleFalseRule EOF
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
    // InternalDsl.g:787:1: ruleFalseRule : ( ( rule__FalseRule__Group__0 ) ) ;
    public final void ruleFalseRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:791:2: ( ( ( rule__FalseRule__Group__0 ) ) )
            // InternalDsl.g:792:2: ( ( rule__FalseRule__Group__0 ) )
            {
            // InternalDsl.g:792:2: ( ( rule__FalseRule__Group__0 ) )
            // InternalDsl.g:793:3: ( rule__FalseRule__Group__0 )
            {
             before(grammarAccess.getFalseRuleAccess().getGroup()); 
            // InternalDsl.g:794:3: ( rule__FalseRule__Group__0 )
            // InternalDsl.g:794:4: rule__FalseRule__Group__0
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
    // InternalDsl.g:803:1: entryRuleShapeNameRule : ruleShapeNameRule EOF ;
    public final void entryRuleShapeNameRule() throws RecognitionException {
        try {
            // InternalDsl.g:804:1: ( ruleShapeNameRule EOF )
            // InternalDsl.g:805:1: ruleShapeNameRule EOF
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
    // InternalDsl.g:812:1: ruleShapeNameRule : ( ( rule__ShapeNameRule__Group__0 ) ) ;
    public final void ruleShapeNameRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:816:2: ( ( ( rule__ShapeNameRule__Group__0 ) ) )
            // InternalDsl.g:817:2: ( ( rule__ShapeNameRule__Group__0 ) )
            {
            // InternalDsl.g:817:2: ( ( rule__ShapeNameRule__Group__0 ) )
            // InternalDsl.g:818:3: ( rule__ShapeNameRule__Group__0 )
            {
             before(grammarAccess.getShapeNameRuleAccess().getGroup()); 
            // InternalDsl.g:819:3: ( rule__ShapeNameRule__Group__0 )
            // InternalDsl.g:819:4: rule__ShapeNameRule__Group__0
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
    // InternalDsl.g:828:1: entryRuleMappingExpression : ruleMappingExpression EOF ;
    public final void entryRuleMappingExpression() throws RecognitionException {
        try {
            // InternalDsl.g:829:1: ( ruleMappingExpression EOF )
            // InternalDsl.g:830:1: ruleMappingExpression EOF
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
    // InternalDsl.g:837:1: ruleMappingExpression : ( ( rule__MappingExpression__Alternatives ) ) ;
    public final void ruleMappingExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:841:2: ( ( ( rule__MappingExpression__Alternatives ) ) )
            // InternalDsl.g:842:2: ( ( rule__MappingExpression__Alternatives ) )
            {
            // InternalDsl.g:842:2: ( ( rule__MappingExpression__Alternatives ) )
            // InternalDsl.g:843:3: ( rule__MappingExpression__Alternatives )
            {
             before(grammarAccess.getMappingExpressionAccess().getAlternatives()); 
            // InternalDsl.g:844:3: ( rule__MappingExpression__Alternatives )
            // InternalDsl.g:844:4: rule__MappingExpression__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__MappingExpression__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getMappingExpressionAccess().getAlternatives()); 

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


    // $ANTLR start "entryRuleAndMapping"
    // InternalDsl.g:853:1: entryRuleAndMapping : ruleAndMapping EOF ;
    public final void entryRuleAndMapping() throws RecognitionException {
        try {
            // InternalDsl.g:854:1: ( ruleAndMapping EOF )
            // InternalDsl.g:855:1: ruleAndMapping EOF
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
    // InternalDsl.g:862:1: ruleAndMapping : ( ( rule__AndMapping__Group__0 ) ) ;
    public final void ruleAndMapping() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:866:2: ( ( ( rule__AndMapping__Group__0 ) ) )
            // InternalDsl.g:867:2: ( ( rule__AndMapping__Group__0 ) )
            {
            // InternalDsl.g:867:2: ( ( rule__AndMapping__Group__0 ) )
            // InternalDsl.g:868:3: ( rule__AndMapping__Group__0 )
            {
             before(grammarAccess.getAndMappingAccess().getGroup()); 
            // InternalDsl.g:869:3: ( rule__AndMapping__Group__0 )
            // InternalDsl.g:869:4: rule__AndMapping__Group__0
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


    // $ANTLR start "entryRuleOrMapping"
    // InternalDsl.g:878:1: entryRuleOrMapping : ruleOrMapping EOF ;
    public final void entryRuleOrMapping() throws RecognitionException {
        try {
            // InternalDsl.g:879:1: ( ruleOrMapping EOF )
            // InternalDsl.g:880:1: ruleOrMapping EOF
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
    // InternalDsl.g:887:1: ruleOrMapping : ( ( rule__OrMapping__Group__0 ) ) ;
    public final void ruleOrMapping() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:891:2: ( ( ( rule__OrMapping__Group__0 ) ) )
            // InternalDsl.g:892:2: ( ( rule__OrMapping__Group__0 ) )
            {
            // InternalDsl.g:892:2: ( ( rule__OrMapping__Group__0 ) )
            // InternalDsl.g:893:3: ( rule__OrMapping__Group__0 )
            {
             before(grammarAccess.getOrMappingAccess().getGroup()); 
            // InternalDsl.g:894:3: ( rule__OrMapping__Group__0 )
            // InternalDsl.g:894:4: rule__OrMapping__Group__0
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


    // $ANTLR start "rule__AbstractRule__Alternatives"
    // InternalDsl.g:927:1: rule__AbstractRule__Alternatives : ( ( ruleAndRule ) | ( ruleRelationNameRule ) | ( ruleOrRule ) | ( ruleNotRule ) | ( ruleImplicationRule ) | ( ruleSourceTypeRule ) | ( ruleTargetTypeRule ) | ( ruleCommandNameRule ) | ( ruleShapeTypeRule ) | ( ruleParentTypeRule ) | ( ruleStepInRule ) | ( ruleTrueRule ) | ( ruleFalseRule ) | ( ruleShapeNameRule ) | ( ruleRelationIsCyclicRule ) | ( ruleRelationIsReflexivRule ) | ( ruleRelationTypesAreEqualRule ) | ( ruleTypeExistsRule ) );
    public final void rule__AbstractRule__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:931:1: ( ( ruleAndRule ) | ( ruleRelationNameRule ) | ( ruleOrRule ) | ( ruleNotRule ) | ( ruleImplicationRule ) | ( ruleSourceTypeRule ) | ( ruleTargetTypeRule ) | ( ruleCommandNameRule ) | ( ruleShapeTypeRule ) | ( ruleParentTypeRule ) | ( ruleStepInRule ) | ( ruleTrueRule ) | ( ruleFalseRule ) | ( ruleShapeNameRule ) | ( ruleRelationIsCyclicRule ) | ( ruleRelationIsReflexivRule ) | ( ruleRelationTypesAreEqualRule ) | ( ruleTypeExistsRule ) )
            int alt1=18;
            switch ( input.LA(1) ) {
            case 34:
                {
                alt1=1;
                }
                break;
            case 35:
                {
                alt1=2;
                }
                break;
            case 37:
                {
                alt1=3;
                }
                break;
            case 38:
                {
                alt1=4;
                }
                break;
            case 39:
                {
                alt1=5;
                }
                break;
            case 40:
                {
                alt1=6;
                }
                break;
            case 41:
                {
                alt1=7;
                }
                break;
            case 42:
                {
                alt1=8;
                }
                break;
            case 43:
                {
                alt1=9;
                }
                break;
            case 44:
                {
                alt1=10;
                }
                break;
            case 45:
                {
                alt1=11;
                }
                break;
            case 46:
                {
                alt1=12;
                }
                break;
            case 47:
                {
                alt1=13;
                }
                break;
            case 48:
                {
                alt1=14;
                }
                break;
            case 31:
                {
                alt1=15;
                }
                break;
            case 33:
                {
                alt1=16;
                }
                break;
            case 32:
                {
                alt1=17;
                }
                break;
            case 36:
                {
                alt1=18;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalDsl.g:932:2: ( ruleAndRule )
                    {
                    // InternalDsl.g:932:2: ( ruleAndRule )
                    // InternalDsl.g:933:3: ruleAndRule
                    {
                     before(grammarAccess.getAbstractRuleAccess().getAndRuleParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleAndRule();

                    state._fsp--;

                     after(grammarAccess.getAbstractRuleAccess().getAndRuleParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:938:2: ( ruleRelationNameRule )
                    {
                    // InternalDsl.g:938:2: ( ruleRelationNameRule )
                    // InternalDsl.g:939:3: ruleRelationNameRule
                    {
                     before(grammarAccess.getAbstractRuleAccess().getRelationNameRuleParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleRelationNameRule();

                    state._fsp--;

                     after(grammarAccess.getAbstractRuleAccess().getRelationNameRuleParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDsl.g:944:2: ( ruleOrRule )
                    {
                    // InternalDsl.g:944:2: ( ruleOrRule )
                    // InternalDsl.g:945:3: ruleOrRule
                    {
                     before(grammarAccess.getAbstractRuleAccess().getOrRuleParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleOrRule();

                    state._fsp--;

                     after(grammarAccess.getAbstractRuleAccess().getOrRuleParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalDsl.g:950:2: ( ruleNotRule )
                    {
                    // InternalDsl.g:950:2: ( ruleNotRule )
                    // InternalDsl.g:951:3: ruleNotRule
                    {
                     before(grammarAccess.getAbstractRuleAccess().getNotRuleParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleNotRule();

                    state._fsp--;

                     after(grammarAccess.getAbstractRuleAccess().getNotRuleParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalDsl.g:956:2: ( ruleImplicationRule )
                    {
                    // InternalDsl.g:956:2: ( ruleImplicationRule )
                    // InternalDsl.g:957:3: ruleImplicationRule
                    {
                     before(grammarAccess.getAbstractRuleAccess().getImplicationRuleParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleImplicationRule();

                    state._fsp--;

                     after(grammarAccess.getAbstractRuleAccess().getImplicationRuleParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalDsl.g:962:2: ( ruleSourceTypeRule )
                    {
                    // InternalDsl.g:962:2: ( ruleSourceTypeRule )
                    // InternalDsl.g:963:3: ruleSourceTypeRule
                    {
                     before(grammarAccess.getAbstractRuleAccess().getSourceTypeRuleParserRuleCall_5()); 
                    pushFollow(FOLLOW_2);
                    ruleSourceTypeRule();

                    state._fsp--;

                     after(grammarAccess.getAbstractRuleAccess().getSourceTypeRuleParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalDsl.g:968:2: ( ruleTargetTypeRule )
                    {
                    // InternalDsl.g:968:2: ( ruleTargetTypeRule )
                    // InternalDsl.g:969:3: ruleTargetTypeRule
                    {
                     before(grammarAccess.getAbstractRuleAccess().getTargetTypeRuleParserRuleCall_6()); 
                    pushFollow(FOLLOW_2);
                    ruleTargetTypeRule();

                    state._fsp--;

                     after(grammarAccess.getAbstractRuleAccess().getTargetTypeRuleParserRuleCall_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalDsl.g:974:2: ( ruleCommandNameRule )
                    {
                    // InternalDsl.g:974:2: ( ruleCommandNameRule )
                    // InternalDsl.g:975:3: ruleCommandNameRule
                    {
                     before(grammarAccess.getAbstractRuleAccess().getCommandNameRuleParserRuleCall_7()); 
                    pushFollow(FOLLOW_2);
                    ruleCommandNameRule();

                    state._fsp--;

                     after(grammarAccess.getAbstractRuleAccess().getCommandNameRuleParserRuleCall_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalDsl.g:980:2: ( ruleShapeTypeRule )
                    {
                    // InternalDsl.g:980:2: ( ruleShapeTypeRule )
                    // InternalDsl.g:981:3: ruleShapeTypeRule
                    {
                     before(grammarAccess.getAbstractRuleAccess().getShapeTypeRuleParserRuleCall_8()); 
                    pushFollow(FOLLOW_2);
                    ruleShapeTypeRule();

                    state._fsp--;

                     after(grammarAccess.getAbstractRuleAccess().getShapeTypeRuleParserRuleCall_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalDsl.g:986:2: ( ruleParentTypeRule )
                    {
                    // InternalDsl.g:986:2: ( ruleParentTypeRule )
                    // InternalDsl.g:987:3: ruleParentTypeRule
                    {
                     before(grammarAccess.getAbstractRuleAccess().getParentTypeRuleParserRuleCall_9()); 
                    pushFollow(FOLLOW_2);
                    ruleParentTypeRule();

                    state._fsp--;

                     after(grammarAccess.getAbstractRuleAccess().getParentTypeRuleParserRuleCall_9()); 

                    }


                    }
                    break;
                case 11 :
                    // InternalDsl.g:992:2: ( ruleStepInRule )
                    {
                    // InternalDsl.g:992:2: ( ruleStepInRule )
                    // InternalDsl.g:993:3: ruleStepInRule
                    {
                     before(grammarAccess.getAbstractRuleAccess().getStepInRuleParserRuleCall_10()); 
                    pushFollow(FOLLOW_2);
                    ruleStepInRule();

                    state._fsp--;

                     after(grammarAccess.getAbstractRuleAccess().getStepInRuleParserRuleCall_10()); 

                    }


                    }
                    break;
                case 12 :
                    // InternalDsl.g:998:2: ( ruleTrueRule )
                    {
                    // InternalDsl.g:998:2: ( ruleTrueRule )
                    // InternalDsl.g:999:3: ruleTrueRule
                    {
                     before(grammarAccess.getAbstractRuleAccess().getTrueRuleParserRuleCall_11()); 
                    pushFollow(FOLLOW_2);
                    ruleTrueRule();

                    state._fsp--;

                     after(grammarAccess.getAbstractRuleAccess().getTrueRuleParserRuleCall_11()); 

                    }


                    }
                    break;
                case 13 :
                    // InternalDsl.g:1004:2: ( ruleFalseRule )
                    {
                    // InternalDsl.g:1004:2: ( ruleFalseRule )
                    // InternalDsl.g:1005:3: ruleFalseRule
                    {
                     before(grammarAccess.getAbstractRuleAccess().getFalseRuleParserRuleCall_12()); 
                    pushFollow(FOLLOW_2);
                    ruleFalseRule();

                    state._fsp--;

                     after(grammarAccess.getAbstractRuleAccess().getFalseRuleParserRuleCall_12()); 

                    }


                    }
                    break;
                case 14 :
                    // InternalDsl.g:1010:2: ( ruleShapeNameRule )
                    {
                    // InternalDsl.g:1010:2: ( ruleShapeNameRule )
                    // InternalDsl.g:1011:3: ruleShapeNameRule
                    {
                     before(grammarAccess.getAbstractRuleAccess().getShapeNameRuleParserRuleCall_13()); 
                    pushFollow(FOLLOW_2);
                    ruleShapeNameRule();

                    state._fsp--;

                     after(grammarAccess.getAbstractRuleAccess().getShapeNameRuleParserRuleCall_13()); 

                    }


                    }
                    break;
                case 15 :
                    // InternalDsl.g:1016:2: ( ruleRelationIsCyclicRule )
                    {
                    // InternalDsl.g:1016:2: ( ruleRelationIsCyclicRule )
                    // InternalDsl.g:1017:3: ruleRelationIsCyclicRule
                    {
                     before(grammarAccess.getAbstractRuleAccess().getRelationIsCyclicRuleParserRuleCall_14()); 
                    pushFollow(FOLLOW_2);
                    ruleRelationIsCyclicRule();

                    state._fsp--;

                     after(grammarAccess.getAbstractRuleAccess().getRelationIsCyclicRuleParserRuleCall_14()); 

                    }


                    }
                    break;
                case 16 :
                    // InternalDsl.g:1022:2: ( ruleRelationIsReflexivRule )
                    {
                    // InternalDsl.g:1022:2: ( ruleRelationIsReflexivRule )
                    // InternalDsl.g:1023:3: ruleRelationIsReflexivRule
                    {
                     before(grammarAccess.getAbstractRuleAccess().getRelationIsReflexivRuleParserRuleCall_15()); 
                    pushFollow(FOLLOW_2);
                    ruleRelationIsReflexivRule();

                    state._fsp--;

                     after(grammarAccess.getAbstractRuleAccess().getRelationIsReflexivRuleParserRuleCall_15()); 

                    }


                    }
                    break;
                case 17 :
                    // InternalDsl.g:1028:2: ( ruleRelationTypesAreEqualRule )
                    {
                    // InternalDsl.g:1028:2: ( ruleRelationTypesAreEqualRule )
                    // InternalDsl.g:1029:3: ruleRelationTypesAreEqualRule
                    {
                     before(grammarAccess.getAbstractRuleAccess().getRelationTypesAreEqualRuleParserRuleCall_16()); 
                    pushFollow(FOLLOW_2);
                    ruleRelationTypesAreEqualRule();

                    state._fsp--;

                     after(grammarAccess.getAbstractRuleAccess().getRelationTypesAreEqualRuleParserRuleCall_16()); 

                    }


                    }
                    break;
                case 18 :
                    // InternalDsl.g:1034:2: ( ruleTypeExistsRule )
                    {
                    // InternalDsl.g:1034:2: ( ruleTypeExistsRule )
                    // InternalDsl.g:1035:3: ruleTypeExistsRule
                    {
                     before(grammarAccess.getAbstractRuleAccess().getTypeExistsRuleParserRuleCall_17()); 
                    pushFollow(FOLLOW_2);
                    ruleTypeExistsRule();

                    state._fsp--;

                     after(grammarAccess.getAbstractRuleAccess().getTypeExistsRuleParserRuleCall_17()); 

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
    // $ANTLR end "rule__AbstractRule__Alternatives"


    // $ANTLR start "rule__AbstractMappingRule__Alternatives"
    // InternalDsl.g:1044:1: rule__AbstractMappingRule__Alternatives : ( ( ruleFeatureNameMappingRule ) | ( ruleAndMappingRule ) | ( ruleNotMappingRule ) | ( ruleOrMappingRule ) | ( ruleImplicationMappingRule ) | ( ruleTrueMappingRule ) );
    public final void rule__AbstractMappingRule__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1048:1: ( ( ruleFeatureNameMappingRule ) | ( ruleAndMappingRule ) | ( ruleNotMappingRule ) | ( ruleOrMappingRule ) | ( ruleImplicationMappingRule ) | ( ruleTrueMappingRule ) )
            int alt2=6;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt2=1;
                }
                break;
            case 24:
                {
                alt2=2;
                }
                break;
            case 25:
                {
                alt2=3;
                }
                break;
            case 26:
                {
                alt2=4;
                }
                break;
            case 27:
                {
                alt2=5;
                }
                break;
            case 30:
                {
                alt2=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalDsl.g:1049:2: ( ruleFeatureNameMappingRule )
                    {
                    // InternalDsl.g:1049:2: ( ruleFeatureNameMappingRule )
                    // InternalDsl.g:1050:3: ruleFeatureNameMappingRule
                    {
                     before(grammarAccess.getAbstractMappingRuleAccess().getFeatureNameMappingRuleParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleFeatureNameMappingRule();

                    state._fsp--;

                     after(grammarAccess.getAbstractMappingRuleAccess().getFeatureNameMappingRuleParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:1055:2: ( ruleAndMappingRule )
                    {
                    // InternalDsl.g:1055:2: ( ruleAndMappingRule )
                    // InternalDsl.g:1056:3: ruleAndMappingRule
                    {
                     before(grammarAccess.getAbstractMappingRuleAccess().getAndMappingRuleParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleAndMappingRule();

                    state._fsp--;

                     after(grammarAccess.getAbstractMappingRuleAccess().getAndMappingRuleParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDsl.g:1061:2: ( ruleNotMappingRule )
                    {
                    // InternalDsl.g:1061:2: ( ruleNotMappingRule )
                    // InternalDsl.g:1062:3: ruleNotMappingRule
                    {
                     before(grammarAccess.getAbstractMappingRuleAccess().getNotMappingRuleParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleNotMappingRule();

                    state._fsp--;

                     after(grammarAccess.getAbstractMappingRuleAccess().getNotMappingRuleParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalDsl.g:1067:2: ( ruleOrMappingRule )
                    {
                    // InternalDsl.g:1067:2: ( ruleOrMappingRule )
                    // InternalDsl.g:1068:3: ruleOrMappingRule
                    {
                     before(grammarAccess.getAbstractMappingRuleAccess().getOrMappingRuleParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleOrMappingRule();

                    state._fsp--;

                     after(grammarAccess.getAbstractMappingRuleAccess().getOrMappingRuleParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalDsl.g:1073:2: ( ruleImplicationMappingRule )
                    {
                    // InternalDsl.g:1073:2: ( ruleImplicationMappingRule )
                    // InternalDsl.g:1074:3: ruleImplicationMappingRule
                    {
                     before(grammarAccess.getAbstractMappingRuleAccess().getImplicationMappingRuleParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleImplicationMappingRule();

                    state._fsp--;

                     after(grammarAccess.getAbstractMappingRuleAccess().getImplicationMappingRuleParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalDsl.g:1079:2: ( ruleTrueMappingRule )
                    {
                    // InternalDsl.g:1079:2: ( ruleTrueMappingRule )
                    // InternalDsl.g:1080:3: ruleTrueMappingRule
                    {
                     before(grammarAccess.getAbstractMappingRuleAccess().getTrueMappingRuleParserRuleCall_5()); 
                    pushFollow(FOLLOW_2);
                    ruleTrueMappingRule();

                    state._fsp--;

                     after(grammarAccess.getAbstractMappingRuleAccess().getTrueMappingRuleParserRuleCall_5()); 

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
    // $ANTLR end "rule__AbstractMappingRule__Alternatives"


    // $ANTLR start "rule__Mapping__RuleAlternatives_3_0"
    // InternalDsl.g:1089:1: rule__Mapping__RuleAlternatives_3_0 : ( ( ruleAbstractMappingRule ) | ( ruleMappingExpression ) );
    public final void rule__Mapping__RuleAlternatives_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1093:1: ( ( ruleAbstractMappingRule ) | ( ruleMappingExpression ) )
            int alt3=2;
            alt3 = dfa3.predict(input);
            switch (alt3) {
                case 1 :
                    // InternalDsl.g:1094:2: ( ruleAbstractMappingRule )
                    {
                    // InternalDsl.g:1094:2: ( ruleAbstractMappingRule )
                    // InternalDsl.g:1095:3: ruleAbstractMappingRule
                    {
                     before(grammarAccess.getMappingAccess().getRuleAbstractMappingRuleParserRuleCall_3_0_0()); 
                    pushFollow(FOLLOW_2);
                    ruleAbstractMappingRule();

                    state._fsp--;

                     after(grammarAccess.getMappingAccess().getRuleAbstractMappingRuleParserRuleCall_3_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:1100:2: ( ruleMappingExpression )
                    {
                    // InternalDsl.g:1100:2: ( ruleMappingExpression )
                    // InternalDsl.g:1101:3: ruleMappingExpression
                    {
                     before(grammarAccess.getMappingAccess().getRuleMappingExpressionParserRuleCall_3_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleMappingExpression();

                    state._fsp--;

                     after(grammarAccess.getMappingAccess().getRuleMappingExpressionParserRuleCall_3_0_1()); 

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
    // $ANTLR end "rule__Mapping__RuleAlternatives_3_0"


    // $ANTLR start "rule__EString__Alternatives"
    // InternalDsl.g:1110:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1114:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_STRING) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_ID) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalDsl.g:1115:2: ( RULE_STRING )
                    {
                    // InternalDsl.g:1115:2: ( RULE_STRING )
                    // InternalDsl.g:1116:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:1121:2: ( RULE_ID )
                    {
                    // InternalDsl.g:1121:2: ( RULE_ID )
                    // InternalDsl.g:1122:3: RULE_ID
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


    // $ANTLR start "rule__MappingExpression__Alternatives"
    // InternalDsl.g:1131:1: rule__MappingExpression__Alternatives : ( ( ruleAndMapping ) | ( ( rule__MappingExpression__Group_1__0 ) ) );
    public final void rule__MappingExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1135:1: ( ( ruleAndMapping ) | ( ( rule__MappingExpression__Group_1__0 ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==23||LA5_0==30||LA5_0==51) ) {
                alt5=1;
            }
            else if ( (LA5_0==25) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalDsl.g:1136:2: ( ruleAndMapping )
                    {
                    // InternalDsl.g:1136:2: ( ruleAndMapping )
                    // InternalDsl.g:1137:3: ruleAndMapping
                    {
                     before(grammarAccess.getMappingExpressionAccess().getAndMappingParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleAndMapping();

                    state._fsp--;

                     after(grammarAccess.getMappingExpressionAccess().getAndMappingParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:1142:2: ( ( rule__MappingExpression__Group_1__0 ) )
                    {
                    // InternalDsl.g:1142:2: ( ( rule__MappingExpression__Group_1__0 ) )
                    // InternalDsl.g:1143:3: ( rule__MappingExpression__Group_1__0 )
                    {
                     before(grammarAccess.getMappingExpressionAccess().getGroup_1()); 
                    // InternalDsl.g:1144:3: ( rule__MappingExpression__Group_1__0 )
                    // InternalDsl.g:1144:4: rule__MappingExpression__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MappingExpression__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getMappingExpressionAccess().getGroup_1()); 

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
    // $ANTLR end "rule__MappingExpression__Alternatives"


    // $ANTLR start "rule__Primary__Alternatives"
    // InternalDsl.g:1152:1: rule__Primary__Alternatives : ( ( ruleTrueMappingRule ) | ( ruleFeatureNameMappingRule ) | ( ( rule__Primary__Group_2__0 ) ) );
    public final void rule__Primary__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1156:1: ( ( ruleTrueMappingRule ) | ( ruleFeatureNameMappingRule ) | ( ( rule__Primary__Group_2__0 ) ) )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt6=1;
                }
                break;
            case 23:
                {
                alt6=2;
                }
                break;
            case 51:
                {
                alt6=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalDsl.g:1157:2: ( ruleTrueMappingRule )
                    {
                    // InternalDsl.g:1157:2: ( ruleTrueMappingRule )
                    // InternalDsl.g:1158:3: ruleTrueMappingRule
                    {
                     before(grammarAccess.getPrimaryAccess().getTrueMappingRuleParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleTrueMappingRule();

                    state._fsp--;

                     after(grammarAccess.getPrimaryAccess().getTrueMappingRuleParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:1163:2: ( ruleFeatureNameMappingRule )
                    {
                    // InternalDsl.g:1163:2: ( ruleFeatureNameMappingRule )
                    // InternalDsl.g:1164:3: ruleFeatureNameMappingRule
                    {
                     before(grammarAccess.getPrimaryAccess().getFeatureNameMappingRuleParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleFeatureNameMappingRule();

                    state._fsp--;

                     after(grammarAccess.getPrimaryAccess().getFeatureNameMappingRuleParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDsl.g:1169:2: ( ( rule__Primary__Group_2__0 ) )
                    {
                    // InternalDsl.g:1169:2: ( ( rule__Primary__Group_2__0 ) )
                    // InternalDsl.g:1170:3: ( rule__Primary__Group_2__0 )
                    {
                     before(grammarAccess.getPrimaryAccess().getGroup_2()); 
                    // InternalDsl.g:1171:3: ( rule__Primary__Group_2__0 )
                    // InternalDsl.g:1171:4: rule__Primary__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Primary__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrimaryAccess().getGroup_2()); 

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
    // InternalDsl.g:1179:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1183:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // InternalDsl.g:1184:2: rule__Model__Group__0__Impl rule__Model__Group__1
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
    // InternalDsl.g:1191:1: rule__Model__Group__0__Impl : ( 'Model' ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1195:1: ( ( 'Model' ) )
            // InternalDsl.g:1196:1: ( 'Model' )
            {
            // InternalDsl.g:1196:1: ( 'Model' )
            // InternalDsl.g:1197:2: 'Model'
            {
             before(grammarAccess.getModelAccess().getModelKeyword_0()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getModelKeyword_0()); 

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
    // InternalDsl.g:1206:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1210:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // InternalDsl.g:1211:2: rule__Model__Group__1__Impl rule__Model__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Model__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__2();

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
    // InternalDsl.g:1218:1: rule__Model__Group__1__Impl : ( '{' ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1222:1: ( ( '{' ) )
            // InternalDsl.g:1223:1: ( '{' )
            {
            // InternalDsl.g:1223:1: ( '{' )
            // InternalDsl.g:1224:2: '{'
            {
             before(grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_1()); 

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


    // $ANTLR start "rule__Model__Group__2"
    // InternalDsl.g:1233:1: rule__Model__Group__2 : rule__Model__Group__2__Impl rule__Model__Group__3 ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1237:1: ( rule__Model__Group__2__Impl rule__Model__Group__3 )
            // InternalDsl.g:1238:2: rule__Model__Group__2__Impl rule__Model__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Model__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__3();

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
    // $ANTLR end "rule__Model__Group__2"


    // $ANTLR start "rule__Model__Group__2__Impl"
    // InternalDsl.g:1245:1: rule__Model__Group__2__Impl : ( 'configuration' ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1249:1: ( ( 'configuration' ) )
            // InternalDsl.g:1250:1: ( 'configuration' )
            {
            // InternalDsl.g:1250:1: ( 'configuration' )
            // InternalDsl.g:1251:2: 'configuration'
            {
             before(grammarAccess.getModelAccess().getConfigurationKeyword_2()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getConfigurationKeyword_2()); 

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
    // $ANTLR end "rule__Model__Group__2__Impl"


    // $ANTLR start "rule__Model__Group__3"
    // InternalDsl.g:1260:1: rule__Model__Group__3 : rule__Model__Group__3__Impl rule__Model__Group__4 ;
    public final void rule__Model__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1264:1: ( rule__Model__Group__3__Impl rule__Model__Group__4 )
            // InternalDsl.g:1265:2: rule__Model__Group__3__Impl rule__Model__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__Model__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__4();

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
    // $ANTLR end "rule__Model__Group__3"


    // $ANTLR start "rule__Model__Group__3__Impl"
    // InternalDsl.g:1272:1: rule__Model__Group__3__Impl : ( ( rule__Model__ConfigurationAssignment_3 ) ) ;
    public final void rule__Model__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1276:1: ( ( ( rule__Model__ConfigurationAssignment_3 ) ) )
            // InternalDsl.g:1277:1: ( ( rule__Model__ConfigurationAssignment_3 ) )
            {
            // InternalDsl.g:1277:1: ( ( rule__Model__ConfigurationAssignment_3 ) )
            // InternalDsl.g:1278:2: ( rule__Model__ConfigurationAssignment_3 )
            {
             before(grammarAccess.getModelAccess().getConfigurationAssignment_3()); 
            // InternalDsl.g:1279:2: ( rule__Model__ConfigurationAssignment_3 )
            // InternalDsl.g:1279:3: rule__Model__ConfigurationAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Model__ConfigurationAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getConfigurationAssignment_3()); 

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
    // $ANTLR end "rule__Model__Group__3__Impl"


    // $ANTLR start "rule__Model__Group__4"
    // InternalDsl.g:1287:1: rule__Model__Group__4 : rule__Model__Group__4__Impl rule__Model__Group__5 ;
    public final void rule__Model__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1291:1: ( rule__Model__Group__4__Impl rule__Model__Group__5 )
            // InternalDsl.g:1292:2: rule__Model__Group__4__Impl rule__Model__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__Model__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__5();

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
    // $ANTLR end "rule__Model__Group__4"


    // $ANTLR start "rule__Model__Group__4__Impl"
    // InternalDsl.g:1299:1: rule__Model__Group__4__Impl : ( ( rule__Model__Group_4__0 )? ) ;
    public final void rule__Model__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1303:1: ( ( ( rule__Model__Group_4__0 )? ) )
            // InternalDsl.g:1304:1: ( ( rule__Model__Group_4__0 )? )
            {
            // InternalDsl.g:1304:1: ( ( rule__Model__Group_4__0 )? )
            // InternalDsl.g:1305:2: ( rule__Model__Group_4__0 )?
            {
             before(grammarAccess.getModelAccess().getGroup_4()); 
            // InternalDsl.g:1306:2: ( rule__Model__Group_4__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==15) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalDsl.g:1306:3: rule__Model__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Model__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getModelAccess().getGroup_4()); 

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
    // $ANTLR end "rule__Model__Group__4__Impl"


    // $ANTLR start "rule__Model__Group__5"
    // InternalDsl.g:1314:1: rule__Model__Group__5 : rule__Model__Group__5__Impl ;
    public final void rule__Model__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1318:1: ( rule__Model__Group__5__Impl )
            // InternalDsl.g:1319:2: rule__Model__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__5__Impl();

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
    // $ANTLR end "rule__Model__Group__5"


    // $ANTLR start "rule__Model__Group__5__Impl"
    // InternalDsl.g:1325:1: rule__Model__Group__5__Impl : ( '}' ) ;
    public final void rule__Model__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1329:1: ( ( '}' ) )
            // InternalDsl.g:1330:1: ( '}' )
            {
            // InternalDsl.g:1330:1: ( '}' )
            // InternalDsl.g:1331:2: '}'
            {
             before(grammarAccess.getModelAccess().getRightCurlyBracketKeyword_5()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getRightCurlyBracketKeyword_5()); 

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
    // $ANTLR end "rule__Model__Group__5__Impl"


    // $ANTLR start "rule__Model__Group_4__0"
    // InternalDsl.g:1341:1: rule__Model__Group_4__0 : rule__Model__Group_4__0__Impl rule__Model__Group_4__1 ;
    public final void rule__Model__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1345:1: ( rule__Model__Group_4__0__Impl rule__Model__Group_4__1 )
            // InternalDsl.g:1346:2: rule__Model__Group_4__0__Impl rule__Model__Group_4__1
            {
            pushFollow(FOLLOW_3);
            rule__Model__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group_4__1();

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
    // $ANTLR end "rule__Model__Group_4__0"


    // $ANTLR start "rule__Model__Group_4__0__Impl"
    // InternalDsl.g:1353:1: rule__Model__Group_4__0__Impl : ( 'policies' ) ;
    public final void rule__Model__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1357:1: ( ( 'policies' ) )
            // InternalDsl.g:1358:1: ( 'policies' )
            {
            // InternalDsl.g:1358:1: ( 'policies' )
            // InternalDsl.g:1359:2: 'policies'
            {
             before(grammarAccess.getModelAccess().getPoliciesKeyword_4_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getPoliciesKeyword_4_0()); 

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
    // $ANTLR end "rule__Model__Group_4__0__Impl"


    // $ANTLR start "rule__Model__Group_4__1"
    // InternalDsl.g:1368:1: rule__Model__Group_4__1 : rule__Model__Group_4__1__Impl rule__Model__Group_4__2 ;
    public final void rule__Model__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1372:1: ( rule__Model__Group_4__1__Impl rule__Model__Group_4__2 )
            // InternalDsl.g:1373:2: rule__Model__Group_4__1__Impl rule__Model__Group_4__2
            {
            pushFollow(FOLLOW_7);
            rule__Model__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group_4__2();

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
    // $ANTLR end "rule__Model__Group_4__1"


    // $ANTLR start "rule__Model__Group_4__1__Impl"
    // InternalDsl.g:1380:1: rule__Model__Group_4__1__Impl : ( '{' ) ;
    public final void rule__Model__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1384:1: ( ( '{' ) )
            // InternalDsl.g:1385:1: ( '{' )
            {
            // InternalDsl.g:1385:1: ( '{' )
            // InternalDsl.g:1386:2: '{'
            {
             before(grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_4_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_4_1()); 

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
    // $ANTLR end "rule__Model__Group_4__1__Impl"


    // $ANTLR start "rule__Model__Group_4__2"
    // InternalDsl.g:1395:1: rule__Model__Group_4__2 : rule__Model__Group_4__2__Impl rule__Model__Group_4__3 ;
    public final void rule__Model__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1399:1: ( rule__Model__Group_4__2__Impl rule__Model__Group_4__3 )
            // InternalDsl.g:1400:2: rule__Model__Group_4__2__Impl rule__Model__Group_4__3
            {
            pushFollow(FOLLOW_8);
            rule__Model__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group_4__3();

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
    // $ANTLR end "rule__Model__Group_4__2"


    // $ANTLR start "rule__Model__Group_4__2__Impl"
    // InternalDsl.g:1407:1: rule__Model__Group_4__2__Impl : ( ( rule__Model__PoliciesAssignment_4_2 ) ) ;
    public final void rule__Model__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1411:1: ( ( ( rule__Model__PoliciesAssignment_4_2 ) ) )
            // InternalDsl.g:1412:1: ( ( rule__Model__PoliciesAssignment_4_2 ) )
            {
            // InternalDsl.g:1412:1: ( ( rule__Model__PoliciesAssignment_4_2 ) )
            // InternalDsl.g:1413:2: ( rule__Model__PoliciesAssignment_4_2 )
            {
             before(grammarAccess.getModelAccess().getPoliciesAssignment_4_2()); 
            // InternalDsl.g:1414:2: ( rule__Model__PoliciesAssignment_4_2 )
            // InternalDsl.g:1414:3: rule__Model__PoliciesAssignment_4_2
            {
            pushFollow(FOLLOW_2);
            rule__Model__PoliciesAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getPoliciesAssignment_4_2()); 

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
    // $ANTLR end "rule__Model__Group_4__2__Impl"


    // $ANTLR start "rule__Model__Group_4__3"
    // InternalDsl.g:1422:1: rule__Model__Group_4__3 : rule__Model__Group_4__3__Impl rule__Model__Group_4__4 ;
    public final void rule__Model__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1426:1: ( rule__Model__Group_4__3__Impl rule__Model__Group_4__4 )
            // InternalDsl.g:1427:2: rule__Model__Group_4__3__Impl rule__Model__Group_4__4
            {
            pushFollow(FOLLOW_8);
            rule__Model__Group_4__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group_4__4();

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
    // $ANTLR end "rule__Model__Group_4__3"


    // $ANTLR start "rule__Model__Group_4__3__Impl"
    // InternalDsl.g:1434:1: rule__Model__Group_4__3__Impl : ( ( rule__Model__Group_4_3__0 )* ) ;
    public final void rule__Model__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1438:1: ( ( ( rule__Model__Group_4_3__0 )* ) )
            // InternalDsl.g:1439:1: ( ( rule__Model__Group_4_3__0 )* )
            {
            // InternalDsl.g:1439:1: ( ( rule__Model__Group_4_3__0 )* )
            // InternalDsl.g:1440:2: ( rule__Model__Group_4_3__0 )*
            {
             before(grammarAccess.getModelAccess().getGroup_4_3()); 
            // InternalDsl.g:1441:2: ( rule__Model__Group_4_3__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==16) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalDsl.g:1441:3: rule__Model__Group_4_3__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Model__Group_4_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getGroup_4_3()); 

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
    // $ANTLR end "rule__Model__Group_4__3__Impl"


    // $ANTLR start "rule__Model__Group_4__4"
    // InternalDsl.g:1449:1: rule__Model__Group_4__4 : rule__Model__Group_4__4__Impl ;
    public final void rule__Model__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1453:1: ( rule__Model__Group_4__4__Impl )
            // InternalDsl.g:1454:2: rule__Model__Group_4__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group_4__4__Impl();

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
    // $ANTLR end "rule__Model__Group_4__4"


    // $ANTLR start "rule__Model__Group_4__4__Impl"
    // InternalDsl.g:1460:1: rule__Model__Group_4__4__Impl : ( '}' ) ;
    public final void rule__Model__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1464:1: ( ( '}' ) )
            // InternalDsl.g:1465:1: ( '}' )
            {
            // InternalDsl.g:1465:1: ( '}' )
            // InternalDsl.g:1466:2: '}'
            {
             before(grammarAccess.getModelAccess().getRightCurlyBracketKeyword_4_4()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getRightCurlyBracketKeyword_4_4()); 

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
    // $ANTLR end "rule__Model__Group_4__4__Impl"


    // $ANTLR start "rule__Model__Group_4_3__0"
    // InternalDsl.g:1476:1: rule__Model__Group_4_3__0 : rule__Model__Group_4_3__0__Impl rule__Model__Group_4_3__1 ;
    public final void rule__Model__Group_4_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1480:1: ( rule__Model__Group_4_3__0__Impl rule__Model__Group_4_3__1 )
            // InternalDsl.g:1481:2: rule__Model__Group_4_3__0__Impl rule__Model__Group_4_3__1
            {
            pushFollow(FOLLOW_7);
            rule__Model__Group_4_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group_4_3__1();

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
    // $ANTLR end "rule__Model__Group_4_3__0"


    // $ANTLR start "rule__Model__Group_4_3__0__Impl"
    // InternalDsl.g:1488:1: rule__Model__Group_4_3__0__Impl : ( ',' ) ;
    public final void rule__Model__Group_4_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1492:1: ( ( ',' ) )
            // InternalDsl.g:1493:1: ( ',' )
            {
            // InternalDsl.g:1493:1: ( ',' )
            // InternalDsl.g:1494:2: ','
            {
             before(grammarAccess.getModelAccess().getCommaKeyword_4_3_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getCommaKeyword_4_3_0()); 

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
    // $ANTLR end "rule__Model__Group_4_3__0__Impl"


    // $ANTLR start "rule__Model__Group_4_3__1"
    // InternalDsl.g:1503:1: rule__Model__Group_4_3__1 : rule__Model__Group_4_3__1__Impl ;
    public final void rule__Model__Group_4_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1507:1: ( rule__Model__Group_4_3__1__Impl )
            // InternalDsl.g:1508:2: rule__Model__Group_4_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group_4_3__1__Impl();

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
    // $ANTLR end "rule__Model__Group_4_3__1"


    // $ANTLR start "rule__Model__Group_4_3__1__Impl"
    // InternalDsl.g:1514:1: rule__Model__Group_4_3__1__Impl : ( ( rule__Model__PoliciesAssignment_4_3_1 ) ) ;
    public final void rule__Model__Group_4_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1518:1: ( ( ( rule__Model__PoliciesAssignment_4_3_1 ) ) )
            // InternalDsl.g:1519:1: ( ( rule__Model__PoliciesAssignment_4_3_1 ) )
            {
            // InternalDsl.g:1519:1: ( ( rule__Model__PoliciesAssignment_4_3_1 ) )
            // InternalDsl.g:1520:2: ( rule__Model__PoliciesAssignment_4_3_1 )
            {
             before(grammarAccess.getModelAccess().getPoliciesAssignment_4_3_1()); 
            // InternalDsl.g:1521:2: ( rule__Model__PoliciesAssignment_4_3_1 )
            // InternalDsl.g:1521:3: rule__Model__PoliciesAssignment_4_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Model__PoliciesAssignment_4_3_1();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getPoliciesAssignment_4_3_1()); 

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
    // $ANTLR end "rule__Model__Group_4_3__1__Impl"


    // $ANTLR start "rule__Configuration__Group__0"
    // InternalDsl.g:1530:1: rule__Configuration__Group__0 : rule__Configuration__Group__0__Impl rule__Configuration__Group__1 ;
    public final void rule__Configuration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1534:1: ( rule__Configuration__Group__0__Impl rule__Configuration__Group__1 )
            // InternalDsl.g:1535:2: rule__Configuration__Group__0__Impl rule__Configuration__Group__1
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
    // InternalDsl.g:1542:1: rule__Configuration__Group__0__Impl : ( () ) ;
    public final void rule__Configuration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1546:1: ( ( () ) )
            // InternalDsl.g:1547:1: ( () )
            {
            // InternalDsl.g:1547:1: ( () )
            // InternalDsl.g:1548:2: ()
            {
             before(grammarAccess.getConfigurationAccess().getConfigurationAction_0()); 
            // InternalDsl.g:1549:2: ()
            // InternalDsl.g:1549:3: 
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
    // InternalDsl.g:1557:1: rule__Configuration__Group__1 : rule__Configuration__Group__1__Impl rule__Configuration__Group__2 ;
    public final void rule__Configuration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1561:1: ( rule__Configuration__Group__1__Impl rule__Configuration__Group__2 )
            // InternalDsl.g:1562:2: rule__Configuration__Group__1__Impl rule__Configuration__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__Configuration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Configuration__Group__2();

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
    // InternalDsl.g:1569:1: rule__Configuration__Group__1__Impl : ( 'Configuration' ) ;
    public final void rule__Configuration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1573:1: ( ( 'Configuration' ) )
            // InternalDsl.g:1574:1: ( 'Configuration' )
            {
            // InternalDsl.g:1574:1: ( 'Configuration' )
            // InternalDsl.g:1575:2: 'Configuration'
            {
             before(grammarAccess.getConfigurationAccess().getConfigurationKeyword_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getConfigurationAccess().getConfigurationKeyword_1()); 

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


    // $ANTLR start "rule__Configuration__Group__2"
    // InternalDsl.g:1584:1: rule__Configuration__Group__2 : rule__Configuration__Group__2__Impl rule__Configuration__Group__3 ;
    public final void rule__Configuration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1588:1: ( rule__Configuration__Group__2__Impl rule__Configuration__Group__3 )
            // InternalDsl.g:1589:2: rule__Configuration__Group__2__Impl rule__Configuration__Group__3
            {
            pushFollow(FOLLOW_10);
            rule__Configuration__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Configuration__Group__3();

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
    // $ANTLR end "rule__Configuration__Group__2"


    // $ANTLR start "rule__Configuration__Group__2__Impl"
    // InternalDsl.g:1596:1: rule__Configuration__Group__2__Impl : ( '{' ) ;
    public final void rule__Configuration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1600:1: ( ( '{' ) )
            // InternalDsl.g:1601:1: ( '{' )
            {
            // InternalDsl.g:1601:1: ( '{' )
            // InternalDsl.g:1602:2: '{'
            {
             before(grammarAccess.getConfigurationAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getConfigurationAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__Configuration__Group__2__Impl"


    // $ANTLR start "rule__Configuration__Group__3"
    // InternalDsl.g:1611:1: rule__Configuration__Group__3 : rule__Configuration__Group__3__Impl rule__Configuration__Group__4 ;
    public final void rule__Configuration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1615:1: ( rule__Configuration__Group__3__Impl rule__Configuration__Group__4 )
            // InternalDsl.g:1616:2: rule__Configuration__Group__3__Impl rule__Configuration__Group__4
            {
            pushFollow(FOLLOW_10);
            rule__Configuration__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Configuration__Group__4();

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
    // $ANTLR end "rule__Configuration__Group__3"


    // $ANTLR start "rule__Configuration__Group__3__Impl"
    // InternalDsl.g:1623:1: rule__Configuration__Group__3__Impl : ( ( rule__Configuration__Group_3__0 )? ) ;
    public final void rule__Configuration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1627:1: ( ( ( rule__Configuration__Group_3__0 )? ) )
            // InternalDsl.g:1628:1: ( ( rule__Configuration__Group_3__0 )? )
            {
            // InternalDsl.g:1628:1: ( ( rule__Configuration__Group_3__0 )? )
            // InternalDsl.g:1629:2: ( rule__Configuration__Group_3__0 )?
            {
             before(grammarAccess.getConfigurationAccess().getGroup_3()); 
            // InternalDsl.g:1630:2: ( rule__Configuration__Group_3__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==18) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalDsl.g:1630:3: rule__Configuration__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Configuration__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getConfigurationAccess().getGroup_3()); 

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
    // $ANTLR end "rule__Configuration__Group__3__Impl"


    // $ANTLR start "rule__Configuration__Group__4"
    // InternalDsl.g:1638:1: rule__Configuration__Group__4 : rule__Configuration__Group__4__Impl ;
    public final void rule__Configuration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1642:1: ( rule__Configuration__Group__4__Impl )
            // InternalDsl.g:1643:2: rule__Configuration__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Configuration__Group__4__Impl();

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
    // $ANTLR end "rule__Configuration__Group__4"


    // $ANTLR start "rule__Configuration__Group__4__Impl"
    // InternalDsl.g:1649:1: rule__Configuration__Group__4__Impl : ( '}' ) ;
    public final void rule__Configuration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1653:1: ( ( '}' ) )
            // InternalDsl.g:1654:1: ( '}' )
            {
            // InternalDsl.g:1654:1: ( '}' )
            // InternalDsl.g:1655:2: '}'
            {
             before(grammarAccess.getConfigurationAccess().getRightCurlyBracketKeyword_4()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getConfigurationAccess().getRightCurlyBracketKeyword_4()); 

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
    // $ANTLR end "rule__Configuration__Group__4__Impl"


    // $ANTLR start "rule__Configuration__Group_3__0"
    // InternalDsl.g:1665:1: rule__Configuration__Group_3__0 : rule__Configuration__Group_3__0__Impl rule__Configuration__Group_3__1 ;
    public final void rule__Configuration__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1669:1: ( rule__Configuration__Group_3__0__Impl rule__Configuration__Group_3__1 )
            // InternalDsl.g:1670:2: rule__Configuration__Group_3__0__Impl rule__Configuration__Group_3__1
            {
            pushFollow(FOLLOW_3);
            rule__Configuration__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Configuration__Group_3__1();

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
    // $ANTLR end "rule__Configuration__Group_3__0"


    // $ANTLR start "rule__Configuration__Group_3__0__Impl"
    // InternalDsl.g:1677:1: rule__Configuration__Group_3__0__Impl : ( 'mappings' ) ;
    public final void rule__Configuration__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1681:1: ( ( 'mappings' ) )
            // InternalDsl.g:1682:1: ( 'mappings' )
            {
            // InternalDsl.g:1682:1: ( 'mappings' )
            // InternalDsl.g:1683:2: 'mappings'
            {
             before(grammarAccess.getConfigurationAccess().getMappingsKeyword_3_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getConfigurationAccess().getMappingsKeyword_3_0()); 

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
    // $ANTLR end "rule__Configuration__Group_3__0__Impl"


    // $ANTLR start "rule__Configuration__Group_3__1"
    // InternalDsl.g:1692:1: rule__Configuration__Group_3__1 : rule__Configuration__Group_3__1__Impl rule__Configuration__Group_3__2 ;
    public final void rule__Configuration__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1696:1: ( rule__Configuration__Group_3__1__Impl rule__Configuration__Group_3__2 )
            // InternalDsl.g:1697:2: rule__Configuration__Group_3__1__Impl rule__Configuration__Group_3__2
            {
            pushFollow(FOLLOW_11);
            rule__Configuration__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Configuration__Group_3__2();

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
    // $ANTLR end "rule__Configuration__Group_3__1"


    // $ANTLR start "rule__Configuration__Group_3__1__Impl"
    // InternalDsl.g:1704:1: rule__Configuration__Group_3__1__Impl : ( '{' ) ;
    public final void rule__Configuration__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1708:1: ( ( '{' ) )
            // InternalDsl.g:1709:1: ( '{' )
            {
            // InternalDsl.g:1709:1: ( '{' )
            // InternalDsl.g:1710:2: '{'
            {
             before(grammarAccess.getConfigurationAccess().getLeftCurlyBracketKeyword_3_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getConfigurationAccess().getLeftCurlyBracketKeyword_3_1()); 

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
    // $ANTLR end "rule__Configuration__Group_3__1__Impl"


    // $ANTLR start "rule__Configuration__Group_3__2"
    // InternalDsl.g:1719:1: rule__Configuration__Group_3__2 : rule__Configuration__Group_3__2__Impl rule__Configuration__Group_3__3 ;
    public final void rule__Configuration__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1723:1: ( rule__Configuration__Group_3__2__Impl rule__Configuration__Group_3__3 )
            // InternalDsl.g:1724:2: rule__Configuration__Group_3__2__Impl rule__Configuration__Group_3__3
            {
            pushFollow(FOLLOW_8);
            rule__Configuration__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Configuration__Group_3__3();

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
    // $ANTLR end "rule__Configuration__Group_3__2"


    // $ANTLR start "rule__Configuration__Group_3__2__Impl"
    // InternalDsl.g:1731:1: rule__Configuration__Group_3__2__Impl : ( ( rule__Configuration__MappingsAssignment_3_2 ) ) ;
    public final void rule__Configuration__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1735:1: ( ( ( rule__Configuration__MappingsAssignment_3_2 ) ) )
            // InternalDsl.g:1736:1: ( ( rule__Configuration__MappingsAssignment_3_2 ) )
            {
            // InternalDsl.g:1736:1: ( ( rule__Configuration__MappingsAssignment_3_2 ) )
            // InternalDsl.g:1737:2: ( rule__Configuration__MappingsAssignment_3_2 )
            {
             before(grammarAccess.getConfigurationAccess().getMappingsAssignment_3_2()); 
            // InternalDsl.g:1738:2: ( rule__Configuration__MappingsAssignment_3_2 )
            // InternalDsl.g:1738:3: rule__Configuration__MappingsAssignment_3_2
            {
            pushFollow(FOLLOW_2);
            rule__Configuration__MappingsAssignment_3_2();

            state._fsp--;


            }

             after(grammarAccess.getConfigurationAccess().getMappingsAssignment_3_2()); 

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
    // $ANTLR end "rule__Configuration__Group_3__2__Impl"


    // $ANTLR start "rule__Configuration__Group_3__3"
    // InternalDsl.g:1746:1: rule__Configuration__Group_3__3 : rule__Configuration__Group_3__3__Impl rule__Configuration__Group_3__4 ;
    public final void rule__Configuration__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1750:1: ( rule__Configuration__Group_3__3__Impl rule__Configuration__Group_3__4 )
            // InternalDsl.g:1751:2: rule__Configuration__Group_3__3__Impl rule__Configuration__Group_3__4
            {
            pushFollow(FOLLOW_8);
            rule__Configuration__Group_3__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Configuration__Group_3__4();

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
    // $ANTLR end "rule__Configuration__Group_3__3"


    // $ANTLR start "rule__Configuration__Group_3__3__Impl"
    // InternalDsl.g:1758:1: rule__Configuration__Group_3__3__Impl : ( ( rule__Configuration__Group_3_3__0 )* ) ;
    public final void rule__Configuration__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1762:1: ( ( ( rule__Configuration__Group_3_3__0 )* ) )
            // InternalDsl.g:1763:1: ( ( rule__Configuration__Group_3_3__0 )* )
            {
            // InternalDsl.g:1763:1: ( ( rule__Configuration__Group_3_3__0 )* )
            // InternalDsl.g:1764:2: ( rule__Configuration__Group_3_3__0 )*
            {
             before(grammarAccess.getConfigurationAccess().getGroup_3_3()); 
            // InternalDsl.g:1765:2: ( rule__Configuration__Group_3_3__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==16) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalDsl.g:1765:3: rule__Configuration__Group_3_3__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Configuration__Group_3_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getConfigurationAccess().getGroup_3_3()); 

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
    // $ANTLR end "rule__Configuration__Group_3__3__Impl"


    // $ANTLR start "rule__Configuration__Group_3__4"
    // InternalDsl.g:1773:1: rule__Configuration__Group_3__4 : rule__Configuration__Group_3__4__Impl ;
    public final void rule__Configuration__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1777:1: ( rule__Configuration__Group_3__4__Impl )
            // InternalDsl.g:1778:2: rule__Configuration__Group_3__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Configuration__Group_3__4__Impl();

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
    // $ANTLR end "rule__Configuration__Group_3__4"


    // $ANTLR start "rule__Configuration__Group_3__4__Impl"
    // InternalDsl.g:1784:1: rule__Configuration__Group_3__4__Impl : ( '}' ) ;
    public final void rule__Configuration__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1788:1: ( ( '}' ) )
            // InternalDsl.g:1789:1: ( '}' )
            {
            // InternalDsl.g:1789:1: ( '}' )
            // InternalDsl.g:1790:2: '}'
            {
             before(grammarAccess.getConfigurationAccess().getRightCurlyBracketKeyword_3_4()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getConfigurationAccess().getRightCurlyBracketKeyword_3_4()); 

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
    // $ANTLR end "rule__Configuration__Group_3__4__Impl"


    // $ANTLR start "rule__Configuration__Group_3_3__0"
    // InternalDsl.g:1800:1: rule__Configuration__Group_3_3__0 : rule__Configuration__Group_3_3__0__Impl rule__Configuration__Group_3_3__1 ;
    public final void rule__Configuration__Group_3_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1804:1: ( rule__Configuration__Group_3_3__0__Impl rule__Configuration__Group_3_3__1 )
            // InternalDsl.g:1805:2: rule__Configuration__Group_3_3__0__Impl rule__Configuration__Group_3_3__1
            {
            pushFollow(FOLLOW_11);
            rule__Configuration__Group_3_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Configuration__Group_3_3__1();

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
    // $ANTLR end "rule__Configuration__Group_3_3__0"


    // $ANTLR start "rule__Configuration__Group_3_3__0__Impl"
    // InternalDsl.g:1812:1: rule__Configuration__Group_3_3__0__Impl : ( ',' ) ;
    public final void rule__Configuration__Group_3_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1816:1: ( ( ',' ) )
            // InternalDsl.g:1817:1: ( ',' )
            {
            // InternalDsl.g:1817:1: ( ',' )
            // InternalDsl.g:1818:2: ','
            {
             before(grammarAccess.getConfigurationAccess().getCommaKeyword_3_3_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getConfigurationAccess().getCommaKeyword_3_3_0()); 

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
    // $ANTLR end "rule__Configuration__Group_3_3__0__Impl"


    // $ANTLR start "rule__Configuration__Group_3_3__1"
    // InternalDsl.g:1827:1: rule__Configuration__Group_3_3__1 : rule__Configuration__Group_3_3__1__Impl ;
    public final void rule__Configuration__Group_3_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1831:1: ( rule__Configuration__Group_3_3__1__Impl )
            // InternalDsl.g:1832:2: rule__Configuration__Group_3_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Configuration__Group_3_3__1__Impl();

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
    // $ANTLR end "rule__Configuration__Group_3_3__1"


    // $ANTLR start "rule__Configuration__Group_3_3__1__Impl"
    // InternalDsl.g:1838:1: rule__Configuration__Group_3_3__1__Impl : ( ( rule__Configuration__MappingsAssignment_3_3_1 ) ) ;
    public final void rule__Configuration__Group_3_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1842:1: ( ( ( rule__Configuration__MappingsAssignment_3_3_1 ) ) )
            // InternalDsl.g:1843:1: ( ( rule__Configuration__MappingsAssignment_3_3_1 ) )
            {
            // InternalDsl.g:1843:1: ( ( rule__Configuration__MappingsAssignment_3_3_1 ) )
            // InternalDsl.g:1844:2: ( rule__Configuration__MappingsAssignment_3_3_1 )
            {
             before(grammarAccess.getConfigurationAccess().getMappingsAssignment_3_3_1()); 
            // InternalDsl.g:1845:2: ( rule__Configuration__MappingsAssignment_3_3_1 )
            // InternalDsl.g:1845:3: rule__Configuration__MappingsAssignment_3_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Configuration__MappingsAssignment_3_3_1();

            state._fsp--;


            }

             after(grammarAccess.getConfigurationAccess().getMappingsAssignment_3_3_1()); 

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
    // $ANTLR end "rule__Configuration__Group_3_3__1__Impl"


    // $ANTLR start "rule__Policy__Group__0"
    // InternalDsl.g:1854:1: rule__Policy__Group__0 : rule__Policy__Group__0__Impl rule__Policy__Group__1 ;
    public final void rule__Policy__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1858:1: ( rule__Policy__Group__0__Impl rule__Policy__Group__1 )
            // InternalDsl.g:1859:2: rule__Policy__Group__0__Impl rule__Policy__Group__1
            {
            pushFollow(FOLLOW_12);
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
    // InternalDsl.g:1866:1: rule__Policy__Group__0__Impl : ( 'Policy' ) ;
    public final void rule__Policy__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1870:1: ( ( 'Policy' ) )
            // InternalDsl.g:1871:1: ( 'Policy' )
            {
            // InternalDsl.g:1871:1: ( 'Policy' )
            // InternalDsl.g:1872:2: 'Policy'
            {
             before(grammarAccess.getPolicyAccess().getPolicyKeyword_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getPolicyAccess().getPolicyKeyword_0()); 

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
    // InternalDsl.g:1881:1: rule__Policy__Group__1 : rule__Policy__Group__1__Impl rule__Policy__Group__2 ;
    public final void rule__Policy__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1885:1: ( rule__Policy__Group__1__Impl rule__Policy__Group__2 )
            // InternalDsl.g:1886:2: rule__Policy__Group__1__Impl rule__Policy__Group__2
            {
            pushFollow(FOLLOW_3);
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
    // InternalDsl.g:1893:1: rule__Policy__Group__1__Impl : ( ( rule__Policy__NameAssignment_1 ) ) ;
    public final void rule__Policy__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1897:1: ( ( ( rule__Policy__NameAssignment_1 ) ) )
            // InternalDsl.g:1898:1: ( ( rule__Policy__NameAssignment_1 ) )
            {
            // InternalDsl.g:1898:1: ( ( rule__Policy__NameAssignment_1 ) )
            // InternalDsl.g:1899:2: ( rule__Policy__NameAssignment_1 )
            {
             before(grammarAccess.getPolicyAccess().getNameAssignment_1()); 
            // InternalDsl.g:1900:2: ( rule__Policy__NameAssignment_1 )
            // InternalDsl.g:1900:3: rule__Policy__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Policy__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPolicyAccess().getNameAssignment_1()); 

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
    // InternalDsl.g:1908:1: rule__Policy__Group__2 : rule__Policy__Group__2__Impl rule__Policy__Group__3 ;
    public final void rule__Policy__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1912:1: ( rule__Policy__Group__2__Impl rule__Policy__Group__3 )
            // InternalDsl.g:1913:2: rule__Policy__Group__2__Impl rule__Policy__Group__3
            {
            pushFollow(FOLLOW_13);
            rule__Policy__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Policy__Group__3();

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
    // InternalDsl.g:1920:1: rule__Policy__Group__2__Impl : ( '{' ) ;
    public final void rule__Policy__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1924:1: ( ( '{' ) )
            // InternalDsl.g:1925:1: ( '{' )
            {
            // InternalDsl.g:1925:1: ( '{' )
            // InternalDsl.g:1926:2: '{'
            {
             before(grammarAccess.getPolicyAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getPolicyAccess().getLeftCurlyBracketKeyword_2()); 

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


    // $ANTLR start "rule__Policy__Group__3"
    // InternalDsl.g:1935:1: rule__Policy__Group__3 : rule__Policy__Group__3__Impl rule__Policy__Group__4 ;
    public final void rule__Policy__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1939:1: ( rule__Policy__Group__3__Impl rule__Policy__Group__4 )
            // InternalDsl.g:1940:2: rule__Policy__Group__3__Impl rule__Policy__Group__4
            {
            pushFollow(FOLLOW_14);
            rule__Policy__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Policy__Group__4();

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
    // $ANTLR end "rule__Policy__Group__3"


    // $ANTLR start "rule__Policy__Group__3__Impl"
    // InternalDsl.g:1947:1: rule__Policy__Group__3__Impl : ( ( rule__Policy__RuleAssignment_3 ) ) ;
    public final void rule__Policy__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1951:1: ( ( ( rule__Policy__RuleAssignment_3 ) ) )
            // InternalDsl.g:1952:1: ( ( rule__Policy__RuleAssignment_3 ) )
            {
            // InternalDsl.g:1952:1: ( ( rule__Policy__RuleAssignment_3 ) )
            // InternalDsl.g:1953:2: ( rule__Policy__RuleAssignment_3 )
            {
             before(grammarAccess.getPolicyAccess().getRuleAssignment_3()); 
            // InternalDsl.g:1954:2: ( rule__Policy__RuleAssignment_3 )
            // InternalDsl.g:1954:3: rule__Policy__RuleAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Policy__RuleAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getPolicyAccess().getRuleAssignment_3()); 

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
    // $ANTLR end "rule__Policy__Group__3__Impl"


    // $ANTLR start "rule__Policy__Group__4"
    // InternalDsl.g:1962:1: rule__Policy__Group__4 : rule__Policy__Group__4__Impl ;
    public final void rule__Policy__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1966:1: ( rule__Policy__Group__4__Impl )
            // InternalDsl.g:1967:2: rule__Policy__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Policy__Group__4__Impl();

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
    // $ANTLR end "rule__Policy__Group__4"


    // $ANTLR start "rule__Policy__Group__4__Impl"
    // InternalDsl.g:1973:1: rule__Policy__Group__4__Impl : ( '}' ) ;
    public final void rule__Policy__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1977:1: ( ( '}' ) )
            // InternalDsl.g:1978:1: ( '}' )
            {
            // InternalDsl.g:1978:1: ( '}' )
            // InternalDsl.g:1979:2: '}'
            {
             before(grammarAccess.getPolicyAccess().getRightCurlyBracketKeyword_4()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getPolicyAccess().getRightCurlyBracketKeyword_4()); 

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
    // $ANTLR end "rule__Policy__Group__4__Impl"


    // $ANTLR start "rule__Mapping__Group__0"
    // InternalDsl.g:1989:1: rule__Mapping__Group__0 : rule__Mapping__Group__0__Impl rule__Mapping__Group__1 ;
    public final void rule__Mapping__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1993:1: ( rule__Mapping__Group__0__Impl rule__Mapping__Group__1 )
            // InternalDsl.g:1994:2: rule__Mapping__Group__0__Impl rule__Mapping__Group__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalDsl.g:2001:1: rule__Mapping__Group__0__Impl : ( 'Mapping' ) ;
    public final void rule__Mapping__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2005:1: ( ( 'Mapping' ) )
            // InternalDsl.g:2006:1: ( 'Mapping' )
            {
            // InternalDsl.g:2006:1: ( 'Mapping' )
            // InternalDsl.g:2007:2: 'Mapping'
            {
             before(grammarAccess.getMappingAccess().getMappingKeyword_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getMappingAccess().getMappingKeyword_0()); 

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
    // InternalDsl.g:2016:1: rule__Mapping__Group__1 : rule__Mapping__Group__1__Impl rule__Mapping__Group__2 ;
    public final void rule__Mapping__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2020:1: ( rule__Mapping__Group__1__Impl rule__Mapping__Group__2 )
            // InternalDsl.g:2021:2: rule__Mapping__Group__1__Impl rule__Mapping__Group__2
            {
            pushFollow(FOLLOW_15);
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
    // InternalDsl.g:2028:1: rule__Mapping__Group__1__Impl : ( '{' ) ;
    public final void rule__Mapping__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2032:1: ( ( '{' ) )
            // InternalDsl.g:2033:1: ( '{' )
            {
            // InternalDsl.g:2033:1: ( '{' )
            // InternalDsl.g:2034:2: '{'
            {
             before(grammarAccess.getMappingAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getMappingAccess().getLeftCurlyBracketKeyword_1()); 

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
    // InternalDsl.g:2043:1: rule__Mapping__Group__2 : rule__Mapping__Group__2__Impl rule__Mapping__Group__3 ;
    public final void rule__Mapping__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2047:1: ( rule__Mapping__Group__2__Impl rule__Mapping__Group__3 )
            // InternalDsl.g:2048:2: rule__Mapping__Group__2__Impl rule__Mapping__Group__3
            {
            pushFollow(FOLLOW_16);
            rule__Mapping__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mapping__Group__3();

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
    // InternalDsl.g:2055:1: rule__Mapping__Group__2__Impl : ( 'rule' ) ;
    public final void rule__Mapping__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2059:1: ( ( 'rule' ) )
            // InternalDsl.g:2060:1: ( 'rule' )
            {
            // InternalDsl.g:2060:1: ( 'rule' )
            // InternalDsl.g:2061:2: 'rule'
            {
             before(grammarAccess.getMappingAccess().getRuleKeyword_2()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getMappingAccess().getRuleKeyword_2()); 

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


    // $ANTLR start "rule__Mapping__Group__3"
    // InternalDsl.g:2070:1: rule__Mapping__Group__3 : rule__Mapping__Group__3__Impl rule__Mapping__Group__4 ;
    public final void rule__Mapping__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2074:1: ( rule__Mapping__Group__3__Impl rule__Mapping__Group__4 )
            // InternalDsl.g:2075:2: rule__Mapping__Group__3__Impl rule__Mapping__Group__4
            {
            pushFollow(FOLLOW_17);
            rule__Mapping__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mapping__Group__4();

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
    // $ANTLR end "rule__Mapping__Group__3"


    // $ANTLR start "rule__Mapping__Group__3__Impl"
    // InternalDsl.g:2082:1: rule__Mapping__Group__3__Impl : ( ( rule__Mapping__RuleAssignment_3 ) ) ;
    public final void rule__Mapping__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2086:1: ( ( ( rule__Mapping__RuleAssignment_3 ) ) )
            // InternalDsl.g:2087:1: ( ( rule__Mapping__RuleAssignment_3 ) )
            {
            // InternalDsl.g:2087:1: ( ( rule__Mapping__RuleAssignment_3 ) )
            // InternalDsl.g:2088:2: ( rule__Mapping__RuleAssignment_3 )
            {
             before(grammarAccess.getMappingAccess().getRuleAssignment_3()); 
            // InternalDsl.g:2089:2: ( rule__Mapping__RuleAssignment_3 )
            // InternalDsl.g:2089:3: rule__Mapping__RuleAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Mapping__RuleAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getMappingAccess().getRuleAssignment_3()); 

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
    // $ANTLR end "rule__Mapping__Group__3__Impl"


    // $ANTLR start "rule__Mapping__Group__4"
    // InternalDsl.g:2097:1: rule__Mapping__Group__4 : rule__Mapping__Group__4__Impl rule__Mapping__Group__5 ;
    public final void rule__Mapping__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2101:1: ( rule__Mapping__Group__4__Impl rule__Mapping__Group__5 )
            // InternalDsl.g:2102:2: rule__Mapping__Group__4__Impl rule__Mapping__Group__5
            {
            pushFollow(FOLLOW_12);
            rule__Mapping__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mapping__Group__5();

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
    // $ANTLR end "rule__Mapping__Group__4"


    // $ANTLR start "rule__Mapping__Group__4__Impl"
    // InternalDsl.g:2109:1: rule__Mapping__Group__4__Impl : ( 'policy' ) ;
    public final void rule__Mapping__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2113:1: ( ( 'policy' ) )
            // InternalDsl.g:2114:1: ( 'policy' )
            {
            // InternalDsl.g:2114:1: ( 'policy' )
            // InternalDsl.g:2115:2: 'policy'
            {
             before(grammarAccess.getMappingAccess().getPolicyKeyword_4()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getMappingAccess().getPolicyKeyword_4()); 

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
    // $ANTLR end "rule__Mapping__Group__4__Impl"


    // $ANTLR start "rule__Mapping__Group__5"
    // InternalDsl.g:2124:1: rule__Mapping__Group__5 : rule__Mapping__Group__5__Impl rule__Mapping__Group__6 ;
    public final void rule__Mapping__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2128:1: ( rule__Mapping__Group__5__Impl rule__Mapping__Group__6 )
            // InternalDsl.g:2129:2: rule__Mapping__Group__5__Impl rule__Mapping__Group__6
            {
            pushFollow(FOLLOW_14);
            rule__Mapping__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mapping__Group__6();

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
    // $ANTLR end "rule__Mapping__Group__5"


    // $ANTLR start "rule__Mapping__Group__5__Impl"
    // InternalDsl.g:2136:1: rule__Mapping__Group__5__Impl : ( ( rule__Mapping__PolicyAssignment_5 ) ) ;
    public final void rule__Mapping__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2140:1: ( ( ( rule__Mapping__PolicyAssignment_5 ) ) )
            // InternalDsl.g:2141:1: ( ( rule__Mapping__PolicyAssignment_5 ) )
            {
            // InternalDsl.g:2141:1: ( ( rule__Mapping__PolicyAssignment_5 ) )
            // InternalDsl.g:2142:2: ( rule__Mapping__PolicyAssignment_5 )
            {
             before(grammarAccess.getMappingAccess().getPolicyAssignment_5()); 
            // InternalDsl.g:2143:2: ( rule__Mapping__PolicyAssignment_5 )
            // InternalDsl.g:2143:3: rule__Mapping__PolicyAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Mapping__PolicyAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getMappingAccess().getPolicyAssignment_5()); 

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
    // $ANTLR end "rule__Mapping__Group__5__Impl"


    // $ANTLR start "rule__Mapping__Group__6"
    // InternalDsl.g:2151:1: rule__Mapping__Group__6 : rule__Mapping__Group__6__Impl ;
    public final void rule__Mapping__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2155:1: ( rule__Mapping__Group__6__Impl )
            // InternalDsl.g:2156:2: rule__Mapping__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Mapping__Group__6__Impl();

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
    // $ANTLR end "rule__Mapping__Group__6"


    // $ANTLR start "rule__Mapping__Group__6__Impl"
    // InternalDsl.g:2162:1: rule__Mapping__Group__6__Impl : ( '}' ) ;
    public final void rule__Mapping__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2166:1: ( ( '}' ) )
            // InternalDsl.g:2167:1: ( '}' )
            {
            // InternalDsl.g:2167:1: ( '}' )
            // InternalDsl.g:2168:2: '}'
            {
             before(grammarAccess.getMappingAccess().getRightCurlyBracketKeyword_6()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getMappingAccess().getRightCurlyBracketKeyword_6()); 

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
    // $ANTLR end "rule__Mapping__Group__6__Impl"


    // $ANTLR start "rule__FeatureNameMappingRule__Group__0"
    // InternalDsl.g:2178:1: rule__FeatureNameMappingRule__Group__0 : rule__FeatureNameMappingRule__Group__0__Impl rule__FeatureNameMappingRule__Group__1 ;
    public final void rule__FeatureNameMappingRule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2182:1: ( rule__FeatureNameMappingRule__Group__0__Impl rule__FeatureNameMappingRule__Group__1 )
            // InternalDsl.g:2183:2: rule__FeatureNameMappingRule__Group__0__Impl rule__FeatureNameMappingRule__Group__1
            {
            pushFollow(FOLLOW_18);
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
    // InternalDsl.g:2190:1: rule__FeatureNameMappingRule__Group__0__Impl : ( () ) ;
    public final void rule__FeatureNameMappingRule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2194:1: ( ( () ) )
            // InternalDsl.g:2195:1: ( () )
            {
            // InternalDsl.g:2195:1: ( () )
            // InternalDsl.g:2196:2: ()
            {
             before(grammarAccess.getFeatureNameMappingRuleAccess().getFeatureNameMappingRuleAction_0()); 
            // InternalDsl.g:2197:2: ()
            // InternalDsl.g:2197:3: 
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
    // InternalDsl.g:2205:1: rule__FeatureNameMappingRule__Group__1 : rule__FeatureNameMappingRule__Group__1__Impl rule__FeatureNameMappingRule__Group__2 ;
    public final void rule__FeatureNameMappingRule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2209:1: ( rule__FeatureNameMappingRule__Group__1__Impl rule__FeatureNameMappingRule__Group__2 )
            // InternalDsl.g:2210:2: rule__FeatureNameMappingRule__Group__1__Impl rule__FeatureNameMappingRule__Group__2
            {
            pushFollow(FOLLOW_19);
            rule__FeatureNameMappingRule__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FeatureNameMappingRule__Group__2();

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
    // InternalDsl.g:2217:1: rule__FeatureNameMappingRule__Group__1__Impl : ( 'FeatureNameMappingRule' ) ;
    public final void rule__FeatureNameMappingRule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2221:1: ( ( 'FeatureNameMappingRule' ) )
            // InternalDsl.g:2222:1: ( 'FeatureNameMappingRule' )
            {
            // InternalDsl.g:2222:1: ( 'FeatureNameMappingRule' )
            // InternalDsl.g:2223:2: 'FeatureNameMappingRule'
            {
             before(grammarAccess.getFeatureNameMappingRuleAccess().getFeatureNameMappingRuleKeyword_1()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getFeatureNameMappingRuleAccess().getFeatureNameMappingRuleKeyword_1()); 

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


    // $ANTLR start "rule__FeatureNameMappingRule__Group__2"
    // InternalDsl.g:2232:1: rule__FeatureNameMappingRule__Group__2 : rule__FeatureNameMappingRule__Group__2__Impl ;
    public final void rule__FeatureNameMappingRule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2236:1: ( rule__FeatureNameMappingRule__Group__2__Impl )
            // InternalDsl.g:2237:2: rule__FeatureNameMappingRule__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FeatureNameMappingRule__Group__2__Impl();

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
    // $ANTLR end "rule__FeatureNameMappingRule__Group__2"


    // $ANTLR start "rule__FeatureNameMappingRule__Group__2__Impl"
    // InternalDsl.g:2243:1: rule__FeatureNameMappingRule__Group__2__Impl : ( ( rule__FeatureNameMappingRule__NameAssignment_2 ) ) ;
    public final void rule__FeatureNameMappingRule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2247:1: ( ( ( rule__FeatureNameMappingRule__NameAssignment_2 ) ) )
            // InternalDsl.g:2248:1: ( ( rule__FeatureNameMappingRule__NameAssignment_2 ) )
            {
            // InternalDsl.g:2248:1: ( ( rule__FeatureNameMappingRule__NameAssignment_2 ) )
            // InternalDsl.g:2249:2: ( rule__FeatureNameMappingRule__NameAssignment_2 )
            {
             before(grammarAccess.getFeatureNameMappingRuleAccess().getNameAssignment_2()); 
            // InternalDsl.g:2250:2: ( rule__FeatureNameMappingRule__NameAssignment_2 )
            // InternalDsl.g:2250:3: rule__FeatureNameMappingRule__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__FeatureNameMappingRule__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getFeatureNameMappingRuleAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__FeatureNameMappingRule__Group__2__Impl"


    // $ANTLR start "rule__AndMappingRule__Group__0"
    // InternalDsl.g:2259:1: rule__AndMappingRule__Group__0 : rule__AndMappingRule__Group__0__Impl rule__AndMappingRule__Group__1 ;
    public final void rule__AndMappingRule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2263:1: ( rule__AndMappingRule__Group__0__Impl rule__AndMappingRule__Group__1 )
            // InternalDsl.g:2264:2: rule__AndMappingRule__Group__0__Impl rule__AndMappingRule__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__AndMappingRule__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AndMappingRule__Group__1();

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
    // $ANTLR end "rule__AndMappingRule__Group__0"


    // $ANTLR start "rule__AndMappingRule__Group__0__Impl"
    // InternalDsl.g:2271:1: rule__AndMappingRule__Group__0__Impl : ( 'AndMappingRule' ) ;
    public final void rule__AndMappingRule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2275:1: ( ( 'AndMappingRule' ) )
            // InternalDsl.g:2276:1: ( 'AndMappingRule' )
            {
            // InternalDsl.g:2276:1: ( 'AndMappingRule' )
            // InternalDsl.g:2277:2: 'AndMappingRule'
            {
             before(grammarAccess.getAndMappingRuleAccess().getAndMappingRuleKeyword_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getAndMappingRuleAccess().getAndMappingRuleKeyword_0()); 

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
    // $ANTLR end "rule__AndMappingRule__Group__0__Impl"


    // $ANTLR start "rule__AndMappingRule__Group__1"
    // InternalDsl.g:2286:1: rule__AndMappingRule__Group__1 : rule__AndMappingRule__Group__1__Impl rule__AndMappingRule__Group__2 ;
    public final void rule__AndMappingRule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2290:1: ( rule__AndMappingRule__Group__1__Impl rule__AndMappingRule__Group__2 )
            // InternalDsl.g:2291:2: rule__AndMappingRule__Group__1__Impl rule__AndMappingRule__Group__2
            {
            pushFollow(FOLLOW_20);
            rule__AndMappingRule__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AndMappingRule__Group__2();

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
    // $ANTLR end "rule__AndMappingRule__Group__1"


    // $ANTLR start "rule__AndMappingRule__Group__1__Impl"
    // InternalDsl.g:2298:1: rule__AndMappingRule__Group__1__Impl : ( '{' ) ;
    public final void rule__AndMappingRule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2302:1: ( ( '{' ) )
            // InternalDsl.g:2303:1: ( '{' )
            {
            // InternalDsl.g:2303:1: ( '{' )
            // InternalDsl.g:2304:2: '{'
            {
             before(grammarAccess.getAndMappingRuleAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getAndMappingRuleAccess().getLeftCurlyBracketKeyword_1()); 

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
    // $ANTLR end "rule__AndMappingRule__Group__1__Impl"


    // $ANTLR start "rule__AndMappingRule__Group__2"
    // InternalDsl.g:2313:1: rule__AndMappingRule__Group__2 : rule__AndMappingRule__Group__2__Impl rule__AndMappingRule__Group__3 ;
    public final void rule__AndMappingRule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2317:1: ( rule__AndMappingRule__Group__2__Impl rule__AndMappingRule__Group__3 )
            // InternalDsl.g:2318:2: rule__AndMappingRule__Group__2__Impl rule__AndMappingRule__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__AndMappingRule__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AndMappingRule__Group__3();

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
    // $ANTLR end "rule__AndMappingRule__Group__2"


    // $ANTLR start "rule__AndMappingRule__Group__2__Impl"
    // InternalDsl.g:2325:1: rule__AndMappingRule__Group__2__Impl : ( ( rule__AndMappingRule__RulesAssignment_2 ) ) ;
    public final void rule__AndMappingRule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2329:1: ( ( ( rule__AndMappingRule__RulesAssignment_2 ) ) )
            // InternalDsl.g:2330:1: ( ( rule__AndMappingRule__RulesAssignment_2 ) )
            {
            // InternalDsl.g:2330:1: ( ( rule__AndMappingRule__RulesAssignment_2 ) )
            // InternalDsl.g:2331:2: ( rule__AndMappingRule__RulesAssignment_2 )
            {
             before(grammarAccess.getAndMappingRuleAccess().getRulesAssignment_2()); 
            // InternalDsl.g:2332:2: ( rule__AndMappingRule__RulesAssignment_2 )
            // InternalDsl.g:2332:3: rule__AndMappingRule__RulesAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__AndMappingRule__RulesAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAndMappingRuleAccess().getRulesAssignment_2()); 

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
    // $ANTLR end "rule__AndMappingRule__Group__2__Impl"


    // $ANTLR start "rule__AndMappingRule__Group__3"
    // InternalDsl.g:2340:1: rule__AndMappingRule__Group__3 : rule__AndMappingRule__Group__3__Impl rule__AndMappingRule__Group__4 ;
    public final void rule__AndMappingRule__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2344:1: ( rule__AndMappingRule__Group__3__Impl rule__AndMappingRule__Group__4 )
            // InternalDsl.g:2345:2: rule__AndMappingRule__Group__3__Impl rule__AndMappingRule__Group__4
            {
            pushFollow(FOLLOW_8);
            rule__AndMappingRule__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AndMappingRule__Group__4();

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
    // $ANTLR end "rule__AndMappingRule__Group__3"


    // $ANTLR start "rule__AndMappingRule__Group__3__Impl"
    // InternalDsl.g:2352:1: rule__AndMappingRule__Group__3__Impl : ( ( rule__AndMappingRule__Group_3__0 )* ) ;
    public final void rule__AndMappingRule__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2356:1: ( ( ( rule__AndMappingRule__Group_3__0 )* ) )
            // InternalDsl.g:2357:1: ( ( rule__AndMappingRule__Group_3__0 )* )
            {
            // InternalDsl.g:2357:1: ( ( rule__AndMappingRule__Group_3__0 )* )
            // InternalDsl.g:2358:2: ( rule__AndMappingRule__Group_3__0 )*
            {
             before(grammarAccess.getAndMappingRuleAccess().getGroup_3()); 
            // InternalDsl.g:2359:2: ( rule__AndMappingRule__Group_3__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==16) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalDsl.g:2359:3: rule__AndMappingRule__Group_3__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__AndMappingRule__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getAndMappingRuleAccess().getGroup_3()); 

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
    // $ANTLR end "rule__AndMappingRule__Group__3__Impl"


    // $ANTLR start "rule__AndMappingRule__Group__4"
    // InternalDsl.g:2367:1: rule__AndMappingRule__Group__4 : rule__AndMappingRule__Group__4__Impl ;
    public final void rule__AndMappingRule__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2371:1: ( rule__AndMappingRule__Group__4__Impl )
            // InternalDsl.g:2372:2: rule__AndMappingRule__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AndMappingRule__Group__4__Impl();

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
    // $ANTLR end "rule__AndMappingRule__Group__4"


    // $ANTLR start "rule__AndMappingRule__Group__4__Impl"
    // InternalDsl.g:2378:1: rule__AndMappingRule__Group__4__Impl : ( '}' ) ;
    public final void rule__AndMappingRule__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2382:1: ( ( '}' ) )
            // InternalDsl.g:2383:1: ( '}' )
            {
            // InternalDsl.g:2383:1: ( '}' )
            // InternalDsl.g:2384:2: '}'
            {
             before(grammarAccess.getAndMappingRuleAccess().getRightCurlyBracketKeyword_4()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getAndMappingRuleAccess().getRightCurlyBracketKeyword_4()); 

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
    // $ANTLR end "rule__AndMappingRule__Group__4__Impl"


    // $ANTLR start "rule__AndMappingRule__Group_3__0"
    // InternalDsl.g:2394:1: rule__AndMappingRule__Group_3__0 : rule__AndMappingRule__Group_3__0__Impl rule__AndMappingRule__Group_3__1 ;
    public final void rule__AndMappingRule__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2398:1: ( rule__AndMappingRule__Group_3__0__Impl rule__AndMappingRule__Group_3__1 )
            // InternalDsl.g:2399:2: rule__AndMappingRule__Group_3__0__Impl rule__AndMappingRule__Group_3__1
            {
            pushFollow(FOLLOW_20);
            rule__AndMappingRule__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AndMappingRule__Group_3__1();

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
    // $ANTLR end "rule__AndMappingRule__Group_3__0"


    // $ANTLR start "rule__AndMappingRule__Group_3__0__Impl"
    // InternalDsl.g:2406:1: rule__AndMappingRule__Group_3__0__Impl : ( ',' ) ;
    public final void rule__AndMappingRule__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2410:1: ( ( ',' ) )
            // InternalDsl.g:2411:1: ( ',' )
            {
            // InternalDsl.g:2411:1: ( ',' )
            // InternalDsl.g:2412:2: ','
            {
             before(grammarAccess.getAndMappingRuleAccess().getCommaKeyword_3_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getAndMappingRuleAccess().getCommaKeyword_3_0()); 

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
    // $ANTLR end "rule__AndMappingRule__Group_3__0__Impl"


    // $ANTLR start "rule__AndMappingRule__Group_3__1"
    // InternalDsl.g:2421:1: rule__AndMappingRule__Group_3__1 : rule__AndMappingRule__Group_3__1__Impl ;
    public final void rule__AndMappingRule__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2425:1: ( rule__AndMappingRule__Group_3__1__Impl )
            // InternalDsl.g:2426:2: rule__AndMappingRule__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AndMappingRule__Group_3__1__Impl();

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
    // $ANTLR end "rule__AndMappingRule__Group_3__1"


    // $ANTLR start "rule__AndMappingRule__Group_3__1__Impl"
    // InternalDsl.g:2432:1: rule__AndMappingRule__Group_3__1__Impl : ( ( rule__AndMappingRule__RulesAssignment_3_1 ) ) ;
    public final void rule__AndMappingRule__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2436:1: ( ( ( rule__AndMappingRule__RulesAssignment_3_1 ) ) )
            // InternalDsl.g:2437:1: ( ( rule__AndMappingRule__RulesAssignment_3_1 ) )
            {
            // InternalDsl.g:2437:1: ( ( rule__AndMappingRule__RulesAssignment_3_1 ) )
            // InternalDsl.g:2438:2: ( rule__AndMappingRule__RulesAssignment_3_1 )
            {
             before(grammarAccess.getAndMappingRuleAccess().getRulesAssignment_3_1()); 
            // InternalDsl.g:2439:2: ( rule__AndMappingRule__RulesAssignment_3_1 )
            // InternalDsl.g:2439:3: rule__AndMappingRule__RulesAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__AndMappingRule__RulesAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getAndMappingRuleAccess().getRulesAssignment_3_1()); 

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
    // $ANTLR end "rule__AndMappingRule__Group_3__1__Impl"


    // $ANTLR start "rule__NotMappingRule__Group__0"
    // InternalDsl.g:2448:1: rule__NotMappingRule__Group__0 : rule__NotMappingRule__Group__0__Impl rule__NotMappingRule__Group__1 ;
    public final void rule__NotMappingRule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2452:1: ( rule__NotMappingRule__Group__0__Impl rule__NotMappingRule__Group__1 )
            // InternalDsl.g:2453:2: rule__NotMappingRule__Group__0__Impl rule__NotMappingRule__Group__1
            {
            pushFollow(FOLLOW_20);
            rule__NotMappingRule__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NotMappingRule__Group__1();

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
    // $ANTLR end "rule__NotMappingRule__Group__0"


    // $ANTLR start "rule__NotMappingRule__Group__0__Impl"
    // InternalDsl.g:2460:1: rule__NotMappingRule__Group__0__Impl : ( '!' ) ;
    public final void rule__NotMappingRule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2464:1: ( ( '!' ) )
            // InternalDsl.g:2465:1: ( '!' )
            {
            // InternalDsl.g:2465:1: ( '!' )
            // InternalDsl.g:2466:2: '!'
            {
             before(grammarAccess.getNotMappingRuleAccess().getExclamationMarkKeyword_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getNotMappingRuleAccess().getExclamationMarkKeyword_0()); 

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
    // $ANTLR end "rule__NotMappingRule__Group__0__Impl"


    // $ANTLR start "rule__NotMappingRule__Group__1"
    // InternalDsl.g:2475:1: rule__NotMappingRule__Group__1 : rule__NotMappingRule__Group__1__Impl ;
    public final void rule__NotMappingRule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2479:1: ( rule__NotMappingRule__Group__1__Impl )
            // InternalDsl.g:2480:2: rule__NotMappingRule__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NotMappingRule__Group__1__Impl();

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
    // $ANTLR end "rule__NotMappingRule__Group__1"


    // $ANTLR start "rule__NotMappingRule__Group__1__Impl"
    // InternalDsl.g:2486:1: rule__NotMappingRule__Group__1__Impl : ( ( rule__NotMappingRule__RuleAssignment_1 ) ) ;
    public final void rule__NotMappingRule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2490:1: ( ( ( rule__NotMappingRule__RuleAssignment_1 ) ) )
            // InternalDsl.g:2491:1: ( ( rule__NotMappingRule__RuleAssignment_1 ) )
            {
            // InternalDsl.g:2491:1: ( ( rule__NotMappingRule__RuleAssignment_1 ) )
            // InternalDsl.g:2492:2: ( rule__NotMappingRule__RuleAssignment_1 )
            {
             before(grammarAccess.getNotMappingRuleAccess().getRuleAssignment_1()); 
            // InternalDsl.g:2493:2: ( rule__NotMappingRule__RuleAssignment_1 )
            // InternalDsl.g:2493:3: rule__NotMappingRule__RuleAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__NotMappingRule__RuleAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getNotMappingRuleAccess().getRuleAssignment_1()); 

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
    // $ANTLR end "rule__NotMappingRule__Group__1__Impl"


    // $ANTLR start "rule__OrMappingRule__Group__0"
    // InternalDsl.g:2502:1: rule__OrMappingRule__Group__0 : rule__OrMappingRule__Group__0__Impl rule__OrMappingRule__Group__1 ;
    public final void rule__OrMappingRule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2506:1: ( rule__OrMappingRule__Group__0__Impl rule__OrMappingRule__Group__1 )
            // InternalDsl.g:2507:2: rule__OrMappingRule__Group__0__Impl rule__OrMappingRule__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__OrMappingRule__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OrMappingRule__Group__1();

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
    // $ANTLR end "rule__OrMappingRule__Group__0"


    // $ANTLR start "rule__OrMappingRule__Group__0__Impl"
    // InternalDsl.g:2514:1: rule__OrMappingRule__Group__0__Impl : ( 'OrMappingRule' ) ;
    public final void rule__OrMappingRule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2518:1: ( ( 'OrMappingRule' ) )
            // InternalDsl.g:2519:1: ( 'OrMappingRule' )
            {
            // InternalDsl.g:2519:1: ( 'OrMappingRule' )
            // InternalDsl.g:2520:2: 'OrMappingRule'
            {
             before(grammarAccess.getOrMappingRuleAccess().getOrMappingRuleKeyword_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getOrMappingRuleAccess().getOrMappingRuleKeyword_0()); 

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
    // $ANTLR end "rule__OrMappingRule__Group__0__Impl"


    // $ANTLR start "rule__OrMappingRule__Group__1"
    // InternalDsl.g:2529:1: rule__OrMappingRule__Group__1 : rule__OrMappingRule__Group__1__Impl rule__OrMappingRule__Group__2 ;
    public final void rule__OrMappingRule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2533:1: ( rule__OrMappingRule__Group__1__Impl rule__OrMappingRule__Group__2 )
            // InternalDsl.g:2534:2: rule__OrMappingRule__Group__1__Impl rule__OrMappingRule__Group__2
            {
            pushFollow(FOLLOW_20);
            rule__OrMappingRule__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OrMappingRule__Group__2();

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
    // $ANTLR end "rule__OrMappingRule__Group__1"


    // $ANTLR start "rule__OrMappingRule__Group__1__Impl"
    // InternalDsl.g:2541:1: rule__OrMappingRule__Group__1__Impl : ( '{' ) ;
    public final void rule__OrMappingRule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2545:1: ( ( '{' ) )
            // InternalDsl.g:2546:1: ( '{' )
            {
            // InternalDsl.g:2546:1: ( '{' )
            // InternalDsl.g:2547:2: '{'
            {
             before(grammarAccess.getOrMappingRuleAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getOrMappingRuleAccess().getLeftCurlyBracketKeyword_1()); 

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
    // $ANTLR end "rule__OrMappingRule__Group__1__Impl"


    // $ANTLR start "rule__OrMappingRule__Group__2"
    // InternalDsl.g:2556:1: rule__OrMappingRule__Group__2 : rule__OrMappingRule__Group__2__Impl rule__OrMappingRule__Group__3 ;
    public final void rule__OrMappingRule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2560:1: ( rule__OrMappingRule__Group__2__Impl rule__OrMappingRule__Group__3 )
            // InternalDsl.g:2561:2: rule__OrMappingRule__Group__2__Impl rule__OrMappingRule__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__OrMappingRule__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OrMappingRule__Group__3();

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
    // $ANTLR end "rule__OrMappingRule__Group__2"


    // $ANTLR start "rule__OrMappingRule__Group__2__Impl"
    // InternalDsl.g:2568:1: rule__OrMappingRule__Group__2__Impl : ( ( rule__OrMappingRule__RulesAssignment_2 ) ) ;
    public final void rule__OrMappingRule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2572:1: ( ( ( rule__OrMappingRule__RulesAssignment_2 ) ) )
            // InternalDsl.g:2573:1: ( ( rule__OrMappingRule__RulesAssignment_2 ) )
            {
            // InternalDsl.g:2573:1: ( ( rule__OrMappingRule__RulesAssignment_2 ) )
            // InternalDsl.g:2574:2: ( rule__OrMappingRule__RulesAssignment_2 )
            {
             before(grammarAccess.getOrMappingRuleAccess().getRulesAssignment_2()); 
            // InternalDsl.g:2575:2: ( rule__OrMappingRule__RulesAssignment_2 )
            // InternalDsl.g:2575:3: rule__OrMappingRule__RulesAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__OrMappingRule__RulesAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getOrMappingRuleAccess().getRulesAssignment_2()); 

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
    // $ANTLR end "rule__OrMappingRule__Group__2__Impl"


    // $ANTLR start "rule__OrMappingRule__Group__3"
    // InternalDsl.g:2583:1: rule__OrMappingRule__Group__3 : rule__OrMappingRule__Group__3__Impl rule__OrMappingRule__Group__4 ;
    public final void rule__OrMappingRule__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2587:1: ( rule__OrMappingRule__Group__3__Impl rule__OrMappingRule__Group__4 )
            // InternalDsl.g:2588:2: rule__OrMappingRule__Group__3__Impl rule__OrMappingRule__Group__4
            {
            pushFollow(FOLLOW_8);
            rule__OrMappingRule__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OrMappingRule__Group__4();

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
    // $ANTLR end "rule__OrMappingRule__Group__3"


    // $ANTLR start "rule__OrMappingRule__Group__3__Impl"
    // InternalDsl.g:2595:1: rule__OrMappingRule__Group__3__Impl : ( ( rule__OrMappingRule__Group_3__0 )* ) ;
    public final void rule__OrMappingRule__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2599:1: ( ( ( rule__OrMappingRule__Group_3__0 )* ) )
            // InternalDsl.g:2600:1: ( ( rule__OrMappingRule__Group_3__0 )* )
            {
            // InternalDsl.g:2600:1: ( ( rule__OrMappingRule__Group_3__0 )* )
            // InternalDsl.g:2601:2: ( rule__OrMappingRule__Group_3__0 )*
            {
             before(grammarAccess.getOrMappingRuleAccess().getGroup_3()); 
            // InternalDsl.g:2602:2: ( rule__OrMappingRule__Group_3__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==16) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalDsl.g:2602:3: rule__OrMappingRule__Group_3__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__OrMappingRule__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getOrMappingRuleAccess().getGroup_3()); 

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
    // $ANTLR end "rule__OrMappingRule__Group__3__Impl"


    // $ANTLR start "rule__OrMappingRule__Group__4"
    // InternalDsl.g:2610:1: rule__OrMappingRule__Group__4 : rule__OrMappingRule__Group__4__Impl ;
    public final void rule__OrMappingRule__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2614:1: ( rule__OrMappingRule__Group__4__Impl )
            // InternalDsl.g:2615:2: rule__OrMappingRule__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OrMappingRule__Group__4__Impl();

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
    // $ANTLR end "rule__OrMappingRule__Group__4"


    // $ANTLR start "rule__OrMappingRule__Group__4__Impl"
    // InternalDsl.g:2621:1: rule__OrMappingRule__Group__4__Impl : ( '}' ) ;
    public final void rule__OrMappingRule__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2625:1: ( ( '}' ) )
            // InternalDsl.g:2626:1: ( '}' )
            {
            // InternalDsl.g:2626:1: ( '}' )
            // InternalDsl.g:2627:2: '}'
            {
             before(grammarAccess.getOrMappingRuleAccess().getRightCurlyBracketKeyword_4()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getOrMappingRuleAccess().getRightCurlyBracketKeyword_4()); 

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
    // $ANTLR end "rule__OrMappingRule__Group__4__Impl"


    // $ANTLR start "rule__OrMappingRule__Group_3__0"
    // InternalDsl.g:2637:1: rule__OrMappingRule__Group_3__0 : rule__OrMappingRule__Group_3__0__Impl rule__OrMappingRule__Group_3__1 ;
    public final void rule__OrMappingRule__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2641:1: ( rule__OrMappingRule__Group_3__0__Impl rule__OrMappingRule__Group_3__1 )
            // InternalDsl.g:2642:2: rule__OrMappingRule__Group_3__0__Impl rule__OrMappingRule__Group_3__1
            {
            pushFollow(FOLLOW_20);
            rule__OrMappingRule__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OrMappingRule__Group_3__1();

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
    // $ANTLR end "rule__OrMappingRule__Group_3__0"


    // $ANTLR start "rule__OrMappingRule__Group_3__0__Impl"
    // InternalDsl.g:2649:1: rule__OrMappingRule__Group_3__0__Impl : ( ',' ) ;
    public final void rule__OrMappingRule__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2653:1: ( ( ',' ) )
            // InternalDsl.g:2654:1: ( ',' )
            {
            // InternalDsl.g:2654:1: ( ',' )
            // InternalDsl.g:2655:2: ','
            {
             before(grammarAccess.getOrMappingRuleAccess().getCommaKeyword_3_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getOrMappingRuleAccess().getCommaKeyword_3_0()); 

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
    // $ANTLR end "rule__OrMappingRule__Group_3__0__Impl"


    // $ANTLR start "rule__OrMappingRule__Group_3__1"
    // InternalDsl.g:2664:1: rule__OrMappingRule__Group_3__1 : rule__OrMappingRule__Group_3__1__Impl ;
    public final void rule__OrMappingRule__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2668:1: ( rule__OrMappingRule__Group_3__1__Impl )
            // InternalDsl.g:2669:2: rule__OrMappingRule__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OrMappingRule__Group_3__1__Impl();

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
    // $ANTLR end "rule__OrMappingRule__Group_3__1"


    // $ANTLR start "rule__OrMappingRule__Group_3__1__Impl"
    // InternalDsl.g:2675:1: rule__OrMappingRule__Group_3__1__Impl : ( ( rule__OrMappingRule__RulesAssignment_3_1 ) ) ;
    public final void rule__OrMappingRule__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2679:1: ( ( ( rule__OrMappingRule__RulesAssignment_3_1 ) ) )
            // InternalDsl.g:2680:1: ( ( rule__OrMappingRule__RulesAssignment_3_1 ) )
            {
            // InternalDsl.g:2680:1: ( ( rule__OrMappingRule__RulesAssignment_3_1 ) )
            // InternalDsl.g:2681:2: ( rule__OrMappingRule__RulesAssignment_3_1 )
            {
             before(grammarAccess.getOrMappingRuleAccess().getRulesAssignment_3_1()); 
            // InternalDsl.g:2682:2: ( rule__OrMappingRule__RulesAssignment_3_1 )
            // InternalDsl.g:2682:3: rule__OrMappingRule__RulesAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__OrMappingRule__RulesAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getOrMappingRuleAccess().getRulesAssignment_3_1()); 

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
    // $ANTLR end "rule__OrMappingRule__Group_3__1__Impl"


    // $ANTLR start "rule__ImplicationMappingRule__Group__0"
    // InternalDsl.g:2691:1: rule__ImplicationMappingRule__Group__0 : rule__ImplicationMappingRule__Group__0__Impl rule__ImplicationMappingRule__Group__1 ;
    public final void rule__ImplicationMappingRule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2695:1: ( rule__ImplicationMappingRule__Group__0__Impl rule__ImplicationMappingRule__Group__1 )
            // InternalDsl.g:2696:2: rule__ImplicationMappingRule__Group__0__Impl rule__ImplicationMappingRule__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__ImplicationMappingRule__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ImplicationMappingRule__Group__1();

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
    // $ANTLR end "rule__ImplicationMappingRule__Group__0"


    // $ANTLR start "rule__ImplicationMappingRule__Group__0__Impl"
    // InternalDsl.g:2703:1: rule__ImplicationMappingRule__Group__0__Impl : ( 'ImplicationMappingRule' ) ;
    public final void rule__ImplicationMappingRule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2707:1: ( ( 'ImplicationMappingRule' ) )
            // InternalDsl.g:2708:1: ( 'ImplicationMappingRule' )
            {
            // InternalDsl.g:2708:1: ( 'ImplicationMappingRule' )
            // InternalDsl.g:2709:2: 'ImplicationMappingRule'
            {
             before(grammarAccess.getImplicationMappingRuleAccess().getImplicationMappingRuleKeyword_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getImplicationMappingRuleAccess().getImplicationMappingRuleKeyword_0()); 

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
    // $ANTLR end "rule__ImplicationMappingRule__Group__0__Impl"


    // $ANTLR start "rule__ImplicationMappingRule__Group__1"
    // InternalDsl.g:2718:1: rule__ImplicationMappingRule__Group__1 : rule__ImplicationMappingRule__Group__1__Impl rule__ImplicationMappingRule__Group__2 ;
    public final void rule__ImplicationMappingRule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2722:1: ( rule__ImplicationMappingRule__Group__1__Impl rule__ImplicationMappingRule__Group__2 )
            // InternalDsl.g:2723:2: rule__ImplicationMappingRule__Group__1__Impl rule__ImplicationMappingRule__Group__2
            {
            pushFollow(FOLLOW_21);
            rule__ImplicationMappingRule__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ImplicationMappingRule__Group__2();

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
    // $ANTLR end "rule__ImplicationMappingRule__Group__1"


    // $ANTLR start "rule__ImplicationMappingRule__Group__1__Impl"
    // InternalDsl.g:2730:1: rule__ImplicationMappingRule__Group__1__Impl : ( '{' ) ;
    public final void rule__ImplicationMappingRule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2734:1: ( ( '{' ) )
            // InternalDsl.g:2735:1: ( '{' )
            {
            // InternalDsl.g:2735:1: ( '{' )
            // InternalDsl.g:2736:2: '{'
            {
             before(grammarAccess.getImplicationMappingRuleAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getImplicationMappingRuleAccess().getLeftCurlyBracketKeyword_1()); 

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
    // $ANTLR end "rule__ImplicationMappingRule__Group__1__Impl"


    // $ANTLR start "rule__ImplicationMappingRule__Group__2"
    // InternalDsl.g:2745:1: rule__ImplicationMappingRule__Group__2 : rule__ImplicationMappingRule__Group__2__Impl rule__ImplicationMappingRule__Group__3 ;
    public final void rule__ImplicationMappingRule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2749:1: ( rule__ImplicationMappingRule__Group__2__Impl rule__ImplicationMappingRule__Group__3 )
            // InternalDsl.g:2750:2: rule__ImplicationMappingRule__Group__2__Impl rule__ImplicationMappingRule__Group__3
            {
            pushFollow(FOLLOW_20);
            rule__ImplicationMappingRule__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ImplicationMappingRule__Group__3();

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
    // $ANTLR end "rule__ImplicationMappingRule__Group__2"


    // $ANTLR start "rule__ImplicationMappingRule__Group__2__Impl"
    // InternalDsl.g:2757:1: rule__ImplicationMappingRule__Group__2__Impl : ( 'if' ) ;
    public final void rule__ImplicationMappingRule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2761:1: ( ( 'if' ) )
            // InternalDsl.g:2762:1: ( 'if' )
            {
            // InternalDsl.g:2762:1: ( 'if' )
            // InternalDsl.g:2763:2: 'if'
            {
             before(grammarAccess.getImplicationMappingRuleAccess().getIfKeyword_2()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getImplicationMappingRuleAccess().getIfKeyword_2()); 

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
    // $ANTLR end "rule__ImplicationMappingRule__Group__2__Impl"


    // $ANTLR start "rule__ImplicationMappingRule__Group__3"
    // InternalDsl.g:2772:1: rule__ImplicationMappingRule__Group__3 : rule__ImplicationMappingRule__Group__3__Impl rule__ImplicationMappingRule__Group__4 ;
    public final void rule__ImplicationMappingRule__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2776:1: ( rule__ImplicationMappingRule__Group__3__Impl rule__ImplicationMappingRule__Group__4 )
            // InternalDsl.g:2777:2: rule__ImplicationMappingRule__Group__3__Impl rule__ImplicationMappingRule__Group__4
            {
            pushFollow(FOLLOW_22);
            rule__ImplicationMappingRule__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ImplicationMappingRule__Group__4();

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
    // $ANTLR end "rule__ImplicationMappingRule__Group__3"


    // $ANTLR start "rule__ImplicationMappingRule__Group__3__Impl"
    // InternalDsl.g:2784:1: rule__ImplicationMappingRule__Group__3__Impl : ( ( rule__ImplicationMappingRule__AntecedentAssignment_3 ) ) ;
    public final void rule__ImplicationMappingRule__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2788:1: ( ( ( rule__ImplicationMappingRule__AntecedentAssignment_3 ) ) )
            // InternalDsl.g:2789:1: ( ( rule__ImplicationMappingRule__AntecedentAssignment_3 ) )
            {
            // InternalDsl.g:2789:1: ( ( rule__ImplicationMappingRule__AntecedentAssignment_3 ) )
            // InternalDsl.g:2790:2: ( rule__ImplicationMappingRule__AntecedentAssignment_3 )
            {
             before(grammarAccess.getImplicationMappingRuleAccess().getAntecedentAssignment_3()); 
            // InternalDsl.g:2791:2: ( rule__ImplicationMappingRule__AntecedentAssignment_3 )
            // InternalDsl.g:2791:3: rule__ImplicationMappingRule__AntecedentAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__ImplicationMappingRule__AntecedentAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getImplicationMappingRuleAccess().getAntecedentAssignment_3()); 

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
    // $ANTLR end "rule__ImplicationMappingRule__Group__3__Impl"


    // $ANTLR start "rule__ImplicationMappingRule__Group__4"
    // InternalDsl.g:2799:1: rule__ImplicationMappingRule__Group__4 : rule__ImplicationMappingRule__Group__4__Impl rule__ImplicationMappingRule__Group__5 ;
    public final void rule__ImplicationMappingRule__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2803:1: ( rule__ImplicationMappingRule__Group__4__Impl rule__ImplicationMappingRule__Group__5 )
            // InternalDsl.g:2804:2: rule__ImplicationMappingRule__Group__4__Impl rule__ImplicationMappingRule__Group__5
            {
            pushFollow(FOLLOW_20);
            rule__ImplicationMappingRule__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ImplicationMappingRule__Group__5();

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
    // $ANTLR end "rule__ImplicationMappingRule__Group__4"


    // $ANTLR start "rule__ImplicationMappingRule__Group__4__Impl"
    // InternalDsl.g:2811:1: rule__ImplicationMappingRule__Group__4__Impl : ( 'then' ) ;
    public final void rule__ImplicationMappingRule__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2815:1: ( ( 'then' ) )
            // InternalDsl.g:2816:1: ( 'then' )
            {
            // InternalDsl.g:2816:1: ( 'then' )
            // InternalDsl.g:2817:2: 'then'
            {
             before(grammarAccess.getImplicationMappingRuleAccess().getThenKeyword_4()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getImplicationMappingRuleAccess().getThenKeyword_4()); 

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
    // $ANTLR end "rule__ImplicationMappingRule__Group__4__Impl"


    // $ANTLR start "rule__ImplicationMappingRule__Group__5"
    // InternalDsl.g:2826:1: rule__ImplicationMappingRule__Group__5 : rule__ImplicationMappingRule__Group__5__Impl rule__ImplicationMappingRule__Group__6 ;
    public final void rule__ImplicationMappingRule__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2830:1: ( rule__ImplicationMappingRule__Group__5__Impl rule__ImplicationMappingRule__Group__6 )
            // InternalDsl.g:2831:2: rule__ImplicationMappingRule__Group__5__Impl rule__ImplicationMappingRule__Group__6
            {
            pushFollow(FOLLOW_14);
            rule__ImplicationMappingRule__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ImplicationMappingRule__Group__6();

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
    // $ANTLR end "rule__ImplicationMappingRule__Group__5"


    // $ANTLR start "rule__ImplicationMappingRule__Group__5__Impl"
    // InternalDsl.g:2838:1: rule__ImplicationMappingRule__Group__5__Impl : ( ( rule__ImplicationMappingRule__ConsequentAssignment_5 ) ) ;
    public final void rule__ImplicationMappingRule__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2842:1: ( ( ( rule__ImplicationMappingRule__ConsequentAssignment_5 ) ) )
            // InternalDsl.g:2843:1: ( ( rule__ImplicationMappingRule__ConsequentAssignment_5 ) )
            {
            // InternalDsl.g:2843:1: ( ( rule__ImplicationMappingRule__ConsequentAssignment_5 ) )
            // InternalDsl.g:2844:2: ( rule__ImplicationMappingRule__ConsequentAssignment_5 )
            {
             before(grammarAccess.getImplicationMappingRuleAccess().getConsequentAssignment_5()); 
            // InternalDsl.g:2845:2: ( rule__ImplicationMappingRule__ConsequentAssignment_5 )
            // InternalDsl.g:2845:3: rule__ImplicationMappingRule__ConsequentAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__ImplicationMappingRule__ConsequentAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getImplicationMappingRuleAccess().getConsequentAssignment_5()); 

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
    // $ANTLR end "rule__ImplicationMappingRule__Group__5__Impl"


    // $ANTLR start "rule__ImplicationMappingRule__Group__6"
    // InternalDsl.g:2853:1: rule__ImplicationMappingRule__Group__6 : rule__ImplicationMappingRule__Group__6__Impl ;
    public final void rule__ImplicationMappingRule__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2857:1: ( rule__ImplicationMappingRule__Group__6__Impl )
            // InternalDsl.g:2858:2: rule__ImplicationMappingRule__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ImplicationMappingRule__Group__6__Impl();

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
    // $ANTLR end "rule__ImplicationMappingRule__Group__6"


    // $ANTLR start "rule__ImplicationMappingRule__Group__6__Impl"
    // InternalDsl.g:2864:1: rule__ImplicationMappingRule__Group__6__Impl : ( '}' ) ;
    public final void rule__ImplicationMappingRule__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2868:1: ( ( '}' ) )
            // InternalDsl.g:2869:1: ( '}' )
            {
            // InternalDsl.g:2869:1: ( '}' )
            // InternalDsl.g:2870:2: '}'
            {
             before(grammarAccess.getImplicationMappingRuleAccess().getRightCurlyBracketKeyword_6()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getImplicationMappingRuleAccess().getRightCurlyBracketKeyword_6()); 

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
    // $ANTLR end "rule__ImplicationMappingRule__Group__6__Impl"


    // $ANTLR start "rule__TrueMappingRule__Group__0"
    // InternalDsl.g:2880:1: rule__TrueMappingRule__Group__0 : rule__TrueMappingRule__Group__0__Impl rule__TrueMappingRule__Group__1 ;
    public final void rule__TrueMappingRule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2884:1: ( rule__TrueMappingRule__Group__0__Impl rule__TrueMappingRule__Group__1 )
            // InternalDsl.g:2885:2: rule__TrueMappingRule__Group__0__Impl rule__TrueMappingRule__Group__1
            {
            pushFollow(FOLLOW_20);
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
    // InternalDsl.g:2892:1: rule__TrueMappingRule__Group__0__Impl : ( () ) ;
    public final void rule__TrueMappingRule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2896:1: ( ( () ) )
            // InternalDsl.g:2897:1: ( () )
            {
            // InternalDsl.g:2897:1: ( () )
            // InternalDsl.g:2898:2: ()
            {
             before(grammarAccess.getTrueMappingRuleAccess().getTrueMappingRuleAction_0()); 
            // InternalDsl.g:2899:2: ()
            // InternalDsl.g:2899:3: 
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
    // InternalDsl.g:2907:1: rule__TrueMappingRule__Group__1 : rule__TrueMappingRule__Group__1__Impl ;
    public final void rule__TrueMappingRule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2911:1: ( rule__TrueMappingRule__Group__1__Impl )
            // InternalDsl.g:2912:2: rule__TrueMappingRule__Group__1__Impl
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
    // InternalDsl.g:2918:1: rule__TrueMappingRule__Group__1__Impl : ( 'TrueMappingRule' ) ;
    public final void rule__TrueMappingRule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2922:1: ( ( 'TrueMappingRule' ) )
            // InternalDsl.g:2923:1: ( 'TrueMappingRule' )
            {
            // InternalDsl.g:2923:1: ( 'TrueMappingRule' )
            // InternalDsl.g:2924:2: 'TrueMappingRule'
            {
             before(grammarAccess.getTrueMappingRuleAccess().getTrueMappingRuleKeyword_1()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getTrueMappingRuleAccess().getTrueMappingRuleKeyword_1()); 

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
    // InternalDsl.g:2934:1: rule__RelationIsCyclicRule__Group__0 : rule__RelationIsCyclicRule__Group__0__Impl rule__RelationIsCyclicRule__Group__1 ;
    public final void rule__RelationIsCyclicRule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2938:1: ( rule__RelationIsCyclicRule__Group__0__Impl rule__RelationIsCyclicRule__Group__1 )
            // InternalDsl.g:2939:2: rule__RelationIsCyclicRule__Group__0__Impl rule__RelationIsCyclicRule__Group__1
            {
            pushFollow(FOLLOW_23);
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
    // InternalDsl.g:2946:1: rule__RelationIsCyclicRule__Group__0__Impl : ( () ) ;
    public final void rule__RelationIsCyclicRule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2950:1: ( ( () ) )
            // InternalDsl.g:2951:1: ( () )
            {
            // InternalDsl.g:2951:1: ( () )
            // InternalDsl.g:2952:2: ()
            {
             before(grammarAccess.getRelationIsCyclicRuleAccess().getRelationIsCyclicRuleAction_0()); 
            // InternalDsl.g:2953:2: ()
            // InternalDsl.g:2953:3: 
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
    // InternalDsl.g:2961:1: rule__RelationIsCyclicRule__Group__1 : rule__RelationIsCyclicRule__Group__1__Impl ;
    public final void rule__RelationIsCyclicRule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2965:1: ( rule__RelationIsCyclicRule__Group__1__Impl )
            // InternalDsl.g:2966:2: rule__RelationIsCyclicRule__Group__1__Impl
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
    // InternalDsl.g:2972:1: rule__RelationIsCyclicRule__Group__1__Impl : ( 'RelationIsCyclicRule' ) ;
    public final void rule__RelationIsCyclicRule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2976:1: ( ( 'RelationIsCyclicRule' ) )
            // InternalDsl.g:2977:1: ( 'RelationIsCyclicRule' )
            {
            // InternalDsl.g:2977:1: ( 'RelationIsCyclicRule' )
            // InternalDsl.g:2978:2: 'RelationIsCyclicRule'
            {
             before(grammarAccess.getRelationIsCyclicRuleAccess().getRelationIsCyclicRuleKeyword_1()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getRelationIsCyclicRuleAccess().getRelationIsCyclicRuleKeyword_1()); 

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
    // InternalDsl.g:2988:1: rule__RelationTypesAreEqualRule__Group__0 : rule__RelationTypesAreEqualRule__Group__0__Impl rule__RelationTypesAreEqualRule__Group__1 ;
    public final void rule__RelationTypesAreEqualRule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2992:1: ( rule__RelationTypesAreEqualRule__Group__0__Impl rule__RelationTypesAreEqualRule__Group__1 )
            // InternalDsl.g:2993:2: rule__RelationTypesAreEqualRule__Group__0__Impl rule__RelationTypesAreEqualRule__Group__1
            {
            pushFollow(FOLLOW_24);
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
    // InternalDsl.g:3000:1: rule__RelationTypesAreEqualRule__Group__0__Impl : ( () ) ;
    public final void rule__RelationTypesAreEqualRule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3004:1: ( ( () ) )
            // InternalDsl.g:3005:1: ( () )
            {
            // InternalDsl.g:3005:1: ( () )
            // InternalDsl.g:3006:2: ()
            {
             before(grammarAccess.getRelationTypesAreEqualRuleAccess().getRelationTypesAreEqualRuleAction_0()); 
            // InternalDsl.g:3007:2: ()
            // InternalDsl.g:3007:3: 
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
    // InternalDsl.g:3015:1: rule__RelationTypesAreEqualRule__Group__1 : rule__RelationTypesAreEqualRule__Group__1__Impl ;
    public final void rule__RelationTypesAreEqualRule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3019:1: ( rule__RelationTypesAreEqualRule__Group__1__Impl )
            // InternalDsl.g:3020:2: rule__RelationTypesAreEqualRule__Group__1__Impl
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
    // InternalDsl.g:3026:1: rule__RelationTypesAreEqualRule__Group__1__Impl : ( 'RelationTypesAreEqualRule' ) ;
    public final void rule__RelationTypesAreEqualRule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3030:1: ( ( 'RelationTypesAreEqualRule' ) )
            // InternalDsl.g:3031:1: ( 'RelationTypesAreEqualRule' )
            {
            // InternalDsl.g:3031:1: ( 'RelationTypesAreEqualRule' )
            // InternalDsl.g:3032:2: 'RelationTypesAreEqualRule'
            {
             before(grammarAccess.getRelationTypesAreEqualRuleAccess().getRelationTypesAreEqualRuleKeyword_1()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getRelationTypesAreEqualRuleAccess().getRelationTypesAreEqualRuleKeyword_1()); 

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
    // InternalDsl.g:3042:1: rule__RelationIsReflexivRule__Group__0 : rule__RelationIsReflexivRule__Group__0__Impl rule__RelationIsReflexivRule__Group__1 ;
    public final void rule__RelationIsReflexivRule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3046:1: ( rule__RelationIsReflexivRule__Group__0__Impl rule__RelationIsReflexivRule__Group__1 )
            // InternalDsl.g:3047:2: rule__RelationIsReflexivRule__Group__0__Impl rule__RelationIsReflexivRule__Group__1
            {
            pushFollow(FOLLOW_25);
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
    // InternalDsl.g:3054:1: rule__RelationIsReflexivRule__Group__0__Impl : ( () ) ;
    public final void rule__RelationIsReflexivRule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3058:1: ( ( () ) )
            // InternalDsl.g:3059:1: ( () )
            {
            // InternalDsl.g:3059:1: ( () )
            // InternalDsl.g:3060:2: ()
            {
             before(grammarAccess.getRelationIsReflexivRuleAccess().getRelationIsReflexivRuleAction_0()); 
            // InternalDsl.g:3061:2: ()
            // InternalDsl.g:3061:3: 
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
    // InternalDsl.g:3069:1: rule__RelationIsReflexivRule__Group__1 : rule__RelationIsReflexivRule__Group__1__Impl ;
    public final void rule__RelationIsReflexivRule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3073:1: ( rule__RelationIsReflexivRule__Group__1__Impl )
            // InternalDsl.g:3074:2: rule__RelationIsReflexivRule__Group__1__Impl
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
    // InternalDsl.g:3080:1: rule__RelationIsReflexivRule__Group__1__Impl : ( 'RelationIsReflexivRule' ) ;
    public final void rule__RelationIsReflexivRule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3084:1: ( ( 'RelationIsReflexivRule' ) )
            // InternalDsl.g:3085:1: ( 'RelationIsReflexivRule' )
            {
            // InternalDsl.g:3085:1: ( 'RelationIsReflexivRule' )
            // InternalDsl.g:3086:2: 'RelationIsReflexivRule'
            {
             before(grammarAccess.getRelationIsReflexivRuleAccess().getRelationIsReflexivRuleKeyword_1()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getRelationIsReflexivRuleAccess().getRelationIsReflexivRuleKeyword_1()); 

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


    // $ANTLR start "rule__AndRule__Group__0"
    // InternalDsl.g:3096:1: rule__AndRule__Group__0 : rule__AndRule__Group__0__Impl rule__AndRule__Group__1 ;
    public final void rule__AndRule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3100:1: ( rule__AndRule__Group__0__Impl rule__AndRule__Group__1 )
            // InternalDsl.g:3101:2: rule__AndRule__Group__0__Impl rule__AndRule__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__AndRule__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AndRule__Group__1();

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
    // $ANTLR end "rule__AndRule__Group__0"


    // $ANTLR start "rule__AndRule__Group__0__Impl"
    // InternalDsl.g:3108:1: rule__AndRule__Group__0__Impl : ( 'AndRule' ) ;
    public final void rule__AndRule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3112:1: ( ( 'AndRule' ) )
            // InternalDsl.g:3113:1: ( 'AndRule' )
            {
            // InternalDsl.g:3113:1: ( 'AndRule' )
            // InternalDsl.g:3114:2: 'AndRule'
            {
             before(grammarAccess.getAndRuleAccess().getAndRuleKeyword_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getAndRuleAccess().getAndRuleKeyword_0()); 

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
    // $ANTLR end "rule__AndRule__Group__0__Impl"


    // $ANTLR start "rule__AndRule__Group__1"
    // InternalDsl.g:3123:1: rule__AndRule__Group__1 : rule__AndRule__Group__1__Impl rule__AndRule__Group__2 ;
    public final void rule__AndRule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3127:1: ( rule__AndRule__Group__1__Impl rule__AndRule__Group__2 )
            // InternalDsl.g:3128:2: rule__AndRule__Group__1__Impl rule__AndRule__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__AndRule__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AndRule__Group__2();

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
    // $ANTLR end "rule__AndRule__Group__1"


    // $ANTLR start "rule__AndRule__Group__1__Impl"
    // InternalDsl.g:3135:1: rule__AndRule__Group__1__Impl : ( '{' ) ;
    public final void rule__AndRule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3139:1: ( ( '{' ) )
            // InternalDsl.g:3140:1: ( '{' )
            {
            // InternalDsl.g:3140:1: ( '{' )
            // InternalDsl.g:3141:2: '{'
            {
             before(grammarAccess.getAndRuleAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getAndRuleAccess().getLeftCurlyBracketKeyword_1()); 

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
    // $ANTLR end "rule__AndRule__Group__1__Impl"


    // $ANTLR start "rule__AndRule__Group__2"
    // InternalDsl.g:3150:1: rule__AndRule__Group__2 : rule__AndRule__Group__2__Impl rule__AndRule__Group__3 ;
    public final void rule__AndRule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3154:1: ( rule__AndRule__Group__2__Impl rule__AndRule__Group__3 )
            // InternalDsl.g:3155:2: rule__AndRule__Group__2__Impl rule__AndRule__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__AndRule__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AndRule__Group__3();

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
    // $ANTLR end "rule__AndRule__Group__2"


    // $ANTLR start "rule__AndRule__Group__2__Impl"
    // InternalDsl.g:3162:1: rule__AndRule__Group__2__Impl : ( ( rule__AndRule__RulesAssignment_2 ) ) ;
    public final void rule__AndRule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3166:1: ( ( ( rule__AndRule__RulesAssignment_2 ) ) )
            // InternalDsl.g:3167:1: ( ( rule__AndRule__RulesAssignment_2 ) )
            {
            // InternalDsl.g:3167:1: ( ( rule__AndRule__RulesAssignment_2 ) )
            // InternalDsl.g:3168:2: ( rule__AndRule__RulesAssignment_2 )
            {
             before(grammarAccess.getAndRuleAccess().getRulesAssignment_2()); 
            // InternalDsl.g:3169:2: ( rule__AndRule__RulesAssignment_2 )
            // InternalDsl.g:3169:3: rule__AndRule__RulesAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__AndRule__RulesAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAndRuleAccess().getRulesAssignment_2()); 

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
    // $ANTLR end "rule__AndRule__Group__2__Impl"


    // $ANTLR start "rule__AndRule__Group__3"
    // InternalDsl.g:3177:1: rule__AndRule__Group__3 : rule__AndRule__Group__3__Impl rule__AndRule__Group__4 ;
    public final void rule__AndRule__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3181:1: ( rule__AndRule__Group__3__Impl rule__AndRule__Group__4 )
            // InternalDsl.g:3182:2: rule__AndRule__Group__3__Impl rule__AndRule__Group__4
            {
            pushFollow(FOLLOW_8);
            rule__AndRule__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AndRule__Group__4();

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
    // $ANTLR end "rule__AndRule__Group__3"


    // $ANTLR start "rule__AndRule__Group__3__Impl"
    // InternalDsl.g:3189:1: rule__AndRule__Group__3__Impl : ( ( rule__AndRule__Group_3__0 )* ) ;
    public final void rule__AndRule__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3193:1: ( ( ( rule__AndRule__Group_3__0 )* ) )
            // InternalDsl.g:3194:1: ( ( rule__AndRule__Group_3__0 )* )
            {
            // InternalDsl.g:3194:1: ( ( rule__AndRule__Group_3__0 )* )
            // InternalDsl.g:3195:2: ( rule__AndRule__Group_3__0 )*
            {
             before(grammarAccess.getAndRuleAccess().getGroup_3()); 
            // InternalDsl.g:3196:2: ( rule__AndRule__Group_3__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==16) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalDsl.g:3196:3: rule__AndRule__Group_3__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__AndRule__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getAndRuleAccess().getGroup_3()); 

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
    // $ANTLR end "rule__AndRule__Group__3__Impl"


    // $ANTLR start "rule__AndRule__Group__4"
    // InternalDsl.g:3204:1: rule__AndRule__Group__4 : rule__AndRule__Group__4__Impl ;
    public final void rule__AndRule__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3208:1: ( rule__AndRule__Group__4__Impl )
            // InternalDsl.g:3209:2: rule__AndRule__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AndRule__Group__4__Impl();

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
    // $ANTLR end "rule__AndRule__Group__4"


    // $ANTLR start "rule__AndRule__Group__4__Impl"
    // InternalDsl.g:3215:1: rule__AndRule__Group__4__Impl : ( '}' ) ;
    public final void rule__AndRule__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3219:1: ( ( '}' ) )
            // InternalDsl.g:3220:1: ( '}' )
            {
            // InternalDsl.g:3220:1: ( '}' )
            // InternalDsl.g:3221:2: '}'
            {
             before(grammarAccess.getAndRuleAccess().getRightCurlyBracketKeyword_4()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getAndRuleAccess().getRightCurlyBracketKeyword_4()); 

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
    // $ANTLR end "rule__AndRule__Group__4__Impl"


    // $ANTLR start "rule__AndRule__Group_3__0"
    // InternalDsl.g:3231:1: rule__AndRule__Group_3__0 : rule__AndRule__Group_3__0__Impl rule__AndRule__Group_3__1 ;
    public final void rule__AndRule__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3235:1: ( rule__AndRule__Group_3__0__Impl rule__AndRule__Group_3__1 )
            // InternalDsl.g:3236:2: rule__AndRule__Group_3__0__Impl rule__AndRule__Group_3__1
            {
            pushFollow(FOLLOW_13);
            rule__AndRule__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AndRule__Group_3__1();

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
    // $ANTLR end "rule__AndRule__Group_3__0"


    // $ANTLR start "rule__AndRule__Group_3__0__Impl"
    // InternalDsl.g:3243:1: rule__AndRule__Group_3__0__Impl : ( ',' ) ;
    public final void rule__AndRule__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3247:1: ( ( ',' ) )
            // InternalDsl.g:3248:1: ( ',' )
            {
            // InternalDsl.g:3248:1: ( ',' )
            // InternalDsl.g:3249:2: ','
            {
             before(grammarAccess.getAndRuleAccess().getCommaKeyword_3_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getAndRuleAccess().getCommaKeyword_3_0()); 

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
    // $ANTLR end "rule__AndRule__Group_3__0__Impl"


    // $ANTLR start "rule__AndRule__Group_3__1"
    // InternalDsl.g:3258:1: rule__AndRule__Group_3__1 : rule__AndRule__Group_3__1__Impl ;
    public final void rule__AndRule__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3262:1: ( rule__AndRule__Group_3__1__Impl )
            // InternalDsl.g:3263:2: rule__AndRule__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AndRule__Group_3__1__Impl();

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
    // $ANTLR end "rule__AndRule__Group_3__1"


    // $ANTLR start "rule__AndRule__Group_3__1__Impl"
    // InternalDsl.g:3269:1: rule__AndRule__Group_3__1__Impl : ( ( rule__AndRule__RulesAssignment_3_1 ) ) ;
    public final void rule__AndRule__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3273:1: ( ( ( rule__AndRule__RulesAssignment_3_1 ) ) )
            // InternalDsl.g:3274:1: ( ( rule__AndRule__RulesAssignment_3_1 ) )
            {
            // InternalDsl.g:3274:1: ( ( rule__AndRule__RulesAssignment_3_1 ) )
            // InternalDsl.g:3275:2: ( rule__AndRule__RulesAssignment_3_1 )
            {
             before(grammarAccess.getAndRuleAccess().getRulesAssignment_3_1()); 
            // InternalDsl.g:3276:2: ( rule__AndRule__RulesAssignment_3_1 )
            // InternalDsl.g:3276:3: rule__AndRule__RulesAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__AndRule__RulesAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getAndRuleAccess().getRulesAssignment_3_1()); 

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
    // $ANTLR end "rule__AndRule__Group_3__1__Impl"


    // $ANTLR start "rule__RelationNameRule__Group__0"
    // InternalDsl.g:3285:1: rule__RelationNameRule__Group__0 : rule__RelationNameRule__Group__0__Impl rule__RelationNameRule__Group__1 ;
    public final void rule__RelationNameRule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3289:1: ( rule__RelationNameRule__Group__0__Impl rule__RelationNameRule__Group__1 )
            // InternalDsl.g:3290:2: rule__RelationNameRule__Group__0__Impl rule__RelationNameRule__Group__1
            {
            pushFollow(FOLLOW_26);
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
    // InternalDsl.g:3297:1: rule__RelationNameRule__Group__0__Impl : ( () ) ;
    public final void rule__RelationNameRule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3301:1: ( ( () ) )
            // InternalDsl.g:3302:1: ( () )
            {
            // InternalDsl.g:3302:1: ( () )
            // InternalDsl.g:3303:2: ()
            {
             before(grammarAccess.getRelationNameRuleAccess().getRelationNameRuleAction_0()); 
            // InternalDsl.g:3304:2: ()
            // InternalDsl.g:3304:3: 
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
    // InternalDsl.g:3312:1: rule__RelationNameRule__Group__1 : rule__RelationNameRule__Group__1__Impl rule__RelationNameRule__Group__2 ;
    public final void rule__RelationNameRule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3316:1: ( rule__RelationNameRule__Group__1__Impl rule__RelationNameRule__Group__2 )
            // InternalDsl.g:3317:2: rule__RelationNameRule__Group__1__Impl rule__RelationNameRule__Group__2
            {
            pushFollow(FOLLOW_19);
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
    // InternalDsl.g:3324:1: rule__RelationNameRule__Group__1__Impl : ( 'RelationNameRule' ) ;
    public final void rule__RelationNameRule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3328:1: ( ( 'RelationNameRule' ) )
            // InternalDsl.g:3329:1: ( 'RelationNameRule' )
            {
            // InternalDsl.g:3329:1: ( 'RelationNameRule' )
            // InternalDsl.g:3330:2: 'RelationNameRule'
            {
             before(grammarAccess.getRelationNameRuleAccess().getRelationNameRuleKeyword_1()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getRelationNameRuleAccess().getRelationNameRuleKeyword_1()); 

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
    // InternalDsl.g:3339:1: rule__RelationNameRule__Group__2 : rule__RelationNameRule__Group__2__Impl ;
    public final void rule__RelationNameRule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3343:1: ( rule__RelationNameRule__Group__2__Impl )
            // InternalDsl.g:3344:2: rule__RelationNameRule__Group__2__Impl
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
    // InternalDsl.g:3350:1: rule__RelationNameRule__Group__2__Impl : ( ( rule__RelationNameRule__NameAssignment_2 ) ) ;
    public final void rule__RelationNameRule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3354:1: ( ( ( rule__RelationNameRule__NameAssignment_2 ) ) )
            // InternalDsl.g:3355:1: ( ( rule__RelationNameRule__NameAssignment_2 ) )
            {
            // InternalDsl.g:3355:1: ( ( rule__RelationNameRule__NameAssignment_2 ) )
            // InternalDsl.g:3356:2: ( rule__RelationNameRule__NameAssignment_2 )
            {
             before(grammarAccess.getRelationNameRuleAccess().getNameAssignment_2()); 
            // InternalDsl.g:3357:2: ( rule__RelationNameRule__NameAssignment_2 )
            // InternalDsl.g:3357:3: rule__RelationNameRule__NameAssignment_2
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
    // InternalDsl.g:3366:1: rule__TypeExistsRule__Group__0 : rule__TypeExistsRule__Group__0__Impl rule__TypeExistsRule__Group__1 ;
    public final void rule__TypeExistsRule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3370:1: ( rule__TypeExistsRule__Group__0__Impl rule__TypeExistsRule__Group__1 )
            // InternalDsl.g:3371:2: rule__TypeExistsRule__Group__0__Impl rule__TypeExistsRule__Group__1
            {
            pushFollow(FOLLOW_13);
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
    // InternalDsl.g:3378:1: rule__TypeExistsRule__Group__0__Impl : ( () ) ;
    public final void rule__TypeExistsRule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3382:1: ( ( () ) )
            // InternalDsl.g:3383:1: ( () )
            {
            // InternalDsl.g:3383:1: ( () )
            // InternalDsl.g:3384:2: ()
            {
             before(grammarAccess.getTypeExistsRuleAccess().getTypeExistsRuleAction_0()); 
            // InternalDsl.g:3385:2: ()
            // InternalDsl.g:3385:3: 
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
    // InternalDsl.g:3393:1: rule__TypeExistsRule__Group__1 : rule__TypeExistsRule__Group__1__Impl rule__TypeExistsRule__Group__2 ;
    public final void rule__TypeExistsRule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3397:1: ( rule__TypeExistsRule__Group__1__Impl rule__TypeExistsRule__Group__2 )
            // InternalDsl.g:3398:2: rule__TypeExistsRule__Group__1__Impl rule__TypeExistsRule__Group__2
            {
            pushFollow(FOLLOW_19);
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
    // InternalDsl.g:3405:1: rule__TypeExistsRule__Group__1__Impl : ( 'TypeExistsRule' ) ;
    public final void rule__TypeExistsRule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3409:1: ( ( 'TypeExistsRule' ) )
            // InternalDsl.g:3410:1: ( 'TypeExistsRule' )
            {
            // InternalDsl.g:3410:1: ( 'TypeExistsRule' )
            // InternalDsl.g:3411:2: 'TypeExistsRule'
            {
             before(grammarAccess.getTypeExistsRuleAccess().getTypeExistsRuleKeyword_1()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getTypeExistsRuleAccess().getTypeExistsRuleKeyword_1()); 

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
    // InternalDsl.g:3420:1: rule__TypeExistsRule__Group__2 : rule__TypeExistsRule__Group__2__Impl ;
    public final void rule__TypeExistsRule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3424:1: ( rule__TypeExistsRule__Group__2__Impl )
            // InternalDsl.g:3425:2: rule__TypeExistsRule__Group__2__Impl
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
    // InternalDsl.g:3431:1: rule__TypeExistsRule__Group__2__Impl : ( ( rule__TypeExistsRule__NameAssignment_2 ) ) ;
    public final void rule__TypeExistsRule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3435:1: ( ( ( rule__TypeExistsRule__NameAssignment_2 ) ) )
            // InternalDsl.g:3436:1: ( ( rule__TypeExistsRule__NameAssignment_2 ) )
            {
            // InternalDsl.g:3436:1: ( ( rule__TypeExistsRule__NameAssignment_2 ) )
            // InternalDsl.g:3437:2: ( rule__TypeExistsRule__NameAssignment_2 )
            {
             before(grammarAccess.getTypeExistsRuleAccess().getNameAssignment_2()); 
            // InternalDsl.g:3438:2: ( rule__TypeExistsRule__NameAssignment_2 )
            // InternalDsl.g:3438:3: rule__TypeExistsRule__NameAssignment_2
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


    // $ANTLR start "rule__OrRule__Group__0"
    // InternalDsl.g:3447:1: rule__OrRule__Group__0 : rule__OrRule__Group__0__Impl rule__OrRule__Group__1 ;
    public final void rule__OrRule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3451:1: ( rule__OrRule__Group__0__Impl rule__OrRule__Group__1 )
            // InternalDsl.g:3452:2: rule__OrRule__Group__0__Impl rule__OrRule__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__OrRule__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OrRule__Group__1();

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
    // $ANTLR end "rule__OrRule__Group__0"


    // $ANTLR start "rule__OrRule__Group__0__Impl"
    // InternalDsl.g:3459:1: rule__OrRule__Group__0__Impl : ( 'OrRule' ) ;
    public final void rule__OrRule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3463:1: ( ( 'OrRule' ) )
            // InternalDsl.g:3464:1: ( 'OrRule' )
            {
            // InternalDsl.g:3464:1: ( 'OrRule' )
            // InternalDsl.g:3465:2: 'OrRule'
            {
             before(grammarAccess.getOrRuleAccess().getOrRuleKeyword_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getOrRuleAccess().getOrRuleKeyword_0()); 

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
    // $ANTLR end "rule__OrRule__Group__0__Impl"


    // $ANTLR start "rule__OrRule__Group__1"
    // InternalDsl.g:3474:1: rule__OrRule__Group__1 : rule__OrRule__Group__1__Impl rule__OrRule__Group__2 ;
    public final void rule__OrRule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3478:1: ( rule__OrRule__Group__1__Impl rule__OrRule__Group__2 )
            // InternalDsl.g:3479:2: rule__OrRule__Group__1__Impl rule__OrRule__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__OrRule__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OrRule__Group__2();

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
    // $ANTLR end "rule__OrRule__Group__1"


    // $ANTLR start "rule__OrRule__Group__1__Impl"
    // InternalDsl.g:3486:1: rule__OrRule__Group__1__Impl : ( '{' ) ;
    public final void rule__OrRule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3490:1: ( ( '{' ) )
            // InternalDsl.g:3491:1: ( '{' )
            {
            // InternalDsl.g:3491:1: ( '{' )
            // InternalDsl.g:3492:2: '{'
            {
             before(grammarAccess.getOrRuleAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getOrRuleAccess().getLeftCurlyBracketKeyword_1()); 

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
    // $ANTLR end "rule__OrRule__Group__1__Impl"


    // $ANTLR start "rule__OrRule__Group__2"
    // InternalDsl.g:3501:1: rule__OrRule__Group__2 : rule__OrRule__Group__2__Impl rule__OrRule__Group__3 ;
    public final void rule__OrRule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3505:1: ( rule__OrRule__Group__2__Impl rule__OrRule__Group__3 )
            // InternalDsl.g:3506:2: rule__OrRule__Group__2__Impl rule__OrRule__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__OrRule__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OrRule__Group__3();

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
    // $ANTLR end "rule__OrRule__Group__2"


    // $ANTLR start "rule__OrRule__Group__2__Impl"
    // InternalDsl.g:3513:1: rule__OrRule__Group__2__Impl : ( ( rule__OrRule__RulesAssignment_2 ) ) ;
    public final void rule__OrRule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3517:1: ( ( ( rule__OrRule__RulesAssignment_2 ) ) )
            // InternalDsl.g:3518:1: ( ( rule__OrRule__RulesAssignment_2 ) )
            {
            // InternalDsl.g:3518:1: ( ( rule__OrRule__RulesAssignment_2 ) )
            // InternalDsl.g:3519:2: ( rule__OrRule__RulesAssignment_2 )
            {
             before(grammarAccess.getOrRuleAccess().getRulesAssignment_2()); 
            // InternalDsl.g:3520:2: ( rule__OrRule__RulesAssignment_2 )
            // InternalDsl.g:3520:3: rule__OrRule__RulesAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__OrRule__RulesAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getOrRuleAccess().getRulesAssignment_2()); 

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
    // $ANTLR end "rule__OrRule__Group__2__Impl"


    // $ANTLR start "rule__OrRule__Group__3"
    // InternalDsl.g:3528:1: rule__OrRule__Group__3 : rule__OrRule__Group__3__Impl rule__OrRule__Group__4 ;
    public final void rule__OrRule__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3532:1: ( rule__OrRule__Group__3__Impl rule__OrRule__Group__4 )
            // InternalDsl.g:3533:2: rule__OrRule__Group__3__Impl rule__OrRule__Group__4
            {
            pushFollow(FOLLOW_8);
            rule__OrRule__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OrRule__Group__4();

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
    // $ANTLR end "rule__OrRule__Group__3"


    // $ANTLR start "rule__OrRule__Group__3__Impl"
    // InternalDsl.g:3540:1: rule__OrRule__Group__3__Impl : ( ( rule__OrRule__Group_3__0 )* ) ;
    public final void rule__OrRule__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3544:1: ( ( ( rule__OrRule__Group_3__0 )* ) )
            // InternalDsl.g:3545:1: ( ( rule__OrRule__Group_3__0 )* )
            {
            // InternalDsl.g:3545:1: ( ( rule__OrRule__Group_3__0 )* )
            // InternalDsl.g:3546:2: ( rule__OrRule__Group_3__0 )*
            {
             before(grammarAccess.getOrRuleAccess().getGroup_3()); 
            // InternalDsl.g:3547:2: ( rule__OrRule__Group_3__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==16) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalDsl.g:3547:3: rule__OrRule__Group_3__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__OrRule__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getOrRuleAccess().getGroup_3()); 

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
    // $ANTLR end "rule__OrRule__Group__3__Impl"


    // $ANTLR start "rule__OrRule__Group__4"
    // InternalDsl.g:3555:1: rule__OrRule__Group__4 : rule__OrRule__Group__4__Impl ;
    public final void rule__OrRule__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3559:1: ( rule__OrRule__Group__4__Impl )
            // InternalDsl.g:3560:2: rule__OrRule__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OrRule__Group__4__Impl();

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
    // $ANTLR end "rule__OrRule__Group__4"


    // $ANTLR start "rule__OrRule__Group__4__Impl"
    // InternalDsl.g:3566:1: rule__OrRule__Group__4__Impl : ( '}' ) ;
    public final void rule__OrRule__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3570:1: ( ( '}' ) )
            // InternalDsl.g:3571:1: ( '}' )
            {
            // InternalDsl.g:3571:1: ( '}' )
            // InternalDsl.g:3572:2: '}'
            {
             before(grammarAccess.getOrRuleAccess().getRightCurlyBracketKeyword_4()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getOrRuleAccess().getRightCurlyBracketKeyword_4()); 

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
    // $ANTLR end "rule__OrRule__Group__4__Impl"


    // $ANTLR start "rule__OrRule__Group_3__0"
    // InternalDsl.g:3582:1: rule__OrRule__Group_3__0 : rule__OrRule__Group_3__0__Impl rule__OrRule__Group_3__1 ;
    public final void rule__OrRule__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3586:1: ( rule__OrRule__Group_3__0__Impl rule__OrRule__Group_3__1 )
            // InternalDsl.g:3587:2: rule__OrRule__Group_3__0__Impl rule__OrRule__Group_3__1
            {
            pushFollow(FOLLOW_13);
            rule__OrRule__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OrRule__Group_3__1();

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
    // $ANTLR end "rule__OrRule__Group_3__0"


    // $ANTLR start "rule__OrRule__Group_3__0__Impl"
    // InternalDsl.g:3594:1: rule__OrRule__Group_3__0__Impl : ( ',' ) ;
    public final void rule__OrRule__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3598:1: ( ( ',' ) )
            // InternalDsl.g:3599:1: ( ',' )
            {
            // InternalDsl.g:3599:1: ( ',' )
            // InternalDsl.g:3600:2: ','
            {
             before(grammarAccess.getOrRuleAccess().getCommaKeyword_3_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getOrRuleAccess().getCommaKeyword_3_0()); 

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
    // $ANTLR end "rule__OrRule__Group_3__0__Impl"


    // $ANTLR start "rule__OrRule__Group_3__1"
    // InternalDsl.g:3609:1: rule__OrRule__Group_3__1 : rule__OrRule__Group_3__1__Impl ;
    public final void rule__OrRule__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3613:1: ( rule__OrRule__Group_3__1__Impl )
            // InternalDsl.g:3614:2: rule__OrRule__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OrRule__Group_3__1__Impl();

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
    // $ANTLR end "rule__OrRule__Group_3__1"


    // $ANTLR start "rule__OrRule__Group_3__1__Impl"
    // InternalDsl.g:3620:1: rule__OrRule__Group_3__1__Impl : ( ( rule__OrRule__RulesAssignment_3_1 ) ) ;
    public final void rule__OrRule__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3624:1: ( ( ( rule__OrRule__RulesAssignment_3_1 ) ) )
            // InternalDsl.g:3625:1: ( ( rule__OrRule__RulesAssignment_3_1 ) )
            {
            // InternalDsl.g:3625:1: ( ( rule__OrRule__RulesAssignment_3_1 ) )
            // InternalDsl.g:3626:2: ( rule__OrRule__RulesAssignment_3_1 )
            {
             before(grammarAccess.getOrRuleAccess().getRulesAssignment_3_1()); 
            // InternalDsl.g:3627:2: ( rule__OrRule__RulesAssignment_3_1 )
            // InternalDsl.g:3627:3: rule__OrRule__RulesAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__OrRule__RulesAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getOrRuleAccess().getRulesAssignment_3_1()); 

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
    // $ANTLR end "rule__OrRule__Group_3__1__Impl"


    // $ANTLR start "rule__NotRule__Group__0"
    // InternalDsl.g:3636:1: rule__NotRule__Group__0 : rule__NotRule__Group__0__Impl rule__NotRule__Group__1 ;
    public final void rule__NotRule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3640:1: ( rule__NotRule__Group__0__Impl rule__NotRule__Group__1 )
            // InternalDsl.g:3641:2: rule__NotRule__Group__0__Impl rule__NotRule__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__NotRule__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NotRule__Group__1();

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
    // $ANTLR end "rule__NotRule__Group__0"


    // $ANTLR start "rule__NotRule__Group__0__Impl"
    // InternalDsl.g:3648:1: rule__NotRule__Group__0__Impl : ( 'NotRule' ) ;
    public final void rule__NotRule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3652:1: ( ( 'NotRule' ) )
            // InternalDsl.g:3653:1: ( 'NotRule' )
            {
            // InternalDsl.g:3653:1: ( 'NotRule' )
            // InternalDsl.g:3654:2: 'NotRule'
            {
             before(grammarAccess.getNotRuleAccess().getNotRuleKeyword_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getNotRuleAccess().getNotRuleKeyword_0()); 

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
    // $ANTLR end "rule__NotRule__Group__0__Impl"


    // $ANTLR start "rule__NotRule__Group__1"
    // InternalDsl.g:3663:1: rule__NotRule__Group__1 : rule__NotRule__Group__1__Impl rule__NotRule__Group__2 ;
    public final void rule__NotRule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3667:1: ( rule__NotRule__Group__1__Impl rule__NotRule__Group__2 )
            // InternalDsl.g:3668:2: rule__NotRule__Group__1__Impl rule__NotRule__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__NotRule__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NotRule__Group__2();

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
    // $ANTLR end "rule__NotRule__Group__1"


    // $ANTLR start "rule__NotRule__Group__1__Impl"
    // InternalDsl.g:3675:1: rule__NotRule__Group__1__Impl : ( '{' ) ;
    public final void rule__NotRule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3679:1: ( ( '{' ) )
            // InternalDsl.g:3680:1: ( '{' )
            {
            // InternalDsl.g:3680:1: ( '{' )
            // InternalDsl.g:3681:2: '{'
            {
             before(grammarAccess.getNotRuleAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getNotRuleAccess().getLeftCurlyBracketKeyword_1()); 

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
    // $ANTLR end "rule__NotRule__Group__1__Impl"


    // $ANTLR start "rule__NotRule__Group__2"
    // InternalDsl.g:3690:1: rule__NotRule__Group__2 : rule__NotRule__Group__2__Impl rule__NotRule__Group__3 ;
    public final void rule__NotRule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3694:1: ( rule__NotRule__Group__2__Impl rule__NotRule__Group__3 )
            // InternalDsl.g:3695:2: rule__NotRule__Group__2__Impl rule__NotRule__Group__3
            {
            pushFollow(FOLLOW_14);
            rule__NotRule__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NotRule__Group__3();

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
    // $ANTLR end "rule__NotRule__Group__2"


    // $ANTLR start "rule__NotRule__Group__2__Impl"
    // InternalDsl.g:3702:1: rule__NotRule__Group__2__Impl : ( ( rule__NotRule__RuleAssignment_2 ) ) ;
    public final void rule__NotRule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3706:1: ( ( ( rule__NotRule__RuleAssignment_2 ) ) )
            // InternalDsl.g:3707:1: ( ( rule__NotRule__RuleAssignment_2 ) )
            {
            // InternalDsl.g:3707:1: ( ( rule__NotRule__RuleAssignment_2 ) )
            // InternalDsl.g:3708:2: ( rule__NotRule__RuleAssignment_2 )
            {
             before(grammarAccess.getNotRuleAccess().getRuleAssignment_2()); 
            // InternalDsl.g:3709:2: ( rule__NotRule__RuleAssignment_2 )
            // InternalDsl.g:3709:3: rule__NotRule__RuleAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__NotRule__RuleAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getNotRuleAccess().getRuleAssignment_2()); 

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
    // $ANTLR end "rule__NotRule__Group__2__Impl"


    // $ANTLR start "rule__NotRule__Group__3"
    // InternalDsl.g:3717:1: rule__NotRule__Group__3 : rule__NotRule__Group__3__Impl ;
    public final void rule__NotRule__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3721:1: ( rule__NotRule__Group__3__Impl )
            // InternalDsl.g:3722:2: rule__NotRule__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NotRule__Group__3__Impl();

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
    // $ANTLR end "rule__NotRule__Group__3"


    // $ANTLR start "rule__NotRule__Group__3__Impl"
    // InternalDsl.g:3728:1: rule__NotRule__Group__3__Impl : ( '}' ) ;
    public final void rule__NotRule__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3732:1: ( ( '}' ) )
            // InternalDsl.g:3733:1: ( '}' )
            {
            // InternalDsl.g:3733:1: ( '}' )
            // InternalDsl.g:3734:2: '}'
            {
             before(grammarAccess.getNotRuleAccess().getRightCurlyBracketKeyword_3()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getNotRuleAccess().getRightCurlyBracketKeyword_3()); 

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
    // $ANTLR end "rule__NotRule__Group__3__Impl"


    // $ANTLR start "rule__ImplicationRule__Group__0"
    // InternalDsl.g:3744:1: rule__ImplicationRule__Group__0 : rule__ImplicationRule__Group__0__Impl rule__ImplicationRule__Group__1 ;
    public final void rule__ImplicationRule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3748:1: ( rule__ImplicationRule__Group__0__Impl rule__ImplicationRule__Group__1 )
            // InternalDsl.g:3749:2: rule__ImplicationRule__Group__0__Impl rule__ImplicationRule__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__ImplicationRule__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ImplicationRule__Group__1();

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
    // $ANTLR end "rule__ImplicationRule__Group__0"


    // $ANTLR start "rule__ImplicationRule__Group__0__Impl"
    // InternalDsl.g:3756:1: rule__ImplicationRule__Group__0__Impl : ( 'ImplicationRule' ) ;
    public final void rule__ImplicationRule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3760:1: ( ( 'ImplicationRule' ) )
            // InternalDsl.g:3761:1: ( 'ImplicationRule' )
            {
            // InternalDsl.g:3761:1: ( 'ImplicationRule' )
            // InternalDsl.g:3762:2: 'ImplicationRule'
            {
             before(grammarAccess.getImplicationRuleAccess().getImplicationRuleKeyword_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getImplicationRuleAccess().getImplicationRuleKeyword_0()); 

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
    // $ANTLR end "rule__ImplicationRule__Group__0__Impl"


    // $ANTLR start "rule__ImplicationRule__Group__1"
    // InternalDsl.g:3771:1: rule__ImplicationRule__Group__1 : rule__ImplicationRule__Group__1__Impl rule__ImplicationRule__Group__2 ;
    public final void rule__ImplicationRule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3775:1: ( rule__ImplicationRule__Group__1__Impl rule__ImplicationRule__Group__2 )
            // InternalDsl.g:3776:2: rule__ImplicationRule__Group__1__Impl rule__ImplicationRule__Group__2
            {
            pushFollow(FOLLOW_21);
            rule__ImplicationRule__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ImplicationRule__Group__2();

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
    // $ANTLR end "rule__ImplicationRule__Group__1"


    // $ANTLR start "rule__ImplicationRule__Group__1__Impl"
    // InternalDsl.g:3783:1: rule__ImplicationRule__Group__1__Impl : ( '{' ) ;
    public final void rule__ImplicationRule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3787:1: ( ( '{' ) )
            // InternalDsl.g:3788:1: ( '{' )
            {
            // InternalDsl.g:3788:1: ( '{' )
            // InternalDsl.g:3789:2: '{'
            {
             before(grammarAccess.getImplicationRuleAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getImplicationRuleAccess().getLeftCurlyBracketKeyword_1()); 

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
    // $ANTLR end "rule__ImplicationRule__Group__1__Impl"


    // $ANTLR start "rule__ImplicationRule__Group__2"
    // InternalDsl.g:3798:1: rule__ImplicationRule__Group__2 : rule__ImplicationRule__Group__2__Impl rule__ImplicationRule__Group__3 ;
    public final void rule__ImplicationRule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3802:1: ( rule__ImplicationRule__Group__2__Impl rule__ImplicationRule__Group__3 )
            // InternalDsl.g:3803:2: rule__ImplicationRule__Group__2__Impl rule__ImplicationRule__Group__3
            {
            pushFollow(FOLLOW_13);
            rule__ImplicationRule__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ImplicationRule__Group__3();

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
    // $ANTLR end "rule__ImplicationRule__Group__2"


    // $ANTLR start "rule__ImplicationRule__Group__2__Impl"
    // InternalDsl.g:3810:1: rule__ImplicationRule__Group__2__Impl : ( 'if' ) ;
    public final void rule__ImplicationRule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3814:1: ( ( 'if' ) )
            // InternalDsl.g:3815:1: ( 'if' )
            {
            // InternalDsl.g:3815:1: ( 'if' )
            // InternalDsl.g:3816:2: 'if'
            {
             before(grammarAccess.getImplicationRuleAccess().getIfKeyword_2()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getImplicationRuleAccess().getIfKeyword_2()); 

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
    // $ANTLR end "rule__ImplicationRule__Group__2__Impl"


    // $ANTLR start "rule__ImplicationRule__Group__3"
    // InternalDsl.g:3825:1: rule__ImplicationRule__Group__3 : rule__ImplicationRule__Group__3__Impl rule__ImplicationRule__Group__4 ;
    public final void rule__ImplicationRule__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3829:1: ( rule__ImplicationRule__Group__3__Impl rule__ImplicationRule__Group__4 )
            // InternalDsl.g:3830:2: rule__ImplicationRule__Group__3__Impl rule__ImplicationRule__Group__4
            {
            pushFollow(FOLLOW_22);
            rule__ImplicationRule__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ImplicationRule__Group__4();

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
    // $ANTLR end "rule__ImplicationRule__Group__3"


    // $ANTLR start "rule__ImplicationRule__Group__3__Impl"
    // InternalDsl.g:3837:1: rule__ImplicationRule__Group__3__Impl : ( ( rule__ImplicationRule__AntecedentAssignment_3 ) ) ;
    public final void rule__ImplicationRule__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3841:1: ( ( ( rule__ImplicationRule__AntecedentAssignment_3 ) ) )
            // InternalDsl.g:3842:1: ( ( rule__ImplicationRule__AntecedentAssignment_3 ) )
            {
            // InternalDsl.g:3842:1: ( ( rule__ImplicationRule__AntecedentAssignment_3 ) )
            // InternalDsl.g:3843:2: ( rule__ImplicationRule__AntecedentAssignment_3 )
            {
             before(grammarAccess.getImplicationRuleAccess().getAntecedentAssignment_3()); 
            // InternalDsl.g:3844:2: ( rule__ImplicationRule__AntecedentAssignment_3 )
            // InternalDsl.g:3844:3: rule__ImplicationRule__AntecedentAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__ImplicationRule__AntecedentAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getImplicationRuleAccess().getAntecedentAssignment_3()); 

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
    // $ANTLR end "rule__ImplicationRule__Group__3__Impl"


    // $ANTLR start "rule__ImplicationRule__Group__4"
    // InternalDsl.g:3852:1: rule__ImplicationRule__Group__4 : rule__ImplicationRule__Group__4__Impl rule__ImplicationRule__Group__5 ;
    public final void rule__ImplicationRule__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3856:1: ( rule__ImplicationRule__Group__4__Impl rule__ImplicationRule__Group__5 )
            // InternalDsl.g:3857:2: rule__ImplicationRule__Group__4__Impl rule__ImplicationRule__Group__5
            {
            pushFollow(FOLLOW_13);
            rule__ImplicationRule__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ImplicationRule__Group__5();

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
    // $ANTLR end "rule__ImplicationRule__Group__4"


    // $ANTLR start "rule__ImplicationRule__Group__4__Impl"
    // InternalDsl.g:3864:1: rule__ImplicationRule__Group__4__Impl : ( 'then' ) ;
    public final void rule__ImplicationRule__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3868:1: ( ( 'then' ) )
            // InternalDsl.g:3869:1: ( 'then' )
            {
            // InternalDsl.g:3869:1: ( 'then' )
            // InternalDsl.g:3870:2: 'then'
            {
             before(grammarAccess.getImplicationRuleAccess().getThenKeyword_4()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getImplicationRuleAccess().getThenKeyword_4()); 

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
    // $ANTLR end "rule__ImplicationRule__Group__4__Impl"


    // $ANTLR start "rule__ImplicationRule__Group__5"
    // InternalDsl.g:3879:1: rule__ImplicationRule__Group__5 : rule__ImplicationRule__Group__5__Impl rule__ImplicationRule__Group__6 ;
    public final void rule__ImplicationRule__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3883:1: ( rule__ImplicationRule__Group__5__Impl rule__ImplicationRule__Group__6 )
            // InternalDsl.g:3884:2: rule__ImplicationRule__Group__5__Impl rule__ImplicationRule__Group__6
            {
            pushFollow(FOLLOW_14);
            rule__ImplicationRule__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ImplicationRule__Group__6();

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
    // $ANTLR end "rule__ImplicationRule__Group__5"


    // $ANTLR start "rule__ImplicationRule__Group__5__Impl"
    // InternalDsl.g:3891:1: rule__ImplicationRule__Group__5__Impl : ( ( rule__ImplicationRule__ConsequentAssignment_5 ) ) ;
    public final void rule__ImplicationRule__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3895:1: ( ( ( rule__ImplicationRule__ConsequentAssignment_5 ) ) )
            // InternalDsl.g:3896:1: ( ( rule__ImplicationRule__ConsequentAssignment_5 ) )
            {
            // InternalDsl.g:3896:1: ( ( rule__ImplicationRule__ConsequentAssignment_5 ) )
            // InternalDsl.g:3897:2: ( rule__ImplicationRule__ConsequentAssignment_5 )
            {
             before(grammarAccess.getImplicationRuleAccess().getConsequentAssignment_5()); 
            // InternalDsl.g:3898:2: ( rule__ImplicationRule__ConsequentAssignment_5 )
            // InternalDsl.g:3898:3: rule__ImplicationRule__ConsequentAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__ImplicationRule__ConsequentAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getImplicationRuleAccess().getConsequentAssignment_5()); 

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
    // $ANTLR end "rule__ImplicationRule__Group__5__Impl"


    // $ANTLR start "rule__ImplicationRule__Group__6"
    // InternalDsl.g:3906:1: rule__ImplicationRule__Group__6 : rule__ImplicationRule__Group__6__Impl ;
    public final void rule__ImplicationRule__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3910:1: ( rule__ImplicationRule__Group__6__Impl )
            // InternalDsl.g:3911:2: rule__ImplicationRule__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ImplicationRule__Group__6__Impl();

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
    // $ANTLR end "rule__ImplicationRule__Group__6"


    // $ANTLR start "rule__ImplicationRule__Group__6__Impl"
    // InternalDsl.g:3917:1: rule__ImplicationRule__Group__6__Impl : ( '}' ) ;
    public final void rule__ImplicationRule__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3921:1: ( ( '}' ) )
            // InternalDsl.g:3922:1: ( '}' )
            {
            // InternalDsl.g:3922:1: ( '}' )
            // InternalDsl.g:3923:2: '}'
            {
             before(grammarAccess.getImplicationRuleAccess().getRightCurlyBracketKeyword_6()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getImplicationRuleAccess().getRightCurlyBracketKeyword_6()); 

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
    // $ANTLR end "rule__ImplicationRule__Group__6__Impl"


    // $ANTLR start "rule__SourceTypeRule__Group__0"
    // InternalDsl.g:3933:1: rule__SourceTypeRule__Group__0 : rule__SourceTypeRule__Group__0__Impl rule__SourceTypeRule__Group__1 ;
    public final void rule__SourceTypeRule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3937:1: ( rule__SourceTypeRule__Group__0__Impl rule__SourceTypeRule__Group__1 )
            // InternalDsl.g:3938:2: rule__SourceTypeRule__Group__0__Impl rule__SourceTypeRule__Group__1
            {
            pushFollow(FOLLOW_27);
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
    // InternalDsl.g:3945:1: rule__SourceTypeRule__Group__0__Impl : ( () ) ;
    public final void rule__SourceTypeRule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3949:1: ( ( () ) )
            // InternalDsl.g:3950:1: ( () )
            {
            // InternalDsl.g:3950:1: ( () )
            // InternalDsl.g:3951:2: ()
            {
             before(grammarAccess.getSourceTypeRuleAccess().getSourceTypeRuleAction_0()); 
            // InternalDsl.g:3952:2: ()
            // InternalDsl.g:3952:3: 
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
    // InternalDsl.g:3960:1: rule__SourceTypeRule__Group__1 : rule__SourceTypeRule__Group__1__Impl rule__SourceTypeRule__Group__2 ;
    public final void rule__SourceTypeRule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3964:1: ( rule__SourceTypeRule__Group__1__Impl rule__SourceTypeRule__Group__2 )
            // InternalDsl.g:3965:2: rule__SourceTypeRule__Group__1__Impl rule__SourceTypeRule__Group__2
            {
            pushFollow(FOLLOW_19);
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
    // InternalDsl.g:3972:1: rule__SourceTypeRule__Group__1__Impl : ( 'SourceTypeRule' ) ;
    public final void rule__SourceTypeRule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3976:1: ( ( 'SourceTypeRule' ) )
            // InternalDsl.g:3977:1: ( 'SourceTypeRule' )
            {
            // InternalDsl.g:3977:1: ( 'SourceTypeRule' )
            // InternalDsl.g:3978:2: 'SourceTypeRule'
            {
             before(grammarAccess.getSourceTypeRuleAccess().getSourceTypeRuleKeyword_1()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getSourceTypeRuleAccess().getSourceTypeRuleKeyword_1()); 

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
    // InternalDsl.g:3987:1: rule__SourceTypeRule__Group__2 : rule__SourceTypeRule__Group__2__Impl ;
    public final void rule__SourceTypeRule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3991:1: ( rule__SourceTypeRule__Group__2__Impl )
            // InternalDsl.g:3992:2: rule__SourceTypeRule__Group__2__Impl
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
    // InternalDsl.g:3998:1: rule__SourceTypeRule__Group__2__Impl : ( ( rule__SourceTypeRule__NameAssignment_2 ) ) ;
    public final void rule__SourceTypeRule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4002:1: ( ( ( rule__SourceTypeRule__NameAssignment_2 ) ) )
            // InternalDsl.g:4003:1: ( ( rule__SourceTypeRule__NameAssignment_2 ) )
            {
            // InternalDsl.g:4003:1: ( ( rule__SourceTypeRule__NameAssignment_2 ) )
            // InternalDsl.g:4004:2: ( rule__SourceTypeRule__NameAssignment_2 )
            {
             before(grammarAccess.getSourceTypeRuleAccess().getNameAssignment_2()); 
            // InternalDsl.g:4005:2: ( rule__SourceTypeRule__NameAssignment_2 )
            // InternalDsl.g:4005:3: rule__SourceTypeRule__NameAssignment_2
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
    // InternalDsl.g:4014:1: rule__TargetTypeRule__Group__0 : rule__TargetTypeRule__Group__0__Impl rule__TargetTypeRule__Group__1 ;
    public final void rule__TargetTypeRule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4018:1: ( rule__TargetTypeRule__Group__0__Impl rule__TargetTypeRule__Group__1 )
            // InternalDsl.g:4019:2: rule__TargetTypeRule__Group__0__Impl rule__TargetTypeRule__Group__1
            {
            pushFollow(FOLLOW_28);
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
    // InternalDsl.g:4026:1: rule__TargetTypeRule__Group__0__Impl : ( () ) ;
    public final void rule__TargetTypeRule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4030:1: ( ( () ) )
            // InternalDsl.g:4031:1: ( () )
            {
            // InternalDsl.g:4031:1: ( () )
            // InternalDsl.g:4032:2: ()
            {
             before(grammarAccess.getTargetTypeRuleAccess().getTargetTypeRuleAction_0()); 
            // InternalDsl.g:4033:2: ()
            // InternalDsl.g:4033:3: 
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
    // InternalDsl.g:4041:1: rule__TargetTypeRule__Group__1 : rule__TargetTypeRule__Group__1__Impl rule__TargetTypeRule__Group__2 ;
    public final void rule__TargetTypeRule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4045:1: ( rule__TargetTypeRule__Group__1__Impl rule__TargetTypeRule__Group__2 )
            // InternalDsl.g:4046:2: rule__TargetTypeRule__Group__1__Impl rule__TargetTypeRule__Group__2
            {
            pushFollow(FOLLOW_19);
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
    // InternalDsl.g:4053:1: rule__TargetTypeRule__Group__1__Impl : ( 'TargetTypeRule' ) ;
    public final void rule__TargetTypeRule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4057:1: ( ( 'TargetTypeRule' ) )
            // InternalDsl.g:4058:1: ( 'TargetTypeRule' )
            {
            // InternalDsl.g:4058:1: ( 'TargetTypeRule' )
            // InternalDsl.g:4059:2: 'TargetTypeRule'
            {
             before(grammarAccess.getTargetTypeRuleAccess().getTargetTypeRuleKeyword_1()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getTargetTypeRuleAccess().getTargetTypeRuleKeyword_1()); 

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
    // InternalDsl.g:4068:1: rule__TargetTypeRule__Group__2 : rule__TargetTypeRule__Group__2__Impl ;
    public final void rule__TargetTypeRule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4072:1: ( rule__TargetTypeRule__Group__2__Impl )
            // InternalDsl.g:4073:2: rule__TargetTypeRule__Group__2__Impl
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
    // InternalDsl.g:4079:1: rule__TargetTypeRule__Group__2__Impl : ( ( rule__TargetTypeRule__NameAssignment_2 ) ) ;
    public final void rule__TargetTypeRule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4083:1: ( ( ( rule__TargetTypeRule__NameAssignment_2 ) ) )
            // InternalDsl.g:4084:1: ( ( rule__TargetTypeRule__NameAssignment_2 ) )
            {
            // InternalDsl.g:4084:1: ( ( rule__TargetTypeRule__NameAssignment_2 ) )
            // InternalDsl.g:4085:2: ( rule__TargetTypeRule__NameAssignment_2 )
            {
             before(grammarAccess.getTargetTypeRuleAccess().getNameAssignment_2()); 
            // InternalDsl.g:4086:2: ( rule__TargetTypeRule__NameAssignment_2 )
            // InternalDsl.g:4086:3: rule__TargetTypeRule__NameAssignment_2
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
    // InternalDsl.g:4095:1: rule__CommandNameRule__Group__0 : rule__CommandNameRule__Group__0__Impl rule__CommandNameRule__Group__1 ;
    public final void rule__CommandNameRule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4099:1: ( rule__CommandNameRule__Group__0__Impl rule__CommandNameRule__Group__1 )
            // InternalDsl.g:4100:2: rule__CommandNameRule__Group__0__Impl rule__CommandNameRule__Group__1
            {
            pushFollow(FOLLOW_29);
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
    // InternalDsl.g:4107:1: rule__CommandNameRule__Group__0__Impl : ( () ) ;
    public final void rule__CommandNameRule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4111:1: ( ( () ) )
            // InternalDsl.g:4112:1: ( () )
            {
            // InternalDsl.g:4112:1: ( () )
            // InternalDsl.g:4113:2: ()
            {
             before(grammarAccess.getCommandNameRuleAccess().getCommandNameRuleAction_0()); 
            // InternalDsl.g:4114:2: ()
            // InternalDsl.g:4114:3: 
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
    // InternalDsl.g:4122:1: rule__CommandNameRule__Group__1 : rule__CommandNameRule__Group__1__Impl rule__CommandNameRule__Group__2 ;
    public final void rule__CommandNameRule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4126:1: ( rule__CommandNameRule__Group__1__Impl rule__CommandNameRule__Group__2 )
            // InternalDsl.g:4127:2: rule__CommandNameRule__Group__1__Impl rule__CommandNameRule__Group__2
            {
            pushFollow(FOLLOW_19);
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
    // InternalDsl.g:4134:1: rule__CommandNameRule__Group__1__Impl : ( 'CommandNameRule' ) ;
    public final void rule__CommandNameRule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4138:1: ( ( 'CommandNameRule' ) )
            // InternalDsl.g:4139:1: ( 'CommandNameRule' )
            {
            // InternalDsl.g:4139:1: ( 'CommandNameRule' )
            // InternalDsl.g:4140:2: 'CommandNameRule'
            {
             before(grammarAccess.getCommandNameRuleAccess().getCommandNameRuleKeyword_1()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getCommandNameRuleAccess().getCommandNameRuleKeyword_1()); 

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
    // InternalDsl.g:4149:1: rule__CommandNameRule__Group__2 : rule__CommandNameRule__Group__2__Impl ;
    public final void rule__CommandNameRule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4153:1: ( rule__CommandNameRule__Group__2__Impl )
            // InternalDsl.g:4154:2: rule__CommandNameRule__Group__2__Impl
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
    // InternalDsl.g:4160:1: rule__CommandNameRule__Group__2__Impl : ( ( rule__CommandNameRule__NameAssignment_2 ) ) ;
    public final void rule__CommandNameRule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4164:1: ( ( ( rule__CommandNameRule__NameAssignment_2 ) ) )
            // InternalDsl.g:4165:1: ( ( rule__CommandNameRule__NameAssignment_2 ) )
            {
            // InternalDsl.g:4165:1: ( ( rule__CommandNameRule__NameAssignment_2 ) )
            // InternalDsl.g:4166:2: ( rule__CommandNameRule__NameAssignment_2 )
            {
             before(grammarAccess.getCommandNameRuleAccess().getNameAssignment_2()); 
            // InternalDsl.g:4167:2: ( rule__CommandNameRule__NameAssignment_2 )
            // InternalDsl.g:4167:3: rule__CommandNameRule__NameAssignment_2
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
    // InternalDsl.g:4176:1: rule__ShapeTypeRule__Group__0 : rule__ShapeTypeRule__Group__0__Impl rule__ShapeTypeRule__Group__1 ;
    public final void rule__ShapeTypeRule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4180:1: ( rule__ShapeTypeRule__Group__0__Impl rule__ShapeTypeRule__Group__1 )
            // InternalDsl.g:4181:2: rule__ShapeTypeRule__Group__0__Impl rule__ShapeTypeRule__Group__1
            {
            pushFollow(FOLLOW_30);
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
    // InternalDsl.g:4188:1: rule__ShapeTypeRule__Group__0__Impl : ( () ) ;
    public final void rule__ShapeTypeRule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4192:1: ( ( () ) )
            // InternalDsl.g:4193:1: ( () )
            {
            // InternalDsl.g:4193:1: ( () )
            // InternalDsl.g:4194:2: ()
            {
             before(grammarAccess.getShapeTypeRuleAccess().getShapeTypeRuleAction_0()); 
            // InternalDsl.g:4195:2: ()
            // InternalDsl.g:4195:3: 
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
    // InternalDsl.g:4203:1: rule__ShapeTypeRule__Group__1 : rule__ShapeTypeRule__Group__1__Impl rule__ShapeTypeRule__Group__2 ;
    public final void rule__ShapeTypeRule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4207:1: ( rule__ShapeTypeRule__Group__1__Impl rule__ShapeTypeRule__Group__2 )
            // InternalDsl.g:4208:2: rule__ShapeTypeRule__Group__1__Impl rule__ShapeTypeRule__Group__2
            {
            pushFollow(FOLLOW_19);
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
    // InternalDsl.g:4215:1: rule__ShapeTypeRule__Group__1__Impl : ( 'ShapeTypeRule' ) ;
    public final void rule__ShapeTypeRule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4219:1: ( ( 'ShapeTypeRule' ) )
            // InternalDsl.g:4220:1: ( 'ShapeTypeRule' )
            {
            // InternalDsl.g:4220:1: ( 'ShapeTypeRule' )
            // InternalDsl.g:4221:2: 'ShapeTypeRule'
            {
             before(grammarAccess.getShapeTypeRuleAccess().getShapeTypeRuleKeyword_1()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getShapeTypeRuleAccess().getShapeTypeRuleKeyword_1()); 

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
    // InternalDsl.g:4230:1: rule__ShapeTypeRule__Group__2 : rule__ShapeTypeRule__Group__2__Impl ;
    public final void rule__ShapeTypeRule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4234:1: ( rule__ShapeTypeRule__Group__2__Impl )
            // InternalDsl.g:4235:2: rule__ShapeTypeRule__Group__2__Impl
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
    // InternalDsl.g:4241:1: rule__ShapeTypeRule__Group__2__Impl : ( ( rule__ShapeTypeRule__NameAssignment_2 ) ) ;
    public final void rule__ShapeTypeRule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4245:1: ( ( ( rule__ShapeTypeRule__NameAssignment_2 ) ) )
            // InternalDsl.g:4246:1: ( ( rule__ShapeTypeRule__NameAssignment_2 ) )
            {
            // InternalDsl.g:4246:1: ( ( rule__ShapeTypeRule__NameAssignment_2 ) )
            // InternalDsl.g:4247:2: ( rule__ShapeTypeRule__NameAssignment_2 )
            {
             before(grammarAccess.getShapeTypeRuleAccess().getNameAssignment_2()); 
            // InternalDsl.g:4248:2: ( rule__ShapeTypeRule__NameAssignment_2 )
            // InternalDsl.g:4248:3: rule__ShapeTypeRule__NameAssignment_2
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
    // InternalDsl.g:4257:1: rule__ParentTypeRule__Group__0 : rule__ParentTypeRule__Group__0__Impl rule__ParentTypeRule__Group__1 ;
    public final void rule__ParentTypeRule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4261:1: ( rule__ParentTypeRule__Group__0__Impl rule__ParentTypeRule__Group__1 )
            // InternalDsl.g:4262:2: rule__ParentTypeRule__Group__0__Impl rule__ParentTypeRule__Group__1
            {
            pushFollow(FOLLOW_31);
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
    // InternalDsl.g:4269:1: rule__ParentTypeRule__Group__0__Impl : ( () ) ;
    public final void rule__ParentTypeRule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4273:1: ( ( () ) )
            // InternalDsl.g:4274:1: ( () )
            {
            // InternalDsl.g:4274:1: ( () )
            // InternalDsl.g:4275:2: ()
            {
             before(grammarAccess.getParentTypeRuleAccess().getParentTypeRuleAction_0()); 
            // InternalDsl.g:4276:2: ()
            // InternalDsl.g:4276:3: 
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
    // InternalDsl.g:4284:1: rule__ParentTypeRule__Group__1 : rule__ParentTypeRule__Group__1__Impl rule__ParentTypeRule__Group__2 ;
    public final void rule__ParentTypeRule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4288:1: ( rule__ParentTypeRule__Group__1__Impl rule__ParentTypeRule__Group__2 )
            // InternalDsl.g:4289:2: rule__ParentTypeRule__Group__1__Impl rule__ParentTypeRule__Group__2
            {
            pushFollow(FOLLOW_19);
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
    // InternalDsl.g:4296:1: rule__ParentTypeRule__Group__1__Impl : ( 'ParentTypeRule' ) ;
    public final void rule__ParentTypeRule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4300:1: ( ( 'ParentTypeRule' ) )
            // InternalDsl.g:4301:1: ( 'ParentTypeRule' )
            {
            // InternalDsl.g:4301:1: ( 'ParentTypeRule' )
            // InternalDsl.g:4302:2: 'ParentTypeRule'
            {
             before(grammarAccess.getParentTypeRuleAccess().getParentTypeRuleKeyword_1()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getParentTypeRuleAccess().getParentTypeRuleKeyword_1()); 

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
    // InternalDsl.g:4311:1: rule__ParentTypeRule__Group__2 : rule__ParentTypeRule__Group__2__Impl ;
    public final void rule__ParentTypeRule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4315:1: ( rule__ParentTypeRule__Group__2__Impl )
            // InternalDsl.g:4316:2: rule__ParentTypeRule__Group__2__Impl
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
    // InternalDsl.g:4322:1: rule__ParentTypeRule__Group__2__Impl : ( ( rule__ParentTypeRule__NameAssignment_2 ) ) ;
    public final void rule__ParentTypeRule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4326:1: ( ( ( rule__ParentTypeRule__NameAssignment_2 ) ) )
            // InternalDsl.g:4327:1: ( ( rule__ParentTypeRule__NameAssignment_2 ) )
            {
            // InternalDsl.g:4327:1: ( ( rule__ParentTypeRule__NameAssignment_2 ) )
            // InternalDsl.g:4328:2: ( rule__ParentTypeRule__NameAssignment_2 )
            {
             before(grammarAccess.getParentTypeRuleAccess().getNameAssignment_2()); 
            // InternalDsl.g:4329:2: ( rule__ParentTypeRule__NameAssignment_2 )
            // InternalDsl.g:4329:3: rule__ParentTypeRule__NameAssignment_2
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
    // InternalDsl.g:4338:1: rule__StepInRule__Group__0 : rule__StepInRule__Group__0__Impl rule__StepInRule__Group__1 ;
    public final void rule__StepInRule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4342:1: ( rule__StepInRule__Group__0__Impl rule__StepInRule__Group__1 )
            // InternalDsl.g:4343:2: rule__StepInRule__Group__0__Impl rule__StepInRule__Group__1
            {
            pushFollow(FOLLOW_32);
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
    // InternalDsl.g:4350:1: rule__StepInRule__Group__0__Impl : ( () ) ;
    public final void rule__StepInRule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4354:1: ( ( () ) )
            // InternalDsl.g:4355:1: ( () )
            {
            // InternalDsl.g:4355:1: ( () )
            // InternalDsl.g:4356:2: ()
            {
             before(grammarAccess.getStepInRuleAccess().getStepInRuleAction_0()); 
            // InternalDsl.g:4357:2: ()
            // InternalDsl.g:4357:3: 
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
    // InternalDsl.g:4365:1: rule__StepInRule__Group__1 : rule__StepInRule__Group__1__Impl ;
    public final void rule__StepInRule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4369:1: ( rule__StepInRule__Group__1__Impl )
            // InternalDsl.g:4370:2: rule__StepInRule__Group__1__Impl
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
    // InternalDsl.g:4376:1: rule__StepInRule__Group__1__Impl : ( 'StepInRule' ) ;
    public final void rule__StepInRule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4380:1: ( ( 'StepInRule' ) )
            // InternalDsl.g:4381:1: ( 'StepInRule' )
            {
            // InternalDsl.g:4381:1: ( 'StepInRule' )
            // InternalDsl.g:4382:2: 'StepInRule'
            {
             before(grammarAccess.getStepInRuleAccess().getStepInRuleKeyword_1()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getStepInRuleAccess().getStepInRuleKeyword_1()); 

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
    // InternalDsl.g:4392:1: rule__TrueRule__Group__0 : rule__TrueRule__Group__0__Impl rule__TrueRule__Group__1 ;
    public final void rule__TrueRule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4396:1: ( rule__TrueRule__Group__0__Impl rule__TrueRule__Group__1 )
            // InternalDsl.g:4397:2: rule__TrueRule__Group__0__Impl rule__TrueRule__Group__1
            {
            pushFollow(FOLLOW_33);
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
    // InternalDsl.g:4404:1: rule__TrueRule__Group__0__Impl : ( () ) ;
    public final void rule__TrueRule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4408:1: ( ( () ) )
            // InternalDsl.g:4409:1: ( () )
            {
            // InternalDsl.g:4409:1: ( () )
            // InternalDsl.g:4410:2: ()
            {
             before(grammarAccess.getTrueRuleAccess().getTrueRuleAction_0()); 
            // InternalDsl.g:4411:2: ()
            // InternalDsl.g:4411:3: 
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
    // InternalDsl.g:4419:1: rule__TrueRule__Group__1 : rule__TrueRule__Group__1__Impl ;
    public final void rule__TrueRule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4423:1: ( rule__TrueRule__Group__1__Impl )
            // InternalDsl.g:4424:2: rule__TrueRule__Group__1__Impl
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
    // InternalDsl.g:4430:1: rule__TrueRule__Group__1__Impl : ( 'TrueRule' ) ;
    public final void rule__TrueRule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4434:1: ( ( 'TrueRule' ) )
            // InternalDsl.g:4435:1: ( 'TrueRule' )
            {
            // InternalDsl.g:4435:1: ( 'TrueRule' )
            // InternalDsl.g:4436:2: 'TrueRule'
            {
             before(grammarAccess.getTrueRuleAccess().getTrueRuleKeyword_1()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getTrueRuleAccess().getTrueRuleKeyword_1()); 

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
    // InternalDsl.g:4446:1: rule__FalseRule__Group__0 : rule__FalseRule__Group__0__Impl rule__FalseRule__Group__1 ;
    public final void rule__FalseRule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4450:1: ( rule__FalseRule__Group__0__Impl rule__FalseRule__Group__1 )
            // InternalDsl.g:4451:2: rule__FalseRule__Group__0__Impl rule__FalseRule__Group__1
            {
            pushFollow(FOLLOW_34);
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
    // InternalDsl.g:4458:1: rule__FalseRule__Group__0__Impl : ( () ) ;
    public final void rule__FalseRule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4462:1: ( ( () ) )
            // InternalDsl.g:4463:1: ( () )
            {
            // InternalDsl.g:4463:1: ( () )
            // InternalDsl.g:4464:2: ()
            {
             before(grammarAccess.getFalseRuleAccess().getFalseRuleAction_0()); 
            // InternalDsl.g:4465:2: ()
            // InternalDsl.g:4465:3: 
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
    // InternalDsl.g:4473:1: rule__FalseRule__Group__1 : rule__FalseRule__Group__1__Impl ;
    public final void rule__FalseRule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4477:1: ( rule__FalseRule__Group__1__Impl )
            // InternalDsl.g:4478:2: rule__FalseRule__Group__1__Impl
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
    // InternalDsl.g:4484:1: rule__FalseRule__Group__1__Impl : ( 'FalseRule' ) ;
    public final void rule__FalseRule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4488:1: ( ( 'FalseRule' ) )
            // InternalDsl.g:4489:1: ( 'FalseRule' )
            {
            // InternalDsl.g:4489:1: ( 'FalseRule' )
            // InternalDsl.g:4490:2: 'FalseRule'
            {
             before(grammarAccess.getFalseRuleAccess().getFalseRuleKeyword_1()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getFalseRuleAccess().getFalseRuleKeyword_1()); 

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
    // InternalDsl.g:4500:1: rule__ShapeNameRule__Group__0 : rule__ShapeNameRule__Group__0__Impl rule__ShapeNameRule__Group__1 ;
    public final void rule__ShapeNameRule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4504:1: ( rule__ShapeNameRule__Group__0__Impl rule__ShapeNameRule__Group__1 )
            // InternalDsl.g:4505:2: rule__ShapeNameRule__Group__0__Impl rule__ShapeNameRule__Group__1
            {
            pushFollow(FOLLOW_35);
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
    // InternalDsl.g:4512:1: rule__ShapeNameRule__Group__0__Impl : ( () ) ;
    public final void rule__ShapeNameRule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4516:1: ( ( () ) )
            // InternalDsl.g:4517:1: ( () )
            {
            // InternalDsl.g:4517:1: ( () )
            // InternalDsl.g:4518:2: ()
            {
             before(grammarAccess.getShapeNameRuleAccess().getShapeNameRuleAction_0()); 
            // InternalDsl.g:4519:2: ()
            // InternalDsl.g:4519:3: 
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
    // InternalDsl.g:4527:1: rule__ShapeNameRule__Group__1 : rule__ShapeNameRule__Group__1__Impl rule__ShapeNameRule__Group__2 ;
    public final void rule__ShapeNameRule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4531:1: ( rule__ShapeNameRule__Group__1__Impl rule__ShapeNameRule__Group__2 )
            // InternalDsl.g:4532:2: rule__ShapeNameRule__Group__1__Impl rule__ShapeNameRule__Group__2
            {
            pushFollow(FOLLOW_19);
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
    // InternalDsl.g:4539:1: rule__ShapeNameRule__Group__1__Impl : ( 'ShapeNameRule' ) ;
    public final void rule__ShapeNameRule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4543:1: ( ( 'ShapeNameRule' ) )
            // InternalDsl.g:4544:1: ( 'ShapeNameRule' )
            {
            // InternalDsl.g:4544:1: ( 'ShapeNameRule' )
            // InternalDsl.g:4545:2: 'ShapeNameRule'
            {
             before(grammarAccess.getShapeNameRuleAccess().getShapeNameRuleKeyword_1()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getShapeNameRuleAccess().getShapeNameRuleKeyword_1()); 

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
    // InternalDsl.g:4554:1: rule__ShapeNameRule__Group__2 : rule__ShapeNameRule__Group__2__Impl ;
    public final void rule__ShapeNameRule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4558:1: ( rule__ShapeNameRule__Group__2__Impl )
            // InternalDsl.g:4559:2: rule__ShapeNameRule__Group__2__Impl
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
    // InternalDsl.g:4565:1: rule__ShapeNameRule__Group__2__Impl : ( ( rule__ShapeNameRule__NameAssignment_2 ) ) ;
    public final void rule__ShapeNameRule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4569:1: ( ( ( rule__ShapeNameRule__NameAssignment_2 ) ) )
            // InternalDsl.g:4570:1: ( ( rule__ShapeNameRule__NameAssignment_2 ) )
            {
            // InternalDsl.g:4570:1: ( ( rule__ShapeNameRule__NameAssignment_2 ) )
            // InternalDsl.g:4571:2: ( rule__ShapeNameRule__NameAssignment_2 )
            {
             before(grammarAccess.getShapeNameRuleAccess().getNameAssignment_2()); 
            // InternalDsl.g:4572:2: ( rule__ShapeNameRule__NameAssignment_2 )
            // InternalDsl.g:4572:3: rule__ShapeNameRule__NameAssignment_2
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


    // $ANTLR start "rule__MappingExpression__Group_1__0"
    // InternalDsl.g:4581:1: rule__MappingExpression__Group_1__0 : rule__MappingExpression__Group_1__0__Impl rule__MappingExpression__Group_1__1 ;
    public final void rule__MappingExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4585:1: ( rule__MappingExpression__Group_1__0__Impl rule__MappingExpression__Group_1__1 )
            // InternalDsl.g:4586:2: rule__MappingExpression__Group_1__0__Impl rule__MappingExpression__Group_1__1
            {
            pushFollow(FOLLOW_16);
            rule__MappingExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MappingExpression__Group_1__1();

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
    // $ANTLR end "rule__MappingExpression__Group_1__0"


    // $ANTLR start "rule__MappingExpression__Group_1__0__Impl"
    // InternalDsl.g:4593:1: rule__MappingExpression__Group_1__0__Impl : ( '!' ) ;
    public final void rule__MappingExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4597:1: ( ( '!' ) )
            // InternalDsl.g:4598:1: ( '!' )
            {
            // InternalDsl.g:4598:1: ( '!' )
            // InternalDsl.g:4599:2: '!'
            {
             before(grammarAccess.getMappingExpressionAccess().getExclamationMarkKeyword_1_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getMappingExpressionAccess().getExclamationMarkKeyword_1_0()); 

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
    // $ANTLR end "rule__MappingExpression__Group_1__0__Impl"


    // $ANTLR start "rule__MappingExpression__Group_1__1"
    // InternalDsl.g:4608:1: rule__MappingExpression__Group_1__1 : rule__MappingExpression__Group_1__1__Impl rule__MappingExpression__Group_1__2 ;
    public final void rule__MappingExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4612:1: ( rule__MappingExpression__Group_1__1__Impl rule__MappingExpression__Group_1__2 )
            // InternalDsl.g:4613:2: rule__MappingExpression__Group_1__1__Impl rule__MappingExpression__Group_1__2
            {
            pushFollow(FOLLOW_16);
            rule__MappingExpression__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MappingExpression__Group_1__2();

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
    // $ANTLR end "rule__MappingExpression__Group_1__1"


    // $ANTLR start "rule__MappingExpression__Group_1__1__Impl"
    // InternalDsl.g:4620:1: rule__MappingExpression__Group_1__1__Impl : ( () ) ;
    public final void rule__MappingExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4624:1: ( ( () ) )
            // InternalDsl.g:4625:1: ( () )
            {
            // InternalDsl.g:4625:1: ( () )
            // InternalDsl.g:4626:2: ()
            {
             before(grammarAccess.getMappingExpressionAccess().getNotMappingRuleAction_1_1()); 
            // InternalDsl.g:4627:2: ()
            // InternalDsl.g:4627:3: 
            {
            }

             after(grammarAccess.getMappingExpressionAccess().getNotMappingRuleAction_1_1()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingExpression__Group_1__1__Impl"


    // $ANTLR start "rule__MappingExpression__Group_1__2"
    // InternalDsl.g:4635:1: rule__MappingExpression__Group_1__2 : rule__MappingExpression__Group_1__2__Impl ;
    public final void rule__MappingExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4639:1: ( rule__MappingExpression__Group_1__2__Impl )
            // InternalDsl.g:4640:2: rule__MappingExpression__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MappingExpression__Group_1__2__Impl();

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
    // $ANTLR end "rule__MappingExpression__Group_1__2"


    // $ANTLR start "rule__MappingExpression__Group_1__2__Impl"
    // InternalDsl.g:4646:1: rule__MappingExpression__Group_1__2__Impl : ( ( rule__MappingExpression__RuleAssignment_1_2 ) ) ;
    public final void rule__MappingExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4650:1: ( ( ( rule__MappingExpression__RuleAssignment_1_2 ) ) )
            // InternalDsl.g:4651:1: ( ( rule__MappingExpression__RuleAssignment_1_2 ) )
            {
            // InternalDsl.g:4651:1: ( ( rule__MappingExpression__RuleAssignment_1_2 ) )
            // InternalDsl.g:4652:2: ( rule__MappingExpression__RuleAssignment_1_2 )
            {
             before(grammarAccess.getMappingExpressionAccess().getRuleAssignment_1_2()); 
            // InternalDsl.g:4653:2: ( rule__MappingExpression__RuleAssignment_1_2 )
            // InternalDsl.g:4653:3: rule__MappingExpression__RuleAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__MappingExpression__RuleAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getMappingExpressionAccess().getRuleAssignment_1_2()); 

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
    // $ANTLR end "rule__MappingExpression__Group_1__2__Impl"


    // $ANTLR start "rule__AndMapping__Group__0"
    // InternalDsl.g:4662:1: rule__AndMapping__Group__0 : rule__AndMapping__Group__0__Impl rule__AndMapping__Group__1 ;
    public final void rule__AndMapping__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4666:1: ( rule__AndMapping__Group__0__Impl rule__AndMapping__Group__1 )
            // InternalDsl.g:4667:2: rule__AndMapping__Group__0__Impl rule__AndMapping__Group__1
            {
            pushFollow(FOLLOW_36);
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
    // InternalDsl.g:4674:1: rule__AndMapping__Group__0__Impl : ( ruleOrMapping ) ;
    public final void rule__AndMapping__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4678:1: ( ( ruleOrMapping ) )
            // InternalDsl.g:4679:1: ( ruleOrMapping )
            {
            // InternalDsl.g:4679:1: ( ruleOrMapping )
            // InternalDsl.g:4680:2: ruleOrMapping
            {
             before(grammarAccess.getAndMappingAccess().getOrMappingParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleOrMapping();

            state._fsp--;

             after(grammarAccess.getAndMappingAccess().getOrMappingParserRuleCall_0()); 

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
    // InternalDsl.g:4689:1: rule__AndMapping__Group__1 : rule__AndMapping__Group__1__Impl ;
    public final void rule__AndMapping__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4693:1: ( rule__AndMapping__Group__1__Impl )
            // InternalDsl.g:4694:2: rule__AndMapping__Group__1__Impl
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
    // InternalDsl.g:4700:1: rule__AndMapping__Group__1__Impl : ( ( rule__AndMapping__Group_1__0 )* ) ;
    public final void rule__AndMapping__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4704:1: ( ( ( rule__AndMapping__Group_1__0 )* ) )
            // InternalDsl.g:4705:1: ( ( rule__AndMapping__Group_1__0 )* )
            {
            // InternalDsl.g:4705:1: ( ( rule__AndMapping__Group_1__0 )* )
            // InternalDsl.g:4706:2: ( rule__AndMapping__Group_1__0 )*
            {
             before(grammarAccess.getAndMappingAccess().getGroup_1()); 
            // InternalDsl.g:4707:2: ( rule__AndMapping__Group_1__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==49) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalDsl.g:4707:3: rule__AndMapping__Group_1__0
            	    {
            	    pushFollow(FOLLOW_37);
            	    rule__AndMapping__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
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
    // InternalDsl.g:4716:1: rule__AndMapping__Group_1__0 : rule__AndMapping__Group_1__0__Impl rule__AndMapping__Group_1__1 ;
    public final void rule__AndMapping__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4720:1: ( rule__AndMapping__Group_1__0__Impl rule__AndMapping__Group_1__1 )
            // InternalDsl.g:4721:2: rule__AndMapping__Group_1__0__Impl rule__AndMapping__Group_1__1
            {
            pushFollow(FOLLOW_36);
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
    // InternalDsl.g:4728:1: rule__AndMapping__Group_1__0__Impl : ( () ) ;
    public final void rule__AndMapping__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4732:1: ( ( () ) )
            // InternalDsl.g:4733:1: ( () )
            {
            // InternalDsl.g:4733:1: ( () )
            // InternalDsl.g:4734:2: ()
            {
             before(grammarAccess.getAndMappingAccess().getAndMappingRuleRulesAction_1_0()); 
            // InternalDsl.g:4735:2: ()
            // InternalDsl.g:4735:3: 
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
    // InternalDsl.g:4743:1: rule__AndMapping__Group_1__1 : rule__AndMapping__Group_1__1__Impl rule__AndMapping__Group_1__2 ;
    public final void rule__AndMapping__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4747:1: ( rule__AndMapping__Group_1__1__Impl rule__AndMapping__Group_1__2 )
            // InternalDsl.g:4748:2: rule__AndMapping__Group_1__1__Impl rule__AndMapping__Group_1__2
            {
            pushFollow(FOLLOW_16);
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
    // InternalDsl.g:4755:1: rule__AndMapping__Group_1__1__Impl : ( '&&' ) ;
    public final void rule__AndMapping__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4759:1: ( ( '&&' ) )
            // InternalDsl.g:4760:1: ( '&&' )
            {
            // InternalDsl.g:4760:1: ( '&&' )
            // InternalDsl.g:4761:2: '&&'
            {
             before(grammarAccess.getAndMappingAccess().getAmpersandAmpersandKeyword_1_1()); 
            match(input,49,FOLLOW_2); 
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
    // InternalDsl.g:4770:1: rule__AndMapping__Group_1__2 : rule__AndMapping__Group_1__2__Impl ;
    public final void rule__AndMapping__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4774:1: ( rule__AndMapping__Group_1__2__Impl )
            // InternalDsl.g:4775:2: rule__AndMapping__Group_1__2__Impl
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
    // InternalDsl.g:4781:1: rule__AndMapping__Group_1__2__Impl : ( ( rule__AndMapping__RulesAssignment_1_2 ) ) ;
    public final void rule__AndMapping__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4785:1: ( ( ( rule__AndMapping__RulesAssignment_1_2 ) ) )
            // InternalDsl.g:4786:1: ( ( rule__AndMapping__RulesAssignment_1_2 ) )
            {
            // InternalDsl.g:4786:1: ( ( rule__AndMapping__RulesAssignment_1_2 ) )
            // InternalDsl.g:4787:2: ( rule__AndMapping__RulesAssignment_1_2 )
            {
             before(grammarAccess.getAndMappingAccess().getRulesAssignment_1_2()); 
            // InternalDsl.g:4788:2: ( rule__AndMapping__RulesAssignment_1_2 )
            // InternalDsl.g:4788:3: rule__AndMapping__RulesAssignment_1_2
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


    // $ANTLR start "rule__OrMapping__Group__0"
    // InternalDsl.g:4797:1: rule__OrMapping__Group__0 : rule__OrMapping__Group__0__Impl rule__OrMapping__Group__1 ;
    public final void rule__OrMapping__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4801:1: ( rule__OrMapping__Group__0__Impl rule__OrMapping__Group__1 )
            // InternalDsl.g:4802:2: rule__OrMapping__Group__0__Impl rule__OrMapping__Group__1
            {
            pushFollow(FOLLOW_38);
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
    // InternalDsl.g:4809:1: rule__OrMapping__Group__0__Impl : ( rulePrimary ) ;
    public final void rule__OrMapping__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4813:1: ( ( rulePrimary ) )
            // InternalDsl.g:4814:1: ( rulePrimary )
            {
            // InternalDsl.g:4814:1: ( rulePrimary )
            // InternalDsl.g:4815:2: rulePrimary
            {
             before(grammarAccess.getOrMappingAccess().getPrimaryParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            rulePrimary();

            state._fsp--;

             after(grammarAccess.getOrMappingAccess().getPrimaryParserRuleCall_0()); 

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
    // InternalDsl.g:4824:1: rule__OrMapping__Group__1 : rule__OrMapping__Group__1__Impl ;
    public final void rule__OrMapping__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4828:1: ( rule__OrMapping__Group__1__Impl )
            // InternalDsl.g:4829:2: rule__OrMapping__Group__1__Impl
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
    // InternalDsl.g:4835:1: rule__OrMapping__Group__1__Impl : ( ( rule__OrMapping__Group_1__0 )* ) ;
    public final void rule__OrMapping__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4839:1: ( ( ( rule__OrMapping__Group_1__0 )* ) )
            // InternalDsl.g:4840:1: ( ( rule__OrMapping__Group_1__0 )* )
            {
            // InternalDsl.g:4840:1: ( ( rule__OrMapping__Group_1__0 )* )
            // InternalDsl.g:4841:2: ( rule__OrMapping__Group_1__0 )*
            {
             before(grammarAccess.getOrMappingAccess().getGroup_1()); 
            // InternalDsl.g:4842:2: ( rule__OrMapping__Group_1__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==50) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalDsl.g:4842:3: rule__OrMapping__Group_1__0
            	    {
            	    pushFollow(FOLLOW_39);
            	    rule__OrMapping__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
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
    // InternalDsl.g:4851:1: rule__OrMapping__Group_1__0 : rule__OrMapping__Group_1__0__Impl rule__OrMapping__Group_1__1 ;
    public final void rule__OrMapping__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4855:1: ( rule__OrMapping__Group_1__0__Impl rule__OrMapping__Group_1__1 )
            // InternalDsl.g:4856:2: rule__OrMapping__Group_1__0__Impl rule__OrMapping__Group_1__1
            {
            pushFollow(FOLLOW_38);
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
    // InternalDsl.g:4863:1: rule__OrMapping__Group_1__0__Impl : ( () ) ;
    public final void rule__OrMapping__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4867:1: ( ( () ) )
            // InternalDsl.g:4868:1: ( () )
            {
            // InternalDsl.g:4868:1: ( () )
            // InternalDsl.g:4869:2: ()
            {
             before(grammarAccess.getOrMappingAccess().getOrMappingRuleRulesAction_1_0()); 
            // InternalDsl.g:4870:2: ()
            // InternalDsl.g:4870:3: 
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
    // InternalDsl.g:4878:1: rule__OrMapping__Group_1__1 : rule__OrMapping__Group_1__1__Impl rule__OrMapping__Group_1__2 ;
    public final void rule__OrMapping__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4882:1: ( rule__OrMapping__Group_1__1__Impl rule__OrMapping__Group_1__2 )
            // InternalDsl.g:4883:2: rule__OrMapping__Group_1__1__Impl rule__OrMapping__Group_1__2
            {
            pushFollow(FOLLOW_16);
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
    // InternalDsl.g:4890:1: rule__OrMapping__Group_1__1__Impl : ( '||' ) ;
    public final void rule__OrMapping__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4894:1: ( ( '||' ) )
            // InternalDsl.g:4895:1: ( '||' )
            {
            // InternalDsl.g:4895:1: ( '||' )
            // InternalDsl.g:4896:2: '||'
            {
             before(grammarAccess.getOrMappingAccess().getVerticalLineVerticalLineKeyword_1_1()); 
            match(input,50,FOLLOW_2); 
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
    // InternalDsl.g:4905:1: rule__OrMapping__Group_1__2 : rule__OrMapping__Group_1__2__Impl ;
    public final void rule__OrMapping__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4909:1: ( rule__OrMapping__Group_1__2__Impl )
            // InternalDsl.g:4910:2: rule__OrMapping__Group_1__2__Impl
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
    // InternalDsl.g:4916:1: rule__OrMapping__Group_1__2__Impl : ( ( rule__OrMapping__RulesAssignment_1_2 ) ) ;
    public final void rule__OrMapping__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4920:1: ( ( ( rule__OrMapping__RulesAssignment_1_2 ) ) )
            // InternalDsl.g:4921:1: ( ( rule__OrMapping__RulesAssignment_1_2 ) )
            {
            // InternalDsl.g:4921:1: ( ( rule__OrMapping__RulesAssignment_1_2 ) )
            // InternalDsl.g:4922:2: ( rule__OrMapping__RulesAssignment_1_2 )
            {
             before(grammarAccess.getOrMappingAccess().getRulesAssignment_1_2()); 
            // InternalDsl.g:4923:2: ( rule__OrMapping__RulesAssignment_1_2 )
            // InternalDsl.g:4923:3: rule__OrMapping__RulesAssignment_1_2
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


    // $ANTLR start "rule__Primary__Group_2__0"
    // InternalDsl.g:4932:1: rule__Primary__Group_2__0 : rule__Primary__Group_2__0__Impl rule__Primary__Group_2__1 ;
    public final void rule__Primary__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4936:1: ( rule__Primary__Group_2__0__Impl rule__Primary__Group_2__1 )
            // InternalDsl.g:4937:2: rule__Primary__Group_2__0__Impl rule__Primary__Group_2__1
            {
            pushFollow(FOLLOW_16);
            rule__Primary__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Primary__Group_2__1();

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
    // $ANTLR end "rule__Primary__Group_2__0"


    // $ANTLR start "rule__Primary__Group_2__0__Impl"
    // InternalDsl.g:4944:1: rule__Primary__Group_2__0__Impl : ( '(' ) ;
    public final void rule__Primary__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4948:1: ( ( '(' ) )
            // InternalDsl.g:4949:1: ( '(' )
            {
            // InternalDsl.g:4949:1: ( '(' )
            // InternalDsl.g:4950:2: '('
            {
             before(grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_2_0()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_2_0()); 

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
    // $ANTLR end "rule__Primary__Group_2__0__Impl"


    // $ANTLR start "rule__Primary__Group_2__1"
    // InternalDsl.g:4959:1: rule__Primary__Group_2__1 : rule__Primary__Group_2__1__Impl rule__Primary__Group_2__2 ;
    public final void rule__Primary__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4963:1: ( rule__Primary__Group_2__1__Impl rule__Primary__Group_2__2 )
            // InternalDsl.g:4964:2: rule__Primary__Group_2__1__Impl rule__Primary__Group_2__2
            {
            pushFollow(FOLLOW_40);
            rule__Primary__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Primary__Group_2__2();

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
    // $ANTLR end "rule__Primary__Group_2__1"


    // $ANTLR start "rule__Primary__Group_2__1__Impl"
    // InternalDsl.g:4971:1: rule__Primary__Group_2__1__Impl : ( ruleMappingExpression ) ;
    public final void rule__Primary__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4975:1: ( ( ruleMappingExpression ) )
            // InternalDsl.g:4976:1: ( ruleMappingExpression )
            {
            // InternalDsl.g:4976:1: ( ruleMappingExpression )
            // InternalDsl.g:4977:2: ruleMappingExpression
            {
             before(grammarAccess.getPrimaryAccess().getMappingExpressionParserRuleCall_2_1()); 
            pushFollow(FOLLOW_2);
            ruleMappingExpression();

            state._fsp--;

             after(grammarAccess.getPrimaryAccess().getMappingExpressionParserRuleCall_2_1()); 

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
    // $ANTLR end "rule__Primary__Group_2__1__Impl"


    // $ANTLR start "rule__Primary__Group_2__2"
    // InternalDsl.g:4986:1: rule__Primary__Group_2__2 : rule__Primary__Group_2__2__Impl ;
    public final void rule__Primary__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4990:1: ( rule__Primary__Group_2__2__Impl )
            // InternalDsl.g:4991:2: rule__Primary__Group_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Primary__Group_2__2__Impl();

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
    // $ANTLR end "rule__Primary__Group_2__2"


    // $ANTLR start "rule__Primary__Group_2__2__Impl"
    // InternalDsl.g:4997:1: rule__Primary__Group_2__2__Impl : ( ')' ) ;
    public final void rule__Primary__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5001:1: ( ( ')' ) )
            // InternalDsl.g:5002:1: ( ')' )
            {
            // InternalDsl.g:5002:1: ( ')' )
            // InternalDsl.g:5003:2: ')'
            {
             before(grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_2_2()); 
            match(input,52,FOLLOW_2); 
             after(grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_2_2()); 

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
    // $ANTLR end "rule__Primary__Group_2__2__Impl"


    // $ANTLR start "rule__Model__ConfigurationAssignment_3"
    // InternalDsl.g:5013:1: rule__Model__ConfigurationAssignment_3 : ( ruleConfiguration ) ;
    public final void rule__Model__ConfigurationAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5017:1: ( ( ruleConfiguration ) )
            // InternalDsl.g:5018:2: ( ruleConfiguration )
            {
            // InternalDsl.g:5018:2: ( ruleConfiguration )
            // InternalDsl.g:5019:3: ruleConfiguration
            {
             before(grammarAccess.getModelAccess().getConfigurationConfigurationParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleConfiguration();

            state._fsp--;

             after(grammarAccess.getModelAccess().getConfigurationConfigurationParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Model__ConfigurationAssignment_3"


    // $ANTLR start "rule__Model__PoliciesAssignment_4_2"
    // InternalDsl.g:5028:1: rule__Model__PoliciesAssignment_4_2 : ( rulePolicy ) ;
    public final void rule__Model__PoliciesAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5032:1: ( ( rulePolicy ) )
            // InternalDsl.g:5033:2: ( rulePolicy )
            {
            // InternalDsl.g:5033:2: ( rulePolicy )
            // InternalDsl.g:5034:3: rulePolicy
            {
             before(grammarAccess.getModelAccess().getPoliciesPolicyParserRuleCall_4_2_0()); 
            pushFollow(FOLLOW_2);
            rulePolicy();

            state._fsp--;

             after(grammarAccess.getModelAccess().getPoliciesPolicyParserRuleCall_4_2_0()); 

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
    // $ANTLR end "rule__Model__PoliciesAssignment_4_2"


    // $ANTLR start "rule__Model__PoliciesAssignment_4_3_1"
    // InternalDsl.g:5043:1: rule__Model__PoliciesAssignment_4_3_1 : ( rulePolicy ) ;
    public final void rule__Model__PoliciesAssignment_4_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5047:1: ( ( rulePolicy ) )
            // InternalDsl.g:5048:2: ( rulePolicy )
            {
            // InternalDsl.g:5048:2: ( rulePolicy )
            // InternalDsl.g:5049:3: rulePolicy
            {
             before(grammarAccess.getModelAccess().getPoliciesPolicyParserRuleCall_4_3_1_0()); 
            pushFollow(FOLLOW_2);
            rulePolicy();

            state._fsp--;

             after(grammarAccess.getModelAccess().getPoliciesPolicyParserRuleCall_4_3_1_0()); 

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
    // $ANTLR end "rule__Model__PoliciesAssignment_4_3_1"


    // $ANTLR start "rule__Configuration__MappingsAssignment_3_2"
    // InternalDsl.g:5058:1: rule__Configuration__MappingsAssignment_3_2 : ( ruleMapping ) ;
    public final void rule__Configuration__MappingsAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5062:1: ( ( ruleMapping ) )
            // InternalDsl.g:5063:2: ( ruleMapping )
            {
            // InternalDsl.g:5063:2: ( ruleMapping )
            // InternalDsl.g:5064:3: ruleMapping
            {
             before(grammarAccess.getConfigurationAccess().getMappingsMappingParserRuleCall_3_2_0()); 
            pushFollow(FOLLOW_2);
            ruleMapping();

            state._fsp--;

             after(grammarAccess.getConfigurationAccess().getMappingsMappingParserRuleCall_3_2_0()); 

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
    // $ANTLR end "rule__Configuration__MappingsAssignment_3_2"


    // $ANTLR start "rule__Configuration__MappingsAssignment_3_3_1"
    // InternalDsl.g:5073:1: rule__Configuration__MappingsAssignment_3_3_1 : ( ruleMapping ) ;
    public final void rule__Configuration__MappingsAssignment_3_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5077:1: ( ( ruleMapping ) )
            // InternalDsl.g:5078:2: ( ruleMapping )
            {
            // InternalDsl.g:5078:2: ( ruleMapping )
            // InternalDsl.g:5079:3: ruleMapping
            {
             before(grammarAccess.getConfigurationAccess().getMappingsMappingParserRuleCall_3_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleMapping();

            state._fsp--;

             after(grammarAccess.getConfigurationAccess().getMappingsMappingParserRuleCall_3_3_1_0()); 

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
    // $ANTLR end "rule__Configuration__MappingsAssignment_3_3_1"


    // $ANTLR start "rule__Policy__NameAssignment_1"
    // InternalDsl.g:5088:1: rule__Policy__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Policy__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5092:1: ( ( RULE_ID ) )
            // InternalDsl.g:5093:2: ( RULE_ID )
            {
            // InternalDsl.g:5093:2: ( RULE_ID )
            // InternalDsl.g:5094:3: RULE_ID
            {
             before(grammarAccess.getPolicyAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPolicyAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Policy__NameAssignment_1"


    // $ANTLR start "rule__Policy__RuleAssignment_3"
    // InternalDsl.g:5103:1: rule__Policy__RuleAssignment_3 : ( ruleAbstractRule ) ;
    public final void rule__Policy__RuleAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5107:1: ( ( ruleAbstractRule ) )
            // InternalDsl.g:5108:2: ( ruleAbstractRule )
            {
            // InternalDsl.g:5108:2: ( ruleAbstractRule )
            // InternalDsl.g:5109:3: ruleAbstractRule
            {
             before(grammarAccess.getPolicyAccess().getRuleAbstractRuleParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleAbstractRule();

            state._fsp--;

             after(grammarAccess.getPolicyAccess().getRuleAbstractRuleParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Policy__RuleAssignment_3"


    // $ANTLR start "rule__Mapping__RuleAssignment_3"
    // InternalDsl.g:5118:1: rule__Mapping__RuleAssignment_3 : ( ( rule__Mapping__RuleAlternatives_3_0 ) ) ;
    public final void rule__Mapping__RuleAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5122:1: ( ( ( rule__Mapping__RuleAlternatives_3_0 ) ) )
            // InternalDsl.g:5123:2: ( ( rule__Mapping__RuleAlternatives_3_0 ) )
            {
            // InternalDsl.g:5123:2: ( ( rule__Mapping__RuleAlternatives_3_0 ) )
            // InternalDsl.g:5124:3: ( rule__Mapping__RuleAlternatives_3_0 )
            {
             before(grammarAccess.getMappingAccess().getRuleAlternatives_3_0()); 
            // InternalDsl.g:5125:3: ( rule__Mapping__RuleAlternatives_3_0 )
            // InternalDsl.g:5125:4: rule__Mapping__RuleAlternatives_3_0
            {
            pushFollow(FOLLOW_2);
            rule__Mapping__RuleAlternatives_3_0();

            state._fsp--;


            }

             after(grammarAccess.getMappingAccess().getRuleAlternatives_3_0()); 

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
    // $ANTLR end "rule__Mapping__RuleAssignment_3"


    // $ANTLR start "rule__Mapping__PolicyAssignment_5"
    // InternalDsl.g:5133:1: rule__Mapping__PolicyAssignment_5 : ( ( RULE_ID ) ) ;
    public final void rule__Mapping__PolicyAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5137:1: ( ( ( RULE_ID ) ) )
            // InternalDsl.g:5138:2: ( ( RULE_ID ) )
            {
            // InternalDsl.g:5138:2: ( ( RULE_ID ) )
            // InternalDsl.g:5139:3: ( RULE_ID )
            {
             before(grammarAccess.getMappingAccess().getPolicyPolicyCrossReference_5_0()); 
            // InternalDsl.g:5140:3: ( RULE_ID )
            // InternalDsl.g:5141:4: RULE_ID
            {
             before(grammarAccess.getMappingAccess().getPolicyPolicyIDTerminalRuleCall_5_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMappingAccess().getPolicyPolicyIDTerminalRuleCall_5_0_1()); 

            }

             after(grammarAccess.getMappingAccess().getPolicyPolicyCrossReference_5_0()); 

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
    // $ANTLR end "rule__Mapping__PolicyAssignment_5"


    // $ANTLR start "rule__FeatureNameMappingRule__NameAssignment_2"
    // InternalDsl.g:5152:1: rule__FeatureNameMappingRule__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__FeatureNameMappingRule__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5156:1: ( ( ruleEString ) )
            // InternalDsl.g:5157:2: ( ruleEString )
            {
            // InternalDsl.g:5157:2: ( ruleEString )
            // InternalDsl.g:5158:3: ruleEString
            {
             before(grammarAccess.getFeatureNameMappingRuleAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getFeatureNameMappingRuleAccess().getNameEStringParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__FeatureNameMappingRule__NameAssignment_2"


    // $ANTLR start "rule__AndMappingRule__RulesAssignment_2"
    // InternalDsl.g:5167:1: rule__AndMappingRule__RulesAssignment_2 : ( ruleAbstractMappingRule ) ;
    public final void rule__AndMappingRule__RulesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5171:1: ( ( ruleAbstractMappingRule ) )
            // InternalDsl.g:5172:2: ( ruleAbstractMappingRule )
            {
            // InternalDsl.g:5172:2: ( ruleAbstractMappingRule )
            // InternalDsl.g:5173:3: ruleAbstractMappingRule
            {
             before(grammarAccess.getAndMappingRuleAccess().getRulesAbstractMappingRuleParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleAbstractMappingRule();

            state._fsp--;

             after(grammarAccess.getAndMappingRuleAccess().getRulesAbstractMappingRuleParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__AndMappingRule__RulesAssignment_2"


    // $ANTLR start "rule__AndMappingRule__RulesAssignment_3_1"
    // InternalDsl.g:5182:1: rule__AndMappingRule__RulesAssignment_3_1 : ( ruleAbstractMappingRule ) ;
    public final void rule__AndMappingRule__RulesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5186:1: ( ( ruleAbstractMappingRule ) )
            // InternalDsl.g:5187:2: ( ruleAbstractMappingRule )
            {
            // InternalDsl.g:5187:2: ( ruleAbstractMappingRule )
            // InternalDsl.g:5188:3: ruleAbstractMappingRule
            {
             before(grammarAccess.getAndMappingRuleAccess().getRulesAbstractMappingRuleParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAbstractMappingRule();

            state._fsp--;

             after(grammarAccess.getAndMappingRuleAccess().getRulesAbstractMappingRuleParserRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__AndMappingRule__RulesAssignment_3_1"


    // $ANTLR start "rule__NotMappingRule__RuleAssignment_1"
    // InternalDsl.g:5197:1: rule__NotMappingRule__RuleAssignment_1 : ( ruleAbstractMappingRule ) ;
    public final void rule__NotMappingRule__RuleAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5201:1: ( ( ruleAbstractMappingRule ) )
            // InternalDsl.g:5202:2: ( ruleAbstractMappingRule )
            {
            // InternalDsl.g:5202:2: ( ruleAbstractMappingRule )
            // InternalDsl.g:5203:3: ruleAbstractMappingRule
            {
             before(grammarAccess.getNotMappingRuleAccess().getRuleAbstractMappingRuleParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAbstractMappingRule();

            state._fsp--;

             after(grammarAccess.getNotMappingRuleAccess().getRuleAbstractMappingRuleParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__NotMappingRule__RuleAssignment_1"


    // $ANTLR start "rule__OrMappingRule__RulesAssignment_2"
    // InternalDsl.g:5212:1: rule__OrMappingRule__RulesAssignment_2 : ( ruleAbstractMappingRule ) ;
    public final void rule__OrMappingRule__RulesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5216:1: ( ( ruleAbstractMappingRule ) )
            // InternalDsl.g:5217:2: ( ruleAbstractMappingRule )
            {
            // InternalDsl.g:5217:2: ( ruleAbstractMappingRule )
            // InternalDsl.g:5218:3: ruleAbstractMappingRule
            {
             before(grammarAccess.getOrMappingRuleAccess().getRulesAbstractMappingRuleParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleAbstractMappingRule();

            state._fsp--;

             after(grammarAccess.getOrMappingRuleAccess().getRulesAbstractMappingRuleParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__OrMappingRule__RulesAssignment_2"


    // $ANTLR start "rule__OrMappingRule__RulesAssignment_3_1"
    // InternalDsl.g:5227:1: rule__OrMappingRule__RulesAssignment_3_1 : ( ruleAbstractMappingRule ) ;
    public final void rule__OrMappingRule__RulesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5231:1: ( ( ruleAbstractMappingRule ) )
            // InternalDsl.g:5232:2: ( ruleAbstractMappingRule )
            {
            // InternalDsl.g:5232:2: ( ruleAbstractMappingRule )
            // InternalDsl.g:5233:3: ruleAbstractMappingRule
            {
             before(grammarAccess.getOrMappingRuleAccess().getRulesAbstractMappingRuleParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAbstractMappingRule();

            state._fsp--;

             after(grammarAccess.getOrMappingRuleAccess().getRulesAbstractMappingRuleParserRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__OrMappingRule__RulesAssignment_3_1"


    // $ANTLR start "rule__ImplicationMappingRule__AntecedentAssignment_3"
    // InternalDsl.g:5242:1: rule__ImplicationMappingRule__AntecedentAssignment_3 : ( ruleAbstractMappingRule ) ;
    public final void rule__ImplicationMappingRule__AntecedentAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5246:1: ( ( ruleAbstractMappingRule ) )
            // InternalDsl.g:5247:2: ( ruleAbstractMappingRule )
            {
            // InternalDsl.g:5247:2: ( ruleAbstractMappingRule )
            // InternalDsl.g:5248:3: ruleAbstractMappingRule
            {
             before(grammarAccess.getImplicationMappingRuleAccess().getAntecedentAbstractMappingRuleParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleAbstractMappingRule();

            state._fsp--;

             after(grammarAccess.getImplicationMappingRuleAccess().getAntecedentAbstractMappingRuleParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__ImplicationMappingRule__AntecedentAssignment_3"


    // $ANTLR start "rule__ImplicationMappingRule__ConsequentAssignment_5"
    // InternalDsl.g:5257:1: rule__ImplicationMappingRule__ConsequentAssignment_5 : ( ruleAbstractMappingRule ) ;
    public final void rule__ImplicationMappingRule__ConsequentAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5261:1: ( ( ruleAbstractMappingRule ) )
            // InternalDsl.g:5262:2: ( ruleAbstractMappingRule )
            {
            // InternalDsl.g:5262:2: ( ruleAbstractMappingRule )
            // InternalDsl.g:5263:3: ruleAbstractMappingRule
            {
             before(grammarAccess.getImplicationMappingRuleAccess().getConsequentAbstractMappingRuleParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleAbstractMappingRule();

            state._fsp--;

             after(grammarAccess.getImplicationMappingRuleAccess().getConsequentAbstractMappingRuleParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__ImplicationMappingRule__ConsequentAssignment_5"


    // $ANTLR start "rule__AndRule__RulesAssignment_2"
    // InternalDsl.g:5272:1: rule__AndRule__RulesAssignment_2 : ( ruleAbstractRule ) ;
    public final void rule__AndRule__RulesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5276:1: ( ( ruleAbstractRule ) )
            // InternalDsl.g:5277:2: ( ruleAbstractRule )
            {
            // InternalDsl.g:5277:2: ( ruleAbstractRule )
            // InternalDsl.g:5278:3: ruleAbstractRule
            {
             before(grammarAccess.getAndRuleAccess().getRulesAbstractRuleParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleAbstractRule();

            state._fsp--;

             after(grammarAccess.getAndRuleAccess().getRulesAbstractRuleParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__AndRule__RulesAssignment_2"


    // $ANTLR start "rule__AndRule__RulesAssignment_3_1"
    // InternalDsl.g:5287:1: rule__AndRule__RulesAssignment_3_1 : ( ruleAbstractRule ) ;
    public final void rule__AndRule__RulesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5291:1: ( ( ruleAbstractRule ) )
            // InternalDsl.g:5292:2: ( ruleAbstractRule )
            {
            // InternalDsl.g:5292:2: ( ruleAbstractRule )
            // InternalDsl.g:5293:3: ruleAbstractRule
            {
             before(grammarAccess.getAndRuleAccess().getRulesAbstractRuleParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAbstractRule();

            state._fsp--;

             after(grammarAccess.getAndRuleAccess().getRulesAbstractRuleParserRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__AndRule__RulesAssignment_3_1"


    // $ANTLR start "rule__RelationNameRule__NameAssignment_2"
    // InternalDsl.g:5302:1: rule__RelationNameRule__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__RelationNameRule__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5306:1: ( ( ruleEString ) )
            // InternalDsl.g:5307:2: ( ruleEString )
            {
            // InternalDsl.g:5307:2: ( ruleEString )
            // InternalDsl.g:5308:3: ruleEString
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
    // InternalDsl.g:5317:1: rule__TypeExistsRule__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__TypeExistsRule__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5321:1: ( ( ruleEString ) )
            // InternalDsl.g:5322:2: ( ruleEString )
            {
            // InternalDsl.g:5322:2: ( ruleEString )
            // InternalDsl.g:5323:3: ruleEString
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


    // $ANTLR start "rule__OrRule__RulesAssignment_2"
    // InternalDsl.g:5332:1: rule__OrRule__RulesAssignment_2 : ( ruleAbstractRule ) ;
    public final void rule__OrRule__RulesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5336:1: ( ( ruleAbstractRule ) )
            // InternalDsl.g:5337:2: ( ruleAbstractRule )
            {
            // InternalDsl.g:5337:2: ( ruleAbstractRule )
            // InternalDsl.g:5338:3: ruleAbstractRule
            {
             before(grammarAccess.getOrRuleAccess().getRulesAbstractRuleParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleAbstractRule();

            state._fsp--;

             after(grammarAccess.getOrRuleAccess().getRulesAbstractRuleParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__OrRule__RulesAssignment_2"


    // $ANTLR start "rule__OrRule__RulesAssignment_3_1"
    // InternalDsl.g:5347:1: rule__OrRule__RulesAssignment_3_1 : ( ruleAbstractRule ) ;
    public final void rule__OrRule__RulesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5351:1: ( ( ruleAbstractRule ) )
            // InternalDsl.g:5352:2: ( ruleAbstractRule )
            {
            // InternalDsl.g:5352:2: ( ruleAbstractRule )
            // InternalDsl.g:5353:3: ruleAbstractRule
            {
             before(grammarAccess.getOrRuleAccess().getRulesAbstractRuleParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAbstractRule();

            state._fsp--;

             after(grammarAccess.getOrRuleAccess().getRulesAbstractRuleParserRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__OrRule__RulesAssignment_3_1"


    // $ANTLR start "rule__NotRule__RuleAssignment_2"
    // InternalDsl.g:5362:1: rule__NotRule__RuleAssignment_2 : ( ruleAbstractRule ) ;
    public final void rule__NotRule__RuleAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5366:1: ( ( ruleAbstractRule ) )
            // InternalDsl.g:5367:2: ( ruleAbstractRule )
            {
            // InternalDsl.g:5367:2: ( ruleAbstractRule )
            // InternalDsl.g:5368:3: ruleAbstractRule
            {
             before(grammarAccess.getNotRuleAccess().getRuleAbstractRuleParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleAbstractRule();

            state._fsp--;

             after(grammarAccess.getNotRuleAccess().getRuleAbstractRuleParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__NotRule__RuleAssignment_2"


    // $ANTLR start "rule__ImplicationRule__AntecedentAssignment_3"
    // InternalDsl.g:5377:1: rule__ImplicationRule__AntecedentAssignment_3 : ( ruleAbstractRule ) ;
    public final void rule__ImplicationRule__AntecedentAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5381:1: ( ( ruleAbstractRule ) )
            // InternalDsl.g:5382:2: ( ruleAbstractRule )
            {
            // InternalDsl.g:5382:2: ( ruleAbstractRule )
            // InternalDsl.g:5383:3: ruleAbstractRule
            {
             before(grammarAccess.getImplicationRuleAccess().getAntecedentAbstractRuleParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleAbstractRule();

            state._fsp--;

             after(grammarAccess.getImplicationRuleAccess().getAntecedentAbstractRuleParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__ImplicationRule__AntecedentAssignment_3"


    // $ANTLR start "rule__ImplicationRule__ConsequentAssignment_5"
    // InternalDsl.g:5392:1: rule__ImplicationRule__ConsequentAssignment_5 : ( ruleAbstractRule ) ;
    public final void rule__ImplicationRule__ConsequentAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5396:1: ( ( ruleAbstractRule ) )
            // InternalDsl.g:5397:2: ( ruleAbstractRule )
            {
            // InternalDsl.g:5397:2: ( ruleAbstractRule )
            // InternalDsl.g:5398:3: ruleAbstractRule
            {
             before(grammarAccess.getImplicationRuleAccess().getConsequentAbstractRuleParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleAbstractRule();

            state._fsp--;

             after(grammarAccess.getImplicationRuleAccess().getConsequentAbstractRuleParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__ImplicationRule__ConsequentAssignment_5"


    // $ANTLR start "rule__SourceTypeRule__NameAssignment_2"
    // InternalDsl.g:5407:1: rule__SourceTypeRule__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__SourceTypeRule__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5411:1: ( ( ruleEString ) )
            // InternalDsl.g:5412:2: ( ruleEString )
            {
            // InternalDsl.g:5412:2: ( ruleEString )
            // InternalDsl.g:5413:3: ruleEString
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
    // InternalDsl.g:5422:1: rule__TargetTypeRule__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__TargetTypeRule__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5426:1: ( ( ruleEString ) )
            // InternalDsl.g:5427:2: ( ruleEString )
            {
            // InternalDsl.g:5427:2: ( ruleEString )
            // InternalDsl.g:5428:3: ruleEString
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
    // InternalDsl.g:5437:1: rule__CommandNameRule__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__CommandNameRule__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5441:1: ( ( ruleEString ) )
            // InternalDsl.g:5442:2: ( ruleEString )
            {
            // InternalDsl.g:5442:2: ( ruleEString )
            // InternalDsl.g:5443:3: ruleEString
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
    // InternalDsl.g:5452:1: rule__ShapeTypeRule__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__ShapeTypeRule__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5456:1: ( ( ruleEString ) )
            // InternalDsl.g:5457:2: ( ruleEString )
            {
            // InternalDsl.g:5457:2: ( ruleEString )
            // InternalDsl.g:5458:3: ruleEString
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
    // InternalDsl.g:5467:1: rule__ParentTypeRule__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__ParentTypeRule__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5471:1: ( ( ruleEString ) )
            // InternalDsl.g:5472:2: ( ruleEString )
            {
            // InternalDsl.g:5472:2: ( ruleEString )
            // InternalDsl.g:5473:3: ruleEString
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
    // InternalDsl.g:5482:1: rule__ShapeNameRule__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__ShapeNameRule__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5486:1: ( ( ruleEString ) )
            // InternalDsl.g:5487:2: ( ruleEString )
            {
            // InternalDsl.g:5487:2: ( ruleEString )
            // InternalDsl.g:5488:3: ruleEString
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


    // $ANTLR start "rule__MappingExpression__RuleAssignment_1_2"
    // InternalDsl.g:5497:1: rule__MappingExpression__RuleAssignment_1_2 : ( ruleAndMapping ) ;
    public final void rule__MappingExpression__RuleAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5501:1: ( ( ruleAndMapping ) )
            // InternalDsl.g:5502:2: ( ruleAndMapping )
            {
            // InternalDsl.g:5502:2: ( ruleAndMapping )
            // InternalDsl.g:5503:3: ruleAndMapping
            {
             before(grammarAccess.getMappingExpressionAccess().getRuleAndMappingParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleAndMapping();

            state._fsp--;

             after(grammarAccess.getMappingExpressionAccess().getRuleAndMappingParserRuleCall_1_2_0()); 

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
    // $ANTLR end "rule__MappingExpression__RuleAssignment_1_2"


    // $ANTLR start "rule__AndMapping__RulesAssignment_1_2"
    // InternalDsl.g:5512:1: rule__AndMapping__RulesAssignment_1_2 : ( ruleOrMapping ) ;
    public final void rule__AndMapping__RulesAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5516:1: ( ( ruleOrMapping ) )
            // InternalDsl.g:5517:2: ( ruleOrMapping )
            {
            // InternalDsl.g:5517:2: ( ruleOrMapping )
            // InternalDsl.g:5518:3: ruleOrMapping
            {
             before(grammarAccess.getAndMappingAccess().getRulesOrMappingParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleOrMapping();

            state._fsp--;

             after(grammarAccess.getAndMappingAccess().getRulesOrMappingParserRuleCall_1_2_0()); 

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


    // $ANTLR start "rule__OrMapping__RulesAssignment_1_2"
    // InternalDsl.g:5527:1: rule__OrMapping__RulesAssignment_1_2 : ( rulePrimary ) ;
    public final void rule__OrMapping__RulesAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5531:1: ( ( rulePrimary ) )
            // InternalDsl.g:5532:2: ( rulePrimary )
            {
            // InternalDsl.g:5532:2: ( rulePrimary )
            // InternalDsl.g:5533:3: rulePrimary
            {
             before(grammarAccess.getOrMappingAccess().getRulesPrimaryParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            rulePrimary();

            state._fsp--;

             after(grammarAccess.getOrMappingAccess().getRulesPrimaryParserRuleCall_1_2_0()); 

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

    // Delegated rules


    protected DFA3 dfa3 = new DFA3(this);
    static final String dfa_1s = "\14\uffff";
    static final String dfa_2s = "\1\27\1\4\1\uffff\1\27\4\uffff\1\4\3\uffff";
    static final String dfa_3s = "\1\63\1\5\1\uffff\1\63\4\uffff\1\5\3\uffff";
    static final String dfa_4s = "\2\uffff\1\1\1\uffff\1\1\1\2\2\1\1\uffff\3\1";
    static final String dfa_5s = "\14\uffff}>";
    static final String[] dfa_6s = {
            "\1\1\1\2\1\3\2\2\2\uffff\1\4\24\uffff\1\5",
            "\1\6\1\7",
            "",
            "\1\10\4\7\2\uffff\1\11\24\uffff\1\5",
            "",
            "",
            "",
            "",
            "\1\12\1\13",
            "",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA3 extends DFA {

        public DFA3(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 3;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "1089:1: rule__Mapping__RuleAlternatives_3_0 : ( ( ruleAbstractMappingRule ) | ( ruleMappingExpression ) );";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000014000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000044000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0001FFFF80000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x000800004F800000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x000000004F800000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0010000000000000L});

}