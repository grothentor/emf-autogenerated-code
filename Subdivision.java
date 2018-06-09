/**
 */
package lab1;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Subdivision</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link lab1.Subdivision#getId <em>Id</em>}</li>
 *   <li>{@link lab1.Subdivision#getName <em>Name</em>}</li>
 *   <li>{@link lab1.Subdivision#getBudget <em>Budget</em>}</li>
 * </ul>
 *
 * @see lab1.Lab1Package#getSubdivision()
 * @model
 * @generated
 */
public interface Subdivision extends Authorizable {
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
	 * @see lab1.Lab1Package#getSubdivision_Id()
	 * @model required="true"
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link lab1.Subdivision#getId <em>Id</em>}' attribute.
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
	 * @see lab1.Lab1Package#getSubdivision_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link lab1.Subdivision#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Budget</b></em>' containment reference list.
	 * The list contents are of type {@link lab1.Budget}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Budget</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Budget</em>' containment reference list.
	 * @see lab1.Lab1Package#getSubdivision_Budget()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Budget> getBudget();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	MonthsBudgetList getMonthsBudgetList();

} // Subdivision
