/**
 */
package lab1.impl;

import java.util.Collection;

import lab1.Lab1Package;
import lab1.MonthsBudgetList;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Months Budget List</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link lab1.impl.MonthsBudgetListImpl#getMonthValues <em>Month Values</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MonthsBudgetListImpl extends MinimalEObjectImpl.Container implements MonthsBudgetList {
	/**
	 * The cached value of the '{@link #getMonthValues() <em>Month Values</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMonthValues()
	 * @generated
	 * @ordered
	 */
	protected EList<Float> monthValues;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MonthsBudgetListImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Lab1Package.Literals.MONTHS_BUDGET_LIST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Float> getMonthValues() {
		if (monthValues == null) {
			monthValues = new EDataTypeUniqueEList<Float>(Float.class, this,
					Lab1Package.MONTHS_BUDGET_LIST__MONTH_VALUES);
		}
		return monthValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Lab1Package.MONTHS_BUDGET_LIST__MONTH_VALUES:
			return getMonthValues();
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
		case Lab1Package.MONTHS_BUDGET_LIST__MONTH_VALUES:
			getMonthValues().clear();
			getMonthValues().addAll((Collection<? extends Float>) newValue);
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
		case Lab1Package.MONTHS_BUDGET_LIST__MONTH_VALUES:
			getMonthValues().clear();
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
		case Lab1Package.MONTHS_BUDGET_LIST__MONTH_VALUES:
			return monthValues != null && !monthValues.isEmpty();
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
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (monthValues: ");
		result.append(monthValues);
		result.append(')');
		return result.toString();
	}

} //MonthsBudgetListImpl
