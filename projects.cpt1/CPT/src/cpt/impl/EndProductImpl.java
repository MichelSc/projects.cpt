/**
 */
package cpt.impl;

import cpt.CptPackage;
import cpt.EndProduct;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>End Product</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link cpt.impl.EndProductImpl#getCutOffHours <em>Cut Off Hours</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EndProductImpl extends ProductImpl implements EndProduct {
	/**
	 * The default value of the '{@link #getCutOffHours() <em>Cut Off Hours</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCutOffHours()
	 * @generated
	 * @ordered
	 */
	protected static final float CUT_OFF_HOURS_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getCutOffHours() <em>Cut Off Hours</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCutOffHours()
	 * @generated
	 * @ordered
	 */
	protected float cutOffHours = CUT_OFF_HOURS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EndProductImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CptPackage.Literals.END_PRODUCT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getCutOffHours() {
		return cutOffHours;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCutOffHours(float newCutOffHours) {
		float oldCutOffHours = cutOffHours;
		cutOffHours = newCutOffHours;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CptPackage.END_PRODUCT__CUT_OFF_HOURS, oldCutOffHours, cutOffHours));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CptPackage.END_PRODUCT__CUT_OFF_HOURS:
				return getCutOffHours();
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
			case CptPackage.END_PRODUCT__CUT_OFF_HOURS:
				setCutOffHours((Float)newValue);
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
			case CptPackage.END_PRODUCT__CUT_OFF_HOURS:
				setCutOffHours(CUT_OFF_HOURS_EDEFAULT);
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
			case CptPackage.END_PRODUCT__CUT_OFF_HOURS:
				return cutOffHours != CUT_OFF_HOURS_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (CutOffHours: ");
		result.append(cutOffHours);
		result.append(')');
		return result.toString();
	}

} //EndProductImpl
