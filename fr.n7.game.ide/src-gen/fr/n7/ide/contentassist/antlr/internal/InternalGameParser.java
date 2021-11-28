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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Game'", "'{'", "'}'", "'territoire'", "'explorateur'", "'sac'", "'lieu'", "'lieudebut'", "'lieufin'", "'personnes'", "'personne'", "'visible'", "'obligatoire'", "'interaction'", "'texte'", "'choix'", "'objet'", "'objets'", "'connaissances'", "'connaissance'"
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
    public static final int T__30=30;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
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


    // $ANTLR start "entryRuleTerritoire"
    // InternalGame.g:103:1: entryRuleTerritoire : ruleTerritoire EOF ;
    public final void entryRuleTerritoire() throws RecognitionException {
        try {
            // InternalGame.g:104:1: ( ruleTerritoire EOF )
            // InternalGame.g:105:1: ruleTerritoire EOF
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
    // InternalGame.g:112:1: ruleTerritoire : ( ( rule__Territoire__Group__0 ) ) ;
    public final void ruleTerritoire() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:116:2: ( ( ( rule__Territoire__Group__0 ) ) )
            // InternalGame.g:117:2: ( ( rule__Territoire__Group__0 ) )
            {
            // InternalGame.g:117:2: ( ( rule__Territoire__Group__0 ) )
            // InternalGame.g:118:3: ( rule__Territoire__Group__0 )
            {
             before(grammarAccess.getTerritoireAccess().getGroup()); 
            // InternalGame.g:119:3: ( rule__Territoire__Group__0 )
            // InternalGame.g:119:4: rule__Territoire__Group__0
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


    // $ANTLR start "entryRuleLieu"
    // InternalGame.g:178:1: entryRuleLieu : ruleLieu EOF ;
    public final void entryRuleLieu() throws RecognitionException {
        try {
            // InternalGame.g:179:1: ( ruleLieu EOF )
            // InternalGame.g:180:1: ruleLieu EOF
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
    // InternalGame.g:187:1: ruleLieu : ( ( rule__Lieu__Group__0 ) ) ;
    public final void ruleLieu() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:191:2: ( ( ( rule__Lieu__Group__0 ) ) )
            // InternalGame.g:192:2: ( ( rule__Lieu__Group__0 ) )
            {
            // InternalGame.g:192:2: ( ( rule__Lieu__Group__0 ) )
            // InternalGame.g:193:3: ( rule__Lieu__Group__0 )
            {
             before(grammarAccess.getLieuAccess().getGroup()); 
            // InternalGame.g:194:3: ( rule__Lieu__Group__0 )
            // InternalGame.g:194:4: rule__Lieu__Group__0
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


    // $ANTLR start "entryRuleLieuDebut"
    // InternalGame.g:203:1: entryRuleLieuDebut : ruleLieuDebut EOF ;
    public final void entryRuleLieuDebut() throws RecognitionException {
        try {
            // InternalGame.g:204:1: ( ruleLieuDebut EOF )
            // InternalGame.g:205:1: ruleLieuDebut EOF
            {
             before(grammarAccess.getLieuDebutRule()); 
            pushFollow(FOLLOW_1);
            ruleLieuDebut();

            state._fsp--;

             after(grammarAccess.getLieuDebutRule()); 
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
    // $ANTLR end "entryRuleLieuDebut"


    // $ANTLR start "ruleLieuDebut"
    // InternalGame.g:212:1: ruleLieuDebut : ( ( rule__LieuDebut__Group__0 ) ) ;
    public final void ruleLieuDebut() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:216:2: ( ( ( rule__LieuDebut__Group__0 ) ) )
            // InternalGame.g:217:2: ( ( rule__LieuDebut__Group__0 ) )
            {
            // InternalGame.g:217:2: ( ( rule__LieuDebut__Group__0 ) )
            // InternalGame.g:218:3: ( rule__LieuDebut__Group__0 )
            {
             before(grammarAccess.getLieuDebutAccess().getGroup()); 
            // InternalGame.g:219:3: ( rule__LieuDebut__Group__0 )
            // InternalGame.g:219:4: rule__LieuDebut__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__LieuDebut__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLieuDebutAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLieuDebut"


    // $ANTLR start "entryRuleLieuFin"
    // InternalGame.g:228:1: entryRuleLieuFin : ruleLieuFin EOF ;
    public final void entryRuleLieuFin() throws RecognitionException {
        try {
            // InternalGame.g:229:1: ( ruleLieuFin EOF )
            // InternalGame.g:230:1: ruleLieuFin EOF
            {
             before(grammarAccess.getLieuFinRule()); 
            pushFollow(FOLLOW_1);
            ruleLieuFin();

            state._fsp--;

             after(grammarAccess.getLieuFinRule()); 
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
    // $ANTLR end "entryRuleLieuFin"


    // $ANTLR start "ruleLieuFin"
    // InternalGame.g:237:1: ruleLieuFin : ( ( rule__LieuFin__Group__0 ) ) ;
    public final void ruleLieuFin() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:241:2: ( ( ( rule__LieuFin__Group__0 ) ) )
            // InternalGame.g:242:2: ( ( rule__LieuFin__Group__0 ) )
            {
            // InternalGame.g:242:2: ( ( rule__LieuFin__Group__0 ) )
            // InternalGame.g:243:3: ( rule__LieuFin__Group__0 )
            {
             before(grammarAccess.getLieuFinAccess().getGroup()); 
            // InternalGame.g:244:3: ( rule__LieuFin__Group__0 )
            // InternalGame.g:244:4: rule__LieuFin__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__LieuFin__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLieuFinAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLieuFin"


    // $ANTLR start "entryRulePersonnes"
    // InternalGame.g:253:1: entryRulePersonnes : rulePersonnes EOF ;
    public final void entryRulePersonnes() throws RecognitionException {
        try {
            // InternalGame.g:254:1: ( rulePersonnes EOF )
            // InternalGame.g:255:1: rulePersonnes EOF
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
    // InternalGame.g:262:1: rulePersonnes : ( ( rule__Personnes__Group__0 ) ) ;
    public final void rulePersonnes() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:266:2: ( ( ( rule__Personnes__Group__0 ) ) )
            // InternalGame.g:267:2: ( ( rule__Personnes__Group__0 ) )
            {
            // InternalGame.g:267:2: ( ( rule__Personnes__Group__0 ) )
            // InternalGame.g:268:3: ( rule__Personnes__Group__0 )
            {
             before(grammarAccess.getPersonnesAccess().getGroup()); 
            // InternalGame.g:269:3: ( rule__Personnes__Group__0 )
            // InternalGame.g:269:4: rule__Personnes__Group__0
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
    // InternalGame.g:278:1: entryRulePersonne : rulePersonne EOF ;
    public final void entryRulePersonne() throws RecognitionException {
        try {
            // InternalGame.g:279:1: ( rulePersonne EOF )
            // InternalGame.g:280:1: rulePersonne EOF
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
    // InternalGame.g:287:1: rulePersonne : ( ( rule__Personne__Group__0 ) ) ;
    public final void rulePersonne() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:291:2: ( ( ( rule__Personne__Group__0 ) ) )
            // InternalGame.g:292:2: ( ( rule__Personne__Group__0 ) )
            {
            // InternalGame.g:292:2: ( ( rule__Personne__Group__0 ) )
            // InternalGame.g:293:3: ( rule__Personne__Group__0 )
            {
             before(grammarAccess.getPersonneAccess().getGroup()); 
            // InternalGame.g:294:3: ( rule__Personne__Group__0 )
            // InternalGame.g:294:4: rule__Personne__Group__0
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
    // InternalGame.g:303:1: entryRuleInteraction : ruleInteraction EOF ;
    public final void entryRuleInteraction() throws RecognitionException {
        try {
            // InternalGame.g:304:1: ( ruleInteraction EOF )
            // InternalGame.g:305:1: ruleInteraction EOF
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
    // InternalGame.g:312:1: ruleInteraction : ( ( rule__Interaction__Group__0 ) ) ;
    public final void ruleInteraction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:316:2: ( ( ( rule__Interaction__Group__0 ) ) )
            // InternalGame.g:317:2: ( ( rule__Interaction__Group__0 ) )
            {
            // InternalGame.g:317:2: ( ( rule__Interaction__Group__0 ) )
            // InternalGame.g:318:3: ( rule__Interaction__Group__0 )
            {
             before(grammarAccess.getInteractionAccess().getGroup()); 
            // InternalGame.g:319:3: ( rule__Interaction__Group__0 )
            // InternalGame.g:319:4: rule__Interaction__Group__0
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
    // InternalGame.g:328:1: entryRuleChoix : ruleChoix EOF ;
    public final void entryRuleChoix() throws RecognitionException {
        try {
            // InternalGame.g:329:1: ( ruleChoix EOF )
            // InternalGame.g:330:1: ruleChoix EOF
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
    // InternalGame.g:337:1: ruleChoix : ( ( rule__Choix__Group__0 ) ) ;
    public final void ruleChoix() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:341:2: ( ( ( rule__Choix__Group__0 ) ) )
            // InternalGame.g:342:2: ( ( rule__Choix__Group__0 ) )
            {
            // InternalGame.g:342:2: ( ( rule__Choix__Group__0 ) )
            // InternalGame.g:343:3: ( rule__Choix__Group__0 )
            {
             before(grammarAccess.getChoixAccess().getGroup()); 
            // InternalGame.g:344:3: ( rule__Choix__Group__0 )
            // InternalGame.g:344:4: rule__Choix__Group__0
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
    // InternalGame.g:353:1: entryRuleObjet : ruleObjet EOF ;
    public final void entryRuleObjet() throws RecognitionException {
        try {
            // InternalGame.g:354:1: ( ruleObjet EOF )
            // InternalGame.g:355:1: ruleObjet EOF
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
    // InternalGame.g:362:1: ruleObjet : ( ( rule__Objet__Group__0 ) ) ;
    public final void ruleObjet() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:366:2: ( ( ( rule__Objet__Group__0 ) ) )
            // InternalGame.g:367:2: ( ( rule__Objet__Group__0 ) )
            {
            // InternalGame.g:367:2: ( ( rule__Objet__Group__0 ) )
            // InternalGame.g:368:3: ( rule__Objet__Group__0 )
            {
             before(grammarAccess.getObjetAccess().getGroup()); 
            // InternalGame.g:369:3: ( rule__Objet__Group__0 )
            // InternalGame.g:369:4: rule__Objet__Group__0
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


    // $ANTLR start "entryRuleObjets"
    // InternalGame.g:378:1: entryRuleObjets : ruleObjets EOF ;
    public final void entryRuleObjets() throws RecognitionException {
        try {
            // InternalGame.g:379:1: ( ruleObjets EOF )
            // InternalGame.g:380:1: ruleObjets EOF
            {
             before(grammarAccess.getObjetsRule()); 
            pushFollow(FOLLOW_1);
            ruleObjets();

            state._fsp--;

             after(grammarAccess.getObjetsRule()); 
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
    // $ANTLR end "entryRuleObjets"


    // $ANTLR start "ruleObjets"
    // InternalGame.g:387:1: ruleObjets : ( ( rule__Objets__Group__0 ) ) ;
    public final void ruleObjets() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:391:2: ( ( ( rule__Objets__Group__0 ) ) )
            // InternalGame.g:392:2: ( ( rule__Objets__Group__0 ) )
            {
            // InternalGame.g:392:2: ( ( rule__Objets__Group__0 ) )
            // InternalGame.g:393:3: ( rule__Objets__Group__0 )
            {
             before(grammarAccess.getObjetsAccess().getGroup()); 
            // InternalGame.g:394:3: ( rule__Objets__Group__0 )
            // InternalGame.g:394:4: rule__Objets__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Objets__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getObjetsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleObjets"


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


    // $ANTLR start "rule__Game__Group__0"
    // InternalGame.g:452:1: rule__Game__Group__0 : rule__Game__Group__0__Impl rule__Game__Group__1 ;
    public final void rule__Game__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:456:1: ( rule__Game__Group__0__Impl rule__Game__Group__1 )
            // InternalGame.g:457:2: rule__Game__Group__0__Impl rule__Game__Group__1
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
    // InternalGame.g:464:1: rule__Game__Group__0__Impl : ( 'Game' ) ;
    public final void rule__Game__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:468:1: ( ( 'Game' ) )
            // InternalGame.g:469:1: ( 'Game' )
            {
            // InternalGame.g:469:1: ( 'Game' )
            // InternalGame.g:470:2: 'Game'
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
    // InternalGame.g:479:1: rule__Game__Group__1 : rule__Game__Group__1__Impl rule__Game__Group__2 ;
    public final void rule__Game__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:483:1: ( rule__Game__Group__1__Impl rule__Game__Group__2 )
            // InternalGame.g:484:2: rule__Game__Group__1__Impl rule__Game__Group__2
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
    // InternalGame.g:491:1: rule__Game__Group__1__Impl : ( ( rule__Game__NameAssignment_1 ) ) ;
    public final void rule__Game__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:495:1: ( ( ( rule__Game__NameAssignment_1 ) ) )
            // InternalGame.g:496:1: ( ( rule__Game__NameAssignment_1 ) )
            {
            // InternalGame.g:496:1: ( ( rule__Game__NameAssignment_1 ) )
            // InternalGame.g:497:2: ( rule__Game__NameAssignment_1 )
            {
             before(grammarAccess.getGameAccess().getNameAssignment_1()); 
            // InternalGame.g:498:2: ( rule__Game__NameAssignment_1 )
            // InternalGame.g:498:3: rule__Game__NameAssignment_1
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
    // InternalGame.g:506:1: rule__Game__Group__2 : rule__Game__Group__2__Impl rule__Game__Group__3 ;
    public final void rule__Game__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:510:1: ( rule__Game__Group__2__Impl rule__Game__Group__3 )
            // InternalGame.g:511:2: rule__Game__Group__2__Impl rule__Game__Group__3
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
    // InternalGame.g:518:1: rule__Game__Group__2__Impl : ( '{' ) ;
    public final void rule__Game__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:522:1: ( ( '{' ) )
            // InternalGame.g:523:1: ( '{' )
            {
            // InternalGame.g:523:1: ( '{' )
            // InternalGame.g:524:2: '{'
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
    // InternalGame.g:533:1: rule__Game__Group__3 : rule__Game__Group__3__Impl rule__Game__Group__4 ;
    public final void rule__Game__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:537:1: ( rule__Game__Group__3__Impl rule__Game__Group__4 )
            // InternalGame.g:538:2: rule__Game__Group__3__Impl rule__Game__Group__4
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
    // InternalGame.g:545:1: rule__Game__Group__3__Impl : ( ( rule__Game__GameElementsAssignment_3 ) ) ;
    public final void rule__Game__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:549:1: ( ( ( rule__Game__GameElementsAssignment_3 ) ) )
            // InternalGame.g:550:1: ( ( rule__Game__GameElementsAssignment_3 ) )
            {
            // InternalGame.g:550:1: ( ( rule__Game__GameElementsAssignment_3 ) )
            // InternalGame.g:551:2: ( rule__Game__GameElementsAssignment_3 )
            {
             before(grammarAccess.getGameAccess().getGameElementsAssignment_3()); 
            // InternalGame.g:552:2: ( rule__Game__GameElementsAssignment_3 )
            // InternalGame.g:552:3: rule__Game__GameElementsAssignment_3
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
    // InternalGame.g:560:1: rule__Game__Group__4 : rule__Game__Group__4__Impl ;
    public final void rule__Game__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:564:1: ( rule__Game__Group__4__Impl )
            // InternalGame.g:565:2: rule__Game__Group__4__Impl
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
    // InternalGame.g:571:1: rule__Game__Group__4__Impl : ( '}' ) ;
    public final void rule__Game__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:575:1: ( ( '}' ) )
            // InternalGame.g:576:1: ( '}' )
            {
            // InternalGame.g:576:1: ( '}' )
            // InternalGame.g:577:2: '}'
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


    // $ANTLR start "rule__Territoire__Group__0"
    // InternalGame.g:587:1: rule__Territoire__Group__0 : rule__Territoire__Group__0__Impl rule__Territoire__Group__1 ;
    public final void rule__Territoire__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:591:1: ( rule__Territoire__Group__0__Impl rule__Territoire__Group__1 )
            // InternalGame.g:592:2: rule__Territoire__Group__0__Impl rule__Territoire__Group__1
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
    // InternalGame.g:599:1: rule__Territoire__Group__0__Impl : ( 'territoire' ) ;
    public final void rule__Territoire__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:603:1: ( ( 'territoire' ) )
            // InternalGame.g:604:1: ( 'territoire' )
            {
            // InternalGame.g:604:1: ( 'territoire' )
            // InternalGame.g:605:2: 'territoire'
            {
             before(grammarAccess.getTerritoireAccess().getTerritoireKeyword_0()); 
            match(input,14,FOLLOW_2); 
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
    // InternalGame.g:614:1: rule__Territoire__Group__1 : rule__Territoire__Group__1__Impl rule__Territoire__Group__2 ;
    public final void rule__Territoire__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:618:1: ( rule__Territoire__Group__1__Impl rule__Territoire__Group__2 )
            // InternalGame.g:619:2: rule__Territoire__Group__1__Impl rule__Territoire__Group__2
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
    // InternalGame.g:626:1: rule__Territoire__Group__1__Impl : ( ( rule__Territoire__NameAssignment_1 ) ) ;
    public final void rule__Territoire__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:630:1: ( ( ( rule__Territoire__NameAssignment_1 ) ) )
            // InternalGame.g:631:1: ( ( rule__Territoire__NameAssignment_1 ) )
            {
            // InternalGame.g:631:1: ( ( rule__Territoire__NameAssignment_1 ) )
            // InternalGame.g:632:2: ( rule__Territoire__NameAssignment_1 )
            {
             before(grammarAccess.getTerritoireAccess().getNameAssignment_1()); 
            // InternalGame.g:633:2: ( rule__Territoire__NameAssignment_1 )
            // InternalGame.g:633:3: rule__Territoire__NameAssignment_1
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
    // InternalGame.g:641:1: rule__Territoire__Group__2 : rule__Territoire__Group__2__Impl rule__Territoire__Group__3 ;
    public final void rule__Territoire__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:645:1: ( rule__Territoire__Group__2__Impl rule__Territoire__Group__3 )
            // InternalGame.g:646:2: rule__Territoire__Group__2__Impl rule__Territoire__Group__3
            {
            pushFollow(FOLLOW_7);
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
    // InternalGame.g:653:1: rule__Territoire__Group__2__Impl : ( '{' ) ;
    public final void rule__Territoire__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:657:1: ( ( '{' ) )
            // InternalGame.g:658:1: ( '{' )
            {
            // InternalGame.g:658:1: ( '{' )
            // InternalGame.g:659:2: '{'
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
    // InternalGame.g:668:1: rule__Territoire__Group__3 : rule__Territoire__Group__3__Impl rule__Territoire__Group__4 ;
    public final void rule__Territoire__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:672:1: ( rule__Territoire__Group__3__Impl rule__Territoire__Group__4 )
            // InternalGame.g:673:2: rule__Territoire__Group__3__Impl rule__Territoire__Group__4
            {
            pushFollow(FOLLOW_8);
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
    // InternalGame.g:680:1: rule__Territoire__Group__3__Impl : ( ( rule__Territoire__TerritoireElementsAssignment_3 ) ) ;
    public final void rule__Territoire__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:684:1: ( ( ( rule__Territoire__TerritoireElementsAssignment_3 ) ) )
            // InternalGame.g:685:1: ( ( rule__Territoire__TerritoireElementsAssignment_3 ) )
            {
            // InternalGame.g:685:1: ( ( rule__Territoire__TerritoireElementsAssignment_3 ) )
            // InternalGame.g:686:2: ( rule__Territoire__TerritoireElementsAssignment_3 )
            {
             before(grammarAccess.getTerritoireAccess().getTerritoireElementsAssignment_3()); 
            // InternalGame.g:687:2: ( rule__Territoire__TerritoireElementsAssignment_3 )
            // InternalGame.g:687:3: rule__Territoire__TerritoireElementsAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Territoire__TerritoireElementsAssignment_3();

            state._fsp--;


            }

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
    // InternalGame.g:695:1: rule__Territoire__Group__4 : rule__Territoire__Group__4__Impl rule__Territoire__Group__5 ;
    public final void rule__Territoire__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:699:1: ( rule__Territoire__Group__4__Impl rule__Territoire__Group__5 )
            // InternalGame.g:700:2: rule__Territoire__Group__4__Impl rule__Territoire__Group__5
            {
            pushFollow(FOLLOW_9);
            rule__Territoire__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Territoire__Group__5();

            state._fsp--;


            }

        }
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
    // InternalGame.g:707:1: rule__Territoire__Group__4__Impl : ( ( rule__Territoire__TerritoireElementsAssignment_4 ) ) ;
    public final void rule__Territoire__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:711:1: ( ( ( rule__Territoire__TerritoireElementsAssignment_4 ) ) )
            // InternalGame.g:712:1: ( ( rule__Territoire__TerritoireElementsAssignment_4 ) )
            {
            // InternalGame.g:712:1: ( ( rule__Territoire__TerritoireElementsAssignment_4 ) )
            // InternalGame.g:713:2: ( rule__Territoire__TerritoireElementsAssignment_4 )
            {
             before(grammarAccess.getTerritoireAccess().getTerritoireElementsAssignment_4()); 
            // InternalGame.g:714:2: ( rule__Territoire__TerritoireElementsAssignment_4 )
            // InternalGame.g:714:3: rule__Territoire__TerritoireElementsAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Territoire__TerritoireElementsAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getTerritoireAccess().getTerritoireElementsAssignment_4()); 

            }


            }

        }
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


    // $ANTLR start "rule__Territoire__Group__5"
    // InternalGame.g:722:1: rule__Territoire__Group__5 : rule__Territoire__Group__5__Impl rule__Territoire__Group__6 ;
    public final void rule__Territoire__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:726:1: ( rule__Territoire__Group__5__Impl rule__Territoire__Group__6 )
            // InternalGame.g:727:2: rule__Territoire__Group__5__Impl rule__Territoire__Group__6
            {
            pushFollow(FOLLOW_10);
            rule__Territoire__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Territoire__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Territoire__Group__5"


    // $ANTLR start "rule__Territoire__Group__5__Impl"
    // InternalGame.g:734:1: rule__Territoire__Group__5__Impl : ( ( ( rule__Territoire__TerritoireElementsAssignment_5 ) ) ( ( rule__Territoire__TerritoireElementsAssignment_5 )* ) ) ;
    public final void rule__Territoire__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:738:1: ( ( ( ( rule__Territoire__TerritoireElementsAssignment_5 ) ) ( ( rule__Territoire__TerritoireElementsAssignment_5 )* ) ) )
            // InternalGame.g:739:1: ( ( ( rule__Territoire__TerritoireElementsAssignment_5 ) ) ( ( rule__Territoire__TerritoireElementsAssignment_5 )* ) )
            {
            // InternalGame.g:739:1: ( ( ( rule__Territoire__TerritoireElementsAssignment_5 ) ) ( ( rule__Territoire__TerritoireElementsAssignment_5 )* ) )
            // InternalGame.g:740:2: ( ( rule__Territoire__TerritoireElementsAssignment_5 ) ) ( ( rule__Territoire__TerritoireElementsAssignment_5 )* )
            {
            // InternalGame.g:740:2: ( ( rule__Territoire__TerritoireElementsAssignment_5 ) )
            // InternalGame.g:741:3: ( rule__Territoire__TerritoireElementsAssignment_5 )
            {
             before(grammarAccess.getTerritoireAccess().getTerritoireElementsAssignment_5()); 
            // InternalGame.g:742:3: ( rule__Territoire__TerritoireElementsAssignment_5 )
            // InternalGame.g:742:4: rule__Territoire__TerritoireElementsAssignment_5
            {
            pushFollow(FOLLOW_11);
            rule__Territoire__TerritoireElementsAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getTerritoireAccess().getTerritoireElementsAssignment_5()); 

            }

            // InternalGame.g:745:2: ( ( rule__Territoire__TerritoireElementsAssignment_5 )* )
            // InternalGame.g:746:3: ( rule__Territoire__TerritoireElementsAssignment_5 )*
            {
             before(grammarAccess.getTerritoireAccess().getTerritoireElementsAssignment_5()); 
            // InternalGame.g:747:3: ( rule__Territoire__TerritoireElementsAssignment_5 )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==19) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalGame.g:747:4: rule__Territoire__TerritoireElementsAssignment_5
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Territoire__TerritoireElementsAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getTerritoireAccess().getTerritoireElementsAssignment_5()); 

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
    // $ANTLR end "rule__Territoire__Group__5__Impl"


    // $ANTLR start "rule__Territoire__Group__6"
    // InternalGame.g:756:1: rule__Territoire__Group__6 : rule__Territoire__Group__6__Impl rule__Territoire__Group__7 ;
    public final void rule__Territoire__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:760:1: ( rule__Territoire__Group__6__Impl rule__Territoire__Group__7 )
            // InternalGame.g:761:2: rule__Territoire__Group__6__Impl rule__Territoire__Group__7
            {
            pushFollow(FOLLOW_10);
            rule__Territoire__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Territoire__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Territoire__Group__6"


    // $ANTLR start "rule__Territoire__Group__6__Impl"
    // InternalGame.g:768:1: rule__Territoire__Group__6__Impl : ( ( rule__Territoire__TerritoireElementsAssignment_6 )* ) ;
    public final void rule__Territoire__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:772:1: ( ( ( rule__Territoire__TerritoireElementsAssignment_6 )* ) )
            // InternalGame.g:773:1: ( ( rule__Territoire__TerritoireElementsAssignment_6 )* )
            {
            // InternalGame.g:773:1: ( ( rule__Territoire__TerritoireElementsAssignment_6 )* )
            // InternalGame.g:774:2: ( rule__Territoire__TerritoireElementsAssignment_6 )*
            {
             before(grammarAccess.getTerritoireAccess().getTerritoireElementsAssignment_6()); 
            // InternalGame.g:775:2: ( rule__Territoire__TerritoireElementsAssignment_6 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==17) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalGame.g:775:3: rule__Territoire__TerritoireElementsAssignment_6
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__Territoire__TerritoireElementsAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             after(grammarAccess.getTerritoireAccess().getTerritoireElementsAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Territoire__Group__6__Impl"


    // $ANTLR start "rule__Territoire__Group__7"
    // InternalGame.g:783:1: rule__Territoire__Group__7 : rule__Territoire__Group__7__Impl ;
    public final void rule__Territoire__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:787:1: ( rule__Territoire__Group__7__Impl )
            // InternalGame.g:788:2: rule__Territoire__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Territoire__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Territoire__Group__7"


    // $ANTLR start "rule__Territoire__Group__7__Impl"
    // InternalGame.g:794:1: rule__Territoire__Group__7__Impl : ( '}' ) ;
    public final void rule__Territoire__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:798:1: ( ( '}' ) )
            // InternalGame.g:799:1: ( '}' )
            {
            // InternalGame.g:799:1: ( '}' )
            // InternalGame.g:800:2: '}'
            {
             before(grammarAccess.getTerritoireAccess().getRightCurlyBracketKeyword_7()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getTerritoireAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Territoire__Group__7__Impl"


    // $ANTLR start "rule__Explorateur__Group__0"
    // InternalGame.g:810:1: rule__Explorateur__Group__0 : rule__Explorateur__Group__0__Impl rule__Explorateur__Group__1 ;
    public final void rule__Explorateur__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:814:1: ( rule__Explorateur__Group__0__Impl rule__Explorateur__Group__1 )
            // InternalGame.g:815:2: rule__Explorateur__Group__0__Impl rule__Explorateur__Group__1
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
    // InternalGame.g:822:1: rule__Explorateur__Group__0__Impl : ( 'explorateur' ) ;
    public final void rule__Explorateur__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:826:1: ( ( 'explorateur' ) )
            // InternalGame.g:827:1: ( 'explorateur' )
            {
            // InternalGame.g:827:1: ( 'explorateur' )
            // InternalGame.g:828:2: 'explorateur'
            {
             before(grammarAccess.getExplorateurAccess().getExplorateurKeyword_0()); 
            match(input,15,FOLLOW_2); 
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
    // InternalGame.g:837:1: rule__Explorateur__Group__1 : rule__Explorateur__Group__1__Impl rule__Explorateur__Group__2 ;
    public final void rule__Explorateur__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:841:1: ( rule__Explorateur__Group__1__Impl rule__Explorateur__Group__2 )
            // InternalGame.g:842:2: rule__Explorateur__Group__1__Impl rule__Explorateur__Group__2
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
    // InternalGame.g:849:1: rule__Explorateur__Group__1__Impl : ( ( rule__Explorateur__NameAssignment_1 ) ) ;
    public final void rule__Explorateur__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:853:1: ( ( ( rule__Explorateur__NameAssignment_1 ) ) )
            // InternalGame.g:854:1: ( ( rule__Explorateur__NameAssignment_1 ) )
            {
            // InternalGame.g:854:1: ( ( rule__Explorateur__NameAssignment_1 ) )
            // InternalGame.g:855:2: ( rule__Explorateur__NameAssignment_1 )
            {
             before(grammarAccess.getExplorateurAccess().getNameAssignment_1()); 
            // InternalGame.g:856:2: ( rule__Explorateur__NameAssignment_1 )
            // InternalGame.g:856:3: rule__Explorateur__NameAssignment_1
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
    // InternalGame.g:864:1: rule__Explorateur__Group__2 : rule__Explorateur__Group__2__Impl rule__Explorateur__Group__3 ;
    public final void rule__Explorateur__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:868:1: ( rule__Explorateur__Group__2__Impl rule__Explorateur__Group__3 )
            // InternalGame.g:869:2: rule__Explorateur__Group__2__Impl rule__Explorateur__Group__3
            {
            pushFollow(FOLLOW_13);
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
    // InternalGame.g:876:1: rule__Explorateur__Group__2__Impl : ( '{' ) ;
    public final void rule__Explorateur__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:880:1: ( ( '{' ) )
            // InternalGame.g:881:1: ( '{' )
            {
            // InternalGame.g:881:1: ( '{' )
            // InternalGame.g:882:2: '{'
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
    // InternalGame.g:891:1: rule__Explorateur__Group__3 : rule__Explorateur__Group__3__Impl rule__Explorateur__Group__4 ;
    public final void rule__Explorateur__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:895:1: ( rule__Explorateur__Group__3__Impl rule__Explorateur__Group__4 )
            // InternalGame.g:896:2: rule__Explorateur__Group__3__Impl rule__Explorateur__Group__4
            {
            pushFollow(FOLLOW_14);
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
    // InternalGame.g:903:1: rule__Explorateur__Group__3__Impl : ( ( rule__Explorateur__ExplorateurElementsAssignment_3 ) ) ;
    public final void rule__Explorateur__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:907:1: ( ( ( rule__Explorateur__ExplorateurElementsAssignment_3 ) ) )
            // InternalGame.g:908:1: ( ( rule__Explorateur__ExplorateurElementsAssignment_3 ) )
            {
            // InternalGame.g:908:1: ( ( rule__Explorateur__ExplorateurElementsAssignment_3 ) )
            // InternalGame.g:909:2: ( rule__Explorateur__ExplorateurElementsAssignment_3 )
            {
             before(grammarAccess.getExplorateurAccess().getExplorateurElementsAssignment_3()); 
            // InternalGame.g:910:2: ( rule__Explorateur__ExplorateurElementsAssignment_3 )
            // InternalGame.g:910:3: rule__Explorateur__ExplorateurElementsAssignment_3
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
    // InternalGame.g:918:1: rule__Explorateur__Group__4 : rule__Explorateur__Group__4__Impl rule__Explorateur__Group__5 ;
    public final void rule__Explorateur__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:922:1: ( rule__Explorateur__Group__4__Impl rule__Explorateur__Group__5 )
            // InternalGame.g:923:2: rule__Explorateur__Group__4__Impl rule__Explorateur__Group__5
            {
            pushFollow(FOLLOW_14);
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
    // InternalGame.g:930:1: rule__Explorateur__Group__4__Impl : ( ( rule__Explorateur__ExplorateurElementsAssignment_4 )? ) ;
    public final void rule__Explorateur__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:934:1: ( ( ( rule__Explorateur__ExplorateurElementsAssignment_4 )? ) )
            // InternalGame.g:935:1: ( ( rule__Explorateur__ExplorateurElementsAssignment_4 )? )
            {
            // InternalGame.g:935:1: ( ( rule__Explorateur__ExplorateurElementsAssignment_4 )? )
            // InternalGame.g:936:2: ( rule__Explorateur__ExplorateurElementsAssignment_4 )?
            {
             before(grammarAccess.getExplorateurAccess().getExplorateurElementsAssignment_4()); 
            // InternalGame.g:937:2: ( rule__Explorateur__ExplorateurElementsAssignment_4 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==29) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalGame.g:937:3: rule__Explorateur__ExplorateurElementsAssignment_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__Explorateur__ExplorateurElementsAssignment_4();

                    state._fsp--;


                    }
                    break;

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
    // InternalGame.g:945:1: rule__Explorateur__Group__5 : rule__Explorateur__Group__5__Impl rule__Explorateur__Group__6 ;
    public final void rule__Explorateur__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:949:1: ( rule__Explorateur__Group__5__Impl rule__Explorateur__Group__6 )
            // InternalGame.g:950:2: rule__Explorateur__Group__5__Impl rule__Explorateur__Group__6
            {
            pushFollow(FOLLOW_14);
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
    // InternalGame.g:957:1: rule__Explorateur__Group__5__Impl : ( ( rule__Explorateur__ExplorateurElementsAssignment_5 )? ) ;
    public final void rule__Explorateur__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:961:1: ( ( ( rule__Explorateur__ExplorateurElementsAssignment_5 )? ) )
            // InternalGame.g:962:1: ( ( rule__Explorateur__ExplorateurElementsAssignment_5 )? )
            {
            // InternalGame.g:962:1: ( ( rule__Explorateur__ExplorateurElementsAssignment_5 )? )
            // InternalGame.g:963:2: ( rule__Explorateur__ExplorateurElementsAssignment_5 )?
            {
             before(grammarAccess.getExplorateurAccess().getExplorateurElementsAssignment_5()); 
            // InternalGame.g:964:2: ( rule__Explorateur__ExplorateurElementsAssignment_5 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==17) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalGame.g:964:3: rule__Explorateur__ExplorateurElementsAssignment_5
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
    // InternalGame.g:972:1: rule__Explorateur__Group__6 : rule__Explorateur__Group__6__Impl ;
    public final void rule__Explorateur__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:976:1: ( rule__Explorateur__Group__6__Impl )
            // InternalGame.g:977:2: rule__Explorateur__Group__6__Impl
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
    // InternalGame.g:983:1: rule__Explorateur__Group__6__Impl : ( '}' ) ;
    public final void rule__Explorateur__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:987:1: ( ( '}' ) )
            // InternalGame.g:988:1: ( '}' )
            {
            // InternalGame.g:988:1: ( '}' )
            // InternalGame.g:989:2: '}'
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
    // InternalGame.g:999:1: rule__Sac__Group__0 : rule__Sac__Group__0__Impl rule__Sac__Group__1 ;
    public final void rule__Sac__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1003:1: ( rule__Sac__Group__0__Impl rule__Sac__Group__1 )
            // InternalGame.g:1004:2: rule__Sac__Group__0__Impl rule__Sac__Group__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalGame.g:1011:1: rule__Sac__Group__0__Impl : ( 'sac' ) ;
    public final void rule__Sac__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1015:1: ( ( 'sac' ) )
            // InternalGame.g:1016:1: ( 'sac' )
            {
            // InternalGame.g:1016:1: ( 'sac' )
            // InternalGame.g:1017:2: 'sac'
            {
             before(grammarAccess.getSacAccess().getSacKeyword_0()); 
            match(input,16,FOLLOW_2); 
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
    // InternalGame.g:1026:1: rule__Sac__Group__1 : rule__Sac__Group__1__Impl rule__Sac__Group__2 ;
    public final void rule__Sac__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1030:1: ( rule__Sac__Group__1__Impl rule__Sac__Group__2 )
            // InternalGame.g:1031:2: rule__Sac__Group__1__Impl rule__Sac__Group__2
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
    // InternalGame.g:1038:1: rule__Sac__Group__1__Impl : ( ( rule__Sac__TailleAssignment_1 ) ) ;
    public final void rule__Sac__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1042:1: ( ( ( rule__Sac__TailleAssignment_1 ) ) )
            // InternalGame.g:1043:1: ( ( rule__Sac__TailleAssignment_1 ) )
            {
            // InternalGame.g:1043:1: ( ( rule__Sac__TailleAssignment_1 ) )
            // InternalGame.g:1044:2: ( rule__Sac__TailleAssignment_1 )
            {
             before(grammarAccess.getSacAccess().getTailleAssignment_1()); 
            // InternalGame.g:1045:2: ( rule__Sac__TailleAssignment_1 )
            // InternalGame.g:1045:3: rule__Sac__TailleAssignment_1
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
    // InternalGame.g:1053:1: rule__Sac__Group__2 : rule__Sac__Group__2__Impl rule__Sac__Group__3 ;
    public final void rule__Sac__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1057:1: ( rule__Sac__Group__2__Impl rule__Sac__Group__3 )
            // InternalGame.g:1058:2: rule__Sac__Group__2__Impl rule__Sac__Group__3
            {
            pushFollow(FOLLOW_16);
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
    // InternalGame.g:1065:1: rule__Sac__Group__2__Impl : ( '{' ) ;
    public final void rule__Sac__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1069:1: ( ( '{' ) )
            // InternalGame.g:1070:1: ( '{' )
            {
            // InternalGame.g:1070:1: ( '{' )
            // InternalGame.g:1071:2: '{'
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
    // InternalGame.g:1080:1: rule__Sac__Group__3 : rule__Sac__Group__3__Impl rule__Sac__Group__4 ;
    public final void rule__Sac__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1084:1: ( rule__Sac__Group__3__Impl rule__Sac__Group__4 )
            // InternalGame.g:1085:2: rule__Sac__Group__3__Impl rule__Sac__Group__4
            {
            pushFollow(FOLLOW_16);
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
    // InternalGame.g:1092:1: rule__Sac__Group__3__Impl : ( ( rule__Sac__SacElementsAssignment_3 )* ) ;
    public final void rule__Sac__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1096:1: ( ( ( rule__Sac__SacElementsAssignment_3 )* ) )
            // InternalGame.g:1097:1: ( ( rule__Sac__SacElementsAssignment_3 )* )
            {
            // InternalGame.g:1097:1: ( ( rule__Sac__SacElementsAssignment_3 )* )
            // InternalGame.g:1098:2: ( rule__Sac__SacElementsAssignment_3 )*
            {
             before(grammarAccess.getSacAccess().getSacElementsAssignment_3()); 
            // InternalGame.g:1099:2: ( rule__Sac__SacElementsAssignment_3 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==27) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalGame.g:1099:3: rule__Sac__SacElementsAssignment_3
            	    {
            	    pushFollow(FOLLOW_17);
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
    // InternalGame.g:1107:1: rule__Sac__Group__4 : rule__Sac__Group__4__Impl ;
    public final void rule__Sac__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1111:1: ( rule__Sac__Group__4__Impl )
            // InternalGame.g:1112:2: rule__Sac__Group__4__Impl
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
    // InternalGame.g:1118:1: rule__Sac__Group__4__Impl : ( '}' ) ;
    public final void rule__Sac__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1122:1: ( ( '}' ) )
            // InternalGame.g:1123:1: ( '}' )
            {
            // InternalGame.g:1123:1: ( '}' )
            // InternalGame.g:1124:2: '}'
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


    // $ANTLR start "rule__Lieu__Group__0"
    // InternalGame.g:1134:1: rule__Lieu__Group__0 : rule__Lieu__Group__0__Impl rule__Lieu__Group__1 ;
    public final void rule__Lieu__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1138:1: ( rule__Lieu__Group__0__Impl rule__Lieu__Group__1 )
            // InternalGame.g:1139:2: rule__Lieu__Group__0__Impl rule__Lieu__Group__1
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
    // InternalGame.g:1146:1: rule__Lieu__Group__0__Impl : ( 'lieu' ) ;
    public final void rule__Lieu__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1150:1: ( ( 'lieu' ) )
            // InternalGame.g:1151:1: ( 'lieu' )
            {
            // InternalGame.g:1151:1: ( 'lieu' )
            // InternalGame.g:1152:2: 'lieu'
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
    // InternalGame.g:1161:1: rule__Lieu__Group__1 : rule__Lieu__Group__1__Impl rule__Lieu__Group__2 ;
    public final void rule__Lieu__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1165:1: ( rule__Lieu__Group__1__Impl rule__Lieu__Group__2 )
            // InternalGame.g:1166:2: rule__Lieu__Group__1__Impl rule__Lieu__Group__2
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
    // InternalGame.g:1173:1: rule__Lieu__Group__1__Impl : ( ( rule__Lieu__NameAssignment_1 ) ) ;
    public final void rule__Lieu__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1177:1: ( ( ( rule__Lieu__NameAssignment_1 ) ) )
            // InternalGame.g:1178:1: ( ( rule__Lieu__NameAssignment_1 ) )
            {
            // InternalGame.g:1178:1: ( ( rule__Lieu__NameAssignment_1 ) )
            // InternalGame.g:1179:2: ( rule__Lieu__NameAssignment_1 )
            {
             before(grammarAccess.getLieuAccess().getNameAssignment_1()); 
            // InternalGame.g:1180:2: ( rule__Lieu__NameAssignment_1 )
            // InternalGame.g:1180:3: rule__Lieu__NameAssignment_1
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
    // InternalGame.g:1188:1: rule__Lieu__Group__2 : rule__Lieu__Group__2__Impl rule__Lieu__Group__3 ;
    public final void rule__Lieu__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1192:1: ( rule__Lieu__Group__2__Impl rule__Lieu__Group__3 )
            // InternalGame.g:1193:2: rule__Lieu__Group__2__Impl rule__Lieu__Group__3
            {
            pushFollow(FOLLOW_18);
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
    // InternalGame.g:1200:1: rule__Lieu__Group__2__Impl : ( '{' ) ;
    public final void rule__Lieu__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1204:1: ( ( '{' ) )
            // InternalGame.g:1205:1: ( '{' )
            {
            // InternalGame.g:1205:1: ( '{' )
            // InternalGame.g:1206:2: '{'
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
    // InternalGame.g:1215:1: rule__Lieu__Group__3 : rule__Lieu__Group__3__Impl rule__Lieu__Group__4 ;
    public final void rule__Lieu__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1219:1: ( rule__Lieu__Group__3__Impl rule__Lieu__Group__4 )
            // InternalGame.g:1220:2: rule__Lieu__Group__3__Impl rule__Lieu__Group__4
            {
            pushFollow(FOLLOW_18);
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
    // InternalGame.g:1227:1: rule__Lieu__Group__3__Impl : ( ( rule__Lieu__LieuElementsAssignment_3 )? ) ;
    public final void rule__Lieu__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1231:1: ( ( ( rule__Lieu__LieuElementsAssignment_3 )? ) )
            // InternalGame.g:1232:1: ( ( rule__Lieu__LieuElementsAssignment_3 )? )
            {
            // InternalGame.g:1232:1: ( ( rule__Lieu__LieuElementsAssignment_3 )? )
            // InternalGame.g:1233:2: ( rule__Lieu__LieuElementsAssignment_3 )?
            {
             before(grammarAccess.getLieuAccess().getLieuElementsAssignment_3()); 
            // InternalGame.g:1234:2: ( rule__Lieu__LieuElementsAssignment_3 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==20) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalGame.g:1234:3: rule__Lieu__LieuElementsAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__Lieu__LieuElementsAssignment_3();

                    state._fsp--;


                    }
                    break;

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
    // InternalGame.g:1242:1: rule__Lieu__Group__4 : rule__Lieu__Group__4__Impl rule__Lieu__Group__5 ;
    public final void rule__Lieu__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1246:1: ( rule__Lieu__Group__4__Impl rule__Lieu__Group__5 )
            // InternalGame.g:1247:2: rule__Lieu__Group__4__Impl rule__Lieu__Group__5
            {
            pushFollow(FOLLOW_18);
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
    // InternalGame.g:1254:1: rule__Lieu__Group__4__Impl : ( ( rule__Lieu__LieuElementsAssignment_4 )? ) ;
    public final void rule__Lieu__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1258:1: ( ( ( rule__Lieu__LieuElementsAssignment_4 )? ) )
            // InternalGame.g:1259:1: ( ( rule__Lieu__LieuElementsAssignment_4 )? )
            {
            // InternalGame.g:1259:1: ( ( rule__Lieu__LieuElementsAssignment_4 )? )
            // InternalGame.g:1260:2: ( rule__Lieu__LieuElementsAssignment_4 )?
            {
             before(grammarAccess.getLieuAccess().getLieuElementsAssignment_4()); 
            // InternalGame.g:1261:2: ( rule__Lieu__LieuElementsAssignment_4 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==29) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalGame.g:1261:3: rule__Lieu__LieuElementsAssignment_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__Lieu__LieuElementsAssignment_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLieuAccess().getLieuElementsAssignment_4()); 

            }


            }

        }
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
    // InternalGame.g:1269:1: rule__Lieu__Group__5 : rule__Lieu__Group__5__Impl rule__Lieu__Group__6 ;
    public final void rule__Lieu__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1273:1: ( rule__Lieu__Group__5__Impl rule__Lieu__Group__6 )
            // InternalGame.g:1274:2: rule__Lieu__Group__5__Impl rule__Lieu__Group__6
            {
            pushFollow(FOLLOW_18);
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
    // InternalGame.g:1281:1: rule__Lieu__Group__5__Impl : ( ( rule__Lieu__LieuElementsAssignment_5 )? ) ;
    public final void rule__Lieu__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1285:1: ( ( ( rule__Lieu__LieuElementsAssignment_5 )? ) )
            // InternalGame.g:1286:1: ( ( rule__Lieu__LieuElementsAssignment_5 )? )
            {
            // InternalGame.g:1286:1: ( ( rule__Lieu__LieuElementsAssignment_5 )? )
            // InternalGame.g:1287:2: ( rule__Lieu__LieuElementsAssignment_5 )?
            {
             before(grammarAccess.getLieuAccess().getLieuElementsAssignment_5()); 
            // InternalGame.g:1288:2: ( rule__Lieu__LieuElementsAssignment_5 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==28) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalGame.g:1288:3: rule__Lieu__LieuElementsAssignment_5
                    {
                    pushFollow(FOLLOW_2);
                    rule__Lieu__LieuElementsAssignment_5();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLieuAccess().getLieuElementsAssignment_5()); 

            }


            }

        }
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
    // InternalGame.g:1296:1: rule__Lieu__Group__6 : rule__Lieu__Group__6__Impl ;
    public final void rule__Lieu__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1300:1: ( rule__Lieu__Group__6__Impl )
            // InternalGame.g:1301:2: rule__Lieu__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Lieu__Group__6__Impl();

            state._fsp--;


            }

        }
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
    // InternalGame.g:1307:1: rule__Lieu__Group__6__Impl : ( '}' ) ;
    public final void rule__Lieu__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1311:1: ( ( '}' ) )
            // InternalGame.g:1312:1: ( '}' )
            {
            // InternalGame.g:1312:1: ( '}' )
            // InternalGame.g:1313:2: '}'
            {
             before(grammarAccess.getLieuAccess().getRightCurlyBracketKeyword_6()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getLieuAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
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


    // $ANTLR start "rule__LieuDebut__Group__0"
    // InternalGame.g:1323:1: rule__LieuDebut__Group__0 : rule__LieuDebut__Group__0__Impl rule__LieuDebut__Group__1 ;
    public final void rule__LieuDebut__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1327:1: ( rule__LieuDebut__Group__0__Impl rule__LieuDebut__Group__1 )
            // InternalGame.g:1328:2: rule__LieuDebut__Group__0__Impl rule__LieuDebut__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__LieuDebut__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LieuDebut__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LieuDebut__Group__0"


    // $ANTLR start "rule__LieuDebut__Group__0__Impl"
    // InternalGame.g:1335:1: rule__LieuDebut__Group__0__Impl : ( 'lieudebut' ) ;
    public final void rule__LieuDebut__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1339:1: ( ( 'lieudebut' ) )
            // InternalGame.g:1340:1: ( 'lieudebut' )
            {
            // InternalGame.g:1340:1: ( 'lieudebut' )
            // InternalGame.g:1341:2: 'lieudebut'
            {
             before(grammarAccess.getLieuDebutAccess().getLieudebutKeyword_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getLieuDebutAccess().getLieudebutKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LieuDebut__Group__0__Impl"


    // $ANTLR start "rule__LieuDebut__Group__1"
    // InternalGame.g:1350:1: rule__LieuDebut__Group__1 : rule__LieuDebut__Group__1__Impl rule__LieuDebut__Group__2 ;
    public final void rule__LieuDebut__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1354:1: ( rule__LieuDebut__Group__1__Impl rule__LieuDebut__Group__2 )
            // InternalGame.g:1355:2: rule__LieuDebut__Group__1__Impl rule__LieuDebut__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__LieuDebut__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LieuDebut__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LieuDebut__Group__1"


    // $ANTLR start "rule__LieuDebut__Group__1__Impl"
    // InternalGame.g:1362:1: rule__LieuDebut__Group__1__Impl : ( ( rule__LieuDebut__NameAssignment_1 ) ) ;
    public final void rule__LieuDebut__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1366:1: ( ( ( rule__LieuDebut__NameAssignment_1 ) ) )
            // InternalGame.g:1367:1: ( ( rule__LieuDebut__NameAssignment_1 ) )
            {
            // InternalGame.g:1367:1: ( ( rule__LieuDebut__NameAssignment_1 ) )
            // InternalGame.g:1368:2: ( rule__LieuDebut__NameAssignment_1 )
            {
             before(grammarAccess.getLieuDebutAccess().getNameAssignment_1()); 
            // InternalGame.g:1369:2: ( rule__LieuDebut__NameAssignment_1 )
            // InternalGame.g:1369:3: rule__LieuDebut__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__LieuDebut__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getLieuDebutAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LieuDebut__Group__1__Impl"


    // $ANTLR start "rule__LieuDebut__Group__2"
    // InternalGame.g:1377:1: rule__LieuDebut__Group__2 : rule__LieuDebut__Group__2__Impl rule__LieuDebut__Group__3 ;
    public final void rule__LieuDebut__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1381:1: ( rule__LieuDebut__Group__2__Impl rule__LieuDebut__Group__3 )
            // InternalGame.g:1382:2: rule__LieuDebut__Group__2__Impl rule__LieuDebut__Group__3
            {
            pushFollow(FOLLOW_19);
            rule__LieuDebut__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LieuDebut__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LieuDebut__Group__2"


    // $ANTLR start "rule__LieuDebut__Group__2__Impl"
    // InternalGame.g:1389:1: rule__LieuDebut__Group__2__Impl : ( '{' ) ;
    public final void rule__LieuDebut__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1393:1: ( ( '{' ) )
            // InternalGame.g:1394:1: ( '{' )
            {
            // InternalGame.g:1394:1: ( '{' )
            // InternalGame.g:1395:2: '{'
            {
             before(grammarAccess.getLieuDebutAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getLieuDebutAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LieuDebut__Group__2__Impl"


    // $ANTLR start "rule__LieuDebut__Group__3"
    // InternalGame.g:1404:1: rule__LieuDebut__Group__3 : rule__LieuDebut__Group__3__Impl rule__LieuDebut__Group__4 ;
    public final void rule__LieuDebut__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1408:1: ( rule__LieuDebut__Group__3__Impl rule__LieuDebut__Group__4 )
            // InternalGame.g:1409:2: rule__LieuDebut__Group__3__Impl rule__LieuDebut__Group__4
            {
            pushFollow(FOLLOW_19);
            rule__LieuDebut__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LieuDebut__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LieuDebut__Group__3"


    // $ANTLR start "rule__LieuDebut__Group__3__Impl"
    // InternalGame.g:1416:1: rule__LieuDebut__Group__3__Impl : ( ( rule__LieuDebut__LieudebutElementsAssignment_3 )? ) ;
    public final void rule__LieuDebut__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1420:1: ( ( ( rule__LieuDebut__LieudebutElementsAssignment_3 )? ) )
            // InternalGame.g:1421:1: ( ( rule__LieuDebut__LieudebutElementsAssignment_3 )? )
            {
            // InternalGame.g:1421:1: ( ( rule__LieuDebut__LieudebutElementsAssignment_3 )? )
            // InternalGame.g:1422:2: ( rule__LieuDebut__LieudebutElementsAssignment_3 )?
            {
             before(grammarAccess.getLieuDebutAccess().getLieudebutElementsAssignment_3()); 
            // InternalGame.g:1423:2: ( rule__LieuDebut__LieudebutElementsAssignment_3 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==20) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalGame.g:1423:3: rule__LieuDebut__LieudebutElementsAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__LieuDebut__LieudebutElementsAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLieuDebutAccess().getLieudebutElementsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LieuDebut__Group__3__Impl"


    // $ANTLR start "rule__LieuDebut__Group__4"
    // InternalGame.g:1431:1: rule__LieuDebut__Group__4 : rule__LieuDebut__Group__4__Impl ;
    public final void rule__LieuDebut__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1435:1: ( rule__LieuDebut__Group__4__Impl )
            // InternalGame.g:1436:2: rule__LieuDebut__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LieuDebut__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LieuDebut__Group__4"


    // $ANTLR start "rule__LieuDebut__Group__4__Impl"
    // InternalGame.g:1442:1: rule__LieuDebut__Group__4__Impl : ( '}' ) ;
    public final void rule__LieuDebut__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1446:1: ( ( '}' ) )
            // InternalGame.g:1447:1: ( '}' )
            {
            // InternalGame.g:1447:1: ( '}' )
            // InternalGame.g:1448:2: '}'
            {
             before(grammarAccess.getLieuDebutAccess().getRightCurlyBracketKeyword_4()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getLieuDebutAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LieuDebut__Group__4__Impl"


    // $ANTLR start "rule__LieuFin__Group__0"
    // InternalGame.g:1458:1: rule__LieuFin__Group__0 : rule__LieuFin__Group__0__Impl rule__LieuFin__Group__1 ;
    public final void rule__LieuFin__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1462:1: ( rule__LieuFin__Group__0__Impl rule__LieuFin__Group__1 )
            // InternalGame.g:1463:2: rule__LieuFin__Group__0__Impl rule__LieuFin__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__LieuFin__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LieuFin__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LieuFin__Group__0"


    // $ANTLR start "rule__LieuFin__Group__0__Impl"
    // InternalGame.g:1470:1: rule__LieuFin__Group__0__Impl : ( 'lieufin' ) ;
    public final void rule__LieuFin__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1474:1: ( ( 'lieufin' ) )
            // InternalGame.g:1475:1: ( 'lieufin' )
            {
            // InternalGame.g:1475:1: ( 'lieufin' )
            // InternalGame.g:1476:2: 'lieufin'
            {
             before(grammarAccess.getLieuFinAccess().getLieufinKeyword_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getLieuFinAccess().getLieufinKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LieuFin__Group__0__Impl"


    // $ANTLR start "rule__LieuFin__Group__1"
    // InternalGame.g:1485:1: rule__LieuFin__Group__1 : rule__LieuFin__Group__1__Impl rule__LieuFin__Group__2 ;
    public final void rule__LieuFin__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1489:1: ( rule__LieuFin__Group__1__Impl rule__LieuFin__Group__2 )
            // InternalGame.g:1490:2: rule__LieuFin__Group__1__Impl rule__LieuFin__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__LieuFin__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LieuFin__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LieuFin__Group__1"


    // $ANTLR start "rule__LieuFin__Group__1__Impl"
    // InternalGame.g:1497:1: rule__LieuFin__Group__1__Impl : ( ( rule__LieuFin__NameAssignment_1 ) ) ;
    public final void rule__LieuFin__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1501:1: ( ( ( rule__LieuFin__NameAssignment_1 ) ) )
            // InternalGame.g:1502:1: ( ( rule__LieuFin__NameAssignment_1 ) )
            {
            // InternalGame.g:1502:1: ( ( rule__LieuFin__NameAssignment_1 ) )
            // InternalGame.g:1503:2: ( rule__LieuFin__NameAssignment_1 )
            {
             before(grammarAccess.getLieuFinAccess().getNameAssignment_1()); 
            // InternalGame.g:1504:2: ( rule__LieuFin__NameAssignment_1 )
            // InternalGame.g:1504:3: rule__LieuFin__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__LieuFin__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getLieuFinAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LieuFin__Group__1__Impl"


    // $ANTLR start "rule__LieuFin__Group__2"
    // InternalGame.g:1512:1: rule__LieuFin__Group__2 : rule__LieuFin__Group__2__Impl rule__LieuFin__Group__3 ;
    public final void rule__LieuFin__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1516:1: ( rule__LieuFin__Group__2__Impl rule__LieuFin__Group__3 )
            // InternalGame.g:1517:2: rule__LieuFin__Group__2__Impl rule__LieuFin__Group__3
            {
            pushFollow(FOLLOW_19);
            rule__LieuFin__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LieuFin__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LieuFin__Group__2"


    // $ANTLR start "rule__LieuFin__Group__2__Impl"
    // InternalGame.g:1524:1: rule__LieuFin__Group__2__Impl : ( '{' ) ;
    public final void rule__LieuFin__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1528:1: ( ( '{' ) )
            // InternalGame.g:1529:1: ( '{' )
            {
            // InternalGame.g:1529:1: ( '{' )
            // InternalGame.g:1530:2: '{'
            {
             before(grammarAccess.getLieuFinAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getLieuFinAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LieuFin__Group__2__Impl"


    // $ANTLR start "rule__LieuFin__Group__3"
    // InternalGame.g:1539:1: rule__LieuFin__Group__3 : rule__LieuFin__Group__3__Impl rule__LieuFin__Group__4 ;
    public final void rule__LieuFin__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1543:1: ( rule__LieuFin__Group__3__Impl rule__LieuFin__Group__4 )
            // InternalGame.g:1544:2: rule__LieuFin__Group__3__Impl rule__LieuFin__Group__4
            {
            pushFollow(FOLLOW_19);
            rule__LieuFin__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LieuFin__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LieuFin__Group__3"


    // $ANTLR start "rule__LieuFin__Group__3__Impl"
    // InternalGame.g:1551:1: rule__LieuFin__Group__3__Impl : ( ( rule__LieuFin__LieudebutElementsAssignment_3 )? ) ;
    public final void rule__LieuFin__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1555:1: ( ( ( rule__LieuFin__LieudebutElementsAssignment_3 )? ) )
            // InternalGame.g:1556:1: ( ( rule__LieuFin__LieudebutElementsAssignment_3 )? )
            {
            // InternalGame.g:1556:1: ( ( rule__LieuFin__LieudebutElementsAssignment_3 )? )
            // InternalGame.g:1557:2: ( rule__LieuFin__LieudebutElementsAssignment_3 )?
            {
             before(grammarAccess.getLieuFinAccess().getLieudebutElementsAssignment_3()); 
            // InternalGame.g:1558:2: ( rule__LieuFin__LieudebutElementsAssignment_3 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==20) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalGame.g:1558:3: rule__LieuFin__LieudebutElementsAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__LieuFin__LieudebutElementsAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLieuFinAccess().getLieudebutElementsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LieuFin__Group__3__Impl"


    // $ANTLR start "rule__LieuFin__Group__4"
    // InternalGame.g:1566:1: rule__LieuFin__Group__4 : rule__LieuFin__Group__4__Impl ;
    public final void rule__LieuFin__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1570:1: ( rule__LieuFin__Group__4__Impl )
            // InternalGame.g:1571:2: rule__LieuFin__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LieuFin__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LieuFin__Group__4"


    // $ANTLR start "rule__LieuFin__Group__4__Impl"
    // InternalGame.g:1577:1: rule__LieuFin__Group__4__Impl : ( '}' ) ;
    public final void rule__LieuFin__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1581:1: ( ( '}' ) )
            // InternalGame.g:1582:1: ( '}' )
            {
            // InternalGame.g:1582:1: ( '}' )
            // InternalGame.g:1583:2: '}'
            {
             before(grammarAccess.getLieuFinAccess().getRightCurlyBracketKeyword_4()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getLieuFinAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LieuFin__Group__4__Impl"


    // $ANTLR start "rule__Personnes__Group__0"
    // InternalGame.g:1593:1: rule__Personnes__Group__0 : rule__Personnes__Group__0__Impl rule__Personnes__Group__1 ;
    public final void rule__Personnes__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1597:1: ( rule__Personnes__Group__0__Impl rule__Personnes__Group__1 )
            // InternalGame.g:1598:2: rule__Personnes__Group__0__Impl rule__Personnes__Group__1
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
    // InternalGame.g:1605:1: rule__Personnes__Group__0__Impl : ( 'personnes' ) ;
    public final void rule__Personnes__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1609:1: ( ( 'personnes' ) )
            // InternalGame.g:1610:1: ( 'personnes' )
            {
            // InternalGame.g:1610:1: ( 'personnes' )
            // InternalGame.g:1611:2: 'personnes'
            {
             before(grammarAccess.getPersonnesAccess().getPersonnesKeyword_0()); 
            match(input,20,FOLLOW_2); 
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
    // InternalGame.g:1620:1: rule__Personnes__Group__1 : rule__Personnes__Group__1__Impl rule__Personnes__Group__2 ;
    public final void rule__Personnes__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1624:1: ( rule__Personnes__Group__1__Impl rule__Personnes__Group__2 )
            // InternalGame.g:1625:2: rule__Personnes__Group__1__Impl rule__Personnes__Group__2
            {
            pushFollow(FOLLOW_20);
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
    // InternalGame.g:1632:1: rule__Personnes__Group__1__Impl : ( '{' ) ;
    public final void rule__Personnes__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1636:1: ( ( '{' ) )
            // InternalGame.g:1637:1: ( '{' )
            {
            // InternalGame.g:1637:1: ( '{' )
            // InternalGame.g:1638:2: '{'
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
    // InternalGame.g:1647:1: rule__Personnes__Group__2 : rule__Personnes__Group__2__Impl rule__Personnes__Group__3 ;
    public final void rule__Personnes__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1651:1: ( rule__Personnes__Group__2__Impl rule__Personnes__Group__3 )
            // InternalGame.g:1652:2: rule__Personnes__Group__2__Impl rule__Personnes__Group__3
            {
            pushFollow(FOLLOW_20);
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
    // InternalGame.g:1659:1: rule__Personnes__Group__2__Impl : ( ( rule__Personnes__ListePersonneAssignment_2 )* ) ;
    public final void rule__Personnes__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1663:1: ( ( ( rule__Personnes__ListePersonneAssignment_2 )* ) )
            // InternalGame.g:1664:1: ( ( rule__Personnes__ListePersonneAssignment_2 )* )
            {
            // InternalGame.g:1664:1: ( ( rule__Personnes__ListePersonneAssignment_2 )* )
            // InternalGame.g:1665:2: ( rule__Personnes__ListePersonneAssignment_2 )*
            {
             before(grammarAccess.getPersonnesAccess().getListePersonneAssignment_2()); 
            // InternalGame.g:1666:2: ( rule__Personnes__ListePersonneAssignment_2 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==21) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalGame.g:1666:3: rule__Personnes__ListePersonneAssignment_2
            	    {
            	    pushFollow(FOLLOW_21);
            	    rule__Personnes__ListePersonneAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
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
    // InternalGame.g:1674:1: rule__Personnes__Group__3 : rule__Personnes__Group__3__Impl ;
    public final void rule__Personnes__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1678:1: ( rule__Personnes__Group__3__Impl )
            // InternalGame.g:1679:2: rule__Personnes__Group__3__Impl
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
    // InternalGame.g:1685:1: rule__Personnes__Group__3__Impl : ( '}' ) ;
    public final void rule__Personnes__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1689:1: ( ( '}' ) )
            // InternalGame.g:1690:1: ( '}' )
            {
            // InternalGame.g:1690:1: ( '}' )
            // InternalGame.g:1691:2: '}'
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
    // InternalGame.g:1701:1: rule__Personne__Group__0 : rule__Personne__Group__0__Impl rule__Personne__Group__1 ;
    public final void rule__Personne__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1705:1: ( rule__Personne__Group__0__Impl rule__Personne__Group__1 )
            // InternalGame.g:1706:2: rule__Personne__Group__0__Impl rule__Personne__Group__1
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
    // InternalGame.g:1713:1: rule__Personne__Group__0__Impl : ( 'personne' ) ;
    public final void rule__Personne__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1717:1: ( ( 'personne' ) )
            // InternalGame.g:1718:1: ( 'personne' )
            {
            // InternalGame.g:1718:1: ( 'personne' )
            // InternalGame.g:1719:2: 'personne'
            {
             before(grammarAccess.getPersonneAccess().getPersonneKeyword_0()); 
            match(input,21,FOLLOW_2); 
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
    // InternalGame.g:1728:1: rule__Personne__Group__1 : rule__Personne__Group__1__Impl rule__Personne__Group__2 ;
    public final void rule__Personne__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1732:1: ( rule__Personne__Group__1__Impl rule__Personne__Group__2 )
            // InternalGame.g:1733:2: rule__Personne__Group__1__Impl rule__Personne__Group__2
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
    // InternalGame.g:1740:1: rule__Personne__Group__1__Impl : ( ( rule__Personne__NameAssignment_1 ) ) ;
    public final void rule__Personne__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1744:1: ( ( ( rule__Personne__NameAssignment_1 ) ) )
            // InternalGame.g:1745:1: ( ( rule__Personne__NameAssignment_1 ) )
            {
            // InternalGame.g:1745:1: ( ( rule__Personne__NameAssignment_1 ) )
            // InternalGame.g:1746:2: ( rule__Personne__NameAssignment_1 )
            {
             before(grammarAccess.getPersonneAccess().getNameAssignment_1()); 
            // InternalGame.g:1747:2: ( rule__Personne__NameAssignment_1 )
            // InternalGame.g:1747:3: rule__Personne__NameAssignment_1
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
    // InternalGame.g:1755:1: rule__Personne__Group__2 : rule__Personne__Group__2__Impl rule__Personne__Group__3 ;
    public final void rule__Personne__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1759:1: ( rule__Personne__Group__2__Impl rule__Personne__Group__3 )
            // InternalGame.g:1760:2: rule__Personne__Group__2__Impl rule__Personne__Group__3
            {
            pushFollow(FOLLOW_22);
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
    // InternalGame.g:1767:1: rule__Personne__Group__2__Impl : ( '{' ) ;
    public final void rule__Personne__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1771:1: ( ( '{' ) )
            // InternalGame.g:1772:1: ( '{' )
            {
            // InternalGame.g:1772:1: ( '{' )
            // InternalGame.g:1773:2: '{'
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
    // InternalGame.g:1782:1: rule__Personne__Group__3 : rule__Personne__Group__3__Impl rule__Personne__Group__4 ;
    public final void rule__Personne__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1786:1: ( rule__Personne__Group__3__Impl rule__Personne__Group__4 )
            // InternalGame.g:1787:2: rule__Personne__Group__3__Impl rule__Personne__Group__4
            {
            pushFollow(FOLLOW_23);
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
    // InternalGame.g:1794:1: rule__Personne__Group__3__Impl : ( 'visible' ) ;
    public final void rule__Personne__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1798:1: ( ( 'visible' ) )
            // InternalGame.g:1799:1: ( 'visible' )
            {
            // InternalGame.g:1799:1: ( 'visible' )
            // InternalGame.g:1800:2: 'visible'
            {
             before(grammarAccess.getPersonneAccess().getVisibleKeyword_3()); 
            match(input,22,FOLLOW_2); 
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
    // InternalGame.g:1809:1: rule__Personne__Group__4 : rule__Personne__Group__4__Impl rule__Personne__Group__5 ;
    public final void rule__Personne__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1813:1: ( rule__Personne__Group__4__Impl rule__Personne__Group__5 )
            // InternalGame.g:1814:2: rule__Personne__Group__4__Impl rule__Personne__Group__5
            {
            pushFollow(FOLLOW_24);
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
    // InternalGame.g:1821:1: rule__Personne__Group__4__Impl : ( 'obligatoire' ) ;
    public final void rule__Personne__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1825:1: ( ( 'obligatoire' ) )
            // InternalGame.g:1826:1: ( 'obligatoire' )
            {
            // InternalGame.g:1826:1: ( 'obligatoire' )
            // InternalGame.g:1827:2: 'obligatoire'
            {
             before(grammarAccess.getPersonneAccess().getObligatoireKeyword_4()); 
            match(input,23,FOLLOW_2); 
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
    // InternalGame.g:1836:1: rule__Personne__Group__5 : rule__Personne__Group__5__Impl rule__Personne__Group__6 ;
    public final void rule__Personne__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1840:1: ( rule__Personne__Group__5__Impl rule__Personne__Group__6 )
            // InternalGame.g:1841:2: rule__Personne__Group__5__Impl rule__Personne__Group__6
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
    // InternalGame.g:1848:1: rule__Personne__Group__5__Impl : ( ( rule__Personne__PersonneElementsAssignment_5 ) ) ;
    public final void rule__Personne__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1852:1: ( ( ( rule__Personne__PersonneElementsAssignment_5 ) ) )
            // InternalGame.g:1853:1: ( ( rule__Personne__PersonneElementsAssignment_5 ) )
            {
            // InternalGame.g:1853:1: ( ( rule__Personne__PersonneElementsAssignment_5 ) )
            // InternalGame.g:1854:2: ( rule__Personne__PersonneElementsAssignment_5 )
            {
             before(grammarAccess.getPersonneAccess().getPersonneElementsAssignment_5()); 
            // InternalGame.g:1855:2: ( rule__Personne__PersonneElementsAssignment_5 )
            // InternalGame.g:1855:3: rule__Personne__PersonneElementsAssignment_5
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
    // InternalGame.g:1863:1: rule__Personne__Group__6 : rule__Personne__Group__6__Impl ;
    public final void rule__Personne__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1867:1: ( rule__Personne__Group__6__Impl )
            // InternalGame.g:1868:2: rule__Personne__Group__6__Impl
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
    // InternalGame.g:1874:1: rule__Personne__Group__6__Impl : ( '}' ) ;
    public final void rule__Personne__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1878:1: ( ( '}' ) )
            // InternalGame.g:1879:1: ( '}' )
            {
            // InternalGame.g:1879:1: ( '}' )
            // InternalGame.g:1880:2: '}'
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
    // InternalGame.g:1890:1: rule__Interaction__Group__0 : rule__Interaction__Group__0__Impl rule__Interaction__Group__1 ;
    public final void rule__Interaction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1894:1: ( rule__Interaction__Group__0__Impl rule__Interaction__Group__1 )
            // InternalGame.g:1895:2: rule__Interaction__Group__0__Impl rule__Interaction__Group__1
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
    // InternalGame.g:1902:1: rule__Interaction__Group__0__Impl : ( 'interaction' ) ;
    public final void rule__Interaction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1906:1: ( ( 'interaction' ) )
            // InternalGame.g:1907:1: ( 'interaction' )
            {
            // InternalGame.g:1907:1: ( 'interaction' )
            // InternalGame.g:1908:2: 'interaction'
            {
             before(grammarAccess.getInteractionAccess().getInteractionKeyword_0()); 
            match(input,24,FOLLOW_2); 
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
    // InternalGame.g:1917:1: rule__Interaction__Group__1 : rule__Interaction__Group__1__Impl rule__Interaction__Group__2 ;
    public final void rule__Interaction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1921:1: ( rule__Interaction__Group__1__Impl rule__Interaction__Group__2 )
            // InternalGame.g:1922:2: rule__Interaction__Group__1__Impl rule__Interaction__Group__2
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
    // InternalGame.g:1929:1: rule__Interaction__Group__1__Impl : ( ( rule__Interaction__NameAssignment_1 ) ) ;
    public final void rule__Interaction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1933:1: ( ( ( rule__Interaction__NameAssignment_1 ) ) )
            // InternalGame.g:1934:1: ( ( rule__Interaction__NameAssignment_1 ) )
            {
            // InternalGame.g:1934:1: ( ( rule__Interaction__NameAssignment_1 ) )
            // InternalGame.g:1935:2: ( rule__Interaction__NameAssignment_1 )
            {
             before(grammarAccess.getInteractionAccess().getNameAssignment_1()); 
            // InternalGame.g:1936:2: ( rule__Interaction__NameAssignment_1 )
            // InternalGame.g:1936:3: rule__Interaction__NameAssignment_1
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
    // InternalGame.g:1944:1: rule__Interaction__Group__2 : rule__Interaction__Group__2__Impl rule__Interaction__Group__3 ;
    public final void rule__Interaction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1948:1: ( rule__Interaction__Group__2__Impl rule__Interaction__Group__3 )
            // InternalGame.g:1949:2: rule__Interaction__Group__2__Impl rule__Interaction__Group__3
            {
            pushFollow(FOLLOW_25);
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
    // InternalGame.g:1956:1: rule__Interaction__Group__2__Impl : ( '{' ) ;
    public final void rule__Interaction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1960:1: ( ( '{' ) )
            // InternalGame.g:1961:1: ( '{' )
            {
            // InternalGame.g:1961:1: ( '{' )
            // InternalGame.g:1962:2: '{'
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
    // InternalGame.g:1971:1: rule__Interaction__Group__3 : rule__Interaction__Group__3__Impl rule__Interaction__Group__4 ;
    public final void rule__Interaction__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1975:1: ( rule__Interaction__Group__3__Impl rule__Interaction__Group__4 )
            // InternalGame.g:1976:2: rule__Interaction__Group__3__Impl rule__Interaction__Group__4
            {
            pushFollow(FOLLOW_26);
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
    // InternalGame.g:1983:1: rule__Interaction__Group__3__Impl : ( 'texte' ) ;
    public final void rule__Interaction__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1987:1: ( ( 'texte' ) )
            // InternalGame.g:1988:1: ( 'texte' )
            {
            // InternalGame.g:1988:1: ( 'texte' )
            // InternalGame.g:1989:2: 'texte'
            {
             before(grammarAccess.getInteractionAccess().getTexteKeyword_3()); 
            match(input,25,FOLLOW_2); 
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
    // InternalGame.g:1998:1: rule__Interaction__Group__4 : rule__Interaction__Group__4__Impl rule__Interaction__Group__5 ;
    public final void rule__Interaction__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2002:1: ( rule__Interaction__Group__4__Impl rule__Interaction__Group__5 )
            // InternalGame.g:2003:2: rule__Interaction__Group__4__Impl rule__Interaction__Group__5
            {
            pushFollow(FOLLOW_26);
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
    // InternalGame.g:2010:1: rule__Interaction__Group__4__Impl : ( ( rule__Interaction__InteractionElementsAssignment_4 )* ) ;
    public final void rule__Interaction__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2014:1: ( ( ( rule__Interaction__InteractionElementsAssignment_4 )* ) )
            // InternalGame.g:2015:1: ( ( rule__Interaction__InteractionElementsAssignment_4 )* )
            {
            // InternalGame.g:2015:1: ( ( rule__Interaction__InteractionElementsAssignment_4 )* )
            // InternalGame.g:2016:2: ( rule__Interaction__InteractionElementsAssignment_4 )*
            {
             before(grammarAccess.getInteractionAccess().getInteractionElementsAssignment_4()); 
            // InternalGame.g:2017:2: ( rule__Interaction__InteractionElementsAssignment_4 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==26) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalGame.g:2017:3: rule__Interaction__InteractionElementsAssignment_4
            	    {
            	    pushFollow(FOLLOW_27);
            	    rule__Interaction__InteractionElementsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
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
    // InternalGame.g:2025:1: rule__Interaction__Group__5 : rule__Interaction__Group__5__Impl ;
    public final void rule__Interaction__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2029:1: ( rule__Interaction__Group__5__Impl )
            // InternalGame.g:2030:2: rule__Interaction__Group__5__Impl
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
    // InternalGame.g:2036:1: rule__Interaction__Group__5__Impl : ( '}' ) ;
    public final void rule__Interaction__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2040:1: ( ( '}' ) )
            // InternalGame.g:2041:1: ( '}' )
            {
            // InternalGame.g:2041:1: ( '}' )
            // InternalGame.g:2042:2: '}'
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
    // InternalGame.g:2052:1: rule__Choix__Group__0 : rule__Choix__Group__0__Impl rule__Choix__Group__1 ;
    public final void rule__Choix__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2056:1: ( rule__Choix__Group__0__Impl rule__Choix__Group__1 )
            // InternalGame.g:2057:2: rule__Choix__Group__0__Impl rule__Choix__Group__1
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
    // InternalGame.g:2064:1: rule__Choix__Group__0__Impl : ( 'choix' ) ;
    public final void rule__Choix__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2068:1: ( ( 'choix' ) )
            // InternalGame.g:2069:1: ( 'choix' )
            {
            // InternalGame.g:2069:1: ( 'choix' )
            // InternalGame.g:2070:2: 'choix'
            {
             before(grammarAccess.getChoixAccess().getChoixKeyword_0()); 
            match(input,26,FOLLOW_2); 
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
    // InternalGame.g:2079:1: rule__Choix__Group__1 : rule__Choix__Group__1__Impl ;
    public final void rule__Choix__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2083:1: ( rule__Choix__Group__1__Impl )
            // InternalGame.g:2084:2: rule__Choix__Group__1__Impl
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
    // InternalGame.g:2090:1: rule__Choix__Group__1__Impl : ( ( rule__Choix__NameAssignment_1 ) ) ;
    public final void rule__Choix__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2094:1: ( ( ( rule__Choix__NameAssignment_1 ) ) )
            // InternalGame.g:2095:1: ( ( rule__Choix__NameAssignment_1 ) )
            {
            // InternalGame.g:2095:1: ( ( rule__Choix__NameAssignment_1 ) )
            // InternalGame.g:2096:2: ( rule__Choix__NameAssignment_1 )
            {
             before(grammarAccess.getChoixAccess().getNameAssignment_1()); 
            // InternalGame.g:2097:2: ( rule__Choix__NameAssignment_1 )
            // InternalGame.g:2097:3: rule__Choix__NameAssignment_1
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
    // InternalGame.g:2106:1: rule__Objet__Group__0 : rule__Objet__Group__0__Impl rule__Objet__Group__1 ;
    public final void rule__Objet__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2110:1: ( rule__Objet__Group__0__Impl rule__Objet__Group__1 )
            // InternalGame.g:2111:2: rule__Objet__Group__0__Impl rule__Objet__Group__1
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
    // InternalGame.g:2118:1: rule__Objet__Group__0__Impl : ( 'objet' ) ;
    public final void rule__Objet__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2122:1: ( ( 'objet' ) )
            // InternalGame.g:2123:1: ( 'objet' )
            {
            // InternalGame.g:2123:1: ( 'objet' )
            // InternalGame.g:2124:2: 'objet'
            {
             before(grammarAccess.getObjetAccess().getObjetKeyword_0()); 
            match(input,27,FOLLOW_2); 
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
    // InternalGame.g:2133:1: rule__Objet__Group__1 : rule__Objet__Group__1__Impl rule__Objet__Group__2 ;
    public final void rule__Objet__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2137:1: ( rule__Objet__Group__1__Impl rule__Objet__Group__2 )
            // InternalGame.g:2138:2: rule__Objet__Group__1__Impl rule__Objet__Group__2
            {
            pushFollow(FOLLOW_15);
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
    // InternalGame.g:2145:1: rule__Objet__Group__1__Impl : ( ( rule__Objet__NameAssignment_1 ) ) ;
    public final void rule__Objet__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2149:1: ( ( ( rule__Objet__NameAssignment_1 ) ) )
            // InternalGame.g:2150:1: ( ( rule__Objet__NameAssignment_1 ) )
            {
            // InternalGame.g:2150:1: ( ( rule__Objet__NameAssignment_1 ) )
            // InternalGame.g:2151:2: ( rule__Objet__NameAssignment_1 )
            {
             before(grammarAccess.getObjetAccess().getNameAssignment_1()); 
            // InternalGame.g:2152:2: ( rule__Objet__NameAssignment_1 )
            // InternalGame.g:2152:3: rule__Objet__NameAssignment_1
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
    // InternalGame.g:2160:1: rule__Objet__Group__2 : rule__Objet__Group__2__Impl rule__Objet__Group__3 ;
    public final void rule__Objet__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2164:1: ( rule__Objet__Group__2__Impl rule__Objet__Group__3 )
            // InternalGame.g:2165:2: rule__Objet__Group__2__Impl rule__Objet__Group__3
            {
            pushFollow(FOLLOW_15);
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
    // InternalGame.g:2172:1: rule__Objet__Group__2__Impl : ( ( rule__Objet__TailleAssignment_2 ) ) ;
    public final void rule__Objet__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2176:1: ( ( ( rule__Objet__TailleAssignment_2 ) ) )
            // InternalGame.g:2177:1: ( ( rule__Objet__TailleAssignment_2 ) )
            {
            // InternalGame.g:2177:1: ( ( rule__Objet__TailleAssignment_2 ) )
            // InternalGame.g:2178:2: ( rule__Objet__TailleAssignment_2 )
            {
             before(grammarAccess.getObjetAccess().getTailleAssignment_2()); 
            // InternalGame.g:2179:2: ( rule__Objet__TailleAssignment_2 )
            // InternalGame.g:2179:3: rule__Objet__TailleAssignment_2
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
    // InternalGame.g:2187:1: rule__Objet__Group__3 : rule__Objet__Group__3__Impl ;
    public final void rule__Objet__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2191:1: ( rule__Objet__Group__3__Impl )
            // InternalGame.g:2192:2: rule__Objet__Group__3__Impl
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
    // InternalGame.g:2198:1: rule__Objet__Group__3__Impl : ( ( rule__Objet__QuantiteAssignment_3 ) ) ;
    public final void rule__Objet__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2202:1: ( ( ( rule__Objet__QuantiteAssignment_3 ) ) )
            // InternalGame.g:2203:1: ( ( rule__Objet__QuantiteAssignment_3 ) )
            {
            // InternalGame.g:2203:1: ( ( rule__Objet__QuantiteAssignment_3 ) )
            // InternalGame.g:2204:2: ( rule__Objet__QuantiteAssignment_3 )
            {
             before(grammarAccess.getObjetAccess().getQuantiteAssignment_3()); 
            // InternalGame.g:2205:2: ( rule__Objet__QuantiteAssignment_3 )
            // InternalGame.g:2205:3: rule__Objet__QuantiteAssignment_3
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


    // $ANTLR start "rule__Objets__Group__0"
    // InternalGame.g:2214:1: rule__Objets__Group__0 : rule__Objets__Group__0__Impl rule__Objets__Group__1 ;
    public final void rule__Objets__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2218:1: ( rule__Objets__Group__0__Impl rule__Objets__Group__1 )
            // InternalGame.g:2219:2: rule__Objets__Group__0__Impl rule__Objets__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Objets__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Objets__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Objets__Group__0"


    // $ANTLR start "rule__Objets__Group__0__Impl"
    // InternalGame.g:2226:1: rule__Objets__Group__0__Impl : ( 'objets' ) ;
    public final void rule__Objets__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2230:1: ( ( 'objets' ) )
            // InternalGame.g:2231:1: ( 'objets' )
            {
            // InternalGame.g:2231:1: ( 'objets' )
            // InternalGame.g:2232:2: 'objets'
            {
             before(grammarAccess.getObjetsAccess().getObjetsKeyword_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getObjetsAccess().getObjetsKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Objets__Group__0__Impl"


    // $ANTLR start "rule__Objets__Group__1"
    // InternalGame.g:2241:1: rule__Objets__Group__1 : rule__Objets__Group__1__Impl rule__Objets__Group__2 ;
    public final void rule__Objets__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2245:1: ( rule__Objets__Group__1__Impl rule__Objets__Group__2 )
            // InternalGame.g:2246:2: rule__Objets__Group__1__Impl rule__Objets__Group__2
            {
            pushFollow(FOLLOW_16);
            rule__Objets__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Objets__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Objets__Group__1"


    // $ANTLR start "rule__Objets__Group__1__Impl"
    // InternalGame.g:2253:1: rule__Objets__Group__1__Impl : ( '{' ) ;
    public final void rule__Objets__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2257:1: ( ( '{' ) )
            // InternalGame.g:2258:1: ( '{' )
            {
            // InternalGame.g:2258:1: ( '{' )
            // InternalGame.g:2259:2: '{'
            {
             before(grammarAccess.getObjetsAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getObjetsAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Objets__Group__1__Impl"


    // $ANTLR start "rule__Objets__Group__2"
    // InternalGame.g:2268:1: rule__Objets__Group__2 : rule__Objets__Group__2__Impl rule__Objets__Group__3 ;
    public final void rule__Objets__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2272:1: ( rule__Objets__Group__2__Impl rule__Objets__Group__3 )
            // InternalGame.g:2273:2: rule__Objets__Group__2__Impl rule__Objets__Group__3
            {
            pushFollow(FOLLOW_16);
            rule__Objets__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Objets__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Objets__Group__2"


    // $ANTLR start "rule__Objets__Group__2__Impl"
    // InternalGame.g:2280:1: rule__Objets__Group__2__Impl : ( ( rule__Objets__ListeObjetsAssignment_2 )* ) ;
    public final void rule__Objets__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2284:1: ( ( ( rule__Objets__ListeObjetsAssignment_2 )* ) )
            // InternalGame.g:2285:1: ( ( rule__Objets__ListeObjetsAssignment_2 )* )
            {
            // InternalGame.g:2285:1: ( ( rule__Objets__ListeObjetsAssignment_2 )* )
            // InternalGame.g:2286:2: ( rule__Objets__ListeObjetsAssignment_2 )*
            {
             before(grammarAccess.getObjetsAccess().getListeObjetsAssignment_2()); 
            // InternalGame.g:2287:2: ( rule__Objets__ListeObjetsAssignment_2 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==27) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalGame.g:2287:3: rule__Objets__ListeObjetsAssignment_2
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__Objets__ListeObjetsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getObjetsAccess().getListeObjetsAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Objets__Group__2__Impl"


    // $ANTLR start "rule__Objets__Group__3"
    // InternalGame.g:2295:1: rule__Objets__Group__3 : rule__Objets__Group__3__Impl ;
    public final void rule__Objets__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2299:1: ( rule__Objets__Group__3__Impl )
            // InternalGame.g:2300:2: rule__Objets__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Objets__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Objets__Group__3"


    // $ANTLR start "rule__Objets__Group__3__Impl"
    // InternalGame.g:2306:1: rule__Objets__Group__3__Impl : ( '}' ) ;
    public final void rule__Objets__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2310:1: ( ( '}' ) )
            // InternalGame.g:2311:1: ( '}' )
            {
            // InternalGame.g:2311:1: ( '}' )
            // InternalGame.g:2312:2: '}'
            {
             before(grammarAccess.getObjetsAccess().getRightCurlyBracketKeyword_3()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getObjetsAccess().getRightCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Objets__Group__3__Impl"


    // $ANTLR start "rule__Connaissances__Group__0"
    // InternalGame.g:2322:1: rule__Connaissances__Group__0 : rule__Connaissances__Group__0__Impl rule__Connaissances__Group__1 ;
    public final void rule__Connaissances__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2326:1: ( rule__Connaissances__Group__0__Impl rule__Connaissances__Group__1 )
            // InternalGame.g:2327:2: rule__Connaissances__Group__0__Impl rule__Connaissances__Group__1
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
    // InternalGame.g:2334:1: rule__Connaissances__Group__0__Impl : ( 'connaissances' ) ;
    public final void rule__Connaissances__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2338:1: ( ( 'connaissances' ) )
            // InternalGame.g:2339:1: ( 'connaissances' )
            {
            // InternalGame.g:2339:1: ( 'connaissances' )
            // InternalGame.g:2340:2: 'connaissances'
            {
             before(grammarAccess.getConnaissancesAccess().getConnaissancesKeyword_0()); 
            match(input,29,FOLLOW_2); 
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
    // InternalGame.g:2349:1: rule__Connaissances__Group__1 : rule__Connaissances__Group__1__Impl rule__Connaissances__Group__2 ;
    public final void rule__Connaissances__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2353:1: ( rule__Connaissances__Group__1__Impl rule__Connaissances__Group__2 )
            // InternalGame.g:2354:2: rule__Connaissances__Group__1__Impl rule__Connaissances__Group__2
            {
            pushFollow(FOLLOW_28);
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
    // InternalGame.g:2361:1: rule__Connaissances__Group__1__Impl : ( '{' ) ;
    public final void rule__Connaissances__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2365:1: ( ( '{' ) )
            // InternalGame.g:2366:1: ( '{' )
            {
            // InternalGame.g:2366:1: ( '{' )
            // InternalGame.g:2367:2: '{'
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
    // InternalGame.g:2376:1: rule__Connaissances__Group__2 : rule__Connaissances__Group__2__Impl rule__Connaissances__Group__3 ;
    public final void rule__Connaissances__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2380:1: ( rule__Connaissances__Group__2__Impl rule__Connaissances__Group__3 )
            // InternalGame.g:2381:2: rule__Connaissances__Group__2__Impl rule__Connaissances__Group__3
            {
            pushFollow(FOLLOW_28);
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
    // InternalGame.g:2388:1: rule__Connaissances__Group__2__Impl : ( ( rule__Connaissances__ListeConnaissanceAssignment_2 )* ) ;
    public final void rule__Connaissances__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2392:1: ( ( ( rule__Connaissances__ListeConnaissanceAssignment_2 )* ) )
            // InternalGame.g:2393:1: ( ( rule__Connaissances__ListeConnaissanceAssignment_2 )* )
            {
            // InternalGame.g:2393:1: ( ( rule__Connaissances__ListeConnaissanceAssignment_2 )* )
            // InternalGame.g:2394:2: ( rule__Connaissances__ListeConnaissanceAssignment_2 )*
            {
             before(grammarAccess.getConnaissancesAccess().getListeConnaissanceAssignment_2()); 
            // InternalGame.g:2395:2: ( rule__Connaissances__ListeConnaissanceAssignment_2 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==30) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalGame.g:2395:3: rule__Connaissances__ListeConnaissanceAssignment_2
            	    {
            	    pushFollow(FOLLOW_29);
            	    rule__Connaissances__ListeConnaissanceAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
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
    // InternalGame.g:2403:1: rule__Connaissances__Group__3 : rule__Connaissances__Group__3__Impl ;
    public final void rule__Connaissances__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2407:1: ( rule__Connaissances__Group__3__Impl )
            // InternalGame.g:2408:2: rule__Connaissances__Group__3__Impl
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
    // InternalGame.g:2414:1: rule__Connaissances__Group__3__Impl : ( '}' ) ;
    public final void rule__Connaissances__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2418:1: ( ( '}' ) )
            // InternalGame.g:2419:1: ( '}' )
            {
            // InternalGame.g:2419:1: ( '}' )
            // InternalGame.g:2420:2: '}'
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
    // InternalGame.g:2430:1: rule__Connaissance__Group__0 : rule__Connaissance__Group__0__Impl rule__Connaissance__Group__1 ;
    public final void rule__Connaissance__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2434:1: ( rule__Connaissance__Group__0__Impl rule__Connaissance__Group__1 )
            // InternalGame.g:2435:2: rule__Connaissance__Group__0__Impl rule__Connaissance__Group__1
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
    // InternalGame.g:2442:1: rule__Connaissance__Group__0__Impl : ( 'connaissance' ) ;
    public final void rule__Connaissance__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2446:1: ( ( 'connaissance' ) )
            // InternalGame.g:2447:1: ( 'connaissance' )
            {
            // InternalGame.g:2447:1: ( 'connaissance' )
            // InternalGame.g:2448:2: 'connaissance'
            {
             before(grammarAccess.getConnaissanceAccess().getConnaissanceKeyword_0()); 
            match(input,30,FOLLOW_2); 
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
    // InternalGame.g:2457:1: rule__Connaissance__Group__1 : rule__Connaissance__Group__1__Impl ;
    public final void rule__Connaissance__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2461:1: ( rule__Connaissance__Group__1__Impl )
            // InternalGame.g:2462:2: rule__Connaissance__Group__1__Impl
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
    // InternalGame.g:2468:1: rule__Connaissance__Group__1__Impl : ( ( rule__Connaissance__NameAssignment_1 ) ) ;
    public final void rule__Connaissance__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2472:1: ( ( ( rule__Connaissance__NameAssignment_1 ) ) )
            // InternalGame.g:2473:1: ( ( rule__Connaissance__NameAssignment_1 ) )
            {
            // InternalGame.g:2473:1: ( ( rule__Connaissance__NameAssignment_1 ) )
            // InternalGame.g:2474:2: ( rule__Connaissance__NameAssignment_1 )
            {
             before(grammarAccess.getConnaissanceAccess().getNameAssignment_1()); 
            // InternalGame.g:2475:2: ( rule__Connaissance__NameAssignment_1 )
            // InternalGame.g:2475:3: rule__Connaissance__NameAssignment_1
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
    // InternalGame.g:2484:1: rule__Game__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Game__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2488:1: ( ( RULE_ID ) )
            // InternalGame.g:2489:2: ( RULE_ID )
            {
            // InternalGame.g:2489:2: ( RULE_ID )
            // InternalGame.g:2490:3: RULE_ID
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
    // InternalGame.g:2499:1: rule__Game__GameElementsAssignment_3 : ( rulegameElement ) ;
    public final void rule__Game__GameElementsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2503:1: ( ( rulegameElement ) )
            // InternalGame.g:2504:2: ( rulegameElement )
            {
            // InternalGame.g:2504:2: ( rulegameElement )
            // InternalGame.g:2505:3: rulegameElement
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


    // $ANTLR start "rule__Territoire__NameAssignment_1"
    // InternalGame.g:2514:1: rule__Territoire__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Territoire__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2518:1: ( ( RULE_ID ) )
            // InternalGame.g:2519:2: ( RULE_ID )
            {
            // InternalGame.g:2519:2: ( RULE_ID )
            // InternalGame.g:2520:3: RULE_ID
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
    // InternalGame.g:2529:1: rule__Territoire__TerritoireElementsAssignment_3 : ( ruleExplorateur ) ;
    public final void rule__Territoire__TerritoireElementsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2533:1: ( ( ruleExplorateur ) )
            // InternalGame.g:2534:2: ( ruleExplorateur )
            {
            // InternalGame.g:2534:2: ( ruleExplorateur )
            // InternalGame.g:2535:3: ruleExplorateur
            {
             before(grammarAccess.getTerritoireAccess().getTerritoireElementsExplorateurParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleExplorateur();

            state._fsp--;

             after(grammarAccess.getTerritoireAccess().getTerritoireElementsExplorateurParserRuleCall_3_0()); 

            }


            }

        }
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


    // $ANTLR start "rule__Territoire__TerritoireElementsAssignment_4"
    // InternalGame.g:2544:1: rule__Territoire__TerritoireElementsAssignment_4 : ( ruleLieuDebut ) ;
    public final void rule__Territoire__TerritoireElementsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2548:1: ( ( ruleLieuDebut ) )
            // InternalGame.g:2549:2: ( ruleLieuDebut )
            {
            // InternalGame.g:2549:2: ( ruleLieuDebut )
            // InternalGame.g:2550:3: ruleLieuDebut
            {
             before(grammarAccess.getTerritoireAccess().getTerritoireElementsLieuDebutParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleLieuDebut();

            state._fsp--;

             after(grammarAccess.getTerritoireAccess().getTerritoireElementsLieuDebutParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Territoire__TerritoireElementsAssignment_4"


    // $ANTLR start "rule__Territoire__TerritoireElementsAssignment_5"
    // InternalGame.g:2559:1: rule__Territoire__TerritoireElementsAssignment_5 : ( ruleLieuFin ) ;
    public final void rule__Territoire__TerritoireElementsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2563:1: ( ( ruleLieuFin ) )
            // InternalGame.g:2564:2: ( ruleLieuFin )
            {
            // InternalGame.g:2564:2: ( ruleLieuFin )
            // InternalGame.g:2565:3: ruleLieuFin
            {
             before(grammarAccess.getTerritoireAccess().getTerritoireElementsLieuFinParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleLieuFin();

            state._fsp--;

             after(grammarAccess.getTerritoireAccess().getTerritoireElementsLieuFinParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Territoire__TerritoireElementsAssignment_5"


    // $ANTLR start "rule__Territoire__TerritoireElementsAssignment_6"
    // InternalGame.g:2574:1: rule__Territoire__TerritoireElementsAssignment_6 : ( ruleLieu ) ;
    public final void rule__Territoire__TerritoireElementsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2578:1: ( ( ruleLieu ) )
            // InternalGame.g:2579:2: ( ruleLieu )
            {
            // InternalGame.g:2579:2: ( ruleLieu )
            // InternalGame.g:2580:3: ruleLieu
            {
             before(grammarAccess.getTerritoireAccess().getTerritoireElementsLieuParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleLieu();

            state._fsp--;

             after(grammarAccess.getTerritoireAccess().getTerritoireElementsLieuParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Territoire__TerritoireElementsAssignment_6"


    // $ANTLR start "rule__Explorateur__NameAssignment_1"
    // InternalGame.g:2589:1: rule__Explorateur__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Explorateur__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2593:1: ( ( RULE_ID ) )
            // InternalGame.g:2594:2: ( RULE_ID )
            {
            // InternalGame.g:2594:2: ( RULE_ID )
            // InternalGame.g:2595:3: RULE_ID
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
    // InternalGame.g:2604:1: rule__Explorateur__ExplorateurElementsAssignment_3 : ( ruleSac ) ;
    public final void rule__Explorateur__ExplorateurElementsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2608:1: ( ( ruleSac ) )
            // InternalGame.g:2609:2: ( ruleSac )
            {
            // InternalGame.g:2609:2: ( ruleSac )
            // InternalGame.g:2610:3: ruleSac
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
    // InternalGame.g:2619:1: rule__Explorateur__ExplorateurElementsAssignment_4 : ( ruleConnaissances ) ;
    public final void rule__Explorateur__ExplorateurElementsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2623:1: ( ( ruleConnaissances ) )
            // InternalGame.g:2624:2: ( ruleConnaissances )
            {
            // InternalGame.g:2624:2: ( ruleConnaissances )
            // InternalGame.g:2625:3: ruleConnaissances
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
    // InternalGame.g:2634:1: rule__Explorateur__ExplorateurElementsAssignment_5 : ( ruleLieu ) ;
    public final void rule__Explorateur__ExplorateurElementsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2638:1: ( ( ruleLieu ) )
            // InternalGame.g:2639:2: ( ruleLieu )
            {
            // InternalGame.g:2639:2: ( ruleLieu )
            // InternalGame.g:2640:3: ruleLieu
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
    // InternalGame.g:2649:1: rule__Sac__TailleAssignment_1 : ( RULE_INT ) ;
    public final void rule__Sac__TailleAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2653:1: ( ( RULE_INT ) )
            // InternalGame.g:2654:2: ( RULE_INT )
            {
            // InternalGame.g:2654:2: ( RULE_INT )
            // InternalGame.g:2655:3: RULE_INT
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
    // InternalGame.g:2664:1: rule__Sac__SacElementsAssignment_3 : ( ruleObjet ) ;
    public final void rule__Sac__SacElementsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2668:1: ( ( ruleObjet ) )
            // InternalGame.g:2669:2: ( ruleObjet )
            {
            // InternalGame.g:2669:2: ( ruleObjet )
            // InternalGame.g:2670:3: ruleObjet
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


    // $ANTLR start "rule__Lieu__NameAssignment_1"
    // InternalGame.g:2679:1: rule__Lieu__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Lieu__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2683:1: ( ( RULE_ID ) )
            // InternalGame.g:2684:2: ( RULE_ID )
            {
            // InternalGame.g:2684:2: ( RULE_ID )
            // InternalGame.g:2685:3: RULE_ID
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
    // InternalGame.g:2694:1: rule__Lieu__LieuElementsAssignment_3 : ( rulePersonnes ) ;
    public final void rule__Lieu__LieuElementsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2698:1: ( ( rulePersonnes ) )
            // InternalGame.g:2699:2: ( rulePersonnes )
            {
            // InternalGame.g:2699:2: ( rulePersonnes )
            // InternalGame.g:2700:3: rulePersonnes
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


    // $ANTLR start "rule__Lieu__LieuElementsAssignment_4"
    // InternalGame.g:2709:1: rule__Lieu__LieuElementsAssignment_4 : ( ruleConnaissances ) ;
    public final void rule__Lieu__LieuElementsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2713:1: ( ( ruleConnaissances ) )
            // InternalGame.g:2714:2: ( ruleConnaissances )
            {
            // InternalGame.g:2714:2: ( ruleConnaissances )
            // InternalGame.g:2715:3: ruleConnaissances
            {
             before(grammarAccess.getLieuAccess().getLieuElementsConnaissancesParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleConnaissances();

            state._fsp--;

             after(grammarAccess.getLieuAccess().getLieuElementsConnaissancesParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lieu__LieuElementsAssignment_4"


    // $ANTLR start "rule__Lieu__LieuElementsAssignment_5"
    // InternalGame.g:2724:1: rule__Lieu__LieuElementsAssignment_5 : ( ruleObjets ) ;
    public final void rule__Lieu__LieuElementsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2728:1: ( ( ruleObjets ) )
            // InternalGame.g:2729:2: ( ruleObjets )
            {
            // InternalGame.g:2729:2: ( ruleObjets )
            // InternalGame.g:2730:3: ruleObjets
            {
             before(grammarAccess.getLieuAccess().getLieuElementsObjetsParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleObjets();

            state._fsp--;

             after(grammarAccess.getLieuAccess().getLieuElementsObjetsParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lieu__LieuElementsAssignment_5"


    // $ANTLR start "rule__LieuDebut__NameAssignment_1"
    // InternalGame.g:2739:1: rule__LieuDebut__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__LieuDebut__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2743:1: ( ( RULE_ID ) )
            // InternalGame.g:2744:2: ( RULE_ID )
            {
            // InternalGame.g:2744:2: ( RULE_ID )
            // InternalGame.g:2745:3: RULE_ID
            {
             before(grammarAccess.getLieuDebutAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getLieuDebutAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LieuDebut__NameAssignment_1"


    // $ANTLR start "rule__LieuDebut__LieudebutElementsAssignment_3"
    // InternalGame.g:2754:1: rule__LieuDebut__LieudebutElementsAssignment_3 : ( rulePersonnes ) ;
    public final void rule__LieuDebut__LieudebutElementsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2758:1: ( ( rulePersonnes ) )
            // InternalGame.g:2759:2: ( rulePersonnes )
            {
            // InternalGame.g:2759:2: ( rulePersonnes )
            // InternalGame.g:2760:3: rulePersonnes
            {
             before(grammarAccess.getLieuDebutAccess().getLieudebutElementsPersonnesParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            rulePersonnes();

            state._fsp--;

             after(grammarAccess.getLieuDebutAccess().getLieudebutElementsPersonnesParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LieuDebut__LieudebutElementsAssignment_3"


    // $ANTLR start "rule__LieuFin__NameAssignment_1"
    // InternalGame.g:2769:1: rule__LieuFin__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__LieuFin__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2773:1: ( ( RULE_ID ) )
            // InternalGame.g:2774:2: ( RULE_ID )
            {
            // InternalGame.g:2774:2: ( RULE_ID )
            // InternalGame.g:2775:3: RULE_ID
            {
             before(grammarAccess.getLieuFinAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getLieuFinAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LieuFin__NameAssignment_1"


    // $ANTLR start "rule__LieuFin__LieudebutElementsAssignment_3"
    // InternalGame.g:2784:1: rule__LieuFin__LieudebutElementsAssignment_3 : ( rulePersonnes ) ;
    public final void rule__LieuFin__LieudebutElementsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2788:1: ( ( rulePersonnes ) )
            // InternalGame.g:2789:2: ( rulePersonnes )
            {
            // InternalGame.g:2789:2: ( rulePersonnes )
            // InternalGame.g:2790:3: rulePersonnes
            {
             before(grammarAccess.getLieuFinAccess().getLieudebutElementsPersonnesParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            rulePersonnes();

            state._fsp--;

             after(grammarAccess.getLieuFinAccess().getLieudebutElementsPersonnesParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LieuFin__LieudebutElementsAssignment_3"


    // $ANTLR start "rule__Personnes__ListePersonneAssignment_2"
    // InternalGame.g:2799:1: rule__Personnes__ListePersonneAssignment_2 : ( rulePersonne ) ;
    public final void rule__Personnes__ListePersonneAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2803:1: ( ( rulePersonne ) )
            // InternalGame.g:2804:2: ( rulePersonne )
            {
            // InternalGame.g:2804:2: ( rulePersonne )
            // InternalGame.g:2805:3: rulePersonne
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
    // InternalGame.g:2814:1: rule__Personne__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Personne__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2818:1: ( ( RULE_ID ) )
            // InternalGame.g:2819:2: ( RULE_ID )
            {
            // InternalGame.g:2819:2: ( RULE_ID )
            // InternalGame.g:2820:3: RULE_ID
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
    // InternalGame.g:2829:1: rule__Personne__PersonneElementsAssignment_5 : ( ruleInteraction ) ;
    public final void rule__Personne__PersonneElementsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2833:1: ( ( ruleInteraction ) )
            // InternalGame.g:2834:2: ( ruleInteraction )
            {
            // InternalGame.g:2834:2: ( ruleInteraction )
            // InternalGame.g:2835:3: ruleInteraction
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
    // InternalGame.g:2844:1: rule__Interaction__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Interaction__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2848:1: ( ( RULE_ID ) )
            // InternalGame.g:2849:2: ( RULE_ID )
            {
            // InternalGame.g:2849:2: ( RULE_ID )
            // InternalGame.g:2850:3: RULE_ID
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
    // InternalGame.g:2859:1: rule__Interaction__InteractionElementsAssignment_4 : ( ruleChoix ) ;
    public final void rule__Interaction__InteractionElementsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2863:1: ( ( ruleChoix ) )
            // InternalGame.g:2864:2: ( ruleChoix )
            {
            // InternalGame.g:2864:2: ( ruleChoix )
            // InternalGame.g:2865:3: ruleChoix
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
    // InternalGame.g:2874:1: rule__Choix__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Choix__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2878:1: ( ( RULE_ID ) )
            // InternalGame.g:2879:2: ( RULE_ID )
            {
            // InternalGame.g:2879:2: ( RULE_ID )
            // InternalGame.g:2880:3: RULE_ID
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
    // InternalGame.g:2889:1: rule__Objet__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Objet__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2893:1: ( ( RULE_ID ) )
            // InternalGame.g:2894:2: ( RULE_ID )
            {
            // InternalGame.g:2894:2: ( RULE_ID )
            // InternalGame.g:2895:3: RULE_ID
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
    // InternalGame.g:2904:1: rule__Objet__TailleAssignment_2 : ( RULE_INT ) ;
    public final void rule__Objet__TailleAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2908:1: ( ( RULE_INT ) )
            // InternalGame.g:2909:2: ( RULE_INT )
            {
            // InternalGame.g:2909:2: ( RULE_INT )
            // InternalGame.g:2910:3: RULE_INT
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
    // InternalGame.g:2919:1: rule__Objet__QuantiteAssignment_3 : ( RULE_INT ) ;
    public final void rule__Objet__QuantiteAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2923:1: ( ( RULE_INT ) )
            // InternalGame.g:2924:2: ( RULE_INT )
            {
            // InternalGame.g:2924:2: ( RULE_INT )
            // InternalGame.g:2925:3: RULE_INT
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


    // $ANTLR start "rule__Objets__ListeObjetsAssignment_2"
    // InternalGame.g:2934:1: rule__Objets__ListeObjetsAssignment_2 : ( ruleObjet ) ;
    public final void rule__Objets__ListeObjetsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2938:1: ( ( ruleObjet ) )
            // InternalGame.g:2939:2: ( ruleObjet )
            {
            // InternalGame.g:2939:2: ( ruleObjet )
            // InternalGame.g:2940:3: ruleObjet
            {
             before(grammarAccess.getObjetsAccess().getListeObjetsObjetParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleObjet();

            state._fsp--;

             after(grammarAccess.getObjetsAccess().getListeObjetsObjetParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Objets__ListeObjetsAssignment_2"


    // $ANTLR start "rule__Connaissances__ListeConnaissanceAssignment_2"
    // InternalGame.g:2949:1: rule__Connaissances__ListeConnaissanceAssignment_2 : ( ruleConnaissance ) ;
    public final void rule__Connaissances__ListeConnaissanceAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2953:1: ( ( ruleConnaissance ) )
            // InternalGame.g:2954:2: ( ruleConnaissance )
            {
            // InternalGame.g:2954:2: ( ruleConnaissance )
            // InternalGame.g:2955:3: ruleConnaissance
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
    // InternalGame.g:2964:1: rule__Connaissance__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Connaissance__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2968:1: ( ( RULE_ID ) )
            // InternalGame.g:2969:2: ( RULE_ID )
            {
            // InternalGame.g:2969:2: ( RULE_ID )
            // InternalGame.g:2970:3: RULE_ID
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
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000022000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000020022000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000008002000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000030102000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000102000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000202000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000004002000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000040002000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000040000002L});

}