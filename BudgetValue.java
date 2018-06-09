/**
 */
package lab1;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Budget Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link lab1.BudgetValue#getId <em>Id</em>}</li>
 *   <li>{@link lab1.BudgetValue#getBudgetindicator <em>Budgetindicator</em>}</li>
 *   <li>{@link lab1.BudgetValue#getValue <em>Value</em>}</li>
 *   <li>{@link lab1.BudgetValue#getComment <em>Comment</em>}</li>
 *   <li>{@link lab1.BudgetValue#isSingularValue <em>Singular Value</em>}</li>
 *   <li>{@link lab1.BudgetValue#getCount <em>Count</em>}</li>
 *   <li>{@link lab1.BudgetValue#getPeriodicity <em>Periodicity</em>}</li>
 *   <li>{@link lab1.BudgetValue#getOffset <em>Offset</em>}</li>
 *   <li>{@link lab1.BudgetValue#getUseLength <em>Use Length</em>}</li>
 *   <li>{@link lab1.BudgetValue#isPayAtEnd <em>Pay At End</em>}</li>
 * </ul>
 *
 * @see lab1.Lab1Package#getBudgetValue()
 * @model
 * @generated
 */
public interface BudgetValue extends EObject {
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
	 * @see lab1.Lab1Package#getBudgetValue_Id()
	 * @model required="true"
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link lab1.BudgetValue#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

	/**
	 * Returns the value of the '<em><b>Budgetindicator</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Budgetindicator</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Budgetindicator</em>' reference.
	 * @see #setBudgetindicator(BudgetIndicator)
	 * @see lab1.Lab1Package#getBudgetValue_Budgetindicator()
	 * @model required="true"
	 * @generated
	 */
	BudgetIndicator getBudgetindicator();

	/**
	 * Sets the value of the '{@link lab1.BudgetValue#getBudgetindicator <em>Budgetindicator</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Budgetindicator</em>' reference.
	 * @see #getBudgetindicator()
	 * @generated
	 */
	void setBudgetindicator(BudgetIndicator value);

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
	 * @see #setValue(double)
	 * @see lab1.Lab1Package#getBudgetValue_Value()
	 * @model default="0" required="true"
	 * @generated
	 */
	double getValue();

	/**
	 * Sets the value of the '{@link lab1.BudgetValue#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(double value);

	/**
	 * Returns the value of the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comment</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comment</em>' attribute.
	 * @see #setComment(String)
	 * @see lab1.Lab1Package#getBudgetValue_Comment()
	 * @model
	 * @generated
	 */
	String getComment();

	/**
	 * Sets the value of the '{@link lab1.BudgetValue#getComment <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comment</em>' attribute.
	 * @see #getComment()
	 * @generated
	 */
	void setComment(String value);

	/**
	 * Returns the value of the '<em><b>Singular Value</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Singular Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Singular Value</em>' attribute.
	 * @see #setSingularValue(boolean)
	 * @see lab1.Lab1Package#getBudgetValue_SingularValue()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isSingularValue();

	/**
	 * Sets the value of the '{@link lab1.BudgetValue#isSingularValue <em>Singular Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Singular Value</em>' attribute.
	 * @see #isSingularValue()
	 * @generated
	 */
	void setSingularValue(boolean value);

	/**
	 * Returns the value of the '<em><b>Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Count</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Count</em>' attribute.
	 * @see #setCount(int)
	 * @see lab1.Lab1Package#getBudgetValue_Count()
	 * @model required="true"
	 * @generated
	 */
	int getCount();

	/**
	 * Sets the value of the '{@link lab1.BudgetValue#getCount <em>Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Count</em>' attribute.
	 * @see #getCount()
	 * @generated
	 */
	void setCount(int value);

	/**
	 * Returns the value of the '<em><b>Periodicity</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Periodicity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Periodicity</em>' attribute.
	 * @see #setPeriodicity(int)
	 * @see lab1.Lab1Package#getBudgetValue_Periodicity()
	 * @model default="0" required="true"
	 * @generated
	 */
	int getPeriodicity();

	/**
	 * Sets the value of the '{@link lab1.BudgetValue#getPeriodicity <em>Periodicity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Periodicity</em>' attribute.
	 * @see #getPeriodicity()
	 * @generated
	 */
	void setPeriodicity(int value);

	/**
	 * Returns the value of the '<em><b>Offset</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Offset</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Offset</em>' attribute.
	 * @see #setOffset(int)
	 * @see lab1.Lab1Package#getBudgetValue_Offset()
	 * @model default="0" required="true"
	 * @generated
	 */
	int getOffset();

	/**
	 * Sets the value of the '{@link lab1.BudgetValue#getOffset <em>Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Offset</em>' attribute.
	 * @see #getOffset()
	 * @generated
	 */
	void setOffset(int value);

	/**
	 * Returns the value of the '<em><b>Use Length</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Use Length</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Use Length</em>' attribute.
	 * @see #setUseLength(int)
	 * @see lab1.Lab1Package#getBudgetValue_UseLength()
	 * @model default="1" required="true"
	 * @generated
	 */
	int getUseLength();

	/**
	 * Sets the value of the '{@link lab1.BudgetValue#getUseLength <em>Use Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Use Length</em>' attribute.
	 * @see #getUseLength()
	 * @generated
	 */
	void setUseLength(int value);

	/**
	 * Returns the value of the '<em><b>Pay At End</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pay At End</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pay At End</em>' attribute.
	 * @see #setPayAtEnd(boolean)
	 * @see lab1.Lab1Package#getBudgetValue_PayAtEnd()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isPayAtEnd();

	/**
	 * Sets the value of the '{@link lab1.BudgetValue#isPayAtEnd <em>Pay At End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pay At End</em>' attribute.
	 * @see #isPayAtEnd()
	 * @generated
	 */
	void setPayAtEnd(boolean value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	float getValue(int month);

} // BudgetValue
