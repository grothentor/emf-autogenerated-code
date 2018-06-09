/**
 */
package lab1;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Months Budget List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link lab1.MonthsBudgetList#getMonthValues <em>Month Values</em>}</li>
 * </ul>
 *
 * @see lab1.Lab1Package#getMonthsBudgetList()
 * @model
 * @generated
 */
public interface MonthsBudgetList extends EObject {
	/**
	 * Returns the value of the '<em><b>Month Values</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Float}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Month Values</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Month Values</em>' attribute list.
	 * @see lab1.Lab1Package#getMonthsBudgetList_MonthValues()
	 * @model required="true" upper="555555555"
	 * @generated
	 */
	EList<Float> getMonthValues();

} // MonthsBudgetList
