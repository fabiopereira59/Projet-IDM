/**
 * generated by Xtext 2.23.0
 */
package fr.n7.game;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see fr.n7.game.GamePackage
 * @generated
 */
public interface GameFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  GameFactory eINSTANCE = fr.n7.game.impl.GameFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Game</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Game</em>'.
   * @generated
   */
  Game createGame();

  /**
   * Returns a new object of class '<em>territoire Element</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>territoire Element</em>'.
   * @generated
   */
  territoireElement createterritoireElement();

  /**
   * Returns a new object of class '<em>Explorateur</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Explorateur</em>'.
   * @generated
   */
  Explorateur createExplorateur();

  /**
   * Returns a new object of class '<em>Sac</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Sac</em>'.
   * @generated
   */
  Sac createSac();

  /**
   * Returns a new object of class '<em>Lieu</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Lieu</em>'.
   * @generated
   */
  Lieu createLieu();

  /**
   * Returns a new object of class '<em>Personnes</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Personnes</em>'.
   * @generated
   */
  Personnes createPersonnes();

  /**
   * Returns a new object of class '<em>Personne</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Personne</em>'.
   * @generated
   */
  Personne createPersonne();

  /**
   * Returns a new object of class '<em>Interaction</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Interaction</em>'.
   * @generated
   */
  Interaction createInteraction();

  /**
   * Returns a new object of class '<em>Choix</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Choix</em>'.
   * @generated
   */
  Choix createChoix();

  /**
   * Returns a new object of class '<em>Action</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Action</em>'.
   * @generated
   */
  Action createAction();

  /**
   * Returns a new object of class '<em>Objet Explorateur</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Objet Explorateur</em>'.
   * @generated
   */
  ObjetExplorateur createObjetExplorateur();

  /**
   * Returns a new object of class '<em>Objet Lieu</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Objet Lieu</em>'.
   * @generated
   */
  ObjetLieu createObjetLieu();

  /**
   * Returns a new object of class '<em>Objets Explorateur</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Objets Explorateur</em>'.
   * @generated
   */
  ObjetsExplorateur createObjetsExplorateur();

  /**
   * Returns a new object of class '<em>Objets Lieu</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Objets Lieu</em>'.
   * @generated
   */
  ObjetsLieu createObjetsLieu();

  /**
   * Returns a new object of class '<em>Connaissances</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Connaissances</em>'.
   * @generated
   */
  Connaissances createConnaissances();

  /**
   * Returns a new object of class '<em>Connaissance</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Connaissance</em>'.
   * @generated
   */
  Connaissance createConnaissance();

  /**
   * Returns a new object of class '<em>Condition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Condition</em>'.
   * @generated
   */
  Condition createCondition();

  /**
   * Returns a new object of class '<em>Chemins</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Chemins</em>'.
   * @generated
   */
  Chemins createChemins();

  /**
   * Returns a new object of class '<em>Chemin</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Chemin</em>'.
   * @generated
   */
  Chemin createChemin();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  GamePackage getGamePackage();

} //GameFactory
