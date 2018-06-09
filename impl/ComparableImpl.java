/**
 */
package lab1.impl;

import java.lang.reflect.InvocationTargetException;

import lab1.Lab1Package;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Comparable</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class ComparableImpl extends MinimalEObjectImpl.Container implements lab1.Comparable {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComparableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Lab1Package.Literals.COMPARABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int compare(lab1.Comparable item) {
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
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case Lab1Package.COMPARABLE___COMPARE__COMPARABLE:
			return compare((lab1.Comparable) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //ComparableImpl
