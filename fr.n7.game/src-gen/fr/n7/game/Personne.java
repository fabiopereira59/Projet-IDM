/**
 * generated by Xtext 2.23.0
 */
package fr.n7.game;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Personne</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.n7.game.Personne#getName <em>Name</em>}</li>
 *   <li>{@link fr.n7.game.Personne#getPersonneElements <em>Personne Elements</em>}</li>
 * </ul>
 *
 * @see fr.n7.game.GamePackage#getPersonne()
 * @model
 * @generated
 */
public interface Personne extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see fr.n7.game.GamePackage#getPersonne_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link fr.n7.game.Personne#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Personne Elements</b></em>' containment reference list.
   * The list contents are of type {@link fr.n7.game.Interaction}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Personne Elements</em>' containment reference list.
   * @see fr.n7.game.GamePackage#getPersonne_PersonneElements()
   * @model containment="true"
   * @generated
   */
  EList<Interaction> getPersonneElements();

} // Personne
