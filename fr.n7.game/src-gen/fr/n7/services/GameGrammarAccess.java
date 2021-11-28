/*
 * generated by Xtext 2.23.0
 */
package fr.n7.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class GameGrammarAccess extends AbstractElementFinder.AbstractGrammarElementFinder {
	
	public class GameElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "fr.n7.Game.Game");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cGameKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cGameElementsAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cGameElementsGameElementParserRuleCall_3_0 = (RuleCall)cGameElementsAssignment_3.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//Game:
		//	'Game'
		//	name=ID
		//	'{'
		//	gameElements+=gameElement
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//'Game' name=ID '{' gameElements+=gameElement '}'
		public Group getGroup() { return cGroup; }
		
		//'Game'
		public Keyword getGameKeyword_0() { return cGameKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }
		
		//gameElements+=gameElement
		public Assignment getGameElementsAssignment_3() { return cGameElementsAssignment_3; }
		
		//gameElement
		public RuleCall getGameElementsGameElementParserRuleCall_3_0() { return cGameElementsGameElementParserRuleCall_3_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_4() { return cRightCurlyBracketKeyword_4; }
	}
	public class GameElementElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "fr.n7.Game.gameElement");
		private final RuleCall cTerritoireParserRuleCall = (RuleCall)rule.eContents().get(1);
		
		//gameElement:
		//	Territoire;
		@Override public ParserRule getRule() { return rule; }
		
		//Territoire
		public RuleCall getTerritoireParserRuleCall() { return cTerritoireParserRuleCall; }
	}
	public class TerritoireElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "fr.n7.Game.Territoire");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cTerritoireKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cTerritoireElementsAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cTerritoireElementsExplorateurParserRuleCall_3_0 = (RuleCall)cTerritoireElementsAssignment_3.eContents().get(0);
		private final Assignment cTerritoireElementsAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cTerritoireElementsLieuDebutParserRuleCall_4_0 = (RuleCall)cTerritoireElementsAssignment_4.eContents().get(0);
		private final Assignment cTerritoireElementsAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cTerritoireElementsLieuFinParserRuleCall_5_0 = (RuleCall)cTerritoireElementsAssignment_5.eContents().get(0);
		private final Assignment cTerritoireElementsAssignment_6 = (Assignment)cGroup.eContents().get(6);
		private final RuleCall cTerritoireElementsLieuParserRuleCall_6_0 = (RuleCall)cTerritoireElementsAssignment_6.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_7 = (Keyword)cGroup.eContents().get(7);
		
		//Territoire:
		//	'territoire'
		//	name=ID
		//	'{'
		//	territoireElements+=Explorateur
		//	territoireElements+=LieuDebut
		//	territoireElements+=LieuFin+
		//	territoireElements+=Lieu*
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//'territoire' name=ID '{' territoireElements+=Explorateur territoireElements+=LieuDebut territoireElements+=LieuFin+
		//territoireElements+=Lieu* '}'
		public Group getGroup() { return cGroup; }
		
		//'territoire'
		public Keyword getTerritoireKeyword_0() { return cTerritoireKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }
		
		//territoireElements+=Explorateur
		public Assignment getTerritoireElementsAssignment_3() { return cTerritoireElementsAssignment_3; }
		
		//Explorateur
		public RuleCall getTerritoireElementsExplorateurParserRuleCall_3_0() { return cTerritoireElementsExplorateurParserRuleCall_3_0; }
		
		//territoireElements+=LieuDebut
		public Assignment getTerritoireElementsAssignment_4() { return cTerritoireElementsAssignment_4; }
		
		//LieuDebut
		public RuleCall getTerritoireElementsLieuDebutParserRuleCall_4_0() { return cTerritoireElementsLieuDebutParserRuleCall_4_0; }
		
		//territoireElements+=LieuFin+
		public Assignment getTerritoireElementsAssignment_5() { return cTerritoireElementsAssignment_5; }
		
		//LieuFin
		public RuleCall getTerritoireElementsLieuFinParserRuleCall_5_0() { return cTerritoireElementsLieuFinParserRuleCall_5_0; }
		
		//territoireElements+=Lieu*
		public Assignment getTerritoireElementsAssignment_6() { return cTerritoireElementsAssignment_6; }
		
		//Lieu
		public RuleCall getTerritoireElementsLieuParserRuleCall_6_0() { return cTerritoireElementsLieuParserRuleCall_6_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_7() { return cRightCurlyBracketKeyword_7; }
	}
	public class ExplorateurElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "fr.n7.Game.Explorateur");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cExplorateurKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cExplorateurElementsAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cExplorateurElementsSacParserRuleCall_3_0 = (RuleCall)cExplorateurElementsAssignment_3.eContents().get(0);
		private final Assignment cExplorateurElementsAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cExplorateurElementsConnaissancesParserRuleCall_4_0 = (RuleCall)cExplorateurElementsAssignment_4.eContents().get(0);
		private final Assignment cExplorateurElementsAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cExplorateurElementsLieuParserRuleCall_5_0 = (RuleCall)cExplorateurElementsAssignment_5.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_6 = (Keyword)cGroup.eContents().get(6);
		
		//Explorateur:
		//	'explorateur'
		//	name=ID
		//	'{'
		//	explorateurElements+=Sac
		//	explorateurElements+=Connaissances?
		//	explorateurElements+=Lieu?
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//'explorateur' name=ID '{' explorateurElements+=Sac explorateurElements+=Connaissances? explorateurElements+=Lieu? '}'
		public Group getGroup() { return cGroup; }
		
		//'explorateur'
		public Keyword getExplorateurKeyword_0() { return cExplorateurKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }
		
		//explorateurElements+=Sac
		public Assignment getExplorateurElementsAssignment_3() { return cExplorateurElementsAssignment_3; }
		
		//Sac
		public RuleCall getExplorateurElementsSacParserRuleCall_3_0() { return cExplorateurElementsSacParserRuleCall_3_0; }
		
		//explorateurElements+=Connaissances?
		public Assignment getExplorateurElementsAssignment_4() { return cExplorateurElementsAssignment_4; }
		
		//Connaissances
		public RuleCall getExplorateurElementsConnaissancesParserRuleCall_4_0() { return cExplorateurElementsConnaissancesParserRuleCall_4_0; }
		
		//explorateurElements+=Lieu?
		public Assignment getExplorateurElementsAssignment_5() { return cExplorateurElementsAssignment_5; }
		
		//Lieu
		public RuleCall getExplorateurElementsLieuParserRuleCall_5_0() { return cExplorateurElementsLieuParserRuleCall_5_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_6() { return cRightCurlyBracketKeyword_6; }
	}
	public class SacElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "fr.n7.Game.Sac");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cSacKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cTailleAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cTailleINTTerminalRuleCall_1_0 = (RuleCall)cTailleAssignment_1.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cSacElementsAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cSacElementsObjetParserRuleCall_3_0 = (RuleCall)cSacElementsAssignment_3.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//Sac:
		//	'sac'
		//	taille=INT
		//	'{'
		//	sacElements+=Objet*
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//'sac' taille=INT '{' sacElements+=Objet* '}'
		public Group getGroup() { return cGroup; }
		
		//'sac'
		public Keyword getSacKeyword_0() { return cSacKeyword_0; }
		
		//taille=INT
		public Assignment getTailleAssignment_1() { return cTailleAssignment_1; }
		
		//INT
		public RuleCall getTailleINTTerminalRuleCall_1_0() { return cTailleINTTerminalRuleCall_1_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }
		
		//sacElements+=Objet*
		public Assignment getSacElementsAssignment_3() { return cSacElementsAssignment_3; }
		
		//Objet
		public RuleCall getSacElementsObjetParserRuleCall_3_0() { return cSacElementsObjetParserRuleCall_3_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_4() { return cRightCurlyBracketKeyword_4; }
	}
	public class LieuElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "fr.n7.Game.Lieu");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cLieuKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cLieuElementsAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cLieuElementsPersonnesParserRuleCall_3_0 = (RuleCall)cLieuElementsAssignment_3.eContents().get(0);
		private final Assignment cLieuElementsAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cLieuElementsConnaissancesParserRuleCall_4_0 = (RuleCall)cLieuElementsAssignment_4.eContents().get(0);
		private final Assignment cLieuElementsAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cLieuElementsObjetsParserRuleCall_5_0 = (RuleCall)cLieuElementsAssignment_5.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_6 = (Keyword)cGroup.eContents().get(6);
		
		//Lieu:
		//	'lieu'
		//	name=ID
		//	'{'
		//	lieuElements+=Personnes?
		//	lieuElements+=Connaissances?
		//	lieuElements+=Objets?
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//'lieu' name=ID '{' lieuElements+=Personnes? lieuElements+=Connaissances? lieuElements+=Objets? '}'
		public Group getGroup() { return cGroup; }
		
		//'lieu'
		public Keyword getLieuKeyword_0() { return cLieuKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }
		
		//lieuElements+=Personnes?
		public Assignment getLieuElementsAssignment_3() { return cLieuElementsAssignment_3; }
		
		//Personnes
		public RuleCall getLieuElementsPersonnesParserRuleCall_3_0() { return cLieuElementsPersonnesParserRuleCall_3_0; }
		
		//lieuElements+=Connaissances?
		public Assignment getLieuElementsAssignment_4() { return cLieuElementsAssignment_4; }
		
		//Connaissances
		public RuleCall getLieuElementsConnaissancesParserRuleCall_4_0() { return cLieuElementsConnaissancesParserRuleCall_4_0; }
		
		//lieuElements+=Objets?
		public Assignment getLieuElementsAssignment_5() { return cLieuElementsAssignment_5; }
		
		//Objets
		public RuleCall getLieuElementsObjetsParserRuleCall_5_0() { return cLieuElementsObjetsParserRuleCall_5_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_6() { return cRightCurlyBracketKeyword_6; }
	}
	public class LieuDebutElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "fr.n7.Game.LieuDebut");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cLieudebutKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cLieudebutElementsAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cLieudebutElementsPersonnesParserRuleCall_3_0 = (RuleCall)cLieudebutElementsAssignment_3.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//LieuDebut:
		//	'lieudebut'
		//	name=ID
		//	'{'
		//	lieudebutElements+=Personnes?
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//'lieudebut' name=ID '{' lieudebutElements+=Personnes? '}'
		public Group getGroup() { return cGroup; }
		
		//'lieudebut'
		public Keyword getLieudebutKeyword_0() { return cLieudebutKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }
		
		//lieudebutElements+=Personnes?
		public Assignment getLieudebutElementsAssignment_3() { return cLieudebutElementsAssignment_3; }
		
		//Personnes
		public RuleCall getLieudebutElementsPersonnesParserRuleCall_3_0() { return cLieudebutElementsPersonnesParserRuleCall_3_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_4() { return cRightCurlyBracketKeyword_4; }
	}
	public class LieuFinElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "fr.n7.Game.LieuFin");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cLieufinKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cLieudebutElementsAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cLieudebutElementsPersonnesParserRuleCall_3_0 = (RuleCall)cLieudebutElementsAssignment_3.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//LieuFin:
		//	'lieufin'
		//	name=ID
		//	'{'
		//	lieudebutElements+=Personnes?
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//'lieufin' name=ID '{' lieudebutElements+=Personnes? '}'
		public Group getGroup() { return cGroup; }
		
		//'lieufin'
		public Keyword getLieufinKeyword_0() { return cLieufinKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }
		
		//lieudebutElements+=Personnes?
		public Assignment getLieudebutElementsAssignment_3() { return cLieudebutElementsAssignment_3; }
		
		//Personnes
		public RuleCall getLieudebutElementsPersonnesParserRuleCall_3_0() { return cLieudebutElementsPersonnesParserRuleCall_3_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_4() { return cRightCurlyBracketKeyword_4; }
	}
	public class PersonnesElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "fr.n7.Game.Personnes");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cPersonnesKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cListePersonneAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cListePersonnePersonneParserRuleCall_2_0 = (RuleCall)cListePersonneAssignment_2.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//Personnes:
		//	'personnes'
		//	'{'
		//	listePersonne+=Personne*
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//'personnes' '{' listePersonne+=Personne* '}'
		public Group getGroup() { return cGroup; }
		
		//'personnes'
		public Keyword getPersonnesKeyword_0() { return cPersonnesKeyword_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }
		
		//listePersonne+=Personne*
		public Assignment getListePersonneAssignment_2() { return cListePersonneAssignment_2; }
		
		//Personne
		public RuleCall getListePersonnePersonneParserRuleCall_2_0() { return cListePersonnePersonneParserRuleCall_2_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_3() { return cRightCurlyBracketKeyword_3; }
	}
	public class PersonneElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "fr.n7.Game.Personne");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cPersonneKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cVisibleKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Keyword cObligatoireKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Assignment cPersonneElementsAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cPersonneElementsInteractionParserRuleCall_5_0 = (RuleCall)cPersonneElementsAssignment_5.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_6 = (Keyword)cGroup.eContents().get(6);
		
		//Personne:
		//	'personne'
		//	name=ID
		//	'{'
		//	'visible'
		//	'obligatoire'
		//	personneElements+=Interaction
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//'personne' name=ID '{' 'visible' 'obligatoire' personneElements+=Interaction '}'
		public Group getGroup() { return cGroup; }
		
		//'personne'
		public Keyword getPersonneKeyword_0() { return cPersonneKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }
		
		//'visible'
		public Keyword getVisibleKeyword_3() { return cVisibleKeyword_3; }
		
		//'obligatoire'
		public Keyword getObligatoireKeyword_4() { return cObligatoireKeyword_4; }
		
		//personneElements+=Interaction
		public Assignment getPersonneElementsAssignment_5() { return cPersonneElementsAssignment_5; }
		
		//Interaction
		public RuleCall getPersonneElementsInteractionParserRuleCall_5_0() { return cPersonneElementsInteractionParserRuleCall_5_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_6() { return cRightCurlyBracketKeyword_6; }
	}
	public class InteractionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "fr.n7.Game.Interaction");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cInteractionKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cTexteKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cInteractionElementsAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cInteractionElementsChoixParserRuleCall_4_0 = (RuleCall)cInteractionElementsAssignment_4.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//Interaction:
		//	'interaction'
		//	name=ID
		//	'{'
		//	'texte'
		//	interactionElements+=Choix*
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//'interaction' name=ID '{' 'texte' interactionElements+=Choix* '}'
		public Group getGroup() { return cGroup; }
		
		//'interaction'
		public Keyword getInteractionKeyword_0() { return cInteractionKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }
		
		//'texte'
		public Keyword getTexteKeyword_3() { return cTexteKeyword_3; }
		
		//interactionElements+=Choix*
		public Assignment getInteractionElementsAssignment_4() { return cInteractionElementsAssignment_4; }
		
		//Choix
		public RuleCall getInteractionElementsChoixParserRuleCall_4_0() { return cInteractionElementsChoixParserRuleCall_4_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_5() { return cRightCurlyBracketKeyword_5; }
	}
	public class TexteElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "fr.n7.Game.Texte");
		private final Assignment cTexteAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cTexteSTRINGTerminalRuleCall_0 = (RuleCall)cTexteAssignment.eContents().get(0);
		
		//Texte:
		//	texte=STRING;
		@Override public ParserRule getRule() { return rule; }
		
		//texte=STRING
		public Assignment getTexteAssignment() { return cTexteAssignment; }
		
		//STRING
		public RuleCall getTexteSTRINGTerminalRuleCall_0() { return cTexteSTRINGTerminalRuleCall_0; }
	}
	public class ChoixElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "fr.n7.Game.Choix");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cChoixKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		
		//Choix:
		//	'choix'
		//	name=ID;
		@Override public ParserRule getRule() { return rule; }
		
		//'choix' name=ID
		public Group getGroup() { return cGroup; }
		
		//'choix'
		public Keyword getChoixKeyword_0() { return cChoixKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
	}
	public class ObjetElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "fr.n7.Game.Objet");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cObjetKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Assignment cTailleAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cTailleINTTerminalRuleCall_2_0 = (RuleCall)cTailleAssignment_2.eContents().get(0);
		private final Assignment cQuantiteAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cQuantiteINTTerminalRuleCall_3_0 = (RuleCall)cQuantiteAssignment_3.eContents().get(0);
		
		//Objet:
		//	'objet'
		//	name=ID
		//	taille=INT
		//	quantite=INT;
		@Override public ParserRule getRule() { return rule; }
		
		//'objet' name=ID taille=INT quantite=INT
		public Group getGroup() { return cGroup; }
		
		//'objet'
		public Keyword getObjetKeyword_0() { return cObjetKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//taille=INT
		public Assignment getTailleAssignment_2() { return cTailleAssignment_2; }
		
		//INT
		public RuleCall getTailleINTTerminalRuleCall_2_0() { return cTailleINTTerminalRuleCall_2_0; }
		
		//quantite=INT
		public Assignment getQuantiteAssignment_3() { return cQuantiteAssignment_3; }
		
		//INT
		public RuleCall getQuantiteINTTerminalRuleCall_3_0() { return cQuantiteINTTerminalRuleCall_3_0; }
	}
	public class ObjetsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "fr.n7.Game.Objets");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cObjetsKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cListeObjetsAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cListeObjetsObjetParserRuleCall_2_0 = (RuleCall)cListeObjetsAssignment_2.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//Objets:
		//	'objets'
		//	'{'
		//	listeObjets+=Objet*
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//'objets' '{' listeObjets+=Objet* '}'
		public Group getGroup() { return cGroup; }
		
		//'objets'
		public Keyword getObjetsKeyword_0() { return cObjetsKeyword_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }
		
		//listeObjets+=Objet*
		public Assignment getListeObjetsAssignment_2() { return cListeObjetsAssignment_2; }
		
		//Objet
		public RuleCall getListeObjetsObjetParserRuleCall_2_0() { return cListeObjetsObjetParserRuleCall_2_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_3() { return cRightCurlyBracketKeyword_3; }
	}
	public class ConnaissancesElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "fr.n7.Game.Connaissances");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cConnaissancesKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cListeConnaissanceAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cListeConnaissanceConnaissanceParserRuleCall_2_0 = (RuleCall)cListeConnaissanceAssignment_2.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//Connaissances:
		//	'connaissances'
		//	'{'
		//	listeConnaissance+=Connaissance*
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//'connaissances' '{' listeConnaissance+=Connaissance* '}'
		public Group getGroup() { return cGroup; }
		
		//'connaissances'
		public Keyword getConnaissancesKeyword_0() { return cConnaissancesKeyword_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }
		
		//listeConnaissance+=Connaissance*
		public Assignment getListeConnaissanceAssignment_2() { return cListeConnaissanceAssignment_2; }
		
		//Connaissance
		public RuleCall getListeConnaissanceConnaissanceParserRuleCall_2_0() { return cListeConnaissanceConnaissanceParserRuleCall_2_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_3() { return cRightCurlyBracketKeyword_3; }
	}
	public class ConnaissanceElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "fr.n7.Game.Connaissance");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cConnaissanceKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		
		//Connaissance:
		//	'connaissance'
		//	name=ID;
		@Override public ParserRule getRule() { return rule; }
		
		//'connaissance' name=ID
		public Group getGroup() { return cGroup; }
		
		//'connaissance'
		public Keyword getConnaissanceKeyword_0() { return cConnaissanceKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
	}
	
	
	private final GameElements pGame;
	private final GameElementElements pGameElement;
	private final TerritoireElements pTerritoire;
	private final ExplorateurElements pExplorateur;
	private final SacElements pSac;
	private final LieuElements pLieu;
	private final LieuDebutElements pLieuDebut;
	private final LieuFinElements pLieuFin;
	private final PersonnesElements pPersonnes;
	private final PersonneElements pPersonne;
	private final InteractionElements pInteraction;
	private final TexteElements pTexte;
	private final ChoixElements pChoix;
	private final ObjetElements pObjet;
	private final ObjetsElements pObjets;
	private final ConnaissancesElements pConnaissances;
	private final ConnaissanceElements pConnaissance;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public GameGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pGame = new GameElements();
		this.pGameElement = new GameElementElements();
		this.pTerritoire = new TerritoireElements();
		this.pExplorateur = new ExplorateurElements();
		this.pSac = new SacElements();
		this.pLieu = new LieuElements();
		this.pLieuDebut = new LieuDebutElements();
		this.pLieuFin = new LieuFinElements();
		this.pPersonnes = new PersonnesElements();
		this.pPersonne = new PersonneElements();
		this.pInteraction = new InteractionElements();
		this.pTexte = new TexteElements();
		this.pChoix = new ChoixElements();
		this.pObjet = new ObjetElements();
		this.pObjets = new ObjetsElements();
		this.pConnaissances = new ConnaissancesElements();
		this.pConnaissance = new ConnaissanceElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("fr.n7.Game".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//Game:
	//	'Game'
	//	name=ID
	//	'{'
	//	gameElements+=gameElement
	//	'}';
	public GameElements getGameAccess() {
		return pGame;
	}
	
	public ParserRule getGameRule() {
		return getGameAccess().getRule();
	}
	
	//gameElement:
	//	Territoire;
	public GameElementElements getGameElementAccess() {
		return pGameElement;
	}
	
	public ParserRule getGameElementRule() {
		return getGameElementAccess().getRule();
	}
	
	//Territoire:
	//	'territoire'
	//	name=ID
	//	'{'
	//	territoireElements+=Explorateur
	//	territoireElements+=LieuDebut
	//	territoireElements+=LieuFin+
	//	territoireElements+=Lieu*
	//	'}';
	public TerritoireElements getTerritoireAccess() {
		return pTerritoire;
	}
	
	public ParserRule getTerritoireRule() {
		return getTerritoireAccess().getRule();
	}
	
	//Explorateur:
	//	'explorateur'
	//	name=ID
	//	'{'
	//	explorateurElements+=Sac
	//	explorateurElements+=Connaissances?
	//	explorateurElements+=Lieu?
	//	'}';
	public ExplorateurElements getExplorateurAccess() {
		return pExplorateur;
	}
	
	public ParserRule getExplorateurRule() {
		return getExplorateurAccess().getRule();
	}
	
	//Sac:
	//	'sac'
	//	taille=INT
	//	'{'
	//	sacElements+=Objet*
	//	'}';
	public SacElements getSacAccess() {
		return pSac;
	}
	
	public ParserRule getSacRule() {
		return getSacAccess().getRule();
	}
	
	//Lieu:
	//	'lieu'
	//	name=ID
	//	'{'
	//	lieuElements+=Personnes?
	//	lieuElements+=Connaissances?
	//	lieuElements+=Objets?
	//	'}';
	public LieuElements getLieuAccess() {
		return pLieu;
	}
	
	public ParserRule getLieuRule() {
		return getLieuAccess().getRule();
	}
	
	//LieuDebut:
	//	'lieudebut'
	//	name=ID
	//	'{'
	//	lieudebutElements+=Personnes?
	//	'}';
	public LieuDebutElements getLieuDebutAccess() {
		return pLieuDebut;
	}
	
	public ParserRule getLieuDebutRule() {
		return getLieuDebutAccess().getRule();
	}
	
	//LieuFin:
	//	'lieufin'
	//	name=ID
	//	'{'
	//	lieudebutElements+=Personnes?
	//	'}';
	public LieuFinElements getLieuFinAccess() {
		return pLieuFin;
	}
	
	public ParserRule getLieuFinRule() {
		return getLieuFinAccess().getRule();
	}
	
	//Personnes:
	//	'personnes'
	//	'{'
	//	listePersonne+=Personne*
	//	'}';
	public PersonnesElements getPersonnesAccess() {
		return pPersonnes;
	}
	
	public ParserRule getPersonnesRule() {
		return getPersonnesAccess().getRule();
	}
	
	//Personne:
	//	'personne'
	//	name=ID
	//	'{'
	//	'visible'
	//	'obligatoire'
	//	personneElements+=Interaction
	//	'}';
	public PersonneElements getPersonneAccess() {
		return pPersonne;
	}
	
	public ParserRule getPersonneRule() {
		return getPersonneAccess().getRule();
	}
	
	//Interaction:
	//	'interaction'
	//	name=ID
	//	'{'
	//	'texte'
	//	interactionElements+=Choix*
	//	'}';
	public InteractionElements getInteractionAccess() {
		return pInteraction;
	}
	
	public ParserRule getInteractionRule() {
		return getInteractionAccess().getRule();
	}
	
	//Texte:
	//	texte=STRING;
	public TexteElements getTexteAccess() {
		return pTexte;
	}
	
	public ParserRule getTexteRule() {
		return getTexteAccess().getRule();
	}
	
	//Choix:
	//	'choix'
	//	name=ID;
	public ChoixElements getChoixAccess() {
		return pChoix;
	}
	
	public ParserRule getChoixRule() {
		return getChoixAccess().getRule();
	}
	
	//Objet:
	//	'objet'
	//	name=ID
	//	taille=INT
	//	quantite=INT;
	public ObjetElements getObjetAccess() {
		return pObjet;
	}
	
	public ParserRule getObjetRule() {
		return getObjetAccess().getRule();
	}
	
	//Objets:
	//	'objets'
	//	'{'
	//	listeObjets+=Objet*
	//	'}';
	public ObjetsElements getObjetsAccess() {
		return pObjets;
	}
	
	public ParserRule getObjetsRule() {
		return getObjetsAccess().getRule();
	}
	
	//Connaissances:
	//	'connaissances'
	//	'{'
	//	listeConnaissance+=Connaissance*
	//	'}';
	public ConnaissancesElements getConnaissancesAccess() {
		return pConnaissances;
	}
	
	public ParserRule getConnaissancesRule() {
		return getConnaissancesAccess().getRule();
	}
	
	//Connaissance:
	//	'connaissance'
	//	name=ID;
	public ConnaissanceElements getConnaissanceAccess() {
		return pConnaissance;
	}
	
	public ParserRule getConnaissanceRule() {
		return getConnaissanceAccess().getRule();
	}
	
	//terminal ID:
	//	'^'? ('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '_' | '0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	}
	
	//terminal INT returns ecore::EInt:
	//	'0'..'9'+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	}
	
	//terminal STRING:
	//	'"' ('\\' . | !('\\' | '"'))* '"' |
	//	"'" ('\\' . | !('\\' | "'"))* "'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	}
	
	//terminal ML_COMMENT:
	//	'/*'->'*/';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	}
	
	//terminal SL_COMMENT:
	//	'//' !('\n' | '\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	}
	
	//terminal WS:
	//	' ' | '\t' | '\r' | '\n'+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	}
	
	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}
