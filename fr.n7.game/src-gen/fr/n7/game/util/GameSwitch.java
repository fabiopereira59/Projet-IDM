/**
 * generated by Xtext 2.23.0
 */
package fr.n7.game.util;

import fr.n7.game.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see fr.n7.game.GamePackage
 * @generated
 */
public class GameSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static GamePackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GameSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = GamePackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case GamePackage.GAME:
      {
        Game game = (Game)theEObject;
        T result = caseGame(game);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GamePackage.GAME_ELEMENT:
      {
        gameElement gameElement = (gameElement)theEObject;
        T result = casegameElement(gameElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GamePackage.TERRITOIRE_ELEMENT:
      {
        territoireElement territoireElement = (territoireElement)theEObject;
        T result = caseterritoireElement(territoireElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GamePackage.EXPLORATEUR:
      {
        Explorateur explorateur = (Explorateur)theEObject;
        T result = caseExplorateur(explorateur);
        if (result == null) result = caseterritoireElement(explorateur);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GamePackage.SAC:
      {
        Sac sac = (Sac)theEObject;
        T result = caseSac(sac);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GamePackage.TERRITOIRE:
      {
        Territoire territoire = (Territoire)theEObject;
        T result = caseTerritoire(territoire);
        if (result == null) result = casegameElement(territoire);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GamePackage.LIEU:
      {
        Lieu lieu = (Lieu)theEObject;
        T result = caseLieu(lieu);
        if (result == null) result = caseterritoireElement(lieu);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GamePackage.PERSONNES:
      {
        Personnes personnes = (Personnes)theEObject;
        T result = casePersonnes(personnes);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GamePackage.PERSONNE:
      {
        Personne personne = (Personne)theEObject;
        T result = casePersonne(personne);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GamePackage.INTERACTION:
      {
        Interaction interaction = (Interaction)theEObject;
        T result = caseInteraction(interaction);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GamePackage.TEXTE:
      {
        Texte texte = (Texte)theEObject;
        T result = caseTexte(texte);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GamePackage.CHOIX:
      {
        Choix choix = (Choix)theEObject;
        T result = caseChoix(choix);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GamePackage.OBJET:
      {
        Objet objet = (Objet)theEObject;
        T result = caseObjet(objet);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GamePackage.CONNAISSANCES:
      {
        Connaissances connaissances = (Connaissances)theEObject;
        T result = caseConnaissances(connaissances);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GamePackage.CONNAISSANCE:
      {
        Connaissance connaissance = (Connaissance)theEObject;
        T result = caseConnaissance(connaissance);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Game</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Game</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGame(Game object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>game Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>game Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casegameElement(gameElement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>territoire Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>territoire Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseterritoireElement(territoireElement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Explorateur</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Explorateur</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExplorateur(Explorateur object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Sac</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Sac</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSac(Sac object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Territoire</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Territoire</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTerritoire(Territoire object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Lieu</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Lieu</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLieu(Lieu object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Personnes</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Personnes</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePersonnes(Personnes object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Personne</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Personne</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePersonne(Personne object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Interaction</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Interaction</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInteraction(Interaction object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Texte</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Texte</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTexte(Texte object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Choix</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Choix</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseChoix(Choix object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Objet</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Objet</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseObjet(Objet object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Connaissances</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Connaissances</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseConnaissances(Connaissances object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Connaissance</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Connaissance</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseConnaissance(Connaissance object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //GameSwitch
