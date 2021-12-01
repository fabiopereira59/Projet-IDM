package fr.n7.ide.contentassist.antlr.internal;

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
import fr.n7.services.GameGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalGameParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_BOOL", "RULE_COND", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'debut'", "'fin'", "'intermediaire'", "'territoire'", "'{'", "'}'", "'explorateur'", "'connaissances'", "'position'", "'sac'", "'description'", "'depotO'", "'personnes'", "'personne'", "'visible'", "'obligatoire'", "'interaction'", "'texte'", "'choix'", "'choixdebut'", "'choixfin'", "'action'", "'attributionC'", "'attributionO'", "'consommationO'", "'transformable'", "'transmission'", "'consommation'", "'objetsE'", "'objetsL'", "'condition'", "'chemins'", "'chemin'", "'destination'", "'ouvert'"
    };
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_ID=4;
    public static final int RULE_COND=8;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=9;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=10;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=11;
    public static final int RULE_ANY_OTHER=12;
    public static final int RULE_BOOL=7;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalGameParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalGameParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalGameParser.tokenNames; }
    public String getGrammarFileName() { return "InternalGame.g"; }


    	private GameGrammarAccess grammarAccess;

    	public void setGrammarAccess(GameGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleGame"
    // InternalGame.g:53:1: entryRuleGame : ruleGame EOF ;
    public final void entryRuleGame() throws RecognitionException {
        try {
            // InternalGame.g:54:1: ( ruleGame EOF )
            // InternalGame.g:55:1: ruleGame EOF
            {
             before(grammarAccess.getGameRule()); 
            pushFollow(FOLLOW_1);
            ruleGame();

            state._fsp--;

             after(grammarAccess.getGameRule()); 
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
    // $ANTLR end "entryRuleGame"


    // $ANTLR start "ruleGame"
    // InternalGame.g:62:1: ruleGame : ( ( rule__Game__Group__0 ) ) ;
    public final void ruleGame() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:66:2: ( ( ( rule__Game__Group__0 ) ) )
            // InternalGame.g:67:2: ( ( rule__Game__Group__0 ) )
            {
            // InternalGame.g:67:2: ( ( rule__Game__Group__0 ) )
            // InternalGame.g:68:3: ( rule__Game__Group__0 )
            {
             before(grammarAccess.getGameAccess().getGroup()); 
            // InternalGame.g:69:3: ( rule__Game__Group__0 )
            // InternalGame.g:69:4: rule__Game__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Game__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGameAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGame"


    // $ANTLR start "entryRuleterritoireElement"
    // InternalGame.g:78:1: entryRuleterritoireElement : ruleterritoireElement EOF ;
    public final void entryRuleterritoireElement() throws RecognitionException {
        try {
            // InternalGame.g:79:1: ( ruleterritoireElement EOF )
            // InternalGame.g:80:1: ruleterritoireElement EOF
            {
             before(grammarAccess.getTerritoireElementRule()); 
            pushFollow(FOLLOW_1);
            ruleterritoireElement();

            state._fsp--;

             after(grammarAccess.getTerritoireElementRule()); 
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
    // $ANTLR end "entryRuleterritoireElement"


    // $ANTLR start "ruleterritoireElement"
    // InternalGame.g:87:1: ruleterritoireElement : ( ( rule__TerritoireElement__Alternatives ) ) ;
    public final void ruleterritoireElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:91:2: ( ( ( rule__TerritoireElement__Alternatives ) ) )
            // InternalGame.g:92:2: ( ( rule__TerritoireElement__Alternatives ) )
            {
            // InternalGame.g:92:2: ( ( rule__TerritoireElement__Alternatives ) )
            // InternalGame.g:93:3: ( rule__TerritoireElement__Alternatives )
            {
             before(grammarAccess.getTerritoireElementAccess().getAlternatives()); 
            // InternalGame.g:94:3: ( rule__TerritoireElement__Alternatives )
            // InternalGame.g:94:4: rule__TerritoireElement__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__TerritoireElement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTerritoireElementAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleterritoireElement"


    // $ANTLR start "entryRuleExplorateur"
    // InternalGame.g:103:1: entryRuleExplorateur : ruleExplorateur EOF ;
    public final void entryRuleExplorateur() throws RecognitionException {
        try {
            // InternalGame.g:104:1: ( ruleExplorateur EOF )
            // InternalGame.g:105:1: ruleExplorateur EOF
            {
             before(grammarAccess.getExplorateurRule()); 
            pushFollow(FOLLOW_1);
            ruleExplorateur();

            state._fsp--;

             after(grammarAccess.getExplorateurRule()); 
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
    // $ANTLR end "entryRuleExplorateur"


    // $ANTLR start "ruleExplorateur"
    // InternalGame.g:112:1: ruleExplorateur : ( ( rule__Explorateur__Group__0 ) ) ;
    public final void ruleExplorateur() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:116:2: ( ( ( rule__Explorateur__Group__0 ) ) )
            // InternalGame.g:117:2: ( ( rule__Explorateur__Group__0 ) )
            {
            // InternalGame.g:117:2: ( ( rule__Explorateur__Group__0 ) )
            // InternalGame.g:118:3: ( rule__Explorateur__Group__0 )
            {
             before(grammarAccess.getExplorateurAccess().getGroup()); 
            // InternalGame.g:119:3: ( rule__Explorateur__Group__0 )
            // InternalGame.g:119:4: rule__Explorateur__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Explorateur__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExplorateurAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExplorateur"


    // $ANTLR start "entryRuleSac"
    // InternalGame.g:128:1: entryRuleSac : ruleSac EOF ;
    public final void entryRuleSac() throws RecognitionException {
        try {
            // InternalGame.g:129:1: ( ruleSac EOF )
            // InternalGame.g:130:1: ruleSac EOF
            {
             before(grammarAccess.getSacRule()); 
            pushFollow(FOLLOW_1);
            ruleSac();

            state._fsp--;

             after(grammarAccess.getSacRule()); 
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
    // $ANTLR end "entryRuleSac"


    // $ANTLR start "ruleSac"
    // InternalGame.g:137:1: ruleSac : ( ( rule__Sac__Group__0 ) ) ;
    public final void ruleSac() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:141:2: ( ( ( rule__Sac__Group__0 ) ) )
            // InternalGame.g:142:2: ( ( rule__Sac__Group__0 ) )
            {
            // InternalGame.g:142:2: ( ( rule__Sac__Group__0 ) )
            // InternalGame.g:143:3: ( rule__Sac__Group__0 )
            {
             before(grammarAccess.getSacAccess().getGroup()); 
            // InternalGame.g:144:3: ( rule__Sac__Group__0 )
            // InternalGame.g:144:4: rule__Sac__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Sac__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSacAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSac"


    // $ANTLR start "entryRuleLieu"
    // InternalGame.g:153:1: entryRuleLieu : ruleLieu EOF ;
    public final void entryRuleLieu() throws RecognitionException {
        try {
            // InternalGame.g:154:1: ( ruleLieu EOF )
            // InternalGame.g:155:1: ruleLieu EOF
            {
             before(grammarAccess.getLieuRule()); 
            pushFollow(FOLLOW_1);
            ruleLieu();

            state._fsp--;

             after(grammarAccess.getLieuRule()); 
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
    // $ANTLR end "entryRuleLieu"


    // $ANTLR start "ruleLieu"
    // InternalGame.g:162:1: ruleLieu : ( ( rule__Lieu__Group__0 ) ) ;
    public final void ruleLieu() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:166:2: ( ( ( rule__Lieu__Group__0 ) ) )
            // InternalGame.g:167:2: ( ( rule__Lieu__Group__0 ) )
            {
            // InternalGame.g:167:2: ( ( rule__Lieu__Group__0 ) )
            // InternalGame.g:168:3: ( rule__Lieu__Group__0 )
            {
             before(grammarAccess.getLieuAccess().getGroup()); 
            // InternalGame.g:169:3: ( rule__Lieu__Group__0 )
            // InternalGame.g:169:4: rule__Lieu__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Lieu__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLieuAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLieu"


    // $ANTLR start "entryRulePersonnes"
    // InternalGame.g:178:1: entryRulePersonnes : rulePersonnes EOF ;
    public final void entryRulePersonnes() throws RecognitionException {
        try {
            // InternalGame.g:179:1: ( rulePersonnes EOF )
            // InternalGame.g:180:1: rulePersonnes EOF
            {
             before(grammarAccess.getPersonnesRule()); 
            pushFollow(FOLLOW_1);
            rulePersonnes();

            state._fsp--;

             after(grammarAccess.getPersonnesRule()); 
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
    // $ANTLR end "entryRulePersonnes"


    // $ANTLR start "rulePersonnes"
    // InternalGame.g:187:1: rulePersonnes : ( ( rule__Personnes__Group__0 ) ) ;
    public final void rulePersonnes() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:191:2: ( ( ( rule__Personnes__Group__0 ) ) )
            // InternalGame.g:192:2: ( ( rule__Personnes__Group__0 ) )
            {
            // InternalGame.g:192:2: ( ( rule__Personnes__Group__0 ) )
            // InternalGame.g:193:3: ( rule__Personnes__Group__0 )
            {
             before(grammarAccess.getPersonnesAccess().getGroup()); 
            // InternalGame.g:194:3: ( rule__Personnes__Group__0 )
            // InternalGame.g:194:4: rule__Personnes__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Personnes__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPersonnesAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePersonnes"


    // $ANTLR start "entryRulePersonne"
    // InternalGame.g:203:1: entryRulePersonne : rulePersonne EOF ;
    public final void entryRulePersonne() throws RecognitionException {
        try {
            // InternalGame.g:204:1: ( rulePersonne EOF )
            // InternalGame.g:205:1: rulePersonne EOF
            {
             before(grammarAccess.getPersonneRule()); 
            pushFollow(FOLLOW_1);
            rulePersonne();

            state._fsp--;

             after(grammarAccess.getPersonneRule()); 
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
    // $ANTLR end "entryRulePersonne"


    // $ANTLR start "rulePersonne"
    // InternalGame.g:212:1: rulePersonne : ( ( rule__Personne__Group__0 ) ) ;
    public final void rulePersonne() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:216:2: ( ( ( rule__Personne__Group__0 ) ) )
            // InternalGame.g:217:2: ( ( rule__Personne__Group__0 ) )
            {
            // InternalGame.g:217:2: ( ( rule__Personne__Group__0 ) )
            // InternalGame.g:218:3: ( rule__Personne__Group__0 )
            {
             before(grammarAccess.getPersonneAccess().getGroup()); 
            // InternalGame.g:219:3: ( rule__Personne__Group__0 )
            // InternalGame.g:219:4: rule__Personne__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Personne__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPersonneAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePersonne"


    // $ANTLR start "entryRuleInteraction"
    // InternalGame.g:228:1: entryRuleInteraction : ruleInteraction EOF ;
    public final void entryRuleInteraction() throws RecognitionException {
        try {
            // InternalGame.g:229:1: ( ruleInteraction EOF )
            // InternalGame.g:230:1: ruleInteraction EOF
            {
             before(grammarAccess.getInteractionRule()); 
            pushFollow(FOLLOW_1);
            ruleInteraction();

            state._fsp--;

             after(grammarAccess.getInteractionRule()); 
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
    // $ANTLR end "entryRuleInteraction"


    // $ANTLR start "ruleInteraction"
    // InternalGame.g:237:1: ruleInteraction : ( ( rule__Interaction__Group__0 ) ) ;
    public final void ruleInteraction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:241:2: ( ( ( rule__Interaction__Group__0 ) ) )
            // InternalGame.g:242:2: ( ( rule__Interaction__Group__0 ) )
            {
            // InternalGame.g:242:2: ( ( rule__Interaction__Group__0 ) )
            // InternalGame.g:243:3: ( rule__Interaction__Group__0 )
            {
             before(grammarAccess.getInteractionAccess().getGroup()); 
            // InternalGame.g:244:3: ( rule__Interaction__Group__0 )
            // InternalGame.g:244:4: rule__Interaction__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Interaction__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInteractionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInteraction"


    // $ANTLR start "entryRuleChoix"
    // InternalGame.g:253:1: entryRuleChoix : ruleChoix EOF ;
    public final void entryRuleChoix() throws RecognitionException {
        try {
            // InternalGame.g:254:1: ( ruleChoix EOF )
            // InternalGame.g:255:1: ruleChoix EOF
            {
             before(grammarAccess.getChoixRule()); 
            pushFollow(FOLLOW_1);
            ruleChoix();

            state._fsp--;

             after(grammarAccess.getChoixRule()); 
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
    // $ANTLR end "entryRuleChoix"


    // $ANTLR start "ruleChoix"
    // InternalGame.g:262:1: ruleChoix : ( ( rule__Choix__Group__0 ) ) ;
    public final void ruleChoix() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:266:2: ( ( ( rule__Choix__Group__0 ) ) )
            // InternalGame.g:267:2: ( ( rule__Choix__Group__0 ) )
            {
            // InternalGame.g:267:2: ( ( rule__Choix__Group__0 ) )
            // InternalGame.g:268:3: ( rule__Choix__Group__0 )
            {
             before(grammarAccess.getChoixAccess().getGroup()); 
            // InternalGame.g:269:3: ( rule__Choix__Group__0 )
            // InternalGame.g:269:4: rule__Choix__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Choix__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getChoixAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleChoix"


    // $ANTLR start "entryRuleAction"
    // InternalGame.g:278:1: entryRuleAction : ruleAction EOF ;
    public final void entryRuleAction() throws RecognitionException {
        try {
            // InternalGame.g:279:1: ( ruleAction EOF )
            // InternalGame.g:280:1: ruleAction EOF
            {
             before(grammarAccess.getActionRule()); 
            pushFollow(FOLLOW_1);
            ruleAction();

            state._fsp--;

             after(grammarAccess.getActionRule()); 
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
    // $ANTLR end "entryRuleAction"


    // $ANTLR start "ruleAction"
    // InternalGame.g:287:1: ruleAction : ( ( rule__Action__Group__0 ) ) ;
    public final void ruleAction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:291:2: ( ( ( rule__Action__Group__0 ) ) )
            // InternalGame.g:292:2: ( ( rule__Action__Group__0 ) )
            {
            // InternalGame.g:292:2: ( ( rule__Action__Group__0 ) )
            // InternalGame.g:293:3: ( rule__Action__Group__0 )
            {
             before(grammarAccess.getActionAccess().getGroup()); 
            // InternalGame.g:294:3: ( rule__Action__Group__0 )
            // InternalGame.g:294:4: rule__Action__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Action__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getActionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAction"


    // $ANTLR start "entryRuleObjetExplorateur"
    // InternalGame.g:303:1: entryRuleObjetExplorateur : ruleObjetExplorateur EOF ;
    public final void entryRuleObjetExplorateur() throws RecognitionException {
        try {
            // InternalGame.g:304:1: ( ruleObjetExplorateur EOF )
            // InternalGame.g:305:1: ruleObjetExplorateur EOF
            {
             before(grammarAccess.getObjetExplorateurRule()); 
            pushFollow(FOLLOW_1);
            ruleObjetExplorateur();

            state._fsp--;

             after(grammarAccess.getObjetExplorateurRule()); 
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
    // $ANTLR end "entryRuleObjetExplorateur"


    // $ANTLR start "ruleObjetExplorateur"
    // InternalGame.g:312:1: ruleObjetExplorateur : ( ( rule__ObjetExplorateur__Group__0 ) ) ;
    public final void ruleObjetExplorateur() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:316:2: ( ( ( rule__ObjetExplorateur__Group__0 ) ) )
            // InternalGame.g:317:2: ( ( rule__ObjetExplorateur__Group__0 ) )
            {
            // InternalGame.g:317:2: ( ( rule__ObjetExplorateur__Group__0 ) )
            // InternalGame.g:318:3: ( rule__ObjetExplorateur__Group__0 )
            {
             before(grammarAccess.getObjetExplorateurAccess().getGroup()); 
            // InternalGame.g:319:3: ( rule__ObjetExplorateur__Group__0 )
            // InternalGame.g:319:4: rule__ObjetExplorateur__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ObjetExplorateur__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getObjetExplorateurAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleObjetExplorateur"


    // $ANTLR start "entryRuleObjetLieu"
    // InternalGame.g:328:1: entryRuleObjetLieu : ruleObjetLieu EOF ;
    public final void entryRuleObjetLieu() throws RecognitionException {
        try {
            // InternalGame.g:329:1: ( ruleObjetLieu EOF )
            // InternalGame.g:330:1: ruleObjetLieu EOF
            {
             before(grammarAccess.getObjetLieuRule()); 
            pushFollow(FOLLOW_1);
            ruleObjetLieu();

            state._fsp--;

             after(grammarAccess.getObjetLieuRule()); 
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
    // $ANTLR end "entryRuleObjetLieu"


    // $ANTLR start "ruleObjetLieu"
    // InternalGame.g:337:1: ruleObjetLieu : ( ( rule__ObjetLieu__Group__0 ) ) ;
    public final void ruleObjetLieu() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:341:2: ( ( ( rule__ObjetLieu__Group__0 ) ) )
            // InternalGame.g:342:2: ( ( rule__ObjetLieu__Group__0 ) )
            {
            // InternalGame.g:342:2: ( ( rule__ObjetLieu__Group__0 ) )
            // InternalGame.g:343:3: ( rule__ObjetLieu__Group__0 )
            {
             before(grammarAccess.getObjetLieuAccess().getGroup()); 
            // InternalGame.g:344:3: ( rule__ObjetLieu__Group__0 )
            // InternalGame.g:344:4: rule__ObjetLieu__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ObjetLieu__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getObjetLieuAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleObjetLieu"


    // $ANTLR start "entryRuleObjetsExplorateur"
    // InternalGame.g:353:1: entryRuleObjetsExplorateur : ruleObjetsExplorateur EOF ;
    public final void entryRuleObjetsExplorateur() throws RecognitionException {
        try {
            // InternalGame.g:354:1: ( ruleObjetsExplorateur EOF )
            // InternalGame.g:355:1: ruleObjetsExplorateur EOF
            {
             before(grammarAccess.getObjetsExplorateurRule()); 
            pushFollow(FOLLOW_1);
            ruleObjetsExplorateur();

            state._fsp--;

             after(grammarAccess.getObjetsExplorateurRule()); 
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
    // $ANTLR end "entryRuleObjetsExplorateur"


    // $ANTLR start "ruleObjetsExplorateur"
    // InternalGame.g:362:1: ruleObjetsExplorateur : ( ( rule__ObjetsExplorateur__Group__0 ) ) ;
    public final void ruleObjetsExplorateur() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:366:2: ( ( ( rule__ObjetsExplorateur__Group__0 ) ) )
            // InternalGame.g:367:2: ( ( rule__ObjetsExplorateur__Group__0 ) )
            {
            // InternalGame.g:367:2: ( ( rule__ObjetsExplorateur__Group__0 ) )
            // InternalGame.g:368:3: ( rule__ObjetsExplorateur__Group__0 )
            {
             before(grammarAccess.getObjetsExplorateurAccess().getGroup()); 
            // InternalGame.g:369:3: ( rule__ObjetsExplorateur__Group__0 )
            // InternalGame.g:369:4: rule__ObjetsExplorateur__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ObjetsExplorateur__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getObjetsExplorateurAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleObjetsExplorateur"


    // $ANTLR start "entryRuleObjetsLieu"
    // InternalGame.g:378:1: entryRuleObjetsLieu : ruleObjetsLieu EOF ;
    public final void entryRuleObjetsLieu() throws RecognitionException {
        try {
            // InternalGame.g:379:1: ( ruleObjetsLieu EOF )
            // InternalGame.g:380:1: ruleObjetsLieu EOF
            {
             before(grammarAccess.getObjetsLieuRule()); 
            pushFollow(FOLLOW_1);
            ruleObjetsLieu();

            state._fsp--;

             after(grammarAccess.getObjetsLieuRule()); 
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
    // $ANTLR end "entryRuleObjetsLieu"


    // $ANTLR start "ruleObjetsLieu"
    // InternalGame.g:387:1: ruleObjetsLieu : ( ( rule__ObjetsLieu__Group__0 ) ) ;
    public final void ruleObjetsLieu() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:391:2: ( ( ( rule__ObjetsLieu__Group__0 ) ) )
            // InternalGame.g:392:2: ( ( rule__ObjetsLieu__Group__0 ) )
            {
            // InternalGame.g:392:2: ( ( rule__ObjetsLieu__Group__0 ) )
            // InternalGame.g:393:3: ( rule__ObjetsLieu__Group__0 )
            {
             before(grammarAccess.getObjetsLieuAccess().getGroup()); 
            // InternalGame.g:394:3: ( rule__ObjetsLieu__Group__0 )
            // InternalGame.g:394:4: rule__ObjetsLieu__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ObjetsLieu__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getObjetsLieuAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleObjetsLieu"


    // $ANTLR start "entryRuleConnaissances"
    // InternalGame.g:403:1: entryRuleConnaissances : ruleConnaissances EOF ;
    public final void entryRuleConnaissances() throws RecognitionException {
        try {
            // InternalGame.g:404:1: ( ruleConnaissances EOF )
            // InternalGame.g:405:1: ruleConnaissances EOF
            {
             before(grammarAccess.getConnaissancesRule()); 
            pushFollow(FOLLOW_1);
            ruleConnaissances();

            state._fsp--;

             after(grammarAccess.getConnaissancesRule()); 
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
    // $ANTLR end "entryRuleConnaissances"


    // $ANTLR start "ruleConnaissances"
    // InternalGame.g:412:1: ruleConnaissances : ( ( rule__Connaissances__Group__0 ) ) ;
    public final void ruleConnaissances() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:416:2: ( ( ( rule__Connaissances__Group__0 ) ) )
            // InternalGame.g:417:2: ( ( rule__Connaissances__Group__0 ) )
            {
            // InternalGame.g:417:2: ( ( rule__Connaissances__Group__0 ) )
            // InternalGame.g:418:3: ( rule__Connaissances__Group__0 )
            {
             before(grammarAccess.getConnaissancesAccess().getGroup()); 
            // InternalGame.g:419:3: ( rule__Connaissances__Group__0 )
            // InternalGame.g:419:4: rule__Connaissances__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Connaissances__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConnaissancesAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConnaissances"


    // $ANTLR start "entryRuleConnaissance"
    // InternalGame.g:428:1: entryRuleConnaissance : ruleConnaissance EOF ;
    public final void entryRuleConnaissance() throws RecognitionException {
        try {
            // InternalGame.g:429:1: ( ruleConnaissance EOF )
            // InternalGame.g:430:1: ruleConnaissance EOF
            {
             before(grammarAccess.getConnaissanceRule()); 
            pushFollow(FOLLOW_1);
            ruleConnaissance();

            state._fsp--;

             after(grammarAccess.getConnaissanceRule()); 
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
    // $ANTLR end "entryRuleConnaissance"


    // $ANTLR start "ruleConnaissance"
    // InternalGame.g:437:1: ruleConnaissance : ( ( rule__Connaissance__Group__0 ) ) ;
    public final void ruleConnaissance() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:441:2: ( ( ( rule__Connaissance__Group__0 ) ) )
            // InternalGame.g:442:2: ( ( rule__Connaissance__Group__0 ) )
            {
            // InternalGame.g:442:2: ( ( rule__Connaissance__Group__0 ) )
            // InternalGame.g:443:3: ( rule__Connaissance__Group__0 )
            {
             before(grammarAccess.getConnaissanceAccess().getGroup()); 
            // InternalGame.g:444:3: ( rule__Connaissance__Group__0 )
            // InternalGame.g:444:4: rule__Connaissance__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Connaissance__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConnaissanceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConnaissance"


    // $ANTLR start "entryRuleCondition"
    // InternalGame.g:453:1: entryRuleCondition : ruleCondition EOF ;
    public final void entryRuleCondition() throws RecognitionException {
        try {
            // InternalGame.g:454:1: ( ruleCondition EOF )
            // InternalGame.g:455:1: ruleCondition EOF
            {
             before(grammarAccess.getConditionRule()); 
            pushFollow(FOLLOW_1);
            ruleCondition();

            state._fsp--;

             after(grammarAccess.getConditionRule()); 
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
    // $ANTLR end "entryRuleCondition"


    // $ANTLR start "ruleCondition"
    // InternalGame.g:462:1: ruleCondition : ( ( rule__Condition__Group__0 ) ) ;
    public final void ruleCondition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:466:2: ( ( ( rule__Condition__Group__0 ) ) )
            // InternalGame.g:467:2: ( ( rule__Condition__Group__0 ) )
            {
            // InternalGame.g:467:2: ( ( rule__Condition__Group__0 ) )
            // InternalGame.g:468:3: ( rule__Condition__Group__0 )
            {
             before(grammarAccess.getConditionAccess().getGroup()); 
            // InternalGame.g:469:3: ( rule__Condition__Group__0 )
            // InternalGame.g:469:4: rule__Condition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Condition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConditionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCondition"


    // $ANTLR start "entryRuleChemins"
    // InternalGame.g:478:1: entryRuleChemins : ruleChemins EOF ;
    public final void entryRuleChemins() throws RecognitionException {
        try {
            // InternalGame.g:479:1: ( ruleChemins EOF )
            // InternalGame.g:480:1: ruleChemins EOF
            {
             before(grammarAccess.getCheminsRule()); 
            pushFollow(FOLLOW_1);
            ruleChemins();

            state._fsp--;

             after(grammarAccess.getCheminsRule()); 
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
    // $ANTLR end "entryRuleChemins"


    // $ANTLR start "ruleChemins"
    // InternalGame.g:487:1: ruleChemins : ( ( rule__Chemins__Group__0 ) ) ;
    public final void ruleChemins() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:491:2: ( ( ( rule__Chemins__Group__0 ) ) )
            // InternalGame.g:492:2: ( ( rule__Chemins__Group__0 ) )
            {
            // InternalGame.g:492:2: ( ( rule__Chemins__Group__0 ) )
            // InternalGame.g:493:3: ( rule__Chemins__Group__0 )
            {
             before(grammarAccess.getCheminsAccess().getGroup()); 
            // InternalGame.g:494:3: ( rule__Chemins__Group__0 )
            // InternalGame.g:494:4: rule__Chemins__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Chemins__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCheminsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleChemins"


    // $ANTLR start "entryRuleChemin"
    // InternalGame.g:503:1: entryRuleChemin : ruleChemin EOF ;
    public final void entryRuleChemin() throws RecognitionException {
        try {
            // InternalGame.g:504:1: ( ruleChemin EOF )
            // InternalGame.g:505:1: ruleChemin EOF
            {
             before(grammarAccess.getCheminRule()); 
            pushFollow(FOLLOW_1);
            ruleChemin();

            state._fsp--;

             after(grammarAccess.getCheminRule()); 
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
    // $ANTLR end "entryRuleChemin"


    // $ANTLR start "ruleChemin"
    // InternalGame.g:512:1: ruleChemin : ( ( rule__Chemin__Group__0 ) ) ;
    public final void ruleChemin() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:516:2: ( ( ( rule__Chemin__Group__0 ) ) )
            // InternalGame.g:517:2: ( ( rule__Chemin__Group__0 ) )
            {
            // InternalGame.g:517:2: ( ( rule__Chemin__Group__0 ) )
            // InternalGame.g:518:3: ( rule__Chemin__Group__0 )
            {
             before(grammarAccess.getCheminAccess().getGroup()); 
            // InternalGame.g:519:3: ( rule__Chemin__Group__0 )
            // InternalGame.g:519:4: rule__Chemin__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Chemin__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCheminAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleChemin"


    // $ANTLR start "ruleTypeLieu"
    // InternalGame.g:528:1: ruleTypeLieu : ( ( rule__TypeLieu__Alternatives ) ) ;
    public final void ruleTypeLieu() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:532:1: ( ( ( rule__TypeLieu__Alternatives ) ) )
            // InternalGame.g:533:2: ( ( rule__TypeLieu__Alternatives ) )
            {
            // InternalGame.g:533:2: ( ( rule__TypeLieu__Alternatives ) )
            // InternalGame.g:534:3: ( rule__TypeLieu__Alternatives )
            {
             before(grammarAccess.getTypeLieuAccess().getAlternatives()); 
            // InternalGame.g:535:3: ( rule__TypeLieu__Alternatives )
            // InternalGame.g:535:4: rule__TypeLieu__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__TypeLieu__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTypeLieuAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTypeLieu"


    // $ANTLR start "rule__TerritoireElement__Alternatives"
    // InternalGame.g:543:1: rule__TerritoireElement__Alternatives : ( ( ruleExplorateur ) | ( ruleLieu ) | ( ruleObjetsExplorateur ) | ( ruleObjetsLieu ) | ( ruleConnaissances ) | ( rulePersonnes ) | ( ruleChemins ) );
    public final void rule__TerritoireElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:547:1: ( ( ruleExplorateur ) | ( ruleLieu ) | ( ruleObjetsExplorateur ) | ( ruleObjetsLieu ) | ( ruleConnaissances ) | ( rulePersonnes ) | ( ruleChemins ) )
            int alt1=7;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt1=1;
                }
                break;
            case 13:
            case 14:
            case 15:
                {
                alt1=2;
                }
                break;
            case 41:
                {
                alt1=3;
                }
                break;
            case 42:
                {
                alt1=4;
                }
                break;
            case 20:
                {
                alt1=5;
                }
                break;
            case 25:
                {
                alt1=6;
                }
                break;
            case 44:
                {
                alt1=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalGame.g:548:2: ( ruleExplorateur )
                    {
                    // InternalGame.g:548:2: ( ruleExplorateur )
                    // InternalGame.g:549:3: ruleExplorateur
                    {
                     before(grammarAccess.getTerritoireElementAccess().getExplorateurParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleExplorateur();

                    state._fsp--;

                     after(grammarAccess.getTerritoireElementAccess().getExplorateurParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGame.g:554:2: ( ruleLieu )
                    {
                    // InternalGame.g:554:2: ( ruleLieu )
                    // InternalGame.g:555:3: ruleLieu
                    {
                     before(grammarAccess.getTerritoireElementAccess().getLieuParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleLieu();

                    state._fsp--;

                     after(grammarAccess.getTerritoireElementAccess().getLieuParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalGame.g:560:2: ( ruleObjetsExplorateur )
                    {
                    // InternalGame.g:560:2: ( ruleObjetsExplorateur )
                    // InternalGame.g:561:3: ruleObjetsExplorateur
                    {
                     before(grammarAccess.getTerritoireElementAccess().getObjetsExplorateurParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleObjetsExplorateur();

                    state._fsp--;

                     after(grammarAccess.getTerritoireElementAccess().getObjetsExplorateurParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalGame.g:566:2: ( ruleObjetsLieu )
                    {
                    // InternalGame.g:566:2: ( ruleObjetsLieu )
                    // InternalGame.g:567:3: ruleObjetsLieu
                    {
                     before(grammarAccess.getTerritoireElementAccess().getObjetsLieuParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleObjetsLieu();

                    state._fsp--;

                     after(grammarAccess.getTerritoireElementAccess().getObjetsLieuParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalGame.g:572:2: ( ruleConnaissances )
                    {
                    // InternalGame.g:572:2: ( ruleConnaissances )
                    // InternalGame.g:573:3: ruleConnaissances
                    {
                     before(grammarAccess.getTerritoireElementAccess().getConnaissancesParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleConnaissances();

                    state._fsp--;

                     after(grammarAccess.getTerritoireElementAccess().getConnaissancesParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalGame.g:578:2: ( rulePersonnes )
                    {
                    // InternalGame.g:578:2: ( rulePersonnes )
                    // InternalGame.g:579:3: rulePersonnes
                    {
                     before(grammarAccess.getTerritoireElementAccess().getPersonnesParserRuleCall_5()); 
                    pushFollow(FOLLOW_2);
                    rulePersonnes();

                    state._fsp--;

                     after(grammarAccess.getTerritoireElementAccess().getPersonnesParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalGame.g:584:2: ( ruleChemins )
                    {
                    // InternalGame.g:584:2: ( ruleChemins )
                    // InternalGame.g:585:3: ruleChemins
                    {
                     before(grammarAccess.getTerritoireElementAccess().getCheminsParserRuleCall_6()); 
                    pushFollow(FOLLOW_2);
                    ruleChemins();

                    state._fsp--;

                     after(grammarAccess.getTerritoireElementAccess().getCheminsParserRuleCall_6()); 

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
    // $ANTLR end "rule__TerritoireElement__Alternatives"


    // $ANTLR start "rule__TypeLieu__Alternatives"
    // InternalGame.g:594:1: rule__TypeLieu__Alternatives : ( ( ( 'debut' ) ) | ( ( 'fin' ) ) | ( ( 'intermediaire' ) ) );
    public final void rule__TypeLieu__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:598:1: ( ( ( 'debut' ) ) | ( ( 'fin' ) ) | ( ( 'intermediaire' ) ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt2=1;
                }
                break;
            case 14:
                {
                alt2=2;
                }
                break;
            case 15:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalGame.g:599:2: ( ( 'debut' ) )
                    {
                    // InternalGame.g:599:2: ( ( 'debut' ) )
                    // InternalGame.g:600:3: ( 'debut' )
                    {
                     before(grammarAccess.getTypeLieuAccess().getLieuDebutEnumLiteralDeclaration_0()); 
                    // InternalGame.g:601:3: ( 'debut' )
                    // InternalGame.g:601:4: 'debut'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getTypeLieuAccess().getLieuDebutEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGame.g:605:2: ( ( 'fin' ) )
                    {
                    // InternalGame.g:605:2: ( ( 'fin' ) )
                    // InternalGame.g:606:3: ( 'fin' )
                    {
                     before(grammarAccess.getTypeLieuAccess().getLieuFinEnumLiteralDeclaration_1()); 
                    // InternalGame.g:607:3: ( 'fin' )
                    // InternalGame.g:607:4: 'fin'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getTypeLieuAccess().getLieuFinEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalGame.g:611:2: ( ( 'intermediaire' ) )
                    {
                    // InternalGame.g:611:2: ( ( 'intermediaire' ) )
                    // InternalGame.g:612:3: ( 'intermediaire' )
                    {
                     before(grammarAccess.getTypeLieuAccess().getLieuIntermediaireEnumLiteralDeclaration_2()); 
                    // InternalGame.g:613:3: ( 'intermediaire' )
                    // InternalGame.g:613:4: 'intermediaire'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getTypeLieuAccess().getLieuIntermediaireEnumLiteralDeclaration_2()); 

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
    // $ANTLR end "rule__TypeLieu__Alternatives"


    // $ANTLR start "rule__Game__Group__0"
    // InternalGame.g:621:1: rule__Game__Group__0 : rule__Game__Group__0__Impl rule__Game__Group__1 ;
    public final void rule__Game__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:625:1: ( rule__Game__Group__0__Impl rule__Game__Group__1 )
            // InternalGame.g:626:2: rule__Game__Group__0__Impl rule__Game__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Game__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Game__Group__1();

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
    // $ANTLR end "rule__Game__Group__0"


    // $ANTLR start "rule__Game__Group__0__Impl"
    // InternalGame.g:633:1: rule__Game__Group__0__Impl : ( 'territoire' ) ;
    public final void rule__Game__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:637:1: ( ( 'territoire' ) )
            // InternalGame.g:638:1: ( 'territoire' )
            {
            // InternalGame.g:638:1: ( 'territoire' )
            // InternalGame.g:639:2: 'territoire'
            {
             before(grammarAccess.getGameAccess().getTerritoireKeyword_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getGameAccess().getTerritoireKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Game__Group__0__Impl"


    // $ANTLR start "rule__Game__Group__1"
    // InternalGame.g:648:1: rule__Game__Group__1 : rule__Game__Group__1__Impl rule__Game__Group__2 ;
    public final void rule__Game__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:652:1: ( rule__Game__Group__1__Impl rule__Game__Group__2 )
            // InternalGame.g:653:2: rule__Game__Group__1__Impl rule__Game__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Game__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Game__Group__2();

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
    // $ANTLR end "rule__Game__Group__1"


    // $ANTLR start "rule__Game__Group__1__Impl"
    // InternalGame.g:660:1: rule__Game__Group__1__Impl : ( ( rule__Game__NameAssignment_1 ) ) ;
    public final void rule__Game__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:664:1: ( ( ( rule__Game__NameAssignment_1 ) ) )
            // InternalGame.g:665:1: ( ( rule__Game__NameAssignment_1 ) )
            {
            // InternalGame.g:665:1: ( ( rule__Game__NameAssignment_1 ) )
            // InternalGame.g:666:2: ( rule__Game__NameAssignment_1 )
            {
             before(grammarAccess.getGameAccess().getNameAssignment_1()); 
            // InternalGame.g:667:2: ( rule__Game__NameAssignment_1 )
            // InternalGame.g:667:3: rule__Game__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Game__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getGameAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Game__Group__1__Impl"


    // $ANTLR start "rule__Game__Group__2"
    // InternalGame.g:675:1: rule__Game__Group__2 : rule__Game__Group__2__Impl rule__Game__Group__3 ;
    public final void rule__Game__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:679:1: ( rule__Game__Group__2__Impl rule__Game__Group__3 )
            // InternalGame.g:680:2: rule__Game__Group__2__Impl rule__Game__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Game__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Game__Group__3();

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
    // $ANTLR end "rule__Game__Group__2"


    // $ANTLR start "rule__Game__Group__2__Impl"
    // InternalGame.g:687:1: rule__Game__Group__2__Impl : ( '{' ) ;
    public final void rule__Game__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:691:1: ( ( '{' ) )
            // InternalGame.g:692:1: ( '{' )
            {
            // InternalGame.g:692:1: ( '{' )
            // InternalGame.g:693:2: '{'
            {
             before(grammarAccess.getGameAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getGameAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Game__Group__2__Impl"


    // $ANTLR start "rule__Game__Group__3"
    // InternalGame.g:702:1: rule__Game__Group__3 : rule__Game__Group__3__Impl rule__Game__Group__4 ;
    public final void rule__Game__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:706:1: ( rule__Game__Group__3__Impl rule__Game__Group__4 )
            // InternalGame.g:707:2: rule__Game__Group__3__Impl rule__Game__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__Game__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Game__Group__4();

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
    // $ANTLR end "rule__Game__Group__3"


    // $ANTLR start "rule__Game__Group__3__Impl"
    // InternalGame.g:714:1: rule__Game__Group__3__Impl : ( ( ( rule__Game__TerritoireElementsAssignment_3 ) ) ( ( rule__Game__TerritoireElementsAssignment_3 )* ) ) ;
    public final void rule__Game__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:718:1: ( ( ( ( rule__Game__TerritoireElementsAssignment_3 ) ) ( ( rule__Game__TerritoireElementsAssignment_3 )* ) ) )
            // InternalGame.g:719:1: ( ( ( rule__Game__TerritoireElementsAssignment_3 ) ) ( ( rule__Game__TerritoireElementsAssignment_3 )* ) )
            {
            // InternalGame.g:719:1: ( ( ( rule__Game__TerritoireElementsAssignment_3 ) ) ( ( rule__Game__TerritoireElementsAssignment_3 )* ) )
            // InternalGame.g:720:2: ( ( rule__Game__TerritoireElementsAssignment_3 ) ) ( ( rule__Game__TerritoireElementsAssignment_3 )* )
            {
            // InternalGame.g:720:2: ( ( rule__Game__TerritoireElementsAssignment_3 ) )
            // InternalGame.g:721:3: ( rule__Game__TerritoireElementsAssignment_3 )
            {
             before(grammarAccess.getGameAccess().getTerritoireElementsAssignment_3()); 
            // InternalGame.g:722:3: ( rule__Game__TerritoireElementsAssignment_3 )
            // InternalGame.g:722:4: rule__Game__TerritoireElementsAssignment_3
            {
            pushFollow(FOLLOW_7);
            rule__Game__TerritoireElementsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getGameAccess().getTerritoireElementsAssignment_3()); 

            }

            // InternalGame.g:725:2: ( ( rule__Game__TerritoireElementsAssignment_3 )* )
            // InternalGame.g:726:3: ( rule__Game__TerritoireElementsAssignment_3 )*
            {
             before(grammarAccess.getGameAccess().getTerritoireElementsAssignment_3()); 
            // InternalGame.g:727:3: ( rule__Game__TerritoireElementsAssignment_3 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>=13 && LA3_0<=15)||(LA3_0>=19 && LA3_0<=20)||LA3_0==25||(LA3_0>=41 && LA3_0<=42)||LA3_0==44) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalGame.g:727:4: rule__Game__TerritoireElementsAssignment_3
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Game__TerritoireElementsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getGameAccess().getTerritoireElementsAssignment_3()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Game__Group__3__Impl"


    // $ANTLR start "rule__Game__Group__4"
    // InternalGame.g:736:1: rule__Game__Group__4 : rule__Game__Group__4__Impl ;
    public final void rule__Game__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:740:1: ( rule__Game__Group__4__Impl )
            // InternalGame.g:741:2: rule__Game__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Game__Group__4__Impl();

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
    // $ANTLR end "rule__Game__Group__4"


    // $ANTLR start "rule__Game__Group__4__Impl"
    // InternalGame.g:747:1: rule__Game__Group__4__Impl : ( '}' ) ;
    public final void rule__Game__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:751:1: ( ( '}' ) )
            // InternalGame.g:752:1: ( '}' )
            {
            // InternalGame.g:752:1: ( '}' )
            // InternalGame.g:753:2: '}'
            {
             before(grammarAccess.getGameAccess().getRightCurlyBracketKeyword_4()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getGameAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Game__Group__4__Impl"


    // $ANTLR start "rule__Explorateur__Group__0"
    // InternalGame.g:763:1: rule__Explorateur__Group__0 : rule__Explorateur__Group__0__Impl rule__Explorateur__Group__1 ;
    public final void rule__Explorateur__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:767:1: ( rule__Explorateur__Group__0__Impl rule__Explorateur__Group__1 )
            // InternalGame.g:768:2: rule__Explorateur__Group__0__Impl rule__Explorateur__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Explorateur__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Explorateur__Group__1();

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
    // $ANTLR end "rule__Explorateur__Group__0"


    // $ANTLR start "rule__Explorateur__Group__0__Impl"
    // InternalGame.g:775:1: rule__Explorateur__Group__0__Impl : ( 'explorateur' ) ;
    public final void rule__Explorateur__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:779:1: ( ( 'explorateur' ) )
            // InternalGame.g:780:1: ( 'explorateur' )
            {
            // InternalGame.g:780:1: ( 'explorateur' )
            // InternalGame.g:781:2: 'explorateur'
            {
             before(grammarAccess.getExplorateurAccess().getExplorateurKeyword_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getExplorateurAccess().getExplorateurKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Explorateur__Group__0__Impl"


    // $ANTLR start "rule__Explorateur__Group__1"
    // InternalGame.g:790:1: rule__Explorateur__Group__1 : rule__Explorateur__Group__1__Impl rule__Explorateur__Group__2 ;
    public final void rule__Explorateur__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:794:1: ( rule__Explorateur__Group__1__Impl rule__Explorateur__Group__2 )
            // InternalGame.g:795:2: rule__Explorateur__Group__1__Impl rule__Explorateur__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Explorateur__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Explorateur__Group__2();

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
    // $ANTLR end "rule__Explorateur__Group__1"


    // $ANTLR start "rule__Explorateur__Group__1__Impl"
    // InternalGame.g:802:1: rule__Explorateur__Group__1__Impl : ( ( rule__Explorateur__NameAssignment_1 ) ) ;
    public final void rule__Explorateur__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:806:1: ( ( ( rule__Explorateur__NameAssignment_1 ) ) )
            // InternalGame.g:807:1: ( ( rule__Explorateur__NameAssignment_1 ) )
            {
            // InternalGame.g:807:1: ( ( rule__Explorateur__NameAssignment_1 ) )
            // InternalGame.g:808:2: ( rule__Explorateur__NameAssignment_1 )
            {
             before(grammarAccess.getExplorateurAccess().getNameAssignment_1()); 
            // InternalGame.g:809:2: ( rule__Explorateur__NameAssignment_1 )
            // InternalGame.g:809:3: rule__Explorateur__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Explorateur__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getExplorateurAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Explorateur__Group__1__Impl"


    // $ANTLR start "rule__Explorateur__Group__2"
    // InternalGame.g:817:1: rule__Explorateur__Group__2 : rule__Explorateur__Group__2__Impl rule__Explorateur__Group__3 ;
    public final void rule__Explorateur__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:821:1: ( rule__Explorateur__Group__2__Impl rule__Explorateur__Group__3 )
            // InternalGame.g:822:2: rule__Explorateur__Group__2__Impl rule__Explorateur__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__Explorateur__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Explorateur__Group__3();

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
    // $ANTLR end "rule__Explorateur__Group__2"


    // $ANTLR start "rule__Explorateur__Group__2__Impl"
    // InternalGame.g:829:1: rule__Explorateur__Group__2__Impl : ( '{' ) ;
    public final void rule__Explorateur__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:833:1: ( ( '{' ) )
            // InternalGame.g:834:1: ( '{' )
            {
            // InternalGame.g:834:1: ( '{' )
            // InternalGame.g:835:2: '{'
            {
             before(grammarAccess.getExplorateurAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getExplorateurAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Explorateur__Group__2__Impl"


    // $ANTLR start "rule__Explorateur__Group__3"
    // InternalGame.g:844:1: rule__Explorateur__Group__3 : rule__Explorateur__Group__3__Impl rule__Explorateur__Group__4 ;
    public final void rule__Explorateur__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:848:1: ( rule__Explorateur__Group__3__Impl rule__Explorateur__Group__4 )
            // InternalGame.g:849:2: rule__Explorateur__Group__3__Impl rule__Explorateur__Group__4
            {
            pushFollow(FOLLOW_9);
            rule__Explorateur__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Explorateur__Group__4();

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
    // $ANTLR end "rule__Explorateur__Group__3"


    // $ANTLR start "rule__Explorateur__Group__3__Impl"
    // InternalGame.g:856:1: rule__Explorateur__Group__3__Impl : ( ( rule__Explorateur__SacAssignment_3 ) ) ;
    public final void rule__Explorateur__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:860:1: ( ( ( rule__Explorateur__SacAssignment_3 ) ) )
            // InternalGame.g:861:1: ( ( rule__Explorateur__SacAssignment_3 ) )
            {
            // InternalGame.g:861:1: ( ( rule__Explorateur__SacAssignment_3 ) )
            // InternalGame.g:862:2: ( rule__Explorateur__SacAssignment_3 )
            {
             before(grammarAccess.getExplorateurAccess().getSacAssignment_3()); 
            // InternalGame.g:863:2: ( rule__Explorateur__SacAssignment_3 )
            // InternalGame.g:863:3: rule__Explorateur__SacAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Explorateur__SacAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getExplorateurAccess().getSacAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Explorateur__Group__3__Impl"


    // $ANTLR start "rule__Explorateur__Group__4"
    // InternalGame.g:871:1: rule__Explorateur__Group__4 : rule__Explorateur__Group__4__Impl rule__Explorateur__Group__5 ;
    public final void rule__Explorateur__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:875:1: ( rule__Explorateur__Group__4__Impl rule__Explorateur__Group__5 )
            // InternalGame.g:876:2: rule__Explorateur__Group__4__Impl rule__Explorateur__Group__5
            {
            pushFollow(FOLLOW_10);
            rule__Explorateur__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Explorateur__Group__5();

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
    // $ANTLR end "rule__Explorateur__Group__4"


    // $ANTLR start "rule__Explorateur__Group__4__Impl"
    // InternalGame.g:883:1: rule__Explorateur__Group__4__Impl : ( 'connaissances' ) ;
    public final void rule__Explorateur__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:887:1: ( ( 'connaissances' ) )
            // InternalGame.g:888:1: ( 'connaissances' )
            {
            // InternalGame.g:888:1: ( 'connaissances' )
            // InternalGame.g:889:2: 'connaissances'
            {
             before(grammarAccess.getExplorateurAccess().getConnaissancesKeyword_4()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getExplorateurAccess().getConnaissancesKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Explorateur__Group__4__Impl"


    // $ANTLR start "rule__Explorateur__Group__5"
    // InternalGame.g:898:1: rule__Explorateur__Group__5 : rule__Explorateur__Group__5__Impl rule__Explorateur__Group__6 ;
    public final void rule__Explorateur__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:902:1: ( rule__Explorateur__Group__5__Impl rule__Explorateur__Group__6 )
            // InternalGame.g:903:2: rule__Explorateur__Group__5__Impl rule__Explorateur__Group__6
            {
            pushFollow(FOLLOW_10);
            rule__Explorateur__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Explorateur__Group__6();

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
    // $ANTLR end "rule__Explorateur__Group__5"


    // $ANTLR start "rule__Explorateur__Group__5__Impl"
    // InternalGame.g:910:1: rule__Explorateur__Group__5__Impl : ( ( rule__Explorateur__ConnaissancesAssignment_5 )* ) ;
    public final void rule__Explorateur__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:914:1: ( ( ( rule__Explorateur__ConnaissancesAssignment_5 )* ) )
            // InternalGame.g:915:1: ( ( rule__Explorateur__ConnaissancesAssignment_5 )* )
            {
            // InternalGame.g:915:1: ( ( rule__Explorateur__ConnaissancesAssignment_5 )* )
            // InternalGame.g:916:2: ( rule__Explorateur__ConnaissancesAssignment_5 )*
            {
             before(grammarAccess.getExplorateurAccess().getConnaissancesAssignment_5()); 
            // InternalGame.g:917:2: ( rule__Explorateur__ConnaissancesAssignment_5 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_ID) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalGame.g:917:3: rule__Explorateur__ConnaissancesAssignment_5
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Explorateur__ConnaissancesAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getExplorateurAccess().getConnaissancesAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Explorateur__Group__5__Impl"


    // $ANTLR start "rule__Explorateur__Group__6"
    // InternalGame.g:925:1: rule__Explorateur__Group__6 : rule__Explorateur__Group__6__Impl rule__Explorateur__Group__7 ;
    public final void rule__Explorateur__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:929:1: ( rule__Explorateur__Group__6__Impl rule__Explorateur__Group__7 )
            // InternalGame.g:930:2: rule__Explorateur__Group__6__Impl rule__Explorateur__Group__7
            {
            pushFollow(FOLLOW_3);
            rule__Explorateur__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Explorateur__Group__7();

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
    // $ANTLR end "rule__Explorateur__Group__6"


    // $ANTLR start "rule__Explorateur__Group__6__Impl"
    // InternalGame.g:937:1: rule__Explorateur__Group__6__Impl : ( 'position' ) ;
    public final void rule__Explorateur__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:941:1: ( ( 'position' ) )
            // InternalGame.g:942:1: ( 'position' )
            {
            // InternalGame.g:942:1: ( 'position' )
            // InternalGame.g:943:2: 'position'
            {
             before(grammarAccess.getExplorateurAccess().getPositionKeyword_6()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getExplorateurAccess().getPositionKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Explorateur__Group__6__Impl"


    // $ANTLR start "rule__Explorateur__Group__7"
    // InternalGame.g:952:1: rule__Explorateur__Group__7 : rule__Explorateur__Group__7__Impl rule__Explorateur__Group__8 ;
    public final void rule__Explorateur__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:956:1: ( rule__Explorateur__Group__7__Impl rule__Explorateur__Group__8 )
            // InternalGame.g:957:2: rule__Explorateur__Group__7__Impl rule__Explorateur__Group__8
            {
            pushFollow(FOLLOW_6);
            rule__Explorateur__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Explorateur__Group__8();

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
    // $ANTLR end "rule__Explorateur__Group__7"


    // $ANTLR start "rule__Explorateur__Group__7__Impl"
    // InternalGame.g:964:1: rule__Explorateur__Group__7__Impl : ( ( rule__Explorateur__PositionAssignment_7 ) ) ;
    public final void rule__Explorateur__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:968:1: ( ( ( rule__Explorateur__PositionAssignment_7 ) ) )
            // InternalGame.g:969:1: ( ( rule__Explorateur__PositionAssignment_7 ) )
            {
            // InternalGame.g:969:1: ( ( rule__Explorateur__PositionAssignment_7 ) )
            // InternalGame.g:970:2: ( rule__Explorateur__PositionAssignment_7 )
            {
             before(grammarAccess.getExplorateurAccess().getPositionAssignment_7()); 
            // InternalGame.g:971:2: ( rule__Explorateur__PositionAssignment_7 )
            // InternalGame.g:971:3: rule__Explorateur__PositionAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__Explorateur__PositionAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getExplorateurAccess().getPositionAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Explorateur__Group__7__Impl"


    // $ANTLR start "rule__Explorateur__Group__8"
    // InternalGame.g:979:1: rule__Explorateur__Group__8 : rule__Explorateur__Group__8__Impl ;
    public final void rule__Explorateur__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:983:1: ( rule__Explorateur__Group__8__Impl )
            // InternalGame.g:984:2: rule__Explorateur__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Explorateur__Group__8__Impl();

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
    // $ANTLR end "rule__Explorateur__Group__8"


    // $ANTLR start "rule__Explorateur__Group__8__Impl"
    // InternalGame.g:990:1: rule__Explorateur__Group__8__Impl : ( '}' ) ;
    public final void rule__Explorateur__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:994:1: ( ( '}' ) )
            // InternalGame.g:995:1: ( '}' )
            {
            // InternalGame.g:995:1: ( '}' )
            // InternalGame.g:996:2: '}'
            {
             before(grammarAccess.getExplorateurAccess().getRightCurlyBracketKeyword_8()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getExplorateurAccess().getRightCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Explorateur__Group__8__Impl"


    // $ANTLR start "rule__Sac__Group__0"
    // InternalGame.g:1006:1: rule__Sac__Group__0 : rule__Sac__Group__0__Impl rule__Sac__Group__1 ;
    public final void rule__Sac__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1010:1: ( rule__Sac__Group__0__Impl rule__Sac__Group__1 )
            // InternalGame.g:1011:2: rule__Sac__Group__0__Impl rule__Sac__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__Sac__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sac__Group__1();

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
    // $ANTLR end "rule__Sac__Group__0"


    // $ANTLR start "rule__Sac__Group__0__Impl"
    // InternalGame.g:1018:1: rule__Sac__Group__0__Impl : ( 'sac' ) ;
    public final void rule__Sac__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1022:1: ( ( 'sac' ) )
            // InternalGame.g:1023:1: ( 'sac' )
            {
            // InternalGame.g:1023:1: ( 'sac' )
            // InternalGame.g:1024:2: 'sac'
            {
             before(grammarAccess.getSacAccess().getSacKeyword_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getSacAccess().getSacKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sac__Group__0__Impl"


    // $ANTLR start "rule__Sac__Group__1"
    // InternalGame.g:1033:1: rule__Sac__Group__1 : rule__Sac__Group__1__Impl rule__Sac__Group__2 ;
    public final void rule__Sac__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1037:1: ( rule__Sac__Group__1__Impl rule__Sac__Group__2 )
            // InternalGame.g:1038:2: rule__Sac__Group__1__Impl rule__Sac__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Sac__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sac__Group__2();

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
    // $ANTLR end "rule__Sac__Group__1"


    // $ANTLR start "rule__Sac__Group__1__Impl"
    // InternalGame.g:1045:1: rule__Sac__Group__1__Impl : ( ( rule__Sac__TailleAssignment_1 ) ) ;
    public final void rule__Sac__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1049:1: ( ( ( rule__Sac__TailleAssignment_1 ) ) )
            // InternalGame.g:1050:1: ( ( rule__Sac__TailleAssignment_1 ) )
            {
            // InternalGame.g:1050:1: ( ( rule__Sac__TailleAssignment_1 ) )
            // InternalGame.g:1051:2: ( rule__Sac__TailleAssignment_1 )
            {
             before(grammarAccess.getSacAccess().getTailleAssignment_1()); 
            // InternalGame.g:1052:2: ( rule__Sac__TailleAssignment_1 )
            // InternalGame.g:1052:3: rule__Sac__TailleAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Sac__TailleAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSacAccess().getTailleAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sac__Group__1__Impl"


    // $ANTLR start "rule__Sac__Group__2"
    // InternalGame.g:1060:1: rule__Sac__Group__2 : rule__Sac__Group__2__Impl rule__Sac__Group__3 ;
    public final void rule__Sac__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1064:1: ( rule__Sac__Group__2__Impl rule__Sac__Group__3 )
            // InternalGame.g:1065:2: rule__Sac__Group__2__Impl rule__Sac__Group__3
            {
            pushFollow(FOLLOW_13);
            rule__Sac__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sac__Group__3();

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
    // $ANTLR end "rule__Sac__Group__2"


    // $ANTLR start "rule__Sac__Group__2__Impl"
    // InternalGame.g:1072:1: rule__Sac__Group__2__Impl : ( '{' ) ;
    public final void rule__Sac__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1076:1: ( ( '{' ) )
            // InternalGame.g:1077:1: ( '{' )
            {
            // InternalGame.g:1077:1: ( '{' )
            // InternalGame.g:1078:2: '{'
            {
             before(grammarAccess.getSacAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getSacAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sac__Group__2__Impl"


    // $ANTLR start "rule__Sac__Group__3"
    // InternalGame.g:1087:1: rule__Sac__Group__3 : rule__Sac__Group__3__Impl rule__Sac__Group__4 ;
    public final void rule__Sac__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1091:1: ( rule__Sac__Group__3__Impl rule__Sac__Group__4 )
            // InternalGame.g:1092:2: rule__Sac__Group__3__Impl rule__Sac__Group__4
            {
            pushFollow(FOLLOW_13);
            rule__Sac__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sac__Group__4();

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
    // $ANTLR end "rule__Sac__Group__3"


    // $ANTLR start "rule__Sac__Group__3__Impl"
    // InternalGame.g:1099:1: rule__Sac__Group__3__Impl : ( ( rule__Sac__SacElementsAssignment_3 )* ) ;
    public final void rule__Sac__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1103:1: ( ( ( rule__Sac__SacElementsAssignment_3 )* ) )
            // InternalGame.g:1104:1: ( ( rule__Sac__SacElementsAssignment_3 )* )
            {
            // InternalGame.g:1104:1: ( ( rule__Sac__SacElementsAssignment_3 )* )
            // InternalGame.g:1105:2: ( rule__Sac__SacElementsAssignment_3 )*
            {
             before(grammarAccess.getSacAccess().getSacElementsAssignment_3()); 
            // InternalGame.g:1106:2: ( rule__Sac__SacElementsAssignment_3 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_ID) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalGame.g:1106:3: rule__Sac__SacElementsAssignment_3
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Sac__SacElementsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getSacAccess().getSacElementsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sac__Group__3__Impl"


    // $ANTLR start "rule__Sac__Group__4"
    // InternalGame.g:1114:1: rule__Sac__Group__4 : rule__Sac__Group__4__Impl ;
    public final void rule__Sac__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1118:1: ( rule__Sac__Group__4__Impl )
            // InternalGame.g:1119:2: rule__Sac__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Sac__Group__4__Impl();

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
    // $ANTLR end "rule__Sac__Group__4"


    // $ANTLR start "rule__Sac__Group__4__Impl"
    // InternalGame.g:1125:1: rule__Sac__Group__4__Impl : ( '}' ) ;
    public final void rule__Sac__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1129:1: ( ( '}' ) )
            // InternalGame.g:1130:1: ( '}' )
            {
            // InternalGame.g:1130:1: ( '}' )
            // InternalGame.g:1131:2: '}'
            {
             before(grammarAccess.getSacAccess().getRightCurlyBracketKeyword_4()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getSacAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sac__Group__4__Impl"


    // $ANTLR start "rule__Lieu__Group__0"
    // InternalGame.g:1141:1: rule__Lieu__Group__0 : rule__Lieu__Group__0__Impl rule__Lieu__Group__1 ;
    public final void rule__Lieu__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1145:1: ( rule__Lieu__Group__0__Impl rule__Lieu__Group__1 )
            // InternalGame.g:1146:2: rule__Lieu__Group__0__Impl rule__Lieu__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Lieu__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Lieu__Group__1();

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
    // $ANTLR end "rule__Lieu__Group__0"


    // $ANTLR start "rule__Lieu__Group__0__Impl"
    // InternalGame.g:1153:1: rule__Lieu__Group__0__Impl : ( ( rule__Lieu__TypeAssignment_0 ) ) ;
    public final void rule__Lieu__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1157:1: ( ( ( rule__Lieu__TypeAssignment_0 ) ) )
            // InternalGame.g:1158:1: ( ( rule__Lieu__TypeAssignment_0 ) )
            {
            // InternalGame.g:1158:1: ( ( rule__Lieu__TypeAssignment_0 ) )
            // InternalGame.g:1159:2: ( rule__Lieu__TypeAssignment_0 )
            {
             before(grammarAccess.getLieuAccess().getTypeAssignment_0()); 
            // InternalGame.g:1160:2: ( rule__Lieu__TypeAssignment_0 )
            // InternalGame.g:1160:3: rule__Lieu__TypeAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Lieu__TypeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getLieuAccess().getTypeAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lieu__Group__0__Impl"


    // $ANTLR start "rule__Lieu__Group__1"
    // InternalGame.g:1168:1: rule__Lieu__Group__1 : rule__Lieu__Group__1__Impl rule__Lieu__Group__2 ;
    public final void rule__Lieu__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1172:1: ( rule__Lieu__Group__1__Impl rule__Lieu__Group__2 )
            // InternalGame.g:1173:2: rule__Lieu__Group__1__Impl rule__Lieu__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Lieu__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Lieu__Group__2();

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
    // $ANTLR end "rule__Lieu__Group__1"


    // $ANTLR start "rule__Lieu__Group__1__Impl"
    // InternalGame.g:1180:1: rule__Lieu__Group__1__Impl : ( ( rule__Lieu__NameAssignment_1 ) ) ;
    public final void rule__Lieu__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1184:1: ( ( ( rule__Lieu__NameAssignment_1 ) ) )
            // InternalGame.g:1185:1: ( ( rule__Lieu__NameAssignment_1 ) )
            {
            // InternalGame.g:1185:1: ( ( rule__Lieu__NameAssignment_1 ) )
            // InternalGame.g:1186:2: ( rule__Lieu__NameAssignment_1 )
            {
             before(grammarAccess.getLieuAccess().getNameAssignment_1()); 
            // InternalGame.g:1187:2: ( rule__Lieu__NameAssignment_1 )
            // InternalGame.g:1187:3: rule__Lieu__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Lieu__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getLieuAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lieu__Group__1__Impl"


    // $ANTLR start "rule__Lieu__Group__2"
    // InternalGame.g:1195:1: rule__Lieu__Group__2 : rule__Lieu__Group__2__Impl rule__Lieu__Group__3 ;
    public final void rule__Lieu__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1199:1: ( rule__Lieu__Group__2__Impl rule__Lieu__Group__3 )
            // InternalGame.g:1200:2: rule__Lieu__Group__2__Impl rule__Lieu__Group__3
            {
            pushFollow(FOLLOW_14);
            rule__Lieu__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Lieu__Group__3();

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
    // $ANTLR end "rule__Lieu__Group__2"


    // $ANTLR start "rule__Lieu__Group__2__Impl"
    // InternalGame.g:1207:1: rule__Lieu__Group__2__Impl : ( '{' ) ;
    public final void rule__Lieu__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1211:1: ( ( '{' ) )
            // InternalGame.g:1212:1: ( '{' )
            {
            // InternalGame.g:1212:1: ( '{' )
            // InternalGame.g:1213:2: '{'
            {
             before(grammarAccess.getLieuAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getLieuAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lieu__Group__2__Impl"


    // $ANTLR start "rule__Lieu__Group__3"
    // InternalGame.g:1222:1: rule__Lieu__Group__3 : rule__Lieu__Group__3__Impl rule__Lieu__Group__4 ;
    public final void rule__Lieu__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1226:1: ( rule__Lieu__Group__3__Impl rule__Lieu__Group__4 )
            // InternalGame.g:1227:2: rule__Lieu__Group__3__Impl rule__Lieu__Group__4
            {
            pushFollow(FOLLOW_14);
            rule__Lieu__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Lieu__Group__4();

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
    // $ANTLR end "rule__Lieu__Group__3"


    // $ANTLR start "rule__Lieu__Group__3__Impl"
    // InternalGame.g:1234:1: rule__Lieu__Group__3__Impl : ( ( rule__Lieu__Group_3__0 )? ) ;
    public final void rule__Lieu__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1238:1: ( ( ( rule__Lieu__Group_3__0 )? ) )
            // InternalGame.g:1239:1: ( ( rule__Lieu__Group_3__0 )? )
            {
            // InternalGame.g:1239:1: ( ( rule__Lieu__Group_3__0 )? )
            // InternalGame.g:1240:2: ( rule__Lieu__Group_3__0 )?
            {
             before(grammarAccess.getLieuAccess().getGroup_3()); 
            // InternalGame.g:1241:2: ( rule__Lieu__Group_3__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==23) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalGame.g:1241:3: rule__Lieu__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Lieu__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLieuAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lieu__Group__3__Impl"


    // $ANTLR start "rule__Lieu__Group__4"
    // InternalGame.g:1249:1: rule__Lieu__Group__4 : rule__Lieu__Group__4__Impl rule__Lieu__Group__5 ;
    public final void rule__Lieu__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1253:1: ( rule__Lieu__Group__4__Impl rule__Lieu__Group__5 )
            // InternalGame.g:1254:2: rule__Lieu__Group__4__Impl rule__Lieu__Group__5
            {
            pushFollow(FOLLOW_14);
            rule__Lieu__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Lieu__Group__5();

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
    // $ANTLR end "rule__Lieu__Group__4"


    // $ANTLR start "rule__Lieu__Group__4__Impl"
    // InternalGame.g:1261:1: rule__Lieu__Group__4__Impl : ( ( rule__Lieu__PersonnesAssignment_4 )* ) ;
    public final void rule__Lieu__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1265:1: ( ( ( rule__Lieu__PersonnesAssignment_4 )* ) )
            // InternalGame.g:1266:1: ( ( rule__Lieu__PersonnesAssignment_4 )* )
            {
            // InternalGame.g:1266:1: ( ( rule__Lieu__PersonnesAssignment_4 )* )
            // InternalGame.g:1267:2: ( rule__Lieu__PersonnesAssignment_4 )*
            {
             before(grammarAccess.getLieuAccess().getPersonnesAssignment_4()); 
            // InternalGame.g:1268:2: ( rule__Lieu__PersonnesAssignment_4 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalGame.g:1268:3: rule__Lieu__PersonnesAssignment_4
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Lieu__PersonnesAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getLieuAccess().getPersonnesAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lieu__Group__4__Impl"


    // $ANTLR start "rule__Lieu__Group__5"
    // InternalGame.g:1276:1: rule__Lieu__Group__5 : rule__Lieu__Group__5__Impl rule__Lieu__Group__6 ;
    public final void rule__Lieu__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1280:1: ( rule__Lieu__Group__5__Impl rule__Lieu__Group__6 )
            // InternalGame.g:1281:2: rule__Lieu__Group__5__Impl rule__Lieu__Group__6
            {
            pushFollow(FOLLOW_14);
            rule__Lieu__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Lieu__Group__6();

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
    // $ANTLR end "rule__Lieu__Group__5"


    // $ANTLR start "rule__Lieu__Group__5__Impl"
    // InternalGame.g:1288:1: rule__Lieu__Group__5__Impl : ( ( rule__Lieu__ConnaissancesAssignment_5 )* ) ;
    public final void rule__Lieu__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1292:1: ( ( ( rule__Lieu__ConnaissancesAssignment_5 )* ) )
            // InternalGame.g:1293:1: ( ( rule__Lieu__ConnaissancesAssignment_5 )* )
            {
            // InternalGame.g:1293:1: ( ( rule__Lieu__ConnaissancesAssignment_5 )* )
            // InternalGame.g:1294:2: ( rule__Lieu__ConnaissancesAssignment_5 )*
            {
             before(grammarAccess.getLieuAccess().getConnaissancesAssignment_5()); 
            // InternalGame.g:1295:2: ( rule__Lieu__ConnaissancesAssignment_5 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ID) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalGame.g:1295:3: rule__Lieu__ConnaissancesAssignment_5
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Lieu__ConnaissancesAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getLieuAccess().getConnaissancesAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lieu__Group__5__Impl"


    // $ANTLR start "rule__Lieu__Group__6"
    // InternalGame.g:1303:1: rule__Lieu__Group__6 : rule__Lieu__Group__6__Impl rule__Lieu__Group__7 ;
    public final void rule__Lieu__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1307:1: ( rule__Lieu__Group__6__Impl rule__Lieu__Group__7 )
            // InternalGame.g:1308:2: rule__Lieu__Group__6__Impl rule__Lieu__Group__7
            {
            pushFollow(FOLLOW_14);
            rule__Lieu__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Lieu__Group__7();

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
    // $ANTLR end "rule__Lieu__Group__6"


    // $ANTLR start "rule__Lieu__Group__6__Impl"
    // InternalGame.g:1315:1: rule__Lieu__Group__6__Impl : ( ( rule__Lieu__ObjetsAssignment_6 )* ) ;
    public final void rule__Lieu__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1319:1: ( ( ( rule__Lieu__ObjetsAssignment_6 )* ) )
            // InternalGame.g:1320:1: ( ( rule__Lieu__ObjetsAssignment_6 )* )
            {
            // InternalGame.g:1320:1: ( ( rule__Lieu__ObjetsAssignment_6 )* )
            // InternalGame.g:1321:2: ( rule__Lieu__ObjetsAssignment_6 )*
            {
             before(grammarAccess.getLieuAccess().getObjetsAssignment_6()); 
            // InternalGame.g:1322:2: ( rule__Lieu__ObjetsAssignment_6 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_ID) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalGame.g:1322:3: rule__Lieu__ObjetsAssignment_6
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Lieu__ObjetsAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getLieuAccess().getObjetsAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lieu__Group__6__Impl"


    // $ANTLR start "rule__Lieu__Group__7"
    // InternalGame.g:1330:1: rule__Lieu__Group__7 : rule__Lieu__Group__7__Impl rule__Lieu__Group__8 ;
    public final void rule__Lieu__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1334:1: ( rule__Lieu__Group__7__Impl rule__Lieu__Group__8 )
            // InternalGame.g:1335:2: rule__Lieu__Group__7__Impl rule__Lieu__Group__8
            {
            pushFollow(FOLLOW_14);
            rule__Lieu__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Lieu__Group__8();

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
    // $ANTLR end "rule__Lieu__Group__7"


    // $ANTLR start "rule__Lieu__Group__7__Impl"
    // InternalGame.g:1342:1: rule__Lieu__Group__7__Impl : ( ( rule__Lieu__Group_7__0 )? ) ;
    public final void rule__Lieu__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1346:1: ( ( ( rule__Lieu__Group_7__0 )? ) )
            // InternalGame.g:1347:1: ( ( rule__Lieu__Group_7__0 )? )
            {
            // InternalGame.g:1347:1: ( ( rule__Lieu__Group_7__0 )? )
            // InternalGame.g:1348:2: ( rule__Lieu__Group_7__0 )?
            {
             before(grammarAccess.getLieuAccess().getGroup_7()); 
            // InternalGame.g:1349:2: ( rule__Lieu__Group_7__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==24) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalGame.g:1349:3: rule__Lieu__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Lieu__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLieuAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lieu__Group__7__Impl"


    // $ANTLR start "rule__Lieu__Group__8"
    // InternalGame.g:1357:1: rule__Lieu__Group__8 : rule__Lieu__Group__8__Impl rule__Lieu__Group__9 ;
    public final void rule__Lieu__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1361:1: ( rule__Lieu__Group__8__Impl rule__Lieu__Group__9 )
            // InternalGame.g:1362:2: rule__Lieu__Group__8__Impl rule__Lieu__Group__9
            {
            pushFollow(FOLLOW_14);
            rule__Lieu__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Lieu__Group__9();

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
    // $ANTLR end "rule__Lieu__Group__8"


    // $ANTLR start "rule__Lieu__Group__8__Impl"
    // InternalGame.g:1369:1: rule__Lieu__Group__8__Impl : ( ( rule__Lieu__ListeCheminsAssignment_8 )* ) ;
    public final void rule__Lieu__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1373:1: ( ( ( rule__Lieu__ListeCheminsAssignment_8 )* ) )
            // InternalGame.g:1374:1: ( ( rule__Lieu__ListeCheminsAssignment_8 )* )
            {
            // InternalGame.g:1374:1: ( ( rule__Lieu__ListeCheminsAssignment_8 )* )
            // InternalGame.g:1375:2: ( rule__Lieu__ListeCheminsAssignment_8 )*
            {
             before(grammarAccess.getLieuAccess().getListeCheminsAssignment_8()); 
            // InternalGame.g:1376:2: ( rule__Lieu__ListeCheminsAssignment_8 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_ID) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalGame.g:1376:3: rule__Lieu__ListeCheminsAssignment_8
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Lieu__ListeCheminsAssignment_8();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getLieuAccess().getListeCheminsAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lieu__Group__8__Impl"


    // $ANTLR start "rule__Lieu__Group__9"
    // InternalGame.g:1384:1: rule__Lieu__Group__9 : rule__Lieu__Group__9__Impl ;
    public final void rule__Lieu__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1388:1: ( rule__Lieu__Group__9__Impl )
            // InternalGame.g:1389:2: rule__Lieu__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Lieu__Group__9__Impl();

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
    // $ANTLR end "rule__Lieu__Group__9"


    // $ANTLR start "rule__Lieu__Group__9__Impl"
    // InternalGame.g:1395:1: rule__Lieu__Group__9__Impl : ( '}' ) ;
    public final void rule__Lieu__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1399:1: ( ( '}' ) )
            // InternalGame.g:1400:1: ( '}' )
            {
            // InternalGame.g:1400:1: ( '}' )
            // InternalGame.g:1401:2: '}'
            {
             before(grammarAccess.getLieuAccess().getRightCurlyBracketKeyword_9()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getLieuAccess().getRightCurlyBracketKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lieu__Group__9__Impl"


    // $ANTLR start "rule__Lieu__Group_3__0"
    // InternalGame.g:1411:1: rule__Lieu__Group_3__0 : rule__Lieu__Group_3__0__Impl rule__Lieu__Group_3__1 ;
    public final void rule__Lieu__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1415:1: ( rule__Lieu__Group_3__0__Impl rule__Lieu__Group_3__1 )
            // InternalGame.g:1416:2: rule__Lieu__Group_3__0__Impl rule__Lieu__Group_3__1
            {
            pushFollow(FOLLOW_15);
            rule__Lieu__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Lieu__Group_3__1();

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
    // $ANTLR end "rule__Lieu__Group_3__0"


    // $ANTLR start "rule__Lieu__Group_3__0__Impl"
    // InternalGame.g:1423:1: rule__Lieu__Group_3__0__Impl : ( 'description' ) ;
    public final void rule__Lieu__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1427:1: ( ( 'description' ) )
            // InternalGame.g:1428:1: ( 'description' )
            {
            // InternalGame.g:1428:1: ( 'description' )
            // InternalGame.g:1429:2: 'description'
            {
             before(grammarAccess.getLieuAccess().getDescriptionKeyword_3_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getLieuAccess().getDescriptionKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lieu__Group_3__0__Impl"


    // $ANTLR start "rule__Lieu__Group_3__1"
    // InternalGame.g:1438:1: rule__Lieu__Group_3__1 : rule__Lieu__Group_3__1__Impl rule__Lieu__Group_3__2 ;
    public final void rule__Lieu__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1442:1: ( rule__Lieu__Group_3__1__Impl rule__Lieu__Group_3__2 )
            // InternalGame.g:1443:2: rule__Lieu__Group_3__1__Impl rule__Lieu__Group_3__2
            {
            pushFollow(FOLLOW_16);
            rule__Lieu__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Lieu__Group_3__2();

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
    // $ANTLR end "rule__Lieu__Group_3__1"


    // $ANTLR start "rule__Lieu__Group_3__1__Impl"
    // InternalGame.g:1450:1: rule__Lieu__Group_3__1__Impl : ( ( rule__Lieu__DescriptionAssignment_3_1 ) ) ;
    public final void rule__Lieu__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1454:1: ( ( ( rule__Lieu__DescriptionAssignment_3_1 ) ) )
            // InternalGame.g:1455:1: ( ( rule__Lieu__DescriptionAssignment_3_1 ) )
            {
            // InternalGame.g:1455:1: ( ( rule__Lieu__DescriptionAssignment_3_1 ) )
            // InternalGame.g:1456:2: ( rule__Lieu__DescriptionAssignment_3_1 )
            {
             before(grammarAccess.getLieuAccess().getDescriptionAssignment_3_1()); 
            // InternalGame.g:1457:2: ( rule__Lieu__DescriptionAssignment_3_1 )
            // InternalGame.g:1457:3: rule__Lieu__DescriptionAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Lieu__DescriptionAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getLieuAccess().getDescriptionAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lieu__Group_3__1__Impl"


    // $ANTLR start "rule__Lieu__Group_3__2"
    // InternalGame.g:1465:1: rule__Lieu__Group_3__2 : rule__Lieu__Group_3__2__Impl ;
    public final void rule__Lieu__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1469:1: ( rule__Lieu__Group_3__2__Impl )
            // InternalGame.g:1470:2: rule__Lieu__Group_3__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Lieu__Group_3__2__Impl();

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
    // $ANTLR end "rule__Lieu__Group_3__2"


    // $ANTLR start "rule__Lieu__Group_3__2__Impl"
    // InternalGame.g:1476:1: rule__Lieu__Group_3__2__Impl : ( ( rule__Lieu__ConditionDescriptionAssignment_3_2 )? ) ;
    public final void rule__Lieu__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1480:1: ( ( ( rule__Lieu__ConditionDescriptionAssignment_3_2 )? ) )
            // InternalGame.g:1481:1: ( ( rule__Lieu__ConditionDescriptionAssignment_3_2 )? )
            {
            // InternalGame.g:1481:1: ( ( rule__Lieu__ConditionDescriptionAssignment_3_2 )? )
            // InternalGame.g:1482:2: ( rule__Lieu__ConditionDescriptionAssignment_3_2 )?
            {
             before(grammarAccess.getLieuAccess().getConditionDescriptionAssignment_3_2()); 
            // InternalGame.g:1483:2: ( rule__Lieu__ConditionDescriptionAssignment_3_2 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==43) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalGame.g:1483:3: rule__Lieu__ConditionDescriptionAssignment_3_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Lieu__ConditionDescriptionAssignment_3_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLieuAccess().getConditionDescriptionAssignment_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lieu__Group_3__2__Impl"


    // $ANTLR start "rule__Lieu__Group_7__0"
    // InternalGame.g:1492:1: rule__Lieu__Group_7__0 : rule__Lieu__Group_7__0__Impl rule__Lieu__Group_7__1 ;
    public final void rule__Lieu__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1496:1: ( rule__Lieu__Group_7__0__Impl rule__Lieu__Group_7__1 )
            // InternalGame.g:1497:2: rule__Lieu__Group_7__0__Impl rule__Lieu__Group_7__1
            {
            pushFollow(FOLLOW_16);
            rule__Lieu__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Lieu__Group_7__1();

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
    // $ANTLR end "rule__Lieu__Group_7__0"


    // $ANTLR start "rule__Lieu__Group_7__0__Impl"
    // InternalGame.g:1504:1: rule__Lieu__Group_7__0__Impl : ( 'depotO' ) ;
    public final void rule__Lieu__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1508:1: ( ( 'depotO' ) )
            // InternalGame.g:1509:1: ( 'depotO' )
            {
            // InternalGame.g:1509:1: ( 'depotO' )
            // InternalGame.g:1510:2: 'depotO'
            {
             before(grammarAccess.getLieuAccess().getDepotOKeyword_7_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getLieuAccess().getDepotOKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lieu__Group_7__0__Impl"


    // $ANTLR start "rule__Lieu__Group_7__1"
    // InternalGame.g:1519:1: rule__Lieu__Group_7__1 : rule__Lieu__Group_7__1__Impl ;
    public final void rule__Lieu__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1523:1: ( rule__Lieu__Group_7__1__Impl )
            // InternalGame.g:1524:2: rule__Lieu__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Lieu__Group_7__1__Impl();

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
    // $ANTLR end "rule__Lieu__Group_7__1"


    // $ANTLR start "rule__Lieu__Group_7__1__Impl"
    // InternalGame.g:1530:1: rule__Lieu__Group_7__1__Impl : ( ( rule__Lieu__DepotObjetAssignment_7_1 ) ) ;
    public final void rule__Lieu__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1534:1: ( ( ( rule__Lieu__DepotObjetAssignment_7_1 ) ) )
            // InternalGame.g:1535:1: ( ( rule__Lieu__DepotObjetAssignment_7_1 ) )
            {
            // InternalGame.g:1535:1: ( ( rule__Lieu__DepotObjetAssignment_7_1 ) )
            // InternalGame.g:1536:2: ( rule__Lieu__DepotObjetAssignment_7_1 )
            {
             before(grammarAccess.getLieuAccess().getDepotObjetAssignment_7_1()); 
            // InternalGame.g:1537:2: ( rule__Lieu__DepotObjetAssignment_7_1 )
            // InternalGame.g:1537:3: rule__Lieu__DepotObjetAssignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__Lieu__DepotObjetAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getLieuAccess().getDepotObjetAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lieu__Group_7__1__Impl"


    // $ANTLR start "rule__Personnes__Group__0"
    // InternalGame.g:1546:1: rule__Personnes__Group__0 : rule__Personnes__Group__0__Impl rule__Personnes__Group__1 ;
    public final void rule__Personnes__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1550:1: ( rule__Personnes__Group__0__Impl rule__Personnes__Group__1 )
            // InternalGame.g:1551:2: rule__Personnes__Group__0__Impl rule__Personnes__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Personnes__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Personnes__Group__1();

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
    // $ANTLR end "rule__Personnes__Group__0"


    // $ANTLR start "rule__Personnes__Group__0__Impl"
    // InternalGame.g:1558:1: rule__Personnes__Group__0__Impl : ( 'personnes' ) ;
    public final void rule__Personnes__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1562:1: ( ( 'personnes' ) )
            // InternalGame.g:1563:1: ( 'personnes' )
            {
            // InternalGame.g:1563:1: ( 'personnes' )
            // InternalGame.g:1564:2: 'personnes'
            {
             before(grammarAccess.getPersonnesAccess().getPersonnesKeyword_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getPersonnesAccess().getPersonnesKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Personnes__Group__0__Impl"


    // $ANTLR start "rule__Personnes__Group__1"
    // InternalGame.g:1573:1: rule__Personnes__Group__1 : rule__Personnes__Group__1__Impl rule__Personnes__Group__2 ;
    public final void rule__Personnes__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1577:1: ( rule__Personnes__Group__1__Impl rule__Personnes__Group__2 )
            // InternalGame.g:1578:2: rule__Personnes__Group__1__Impl rule__Personnes__Group__2
            {
            pushFollow(FOLLOW_17);
            rule__Personnes__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Personnes__Group__2();

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
    // $ANTLR end "rule__Personnes__Group__1"


    // $ANTLR start "rule__Personnes__Group__1__Impl"
    // InternalGame.g:1585:1: rule__Personnes__Group__1__Impl : ( '{' ) ;
    public final void rule__Personnes__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1589:1: ( ( '{' ) )
            // InternalGame.g:1590:1: ( '{' )
            {
            // InternalGame.g:1590:1: ( '{' )
            // InternalGame.g:1591:2: '{'
            {
             before(grammarAccess.getPersonnesAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getPersonnesAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Personnes__Group__1__Impl"


    // $ANTLR start "rule__Personnes__Group__2"
    // InternalGame.g:1600:1: rule__Personnes__Group__2 : rule__Personnes__Group__2__Impl rule__Personnes__Group__3 ;
    public final void rule__Personnes__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1604:1: ( rule__Personnes__Group__2__Impl rule__Personnes__Group__3 )
            // InternalGame.g:1605:2: rule__Personnes__Group__2__Impl rule__Personnes__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__Personnes__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Personnes__Group__3();

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
    // $ANTLR end "rule__Personnes__Group__2"


    // $ANTLR start "rule__Personnes__Group__2__Impl"
    // InternalGame.g:1612:1: rule__Personnes__Group__2__Impl : ( ( ( rule__Personnes__ListePersonnesAssignment_2 ) ) ( ( rule__Personnes__ListePersonnesAssignment_2 )* ) ) ;
    public final void rule__Personnes__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1616:1: ( ( ( ( rule__Personnes__ListePersonnesAssignment_2 ) ) ( ( rule__Personnes__ListePersonnesAssignment_2 )* ) ) )
            // InternalGame.g:1617:1: ( ( ( rule__Personnes__ListePersonnesAssignment_2 ) ) ( ( rule__Personnes__ListePersonnesAssignment_2 )* ) )
            {
            // InternalGame.g:1617:1: ( ( ( rule__Personnes__ListePersonnesAssignment_2 ) ) ( ( rule__Personnes__ListePersonnesAssignment_2 )* ) )
            // InternalGame.g:1618:2: ( ( rule__Personnes__ListePersonnesAssignment_2 ) ) ( ( rule__Personnes__ListePersonnesAssignment_2 )* )
            {
            // InternalGame.g:1618:2: ( ( rule__Personnes__ListePersonnesAssignment_2 ) )
            // InternalGame.g:1619:3: ( rule__Personnes__ListePersonnesAssignment_2 )
            {
             before(grammarAccess.getPersonnesAccess().getListePersonnesAssignment_2()); 
            // InternalGame.g:1620:3: ( rule__Personnes__ListePersonnesAssignment_2 )
            // InternalGame.g:1620:4: rule__Personnes__ListePersonnesAssignment_2
            {
            pushFollow(FOLLOW_18);
            rule__Personnes__ListePersonnesAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getPersonnesAccess().getListePersonnesAssignment_2()); 

            }

            // InternalGame.g:1623:2: ( ( rule__Personnes__ListePersonnesAssignment_2 )* )
            // InternalGame.g:1624:3: ( rule__Personnes__ListePersonnesAssignment_2 )*
            {
             before(grammarAccess.getPersonnesAccess().getListePersonnesAssignment_2()); 
            // InternalGame.g:1625:3: ( rule__Personnes__ListePersonnesAssignment_2 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==26) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalGame.g:1625:4: rule__Personnes__ListePersonnesAssignment_2
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__Personnes__ListePersonnesAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getPersonnesAccess().getListePersonnesAssignment_2()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Personnes__Group__2__Impl"


    // $ANTLR start "rule__Personnes__Group__3"
    // InternalGame.g:1634:1: rule__Personnes__Group__3 : rule__Personnes__Group__3__Impl ;
    public final void rule__Personnes__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1638:1: ( rule__Personnes__Group__3__Impl )
            // InternalGame.g:1639:2: rule__Personnes__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Personnes__Group__3__Impl();

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
    // $ANTLR end "rule__Personnes__Group__3"


    // $ANTLR start "rule__Personnes__Group__3__Impl"
    // InternalGame.g:1645:1: rule__Personnes__Group__3__Impl : ( '}' ) ;
    public final void rule__Personnes__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1649:1: ( ( '}' ) )
            // InternalGame.g:1650:1: ( '}' )
            {
            // InternalGame.g:1650:1: ( '}' )
            // InternalGame.g:1651:2: '}'
            {
             before(grammarAccess.getPersonnesAccess().getRightCurlyBracketKeyword_3()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getPersonnesAccess().getRightCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Personnes__Group__3__Impl"


    // $ANTLR start "rule__Personne__Group__0"
    // InternalGame.g:1661:1: rule__Personne__Group__0 : rule__Personne__Group__0__Impl rule__Personne__Group__1 ;
    public final void rule__Personne__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1665:1: ( rule__Personne__Group__0__Impl rule__Personne__Group__1 )
            // InternalGame.g:1666:2: rule__Personne__Group__0__Impl rule__Personne__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Personne__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Personne__Group__1();

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
    // $ANTLR end "rule__Personne__Group__0"


    // $ANTLR start "rule__Personne__Group__0__Impl"
    // InternalGame.g:1673:1: rule__Personne__Group__0__Impl : ( 'personne' ) ;
    public final void rule__Personne__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1677:1: ( ( 'personne' ) )
            // InternalGame.g:1678:1: ( 'personne' )
            {
            // InternalGame.g:1678:1: ( 'personne' )
            // InternalGame.g:1679:2: 'personne'
            {
             before(grammarAccess.getPersonneAccess().getPersonneKeyword_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getPersonneAccess().getPersonneKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Personne__Group__0__Impl"


    // $ANTLR start "rule__Personne__Group__1"
    // InternalGame.g:1688:1: rule__Personne__Group__1 : rule__Personne__Group__1__Impl rule__Personne__Group__2 ;
    public final void rule__Personne__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1692:1: ( rule__Personne__Group__1__Impl rule__Personne__Group__2 )
            // InternalGame.g:1693:2: rule__Personne__Group__1__Impl rule__Personne__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Personne__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Personne__Group__2();

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
    // $ANTLR end "rule__Personne__Group__1"


    // $ANTLR start "rule__Personne__Group__1__Impl"
    // InternalGame.g:1700:1: rule__Personne__Group__1__Impl : ( ( rule__Personne__NameAssignment_1 ) ) ;
    public final void rule__Personne__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1704:1: ( ( ( rule__Personne__NameAssignment_1 ) ) )
            // InternalGame.g:1705:1: ( ( rule__Personne__NameAssignment_1 ) )
            {
            // InternalGame.g:1705:1: ( ( rule__Personne__NameAssignment_1 ) )
            // InternalGame.g:1706:2: ( rule__Personne__NameAssignment_1 )
            {
             before(grammarAccess.getPersonneAccess().getNameAssignment_1()); 
            // InternalGame.g:1707:2: ( rule__Personne__NameAssignment_1 )
            // InternalGame.g:1707:3: rule__Personne__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Personne__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPersonneAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Personne__Group__1__Impl"


    // $ANTLR start "rule__Personne__Group__2"
    // InternalGame.g:1715:1: rule__Personne__Group__2 : rule__Personne__Group__2__Impl rule__Personne__Group__3 ;
    public final void rule__Personne__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1719:1: ( rule__Personne__Group__2__Impl rule__Personne__Group__3 )
            // InternalGame.g:1720:2: rule__Personne__Group__2__Impl rule__Personne__Group__3
            {
            pushFollow(FOLLOW_19);
            rule__Personne__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Personne__Group__3();

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
    // $ANTLR end "rule__Personne__Group__2"


    // $ANTLR start "rule__Personne__Group__2__Impl"
    // InternalGame.g:1727:1: rule__Personne__Group__2__Impl : ( '{' ) ;
    public final void rule__Personne__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1731:1: ( ( '{' ) )
            // InternalGame.g:1732:1: ( '{' )
            {
            // InternalGame.g:1732:1: ( '{' )
            // InternalGame.g:1733:2: '{'
            {
             before(grammarAccess.getPersonneAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getPersonneAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Personne__Group__2__Impl"


    // $ANTLR start "rule__Personne__Group__3"
    // InternalGame.g:1742:1: rule__Personne__Group__3 : rule__Personne__Group__3__Impl rule__Personne__Group__4 ;
    public final void rule__Personne__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1746:1: ( rule__Personne__Group__3__Impl rule__Personne__Group__4 )
            // InternalGame.g:1747:2: rule__Personne__Group__3__Impl rule__Personne__Group__4
            {
            pushFollow(FOLLOW_19);
            rule__Personne__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Personne__Group__4();

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
    // $ANTLR end "rule__Personne__Group__3"


    // $ANTLR start "rule__Personne__Group__3__Impl"
    // InternalGame.g:1754:1: rule__Personne__Group__3__Impl : ( ( rule__Personne__Group_3__0 )? ) ;
    public final void rule__Personne__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1758:1: ( ( ( rule__Personne__Group_3__0 )? ) )
            // InternalGame.g:1759:1: ( ( rule__Personne__Group_3__0 )? )
            {
            // InternalGame.g:1759:1: ( ( rule__Personne__Group_3__0 )? )
            // InternalGame.g:1760:2: ( rule__Personne__Group_3__0 )?
            {
             before(grammarAccess.getPersonneAccess().getGroup_3()); 
            // InternalGame.g:1761:2: ( rule__Personne__Group_3__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==27) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalGame.g:1761:3: rule__Personne__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Personne__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPersonneAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Personne__Group__3__Impl"


    // $ANTLR start "rule__Personne__Group__4"
    // InternalGame.g:1769:1: rule__Personne__Group__4 : rule__Personne__Group__4__Impl rule__Personne__Group__5 ;
    public final void rule__Personne__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1773:1: ( rule__Personne__Group__4__Impl rule__Personne__Group__5 )
            // InternalGame.g:1774:2: rule__Personne__Group__4__Impl rule__Personne__Group__5
            {
            pushFollow(FOLLOW_19);
            rule__Personne__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Personne__Group__5();

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
    // $ANTLR end "rule__Personne__Group__4"


    // $ANTLR start "rule__Personne__Group__4__Impl"
    // InternalGame.g:1781:1: rule__Personne__Group__4__Impl : ( ( rule__Personne__Group_4__0 )? ) ;
    public final void rule__Personne__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1785:1: ( ( ( rule__Personne__Group_4__0 )? ) )
            // InternalGame.g:1786:1: ( ( rule__Personne__Group_4__0 )? )
            {
            // InternalGame.g:1786:1: ( ( rule__Personne__Group_4__0 )? )
            // InternalGame.g:1787:2: ( rule__Personne__Group_4__0 )?
            {
             before(grammarAccess.getPersonneAccess().getGroup_4()); 
            // InternalGame.g:1788:2: ( rule__Personne__Group_4__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==28) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalGame.g:1788:3: rule__Personne__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Personne__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPersonneAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Personne__Group__4__Impl"


    // $ANTLR start "rule__Personne__Group__5"
    // InternalGame.g:1796:1: rule__Personne__Group__5 : rule__Personne__Group__5__Impl rule__Personne__Group__6 ;
    public final void rule__Personne__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1800:1: ( rule__Personne__Group__5__Impl rule__Personne__Group__6 )
            // InternalGame.g:1801:2: rule__Personne__Group__5__Impl rule__Personne__Group__6
            {
            pushFollow(FOLLOW_6);
            rule__Personne__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Personne__Group__6();

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
    // $ANTLR end "rule__Personne__Group__5"


    // $ANTLR start "rule__Personne__Group__5__Impl"
    // InternalGame.g:1808:1: rule__Personne__Group__5__Impl : ( ( rule__Personne__PersonneElementsAssignment_5 ) ) ;
    public final void rule__Personne__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1812:1: ( ( ( rule__Personne__PersonneElementsAssignment_5 ) ) )
            // InternalGame.g:1813:1: ( ( rule__Personne__PersonneElementsAssignment_5 ) )
            {
            // InternalGame.g:1813:1: ( ( rule__Personne__PersonneElementsAssignment_5 ) )
            // InternalGame.g:1814:2: ( rule__Personne__PersonneElementsAssignment_5 )
            {
             before(grammarAccess.getPersonneAccess().getPersonneElementsAssignment_5()); 
            // InternalGame.g:1815:2: ( rule__Personne__PersonneElementsAssignment_5 )
            // InternalGame.g:1815:3: rule__Personne__PersonneElementsAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Personne__PersonneElementsAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getPersonneAccess().getPersonneElementsAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Personne__Group__5__Impl"


    // $ANTLR start "rule__Personne__Group__6"
    // InternalGame.g:1823:1: rule__Personne__Group__6 : rule__Personne__Group__6__Impl ;
    public final void rule__Personne__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1827:1: ( rule__Personne__Group__6__Impl )
            // InternalGame.g:1828:2: rule__Personne__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Personne__Group__6__Impl();

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
    // $ANTLR end "rule__Personne__Group__6"


    // $ANTLR start "rule__Personne__Group__6__Impl"
    // InternalGame.g:1834:1: rule__Personne__Group__6__Impl : ( '}' ) ;
    public final void rule__Personne__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1838:1: ( ( '}' ) )
            // InternalGame.g:1839:1: ( '}' )
            {
            // InternalGame.g:1839:1: ( '}' )
            // InternalGame.g:1840:2: '}'
            {
             before(grammarAccess.getPersonneAccess().getRightCurlyBracketKeyword_6()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getPersonneAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Personne__Group__6__Impl"


    // $ANTLR start "rule__Personne__Group_3__0"
    // InternalGame.g:1850:1: rule__Personne__Group_3__0 : rule__Personne__Group_3__0__Impl rule__Personne__Group_3__1 ;
    public final void rule__Personne__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1854:1: ( rule__Personne__Group_3__0__Impl rule__Personne__Group_3__1 )
            // InternalGame.g:1855:2: rule__Personne__Group_3__0__Impl rule__Personne__Group_3__1
            {
            pushFollow(FOLLOW_20);
            rule__Personne__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Personne__Group_3__1();

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
    // $ANTLR end "rule__Personne__Group_3__0"


    // $ANTLR start "rule__Personne__Group_3__0__Impl"
    // InternalGame.g:1862:1: rule__Personne__Group_3__0__Impl : ( 'visible' ) ;
    public final void rule__Personne__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1866:1: ( ( 'visible' ) )
            // InternalGame.g:1867:1: ( 'visible' )
            {
            // InternalGame.g:1867:1: ( 'visible' )
            // InternalGame.g:1868:2: 'visible'
            {
             before(grammarAccess.getPersonneAccess().getVisibleKeyword_3_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getPersonneAccess().getVisibleKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Personne__Group_3__0__Impl"


    // $ANTLR start "rule__Personne__Group_3__1"
    // InternalGame.g:1877:1: rule__Personne__Group_3__1 : rule__Personne__Group_3__1__Impl ;
    public final void rule__Personne__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1881:1: ( rule__Personne__Group_3__1__Impl )
            // InternalGame.g:1882:2: rule__Personne__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Personne__Group_3__1__Impl();

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
    // $ANTLR end "rule__Personne__Group_3__1"


    // $ANTLR start "rule__Personne__Group_3__1__Impl"
    // InternalGame.g:1888:1: rule__Personne__Group_3__1__Impl : ( ( rule__Personne__VisibleAssignment_3_1 ) ) ;
    public final void rule__Personne__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1892:1: ( ( ( rule__Personne__VisibleAssignment_3_1 ) ) )
            // InternalGame.g:1893:1: ( ( rule__Personne__VisibleAssignment_3_1 ) )
            {
            // InternalGame.g:1893:1: ( ( rule__Personne__VisibleAssignment_3_1 ) )
            // InternalGame.g:1894:2: ( rule__Personne__VisibleAssignment_3_1 )
            {
             before(grammarAccess.getPersonneAccess().getVisibleAssignment_3_1()); 
            // InternalGame.g:1895:2: ( rule__Personne__VisibleAssignment_3_1 )
            // InternalGame.g:1895:3: rule__Personne__VisibleAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Personne__VisibleAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getPersonneAccess().getVisibleAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Personne__Group_3__1__Impl"


    // $ANTLR start "rule__Personne__Group_4__0"
    // InternalGame.g:1904:1: rule__Personne__Group_4__0 : rule__Personne__Group_4__0__Impl rule__Personne__Group_4__1 ;
    public final void rule__Personne__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1908:1: ( rule__Personne__Group_4__0__Impl rule__Personne__Group_4__1 )
            // InternalGame.g:1909:2: rule__Personne__Group_4__0__Impl rule__Personne__Group_4__1
            {
            pushFollow(FOLLOW_20);
            rule__Personne__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Personne__Group_4__1();

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
    // $ANTLR end "rule__Personne__Group_4__0"


    // $ANTLR start "rule__Personne__Group_4__0__Impl"
    // InternalGame.g:1916:1: rule__Personne__Group_4__0__Impl : ( 'obligatoire' ) ;
    public final void rule__Personne__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1920:1: ( ( 'obligatoire' ) )
            // InternalGame.g:1921:1: ( 'obligatoire' )
            {
            // InternalGame.g:1921:1: ( 'obligatoire' )
            // InternalGame.g:1922:2: 'obligatoire'
            {
             before(grammarAccess.getPersonneAccess().getObligatoireKeyword_4_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getPersonneAccess().getObligatoireKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Personne__Group_4__0__Impl"


    // $ANTLR start "rule__Personne__Group_4__1"
    // InternalGame.g:1931:1: rule__Personne__Group_4__1 : rule__Personne__Group_4__1__Impl ;
    public final void rule__Personne__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1935:1: ( rule__Personne__Group_4__1__Impl )
            // InternalGame.g:1936:2: rule__Personne__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Personne__Group_4__1__Impl();

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
    // $ANTLR end "rule__Personne__Group_4__1"


    // $ANTLR start "rule__Personne__Group_4__1__Impl"
    // InternalGame.g:1942:1: rule__Personne__Group_4__1__Impl : ( ( rule__Personne__ObligatoireAssignment_4_1 ) ) ;
    public final void rule__Personne__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1946:1: ( ( ( rule__Personne__ObligatoireAssignment_4_1 ) ) )
            // InternalGame.g:1947:1: ( ( rule__Personne__ObligatoireAssignment_4_1 ) )
            {
            // InternalGame.g:1947:1: ( ( rule__Personne__ObligatoireAssignment_4_1 ) )
            // InternalGame.g:1948:2: ( rule__Personne__ObligatoireAssignment_4_1 )
            {
             before(grammarAccess.getPersonneAccess().getObligatoireAssignment_4_1()); 
            // InternalGame.g:1949:2: ( rule__Personne__ObligatoireAssignment_4_1 )
            // InternalGame.g:1949:3: rule__Personne__ObligatoireAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Personne__ObligatoireAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getPersonneAccess().getObligatoireAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Personne__Group_4__1__Impl"


    // $ANTLR start "rule__Interaction__Group__0"
    // InternalGame.g:1958:1: rule__Interaction__Group__0 : rule__Interaction__Group__0__Impl rule__Interaction__Group__1 ;
    public final void rule__Interaction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1962:1: ( rule__Interaction__Group__0__Impl rule__Interaction__Group__1 )
            // InternalGame.g:1963:2: rule__Interaction__Group__0__Impl rule__Interaction__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Interaction__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Interaction__Group__1();

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
    // $ANTLR end "rule__Interaction__Group__0"


    // $ANTLR start "rule__Interaction__Group__0__Impl"
    // InternalGame.g:1970:1: rule__Interaction__Group__0__Impl : ( 'interaction' ) ;
    public final void rule__Interaction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1974:1: ( ( 'interaction' ) )
            // InternalGame.g:1975:1: ( 'interaction' )
            {
            // InternalGame.g:1975:1: ( 'interaction' )
            // InternalGame.g:1976:2: 'interaction'
            {
             before(grammarAccess.getInteractionAccess().getInteractionKeyword_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getInteractionAccess().getInteractionKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interaction__Group__0__Impl"


    // $ANTLR start "rule__Interaction__Group__1"
    // InternalGame.g:1985:1: rule__Interaction__Group__1 : rule__Interaction__Group__1__Impl rule__Interaction__Group__2 ;
    public final void rule__Interaction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1989:1: ( rule__Interaction__Group__1__Impl rule__Interaction__Group__2 )
            // InternalGame.g:1990:2: rule__Interaction__Group__1__Impl rule__Interaction__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Interaction__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Interaction__Group__2();

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
    // $ANTLR end "rule__Interaction__Group__1"


    // $ANTLR start "rule__Interaction__Group__1__Impl"
    // InternalGame.g:1997:1: rule__Interaction__Group__1__Impl : ( ( rule__Interaction__NameAssignment_1 ) ) ;
    public final void rule__Interaction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2001:1: ( ( ( rule__Interaction__NameAssignment_1 ) ) )
            // InternalGame.g:2002:1: ( ( rule__Interaction__NameAssignment_1 ) )
            {
            // InternalGame.g:2002:1: ( ( rule__Interaction__NameAssignment_1 ) )
            // InternalGame.g:2003:2: ( rule__Interaction__NameAssignment_1 )
            {
             before(grammarAccess.getInteractionAccess().getNameAssignment_1()); 
            // InternalGame.g:2004:2: ( rule__Interaction__NameAssignment_1 )
            // InternalGame.g:2004:3: rule__Interaction__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Interaction__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getInteractionAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interaction__Group__1__Impl"


    // $ANTLR start "rule__Interaction__Group__2"
    // InternalGame.g:2012:1: rule__Interaction__Group__2 : rule__Interaction__Group__2__Impl rule__Interaction__Group__3 ;
    public final void rule__Interaction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2016:1: ( rule__Interaction__Group__2__Impl rule__Interaction__Group__3 )
            // InternalGame.g:2017:2: rule__Interaction__Group__2__Impl rule__Interaction__Group__3
            {
            pushFollow(FOLLOW_21);
            rule__Interaction__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Interaction__Group__3();

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
    // $ANTLR end "rule__Interaction__Group__2"


    // $ANTLR start "rule__Interaction__Group__2__Impl"
    // InternalGame.g:2024:1: rule__Interaction__Group__2__Impl : ( '{' ) ;
    public final void rule__Interaction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2028:1: ( ( '{' ) )
            // InternalGame.g:2029:1: ( '{' )
            {
            // InternalGame.g:2029:1: ( '{' )
            // InternalGame.g:2030:2: '{'
            {
             before(grammarAccess.getInteractionAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getInteractionAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interaction__Group__2__Impl"


    // $ANTLR start "rule__Interaction__Group__3"
    // InternalGame.g:2039:1: rule__Interaction__Group__3 : rule__Interaction__Group__3__Impl rule__Interaction__Group__4 ;
    public final void rule__Interaction__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2043:1: ( rule__Interaction__Group__3__Impl rule__Interaction__Group__4 )
            // InternalGame.g:2044:2: rule__Interaction__Group__3__Impl rule__Interaction__Group__4
            {
            pushFollow(FOLLOW_15);
            rule__Interaction__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Interaction__Group__4();

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
    // $ANTLR end "rule__Interaction__Group__3"


    // $ANTLR start "rule__Interaction__Group__3__Impl"
    // InternalGame.g:2051:1: rule__Interaction__Group__3__Impl : ( 'texte' ) ;
    public final void rule__Interaction__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2055:1: ( ( 'texte' ) )
            // InternalGame.g:2056:1: ( 'texte' )
            {
            // InternalGame.g:2056:1: ( 'texte' )
            // InternalGame.g:2057:2: 'texte'
            {
             before(grammarAccess.getInteractionAccess().getTexteKeyword_3()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getInteractionAccess().getTexteKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interaction__Group__3__Impl"


    // $ANTLR start "rule__Interaction__Group__4"
    // InternalGame.g:2066:1: rule__Interaction__Group__4 : rule__Interaction__Group__4__Impl rule__Interaction__Group__5 ;
    public final void rule__Interaction__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2070:1: ( rule__Interaction__Group__4__Impl rule__Interaction__Group__5 )
            // InternalGame.g:2071:2: rule__Interaction__Group__4__Impl rule__Interaction__Group__5
            {
            pushFollow(FOLLOW_22);
            rule__Interaction__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Interaction__Group__5();

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
    // $ANTLR end "rule__Interaction__Group__4"


    // $ANTLR start "rule__Interaction__Group__4__Impl"
    // InternalGame.g:2078:1: rule__Interaction__Group__4__Impl : ( ( rule__Interaction__TexteAssignment_4 ) ) ;
    public final void rule__Interaction__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2082:1: ( ( ( rule__Interaction__TexteAssignment_4 ) ) )
            // InternalGame.g:2083:1: ( ( rule__Interaction__TexteAssignment_4 ) )
            {
            // InternalGame.g:2083:1: ( ( rule__Interaction__TexteAssignment_4 ) )
            // InternalGame.g:2084:2: ( rule__Interaction__TexteAssignment_4 )
            {
             before(grammarAccess.getInteractionAccess().getTexteAssignment_4()); 
            // InternalGame.g:2085:2: ( rule__Interaction__TexteAssignment_4 )
            // InternalGame.g:2085:3: rule__Interaction__TexteAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Interaction__TexteAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getInteractionAccess().getTexteAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interaction__Group__4__Impl"


    // $ANTLR start "rule__Interaction__Group__5"
    // InternalGame.g:2093:1: rule__Interaction__Group__5 : rule__Interaction__Group__5__Impl rule__Interaction__Group__6 ;
    public final void rule__Interaction__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2097:1: ( rule__Interaction__Group__5__Impl rule__Interaction__Group__6 )
            // InternalGame.g:2098:2: rule__Interaction__Group__5__Impl rule__Interaction__Group__6
            {
            pushFollow(FOLLOW_22);
            rule__Interaction__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Interaction__Group__6();

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
    // $ANTLR end "rule__Interaction__Group__5"


    // $ANTLR start "rule__Interaction__Group__5__Impl"
    // InternalGame.g:2105:1: rule__Interaction__Group__5__Impl : ( ( rule__Interaction__InteractionElementsAssignment_5 )* ) ;
    public final void rule__Interaction__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2109:1: ( ( ( rule__Interaction__InteractionElementsAssignment_5 )* ) )
            // InternalGame.g:2110:1: ( ( rule__Interaction__InteractionElementsAssignment_5 )* )
            {
            // InternalGame.g:2110:1: ( ( rule__Interaction__InteractionElementsAssignment_5 )* )
            // InternalGame.g:2111:2: ( rule__Interaction__InteractionElementsAssignment_5 )*
            {
             before(grammarAccess.getInteractionAccess().getInteractionElementsAssignment_5()); 
            // InternalGame.g:2112:2: ( rule__Interaction__InteractionElementsAssignment_5 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==31) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalGame.g:2112:3: rule__Interaction__InteractionElementsAssignment_5
            	    {
            	    pushFollow(FOLLOW_23);
            	    rule__Interaction__InteractionElementsAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getInteractionAccess().getInteractionElementsAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interaction__Group__5__Impl"


    // $ANTLR start "rule__Interaction__Group__6"
    // InternalGame.g:2120:1: rule__Interaction__Group__6 : rule__Interaction__Group__6__Impl ;
    public final void rule__Interaction__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2124:1: ( rule__Interaction__Group__6__Impl )
            // InternalGame.g:2125:2: rule__Interaction__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Interaction__Group__6__Impl();

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
    // $ANTLR end "rule__Interaction__Group__6"


    // $ANTLR start "rule__Interaction__Group__6__Impl"
    // InternalGame.g:2131:1: rule__Interaction__Group__6__Impl : ( '}' ) ;
    public final void rule__Interaction__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2135:1: ( ( '}' ) )
            // InternalGame.g:2136:1: ( '}' )
            {
            // InternalGame.g:2136:1: ( '}' )
            // InternalGame.g:2137:2: '}'
            {
             before(grammarAccess.getInteractionAccess().getRightCurlyBracketKeyword_6()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getInteractionAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interaction__Group__6__Impl"


    // $ANTLR start "rule__Choix__Group__0"
    // InternalGame.g:2147:1: rule__Choix__Group__0 : rule__Choix__Group__0__Impl rule__Choix__Group__1 ;
    public final void rule__Choix__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2151:1: ( rule__Choix__Group__0__Impl rule__Choix__Group__1 )
            // InternalGame.g:2152:2: rule__Choix__Group__0__Impl rule__Choix__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Choix__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Choix__Group__1();

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
    // $ANTLR end "rule__Choix__Group__0"


    // $ANTLR start "rule__Choix__Group__0__Impl"
    // InternalGame.g:2159:1: rule__Choix__Group__0__Impl : ( 'choix' ) ;
    public final void rule__Choix__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2163:1: ( ( 'choix' ) )
            // InternalGame.g:2164:1: ( 'choix' )
            {
            // InternalGame.g:2164:1: ( 'choix' )
            // InternalGame.g:2165:2: 'choix'
            {
             before(grammarAccess.getChoixAccess().getChoixKeyword_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getChoixAccess().getChoixKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choix__Group__0__Impl"


    // $ANTLR start "rule__Choix__Group__1"
    // InternalGame.g:2174:1: rule__Choix__Group__1 : rule__Choix__Group__1__Impl rule__Choix__Group__2 ;
    public final void rule__Choix__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2178:1: ( rule__Choix__Group__1__Impl rule__Choix__Group__2 )
            // InternalGame.g:2179:2: rule__Choix__Group__1__Impl rule__Choix__Group__2
            {
            pushFollow(FOLLOW_15);
            rule__Choix__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Choix__Group__2();

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
    // $ANTLR end "rule__Choix__Group__1"


    // $ANTLR start "rule__Choix__Group__1__Impl"
    // InternalGame.g:2186:1: rule__Choix__Group__1__Impl : ( ( rule__Choix__NameAssignment_1 ) ) ;
    public final void rule__Choix__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2190:1: ( ( ( rule__Choix__NameAssignment_1 ) ) )
            // InternalGame.g:2191:1: ( ( rule__Choix__NameAssignment_1 ) )
            {
            // InternalGame.g:2191:1: ( ( rule__Choix__NameAssignment_1 ) )
            // InternalGame.g:2192:2: ( rule__Choix__NameAssignment_1 )
            {
             before(grammarAccess.getChoixAccess().getNameAssignment_1()); 
            // InternalGame.g:2193:2: ( rule__Choix__NameAssignment_1 )
            // InternalGame.g:2193:3: rule__Choix__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Choix__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getChoixAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choix__Group__1__Impl"


    // $ANTLR start "rule__Choix__Group__2"
    // InternalGame.g:2201:1: rule__Choix__Group__2 : rule__Choix__Group__2__Impl rule__Choix__Group__3 ;
    public final void rule__Choix__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2205:1: ( rule__Choix__Group__2__Impl rule__Choix__Group__3 )
            // InternalGame.g:2206:2: rule__Choix__Group__2__Impl rule__Choix__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__Choix__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Choix__Group__3();

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
    // $ANTLR end "rule__Choix__Group__2"


    // $ANTLR start "rule__Choix__Group__2__Impl"
    // InternalGame.g:2213:1: rule__Choix__Group__2__Impl : ( ( rule__Choix__TexteAssignment_2 ) ) ;
    public final void rule__Choix__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2217:1: ( ( ( rule__Choix__TexteAssignment_2 ) ) )
            // InternalGame.g:2218:1: ( ( rule__Choix__TexteAssignment_2 ) )
            {
            // InternalGame.g:2218:1: ( ( rule__Choix__TexteAssignment_2 ) )
            // InternalGame.g:2219:2: ( rule__Choix__TexteAssignment_2 )
            {
             before(grammarAccess.getChoixAccess().getTexteAssignment_2()); 
            // InternalGame.g:2220:2: ( rule__Choix__TexteAssignment_2 )
            // InternalGame.g:2220:3: rule__Choix__TexteAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Choix__TexteAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getChoixAccess().getTexteAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choix__Group__2__Impl"


    // $ANTLR start "rule__Choix__Group__3"
    // InternalGame.g:2228:1: rule__Choix__Group__3 : rule__Choix__Group__3__Impl rule__Choix__Group__4 ;
    public final void rule__Choix__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2232:1: ( rule__Choix__Group__3__Impl rule__Choix__Group__4 )
            // InternalGame.g:2233:2: rule__Choix__Group__3__Impl rule__Choix__Group__4
            {
            pushFollow(FOLLOW_24);
            rule__Choix__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Choix__Group__4();

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
    // $ANTLR end "rule__Choix__Group__3"


    // $ANTLR start "rule__Choix__Group__3__Impl"
    // InternalGame.g:2240:1: rule__Choix__Group__3__Impl : ( '{' ) ;
    public final void rule__Choix__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2244:1: ( ( '{' ) )
            // InternalGame.g:2245:1: ( '{' )
            {
            // InternalGame.g:2245:1: ( '{' )
            // InternalGame.g:2246:2: '{'
            {
             before(grammarAccess.getChoixAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getChoixAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choix__Group__3__Impl"


    // $ANTLR start "rule__Choix__Group__4"
    // InternalGame.g:2255:1: rule__Choix__Group__4 : rule__Choix__Group__4__Impl rule__Choix__Group__5 ;
    public final void rule__Choix__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2259:1: ( rule__Choix__Group__4__Impl rule__Choix__Group__5 )
            // InternalGame.g:2260:2: rule__Choix__Group__4__Impl rule__Choix__Group__5
            {
            pushFollow(FOLLOW_25);
            rule__Choix__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Choix__Group__5();

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
    // $ANTLR end "rule__Choix__Group__4"


    // $ANTLR start "rule__Choix__Group__4__Impl"
    // InternalGame.g:2267:1: rule__Choix__Group__4__Impl : ( ( ( rule__Choix__ListeActionsAssignment_4 ) ) ( ( rule__Choix__ListeActionsAssignment_4 )* ) ) ;
    public final void rule__Choix__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2271:1: ( ( ( ( rule__Choix__ListeActionsAssignment_4 ) ) ( ( rule__Choix__ListeActionsAssignment_4 )* ) ) )
            // InternalGame.g:2272:1: ( ( ( rule__Choix__ListeActionsAssignment_4 ) ) ( ( rule__Choix__ListeActionsAssignment_4 )* ) )
            {
            // InternalGame.g:2272:1: ( ( ( rule__Choix__ListeActionsAssignment_4 ) ) ( ( rule__Choix__ListeActionsAssignment_4 )* ) )
            // InternalGame.g:2273:2: ( ( rule__Choix__ListeActionsAssignment_4 ) ) ( ( rule__Choix__ListeActionsAssignment_4 )* )
            {
            // InternalGame.g:2273:2: ( ( rule__Choix__ListeActionsAssignment_4 ) )
            // InternalGame.g:2274:3: ( rule__Choix__ListeActionsAssignment_4 )
            {
             before(grammarAccess.getChoixAccess().getListeActionsAssignment_4()); 
            // InternalGame.g:2275:3: ( rule__Choix__ListeActionsAssignment_4 )
            // InternalGame.g:2275:4: rule__Choix__ListeActionsAssignment_4
            {
            pushFollow(FOLLOW_26);
            rule__Choix__ListeActionsAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getChoixAccess().getListeActionsAssignment_4()); 

            }

            // InternalGame.g:2278:2: ( ( rule__Choix__ListeActionsAssignment_4 )* )
            // InternalGame.g:2279:3: ( rule__Choix__ListeActionsAssignment_4 )*
            {
             before(grammarAccess.getChoixAccess().getListeActionsAssignment_4()); 
            // InternalGame.g:2280:3: ( rule__Choix__ListeActionsAssignment_4 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==34) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalGame.g:2280:4: rule__Choix__ListeActionsAssignment_4
            	    {
            	    pushFollow(FOLLOW_26);
            	    rule__Choix__ListeActionsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getChoixAccess().getListeActionsAssignment_4()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choix__Group__4__Impl"


    // $ANTLR start "rule__Choix__Group__5"
    // InternalGame.g:2289:1: rule__Choix__Group__5 : rule__Choix__Group__5__Impl rule__Choix__Group__6 ;
    public final void rule__Choix__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2293:1: ( rule__Choix__Group__5__Impl rule__Choix__Group__6 )
            // InternalGame.g:2294:2: rule__Choix__Group__5__Impl rule__Choix__Group__6
            {
            pushFollow(FOLLOW_25);
            rule__Choix__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Choix__Group__6();

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
    // $ANTLR end "rule__Choix__Group__5"


    // $ANTLR start "rule__Choix__Group__5__Impl"
    // InternalGame.g:2301:1: rule__Choix__Group__5__Impl : ( ( rule__Choix__Group_5__0 )? ) ;
    public final void rule__Choix__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2305:1: ( ( ( rule__Choix__Group_5__0 )? ) )
            // InternalGame.g:2306:1: ( ( rule__Choix__Group_5__0 )? )
            {
            // InternalGame.g:2306:1: ( ( rule__Choix__Group_5__0 )? )
            // InternalGame.g:2307:2: ( rule__Choix__Group_5__0 )?
            {
             before(grammarAccess.getChoixAccess().getGroup_5()); 
            // InternalGame.g:2308:2: ( rule__Choix__Group_5__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==32) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalGame.g:2308:3: rule__Choix__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Choix__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getChoixAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choix__Group__5__Impl"


    // $ANTLR start "rule__Choix__Group__6"
    // InternalGame.g:2316:1: rule__Choix__Group__6 : rule__Choix__Group__6__Impl rule__Choix__Group__7 ;
    public final void rule__Choix__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2320:1: ( rule__Choix__Group__6__Impl rule__Choix__Group__7 )
            // InternalGame.g:2321:2: rule__Choix__Group__6__Impl rule__Choix__Group__7
            {
            pushFollow(FOLLOW_25);
            rule__Choix__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Choix__Group__7();

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
    // $ANTLR end "rule__Choix__Group__6"


    // $ANTLR start "rule__Choix__Group__6__Impl"
    // InternalGame.g:2328:1: rule__Choix__Group__6__Impl : ( ( rule__Choix__Group_6__0 )? ) ;
    public final void rule__Choix__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2332:1: ( ( ( rule__Choix__Group_6__0 )? ) )
            // InternalGame.g:2333:1: ( ( rule__Choix__Group_6__0 )? )
            {
            // InternalGame.g:2333:1: ( ( rule__Choix__Group_6__0 )? )
            // InternalGame.g:2334:2: ( rule__Choix__Group_6__0 )?
            {
             before(grammarAccess.getChoixAccess().getGroup_6()); 
            // InternalGame.g:2335:2: ( rule__Choix__Group_6__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==33) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalGame.g:2335:3: rule__Choix__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Choix__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getChoixAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choix__Group__6__Impl"


    // $ANTLR start "rule__Choix__Group__7"
    // InternalGame.g:2343:1: rule__Choix__Group__7 : rule__Choix__Group__7__Impl ;
    public final void rule__Choix__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2347:1: ( rule__Choix__Group__7__Impl )
            // InternalGame.g:2348:2: rule__Choix__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Choix__Group__7__Impl();

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
    // $ANTLR end "rule__Choix__Group__7"


    // $ANTLR start "rule__Choix__Group__7__Impl"
    // InternalGame.g:2354:1: rule__Choix__Group__7__Impl : ( '}' ) ;
    public final void rule__Choix__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2358:1: ( ( '}' ) )
            // InternalGame.g:2359:1: ( '}' )
            {
            // InternalGame.g:2359:1: ( '}' )
            // InternalGame.g:2360:2: '}'
            {
             before(grammarAccess.getChoixAccess().getRightCurlyBracketKeyword_7()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getChoixAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choix__Group__7__Impl"


    // $ANTLR start "rule__Choix__Group_5__0"
    // InternalGame.g:2370:1: rule__Choix__Group_5__0 : rule__Choix__Group_5__0__Impl rule__Choix__Group_5__1 ;
    public final void rule__Choix__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2374:1: ( rule__Choix__Group_5__0__Impl rule__Choix__Group_5__1 )
            // InternalGame.g:2375:2: rule__Choix__Group_5__0__Impl rule__Choix__Group_5__1
            {
            pushFollow(FOLLOW_15);
            rule__Choix__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Choix__Group_5__1();

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
    // $ANTLR end "rule__Choix__Group_5__0"


    // $ANTLR start "rule__Choix__Group_5__0__Impl"
    // InternalGame.g:2382:1: rule__Choix__Group_5__0__Impl : ( 'choixdebut' ) ;
    public final void rule__Choix__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2386:1: ( ( 'choixdebut' ) )
            // InternalGame.g:2387:1: ( 'choixdebut' )
            {
            // InternalGame.g:2387:1: ( 'choixdebut' )
            // InternalGame.g:2388:2: 'choixdebut'
            {
             before(grammarAccess.getChoixAccess().getChoixdebutKeyword_5_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getChoixAccess().getChoixdebutKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choix__Group_5__0__Impl"


    // $ANTLR start "rule__Choix__Group_5__1"
    // InternalGame.g:2397:1: rule__Choix__Group_5__1 : rule__Choix__Group_5__1__Impl ;
    public final void rule__Choix__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2401:1: ( rule__Choix__Group_5__1__Impl )
            // InternalGame.g:2402:2: rule__Choix__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Choix__Group_5__1__Impl();

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
    // $ANTLR end "rule__Choix__Group_5__1"


    // $ANTLR start "rule__Choix__Group_5__1__Impl"
    // InternalGame.g:2408:1: rule__Choix__Group_5__1__Impl : ( ( rule__Choix__Group_5_1__0 )? ) ;
    public final void rule__Choix__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2412:1: ( ( ( rule__Choix__Group_5_1__0 )? ) )
            // InternalGame.g:2413:1: ( ( rule__Choix__Group_5_1__0 )? )
            {
            // InternalGame.g:2413:1: ( ( rule__Choix__Group_5_1__0 )? )
            // InternalGame.g:2414:2: ( rule__Choix__Group_5_1__0 )?
            {
             before(grammarAccess.getChoixAccess().getGroup_5_1()); 
            // InternalGame.g:2415:2: ( rule__Choix__Group_5_1__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_STRING) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalGame.g:2415:3: rule__Choix__Group_5_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Choix__Group_5_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getChoixAccess().getGroup_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choix__Group_5__1__Impl"


    // $ANTLR start "rule__Choix__Group_5_1__0"
    // InternalGame.g:2424:1: rule__Choix__Group_5_1__0 : rule__Choix__Group_5_1__0__Impl rule__Choix__Group_5_1__1 ;
    public final void rule__Choix__Group_5_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2428:1: ( rule__Choix__Group_5_1__0__Impl rule__Choix__Group_5_1__1 )
            // InternalGame.g:2429:2: rule__Choix__Group_5_1__0__Impl rule__Choix__Group_5_1__1
            {
            pushFollow(FOLLOW_16);
            rule__Choix__Group_5_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Choix__Group_5_1__1();

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
    // $ANTLR end "rule__Choix__Group_5_1__0"


    // $ANTLR start "rule__Choix__Group_5_1__0__Impl"
    // InternalGame.g:2436:1: rule__Choix__Group_5_1__0__Impl : ( ( rule__Choix__ChoixdebutAssignment_5_1_0 ) ) ;
    public final void rule__Choix__Group_5_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2440:1: ( ( ( rule__Choix__ChoixdebutAssignment_5_1_0 ) ) )
            // InternalGame.g:2441:1: ( ( rule__Choix__ChoixdebutAssignment_5_1_0 ) )
            {
            // InternalGame.g:2441:1: ( ( rule__Choix__ChoixdebutAssignment_5_1_0 ) )
            // InternalGame.g:2442:2: ( rule__Choix__ChoixdebutAssignment_5_1_0 )
            {
             before(grammarAccess.getChoixAccess().getChoixdebutAssignment_5_1_0()); 
            // InternalGame.g:2443:2: ( rule__Choix__ChoixdebutAssignment_5_1_0 )
            // InternalGame.g:2443:3: rule__Choix__ChoixdebutAssignment_5_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Choix__ChoixdebutAssignment_5_1_0();

            state._fsp--;


            }

             after(grammarAccess.getChoixAccess().getChoixdebutAssignment_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choix__Group_5_1__0__Impl"


    // $ANTLR start "rule__Choix__Group_5_1__1"
    // InternalGame.g:2451:1: rule__Choix__Group_5_1__1 : rule__Choix__Group_5_1__1__Impl ;
    public final void rule__Choix__Group_5_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2455:1: ( rule__Choix__Group_5_1__1__Impl )
            // InternalGame.g:2456:2: rule__Choix__Group_5_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Choix__Group_5_1__1__Impl();

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
    // $ANTLR end "rule__Choix__Group_5_1__1"


    // $ANTLR start "rule__Choix__Group_5_1__1__Impl"
    // InternalGame.g:2462:1: rule__Choix__Group_5_1__1__Impl : ( ( rule__Choix__ConditonChoixDebutAssignment_5_1_1 ) ) ;
    public final void rule__Choix__Group_5_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2466:1: ( ( ( rule__Choix__ConditonChoixDebutAssignment_5_1_1 ) ) )
            // InternalGame.g:2467:1: ( ( rule__Choix__ConditonChoixDebutAssignment_5_1_1 ) )
            {
            // InternalGame.g:2467:1: ( ( rule__Choix__ConditonChoixDebutAssignment_5_1_1 ) )
            // InternalGame.g:2468:2: ( rule__Choix__ConditonChoixDebutAssignment_5_1_1 )
            {
             before(grammarAccess.getChoixAccess().getConditonChoixDebutAssignment_5_1_1()); 
            // InternalGame.g:2469:2: ( rule__Choix__ConditonChoixDebutAssignment_5_1_1 )
            // InternalGame.g:2469:3: rule__Choix__ConditonChoixDebutAssignment_5_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Choix__ConditonChoixDebutAssignment_5_1_1();

            state._fsp--;


            }

             after(grammarAccess.getChoixAccess().getConditonChoixDebutAssignment_5_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choix__Group_5_1__1__Impl"


    // $ANTLR start "rule__Choix__Group_6__0"
    // InternalGame.g:2478:1: rule__Choix__Group_6__0 : rule__Choix__Group_6__0__Impl rule__Choix__Group_6__1 ;
    public final void rule__Choix__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2482:1: ( rule__Choix__Group_6__0__Impl rule__Choix__Group_6__1 )
            // InternalGame.g:2483:2: rule__Choix__Group_6__0__Impl rule__Choix__Group_6__1
            {
            pushFollow(FOLLOW_15);
            rule__Choix__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Choix__Group_6__1();

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
    // $ANTLR end "rule__Choix__Group_6__0"


    // $ANTLR start "rule__Choix__Group_6__0__Impl"
    // InternalGame.g:2490:1: rule__Choix__Group_6__0__Impl : ( 'choixfin' ) ;
    public final void rule__Choix__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2494:1: ( ( 'choixfin' ) )
            // InternalGame.g:2495:1: ( 'choixfin' )
            {
            // InternalGame.g:2495:1: ( 'choixfin' )
            // InternalGame.g:2496:2: 'choixfin'
            {
             before(grammarAccess.getChoixAccess().getChoixfinKeyword_6_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getChoixAccess().getChoixfinKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choix__Group_6__0__Impl"


    // $ANTLR start "rule__Choix__Group_6__1"
    // InternalGame.g:2505:1: rule__Choix__Group_6__1 : rule__Choix__Group_6__1__Impl ;
    public final void rule__Choix__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2509:1: ( rule__Choix__Group_6__1__Impl )
            // InternalGame.g:2510:2: rule__Choix__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Choix__Group_6__1__Impl();

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
    // $ANTLR end "rule__Choix__Group_6__1"


    // $ANTLR start "rule__Choix__Group_6__1__Impl"
    // InternalGame.g:2516:1: rule__Choix__Group_6__1__Impl : ( ( rule__Choix__Group_6_1__0 )? ) ;
    public final void rule__Choix__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2520:1: ( ( ( rule__Choix__Group_6_1__0 )? ) )
            // InternalGame.g:2521:1: ( ( rule__Choix__Group_6_1__0 )? )
            {
            // InternalGame.g:2521:1: ( ( rule__Choix__Group_6_1__0 )? )
            // InternalGame.g:2522:2: ( rule__Choix__Group_6_1__0 )?
            {
             before(grammarAccess.getChoixAccess().getGroup_6_1()); 
            // InternalGame.g:2523:2: ( rule__Choix__Group_6_1__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_STRING) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalGame.g:2523:3: rule__Choix__Group_6_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Choix__Group_6_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getChoixAccess().getGroup_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choix__Group_6__1__Impl"


    // $ANTLR start "rule__Choix__Group_6_1__0"
    // InternalGame.g:2532:1: rule__Choix__Group_6_1__0 : rule__Choix__Group_6_1__0__Impl rule__Choix__Group_6_1__1 ;
    public final void rule__Choix__Group_6_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2536:1: ( rule__Choix__Group_6_1__0__Impl rule__Choix__Group_6_1__1 )
            // InternalGame.g:2537:2: rule__Choix__Group_6_1__0__Impl rule__Choix__Group_6_1__1
            {
            pushFollow(FOLLOW_16);
            rule__Choix__Group_6_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Choix__Group_6_1__1();

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
    // $ANTLR end "rule__Choix__Group_6_1__0"


    // $ANTLR start "rule__Choix__Group_6_1__0__Impl"
    // InternalGame.g:2544:1: rule__Choix__Group_6_1__0__Impl : ( ( rule__Choix__ChoixfinAssignment_6_1_0 ) ) ;
    public final void rule__Choix__Group_6_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2548:1: ( ( ( rule__Choix__ChoixfinAssignment_6_1_0 ) ) )
            // InternalGame.g:2549:1: ( ( rule__Choix__ChoixfinAssignment_6_1_0 ) )
            {
            // InternalGame.g:2549:1: ( ( rule__Choix__ChoixfinAssignment_6_1_0 ) )
            // InternalGame.g:2550:2: ( rule__Choix__ChoixfinAssignment_6_1_0 )
            {
             before(grammarAccess.getChoixAccess().getChoixfinAssignment_6_1_0()); 
            // InternalGame.g:2551:2: ( rule__Choix__ChoixfinAssignment_6_1_0 )
            // InternalGame.g:2551:3: rule__Choix__ChoixfinAssignment_6_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Choix__ChoixfinAssignment_6_1_0();

            state._fsp--;


            }

             after(grammarAccess.getChoixAccess().getChoixfinAssignment_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choix__Group_6_1__0__Impl"


    // $ANTLR start "rule__Choix__Group_6_1__1"
    // InternalGame.g:2559:1: rule__Choix__Group_6_1__1 : rule__Choix__Group_6_1__1__Impl ;
    public final void rule__Choix__Group_6_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2563:1: ( rule__Choix__Group_6_1__1__Impl )
            // InternalGame.g:2564:2: rule__Choix__Group_6_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Choix__Group_6_1__1__Impl();

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
    // $ANTLR end "rule__Choix__Group_6_1__1"


    // $ANTLR start "rule__Choix__Group_6_1__1__Impl"
    // InternalGame.g:2570:1: rule__Choix__Group_6_1__1__Impl : ( ( rule__Choix__ConditionChoixFinAssignment_6_1_1 ) ) ;
    public final void rule__Choix__Group_6_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2574:1: ( ( ( rule__Choix__ConditionChoixFinAssignment_6_1_1 ) ) )
            // InternalGame.g:2575:1: ( ( rule__Choix__ConditionChoixFinAssignment_6_1_1 ) )
            {
            // InternalGame.g:2575:1: ( ( rule__Choix__ConditionChoixFinAssignment_6_1_1 ) )
            // InternalGame.g:2576:2: ( rule__Choix__ConditionChoixFinAssignment_6_1_1 )
            {
             before(grammarAccess.getChoixAccess().getConditionChoixFinAssignment_6_1_1()); 
            // InternalGame.g:2577:2: ( rule__Choix__ConditionChoixFinAssignment_6_1_1 )
            // InternalGame.g:2577:3: rule__Choix__ConditionChoixFinAssignment_6_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Choix__ConditionChoixFinAssignment_6_1_1();

            state._fsp--;


            }

             after(grammarAccess.getChoixAccess().getConditionChoixFinAssignment_6_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choix__Group_6_1__1__Impl"


    // $ANTLR start "rule__Action__Group__0"
    // InternalGame.g:2586:1: rule__Action__Group__0 : rule__Action__Group__0__Impl rule__Action__Group__1 ;
    public final void rule__Action__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2590:1: ( rule__Action__Group__0__Impl rule__Action__Group__1 )
            // InternalGame.g:2591:2: rule__Action__Group__0__Impl rule__Action__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Action__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Action__Group__1();

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
    // $ANTLR end "rule__Action__Group__0"


    // $ANTLR start "rule__Action__Group__0__Impl"
    // InternalGame.g:2598:1: rule__Action__Group__0__Impl : ( 'action' ) ;
    public final void rule__Action__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2602:1: ( ( 'action' ) )
            // InternalGame.g:2603:1: ( 'action' )
            {
            // InternalGame.g:2603:1: ( 'action' )
            // InternalGame.g:2604:2: 'action'
            {
             before(grammarAccess.getActionAccess().getActionKeyword_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getActionAccess().getActionKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group__0__Impl"


    // $ANTLR start "rule__Action__Group__1"
    // InternalGame.g:2613:1: rule__Action__Group__1 : rule__Action__Group__1__Impl rule__Action__Group__2 ;
    public final void rule__Action__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2617:1: ( rule__Action__Group__1__Impl rule__Action__Group__2 )
            // InternalGame.g:2618:2: rule__Action__Group__1__Impl rule__Action__Group__2
            {
            pushFollow(FOLLOW_27);
            rule__Action__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Action__Group__2();

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
    // $ANTLR end "rule__Action__Group__1"


    // $ANTLR start "rule__Action__Group__1__Impl"
    // InternalGame.g:2625:1: rule__Action__Group__1__Impl : ( '{' ) ;
    public final void rule__Action__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2629:1: ( ( '{' ) )
            // InternalGame.g:2630:1: ( '{' )
            {
            // InternalGame.g:2630:1: ( '{' )
            // InternalGame.g:2631:2: '{'
            {
             before(grammarAccess.getActionAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getActionAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group__1__Impl"


    // $ANTLR start "rule__Action__Group__2"
    // InternalGame.g:2640:1: rule__Action__Group__2 : rule__Action__Group__2__Impl rule__Action__Group__3 ;
    public final void rule__Action__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2644:1: ( rule__Action__Group__2__Impl rule__Action__Group__3 )
            // InternalGame.g:2645:2: rule__Action__Group__2__Impl rule__Action__Group__3
            {
            pushFollow(FOLLOW_27);
            rule__Action__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Action__Group__3();

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
    // $ANTLR end "rule__Action__Group__2"


    // $ANTLR start "rule__Action__Group__2__Impl"
    // InternalGame.g:2652:1: rule__Action__Group__2__Impl : ( ( rule__Action__ConditionActionAssignment_2 )? ) ;
    public final void rule__Action__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2656:1: ( ( ( rule__Action__ConditionActionAssignment_2 )? ) )
            // InternalGame.g:2657:1: ( ( rule__Action__ConditionActionAssignment_2 )? )
            {
            // InternalGame.g:2657:1: ( ( rule__Action__ConditionActionAssignment_2 )? )
            // InternalGame.g:2658:2: ( rule__Action__ConditionActionAssignment_2 )?
            {
             before(grammarAccess.getActionAccess().getConditionActionAssignment_2()); 
            // InternalGame.g:2659:2: ( rule__Action__ConditionActionAssignment_2 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==43) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalGame.g:2659:3: rule__Action__ConditionActionAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Action__ConditionActionAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getActionAccess().getConditionActionAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group__2__Impl"


    // $ANTLR start "rule__Action__Group__3"
    // InternalGame.g:2667:1: rule__Action__Group__3 : rule__Action__Group__3__Impl rule__Action__Group__4 ;
    public final void rule__Action__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2671:1: ( rule__Action__Group__3__Impl rule__Action__Group__4 )
            // InternalGame.g:2672:2: rule__Action__Group__3__Impl rule__Action__Group__4
            {
            pushFollow(FOLLOW_27);
            rule__Action__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Action__Group__4();

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
    // $ANTLR end "rule__Action__Group__3"


    // $ANTLR start "rule__Action__Group__3__Impl"
    // InternalGame.g:2679:1: rule__Action__Group__3__Impl : ( ( rule__Action__ListeChoixAssignment_3 )* ) ;
    public final void rule__Action__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2683:1: ( ( ( rule__Action__ListeChoixAssignment_3 )* ) )
            // InternalGame.g:2684:1: ( ( rule__Action__ListeChoixAssignment_3 )* )
            {
            // InternalGame.g:2684:1: ( ( rule__Action__ListeChoixAssignment_3 )* )
            // InternalGame.g:2685:2: ( rule__Action__ListeChoixAssignment_3 )*
            {
             before(grammarAccess.getActionAccess().getListeChoixAssignment_3()); 
            // InternalGame.g:2686:2: ( rule__Action__ListeChoixAssignment_3 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==RULE_ID) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalGame.g:2686:3: rule__Action__ListeChoixAssignment_3
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Action__ListeChoixAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

             after(grammarAccess.getActionAccess().getListeChoixAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group__3__Impl"


    // $ANTLR start "rule__Action__Group__4"
    // InternalGame.g:2694:1: rule__Action__Group__4 : rule__Action__Group__4__Impl rule__Action__Group__5 ;
    public final void rule__Action__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2698:1: ( rule__Action__Group__4__Impl rule__Action__Group__5 )
            // InternalGame.g:2699:2: rule__Action__Group__4__Impl rule__Action__Group__5
            {
            pushFollow(FOLLOW_27);
            rule__Action__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Action__Group__5();

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
    // $ANTLR end "rule__Action__Group__4"


    // $ANTLR start "rule__Action__Group__4__Impl"
    // InternalGame.g:2706:1: rule__Action__Group__4__Impl : ( ( rule__Action__ListeConnaissancesAssignment_4 )? ) ;
    public final void rule__Action__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2710:1: ( ( ( rule__Action__ListeConnaissancesAssignment_4 )? ) )
            // InternalGame.g:2711:1: ( ( rule__Action__ListeConnaissancesAssignment_4 )? )
            {
            // InternalGame.g:2711:1: ( ( rule__Action__ListeConnaissancesAssignment_4 )? )
            // InternalGame.g:2712:2: ( rule__Action__ListeConnaissancesAssignment_4 )?
            {
             before(grammarAccess.getActionAccess().getListeConnaissancesAssignment_4()); 
            // InternalGame.g:2713:2: ( rule__Action__ListeConnaissancesAssignment_4 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==20) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalGame.g:2713:3: rule__Action__ListeConnaissancesAssignment_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__Action__ListeConnaissancesAssignment_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getActionAccess().getListeConnaissancesAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group__4__Impl"


    // $ANTLR start "rule__Action__Group__5"
    // InternalGame.g:2721:1: rule__Action__Group__5 : rule__Action__Group__5__Impl rule__Action__Group__6 ;
    public final void rule__Action__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2725:1: ( rule__Action__Group__5__Impl rule__Action__Group__6 )
            // InternalGame.g:2726:2: rule__Action__Group__5__Impl rule__Action__Group__6
            {
            pushFollow(FOLLOW_27);
            rule__Action__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Action__Group__6();

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
    // $ANTLR end "rule__Action__Group__5"


    // $ANTLR start "rule__Action__Group__5__Impl"
    // InternalGame.g:2733:1: rule__Action__Group__5__Impl : ( ( rule__Action__ListeObjetsAssignment_5 )* ) ;
    public final void rule__Action__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2737:1: ( ( ( rule__Action__ListeObjetsAssignment_5 )* ) )
            // InternalGame.g:2738:1: ( ( rule__Action__ListeObjetsAssignment_5 )* )
            {
            // InternalGame.g:2738:1: ( ( rule__Action__ListeObjetsAssignment_5 )* )
            // InternalGame.g:2739:2: ( rule__Action__ListeObjetsAssignment_5 )*
            {
             before(grammarAccess.getActionAccess().getListeObjetsAssignment_5()); 
            // InternalGame.g:2740:2: ( rule__Action__ListeObjetsAssignment_5 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==RULE_ID) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalGame.g:2740:3: rule__Action__ListeObjetsAssignment_5
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Action__ListeObjetsAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

             after(grammarAccess.getActionAccess().getListeObjetsAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group__5__Impl"


    // $ANTLR start "rule__Action__Group__6"
    // InternalGame.g:2748:1: rule__Action__Group__6 : rule__Action__Group__6__Impl rule__Action__Group__7 ;
    public final void rule__Action__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2752:1: ( rule__Action__Group__6__Impl rule__Action__Group__7 )
            // InternalGame.g:2753:2: rule__Action__Group__6__Impl rule__Action__Group__7
            {
            pushFollow(FOLLOW_16);
            rule__Action__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Action__Group__7();

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
    // $ANTLR end "rule__Action__Group__6"


    // $ANTLR start "rule__Action__Group__6__Impl"
    // InternalGame.g:2760:1: rule__Action__Group__6__Impl : ( 'attributionC' ) ;
    public final void rule__Action__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2764:1: ( ( 'attributionC' ) )
            // InternalGame.g:2765:1: ( 'attributionC' )
            {
            // InternalGame.g:2765:1: ( 'attributionC' )
            // InternalGame.g:2766:2: 'attributionC'
            {
             before(grammarAccess.getActionAccess().getAttributionCKeyword_6()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getActionAccess().getAttributionCKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group__6__Impl"


    // $ANTLR start "rule__Action__Group__7"
    // InternalGame.g:2775:1: rule__Action__Group__7 : rule__Action__Group__7__Impl rule__Action__Group__8 ;
    public final void rule__Action__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2779:1: ( rule__Action__Group__7__Impl rule__Action__Group__8 )
            // InternalGame.g:2780:2: rule__Action__Group__7__Impl rule__Action__Group__8
            {
            pushFollow(FOLLOW_28);
            rule__Action__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Action__Group__8();

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
    // $ANTLR end "rule__Action__Group__7"


    // $ANTLR start "rule__Action__Group__7__Impl"
    // InternalGame.g:2787:1: rule__Action__Group__7__Impl : ( ( rule__Action__AttributionConnaissanceAssignment_7 ) ) ;
    public final void rule__Action__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2791:1: ( ( ( rule__Action__AttributionConnaissanceAssignment_7 ) ) )
            // InternalGame.g:2792:1: ( ( rule__Action__AttributionConnaissanceAssignment_7 ) )
            {
            // InternalGame.g:2792:1: ( ( rule__Action__AttributionConnaissanceAssignment_7 ) )
            // InternalGame.g:2793:2: ( rule__Action__AttributionConnaissanceAssignment_7 )
            {
             before(grammarAccess.getActionAccess().getAttributionConnaissanceAssignment_7()); 
            // InternalGame.g:2794:2: ( rule__Action__AttributionConnaissanceAssignment_7 )
            // InternalGame.g:2794:3: rule__Action__AttributionConnaissanceAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__Action__AttributionConnaissanceAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getActionAccess().getAttributionConnaissanceAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group__7__Impl"


    // $ANTLR start "rule__Action__Group__8"
    // InternalGame.g:2802:1: rule__Action__Group__8 : rule__Action__Group__8__Impl rule__Action__Group__9 ;
    public final void rule__Action__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2806:1: ( rule__Action__Group__8__Impl rule__Action__Group__9 )
            // InternalGame.g:2807:2: rule__Action__Group__8__Impl rule__Action__Group__9
            {
            pushFollow(FOLLOW_28);
            rule__Action__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Action__Group__9();

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
    // $ANTLR end "rule__Action__Group__8"


    // $ANTLR start "rule__Action__Group__8__Impl"
    // InternalGame.g:2814:1: rule__Action__Group__8__Impl : ( ( rule__Action__Group_8__0 )? ) ;
    public final void rule__Action__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2818:1: ( ( ( rule__Action__Group_8__0 )? ) )
            // InternalGame.g:2819:1: ( ( rule__Action__Group_8__0 )? )
            {
            // InternalGame.g:2819:1: ( ( rule__Action__Group_8__0 )? )
            // InternalGame.g:2820:2: ( rule__Action__Group_8__0 )?
            {
             before(grammarAccess.getActionAccess().getGroup_8()); 
            // InternalGame.g:2821:2: ( rule__Action__Group_8__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==36) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalGame.g:2821:3: rule__Action__Group_8__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Action__Group_8__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getActionAccess().getGroup_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group__8__Impl"


    // $ANTLR start "rule__Action__Group__9"
    // InternalGame.g:2829:1: rule__Action__Group__9 : rule__Action__Group__9__Impl rule__Action__Group__10 ;
    public final void rule__Action__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2833:1: ( rule__Action__Group__9__Impl rule__Action__Group__10 )
            // InternalGame.g:2834:2: rule__Action__Group__9__Impl rule__Action__Group__10
            {
            pushFollow(FOLLOW_28);
            rule__Action__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Action__Group__10();

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
    // $ANTLR end "rule__Action__Group__9"


    // $ANTLR start "rule__Action__Group__9__Impl"
    // InternalGame.g:2841:1: rule__Action__Group__9__Impl : ( ( rule__Action__ListeObjetsConsommesAssignment_9 )* ) ;
    public final void rule__Action__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2845:1: ( ( ( rule__Action__ListeObjetsConsommesAssignment_9 )* ) )
            // InternalGame.g:2846:1: ( ( rule__Action__ListeObjetsConsommesAssignment_9 )* )
            {
            // InternalGame.g:2846:1: ( ( rule__Action__ListeObjetsConsommesAssignment_9 )* )
            // InternalGame.g:2847:2: ( rule__Action__ListeObjetsConsommesAssignment_9 )*
            {
             before(grammarAccess.getActionAccess().getListeObjetsConsommesAssignment_9()); 
            // InternalGame.g:2848:2: ( rule__Action__ListeObjetsConsommesAssignment_9 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==RULE_ID) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalGame.g:2848:3: rule__Action__ListeObjetsConsommesAssignment_9
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Action__ListeObjetsConsommesAssignment_9();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

             after(grammarAccess.getActionAccess().getListeObjetsConsommesAssignment_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group__9__Impl"


    // $ANTLR start "rule__Action__Group__10"
    // InternalGame.g:2856:1: rule__Action__Group__10 : rule__Action__Group__10__Impl rule__Action__Group__11 ;
    public final void rule__Action__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2860:1: ( rule__Action__Group__10__Impl rule__Action__Group__11 )
            // InternalGame.g:2861:2: rule__Action__Group__10__Impl rule__Action__Group__11
            {
            pushFollow(FOLLOW_28);
            rule__Action__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Action__Group__11();

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
    // $ANTLR end "rule__Action__Group__10"


    // $ANTLR start "rule__Action__Group__10__Impl"
    // InternalGame.g:2868:1: rule__Action__Group__10__Impl : ( ( rule__Action__Group_10__0 )? ) ;
    public final void rule__Action__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2872:1: ( ( ( rule__Action__Group_10__0 )? ) )
            // InternalGame.g:2873:1: ( ( rule__Action__Group_10__0 )? )
            {
            // InternalGame.g:2873:1: ( ( rule__Action__Group_10__0 )? )
            // InternalGame.g:2874:2: ( rule__Action__Group_10__0 )?
            {
             before(grammarAccess.getActionAccess().getGroup_10()); 
            // InternalGame.g:2875:2: ( rule__Action__Group_10__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==37) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalGame.g:2875:3: rule__Action__Group_10__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Action__Group_10__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getActionAccess().getGroup_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group__10__Impl"


    // $ANTLR start "rule__Action__Group__11"
    // InternalGame.g:2883:1: rule__Action__Group__11 : rule__Action__Group__11__Impl ;
    public final void rule__Action__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2887:1: ( rule__Action__Group__11__Impl )
            // InternalGame.g:2888:2: rule__Action__Group__11__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Action__Group__11__Impl();

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
    // $ANTLR end "rule__Action__Group__11"


    // $ANTLR start "rule__Action__Group__11__Impl"
    // InternalGame.g:2894:1: rule__Action__Group__11__Impl : ( '}' ) ;
    public final void rule__Action__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2898:1: ( ( '}' ) )
            // InternalGame.g:2899:1: ( '}' )
            {
            // InternalGame.g:2899:1: ( '}' )
            // InternalGame.g:2900:2: '}'
            {
             before(grammarAccess.getActionAccess().getRightCurlyBracketKeyword_11()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getActionAccess().getRightCurlyBracketKeyword_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group__11__Impl"


    // $ANTLR start "rule__Action__Group_8__0"
    // InternalGame.g:2910:1: rule__Action__Group_8__0 : rule__Action__Group_8__0__Impl rule__Action__Group_8__1 ;
    public final void rule__Action__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2914:1: ( rule__Action__Group_8__0__Impl rule__Action__Group_8__1 )
            // InternalGame.g:2915:2: rule__Action__Group_8__0__Impl rule__Action__Group_8__1
            {
            pushFollow(FOLLOW_16);
            rule__Action__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Action__Group_8__1();

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
    // $ANTLR end "rule__Action__Group_8__0"


    // $ANTLR start "rule__Action__Group_8__0__Impl"
    // InternalGame.g:2922:1: rule__Action__Group_8__0__Impl : ( 'attributionO' ) ;
    public final void rule__Action__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2926:1: ( ( 'attributionO' ) )
            // InternalGame.g:2927:1: ( 'attributionO' )
            {
            // InternalGame.g:2927:1: ( 'attributionO' )
            // InternalGame.g:2928:2: 'attributionO'
            {
             before(grammarAccess.getActionAccess().getAttributionOKeyword_8_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getActionAccess().getAttributionOKeyword_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group_8__0__Impl"


    // $ANTLR start "rule__Action__Group_8__1"
    // InternalGame.g:2937:1: rule__Action__Group_8__1 : rule__Action__Group_8__1__Impl ;
    public final void rule__Action__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2941:1: ( rule__Action__Group_8__1__Impl )
            // InternalGame.g:2942:2: rule__Action__Group_8__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Action__Group_8__1__Impl();

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
    // $ANTLR end "rule__Action__Group_8__1"


    // $ANTLR start "rule__Action__Group_8__1__Impl"
    // InternalGame.g:2948:1: rule__Action__Group_8__1__Impl : ( ( rule__Action__AttributionObjetAssignment_8_1 ) ) ;
    public final void rule__Action__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2952:1: ( ( ( rule__Action__AttributionObjetAssignment_8_1 ) ) )
            // InternalGame.g:2953:1: ( ( rule__Action__AttributionObjetAssignment_8_1 ) )
            {
            // InternalGame.g:2953:1: ( ( rule__Action__AttributionObjetAssignment_8_1 ) )
            // InternalGame.g:2954:2: ( rule__Action__AttributionObjetAssignment_8_1 )
            {
             before(grammarAccess.getActionAccess().getAttributionObjetAssignment_8_1()); 
            // InternalGame.g:2955:2: ( rule__Action__AttributionObjetAssignment_8_1 )
            // InternalGame.g:2955:3: rule__Action__AttributionObjetAssignment_8_1
            {
            pushFollow(FOLLOW_2);
            rule__Action__AttributionObjetAssignment_8_1();

            state._fsp--;


            }

             after(grammarAccess.getActionAccess().getAttributionObjetAssignment_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group_8__1__Impl"


    // $ANTLR start "rule__Action__Group_10__0"
    // InternalGame.g:2964:1: rule__Action__Group_10__0 : rule__Action__Group_10__0__Impl rule__Action__Group_10__1 ;
    public final void rule__Action__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2968:1: ( rule__Action__Group_10__0__Impl rule__Action__Group_10__1 )
            // InternalGame.g:2969:2: rule__Action__Group_10__0__Impl rule__Action__Group_10__1
            {
            pushFollow(FOLLOW_16);
            rule__Action__Group_10__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Action__Group_10__1();

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
    // $ANTLR end "rule__Action__Group_10__0"


    // $ANTLR start "rule__Action__Group_10__0__Impl"
    // InternalGame.g:2976:1: rule__Action__Group_10__0__Impl : ( 'consommationO' ) ;
    public final void rule__Action__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2980:1: ( ( 'consommationO' ) )
            // InternalGame.g:2981:1: ( 'consommationO' )
            {
            // InternalGame.g:2981:1: ( 'consommationO' )
            // InternalGame.g:2982:2: 'consommationO'
            {
             before(grammarAccess.getActionAccess().getConsommationOKeyword_10_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getActionAccess().getConsommationOKeyword_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group_10__0__Impl"


    // $ANTLR start "rule__Action__Group_10__1"
    // InternalGame.g:2991:1: rule__Action__Group_10__1 : rule__Action__Group_10__1__Impl ;
    public final void rule__Action__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2995:1: ( rule__Action__Group_10__1__Impl )
            // InternalGame.g:2996:2: rule__Action__Group_10__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Action__Group_10__1__Impl();

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
    // $ANTLR end "rule__Action__Group_10__1"


    // $ANTLR start "rule__Action__Group_10__1__Impl"
    // InternalGame.g:3002:1: rule__Action__Group_10__1__Impl : ( ( rule__Action__ConsommationObjetAssignment_10_1 ) ) ;
    public final void rule__Action__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3006:1: ( ( ( rule__Action__ConsommationObjetAssignment_10_1 ) ) )
            // InternalGame.g:3007:1: ( ( rule__Action__ConsommationObjetAssignment_10_1 ) )
            {
            // InternalGame.g:3007:1: ( ( rule__Action__ConsommationObjetAssignment_10_1 ) )
            // InternalGame.g:3008:2: ( rule__Action__ConsommationObjetAssignment_10_1 )
            {
             before(grammarAccess.getActionAccess().getConsommationObjetAssignment_10_1()); 
            // InternalGame.g:3009:2: ( rule__Action__ConsommationObjetAssignment_10_1 )
            // InternalGame.g:3009:3: rule__Action__ConsommationObjetAssignment_10_1
            {
            pushFollow(FOLLOW_2);
            rule__Action__ConsommationObjetAssignment_10_1();

            state._fsp--;


            }

             after(grammarAccess.getActionAccess().getConsommationObjetAssignment_10_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group_10__1__Impl"


    // $ANTLR start "rule__ObjetExplorateur__Group__0"
    // InternalGame.g:3018:1: rule__ObjetExplorateur__Group__0 : rule__ObjetExplorateur__Group__0__Impl rule__ObjetExplorateur__Group__1 ;
    public final void rule__ObjetExplorateur__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3022:1: ( rule__ObjetExplorateur__Group__0__Impl rule__ObjetExplorateur__Group__1 )
            // InternalGame.g:3023:2: rule__ObjetExplorateur__Group__0__Impl rule__ObjetExplorateur__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__ObjetExplorateur__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ObjetExplorateur__Group__1();

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
    // $ANTLR end "rule__ObjetExplorateur__Group__0"


    // $ANTLR start "rule__ObjetExplorateur__Group__0__Impl"
    // InternalGame.g:3030:1: rule__ObjetExplorateur__Group__0__Impl : ( ( rule__ObjetExplorateur__NameAssignment_0 ) ) ;
    public final void rule__ObjetExplorateur__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3034:1: ( ( ( rule__ObjetExplorateur__NameAssignment_0 ) ) )
            // InternalGame.g:3035:1: ( ( rule__ObjetExplorateur__NameAssignment_0 ) )
            {
            // InternalGame.g:3035:1: ( ( rule__ObjetExplorateur__NameAssignment_0 ) )
            // InternalGame.g:3036:2: ( rule__ObjetExplorateur__NameAssignment_0 )
            {
             before(grammarAccess.getObjetExplorateurAccess().getNameAssignment_0()); 
            // InternalGame.g:3037:2: ( rule__ObjetExplorateur__NameAssignment_0 )
            // InternalGame.g:3037:3: rule__ObjetExplorateur__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__ObjetExplorateur__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getObjetExplorateurAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjetExplorateur__Group__0__Impl"


    // $ANTLR start "rule__ObjetExplorateur__Group__1"
    // InternalGame.g:3045:1: rule__ObjetExplorateur__Group__1 : rule__ObjetExplorateur__Group__1__Impl rule__ObjetExplorateur__Group__2 ;
    public final void rule__ObjetExplorateur__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3049:1: ( rule__ObjetExplorateur__Group__1__Impl rule__ObjetExplorateur__Group__2 )
            // InternalGame.g:3050:2: rule__ObjetExplorateur__Group__1__Impl rule__ObjetExplorateur__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__ObjetExplorateur__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ObjetExplorateur__Group__2();

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
    // $ANTLR end "rule__ObjetExplorateur__Group__1"


    // $ANTLR start "rule__ObjetExplorateur__Group__1__Impl"
    // InternalGame.g:3057:1: rule__ObjetExplorateur__Group__1__Impl : ( ( rule__ObjetExplorateur__TailleAssignment_1 ) ) ;
    public final void rule__ObjetExplorateur__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3061:1: ( ( ( rule__ObjetExplorateur__TailleAssignment_1 ) ) )
            // InternalGame.g:3062:1: ( ( rule__ObjetExplorateur__TailleAssignment_1 ) )
            {
            // InternalGame.g:3062:1: ( ( rule__ObjetExplorateur__TailleAssignment_1 ) )
            // InternalGame.g:3063:2: ( rule__ObjetExplorateur__TailleAssignment_1 )
            {
             before(grammarAccess.getObjetExplorateurAccess().getTailleAssignment_1()); 
            // InternalGame.g:3064:2: ( rule__ObjetExplorateur__TailleAssignment_1 )
            // InternalGame.g:3064:3: rule__ObjetExplorateur__TailleAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ObjetExplorateur__TailleAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getObjetExplorateurAccess().getTailleAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjetExplorateur__Group__1__Impl"


    // $ANTLR start "rule__ObjetExplorateur__Group__2"
    // InternalGame.g:3072:1: rule__ObjetExplorateur__Group__2 : rule__ObjetExplorateur__Group__2__Impl rule__ObjetExplorateur__Group__3 ;
    public final void rule__ObjetExplorateur__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3076:1: ( rule__ObjetExplorateur__Group__2__Impl rule__ObjetExplorateur__Group__3 )
            // InternalGame.g:3077:2: rule__ObjetExplorateur__Group__2__Impl rule__ObjetExplorateur__Group__3
            {
            pushFollow(FOLLOW_29);
            rule__ObjetExplorateur__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ObjetExplorateur__Group__3();

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
    // $ANTLR end "rule__ObjetExplorateur__Group__2"


    // $ANTLR start "rule__ObjetExplorateur__Group__2__Impl"
    // InternalGame.g:3084:1: rule__ObjetExplorateur__Group__2__Impl : ( ( rule__ObjetExplorateur__QuantiteAssignment_2 ) ) ;
    public final void rule__ObjetExplorateur__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3088:1: ( ( ( rule__ObjetExplorateur__QuantiteAssignment_2 ) ) )
            // InternalGame.g:3089:1: ( ( rule__ObjetExplorateur__QuantiteAssignment_2 ) )
            {
            // InternalGame.g:3089:1: ( ( rule__ObjetExplorateur__QuantiteAssignment_2 ) )
            // InternalGame.g:3090:2: ( rule__ObjetExplorateur__QuantiteAssignment_2 )
            {
             before(grammarAccess.getObjetExplorateurAccess().getQuantiteAssignment_2()); 
            // InternalGame.g:3091:2: ( rule__ObjetExplorateur__QuantiteAssignment_2 )
            // InternalGame.g:3091:3: rule__ObjetExplorateur__QuantiteAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ObjetExplorateur__QuantiteAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getObjetExplorateurAccess().getQuantiteAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjetExplorateur__Group__2__Impl"


    // $ANTLR start "rule__ObjetExplorateur__Group__3"
    // InternalGame.g:3099:1: rule__ObjetExplorateur__Group__3 : rule__ObjetExplorateur__Group__3__Impl rule__ObjetExplorateur__Group__4 ;
    public final void rule__ObjetExplorateur__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3103:1: ( rule__ObjetExplorateur__Group__3__Impl rule__ObjetExplorateur__Group__4 )
            // InternalGame.g:3104:2: rule__ObjetExplorateur__Group__3__Impl rule__ObjetExplorateur__Group__4
            {
            pushFollow(FOLLOW_29);
            rule__ObjetExplorateur__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ObjetExplorateur__Group__4();

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
    // $ANTLR end "rule__ObjetExplorateur__Group__3"


    // $ANTLR start "rule__ObjetExplorateur__Group__3__Impl"
    // InternalGame.g:3111:1: rule__ObjetExplorateur__Group__3__Impl : ( ( rule__ObjetExplorateur__Group_3__0 )? ) ;
    public final void rule__ObjetExplorateur__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3115:1: ( ( ( rule__ObjetExplorateur__Group_3__0 )? ) )
            // InternalGame.g:3116:1: ( ( rule__ObjetExplorateur__Group_3__0 )? )
            {
            // InternalGame.g:3116:1: ( ( rule__ObjetExplorateur__Group_3__0 )? )
            // InternalGame.g:3117:2: ( rule__ObjetExplorateur__Group_3__0 )?
            {
             before(grammarAccess.getObjetExplorateurAccess().getGroup_3()); 
            // InternalGame.g:3118:2: ( rule__ObjetExplorateur__Group_3__0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==23) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalGame.g:3118:3: rule__ObjetExplorateur__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ObjetExplorateur__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getObjetExplorateurAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjetExplorateur__Group__3__Impl"


    // $ANTLR start "rule__ObjetExplorateur__Group__4"
    // InternalGame.g:3126:1: rule__ObjetExplorateur__Group__4 : rule__ObjetExplorateur__Group__4__Impl ;
    public final void rule__ObjetExplorateur__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3130:1: ( rule__ObjetExplorateur__Group__4__Impl )
            // InternalGame.g:3131:2: rule__ObjetExplorateur__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ObjetExplorateur__Group__4__Impl();

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
    // $ANTLR end "rule__ObjetExplorateur__Group__4"


    // $ANTLR start "rule__ObjetExplorateur__Group__4__Impl"
    // InternalGame.g:3137:1: rule__ObjetExplorateur__Group__4__Impl : ( ( rule__ObjetExplorateur__Group_4__0 )? ) ;
    public final void rule__ObjetExplorateur__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3141:1: ( ( ( rule__ObjetExplorateur__Group_4__0 )? ) )
            // InternalGame.g:3142:1: ( ( rule__ObjetExplorateur__Group_4__0 )? )
            {
            // InternalGame.g:3142:1: ( ( rule__ObjetExplorateur__Group_4__0 )? )
            // InternalGame.g:3143:2: ( rule__ObjetExplorateur__Group_4__0 )?
            {
             before(grammarAccess.getObjetExplorateurAccess().getGroup_4()); 
            // InternalGame.g:3144:2: ( rule__ObjetExplorateur__Group_4__0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==38) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalGame.g:3144:3: rule__ObjetExplorateur__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ObjetExplorateur__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getObjetExplorateurAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjetExplorateur__Group__4__Impl"


    // $ANTLR start "rule__ObjetExplorateur__Group_3__0"
    // InternalGame.g:3153:1: rule__ObjetExplorateur__Group_3__0 : rule__ObjetExplorateur__Group_3__0__Impl rule__ObjetExplorateur__Group_3__1 ;
    public final void rule__ObjetExplorateur__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3157:1: ( rule__ObjetExplorateur__Group_3__0__Impl rule__ObjetExplorateur__Group_3__1 )
            // InternalGame.g:3158:2: rule__ObjetExplorateur__Group_3__0__Impl rule__ObjetExplorateur__Group_3__1
            {
            pushFollow(FOLLOW_15);
            rule__ObjetExplorateur__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ObjetExplorateur__Group_3__1();

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
    // $ANTLR end "rule__ObjetExplorateur__Group_3__0"


    // $ANTLR start "rule__ObjetExplorateur__Group_3__0__Impl"
    // InternalGame.g:3165:1: rule__ObjetExplorateur__Group_3__0__Impl : ( 'description' ) ;
    public final void rule__ObjetExplorateur__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3169:1: ( ( 'description' ) )
            // InternalGame.g:3170:1: ( 'description' )
            {
            // InternalGame.g:3170:1: ( 'description' )
            // InternalGame.g:3171:2: 'description'
            {
             before(grammarAccess.getObjetExplorateurAccess().getDescriptionKeyword_3_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getObjetExplorateurAccess().getDescriptionKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjetExplorateur__Group_3__0__Impl"


    // $ANTLR start "rule__ObjetExplorateur__Group_3__1"
    // InternalGame.g:3180:1: rule__ObjetExplorateur__Group_3__1 : rule__ObjetExplorateur__Group_3__1__Impl rule__ObjetExplorateur__Group_3__2 ;
    public final void rule__ObjetExplorateur__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3184:1: ( rule__ObjetExplorateur__Group_3__1__Impl rule__ObjetExplorateur__Group_3__2 )
            // InternalGame.g:3185:2: rule__ObjetExplorateur__Group_3__1__Impl rule__ObjetExplorateur__Group_3__2
            {
            pushFollow(FOLLOW_16);
            rule__ObjetExplorateur__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ObjetExplorateur__Group_3__2();

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
    // $ANTLR end "rule__ObjetExplorateur__Group_3__1"


    // $ANTLR start "rule__ObjetExplorateur__Group_3__1__Impl"
    // InternalGame.g:3192:1: rule__ObjetExplorateur__Group_3__1__Impl : ( ( rule__ObjetExplorateur__DescriptionAssignment_3_1 ) ) ;
    public final void rule__ObjetExplorateur__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3196:1: ( ( ( rule__ObjetExplorateur__DescriptionAssignment_3_1 ) ) )
            // InternalGame.g:3197:1: ( ( rule__ObjetExplorateur__DescriptionAssignment_3_1 ) )
            {
            // InternalGame.g:3197:1: ( ( rule__ObjetExplorateur__DescriptionAssignment_3_1 ) )
            // InternalGame.g:3198:2: ( rule__ObjetExplorateur__DescriptionAssignment_3_1 )
            {
             before(grammarAccess.getObjetExplorateurAccess().getDescriptionAssignment_3_1()); 
            // InternalGame.g:3199:2: ( rule__ObjetExplorateur__DescriptionAssignment_3_1 )
            // InternalGame.g:3199:3: rule__ObjetExplorateur__DescriptionAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__ObjetExplorateur__DescriptionAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getObjetExplorateurAccess().getDescriptionAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjetExplorateur__Group_3__1__Impl"


    // $ANTLR start "rule__ObjetExplorateur__Group_3__2"
    // InternalGame.g:3207:1: rule__ObjetExplorateur__Group_3__2 : rule__ObjetExplorateur__Group_3__2__Impl ;
    public final void rule__ObjetExplorateur__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3211:1: ( rule__ObjetExplorateur__Group_3__2__Impl )
            // InternalGame.g:3212:2: rule__ObjetExplorateur__Group_3__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ObjetExplorateur__Group_3__2__Impl();

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
    // $ANTLR end "rule__ObjetExplorateur__Group_3__2"


    // $ANTLR start "rule__ObjetExplorateur__Group_3__2__Impl"
    // InternalGame.g:3218:1: rule__ObjetExplorateur__Group_3__2__Impl : ( ( rule__ObjetExplorateur__ConditionDescriptionAssignment_3_2 )? ) ;
    public final void rule__ObjetExplorateur__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3222:1: ( ( ( rule__ObjetExplorateur__ConditionDescriptionAssignment_3_2 )? ) )
            // InternalGame.g:3223:1: ( ( rule__ObjetExplorateur__ConditionDescriptionAssignment_3_2 )? )
            {
            // InternalGame.g:3223:1: ( ( rule__ObjetExplorateur__ConditionDescriptionAssignment_3_2 )? )
            // InternalGame.g:3224:2: ( rule__ObjetExplorateur__ConditionDescriptionAssignment_3_2 )?
            {
             before(grammarAccess.getObjetExplorateurAccess().getConditionDescriptionAssignment_3_2()); 
            // InternalGame.g:3225:2: ( rule__ObjetExplorateur__ConditionDescriptionAssignment_3_2 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==43) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalGame.g:3225:3: rule__ObjetExplorateur__ConditionDescriptionAssignment_3_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__ObjetExplorateur__ConditionDescriptionAssignment_3_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getObjetExplorateurAccess().getConditionDescriptionAssignment_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjetExplorateur__Group_3__2__Impl"


    // $ANTLR start "rule__ObjetExplorateur__Group_4__0"
    // InternalGame.g:3234:1: rule__ObjetExplorateur__Group_4__0 : rule__ObjetExplorateur__Group_4__0__Impl rule__ObjetExplorateur__Group_4__1 ;
    public final void rule__ObjetExplorateur__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3238:1: ( rule__ObjetExplorateur__Group_4__0__Impl rule__ObjetExplorateur__Group_4__1 )
            // InternalGame.g:3239:2: rule__ObjetExplorateur__Group_4__0__Impl rule__ObjetExplorateur__Group_4__1
            {
            pushFollow(FOLLOW_16);
            rule__ObjetExplorateur__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ObjetExplorateur__Group_4__1();

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
    // $ANTLR end "rule__ObjetExplorateur__Group_4__0"


    // $ANTLR start "rule__ObjetExplorateur__Group_4__0__Impl"
    // InternalGame.g:3246:1: rule__ObjetExplorateur__Group_4__0__Impl : ( 'transformable' ) ;
    public final void rule__ObjetExplorateur__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3250:1: ( ( 'transformable' ) )
            // InternalGame.g:3251:1: ( 'transformable' )
            {
            // InternalGame.g:3251:1: ( 'transformable' )
            // InternalGame.g:3252:2: 'transformable'
            {
             before(grammarAccess.getObjetExplorateurAccess().getTransformableKeyword_4_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getObjetExplorateurAccess().getTransformableKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjetExplorateur__Group_4__0__Impl"


    // $ANTLR start "rule__ObjetExplorateur__Group_4__1"
    // InternalGame.g:3261:1: rule__ObjetExplorateur__Group_4__1 : rule__ObjetExplorateur__Group_4__1__Impl ;
    public final void rule__ObjetExplorateur__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3265:1: ( rule__ObjetExplorateur__Group_4__1__Impl )
            // InternalGame.g:3266:2: rule__ObjetExplorateur__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ObjetExplorateur__Group_4__1__Impl();

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
    // $ANTLR end "rule__ObjetExplorateur__Group_4__1"


    // $ANTLR start "rule__ObjetExplorateur__Group_4__1__Impl"
    // InternalGame.g:3272:1: rule__ObjetExplorateur__Group_4__1__Impl : ( ( rule__ObjetExplorateur__TransformableAssignment_4_1 )? ) ;
    public final void rule__ObjetExplorateur__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3276:1: ( ( ( rule__ObjetExplorateur__TransformableAssignment_4_1 )? ) )
            // InternalGame.g:3277:1: ( ( rule__ObjetExplorateur__TransformableAssignment_4_1 )? )
            {
            // InternalGame.g:3277:1: ( ( rule__ObjetExplorateur__TransformableAssignment_4_1 )? )
            // InternalGame.g:3278:2: ( rule__ObjetExplorateur__TransformableAssignment_4_1 )?
            {
             before(grammarAccess.getObjetExplorateurAccess().getTransformableAssignment_4_1()); 
            // InternalGame.g:3279:2: ( rule__ObjetExplorateur__TransformableAssignment_4_1 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==43) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalGame.g:3279:3: rule__ObjetExplorateur__TransformableAssignment_4_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__ObjetExplorateur__TransformableAssignment_4_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getObjetExplorateurAccess().getTransformableAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjetExplorateur__Group_4__1__Impl"


    // $ANTLR start "rule__ObjetLieu__Group__0"
    // InternalGame.g:3288:1: rule__ObjetLieu__Group__0 : rule__ObjetLieu__Group__0__Impl rule__ObjetLieu__Group__1 ;
    public final void rule__ObjetLieu__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3292:1: ( rule__ObjetLieu__Group__0__Impl rule__ObjetLieu__Group__1 )
            // InternalGame.g:3293:2: rule__ObjetLieu__Group__0__Impl rule__ObjetLieu__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__ObjetLieu__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ObjetLieu__Group__1();

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
    // $ANTLR end "rule__ObjetLieu__Group__0"


    // $ANTLR start "rule__ObjetLieu__Group__0__Impl"
    // InternalGame.g:3300:1: rule__ObjetLieu__Group__0__Impl : ( ( rule__ObjetLieu__NameAssignment_0 ) ) ;
    public final void rule__ObjetLieu__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3304:1: ( ( ( rule__ObjetLieu__NameAssignment_0 ) ) )
            // InternalGame.g:3305:1: ( ( rule__ObjetLieu__NameAssignment_0 ) )
            {
            // InternalGame.g:3305:1: ( ( rule__ObjetLieu__NameAssignment_0 ) )
            // InternalGame.g:3306:2: ( rule__ObjetLieu__NameAssignment_0 )
            {
             before(grammarAccess.getObjetLieuAccess().getNameAssignment_0()); 
            // InternalGame.g:3307:2: ( rule__ObjetLieu__NameAssignment_0 )
            // InternalGame.g:3307:3: rule__ObjetLieu__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__ObjetLieu__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getObjetLieuAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjetLieu__Group__0__Impl"


    // $ANTLR start "rule__ObjetLieu__Group__1"
    // InternalGame.g:3315:1: rule__ObjetLieu__Group__1 : rule__ObjetLieu__Group__1__Impl rule__ObjetLieu__Group__2 ;
    public final void rule__ObjetLieu__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3319:1: ( rule__ObjetLieu__Group__1__Impl rule__ObjetLieu__Group__2 )
            // InternalGame.g:3320:2: rule__ObjetLieu__Group__1__Impl rule__ObjetLieu__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__ObjetLieu__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ObjetLieu__Group__2();

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
    // $ANTLR end "rule__ObjetLieu__Group__1"


    // $ANTLR start "rule__ObjetLieu__Group__1__Impl"
    // InternalGame.g:3327:1: rule__ObjetLieu__Group__1__Impl : ( ( rule__ObjetLieu__TailleAssignment_1 ) ) ;
    public final void rule__ObjetLieu__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3331:1: ( ( ( rule__ObjetLieu__TailleAssignment_1 ) ) )
            // InternalGame.g:3332:1: ( ( rule__ObjetLieu__TailleAssignment_1 ) )
            {
            // InternalGame.g:3332:1: ( ( rule__ObjetLieu__TailleAssignment_1 ) )
            // InternalGame.g:3333:2: ( rule__ObjetLieu__TailleAssignment_1 )
            {
             before(grammarAccess.getObjetLieuAccess().getTailleAssignment_1()); 
            // InternalGame.g:3334:2: ( rule__ObjetLieu__TailleAssignment_1 )
            // InternalGame.g:3334:3: rule__ObjetLieu__TailleAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ObjetLieu__TailleAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getObjetLieuAccess().getTailleAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjetLieu__Group__1__Impl"


    // $ANTLR start "rule__ObjetLieu__Group__2"
    // InternalGame.g:3342:1: rule__ObjetLieu__Group__2 : rule__ObjetLieu__Group__2__Impl rule__ObjetLieu__Group__3 ;
    public final void rule__ObjetLieu__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3346:1: ( rule__ObjetLieu__Group__2__Impl rule__ObjetLieu__Group__3 )
            // InternalGame.g:3347:2: rule__ObjetLieu__Group__2__Impl rule__ObjetLieu__Group__3
            {
            pushFollow(FOLLOW_30);
            rule__ObjetLieu__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ObjetLieu__Group__3();

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
    // $ANTLR end "rule__ObjetLieu__Group__2"


    // $ANTLR start "rule__ObjetLieu__Group__2__Impl"
    // InternalGame.g:3354:1: rule__ObjetLieu__Group__2__Impl : ( ( rule__ObjetLieu__QuantiteAssignment_2 ) ) ;
    public final void rule__ObjetLieu__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3358:1: ( ( ( rule__ObjetLieu__QuantiteAssignment_2 ) ) )
            // InternalGame.g:3359:1: ( ( rule__ObjetLieu__QuantiteAssignment_2 ) )
            {
            // InternalGame.g:3359:1: ( ( rule__ObjetLieu__QuantiteAssignment_2 ) )
            // InternalGame.g:3360:2: ( rule__ObjetLieu__QuantiteAssignment_2 )
            {
             before(grammarAccess.getObjetLieuAccess().getQuantiteAssignment_2()); 
            // InternalGame.g:3361:2: ( rule__ObjetLieu__QuantiteAssignment_2 )
            // InternalGame.g:3361:3: rule__ObjetLieu__QuantiteAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ObjetLieu__QuantiteAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getObjetLieuAccess().getQuantiteAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjetLieu__Group__2__Impl"


    // $ANTLR start "rule__ObjetLieu__Group__3"
    // InternalGame.g:3369:1: rule__ObjetLieu__Group__3 : rule__ObjetLieu__Group__3__Impl rule__ObjetLieu__Group__4 ;
    public final void rule__ObjetLieu__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3373:1: ( rule__ObjetLieu__Group__3__Impl rule__ObjetLieu__Group__4 )
            // InternalGame.g:3374:2: rule__ObjetLieu__Group__3__Impl rule__ObjetLieu__Group__4
            {
            pushFollow(FOLLOW_30);
            rule__ObjetLieu__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ObjetLieu__Group__4();

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
    // $ANTLR end "rule__ObjetLieu__Group__3"


    // $ANTLR start "rule__ObjetLieu__Group__3__Impl"
    // InternalGame.g:3381:1: rule__ObjetLieu__Group__3__Impl : ( ( rule__ObjetLieu__Group_3__0 )? ) ;
    public final void rule__ObjetLieu__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3385:1: ( ( ( rule__ObjetLieu__Group_3__0 )? ) )
            // InternalGame.g:3386:1: ( ( rule__ObjetLieu__Group_3__0 )? )
            {
            // InternalGame.g:3386:1: ( ( rule__ObjetLieu__Group_3__0 )? )
            // InternalGame.g:3387:2: ( rule__ObjetLieu__Group_3__0 )?
            {
             before(grammarAccess.getObjetLieuAccess().getGroup_3()); 
            // InternalGame.g:3388:2: ( rule__ObjetLieu__Group_3__0 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==39) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalGame.g:3388:3: rule__ObjetLieu__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ObjetLieu__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getObjetLieuAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjetLieu__Group__3__Impl"


    // $ANTLR start "rule__ObjetLieu__Group__4"
    // InternalGame.g:3396:1: rule__ObjetLieu__Group__4 : rule__ObjetLieu__Group__4__Impl rule__ObjetLieu__Group__5 ;
    public final void rule__ObjetLieu__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3400:1: ( rule__ObjetLieu__Group__4__Impl rule__ObjetLieu__Group__5 )
            // InternalGame.g:3401:2: rule__ObjetLieu__Group__4__Impl rule__ObjetLieu__Group__5
            {
            pushFollow(FOLLOW_30);
            rule__ObjetLieu__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ObjetLieu__Group__5();

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
    // $ANTLR end "rule__ObjetLieu__Group__4"


    // $ANTLR start "rule__ObjetLieu__Group__4__Impl"
    // InternalGame.g:3408:1: rule__ObjetLieu__Group__4__Impl : ( ( rule__ObjetLieu__Group_4__0 )? ) ;
    public final void rule__ObjetLieu__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3412:1: ( ( ( rule__ObjetLieu__Group_4__0 )? ) )
            // InternalGame.g:3413:1: ( ( rule__ObjetLieu__Group_4__0 )? )
            {
            // InternalGame.g:3413:1: ( ( rule__ObjetLieu__Group_4__0 )? )
            // InternalGame.g:3414:2: ( rule__ObjetLieu__Group_4__0 )?
            {
             before(grammarAccess.getObjetLieuAccess().getGroup_4()); 
            // InternalGame.g:3415:2: ( rule__ObjetLieu__Group_4__0 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==40) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalGame.g:3415:3: rule__ObjetLieu__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ObjetLieu__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getObjetLieuAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjetLieu__Group__4__Impl"


    // $ANTLR start "rule__ObjetLieu__Group__5"
    // InternalGame.g:3423:1: rule__ObjetLieu__Group__5 : rule__ObjetLieu__Group__5__Impl rule__ObjetLieu__Group__6 ;
    public final void rule__ObjetLieu__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3427:1: ( rule__ObjetLieu__Group__5__Impl rule__ObjetLieu__Group__6 )
            // InternalGame.g:3428:2: rule__ObjetLieu__Group__5__Impl rule__ObjetLieu__Group__6
            {
            pushFollow(FOLLOW_30);
            rule__ObjetLieu__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ObjetLieu__Group__6();

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
    // $ANTLR end "rule__ObjetLieu__Group__5"


    // $ANTLR start "rule__ObjetLieu__Group__5__Impl"
    // InternalGame.g:3435:1: rule__ObjetLieu__Group__5__Impl : ( ( rule__ObjetLieu__Group_5__0 )? ) ;
    public final void rule__ObjetLieu__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3439:1: ( ( ( rule__ObjetLieu__Group_5__0 )? ) )
            // InternalGame.g:3440:1: ( ( rule__ObjetLieu__Group_5__0 )? )
            {
            // InternalGame.g:3440:1: ( ( rule__ObjetLieu__Group_5__0 )? )
            // InternalGame.g:3441:2: ( rule__ObjetLieu__Group_5__0 )?
            {
             before(grammarAccess.getObjetLieuAccess().getGroup_5()); 
            // InternalGame.g:3442:2: ( rule__ObjetLieu__Group_5__0 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==23) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalGame.g:3442:3: rule__ObjetLieu__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ObjetLieu__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getObjetLieuAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjetLieu__Group__5__Impl"


    // $ANTLR start "rule__ObjetLieu__Group__6"
    // InternalGame.g:3450:1: rule__ObjetLieu__Group__6 : rule__ObjetLieu__Group__6__Impl ;
    public final void rule__ObjetLieu__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3454:1: ( rule__ObjetLieu__Group__6__Impl )
            // InternalGame.g:3455:2: rule__ObjetLieu__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ObjetLieu__Group__6__Impl();

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
    // $ANTLR end "rule__ObjetLieu__Group__6"


    // $ANTLR start "rule__ObjetLieu__Group__6__Impl"
    // InternalGame.g:3461:1: rule__ObjetLieu__Group__6__Impl : ( ( rule__ObjetLieu__Group_6__0 )? ) ;
    public final void rule__ObjetLieu__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3465:1: ( ( ( rule__ObjetLieu__Group_6__0 )? ) )
            // InternalGame.g:3466:1: ( ( rule__ObjetLieu__Group_6__0 )? )
            {
            // InternalGame.g:3466:1: ( ( rule__ObjetLieu__Group_6__0 )? )
            // InternalGame.g:3467:2: ( rule__ObjetLieu__Group_6__0 )?
            {
             before(grammarAccess.getObjetLieuAccess().getGroup_6()); 
            // InternalGame.g:3468:2: ( rule__ObjetLieu__Group_6__0 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==38) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalGame.g:3468:3: rule__ObjetLieu__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ObjetLieu__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getObjetLieuAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjetLieu__Group__6__Impl"


    // $ANTLR start "rule__ObjetLieu__Group_3__0"
    // InternalGame.g:3477:1: rule__ObjetLieu__Group_3__0 : rule__ObjetLieu__Group_3__0__Impl rule__ObjetLieu__Group_3__1 ;
    public final void rule__ObjetLieu__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3481:1: ( rule__ObjetLieu__Group_3__0__Impl rule__ObjetLieu__Group_3__1 )
            // InternalGame.g:3482:2: rule__ObjetLieu__Group_3__0__Impl rule__ObjetLieu__Group_3__1
            {
            pushFollow(FOLLOW_16);
            rule__ObjetLieu__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ObjetLieu__Group_3__1();

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
    // $ANTLR end "rule__ObjetLieu__Group_3__0"


    // $ANTLR start "rule__ObjetLieu__Group_3__0__Impl"
    // InternalGame.g:3489:1: rule__ObjetLieu__Group_3__0__Impl : ( 'transmission' ) ;
    public final void rule__ObjetLieu__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3493:1: ( ( 'transmission' ) )
            // InternalGame.g:3494:1: ( 'transmission' )
            {
            // InternalGame.g:3494:1: ( 'transmission' )
            // InternalGame.g:3495:2: 'transmission'
            {
             before(grammarAccess.getObjetLieuAccess().getTransmissionKeyword_3_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getObjetLieuAccess().getTransmissionKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjetLieu__Group_3__0__Impl"


    // $ANTLR start "rule__ObjetLieu__Group_3__1"
    // InternalGame.g:3504:1: rule__ObjetLieu__Group_3__1 : rule__ObjetLieu__Group_3__1__Impl ;
    public final void rule__ObjetLieu__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3508:1: ( rule__ObjetLieu__Group_3__1__Impl )
            // InternalGame.g:3509:2: rule__ObjetLieu__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ObjetLieu__Group_3__1__Impl();

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
    // $ANTLR end "rule__ObjetLieu__Group_3__1"


    // $ANTLR start "rule__ObjetLieu__Group_3__1__Impl"
    // InternalGame.g:3515:1: rule__ObjetLieu__Group_3__1__Impl : ( ( rule__ObjetLieu__ConditionTransmissionAssignment_3_1 )? ) ;
    public final void rule__ObjetLieu__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3519:1: ( ( ( rule__ObjetLieu__ConditionTransmissionAssignment_3_1 )? ) )
            // InternalGame.g:3520:1: ( ( rule__ObjetLieu__ConditionTransmissionAssignment_3_1 )? )
            {
            // InternalGame.g:3520:1: ( ( rule__ObjetLieu__ConditionTransmissionAssignment_3_1 )? )
            // InternalGame.g:3521:2: ( rule__ObjetLieu__ConditionTransmissionAssignment_3_1 )?
            {
             before(grammarAccess.getObjetLieuAccess().getConditionTransmissionAssignment_3_1()); 
            // InternalGame.g:3522:2: ( rule__ObjetLieu__ConditionTransmissionAssignment_3_1 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==43) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalGame.g:3522:3: rule__ObjetLieu__ConditionTransmissionAssignment_3_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__ObjetLieu__ConditionTransmissionAssignment_3_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getObjetLieuAccess().getConditionTransmissionAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjetLieu__Group_3__1__Impl"


    // $ANTLR start "rule__ObjetLieu__Group_4__0"
    // InternalGame.g:3531:1: rule__ObjetLieu__Group_4__0 : rule__ObjetLieu__Group_4__0__Impl rule__ObjetLieu__Group_4__1 ;
    public final void rule__ObjetLieu__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3535:1: ( rule__ObjetLieu__Group_4__0__Impl rule__ObjetLieu__Group_4__1 )
            // InternalGame.g:3536:2: rule__ObjetLieu__Group_4__0__Impl rule__ObjetLieu__Group_4__1
            {
            pushFollow(FOLLOW_16);
            rule__ObjetLieu__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ObjetLieu__Group_4__1();

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
    // $ANTLR end "rule__ObjetLieu__Group_4__0"


    // $ANTLR start "rule__ObjetLieu__Group_4__0__Impl"
    // InternalGame.g:3543:1: rule__ObjetLieu__Group_4__0__Impl : ( 'consommation' ) ;
    public final void rule__ObjetLieu__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3547:1: ( ( 'consommation' ) )
            // InternalGame.g:3548:1: ( 'consommation' )
            {
            // InternalGame.g:3548:1: ( 'consommation' )
            // InternalGame.g:3549:2: 'consommation'
            {
             before(grammarAccess.getObjetLieuAccess().getConsommationKeyword_4_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getObjetLieuAccess().getConsommationKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjetLieu__Group_4__0__Impl"


    // $ANTLR start "rule__ObjetLieu__Group_4__1"
    // InternalGame.g:3558:1: rule__ObjetLieu__Group_4__1 : rule__ObjetLieu__Group_4__1__Impl ;
    public final void rule__ObjetLieu__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3562:1: ( rule__ObjetLieu__Group_4__1__Impl )
            // InternalGame.g:3563:2: rule__ObjetLieu__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ObjetLieu__Group_4__1__Impl();

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
    // $ANTLR end "rule__ObjetLieu__Group_4__1"


    // $ANTLR start "rule__ObjetLieu__Group_4__1__Impl"
    // InternalGame.g:3569:1: rule__ObjetLieu__Group_4__1__Impl : ( ( rule__ObjetLieu__ConditionConsommationAssignment_4_1 )? ) ;
    public final void rule__ObjetLieu__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3573:1: ( ( ( rule__ObjetLieu__ConditionConsommationAssignment_4_1 )? ) )
            // InternalGame.g:3574:1: ( ( rule__ObjetLieu__ConditionConsommationAssignment_4_1 )? )
            {
            // InternalGame.g:3574:1: ( ( rule__ObjetLieu__ConditionConsommationAssignment_4_1 )? )
            // InternalGame.g:3575:2: ( rule__ObjetLieu__ConditionConsommationAssignment_4_1 )?
            {
             before(grammarAccess.getObjetLieuAccess().getConditionConsommationAssignment_4_1()); 
            // InternalGame.g:3576:2: ( rule__ObjetLieu__ConditionConsommationAssignment_4_1 )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==43) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalGame.g:3576:3: rule__ObjetLieu__ConditionConsommationAssignment_4_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__ObjetLieu__ConditionConsommationAssignment_4_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getObjetLieuAccess().getConditionConsommationAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjetLieu__Group_4__1__Impl"


    // $ANTLR start "rule__ObjetLieu__Group_5__0"
    // InternalGame.g:3585:1: rule__ObjetLieu__Group_5__0 : rule__ObjetLieu__Group_5__0__Impl rule__ObjetLieu__Group_5__1 ;
    public final void rule__ObjetLieu__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3589:1: ( rule__ObjetLieu__Group_5__0__Impl rule__ObjetLieu__Group_5__1 )
            // InternalGame.g:3590:2: rule__ObjetLieu__Group_5__0__Impl rule__ObjetLieu__Group_5__1
            {
            pushFollow(FOLLOW_15);
            rule__ObjetLieu__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ObjetLieu__Group_5__1();

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
    // $ANTLR end "rule__ObjetLieu__Group_5__0"


    // $ANTLR start "rule__ObjetLieu__Group_5__0__Impl"
    // InternalGame.g:3597:1: rule__ObjetLieu__Group_5__0__Impl : ( 'description' ) ;
    public final void rule__ObjetLieu__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3601:1: ( ( 'description' ) )
            // InternalGame.g:3602:1: ( 'description' )
            {
            // InternalGame.g:3602:1: ( 'description' )
            // InternalGame.g:3603:2: 'description'
            {
             before(grammarAccess.getObjetLieuAccess().getDescriptionKeyword_5_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getObjetLieuAccess().getDescriptionKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjetLieu__Group_5__0__Impl"


    // $ANTLR start "rule__ObjetLieu__Group_5__1"
    // InternalGame.g:3612:1: rule__ObjetLieu__Group_5__1 : rule__ObjetLieu__Group_5__1__Impl rule__ObjetLieu__Group_5__2 ;
    public final void rule__ObjetLieu__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3616:1: ( rule__ObjetLieu__Group_5__1__Impl rule__ObjetLieu__Group_5__2 )
            // InternalGame.g:3617:2: rule__ObjetLieu__Group_5__1__Impl rule__ObjetLieu__Group_5__2
            {
            pushFollow(FOLLOW_16);
            rule__ObjetLieu__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ObjetLieu__Group_5__2();

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
    // $ANTLR end "rule__ObjetLieu__Group_5__1"


    // $ANTLR start "rule__ObjetLieu__Group_5__1__Impl"
    // InternalGame.g:3624:1: rule__ObjetLieu__Group_5__1__Impl : ( ( rule__ObjetLieu__DescriptionAssignment_5_1 ) ) ;
    public final void rule__ObjetLieu__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3628:1: ( ( ( rule__ObjetLieu__DescriptionAssignment_5_1 ) ) )
            // InternalGame.g:3629:1: ( ( rule__ObjetLieu__DescriptionAssignment_5_1 ) )
            {
            // InternalGame.g:3629:1: ( ( rule__ObjetLieu__DescriptionAssignment_5_1 ) )
            // InternalGame.g:3630:2: ( rule__ObjetLieu__DescriptionAssignment_5_1 )
            {
             before(grammarAccess.getObjetLieuAccess().getDescriptionAssignment_5_1()); 
            // InternalGame.g:3631:2: ( rule__ObjetLieu__DescriptionAssignment_5_1 )
            // InternalGame.g:3631:3: rule__ObjetLieu__DescriptionAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__ObjetLieu__DescriptionAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getObjetLieuAccess().getDescriptionAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjetLieu__Group_5__1__Impl"


    // $ANTLR start "rule__ObjetLieu__Group_5__2"
    // InternalGame.g:3639:1: rule__ObjetLieu__Group_5__2 : rule__ObjetLieu__Group_5__2__Impl ;
    public final void rule__ObjetLieu__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3643:1: ( rule__ObjetLieu__Group_5__2__Impl )
            // InternalGame.g:3644:2: rule__ObjetLieu__Group_5__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ObjetLieu__Group_5__2__Impl();

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
    // $ANTLR end "rule__ObjetLieu__Group_5__2"


    // $ANTLR start "rule__ObjetLieu__Group_5__2__Impl"
    // InternalGame.g:3650:1: rule__ObjetLieu__Group_5__2__Impl : ( ( rule__ObjetLieu__ConditionDescriptionAssignment_5_2 )? ) ;
    public final void rule__ObjetLieu__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3654:1: ( ( ( rule__ObjetLieu__ConditionDescriptionAssignment_5_2 )? ) )
            // InternalGame.g:3655:1: ( ( rule__ObjetLieu__ConditionDescriptionAssignment_5_2 )? )
            {
            // InternalGame.g:3655:1: ( ( rule__ObjetLieu__ConditionDescriptionAssignment_5_2 )? )
            // InternalGame.g:3656:2: ( rule__ObjetLieu__ConditionDescriptionAssignment_5_2 )?
            {
             before(grammarAccess.getObjetLieuAccess().getConditionDescriptionAssignment_5_2()); 
            // InternalGame.g:3657:2: ( rule__ObjetLieu__ConditionDescriptionAssignment_5_2 )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==43) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalGame.g:3657:3: rule__ObjetLieu__ConditionDescriptionAssignment_5_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__ObjetLieu__ConditionDescriptionAssignment_5_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getObjetLieuAccess().getConditionDescriptionAssignment_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjetLieu__Group_5__2__Impl"


    // $ANTLR start "rule__ObjetLieu__Group_6__0"
    // InternalGame.g:3666:1: rule__ObjetLieu__Group_6__0 : rule__ObjetLieu__Group_6__0__Impl rule__ObjetLieu__Group_6__1 ;
    public final void rule__ObjetLieu__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3670:1: ( rule__ObjetLieu__Group_6__0__Impl rule__ObjetLieu__Group_6__1 )
            // InternalGame.g:3671:2: rule__ObjetLieu__Group_6__0__Impl rule__ObjetLieu__Group_6__1
            {
            pushFollow(FOLLOW_16);
            rule__ObjetLieu__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ObjetLieu__Group_6__1();

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
    // $ANTLR end "rule__ObjetLieu__Group_6__0"


    // $ANTLR start "rule__ObjetLieu__Group_6__0__Impl"
    // InternalGame.g:3678:1: rule__ObjetLieu__Group_6__0__Impl : ( 'transformable' ) ;
    public final void rule__ObjetLieu__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3682:1: ( ( 'transformable' ) )
            // InternalGame.g:3683:1: ( 'transformable' )
            {
            // InternalGame.g:3683:1: ( 'transformable' )
            // InternalGame.g:3684:2: 'transformable'
            {
             before(grammarAccess.getObjetLieuAccess().getTransformableKeyword_6_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getObjetLieuAccess().getTransformableKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjetLieu__Group_6__0__Impl"


    // $ANTLR start "rule__ObjetLieu__Group_6__1"
    // InternalGame.g:3693:1: rule__ObjetLieu__Group_6__1 : rule__ObjetLieu__Group_6__1__Impl ;
    public final void rule__ObjetLieu__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3697:1: ( rule__ObjetLieu__Group_6__1__Impl )
            // InternalGame.g:3698:2: rule__ObjetLieu__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ObjetLieu__Group_6__1__Impl();

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
    // $ANTLR end "rule__ObjetLieu__Group_6__1"


    // $ANTLR start "rule__ObjetLieu__Group_6__1__Impl"
    // InternalGame.g:3704:1: rule__ObjetLieu__Group_6__1__Impl : ( ( rule__ObjetLieu__TransformableAssignment_6_1 )? ) ;
    public final void rule__ObjetLieu__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3708:1: ( ( ( rule__ObjetLieu__TransformableAssignment_6_1 )? ) )
            // InternalGame.g:3709:1: ( ( rule__ObjetLieu__TransformableAssignment_6_1 )? )
            {
            // InternalGame.g:3709:1: ( ( rule__ObjetLieu__TransformableAssignment_6_1 )? )
            // InternalGame.g:3710:2: ( rule__ObjetLieu__TransformableAssignment_6_1 )?
            {
             before(grammarAccess.getObjetLieuAccess().getTransformableAssignment_6_1()); 
            // InternalGame.g:3711:2: ( rule__ObjetLieu__TransformableAssignment_6_1 )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==43) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalGame.g:3711:3: rule__ObjetLieu__TransformableAssignment_6_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__ObjetLieu__TransformableAssignment_6_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getObjetLieuAccess().getTransformableAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjetLieu__Group_6__1__Impl"


    // $ANTLR start "rule__ObjetsExplorateur__Group__0"
    // InternalGame.g:3720:1: rule__ObjetsExplorateur__Group__0 : rule__ObjetsExplorateur__Group__0__Impl rule__ObjetsExplorateur__Group__1 ;
    public final void rule__ObjetsExplorateur__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3724:1: ( rule__ObjetsExplorateur__Group__0__Impl rule__ObjetsExplorateur__Group__1 )
            // InternalGame.g:3725:2: rule__ObjetsExplorateur__Group__0__Impl rule__ObjetsExplorateur__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__ObjetsExplorateur__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ObjetsExplorateur__Group__1();

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
    // $ANTLR end "rule__ObjetsExplorateur__Group__0"


    // $ANTLR start "rule__ObjetsExplorateur__Group__0__Impl"
    // InternalGame.g:3732:1: rule__ObjetsExplorateur__Group__0__Impl : ( 'objetsE' ) ;
    public final void rule__ObjetsExplorateur__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3736:1: ( ( 'objetsE' ) )
            // InternalGame.g:3737:1: ( 'objetsE' )
            {
            // InternalGame.g:3737:1: ( 'objetsE' )
            // InternalGame.g:3738:2: 'objetsE'
            {
             before(grammarAccess.getObjetsExplorateurAccess().getObjetsEKeyword_0()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getObjetsExplorateurAccess().getObjetsEKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjetsExplorateur__Group__0__Impl"


    // $ANTLR start "rule__ObjetsExplorateur__Group__1"
    // InternalGame.g:3747:1: rule__ObjetsExplorateur__Group__1 : rule__ObjetsExplorateur__Group__1__Impl rule__ObjetsExplorateur__Group__2 ;
    public final void rule__ObjetsExplorateur__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3751:1: ( rule__ObjetsExplorateur__Group__1__Impl rule__ObjetsExplorateur__Group__2 )
            // InternalGame.g:3752:2: rule__ObjetsExplorateur__Group__1__Impl rule__ObjetsExplorateur__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__ObjetsExplorateur__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ObjetsExplorateur__Group__2();

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
    // $ANTLR end "rule__ObjetsExplorateur__Group__1"


    // $ANTLR start "rule__ObjetsExplorateur__Group__1__Impl"
    // InternalGame.g:3759:1: rule__ObjetsExplorateur__Group__1__Impl : ( '{' ) ;
    public final void rule__ObjetsExplorateur__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3763:1: ( ( '{' ) )
            // InternalGame.g:3764:1: ( '{' )
            {
            // InternalGame.g:3764:1: ( '{' )
            // InternalGame.g:3765:2: '{'
            {
             before(grammarAccess.getObjetsExplorateurAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getObjetsExplorateurAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjetsExplorateur__Group__1__Impl"


    // $ANTLR start "rule__ObjetsExplorateur__Group__2"
    // InternalGame.g:3774:1: rule__ObjetsExplorateur__Group__2 : rule__ObjetsExplorateur__Group__2__Impl rule__ObjetsExplorateur__Group__3 ;
    public final void rule__ObjetsExplorateur__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3778:1: ( rule__ObjetsExplorateur__Group__2__Impl rule__ObjetsExplorateur__Group__3 )
            // InternalGame.g:3779:2: rule__ObjetsExplorateur__Group__2__Impl rule__ObjetsExplorateur__Group__3
            {
            pushFollow(FOLLOW_13);
            rule__ObjetsExplorateur__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ObjetsExplorateur__Group__3();

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
    // $ANTLR end "rule__ObjetsExplorateur__Group__2"


    // $ANTLR start "rule__ObjetsExplorateur__Group__2__Impl"
    // InternalGame.g:3786:1: rule__ObjetsExplorateur__Group__2__Impl : ( ( rule__ObjetsExplorateur__ListeObjetsAssignment_2 )* ) ;
    public final void rule__ObjetsExplorateur__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3790:1: ( ( ( rule__ObjetsExplorateur__ListeObjetsAssignment_2 )* ) )
            // InternalGame.g:3791:1: ( ( rule__ObjetsExplorateur__ListeObjetsAssignment_2 )* )
            {
            // InternalGame.g:3791:1: ( ( rule__ObjetsExplorateur__ListeObjetsAssignment_2 )* )
            // InternalGame.g:3792:2: ( rule__ObjetsExplorateur__ListeObjetsAssignment_2 )*
            {
             before(grammarAccess.getObjetsExplorateurAccess().getListeObjetsAssignment_2()); 
            // InternalGame.g:3793:2: ( rule__ObjetsExplorateur__ListeObjetsAssignment_2 )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==RULE_ID) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // InternalGame.g:3793:3: rule__ObjetsExplorateur__ListeObjetsAssignment_2
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__ObjetsExplorateur__ListeObjetsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop41;
                }
            } while (true);

             after(grammarAccess.getObjetsExplorateurAccess().getListeObjetsAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjetsExplorateur__Group__2__Impl"


    // $ANTLR start "rule__ObjetsExplorateur__Group__3"
    // InternalGame.g:3801:1: rule__ObjetsExplorateur__Group__3 : rule__ObjetsExplorateur__Group__3__Impl ;
    public final void rule__ObjetsExplorateur__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3805:1: ( rule__ObjetsExplorateur__Group__3__Impl )
            // InternalGame.g:3806:2: rule__ObjetsExplorateur__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ObjetsExplorateur__Group__3__Impl();

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
    // $ANTLR end "rule__ObjetsExplorateur__Group__3"


    // $ANTLR start "rule__ObjetsExplorateur__Group__3__Impl"
    // InternalGame.g:3812:1: rule__ObjetsExplorateur__Group__3__Impl : ( '}' ) ;
    public final void rule__ObjetsExplorateur__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3816:1: ( ( '}' ) )
            // InternalGame.g:3817:1: ( '}' )
            {
            // InternalGame.g:3817:1: ( '}' )
            // InternalGame.g:3818:2: '}'
            {
             before(grammarAccess.getObjetsExplorateurAccess().getRightCurlyBracketKeyword_3()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getObjetsExplorateurAccess().getRightCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjetsExplorateur__Group__3__Impl"


    // $ANTLR start "rule__ObjetsLieu__Group__0"
    // InternalGame.g:3828:1: rule__ObjetsLieu__Group__0 : rule__ObjetsLieu__Group__0__Impl rule__ObjetsLieu__Group__1 ;
    public final void rule__ObjetsLieu__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3832:1: ( rule__ObjetsLieu__Group__0__Impl rule__ObjetsLieu__Group__1 )
            // InternalGame.g:3833:2: rule__ObjetsLieu__Group__0__Impl rule__ObjetsLieu__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__ObjetsLieu__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ObjetsLieu__Group__1();

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
    // $ANTLR end "rule__ObjetsLieu__Group__0"


    // $ANTLR start "rule__ObjetsLieu__Group__0__Impl"
    // InternalGame.g:3840:1: rule__ObjetsLieu__Group__0__Impl : ( 'objetsL' ) ;
    public final void rule__ObjetsLieu__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3844:1: ( ( 'objetsL' ) )
            // InternalGame.g:3845:1: ( 'objetsL' )
            {
            // InternalGame.g:3845:1: ( 'objetsL' )
            // InternalGame.g:3846:2: 'objetsL'
            {
             before(grammarAccess.getObjetsLieuAccess().getObjetsLKeyword_0()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getObjetsLieuAccess().getObjetsLKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjetsLieu__Group__0__Impl"


    // $ANTLR start "rule__ObjetsLieu__Group__1"
    // InternalGame.g:3855:1: rule__ObjetsLieu__Group__1 : rule__ObjetsLieu__Group__1__Impl rule__ObjetsLieu__Group__2 ;
    public final void rule__ObjetsLieu__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3859:1: ( rule__ObjetsLieu__Group__1__Impl rule__ObjetsLieu__Group__2 )
            // InternalGame.g:3860:2: rule__ObjetsLieu__Group__1__Impl rule__ObjetsLieu__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__ObjetsLieu__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ObjetsLieu__Group__2();

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
    // $ANTLR end "rule__ObjetsLieu__Group__1"


    // $ANTLR start "rule__ObjetsLieu__Group__1__Impl"
    // InternalGame.g:3867:1: rule__ObjetsLieu__Group__1__Impl : ( '{' ) ;
    public final void rule__ObjetsLieu__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3871:1: ( ( '{' ) )
            // InternalGame.g:3872:1: ( '{' )
            {
            // InternalGame.g:3872:1: ( '{' )
            // InternalGame.g:3873:2: '{'
            {
             before(grammarAccess.getObjetsLieuAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getObjetsLieuAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjetsLieu__Group__1__Impl"


    // $ANTLR start "rule__ObjetsLieu__Group__2"
    // InternalGame.g:3882:1: rule__ObjetsLieu__Group__2 : rule__ObjetsLieu__Group__2__Impl rule__ObjetsLieu__Group__3 ;
    public final void rule__ObjetsLieu__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3886:1: ( rule__ObjetsLieu__Group__2__Impl rule__ObjetsLieu__Group__3 )
            // InternalGame.g:3887:2: rule__ObjetsLieu__Group__2__Impl rule__ObjetsLieu__Group__3
            {
            pushFollow(FOLLOW_13);
            rule__ObjetsLieu__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ObjetsLieu__Group__3();

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
    // $ANTLR end "rule__ObjetsLieu__Group__2"


    // $ANTLR start "rule__ObjetsLieu__Group__2__Impl"
    // InternalGame.g:3894:1: rule__ObjetsLieu__Group__2__Impl : ( ( rule__ObjetsLieu__ListeObjetsAssignment_2 )* ) ;
    public final void rule__ObjetsLieu__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3898:1: ( ( ( rule__ObjetsLieu__ListeObjetsAssignment_2 )* ) )
            // InternalGame.g:3899:1: ( ( rule__ObjetsLieu__ListeObjetsAssignment_2 )* )
            {
            // InternalGame.g:3899:1: ( ( rule__ObjetsLieu__ListeObjetsAssignment_2 )* )
            // InternalGame.g:3900:2: ( rule__ObjetsLieu__ListeObjetsAssignment_2 )*
            {
             before(grammarAccess.getObjetsLieuAccess().getListeObjetsAssignment_2()); 
            // InternalGame.g:3901:2: ( rule__ObjetsLieu__ListeObjetsAssignment_2 )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==RULE_ID) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // InternalGame.g:3901:3: rule__ObjetsLieu__ListeObjetsAssignment_2
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__ObjetsLieu__ListeObjetsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop42;
                }
            } while (true);

             after(grammarAccess.getObjetsLieuAccess().getListeObjetsAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjetsLieu__Group__2__Impl"


    // $ANTLR start "rule__ObjetsLieu__Group__3"
    // InternalGame.g:3909:1: rule__ObjetsLieu__Group__3 : rule__ObjetsLieu__Group__3__Impl ;
    public final void rule__ObjetsLieu__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3913:1: ( rule__ObjetsLieu__Group__3__Impl )
            // InternalGame.g:3914:2: rule__ObjetsLieu__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ObjetsLieu__Group__3__Impl();

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
    // $ANTLR end "rule__ObjetsLieu__Group__3"


    // $ANTLR start "rule__ObjetsLieu__Group__3__Impl"
    // InternalGame.g:3920:1: rule__ObjetsLieu__Group__3__Impl : ( '}' ) ;
    public final void rule__ObjetsLieu__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3924:1: ( ( '}' ) )
            // InternalGame.g:3925:1: ( '}' )
            {
            // InternalGame.g:3925:1: ( '}' )
            // InternalGame.g:3926:2: '}'
            {
             before(grammarAccess.getObjetsLieuAccess().getRightCurlyBracketKeyword_3()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getObjetsLieuAccess().getRightCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjetsLieu__Group__3__Impl"


    // $ANTLR start "rule__Connaissances__Group__0"
    // InternalGame.g:3936:1: rule__Connaissances__Group__0 : rule__Connaissances__Group__0__Impl rule__Connaissances__Group__1 ;
    public final void rule__Connaissances__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3940:1: ( rule__Connaissances__Group__0__Impl rule__Connaissances__Group__1 )
            // InternalGame.g:3941:2: rule__Connaissances__Group__0__Impl rule__Connaissances__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Connaissances__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Connaissances__Group__1();

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
    // $ANTLR end "rule__Connaissances__Group__0"


    // $ANTLR start "rule__Connaissances__Group__0__Impl"
    // InternalGame.g:3948:1: rule__Connaissances__Group__0__Impl : ( 'connaissances' ) ;
    public final void rule__Connaissances__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3952:1: ( ( 'connaissances' ) )
            // InternalGame.g:3953:1: ( 'connaissances' )
            {
            // InternalGame.g:3953:1: ( 'connaissances' )
            // InternalGame.g:3954:2: 'connaissances'
            {
             before(grammarAccess.getConnaissancesAccess().getConnaissancesKeyword_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getConnaissancesAccess().getConnaissancesKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connaissances__Group__0__Impl"


    // $ANTLR start "rule__Connaissances__Group__1"
    // InternalGame.g:3963:1: rule__Connaissances__Group__1 : rule__Connaissances__Group__1__Impl rule__Connaissances__Group__2 ;
    public final void rule__Connaissances__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3967:1: ( rule__Connaissances__Group__1__Impl rule__Connaissances__Group__2 )
            // InternalGame.g:3968:2: rule__Connaissances__Group__1__Impl rule__Connaissances__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__Connaissances__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Connaissances__Group__2();

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
    // $ANTLR end "rule__Connaissances__Group__1"


    // $ANTLR start "rule__Connaissances__Group__1__Impl"
    // InternalGame.g:3975:1: rule__Connaissances__Group__1__Impl : ( '{' ) ;
    public final void rule__Connaissances__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3979:1: ( ( '{' ) )
            // InternalGame.g:3980:1: ( '{' )
            {
            // InternalGame.g:3980:1: ( '{' )
            // InternalGame.g:3981:2: '{'
            {
             before(grammarAccess.getConnaissancesAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getConnaissancesAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connaissances__Group__1__Impl"


    // $ANTLR start "rule__Connaissances__Group__2"
    // InternalGame.g:3990:1: rule__Connaissances__Group__2 : rule__Connaissances__Group__2__Impl rule__Connaissances__Group__3 ;
    public final void rule__Connaissances__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3994:1: ( rule__Connaissances__Group__2__Impl rule__Connaissances__Group__3 )
            // InternalGame.g:3995:2: rule__Connaissances__Group__2__Impl rule__Connaissances__Group__3
            {
            pushFollow(FOLLOW_13);
            rule__Connaissances__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Connaissances__Group__3();

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
    // $ANTLR end "rule__Connaissances__Group__2"


    // $ANTLR start "rule__Connaissances__Group__2__Impl"
    // InternalGame.g:4002:1: rule__Connaissances__Group__2__Impl : ( ( rule__Connaissances__ListeConnaissancesAssignment_2 )* ) ;
    public final void rule__Connaissances__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4006:1: ( ( ( rule__Connaissances__ListeConnaissancesAssignment_2 )* ) )
            // InternalGame.g:4007:1: ( ( rule__Connaissances__ListeConnaissancesAssignment_2 )* )
            {
            // InternalGame.g:4007:1: ( ( rule__Connaissances__ListeConnaissancesAssignment_2 )* )
            // InternalGame.g:4008:2: ( rule__Connaissances__ListeConnaissancesAssignment_2 )*
            {
             before(grammarAccess.getConnaissancesAccess().getListeConnaissancesAssignment_2()); 
            // InternalGame.g:4009:2: ( rule__Connaissances__ListeConnaissancesAssignment_2 )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==RULE_ID) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // InternalGame.g:4009:3: rule__Connaissances__ListeConnaissancesAssignment_2
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Connaissances__ListeConnaissancesAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop43;
                }
            } while (true);

             after(grammarAccess.getConnaissancesAccess().getListeConnaissancesAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connaissances__Group__2__Impl"


    // $ANTLR start "rule__Connaissances__Group__3"
    // InternalGame.g:4017:1: rule__Connaissances__Group__3 : rule__Connaissances__Group__3__Impl ;
    public final void rule__Connaissances__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4021:1: ( rule__Connaissances__Group__3__Impl )
            // InternalGame.g:4022:2: rule__Connaissances__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Connaissances__Group__3__Impl();

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
    // $ANTLR end "rule__Connaissances__Group__3"


    // $ANTLR start "rule__Connaissances__Group__3__Impl"
    // InternalGame.g:4028:1: rule__Connaissances__Group__3__Impl : ( '}' ) ;
    public final void rule__Connaissances__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4032:1: ( ( '}' ) )
            // InternalGame.g:4033:1: ( '}' )
            {
            // InternalGame.g:4033:1: ( '}' )
            // InternalGame.g:4034:2: '}'
            {
             before(grammarAccess.getConnaissancesAccess().getRightCurlyBracketKeyword_3()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getConnaissancesAccess().getRightCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connaissances__Group__3__Impl"


    // $ANTLR start "rule__Connaissance__Group__0"
    // InternalGame.g:4044:1: rule__Connaissance__Group__0 : rule__Connaissance__Group__0__Impl rule__Connaissance__Group__1 ;
    public final void rule__Connaissance__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4048:1: ( rule__Connaissance__Group__0__Impl rule__Connaissance__Group__1 )
            // InternalGame.g:4049:2: rule__Connaissance__Group__0__Impl rule__Connaissance__Group__1
            {
            pushFollow(FOLLOW_31);
            rule__Connaissance__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Connaissance__Group__1();

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
    // $ANTLR end "rule__Connaissance__Group__0"


    // $ANTLR start "rule__Connaissance__Group__0__Impl"
    // InternalGame.g:4056:1: rule__Connaissance__Group__0__Impl : ( ( rule__Connaissance__NameAssignment_0 ) ) ;
    public final void rule__Connaissance__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4060:1: ( ( ( rule__Connaissance__NameAssignment_0 ) ) )
            // InternalGame.g:4061:1: ( ( rule__Connaissance__NameAssignment_0 ) )
            {
            // InternalGame.g:4061:1: ( ( rule__Connaissance__NameAssignment_0 ) )
            // InternalGame.g:4062:2: ( rule__Connaissance__NameAssignment_0 )
            {
             before(grammarAccess.getConnaissanceAccess().getNameAssignment_0()); 
            // InternalGame.g:4063:2: ( rule__Connaissance__NameAssignment_0 )
            // InternalGame.g:4063:3: rule__Connaissance__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Connaissance__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getConnaissanceAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connaissance__Group__0__Impl"


    // $ANTLR start "rule__Connaissance__Group__1"
    // InternalGame.g:4071:1: rule__Connaissance__Group__1 : rule__Connaissance__Group__1__Impl ;
    public final void rule__Connaissance__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4075:1: ( rule__Connaissance__Group__1__Impl )
            // InternalGame.g:4076:2: rule__Connaissance__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Connaissance__Group__1__Impl();

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
    // $ANTLR end "rule__Connaissance__Group__1"


    // $ANTLR start "rule__Connaissance__Group__1__Impl"
    // InternalGame.g:4082:1: rule__Connaissance__Group__1__Impl : ( ( rule__Connaissance__Group_1__0 )? ) ;
    public final void rule__Connaissance__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4086:1: ( ( ( rule__Connaissance__Group_1__0 )? ) )
            // InternalGame.g:4087:1: ( ( rule__Connaissance__Group_1__0 )? )
            {
            // InternalGame.g:4087:1: ( ( rule__Connaissance__Group_1__0 )? )
            // InternalGame.g:4088:2: ( rule__Connaissance__Group_1__0 )?
            {
             before(grammarAccess.getConnaissanceAccess().getGroup_1()); 
            // InternalGame.g:4089:2: ( rule__Connaissance__Group_1__0 )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==23) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalGame.g:4089:3: rule__Connaissance__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Connaissance__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getConnaissanceAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connaissance__Group__1__Impl"


    // $ANTLR start "rule__Connaissance__Group_1__0"
    // InternalGame.g:4098:1: rule__Connaissance__Group_1__0 : rule__Connaissance__Group_1__0__Impl rule__Connaissance__Group_1__1 ;
    public final void rule__Connaissance__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4102:1: ( rule__Connaissance__Group_1__0__Impl rule__Connaissance__Group_1__1 )
            // InternalGame.g:4103:2: rule__Connaissance__Group_1__0__Impl rule__Connaissance__Group_1__1
            {
            pushFollow(FOLLOW_15);
            rule__Connaissance__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Connaissance__Group_1__1();

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
    // $ANTLR end "rule__Connaissance__Group_1__0"


    // $ANTLR start "rule__Connaissance__Group_1__0__Impl"
    // InternalGame.g:4110:1: rule__Connaissance__Group_1__0__Impl : ( 'description' ) ;
    public final void rule__Connaissance__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4114:1: ( ( 'description' ) )
            // InternalGame.g:4115:1: ( 'description' )
            {
            // InternalGame.g:4115:1: ( 'description' )
            // InternalGame.g:4116:2: 'description'
            {
             before(grammarAccess.getConnaissanceAccess().getDescriptionKeyword_1_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getConnaissanceAccess().getDescriptionKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connaissance__Group_1__0__Impl"


    // $ANTLR start "rule__Connaissance__Group_1__1"
    // InternalGame.g:4125:1: rule__Connaissance__Group_1__1 : rule__Connaissance__Group_1__1__Impl rule__Connaissance__Group_1__2 ;
    public final void rule__Connaissance__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4129:1: ( rule__Connaissance__Group_1__1__Impl rule__Connaissance__Group_1__2 )
            // InternalGame.g:4130:2: rule__Connaissance__Group_1__1__Impl rule__Connaissance__Group_1__2
            {
            pushFollow(FOLLOW_16);
            rule__Connaissance__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Connaissance__Group_1__2();

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
    // $ANTLR end "rule__Connaissance__Group_1__1"


    // $ANTLR start "rule__Connaissance__Group_1__1__Impl"
    // InternalGame.g:4137:1: rule__Connaissance__Group_1__1__Impl : ( ( rule__Connaissance__DescriptionAssignment_1_1 ) ) ;
    public final void rule__Connaissance__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4141:1: ( ( ( rule__Connaissance__DescriptionAssignment_1_1 ) ) )
            // InternalGame.g:4142:1: ( ( rule__Connaissance__DescriptionAssignment_1_1 ) )
            {
            // InternalGame.g:4142:1: ( ( rule__Connaissance__DescriptionAssignment_1_1 ) )
            // InternalGame.g:4143:2: ( rule__Connaissance__DescriptionAssignment_1_1 )
            {
             before(grammarAccess.getConnaissanceAccess().getDescriptionAssignment_1_1()); 
            // InternalGame.g:4144:2: ( rule__Connaissance__DescriptionAssignment_1_1 )
            // InternalGame.g:4144:3: rule__Connaissance__DescriptionAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Connaissance__DescriptionAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getConnaissanceAccess().getDescriptionAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connaissance__Group_1__1__Impl"


    // $ANTLR start "rule__Connaissance__Group_1__2"
    // InternalGame.g:4152:1: rule__Connaissance__Group_1__2 : rule__Connaissance__Group_1__2__Impl ;
    public final void rule__Connaissance__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4156:1: ( rule__Connaissance__Group_1__2__Impl )
            // InternalGame.g:4157:2: rule__Connaissance__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Connaissance__Group_1__2__Impl();

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
    // $ANTLR end "rule__Connaissance__Group_1__2"


    // $ANTLR start "rule__Connaissance__Group_1__2__Impl"
    // InternalGame.g:4163:1: rule__Connaissance__Group_1__2__Impl : ( ( rule__Connaissance__ConditionConnaissanceAssignment_1_2 )? ) ;
    public final void rule__Connaissance__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4167:1: ( ( ( rule__Connaissance__ConditionConnaissanceAssignment_1_2 )? ) )
            // InternalGame.g:4168:1: ( ( rule__Connaissance__ConditionConnaissanceAssignment_1_2 )? )
            {
            // InternalGame.g:4168:1: ( ( rule__Connaissance__ConditionConnaissanceAssignment_1_2 )? )
            // InternalGame.g:4169:2: ( rule__Connaissance__ConditionConnaissanceAssignment_1_2 )?
            {
             before(grammarAccess.getConnaissanceAccess().getConditionConnaissanceAssignment_1_2()); 
            // InternalGame.g:4170:2: ( rule__Connaissance__ConditionConnaissanceAssignment_1_2 )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==43) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalGame.g:4170:3: rule__Connaissance__ConditionConnaissanceAssignment_1_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Connaissance__ConditionConnaissanceAssignment_1_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getConnaissanceAccess().getConditionConnaissanceAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connaissance__Group_1__2__Impl"


    // $ANTLR start "rule__Condition__Group__0"
    // InternalGame.g:4179:1: rule__Condition__Group__0 : rule__Condition__Group__0__Impl rule__Condition__Group__1 ;
    public final void rule__Condition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4183:1: ( rule__Condition__Group__0__Impl rule__Condition__Group__1 )
            // InternalGame.g:4184:2: rule__Condition__Group__0__Impl rule__Condition__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Condition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Condition__Group__1();

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
    // $ANTLR end "rule__Condition__Group__0"


    // $ANTLR start "rule__Condition__Group__0__Impl"
    // InternalGame.g:4191:1: rule__Condition__Group__0__Impl : ( 'condition' ) ;
    public final void rule__Condition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4195:1: ( ( 'condition' ) )
            // InternalGame.g:4196:1: ( 'condition' )
            {
            // InternalGame.g:4196:1: ( 'condition' )
            // InternalGame.g:4197:2: 'condition'
            {
             before(grammarAccess.getConditionAccess().getConditionKeyword_0()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getConditionAccess().getConditionKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group__0__Impl"


    // $ANTLR start "rule__Condition__Group__1"
    // InternalGame.g:4206:1: rule__Condition__Group__1 : rule__Condition__Group__1__Impl rule__Condition__Group__2 ;
    public final void rule__Condition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4210:1: ( rule__Condition__Group__1__Impl rule__Condition__Group__2 )
            // InternalGame.g:4211:2: rule__Condition__Group__1__Impl rule__Condition__Group__2
            {
            pushFollow(FOLLOW_32);
            rule__Condition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Condition__Group__2();

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
    // $ANTLR end "rule__Condition__Group__1"


    // $ANTLR start "rule__Condition__Group__1__Impl"
    // InternalGame.g:4218:1: rule__Condition__Group__1__Impl : ( ( rule__Condition__NameAssignment_1 ) ) ;
    public final void rule__Condition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4222:1: ( ( ( rule__Condition__NameAssignment_1 ) ) )
            // InternalGame.g:4223:1: ( ( rule__Condition__NameAssignment_1 ) )
            {
            // InternalGame.g:4223:1: ( ( rule__Condition__NameAssignment_1 ) )
            // InternalGame.g:4224:2: ( rule__Condition__NameAssignment_1 )
            {
             before(grammarAccess.getConditionAccess().getNameAssignment_1()); 
            // InternalGame.g:4225:2: ( rule__Condition__NameAssignment_1 )
            // InternalGame.g:4225:3: rule__Condition__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Condition__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getConditionAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group__1__Impl"


    // $ANTLR start "rule__Condition__Group__2"
    // InternalGame.g:4233:1: rule__Condition__Group__2 : rule__Condition__Group__2__Impl ;
    public final void rule__Condition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4237:1: ( rule__Condition__Group__2__Impl )
            // InternalGame.g:4238:2: rule__Condition__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Condition__Group__2__Impl();

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
    // $ANTLR end "rule__Condition__Group__2"


    // $ANTLR start "rule__Condition__Group__2__Impl"
    // InternalGame.g:4244:1: rule__Condition__Group__2__Impl : ( ( rule__Condition__ConditionAssignment_2 ) ) ;
    public final void rule__Condition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4248:1: ( ( ( rule__Condition__ConditionAssignment_2 ) ) )
            // InternalGame.g:4249:1: ( ( rule__Condition__ConditionAssignment_2 ) )
            {
            // InternalGame.g:4249:1: ( ( rule__Condition__ConditionAssignment_2 ) )
            // InternalGame.g:4250:2: ( rule__Condition__ConditionAssignment_2 )
            {
             before(grammarAccess.getConditionAccess().getConditionAssignment_2()); 
            // InternalGame.g:4251:2: ( rule__Condition__ConditionAssignment_2 )
            // InternalGame.g:4251:3: rule__Condition__ConditionAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Condition__ConditionAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getConditionAccess().getConditionAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group__2__Impl"


    // $ANTLR start "rule__Chemins__Group__0"
    // InternalGame.g:4260:1: rule__Chemins__Group__0 : rule__Chemins__Group__0__Impl rule__Chemins__Group__1 ;
    public final void rule__Chemins__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4264:1: ( rule__Chemins__Group__0__Impl rule__Chemins__Group__1 )
            // InternalGame.g:4265:2: rule__Chemins__Group__0__Impl rule__Chemins__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Chemins__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Chemins__Group__1();

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
    // $ANTLR end "rule__Chemins__Group__0"


    // $ANTLR start "rule__Chemins__Group__0__Impl"
    // InternalGame.g:4272:1: rule__Chemins__Group__0__Impl : ( 'chemins' ) ;
    public final void rule__Chemins__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4276:1: ( ( 'chemins' ) )
            // InternalGame.g:4277:1: ( 'chemins' )
            {
            // InternalGame.g:4277:1: ( 'chemins' )
            // InternalGame.g:4278:2: 'chemins'
            {
             before(grammarAccess.getCheminsAccess().getCheminsKeyword_0()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getCheminsAccess().getCheminsKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chemins__Group__0__Impl"


    // $ANTLR start "rule__Chemins__Group__1"
    // InternalGame.g:4287:1: rule__Chemins__Group__1 : rule__Chemins__Group__1__Impl rule__Chemins__Group__2 ;
    public final void rule__Chemins__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4291:1: ( rule__Chemins__Group__1__Impl rule__Chemins__Group__2 )
            // InternalGame.g:4292:2: rule__Chemins__Group__1__Impl rule__Chemins__Group__2
            {
            pushFollow(FOLLOW_33);
            rule__Chemins__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Chemins__Group__2();

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
    // $ANTLR end "rule__Chemins__Group__1"


    // $ANTLR start "rule__Chemins__Group__1__Impl"
    // InternalGame.g:4299:1: rule__Chemins__Group__1__Impl : ( '{' ) ;
    public final void rule__Chemins__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4303:1: ( ( '{' ) )
            // InternalGame.g:4304:1: ( '{' )
            {
            // InternalGame.g:4304:1: ( '{' )
            // InternalGame.g:4305:2: '{'
            {
             before(grammarAccess.getCheminsAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getCheminsAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chemins__Group__1__Impl"


    // $ANTLR start "rule__Chemins__Group__2"
    // InternalGame.g:4314:1: rule__Chemins__Group__2 : rule__Chemins__Group__2__Impl rule__Chemins__Group__3 ;
    public final void rule__Chemins__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4318:1: ( rule__Chemins__Group__2__Impl rule__Chemins__Group__3 )
            // InternalGame.g:4319:2: rule__Chemins__Group__2__Impl rule__Chemins__Group__3
            {
            pushFollow(FOLLOW_33);
            rule__Chemins__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Chemins__Group__3();

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
    // $ANTLR end "rule__Chemins__Group__2"


    // $ANTLR start "rule__Chemins__Group__2__Impl"
    // InternalGame.g:4326:1: rule__Chemins__Group__2__Impl : ( ( rule__Chemins__ListeCheminsAssignment_2 )* ) ;
    public final void rule__Chemins__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4330:1: ( ( ( rule__Chemins__ListeCheminsAssignment_2 )* ) )
            // InternalGame.g:4331:1: ( ( rule__Chemins__ListeCheminsAssignment_2 )* )
            {
            // InternalGame.g:4331:1: ( ( rule__Chemins__ListeCheminsAssignment_2 )* )
            // InternalGame.g:4332:2: ( rule__Chemins__ListeCheminsAssignment_2 )*
            {
             before(grammarAccess.getCheminsAccess().getListeCheminsAssignment_2()); 
            // InternalGame.g:4333:2: ( rule__Chemins__ListeCheminsAssignment_2 )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==45) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // InternalGame.g:4333:3: rule__Chemins__ListeCheminsAssignment_2
            	    {
            	    pushFollow(FOLLOW_34);
            	    rule__Chemins__ListeCheminsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop46;
                }
            } while (true);

             after(grammarAccess.getCheminsAccess().getListeCheminsAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chemins__Group__2__Impl"


    // $ANTLR start "rule__Chemins__Group__3"
    // InternalGame.g:4341:1: rule__Chemins__Group__3 : rule__Chemins__Group__3__Impl ;
    public final void rule__Chemins__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4345:1: ( rule__Chemins__Group__3__Impl )
            // InternalGame.g:4346:2: rule__Chemins__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Chemins__Group__3__Impl();

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
    // $ANTLR end "rule__Chemins__Group__3"


    // $ANTLR start "rule__Chemins__Group__3__Impl"
    // InternalGame.g:4352:1: rule__Chemins__Group__3__Impl : ( '}' ) ;
    public final void rule__Chemins__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4356:1: ( ( '}' ) )
            // InternalGame.g:4357:1: ( '}' )
            {
            // InternalGame.g:4357:1: ( '}' )
            // InternalGame.g:4358:2: '}'
            {
             before(grammarAccess.getCheminsAccess().getRightCurlyBracketKeyword_3()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getCheminsAccess().getRightCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chemins__Group__3__Impl"


    // $ANTLR start "rule__Chemin__Group__0"
    // InternalGame.g:4368:1: rule__Chemin__Group__0 : rule__Chemin__Group__0__Impl rule__Chemin__Group__1 ;
    public final void rule__Chemin__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4372:1: ( rule__Chemin__Group__0__Impl rule__Chemin__Group__1 )
            // InternalGame.g:4373:2: rule__Chemin__Group__0__Impl rule__Chemin__Group__1
            {
            pushFollow(FOLLOW_31);
            rule__Chemin__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Chemin__Group__1();

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
    // $ANTLR end "rule__Chemin__Group__0"


    // $ANTLR start "rule__Chemin__Group__0__Impl"
    // InternalGame.g:4380:1: rule__Chemin__Group__0__Impl : ( 'chemin' ) ;
    public final void rule__Chemin__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4384:1: ( ( 'chemin' ) )
            // InternalGame.g:4385:1: ( 'chemin' )
            {
            // InternalGame.g:4385:1: ( 'chemin' )
            // InternalGame.g:4386:2: 'chemin'
            {
             before(grammarAccess.getCheminAccess().getCheminKeyword_0()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getCheminAccess().getCheminKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chemin__Group__0__Impl"


    // $ANTLR start "rule__Chemin__Group__1"
    // InternalGame.g:4395:1: rule__Chemin__Group__1 : rule__Chemin__Group__1__Impl rule__Chemin__Group__2 ;
    public final void rule__Chemin__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4399:1: ( rule__Chemin__Group__1__Impl rule__Chemin__Group__2 )
            // InternalGame.g:4400:2: rule__Chemin__Group__1__Impl rule__Chemin__Group__2
            {
            pushFollow(FOLLOW_15);
            rule__Chemin__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Chemin__Group__2();

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
    // $ANTLR end "rule__Chemin__Group__1"


    // $ANTLR start "rule__Chemin__Group__1__Impl"
    // InternalGame.g:4407:1: rule__Chemin__Group__1__Impl : ( 'description' ) ;
    public final void rule__Chemin__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4411:1: ( ( 'description' ) )
            // InternalGame.g:4412:1: ( 'description' )
            {
            // InternalGame.g:4412:1: ( 'description' )
            // InternalGame.g:4413:2: 'description'
            {
             before(grammarAccess.getCheminAccess().getDescriptionKeyword_1()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getCheminAccess().getDescriptionKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chemin__Group__1__Impl"


    // $ANTLR start "rule__Chemin__Group__2"
    // InternalGame.g:4422:1: rule__Chemin__Group__2 : rule__Chemin__Group__2__Impl rule__Chemin__Group__3 ;
    public final void rule__Chemin__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4426:1: ( rule__Chemin__Group__2__Impl rule__Chemin__Group__3 )
            // InternalGame.g:4427:2: rule__Chemin__Group__2__Impl rule__Chemin__Group__3
            {
            pushFollow(FOLLOW_35);
            rule__Chemin__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Chemin__Group__3();

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
    // $ANTLR end "rule__Chemin__Group__2"


    // $ANTLR start "rule__Chemin__Group__2__Impl"
    // InternalGame.g:4434:1: rule__Chemin__Group__2__Impl : ( ( rule__Chemin__DescriptionAssignment_2 ) ) ;
    public final void rule__Chemin__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4438:1: ( ( ( rule__Chemin__DescriptionAssignment_2 ) ) )
            // InternalGame.g:4439:1: ( ( rule__Chemin__DescriptionAssignment_2 ) )
            {
            // InternalGame.g:4439:1: ( ( rule__Chemin__DescriptionAssignment_2 ) )
            // InternalGame.g:4440:2: ( rule__Chemin__DescriptionAssignment_2 )
            {
             before(grammarAccess.getCheminAccess().getDescriptionAssignment_2()); 
            // InternalGame.g:4441:2: ( rule__Chemin__DescriptionAssignment_2 )
            // InternalGame.g:4441:3: rule__Chemin__DescriptionAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Chemin__DescriptionAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getCheminAccess().getDescriptionAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chemin__Group__2__Impl"


    // $ANTLR start "rule__Chemin__Group__3"
    // InternalGame.g:4449:1: rule__Chemin__Group__3 : rule__Chemin__Group__3__Impl rule__Chemin__Group__4 ;
    public final void rule__Chemin__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4453:1: ( rule__Chemin__Group__3__Impl rule__Chemin__Group__4 )
            // InternalGame.g:4454:2: rule__Chemin__Group__3__Impl rule__Chemin__Group__4
            {
            pushFollow(FOLLOW_35);
            rule__Chemin__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Chemin__Group__4();

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
    // $ANTLR end "rule__Chemin__Group__3"


    // $ANTLR start "rule__Chemin__Group__3__Impl"
    // InternalGame.g:4461:1: rule__Chemin__Group__3__Impl : ( ( rule__Chemin__ConditionDescriptionAssignment_3 )? ) ;
    public final void rule__Chemin__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4465:1: ( ( ( rule__Chemin__ConditionDescriptionAssignment_3 )? ) )
            // InternalGame.g:4466:1: ( ( rule__Chemin__ConditionDescriptionAssignment_3 )? )
            {
            // InternalGame.g:4466:1: ( ( rule__Chemin__ConditionDescriptionAssignment_3 )? )
            // InternalGame.g:4467:2: ( rule__Chemin__ConditionDescriptionAssignment_3 )?
            {
             before(grammarAccess.getCheminAccess().getConditionDescriptionAssignment_3()); 
            // InternalGame.g:4468:2: ( rule__Chemin__ConditionDescriptionAssignment_3 )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==43) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalGame.g:4468:3: rule__Chemin__ConditionDescriptionAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__Chemin__ConditionDescriptionAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCheminAccess().getConditionDescriptionAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chemin__Group__3__Impl"


    // $ANTLR start "rule__Chemin__Group__4"
    // InternalGame.g:4476:1: rule__Chemin__Group__4 : rule__Chemin__Group__4__Impl rule__Chemin__Group__5 ;
    public final void rule__Chemin__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4480:1: ( rule__Chemin__Group__4__Impl rule__Chemin__Group__5 )
            // InternalGame.g:4481:2: rule__Chemin__Group__4__Impl rule__Chemin__Group__5
            {
            pushFollow(FOLLOW_36);
            rule__Chemin__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Chemin__Group__5();

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
    // $ANTLR end "rule__Chemin__Group__4"


    // $ANTLR start "rule__Chemin__Group__4__Impl"
    // InternalGame.g:4488:1: rule__Chemin__Group__4__Impl : ( 'destination' ) ;
    public final void rule__Chemin__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4492:1: ( ( 'destination' ) )
            // InternalGame.g:4493:1: ( 'destination' )
            {
            // InternalGame.g:4493:1: ( 'destination' )
            // InternalGame.g:4494:2: 'destination'
            {
             before(grammarAccess.getCheminAccess().getDestinationKeyword_4()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getCheminAccess().getDestinationKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chemin__Group__4__Impl"


    // $ANTLR start "rule__Chemin__Group__5"
    // InternalGame.g:4503:1: rule__Chemin__Group__5 : rule__Chemin__Group__5__Impl rule__Chemin__Group__6 ;
    public final void rule__Chemin__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4507:1: ( rule__Chemin__Group__5__Impl rule__Chemin__Group__6 )
            // InternalGame.g:4508:2: rule__Chemin__Group__5__Impl rule__Chemin__Group__6
            {
            pushFollow(FOLLOW_37);
            rule__Chemin__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Chemin__Group__6();

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
    // $ANTLR end "rule__Chemin__Group__5"


    // $ANTLR start "rule__Chemin__Group__5__Impl"
    // InternalGame.g:4515:1: rule__Chemin__Group__5__Impl : ( ( rule__Chemin__DestinationAssignment_5 ) ) ;
    public final void rule__Chemin__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4519:1: ( ( ( rule__Chemin__DestinationAssignment_5 ) ) )
            // InternalGame.g:4520:1: ( ( rule__Chemin__DestinationAssignment_5 ) )
            {
            // InternalGame.g:4520:1: ( ( rule__Chemin__DestinationAssignment_5 ) )
            // InternalGame.g:4521:2: ( rule__Chemin__DestinationAssignment_5 )
            {
             before(grammarAccess.getCheminAccess().getDestinationAssignment_5()); 
            // InternalGame.g:4522:2: ( rule__Chemin__DestinationAssignment_5 )
            // InternalGame.g:4522:3: rule__Chemin__DestinationAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Chemin__DestinationAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getCheminAccess().getDestinationAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chemin__Group__5__Impl"


    // $ANTLR start "rule__Chemin__Group__6"
    // InternalGame.g:4530:1: rule__Chemin__Group__6 : rule__Chemin__Group__6__Impl rule__Chemin__Group__7 ;
    public final void rule__Chemin__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4534:1: ( rule__Chemin__Group__6__Impl rule__Chemin__Group__7 )
            // InternalGame.g:4535:2: rule__Chemin__Group__6__Impl rule__Chemin__Group__7
            {
            pushFollow(FOLLOW_37);
            rule__Chemin__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Chemin__Group__7();

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
    // $ANTLR end "rule__Chemin__Group__6"


    // $ANTLR start "rule__Chemin__Group__6__Impl"
    // InternalGame.g:4542:1: rule__Chemin__Group__6__Impl : ( ( rule__Chemin__Group_6__0 )? ) ;
    public final void rule__Chemin__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4546:1: ( ( ( rule__Chemin__Group_6__0 )? ) )
            // InternalGame.g:4547:1: ( ( rule__Chemin__Group_6__0 )? )
            {
            // InternalGame.g:4547:1: ( ( rule__Chemin__Group_6__0 )? )
            // InternalGame.g:4548:2: ( rule__Chemin__Group_6__0 )?
            {
             before(grammarAccess.getCheminAccess().getGroup_6()); 
            // InternalGame.g:4549:2: ( rule__Chemin__Group_6__0 )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==28) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalGame.g:4549:3: rule__Chemin__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Chemin__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCheminAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chemin__Group__6__Impl"


    // $ANTLR start "rule__Chemin__Group__7"
    // InternalGame.g:4557:1: rule__Chemin__Group__7 : rule__Chemin__Group__7__Impl rule__Chemin__Group__8 ;
    public final void rule__Chemin__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4561:1: ( rule__Chemin__Group__7__Impl rule__Chemin__Group__8 )
            // InternalGame.g:4562:2: rule__Chemin__Group__7__Impl rule__Chemin__Group__8
            {
            pushFollow(FOLLOW_37);
            rule__Chemin__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Chemin__Group__8();

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
    // $ANTLR end "rule__Chemin__Group__7"


    // $ANTLR start "rule__Chemin__Group__7__Impl"
    // InternalGame.g:4569:1: rule__Chemin__Group__7__Impl : ( ( rule__Chemin__Group_7__0 )? ) ;
    public final void rule__Chemin__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4573:1: ( ( ( rule__Chemin__Group_7__0 )? ) )
            // InternalGame.g:4574:1: ( ( rule__Chemin__Group_7__0 )? )
            {
            // InternalGame.g:4574:1: ( ( rule__Chemin__Group_7__0 )? )
            // InternalGame.g:4575:2: ( rule__Chemin__Group_7__0 )?
            {
             before(grammarAccess.getCheminAccess().getGroup_7()); 
            // InternalGame.g:4576:2: ( rule__Chemin__Group_7__0 )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==27) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalGame.g:4576:3: rule__Chemin__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Chemin__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCheminAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chemin__Group__7__Impl"


    // $ANTLR start "rule__Chemin__Group__8"
    // InternalGame.g:4584:1: rule__Chemin__Group__8 : rule__Chemin__Group__8__Impl rule__Chemin__Group__9 ;
    public final void rule__Chemin__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4588:1: ( rule__Chemin__Group__8__Impl rule__Chemin__Group__9 )
            // InternalGame.g:4589:2: rule__Chemin__Group__8__Impl rule__Chemin__Group__9
            {
            pushFollow(FOLLOW_37);
            rule__Chemin__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Chemin__Group__9();

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
    // $ANTLR end "rule__Chemin__Group__8"


    // $ANTLR start "rule__Chemin__Group__8__Impl"
    // InternalGame.g:4596:1: rule__Chemin__Group__8__Impl : ( ( rule__Chemin__Group_8__0 )? ) ;
    public final void rule__Chemin__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4600:1: ( ( ( rule__Chemin__Group_8__0 )? ) )
            // InternalGame.g:4601:1: ( ( rule__Chemin__Group_8__0 )? )
            {
            // InternalGame.g:4601:1: ( ( rule__Chemin__Group_8__0 )? )
            // InternalGame.g:4602:2: ( rule__Chemin__Group_8__0 )?
            {
             before(grammarAccess.getCheminAccess().getGroup_8()); 
            // InternalGame.g:4603:2: ( rule__Chemin__Group_8__0 )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==47) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalGame.g:4603:3: rule__Chemin__Group_8__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Chemin__Group_8__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCheminAccess().getGroup_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chemin__Group__8__Impl"


    // $ANTLR start "rule__Chemin__Group__9"
    // InternalGame.g:4611:1: rule__Chemin__Group__9 : rule__Chemin__Group__9__Impl rule__Chemin__Group__10 ;
    public final void rule__Chemin__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4615:1: ( rule__Chemin__Group__9__Impl rule__Chemin__Group__10 )
            // InternalGame.g:4616:2: rule__Chemin__Group__9__Impl rule__Chemin__Group__10
            {
            pushFollow(FOLLOW_37);
            rule__Chemin__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Chemin__Group__10();

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
    // $ANTLR end "rule__Chemin__Group__9"


    // $ANTLR start "rule__Chemin__Group__9__Impl"
    // InternalGame.g:4623:1: rule__Chemin__Group__9__Impl : ( ( rule__Chemin__ListeConnaissancesAssignment_9 )? ) ;
    public final void rule__Chemin__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4627:1: ( ( ( rule__Chemin__ListeConnaissancesAssignment_9 )? ) )
            // InternalGame.g:4628:1: ( ( rule__Chemin__ListeConnaissancesAssignment_9 )? )
            {
            // InternalGame.g:4628:1: ( ( rule__Chemin__ListeConnaissancesAssignment_9 )? )
            // InternalGame.g:4629:2: ( rule__Chemin__ListeConnaissancesAssignment_9 )?
            {
             before(grammarAccess.getCheminAccess().getListeConnaissancesAssignment_9()); 
            // InternalGame.g:4630:2: ( rule__Chemin__ListeConnaissancesAssignment_9 )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==20) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalGame.g:4630:3: rule__Chemin__ListeConnaissancesAssignment_9
                    {
                    pushFollow(FOLLOW_2);
                    rule__Chemin__ListeConnaissancesAssignment_9();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCheminAccess().getListeConnaissancesAssignment_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chemin__Group__9__Impl"


    // $ANTLR start "rule__Chemin__Group__10"
    // InternalGame.g:4638:1: rule__Chemin__Group__10 : rule__Chemin__Group__10__Impl rule__Chemin__Group__11 ;
    public final void rule__Chemin__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4642:1: ( rule__Chemin__Group__10__Impl rule__Chemin__Group__11 )
            // InternalGame.g:4643:2: rule__Chemin__Group__10__Impl rule__Chemin__Group__11
            {
            pushFollow(FOLLOW_37);
            rule__Chemin__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Chemin__Group__11();

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
    // $ANTLR end "rule__Chemin__Group__10"


    // $ANTLR start "rule__Chemin__Group__10__Impl"
    // InternalGame.g:4650:1: rule__Chemin__Group__10__Impl : ( ( rule__Chemin__ListeObjetsAssignment_10 )? ) ;
    public final void rule__Chemin__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4654:1: ( ( ( rule__Chemin__ListeObjetsAssignment_10 )? ) )
            // InternalGame.g:4655:1: ( ( rule__Chemin__ListeObjetsAssignment_10 )? )
            {
            // InternalGame.g:4655:1: ( ( rule__Chemin__ListeObjetsAssignment_10 )? )
            // InternalGame.g:4656:2: ( rule__Chemin__ListeObjetsAssignment_10 )?
            {
             before(grammarAccess.getCheminAccess().getListeObjetsAssignment_10()); 
            // InternalGame.g:4657:2: ( rule__Chemin__ListeObjetsAssignment_10 )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==42) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalGame.g:4657:3: rule__Chemin__ListeObjetsAssignment_10
                    {
                    pushFollow(FOLLOW_2);
                    rule__Chemin__ListeObjetsAssignment_10();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCheminAccess().getListeObjetsAssignment_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chemin__Group__10__Impl"


    // $ANTLR start "rule__Chemin__Group__11"
    // InternalGame.g:4665:1: rule__Chemin__Group__11 : rule__Chemin__Group__11__Impl ;
    public final void rule__Chemin__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4669:1: ( rule__Chemin__Group__11__Impl )
            // InternalGame.g:4670:2: rule__Chemin__Group__11__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Chemin__Group__11__Impl();

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
    // $ANTLR end "rule__Chemin__Group__11"


    // $ANTLR start "rule__Chemin__Group__11__Impl"
    // InternalGame.g:4676:1: rule__Chemin__Group__11__Impl : ( ( rule__Chemin__ListeObjetsConsommesAssignment_11 )? ) ;
    public final void rule__Chemin__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4680:1: ( ( ( rule__Chemin__ListeObjetsConsommesAssignment_11 )? ) )
            // InternalGame.g:4681:1: ( ( rule__Chemin__ListeObjetsConsommesAssignment_11 )? )
            {
            // InternalGame.g:4681:1: ( ( rule__Chemin__ListeObjetsConsommesAssignment_11 )? )
            // InternalGame.g:4682:2: ( rule__Chemin__ListeObjetsConsommesAssignment_11 )?
            {
             before(grammarAccess.getCheminAccess().getListeObjetsConsommesAssignment_11()); 
            // InternalGame.g:4683:2: ( rule__Chemin__ListeObjetsConsommesAssignment_11 )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==41) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // InternalGame.g:4683:3: rule__Chemin__ListeObjetsConsommesAssignment_11
                    {
                    pushFollow(FOLLOW_2);
                    rule__Chemin__ListeObjetsConsommesAssignment_11();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCheminAccess().getListeObjetsConsommesAssignment_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chemin__Group__11__Impl"


    // $ANTLR start "rule__Chemin__Group_6__0"
    // InternalGame.g:4692:1: rule__Chemin__Group_6__0 : rule__Chemin__Group_6__0__Impl rule__Chemin__Group_6__1 ;
    public final void rule__Chemin__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4696:1: ( rule__Chemin__Group_6__0__Impl rule__Chemin__Group_6__1 )
            // InternalGame.g:4697:2: rule__Chemin__Group_6__0__Impl rule__Chemin__Group_6__1
            {
            pushFollow(FOLLOW_16);
            rule__Chemin__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Chemin__Group_6__1();

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
    // $ANTLR end "rule__Chemin__Group_6__0"


    // $ANTLR start "rule__Chemin__Group_6__0__Impl"
    // InternalGame.g:4704:1: rule__Chemin__Group_6__0__Impl : ( 'obligatoire' ) ;
    public final void rule__Chemin__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4708:1: ( ( 'obligatoire' ) )
            // InternalGame.g:4709:1: ( 'obligatoire' )
            {
            // InternalGame.g:4709:1: ( 'obligatoire' )
            // InternalGame.g:4710:2: 'obligatoire'
            {
             before(grammarAccess.getCheminAccess().getObligatoireKeyword_6_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getCheminAccess().getObligatoireKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chemin__Group_6__0__Impl"


    // $ANTLR start "rule__Chemin__Group_6__1"
    // InternalGame.g:4719:1: rule__Chemin__Group_6__1 : rule__Chemin__Group_6__1__Impl ;
    public final void rule__Chemin__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4723:1: ( rule__Chemin__Group_6__1__Impl )
            // InternalGame.g:4724:2: rule__Chemin__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Chemin__Group_6__1__Impl();

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
    // $ANTLR end "rule__Chemin__Group_6__1"


    // $ANTLR start "rule__Chemin__Group_6__1__Impl"
    // InternalGame.g:4730:1: rule__Chemin__Group_6__1__Impl : ( ( rule__Chemin__ObligatoireAssignment_6_1 ) ) ;
    public final void rule__Chemin__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4734:1: ( ( ( rule__Chemin__ObligatoireAssignment_6_1 ) ) )
            // InternalGame.g:4735:1: ( ( rule__Chemin__ObligatoireAssignment_6_1 ) )
            {
            // InternalGame.g:4735:1: ( ( rule__Chemin__ObligatoireAssignment_6_1 ) )
            // InternalGame.g:4736:2: ( rule__Chemin__ObligatoireAssignment_6_1 )
            {
             before(grammarAccess.getCheminAccess().getObligatoireAssignment_6_1()); 
            // InternalGame.g:4737:2: ( rule__Chemin__ObligatoireAssignment_6_1 )
            // InternalGame.g:4737:3: rule__Chemin__ObligatoireAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__Chemin__ObligatoireAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getCheminAccess().getObligatoireAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chemin__Group_6__1__Impl"


    // $ANTLR start "rule__Chemin__Group_7__0"
    // InternalGame.g:4746:1: rule__Chemin__Group_7__0 : rule__Chemin__Group_7__0__Impl rule__Chemin__Group_7__1 ;
    public final void rule__Chemin__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4750:1: ( rule__Chemin__Group_7__0__Impl rule__Chemin__Group_7__1 )
            // InternalGame.g:4751:2: rule__Chemin__Group_7__0__Impl rule__Chemin__Group_7__1
            {
            pushFollow(FOLLOW_16);
            rule__Chemin__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Chemin__Group_7__1();

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
    // $ANTLR end "rule__Chemin__Group_7__0"


    // $ANTLR start "rule__Chemin__Group_7__0__Impl"
    // InternalGame.g:4758:1: rule__Chemin__Group_7__0__Impl : ( 'visible' ) ;
    public final void rule__Chemin__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4762:1: ( ( 'visible' ) )
            // InternalGame.g:4763:1: ( 'visible' )
            {
            // InternalGame.g:4763:1: ( 'visible' )
            // InternalGame.g:4764:2: 'visible'
            {
             before(grammarAccess.getCheminAccess().getVisibleKeyword_7_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getCheminAccess().getVisibleKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chemin__Group_7__0__Impl"


    // $ANTLR start "rule__Chemin__Group_7__1"
    // InternalGame.g:4773:1: rule__Chemin__Group_7__1 : rule__Chemin__Group_7__1__Impl ;
    public final void rule__Chemin__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4777:1: ( rule__Chemin__Group_7__1__Impl )
            // InternalGame.g:4778:2: rule__Chemin__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Chemin__Group_7__1__Impl();

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
    // $ANTLR end "rule__Chemin__Group_7__1"


    // $ANTLR start "rule__Chemin__Group_7__1__Impl"
    // InternalGame.g:4784:1: rule__Chemin__Group_7__1__Impl : ( ( rule__Chemin__VisibleAssignment_7_1 ) ) ;
    public final void rule__Chemin__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4788:1: ( ( ( rule__Chemin__VisibleAssignment_7_1 ) ) )
            // InternalGame.g:4789:1: ( ( rule__Chemin__VisibleAssignment_7_1 ) )
            {
            // InternalGame.g:4789:1: ( ( rule__Chemin__VisibleAssignment_7_1 ) )
            // InternalGame.g:4790:2: ( rule__Chemin__VisibleAssignment_7_1 )
            {
             before(grammarAccess.getCheminAccess().getVisibleAssignment_7_1()); 
            // InternalGame.g:4791:2: ( rule__Chemin__VisibleAssignment_7_1 )
            // InternalGame.g:4791:3: rule__Chemin__VisibleAssignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__Chemin__VisibleAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getCheminAccess().getVisibleAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chemin__Group_7__1__Impl"


    // $ANTLR start "rule__Chemin__Group_8__0"
    // InternalGame.g:4800:1: rule__Chemin__Group_8__0 : rule__Chemin__Group_8__0__Impl rule__Chemin__Group_8__1 ;
    public final void rule__Chemin__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4804:1: ( rule__Chemin__Group_8__0__Impl rule__Chemin__Group_8__1 )
            // InternalGame.g:4805:2: rule__Chemin__Group_8__0__Impl rule__Chemin__Group_8__1
            {
            pushFollow(FOLLOW_16);
            rule__Chemin__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Chemin__Group_8__1();

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
    // $ANTLR end "rule__Chemin__Group_8__0"


    // $ANTLR start "rule__Chemin__Group_8__0__Impl"
    // InternalGame.g:4812:1: rule__Chemin__Group_8__0__Impl : ( 'ouvert' ) ;
    public final void rule__Chemin__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4816:1: ( ( 'ouvert' ) )
            // InternalGame.g:4817:1: ( 'ouvert' )
            {
            // InternalGame.g:4817:1: ( 'ouvert' )
            // InternalGame.g:4818:2: 'ouvert'
            {
             before(grammarAccess.getCheminAccess().getOuvertKeyword_8_0()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getCheminAccess().getOuvertKeyword_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chemin__Group_8__0__Impl"


    // $ANTLR start "rule__Chemin__Group_8__1"
    // InternalGame.g:4827:1: rule__Chemin__Group_8__1 : rule__Chemin__Group_8__1__Impl ;
    public final void rule__Chemin__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4831:1: ( rule__Chemin__Group_8__1__Impl )
            // InternalGame.g:4832:2: rule__Chemin__Group_8__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Chemin__Group_8__1__Impl();

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
    // $ANTLR end "rule__Chemin__Group_8__1"


    // $ANTLR start "rule__Chemin__Group_8__1__Impl"
    // InternalGame.g:4838:1: rule__Chemin__Group_8__1__Impl : ( ( rule__Chemin__OuvertAssignment_8_1 ) ) ;
    public final void rule__Chemin__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4842:1: ( ( ( rule__Chemin__OuvertAssignment_8_1 ) ) )
            // InternalGame.g:4843:1: ( ( rule__Chemin__OuvertAssignment_8_1 ) )
            {
            // InternalGame.g:4843:1: ( ( rule__Chemin__OuvertAssignment_8_1 ) )
            // InternalGame.g:4844:2: ( rule__Chemin__OuvertAssignment_8_1 )
            {
             before(grammarAccess.getCheminAccess().getOuvertAssignment_8_1()); 
            // InternalGame.g:4845:2: ( rule__Chemin__OuvertAssignment_8_1 )
            // InternalGame.g:4845:3: rule__Chemin__OuvertAssignment_8_1
            {
            pushFollow(FOLLOW_2);
            rule__Chemin__OuvertAssignment_8_1();

            state._fsp--;


            }

             after(grammarAccess.getCheminAccess().getOuvertAssignment_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chemin__Group_8__1__Impl"


    // $ANTLR start "rule__Game__NameAssignment_1"
    // InternalGame.g:4854:1: rule__Game__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Game__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4858:1: ( ( RULE_ID ) )
            // InternalGame.g:4859:2: ( RULE_ID )
            {
            // InternalGame.g:4859:2: ( RULE_ID )
            // InternalGame.g:4860:3: RULE_ID
            {
             before(grammarAccess.getGameAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getGameAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Game__NameAssignment_1"


    // $ANTLR start "rule__Game__TerritoireElementsAssignment_3"
    // InternalGame.g:4869:1: rule__Game__TerritoireElementsAssignment_3 : ( ruleterritoireElement ) ;
    public final void rule__Game__TerritoireElementsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4873:1: ( ( ruleterritoireElement ) )
            // InternalGame.g:4874:2: ( ruleterritoireElement )
            {
            // InternalGame.g:4874:2: ( ruleterritoireElement )
            // InternalGame.g:4875:3: ruleterritoireElement
            {
             before(grammarAccess.getGameAccess().getTerritoireElementsTerritoireElementParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleterritoireElement();

            state._fsp--;

             after(grammarAccess.getGameAccess().getTerritoireElementsTerritoireElementParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Game__TerritoireElementsAssignment_3"


    // $ANTLR start "rule__Explorateur__NameAssignment_1"
    // InternalGame.g:4884:1: rule__Explorateur__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Explorateur__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4888:1: ( ( RULE_ID ) )
            // InternalGame.g:4889:2: ( RULE_ID )
            {
            // InternalGame.g:4889:2: ( RULE_ID )
            // InternalGame.g:4890:3: RULE_ID
            {
             before(grammarAccess.getExplorateurAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getExplorateurAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Explorateur__NameAssignment_1"


    // $ANTLR start "rule__Explorateur__SacAssignment_3"
    // InternalGame.g:4899:1: rule__Explorateur__SacAssignment_3 : ( ruleSac ) ;
    public final void rule__Explorateur__SacAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4903:1: ( ( ruleSac ) )
            // InternalGame.g:4904:2: ( ruleSac )
            {
            // InternalGame.g:4904:2: ( ruleSac )
            // InternalGame.g:4905:3: ruleSac
            {
             before(grammarAccess.getExplorateurAccess().getSacSacParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleSac();

            state._fsp--;

             after(grammarAccess.getExplorateurAccess().getSacSacParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Explorateur__SacAssignment_3"


    // $ANTLR start "rule__Explorateur__ConnaissancesAssignment_5"
    // InternalGame.g:4914:1: rule__Explorateur__ConnaissancesAssignment_5 : ( ( RULE_ID ) ) ;
    public final void rule__Explorateur__ConnaissancesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4918:1: ( ( ( RULE_ID ) ) )
            // InternalGame.g:4919:2: ( ( RULE_ID ) )
            {
            // InternalGame.g:4919:2: ( ( RULE_ID ) )
            // InternalGame.g:4920:3: ( RULE_ID )
            {
             before(grammarAccess.getExplorateurAccess().getConnaissancesConnaissanceCrossReference_5_0()); 
            // InternalGame.g:4921:3: ( RULE_ID )
            // InternalGame.g:4922:4: RULE_ID
            {
             before(grammarAccess.getExplorateurAccess().getConnaissancesConnaissanceIDTerminalRuleCall_5_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getExplorateurAccess().getConnaissancesConnaissanceIDTerminalRuleCall_5_0_1()); 

            }

             after(grammarAccess.getExplorateurAccess().getConnaissancesConnaissanceCrossReference_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Explorateur__ConnaissancesAssignment_5"


    // $ANTLR start "rule__Explorateur__PositionAssignment_7"
    // InternalGame.g:4933:1: rule__Explorateur__PositionAssignment_7 : ( ( RULE_ID ) ) ;
    public final void rule__Explorateur__PositionAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4937:1: ( ( ( RULE_ID ) ) )
            // InternalGame.g:4938:2: ( ( RULE_ID ) )
            {
            // InternalGame.g:4938:2: ( ( RULE_ID ) )
            // InternalGame.g:4939:3: ( RULE_ID )
            {
             before(grammarAccess.getExplorateurAccess().getPositionLieuCrossReference_7_0()); 
            // InternalGame.g:4940:3: ( RULE_ID )
            // InternalGame.g:4941:4: RULE_ID
            {
             before(grammarAccess.getExplorateurAccess().getPositionLieuIDTerminalRuleCall_7_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getExplorateurAccess().getPositionLieuIDTerminalRuleCall_7_0_1()); 

            }

             after(grammarAccess.getExplorateurAccess().getPositionLieuCrossReference_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Explorateur__PositionAssignment_7"


    // $ANTLR start "rule__Sac__TailleAssignment_1"
    // InternalGame.g:4952:1: rule__Sac__TailleAssignment_1 : ( RULE_INT ) ;
    public final void rule__Sac__TailleAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4956:1: ( ( RULE_INT ) )
            // InternalGame.g:4957:2: ( RULE_INT )
            {
            // InternalGame.g:4957:2: ( RULE_INT )
            // InternalGame.g:4958:3: RULE_INT
            {
             before(grammarAccess.getSacAccess().getTailleINTTerminalRuleCall_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getSacAccess().getTailleINTTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sac__TailleAssignment_1"


    // $ANTLR start "rule__Sac__SacElementsAssignment_3"
    // InternalGame.g:4967:1: rule__Sac__SacElementsAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__Sac__SacElementsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4971:1: ( ( ( RULE_ID ) ) )
            // InternalGame.g:4972:2: ( ( RULE_ID ) )
            {
            // InternalGame.g:4972:2: ( ( RULE_ID ) )
            // InternalGame.g:4973:3: ( RULE_ID )
            {
             before(grammarAccess.getSacAccess().getSacElementsObjetExplorateurCrossReference_3_0()); 
            // InternalGame.g:4974:3: ( RULE_ID )
            // InternalGame.g:4975:4: RULE_ID
            {
             before(grammarAccess.getSacAccess().getSacElementsObjetExplorateurIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSacAccess().getSacElementsObjetExplorateurIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getSacAccess().getSacElementsObjetExplorateurCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sac__SacElementsAssignment_3"


    // $ANTLR start "rule__Lieu__TypeAssignment_0"
    // InternalGame.g:4986:1: rule__Lieu__TypeAssignment_0 : ( ruleTypeLieu ) ;
    public final void rule__Lieu__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4990:1: ( ( ruleTypeLieu ) )
            // InternalGame.g:4991:2: ( ruleTypeLieu )
            {
            // InternalGame.g:4991:2: ( ruleTypeLieu )
            // InternalGame.g:4992:3: ruleTypeLieu
            {
             before(grammarAccess.getLieuAccess().getTypeTypeLieuEnumRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleTypeLieu();

            state._fsp--;

             after(grammarAccess.getLieuAccess().getTypeTypeLieuEnumRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lieu__TypeAssignment_0"


    // $ANTLR start "rule__Lieu__NameAssignment_1"
    // InternalGame.g:5001:1: rule__Lieu__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Lieu__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5005:1: ( ( RULE_ID ) )
            // InternalGame.g:5006:2: ( RULE_ID )
            {
            // InternalGame.g:5006:2: ( RULE_ID )
            // InternalGame.g:5007:3: RULE_ID
            {
             before(grammarAccess.getLieuAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getLieuAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lieu__NameAssignment_1"


    // $ANTLR start "rule__Lieu__DescriptionAssignment_3_1"
    // InternalGame.g:5016:1: rule__Lieu__DescriptionAssignment_3_1 : ( RULE_STRING ) ;
    public final void rule__Lieu__DescriptionAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5020:1: ( ( RULE_STRING ) )
            // InternalGame.g:5021:2: ( RULE_STRING )
            {
            // InternalGame.g:5021:2: ( RULE_STRING )
            // InternalGame.g:5022:3: RULE_STRING
            {
             before(grammarAccess.getLieuAccess().getDescriptionSTRINGTerminalRuleCall_3_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getLieuAccess().getDescriptionSTRINGTerminalRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lieu__DescriptionAssignment_3_1"


    // $ANTLR start "rule__Lieu__ConditionDescriptionAssignment_3_2"
    // InternalGame.g:5031:1: rule__Lieu__ConditionDescriptionAssignment_3_2 : ( ruleCondition ) ;
    public final void rule__Lieu__ConditionDescriptionAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5035:1: ( ( ruleCondition ) )
            // InternalGame.g:5036:2: ( ruleCondition )
            {
            // InternalGame.g:5036:2: ( ruleCondition )
            // InternalGame.g:5037:3: ruleCondition
            {
             before(grammarAccess.getLieuAccess().getConditionDescriptionConditionParserRuleCall_3_2_0()); 
            pushFollow(FOLLOW_2);
            ruleCondition();

            state._fsp--;

             after(grammarAccess.getLieuAccess().getConditionDescriptionConditionParserRuleCall_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lieu__ConditionDescriptionAssignment_3_2"


    // $ANTLR start "rule__Lieu__PersonnesAssignment_4"
    // InternalGame.g:5046:1: rule__Lieu__PersonnesAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__Lieu__PersonnesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5050:1: ( ( ( RULE_ID ) ) )
            // InternalGame.g:5051:2: ( ( RULE_ID ) )
            {
            // InternalGame.g:5051:2: ( ( RULE_ID ) )
            // InternalGame.g:5052:3: ( RULE_ID )
            {
             before(grammarAccess.getLieuAccess().getPersonnesPersonneCrossReference_4_0()); 
            // InternalGame.g:5053:3: ( RULE_ID )
            // InternalGame.g:5054:4: RULE_ID
            {
             before(grammarAccess.getLieuAccess().getPersonnesPersonneIDTerminalRuleCall_4_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getLieuAccess().getPersonnesPersonneIDTerminalRuleCall_4_0_1()); 

            }

             after(grammarAccess.getLieuAccess().getPersonnesPersonneCrossReference_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lieu__PersonnesAssignment_4"


    // $ANTLR start "rule__Lieu__ConnaissancesAssignment_5"
    // InternalGame.g:5065:1: rule__Lieu__ConnaissancesAssignment_5 : ( ( RULE_ID ) ) ;
    public final void rule__Lieu__ConnaissancesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5069:1: ( ( ( RULE_ID ) ) )
            // InternalGame.g:5070:2: ( ( RULE_ID ) )
            {
            // InternalGame.g:5070:2: ( ( RULE_ID ) )
            // InternalGame.g:5071:3: ( RULE_ID )
            {
             before(grammarAccess.getLieuAccess().getConnaissancesConnaissanceCrossReference_5_0()); 
            // InternalGame.g:5072:3: ( RULE_ID )
            // InternalGame.g:5073:4: RULE_ID
            {
             before(grammarAccess.getLieuAccess().getConnaissancesConnaissanceIDTerminalRuleCall_5_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getLieuAccess().getConnaissancesConnaissanceIDTerminalRuleCall_5_0_1()); 

            }

             after(grammarAccess.getLieuAccess().getConnaissancesConnaissanceCrossReference_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lieu__ConnaissancesAssignment_5"


    // $ANTLR start "rule__Lieu__ObjetsAssignment_6"
    // InternalGame.g:5084:1: rule__Lieu__ObjetsAssignment_6 : ( ( RULE_ID ) ) ;
    public final void rule__Lieu__ObjetsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5088:1: ( ( ( RULE_ID ) ) )
            // InternalGame.g:5089:2: ( ( RULE_ID ) )
            {
            // InternalGame.g:5089:2: ( ( RULE_ID ) )
            // InternalGame.g:5090:3: ( RULE_ID )
            {
             before(grammarAccess.getLieuAccess().getObjetsObjetLieuCrossReference_6_0()); 
            // InternalGame.g:5091:3: ( RULE_ID )
            // InternalGame.g:5092:4: RULE_ID
            {
             before(grammarAccess.getLieuAccess().getObjetsObjetLieuIDTerminalRuleCall_6_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getLieuAccess().getObjetsObjetLieuIDTerminalRuleCall_6_0_1()); 

            }

             after(grammarAccess.getLieuAccess().getObjetsObjetLieuCrossReference_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lieu__ObjetsAssignment_6"


    // $ANTLR start "rule__Lieu__DepotObjetAssignment_7_1"
    // InternalGame.g:5103:1: rule__Lieu__DepotObjetAssignment_7_1 : ( ruleCondition ) ;
    public final void rule__Lieu__DepotObjetAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5107:1: ( ( ruleCondition ) )
            // InternalGame.g:5108:2: ( ruleCondition )
            {
            // InternalGame.g:5108:2: ( ruleCondition )
            // InternalGame.g:5109:3: ruleCondition
            {
             before(grammarAccess.getLieuAccess().getDepotObjetConditionParserRuleCall_7_1_0()); 
            pushFollow(FOLLOW_2);
            ruleCondition();

            state._fsp--;

             after(grammarAccess.getLieuAccess().getDepotObjetConditionParserRuleCall_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lieu__DepotObjetAssignment_7_1"


    // $ANTLR start "rule__Lieu__ListeCheminsAssignment_8"
    // InternalGame.g:5118:1: rule__Lieu__ListeCheminsAssignment_8 : ( ( RULE_ID ) ) ;
    public final void rule__Lieu__ListeCheminsAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5122:1: ( ( ( RULE_ID ) ) )
            // InternalGame.g:5123:2: ( ( RULE_ID ) )
            {
            // InternalGame.g:5123:2: ( ( RULE_ID ) )
            // InternalGame.g:5124:3: ( RULE_ID )
            {
             before(grammarAccess.getLieuAccess().getListeCheminsCheminCrossReference_8_0()); 
            // InternalGame.g:5125:3: ( RULE_ID )
            // InternalGame.g:5126:4: RULE_ID
            {
             before(grammarAccess.getLieuAccess().getListeCheminsCheminIDTerminalRuleCall_8_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getLieuAccess().getListeCheminsCheminIDTerminalRuleCall_8_0_1()); 

            }

             after(grammarAccess.getLieuAccess().getListeCheminsCheminCrossReference_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lieu__ListeCheminsAssignment_8"


    // $ANTLR start "rule__Personnes__ListePersonnesAssignment_2"
    // InternalGame.g:5137:1: rule__Personnes__ListePersonnesAssignment_2 : ( rulePersonne ) ;
    public final void rule__Personnes__ListePersonnesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5141:1: ( ( rulePersonne ) )
            // InternalGame.g:5142:2: ( rulePersonne )
            {
            // InternalGame.g:5142:2: ( rulePersonne )
            // InternalGame.g:5143:3: rulePersonne
            {
             before(grammarAccess.getPersonnesAccess().getListePersonnesPersonneParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            rulePersonne();

            state._fsp--;

             after(grammarAccess.getPersonnesAccess().getListePersonnesPersonneParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Personnes__ListePersonnesAssignment_2"


    // $ANTLR start "rule__Personne__NameAssignment_1"
    // InternalGame.g:5152:1: rule__Personne__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Personne__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5156:1: ( ( RULE_ID ) )
            // InternalGame.g:5157:2: ( RULE_ID )
            {
            // InternalGame.g:5157:2: ( RULE_ID )
            // InternalGame.g:5158:3: RULE_ID
            {
             before(grammarAccess.getPersonneAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPersonneAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Personne__NameAssignment_1"


    // $ANTLR start "rule__Personne__VisibleAssignment_3_1"
    // InternalGame.g:5167:1: rule__Personne__VisibleAssignment_3_1 : ( RULE_BOOL ) ;
    public final void rule__Personne__VisibleAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5171:1: ( ( RULE_BOOL ) )
            // InternalGame.g:5172:2: ( RULE_BOOL )
            {
            // InternalGame.g:5172:2: ( RULE_BOOL )
            // InternalGame.g:5173:3: RULE_BOOL
            {
             before(grammarAccess.getPersonneAccess().getVisibleBOOLTerminalRuleCall_3_1_0()); 
            match(input,RULE_BOOL,FOLLOW_2); 
             after(grammarAccess.getPersonneAccess().getVisibleBOOLTerminalRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Personne__VisibleAssignment_3_1"


    // $ANTLR start "rule__Personne__ObligatoireAssignment_4_1"
    // InternalGame.g:5182:1: rule__Personne__ObligatoireAssignment_4_1 : ( RULE_BOOL ) ;
    public final void rule__Personne__ObligatoireAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5186:1: ( ( RULE_BOOL ) )
            // InternalGame.g:5187:2: ( RULE_BOOL )
            {
            // InternalGame.g:5187:2: ( RULE_BOOL )
            // InternalGame.g:5188:3: RULE_BOOL
            {
             before(grammarAccess.getPersonneAccess().getObligatoireBOOLTerminalRuleCall_4_1_0()); 
            match(input,RULE_BOOL,FOLLOW_2); 
             after(grammarAccess.getPersonneAccess().getObligatoireBOOLTerminalRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Personne__ObligatoireAssignment_4_1"


    // $ANTLR start "rule__Personne__PersonneElementsAssignment_5"
    // InternalGame.g:5197:1: rule__Personne__PersonneElementsAssignment_5 : ( ruleInteraction ) ;
    public final void rule__Personne__PersonneElementsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5201:1: ( ( ruleInteraction ) )
            // InternalGame.g:5202:2: ( ruleInteraction )
            {
            // InternalGame.g:5202:2: ( ruleInteraction )
            // InternalGame.g:5203:3: ruleInteraction
            {
             before(grammarAccess.getPersonneAccess().getPersonneElementsInteractionParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleInteraction();

            state._fsp--;

             after(grammarAccess.getPersonneAccess().getPersonneElementsInteractionParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Personne__PersonneElementsAssignment_5"


    // $ANTLR start "rule__Interaction__NameAssignment_1"
    // InternalGame.g:5212:1: rule__Interaction__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Interaction__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5216:1: ( ( RULE_ID ) )
            // InternalGame.g:5217:2: ( RULE_ID )
            {
            // InternalGame.g:5217:2: ( RULE_ID )
            // InternalGame.g:5218:3: RULE_ID
            {
             before(grammarAccess.getInteractionAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getInteractionAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interaction__NameAssignment_1"


    // $ANTLR start "rule__Interaction__TexteAssignment_4"
    // InternalGame.g:5227:1: rule__Interaction__TexteAssignment_4 : ( RULE_STRING ) ;
    public final void rule__Interaction__TexteAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5231:1: ( ( RULE_STRING ) )
            // InternalGame.g:5232:2: ( RULE_STRING )
            {
            // InternalGame.g:5232:2: ( RULE_STRING )
            // InternalGame.g:5233:3: RULE_STRING
            {
             before(grammarAccess.getInteractionAccess().getTexteSTRINGTerminalRuleCall_4_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getInteractionAccess().getTexteSTRINGTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interaction__TexteAssignment_4"


    // $ANTLR start "rule__Interaction__InteractionElementsAssignment_5"
    // InternalGame.g:5242:1: rule__Interaction__InteractionElementsAssignment_5 : ( ruleChoix ) ;
    public final void rule__Interaction__InteractionElementsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5246:1: ( ( ruleChoix ) )
            // InternalGame.g:5247:2: ( ruleChoix )
            {
            // InternalGame.g:5247:2: ( ruleChoix )
            // InternalGame.g:5248:3: ruleChoix
            {
             before(grammarAccess.getInteractionAccess().getInteractionElementsChoixParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleChoix();

            state._fsp--;

             after(grammarAccess.getInteractionAccess().getInteractionElementsChoixParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interaction__InteractionElementsAssignment_5"


    // $ANTLR start "rule__Choix__NameAssignment_1"
    // InternalGame.g:5257:1: rule__Choix__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Choix__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5261:1: ( ( RULE_ID ) )
            // InternalGame.g:5262:2: ( RULE_ID )
            {
            // InternalGame.g:5262:2: ( RULE_ID )
            // InternalGame.g:5263:3: RULE_ID
            {
             before(grammarAccess.getChoixAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getChoixAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choix__NameAssignment_1"


    // $ANTLR start "rule__Choix__TexteAssignment_2"
    // InternalGame.g:5272:1: rule__Choix__TexteAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Choix__TexteAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5276:1: ( ( RULE_STRING ) )
            // InternalGame.g:5277:2: ( RULE_STRING )
            {
            // InternalGame.g:5277:2: ( RULE_STRING )
            // InternalGame.g:5278:3: RULE_STRING
            {
             before(grammarAccess.getChoixAccess().getTexteSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getChoixAccess().getTexteSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choix__TexteAssignment_2"


    // $ANTLR start "rule__Choix__ListeActionsAssignment_4"
    // InternalGame.g:5287:1: rule__Choix__ListeActionsAssignment_4 : ( ruleAction ) ;
    public final void rule__Choix__ListeActionsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5291:1: ( ( ruleAction ) )
            // InternalGame.g:5292:2: ( ruleAction )
            {
            // InternalGame.g:5292:2: ( ruleAction )
            // InternalGame.g:5293:3: ruleAction
            {
             before(grammarAccess.getChoixAccess().getListeActionsActionParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleAction();

            state._fsp--;

             after(grammarAccess.getChoixAccess().getListeActionsActionParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choix__ListeActionsAssignment_4"


    // $ANTLR start "rule__Choix__ChoixdebutAssignment_5_1_0"
    // InternalGame.g:5302:1: rule__Choix__ChoixdebutAssignment_5_1_0 : ( RULE_STRING ) ;
    public final void rule__Choix__ChoixdebutAssignment_5_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5306:1: ( ( RULE_STRING ) )
            // InternalGame.g:5307:2: ( RULE_STRING )
            {
            // InternalGame.g:5307:2: ( RULE_STRING )
            // InternalGame.g:5308:3: RULE_STRING
            {
             before(grammarAccess.getChoixAccess().getChoixdebutSTRINGTerminalRuleCall_5_1_0_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getChoixAccess().getChoixdebutSTRINGTerminalRuleCall_5_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choix__ChoixdebutAssignment_5_1_0"


    // $ANTLR start "rule__Choix__ConditonChoixDebutAssignment_5_1_1"
    // InternalGame.g:5317:1: rule__Choix__ConditonChoixDebutAssignment_5_1_1 : ( ruleCondition ) ;
    public final void rule__Choix__ConditonChoixDebutAssignment_5_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5321:1: ( ( ruleCondition ) )
            // InternalGame.g:5322:2: ( ruleCondition )
            {
            // InternalGame.g:5322:2: ( ruleCondition )
            // InternalGame.g:5323:3: ruleCondition
            {
             before(grammarAccess.getChoixAccess().getConditonChoixDebutConditionParserRuleCall_5_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleCondition();

            state._fsp--;

             after(grammarAccess.getChoixAccess().getConditonChoixDebutConditionParserRuleCall_5_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choix__ConditonChoixDebutAssignment_5_1_1"


    // $ANTLR start "rule__Choix__ChoixfinAssignment_6_1_0"
    // InternalGame.g:5332:1: rule__Choix__ChoixfinAssignment_6_1_0 : ( RULE_STRING ) ;
    public final void rule__Choix__ChoixfinAssignment_6_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5336:1: ( ( RULE_STRING ) )
            // InternalGame.g:5337:2: ( RULE_STRING )
            {
            // InternalGame.g:5337:2: ( RULE_STRING )
            // InternalGame.g:5338:3: RULE_STRING
            {
             before(grammarAccess.getChoixAccess().getChoixfinSTRINGTerminalRuleCall_6_1_0_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getChoixAccess().getChoixfinSTRINGTerminalRuleCall_6_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choix__ChoixfinAssignment_6_1_0"


    // $ANTLR start "rule__Choix__ConditionChoixFinAssignment_6_1_1"
    // InternalGame.g:5347:1: rule__Choix__ConditionChoixFinAssignment_6_1_1 : ( ruleCondition ) ;
    public final void rule__Choix__ConditionChoixFinAssignment_6_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5351:1: ( ( ruleCondition ) )
            // InternalGame.g:5352:2: ( ruleCondition )
            {
            // InternalGame.g:5352:2: ( ruleCondition )
            // InternalGame.g:5353:3: ruleCondition
            {
             before(grammarAccess.getChoixAccess().getConditionChoixFinConditionParserRuleCall_6_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleCondition();

            state._fsp--;

             after(grammarAccess.getChoixAccess().getConditionChoixFinConditionParserRuleCall_6_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choix__ConditionChoixFinAssignment_6_1_1"


    // $ANTLR start "rule__Action__ConditionActionAssignment_2"
    // InternalGame.g:5362:1: rule__Action__ConditionActionAssignment_2 : ( ruleCondition ) ;
    public final void rule__Action__ConditionActionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5366:1: ( ( ruleCondition ) )
            // InternalGame.g:5367:2: ( ruleCondition )
            {
            // InternalGame.g:5367:2: ( ruleCondition )
            // InternalGame.g:5368:3: ruleCondition
            {
             before(grammarAccess.getActionAccess().getConditionActionConditionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleCondition();

            state._fsp--;

             after(grammarAccess.getActionAccess().getConditionActionConditionParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__ConditionActionAssignment_2"


    // $ANTLR start "rule__Action__ListeChoixAssignment_3"
    // InternalGame.g:5377:1: rule__Action__ListeChoixAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__Action__ListeChoixAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5381:1: ( ( ( RULE_ID ) ) )
            // InternalGame.g:5382:2: ( ( RULE_ID ) )
            {
            // InternalGame.g:5382:2: ( ( RULE_ID ) )
            // InternalGame.g:5383:3: ( RULE_ID )
            {
             before(grammarAccess.getActionAccess().getListeChoixChoixCrossReference_3_0()); 
            // InternalGame.g:5384:3: ( RULE_ID )
            // InternalGame.g:5385:4: RULE_ID
            {
             before(grammarAccess.getActionAccess().getListeChoixChoixIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getActionAccess().getListeChoixChoixIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getActionAccess().getListeChoixChoixCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__ListeChoixAssignment_3"


    // $ANTLR start "rule__Action__ListeConnaissancesAssignment_4"
    // InternalGame.g:5396:1: rule__Action__ListeConnaissancesAssignment_4 : ( ruleConnaissances ) ;
    public final void rule__Action__ListeConnaissancesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5400:1: ( ( ruleConnaissances ) )
            // InternalGame.g:5401:2: ( ruleConnaissances )
            {
            // InternalGame.g:5401:2: ( ruleConnaissances )
            // InternalGame.g:5402:3: ruleConnaissances
            {
             before(grammarAccess.getActionAccess().getListeConnaissancesConnaissancesParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleConnaissances();

            state._fsp--;

             after(grammarAccess.getActionAccess().getListeConnaissancesConnaissancesParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__ListeConnaissancesAssignment_4"


    // $ANTLR start "rule__Action__ListeObjetsAssignment_5"
    // InternalGame.g:5411:1: rule__Action__ListeObjetsAssignment_5 : ( ( RULE_ID ) ) ;
    public final void rule__Action__ListeObjetsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5415:1: ( ( ( RULE_ID ) ) )
            // InternalGame.g:5416:2: ( ( RULE_ID ) )
            {
            // InternalGame.g:5416:2: ( ( RULE_ID ) )
            // InternalGame.g:5417:3: ( RULE_ID )
            {
             before(grammarAccess.getActionAccess().getListeObjetsObjetLieuCrossReference_5_0()); 
            // InternalGame.g:5418:3: ( RULE_ID )
            // InternalGame.g:5419:4: RULE_ID
            {
             before(grammarAccess.getActionAccess().getListeObjetsObjetLieuIDTerminalRuleCall_5_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getActionAccess().getListeObjetsObjetLieuIDTerminalRuleCall_5_0_1()); 

            }

             after(grammarAccess.getActionAccess().getListeObjetsObjetLieuCrossReference_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__ListeObjetsAssignment_5"


    // $ANTLR start "rule__Action__AttributionConnaissanceAssignment_7"
    // InternalGame.g:5430:1: rule__Action__AttributionConnaissanceAssignment_7 : ( ruleCondition ) ;
    public final void rule__Action__AttributionConnaissanceAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5434:1: ( ( ruleCondition ) )
            // InternalGame.g:5435:2: ( ruleCondition )
            {
            // InternalGame.g:5435:2: ( ruleCondition )
            // InternalGame.g:5436:3: ruleCondition
            {
             before(grammarAccess.getActionAccess().getAttributionConnaissanceConditionParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleCondition();

            state._fsp--;

             after(grammarAccess.getActionAccess().getAttributionConnaissanceConditionParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__AttributionConnaissanceAssignment_7"


    // $ANTLR start "rule__Action__AttributionObjetAssignment_8_1"
    // InternalGame.g:5445:1: rule__Action__AttributionObjetAssignment_8_1 : ( ruleCondition ) ;
    public final void rule__Action__AttributionObjetAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5449:1: ( ( ruleCondition ) )
            // InternalGame.g:5450:2: ( ruleCondition )
            {
            // InternalGame.g:5450:2: ( ruleCondition )
            // InternalGame.g:5451:3: ruleCondition
            {
             before(grammarAccess.getActionAccess().getAttributionObjetConditionParserRuleCall_8_1_0()); 
            pushFollow(FOLLOW_2);
            ruleCondition();

            state._fsp--;

             after(grammarAccess.getActionAccess().getAttributionObjetConditionParserRuleCall_8_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__AttributionObjetAssignment_8_1"


    // $ANTLR start "rule__Action__ListeObjetsConsommesAssignment_9"
    // InternalGame.g:5460:1: rule__Action__ListeObjetsConsommesAssignment_9 : ( ruleObjetExplorateur ) ;
    public final void rule__Action__ListeObjetsConsommesAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5464:1: ( ( ruleObjetExplorateur ) )
            // InternalGame.g:5465:2: ( ruleObjetExplorateur )
            {
            // InternalGame.g:5465:2: ( ruleObjetExplorateur )
            // InternalGame.g:5466:3: ruleObjetExplorateur
            {
             before(grammarAccess.getActionAccess().getListeObjetsConsommesObjetExplorateurParserRuleCall_9_0()); 
            pushFollow(FOLLOW_2);
            ruleObjetExplorateur();

            state._fsp--;

             after(grammarAccess.getActionAccess().getListeObjetsConsommesObjetExplorateurParserRuleCall_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__ListeObjetsConsommesAssignment_9"


    // $ANTLR start "rule__Action__ConsommationObjetAssignment_10_1"
    // InternalGame.g:5475:1: rule__Action__ConsommationObjetAssignment_10_1 : ( ruleCondition ) ;
    public final void rule__Action__ConsommationObjetAssignment_10_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5479:1: ( ( ruleCondition ) )
            // InternalGame.g:5480:2: ( ruleCondition )
            {
            // InternalGame.g:5480:2: ( ruleCondition )
            // InternalGame.g:5481:3: ruleCondition
            {
             before(grammarAccess.getActionAccess().getConsommationObjetConditionParserRuleCall_10_1_0()); 
            pushFollow(FOLLOW_2);
            ruleCondition();

            state._fsp--;

             after(grammarAccess.getActionAccess().getConsommationObjetConditionParserRuleCall_10_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__ConsommationObjetAssignment_10_1"


    // $ANTLR start "rule__ObjetExplorateur__NameAssignment_0"
    // InternalGame.g:5490:1: rule__ObjetExplorateur__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__ObjetExplorateur__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5494:1: ( ( RULE_ID ) )
            // InternalGame.g:5495:2: ( RULE_ID )
            {
            // InternalGame.g:5495:2: ( RULE_ID )
            // InternalGame.g:5496:3: RULE_ID
            {
             before(grammarAccess.getObjetExplorateurAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getObjetExplorateurAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjetExplorateur__NameAssignment_0"


    // $ANTLR start "rule__ObjetExplorateur__TailleAssignment_1"
    // InternalGame.g:5505:1: rule__ObjetExplorateur__TailleAssignment_1 : ( RULE_INT ) ;
    public final void rule__ObjetExplorateur__TailleAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5509:1: ( ( RULE_INT ) )
            // InternalGame.g:5510:2: ( RULE_INT )
            {
            // InternalGame.g:5510:2: ( RULE_INT )
            // InternalGame.g:5511:3: RULE_INT
            {
             before(grammarAccess.getObjetExplorateurAccess().getTailleINTTerminalRuleCall_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getObjetExplorateurAccess().getTailleINTTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjetExplorateur__TailleAssignment_1"


    // $ANTLR start "rule__ObjetExplorateur__QuantiteAssignment_2"
    // InternalGame.g:5520:1: rule__ObjetExplorateur__QuantiteAssignment_2 : ( RULE_INT ) ;
    public final void rule__ObjetExplorateur__QuantiteAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5524:1: ( ( RULE_INT ) )
            // InternalGame.g:5525:2: ( RULE_INT )
            {
            // InternalGame.g:5525:2: ( RULE_INT )
            // InternalGame.g:5526:3: RULE_INT
            {
             before(grammarAccess.getObjetExplorateurAccess().getQuantiteINTTerminalRuleCall_2_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getObjetExplorateurAccess().getQuantiteINTTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjetExplorateur__QuantiteAssignment_2"


    // $ANTLR start "rule__ObjetExplorateur__DescriptionAssignment_3_1"
    // InternalGame.g:5535:1: rule__ObjetExplorateur__DescriptionAssignment_3_1 : ( RULE_STRING ) ;
    public final void rule__ObjetExplorateur__DescriptionAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5539:1: ( ( RULE_STRING ) )
            // InternalGame.g:5540:2: ( RULE_STRING )
            {
            // InternalGame.g:5540:2: ( RULE_STRING )
            // InternalGame.g:5541:3: RULE_STRING
            {
             before(grammarAccess.getObjetExplorateurAccess().getDescriptionSTRINGTerminalRuleCall_3_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getObjetExplorateurAccess().getDescriptionSTRINGTerminalRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjetExplorateur__DescriptionAssignment_3_1"


    // $ANTLR start "rule__ObjetExplorateur__ConditionDescriptionAssignment_3_2"
    // InternalGame.g:5550:1: rule__ObjetExplorateur__ConditionDescriptionAssignment_3_2 : ( ruleCondition ) ;
    public final void rule__ObjetExplorateur__ConditionDescriptionAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5554:1: ( ( ruleCondition ) )
            // InternalGame.g:5555:2: ( ruleCondition )
            {
            // InternalGame.g:5555:2: ( ruleCondition )
            // InternalGame.g:5556:3: ruleCondition
            {
             before(grammarAccess.getObjetExplorateurAccess().getConditionDescriptionConditionParserRuleCall_3_2_0()); 
            pushFollow(FOLLOW_2);
            ruleCondition();

            state._fsp--;

             after(grammarAccess.getObjetExplorateurAccess().getConditionDescriptionConditionParserRuleCall_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjetExplorateur__ConditionDescriptionAssignment_3_2"


    // $ANTLR start "rule__ObjetExplorateur__TransformableAssignment_4_1"
    // InternalGame.g:5565:1: rule__ObjetExplorateur__TransformableAssignment_4_1 : ( ruleCondition ) ;
    public final void rule__ObjetExplorateur__TransformableAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5569:1: ( ( ruleCondition ) )
            // InternalGame.g:5570:2: ( ruleCondition )
            {
            // InternalGame.g:5570:2: ( ruleCondition )
            // InternalGame.g:5571:3: ruleCondition
            {
             before(grammarAccess.getObjetExplorateurAccess().getTransformableConditionParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleCondition();

            state._fsp--;

             after(grammarAccess.getObjetExplorateurAccess().getTransformableConditionParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjetExplorateur__TransformableAssignment_4_1"


    // $ANTLR start "rule__ObjetLieu__NameAssignment_0"
    // InternalGame.g:5580:1: rule__ObjetLieu__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__ObjetLieu__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5584:1: ( ( RULE_ID ) )
            // InternalGame.g:5585:2: ( RULE_ID )
            {
            // InternalGame.g:5585:2: ( RULE_ID )
            // InternalGame.g:5586:3: RULE_ID
            {
             before(grammarAccess.getObjetLieuAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getObjetLieuAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjetLieu__NameAssignment_0"


    // $ANTLR start "rule__ObjetLieu__TailleAssignment_1"
    // InternalGame.g:5595:1: rule__ObjetLieu__TailleAssignment_1 : ( RULE_INT ) ;
    public final void rule__ObjetLieu__TailleAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5599:1: ( ( RULE_INT ) )
            // InternalGame.g:5600:2: ( RULE_INT )
            {
            // InternalGame.g:5600:2: ( RULE_INT )
            // InternalGame.g:5601:3: RULE_INT
            {
             before(grammarAccess.getObjetLieuAccess().getTailleINTTerminalRuleCall_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getObjetLieuAccess().getTailleINTTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjetLieu__TailleAssignment_1"


    // $ANTLR start "rule__ObjetLieu__QuantiteAssignment_2"
    // InternalGame.g:5610:1: rule__ObjetLieu__QuantiteAssignment_2 : ( RULE_INT ) ;
    public final void rule__ObjetLieu__QuantiteAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5614:1: ( ( RULE_INT ) )
            // InternalGame.g:5615:2: ( RULE_INT )
            {
            // InternalGame.g:5615:2: ( RULE_INT )
            // InternalGame.g:5616:3: RULE_INT
            {
             before(grammarAccess.getObjetLieuAccess().getQuantiteINTTerminalRuleCall_2_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getObjetLieuAccess().getQuantiteINTTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjetLieu__QuantiteAssignment_2"


    // $ANTLR start "rule__ObjetLieu__ConditionTransmissionAssignment_3_1"
    // InternalGame.g:5625:1: rule__ObjetLieu__ConditionTransmissionAssignment_3_1 : ( ruleCondition ) ;
    public final void rule__ObjetLieu__ConditionTransmissionAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5629:1: ( ( ruleCondition ) )
            // InternalGame.g:5630:2: ( ruleCondition )
            {
            // InternalGame.g:5630:2: ( ruleCondition )
            // InternalGame.g:5631:3: ruleCondition
            {
             before(grammarAccess.getObjetLieuAccess().getConditionTransmissionConditionParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleCondition();

            state._fsp--;

             after(grammarAccess.getObjetLieuAccess().getConditionTransmissionConditionParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjetLieu__ConditionTransmissionAssignment_3_1"


    // $ANTLR start "rule__ObjetLieu__ConditionConsommationAssignment_4_1"
    // InternalGame.g:5640:1: rule__ObjetLieu__ConditionConsommationAssignment_4_1 : ( ruleCondition ) ;
    public final void rule__ObjetLieu__ConditionConsommationAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5644:1: ( ( ruleCondition ) )
            // InternalGame.g:5645:2: ( ruleCondition )
            {
            // InternalGame.g:5645:2: ( ruleCondition )
            // InternalGame.g:5646:3: ruleCondition
            {
             before(grammarAccess.getObjetLieuAccess().getConditionConsommationConditionParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleCondition();

            state._fsp--;

             after(grammarAccess.getObjetLieuAccess().getConditionConsommationConditionParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjetLieu__ConditionConsommationAssignment_4_1"


    // $ANTLR start "rule__ObjetLieu__DescriptionAssignment_5_1"
    // InternalGame.g:5655:1: rule__ObjetLieu__DescriptionAssignment_5_1 : ( RULE_STRING ) ;
    public final void rule__ObjetLieu__DescriptionAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5659:1: ( ( RULE_STRING ) )
            // InternalGame.g:5660:2: ( RULE_STRING )
            {
            // InternalGame.g:5660:2: ( RULE_STRING )
            // InternalGame.g:5661:3: RULE_STRING
            {
             before(grammarAccess.getObjetLieuAccess().getDescriptionSTRINGTerminalRuleCall_5_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getObjetLieuAccess().getDescriptionSTRINGTerminalRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjetLieu__DescriptionAssignment_5_1"


    // $ANTLR start "rule__ObjetLieu__ConditionDescriptionAssignment_5_2"
    // InternalGame.g:5670:1: rule__ObjetLieu__ConditionDescriptionAssignment_5_2 : ( ruleCondition ) ;
    public final void rule__ObjetLieu__ConditionDescriptionAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5674:1: ( ( ruleCondition ) )
            // InternalGame.g:5675:2: ( ruleCondition )
            {
            // InternalGame.g:5675:2: ( ruleCondition )
            // InternalGame.g:5676:3: ruleCondition
            {
             before(grammarAccess.getObjetLieuAccess().getConditionDescriptionConditionParserRuleCall_5_2_0()); 
            pushFollow(FOLLOW_2);
            ruleCondition();

            state._fsp--;

             after(grammarAccess.getObjetLieuAccess().getConditionDescriptionConditionParserRuleCall_5_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjetLieu__ConditionDescriptionAssignment_5_2"


    // $ANTLR start "rule__ObjetLieu__TransformableAssignment_6_1"
    // InternalGame.g:5685:1: rule__ObjetLieu__TransformableAssignment_6_1 : ( ruleCondition ) ;
    public final void rule__ObjetLieu__TransformableAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5689:1: ( ( ruleCondition ) )
            // InternalGame.g:5690:2: ( ruleCondition )
            {
            // InternalGame.g:5690:2: ( ruleCondition )
            // InternalGame.g:5691:3: ruleCondition
            {
             before(grammarAccess.getObjetLieuAccess().getTransformableConditionParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_2);
            ruleCondition();

            state._fsp--;

             after(grammarAccess.getObjetLieuAccess().getTransformableConditionParserRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjetLieu__TransformableAssignment_6_1"


    // $ANTLR start "rule__ObjetsExplorateur__ListeObjetsAssignment_2"
    // InternalGame.g:5700:1: rule__ObjetsExplorateur__ListeObjetsAssignment_2 : ( ruleObjetExplorateur ) ;
    public final void rule__ObjetsExplorateur__ListeObjetsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5704:1: ( ( ruleObjetExplorateur ) )
            // InternalGame.g:5705:2: ( ruleObjetExplorateur )
            {
            // InternalGame.g:5705:2: ( ruleObjetExplorateur )
            // InternalGame.g:5706:3: ruleObjetExplorateur
            {
             before(grammarAccess.getObjetsExplorateurAccess().getListeObjetsObjetExplorateurParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleObjetExplorateur();

            state._fsp--;

             after(grammarAccess.getObjetsExplorateurAccess().getListeObjetsObjetExplorateurParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjetsExplorateur__ListeObjetsAssignment_2"


    // $ANTLR start "rule__ObjetsLieu__ListeObjetsAssignment_2"
    // InternalGame.g:5715:1: rule__ObjetsLieu__ListeObjetsAssignment_2 : ( ruleObjetLieu ) ;
    public final void rule__ObjetsLieu__ListeObjetsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5719:1: ( ( ruleObjetLieu ) )
            // InternalGame.g:5720:2: ( ruleObjetLieu )
            {
            // InternalGame.g:5720:2: ( ruleObjetLieu )
            // InternalGame.g:5721:3: ruleObjetLieu
            {
             before(grammarAccess.getObjetsLieuAccess().getListeObjetsObjetLieuParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleObjetLieu();

            state._fsp--;

             after(grammarAccess.getObjetsLieuAccess().getListeObjetsObjetLieuParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjetsLieu__ListeObjetsAssignment_2"


    // $ANTLR start "rule__Connaissances__ListeConnaissancesAssignment_2"
    // InternalGame.g:5730:1: rule__Connaissances__ListeConnaissancesAssignment_2 : ( ruleConnaissance ) ;
    public final void rule__Connaissances__ListeConnaissancesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5734:1: ( ( ruleConnaissance ) )
            // InternalGame.g:5735:2: ( ruleConnaissance )
            {
            // InternalGame.g:5735:2: ( ruleConnaissance )
            // InternalGame.g:5736:3: ruleConnaissance
            {
             before(grammarAccess.getConnaissancesAccess().getListeConnaissancesConnaissanceParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleConnaissance();

            state._fsp--;

             after(grammarAccess.getConnaissancesAccess().getListeConnaissancesConnaissanceParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connaissances__ListeConnaissancesAssignment_2"


    // $ANTLR start "rule__Connaissance__NameAssignment_0"
    // InternalGame.g:5745:1: rule__Connaissance__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Connaissance__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5749:1: ( ( RULE_ID ) )
            // InternalGame.g:5750:2: ( RULE_ID )
            {
            // InternalGame.g:5750:2: ( RULE_ID )
            // InternalGame.g:5751:3: RULE_ID
            {
             before(grammarAccess.getConnaissanceAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getConnaissanceAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connaissance__NameAssignment_0"


    // $ANTLR start "rule__Connaissance__DescriptionAssignment_1_1"
    // InternalGame.g:5760:1: rule__Connaissance__DescriptionAssignment_1_1 : ( RULE_STRING ) ;
    public final void rule__Connaissance__DescriptionAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5764:1: ( ( RULE_STRING ) )
            // InternalGame.g:5765:2: ( RULE_STRING )
            {
            // InternalGame.g:5765:2: ( RULE_STRING )
            // InternalGame.g:5766:3: RULE_STRING
            {
             before(grammarAccess.getConnaissanceAccess().getDescriptionSTRINGTerminalRuleCall_1_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getConnaissanceAccess().getDescriptionSTRINGTerminalRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connaissance__DescriptionAssignment_1_1"


    // $ANTLR start "rule__Connaissance__ConditionConnaissanceAssignment_1_2"
    // InternalGame.g:5775:1: rule__Connaissance__ConditionConnaissanceAssignment_1_2 : ( ruleCondition ) ;
    public final void rule__Connaissance__ConditionConnaissanceAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5779:1: ( ( ruleCondition ) )
            // InternalGame.g:5780:2: ( ruleCondition )
            {
            // InternalGame.g:5780:2: ( ruleCondition )
            // InternalGame.g:5781:3: ruleCondition
            {
             before(grammarAccess.getConnaissanceAccess().getConditionConnaissanceConditionParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleCondition();

            state._fsp--;

             after(grammarAccess.getConnaissanceAccess().getConditionConnaissanceConditionParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connaissance__ConditionConnaissanceAssignment_1_2"


    // $ANTLR start "rule__Condition__NameAssignment_1"
    // InternalGame.g:5790:1: rule__Condition__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Condition__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5794:1: ( ( RULE_ID ) )
            // InternalGame.g:5795:2: ( RULE_ID )
            {
            // InternalGame.g:5795:2: ( RULE_ID )
            // InternalGame.g:5796:3: RULE_ID
            {
             before(grammarAccess.getConditionAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getConditionAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__NameAssignment_1"


    // $ANTLR start "rule__Condition__ConditionAssignment_2"
    // InternalGame.g:5805:1: rule__Condition__ConditionAssignment_2 : ( RULE_COND ) ;
    public final void rule__Condition__ConditionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5809:1: ( ( RULE_COND ) )
            // InternalGame.g:5810:2: ( RULE_COND )
            {
            // InternalGame.g:5810:2: ( RULE_COND )
            // InternalGame.g:5811:3: RULE_COND
            {
             before(grammarAccess.getConditionAccess().getConditionCONDTerminalRuleCall_2_0()); 
            match(input,RULE_COND,FOLLOW_2); 
             after(grammarAccess.getConditionAccess().getConditionCONDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__ConditionAssignment_2"


    // $ANTLR start "rule__Chemins__ListeCheminsAssignment_2"
    // InternalGame.g:5820:1: rule__Chemins__ListeCheminsAssignment_2 : ( ruleChemin ) ;
    public final void rule__Chemins__ListeCheminsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5824:1: ( ( ruleChemin ) )
            // InternalGame.g:5825:2: ( ruleChemin )
            {
            // InternalGame.g:5825:2: ( ruleChemin )
            // InternalGame.g:5826:3: ruleChemin
            {
             before(grammarAccess.getCheminsAccess().getListeCheminsCheminParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleChemin();

            state._fsp--;

             after(grammarAccess.getCheminsAccess().getListeCheminsCheminParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chemins__ListeCheminsAssignment_2"


    // $ANTLR start "rule__Chemin__DescriptionAssignment_2"
    // InternalGame.g:5835:1: rule__Chemin__DescriptionAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Chemin__DescriptionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5839:1: ( ( RULE_STRING ) )
            // InternalGame.g:5840:2: ( RULE_STRING )
            {
            // InternalGame.g:5840:2: ( RULE_STRING )
            // InternalGame.g:5841:3: RULE_STRING
            {
             before(grammarAccess.getCheminAccess().getDescriptionSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getCheminAccess().getDescriptionSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chemin__DescriptionAssignment_2"


    // $ANTLR start "rule__Chemin__ConditionDescriptionAssignment_3"
    // InternalGame.g:5850:1: rule__Chemin__ConditionDescriptionAssignment_3 : ( ruleCondition ) ;
    public final void rule__Chemin__ConditionDescriptionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5854:1: ( ( ruleCondition ) )
            // InternalGame.g:5855:2: ( ruleCondition )
            {
            // InternalGame.g:5855:2: ( ruleCondition )
            // InternalGame.g:5856:3: ruleCondition
            {
             before(grammarAccess.getCheminAccess().getConditionDescriptionConditionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleCondition();

            state._fsp--;

             after(grammarAccess.getCheminAccess().getConditionDescriptionConditionParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chemin__ConditionDescriptionAssignment_3"


    // $ANTLR start "rule__Chemin__DestinationAssignment_5"
    // InternalGame.g:5865:1: rule__Chemin__DestinationAssignment_5 : ( ruleLieu ) ;
    public final void rule__Chemin__DestinationAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5869:1: ( ( ruleLieu ) )
            // InternalGame.g:5870:2: ( ruleLieu )
            {
            // InternalGame.g:5870:2: ( ruleLieu )
            // InternalGame.g:5871:3: ruleLieu
            {
             before(grammarAccess.getCheminAccess().getDestinationLieuParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleLieu();

            state._fsp--;

             after(grammarAccess.getCheminAccess().getDestinationLieuParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chemin__DestinationAssignment_5"


    // $ANTLR start "rule__Chemin__ObligatoireAssignment_6_1"
    // InternalGame.g:5880:1: rule__Chemin__ObligatoireAssignment_6_1 : ( ruleCondition ) ;
    public final void rule__Chemin__ObligatoireAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5884:1: ( ( ruleCondition ) )
            // InternalGame.g:5885:2: ( ruleCondition )
            {
            // InternalGame.g:5885:2: ( ruleCondition )
            // InternalGame.g:5886:3: ruleCondition
            {
             before(grammarAccess.getCheminAccess().getObligatoireConditionParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_2);
            ruleCondition();

            state._fsp--;

             after(grammarAccess.getCheminAccess().getObligatoireConditionParserRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chemin__ObligatoireAssignment_6_1"


    // $ANTLR start "rule__Chemin__VisibleAssignment_7_1"
    // InternalGame.g:5895:1: rule__Chemin__VisibleAssignment_7_1 : ( ruleCondition ) ;
    public final void rule__Chemin__VisibleAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5899:1: ( ( ruleCondition ) )
            // InternalGame.g:5900:2: ( ruleCondition )
            {
            // InternalGame.g:5900:2: ( ruleCondition )
            // InternalGame.g:5901:3: ruleCondition
            {
             before(grammarAccess.getCheminAccess().getVisibleConditionParserRuleCall_7_1_0()); 
            pushFollow(FOLLOW_2);
            ruleCondition();

            state._fsp--;

             after(grammarAccess.getCheminAccess().getVisibleConditionParserRuleCall_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chemin__VisibleAssignment_7_1"


    // $ANTLR start "rule__Chemin__OuvertAssignment_8_1"
    // InternalGame.g:5910:1: rule__Chemin__OuvertAssignment_8_1 : ( ruleCondition ) ;
    public final void rule__Chemin__OuvertAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5914:1: ( ( ruleCondition ) )
            // InternalGame.g:5915:2: ( ruleCondition )
            {
            // InternalGame.g:5915:2: ( ruleCondition )
            // InternalGame.g:5916:3: ruleCondition
            {
             before(grammarAccess.getCheminAccess().getOuvertConditionParserRuleCall_8_1_0()); 
            pushFollow(FOLLOW_2);
            ruleCondition();

            state._fsp--;

             after(grammarAccess.getCheminAccess().getOuvertConditionParserRuleCall_8_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chemin__OuvertAssignment_8_1"


    // $ANTLR start "rule__Chemin__ListeConnaissancesAssignment_9"
    // InternalGame.g:5925:1: rule__Chemin__ListeConnaissancesAssignment_9 : ( ruleConnaissances ) ;
    public final void rule__Chemin__ListeConnaissancesAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5929:1: ( ( ruleConnaissances ) )
            // InternalGame.g:5930:2: ( ruleConnaissances )
            {
            // InternalGame.g:5930:2: ( ruleConnaissances )
            // InternalGame.g:5931:3: ruleConnaissances
            {
             before(grammarAccess.getCheminAccess().getListeConnaissancesConnaissancesParserRuleCall_9_0()); 
            pushFollow(FOLLOW_2);
            ruleConnaissances();

            state._fsp--;

             after(grammarAccess.getCheminAccess().getListeConnaissancesConnaissancesParserRuleCall_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chemin__ListeConnaissancesAssignment_9"


    // $ANTLR start "rule__Chemin__ListeObjetsAssignment_10"
    // InternalGame.g:5940:1: rule__Chemin__ListeObjetsAssignment_10 : ( ruleObjetsLieu ) ;
    public final void rule__Chemin__ListeObjetsAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5944:1: ( ( ruleObjetsLieu ) )
            // InternalGame.g:5945:2: ( ruleObjetsLieu )
            {
            // InternalGame.g:5945:2: ( ruleObjetsLieu )
            // InternalGame.g:5946:3: ruleObjetsLieu
            {
             before(grammarAccess.getCheminAccess().getListeObjetsObjetsLieuParserRuleCall_10_0()); 
            pushFollow(FOLLOW_2);
            ruleObjetsLieu();

            state._fsp--;

             after(grammarAccess.getCheminAccess().getListeObjetsObjetsLieuParserRuleCall_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chemin__ListeObjetsAssignment_10"


    // $ANTLR start "rule__Chemin__ListeObjetsConsommesAssignment_11"
    // InternalGame.g:5955:1: rule__Chemin__ListeObjetsConsommesAssignment_11 : ( ruleObjetsExplorateur ) ;
    public final void rule__Chemin__ListeObjetsConsommesAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5959:1: ( ( ruleObjetsExplorateur ) )
            // InternalGame.g:5960:2: ( ruleObjetsExplorateur )
            {
            // InternalGame.g:5960:2: ( ruleObjetsExplorateur )
            // InternalGame.g:5961:3: ruleObjetsExplorateur
            {
             before(grammarAccess.getCheminAccess().getListeObjetsConsommesObjetsExplorateurParserRuleCall_11_0()); 
            pushFollow(FOLLOW_2);
            ruleObjetsExplorateur();

            state._fsp--;

             after(grammarAccess.getCheminAccess().getListeObjetsConsommesObjetsExplorateurParserRuleCall_11_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chemin__ListeObjetsConsommesAssignment_11"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000016000218E000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000016000218E002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000200010L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000040010L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000001840010L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000038000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000080040000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000300040000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000080800100010L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000003000040010L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000004000800000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x000001C000800000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000200000040000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000480000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x000000000000E000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000860018100000L});

}