/**
 * generated by Xtext 2.23.0
 */
package fr.n7.game.impl;

import fr.n7.game.Condition;
import fr.n7.game.Conditions;
import fr.n7.game.GamePackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Conditions</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.n7.game.impl.ConditionsImpl#getListeConditions <em>Liste Conditions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConditionsImpl extends territoireElementImpl implements Conditions
{
  /**
   * The cached value of the '{@link #getListeConditions() <em>Liste Conditions</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getListeConditions()
   * @generated
   * @ordered
   */
  protected EList<Condition> listeConditions;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ConditionsImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return GamePackage.Literals.CONDITIONS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Condition> getListeConditions()
  {
    if (listeConditions == null)
    {
      listeConditions = new EObjectContainmentEList<Condition>(Condition.class, this, GamePackage.CONDITIONS__LISTE_CONDITIONS);
    }
    return listeConditions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case GamePackage.CONDITIONS__LISTE_CONDITIONS:
        return ((InternalEList<?>)getListeConditions()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case GamePackage.CONDITIONS__LISTE_CONDITIONS:
        return getListeConditions();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case GamePackage.CONDITIONS__LISTE_CONDITIONS:
        getListeConditions().clear();
        getListeConditions().addAll((Collection<? extends Condition>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case GamePackage.CONDITIONS__LISTE_CONDITIONS:
        getListeConditions().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case GamePackage.CONDITIONS__LISTE_CONDITIONS:
        return listeConditions != null && !listeConditions.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ConditionsImpl
