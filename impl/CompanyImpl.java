/**
 */
package lab1.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import lab1.Company;
import lab1.CompanyKPI;
import lab1.Experiment;
import lab1.Lab1Package;
import lab1.MonthsBudgetList;
import lab1.Subdivision;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Company</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link lab1.impl.CompanyImpl#getId <em>Id</em>}</li>
 *   <li>{@link lab1.impl.CompanyImpl#getName <em>Name</em>}</li>
 *   <li>{@link lab1.impl.CompanyImpl#getCompanykpi <em>Companykpi</em>}</li>
 *   <li>{@link lab1.impl.CompanyImpl#getExperiment <em>Experiment</em>}</li>
 *   <li>{@link lab1.impl.CompanyImpl#getSubdivision <em>Subdivision</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CompanyImpl extends AuthorizableImpl implements Company {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final int ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected int id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCompanykpi() <em>Companykpi</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompanykpi()
	 * @generated
	 * @ordered
	 */
	protected EList<CompanyKPI> companykpi;

	/**
	 * The cached value of the '{@link #getExperiment() <em>Experiment</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExperiment()
	 * @generated
	 * @ordered
	 */
	protected EList<Experiment> experiment;

	/**
	 * The cached value of the '{@link #getSubdivision() <em>Subdivision</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubdivision()
	 * @generated
	 * @ordered
	 */
	protected EList<Subdivision> subdivision;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompanyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Lab1Package.Literals.COMPANY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(int newId) {
		int oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Lab1Package.COMPANY__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Lab1Package.COMPANY__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CompanyKPI> getCompanykpi() {
		if (companykpi == null) {
			companykpi = new EObjectContainmentEList<CompanyKPI>(CompanyKPI.class, this,
					Lab1Package.COMPANY__COMPANYKPI);
		}
		return companykpi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Experiment> getExperiment() {
		if (experiment == null) {
			experiment = new EObjectContainmentEList<Experiment>(Experiment.class, this,
					Lab1Package.COMPANY__EXPERIMENT);
		}
		return experiment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Subdivision> getSubdivision() {
		if (subdivision == null) {
			subdivision = new EObjectContainmentEList<Subdivision>(Subdivision.class, this,
					Lab1Package.COMPANY__SUBDIVISION);
		}
		return subdivision;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MonthsBudgetList getMonthsBudgetList() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Lab1Package.COMPANY__COMPANYKPI:
			return ((InternalEList<?>) getCompanykpi()).basicRemove(otherEnd, msgs);
		case Lab1Package.COMPANY__EXPERIMENT:
			return ((InternalEList<?>) getExperiment()).basicRemove(otherEnd, msgs);
		case Lab1Package.COMPANY__SUBDIVISION:
			return ((InternalEList<?>) getSubdivision()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Lab1Package.COMPANY__ID:
			return getId();
		case Lab1Package.COMPANY__NAME:
			return getName();
		case Lab1Package.COMPANY__COMPANYKPI:
			return getCompanykpi();
		case Lab1Package.COMPANY__EXPERIMENT:
			return getExperiment();
		case Lab1Package.COMPANY__SUBDIVISION:
			return getSubdivision();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case Lab1Package.COMPANY__ID:
			setId((Integer) newValue);
			return;
		case Lab1Package.COMPANY__NAME:
			setName((String) newValue);
			return;
		case Lab1Package.COMPANY__COMPANYKPI:
			getCompanykpi().clear();
			getCompanykpi().addAll((Collection<? extends CompanyKPI>) newValue);
			return;
		case Lab1Package.COMPANY__EXPERIMENT:
			getExperiment().clear();
			getExperiment().addAll((Collection<? extends Experiment>) newValue);
			return;
		case Lab1Package.COMPANY__SUBDIVISION:
			getSubdivision().clear();
			getSubdivision().addAll((Collection<? extends Subdivision>) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case Lab1Package.COMPANY__ID:
			setId(ID_EDEFAULT);
			return;
		case Lab1Package.COMPANY__NAME:
			setName(NAME_EDEFAULT);
			return;
		case Lab1Package.COMPANY__COMPANYKPI:
			getCompanykpi().clear();
			return;
		case Lab1Package.COMPANY__EXPERIMENT:
			getExperiment().clear();
			return;
		case Lab1Package.COMPANY__SUBDIVISION:
			getSubdivision().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case Lab1Package.COMPANY__ID:
			return id != ID_EDEFAULT;
		case Lab1Package.COMPANY__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case Lab1Package.COMPANY__COMPANYKPI:
			return companykpi != null && !companykpi.isEmpty();
		case Lab1Package.COMPANY__EXPERIMENT:
			return experiment != null && !experiment.isEmpty();
		case Lab1Package.COMPANY__SUBDIVISION:
			return subdivision != null && !subdivision.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case Lab1Package.COMPANY___GET_MONTHS_BUDGET_LIST:
			return getMonthsBudgetList();
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (id: ");
		result.append(id);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //CompanyImpl
