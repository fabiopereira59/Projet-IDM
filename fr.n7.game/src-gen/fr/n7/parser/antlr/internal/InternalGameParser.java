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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_BOOL", "RULE_COND", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'territoire'", "'{'", "'}'", "'explorateur'", "'connaissances'", "'position'", "'sac'", "'description'", "'depotO'", "'personnes'", "'visible'", "'obligatoire'", "'interaction'", "'texte'", "'choix'", "'choixdebut'", "'choixfin'", "'action'", "'donneC'", "'donneO'", "'attributionC'", "'attributionO'", "'consommeO'", "'quantiteO'", "'consommationC'", "'transformable'", "'transmission'", "'consommation'", "'objetsE'", "'objetsL'", "'conditions'", "'chemins'", "'source'", "'destination'", "'ouvert'", "'debut'", "'fin'", "'intermediaire'"
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

                if ( ((LA1_0>=16 && LA1_0<=17)||LA1_0==22||(LA1_0>=41 && LA1_0<=44)||(LA1_0>=48 && LA1_0<=50)) ) {
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
    // InternalGame.g:140:1: ruleterritoireElement returns [EObject current=null] : (this_Explorateur_0= ruleExplorateur | this_Lieu_1= ruleLieu | this_ObjetsExplorateur_2= ruleObjetsExplorateur | this_ObjetsLieu_3= ruleObjetsLieu | this_Connaissances_4= ruleConnaissances | this_Personnes_5= rulePersonnes | this_Chemins_6= ruleChemins | this_Conditions_7= ruleConditions ) ;
    public final EObject ruleterritoireElement() throws RecognitionException {
        EObject current = null;

        EObject this_Explorateur_0 = null;

        EObject this_Lieu_1 = null;

        EObject this_ObjetsExplorateur_2 = null;

        EObject this_ObjetsLieu_3 = null;

        EObject this_Connaissances_4 = null;

        EObject this_Personnes_5 = null;

        EObject this_Chemins_6 = null;

        EObject this_Conditions_7 = null;



        	enterRule();

        try {
            // InternalGame.g:146:2: ( (this_Explorateur_0= ruleExplorateur | this_Lieu_1= ruleLieu | this_ObjetsExplorateur_2= ruleObjetsExplorateur | this_ObjetsLieu_3= ruleObjetsLieu | this_Connaissances_4= ruleConnaissances | this_Personnes_5= rulePersonnes | this_Chemins_6= ruleChemins | this_Conditions_7= ruleConditions ) )
            // InternalGame.g:147:2: (this_Explorateur_0= ruleExplorateur | this_Lieu_1= ruleLieu | this_ObjetsExplorateur_2= ruleObjetsExplorateur | this_ObjetsLieu_3= ruleObjetsLieu | this_Connaissances_4= ruleConnaissances | this_Personnes_5= rulePersonnes | this_Chemins_6= ruleChemins | this_Conditions_7= ruleConditions )
            {
            // InternalGame.g:147:2: (this_Explorateur_0= ruleExplorateur | this_Lieu_1= ruleLieu | this_ObjetsExplorateur_2= ruleObjetsExplorateur | this_ObjetsLieu_3= ruleObjetsLieu | this_Connaissances_4= ruleConnaissances | this_Personnes_5= rulePersonnes | this_Chemins_6= ruleChemins | this_Conditions_7= ruleConditions )
            int alt2=8;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt2=1;
                }
                break;
            case 48:
            case 49:
            case 50:
                {
                alt2=2;
                }
                break;
            case 41:
                {
                alt2=3;
                }
                break;
            case 42:
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
            case 44:
                {
                alt2=7;
                }
                break;
            case 43:
                {
                alt2=8;
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
                case 8 :
                    // InternalGame.g:211:3: this_Conditions_7= ruleConditions
                    {

                    			newCompositeNode(grammarAccess.getTerritoireElementAccess().getConditionsParserRuleCall_7());
                    		
                    pushFollow(FOLLOW_2);
                    this_Conditions_7=ruleConditions();

                    state._fsp--;


                    			current = this_Conditions_7;
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
    // InternalGame.g:223:1: entryRuleExplorateur returns [EObject current=null] : iv_ruleExplorateur= ruleExplorateur EOF ;
    public final EObject entryRuleExplorateur() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExplorateur = null;


        try {
            // InternalGame.g:223:52: (iv_ruleExplorateur= ruleExplorateur EOF )
            // InternalGame.g:224:2: iv_ruleExplorateur= ruleExplorateur EOF
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
    // InternalGame.g:230:1: ruleExplorateur returns [EObject current=null] : (otherlv_0= 'explorateur' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_sac_3_0= ruleSac ) ) otherlv_4= 'connaissances' ( (otherlv_5= RULE_ID ) )* otherlv_6= 'position' ( (otherlv_7= RULE_ID ) ) otherlv_8= '}' ) ;
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
            // InternalGame.g:236:2: ( (otherlv_0= 'explorateur' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_sac_3_0= ruleSac ) ) otherlv_4= 'connaissances' ( (otherlv_5= RULE_ID ) )* otherlv_6= 'position' ( (otherlv_7= RULE_ID ) ) otherlv_8= '}' ) )
            // InternalGame.g:237:2: (otherlv_0= 'explorateur' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_sac_3_0= ruleSac ) ) otherlv_4= 'connaissances' ( (otherlv_5= RULE_ID ) )* otherlv_6= 'position' ( (otherlv_7= RULE_ID ) ) otherlv_8= '}' )
            {
            // InternalGame.g:237:2: (otherlv_0= 'explorateur' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_sac_3_0= ruleSac ) ) otherlv_4= 'connaissances' ( (otherlv_5= RULE_ID ) )* otherlv_6= 'position' ( (otherlv_7= RULE_ID ) ) otherlv_8= '}' )
            // InternalGame.g:238:3: otherlv_0= 'explorateur' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_sac_3_0= ruleSac ) ) otherlv_4= 'connaissances' ( (otherlv_5= RULE_ID ) )* otherlv_6= 'position' ( (otherlv_7= RULE_ID ) ) otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getExplorateurAccess().getExplorateurKeyword_0());
            		
            // InternalGame.g:242:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalGame.g:243:4: (lv_name_1_0= RULE_ID )
            {
            // InternalGame.g:243:4: (lv_name_1_0= RULE_ID )
            // InternalGame.g:244:5: lv_name_1_0= RULE_ID
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
            		
            // InternalGame.g:264:3: ( (lv_sac_3_0= ruleSac ) )
            // InternalGame.g:265:4: (lv_sac_3_0= ruleSac )
            {
            // InternalGame.g:265:4: (lv_sac_3_0= ruleSac )
            // InternalGame.g:266:5: lv_sac_3_0= ruleSac
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
            		
            // InternalGame.g:287:3: ( (otherlv_5= RULE_ID ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_ID) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalGame.g:288:4: (otherlv_5= RULE_ID )
            	    {
            	    // InternalGame.g:288:4: (otherlv_5= RULE_ID )
            	    // InternalGame.g:289:5: otherlv_5= RULE_ID
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
            		
            // InternalGame.g:304:3: ( (otherlv_7= RULE_ID ) )
            // InternalGame.g:305:4: (otherlv_7= RULE_ID )
            {
            // InternalGame.g:305:4: (otherlv_7= RULE_ID )
            // InternalGame.g:306:5: otherlv_7= RULE_ID
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
    // InternalGame.g:325:1: entryRuleSac returns [EObject current=null] : iv_ruleSac= ruleSac EOF ;
    public final EObject entryRuleSac() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSac = null;


        try {
            // InternalGame.g:325:44: (iv_ruleSac= ruleSac EOF )
            // InternalGame.g:326:2: iv_ruleSac= ruleSac EOF
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
    // InternalGame.g:332:1: ruleSac returns [EObject current=null] : (otherlv_0= 'sac' ( (lv_taille_1_0= RULE_INT ) ) otherlv_2= '{' ( (otherlv_3= RULE_ID ) )* otherlv_4= '}' ) ;
    public final EObject ruleSac() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_taille_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalGame.g:338:2: ( (otherlv_0= 'sac' ( (lv_taille_1_0= RULE_INT ) ) otherlv_2= '{' ( (otherlv_3= RULE_ID ) )* otherlv_4= '}' ) )
            // InternalGame.g:339:2: (otherlv_0= 'sac' ( (lv_taille_1_0= RULE_INT ) ) otherlv_2= '{' ( (otherlv_3= RULE_ID ) )* otherlv_4= '}' )
            {
            // InternalGame.g:339:2: (otherlv_0= 'sac' ( (lv_taille_1_0= RULE_INT ) ) otherlv_2= '{' ( (otherlv_3= RULE_ID ) )* otherlv_4= '}' )
            // InternalGame.g:340:3: otherlv_0= 'sac' ( (lv_taille_1_0= RULE_INT ) ) otherlv_2= '{' ( (otherlv_3= RULE_ID ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getSacAccess().getSacKeyword_0());
            		
            // InternalGame.g:344:3: ( (lv_taille_1_0= RULE_INT ) )
            // InternalGame.g:345:4: (lv_taille_1_0= RULE_INT )
            {
            // InternalGame.g:345:4: (lv_taille_1_0= RULE_INT )
            // InternalGame.g:346:5: lv_taille_1_0= RULE_INT
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
            		
            // InternalGame.g:366:3: ( (otherlv_3= RULE_ID ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_ID) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalGame.g:367:4: (otherlv_3= RULE_ID )
            	    {
            	    // InternalGame.g:367:4: (otherlv_3= RULE_ID )
            	    // InternalGame.g:368:5: otherlv_3= RULE_ID
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
    // InternalGame.g:387:1: entryRuleLieu returns [EObject current=null] : iv_ruleLieu= ruleLieu EOF ;
    public final EObject entryRuleLieu() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLieu = null;


        try {
            // InternalGame.g:387:45: (iv_ruleLieu= ruleLieu EOF )
            // InternalGame.g:388:2: iv_ruleLieu= ruleLieu EOF
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
    // InternalGame.g:394:1: ruleLieu returns [EObject current=null] : ( ( (lv_type_0_0= ruleTypeLieu ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) ) ( (lv_conditionDescription_5_0= ruleCondition ) )? )? ( (otherlv_6= RULE_ID ) )* ( (otherlv_7= RULE_ID ) )* ( (otherlv_8= RULE_ID ) )* (otherlv_9= 'depotO' ( (lv_depotObjet_10_0= ruleCondition ) ) )? ( (otherlv_11= RULE_ID ) )* otherlv_12= '}' ) ;
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
            // InternalGame.g:400:2: ( ( ( (lv_type_0_0= ruleTypeLieu ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) ) ( (lv_conditionDescription_5_0= ruleCondition ) )? )? ( (otherlv_6= RULE_ID ) )* ( (otherlv_7= RULE_ID ) )* ( (otherlv_8= RULE_ID ) )* (otherlv_9= 'depotO' ( (lv_depotObjet_10_0= ruleCondition ) ) )? ( (otherlv_11= RULE_ID ) )* otherlv_12= '}' ) )
            // InternalGame.g:401:2: ( ( (lv_type_0_0= ruleTypeLieu ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) ) ( (lv_conditionDescription_5_0= ruleCondition ) )? )? ( (otherlv_6= RULE_ID ) )* ( (otherlv_7= RULE_ID ) )* ( (otherlv_8= RULE_ID ) )* (otherlv_9= 'depotO' ( (lv_depotObjet_10_0= ruleCondition ) ) )? ( (otherlv_11= RULE_ID ) )* otherlv_12= '}' )
            {
            // InternalGame.g:401:2: ( ( (lv_type_0_0= ruleTypeLieu ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) ) ( (lv_conditionDescription_5_0= ruleCondition ) )? )? ( (otherlv_6= RULE_ID ) )* ( (otherlv_7= RULE_ID ) )* ( (otherlv_8= RULE_ID ) )* (otherlv_9= 'depotO' ( (lv_depotObjet_10_0= ruleCondition ) ) )? ( (otherlv_11= RULE_ID ) )* otherlv_12= '}' )
            // InternalGame.g:402:3: ( (lv_type_0_0= ruleTypeLieu ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) ) ( (lv_conditionDescription_5_0= ruleCondition ) )? )? ( (otherlv_6= RULE_ID ) )* ( (otherlv_7= RULE_ID ) )* ( (otherlv_8= RULE_ID ) )* (otherlv_9= 'depotO' ( (lv_depotObjet_10_0= ruleCondition ) ) )? ( (otherlv_11= RULE_ID ) )* otherlv_12= '}'
            {
            // InternalGame.g:402:3: ( (lv_type_0_0= ruleTypeLieu ) )
            // InternalGame.g:403:4: (lv_type_0_0= ruleTypeLieu )
            {
            // InternalGame.g:403:4: (lv_type_0_0= ruleTypeLieu )
            // InternalGame.g:404:5: lv_type_0_0= ruleTypeLieu
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

            // InternalGame.g:421:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalGame.g:422:4: (lv_name_1_0= RULE_ID )
            {
            // InternalGame.g:422:4: (lv_name_1_0= RULE_ID )
            // InternalGame.g:423:5: lv_name_1_0= RULE_ID
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
            		
            // InternalGame.g:443:3: (otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) ) ( (lv_conditionDescription_5_0= ruleCondition ) )? )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==20) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalGame.g:444:4: otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) ) ( (lv_conditionDescription_5_0= ruleCondition ) )?
                    {
                    otherlv_3=(Token)match(input,20,FOLLOW_14); 

                    				newLeafNode(otherlv_3, grammarAccess.getLieuAccess().getDescriptionKeyword_3_0());
                    			
                    // InternalGame.g:448:4: ( (lv_description_4_0= RULE_STRING ) )
                    // InternalGame.g:449:5: (lv_description_4_0= RULE_STRING )
                    {
                    // InternalGame.g:449:5: (lv_description_4_0= RULE_STRING )
                    // InternalGame.g:450:6: lv_description_4_0= RULE_STRING
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

                    // InternalGame.g:466:4: ( (lv_conditionDescription_5_0= ruleCondition ) )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0==RULE_ID) ) {
                        int LA5_1 = input.LA(2);

                        if ( (LA5_1==RULE_STRING) ) {
                            alt5=1;
                        }
                    }
                    switch (alt5) {
                        case 1 :
                            // InternalGame.g:467:5: (lv_conditionDescription_5_0= ruleCondition )
                            {
                            // InternalGame.g:467:5: (lv_conditionDescription_5_0= ruleCondition )
                            // InternalGame.g:468:6: lv_conditionDescription_5_0= ruleCondition
                            {

                            						newCompositeNode(grammarAccess.getLieuAccess().getConditionDescriptionConditionParserRuleCall_3_2_0());
                            					
                            pushFollow(FOLLOW_15);
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

            // InternalGame.g:486:3: ( (otherlv_6= RULE_ID ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalGame.g:487:4: (otherlv_6= RULE_ID )
            	    {
            	    // InternalGame.g:487:4: (otherlv_6= RULE_ID )
            	    // InternalGame.g:488:5: otherlv_6= RULE_ID
            	    {

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getLieuRule());
            	    					}
            	    				
            	    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_15); 

            	    					newLeafNode(otherlv_6, grammarAccess.getLieuAccess().getPersonnesPersonneCrossReference_4_0());
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            // InternalGame.g:499:3: ( (otherlv_7= RULE_ID ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ID) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalGame.g:500:4: (otherlv_7= RULE_ID )
            	    {
            	    // InternalGame.g:500:4: (otherlv_7= RULE_ID )
            	    // InternalGame.g:501:5: otherlv_7= RULE_ID
            	    {

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getLieuRule());
            	    					}
            	    				
            	    otherlv_7=(Token)match(input,RULE_ID,FOLLOW_15); 

            	    					newLeafNode(otherlv_7, grammarAccess.getLieuAccess().getConnaissancesConnaissanceCrossReference_5_0());
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            // InternalGame.g:512:3: ( (otherlv_8= RULE_ID ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_ID) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalGame.g:513:4: (otherlv_8= RULE_ID )
            	    {
            	    // InternalGame.g:513:4: (otherlv_8= RULE_ID )
            	    // InternalGame.g:514:5: otherlv_8= RULE_ID
            	    {

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getLieuRule());
            	    					}
            	    				
            	    otherlv_8=(Token)match(input,RULE_ID,FOLLOW_15); 

            	    					newLeafNode(otherlv_8, grammarAccess.getLieuAccess().getObjetsObjetLieuCrossReference_6_0());
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            // InternalGame.g:525:3: (otherlv_9= 'depotO' ( (lv_depotObjet_10_0= ruleCondition ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==21) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalGame.g:526:4: otherlv_9= 'depotO' ( (lv_depotObjet_10_0= ruleCondition ) )
                    {
                    otherlv_9=(Token)match(input,21,FOLLOW_3); 

                    				newLeafNode(otherlv_9, grammarAccess.getLieuAccess().getDepotOKeyword_7_0());
                    			
                    // InternalGame.g:530:4: ( (lv_depotObjet_10_0= ruleCondition ) )
                    // InternalGame.g:531:5: (lv_depotObjet_10_0= ruleCondition )
                    {
                    // InternalGame.g:531:5: (lv_depotObjet_10_0= ruleCondition )
                    // InternalGame.g:532:6: lv_depotObjet_10_0= ruleCondition
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

            // InternalGame.g:550:3: ( (otherlv_11= RULE_ID ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_ID) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalGame.g:551:4: (otherlv_11= RULE_ID )
            	    {
            	    // InternalGame.g:551:4: (otherlv_11= RULE_ID )
            	    // InternalGame.g:552:5: otherlv_11= RULE_ID
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
    // InternalGame.g:571:1: entryRulePersonnes returns [EObject current=null] : iv_rulePersonnes= rulePersonnes EOF ;
    public final EObject entryRulePersonnes() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePersonnes = null;


        try {
            // InternalGame.g:571:50: (iv_rulePersonnes= rulePersonnes EOF )
            // InternalGame.g:572:2: iv_rulePersonnes= rulePersonnes EOF
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
    // InternalGame.g:578:1: rulePersonnes returns [EObject current=null] : (otherlv_0= 'personnes' otherlv_1= '{' ( (lv_listePersonnes_2_0= rulePersonne ) )+ otherlv_3= '}' ) ;
    public final EObject rulePersonnes() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_listePersonnes_2_0 = null;



        	enterRule();

        try {
            // InternalGame.g:584:2: ( (otherlv_0= 'personnes' otherlv_1= '{' ( (lv_listePersonnes_2_0= rulePersonne ) )+ otherlv_3= '}' ) )
            // InternalGame.g:585:2: (otherlv_0= 'personnes' otherlv_1= '{' ( (lv_listePersonnes_2_0= rulePersonne ) )+ otherlv_3= '}' )
            {
            // InternalGame.g:585:2: (otherlv_0= 'personnes' otherlv_1= '{' ( (lv_listePersonnes_2_0= rulePersonne ) )+ otherlv_3= '}' )
            // InternalGame.g:586:3: otherlv_0= 'personnes' otherlv_1= '{' ( (lv_listePersonnes_2_0= rulePersonne ) )+ otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getPersonnesAccess().getPersonnesKeyword_0());
            		
            otherlv_1=(Token)match(input,14,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getPersonnesAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalGame.g:594:3: ( (lv_listePersonnes_2_0= rulePersonne ) )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_ID) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalGame.g:595:4: (lv_listePersonnes_2_0= rulePersonne )
            	    {
            	    // InternalGame.g:595:4: (lv_listePersonnes_2_0= rulePersonne )
            	    // InternalGame.g:596:5: lv_listePersonnes_2_0= rulePersonne
            	    {

            	    					newCompositeNode(grammarAccess.getPersonnesAccess().getListePersonnesPersonneParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_12);
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
    // InternalGame.g:621:1: entryRulePersonne returns [EObject current=null] : iv_rulePersonne= rulePersonne EOF ;
    public final EObject entryRulePersonne() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePersonne = null;


        try {
            // InternalGame.g:621:49: (iv_rulePersonne= rulePersonne EOF )
            // InternalGame.g:622:2: iv_rulePersonne= rulePersonne EOF
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
    // InternalGame.g:628:1: rulePersonne returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' (otherlv_2= 'visible' ( (otherlv_3= RULE_ID ) ) )? (otherlv_4= 'obligatoire' ( (otherlv_5= RULE_ID ) ) )? ( (lv_personneElements_6_0= ruleInteraction ) ) otherlv_7= '}' ) ;
    public final EObject rulePersonne() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_personneElements_6_0 = null;



        	enterRule();

        try {
            // InternalGame.g:634:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' (otherlv_2= 'visible' ( (otherlv_3= RULE_ID ) ) )? (otherlv_4= 'obligatoire' ( (otherlv_5= RULE_ID ) ) )? ( (lv_personneElements_6_0= ruleInteraction ) ) otherlv_7= '}' ) )
            // InternalGame.g:635:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' (otherlv_2= 'visible' ( (otherlv_3= RULE_ID ) ) )? (otherlv_4= 'obligatoire' ( (otherlv_5= RULE_ID ) ) )? ( (lv_personneElements_6_0= ruleInteraction ) ) otherlv_7= '}' )
            {
            // InternalGame.g:635:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' (otherlv_2= 'visible' ( (otherlv_3= RULE_ID ) ) )? (otherlv_4= 'obligatoire' ( (otherlv_5= RULE_ID ) ) )? ( (lv_personneElements_6_0= ruleInteraction ) ) otherlv_7= '}' )
            // InternalGame.g:636:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' (otherlv_2= 'visible' ( (otherlv_3= RULE_ID ) ) )? (otherlv_4= 'obligatoire' ( (otherlv_5= RULE_ID ) ) )? ( (lv_personneElements_6_0= ruleInteraction ) ) otherlv_7= '}'
            {
            // InternalGame.g:636:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalGame.g:637:4: (lv_name_0_0= RULE_ID )
            {
            // InternalGame.g:637:4: (lv_name_0_0= RULE_ID )
            // InternalGame.g:638:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_0_0, grammarAccess.getPersonneAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPersonneRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,14,FOLLOW_16); 

            			newLeafNode(otherlv_1, grammarAccess.getPersonneAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalGame.g:658:3: (otherlv_2= 'visible' ( (otherlv_3= RULE_ID ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==23) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalGame.g:659:4: otherlv_2= 'visible' ( (otherlv_3= RULE_ID ) )
                    {
                    otherlv_2=(Token)match(input,23,FOLLOW_3); 

                    				newLeafNode(otherlv_2, grammarAccess.getPersonneAccess().getVisibleKeyword_2_0());
                    			
                    // InternalGame.g:663:4: ( (otherlv_3= RULE_ID ) )
                    // InternalGame.g:664:5: (otherlv_3= RULE_ID )
                    {
                    // InternalGame.g:664:5: (otherlv_3= RULE_ID )
                    // InternalGame.g:665:6: otherlv_3= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPersonneRule());
                    						}
                    					
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_16); 

                    						newLeafNode(otherlv_3, grammarAccess.getPersonneAccess().getVisibleConditionCrossReference_2_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalGame.g:677:3: (otherlv_4= 'obligatoire' ( (otherlv_5= RULE_ID ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==24) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalGame.g:678:4: otherlv_4= 'obligatoire' ( (otherlv_5= RULE_ID ) )
                    {
                    otherlv_4=(Token)match(input,24,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getPersonneAccess().getObligatoireKeyword_3_0());
                    			
                    // InternalGame.g:682:4: ( (otherlv_5= RULE_ID ) )
                    // InternalGame.g:683:5: (otherlv_5= RULE_ID )
                    {
                    // InternalGame.g:683:5: (otherlv_5= RULE_ID )
                    // InternalGame.g:684:6: otherlv_5= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPersonneRule());
                    						}
                    					
                    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_16); 

                    						newLeafNode(otherlv_5, grammarAccess.getPersonneAccess().getObligatoireConditionCrossReference_3_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalGame.g:696:3: ( (lv_personneElements_6_0= ruleInteraction ) )
            // InternalGame.g:697:4: (lv_personneElements_6_0= ruleInteraction )
            {
            // InternalGame.g:697:4: (lv_personneElements_6_0= ruleInteraction )
            // InternalGame.g:698:5: lv_personneElements_6_0= ruleInteraction
            {

            					newCompositeNode(grammarAccess.getPersonneAccess().getPersonneElementsInteractionParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_10);
            lv_personneElements_6_0=ruleInteraction();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPersonneRule());
            					}
            					set(
            						current,
            						"personneElements",
            						lv_personneElements_6_0,
            						"fr.n7.Game.Interaction");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getPersonneAccess().getRightCurlyBracketKeyword_5());
            		

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
    // InternalGame.g:723:1: entryRuleInteraction returns [EObject current=null] : iv_ruleInteraction= ruleInteraction EOF ;
    public final EObject entryRuleInteraction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInteraction = null;


        try {
            // InternalGame.g:723:52: (iv_ruleInteraction= ruleInteraction EOF )
            // InternalGame.g:724:2: iv_ruleInteraction= ruleInteraction EOF
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
    // InternalGame.g:730:1: ruleInteraction returns [EObject current=null] : (otherlv_0= 'interaction' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'texte' ( (lv_texte_4_0= RULE_STRING ) ) ( (lv_interactionElements_5_0= ruleChoix ) )* otherlv_6= '}' ) ;
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
            // InternalGame.g:736:2: ( (otherlv_0= 'interaction' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'texte' ( (lv_texte_4_0= RULE_STRING ) ) ( (lv_interactionElements_5_0= ruleChoix ) )* otherlv_6= '}' ) )
            // InternalGame.g:737:2: (otherlv_0= 'interaction' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'texte' ( (lv_texte_4_0= RULE_STRING ) ) ( (lv_interactionElements_5_0= ruleChoix ) )* otherlv_6= '}' )
            {
            // InternalGame.g:737:2: (otherlv_0= 'interaction' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'texte' ( (lv_texte_4_0= RULE_STRING ) ) ( (lv_interactionElements_5_0= ruleChoix ) )* otherlv_6= '}' )
            // InternalGame.g:738:3: otherlv_0= 'interaction' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'texte' ( (lv_texte_4_0= RULE_STRING ) ) ( (lv_interactionElements_5_0= ruleChoix ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getInteractionAccess().getInteractionKeyword_0());
            		
            // InternalGame.g:742:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalGame.g:743:4: (lv_name_1_0= RULE_ID )
            {
            // InternalGame.g:743:4: (lv_name_1_0= RULE_ID )
            // InternalGame.g:744:5: lv_name_1_0= RULE_ID
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

            otherlv_2=(Token)match(input,14,FOLLOW_17); 

            			newLeafNode(otherlv_2, grammarAccess.getInteractionAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,26,FOLLOW_14); 

            			newLeafNode(otherlv_3, grammarAccess.getInteractionAccess().getTexteKeyword_3());
            		
            // InternalGame.g:768:3: ( (lv_texte_4_0= RULE_STRING ) )
            // InternalGame.g:769:4: (lv_texte_4_0= RULE_STRING )
            {
            // InternalGame.g:769:4: (lv_texte_4_0= RULE_STRING )
            // InternalGame.g:770:5: lv_texte_4_0= RULE_STRING
            {
            lv_texte_4_0=(Token)match(input,RULE_STRING,FOLLOW_18); 

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

            // InternalGame.g:786:3: ( (lv_interactionElements_5_0= ruleChoix ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==27) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalGame.g:787:4: (lv_interactionElements_5_0= ruleChoix )
            	    {
            	    // InternalGame.g:787:4: (lv_interactionElements_5_0= ruleChoix )
            	    // InternalGame.g:788:5: lv_interactionElements_5_0= ruleChoix
            	    {

            	    					newCompositeNode(grammarAccess.getInteractionAccess().getInteractionElementsChoixParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_18);
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
    // InternalGame.g:813:1: entryRuleChoix returns [EObject current=null] : iv_ruleChoix= ruleChoix EOF ;
    public final EObject entryRuleChoix() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChoix = null;


        try {
            // InternalGame.g:813:46: (iv_ruleChoix= ruleChoix EOF )
            // InternalGame.g:814:2: iv_ruleChoix= ruleChoix EOF
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
    // InternalGame.g:820:1: ruleChoix returns [EObject current=null] : (otherlv_0= 'choix' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_texte_3_0= RULE_STRING ) ) ( (lv_listeActions_4_0= ruleAction ) )+ (otherlv_5= 'choixdebut' ( ( (lv_choixdebut_6_0= RULE_STRING ) ) ( (lv_conditonChoixDebut_7_0= ruleCondition ) ) )? )? (otherlv_8= 'choixfin' ( ( (lv_choixfin_9_0= RULE_STRING ) ) ( (lv_conditionChoixFin_10_0= ruleCondition ) ) )? )? otherlv_11= '}' ) ;
    public final EObject ruleChoix() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_texte_3_0=null;
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
            // InternalGame.g:826:2: ( (otherlv_0= 'choix' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_texte_3_0= RULE_STRING ) ) ( (lv_listeActions_4_0= ruleAction ) )+ (otherlv_5= 'choixdebut' ( ( (lv_choixdebut_6_0= RULE_STRING ) ) ( (lv_conditonChoixDebut_7_0= ruleCondition ) ) )? )? (otherlv_8= 'choixfin' ( ( (lv_choixfin_9_0= RULE_STRING ) ) ( (lv_conditionChoixFin_10_0= ruleCondition ) ) )? )? otherlv_11= '}' ) )
            // InternalGame.g:827:2: (otherlv_0= 'choix' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_texte_3_0= RULE_STRING ) ) ( (lv_listeActions_4_0= ruleAction ) )+ (otherlv_5= 'choixdebut' ( ( (lv_choixdebut_6_0= RULE_STRING ) ) ( (lv_conditonChoixDebut_7_0= ruleCondition ) ) )? )? (otherlv_8= 'choixfin' ( ( (lv_choixfin_9_0= RULE_STRING ) ) ( (lv_conditionChoixFin_10_0= ruleCondition ) ) )? )? otherlv_11= '}' )
            {
            // InternalGame.g:827:2: (otherlv_0= 'choix' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_texte_3_0= RULE_STRING ) ) ( (lv_listeActions_4_0= ruleAction ) )+ (otherlv_5= 'choixdebut' ( ( (lv_choixdebut_6_0= RULE_STRING ) ) ( (lv_conditonChoixDebut_7_0= ruleCondition ) ) )? )? (otherlv_8= 'choixfin' ( ( (lv_choixfin_9_0= RULE_STRING ) ) ( (lv_conditionChoixFin_10_0= ruleCondition ) ) )? )? otherlv_11= '}' )
            // InternalGame.g:828:3: otherlv_0= 'choix' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_texte_3_0= RULE_STRING ) ) ( (lv_listeActions_4_0= ruleAction ) )+ (otherlv_5= 'choixdebut' ( ( (lv_choixdebut_6_0= RULE_STRING ) ) ( (lv_conditonChoixDebut_7_0= ruleCondition ) ) )? )? (otherlv_8= 'choixfin' ( ( (lv_choixfin_9_0= RULE_STRING ) ) ( (lv_conditionChoixFin_10_0= ruleCondition ) ) )? )? otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,27,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getChoixAccess().getChoixKeyword_0());
            		
            // InternalGame.g:832:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalGame.g:833:4: (lv_name_1_0= RULE_ID )
            {
            // InternalGame.g:833:4: (lv_name_1_0= RULE_ID )
            // InternalGame.g:834:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

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

            otherlv_2=(Token)match(input,14,FOLLOW_14); 

            			newLeafNode(otherlv_2, grammarAccess.getChoixAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalGame.g:854:3: ( (lv_texte_3_0= RULE_STRING ) )
            // InternalGame.g:855:4: (lv_texte_3_0= RULE_STRING )
            {
            // InternalGame.g:855:4: (lv_texte_3_0= RULE_STRING )
            // InternalGame.g:856:5: lv_texte_3_0= RULE_STRING
            {
            lv_texte_3_0=(Token)match(input,RULE_STRING,FOLLOW_19); 

            					newLeafNode(lv_texte_3_0, grammarAccess.getChoixAccess().getTexteSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getChoixRule());
            					}
            					setWithLastConsumed(
            						current,
            						"texte",
            						lv_texte_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalGame.g:872:3: ( (lv_listeActions_4_0= ruleAction ) )+
            int cnt16=0;
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==30) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalGame.g:873:4: (lv_listeActions_4_0= ruleAction )
            	    {
            	    // InternalGame.g:873:4: (lv_listeActions_4_0= ruleAction )
            	    // InternalGame.g:874:5: lv_listeActions_4_0= ruleAction
            	    {

            	    					newCompositeNode(grammarAccess.getChoixAccess().getListeActionsActionParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_20);
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

            // InternalGame.g:891:3: (otherlv_5= 'choixdebut' ( ( (lv_choixdebut_6_0= RULE_STRING ) ) ( (lv_conditonChoixDebut_7_0= ruleCondition ) ) )? )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==28) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalGame.g:892:4: otherlv_5= 'choixdebut' ( ( (lv_choixdebut_6_0= RULE_STRING ) ) ( (lv_conditonChoixDebut_7_0= ruleCondition ) ) )?
                    {
                    otherlv_5=(Token)match(input,28,FOLLOW_21); 

                    				newLeafNode(otherlv_5, grammarAccess.getChoixAccess().getChoixdebutKeyword_5_0());
                    			
                    // InternalGame.g:896:4: ( ( (lv_choixdebut_6_0= RULE_STRING ) ) ( (lv_conditonChoixDebut_7_0= ruleCondition ) ) )?
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0==RULE_STRING) ) {
                        alt17=1;
                    }
                    switch (alt17) {
                        case 1 :
                            // InternalGame.g:897:5: ( (lv_choixdebut_6_0= RULE_STRING ) ) ( (lv_conditonChoixDebut_7_0= ruleCondition ) )
                            {
                            // InternalGame.g:897:5: ( (lv_choixdebut_6_0= RULE_STRING ) )
                            // InternalGame.g:898:6: (lv_choixdebut_6_0= RULE_STRING )
                            {
                            // InternalGame.g:898:6: (lv_choixdebut_6_0= RULE_STRING )
                            // InternalGame.g:899:7: lv_choixdebut_6_0= RULE_STRING
                            {
                            lv_choixdebut_6_0=(Token)match(input,RULE_STRING,FOLLOW_3); 

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

                            // InternalGame.g:915:5: ( (lv_conditonChoixDebut_7_0= ruleCondition ) )
                            // InternalGame.g:916:6: (lv_conditonChoixDebut_7_0= ruleCondition )
                            {
                            // InternalGame.g:916:6: (lv_conditonChoixDebut_7_0= ruleCondition )
                            // InternalGame.g:917:7: lv_conditonChoixDebut_7_0= ruleCondition
                            {

                            							newCompositeNode(grammarAccess.getChoixAccess().getConditonChoixDebutConditionParserRuleCall_5_1_1_0());
                            						
                            pushFollow(FOLLOW_22);
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

            // InternalGame.g:936:3: (otherlv_8= 'choixfin' ( ( (lv_choixfin_9_0= RULE_STRING ) ) ( (lv_conditionChoixFin_10_0= ruleCondition ) ) )? )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==29) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalGame.g:937:4: otherlv_8= 'choixfin' ( ( (lv_choixfin_9_0= RULE_STRING ) ) ( (lv_conditionChoixFin_10_0= ruleCondition ) ) )?
                    {
                    otherlv_8=(Token)match(input,29,FOLLOW_23); 

                    				newLeafNode(otherlv_8, grammarAccess.getChoixAccess().getChoixfinKeyword_6_0());
                    			
                    // InternalGame.g:941:4: ( ( (lv_choixfin_9_0= RULE_STRING ) ) ( (lv_conditionChoixFin_10_0= ruleCondition ) ) )?
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0==RULE_STRING) ) {
                        alt19=1;
                    }
                    switch (alt19) {
                        case 1 :
                            // InternalGame.g:942:5: ( (lv_choixfin_9_0= RULE_STRING ) ) ( (lv_conditionChoixFin_10_0= ruleCondition ) )
                            {
                            // InternalGame.g:942:5: ( (lv_choixfin_9_0= RULE_STRING ) )
                            // InternalGame.g:943:6: (lv_choixfin_9_0= RULE_STRING )
                            {
                            // InternalGame.g:943:6: (lv_choixfin_9_0= RULE_STRING )
                            // InternalGame.g:944:7: lv_choixfin_9_0= RULE_STRING
                            {
                            lv_choixfin_9_0=(Token)match(input,RULE_STRING,FOLLOW_3); 

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

                            // InternalGame.g:960:5: ( (lv_conditionChoixFin_10_0= ruleCondition ) )
                            // InternalGame.g:961:6: (lv_conditionChoixFin_10_0= ruleCondition )
                            {
                            // InternalGame.g:961:6: (lv_conditionChoixFin_10_0= ruleCondition )
                            // InternalGame.g:962:7: lv_conditionChoixFin_10_0= ruleCondition
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
    // InternalGame.g:989:1: entryRuleAction returns [EObject current=null] : iv_ruleAction= ruleAction EOF ;
    public final EObject entryRuleAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAction = null;


        try {
            // InternalGame.g:989:47: (iv_ruleAction= ruleAction EOF )
            // InternalGame.g:990:2: iv_ruleAction= ruleAction EOF
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
    // InternalGame.g:996:1: ruleAction returns [EObject current=null] : (otherlv_0= 'action' otherlv_1= '{' ( (lv_texte_2_0= RULE_STRING ) ) ( (lv_conditionAction_3_0= ruleCondition ) )? ( (otherlv_4= RULE_ID ) )* (otherlv_5= 'donneC' ( (otherlv_6= RULE_ID ) )* )? (otherlv_7= 'donneO' ( (otherlv_8= RULE_ID ) )* )? (otherlv_9= 'attributionC' ( (lv_attributionConnaissance_10_0= ruleCondition ) ) )? (otherlv_11= 'attributionO' ( (lv_attributionObjet_12_0= ruleCondition ) ) )? (otherlv_13= 'consommeO' ( (otherlv_14= RULE_ID ) )* otherlv_15= 'quantiteO' ( (lv_listeQuantite_16_0= RULE_INT ) )* )? (otherlv_17= 'consommationC' ( (lv_consommationObjet_18_0= ruleCondition ) ) )? otherlv_19= '}' ) ;
    public final EObject ruleAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_texte_2_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token lv_listeQuantite_16_0=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        EObject lv_conditionAction_3_0 = null;

        EObject lv_attributionConnaissance_10_0 = null;

        EObject lv_attributionObjet_12_0 = null;

        EObject lv_consommationObjet_18_0 = null;



        	enterRule();

        try {
            // InternalGame.g:1002:2: ( (otherlv_0= 'action' otherlv_1= '{' ( (lv_texte_2_0= RULE_STRING ) ) ( (lv_conditionAction_3_0= ruleCondition ) )? ( (otherlv_4= RULE_ID ) )* (otherlv_5= 'donneC' ( (otherlv_6= RULE_ID ) )* )? (otherlv_7= 'donneO' ( (otherlv_8= RULE_ID ) )* )? (otherlv_9= 'attributionC' ( (lv_attributionConnaissance_10_0= ruleCondition ) ) )? (otherlv_11= 'attributionO' ( (lv_attributionObjet_12_0= ruleCondition ) ) )? (otherlv_13= 'consommeO' ( (otherlv_14= RULE_ID ) )* otherlv_15= 'quantiteO' ( (lv_listeQuantite_16_0= RULE_INT ) )* )? (otherlv_17= 'consommationC' ( (lv_consommationObjet_18_0= ruleCondition ) ) )? otherlv_19= '}' ) )
            // InternalGame.g:1003:2: (otherlv_0= 'action' otherlv_1= '{' ( (lv_texte_2_0= RULE_STRING ) ) ( (lv_conditionAction_3_0= ruleCondition ) )? ( (otherlv_4= RULE_ID ) )* (otherlv_5= 'donneC' ( (otherlv_6= RULE_ID ) )* )? (otherlv_7= 'donneO' ( (otherlv_8= RULE_ID ) )* )? (otherlv_9= 'attributionC' ( (lv_attributionConnaissance_10_0= ruleCondition ) ) )? (otherlv_11= 'attributionO' ( (lv_attributionObjet_12_0= ruleCondition ) ) )? (otherlv_13= 'consommeO' ( (otherlv_14= RULE_ID ) )* otherlv_15= 'quantiteO' ( (lv_listeQuantite_16_0= RULE_INT ) )* )? (otherlv_17= 'consommationC' ( (lv_consommationObjet_18_0= ruleCondition ) ) )? otherlv_19= '}' )
            {
            // InternalGame.g:1003:2: (otherlv_0= 'action' otherlv_1= '{' ( (lv_texte_2_0= RULE_STRING ) ) ( (lv_conditionAction_3_0= ruleCondition ) )? ( (otherlv_4= RULE_ID ) )* (otherlv_5= 'donneC' ( (otherlv_6= RULE_ID ) )* )? (otherlv_7= 'donneO' ( (otherlv_8= RULE_ID ) )* )? (otherlv_9= 'attributionC' ( (lv_attributionConnaissance_10_0= ruleCondition ) ) )? (otherlv_11= 'attributionO' ( (lv_attributionObjet_12_0= ruleCondition ) ) )? (otherlv_13= 'consommeO' ( (otherlv_14= RULE_ID ) )* otherlv_15= 'quantiteO' ( (lv_listeQuantite_16_0= RULE_INT ) )* )? (otherlv_17= 'consommationC' ( (lv_consommationObjet_18_0= ruleCondition ) ) )? otherlv_19= '}' )
            // InternalGame.g:1004:3: otherlv_0= 'action' otherlv_1= '{' ( (lv_texte_2_0= RULE_STRING ) ) ( (lv_conditionAction_3_0= ruleCondition ) )? ( (otherlv_4= RULE_ID ) )* (otherlv_5= 'donneC' ( (otherlv_6= RULE_ID ) )* )? (otherlv_7= 'donneO' ( (otherlv_8= RULE_ID ) )* )? (otherlv_9= 'attributionC' ( (lv_attributionConnaissance_10_0= ruleCondition ) ) )? (otherlv_11= 'attributionO' ( (lv_attributionObjet_12_0= ruleCondition ) ) )? (otherlv_13= 'consommeO' ( (otherlv_14= RULE_ID ) )* otherlv_15= 'quantiteO' ( (lv_listeQuantite_16_0= RULE_INT ) )* )? (otherlv_17= 'consommationC' ( (lv_consommationObjet_18_0= ruleCondition ) ) )? otherlv_19= '}'
            {
            otherlv_0=(Token)match(input,30,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getActionAccess().getActionKeyword_0());
            		
            otherlv_1=(Token)match(input,14,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getActionAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalGame.g:1012:3: ( (lv_texte_2_0= RULE_STRING ) )
            // InternalGame.g:1013:4: (lv_texte_2_0= RULE_STRING )
            {
            // InternalGame.g:1013:4: (lv_texte_2_0= RULE_STRING )
            // InternalGame.g:1014:5: lv_texte_2_0= RULE_STRING
            {
            lv_texte_2_0=(Token)match(input,RULE_STRING,FOLLOW_24); 

            					newLeafNode(lv_texte_2_0, grammarAccess.getActionAccess().getTexteSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getActionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"texte",
            						lv_texte_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalGame.g:1030:3: ( (lv_conditionAction_3_0= ruleCondition ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_ID) ) {
                int LA21_1 = input.LA(2);

                if ( (LA21_1==RULE_STRING) ) {
                    alt21=1;
                }
            }
            switch (alt21) {
                case 1 :
                    // InternalGame.g:1031:4: (lv_conditionAction_3_0= ruleCondition )
                    {
                    // InternalGame.g:1031:4: (lv_conditionAction_3_0= ruleCondition )
                    // InternalGame.g:1032:5: lv_conditionAction_3_0= ruleCondition
                    {

                    					newCompositeNode(grammarAccess.getActionAccess().getConditionActionConditionParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_24);
                    lv_conditionAction_3_0=ruleCondition();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getActionRule());
                    					}
                    					set(
                    						current,
                    						"conditionAction",
                    						lv_conditionAction_3_0,
                    						"fr.n7.Game.Condition");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalGame.g:1049:3: ( (otherlv_4= RULE_ID ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==RULE_ID) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalGame.g:1050:4: (otherlv_4= RULE_ID )
            	    {
            	    // InternalGame.g:1050:4: (otherlv_4= RULE_ID )
            	    // InternalGame.g:1051:5: otherlv_4= RULE_ID
            	    {

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getActionRule());
            	    					}
            	    				
            	    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_24); 

            	    					newLeafNode(otherlv_4, grammarAccess.getActionAccess().getListeChoixChoixCrossReference_4_0());
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

            // InternalGame.g:1062:3: (otherlv_5= 'donneC' ( (otherlv_6= RULE_ID ) )* )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==31) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalGame.g:1063:4: otherlv_5= 'donneC' ( (otherlv_6= RULE_ID ) )*
                    {
                    otherlv_5=(Token)match(input,31,FOLLOW_25); 

                    				newLeafNode(otherlv_5, grammarAccess.getActionAccess().getDonneCKeyword_5_0());
                    			
                    // InternalGame.g:1067:4: ( (otherlv_6= RULE_ID ) )*
                    loop23:
                    do {
                        int alt23=2;
                        int LA23_0 = input.LA(1);

                        if ( (LA23_0==RULE_ID) ) {
                            alt23=1;
                        }


                        switch (alt23) {
                    	case 1 :
                    	    // InternalGame.g:1068:5: (otherlv_6= RULE_ID )
                    	    {
                    	    // InternalGame.g:1068:5: (otherlv_6= RULE_ID )
                    	    // InternalGame.g:1069:6: otherlv_6= RULE_ID
                    	    {

                    	    						if (current==null) {
                    	    							current = createModelElement(grammarAccess.getActionRule());
                    	    						}
                    	    					
                    	    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_25); 

                    	    						newLeafNode(otherlv_6, grammarAccess.getActionAccess().getListeConnaissancesConnaissanceCrossReference_5_1_0());
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop23;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalGame.g:1081:3: (otherlv_7= 'donneO' ( (otherlv_8= RULE_ID ) )* )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==32) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalGame.g:1082:4: otherlv_7= 'donneO' ( (otherlv_8= RULE_ID ) )*
                    {
                    otherlv_7=(Token)match(input,32,FOLLOW_26); 

                    				newLeafNode(otherlv_7, grammarAccess.getActionAccess().getDonneOKeyword_6_0());
                    			
                    // InternalGame.g:1086:4: ( (otherlv_8= RULE_ID ) )*
                    loop25:
                    do {
                        int alt25=2;
                        int LA25_0 = input.LA(1);

                        if ( (LA25_0==RULE_ID) ) {
                            alt25=1;
                        }


                        switch (alt25) {
                    	case 1 :
                    	    // InternalGame.g:1087:5: (otherlv_8= RULE_ID )
                    	    {
                    	    // InternalGame.g:1087:5: (otherlv_8= RULE_ID )
                    	    // InternalGame.g:1088:6: otherlv_8= RULE_ID
                    	    {

                    	    						if (current==null) {
                    	    							current = createModelElement(grammarAccess.getActionRule());
                    	    						}
                    	    					
                    	    otherlv_8=(Token)match(input,RULE_ID,FOLLOW_26); 

                    	    						newLeafNode(otherlv_8, grammarAccess.getActionAccess().getListeObjetsObjetLieuCrossReference_6_1_0());
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop25;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalGame.g:1100:3: (otherlv_9= 'attributionC' ( (lv_attributionConnaissance_10_0= ruleCondition ) ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==33) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalGame.g:1101:4: otherlv_9= 'attributionC' ( (lv_attributionConnaissance_10_0= ruleCondition ) )
                    {
                    otherlv_9=(Token)match(input,33,FOLLOW_3); 

                    				newLeafNode(otherlv_9, grammarAccess.getActionAccess().getAttributionCKeyword_7_0());
                    			
                    // InternalGame.g:1105:4: ( (lv_attributionConnaissance_10_0= ruleCondition ) )
                    // InternalGame.g:1106:5: (lv_attributionConnaissance_10_0= ruleCondition )
                    {
                    // InternalGame.g:1106:5: (lv_attributionConnaissance_10_0= ruleCondition )
                    // InternalGame.g:1107:6: lv_attributionConnaissance_10_0= ruleCondition
                    {

                    						newCompositeNode(grammarAccess.getActionAccess().getAttributionConnaissanceConditionParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_27);
                    lv_attributionConnaissance_10_0=ruleCondition();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getActionRule());
                    						}
                    						set(
                    							current,
                    							"attributionConnaissance",
                    							lv_attributionConnaissance_10_0,
                    							"fr.n7.Game.Condition");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalGame.g:1125:3: (otherlv_11= 'attributionO' ( (lv_attributionObjet_12_0= ruleCondition ) ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==34) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalGame.g:1126:4: otherlv_11= 'attributionO' ( (lv_attributionObjet_12_0= ruleCondition ) )
                    {
                    otherlv_11=(Token)match(input,34,FOLLOW_3); 

                    				newLeafNode(otherlv_11, grammarAccess.getActionAccess().getAttributionOKeyword_8_0());
                    			
                    // InternalGame.g:1130:4: ( (lv_attributionObjet_12_0= ruleCondition ) )
                    // InternalGame.g:1131:5: (lv_attributionObjet_12_0= ruleCondition )
                    {
                    // InternalGame.g:1131:5: (lv_attributionObjet_12_0= ruleCondition )
                    // InternalGame.g:1132:6: lv_attributionObjet_12_0= ruleCondition
                    {

                    						newCompositeNode(grammarAccess.getActionAccess().getAttributionObjetConditionParserRuleCall_8_1_0());
                    					
                    pushFollow(FOLLOW_28);
                    lv_attributionObjet_12_0=ruleCondition();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getActionRule());
                    						}
                    						set(
                    							current,
                    							"attributionObjet",
                    							lv_attributionObjet_12_0,
                    							"fr.n7.Game.Condition");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalGame.g:1150:3: (otherlv_13= 'consommeO' ( (otherlv_14= RULE_ID ) )* otherlv_15= 'quantiteO' ( (lv_listeQuantite_16_0= RULE_INT ) )* )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==35) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalGame.g:1151:4: otherlv_13= 'consommeO' ( (otherlv_14= RULE_ID ) )* otherlv_15= 'quantiteO' ( (lv_listeQuantite_16_0= RULE_INT ) )*
                    {
                    otherlv_13=(Token)match(input,35,FOLLOW_29); 

                    				newLeafNode(otherlv_13, grammarAccess.getActionAccess().getConsommeOKeyword_9_0());
                    			
                    // InternalGame.g:1155:4: ( (otherlv_14= RULE_ID ) )*
                    loop29:
                    do {
                        int alt29=2;
                        int LA29_0 = input.LA(1);

                        if ( (LA29_0==RULE_ID) ) {
                            alt29=1;
                        }


                        switch (alt29) {
                    	case 1 :
                    	    // InternalGame.g:1156:5: (otherlv_14= RULE_ID )
                    	    {
                    	    // InternalGame.g:1156:5: (otherlv_14= RULE_ID )
                    	    // InternalGame.g:1157:6: otherlv_14= RULE_ID
                    	    {

                    	    						if (current==null) {
                    	    							current = createModelElement(grammarAccess.getActionRule());
                    	    						}
                    	    					
                    	    otherlv_14=(Token)match(input,RULE_ID,FOLLOW_29); 

                    	    						newLeafNode(otherlv_14, grammarAccess.getActionAccess().getListeObjetsConsommesObjetExplorateurCrossReference_9_1_0());
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop29;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,36,FOLLOW_30); 

                    				newLeafNode(otherlv_15, grammarAccess.getActionAccess().getQuantiteOKeyword_9_2());
                    			
                    // InternalGame.g:1172:4: ( (lv_listeQuantite_16_0= RULE_INT ) )*
                    loop30:
                    do {
                        int alt30=2;
                        int LA30_0 = input.LA(1);

                        if ( (LA30_0==RULE_INT) ) {
                            alt30=1;
                        }


                        switch (alt30) {
                    	case 1 :
                    	    // InternalGame.g:1173:5: (lv_listeQuantite_16_0= RULE_INT )
                    	    {
                    	    // InternalGame.g:1173:5: (lv_listeQuantite_16_0= RULE_INT )
                    	    // InternalGame.g:1174:6: lv_listeQuantite_16_0= RULE_INT
                    	    {
                    	    lv_listeQuantite_16_0=(Token)match(input,RULE_INT,FOLLOW_30); 

                    	    						newLeafNode(lv_listeQuantite_16_0, grammarAccess.getActionAccess().getListeQuantiteINTTerminalRuleCall_9_3_0());
                    	    					

                    	    						if (current==null) {
                    	    							current = createModelElement(grammarAccess.getActionRule());
                    	    						}
                    	    						setWithLastConsumed(
                    	    							current,
                    	    							"listeQuantite",
                    	    							lv_listeQuantite_16_0,
                    	    							"org.eclipse.xtext.common.Terminals.INT");
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop30;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalGame.g:1191:3: (otherlv_17= 'consommationC' ( (lv_consommationObjet_18_0= ruleCondition ) ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==37) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalGame.g:1192:4: otherlv_17= 'consommationC' ( (lv_consommationObjet_18_0= ruleCondition ) )
                    {
                    otherlv_17=(Token)match(input,37,FOLLOW_3); 

                    				newLeafNode(otherlv_17, grammarAccess.getActionAccess().getConsommationCKeyword_10_0());
                    			
                    // InternalGame.g:1196:4: ( (lv_consommationObjet_18_0= ruleCondition ) )
                    // InternalGame.g:1197:5: (lv_consommationObjet_18_0= ruleCondition )
                    {
                    // InternalGame.g:1197:5: (lv_consommationObjet_18_0= ruleCondition )
                    // InternalGame.g:1198:6: lv_consommationObjet_18_0= ruleCondition
                    {

                    						newCompositeNode(grammarAccess.getActionAccess().getConsommationObjetConditionParserRuleCall_10_1_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_consommationObjet_18_0=ruleCondition();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getActionRule());
                    						}
                    						set(
                    							current,
                    							"consommationObjet",
                    							lv_consommationObjet_18_0,
                    							"fr.n7.Game.Condition");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_19=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_19, grammarAccess.getActionAccess().getRightCurlyBracketKeyword_11());
            		

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
    // InternalGame.g:1224:1: entryRuleObjetExplorateur returns [EObject current=null] : iv_ruleObjetExplorateur= ruleObjetExplorateur EOF ;
    public final EObject entryRuleObjetExplorateur() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObjetExplorateur = null;


        try {
            // InternalGame.g:1224:57: (iv_ruleObjetExplorateur= ruleObjetExplorateur EOF )
            // InternalGame.g:1225:2: iv_ruleObjetExplorateur= ruleObjetExplorateur EOF
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
    // InternalGame.g:1231:1: ruleObjetExplorateur returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_taille_1_0= RULE_INT ) ) ( (lv_quantite_2_0= RULE_INT ) ) (otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) ) ( (lv_conditionDescription_5_0= ruleCondition ) )? )? (otherlv_6= 'transformable' ( (lv_transformable_7_0= ruleCondition ) )? )? ) ;
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
            // InternalGame.g:1237:2: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_taille_1_0= RULE_INT ) ) ( (lv_quantite_2_0= RULE_INT ) ) (otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) ) ( (lv_conditionDescription_5_0= ruleCondition ) )? )? (otherlv_6= 'transformable' ( (lv_transformable_7_0= ruleCondition ) )? )? ) )
            // InternalGame.g:1238:2: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_taille_1_0= RULE_INT ) ) ( (lv_quantite_2_0= RULE_INT ) ) (otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) ) ( (lv_conditionDescription_5_0= ruleCondition ) )? )? (otherlv_6= 'transformable' ( (lv_transformable_7_0= ruleCondition ) )? )? )
            {
            // InternalGame.g:1238:2: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_taille_1_0= RULE_INT ) ) ( (lv_quantite_2_0= RULE_INT ) ) (otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) ) ( (lv_conditionDescription_5_0= ruleCondition ) )? )? (otherlv_6= 'transformable' ( (lv_transformable_7_0= ruleCondition ) )? )? )
            // InternalGame.g:1239:3: ( (lv_name_0_0= RULE_ID ) ) ( (lv_taille_1_0= RULE_INT ) ) ( (lv_quantite_2_0= RULE_INT ) ) (otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) ) ( (lv_conditionDescription_5_0= ruleCondition ) )? )? (otherlv_6= 'transformable' ( (lv_transformable_7_0= ruleCondition ) )? )?
            {
            // InternalGame.g:1239:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalGame.g:1240:4: (lv_name_0_0= RULE_ID )
            {
            // InternalGame.g:1240:4: (lv_name_0_0= RULE_ID )
            // InternalGame.g:1241:5: lv_name_0_0= RULE_ID
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

            // InternalGame.g:1257:3: ( (lv_taille_1_0= RULE_INT ) )
            // InternalGame.g:1258:4: (lv_taille_1_0= RULE_INT )
            {
            // InternalGame.g:1258:4: (lv_taille_1_0= RULE_INT )
            // InternalGame.g:1259:5: lv_taille_1_0= RULE_INT
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

            // InternalGame.g:1275:3: ( (lv_quantite_2_0= RULE_INT ) )
            // InternalGame.g:1276:4: (lv_quantite_2_0= RULE_INT )
            {
            // InternalGame.g:1276:4: (lv_quantite_2_0= RULE_INT )
            // InternalGame.g:1277:5: lv_quantite_2_0= RULE_INT
            {
            lv_quantite_2_0=(Token)match(input,RULE_INT,FOLLOW_31); 

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

            // InternalGame.g:1293:3: (otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) ) ( (lv_conditionDescription_5_0= ruleCondition ) )? )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==20) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalGame.g:1294:4: otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) ) ( (lv_conditionDescription_5_0= ruleCondition ) )?
                    {
                    otherlv_3=(Token)match(input,20,FOLLOW_14); 

                    				newLeafNode(otherlv_3, grammarAccess.getObjetExplorateurAccess().getDescriptionKeyword_3_0());
                    			
                    // InternalGame.g:1298:4: ( (lv_description_4_0= RULE_STRING ) )
                    // InternalGame.g:1299:5: (lv_description_4_0= RULE_STRING )
                    {
                    // InternalGame.g:1299:5: (lv_description_4_0= RULE_STRING )
                    // InternalGame.g:1300:6: lv_description_4_0= RULE_STRING
                    {
                    lv_description_4_0=(Token)match(input,RULE_STRING,FOLLOW_32); 

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

                    // InternalGame.g:1316:4: ( (lv_conditionDescription_5_0= ruleCondition ) )?
                    int alt33=2;
                    int LA33_0 = input.LA(1);

                    if ( (LA33_0==RULE_ID) ) {
                        int LA33_1 = input.LA(2);

                        if ( (LA33_1==RULE_STRING) ) {
                            alt33=1;
                        }
                    }
                    switch (alt33) {
                        case 1 :
                            // InternalGame.g:1317:5: (lv_conditionDescription_5_0= ruleCondition )
                            {
                            // InternalGame.g:1317:5: (lv_conditionDescription_5_0= ruleCondition )
                            // InternalGame.g:1318:6: lv_conditionDescription_5_0= ruleCondition
                            {

                            						newCompositeNode(grammarAccess.getObjetExplorateurAccess().getConditionDescriptionConditionParserRuleCall_3_2_0());
                            					
                            pushFollow(FOLLOW_33);
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

            // InternalGame.g:1336:3: (otherlv_6= 'transformable' ( (lv_transformable_7_0= ruleCondition ) )? )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==38) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalGame.g:1337:4: otherlv_6= 'transformable' ( (lv_transformable_7_0= ruleCondition ) )?
                    {
                    otherlv_6=(Token)match(input,38,FOLLOW_34); 

                    				newLeafNode(otherlv_6, grammarAccess.getObjetExplorateurAccess().getTransformableKeyword_4_0());
                    			
                    // InternalGame.g:1341:4: ( (lv_transformable_7_0= ruleCondition ) )?
                    int alt35=2;
                    int LA35_0 = input.LA(1);

                    if ( (LA35_0==RULE_ID) ) {
                        int LA35_1 = input.LA(2);

                        if ( (LA35_1==RULE_STRING) ) {
                            alt35=1;
                        }
                    }
                    switch (alt35) {
                        case 1 :
                            // InternalGame.g:1342:5: (lv_transformable_7_0= ruleCondition )
                            {
                            // InternalGame.g:1342:5: (lv_transformable_7_0= ruleCondition )
                            // InternalGame.g:1343:6: lv_transformable_7_0= ruleCondition
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
    // InternalGame.g:1365:1: entryRuleObjetLieu returns [EObject current=null] : iv_ruleObjetLieu= ruleObjetLieu EOF ;
    public final EObject entryRuleObjetLieu() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObjetLieu = null;


        try {
            // InternalGame.g:1365:50: (iv_ruleObjetLieu= ruleObjetLieu EOF )
            // InternalGame.g:1366:2: iv_ruleObjetLieu= ruleObjetLieu EOF
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
    // InternalGame.g:1372:1: ruleObjetLieu returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_taille_1_0= RULE_INT ) ) ( (lv_quantite_2_0= RULE_INT ) ) (otherlv_3= 'transmission' ( (lv_conditionTransmission_4_0= ruleCondition ) )? )? (otherlv_5= 'consommation' ( (lv_conditionConsommation_6_0= ruleCondition ) )? )? (otherlv_7= 'description' ( (lv_description_8_0= RULE_STRING ) ) ( (lv_conditionDescription_9_0= ruleCondition ) )? )? (otherlv_10= 'transformable' ( (lv_transformable_11_0= ruleCondition ) )? )? ) ;
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
            // InternalGame.g:1378:2: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_taille_1_0= RULE_INT ) ) ( (lv_quantite_2_0= RULE_INT ) ) (otherlv_3= 'transmission' ( (lv_conditionTransmission_4_0= ruleCondition ) )? )? (otherlv_5= 'consommation' ( (lv_conditionConsommation_6_0= ruleCondition ) )? )? (otherlv_7= 'description' ( (lv_description_8_0= RULE_STRING ) ) ( (lv_conditionDescription_9_0= ruleCondition ) )? )? (otherlv_10= 'transformable' ( (lv_transformable_11_0= ruleCondition ) )? )? ) )
            // InternalGame.g:1379:2: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_taille_1_0= RULE_INT ) ) ( (lv_quantite_2_0= RULE_INT ) ) (otherlv_3= 'transmission' ( (lv_conditionTransmission_4_0= ruleCondition ) )? )? (otherlv_5= 'consommation' ( (lv_conditionConsommation_6_0= ruleCondition ) )? )? (otherlv_7= 'description' ( (lv_description_8_0= RULE_STRING ) ) ( (lv_conditionDescription_9_0= ruleCondition ) )? )? (otherlv_10= 'transformable' ( (lv_transformable_11_0= ruleCondition ) )? )? )
            {
            // InternalGame.g:1379:2: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_taille_1_0= RULE_INT ) ) ( (lv_quantite_2_0= RULE_INT ) ) (otherlv_3= 'transmission' ( (lv_conditionTransmission_4_0= ruleCondition ) )? )? (otherlv_5= 'consommation' ( (lv_conditionConsommation_6_0= ruleCondition ) )? )? (otherlv_7= 'description' ( (lv_description_8_0= RULE_STRING ) ) ( (lv_conditionDescription_9_0= ruleCondition ) )? )? (otherlv_10= 'transformable' ( (lv_transformable_11_0= ruleCondition ) )? )? )
            // InternalGame.g:1380:3: ( (lv_name_0_0= RULE_ID ) ) ( (lv_taille_1_0= RULE_INT ) ) ( (lv_quantite_2_0= RULE_INT ) ) (otherlv_3= 'transmission' ( (lv_conditionTransmission_4_0= ruleCondition ) )? )? (otherlv_5= 'consommation' ( (lv_conditionConsommation_6_0= ruleCondition ) )? )? (otherlv_7= 'description' ( (lv_description_8_0= RULE_STRING ) ) ( (lv_conditionDescription_9_0= ruleCondition ) )? )? (otherlv_10= 'transformable' ( (lv_transformable_11_0= ruleCondition ) )? )?
            {
            // InternalGame.g:1380:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalGame.g:1381:4: (lv_name_0_0= RULE_ID )
            {
            // InternalGame.g:1381:4: (lv_name_0_0= RULE_ID )
            // InternalGame.g:1382:5: lv_name_0_0= RULE_ID
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

            // InternalGame.g:1398:3: ( (lv_taille_1_0= RULE_INT ) )
            // InternalGame.g:1399:4: (lv_taille_1_0= RULE_INT )
            {
            // InternalGame.g:1399:4: (lv_taille_1_0= RULE_INT )
            // InternalGame.g:1400:5: lv_taille_1_0= RULE_INT
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

            // InternalGame.g:1416:3: ( (lv_quantite_2_0= RULE_INT ) )
            // InternalGame.g:1417:4: (lv_quantite_2_0= RULE_INT )
            {
            // InternalGame.g:1417:4: (lv_quantite_2_0= RULE_INT )
            // InternalGame.g:1418:5: lv_quantite_2_0= RULE_INT
            {
            lv_quantite_2_0=(Token)match(input,RULE_INT,FOLLOW_35); 

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

            // InternalGame.g:1434:3: (otherlv_3= 'transmission' ( (lv_conditionTransmission_4_0= ruleCondition ) )? )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==39) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalGame.g:1435:4: otherlv_3= 'transmission' ( (lv_conditionTransmission_4_0= ruleCondition ) )?
                    {
                    otherlv_3=(Token)match(input,39,FOLLOW_36); 

                    				newLeafNode(otherlv_3, grammarAccess.getObjetLieuAccess().getTransmissionKeyword_3_0());
                    			
                    // InternalGame.g:1439:4: ( (lv_conditionTransmission_4_0= ruleCondition ) )?
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
                            // InternalGame.g:1440:5: (lv_conditionTransmission_4_0= ruleCondition )
                            {
                            // InternalGame.g:1440:5: (lv_conditionTransmission_4_0= ruleCondition )
                            // InternalGame.g:1441:6: lv_conditionTransmission_4_0= ruleCondition
                            {

                            						newCompositeNode(grammarAccess.getObjetLieuAccess().getConditionTransmissionConditionParserRuleCall_3_1_0());
                            					
                            pushFollow(FOLLOW_37);
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

            // InternalGame.g:1459:3: (otherlv_5= 'consommation' ( (lv_conditionConsommation_6_0= ruleCondition ) )? )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==40) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalGame.g:1460:4: otherlv_5= 'consommation' ( (lv_conditionConsommation_6_0= ruleCondition ) )?
                    {
                    otherlv_5=(Token)match(input,40,FOLLOW_38); 

                    				newLeafNode(otherlv_5, grammarAccess.getObjetLieuAccess().getConsommationKeyword_4_0());
                    			
                    // InternalGame.g:1464:4: ( (lv_conditionConsommation_6_0= ruleCondition ) )?
                    int alt39=2;
                    int LA39_0 = input.LA(1);

                    if ( (LA39_0==RULE_ID) ) {
                        int LA39_1 = input.LA(2);

                        if ( (LA39_1==RULE_STRING) ) {
                            alt39=1;
                        }
                    }
                    switch (alt39) {
                        case 1 :
                            // InternalGame.g:1465:5: (lv_conditionConsommation_6_0= ruleCondition )
                            {
                            // InternalGame.g:1465:5: (lv_conditionConsommation_6_0= ruleCondition )
                            // InternalGame.g:1466:6: lv_conditionConsommation_6_0= ruleCondition
                            {

                            						newCompositeNode(grammarAccess.getObjetLieuAccess().getConditionConsommationConditionParserRuleCall_4_1_0());
                            					
                            pushFollow(FOLLOW_31);
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

            // InternalGame.g:1484:3: (otherlv_7= 'description' ( (lv_description_8_0= RULE_STRING ) ) ( (lv_conditionDescription_9_0= ruleCondition ) )? )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==20) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalGame.g:1485:4: otherlv_7= 'description' ( (lv_description_8_0= RULE_STRING ) ) ( (lv_conditionDescription_9_0= ruleCondition ) )?
                    {
                    otherlv_7=(Token)match(input,20,FOLLOW_14); 

                    				newLeafNode(otherlv_7, grammarAccess.getObjetLieuAccess().getDescriptionKeyword_5_0());
                    			
                    // InternalGame.g:1489:4: ( (lv_description_8_0= RULE_STRING ) )
                    // InternalGame.g:1490:5: (lv_description_8_0= RULE_STRING )
                    {
                    // InternalGame.g:1490:5: (lv_description_8_0= RULE_STRING )
                    // InternalGame.g:1491:6: lv_description_8_0= RULE_STRING
                    {
                    lv_description_8_0=(Token)match(input,RULE_STRING,FOLLOW_32); 

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

                    // InternalGame.g:1507:4: ( (lv_conditionDescription_9_0= ruleCondition ) )?
                    int alt41=2;
                    int LA41_0 = input.LA(1);

                    if ( (LA41_0==RULE_ID) ) {
                        int LA41_1 = input.LA(2);

                        if ( (LA41_1==RULE_STRING) ) {
                            alt41=1;
                        }
                    }
                    switch (alt41) {
                        case 1 :
                            // InternalGame.g:1508:5: (lv_conditionDescription_9_0= ruleCondition )
                            {
                            // InternalGame.g:1508:5: (lv_conditionDescription_9_0= ruleCondition )
                            // InternalGame.g:1509:6: lv_conditionDescription_9_0= ruleCondition
                            {

                            						newCompositeNode(grammarAccess.getObjetLieuAccess().getConditionDescriptionConditionParserRuleCall_5_2_0());
                            					
                            pushFollow(FOLLOW_33);
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

            // InternalGame.g:1527:3: (otherlv_10= 'transformable' ( (lv_transformable_11_0= ruleCondition ) )? )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==38) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalGame.g:1528:4: otherlv_10= 'transformable' ( (lv_transformable_11_0= ruleCondition ) )?
                    {
                    otherlv_10=(Token)match(input,38,FOLLOW_34); 

                    				newLeafNode(otherlv_10, grammarAccess.getObjetLieuAccess().getTransformableKeyword_6_0());
                    			
                    // InternalGame.g:1532:4: ( (lv_transformable_11_0= ruleCondition ) )?
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
                            // InternalGame.g:1533:5: (lv_transformable_11_0= ruleCondition )
                            {
                            // InternalGame.g:1533:5: (lv_transformable_11_0= ruleCondition )
                            // InternalGame.g:1534:6: lv_transformable_11_0= ruleCondition
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
    // InternalGame.g:1556:1: entryRuleObjetsExplorateur returns [EObject current=null] : iv_ruleObjetsExplorateur= ruleObjetsExplorateur EOF ;
    public final EObject entryRuleObjetsExplorateur() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObjetsExplorateur = null;


        try {
            // InternalGame.g:1556:58: (iv_ruleObjetsExplorateur= ruleObjetsExplorateur EOF )
            // InternalGame.g:1557:2: iv_ruleObjetsExplorateur= ruleObjetsExplorateur EOF
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
    // InternalGame.g:1563:1: ruleObjetsExplorateur returns [EObject current=null] : (otherlv_0= 'objetsE' otherlv_1= '{' ( (lv_listeObjets_2_0= ruleObjetExplorateur ) )* otherlv_3= '}' ) ;
    public final EObject ruleObjetsExplorateur() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_listeObjets_2_0 = null;



        	enterRule();

        try {
            // InternalGame.g:1569:2: ( (otherlv_0= 'objetsE' otherlv_1= '{' ( (lv_listeObjets_2_0= ruleObjetExplorateur ) )* otherlv_3= '}' ) )
            // InternalGame.g:1570:2: (otherlv_0= 'objetsE' otherlv_1= '{' ( (lv_listeObjets_2_0= ruleObjetExplorateur ) )* otherlv_3= '}' )
            {
            // InternalGame.g:1570:2: (otherlv_0= 'objetsE' otherlv_1= '{' ( (lv_listeObjets_2_0= ruleObjetExplorateur ) )* otherlv_3= '}' )
            // InternalGame.g:1571:3: otherlv_0= 'objetsE' otherlv_1= '{' ( (lv_listeObjets_2_0= ruleObjetExplorateur ) )* otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,41,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getObjetsExplorateurAccess().getObjetsEKeyword_0());
            		
            otherlv_1=(Token)match(input,14,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getObjetsExplorateurAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalGame.g:1579:3: ( (lv_listeObjets_2_0= ruleObjetExplorateur ) )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==RULE_ID) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // InternalGame.g:1580:4: (lv_listeObjets_2_0= ruleObjetExplorateur )
            	    {
            	    // InternalGame.g:1580:4: (lv_listeObjets_2_0= ruleObjetExplorateur )
            	    // InternalGame.g:1581:5: lv_listeObjets_2_0= ruleObjetExplorateur
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
            	    break loop45;
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
    // InternalGame.g:1606:1: entryRuleObjetsLieu returns [EObject current=null] : iv_ruleObjetsLieu= ruleObjetsLieu EOF ;
    public final EObject entryRuleObjetsLieu() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObjetsLieu = null;


        try {
            // InternalGame.g:1606:51: (iv_ruleObjetsLieu= ruleObjetsLieu EOF )
            // InternalGame.g:1607:2: iv_ruleObjetsLieu= ruleObjetsLieu EOF
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
    // InternalGame.g:1613:1: ruleObjetsLieu returns [EObject current=null] : (otherlv_0= 'objetsL' otherlv_1= '{' ( (lv_listeObjets_2_0= ruleObjetLieu ) )* otherlv_3= '}' ) ;
    public final EObject ruleObjetsLieu() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_listeObjets_2_0 = null;



        	enterRule();

        try {
            // InternalGame.g:1619:2: ( (otherlv_0= 'objetsL' otherlv_1= '{' ( (lv_listeObjets_2_0= ruleObjetLieu ) )* otherlv_3= '}' ) )
            // InternalGame.g:1620:2: (otherlv_0= 'objetsL' otherlv_1= '{' ( (lv_listeObjets_2_0= ruleObjetLieu ) )* otherlv_3= '}' )
            {
            // InternalGame.g:1620:2: (otherlv_0= 'objetsL' otherlv_1= '{' ( (lv_listeObjets_2_0= ruleObjetLieu ) )* otherlv_3= '}' )
            // InternalGame.g:1621:3: otherlv_0= 'objetsL' otherlv_1= '{' ( (lv_listeObjets_2_0= ruleObjetLieu ) )* otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,42,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getObjetsLieuAccess().getObjetsLKeyword_0());
            		
            otherlv_1=(Token)match(input,14,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getObjetsLieuAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalGame.g:1629:3: ( (lv_listeObjets_2_0= ruleObjetLieu ) )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==RULE_ID) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // InternalGame.g:1630:4: (lv_listeObjets_2_0= ruleObjetLieu )
            	    {
            	    // InternalGame.g:1630:4: (lv_listeObjets_2_0= ruleObjetLieu )
            	    // InternalGame.g:1631:5: lv_listeObjets_2_0= ruleObjetLieu
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
            	    break loop46;
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
    // InternalGame.g:1656:1: entryRuleConnaissances returns [EObject current=null] : iv_ruleConnaissances= ruleConnaissances EOF ;
    public final EObject entryRuleConnaissances() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConnaissances = null;


        try {
            // InternalGame.g:1656:54: (iv_ruleConnaissances= ruleConnaissances EOF )
            // InternalGame.g:1657:2: iv_ruleConnaissances= ruleConnaissances EOF
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
    // InternalGame.g:1663:1: ruleConnaissances returns [EObject current=null] : (otherlv_0= 'connaissances' otherlv_1= '{' ( (lv_listeConnaissances_2_0= ruleConnaissance ) )* otherlv_3= '}' ) ;
    public final EObject ruleConnaissances() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_listeConnaissances_2_0 = null;



        	enterRule();

        try {
            // InternalGame.g:1669:2: ( (otherlv_0= 'connaissances' otherlv_1= '{' ( (lv_listeConnaissances_2_0= ruleConnaissance ) )* otherlv_3= '}' ) )
            // InternalGame.g:1670:2: (otherlv_0= 'connaissances' otherlv_1= '{' ( (lv_listeConnaissances_2_0= ruleConnaissance ) )* otherlv_3= '}' )
            {
            // InternalGame.g:1670:2: (otherlv_0= 'connaissances' otherlv_1= '{' ( (lv_listeConnaissances_2_0= ruleConnaissance ) )* otherlv_3= '}' )
            // InternalGame.g:1671:3: otherlv_0= 'connaissances' otherlv_1= '{' ( (lv_listeConnaissances_2_0= ruleConnaissance ) )* otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getConnaissancesAccess().getConnaissancesKeyword_0());
            		
            otherlv_1=(Token)match(input,14,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getConnaissancesAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalGame.g:1679:3: ( (lv_listeConnaissances_2_0= ruleConnaissance ) )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( (LA47_0==RULE_ID) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // InternalGame.g:1680:4: (lv_listeConnaissances_2_0= ruleConnaissance )
            	    {
            	    // InternalGame.g:1680:4: (lv_listeConnaissances_2_0= ruleConnaissance )
            	    // InternalGame.g:1681:5: lv_listeConnaissances_2_0= ruleConnaissance
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
            	    break loop47;
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
    // InternalGame.g:1706:1: entryRuleConnaissance returns [EObject current=null] : iv_ruleConnaissance= ruleConnaissance EOF ;
    public final EObject entryRuleConnaissance() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConnaissance = null;


        try {
            // InternalGame.g:1706:53: (iv_ruleConnaissance= ruleConnaissance EOF )
            // InternalGame.g:1707:2: iv_ruleConnaissance= ruleConnaissance EOF
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
    // InternalGame.g:1713:1: ruleConnaissance returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'description' ( (lv_description_2_0= RULE_STRING ) ) ( (lv_conditionConnaissance_3_0= ruleCondition ) )? )? ) ;
    public final EObject ruleConnaissance() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_description_2_0=null;
        EObject lv_conditionConnaissance_3_0 = null;



        	enterRule();

        try {
            // InternalGame.g:1719:2: ( ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'description' ( (lv_description_2_0= RULE_STRING ) ) ( (lv_conditionConnaissance_3_0= ruleCondition ) )? )? ) )
            // InternalGame.g:1720:2: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'description' ( (lv_description_2_0= RULE_STRING ) ) ( (lv_conditionConnaissance_3_0= ruleCondition ) )? )? )
            {
            // InternalGame.g:1720:2: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'description' ( (lv_description_2_0= RULE_STRING ) ) ( (lv_conditionConnaissance_3_0= ruleCondition ) )? )? )
            // InternalGame.g:1721:3: ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'description' ( (lv_description_2_0= RULE_STRING ) ) ( (lv_conditionConnaissance_3_0= ruleCondition ) )? )?
            {
            // InternalGame.g:1721:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalGame.g:1722:4: (lv_name_0_0= RULE_ID )
            {
            // InternalGame.g:1722:4: (lv_name_0_0= RULE_ID )
            // InternalGame.g:1723:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_39); 

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

            // InternalGame.g:1739:3: (otherlv_1= 'description' ( (lv_description_2_0= RULE_STRING ) ) ( (lv_conditionConnaissance_3_0= ruleCondition ) )? )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==20) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalGame.g:1740:4: otherlv_1= 'description' ( (lv_description_2_0= RULE_STRING ) ) ( (lv_conditionConnaissance_3_0= ruleCondition ) )?
                    {
                    otherlv_1=(Token)match(input,20,FOLLOW_14); 

                    				newLeafNode(otherlv_1, grammarAccess.getConnaissanceAccess().getDescriptionKeyword_1_0());
                    			
                    // InternalGame.g:1744:4: ( (lv_description_2_0= RULE_STRING ) )
                    // InternalGame.g:1745:5: (lv_description_2_0= RULE_STRING )
                    {
                    // InternalGame.g:1745:5: (lv_description_2_0= RULE_STRING )
                    // InternalGame.g:1746:6: lv_description_2_0= RULE_STRING
                    {
                    lv_description_2_0=(Token)match(input,RULE_STRING,FOLLOW_34); 

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

                    // InternalGame.g:1762:4: ( (lv_conditionConnaissance_3_0= ruleCondition ) )?
                    int alt48=2;
                    int LA48_0 = input.LA(1);

                    if ( (LA48_0==RULE_ID) ) {
                        int LA48_1 = input.LA(2);

                        if ( (LA48_1==RULE_STRING) ) {
                            alt48=1;
                        }
                    }
                    switch (alt48) {
                        case 1 :
                            // InternalGame.g:1763:5: (lv_conditionConnaissance_3_0= ruleCondition )
                            {
                            // InternalGame.g:1763:5: (lv_conditionConnaissance_3_0= ruleCondition )
                            // InternalGame.g:1764:6: lv_conditionConnaissance_3_0= ruleCondition
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


    // $ANTLR start "entryRuleConditions"
    // InternalGame.g:1786:1: entryRuleConditions returns [EObject current=null] : iv_ruleConditions= ruleConditions EOF ;
    public final EObject entryRuleConditions() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConditions = null;


        try {
            // InternalGame.g:1786:51: (iv_ruleConditions= ruleConditions EOF )
            // InternalGame.g:1787:2: iv_ruleConditions= ruleConditions EOF
            {
             newCompositeNode(grammarAccess.getConditionsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConditions=ruleConditions();

            state._fsp--;

             current =iv_ruleConditions; 
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
    // $ANTLR end "entryRuleConditions"


    // $ANTLR start "ruleConditions"
    // InternalGame.g:1793:1: ruleConditions returns [EObject current=null] : (otherlv_0= 'conditions' otherlv_1= '{' ( (lv_listeConditions_2_0= ruleCondition ) )* otherlv_3= '}' ) ;
    public final EObject ruleConditions() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_listeConditions_2_0 = null;



        	enterRule();

        try {
            // InternalGame.g:1799:2: ( (otherlv_0= 'conditions' otherlv_1= '{' ( (lv_listeConditions_2_0= ruleCondition ) )* otherlv_3= '}' ) )
            // InternalGame.g:1800:2: (otherlv_0= 'conditions' otherlv_1= '{' ( (lv_listeConditions_2_0= ruleCondition ) )* otherlv_3= '}' )
            {
            // InternalGame.g:1800:2: (otherlv_0= 'conditions' otherlv_1= '{' ( (lv_listeConditions_2_0= ruleCondition ) )* otherlv_3= '}' )
            // InternalGame.g:1801:3: otherlv_0= 'conditions' otherlv_1= '{' ( (lv_listeConditions_2_0= ruleCondition ) )* otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,43,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getConditionsAccess().getConditionsKeyword_0());
            		
            otherlv_1=(Token)match(input,14,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getConditionsAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalGame.g:1809:3: ( (lv_listeConditions_2_0= ruleCondition ) )*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( (LA50_0==RULE_ID) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // InternalGame.g:1810:4: (lv_listeConditions_2_0= ruleCondition )
            	    {
            	    // InternalGame.g:1810:4: (lv_listeConditions_2_0= ruleCondition )
            	    // InternalGame.g:1811:5: lv_listeConditions_2_0= ruleCondition
            	    {

            	    					newCompositeNode(grammarAccess.getConditionsAccess().getListeConditionsConditionParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_12);
            	    lv_listeConditions_2_0=ruleCondition();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getConditionsRule());
            	    					}
            	    					add(
            	    						current,
            	    						"listeConditions",
            	    						lv_listeConditions_2_0,
            	    						"fr.n7.Game.Condition");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop50;
                }
            } while (true);

            otherlv_3=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getConditionsAccess().getRightCurlyBracketKeyword_3());
            		

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
    // $ANTLR end "ruleConditions"


    // $ANTLR start "entryRuleCondition"
    // InternalGame.g:1836:1: entryRuleCondition returns [EObject current=null] : iv_ruleCondition= ruleCondition EOF ;
    public final EObject entryRuleCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCondition = null;


        try {
            // InternalGame.g:1836:50: (iv_ruleCondition= ruleCondition EOF )
            // InternalGame.g:1837:2: iv_ruleCondition= ruleCondition EOF
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
    // InternalGame.g:1843:1: ruleCondition returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_condition_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleCondition() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_condition_1_0=null;


        	enterRule();

        try {
            // InternalGame.g:1849:2: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_condition_1_0= RULE_STRING ) ) ) )
            // InternalGame.g:1850:2: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_condition_1_0= RULE_STRING ) ) )
            {
            // InternalGame.g:1850:2: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_condition_1_0= RULE_STRING ) ) )
            // InternalGame.g:1851:3: ( (lv_name_0_0= RULE_ID ) ) ( (lv_condition_1_0= RULE_STRING ) )
            {
            // InternalGame.g:1851:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalGame.g:1852:4: (lv_name_0_0= RULE_ID )
            {
            // InternalGame.g:1852:4: (lv_name_0_0= RULE_ID )
            // InternalGame.g:1853:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_14); 

            					newLeafNode(lv_name_0_0, grammarAccess.getConditionAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConditionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalGame.g:1869:3: ( (lv_condition_1_0= RULE_STRING ) )
            // InternalGame.g:1870:4: (lv_condition_1_0= RULE_STRING )
            {
            // InternalGame.g:1870:4: (lv_condition_1_0= RULE_STRING )
            // InternalGame.g:1871:5: lv_condition_1_0= RULE_STRING
            {
            lv_condition_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_condition_1_0, grammarAccess.getConditionAccess().getConditionSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConditionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"condition",
            						lv_condition_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

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
    // InternalGame.g:1891:1: entryRuleChemins returns [EObject current=null] : iv_ruleChemins= ruleChemins EOF ;
    public final EObject entryRuleChemins() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChemins = null;


        try {
            // InternalGame.g:1891:48: (iv_ruleChemins= ruleChemins EOF )
            // InternalGame.g:1892:2: iv_ruleChemins= ruleChemins EOF
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
    // InternalGame.g:1898:1: ruleChemins returns [EObject current=null] : (otherlv_0= 'chemins' otherlv_1= '{' ( (lv_listeChemins_2_0= ruleChemin ) )* otherlv_3= '}' ) ;
    public final EObject ruleChemins() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_listeChemins_2_0 = null;



        	enterRule();

        try {
            // InternalGame.g:1904:2: ( (otherlv_0= 'chemins' otherlv_1= '{' ( (lv_listeChemins_2_0= ruleChemin ) )* otherlv_3= '}' ) )
            // InternalGame.g:1905:2: (otherlv_0= 'chemins' otherlv_1= '{' ( (lv_listeChemins_2_0= ruleChemin ) )* otherlv_3= '}' )
            {
            // InternalGame.g:1905:2: (otherlv_0= 'chemins' otherlv_1= '{' ( (lv_listeChemins_2_0= ruleChemin ) )* otherlv_3= '}' )
            // InternalGame.g:1906:3: otherlv_0= 'chemins' otherlv_1= '{' ( (lv_listeChemins_2_0= ruleChemin ) )* otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,44,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getCheminsAccess().getCheminsKeyword_0());
            		
            otherlv_1=(Token)match(input,14,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getCheminsAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalGame.g:1914:3: ( (lv_listeChemins_2_0= ruleChemin ) )*
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( (LA51_0==RULE_ID) ) {
                    alt51=1;
                }


                switch (alt51) {
            	case 1 :
            	    // InternalGame.g:1915:4: (lv_listeChemins_2_0= ruleChemin )
            	    {
            	    // InternalGame.g:1915:4: (lv_listeChemins_2_0= ruleChemin )
            	    // InternalGame.g:1916:5: lv_listeChemins_2_0= ruleChemin
            	    {

            	    					newCompositeNode(grammarAccess.getCheminsAccess().getListeCheminsCheminParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_12);
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
            	    break loop51;
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
    // InternalGame.g:1941:1: entryRuleChemin returns [EObject current=null] : iv_ruleChemin= ruleChemin EOF ;
    public final EObject entryRuleChemin() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChemin = null;


        try {
            // InternalGame.g:1941:47: (iv_ruleChemin= ruleChemin EOF )
            // InternalGame.g:1942:2: iv_ruleChemin= ruleChemin EOF
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
    // InternalGame.g:1948:1: ruleChemin returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' otherlv_2= 'description' ( (lv_description_3_0= RULE_STRING ) ) ( (lv_conditionDescription_4_0= ruleCondition ) )? otherlv_5= 'source' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'destination' ( (otherlv_8= RULE_ID ) ) (otherlv_9= 'obligatoire' ( (otherlv_10= RULE_ID ) ) )? (otherlv_11= 'visible' ( (otherlv_12= RULE_ID ) ) )? (otherlv_13= 'ouvert' ( (otherlv_14= RULE_ID ) ) )? ( (otherlv_15= RULE_ID ) )* ( (otherlv_16= RULE_ID ) )* ( (otherlv_17= RULE_ID ) )* otherlv_18= '}' ) ;
    public final EObject ruleChemin() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_description_3_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        EObject lv_conditionDescription_4_0 = null;



        	enterRule();

        try {
            // InternalGame.g:1954:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' otherlv_2= 'description' ( (lv_description_3_0= RULE_STRING ) ) ( (lv_conditionDescription_4_0= ruleCondition ) )? otherlv_5= 'source' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'destination' ( (otherlv_8= RULE_ID ) ) (otherlv_9= 'obligatoire' ( (otherlv_10= RULE_ID ) ) )? (otherlv_11= 'visible' ( (otherlv_12= RULE_ID ) ) )? (otherlv_13= 'ouvert' ( (otherlv_14= RULE_ID ) ) )? ( (otherlv_15= RULE_ID ) )* ( (otherlv_16= RULE_ID ) )* ( (otherlv_17= RULE_ID ) )* otherlv_18= '}' ) )
            // InternalGame.g:1955:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' otherlv_2= 'description' ( (lv_description_3_0= RULE_STRING ) ) ( (lv_conditionDescription_4_0= ruleCondition ) )? otherlv_5= 'source' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'destination' ( (otherlv_8= RULE_ID ) ) (otherlv_9= 'obligatoire' ( (otherlv_10= RULE_ID ) ) )? (otherlv_11= 'visible' ( (otherlv_12= RULE_ID ) ) )? (otherlv_13= 'ouvert' ( (otherlv_14= RULE_ID ) ) )? ( (otherlv_15= RULE_ID ) )* ( (otherlv_16= RULE_ID ) )* ( (otherlv_17= RULE_ID ) )* otherlv_18= '}' )
            {
            // InternalGame.g:1955:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' otherlv_2= 'description' ( (lv_description_3_0= RULE_STRING ) ) ( (lv_conditionDescription_4_0= ruleCondition ) )? otherlv_5= 'source' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'destination' ( (otherlv_8= RULE_ID ) ) (otherlv_9= 'obligatoire' ( (otherlv_10= RULE_ID ) ) )? (otherlv_11= 'visible' ( (otherlv_12= RULE_ID ) ) )? (otherlv_13= 'ouvert' ( (otherlv_14= RULE_ID ) ) )? ( (otherlv_15= RULE_ID ) )* ( (otherlv_16= RULE_ID ) )* ( (otherlv_17= RULE_ID ) )* otherlv_18= '}' )
            // InternalGame.g:1956:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' otherlv_2= 'description' ( (lv_description_3_0= RULE_STRING ) ) ( (lv_conditionDescription_4_0= ruleCondition ) )? otherlv_5= 'source' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'destination' ( (otherlv_8= RULE_ID ) ) (otherlv_9= 'obligatoire' ( (otherlv_10= RULE_ID ) ) )? (otherlv_11= 'visible' ( (otherlv_12= RULE_ID ) ) )? (otherlv_13= 'ouvert' ( (otherlv_14= RULE_ID ) ) )? ( (otherlv_15= RULE_ID ) )* ( (otherlv_16= RULE_ID ) )* ( (otherlv_17= RULE_ID ) )* otherlv_18= '}'
            {
            // InternalGame.g:1956:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalGame.g:1957:4: (lv_name_0_0= RULE_ID )
            {
            // InternalGame.g:1957:4: (lv_name_0_0= RULE_ID )
            // InternalGame.g:1958:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_0_0, grammarAccess.getCheminAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCheminRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,14,FOLLOW_40); 

            			newLeafNode(otherlv_1, grammarAccess.getCheminAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,20,FOLLOW_14); 

            			newLeafNode(otherlv_2, grammarAccess.getCheminAccess().getDescriptionKeyword_2());
            		
            // InternalGame.g:1982:3: ( (lv_description_3_0= RULE_STRING ) )
            // InternalGame.g:1983:4: (lv_description_3_0= RULE_STRING )
            {
            // InternalGame.g:1983:4: (lv_description_3_0= RULE_STRING )
            // InternalGame.g:1984:5: lv_description_3_0= RULE_STRING
            {
            lv_description_3_0=(Token)match(input,RULE_STRING,FOLLOW_41); 

            					newLeafNode(lv_description_3_0, grammarAccess.getCheminAccess().getDescriptionSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCheminRule());
            					}
            					setWithLastConsumed(
            						current,
            						"description",
            						lv_description_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalGame.g:2000:3: ( (lv_conditionDescription_4_0= ruleCondition ) )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==RULE_ID) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalGame.g:2001:4: (lv_conditionDescription_4_0= ruleCondition )
                    {
                    // InternalGame.g:2001:4: (lv_conditionDescription_4_0= ruleCondition )
                    // InternalGame.g:2002:5: lv_conditionDescription_4_0= ruleCondition
                    {

                    					newCompositeNode(grammarAccess.getCheminAccess().getConditionDescriptionConditionParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_42);
                    lv_conditionDescription_4_0=ruleCondition();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getCheminRule());
                    					}
                    					set(
                    						current,
                    						"conditionDescription",
                    						lv_conditionDescription_4_0,
                    						"fr.n7.Game.Condition");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,45,FOLLOW_3); 

            			newLeafNode(otherlv_5, grammarAccess.getCheminAccess().getSourceKeyword_5());
            		
            // InternalGame.g:2023:3: ( (otherlv_6= RULE_ID ) )
            // InternalGame.g:2024:4: (otherlv_6= RULE_ID )
            {
            // InternalGame.g:2024:4: (otherlv_6= RULE_ID )
            // InternalGame.g:2025:5: otherlv_6= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCheminRule());
            					}
            				
            otherlv_6=(Token)match(input,RULE_ID,FOLLOW_43); 

            					newLeafNode(otherlv_6, grammarAccess.getCheminAccess().getSourceLieuCrossReference_6_0());
            				

            }


            }

            otherlv_7=(Token)match(input,46,FOLLOW_3); 

            			newLeafNode(otherlv_7, grammarAccess.getCheminAccess().getDestinationKeyword_7());
            		
            // InternalGame.g:2040:3: ( (otherlv_8= RULE_ID ) )
            // InternalGame.g:2041:4: (otherlv_8= RULE_ID )
            {
            // InternalGame.g:2041:4: (otherlv_8= RULE_ID )
            // InternalGame.g:2042:5: otherlv_8= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCheminRule());
            					}
            				
            otherlv_8=(Token)match(input,RULE_ID,FOLLOW_44); 

            					newLeafNode(otherlv_8, grammarAccess.getCheminAccess().getDestinationLieuCrossReference_8_0());
            				

            }


            }

            // InternalGame.g:2053:3: (otherlv_9= 'obligatoire' ( (otherlv_10= RULE_ID ) ) )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==24) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // InternalGame.g:2054:4: otherlv_9= 'obligatoire' ( (otherlv_10= RULE_ID ) )
                    {
                    otherlv_9=(Token)match(input,24,FOLLOW_3); 

                    				newLeafNode(otherlv_9, grammarAccess.getCheminAccess().getObligatoireKeyword_9_0());
                    			
                    // InternalGame.g:2058:4: ( (otherlv_10= RULE_ID ) )
                    // InternalGame.g:2059:5: (otherlv_10= RULE_ID )
                    {
                    // InternalGame.g:2059:5: (otherlv_10= RULE_ID )
                    // InternalGame.g:2060:6: otherlv_10= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getCheminRule());
                    						}
                    					
                    otherlv_10=(Token)match(input,RULE_ID,FOLLOW_45); 

                    						newLeafNode(otherlv_10, grammarAccess.getCheminAccess().getObligatoireConditionCrossReference_9_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalGame.g:2072:3: (otherlv_11= 'visible' ( (otherlv_12= RULE_ID ) ) )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==23) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // InternalGame.g:2073:4: otherlv_11= 'visible' ( (otherlv_12= RULE_ID ) )
                    {
                    otherlv_11=(Token)match(input,23,FOLLOW_3); 

                    				newLeafNode(otherlv_11, grammarAccess.getCheminAccess().getVisibleKeyword_10_0());
                    			
                    // InternalGame.g:2077:4: ( (otherlv_12= RULE_ID ) )
                    // InternalGame.g:2078:5: (otherlv_12= RULE_ID )
                    {
                    // InternalGame.g:2078:5: (otherlv_12= RULE_ID )
                    // InternalGame.g:2079:6: otherlv_12= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getCheminRule());
                    						}
                    					
                    otherlv_12=(Token)match(input,RULE_ID,FOLLOW_46); 

                    						newLeafNode(otherlv_12, grammarAccess.getCheminAccess().getVisibleConditionCrossReference_10_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalGame.g:2091:3: (otherlv_13= 'ouvert' ( (otherlv_14= RULE_ID ) ) )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==47) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // InternalGame.g:2092:4: otherlv_13= 'ouvert' ( (otherlv_14= RULE_ID ) )
                    {
                    otherlv_13=(Token)match(input,47,FOLLOW_3); 

                    				newLeafNode(otherlv_13, grammarAccess.getCheminAccess().getOuvertKeyword_11_0());
                    			
                    // InternalGame.g:2096:4: ( (otherlv_14= RULE_ID ) )
                    // InternalGame.g:2097:5: (otherlv_14= RULE_ID )
                    {
                    // InternalGame.g:2097:5: (otherlv_14= RULE_ID )
                    // InternalGame.g:2098:6: otherlv_14= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getCheminRule());
                    						}
                    					
                    otherlv_14=(Token)match(input,RULE_ID,FOLLOW_12); 

                    						newLeafNode(otherlv_14, grammarAccess.getCheminAccess().getOuvertConditionCrossReference_11_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalGame.g:2110:3: ( (otherlv_15= RULE_ID ) )*
            loop56:
            do {
                int alt56=2;
                int LA56_0 = input.LA(1);

                if ( (LA56_0==RULE_ID) ) {
                    alt56=1;
                }


                switch (alt56) {
            	case 1 :
            	    // InternalGame.g:2111:4: (otherlv_15= RULE_ID )
            	    {
            	    // InternalGame.g:2111:4: (otherlv_15= RULE_ID )
            	    // InternalGame.g:2112:5: otherlv_15= RULE_ID
            	    {

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getCheminRule());
            	    					}
            	    				
            	    otherlv_15=(Token)match(input,RULE_ID,FOLLOW_12); 

            	    					newLeafNode(otherlv_15, grammarAccess.getCheminAccess().getListeConnaissancesConnaissanceCrossReference_12_0());
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop56;
                }
            } while (true);

            // InternalGame.g:2123:3: ( (otherlv_16= RULE_ID ) )*
            loop57:
            do {
                int alt57=2;
                int LA57_0 = input.LA(1);

                if ( (LA57_0==RULE_ID) ) {
                    alt57=1;
                }


                switch (alt57) {
            	case 1 :
            	    // InternalGame.g:2124:4: (otherlv_16= RULE_ID )
            	    {
            	    // InternalGame.g:2124:4: (otherlv_16= RULE_ID )
            	    // InternalGame.g:2125:5: otherlv_16= RULE_ID
            	    {

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getCheminRule());
            	    					}
            	    				
            	    otherlv_16=(Token)match(input,RULE_ID,FOLLOW_12); 

            	    					newLeafNode(otherlv_16, grammarAccess.getCheminAccess().getListeObjetsObjetsLieuCrossReference_13_0());
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop57;
                }
            } while (true);

            // InternalGame.g:2136:3: ( (otherlv_17= RULE_ID ) )*
            loop58:
            do {
                int alt58=2;
                int LA58_0 = input.LA(1);

                if ( (LA58_0==RULE_ID) ) {
                    alt58=1;
                }


                switch (alt58) {
            	case 1 :
            	    // InternalGame.g:2137:4: (otherlv_17= RULE_ID )
            	    {
            	    // InternalGame.g:2137:4: (otherlv_17= RULE_ID )
            	    // InternalGame.g:2138:5: otherlv_17= RULE_ID
            	    {

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getCheminRule());
            	    					}
            	    				
            	    otherlv_17=(Token)match(input,RULE_ID,FOLLOW_12); 

            	    					newLeafNode(otherlv_17, grammarAccess.getCheminAccess().getListeObjetsConsommesObjetsExplorateurCrossReference_14_0());
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop58;
                }
            } while (true);

            otherlv_18=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_18, grammarAccess.getCheminAccess().getRightCurlyBracketKeyword_15());
            		

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
    // InternalGame.g:2157:1: ruleTypeLieu returns [Enumerator current=null] : ( (enumLiteral_0= 'debut' ) | (enumLiteral_1= 'fin' ) | (enumLiteral_2= 'intermediaire' ) ) ;
    public final Enumerator ruleTypeLieu() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalGame.g:2163:2: ( ( (enumLiteral_0= 'debut' ) | (enumLiteral_1= 'fin' ) | (enumLiteral_2= 'intermediaire' ) ) )
            // InternalGame.g:2164:2: ( (enumLiteral_0= 'debut' ) | (enumLiteral_1= 'fin' ) | (enumLiteral_2= 'intermediaire' ) )
            {
            // InternalGame.g:2164:2: ( (enumLiteral_0= 'debut' ) | (enumLiteral_1= 'fin' ) | (enumLiteral_2= 'intermediaire' ) )
            int alt59=3;
            switch ( input.LA(1) ) {
            case 48:
                {
                alt59=1;
                }
                break;
            case 49:
                {
                alt59=2;
                }
                break;
            case 50:
                {
                alt59=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 59, 0, input);

                throw nvae;
            }

            switch (alt59) {
                case 1 :
                    // InternalGame.g:2165:3: (enumLiteral_0= 'debut' )
                    {
                    // InternalGame.g:2165:3: (enumLiteral_0= 'debut' )
                    // InternalGame.g:2166:4: enumLiteral_0= 'debut'
                    {
                    enumLiteral_0=(Token)match(input,48,FOLLOW_2); 

                    				current = grammarAccess.getTypeLieuAccess().getLieuDebutEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getTypeLieuAccess().getLieuDebutEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalGame.g:2173:3: (enumLiteral_1= 'fin' )
                    {
                    // InternalGame.g:2173:3: (enumLiteral_1= 'fin' )
                    // InternalGame.g:2174:4: enumLiteral_1= 'fin'
                    {
                    enumLiteral_1=(Token)match(input,49,FOLLOW_2); 

                    				current = grammarAccess.getTypeLieuAccess().getLieuFinEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getTypeLieuAccess().getLieuFinEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalGame.g:2181:3: (enumLiteral_2= 'intermediaire' )
                    {
                    // InternalGame.g:2181:3: (enumLiteral_2= 'intermediaire' )
                    // InternalGame.g:2182:4: enumLiteral_2= 'intermediaire'
                    {
                    enumLiteral_2=(Token)match(input,50,FOLLOW_2); 

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
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x00071E0000430000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x00071E0000438000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000040010L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000308010L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000208010L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000003800000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000008008000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000070008000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000020008040L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000020008000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000008040L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000002F80008010L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000002F00008010L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000002E00008010L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000002C00008000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000002800008000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000001000000010L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000002000008020L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000004000100002L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000004000000012L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x000001C000100002L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000014000100012L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000014000100002L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000004000100012L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000200000000010L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000800001808010L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000800000808010L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000800000008010L});

}