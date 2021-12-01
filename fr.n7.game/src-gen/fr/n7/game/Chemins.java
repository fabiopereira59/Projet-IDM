/**
 * generated by Xtext 2.23.0
 */
package fr.n7.game;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Chemins</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.n7.game.Chemins#getListeChemins <em>Liste Chemins</em>}</li>
 * </ul>
 *
 * @see fr.n7.game.GamePackage#getChemins()
 * @model
 * @generated
 */
public interface Chemins extends territoireElement
{
  /**
   * Returns the value of the '<em><b>Liste Chemins</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Liste Chemins</em>' containment reference.
   * @see #setListeChemins(Chemin)
   * @see fr.n7.game.GamePackage#getChemins_ListeChemins()
   * @model containment="true"
   * @generated
   */
  Chemin getListeChemins();

  /**
   * Sets the value of the '{@link fr.n7.game.Chemins#getListeChemins <em>Liste Chemins</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Liste Chemins</em>' containment reference.
   * @see #getListeChemins()
   * @generated
   */
  void setListeChemins(Chemin value);

} // Chemins