/**
 */
package lab1.impl;

import lab1.Budget;
import lab1.BudgetIndicator;
import lab1.BudgetValue;
import lab1.Company;
import lab1.CompanyKPI;
import lab1.Compare;
import lab1.Experiment;
import lab1.KPI;
import lab1.Lab1Factory;
import lab1.Lab1Package;
import lab1.MonthsBudgetList;
import lab1.Subdivision;
import lab1.Transformation;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Lab1FactoryImpl extends EFactoryImpl implements Lab1Factory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Lab1Factory init() {
		try {
			Lab1Factory theLab1Factory = (Lab1Factory) EPackage.Registry.INSTANCE.getEFactory(Lab1Package.eNS_URI);
			if (theLab1Factory != null) {
				return theLab1Factory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Lab1FactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Lab1FactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case Lab1Package.TRANSFORMATION:
			return createTransformation();
		case Lab1Package.BUDGET_INDICATOR:
			return createBudgetIndicator();
		case Lab1Package.KPI:
			return createKPI();
		case Lab1Package.COMPANY:
			return createCompany();
		case Lab1Package.COMPANY_KPI:
			return createCompanyKPI();
		case Lab1Package.SUBDIVISION:
			return createSubdivision();
		case Lab1Package.BUDGET_VALUE:
			return createBudgetValue();
		case Lab1Package.COMPARE:
			return createCompare();
		case Lab1Package.BUDGET:
			return createBudget();
		case Lab1Package.EXPERIMENT:
			return createExperiment();
		case Lab1Package.MONTHS_BUDGET_LIST:
			return createMonthsBudgetList();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transformation createTransformation() {
		TransformationImpl transformation = new TransformationImpl();
		return transformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BudgetIndicator createBudgetIndicator() {
		BudgetIndicatorImpl budgetIndicator = new BudgetIndicatorImpl();
		return budgetIndicator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KPI createKPI() {
		KPIImpl kpi = new KPIImpl();
		return kpi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Company createCompany() {
		CompanyImpl company = new CompanyImpl();
		return company;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompanyKPI createCompanyKPI() {
		CompanyKPIImpl companyKPI = new CompanyKPIImpl();
		return companyKPI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Subdivision createSubdivision() {
		SubdivisionImpl subdivision = new SubdivisionImpl();
		return subdivision;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BudgetValue createBudgetValue() {
		BudgetValueImpl budgetValue = new BudgetValueImpl();
		return budgetValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Compare createCompare() {
		CompareImpl compare = new CompareImpl();
		return compare;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Budget createBudget() {
		BudgetImpl budget = new BudgetImpl();
		return budget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Experiment createExperiment() {
		ExperimentImpl experiment = new ExperimentImpl();
		return experiment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MonthsBudgetList createMonthsBudgetList() {
		MonthsBudgetListImpl monthsBudgetList = new MonthsBudgetListImpl();
		return monthsBudgetList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Lab1Package getLab1Package() {
		return (Lab1Package) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Lab1Package getPackage() {
		return Lab1Package.eINSTANCE;
	}

} //Lab1FactoryImpl
