/**
 */
package lab1;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transformation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link lab1.Transformation#getId <em>Id</em>}</li>
 *   <li>{@link lab1.Transformation#getOperation <em>Operation</em>}</li>
 *   <li>{@link lab1.Transformation#getBudgetindicator <em>Budgetindicator</em>}</li>
 *   <li>{@link lab1.Transformation#getTransformation <em>Transformation</em>}</li>
 * </ul>
 *
 * @see lab1.Lab1Package#getTransformation()
 * @model
 * @generated
 */
public interface Transformation extends Transformable {
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
	 * @see lab1.Lab1Package#getTransformation_Id()
	 * @model required="true"
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link lab1.Transformation#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

	/**
	 * Returns the value of the '<em><b>Operation</b></em>' attribute.
	 * The default value is <code>"+"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation</em>' attribute.
	 * @see #setOperation(String)
	 * @see lab1.Lab1Package#getTransformation_Operation()
	 * @model default="+" required="true"
	 * @generated
	 */
	String getOperation();

	/**
	 * Sets the value of the '{@link lab1.Transformation#getOperation <em>Operation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation</em>' attribute.
	 * @see #getOperation()
	 * @generated
	 */
	void setOperation(String value);

	/**
	 * Returns the value of the '<em><b>Budgetindicator</b></em>' containment reference list.
	 * The list contents are of type {@link lab1.BudgetIndicator}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Budgetindicator</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Budgetindicator</em>' containment reference list.
	 * @see lab1.Lab1Package#getTransformation_Budgetindicator()
	 * @model containment="true" upper="2"
	 * @generated
	 */
	EList<BudgetIndicator> getBudgetindicator();

	/**
	 * Returns the value of the '<em><b>Transformation</b></em>' containment reference list.
	 * The list contents are of type {@link lab1.Transformation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transformation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transformation</em>' containment reference list.
	 * @see lab1.Lab1Package#getTransformation_Transformation()
	 * @model containment="true" upper="2"
	 * @generated
	 */
	EList<Transformation> getTransformation();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	Transformable getLeftOperand();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	Transformable getRightOperand();

} // Transformation
