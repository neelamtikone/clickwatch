/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.clickwatch.model.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEMap;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import de.hub.clickwatch.model.ClickWatchModelPackage;
import de.hub.clickwatch.model.Statistic;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EString To Statistic Map</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.hub.clickwatch.model.impl.EStringToStatisticMapImpl#getTypedKey <em>Key</em>}</li>
 *   <li>{@link de.hub.clickwatch.model.impl.EStringToStatisticMapImpl#getTypedValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EStringToStatisticMapImpl extends EObjectImpl implements BasicEMap.Entry<String,Statistic> {
    /**
     * The default value of the '{@link #getTypedKey() <em>Key</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTypedKey()
     * @generated
     * @ordered
     */
    protected static final String KEY_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTypedKey() <em>Key</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTypedKey()
     * @generated
     * @ordered
     */
    protected String key = KEY_EDEFAULT;

    /**
     * The cached value of the '{@link #getTypedValue() <em>Value</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTypedValue()
     * @generated
     * @ordered
     */
    protected Statistic value;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected EStringToStatisticMapImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ClickWatchModelPackage.Literals.ESTRING_TO_STATISTIC_MAP;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getTypedKey() {
        return key;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setTypedKey(String newKey) {
        String oldKey = key;
        key = newKey;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ClickWatchModelPackage.ESTRING_TO_STATISTIC_MAP__KEY, oldKey, key));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Statistic getTypedValue() {
        return value;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetTypedValue(Statistic newValue, NotificationChain msgs) {
        Statistic oldValue = value;
        value = newValue;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ClickWatchModelPackage.ESTRING_TO_STATISTIC_MAP__VALUE, oldValue, newValue);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setTypedValue(Statistic newValue) {
        if (newValue != value) {
            NotificationChain msgs = null;
            if (value != null)
                msgs = ((InternalEObject)value).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ClickWatchModelPackage.ESTRING_TO_STATISTIC_MAP__VALUE, null, msgs);
            if (newValue != null)
                msgs = ((InternalEObject)newValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ClickWatchModelPackage.ESTRING_TO_STATISTIC_MAP__VALUE, null, msgs);
            msgs = basicSetTypedValue(newValue, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ClickWatchModelPackage.ESTRING_TO_STATISTIC_MAP__VALUE, newValue, newValue));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case ClickWatchModelPackage.ESTRING_TO_STATISTIC_MAP__VALUE:
                return basicSetTypedValue(null, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case ClickWatchModelPackage.ESTRING_TO_STATISTIC_MAP__KEY:
                return getTypedKey();
            case ClickWatchModelPackage.ESTRING_TO_STATISTIC_MAP__VALUE:
                return getTypedValue();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case ClickWatchModelPackage.ESTRING_TO_STATISTIC_MAP__KEY:
                setTypedKey((String)newValue);
                return;
            case ClickWatchModelPackage.ESTRING_TO_STATISTIC_MAP__VALUE:
                setTypedValue((Statistic)newValue);
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
    public void eUnset(int featureID) {
        switch (featureID) {
            case ClickWatchModelPackage.ESTRING_TO_STATISTIC_MAP__KEY:
                setTypedKey(KEY_EDEFAULT);
                return;
            case ClickWatchModelPackage.ESTRING_TO_STATISTIC_MAP__VALUE:
                setTypedValue((Statistic)null);
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
    public boolean eIsSet(int featureID) {
        switch (featureID) {
            case ClickWatchModelPackage.ESTRING_TO_STATISTIC_MAP__KEY:
                return KEY_EDEFAULT == null ? key != null : !KEY_EDEFAULT.equals(key);
            case ClickWatchModelPackage.ESTRING_TO_STATISTIC_MAP__VALUE:
                return value != null;
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String toString() {
        if (eIsProxy()) return super.toString();

        StringBuffer result = new StringBuffer(super.toString());
        result.append(" (key: ");
        result.append(key);
        result.append(')');
        return result.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected int hash = -1;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getHash() {
        if (hash == -1) {
            Object theKey = getKey();
            hash = (theKey == null ? 0 : theKey.hashCode());
        }
        return hash;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setHash(int hash) {
        this.hash = hash;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getKey() {
        return getTypedKey();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setKey(String key) {
        setTypedKey(key);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Statistic getValue() {
        return getTypedValue();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Statistic setValue(Statistic value) {
        Statistic oldValue = getValue();
        setTypedValue(value);
        return oldValue;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    public EMap<String, Statistic> getEMap() {
        EObject container = eContainer();
        return container == null ? null : (EMap<String, Statistic>)container.eGet(eContainmentFeature());
    }

} //EStringToStatisticMapImpl
