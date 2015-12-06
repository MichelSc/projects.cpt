/**
 */
package com.misc.projects.SortingPlans.impl;

import com.misc.projects.SortingPlans.EndProduct;
import com.misc.projects.SortingPlans.EndProductInProduct;
import com.misc.projects.SortingPlans.EndProductSortingPlanInput;
import com.misc.projects.SortingPlans.EndProductSortingPlanOutput;
import com.misc.projects.SortingPlans.SortingPath;
import com.misc.projects.SortingPlans.SortingPlanProduct;
import com.misc.projects.SortingPlans.cptspPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>End Product In Product</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.projects.SortingPlans.impl.EndProductInProductImpl#getEndProductsContained <em>End Products Contained</em>}</li>
 *   <li>{@link com.misc.projects.SortingPlans.impl.EndProductInProductImpl#getSortingPlansProducing <em>Sorting Plans Producing</em>}</li>
 *   <li>{@link com.misc.projects.SortingPlans.impl.EndProductInProductImpl#getSortingPlansAccepting <em>Sorting Plans Accepting</em>}</li>
 *   <li>{@link com.misc.projects.SortingPlans.impl.EndProductInProductImpl#getProduct <em>Product</em>}</li>
 *   <li>{@link com.misc.projects.SortingPlans.impl.EndProductInProductImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link com.misc.projects.SortingPlans.impl.EndProductInProductImpl#isSorted <em>Sorted</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EndProductInProductImpl extends MinimalEObjectImpl.Container implements EndProductInProduct {
	/**
	 * The cached value of the '{@link #getSortingPlansProducing() <em>Sorting Plans Producing</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSortingPlansProducing()
	 * @generated
	 * @ordered
	 */
	protected EList<EndProductSortingPlanOutput> sortingPlansProducing;

	/**
	 * The cached value of the '{@link #getSortingPlansAccepting() <em>Sorting Plans Accepting</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSortingPlansAccepting()
	 * @generated
	 * @ordered
	 */
	protected EList<EndProductSortingPlanInput> sortingPlansAccepting;

	/**
	 * The cached value of the '{@link #getProduct() <em>Product</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProduct()
	 * @generated
	 * @ordered
	 */
	protected SortingPlanProduct product;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The default value of the '{@link #isSorted() <em>Sorted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSorted()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SORTED_EDEFAULT = false;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EndProductInProductImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return cptspPackage.Literals.END_PRODUCT_IN_PRODUCT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EndProduct getEndProductsContained() {
		if (eContainerFeatureID() != cptspPackage.END_PRODUCT_IN_PRODUCT__END_PRODUCTS_CONTAINED) return null;
		return (EndProduct)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEndProductsContained(EndProduct newEndProductsContained, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newEndProductsContained, cptspPackage.END_PRODUCT_IN_PRODUCT__END_PRODUCTS_CONTAINED, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndProductsContained(EndProduct newEndProductsContained) {
		if (newEndProductsContained != eInternalContainer() || (eContainerFeatureID() != cptspPackage.END_PRODUCT_IN_PRODUCT__END_PRODUCTS_CONTAINED && newEndProductsContained != null)) {
			if (EcoreUtil.isAncestor(this, newEndProductsContained))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newEndProductsContained != null)
				msgs = ((InternalEObject)newEndProductsContained).eInverseAdd(this, cptspPackage.END_PRODUCT__PRODUCTS_CONTAINING, EndProduct.class, msgs);
			msgs = basicSetEndProductsContained(newEndProductsContained, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, cptspPackage.END_PRODUCT_IN_PRODUCT__END_PRODUCTS_CONTAINED, newEndProductsContained, newEndProductsContained));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EndProductSortingPlanOutput> getSortingPlansProducing() {
		if (sortingPlansProducing == null) {
			sortingPlansProducing = new EObjectWithInverseResolvingEList<EndProductSortingPlanOutput>(EndProductSortingPlanOutput.class, this, cptspPackage.END_PRODUCT_IN_PRODUCT__SORTING_PLANS_PRODUCING, cptspPackage.END_PRODUCT_SORTING_PLAN_OUTPUT__OUTPUT_PRODUCT);
		}
		return sortingPlansProducing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EndProductSortingPlanInput> getSortingPlansAccepting() {
		if (sortingPlansAccepting == null) {
			sortingPlansAccepting = new EObjectWithInverseResolvingEList<EndProductSortingPlanInput>(EndProductSortingPlanInput.class, this, cptspPackage.END_PRODUCT_IN_PRODUCT__SORTING_PLANS_ACCEPTING, cptspPackage.END_PRODUCT_SORTING_PLAN_INPUT__INPUT_PRODUCT);
		}
		return sortingPlansAccepting;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SortingPlanProduct getProduct() {
		if (product != null && product.eIsProxy()) {
			InternalEObject oldProduct = (InternalEObject)product;
			product = (SortingPlanProduct)eResolveProxy(oldProduct);
			if (product != oldProduct) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, cptspPackage.END_PRODUCT_IN_PRODUCT__PRODUCT, oldProduct, product));
			}
		}
		return product;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SortingPlanProduct basicGetProduct() {
		return product;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProduct(SortingPlanProduct newProduct, NotificationChain msgs) {
		SortingPlanProduct oldProduct = product;
		product = newProduct;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, cptspPackage.END_PRODUCT_IN_PRODUCT__PRODUCT, oldProduct, newProduct);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProduct(SortingPlanProduct newProduct) {
		if (newProduct != product) {
			NotificationChain msgs = null;
			if (product != null)
				msgs = ((InternalEObject)product).eInverseRemove(this, cptspPackage.SORTING_PLAN_PRODUCT__END_PRODUCTS, SortingPlanProduct.class, msgs);
			if (newProduct != null)
				msgs = ((InternalEObject)newProduct).eInverseAdd(this, cptspPackage.SORTING_PLAN_PRODUCT__END_PRODUCTS, SortingPlanProduct.class, msgs);
			msgs = basicSetProduct(newProduct, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, cptspPackage.END_PRODUCT_IN_PRODUCT__PRODUCT, newProduct, newProduct));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public String getDescription() {
		SortingPlanProduct product = this.getProduct();
		String description = product.getDescription();
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public boolean isSorted() {
		EndProduct endProductContained = this.getEndProductsContained();
		SortingPlanProduct productContaining = this.getProduct(); 
		for ( SortingPath path : productContaining.getSortingPaths()){
			if ( path.getSortedEndProducts().contains(endProductContained)){
				return true;
			}
		} // traverse the paths
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case cptspPackage.END_PRODUCT_IN_PRODUCT__END_PRODUCTS_CONTAINED:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetEndProductsContained((EndProduct)otherEnd, msgs);
			case cptspPackage.END_PRODUCT_IN_PRODUCT__SORTING_PLANS_PRODUCING:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSortingPlansProducing()).basicAdd(otherEnd, msgs);
			case cptspPackage.END_PRODUCT_IN_PRODUCT__SORTING_PLANS_ACCEPTING:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSortingPlansAccepting()).basicAdd(otherEnd, msgs);
			case cptspPackage.END_PRODUCT_IN_PRODUCT__PRODUCT:
				if (product != null)
					msgs = ((InternalEObject)product).eInverseRemove(this, cptspPackage.SORTING_PLAN_PRODUCT__END_PRODUCTS, SortingPlanProduct.class, msgs);
				return basicSetProduct((SortingPlanProduct)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case cptspPackage.END_PRODUCT_IN_PRODUCT__END_PRODUCTS_CONTAINED:
				return basicSetEndProductsContained(null, msgs);
			case cptspPackage.END_PRODUCT_IN_PRODUCT__SORTING_PLANS_PRODUCING:
				return ((InternalEList<?>)getSortingPlansProducing()).basicRemove(otherEnd, msgs);
			case cptspPackage.END_PRODUCT_IN_PRODUCT__SORTING_PLANS_ACCEPTING:
				return ((InternalEList<?>)getSortingPlansAccepting()).basicRemove(otherEnd, msgs);
			case cptspPackage.END_PRODUCT_IN_PRODUCT__PRODUCT:
				return basicSetProduct(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case cptspPackage.END_PRODUCT_IN_PRODUCT__END_PRODUCTS_CONTAINED:
				return eInternalContainer().eInverseRemove(this, cptspPackage.END_PRODUCT__PRODUCTS_CONTAINING, EndProduct.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case cptspPackage.END_PRODUCT_IN_PRODUCT__END_PRODUCTS_CONTAINED:
				return getEndProductsContained();
			case cptspPackage.END_PRODUCT_IN_PRODUCT__SORTING_PLANS_PRODUCING:
				return getSortingPlansProducing();
			case cptspPackage.END_PRODUCT_IN_PRODUCT__SORTING_PLANS_ACCEPTING:
				return getSortingPlansAccepting();
			case cptspPackage.END_PRODUCT_IN_PRODUCT__PRODUCT:
				if (resolve) return getProduct();
				return basicGetProduct();
			case cptspPackage.END_PRODUCT_IN_PRODUCT__DESCRIPTION:
				return getDescription();
			case cptspPackage.END_PRODUCT_IN_PRODUCT__SORTED:
				return isSorted();
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
			case cptspPackage.END_PRODUCT_IN_PRODUCT__END_PRODUCTS_CONTAINED:
				setEndProductsContained((EndProduct)newValue);
				return;
			case cptspPackage.END_PRODUCT_IN_PRODUCT__SORTING_PLANS_PRODUCING:
				getSortingPlansProducing().clear();
				getSortingPlansProducing().addAll((Collection<? extends EndProductSortingPlanOutput>)newValue);
				return;
			case cptspPackage.END_PRODUCT_IN_PRODUCT__SORTING_PLANS_ACCEPTING:
				getSortingPlansAccepting().clear();
				getSortingPlansAccepting().addAll((Collection<? extends EndProductSortingPlanInput>)newValue);
				return;
			case cptspPackage.END_PRODUCT_IN_PRODUCT__PRODUCT:
				setProduct((SortingPlanProduct)newValue);
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
			case cptspPackage.END_PRODUCT_IN_PRODUCT__END_PRODUCTS_CONTAINED:
				setEndProductsContained((EndProduct)null);
				return;
			case cptspPackage.END_PRODUCT_IN_PRODUCT__SORTING_PLANS_PRODUCING:
				getSortingPlansProducing().clear();
				return;
			case cptspPackage.END_PRODUCT_IN_PRODUCT__SORTING_PLANS_ACCEPTING:
				getSortingPlansAccepting().clear();
				return;
			case cptspPackage.END_PRODUCT_IN_PRODUCT__PRODUCT:
				setProduct((SortingPlanProduct)null);
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
			case cptspPackage.END_PRODUCT_IN_PRODUCT__END_PRODUCTS_CONTAINED:
				return getEndProductsContained() != null;
			case cptspPackage.END_PRODUCT_IN_PRODUCT__SORTING_PLANS_PRODUCING:
				return sortingPlansProducing != null && !sortingPlansProducing.isEmpty();
			case cptspPackage.END_PRODUCT_IN_PRODUCT__SORTING_PLANS_ACCEPTING:
				return sortingPlansAccepting != null && !sortingPlansAccepting.isEmpty();
			case cptspPackage.END_PRODUCT_IN_PRODUCT__PRODUCT:
				return product != null;
			case cptspPackage.END_PRODUCT_IN_PRODUCT__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? getDescription() != null : !DESCRIPTION_EDEFAULT.equals(getDescription());
			case cptspPackage.END_PRODUCT_IN_PRODUCT__SORTED:
				return isSorted() != SORTED_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

} //EndProductInProductImpl
