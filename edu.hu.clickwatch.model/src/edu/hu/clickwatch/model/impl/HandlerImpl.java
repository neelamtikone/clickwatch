/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package edu.hu.clickwatch.model.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.xml.type.AnyType;

import edu.hu.clickwatch.model.ClickWatchModelPackage;
import edu.hu.clickwatch.model.Handler;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Handler</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link edu.hu.clickwatch.model.impl.HandlerImpl#getName <em>Name</em>}</li>
 *   <li>{@link edu.hu.clickwatch.model.impl.HandlerImpl#isCanRead <em>Can Read</em>}</li>
 *   <li>{@link edu.hu.clickwatch.model.impl.HandlerImpl#isCanWrite <em>Can Write</em>}</li>
 *   <li>{@link edu.hu.clickwatch.model.impl.HandlerImpl#isChanged <em>Changed</em>}</li>
 *   <li>{@link edu.hu.clickwatch.model.impl.HandlerImpl#isWatch <em>Watch</em>}</li>
 *   <li>{@link edu.hu.clickwatch.model.impl.HandlerImpl#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HandlerImpl extends EObjectImpl implements Handler {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #isCanRead() <em>Can Read</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCanRead()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CAN_READ_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isCanRead() <em>Can Read</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCanRead()
	 * @generated
	 * @ordered
	 */
	protected boolean canRead = CAN_READ_EDEFAULT;

	/**
	 * The default value of the '{@link #isCanWrite() <em>Can Write</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCanWrite()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CAN_WRITE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isCanWrite() <em>Can Write</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCanWrite()
	 * @generated
	 * @ordered
	 */
	protected boolean canWrite = CAN_WRITE_EDEFAULT;

	/**
	 * The default value of the '{@link #isChanged() <em>Changed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isChanged()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CHANGED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isChanged() <em>Changed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isChanged()
	 * @generated
	 * @ordered
	 */
	protected boolean changed = CHANGED_EDEFAULT;

	/**
	 * The default value of the '{@link #isWatch() <em>Watch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isWatch()
	 * @generated
	 * @ordered
	 */
	protected static final boolean WATCH_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isWatch() <em>Watch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isWatch()
	 * @generated
	 * @ordered
	 */
	protected boolean watch = WATCH_EDEFAULT;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected AnyType value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HandlerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ClickWatchModelPackage.Literals.HANDLER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClickWatchModelPackage.HANDLER__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCanRead() {
		return canRead;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCanRead(boolean newCanRead) {
		boolean oldCanRead = canRead;
		canRead = newCanRead;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClickWatchModelPackage.HANDLER__CAN_READ, oldCanRead, canRead));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCanWrite() {
		return canWrite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCanWrite(boolean newCanWrite) {
		boolean oldCanWrite = canWrite;
		canWrite = newCanWrite;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClickWatchModelPackage.HANDLER__CAN_WRITE, oldCanWrite, canWrite));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isWatch() {
		return watch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWatch(boolean newWatch) {
		boolean oldWatch = watch;
		watch = newWatch;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClickWatchModelPackage.HANDLER__WATCH, oldWatch, watch));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnyType getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValue(AnyType newValue, NotificationChain msgs) {
		AnyType oldValue = value;
		value = newValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ClickWatchModelPackage.HANDLER__VALUE, oldValue, newValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(AnyType newValue) {
		if (newValue != value) {
			NotificationChain msgs = null;
			if (value != null)
				msgs = ((InternalEObject)value).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ClickWatchModelPackage.HANDLER__VALUE, null, msgs);
			if (newValue != null)
				msgs = ((InternalEObject)newValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ClickWatchModelPackage.HANDLER__VALUE, null, msgs);
			msgs = basicSetValue(newValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClickWatchModelPackage.HANDLER__VALUE, newValue, newValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ClickWatchModelPackage.HANDLER__VALUE:
				return basicSetValue(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isChanged() {
		return changed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChanged(boolean newChanged) {
		boolean oldChanged = changed;
		changed = newChanged;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClickWatchModelPackage.HANDLER__CHANGED, oldChanged, changed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ClickWatchModelPackage.HANDLER__NAME:
				return getName();
			case ClickWatchModelPackage.HANDLER__CAN_READ:
				return isCanRead();
			case ClickWatchModelPackage.HANDLER__CAN_WRITE:
				return isCanWrite();
			case ClickWatchModelPackage.HANDLER__CHANGED:
				return isChanged();
			case ClickWatchModelPackage.HANDLER__WATCH:
				return isWatch();
			case ClickWatchModelPackage.HANDLER__VALUE:
				return getValue();
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
			case ClickWatchModelPackage.HANDLER__NAME:
				setName((String)newValue);
				return;
			case ClickWatchModelPackage.HANDLER__CAN_READ:
				setCanRead((Boolean)newValue);
				return;
			case ClickWatchModelPackage.HANDLER__CAN_WRITE:
				setCanWrite((Boolean)newValue);
				return;
			case ClickWatchModelPackage.HANDLER__CHANGED:
				setChanged((Boolean)newValue);
				return;
			case ClickWatchModelPackage.HANDLER__WATCH:
				setWatch((Boolean)newValue);
				return;
			case ClickWatchModelPackage.HANDLER__VALUE:
				setValue((AnyType)newValue);
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
			case ClickWatchModelPackage.HANDLER__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ClickWatchModelPackage.HANDLER__CAN_READ:
				setCanRead(CAN_READ_EDEFAULT);
				return;
			case ClickWatchModelPackage.HANDLER__CAN_WRITE:
				setCanWrite(CAN_WRITE_EDEFAULT);
				return;
			case ClickWatchModelPackage.HANDLER__CHANGED:
				setChanged(CHANGED_EDEFAULT);
				return;
			case ClickWatchModelPackage.HANDLER__WATCH:
				setWatch(WATCH_EDEFAULT);
				return;
			case ClickWatchModelPackage.HANDLER__VALUE:
				setValue((AnyType)null);
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
			case ClickWatchModelPackage.HANDLER__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ClickWatchModelPackage.HANDLER__CAN_READ:
				return canRead != CAN_READ_EDEFAULT;
			case ClickWatchModelPackage.HANDLER__CAN_WRITE:
				return canWrite != CAN_WRITE_EDEFAULT;
			case ClickWatchModelPackage.HANDLER__CHANGED:
				return changed != CHANGED_EDEFAULT;
			case ClickWatchModelPackage.HANDLER__WATCH:
				return watch != WATCH_EDEFAULT;
			case ClickWatchModelPackage.HANDLER__VALUE:
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
		result.append(" (name: ");
		result.append(name);
		result.append(", canRead: ");
		result.append(canRead);
		result.append(", canWrite: ");
		result.append(canWrite);
		result.append(", changed: ");
		result.append(changed);
		result.append(", watch: ");
		result.append(watch);
		result.append(')');
		return result.toString();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((eContainer() == null) ? 0 : eContainer().hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		HandlerImpl other = (HandlerImpl) obj;
		if (eContainer() == null) {
			if (other.eContainer() != null)
				return false;
		} else if (!eContainer().equals(other.eContainer()))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	
} //HandlerImpl
