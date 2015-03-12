/**
 */
package cpt.impl;

import cpt.CptPackage;
import cpt.EndProduct;
import cpt.UnsortedProduct;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Unsorted Product</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link cpt.impl.UnsortedProductImpl#getEndProducts <em>End Products</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UnsortedProductImpl extends ProductImpl implements UnsortedProduct {
	/**
	 * The cached value of the '{@link #getEndProducts() <em>End Products</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndProducts()
	 * @generated
	 * @ordered
	 */
	protected EList<EndProduct> endProducts;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UnsortedProductImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CptPackage.Literals.UNSORTED_PRODUCT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EndProduct> getEndProducts() {
		if (endProducts == null) {
			endProducts = new EObjectResolvingEList<EndProduct>(EndProduct.class, this, CptPackage.UNSORTED_PRODUCT__END_PRODUCTS);
		}
		return endProducts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CptPackage.UNSORTED_PRODUCT__END_PRODUCTS:
				return getEndProducts();
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
			case CptPackage.UNSORTED_PRODUCT__END_PRODUCTS:
				getEndProducts().clear();
				getEndProducts().addAll((Collection<? extends EndProduct>)newValue);
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
			case CptPackage.UNSORTED_PRODUCT__END_PRODUCTS:
				getEndProducts().clear();
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
			case CptPackage.UNSORTED_PRODUCT__END_PRODUCTS:
				return endProducts != null && !endProducts.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //UnsortedProductImpl
