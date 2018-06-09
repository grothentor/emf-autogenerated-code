/**
 */
package lab1.util;

import lab1.Authorizable;
import lab1.Budget;
import lab1.BudgetIndicator;
import lab1.BudgetValue;
import lab1.Company;
import lab1.CompanyKPI;
import lab1.Compare;
import lab1.Experiment;
import lab1.KPI;
import lab1.Lab1Package;
import lab1.MonthsBudgetList;
import lab1.Subdivision;
import lab1.Transformable;
import lab1.Transformation;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see lab1.Lab1Package
 * @generated
 */
public class Lab1Switch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Lab1Package modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Lab1Switch() {
		if (modelPackage == null) {
			modelPackage = Lab1Package.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case Lab1Package.TRANSFORMABLE: {
			Transformable transformable = (Transformable) theEObject;
			T result = caseTransformable(transformable);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Lab1Package.TRANSFORMATION: {
			Transformation transformation = (Transformation) theEObject;
			T result = caseTransformation(transformation);
			if (result == null)
				result = caseTransformable(transformation);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Lab1Package.BUDGET_INDICATOR: {
			BudgetIndicator budgetIndicator = (BudgetIndicator) theEObject;
			T result = caseBudgetIndicator(budgetIndicator);
			if (result == null)
				result = caseTransformable(budgetIndicator);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Lab1Package.KPI: {
			KPI kpi = (KPI) theEObject;
			T result = caseKPI(kpi);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Lab1Package.COMPANY: {
			Company company = (Company) theEObject;
			T result = caseCompany(company);
			if (result == null)
				result = caseAuthorizable(company);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Lab1Package.COMPANY_KPI: {
			CompanyKPI companyKPI = (CompanyKPI) theEObject;
			T result = caseCompanyKPI(companyKPI);
			if (result == null)
				result = caseComparable(companyKPI);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Lab1Package.SUBDIVISION: {
			Subdivision subdivision = (Subdivision) theEObject;
			T result = caseSubdivision(subdivision);
			if (result == null)
				result = caseAuthorizable(subdivision);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Lab1Package.BUDGET_VALUE: {
			BudgetValue budgetValue = (BudgetValue) theEObject;
			T result = caseBudgetValue(budgetValue);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Lab1Package.COMPARE: {
			Compare compare = (Compare) theEObject;
			T result = caseCompare(compare);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Lab1Package.AUTHORIZABLE: {
			Authorizable authorizable = (Authorizable) theEObject;
			T result = caseAuthorizable(authorizable);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Lab1Package.BUDGET: {
			Budget budget = (Budget) theEObject;
			T result = caseBudget(budget);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Lab1Package.EXPERIMENT: {
			Experiment experiment = (Experiment) theEObject;
			T result = caseExperiment(experiment);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Lab1Package.COMPARABLE: {
			lab1.Comparable comparable = (lab1.Comparable) theEObject;
			T result = caseComparable(comparable);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Lab1Package.MONTHS_BUDGET_LIST: {
			MonthsBudgetList monthsBudgetList = (MonthsBudgetList) theEObject;
			T result = caseMonthsBudgetList(monthsBudgetList);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transformable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transformable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransformable(Transformable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transformation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transformation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransformation(Transformation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Budget Indicator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Budget Indicator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBudgetIndicator(BudgetIndicator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>KPI</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>KPI</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKPI(KPI object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Company</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Company</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompany(Company object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Company KPI</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Company KPI</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompanyKPI(CompanyKPI object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Subdivision</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Subdivision</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubdivision(Subdivision object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Budget Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Budget Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBudgetValue(BudgetValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Compare</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Compare</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompare(Compare object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Authorizable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Authorizable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAuthorizable(Authorizable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Budget</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Budget</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBudget(Budget object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Experiment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Experiment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExperiment(Experiment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Comparable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Comparable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComparable(lab1.Comparable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Months Budget List</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Months Budget List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMonthsBudgetList(MonthsBudgetList object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //Lab1Switch
