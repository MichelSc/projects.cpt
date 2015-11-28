/**
 */
package com.misc.projects.SortingPlans.impl;

import com.misc.projects.SortingPlans.EndProductInProduct;
import com.misc.projects.SortingPlans.EndProductSortingPlan;
import com.misc.projects.SortingPlans.EndProductSortingPlanInput;
import com.misc.projects.SortingPlans.SortingPlanInput;
import com.misc.projects.SortingPlans.cptspPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>End Product Sorting Plan Input</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.projects.SortingPlans.impl.EndProductSortingPlanInputImpl#getSortingPlan <em>Sorting Plan</em>}</li>
 *   <li>{@link com.misc.projects.SortingPlans.impl.EndProductSortingPlanInputImpl#getInputProduct <em>Input Product</em>}</li>
 *   <li>{@link com.misc.projects.SortingPlans.impl.EndProductSortingPlanInputImpl#getSortingPlanInput <em>Sorting Plan Input</em>}</li>
 *   <li>{@link com.misc.projects.SortingPlans.impl.EndProductSortingPlanInputImpl#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EndProductSortingPlanInputImpl extends MinimalEObjectImpl.Container implements EndProductSortingPlanInput {
	/**
	 * The cached value of the '{@link #getInputProduct() <em>Input Product</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputProduct()
	 * @generated
	 * @ordered
	 */
	protected EndProductInProduct inputProduct;

	/**
	 * The cached value of the '{@link #getSortingPlanInput() <em>Sorting Plan Input</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSortingPlanInput()
	 * @generated
	 * @ordered
	 */
	protected SortingPlanInput sortingPlanInput;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EndProductSortingPlanInputImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return cptspPackage.Literals.END_PRODUCT_SORTING_PLAN_INPUT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EndProductSortingPlan getSortingPlan() {
		if (eContainerFeatureID() != cptspPackage.END_PRODUCT_SORTING_PLAN_INPUT__SORTING_PLAN) return null;
		return (EndProductSortingPlan)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSortingPlan(EndProductSortingPlan newSortingPlan, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newSortingPlan, cptspPackage.END_PRODUCT_SORTING_PLAN_INPUT__SORTING_PLAN, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSortingPlan(EndProductSortingPlan newSortingPlan) {
		if (newSortingPlan != eInternalContainer() || (eContainerFeatureID() != cptspPackage.END_PRODUCT_SORTING_PLAN_INPUT__SORTING_PLAN && newSortingPlan != null)) {
			if (EcoreUtil.isAncestor(this, newSortingPlan))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newSortingPlan != null)
				msgs = ((InternalEObject)newSortingPlan).eInverseAdd(this, cptspPackage.END_PRODUCT_SORTING_PLAN__INPUTS, EndProductSortingPlan.class, msgs);
			msgs = basicSetSortingPlan(newSortingPlan, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, cptspPackage.END_PRODUCT_SORTING_PLAN_INPUT__SORTING_PLAN, newSortingPlan, newSortingPlan));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EndProductInProduct getInputProduct() {
		if (inputProduct != null && inputProduct.eIsProxy()) {
			InternalEObject oldInputProduct = (InternalEObject)inputProduct;
			inputProduct = (EndProductInProduct)eResolveProxy(oldInputProduct);
			if (inputProduct != oldInputProduct) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, cptspPackage.END_PRODUCT_SORTING_PLAN_INPUT__INPUT_PRODUCT, oldInputProduct, inputProduct));
			}
		}
		return inputProduct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EndProductInProduct basicGetInputProduct() {
		return inputProduct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInputProduct(EndProductInProduct newInputProduct, NotificationChain msgs) {
		EndProductInProduct oldInputProduct = inputProduct;
		inputProduct = newInputProduct;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, cptspPackage.END_PRODUCT_SORTING_PLAN_INPUT__INPUT_PRODUCT, oldInputProduct, newInputProduct);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInputProduct(EndProductInProduct newInputProduct) {
		if (newInputProduct != inputProduct) {
			NotificationChain msgs = null;
			if (inputProduct != null)
				msgs = ((InternalEObject)inputProduct).eInverseRemove(this, cptspPackage.END_PRODUCT_IN_PRODUCT__SORTING_PLANS_ACCEPTING, EndProductInProduct.class, msgs);
			if (newInputProduct != null)
				msgs = ((InternalEObject)newInputProduct).eInverseAdd(this, cptspPackage.END_PRODUCT_IN_PRODUCT__SORTING_PLANS_ACCEPTING, EndProductInProduct.class, msgs);
			msgs = basicSetInputProduct(newInputProduct, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, cptspPackage.END_PRODUCT_SORTING_PLAN_INPUT__INPUT_PRODUCT, newInputProduct, newInputProduct));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SortingPlanInput getSortingPlanInput() {
		if (sortingPlanInput != null && sortingPlanInput.eIsProxy()) {
			InternalEObject oldSortingPlanInput = (InternalEObject)sortingPlanInput;
			sortingPlanInput = (SortingPlanInput)eResolveProxy(oldSortingPlanInput);
			if (sortingPlanInput != oldSortingPlanInput) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, cptspPackage.END_PRODUCT_SORTING_PLAN_INPUT__SORTING_PLAN_INPUT, oldSortingPlanInput, sortingPlanInput));
			}
		}
		return sortingPlanInput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SortingPlanInput basicGetSortingPlanInput() {
		return sortingPlanInput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSortingPlanInput(SortingPlanInput newSortingPlanInput) {
		SortingPlanInput oldSortingPlanInput = sortingPlanInput;
		sortingPlanInput = newSortingPlanInput;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, cptspPackage.END_PRODUCT_SORTING_PLAN_INPUT__SORTING_PLAN_INPUT, oldSortingPlanInput, sortingPlanInput));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public String getDescription() {
		SortingPlanInput input = this.getSortingPlanInput();
		String description = input.getDescription();
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case cptspPackage.END_PRODUCT_SORTING_PLAN_INPUT__SORTING_PLAN:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetSortingPlan((EndProductSortingPlan)otherEnd, msgs);
			case cptspPackage.END_PRODUCT_SORTING_PLAN_INPUT__INPUT_PRODUCT:
				if (inputProduct != null)
					msgs = ((InternalEObject)inputProduct).eInverseRemove(this, cptspPackage.END_PRODUCT_IN_PRODUCT__SORTING_PLANS_ACCEPTING, EndProductInProduct.class, msgs);
				return basicSetInputProduct((EndProductInProduct)otherEnd, msgs);
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
			case cptspPackage.END_PRODUCT_SORTING_PLAN_INPUT__SORTING_PLAN:
				return basicSetSortingPlan(null, msgs);
			case cptspPackage.END_PRODUCT_SORTING_PLAN_INPUT__INPUT_PRODUCT:
				return basicSetInputProduct(null, msgs);
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
			case cptspPackage.END_PRODUCT_SORTING_PLAN_INPUT__SORTING_PLAN:
				return eInternalContainer().eInverseRemove(this, cptspPackage.END_PRODUCT_SORTING_PLAN__INPUTS, EndProductSortingPlan.class, msgs);
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
			case cptspPackage.END_PRODUCT_SORTING_PLAN_INPUT__SORTING_PLAN:
				return getSortingPlan();
			case cptspPackage.END_PRODUCT_SORTING_PLAN_INPUT__INPUT_PRODUCT:
				if (resolve) return getInputProduct();
				return basicGetInputProduct();
			case cptspPackage.END_PRODUCT_SORTING_PLAN_INPUT__SORTING_PLAN_INPUT:
				if (resolve) return getSortingPlanInput();
				return basicGetSortingPlanInput();
			case cptspPackage.END_PRODUCT_SORTING_PLAN_INPUT__DESCRIPTION:
				return getDescription();
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
			case cptspPackage.END_PRODUCT_SORTING_PLAN_INPUT__SORTING_PLAN:
				setSortingPlan((EndProductSortingPlan)newValue);
				return;
			case cptspPackage.END_PRODUCT_SORTING_PLAN_INPUT__INPUT_PRODUCT:
				setInputProduct((EndProductInProduct)newValue);
				return;
			case cptspPackage.END_PRODUCT_SORTING_PLAN_INPUT__SORTING_PLAN_INPUT:
				setSortingPlanInput((SortingPlanInput)newValue);
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
			case cptspPackage.END_PRODUCT_SORTING_PLAN_INPUT__SORTING_PLAN:
				setSortingPlan((EndProductSortingPlan)null);
				return;
			case cptspPackage.END_PRODUCT_SORTING_PLAN_INPUT__INPUT_PRODUCT:
				setInputProduct((EndProductInProduct)null);
				return;
			case cptspPackage.END_PRODUCT_SORTING_PLAN_INPUT__SORTING_PLAN_INPUT:
				setSortingPlanInput((SortingPlanInput)null);
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
			case cptspPackage.END_PRODUCT_SORTING_PLAN_INPUT__SORTING_PLAN:
				return getSortingPlan() != null;
			case cptspPackage.END_PRODUCT_SORTING_PLAN_INPUT__INPUT_PRODUCT:
				return inputProduct != null;
			case cptspPackage.END_PRODUCT_SORTING_PLAN_INPUT__SORTING_PLAN_INPUT:
				return sortingPlanInput != null;
			case cptspPackage.END_PRODUCT_SORTING_PLAN_INPUT__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? getDescription() != null : !DESCRIPTION_EDEFAULT.equals(getDescription());
		}
		return super.eIsSet(featureID);
	}

} //EndProductSortingPlanInputImpl
