package fr.n7.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import fr.n7.services.GameGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalGameParser extends AbstractInternalAntlrParser {
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

        public InternalGameParser(TokenStream input, GameGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Game";
       	}

       	@Override
       	protected GameGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleGame"
    // InternalGame.g:64:1: entryRuleGame returns [EObject current=null] : iv_ruleGame= ruleGame EOF ;
    public final EObject entryRuleGame() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGame = null;


        try {
            // InternalGame.g:64:45: (iv_ruleGame= ruleGame EOF )
            // InternalGame.g:65:2: iv_ruleGame= ruleGame EOF
            {
             newCompositeNode(grammarAccess.getGameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGame=ruleGame();

            state._fsp--;

             current =iv_ruleGame; 
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
    // $ANTLR end "entryRuleGame"


    // $ANTLR start "ruleGame"
    // InternalGame.g:71:1: ruleGame returns [EObject current=null] : (otherlv_0= 'Game' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_gameElements_3_0= rulegameElement ) ) otherlv_4= '}' ) ;
    public final EObject ruleGame() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_gameElements_3_0 = null;



        	enterRule();

        try {
            // InternalGame.g:77:2: ( (otherlv_0= 'Game' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_gameElements_3_0= rulegameElement ) ) otherlv_4= '}' ) )
            // InternalGame.g:78:2: (otherlv_0= 'Game' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_gameElements_3_0= rulegameElement ) ) otherlv_4= '}' )
            {
            // InternalGame.g:78:2: (otherlv_0= 'Game' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_gameElements_3_0= rulegameElement ) ) otherlv_4= '}' )
            // InternalGame.g:79:3: otherlv_0= 'Game' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_gameElements_3_0= rulegameElement ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getGameAccess().getGameKeyword_0());
            		
            // InternalGame.g:83:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalGame.g:84:4: (lv_name_1_0= RULE_ID )
            {
            // InternalGame.g:84:4: (lv_name_1_0= RULE_ID )
            // InternalGame.g:85:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getGameAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGameRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getGameAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalGame.g:105:3: ( (lv_gameElements_3_0= rulegameElement ) )
            // InternalGame.g:106:4: (lv_gameElements_3_0= rulegameElement )
            {
            // InternalGame.g:106:4: (lv_gameElements_3_0= rulegameElement )
            // InternalGame.g:107:5: lv_gameElements_3_0= rulegameElement
            {

            					newCompositeNode(grammarAccess.getGameAccess().getGameElementsGameElementParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_6);
            lv_gameElements_3_0=rulegameElement();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGameRule());
            					}
            					add(
            						current,
            						"gameElements",
            						lv_gameElements_3_0,
            						"fr.n7.Game.gameElement");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getGameAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleGame"


    // $ANTLR start "entryRulegameElement"
    // InternalGame.g:132:1: entryRulegameElement returns [EObject current=null] : iv_rulegameElement= rulegameElement EOF ;
    public final EObject entryRulegameElement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulegameElement = null;


        try {
            // InternalGame.g:132:52: (iv_rulegameElement= rulegameElement EOF )
            // InternalGame.g:133:2: iv_rulegameElement= rulegameElement EOF
            {
             newCompositeNode(grammarAccess.getGameElementRule()); 
            pushFollow(FOLLOW_1);
            iv_rulegameElement=rulegameElement();

            state._fsp--;

             current =iv_rulegameElement; 
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
    // $ANTLR end "entryRulegameElement"


    // $ANTLR start "rulegameElement"
    // InternalGame.g:139:1: rulegameElement returns [EObject current=null] : this_Territoire_0= ruleTerritoire ;
    public final EObject rulegameElement() throws RecognitionException {
        EObject current = null;

        EObject this_Territoire_0 = null;



        	enterRule();

        try {
            // InternalGame.g:145:2: (this_Territoire_0= ruleTerritoire )
            // InternalGame.g:146:2: this_Territoire_0= ruleTerritoire
            {

            		newCompositeNode(grammarAccess.getGameElementAccess().getTerritoireParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_Territoire_0=ruleTerritoire();

            state._fsp--;


            		current = this_Territoire_0;
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
    // $ANTLR end "rulegameElement"


    // $ANTLR start "entryRuleterritoireElement"
    // InternalGame.g:157:1: entryRuleterritoireElement returns [EObject current=null] : iv_ruleterritoireElement= ruleterritoireElement EOF ;
    public final EObject entryRuleterritoireElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleterritoireElement = null;


        try {
            // InternalGame.g:157:58: (iv_ruleterritoireElement= ruleterritoireElement EOF )
            // InternalGame.g:158:2: iv_ruleterritoireElement= ruleterritoireElement EOF
            {
             newCompositeNode(grammarAccess.getTerritoireElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleterritoireElement=ruleterritoireElement();

            state._fsp--;

             current =iv_ruleterritoireElement; 
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
    // $ANTLR end "entryRuleterritoireElement"


    // $ANTLR start "ruleterritoireElement"
    // InternalGame.g:164:1: ruleterritoireElement returns [EObject current=null] : (this_Explorateur_0= ruleExplorateur | this_Lieu_1= ruleLieu ) ;
    public final EObject ruleterritoireElement() throws RecognitionException {
        EObject current = null;

        EObject this_Explorateur_0 = null;

        EObject this_Lieu_1 = null;



        	enterRule();

        try {
            // InternalGame.g:170:2: ( (this_Explorateur_0= ruleExplorateur | this_Lieu_1= ruleLieu ) )
            // InternalGame.g:171:2: (this_Explorateur_0= ruleExplorateur | this_Lieu_1= ruleLieu )
            {
            // InternalGame.g:171:2: (this_Explorateur_0= ruleExplorateur | this_Lieu_1= ruleLieu )
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
                    // InternalGame.g:172:3: this_Explorateur_0= ruleExplorateur
                    {

                    			newCompositeNode(grammarAccess.getTerritoireElementAccess().getExplorateurParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Explorateur_0=ruleExplorateur();

                    state._fsp--;


                    			current = this_Explorateur_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalGame.g:181:3: this_Lieu_1= ruleLieu
                    {

                    			newCompositeNode(grammarAccess.getTerritoireElementAccess().getLieuParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Lieu_1=ruleLieu();

                    state._fsp--;


                    			current = this_Lieu_1;
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
    // $ANTLR end "ruleterritoireElement"


    // $ANTLR start "entryRuleExplorateur"
    // InternalGame.g:193:1: entryRuleExplorateur returns [EObject current=null] : iv_ruleExplorateur= ruleExplorateur EOF ;
    public final EObject entryRuleExplorateur() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExplorateur = null;


        try {
            // InternalGame.g:193:52: (iv_ruleExplorateur= ruleExplorateur EOF )
            // InternalGame.g:194:2: iv_ruleExplorateur= ruleExplorateur EOF
            {
             newCompositeNode(grammarAccess.getExplorateurRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExplorateur=ruleExplorateur();

            state._fsp--;

             current =iv_ruleExplorateur; 
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
    // $ANTLR end "entryRuleExplorateur"


    // $ANTLR start "ruleExplorateur"
    // InternalGame.g:200:1: ruleExplorateur returns [EObject current=null] : (otherlv_0= 'explorateur' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_explorateurElements_3_0= ruleSac ) ) ( (lv_explorateurElements_4_0= ruleConnaissances ) ) ( (lv_explorateurElements_5_0= ruleLieu ) )? otherlv_6= '}' ) ;
    public final EObject ruleExplorateur() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_6=null;
        EObject lv_explorateurElements_3_0 = null;

        EObject lv_explorateurElements_4_0 = null;

        EObject lv_explorateurElements_5_0 = null;



        	enterRule();

        try {
            // InternalGame.g:206:2: ( (otherlv_0= 'explorateur' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_explorateurElements_3_0= ruleSac ) ) ( (lv_explorateurElements_4_0= ruleConnaissances ) ) ( (lv_explorateurElements_5_0= ruleLieu ) )? otherlv_6= '}' ) )
            // InternalGame.g:207:2: (otherlv_0= 'explorateur' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_explorateurElements_3_0= ruleSac ) ) ( (lv_explorateurElements_4_0= ruleConnaissances ) ) ( (lv_explorateurElements_5_0= ruleLieu ) )? otherlv_6= '}' )
            {
            // InternalGame.g:207:2: (otherlv_0= 'explorateur' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_explorateurElements_3_0= ruleSac ) ) ( (lv_explorateurElements_4_0= ruleConnaissances ) ) ( (lv_explorateurElements_5_0= ruleLieu ) )? otherlv_6= '}' )
            // InternalGame.g:208:3: otherlv_0= 'explorateur' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_explorateurElements_3_0= ruleSac ) ) ( (lv_explorateurElements_4_0= ruleConnaissances ) ) ( (lv_explorateurElements_5_0= ruleLieu ) )? otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getExplorateurAccess().getExplorateurKeyword_0());
            		
            // InternalGame.g:212:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalGame.g:213:4: (lv_name_1_0= RULE_ID )
            {
            // InternalGame.g:213:4: (lv_name_1_0= RULE_ID )
            // InternalGame.g:214:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getExplorateurAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExplorateurRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getExplorateurAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalGame.g:234:3: ( (lv_explorateurElements_3_0= ruleSac ) )
            // InternalGame.g:235:4: (lv_explorateurElements_3_0= ruleSac )
            {
            // InternalGame.g:235:4: (lv_explorateurElements_3_0= ruleSac )
            // InternalGame.g:236:5: lv_explorateurElements_3_0= ruleSac
            {

            					newCompositeNode(grammarAccess.getExplorateurAccess().getExplorateurElementsSacParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_8);
            lv_explorateurElements_3_0=ruleSac();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExplorateurRule());
            					}
            					add(
            						current,
            						"explorateurElements",
            						lv_explorateurElements_3_0,
            						"fr.n7.Game.Sac");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalGame.g:253:3: ( (lv_explorateurElements_4_0= ruleConnaissances ) )
            // InternalGame.g:254:4: (lv_explorateurElements_4_0= ruleConnaissances )
            {
            // InternalGame.g:254:4: (lv_explorateurElements_4_0= ruleConnaissances )
            // InternalGame.g:255:5: lv_explorateurElements_4_0= ruleConnaissances
            {

            					newCompositeNode(grammarAccess.getExplorateurAccess().getExplorateurElementsConnaissancesParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_9);
            lv_explorateurElements_4_0=ruleConnaissances();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExplorateurRule());
            					}
            					add(
            						current,
            						"explorateurElements",
            						lv_explorateurElements_4_0,
            						"fr.n7.Game.Connaissances");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalGame.g:272:3: ( (lv_explorateurElements_5_0= ruleLieu ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==17) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalGame.g:273:4: (lv_explorateurElements_5_0= ruleLieu )
                    {
                    // InternalGame.g:273:4: (lv_explorateurElements_5_0= ruleLieu )
                    // InternalGame.g:274:5: lv_explorateurElements_5_0= ruleLieu
                    {

                    					newCompositeNode(grammarAccess.getExplorateurAccess().getExplorateurElementsLieuParserRuleCall_5_0());
                    				
                    pushFollow(FOLLOW_6);
                    lv_explorateurElements_5_0=ruleLieu();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getExplorateurRule());
                    					}
                    					add(
                    						current,
                    						"explorateurElements",
                    						lv_explorateurElements_5_0,
                    						"fr.n7.Game.Lieu");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getExplorateurAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleExplorateur"


    // $ANTLR start "entryRuleSac"
    // InternalGame.g:299:1: entryRuleSac returns [EObject current=null] : iv_ruleSac= ruleSac EOF ;
    public final EObject entryRuleSac() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSac = null;


        try {
            // InternalGame.g:299:44: (iv_ruleSac= ruleSac EOF )
            // InternalGame.g:300:2: iv_ruleSac= ruleSac EOF
            {
             newCompositeNode(grammarAccess.getSacRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSac=ruleSac();

            state._fsp--;

             current =iv_ruleSac; 
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
    // $ANTLR end "entryRuleSac"


    // $ANTLR start "ruleSac"
    // InternalGame.g:306:1: ruleSac returns [EObject current=null] : (otherlv_0= 'sac' ( (lv_taille_1_0= RULE_INT ) ) otherlv_2= '{' ( (lv_sacElements_3_0= ruleObjet ) )* otherlv_4= '}' ) ;
    public final EObject ruleSac() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_taille_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_sacElements_3_0 = null;



        	enterRule();

        try {
            // InternalGame.g:312:2: ( (otherlv_0= 'sac' ( (lv_taille_1_0= RULE_INT ) ) otherlv_2= '{' ( (lv_sacElements_3_0= ruleObjet ) )* otherlv_4= '}' ) )
            // InternalGame.g:313:2: (otherlv_0= 'sac' ( (lv_taille_1_0= RULE_INT ) ) otherlv_2= '{' ( (lv_sacElements_3_0= ruleObjet ) )* otherlv_4= '}' )
            {
            // InternalGame.g:313:2: (otherlv_0= 'sac' ( (lv_taille_1_0= RULE_INT ) ) otherlv_2= '{' ( (lv_sacElements_3_0= ruleObjet ) )* otherlv_4= '}' )
            // InternalGame.g:314:3: otherlv_0= 'sac' ( (lv_taille_1_0= RULE_INT ) ) otherlv_2= '{' ( (lv_sacElements_3_0= ruleObjet ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getSacAccess().getSacKeyword_0());
            		
            // InternalGame.g:318:3: ( (lv_taille_1_0= RULE_INT ) )
            // InternalGame.g:319:4: (lv_taille_1_0= RULE_INT )
            {
            // InternalGame.g:319:4: (lv_taille_1_0= RULE_INT )
            // InternalGame.g:320:5: lv_taille_1_0= RULE_INT
            {
            lv_taille_1_0=(Token)match(input,RULE_INT,FOLLOW_4); 

            					newLeafNode(lv_taille_1_0, grammarAccess.getSacAccess().getTailleINTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSacRule());
            					}
            					setWithLastConsumed(
            						current,
            						"taille",
            						lv_taille_1_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_11); 

            			newLeafNode(otherlv_2, grammarAccess.getSacAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalGame.g:340:3: ( (lv_sacElements_3_0= ruleObjet ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==25) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalGame.g:341:4: (lv_sacElements_3_0= ruleObjet )
            	    {
            	    // InternalGame.g:341:4: (lv_sacElements_3_0= ruleObjet )
            	    // InternalGame.g:342:5: lv_sacElements_3_0= ruleObjet
            	    {

            	    					newCompositeNode(grammarAccess.getSacAccess().getSacElementsObjetParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_11);
            	    lv_sacElements_3_0=ruleObjet();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSacRule());
            	    					}
            	    					add(
            	    						current,
            	    						"sacElements",
            	    						lv_sacElements_3_0,
            	    						"fr.n7.Game.Objet");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_4=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getSacAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleSac"


    // $ANTLR start "entryRuleTerritoire"
    // InternalGame.g:367:1: entryRuleTerritoire returns [EObject current=null] : iv_ruleTerritoire= ruleTerritoire EOF ;
    public final EObject entryRuleTerritoire() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTerritoire = null;


        try {
            // InternalGame.g:367:51: (iv_ruleTerritoire= ruleTerritoire EOF )
            // InternalGame.g:368:2: iv_ruleTerritoire= ruleTerritoire EOF
            {
             newCompositeNode(grammarAccess.getTerritoireRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTerritoire=ruleTerritoire();

            state._fsp--;

             current =iv_ruleTerritoire; 
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
    // $ANTLR end "entryRuleTerritoire"


    // $ANTLR start "ruleTerritoire"
    // InternalGame.g:374:1: ruleTerritoire returns [EObject current=null] : (otherlv_0= 'territoire' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_territoireElements_3_0= ruleterritoireElement ) )* otherlv_4= '}' ) ;
    public final EObject ruleTerritoire() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_territoireElements_3_0 = null;



        	enterRule();

        try {
            // InternalGame.g:380:2: ( (otherlv_0= 'territoire' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_territoireElements_3_0= ruleterritoireElement ) )* otherlv_4= '}' ) )
            // InternalGame.g:381:2: (otherlv_0= 'territoire' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_territoireElements_3_0= ruleterritoireElement ) )* otherlv_4= '}' )
            {
            // InternalGame.g:381:2: (otherlv_0= 'territoire' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_territoireElements_3_0= ruleterritoireElement ) )* otherlv_4= '}' )
            // InternalGame.g:382:3: otherlv_0= 'territoire' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_territoireElements_3_0= ruleterritoireElement ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getTerritoireAccess().getTerritoireKeyword_0());
            		
            // InternalGame.g:386:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalGame.g:387:4: (lv_name_1_0= RULE_ID )
            {
            // InternalGame.g:387:4: (lv_name_1_0= RULE_ID )
            // InternalGame.g:388:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getTerritoireAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTerritoireRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12); 

            			newLeafNode(otherlv_2, grammarAccess.getTerritoireAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalGame.g:408:3: ( (lv_territoireElements_3_0= ruleterritoireElement ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==14||LA4_0==17) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalGame.g:409:4: (lv_territoireElements_3_0= ruleterritoireElement )
            	    {
            	    // InternalGame.g:409:4: (lv_territoireElements_3_0= ruleterritoireElement )
            	    // InternalGame.g:410:5: lv_territoireElements_3_0= ruleterritoireElement
            	    {

            	    					newCompositeNode(grammarAccess.getTerritoireAccess().getTerritoireElementsTerritoireElementParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_12);
            	    lv_territoireElements_3_0=ruleterritoireElement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getTerritoireRule());
            	    					}
            	    					add(
            	    						current,
            	    						"territoireElements",
            	    						lv_territoireElements_3_0,
            	    						"fr.n7.Game.territoireElement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_4=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getTerritoireAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleTerritoire"


    // $ANTLR start "entryRuleLieu"
    // InternalGame.g:435:1: entryRuleLieu returns [EObject current=null] : iv_ruleLieu= ruleLieu EOF ;
    public final EObject entryRuleLieu() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLieu = null;


        try {
            // InternalGame.g:435:45: (iv_ruleLieu= ruleLieu EOF )
            // InternalGame.g:436:2: iv_ruleLieu= ruleLieu EOF
            {
             newCompositeNode(grammarAccess.getLieuRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLieu=ruleLieu();

            state._fsp--;

             current =iv_ruleLieu; 
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
    // $ANTLR end "entryRuleLieu"


    // $ANTLR start "ruleLieu"
    // InternalGame.g:442:1: ruleLieu returns [EObject current=null] : (otherlv_0= 'lieu' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_lieuElements_3_0= rulePersonnes ) ) otherlv_4= '}' ) ;
    public final EObject ruleLieu() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_lieuElements_3_0 = null;



        	enterRule();

        try {
            // InternalGame.g:448:2: ( (otherlv_0= 'lieu' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_lieuElements_3_0= rulePersonnes ) ) otherlv_4= '}' ) )
            // InternalGame.g:449:2: (otherlv_0= 'lieu' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_lieuElements_3_0= rulePersonnes ) ) otherlv_4= '}' )
            {
            // InternalGame.g:449:2: (otherlv_0= 'lieu' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_lieuElements_3_0= rulePersonnes ) ) otherlv_4= '}' )
            // InternalGame.g:450:3: otherlv_0= 'lieu' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_lieuElements_3_0= rulePersonnes ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getLieuAccess().getLieuKeyword_0());
            		
            // InternalGame.g:454:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalGame.g:455:4: (lv_name_1_0= RULE_ID )
            {
            // InternalGame.g:455:4: (lv_name_1_0= RULE_ID )
            // InternalGame.g:456:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getLieuAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLieuRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_13); 

            			newLeafNode(otherlv_2, grammarAccess.getLieuAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalGame.g:476:3: ( (lv_lieuElements_3_0= rulePersonnes ) )
            // InternalGame.g:477:4: (lv_lieuElements_3_0= rulePersonnes )
            {
            // InternalGame.g:477:4: (lv_lieuElements_3_0= rulePersonnes )
            // InternalGame.g:478:5: lv_lieuElements_3_0= rulePersonnes
            {

            					newCompositeNode(grammarAccess.getLieuAccess().getLieuElementsPersonnesParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_6);
            lv_lieuElements_3_0=rulePersonnes();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLieuRule());
            					}
            					add(
            						current,
            						"lieuElements",
            						lv_lieuElements_3_0,
            						"fr.n7.Game.Personnes");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getLieuAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleLieu"


    // $ANTLR start "entryRulePersonnes"
    // InternalGame.g:503:1: entryRulePersonnes returns [EObject current=null] : iv_rulePersonnes= rulePersonnes EOF ;
    public final EObject entryRulePersonnes() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePersonnes = null;


        try {
            // InternalGame.g:503:50: (iv_rulePersonnes= rulePersonnes EOF )
            // InternalGame.g:504:2: iv_rulePersonnes= rulePersonnes EOF
            {
             newCompositeNode(grammarAccess.getPersonnesRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePersonnes=rulePersonnes();

            state._fsp--;

             current =iv_rulePersonnes; 
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
    // $ANTLR end "entryRulePersonnes"


    // $ANTLR start "rulePersonnes"
    // InternalGame.g:510:1: rulePersonnes returns [EObject current=null] : (otherlv_0= 'personnes' otherlv_1= '{' ( (lv_listePersonne_2_0= rulePersonne ) )* otherlv_3= '}' ) ;
    public final EObject rulePersonnes() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_listePersonne_2_0 = null;



        	enterRule();

        try {
            // InternalGame.g:516:2: ( (otherlv_0= 'personnes' otherlv_1= '{' ( (lv_listePersonne_2_0= rulePersonne ) )* otherlv_3= '}' ) )
            // InternalGame.g:517:2: (otherlv_0= 'personnes' otherlv_1= '{' ( (lv_listePersonne_2_0= rulePersonne ) )* otherlv_3= '}' )
            {
            // InternalGame.g:517:2: (otherlv_0= 'personnes' otherlv_1= '{' ( (lv_listePersonne_2_0= rulePersonne ) )* otherlv_3= '}' )
            // InternalGame.g:518:3: otherlv_0= 'personnes' otherlv_1= '{' ( (lv_listePersonne_2_0= rulePersonne ) )* otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getPersonnesAccess().getPersonnesKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getPersonnesAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalGame.g:526:3: ( (lv_listePersonne_2_0= rulePersonne ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==19) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalGame.g:527:4: (lv_listePersonne_2_0= rulePersonne )
            	    {
            	    // InternalGame.g:527:4: (lv_listePersonne_2_0= rulePersonne )
            	    // InternalGame.g:528:5: lv_listePersonne_2_0= rulePersonne
            	    {

            	    					newCompositeNode(grammarAccess.getPersonnesAccess().getListePersonnePersonneParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_14);
            	    lv_listePersonne_2_0=rulePersonne();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getPersonnesRule());
            	    					}
            	    					add(
            	    						current,
            	    						"listePersonne",
            	    						lv_listePersonne_2_0,
            	    						"fr.n7.Game.Personne");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            otherlv_3=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getPersonnesAccess().getRightCurlyBracketKeyword_3());
            		

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
    // $ANTLR end "rulePersonnes"


    // $ANTLR start "entryRulePersonne"
    // InternalGame.g:553:1: entryRulePersonne returns [EObject current=null] : iv_rulePersonne= rulePersonne EOF ;
    public final EObject entryRulePersonne() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePersonne = null;


        try {
            // InternalGame.g:553:49: (iv_rulePersonne= rulePersonne EOF )
            // InternalGame.g:554:2: iv_rulePersonne= rulePersonne EOF
            {
             newCompositeNode(grammarAccess.getPersonneRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePersonne=rulePersonne();

            state._fsp--;

             current =iv_rulePersonne; 
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
    // $ANTLR end "entryRulePersonne"


    // $ANTLR start "rulePersonne"
    // InternalGame.g:560:1: rulePersonne returns [EObject current=null] : (otherlv_0= 'personne' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'visible' otherlv_4= 'obligatoire' ( (lv_personneElements_5_0= ruleInteraction ) ) otherlv_6= '}' ) ;
    public final EObject rulePersonne() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_personneElements_5_0 = null;



        	enterRule();

        try {
            // InternalGame.g:566:2: ( (otherlv_0= 'personne' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'visible' otherlv_4= 'obligatoire' ( (lv_personneElements_5_0= ruleInteraction ) ) otherlv_6= '}' ) )
            // InternalGame.g:567:2: (otherlv_0= 'personne' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'visible' otherlv_4= 'obligatoire' ( (lv_personneElements_5_0= ruleInteraction ) ) otherlv_6= '}' )
            {
            // InternalGame.g:567:2: (otherlv_0= 'personne' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'visible' otherlv_4= 'obligatoire' ( (lv_personneElements_5_0= ruleInteraction ) ) otherlv_6= '}' )
            // InternalGame.g:568:3: otherlv_0= 'personne' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'visible' otherlv_4= 'obligatoire' ( (lv_personneElements_5_0= ruleInteraction ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getPersonneAccess().getPersonneKeyword_0());
            		
            // InternalGame.g:572:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalGame.g:573:4: (lv_name_1_0= RULE_ID )
            {
            // InternalGame.g:573:4: (lv_name_1_0= RULE_ID )
            // InternalGame.g:574:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getPersonneAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPersonneRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_15); 

            			newLeafNode(otherlv_2, grammarAccess.getPersonneAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,20,FOLLOW_16); 

            			newLeafNode(otherlv_3, grammarAccess.getPersonneAccess().getVisibleKeyword_3());
            		
            otherlv_4=(Token)match(input,21,FOLLOW_17); 

            			newLeafNode(otherlv_4, grammarAccess.getPersonneAccess().getObligatoireKeyword_4());
            		
            // InternalGame.g:602:3: ( (lv_personneElements_5_0= ruleInteraction ) )
            // InternalGame.g:603:4: (lv_personneElements_5_0= ruleInteraction )
            {
            // InternalGame.g:603:4: (lv_personneElements_5_0= ruleInteraction )
            // InternalGame.g:604:5: lv_personneElements_5_0= ruleInteraction
            {

            					newCompositeNode(grammarAccess.getPersonneAccess().getPersonneElementsInteractionParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_6);
            lv_personneElements_5_0=ruleInteraction();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPersonneRule());
            					}
            					add(
            						current,
            						"personneElements",
            						lv_personneElements_5_0,
            						"fr.n7.Game.Interaction");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getPersonneAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "rulePersonne"


    // $ANTLR start "entryRuleInteraction"
    // InternalGame.g:629:1: entryRuleInteraction returns [EObject current=null] : iv_ruleInteraction= ruleInteraction EOF ;
    public final EObject entryRuleInteraction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInteraction = null;


        try {
            // InternalGame.g:629:52: (iv_ruleInteraction= ruleInteraction EOF )
            // InternalGame.g:630:2: iv_ruleInteraction= ruleInteraction EOF
            {
             newCompositeNode(grammarAccess.getInteractionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInteraction=ruleInteraction();

            state._fsp--;

             current =iv_ruleInteraction; 
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
    // $ANTLR end "entryRuleInteraction"


    // $ANTLR start "ruleInteraction"
    // InternalGame.g:636:1: ruleInteraction returns [EObject current=null] : (otherlv_0= 'interaction' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'texte' ( (lv_interactionElements_4_0= ruleChoix ) )* otherlv_5= '}' ) ;
    public final EObject ruleInteraction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_interactionElements_4_0 = null;



        	enterRule();

        try {
            // InternalGame.g:642:2: ( (otherlv_0= 'interaction' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'texte' ( (lv_interactionElements_4_0= ruleChoix ) )* otherlv_5= '}' ) )
            // InternalGame.g:643:2: (otherlv_0= 'interaction' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'texte' ( (lv_interactionElements_4_0= ruleChoix ) )* otherlv_5= '}' )
            {
            // InternalGame.g:643:2: (otherlv_0= 'interaction' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'texte' ( (lv_interactionElements_4_0= ruleChoix ) )* otherlv_5= '}' )
            // InternalGame.g:644:3: otherlv_0= 'interaction' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'texte' ( (lv_interactionElements_4_0= ruleChoix ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getInteractionAccess().getInteractionKeyword_0());
            		
            // InternalGame.g:648:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalGame.g:649:4: (lv_name_1_0= RULE_ID )
            {
            // InternalGame.g:649:4: (lv_name_1_0= RULE_ID )
            // InternalGame.g:650:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getInteractionAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInteractionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_18); 

            			newLeafNode(otherlv_2, grammarAccess.getInteractionAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,23,FOLLOW_19); 

            			newLeafNode(otherlv_3, grammarAccess.getInteractionAccess().getTexteKeyword_3());
            		
            // InternalGame.g:674:3: ( (lv_interactionElements_4_0= ruleChoix ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==24) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalGame.g:675:4: (lv_interactionElements_4_0= ruleChoix )
            	    {
            	    // InternalGame.g:675:4: (lv_interactionElements_4_0= ruleChoix )
            	    // InternalGame.g:676:5: lv_interactionElements_4_0= ruleChoix
            	    {

            	    					newCompositeNode(grammarAccess.getInteractionAccess().getInteractionElementsChoixParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_19);
            	    lv_interactionElements_4_0=ruleChoix();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getInteractionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"interactionElements",
            	    						lv_interactionElements_4_0,
            	    						"fr.n7.Game.Choix");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            otherlv_5=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getInteractionAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleInteraction"


    // $ANTLR start "entryRuleChoix"
    // InternalGame.g:701:1: entryRuleChoix returns [EObject current=null] : iv_ruleChoix= ruleChoix EOF ;
    public final EObject entryRuleChoix() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChoix = null;


        try {
            // InternalGame.g:701:46: (iv_ruleChoix= ruleChoix EOF )
            // InternalGame.g:702:2: iv_ruleChoix= ruleChoix EOF
            {
             newCompositeNode(grammarAccess.getChoixRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleChoix=ruleChoix();

            state._fsp--;

             current =iv_ruleChoix; 
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
    // $ANTLR end "entryRuleChoix"


    // $ANTLR start "ruleChoix"
    // InternalGame.g:708:1: ruleChoix returns [EObject current=null] : (otherlv_0= 'choix' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleChoix() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalGame.g:714:2: ( (otherlv_0= 'choix' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalGame.g:715:2: (otherlv_0= 'choix' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalGame.g:715:2: (otherlv_0= 'choix' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalGame.g:716:3: otherlv_0= 'choix' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,24,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getChoixAccess().getChoixKeyword_0());
            		
            // InternalGame.g:720:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalGame.g:721:4: (lv_name_1_0= RULE_ID )
            {
            // InternalGame.g:721:4: (lv_name_1_0= RULE_ID )
            // InternalGame.g:722:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getChoixAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getChoixRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

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
    // $ANTLR end "ruleChoix"


    // $ANTLR start "entryRuleObjet"
    // InternalGame.g:742:1: entryRuleObjet returns [EObject current=null] : iv_ruleObjet= ruleObjet EOF ;
    public final EObject entryRuleObjet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObjet = null;


        try {
            // InternalGame.g:742:46: (iv_ruleObjet= ruleObjet EOF )
            // InternalGame.g:743:2: iv_ruleObjet= ruleObjet EOF
            {
             newCompositeNode(grammarAccess.getObjetRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleObjet=ruleObjet();

            state._fsp--;

             current =iv_ruleObjet; 
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
    // $ANTLR end "entryRuleObjet"


    // $ANTLR start "ruleObjet"
    // InternalGame.g:749:1: ruleObjet returns [EObject current=null] : (otherlv_0= 'objet' ( (lv_name_1_0= RULE_ID ) ) ( (lv_taille_2_0= RULE_INT ) ) ( (lv_quantite_3_0= RULE_INT ) ) ) ;
    public final EObject ruleObjet() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_taille_2_0=null;
        Token lv_quantite_3_0=null;


        	enterRule();

        try {
            // InternalGame.g:755:2: ( (otherlv_0= 'objet' ( (lv_name_1_0= RULE_ID ) ) ( (lv_taille_2_0= RULE_INT ) ) ( (lv_quantite_3_0= RULE_INT ) ) ) )
            // InternalGame.g:756:2: (otherlv_0= 'objet' ( (lv_name_1_0= RULE_ID ) ) ( (lv_taille_2_0= RULE_INT ) ) ( (lv_quantite_3_0= RULE_INT ) ) )
            {
            // InternalGame.g:756:2: (otherlv_0= 'objet' ( (lv_name_1_0= RULE_ID ) ) ( (lv_taille_2_0= RULE_INT ) ) ( (lv_quantite_3_0= RULE_INT ) ) )
            // InternalGame.g:757:3: otherlv_0= 'objet' ( (lv_name_1_0= RULE_ID ) ) ( (lv_taille_2_0= RULE_INT ) ) ( (lv_quantite_3_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,25,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getObjetAccess().getObjetKeyword_0());
            		
            // InternalGame.g:761:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalGame.g:762:4: (lv_name_1_0= RULE_ID )
            {
            // InternalGame.g:762:4: (lv_name_1_0= RULE_ID )
            // InternalGame.g:763:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_10); 

            					newLeafNode(lv_name_1_0, grammarAccess.getObjetAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getObjetRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalGame.g:779:3: ( (lv_taille_2_0= RULE_INT ) )
            // InternalGame.g:780:4: (lv_taille_2_0= RULE_INT )
            {
            // InternalGame.g:780:4: (lv_taille_2_0= RULE_INT )
            // InternalGame.g:781:5: lv_taille_2_0= RULE_INT
            {
            lv_taille_2_0=(Token)match(input,RULE_INT,FOLLOW_10); 

            					newLeafNode(lv_taille_2_0, grammarAccess.getObjetAccess().getTailleINTTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getObjetRule());
            					}
            					setWithLastConsumed(
            						current,
            						"taille",
            						lv_taille_2_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            // InternalGame.g:797:3: ( (lv_quantite_3_0= RULE_INT ) )
            // InternalGame.g:798:4: (lv_quantite_3_0= RULE_INT )
            {
            // InternalGame.g:798:4: (lv_quantite_3_0= RULE_INT )
            // InternalGame.g:799:5: lv_quantite_3_0= RULE_INT
            {
            lv_quantite_3_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_quantite_3_0, grammarAccess.getObjetAccess().getQuantiteINTTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getObjetRule());
            					}
            					setWithLastConsumed(
            						current,
            						"quantite",
            						lv_quantite_3_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

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
    // $ANTLR end "ruleObjet"


    // $ANTLR start "entryRuleConnaissances"
    // InternalGame.g:819:1: entryRuleConnaissances returns [EObject current=null] : iv_ruleConnaissances= ruleConnaissances EOF ;
    public final EObject entryRuleConnaissances() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConnaissances = null;


        try {
            // InternalGame.g:819:54: (iv_ruleConnaissances= ruleConnaissances EOF )
            // InternalGame.g:820:2: iv_ruleConnaissances= ruleConnaissances EOF
            {
             newCompositeNode(grammarAccess.getConnaissancesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConnaissances=ruleConnaissances();

            state._fsp--;

             current =iv_ruleConnaissances; 
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
    // $ANTLR end "entryRuleConnaissances"


    // $ANTLR start "ruleConnaissances"
    // InternalGame.g:826:1: ruleConnaissances returns [EObject current=null] : (otherlv_0= 'connaissances' otherlv_1= '{' ( (lv_listeConnaissance_2_0= ruleConnaissance ) )* otherlv_3= '}' ) ;
    public final EObject ruleConnaissances() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_listeConnaissance_2_0 = null;



        	enterRule();

        try {
            // InternalGame.g:832:2: ( (otherlv_0= 'connaissances' otherlv_1= '{' ( (lv_listeConnaissance_2_0= ruleConnaissance ) )* otherlv_3= '}' ) )
            // InternalGame.g:833:2: (otherlv_0= 'connaissances' otherlv_1= '{' ( (lv_listeConnaissance_2_0= ruleConnaissance ) )* otherlv_3= '}' )
            {
            // InternalGame.g:833:2: (otherlv_0= 'connaissances' otherlv_1= '{' ( (lv_listeConnaissance_2_0= ruleConnaissance ) )* otherlv_3= '}' )
            // InternalGame.g:834:3: otherlv_0= 'connaissances' otherlv_1= '{' ( (lv_listeConnaissance_2_0= ruleConnaissance ) )* otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,26,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getConnaissancesAccess().getConnaissancesKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_20); 

            			newLeafNode(otherlv_1, grammarAccess.getConnaissancesAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalGame.g:842:3: ( (lv_listeConnaissance_2_0= ruleConnaissance ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==27) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalGame.g:843:4: (lv_listeConnaissance_2_0= ruleConnaissance )
            	    {
            	    // InternalGame.g:843:4: (lv_listeConnaissance_2_0= ruleConnaissance )
            	    // InternalGame.g:844:5: lv_listeConnaissance_2_0= ruleConnaissance
            	    {

            	    					newCompositeNode(grammarAccess.getConnaissancesAccess().getListeConnaissanceConnaissanceParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_20);
            	    lv_listeConnaissance_2_0=ruleConnaissance();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getConnaissancesRule());
            	    					}
            	    					add(
            	    						current,
            	    						"listeConnaissance",
            	    						lv_listeConnaissance_2_0,
            	    						"fr.n7.Game.Connaissance");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            otherlv_3=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getConnaissancesAccess().getRightCurlyBracketKeyword_3());
            		

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
    // $ANTLR end "ruleConnaissances"


    // $ANTLR start "entryRuleConnaissance"
    // InternalGame.g:869:1: entryRuleConnaissance returns [EObject current=null] : iv_ruleConnaissance= ruleConnaissance EOF ;
    public final EObject entryRuleConnaissance() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConnaissance = null;


        try {
            // InternalGame.g:869:53: (iv_ruleConnaissance= ruleConnaissance EOF )
            // InternalGame.g:870:2: iv_ruleConnaissance= ruleConnaissance EOF
            {
             newCompositeNode(grammarAccess.getConnaissanceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConnaissance=ruleConnaissance();

            state._fsp--;

             current =iv_ruleConnaissance; 
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
    // $ANTLR end "entryRuleConnaissance"


    // $ANTLR start "ruleConnaissance"
    // InternalGame.g:876:1: ruleConnaissance returns [EObject current=null] : (otherlv_0= 'connaissance' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleConnaissance() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalGame.g:882:2: ( (otherlv_0= 'connaissance' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalGame.g:883:2: (otherlv_0= 'connaissance' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalGame.g:883:2: (otherlv_0= 'connaissance' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalGame.g:884:3: otherlv_0= 'connaissance' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,27,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getConnaissanceAccess().getConnaissanceKeyword_0());
            		
            // InternalGame.g:888:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalGame.g:889:4: (lv_name_1_0= RULE_ID )
            {
            // InternalGame.g:889:4: (lv_name_1_0= RULE_ID )
            // InternalGame.g:890:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getConnaissanceAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConnaissanceRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

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
    // $ANTLR end "ruleConnaissance"

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
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000026000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000082000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000001002000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000008002000L});

}