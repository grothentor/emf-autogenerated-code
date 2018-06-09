/**
 */
package lab1;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Company</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link lab1.Company#getId <em>Id</em>}</li>
 *   <li>{@link lab1.Company#getName <em>Name</em>}</li>
 *   <li>{@link lab1.Company#getCompanykpi <em>Companykpi</em>}</li>
 *   <li>{@link lab1.Company#getExperiment <em>Experiment</em>}</li>
 *   <li>{@link lab1.Company#getSubdivision <em>Subdivision</em>}</li>
 * </ul>
 *
 * @see lab1.Lab1Package#getCompany()
 * @model
 * @generated
 */
public interface Company extends Authorizable {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(int)
	 * @see lab1.Lab1Package#getCompany_Id()
	 * @model required="true"
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link lab1.Company#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see lab1.Lab1Package#getCompany_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link lab1.Company#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Companykpi</b></em>' containment reference list.
	 * The list contents are of type {@link lab1.CompanyKPI}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Companykpi</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Companykpi</em>' containment reference list.
	 * @see lab1.Lab1Package#getCompany_Companykpi()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<CompanyKPI> getCompanykpi();

	/**
	 * Returns the value of the '<em><b>Experiment</b></em>' containment reference list.
	 * The list contents are of type {@link lab1.Experiment}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Experiment</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Experiment</em>' containment reference list.
	 * @see lab1.Lab1Package#getCompany_Experiment()
	 * @model containment="true"
	 * @generated
	 */
	EList<Experiment> getExperiment();

	/**
	 * Returns the value of the '<em><b>Subdivision</b></em>' containment reference list.
	 * The list contents are of type {@link lab1.Subdivision}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subdivision</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subdivision</em>' containment reference list.
	 * @see lab1.Lab1Package#getCompany_Subdivision()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Subdivision> getSubdivision();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	MonthsBudgetList getMonthsBudgetList();

} // Company
