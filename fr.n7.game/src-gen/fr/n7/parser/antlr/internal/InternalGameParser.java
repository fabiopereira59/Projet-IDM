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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_BOOL", "RULE_COND", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Game'", "'{'", "'}'", "'territoire'", "'explorateur'", "'sac'", "'lieu'", "'description'", "'depotO'", "'lieudebut'", "'lieufin'", "'personnes'", "'personne'", "'visible'", "'obligatoire'", "'interaction'", "'texte'", "'choix'", "'choixdebut'", "'choixfin'", "'action'", "'attributionC'", "'attributionO'", "'consommationO'", "'objet'", "'transmission'", "'consommation'", "'transformable'", "'objets'", "'connaissances'", "'connaissance'", "'condition'", "'chemin'", "'destination'", "'ouvert'"
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
            otherlv_0=(Token)match(input,13,FOLLOW_3); 

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

            otherlv_2=(Token)match(input,14,FOLLOW_5); 

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

            otherlv_4=(Token)match(input,15,FOLLOW_2); 

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
            otherlv_0=(Token)match(input,16,FOLLOW_3); 

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

            otherlv_2=(Token)match(input,14,FOLLOW_7); 

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

                if ( (LA1_0==23) ) {
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

                if ( (LA2_0==19) ) {
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

            otherlv_7=(Token)match(input,15,FOLLOW_2); 

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
            otherlv_0=(Token)match(input,17,FOLLOW_3); 

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

            otherlv_2=(Token)match(input,14,FOLLOW_12); 

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

            if ( (LA3_0==42) ) {
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

            if ( (LA4_0==19) ) {
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

            otherlv_6=(Token)match(input,15,FOLLOW_2); 

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
            otherlv_0=(Token)match(input,18,FOLLOW_14); 

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

            otherlv_2=(Token)match(input,14,FOLLOW_15); 

            			newLeafNode(otherlv_2, grammarAccess.getSacAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalGame.g:429:3: ( (lv_sacElements_3_0= ruleObjet ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==37) ) {
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

            otherlv_4=(Token)match(input,15,FOLLOW_2); 

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
    // InternalGame.g:463:1: ruleLieu returns [EObject current=null] : (otherlv_0= 'lieu' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) ) ( (lv_conditionDescription_5_0= ruleCondition ) )? )? ( (lv_lieuElements_6_0= rulePersonnes ) )? ( (lv_lieuElements_7_0= ruleConnaissances ) )? ( (lv_lieuElements_8_0= ruleObjets ) )? otherlv_9= 'depotO' ( (lv_depotObjet_10_0= ruleCondition ) )? ( (lv_listeChemins_11_0= ruleChemin ) )+ otherlv_12= '}' ) ;
    public final EObject ruleLieu() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_description_4_0=null;
        Token otherlv_9=null;
        Token otherlv_12=null;
        EObject lv_conditionDescription_5_0 = null;

        EObject lv_lieuElements_6_0 = null;

        EObject lv_lieuElements_7_0 = null;

        EObject lv_lieuElements_8_0 = null;

        EObject lv_depotObjet_10_0 = null;

        EObject lv_listeChemins_11_0 = null;



        	enterRule();

        try {
            // InternalGame.g:469:2: ( (otherlv_0= 'lieu' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) ) ( (lv_conditionDescription_5_0= ruleCondition ) )? )? ( (lv_lieuElements_6_0= rulePersonnes ) )? ( (lv_lieuElements_7_0= ruleConnaissances ) )? ( (lv_lieuElements_8_0= ruleObjets ) )? otherlv_9= 'depotO' ( (lv_depotObjet_10_0= ruleCondition ) )? ( (lv_listeChemins_11_0= ruleChemin ) )+ otherlv_12= '}' ) )
            // InternalGame.g:470:2: (otherlv_0= 'lieu' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) ) ( (lv_conditionDescription_5_0= ruleCondition ) )? )? ( (lv_lieuElements_6_0= rulePersonnes ) )? ( (lv_lieuElements_7_0= ruleConnaissances ) )? ( (lv_lieuElements_8_0= ruleObjets ) )? otherlv_9= 'depotO' ( (lv_depotObjet_10_0= ruleCondition ) )? ( (lv_listeChemins_11_0= ruleChemin ) )+ otherlv_12= '}' )
            {
            // InternalGame.g:470:2: (otherlv_0= 'lieu' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) ) ( (lv_conditionDescription_5_0= ruleCondition ) )? )? ( (lv_lieuElements_6_0= rulePersonnes ) )? ( (lv_lieuElements_7_0= ruleConnaissances ) )? ( (lv_lieuElements_8_0= ruleObjets ) )? otherlv_9= 'depotO' ( (lv_depotObjet_10_0= ruleCondition ) )? ( (lv_listeChemins_11_0= ruleChemin ) )+ otherlv_12= '}' )
            // InternalGame.g:471:3: otherlv_0= 'lieu' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) ) ( (lv_conditionDescription_5_0= ruleCondition ) )? )? ( (lv_lieuElements_6_0= rulePersonnes ) )? ( (lv_lieuElements_7_0= ruleConnaissances ) )? ( (lv_lieuElements_8_0= ruleObjets ) )? otherlv_9= 'depotO' ( (lv_depotObjet_10_0= ruleCondition ) )? ( (lv_listeChemins_11_0= ruleChemin ) )+ otherlv_12= '}'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_3); 

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

            otherlv_2=(Token)match(input,14,FOLLOW_16); 

            			newLeafNode(otherlv_2, grammarAccess.getLieuAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalGame.g:497:3: (otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) ) ( (lv_conditionDescription_5_0= ruleCondition ) )? )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==20) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalGame.g:498:4: otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) ) ( (lv_conditionDescription_5_0= ruleCondition ) )?
                    {
                    otherlv_3=(Token)match(input,20,FOLLOW_17); 

                    				newLeafNode(otherlv_3, grammarAccess.getLieuAccess().getDescriptionKeyword_3_0());
                    			
                    // InternalGame.g:502:4: ( (lv_description_4_0= RULE_STRING ) )
                    // InternalGame.g:503:5: (lv_description_4_0= RULE_STRING )
                    {
                    // InternalGame.g:503:5: (lv_description_4_0= RULE_STRING )
                    // InternalGame.g:504:6: lv_description_4_0= RULE_STRING
                    {
                    lv_description_4_0=(Token)match(input,RULE_STRING,FOLLOW_18); 

                    						newLeafNode(lv_description_4_0, grammarAccess.getLieuAccess().getDescriptionSTRINGTerminalRuleCall_3_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getLieuRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"description",
                    							lv_description_4_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }

                    // InternalGame.g:520:4: ( (lv_conditionDescription_5_0= ruleCondition ) )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0==44) ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // InternalGame.g:521:5: (lv_conditionDescription_5_0= ruleCondition )
                            {
                            // InternalGame.g:521:5: (lv_conditionDescription_5_0= ruleCondition )
                            // InternalGame.g:522:6: lv_conditionDescription_5_0= ruleCondition
                            {

                            						newCompositeNode(grammarAccess.getLieuAccess().getConditionDescriptionConditionParserRuleCall_3_2_0());
                            					
                            pushFollow(FOLLOW_19);
                            lv_conditionDescription_5_0=ruleCondition();

                            state._fsp--;


                            						if (current==null) {
                            							current = createModelElementForParent(grammarAccess.getLieuRule());
                            						}
                            						set(
                            							current,
                            							"conditionDescription",
                            							lv_conditionDescription_5_0,
                            							"fr.n7.Game.Condition");
                            						afterParserOrEnumRuleCall();
                            					

                            }


                            }
                            break;

                    }


                    }
                    break;

            }

            // InternalGame.g:540:3: ( (lv_lieuElements_6_0= rulePersonnes ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==24) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalGame.g:541:4: (lv_lieuElements_6_0= rulePersonnes )
                    {
                    // InternalGame.g:541:4: (lv_lieuElements_6_0= rulePersonnes )
                    // InternalGame.g:542:5: lv_lieuElements_6_0= rulePersonnes
                    {

                    					newCompositeNode(grammarAccess.getLieuAccess().getLieuElementsPersonnesParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_20);
                    lv_lieuElements_6_0=rulePersonnes();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getLieuRule());
                    					}
                    					add(
                    						current,
                    						"lieuElements",
                    						lv_lieuElements_6_0,
                    						"fr.n7.Game.Personnes");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalGame.g:559:3: ( (lv_lieuElements_7_0= ruleConnaissances ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==42) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalGame.g:560:4: (lv_lieuElements_7_0= ruleConnaissances )
                    {
                    // InternalGame.g:560:4: (lv_lieuElements_7_0= ruleConnaissances )
                    // InternalGame.g:561:5: lv_lieuElements_7_0= ruleConnaissances
                    {

                    					newCompositeNode(grammarAccess.getLieuAccess().getLieuElementsConnaissancesParserRuleCall_5_0());
                    				
                    pushFollow(FOLLOW_21);
                    lv_lieuElements_7_0=ruleConnaissances();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getLieuRule());
                    					}
                    					add(
                    						current,
                    						"lieuElements",
                    						lv_lieuElements_7_0,
                    						"fr.n7.Game.Connaissances");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalGame.g:578:3: ( (lv_lieuElements_8_0= ruleObjets ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==41) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalGame.g:579:4: (lv_lieuElements_8_0= ruleObjets )
                    {
                    // InternalGame.g:579:4: (lv_lieuElements_8_0= ruleObjets )
                    // InternalGame.g:580:5: lv_lieuElements_8_0= ruleObjets
                    {

                    					newCompositeNode(grammarAccess.getLieuAccess().getLieuElementsObjetsParserRuleCall_6_0());
                    				
                    pushFollow(FOLLOW_22);
                    lv_lieuElements_8_0=ruleObjets();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getLieuRule());
                    					}
                    					add(
                    						current,
                    						"lieuElements",
                    						lv_lieuElements_8_0,
                    						"fr.n7.Game.Objets");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_9=(Token)match(input,21,FOLLOW_23); 

            			newLeafNode(otherlv_9, grammarAccess.getLieuAccess().getDepotOKeyword_7());
            		
            // InternalGame.g:601:3: ( (lv_depotObjet_10_0= ruleCondition ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==44) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalGame.g:602:4: (lv_depotObjet_10_0= ruleCondition )
                    {
                    // InternalGame.g:602:4: (lv_depotObjet_10_0= ruleCondition )
                    // InternalGame.g:603:5: lv_depotObjet_10_0= ruleCondition
                    {

                    					newCompositeNode(grammarAccess.getLieuAccess().getDepotObjetConditionParserRuleCall_8_0());
                    				
                    pushFollow(FOLLOW_23);
                    lv_depotObjet_10_0=ruleCondition();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getLieuRule());
                    					}
                    					set(
                    						current,
                    						"depotObjet",
                    						lv_depotObjet_10_0,
                    						"fr.n7.Game.Condition");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalGame.g:620:3: ( (lv_listeChemins_11_0= ruleChemin ) )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>=22 && LA12_0<=23)||LA12_0==45) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalGame.g:621:4: (lv_listeChemins_11_0= ruleChemin )
            	    {
            	    // InternalGame.g:621:4: (lv_listeChemins_11_0= ruleChemin )
            	    // InternalGame.g:622:5: lv_listeChemins_11_0= ruleChemin
            	    {

            	    					newCompositeNode(grammarAccess.getLieuAccess().getListeCheminsCheminParserRuleCall_9_0());
            	    				
            	    pushFollow(FOLLOW_24);
            	    lv_listeChemins_11_0=ruleChemin();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getLieuRule());
            	    					}
            	    					add(
            	    						current,
            	    						"listeChemins",
            	    						lv_listeChemins_11_0,
            	    						"fr.n7.Game.Chemin");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt12 >= 1 ) break loop12;
                        EarlyExitException eee =
                            new EarlyExitException(12, input);
                        throw eee;
                }
                cnt12++;
            } while (true);

            otherlv_12=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_12, grammarAccess.getLieuAccess().getRightCurlyBracketKeyword_10());
            		

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
    // InternalGame.g:647:1: entryRuleLieuDebut returns [EObject current=null] : iv_ruleLieuDebut= ruleLieuDebut EOF ;
    public final EObject entryRuleLieuDebut() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLieuDebut = null;


        try {
            // InternalGame.g:647:50: (iv_ruleLieuDebut= ruleLieuDebut EOF )
            // InternalGame.g:648:2: iv_ruleLieuDebut= ruleLieuDebut EOF
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
    // InternalGame.g:654:1: ruleLieuDebut returns [EObject current=null] : (otherlv_0= 'lieudebut' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) ) ( (lv_conditionDescription_5_0= ruleCondition ) )? )? ( (lv_lieudebutElements_6_0= rulePersonnes ) )? ( (lv_lieudebutElements_7_0= ruleConnaissances ) )? ( (lv_lieudebutElements_8_0= ruleObjets ) )? otherlv_9= 'depotO' ( (lv_depotObjet_10_0= ruleCondition ) )? ( (lv_listeChemins_11_0= ruleChemin ) )+ otherlv_12= '}' ) ;
    public final EObject ruleLieuDebut() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_description_4_0=null;
        Token otherlv_9=null;
        Token otherlv_12=null;
        EObject lv_conditionDescription_5_0 = null;

        EObject lv_lieudebutElements_6_0 = null;

        EObject lv_lieudebutElements_7_0 = null;

        EObject lv_lieudebutElements_8_0 = null;

        EObject lv_depotObjet_10_0 = null;

        EObject lv_listeChemins_11_0 = null;



        	enterRule();

        try {
            // InternalGame.g:660:2: ( (otherlv_0= 'lieudebut' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) ) ( (lv_conditionDescription_5_0= ruleCondition ) )? )? ( (lv_lieudebutElements_6_0= rulePersonnes ) )? ( (lv_lieudebutElements_7_0= ruleConnaissances ) )? ( (lv_lieudebutElements_8_0= ruleObjets ) )? otherlv_9= 'depotO' ( (lv_depotObjet_10_0= ruleCondition ) )? ( (lv_listeChemins_11_0= ruleChemin ) )+ otherlv_12= '}' ) )
            // InternalGame.g:661:2: (otherlv_0= 'lieudebut' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) ) ( (lv_conditionDescription_5_0= ruleCondition ) )? )? ( (lv_lieudebutElements_6_0= rulePersonnes ) )? ( (lv_lieudebutElements_7_0= ruleConnaissances ) )? ( (lv_lieudebutElements_8_0= ruleObjets ) )? otherlv_9= 'depotO' ( (lv_depotObjet_10_0= ruleCondition ) )? ( (lv_listeChemins_11_0= ruleChemin ) )+ otherlv_12= '}' )
            {
            // InternalGame.g:661:2: (otherlv_0= 'lieudebut' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) ) ( (lv_conditionDescription_5_0= ruleCondition ) )? )? ( (lv_lieudebutElements_6_0= rulePersonnes ) )? ( (lv_lieudebutElements_7_0= ruleConnaissances ) )? ( (lv_lieudebutElements_8_0= ruleObjets ) )? otherlv_9= 'depotO' ( (lv_depotObjet_10_0= ruleCondition ) )? ( (lv_listeChemins_11_0= ruleChemin ) )+ otherlv_12= '}' )
            // InternalGame.g:662:3: otherlv_0= 'lieudebut' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) ) ( (lv_conditionDescription_5_0= ruleCondition ) )? )? ( (lv_lieudebutElements_6_0= rulePersonnes ) )? ( (lv_lieudebutElements_7_0= ruleConnaissances ) )? ( (lv_lieudebutElements_8_0= ruleObjets ) )? otherlv_9= 'depotO' ( (lv_depotObjet_10_0= ruleCondition ) )? ( (lv_listeChemins_11_0= ruleChemin ) )+ otherlv_12= '}'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getLieuDebutAccess().getLieudebutKeyword_0());
            		
            // InternalGame.g:666:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalGame.g:667:4: (lv_name_1_0= RULE_ID )
            {
            // InternalGame.g:667:4: (lv_name_1_0= RULE_ID )
            // InternalGame.g:668:5: lv_name_1_0= RULE_ID
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

            otherlv_2=(Token)match(input,14,FOLLOW_16); 

            			newLeafNode(otherlv_2, grammarAccess.getLieuDebutAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalGame.g:688:3: (otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) ) ( (lv_conditionDescription_5_0= ruleCondition ) )? )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==20) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalGame.g:689:4: otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) ) ( (lv_conditionDescription_5_0= ruleCondition ) )?
                    {
                    otherlv_3=(Token)match(input,20,FOLLOW_17); 

                    				newLeafNode(otherlv_3, grammarAccess.getLieuDebutAccess().getDescriptionKeyword_3_0());
                    			
                    // InternalGame.g:693:4: ( (lv_description_4_0= RULE_STRING ) )
                    // InternalGame.g:694:5: (lv_description_4_0= RULE_STRING )
                    {
                    // InternalGame.g:694:5: (lv_description_4_0= RULE_STRING )
                    // InternalGame.g:695:6: lv_description_4_0= RULE_STRING
                    {
                    lv_description_4_0=(Token)match(input,RULE_STRING,FOLLOW_18); 

                    						newLeafNode(lv_description_4_0, grammarAccess.getLieuDebutAccess().getDescriptionSTRINGTerminalRuleCall_3_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getLieuDebutRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"description",
                    							lv_description_4_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }

                    // InternalGame.g:711:4: ( (lv_conditionDescription_5_0= ruleCondition ) )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0==44) ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // InternalGame.g:712:5: (lv_conditionDescription_5_0= ruleCondition )
                            {
                            // InternalGame.g:712:5: (lv_conditionDescription_5_0= ruleCondition )
                            // InternalGame.g:713:6: lv_conditionDescription_5_0= ruleCondition
                            {

                            						newCompositeNode(grammarAccess.getLieuDebutAccess().getConditionDescriptionConditionParserRuleCall_3_2_0());
                            					
                            pushFollow(FOLLOW_19);
                            lv_conditionDescription_5_0=ruleCondition();

                            state._fsp--;


                            						if (current==null) {
                            							current = createModelElementForParent(grammarAccess.getLieuDebutRule());
                            						}
                            						set(
                            							current,
                            							"conditionDescription",
                            							lv_conditionDescription_5_0,
                            							"fr.n7.Game.Condition");
                            						afterParserOrEnumRuleCall();
                            					

                            }


                            }
                            break;

                    }


                    }
                    break;

            }

            // InternalGame.g:731:3: ( (lv_lieudebutElements_6_0= rulePersonnes ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==24) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalGame.g:732:4: (lv_lieudebutElements_6_0= rulePersonnes )
                    {
                    // InternalGame.g:732:4: (lv_lieudebutElements_6_0= rulePersonnes )
                    // InternalGame.g:733:5: lv_lieudebutElements_6_0= rulePersonnes
                    {

                    					newCompositeNode(grammarAccess.getLieuDebutAccess().getLieudebutElementsPersonnesParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_20);
                    lv_lieudebutElements_6_0=rulePersonnes();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getLieuDebutRule());
                    					}
                    					add(
                    						current,
                    						"lieudebutElements",
                    						lv_lieudebutElements_6_0,
                    						"fr.n7.Game.Personnes");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalGame.g:750:3: ( (lv_lieudebutElements_7_0= ruleConnaissances ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==42) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalGame.g:751:4: (lv_lieudebutElements_7_0= ruleConnaissances )
                    {
                    // InternalGame.g:751:4: (lv_lieudebutElements_7_0= ruleConnaissances )
                    // InternalGame.g:752:5: lv_lieudebutElements_7_0= ruleConnaissances
                    {

                    					newCompositeNode(grammarAccess.getLieuDebutAccess().getLieudebutElementsConnaissancesParserRuleCall_5_0());
                    				
                    pushFollow(FOLLOW_21);
                    lv_lieudebutElements_7_0=ruleConnaissances();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getLieuDebutRule());
                    					}
                    					add(
                    						current,
                    						"lieudebutElements",
                    						lv_lieudebutElements_7_0,
                    						"fr.n7.Game.Connaissances");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalGame.g:769:3: ( (lv_lieudebutElements_8_0= ruleObjets ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==41) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalGame.g:770:4: (lv_lieudebutElements_8_0= ruleObjets )
                    {
                    // InternalGame.g:770:4: (lv_lieudebutElements_8_0= ruleObjets )
                    // InternalGame.g:771:5: lv_lieudebutElements_8_0= ruleObjets
                    {

                    					newCompositeNode(grammarAccess.getLieuDebutAccess().getLieudebutElementsObjetsParserRuleCall_6_0());
                    				
                    pushFollow(FOLLOW_22);
                    lv_lieudebutElements_8_0=ruleObjets();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getLieuDebutRule());
                    					}
                    					add(
                    						current,
                    						"lieudebutElements",
                    						lv_lieudebutElements_8_0,
                    						"fr.n7.Game.Objets");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_9=(Token)match(input,21,FOLLOW_23); 

            			newLeafNode(otherlv_9, grammarAccess.getLieuDebutAccess().getDepotOKeyword_7());
            		
            // InternalGame.g:792:3: ( (lv_depotObjet_10_0= ruleCondition ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==44) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalGame.g:793:4: (lv_depotObjet_10_0= ruleCondition )
                    {
                    // InternalGame.g:793:4: (lv_depotObjet_10_0= ruleCondition )
                    // InternalGame.g:794:5: lv_depotObjet_10_0= ruleCondition
                    {

                    					newCompositeNode(grammarAccess.getLieuDebutAccess().getDepotObjetConditionParserRuleCall_8_0());
                    				
                    pushFollow(FOLLOW_23);
                    lv_depotObjet_10_0=ruleCondition();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getLieuDebutRule());
                    					}
                    					set(
                    						current,
                    						"depotObjet",
                    						lv_depotObjet_10_0,
                    						"fr.n7.Game.Condition");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalGame.g:811:3: ( (lv_listeChemins_11_0= ruleChemin ) )+
            int cnt19=0;
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0>=22 && LA19_0<=23)||LA19_0==45) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalGame.g:812:4: (lv_listeChemins_11_0= ruleChemin )
            	    {
            	    // InternalGame.g:812:4: (lv_listeChemins_11_0= ruleChemin )
            	    // InternalGame.g:813:5: lv_listeChemins_11_0= ruleChemin
            	    {

            	    					newCompositeNode(grammarAccess.getLieuDebutAccess().getListeCheminsCheminParserRuleCall_9_0());
            	    				
            	    pushFollow(FOLLOW_24);
            	    lv_listeChemins_11_0=ruleChemin();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getLieuDebutRule());
            	    					}
            	    					add(
            	    						current,
            	    						"listeChemins",
            	    						lv_listeChemins_11_0,
            	    						"fr.n7.Game.Chemin");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt19 >= 1 ) break loop19;
                        EarlyExitException eee =
                            new EarlyExitException(19, input);
                        throw eee;
                }
                cnt19++;
            } while (true);

            otherlv_12=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_12, grammarAccess.getLieuDebutAccess().getRightCurlyBracketKeyword_10());
            		

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
    // InternalGame.g:838:1: entryRuleLieuFin returns [EObject current=null] : iv_ruleLieuFin= ruleLieuFin EOF ;
    public final EObject entryRuleLieuFin() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLieuFin = null;


        try {
            // InternalGame.g:838:48: (iv_ruleLieuFin= ruleLieuFin EOF )
            // InternalGame.g:839:2: iv_ruleLieuFin= ruleLieuFin EOF
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
    // InternalGame.g:845:1: ruleLieuFin returns [EObject current=null] : (otherlv_0= 'lieufin' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) ) ( (lv_conditionDescription_5_0= ruleCondition ) )? )? ( (lv_lieufinElements_6_0= rulePersonnes ) )? ( (lv_lieufinElements_7_0= ruleConnaissances ) )? ( (lv_lieufinElements_8_0= ruleObjets ) )? otherlv_9= 'depotO' ( (lv_depotObjet_10_0= ruleCondition ) )? otherlv_11= '}' ) ;
    public final EObject ruleLieuFin() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_description_4_0=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        EObject lv_conditionDescription_5_0 = null;

        EObject lv_lieufinElements_6_0 = null;

        EObject lv_lieufinElements_7_0 = null;

        EObject lv_lieufinElements_8_0 = null;

        EObject lv_depotObjet_10_0 = null;



        	enterRule();

        try {
            // InternalGame.g:851:2: ( (otherlv_0= 'lieufin' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) ) ( (lv_conditionDescription_5_0= ruleCondition ) )? )? ( (lv_lieufinElements_6_0= rulePersonnes ) )? ( (lv_lieufinElements_7_0= ruleConnaissances ) )? ( (lv_lieufinElements_8_0= ruleObjets ) )? otherlv_9= 'depotO' ( (lv_depotObjet_10_0= ruleCondition ) )? otherlv_11= '}' ) )
            // InternalGame.g:852:2: (otherlv_0= 'lieufin' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) ) ( (lv_conditionDescription_5_0= ruleCondition ) )? )? ( (lv_lieufinElements_6_0= rulePersonnes ) )? ( (lv_lieufinElements_7_0= ruleConnaissances ) )? ( (lv_lieufinElements_8_0= ruleObjets ) )? otherlv_9= 'depotO' ( (lv_depotObjet_10_0= ruleCondition ) )? otherlv_11= '}' )
            {
            // InternalGame.g:852:2: (otherlv_0= 'lieufin' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) ) ( (lv_conditionDescription_5_0= ruleCondition ) )? )? ( (lv_lieufinElements_6_0= rulePersonnes ) )? ( (lv_lieufinElements_7_0= ruleConnaissances ) )? ( (lv_lieufinElements_8_0= ruleObjets ) )? otherlv_9= 'depotO' ( (lv_depotObjet_10_0= ruleCondition ) )? otherlv_11= '}' )
            // InternalGame.g:853:3: otherlv_0= 'lieufin' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) ) ( (lv_conditionDescription_5_0= ruleCondition ) )? )? ( (lv_lieufinElements_6_0= rulePersonnes ) )? ( (lv_lieufinElements_7_0= ruleConnaissances ) )? ( (lv_lieufinElements_8_0= ruleObjets ) )? otherlv_9= 'depotO' ( (lv_depotObjet_10_0= ruleCondition ) )? otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getLieuFinAccess().getLieufinKeyword_0());
            		
            // InternalGame.g:857:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalGame.g:858:4: (lv_name_1_0= RULE_ID )
            {
            // InternalGame.g:858:4: (lv_name_1_0= RULE_ID )
            // InternalGame.g:859:5: lv_name_1_0= RULE_ID
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

            otherlv_2=(Token)match(input,14,FOLLOW_16); 

            			newLeafNode(otherlv_2, grammarAccess.getLieuFinAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalGame.g:879:3: (otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) ) ( (lv_conditionDescription_5_0= ruleCondition ) )? )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==20) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalGame.g:880:4: otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) ) ( (lv_conditionDescription_5_0= ruleCondition ) )?
                    {
                    otherlv_3=(Token)match(input,20,FOLLOW_17); 

                    				newLeafNode(otherlv_3, grammarAccess.getLieuFinAccess().getDescriptionKeyword_3_0());
                    			
                    // InternalGame.g:884:4: ( (lv_description_4_0= RULE_STRING ) )
                    // InternalGame.g:885:5: (lv_description_4_0= RULE_STRING )
                    {
                    // InternalGame.g:885:5: (lv_description_4_0= RULE_STRING )
                    // InternalGame.g:886:6: lv_description_4_0= RULE_STRING
                    {
                    lv_description_4_0=(Token)match(input,RULE_STRING,FOLLOW_18); 

                    						newLeafNode(lv_description_4_0, grammarAccess.getLieuFinAccess().getDescriptionSTRINGTerminalRuleCall_3_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getLieuFinRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"description",
                    							lv_description_4_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }

                    // InternalGame.g:902:4: ( (lv_conditionDescription_5_0= ruleCondition ) )?
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0==44) ) {
                        alt20=1;
                    }
                    switch (alt20) {
                        case 1 :
                            // InternalGame.g:903:5: (lv_conditionDescription_5_0= ruleCondition )
                            {
                            // InternalGame.g:903:5: (lv_conditionDescription_5_0= ruleCondition )
                            // InternalGame.g:904:6: lv_conditionDescription_5_0= ruleCondition
                            {

                            						newCompositeNode(grammarAccess.getLieuFinAccess().getConditionDescriptionConditionParserRuleCall_3_2_0());
                            					
                            pushFollow(FOLLOW_19);
                            lv_conditionDescription_5_0=ruleCondition();

                            state._fsp--;


                            						if (current==null) {
                            							current = createModelElementForParent(grammarAccess.getLieuFinRule());
                            						}
                            						set(
                            							current,
                            							"conditionDescription",
                            							lv_conditionDescription_5_0,
                            							"fr.n7.Game.Condition");
                            						afterParserOrEnumRuleCall();
                            					

                            }


                            }
                            break;

                    }


                    }
                    break;

            }

            // InternalGame.g:922:3: ( (lv_lieufinElements_6_0= rulePersonnes ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==24) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalGame.g:923:4: (lv_lieufinElements_6_0= rulePersonnes )
                    {
                    // InternalGame.g:923:4: (lv_lieufinElements_6_0= rulePersonnes )
                    // InternalGame.g:924:5: lv_lieufinElements_6_0= rulePersonnes
                    {

                    					newCompositeNode(grammarAccess.getLieuFinAccess().getLieufinElementsPersonnesParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_20);
                    lv_lieufinElements_6_0=rulePersonnes();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getLieuFinRule());
                    					}
                    					add(
                    						current,
                    						"lieufinElements",
                    						lv_lieufinElements_6_0,
                    						"fr.n7.Game.Personnes");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalGame.g:941:3: ( (lv_lieufinElements_7_0= ruleConnaissances ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==42) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalGame.g:942:4: (lv_lieufinElements_7_0= ruleConnaissances )
                    {
                    // InternalGame.g:942:4: (lv_lieufinElements_7_0= ruleConnaissances )
                    // InternalGame.g:943:5: lv_lieufinElements_7_0= ruleConnaissances
                    {

                    					newCompositeNode(grammarAccess.getLieuFinAccess().getLieufinElementsConnaissancesParserRuleCall_5_0());
                    				
                    pushFollow(FOLLOW_21);
                    lv_lieufinElements_7_0=ruleConnaissances();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getLieuFinRule());
                    					}
                    					add(
                    						current,
                    						"lieufinElements",
                    						lv_lieufinElements_7_0,
                    						"fr.n7.Game.Connaissances");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalGame.g:960:3: ( (lv_lieufinElements_8_0= ruleObjets ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==41) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalGame.g:961:4: (lv_lieufinElements_8_0= ruleObjets )
                    {
                    // InternalGame.g:961:4: (lv_lieufinElements_8_0= ruleObjets )
                    // InternalGame.g:962:5: lv_lieufinElements_8_0= ruleObjets
                    {

                    					newCompositeNode(grammarAccess.getLieuFinAccess().getLieufinElementsObjetsParserRuleCall_6_0());
                    				
                    pushFollow(FOLLOW_22);
                    lv_lieufinElements_8_0=ruleObjets();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getLieuFinRule());
                    					}
                    					add(
                    						current,
                    						"lieufinElements",
                    						lv_lieufinElements_8_0,
                    						"fr.n7.Game.Objets");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_9=(Token)match(input,21,FOLLOW_25); 

            			newLeafNode(otherlv_9, grammarAccess.getLieuFinAccess().getDepotOKeyword_7());
            		
            // InternalGame.g:983:3: ( (lv_depotObjet_10_0= ruleCondition ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==44) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalGame.g:984:4: (lv_depotObjet_10_0= ruleCondition )
                    {
                    // InternalGame.g:984:4: (lv_depotObjet_10_0= ruleCondition )
                    // InternalGame.g:985:5: lv_depotObjet_10_0= ruleCondition
                    {

                    					newCompositeNode(grammarAccess.getLieuFinAccess().getDepotObjetConditionParserRuleCall_8_0());
                    				
                    pushFollow(FOLLOW_6);
                    lv_depotObjet_10_0=ruleCondition();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getLieuFinRule());
                    					}
                    					set(
                    						current,
                    						"depotObjet",
                    						lv_depotObjet_10_0,
                    						"fr.n7.Game.Condition");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_11=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getLieuFinAccess().getRightCurlyBracketKeyword_9());
            		

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
    // InternalGame.g:1010:1: entryRulePersonnes returns [EObject current=null] : iv_rulePersonnes= rulePersonnes EOF ;
    public final EObject entryRulePersonnes() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePersonnes = null;


        try {
            // InternalGame.g:1010:50: (iv_rulePersonnes= rulePersonnes EOF )
            // InternalGame.g:1011:2: iv_rulePersonnes= rulePersonnes EOF
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
    // InternalGame.g:1017:1: rulePersonnes returns [EObject current=null] : (otherlv_0= 'personnes' otherlv_1= '{' ( (lv_listePersonne_2_0= rulePersonne ) )* otherlv_3= '}' ) ;
    public final EObject rulePersonnes() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_listePersonne_2_0 = null;



        	enterRule();

        try {
            // InternalGame.g:1023:2: ( (otherlv_0= 'personnes' otherlv_1= '{' ( (lv_listePersonne_2_0= rulePersonne ) )* otherlv_3= '}' ) )
            // InternalGame.g:1024:2: (otherlv_0= 'personnes' otherlv_1= '{' ( (lv_listePersonne_2_0= rulePersonne ) )* otherlv_3= '}' )
            {
            // InternalGame.g:1024:2: (otherlv_0= 'personnes' otherlv_1= '{' ( (lv_listePersonne_2_0= rulePersonne ) )* otherlv_3= '}' )
            // InternalGame.g:1025:3: otherlv_0= 'personnes' otherlv_1= '{' ( (lv_listePersonne_2_0= rulePersonne ) )* otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getPersonnesAccess().getPersonnesKeyword_0());
            		
            otherlv_1=(Token)match(input,14,FOLLOW_26); 

            			newLeafNode(otherlv_1, grammarAccess.getPersonnesAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalGame.g:1033:3: ( (lv_listePersonne_2_0= rulePersonne ) )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==25) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalGame.g:1034:4: (lv_listePersonne_2_0= rulePersonne )
            	    {
            	    // InternalGame.g:1034:4: (lv_listePersonne_2_0= rulePersonne )
            	    // InternalGame.g:1035:5: lv_listePersonne_2_0= rulePersonne
            	    {

            	    					newCompositeNode(grammarAccess.getPersonnesAccess().getListePersonnePersonneParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_26);
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
            	    break loop26;
                }
            } while (true);

            otherlv_3=(Token)match(input,15,FOLLOW_2); 

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
    // InternalGame.g:1060:1: entryRulePersonne returns [EObject current=null] : iv_rulePersonne= rulePersonne EOF ;
    public final EObject entryRulePersonne() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePersonne = null;


        try {
            // InternalGame.g:1060:49: (iv_rulePersonne= rulePersonne EOF )
            // InternalGame.g:1061:2: iv_rulePersonne= rulePersonne EOF
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
    // InternalGame.g:1067:1: rulePersonne returns [EObject current=null] : (otherlv_0= 'personne' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'visible' ( (lv_visible_4_0= RULE_BOOL ) ) )? (otherlv_5= 'obligatoire' ( (lv_obligatoire_6_0= RULE_BOOL ) ) )? ( (lv_personneElements_7_0= ruleInteraction ) ) otherlv_8= '}' ) ;
    public final EObject rulePersonne() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_visible_4_0=null;
        Token otherlv_5=null;
        Token lv_obligatoire_6_0=null;
        Token otherlv_8=null;
        EObject lv_personneElements_7_0 = null;



        	enterRule();

        try {
            // InternalGame.g:1073:2: ( (otherlv_0= 'personne' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'visible' ( (lv_visible_4_0= RULE_BOOL ) ) )? (otherlv_5= 'obligatoire' ( (lv_obligatoire_6_0= RULE_BOOL ) ) )? ( (lv_personneElements_7_0= ruleInteraction ) ) otherlv_8= '}' ) )
            // InternalGame.g:1074:2: (otherlv_0= 'personne' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'visible' ( (lv_visible_4_0= RULE_BOOL ) ) )? (otherlv_5= 'obligatoire' ( (lv_obligatoire_6_0= RULE_BOOL ) ) )? ( (lv_personneElements_7_0= ruleInteraction ) ) otherlv_8= '}' )
            {
            // InternalGame.g:1074:2: (otherlv_0= 'personne' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'visible' ( (lv_visible_4_0= RULE_BOOL ) ) )? (otherlv_5= 'obligatoire' ( (lv_obligatoire_6_0= RULE_BOOL ) ) )? ( (lv_personneElements_7_0= ruleInteraction ) ) otherlv_8= '}' )
            // InternalGame.g:1075:3: otherlv_0= 'personne' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'visible' ( (lv_visible_4_0= RULE_BOOL ) ) )? (otherlv_5= 'obligatoire' ( (lv_obligatoire_6_0= RULE_BOOL ) ) )? ( (lv_personneElements_7_0= ruleInteraction ) ) otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getPersonneAccess().getPersonneKeyword_0());
            		
            // InternalGame.g:1079:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalGame.g:1080:4: (lv_name_1_0= RULE_ID )
            {
            // InternalGame.g:1080:4: (lv_name_1_0= RULE_ID )
            // InternalGame.g:1081:5: lv_name_1_0= RULE_ID
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

            otherlv_2=(Token)match(input,14,FOLLOW_27); 

            			newLeafNode(otherlv_2, grammarAccess.getPersonneAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalGame.g:1101:3: (otherlv_3= 'visible' ( (lv_visible_4_0= RULE_BOOL ) ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==26) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalGame.g:1102:4: otherlv_3= 'visible' ( (lv_visible_4_0= RULE_BOOL ) )
                    {
                    otherlv_3=(Token)match(input,26,FOLLOW_28); 

                    				newLeafNode(otherlv_3, grammarAccess.getPersonneAccess().getVisibleKeyword_3_0());
                    			
                    // InternalGame.g:1106:4: ( (lv_visible_4_0= RULE_BOOL ) )
                    // InternalGame.g:1107:5: (lv_visible_4_0= RULE_BOOL )
                    {
                    // InternalGame.g:1107:5: (lv_visible_4_0= RULE_BOOL )
                    // InternalGame.g:1108:6: lv_visible_4_0= RULE_BOOL
                    {
                    lv_visible_4_0=(Token)match(input,RULE_BOOL,FOLLOW_27); 

                    						newLeafNode(lv_visible_4_0, grammarAccess.getPersonneAccess().getVisibleBOOLTerminalRuleCall_3_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPersonneRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"visible",
                    							lv_visible_4_0,
                    							"fr.n7.Game.BOOL");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalGame.g:1125:3: (otherlv_5= 'obligatoire' ( (lv_obligatoire_6_0= RULE_BOOL ) ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==27) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalGame.g:1126:4: otherlv_5= 'obligatoire' ( (lv_obligatoire_6_0= RULE_BOOL ) )
                    {
                    otherlv_5=(Token)match(input,27,FOLLOW_28); 

                    				newLeafNode(otherlv_5, grammarAccess.getPersonneAccess().getObligatoireKeyword_4_0());
                    			
                    // InternalGame.g:1130:4: ( (lv_obligatoire_6_0= RULE_BOOL ) )
                    // InternalGame.g:1131:5: (lv_obligatoire_6_0= RULE_BOOL )
                    {
                    // InternalGame.g:1131:5: (lv_obligatoire_6_0= RULE_BOOL )
                    // InternalGame.g:1132:6: lv_obligatoire_6_0= RULE_BOOL
                    {
                    lv_obligatoire_6_0=(Token)match(input,RULE_BOOL,FOLLOW_27); 

                    						newLeafNode(lv_obligatoire_6_0, grammarAccess.getPersonneAccess().getObligatoireBOOLTerminalRuleCall_4_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPersonneRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"obligatoire",
                    							lv_obligatoire_6_0,
                    							"fr.n7.Game.BOOL");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalGame.g:1149:3: ( (lv_personneElements_7_0= ruleInteraction ) )
            // InternalGame.g:1150:4: (lv_personneElements_7_0= ruleInteraction )
            {
            // InternalGame.g:1150:4: (lv_personneElements_7_0= ruleInteraction )
            // InternalGame.g:1151:5: lv_personneElements_7_0= ruleInteraction
            {

            					newCompositeNode(grammarAccess.getPersonneAccess().getPersonneElementsInteractionParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_6);
            lv_personneElements_7_0=ruleInteraction();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPersonneRule());
            					}
            					add(
            						current,
            						"personneElements",
            						lv_personneElements_7_0,
            						"fr.n7.Game.Interaction");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_8=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getPersonneAccess().getRightCurlyBracketKeyword_6());
            		

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
    // InternalGame.g:1176:1: entryRuleInteraction returns [EObject current=null] : iv_ruleInteraction= ruleInteraction EOF ;
    public final EObject entryRuleInteraction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInteraction = null;


        try {
            // InternalGame.g:1176:52: (iv_ruleInteraction= ruleInteraction EOF )
            // InternalGame.g:1177:2: iv_ruleInteraction= ruleInteraction EOF
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
    // InternalGame.g:1183:1: ruleInteraction returns [EObject current=null] : (otherlv_0= 'interaction' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'texte' ( (lv_texte_4_0= RULE_STRING ) ) ( (lv_interactionElements_5_0= ruleChoix ) )* otherlv_6= '}' ) ;
    public final EObject ruleInteraction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_texte_4_0=null;
        Token otherlv_6=null;
        EObject lv_interactionElements_5_0 = null;



        	enterRule();

        try {
            // InternalGame.g:1189:2: ( (otherlv_0= 'interaction' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'texte' ( (lv_texte_4_0= RULE_STRING ) ) ( (lv_interactionElements_5_0= ruleChoix ) )* otherlv_6= '}' ) )
            // InternalGame.g:1190:2: (otherlv_0= 'interaction' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'texte' ( (lv_texte_4_0= RULE_STRING ) ) ( (lv_interactionElements_5_0= ruleChoix ) )* otherlv_6= '}' )
            {
            // InternalGame.g:1190:2: (otherlv_0= 'interaction' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'texte' ( (lv_texte_4_0= RULE_STRING ) ) ( (lv_interactionElements_5_0= ruleChoix ) )* otherlv_6= '}' )
            // InternalGame.g:1191:3: otherlv_0= 'interaction' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'texte' ( (lv_texte_4_0= RULE_STRING ) ) ( (lv_interactionElements_5_0= ruleChoix ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,28,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getInteractionAccess().getInteractionKeyword_0());
            		
            // InternalGame.g:1195:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalGame.g:1196:4: (lv_name_1_0= RULE_ID )
            {
            // InternalGame.g:1196:4: (lv_name_1_0= RULE_ID )
            // InternalGame.g:1197:5: lv_name_1_0= RULE_ID
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

            otherlv_2=(Token)match(input,14,FOLLOW_29); 

            			newLeafNode(otherlv_2, grammarAccess.getInteractionAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,29,FOLLOW_17); 

            			newLeafNode(otherlv_3, grammarAccess.getInteractionAccess().getTexteKeyword_3());
            		
            // InternalGame.g:1221:3: ( (lv_texte_4_0= RULE_STRING ) )
            // InternalGame.g:1222:4: (lv_texte_4_0= RULE_STRING )
            {
            // InternalGame.g:1222:4: (lv_texte_4_0= RULE_STRING )
            // InternalGame.g:1223:5: lv_texte_4_0= RULE_STRING
            {
            lv_texte_4_0=(Token)match(input,RULE_STRING,FOLLOW_30); 

            					newLeafNode(lv_texte_4_0, grammarAccess.getInteractionAccess().getTexteSTRINGTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInteractionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"texte",
            						lv_texte_4_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalGame.g:1239:3: ( (lv_interactionElements_5_0= ruleChoix ) )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==30) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalGame.g:1240:4: (lv_interactionElements_5_0= ruleChoix )
            	    {
            	    // InternalGame.g:1240:4: (lv_interactionElements_5_0= ruleChoix )
            	    // InternalGame.g:1241:5: lv_interactionElements_5_0= ruleChoix
            	    {

            	    					newCompositeNode(grammarAccess.getInteractionAccess().getInteractionElementsChoixParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_30);
            	    lv_interactionElements_5_0=ruleChoix();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getInteractionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"interactionElements",
            	    						lv_interactionElements_5_0,
            	    						"fr.n7.Game.Choix");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

            otherlv_6=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getInteractionAccess().getRightCurlyBracketKeyword_6());
            		

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
    // InternalGame.g:1266:1: entryRuleChoix returns [EObject current=null] : iv_ruleChoix= ruleChoix EOF ;
    public final EObject entryRuleChoix() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChoix = null;


        try {
            // InternalGame.g:1266:46: (iv_ruleChoix= ruleChoix EOF )
            // InternalGame.g:1267:2: iv_ruleChoix= ruleChoix EOF
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
    // InternalGame.g:1273:1: ruleChoix returns [EObject current=null] : (otherlv_0= 'choix' ( (lv_texte_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_listeActions_3_0= ruleAction ) )+ (otherlv_4= 'choixdebut' ( ( (lv_choixdebut_5_0= RULE_STRING ) ) ( (lv_conditonChoixDebut_6_0= ruleCondition ) ) )? )? (otherlv_7= 'choixfin' ( ( (lv_choixfin_8_0= RULE_STRING ) ) ( (lv_conditionChoixFin_9_0= ruleCondition ) ) )? )? otherlv_10= '}' ) ;
    public final EObject ruleChoix() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_texte_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token lv_choixdebut_5_0=null;
        Token otherlv_7=null;
        Token lv_choixfin_8_0=null;
        Token otherlv_10=null;
        EObject lv_listeActions_3_0 = null;

        EObject lv_conditonChoixDebut_6_0 = null;

        EObject lv_conditionChoixFin_9_0 = null;



        	enterRule();

        try {
            // InternalGame.g:1279:2: ( (otherlv_0= 'choix' ( (lv_texte_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_listeActions_3_0= ruleAction ) )+ (otherlv_4= 'choixdebut' ( ( (lv_choixdebut_5_0= RULE_STRING ) ) ( (lv_conditonChoixDebut_6_0= ruleCondition ) ) )? )? (otherlv_7= 'choixfin' ( ( (lv_choixfin_8_0= RULE_STRING ) ) ( (lv_conditionChoixFin_9_0= ruleCondition ) ) )? )? otherlv_10= '}' ) )
            // InternalGame.g:1280:2: (otherlv_0= 'choix' ( (lv_texte_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_listeActions_3_0= ruleAction ) )+ (otherlv_4= 'choixdebut' ( ( (lv_choixdebut_5_0= RULE_STRING ) ) ( (lv_conditonChoixDebut_6_0= ruleCondition ) ) )? )? (otherlv_7= 'choixfin' ( ( (lv_choixfin_8_0= RULE_STRING ) ) ( (lv_conditionChoixFin_9_0= ruleCondition ) ) )? )? otherlv_10= '}' )
            {
            // InternalGame.g:1280:2: (otherlv_0= 'choix' ( (lv_texte_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_listeActions_3_0= ruleAction ) )+ (otherlv_4= 'choixdebut' ( ( (lv_choixdebut_5_0= RULE_STRING ) ) ( (lv_conditonChoixDebut_6_0= ruleCondition ) ) )? )? (otherlv_7= 'choixfin' ( ( (lv_choixfin_8_0= RULE_STRING ) ) ( (lv_conditionChoixFin_9_0= ruleCondition ) ) )? )? otherlv_10= '}' )
            // InternalGame.g:1281:3: otherlv_0= 'choix' ( (lv_texte_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_listeActions_3_0= ruleAction ) )+ (otherlv_4= 'choixdebut' ( ( (lv_choixdebut_5_0= RULE_STRING ) ) ( (lv_conditonChoixDebut_6_0= ruleCondition ) ) )? )? (otherlv_7= 'choixfin' ( ( (lv_choixfin_8_0= RULE_STRING ) ) ( (lv_conditionChoixFin_9_0= ruleCondition ) ) )? )? otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,30,FOLLOW_17); 

            			newLeafNode(otherlv_0, grammarAccess.getChoixAccess().getChoixKeyword_0());
            		
            // InternalGame.g:1285:3: ( (lv_texte_1_0= RULE_STRING ) )
            // InternalGame.g:1286:4: (lv_texte_1_0= RULE_STRING )
            {
            // InternalGame.g:1286:4: (lv_texte_1_0= RULE_STRING )
            // InternalGame.g:1287:5: lv_texte_1_0= RULE_STRING
            {
            lv_texte_1_0=(Token)match(input,RULE_STRING,FOLLOW_4); 

            					newLeafNode(lv_texte_1_0, grammarAccess.getChoixAccess().getTexteSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getChoixRule());
            					}
            					setWithLastConsumed(
            						current,
            						"texte",
            						lv_texte_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_31); 

            			newLeafNode(otherlv_2, grammarAccess.getChoixAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalGame.g:1307:3: ( (lv_listeActions_3_0= ruleAction ) )+
            int cnt30=0;
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==33) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalGame.g:1308:4: (lv_listeActions_3_0= ruleAction )
            	    {
            	    // InternalGame.g:1308:4: (lv_listeActions_3_0= ruleAction )
            	    // InternalGame.g:1309:5: lv_listeActions_3_0= ruleAction
            	    {

            	    					newCompositeNode(grammarAccess.getChoixAccess().getListeActionsActionParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_32);
            	    lv_listeActions_3_0=ruleAction();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getChoixRule());
            	    					}
            	    					add(
            	    						current,
            	    						"listeActions",
            	    						lv_listeActions_3_0,
            	    						"fr.n7.Game.Action");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt30 >= 1 ) break loop30;
                        EarlyExitException eee =
                            new EarlyExitException(30, input);
                        throw eee;
                }
                cnt30++;
            } while (true);

            // InternalGame.g:1326:3: (otherlv_4= 'choixdebut' ( ( (lv_choixdebut_5_0= RULE_STRING ) ) ( (lv_conditonChoixDebut_6_0= ruleCondition ) ) )? )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==31) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalGame.g:1327:4: otherlv_4= 'choixdebut' ( ( (lv_choixdebut_5_0= RULE_STRING ) ) ( (lv_conditonChoixDebut_6_0= ruleCondition ) ) )?
                    {
                    otherlv_4=(Token)match(input,31,FOLLOW_33); 

                    				newLeafNode(otherlv_4, grammarAccess.getChoixAccess().getChoixdebutKeyword_4_0());
                    			
                    // InternalGame.g:1331:4: ( ( (lv_choixdebut_5_0= RULE_STRING ) ) ( (lv_conditonChoixDebut_6_0= ruleCondition ) ) )?
                    int alt31=2;
                    int LA31_0 = input.LA(1);

                    if ( (LA31_0==RULE_STRING) ) {
                        alt31=1;
                    }
                    switch (alt31) {
                        case 1 :
                            // InternalGame.g:1332:5: ( (lv_choixdebut_5_0= RULE_STRING ) ) ( (lv_conditonChoixDebut_6_0= ruleCondition ) )
                            {
                            // InternalGame.g:1332:5: ( (lv_choixdebut_5_0= RULE_STRING ) )
                            // InternalGame.g:1333:6: (lv_choixdebut_5_0= RULE_STRING )
                            {
                            // InternalGame.g:1333:6: (lv_choixdebut_5_0= RULE_STRING )
                            // InternalGame.g:1334:7: lv_choixdebut_5_0= RULE_STRING
                            {
                            lv_choixdebut_5_0=(Token)match(input,RULE_STRING,FOLLOW_34); 

                            							newLeafNode(lv_choixdebut_5_0, grammarAccess.getChoixAccess().getChoixdebutSTRINGTerminalRuleCall_4_1_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getChoixRule());
                            							}
                            							setWithLastConsumed(
                            								current,
                            								"choixdebut",
                            								lv_choixdebut_5_0,
                            								"org.eclipse.xtext.common.Terminals.STRING");
                            						

                            }


                            }

                            // InternalGame.g:1350:5: ( (lv_conditonChoixDebut_6_0= ruleCondition ) )
                            // InternalGame.g:1351:6: (lv_conditonChoixDebut_6_0= ruleCondition )
                            {
                            // InternalGame.g:1351:6: (lv_conditonChoixDebut_6_0= ruleCondition )
                            // InternalGame.g:1352:7: lv_conditonChoixDebut_6_0= ruleCondition
                            {

                            							newCompositeNode(grammarAccess.getChoixAccess().getConditonChoixDebutConditionParserRuleCall_4_1_1_0());
                            						
                            pushFollow(FOLLOW_35);
                            lv_conditonChoixDebut_6_0=ruleCondition();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getChoixRule());
                            							}
                            							set(
                            								current,
                            								"conditonChoixDebut",
                            								lv_conditonChoixDebut_6_0,
                            								"fr.n7.Game.Condition");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }


                            }
                            break;

                    }


                    }
                    break;

            }

            // InternalGame.g:1371:3: (otherlv_7= 'choixfin' ( ( (lv_choixfin_8_0= RULE_STRING ) ) ( (lv_conditionChoixFin_9_0= ruleCondition ) ) )? )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==32) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalGame.g:1372:4: otherlv_7= 'choixfin' ( ( (lv_choixfin_8_0= RULE_STRING ) ) ( (lv_conditionChoixFin_9_0= ruleCondition ) ) )?
                    {
                    otherlv_7=(Token)match(input,32,FOLLOW_36); 

                    				newLeafNode(otherlv_7, grammarAccess.getChoixAccess().getChoixfinKeyword_5_0());
                    			
                    // InternalGame.g:1376:4: ( ( (lv_choixfin_8_0= RULE_STRING ) ) ( (lv_conditionChoixFin_9_0= ruleCondition ) ) )?
                    int alt33=2;
                    int LA33_0 = input.LA(1);

                    if ( (LA33_0==RULE_STRING) ) {
                        alt33=1;
                    }
                    switch (alt33) {
                        case 1 :
                            // InternalGame.g:1377:5: ( (lv_choixfin_8_0= RULE_STRING ) ) ( (lv_conditionChoixFin_9_0= ruleCondition ) )
                            {
                            // InternalGame.g:1377:5: ( (lv_choixfin_8_0= RULE_STRING ) )
                            // InternalGame.g:1378:6: (lv_choixfin_8_0= RULE_STRING )
                            {
                            // InternalGame.g:1378:6: (lv_choixfin_8_0= RULE_STRING )
                            // InternalGame.g:1379:7: lv_choixfin_8_0= RULE_STRING
                            {
                            lv_choixfin_8_0=(Token)match(input,RULE_STRING,FOLLOW_34); 

                            							newLeafNode(lv_choixfin_8_0, grammarAccess.getChoixAccess().getChoixfinSTRINGTerminalRuleCall_5_1_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getChoixRule());
                            							}
                            							setWithLastConsumed(
                            								current,
                            								"choixfin",
                            								lv_choixfin_8_0,
                            								"org.eclipse.xtext.common.Terminals.STRING");
                            						

                            }


                            }

                            // InternalGame.g:1395:5: ( (lv_conditionChoixFin_9_0= ruleCondition ) )
                            // InternalGame.g:1396:6: (lv_conditionChoixFin_9_0= ruleCondition )
                            {
                            // InternalGame.g:1396:6: (lv_conditionChoixFin_9_0= ruleCondition )
                            // InternalGame.g:1397:7: lv_conditionChoixFin_9_0= ruleCondition
                            {

                            							newCompositeNode(grammarAccess.getChoixAccess().getConditionChoixFinConditionParserRuleCall_5_1_1_0());
                            						
                            pushFollow(FOLLOW_6);
                            lv_conditionChoixFin_9_0=ruleCondition();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getChoixRule());
                            							}
                            							set(
                            								current,
                            								"conditionChoixFin",
                            								lv_conditionChoixFin_9_0,
                            								"fr.n7.Game.Condition");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }


                            }
                            break;

                    }


                    }
                    break;

            }

            otherlv_10=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getChoixAccess().getRightCurlyBracketKeyword_6());
            		

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


    // $ANTLR start "entryRuleAction"
    // InternalGame.g:1424:1: entryRuleAction returns [EObject current=null] : iv_ruleAction= ruleAction EOF ;
    public final EObject entryRuleAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAction = null;


        try {
            // InternalGame.g:1424:47: (iv_ruleAction= ruleAction EOF )
            // InternalGame.g:1425:2: iv_ruleAction= ruleAction EOF
            {
             newCompositeNode(grammarAccess.getActionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAction=ruleAction();

            state._fsp--;

             current =iv_ruleAction; 
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
    // $ANTLR end "entryRuleAction"


    // $ANTLR start "ruleAction"
    // InternalGame.g:1431:1: ruleAction returns [EObject current=null] : (otherlv_0= 'action' otherlv_1= '{' ( (lv_conditionAction_2_0= ruleCondition ) )? ( (lv_listeChoix_3_0= ruleChoix ) )* ( (lv_listeConnaissances_4_0= ruleConnaissance ) )* ( (lv_listeObjets_5_0= ruleObjet ) )* otherlv_6= 'attributionC' ( (lv_attributionConnaissance_7_0= ruleCondition ) ) (otherlv_8= 'attributionO' ( (lv_attributionObjet_9_0= ruleCondition ) ) )? ( (lv_listeObjetsConsommes_10_0= ruleObjet ) )* (otherlv_11= 'consommationO' ( (lv_consommationObjet_12_0= ruleCondition ) ) )? otherlv_13= '}' ) ;
    public final EObject ruleAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        EObject lv_conditionAction_2_0 = null;

        EObject lv_listeChoix_3_0 = null;

        EObject lv_listeConnaissances_4_0 = null;

        EObject lv_listeObjets_5_0 = null;

        EObject lv_attributionConnaissance_7_0 = null;

        EObject lv_attributionObjet_9_0 = null;

        EObject lv_listeObjetsConsommes_10_0 = null;

        EObject lv_consommationObjet_12_0 = null;



        	enterRule();

        try {
            // InternalGame.g:1437:2: ( (otherlv_0= 'action' otherlv_1= '{' ( (lv_conditionAction_2_0= ruleCondition ) )? ( (lv_listeChoix_3_0= ruleChoix ) )* ( (lv_listeConnaissances_4_0= ruleConnaissance ) )* ( (lv_listeObjets_5_0= ruleObjet ) )* otherlv_6= 'attributionC' ( (lv_attributionConnaissance_7_0= ruleCondition ) ) (otherlv_8= 'attributionO' ( (lv_attributionObjet_9_0= ruleCondition ) ) )? ( (lv_listeObjetsConsommes_10_0= ruleObjet ) )* (otherlv_11= 'consommationO' ( (lv_consommationObjet_12_0= ruleCondition ) ) )? otherlv_13= '}' ) )
            // InternalGame.g:1438:2: (otherlv_0= 'action' otherlv_1= '{' ( (lv_conditionAction_2_0= ruleCondition ) )? ( (lv_listeChoix_3_0= ruleChoix ) )* ( (lv_listeConnaissances_4_0= ruleConnaissance ) )* ( (lv_listeObjets_5_0= ruleObjet ) )* otherlv_6= 'attributionC' ( (lv_attributionConnaissance_7_0= ruleCondition ) ) (otherlv_8= 'attributionO' ( (lv_attributionObjet_9_0= ruleCondition ) ) )? ( (lv_listeObjetsConsommes_10_0= ruleObjet ) )* (otherlv_11= 'consommationO' ( (lv_consommationObjet_12_0= ruleCondition ) ) )? otherlv_13= '}' )
            {
            // InternalGame.g:1438:2: (otherlv_0= 'action' otherlv_1= '{' ( (lv_conditionAction_2_0= ruleCondition ) )? ( (lv_listeChoix_3_0= ruleChoix ) )* ( (lv_listeConnaissances_4_0= ruleConnaissance ) )* ( (lv_listeObjets_5_0= ruleObjet ) )* otherlv_6= 'attributionC' ( (lv_attributionConnaissance_7_0= ruleCondition ) ) (otherlv_8= 'attributionO' ( (lv_attributionObjet_9_0= ruleCondition ) ) )? ( (lv_listeObjetsConsommes_10_0= ruleObjet ) )* (otherlv_11= 'consommationO' ( (lv_consommationObjet_12_0= ruleCondition ) ) )? otherlv_13= '}' )
            // InternalGame.g:1439:3: otherlv_0= 'action' otherlv_1= '{' ( (lv_conditionAction_2_0= ruleCondition ) )? ( (lv_listeChoix_3_0= ruleChoix ) )* ( (lv_listeConnaissances_4_0= ruleConnaissance ) )* ( (lv_listeObjets_5_0= ruleObjet ) )* otherlv_6= 'attributionC' ( (lv_attributionConnaissance_7_0= ruleCondition ) ) (otherlv_8= 'attributionO' ( (lv_attributionObjet_9_0= ruleCondition ) ) )? ( (lv_listeObjetsConsommes_10_0= ruleObjet ) )* (otherlv_11= 'consommationO' ( (lv_consommationObjet_12_0= ruleCondition ) ) )? otherlv_13= '}'
            {
            otherlv_0=(Token)match(input,33,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getActionAccess().getActionKeyword_0());
            		
            otherlv_1=(Token)match(input,14,FOLLOW_37); 

            			newLeafNode(otherlv_1, grammarAccess.getActionAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalGame.g:1447:3: ( (lv_conditionAction_2_0= ruleCondition ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==44) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalGame.g:1448:4: (lv_conditionAction_2_0= ruleCondition )
                    {
                    // InternalGame.g:1448:4: (lv_conditionAction_2_0= ruleCondition )
                    // InternalGame.g:1449:5: lv_conditionAction_2_0= ruleCondition
                    {

                    					newCompositeNode(grammarAccess.getActionAccess().getConditionActionConditionParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_38);
                    lv_conditionAction_2_0=ruleCondition();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getActionRule());
                    					}
                    					set(
                    						current,
                    						"conditionAction",
                    						lv_conditionAction_2_0,
                    						"fr.n7.Game.Condition");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalGame.g:1466:3: ( (lv_listeChoix_3_0= ruleChoix ) )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==30) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // InternalGame.g:1467:4: (lv_listeChoix_3_0= ruleChoix )
            	    {
            	    // InternalGame.g:1467:4: (lv_listeChoix_3_0= ruleChoix )
            	    // InternalGame.g:1468:5: lv_listeChoix_3_0= ruleChoix
            	    {

            	    					newCompositeNode(grammarAccess.getActionAccess().getListeChoixChoixParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_38);
            	    lv_listeChoix_3_0=ruleChoix();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getActionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"listeChoix",
            	    						lv_listeChoix_3_0,
            	    						"fr.n7.Game.Choix");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop36;
                }
            } while (true);

            // InternalGame.g:1485:3: ( (lv_listeConnaissances_4_0= ruleConnaissance ) )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==43) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // InternalGame.g:1486:4: (lv_listeConnaissances_4_0= ruleConnaissance )
            	    {
            	    // InternalGame.g:1486:4: (lv_listeConnaissances_4_0= ruleConnaissance )
            	    // InternalGame.g:1487:5: lv_listeConnaissances_4_0= ruleConnaissance
            	    {

            	    					newCompositeNode(grammarAccess.getActionAccess().getListeConnaissancesConnaissanceParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_39);
            	    lv_listeConnaissances_4_0=ruleConnaissance();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getActionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"listeConnaissances",
            	    						lv_listeConnaissances_4_0,
            	    						"fr.n7.Game.Connaissance");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop37;
                }
            } while (true);

            // InternalGame.g:1504:3: ( (lv_listeObjets_5_0= ruleObjet ) )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==37) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // InternalGame.g:1505:4: (lv_listeObjets_5_0= ruleObjet )
            	    {
            	    // InternalGame.g:1505:4: (lv_listeObjets_5_0= ruleObjet )
            	    // InternalGame.g:1506:5: lv_listeObjets_5_0= ruleObjet
            	    {

            	    					newCompositeNode(grammarAccess.getActionAccess().getListeObjetsObjetParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_40);
            	    lv_listeObjets_5_0=ruleObjet();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getActionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"listeObjets",
            	    						lv_listeObjets_5_0,
            	    						"fr.n7.Game.Objet");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop38;
                }
            } while (true);

            otherlv_6=(Token)match(input,34,FOLLOW_34); 

            			newLeafNode(otherlv_6, grammarAccess.getActionAccess().getAttributionCKeyword_6());
            		
            // InternalGame.g:1527:3: ( (lv_attributionConnaissance_7_0= ruleCondition ) )
            // InternalGame.g:1528:4: (lv_attributionConnaissance_7_0= ruleCondition )
            {
            // InternalGame.g:1528:4: (lv_attributionConnaissance_7_0= ruleCondition )
            // InternalGame.g:1529:5: lv_attributionConnaissance_7_0= ruleCondition
            {

            					newCompositeNode(grammarAccess.getActionAccess().getAttributionConnaissanceConditionParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_41);
            lv_attributionConnaissance_7_0=ruleCondition();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getActionRule());
            					}
            					set(
            						current,
            						"attributionConnaissance",
            						lv_attributionConnaissance_7_0,
            						"fr.n7.Game.Condition");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalGame.g:1546:3: (otherlv_8= 'attributionO' ( (lv_attributionObjet_9_0= ruleCondition ) ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==35) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalGame.g:1547:4: otherlv_8= 'attributionO' ( (lv_attributionObjet_9_0= ruleCondition ) )
                    {
                    otherlv_8=(Token)match(input,35,FOLLOW_34); 

                    				newLeafNode(otherlv_8, grammarAccess.getActionAccess().getAttributionOKeyword_8_0());
                    			
                    // InternalGame.g:1551:4: ( (lv_attributionObjet_9_0= ruleCondition ) )
                    // InternalGame.g:1552:5: (lv_attributionObjet_9_0= ruleCondition )
                    {
                    // InternalGame.g:1552:5: (lv_attributionObjet_9_0= ruleCondition )
                    // InternalGame.g:1553:6: lv_attributionObjet_9_0= ruleCondition
                    {

                    						newCompositeNode(grammarAccess.getActionAccess().getAttributionObjetConditionParserRuleCall_8_1_0());
                    					
                    pushFollow(FOLLOW_42);
                    lv_attributionObjet_9_0=ruleCondition();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getActionRule());
                    						}
                    						set(
                    							current,
                    							"attributionObjet",
                    							lv_attributionObjet_9_0,
                    							"fr.n7.Game.Condition");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalGame.g:1571:3: ( (lv_listeObjetsConsommes_10_0= ruleObjet ) )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==37) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // InternalGame.g:1572:4: (lv_listeObjetsConsommes_10_0= ruleObjet )
            	    {
            	    // InternalGame.g:1572:4: (lv_listeObjetsConsommes_10_0= ruleObjet )
            	    // InternalGame.g:1573:5: lv_listeObjetsConsommes_10_0= ruleObjet
            	    {

            	    					newCompositeNode(grammarAccess.getActionAccess().getListeObjetsConsommesObjetParserRuleCall_9_0());
            	    				
            	    pushFollow(FOLLOW_42);
            	    lv_listeObjetsConsommes_10_0=ruleObjet();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getActionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"listeObjetsConsommes",
            	    						lv_listeObjetsConsommes_10_0,
            	    						"fr.n7.Game.Objet");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop40;
                }
            } while (true);

            // InternalGame.g:1590:3: (otherlv_11= 'consommationO' ( (lv_consommationObjet_12_0= ruleCondition ) ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==36) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalGame.g:1591:4: otherlv_11= 'consommationO' ( (lv_consommationObjet_12_0= ruleCondition ) )
                    {
                    otherlv_11=(Token)match(input,36,FOLLOW_34); 

                    				newLeafNode(otherlv_11, grammarAccess.getActionAccess().getConsommationOKeyword_10_0());
                    			
                    // InternalGame.g:1595:4: ( (lv_consommationObjet_12_0= ruleCondition ) )
                    // InternalGame.g:1596:5: (lv_consommationObjet_12_0= ruleCondition )
                    {
                    // InternalGame.g:1596:5: (lv_consommationObjet_12_0= ruleCondition )
                    // InternalGame.g:1597:6: lv_consommationObjet_12_0= ruleCondition
                    {

                    						newCompositeNode(grammarAccess.getActionAccess().getConsommationObjetConditionParserRuleCall_10_1_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_consommationObjet_12_0=ruleCondition();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getActionRule());
                    						}
                    						set(
                    							current,
                    							"consommationObjet",
                    							lv_consommationObjet_12_0,
                    							"fr.n7.Game.Condition");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_13=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_13, grammarAccess.getActionAccess().getRightCurlyBracketKeyword_11());
            		

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
    // $ANTLR end "ruleAction"


    // $ANTLR start "entryRuleObjet"
    // InternalGame.g:1623:1: entryRuleObjet returns [EObject current=null] : iv_ruleObjet= ruleObjet EOF ;
    public final EObject entryRuleObjet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObjet = null;


        try {
            // InternalGame.g:1623:46: (iv_ruleObjet= ruleObjet EOF )
            // InternalGame.g:1624:2: iv_ruleObjet= ruleObjet EOF
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
    // InternalGame.g:1630:1: ruleObjet returns [EObject current=null] : (otherlv_0= 'objet' ( (lv_name_1_0= RULE_ID ) ) ( (lv_taille_2_0= RULE_INT ) ) ( (lv_quantite_3_0= RULE_INT ) ) (otherlv_4= 'transmission' ( (lv_conditionTransmission_5_0= ruleCondition ) )? )? (otherlv_6= 'consommation' ( (lv_conditionConsommation_7_0= ruleCondition ) )? )? (otherlv_8= 'description' ( (lv_description_9_0= RULE_STRING ) ) ( (lv_conditionDescription_10_0= ruleCondition ) )? )? (otherlv_11= 'transformable' ( (lv_transformable_12_0= ruleCondition ) )? )? ) ;
    public final EObject ruleObjet() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_taille_2_0=null;
        Token lv_quantite_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token lv_description_9_0=null;
        Token otherlv_11=null;
        EObject lv_conditionTransmission_5_0 = null;

        EObject lv_conditionConsommation_7_0 = null;

        EObject lv_conditionDescription_10_0 = null;

        EObject lv_transformable_12_0 = null;



        	enterRule();

        try {
            // InternalGame.g:1636:2: ( (otherlv_0= 'objet' ( (lv_name_1_0= RULE_ID ) ) ( (lv_taille_2_0= RULE_INT ) ) ( (lv_quantite_3_0= RULE_INT ) ) (otherlv_4= 'transmission' ( (lv_conditionTransmission_5_0= ruleCondition ) )? )? (otherlv_6= 'consommation' ( (lv_conditionConsommation_7_0= ruleCondition ) )? )? (otherlv_8= 'description' ( (lv_description_9_0= RULE_STRING ) ) ( (lv_conditionDescription_10_0= ruleCondition ) )? )? (otherlv_11= 'transformable' ( (lv_transformable_12_0= ruleCondition ) )? )? ) )
            // InternalGame.g:1637:2: (otherlv_0= 'objet' ( (lv_name_1_0= RULE_ID ) ) ( (lv_taille_2_0= RULE_INT ) ) ( (lv_quantite_3_0= RULE_INT ) ) (otherlv_4= 'transmission' ( (lv_conditionTransmission_5_0= ruleCondition ) )? )? (otherlv_6= 'consommation' ( (lv_conditionConsommation_7_0= ruleCondition ) )? )? (otherlv_8= 'description' ( (lv_description_9_0= RULE_STRING ) ) ( (lv_conditionDescription_10_0= ruleCondition ) )? )? (otherlv_11= 'transformable' ( (lv_transformable_12_0= ruleCondition ) )? )? )
            {
            // InternalGame.g:1637:2: (otherlv_0= 'objet' ( (lv_name_1_0= RULE_ID ) ) ( (lv_taille_2_0= RULE_INT ) ) ( (lv_quantite_3_0= RULE_INT ) ) (otherlv_4= 'transmission' ( (lv_conditionTransmission_5_0= ruleCondition ) )? )? (otherlv_6= 'consommation' ( (lv_conditionConsommation_7_0= ruleCondition ) )? )? (otherlv_8= 'description' ( (lv_description_9_0= RULE_STRING ) ) ( (lv_conditionDescription_10_0= ruleCondition ) )? )? (otherlv_11= 'transformable' ( (lv_transformable_12_0= ruleCondition ) )? )? )
            // InternalGame.g:1638:3: otherlv_0= 'objet' ( (lv_name_1_0= RULE_ID ) ) ( (lv_taille_2_0= RULE_INT ) ) ( (lv_quantite_3_0= RULE_INT ) ) (otherlv_4= 'transmission' ( (lv_conditionTransmission_5_0= ruleCondition ) )? )? (otherlv_6= 'consommation' ( (lv_conditionConsommation_7_0= ruleCondition ) )? )? (otherlv_8= 'description' ( (lv_description_9_0= RULE_STRING ) ) ( (lv_conditionDescription_10_0= ruleCondition ) )? )? (otherlv_11= 'transformable' ( (lv_transformable_12_0= ruleCondition ) )? )?
            {
            otherlv_0=(Token)match(input,37,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getObjetAccess().getObjetKeyword_0());
            		
            // InternalGame.g:1642:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalGame.g:1643:4: (lv_name_1_0= RULE_ID )
            {
            // InternalGame.g:1643:4: (lv_name_1_0= RULE_ID )
            // InternalGame.g:1644:5: lv_name_1_0= RULE_ID
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

            // InternalGame.g:1660:3: ( (lv_taille_2_0= RULE_INT ) )
            // InternalGame.g:1661:4: (lv_taille_2_0= RULE_INT )
            {
            // InternalGame.g:1661:4: (lv_taille_2_0= RULE_INT )
            // InternalGame.g:1662:5: lv_taille_2_0= RULE_INT
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

            // InternalGame.g:1678:3: ( (lv_quantite_3_0= RULE_INT ) )
            // InternalGame.g:1679:4: (lv_quantite_3_0= RULE_INT )
            {
            // InternalGame.g:1679:4: (lv_quantite_3_0= RULE_INT )
            // InternalGame.g:1680:5: lv_quantite_3_0= RULE_INT
            {
            lv_quantite_3_0=(Token)match(input,RULE_INT,FOLLOW_43); 

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

            // InternalGame.g:1696:3: (otherlv_4= 'transmission' ( (lv_conditionTransmission_5_0= ruleCondition ) )? )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==38) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalGame.g:1697:4: otherlv_4= 'transmission' ( (lv_conditionTransmission_5_0= ruleCondition ) )?
                    {
                    otherlv_4=(Token)match(input,38,FOLLOW_44); 

                    				newLeafNode(otherlv_4, grammarAccess.getObjetAccess().getTransmissionKeyword_4_0());
                    			
                    // InternalGame.g:1701:4: ( (lv_conditionTransmission_5_0= ruleCondition ) )?
                    int alt42=2;
                    int LA42_0 = input.LA(1);

                    if ( (LA42_0==44) ) {
                        alt42=1;
                    }
                    switch (alt42) {
                        case 1 :
                            // InternalGame.g:1702:5: (lv_conditionTransmission_5_0= ruleCondition )
                            {
                            // InternalGame.g:1702:5: (lv_conditionTransmission_5_0= ruleCondition )
                            // InternalGame.g:1703:6: lv_conditionTransmission_5_0= ruleCondition
                            {

                            						newCompositeNode(grammarAccess.getObjetAccess().getConditionTransmissionConditionParserRuleCall_4_1_0());
                            					
                            pushFollow(FOLLOW_45);
                            lv_conditionTransmission_5_0=ruleCondition();

                            state._fsp--;


                            						if (current==null) {
                            							current = createModelElementForParent(grammarAccess.getObjetRule());
                            						}
                            						set(
                            							current,
                            							"conditionTransmission",
                            							lv_conditionTransmission_5_0,
                            							"fr.n7.Game.Condition");
                            						afterParserOrEnumRuleCall();
                            					

                            }


                            }
                            break;

                    }


                    }
                    break;

            }

            // InternalGame.g:1721:3: (otherlv_6= 'consommation' ( (lv_conditionConsommation_7_0= ruleCondition ) )? )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==39) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalGame.g:1722:4: otherlv_6= 'consommation' ( (lv_conditionConsommation_7_0= ruleCondition ) )?
                    {
                    otherlv_6=(Token)match(input,39,FOLLOW_46); 

                    				newLeafNode(otherlv_6, grammarAccess.getObjetAccess().getConsommationKeyword_5_0());
                    			
                    // InternalGame.g:1726:4: ( (lv_conditionConsommation_7_0= ruleCondition ) )?
                    int alt44=2;
                    int LA44_0 = input.LA(1);

                    if ( (LA44_0==44) ) {
                        alt44=1;
                    }
                    switch (alt44) {
                        case 1 :
                            // InternalGame.g:1727:5: (lv_conditionConsommation_7_0= ruleCondition )
                            {
                            // InternalGame.g:1727:5: (lv_conditionConsommation_7_0= ruleCondition )
                            // InternalGame.g:1728:6: lv_conditionConsommation_7_0= ruleCondition
                            {

                            						newCompositeNode(grammarAccess.getObjetAccess().getConditionConsommationConditionParserRuleCall_5_1_0());
                            					
                            pushFollow(FOLLOW_47);
                            lv_conditionConsommation_7_0=ruleCondition();

                            state._fsp--;


                            						if (current==null) {
                            							current = createModelElementForParent(grammarAccess.getObjetRule());
                            						}
                            						set(
                            							current,
                            							"conditionConsommation",
                            							lv_conditionConsommation_7_0,
                            							"fr.n7.Game.Condition");
                            						afterParserOrEnumRuleCall();
                            					

                            }


                            }
                            break;

                    }


                    }
                    break;

            }

            // InternalGame.g:1746:3: (otherlv_8= 'description' ( (lv_description_9_0= RULE_STRING ) ) ( (lv_conditionDescription_10_0= ruleCondition ) )? )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==20) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalGame.g:1747:4: otherlv_8= 'description' ( (lv_description_9_0= RULE_STRING ) ) ( (lv_conditionDescription_10_0= ruleCondition ) )?
                    {
                    otherlv_8=(Token)match(input,20,FOLLOW_17); 

                    				newLeafNode(otherlv_8, grammarAccess.getObjetAccess().getDescriptionKeyword_6_0());
                    			
                    // InternalGame.g:1751:4: ( (lv_description_9_0= RULE_STRING ) )
                    // InternalGame.g:1752:5: (lv_description_9_0= RULE_STRING )
                    {
                    // InternalGame.g:1752:5: (lv_description_9_0= RULE_STRING )
                    // InternalGame.g:1753:6: lv_description_9_0= RULE_STRING
                    {
                    lv_description_9_0=(Token)match(input,RULE_STRING,FOLLOW_48); 

                    						newLeafNode(lv_description_9_0, grammarAccess.getObjetAccess().getDescriptionSTRINGTerminalRuleCall_6_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getObjetRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"description",
                    							lv_description_9_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }

                    // InternalGame.g:1769:4: ( (lv_conditionDescription_10_0= ruleCondition ) )?
                    int alt46=2;
                    int LA46_0 = input.LA(1);

                    if ( (LA46_0==44) ) {
                        alt46=1;
                    }
                    switch (alt46) {
                        case 1 :
                            // InternalGame.g:1770:5: (lv_conditionDescription_10_0= ruleCondition )
                            {
                            // InternalGame.g:1770:5: (lv_conditionDescription_10_0= ruleCondition )
                            // InternalGame.g:1771:6: lv_conditionDescription_10_0= ruleCondition
                            {

                            						newCompositeNode(grammarAccess.getObjetAccess().getConditionDescriptionConditionParserRuleCall_6_2_0());
                            					
                            pushFollow(FOLLOW_49);
                            lv_conditionDescription_10_0=ruleCondition();

                            state._fsp--;


                            						if (current==null) {
                            							current = createModelElementForParent(grammarAccess.getObjetRule());
                            						}
                            						set(
                            							current,
                            							"conditionDescription",
                            							lv_conditionDescription_10_0,
                            							"fr.n7.Game.Condition");
                            						afterParserOrEnumRuleCall();
                            					

                            }


                            }
                            break;

                    }


                    }
                    break;

            }

            // InternalGame.g:1789:3: (otherlv_11= 'transformable' ( (lv_transformable_12_0= ruleCondition ) )? )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==40) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalGame.g:1790:4: otherlv_11= 'transformable' ( (lv_transformable_12_0= ruleCondition ) )?
                    {
                    otherlv_11=(Token)match(input,40,FOLLOW_50); 

                    				newLeafNode(otherlv_11, grammarAccess.getObjetAccess().getTransformableKeyword_7_0());
                    			
                    // InternalGame.g:1794:4: ( (lv_transformable_12_0= ruleCondition ) )?
                    int alt48=2;
                    int LA48_0 = input.LA(1);

                    if ( (LA48_0==44) ) {
                        alt48=1;
                    }
                    switch (alt48) {
                        case 1 :
                            // InternalGame.g:1795:5: (lv_transformable_12_0= ruleCondition )
                            {
                            // InternalGame.g:1795:5: (lv_transformable_12_0= ruleCondition )
                            // InternalGame.g:1796:6: lv_transformable_12_0= ruleCondition
                            {

                            						newCompositeNode(grammarAccess.getObjetAccess().getTransformableConditionParserRuleCall_7_1_0());
                            					
                            pushFollow(FOLLOW_2);
                            lv_transformable_12_0=ruleCondition();

                            state._fsp--;


                            						if (current==null) {
                            							current = createModelElementForParent(grammarAccess.getObjetRule());
                            						}
                            						set(
                            							current,
                            							"transformable",
                            							lv_transformable_12_0,
                            							"fr.n7.Game.Condition");
                            						afterParserOrEnumRuleCall();
                            					

                            }


                            }
                            break;

                    }


                    }
                    break;

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
    // InternalGame.g:1818:1: entryRuleObjets returns [EObject current=null] : iv_ruleObjets= ruleObjets EOF ;
    public final EObject entryRuleObjets() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObjets = null;


        try {
            // InternalGame.g:1818:47: (iv_ruleObjets= ruleObjets EOF )
            // InternalGame.g:1819:2: iv_ruleObjets= ruleObjets EOF
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
    // InternalGame.g:1825:1: ruleObjets returns [EObject current=null] : (otherlv_0= 'objets' otherlv_1= '{' ( (lv_listeObjets_2_0= ruleObjet ) )* otherlv_3= '}' ) ;
    public final EObject ruleObjets() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_listeObjets_2_0 = null;



        	enterRule();

        try {
            // InternalGame.g:1831:2: ( (otherlv_0= 'objets' otherlv_1= '{' ( (lv_listeObjets_2_0= ruleObjet ) )* otherlv_3= '}' ) )
            // InternalGame.g:1832:2: (otherlv_0= 'objets' otherlv_1= '{' ( (lv_listeObjets_2_0= ruleObjet ) )* otherlv_3= '}' )
            {
            // InternalGame.g:1832:2: (otherlv_0= 'objets' otherlv_1= '{' ( (lv_listeObjets_2_0= ruleObjet ) )* otherlv_3= '}' )
            // InternalGame.g:1833:3: otherlv_0= 'objets' otherlv_1= '{' ( (lv_listeObjets_2_0= ruleObjet ) )* otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,41,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getObjetsAccess().getObjetsKeyword_0());
            		
            otherlv_1=(Token)match(input,14,FOLLOW_15); 

            			newLeafNode(otherlv_1, grammarAccess.getObjetsAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalGame.g:1841:3: ( (lv_listeObjets_2_0= ruleObjet ) )*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( (LA50_0==37) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // InternalGame.g:1842:4: (lv_listeObjets_2_0= ruleObjet )
            	    {
            	    // InternalGame.g:1842:4: (lv_listeObjets_2_0= ruleObjet )
            	    // InternalGame.g:1843:5: lv_listeObjets_2_0= ruleObjet
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
            	    break loop50;
                }
            } while (true);

            otherlv_3=(Token)match(input,15,FOLLOW_2); 

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
    // InternalGame.g:1868:1: entryRuleConnaissances returns [EObject current=null] : iv_ruleConnaissances= ruleConnaissances EOF ;
    public final EObject entryRuleConnaissances() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConnaissances = null;


        try {
            // InternalGame.g:1868:54: (iv_ruleConnaissances= ruleConnaissances EOF )
            // InternalGame.g:1869:2: iv_ruleConnaissances= ruleConnaissances EOF
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
    // InternalGame.g:1875:1: ruleConnaissances returns [EObject current=null] : (otherlv_0= 'connaissances' otherlv_1= '{' ( (lv_listeConnaissances_2_0= ruleConnaissance ) )* otherlv_3= '}' ) ;
    public final EObject ruleConnaissances() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_listeConnaissances_2_0 = null;



        	enterRule();

        try {
            // InternalGame.g:1881:2: ( (otherlv_0= 'connaissances' otherlv_1= '{' ( (lv_listeConnaissances_2_0= ruleConnaissance ) )* otherlv_3= '}' ) )
            // InternalGame.g:1882:2: (otherlv_0= 'connaissances' otherlv_1= '{' ( (lv_listeConnaissances_2_0= ruleConnaissance ) )* otherlv_3= '}' )
            {
            // InternalGame.g:1882:2: (otherlv_0= 'connaissances' otherlv_1= '{' ( (lv_listeConnaissances_2_0= ruleConnaissance ) )* otherlv_3= '}' )
            // InternalGame.g:1883:3: otherlv_0= 'connaissances' otherlv_1= '{' ( (lv_listeConnaissances_2_0= ruleConnaissance ) )* otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,42,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getConnaissancesAccess().getConnaissancesKeyword_0());
            		
            otherlv_1=(Token)match(input,14,FOLLOW_51); 

            			newLeafNode(otherlv_1, grammarAccess.getConnaissancesAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalGame.g:1891:3: ( (lv_listeConnaissances_2_0= ruleConnaissance ) )*
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( (LA51_0==43) ) {
                    alt51=1;
                }


                switch (alt51) {
            	case 1 :
            	    // InternalGame.g:1892:4: (lv_listeConnaissances_2_0= ruleConnaissance )
            	    {
            	    // InternalGame.g:1892:4: (lv_listeConnaissances_2_0= ruleConnaissance )
            	    // InternalGame.g:1893:5: lv_listeConnaissances_2_0= ruleConnaissance
            	    {

            	    					newCompositeNode(grammarAccess.getConnaissancesAccess().getListeConnaissancesConnaissanceParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_51);
            	    lv_listeConnaissances_2_0=ruleConnaissance();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getConnaissancesRule());
            	    					}
            	    					add(
            	    						current,
            	    						"listeConnaissances",
            	    						lv_listeConnaissances_2_0,
            	    						"fr.n7.Game.Connaissance");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop51;
                }
            } while (true);

            otherlv_3=(Token)match(input,15,FOLLOW_2); 

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
    // InternalGame.g:1918:1: entryRuleConnaissance returns [EObject current=null] : iv_ruleConnaissance= ruleConnaissance EOF ;
    public final EObject entryRuleConnaissance() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConnaissance = null;


        try {
            // InternalGame.g:1918:53: (iv_ruleConnaissance= ruleConnaissance EOF )
            // InternalGame.g:1919:2: iv_ruleConnaissance= ruleConnaissance EOF
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
    // InternalGame.g:1925:1: ruleConnaissance returns [EObject current=null] : (otherlv_0= 'connaissance' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'description' ( (lv_description_3_0= RULE_STRING ) ) ( (lv_conditionConnaissance_4_0= ruleCondition ) )? )? ) ;
    public final EObject ruleConnaissance() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_description_3_0=null;
        EObject lv_conditionConnaissance_4_0 = null;



        	enterRule();

        try {
            // InternalGame.g:1931:2: ( (otherlv_0= 'connaissance' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'description' ( (lv_description_3_0= RULE_STRING ) ) ( (lv_conditionConnaissance_4_0= ruleCondition ) )? )? ) )
            // InternalGame.g:1932:2: (otherlv_0= 'connaissance' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'description' ( (lv_description_3_0= RULE_STRING ) ) ( (lv_conditionConnaissance_4_0= ruleCondition ) )? )? )
            {
            // InternalGame.g:1932:2: (otherlv_0= 'connaissance' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'description' ( (lv_description_3_0= RULE_STRING ) ) ( (lv_conditionConnaissance_4_0= ruleCondition ) )? )? )
            // InternalGame.g:1933:3: otherlv_0= 'connaissance' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'description' ( (lv_description_3_0= RULE_STRING ) ) ( (lv_conditionConnaissance_4_0= ruleCondition ) )? )?
            {
            otherlv_0=(Token)match(input,43,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getConnaissanceAccess().getConnaissanceKeyword_0());
            		
            // InternalGame.g:1937:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalGame.g:1938:4: (lv_name_1_0= RULE_ID )
            {
            // InternalGame.g:1938:4: (lv_name_1_0= RULE_ID )
            // InternalGame.g:1939:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_52); 

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

            // InternalGame.g:1955:3: (otherlv_2= 'description' ( (lv_description_3_0= RULE_STRING ) ) ( (lv_conditionConnaissance_4_0= ruleCondition ) )? )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==20) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // InternalGame.g:1956:4: otherlv_2= 'description' ( (lv_description_3_0= RULE_STRING ) ) ( (lv_conditionConnaissance_4_0= ruleCondition ) )?
                    {
                    otherlv_2=(Token)match(input,20,FOLLOW_17); 

                    				newLeafNode(otherlv_2, grammarAccess.getConnaissanceAccess().getDescriptionKeyword_2_0());
                    			
                    // InternalGame.g:1960:4: ( (lv_description_3_0= RULE_STRING ) )
                    // InternalGame.g:1961:5: (lv_description_3_0= RULE_STRING )
                    {
                    // InternalGame.g:1961:5: (lv_description_3_0= RULE_STRING )
                    // InternalGame.g:1962:6: lv_description_3_0= RULE_STRING
                    {
                    lv_description_3_0=(Token)match(input,RULE_STRING,FOLLOW_50); 

                    						newLeafNode(lv_description_3_0, grammarAccess.getConnaissanceAccess().getDescriptionSTRINGTerminalRuleCall_2_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getConnaissanceRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"description",
                    							lv_description_3_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }

                    // InternalGame.g:1978:4: ( (lv_conditionConnaissance_4_0= ruleCondition ) )?
                    int alt52=2;
                    int LA52_0 = input.LA(1);

                    if ( (LA52_0==44) ) {
                        alt52=1;
                    }
                    switch (alt52) {
                        case 1 :
                            // InternalGame.g:1979:5: (lv_conditionConnaissance_4_0= ruleCondition )
                            {
                            // InternalGame.g:1979:5: (lv_conditionConnaissance_4_0= ruleCondition )
                            // InternalGame.g:1980:6: lv_conditionConnaissance_4_0= ruleCondition
                            {

                            						newCompositeNode(grammarAccess.getConnaissanceAccess().getConditionConnaissanceConditionParserRuleCall_2_2_0());
                            					
                            pushFollow(FOLLOW_2);
                            lv_conditionConnaissance_4_0=ruleCondition();

                            state._fsp--;


                            						if (current==null) {
                            							current = createModelElementForParent(grammarAccess.getConnaissanceRule());
                            						}
                            						set(
                            							current,
                            							"conditionConnaissance",
                            							lv_conditionConnaissance_4_0,
                            							"fr.n7.Game.Condition");
                            						afterParserOrEnumRuleCall();
                            					

                            }


                            }
                            break;

                    }


                    }
                    break;

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


    // $ANTLR start "entryRuleCondition"
    // InternalGame.g:2002:1: entryRuleCondition returns [EObject current=null] : iv_ruleCondition= ruleCondition EOF ;
    public final EObject entryRuleCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCondition = null;


        try {
            // InternalGame.g:2002:50: (iv_ruleCondition= ruleCondition EOF )
            // InternalGame.g:2003:2: iv_ruleCondition= ruleCondition EOF
            {
             newCompositeNode(grammarAccess.getConditionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCondition=ruleCondition();

            state._fsp--;

             current =iv_ruleCondition; 
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
    // $ANTLR end "entryRuleCondition"


    // $ANTLR start "ruleCondition"
    // InternalGame.g:2009:1: ruleCondition returns [EObject current=null] : (otherlv_0= 'condition' ( (lv_name_1_0= RULE_ID ) ) ( (lv_condition_2_0= RULE_COND ) ) ) ;
    public final EObject ruleCondition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_condition_2_0=null;


        	enterRule();

        try {
            // InternalGame.g:2015:2: ( (otherlv_0= 'condition' ( (lv_name_1_0= RULE_ID ) ) ( (lv_condition_2_0= RULE_COND ) ) ) )
            // InternalGame.g:2016:2: (otherlv_0= 'condition' ( (lv_name_1_0= RULE_ID ) ) ( (lv_condition_2_0= RULE_COND ) ) )
            {
            // InternalGame.g:2016:2: (otherlv_0= 'condition' ( (lv_name_1_0= RULE_ID ) ) ( (lv_condition_2_0= RULE_COND ) ) )
            // InternalGame.g:2017:3: otherlv_0= 'condition' ( (lv_name_1_0= RULE_ID ) ) ( (lv_condition_2_0= RULE_COND ) )
            {
            otherlv_0=(Token)match(input,44,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getConditionAccess().getConditionKeyword_0());
            		
            // InternalGame.g:2021:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalGame.g:2022:4: (lv_name_1_0= RULE_ID )
            {
            // InternalGame.g:2022:4: (lv_name_1_0= RULE_ID )
            // InternalGame.g:2023:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_53); 

            					newLeafNode(lv_name_1_0, grammarAccess.getConditionAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConditionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalGame.g:2039:3: ( (lv_condition_2_0= RULE_COND ) )
            // InternalGame.g:2040:4: (lv_condition_2_0= RULE_COND )
            {
            // InternalGame.g:2040:4: (lv_condition_2_0= RULE_COND )
            // InternalGame.g:2041:5: lv_condition_2_0= RULE_COND
            {
            lv_condition_2_0=(Token)match(input,RULE_COND,FOLLOW_2); 

            					newLeafNode(lv_condition_2_0, grammarAccess.getConditionAccess().getConditionCONDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConditionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"condition",
            						lv_condition_2_0,
            						"fr.n7.Game.COND");
            				

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
    // $ANTLR end "ruleCondition"


    // $ANTLR start "entryRuleChemin"
    // InternalGame.g:2061:1: entryRuleChemin returns [EObject current=null] : iv_ruleChemin= ruleChemin EOF ;
    public final EObject entryRuleChemin() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChemin = null;


        try {
            // InternalGame.g:2061:47: (iv_ruleChemin= ruleChemin EOF )
            // InternalGame.g:2062:2: iv_ruleChemin= ruleChemin EOF
            {
             newCompositeNode(grammarAccess.getCheminRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleChemin=ruleChemin();

            state._fsp--;

             current =iv_ruleChemin; 
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
    // $ANTLR end "entryRuleChemin"


    // $ANTLR start "ruleChemin"
    // InternalGame.g:2068:1: ruleChemin returns [EObject current=null] : ( (otherlv_0= 'chemin' otherlv_1= 'description' ( (lv_description_2_0= RULE_STRING ) ) ( (lv_conditionDescription_3_0= ruleCondition ) )? otherlv_4= 'destination' ( (lv_destination_5_0= ruleLieu ) ) ) | this_LieuDebut_6= ruleLieuDebut | (this_LieuFin_7= ruleLieuFin (otherlv_8= 'obligatoire' ( (lv_obligatoire_9_0= ruleCondition ) ) )? (otherlv_10= 'visible' ( (lv_visible_11_0= ruleCondition ) ) )? (otherlv_12= 'ouvert' ( (lv_ouvert_13_0= ruleCondition ) ) )? ( (lv_listeConnaissances_14_0= ruleConnaissance ) )* ( (lv_listeObjets_15_0= ruleObjet ) )* ) ) ;
    public final EObject ruleChemin() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_description_2_0=null;
        Token otherlv_4=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        EObject lv_conditionDescription_3_0 = null;

        EObject lv_destination_5_0 = null;

        EObject this_LieuDebut_6 = null;

        EObject this_LieuFin_7 = null;

        EObject lv_obligatoire_9_0 = null;

        EObject lv_visible_11_0 = null;

        EObject lv_ouvert_13_0 = null;

        EObject lv_listeConnaissances_14_0 = null;

        EObject lv_listeObjets_15_0 = null;



        	enterRule();

        try {
            // InternalGame.g:2074:2: ( ( (otherlv_0= 'chemin' otherlv_1= 'description' ( (lv_description_2_0= RULE_STRING ) ) ( (lv_conditionDescription_3_0= ruleCondition ) )? otherlv_4= 'destination' ( (lv_destination_5_0= ruleLieu ) ) ) | this_LieuDebut_6= ruleLieuDebut | (this_LieuFin_7= ruleLieuFin (otherlv_8= 'obligatoire' ( (lv_obligatoire_9_0= ruleCondition ) ) )? (otherlv_10= 'visible' ( (lv_visible_11_0= ruleCondition ) ) )? (otherlv_12= 'ouvert' ( (lv_ouvert_13_0= ruleCondition ) ) )? ( (lv_listeConnaissances_14_0= ruleConnaissance ) )* ( (lv_listeObjets_15_0= ruleObjet ) )* ) ) )
            // InternalGame.g:2075:2: ( (otherlv_0= 'chemin' otherlv_1= 'description' ( (lv_description_2_0= RULE_STRING ) ) ( (lv_conditionDescription_3_0= ruleCondition ) )? otherlv_4= 'destination' ( (lv_destination_5_0= ruleLieu ) ) ) | this_LieuDebut_6= ruleLieuDebut | (this_LieuFin_7= ruleLieuFin (otherlv_8= 'obligatoire' ( (lv_obligatoire_9_0= ruleCondition ) ) )? (otherlv_10= 'visible' ( (lv_visible_11_0= ruleCondition ) ) )? (otherlv_12= 'ouvert' ( (lv_ouvert_13_0= ruleCondition ) ) )? ( (lv_listeConnaissances_14_0= ruleConnaissance ) )* ( (lv_listeObjets_15_0= ruleObjet ) )* ) )
            {
            // InternalGame.g:2075:2: ( (otherlv_0= 'chemin' otherlv_1= 'description' ( (lv_description_2_0= RULE_STRING ) ) ( (lv_conditionDescription_3_0= ruleCondition ) )? otherlv_4= 'destination' ( (lv_destination_5_0= ruleLieu ) ) ) | this_LieuDebut_6= ruleLieuDebut | (this_LieuFin_7= ruleLieuFin (otherlv_8= 'obligatoire' ( (lv_obligatoire_9_0= ruleCondition ) ) )? (otherlv_10= 'visible' ( (lv_visible_11_0= ruleCondition ) ) )? (otherlv_12= 'ouvert' ( (lv_ouvert_13_0= ruleCondition ) ) )? ( (lv_listeConnaissances_14_0= ruleConnaissance ) )* ( (lv_listeObjets_15_0= ruleObjet ) )* ) )
            int alt60=3;
            switch ( input.LA(1) ) {
            case 45:
                {
                alt60=1;
                }
                break;
            case 22:
                {
                alt60=2;
                }
                break;
            case 23:
                {
                alt60=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 60, 0, input);

                throw nvae;
            }

            switch (alt60) {
                case 1 :
                    // InternalGame.g:2076:3: (otherlv_0= 'chemin' otherlv_1= 'description' ( (lv_description_2_0= RULE_STRING ) ) ( (lv_conditionDescription_3_0= ruleCondition ) )? otherlv_4= 'destination' ( (lv_destination_5_0= ruleLieu ) ) )
                    {
                    // InternalGame.g:2076:3: (otherlv_0= 'chemin' otherlv_1= 'description' ( (lv_description_2_0= RULE_STRING ) ) ( (lv_conditionDescription_3_0= ruleCondition ) )? otherlv_4= 'destination' ( (lv_destination_5_0= ruleLieu ) ) )
                    // InternalGame.g:2077:4: otherlv_0= 'chemin' otherlv_1= 'description' ( (lv_description_2_0= RULE_STRING ) ) ( (lv_conditionDescription_3_0= ruleCondition ) )? otherlv_4= 'destination' ( (lv_destination_5_0= ruleLieu ) )
                    {
                    otherlv_0=(Token)match(input,45,FOLLOW_54); 

                    				newLeafNode(otherlv_0, grammarAccess.getCheminAccess().getCheminKeyword_0_0());
                    			
                    otherlv_1=(Token)match(input,20,FOLLOW_17); 

                    				newLeafNode(otherlv_1, grammarAccess.getCheminAccess().getDescriptionKeyword_0_1());
                    			
                    // InternalGame.g:2085:4: ( (lv_description_2_0= RULE_STRING ) )
                    // InternalGame.g:2086:5: (lv_description_2_0= RULE_STRING )
                    {
                    // InternalGame.g:2086:5: (lv_description_2_0= RULE_STRING )
                    // InternalGame.g:2087:6: lv_description_2_0= RULE_STRING
                    {
                    lv_description_2_0=(Token)match(input,RULE_STRING,FOLLOW_55); 

                    						newLeafNode(lv_description_2_0, grammarAccess.getCheminAccess().getDescriptionSTRINGTerminalRuleCall_0_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getCheminRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"description",
                    							lv_description_2_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }

                    // InternalGame.g:2103:4: ( (lv_conditionDescription_3_0= ruleCondition ) )?
                    int alt54=2;
                    int LA54_0 = input.LA(1);

                    if ( (LA54_0==44) ) {
                        alt54=1;
                    }
                    switch (alt54) {
                        case 1 :
                            // InternalGame.g:2104:5: (lv_conditionDescription_3_0= ruleCondition )
                            {
                            // InternalGame.g:2104:5: (lv_conditionDescription_3_0= ruleCondition )
                            // InternalGame.g:2105:6: lv_conditionDescription_3_0= ruleCondition
                            {

                            						newCompositeNode(grammarAccess.getCheminAccess().getConditionDescriptionConditionParserRuleCall_0_3_0());
                            					
                            pushFollow(FOLLOW_56);
                            lv_conditionDescription_3_0=ruleCondition();

                            state._fsp--;


                            						if (current==null) {
                            							current = createModelElementForParent(grammarAccess.getCheminRule());
                            						}
                            						set(
                            							current,
                            							"conditionDescription",
                            							lv_conditionDescription_3_0,
                            							"fr.n7.Game.Condition");
                            						afterParserOrEnumRuleCall();
                            					

                            }


                            }
                            break;

                    }

                    otherlv_4=(Token)match(input,46,FOLLOW_57); 

                    				newLeafNode(otherlv_4, grammarAccess.getCheminAccess().getDestinationKeyword_0_4());
                    			
                    // InternalGame.g:2126:4: ( (lv_destination_5_0= ruleLieu ) )
                    // InternalGame.g:2127:5: (lv_destination_5_0= ruleLieu )
                    {
                    // InternalGame.g:2127:5: (lv_destination_5_0= ruleLieu )
                    // InternalGame.g:2128:6: lv_destination_5_0= ruleLieu
                    {

                    						newCompositeNode(grammarAccess.getCheminAccess().getDestinationLieuParserRuleCall_0_5_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_destination_5_0=ruleLieu();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCheminRule());
                    						}
                    						set(
                    							current,
                    							"destination",
                    							lv_destination_5_0,
                    							"fr.n7.Game.Lieu");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalGame.g:2147:3: this_LieuDebut_6= ruleLieuDebut
                    {

                    			newCompositeNode(grammarAccess.getCheminAccess().getLieuDebutParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_LieuDebut_6=ruleLieuDebut();

                    state._fsp--;


                    			current = this_LieuDebut_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalGame.g:2156:3: (this_LieuFin_7= ruleLieuFin (otherlv_8= 'obligatoire' ( (lv_obligatoire_9_0= ruleCondition ) ) )? (otherlv_10= 'visible' ( (lv_visible_11_0= ruleCondition ) ) )? (otherlv_12= 'ouvert' ( (lv_ouvert_13_0= ruleCondition ) ) )? ( (lv_listeConnaissances_14_0= ruleConnaissance ) )* ( (lv_listeObjets_15_0= ruleObjet ) )* )
                    {
                    // InternalGame.g:2156:3: (this_LieuFin_7= ruleLieuFin (otherlv_8= 'obligatoire' ( (lv_obligatoire_9_0= ruleCondition ) ) )? (otherlv_10= 'visible' ( (lv_visible_11_0= ruleCondition ) ) )? (otherlv_12= 'ouvert' ( (lv_ouvert_13_0= ruleCondition ) ) )? ( (lv_listeConnaissances_14_0= ruleConnaissance ) )* ( (lv_listeObjets_15_0= ruleObjet ) )* )
                    // InternalGame.g:2157:4: this_LieuFin_7= ruleLieuFin (otherlv_8= 'obligatoire' ( (lv_obligatoire_9_0= ruleCondition ) ) )? (otherlv_10= 'visible' ( (lv_visible_11_0= ruleCondition ) ) )? (otherlv_12= 'ouvert' ( (lv_ouvert_13_0= ruleCondition ) ) )? ( (lv_listeConnaissances_14_0= ruleConnaissance ) )* ( (lv_listeObjets_15_0= ruleObjet ) )*
                    {

                    				newCompositeNode(grammarAccess.getCheminAccess().getLieuFinParserRuleCall_2_0());
                    			
                    pushFollow(FOLLOW_58);
                    this_LieuFin_7=ruleLieuFin();

                    state._fsp--;


                    				current = this_LieuFin_7;
                    				afterParserOrEnumRuleCall();
                    			
                    // InternalGame.g:2165:4: (otherlv_8= 'obligatoire' ( (lv_obligatoire_9_0= ruleCondition ) ) )?
                    int alt55=2;
                    int LA55_0 = input.LA(1);

                    if ( (LA55_0==27) ) {
                        alt55=1;
                    }
                    switch (alt55) {
                        case 1 :
                            // InternalGame.g:2166:5: otherlv_8= 'obligatoire' ( (lv_obligatoire_9_0= ruleCondition ) )
                            {
                            otherlv_8=(Token)match(input,27,FOLLOW_34); 

                            					newLeafNode(otherlv_8, grammarAccess.getCheminAccess().getObligatoireKeyword_2_1_0());
                            				
                            // InternalGame.g:2170:5: ( (lv_obligatoire_9_0= ruleCondition ) )
                            // InternalGame.g:2171:6: (lv_obligatoire_9_0= ruleCondition )
                            {
                            // InternalGame.g:2171:6: (lv_obligatoire_9_0= ruleCondition )
                            // InternalGame.g:2172:7: lv_obligatoire_9_0= ruleCondition
                            {

                            							newCompositeNode(grammarAccess.getCheminAccess().getObligatoireConditionParserRuleCall_2_1_1_0());
                            						
                            pushFollow(FOLLOW_59);
                            lv_obligatoire_9_0=ruleCondition();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getCheminRule());
                            							}
                            							set(
                            								current,
                            								"obligatoire",
                            								lv_obligatoire_9_0,
                            								"fr.n7.Game.Condition");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }


                            }
                            break;

                    }

                    // InternalGame.g:2190:4: (otherlv_10= 'visible' ( (lv_visible_11_0= ruleCondition ) ) )?
                    int alt56=2;
                    int LA56_0 = input.LA(1);

                    if ( (LA56_0==26) ) {
                        alt56=1;
                    }
                    switch (alt56) {
                        case 1 :
                            // InternalGame.g:2191:5: otherlv_10= 'visible' ( (lv_visible_11_0= ruleCondition ) )
                            {
                            otherlv_10=(Token)match(input,26,FOLLOW_34); 

                            					newLeafNode(otherlv_10, grammarAccess.getCheminAccess().getVisibleKeyword_2_2_0());
                            				
                            // InternalGame.g:2195:5: ( (lv_visible_11_0= ruleCondition ) )
                            // InternalGame.g:2196:6: (lv_visible_11_0= ruleCondition )
                            {
                            // InternalGame.g:2196:6: (lv_visible_11_0= ruleCondition )
                            // InternalGame.g:2197:7: lv_visible_11_0= ruleCondition
                            {

                            							newCompositeNode(grammarAccess.getCheminAccess().getVisibleConditionParserRuleCall_2_2_1_0());
                            						
                            pushFollow(FOLLOW_60);
                            lv_visible_11_0=ruleCondition();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getCheminRule());
                            							}
                            							set(
                            								current,
                            								"visible",
                            								lv_visible_11_0,
                            								"fr.n7.Game.Condition");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }


                            }
                            break;

                    }

                    // InternalGame.g:2215:4: (otherlv_12= 'ouvert' ( (lv_ouvert_13_0= ruleCondition ) ) )?
                    int alt57=2;
                    int LA57_0 = input.LA(1);

                    if ( (LA57_0==47) ) {
                        alt57=1;
                    }
                    switch (alt57) {
                        case 1 :
                            // InternalGame.g:2216:5: otherlv_12= 'ouvert' ( (lv_ouvert_13_0= ruleCondition ) )
                            {
                            otherlv_12=(Token)match(input,47,FOLLOW_34); 

                            					newLeafNode(otherlv_12, grammarAccess.getCheminAccess().getOuvertKeyword_2_3_0());
                            				
                            // InternalGame.g:2220:5: ( (lv_ouvert_13_0= ruleCondition ) )
                            // InternalGame.g:2221:6: (lv_ouvert_13_0= ruleCondition )
                            {
                            // InternalGame.g:2221:6: (lv_ouvert_13_0= ruleCondition )
                            // InternalGame.g:2222:7: lv_ouvert_13_0= ruleCondition
                            {

                            							newCompositeNode(grammarAccess.getCheminAccess().getOuvertConditionParserRuleCall_2_3_1_0());
                            						
                            pushFollow(FOLLOW_61);
                            lv_ouvert_13_0=ruleCondition();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getCheminRule());
                            							}
                            							set(
                            								current,
                            								"ouvert",
                            								lv_ouvert_13_0,
                            								"fr.n7.Game.Condition");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }


                            }
                            break;

                    }

                    // InternalGame.g:2240:4: ( (lv_listeConnaissances_14_0= ruleConnaissance ) )*
                    loop58:
                    do {
                        int alt58=2;
                        int LA58_0 = input.LA(1);

                        if ( (LA58_0==43) ) {
                            alt58=1;
                        }


                        switch (alt58) {
                    	case 1 :
                    	    // InternalGame.g:2241:5: (lv_listeConnaissances_14_0= ruleConnaissance )
                    	    {
                    	    // InternalGame.g:2241:5: (lv_listeConnaissances_14_0= ruleConnaissance )
                    	    // InternalGame.g:2242:6: lv_listeConnaissances_14_0= ruleConnaissance
                    	    {

                    	    						newCompositeNode(grammarAccess.getCheminAccess().getListeConnaissancesConnaissanceParserRuleCall_2_4_0());
                    	    					
                    	    pushFollow(FOLLOW_61);
                    	    lv_listeConnaissances_14_0=ruleConnaissance();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getCheminRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"listeConnaissances",
                    	    							lv_listeConnaissances_14_0,
                    	    							"fr.n7.Game.Connaissance");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop58;
                        }
                    } while (true);

                    // InternalGame.g:2259:4: ( (lv_listeObjets_15_0= ruleObjet ) )*
                    loop59:
                    do {
                        int alt59=2;
                        int LA59_0 = input.LA(1);

                        if ( (LA59_0==37) ) {
                            alt59=1;
                        }


                        switch (alt59) {
                    	case 1 :
                    	    // InternalGame.g:2260:5: (lv_listeObjets_15_0= ruleObjet )
                    	    {
                    	    // InternalGame.g:2260:5: (lv_listeObjets_15_0= ruleObjet )
                    	    // InternalGame.g:2261:6: lv_listeObjets_15_0= ruleObjet
                    	    {

                    	    						newCompositeNode(grammarAccess.getCheminAccess().getListeObjetsObjetParserRuleCall_2_5_0());
                    	    					
                    	    pushFollow(FOLLOW_62);
                    	    lv_listeObjets_15_0=ruleObjet();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getCheminRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"listeObjets",
                    	    							lv_listeObjets_15_0,
                    	    							"fr.n7.Game.Objet");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop59;
                        }
                    } while (true);


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
    // $ANTLR end "ruleChemin"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000888000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000088000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000040000088000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000002000008000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000060001300000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000160001200000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000060001200000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000060000200000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000020000200000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000300000C00000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000300000C08000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000100000008000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000002008000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x000000001C000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000040008000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000380008000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000100008040L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000100008000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000000008040L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000182440000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000082440000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000082400000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000002400000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000003800008000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000003000008000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x000001C000100002L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000118000100002L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000018000100002L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000110000100002L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000010000100002L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000110000000002L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000080000008000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000500000000000L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x000088200C000002L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0000882004000002L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0000882000000002L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0000082000000002L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0000002000000002L});

}