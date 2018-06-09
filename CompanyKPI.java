/**
 */
package lab1;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Company KPI</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link lab1.CompanyKPI#getId <em>Id</em>}</li>
 *   <li>{@link lab1.CompanyKPI#getKpi <em>Kpi</em>}</li>
 *   <li>{@link lab1.CompanyKPI#getTargetValue <em>Target Value</em>}</li>
 *   <li>{@link lab1.CompanyKPI#getCurrentValue <em>Current Value</em>}</li>
 *   <li>{@link lab1.CompanyKPI#getCompare <em>Compare</em>}</li>
 * </ul>
 *
 * @see lab1.Lab1Package#getCompanyKPI()
 * @model
 * @generated
 */
public interface CompanyKPI extends lab1.Comparable {
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
	 * @see lab1.Lab1Package#getCompanyKPI_Id()
	 * @model required="true"
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link lab1.CompanyKPI#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

	/**
	 * Returns the value of the '<em><b>Kpi</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kpi</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kpi</em>' reference.
	 * @see #setKpi(KPI)
	 * @see lab1.Lab1Package#getCompanyKPI_Kpi()
	 * @model required="true"
	 * @generated
	 */
	KPI getKpi();

	/**
	 * Sets the value of the '{@link lab1.CompanyKPI#getKpi <em>Kpi</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kpi</em>' reference.
	 * @see #getKpi()
	 * @generated
	 */
	void setKpi(KPI value);

	/**
	 * Returns the value of the '<em><b>Target Value</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Value</em>' attribute.
	 * @see #setTargetValue(float)
	 * @see lab1.Lab1Package#getCompanyKPI_TargetValue()
	 * @model default="0" required="true"
	 * @generated
	 */
	float getTargetValue();

	/**
	 * Sets the value of the '{@link lab1.CompanyKPI#getTargetValue <em>Target Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Value</em>' attribute.
	 * @see #getTargetValue()
	 * @generated
	 */
	void setTargetValue(float value);

	/**
	 * Returns the value of the '<em><b>Current Value</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Current Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current Value</em>' attribute.
	 * @see #setCurrentValue(float)
	 * @see lab1.Lab1Package#getCompanyKPI_CurrentValue()
	 * @model default="0" required="true"
	 * @generated
	 */
	float getCurrentValue();

	/**
	 * Sets the value of the '{@link lab1.CompanyKPI#getCurrentValue <em>Current Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current Value</em>' attribute.
	 * @see #getCurrentValue()
	 * @generated
	 */
	void setCurrentValue(float value);

	/**
	 * Returns the value of the '<em><b>Compare</b></em>' reference list.
	 * The list contents are of type {@link lab1.Compare}.
	 * It is bidirectional and its opposite is '{@link lab1.Compare#getCompanykpi <em>Companykpi</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Compare</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Compare</em>' reference list.
	 * @see lab1.Lab1Package#getCompanyKPI_Compare()
	 * @see lab1.Compare#getCompanykpi
	 * @model opposite="companykpi" required="true"
	 * @generated
	 */
	EList<Compare> getCompare();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	float getImportance(Experiment experiment);

} // CompanyKPI
