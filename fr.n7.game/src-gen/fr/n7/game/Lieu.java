/**
 * generated by Xtext 2.23.0
 */
package fr.n7.game;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Lieu</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.n7.game.Lieu#getLieuElements <em>Lieu Elements</em>}</li>
 * </ul>
 *
 * @see fr.n7.game.GamePackage#getLieu()
 * @model
 * @generated
 */
public interface Lieu extends territoireElement
{
  /**
   * Returns the value of the '<em><b>Lieu Elements</b></em>' containment reference list.
   * The list contents are of type {@link fr.n7.game.Personnes}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Lieu Elements</em>' containment reference list.
   * @see fr.n7.game.GamePackage#getLieu_LieuElements()
   * @model containment="true"
   * @generated
   */
  EList<Personnes> getLieuElements();

} // Lieu
