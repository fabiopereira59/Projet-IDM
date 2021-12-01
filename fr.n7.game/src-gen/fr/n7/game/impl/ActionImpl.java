/**
 * generated by Xtext 2.23.0
 */
package fr.n7.game.impl;

import fr.n7.game.Action;
import fr.n7.game.Choix;
import fr.n7.game.Condition;
import fr.n7.game.Connaissance;
import fr.n7.game.GamePackage;
import fr.n7.game.ObjetExplorateur;
import fr.n7.game.ObjetLieu;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.n7.game.impl.ActionImpl#getTexte <em>Texte</em>}</li>
 *   <li>{@link fr.n7.game.impl.ActionImpl#getConditionAction <em>Condition Action</em>}</li>
 *   <li>{@link fr.n7.game.impl.ActionImpl#getListeChoix <em>Liste Choix</em>}</li>
 *   <li>{@link fr.n7.game.impl.ActionImpl#getListeConnaissances <em>Liste Connaissances</em>}</li>
 *   <li>{@link fr.n7.game.impl.ActionImpl#getListeObjets <em>Liste Objets</em>}</li>
 *   <li>{@link fr.n7.game.impl.ActionImpl#getAttributionConnaissance <em>Attribution Connaissance</em>}</li>
 *   <li>{@link fr.n7.game.impl.ActionImpl#getAttributionObjet <em>Attribution Objet</em>}</li>
 *   <li>{@link fr.n7.game.impl.ActionImpl#getListeObjetsConsommes <em>Liste Objets Consommes</em>}</li>
 *   <li>{@link fr.n7.game.impl.ActionImpl#getListeQuantite <em>Liste Quantite</em>}</li>
 *   <li>{@link fr.n7.game.impl.ActionImpl#getConsommationObjet <em>Consommation Objet</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ActionImpl extends MinimalEObjectImpl.Container implements Action
{
  /**
   * The default value of the '{@link #getTexte() <em>Texte</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTexte()
   * @generated
   * @ordered
   */
  protected static final String TEXTE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getTexte() <em>Texte</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTexte()
   * @generated
   * @ordered
   */
  protected String texte = TEXTE_EDEFAULT;

  /**
   * The cached value of the '{@link #getConditionAction() <em>Condition Action</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConditionAction()
   * @generated
   * @ordered
   */
  protected Condition conditionAction;

  /**
   * The cached value of the '{@link #getListeChoix() <em>Liste Choix</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getListeChoix()
   * @generated
   * @ordered
   */
  protected Choix listeChoix;

  /**
   * The cached value of the '{@link #getListeConnaissances() <em>Liste Connaissances</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getListeConnaissances()
   * @generated
   * @ordered
   */
  protected Connaissance listeConnaissances;

  /**
   * The cached value of the '{@link #getListeObjets() <em>Liste Objets</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getListeObjets()
   * @generated
   * @ordered
   */
  protected ObjetLieu listeObjets;

  /**
   * The cached value of the '{@link #getAttributionConnaissance() <em>Attribution Connaissance</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAttributionConnaissance()
   * @generated
   * @ordered
   */
  protected Condition attributionConnaissance;

  /**
   * The cached value of the '{@link #getAttributionObjet() <em>Attribution Objet</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAttributionObjet()
   * @generated
   * @ordered
   */
  protected Condition attributionObjet;

  /**
   * The cached value of the '{@link #getListeObjetsConsommes() <em>Liste Objets Consommes</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getListeObjetsConsommes()
   * @generated
   * @ordered
   */
  protected ObjetExplorateur listeObjetsConsommes;

  /**
   * The default value of the '{@link #getListeQuantite() <em>Liste Quantite</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getListeQuantite()
   * @generated
   * @ordered
   */
  protected static final int LISTE_QUANTITE_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getListeQuantite() <em>Liste Quantite</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getListeQuantite()
   * @generated
   * @ordered
   */
  protected int listeQuantite = LISTE_QUANTITE_EDEFAULT;

  /**
   * The cached value of the '{@link #getConsommationObjet() <em>Consommation Objet</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConsommationObjet()
   * @generated
   * @ordered
   */
  protected Condition consommationObjet;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ActionImpl()
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
    return GamePackage.Literals.ACTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getTexte()
  {
    return texte;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setTexte(String newTexte)
  {
    String oldTexte = texte;
    texte = newTexte;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GamePackage.ACTION__TEXTE, oldTexte, texte));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Condition getConditionAction()
  {
    return conditionAction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetConditionAction(Condition newConditionAction, NotificationChain msgs)
  {
    Condition oldConditionAction = conditionAction;
    conditionAction = newConditionAction;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GamePackage.ACTION__CONDITION_ACTION, oldConditionAction, newConditionAction);
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
  public void setConditionAction(Condition newConditionAction)
  {
    if (newConditionAction != conditionAction)
    {
      NotificationChain msgs = null;
      if (conditionAction != null)
        msgs = ((InternalEObject)conditionAction).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GamePackage.ACTION__CONDITION_ACTION, null, msgs);
      if (newConditionAction != null)
        msgs = ((InternalEObject)newConditionAction).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GamePackage.ACTION__CONDITION_ACTION, null, msgs);
      msgs = basicSetConditionAction(newConditionAction, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GamePackage.ACTION__CONDITION_ACTION, newConditionAction, newConditionAction));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Choix getListeChoix()
  {
    if (listeChoix != null && listeChoix.eIsProxy())
    {
      InternalEObject oldListeChoix = (InternalEObject)listeChoix;
      listeChoix = (Choix)eResolveProxy(oldListeChoix);
      if (listeChoix != oldListeChoix)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, GamePackage.ACTION__LISTE_CHOIX, oldListeChoix, listeChoix));
      }
    }
    return listeChoix;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Choix basicGetListeChoix()
  {
    return listeChoix;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setListeChoix(Choix newListeChoix)
  {
    Choix oldListeChoix = listeChoix;
    listeChoix = newListeChoix;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GamePackage.ACTION__LISTE_CHOIX, oldListeChoix, listeChoix));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Connaissance getListeConnaissances()
  {
    if (listeConnaissances != null && listeConnaissances.eIsProxy())
    {
      InternalEObject oldListeConnaissances = (InternalEObject)listeConnaissances;
      listeConnaissances = (Connaissance)eResolveProxy(oldListeConnaissances);
      if (listeConnaissances != oldListeConnaissances)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, GamePackage.ACTION__LISTE_CONNAISSANCES, oldListeConnaissances, listeConnaissances));
      }
    }
    return listeConnaissances;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Connaissance basicGetListeConnaissances()
  {
    return listeConnaissances;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setListeConnaissances(Connaissance newListeConnaissances)
  {
    Connaissance oldListeConnaissances = listeConnaissances;
    listeConnaissances = newListeConnaissances;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GamePackage.ACTION__LISTE_CONNAISSANCES, oldListeConnaissances, listeConnaissances));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ObjetLieu getListeObjets()
  {
    if (listeObjets != null && listeObjets.eIsProxy())
    {
      InternalEObject oldListeObjets = (InternalEObject)listeObjets;
      listeObjets = (ObjetLieu)eResolveProxy(oldListeObjets);
      if (listeObjets != oldListeObjets)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, GamePackage.ACTION__LISTE_OBJETS, oldListeObjets, listeObjets));
      }
    }
    return listeObjets;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ObjetLieu basicGetListeObjets()
  {
    return listeObjets;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setListeObjets(ObjetLieu newListeObjets)
  {
    ObjetLieu oldListeObjets = listeObjets;
    listeObjets = newListeObjets;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GamePackage.ACTION__LISTE_OBJETS, oldListeObjets, listeObjets));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Condition getAttributionConnaissance()
  {
    return attributionConnaissance;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAttributionConnaissance(Condition newAttributionConnaissance, NotificationChain msgs)
  {
    Condition oldAttributionConnaissance = attributionConnaissance;
    attributionConnaissance = newAttributionConnaissance;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GamePackage.ACTION__ATTRIBUTION_CONNAISSANCE, oldAttributionConnaissance, newAttributionConnaissance);
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
  public void setAttributionConnaissance(Condition newAttributionConnaissance)
  {
    if (newAttributionConnaissance != attributionConnaissance)
    {
      NotificationChain msgs = null;
      if (attributionConnaissance != null)
        msgs = ((InternalEObject)attributionConnaissance).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GamePackage.ACTION__ATTRIBUTION_CONNAISSANCE, null, msgs);
      if (newAttributionConnaissance != null)
        msgs = ((InternalEObject)newAttributionConnaissance).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GamePackage.ACTION__ATTRIBUTION_CONNAISSANCE, null, msgs);
      msgs = basicSetAttributionConnaissance(newAttributionConnaissance, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GamePackage.ACTION__ATTRIBUTION_CONNAISSANCE, newAttributionConnaissance, newAttributionConnaissance));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Condition getAttributionObjet()
  {
    return attributionObjet;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAttributionObjet(Condition newAttributionObjet, NotificationChain msgs)
  {
    Condition oldAttributionObjet = attributionObjet;
    attributionObjet = newAttributionObjet;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GamePackage.ACTION__ATTRIBUTION_OBJET, oldAttributionObjet, newAttributionObjet);
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
  public void setAttributionObjet(Condition newAttributionObjet)
  {
    if (newAttributionObjet != attributionObjet)
    {
      NotificationChain msgs = null;
      if (attributionObjet != null)
        msgs = ((InternalEObject)attributionObjet).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GamePackage.ACTION__ATTRIBUTION_OBJET, null, msgs);
      if (newAttributionObjet != null)
        msgs = ((InternalEObject)newAttributionObjet).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GamePackage.ACTION__ATTRIBUTION_OBJET, null, msgs);
      msgs = basicSetAttributionObjet(newAttributionObjet, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GamePackage.ACTION__ATTRIBUTION_OBJET, newAttributionObjet, newAttributionObjet));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ObjetExplorateur getListeObjetsConsommes()
  {
    if (listeObjetsConsommes != null && listeObjetsConsommes.eIsProxy())
    {
      InternalEObject oldListeObjetsConsommes = (InternalEObject)listeObjetsConsommes;
      listeObjetsConsommes = (ObjetExplorateur)eResolveProxy(oldListeObjetsConsommes);
      if (listeObjetsConsommes != oldListeObjetsConsommes)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, GamePackage.ACTION__LISTE_OBJETS_CONSOMMES, oldListeObjetsConsommes, listeObjetsConsommes));
      }
    }
    return listeObjetsConsommes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ObjetExplorateur basicGetListeObjetsConsommes()
  {
    return listeObjetsConsommes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setListeObjetsConsommes(ObjetExplorateur newListeObjetsConsommes)
  {
    ObjetExplorateur oldListeObjetsConsommes = listeObjetsConsommes;
    listeObjetsConsommes = newListeObjetsConsommes;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GamePackage.ACTION__LISTE_OBJETS_CONSOMMES, oldListeObjetsConsommes, listeObjetsConsommes));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getListeQuantite()
  {
    return listeQuantite;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setListeQuantite(int newListeQuantite)
  {
    int oldListeQuantite = listeQuantite;
    listeQuantite = newListeQuantite;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GamePackage.ACTION__LISTE_QUANTITE, oldListeQuantite, listeQuantite));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Condition getConsommationObjet()
  {
    return consommationObjet;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetConsommationObjet(Condition newConsommationObjet, NotificationChain msgs)
  {
    Condition oldConsommationObjet = consommationObjet;
    consommationObjet = newConsommationObjet;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GamePackage.ACTION__CONSOMMATION_OBJET, oldConsommationObjet, newConsommationObjet);
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
  public void setConsommationObjet(Condition newConsommationObjet)
  {
    if (newConsommationObjet != consommationObjet)
    {
      NotificationChain msgs = null;
      if (consommationObjet != null)
        msgs = ((InternalEObject)consommationObjet).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GamePackage.ACTION__CONSOMMATION_OBJET, null, msgs);
      if (newConsommationObjet != null)
        msgs = ((InternalEObject)newConsommationObjet).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GamePackage.ACTION__CONSOMMATION_OBJET, null, msgs);
      msgs = basicSetConsommationObjet(newConsommationObjet, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GamePackage.ACTION__CONSOMMATION_OBJET, newConsommationObjet, newConsommationObjet));
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
      case GamePackage.ACTION__CONDITION_ACTION:
        return basicSetConditionAction(null, msgs);
      case GamePackage.ACTION__ATTRIBUTION_CONNAISSANCE:
        return basicSetAttributionConnaissance(null, msgs);
      case GamePackage.ACTION__ATTRIBUTION_OBJET:
        return basicSetAttributionObjet(null, msgs);
      case GamePackage.ACTION__CONSOMMATION_OBJET:
        return basicSetConsommationObjet(null, msgs);
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
      case GamePackage.ACTION__TEXTE:
        return getTexte();
      case GamePackage.ACTION__CONDITION_ACTION:
        return getConditionAction();
      case GamePackage.ACTION__LISTE_CHOIX:
        if (resolve) return getListeChoix();
        return basicGetListeChoix();
      case GamePackage.ACTION__LISTE_CONNAISSANCES:
        if (resolve) return getListeConnaissances();
        return basicGetListeConnaissances();
      case GamePackage.ACTION__LISTE_OBJETS:
        if (resolve) return getListeObjets();
        return basicGetListeObjets();
      case GamePackage.ACTION__ATTRIBUTION_CONNAISSANCE:
        return getAttributionConnaissance();
      case GamePackage.ACTION__ATTRIBUTION_OBJET:
        return getAttributionObjet();
      case GamePackage.ACTION__LISTE_OBJETS_CONSOMMES:
        if (resolve) return getListeObjetsConsommes();
        return basicGetListeObjetsConsommes();
      case GamePackage.ACTION__LISTE_QUANTITE:
        return getListeQuantite();
      case GamePackage.ACTION__CONSOMMATION_OBJET:
        return getConsommationObjet();
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
      case GamePackage.ACTION__TEXTE:
        setTexte((String)newValue);
        return;
      case GamePackage.ACTION__CONDITION_ACTION:
        setConditionAction((Condition)newValue);
        return;
      case GamePackage.ACTION__LISTE_CHOIX:
        setListeChoix((Choix)newValue);
        return;
      case GamePackage.ACTION__LISTE_CONNAISSANCES:
        setListeConnaissances((Connaissance)newValue);
        return;
      case GamePackage.ACTION__LISTE_OBJETS:
        setListeObjets((ObjetLieu)newValue);
        return;
      case GamePackage.ACTION__ATTRIBUTION_CONNAISSANCE:
        setAttributionConnaissance((Condition)newValue);
        return;
      case GamePackage.ACTION__ATTRIBUTION_OBJET:
        setAttributionObjet((Condition)newValue);
        return;
      case GamePackage.ACTION__LISTE_OBJETS_CONSOMMES:
        setListeObjetsConsommes((ObjetExplorateur)newValue);
        return;
      case GamePackage.ACTION__LISTE_QUANTITE:
        setListeQuantite((Integer)newValue);
        return;
      case GamePackage.ACTION__CONSOMMATION_OBJET:
        setConsommationObjet((Condition)newValue);
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
      case GamePackage.ACTION__TEXTE:
        setTexte(TEXTE_EDEFAULT);
        return;
      case GamePackage.ACTION__CONDITION_ACTION:
        setConditionAction((Condition)null);
        return;
      case GamePackage.ACTION__LISTE_CHOIX:
        setListeChoix((Choix)null);
        return;
      case GamePackage.ACTION__LISTE_CONNAISSANCES:
        setListeConnaissances((Connaissance)null);
        return;
      case GamePackage.ACTION__LISTE_OBJETS:
        setListeObjets((ObjetLieu)null);
        return;
      case GamePackage.ACTION__ATTRIBUTION_CONNAISSANCE:
        setAttributionConnaissance((Condition)null);
        return;
      case GamePackage.ACTION__ATTRIBUTION_OBJET:
        setAttributionObjet((Condition)null);
        return;
      case GamePackage.ACTION__LISTE_OBJETS_CONSOMMES:
        setListeObjetsConsommes((ObjetExplorateur)null);
        return;
      case GamePackage.ACTION__LISTE_QUANTITE:
        setListeQuantite(LISTE_QUANTITE_EDEFAULT);
        return;
      case GamePackage.ACTION__CONSOMMATION_OBJET:
        setConsommationObjet((Condition)null);
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
      case GamePackage.ACTION__TEXTE:
        return TEXTE_EDEFAULT == null ? texte != null : !TEXTE_EDEFAULT.equals(texte);
      case GamePackage.ACTION__CONDITION_ACTION:
        return conditionAction != null;
      case GamePackage.ACTION__LISTE_CHOIX:
        return listeChoix != null;
      case GamePackage.ACTION__LISTE_CONNAISSANCES:
        return listeConnaissances != null;
      case GamePackage.ACTION__LISTE_OBJETS:
        return listeObjets != null;
      case GamePackage.ACTION__ATTRIBUTION_CONNAISSANCE:
        return attributionConnaissance != null;
      case GamePackage.ACTION__ATTRIBUTION_OBJET:
        return attributionObjet != null;
      case GamePackage.ACTION__LISTE_OBJETS_CONSOMMES:
        return listeObjetsConsommes != null;
      case GamePackage.ACTION__LISTE_QUANTITE:
        return listeQuantite != LISTE_QUANTITE_EDEFAULT;
      case GamePackage.ACTION__CONSOMMATION_OBJET:
        return consommationObjet != null;
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
    result.append(" (texte: ");
    result.append(texte);
    result.append(", listeQuantite: ");
    result.append(listeQuantite);
    result.append(')');
    return result.toString();
  }

} //ActionImpl
