/**
 */
package lab1.impl;

import java.lang.reflect.InvocationTargetException;

import lab1.CompanyKPI;
import lab1.Compare;
import lab1.Lab1Package;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Compare</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link lab1.impl.CompareImpl#getId <em>Id</em>}</li>
 *   <li>{@link lab1.impl.CompareImpl#getValue <em>Value</em>}</li>
 *   <li>{@link lab1.impl.CompareImpl#getCompanykpi <em>Companykpi</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CompareImpl extends MinimalEObjectImpl.Container implements Compare {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final int ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected int id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final int VALUE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected int value = VALUE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCompanykpi() <em>Companykpi</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompanykpi()
	 * @generated
	 * @ordered
	 */
	protected CompanyKPI companykpi;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompareImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Lab1Package.Literals.COMPARE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(int newId) {
		int oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Lab1Package.COMPARE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(int newValue) {
		int oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Lab1Package.COMPARE__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompanyKPI getCompanykpi() {
		if (companykpi != null && companykpi.eIsProxy()) {
			InternalEObject oldCompanykpi = (InternalEObject) companykpi;
			companykpi = (CompanyKPI) eResolveProxy(oldCompanykpi);
			if (companykpi != oldCompanykpi) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Lab1Package.COMPARE__COMPANYKPI,
							oldCompanykpi, companykpi));
			}
		}
		return companykpi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompanyKPI basicGetCompanykpi() {
		return companykpi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCompanykpi(CompanyKPI newCompanykpi, NotificationChain msgs) {
		CompanyKPI oldCompanykpi = companykpi;
		companykpi = newCompanykpi;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					Lab1Package.COMPARE__COMPANYKPI, oldCompanykpi, newCompanykpi);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCompanykpi(CompanyKPI newCompanykpi) {
		if (newCompanykpi != companykpi) {
			NotificationChain msgs = null;
			if (companykpi != null)
				msgs = ((InternalEObject) companykpi).eInverseRemove(this, Lab1Package.COMPANY_KPI__COMPARE,
						CompanyKPI.class, msgs);
			if (newCompanykpi != null)
				msgs = ((InternalEObject) newCompanykpi).eInverseAdd(this, Lab1Package.COMPANY_KPI__COMPARE,
						CompanyKPI.class, msgs);
			msgs = basicSetCompanykpi(newCompanykpi, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Lab1Package.COMPARE__COMPANYKPI, newCompanykpi,
					newCompanykpi));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public lab1.Comparable getLeftOperand() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public lab1.Comparable getRightOperand() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Lab1Package.COMPARE__COMPANYKPI:
			if (companykpi != null)
				msgs = ((InternalEObject) companykpi).eInverseRemove(this, Lab1Package.COMPANY_KPI__COMPARE,
						CompanyKPI.class, msgs);
			return basicSetCompanykpi((CompanyKPI) otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Lab1Package.COMPARE__COMPANYKPI:
			return basicSetCompanykpi(null, msgs);
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
		case Lab1Package.COMPARE__ID:
			return getId();
		case Lab1Package.COMPARE__VALUE:
			return getValue();
		case Lab1Package.COMPARE__COMPANYKPI:
			if (resolve)
				return getCompanykpi();
			return basicGetCompanykpi();
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
		case Lab1Package.COMPARE__ID:
			setId((Integer) newValue);
			return;
		case Lab1Package.COMPARE__VALUE:
			setValue((Integer) newValue);
			return;
		case Lab1Package.COMPARE__COMPANYKPI:
			setCompanykpi((CompanyKPI) newValue);
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
		case Lab1Package.COMPARE__ID:
			setId(ID_EDEFAULT);
			return;
		case Lab1Package.COMPARE__VALUE:
			setValue(VALUE_EDEFAULT);
			return;
		case Lab1Package.COMPARE__COMPANYKPI:
			setCompanykpi((CompanyKPI) null);
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
		case Lab1Package.COMPARE__ID:
			return id != ID_EDEFAULT;
		case Lab1Package.COMPARE__VALUE:
			return value != VALUE_EDEFAULT;
		case Lab1Package.COMPARE__COMPANYKPI:
			return companykpi != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case Lab1Package.COMPARE___GET_LEFT_OPERAND:
			return getLeftOperand();
		case Lab1Package.COMPARE___GET_RIGHT_OPERAND:
			return getRightOperand();
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (id: ");
		result.append(id);
		result.append(", value: ");
		result.append(value);
		result.append(')');
		return result.toString();
	}

} //CompareImpl
