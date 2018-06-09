/**
 */
package lab1;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see lab1.Lab1Factory
 * @model kind="package"
 * @generated
 */
public interface Lab1Package extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "lab1";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/lab1";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "lab1";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Lab1Package eINSTANCE = lab1.impl.Lab1PackageImpl.init();

	/**
	 * The meta object id for the '{@link lab1.Transformable <em>Transformable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lab1.Transformable
	 * @see lab1.impl.Lab1PackageImpl#getTransformable()
	 * @generated
	 */
	int TRANSFORMABLE = 0;

	/**
	 * The number of structural features of the '<em>Transformable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMABLE_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Get Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMABLE___GET_VALUE = 0;

	/**
	 * The number of operations of the '<em>Transformable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMABLE_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link lab1.impl.TransformationImpl <em>Transformation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lab1.impl.TransformationImpl
	 * @see lab1.impl.Lab1PackageImpl#getTransformation()
	 * @generated
	 */
	int TRANSFORMATION = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION__ID = TRANSFORMABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION__OPERATION = TRANSFORMABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Budgetindicator</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION__BUDGETINDICATOR = TRANSFORMABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Transformation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION__TRANSFORMATION = TRANSFORMABLE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Transformation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_FEATURE_COUNT = TRANSFORMABLE_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Get Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION___GET_VALUE = TRANSFORMABLE___GET_VALUE;

	/**
	 * The operation id for the '<em>Get Left Operand</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION___GET_LEFT_OPERAND = TRANSFORMABLE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Right Operand</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION___GET_RIGHT_OPERAND = TRANSFORMABLE_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Transformation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_OPERATION_COUNT = TRANSFORMABLE_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link lab1.impl.BudgetIndicatorImpl <em>Budget Indicator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lab1.impl.BudgetIndicatorImpl
	 * @see lab1.impl.Lab1PackageImpl#getBudgetIndicator()
	 * @generated
	 */
	int BUDGET_INDICATOR = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUDGET_INDICATOR__ID = TRANSFORMABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUDGET_INDICATOR__NAME = TRANSFORMABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUDGET_INDICATOR__TYPE = TRANSFORMABLE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Budget Indicator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUDGET_INDICATOR_FEATURE_COUNT = TRANSFORMABLE_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUDGET_INDICATOR___GET_VALUE = TRANSFORMABLE___GET_VALUE;

	/**
	 * The number of operations of the '<em>Budget Indicator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUDGET_INDICATOR_OPERATION_COUNT = TRANSFORMABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link lab1.impl.KPIImpl <em>KPI</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lab1.impl.KPIImpl
	 * @see lab1.impl.Lab1PackageImpl#getKPI()
	 * @generated
	 */
	int KPI = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KPI__ID = 0;

	/**
	 * The feature id for the '<em><b>Transformation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KPI__TRANSFORMATION = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KPI__NAME = 2;

	/**
	 * The number of structural features of the '<em>KPI</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KPI_FEATURE_COUNT = 3;

	/**
	 * The operation id for the '<em>Calculate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KPI___CALCULATE__MONTHSBUDGETLIST = 0;

	/**
	 * The number of operations of the '<em>KPI</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KPI_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link lab1.impl.AuthorizableImpl <em>Authorizable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lab1.impl.AuthorizableImpl
	 * @see lab1.impl.Lab1PackageImpl#getAuthorizable()
	 * @generated
	 */
	int AUTHORIZABLE = 9;

	/**
	 * The feature id for the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHORIZABLE__EMAIL = 0;

	/**
	 * The feature id for the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHORIZABLE__PASSWORD = 1;

	/**
	 * The number of structural features of the '<em>Authorizable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHORIZABLE_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>Auth</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHORIZABLE___AUTH = 0;

	/**
	 * The number of operations of the '<em>Authorizable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHORIZABLE_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link lab1.impl.CompanyImpl <em>Company</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lab1.impl.CompanyImpl
	 * @see lab1.impl.Lab1PackageImpl#getCompany()
	 * @generated
	 */
	int COMPANY = 4;

	/**
	 * The feature id for the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPANY__EMAIL = AUTHORIZABLE__EMAIL;

	/**
	 * The feature id for the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPANY__PASSWORD = AUTHORIZABLE__PASSWORD;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPANY__ID = AUTHORIZABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPANY__NAME = AUTHORIZABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Companykpi</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPANY__COMPANYKPI = AUTHORIZABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Experiment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPANY__EXPERIMENT = AUTHORIZABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Subdivision</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPANY__SUBDIVISION = AUTHORIZABLE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Company</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPANY_FEATURE_COUNT = AUTHORIZABLE_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>Auth</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPANY___AUTH = AUTHORIZABLE___AUTH;

	/**
	 * The operation id for the '<em>Get Months Budget List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPANY___GET_MONTHS_BUDGET_LIST = AUTHORIZABLE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Company</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPANY_OPERATION_COUNT = AUTHORIZABLE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link lab1.impl.ComparableImpl <em>Comparable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lab1.impl.ComparableImpl
	 * @see lab1.impl.Lab1PackageImpl#getComparable()
	 * @generated
	 */
	int COMPARABLE = 12;

	/**
	 * The number of structural features of the '<em>Comparable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARABLE_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Compare</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARABLE___COMPARE__COMPARABLE = 0;

	/**
	 * The number of operations of the '<em>Comparable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARABLE_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link lab1.impl.CompanyKPIImpl <em>Company KPI</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lab1.impl.CompanyKPIImpl
	 * @see lab1.impl.Lab1PackageImpl#getCompanyKPI()
	 * @generated
	 */
	int COMPANY_KPI = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPANY_KPI__ID = COMPARABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Kpi</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPANY_KPI__KPI = COMPARABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Target Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPANY_KPI__TARGET_VALUE = COMPARABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Current Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPANY_KPI__CURRENT_VALUE = COMPARABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Compare</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPANY_KPI__COMPARE = COMPARABLE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Company KPI</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPANY_KPI_FEATURE_COUNT = COMPARABLE_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>Compare</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPANY_KPI___COMPARE__COMPARABLE = COMPARABLE___COMPARE__COMPARABLE;

	/**
	 * The operation id for the '<em>Get Importance</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPANY_KPI___GET_IMPORTANCE__EXPERIMENT = COMPARABLE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Company KPI</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPANY_KPI_OPERATION_COUNT = COMPARABLE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link lab1.impl.SubdivisionImpl <em>Subdivision</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lab1.impl.SubdivisionImpl
	 * @see lab1.impl.Lab1PackageImpl#getSubdivision()
	 * @generated
	 */
	int SUBDIVISION = 6;

	/**
	 * The feature id for the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBDIVISION__EMAIL = AUTHORIZABLE__EMAIL;

	/**
	 * The feature id for the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBDIVISION__PASSWORD = AUTHORIZABLE__PASSWORD;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBDIVISION__ID = AUTHORIZABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBDIVISION__NAME = AUTHORIZABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Budget</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBDIVISION__BUDGET = AUTHORIZABLE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Subdivision</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBDIVISION_FEATURE_COUNT = AUTHORIZABLE_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Auth</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBDIVISION___AUTH = AUTHORIZABLE___AUTH;

	/**
	 * The operation id for the '<em>Get Months Budget List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBDIVISION___GET_MONTHS_BUDGET_LIST = AUTHORIZABLE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Subdivision</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBDIVISION_OPERATION_COUNT = AUTHORIZABLE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link lab1.impl.BudgetValueImpl <em>Budget Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lab1.impl.BudgetValueImpl
	 * @see lab1.impl.Lab1PackageImpl#getBudgetValue()
	 * @generated
	 */
	int BUDGET_VALUE = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUDGET_VALUE__ID = 0;

	/**
	 * The feature id for the '<em><b>Budgetindicator</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUDGET_VALUE__BUDGETINDICATOR = 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUDGET_VALUE__VALUE = 2;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUDGET_VALUE__COMMENT = 3;

	/**
	 * The feature id for the '<em><b>Singular Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUDGET_VALUE__SINGULAR_VALUE = 4;

	/**
	 * The feature id for the '<em><b>Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUDGET_VALUE__COUNT = 5;

	/**
	 * The feature id for the '<em><b>Periodicity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUDGET_VALUE__PERIODICITY = 6;

	/**
	 * The feature id for the '<em><b>Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUDGET_VALUE__OFFSET = 7;

	/**
	 * The feature id for the '<em><b>Use Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUDGET_VALUE__USE_LENGTH = 8;

	/**
	 * The feature id for the '<em><b>Pay At End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUDGET_VALUE__PAY_AT_END = 9;

	/**
	 * The number of structural features of the '<em>Budget Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUDGET_VALUE_FEATURE_COUNT = 10;

	/**
	 * The operation id for the '<em>Get Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUDGET_VALUE___GET_VALUE__INT = 0;

	/**
	 * The number of operations of the '<em>Budget Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUDGET_VALUE_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link lab1.impl.CompareImpl <em>Compare</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lab1.impl.CompareImpl
	 * @see lab1.impl.Lab1PackageImpl#getCompare()
	 * @generated
	 */
	int COMPARE = 8;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARE__ID = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARE__VALUE = 1;

	/**
	 * The feature id for the '<em><b>Companykpi</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARE__COMPANYKPI = 2;

	/**
	 * The number of structural features of the '<em>Compare</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARE_FEATURE_COUNT = 3;

	/**
	 * The operation id for the '<em>Get Left Operand</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARE___GET_LEFT_OPERAND = 0;

	/**
	 * The operation id for the '<em>Get Right Operand</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARE___GET_RIGHT_OPERAND = 1;

	/**
	 * The number of operations of the '<em>Compare</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARE_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link lab1.impl.BudgetImpl <em>Budget</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lab1.impl.BudgetImpl
	 * @see lab1.impl.Lab1PackageImpl#getBudget()
	 * @generated
	 */
	int BUDGET = 10;

	/**
	 * The feature id for the '<em><b>Budgetvalue</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUDGET__BUDGETVALUE = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUDGET__ID = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUDGET__NAME = 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUDGET__TYPE = 3;

	/**
	 * The number of structural features of the '<em>Budget</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUDGET_FEATURE_COUNT = 4;

	/**
	 * The operation id for the '<em>Calculate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUDGET___CALCULATE__INT = 0;

	/**
	 * The number of operations of the '<em>Budget</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUDGET_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link lab1.impl.ExperimentImpl <em>Experiment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lab1.impl.ExperimentImpl
	 * @see lab1.impl.Lab1PackageImpl#getExperiment()
	 * @generated
	 */
	int EXPERIMENT = 11;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERIMENT__ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERIMENT__NAME = 1;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERIMENT__DATE = 2;

	/**
	 * The number of structural features of the '<em>Experiment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERIMENT_FEATURE_COUNT = 3;

	/**
	 * The operation id for the '<em>Get Result</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERIMENT___GET_RESULT = 0;

	/**
	 * The operation id for the '<em>Save Result</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERIMENT___SAVE_RESULT = 1;

	/**
	 * The operation id for the '<em>Copy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERIMENT___COPY = 2;

	/**
	 * The number of operations of the '<em>Experiment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERIMENT_OPERATION_COUNT = 3;

	/**
	 * The meta object id for the '{@link lab1.impl.MonthsBudgetListImpl <em>Months Budget List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lab1.impl.MonthsBudgetListImpl
	 * @see lab1.impl.Lab1PackageImpl#getMonthsBudgetList()
	 * @generated
	 */
	int MONTHS_BUDGET_LIST = 13;

	/**
	 * The feature id for the '<em><b>Month Values</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONTHS_BUDGET_LIST__MONTH_VALUES = 0;

	/**
	 * The number of structural features of the '<em>Months Budget List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONTHS_BUDGET_LIST_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Months Budget List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONTHS_BUDGET_LIST_OPERATION_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link lab1.Transformable <em>Transformable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transformable</em>'.
	 * @see lab1.Transformable
	 * @generated
	 */
	EClass getTransformable();

	/**
	 * Returns the meta object for the '{@link lab1.Transformable#getValue() <em>Get Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Value</em>' operation.
	 * @see lab1.Transformable#getValue()
	 * @generated
	 */
	EOperation getTransformable__GetValue();

	/**
	 * Returns the meta object for class '{@link lab1.Transformation <em>Transformation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transformation</em>'.
	 * @see lab1.Transformation
	 * @generated
	 */
	EClass getTransformation();

	/**
	 * Returns the meta object for the attribute '{@link lab1.Transformation#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see lab1.Transformation#getId()
	 * @see #getTransformation()
	 * @generated
	 */
	EAttribute getTransformation_Id();

	/**
	 * Returns the meta object for the attribute '{@link lab1.Transformation#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operation</em>'.
	 * @see lab1.Transformation#getOperation()
	 * @see #getTransformation()
	 * @generated
	 */
	EAttribute getTransformation_Operation();

	/**
	 * Returns the meta object for the containment reference list '{@link lab1.Transformation#getBudgetindicator <em>Budgetindicator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Budgetindicator</em>'.
	 * @see lab1.Transformation#getBudgetindicator()
	 * @see #getTransformation()
	 * @generated
	 */
	EReference getTransformation_Budgetindicator();

	/**
	 * Returns the meta object for the containment reference list '{@link lab1.Transformation#getTransformation <em>Transformation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Transformation</em>'.
	 * @see lab1.Transformation#getTransformation()
	 * @see #getTransformation()
	 * @generated
	 */
	EReference getTransformation_Transformation();

	/**
	 * Returns the meta object for the '{@link lab1.Transformation#getLeftOperand() <em>Get Left Operand</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Left Operand</em>' operation.
	 * @see lab1.Transformation#getLeftOperand()
	 * @generated
	 */
	EOperation getTransformation__GetLeftOperand();

	/**
	 * Returns the meta object for the '{@link lab1.Transformation#getRightOperand() <em>Get Right Operand</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Right Operand</em>' operation.
	 * @see lab1.Transformation#getRightOperand()
	 * @generated
	 */
	EOperation getTransformation__GetRightOperand();

	/**
	 * Returns the meta object for class '{@link lab1.BudgetIndicator <em>Budget Indicator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Budget Indicator</em>'.
	 * @see lab1.BudgetIndicator
	 * @generated
	 */
	EClass getBudgetIndicator();

	/**
	 * Returns the meta object for the attribute '{@link lab1.BudgetIndicator#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see lab1.BudgetIndicator#getId()
	 * @see #getBudgetIndicator()
	 * @generated
	 */
	EAttribute getBudgetIndicator_Id();

	/**
	 * Returns the meta object for the attribute '{@link lab1.BudgetIndicator#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see lab1.BudgetIndicator#getName()
	 * @see #getBudgetIndicator()
	 * @generated
	 */
	EAttribute getBudgetIndicator_Name();

	/**
	 * Returns the meta object for the attribute '{@link lab1.BudgetIndicator#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see lab1.BudgetIndicator#getType()
	 * @see #getBudgetIndicator()
	 * @generated
	 */
	EAttribute getBudgetIndicator_Type();

	/**
	 * Returns the meta object for class '{@link lab1.KPI <em>KPI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>KPI</em>'.
	 * @see lab1.KPI
	 * @generated
	 */
	EClass getKPI();

	/**
	 * Returns the meta object for the attribute '{@link lab1.KPI#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see lab1.KPI#getId()
	 * @see #getKPI()
	 * @generated
	 */
	EAttribute getKPI_Id();

	/**
	 * Returns the meta object for the containment reference list '{@link lab1.KPI#getTransformation <em>Transformation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Transformation</em>'.
	 * @see lab1.KPI#getTransformation()
	 * @see #getKPI()
	 * @generated
	 */
	EReference getKPI_Transformation();

	/**
	 * Returns the meta object for the attribute '{@link lab1.KPI#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see lab1.KPI#getName()
	 * @see #getKPI()
	 * @generated
	 */
	EAttribute getKPI_Name();

	/**
	 * Returns the meta object for the '{@link lab1.KPI#calculate(lab1.MonthsBudgetList) <em>Calculate</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Calculate</em>' operation.
	 * @see lab1.KPI#calculate(lab1.MonthsBudgetList)
	 * @generated
	 */
	EOperation getKPI__Calculate__MonthsBudgetList();

	/**
	 * Returns the meta object for class '{@link lab1.Company <em>Company</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Company</em>'.
	 * @see lab1.Company
	 * @generated
	 */
	EClass getCompany();

	/**
	 * Returns the meta object for the attribute '{@link lab1.Company#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see lab1.Company#getId()
	 * @see #getCompany()
	 * @generated
	 */
	EAttribute getCompany_Id();

	/**
	 * Returns the meta object for the attribute '{@link lab1.Company#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see lab1.Company#getName()
	 * @see #getCompany()
	 * @generated
	 */
	EAttribute getCompany_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link lab1.Company#getCompanykpi <em>Companykpi</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Companykpi</em>'.
	 * @see lab1.Company#getCompanykpi()
	 * @see #getCompany()
	 * @generated
	 */
	EReference getCompany_Companykpi();

	/**
	 * Returns the meta object for the containment reference list '{@link lab1.Company#getExperiment <em>Experiment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Experiment</em>'.
	 * @see lab1.Company#getExperiment()
	 * @see #getCompany()
	 * @generated
	 */
	EReference getCompany_Experiment();

	/**
	 * Returns the meta object for the containment reference list '{@link lab1.Company#getSubdivision <em>Subdivision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Subdivision</em>'.
	 * @see lab1.Company#getSubdivision()
	 * @see #getCompany()
	 * @generated
	 */
	EReference getCompany_Subdivision();

	/**
	 * Returns the meta object for the '{@link lab1.Company#getMonthsBudgetList() <em>Get Months Budget List</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Months Budget List</em>' operation.
	 * @see lab1.Company#getMonthsBudgetList()
	 * @generated
	 */
	EOperation getCompany__GetMonthsBudgetList();

	/**
	 * Returns the meta object for class '{@link lab1.CompanyKPI <em>Company KPI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Company KPI</em>'.
	 * @see lab1.CompanyKPI
	 * @generated
	 */
	EClass getCompanyKPI();

	/**
	 * Returns the meta object for the attribute '{@link lab1.CompanyKPI#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see lab1.CompanyKPI#getId()
	 * @see #getCompanyKPI()
	 * @generated
	 */
	EAttribute getCompanyKPI_Id();

	/**
	 * Returns the meta object for the reference '{@link lab1.CompanyKPI#getKpi <em>Kpi</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Kpi</em>'.
	 * @see lab1.CompanyKPI#getKpi()
	 * @see #getCompanyKPI()
	 * @generated
	 */
	EReference getCompanyKPI_Kpi();

	/**
	 * Returns the meta object for the attribute '{@link lab1.CompanyKPI#getTargetValue <em>Target Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Value</em>'.
	 * @see lab1.CompanyKPI#getTargetValue()
	 * @see #getCompanyKPI()
	 * @generated
	 */
	EAttribute getCompanyKPI_TargetValue();

	/**
	 * Returns the meta object for the attribute '{@link lab1.CompanyKPI#getCurrentValue <em>Current Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Current Value</em>'.
	 * @see lab1.CompanyKPI#getCurrentValue()
	 * @see #getCompanyKPI()
	 * @generated
	 */
	EAttribute getCompanyKPI_CurrentValue();

	/**
	 * Returns the meta object for the reference list '{@link lab1.CompanyKPI#getCompare <em>Compare</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Compare</em>'.
	 * @see lab1.CompanyKPI#getCompare()
	 * @see #getCompanyKPI()
	 * @generated
	 */
	EReference getCompanyKPI_Compare();

	/**
	 * Returns the meta object for the '{@link lab1.CompanyKPI#getImportance(lab1.Experiment) <em>Get Importance</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Importance</em>' operation.
	 * @see lab1.CompanyKPI#getImportance(lab1.Experiment)
	 * @generated
	 */
	EOperation getCompanyKPI__GetImportance__Experiment();

	/**
	 * Returns the meta object for class '{@link lab1.Subdivision <em>Subdivision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Subdivision</em>'.
	 * @see lab1.Subdivision
	 * @generated
	 */
	EClass getSubdivision();

	/**
	 * Returns the meta object for the attribute '{@link lab1.Subdivision#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see lab1.Subdivision#getId()
	 * @see #getSubdivision()
	 * @generated
	 */
	EAttribute getSubdivision_Id();

	/**
	 * Returns the meta object for the attribute '{@link lab1.Subdivision#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see lab1.Subdivision#getName()
	 * @see #getSubdivision()
	 * @generated
	 */
	EAttribute getSubdivision_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link lab1.Subdivision#getBudget <em>Budget</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Budget</em>'.
	 * @see lab1.Subdivision#getBudget()
	 * @see #getSubdivision()
	 * @generated
	 */
	EReference getSubdivision_Budget();

	/**
	 * Returns the meta object for the '{@link lab1.Subdivision#getMonthsBudgetList() <em>Get Months Budget List</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Months Budget List</em>' operation.
	 * @see lab1.Subdivision#getMonthsBudgetList()
	 * @generated
	 */
	EOperation getSubdivision__GetMonthsBudgetList();

	/**
	 * Returns the meta object for class '{@link lab1.BudgetValue <em>Budget Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Budget Value</em>'.
	 * @see lab1.BudgetValue
	 * @generated
	 */
	EClass getBudgetValue();

	/**
	 * Returns the meta object for the attribute '{@link lab1.BudgetValue#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see lab1.BudgetValue#getId()
	 * @see #getBudgetValue()
	 * @generated
	 */
	EAttribute getBudgetValue_Id();

	/**
	 * Returns the meta object for the reference '{@link lab1.BudgetValue#getBudgetindicator <em>Budgetindicator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Budgetindicator</em>'.
	 * @see lab1.BudgetValue#getBudgetindicator()
	 * @see #getBudgetValue()
	 * @generated
	 */
	EReference getBudgetValue_Budgetindicator();

	/**
	 * Returns the meta object for the attribute '{@link lab1.BudgetValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see lab1.BudgetValue#getValue()
	 * @see #getBudgetValue()
	 * @generated
	 */
	EAttribute getBudgetValue_Value();

	/**
	 * Returns the meta object for the attribute '{@link lab1.BudgetValue#getComment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comment</em>'.
	 * @see lab1.BudgetValue#getComment()
	 * @see #getBudgetValue()
	 * @generated
	 */
	EAttribute getBudgetValue_Comment();

	/**
	 * Returns the meta object for the attribute '{@link lab1.BudgetValue#isSingularValue <em>Singular Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Singular Value</em>'.
	 * @see lab1.BudgetValue#isSingularValue()
	 * @see #getBudgetValue()
	 * @generated
	 */
	EAttribute getBudgetValue_SingularValue();

	/**
	 * Returns the meta object for the attribute '{@link lab1.BudgetValue#getCount <em>Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Count</em>'.
	 * @see lab1.BudgetValue#getCount()
	 * @see #getBudgetValue()
	 * @generated
	 */
	EAttribute getBudgetValue_Count();

	/**
	 * Returns the meta object for the attribute '{@link lab1.BudgetValue#getPeriodicity <em>Periodicity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Periodicity</em>'.
	 * @see lab1.BudgetValue#getPeriodicity()
	 * @see #getBudgetValue()
	 * @generated
	 */
	EAttribute getBudgetValue_Periodicity();

	/**
	 * Returns the meta object for the attribute '{@link lab1.BudgetValue#getOffset <em>Offset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Offset</em>'.
	 * @see lab1.BudgetValue#getOffset()
	 * @see #getBudgetValue()
	 * @generated
	 */
	EAttribute getBudgetValue_Offset();

	/**
	 * Returns the meta object for the attribute '{@link lab1.BudgetValue#getUseLength <em>Use Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Use Length</em>'.
	 * @see lab1.BudgetValue#getUseLength()
	 * @see #getBudgetValue()
	 * @generated
	 */
	EAttribute getBudgetValue_UseLength();

	/**
	 * Returns the meta object for the attribute '{@link lab1.BudgetValue#isPayAtEnd <em>Pay At End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pay At End</em>'.
	 * @see lab1.BudgetValue#isPayAtEnd()
	 * @see #getBudgetValue()
	 * @generated
	 */
	EAttribute getBudgetValue_PayAtEnd();

	/**
	 * Returns the meta object for the '{@link lab1.BudgetValue#getValue(int) <em>Get Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Value</em>' operation.
	 * @see lab1.BudgetValue#getValue(int)
	 * @generated
	 */
	EOperation getBudgetValue__GetValue__int();

	/**
	 * Returns the meta object for class '{@link lab1.Compare <em>Compare</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Compare</em>'.
	 * @see lab1.Compare
	 * @generated
	 */
	EClass getCompare();

	/**
	 * Returns the meta object for the attribute '{@link lab1.Compare#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see lab1.Compare#getId()
	 * @see #getCompare()
	 * @generated
	 */
	EAttribute getCompare_Id();

	/**
	 * Returns the meta object for the attribute '{@link lab1.Compare#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see lab1.Compare#getValue()
	 * @see #getCompare()
	 * @generated
	 */
	EAttribute getCompare_Value();

	/**
	 * Returns the meta object for the reference '{@link lab1.Compare#getCompanykpi <em>Companykpi</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Companykpi</em>'.
	 * @see lab1.Compare#getCompanykpi()
	 * @see #getCompare()
	 * @generated
	 */
	EReference getCompare_Companykpi();

	/**
	 * Returns the meta object for the '{@link lab1.Compare#getLeftOperand() <em>Get Left Operand</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Left Operand</em>' operation.
	 * @see lab1.Compare#getLeftOperand()
	 * @generated
	 */
	EOperation getCompare__GetLeftOperand();

	/**
	 * Returns the meta object for the '{@link lab1.Compare#getRightOperand() <em>Get Right Operand</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Right Operand</em>' operation.
	 * @see lab1.Compare#getRightOperand()
	 * @generated
	 */
	EOperation getCompare__GetRightOperand();

	/**
	 * Returns the meta object for class '{@link lab1.Authorizable <em>Authorizable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Authorizable</em>'.
	 * @see lab1.Authorizable
	 * @generated
	 */
	EClass getAuthorizable();

	/**
	 * Returns the meta object for the attribute '{@link lab1.Authorizable#getEmail <em>Email</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Email</em>'.
	 * @see lab1.Authorizable#getEmail()
	 * @see #getAuthorizable()
	 * @generated
	 */
	EAttribute getAuthorizable_Email();

	/**
	 * Returns the meta object for the attribute '{@link lab1.Authorizable#getPassword <em>Password</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Password</em>'.
	 * @see lab1.Authorizable#getPassword()
	 * @see #getAuthorizable()
	 * @generated
	 */
	EAttribute getAuthorizable_Password();

	/**
	 * Returns the meta object for the '{@link lab1.Authorizable#auth() <em>Auth</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Auth</em>' operation.
	 * @see lab1.Authorizable#auth()
	 * @generated
	 */
	EOperation getAuthorizable__Auth();

	/**
	 * Returns the meta object for class '{@link lab1.Budget <em>Budget</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Budget</em>'.
	 * @see lab1.Budget
	 * @generated
	 */
	EClass getBudget();

	/**
	 * Returns the meta object for the containment reference list '{@link lab1.Budget#getBudgetvalue <em>Budgetvalue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Budgetvalue</em>'.
	 * @see lab1.Budget#getBudgetvalue()
	 * @see #getBudget()
	 * @generated
	 */
	EReference getBudget_Budgetvalue();

	/**
	 * Returns the meta object for the attribute '{@link lab1.Budget#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see lab1.Budget#getId()
	 * @see #getBudget()
	 * @generated
	 */
	EAttribute getBudget_Id();

	/**
	 * Returns the meta object for the attribute '{@link lab1.Budget#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see lab1.Budget#getName()
	 * @see #getBudget()
	 * @generated
	 */
	EAttribute getBudget_Name();

	/**
	 * Returns the meta object for the attribute '{@link lab1.Budget#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see lab1.Budget#getType()
	 * @see #getBudget()
	 * @generated
	 */
	EAttribute getBudget_Type();

	/**
	 * Returns the meta object for the '{@link lab1.Budget#calculate(int) <em>Calculate</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Calculate</em>' operation.
	 * @see lab1.Budget#calculate(int)
	 * @generated
	 */
	EOperation getBudget__Calculate__int();

	/**
	 * Returns the meta object for class '{@link lab1.Experiment <em>Experiment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Experiment</em>'.
	 * @see lab1.Experiment
	 * @generated
	 */
	EClass getExperiment();

	/**
	 * Returns the meta object for the attribute '{@link lab1.Experiment#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see lab1.Experiment#getId()
	 * @see #getExperiment()
	 * @generated
	 */
	EAttribute getExperiment_Id();

	/**
	 * Returns the meta object for the attribute '{@link lab1.Experiment#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see lab1.Experiment#getName()
	 * @see #getExperiment()
	 * @generated
	 */
	EAttribute getExperiment_Name();

	/**
	 * Returns the meta object for the attribute '{@link lab1.Experiment#getDate <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date</em>'.
	 * @see lab1.Experiment#getDate()
	 * @see #getExperiment()
	 * @generated
	 */
	EAttribute getExperiment_Date();

	/**
	 * Returns the meta object for the '{@link lab1.Experiment#getResult() <em>Get Result</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Result</em>' operation.
	 * @see lab1.Experiment#getResult()
	 * @generated
	 */
	EOperation getExperiment__GetResult();

	/**
	 * Returns the meta object for the '{@link lab1.Experiment#saveResult() <em>Save Result</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Save Result</em>' operation.
	 * @see lab1.Experiment#saveResult()
	 * @generated
	 */
	EOperation getExperiment__SaveResult();

	/**
	 * Returns the meta object for the '{@link lab1.Experiment#copy() <em>Copy</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Copy</em>' operation.
	 * @see lab1.Experiment#copy()
	 * @generated
	 */
	EOperation getExperiment__Copy();

	/**
	 * Returns the meta object for class '{@link lab1.Comparable <em>Comparable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Comparable</em>'.
	 * @see lab1.Comparable
	 * @generated
	 */
	EClass getComparable();

	/**
	 * Returns the meta object for the '{@link lab1.Comparable#compare(lab1.Comparable) <em>Compare</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Compare</em>' operation.
	 * @see lab1.Comparable#compare(lab1.Comparable)
	 * @generated
	 */
	EOperation getComparable__Compare__Comparable();

	/**
	 * Returns the meta object for class '{@link lab1.MonthsBudgetList <em>Months Budget List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Months Budget List</em>'.
	 * @see lab1.MonthsBudgetList
	 * @generated
	 */
	EClass getMonthsBudgetList();

	/**
	 * Returns the meta object for the attribute list '{@link lab1.MonthsBudgetList#getMonthValues <em>Month Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Month Values</em>'.
	 * @see lab1.MonthsBudgetList#getMonthValues()
	 * @see #getMonthsBudgetList()
	 * @generated
	 */
	EAttribute getMonthsBudgetList_MonthValues();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Lab1Factory getLab1Factory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link lab1.Transformable <em>Transformable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lab1.Transformable
		 * @see lab1.impl.Lab1PackageImpl#getTransformable()
		 * @generated
		 */
		EClass TRANSFORMABLE = eINSTANCE.getTransformable();

		/**
		 * The meta object literal for the '<em><b>Get Value</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TRANSFORMABLE___GET_VALUE = eINSTANCE.getTransformable__GetValue();

		/**
		 * The meta object literal for the '{@link lab1.impl.TransformationImpl <em>Transformation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lab1.impl.TransformationImpl
		 * @see lab1.impl.Lab1PackageImpl#getTransformation()
		 * @generated
		 */
		EClass TRANSFORMATION = eINSTANCE.getTransformation();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSFORMATION__ID = eINSTANCE.getTransformation_Id();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSFORMATION__OPERATION = eINSTANCE.getTransformation_Operation();

		/**
		 * The meta object literal for the '<em><b>Budgetindicator</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSFORMATION__BUDGETINDICATOR = eINSTANCE.getTransformation_Budgetindicator();

		/**
		 * The meta object literal for the '<em><b>Transformation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSFORMATION__TRANSFORMATION = eINSTANCE.getTransformation_Transformation();

		/**
		 * The meta object literal for the '<em><b>Get Left Operand</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TRANSFORMATION___GET_LEFT_OPERAND = eINSTANCE.getTransformation__GetLeftOperand();

		/**
		 * The meta object literal for the '<em><b>Get Right Operand</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TRANSFORMATION___GET_RIGHT_OPERAND = eINSTANCE.getTransformation__GetRightOperand();

		/**
		 * The meta object literal for the '{@link lab1.impl.BudgetIndicatorImpl <em>Budget Indicator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lab1.impl.BudgetIndicatorImpl
		 * @see lab1.impl.Lab1PackageImpl#getBudgetIndicator()
		 * @generated
		 */
		EClass BUDGET_INDICATOR = eINSTANCE.getBudgetIndicator();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUDGET_INDICATOR__ID = eINSTANCE.getBudgetIndicator_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUDGET_INDICATOR__NAME = eINSTANCE.getBudgetIndicator_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUDGET_INDICATOR__TYPE = eINSTANCE.getBudgetIndicator_Type();

		/**
		 * The meta object literal for the '{@link lab1.impl.KPIImpl <em>KPI</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lab1.impl.KPIImpl
		 * @see lab1.impl.Lab1PackageImpl#getKPI()
		 * @generated
		 */
		EClass KPI = eINSTANCE.getKPI();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KPI__ID = eINSTANCE.getKPI_Id();

		/**
		 * The meta object literal for the '<em><b>Transformation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KPI__TRANSFORMATION = eINSTANCE.getKPI_Transformation();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KPI__NAME = eINSTANCE.getKPI_Name();

		/**
		 * The meta object literal for the '<em><b>Calculate</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation KPI___CALCULATE__MONTHSBUDGETLIST = eINSTANCE.getKPI__Calculate__MonthsBudgetList();

		/**
		 * The meta object literal for the '{@link lab1.impl.CompanyImpl <em>Company</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lab1.impl.CompanyImpl
		 * @see lab1.impl.Lab1PackageImpl#getCompany()
		 * @generated
		 */
		EClass COMPANY = eINSTANCE.getCompany();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPANY__ID = eINSTANCE.getCompany_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPANY__NAME = eINSTANCE.getCompany_Name();

		/**
		 * The meta object literal for the '<em><b>Companykpi</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPANY__COMPANYKPI = eINSTANCE.getCompany_Companykpi();

		/**
		 * The meta object literal for the '<em><b>Experiment</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPANY__EXPERIMENT = eINSTANCE.getCompany_Experiment();

		/**
		 * The meta object literal for the '<em><b>Subdivision</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPANY__SUBDIVISION = eINSTANCE.getCompany_Subdivision();

		/**
		 * The meta object literal for the '<em><b>Get Months Budget List</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COMPANY___GET_MONTHS_BUDGET_LIST = eINSTANCE.getCompany__GetMonthsBudgetList();

		/**
		 * The meta object literal for the '{@link lab1.impl.CompanyKPIImpl <em>Company KPI</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lab1.impl.CompanyKPIImpl
		 * @see lab1.impl.Lab1PackageImpl#getCompanyKPI()
		 * @generated
		 */
		EClass COMPANY_KPI = eINSTANCE.getCompanyKPI();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPANY_KPI__ID = eINSTANCE.getCompanyKPI_Id();

		/**
		 * The meta object literal for the '<em><b>Kpi</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPANY_KPI__KPI = eINSTANCE.getCompanyKPI_Kpi();

		/**
		 * The meta object literal for the '<em><b>Target Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPANY_KPI__TARGET_VALUE = eINSTANCE.getCompanyKPI_TargetValue();

		/**
		 * The meta object literal for the '<em><b>Current Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPANY_KPI__CURRENT_VALUE = eINSTANCE.getCompanyKPI_CurrentValue();

		/**
		 * The meta object literal for the '<em><b>Compare</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPANY_KPI__COMPARE = eINSTANCE.getCompanyKPI_Compare();

		/**
		 * The meta object literal for the '<em><b>Get Importance</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COMPANY_KPI___GET_IMPORTANCE__EXPERIMENT = eINSTANCE.getCompanyKPI__GetImportance__Experiment();

		/**
		 * The meta object literal for the '{@link lab1.impl.SubdivisionImpl <em>Subdivision</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lab1.impl.SubdivisionImpl
		 * @see lab1.impl.Lab1PackageImpl#getSubdivision()
		 * @generated
		 */
		EClass SUBDIVISION = eINSTANCE.getSubdivision();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBDIVISION__ID = eINSTANCE.getSubdivision_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBDIVISION__NAME = eINSTANCE.getSubdivision_Name();

		/**
		 * The meta object literal for the '<em><b>Budget</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBDIVISION__BUDGET = eINSTANCE.getSubdivision_Budget();

		/**
		 * The meta object literal for the '<em><b>Get Months Budget List</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SUBDIVISION___GET_MONTHS_BUDGET_LIST = eINSTANCE.getSubdivision__GetMonthsBudgetList();

		/**
		 * The meta object literal for the '{@link lab1.impl.BudgetValueImpl <em>Budget Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lab1.impl.BudgetValueImpl
		 * @see lab1.impl.Lab1PackageImpl#getBudgetValue()
		 * @generated
		 */
		EClass BUDGET_VALUE = eINSTANCE.getBudgetValue();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUDGET_VALUE__ID = eINSTANCE.getBudgetValue_Id();

		/**
		 * The meta object literal for the '<em><b>Budgetindicator</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUDGET_VALUE__BUDGETINDICATOR = eINSTANCE.getBudgetValue_Budgetindicator();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUDGET_VALUE__VALUE = eINSTANCE.getBudgetValue_Value();

		/**
		 * The meta object literal for the '<em><b>Comment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUDGET_VALUE__COMMENT = eINSTANCE.getBudgetValue_Comment();

		/**
		 * The meta object literal for the '<em><b>Singular Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUDGET_VALUE__SINGULAR_VALUE = eINSTANCE.getBudgetValue_SingularValue();

		/**
		 * The meta object literal for the '<em><b>Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUDGET_VALUE__COUNT = eINSTANCE.getBudgetValue_Count();

		/**
		 * The meta object literal for the '<em><b>Periodicity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUDGET_VALUE__PERIODICITY = eINSTANCE.getBudgetValue_Periodicity();

		/**
		 * The meta object literal for the '<em><b>Offset</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUDGET_VALUE__OFFSET = eINSTANCE.getBudgetValue_Offset();

		/**
		 * The meta object literal for the '<em><b>Use Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUDGET_VALUE__USE_LENGTH = eINSTANCE.getBudgetValue_UseLength();

		/**
		 * The meta object literal for the '<em><b>Pay At End</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUDGET_VALUE__PAY_AT_END = eINSTANCE.getBudgetValue_PayAtEnd();

		/**
		 * The meta object literal for the '<em><b>Get Value</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BUDGET_VALUE___GET_VALUE__INT = eINSTANCE.getBudgetValue__GetValue__int();

		/**
		 * The meta object literal for the '{@link lab1.impl.CompareImpl <em>Compare</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lab1.impl.CompareImpl
		 * @see lab1.impl.Lab1PackageImpl#getCompare()
		 * @generated
		 */
		EClass COMPARE = eINSTANCE.getCompare();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPARE__ID = eINSTANCE.getCompare_Id();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPARE__VALUE = eINSTANCE.getCompare_Value();

		/**
		 * The meta object literal for the '<em><b>Companykpi</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPARE__COMPANYKPI = eINSTANCE.getCompare_Companykpi();

		/**
		 * The meta object literal for the '<em><b>Get Left Operand</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COMPARE___GET_LEFT_OPERAND = eINSTANCE.getCompare__GetLeftOperand();

		/**
		 * The meta object literal for the '<em><b>Get Right Operand</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COMPARE___GET_RIGHT_OPERAND = eINSTANCE.getCompare__GetRightOperand();

		/**
		 * The meta object literal for the '{@link lab1.impl.AuthorizableImpl <em>Authorizable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lab1.impl.AuthorizableImpl
		 * @see lab1.impl.Lab1PackageImpl#getAuthorizable()
		 * @generated
		 */
		EClass AUTHORIZABLE = eINSTANCE.getAuthorizable();

		/**
		 * The meta object literal for the '<em><b>Email</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUTHORIZABLE__EMAIL = eINSTANCE.getAuthorizable_Email();

		/**
		 * The meta object literal for the '<em><b>Password</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUTHORIZABLE__PASSWORD = eINSTANCE.getAuthorizable_Password();

		/**
		 * The meta object literal for the '<em><b>Auth</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation AUTHORIZABLE___AUTH = eINSTANCE.getAuthorizable__Auth();

		/**
		 * The meta object literal for the '{@link lab1.impl.BudgetImpl <em>Budget</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lab1.impl.BudgetImpl
		 * @see lab1.impl.Lab1PackageImpl#getBudget()
		 * @generated
		 */
		EClass BUDGET = eINSTANCE.getBudget();

		/**
		 * The meta object literal for the '<em><b>Budgetvalue</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUDGET__BUDGETVALUE = eINSTANCE.getBudget_Budgetvalue();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUDGET__ID = eINSTANCE.getBudget_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUDGET__NAME = eINSTANCE.getBudget_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUDGET__TYPE = eINSTANCE.getBudget_Type();

		/**
		 * The meta object literal for the '<em><b>Calculate</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BUDGET___CALCULATE__INT = eINSTANCE.getBudget__Calculate__int();

		/**
		 * The meta object literal for the '{@link lab1.impl.ExperimentImpl <em>Experiment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lab1.impl.ExperimentImpl
		 * @see lab1.impl.Lab1PackageImpl#getExperiment()
		 * @generated
		 */
		EClass EXPERIMENT = eINSTANCE.getExperiment();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPERIMENT__ID = eINSTANCE.getExperiment_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPERIMENT__NAME = eINSTANCE.getExperiment_Name();

		/**
		 * The meta object literal for the '<em><b>Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPERIMENT__DATE = eINSTANCE.getExperiment_Date();

		/**
		 * The meta object literal for the '<em><b>Get Result</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EXPERIMENT___GET_RESULT = eINSTANCE.getExperiment__GetResult();

		/**
		 * The meta object literal for the '<em><b>Save Result</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EXPERIMENT___SAVE_RESULT = eINSTANCE.getExperiment__SaveResult();

		/**
		 * The meta object literal for the '<em><b>Copy</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EXPERIMENT___COPY = eINSTANCE.getExperiment__Copy();

		/**
		 * The meta object literal for the '{@link lab1.impl.ComparableImpl <em>Comparable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lab1.impl.ComparableImpl
		 * @see lab1.impl.Lab1PackageImpl#getComparable()
		 * @generated
		 */
		EClass COMPARABLE = eINSTANCE.getComparable();

		/**
		 * The meta object literal for the '<em><b>Compare</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COMPARABLE___COMPARE__COMPARABLE = eINSTANCE.getComparable__Compare__Comparable();

		/**
		 * The meta object literal for the '{@link lab1.impl.MonthsBudgetListImpl <em>Months Budget List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lab1.impl.MonthsBudgetListImpl
		 * @see lab1.impl.Lab1PackageImpl#getMonthsBudgetList()
		 * @generated
		 */
		EClass MONTHS_BUDGET_LIST = eINSTANCE.getMonthsBudgetList();

		/**
		 * The meta object literal for the '<em><b>Month Values</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MONTHS_BUDGET_LIST__MONTH_VALUES = eINSTANCE.getMonthsBudgetList_MonthValues();

	}

} //Lab1Package
