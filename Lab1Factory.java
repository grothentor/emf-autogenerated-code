/**
 */
package lab1;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see lab1.Lab1Package
 * @generated
 */
public interface Lab1Factory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Lab1Factory eINSTANCE = lab1.impl.Lab1FactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Transformation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Transformation</em>'.
	 * @generated
	 */
	Transformation createTransformation();

	/**
	 * Returns a new object of class '<em>Budget Indicator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Budget Indicator</em>'.
	 * @generated
	 */
	BudgetIndicator createBudgetIndicator();

	/**
	 * Returns a new object of class '<em>KPI</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>KPI</em>'.
	 * @generated
	 */
	KPI createKPI();

	/**
	 * Returns a new object of class '<em>Company</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Company</em>'.
	 * @generated
	 */
	Company createCompany();

	/**
	 * Returns a new object of class '<em>Company KPI</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Company KPI</em>'.
	 * @generated
	 */
	CompanyKPI createCompanyKPI();

	/**
	 * Returns a new object of class '<em>Subdivision</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Subdivision</em>'.
	 * @generated
	 */
	Subdivision createSubdivision();

	/**
	 * Returns a new object of class '<em>Budget Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Budget Value</em>'.
	 * @generated
	 */
	BudgetValue createBudgetValue();

	/**
	 * Returns a new object of class '<em>Compare</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Compare</em>'.
	 * @generated
	 */
	Compare createCompare();

	/**
	 * Returns a new object of class '<em>Budget</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Budget</em>'.
	 * @generated
	 */
	Budget createBudget();

	/**
	 * Returns a new object of class '<em>Experiment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Experiment</em>'.
	 * @generated
	 */
	Experiment createExperiment();

	/**
	 * Returns a new object of class '<em>Months Budget List</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Months Budget List</em>'.
	 * @generated
	 */
	MonthsBudgetList createMonthsBudgetList();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	Lab1Package getLab1Package();

} //Lab1Factory
