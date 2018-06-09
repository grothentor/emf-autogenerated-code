/**
 */
package lab1.impl;

import java.lang.reflect.InvocationTargetException;

import lab1.BudgetIndicator;
import lab1.BudgetValue;
import lab1.Lab1Package;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Budget Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link lab1.impl.BudgetValueImpl#getId <em>Id</em>}</li>
 *   <li>{@link lab1.impl.BudgetValueImpl#getBudgetindicator <em>Budgetindicator</em>}</li>
 *   <li>{@link lab1.impl.BudgetValueImpl#getValue <em>Value</em>}</li>
 *   <li>{@link lab1.impl.BudgetValueImpl#getComment <em>Comment</em>}</li>
 *   <li>{@link lab1.impl.BudgetValueImpl#isSingularValue <em>Singular Value</em>}</li>
 *   <li>{@link lab1.impl.BudgetValueImpl#getCount <em>Count</em>}</li>
 *   <li>{@link lab1.impl.BudgetValueImpl#getPeriodicity <em>Periodicity</em>}</li>
 *   <li>{@link lab1.impl.BudgetValueImpl#getOffset <em>Offset</em>}</li>
 *   <li>{@link lab1.impl.BudgetValueImpl#getUseLength <em>Use Length</em>}</li>
 *   <li>{@link lab1.impl.BudgetValueImpl#isPayAtEnd <em>Pay At End</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BudgetValueImpl extends MinimalEObjectImpl.Container implements BudgetValue {
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
	 * The cached value of the '{@link #getBudgetindicator() <em>Budgetindicator</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBudgetindicator()
	 * @generated
	 * @ordered
	 */
	protected BudgetIndicator budgetindicator;

	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final double VALUE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected double value = VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getComment() <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComment()
	 * @generated
	 * @ordered
	 */
	protected static final String COMMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getComment() <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComment()
	 * @generated
	 * @ordered
	 */
	protected String comment = COMMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #isSingularValue() <em>Singular Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSingularValue()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SINGULAR_VALUE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isSingularValue() <em>Singular Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSingularValue()
	 * @generated
	 * @ordered
	 */
	protected boolean singularValue = SINGULAR_VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCount() <em>Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCount()
	 * @generated
	 * @ordered
	 */
	protected static final int COUNT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCount() <em>Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCount()
	 * @generated
	 * @ordered
	 */
	protected int count = COUNT_EDEFAULT;

	/**
	 * The default value of the '{@link #getPeriodicity() <em>Periodicity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeriodicity()
	 * @generated
	 * @ordered
	 */
	protected static final int PERIODICITY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPeriodicity() <em>Periodicity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeriodicity()
	 * @generated
	 * @ordered
	 */
	protected int periodicity = PERIODICITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getOffset() <em>Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOffset()
	 * @generated
	 * @ordered
	 */
	protected static final int OFFSET_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getOffset() <em>Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOffset()
	 * @generated
	 * @ordered
	 */
	protected int offset = OFFSET_EDEFAULT;

	/**
	 * The default value of the '{@link #getUseLength() <em>Use Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUseLength()
	 * @generated
	 * @ordered
	 */
	protected static final int USE_LENGTH_EDEFAULT = 1;

	/**
	 * The cached value of the '{@link #getUseLength() <em>Use Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUseLength()
	 * @generated
	 * @ordered
	 */
	protected int useLength = USE_LENGTH_EDEFAULT;

	/**
	 * The default value of the '{@link #isPayAtEnd() <em>Pay At End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPayAtEnd()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PAY_AT_END_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isPayAtEnd() <em>Pay At End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPayAtEnd()
	 * @generated
	 * @ordered
	 */
	protected boolean payAtEnd = PAY_AT_END_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BudgetValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Lab1Package.Literals.BUDGET_VALUE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Lab1Package.BUDGET_VALUE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BudgetIndicator getBudgetindicator() {
		if (budgetindicator != null && budgetindicator.eIsProxy()) {
			InternalEObject oldBudgetindicator = (InternalEObject) budgetindicator;
			budgetindicator = (BudgetIndicator) eResolveProxy(oldBudgetindicator);
			if (budgetindicator != oldBudgetindicator) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Lab1Package.BUDGET_VALUE__BUDGETINDICATOR,
							oldBudgetindicator, budgetindicator));
			}
		}
		return budgetindicator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BudgetIndicator basicGetBudgetindicator() {
		return budgetindicator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBudgetindicator(BudgetIndicator newBudgetindicator) {
		BudgetIndicator oldBudgetindicator = budgetindicator;
		budgetindicator = newBudgetindicator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Lab1Package.BUDGET_VALUE__BUDGETINDICATOR,
					oldBudgetindicator, budgetindicator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(double newValue) {
		double oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Lab1Package.BUDGET_VALUE__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getComment() {
		return comment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComment(String newComment) {
		String oldComment = comment;
		comment = newComment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Lab1Package.BUDGET_VALUE__COMMENT, oldComment,
					comment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSingularValue() {
		return singularValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSingularValue(boolean newSingularValue) {
		boolean oldSingularValue = singularValue;
		singularValue = newSingularValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Lab1Package.BUDGET_VALUE__SINGULAR_VALUE,
					oldSingularValue, singularValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCount() {
		return count;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCount(int newCount) {
		int oldCount = count;
		count = newCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Lab1Package.BUDGET_VALUE__COUNT, oldCount, count));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPeriodicity() {
		return periodicity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPeriodicity(int newPeriodicity) {
		int oldPeriodicity = periodicity;
		periodicity = newPeriodicity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Lab1Package.BUDGET_VALUE__PERIODICITY, oldPeriodicity,
					periodicity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getOffset() {
		return offset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOffset(int newOffset) {
		int oldOffset = offset;
		offset = newOffset;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Lab1Package.BUDGET_VALUE__OFFSET, oldOffset, offset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getUseLength() {
		return useLength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUseLength(int newUseLength) {
		int oldUseLength = useLength;
		useLength = newUseLength;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Lab1Package.BUDGET_VALUE__USE_LENGTH, oldUseLength,
					useLength));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isPayAtEnd() {
		return payAtEnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPayAtEnd(boolean newPayAtEnd) {
		boolean oldPayAtEnd = payAtEnd;
		payAtEnd = newPayAtEnd;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Lab1Package.BUDGET_VALUE__PAY_AT_END, oldPayAtEnd,
					payAtEnd));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getValue(int month) {
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Lab1Package.BUDGET_VALUE__ID:
			return getId();
		case Lab1Package.BUDGET_VALUE__BUDGETINDICATOR:
			if (resolve)
				return getBudgetindicator();
			return basicGetBudgetindicator();
		case Lab1Package.BUDGET_VALUE__VALUE:
			return getValue();
		case Lab1Package.BUDGET_VALUE__COMMENT:
			return getComment();
		case Lab1Package.BUDGET_VALUE__SINGULAR_VALUE:
			return isSingularValue();
		case Lab1Package.BUDGET_VALUE__COUNT:
			return getCount();
		case Lab1Package.BUDGET_VALUE__PERIODICITY:
			return getPeriodicity();
		case Lab1Package.BUDGET_VALUE__OFFSET:
			return getOffset();
		case Lab1Package.BUDGET_VALUE__USE_LENGTH:
			return getUseLength();
		case Lab1Package.BUDGET_VALUE__PAY_AT_END:
			return isPayAtEnd();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case Lab1Package.BUDGET_VALUE__ID:
			setId((Integer) newValue);
			return;
		case Lab1Package.BUDGET_VALUE__BUDGETINDICATOR:
			setBudgetindicator((BudgetIndicator) newValue);
			return;
		case Lab1Package.BUDGET_VALUE__VALUE:
			setValue((Double) newValue);
			return;
		case Lab1Package.BUDGET_VALUE__COMMENT:
			setComment((String) newValue);
			return;
		case Lab1Package.BUDGET_VALUE__SINGULAR_VALUE:
			setSingularValue((Boolean) newValue);
			return;
		case Lab1Package.BUDGET_VALUE__COUNT:
			setCount((Integer) newValue);
			return;
		case Lab1Package.BUDGET_VALUE__PERIODICITY:
			setPeriodicity((Integer) newValue);
			return;
		case Lab1Package.BUDGET_VALUE__OFFSET:
			setOffset((Integer) newValue);
			return;
		case Lab1Package.BUDGET_VALUE__USE_LENGTH:
			setUseLength((Integer) newValue);
			return;
		case Lab1Package.BUDGET_VALUE__PAY_AT_END:
			setPayAtEnd((Boolean) newValue);
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
		case Lab1Package.BUDGET_VALUE__ID:
			setId(ID_EDEFAULT);
			return;
		case Lab1Package.BUDGET_VALUE__BUDGETINDICATOR:
			setBudgetindicator((BudgetIndicator) null);
			return;
		case Lab1Package.BUDGET_VALUE__VALUE:
			setValue(VALUE_EDEFAULT);
			return;
		case Lab1Package.BUDGET_VALUE__COMMENT:
			setComment(COMMENT_EDEFAULT);
			return;
		case Lab1Package.BUDGET_VALUE__SINGULAR_VALUE:
			setSingularValue(SINGULAR_VALUE_EDEFAULT);
			return;
		case Lab1Package.BUDGET_VALUE__COUNT:
			setCount(COUNT_EDEFAULT);
			return;
		case Lab1Package.BUDGET_VALUE__PERIODICITY:
			setPeriodicity(PERIODICITY_EDEFAULT);
			return;
		case Lab1Package.BUDGET_VALUE__OFFSET:
			setOffset(OFFSET_EDEFAULT);
			return;
		case Lab1Package.BUDGET_VALUE__USE_LENGTH:
			setUseLength(USE_LENGTH_EDEFAULT);
			return;
		case Lab1Package.BUDGET_VALUE__PAY_AT_END:
			setPayAtEnd(PAY_AT_END_EDEFAULT);
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
		case Lab1Package.BUDGET_VALUE__ID:
			return id != ID_EDEFAULT;
		case Lab1Package.BUDGET_VALUE__BUDGETINDICATOR:
			return budgetindicator != null;
		case Lab1Package.BUDGET_VALUE__VALUE:
			return value != VALUE_EDEFAULT;
		case Lab1Package.BUDGET_VALUE__COMMENT:
			return COMMENT_EDEFAULT == null ? comment != null : !COMMENT_EDEFAULT.equals(comment);
		case Lab1Package.BUDGET_VALUE__SINGULAR_VALUE:
			return singularValue != SINGULAR_VALUE_EDEFAULT;
		case Lab1Package.BUDGET_VALUE__COUNT:
			return count != COUNT_EDEFAULT;
		case Lab1Package.BUDGET_VALUE__PERIODICITY:
			return periodicity != PERIODICITY_EDEFAULT;
		case Lab1Package.BUDGET_VALUE__OFFSET:
			return offset != OFFSET_EDEFAULT;
		case Lab1Package.BUDGET_VALUE__USE_LENGTH:
			return useLength != USE_LENGTH_EDEFAULT;
		case Lab1Package.BUDGET_VALUE__PAY_AT_END:
			return payAtEnd != PAY_AT_END_EDEFAULT;
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
		case Lab1Package.BUDGET_VALUE___GET_VALUE__INT:
			return getValue((Integer) arguments.get(0));
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
		result.append(", value: ");
		result.append(value);
		result.append(", comment: ");
		result.append(comment);
		result.append(", singularValue: ");
		result.append(singularValue);
		result.append(", count: ");
		result.append(count);
		result.append(", periodicity: ");
		result.append(periodicity);
		result.append(", offset: ");
		result.append(offset);
		result.append(", useLength: ");
		result.append(useLength);
		result.append(", payAtEnd: ");
		result.append(payAtEnd);
		result.append(')');
		return result.toString();
	}

} //BudgetValueImpl
