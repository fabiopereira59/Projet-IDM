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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_BOOL", "RULE_COND", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'debut'", "'fin'", "'intermediaire'", "'territoire'", "'{'", "'}'", "'explorateur'", "'connaissances'", "'position'", "'sac'", "'description'", "'depotO'", "'personnes'", "'visible'", "'obligatoire'", "'interaction'", "'texte'", "'choix'", "'choixdebut'", "'choixfin'", "'action'", "'donneC'", "'donneO'", "'attributionC'", "'attributionO'", "'consommeO'", "'quantiteO'", "'consommationC'", "'transformable'", "'transmission'", "'consommation'", "'objetsE'", "'objetsL'", "'conditions'", "'chemins'", "'source'", "'destination'", "'ouvert'"
    };
    public static final int T__50=50;
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
    public static final int T__48=48;
    public static final int T__49=49;
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


    // $ANTLR start "entryRuleConditions"
    // InternalGame.g:453:1: entryRuleConditions : ruleConditions EOF ;
    public final void entryRuleConditions() throws RecognitionException {
        try {
            // InternalGame.g:454:1: ( ruleConditions EOF )
            // InternalGame.g:455:1: ruleConditions EOF
            {
             before(grammarAccess.getConditionsRule()); 
            pushFollow(FOLLOW_1);
            ruleConditions();

            state._fsp--;

             after(grammarAccess.getConditionsRule()); 
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
    // $ANTLR end "entryRuleConditions"


    // $ANTLR start "ruleConditions"
    // InternalGame.g:462:1: ruleConditions : ( ( rule__Conditions__Group__0 ) ) ;
    public final void ruleConditions() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:466:2: ( ( ( rule__Conditions__Group__0 ) ) )
            // InternalGame.g:467:2: ( ( rule__Conditions__Group__0 ) )
            {
            // InternalGame.g:467:2: ( ( rule__Conditions__Group__0 ) )
            // InternalGame.g:468:3: ( rule__Conditions__Group__0 )
            {
             before(grammarAccess.getConditionsAccess().getGroup()); 
            // InternalGame.g:469:3: ( rule__Conditions__Group__0 )
            // InternalGame.g:469:4: rule__Conditions__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Conditions__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConditionsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConditions"


    // $ANTLR start "entryRuleCondition"
    // InternalGame.g:478:1: entryRuleCondition : ruleCondition EOF ;
    public final void entryRuleCondition() throws RecognitionException {
        try {
            // InternalGame.g:479:1: ( ruleCondition EOF )
            // InternalGame.g:480:1: ruleCondition EOF
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
    // InternalGame.g:487:1: ruleCondition : ( ( rule__Condition__Group__0 ) ) ;
    public final void ruleCondition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:491:2: ( ( ( rule__Condition__Group__0 ) ) )
            // InternalGame.g:492:2: ( ( rule__Condition__Group__0 ) )
            {
            // InternalGame.g:492:2: ( ( rule__Condition__Group__0 ) )
            // InternalGame.g:493:3: ( rule__Condition__Group__0 )
            {
             before(grammarAccess.getConditionAccess().getGroup()); 
            // InternalGame.g:494:3: ( rule__Condition__Group__0 )
            // InternalGame.g:494:4: rule__Condition__Group__0
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
    // InternalGame.g:503:1: entryRuleChemins : ruleChemins EOF ;
    public final void entryRuleChemins() throws RecognitionException {
        try {
            // InternalGame.g:504:1: ( ruleChemins EOF )
            // InternalGame.g:505:1: ruleChemins EOF
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
    // InternalGame.g:512:1: ruleChemins : ( ( rule__Chemins__Group__0 ) ) ;
    public final void ruleChemins() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:516:2: ( ( ( rule__Chemins__Group__0 ) ) )
            // InternalGame.g:517:2: ( ( rule__Chemins__Group__0 ) )
            {
            // InternalGame.g:517:2: ( ( rule__Chemins__Group__0 ) )
            // InternalGame.g:518:3: ( rule__Chemins__Group__0 )
            {
             before(grammarAccess.getCheminsAccess().getGroup()); 
            // InternalGame.g:519:3: ( rule__Chemins__Group__0 )
            // InternalGame.g:519:4: rule__Chemins__Group__0
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
    // InternalGame.g:528:1: entryRuleChemin : ruleChemin EOF ;
    public final void entryRuleChemin() throws RecognitionException {
        try {
            // InternalGame.g:529:1: ( ruleChemin EOF )
            // InternalGame.g:530:1: ruleChemin EOF
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
    // InternalGame.g:537:1: ruleChemin : ( ( rule__Chemin__Group__0 ) ) ;
    public final void ruleChemin() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:541:2: ( ( ( rule__Chemin__Group__0 ) ) )
            // InternalGame.g:542:2: ( ( rule__Chemin__Group__0 ) )
            {
            // InternalGame.g:542:2: ( ( rule__Chemin__Group__0 ) )
            // InternalGame.g:543:3: ( rule__Chemin__Group__0 )
            {
             before(grammarAccess.getCheminAccess().getGroup()); 
            // InternalGame.g:544:3: ( rule__Chemin__Group__0 )
            // InternalGame.g:544:4: rule__Chemin__Group__0
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
    // InternalGame.g:553:1: ruleTypeLieu : ( ( rule__TypeLieu__Alternatives ) ) ;
    public final void ruleTypeLieu() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:557:1: ( ( ( rule__TypeLieu__Alternatives ) ) )
            // InternalGame.g:558:2: ( ( rule__TypeLieu__Alternatives ) )
            {
            // InternalGame.g:558:2: ( ( rule__TypeLieu__Alternatives ) )
            // InternalGame.g:559:3: ( rule__TypeLieu__Alternatives )
            {
             before(grammarAccess.getTypeLieuAccess().getAlternatives()); 
            // InternalGame.g:560:3: ( rule__TypeLieu__Alternatives )
            // InternalGame.g:560:4: rule__TypeLieu__Alternatives
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
    // InternalGame.g:568:1: rule__TerritoireElement__Alternatives : ( ( ruleExplorateur ) | ( ruleLieu ) | ( ruleObjetsExplorateur ) | ( ruleObjetsLieu ) | ( ruleConnaissances ) | ( rulePersonnes ) | ( ruleChemins ) | ( ruleConditions ) );
    public final void rule__TerritoireElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:572:1: ( ( ruleExplorateur ) | ( ruleLieu ) | ( ruleObjetsExplorateur ) | ( ruleObjetsLieu ) | ( ruleConnaissances ) | ( rulePersonnes ) | ( ruleChemins ) | ( ruleConditions ) )
            int alt1=8;
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
            case 44:
                {
                alt1=3;
                }
                break;
            case 45:
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
            case 47:
                {
                alt1=7;
                }
                break;
            case 46:
                {
                alt1=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalGame.g:573:2: ( ruleExplorateur )
                    {
                    // InternalGame.g:573:2: ( ruleExplorateur )
                    // InternalGame.g:574:3: ruleExplorateur
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
                    // InternalGame.g:579:2: ( ruleLieu )
                    {
                    // InternalGame.g:579:2: ( ruleLieu )
                    // InternalGame.g:580:3: ruleLieu
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
                    // InternalGame.g:585:2: ( ruleObjetsExplorateur )
                    {
                    // InternalGame.g:585:2: ( ruleObjetsExplorateur )
                    // InternalGame.g:586:3: ruleObjetsExplorateur
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
                    // InternalGame.g:591:2: ( ruleObjetsLieu )
                    {
                    // InternalGame.g:591:2: ( ruleObjetsLieu )
                    // InternalGame.g:592:3: ruleObjetsLieu
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
                    // InternalGame.g:597:2: ( ruleConnaissances )
                    {
                    // InternalGame.g:597:2: ( ruleConnaissances )
                    // InternalGame.g:598:3: ruleConnaissances
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
                    // InternalGame.g:603:2: ( rulePersonnes )
                    {
                    // InternalGame.g:603:2: ( rulePersonnes )
                    // InternalGame.g:604:3: rulePersonnes
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
                    // InternalGame.g:609:2: ( ruleChemins )
                    {
                    // InternalGame.g:609:2: ( ruleChemins )
                    // InternalGame.g:610:3: ruleChemins
                    {
                     before(grammarAccess.getTerritoireElementAccess().getCheminsParserRuleCall_6()); 
                    pushFollow(FOLLOW_2);
                    ruleChemins();

                    state._fsp--;

                     after(grammarAccess.getTerritoireElementAccess().getCheminsParserRuleCall_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalGame.g:615:2: ( ruleConditions )
                    {
                    // InternalGame.g:615:2: ( ruleConditions )
                    // InternalGame.g:616:3: ruleConditions
                    {
                     before(grammarAccess.getTerritoireElementAccess().getConditionsParserRuleCall_7()); 
                    pushFollow(FOLLOW_2);
                    ruleConditions();

                    state._fsp--;

                     after(grammarAccess.getTerritoireElementAccess().getConditionsParserRuleCall_7()); 

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
    // InternalGame.g:625:1: rule__TypeLieu__Alternatives : ( ( ( 'debut' ) ) | ( ( 'fin' ) ) | ( ( 'intermediaire' ) ) );
    public final void rule__TypeLieu__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:629:1: ( ( ( 'debut' ) ) | ( ( 'fin' ) ) | ( ( 'intermediaire' ) ) )
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
                    // InternalGame.g:630:2: ( ( 'debut' ) )
                    {
                    // InternalGame.g:630:2: ( ( 'debut' ) )
                    // InternalGame.g:631:3: ( 'debut' )
                    {
                     before(grammarAccess.getTypeLieuAccess().getLieuDebutEnumLiteralDeclaration_0()); 
                    // InternalGame.g:632:3: ( 'debut' )
                    // InternalGame.g:632:4: 'debut'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getTypeLieuAccess().getLieuDebutEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGame.g:636:2: ( ( 'fin' ) )
                    {
                    // InternalGame.g:636:2: ( ( 'fin' ) )
                    // InternalGame.g:637:3: ( 'fin' )
                    {
                     before(grammarAccess.getTypeLieuAccess().getLieuFinEnumLiteralDeclaration_1()); 
                    // InternalGame.g:638:3: ( 'fin' )
                    // InternalGame.g:638:4: 'fin'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getTypeLieuAccess().getLieuFinEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalGame.g:642:2: ( ( 'intermediaire' ) )
                    {
                    // InternalGame.g:642:2: ( ( 'intermediaire' ) )
                    // InternalGame.g:643:3: ( 'intermediaire' )
                    {
                     before(grammarAccess.getTypeLieuAccess().getLieuIntermediaireEnumLiteralDeclaration_2()); 
                    // InternalGame.g:644:3: ( 'intermediaire' )
                    // InternalGame.g:644:4: 'intermediaire'
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
    // InternalGame.g:652:1: rule__Game__Group__0 : rule__Game__Group__0__Impl rule__Game__Group__1 ;
    public final void rule__Game__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:656:1: ( rule__Game__Group__0__Impl rule__Game__Group__1 )
            // InternalGame.g:657:2: rule__Game__Group__0__Impl rule__Game__Group__1
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
    // InternalGame.g:664:1: rule__Game__Group__0__Impl : ( 'territoire' ) ;
    public final void rule__Game__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:668:1: ( ( 'territoire' ) )
            // InternalGame.g:669:1: ( 'territoire' )
            {
            // InternalGame.g:669:1: ( 'territoire' )
            // InternalGame.g:670:2: 'territoire'
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
    // InternalGame.g:679:1: rule__Game__Group__1 : rule__Game__Group__1__Impl rule__Game__Group__2 ;
    public final void rule__Game__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:683:1: ( rule__Game__Group__1__Impl rule__Game__Group__2 )
            // InternalGame.g:684:2: rule__Game__Group__1__Impl rule__Game__Group__2
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
    // InternalGame.g:691:1: rule__Game__Group__1__Impl : ( ( rule__Game__NameAssignment_1 ) ) ;
    public final void rule__Game__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:695:1: ( ( ( rule__Game__NameAssignment_1 ) ) )
            // InternalGame.g:696:1: ( ( rule__Game__NameAssignment_1 ) )
            {
            // InternalGame.g:696:1: ( ( rule__Game__NameAssignment_1 ) )
            // InternalGame.g:697:2: ( rule__Game__NameAssignment_1 )
            {
             before(grammarAccess.getGameAccess().getNameAssignment_1()); 
            // InternalGame.g:698:2: ( rule__Game__NameAssignment_1 )
            // InternalGame.g:698:3: rule__Game__NameAssignment_1
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
    // InternalGame.g:706:1: rule__Game__Group__2 : rule__Game__Group__2__Impl rule__Game__Group__3 ;
    public final void rule__Game__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:710:1: ( rule__Game__Group__2__Impl rule__Game__Group__3 )
            // InternalGame.g:711:2: rule__Game__Group__2__Impl rule__Game__Group__3
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
    // InternalGame.g:718:1: rule__Game__Group__2__Impl : ( '{' ) ;
    public final void rule__Game__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:722:1: ( ( '{' ) )
            // InternalGame.g:723:1: ( '{' )
            {
            // InternalGame.g:723:1: ( '{' )
            // InternalGame.g:724:2: '{'
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
    // InternalGame.g:733:1: rule__Game__Group__3 : rule__Game__Group__3__Impl rule__Game__Group__4 ;
    public final void rule__Game__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:737:1: ( rule__Game__Group__3__Impl rule__Game__Group__4 )
            // InternalGame.g:738:2: rule__Game__Group__3__Impl rule__Game__Group__4
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
    // InternalGame.g:745:1: rule__Game__Group__3__Impl : ( ( ( rule__Game__TerritoireElementsAssignment_3 ) ) ( ( rule__Game__TerritoireElementsAssignment_3 )* ) ) ;
    public final void rule__Game__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:749:1: ( ( ( ( rule__Game__TerritoireElementsAssignment_3 ) ) ( ( rule__Game__TerritoireElementsAssignment_3 )* ) ) )
            // InternalGame.g:750:1: ( ( ( rule__Game__TerritoireElementsAssignment_3 ) ) ( ( rule__Game__TerritoireElementsAssignment_3 )* ) )
            {
            // InternalGame.g:750:1: ( ( ( rule__Game__TerritoireElementsAssignment_3 ) ) ( ( rule__Game__TerritoireElementsAssignment_3 )* ) )
            // InternalGame.g:751:2: ( ( rule__Game__TerritoireElementsAssignment_3 ) ) ( ( rule__Game__TerritoireElementsAssignment_3 )* )
            {
            // InternalGame.g:751:2: ( ( rule__Game__TerritoireElementsAssignment_3 ) )
            // InternalGame.g:752:3: ( rule__Game__TerritoireElementsAssignment_3 )
            {
             before(grammarAccess.getGameAccess().getTerritoireElementsAssignment_3()); 
            // InternalGame.g:753:3: ( rule__Game__TerritoireElementsAssignment_3 )
            // InternalGame.g:753:4: rule__Game__TerritoireElementsAssignment_3
            {
            pushFollow(FOLLOW_7);
            rule__Game__TerritoireElementsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getGameAccess().getTerritoireElementsAssignment_3()); 

            }

            // InternalGame.g:756:2: ( ( rule__Game__TerritoireElementsAssignment_3 )* )
            // InternalGame.g:757:3: ( rule__Game__TerritoireElementsAssignment_3 )*
            {
             before(grammarAccess.getGameAccess().getTerritoireElementsAssignment_3()); 
            // InternalGame.g:758:3: ( rule__Game__TerritoireElementsAssignment_3 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>=13 && LA3_0<=15)||(LA3_0>=19 && LA3_0<=20)||LA3_0==25||(LA3_0>=44 && LA3_0<=47)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalGame.g:758:4: rule__Game__TerritoireElementsAssignment_3
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
    // InternalGame.g:767:1: rule__Game__Group__4 : rule__Game__Group__4__Impl ;
    public final void rule__Game__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:771:1: ( rule__Game__Group__4__Impl )
            // InternalGame.g:772:2: rule__Game__Group__4__Impl
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
    // InternalGame.g:778:1: rule__Game__Group__4__Impl : ( '}' ) ;
    public final void rule__Game__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:782:1: ( ( '}' ) )
            // InternalGame.g:783:1: ( '}' )
            {
            // InternalGame.g:783:1: ( '}' )
            // InternalGame.g:784:2: '}'
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
    // InternalGame.g:794:1: rule__Explorateur__Group__0 : rule__Explorateur__Group__0__Impl rule__Explorateur__Group__1 ;
    public final void rule__Explorateur__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:798:1: ( rule__Explorateur__Group__0__Impl rule__Explorateur__Group__1 )
            // InternalGame.g:799:2: rule__Explorateur__Group__0__Impl rule__Explorateur__Group__1
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
    // InternalGame.g:806:1: rule__Explorateur__Group__0__Impl : ( 'explorateur' ) ;
    public final void rule__Explorateur__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:810:1: ( ( 'explorateur' ) )
            // InternalGame.g:811:1: ( 'explorateur' )
            {
            // InternalGame.g:811:1: ( 'explorateur' )
            // InternalGame.g:812:2: 'explorateur'
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
    // InternalGame.g:821:1: rule__Explorateur__Group__1 : rule__Explorateur__Group__1__Impl rule__Explorateur__Group__2 ;
    public final void rule__Explorateur__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:825:1: ( rule__Explorateur__Group__1__Impl rule__Explorateur__Group__2 )
            // InternalGame.g:826:2: rule__Explorateur__Group__1__Impl rule__Explorateur__Group__2
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
    // InternalGame.g:833:1: rule__Explorateur__Group__1__Impl : ( ( rule__Explorateur__NameAssignment_1 ) ) ;
    public final void rule__Explorateur__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:837:1: ( ( ( rule__Explorateur__NameAssignment_1 ) ) )
            // InternalGame.g:838:1: ( ( rule__Explorateur__NameAssignment_1 ) )
            {
            // InternalGame.g:838:1: ( ( rule__Explorateur__NameAssignment_1 ) )
            // InternalGame.g:839:2: ( rule__Explorateur__NameAssignment_1 )
            {
             before(grammarAccess.getExplorateurAccess().getNameAssignment_1()); 
            // InternalGame.g:840:2: ( rule__Explorateur__NameAssignment_1 )
            // InternalGame.g:840:3: rule__Explorateur__NameAssignment_1
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
    // InternalGame.g:848:1: rule__Explorateur__Group__2 : rule__Explorateur__Group__2__Impl rule__Explorateur__Group__3 ;
    public final void rule__Explorateur__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:852:1: ( rule__Explorateur__Group__2__Impl rule__Explorateur__Group__3 )
            // InternalGame.g:853:2: rule__Explorateur__Group__2__Impl rule__Explorateur__Group__3
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
    // InternalGame.g:860:1: rule__Explorateur__Group__2__Impl : ( '{' ) ;
    public final void rule__Explorateur__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:864:1: ( ( '{' ) )
            // InternalGame.g:865:1: ( '{' )
            {
            // InternalGame.g:865:1: ( '{' )
            // InternalGame.g:866:2: '{'
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
    // InternalGame.g:875:1: rule__Explorateur__Group__3 : rule__Explorateur__Group__3__Impl rule__Explorateur__Group__4 ;
    public final void rule__Explorateur__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:879:1: ( rule__Explorateur__Group__3__Impl rule__Explorateur__Group__4 )
            // InternalGame.g:880:2: rule__Explorateur__Group__3__Impl rule__Explorateur__Group__4
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
    // InternalGame.g:887:1: rule__Explorateur__Group__3__Impl : ( ( rule__Explorateur__SacAssignment_3 ) ) ;
    public final void rule__Explorateur__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:891:1: ( ( ( rule__Explorateur__SacAssignment_3 ) ) )
            // InternalGame.g:892:1: ( ( rule__Explorateur__SacAssignment_3 ) )
            {
            // InternalGame.g:892:1: ( ( rule__Explorateur__SacAssignment_3 ) )
            // InternalGame.g:893:2: ( rule__Explorateur__SacAssignment_3 )
            {
             before(grammarAccess.getExplorateurAccess().getSacAssignment_3()); 
            // InternalGame.g:894:2: ( rule__Explorateur__SacAssignment_3 )
            // InternalGame.g:894:3: rule__Explorateur__SacAssignment_3
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
    // InternalGame.g:902:1: rule__Explorateur__Group__4 : rule__Explorateur__Group__4__Impl rule__Explorateur__Group__5 ;
    public final void rule__Explorateur__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:906:1: ( rule__Explorateur__Group__4__Impl rule__Explorateur__Group__5 )
            // InternalGame.g:907:2: rule__Explorateur__Group__4__Impl rule__Explorateur__Group__5
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
    // InternalGame.g:914:1: rule__Explorateur__Group__4__Impl : ( 'connaissances' ) ;
    public final void rule__Explorateur__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:918:1: ( ( 'connaissances' ) )
            // InternalGame.g:919:1: ( 'connaissances' )
            {
            // InternalGame.g:919:1: ( 'connaissances' )
            // InternalGame.g:920:2: 'connaissances'
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
    // InternalGame.g:929:1: rule__Explorateur__Group__5 : rule__Explorateur__Group__5__Impl rule__Explorateur__Group__6 ;
    public final void rule__Explorateur__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:933:1: ( rule__Explorateur__Group__5__Impl rule__Explorateur__Group__6 )
            // InternalGame.g:934:2: rule__Explorateur__Group__5__Impl rule__Explorateur__Group__6
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
    // InternalGame.g:941:1: rule__Explorateur__Group__5__Impl : ( ( rule__Explorateur__ConnaissancesAssignment_5 )* ) ;
    public final void rule__Explorateur__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:945:1: ( ( ( rule__Explorateur__ConnaissancesAssignment_5 )* ) )
            // InternalGame.g:946:1: ( ( rule__Explorateur__ConnaissancesAssignment_5 )* )
            {
            // InternalGame.g:946:1: ( ( rule__Explorateur__ConnaissancesAssignment_5 )* )
            // InternalGame.g:947:2: ( rule__Explorateur__ConnaissancesAssignment_5 )*
            {
             before(grammarAccess.getExplorateurAccess().getConnaissancesAssignment_5()); 
            // InternalGame.g:948:2: ( rule__Explorateur__ConnaissancesAssignment_5 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_ID) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalGame.g:948:3: rule__Explorateur__ConnaissancesAssignment_5
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
    // InternalGame.g:956:1: rule__Explorateur__Group__6 : rule__Explorateur__Group__6__Impl rule__Explorateur__Group__7 ;
    public final void rule__Explorateur__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:960:1: ( rule__Explorateur__Group__6__Impl rule__Explorateur__Group__7 )
            // InternalGame.g:961:2: rule__Explorateur__Group__6__Impl rule__Explorateur__Group__7
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
    // InternalGame.g:968:1: rule__Explorateur__Group__6__Impl : ( 'position' ) ;
    public final void rule__Explorateur__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:972:1: ( ( 'position' ) )
            // InternalGame.g:973:1: ( 'position' )
            {
            // InternalGame.g:973:1: ( 'position' )
            // InternalGame.g:974:2: 'position'
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
    // InternalGame.g:983:1: rule__Explorateur__Group__7 : rule__Explorateur__Group__7__Impl rule__Explorateur__Group__8 ;
    public final void rule__Explorateur__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:987:1: ( rule__Explorateur__Group__7__Impl rule__Explorateur__Group__8 )
            // InternalGame.g:988:2: rule__Explorateur__Group__7__Impl rule__Explorateur__Group__8
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
    // InternalGame.g:995:1: rule__Explorateur__Group__7__Impl : ( ( rule__Explorateur__PositionAssignment_7 ) ) ;
    public final void rule__Explorateur__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:999:1: ( ( ( rule__Explorateur__PositionAssignment_7 ) ) )
            // InternalGame.g:1000:1: ( ( rule__Explorateur__PositionAssignment_7 ) )
            {
            // InternalGame.g:1000:1: ( ( rule__Explorateur__PositionAssignment_7 ) )
            // InternalGame.g:1001:2: ( rule__Explorateur__PositionAssignment_7 )
            {
             before(grammarAccess.getExplorateurAccess().getPositionAssignment_7()); 
            // InternalGame.g:1002:2: ( rule__Explorateur__PositionAssignment_7 )
            // InternalGame.g:1002:3: rule__Explorateur__PositionAssignment_7
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
    // InternalGame.g:1010:1: rule__Explorateur__Group__8 : rule__Explorateur__Group__8__Impl ;
    public final void rule__Explorateur__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1014:1: ( rule__Explorateur__Group__8__Impl )
            // InternalGame.g:1015:2: rule__Explorateur__Group__8__Impl
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
    // InternalGame.g:1021:1: rule__Explorateur__Group__8__Impl : ( '}' ) ;
    public final void rule__Explorateur__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1025:1: ( ( '}' ) )
            // InternalGame.g:1026:1: ( '}' )
            {
            // InternalGame.g:1026:1: ( '}' )
            // InternalGame.g:1027:2: '}'
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
    // InternalGame.g:1037:1: rule__Sac__Group__0 : rule__Sac__Group__0__Impl rule__Sac__Group__1 ;
    public final void rule__Sac__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1041:1: ( rule__Sac__Group__0__Impl rule__Sac__Group__1 )
            // InternalGame.g:1042:2: rule__Sac__Group__0__Impl rule__Sac__Group__1
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
    // InternalGame.g:1049:1: rule__Sac__Group__0__Impl : ( 'sac' ) ;
    public final void rule__Sac__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1053:1: ( ( 'sac' ) )
            // InternalGame.g:1054:1: ( 'sac' )
            {
            // InternalGame.g:1054:1: ( 'sac' )
            // InternalGame.g:1055:2: 'sac'
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
    // InternalGame.g:1064:1: rule__Sac__Group__1 : rule__Sac__Group__1__Impl rule__Sac__Group__2 ;
    public final void rule__Sac__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1068:1: ( rule__Sac__Group__1__Impl rule__Sac__Group__2 )
            // InternalGame.g:1069:2: rule__Sac__Group__1__Impl rule__Sac__Group__2
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
    // InternalGame.g:1076:1: rule__Sac__Group__1__Impl : ( ( rule__Sac__TailleAssignment_1 ) ) ;
    public final void rule__Sac__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1080:1: ( ( ( rule__Sac__TailleAssignment_1 ) ) )
            // InternalGame.g:1081:1: ( ( rule__Sac__TailleAssignment_1 ) )
            {
            // InternalGame.g:1081:1: ( ( rule__Sac__TailleAssignment_1 ) )
            // InternalGame.g:1082:2: ( rule__Sac__TailleAssignment_1 )
            {
             before(grammarAccess.getSacAccess().getTailleAssignment_1()); 
            // InternalGame.g:1083:2: ( rule__Sac__TailleAssignment_1 )
            // InternalGame.g:1083:3: rule__Sac__TailleAssignment_1
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
    // InternalGame.g:1091:1: rule__Sac__Group__2 : rule__Sac__Group__2__Impl rule__Sac__Group__3 ;
    public final void rule__Sac__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1095:1: ( rule__Sac__Group__2__Impl rule__Sac__Group__3 )
            // InternalGame.g:1096:2: rule__Sac__Group__2__Impl rule__Sac__Group__3
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
    // InternalGame.g:1103:1: rule__Sac__Group__2__Impl : ( '{' ) ;
    public final void rule__Sac__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1107:1: ( ( '{' ) )
            // InternalGame.g:1108:1: ( '{' )
            {
            // InternalGame.g:1108:1: ( '{' )
            // InternalGame.g:1109:2: '{'
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
    // InternalGame.g:1118:1: rule__Sac__Group__3 : rule__Sac__Group__3__Impl rule__Sac__Group__4 ;
    public final void rule__Sac__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1122:1: ( rule__Sac__Group__3__Impl rule__Sac__Group__4 )
            // InternalGame.g:1123:2: rule__Sac__Group__3__Impl rule__Sac__Group__4
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
    // InternalGame.g:1130:1: rule__Sac__Group__3__Impl : ( ( rule__Sac__SacElementsAssignment_3 )* ) ;
    public final void rule__Sac__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1134:1: ( ( ( rule__Sac__SacElementsAssignment_3 )* ) )
            // InternalGame.g:1135:1: ( ( rule__Sac__SacElementsAssignment_3 )* )
            {
            // InternalGame.g:1135:1: ( ( rule__Sac__SacElementsAssignment_3 )* )
            // InternalGame.g:1136:2: ( rule__Sac__SacElementsAssignment_3 )*
            {
             before(grammarAccess.getSacAccess().getSacElementsAssignment_3()); 
            // InternalGame.g:1137:2: ( rule__Sac__SacElementsAssignment_3 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_ID) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalGame.g:1137:3: rule__Sac__SacElementsAssignment_3
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
    // InternalGame.g:1145:1: rule__Sac__Group__4 : rule__Sac__Group__4__Impl ;
    public final void rule__Sac__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1149:1: ( rule__Sac__Group__4__Impl )
            // InternalGame.g:1150:2: rule__Sac__Group__4__Impl
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
    // InternalGame.g:1156:1: rule__Sac__Group__4__Impl : ( '}' ) ;
    public final void rule__Sac__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1160:1: ( ( '}' ) )
            // InternalGame.g:1161:1: ( '}' )
            {
            // InternalGame.g:1161:1: ( '}' )
            // InternalGame.g:1162:2: '}'
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
    // InternalGame.g:1172:1: rule__Lieu__Group__0 : rule__Lieu__Group__0__Impl rule__Lieu__Group__1 ;
    public final void rule__Lieu__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1176:1: ( rule__Lieu__Group__0__Impl rule__Lieu__Group__1 )
            // InternalGame.g:1177:2: rule__Lieu__Group__0__Impl rule__Lieu__Group__1
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
    // InternalGame.g:1184:1: rule__Lieu__Group__0__Impl : ( ( rule__Lieu__TypeAssignment_0 ) ) ;
    public final void rule__Lieu__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1188:1: ( ( ( rule__Lieu__TypeAssignment_0 ) ) )
            // InternalGame.g:1189:1: ( ( rule__Lieu__TypeAssignment_0 ) )
            {
            // InternalGame.g:1189:1: ( ( rule__Lieu__TypeAssignment_0 ) )
            // InternalGame.g:1190:2: ( rule__Lieu__TypeAssignment_0 )
            {
             before(grammarAccess.getLieuAccess().getTypeAssignment_0()); 
            // InternalGame.g:1191:2: ( rule__Lieu__TypeAssignment_0 )
            // InternalGame.g:1191:3: rule__Lieu__TypeAssignment_0
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
    // InternalGame.g:1199:1: rule__Lieu__Group__1 : rule__Lieu__Group__1__Impl rule__Lieu__Group__2 ;
    public final void rule__Lieu__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1203:1: ( rule__Lieu__Group__1__Impl rule__Lieu__Group__2 )
            // InternalGame.g:1204:2: rule__Lieu__Group__1__Impl rule__Lieu__Group__2
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
    // InternalGame.g:1211:1: rule__Lieu__Group__1__Impl : ( ( rule__Lieu__NameAssignment_1 ) ) ;
    public final void rule__Lieu__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1215:1: ( ( ( rule__Lieu__NameAssignment_1 ) ) )
            // InternalGame.g:1216:1: ( ( rule__Lieu__NameAssignment_1 ) )
            {
            // InternalGame.g:1216:1: ( ( rule__Lieu__NameAssignment_1 ) )
            // InternalGame.g:1217:2: ( rule__Lieu__NameAssignment_1 )
            {
             before(grammarAccess.getLieuAccess().getNameAssignment_1()); 
            // InternalGame.g:1218:2: ( rule__Lieu__NameAssignment_1 )
            // InternalGame.g:1218:3: rule__Lieu__NameAssignment_1
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
    // InternalGame.g:1226:1: rule__Lieu__Group__2 : rule__Lieu__Group__2__Impl rule__Lieu__Group__3 ;
    public final void rule__Lieu__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1230:1: ( rule__Lieu__Group__2__Impl rule__Lieu__Group__3 )
            // InternalGame.g:1231:2: rule__Lieu__Group__2__Impl rule__Lieu__Group__3
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
    // InternalGame.g:1238:1: rule__Lieu__Group__2__Impl : ( '{' ) ;
    public final void rule__Lieu__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1242:1: ( ( '{' ) )
            // InternalGame.g:1243:1: ( '{' )
            {
            // InternalGame.g:1243:1: ( '{' )
            // InternalGame.g:1244:2: '{'
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
    // InternalGame.g:1253:1: rule__Lieu__Group__3 : rule__Lieu__Group__3__Impl rule__Lieu__Group__4 ;
    public final void rule__Lieu__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1257:1: ( rule__Lieu__Group__3__Impl rule__Lieu__Group__4 )
            // InternalGame.g:1258:2: rule__Lieu__Group__3__Impl rule__Lieu__Group__4
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
    // InternalGame.g:1265:1: rule__Lieu__Group__3__Impl : ( ( rule__Lieu__Group_3__0 )? ) ;
    public final void rule__Lieu__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1269:1: ( ( ( rule__Lieu__Group_3__0 )? ) )
            // InternalGame.g:1270:1: ( ( rule__Lieu__Group_3__0 )? )
            {
            // InternalGame.g:1270:1: ( ( rule__Lieu__Group_3__0 )? )
            // InternalGame.g:1271:2: ( rule__Lieu__Group_3__0 )?
            {
             before(grammarAccess.getLieuAccess().getGroup_3()); 
            // InternalGame.g:1272:2: ( rule__Lieu__Group_3__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==23) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalGame.g:1272:3: rule__Lieu__Group_3__0
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
    // InternalGame.g:1280:1: rule__Lieu__Group__4 : rule__Lieu__Group__4__Impl rule__Lieu__Group__5 ;
    public final void rule__Lieu__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1284:1: ( rule__Lieu__Group__4__Impl rule__Lieu__Group__5 )
            // InternalGame.g:1285:2: rule__Lieu__Group__4__Impl rule__Lieu__Group__5
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
    // InternalGame.g:1292:1: rule__Lieu__Group__4__Impl : ( ( rule__Lieu__PersonnesAssignment_4 )* ) ;
    public final void rule__Lieu__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1296:1: ( ( ( rule__Lieu__PersonnesAssignment_4 )* ) )
            // InternalGame.g:1297:1: ( ( rule__Lieu__PersonnesAssignment_4 )* )
            {
            // InternalGame.g:1297:1: ( ( rule__Lieu__PersonnesAssignment_4 )* )
            // InternalGame.g:1298:2: ( rule__Lieu__PersonnesAssignment_4 )*
            {
             before(grammarAccess.getLieuAccess().getPersonnesAssignment_4()); 
            // InternalGame.g:1299:2: ( rule__Lieu__PersonnesAssignment_4 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalGame.g:1299:3: rule__Lieu__PersonnesAssignment_4
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
    // InternalGame.g:1307:1: rule__Lieu__Group__5 : rule__Lieu__Group__5__Impl rule__Lieu__Group__6 ;
    public final void rule__Lieu__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1311:1: ( rule__Lieu__Group__5__Impl rule__Lieu__Group__6 )
            // InternalGame.g:1312:2: rule__Lieu__Group__5__Impl rule__Lieu__Group__6
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
    // InternalGame.g:1319:1: rule__Lieu__Group__5__Impl : ( ( rule__Lieu__ConnaissancesAssignment_5 )* ) ;
    public final void rule__Lieu__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1323:1: ( ( ( rule__Lieu__ConnaissancesAssignment_5 )* ) )
            // InternalGame.g:1324:1: ( ( rule__Lieu__ConnaissancesAssignment_5 )* )
            {
            // InternalGame.g:1324:1: ( ( rule__Lieu__ConnaissancesAssignment_5 )* )
            // InternalGame.g:1325:2: ( rule__Lieu__ConnaissancesAssignment_5 )*
            {
             before(grammarAccess.getLieuAccess().getConnaissancesAssignment_5()); 
            // InternalGame.g:1326:2: ( rule__Lieu__ConnaissancesAssignment_5 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ID) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalGame.g:1326:3: rule__Lieu__ConnaissancesAssignment_5
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
    // InternalGame.g:1334:1: rule__Lieu__Group__6 : rule__Lieu__Group__6__Impl rule__Lieu__Group__7 ;
    public final void rule__Lieu__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1338:1: ( rule__Lieu__Group__6__Impl rule__Lieu__Group__7 )
            // InternalGame.g:1339:2: rule__Lieu__Group__6__Impl rule__Lieu__Group__7
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
    // InternalGame.g:1346:1: rule__Lieu__Group__6__Impl : ( ( rule__Lieu__ObjetsAssignment_6 )* ) ;
    public final void rule__Lieu__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1350:1: ( ( ( rule__Lieu__ObjetsAssignment_6 )* ) )
            // InternalGame.g:1351:1: ( ( rule__Lieu__ObjetsAssignment_6 )* )
            {
            // InternalGame.g:1351:1: ( ( rule__Lieu__ObjetsAssignment_6 )* )
            // InternalGame.g:1352:2: ( rule__Lieu__ObjetsAssignment_6 )*
            {
             before(grammarAccess.getLieuAccess().getObjetsAssignment_6()); 
            // InternalGame.g:1353:2: ( rule__Lieu__ObjetsAssignment_6 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_ID) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalGame.g:1353:3: rule__Lieu__ObjetsAssignment_6
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
    // InternalGame.g:1361:1: rule__Lieu__Group__7 : rule__Lieu__Group__7__Impl rule__Lieu__Group__8 ;
    public final void rule__Lieu__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1365:1: ( rule__Lieu__Group__7__Impl rule__Lieu__Group__8 )
            // InternalGame.g:1366:2: rule__Lieu__Group__7__Impl rule__Lieu__Group__8
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
    // InternalGame.g:1373:1: rule__Lieu__Group__7__Impl : ( ( rule__Lieu__Group_7__0 )? ) ;
    public final void rule__Lieu__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1377:1: ( ( ( rule__Lieu__Group_7__0 )? ) )
            // InternalGame.g:1378:1: ( ( rule__Lieu__Group_7__0 )? )
            {
            // InternalGame.g:1378:1: ( ( rule__Lieu__Group_7__0 )? )
            // InternalGame.g:1379:2: ( rule__Lieu__Group_7__0 )?
            {
             before(grammarAccess.getLieuAccess().getGroup_7()); 
            // InternalGame.g:1380:2: ( rule__Lieu__Group_7__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==24) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalGame.g:1380:3: rule__Lieu__Group_7__0
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
    // InternalGame.g:1388:1: rule__Lieu__Group__8 : rule__Lieu__Group__8__Impl rule__Lieu__Group__9 ;
    public final void rule__Lieu__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1392:1: ( rule__Lieu__Group__8__Impl rule__Lieu__Group__9 )
            // InternalGame.g:1393:2: rule__Lieu__Group__8__Impl rule__Lieu__Group__9
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
    // InternalGame.g:1400:1: rule__Lieu__Group__8__Impl : ( ( rule__Lieu__ListeCheminsAssignment_8 )* ) ;
    public final void rule__Lieu__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1404:1: ( ( ( rule__Lieu__ListeCheminsAssignment_8 )* ) )
            // InternalGame.g:1405:1: ( ( rule__Lieu__ListeCheminsAssignment_8 )* )
            {
            // InternalGame.g:1405:1: ( ( rule__Lieu__ListeCheminsAssignment_8 )* )
            // InternalGame.g:1406:2: ( rule__Lieu__ListeCheminsAssignment_8 )*
            {
             before(grammarAccess.getLieuAccess().getListeCheminsAssignment_8()); 
            // InternalGame.g:1407:2: ( rule__Lieu__ListeCheminsAssignment_8 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_ID) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalGame.g:1407:3: rule__Lieu__ListeCheminsAssignment_8
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
    // InternalGame.g:1415:1: rule__Lieu__Group__9 : rule__Lieu__Group__9__Impl ;
    public final void rule__Lieu__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1419:1: ( rule__Lieu__Group__9__Impl )
            // InternalGame.g:1420:2: rule__Lieu__Group__9__Impl
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
    // InternalGame.g:1426:1: rule__Lieu__Group__9__Impl : ( '}' ) ;
    public final void rule__Lieu__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1430:1: ( ( '}' ) )
            // InternalGame.g:1431:1: ( '}' )
            {
            // InternalGame.g:1431:1: ( '}' )
            // InternalGame.g:1432:2: '}'
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
    // InternalGame.g:1442:1: rule__Lieu__Group_3__0 : rule__Lieu__Group_3__0__Impl rule__Lieu__Group_3__1 ;
    public final void rule__Lieu__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1446:1: ( rule__Lieu__Group_3__0__Impl rule__Lieu__Group_3__1 )
            // InternalGame.g:1447:2: rule__Lieu__Group_3__0__Impl rule__Lieu__Group_3__1
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
    // InternalGame.g:1454:1: rule__Lieu__Group_3__0__Impl : ( 'description' ) ;
    public final void rule__Lieu__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1458:1: ( ( 'description' ) )
            // InternalGame.g:1459:1: ( 'description' )
            {
            // InternalGame.g:1459:1: ( 'description' )
            // InternalGame.g:1460:2: 'description'
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
    // InternalGame.g:1469:1: rule__Lieu__Group_3__1 : rule__Lieu__Group_3__1__Impl rule__Lieu__Group_3__2 ;
    public final void rule__Lieu__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1473:1: ( rule__Lieu__Group_3__1__Impl rule__Lieu__Group_3__2 )
            // InternalGame.g:1474:2: rule__Lieu__Group_3__1__Impl rule__Lieu__Group_3__2
            {
            pushFollow(FOLLOW_3);
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
    // InternalGame.g:1481:1: rule__Lieu__Group_3__1__Impl : ( ( rule__Lieu__DescriptionAssignment_3_1 ) ) ;
    public final void rule__Lieu__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1485:1: ( ( ( rule__Lieu__DescriptionAssignment_3_1 ) ) )
            // InternalGame.g:1486:1: ( ( rule__Lieu__DescriptionAssignment_3_1 ) )
            {
            // InternalGame.g:1486:1: ( ( rule__Lieu__DescriptionAssignment_3_1 ) )
            // InternalGame.g:1487:2: ( rule__Lieu__DescriptionAssignment_3_1 )
            {
             before(grammarAccess.getLieuAccess().getDescriptionAssignment_3_1()); 
            // InternalGame.g:1488:2: ( rule__Lieu__DescriptionAssignment_3_1 )
            // InternalGame.g:1488:3: rule__Lieu__DescriptionAssignment_3_1
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
    // InternalGame.g:1496:1: rule__Lieu__Group_3__2 : rule__Lieu__Group_3__2__Impl ;
    public final void rule__Lieu__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1500:1: ( rule__Lieu__Group_3__2__Impl )
            // InternalGame.g:1501:2: rule__Lieu__Group_3__2__Impl
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
    // InternalGame.g:1507:1: rule__Lieu__Group_3__2__Impl : ( ( rule__Lieu__ConditionDescriptionAssignment_3_2 )? ) ;
    public final void rule__Lieu__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1511:1: ( ( ( rule__Lieu__ConditionDescriptionAssignment_3_2 )? ) )
            // InternalGame.g:1512:1: ( ( rule__Lieu__ConditionDescriptionAssignment_3_2 )? )
            {
            // InternalGame.g:1512:1: ( ( rule__Lieu__ConditionDescriptionAssignment_3_2 )? )
            // InternalGame.g:1513:2: ( rule__Lieu__ConditionDescriptionAssignment_3_2 )?
            {
             before(grammarAccess.getLieuAccess().getConditionDescriptionAssignment_3_2()); 
            // InternalGame.g:1514:2: ( rule__Lieu__ConditionDescriptionAssignment_3_2 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_ID) ) {
                int LA12_1 = input.LA(2);

                if ( (LA12_1==RULE_STRING) ) {
                    alt12=1;
                }
            }
            switch (alt12) {
                case 1 :
                    // InternalGame.g:1514:3: rule__Lieu__ConditionDescriptionAssignment_3_2
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
    // InternalGame.g:1523:1: rule__Lieu__Group_7__0 : rule__Lieu__Group_7__0__Impl rule__Lieu__Group_7__1 ;
    public final void rule__Lieu__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1527:1: ( rule__Lieu__Group_7__0__Impl rule__Lieu__Group_7__1 )
            // InternalGame.g:1528:2: rule__Lieu__Group_7__0__Impl rule__Lieu__Group_7__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalGame.g:1535:1: rule__Lieu__Group_7__0__Impl : ( 'depotO' ) ;
    public final void rule__Lieu__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1539:1: ( ( 'depotO' ) )
            // InternalGame.g:1540:1: ( 'depotO' )
            {
            // InternalGame.g:1540:1: ( 'depotO' )
            // InternalGame.g:1541:2: 'depotO'
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
    // InternalGame.g:1550:1: rule__Lieu__Group_7__1 : rule__Lieu__Group_7__1__Impl ;
    public final void rule__Lieu__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1554:1: ( rule__Lieu__Group_7__1__Impl )
            // InternalGame.g:1555:2: rule__Lieu__Group_7__1__Impl
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
    // InternalGame.g:1561:1: rule__Lieu__Group_7__1__Impl : ( ( rule__Lieu__DepotObjetAssignment_7_1 ) ) ;
    public final void rule__Lieu__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1565:1: ( ( ( rule__Lieu__DepotObjetAssignment_7_1 ) ) )
            // InternalGame.g:1566:1: ( ( rule__Lieu__DepotObjetAssignment_7_1 ) )
            {
            // InternalGame.g:1566:1: ( ( rule__Lieu__DepotObjetAssignment_7_1 ) )
            // InternalGame.g:1567:2: ( rule__Lieu__DepotObjetAssignment_7_1 )
            {
             before(grammarAccess.getLieuAccess().getDepotObjetAssignment_7_1()); 
            // InternalGame.g:1568:2: ( rule__Lieu__DepotObjetAssignment_7_1 )
            // InternalGame.g:1568:3: rule__Lieu__DepotObjetAssignment_7_1
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
    // InternalGame.g:1577:1: rule__Personnes__Group__0 : rule__Personnes__Group__0__Impl rule__Personnes__Group__1 ;
    public final void rule__Personnes__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1581:1: ( rule__Personnes__Group__0__Impl rule__Personnes__Group__1 )
            // InternalGame.g:1582:2: rule__Personnes__Group__0__Impl rule__Personnes__Group__1
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
    // InternalGame.g:1589:1: rule__Personnes__Group__0__Impl : ( 'personnes' ) ;
    public final void rule__Personnes__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1593:1: ( ( 'personnes' ) )
            // InternalGame.g:1594:1: ( 'personnes' )
            {
            // InternalGame.g:1594:1: ( 'personnes' )
            // InternalGame.g:1595:2: 'personnes'
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
    // InternalGame.g:1604:1: rule__Personnes__Group__1 : rule__Personnes__Group__1__Impl rule__Personnes__Group__2 ;
    public final void rule__Personnes__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1608:1: ( rule__Personnes__Group__1__Impl rule__Personnes__Group__2 )
            // InternalGame.g:1609:2: rule__Personnes__Group__1__Impl rule__Personnes__Group__2
            {
            pushFollow(FOLLOW_3);
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
    // InternalGame.g:1616:1: rule__Personnes__Group__1__Impl : ( '{' ) ;
    public final void rule__Personnes__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1620:1: ( ( '{' ) )
            // InternalGame.g:1621:1: ( '{' )
            {
            // InternalGame.g:1621:1: ( '{' )
            // InternalGame.g:1622:2: '{'
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
    // InternalGame.g:1631:1: rule__Personnes__Group__2 : rule__Personnes__Group__2__Impl rule__Personnes__Group__3 ;
    public final void rule__Personnes__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1635:1: ( rule__Personnes__Group__2__Impl rule__Personnes__Group__3 )
            // InternalGame.g:1636:2: rule__Personnes__Group__2__Impl rule__Personnes__Group__3
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
    // InternalGame.g:1643:1: rule__Personnes__Group__2__Impl : ( ( ( rule__Personnes__ListePersonnesAssignment_2 ) ) ( ( rule__Personnes__ListePersonnesAssignment_2 )* ) ) ;
    public final void rule__Personnes__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1647:1: ( ( ( ( rule__Personnes__ListePersonnesAssignment_2 ) ) ( ( rule__Personnes__ListePersonnesAssignment_2 )* ) ) )
            // InternalGame.g:1648:1: ( ( ( rule__Personnes__ListePersonnesAssignment_2 ) ) ( ( rule__Personnes__ListePersonnesAssignment_2 )* ) )
            {
            // InternalGame.g:1648:1: ( ( ( rule__Personnes__ListePersonnesAssignment_2 ) ) ( ( rule__Personnes__ListePersonnesAssignment_2 )* ) )
            // InternalGame.g:1649:2: ( ( rule__Personnes__ListePersonnesAssignment_2 ) ) ( ( rule__Personnes__ListePersonnesAssignment_2 )* )
            {
            // InternalGame.g:1649:2: ( ( rule__Personnes__ListePersonnesAssignment_2 ) )
            // InternalGame.g:1650:3: ( rule__Personnes__ListePersonnesAssignment_2 )
            {
             before(grammarAccess.getPersonnesAccess().getListePersonnesAssignment_2()); 
            // InternalGame.g:1651:3: ( rule__Personnes__ListePersonnesAssignment_2 )
            // InternalGame.g:1651:4: rule__Personnes__ListePersonnesAssignment_2
            {
            pushFollow(FOLLOW_11);
            rule__Personnes__ListePersonnesAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getPersonnesAccess().getListePersonnesAssignment_2()); 

            }

            // InternalGame.g:1654:2: ( ( rule__Personnes__ListePersonnesAssignment_2 )* )
            // InternalGame.g:1655:3: ( rule__Personnes__ListePersonnesAssignment_2 )*
            {
             before(grammarAccess.getPersonnesAccess().getListePersonnesAssignment_2()); 
            // InternalGame.g:1656:3: ( rule__Personnes__ListePersonnesAssignment_2 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_ID) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalGame.g:1656:4: rule__Personnes__ListePersonnesAssignment_2
            	    {
            	    pushFollow(FOLLOW_11);
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
    // InternalGame.g:1665:1: rule__Personnes__Group__3 : rule__Personnes__Group__3__Impl ;
    public final void rule__Personnes__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1669:1: ( rule__Personnes__Group__3__Impl )
            // InternalGame.g:1670:2: rule__Personnes__Group__3__Impl
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
    // InternalGame.g:1676:1: rule__Personnes__Group__3__Impl : ( '}' ) ;
    public final void rule__Personnes__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1680:1: ( ( '}' ) )
            // InternalGame.g:1681:1: ( '}' )
            {
            // InternalGame.g:1681:1: ( '}' )
            // InternalGame.g:1682:2: '}'
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
    // InternalGame.g:1692:1: rule__Personne__Group__0 : rule__Personne__Group__0__Impl rule__Personne__Group__1 ;
    public final void rule__Personne__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1696:1: ( rule__Personne__Group__0__Impl rule__Personne__Group__1 )
            // InternalGame.g:1697:2: rule__Personne__Group__0__Impl rule__Personne__Group__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalGame.g:1704:1: rule__Personne__Group__0__Impl : ( ( rule__Personne__NameAssignment_0 ) ) ;
    public final void rule__Personne__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1708:1: ( ( ( rule__Personne__NameAssignment_0 ) ) )
            // InternalGame.g:1709:1: ( ( rule__Personne__NameAssignment_0 ) )
            {
            // InternalGame.g:1709:1: ( ( rule__Personne__NameAssignment_0 ) )
            // InternalGame.g:1710:2: ( rule__Personne__NameAssignment_0 )
            {
             before(grammarAccess.getPersonneAccess().getNameAssignment_0()); 
            // InternalGame.g:1711:2: ( rule__Personne__NameAssignment_0 )
            // InternalGame.g:1711:3: rule__Personne__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Personne__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getPersonneAccess().getNameAssignment_0()); 

            }


            }

        }
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
    // InternalGame.g:1719:1: rule__Personne__Group__1 : rule__Personne__Group__1__Impl rule__Personne__Group__2 ;
    public final void rule__Personne__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1723:1: ( rule__Personne__Group__1__Impl rule__Personne__Group__2 )
            // InternalGame.g:1724:2: rule__Personne__Group__1__Impl rule__Personne__Group__2
            {
            pushFollow(FOLLOW_16);
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
    // InternalGame.g:1731:1: rule__Personne__Group__1__Impl : ( '{' ) ;
    public final void rule__Personne__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1735:1: ( ( '{' ) )
            // InternalGame.g:1736:1: ( '{' )
            {
            // InternalGame.g:1736:1: ( '{' )
            // InternalGame.g:1737:2: '{'
            {
             before(grammarAccess.getPersonneAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getPersonneAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
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
    // InternalGame.g:1746:1: rule__Personne__Group__2 : rule__Personne__Group__2__Impl rule__Personne__Group__3 ;
    public final void rule__Personne__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1750:1: ( rule__Personne__Group__2__Impl rule__Personne__Group__3 )
            // InternalGame.g:1751:2: rule__Personne__Group__2__Impl rule__Personne__Group__3
            {
            pushFollow(FOLLOW_16);
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
    // InternalGame.g:1758:1: rule__Personne__Group__2__Impl : ( ( rule__Personne__Group_2__0 )? ) ;
    public final void rule__Personne__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1762:1: ( ( ( rule__Personne__Group_2__0 )? ) )
            // InternalGame.g:1763:1: ( ( rule__Personne__Group_2__0 )? )
            {
            // InternalGame.g:1763:1: ( ( rule__Personne__Group_2__0 )? )
            // InternalGame.g:1764:2: ( rule__Personne__Group_2__0 )?
            {
             before(grammarAccess.getPersonneAccess().getGroup_2()); 
            // InternalGame.g:1765:2: ( rule__Personne__Group_2__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==26) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalGame.g:1765:3: rule__Personne__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Personne__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPersonneAccess().getGroup_2()); 

            }


            }

        }
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
    // InternalGame.g:1773:1: rule__Personne__Group__3 : rule__Personne__Group__3__Impl rule__Personne__Group__4 ;
    public final void rule__Personne__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1777:1: ( rule__Personne__Group__3__Impl rule__Personne__Group__4 )
            // InternalGame.g:1778:2: rule__Personne__Group__3__Impl rule__Personne__Group__4
            {
            pushFollow(FOLLOW_16);
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
    // InternalGame.g:1785:1: rule__Personne__Group__3__Impl : ( ( rule__Personne__Group_3__0 )? ) ;
    public final void rule__Personne__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1789:1: ( ( ( rule__Personne__Group_3__0 )? ) )
            // InternalGame.g:1790:1: ( ( rule__Personne__Group_3__0 )? )
            {
            // InternalGame.g:1790:1: ( ( rule__Personne__Group_3__0 )? )
            // InternalGame.g:1791:2: ( rule__Personne__Group_3__0 )?
            {
             before(grammarAccess.getPersonneAccess().getGroup_3()); 
            // InternalGame.g:1792:2: ( rule__Personne__Group_3__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==27) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalGame.g:1792:3: rule__Personne__Group_3__0
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
    // InternalGame.g:1800:1: rule__Personne__Group__4 : rule__Personne__Group__4__Impl rule__Personne__Group__5 ;
    public final void rule__Personne__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1804:1: ( rule__Personne__Group__4__Impl rule__Personne__Group__5 )
            // InternalGame.g:1805:2: rule__Personne__Group__4__Impl rule__Personne__Group__5
            {
            pushFollow(FOLLOW_6);
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
    // InternalGame.g:1812:1: rule__Personne__Group__4__Impl : ( ( rule__Personne__PersonneElementsAssignment_4 ) ) ;
    public final void rule__Personne__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1816:1: ( ( ( rule__Personne__PersonneElementsAssignment_4 ) ) )
            // InternalGame.g:1817:1: ( ( rule__Personne__PersonneElementsAssignment_4 ) )
            {
            // InternalGame.g:1817:1: ( ( rule__Personne__PersonneElementsAssignment_4 ) )
            // InternalGame.g:1818:2: ( rule__Personne__PersonneElementsAssignment_4 )
            {
             before(grammarAccess.getPersonneAccess().getPersonneElementsAssignment_4()); 
            // InternalGame.g:1819:2: ( rule__Personne__PersonneElementsAssignment_4 )
            // InternalGame.g:1819:3: rule__Personne__PersonneElementsAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Personne__PersonneElementsAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getPersonneAccess().getPersonneElementsAssignment_4()); 

            }


            }

        }
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
    // InternalGame.g:1827:1: rule__Personne__Group__5 : rule__Personne__Group__5__Impl ;
    public final void rule__Personne__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1831:1: ( rule__Personne__Group__5__Impl )
            // InternalGame.g:1832:2: rule__Personne__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Personne__Group__5__Impl();

            state._fsp--;


            }

        }
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
    // InternalGame.g:1838:1: rule__Personne__Group__5__Impl : ( '}' ) ;
    public final void rule__Personne__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1842:1: ( ( '}' ) )
            // InternalGame.g:1843:1: ( '}' )
            {
            // InternalGame.g:1843:1: ( '}' )
            // InternalGame.g:1844:2: '}'
            {
             before(grammarAccess.getPersonneAccess().getRightCurlyBracketKeyword_5()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getPersonneAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
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


    // $ANTLR start "rule__Personne__Group_2__0"
    // InternalGame.g:1854:1: rule__Personne__Group_2__0 : rule__Personne__Group_2__0__Impl rule__Personne__Group_2__1 ;
    public final void rule__Personne__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1858:1: ( rule__Personne__Group_2__0__Impl rule__Personne__Group_2__1 )
            // InternalGame.g:1859:2: rule__Personne__Group_2__0__Impl rule__Personne__Group_2__1
            {
            pushFollow(FOLLOW_3);
            rule__Personne__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Personne__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Personne__Group_2__0"


    // $ANTLR start "rule__Personne__Group_2__0__Impl"
    // InternalGame.g:1866:1: rule__Personne__Group_2__0__Impl : ( 'visible' ) ;
    public final void rule__Personne__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1870:1: ( ( 'visible' ) )
            // InternalGame.g:1871:1: ( 'visible' )
            {
            // InternalGame.g:1871:1: ( 'visible' )
            // InternalGame.g:1872:2: 'visible'
            {
             before(grammarAccess.getPersonneAccess().getVisibleKeyword_2_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getPersonneAccess().getVisibleKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Personne__Group_2__0__Impl"


    // $ANTLR start "rule__Personne__Group_2__1"
    // InternalGame.g:1881:1: rule__Personne__Group_2__1 : rule__Personne__Group_2__1__Impl ;
    public final void rule__Personne__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1885:1: ( rule__Personne__Group_2__1__Impl )
            // InternalGame.g:1886:2: rule__Personne__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Personne__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Personne__Group_2__1"


    // $ANTLR start "rule__Personne__Group_2__1__Impl"
    // InternalGame.g:1892:1: rule__Personne__Group_2__1__Impl : ( ( rule__Personne__VisibleAssignment_2_1 ) ) ;
    public final void rule__Personne__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1896:1: ( ( ( rule__Personne__VisibleAssignment_2_1 ) ) )
            // InternalGame.g:1897:1: ( ( rule__Personne__VisibleAssignment_2_1 ) )
            {
            // InternalGame.g:1897:1: ( ( rule__Personne__VisibleAssignment_2_1 ) )
            // InternalGame.g:1898:2: ( rule__Personne__VisibleAssignment_2_1 )
            {
             before(grammarAccess.getPersonneAccess().getVisibleAssignment_2_1()); 
            // InternalGame.g:1899:2: ( rule__Personne__VisibleAssignment_2_1 )
            // InternalGame.g:1899:3: rule__Personne__VisibleAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Personne__VisibleAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getPersonneAccess().getVisibleAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Personne__Group_2__1__Impl"


    // $ANTLR start "rule__Personne__Group_3__0"
    // InternalGame.g:1908:1: rule__Personne__Group_3__0 : rule__Personne__Group_3__0__Impl rule__Personne__Group_3__1 ;
    public final void rule__Personne__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1912:1: ( rule__Personne__Group_3__0__Impl rule__Personne__Group_3__1 )
            // InternalGame.g:1913:2: rule__Personne__Group_3__0__Impl rule__Personne__Group_3__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalGame.g:1920:1: rule__Personne__Group_3__0__Impl : ( 'obligatoire' ) ;
    public final void rule__Personne__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1924:1: ( ( 'obligatoire' ) )
            // InternalGame.g:1925:1: ( 'obligatoire' )
            {
            // InternalGame.g:1925:1: ( 'obligatoire' )
            // InternalGame.g:1926:2: 'obligatoire'
            {
             before(grammarAccess.getPersonneAccess().getObligatoireKeyword_3_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getPersonneAccess().getObligatoireKeyword_3_0()); 

            }


            }

        }
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
    // InternalGame.g:1935:1: rule__Personne__Group_3__1 : rule__Personne__Group_3__1__Impl ;
    public final void rule__Personne__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1939:1: ( rule__Personne__Group_3__1__Impl )
            // InternalGame.g:1940:2: rule__Personne__Group_3__1__Impl
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
    // InternalGame.g:1946:1: rule__Personne__Group_3__1__Impl : ( ( rule__Personne__ObligatoireAssignment_3_1 ) ) ;
    public final void rule__Personne__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1950:1: ( ( ( rule__Personne__ObligatoireAssignment_3_1 ) ) )
            // InternalGame.g:1951:1: ( ( rule__Personne__ObligatoireAssignment_3_1 ) )
            {
            // InternalGame.g:1951:1: ( ( rule__Personne__ObligatoireAssignment_3_1 ) )
            // InternalGame.g:1952:2: ( rule__Personne__ObligatoireAssignment_3_1 )
            {
             before(grammarAccess.getPersonneAccess().getObligatoireAssignment_3_1()); 
            // InternalGame.g:1953:2: ( rule__Personne__ObligatoireAssignment_3_1 )
            // InternalGame.g:1953:3: rule__Personne__ObligatoireAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Personne__ObligatoireAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getPersonneAccess().getObligatoireAssignment_3_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__Interaction__Group__0"
    // InternalGame.g:1962:1: rule__Interaction__Group__0 : rule__Interaction__Group__0__Impl rule__Interaction__Group__1 ;
    public final void rule__Interaction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1966:1: ( rule__Interaction__Group__0__Impl rule__Interaction__Group__1 )
            // InternalGame.g:1967:2: rule__Interaction__Group__0__Impl rule__Interaction__Group__1
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
    // InternalGame.g:1974:1: rule__Interaction__Group__0__Impl : ( 'interaction' ) ;
    public final void rule__Interaction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1978:1: ( ( 'interaction' ) )
            // InternalGame.g:1979:1: ( 'interaction' )
            {
            // InternalGame.g:1979:1: ( 'interaction' )
            // InternalGame.g:1980:2: 'interaction'
            {
             before(grammarAccess.getInteractionAccess().getInteractionKeyword_0()); 
            match(input,28,FOLLOW_2); 
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
    // InternalGame.g:1989:1: rule__Interaction__Group__1 : rule__Interaction__Group__1__Impl rule__Interaction__Group__2 ;
    public final void rule__Interaction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1993:1: ( rule__Interaction__Group__1__Impl rule__Interaction__Group__2 )
            // InternalGame.g:1994:2: rule__Interaction__Group__1__Impl rule__Interaction__Group__2
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
    // InternalGame.g:2001:1: rule__Interaction__Group__1__Impl : ( ( rule__Interaction__NameAssignment_1 ) ) ;
    public final void rule__Interaction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2005:1: ( ( ( rule__Interaction__NameAssignment_1 ) ) )
            // InternalGame.g:2006:1: ( ( rule__Interaction__NameAssignment_1 ) )
            {
            // InternalGame.g:2006:1: ( ( rule__Interaction__NameAssignment_1 ) )
            // InternalGame.g:2007:2: ( rule__Interaction__NameAssignment_1 )
            {
             before(grammarAccess.getInteractionAccess().getNameAssignment_1()); 
            // InternalGame.g:2008:2: ( rule__Interaction__NameAssignment_1 )
            // InternalGame.g:2008:3: rule__Interaction__NameAssignment_1
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
    // InternalGame.g:2016:1: rule__Interaction__Group__2 : rule__Interaction__Group__2__Impl rule__Interaction__Group__3 ;
    public final void rule__Interaction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2020:1: ( rule__Interaction__Group__2__Impl rule__Interaction__Group__3 )
            // InternalGame.g:2021:2: rule__Interaction__Group__2__Impl rule__Interaction__Group__3
            {
            pushFollow(FOLLOW_17);
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
    // InternalGame.g:2028:1: rule__Interaction__Group__2__Impl : ( '{' ) ;
    public final void rule__Interaction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2032:1: ( ( '{' ) )
            // InternalGame.g:2033:1: ( '{' )
            {
            // InternalGame.g:2033:1: ( '{' )
            // InternalGame.g:2034:2: '{'
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
    // InternalGame.g:2043:1: rule__Interaction__Group__3 : rule__Interaction__Group__3__Impl rule__Interaction__Group__4 ;
    public final void rule__Interaction__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2047:1: ( rule__Interaction__Group__3__Impl rule__Interaction__Group__4 )
            // InternalGame.g:2048:2: rule__Interaction__Group__3__Impl rule__Interaction__Group__4
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
    // InternalGame.g:2055:1: rule__Interaction__Group__3__Impl : ( 'texte' ) ;
    public final void rule__Interaction__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2059:1: ( ( 'texte' ) )
            // InternalGame.g:2060:1: ( 'texte' )
            {
            // InternalGame.g:2060:1: ( 'texte' )
            // InternalGame.g:2061:2: 'texte'
            {
             before(grammarAccess.getInteractionAccess().getTexteKeyword_3()); 
            match(input,29,FOLLOW_2); 
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
    // InternalGame.g:2070:1: rule__Interaction__Group__4 : rule__Interaction__Group__4__Impl rule__Interaction__Group__5 ;
    public final void rule__Interaction__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2074:1: ( rule__Interaction__Group__4__Impl rule__Interaction__Group__5 )
            // InternalGame.g:2075:2: rule__Interaction__Group__4__Impl rule__Interaction__Group__5
            {
            pushFollow(FOLLOW_18);
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
    // InternalGame.g:2082:1: rule__Interaction__Group__4__Impl : ( ( rule__Interaction__TexteAssignment_4 ) ) ;
    public final void rule__Interaction__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2086:1: ( ( ( rule__Interaction__TexteAssignment_4 ) ) )
            // InternalGame.g:2087:1: ( ( rule__Interaction__TexteAssignment_4 ) )
            {
            // InternalGame.g:2087:1: ( ( rule__Interaction__TexteAssignment_4 ) )
            // InternalGame.g:2088:2: ( rule__Interaction__TexteAssignment_4 )
            {
             before(grammarAccess.getInteractionAccess().getTexteAssignment_4()); 
            // InternalGame.g:2089:2: ( rule__Interaction__TexteAssignment_4 )
            // InternalGame.g:2089:3: rule__Interaction__TexteAssignment_4
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
    // InternalGame.g:2097:1: rule__Interaction__Group__5 : rule__Interaction__Group__5__Impl rule__Interaction__Group__6 ;
    public final void rule__Interaction__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2101:1: ( rule__Interaction__Group__5__Impl rule__Interaction__Group__6 )
            // InternalGame.g:2102:2: rule__Interaction__Group__5__Impl rule__Interaction__Group__6
            {
            pushFollow(FOLLOW_18);
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
    // InternalGame.g:2109:1: rule__Interaction__Group__5__Impl : ( ( rule__Interaction__InteractionElementsAssignment_5 )* ) ;
    public final void rule__Interaction__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2113:1: ( ( ( rule__Interaction__InteractionElementsAssignment_5 )* ) )
            // InternalGame.g:2114:1: ( ( rule__Interaction__InteractionElementsAssignment_5 )* )
            {
            // InternalGame.g:2114:1: ( ( rule__Interaction__InteractionElementsAssignment_5 )* )
            // InternalGame.g:2115:2: ( rule__Interaction__InteractionElementsAssignment_5 )*
            {
             before(grammarAccess.getInteractionAccess().getInteractionElementsAssignment_5()); 
            // InternalGame.g:2116:2: ( rule__Interaction__InteractionElementsAssignment_5 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==30) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalGame.g:2116:3: rule__Interaction__InteractionElementsAssignment_5
            	    {
            	    pushFollow(FOLLOW_19);
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
    // InternalGame.g:2124:1: rule__Interaction__Group__6 : rule__Interaction__Group__6__Impl ;
    public final void rule__Interaction__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2128:1: ( rule__Interaction__Group__6__Impl )
            // InternalGame.g:2129:2: rule__Interaction__Group__6__Impl
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
    // InternalGame.g:2135:1: rule__Interaction__Group__6__Impl : ( '}' ) ;
    public final void rule__Interaction__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2139:1: ( ( '}' ) )
            // InternalGame.g:2140:1: ( '}' )
            {
            // InternalGame.g:2140:1: ( '}' )
            // InternalGame.g:2141:2: '}'
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
    // InternalGame.g:2151:1: rule__Choix__Group__0 : rule__Choix__Group__0__Impl rule__Choix__Group__1 ;
    public final void rule__Choix__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2155:1: ( rule__Choix__Group__0__Impl rule__Choix__Group__1 )
            // InternalGame.g:2156:2: rule__Choix__Group__0__Impl rule__Choix__Group__1
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
    // InternalGame.g:2163:1: rule__Choix__Group__0__Impl : ( 'choix' ) ;
    public final void rule__Choix__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2167:1: ( ( 'choix' ) )
            // InternalGame.g:2168:1: ( 'choix' )
            {
            // InternalGame.g:2168:1: ( 'choix' )
            // InternalGame.g:2169:2: 'choix'
            {
             before(grammarAccess.getChoixAccess().getChoixKeyword_0()); 
            match(input,30,FOLLOW_2); 
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
    // InternalGame.g:2178:1: rule__Choix__Group__1 : rule__Choix__Group__1__Impl rule__Choix__Group__2 ;
    public final void rule__Choix__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2182:1: ( rule__Choix__Group__1__Impl rule__Choix__Group__2 )
            // InternalGame.g:2183:2: rule__Choix__Group__1__Impl rule__Choix__Group__2
            {
            pushFollow(FOLLOW_4);
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
    // InternalGame.g:2190:1: rule__Choix__Group__1__Impl : ( ( rule__Choix__NameAssignment_1 ) ) ;
    public final void rule__Choix__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2194:1: ( ( ( rule__Choix__NameAssignment_1 ) ) )
            // InternalGame.g:2195:1: ( ( rule__Choix__NameAssignment_1 ) )
            {
            // InternalGame.g:2195:1: ( ( rule__Choix__NameAssignment_1 ) )
            // InternalGame.g:2196:2: ( rule__Choix__NameAssignment_1 )
            {
             before(grammarAccess.getChoixAccess().getNameAssignment_1()); 
            // InternalGame.g:2197:2: ( rule__Choix__NameAssignment_1 )
            // InternalGame.g:2197:3: rule__Choix__NameAssignment_1
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
    // InternalGame.g:2205:1: rule__Choix__Group__2 : rule__Choix__Group__2__Impl rule__Choix__Group__3 ;
    public final void rule__Choix__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2209:1: ( rule__Choix__Group__2__Impl rule__Choix__Group__3 )
            // InternalGame.g:2210:2: rule__Choix__Group__2__Impl rule__Choix__Group__3
            {
            pushFollow(FOLLOW_15);
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
    // InternalGame.g:2217:1: rule__Choix__Group__2__Impl : ( '{' ) ;
    public final void rule__Choix__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2221:1: ( ( '{' ) )
            // InternalGame.g:2222:1: ( '{' )
            {
            // InternalGame.g:2222:1: ( '{' )
            // InternalGame.g:2223:2: '{'
            {
             before(grammarAccess.getChoixAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getChoixAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
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
    // InternalGame.g:2232:1: rule__Choix__Group__3 : rule__Choix__Group__3__Impl rule__Choix__Group__4 ;
    public final void rule__Choix__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2236:1: ( rule__Choix__Group__3__Impl rule__Choix__Group__4 )
            // InternalGame.g:2237:2: rule__Choix__Group__3__Impl rule__Choix__Group__4
            {
            pushFollow(FOLLOW_20);
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
    // InternalGame.g:2244:1: rule__Choix__Group__3__Impl : ( ( rule__Choix__TexteAssignment_3 ) ) ;
    public final void rule__Choix__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2248:1: ( ( ( rule__Choix__TexteAssignment_3 ) ) )
            // InternalGame.g:2249:1: ( ( rule__Choix__TexteAssignment_3 ) )
            {
            // InternalGame.g:2249:1: ( ( rule__Choix__TexteAssignment_3 ) )
            // InternalGame.g:2250:2: ( rule__Choix__TexteAssignment_3 )
            {
             before(grammarAccess.getChoixAccess().getTexteAssignment_3()); 
            // InternalGame.g:2251:2: ( rule__Choix__TexteAssignment_3 )
            // InternalGame.g:2251:3: rule__Choix__TexteAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Choix__TexteAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getChoixAccess().getTexteAssignment_3()); 

            }


            }

        }
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
    // InternalGame.g:2259:1: rule__Choix__Group__4 : rule__Choix__Group__4__Impl rule__Choix__Group__5 ;
    public final void rule__Choix__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2263:1: ( rule__Choix__Group__4__Impl rule__Choix__Group__5 )
            // InternalGame.g:2264:2: rule__Choix__Group__4__Impl rule__Choix__Group__5
            {
            pushFollow(FOLLOW_21);
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
    // InternalGame.g:2271:1: rule__Choix__Group__4__Impl : ( ( ( rule__Choix__ListeActionsAssignment_4 ) ) ( ( rule__Choix__ListeActionsAssignment_4 )* ) ) ;
    public final void rule__Choix__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2275:1: ( ( ( ( rule__Choix__ListeActionsAssignment_4 ) ) ( ( rule__Choix__ListeActionsAssignment_4 )* ) ) )
            // InternalGame.g:2276:1: ( ( ( rule__Choix__ListeActionsAssignment_4 ) ) ( ( rule__Choix__ListeActionsAssignment_4 )* ) )
            {
            // InternalGame.g:2276:1: ( ( ( rule__Choix__ListeActionsAssignment_4 ) ) ( ( rule__Choix__ListeActionsAssignment_4 )* ) )
            // InternalGame.g:2277:2: ( ( rule__Choix__ListeActionsAssignment_4 ) ) ( ( rule__Choix__ListeActionsAssignment_4 )* )
            {
            // InternalGame.g:2277:2: ( ( rule__Choix__ListeActionsAssignment_4 ) )
            // InternalGame.g:2278:3: ( rule__Choix__ListeActionsAssignment_4 )
            {
             before(grammarAccess.getChoixAccess().getListeActionsAssignment_4()); 
            // InternalGame.g:2279:3: ( rule__Choix__ListeActionsAssignment_4 )
            // InternalGame.g:2279:4: rule__Choix__ListeActionsAssignment_4
            {
            pushFollow(FOLLOW_22);
            rule__Choix__ListeActionsAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getChoixAccess().getListeActionsAssignment_4()); 

            }

            // InternalGame.g:2282:2: ( ( rule__Choix__ListeActionsAssignment_4 )* )
            // InternalGame.g:2283:3: ( rule__Choix__ListeActionsAssignment_4 )*
            {
             before(grammarAccess.getChoixAccess().getListeActionsAssignment_4()); 
            // InternalGame.g:2284:3: ( rule__Choix__ListeActionsAssignment_4 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==33) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalGame.g:2284:4: rule__Choix__ListeActionsAssignment_4
            	    {
            	    pushFollow(FOLLOW_22);
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
    // InternalGame.g:2293:1: rule__Choix__Group__5 : rule__Choix__Group__5__Impl rule__Choix__Group__6 ;
    public final void rule__Choix__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2297:1: ( rule__Choix__Group__5__Impl rule__Choix__Group__6 )
            // InternalGame.g:2298:2: rule__Choix__Group__5__Impl rule__Choix__Group__6
            {
            pushFollow(FOLLOW_21);
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
    // InternalGame.g:2305:1: rule__Choix__Group__5__Impl : ( ( rule__Choix__Group_5__0 )? ) ;
    public final void rule__Choix__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2309:1: ( ( ( rule__Choix__Group_5__0 )? ) )
            // InternalGame.g:2310:1: ( ( rule__Choix__Group_5__0 )? )
            {
            // InternalGame.g:2310:1: ( ( rule__Choix__Group_5__0 )? )
            // InternalGame.g:2311:2: ( rule__Choix__Group_5__0 )?
            {
             before(grammarAccess.getChoixAccess().getGroup_5()); 
            // InternalGame.g:2312:2: ( rule__Choix__Group_5__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==31) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalGame.g:2312:3: rule__Choix__Group_5__0
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
    // InternalGame.g:2320:1: rule__Choix__Group__6 : rule__Choix__Group__6__Impl rule__Choix__Group__7 ;
    public final void rule__Choix__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2324:1: ( rule__Choix__Group__6__Impl rule__Choix__Group__7 )
            // InternalGame.g:2325:2: rule__Choix__Group__6__Impl rule__Choix__Group__7
            {
            pushFollow(FOLLOW_21);
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
    // InternalGame.g:2332:1: rule__Choix__Group__6__Impl : ( ( rule__Choix__Group_6__0 )? ) ;
    public final void rule__Choix__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2336:1: ( ( ( rule__Choix__Group_6__0 )? ) )
            // InternalGame.g:2337:1: ( ( rule__Choix__Group_6__0 )? )
            {
            // InternalGame.g:2337:1: ( ( rule__Choix__Group_6__0 )? )
            // InternalGame.g:2338:2: ( rule__Choix__Group_6__0 )?
            {
             before(grammarAccess.getChoixAccess().getGroup_6()); 
            // InternalGame.g:2339:2: ( rule__Choix__Group_6__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==32) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalGame.g:2339:3: rule__Choix__Group_6__0
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
    // InternalGame.g:2347:1: rule__Choix__Group__7 : rule__Choix__Group__7__Impl ;
    public final void rule__Choix__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2351:1: ( rule__Choix__Group__7__Impl )
            // InternalGame.g:2352:2: rule__Choix__Group__7__Impl
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
    // InternalGame.g:2358:1: rule__Choix__Group__7__Impl : ( '}' ) ;
    public final void rule__Choix__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2362:1: ( ( '}' ) )
            // InternalGame.g:2363:1: ( '}' )
            {
            // InternalGame.g:2363:1: ( '}' )
            // InternalGame.g:2364:2: '}'
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
    // InternalGame.g:2374:1: rule__Choix__Group_5__0 : rule__Choix__Group_5__0__Impl rule__Choix__Group_5__1 ;
    public final void rule__Choix__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2378:1: ( rule__Choix__Group_5__0__Impl rule__Choix__Group_5__1 )
            // InternalGame.g:2379:2: rule__Choix__Group_5__0__Impl rule__Choix__Group_5__1
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
    // InternalGame.g:2386:1: rule__Choix__Group_5__0__Impl : ( 'choixdebut' ) ;
    public final void rule__Choix__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2390:1: ( ( 'choixdebut' ) )
            // InternalGame.g:2391:1: ( 'choixdebut' )
            {
            // InternalGame.g:2391:1: ( 'choixdebut' )
            // InternalGame.g:2392:2: 'choixdebut'
            {
             before(grammarAccess.getChoixAccess().getChoixdebutKeyword_5_0()); 
            match(input,31,FOLLOW_2); 
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
    // InternalGame.g:2401:1: rule__Choix__Group_5__1 : rule__Choix__Group_5__1__Impl ;
    public final void rule__Choix__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2405:1: ( rule__Choix__Group_5__1__Impl )
            // InternalGame.g:2406:2: rule__Choix__Group_5__1__Impl
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
    // InternalGame.g:2412:1: rule__Choix__Group_5__1__Impl : ( ( rule__Choix__Group_5_1__0 )? ) ;
    public final void rule__Choix__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2416:1: ( ( ( rule__Choix__Group_5_1__0 )? ) )
            // InternalGame.g:2417:1: ( ( rule__Choix__Group_5_1__0 )? )
            {
            // InternalGame.g:2417:1: ( ( rule__Choix__Group_5_1__0 )? )
            // InternalGame.g:2418:2: ( rule__Choix__Group_5_1__0 )?
            {
             before(grammarAccess.getChoixAccess().getGroup_5_1()); 
            // InternalGame.g:2419:2: ( rule__Choix__Group_5_1__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_STRING) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalGame.g:2419:3: rule__Choix__Group_5_1__0
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
    // InternalGame.g:2428:1: rule__Choix__Group_5_1__0 : rule__Choix__Group_5_1__0__Impl rule__Choix__Group_5_1__1 ;
    public final void rule__Choix__Group_5_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2432:1: ( rule__Choix__Group_5_1__0__Impl rule__Choix__Group_5_1__1 )
            // InternalGame.g:2433:2: rule__Choix__Group_5_1__0__Impl rule__Choix__Group_5_1__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalGame.g:2440:1: rule__Choix__Group_5_1__0__Impl : ( ( rule__Choix__ChoixdebutAssignment_5_1_0 ) ) ;
    public final void rule__Choix__Group_5_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2444:1: ( ( ( rule__Choix__ChoixdebutAssignment_5_1_0 ) ) )
            // InternalGame.g:2445:1: ( ( rule__Choix__ChoixdebutAssignment_5_1_0 ) )
            {
            // InternalGame.g:2445:1: ( ( rule__Choix__ChoixdebutAssignment_5_1_0 ) )
            // InternalGame.g:2446:2: ( rule__Choix__ChoixdebutAssignment_5_1_0 )
            {
             before(grammarAccess.getChoixAccess().getChoixdebutAssignment_5_1_0()); 
            // InternalGame.g:2447:2: ( rule__Choix__ChoixdebutAssignment_5_1_0 )
            // InternalGame.g:2447:3: rule__Choix__ChoixdebutAssignment_5_1_0
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
    // InternalGame.g:2455:1: rule__Choix__Group_5_1__1 : rule__Choix__Group_5_1__1__Impl ;
    public final void rule__Choix__Group_5_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2459:1: ( rule__Choix__Group_5_1__1__Impl )
            // InternalGame.g:2460:2: rule__Choix__Group_5_1__1__Impl
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
    // InternalGame.g:2466:1: rule__Choix__Group_5_1__1__Impl : ( ( rule__Choix__ConditonChoixDebutAssignment_5_1_1 ) ) ;
    public final void rule__Choix__Group_5_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2470:1: ( ( ( rule__Choix__ConditonChoixDebutAssignment_5_1_1 ) ) )
            // InternalGame.g:2471:1: ( ( rule__Choix__ConditonChoixDebutAssignment_5_1_1 ) )
            {
            // InternalGame.g:2471:1: ( ( rule__Choix__ConditonChoixDebutAssignment_5_1_1 ) )
            // InternalGame.g:2472:2: ( rule__Choix__ConditonChoixDebutAssignment_5_1_1 )
            {
             before(grammarAccess.getChoixAccess().getConditonChoixDebutAssignment_5_1_1()); 
            // InternalGame.g:2473:2: ( rule__Choix__ConditonChoixDebutAssignment_5_1_1 )
            // InternalGame.g:2473:3: rule__Choix__ConditonChoixDebutAssignment_5_1_1
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
    // InternalGame.g:2482:1: rule__Choix__Group_6__0 : rule__Choix__Group_6__0__Impl rule__Choix__Group_6__1 ;
    public final void rule__Choix__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2486:1: ( rule__Choix__Group_6__0__Impl rule__Choix__Group_6__1 )
            // InternalGame.g:2487:2: rule__Choix__Group_6__0__Impl rule__Choix__Group_6__1
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
    // InternalGame.g:2494:1: rule__Choix__Group_6__0__Impl : ( 'choixfin' ) ;
    public final void rule__Choix__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2498:1: ( ( 'choixfin' ) )
            // InternalGame.g:2499:1: ( 'choixfin' )
            {
            // InternalGame.g:2499:1: ( 'choixfin' )
            // InternalGame.g:2500:2: 'choixfin'
            {
             before(grammarAccess.getChoixAccess().getChoixfinKeyword_6_0()); 
            match(input,32,FOLLOW_2); 
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
    // InternalGame.g:2509:1: rule__Choix__Group_6__1 : rule__Choix__Group_6__1__Impl ;
    public final void rule__Choix__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2513:1: ( rule__Choix__Group_6__1__Impl )
            // InternalGame.g:2514:2: rule__Choix__Group_6__1__Impl
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
    // InternalGame.g:2520:1: rule__Choix__Group_6__1__Impl : ( ( rule__Choix__Group_6_1__0 )? ) ;
    public final void rule__Choix__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2524:1: ( ( ( rule__Choix__Group_6_1__0 )? ) )
            // InternalGame.g:2525:1: ( ( rule__Choix__Group_6_1__0 )? )
            {
            // InternalGame.g:2525:1: ( ( rule__Choix__Group_6_1__0 )? )
            // InternalGame.g:2526:2: ( rule__Choix__Group_6_1__0 )?
            {
             before(grammarAccess.getChoixAccess().getGroup_6_1()); 
            // InternalGame.g:2527:2: ( rule__Choix__Group_6_1__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_STRING) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalGame.g:2527:3: rule__Choix__Group_6_1__0
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
    // InternalGame.g:2536:1: rule__Choix__Group_6_1__0 : rule__Choix__Group_6_1__0__Impl rule__Choix__Group_6_1__1 ;
    public final void rule__Choix__Group_6_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2540:1: ( rule__Choix__Group_6_1__0__Impl rule__Choix__Group_6_1__1 )
            // InternalGame.g:2541:2: rule__Choix__Group_6_1__0__Impl rule__Choix__Group_6_1__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalGame.g:2548:1: rule__Choix__Group_6_1__0__Impl : ( ( rule__Choix__ChoixfinAssignment_6_1_0 ) ) ;
    public final void rule__Choix__Group_6_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2552:1: ( ( ( rule__Choix__ChoixfinAssignment_6_1_0 ) ) )
            // InternalGame.g:2553:1: ( ( rule__Choix__ChoixfinAssignment_6_1_0 ) )
            {
            // InternalGame.g:2553:1: ( ( rule__Choix__ChoixfinAssignment_6_1_0 ) )
            // InternalGame.g:2554:2: ( rule__Choix__ChoixfinAssignment_6_1_0 )
            {
             before(grammarAccess.getChoixAccess().getChoixfinAssignment_6_1_0()); 
            // InternalGame.g:2555:2: ( rule__Choix__ChoixfinAssignment_6_1_0 )
            // InternalGame.g:2555:3: rule__Choix__ChoixfinAssignment_6_1_0
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
    // InternalGame.g:2563:1: rule__Choix__Group_6_1__1 : rule__Choix__Group_6_1__1__Impl ;
    public final void rule__Choix__Group_6_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2567:1: ( rule__Choix__Group_6_1__1__Impl )
            // InternalGame.g:2568:2: rule__Choix__Group_6_1__1__Impl
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
    // InternalGame.g:2574:1: rule__Choix__Group_6_1__1__Impl : ( ( rule__Choix__ConditionChoixFinAssignment_6_1_1 ) ) ;
    public final void rule__Choix__Group_6_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2578:1: ( ( ( rule__Choix__ConditionChoixFinAssignment_6_1_1 ) ) )
            // InternalGame.g:2579:1: ( ( rule__Choix__ConditionChoixFinAssignment_6_1_1 ) )
            {
            // InternalGame.g:2579:1: ( ( rule__Choix__ConditionChoixFinAssignment_6_1_1 ) )
            // InternalGame.g:2580:2: ( rule__Choix__ConditionChoixFinAssignment_6_1_1 )
            {
             before(grammarAccess.getChoixAccess().getConditionChoixFinAssignment_6_1_1()); 
            // InternalGame.g:2581:2: ( rule__Choix__ConditionChoixFinAssignment_6_1_1 )
            // InternalGame.g:2581:3: rule__Choix__ConditionChoixFinAssignment_6_1_1
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
    // InternalGame.g:2590:1: rule__Action__Group__0 : rule__Action__Group__0__Impl rule__Action__Group__1 ;
    public final void rule__Action__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2594:1: ( rule__Action__Group__0__Impl rule__Action__Group__1 )
            // InternalGame.g:2595:2: rule__Action__Group__0__Impl rule__Action__Group__1
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
    // InternalGame.g:2602:1: rule__Action__Group__0__Impl : ( 'action' ) ;
    public final void rule__Action__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2606:1: ( ( 'action' ) )
            // InternalGame.g:2607:1: ( 'action' )
            {
            // InternalGame.g:2607:1: ( 'action' )
            // InternalGame.g:2608:2: 'action'
            {
             before(grammarAccess.getActionAccess().getActionKeyword_0()); 
            match(input,33,FOLLOW_2); 
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
    // InternalGame.g:2617:1: rule__Action__Group__1 : rule__Action__Group__1__Impl rule__Action__Group__2 ;
    public final void rule__Action__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2621:1: ( rule__Action__Group__1__Impl rule__Action__Group__2 )
            // InternalGame.g:2622:2: rule__Action__Group__1__Impl rule__Action__Group__2
            {
            pushFollow(FOLLOW_15);
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
    // InternalGame.g:2629:1: rule__Action__Group__1__Impl : ( '{' ) ;
    public final void rule__Action__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2633:1: ( ( '{' ) )
            // InternalGame.g:2634:1: ( '{' )
            {
            // InternalGame.g:2634:1: ( '{' )
            // InternalGame.g:2635:2: '{'
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
    // InternalGame.g:2644:1: rule__Action__Group__2 : rule__Action__Group__2__Impl rule__Action__Group__3 ;
    public final void rule__Action__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2648:1: ( rule__Action__Group__2__Impl rule__Action__Group__3 )
            // InternalGame.g:2649:2: rule__Action__Group__2__Impl rule__Action__Group__3
            {
            pushFollow(FOLLOW_23);
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
    // InternalGame.g:2656:1: rule__Action__Group__2__Impl : ( ( rule__Action__TexteAssignment_2 ) ) ;
    public final void rule__Action__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2660:1: ( ( ( rule__Action__TexteAssignment_2 ) ) )
            // InternalGame.g:2661:1: ( ( rule__Action__TexteAssignment_2 ) )
            {
            // InternalGame.g:2661:1: ( ( rule__Action__TexteAssignment_2 ) )
            // InternalGame.g:2662:2: ( rule__Action__TexteAssignment_2 )
            {
             before(grammarAccess.getActionAccess().getTexteAssignment_2()); 
            // InternalGame.g:2663:2: ( rule__Action__TexteAssignment_2 )
            // InternalGame.g:2663:3: rule__Action__TexteAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Action__TexteAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getActionAccess().getTexteAssignment_2()); 

            }


            }

        }
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
    // InternalGame.g:2671:1: rule__Action__Group__3 : rule__Action__Group__3__Impl rule__Action__Group__4 ;
    public final void rule__Action__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2675:1: ( rule__Action__Group__3__Impl rule__Action__Group__4 )
            // InternalGame.g:2676:2: rule__Action__Group__3__Impl rule__Action__Group__4
            {
            pushFollow(FOLLOW_23);
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
    // InternalGame.g:2683:1: rule__Action__Group__3__Impl : ( ( rule__Action__ConditionActionAssignment_3 )? ) ;
    public final void rule__Action__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2687:1: ( ( ( rule__Action__ConditionActionAssignment_3 )? ) )
            // InternalGame.g:2688:1: ( ( rule__Action__ConditionActionAssignment_3 )? )
            {
            // InternalGame.g:2688:1: ( ( rule__Action__ConditionActionAssignment_3 )? )
            // InternalGame.g:2689:2: ( rule__Action__ConditionActionAssignment_3 )?
            {
             before(grammarAccess.getActionAccess().getConditionActionAssignment_3()); 
            // InternalGame.g:2690:2: ( rule__Action__ConditionActionAssignment_3 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_ID) ) {
                int LA22_1 = input.LA(2);

                if ( (LA22_1==RULE_STRING) ) {
                    alt22=1;
                }
            }
            switch (alt22) {
                case 1 :
                    // InternalGame.g:2690:3: rule__Action__ConditionActionAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__Action__ConditionActionAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getActionAccess().getConditionActionAssignment_3()); 

            }


            }

        }
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
    // InternalGame.g:2698:1: rule__Action__Group__4 : rule__Action__Group__4__Impl rule__Action__Group__5 ;
    public final void rule__Action__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2702:1: ( rule__Action__Group__4__Impl rule__Action__Group__5 )
            // InternalGame.g:2703:2: rule__Action__Group__4__Impl rule__Action__Group__5
            {
            pushFollow(FOLLOW_23);
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
    // InternalGame.g:2710:1: rule__Action__Group__4__Impl : ( ( rule__Action__ListeChoixAssignment_4 )* ) ;
    public final void rule__Action__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2714:1: ( ( ( rule__Action__ListeChoixAssignment_4 )* ) )
            // InternalGame.g:2715:1: ( ( rule__Action__ListeChoixAssignment_4 )* )
            {
            // InternalGame.g:2715:1: ( ( rule__Action__ListeChoixAssignment_4 )* )
            // InternalGame.g:2716:2: ( rule__Action__ListeChoixAssignment_4 )*
            {
             before(grammarAccess.getActionAccess().getListeChoixAssignment_4()); 
            // InternalGame.g:2717:2: ( rule__Action__ListeChoixAssignment_4 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==RULE_ID) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalGame.g:2717:3: rule__Action__ListeChoixAssignment_4
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Action__ListeChoixAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

             after(grammarAccess.getActionAccess().getListeChoixAssignment_4()); 

            }


            }

        }
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
    // InternalGame.g:2725:1: rule__Action__Group__5 : rule__Action__Group__5__Impl rule__Action__Group__6 ;
    public final void rule__Action__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2729:1: ( rule__Action__Group__5__Impl rule__Action__Group__6 )
            // InternalGame.g:2730:2: rule__Action__Group__5__Impl rule__Action__Group__6
            {
            pushFollow(FOLLOW_23);
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
    // InternalGame.g:2737:1: rule__Action__Group__5__Impl : ( ( rule__Action__Group_5__0 )? ) ;
    public final void rule__Action__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2741:1: ( ( ( rule__Action__Group_5__0 )? ) )
            // InternalGame.g:2742:1: ( ( rule__Action__Group_5__0 )? )
            {
            // InternalGame.g:2742:1: ( ( rule__Action__Group_5__0 )? )
            // InternalGame.g:2743:2: ( rule__Action__Group_5__0 )?
            {
             before(grammarAccess.getActionAccess().getGroup_5()); 
            // InternalGame.g:2744:2: ( rule__Action__Group_5__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==34) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalGame.g:2744:3: rule__Action__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Action__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getActionAccess().getGroup_5()); 

            }


            }

        }
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
    // InternalGame.g:2752:1: rule__Action__Group__6 : rule__Action__Group__6__Impl rule__Action__Group__7 ;
    public final void rule__Action__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2756:1: ( rule__Action__Group__6__Impl rule__Action__Group__7 )
            // InternalGame.g:2757:2: rule__Action__Group__6__Impl rule__Action__Group__7
            {
            pushFollow(FOLLOW_23);
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
    // InternalGame.g:2764:1: rule__Action__Group__6__Impl : ( ( rule__Action__Group_6__0 )? ) ;
    public final void rule__Action__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2768:1: ( ( ( rule__Action__Group_6__0 )? ) )
            // InternalGame.g:2769:1: ( ( rule__Action__Group_6__0 )? )
            {
            // InternalGame.g:2769:1: ( ( rule__Action__Group_6__0 )? )
            // InternalGame.g:2770:2: ( rule__Action__Group_6__0 )?
            {
             before(grammarAccess.getActionAccess().getGroup_6()); 
            // InternalGame.g:2771:2: ( rule__Action__Group_6__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==35) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalGame.g:2771:3: rule__Action__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Action__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getActionAccess().getGroup_6()); 

            }


            }

        }
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
    // InternalGame.g:2779:1: rule__Action__Group__7 : rule__Action__Group__7__Impl rule__Action__Group__8 ;
    public final void rule__Action__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2783:1: ( rule__Action__Group__7__Impl rule__Action__Group__8 )
            // InternalGame.g:2784:2: rule__Action__Group__7__Impl rule__Action__Group__8
            {
            pushFollow(FOLLOW_23);
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
    // InternalGame.g:2791:1: rule__Action__Group__7__Impl : ( ( rule__Action__Group_7__0 )? ) ;
    public final void rule__Action__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2795:1: ( ( ( rule__Action__Group_7__0 )? ) )
            // InternalGame.g:2796:1: ( ( rule__Action__Group_7__0 )? )
            {
            // InternalGame.g:2796:1: ( ( rule__Action__Group_7__0 )? )
            // InternalGame.g:2797:2: ( rule__Action__Group_7__0 )?
            {
             before(grammarAccess.getActionAccess().getGroup_7()); 
            // InternalGame.g:2798:2: ( rule__Action__Group_7__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==36) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalGame.g:2798:3: rule__Action__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Action__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getActionAccess().getGroup_7()); 

            }


            }

        }
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
    // InternalGame.g:2806:1: rule__Action__Group__8 : rule__Action__Group__8__Impl rule__Action__Group__9 ;
    public final void rule__Action__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2810:1: ( rule__Action__Group__8__Impl rule__Action__Group__9 )
            // InternalGame.g:2811:2: rule__Action__Group__8__Impl rule__Action__Group__9
            {
            pushFollow(FOLLOW_23);
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
    // InternalGame.g:2818:1: rule__Action__Group__8__Impl : ( ( rule__Action__Group_8__0 )? ) ;
    public final void rule__Action__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2822:1: ( ( ( rule__Action__Group_8__0 )? ) )
            // InternalGame.g:2823:1: ( ( rule__Action__Group_8__0 )? )
            {
            // InternalGame.g:2823:1: ( ( rule__Action__Group_8__0 )? )
            // InternalGame.g:2824:2: ( rule__Action__Group_8__0 )?
            {
             before(grammarAccess.getActionAccess().getGroup_8()); 
            // InternalGame.g:2825:2: ( rule__Action__Group_8__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==37) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalGame.g:2825:3: rule__Action__Group_8__0
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
    // InternalGame.g:2833:1: rule__Action__Group__9 : rule__Action__Group__9__Impl rule__Action__Group__10 ;
    public final void rule__Action__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2837:1: ( rule__Action__Group__9__Impl rule__Action__Group__10 )
            // InternalGame.g:2838:2: rule__Action__Group__9__Impl rule__Action__Group__10
            {
            pushFollow(FOLLOW_23);
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
    // InternalGame.g:2845:1: rule__Action__Group__9__Impl : ( ( rule__Action__Group_9__0 )? ) ;
    public final void rule__Action__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2849:1: ( ( ( rule__Action__Group_9__0 )? ) )
            // InternalGame.g:2850:1: ( ( rule__Action__Group_9__0 )? )
            {
            // InternalGame.g:2850:1: ( ( rule__Action__Group_9__0 )? )
            // InternalGame.g:2851:2: ( rule__Action__Group_9__0 )?
            {
             before(grammarAccess.getActionAccess().getGroup_9()); 
            // InternalGame.g:2852:2: ( rule__Action__Group_9__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==38) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalGame.g:2852:3: rule__Action__Group_9__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Action__Group_9__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getActionAccess().getGroup_9()); 

            }


            }

        }
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
    // InternalGame.g:2860:1: rule__Action__Group__10 : rule__Action__Group__10__Impl rule__Action__Group__11 ;
    public final void rule__Action__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2864:1: ( rule__Action__Group__10__Impl rule__Action__Group__11 )
            // InternalGame.g:2865:2: rule__Action__Group__10__Impl rule__Action__Group__11
            {
            pushFollow(FOLLOW_23);
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
    // InternalGame.g:2872:1: rule__Action__Group__10__Impl : ( ( rule__Action__Group_10__0 )? ) ;
    public final void rule__Action__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2876:1: ( ( ( rule__Action__Group_10__0 )? ) )
            // InternalGame.g:2877:1: ( ( rule__Action__Group_10__0 )? )
            {
            // InternalGame.g:2877:1: ( ( rule__Action__Group_10__0 )? )
            // InternalGame.g:2878:2: ( rule__Action__Group_10__0 )?
            {
             before(grammarAccess.getActionAccess().getGroup_10()); 
            // InternalGame.g:2879:2: ( rule__Action__Group_10__0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==40) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalGame.g:2879:3: rule__Action__Group_10__0
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
    // InternalGame.g:2887:1: rule__Action__Group__11 : rule__Action__Group__11__Impl ;
    public final void rule__Action__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2891:1: ( rule__Action__Group__11__Impl )
            // InternalGame.g:2892:2: rule__Action__Group__11__Impl
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
    // InternalGame.g:2898:1: rule__Action__Group__11__Impl : ( '}' ) ;
    public final void rule__Action__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2902:1: ( ( '}' ) )
            // InternalGame.g:2903:1: ( '}' )
            {
            // InternalGame.g:2903:1: ( '}' )
            // InternalGame.g:2904:2: '}'
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


    // $ANTLR start "rule__Action__Group_5__0"
    // InternalGame.g:2914:1: rule__Action__Group_5__0 : rule__Action__Group_5__0__Impl rule__Action__Group_5__1 ;
    public final void rule__Action__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2918:1: ( rule__Action__Group_5__0__Impl rule__Action__Group_5__1 )
            // InternalGame.g:2919:2: rule__Action__Group_5__0__Impl rule__Action__Group_5__1
            {
            pushFollow(FOLLOW_3);
            rule__Action__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Action__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group_5__0"


    // $ANTLR start "rule__Action__Group_5__0__Impl"
    // InternalGame.g:2926:1: rule__Action__Group_5__0__Impl : ( 'donneC' ) ;
    public final void rule__Action__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2930:1: ( ( 'donneC' ) )
            // InternalGame.g:2931:1: ( 'donneC' )
            {
            // InternalGame.g:2931:1: ( 'donneC' )
            // InternalGame.g:2932:2: 'donneC'
            {
             before(grammarAccess.getActionAccess().getDonneCKeyword_5_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getActionAccess().getDonneCKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group_5__0__Impl"


    // $ANTLR start "rule__Action__Group_5__1"
    // InternalGame.g:2941:1: rule__Action__Group_5__1 : rule__Action__Group_5__1__Impl ;
    public final void rule__Action__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2945:1: ( rule__Action__Group_5__1__Impl )
            // InternalGame.g:2946:2: rule__Action__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Action__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group_5__1"


    // $ANTLR start "rule__Action__Group_5__1__Impl"
    // InternalGame.g:2952:1: rule__Action__Group_5__1__Impl : ( ( rule__Action__ListeConnaissancesAssignment_5_1 )* ) ;
    public final void rule__Action__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2956:1: ( ( ( rule__Action__ListeConnaissancesAssignment_5_1 )* ) )
            // InternalGame.g:2957:1: ( ( rule__Action__ListeConnaissancesAssignment_5_1 )* )
            {
            // InternalGame.g:2957:1: ( ( rule__Action__ListeConnaissancesAssignment_5_1 )* )
            // InternalGame.g:2958:2: ( rule__Action__ListeConnaissancesAssignment_5_1 )*
            {
             before(grammarAccess.getActionAccess().getListeConnaissancesAssignment_5_1()); 
            // InternalGame.g:2959:2: ( rule__Action__ListeConnaissancesAssignment_5_1 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==RULE_ID) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalGame.g:2959:3: rule__Action__ListeConnaissancesAssignment_5_1
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Action__ListeConnaissancesAssignment_5_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

             after(grammarAccess.getActionAccess().getListeConnaissancesAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group_5__1__Impl"


    // $ANTLR start "rule__Action__Group_6__0"
    // InternalGame.g:2968:1: rule__Action__Group_6__0 : rule__Action__Group_6__0__Impl rule__Action__Group_6__1 ;
    public final void rule__Action__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2972:1: ( rule__Action__Group_6__0__Impl rule__Action__Group_6__1 )
            // InternalGame.g:2973:2: rule__Action__Group_6__0__Impl rule__Action__Group_6__1
            {
            pushFollow(FOLLOW_3);
            rule__Action__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Action__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group_6__0"


    // $ANTLR start "rule__Action__Group_6__0__Impl"
    // InternalGame.g:2980:1: rule__Action__Group_6__0__Impl : ( 'donneO' ) ;
    public final void rule__Action__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2984:1: ( ( 'donneO' ) )
            // InternalGame.g:2985:1: ( 'donneO' )
            {
            // InternalGame.g:2985:1: ( 'donneO' )
            // InternalGame.g:2986:2: 'donneO'
            {
             before(grammarAccess.getActionAccess().getDonneOKeyword_6_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getActionAccess().getDonneOKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group_6__0__Impl"


    // $ANTLR start "rule__Action__Group_6__1"
    // InternalGame.g:2995:1: rule__Action__Group_6__1 : rule__Action__Group_6__1__Impl ;
    public final void rule__Action__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2999:1: ( rule__Action__Group_6__1__Impl )
            // InternalGame.g:3000:2: rule__Action__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Action__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group_6__1"


    // $ANTLR start "rule__Action__Group_6__1__Impl"
    // InternalGame.g:3006:1: rule__Action__Group_6__1__Impl : ( ( rule__Action__ListeObjetsAssignment_6_1 )* ) ;
    public final void rule__Action__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3010:1: ( ( ( rule__Action__ListeObjetsAssignment_6_1 )* ) )
            // InternalGame.g:3011:1: ( ( rule__Action__ListeObjetsAssignment_6_1 )* )
            {
            // InternalGame.g:3011:1: ( ( rule__Action__ListeObjetsAssignment_6_1 )* )
            // InternalGame.g:3012:2: ( rule__Action__ListeObjetsAssignment_6_1 )*
            {
             before(grammarAccess.getActionAccess().getListeObjetsAssignment_6_1()); 
            // InternalGame.g:3013:2: ( rule__Action__ListeObjetsAssignment_6_1 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==RULE_ID) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalGame.g:3013:3: rule__Action__ListeObjetsAssignment_6_1
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Action__ListeObjetsAssignment_6_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

             after(grammarAccess.getActionAccess().getListeObjetsAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group_6__1__Impl"


    // $ANTLR start "rule__Action__Group_7__0"
    // InternalGame.g:3022:1: rule__Action__Group_7__0 : rule__Action__Group_7__0__Impl rule__Action__Group_7__1 ;
    public final void rule__Action__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3026:1: ( rule__Action__Group_7__0__Impl rule__Action__Group_7__1 )
            // InternalGame.g:3027:2: rule__Action__Group_7__0__Impl rule__Action__Group_7__1
            {
            pushFollow(FOLLOW_3);
            rule__Action__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Action__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group_7__0"


    // $ANTLR start "rule__Action__Group_7__0__Impl"
    // InternalGame.g:3034:1: rule__Action__Group_7__0__Impl : ( 'attributionC' ) ;
    public final void rule__Action__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3038:1: ( ( 'attributionC' ) )
            // InternalGame.g:3039:1: ( 'attributionC' )
            {
            // InternalGame.g:3039:1: ( 'attributionC' )
            // InternalGame.g:3040:2: 'attributionC'
            {
             before(grammarAccess.getActionAccess().getAttributionCKeyword_7_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getActionAccess().getAttributionCKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group_7__0__Impl"


    // $ANTLR start "rule__Action__Group_7__1"
    // InternalGame.g:3049:1: rule__Action__Group_7__1 : rule__Action__Group_7__1__Impl ;
    public final void rule__Action__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3053:1: ( rule__Action__Group_7__1__Impl )
            // InternalGame.g:3054:2: rule__Action__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Action__Group_7__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group_7__1"


    // $ANTLR start "rule__Action__Group_7__1__Impl"
    // InternalGame.g:3060:1: rule__Action__Group_7__1__Impl : ( ( rule__Action__AttributionConnaissanceAssignment_7_1 ) ) ;
    public final void rule__Action__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3064:1: ( ( ( rule__Action__AttributionConnaissanceAssignment_7_1 ) ) )
            // InternalGame.g:3065:1: ( ( rule__Action__AttributionConnaissanceAssignment_7_1 ) )
            {
            // InternalGame.g:3065:1: ( ( rule__Action__AttributionConnaissanceAssignment_7_1 ) )
            // InternalGame.g:3066:2: ( rule__Action__AttributionConnaissanceAssignment_7_1 )
            {
             before(grammarAccess.getActionAccess().getAttributionConnaissanceAssignment_7_1()); 
            // InternalGame.g:3067:2: ( rule__Action__AttributionConnaissanceAssignment_7_1 )
            // InternalGame.g:3067:3: rule__Action__AttributionConnaissanceAssignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__Action__AttributionConnaissanceAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getActionAccess().getAttributionConnaissanceAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group_7__1__Impl"


    // $ANTLR start "rule__Action__Group_8__0"
    // InternalGame.g:3076:1: rule__Action__Group_8__0 : rule__Action__Group_8__0__Impl rule__Action__Group_8__1 ;
    public final void rule__Action__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3080:1: ( rule__Action__Group_8__0__Impl rule__Action__Group_8__1 )
            // InternalGame.g:3081:2: rule__Action__Group_8__0__Impl rule__Action__Group_8__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalGame.g:3088:1: rule__Action__Group_8__0__Impl : ( 'attributionO' ) ;
    public final void rule__Action__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3092:1: ( ( 'attributionO' ) )
            // InternalGame.g:3093:1: ( 'attributionO' )
            {
            // InternalGame.g:3093:1: ( 'attributionO' )
            // InternalGame.g:3094:2: 'attributionO'
            {
             before(grammarAccess.getActionAccess().getAttributionOKeyword_8_0()); 
            match(input,37,FOLLOW_2); 
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
    // InternalGame.g:3103:1: rule__Action__Group_8__1 : rule__Action__Group_8__1__Impl ;
    public final void rule__Action__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3107:1: ( rule__Action__Group_8__1__Impl )
            // InternalGame.g:3108:2: rule__Action__Group_8__1__Impl
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
    // InternalGame.g:3114:1: rule__Action__Group_8__1__Impl : ( ( rule__Action__AttributionObjetAssignment_8_1 ) ) ;
    public final void rule__Action__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3118:1: ( ( ( rule__Action__AttributionObjetAssignment_8_1 ) ) )
            // InternalGame.g:3119:1: ( ( rule__Action__AttributionObjetAssignment_8_1 ) )
            {
            // InternalGame.g:3119:1: ( ( rule__Action__AttributionObjetAssignment_8_1 ) )
            // InternalGame.g:3120:2: ( rule__Action__AttributionObjetAssignment_8_1 )
            {
             before(grammarAccess.getActionAccess().getAttributionObjetAssignment_8_1()); 
            // InternalGame.g:3121:2: ( rule__Action__AttributionObjetAssignment_8_1 )
            // InternalGame.g:3121:3: rule__Action__AttributionObjetAssignment_8_1
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


    // $ANTLR start "rule__Action__Group_9__0"
    // InternalGame.g:3130:1: rule__Action__Group_9__0 : rule__Action__Group_9__0__Impl rule__Action__Group_9__1 ;
    public final void rule__Action__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3134:1: ( rule__Action__Group_9__0__Impl rule__Action__Group_9__1 )
            // InternalGame.g:3135:2: rule__Action__Group_9__0__Impl rule__Action__Group_9__1
            {
            pushFollow(FOLLOW_24);
            rule__Action__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Action__Group_9__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group_9__0"


    // $ANTLR start "rule__Action__Group_9__0__Impl"
    // InternalGame.g:3142:1: rule__Action__Group_9__0__Impl : ( 'consommeO' ) ;
    public final void rule__Action__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3146:1: ( ( 'consommeO' ) )
            // InternalGame.g:3147:1: ( 'consommeO' )
            {
            // InternalGame.g:3147:1: ( 'consommeO' )
            // InternalGame.g:3148:2: 'consommeO'
            {
             before(grammarAccess.getActionAccess().getConsommeOKeyword_9_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getActionAccess().getConsommeOKeyword_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group_9__0__Impl"


    // $ANTLR start "rule__Action__Group_9__1"
    // InternalGame.g:3157:1: rule__Action__Group_9__1 : rule__Action__Group_9__1__Impl rule__Action__Group_9__2 ;
    public final void rule__Action__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3161:1: ( rule__Action__Group_9__1__Impl rule__Action__Group_9__2 )
            // InternalGame.g:3162:2: rule__Action__Group_9__1__Impl rule__Action__Group_9__2
            {
            pushFollow(FOLLOW_24);
            rule__Action__Group_9__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Action__Group_9__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group_9__1"


    // $ANTLR start "rule__Action__Group_9__1__Impl"
    // InternalGame.g:3169:1: rule__Action__Group_9__1__Impl : ( ( rule__Action__ListeObjetsConsommesAssignment_9_1 )* ) ;
    public final void rule__Action__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3173:1: ( ( ( rule__Action__ListeObjetsConsommesAssignment_9_1 )* ) )
            // InternalGame.g:3174:1: ( ( rule__Action__ListeObjetsConsommesAssignment_9_1 )* )
            {
            // InternalGame.g:3174:1: ( ( rule__Action__ListeObjetsConsommesAssignment_9_1 )* )
            // InternalGame.g:3175:2: ( rule__Action__ListeObjetsConsommesAssignment_9_1 )*
            {
             before(grammarAccess.getActionAccess().getListeObjetsConsommesAssignment_9_1()); 
            // InternalGame.g:3176:2: ( rule__Action__ListeObjetsConsommesAssignment_9_1 )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==RULE_ID) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalGame.g:3176:3: rule__Action__ListeObjetsConsommesAssignment_9_1
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Action__ListeObjetsConsommesAssignment_9_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);

             after(grammarAccess.getActionAccess().getListeObjetsConsommesAssignment_9_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group_9__1__Impl"


    // $ANTLR start "rule__Action__Group_9__2"
    // InternalGame.g:3184:1: rule__Action__Group_9__2 : rule__Action__Group_9__2__Impl rule__Action__Group_9__3 ;
    public final void rule__Action__Group_9__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3188:1: ( rule__Action__Group_9__2__Impl rule__Action__Group_9__3 )
            // InternalGame.g:3189:2: rule__Action__Group_9__2__Impl rule__Action__Group_9__3
            {
            pushFollow(FOLLOW_12);
            rule__Action__Group_9__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Action__Group_9__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group_9__2"


    // $ANTLR start "rule__Action__Group_9__2__Impl"
    // InternalGame.g:3196:1: rule__Action__Group_9__2__Impl : ( 'quantiteO' ) ;
    public final void rule__Action__Group_9__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3200:1: ( ( 'quantiteO' ) )
            // InternalGame.g:3201:1: ( 'quantiteO' )
            {
            // InternalGame.g:3201:1: ( 'quantiteO' )
            // InternalGame.g:3202:2: 'quantiteO'
            {
             before(grammarAccess.getActionAccess().getQuantiteOKeyword_9_2()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getActionAccess().getQuantiteOKeyword_9_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group_9__2__Impl"


    // $ANTLR start "rule__Action__Group_9__3"
    // InternalGame.g:3211:1: rule__Action__Group_9__3 : rule__Action__Group_9__3__Impl ;
    public final void rule__Action__Group_9__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3215:1: ( rule__Action__Group_9__3__Impl )
            // InternalGame.g:3216:2: rule__Action__Group_9__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Action__Group_9__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group_9__3"


    // $ANTLR start "rule__Action__Group_9__3__Impl"
    // InternalGame.g:3222:1: rule__Action__Group_9__3__Impl : ( ( rule__Action__ListeQuantiteAssignment_9_3 )* ) ;
    public final void rule__Action__Group_9__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3226:1: ( ( ( rule__Action__ListeQuantiteAssignment_9_3 )* ) )
            // InternalGame.g:3227:1: ( ( rule__Action__ListeQuantiteAssignment_9_3 )* )
            {
            // InternalGame.g:3227:1: ( ( rule__Action__ListeQuantiteAssignment_9_3 )* )
            // InternalGame.g:3228:2: ( rule__Action__ListeQuantiteAssignment_9_3 )*
            {
             before(grammarAccess.getActionAccess().getListeQuantiteAssignment_9_3()); 
            // InternalGame.g:3229:2: ( rule__Action__ListeQuantiteAssignment_9_3 )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==RULE_INT) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalGame.g:3229:3: rule__Action__ListeQuantiteAssignment_9_3
            	    {
            	    pushFollow(FOLLOW_25);
            	    rule__Action__ListeQuantiteAssignment_9_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);

             after(grammarAccess.getActionAccess().getListeQuantiteAssignment_9_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group_9__3__Impl"


    // $ANTLR start "rule__Action__Group_10__0"
    // InternalGame.g:3238:1: rule__Action__Group_10__0 : rule__Action__Group_10__0__Impl rule__Action__Group_10__1 ;
    public final void rule__Action__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3242:1: ( rule__Action__Group_10__0__Impl rule__Action__Group_10__1 )
            // InternalGame.g:3243:2: rule__Action__Group_10__0__Impl rule__Action__Group_10__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalGame.g:3250:1: rule__Action__Group_10__0__Impl : ( 'consommationC' ) ;
    public final void rule__Action__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3254:1: ( ( 'consommationC' ) )
            // InternalGame.g:3255:1: ( 'consommationC' )
            {
            // InternalGame.g:3255:1: ( 'consommationC' )
            // InternalGame.g:3256:2: 'consommationC'
            {
             before(grammarAccess.getActionAccess().getConsommationCKeyword_10_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getActionAccess().getConsommationCKeyword_10_0()); 

            }


            }

        }
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
    // InternalGame.g:3265:1: rule__Action__Group_10__1 : rule__Action__Group_10__1__Impl ;
    public final void rule__Action__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3269:1: ( rule__Action__Group_10__1__Impl )
            // InternalGame.g:3270:2: rule__Action__Group_10__1__Impl
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
    // InternalGame.g:3276:1: rule__Action__Group_10__1__Impl : ( ( rule__Action__ConsommationObjetAssignment_10_1 ) ) ;
    public final void rule__Action__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3280:1: ( ( ( rule__Action__ConsommationObjetAssignment_10_1 ) ) )
            // InternalGame.g:3281:1: ( ( rule__Action__ConsommationObjetAssignment_10_1 ) )
            {
            // InternalGame.g:3281:1: ( ( rule__Action__ConsommationObjetAssignment_10_1 ) )
            // InternalGame.g:3282:2: ( rule__Action__ConsommationObjetAssignment_10_1 )
            {
             before(grammarAccess.getActionAccess().getConsommationObjetAssignment_10_1()); 
            // InternalGame.g:3283:2: ( rule__Action__ConsommationObjetAssignment_10_1 )
            // InternalGame.g:3283:3: rule__Action__ConsommationObjetAssignment_10_1
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
    // InternalGame.g:3292:1: rule__ObjetExplorateur__Group__0 : rule__ObjetExplorateur__Group__0__Impl rule__ObjetExplorateur__Group__1 ;
    public final void rule__ObjetExplorateur__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3296:1: ( rule__ObjetExplorateur__Group__0__Impl rule__ObjetExplorateur__Group__1 )
            // InternalGame.g:3297:2: rule__ObjetExplorateur__Group__0__Impl rule__ObjetExplorateur__Group__1
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
    // InternalGame.g:3304:1: rule__ObjetExplorateur__Group__0__Impl : ( ( rule__ObjetExplorateur__NameAssignment_0 ) ) ;
    public final void rule__ObjetExplorateur__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3308:1: ( ( ( rule__ObjetExplorateur__NameAssignment_0 ) ) )
            // InternalGame.g:3309:1: ( ( rule__ObjetExplorateur__NameAssignment_0 ) )
            {
            // InternalGame.g:3309:1: ( ( rule__ObjetExplorateur__NameAssignment_0 ) )
            // InternalGame.g:3310:2: ( rule__ObjetExplorateur__NameAssignment_0 )
            {
             before(grammarAccess.getObjetExplorateurAccess().getNameAssignment_0()); 
            // InternalGame.g:3311:2: ( rule__ObjetExplorateur__NameAssignment_0 )
            // InternalGame.g:3311:3: rule__ObjetExplorateur__NameAssignment_0
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
    // InternalGame.g:3319:1: rule__ObjetExplorateur__Group__1 : rule__ObjetExplorateur__Group__1__Impl rule__ObjetExplorateur__Group__2 ;
    public final void rule__ObjetExplorateur__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3323:1: ( rule__ObjetExplorateur__Group__1__Impl rule__ObjetExplorateur__Group__2 )
            // InternalGame.g:3324:2: rule__ObjetExplorateur__Group__1__Impl rule__ObjetExplorateur__Group__2
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
    // InternalGame.g:3331:1: rule__ObjetExplorateur__Group__1__Impl : ( ( rule__ObjetExplorateur__TailleAssignment_1 ) ) ;
    public final void rule__ObjetExplorateur__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3335:1: ( ( ( rule__ObjetExplorateur__TailleAssignment_1 ) ) )
            // InternalGame.g:3336:1: ( ( rule__ObjetExplorateur__TailleAssignment_1 ) )
            {
            // InternalGame.g:3336:1: ( ( rule__ObjetExplorateur__TailleAssignment_1 ) )
            // InternalGame.g:3337:2: ( rule__ObjetExplorateur__TailleAssignment_1 )
            {
             before(grammarAccess.getObjetExplorateurAccess().getTailleAssignment_1()); 
            // InternalGame.g:3338:2: ( rule__ObjetExplorateur__TailleAssignment_1 )
            // InternalGame.g:3338:3: rule__ObjetExplorateur__TailleAssignment_1
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
    // InternalGame.g:3346:1: rule__ObjetExplorateur__Group__2 : rule__ObjetExplorateur__Group__2__Impl rule__ObjetExplorateur__Group__3 ;
    public final void rule__ObjetExplorateur__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3350:1: ( rule__ObjetExplorateur__Group__2__Impl rule__ObjetExplorateur__Group__3 )
            // InternalGame.g:3351:2: rule__ObjetExplorateur__Group__2__Impl rule__ObjetExplorateur__Group__3
            {
            pushFollow(FOLLOW_26);
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
    // InternalGame.g:3358:1: rule__ObjetExplorateur__Group__2__Impl : ( ( rule__ObjetExplorateur__QuantiteAssignment_2 ) ) ;
    public final void rule__ObjetExplorateur__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3362:1: ( ( ( rule__ObjetExplorateur__QuantiteAssignment_2 ) ) )
            // InternalGame.g:3363:1: ( ( rule__ObjetExplorateur__QuantiteAssignment_2 ) )
            {
            // InternalGame.g:3363:1: ( ( rule__ObjetExplorateur__QuantiteAssignment_2 ) )
            // InternalGame.g:3364:2: ( rule__ObjetExplorateur__QuantiteAssignment_2 )
            {
             before(grammarAccess.getObjetExplorateurAccess().getQuantiteAssignment_2()); 
            // InternalGame.g:3365:2: ( rule__ObjetExplorateur__QuantiteAssignment_2 )
            // InternalGame.g:3365:3: rule__ObjetExplorateur__QuantiteAssignment_2
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
    // InternalGame.g:3373:1: rule__ObjetExplorateur__Group__3 : rule__ObjetExplorateur__Group__3__Impl rule__ObjetExplorateur__Group__4 ;
    public final void rule__ObjetExplorateur__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3377:1: ( rule__ObjetExplorateur__Group__3__Impl rule__ObjetExplorateur__Group__4 )
            // InternalGame.g:3378:2: rule__ObjetExplorateur__Group__3__Impl rule__ObjetExplorateur__Group__4
            {
            pushFollow(FOLLOW_26);
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
    // InternalGame.g:3385:1: rule__ObjetExplorateur__Group__3__Impl : ( ( rule__ObjetExplorateur__Group_3__0 )? ) ;
    public final void rule__ObjetExplorateur__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3389:1: ( ( ( rule__ObjetExplorateur__Group_3__0 )? ) )
            // InternalGame.g:3390:1: ( ( rule__ObjetExplorateur__Group_3__0 )? )
            {
            // InternalGame.g:3390:1: ( ( rule__ObjetExplorateur__Group_3__0 )? )
            // InternalGame.g:3391:2: ( rule__ObjetExplorateur__Group_3__0 )?
            {
             before(grammarAccess.getObjetExplorateurAccess().getGroup_3()); 
            // InternalGame.g:3392:2: ( rule__ObjetExplorateur__Group_3__0 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==23) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalGame.g:3392:3: rule__ObjetExplorateur__Group_3__0
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
    // InternalGame.g:3400:1: rule__ObjetExplorateur__Group__4 : rule__ObjetExplorateur__Group__4__Impl ;
    public final void rule__ObjetExplorateur__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3404:1: ( rule__ObjetExplorateur__Group__4__Impl )
            // InternalGame.g:3405:2: rule__ObjetExplorateur__Group__4__Impl
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
    // InternalGame.g:3411:1: rule__ObjetExplorateur__Group__4__Impl : ( ( rule__ObjetExplorateur__Group_4__0 )? ) ;
    public final void rule__ObjetExplorateur__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3415:1: ( ( ( rule__ObjetExplorateur__Group_4__0 )? ) )
            // InternalGame.g:3416:1: ( ( rule__ObjetExplorateur__Group_4__0 )? )
            {
            // InternalGame.g:3416:1: ( ( rule__ObjetExplorateur__Group_4__0 )? )
            // InternalGame.g:3417:2: ( rule__ObjetExplorateur__Group_4__0 )?
            {
             before(grammarAccess.getObjetExplorateurAccess().getGroup_4()); 
            // InternalGame.g:3418:2: ( rule__ObjetExplorateur__Group_4__0 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==41) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalGame.g:3418:3: rule__ObjetExplorateur__Group_4__0
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
    // InternalGame.g:3427:1: rule__ObjetExplorateur__Group_3__0 : rule__ObjetExplorateur__Group_3__0__Impl rule__ObjetExplorateur__Group_3__1 ;
    public final void rule__ObjetExplorateur__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3431:1: ( rule__ObjetExplorateur__Group_3__0__Impl rule__ObjetExplorateur__Group_3__1 )
            // InternalGame.g:3432:2: rule__ObjetExplorateur__Group_3__0__Impl rule__ObjetExplorateur__Group_3__1
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
    // InternalGame.g:3439:1: rule__ObjetExplorateur__Group_3__0__Impl : ( 'description' ) ;
    public final void rule__ObjetExplorateur__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3443:1: ( ( 'description' ) )
            // InternalGame.g:3444:1: ( 'description' )
            {
            // InternalGame.g:3444:1: ( 'description' )
            // InternalGame.g:3445:2: 'description'
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
    // InternalGame.g:3454:1: rule__ObjetExplorateur__Group_3__1 : rule__ObjetExplorateur__Group_3__1__Impl rule__ObjetExplorateur__Group_3__2 ;
    public final void rule__ObjetExplorateur__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3458:1: ( rule__ObjetExplorateur__Group_3__1__Impl rule__ObjetExplorateur__Group_3__2 )
            // InternalGame.g:3459:2: rule__ObjetExplorateur__Group_3__1__Impl rule__ObjetExplorateur__Group_3__2
            {
            pushFollow(FOLLOW_3);
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
    // InternalGame.g:3466:1: rule__ObjetExplorateur__Group_3__1__Impl : ( ( rule__ObjetExplorateur__DescriptionAssignment_3_1 ) ) ;
    public final void rule__ObjetExplorateur__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3470:1: ( ( ( rule__ObjetExplorateur__DescriptionAssignment_3_1 ) ) )
            // InternalGame.g:3471:1: ( ( rule__ObjetExplorateur__DescriptionAssignment_3_1 ) )
            {
            // InternalGame.g:3471:1: ( ( rule__ObjetExplorateur__DescriptionAssignment_3_1 ) )
            // InternalGame.g:3472:2: ( rule__ObjetExplorateur__DescriptionAssignment_3_1 )
            {
             before(grammarAccess.getObjetExplorateurAccess().getDescriptionAssignment_3_1()); 
            // InternalGame.g:3473:2: ( rule__ObjetExplorateur__DescriptionAssignment_3_1 )
            // InternalGame.g:3473:3: rule__ObjetExplorateur__DescriptionAssignment_3_1
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
    // InternalGame.g:3481:1: rule__ObjetExplorateur__Group_3__2 : rule__ObjetExplorateur__Group_3__2__Impl ;
    public final void rule__ObjetExplorateur__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3485:1: ( rule__ObjetExplorateur__Group_3__2__Impl )
            // InternalGame.g:3486:2: rule__ObjetExplorateur__Group_3__2__Impl
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
    // InternalGame.g:3492:1: rule__ObjetExplorateur__Group_3__2__Impl : ( ( rule__ObjetExplorateur__ConditionDescriptionAssignment_3_2 )? ) ;
    public final void rule__ObjetExplorateur__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3496:1: ( ( ( rule__ObjetExplorateur__ConditionDescriptionAssignment_3_2 )? ) )
            // InternalGame.g:3497:1: ( ( rule__ObjetExplorateur__ConditionDescriptionAssignment_3_2 )? )
            {
            // InternalGame.g:3497:1: ( ( rule__ObjetExplorateur__ConditionDescriptionAssignment_3_2 )? )
            // InternalGame.g:3498:2: ( rule__ObjetExplorateur__ConditionDescriptionAssignment_3_2 )?
            {
             before(grammarAccess.getObjetExplorateurAccess().getConditionDescriptionAssignment_3_2()); 
            // InternalGame.g:3499:2: ( rule__ObjetExplorateur__ConditionDescriptionAssignment_3_2 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==RULE_ID) ) {
                int LA36_1 = input.LA(2);

                if ( (LA36_1==RULE_STRING) ) {
                    alt36=1;
                }
            }
            switch (alt36) {
                case 1 :
                    // InternalGame.g:3499:3: rule__ObjetExplorateur__ConditionDescriptionAssignment_3_2
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
    // InternalGame.g:3508:1: rule__ObjetExplorateur__Group_4__0 : rule__ObjetExplorateur__Group_4__0__Impl rule__ObjetExplorateur__Group_4__1 ;
    public final void rule__ObjetExplorateur__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3512:1: ( rule__ObjetExplorateur__Group_4__0__Impl rule__ObjetExplorateur__Group_4__1 )
            // InternalGame.g:3513:2: rule__ObjetExplorateur__Group_4__0__Impl rule__ObjetExplorateur__Group_4__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalGame.g:3520:1: rule__ObjetExplorateur__Group_4__0__Impl : ( 'transformable' ) ;
    public final void rule__ObjetExplorateur__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3524:1: ( ( 'transformable' ) )
            // InternalGame.g:3525:1: ( 'transformable' )
            {
            // InternalGame.g:3525:1: ( 'transformable' )
            // InternalGame.g:3526:2: 'transformable'
            {
             before(grammarAccess.getObjetExplorateurAccess().getTransformableKeyword_4_0()); 
            match(input,41,FOLLOW_2); 
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
    // InternalGame.g:3535:1: rule__ObjetExplorateur__Group_4__1 : rule__ObjetExplorateur__Group_4__1__Impl ;
    public final void rule__ObjetExplorateur__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3539:1: ( rule__ObjetExplorateur__Group_4__1__Impl )
            // InternalGame.g:3540:2: rule__ObjetExplorateur__Group_4__1__Impl
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
    // InternalGame.g:3546:1: rule__ObjetExplorateur__Group_4__1__Impl : ( ( rule__ObjetExplorateur__TransformableAssignment_4_1 )? ) ;
    public final void rule__ObjetExplorateur__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3550:1: ( ( ( rule__ObjetExplorateur__TransformableAssignment_4_1 )? ) )
            // InternalGame.g:3551:1: ( ( rule__ObjetExplorateur__TransformableAssignment_4_1 )? )
            {
            // InternalGame.g:3551:1: ( ( rule__ObjetExplorateur__TransformableAssignment_4_1 )? )
            // InternalGame.g:3552:2: ( rule__ObjetExplorateur__TransformableAssignment_4_1 )?
            {
             before(grammarAccess.getObjetExplorateurAccess().getTransformableAssignment_4_1()); 
            // InternalGame.g:3553:2: ( rule__ObjetExplorateur__TransformableAssignment_4_1 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==RULE_ID) ) {
                int LA37_1 = input.LA(2);

                if ( (LA37_1==RULE_STRING) ) {
                    alt37=1;
                }
            }
            switch (alt37) {
                case 1 :
                    // InternalGame.g:3553:3: rule__ObjetExplorateur__TransformableAssignment_4_1
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
    // InternalGame.g:3562:1: rule__ObjetLieu__Group__0 : rule__ObjetLieu__Group__0__Impl rule__ObjetLieu__Group__1 ;
    public final void rule__ObjetLieu__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3566:1: ( rule__ObjetLieu__Group__0__Impl rule__ObjetLieu__Group__1 )
            // InternalGame.g:3567:2: rule__ObjetLieu__Group__0__Impl rule__ObjetLieu__Group__1
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
    // InternalGame.g:3574:1: rule__ObjetLieu__Group__0__Impl : ( ( rule__ObjetLieu__NameAssignment_0 ) ) ;
    public final void rule__ObjetLieu__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3578:1: ( ( ( rule__ObjetLieu__NameAssignment_0 ) ) )
            // InternalGame.g:3579:1: ( ( rule__ObjetLieu__NameAssignment_0 ) )
            {
            // InternalGame.g:3579:1: ( ( rule__ObjetLieu__NameAssignment_0 ) )
            // InternalGame.g:3580:2: ( rule__ObjetLieu__NameAssignment_0 )
            {
             before(grammarAccess.getObjetLieuAccess().getNameAssignment_0()); 
            // InternalGame.g:3581:2: ( rule__ObjetLieu__NameAssignment_0 )
            // InternalGame.g:3581:3: rule__ObjetLieu__NameAssignment_0
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
    // InternalGame.g:3589:1: rule__ObjetLieu__Group__1 : rule__ObjetLieu__Group__1__Impl rule__ObjetLieu__Group__2 ;
    public final void rule__ObjetLieu__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3593:1: ( rule__ObjetLieu__Group__1__Impl rule__ObjetLieu__Group__2 )
            // InternalGame.g:3594:2: rule__ObjetLieu__Group__1__Impl rule__ObjetLieu__Group__2
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
    // InternalGame.g:3601:1: rule__ObjetLieu__Group__1__Impl : ( ( rule__ObjetLieu__TailleAssignment_1 ) ) ;
    public final void rule__ObjetLieu__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3605:1: ( ( ( rule__ObjetLieu__TailleAssignment_1 ) ) )
            // InternalGame.g:3606:1: ( ( rule__ObjetLieu__TailleAssignment_1 ) )
            {
            // InternalGame.g:3606:1: ( ( rule__ObjetLieu__TailleAssignment_1 ) )
            // InternalGame.g:3607:2: ( rule__ObjetLieu__TailleAssignment_1 )
            {
             before(grammarAccess.getObjetLieuAccess().getTailleAssignment_1()); 
            // InternalGame.g:3608:2: ( rule__ObjetLieu__TailleAssignment_1 )
            // InternalGame.g:3608:3: rule__ObjetLieu__TailleAssignment_1
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
    // InternalGame.g:3616:1: rule__ObjetLieu__Group__2 : rule__ObjetLieu__Group__2__Impl rule__ObjetLieu__Group__3 ;
    public final void rule__ObjetLieu__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3620:1: ( rule__ObjetLieu__Group__2__Impl rule__ObjetLieu__Group__3 )
            // InternalGame.g:3621:2: rule__ObjetLieu__Group__2__Impl rule__ObjetLieu__Group__3
            {
            pushFollow(FOLLOW_27);
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
    // InternalGame.g:3628:1: rule__ObjetLieu__Group__2__Impl : ( ( rule__ObjetLieu__QuantiteAssignment_2 ) ) ;
    public final void rule__ObjetLieu__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3632:1: ( ( ( rule__ObjetLieu__QuantiteAssignment_2 ) ) )
            // InternalGame.g:3633:1: ( ( rule__ObjetLieu__QuantiteAssignment_2 ) )
            {
            // InternalGame.g:3633:1: ( ( rule__ObjetLieu__QuantiteAssignment_2 ) )
            // InternalGame.g:3634:2: ( rule__ObjetLieu__QuantiteAssignment_2 )
            {
             before(grammarAccess.getObjetLieuAccess().getQuantiteAssignment_2()); 
            // InternalGame.g:3635:2: ( rule__ObjetLieu__QuantiteAssignment_2 )
            // InternalGame.g:3635:3: rule__ObjetLieu__QuantiteAssignment_2
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
    // InternalGame.g:3643:1: rule__ObjetLieu__Group__3 : rule__ObjetLieu__Group__3__Impl rule__ObjetLieu__Group__4 ;
    public final void rule__ObjetLieu__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3647:1: ( rule__ObjetLieu__Group__3__Impl rule__ObjetLieu__Group__4 )
            // InternalGame.g:3648:2: rule__ObjetLieu__Group__3__Impl rule__ObjetLieu__Group__4
            {
            pushFollow(FOLLOW_27);
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
    // InternalGame.g:3655:1: rule__ObjetLieu__Group__3__Impl : ( ( rule__ObjetLieu__Group_3__0 )? ) ;
    public final void rule__ObjetLieu__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3659:1: ( ( ( rule__ObjetLieu__Group_3__0 )? ) )
            // InternalGame.g:3660:1: ( ( rule__ObjetLieu__Group_3__0 )? )
            {
            // InternalGame.g:3660:1: ( ( rule__ObjetLieu__Group_3__0 )? )
            // InternalGame.g:3661:2: ( rule__ObjetLieu__Group_3__0 )?
            {
             before(grammarAccess.getObjetLieuAccess().getGroup_3()); 
            // InternalGame.g:3662:2: ( rule__ObjetLieu__Group_3__0 )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==42) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalGame.g:3662:3: rule__ObjetLieu__Group_3__0
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
    // InternalGame.g:3670:1: rule__ObjetLieu__Group__4 : rule__ObjetLieu__Group__4__Impl rule__ObjetLieu__Group__5 ;
    public final void rule__ObjetLieu__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3674:1: ( rule__ObjetLieu__Group__4__Impl rule__ObjetLieu__Group__5 )
            // InternalGame.g:3675:2: rule__ObjetLieu__Group__4__Impl rule__ObjetLieu__Group__5
            {
            pushFollow(FOLLOW_27);
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
    // InternalGame.g:3682:1: rule__ObjetLieu__Group__4__Impl : ( ( rule__ObjetLieu__Group_4__0 )? ) ;
    public final void rule__ObjetLieu__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3686:1: ( ( ( rule__ObjetLieu__Group_4__0 )? ) )
            // InternalGame.g:3687:1: ( ( rule__ObjetLieu__Group_4__0 )? )
            {
            // InternalGame.g:3687:1: ( ( rule__ObjetLieu__Group_4__0 )? )
            // InternalGame.g:3688:2: ( rule__ObjetLieu__Group_4__0 )?
            {
             before(grammarAccess.getObjetLieuAccess().getGroup_4()); 
            // InternalGame.g:3689:2: ( rule__ObjetLieu__Group_4__0 )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==43) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalGame.g:3689:3: rule__ObjetLieu__Group_4__0
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
    // InternalGame.g:3697:1: rule__ObjetLieu__Group__5 : rule__ObjetLieu__Group__5__Impl rule__ObjetLieu__Group__6 ;
    public final void rule__ObjetLieu__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3701:1: ( rule__ObjetLieu__Group__5__Impl rule__ObjetLieu__Group__6 )
            // InternalGame.g:3702:2: rule__ObjetLieu__Group__5__Impl rule__ObjetLieu__Group__6
            {
            pushFollow(FOLLOW_27);
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
    // InternalGame.g:3709:1: rule__ObjetLieu__Group__5__Impl : ( ( rule__ObjetLieu__Group_5__0 )? ) ;
    public final void rule__ObjetLieu__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3713:1: ( ( ( rule__ObjetLieu__Group_5__0 )? ) )
            // InternalGame.g:3714:1: ( ( rule__ObjetLieu__Group_5__0 )? )
            {
            // InternalGame.g:3714:1: ( ( rule__ObjetLieu__Group_5__0 )? )
            // InternalGame.g:3715:2: ( rule__ObjetLieu__Group_5__0 )?
            {
             before(grammarAccess.getObjetLieuAccess().getGroup_5()); 
            // InternalGame.g:3716:2: ( rule__ObjetLieu__Group_5__0 )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==23) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalGame.g:3716:3: rule__ObjetLieu__Group_5__0
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
    // InternalGame.g:3724:1: rule__ObjetLieu__Group__6 : rule__ObjetLieu__Group__6__Impl ;
    public final void rule__ObjetLieu__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3728:1: ( rule__ObjetLieu__Group__6__Impl )
            // InternalGame.g:3729:2: rule__ObjetLieu__Group__6__Impl
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
    // InternalGame.g:3735:1: rule__ObjetLieu__Group__6__Impl : ( ( rule__ObjetLieu__Group_6__0 )? ) ;
    public final void rule__ObjetLieu__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3739:1: ( ( ( rule__ObjetLieu__Group_6__0 )? ) )
            // InternalGame.g:3740:1: ( ( rule__ObjetLieu__Group_6__0 )? )
            {
            // InternalGame.g:3740:1: ( ( rule__ObjetLieu__Group_6__0 )? )
            // InternalGame.g:3741:2: ( rule__ObjetLieu__Group_6__0 )?
            {
             before(grammarAccess.getObjetLieuAccess().getGroup_6()); 
            // InternalGame.g:3742:2: ( rule__ObjetLieu__Group_6__0 )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==41) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalGame.g:3742:3: rule__ObjetLieu__Group_6__0
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
    // InternalGame.g:3751:1: rule__ObjetLieu__Group_3__0 : rule__ObjetLieu__Group_3__0__Impl rule__ObjetLieu__Group_3__1 ;
    public final void rule__ObjetLieu__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3755:1: ( rule__ObjetLieu__Group_3__0__Impl rule__ObjetLieu__Group_3__1 )
            // InternalGame.g:3756:2: rule__ObjetLieu__Group_3__0__Impl rule__ObjetLieu__Group_3__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalGame.g:3763:1: rule__ObjetLieu__Group_3__0__Impl : ( 'transmission' ) ;
    public final void rule__ObjetLieu__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3767:1: ( ( 'transmission' ) )
            // InternalGame.g:3768:1: ( 'transmission' )
            {
            // InternalGame.g:3768:1: ( 'transmission' )
            // InternalGame.g:3769:2: 'transmission'
            {
             before(grammarAccess.getObjetLieuAccess().getTransmissionKeyword_3_0()); 
            match(input,42,FOLLOW_2); 
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
    // InternalGame.g:3778:1: rule__ObjetLieu__Group_3__1 : rule__ObjetLieu__Group_3__1__Impl ;
    public final void rule__ObjetLieu__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3782:1: ( rule__ObjetLieu__Group_3__1__Impl )
            // InternalGame.g:3783:2: rule__ObjetLieu__Group_3__1__Impl
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
    // InternalGame.g:3789:1: rule__ObjetLieu__Group_3__1__Impl : ( ( rule__ObjetLieu__ConditionTransmissionAssignment_3_1 )? ) ;
    public final void rule__ObjetLieu__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3793:1: ( ( ( rule__ObjetLieu__ConditionTransmissionAssignment_3_1 )? ) )
            // InternalGame.g:3794:1: ( ( rule__ObjetLieu__ConditionTransmissionAssignment_3_1 )? )
            {
            // InternalGame.g:3794:1: ( ( rule__ObjetLieu__ConditionTransmissionAssignment_3_1 )? )
            // InternalGame.g:3795:2: ( rule__ObjetLieu__ConditionTransmissionAssignment_3_1 )?
            {
             before(grammarAccess.getObjetLieuAccess().getConditionTransmissionAssignment_3_1()); 
            // InternalGame.g:3796:2: ( rule__ObjetLieu__ConditionTransmissionAssignment_3_1 )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==RULE_ID) ) {
                int LA42_1 = input.LA(2);

                if ( (LA42_1==RULE_STRING) ) {
                    alt42=1;
                }
            }
            switch (alt42) {
                case 1 :
                    // InternalGame.g:3796:3: rule__ObjetLieu__ConditionTransmissionAssignment_3_1
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
    // InternalGame.g:3805:1: rule__ObjetLieu__Group_4__0 : rule__ObjetLieu__Group_4__0__Impl rule__ObjetLieu__Group_4__1 ;
    public final void rule__ObjetLieu__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3809:1: ( rule__ObjetLieu__Group_4__0__Impl rule__ObjetLieu__Group_4__1 )
            // InternalGame.g:3810:2: rule__ObjetLieu__Group_4__0__Impl rule__ObjetLieu__Group_4__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalGame.g:3817:1: rule__ObjetLieu__Group_4__0__Impl : ( 'consommation' ) ;
    public final void rule__ObjetLieu__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3821:1: ( ( 'consommation' ) )
            // InternalGame.g:3822:1: ( 'consommation' )
            {
            // InternalGame.g:3822:1: ( 'consommation' )
            // InternalGame.g:3823:2: 'consommation'
            {
             before(grammarAccess.getObjetLieuAccess().getConsommationKeyword_4_0()); 
            match(input,43,FOLLOW_2); 
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
    // InternalGame.g:3832:1: rule__ObjetLieu__Group_4__1 : rule__ObjetLieu__Group_4__1__Impl ;
    public final void rule__ObjetLieu__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3836:1: ( rule__ObjetLieu__Group_4__1__Impl )
            // InternalGame.g:3837:2: rule__ObjetLieu__Group_4__1__Impl
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
    // InternalGame.g:3843:1: rule__ObjetLieu__Group_4__1__Impl : ( ( rule__ObjetLieu__ConditionConsommationAssignment_4_1 )? ) ;
    public final void rule__ObjetLieu__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3847:1: ( ( ( rule__ObjetLieu__ConditionConsommationAssignment_4_1 )? ) )
            // InternalGame.g:3848:1: ( ( rule__ObjetLieu__ConditionConsommationAssignment_4_1 )? )
            {
            // InternalGame.g:3848:1: ( ( rule__ObjetLieu__ConditionConsommationAssignment_4_1 )? )
            // InternalGame.g:3849:2: ( rule__ObjetLieu__ConditionConsommationAssignment_4_1 )?
            {
             before(grammarAccess.getObjetLieuAccess().getConditionConsommationAssignment_4_1()); 
            // InternalGame.g:3850:2: ( rule__ObjetLieu__ConditionConsommationAssignment_4_1 )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==RULE_ID) ) {
                int LA43_1 = input.LA(2);

                if ( (LA43_1==RULE_STRING) ) {
                    alt43=1;
                }
            }
            switch (alt43) {
                case 1 :
                    // InternalGame.g:3850:3: rule__ObjetLieu__ConditionConsommationAssignment_4_1
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
    // InternalGame.g:3859:1: rule__ObjetLieu__Group_5__0 : rule__ObjetLieu__Group_5__0__Impl rule__ObjetLieu__Group_5__1 ;
    public final void rule__ObjetLieu__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3863:1: ( rule__ObjetLieu__Group_5__0__Impl rule__ObjetLieu__Group_5__1 )
            // InternalGame.g:3864:2: rule__ObjetLieu__Group_5__0__Impl rule__ObjetLieu__Group_5__1
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
    // InternalGame.g:3871:1: rule__ObjetLieu__Group_5__0__Impl : ( 'description' ) ;
    public final void rule__ObjetLieu__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3875:1: ( ( 'description' ) )
            // InternalGame.g:3876:1: ( 'description' )
            {
            // InternalGame.g:3876:1: ( 'description' )
            // InternalGame.g:3877:2: 'description'
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
    // InternalGame.g:3886:1: rule__ObjetLieu__Group_5__1 : rule__ObjetLieu__Group_5__1__Impl rule__ObjetLieu__Group_5__2 ;
    public final void rule__ObjetLieu__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3890:1: ( rule__ObjetLieu__Group_5__1__Impl rule__ObjetLieu__Group_5__2 )
            // InternalGame.g:3891:2: rule__ObjetLieu__Group_5__1__Impl rule__ObjetLieu__Group_5__2
            {
            pushFollow(FOLLOW_3);
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
    // InternalGame.g:3898:1: rule__ObjetLieu__Group_5__1__Impl : ( ( rule__ObjetLieu__DescriptionAssignment_5_1 ) ) ;
    public final void rule__ObjetLieu__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3902:1: ( ( ( rule__ObjetLieu__DescriptionAssignment_5_1 ) ) )
            // InternalGame.g:3903:1: ( ( rule__ObjetLieu__DescriptionAssignment_5_1 ) )
            {
            // InternalGame.g:3903:1: ( ( rule__ObjetLieu__DescriptionAssignment_5_1 ) )
            // InternalGame.g:3904:2: ( rule__ObjetLieu__DescriptionAssignment_5_1 )
            {
             before(grammarAccess.getObjetLieuAccess().getDescriptionAssignment_5_1()); 
            // InternalGame.g:3905:2: ( rule__ObjetLieu__DescriptionAssignment_5_1 )
            // InternalGame.g:3905:3: rule__ObjetLieu__DescriptionAssignment_5_1
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
    // InternalGame.g:3913:1: rule__ObjetLieu__Group_5__2 : rule__ObjetLieu__Group_5__2__Impl ;
    public final void rule__ObjetLieu__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3917:1: ( rule__ObjetLieu__Group_5__2__Impl )
            // InternalGame.g:3918:2: rule__ObjetLieu__Group_5__2__Impl
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
    // InternalGame.g:3924:1: rule__ObjetLieu__Group_5__2__Impl : ( ( rule__ObjetLieu__ConditionDescriptionAssignment_5_2 )? ) ;
    public final void rule__ObjetLieu__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3928:1: ( ( ( rule__ObjetLieu__ConditionDescriptionAssignment_5_2 )? ) )
            // InternalGame.g:3929:1: ( ( rule__ObjetLieu__ConditionDescriptionAssignment_5_2 )? )
            {
            // InternalGame.g:3929:1: ( ( rule__ObjetLieu__ConditionDescriptionAssignment_5_2 )? )
            // InternalGame.g:3930:2: ( rule__ObjetLieu__ConditionDescriptionAssignment_5_2 )?
            {
             before(grammarAccess.getObjetLieuAccess().getConditionDescriptionAssignment_5_2()); 
            // InternalGame.g:3931:2: ( rule__ObjetLieu__ConditionDescriptionAssignment_5_2 )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==RULE_ID) ) {
                int LA44_1 = input.LA(2);

                if ( (LA44_1==RULE_STRING) ) {
                    alt44=1;
                }
            }
            switch (alt44) {
                case 1 :
                    // InternalGame.g:3931:3: rule__ObjetLieu__ConditionDescriptionAssignment_5_2
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
    // InternalGame.g:3940:1: rule__ObjetLieu__Group_6__0 : rule__ObjetLieu__Group_6__0__Impl rule__ObjetLieu__Group_6__1 ;
    public final void rule__ObjetLieu__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3944:1: ( rule__ObjetLieu__Group_6__0__Impl rule__ObjetLieu__Group_6__1 )
            // InternalGame.g:3945:2: rule__ObjetLieu__Group_6__0__Impl rule__ObjetLieu__Group_6__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalGame.g:3952:1: rule__ObjetLieu__Group_6__0__Impl : ( 'transformable' ) ;
    public final void rule__ObjetLieu__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3956:1: ( ( 'transformable' ) )
            // InternalGame.g:3957:1: ( 'transformable' )
            {
            // InternalGame.g:3957:1: ( 'transformable' )
            // InternalGame.g:3958:2: 'transformable'
            {
             before(grammarAccess.getObjetLieuAccess().getTransformableKeyword_6_0()); 
            match(input,41,FOLLOW_2); 
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
    // InternalGame.g:3967:1: rule__ObjetLieu__Group_6__1 : rule__ObjetLieu__Group_6__1__Impl ;
    public final void rule__ObjetLieu__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3971:1: ( rule__ObjetLieu__Group_6__1__Impl )
            // InternalGame.g:3972:2: rule__ObjetLieu__Group_6__1__Impl
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
    // InternalGame.g:3978:1: rule__ObjetLieu__Group_6__1__Impl : ( ( rule__ObjetLieu__TransformableAssignment_6_1 )? ) ;
    public final void rule__ObjetLieu__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3982:1: ( ( ( rule__ObjetLieu__TransformableAssignment_6_1 )? ) )
            // InternalGame.g:3983:1: ( ( rule__ObjetLieu__TransformableAssignment_6_1 )? )
            {
            // InternalGame.g:3983:1: ( ( rule__ObjetLieu__TransformableAssignment_6_1 )? )
            // InternalGame.g:3984:2: ( rule__ObjetLieu__TransformableAssignment_6_1 )?
            {
             before(grammarAccess.getObjetLieuAccess().getTransformableAssignment_6_1()); 
            // InternalGame.g:3985:2: ( rule__ObjetLieu__TransformableAssignment_6_1 )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==RULE_ID) ) {
                int LA45_1 = input.LA(2);

                if ( (LA45_1==RULE_STRING) ) {
                    alt45=1;
                }
            }
            switch (alt45) {
                case 1 :
                    // InternalGame.g:3985:3: rule__ObjetLieu__TransformableAssignment_6_1
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
    // InternalGame.g:3994:1: rule__ObjetsExplorateur__Group__0 : rule__ObjetsExplorateur__Group__0__Impl rule__ObjetsExplorateur__Group__1 ;
    public final void rule__ObjetsExplorateur__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3998:1: ( rule__ObjetsExplorateur__Group__0__Impl rule__ObjetsExplorateur__Group__1 )
            // InternalGame.g:3999:2: rule__ObjetsExplorateur__Group__0__Impl rule__ObjetsExplorateur__Group__1
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
    // InternalGame.g:4006:1: rule__ObjetsExplorateur__Group__0__Impl : ( 'objetsE' ) ;
    public final void rule__ObjetsExplorateur__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4010:1: ( ( 'objetsE' ) )
            // InternalGame.g:4011:1: ( 'objetsE' )
            {
            // InternalGame.g:4011:1: ( 'objetsE' )
            // InternalGame.g:4012:2: 'objetsE'
            {
             before(grammarAccess.getObjetsExplorateurAccess().getObjetsEKeyword_0()); 
            match(input,44,FOLLOW_2); 
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
    // InternalGame.g:4021:1: rule__ObjetsExplorateur__Group__1 : rule__ObjetsExplorateur__Group__1__Impl rule__ObjetsExplorateur__Group__2 ;
    public final void rule__ObjetsExplorateur__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4025:1: ( rule__ObjetsExplorateur__Group__1__Impl rule__ObjetsExplorateur__Group__2 )
            // InternalGame.g:4026:2: rule__ObjetsExplorateur__Group__1__Impl rule__ObjetsExplorateur__Group__2
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
    // InternalGame.g:4033:1: rule__ObjetsExplorateur__Group__1__Impl : ( '{' ) ;
    public final void rule__ObjetsExplorateur__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4037:1: ( ( '{' ) )
            // InternalGame.g:4038:1: ( '{' )
            {
            // InternalGame.g:4038:1: ( '{' )
            // InternalGame.g:4039:2: '{'
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
    // InternalGame.g:4048:1: rule__ObjetsExplorateur__Group__2 : rule__ObjetsExplorateur__Group__2__Impl rule__ObjetsExplorateur__Group__3 ;
    public final void rule__ObjetsExplorateur__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4052:1: ( rule__ObjetsExplorateur__Group__2__Impl rule__ObjetsExplorateur__Group__3 )
            // InternalGame.g:4053:2: rule__ObjetsExplorateur__Group__2__Impl rule__ObjetsExplorateur__Group__3
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
    // InternalGame.g:4060:1: rule__ObjetsExplorateur__Group__2__Impl : ( ( rule__ObjetsExplorateur__ListeObjetsAssignment_2 )* ) ;
    public final void rule__ObjetsExplorateur__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4064:1: ( ( ( rule__ObjetsExplorateur__ListeObjetsAssignment_2 )* ) )
            // InternalGame.g:4065:1: ( ( rule__ObjetsExplorateur__ListeObjetsAssignment_2 )* )
            {
            // InternalGame.g:4065:1: ( ( rule__ObjetsExplorateur__ListeObjetsAssignment_2 )* )
            // InternalGame.g:4066:2: ( rule__ObjetsExplorateur__ListeObjetsAssignment_2 )*
            {
             before(grammarAccess.getObjetsExplorateurAccess().getListeObjetsAssignment_2()); 
            // InternalGame.g:4067:2: ( rule__ObjetsExplorateur__ListeObjetsAssignment_2 )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==RULE_ID) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // InternalGame.g:4067:3: rule__ObjetsExplorateur__ListeObjetsAssignment_2
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__ObjetsExplorateur__ListeObjetsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop46;
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
    // InternalGame.g:4075:1: rule__ObjetsExplorateur__Group__3 : rule__ObjetsExplorateur__Group__3__Impl ;
    public final void rule__ObjetsExplorateur__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4079:1: ( rule__ObjetsExplorateur__Group__3__Impl )
            // InternalGame.g:4080:2: rule__ObjetsExplorateur__Group__3__Impl
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
    // InternalGame.g:4086:1: rule__ObjetsExplorateur__Group__3__Impl : ( '}' ) ;
    public final void rule__ObjetsExplorateur__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4090:1: ( ( '}' ) )
            // InternalGame.g:4091:1: ( '}' )
            {
            // InternalGame.g:4091:1: ( '}' )
            // InternalGame.g:4092:2: '}'
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
    // InternalGame.g:4102:1: rule__ObjetsLieu__Group__0 : rule__ObjetsLieu__Group__0__Impl rule__ObjetsLieu__Group__1 ;
    public final void rule__ObjetsLieu__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4106:1: ( rule__ObjetsLieu__Group__0__Impl rule__ObjetsLieu__Group__1 )
            // InternalGame.g:4107:2: rule__ObjetsLieu__Group__0__Impl rule__ObjetsLieu__Group__1
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
    // InternalGame.g:4114:1: rule__ObjetsLieu__Group__0__Impl : ( 'objetsL' ) ;
    public final void rule__ObjetsLieu__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4118:1: ( ( 'objetsL' ) )
            // InternalGame.g:4119:1: ( 'objetsL' )
            {
            // InternalGame.g:4119:1: ( 'objetsL' )
            // InternalGame.g:4120:2: 'objetsL'
            {
             before(grammarAccess.getObjetsLieuAccess().getObjetsLKeyword_0()); 
            match(input,45,FOLLOW_2); 
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
    // InternalGame.g:4129:1: rule__ObjetsLieu__Group__1 : rule__ObjetsLieu__Group__1__Impl rule__ObjetsLieu__Group__2 ;
    public final void rule__ObjetsLieu__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4133:1: ( rule__ObjetsLieu__Group__1__Impl rule__ObjetsLieu__Group__2 )
            // InternalGame.g:4134:2: rule__ObjetsLieu__Group__1__Impl rule__ObjetsLieu__Group__2
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
    // InternalGame.g:4141:1: rule__ObjetsLieu__Group__1__Impl : ( '{' ) ;
    public final void rule__ObjetsLieu__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4145:1: ( ( '{' ) )
            // InternalGame.g:4146:1: ( '{' )
            {
            // InternalGame.g:4146:1: ( '{' )
            // InternalGame.g:4147:2: '{'
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
    // InternalGame.g:4156:1: rule__ObjetsLieu__Group__2 : rule__ObjetsLieu__Group__2__Impl rule__ObjetsLieu__Group__3 ;
    public final void rule__ObjetsLieu__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4160:1: ( rule__ObjetsLieu__Group__2__Impl rule__ObjetsLieu__Group__3 )
            // InternalGame.g:4161:2: rule__ObjetsLieu__Group__2__Impl rule__ObjetsLieu__Group__3
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
    // InternalGame.g:4168:1: rule__ObjetsLieu__Group__2__Impl : ( ( rule__ObjetsLieu__ListeObjetsAssignment_2 )* ) ;
    public final void rule__ObjetsLieu__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4172:1: ( ( ( rule__ObjetsLieu__ListeObjetsAssignment_2 )* ) )
            // InternalGame.g:4173:1: ( ( rule__ObjetsLieu__ListeObjetsAssignment_2 )* )
            {
            // InternalGame.g:4173:1: ( ( rule__ObjetsLieu__ListeObjetsAssignment_2 )* )
            // InternalGame.g:4174:2: ( rule__ObjetsLieu__ListeObjetsAssignment_2 )*
            {
             before(grammarAccess.getObjetsLieuAccess().getListeObjetsAssignment_2()); 
            // InternalGame.g:4175:2: ( rule__ObjetsLieu__ListeObjetsAssignment_2 )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( (LA47_0==RULE_ID) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // InternalGame.g:4175:3: rule__ObjetsLieu__ListeObjetsAssignment_2
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__ObjetsLieu__ListeObjetsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop47;
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
    // InternalGame.g:4183:1: rule__ObjetsLieu__Group__3 : rule__ObjetsLieu__Group__3__Impl ;
    public final void rule__ObjetsLieu__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4187:1: ( rule__ObjetsLieu__Group__3__Impl )
            // InternalGame.g:4188:2: rule__ObjetsLieu__Group__3__Impl
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
    // InternalGame.g:4194:1: rule__ObjetsLieu__Group__3__Impl : ( '}' ) ;
    public final void rule__ObjetsLieu__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4198:1: ( ( '}' ) )
            // InternalGame.g:4199:1: ( '}' )
            {
            // InternalGame.g:4199:1: ( '}' )
            // InternalGame.g:4200:2: '}'
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
    // InternalGame.g:4210:1: rule__Connaissances__Group__0 : rule__Connaissances__Group__0__Impl rule__Connaissances__Group__1 ;
    public final void rule__Connaissances__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4214:1: ( rule__Connaissances__Group__0__Impl rule__Connaissances__Group__1 )
            // InternalGame.g:4215:2: rule__Connaissances__Group__0__Impl rule__Connaissances__Group__1
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
    // InternalGame.g:4222:1: rule__Connaissances__Group__0__Impl : ( 'connaissances' ) ;
    public final void rule__Connaissances__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4226:1: ( ( 'connaissances' ) )
            // InternalGame.g:4227:1: ( 'connaissances' )
            {
            // InternalGame.g:4227:1: ( 'connaissances' )
            // InternalGame.g:4228:2: 'connaissances'
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
    // InternalGame.g:4237:1: rule__Connaissances__Group__1 : rule__Connaissances__Group__1__Impl rule__Connaissances__Group__2 ;
    public final void rule__Connaissances__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4241:1: ( rule__Connaissances__Group__1__Impl rule__Connaissances__Group__2 )
            // InternalGame.g:4242:2: rule__Connaissances__Group__1__Impl rule__Connaissances__Group__2
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
    // InternalGame.g:4249:1: rule__Connaissances__Group__1__Impl : ( '{' ) ;
    public final void rule__Connaissances__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4253:1: ( ( '{' ) )
            // InternalGame.g:4254:1: ( '{' )
            {
            // InternalGame.g:4254:1: ( '{' )
            // InternalGame.g:4255:2: '{'
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
    // InternalGame.g:4264:1: rule__Connaissances__Group__2 : rule__Connaissances__Group__2__Impl rule__Connaissances__Group__3 ;
    public final void rule__Connaissances__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4268:1: ( rule__Connaissances__Group__2__Impl rule__Connaissances__Group__3 )
            // InternalGame.g:4269:2: rule__Connaissances__Group__2__Impl rule__Connaissances__Group__3
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
    // InternalGame.g:4276:1: rule__Connaissances__Group__2__Impl : ( ( rule__Connaissances__ListeConnaissancesAssignment_2 )* ) ;
    public final void rule__Connaissances__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4280:1: ( ( ( rule__Connaissances__ListeConnaissancesAssignment_2 )* ) )
            // InternalGame.g:4281:1: ( ( rule__Connaissances__ListeConnaissancesAssignment_2 )* )
            {
            // InternalGame.g:4281:1: ( ( rule__Connaissances__ListeConnaissancesAssignment_2 )* )
            // InternalGame.g:4282:2: ( rule__Connaissances__ListeConnaissancesAssignment_2 )*
            {
             before(grammarAccess.getConnaissancesAccess().getListeConnaissancesAssignment_2()); 
            // InternalGame.g:4283:2: ( rule__Connaissances__ListeConnaissancesAssignment_2 )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==RULE_ID) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // InternalGame.g:4283:3: rule__Connaissances__ListeConnaissancesAssignment_2
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Connaissances__ListeConnaissancesAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop48;
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
    // InternalGame.g:4291:1: rule__Connaissances__Group__3 : rule__Connaissances__Group__3__Impl ;
    public final void rule__Connaissances__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4295:1: ( rule__Connaissances__Group__3__Impl )
            // InternalGame.g:4296:2: rule__Connaissances__Group__3__Impl
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
    // InternalGame.g:4302:1: rule__Connaissances__Group__3__Impl : ( '}' ) ;
    public final void rule__Connaissances__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4306:1: ( ( '}' ) )
            // InternalGame.g:4307:1: ( '}' )
            {
            // InternalGame.g:4307:1: ( '}' )
            // InternalGame.g:4308:2: '}'
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
    // InternalGame.g:4318:1: rule__Connaissance__Group__0 : rule__Connaissance__Group__0__Impl rule__Connaissance__Group__1 ;
    public final void rule__Connaissance__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4322:1: ( rule__Connaissance__Group__0__Impl rule__Connaissance__Group__1 )
            // InternalGame.g:4323:2: rule__Connaissance__Group__0__Impl rule__Connaissance__Group__1
            {
            pushFollow(FOLLOW_28);
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
    // InternalGame.g:4330:1: rule__Connaissance__Group__0__Impl : ( ( rule__Connaissance__NameAssignment_0 ) ) ;
    public final void rule__Connaissance__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4334:1: ( ( ( rule__Connaissance__NameAssignment_0 ) ) )
            // InternalGame.g:4335:1: ( ( rule__Connaissance__NameAssignment_0 ) )
            {
            // InternalGame.g:4335:1: ( ( rule__Connaissance__NameAssignment_0 ) )
            // InternalGame.g:4336:2: ( rule__Connaissance__NameAssignment_0 )
            {
             before(grammarAccess.getConnaissanceAccess().getNameAssignment_0()); 
            // InternalGame.g:4337:2: ( rule__Connaissance__NameAssignment_0 )
            // InternalGame.g:4337:3: rule__Connaissance__NameAssignment_0
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
    // InternalGame.g:4345:1: rule__Connaissance__Group__1 : rule__Connaissance__Group__1__Impl ;
    public final void rule__Connaissance__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4349:1: ( rule__Connaissance__Group__1__Impl )
            // InternalGame.g:4350:2: rule__Connaissance__Group__1__Impl
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
    // InternalGame.g:4356:1: rule__Connaissance__Group__1__Impl : ( ( rule__Connaissance__Group_1__0 )? ) ;
    public final void rule__Connaissance__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4360:1: ( ( ( rule__Connaissance__Group_1__0 )? ) )
            // InternalGame.g:4361:1: ( ( rule__Connaissance__Group_1__0 )? )
            {
            // InternalGame.g:4361:1: ( ( rule__Connaissance__Group_1__0 )? )
            // InternalGame.g:4362:2: ( rule__Connaissance__Group_1__0 )?
            {
             before(grammarAccess.getConnaissanceAccess().getGroup_1()); 
            // InternalGame.g:4363:2: ( rule__Connaissance__Group_1__0 )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==23) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalGame.g:4363:3: rule__Connaissance__Group_1__0
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
    // InternalGame.g:4372:1: rule__Connaissance__Group_1__0 : rule__Connaissance__Group_1__0__Impl rule__Connaissance__Group_1__1 ;
    public final void rule__Connaissance__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4376:1: ( rule__Connaissance__Group_1__0__Impl rule__Connaissance__Group_1__1 )
            // InternalGame.g:4377:2: rule__Connaissance__Group_1__0__Impl rule__Connaissance__Group_1__1
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
    // InternalGame.g:4384:1: rule__Connaissance__Group_1__0__Impl : ( 'description' ) ;
    public final void rule__Connaissance__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4388:1: ( ( 'description' ) )
            // InternalGame.g:4389:1: ( 'description' )
            {
            // InternalGame.g:4389:1: ( 'description' )
            // InternalGame.g:4390:2: 'description'
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
    // InternalGame.g:4399:1: rule__Connaissance__Group_1__1 : rule__Connaissance__Group_1__1__Impl rule__Connaissance__Group_1__2 ;
    public final void rule__Connaissance__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4403:1: ( rule__Connaissance__Group_1__1__Impl rule__Connaissance__Group_1__2 )
            // InternalGame.g:4404:2: rule__Connaissance__Group_1__1__Impl rule__Connaissance__Group_1__2
            {
            pushFollow(FOLLOW_3);
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
    // InternalGame.g:4411:1: rule__Connaissance__Group_1__1__Impl : ( ( rule__Connaissance__DescriptionAssignment_1_1 ) ) ;
    public final void rule__Connaissance__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4415:1: ( ( ( rule__Connaissance__DescriptionAssignment_1_1 ) ) )
            // InternalGame.g:4416:1: ( ( rule__Connaissance__DescriptionAssignment_1_1 ) )
            {
            // InternalGame.g:4416:1: ( ( rule__Connaissance__DescriptionAssignment_1_1 ) )
            // InternalGame.g:4417:2: ( rule__Connaissance__DescriptionAssignment_1_1 )
            {
             before(grammarAccess.getConnaissanceAccess().getDescriptionAssignment_1_1()); 
            // InternalGame.g:4418:2: ( rule__Connaissance__DescriptionAssignment_1_1 )
            // InternalGame.g:4418:3: rule__Connaissance__DescriptionAssignment_1_1
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
    // InternalGame.g:4426:1: rule__Connaissance__Group_1__2 : rule__Connaissance__Group_1__2__Impl ;
    public final void rule__Connaissance__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4430:1: ( rule__Connaissance__Group_1__2__Impl )
            // InternalGame.g:4431:2: rule__Connaissance__Group_1__2__Impl
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
    // InternalGame.g:4437:1: rule__Connaissance__Group_1__2__Impl : ( ( rule__Connaissance__ConditionConnaissanceAssignment_1_2 )? ) ;
    public final void rule__Connaissance__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4441:1: ( ( ( rule__Connaissance__ConditionConnaissanceAssignment_1_2 )? ) )
            // InternalGame.g:4442:1: ( ( rule__Connaissance__ConditionConnaissanceAssignment_1_2 )? )
            {
            // InternalGame.g:4442:1: ( ( rule__Connaissance__ConditionConnaissanceAssignment_1_2 )? )
            // InternalGame.g:4443:2: ( rule__Connaissance__ConditionConnaissanceAssignment_1_2 )?
            {
             before(grammarAccess.getConnaissanceAccess().getConditionConnaissanceAssignment_1_2()); 
            // InternalGame.g:4444:2: ( rule__Connaissance__ConditionConnaissanceAssignment_1_2 )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==RULE_ID) ) {
                int LA50_1 = input.LA(2);

                if ( (LA50_1==RULE_STRING) ) {
                    alt50=1;
                }
            }
            switch (alt50) {
                case 1 :
                    // InternalGame.g:4444:3: rule__Connaissance__ConditionConnaissanceAssignment_1_2
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


    // $ANTLR start "rule__Conditions__Group__0"
    // InternalGame.g:4453:1: rule__Conditions__Group__0 : rule__Conditions__Group__0__Impl rule__Conditions__Group__1 ;
    public final void rule__Conditions__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4457:1: ( rule__Conditions__Group__0__Impl rule__Conditions__Group__1 )
            // InternalGame.g:4458:2: rule__Conditions__Group__0__Impl rule__Conditions__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Conditions__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Conditions__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditions__Group__0"


    // $ANTLR start "rule__Conditions__Group__0__Impl"
    // InternalGame.g:4465:1: rule__Conditions__Group__0__Impl : ( 'conditions' ) ;
    public final void rule__Conditions__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4469:1: ( ( 'conditions' ) )
            // InternalGame.g:4470:1: ( 'conditions' )
            {
            // InternalGame.g:4470:1: ( 'conditions' )
            // InternalGame.g:4471:2: 'conditions'
            {
             before(grammarAccess.getConditionsAccess().getConditionsKeyword_0()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getConditionsAccess().getConditionsKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditions__Group__0__Impl"


    // $ANTLR start "rule__Conditions__Group__1"
    // InternalGame.g:4480:1: rule__Conditions__Group__1 : rule__Conditions__Group__1__Impl rule__Conditions__Group__2 ;
    public final void rule__Conditions__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4484:1: ( rule__Conditions__Group__1__Impl rule__Conditions__Group__2 )
            // InternalGame.g:4485:2: rule__Conditions__Group__1__Impl rule__Conditions__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__Conditions__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Conditions__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditions__Group__1"


    // $ANTLR start "rule__Conditions__Group__1__Impl"
    // InternalGame.g:4492:1: rule__Conditions__Group__1__Impl : ( '{' ) ;
    public final void rule__Conditions__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4496:1: ( ( '{' ) )
            // InternalGame.g:4497:1: ( '{' )
            {
            // InternalGame.g:4497:1: ( '{' )
            // InternalGame.g:4498:2: '{'
            {
             before(grammarAccess.getConditionsAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getConditionsAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditions__Group__1__Impl"


    // $ANTLR start "rule__Conditions__Group__2"
    // InternalGame.g:4507:1: rule__Conditions__Group__2 : rule__Conditions__Group__2__Impl rule__Conditions__Group__3 ;
    public final void rule__Conditions__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4511:1: ( rule__Conditions__Group__2__Impl rule__Conditions__Group__3 )
            // InternalGame.g:4512:2: rule__Conditions__Group__2__Impl rule__Conditions__Group__3
            {
            pushFollow(FOLLOW_13);
            rule__Conditions__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Conditions__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditions__Group__2"


    // $ANTLR start "rule__Conditions__Group__2__Impl"
    // InternalGame.g:4519:1: rule__Conditions__Group__2__Impl : ( ( rule__Conditions__ListeConditionsAssignment_2 )* ) ;
    public final void rule__Conditions__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4523:1: ( ( ( rule__Conditions__ListeConditionsAssignment_2 )* ) )
            // InternalGame.g:4524:1: ( ( rule__Conditions__ListeConditionsAssignment_2 )* )
            {
            // InternalGame.g:4524:1: ( ( rule__Conditions__ListeConditionsAssignment_2 )* )
            // InternalGame.g:4525:2: ( rule__Conditions__ListeConditionsAssignment_2 )*
            {
             before(grammarAccess.getConditionsAccess().getListeConditionsAssignment_2()); 
            // InternalGame.g:4526:2: ( rule__Conditions__ListeConditionsAssignment_2 )*
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( (LA51_0==RULE_ID) ) {
                    alt51=1;
                }


                switch (alt51) {
            	case 1 :
            	    // InternalGame.g:4526:3: rule__Conditions__ListeConditionsAssignment_2
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Conditions__ListeConditionsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop51;
                }
            } while (true);

             after(grammarAccess.getConditionsAccess().getListeConditionsAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditions__Group__2__Impl"


    // $ANTLR start "rule__Conditions__Group__3"
    // InternalGame.g:4534:1: rule__Conditions__Group__3 : rule__Conditions__Group__3__Impl ;
    public final void rule__Conditions__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4538:1: ( rule__Conditions__Group__3__Impl )
            // InternalGame.g:4539:2: rule__Conditions__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Conditions__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditions__Group__3"


    // $ANTLR start "rule__Conditions__Group__3__Impl"
    // InternalGame.g:4545:1: rule__Conditions__Group__3__Impl : ( '}' ) ;
    public final void rule__Conditions__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4549:1: ( ( '}' ) )
            // InternalGame.g:4550:1: ( '}' )
            {
            // InternalGame.g:4550:1: ( '}' )
            // InternalGame.g:4551:2: '}'
            {
             before(grammarAccess.getConditionsAccess().getRightCurlyBracketKeyword_3()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getConditionsAccess().getRightCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditions__Group__3__Impl"


    // $ANTLR start "rule__Condition__Group__0"
    // InternalGame.g:4561:1: rule__Condition__Group__0 : rule__Condition__Group__0__Impl rule__Condition__Group__1 ;
    public final void rule__Condition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4565:1: ( rule__Condition__Group__0__Impl rule__Condition__Group__1 )
            // InternalGame.g:4566:2: rule__Condition__Group__0__Impl rule__Condition__Group__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalGame.g:4573:1: rule__Condition__Group__0__Impl : ( ( rule__Condition__NameAssignment_0 ) ) ;
    public final void rule__Condition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4577:1: ( ( ( rule__Condition__NameAssignment_0 ) ) )
            // InternalGame.g:4578:1: ( ( rule__Condition__NameAssignment_0 ) )
            {
            // InternalGame.g:4578:1: ( ( rule__Condition__NameAssignment_0 ) )
            // InternalGame.g:4579:2: ( rule__Condition__NameAssignment_0 )
            {
             before(grammarAccess.getConditionAccess().getNameAssignment_0()); 
            // InternalGame.g:4580:2: ( rule__Condition__NameAssignment_0 )
            // InternalGame.g:4580:3: rule__Condition__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Condition__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getConditionAccess().getNameAssignment_0()); 

            }


            }

        }
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
    // InternalGame.g:4588:1: rule__Condition__Group__1 : rule__Condition__Group__1__Impl ;
    public final void rule__Condition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4592:1: ( rule__Condition__Group__1__Impl )
            // InternalGame.g:4593:2: rule__Condition__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Condition__Group__1__Impl();

            state._fsp--;


            }

        }
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
    // InternalGame.g:4599:1: rule__Condition__Group__1__Impl : ( ( rule__Condition__ConditionAssignment_1 ) ) ;
    public final void rule__Condition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4603:1: ( ( ( rule__Condition__ConditionAssignment_1 ) ) )
            // InternalGame.g:4604:1: ( ( rule__Condition__ConditionAssignment_1 ) )
            {
            // InternalGame.g:4604:1: ( ( rule__Condition__ConditionAssignment_1 ) )
            // InternalGame.g:4605:2: ( rule__Condition__ConditionAssignment_1 )
            {
             before(grammarAccess.getConditionAccess().getConditionAssignment_1()); 
            // InternalGame.g:4606:2: ( rule__Condition__ConditionAssignment_1 )
            // InternalGame.g:4606:3: rule__Condition__ConditionAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Condition__ConditionAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getConditionAccess().getConditionAssignment_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__Chemins__Group__0"
    // InternalGame.g:4615:1: rule__Chemins__Group__0 : rule__Chemins__Group__0__Impl rule__Chemins__Group__1 ;
    public final void rule__Chemins__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4619:1: ( rule__Chemins__Group__0__Impl rule__Chemins__Group__1 )
            // InternalGame.g:4620:2: rule__Chemins__Group__0__Impl rule__Chemins__Group__1
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
    // InternalGame.g:4627:1: rule__Chemins__Group__0__Impl : ( 'chemins' ) ;
    public final void rule__Chemins__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4631:1: ( ( 'chemins' ) )
            // InternalGame.g:4632:1: ( 'chemins' )
            {
            // InternalGame.g:4632:1: ( 'chemins' )
            // InternalGame.g:4633:2: 'chemins'
            {
             before(grammarAccess.getCheminsAccess().getCheminsKeyword_0()); 
            match(input,47,FOLLOW_2); 
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
    // InternalGame.g:4642:1: rule__Chemins__Group__1 : rule__Chemins__Group__1__Impl rule__Chemins__Group__2 ;
    public final void rule__Chemins__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4646:1: ( rule__Chemins__Group__1__Impl rule__Chemins__Group__2 )
            // InternalGame.g:4647:2: rule__Chemins__Group__1__Impl rule__Chemins__Group__2
            {
            pushFollow(FOLLOW_13);
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
    // InternalGame.g:4654:1: rule__Chemins__Group__1__Impl : ( '{' ) ;
    public final void rule__Chemins__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4658:1: ( ( '{' ) )
            // InternalGame.g:4659:1: ( '{' )
            {
            // InternalGame.g:4659:1: ( '{' )
            // InternalGame.g:4660:2: '{'
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
    // InternalGame.g:4669:1: rule__Chemins__Group__2 : rule__Chemins__Group__2__Impl rule__Chemins__Group__3 ;
    public final void rule__Chemins__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4673:1: ( rule__Chemins__Group__2__Impl rule__Chemins__Group__3 )
            // InternalGame.g:4674:2: rule__Chemins__Group__2__Impl rule__Chemins__Group__3
            {
            pushFollow(FOLLOW_13);
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
    // InternalGame.g:4681:1: rule__Chemins__Group__2__Impl : ( ( rule__Chemins__ListeCheminsAssignment_2 )* ) ;
    public final void rule__Chemins__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4685:1: ( ( ( rule__Chemins__ListeCheminsAssignment_2 )* ) )
            // InternalGame.g:4686:1: ( ( rule__Chemins__ListeCheminsAssignment_2 )* )
            {
            // InternalGame.g:4686:1: ( ( rule__Chemins__ListeCheminsAssignment_2 )* )
            // InternalGame.g:4687:2: ( rule__Chemins__ListeCheminsAssignment_2 )*
            {
             before(grammarAccess.getCheminsAccess().getListeCheminsAssignment_2()); 
            // InternalGame.g:4688:2: ( rule__Chemins__ListeCheminsAssignment_2 )*
            loop52:
            do {
                int alt52=2;
                int LA52_0 = input.LA(1);

                if ( (LA52_0==RULE_ID) ) {
                    alt52=1;
                }


                switch (alt52) {
            	case 1 :
            	    // InternalGame.g:4688:3: rule__Chemins__ListeCheminsAssignment_2
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Chemins__ListeCheminsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop52;
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
    // InternalGame.g:4696:1: rule__Chemins__Group__3 : rule__Chemins__Group__3__Impl ;
    public final void rule__Chemins__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4700:1: ( rule__Chemins__Group__3__Impl )
            // InternalGame.g:4701:2: rule__Chemins__Group__3__Impl
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
    // InternalGame.g:4707:1: rule__Chemins__Group__3__Impl : ( '}' ) ;
    public final void rule__Chemins__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4711:1: ( ( '}' ) )
            // InternalGame.g:4712:1: ( '}' )
            {
            // InternalGame.g:4712:1: ( '}' )
            // InternalGame.g:4713:2: '}'
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
    // InternalGame.g:4723:1: rule__Chemin__Group__0 : rule__Chemin__Group__0__Impl rule__Chemin__Group__1 ;
    public final void rule__Chemin__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4727:1: ( rule__Chemin__Group__0__Impl rule__Chemin__Group__1 )
            // InternalGame.g:4728:2: rule__Chemin__Group__0__Impl rule__Chemin__Group__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalGame.g:4735:1: rule__Chemin__Group__0__Impl : ( ( rule__Chemin__NameAssignment_0 ) ) ;
    public final void rule__Chemin__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4739:1: ( ( ( rule__Chemin__NameAssignment_0 ) ) )
            // InternalGame.g:4740:1: ( ( rule__Chemin__NameAssignment_0 ) )
            {
            // InternalGame.g:4740:1: ( ( rule__Chemin__NameAssignment_0 ) )
            // InternalGame.g:4741:2: ( rule__Chemin__NameAssignment_0 )
            {
             before(grammarAccess.getCheminAccess().getNameAssignment_0()); 
            // InternalGame.g:4742:2: ( rule__Chemin__NameAssignment_0 )
            // InternalGame.g:4742:3: rule__Chemin__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Chemin__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getCheminAccess().getNameAssignment_0()); 

            }


            }

        }
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
    // InternalGame.g:4750:1: rule__Chemin__Group__1 : rule__Chemin__Group__1__Impl rule__Chemin__Group__2 ;
    public final void rule__Chemin__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4754:1: ( rule__Chemin__Group__1__Impl rule__Chemin__Group__2 )
            // InternalGame.g:4755:2: rule__Chemin__Group__1__Impl rule__Chemin__Group__2
            {
            pushFollow(FOLLOW_28);
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
    // InternalGame.g:4762:1: rule__Chemin__Group__1__Impl : ( '{' ) ;
    public final void rule__Chemin__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4766:1: ( ( '{' ) )
            // InternalGame.g:4767:1: ( '{' )
            {
            // InternalGame.g:4767:1: ( '{' )
            // InternalGame.g:4768:2: '{'
            {
             before(grammarAccess.getCheminAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getCheminAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
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
    // InternalGame.g:4777:1: rule__Chemin__Group__2 : rule__Chemin__Group__2__Impl rule__Chemin__Group__3 ;
    public final void rule__Chemin__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4781:1: ( rule__Chemin__Group__2__Impl rule__Chemin__Group__3 )
            // InternalGame.g:4782:2: rule__Chemin__Group__2__Impl rule__Chemin__Group__3
            {
            pushFollow(FOLLOW_15);
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
    // InternalGame.g:4789:1: rule__Chemin__Group__2__Impl : ( 'description' ) ;
    public final void rule__Chemin__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4793:1: ( ( 'description' ) )
            // InternalGame.g:4794:1: ( 'description' )
            {
            // InternalGame.g:4794:1: ( 'description' )
            // InternalGame.g:4795:2: 'description'
            {
             before(grammarAccess.getCheminAccess().getDescriptionKeyword_2()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getCheminAccess().getDescriptionKeyword_2()); 

            }


            }

        }
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
    // InternalGame.g:4804:1: rule__Chemin__Group__3 : rule__Chemin__Group__3__Impl rule__Chemin__Group__4 ;
    public final void rule__Chemin__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4808:1: ( rule__Chemin__Group__3__Impl rule__Chemin__Group__4 )
            // InternalGame.g:4809:2: rule__Chemin__Group__3__Impl rule__Chemin__Group__4
            {
            pushFollow(FOLLOW_29);
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
    // InternalGame.g:4816:1: rule__Chemin__Group__3__Impl : ( ( rule__Chemin__DescriptionAssignment_3 ) ) ;
    public final void rule__Chemin__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4820:1: ( ( ( rule__Chemin__DescriptionAssignment_3 ) ) )
            // InternalGame.g:4821:1: ( ( rule__Chemin__DescriptionAssignment_3 ) )
            {
            // InternalGame.g:4821:1: ( ( rule__Chemin__DescriptionAssignment_3 ) )
            // InternalGame.g:4822:2: ( rule__Chemin__DescriptionAssignment_3 )
            {
             before(grammarAccess.getCheminAccess().getDescriptionAssignment_3()); 
            // InternalGame.g:4823:2: ( rule__Chemin__DescriptionAssignment_3 )
            // InternalGame.g:4823:3: rule__Chemin__DescriptionAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Chemin__DescriptionAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getCheminAccess().getDescriptionAssignment_3()); 

            }


            }

        }
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
    // InternalGame.g:4831:1: rule__Chemin__Group__4 : rule__Chemin__Group__4__Impl rule__Chemin__Group__5 ;
    public final void rule__Chemin__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4835:1: ( rule__Chemin__Group__4__Impl rule__Chemin__Group__5 )
            // InternalGame.g:4836:2: rule__Chemin__Group__4__Impl rule__Chemin__Group__5
            {
            pushFollow(FOLLOW_29);
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
    // InternalGame.g:4843:1: rule__Chemin__Group__4__Impl : ( ( rule__Chemin__ConditionDescriptionAssignment_4 )? ) ;
    public final void rule__Chemin__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4847:1: ( ( ( rule__Chemin__ConditionDescriptionAssignment_4 )? ) )
            // InternalGame.g:4848:1: ( ( rule__Chemin__ConditionDescriptionAssignment_4 )? )
            {
            // InternalGame.g:4848:1: ( ( rule__Chemin__ConditionDescriptionAssignment_4 )? )
            // InternalGame.g:4849:2: ( rule__Chemin__ConditionDescriptionAssignment_4 )?
            {
             before(grammarAccess.getCheminAccess().getConditionDescriptionAssignment_4()); 
            // InternalGame.g:4850:2: ( rule__Chemin__ConditionDescriptionAssignment_4 )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==RULE_ID) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // InternalGame.g:4850:3: rule__Chemin__ConditionDescriptionAssignment_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__Chemin__ConditionDescriptionAssignment_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCheminAccess().getConditionDescriptionAssignment_4()); 

            }


            }

        }
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
    // InternalGame.g:4858:1: rule__Chemin__Group__5 : rule__Chemin__Group__5__Impl rule__Chemin__Group__6 ;
    public final void rule__Chemin__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4862:1: ( rule__Chemin__Group__5__Impl rule__Chemin__Group__6 )
            // InternalGame.g:4863:2: rule__Chemin__Group__5__Impl rule__Chemin__Group__6
            {
            pushFollow(FOLLOW_3);
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
    // InternalGame.g:4870:1: rule__Chemin__Group__5__Impl : ( 'source' ) ;
    public final void rule__Chemin__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4874:1: ( ( 'source' ) )
            // InternalGame.g:4875:1: ( 'source' )
            {
            // InternalGame.g:4875:1: ( 'source' )
            // InternalGame.g:4876:2: 'source'
            {
             before(grammarAccess.getCheminAccess().getSourceKeyword_5()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getCheminAccess().getSourceKeyword_5()); 

            }


            }

        }
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
    // InternalGame.g:4885:1: rule__Chemin__Group__6 : rule__Chemin__Group__6__Impl rule__Chemin__Group__7 ;
    public final void rule__Chemin__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4889:1: ( rule__Chemin__Group__6__Impl rule__Chemin__Group__7 )
            // InternalGame.g:4890:2: rule__Chemin__Group__6__Impl rule__Chemin__Group__7
            {
            pushFollow(FOLLOW_30);
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
    // InternalGame.g:4897:1: rule__Chemin__Group__6__Impl : ( ( rule__Chemin__SourceAssignment_6 ) ) ;
    public final void rule__Chemin__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4901:1: ( ( ( rule__Chemin__SourceAssignment_6 ) ) )
            // InternalGame.g:4902:1: ( ( rule__Chemin__SourceAssignment_6 ) )
            {
            // InternalGame.g:4902:1: ( ( rule__Chemin__SourceAssignment_6 ) )
            // InternalGame.g:4903:2: ( rule__Chemin__SourceAssignment_6 )
            {
             before(grammarAccess.getCheminAccess().getSourceAssignment_6()); 
            // InternalGame.g:4904:2: ( rule__Chemin__SourceAssignment_6 )
            // InternalGame.g:4904:3: rule__Chemin__SourceAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Chemin__SourceAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getCheminAccess().getSourceAssignment_6()); 

            }


            }

        }
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
    // InternalGame.g:4912:1: rule__Chemin__Group__7 : rule__Chemin__Group__7__Impl rule__Chemin__Group__8 ;
    public final void rule__Chemin__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4916:1: ( rule__Chemin__Group__7__Impl rule__Chemin__Group__8 )
            // InternalGame.g:4917:2: rule__Chemin__Group__7__Impl rule__Chemin__Group__8
            {
            pushFollow(FOLLOW_3);
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
    // InternalGame.g:4924:1: rule__Chemin__Group__7__Impl : ( 'destination' ) ;
    public final void rule__Chemin__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4928:1: ( ( 'destination' ) )
            // InternalGame.g:4929:1: ( 'destination' )
            {
            // InternalGame.g:4929:1: ( 'destination' )
            // InternalGame.g:4930:2: 'destination'
            {
             before(grammarAccess.getCheminAccess().getDestinationKeyword_7()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getCheminAccess().getDestinationKeyword_7()); 

            }


            }

        }
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
    // InternalGame.g:4939:1: rule__Chemin__Group__8 : rule__Chemin__Group__8__Impl rule__Chemin__Group__9 ;
    public final void rule__Chemin__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4943:1: ( rule__Chemin__Group__8__Impl rule__Chemin__Group__9 )
            // InternalGame.g:4944:2: rule__Chemin__Group__8__Impl rule__Chemin__Group__9
            {
            pushFollow(FOLLOW_31);
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
    // InternalGame.g:4951:1: rule__Chemin__Group__8__Impl : ( ( rule__Chemin__DestinationAssignment_8 ) ) ;
    public final void rule__Chemin__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4955:1: ( ( ( rule__Chemin__DestinationAssignment_8 ) ) )
            // InternalGame.g:4956:1: ( ( rule__Chemin__DestinationAssignment_8 ) )
            {
            // InternalGame.g:4956:1: ( ( rule__Chemin__DestinationAssignment_8 ) )
            // InternalGame.g:4957:2: ( rule__Chemin__DestinationAssignment_8 )
            {
             before(grammarAccess.getCheminAccess().getDestinationAssignment_8()); 
            // InternalGame.g:4958:2: ( rule__Chemin__DestinationAssignment_8 )
            // InternalGame.g:4958:3: rule__Chemin__DestinationAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__Chemin__DestinationAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getCheminAccess().getDestinationAssignment_8()); 

            }


            }

        }
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
    // InternalGame.g:4966:1: rule__Chemin__Group__9 : rule__Chemin__Group__9__Impl rule__Chemin__Group__10 ;
    public final void rule__Chemin__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4970:1: ( rule__Chemin__Group__9__Impl rule__Chemin__Group__10 )
            // InternalGame.g:4971:2: rule__Chemin__Group__9__Impl rule__Chemin__Group__10
            {
            pushFollow(FOLLOW_31);
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
    // InternalGame.g:4978:1: rule__Chemin__Group__9__Impl : ( ( rule__Chemin__Group_9__0 )? ) ;
    public final void rule__Chemin__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4982:1: ( ( ( rule__Chemin__Group_9__0 )? ) )
            // InternalGame.g:4983:1: ( ( rule__Chemin__Group_9__0 )? )
            {
            // InternalGame.g:4983:1: ( ( rule__Chemin__Group_9__0 )? )
            // InternalGame.g:4984:2: ( rule__Chemin__Group_9__0 )?
            {
             before(grammarAccess.getCheminAccess().getGroup_9()); 
            // InternalGame.g:4985:2: ( rule__Chemin__Group_9__0 )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==27) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // InternalGame.g:4985:3: rule__Chemin__Group_9__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Chemin__Group_9__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCheminAccess().getGroup_9()); 

            }


            }

        }
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
    // InternalGame.g:4993:1: rule__Chemin__Group__10 : rule__Chemin__Group__10__Impl rule__Chemin__Group__11 ;
    public final void rule__Chemin__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4997:1: ( rule__Chemin__Group__10__Impl rule__Chemin__Group__11 )
            // InternalGame.g:4998:2: rule__Chemin__Group__10__Impl rule__Chemin__Group__11
            {
            pushFollow(FOLLOW_31);
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
    // InternalGame.g:5005:1: rule__Chemin__Group__10__Impl : ( ( rule__Chemin__Group_10__0 )? ) ;
    public final void rule__Chemin__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5009:1: ( ( ( rule__Chemin__Group_10__0 )? ) )
            // InternalGame.g:5010:1: ( ( rule__Chemin__Group_10__0 )? )
            {
            // InternalGame.g:5010:1: ( ( rule__Chemin__Group_10__0 )? )
            // InternalGame.g:5011:2: ( rule__Chemin__Group_10__0 )?
            {
             before(grammarAccess.getCheminAccess().getGroup_10()); 
            // InternalGame.g:5012:2: ( rule__Chemin__Group_10__0 )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==26) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // InternalGame.g:5012:3: rule__Chemin__Group_10__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Chemin__Group_10__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCheminAccess().getGroup_10()); 

            }


            }

        }
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
    // InternalGame.g:5020:1: rule__Chemin__Group__11 : rule__Chemin__Group__11__Impl rule__Chemin__Group__12 ;
    public final void rule__Chemin__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5024:1: ( rule__Chemin__Group__11__Impl rule__Chemin__Group__12 )
            // InternalGame.g:5025:2: rule__Chemin__Group__11__Impl rule__Chemin__Group__12
            {
            pushFollow(FOLLOW_31);
            rule__Chemin__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Chemin__Group__12();

            state._fsp--;


            }

        }
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
    // InternalGame.g:5032:1: rule__Chemin__Group__11__Impl : ( ( rule__Chemin__Group_11__0 )? ) ;
    public final void rule__Chemin__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5036:1: ( ( ( rule__Chemin__Group_11__0 )? ) )
            // InternalGame.g:5037:1: ( ( rule__Chemin__Group_11__0 )? )
            {
            // InternalGame.g:5037:1: ( ( rule__Chemin__Group_11__0 )? )
            // InternalGame.g:5038:2: ( rule__Chemin__Group_11__0 )?
            {
             before(grammarAccess.getCheminAccess().getGroup_11()); 
            // InternalGame.g:5039:2: ( rule__Chemin__Group_11__0 )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==50) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // InternalGame.g:5039:3: rule__Chemin__Group_11__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Chemin__Group_11__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCheminAccess().getGroup_11()); 

            }


            }

        }
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


    // $ANTLR start "rule__Chemin__Group__12"
    // InternalGame.g:5047:1: rule__Chemin__Group__12 : rule__Chemin__Group__12__Impl rule__Chemin__Group__13 ;
    public final void rule__Chemin__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5051:1: ( rule__Chemin__Group__12__Impl rule__Chemin__Group__13 )
            // InternalGame.g:5052:2: rule__Chemin__Group__12__Impl rule__Chemin__Group__13
            {
            pushFollow(FOLLOW_31);
            rule__Chemin__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Chemin__Group__13();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chemin__Group__12"


    // $ANTLR start "rule__Chemin__Group__12__Impl"
    // InternalGame.g:5059:1: rule__Chemin__Group__12__Impl : ( ( rule__Chemin__ListeConnaissancesAssignment_12 )* ) ;
    public final void rule__Chemin__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5063:1: ( ( ( rule__Chemin__ListeConnaissancesAssignment_12 )* ) )
            // InternalGame.g:5064:1: ( ( rule__Chemin__ListeConnaissancesAssignment_12 )* )
            {
            // InternalGame.g:5064:1: ( ( rule__Chemin__ListeConnaissancesAssignment_12 )* )
            // InternalGame.g:5065:2: ( rule__Chemin__ListeConnaissancesAssignment_12 )*
            {
             before(grammarAccess.getCheminAccess().getListeConnaissancesAssignment_12()); 
            // InternalGame.g:5066:2: ( rule__Chemin__ListeConnaissancesAssignment_12 )*
            loop57:
            do {
                int alt57=2;
                int LA57_0 = input.LA(1);

                if ( (LA57_0==RULE_ID) ) {
                    alt57=1;
                }


                switch (alt57) {
            	case 1 :
            	    // InternalGame.g:5066:3: rule__Chemin__ListeConnaissancesAssignment_12
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Chemin__ListeConnaissancesAssignment_12();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop57;
                }
            } while (true);

             after(grammarAccess.getCheminAccess().getListeConnaissancesAssignment_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chemin__Group__12__Impl"


    // $ANTLR start "rule__Chemin__Group__13"
    // InternalGame.g:5074:1: rule__Chemin__Group__13 : rule__Chemin__Group__13__Impl rule__Chemin__Group__14 ;
    public final void rule__Chemin__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5078:1: ( rule__Chemin__Group__13__Impl rule__Chemin__Group__14 )
            // InternalGame.g:5079:2: rule__Chemin__Group__13__Impl rule__Chemin__Group__14
            {
            pushFollow(FOLLOW_31);
            rule__Chemin__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Chemin__Group__14();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chemin__Group__13"


    // $ANTLR start "rule__Chemin__Group__13__Impl"
    // InternalGame.g:5086:1: rule__Chemin__Group__13__Impl : ( ( rule__Chemin__ListeObjetsAssignment_13 )* ) ;
    public final void rule__Chemin__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5090:1: ( ( ( rule__Chemin__ListeObjetsAssignment_13 )* ) )
            // InternalGame.g:5091:1: ( ( rule__Chemin__ListeObjetsAssignment_13 )* )
            {
            // InternalGame.g:5091:1: ( ( rule__Chemin__ListeObjetsAssignment_13 )* )
            // InternalGame.g:5092:2: ( rule__Chemin__ListeObjetsAssignment_13 )*
            {
             before(grammarAccess.getCheminAccess().getListeObjetsAssignment_13()); 
            // InternalGame.g:5093:2: ( rule__Chemin__ListeObjetsAssignment_13 )*
            loop58:
            do {
                int alt58=2;
                int LA58_0 = input.LA(1);

                if ( (LA58_0==RULE_ID) ) {
                    alt58=1;
                }


                switch (alt58) {
            	case 1 :
            	    // InternalGame.g:5093:3: rule__Chemin__ListeObjetsAssignment_13
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Chemin__ListeObjetsAssignment_13();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop58;
                }
            } while (true);

             after(grammarAccess.getCheminAccess().getListeObjetsAssignment_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chemin__Group__13__Impl"


    // $ANTLR start "rule__Chemin__Group__14"
    // InternalGame.g:5101:1: rule__Chemin__Group__14 : rule__Chemin__Group__14__Impl rule__Chemin__Group__15 ;
    public final void rule__Chemin__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5105:1: ( rule__Chemin__Group__14__Impl rule__Chemin__Group__15 )
            // InternalGame.g:5106:2: rule__Chemin__Group__14__Impl rule__Chemin__Group__15
            {
            pushFollow(FOLLOW_31);
            rule__Chemin__Group__14__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Chemin__Group__15();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chemin__Group__14"


    // $ANTLR start "rule__Chemin__Group__14__Impl"
    // InternalGame.g:5113:1: rule__Chemin__Group__14__Impl : ( ( rule__Chemin__ListeObjetsConsommesAssignment_14 )* ) ;
    public final void rule__Chemin__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5117:1: ( ( ( rule__Chemin__ListeObjetsConsommesAssignment_14 )* ) )
            // InternalGame.g:5118:1: ( ( rule__Chemin__ListeObjetsConsommesAssignment_14 )* )
            {
            // InternalGame.g:5118:1: ( ( rule__Chemin__ListeObjetsConsommesAssignment_14 )* )
            // InternalGame.g:5119:2: ( rule__Chemin__ListeObjetsConsommesAssignment_14 )*
            {
             before(grammarAccess.getCheminAccess().getListeObjetsConsommesAssignment_14()); 
            // InternalGame.g:5120:2: ( rule__Chemin__ListeObjetsConsommesAssignment_14 )*
            loop59:
            do {
                int alt59=2;
                int LA59_0 = input.LA(1);

                if ( (LA59_0==RULE_ID) ) {
                    alt59=1;
                }


                switch (alt59) {
            	case 1 :
            	    // InternalGame.g:5120:3: rule__Chemin__ListeObjetsConsommesAssignment_14
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Chemin__ListeObjetsConsommesAssignment_14();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop59;
                }
            } while (true);

             after(grammarAccess.getCheminAccess().getListeObjetsConsommesAssignment_14()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chemin__Group__14__Impl"


    // $ANTLR start "rule__Chemin__Group__15"
    // InternalGame.g:5128:1: rule__Chemin__Group__15 : rule__Chemin__Group__15__Impl ;
    public final void rule__Chemin__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5132:1: ( rule__Chemin__Group__15__Impl )
            // InternalGame.g:5133:2: rule__Chemin__Group__15__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Chemin__Group__15__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chemin__Group__15"


    // $ANTLR start "rule__Chemin__Group__15__Impl"
    // InternalGame.g:5139:1: rule__Chemin__Group__15__Impl : ( '}' ) ;
    public final void rule__Chemin__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5143:1: ( ( '}' ) )
            // InternalGame.g:5144:1: ( '}' )
            {
            // InternalGame.g:5144:1: ( '}' )
            // InternalGame.g:5145:2: '}'
            {
             before(grammarAccess.getCheminAccess().getRightCurlyBracketKeyword_15()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getCheminAccess().getRightCurlyBracketKeyword_15()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chemin__Group__15__Impl"


    // $ANTLR start "rule__Chemin__Group_9__0"
    // InternalGame.g:5155:1: rule__Chemin__Group_9__0 : rule__Chemin__Group_9__0__Impl rule__Chemin__Group_9__1 ;
    public final void rule__Chemin__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5159:1: ( rule__Chemin__Group_9__0__Impl rule__Chemin__Group_9__1 )
            // InternalGame.g:5160:2: rule__Chemin__Group_9__0__Impl rule__Chemin__Group_9__1
            {
            pushFollow(FOLLOW_3);
            rule__Chemin__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Chemin__Group_9__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chemin__Group_9__0"


    // $ANTLR start "rule__Chemin__Group_9__0__Impl"
    // InternalGame.g:5167:1: rule__Chemin__Group_9__0__Impl : ( 'obligatoire' ) ;
    public final void rule__Chemin__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5171:1: ( ( 'obligatoire' ) )
            // InternalGame.g:5172:1: ( 'obligatoire' )
            {
            // InternalGame.g:5172:1: ( 'obligatoire' )
            // InternalGame.g:5173:2: 'obligatoire'
            {
             before(grammarAccess.getCheminAccess().getObligatoireKeyword_9_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getCheminAccess().getObligatoireKeyword_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chemin__Group_9__0__Impl"


    // $ANTLR start "rule__Chemin__Group_9__1"
    // InternalGame.g:5182:1: rule__Chemin__Group_9__1 : rule__Chemin__Group_9__1__Impl ;
    public final void rule__Chemin__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5186:1: ( rule__Chemin__Group_9__1__Impl )
            // InternalGame.g:5187:2: rule__Chemin__Group_9__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Chemin__Group_9__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chemin__Group_9__1"


    // $ANTLR start "rule__Chemin__Group_9__1__Impl"
    // InternalGame.g:5193:1: rule__Chemin__Group_9__1__Impl : ( ( rule__Chemin__ObligatoireAssignment_9_1 ) ) ;
    public final void rule__Chemin__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5197:1: ( ( ( rule__Chemin__ObligatoireAssignment_9_1 ) ) )
            // InternalGame.g:5198:1: ( ( rule__Chemin__ObligatoireAssignment_9_1 ) )
            {
            // InternalGame.g:5198:1: ( ( rule__Chemin__ObligatoireAssignment_9_1 ) )
            // InternalGame.g:5199:2: ( rule__Chemin__ObligatoireAssignment_9_1 )
            {
             before(grammarAccess.getCheminAccess().getObligatoireAssignment_9_1()); 
            // InternalGame.g:5200:2: ( rule__Chemin__ObligatoireAssignment_9_1 )
            // InternalGame.g:5200:3: rule__Chemin__ObligatoireAssignment_9_1
            {
            pushFollow(FOLLOW_2);
            rule__Chemin__ObligatoireAssignment_9_1();

            state._fsp--;


            }

             after(grammarAccess.getCheminAccess().getObligatoireAssignment_9_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chemin__Group_9__1__Impl"


    // $ANTLR start "rule__Chemin__Group_10__0"
    // InternalGame.g:5209:1: rule__Chemin__Group_10__0 : rule__Chemin__Group_10__0__Impl rule__Chemin__Group_10__1 ;
    public final void rule__Chemin__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5213:1: ( rule__Chemin__Group_10__0__Impl rule__Chemin__Group_10__1 )
            // InternalGame.g:5214:2: rule__Chemin__Group_10__0__Impl rule__Chemin__Group_10__1
            {
            pushFollow(FOLLOW_3);
            rule__Chemin__Group_10__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Chemin__Group_10__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chemin__Group_10__0"


    // $ANTLR start "rule__Chemin__Group_10__0__Impl"
    // InternalGame.g:5221:1: rule__Chemin__Group_10__0__Impl : ( 'visible' ) ;
    public final void rule__Chemin__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5225:1: ( ( 'visible' ) )
            // InternalGame.g:5226:1: ( 'visible' )
            {
            // InternalGame.g:5226:1: ( 'visible' )
            // InternalGame.g:5227:2: 'visible'
            {
             before(grammarAccess.getCheminAccess().getVisibleKeyword_10_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getCheminAccess().getVisibleKeyword_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chemin__Group_10__0__Impl"


    // $ANTLR start "rule__Chemin__Group_10__1"
    // InternalGame.g:5236:1: rule__Chemin__Group_10__1 : rule__Chemin__Group_10__1__Impl ;
    public final void rule__Chemin__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5240:1: ( rule__Chemin__Group_10__1__Impl )
            // InternalGame.g:5241:2: rule__Chemin__Group_10__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Chemin__Group_10__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chemin__Group_10__1"


    // $ANTLR start "rule__Chemin__Group_10__1__Impl"
    // InternalGame.g:5247:1: rule__Chemin__Group_10__1__Impl : ( ( rule__Chemin__VisibleAssignment_10_1 ) ) ;
    public final void rule__Chemin__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5251:1: ( ( ( rule__Chemin__VisibleAssignment_10_1 ) ) )
            // InternalGame.g:5252:1: ( ( rule__Chemin__VisibleAssignment_10_1 ) )
            {
            // InternalGame.g:5252:1: ( ( rule__Chemin__VisibleAssignment_10_1 ) )
            // InternalGame.g:5253:2: ( rule__Chemin__VisibleAssignment_10_1 )
            {
             before(grammarAccess.getCheminAccess().getVisibleAssignment_10_1()); 
            // InternalGame.g:5254:2: ( rule__Chemin__VisibleAssignment_10_1 )
            // InternalGame.g:5254:3: rule__Chemin__VisibleAssignment_10_1
            {
            pushFollow(FOLLOW_2);
            rule__Chemin__VisibleAssignment_10_1();

            state._fsp--;


            }

             after(grammarAccess.getCheminAccess().getVisibleAssignment_10_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chemin__Group_10__1__Impl"


    // $ANTLR start "rule__Chemin__Group_11__0"
    // InternalGame.g:5263:1: rule__Chemin__Group_11__0 : rule__Chemin__Group_11__0__Impl rule__Chemin__Group_11__1 ;
    public final void rule__Chemin__Group_11__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5267:1: ( rule__Chemin__Group_11__0__Impl rule__Chemin__Group_11__1 )
            // InternalGame.g:5268:2: rule__Chemin__Group_11__0__Impl rule__Chemin__Group_11__1
            {
            pushFollow(FOLLOW_3);
            rule__Chemin__Group_11__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Chemin__Group_11__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chemin__Group_11__0"


    // $ANTLR start "rule__Chemin__Group_11__0__Impl"
    // InternalGame.g:5275:1: rule__Chemin__Group_11__0__Impl : ( 'ouvert' ) ;
    public final void rule__Chemin__Group_11__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5279:1: ( ( 'ouvert' ) )
            // InternalGame.g:5280:1: ( 'ouvert' )
            {
            // InternalGame.g:5280:1: ( 'ouvert' )
            // InternalGame.g:5281:2: 'ouvert'
            {
             before(grammarAccess.getCheminAccess().getOuvertKeyword_11_0()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getCheminAccess().getOuvertKeyword_11_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chemin__Group_11__0__Impl"


    // $ANTLR start "rule__Chemin__Group_11__1"
    // InternalGame.g:5290:1: rule__Chemin__Group_11__1 : rule__Chemin__Group_11__1__Impl ;
    public final void rule__Chemin__Group_11__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5294:1: ( rule__Chemin__Group_11__1__Impl )
            // InternalGame.g:5295:2: rule__Chemin__Group_11__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Chemin__Group_11__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chemin__Group_11__1"


    // $ANTLR start "rule__Chemin__Group_11__1__Impl"
    // InternalGame.g:5301:1: rule__Chemin__Group_11__1__Impl : ( ( rule__Chemin__OuvertAssignment_11_1 ) ) ;
    public final void rule__Chemin__Group_11__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5305:1: ( ( ( rule__Chemin__OuvertAssignment_11_1 ) ) )
            // InternalGame.g:5306:1: ( ( rule__Chemin__OuvertAssignment_11_1 ) )
            {
            // InternalGame.g:5306:1: ( ( rule__Chemin__OuvertAssignment_11_1 ) )
            // InternalGame.g:5307:2: ( rule__Chemin__OuvertAssignment_11_1 )
            {
             before(grammarAccess.getCheminAccess().getOuvertAssignment_11_1()); 
            // InternalGame.g:5308:2: ( rule__Chemin__OuvertAssignment_11_1 )
            // InternalGame.g:5308:3: rule__Chemin__OuvertAssignment_11_1
            {
            pushFollow(FOLLOW_2);
            rule__Chemin__OuvertAssignment_11_1();

            state._fsp--;


            }

             after(grammarAccess.getCheminAccess().getOuvertAssignment_11_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chemin__Group_11__1__Impl"


    // $ANTLR start "rule__Game__NameAssignment_1"
    // InternalGame.g:5317:1: rule__Game__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Game__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5321:1: ( ( RULE_ID ) )
            // InternalGame.g:5322:2: ( RULE_ID )
            {
            // InternalGame.g:5322:2: ( RULE_ID )
            // InternalGame.g:5323:3: RULE_ID
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
    // InternalGame.g:5332:1: rule__Game__TerritoireElementsAssignment_3 : ( ruleterritoireElement ) ;
    public final void rule__Game__TerritoireElementsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5336:1: ( ( ruleterritoireElement ) )
            // InternalGame.g:5337:2: ( ruleterritoireElement )
            {
            // InternalGame.g:5337:2: ( ruleterritoireElement )
            // InternalGame.g:5338:3: ruleterritoireElement
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
    // InternalGame.g:5347:1: rule__Explorateur__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Explorateur__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5351:1: ( ( RULE_ID ) )
            // InternalGame.g:5352:2: ( RULE_ID )
            {
            // InternalGame.g:5352:2: ( RULE_ID )
            // InternalGame.g:5353:3: RULE_ID
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
    // InternalGame.g:5362:1: rule__Explorateur__SacAssignment_3 : ( ruleSac ) ;
    public final void rule__Explorateur__SacAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5366:1: ( ( ruleSac ) )
            // InternalGame.g:5367:2: ( ruleSac )
            {
            // InternalGame.g:5367:2: ( ruleSac )
            // InternalGame.g:5368:3: ruleSac
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
    // InternalGame.g:5377:1: rule__Explorateur__ConnaissancesAssignment_5 : ( ( RULE_ID ) ) ;
    public final void rule__Explorateur__ConnaissancesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5381:1: ( ( ( RULE_ID ) ) )
            // InternalGame.g:5382:2: ( ( RULE_ID ) )
            {
            // InternalGame.g:5382:2: ( ( RULE_ID ) )
            // InternalGame.g:5383:3: ( RULE_ID )
            {
             before(grammarAccess.getExplorateurAccess().getConnaissancesConnaissanceCrossReference_5_0()); 
            // InternalGame.g:5384:3: ( RULE_ID )
            // InternalGame.g:5385:4: RULE_ID
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
    // InternalGame.g:5396:1: rule__Explorateur__PositionAssignment_7 : ( ( RULE_ID ) ) ;
    public final void rule__Explorateur__PositionAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5400:1: ( ( ( RULE_ID ) ) )
            // InternalGame.g:5401:2: ( ( RULE_ID ) )
            {
            // InternalGame.g:5401:2: ( ( RULE_ID ) )
            // InternalGame.g:5402:3: ( RULE_ID )
            {
             before(grammarAccess.getExplorateurAccess().getPositionLieuCrossReference_7_0()); 
            // InternalGame.g:5403:3: ( RULE_ID )
            // InternalGame.g:5404:4: RULE_ID
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
    // InternalGame.g:5415:1: rule__Sac__TailleAssignment_1 : ( RULE_INT ) ;
    public final void rule__Sac__TailleAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5419:1: ( ( RULE_INT ) )
            // InternalGame.g:5420:2: ( RULE_INT )
            {
            // InternalGame.g:5420:2: ( RULE_INT )
            // InternalGame.g:5421:3: RULE_INT
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
    // InternalGame.g:5430:1: rule__Sac__SacElementsAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__Sac__SacElementsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5434:1: ( ( ( RULE_ID ) ) )
            // InternalGame.g:5435:2: ( ( RULE_ID ) )
            {
            // InternalGame.g:5435:2: ( ( RULE_ID ) )
            // InternalGame.g:5436:3: ( RULE_ID )
            {
             before(grammarAccess.getSacAccess().getSacElementsObjetExplorateurCrossReference_3_0()); 
            // InternalGame.g:5437:3: ( RULE_ID )
            // InternalGame.g:5438:4: RULE_ID
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
    // InternalGame.g:5449:1: rule__Lieu__TypeAssignment_0 : ( ruleTypeLieu ) ;
    public final void rule__Lieu__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5453:1: ( ( ruleTypeLieu ) )
            // InternalGame.g:5454:2: ( ruleTypeLieu )
            {
            // InternalGame.g:5454:2: ( ruleTypeLieu )
            // InternalGame.g:5455:3: ruleTypeLieu
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
    // InternalGame.g:5464:1: rule__Lieu__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Lieu__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5468:1: ( ( RULE_ID ) )
            // InternalGame.g:5469:2: ( RULE_ID )
            {
            // InternalGame.g:5469:2: ( RULE_ID )
            // InternalGame.g:5470:3: RULE_ID
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
    // InternalGame.g:5479:1: rule__Lieu__DescriptionAssignment_3_1 : ( RULE_STRING ) ;
    public final void rule__Lieu__DescriptionAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5483:1: ( ( RULE_STRING ) )
            // InternalGame.g:5484:2: ( RULE_STRING )
            {
            // InternalGame.g:5484:2: ( RULE_STRING )
            // InternalGame.g:5485:3: RULE_STRING
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
    // InternalGame.g:5494:1: rule__Lieu__ConditionDescriptionAssignment_3_2 : ( ruleCondition ) ;
    public final void rule__Lieu__ConditionDescriptionAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5498:1: ( ( ruleCondition ) )
            // InternalGame.g:5499:2: ( ruleCondition )
            {
            // InternalGame.g:5499:2: ( ruleCondition )
            // InternalGame.g:5500:3: ruleCondition
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
    // InternalGame.g:5509:1: rule__Lieu__PersonnesAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__Lieu__PersonnesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5513:1: ( ( ( RULE_ID ) ) )
            // InternalGame.g:5514:2: ( ( RULE_ID ) )
            {
            // InternalGame.g:5514:2: ( ( RULE_ID ) )
            // InternalGame.g:5515:3: ( RULE_ID )
            {
             before(grammarAccess.getLieuAccess().getPersonnesPersonneCrossReference_4_0()); 
            // InternalGame.g:5516:3: ( RULE_ID )
            // InternalGame.g:5517:4: RULE_ID
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
    // InternalGame.g:5528:1: rule__Lieu__ConnaissancesAssignment_5 : ( ( RULE_ID ) ) ;
    public final void rule__Lieu__ConnaissancesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5532:1: ( ( ( RULE_ID ) ) )
            // InternalGame.g:5533:2: ( ( RULE_ID ) )
            {
            // InternalGame.g:5533:2: ( ( RULE_ID ) )
            // InternalGame.g:5534:3: ( RULE_ID )
            {
             before(grammarAccess.getLieuAccess().getConnaissancesConnaissanceCrossReference_5_0()); 
            // InternalGame.g:5535:3: ( RULE_ID )
            // InternalGame.g:5536:4: RULE_ID
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
    // InternalGame.g:5547:1: rule__Lieu__ObjetsAssignment_6 : ( ( RULE_ID ) ) ;
    public final void rule__Lieu__ObjetsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5551:1: ( ( ( RULE_ID ) ) )
            // InternalGame.g:5552:2: ( ( RULE_ID ) )
            {
            // InternalGame.g:5552:2: ( ( RULE_ID ) )
            // InternalGame.g:5553:3: ( RULE_ID )
            {
             before(grammarAccess.getLieuAccess().getObjetsObjetLieuCrossReference_6_0()); 
            // InternalGame.g:5554:3: ( RULE_ID )
            // InternalGame.g:5555:4: RULE_ID
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
    // InternalGame.g:5566:1: rule__Lieu__DepotObjetAssignment_7_1 : ( ruleCondition ) ;
    public final void rule__Lieu__DepotObjetAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5570:1: ( ( ruleCondition ) )
            // InternalGame.g:5571:2: ( ruleCondition )
            {
            // InternalGame.g:5571:2: ( ruleCondition )
            // InternalGame.g:5572:3: ruleCondition
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
    // InternalGame.g:5581:1: rule__Lieu__ListeCheminsAssignment_8 : ( ( RULE_ID ) ) ;
    public final void rule__Lieu__ListeCheminsAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5585:1: ( ( ( RULE_ID ) ) )
            // InternalGame.g:5586:2: ( ( RULE_ID ) )
            {
            // InternalGame.g:5586:2: ( ( RULE_ID ) )
            // InternalGame.g:5587:3: ( RULE_ID )
            {
             before(grammarAccess.getLieuAccess().getListeCheminsCheminCrossReference_8_0()); 
            // InternalGame.g:5588:3: ( RULE_ID )
            // InternalGame.g:5589:4: RULE_ID
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
    // InternalGame.g:5600:1: rule__Personnes__ListePersonnesAssignment_2 : ( rulePersonne ) ;
    public final void rule__Personnes__ListePersonnesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5604:1: ( ( rulePersonne ) )
            // InternalGame.g:5605:2: ( rulePersonne )
            {
            // InternalGame.g:5605:2: ( rulePersonne )
            // InternalGame.g:5606:3: rulePersonne
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


    // $ANTLR start "rule__Personne__NameAssignment_0"
    // InternalGame.g:5615:1: rule__Personne__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Personne__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5619:1: ( ( RULE_ID ) )
            // InternalGame.g:5620:2: ( RULE_ID )
            {
            // InternalGame.g:5620:2: ( RULE_ID )
            // InternalGame.g:5621:3: RULE_ID
            {
             before(grammarAccess.getPersonneAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPersonneAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Personne__NameAssignment_0"


    // $ANTLR start "rule__Personne__VisibleAssignment_2_1"
    // InternalGame.g:5630:1: rule__Personne__VisibleAssignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__Personne__VisibleAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5634:1: ( ( ( RULE_ID ) ) )
            // InternalGame.g:5635:2: ( ( RULE_ID ) )
            {
            // InternalGame.g:5635:2: ( ( RULE_ID ) )
            // InternalGame.g:5636:3: ( RULE_ID )
            {
             before(grammarAccess.getPersonneAccess().getVisibleConditionCrossReference_2_1_0()); 
            // InternalGame.g:5637:3: ( RULE_ID )
            // InternalGame.g:5638:4: RULE_ID
            {
             before(grammarAccess.getPersonneAccess().getVisibleConditionIDTerminalRuleCall_2_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPersonneAccess().getVisibleConditionIDTerminalRuleCall_2_1_0_1()); 

            }

             after(grammarAccess.getPersonneAccess().getVisibleConditionCrossReference_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Personne__VisibleAssignment_2_1"


    // $ANTLR start "rule__Personne__ObligatoireAssignment_3_1"
    // InternalGame.g:5649:1: rule__Personne__ObligatoireAssignment_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__Personne__ObligatoireAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5653:1: ( ( ( RULE_ID ) ) )
            // InternalGame.g:5654:2: ( ( RULE_ID ) )
            {
            // InternalGame.g:5654:2: ( ( RULE_ID ) )
            // InternalGame.g:5655:3: ( RULE_ID )
            {
             before(grammarAccess.getPersonneAccess().getObligatoireConditionCrossReference_3_1_0()); 
            // InternalGame.g:5656:3: ( RULE_ID )
            // InternalGame.g:5657:4: RULE_ID
            {
             before(grammarAccess.getPersonneAccess().getObligatoireConditionIDTerminalRuleCall_3_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPersonneAccess().getObligatoireConditionIDTerminalRuleCall_3_1_0_1()); 

            }

             after(grammarAccess.getPersonneAccess().getObligatoireConditionCrossReference_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Personne__ObligatoireAssignment_3_1"


    // $ANTLR start "rule__Personne__PersonneElementsAssignment_4"
    // InternalGame.g:5668:1: rule__Personne__PersonneElementsAssignment_4 : ( ruleInteraction ) ;
    public final void rule__Personne__PersonneElementsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5672:1: ( ( ruleInteraction ) )
            // InternalGame.g:5673:2: ( ruleInteraction )
            {
            // InternalGame.g:5673:2: ( ruleInteraction )
            // InternalGame.g:5674:3: ruleInteraction
            {
             before(grammarAccess.getPersonneAccess().getPersonneElementsInteractionParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleInteraction();

            state._fsp--;

             after(grammarAccess.getPersonneAccess().getPersonneElementsInteractionParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Personne__PersonneElementsAssignment_4"


    // $ANTLR start "rule__Interaction__NameAssignment_1"
    // InternalGame.g:5683:1: rule__Interaction__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Interaction__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5687:1: ( ( RULE_ID ) )
            // InternalGame.g:5688:2: ( RULE_ID )
            {
            // InternalGame.g:5688:2: ( RULE_ID )
            // InternalGame.g:5689:3: RULE_ID
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
    // InternalGame.g:5698:1: rule__Interaction__TexteAssignment_4 : ( RULE_STRING ) ;
    public final void rule__Interaction__TexteAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5702:1: ( ( RULE_STRING ) )
            // InternalGame.g:5703:2: ( RULE_STRING )
            {
            // InternalGame.g:5703:2: ( RULE_STRING )
            // InternalGame.g:5704:3: RULE_STRING
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
    // InternalGame.g:5713:1: rule__Interaction__InteractionElementsAssignment_5 : ( ruleChoix ) ;
    public final void rule__Interaction__InteractionElementsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5717:1: ( ( ruleChoix ) )
            // InternalGame.g:5718:2: ( ruleChoix )
            {
            // InternalGame.g:5718:2: ( ruleChoix )
            // InternalGame.g:5719:3: ruleChoix
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
    // InternalGame.g:5728:1: rule__Choix__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Choix__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5732:1: ( ( RULE_ID ) )
            // InternalGame.g:5733:2: ( RULE_ID )
            {
            // InternalGame.g:5733:2: ( RULE_ID )
            // InternalGame.g:5734:3: RULE_ID
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


    // $ANTLR start "rule__Choix__TexteAssignment_3"
    // InternalGame.g:5743:1: rule__Choix__TexteAssignment_3 : ( RULE_STRING ) ;
    public final void rule__Choix__TexteAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5747:1: ( ( RULE_STRING ) )
            // InternalGame.g:5748:2: ( RULE_STRING )
            {
            // InternalGame.g:5748:2: ( RULE_STRING )
            // InternalGame.g:5749:3: RULE_STRING
            {
             before(grammarAccess.getChoixAccess().getTexteSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getChoixAccess().getTexteSTRINGTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choix__TexteAssignment_3"


    // $ANTLR start "rule__Choix__ListeActionsAssignment_4"
    // InternalGame.g:5758:1: rule__Choix__ListeActionsAssignment_4 : ( ruleAction ) ;
    public final void rule__Choix__ListeActionsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5762:1: ( ( ruleAction ) )
            // InternalGame.g:5763:2: ( ruleAction )
            {
            // InternalGame.g:5763:2: ( ruleAction )
            // InternalGame.g:5764:3: ruleAction
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
    // InternalGame.g:5773:1: rule__Choix__ChoixdebutAssignment_5_1_0 : ( RULE_STRING ) ;
    public final void rule__Choix__ChoixdebutAssignment_5_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5777:1: ( ( RULE_STRING ) )
            // InternalGame.g:5778:2: ( RULE_STRING )
            {
            // InternalGame.g:5778:2: ( RULE_STRING )
            // InternalGame.g:5779:3: RULE_STRING
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
    // InternalGame.g:5788:1: rule__Choix__ConditonChoixDebutAssignment_5_1_1 : ( ruleCondition ) ;
    public final void rule__Choix__ConditonChoixDebutAssignment_5_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5792:1: ( ( ruleCondition ) )
            // InternalGame.g:5793:2: ( ruleCondition )
            {
            // InternalGame.g:5793:2: ( ruleCondition )
            // InternalGame.g:5794:3: ruleCondition
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
    // InternalGame.g:5803:1: rule__Choix__ChoixfinAssignment_6_1_0 : ( RULE_STRING ) ;
    public final void rule__Choix__ChoixfinAssignment_6_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5807:1: ( ( RULE_STRING ) )
            // InternalGame.g:5808:2: ( RULE_STRING )
            {
            // InternalGame.g:5808:2: ( RULE_STRING )
            // InternalGame.g:5809:3: RULE_STRING
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
    // InternalGame.g:5818:1: rule__Choix__ConditionChoixFinAssignment_6_1_1 : ( ruleCondition ) ;
    public final void rule__Choix__ConditionChoixFinAssignment_6_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5822:1: ( ( ruleCondition ) )
            // InternalGame.g:5823:2: ( ruleCondition )
            {
            // InternalGame.g:5823:2: ( ruleCondition )
            // InternalGame.g:5824:3: ruleCondition
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


    // $ANTLR start "rule__Action__TexteAssignment_2"
    // InternalGame.g:5833:1: rule__Action__TexteAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Action__TexteAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5837:1: ( ( RULE_STRING ) )
            // InternalGame.g:5838:2: ( RULE_STRING )
            {
            // InternalGame.g:5838:2: ( RULE_STRING )
            // InternalGame.g:5839:3: RULE_STRING
            {
             before(grammarAccess.getActionAccess().getTexteSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getActionAccess().getTexteSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__TexteAssignment_2"


    // $ANTLR start "rule__Action__ConditionActionAssignment_3"
    // InternalGame.g:5848:1: rule__Action__ConditionActionAssignment_3 : ( ruleCondition ) ;
    public final void rule__Action__ConditionActionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5852:1: ( ( ruleCondition ) )
            // InternalGame.g:5853:2: ( ruleCondition )
            {
            // InternalGame.g:5853:2: ( ruleCondition )
            // InternalGame.g:5854:3: ruleCondition
            {
             before(grammarAccess.getActionAccess().getConditionActionConditionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleCondition();

            state._fsp--;

             after(grammarAccess.getActionAccess().getConditionActionConditionParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__ConditionActionAssignment_3"


    // $ANTLR start "rule__Action__ListeChoixAssignment_4"
    // InternalGame.g:5863:1: rule__Action__ListeChoixAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__Action__ListeChoixAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5867:1: ( ( ( RULE_ID ) ) )
            // InternalGame.g:5868:2: ( ( RULE_ID ) )
            {
            // InternalGame.g:5868:2: ( ( RULE_ID ) )
            // InternalGame.g:5869:3: ( RULE_ID )
            {
             before(grammarAccess.getActionAccess().getListeChoixChoixCrossReference_4_0()); 
            // InternalGame.g:5870:3: ( RULE_ID )
            // InternalGame.g:5871:4: RULE_ID
            {
             before(grammarAccess.getActionAccess().getListeChoixChoixIDTerminalRuleCall_4_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getActionAccess().getListeChoixChoixIDTerminalRuleCall_4_0_1()); 

            }

             after(grammarAccess.getActionAccess().getListeChoixChoixCrossReference_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__ListeChoixAssignment_4"


    // $ANTLR start "rule__Action__ListeConnaissancesAssignment_5_1"
    // InternalGame.g:5882:1: rule__Action__ListeConnaissancesAssignment_5_1 : ( ( RULE_ID ) ) ;
    public final void rule__Action__ListeConnaissancesAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5886:1: ( ( ( RULE_ID ) ) )
            // InternalGame.g:5887:2: ( ( RULE_ID ) )
            {
            // InternalGame.g:5887:2: ( ( RULE_ID ) )
            // InternalGame.g:5888:3: ( RULE_ID )
            {
             before(grammarAccess.getActionAccess().getListeConnaissancesConnaissanceCrossReference_5_1_0()); 
            // InternalGame.g:5889:3: ( RULE_ID )
            // InternalGame.g:5890:4: RULE_ID
            {
             before(grammarAccess.getActionAccess().getListeConnaissancesConnaissanceIDTerminalRuleCall_5_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getActionAccess().getListeConnaissancesConnaissanceIDTerminalRuleCall_5_1_0_1()); 

            }

             after(grammarAccess.getActionAccess().getListeConnaissancesConnaissanceCrossReference_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__ListeConnaissancesAssignment_5_1"


    // $ANTLR start "rule__Action__ListeObjetsAssignment_6_1"
    // InternalGame.g:5901:1: rule__Action__ListeObjetsAssignment_6_1 : ( ( RULE_ID ) ) ;
    public final void rule__Action__ListeObjetsAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5905:1: ( ( ( RULE_ID ) ) )
            // InternalGame.g:5906:2: ( ( RULE_ID ) )
            {
            // InternalGame.g:5906:2: ( ( RULE_ID ) )
            // InternalGame.g:5907:3: ( RULE_ID )
            {
             before(grammarAccess.getActionAccess().getListeObjetsObjetLieuCrossReference_6_1_0()); 
            // InternalGame.g:5908:3: ( RULE_ID )
            // InternalGame.g:5909:4: RULE_ID
            {
             before(grammarAccess.getActionAccess().getListeObjetsObjetLieuIDTerminalRuleCall_6_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getActionAccess().getListeObjetsObjetLieuIDTerminalRuleCall_6_1_0_1()); 

            }

             after(grammarAccess.getActionAccess().getListeObjetsObjetLieuCrossReference_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__ListeObjetsAssignment_6_1"


    // $ANTLR start "rule__Action__AttributionConnaissanceAssignment_7_1"
    // InternalGame.g:5920:1: rule__Action__AttributionConnaissanceAssignment_7_1 : ( ruleCondition ) ;
    public final void rule__Action__AttributionConnaissanceAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5924:1: ( ( ruleCondition ) )
            // InternalGame.g:5925:2: ( ruleCondition )
            {
            // InternalGame.g:5925:2: ( ruleCondition )
            // InternalGame.g:5926:3: ruleCondition
            {
             before(grammarAccess.getActionAccess().getAttributionConnaissanceConditionParserRuleCall_7_1_0()); 
            pushFollow(FOLLOW_2);
            ruleCondition();

            state._fsp--;

             after(grammarAccess.getActionAccess().getAttributionConnaissanceConditionParserRuleCall_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__AttributionConnaissanceAssignment_7_1"


    // $ANTLR start "rule__Action__AttributionObjetAssignment_8_1"
    // InternalGame.g:5935:1: rule__Action__AttributionObjetAssignment_8_1 : ( ruleCondition ) ;
    public final void rule__Action__AttributionObjetAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5939:1: ( ( ruleCondition ) )
            // InternalGame.g:5940:2: ( ruleCondition )
            {
            // InternalGame.g:5940:2: ( ruleCondition )
            // InternalGame.g:5941:3: ruleCondition
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


    // $ANTLR start "rule__Action__ListeObjetsConsommesAssignment_9_1"
    // InternalGame.g:5950:1: rule__Action__ListeObjetsConsommesAssignment_9_1 : ( ( RULE_ID ) ) ;
    public final void rule__Action__ListeObjetsConsommesAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5954:1: ( ( ( RULE_ID ) ) )
            // InternalGame.g:5955:2: ( ( RULE_ID ) )
            {
            // InternalGame.g:5955:2: ( ( RULE_ID ) )
            // InternalGame.g:5956:3: ( RULE_ID )
            {
             before(grammarAccess.getActionAccess().getListeObjetsConsommesObjetExplorateurCrossReference_9_1_0()); 
            // InternalGame.g:5957:3: ( RULE_ID )
            // InternalGame.g:5958:4: RULE_ID
            {
             before(grammarAccess.getActionAccess().getListeObjetsConsommesObjetExplorateurIDTerminalRuleCall_9_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getActionAccess().getListeObjetsConsommesObjetExplorateurIDTerminalRuleCall_9_1_0_1()); 

            }

             after(grammarAccess.getActionAccess().getListeObjetsConsommesObjetExplorateurCrossReference_9_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__ListeObjetsConsommesAssignment_9_1"


    // $ANTLR start "rule__Action__ListeQuantiteAssignment_9_3"
    // InternalGame.g:5969:1: rule__Action__ListeQuantiteAssignment_9_3 : ( RULE_INT ) ;
    public final void rule__Action__ListeQuantiteAssignment_9_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5973:1: ( ( RULE_INT ) )
            // InternalGame.g:5974:2: ( RULE_INT )
            {
            // InternalGame.g:5974:2: ( RULE_INT )
            // InternalGame.g:5975:3: RULE_INT
            {
             before(grammarAccess.getActionAccess().getListeQuantiteINTTerminalRuleCall_9_3_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getActionAccess().getListeQuantiteINTTerminalRuleCall_9_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__ListeQuantiteAssignment_9_3"


    // $ANTLR start "rule__Action__ConsommationObjetAssignment_10_1"
    // InternalGame.g:5984:1: rule__Action__ConsommationObjetAssignment_10_1 : ( ruleCondition ) ;
    public final void rule__Action__ConsommationObjetAssignment_10_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5988:1: ( ( ruleCondition ) )
            // InternalGame.g:5989:2: ( ruleCondition )
            {
            // InternalGame.g:5989:2: ( ruleCondition )
            // InternalGame.g:5990:3: ruleCondition
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
    // InternalGame.g:5999:1: rule__ObjetExplorateur__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__ObjetExplorateur__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:6003:1: ( ( RULE_ID ) )
            // InternalGame.g:6004:2: ( RULE_ID )
            {
            // InternalGame.g:6004:2: ( RULE_ID )
            // InternalGame.g:6005:3: RULE_ID
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
    // InternalGame.g:6014:1: rule__ObjetExplorateur__TailleAssignment_1 : ( RULE_INT ) ;
    public final void rule__ObjetExplorateur__TailleAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:6018:1: ( ( RULE_INT ) )
            // InternalGame.g:6019:2: ( RULE_INT )
            {
            // InternalGame.g:6019:2: ( RULE_INT )
            // InternalGame.g:6020:3: RULE_INT
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
    // InternalGame.g:6029:1: rule__ObjetExplorateur__QuantiteAssignment_2 : ( RULE_INT ) ;
    public final void rule__ObjetExplorateur__QuantiteAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:6033:1: ( ( RULE_INT ) )
            // InternalGame.g:6034:2: ( RULE_INT )
            {
            // InternalGame.g:6034:2: ( RULE_INT )
            // InternalGame.g:6035:3: RULE_INT
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
    // InternalGame.g:6044:1: rule__ObjetExplorateur__DescriptionAssignment_3_1 : ( RULE_STRING ) ;
    public final void rule__ObjetExplorateur__DescriptionAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:6048:1: ( ( RULE_STRING ) )
            // InternalGame.g:6049:2: ( RULE_STRING )
            {
            // InternalGame.g:6049:2: ( RULE_STRING )
            // InternalGame.g:6050:3: RULE_STRING
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
    // InternalGame.g:6059:1: rule__ObjetExplorateur__ConditionDescriptionAssignment_3_2 : ( ruleCondition ) ;
    public final void rule__ObjetExplorateur__ConditionDescriptionAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:6063:1: ( ( ruleCondition ) )
            // InternalGame.g:6064:2: ( ruleCondition )
            {
            // InternalGame.g:6064:2: ( ruleCondition )
            // InternalGame.g:6065:3: ruleCondition
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
    // InternalGame.g:6074:1: rule__ObjetExplorateur__TransformableAssignment_4_1 : ( ruleCondition ) ;
    public final void rule__ObjetExplorateur__TransformableAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:6078:1: ( ( ruleCondition ) )
            // InternalGame.g:6079:2: ( ruleCondition )
            {
            // InternalGame.g:6079:2: ( ruleCondition )
            // InternalGame.g:6080:3: ruleCondition
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
    // InternalGame.g:6089:1: rule__ObjetLieu__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__ObjetLieu__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:6093:1: ( ( RULE_ID ) )
            // InternalGame.g:6094:2: ( RULE_ID )
            {
            // InternalGame.g:6094:2: ( RULE_ID )
            // InternalGame.g:6095:3: RULE_ID
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
    // InternalGame.g:6104:1: rule__ObjetLieu__TailleAssignment_1 : ( RULE_INT ) ;
    public final void rule__ObjetLieu__TailleAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:6108:1: ( ( RULE_INT ) )
            // InternalGame.g:6109:2: ( RULE_INT )
            {
            // InternalGame.g:6109:2: ( RULE_INT )
            // InternalGame.g:6110:3: RULE_INT
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
    // InternalGame.g:6119:1: rule__ObjetLieu__QuantiteAssignment_2 : ( RULE_INT ) ;
    public final void rule__ObjetLieu__QuantiteAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:6123:1: ( ( RULE_INT ) )
            // InternalGame.g:6124:2: ( RULE_INT )
            {
            // InternalGame.g:6124:2: ( RULE_INT )
            // InternalGame.g:6125:3: RULE_INT
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
    // InternalGame.g:6134:1: rule__ObjetLieu__ConditionTransmissionAssignment_3_1 : ( ruleCondition ) ;
    public final void rule__ObjetLieu__ConditionTransmissionAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:6138:1: ( ( ruleCondition ) )
            // InternalGame.g:6139:2: ( ruleCondition )
            {
            // InternalGame.g:6139:2: ( ruleCondition )
            // InternalGame.g:6140:3: ruleCondition
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
    // InternalGame.g:6149:1: rule__ObjetLieu__ConditionConsommationAssignment_4_1 : ( ruleCondition ) ;
    public final void rule__ObjetLieu__ConditionConsommationAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:6153:1: ( ( ruleCondition ) )
            // InternalGame.g:6154:2: ( ruleCondition )
            {
            // InternalGame.g:6154:2: ( ruleCondition )
            // InternalGame.g:6155:3: ruleCondition
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
    // InternalGame.g:6164:1: rule__ObjetLieu__DescriptionAssignment_5_1 : ( RULE_STRING ) ;
    public final void rule__ObjetLieu__DescriptionAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:6168:1: ( ( RULE_STRING ) )
            // InternalGame.g:6169:2: ( RULE_STRING )
            {
            // InternalGame.g:6169:2: ( RULE_STRING )
            // InternalGame.g:6170:3: RULE_STRING
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
    // InternalGame.g:6179:1: rule__ObjetLieu__ConditionDescriptionAssignment_5_2 : ( ruleCondition ) ;
    public final void rule__ObjetLieu__ConditionDescriptionAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:6183:1: ( ( ruleCondition ) )
            // InternalGame.g:6184:2: ( ruleCondition )
            {
            // InternalGame.g:6184:2: ( ruleCondition )
            // InternalGame.g:6185:3: ruleCondition
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
    // InternalGame.g:6194:1: rule__ObjetLieu__TransformableAssignment_6_1 : ( ruleCondition ) ;
    public final void rule__ObjetLieu__TransformableAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:6198:1: ( ( ruleCondition ) )
            // InternalGame.g:6199:2: ( ruleCondition )
            {
            // InternalGame.g:6199:2: ( ruleCondition )
            // InternalGame.g:6200:3: ruleCondition
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
    // InternalGame.g:6209:1: rule__ObjetsExplorateur__ListeObjetsAssignment_2 : ( ruleObjetExplorateur ) ;
    public final void rule__ObjetsExplorateur__ListeObjetsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:6213:1: ( ( ruleObjetExplorateur ) )
            // InternalGame.g:6214:2: ( ruleObjetExplorateur )
            {
            // InternalGame.g:6214:2: ( ruleObjetExplorateur )
            // InternalGame.g:6215:3: ruleObjetExplorateur
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
    // InternalGame.g:6224:1: rule__ObjetsLieu__ListeObjetsAssignment_2 : ( ruleObjetLieu ) ;
    public final void rule__ObjetsLieu__ListeObjetsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:6228:1: ( ( ruleObjetLieu ) )
            // InternalGame.g:6229:2: ( ruleObjetLieu )
            {
            // InternalGame.g:6229:2: ( ruleObjetLieu )
            // InternalGame.g:6230:3: ruleObjetLieu
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
    // InternalGame.g:6239:1: rule__Connaissances__ListeConnaissancesAssignment_2 : ( ruleConnaissance ) ;
    public final void rule__Connaissances__ListeConnaissancesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:6243:1: ( ( ruleConnaissance ) )
            // InternalGame.g:6244:2: ( ruleConnaissance )
            {
            // InternalGame.g:6244:2: ( ruleConnaissance )
            // InternalGame.g:6245:3: ruleConnaissance
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
    // InternalGame.g:6254:1: rule__Connaissance__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Connaissance__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:6258:1: ( ( RULE_ID ) )
            // InternalGame.g:6259:2: ( RULE_ID )
            {
            // InternalGame.g:6259:2: ( RULE_ID )
            // InternalGame.g:6260:3: RULE_ID
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
    // InternalGame.g:6269:1: rule__Connaissance__DescriptionAssignment_1_1 : ( RULE_STRING ) ;
    public final void rule__Connaissance__DescriptionAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:6273:1: ( ( RULE_STRING ) )
            // InternalGame.g:6274:2: ( RULE_STRING )
            {
            // InternalGame.g:6274:2: ( RULE_STRING )
            // InternalGame.g:6275:3: RULE_STRING
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
    // InternalGame.g:6284:1: rule__Connaissance__ConditionConnaissanceAssignment_1_2 : ( ruleCondition ) ;
    public final void rule__Connaissance__ConditionConnaissanceAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:6288:1: ( ( ruleCondition ) )
            // InternalGame.g:6289:2: ( ruleCondition )
            {
            // InternalGame.g:6289:2: ( ruleCondition )
            // InternalGame.g:6290:3: ruleCondition
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


    // $ANTLR start "rule__Conditions__ListeConditionsAssignment_2"
    // InternalGame.g:6299:1: rule__Conditions__ListeConditionsAssignment_2 : ( ruleCondition ) ;
    public final void rule__Conditions__ListeConditionsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:6303:1: ( ( ruleCondition ) )
            // InternalGame.g:6304:2: ( ruleCondition )
            {
            // InternalGame.g:6304:2: ( ruleCondition )
            // InternalGame.g:6305:3: ruleCondition
            {
             before(grammarAccess.getConditionsAccess().getListeConditionsConditionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleCondition();

            state._fsp--;

             after(grammarAccess.getConditionsAccess().getListeConditionsConditionParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditions__ListeConditionsAssignment_2"


    // $ANTLR start "rule__Condition__NameAssignment_0"
    // InternalGame.g:6314:1: rule__Condition__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Condition__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:6318:1: ( ( RULE_ID ) )
            // InternalGame.g:6319:2: ( RULE_ID )
            {
            // InternalGame.g:6319:2: ( RULE_ID )
            // InternalGame.g:6320:3: RULE_ID
            {
             before(grammarAccess.getConditionAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getConditionAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__NameAssignment_0"


    // $ANTLR start "rule__Condition__ConditionAssignment_1"
    // InternalGame.g:6329:1: rule__Condition__ConditionAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Condition__ConditionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:6333:1: ( ( RULE_STRING ) )
            // InternalGame.g:6334:2: ( RULE_STRING )
            {
            // InternalGame.g:6334:2: ( RULE_STRING )
            // InternalGame.g:6335:3: RULE_STRING
            {
             before(grammarAccess.getConditionAccess().getConditionSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getConditionAccess().getConditionSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__ConditionAssignment_1"


    // $ANTLR start "rule__Chemins__ListeCheminsAssignment_2"
    // InternalGame.g:6344:1: rule__Chemins__ListeCheminsAssignment_2 : ( ruleChemin ) ;
    public final void rule__Chemins__ListeCheminsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:6348:1: ( ( ruleChemin ) )
            // InternalGame.g:6349:2: ( ruleChemin )
            {
            // InternalGame.g:6349:2: ( ruleChemin )
            // InternalGame.g:6350:3: ruleChemin
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


    // $ANTLR start "rule__Chemin__NameAssignment_0"
    // InternalGame.g:6359:1: rule__Chemin__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Chemin__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:6363:1: ( ( RULE_ID ) )
            // InternalGame.g:6364:2: ( RULE_ID )
            {
            // InternalGame.g:6364:2: ( RULE_ID )
            // InternalGame.g:6365:3: RULE_ID
            {
             before(grammarAccess.getCheminAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCheminAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chemin__NameAssignment_0"


    // $ANTLR start "rule__Chemin__DescriptionAssignment_3"
    // InternalGame.g:6374:1: rule__Chemin__DescriptionAssignment_3 : ( RULE_STRING ) ;
    public final void rule__Chemin__DescriptionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:6378:1: ( ( RULE_STRING ) )
            // InternalGame.g:6379:2: ( RULE_STRING )
            {
            // InternalGame.g:6379:2: ( RULE_STRING )
            // InternalGame.g:6380:3: RULE_STRING
            {
             before(grammarAccess.getCheminAccess().getDescriptionSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getCheminAccess().getDescriptionSTRINGTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chemin__DescriptionAssignment_3"


    // $ANTLR start "rule__Chemin__ConditionDescriptionAssignment_4"
    // InternalGame.g:6389:1: rule__Chemin__ConditionDescriptionAssignment_4 : ( ruleCondition ) ;
    public final void rule__Chemin__ConditionDescriptionAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:6393:1: ( ( ruleCondition ) )
            // InternalGame.g:6394:2: ( ruleCondition )
            {
            // InternalGame.g:6394:2: ( ruleCondition )
            // InternalGame.g:6395:3: ruleCondition
            {
             before(grammarAccess.getCheminAccess().getConditionDescriptionConditionParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleCondition();

            state._fsp--;

             after(grammarAccess.getCheminAccess().getConditionDescriptionConditionParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chemin__ConditionDescriptionAssignment_4"


    // $ANTLR start "rule__Chemin__SourceAssignment_6"
    // InternalGame.g:6404:1: rule__Chemin__SourceAssignment_6 : ( ( RULE_ID ) ) ;
    public final void rule__Chemin__SourceAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:6408:1: ( ( ( RULE_ID ) ) )
            // InternalGame.g:6409:2: ( ( RULE_ID ) )
            {
            // InternalGame.g:6409:2: ( ( RULE_ID ) )
            // InternalGame.g:6410:3: ( RULE_ID )
            {
             before(grammarAccess.getCheminAccess().getSourceLieuCrossReference_6_0()); 
            // InternalGame.g:6411:3: ( RULE_ID )
            // InternalGame.g:6412:4: RULE_ID
            {
             before(grammarAccess.getCheminAccess().getSourceLieuIDTerminalRuleCall_6_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCheminAccess().getSourceLieuIDTerminalRuleCall_6_0_1()); 

            }

             after(grammarAccess.getCheminAccess().getSourceLieuCrossReference_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chemin__SourceAssignment_6"


    // $ANTLR start "rule__Chemin__DestinationAssignment_8"
    // InternalGame.g:6423:1: rule__Chemin__DestinationAssignment_8 : ( ( RULE_ID ) ) ;
    public final void rule__Chemin__DestinationAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:6427:1: ( ( ( RULE_ID ) ) )
            // InternalGame.g:6428:2: ( ( RULE_ID ) )
            {
            // InternalGame.g:6428:2: ( ( RULE_ID ) )
            // InternalGame.g:6429:3: ( RULE_ID )
            {
             before(grammarAccess.getCheminAccess().getDestinationLieuCrossReference_8_0()); 
            // InternalGame.g:6430:3: ( RULE_ID )
            // InternalGame.g:6431:4: RULE_ID
            {
             before(grammarAccess.getCheminAccess().getDestinationLieuIDTerminalRuleCall_8_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCheminAccess().getDestinationLieuIDTerminalRuleCall_8_0_1()); 

            }

             after(grammarAccess.getCheminAccess().getDestinationLieuCrossReference_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chemin__DestinationAssignment_8"


    // $ANTLR start "rule__Chemin__ObligatoireAssignment_9_1"
    // InternalGame.g:6442:1: rule__Chemin__ObligatoireAssignment_9_1 : ( ( RULE_ID ) ) ;
    public final void rule__Chemin__ObligatoireAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:6446:1: ( ( ( RULE_ID ) ) )
            // InternalGame.g:6447:2: ( ( RULE_ID ) )
            {
            // InternalGame.g:6447:2: ( ( RULE_ID ) )
            // InternalGame.g:6448:3: ( RULE_ID )
            {
             before(grammarAccess.getCheminAccess().getObligatoireConditionCrossReference_9_1_0()); 
            // InternalGame.g:6449:3: ( RULE_ID )
            // InternalGame.g:6450:4: RULE_ID
            {
             before(grammarAccess.getCheminAccess().getObligatoireConditionIDTerminalRuleCall_9_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCheminAccess().getObligatoireConditionIDTerminalRuleCall_9_1_0_1()); 

            }

             after(grammarAccess.getCheminAccess().getObligatoireConditionCrossReference_9_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chemin__ObligatoireAssignment_9_1"


    // $ANTLR start "rule__Chemin__VisibleAssignment_10_1"
    // InternalGame.g:6461:1: rule__Chemin__VisibleAssignment_10_1 : ( ( RULE_ID ) ) ;
    public final void rule__Chemin__VisibleAssignment_10_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:6465:1: ( ( ( RULE_ID ) ) )
            // InternalGame.g:6466:2: ( ( RULE_ID ) )
            {
            // InternalGame.g:6466:2: ( ( RULE_ID ) )
            // InternalGame.g:6467:3: ( RULE_ID )
            {
             before(grammarAccess.getCheminAccess().getVisibleConditionCrossReference_10_1_0()); 
            // InternalGame.g:6468:3: ( RULE_ID )
            // InternalGame.g:6469:4: RULE_ID
            {
             before(grammarAccess.getCheminAccess().getVisibleConditionIDTerminalRuleCall_10_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCheminAccess().getVisibleConditionIDTerminalRuleCall_10_1_0_1()); 

            }

             after(grammarAccess.getCheminAccess().getVisibleConditionCrossReference_10_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chemin__VisibleAssignment_10_1"


    // $ANTLR start "rule__Chemin__OuvertAssignment_11_1"
    // InternalGame.g:6480:1: rule__Chemin__OuvertAssignment_11_1 : ( ( RULE_ID ) ) ;
    public final void rule__Chemin__OuvertAssignment_11_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:6484:1: ( ( ( RULE_ID ) ) )
            // InternalGame.g:6485:2: ( ( RULE_ID ) )
            {
            // InternalGame.g:6485:2: ( ( RULE_ID ) )
            // InternalGame.g:6486:3: ( RULE_ID )
            {
             before(grammarAccess.getCheminAccess().getOuvertConditionCrossReference_11_1_0()); 
            // InternalGame.g:6487:3: ( RULE_ID )
            // InternalGame.g:6488:4: RULE_ID
            {
             before(grammarAccess.getCheminAccess().getOuvertConditionIDTerminalRuleCall_11_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCheminAccess().getOuvertConditionIDTerminalRuleCall_11_1_0_1()); 

            }

             after(grammarAccess.getCheminAccess().getOuvertConditionCrossReference_11_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chemin__OuvertAssignment_11_1"


    // $ANTLR start "rule__Chemin__ListeConnaissancesAssignment_12"
    // InternalGame.g:6499:1: rule__Chemin__ListeConnaissancesAssignment_12 : ( ( RULE_ID ) ) ;
    public final void rule__Chemin__ListeConnaissancesAssignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:6503:1: ( ( ( RULE_ID ) ) )
            // InternalGame.g:6504:2: ( ( RULE_ID ) )
            {
            // InternalGame.g:6504:2: ( ( RULE_ID ) )
            // InternalGame.g:6505:3: ( RULE_ID )
            {
             before(grammarAccess.getCheminAccess().getListeConnaissancesConnaissanceCrossReference_12_0()); 
            // InternalGame.g:6506:3: ( RULE_ID )
            // InternalGame.g:6507:4: RULE_ID
            {
             before(grammarAccess.getCheminAccess().getListeConnaissancesConnaissanceIDTerminalRuleCall_12_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCheminAccess().getListeConnaissancesConnaissanceIDTerminalRuleCall_12_0_1()); 

            }

             after(grammarAccess.getCheminAccess().getListeConnaissancesConnaissanceCrossReference_12_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chemin__ListeConnaissancesAssignment_12"


    // $ANTLR start "rule__Chemin__ListeObjetsAssignment_13"
    // InternalGame.g:6518:1: rule__Chemin__ListeObjetsAssignment_13 : ( ( RULE_ID ) ) ;
    public final void rule__Chemin__ListeObjetsAssignment_13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:6522:1: ( ( ( RULE_ID ) ) )
            // InternalGame.g:6523:2: ( ( RULE_ID ) )
            {
            // InternalGame.g:6523:2: ( ( RULE_ID ) )
            // InternalGame.g:6524:3: ( RULE_ID )
            {
             before(grammarAccess.getCheminAccess().getListeObjetsObjetsLieuCrossReference_13_0()); 
            // InternalGame.g:6525:3: ( RULE_ID )
            // InternalGame.g:6526:4: RULE_ID
            {
             before(grammarAccess.getCheminAccess().getListeObjetsObjetsLieuIDTerminalRuleCall_13_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCheminAccess().getListeObjetsObjetsLieuIDTerminalRuleCall_13_0_1()); 

            }

             after(grammarAccess.getCheminAccess().getListeObjetsObjetsLieuCrossReference_13_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chemin__ListeObjetsAssignment_13"


    // $ANTLR start "rule__Chemin__ListeObjetsConsommesAssignment_14"
    // InternalGame.g:6537:1: rule__Chemin__ListeObjetsConsommesAssignment_14 : ( ( RULE_ID ) ) ;
    public final void rule__Chemin__ListeObjetsConsommesAssignment_14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:6541:1: ( ( ( RULE_ID ) ) )
            // InternalGame.g:6542:2: ( ( RULE_ID ) )
            {
            // InternalGame.g:6542:2: ( ( RULE_ID ) )
            // InternalGame.g:6543:3: ( RULE_ID )
            {
             before(grammarAccess.getCheminAccess().getListeObjetsConsommesObjetsExplorateurCrossReference_14_0()); 
            // InternalGame.g:6544:3: ( RULE_ID )
            // InternalGame.g:6545:4: RULE_ID
            {
             before(grammarAccess.getCheminAccess().getListeObjetsConsommesObjetsExplorateurIDTerminalRuleCall_14_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCheminAccess().getListeObjetsConsommesObjetsExplorateurIDTerminalRuleCall_14_0_1()); 

            }

             after(grammarAccess.getCheminAccess().getListeObjetsConsommesObjetsExplorateurCrossReference_14_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chemin__ListeObjetsConsommesAssignment_14"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000F0000218E000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000F0000218E002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000200010L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000040010L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000001840010L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x000000001C000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000040040000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000180040000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000017C00040010L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000008000000010L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000020000800000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x00000E0000800000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0001000000000010L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x000400000C040010L});

}