/**
 * generated by Xtext 2.23.0
 */
package fr.n7.game.impl;

import fr.n7.game.GamePackage;
import fr.n7.game.ObjetExplorateur;
import fr.n7.game.ObjetsExplorateur;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Objets Explorateur</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.n7.game.impl.ObjetsExplorateurImpl#getListeObjets <em>Liste Objets</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ObjetsExplorateurImpl extends territoireElementImpl implements ObjetsExplorateur
{
  /**
   * The cached value of the '{@link #getListeObjets() <em>Liste Objets</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getListeObjets()
   * @generated
   * @ordered
   */
  protected ObjetExplorateur listeObjets;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ObjetsExplorateurImpl()
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
    return GamePackage.Literals.OBJETS_EXPLORATEUR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ObjetExplorateur getListeObjets()
  {
    return listeObjets;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetListeObjets(ObjetExplorateur newListeObjets, NotificationChain msgs)
  {
    ObjetExplorateur oldListeObjets = listeObjets;
    listeObjets = newListeObjets;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GamePackage.OBJETS_EXPLORATEUR__LISTE_OBJETS, oldListeObjets, newListeObjets);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setListeObjets(ObjetExplorateur newListeObjets)
  {
    if (newListeObjets != listeObjets)
    {
      NotificationChain msgs = null;
      if (listeObjets != null)
        msgs = ((InternalEObject)listeObjets).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GamePackage.OBJETS_EXPLORATEUR__LISTE_OBJETS, null, msgs);
      if (newListeObjets != null)
        msgs = ((InternalEObject)newListeObjets).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GamePackage.OBJETS_EXPLORATEUR__LISTE_OBJETS, null, msgs);
      msgs = basicSetListeObjets(newListeObjets, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GamePackage.OBJETS_EXPLORATEUR__LISTE_OBJETS, newListeObjets, newListeObjets));
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
      case GamePackage.OBJETS_EXPLORATEUR__LISTE_OBJETS:
        return basicSetListeObjets(null, msgs);
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
      case GamePackage.OBJETS_EXPLORATEUR__LISTE_OBJETS:
        return getListeObjets();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case GamePackage.OBJETS_EXPLORATEUR__LISTE_OBJETS:
        setListeObjets((ObjetExplorateur)newValue);
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
      case GamePackage.OBJETS_EXPLORATEUR__LISTE_OBJETS:
        setListeObjets((ObjetExplorateur)null);
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
      case GamePackage.OBJETS_EXPLORATEUR__LISTE_OBJETS:
        return listeObjets != null;
    }
    return super.eIsSet(featureID);
  }

} //ObjetsExplorateurImpl
