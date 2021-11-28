/**
 * generated by Xtext 2.23.0
 */
package fr.n7.game.impl;

import fr.n7.game.Condition;
import fr.n7.game.Connaissance;
import fr.n7.game.GamePackage;
import fr.n7.game.LieuFin;
import fr.n7.game.Objet;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Lieu Fin</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.n7.game.impl.LieuFinImpl#getLieufinElements <em>Lieufin Elements</em>}</li>
 *   <li>{@link fr.n7.game.impl.LieuFinImpl#getObligatoire <em>Obligatoire</em>}</li>
 *   <li>{@link fr.n7.game.impl.LieuFinImpl#getVisible <em>Visible</em>}</li>
 *   <li>{@link fr.n7.game.impl.LieuFinImpl#getOuvert <em>Ouvert</em>}</li>
 *   <li>{@link fr.n7.game.impl.LieuFinImpl#getListeConnaissances <em>Liste Connaissances</em>}</li>
 *   <li>{@link fr.n7.game.impl.LieuFinImpl#getListeObjets <em>Liste Objets</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LieuFinImpl extends CheminImpl implements LieuFin
{
  /**
   * The cached value of the '{@link #getLieufinElements() <em>Lieufin Elements</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLieufinElements()
   * @generated
   * @ordered
   */
  protected EList<EObject> lieufinElements;

  /**
   * The cached value of the '{@link #getObligatoire() <em>Obligatoire</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getObligatoire()
   * @generated
   * @ordered
   */
  protected Condition obligatoire;

  /**
   * The cached value of the '{@link #getVisible() <em>Visible</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVisible()
   * @generated
   * @ordered
   */
  protected Condition visible;

  /**
   * The cached value of the '{@link #getOuvert() <em>Ouvert</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOuvert()
   * @generated
   * @ordered
   */
  protected Condition ouvert;

  /**
   * The cached value of the '{@link #getListeConnaissances() <em>Liste Connaissances</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getListeConnaissances()
   * @generated
   * @ordered
   */
  protected EList<Connaissance> listeConnaissances;

  /**
   * The cached value of the '{@link #getListeObjets() <em>Liste Objets</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getListeObjets()
   * @generated
   * @ordered
   */
  protected EList<Objet> listeObjets;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected LieuFinImpl()
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
    return GamePackage.Literals.LIEU_FIN;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<EObject> getLieufinElements()
  {
    if (lieufinElements == null)
    {
      lieufinElements = new EObjectContainmentEList<EObject>(EObject.class, this, GamePackage.LIEU_FIN__LIEUFIN_ELEMENTS);
    }
    return lieufinElements;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Condition getObligatoire()
  {
    return obligatoire;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetObligatoire(Condition newObligatoire, NotificationChain msgs)
  {
    Condition oldObligatoire = obligatoire;
    obligatoire = newObligatoire;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GamePackage.LIEU_FIN__OBLIGATOIRE, oldObligatoire, newObligatoire);
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
  public void setObligatoire(Condition newObligatoire)
  {
    if (newObligatoire != obligatoire)
    {
      NotificationChain msgs = null;
      if (obligatoire != null)
        msgs = ((InternalEObject)obligatoire).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GamePackage.LIEU_FIN__OBLIGATOIRE, null, msgs);
      if (newObligatoire != null)
        msgs = ((InternalEObject)newObligatoire).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GamePackage.LIEU_FIN__OBLIGATOIRE, null, msgs);
      msgs = basicSetObligatoire(newObligatoire, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GamePackage.LIEU_FIN__OBLIGATOIRE, newObligatoire, newObligatoire));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Condition getVisible()
  {
    return visible;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetVisible(Condition newVisible, NotificationChain msgs)
  {
    Condition oldVisible = visible;
    visible = newVisible;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GamePackage.LIEU_FIN__VISIBLE, oldVisible, newVisible);
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
  public void setVisible(Condition newVisible)
  {
    if (newVisible != visible)
    {
      NotificationChain msgs = null;
      if (visible != null)
        msgs = ((InternalEObject)visible).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GamePackage.LIEU_FIN__VISIBLE, null, msgs);
      if (newVisible != null)
        msgs = ((InternalEObject)newVisible).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GamePackage.LIEU_FIN__VISIBLE, null, msgs);
      msgs = basicSetVisible(newVisible, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GamePackage.LIEU_FIN__VISIBLE, newVisible, newVisible));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Condition getOuvert()
  {
    return ouvert;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetOuvert(Condition newOuvert, NotificationChain msgs)
  {
    Condition oldOuvert = ouvert;
    ouvert = newOuvert;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GamePackage.LIEU_FIN__OUVERT, oldOuvert, newOuvert);
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
  public void setOuvert(Condition newOuvert)
  {
    if (newOuvert != ouvert)
    {
      NotificationChain msgs = null;
      if (ouvert != null)
        msgs = ((InternalEObject)ouvert).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GamePackage.LIEU_FIN__OUVERT, null, msgs);
      if (newOuvert != null)
        msgs = ((InternalEObject)newOuvert).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GamePackage.LIEU_FIN__OUVERT, null, msgs);
      msgs = basicSetOuvert(newOuvert, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GamePackage.LIEU_FIN__OUVERT, newOuvert, newOuvert));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Connaissance> getListeConnaissances()
  {
    if (listeConnaissances == null)
    {
      listeConnaissances = new EObjectContainmentEList<Connaissance>(Connaissance.class, this, GamePackage.LIEU_FIN__LISTE_CONNAISSANCES);
    }
    return listeConnaissances;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Objet> getListeObjets()
  {
    if (listeObjets == null)
    {
      listeObjets = new EObjectContainmentEList<Objet>(Objet.class, this, GamePackage.LIEU_FIN__LISTE_OBJETS);
    }
    return listeObjets;
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
      case GamePackage.LIEU_FIN__LIEUFIN_ELEMENTS:
        return ((InternalEList<?>)getLieufinElements()).basicRemove(otherEnd, msgs);
      case GamePackage.LIEU_FIN__OBLIGATOIRE:
        return basicSetObligatoire(null, msgs);
      case GamePackage.LIEU_FIN__VISIBLE:
        return basicSetVisible(null, msgs);
      case GamePackage.LIEU_FIN__OUVERT:
        return basicSetOuvert(null, msgs);
      case GamePackage.LIEU_FIN__LISTE_CONNAISSANCES:
        return ((InternalEList<?>)getListeConnaissances()).basicRemove(otherEnd, msgs);
      case GamePackage.LIEU_FIN__LISTE_OBJETS:
        return ((InternalEList<?>)getListeObjets()).basicRemove(otherEnd, msgs);
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
      case GamePackage.LIEU_FIN__LIEUFIN_ELEMENTS:
        return getLieufinElements();
      case GamePackage.LIEU_FIN__OBLIGATOIRE:
        return getObligatoire();
      case GamePackage.LIEU_FIN__VISIBLE:
        return getVisible();
      case GamePackage.LIEU_FIN__OUVERT:
        return getOuvert();
      case GamePackage.LIEU_FIN__LISTE_CONNAISSANCES:
        return getListeConnaissances();
      case GamePackage.LIEU_FIN__LISTE_OBJETS:
        return getListeObjets();
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
      case GamePackage.LIEU_FIN__LIEUFIN_ELEMENTS:
        getLieufinElements().clear();
        getLieufinElements().addAll((Collection<? extends EObject>)newValue);
        return;
      case GamePackage.LIEU_FIN__OBLIGATOIRE:
        setObligatoire((Condition)newValue);
        return;
      case GamePackage.LIEU_FIN__VISIBLE:
        setVisible((Condition)newValue);
        return;
      case GamePackage.LIEU_FIN__OUVERT:
        setOuvert((Condition)newValue);
        return;
      case GamePackage.LIEU_FIN__LISTE_CONNAISSANCES:
        getListeConnaissances().clear();
        getListeConnaissances().addAll((Collection<? extends Connaissance>)newValue);
        return;
      case GamePackage.LIEU_FIN__LISTE_OBJETS:
        getListeObjets().clear();
        getListeObjets().addAll((Collection<? extends Objet>)newValue);
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
      case GamePackage.LIEU_FIN__LIEUFIN_ELEMENTS:
        getLieufinElements().clear();
        return;
      case GamePackage.LIEU_FIN__OBLIGATOIRE:
        setObligatoire((Condition)null);
        return;
      case GamePackage.LIEU_FIN__VISIBLE:
        setVisible((Condition)null);
        return;
      case GamePackage.LIEU_FIN__OUVERT:
        setOuvert((Condition)null);
        return;
      case GamePackage.LIEU_FIN__LISTE_CONNAISSANCES:
        getListeConnaissances().clear();
        return;
      case GamePackage.LIEU_FIN__LISTE_OBJETS:
        getListeObjets().clear();
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
      case GamePackage.LIEU_FIN__LIEUFIN_ELEMENTS:
        return lieufinElements != null && !lieufinElements.isEmpty();
      case GamePackage.LIEU_FIN__OBLIGATOIRE:
        return obligatoire != null;
      case GamePackage.LIEU_FIN__VISIBLE:
        return visible != null;
      case GamePackage.LIEU_FIN__OUVERT:
        return ouvert != null;
      case GamePackage.LIEU_FIN__LISTE_CONNAISSANCES:
        return listeConnaissances != null && !listeConnaissances.isEmpty();
      case GamePackage.LIEU_FIN__LISTE_OBJETS:
        return listeObjets != null && !listeObjets.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //LieuFinImpl
