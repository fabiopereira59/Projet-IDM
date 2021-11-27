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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Game'", "'{'", "'}'", "'explorateur'", "'sac'", "'territoire'", "'lieu'", "'personnes'", "'personne'", "'visible'", "'obligatoire'", "'interaction'", "'texte'", "'choix'", "'objet'", "'connaissances'", "'connaissance'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int RULE_INT=5;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

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


    // $ANTLR start "entryRulegameElement"
    // InternalGame.g:78:1: entryRulegameElement : rulegameElement EOF ;
    public final void entryRulegameElement() throws RecognitionException {
        try {
            // InternalGame.g:79:1: ( rulegameElement EOF )
            // InternalGame.g:80:1: rulegameElement EOF
            {
             before(grammarAccess.getGameElementRule()); 
            pushFollow(FOLLOW_1);
            rulegameElement();

            state._fsp--;

             after(grammarAccess.getGameElementRule()); 
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
    // $ANTLR end "entryRulegameElement"


    // $ANTLR start "rulegameElement"
    // InternalGame.g:87:1: rulegameElement : ( ruleTerritoire ) ;
    public final void rulegameElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:91:2: ( ( ruleTerritoire ) )
            // InternalGame.g:92:2: ( ruleTerritoire )
            {
            // InternalGame.g:92:2: ( ruleTerritoire )
            // InternalGame.g:93:3: ruleTerritoire
            {
             before(grammarAccess.getGameElementAccess().getTerritoireParserRuleCall()); 
            pushFollow(FOLLOW_2);
            ruleTerritoire();

            state._fsp--;

             after(grammarAccess.getGameElementAccess().getTerritoireParserRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulegameElement"


    // $ANTLR start "entryRuleterritoireElement"
    // InternalGame.g:103:1: entryRuleterritoireElement : ruleterritoireElement EOF ;
    public final void entryRuleterritoireElement() throws RecognitionException {
        try {
            // InternalGame.g:104:1: ( ruleterritoireElement EOF )
            // InternalGame.g:105:1: ruleterritoireElement EOF
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
    // InternalGame.g:112:1: ruleterritoireElement : ( ( rule__TerritoireElement__Alternatives ) ) ;
    public final void ruleterritoireElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:116:2: ( ( ( rule__TerritoireElement__Alternatives ) ) )
            // InternalGame.g:117:2: ( ( rule__TerritoireElement__Alternatives ) )
            {
            // InternalGame.g:117:2: ( ( rule__TerritoireElement__Alternatives ) )
            // InternalGame.g:118:3: ( rule__TerritoireElement__Alternatives )
            {
             before(grammarAccess.getTerritoireElementAccess().getAlternatives()); 
            // InternalGame.g:119:3: ( rule__TerritoireElement__Alternatives )
            // InternalGame.g:119:4: rule__TerritoireElement__Alternatives
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
    // InternalGame.g:128:1: entryRuleExplorateur : ruleExplorateur EOF ;
    public final void entryRuleExplorateur() throws RecognitionException {
        try {
            // InternalGame.g:129:1: ( ruleExplorateur EOF )
            // InternalGame.g:130:1: ruleExplorateur EOF
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
    // InternalGame.g:137:1: ruleExplorateur : ( ( rule__Explorateur__Group__0 ) ) ;
    public final void ruleExplorateur() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:141:2: ( ( ( rule__Explorateur__Group__0 ) ) )
            // InternalGame.g:142:2: ( ( rule__Explorateur__Group__0 ) )
            {
            // InternalGame.g:142:2: ( ( rule__Explorateur__Group__0 ) )
            // InternalGame.g:143:3: ( rule__Explorateur__Group__0 )
            {
             before(grammarAccess.getExplorateurAccess().getGroup()); 
            // InternalGame.g:144:3: ( rule__Explorateur__Group__0 )
            // InternalGame.g:144:4: rule__Explorateur__Group__0
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
    // InternalGame.g:153:1: entryRuleSac : ruleSac EOF ;
    public final void entryRuleSac() throws RecognitionException {
        try {
            // InternalGame.g:154:1: ( ruleSac EOF )
            // InternalGame.g:155:1: ruleSac EOF
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
    // InternalGame.g:162:1: ruleSac : ( ( rule__Sac__Group__0 ) ) ;
    public final void ruleSac() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:166:2: ( ( ( rule__Sac__Group__0 ) ) )
            // InternalGame.g:167:2: ( ( rule__Sac__Group__0 ) )
            {
            // InternalGame.g:167:2: ( ( rule__Sac__Group__0 ) )
            // InternalGame.g:168:3: ( rule__Sac__Group__0 )
            {
             before(grammarAccess.getSacAccess().getGroup()); 
            // InternalGame.g:169:3: ( rule__Sac__Group__0 )
            // InternalGame.g:169:4: rule__Sac__Group__0
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


    // $ANTLR start "entryRuleTerritoire"
    // InternalGame.g:178:1: entryRuleTerritoire : ruleTerritoire EOF ;
    public final void entryRuleTerritoire() throws RecognitionException {
        try {
            // InternalGame.g:179:1: ( ruleTerritoire EOF )
            // InternalGame.g:180:1: ruleTerritoire EOF
            {
             before(grammarAccess.getTerritoireRule()); 
            pushFollow(FOLLOW_1);
            ruleTerritoire();

            state._fsp--;

             after(grammarAccess.getTerritoireRule()); 
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
    // $ANTLR end "entryRuleTerritoire"


    // $ANTLR start "ruleTerritoire"
    // InternalGame.g:187:1: ruleTerritoire : ( ( rule__Territoire__Group__0 ) ) ;
    public final void ruleTerritoire() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:191:2: ( ( ( rule__Territoire__Group__0 ) ) )
            // InternalGame.g:192:2: ( ( rule__Territoire__Group__0 ) )
            {
            // InternalGame.g:192:2: ( ( rule__Territoire__Group__0 ) )
            // InternalGame.g:193:3: ( rule__Territoire__Group__0 )
            {
             before(grammarAccess.getTerritoireAccess().getGroup()); 
            // InternalGame.g:194:3: ( rule__Territoire__Group__0 )
            // InternalGame.g:194:4: rule__Territoire__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Territoire__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTerritoireAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTerritoire"


    // $ANTLR start "entryRuleLieu"
    // InternalGame.g:203:1: entryRuleLieu : ruleLieu EOF ;
    public final void entryRuleLieu() throws RecognitionException {
        try {
            // InternalGame.g:204:1: ( ruleLieu EOF )
            // InternalGame.g:205:1: ruleLieu EOF
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
    // InternalGame.g:212:1: ruleLieu : ( ( rule__Lieu__Group__0 ) ) ;
    public final void ruleLieu() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:216:2: ( ( ( rule__Lieu__Group__0 ) ) )
            // InternalGame.g:217:2: ( ( rule__Lieu__Group__0 ) )
            {
            // InternalGame.g:217:2: ( ( rule__Lieu__Group__0 ) )
            // InternalGame.g:218:3: ( rule__Lieu__Group__0 )
            {
             before(grammarAccess.getLieuAccess().getGroup()); 
            // InternalGame.g:219:3: ( rule__Lieu__Group__0 )
            // InternalGame.g:219:4: rule__Lieu__Group__0
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
    // InternalGame.g:228:1: entryRulePersonnes : rulePersonnes EOF ;
    public final void entryRulePersonnes() throws RecognitionException {
        try {
            // InternalGame.g:229:1: ( rulePersonnes EOF )
            // InternalGame.g:230:1: rulePersonnes EOF
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
    // InternalGame.g:237:1: rulePersonnes : ( ( rule__Personnes__Group__0 ) ) ;
    public final void rulePersonnes() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:241:2: ( ( ( rule__Personnes__Group__0 ) ) )
            // InternalGame.g:242:2: ( ( rule__Personnes__Group__0 ) )
            {
            // InternalGame.g:242:2: ( ( rule__Personnes__Group__0 ) )
            // InternalGame.g:243:3: ( rule__Personnes__Group__0 )
            {
             before(grammarAccess.getPersonnesAccess().getGroup()); 
            // InternalGame.g:244:3: ( rule__Personnes__Group__0 )
            // InternalGame.g:244:4: rule__Personnes__Group__0
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
    // InternalGame.g:253:1: entryRulePersonne : rulePersonne EOF ;
    public final void entryRulePersonne() throws RecognitionException {
        try {
            // InternalGame.g:254:1: ( rulePersonne EOF )
            // InternalGame.g:255:1: rulePersonne EOF
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
    // InternalGame.g:262:1: rulePersonne : ( ( rule__Personne__Group__0 ) ) ;
    public final void rulePersonne() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:266:2: ( ( ( rule__Personne__Group__0 ) ) )
            // InternalGame.g:267:2: ( ( rule__Personne__Group__0 ) )
            {
            // InternalGame.g:267:2: ( ( rule__Personne__Group__0 ) )
            // InternalGame.g:268:3: ( rule__Personne__Group__0 )
            {
             before(grammarAccess.getPersonneAccess().getGroup()); 
            // InternalGame.g:269:3: ( rule__Personne__Group__0 )
            // InternalGame.g:269:4: rule__Personne__Group__0
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
    // InternalGame.g:278:1: entryRuleInteraction : ruleInteraction EOF ;
    public final void entryRuleInteraction() throws RecognitionException {
        try {
            // InternalGame.g:279:1: ( ruleInteraction EOF )
            // InternalGame.g:280:1: ruleInteraction EOF
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
    // InternalGame.g:287:1: ruleInteraction : ( ( rule__Interaction__Group__0 ) ) ;
    public final void ruleInteraction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:291:2: ( ( ( rule__Interaction__Group__0 ) ) )
            // InternalGame.g:292:2: ( ( rule__Interaction__Group__0 ) )
            {
            // InternalGame.g:292:2: ( ( rule__Interaction__Group__0 ) )
            // InternalGame.g:293:3: ( rule__Interaction__Group__0 )
            {
             before(grammarAccess.getInteractionAccess().getGroup()); 
            // InternalGame.g:294:3: ( rule__Interaction__Group__0 )
            // InternalGame.g:294:4: rule__Interaction__Group__0
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
    // InternalGame.g:303:1: entryRuleChoix : ruleChoix EOF ;
    public final void entryRuleChoix() throws RecognitionException {
        try {
            // InternalGame.g:304:1: ( ruleChoix EOF )
            // InternalGame.g:305:1: ruleChoix EOF
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
    // InternalGame.g:312:1: ruleChoix : ( ( rule__Choix__Group__0 ) ) ;
    public final void ruleChoix() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:316:2: ( ( ( rule__Choix__Group__0 ) ) )
            // InternalGame.g:317:2: ( ( rule__Choix__Group__0 ) )
            {
            // InternalGame.g:317:2: ( ( rule__Choix__Group__0 ) )
            // InternalGame.g:318:3: ( rule__Choix__Group__0 )
            {
             before(grammarAccess.getChoixAccess().getGroup()); 
            // InternalGame.g:319:3: ( rule__Choix__Group__0 )
            // InternalGame.g:319:4: rule__Choix__Group__0
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


    // $ANTLR start "entryRuleObjet"
    // InternalGame.g:328:1: entryRuleObjet : ruleObjet EOF ;
    public final void entryRuleObjet() throws RecognitionException {
        try {
            // InternalGame.g:329:1: ( ruleObjet EOF )
            // InternalGame.g:330:1: ruleObjet EOF
            {
             before(grammarAccess.getObjetRule()); 
            pushFollow(FOLLOW_1);
            ruleObjet();

            state._fsp--;

             after(grammarAccess.getObjetRule()); 
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
    // $ANTLR end "entryRuleObjet"


    // $ANTLR start "ruleObjet"
    // InternalGame.g:337:1: ruleObjet : ( ( rule__Objet__Group__0 ) ) ;
    public final void ruleObjet() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:341:2: ( ( ( rule__Objet__Group__0 ) ) )
            // InternalGame.g:342:2: ( ( rule__Objet__Group__0 ) )
            {
            // InternalGame.g:342:2: ( ( rule__Objet__Group__0 ) )
            // InternalGame.g:343:3: ( rule__Objet__Group__0 )
            {
             before(grammarAccess.getObjetAccess().getGroup()); 
            // InternalGame.g:344:3: ( rule__Objet__Group__0 )
            // InternalGame.g:344:4: rule__Objet__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Objet__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getObjetAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleObjet"


    // $ANTLR start "entryRuleConnaissances"
    // InternalGame.g:353:1: entryRuleConnaissances : ruleConnaissances EOF ;
    public final void entryRuleConnaissances() throws RecognitionException {
        try {
            // InternalGame.g:354:1: ( ruleConnaissances EOF )
            // InternalGame.g:355:1: ruleConnaissances EOF
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
    // InternalGame.g:362:1: ruleConnaissances : ( ( rule__Connaissances__Group__0 ) ) ;
    public final void ruleConnaissances() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:366:2: ( ( ( rule__Connaissances__Group__0 ) ) )
            // InternalGame.g:367:2: ( ( rule__Connaissances__Group__0 ) )
            {
            // InternalGame.g:367:2: ( ( rule__Connaissances__Group__0 ) )
            // InternalGame.g:368:3: ( rule__Connaissances__Group__0 )
            {
             before(grammarAccess.getConnaissancesAccess().getGroup()); 
            // InternalGame.g:369:3: ( rule__Connaissances__Group__0 )
            // InternalGame.g:369:4: rule__Connaissances__Group__0
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
    // InternalGame.g:378:1: entryRuleConnaissance : ruleConnaissance EOF ;
    public final void entryRuleConnaissance() throws RecognitionException {
        try {
            // InternalGame.g:379:1: ( ruleConnaissance EOF )
            // InternalGame.g:380:1: ruleConnaissance EOF
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
    // InternalGame.g:387:1: ruleConnaissance : ( ( rule__Connaissance__Group__0 ) ) ;
    public final void ruleConnaissance() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:391:2: ( ( ( rule__Connaissance__Group__0 ) ) )
            // InternalGame.g:392:2: ( ( rule__Connaissance__Group__0 ) )
            {
            // InternalGame.g:392:2: ( ( rule__Connaissance__Group__0 ) )
            // InternalGame.g:393:3: ( rule__Connaissance__Group__0 )
            {
             before(grammarAccess.getConnaissanceAccess().getGroup()); 
            // InternalGame.g:394:3: ( rule__Connaissance__Group__0 )
            // InternalGame.g:394:4: rule__Connaissance__Group__0
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


    // $ANTLR start "rule__TerritoireElement__Alternatives"
    // InternalGame.g:402:1: rule__TerritoireElement__Alternatives : ( ( ruleExplorateur ) | ( ruleLieu ) );
    public final void rule__TerritoireElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:406:1: ( ( ruleExplorateur ) | ( ruleLieu ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==14) ) {
                alt1=1;
            }
            else if ( (LA1_0==17) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalGame.g:407:2: ( ruleExplorateur )
                    {
                    // InternalGame.g:407:2: ( ruleExplorateur )
                    // InternalGame.g:408:3: ruleExplorateur
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
                    // InternalGame.g:413:2: ( ruleLieu )
                    {
                    // InternalGame.g:413:2: ( ruleLieu )
                    // InternalGame.g:414:3: ruleLieu
                    {
                     before(grammarAccess.getTerritoireElementAccess().getLieuParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleLieu();

                    state._fsp--;

                     after(grammarAccess.getTerritoireElementAccess().getLieuParserRuleCall_1()); 

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


    // $ANTLR start "rule__Game__Group__0"
    // InternalGame.g:423:1: rule__Game__Group__0 : rule__Game__Group__0__Impl rule__Game__Group__1 ;
    public final void rule__Game__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:427:1: ( rule__Game__Group__0__Impl rule__Game__Group__1 )
            // InternalGame.g:428:2: rule__Game__Group__0__Impl rule__Game__Group__1
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
    // InternalGame.g:435:1: rule__Game__Group__0__Impl : ( 'Game' ) ;
    public final void rule__Game__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:439:1: ( ( 'Game' ) )
            // InternalGame.g:440:1: ( 'Game' )
            {
            // InternalGame.g:440:1: ( 'Game' )
            // InternalGame.g:441:2: 'Game'
            {
             before(grammarAccess.getGameAccess().getGameKeyword_0()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getGameAccess().getGameKeyword_0()); 

            }


            }

        }
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
    // InternalGame.g:450:1: rule__Game__Group__1 : rule__Game__Group__1__Impl rule__Game__Group__2 ;
    public final void rule__Game__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:454:1: ( rule__Game__Group__1__Impl rule__Game__Group__2 )
            // InternalGame.g:455:2: rule__Game__Group__1__Impl rule__Game__Group__2
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
    // InternalGame.g:462:1: rule__Game__Group__1__Impl : ( ( rule__Game__NameAssignment_1 ) ) ;
    public final void rule__Game__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:466:1: ( ( ( rule__Game__NameAssignment_1 ) ) )
            // InternalGame.g:467:1: ( ( rule__Game__NameAssignment_1 ) )
            {
            // InternalGame.g:467:1: ( ( rule__Game__NameAssignment_1 ) )
            // InternalGame.g:468:2: ( rule__Game__NameAssignment_1 )
            {
             before(grammarAccess.getGameAccess().getNameAssignment_1()); 
            // InternalGame.g:469:2: ( rule__Game__NameAssignment_1 )
            // InternalGame.g:469:3: rule__Game__NameAssignment_1
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
    // InternalGame.g:477:1: rule__Game__Group__2 : rule__Game__Group__2__Impl rule__Game__Group__3 ;
    public final void rule__Game__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:481:1: ( rule__Game__Group__2__Impl rule__Game__Group__3 )
            // InternalGame.g:482:2: rule__Game__Group__2__Impl rule__Game__Group__3
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
    // InternalGame.g:489:1: rule__Game__Group__2__Impl : ( '{' ) ;
    public final void rule__Game__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:493:1: ( ( '{' ) )
            // InternalGame.g:494:1: ( '{' )
            {
            // InternalGame.g:494:1: ( '{' )
            // InternalGame.g:495:2: '{'
            {
             before(grammarAccess.getGameAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_2); 
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
    // InternalGame.g:504:1: rule__Game__Group__3 : rule__Game__Group__3__Impl rule__Game__Group__4 ;
    public final void rule__Game__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:508:1: ( rule__Game__Group__3__Impl rule__Game__Group__4 )
            // InternalGame.g:509:2: rule__Game__Group__3__Impl rule__Game__Group__4
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
    // InternalGame.g:516:1: rule__Game__Group__3__Impl : ( ( rule__Game__GameElementsAssignment_3 ) ) ;
    public final void rule__Game__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:520:1: ( ( ( rule__Game__GameElementsAssignment_3 ) ) )
            // InternalGame.g:521:1: ( ( rule__Game__GameElementsAssignment_3 ) )
            {
            // InternalGame.g:521:1: ( ( rule__Game__GameElementsAssignment_3 ) )
            // InternalGame.g:522:2: ( rule__Game__GameElementsAssignment_3 )
            {
             before(grammarAccess.getGameAccess().getGameElementsAssignment_3()); 
            // InternalGame.g:523:2: ( rule__Game__GameElementsAssignment_3 )
            // InternalGame.g:523:3: rule__Game__GameElementsAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Game__GameElementsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getGameAccess().getGameElementsAssignment_3()); 

            }


            }

        }
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
    // InternalGame.g:531:1: rule__Game__Group__4 : rule__Game__Group__4__Impl ;
    public final void rule__Game__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:535:1: ( rule__Game__Group__4__Impl )
            // InternalGame.g:536:2: rule__Game__Group__4__Impl
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
    // InternalGame.g:542:1: rule__Game__Group__4__Impl : ( '}' ) ;
    public final void rule__Game__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:546:1: ( ( '}' ) )
            // InternalGame.g:547:1: ( '}' )
            {
            // InternalGame.g:547:1: ( '}' )
            // InternalGame.g:548:2: '}'
            {
             before(grammarAccess.getGameAccess().getRightCurlyBracketKeyword_4()); 
            match(input,13,FOLLOW_2); 
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
    // InternalGame.g:558:1: rule__Explorateur__Group__0 : rule__Explorateur__Group__0__Impl rule__Explorateur__Group__1 ;
    public final void rule__Explorateur__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:562:1: ( rule__Explorateur__Group__0__Impl rule__Explorateur__Group__1 )
            // InternalGame.g:563:2: rule__Explorateur__Group__0__Impl rule__Explorateur__Group__1
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
    // InternalGame.g:570:1: rule__Explorateur__Group__0__Impl : ( 'explorateur' ) ;
    public final void rule__Explorateur__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:574:1: ( ( 'explorateur' ) )
            // InternalGame.g:575:1: ( 'explorateur' )
            {
            // InternalGame.g:575:1: ( 'explorateur' )
            // InternalGame.g:576:2: 'explorateur'
            {
             before(grammarAccess.getExplorateurAccess().getExplorateurKeyword_0()); 
            match(input,14,FOLLOW_2); 
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
    // InternalGame.g:585:1: rule__Explorateur__Group__1 : rule__Explorateur__Group__1__Impl rule__Explorateur__Group__2 ;
    public final void rule__Explorateur__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:589:1: ( rule__Explorateur__Group__1__Impl rule__Explorateur__Group__2 )
            // InternalGame.g:590:2: rule__Explorateur__Group__1__Impl rule__Explorateur__Group__2
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
    // InternalGame.g:597:1: rule__Explorateur__Group__1__Impl : ( ( rule__Explorateur__NameAssignment_1 ) ) ;
    public final void rule__Explorateur__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:601:1: ( ( ( rule__Explorateur__NameAssignment_1 ) ) )
            // InternalGame.g:602:1: ( ( rule__Explorateur__NameAssignment_1 ) )
            {
            // InternalGame.g:602:1: ( ( rule__Explorateur__NameAssignment_1 ) )
            // InternalGame.g:603:2: ( rule__Explorateur__NameAssignment_1 )
            {
             before(grammarAccess.getExplorateurAccess().getNameAssignment_1()); 
            // InternalGame.g:604:2: ( rule__Explorateur__NameAssignment_1 )
            // InternalGame.g:604:3: rule__Explorateur__NameAssignment_1
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
    // InternalGame.g:612:1: rule__Explorateur__Group__2 : rule__Explorateur__Group__2__Impl rule__Explorateur__Group__3 ;
    public final void rule__Explorateur__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:616:1: ( rule__Explorateur__Group__2__Impl rule__Explorateur__Group__3 )
            // InternalGame.g:617:2: rule__Explorateur__Group__2__Impl rule__Explorateur__Group__3
            {
            pushFollow(FOLLOW_7);
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
    // InternalGame.g:624:1: rule__Explorateur__Group__2__Impl : ( '{' ) ;
    public final void rule__Explorateur__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:628:1: ( ( '{' ) )
            // InternalGame.g:629:1: ( '{' )
            {
            // InternalGame.g:629:1: ( '{' )
            // InternalGame.g:630:2: '{'
            {
             before(grammarAccess.getExplorateurAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_2); 
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
    // InternalGame.g:639:1: rule__Explorateur__Group__3 : rule__Explorateur__Group__3__Impl rule__Explorateur__Group__4 ;
    public final void rule__Explorateur__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:643:1: ( rule__Explorateur__Group__3__Impl rule__Explorateur__Group__4 )
            // InternalGame.g:644:2: rule__Explorateur__Group__3__Impl rule__Explorateur__Group__4
            {
            pushFollow(FOLLOW_8);
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
    // InternalGame.g:651:1: rule__Explorateur__Group__3__Impl : ( ( rule__Explorateur__ExplorateurElementsAssignment_3 ) ) ;
    public final void rule__Explorateur__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:655:1: ( ( ( rule__Explorateur__ExplorateurElementsAssignment_3 ) ) )
            // InternalGame.g:656:1: ( ( rule__Explorateur__ExplorateurElementsAssignment_3 ) )
            {
            // InternalGame.g:656:1: ( ( rule__Explorateur__ExplorateurElementsAssignment_3 ) )
            // InternalGame.g:657:2: ( rule__Explorateur__ExplorateurElementsAssignment_3 )
            {
             before(grammarAccess.getExplorateurAccess().getExplorateurElementsAssignment_3()); 
            // InternalGame.g:658:2: ( rule__Explorateur__ExplorateurElementsAssignment_3 )
            // InternalGame.g:658:3: rule__Explorateur__ExplorateurElementsAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Explorateur__ExplorateurElementsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getExplorateurAccess().getExplorateurElementsAssignment_3()); 

            }


            }

        }
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
    // InternalGame.g:666:1: rule__Explorateur__Group__4 : rule__Explorateur__Group__4__Impl rule__Explorateur__Group__5 ;
    public final void rule__Explorateur__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:670:1: ( rule__Explorateur__Group__4__Impl rule__Explorateur__Group__5 )
            // InternalGame.g:671:2: rule__Explorateur__Group__4__Impl rule__Explorateur__Group__5
            {
            pushFollow(FOLLOW_9);
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
    // InternalGame.g:678:1: rule__Explorateur__Group__4__Impl : ( ( rule__Explorateur__ExplorateurElementsAssignment_4 ) ) ;
    public final void rule__Explorateur__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:682:1: ( ( ( rule__Explorateur__ExplorateurElementsAssignment_4 ) ) )
            // InternalGame.g:683:1: ( ( rule__Explorateur__ExplorateurElementsAssignment_4 ) )
            {
            // InternalGame.g:683:1: ( ( rule__Explorateur__ExplorateurElementsAssignment_4 ) )
            // InternalGame.g:684:2: ( rule__Explorateur__ExplorateurElementsAssignment_4 )
            {
             before(grammarAccess.getExplorateurAccess().getExplorateurElementsAssignment_4()); 
            // InternalGame.g:685:2: ( rule__Explorateur__ExplorateurElementsAssignment_4 )
            // InternalGame.g:685:3: rule__Explorateur__ExplorateurElementsAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Explorateur__ExplorateurElementsAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getExplorateurAccess().getExplorateurElementsAssignment_4()); 

            }


            }

        }
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
    // InternalGame.g:693:1: rule__Explorateur__Group__5 : rule__Explorateur__Group__5__Impl rule__Explorateur__Group__6 ;
    public final void rule__Explorateur__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:697:1: ( rule__Explorateur__Group__5__Impl rule__Explorateur__Group__6 )
            // InternalGame.g:698:2: rule__Explorateur__Group__5__Impl rule__Explorateur__Group__6
            {
            pushFollow(FOLLOW_9);
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
    // InternalGame.g:705:1: rule__Explorateur__Group__5__Impl : ( ( rule__Explorateur__ExplorateurElementsAssignment_5 )? ) ;
    public final void rule__Explorateur__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:709:1: ( ( ( rule__Explorateur__ExplorateurElementsAssignment_5 )? ) )
            // InternalGame.g:710:1: ( ( rule__Explorateur__ExplorateurElementsAssignment_5 )? )
            {
            // InternalGame.g:710:1: ( ( rule__Explorateur__ExplorateurElementsAssignment_5 )? )
            // InternalGame.g:711:2: ( rule__Explorateur__ExplorateurElementsAssignment_5 )?
            {
             before(grammarAccess.getExplorateurAccess().getExplorateurElementsAssignment_5()); 
            // InternalGame.g:712:2: ( rule__Explorateur__ExplorateurElementsAssignment_5 )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==17) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalGame.g:712:3: rule__Explorateur__ExplorateurElementsAssignment_5
                    {
                    pushFollow(FOLLOW_2);
                    rule__Explorateur__ExplorateurElementsAssignment_5();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getExplorateurAccess().getExplorateurElementsAssignment_5()); 

            }


            }

        }
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
    // InternalGame.g:720:1: rule__Explorateur__Group__6 : rule__Explorateur__Group__6__Impl ;
    public final void rule__Explorateur__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:724:1: ( rule__Explorateur__Group__6__Impl )
            // InternalGame.g:725:2: rule__Explorateur__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Explorateur__Group__6__Impl();

            state._fsp--;


            }

        }
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
    // InternalGame.g:731:1: rule__Explorateur__Group__6__Impl : ( '}' ) ;
    public final void rule__Explorateur__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:735:1: ( ( '}' ) )
            // InternalGame.g:736:1: ( '}' )
            {
            // InternalGame.g:736:1: ( '}' )
            // InternalGame.g:737:2: '}'
            {
             before(grammarAccess.getExplorateurAccess().getRightCurlyBracketKeyword_6()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getExplorateurAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
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


    // $ANTLR start "rule__Sac__Group__0"
    // InternalGame.g:747:1: rule__Sac__Group__0 : rule__Sac__Group__0__Impl rule__Sac__Group__1 ;
    public final void rule__Sac__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:751:1: ( rule__Sac__Group__0__Impl rule__Sac__Group__1 )
            // InternalGame.g:752:2: rule__Sac__Group__0__Impl rule__Sac__Group__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalGame.g:759:1: rule__Sac__Group__0__Impl : ( 'sac' ) ;
    public final void rule__Sac__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:763:1: ( ( 'sac' ) )
            // InternalGame.g:764:1: ( 'sac' )
            {
            // InternalGame.g:764:1: ( 'sac' )
            // InternalGame.g:765:2: 'sac'
            {
             before(grammarAccess.getSacAccess().getSacKeyword_0()); 
            match(input,15,FOLLOW_2); 
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
    // InternalGame.g:774:1: rule__Sac__Group__1 : rule__Sac__Group__1__Impl rule__Sac__Group__2 ;
    public final void rule__Sac__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:778:1: ( rule__Sac__Group__1__Impl rule__Sac__Group__2 )
            // InternalGame.g:779:2: rule__Sac__Group__1__Impl rule__Sac__Group__2
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
    // InternalGame.g:786:1: rule__Sac__Group__1__Impl : ( ( rule__Sac__TailleAssignment_1 ) ) ;
    public final void rule__Sac__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:790:1: ( ( ( rule__Sac__TailleAssignment_1 ) ) )
            // InternalGame.g:791:1: ( ( rule__Sac__TailleAssignment_1 ) )
            {
            // InternalGame.g:791:1: ( ( rule__Sac__TailleAssignment_1 ) )
            // InternalGame.g:792:2: ( rule__Sac__TailleAssignment_1 )
            {
             before(grammarAccess.getSacAccess().getTailleAssignment_1()); 
            // InternalGame.g:793:2: ( rule__Sac__TailleAssignment_1 )
            // InternalGame.g:793:3: rule__Sac__TailleAssignment_1
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
    // InternalGame.g:801:1: rule__Sac__Group__2 : rule__Sac__Group__2__Impl rule__Sac__Group__3 ;
    public final void rule__Sac__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:805:1: ( rule__Sac__Group__2__Impl rule__Sac__Group__3 )
            // InternalGame.g:806:2: rule__Sac__Group__2__Impl rule__Sac__Group__3
            {
            pushFollow(FOLLOW_11);
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
    // InternalGame.g:813:1: rule__Sac__Group__2__Impl : ( '{' ) ;
    public final void rule__Sac__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:817:1: ( ( '{' ) )
            // InternalGame.g:818:1: ( '{' )
            {
            // InternalGame.g:818:1: ( '{' )
            // InternalGame.g:819:2: '{'
            {
             before(grammarAccess.getSacAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_2); 
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
    // InternalGame.g:828:1: rule__Sac__Group__3 : rule__Sac__Group__3__Impl rule__Sac__Group__4 ;
    public final void rule__Sac__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:832:1: ( rule__Sac__Group__3__Impl rule__Sac__Group__4 )
            // InternalGame.g:833:2: rule__Sac__Group__3__Impl rule__Sac__Group__4
            {
            pushFollow(FOLLOW_11);
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
    // InternalGame.g:840:1: rule__Sac__Group__3__Impl : ( ( rule__Sac__SacElementsAssignment_3 )* ) ;
    public final void rule__Sac__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:844:1: ( ( ( rule__Sac__SacElementsAssignment_3 )* ) )
            // InternalGame.g:845:1: ( ( rule__Sac__SacElementsAssignment_3 )* )
            {
            // InternalGame.g:845:1: ( ( rule__Sac__SacElementsAssignment_3 )* )
            // InternalGame.g:846:2: ( rule__Sac__SacElementsAssignment_3 )*
            {
             before(grammarAccess.getSacAccess().getSacElementsAssignment_3()); 
            // InternalGame.g:847:2: ( rule__Sac__SacElementsAssignment_3 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==25) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalGame.g:847:3: rule__Sac__SacElementsAssignment_3
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__Sac__SacElementsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
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
    // InternalGame.g:855:1: rule__Sac__Group__4 : rule__Sac__Group__4__Impl ;
    public final void rule__Sac__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:859:1: ( rule__Sac__Group__4__Impl )
            // InternalGame.g:860:2: rule__Sac__Group__4__Impl
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
    // InternalGame.g:866:1: rule__Sac__Group__4__Impl : ( '}' ) ;
    public final void rule__Sac__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:870:1: ( ( '}' ) )
            // InternalGame.g:871:1: ( '}' )
            {
            // InternalGame.g:871:1: ( '}' )
            // InternalGame.g:872:2: '}'
            {
             before(grammarAccess.getSacAccess().getRightCurlyBracketKeyword_4()); 
            match(input,13,FOLLOW_2); 
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


    // $ANTLR start "rule__Territoire__Group__0"
    // InternalGame.g:882:1: rule__Territoire__Group__0 : rule__Territoire__Group__0__Impl rule__Territoire__Group__1 ;
    public final void rule__Territoire__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:886:1: ( rule__Territoire__Group__0__Impl rule__Territoire__Group__1 )
            // InternalGame.g:887:2: rule__Territoire__Group__0__Impl rule__Territoire__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Territoire__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Territoire__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Territoire__Group__0"


    // $ANTLR start "rule__Territoire__Group__0__Impl"
    // InternalGame.g:894:1: rule__Territoire__Group__0__Impl : ( 'territoire' ) ;
    public final void rule__Territoire__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:898:1: ( ( 'territoire' ) )
            // InternalGame.g:899:1: ( 'territoire' )
            {
            // InternalGame.g:899:1: ( 'territoire' )
            // InternalGame.g:900:2: 'territoire'
            {
             before(grammarAccess.getTerritoireAccess().getTerritoireKeyword_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getTerritoireAccess().getTerritoireKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Territoire__Group__0__Impl"


    // $ANTLR start "rule__Territoire__Group__1"
    // InternalGame.g:909:1: rule__Territoire__Group__1 : rule__Territoire__Group__1__Impl rule__Territoire__Group__2 ;
    public final void rule__Territoire__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:913:1: ( rule__Territoire__Group__1__Impl rule__Territoire__Group__2 )
            // InternalGame.g:914:2: rule__Territoire__Group__1__Impl rule__Territoire__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Territoire__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Territoire__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Territoire__Group__1"


    // $ANTLR start "rule__Territoire__Group__1__Impl"
    // InternalGame.g:921:1: rule__Territoire__Group__1__Impl : ( ( rule__Territoire__NameAssignment_1 ) ) ;
    public final void rule__Territoire__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:925:1: ( ( ( rule__Territoire__NameAssignment_1 ) ) )
            // InternalGame.g:926:1: ( ( rule__Territoire__NameAssignment_1 ) )
            {
            // InternalGame.g:926:1: ( ( rule__Territoire__NameAssignment_1 ) )
            // InternalGame.g:927:2: ( rule__Territoire__NameAssignment_1 )
            {
             before(grammarAccess.getTerritoireAccess().getNameAssignment_1()); 
            // InternalGame.g:928:2: ( rule__Territoire__NameAssignment_1 )
            // InternalGame.g:928:3: rule__Territoire__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Territoire__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTerritoireAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Territoire__Group__1__Impl"


    // $ANTLR start "rule__Territoire__Group__2"
    // InternalGame.g:936:1: rule__Territoire__Group__2 : rule__Territoire__Group__2__Impl rule__Territoire__Group__3 ;
    public final void rule__Territoire__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:940:1: ( rule__Territoire__Group__2__Impl rule__Territoire__Group__3 )
            // InternalGame.g:941:2: rule__Territoire__Group__2__Impl rule__Territoire__Group__3
            {
            pushFollow(FOLLOW_13);
            rule__Territoire__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Territoire__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Territoire__Group__2"


    // $ANTLR start "rule__Territoire__Group__2__Impl"
    // InternalGame.g:948:1: rule__Territoire__Group__2__Impl : ( '{' ) ;
    public final void rule__Territoire__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:952:1: ( ( '{' ) )
            // InternalGame.g:953:1: ( '{' )
            {
            // InternalGame.g:953:1: ( '{' )
            // InternalGame.g:954:2: '{'
            {
             before(grammarAccess.getTerritoireAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getTerritoireAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Territoire__Group__2__Impl"


    // $ANTLR start "rule__Territoire__Group__3"
    // InternalGame.g:963:1: rule__Territoire__Group__3 : rule__Territoire__Group__3__Impl rule__Territoire__Group__4 ;
    public final void rule__Territoire__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:967:1: ( rule__Territoire__Group__3__Impl rule__Territoire__Group__4 )
            // InternalGame.g:968:2: rule__Territoire__Group__3__Impl rule__Territoire__Group__4
            {
            pushFollow(FOLLOW_13);
            rule__Territoire__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Territoire__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Territoire__Group__3"


    // $ANTLR start "rule__Territoire__Group__3__Impl"
    // InternalGame.g:975:1: rule__Territoire__Group__3__Impl : ( ( rule__Territoire__TerritoireElementsAssignment_3 )* ) ;
    public final void rule__Territoire__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:979:1: ( ( ( rule__Territoire__TerritoireElementsAssignment_3 )* ) )
            // InternalGame.g:980:1: ( ( rule__Territoire__TerritoireElementsAssignment_3 )* )
            {
            // InternalGame.g:980:1: ( ( rule__Territoire__TerritoireElementsAssignment_3 )* )
            // InternalGame.g:981:2: ( rule__Territoire__TerritoireElementsAssignment_3 )*
            {
             before(grammarAccess.getTerritoireAccess().getTerritoireElementsAssignment_3()); 
            // InternalGame.g:982:2: ( rule__Territoire__TerritoireElementsAssignment_3 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==14||LA4_0==17) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalGame.g:982:3: rule__Territoire__TerritoireElementsAssignment_3
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__Territoire__TerritoireElementsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getTerritoireAccess().getTerritoireElementsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Territoire__Group__3__Impl"


    // $ANTLR start "rule__Territoire__Group__4"
    // InternalGame.g:990:1: rule__Territoire__Group__4 : rule__Territoire__Group__4__Impl ;
    public final void rule__Territoire__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:994:1: ( rule__Territoire__Group__4__Impl )
            // InternalGame.g:995:2: rule__Territoire__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Territoire__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Territoire__Group__4"


    // $ANTLR start "rule__Territoire__Group__4__Impl"
    // InternalGame.g:1001:1: rule__Territoire__Group__4__Impl : ( '}' ) ;
    public final void rule__Territoire__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1005:1: ( ( '}' ) )
            // InternalGame.g:1006:1: ( '}' )
            {
            // InternalGame.g:1006:1: ( '}' )
            // InternalGame.g:1007:2: '}'
            {
             before(grammarAccess.getTerritoireAccess().getRightCurlyBracketKeyword_4()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getTerritoireAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Territoire__Group__4__Impl"


    // $ANTLR start "rule__Lieu__Group__0"
    // InternalGame.g:1017:1: rule__Lieu__Group__0 : rule__Lieu__Group__0__Impl rule__Lieu__Group__1 ;
    public final void rule__Lieu__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1021:1: ( rule__Lieu__Group__0__Impl rule__Lieu__Group__1 )
            // InternalGame.g:1022:2: rule__Lieu__Group__0__Impl rule__Lieu__Group__1
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
    // InternalGame.g:1029:1: rule__Lieu__Group__0__Impl : ( 'lieu' ) ;
    public final void rule__Lieu__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1033:1: ( ( 'lieu' ) )
            // InternalGame.g:1034:1: ( 'lieu' )
            {
            // InternalGame.g:1034:1: ( 'lieu' )
            // InternalGame.g:1035:2: 'lieu'
            {
             before(grammarAccess.getLieuAccess().getLieuKeyword_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getLieuAccess().getLieuKeyword_0()); 

            }


            }

        }
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
    // InternalGame.g:1044:1: rule__Lieu__Group__1 : rule__Lieu__Group__1__Impl rule__Lieu__Group__2 ;
    public final void rule__Lieu__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1048:1: ( rule__Lieu__Group__1__Impl rule__Lieu__Group__2 )
            // InternalGame.g:1049:2: rule__Lieu__Group__1__Impl rule__Lieu__Group__2
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
    // InternalGame.g:1056:1: rule__Lieu__Group__1__Impl : ( ( rule__Lieu__NameAssignment_1 ) ) ;
    public final void rule__Lieu__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1060:1: ( ( ( rule__Lieu__NameAssignment_1 ) ) )
            // InternalGame.g:1061:1: ( ( rule__Lieu__NameAssignment_1 ) )
            {
            // InternalGame.g:1061:1: ( ( rule__Lieu__NameAssignment_1 ) )
            // InternalGame.g:1062:2: ( rule__Lieu__NameAssignment_1 )
            {
             before(grammarAccess.getLieuAccess().getNameAssignment_1()); 
            // InternalGame.g:1063:2: ( rule__Lieu__NameAssignment_1 )
            // InternalGame.g:1063:3: rule__Lieu__NameAssignment_1
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
    // InternalGame.g:1071:1: rule__Lieu__Group__2 : rule__Lieu__Group__2__Impl rule__Lieu__Group__3 ;
    public final void rule__Lieu__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1075:1: ( rule__Lieu__Group__2__Impl rule__Lieu__Group__3 )
            // InternalGame.g:1076:2: rule__Lieu__Group__2__Impl rule__Lieu__Group__3
            {
            pushFollow(FOLLOW_15);
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
    // InternalGame.g:1083:1: rule__Lieu__Group__2__Impl : ( '{' ) ;
    public final void rule__Lieu__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1087:1: ( ( '{' ) )
            // InternalGame.g:1088:1: ( '{' )
            {
            // InternalGame.g:1088:1: ( '{' )
            // InternalGame.g:1089:2: '{'
            {
             before(grammarAccess.getLieuAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_2); 
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
    // InternalGame.g:1098:1: rule__Lieu__Group__3 : rule__Lieu__Group__3__Impl rule__Lieu__Group__4 ;
    public final void rule__Lieu__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1102:1: ( rule__Lieu__Group__3__Impl rule__Lieu__Group__4 )
            // InternalGame.g:1103:2: rule__Lieu__Group__3__Impl rule__Lieu__Group__4
            {
            pushFollow(FOLLOW_6);
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
    // InternalGame.g:1110:1: rule__Lieu__Group__3__Impl : ( ( rule__Lieu__LieuElementsAssignment_3 ) ) ;
    public final void rule__Lieu__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1114:1: ( ( ( rule__Lieu__LieuElementsAssignment_3 ) ) )
            // InternalGame.g:1115:1: ( ( rule__Lieu__LieuElementsAssignment_3 ) )
            {
            // InternalGame.g:1115:1: ( ( rule__Lieu__LieuElementsAssignment_3 ) )
            // InternalGame.g:1116:2: ( rule__Lieu__LieuElementsAssignment_3 )
            {
             before(grammarAccess.getLieuAccess().getLieuElementsAssignment_3()); 
            // InternalGame.g:1117:2: ( rule__Lieu__LieuElementsAssignment_3 )
            // InternalGame.g:1117:3: rule__Lieu__LieuElementsAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Lieu__LieuElementsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getLieuAccess().getLieuElementsAssignment_3()); 

            }


            }

        }
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
    // InternalGame.g:1125:1: rule__Lieu__Group__4 : rule__Lieu__Group__4__Impl ;
    public final void rule__Lieu__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1129:1: ( rule__Lieu__Group__4__Impl )
            // InternalGame.g:1130:2: rule__Lieu__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Lieu__Group__4__Impl();

            state._fsp--;


            }

        }
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
    // InternalGame.g:1136:1: rule__Lieu__Group__4__Impl : ( '}' ) ;
    public final void rule__Lieu__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1140:1: ( ( '}' ) )
            // InternalGame.g:1141:1: ( '}' )
            {
            // InternalGame.g:1141:1: ( '}' )
            // InternalGame.g:1142:2: '}'
            {
             before(grammarAccess.getLieuAccess().getRightCurlyBracketKeyword_4()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getLieuAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
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


    // $ANTLR start "rule__Personnes__Group__0"
    // InternalGame.g:1152:1: rule__Personnes__Group__0 : rule__Personnes__Group__0__Impl rule__Personnes__Group__1 ;
    public final void rule__Personnes__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1156:1: ( rule__Personnes__Group__0__Impl rule__Personnes__Group__1 )
            // InternalGame.g:1157:2: rule__Personnes__Group__0__Impl rule__Personnes__Group__1
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
    // InternalGame.g:1164:1: rule__Personnes__Group__0__Impl : ( 'personnes' ) ;
    public final void rule__Personnes__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1168:1: ( ( 'personnes' ) )
            // InternalGame.g:1169:1: ( 'personnes' )
            {
            // InternalGame.g:1169:1: ( 'personnes' )
            // InternalGame.g:1170:2: 'personnes'
            {
             before(grammarAccess.getPersonnesAccess().getPersonnesKeyword_0()); 
            match(input,18,FOLLOW_2); 
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
    // InternalGame.g:1179:1: rule__Personnes__Group__1 : rule__Personnes__Group__1__Impl rule__Personnes__Group__2 ;
    public final void rule__Personnes__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1183:1: ( rule__Personnes__Group__1__Impl rule__Personnes__Group__2 )
            // InternalGame.g:1184:2: rule__Personnes__Group__1__Impl rule__Personnes__Group__2
            {
            pushFollow(FOLLOW_16);
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
    // InternalGame.g:1191:1: rule__Personnes__Group__1__Impl : ( '{' ) ;
    public final void rule__Personnes__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1195:1: ( ( '{' ) )
            // InternalGame.g:1196:1: ( '{' )
            {
            // InternalGame.g:1196:1: ( '{' )
            // InternalGame.g:1197:2: '{'
            {
             before(grammarAccess.getPersonnesAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,12,FOLLOW_2); 
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
    // InternalGame.g:1206:1: rule__Personnes__Group__2 : rule__Personnes__Group__2__Impl rule__Personnes__Group__3 ;
    public final void rule__Personnes__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1210:1: ( rule__Personnes__Group__2__Impl rule__Personnes__Group__3 )
            // InternalGame.g:1211:2: rule__Personnes__Group__2__Impl rule__Personnes__Group__3
            {
            pushFollow(FOLLOW_16);
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
    // InternalGame.g:1218:1: rule__Personnes__Group__2__Impl : ( ( rule__Personnes__ListePersonneAssignment_2 )* ) ;
    public final void rule__Personnes__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1222:1: ( ( ( rule__Personnes__ListePersonneAssignment_2 )* ) )
            // InternalGame.g:1223:1: ( ( rule__Personnes__ListePersonneAssignment_2 )* )
            {
            // InternalGame.g:1223:1: ( ( rule__Personnes__ListePersonneAssignment_2 )* )
            // InternalGame.g:1224:2: ( rule__Personnes__ListePersonneAssignment_2 )*
            {
             before(grammarAccess.getPersonnesAccess().getListePersonneAssignment_2()); 
            // InternalGame.g:1225:2: ( rule__Personnes__ListePersonneAssignment_2 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==19) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalGame.g:1225:3: rule__Personnes__ListePersonneAssignment_2
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__Personnes__ListePersonneAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getPersonnesAccess().getListePersonneAssignment_2()); 

            }


            }

        }
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
    // InternalGame.g:1233:1: rule__Personnes__Group__3 : rule__Personnes__Group__3__Impl ;
    public final void rule__Personnes__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1237:1: ( rule__Personnes__Group__3__Impl )
            // InternalGame.g:1238:2: rule__Personnes__Group__3__Impl
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
    // InternalGame.g:1244:1: rule__Personnes__Group__3__Impl : ( '}' ) ;
    public final void rule__Personnes__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1248:1: ( ( '}' ) )
            // InternalGame.g:1249:1: ( '}' )
            {
            // InternalGame.g:1249:1: ( '}' )
            // InternalGame.g:1250:2: '}'
            {
             before(grammarAccess.getPersonnesAccess().getRightCurlyBracketKeyword_3()); 
            match(input,13,FOLLOW_2); 
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
    // InternalGame.g:1260:1: rule__Personne__Group__0 : rule__Personne__Group__0__Impl rule__Personne__Group__1 ;
    public final void rule__Personne__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1264:1: ( rule__Personne__Group__0__Impl rule__Personne__Group__1 )
            // InternalGame.g:1265:2: rule__Personne__Group__0__Impl rule__Personne__Group__1
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
    // InternalGame.g:1272:1: rule__Personne__Group__0__Impl : ( 'personne' ) ;
    public final void rule__Personne__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1276:1: ( ( 'personne' ) )
            // InternalGame.g:1277:1: ( 'personne' )
            {
            // InternalGame.g:1277:1: ( 'personne' )
            // InternalGame.g:1278:2: 'personne'
            {
             before(grammarAccess.getPersonneAccess().getPersonneKeyword_0()); 
            match(input,19,FOLLOW_2); 
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
    // InternalGame.g:1287:1: rule__Personne__Group__1 : rule__Personne__Group__1__Impl rule__Personne__Group__2 ;
    public final void rule__Personne__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1291:1: ( rule__Personne__Group__1__Impl rule__Personne__Group__2 )
            // InternalGame.g:1292:2: rule__Personne__Group__1__Impl rule__Personne__Group__2
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
    // InternalGame.g:1299:1: rule__Personne__Group__1__Impl : ( ( rule__Personne__NameAssignment_1 ) ) ;
    public final void rule__Personne__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1303:1: ( ( ( rule__Personne__NameAssignment_1 ) ) )
            // InternalGame.g:1304:1: ( ( rule__Personne__NameAssignment_1 ) )
            {
            // InternalGame.g:1304:1: ( ( rule__Personne__NameAssignment_1 ) )
            // InternalGame.g:1305:2: ( rule__Personne__NameAssignment_1 )
            {
             before(grammarAccess.getPersonneAccess().getNameAssignment_1()); 
            // InternalGame.g:1306:2: ( rule__Personne__NameAssignment_1 )
            // InternalGame.g:1306:3: rule__Personne__NameAssignment_1
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
    // InternalGame.g:1314:1: rule__Personne__Group__2 : rule__Personne__Group__2__Impl rule__Personne__Group__3 ;
    public final void rule__Personne__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1318:1: ( rule__Personne__Group__2__Impl rule__Personne__Group__3 )
            // InternalGame.g:1319:2: rule__Personne__Group__2__Impl rule__Personne__Group__3
            {
            pushFollow(FOLLOW_18);
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
    // InternalGame.g:1326:1: rule__Personne__Group__2__Impl : ( '{' ) ;
    public final void rule__Personne__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1330:1: ( ( '{' ) )
            // InternalGame.g:1331:1: ( '{' )
            {
            // InternalGame.g:1331:1: ( '{' )
            // InternalGame.g:1332:2: '{'
            {
             before(grammarAccess.getPersonneAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_2); 
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
    // InternalGame.g:1341:1: rule__Personne__Group__3 : rule__Personne__Group__3__Impl rule__Personne__Group__4 ;
    public final void rule__Personne__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1345:1: ( rule__Personne__Group__3__Impl rule__Personne__Group__4 )
            // InternalGame.g:1346:2: rule__Personne__Group__3__Impl rule__Personne__Group__4
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
    // InternalGame.g:1353:1: rule__Personne__Group__3__Impl : ( 'visible' ) ;
    public final void rule__Personne__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1357:1: ( ( 'visible' ) )
            // InternalGame.g:1358:1: ( 'visible' )
            {
            // InternalGame.g:1358:1: ( 'visible' )
            // InternalGame.g:1359:2: 'visible'
            {
             before(grammarAccess.getPersonneAccess().getVisibleKeyword_3()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getPersonneAccess().getVisibleKeyword_3()); 

            }


            }

        }
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
    // InternalGame.g:1368:1: rule__Personne__Group__4 : rule__Personne__Group__4__Impl rule__Personne__Group__5 ;
    public final void rule__Personne__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1372:1: ( rule__Personne__Group__4__Impl rule__Personne__Group__5 )
            // InternalGame.g:1373:2: rule__Personne__Group__4__Impl rule__Personne__Group__5
            {
            pushFollow(FOLLOW_20);
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
    // InternalGame.g:1380:1: rule__Personne__Group__4__Impl : ( 'obligatoire' ) ;
    public final void rule__Personne__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1384:1: ( ( 'obligatoire' ) )
            // InternalGame.g:1385:1: ( 'obligatoire' )
            {
            // InternalGame.g:1385:1: ( 'obligatoire' )
            // InternalGame.g:1386:2: 'obligatoire'
            {
             before(grammarAccess.getPersonneAccess().getObligatoireKeyword_4()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getPersonneAccess().getObligatoireKeyword_4()); 

            }


            }

        }
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
    // InternalGame.g:1395:1: rule__Personne__Group__5 : rule__Personne__Group__5__Impl rule__Personne__Group__6 ;
    public final void rule__Personne__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1399:1: ( rule__Personne__Group__5__Impl rule__Personne__Group__6 )
            // InternalGame.g:1400:2: rule__Personne__Group__5__Impl rule__Personne__Group__6
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
    // InternalGame.g:1407:1: rule__Personne__Group__5__Impl : ( ( rule__Personne__PersonneElementsAssignment_5 ) ) ;
    public final void rule__Personne__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1411:1: ( ( ( rule__Personne__PersonneElementsAssignment_5 ) ) )
            // InternalGame.g:1412:1: ( ( rule__Personne__PersonneElementsAssignment_5 ) )
            {
            // InternalGame.g:1412:1: ( ( rule__Personne__PersonneElementsAssignment_5 ) )
            // InternalGame.g:1413:2: ( rule__Personne__PersonneElementsAssignment_5 )
            {
             before(grammarAccess.getPersonneAccess().getPersonneElementsAssignment_5()); 
            // InternalGame.g:1414:2: ( rule__Personne__PersonneElementsAssignment_5 )
            // InternalGame.g:1414:3: rule__Personne__PersonneElementsAssignment_5
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
    // InternalGame.g:1422:1: rule__Personne__Group__6 : rule__Personne__Group__6__Impl ;
    public final void rule__Personne__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1426:1: ( rule__Personne__Group__6__Impl )
            // InternalGame.g:1427:2: rule__Personne__Group__6__Impl
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
    // InternalGame.g:1433:1: rule__Personne__Group__6__Impl : ( '}' ) ;
    public final void rule__Personne__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1437:1: ( ( '}' ) )
            // InternalGame.g:1438:1: ( '}' )
            {
            // InternalGame.g:1438:1: ( '}' )
            // InternalGame.g:1439:2: '}'
            {
             before(grammarAccess.getPersonneAccess().getRightCurlyBracketKeyword_6()); 
            match(input,13,FOLLOW_2); 
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


    // $ANTLR start "rule__Interaction__Group__0"
    // InternalGame.g:1449:1: rule__Interaction__Group__0 : rule__Interaction__Group__0__Impl rule__Interaction__Group__1 ;
    public final void rule__Interaction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1453:1: ( rule__Interaction__Group__0__Impl rule__Interaction__Group__1 )
            // InternalGame.g:1454:2: rule__Interaction__Group__0__Impl rule__Interaction__Group__1
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
    // InternalGame.g:1461:1: rule__Interaction__Group__0__Impl : ( 'interaction' ) ;
    public final void rule__Interaction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1465:1: ( ( 'interaction' ) )
            // InternalGame.g:1466:1: ( 'interaction' )
            {
            // InternalGame.g:1466:1: ( 'interaction' )
            // InternalGame.g:1467:2: 'interaction'
            {
             before(grammarAccess.getInteractionAccess().getInteractionKeyword_0()); 
            match(input,22,FOLLOW_2); 
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
    // InternalGame.g:1476:1: rule__Interaction__Group__1 : rule__Interaction__Group__1__Impl rule__Interaction__Group__2 ;
    public final void rule__Interaction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1480:1: ( rule__Interaction__Group__1__Impl rule__Interaction__Group__2 )
            // InternalGame.g:1481:2: rule__Interaction__Group__1__Impl rule__Interaction__Group__2
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
    // InternalGame.g:1488:1: rule__Interaction__Group__1__Impl : ( ( rule__Interaction__NameAssignment_1 ) ) ;
    public final void rule__Interaction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1492:1: ( ( ( rule__Interaction__NameAssignment_1 ) ) )
            // InternalGame.g:1493:1: ( ( rule__Interaction__NameAssignment_1 ) )
            {
            // InternalGame.g:1493:1: ( ( rule__Interaction__NameAssignment_1 ) )
            // InternalGame.g:1494:2: ( rule__Interaction__NameAssignment_1 )
            {
             before(grammarAccess.getInteractionAccess().getNameAssignment_1()); 
            // InternalGame.g:1495:2: ( rule__Interaction__NameAssignment_1 )
            // InternalGame.g:1495:3: rule__Interaction__NameAssignment_1
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
    // InternalGame.g:1503:1: rule__Interaction__Group__2 : rule__Interaction__Group__2__Impl rule__Interaction__Group__3 ;
    public final void rule__Interaction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1507:1: ( rule__Interaction__Group__2__Impl rule__Interaction__Group__3 )
            // InternalGame.g:1508:2: rule__Interaction__Group__2__Impl rule__Interaction__Group__3
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
    // InternalGame.g:1515:1: rule__Interaction__Group__2__Impl : ( '{' ) ;
    public final void rule__Interaction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1519:1: ( ( '{' ) )
            // InternalGame.g:1520:1: ( '{' )
            {
            // InternalGame.g:1520:1: ( '{' )
            // InternalGame.g:1521:2: '{'
            {
             before(grammarAccess.getInteractionAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_2); 
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
    // InternalGame.g:1530:1: rule__Interaction__Group__3 : rule__Interaction__Group__3__Impl rule__Interaction__Group__4 ;
    public final void rule__Interaction__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1534:1: ( rule__Interaction__Group__3__Impl rule__Interaction__Group__4 )
            // InternalGame.g:1535:2: rule__Interaction__Group__3__Impl rule__Interaction__Group__4
            {
            pushFollow(FOLLOW_22);
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
    // InternalGame.g:1542:1: rule__Interaction__Group__3__Impl : ( 'texte' ) ;
    public final void rule__Interaction__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1546:1: ( ( 'texte' ) )
            // InternalGame.g:1547:1: ( 'texte' )
            {
            // InternalGame.g:1547:1: ( 'texte' )
            // InternalGame.g:1548:2: 'texte'
            {
             before(grammarAccess.getInteractionAccess().getTexteKeyword_3()); 
            match(input,23,FOLLOW_2); 
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
    // InternalGame.g:1557:1: rule__Interaction__Group__4 : rule__Interaction__Group__4__Impl rule__Interaction__Group__5 ;
    public final void rule__Interaction__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1561:1: ( rule__Interaction__Group__4__Impl rule__Interaction__Group__5 )
            // InternalGame.g:1562:2: rule__Interaction__Group__4__Impl rule__Interaction__Group__5
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
    // InternalGame.g:1569:1: rule__Interaction__Group__4__Impl : ( ( rule__Interaction__InteractionElementsAssignment_4 )* ) ;
    public final void rule__Interaction__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1573:1: ( ( ( rule__Interaction__InteractionElementsAssignment_4 )* ) )
            // InternalGame.g:1574:1: ( ( rule__Interaction__InteractionElementsAssignment_4 )* )
            {
            // InternalGame.g:1574:1: ( ( rule__Interaction__InteractionElementsAssignment_4 )* )
            // InternalGame.g:1575:2: ( rule__Interaction__InteractionElementsAssignment_4 )*
            {
             before(grammarAccess.getInteractionAccess().getInteractionElementsAssignment_4()); 
            // InternalGame.g:1576:2: ( rule__Interaction__InteractionElementsAssignment_4 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==24) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalGame.g:1576:3: rule__Interaction__InteractionElementsAssignment_4
            	    {
            	    pushFollow(FOLLOW_23);
            	    rule__Interaction__InteractionElementsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getInteractionAccess().getInteractionElementsAssignment_4()); 

            }


            }

        }
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
    // InternalGame.g:1584:1: rule__Interaction__Group__5 : rule__Interaction__Group__5__Impl ;
    public final void rule__Interaction__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1588:1: ( rule__Interaction__Group__5__Impl )
            // InternalGame.g:1589:2: rule__Interaction__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Interaction__Group__5__Impl();

            state._fsp--;


            }

        }
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
    // InternalGame.g:1595:1: rule__Interaction__Group__5__Impl : ( '}' ) ;
    public final void rule__Interaction__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1599:1: ( ( '}' ) )
            // InternalGame.g:1600:1: ( '}' )
            {
            // InternalGame.g:1600:1: ( '}' )
            // InternalGame.g:1601:2: '}'
            {
             before(grammarAccess.getInteractionAccess().getRightCurlyBracketKeyword_5()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getInteractionAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
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


    // $ANTLR start "rule__Choix__Group__0"
    // InternalGame.g:1611:1: rule__Choix__Group__0 : rule__Choix__Group__0__Impl rule__Choix__Group__1 ;
    public final void rule__Choix__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1615:1: ( rule__Choix__Group__0__Impl rule__Choix__Group__1 )
            // InternalGame.g:1616:2: rule__Choix__Group__0__Impl rule__Choix__Group__1
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
    // InternalGame.g:1623:1: rule__Choix__Group__0__Impl : ( 'choix' ) ;
    public final void rule__Choix__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1627:1: ( ( 'choix' ) )
            // InternalGame.g:1628:1: ( 'choix' )
            {
            // InternalGame.g:1628:1: ( 'choix' )
            // InternalGame.g:1629:2: 'choix'
            {
             before(grammarAccess.getChoixAccess().getChoixKeyword_0()); 
            match(input,24,FOLLOW_2); 
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
    // InternalGame.g:1638:1: rule__Choix__Group__1 : rule__Choix__Group__1__Impl ;
    public final void rule__Choix__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1642:1: ( rule__Choix__Group__1__Impl )
            // InternalGame.g:1643:2: rule__Choix__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Choix__Group__1__Impl();

            state._fsp--;


            }

        }
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
    // InternalGame.g:1649:1: rule__Choix__Group__1__Impl : ( ( rule__Choix__NameAssignment_1 ) ) ;
    public final void rule__Choix__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1653:1: ( ( ( rule__Choix__NameAssignment_1 ) ) )
            // InternalGame.g:1654:1: ( ( rule__Choix__NameAssignment_1 ) )
            {
            // InternalGame.g:1654:1: ( ( rule__Choix__NameAssignment_1 ) )
            // InternalGame.g:1655:2: ( rule__Choix__NameAssignment_1 )
            {
             before(grammarAccess.getChoixAccess().getNameAssignment_1()); 
            // InternalGame.g:1656:2: ( rule__Choix__NameAssignment_1 )
            // InternalGame.g:1656:3: rule__Choix__NameAssignment_1
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


    // $ANTLR start "rule__Objet__Group__0"
    // InternalGame.g:1665:1: rule__Objet__Group__0 : rule__Objet__Group__0__Impl rule__Objet__Group__1 ;
    public final void rule__Objet__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1669:1: ( rule__Objet__Group__0__Impl rule__Objet__Group__1 )
            // InternalGame.g:1670:2: rule__Objet__Group__0__Impl rule__Objet__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Objet__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Objet__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Objet__Group__0"


    // $ANTLR start "rule__Objet__Group__0__Impl"
    // InternalGame.g:1677:1: rule__Objet__Group__0__Impl : ( 'objet' ) ;
    public final void rule__Objet__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1681:1: ( ( 'objet' ) )
            // InternalGame.g:1682:1: ( 'objet' )
            {
            // InternalGame.g:1682:1: ( 'objet' )
            // InternalGame.g:1683:2: 'objet'
            {
             before(grammarAccess.getObjetAccess().getObjetKeyword_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getObjetAccess().getObjetKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Objet__Group__0__Impl"


    // $ANTLR start "rule__Objet__Group__1"
    // InternalGame.g:1692:1: rule__Objet__Group__1 : rule__Objet__Group__1__Impl rule__Objet__Group__2 ;
    public final void rule__Objet__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1696:1: ( rule__Objet__Group__1__Impl rule__Objet__Group__2 )
            // InternalGame.g:1697:2: rule__Objet__Group__1__Impl rule__Objet__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__Objet__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Objet__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Objet__Group__1"


    // $ANTLR start "rule__Objet__Group__1__Impl"
    // InternalGame.g:1704:1: rule__Objet__Group__1__Impl : ( ( rule__Objet__NameAssignment_1 ) ) ;
    public final void rule__Objet__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1708:1: ( ( ( rule__Objet__NameAssignment_1 ) ) )
            // InternalGame.g:1709:1: ( ( rule__Objet__NameAssignment_1 ) )
            {
            // InternalGame.g:1709:1: ( ( rule__Objet__NameAssignment_1 ) )
            // InternalGame.g:1710:2: ( rule__Objet__NameAssignment_1 )
            {
             before(grammarAccess.getObjetAccess().getNameAssignment_1()); 
            // InternalGame.g:1711:2: ( rule__Objet__NameAssignment_1 )
            // InternalGame.g:1711:3: rule__Objet__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Objet__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getObjetAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Objet__Group__1__Impl"


    // $ANTLR start "rule__Objet__Group__2"
    // InternalGame.g:1719:1: rule__Objet__Group__2 : rule__Objet__Group__2__Impl rule__Objet__Group__3 ;
    public final void rule__Objet__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1723:1: ( rule__Objet__Group__2__Impl rule__Objet__Group__3 )
            // InternalGame.g:1724:2: rule__Objet__Group__2__Impl rule__Objet__Group__3
            {
            pushFollow(FOLLOW_10);
            rule__Objet__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Objet__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Objet__Group__2"


    // $ANTLR start "rule__Objet__Group__2__Impl"
    // InternalGame.g:1731:1: rule__Objet__Group__2__Impl : ( ( rule__Objet__TailleAssignment_2 ) ) ;
    public final void rule__Objet__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1735:1: ( ( ( rule__Objet__TailleAssignment_2 ) ) )
            // InternalGame.g:1736:1: ( ( rule__Objet__TailleAssignment_2 ) )
            {
            // InternalGame.g:1736:1: ( ( rule__Objet__TailleAssignment_2 ) )
            // InternalGame.g:1737:2: ( rule__Objet__TailleAssignment_2 )
            {
             before(grammarAccess.getObjetAccess().getTailleAssignment_2()); 
            // InternalGame.g:1738:2: ( rule__Objet__TailleAssignment_2 )
            // InternalGame.g:1738:3: rule__Objet__TailleAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Objet__TailleAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getObjetAccess().getTailleAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Objet__Group__2__Impl"


    // $ANTLR start "rule__Objet__Group__3"
    // InternalGame.g:1746:1: rule__Objet__Group__3 : rule__Objet__Group__3__Impl ;
    public final void rule__Objet__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1750:1: ( rule__Objet__Group__3__Impl )
            // InternalGame.g:1751:2: rule__Objet__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Objet__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Objet__Group__3"


    // $ANTLR start "rule__Objet__Group__3__Impl"
    // InternalGame.g:1757:1: rule__Objet__Group__3__Impl : ( ( rule__Objet__QuantiteAssignment_3 ) ) ;
    public final void rule__Objet__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1761:1: ( ( ( rule__Objet__QuantiteAssignment_3 ) ) )
            // InternalGame.g:1762:1: ( ( rule__Objet__QuantiteAssignment_3 ) )
            {
            // InternalGame.g:1762:1: ( ( rule__Objet__QuantiteAssignment_3 ) )
            // InternalGame.g:1763:2: ( rule__Objet__QuantiteAssignment_3 )
            {
             before(grammarAccess.getObjetAccess().getQuantiteAssignment_3()); 
            // InternalGame.g:1764:2: ( rule__Objet__QuantiteAssignment_3 )
            // InternalGame.g:1764:3: rule__Objet__QuantiteAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Objet__QuantiteAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getObjetAccess().getQuantiteAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Objet__Group__3__Impl"


    // $ANTLR start "rule__Connaissances__Group__0"
    // InternalGame.g:1773:1: rule__Connaissances__Group__0 : rule__Connaissances__Group__0__Impl rule__Connaissances__Group__1 ;
    public final void rule__Connaissances__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1777:1: ( rule__Connaissances__Group__0__Impl rule__Connaissances__Group__1 )
            // InternalGame.g:1778:2: rule__Connaissances__Group__0__Impl rule__Connaissances__Group__1
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
    // InternalGame.g:1785:1: rule__Connaissances__Group__0__Impl : ( 'connaissances' ) ;
    public final void rule__Connaissances__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1789:1: ( ( 'connaissances' ) )
            // InternalGame.g:1790:1: ( 'connaissances' )
            {
            // InternalGame.g:1790:1: ( 'connaissances' )
            // InternalGame.g:1791:2: 'connaissances'
            {
             before(grammarAccess.getConnaissancesAccess().getConnaissancesKeyword_0()); 
            match(input,26,FOLLOW_2); 
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
    // InternalGame.g:1800:1: rule__Connaissances__Group__1 : rule__Connaissances__Group__1__Impl rule__Connaissances__Group__2 ;
    public final void rule__Connaissances__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1804:1: ( rule__Connaissances__Group__1__Impl rule__Connaissances__Group__2 )
            // InternalGame.g:1805:2: rule__Connaissances__Group__1__Impl rule__Connaissances__Group__2
            {
            pushFollow(FOLLOW_24);
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
    // InternalGame.g:1812:1: rule__Connaissances__Group__1__Impl : ( '{' ) ;
    public final void rule__Connaissances__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1816:1: ( ( '{' ) )
            // InternalGame.g:1817:1: ( '{' )
            {
            // InternalGame.g:1817:1: ( '{' )
            // InternalGame.g:1818:2: '{'
            {
             before(grammarAccess.getConnaissancesAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,12,FOLLOW_2); 
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
    // InternalGame.g:1827:1: rule__Connaissances__Group__2 : rule__Connaissances__Group__2__Impl rule__Connaissances__Group__3 ;
    public final void rule__Connaissances__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1831:1: ( rule__Connaissances__Group__2__Impl rule__Connaissances__Group__3 )
            // InternalGame.g:1832:2: rule__Connaissances__Group__2__Impl rule__Connaissances__Group__3
            {
            pushFollow(FOLLOW_24);
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
    // InternalGame.g:1839:1: rule__Connaissances__Group__2__Impl : ( ( rule__Connaissances__ListeConnaissanceAssignment_2 )* ) ;
    public final void rule__Connaissances__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1843:1: ( ( ( rule__Connaissances__ListeConnaissanceAssignment_2 )* ) )
            // InternalGame.g:1844:1: ( ( rule__Connaissances__ListeConnaissanceAssignment_2 )* )
            {
            // InternalGame.g:1844:1: ( ( rule__Connaissances__ListeConnaissanceAssignment_2 )* )
            // InternalGame.g:1845:2: ( rule__Connaissances__ListeConnaissanceAssignment_2 )*
            {
             before(grammarAccess.getConnaissancesAccess().getListeConnaissanceAssignment_2()); 
            // InternalGame.g:1846:2: ( rule__Connaissances__ListeConnaissanceAssignment_2 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==27) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalGame.g:1846:3: rule__Connaissances__ListeConnaissanceAssignment_2
            	    {
            	    pushFollow(FOLLOW_25);
            	    rule__Connaissances__ListeConnaissanceAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getConnaissancesAccess().getListeConnaissanceAssignment_2()); 

            }


            }

        }
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
    // InternalGame.g:1854:1: rule__Connaissances__Group__3 : rule__Connaissances__Group__3__Impl ;
    public final void rule__Connaissances__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1858:1: ( rule__Connaissances__Group__3__Impl )
            // InternalGame.g:1859:2: rule__Connaissances__Group__3__Impl
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
    // InternalGame.g:1865:1: rule__Connaissances__Group__3__Impl : ( '}' ) ;
    public final void rule__Connaissances__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1869:1: ( ( '}' ) )
            // InternalGame.g:1870:1: ( '}' )
            {
            // InternalGame.g:1870:1: ( '}' )
            // InternalGame.g:1871:2: '}'
            {
             before(grammarAccess.getConnaissancesAccess().getRightCurlyBracketKeyword_3()); 
            match(input,13,FOLLOW_2); 
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
    // InternalGame.g:1881:1: rule__Connaissance__Group__0 : rule__Connaissance__Group__0__Impl rule__Connaissance__Group__1 ;
    public final void rule__Connaissance__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1885:1: ( rule__Connaissance__Group__0__Impl rule__Connaissance__Group__1 )
            // InternalGame.g:1886:2: rule__Connaissance__Group__0__Impl rule__Connaissance__Group__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalGame.g:1893:1: rule__Connaissance__Group__0__Impl : ( 'connaissance' ) ;
    public final void rule__Connaissance__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1897:1: ( ( 'connaissance' ) )
            // InternalGame.g:1898:1: ( 'connaissance' )
            {
            // InternalGame.g:1898:1: ( 'connaissance' )
            // InternalGame.g:1899:2: 'connaissance'
            {
             before(grammarAccess.getConnaissanceAccess().getConnaissanceKeyword_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getConnaissanceAccess().getConnaissanceKeyword_0()); 

            }


            }

        }
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
    // InternalGame.g:1908:1: rule__Connaissance__Group__1 : rule__Connaissance__Group__1__Impl ;
    public final void rule__Connaissance__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1912:1: ( rule__Connaissance__Group__1__Impl )
            // InternalGame.g:1913:2: rule__Connaissance__Group__1__Impl
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
    // InternalGame.g:1919:1: rule__Connaissance__Group__1__Impl : ( ( rule__Connaissance__NameAssignment_1 ) ) ;
    public final void rule__Connaissance__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1923:1: ( ( ( rule__Connaissance__NameAssignment_1 ) ) )
            // InternalGame.g:1924:1: ( ( rule__Connaissance__NameAssignment_1 ) )
            {
            // InternalGame.g:1924:1: ( ( rule__Connaissance__NameAssignment_1 ) )
            // InternalGame.g:1925:2: ( rule__Connaissance__NameAssignment_1 )
            {
             before(grammarAccess.getConnaissanceAccess().getNameAssignment_1()); 
            // InternalGame.g:1926:2: ( rule__Connaissance__NameAssignment_1 )
            // InternalGame.g:1926:3: rule__Connaissance__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Connaissance__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getConnaissanceAccess().getNameAssignment_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__Game__NameAssignment_1"
    // InternalGame.g:1935:1: rule__Game__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Game__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1939:1: ( ( RULE_ID ) )
            // InternalGame.g:1940:2: ( RULE_ID )
            {
            // InternalGame.g:1940:2: ( RULE_ID )
            // InternalGame.g:1941:3: RULE_ID
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


    // $ANTLR start "rule__Game__GameElementsAssignment_3"
    // InternalGame.g:1950:1: rule__Game__GameElementsAssignment_3 : ( rulegameElement ) ;
    public final void rule__Game__GameElementsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1954:1: ( ( rulegameElement ) )
            // InternalGame.g:1955:2: ( rulegameElement )
            {
            // InternalGame.g:1955:2: ( rulegameElement )
            // InternalGame.g:1956:3: rulegameElement
            {
             before(grammarAccess.getGameAccess().getGameElementsGameElementParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            rulegameElement();

            state._fsp--;

             after(grammarAccess.getGameAccess().getGameElementsGameElementParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Game__GameElementsAssignment_3"


    // $ANTLR start "rule__Explorateur__NameAssignment_1"
    // InternalGame.g:1965:1: rule__Explorateur__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Explorateur__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1969:1: ( ( RULE_ID ) )
            // InternalGame.g:1970:2: ( RULE_ID )
            {
            // InternalGame.g:1970:2: ( RULE_ID )
            // InternalGame.g:1971:3: RULE_ID
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


    // $ANTLR start "rule__Explorateur__ExplorateurElementsAssignment_3"
    // InternalGame.g:1980:1: rule__Explorateur__ExplorateurElementsAssignment_3 : ( ruleSac ) ;
    public final void rule__Explorateur__ExplorateurElementsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1984:1: ( ( ruleSac ) )
            // InternalGame.g:1985:2: ( ruleSac )
            {
            // InternalGame.g:1985:2: ( ruleSac )
            // InternalGame.g:1986:3: ruleSac
            {
             before(grammarAccess.getExplorateurAccess().getExplorateurElementsSacParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleSac();

            state._fsp--;

             after(grammarAccess.getExplorateurAccess().getExplorateurElementsSacParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Explorateur__ExplorateurElementsAssignment_3"


    // $ANTLR start "rule__Explorateur__ExplorateurElementsAssignment_4"
    // InternalGame.g:1995:1: rule__Explorateur__ExplorateurElementsAssignment_4 : ( ruleConnaissances ) ;
    public final void rule__Explorateur__ExplorateurElementsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1999:1: ( ( ruleConnaissances ) )
            // InternalGame.g:2000:2: ( ruleConnaissances )
            {
            // InternalGame.g:2000:2: ( ruleConnaissances )
            // InternalGame.g:2001:3: ruleConnaissances
            {
             before(grammarAccess.getExplorateurAccess().getExplorateurElementsConnaissancesParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleConnaissances();

            state._fsp--;

             after(grammarAccess.getExplorateurAccess().getExplorateurElementsConnaissancesParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Explorateur__ExplorateurElementsAssignment_4"


    // $ANTLR start "rule__Explorateur__ExplorateurElementsAssignment_5"
    // InternalGame.g:2010:1: rule__Explorateur__ExplorateurElementsAssignment_5 : ( ruleLieu ) ;
    public final void rule__Explorateur__ExplorateurElementsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2014:1: ( ( ruleLieu ) )
            // InternalGame.g:2015:2: ( ruleLieu )
            {
            // InternalGame.g:2015:2: ( ruleLieu )
            // InternalGame.g:2016:3: ruleLieu
            {
             before(grammarAccess.getExplorateurAccess().getExplorateurElementsLieuParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleLieu();

            state._fsp--;

             after(grammarAccess.getExplorateurAccess().getExplorateurElementsLieuParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Explorateur__ExplorateurElementsAssignment_5"


    // $ANTLR start "rule__Sac__TailleAssignment_1"
    // InternalGame.g:2025:1: rule__Sac__TailleAssignment_1 : ( RULE_INT ) ;
    public final void rule__Sac__TailleAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2029:1: ( ( RULE_INT ) )
            // InternalGame.g:2030:2: ( RULE_INT )
            {
            // InternalGame.g:2030:2: ( RULE_INT )
            // InternalGame.g:2031:3: RULE_INT
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
    // InternalGame.g:2040:1: rule__Sac__SacElementsAssignment_3 : ( ruleObjet ) ;
    public final void rule__Sac__SacElementsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2044:1: ( ( ruleObjet ) )
            // InternalGame.g:2045:2: ( ruleObjet )
            {
            // InternalGame.g:2045:2: ( ruleObjet )
            // InternalGame.g:2046:3: ruleObjet
            {
             before(grammarAccess.getSacAccess().getSacElementsObjetParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleObjet();

            state._fsp--;

             after(grammarAccess.getSacAccess().getSacElementsObjetParserRuleCall_3_0()); 

            }


            }

        }
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


    // $ANTLR start "rule__Territoire__NameAssignment_1"
    // InternalGame.g:2055:1: rule__Territoire__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Territoire__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2059:1: ( ( RULE_ID ) )
            // InternalGame.g:2060:2: ( RULE_ID )
            {
            // InternalGame.g:2060:2: ( RULE_ID )
            // InternalGame.g:2061:3: RULE_ID
            {
             before(grammarAccess.getTerritoireAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTerritoireAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Territoire__NameAssignment_1"


    // $ANTLR start "rule__Territoire__TerritoireElementsAssignment_3"
    // InternalGame.g:2070:1: rule__Territoire__TerritoireElementsAssignment_3 : ( ruleterritoireElement ) ;
    public final void rule__Territoire__TerritoireElementsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2074:1: ( ( ruleterritoireElement ) )
            // InternalGame.g:2075:2: ( ruleterritoireElement )
            {
            // InternalGame.g:2075:2: ( ruleterritoireElement )
            // InternalGame.g:2076:3: ruleterritoireElement
            {
             before(grammarAccess.getTerritoireAccess().getTerritoireElementsTerritoireElementParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleterritoireElement();

            state._fsp--;

             after(grammarAccess.getTerritoireAccess().getTerritoireElementsTerritoireElementParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Territoire__TerritoireElementsAssignment_3"


    // $ANTLR start "rule__Lieu__NameAssignment_1"
    // InternalGame.g:2085:1: rule__Lieu__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Lieu__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2089:1: ( ( RULE_ID ) )
            // InternalGame.g:2090:2: ( RULE_ID )
            {
            // InternalGame.g:2090:2: ( RULE_ID )
            // InternalGame.g:2091:3: RULE_ID
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


    // $ANTLR start "rule__Lieu__LieuElementsAssignment_3"
    // InternalGame.g:2100:1: rule__Lieu__LieuElementsAssignment_3 : ( rulePersonnes ) ;
    public final void rule__Lieu__LieuElementsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2104:1: ( ( rulePersonnes ) )
            // InternalGame.g:2105:2: ( rulePersonnes )
            {
            // InternalGame.g:2105:2: ( rulePersonnes )
            // InternalGame.g:2106:3: rulePersonnes
            {
             before(grammarAccess.getLieuAccess().getLieuElementsPersonnesParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            rulePersonnes();

            state._fsp--;

             after(grammarAccess.getLieuAccess().getLieuElementsPersonnesParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lieu__LieuElementsAssignment_3"


    // $ANTLR start "rule__Personnes__ListePersonneAssignment_2"
    // InternalGame.g:2115:1: rule__Personnes__ListePersonneAssignment_2 : ( rulePersonne ) ;
    public final void rule__Personnes__ListePersonneAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2119:1: ( ( rulePersonne ) )
            // InternalGame.g:2120:2: ( rulePersonne )
            {
            // InternalGame.g:2120:2: ( rulePersonne )
            // InternalGame.g:2121:3: rulePersonne
            {
             before(grammarAccess.getPersonnesAccess().getListePersonnePersonneParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            rulePersonne();

            state._fsp--;

             after(grammarAccess.getPersonnesAccess().getListePersonnePersonneParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Personnes__ListePersonneAssignment_2"


    // $ANTLR start "rule__Personne__NameAssignment_1"
    // InternalGame.g:2130:1: rule__Personne__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Personne__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2134:1: ( ( RULE_ID ) )
            // InternalGame.g:2135:2: ( RULE_ID )
            {
            // InternalGame.g:2135:2: ( RULE_ID )
            // InternalGame.g:2136:3: RULE_ID
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


    // $ANTLR start "rule__Personne__PersonneElementsAssignment_5"
    // InternalGame.g:2145:1: rule__Personne__PersonneElementsAssignment_5 : ( ruleInteraction ) ;
    public final void rule__Personne__PersonneElementsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2149:1: ( ( ruleInteraction ) )
            // InternalGame.g:2150:2: ( ruleInteraction )
            {
            // InternalGame.g:2150:2: ( ruleInteraction )
            // InternalGame.g:2151:3: ruleInteraction
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
    // InternalGame.g:2160:1: rule__Interaction__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Interaction__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2164:1: ( ( RULE_ID ) )
            // InternalGame.g:2165:2: ( RULE_ID )
            {
            // InternalGame.g:2165:2: ( RULE_ID )
            // InternalGame.g:2166:3: RULE_ID
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


    // $ANTLR start "rule__Interaction__InteractionElementsAssignment_4"
    // InternalGame.g:2175:1: rule__Interaction__InteractionElementsAssignment_4 : ( ruleChoix ) ;
    public final void rule__Interaction__InteractionElementsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2179:1: ( ( ruleChoix ) )
            // InternalGame.g:2180:2: ( ruleChoix )
            {
            // InternalGame.g:2180:2: ( ruleChoix )
            // InternalGame.g:2181:3: ruleChoix
            {
             before(grammarAccess.getInteractionAccess().getInteractionElementsChoixParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleChoix();

            state._fsp--;

             after(grammarAccess.getInteractionAccess().getInteractionElementsChoixParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interaction__InteractionElementsAssignment_4"


    // $ANTLR start "rule__Choix__NameAssignment_1"
    // InternalGame.g:2190:1: rule__Choix__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Choix__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2194:1: ( ( RULE_ID ) )
            // InternalGame.g:2195:2: ( RULE_ID )
            {
            // InternalGame.g:2195:2: ( RULE_ID )
            // InternalGame.g:2196:3: RULE_ID
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


    // $ANTLR start "rule__Objet__NameAssignment_1"
    // InternalGame.g:2205:1: rule__Objet__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Objet__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2209:1: ( ( RULE_ID ) )
            // InternalGame.g:2210:2: ( RULE_ID )
            {
            // InternalGame.g:2210:2: ( RULE_ID )
            // InternalGame.g:2211:3: RULE_ID
            {
             before(grammarAccess.getObjetAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getObjetAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Objet__NameAssignment_1"


    // $ANTLR start "rule__Objet__TailleAssignment_2"
    // InternalGame.g:2220:1: rule__Objet__TailleAssignment_2 : ( RULE_INT ) ;
    public final void rule__Objet__TailleAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2224:1: ( ( RULE_INT ) )
            // InternalGame.g:2225:2: ( RULE_INT )
            {
            // InternalGame.g:2225:2: ( RULE_INT )
            // InternalGame.g:2226:3: RULE_INT
            {
             before(grammarAccess.getObjetAccess().getTailleINTTerminalRuleCall_2_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getObjetAccess().getTailleINTTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Objet__TailleAssignment_2"


    // $ANTLR start "rule__Objet__QuantiteAssignment_3"
    // InternalGame.g:2235:1: rule__Objet__QuantiteAssignment_3 : ( RULE_INT ) ;
    public final void rule__Objet__QuantiteAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2239:1: ( ( RULE_INT ) )
            // InternalGame.g:2240:2: ( RULE_INT )
            {
            // InternalGame.g:2240:2: ( RULE_INT )
            // InternalGame.g:2241:3: RULE_INT
            {
             before(grammarAccess.getObjetAccess().getQuantiteINTTerminalRuleCall_3_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getObjetAccess().getQuantiteINTTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Objet__QuantiteAssignment_3"


    // $ANTLR start "rule__Connaissances__ListeConnaissanceAssignment_2"
    // InternalGame.g:2250:1: rule__Connaissances__ListeConnaissanceAssignment_2 : ( ruleConnaissance ) ;
    public final void rule__Connaissances__ListeConnaissanceAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2254:1: ( ( ruleConnaissance ) )
            // InternalGame.g:2255:2: ( ruleConnaissance )
            {
            // InternalGame.g:2255:2: ( ruleConnaissance )
            // InternalGame.g:2256:3: ruleConnaissance
            {
             before(grammarAccess.getConnaissancesAccess().getListeConnaissanceConnaissanceParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleConnaissance();

            state._fsp--;

             after(grammarAccess.getConnaissancesAccess().getListeConnaissanceConnaissanceParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connaissances__ListeConnaissanceAssignment_2"


    // $ANTLR start "rule__Connaissance__NameAssignment_1"
    // InternalGame.g:2265:1: rule__Connaissance__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Connaissance__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2269:1: ( ( RULE_ID ) )
            // InternalGame.g:2270:2: ( RULE_ID )
            {
            // InternalGame.g:2270:2: ( RULE_ID )
            // InternalGame.g:2271:3: RULE_ID
            {
             before(grammarAccess.getConnaissanceAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getConnaissanceAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connaissance__NameAssignment_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000022000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000002002000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000026000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000024002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000082000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000001002000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000008002000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000008000002L});

}