/**
 */
package cpt.impl;

import cpt.CptPackage;
import cpt.EndProduct;
import cpt.SortingSplitProduct;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sorting Split Product</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link cpt.impl.SortingSplitProductImpl#getEndProduct <em>End Product</em>}</li>
 *   <li>{@link cpt.impl.SortingSplitProductImpl#getWeight <em>Weight</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SortingSplitProductImpl extends MinimalEObjectImpl.Container implements SortingSplitProduct {
	/**
	 * The cached value of the '{@link #getEndProduct() <em>End Product</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndProduct()
	 * @generated
	 * @ordered
	 */
	protected EndProduct endProduct;

	/**
	 * The default value of the '{@link #getWeight() <em>Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeight()
	 * @generated
	 * @ordered
	 */
	protected static final float WEIGHT_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getWeight() <em>Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeight()
	 * @generated
	 * @ordered
	 */
	protected float weight = WEIGHT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SortingSplitProductImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CptPackage.Literals.SORTING_SPLIT_PRODUCT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EndProduct getEndProduct() {
		if (endProduct != null && endProduct.eIsProxy()) {
			InternalEObject oldEndProduct = (InternalEObject)endProduct;
			endProduct = (EndProduct)eResolveProxy(oldEndProduct);
			if (endProduct != oldEndProduct) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CptPackage.SORTING_SPLIT_PRODUCT__END_PRODUCT, oldEndProduct, endProduct));
			}
		}
		return endProduct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EndProduct basicGetEndProduct() {
		return endProduct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndProduct(EndProduct newEndProduct) {
		EndProduct oldEndProduct = endProduct;
		endProduct = newEndProduct;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CptPackage.SORTING_SPLIT_PRODUCT__END_PRODUCT, oldEndProduct, endProduct));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getWeight() {
		return weight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWeight(float newWeight) {
		float oldWeight = weight;
		weight = newWeight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CptPackage.SORTING_SPLIT_PRODUCT__WEIGHT, oldWeight, weight));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CptPackage.SORTING_SPLIT_PRODUCT__END_PRODUCT:
				if (resolve) return getEndProduct();
				return basicGetEndProduct();
			case CptPackage.SORTING_SPLIT_PRODUCT__WEIGHT:
				return getWeight();
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
			case CptPackage.SORTING_SPLIT_PRODUCT__END_PRODUCT:
				setEndProduct((EndProduct)newValue);
				return;
			case CptPackage.SORTING_SPLIT_PRODUCT__WEIGHT:
				setWeight((Float)newValue);
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
			case CptPackage.SORTING_SPLIT_PRODUCT__END_PRODUCT:
				setEndProduct((EndProduct)null);
				return;
			case CptPackage.SORTING_SPLIT_PRODUCT__WEIGHT:
				setWeight(WEIGHT_EDEFAULT);
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
			case CptPackage.SORTING_SPLIT_PRODUCT__END_PRODUCT:
				return endProduct != null;
			case CptPackage.SORTING_SPLIT_PRODUCT__WEIGHT:
				return weight != WEIGHT_EDEFAULT;
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
		result.append(" (Weight: ");
		result.append(weight);
		result.append(')');
		return result.toString();
	}

} //SortingSplitProductImpl
