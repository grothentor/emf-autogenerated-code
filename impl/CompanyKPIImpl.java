/**
 */
package lab1.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import lab1.CompanyKPI;
import lab1.Compare;
import lab1.Experiment;
import lab1.KPI;
import lab1.Lab1Package;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Company KPI</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link lab1.impl.CompanyKPIImpl#getId <em>Id</em>}</li>
 *   <li>{@link lab1.impl.CompanyKPIImpl#getKpi <em>Kpi</em>}</li>
 *   <li>{@link lab1.impl.CompanyKPIImpl#getTargetValue <em>Target Value</em>}</li>
 *   <li>{@link lab1.impl.CompanyKPIImpl#getCurrentValue <em>Current Value</em>}</li>
 *   <li>{@link lab1.impl.CompanyKPIImpl#getCompare <em>Compare</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CompanyKPIImpl extends ComparableImpl implements CompanyKPI {
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
	 * The cached value of the '{@link #getKpi() <em>Kpi</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKpi()
	 * @generated
	 * @ordered
	 */
	protected KPI kpi;

	/**
	 * The default value of the '{@link #getTargetValue() <em>Target Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetValue()
	 * @generated
	 * @ordered
	 */
	protected static final float TARGET_VALUE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getTargetValue() <em>Target Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetValue()
	 * @generated
	 * @ordered
	 */
	protected float targetValue = TARGET_VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCurrentValue() <em>Current Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentValue()
	 * @generated
	 * @ordered
	 */
	protected static final float CURRENT_VALUE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getCurrentValue() <em>Current Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentValue()
	 * @generated
	 * @ordered
	 */
	protected float currentValue = CURRENT_VALUE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCompare() <em>Compare</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompare()
	 * @generated
	 * @ordered
	 */
	protected EList<Compare> compare;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompanyKPIImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Lab1Package.Literals.COMPANY_KPI;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Lab1Package.COMPANY_KPI__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KPI getKpi() {
		if (kpi != null && kpi.eIsProxy()) {
			InternalEObject oldKpi = (InternalEObject) kpi;
			kpi = (KPI) eResolveProxy(oldKpi);
			if (kpi != oldKpi) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Lab1Package.COMPANY_KPI__KPI, oldKpi,
							kpi));
			}
		}
		return kpi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KPI basicGetKpi() {
		return kpi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKpi(KPI newKpi) {
		KPI oldKpi = kpi;
		kpi = newKpi;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Lab1Package.COMPANY_KPI__KPI, oldKpi, kpi));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getTargetValue() {
		return targetValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetValue(float newTargetValue) {
		float oldTargetValue = targetValue;
		targetValue = newTargetValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Lab1Package.COMPANY_KPI__TARGET_VALUE, oldTargetValue,
					targetValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getCurrentValue() {
		return currentValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurrentValue(float newCurrentValue) {
		float oldCurrentValue = currentValue;
		currentValue = newCurrentValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Lab1Package.COMPANY_KPI__CURRENT_VALUE,
					oldCurrentValue, currentValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Compare> getCompare() {
		if (compare == null) {
			compare = new EObjectWithInverseResolvingEList<Compare>(Compare.class, this,
					Lab1Package.COMPANY_KPI__COMPARE, Lab1Package.COMPARE__COMPANYKPI);
		}
		return compare;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getImportance(Experiment experiment) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Lab1Package.COMPANY_KPI__COMPARE:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getCompare()).basicAdd(otherEnd, msgs);
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
		case Lab1Package.COMPANY_KPI__COMPARE:
			return ((InternalEList<?>) getCompare()).basicRemove(otherEnd, msgs);
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
		case Lab1Package.COMPANY_KPI__ID:
			return getId();
		case Lab1Package.COMPANY_KPI__KPI:
			if (resolve)
				return getKpi();
			return basicGetKpi();
		case Lab1Package.COMPANY_KPI__TARGET_VALUE:
			return getTargetValue();
		case Lab1Package.COMPANY_KPI__CURRENT_VALUE:
			return getCurrentValue();
		case Lab1Package.COMPANY_KPI__COMPARE:
			return getCompare();
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
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case Lab1Package.COMPANY_KPI__ID:
			setId((Integer) newValue);
			return;
		case Lab1Package.COMPANY_KPI__KPI:
			setKpi((KPI) newValue);
			return;
		case Lab1Package.COMPANY_KPI__TARGET_VALUE:
			setTargetValue((Float) newValue);
			return;
		case Lab1Package.COMPANY_KPI__CURRENT_VALUE:
			setCurrentValue((Float) newValue);
			return;
		case Lab1Package.COMPANY_KPI__COMPARE:
			getCompare().clear();
			getCompare().addAll((Collection<? extends Compare>) newValue);
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
		case Lab1Package.COMPANY_KPI__ID:
			setId(ID_EDEFAULT);
			return;
		case Lab1Package.COMPANY_KPI__KPI:
			setKpi((KPI) null);
			return;
		case Lab1Package.COMPANY_KPI__TARGET_VALUE:
			setTargetValue(TARGET_VALUE_EDEFAULT);
			return;
		case Lab1Package.COMPANY_KPI__CURRENT_VALUE:
			setCurrentValue(CURRENT_VALUE_EDEFAULT);
			return;
		case Lab1Package.COMPANY_KPI__COMPARE:
			getCompare().clear();
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
		case Lab1Package.COMPANY_KPI__ID:
			return id != ID_EDEFAULT;
		case Lab1Package.COMPANY_KPI__KPI:
			return kpi != null;
		case Lab1Package.COMPANY_KPI__TARGET_VALUE:
			return targetValue != TARGET_VALUE_EDEFAULT;
		case Lab1Package.COMPANY_KPI__CURRENT_VALUE:
			return currentValue != CURRENT_VALUE_EDEFAULT;
		case Lab1Package.COMPANY_KPI__COMPARE:
			return compare != null && !compare.isEmpty();
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
		case Lab1Package.COMPANY_KPI___GET_IMPORTANCE__EXPERIMENT:
			return getImportance((Experiment) arguments.get(0));
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
		result.append(", targetValue: ");
		result.append(targetValue);
		result.append(", currentValue: ");
		result.append(currentValue);
		result.append(')');
		return result.toString();
	}

} //CompanyKPIImpl
