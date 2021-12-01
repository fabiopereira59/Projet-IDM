package fr.n7.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_BOOL", "RULE_COND", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'territoire'", "'{'", "'}'", "'explorateur'", "'connaissances'", "'position'", "'sac'", "'description'", "'depotO'", "'personnes'", "'personne'", "'visible'", "'obligatoire'", "'interaction'", "'texte'", "'choix'", "'choixdebut'", "'choixfin'", "'action'", "'attributionC'", "'attributionO'", "'consommationO'", "'transformable'", "'transmission'", "'consommation'", "'objetsE'", "'objetsL'", "'condition'", "'chemins'", "'chemin'", "'destination'", "'ouvert'", "'debut'", "'fin'", "'intermediaire'"
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
    // InternalGame.g:65:1: entryRuleGame returns [EObject current=null] : iv_ruleGame= ruleGame EOF ;
    public final EObject entryRuleGame() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGame = null;


        try {
            // InternalGame.g:65:45: (iv_ruleGame= ruleGame EOF )
            // InternalGame.g:66:2: iv_ruleGame= ruleGame EOF
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
    // InternalGame.g:72:1: ruleGame returns [EObject current=null] : (otherlv_0= 'territoire' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_territoireElements_3_0= ruleterritoireElement ) )+ otherlv_4= '}' ) ;
    public final EObject ruleGame() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_territoireElements_3_0 = null;



        	enterRule();

        try {
            // InternalGame.g:78:2: ( (otherlv_0= 'territoire' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_territoireElements_3_0= ruleterritoireElement ) )+ otherlv_4= '}' ) )
            // InternalGame.g:79:2: (otherlv_0= 'territoire' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_territoireElements_3_0= ruleterritoireElement ) )+ otherlv_4= '}' )
            {
            // InternalGame.g:79:2: (otherlv_0= 'territoire' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_territoireElements_3_0= ruleterritoireElement ) )+ otherlv_4= '}' )
            // InternalGame.g:80:3: otherlv_0= 'territoire' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_territoireElements_3_0= ruleterritoireElement ) )+ otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getGameAccess().getTerritoireKeyword_0());
            		
            // InternalGame.g:84:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalGame.g:85:4: (lv_name_1_0= RULE_ID )
            {
            // InternalGame.g:85:4: (lv_name_1_0= RULE_ID )
            // InternalGame.g:86:5: lv_name_1_0= RULE_ID
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
            		
            // InternalGame.g:106:3: ( (lv_territoireElements_3_0= ruleterritoireElement ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=16 && LA1_0<=17)||LA1_0==22||(LA1_0>=38 && LA1_0<=39)||LA1_0==41||(LA1_0>=45 && LA1_0<=47)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalGame.g:107:4: (lv_territoireElements_3_0= ruleterritoireElement )
            	    {
            	    // InternalGame.g:107:4: (lv_territoireElements_3_0= ruleterritoireElement )
            	    // InternalGame.g:108:5: lv_territoireElements_3_0= ruleterritoireElement
            	    {

            	    					newCompositeNode(grammarAccess.getGameAccess().getTerritoireElementsTerritoireElementParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_territoireElements_3_0=ruleterritoireElement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getGameRule());
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
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);

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


    // $ANTLR start "entryRuleterritoireElement"
    // InternalGame.g:133:1: entryRuleterritoireElement returns [EObject current=null] : iv_ruleterritoireElement= ruleterritoireElement EOF ;
    public final EObject entryRuleterritoireElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleterritoireElement = null;


        try {
            // InternalGame.g:133:58: (iv_ruleterritoireElement= ruleterritoireElement EOF )
            // InternalGame.g:134:2: iv_ruleterritoireElement= ruleterritoireElement EOF
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
    // InternalGame.g:140:1: ruleterritoireElement returns [EObject current=null] : (this_Explorateur_0= ruleExplorateur | this_Lieu_1= ruleLieu | this_ObjetsExplorateur_2= ruleObjetsExplorateur | this_ObjetsLieu_3= ruleObjetsLieu | this_Connaissances_4= ruleConnaissances | this_Personnes_5= rulePersonnes | this_Chemins_6= ruleChemins ) ;
    public final EObject ruleterritoireElement() throws RecognitionException {
        EObject current = null;

        EObject this_Explorateur_0 = null;

        EObject this_Lieu_1 = null;

        EObject this_ObjetsExplorateur_2 = null;

        EObject this_ObjetsLieu_3 = null;

        EObject this_Connaissances_4 = null;

        EObject this_Personnes_5 = null;

        EObject this_Chemins_6 = null;



        	enterRule();

        try {
            // InternalGame.g:146:2: ( (this_Explorateur_0= ruleExplorateur | this_Lieu_1= ruleLieu | this_ObjetsExplorateur_2= ruleObjetsExplorateur | this_ObjetsLieu_3= ruleObjetsLieu | this_Connaissances_4= ruleConnaissances | this_Personnes_5= rulePersonnes | this_Chemins_6= ruleChemins ) )
            // InternalGame.g:147:2: (this_Explorateur_0= ruleExplorateur | this_Lieu_1= ruleLieu | this_ObjetsExplorateur_2= ruleObjetsExplorateur | this_ObjetsLieu_3= ruleObjetsLieu | this_Connaissances_4= ruleConnaissances | this_Personnes_5= rulePersonnes | this_Chemins_6= ruleChemins )
            {
            // InternalGame.g:147:2: (this_Explorateur_0= ruleExplorateur | this_Lieu_1= ruleLieu | this_ObjetsExplorateur_2= ruleObjetsExplorateur | this_ObjetsLieu_3= ruleObjetsLieu | this_Connaissances_4= ruleConnaissances | this_Personnes_5= rulePersonnes | this_Chemins_6= ruleChemins )
            int alt2=7;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt2=1;
                }
                break;
            case 45:
            case 46:
            case 47:
                {
                alt2=2;
                }
                break;
            case 38:
                {
                alt2=3;
                }
                break;
            case 39:
                {
                alt2=4;
                }
                break;
            case 17:
                {
                alt2=5;
                }
                break;
            case 22:
                {
                alt2=6;
                }
                break;
            case 41:
                {
                alt2=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalGame.g:148:3: this_Explorateur_0= ruleExplorateur
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
                    // InternalGame.g:157:3: this_Lieu_1= ruleLieu
                    {

                    			newCompositeNode(grammarAccess.getTerritoireElementAccess().getLieuParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Lieu_1=ruleLieu();

                    state._fsp--;


                    			current = this_Lieu_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalGame.g:166:3: this_ObjetsExplorateur_2= ruleObjetsExplorateur
                    {

                    			newCompositeNode(grammarAccess.getTerritoireElementAccess().getObjetsExplorateurParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_ObjetsExplorateur_2=ruleObjetsExplorateur();

                    state._fsp--;


                    			current = this_ObjetsExplorateur_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalGame.g:175:3: this_ObjetsLieu_3= ruleObjetsLieu
                    {

                    			newCompositeNode(grammarAccess.getTerritoireElementAccess().getObjetsLieuParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_ObjetsLieu_3=ruleObjetsLieu();

                    state._fsp--;


                    			current = this_ObjetsLieu_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalGame.g:184:3: this_Connaissances_4= ruleConnaissances
                    {

                    			newCompositeNode(grammarAccess.getTerritoireElementAccess().getConnaissancesParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_Connaissances_4=ruleConnaissances();

                    state._fsp--;


                    			current = this_Connaissances_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalGame.g:193:3: this_Personnes_5= rulePersonnes
                    {

                    			newCompositeNode(grammarAccess.getTerritoireElementAccess().getPersonnesParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_Personnes_5=rulePersonnes();

                    state._fsp--;


                    			current = this_Personnes_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalGame.g:202:3: this_Chemins_6= ruleChemins
                    {

                    			newCompositeNode(grammarAccess.getTerritoireElementAccess().getCheminsParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_Chemins_6=ruleChemins();

                    state._fsp--;


                    			current = this_Chemins_6;
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
    // InternalGame.g:214:1: entryRuleExplorateur returns [EObject current=null] : iv_ruleExplorateur= ruleExplorateur EOF ;
    public final EObject entryRuleExplorateur() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExplorateur = null;


        try {
            // InternalGame.g:214:52: (iv_ruleExplorateur= ruleExplorateur EOF )
            // InternalGame.g:215:2: iv_ruleExplorateur= ruleExplorateur EOF
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
    // InternalGame.g:221:1: ruleExplorateur returns [EObject current=null] : (otherlv_0= 'explorateur' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_sac_3_0= ruleSac ) ) otherlv_4= 'connaissances' ( (otherlv_5= RULE_ID ) )* otherlv_6= 'position' ( (otherlv_7= RULE_ID ) ) otherlv_8= '}' ) ;
    public final EObject ruleExplorateur() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        EObject lv_sac_3_0 = null;



        	enterRule();

        try {
            // InternalGame.g:227:2: ( (otherlv_0= 'explorateur' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_sac_3_0= ruleSac ) ) otherlv_4= 'connaissances' ( (otherlv_5= RULE_ID ) )* otherlv_6= 'position' ( (otherlv_7= RULE_ID ) ) otherlv_8= '}' ) )
            // InternalGame.g:228:2: (otherlv_0= 'explorateur' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_sac_3_0= ruleSac ) ) otherlv_4= 'connaissances' ( (otherlv_5= RULE_ID ) )* otherlv_6= 'position' ( (otherlv_7= RULE_ID ) ) otherlv_8= '}' )
            {
            // InternalGame.g:228:2: (otherlv_0= 'explorateur' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_sac_3_0= ruleSac ) ) otherlv_4= 'connaissances' ( (otherlv_5= RULE_ID ) )* otherlv_6= 'position' ( (otherlv_7= RULE_ID ) ) otherlv_8= '}' )
            // InternalGame.g:229:3: otherlv_0= 'explorateur' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_sac_3_0= ruleSac ) ) otherlv_4= 'connaissances' ( (otherlv_5= RULE_ID ) )* otherlv_6= 'position' ( (otherlv_7= RULE_ID ) ) otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getExplorateurAccess().getExplorateurKeyword_0());
            		
            // InternalGame.g:233:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalGame.g:234:4: (lv_name_1_0= RULE_ID )
            {
            // InternalGame.g:234:4: (lv_name_1_0= RULE_ID )
            // InternalGame.g:235:5: lv_name_1_0= RULE_ID
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

            otherlv_2=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getExplorateurAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalGame.g:255:3: ( (lv_sac_3_0= ruleSac ) )
            // InternalGame.g:256:4: (lv_sac_3_0= ruleSac )
            {
            // InternalGame.g:256:4: (lv_sac_3_0= ruleSac )
            // InternalGame.g:257:5: lv_sac_3_0= ruleSac
            {

            					newCompositeNode(grammarAccess.getExplorateurAccess().getSacSacParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_8);
            lv_sac_3_0=ruleSac();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExplorateurRule());
            					}
            					set(
            						current,
            						"sac",
            						lv_sac_3_0,
            						"fr.n7.Game.Sac");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,17,FOLLOW_9); 

            			newLeafNode(otherlv_4, grammarAccess.getExplorateurAccess().getConnaissancesKeyword_4());
            		
            // InternalGame.g:278:3: ( (otherlv_5= RULE_ID ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_ID) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalGame.g:279:4: (otherlv_5= RULE_ID )
            	    {
            	    // InternalGame.g:279:4: (otherlv_5= RULE_ID )
            	    // InternalGame.g:280:5: otherlv_5= RULE_ID
            	    {

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getExplorateurRule());
            	    					}
            	    				
            	    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_9); 

            	    					newLeafNode(otherlv_5, grammarAccess.getExplorateurAccess().getConnaissancesConnaissanceCrossReference_5_0());
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_6=(Token)match(input,18,FOLLOW_3); 

            			newLeafNode(otherlv_6, grammarAccess.getExplorateurAccess().getPositionKeyword_6());
            		
            // InternalGame.g:295:3: ( (otherlv_7= RULE_ID ) )
            // InternalGame.g:296:4: (otherlv_7= RULE_ID )
            {
            // InternalGame.g:296:4: (otherlv_7= RULE_ID )
            // InternalGame.g:297:5: otherlv_7= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExplorateurRule());
            					}
            				
            otherlv_7=(Token)match(input,RULE_ID,FOLLOW_10); 

            					newLeafNode(otherlv_7, grammarAccess.getExplorateurAccess().getPositionLieuCrossReference_7_0());
            				

            }


            }

            otherlv_8=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getExplorateurAccess().getRightCurlyBracketKeyword_8());
            		

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
    // InternalGame.g:316:1: entryRuleSac returns [EObject current=null] : iv_ruleSac= ruleSac EOF ;
    public final EObject entryRuleSac() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSac = null;


        try {
            // InternalGame.g:316:44: (iv_ruleSac= ruleSac EOF )
            // InternalGame.g:317:2: iv_ruleSac= ruleSac EOF
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
    // InternalGame.g:323:1: ruleSac returns [EObject current=null] : (otherlv_0= 'sac' ( (lv_taille_1_0= RULE_INT ) ) otherlv_2= '{' ( (otherlv_3= RULE_ID ) )* otherlv_4= '}' ) ;
    public final EObject ruleSac() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_taille_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalGame.g:329:2: ( (otherlv_0= 'sac' ( (lv_taille_1_0= RULE_INT ) ) otherlv_2= '{' ( (otherlv_3= RULE_ID ) )* otherlv_4= '}' ) )
            // InternalGame.g:330:2: (otherlv_0= 'sac' ( (lv_taille_1_0= RULE_INT ) ) otherlv_2= '{' ( (otherlv_3= RULE_ID ) )* otherlv_4= '}' )
            {
            // InternalGame.g:330:2: (otherlv_0= 'sac' ( (lv_taille_1_0= RULE_INT ) ) otherlv_2= '{' ( (otherlv_3= RULE_ID ) )* otherlv_4= '}' )
            // InternalGame.g:331:3: otherlv_0= 'sac' ( (lv_taille_1_0= RULE_INT ) ) otherlv_2= '{' ( (otherlv_3= RULE_ID ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getSacAccess().getSacKeyword_0());
            		
            // InternalGame.g:335:3: ( (lv_taille_1_0= RULE_INT ) )
            // InternalGame.g:336:4: (lv_taille_1_0= RULE_INT )
            {
            // InternalGame.g:336:4: (lv_taille_1_0= RULE_INT )
            // InternalGame.g:337:5: lv_taille_1_0= RULE_INT
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

            otherlv_2=(Token)match(input,14,FOLLOW_12); 

            			newLeafNode(otherlv_2, grammarAccess.getSacAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalGame.g:357:3: ( (otherlv_3= RULE_ID ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_ID) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalGame.g:358:4: (otherlv_3= RULE_ID )
            	    {
            	    // InternalGame.g:358:4: (otherlv_3= RULE_ID )
            	    // InternalGame.g:359:5: otherlv_3= RULE_ID
            	    {

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getSacRule());
            	    					}
            	    				
            	    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_12); 

            	    					newLeafNode(otherlv_3, grammarAccess.getSacAccess().getSacElementsObjetExplorateurCrossReference_3_0());
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
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
    // InternalGame.g:378:1: entryRuleLieu returns [EObject current=null] : iv_ruleLieu= ruleLieu EOF ;
    public final EObject entryRuleLieu() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLieu = null;


        try {
            // InternalGame.g:378:45: (iv_ruleLieu= ruleLieu EOF )
            // InternalGame.g:379:2: iv_ruleLieu= ruleLieu EOF
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
    // InternalGame.g:385:1: ruleLieu returns [EObject current=null] : ( ( (lv_type_0_0= ruleTypeLieu ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) ) ( (lv_conditionDescription_5_0= ruleCondition ) )? )? ( (otherlv_6= RULE_ID ) )* ( (otherlv_7= RULE_ID ) )* ( (otherlv_8= RULE_ID ) )* (otherlv_9= 'depotO' ( (lv_depotObjet_10_0= ruleCondition ) ) )? ( (otherlv_11= RULE_ID ) )* otherlv_12= '}' ) ;
    public final EObject ruleLieu() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_description_4_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Enumerator lv_type_0_0 = null;

        EObject lv_conditionDescription_5_0 = null;

        EObject lv_depotObjet_10_0 = null;



        	enterRule();

        try {
            // InternalGame.g:391:2: ( ( ( (lv_type_0_0= ruleTypeLieu ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) ) ( (lv_conditionDescription_5_0= ruleCondition ) )? )? ( (otherlv_6= RULE_ID ) )* ( (otherlv_7= RULE_ID ) )* ( (otherlv_8= RULE_ID ) )* (otherlv_9= 'depotO' ( (lv_depotObjet_10_0= ruleCondition ) ) )? ( (otherlv_11= RULE_ID ) )* otherlv_12= '}' ) )
            // InternalGame.g:392:2: ( ( (lv_type_0_0= ruleTypeLieu ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) ) ( (lv_conditionDescription_5_0= ruleCondition ) )? )? ( (otherlv_6= RULE_ID ) )* ( (otherlv_7= RULE_ID ) )* ( (otherlv_8= RULE_ID ) )* (otherlv_9= 'depotO' ( (lv_depotObjet_10_0= ruleCondition ) ) )? ( (otherlv_11= RULE_ID ) )* otherlv_12= '}' )
            {
            // InternalGame.g:392:2: ( ( (lv_type_0_0= ruleTypeLieu ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) ) ( (lv_conditionDescription_5_0= ruleCondition ) )? )? ( (otherlv_6= RULE_ID ) )* ( (otherlv_7= RULE_ID ) )* ( (otherlv_8= RULE_ID ) )* (otherlv_9= 'depotO' ( (lv_depotObjet_10_0= ruleCondition ) ) )? ( (otherlv_11= RULE_ID ) )* otherlv_12= '}' )
            // InternalGame.g:393:3: ( (lv_type_0_0= ruleTypeLieu ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) ) ( (lv_conditionDescription_5_0= ruleCondition ) )? )? ( (otherlv_6= RULE_ID ) )* ( (otherlv_7= RULE_ID ) )* ( (otherlv_8= RULE_ID ) )* (otherlv_9= 'depotO' ( (lv_depotObjet_10_0= ruleCondition ) ) )? ( (otherlv_11= RULE_ID ) )* otherlv_12= '}'
            {
            // InternalGame.g:393:3: ( (lv_type_0_0= ruleTypeLieu ) )
            // InternalGame.g:394:4: (lv_type_0_0= ruleTypeLieu )
            {
            // InternalGame.g:394:4: (lv_type_0_0= ruleTypeLieu )
            // InternalGame.g:395:5: lv_type_0_0= ruleTypeLieu
            {

            					newCompositeNode(grammarAccess.getLieuAccess().getTypeTypeLieuEnumRuleCall_0_0());
            				
            pushFollow(FOLLOW_3);
            lv_type_0_0=ruleTypeLieu();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLieuRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_0_0,
            						"fr.n7.Game.TypeLieu");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalGame.g:412:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalGame.g:413:4: (lv_name_1_0= RULE_ID )
            {
            // InternalGame.g:413:4: (lv_name_1_0= RULE_ID )
            // InternalGame.g:414:5: lv_name_1_0= RULE_ID
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

            otherlv_2=(Token)match(input,14,FOLLOW_13); 

            			newLeafNode(otherlv_2, grammarAccess.getLieuAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalGame.g:434:3: (otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) ) ( (lv_conditionDescription_5_0= ruleCondition ) )? )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==20) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalGame.g:435:4: otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) ) ( (lv_conditionDescription_5_0= ruleCondition ) )?
                    {
                    otherlv_3=(Token)match(input,20,FOLLOW_14); 

                    				newLeafNode(otherlv_3, grammarAccess.getLieuAccess().getDescriptionKeyword_3_0());
                    			
                    // InternalGame.g:439:4: ( (lv_description_4_0= RULE_STRING ) )
                    // InternalGame.g:440:5: (lv_description_4_0= RULE_STRING )
                    {
                    // InternalGame.g:440:5: (lv_description_4_0= RULE_STRING )
                    // InternalGame.g:441:6: lv_description_4_0= RULE_STRING
                    {
                    lv_description_4_0=(Token)match(input,RULE_STRING,FOLLOW_15); 

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

                    // InternalGame.g:457:4: ( (lv_conditionDescription_5_0= ruleCondition ) )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0==40) ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // InternalGame.g:458:5: (lv_conditionDescription_5_0= ruleCondition )
                            {
                            // InternalGame.g:458:5: (lv_conditionDescription_5_0= ruleCondition )
                            // InternalGame.g:459:6: lv_conditionDescription_5_0= ruleCondition
                            {

                            						newCompositeNode(grammarAccess.getLieuAccess().getConditionDescriptionConditionParserRuleCall_3_2_0());
                            					
                            pushFollow(FOLLOW_16);
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

            // InternalGame.g:477:3: ( (otherlv_6= RULE_ID ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalGame.g:478:4: (otherlv_6= RULE_ID )
            	    {
            	    // InternalGame.g:478:4: (otherlv_6= RULE_ID )
            	    // InternalGame.g:479:5: otherlv_6= RULE_ID
            	    {

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getLieuRule());
            	    					}
            	    				
            	    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_16); 

            	    					newLeafNode(otherlv_6, grammarAccess.getLieuAccess().getPersonnesPersonneCrossReference_4_0());
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            // InternalGame.g:490:3: ( (otherlv_7= RULE_ID ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ID) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalGame.g:491:4: (otherlv_7= RULE_ID )
            	    {
            	    // InternalGame.g:491:4: (otherlv_7= RULE_ID )
            	    // InternalGame.g:492:5: otherlv_7= RULE_ID
            	    {

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getLieuRule());
            	    					}
            	    				
            	    otherlv_7=(Token)match(input,RULE_ID,FOLLOW_16); 

            	    					newLeafNode(otherlv_7, grammarAccess.getLieuAccess().getConnaissancesConnaissanceCrossReference_5_0());
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            // InternalGame.g:503:3: ( (otherlv_8= RULE_ID ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_ID) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalGame.g:504:4: (otherlv_8= RULE_ID )
            	    {
            	    // InternalGame.g:504:4: (otherlv_8= RULE_ID )
            	    // InternalGame.g:505:5: otherlv_8= RULE_ID
            	    {

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getLieuRule());
            	    					}
            	    				
            	    otherlv_8=(Token)match(input,RULE_ID,FOLLOW_16); 

            	    					newLeafNode(otherlv_8, grammarAccess.getLieuAccess().getObjetsObjetLieuCrossReference_6_0());
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            // InternalGame.g:516:3: (otherlv_9= 'depotO' ( (lv_depotObjet_10_0= ruleCondition ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==21) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalGame.g:517:4: otherlv_9= 'depotO' ( (lv_depotObjet_10_0= ruleCondition ) )
                    {
                    otherlv_9=(Token)match(input,21,FOLLOW_17); 

                    				newLeafNode(otherlv_9, grammarAccess.getLieuAccess().getDepotOKeyword_7_0());
                    			
                    // InternalGame.g:521:4: ( (lv_depotObjet_10_0= ruleCondition ) )
                    // InternalGame.g:522:5: (lv_depotObjet_10_0= ruleCondition )
                    {
                    // InternalGame.g:522:5: (lv_depotObjet_10_0= ruleCondition )
                    // InternalGame.g:523:6: lv_depotObjet_10_0= ruleCondition
                    {

                    						newCompositeNode(grammarAccess.getLieuAccess().getDepotObjetConditionParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_12);
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


                    }
                    break;

            }

            // InternalGame.g:541:3: ( (otherlv_11= RULE_ID ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_ID) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalGame.g:542:4: (otherlv_11= RULE_ID )
            	    {
            	    // InternalGame.g:542:4: (otherlv_11= RULE_ID )
            	    // InternalGame.g:543:5: otherlv_11= RULE_ID
            	    {

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getLieuRule());
            	    					}
            	    				
            	    otherlv_11=(Token)match(input,RULE_ID,FOLLOW_12); 

            	    					newLeafNode(otherlv_11, grammarAccess.getLieuAccess().getListeCheminsCheminCrossReference_8_0());
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            otherlv_12=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_12, grammarAccess.getLieuAccess().getRightCurlyBracketKeyword_9());
            		

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
    // InternalGame.g:562:1: entryRulePersonnes returns [EObject current=null] : iv_rulePersonnes= rulePersonnes EOF ;
    public final EObject entryRulePersonnes() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePersonnes = null;


        try {
            // InternalGame.g:562:50: (iv_rulePersonnes= rulePersonnes EOF )
            // InternalGame.g:563:2: iv_rulePersonnes= rulePersonnes EOF
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
    // InternalGame.g:569:1: rulePersonnes returns [EObject current=null] : (otherlv_0= 'personnes' otherlv_1= '{' ( (lv_listePersonnes_2_0= rulePersonne ) )+ otherlv_3= '}' ) ;
    public final EObject rulePersonnes() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_listePersonnes_2_0 = null;



        	enterRule();

        try {
            // InternalGame.g:575:2: ( (otherlv_0= 'personnes' otherlv_1= '{' ( (lv_listePersonnes_2_0= rulePersonne ) )+ otherlv_3= '}' ) )
            // InternalGame.g:576:2: (otherlv_0= 'personnes' otherlv_1= '{' ( (lv_listePersonnes_2_0= rulePersonne ) )+ otherlv_3= '}' )
            {
            // InternalGame.g:576:2: (otherlv_0= 'personnes' otherlv_1= '{' ( (lv_listePersonnes_2_0= rulePersonne ) )+ otherlv_3= '}' )
            // InternalGame.g:577:3: otherlv_0= 'personnes' otherlv_1= '{' ( (lv_listePersonnes_2_0= rulePersonne ) )+ otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getPersonnesAccess().getPersonnesKeyword_0());
            		
            otherlv_1=(Token)match(input,14,FOLLOW_18); 

            			newLeafNode(otherlv_1, grammarAccess.getPersonnesAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalGame.g:585:3: ( (lv_listePersonnes_2_0= rulePersonne ) )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==23) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalGame.g:586:4: (lv_listePersonnes_2_0= rulePersonne )
            	    {
            	    // InternalGame.g:586:4: (lv_listePersonnes_2_0= rulePersonne )
            	    // InternalGame.g:587:5: lv_listePersonnes_2_0= rulePersonne
            	    {

            	    					newCompositeNode(grammarAccess.getPersonnesAccess().getListePersonnesPersonneParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_19);
            	    lv_listePersonnes_2_0=rulePersonne();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getPersonnesRule());
            	    					}
            	    					set(
            	    						current,
            	    						"listePersonnes",
            	    						lv_listePersonnes_2_0,
            	    						"fr.n7.Game.Personne");
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
    // InternalGame.g:612:1: entryRulePersonne returns [EObject current=null] : iv_rulePersonne= rulePersonne EOF ;
    public final EObject entryRulePersonne() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePersonne = null;


        try {
            // InternalGame.g:612:49: (iv_rulePersonne= rulePersonne EOF )
            // InternalGame.g:613:2: iv_rulePersonne= rulePersonne EOF
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
    // InternalGame.g:619:1: rulePersonne returns [EObject current=null] : (otherlv_0= 'personne' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'visible' ( (lv_visible_4_0= RULE_BOOL ) ) )? (otherlv_5= 'obligatoire' ( (lv_obligatoire_6_0= RULE_BOOL ) ) )? ( (lv_personneElements_7_0= ruleInteraction ) ) otherlv_8= '}' ) ;
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
            // InternalGame.g:625:2: ( (otherlv_0= 'personne' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'visible' ( (lv_visible_4_0= RULE_BOOL ) ) )? (otherlv_5= 'obligatoire' ( (lv_obligatoire_6_0= RULE_BOOL ) ) )? ( (lv_personneElements_7_0= ruleInteraction ) ) otherlv_8= '}' ) )
            // InternalGame.g:626:2: (otherlv_0= 'personne' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'visible' ( (lv_visible_4_0= RULE_BOOL ) ) )? (otherlv_5= 'obligatoire' ( (lv_obligatoire_6_0= RULE_BOOL ) ) )? ( (lv_personneElements_7_0= ruleInteraction ) ) otherlv_8= '}' )
            {
            // InternalGame.g:626:2: (otherlv_0= 'personne' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'visible' ( (lv_visible_4_0= RULE_BOOL ) ) )? (otherlv_5= 'obligatoire' ( (lv_obligatoire_6_0= RULE_BOOL ) ) )? ( (lv_personneElements_7_0= ruleInteraction ) ) otherlv_8= '}' )
            // InternalGame.g:627:3: otherlv_0= 'personne' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'visible' ( (lv_visible_4_0= RULE_BOOL ) ) )? (otherlv_5= 'obligatoire' ( (lv_obligatoire_6_0= RULE_BOOL ) ) )? ( (lv_personneElements_7_0= ruleInteraction ) ) otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getPersonneAccess().getPersonneKeyword_0());
            		
            // InternalGame.g:631:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalGame.g:632:4: (lv_name_1_0= RULE_ID )
            {
            // InternalGame.g:632:4: (lv_name_1_0= RULE_ID )
            // InternalGame.g:633:5: lv_name_1_0= RULE_ID
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

            otherlv_2=(Token)match(input,14,FOLLOW_20); 

            			newLeafNode(otherlv_2, grammarAccess.getPersonneAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalGame.g:653:3: (otherlv_3= 'visible' ( (lv_visible_4_0= RULE_BOOL ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==24) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalGame.g:654:4: otherlv_3= 'visible' ( (lv_visible_4_0= RULE_BOOL ) )
                    {
                    otherlv_3=(Token)match(input,24,FOLLOW_21); 

                    				newLeafNode(otherlv_3, grammarAccess.getPersonneAccess().getVisibleKeyword_3_0());
                    			
                    // InternalGame.g:658:4: ( (lv_visible_4_0= RULE_BOOL ) )
                    // InternalGame.g:659:5: (lv_visible_4_0= RULE_BOOL )
                    {
                    // InternalGame.g:659:5: (lv_visible_4_0= RULE_BOOL )
                    // InternalGame.g:660:6: lv_visible_4_0= RULE_BOOL
                    {
                    lv_visible_4_0=(Token)match(input,RULE_BOOL,FOLLOW_20); 

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

            // InternalGame.g:677:3: (otherlv_5= 'obligatoire' ( (lv_obligatoire_6_0= RULE_BOOL ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==25) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalGame.g:678:4: otherlv_5= 'obligatoire' ( (lv_obligatoire_6_0= RULE_BOOL ) )
                    {
                    otherlv_5=(Token)match(input,25,FOLLOW_21); 

                    				newLeafNode(otherlv_5, grammarAccess.getPersonneAccess().getObligatoireKeyword_4_0());
                    			
                    // InternalGame.g:682:4: ( (lv_obligatoire_6_0= RULE_BOOL ) )
                    // InternalGame.g:683:5: (lv_obligatoire_6_0= RULE_BOOL )
                    {
                    // InternalGame.g:683:5: (lv_obligatoire_6_0= RULE_BOOL )
                    // InternalGame.g:684:6: lv_obligatoire_6_0= RULE_BOOL
                    {
                    lv_obligatoire_6_0=(Token)match(input,RULE_BOOL,FOLLOW_20); 

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

            // InternalGame.g:701:3: ( (lv_personneElements_7_0= ruleInteraction ) )
            // InternalGame.g:702:4: (lv_personneElements_7_0= ruleInteraction )
            {
            // InternalGame.g:702:4: (lv_personneElements_7_0= ruleInteraction )
            // InternalGame.g:703:5: lv_personneElements_7_0= ruleInteraction
            {

            					newCompositeNode(grammarAccess.getPersonneAccess().getPersonneElementsInteractionParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_10);
            lv_personneElements_7_0=ruleInteraction();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPersonneRule());
            					}
            					set(
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
    // InternalGame.g:728:1: entryRuleInteraction returns [EObject current=null] : iv_ruleInteraction= ruleInteraction EOF ;
    public final EObject entryRuleInteraction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInteraction = null;


        try {
            // InternalGame.g:728:52: (iv_ruleInteraction= ruleInteraction EOF )
            // InternalGame.g:729:2: iv_ruleInteraction= ruleInteraction EOF
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
    // InternalGame.g:735:1: ruleInteraction returns [EObject current=null] : (otherlv_0= 'interaction' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'texte' ( (lv_texte_4_0= RULE_STRING ) ) ( (lv_interactionElements_5_0= ruleChoix ) )* otherlv_6= '}' ) ;
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
            // InternalGame.g:741:2: ( (otherlv_0= 'interaction' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'texte' ( (lv_texte_4_0= RULE_STRING ) ) ( (lv_interactionElements_5_0= ruleChoix ) )* otherlv_6= '}' ) )
            // InternalGame.g:742:2: (otherlv_0= 'interaction' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'texte' ( (lv_texte_4_0= RULE_STRING ) ) ( (lv_interactionElements_5_0= ruleChoix ) )* otherlv_6= '}' )
            {
            // InternalGame.g:742:2: (otherlv_0= 'interaction' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'texte' ( (lv_texte_4_0= RULE_STRING ) ) ( (lv_interactionElements_5_0= ruleChoix ) )* otherlv_6= '}' )
            // InternalGame.g:743:3: otherlv_0= 'interaction' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'texte' ( (lv_texte_4_0= RULE_STRING ) ) ( (lv_interactionElements_5_0= ruleChoix ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,26,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getInteractionAccess().getInteractionKeyword_0());
            		
            // InternalGame.g:747:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalGame.g:748:4: (lv_name_1_0= RULE_ID )
            {
            // InternalGame.g:748:4: (lv_name_1_0= RULE_ID )
            // InternalGame.g:749:5: lv_name_1_0= RULE_ID
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

            otherlv_2=(Token)match(input,14,FOLLOW_22); 

            			newLeafNode(otherlv_2, grammarAccess.getInteractionAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,27,FOLLOW_14); 

            			newLeafNode(otherlv_3, grammarAccess.getInteractionAccess().getTexteKeyword_3());
            		
            // InternalGame.g:773:3: ( (lv_texte_4_0= RULE_STRING ) )
            // InternalGame.g:774:4: (lv_texte_4_0= RULE_STRING )
            {
            // InternalGame.g:774:4: (lv_texte_4_0= RULE_STRING )
            // InternalGame.g:775:5: lv_texte_4_0= RULE_STRING
            {
            lv_texte_4_0=(Token)match(input,RULE_STRING,FOLLOW_23); 

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

            // InternalGame.g:791:3: ( (lv_interactionElements_5_0= ruleChoix ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==28) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalGame.g:792:4: (lv_interactionElements_5_0= ruleChoix )
            	    {
            	    // InternalGame.g:792:4: (lv_interactionElements_5_0= ruleChoix )
            	    // InternalGame.g:793:5: lv_interactionElements_5_0= ruleChoix
            	    {

            	    					newCompositeNode(grammarAccess.getInteractionAccess().getInteractionElementsChoixParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_23);
            	    lv_interactionElements_5_0=ruleChoix();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getInteractionRule());
            	    					}
            	    					set(
            	    						current,
            	    						"interactionElements",
            	    						lv_interactionElements_5_0,
            	    						"fr.n7.Game.Choix");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop15;
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
    // InternalGame.g:818:1: entryRuleChoix returns [EObject current=null] : iv_ruleChoix= ruleChoix EOF ;
    public final EObject entryRuleChoix() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChoix = null;


        try {
            // InternalGame.g:818:46: (iv_ruleChoix= ruleChoix EOF )
            // InternalGame.g:819:2: iv_ruleChoix= ruleChoix EOF
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
    // InternalGame.g:825:1: ruleChoix returns [EObject current=null] : (otherlv_0= 'choix' ( (lv_name_1_0= RULE_ID ) ) ( (lv_texte_2_0= RULE_STRING ) ) otherlv_3= '{' ( (lv_listeActions_4_0= ruleAction ) )+ (otherlv_5= 'choixdebut' ( ( (lv_choixdebut_6_0= RULE_STRING ) ) ( (lv_conditonChoixDebut_7_0= ruleCondition ) ) )? )? (otherlv_8= 'choixfin' ( ( (lv_choixfin_9_0= RULE_STRING ) ) ( (lv_conditionChoixFin_10_0= ruleCondition ) ) )? )? otherlv_11= '}' ) ;
    public final EObject ruleChoix() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_texte_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token lv_choixdebut_6_0=null;
        Token otherlv_8=null;
        Token lv_choixfin_9_0=null;
        Token otherlv_11=null;
        EObject lv_listeActions_4_0 = null;

        EObject lv_conditonChoixDebut_7_0 = null;

        EObject lv_conditionChoixFin_10_0 = null;



        	enterRule();

        try {
            // InternalGame.g:831:2: ( (otherlv_0= 'choix' ( (lv_name_1_0= RULE_ID ) ) ( (lv_texte_2_0= RULE_STRING ) ) otherlv_3= '{' ( (lv_listeActions_4_0= ruleAction ) )+ (otherlv_5= 'choixdebut' ( ( (lv_choixdebut_6_0= RULE_STRING ) ) ( (lv_conditonChoixDebut_7_0= ruleCondition ) ) )? )? (otherlv_8= 'choixfin' ( ( (lv_choixfin_9_0= RULE_STRING ) ) ( (lv_conditionChoixFin_10_0= ruleCondition ) ) )? )? otherlv_11= '}' ) )
            // InternalGame.g:832:2: (otherlv_0= 'choix' ( (lv_name_1_0= RULE_ID ) ) ( (lv_texte_2_0= RULE_STRING ) ) otherlv_3= '{' ( (lv_listeActions_4_0= ruleAction ) )+ (otherlv_5= 'choixdebut' ( ( (lv_choixdebut_6_0= RULE_STRING ) ) ( (lv_conditonChoixDebut_7_0= ruleCondition ) ) )? )? (otherlv_8= 'choixfin' ( ( (lv_choixfin_9_0= RULE_STRING ) ) ( (lv_conditionChoixFin_10_0= ruleCondition ) ) )? )? otherlv_11= '}' )
            {
            // InternalGame.g:832:2: (otherlv_0= 'choix' ( (lv_name_1_0= RULE_ID ) ) ( (lv_texte_2_0= RULE_STRING ) ) otherlv_3= '{' ( (lv_listeActions_4_0= ruleAction ) )+ (otherlv_5= 'choixdebut' ( ( (lv_choixdebut_6_0= RULE_STRING ) ) ( (lv_conditonChoixDebut_7_0= ruleCondition ) ) )? )? (otherlv_8= 'choixfin' ( ( (lv_choixfin_9_0= RULE_STRING ) ) ( (lv_conditionChoixFin_10_0= ruleCondition ) ) )? )? otherlv_11= '}' )
            // InternalGame.g:833:3: otherlv_0= 'choix' ( (lv_name_1_0= RULE_ID ) ) ( (lv_texte_2_0= RULE_STRING ) ) otherlv_3= '{' ( (lv_listeActions_4_0= ruleAction ) )+ (otherlv_5= 'choixdebut' ( ( (lv_choixdebut_6_0= RULE_STRING ) ) ( (lv_conditonChoixDebut_7_0= ruleCondition ) ) )? )? (otherlv_8= 'choixfin' ( ( (lv_choixfin_9_0= RULE_STRING ) ) ( (lv_conditionChoixFin_10_0= ruleCondition ) ) )? )? otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,28,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getChoixAccess().getChoixKeyword_0());
            		
            // InternalGame.g:837:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalGame.g:838:4: (lv_name_1_0= RULE_ID )
            {
            // InternalGame.g:838:4: (lv_name_1_0= RULE_ID )
            // InternalGame.g:839:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_14); 

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

            // InternalGame.g:855:3: ( (lv_texte_2_0= RULE_STRING ) )
            // InternalGame.g:856:4: (lv_texte_2_0= RULE_STRING )
            {
            // InternalGame.g:856:4: (lv_texte_2_0= RULE_STRING )
            // InternalGame.g:857:5: lv_texte_2_0= RULE_STRING
            {
            lv_texte_2_0=(Token)match(input,RULE_STRING,FOLLOW_4); 

            					newLeafNode(lv_texte_2_0, grammarAccess.getChoixAccess().getTexteSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getChoixRule());
            					}
            					setWithLastConsumed(
            						current,
            						"texte",
            						lv_texte_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_3=(Token)match(input,14,FOLLOW_24); 

            			newLeafNode(otherlv_3, grammarAccess.getChoixAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalGame.g:877:3: ( (lv_listeActions_4_0= ruleAction ) )+
            int cnt16=0;
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==31) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalGame.g:878:4: (lv_listeActions_4_0= ruleAction )
            	    {
            	    // InternalGame.g:878:4: (lv_listeActions_4_0= ruleAction )
            	    // InternalGame.g:879:5: lv_listeActions_4_0= ruleAction
            	    {

            	    					newCompositeNode(grammarAccess.getChoixAccess().getListeActionsActionParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_25);
            	    lv_listeActions_4_0=ruleAction();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getChoixRule());
            	    					}
            	    					set(
            	    						current,
            	    						"listeActions",
            	    						lv_listeActions_4_0,
            	    						"fr.n7.Game.Action");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt16 >= 1 ) break loop16;
                        EarlyExitException eee =
                            new EarlyExitException(16, input);
                        throw eee;
                }
                cnt16++;
            } while (true);

            // InternalGame.g:896:3: (otherlv_5= 'choixdebut' ( ( (lv_choixdebut_6_0= RULE_STRING ) ) ( (lv_conditonChoixDebut_7_0= ruleCondition ) ) )? )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==29) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalGame.g:897:4: otherlv_5= 'choixdebut' ( ( (lv_choixdebut_6_0= RULE_STRING ) ) ( (lv_conditonChoixDebut_7_0= ruleCondition ) ) )?
                    {
                    otherlv_5=(Token)match(input,29,FOLLOW_26); 

                    				newLeafNode(otherlv_5, grammarAccess.getChoixAccess().getChoixdebutKeyword_5_0());
                    			
                    // InternalGame.g:901:4: ( ( (lv_choixdebut_6_0= RULE_STRING ) ) ( (lv_conditonChoixDebut_7_0= ruleCondition ) ) )?
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0==RULE_STRING) ) {
                        alt17=1;
                    }
                    switch (alt17) {
                        case 1 :
                            // InternalGame.g:902:5: ( (lv_choixdebut_6_0= RULE_STRING ) ) ( (lv_conditonChoixDebut_7_0= ruleCondition ) )
                            {
                            // InternalGame.g:902:5: ( (lv_choixdebut_6_0= RULE_STRING ) )
                            // InternalGame.g:903:6: (lv_choixdebut_6_0= RULE_STRING )
                            {
                            // InternalGame.g:903:6: (lv_choixdebut_6_0= RULE_STRING )
                            // InternalGame.g:904:7: lv_choixdebut_6_0= RULE_STRING
                            {
                            lv_choixdebut_6_0=(Token)match(input,RULE_STRING,FOLLOW_17); 

                            							newLeafNode(lv_choixdebut_6_0, grammarAccess.getChoixAccess().getChoixdebutSTRINGTerminalRuleCall_5_1_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getChoixRule());
                            							}
                            							setWithLastConsumed(
                            								current,
                            								"choixdebut",
                            								lv_choixdebut_6_0,
                            								"org.eclipse.xtext.common.Terminals.STRING");
                            						

                            }


                            }

                            // InternalGame.g:920:5: ( (lv_conditonChoixDebut_7_0= ruleCondition ) )
                            // InternalGame.g:921:6: (lv_conditonChoixDebut_7_0= ruleCondition )
                            {
                            // InternalGame.g:921:6: (lv_conditonChoixDebut_7_0= ruleCondition )
                            // InternalGame.g:922:7: lv_conditonChoixDebut_7_0= ruleCondition
                            {

                            							newCompositeNode(grammarAccess.getChoixAccess().getConditonChoixDebutConditionParserRuleCall_5_1_1_0());
                            						
                            pushFollow(FOLLOW_27);
                            lv_conditonChoixDebut_7_0=ruleCondition();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getChoixRule());
                            							}
                            							set(
                            								current,
                            								"conditonChoixDebut",
                            								lv_conditonChoixDebut_7_0,
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

            // InternalGame.g:941:3: (otherlv_8= 'choixfin' ( ( (lv_choixfin_9_0= RULE_STRING ) ) ( (lv_conditionChoixFin_10_0= ruleCondition ) ) )? )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==30) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalGame.g:942:4: otherlv_8= 'choixfin' ( ( (lv_choixfin_9_0= RULE_STRING ) ) ( (lv_conditionChoixFin_10_0= ruleCondition ) ) )?
                    {
                    otherlv_8=(Token)match(input,30,FOLLOW_28); 

                    				newLeafNode(otherlv_8, grammarAccess.getChoixAccess().getChoixfinKeyword_6_0());
                    			
                    // InternalGame.g:946:4: ( ( (lv_choixfin_9_0= RULE_STRING ) ) ( (lv_conditionChoixFin_10_0= ruleCondition ) ) )?
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0==RULE_STRING) ) {
                        alt19=1;
                    }
                    switch (alt19) {
                        case 1 :
                            // InternalGame.g:947:5: ( (lv_choixfin_9_0= RULE_STRING ) ) ( (lv_conditionChoixFin_10_0= ruleCondition ) )
                            {
                            // InternalGame.g:947:5: ( (lv_choixfin_9_0= RULE_STRING ) )
                            // InternalGame.g:948:6: (lv_choixfin_9_0= RULE_STRING )
                            {
                            // InternalGame.g:948:6: (lv_choixfin_9_0= RULE_STRING )
                            // InternalGame.g:949:7: lv_choixfin_9_0= RULE_STRING
                            {
                            lv_choixfin_9_0=(Token)match(input,RULE_STRING,FOLLOW_17); 

                            							newLeafNode(lv_choixfin_9_0, grammarAccess.getChoixAccess().getChoixfinSTRINGTerminalRuleCall_6_1_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getChoixRule());
                            							}
                            							setWithLastConsumed(
                            								current,
                            								"choixfin",
                            								lv_choixfin_9_0,
                            								"org.eclipse.xtext.common.Terminals.STRING");
                            						

                            }


                            }

                            // InternalGame.g:965:5: ( (lv_conditionChoixFin_10_0= ruleCondition ) )
                            // InternalGame.g:966:6: (lv_conditionChoixFin_10_0= ruleCondition )
                            {
                            // InternalGame.g:966:6: (lv_conditionChoixFin_10_0= ruleCondition )
                            // InternalGame.g:967:7: lv_conditionChoixFin_10_0= ruleCondition
                            {

                            							newCompositeNode(grammarAccess.getChoixAccess().getConditionChoixFinConditionParserRuleCall_6_1_1_0());
                            						
                            pushFollow(FOLLOW_10);
                            lv_conditionChoixFin_10_0=ruleCondition();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getChoixRule());
                            							}
                            							set(
                            								current,
                            								"conditionChoixFin",
                            								lv_conditionChoixFin_10_0,
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

            otherlv_11=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getChoixAccess().getRightCurlyBracketKeyword_7());
            		

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
    // InternalGame.g:994:1: entryRuleAction returns [EObject current=null] : iv_ruleAction= ruleAction EOF ;
    public final EObject entryRuleAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAction = null;


        try {
            // InternalGame.g:994:47: (iv_ruleAction= ruleAction EOF )
            // InternalGame.g:995:2: iv_ruleAction= ruleAction EOF
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
    // InternalGame.g:1001:1: ruleAction returns [EObject current=null] : (otherlv_0= 'action' otherlv_1= '{' ( (lv_conditionAction_2_0= ruleCondition ) )? ( (otherlv_3= RULE_ID ) )* ( (lv_listeConnaissances_4_0= ruleConnaissances ) )? ( (otherlv_5= RULE_ID ) )* otherlv_6= 'attributionC' ( (lv_attributionConnaissance_7_0= ruleCondition ) ) (otherlv_8= 'attributionO' ( (lv_attributionObjet_9_0= ruleCondition ) ) )? ( (lv_listeObjetsConsommes_10_0= ruleObjetExplorateur ) )* (otherlv_11= 'consommationO' ( (lv_consommationObjet_12_0= ruleCondition ) ) )? otherlv_13= '}' ) ;
    public final EObject ruleAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        EObject lv_conditionAction_2_0 = null;

        EObject lv_listeConnaissances_4_0 = null;

        EObject lv_attributionConnaissance_7_0 = null;

        EObject lv_attributionObjet_9_0 = null;

        EObject lv_listeObjetsConsommes_10_0 = null;

        EObject lv_consommationObjet_12_0 = null;



        	enterRule();

        try {
            // InternalGame.g:1007:2: ( (otherlv_0= 'action' otherlv_1= '{' ( (lv_conditionAction_2_0= ruleCondition ) )? ( (otherlv_3= RULE_ID ) )* ( (lv_listeConnaissances_4_0= ruleConnaissances ) )? ( (otherlv_5= RULE_ID ) )* otherlv_6= 'attributionC' ( (lv_attributionConnaissance_7_0= ruleCondition ) ) (otherlv_8= 'attributionO' ( (lv_attributionObjet_9_0= ruleCondition ) ) )? ( (lv_listeObjetsConsommes_10_0= ruleObjetExplorateur ) )* (otherlv_11= 'consommationO' ( (lv_consommationObjet_12_0= ruleCondition ) ) )? otherlv_13= '}' ) )
            // InternalGame.g:1008:2: (otherlv_0= 'action' otherlv_1= '{' ( (lv_conditionAction_2_0= ruleCondition ) )? ( (otherlv_3= RULE_ID ) )* ( (lv_listeConnaissances_4_0= ruleConnaissances ) )? ( (otherlv_5= RULE_ID ) )* otherlv_6= 'attributionC' ( (lv_attributionConnaissance_7_0= ruleCondition ) ) (otherlv_8= 'attributionO' ( (lv_attributionObjet_9_0= ruleCondition ) ) )? ( (lv_listeObjetsConsommes_10_0= ruleObjetExplorateur ) )* (otherlv_11= 'consommationO' ( (lv_consommationObjet_12_0= ruleCondition ) ) )? otherlv_13= '}' )
            {
            // InternalGame.g:1008:2: (otherlv_0= 'action' otherlv_1= '{' ( (lv_conditionAction_2_0= ruleCondition ) )? ( (otherlv_3= RULE_ID ) )* ( (lv_listeConnaissances_4_0= ruleConnaissances ) )? ( (otherlv_5= RULE_ID ) )* otherlv_6= 'attributionC' ( (lv_attributionConnaissance_7_0= ruleCondition ) ) (otherlv_8= 'attributionO' ( (lv_attributionObjet_9_0= ruleCondition ) ) )? ( (lv_listeObjetsConsommes_10_0= ruleObjetExplorateur ) )* (otherlv_11= 'consommationO' ( (lv_consommationObjet_12_0= ruleCondition ) ) )? otherlv_13= '}' )
            // InternalGame.g:1009:3: otherlv_0= 'action' otherlv_1= '{' ( (lv_conditionAction_2_0= ruleCondition ) )? ( (otherlv_3= RULE_ID ) )* ( (lv_listeConnaissances_4_0= ruleConnaissances ) )? ( (otherlv_5= RULE_ID ) )* otherlv_6= 'attributionC' ( (lv_attributionConnaissance_7_0= ruleCondition ) ) (otherlv_8= 'attributionO' ( (lv_attributionObjet_9_0= ruleCondition ) ) )? ( (lv_listeObjetsConsommes_10_0= ruleObjetExplorateur ) )* (otherlv_11= 'consommationO' ( (lv_consommationObjet_12_0= ruleCondition ) ) )? otherlv_13= '}'
            {
            otherlv_0=(Token)match(input,31,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getActionAccess().getActionKeyword_0());
            		
            otherlv_1=(Token)match(input,14,FOLLOW_29); 

            			newLeafNode(otherlv_1, grammarAccess.getActionAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalGame.g:1017:3: ( (lv_conditionAction_2_0= ruleCondition ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==40) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalGame.g:1018:4: (lv_conditionAction_2_0= ruleCondition )
                    {
                    // InternalGame.g:1018:4: (lv_conditionAction_2_0= ruleCondition )
                    // InternalGame.g:1019:5: lv_conditionAction_2_0= ruleCondition
                    {

                    					newCompositeNode(grammarAccess.getActionAccess().getConditionActionConditionParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_30);
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

            // InternalGame.g:1036:3: ( (otherlv_3= RULE_ID ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==RULE_ID) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalGame.g:1037:4: (otherlv_3= RULE_ID )
            	    {
            	    // InternalGame.g:1037:4: (otherlv_3= RULE_ID )
            	    // InternalGame.g:1038:5: otherlv_3= RULE_ID
            	    {

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getActionRule());
            	    					}
            	    				
            	    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_30); 

            	    					newLeafNode(otherlv_3, grammarAccess.getActionAccess().getListeChoixChoixCrossReference_3_0());
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

            // InternalGame.g:1049:3: ( (lv_listeConnaissances_4_0= ruleConnaissances ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==17) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalGame.g:1050:4: (lv_listeConnaissances_4_0= ruleConnaissances )
                    {
                    // InternalGame.g:1050:4: (lv_listeConnaissances_4_0= ruleConnaissances )
                    // InternalGame.g:1051:5: lv_listeConnaissances_4_0= ruleConnaissances
                    {

                    					newCompositeNode(grammarAccess.getActionAccess().getListeConnaissancesConnaissancesParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_31);
                    lv_listeConnaissances_4_0=ruleConnaissances();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getActionRule());
                    					}
                    					set(
                    						current,
                    						"listeConnaissances",
                    						lv_listeConnaissances_4_0,
                    						"fr.n7.Game.Connaissances");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalGame.g:1068:3: ( (otherlv_5= RULE_ID ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==RULE_ID) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalGame.g:1069:4: (otherlv_5= RULE_ID )
            	    {
            	    // InternalGame.g:1069:4: (otherlv_5= RULE_ID )
            	    // InternalGame.g:1070:5: otherlv_5= RULE_ID
            	    {

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getActionRule());
            	    					}
            	    				
            	    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_31); 

            	    					newLeafNode(otherlv_5, grammarAccess.getActionAccess().getListeObjetsObjetLieuCrossReference_5_0());
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

            otherlv_6=(Token)match(input,32,FOLLOW_17); 

            			newLeafNode(otherlv_6, grammarAccess.getActionAccess().getAttributionCKeyword_6());
            		
            // InternalGame.g:1085:3: ( (lv_attributionConnaissance_7_0= ruleCondition ) )
            // InternalGame.g:1086:4: (lv_attributionConnaissance_7_0= ruleCondition )
            {
            // InternalGame.g:1086:4: (lv_attributionConnaissance_7_0= ruleCondition )
            // InternalGame.g:1087:5: lv_attributionConnaissance_7_0= ruleCondition
            {

            					newCompositeNode(grammarAccess.getActionAccess().getAttributionConnaissanceConditionParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_32);
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

            // InternalGame.g:1104:3: (otherlv_8= 'attributionO' ( (lv_attributionObjet_9_0= ruleCondition ) ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==33) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalGame.g:1105:4: otherlv_8= 'attributionO' ( (lv_attributionObjet_9_0= ruleCondition ) )
                    {
                    otherlv_8=(Token)match(input,33,FOLLOW_17); 

                    				newLeafNode(otherlv_8, grammarAccess.getActionAccess().getAttributionOKeyword_8_0());
                    			
                    // InternalGame.g:1109:4: ( (lv_attributionObjet_9_0= ruleCondition ) )
                    // InternalGame.g:1110:5: (lv_attributionObjet_9_0= ruleCondition )
                    {
                    // InternalGame.g:1110:5: (lv_attributionObjet_9_0= ruleCondition )
                    // InternalGame.g:1111:6: lv_attributionObjet_9_0= ruleCondition
                    {

                    						newCompositeNode(grammarAccess.getActionAccess().getAttributionObjetConditionParserRuleCall_8_1_0());
                    					
                    pushFollow(FOLLOW_33);
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

            // InternalGame.g:1129:3: ( (lv_listeObjetsConsommes_10_0= ruleObjetExplorateur ) )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==RULE_ID) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalGame.g:1130:4: (lv_listeObjetsConsommes_10_0= ruleObjetExplorateur )
            	    {
            	    // InternalGame.g:1130:4: (lv_listeObjetsConsommes_10_0= ruleObjetExplorateur )
            	    // InternalGame.g:1131:5: lv_listeObjetsConsommes_10_0= ruleObjetExplorateur
            	    {

            	    					newCompositeNode(grammarAccess.getActionAccess().getListeObjetsConsommesObjetExplorateurParserRuleCall_9_0());
            	    				
            	    pushFollow(FOLLOW_33);
            	    lv_listeObjetsConsommes_10_0=ruleObjetExplorateur();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getActionRule());
            	    					}
            	    					set(
            	    						current,
            	    						"listeObjetsConsommes",
            	    						lv_listeObjetsConsommes_10_0,
            	    						"fr.n7.Game.ObjetExplorateur");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

            // InternalGame.g:1148:3: (otherlv_11= 'consommationO' ( (lv_consommationObjet_12_0= ruleCondition ) ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==34) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalGame.g:1149:4: otherlv_11= 'consommationO' ( (lv_consommationObjet_12_0= ruleCondition ) )
                    {
                    otherlv_11=(Token)match(input,34,FOLLOW_17); 

                    				newLeafNode(otherlv_11, grammarAccess.getActionAccess().getConsommationOKeyword_10_0());
                    			
                    // InternalGame.g:1153:4: ( (lv_consommationObjet_12_0= ruleCondition ) )
                    // InternalGame.g:1154:5: (lv_consommationObjet_12_0= ruleCondition )
                    {
                    // InternalGame.g:1154:5: (lv_consommationObjet_12_0= ruleCondition )
                    // InternalGame.g:1155:6: lv_consommationObjet_12_0= ruleCondition
                    {

                    						newCompositeNode(grammarAccess.getActionAccess().getConsommationObjetConditionParserRuleCall_10_1_0());
                    					
                    pushFollow(FOLLOW_10);
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


    // $ANTLR start "entryRuleObjetExplorateur"
    // InternalGame.g:1181:1: entryRuleObjetExplorateur returns [EObject current=null] : iv_ruleObjetExplorateur= ruleObjetExplorateur EOF ;
    public final EObject entryRuleObjetExplorateur() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObjetExplorateur = null;


        try {
            // InternalGame.g:1181:57: (iv_ruleObjetExplorateur= ruleObjetExplorateur EOF )
            // InternalGame.g:1182:2: iv_ruleObjetExplorateur= ruleObjetExplorateur EOF
            {
             newCompositeNode(grammarAccess.getObjetExplorateurRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleObjetExplorateur=ruleObjetExplorateur();

            state._fsp--;

             current =iv_ruleObjetExplorateur; 
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
    // $ANTLR end "entryRuleObjetExplorateur"


    // $ANTLR start "ruleObjetExplorateur"
    // InternalGame.g:1188:1: ruleObjetExplorateur returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_taille_1_0= RULE_INT ) ) ( (lv_quantite_2_0= RULE_INT ) ) (otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) ) ( (lv_conditionDescription_5_0= ruleCondition ) )? )? (otherlv_6= 'transformable' ( (lv_transformable_7_0= ruleCondition ) )? )? ) ;
    public final EObject ruleObjetExplorateur() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_taille_1_0=null;
        Token lv_quantite_2_0=null;
        Token otherlv_3=null;
        Token lv_description_4_0=null;
        Token otherlv_6=null;
        EObject lv_conditionDescription_5_0 = null;

        EObject lv_transformable_7_0 = null;



        	enterRule();

        try {
            // InternalGame.g:1194:2: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_taille_1_0= RULE_INT ) ) ( (lv_quantite_2_0= RULE_INT ) ) (otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) ) ( (lv_conditionDescription_5_0= ruleCondition ) )? )? (otherlv_6= 'transformable' ( (lv_transformable_7_0= ruleCondition ) )? )? ) )
            // InternalGame.g:1195:2: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_taille_1_0= RULE_INT ) ) ( (lv_quantite_2_0= RULE_INT ) ) (otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) ) ( (lv_conditionDescription_5_0= ruleCondition ) )? )? (otherlv_6= 'transformable' ( (lv_transformable_7_0= ruleCondition ) )? )? )
            {
            // InternalGame.g:1195:2: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_taille_1_0= RULE_INT ) ) ( (lv_quantite_2_0= RULE_INT ) ) (otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) ) ( (lv_conditionDescription_5_0= ruleCondition ) )? )? (otherlv_6= 'transformable' ( (lv_transformable_7_0= ruleCondition ) )? )? )
            // InternalGame.g:1196:3: ( (lv_name_0_0= RULE_ID ) ) ( (lv_taille_1_0= RULE_INT ) ) ( (lv_quantite_2_0= RULE_INT ) ) (otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) ) ( (lv_conditionDescription_5_0= ruleCondition ) )? )? (otherlv_6= 'transformable' ( (lv_transformable_7_0= ruleCondition ) )? )?
            {
            // InternalGame.g:1196:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalGame.g:1197:4: (lv_name_0_0= RULE_ID )
            {
            // InternalGame.g:1197:4: (lv_name_0_0= RULE_ID )
            // InternalGame.g:1198:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_11); 

            					newLeafNode(lv_name_0_0, grammarAccess.getObjetExplorateurAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getObjetExplorateurRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalGame.g:1214:3: ( (lv_taille_1_0= RULE_INT ) )
            // InternalGame.g:1215:4: (lv_taille_1_0= RULE_INT )
            {
            // InternalGame.g:1215:4: (lv_taille_1_0= RULE_INT )
            // InternalGame.g:1216:5: lv_taille_1_0= RULE_INT
            {
            lv_taille_1_0=(Token)match(input,RULE_INT,FOLLOW_11); 

            					newLeafNode(lv_taille_1_0, grammarAccess.getObjetExplorateurAccess().getTailleINTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getObjetExplorateurRule());
            					}
            					setWithLastConsumed(
            						current,
            						"taille",
            						lv_taille_1_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            // InternalGame.g:1232:3: ( (lv_quantite_2_0= RULE_INT ) )
            // InternalGame.g:1233:4: (lv_quantite_2_0= RULE_INT )
            {
            // InternalGame.g:1233:4: (lv_quantite_2_0= RULE_INT )
            // InternalGame.g:1234:5: lv_quantite_2_0= RULE_INT
            {
            lv_quantite_2_0=(Token)match(input,RULE_INT,FOLLOW_34); 

            					newLeafNode(lv_quantite_2_0, grammarAccess.getObjetExplorateurAccess().getQuantiteINTTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getObjetExplorateurRule());
            					}
            					setWithLastConsumed(
            						current,
            						"quantite",
            						lv_quantite_2_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            // InternalGame.g:1250:3: (otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) ) ( (lv_conditionDescription_5_0= ruleCondition ) )? )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==20) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalGame.g:1251:4: otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) ) ( (lv_conditionDescription_5_0= ruleCondition ) )?
                    {
                    otherlv_3=(Token)match(input,20,FOLLOW_14); 

                    				newLeafNode(otherlv_3, grammarAccess.getObjetExplorateurAccess().getDescriptionKeyword_3_0());
                    			
                    // InternalGame.g:1255:4: ( (lv_description_4_0= RULE_STRING ) )
                    // InternalGame.g:1256:5: (lv_description_4_0= RULE_STRING )
                    {
                    // InternalGame.g:1256:5: (lv_description_4_0= RULE_STRING )
                    // InternalGame.g:1257:6: lv_description_4_0= RULE_STRING
                    {
                    lv_description_4_0=(Token)match(input,RULE_STRING,FOLLOW_35); 

                    						newLeafNode(lv_description_4_0, grammarAccess.getObjetExplorateurAccess().getDescriptionSTRINGTerminalRuleCall_3_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getObjetExplorateurRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"description",
                    							lv_description_4_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }

                    // InternalGame.g:1273:4: ( (lv_conditionDescription_5_0= ruleCondition ) )?
                    int alt28=2;
                    int LA28_0 = input.LA(1);

                    if ( (LA28_0==40) ) {
                        alt28=1;
                    }
                    switch (alt28) {
                        case 1 :
                            // InternalGame.g:1274:5: (lv_conditionDescription_5_0= ruleCondition )
                            {
                            // InternalGame.g:1274:5: (lv_conditionDescription_5_0= ruleCondition )
                            // InternalGame.g:1275:6: lv_conditionDescription_5_0= ruleCondition
                            {

                            						newCompositeNode(grammarAccess.getObjetExplorateurAccess().getConditionDescriptionConditionParserRuleCall_3_2_0());
                            					
                            pushFollow(FOLLOW_36);
                            lv_conditionDescription_5_0=ruleCondition();

                            state._fsp--;


                            						if (current==null) {
                            							current = createModelElementForParent(grammarAccess.getObjetExplorateurRule());
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

            // InternalGame.g:1293:3: (otherlv_6= 'transformable' ( (lv_transformable_7_0= ruleCondition ) )? )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==35) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalGame.g:1294:4: otherlv_6= 'transformable' ( (lv_transformable_7_0= ruleCondition ) )?
                    {
                    otherlv_6=(Token)match(input,35,FOLLOW_37); 

                    				newLeafNode(otherlv_6, grammarAccess.getObjetExplorateurAccess().getTransformableKeyword_4_0());
                    			
                    // InternalGame.g:1298:4: ( (lv_transformable_7_0= ruleCondition ) )?
                    int alt30=2;
                    int LA30_0 = input.LA(1);

                    if ( (LA30_0==40) ) {
                        alt30=1;
                    }
                    switch (alt30) {
                        case 1 :
                            // InternalGame.g:1299:5: (lv_transformable_7_0= ruleCondition )
                            {
                            // InternalGame.g:1299:5: (lv_transformable_7_0= ruleCondition )
                            // InternalGame.g:1300:6: lv_transformable_7_0= ruleCondition
                            {

                            						newCompositeNode(grammarAccess.getObjetExplorateurAccess().getTransformableConditionParserRuleCall_4_1_0());
                            					
                            pushFollow(FOLLOW_2);
                            lv_transformable_7_0=ruleCondition();

                            state._fsp--;


                            						if (current==null) {
                            							current = createModelElementForParent(grammarAccess.getObjetExplorateurRule());
                            						}
                            						set(
                            							current,
                            							"transformable",
                            							lv_transformable_7_0,
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
    // $ANTLR end "ruleObjetExplorateur"


    // $ANTLR start "entryRuleObjetLieu"
    // InternalGame.g:1322:1: entryRuleObjetLieu returns [EObject current=null] : iv_ruleObjetLieu= ruleObjetLieu EOF ;
    public final EObject entryRuleObjetLieu() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObjetLieu = null;


        try {
            // InternalGame.g:1322:50: (iv_ruleObjetLieu= ruleObjetLieu EOF )
            // InternalGame.g:1323:2: iv_ruleObjetLieu= ruleObjetLieu EOF
            {
             newCompositeNode(grammarAccess.getObjetLieuRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleObjetLieu=ruleObjetLieu();

            state._fsp--;

             current =iv_ruleObjetLieu; 
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
    // $ANTLR end "entryRuleObjetLieu"


    // $ANTLR start "ruleObjetLieu"
    // InternalGame.g:1329:1: ruleObjetLieu returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_taille_1_0= RULE_INT ) ) ( (lv_quantite_2_0= RULE_INT ) ) (otherlv_3= 'transmission' ( (lv_conditionTransmission_4_0= ruleCondition ) )? )? (otherlv_5= 'consommation' ( (lv_conditionConsommation_6_0= ruleCondition ) )? )? (otherlv_7= 'description' ( (lv_description_8_0= RULE_STRING ) ) ( (lv_conditionDescription_9_0= ruleCondition ) )? )? (otherlv_10= 'transformable' ( (lv_transformable_11_0= ruleCondition ) )? )? ) ;
    public final EObject ruleObjetLieu() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_taille_1_0=null;
        Token lv_quantite_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token lv_description_8_0=null;
        Token otherlv_10=null;
        EObject lv_conditionTransmission_4_0 = null;

        EObject lv_conditionConsommation_6_0 = null;

        EObject lv_conditionDescription_9_0 = null;

        EObject lv_transformable_11_0 = null;



        	enterRule();

        try {
            // InternalGame.g:1335:2: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_taille_1_0= RULE_INT ) ) ( (lv_quantite_2_0= RULE_INT ) ) (otherlv_3= 'transmission' ( (lv_conditionTransmission_4_0= ruleCondition ) )? )? (otherlv_5= 'consommation' ( (lv_conditionConsommation_6_0= ruleCondition ) )? )? (otherlv_7= 'description' ( (lv_description_8_0= RULE_STRING ) ) ( (lv_conditionDescription_9_0= ruleCondition ) )? )? (otherlv_10= 'transformable' ( (lv_transformable_11_0= ruleCondition ) )? )? ) )
            // InternalGame.g:1336:2: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_taille_1_0= RULE_INT ) ) ( (lv_quantite_2_0= RULE_INT ) ) (otherlv_3= 'transmission' ( (lv_conditionTransmission_4_0= ruleCondition ) )? )? (otherlv_5= 'consommation' ( (lv_conditionConsommation_6_0= ruleCondition ) )? )? (otherlv_7= 'description' ( (lv_description_8_0= RULE_STRING ) ) ( (lv_conditionDescription_9_0= ruleCondition ) )? )? (otherlv_10= 'transformable' ( (lv_transformable_11_0= ruleCondition ) )? )? )
            {
            // InternalGame.g:1336:2: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_taille_1_0= RULE_INT ) ) ( (lv_quantite_2_0= RULE_INT ) ) (otherlv_3= 'transmission' ( (lv_conditionTransmission_4_0= ruleCondition ) )? )? (otherlv_5= 'consommation' ( (lv_conditionConsommation_6_0= ruleCondition ) )? )? (otherlv_7= 'description' ( (lv_description_8_0= RULE_STRING ) ) ( (lv_conditionDescription_9_0= ruleCondition ) )? )? (otherlv_10= 'transformable' ( (lv_transformable_11_0= ruleCondition ) )? )? )
            // InternalGame.g:1337:3: ( (lv_name_0_0= RULE_ID ) ) ( (lv_taille_1_0= RULE_INT ) ) ( (lv_quantite_2_0= RULE_INT ) ) (otherlv_3= 'transmission' ( (lv_conditionTransmission_4_0= ruleCondition ) )? )? (otherlv_5= 'consommation' ( (lv_conditionConsommation_6_0= ruleCondition ) )? )? (otherlv_7= 'description' ( (lv_description_8_0= RULE_STRING ) ) ( (lv_conditionDescription_9_0= ruleCondition ) )? )? (otherlv_10= 'transformable' ( (lv_transformable_11_0= ruleCondition ) )? )?
            {
            // InternalGame.g:1337:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalGame.g:1338:4: (lv_name_0_0= RULE_ID )
            {
            // InternalGame.g:1338:4: (lv_name_0_0= RULE_ID )
            // InternalGame.g:1339:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_11); 

            					newLeafNode(lv_name_0_0, grammarAccess.getObjetLieuAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getObjetLieuRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalGame.g:1355:3: ( (lv_taille_1_0= RULE_INT ) )
            // InternalGame.g:1356:4: (lv_taille_1_0= RULE_INT )
            {
            // InternalGame.g:1356:4: (lv_taille_1_0= RULE_INT )
            // InternalGame.g:1357:5: lv_taille_1_0= RULE_INT
            {
            lv_taille_1_0=(Token)match(input,RULE_INT,FOLLOW_11); 

            					newLeafNode(lv_taille_1_0, grammarAccess.getObjetLieuAccess().getTailleINTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getObjetLieuRule());
            					}
            					setWithLastConsumed(
            						current,
            						"taille",
            						lv_taille_1_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            // InternalGame.g:1373:3: ( (lv_quantite_2_0= RULE_INT ) )
            // InternalGame.g:1374:4: (lv_quantite_2_0= RULE_INT )
            {
            // InternalGame.g:1374:4: (lv_quantite_2_0= RULE_INT )
            // InternalGame.g:1375:5: lv_quantite_2_0= RULE_INT
            {
            lv_quantite_2_0=(Token)match(input,RULE_INT,FOLLOW_38); 

            					newLeafNode(lv_quantite_2_0, grammarAccess.getObjetLieuAccess().getQuantiteINTTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getObjetLieuRule());
            					}
            					setWithLastConsumed(
            						current,
            						"quantite",
            						lv_quantite_2_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            // InternalGame.g:1391:3: (otherlv_3= 'transmission' ( (lv_conditionTransmission_4_0= ruleCondition ) )? )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==36) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalGame.g:1392:4: otherlv_3= 'transmission' ( (lv_conditionTransmission_4_0= ruleCondition ) )?
                    {
                    otherlv_3=(Token)match(input,36,FOLLOW_39); 

                    				newLeafNode(otherlv_3, grammarAccess.getObjetLieuAccess().getTransmissionKeyword_3_0());
                    			
                    // InternalGame.g:1396:4: ( (lv_conditionTransmission_4_0= ruleCondition ) )?
                    int alt32=2;
                    int LA32_0 = input.LA(1);

                    if ( (LA32_0==40) ) {
                        alt32=1;
                    }
                    switch (alt32) {
                        case 1 :
                            // InternalGame.g:1397:5: (lv_conditionTransmission_4_0= ruleCondition )
                            {
                            // InternalGame.g:1397:5: (lv_conditionTransmission_4_0= ruleCondition )
                            // InternalGame.g:1398:6: lv_conditionTransmission_4_0= ruleCondition
                            {

                            						newCompositeNode(grammarAccess.getObjetLieuAccess().getConditionTransmissionConditionParserRuleCall_3_1_0());
                            					
                            pushFollow(FOLLOW_40);
                            lv_conditionTransmission_4_0=ruleCondition();

                            state._fsp--;


                            						if (current==null) {
                            							current = createModelElementForParent(grammarAccess.getObjetLieuRule());
                            						}
                            						set(
                            							current,
                            							"conditionTransmission",
                            							lv_conditionTransmission_4_0,
                            							"fr.n7.Game.Condition");
                            						afterParserOrEnumRuleCall();
                            					

                            }


                            }
                            break;

                    }


                    }
                    break;

            }

            // InternalGame.g:1416:3: (otherlv_5= 'consommation' ( (lv_conditionConsommation_6_0= ruleCondition ) )? )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==37) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalGame.g:1417:4: otherlv_5= 'consommation' ( (lv_conditionConsommation_6_0= ruleCondition ) )?
                    {
                    otherlv_5=(Token)match(input,37,FOLLOW_41); 

                    				newLeafNode(otherlv_5, grammarAccess.getObjetLieuAccess().getConsommationKeyword_4_0());
                    			
                    // InternalGame.g:1421:4: ( (lv_conditionConsommation_6_0= ruleCondition ) )?
                    int alt34=2;
                    int LA34_0 = input.LA(1);

                    if ( (LA34_0==40) ) {
                        alt34=1;
                    }
                    switch (alt34) {
                        case 1 :
                            // InternalGame.g:1422:5: (lv_conditionConsommation_6_0= ruleCondition )
                            {
                            // InternalGame.g:1422:5: (lv_conditionConsommation_6_0= ruleCondition )
                            // InternalGame.g:1423:6: lv_conditionConsommation_6_0= ruleCondition
                            {

                            						newCompositeNode(grammarAccess.getObjetLieuAccess().getConditionConsommationConditionParserRuleCall_4_1_0());
                            					
                            pushFollow(FOLLOW_34);
                            lv_conditionConsommation_6_0=ruleCondition();

                            state._fsp--;


                            						if (current==null) {
                            							current = createModelElementForParent(grammarAccess.getObjetLieuRule());
                            						}
                            						set(
                            							current,
                            							"conditionConsommation",
                            							lv_conditionConsommation_6_0,
                            							"fr.n7.Game.Condition");
                            						afterParserOrEnumRuleCall();
                            					

                            }


                            }
                            break;

                    }


                    }
                    break;

            }

            // InternalGame.g:1441:3: (otherlv_7= 'description' ( (lv_description_8_0= RULE_STRING ) ) ( (lv_conditionDescription_9_0= ruleCondition ) )? )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==20) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalGame.g:1442:4: otherlv_7= 'description' ( (lv_description_8_0= RULE_STRING ) ) ( (lv_conditionDescription_9_0= ruleCondition ) )?
                    {
                    otherlv_7=(Token)match(input,20,FOLLOW_14); 

                    				newLeafNode(otherlv_7, grammarAccess.getObjetLieuAccess().getDescriptionKeyword_5_0());
                    			
                    // InternalGame.g:1446:4: ( (lv_description_8_0= RULE_STRING ) )
                    // InternalGame.g:1447:5: (lv_description_8_0= RULE_STRING )
                    {
                    // InternalGame.g:1447:5: (lv_description_8_0= RULE_STRING )
                    // InternalGame.g:1448:6: lv_description_8_0= RULE_STRING
                    {
                    lv_description_8_0=(Token)match(input,RULE_STRING,FOLLOW_35); 

                    						newLeafNode(lv_description_8_0, grammarAccess.getObjetLieuAccess().getDescriptionSTRINGTerminalRuleCall_5_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getObjetLieuRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"description",
                    							lv_description_8_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }

                    // InternalGame.g:1464:4: ( (lv_conditionDescription_9_0= ruleCondition ) )?
                    int alt36=2;
                    int LA36_0 = input.LA(1);

                    if ( (LA36_0==40) ) {
                        alt36=1;
                    }
                    switch (alt36) {
                        case 1 :
                            // InternalGame.g:1465:5: (lv_conditionDescription_9_0= ruleCondition )
                            {
                            // InternalGame.g:1465:5: (lv_conditionDescription_9_0= ruleCondition )
                            // InternalGame.g:1466:6: lv_conditionDescription_9_0= ruleCondition
                            {

                            						newCompositeNode(grammarAccess.getObjetLieuAccess().getConditionDescriptionConditionParserRuleCall_5_2_0());
                            					
                            pushFollow(FOLLOW_36);
                            lv_conditionDescription_9_0=ruleCondition();

                            state._fsp--;


                            						if (current==null) {
                            							current = createModelElementForParent(grammarAccess.getObjetLieuRule());
                            						}
                            						set(
                            							current,
                            							"conditionDescription",
                            							lv_conditionDescription_9_0,
                            							"fr.n7.Game.Condition");
                            						afterParserOrEnumRuleCall();
                            					

                            }


                            }
                            break;

                    }


                    }
                    break;

            }

            // InternalGame.g:1484:3: (otherlv_10= 'transformable' ( (lv_transformable_11_0= ruleCondition ) )? )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==35) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalGame.g:1485:4: otherlv_10= 'transformable' ( (lv_transformable_11_0= ruleCondition ) )?
                    {
                    otherlv_10=(Token)match(input,35,FOLLOW_37); 

                    				newLeafNode(otherlv_10, grammarAccess.getObjetLieuAccess().getTransformableKeyword_6_0());
                    			
                    // InternalGame.g:1489:4: ( (lv_transformable_11_0= ruleCondition ) )?
                    int alt38=2;
                    int LA38_0 = input.LA(1);

                    if ( (LA38_0==40) ) {
                        alt38=1;
                    }
                    switch (alt38) {
                        case 1 :
                            // InternalGame.g:1490:5: (lv_transformable_11_0= ruleCondition )
                            {
                            // InternalGame.g:1490:5: (lv_transformable_11_0= ruleCondition )
                            // InternalGame.g:1491:6: lv_transformable_11_0= ruleCondition
                            {

                            						newCompositeNode(grammarAccess.getObjetLieuAccess().getTransformableConditionParserRuleCall_6_1_0());
                            					
                            pushFollow(FOLLOW_2);
                            lv_transformable_11_0=ruleCondition();

                            state._fsp--;


                            						if (current==null) {
                            							current = createModelElementForParent(grammarAccess.getObjetLieuRule());
                            						}
                            						set(
                            							current,
                            							"transformable",
                            							lv_transformable_11_0,
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
    // $ANTLR end "ruleObjetLieu"


    // $ANTLR start "entryRuleObjetsExplorateur"
    // InternalGame.g:1513:1: entryRuleObjetsExplorateur returns [EObject current=null] : iv_ruleObjetsExplorateur= ruleObjetsExplorateur EOF ;
    public final EObject entryRuleObjetsExplorateur() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObjetsExplorateur = null;


        try {
            // InternalGame.g:1513:58: (iv_ruleObjetsExplorateur= ruleObjetsExplorateur EOF )
            // InternalGame.g:1514:2: iv_ruleObjetsExplorateur= ruleObjetsExplorateur EOF
            {
             newCompositeNode(grammarAccess.getObjetsExplorateurRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleObjetsExplorateur=ruleObjetsExplorateur();

            state._fsp--;

             current =iv_ruleObjetsExplorateur; 
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
    // $ANTLR end "entryRuleObjetsExplorateur"


    // $ANTLR start "ruleObjetsExplorateur"
    // InternalGame.g:1520:1: ruleObjetsExplorateur returns [EObject current=null] : (otherlv_0= 'objetsE' otherlv_1= '{' ( (lv_listeObjets_2_0= ruleObjetExplorateur ) )* otherlv_3= '}' ) ;
    public final EObject ruleObjetsExplorateur() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_listeObjets_2_0 = null;



        	enterRule();

        try {
            // InternalGame.g:1526:2: ( (otherlv_0= 'objetsE' otherlv_1= '{' ( (lv_listeObjets_2_0= ruleObjetExplorateur ) )* otherlv_3= '}' ) )
            // InternalGame.g:1527:2: (otherlv_0= 'objetsE' otherlv_1= '{' ( (lv_listeObjets_2_0= ruleObjetExplorateur ) )* otherlv_3= '}' )
            {
            // InternalGame.g:1527:2: (otherlv_0= 'objetsE' otherlv_1= '{' ( (lv_listeObjets_2_0= ruleObjetExplorateur ) )* otherlv_3= '}' )
            // InternalGame.g:1528:3: otherlv_0= 'objetsE' otherlv_1= '{' ( (lv_listeObjets_2_0= ruleObjetExplorateur ) )* otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,38,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getObjetsExplorateurAccess().getObjetsEKeyword_0());
            		
            otherlv_1=(Token)match(input,14,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getObjetsExplorateurAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalGame.g:1536:3: ( (lv_listeObjets_2_0= ruleObjetExplorateur ) )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==RULE_ID) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // InternalGame.g:1537:4: (lv_listeObjets_2_0= ruleObjetExplorateur )
            	    {
            	    // InternalGame.g:1537:4: (lv_listeObjets_2_0= ruleObjetExplorateur )
            	    // InternalGame.g:1538:5: lv_listeObjets_2_0= ruleObjetExplorateur
            	    {

            	    					newCompositeNode(grammarAccess.getObjetsExplorateurAccess().getListeObjetsObjetExplorateurParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_12);
            	    lv_listeObjets_2_0=ruleObjetExplorateur();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getObjetsExplorateurRule());
            	    					}
            	    					set(
            	    						current,
            	    						"listeObjets",
            	    						lv_listeObjets_2_0,
            	    						"fr.n7.Game.ObjetExplorateur");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop40;
                }
            } while (true);

            otherlv_3=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getObjetsExplorateurAccess().getRightCurlyBracketKeyword_3());
            		

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
    // $ANTLR end "ruleObjetsExplorateur"


    // $ANTLR start "entryRuleObjetsLieu"
    // InternalGame.g:1563:1: entryRuleObjetsLieu returns [EObject current=null] : iv_ruleObjetsLieu= ruleObjetsLieu EOF ;
    public final EObject entryRuleObjetsLieu() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObjetsLieu = null;


        try {
            // InternalGame.g:1563:51: (iv_ruleObjetsLieu= ruleObjetsLieu EOF )
            // InternalGame.g:1564:2: iv_ruleObjetsLieu= ruleObjetsLieu EOF
            {
             newCompositeNode(grammarAccess.getObjetsLieuRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleObjetsLieu=ruleObjetsLieu();

            state._fsp--;

             current =iv_ruleObjetsLieu; 
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
    // $ANTLR end "entryRuleObjetsLieu"


    // $ANTLR start "ruleObjetsLieu"
    // InternalGame.g:1570:1: ruleObjetsLieu returns [EObject current=null] : (otherlv_0= 'objetsL' otherlv_1= '{' ( (lv_listeObjets_2_0= ruleObjetLieu ) )* otherlv_3= '}' ) ;
    public final EObject ruleObjetsLieu() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_listeObjets_2_0 = null;



        	enterRule();

        try {
            // InternalGame.g:1576:2: ( (otherlv_0= 'objetsL' otherlv_1= '{' ( (lv_listeObjets_2_0= ruleObjetLieu ) )* otherlv_3= '}' ) )
            // InternalGame.g:1577:2: (otherlv_0= 'objetsL' otherlv_1= '{' ( (lv_listeObjets_2_0= ruleObjetLieu ) )* otherlv_3= '}' )
            {
            // InternalGame.g:1577:2: (otherlv_0= 'objetsL' otherlv_1= '{' ( (lv_listeObjets_2_0= ruleObjetLieu ) )* otherlv_3= '}' )
            // InternalGame.g:1578:3: otherlv_0= 'objetsL' otherlv_1= '{' ( (lv_listeObjets_2_0= ruleObjetLieu ) )* otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,39,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getObjetsLieuAccess().getObjetsLKeyword_0());
            		
            otherlv_1=(Token)match(input,14,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getObjetsLieuAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalGame.g:1586:3: ( (lv_listeObjets_2_0= ruleObjetLieu ) )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==RULE_ID) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // InternalGame.g:1587:4: (lv_listeObjets_2_0= ruleObjetLieu )
            	    {
            	    // InternalGame.g:1587:4: (lv_listeObjets_2_0= ruleObjetLieu )
            	    // InternalGame.g:1588:5: lv_listeObjets_2_0= ruleObjetLieu
            	    {

            	    					newCompositeNode(grammarAccess.getObjetsLieuAccess().getListeObjetsObjetLieuParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_12);
            	    lv_listeObjets_2_0=ruleObjetLieu();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getObjetsLieuRule());
            	    					}
            	    					set(
            	    						current,
            	    						"listeObjets",
            	    						lv_listeObjets_2_0,
            	    						"fr.n7.Game.ObjetLieu");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop41;
                }
            } while (true);

            otherlv_3=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getObjetsLieuAccess().getRightCurlyBracketKeyword_3());
            		

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
    // $ANTLR end "ruleObjetsLieu"


    // $ANTLR start "entryRuleConnaissances"
    // InternalGame.g:1613:1: entryRuleConnaissances returns [EObject current=null] : iv_ruleConnaissances= ruleConnaissances EOF ;
    public final EObject entryRuleConnaissances() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConnaissances = null;


        try {
            // InternalGame.g:1613:54: (iv_ruleConnaissances= ruleConnaissances EOF )
            // InternalGame.g:1614:2: iv_ruleConnaissances= ruleConnaissances EOF
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
    // InternalGame.g:1620:1: ruleConnaissances returns [EObject current=null] : (otherlv_0= 'connaissances' otherlv_1= '{' ( (lv_listeConnaissances_2_0= ruleConnaissance ) )* otherlv_3= '}' ) ;
    public final EObject ruleConnaissances() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_listeConnaissances_2_0 = null;



        	enterRule();

        try {
            // InternalGame.g:1626:2: ( (otherlv_0= 'connaissances' otherlv_1= '{' ( (lv_listeConnaissances_2_0= ruleConnaissance ) )* otherlv_3= '}' ) )
            // InternalGame.g:1627:2: (otherlv_0= 'connaissances' otherlv_1= '{' ( (lv_listeConnaissances_2_0= ruleConnaissance ) )* otherlv_3= '}' )
            {
            // InternalGame.g:1627:2: (otherlv_0= 'connaissances' otherlv_1= '{' ( (lv_listeConnaissances_2_0= ruleConnaissance ) )* otherlv_3= '}' )
            // InternalGame.g:1628:3: otherlv_0= 'connaissances' otherlv_1= '{' ( (lv_listeConnaissances_2_0= ruleConnaissance ) )* otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getConnaissancesAccess().getConnaissancesKeyword_0());
            		
            otherlv_1=(Token)match(input,14,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getConnaissancesAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalGame.g:1636:3: ( (lv_listeConnaissances_2_0= ruleConnaissance ) )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==RULE_ID) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // InternalGame.g:1637:4: (lv_listeConnaissances_2_0= ruleConnaissance )
            	    {
            	    // InternalGame.g:1637:4: (lv_listeConnaissances_2_0= ruleConnaissance )
            	    // InternalGame.g:1638:5: lv_listeConnaissances_2_0= ruleConnaissance
            	    {

            	    					newCompositeNode(grammarAccess.getConnaissancesAccess().getListeConnaissancesConnaissanceParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_12);
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
            	    break loop42;
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
    // InternalGame.g:1663:1: entryRuleConnaissance returns [EObject current=null] : iv_ruleConnaissance= ruleConnaissance EOF ;
    public final EObject entryRuleConnaissance() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConnaissance = null;


        try {
            // InternalGame.g:1663:53: (iv_ruleConnaissance= ruleConnaissance EOF )
            // InternalGame.g:1664:2: iv_ruleConnaissance= ruleConnaissance EOF
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
    // InternalGame.g:1670:1: ruleConnaissance returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'description' ( (lv_description_2_0= RULE_STRING ) ) ( (lv_conditionConnaissance_3_0= ruleCondition ) )? )? ) ;
    public final EObject ruleConnaissance() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_description_2_0=null;
        EObject lv_conditionConnaissance_3_0 = null;



        	enterRule();

        try {
            // InternalGame.g:1676:2: ( ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'description' ( (lv_description_2_0= RULE_STRING ) ) ( (lv_conditionConnaissance_3_0= ruleCondition ) )? )? ) )
            // InternalGame.g:1677:2: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'description' ( (lv_description_2_0= RULE_STRING ) ) ( (lv_conditionConnaissance_3_0= ruleCondition ) )? )? )
            {
            // InternalGame.g:1677:2: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'description' ( (lv_description_2_0= RULE_STRING ) ) ( (lv_conditionConnaissance_3_0= ruleCondition ) )? )? )
            // InternalGame.g:1678:3: ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'description' ( (lv_description_2_0= RULE_STRING ) ) ( (lv_conditionConnaissance_3_0= ruleCondition ) )? )?
            {
            // InternalGame.g:1678:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalGame.g:1679:4: (lv_name_0_0= RULE_ID )
            {
            // InternalGame.g:1679:4: (lv_name_0_0= RULE_ID )
            // InternalGame.g:1680:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_42); 

            					newLeafNode(lv_name_0_0, grammarAccess.getConnaissanceAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConnaissanceRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalGame.g:1696:3: (otherlv_1= 'description' ( (lv_description_2_0= RULE_STRING ) ) ( (lv_conditionConnaissance_3_0= ruleCondition ) )? )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==20) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalGame.g:1697:4: otherlv_1= 'description' ( (lv_description_2_0= RULE_STRING ) ) ( (lv_conditionConnaissance_3_0= ruleCondition ) )?
                    {
                    otherlv_1=(Token)match(input,20,FOLLOW_14); 

                    				newLeafNode(otherlv_1, grammarAccess.getConnaissanceAccess().getDescriptionKeyword_1_0());
                    			
                    // InternalGame.g:1701:4: ( (lv_description_2_0= RULE_STRING ) )
                    // InternalGame.g:1702:5: (lv_description_2_0= RULE_STRING )
                    {
                    // InternalGame.g:1702:5: (lv_description_2_0= RULE_STRING )
                    // InternalGame.g:1703:6: lv_description_2_0= RULE_STRING
                    {
                    lv_description_2_0=(Token)match(input,RULE_STRING,FOLLOW_37); 

                    						newLeafNode(lv_description_2_0, grammarAccess.getConnaissanceAccess().getDescriptionSTRINGTerminalRuleCall_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getConnaissanceRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"description",
                    							lv_description_2_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }

                    // InternalGame.g:1719:4: ( (lv_conditionConnaissance_3_0= ruleCondition ) )?
                    int alt43=2;
                    int LA43_0 = input.LA(1);

                    if ( (LA43_0==40) ) {
                        alt43=1;
                    }
                    switch (alt43) {
                        case 1 :
                            // InternalGame.g:1720:5: (lv_conditionConnaissance_3_0= ruleCondition )
                            {
                            // InternalGame.g:1720:5: (lv_conditionConnaissance_3_0= ruleCondition )
                            // InternalGame.g:1721:6: lv_conditionConnaissance_3_0= ruleCondition
                            {

                            						newCompositeNode(grammarAccess.getConnaissanceAccess().getConditionConnaissanceConditionParserRuleCall_1_2_0());
                            					
                            pushFollow(FOLLOW_2);
                            lv_conditionConnaissance_3_0=ruleCondition();

                            state._fsp--;


                            						if (current==null) {
                            							current = createModelElementForParent(grammarAccess.getConnaissanceRule());
                            						}
                            						set(
                            							current,
                            							"conditionConnaissance",
                            							lv_conditionConnaissance_3_0,
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
    // InternalGame.g:1743:1: entryRuleCondition returns [EObject current=null] : iv_ruleCondition= ruleCondition EOF ;
    public final EObject entryRuleCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCondition = null;


        try {
            // InternalGame.g:1743:50: (iv_ruleCondition= ruleCondition EOF )
            // InternalGame.g:1744:2: iv_ruleCondition= ruleCondition EOF
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
    // InternalGame.g:1750:1: ruleCondition returns [EObject current=null] : (otherlv_0= 'condition' ( (lv_name_1_0= RULE_ID ) ) ( (lv_condition_2_0= RULE_COND ) ) ) ;
    public final EObject ruleCondition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_condition_2_0=null;


        	enterRule();

        try {
            // InternalGame.g:1756:2: ( (otherlv_0= 'condition' ( (lv_name_1_0= RULE_ID ) ) ( (lv_condition_2_0= RULE_COND ) ) ) )
            // InternalGame.g:1757:2: (otherlv_0= 'condition' ( (lv_name_1_0= RULE_ID ) ) ( (lv_condition_2_0= RULE_COND ) ) )
            {
            // InternalGame.g:1757:2: (otherlv_0= 'condition' ( (lv_name_1_0= RULE_ID ) ) ( (lv_condition_2_0= RULE_COND ) ) )
            // InternalGame.g:1758:3: otherlv_0= 'condition' ( (lv_name_1_0= RULE_ID ) ) ( (lv_condition_2_0= RULE_COND ) )
            {
            otherlv_0=(Token)match(input,40,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getConditionAccess().getConditionKeyword_0());
            		
            // InternalGame.g:1762:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalGame.g:1763:4: (lv_name_1_0= RULE_ID )
            {
            // InternalGame.g:1763:4: (lv_name_1_0= RULE_ID )
            // InternalGame.g:1764:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_43); 

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

            // InternalGame.g:1780:3: ( (lv_condition_2_0= RULE_COND ) )
            // InternalGame.g:1781:4: (lv_condition_2_0= RULE_COND )
            {
            // InternalGame.g:1781:4: (lv_condition_2_0= RULE_COND )
            // InternalGame.g:1782:5: lv_condition_2_0= RULE_COND
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


    // $ANTLR start "entryRuleChemins"
    // InternalGame.g:1802:1: entryRuleChemins returns [EObject current=null] : iv_ruleChemins= ruleChemins EOF ;
    public final EObject entryRuleChemins() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChemins = null;


        try {
            // InternalGame.g:1802:48: (iv_ruleChemins= ruleChemins EOF )
            // InternalGame.g:1803:2: iv_ruleChemins= ruleChemins EOF
            {
             newCompositeNode(grammarAccess.getCheminsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleChemins=ruleChemins();

            state._fsp--;

             current =iv_ruleChemins; 
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
    // $ANTLR end "entryRuleChemins"


    // $ANTLR start "ruleChemins"
    // InternalGame.g:1809:1: ruleChemins returns [EObject current=null] : (otherlv_0= 'chemins' otherlv_1= '{' ( (lv_listeChemins_2_0= ruleChemin ) )* otherlv_3= '}' ) ;
    public final EObject ruleChemins() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_listeChemins_2_0 = null;



        	enterRule();

        try {
            // InternalGame.g:1815:2: ( (otherlv_0= 'chemins' otherlv_1= '{' ( (lv_listeChemins_2_0= ruleChemin ) )* otherlv_3= '}' ) )
            // InternalGame.g:1816:2: (otherlv_0= 'chemins' otherlv_1= '{' ( (lv_listeChemins_2_0= ruleChemin ) )* otherlv_3= '}' )
            {
            // InternalGame.g:1816:2: (otherlv_0= 'chemins' otherlv_1= '{' ( (lv_listeChemins_2_0= ruleChemin ) )* otherlv_3= '}' )
            // InternalGame.g:1817:3: otherlv_0= 'chemins' otherlv_1= '{' ( (lv_listeChemins_2_0= ruleChemin ) )* otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,41,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getCheminsAccess().getCheminsKeyword_0());
            		
            otherlv_1=(Token)match(input,14,FOLLOW_44); 

            			newLeafNode(otherlv_1, grammarAccess.getCheminsAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalGame.g:1825:3: ( (lv_listeChemins_2_0= ruleChemin ) )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==42) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // InternalGame.g:1826:4: (lv_listeChemins_2_0= ruleChemin )
            	    {
            	    // InternalGame.g:1826:4: (lv_listeChemins_2_0= ruleChemin )
            	    // InternalGame.g:1827:5: lv_listeChemins_2_0= ruleChemin
            	    {

            	    					newCompositeNode(grammarAccess.getCheminsAccess().getListeCheminsCheminParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_44);
            	    lv_listeChemins_2_0=ruleChemin();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getCheminsRule());
            	    					}
            	    					set(
            	    						current,
            	    						"listeChemins",
            	    						lv_listeChemins_2_0,
            	    						"fr.n7.Game.Chemin");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop45;
                }
            } while (true);

            otherlv_3=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getCheminsAccess().getRightCurlyBracketKeyword_3());
            		

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
    // $ANTLR end "ruleChemins"


    // $ANTLR start "entryRuleChemin"
    // InternalGame.g:1852:1: entryRuleChemin returns [EObject current=null] : iv_ruleChemin= ruleChemin EOF ;
    public final EObject entryRuleChemin() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChemin = null;


        try {
            // InternalGame.g:1852:47: (iv_ruleChemin= ruleChemin EOF )
            // InternalGame.g:1853:2: iv_ruleChemin= ruleChemin EOF
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
    // InternalGame.g:1859:1: ruleChemin returns [EObject current=null] : (otherlv_0= 'chemin' otherlv_1= 'description' ( (lv_description_2_0= RULE_STRING ) ) ( (lv_conditionDescription_3_0= ruleCondition ) )? otherlv_4= 'destination' ( (lv_destination_5_0= ruleLieu ) ) (otherlv_6= 'obligatoire' ( (lv_obligatoire_7_0= ruleCondition ) ) )? (otherlv_8= 'visible' ( (lv_visible_9_0= ruleCondition ) ) )? (otherlv_10= 'ouvert' ( (lv_ouvert_11_0= ruleCondition ) ) )? ( (lv_listeConnaissances_12_0= ruleConnaissances ) )? ( (lv_listeObjets_13_0= ruleObjetsLieu ) )? ( (lv_listeObjetsConsommes_14_0= ruleObjetsExplorateur ) )? ) ;
    public final EObject ruleChemin() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_description_2_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        EObject lv_conditionDescription_3_0 = null;

        EObject lv_destination_5_0 = null;

        EObject lv_obligatoire_7_0 = null;

        EObject lv_visible_9_0 = null;

        EObject lv_ouvert_11_0 = null;

        EObject lv_listeConnaissances_12_0 = null;

        EObject lv_listeObjets_13_0 = null;

        EObject lv_listeObjetsConsommes_14_0 = null;



        	enterRule();

        try {
            // InternalGame.g:1865:2: ( (otherlv_0= 'chemin' otherlv_1= 'description' ( (lv_description_2_0= RULE_STRING ) ) ( (lv_conditionDescription_3_0= ruleCondition ) )? otherlv_4= 'destination' ( (lv_destination_5_0= ruleLieu ) ) (otherlv_6= 'obligatoire' ( (lv_obligatoire_7_0= ruleCondition ) ) )? (otherlv_8= 'visible' ( (lv_visible_9_0= ruleCondition ) ) )? (otherlv_10= 'ouvert' ( (lv_ouvert_11_0= ruleCondition ) ) )? ( (lv_listeConnaissances_12_0= ruleConnaissances ) )? ( (lv_listeObjets_13_0= ruleObjetsLieu ) )? ( (lv_listeObjetsConsommes_14_0= ruleObjetsExplorateur ) )? ) )
            // InternalGame.g:1866:2: (otherlv_0= 'chemin' otherlv_1= 'description' ( (lv_description_2_0= RULE_STRING ) ) ( (lv_conditionDescription_3_0= ruleCondition ) )? otherlv_4= 'destination' ( (lv_destination_5_0= ruleLieu ) ) (otherlv_6= 'obligatoire' ( (lv_obligatoire_7_0= ruleCondition ) ) )? (otherlv_8= 'visible' ( (lv_visible_9_0= ruleCondition ) ) )? (otherlv_10= 'ouvert' ( (lv_ouvert_11_0= ruleCondition ) ) )? ( (lv_listeConnaissances_12_0= ruleConnaissances ) )? ( (lv_listeObjets_13_0= ruleObjetsLieu ) )? ( (lv_listeObjetsConsommes_14_0= ruleObjetsExplorateur ) )? )
            {
            // InternalGame.g:1866:2: (otherlv_0= 'chemin' otherlv_1= 'description' ( (lv_description_2_0= RULE_STRING ) ) ( (lv_conditionDescription_3_0= ruleCondition ) )? otherlv_4= 'destination' ( (lv_destination_5_0= ruleLieu ) ) (otherlv_6= 'obligatoire' ( (lv_obligatoire_7_0= ruleCondition ) ) )? (otherlv_8= 'visible' ( (lv_visible_9_0= ruleCondition ) ) )? (otherlv_10= 'ouvert' ( (lv_ouvert_11_0= ruleCondition ) ) )? ( (lv_listeConnaissances_12_0= ruleConnaissances ) )? ( (lv_listeObjets_13_0= ruleObjetsLieu ) )? ( (lv_listeObjetsConsommes_14_0= ruleObjetsExplorateur ) )? )
            // InternalGame.g:1867:3: otherlv_0= 'chemin' otherlv_1= 'description' ( (lv_description_2_0= RULE_STRING ) ) ( (lv_conditionDescription_3_0= ruleCondition ) )? otherlv_4= 'destination' ( (lv_destination_5_0= ruleLieu ) ) (otherlv_6= 'obligatoire' ( (lv_obligatoire_7_0= ruleCondition ) ) )? (otherlv_8= 'visible' ( (lv_visible_9_0= ruleCondition ) ) )? (otherlv_10= 'ouvert' ( (lv_ouvert_11_0= ruleCondition ) ) )? ( (lv_listeConnaissances_12_0= ruleConnaissances ) )? ( (lv_listeObjets_13_0= ruleObjetsLieu ) )? ( (lv_listeObjetsConsommes_14_0= ruleObjetsExplorateur ) )?
            {
            otherlv_0=(Token)match(input,42,FOLLOW_45); 

            			newLeafNode(otherlv_0, grammarAccess.getCheminAccess().getCheminKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getCheminAccess().getDescriptionKeyword_1());
            		
            // InternalGame.g:1875:3: ( (lv_description_2_0= RULE_STRING ) )
            // InternalGame.g:1876:4: (lv_description_2_0= RULE_STRING )
            {
            // InternalGame.g:1876:4: (lv_description_2_0= RULE_STRING )
            // InternalGame.g:1877:5: lv_description_2_0= RULE_STRING
            {
            lv_description_2_0=(Token)match(input,RULE_STRING,FOLLOW_46); 

            					newLeafNode(lv_description_2_0, grammarAccess.getCheminAccess().getDescriptionSTRINGTerminalRuleCall_2_0());
            				

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

            // InternalGame.g:1893:3: ( (lv_conditionDescription_3_0= ruleCondition ) )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==40) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalGame.g:1894:4: (lv_conditionDescription_3_0= ruleCondition )
                    {
                    // InternalGame.g:1894:4: (lv_conditionDescription_3_0= ruleCondition )
                    // InternalGame.g:1895:5: lv_conditionDescription_3_0= ruleCondition
                    {

                    					newCompositeNode(grammarAccess.getCheminAccess().getConditionDescriptionConditionParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_47);
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

            otherlv_4=(Token)match(input,43,FOLLOW_48); 

            			newLeafNode(otherlv_4, grammarAccess.getCheminAccess().getDestinationKeyword_4());
            		
            // InternalGame.g:1916:3: ( (lv_destination_5_0= ruleLieu ) )
            // InternalGame.g:1917:4: (lv_destination_5_0= ruleLieu )
            {
            // InternalGame.g:1917:4: (lv_destination_5_0= ruleLieu )
            // InternalGame.g:1918:5: lv_destination_5_0= ruleLieu
            {

            					newCompositeNode(grammarAccess.getCheminAccess().getDestinationLieuParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_49);
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

            // InternalGame.g:1935:3: (otherlv_6= 'obligatoire' ( (lv_obligatoire_7_0= ruleCondition ) ) )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==25) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalGame.g:1936:4: otherlv_6= 'obligatoire' ( (lv_obligatoire_7_0= ruleCondition ) )
                    {
                    otherlv_6=(Token)match(input,25,FOLLOW_17); 

                    				newLeafNode(otherlv_6, grammarAccess.getCheminAccess().getObligatoireKeyword_6_0());
                    			
                    // InternalGame.g:1940:4: ( (lv_obligatoire_7_0= ruleCondition ) )
                    // InternalGame.g:1941:5: (lv_obligatoire_7_0= ruleCondition )
                    {
                    // InternalGame.g:1941:5: (lv_obligatoire_7_0= ruleCondition )
                    // InternalGame.g:1942:6: lv_obligatoire_7_0= ruleCondition
                    {

                    						newCompositeNode(grammarAccess.getCheminAccess().getObligatoireConditionParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_50);
                    lv_obligatoire_7_0=ruleCondition();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCheminRule());
                    						}
                    						set(
                    							current,
                    							"obligatoire",
                    							lv_obligatoire_7_0,
                    							"fr.n7.Game.Condition");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalGame.g:1960:3: (otherlv_8= 'visible' ( (lv_visible_9_0= ruleCondition ) ) )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==24) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalGame.g:1961:4: otherlv_8= 'visible' ( (lv_visible_9_0= ruleCondition ) )
                    {
                    otherlv_8=(Token)match(input,24,FOLLOW_17); 

                    				newLeafNode(otherlv_8, grammarAccess.getCheminAccess().getVisibleKeyword_7_0());
                    			
                    // InternalGame.g:1965:4: ( (lv_visible_9_0= ruleCondition ) )
                    // InternalGame.g:1966:5: (lv_visible_9_0= ruleCondition )
                    {
                    // InternalGame.g:1966:5: (lv_visible_9_0= ruleCondition )
                    // InternalGame.g:1967:6: lv_visible_9_0= ruleCondition
                    {

                    						newCompositeNode(grammarAccess.getCheminAccess().getVisibleConditionParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_51);
                    lv_visible_9_0=ruleCondition();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCheminRule());
                    						}
                    						set(
                    							current,
                    							"visible",
                    							lv_visible_9_0,
                    							"fr.n7.Game.Condition");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalGame.g:1985:3: (otherlv_10= 'ouvert' ( (lv_ouvert_11_0= ruleCondition ) ) )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==44) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalGame.g:1986:4: otherlv_10= 'ouvert' ( (lv_ouvert_11_0= ruleCondition ) )
                    {
                    otherlv_10=(Token)match(input,44,FOLLOW_17); 

                    				newLeafNode(otherlv_10, grammarAccess.getCheminAccess().getOuvertKeyword_8_0());
                    			
                    // InternalGame.g:1990:4: ( (lv_ouvert_11_0= ruleCondition ) )
                    // InternalGame.g:1991:5: (lv_ouvert_11_0= ruleCondition )
                    {
                    // InternalGame.g:1991:5: (lv_ouvert_11_0= ruleCondition )
                    // InternalGame.g:1992:6: lv_ouvert_11_0= ruleCondition
                    {

                    						newCompositeNode(grammarAccess.getCheminAccess().getOuvertConditionParserRuleCall_8_1_0());
                    					
                    pushFollow(FOLLOW_52);
                    lv_ouvert_11_0=ruleCondition();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCheminRule());
                    						}
                    						set(
                    							current,
                    							"ouvert",
                    							lv_ouvert_11_0,
                    							"fr.n7.Game.Condition");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalGame.g:2010:3: ( (lv_listeConnaissances_12_0= ruleConnaissances ) )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==17) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalGame.g:2011:4: (lv_listeConnaissances_12_0= ruleConnaissances )
                    {
                    // InternalGame.g:2011:4: (lv_listeConnaissances_12_0= ruleConnaissances )
                    // InternalGame.g:2012:5: lv_listeConnaissances_12_0= ruleConnaissances
                    {

                    					newCompositeNode(grammarAccess.getCheminAccess().getListeConnaissancesConnaissancesParserRuleCall_9_0());
                    				
                    pushFollow(FOLLOW_53);
                    lv_listeConnaissances_12_0=ruleConnaissances();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getCheminRule());
                    					}
                    					set(
                    						current,
                    						"listeConnaissances",
                    						lv_listeConnaissances_12_0,
                    						"fr.n7.Game.Connaissances");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalGame.g:2029:3: ( (lv_listeObjets_13_0= ruleObjetsLieu ) )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==39) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalGame.g:2030:4: (lv_listeObjets_13_0= ruleObjetsLieu )
                    {
                    // InternalGame.g:2030:4: (lv_listeObjets_13_0= ruleObjetsLieu )
                    // InternalGame.g:2031:5: lv_listeObjets_13_0= ruleObjetsLieu
                    {

                    					newCompositeNode(grammarAccess.getCheminAccess().getListeObjetsObjetsLieuParserRuleCall_10_0());
                    				
                    pushFollow(FOLLOW_54);
                    lv_listeObjets_13_0=ruleObjetsLieu();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getCheminRule());
                    					}
                    					set(
                    						current,
                    						"listeObjets",
                    						lv_listeObjets_13_0,
                    						"fr.n7.Game.ObjetsLieu");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalGame.g:2048:3: ( (lv_listeObjetsConsommes_14_0= ruleObjetsExplorateur ) )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==38) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalGame.g:2049:4: (lv_listeObjetsConsommes_14_0= ruleObjetsExplorateur )
                    {
                    // InternalGame.g:2049:4: (lv_listeObjetsConsommes_14_0= ruleObjetsExplorateur )
                    // InternalGame.g:2050:5: lv_listeObjetsConsommes_14_0= ruleObjetsExplorateur
                    {

                    					newCompositeNode(grammarAccess.getCheminAccess().getListeObjetsConsommesObjetsExplorateurParserRuleCall_11_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_listeObjetsConsommes_14_0=ruleObjetsExplorateur();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getCheminRule());
                    					}
                    					set(
                    						current,
                    						"listeObjetsConsommes",
                    						lv_listeObjetsConsommes_14_0,
                    						"fr.n7.Game.ObjetsExplorateur");
                    					afterParserOrEnumRuleCall();
                    				

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
    // $ANTLR end "ruleChemin"


    // $ANTLR start "ruleTypeLieu"
    // InternalGame.g:2071:1: ruleTypeLieu returns [Enumerator current=null] : ( (enumLiteral_0= 'debut' ) | (enumLiteral_1= 'fin' ) | (enumLiteral_2= 'intermediaire' ) ) ;
    public final Enumerator ruleTypeLieu() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalGame.g:2077:2: ( ( (enumLiteral_0= 'debut' ) | (enumLiteral_1= 'fin' ) | (enumLiteral_2= 'intermediaire' ) ) )
            // InternalGame.g:2078:2: ( (enumLiteral_0= 'debut' ) | (enumLiteral_1= 'fin' ) | (enumLiteral_2= 'intermediaire' ) )
            {
            // InternalGame.g:2078:2: ( (enumLiteral_0= 'debut' ) | (enumLiteral_1= 'fin' ) | (enumLiteral_2= 'intermediaire' ) )
            int alt53=3;
            switch ( input.LA(1) ) {
            case 45:
                {
                alt53=1;
                }
                break;
            case 46:
                {
                alt53=2;
                }
                break;
            case 47:
                {
                alt53=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 53, 0, input);

                throw nvae;
            }

            switch (alt53) {
                case 1 :
                    // InternalGame.g:2079:3: (enumLiteral_0= 'debut' )
                    {
                    // InternalGame.g:2079:3: (enumLiteral_0= 'debut' )
                    // InternalGame.g:2080:4: enumLiteral_0= 'debut'
                    {
                    enumLiteral_0=(Token)match(input,45,FOLLOW_2); 

                    				current = grammarAccess.getTypeLieuAccess().getLieuDebutEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getTypeLieuAccess().getLieuDebutEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalGame.g:2087:3: (enumLiteral_1= 'fin' )
                    {
                    // InternalGame.g:2087:3: (enumLiteral_1= 'fin' )
                    // InternalGame.g:2088:4: enumLiteral_1= 'fin'
                    {
                    enumLiteral_1=(Token)match(input,46,FOLLOW_2); 

                    				current = grammarAccess.getTypeLieuAccess().getLieuFinEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getTypeLieuAccess().getLieuFinEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalGame.g:2095:3: (enumLiteral_2= 'intermediaire' )
                    {
                    // InternalGame.g:2095:3: (enumLiteral_2= 'intermediaire' )
                    // InternalGame.g:2096:4: enumLiteral_2= 'intermediaire'
                    {
                    enumLiteral_2=(Token)match(input,47,FOLLOW_2); 

                    				current = grammarAccess.getTypeLieuAccess().getLieuIntermediaireEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getTypeLieuAccess().getLieuIntermediaireEnumLiteralDeclaration_2());
                    			

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
    // $ANTLR end "ruleTypeLieu"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000E2C000430000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000E2C000438000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000040010L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000308010L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000010000208010L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000208010L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000808000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000007000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000010008000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x00000000E0008000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000040008040L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000040008000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000008040L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000010100020010L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000100020010L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000100000010L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000600008010L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000400008010L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000800100002L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000010800000002L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000003800100002L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000012800100002L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000002800100002L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000010800100002L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000040000008000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000090000000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000E00000000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x000010C003020002L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x000010C001020002L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x000010C000020002L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x000000C000020002L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x000000C000000002L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000004000000002L});

}