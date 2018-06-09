/**
 */
package lab1;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Compare</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link lab1.Compare#getId <em>Id</em>}</li>
 *   <li>{@link lab1.Compare#getValue <em>Value</em>}</li>
 *   <li>{@link lab1.Compare#getCompanykpi <em>Companykpi</em>}</li>
 * </ul>
 *
 * @see lab1.Lab1Package#getCompare()
 * @model
 * @generated
 */
public interface Compare extends EObject {
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
	 * @see lab1.Lab1Package#getCompare_Id()
	 * @model required="true"
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link lab1.Compare#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(int)
	 * @see lab1.Lab1Package#getCompare_Value()
	 * @model default="0" required="true"
	 * @generated
	 */
	int getValue();

	/**
	 * Sets the value of the '{@link lab1.Compare#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(int value);

	/**
	 * Returns the value of the '<em><b>Companykpi</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link lab1.CompanyKPI#getCompare <em>Compare</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Companykpi</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Companykpi</em>' reference.
	 * @see #setCompanykpi(CompanyKPI)
	 * @see lab1.Lab1Package#getCompare_Companykpi()
	 * @see lab1.CompanyKPI#getCompare
	 * @model opposite="compare" required="true"
	 * @generated
	 */
	CompanyKPI getCompanykpi();

	/**
	 * Sets the value of the '{@link lab1.Compare#getCompanykpi <em>Companykpi</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Companykpi</em>' reference.
	 * @see #getCompanykpi()
	 * @generated
	 */
	void setCompanykpi(CompanyKPI value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	lab1.Comparable getLeftOperand();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	lab1.Comparable getRightOperand();

} // Compare
