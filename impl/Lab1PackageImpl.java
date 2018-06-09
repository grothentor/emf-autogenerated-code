/**
 */
package lab1.impl;

import lab1.Authorizable;
import lab1.Budget;
import lab1.BudgetIndicator;
import lab1.BudgetValue;
import lab1.Company;
import lab1.CompanyKPI;
import lab1.Compare;
import lab1.Experiment;
import lab1.Lab1Factory;
import lab1.Lab1Package;
import lab1.MonthsBudgetList;
import lab1.Subdivision;
import lab1.Transformable;
import lab1.Transformation;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Lab1PackageImpl extends EPackageImpl implements Lab1Package {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transformableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transformationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass budgetIndicatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass kpiEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass companyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass companyKPIEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subdivisionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass budgetValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compareEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass authorizableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass budgetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass experimentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass comparableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass monthsBudgetListEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see lab1.Lab1Package#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Lab1PackageImpl() {
		super(eNS_URI, Lab1Factory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link Lab1Package#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Lab1Package init() {
		if (isInited)
			return (Lab1Package) EPackage.Registry.INSTANCE.getEPackage(Lab1Package.eNS_URI);

		// Obtain or create and register package
		Lab1PackageImpl theLab1Package = (Lab1PackageImpl) (EPackage.Registry.INSTANCE
				.get(eNS_URI) instanceof Lab1PackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI)
						: new Lab1PackageImpl());

		isInited = true;

		// Create package meta-data objects
		theLab1Package.createPackageContents();

		// Initialize created meta-data
		theLab1Package.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theLab1Package.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Lab1Package.eNS_URI, theLab1Package);
		return theLab1Package;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransformable() {
		return transformableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTransformable__GetValue() {
		return transformableEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransformation() {
		return transformationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransformation_Id() {
		return (EAttribute) transformationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransformation_Operation() {
		return (EAttribute) transformationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransformation_Budgetindicator() {
		return (EReference) transformationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransformation_Transformation() {
		return (EReference) transformationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTransformation__GetLeftOperand() {
		return transformationEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTransformation__GetRightOperand() {
		return transformationEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBudgetIndicator() {
		return budgetIndicatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBudgetIndicator_Id() {
		return (EAttribute) budgetIndicatorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBudgetIndicator_Name() {
		return (EAttribute) budgetIndicatorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBudgetIndicator_Type() {
		return (EAttribute) budgetIndicatorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getKPI() {
		return kpiEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKPI_Id() {
		return (EAttribute) kpiEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getKPI_Transformation() {
		return (EReference) kpiEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKPI_Name() {
		return (EAttribute) kpiEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getKPI__Calculate__MonthsBudgetList() {
		return kpiEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCompany() {
		return companyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCompany_Id() {
		return (EAttribute) companyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCompany_Name() {
		return (EAttribute) companyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompany_Companykpi() {
		return (EReference) companyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompany_Experiment() {
		return (EReference) companyEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompany_Subdivision() {
		return (EReference) companyEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCompany__GetMonthsBudgetList() {
		return companyEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCompanyKPI() {
		return companyKPIEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCompanyKPI_Id() {
		return (EAttribute) companyKPIEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompanyKPI_Kpi() {
		return (EReference) companyKPIEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCompanyKPI_TargetValue() {
		return (EAttribute) companyKPIEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCompanyKPI_CurrentValue() {
		return (EAttribute) companyKPIEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompanyKPI_Compare() {
		return (EReference) companyKPIEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCompanyKPI__GetImportance__Experiment() {
		return companyKPIEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubdivision() {
		return subdivisionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubdivision_Id() {
		return (EAttribute) subdivisionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubdivision_Name() {
		return (EAttribute) subdivisionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubdivision_Budget() {
		return (EReference) subdivisionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSubdivision__GetMonthsBudgetList() {
		return subdivisionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBudgetValue() {
		return budgetValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBudgetValue_Id() {
		return (EAttribute) budgetValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBudgetValue_Budgetindicator() {
		return (EReference) budgetValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBudgetValue_Value() {
		return (EAttribute) budgetValueEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBudgetValue_Comment() {
		return (EAttribute) budgetValueEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBudgetValue_SingularValue() {
		return (EAttribute) budgetValueEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBudgetValue_Count() {
		return (EAttribute) budgetValueEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBudgetValue_Periodicity() {
		return (EAttribute) budgetValueEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBudgetValue_Offset() {
		return (EAttribute) budgetValueEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBudgetValue_UseLength() {
		return (EAttribute) budgetValueEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBudgetValue_PayAtEnd() {
		return (EAttribute) budgetValueEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBudgetValue__GetValue__int() {
		return budgetValueEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCompare() {
		return compareEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCompare_Id() {
		return (EAttribute) compareEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCompare_Value() {
		return (EAttribute) compareEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompare_Companykpi() {
		return (EReference) compareEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCompare__GetLeftOperand() {
		return compareEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCompare__GetRightOperand() {
		return compareEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAuthorizable() {
		return authorizableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAuthorizable_Email() {
		return (EAttribute) authorizableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAuthorizable_Password() {
		return (EAttribute) authorizableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAuthorizable__Auth() {
		return authorizableEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBudget() {
		return budgetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBudget_Budgetvalue() {
		return (EReference) budgetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBudget_Id() {
		return (EAttribute) budgetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBudget_Name() {
		return (EAttribute) budgetEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBudget_Type() {
		return (EAttribute) budgetEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBudget__Calculate__int() {
		return budgetEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExperiment() {
		return experimentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExperiment_Id() {
		return (EAttribute) experimentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExperiment_Name() {
		return (EAttribute) experimentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExperiment_Date() {
		return (EAttribute) experimentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExperiment__GetResult() {
		return experimentEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExperiment__SaveResult() {
		return experimentEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExperiment__Copy() {
		return experimentEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComparable() {
		return comparableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getComparable__Compare__Comparable() {
		return comparableEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMonthsBudgetList() {
		return monthsBudgetListEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMonthsBudgetList_MonthValues() {
		return (EAttribute) monthsBudgetListEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Lab1Factory getLab1Factory() {
		return (Lab1Factory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		transformableEClass = createEClass(TRANSFORMABLE);
		createEOperation(transformableEClass, TRANSFORMABLE___GET_VALUE);

		transformationEClass = createEClass(TRANSFORMATION);
		createEAttribute(transformationEClass, TRANSFORMATION__ID);
		createEAttribute(transformationEClass, TRANSFORMATION__OPERATION);
		createEReference(transformationEClass, TRANSFORMATION__BUDGETINDICATOR);
		createEReference(transformationEClass, TRANSFORMATION__TRANSFORMATION);
		createEOperation(transformationEClass, TRANSFORMATION___GET_LEFT_OPERAND);
		createEOperation(transformationEClass, TRANSFORMATION___GET_RIGHT_OPERAND);

		budgetIndicatorEClass = createEClass(BUDGET_INDICATOR);
		createEAttribute(budgetIndicatorEClass, BUDGET_INDICATOR__ID);
		createEAttribute(budgetIndicatorEClass, BUDGET_INDICATOR__NAME);
		createEAttribute(budgetIndicatorEClass, BUDGET_INDICATOR__TYPE);

		kpiEClass = createEClass(KPI);
		createEAttribute(kpiEClass, KPI__ID);
		createEReference(kpiEClass, KPI__TRANSFORMATION);
		createEAttribute(kpiEClass, KPI__NAME);
		createEOperation(kpiEClass, KPI___CALCULATE__MONTHSBUDGETLIST);

		companyEClass = createEClass(COMPANY);
		createEAttribute(companyEClass, COMPANY__ID);
		createEAttribute(companyEClass, COMPANY__NAME);
		createEReference(companyEClass, COMPANY__COMPANYKPI);
		createEReference(companyEClass, COMPANY__EXPERIMENT);
		createEReference(companyEClass, COMPANY__SUBDIVISION);
		createEOperation(companyEClass, COMPANY___GET_MONTHS_BUDGET_LIST);

		companyKPIEClass = createEClass(COMPANY_KPI);
		createEAttribute(companyKPIEClass, COMPANY_KPI__ID);
		createEReference(companyKPIEClass, COMPANY_KPI__KPI);
		createEAttribute(companyKPIEClass, COMPANY_KPI__TARGET_VALUE);
		createEAttribute(companyKPIEClass, COMPANY_KPI__CURRENT_VALUE);
		createEReference(companyKPIEClass, COMPANY_KPI__COMPARE);
		createEOperation(companyKPIEClass, COMPANY_KPI___GET_IMPORTANCE__EXPERIMENT);

		subdivisionEClass = createEClass(SUBDIVISION);
		createEAttribute(subdivisionEClass, SUBDIVISION__ID);
		createEAttribute(subdivisionEClass, SUBDIVISION__NAME);
		createEReference(subdivisionEClass, SUBDIVISION__BUDGET);
		createEOperation(subdivisionEClass, SUBDIVISION___GET_MONTHS_BUDGET_LIST);

		budgetValueEClass = createEClass(BUDGET_VALUE);
		createEAttribute(budgetValueEClass, BUDGET_VALUE__ID);
		createEReference(budgetValueEClass, BUDGET_VALUE__BUDGETINDICATOR);
		createEAttribute(budgetValueEClass, BUDGET_VALUE__VALUE);
		createEAttribute(budgetValueEClass, BUDGET_VALUE__COMMENT);
		createEAttribute(budgetValueEClass, BUDGET_VALUE__SINGULAR_VALUE);
		createEAttribute(budgetValueEClass, BUDGET_VALUE__COUNT);
		createEAttribute(budgetValueEClass, BUDGET_VALUE__PERIODICITY);
		createEAttribute(budgetValueEClass, BUDGET_VALUE__OFFSET);
		createEAttribute(budgetValueEClass, BUDGET_VALUE__USE_LENGTH);
		createEAttribute(budgetValueEClass, BUDGET_VALUE__PAY_AT_END);
		createEOperation(budgetValueEClass, BUDGET_VALUE___GET_VALUE__INT);

		compareEClass = createEClass(COMPARE);
		createEAttribute(compareEClass, COMPARE__ID);
		createEAttribute(compareEClass, COMPARE__VALUE);
		createEReference(compareEClass, COMPARE__COMPANYKPI);
		createEOperation(compareEClass, COMPARE___GET_LEFT_OPERAND);
		createEOperation(compareEClass, COMPARE___GET_RIGHT_OPERAND);

		authorizableEClass = createEClass(AUTHORIZABLE);
		createEAttribute(authorizableEClass, AUTHORIZABLE__EMAIL);
		createEAttribute(authorizableEClass, AUTHORIZABLE__PASSWORD);
		createEOperation(authorizableEClass, AUTHORIZABLE___AUTH);

		budgetEClass = createEClass(BUDGET);
		createEReference(budgetEClass, BUDGET__BUDGETVALUE);
		createEAttribute(budgetEClass, BUDGET__ID);
		createEAttribute(budgetEClass, BUDGET__NAME);
		createEAttribute(budgetEClass, BUDGET__TYPE);
		createEOperation(budgetEClass, BUDGET___CALCULATE__INT);

		experimentEClass = createEClass(EXPERIMENT);
		createEAttribute(experimentEClass, EXPERIMENT__ID);
		createEAttribute(experimentEClass, EXPERIMENT__NAME);
		createEAttribute(experimentEClass, EXPERIMENT__DATE);
		createEOperation(experimentEClass, EXPERIMENT___GET_RESULT);
		createEOperation(experimentEClass, EXPERIMENT___SAVE_RESULT);
		createEOperation(experimentEClass, EXPERIMENT___COPY);

		comparableEClass = createEClass(COMPARABLE);
		createEOperation(comparableEClass, COMPARABLE___COMPARE__COMPARABLE);

		monthsBudgetListEClass = createEClass(MONTHS_BUDGET_LIST);
		createEAttribute(monthsBudgetListEClass, MONTHS_BUDGET_LIST__MONTH_VALUES);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		transformationEClass.getESuperTypes().add(this.getTransformable());
		budgetIndicatorEClass.getESuperTypes().add(this.getTransformable());
		companyEClass.getESuperTypes().add(this.getAuthorizable());
		companyKPIEClass.getESuperTypes().add(this.getComparable());
		subdivisionEClass.getESuperTypes().add(this.getAuthorizable());

		// Initialize classes, features, and operations; add parameters
		initEClass(transformableEClass, Transformable.class, "Transformable", IS_ABSTRACT, IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getTransformable__GetValue(), null, "getValue", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(transformationEClass, Transformation.class, "Transformation", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTransformation_Id(), ecorePackage.getEInt(), "id", null, 1, 1, Transformation.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransformation_Operation(), ecorePackage.getEString(), "operation", "+", 1, 1,
				Transformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getTransformation_Budgetindicator(), this.getBudgetIndicator(), null, "budgetindicator", null, 0,
				2, Transformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransformation_Transformation(), this.getTransformation(), null, "transformation", null, 0, 2,
				Transformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getTransformation__GetLeftOperand(), this.getTransformable(), "getLeftOperand", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		initEOperation(getTransformation__GetRightOperand(), this.getTransformable(), "getRightOperand", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		initEClass(budgetIndicatorEClass, BudgetIndicator.class, "BudgetIndicator", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBudgetIndicator_Id(), ecorePackage.getEInt(), "id", null, 1, 1, BudgetIndicator.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBudgetIndicator_Name(), ecorePackage.getEString(), "name", null, 1, 1, BudgetIndicator.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBudgetIndicator_Type(), ecorePackage.getEString(), "type", null, 1, 1, BudgetIndicator.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(kpiEClass, lab1.KPI.class, "KPI", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getKPI_Id(), ecorePackage.getEInt(), "id", null, 1, 1, lab1.KPI.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getKPI_Transformation(), this.getTransformation(), null, "transformation", null, 0, -1,
				lab1.KPI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKPI_Name(), ecorePackage.getEString(), "name", null, 1, 1, lab1.KPI.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getKPI__Calculate__MonthsBudgetList(), null, "calculate", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, this.getMonthsBudgetList(), "budgetValues", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(companyEClass, Company.class, "Company", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCompany_Id(), ecorePackage.getEInt(), "id", null, 1, 1, Company.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCompany_Name(), ecorePackage.getEString(), "name", null, 1, 1, Company.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCompany_Companykpi(), this.getCompanyKPI(), null, "companykpi", null, 1, -1, Company.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCompany_Experiment(), this.getExperiment(), null, "experiment", null, 0, -1, Company.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCompany_Subdivision(), this.getSubdivision(), null, "subdivision", null, 1, -1, Company.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getCompany__GetMonthsBudgetList(), this.getMonthsBudgetList(), "getMonthsBudgetList", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		initEClass(companyKPIEClass, CompanyKPI.class, "CompanyKPI", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCompanyKPI_Id(), ecorePackage.getEInt(), "id", null, 1, 1, CompanyKPI.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCompanyKPI_Kpi(), this.getKPI(), null, "kpi", null, 1, 1, CompanyKPI.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getCompanyKPI_TargetValue(), ecorePackage.getEFloat(), "targetValue", "0", 1, 1,
				CompanyKPI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getCompanyKPI_CurrentValue(), ecorePackage.getEFloat(), "currentValue", "0", 1, 1,
				CompanyKPI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getCompanyKPI_Compare(), this.getCompare(), this.getCompare_Companykpi(), "compare", null, 1, -1,
				CompanyKPI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getCompanyKPI__GetImportance__Experiment(), ecorePackage.getEFloat(), "getImportance", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getExperiment(), "experiment", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(subdivisionEClass, Subdivision.class, "Subdivision", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSubdivision_Id(), ecorePackage.getEInt(), "id", null, 1, 1, Subdivision.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSubdivision_Name(), ecorePackage.getEString(), "name", null, 0, 1, Subdivision.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSubdivision_Budget(), this.getBudget(), null, "budget", null, 1, -1, Subdivision.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getSubdivision__GetMonthsBudgetList(), this.getMonthsBudgetList(), "getMonthsBudgetList", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		initEClass(budgetValueEClass, BudgetValue.class, "BudgetValue", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBudgetValue_Id(), ecorePackage.getEInt(), "id", null, 1, 1, BudgetValue.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBudgetValue_Budgetindicator(), this.getBudgetIndicator(), null, "budgetindicator", null, 1, 1,
				BudgetValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBudgetValue_Value(), ecorePackage.getEDouble(), "value", "0", 1, 1, BudgetValue.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBudgetValue_Comment(), ecorePackage.getEString(), "comment", null, 0, 1, BudgetValue.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBudgetValue_SingularValue(), ecorePackage.getEBoolean(), "singularValue", "false", 1, 1,
				BudgetValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getBudgetValue_Count(), ecorePackage.getEInt(), "count", null, 1, 1, BudgetValue.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBudgetValue_Periodicity(), ecorePackage.getEInt(), "periodicity", "0", 1, 1,
				BudgetValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getBudgetValue_Offset(), ecorePackage.getEInt(), "offset", "0", 1, 1, BudgetValue.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBudgetValue_UseLength(), ecorePackage.getEInt(), "useLength", "1", 1, 1, BudgetValue.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBudgetValue_PayAtEnd(), ecorePackage.getEBoolean(), "payAtEnd", "false", 1, 1,
				BudgetValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		op = initEOperation(getBudgetValue__GetValue__int(), ecorePackage.getEFloat(), "getValue", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "month", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(compareEClass, Compare.class, "Compare", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCompare_Id(), ecorePackage.getEInt(), "id", null, 1, 1, Compare.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCompare_Value(), ecorePackage.getEInt(), "value", "0", 1, 1, Compare.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCompare_Companykpi(), this.getCompanyKPI(), this.getCompanyKPI_Compare(), "companykpi", null,
				1, 1, Compare.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getCompare__GetLeftOperand(), this.getComparable(), "getLeftOperand", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		initEOperation(getCompare__GetRightOperand(), this.getComparable(), "getRightOperand", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		initEClass(authorizableEClass, Authorizable.class, "Authorizable", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAuthorizable_Email(), ecorePackage.getEString(), "email", null, 1, 1, Authorizable.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAuthorizable_Password(), ecorePackage.getEString(), "password", null, 1, 1,
				Authorizable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEOperation(getAuthorizable__Auth(), null, "auth", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(budgetEClass, Budget.class, "Budget", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBudget_Budgetvalue(), this.getBudgetValue(), null, "budgetvalue", null, 1, -1, Budget.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBudget_Id(), ecorePackage.getEInt(), "id", null, 1, 1, Budget.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBudget_Name(), ecorePackage.getEString(), "name", null, 1, 1, Budget.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBudget_Type(), ecorePackage.getEString(), "type", null, 1, 1, Budget.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getBudget__Calculate__int(), this.getMonthsBudgetList(), "calculate", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "month", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(experimentEClass, Experiment.class, "Experiment", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExperiment_Id(), ecorePackage.getEInt(), "id", null, 1, 1, Experiment.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExperiment_Name(), ecorePackage.getEString(), "name", null, 1, 1, Experiment.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExperiment_Date(), ecorePackage.getEDate(), "date", null, 1, 1, Experiment.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getExperiment__GetResult(), ecorePackage.getEString(), "getResult", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getExperiment__SaveResult(), ecorePackage.getEString(), "saveResult", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		initEOperation(getExperiment__Copy(), this.getExperiment(), "copy", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(comparableEClass, lab1.Comparable.class, "Comparable", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getComparable__Compare__Comparable(), ecorePackage.getEInt(), "compare", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, this.getComparable(), "item", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(monthsBudgetListEClass, MonthsBudgetList.class, "MonthsBudgetList", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMonthsBudgetList_MonthValues(), ecorePackage.getEFloat(), "monthValues", null, 1, 555555555,
				MonthsBudgetList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //Lab1PackageImpl
