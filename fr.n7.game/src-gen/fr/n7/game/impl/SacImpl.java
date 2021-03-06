/**
 * generated by Xtext 2.23.0
 */
package fr.n7.game.impl;

import fr.n7.game.GamePackage;
import fr.n7.game.Objet;
import fr.n7.game.Sac;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sac</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.n7.game.impl.SacImpl#getTaille <em>Taille</em>}</li>
 *   <li>{@link fr.n7.game.impl.SacImpl#getSacElements <em>Sac Elements</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SacImpl extends MinimalEObjectImpl.Container implements Sac
{
  /**
   * The default value of the '{@link #getTaille() <em>Taille</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTaille()
   * @generated
   * @ordered
   */
  protected static final int TAILLE_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getTaille() <em>Taille</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTaille()
   * @generated
   * @ordered
   */
  protected int taille = TAILLE_EDEFAULT;

  /**
   * The cached value of the '{@link #getSacElements() <em>Sac Elements</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSacElements()
   * @generated
   * @ordered
   */
  protected EList<Objet> sacElements;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SacImpl()
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
    return GamePackage.Literals.SAC;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getTaille()
  {
    return taille;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setTaille(int newTaille)
  {
    int oldTaille = taille;
    taille = newTaille;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GamePackage.SAC__TAILLE, oldTaille, taille));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Objet> getSacElements()
  {
    if (sacElements == null)
    {
      sacElements = new EObjectContainmentEList<Objet>(Objet.class, this, GamePackage.SAC__SAC_ELEMENTS);
    }
    return sacElements;
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
      case GamePackage.SAC__SAC_ELEMENTS:
        return ((InternalEList<?>)getSacElements()).basicRemove(otherEnd, msgs);
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
      case GamePackage.SAC__TAILLE:
        return getTaille();
      case GamePackage.SAC__SAC_ELEMENTS:
        return getSacElements();
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
      case GamePackage.SAC__TAILLE:
        setTaille((Integer)newValue);
        return;
      case GamePackage.SAC__SAC_ELEMENTS:
        getSacElements().clear();
        getSacElements().addAll((Collection<? extends Objet>)newValue);
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
      case GamePackage.SAC__TAILLE:
        setTaille(TAILLE_EDEFAULT);
        return;
      case GamePackage.SAC__SAC_ELEMENTS:
        getSacElements().clear();
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
      case GamePackage.SAC__TAILLE:
        return taille != TAILLE_EDEFAULT;
      case GamePackage.SAC__SAC_ELEMENTS:
        return sacElements != null && !sacElements.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (taille: ");
    result.append(taille);
    result.append(')');
    return result.toString();
  }

} //SacImpl
