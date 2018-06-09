/**
 */
package lab1.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import lab1.BudgetIndicator;
import lab1.Lab1Package;
import lab1.Transformable;
import lab1.Transformation;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transformation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link lab1.impl.TransformationImpl#getId <em>Id</em>}</li>
 *   <li>{@link lab1.impl.TransformationImpl#getOperation <em>Operation</em>}</li>
 *   <li>{@link lab1.impl.TransformationImpl#getBudgetindicator <em>Budgetindicator</em>}</li>
 *   <li>{@link lab1.impl.TransformationImpl#getTransformation <em>Transformation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TransformationImpl extends MinimalEObjectImpl.Container implements Transformation {
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
	 * The default value of the '{@link #getOperation() <em>Operation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperation()
	 * @generated
	 * @ordered
	 */
	protected static final String OPERATION_EDEFAULT = "+";

	/**
	 * The cached value of the '{@link #getOperation() <em>Operation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperation()
	 * @generated
	 * @ordered
	 */
	protected String operation = OPERATION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBudgetindicator() <em>Budgetindicator</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBudgetindicator()
	 * @generated
	 * @ordered
	 */
	protected EList<BudgetIndicator> budgetindicator;

	/**
	 * The cached value of the '{@link #getTransformation() <em>Transformation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransformation()
	 * @generated
	 * @ordered
	 */
	protected EList<Transformation> transformation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransformationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Lab1Package.Literals.TRANSFORMATION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Lab1Package.TRANSFORMATION__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOperation() {
		return operation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperation(String newOperation) {
		String oldOperation = operation;
		operation = newOperation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Lab1Package.TRANSFORMATION__OPERATION, oldOperation,
					operation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BudgetIndicator> getBudgetindicator() {
		if (budgetindicator == null) {
			budgetindicator = new EObjectContainmentEList<BudgetIndicator>(BudgetIndicator.class, this,
					Lab1Package.TRANSFORMATION__BUDGETINDICATOR);
		}
		return budgetindicator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Transformation> getTransformation() {
		if (transformation == null) {
			transformation = new EObjectContainmentEList<Transformation>(Transformation.class, this,
					Lab1Package.TRANSFORMATION__TRANSFORMATION);
		}
		return transformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transformable getLeftOperand() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transformable getRightOperand() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void getValue() {
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
		case Lab1Package.TRANSFORMATION__BUDGETINDICATOR:
			return ((InternalEList<?>) getBudgetindicator()).basicRemove(otherEnd, msgs);
		case Lab1Package.TRANSFORMATION__TRANSFORMATION:
			return ((InternalEList<?>) getTransformation()).basicRemove(otherEnd, msgs);
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
		case Lab1Package.TRANSFORMATION__ID:
			return getId();
		case Lab1Package.TRANSFORMATION__OPERATION:
			return getOperation();
		case Lab1Package.TRANSFORMATION__BUDGETINDICATOR:
			return getBudgetindicator();
		case Lab1Package.TRANSFORMATION__TRANSFORMATION:
			return getTransformation();
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
		case Lab1Package.TRANSFORMATION__ID:
			setId((Integer) newValue);
			return;
		case Lab1Package.TRANSFORMATION__OPERATION:
			setOperation((String) newValue);
			return;
		case Lab1Package.TRANSFORMATION__BUDGETINDICATOR:
			getBudgetindicator().clear();
			getBudgetindicator().addAll((Collection<? extends BudgetIndicator>) newValue);
			return;
		case Lab1Package.TRANSFORMATION__TRANSFORMATION:
			getTransformation().clear();
			getTransformation().addAll((Collection<? extends Transformation>) newValue);
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
		case Lab1Package.TRANSFORMATION__ID:
			setId(ID_EDEFAULT);
			return;
		case Lab1Package.TRANSFORMATION__OPERATION:
			setOperation(OPERATION_EDEFAULT);
			return;
		case Lab1Package.TRANSFORMATION__BUDGETINDICATOR:
			getBudgetindicator().clear();
			return;
		case Lab1Package.TRANSFORMATION__TRANSFORMATION:
			getTransformation().clear();
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
		case Lab1Package.TRANSFORMATION__ID:
			return id != ID_EDEFAULT;
		case Lab1Package.TRANSFORMATION__OPERATION:
			return OPERATION_EDEFAULT == null ? operation != null : !OPERATION_EDEFAULT.equals(operation);
		case Lab1Package.TRANSFORMATION__BUDGETINDICATOR:
			return budgetindicator != null && !budgetindicator.isEmpty();
		case Lab1Package.TRANSFORMATION__TRANSFORMATION:
			return transformation != null && !transformation.isEmpty();
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
		case Lab1Package.TRANSFORMATION___GET_LEFT_OPERAND:
			return getLeftOperand();
		case Lab1Package.TRANSFORMATION___GET_RIGHT_OPERAND:
			return getRightOperand();
		case Lab1Package.TRANSFORMATION___GET_VALUE:
			getValue();
			return null;
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
		result.append(", operation: ");
		result.append(operation);
		result.append(')');
		return result.toString();
	}

} //TransformationImpl
