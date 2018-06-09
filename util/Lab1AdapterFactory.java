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

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see lab1.Lab1Package
 * @generated
 */
public class Lab1AdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Lab1Package modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Lab1AdapterFactory() {
		if (modelPackage == null) {
			modelPackage = Lab1Package.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Lab1Switch<Adapter> modelSwitch = new Lab1Switch<Adapter>() {
		@Override
		public Adapter caseTransformable(Transformable object) {
			return createTransformableAdapter();
		}

		@Override
		public Adapter caseTransformation(Transformation object) {
			return createTransformationAdapter();
		}

		@Override
		public Adapter caseBudgetIndicator(BudgetIndicator object) {
			return createBudgetIndicatorAdapter();
		}

		@Override
		public Adapter caseKPI(KPI object) {
			return createKPIAdapter();
		}

		@Override
		public Adapter caseCompany(Company object) {
			return createCompanyAdapter();
		}

		@Override
		public Adapter caseCompanyKPI(CompanyKPI object) {
			return createCompanyKPIAdapter();
		}

		@Override
		public Adapter caseSubdivision(Subdivision object) {
			return createSubdivisionAdapter();
		}

		@Override
		public Adapter caseBudgetValue(BudgetValue object) {
			return createBudgetValueAdapter();
		}

		@Override
		public Adapter caseCompare(Compare object) {
			return createCompareAdapter();
		}

		@Override
		public Adapter caseAuthorizable(Authorizable object) {
			return createAuthorizableAdapter();
		}

		@Override
		public Adapter caseBudget(Budget object) {
			return createBudgetAdapter();
		}

		@Override
		public Adapter caseExperiment(Experiment object) {
			return createExperimentAdapter();
		}

		@Override
		public Adapter caseComparable(lab1.Comparable object) {
			return createComparableAdapter();
		}

		@Override
		public Adapter caseMonthsBudgetList(MonthsBudgetList object) {
			return createMonthsBudgetListAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link lab1.Transformable <em>Transformable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lab1.Transformable
	 * @generated
	 */
	public Adapter createTransformableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lab1.Transformation <em>Transformation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lab1.Transformation
	 * @generated
	 */
	public Adapter createTransformationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lab1.BudgetIndicator <em>Budget Indicator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lab1.BudgetIndicator
	 * @generated
	 */
	public Adapter createBudgetIndicatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lab1.KPI <em>KPI</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lab1.KPI
	 * @generated
	 */
	public Adapter createKPIAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lab1.Company <em>Company</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lab1.Company
	 * @generated
	 */
	public Adapter createCompanyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lab1.CompanyKPI <em>Company KPI</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lab1.CompanyKPI
	 * @generated
	 */
	public Adapter createCompanyKPIAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lab1.Subdivision <em>Subdivision</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lab1.Subdivision
	 * @generated
	 */
	public Adapter createSubdivisionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lab1.BudgetValue <em>Budget Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lab1.BudgetValue
	 * @generated
	 */
	public Adapter createBudgetValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lab1.Compare <em>Compare</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lab1.Compare
	 * @generated
	 */
	public Adapter createCompareAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lab1.Authorizable <em>Authorizable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lab1.Authorizable
	 * @generated
	 */
	public Adapter createAuthorizableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lab1.Budget <em>Budget</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lab1.Budget
	 * @generated
	 */
	public Adapter createBudgetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lab1.Experiment <em>Experiment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lab1.Experiment
	 * @generated
	 */
	public Adapter createExperimentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lab1.Comparable <em>Comparable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lab1.Comparable
	 * @generated
	 */
	public Adapter createComparableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lab1.MonthsBudgetList <em>Months Budget List</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lab1.MonthsBudgetList
	 * @generated
	 */
	public Adapter createMonthsBudgetListAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //Lab1AdapterFactory
