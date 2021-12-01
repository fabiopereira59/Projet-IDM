/**
 * generated by Xtext 2.23.0
 */
package fr.n7.game.impl;

import fr.n7.game.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GameFactoryImpl extends EFactoryImpl implements GameFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static GameFactory init()
  {
    try
    {
      GameFactory theGameFactory = (GameFactory)EPackage.Registry.INSTANCE.getEFactory(GamePackage.eNS_URI);
      if (theGameFactory != null)
      {
        return theGameFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new GameFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GameFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case GamePackage.GAME: return createGame();
      case GamePackage.TERRITOIRE_ELEMENT: return createterritoireElement();
      case GamePackage.EXPLORATEUR: return createExplorateur();
      case GamePackage.SAC: return createSac();
      case GamePackage.LIEU: return createLieu();
      case GamePackage.PERSONNES: return createPersonnes();
      case GamePackage.PERSONNE: return createPersonne();
      case GamePackage.INTERACTION: return createInteraction();
      case GamePackage.CHOIX: return createChoix();
      case GamePackage.ACTION: return createAction();
      case GamePackage.OBJET_EXPLORATEUR: return createObjetExplorateur();
      case GamePackage.OBJET_LIEU: return createObjetLieu();
      case GamePackage.OBJETS_EXPLORATEUR: return createObjetsExplorateur();
      case GamePackage.OBJETS_LIEU: return createObjetsLieu();
      case GamePackage.CONNAISSANCES: return createConnaissances();
      case GamePackage.CONNAISSANCE: return createConnaissance();
      case GamePackage.CONDITIONS: return createConditions();
      case GamePackage.CONDITION: return createCondition();
      case GamePackage.CHEMINS: return createChemins();
      case GamePackage.CHEMIN: return createChemin();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object createFromString(EDataType eDataType, String initialValue)
  {
    switch (eDataType.getClassifierID())
    {
      case GamePackage.TYPE_LIEU:
        return createTypeLieuFromString(eDataType, initialValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
    switch (eDataType.getClassifierID())
    {
      case GamePackage.TYPE_LIEU:
        return convertTypeLieuToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Game createGame()
  {
    GameImpl game = new GameImpl();
    return game;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public territoireElement createterritoireElement()
  {
    territoireElementImpl territoireElement = new territoireElementImpl();
    return territoireElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Explorateur createExplorateur()
  {
    ExplorateurImpl explorateur = new ExplorateurImpl();
    return explorateur;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Sac createSac()
  {
    SacImpl sac = new SacImpl();
    return sac;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Lieu createLieu()
  {
    LieuImpl lieu = new LieuImpl();
    return lieu;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Personnes createPersonnes()
  {
    PersonnesImpl personnes = new PersonnesImpl();
    return personnes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Personne createPersonne()
  {
    PersonneImpl personne = new PersonneImpl();
    return personne;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Interaction createInteraction()
  {
    InteractionImpl interaction = new InteractionImpl();
    return interaction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Choix createChoix()
  {
    ChoixImpl choix = new ChoixImpl();
    return choix;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Action createAction()
  {
    ActionImpl action = new ActionImpl();
    return action;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ObjetExplorateur createObjetExplorateur()
  {
    ObjetExplorateurImpl objetExplorateur = new ObjetExplorateurImpl();
    return objetExplorateur;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ObjetLieu createObjetLieu()
  {
    ObjetLieuImpl objetLieu = new ObjetLieuImpl();
    return objetLieu;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ObjetsExplorateur createObjetsExplorateur()
  {
    ObjetsExplorateurImpl objetsExplorateur = new ObjetsExplorateurImpl();
    return objetsExplorateur;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ObjetsLieu createObjetsLieu()
  {
    ObjetsLieuImpl objetsLieu = new ObjetsLieuImpl();
    return objetsLieu;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Connaissances createConnaissances()
  {
    ConnaissancesImpl connaissances = new ConnaissancesImpl();
    return connaissances;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Connaissance createConnaissance()
  {
    ConnaissanceImpl connaissance = new ConnaissanceImpl();
    return connaissance;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Conditions createConditions()
  {
    ConditionsImpl conditions = new ConditionsImpl();
    return conditions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Condition createCondition()
  {
    ConditionImpl condition = new ConditionImpl();
    return condition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Chemins createChemins()
  {
    CheminsImpl chemins = new CheminsImpl();
    return chemins;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Chemin createChemin()
  {
    CheminImpl chemin = new CheminImpl();
    return chemin;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeLieu createTypeLieuFromString(EDataType eDataType, String initialValue)
  {
    TypeLieu result = TypeLieu.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertTypeLieuToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public GamePackage getGamePackage()
  {
    return (GamePackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static GamePackage getPackage()
  {
    return GamePackage.eINSTANCE;
  }

} //GameFactoryImpl
