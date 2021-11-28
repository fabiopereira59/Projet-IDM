/**
 * generated by Xtext 2.23.0
 */
package fr.n7.game;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connaissance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.n7.game.Connaissance#getName <em>Name</em>}</li>
 *   <li>{@link fr.n7.game.Connaissance#getDescription <em>Description</em>}</li>
 *   <li>{@link fr.n7.game.Connaissance#getConditionConnaissance <em>Condition Connaissance</em>}</li>
 * </ul>
 *
 * @see fr.n7.game.GamePackage#getConnaissance()
 * @model
 * @generated
 */
public interface Connaissance extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see fr.n7.game.GamePackage#getConnaissance_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link fr.n7.game.Connaissance#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Description</em>' attribute.
   * @see #setDescription(String)
   * @see fr.n7.game.GamePackage#getConnaissance_Description()
   * @model
   * @generated
   */
  String getDescription();

  /**
   * Sets the value of the '{@link fr.n7.game.Connaissance#getDescription <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Description</em>' attribute.
   * @see #getDescription()
   * @generated
   */
  void setDescription(String value);

  /**
   * Returns the value of the '<em><b>Condition Connaissance</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Condition Connaissance</em>' containment reference.
   * @see #setConditionConnaissance(Condition)
   * @see fr.n7.game.GamePackage#getConnaissance_ConditionConnaissance()
   * @model containment="true"
   * @generated
   */
  Condition getConditionConnaissance();

  /**
   * Sets the value of the '{@link fr.n7.game.Connaissance#getConditionConnaissance <em>Condition Connaissance</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Condition Connaissance</em>' containment reference.
   * @see #getConditionConnaissance()
   * @generated
   */
  void setConditionConnaissance(Condition value);

} // Connaissance
