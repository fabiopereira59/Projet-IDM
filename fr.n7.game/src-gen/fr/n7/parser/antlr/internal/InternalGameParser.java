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


    // $ANTLR start "entryRuleTerritoire"
    // InternalGame.g:157:1: entryRuleTerritoire returns [EObject current=null] : iv_ruleTerritoire= ruleTerritoire EOF ;
    public final EObject entryRuleTerritoire() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTerritoire = null;


        try {
            // InternalGame.g:157:51: (iv_ruleTerritoire= ruleTerritoire EOF )
            // InternalGame.g:158:2: iv_ruleTerritoire= ruleTerritoire EOF
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
    // InternalGame.g:164:1: ruleTerritoire returns [EObject current=null] : (otherlv_0= 'territoire' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_territoireElements_3_0= ruleExplorateur ) ) ( (lv_territoireElements_4_0= ruleLieuDebut ) ) ( (lv_territoireElements_5_0= ruleLieuFin ) )+ ( (lv_territoireElements_6_0= ruleLieu ) )* otherlv_7= '}' ) ;
    public final EObject ruleTerritoire() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_7=null;
        EObject lv_territoireElements_3_0 = null;

        EObject lv_territoireElements_4_0 = null;

        EObject lv_territoireElements_5_0 = null;

        EObject lv_territoireElements_6_0 = null;



        	enterRule();

        try {
            // InternalGame.g:170:2: ( (otherlv_0= 'territoire' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_territoireElements_3_0= ruleExplorateur ) ) ( (lv_territoireElements_4_0= ruleLieuDebut ) ) ( (lv_territoireElements_5_0= ruleLieuFin ) )+ ( (lv_territoireElements_6_0= ruleLieu ) )* otherlv_7= '}' ) )
            // InternalGame.g:171:2: (otherlv_0= 'territoire' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_territoireElements_3_0= ruleExplorateur ) ) ( (lv_territoireElements_4_0= ruleLieuDebut ) ) ( (lv_territoireElements_5_0= ruleLieuFin ) )+ ( (lv_territoireElements_6_0= ruleLieu ) )* otherlv_7= '}' )
            {
            // InternalGame.g:171:2: (otherlv_0= 'territoire' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_territoireElements_3_0= ruleExplorateur ) ) ( (lv_territoireElements_4_0= ruleLieuDebut ) ) ( (lv_territoireElements_5_0= ruleLieuFin ) )+ ( (lv_territoireElements_6_0= ruleLieu ) )* otherlv_7= '}' )
            // InternalGame.g:172:3: otherlv_0= 'territoire' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_territoireElements_3_0= ruleExplorateur ) ) ( (lv_territoireElements_4_0= ruleLieuDebut ) ) ( (lv_territoireElements_5_0= ruleLieuFin ) )+ ( (lv_territoireElements_6_0= ruleLieu ) )* otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getTerritoireAccess().getTerritoireKeyword_0());
            		
            // InternalGame.g:176:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalGame.g:177:4: (lv_name_1_0= RULE_ID )
            {
            // InternalGame.g:177:4: (lv_name_1_0= RULE_ID )
            // InternalGame.g:178:5: lv_name_1_0= RULE_ID
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

            otherlv_2=(Token)match(input,12,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getTerritoireAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalGame.g:198:3: ( (lv_territoireElements_3_0= ruleExplorateur ) )
            // InternalGame.g:199:4: (lv_territoireElements_3_0= ruleExplorateur )
            {
            // InternalGame.g:199:4: (lv_territoireElements_3_0= ruleExplorateur )
            // InternalGame.g:200:5: lv_territoireElements_3_0= ruleExplorateur
            {

            					newCompositeNode(grammarAccess.getTerritoireAccess().getTerritoireElementsExplorateurParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_8);
            lv_territoireElements_3_0=ruleExplorateur();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTerritoireRule());
            					}
            					add(
            						current,
            						"territoireElements",
            						lv_territoireElements_3_0,
            						"fr.n7.Game.Explorateur");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalGame.g:217:3: ( (lv_territoireElements_4_0= ruleLieuDebut ) )
            // InternalGame.g:218:4: (lv_territoireElements_4_0= ruleLieuDebut )
            {
            // InternalGame.g:218:4: (lv_territoireElements_4_0= ruleLieuDebut )
            // InternalGame.g:219:5: lv_territoireElements_4_0= ruleLieuDebut
            {

            					newCompositeNode(grammarAccess.getTerritoireAccess().getTerritoireElementsLieuDebutParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_9);
            lv_territoireElements_4_0=ruleLieuDebut();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTerritoireRule());
            					}
            					add(
            						current,
            						"territoireElements",
            						lv_territoireElements_4_0,
            						"fr.n7.Game.LieuDebut");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalGame.g:236:3: ( (lv_territoireElements_5_0= ruleLieuFin ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==19) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalGame.g:237:4: (lv_territoireElements_5_0= ruleLieuFin )
            	    {
            	    // InternalGame.g:237:4: (lv_territoireElements_5_0= ruleLieuFin )
            	    // InternalGame.g:238:5: lv_territoireElements_5_0= ruleLieuFin
            	    {

            	    					newCompositeNode(grammarAccess.getTerritoireAccess().getTerritoireElementsLieuFinParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_10);
            	    lv_territoireElements_5_0=ruleLieuFin();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getTerritoireRule());
            	    					}
            	    					add(
            	    						current,
            	    						"territoireElements",
            	    						lv_territoireElements_5_0,
            	    						"fr.n7.Game.LieuFin");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);

            // InternalGame.g:255:3: ( (lv_territoireElements_6_0= ruleLieu ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==17) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalGame.g:256:4: (lv_territoireElements_6_0= ruleLieu )
            	    {
            	    // InternalGame.g:256:4: (lv_territoireElements_6_0= ruleLieu )
            	    // InternalGame.g:257:5: lv_territoireElements_6_0= ruleLieu
            	    {

            	    					newCompositeNode(grammarAccess.getTerritoireAccess().getTerritoireElementsLieuParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_11);
            	    lv_territoireElements_6_0=ruleLieu();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getTerritoireRule());
            	    					}
            	    					add(
            	    						current,
            	    						"territoireElements",
            	    						lv_territoireElements_6_0,
            	    						"fr.n7.Game.Lieu");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_7=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getTerritoireAccess().getRightCurlyBracketKeyword_7());
            		

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


    // $ANTLR start "entryRuleExplorateur"
    // InternalGame.g:282:1: entryRuleExplorateur returns [EObject current=null] : iv_ruleExplorateur= ruleExplorateur EOF ;
    public final EObject entryRuleExplorateur() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExplorateur = null;


        try {
            // InternalGame.g:282:52: (iv_ruleExplorateur= ruleExplorateur EOF )
            // InternalGame.g:283:2: iv_ruleExplorateur= ruleExplorateur EOF
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
    // InternalGame.g:289:1: ruleExplorateur returns [EObject current=null] : (otherlv_0= 'explorateur' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_explorateurElements_3_0= ruleSac ) ) ( (lv_explorateurElements_4_0= ruleConnaissances ) )? ( (lv_explorateurElements_5_0= ruleLieu ) )? otherlv_6= '}' ) ;
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
            // InternalGame.g:295:2: ( (otherlv_0= 'explorateur' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_explorateurElements_3_0= ruleSac ) ) ( (lv_explorateurElements_4_0= ruleConnaissances ) )? ( (lv_explorateurElements_5_0= ruleLieu ) )? otherlv_6= '}' ) )
            // InternalGame.g:296:2: (otherlv_0= 'explorateur' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_explorateurElements_3_0= ruleSac ) ) ( (lv_explorateurElements_4_0= ruleConnaissances ) )? ( (lv_explorateurElements_5_0= ruleLieu ) )? otherlv_6= '}' )
            {
            // InternalGame.g:296:2: (otherlv_0= 'explorateur' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_explorateurElements_3_0= ruleSac ) ) ( (lv_explorateurElements_4_0= ruleConnaissances ) )? ( (lv_explorateurElements_5_0= ruleLieu ) )? otherlv_6= '}' )
            // InternalGame.g:297:3: otherlv_0= 'explorateur' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_explorateurElements_3_0= ruleSac ) ) ( (lv_explorateurElements_4_0= ruleConnaissances ) )? ( (lv_explorateurElements_5_0= ruleLieu ) )? otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getExplorateurAccess().getExplorateurKeyword_0());
            		
            // InternalGame.g:301:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalGame.g:302:4: (lv_name_1_0= RULE_ID )
            {
            // InternalGame.g:302:4: (lv_name_1_0= RULE_ID )
            // InternalGame.g:303:5: lv_name_1_0= RULE_ID
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

            otherlv_2=(Token)match(input,12,FOLLOW_12); 

            			newLeafNode(otherlv_2, grammarAccess.getExplorateurAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalGame.g:323:3: ( (lv_explorateurElements_3_0= ruleSac ) )
            // InternalGame.g:324:4: (lv_explorateurElements_3_0= ruleSac )
            {
            // InternalGame.g:324:4: (lv_explorateurElements_3_0= ruleSac )
            // InternalGame.g:325:5: lv_explorateurElements_3_0= ruleSac
            {

            					newCompositeNode(grammarAccess.getExplorateurAccess().getExplorateurElementsSacParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_13);
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

            // InternalGame.g:342:3: ( (lv_explorateurElements_4_0= ruleConnaissances ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==29) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalGame.g:343:4: (lv_explorateurElements_4_0= ruleConnaissances )
                    {
                    // InternalGame.g:343:4: (lv_explorateurElements_4_0= ruleConnaissances )
                    // InternalGame.g:344:5: lv_explorateurElements_4_0= ruleConnaissances
                    {

                    					newCompositeNode(grammarAccess.getExplorateurAccess().getExplorateurElementsConnaissancesParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_11);
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
                    break;

            }

            // InternalGame.g:361:3: ( (lv_explorateurElements_5_0= ruleLieu ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==17) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalGame.g:362:4: (lv_explorateurElements_5_0= ruleLieu )
                    {
                    // InternalGame.g:362:4: (lv_explorateurElements_5_0= ruleLieu )
                    // InternalGame.g:363:5: lv_explorateurElements_5_0= ruleLieu
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
    // InternalGame.g:388:1: entryRuleSac returns [EObject current=null] : iv_ruleSac= ruleSac EOF ;
    public final EObject entryRuleSac() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSac = null;


        try {
            // InternalGame.g:388:44: (iv_ruleSac= ruleSac EOF )
            // InternalGame.g:389:2: iv_ruleSac= ruleSac EOF
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
    // InternalGame.g:395:1: ruleSac returns [EObject current=null] : (otherlv_0= 'sac' ( (lv_taille_1_0= RULE_INT ) ) otherlv_2= '{' ( (lv_sacElements_3_0= ruleObjet ) )* otherlv_4= '}' ) ;
    public final EObject ruleSac() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_taille_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_sacElements_3_0 = null;



        	enterRule();

        try {
            // InternalGame.g:401:2: ( (otherlv_0= 'sac' ( (lv_taille_1_0= RULE_INT ) ) otherlv_2= '{' ( (lv_sacElements_3_0= ruleObjet ) )* otherlv_4= '}' ) )
            // InternalGame.g:402:2: (otherlv_0= 'sac' ( (lv_taille_1_0= RULE_INT ) ) otherlv_2= '{' ( (lv_sacElements_3_0= ruleObjet ) )* otherlv_4= '}' )
            {
            // InternalGame.g:402:2: (otherlv_0= 'sac' ( (lv_taille_1_0= RULE_INT ) ) otherlv_2= '{' ( (lv_sacElements_3_0= ruleObjet ) )* otherlv_4= '}' )
            // InternalGame.g:403:3: otherlv_0= 'sac' ( (lv_taille_1_0= RULE_INT ) ) otherlv_2= '{' ( (lv_sacElements_3_0= ruleObjet ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_14); 

            			newLeafNode(otherlv_0, grammarAccess.getSacAccess().getSacKeyword_0());
            		
            // InternalGame.g:407:3: ( (lv_taille_1_0= RULE_INT ) )
            // InternalGame.g:408:4: (lv_taille_1_0= RULE_INT )
            {
            // InternalGame.g:408:4: (lv_taille_1_0= RULE_INT )
            // InternalGame.g:409:5: lv_taille_1_0= RULE_INT
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

            otherlv_2=(Token)match(input,12,FOLLOW_15); 

            			newLeafNode(otherlv_2, grammarAccess.getSacAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalGame.g:429:3: ( (lv_sacElements_3_0= ruleObjet ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==27) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalGame.g:430:4: (lv_sacElements_3_0= ruleObjet )
            	    {
            	    // InternalGame.g:430:4: (lv_sacElements_3_0= ruleObjet )
            	    // InternalGame.g:431:5: lv_sacElements_3_0= ruleObjet
            	    {

            	    					newCompositeNode(grammarAccess.getSacAccess().getSacElementsObjetParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_15);
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
            	    break loop5;
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


    // $ANTLR start "entryRuleLieu"
    // InternalGame.g:456:1: entryRuleLieu returns [EObject current=null] : iv_ruleLieu= ruleLieu EOF ;
    public final EObject entryRuleLieu() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLieu = null;


        try {
            // InternalGame.g:456:45: (iv_ruleLieu= ruleLieu EOF )
            // InternalGame.g:457:2: iv_ruleLieu= ruleLieu EOF
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
    // InternalGame.g:463:1: ruleLieu returns [EObject current=null] : (otherlv_0= 'lieu' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_lieuElements_3_0= rulePersonnes ) )? ( (lv_lieuElements_4_0= ruleConnaissances ) )? ( (lv_lieuElements_5_0= ruleObjets ) )? otherlv_6= '}' ) ;
    public final EObject ruleLieu() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_6=null;
        EObject lv_lieuElements_3_0 = null;

        EObject lv_lieuElements_4_0 = null;

        EObject lv_lieuElements_5_0 = null;



        	enterRule();

        try {
            // InternalGame.g:469:2: ( (otherlv_0= 'lieu' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_lieuElements_3_0= rulePersonnes ) )? ( (lv_lieuElements_4_0= ruleConnaissances ) )? ( (lv_lieuElements_5_0= ruleObjets ) )? otherlv_6= '}' ) )
            // InternalGame.g:470:2: (otherlv_0= 'lieu' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_lieuElements_3_0= rulePersonnes ) )? ( (lv_lieuElements_4_0= ruleConnaissances ) )? ( (lv_lieuElements_5_0= ruleObjets ) )? otherlv_6= '}' )
            {
            // InternalGame.g:470:2: (otherlv_0= 'lieu' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_lieuElements_3_0= rulePersonnes ) )? ( (lv_lieuElements_4_0= ruleConnaissances ) )? ( (lv_lieuElements_5_0= ruleObjets ) )? otherlv_6= '}' )
            // InternalGame.g:471:3: otherlv_0= 'lieu' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_lieuElements_3_0= rulePersonnes ) )? ( (lv_lieuElements_4_0= ruleConnaissances ) )? ( (lv_lieuElements_5_0= ruleObjets ) )? otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getLieuAccess().getLieuKeyword_0());
            		
            // InternalGame.g:475:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalGame.g:476:4: (lv_name_1_0= RULE_ID )
            {
            // InternalGame.g:476:4: (lv_name_1_0= RULE_ID )
            // InternalGame.g:477:5: lv_name_1_0= RULE_ID
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

            otherlv_2=(Token)match(input,12,FOLLOW_16); 

            			newLeafNode(otherlv_2, grammarAccess.getLieuAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalGame.g:497:3: ( (lv_lieuElements_3_0= rulePersonnes ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==20) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalGame.g:498:4: (lv_lieuElements_3_0= rulePersonnes )
                    {
                    // InternalGame.g:498:4: (lv_lieuElements_3_0= rulePersonnes )
                    // InternalGame.g:499:5: lv_lieuElements_3_0= rulePersonnes
                    {

                    					newCompositeNode(grammarAccess.getLieuAccess().getLieuElementsPersonnesParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_17);
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
                    break;

            }

            // InternalGame.g:516:3: ( (lv_lieuElements_4_0= ruleConnaissances ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==29) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalGame.g:517:4: (lv_lieuElements_4_0= ruleConnaissances )
                    {
                    // InternalGame.g:517:4: (lv_lieuElements_4_0= ruleConnaissances )
                    // InternalGame.g:518:5: lv_lieuElements_4_0= ruleConnaissances
                    {

                    					newCompositeNode(grammarAccess.getLieuAccess().getLieuElementsConnaissancesParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_18);
                    lv_lieuElements_4_0=ruleConnaissances();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getLieuRule());
                    					}
                    					add(
                    						current,
                    						"lieuElements",
                    						lv_lieuElements_4_0,
                    						"fr.n7.Game.Connaissances");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalGame.g:535:3: ( (lv_lieuElements_5_0= ruleObjets ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==28) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalGame.g:536:4: (lv_lieuElements_5_0= ruleObjets )
                    {
                    // InternalGame.g:536:4: (lv_lieuElements_5_0= ruleObjets )
                    // InternalGame.g:537:5: lv_lieuElements_5_0= ruleObjets
                    {

                    					newCompositeNode(grammarAccess.getLieuAccess().getLieuElementsObjetsParserRuleCall_5_0());
                    				
                    pushFollow(FOLLOW_6);
                    lv_lieuElements_5_0=ruleObjets();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getLieuRule());
                    					}
                    					add(
                    						current,
                    						"lieuElements",
                    						lv_lieuElements_5_0,
                    						"fr.n7.Game.Objets");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getLieuAccess().getRightCurlyBracketKeyword_6());
            		

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


    // $ANTLR start "entryRuleLieuDebut"
    // InternalGame.g:562:1: entryRuleLieuDebut returns [EObject current=null] : iv_ruleLieuDebut= ruleLieuDebut EOF ;
    public final EObject entryRuleLieuDebut() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLieuDebut = null;


        try {
            // InternalGame.g:562:50: (iv_ruleLieuDebut= ruleLieuDebut EOF )
            // InternalGame.g:563:2: iv_ruleLieuDebut= ruleLieuDebut EOF
            {
             newCompositeNode(grammarAccess.getLieuDebutRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLieuDebut=ruleLieuDebut();

            state._fsp--;

             current =iv_ruleLieuDebut; 
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
    // $ANTLR end "entryRuleLieuDebut"


    // $ANTLR start "ruleLieuDebut"
    // InternalGame.g:569:1: ruleLieuDebut returns [EObject current=null] : (otherlv_0= 'lieudebut' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_lieudebutElements_3_0= rulePersonnes ) )? otherlv_4= '}' ) ;
    public final EObject ruleLieuDebut() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_lieudebutElements_3_0 = null;



        	enterRule();

        try {
            // InternalGame.g:575:2: ( (otherlv_0= 'lieudebut' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_lieudebutElements_3_0= rulePersonnes ) )? otherlv_4= '}' ) )
            // InternalGame.g:576:2: (otherlv_0= 'lieudebut' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_lieudebutElements_3_0= rulePersonnes ) )? otherlv_4= '}' )
            {
            // InternalGame.g:576:2: (otherlv_0= 'lieudebut' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_lieudebutElements_3_0= rulePersonnes ) )? otherlv_4= '}' )
            // InternalGame.g:577:3: otherlv_0= 'lieudebut' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_lieudebutElements_3_0= rulePersonnes ) )? otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getLieuDebutAccess().getLieudebutKeyword_0());
            		
            // InternalGame.g:581:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalGame.g:582:4: (lv_name_1_0= RULE_ID )
            {
            // InternalGame.g:582:4: (lv_name_1_0= RULE_ID )
            // InternalGame.g:583:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getLieuDebutAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLieuDebutRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_19); 

            			newLeafNode(otherlv_2, grammarAccess.getLieuDebutAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalGame.g:603:3: ( (lv_lieudebutElements_3_0= rulePersonnes ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==20) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalGame.g:604:4: (lv_lieudebutElements_3_0= rulePersonnes )
                    {
                    // InternalGame.g:604:4: (lv_lieudebutElements_3_0= rulePersonnes )
                    // InternalGame.g:605:5: lv_lieudebutElements_3_0= rulePersonnes
                    {

                    					newCompositeNode(grammarAccess.getLieuDebutAccess().getLieudebutElementsPersonnesParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_6);
                    lv_lieudebutElements_3_0=rulePersonnes();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getLieuDebutRule());
                    					}
                    					add(
                    						current,
                    						"lieudebutElements",
                    						lv_lieudebutElements_3_0,
                    						"fr.n7.Game.Personnes");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getLieuDebutAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleLieuDebut"


    // $ANTLR start "entryRuleLieuFin"
    // InternalGame.g:630:1: entryRuleLieuFin returns [EObject current=null] : iv_ruleLieuFin= ruleLieuFin EOF ;
    public final EObject entryRuleLieuFin() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLieuFin = null;


        try {
            // InternalGame.g:630:48: (iv_ruleLieuFin= ruleLieuFin EOF )
            // InternalGame.g:631:2: iv_ruleLieuFin= ruleLieuFin EOF
            {
             newCompositeNode(grammarAccess.getLieuFinRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLieuFin=ruleLieuFin();

            state._fsp--;

             current =iv_ruleLieuFin; 
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
    // $ANTLR end "entryRuleLieuFin"


    // $ANTLR start "ruleLieuFin"
    // InternalGame.g:637:1: ruleLieuFin returns [EObject current=null] : (otherlv_0= 'lieufin' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_lieudebutElements_3_0= rulePersonnes ) )? otherlv_4= '}' ) ;
    public final EObject ruleLieuFin() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_lieudebutElements_3_0 = null;



        	enterRule();

        try {
            // InternalGame.g:643:2: ( (otherlv_0= 'lieufin' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_lieudebutElements_3_0= rulePersonnes ) )? otherlv_4= '}' ) )
            // InternalGame.g:644:2: (otherlv_0= 'lieufin' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_lieudebutElements_3_0= rulePersonnes ) )? otherlv_4= '}' )
            {
            // InternalGame.g:644:2: (otherlv_0= 'lieufin' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_lieudebutElements_3_0= rulePersonnes ) )? otherlv_4= '}' )
            // InternalGame.g:645:3: otherlv_0= 'lieufin' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_lieudebutElements_3_0= rulePersonnes ) )? otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getLieuFinAccess().getLieufinKeyword_0());
            		
            // InternalGame.g:649:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalGame.g:650:4: (lv_name_1_0= RULE_ID )
            {
            // InternalGame.g:650:4: (lv_name_1_0= RULE_ID )
            // InternalGame.g:651:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getLieuFinAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLieuFinRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_19); 

            			newLeafNode(otherlv_2, grammarAccess.getLieuFinAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalGame.g:671:3: ( (lv_lieudebutElements_3_0= rulePersonnes ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==20) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalGame.g:672:4: (lv_lieudebutElements_3_0= rulePersonnes )
                    {
                    // InternalGame.g:672:4: (lv_lieudebutElements_3_0= rulePersonnes )
                    // InternalGame.g:673:5: lv_lieudebutElements_3_0= rulePersonnes
                    {

                    					newCompositeNode(grammarAccess.getLieuFinAccess().getLieudebutElementsPersonnesParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_6);
                    lv_lieudebutElements_3_0=rulePersonnes();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getLieuFinRule());
                    					}
                    					add(
                    						current,
                    						"lieudebutElements",
                    						lv_lieudebutElements_3_0,
                    						"fr.n7.Game.Personnes");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getLieuFinAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleLieuFin"


    // $ANTLR start "entryRulePersonnes"
    // InternalGame.g:698:1: entryRulePersonnes returns [EObject current=null] : iv_rulePersonnes= rulePersonnes EOF ;
    public final EObject entryRulePersonnes() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePersonnes = null;


        try {
            // InternalGame.g:698:50: (iv_rulePersonnes= rulePersonnes EOF )
            // InternalGame.g:699:2: iv_rulePersonnes= rulePersonnes EOF
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
    // InternalGame.g:705:1: rulePersonnes returns [EObject current=null] : (otherlv_0= 'personnes' otherlv_1= '{' ( (lv_listePersonne_2_0= rulePersonne ) )* otherlv_3= '}' ) ;
    public final EObject rulePersonnes() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_listePersonne_2_0 = null;



        	enterRule();

        try {
            // InternalGame.g:711:2: ( (otherlv_0= 'personnes' otherlv_1= '{' ( (lv_listePersonne_2_0= rulePersonne ) )* otherlv_3= '}' ) )
            // InternalGame.g:712:2: (otherlv_0= 'personnes' otherlv_1= '{' ( (lv_listePersonne_2_0= rulePersonne ) )* otherlv_3= '}' )
            {
            // InternalGame.g:712:2: (otherlv_0= 'personnes' otherlv_1= '{' ( (lv_listePersonne_2_0= rulePersonne ) )* otherlv_3= '}' )
            // InternalGame.g:713:3: otherlv_0= 'personnes' otherlv_1= '{' ( (lv_listePersonne_2_0= rulePersonne ) )* otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getPersonnesAccess().getPersonnesKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_20); 

            			newLeafNode(otherlv_1, grammarAccess.getPersonnesAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalGame.g:721:3: ( (lv_listePersonne_2_0= rulePersonne ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==21) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalGame.g:722:4: (lv_listePersonne_2_0= rulePersonne )
            	    {
            	    // InternalGame.g:722:4: (lv_listePersonne_2_0= rulePersonne )
            	    // InternalGame.g:723:5: lv_listePersonne_2_0= rulePersonne
            	    {

            	    					newCompositeNode(grammarAccess.getPersonnesAccess().getListePersonnePersonneParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_20);
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
            	    break loop11;
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
    // InternalGame.g:748:1: entryRulePersonne returns [EObject current=null] : iv_rulePersonne= rulePersonne EOF ;
    public final EObject entryRulePersonne() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePersonne = null;


        try {
            // InternalGame.g:748:49: (iv_rulePersonne= rulePersonne EOF )
            // InternalGame.g:749:2: iv_rulePersonne= rulePersonne EOF
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
    // InternalGame.g:755:1: rulePersonne returns [EObject current=null] : (otherlv_0= 'personne' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'visible' otherlv_4= 'obligatoire' ( (lv_personneElements_5_0= ruleInteraction ) ) otherlv_6= '}' ) ;
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
            // InternalGame.g:761:2: ( (otherlv_0= 'personne' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'visible' otherlv_4= 'obligatoire' ( (lv_personneElements_5_0= ruleInteraction ) ) otherlv_6= '}' ) )
            // InternalGame.g:762:2: (otherlv_0= 'personne' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'visible' otherlv_4= 'obligatoire' ( (lv_personneElements_5_0= ruleInteraction ) ) otherlv_6= '}' )
            {
            // InternalGame.g:762:2: (otherlv_0= 'personne' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'visible' otherlv_4= 'obligatoire' ( (lv_personneElements_5_0= ruleInteraction ) ) otherlv_6= '}' )
            // InternalGame.g:763:3: otherlv_0= 'personne' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'visible' otherlv_4= 'obligatoire' ( (lv_personneElements_5_0= ruleInteraction ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getPersonneAccess().getPersonneKeyword_0());
            		
            // InternalGame.g:767:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalGame.g:768:4: (lv_name_1_0= RULE_ID )
            {
            // InternalGame.g:768:4: (lv_name_1_0= RULE_ID )
            // InternalGame.g:769:5: lv_name_1_0= RULE_ID
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

            otherlv_2=(Token)match(input,12,FOLLOW_21); 

            			newLeafNode(otherlv_2, grammarAccess.getPersonneAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,22,FOLLOW_22); 

            			newLeafNode(otherlv_3, grammarAccess.getPersonneAccess().getVisibleKeyword_3());
            		
            otherlv_4=(Token)match(input,23,FOLLOW_23); 

            			newLeafNode(otherlv_4, grammarAccess.getPersonneAccess().getObligatoireKeyword_4());
            		
            // InternalGame.g:797:3: ( (lv_personneElements_5_0= ruleInteraction ) )
            // InternalGame.g:798:4: (lv_personneElements_5_0= ruleInteraction )
            {
            // InternalGame.g:798:4: (lv_personneElements_5_0= ruleInteraction )
            // InternalGame.g:799:5: lv_personneElements_5_0= ruleInteraction
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
    // InternalGame.g:824:1: entryRuleInteraction returns [EObject current=null] : iv_ruleInteraction= ruleInteraction EOF ;
    public final EObject entryRuleInteraction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInteraction = null;


        try {
            // InternalGame.g:824:52: (iv_ruleInteraction= ruleInteraction EOF )
            // InternalGame.g:825:2: iv_ruleInteraction= ruleInteraction EOF
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
    // InternalGame.g:831:1: ruleInteraction returns [EObject current=null] : (otherlv_0= 'interaction' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'texte' ( (lv_interactionElements_4_0= ruleChoix ) )* otherlv_5= '}' ) ;
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
            // InternalGame.g:837:2: ( (otherlv_0= 'interaction' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'texte' ( (lv_interactionElements_4_0= ruleChoix ) )* otherlv_5= '}' ) )
            // InternalGame.g:838:2: (otherlv_0= 'interaction' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'texte' ( (lv_interactionElements_4_0= ruleChoix ) )* otherlv_5= '}' )
            {
            // InternalGame.g:838:2: (otherlv_0= 'interaction' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'texte' ( (lv_interactionElements_4_0= ruleChoix ) )* otherlv_5= '}' )
            // InternalGame.g:839:3: otherlv_0= 'interaction' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'texte' ( (lv_interactionElements_4_0= ruleChoix ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getInteractionAccess().getInteractionKeyword_0());
            		
            // InternalGame.g:843:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalGame.g:844:4: (lv_name_1_0= RULE_ID )
            {
            // InternalGame.g:844:4: (lv_name_1_0= RULE_ID )
            // InternalGame.g:845:5: lv_name_1_0= RULE_ID
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

            otherlv_2=(Token)match(input,12,FOLLOW_24); 

            			newLeafNode(otherlv_2, grammarAccess.getInteractionAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,25,FOLLOW_25); 

            			newLeafNode(otherlv_3, grammarAccess.getInteractionAccess().getTexteKeyword_3());
            		
            // InternalGame.g:869:3: ( (lv_interactionElements_4_0= ruleChoix ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==26) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalGame.g:870:4: (lv_interactionElements_4_0= ruleChoix )
            	    {
            	    // InternalGame.g:870:4: (lv_interactionElements_4_0= ruleChoix )
            	    // InternalGame.g:871:5: lv_interactionElements_4_0= ruleChoix
            	    {

            	    					newCompositeNode(grammarAccess.getInteractionAccess().getInteractionElementsChoixParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_25);
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
            	    break loop12;
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
    // InternalGame.g:896:1: entryRuleChoix returns [EObject current=null] : iv_ruleChoix= ruleChoix EOF ;
    public final EObject entryRuleChoix() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChoix = null;


        try {
            // InternalGame.g:896:46: (iv_ruleChoix= ruleChoix EOF )
            // InternalGame.g:897:2: iv_ruleChoix= ruleChoix EOF
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
    // InternalGame.g:903:1: ruleChoix returns [EObject current=null] : (otherlv_0= 'choix' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleChoix() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalGame.g:909:2: ( (otherlv_0= 'choix' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalGame.g:910:2: (otherlv_0= 'choix' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalGame.g:910:2: (otherlv_0= 'choix' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalGame.g:911:3: otherlv_0= 'choix' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,26,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getChoixAccess().getChoixKeyword_0());
            		
            // InternalGame.g:915:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalGame.g:916:4: (lv_name_1_0= RULE_ID )
            {
            // InternalGame.g:916:4: (lv_name_1_0= RULE_ID )
            // InternalGame.g:917:5: lv_name_1_0= RULE_ID
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
    // InternalGame.g:937:1: entryRuleObjet returns [EObject current=null] : iv_ruleObjet= ruleObjet EOF ;
    public final EObject entryRuleObjet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObjet = null;


        try {
            // InternalGame.g:937:46: (iv_ruleObjet= ruleObjet EOF )
            // InternalGame.g:938:2: iv_ruleObjet= ruleObjet EOF
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
    // InternalGame.g:944:1: ruleObjet returns [EObject current=null] : (otherlv_0= 'objet' ( (lv_name_1_0= RULE_ID ) ) ( (lv_taille_2_0= RULE_INT ) ) ( (lv_quantite_3_0= RULE_INT ) ) ) ;
    public final EObject ruleObjet() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_taille_2_0=null;
        Token lv_quantite_3_0=null;


        	enterRule();

        try {
            // InternalGame.g:950:2: ( (otherlv_0= 'objet' ( (lv_name_1_0= RULE_ID ) ) ( (lv_taille_2_0= RULE_INT ) ) ( (lv_quantite_3_0= RULE_INT ) ) ) )
            // InternalGame.g:951:2: (otherlv_0= 'objet' ( (lv_name_1_0= RULE_ID ) ) ( (lv_taille_2_0= RULE_INT ) ) ( (lv_quantite_3_0= RULE_INT ) ) )
            {
            // InternalGame.g:951:2: (otherlv_0= 'objet' ( (lv_name_1_0= RULE_ID ) ) ( (lv_taille_2_0= RULE_INT ) ) ( (lv_quantite_3_0= RULE_INT ) ) )
            // InternalGame.g:952:3: otherlv_0= 'objet' ( (lv_name_1_0= RULE_ID ) ) ( (lv_taille_2_0= RULE_INT ) ) ( (lv_quantite_3_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,27,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getObjetAccess().getObjetKeyword_0());
            		
            // InternalGame.g:956:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalGame.g:957:4: (lv_name_1_0= RULE_ID )
            {
            // InternalGame.g:957:4: (lv_name_1_0= RULE_ID )
            // InternalGame.g:958:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_14); 

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

            // InternalGame.g:974:3: ( (lv_taille_2_0= RULE_INT ) )
            // InternalGame.g:975:4: (lv_taille_2_0= RULE_INT )
            {
            // InternalGame.g:975:4: (lv_taille_2_0= RULE_INT )
            // InternalGame.g:976:5: lv_taille_2_0= RULE_INT
            {
            lv_taille_2_0=(Token)match(input,RULE_INT,FOLLOW_14); 

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

            // InternalGame.g:992:3: ( (lv_quantite_3_0= RULE_INT ) )
            // InternalGame.g:993:4: (lv_quantite_3_0= RULE_INT )
            {
            // InternalGame.g:993:4: (lv_quantite_3_0= RULE_INT )
            // InternalGame.g:994:5: lv_quantite_3_0= RULE_INT
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


    // $ANTLR start "entryRuleObjets"
    // InternalGame.g:1014:1: entryRuleObjets returns [EObject current=null] : iv_ruleObjets= ruleObjets EOF ;
    public final EObject entryRuleObjets() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObjets = null;


        try {
            // InternalGame.g:1014:47: (iv_ruleObjets= ruleObjets EOF )
            // InternalGame.g:1015:2: iv_ruleObjets= ruleObjets EOF
            {
             newCompositeNode(grammarAccess.getObjetsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleObjets=ruleObjets();

            state._fsp--;

             current =iv_ruleObjets; 
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
    // $ANTLR end "entryRuleObjets"


    // $ANTLR start "ruleObjets"
    // InternalGame.g:1021:1: ruleObjets returns [EObject current=null] : (otherlv_0= 'objets' otherlv_1= '{' ( (lv_listeObjets_2_0= ruleObjet ) )* otherlv_3= '}' ) ;
    public final EObject ruleObjets() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_listeObjets_2_0 = null;



        	enterRule();

        try {
            // InternalGame.g:1027:2: ( (otherlv_0= 'objets' otherlv_1= '{' ( (lv_listeObjets_2_0= ruleObjet ) )* otherlv_3= '}' ) )
            // InternalGame.g:1028:2: (otherlv_0= 'objets' otherlv_1= '{' ( (lv_listeObjets_2_0= ruleObjet ) )* otherlv_3= '}' )
            {
            // InternalGame.g:1028:2: (otherlv_0= 'objets' otherlv_1= '{' ( (lv_listeObjets_2_0= ruleObjet ) )* otherlv_3= '}' )
            // InternalGame.g:1029:3: otherlv_0= 'objets' otherlv_1= '{' ( (lv_listeObjets_2_0= ruleObjet ) )* otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,28,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getObjetsAccess().getObjetsKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_15); 

            			newLeafNode(otherlv_1, grammarAccess.getObjetsAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalGame.g:1037:3: ( (lv_listeObjets_2_0= ruleObjet ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==27) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalGame.g:1038:4: (lv_listeObjets_2_0= ruleObjet )
            	    {
            	    // InternalGame.g:1038:4: (lv_listeObjets_2_0= ruleObjet )
            	    // InternalGame.g:1039:5: lv_listeObjets_2_0= ruleObjet
            	    {

            	    					newCompositeNode(grammarAccess.getObjetsAccess().getListeObjetsObjetParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_15);
            	    lv_listeObjets_2_0=ruleObjet();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getObjetsRule());
            	    					}
            	    					add(
            	    						current,
            	    						"listeObjets",
            	    						lv_listeObjets_2_0,
            	    						"fr.n7.Game.Objet");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            otherlv_3=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getObjetsAccess().getRightCurlyBracketKeyword_3());
            		

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
    // $ANTLR end "ruleObjets"


    // $ANTLR start "entryRuleConnaissances"
    // InternalGame.g:1064:1: entryRuleConnaissances returns [EObject current=null] : iv_ruleConnaissances= ruleConnaissances EOF ;
    public final EObject entryRuleConnaissances() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConnaissances = null;


        try {
            // InternalGame.g:1064:54: (iv_ruleConnaissances= ruleConnaissances EOF )
            // InternalGame.g:1065:2: iv_ruleConnaissances= ruleConnaissances EOF
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
    // InternalGame.g:1071:1: ruleConnaissances returns [EObject current=null] : (otherlv_0= 'connaissances' otherlv_1= '{' ( (lv_listeConnaissance_2_0= ruleConnaissance ) )* otherlv_3= '}' ) ;
    public final EObject ruleConnaissances() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_listeConnaissance_2_0 = null;



        	enterRule();

        try {
            // InternalGame.g:1077:2: ( (otherlv_0= 'connaissances' otherlv_1= '{' ( (lv_listeConnaissance_2_0= ruleConnaissance ) )* otherlv_3= '}' ) )
            // InternalGame.g:1078:2: (otherlv_0= 'connaissances' otherlv_1= '{' ( (lv_listeConnaissance_2_0= ruleConnaissance ) )* otherlv_3= '}' )
            {
            // InternalGame.g:1078:2: (otherlv_0= 'connaissances' otherlv_1= '{' ( (lv_listeConnaissance_2_0= ruleConnaissance ) )* otherlv_3= '}' )
            // InternalGame.g:1079:3: otherlv_0= 'connaissances' otherlv_1= '{' ( (lv_listeConnaissance_2_0= ruleConnaissance ) )* otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,29,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getConnaissancesAccess().getConnaissancesKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_26); 

            			newLeafNode(otherlv_1, grammarAccess.getConnaissancesAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalGame.g:1087:3: ( (lv_listeConnaissance_2_0= ruleConnaissance ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==30) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalGame.g:1088:4: (lv_listeConnaissance_2_0= ruleConnaissance )
            	    {
            	    // InternalGame.g:1088:4: (lv_listeConnaissance_2_0= ruleConnaissance )
            	    // InternalGame.g:1089:5: lv_listeConnaissance_2_0= ruleConnaissance
            	    {

            	    					newCompositeNode(grammarAccess.getConnaissancesAccess().getListeConnaissanceConnaissanceParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_26);
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
            	    break loop14;
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
    // InternalGame.g:1114:1: entryRuleConnaissance returns [EObject current=null] : iv_ruleConnaissance= ruleConnaissance EOF ;
    public final EObject entryRuleConnaissance() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConnaissance = null;


        try {
            // InternalGame.g:1114:53: (iv_ruleConnaissance= ruleConnaissance EOF )
            // InternalGame.g:1115:2: iv_ruleConnaissance= ruleConnaissance EOF
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
    // InternalGame.g:1121:1: ruleConnaissance returns [EObject current=null] : (otherlv_0= 'connaissance' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleConnaissance() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalGame.g:1127:2: ( (otherlv_0= 'connaissance' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalGame.g:1128:2: (otherlv_0= 'connaissance' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalGame.g:1128:2: (otherlv_0= 'connaissance' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalGame.g:1129:3: otherlv_0= 'connaissance' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,30,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getConnaissanceAccess().getConnaissanceKeyword_0());
            		
            // InternalGame.g:1133:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalGame.g:1134:4: (lv_name_1_0= RULE_ID )
            {
            // InternalGame.g:1134:4: (lv_name_1_0= RULE_ID )
            // InternalGame.g:1135:5: lv_name_1_0= RULE_ID
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
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000000000A2000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000022000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000020022000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000008002000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000030102000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000030002000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000010002000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000102000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000202000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000004002000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000040002000L});

}