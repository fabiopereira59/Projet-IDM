/**
 * generated by Xtext 2.23.0
 */
package fr.n7.game;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Lieu Fin</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.n7.game.LieuFin#getName <em>Name</em>}</li>
 *   <li>{@link fr.n7.game.LieuFin#getLieudebutElements <em>Lieudebut Elements</em>}</li>
 * </ul>
 *
 * @see fr.n7.game.GamePackage#getLieuFin()
 * @model
 * @generated
 */
public interface LieuFin extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see fr.n7.game.GamePackage#getLieuFin_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link fr.n7.game.LieuFin#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Lieudebut Elements</b></em>' containment reference list.
   * The list contents are of type {@link fr.n7.game.Personnes}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Lieudebut Elements</em>' containment reference list.
   * @see fr.n7.game.GamePackage#getLieuFin_LieudebutElements()
   * @model containment="true"
   * @generated
   */
  EList<Personnes> getLieudebutElements();

} // LieuFin
