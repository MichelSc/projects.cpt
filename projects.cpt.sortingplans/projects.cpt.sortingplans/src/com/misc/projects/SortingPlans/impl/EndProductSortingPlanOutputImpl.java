/**
 */
package com.misc.projects.SortingPlans.impl;

import com.misc.projects.SortingPlans.EndProductInProduct;
import com.misc.projects.SortingPlans.EndProductSortingPlan;
import com.misc.projects.SortingPlans.EndProductSortingPlanOutput;
import com.misc.projects.SortingPlans.SortingPlanOutput;
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
 * An implementation of the model object '<em><b>End Product Sorting Plan Output</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.projects.SortingPlans.impl.EndProductSortingPlanOutputImpl#getSortingPlan <em>Sorting Plan</em>}</li>
 *   <li>{@link com.misc.projects.SortingPlans.impl.EndProductSortingPlanOutputImpl#getOutputProduct <em>Output Product</em>}</li>
 *   <li>{@link com.misc.projects.SortingPlans.impl.EndProductSortingPlanOutputImpl#getSortingPlanOutput <em>Sorting Plan Output</em>}</li>
 *   <li>{@link com.misc.projects.SortingPlans.impl.EndProductSortingPlanOutputImpl#isSelected <em>Selected</em>}</li>
 *   <li>{@link com.misc.projects.SortingPlans.impl.EndProductSortingPlanOutputImpl#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EndProductSortingPlanOutputImpl extends MinimalEObjectImpl.Container implements EndProductSortingPlanOutput {
	/**
	 * The cached value of the '{@link #getOutputProduct() <em>Output Product</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputProduct()
	 * @generated
	 * @ordered
	 */
	protected EndProductInProduct outputProduct;

	/**
	 * The cached value of the '{@link #getSortingPlanOutput() <em>Sorting Plan Output</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSortingPlanOutput()
	 * @generated
	 * @ordered
	 */
	protected SortingPlanOutput sortingPlanOutput;

	/**
	 * The default value of the '{@link #isSelected() <em>Selected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSelected()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SELECTED_EDEFAULT = false;

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
	protected EndProductSortingPlanOutputImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return cptspPackage.Literals.END_PRODUCT_SORTING_PLAN_OUTPUT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EndProductSortingPlan getSortingPlan() {
		if (eContainerFeatureID() != cptspPackage.END_PRODUCT_SORTING_PLAN_OUTPUT__SORTING_PLAN) return null;
		return (EndProductSortingPlan)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSortingPlan(EndProductSortingPlan newSortingPlan, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newSortingPlan, cptspPackage.END_PRODUCT_SORTING_PLAN_OUTPUT__SORTING_PLAN, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSortingPlan(EndProductSortingPlan newSortingPlan) {
		if (newSortingPlan != eInternalContainer() || (eContainerFeatureID() != cptspPackage.END_PRODUCT_SORTING_PLAN_OUTPUT__SORTING_PLAN && newSortingPlan != null)) {
			if (EcoreUtil.isAncestor(this, newSortingPlan))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newSortingPlan != null)
				msgs = ((InternalEObject)newSortingPlan).eInverseAdd(this, cptspPackage.END_PRODUCT_SORTING_PLAN__OUTPUTS, EndProductSortingPlan.class, msgs);
			msgs = basicSetSortingPlan(newSortingPlan, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, cptspPackage.END_PRODUCT_SORTING_PLAN_OUTPUT__SORTING_PLAN, newSortingPlan, newSortingPlan));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EndProductInProduct getOutputProduct() {
		if (outputProduct != null && outputProduct.eIsProxy()) {
			InternalEObject oldOutputProduct = (InternalEObject)outputProduct;
			outputProduct = (EndProductInProduct)eResolveProxy(oldOutputProduct);
			if (outputProduct != oldOutputProduct) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, cptspPackage.END_PRODUCT_SORTING_PLAN_OUTPUT__OUTPUT_PRODUCT, oldOutputProduct, outputProduct));
			}
		}
		return outputProduct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EndProductInProduct basicGetOutputProduct() {
		return outputProduct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOutputProduct(EndProductInProduct newOutputProduct, NotificationChain msgs) {
		EndProductInProduct oldOutputProduct = outputProduct;
		outputProduct = newOutputProduct;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, cptspPackage.END_PRODUCT_SORTING_PLAN_OUTPUT__OUTPUT_PRODUCT, oldOutputProduct, newOutputProduct);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutputProduct(EndProductInProduct newOutputProduct) {
		if (newOutputProduct != outputProduct) {
			NotificationChain msgs = null;
			if (outputProduct != null)
				msgs = ((InternalEObject)outputProduct).eInverseRemove(this, cptspPackage.END_PRODUCT_IN_PRODUCT__SORTING_PLANS_PRODUCING, EndProductInProduct.class, msgs);
			if (newOutputProduct != null)
				msgs = ((InternalEObject)newOutputProduct).eInverseAdd(this, cptspPackage.END_PRODUCT_IN_PRODUCT__SORTING_PLANS_PRODUCING, EndProductInProduct.class, msgs);
			msgs = basicSetOutputProduct(newOutputProduct, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, cptspPackage.END_PRODUCT_SORTING_PLAN_OUTPUT__OUTPUT_PRODUCT, newOutputProduct, newOutputProduct));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SortingPlanOutput getSortingPlanOutput() {
		if (sortingPlanOutput != null && sortingPlanOutput.eIsProxy()) {
			InternalEObject oldSortingPlanOutput = (InternalEObject)sortingPlanOutput;
			sortingPlanOutput = (SortingPlanOutput)eResolveProxy(oldSortingPlanOutput);
			if (sortingPlanOutput != oldSortingPlanOutput) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, cptspPackage.END_PRODUCT_SORTING_PLAN_OUTPUT__SORTING_PLAN_OUTPUT, oldSortingPlanOutput, sortingPlanOutput));
			}
		}
		return sortingPlanOutput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SortingPlanOutput basicGetSortingPlanOutput() {
		return sortingPlanOutput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSortingPlanOutput(SortingPlanOutput newSortingPlanOutput) {
		SortingPlanOutput oldSortingPlanOutput = sortingPlanOutput;
		sortingPlanOutput = newSortingPlanOutput;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, cptspPackage.END_PRODUCT_SORTING_PLAN_OUTPUT__SORTING_PLAN_OUTPUT, oldSortingPlanOutput, sortingPlanOutput));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public boolean isSelected() {
		EndProductSortingPlan sp = this.getSortingPlan();
		boolean isSelected = this==sp.getSelectedOutput();
		return isSelected;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public String getDescription() {
		SortingPlanOutput output = this.getSortingPlanOutput();
		String description = output.getDescription();
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
			case cptspPackage.END_PRODUCT_SORTING_PLAN_OUTPUT__SORTING_PLAN:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetSortingPlan((EndProductSortingPlan)otherEnd, msgs);
			case cptspPackage.END_PRODUCT_SORTING_PLAN_OUTPUT__OUTPUT_PRODUCT:
				if (outputProduct != null)
					msgs = ((InternalEObject)outputProduct).eInverseRemove(this, cptspPackage.END_PRODUCT_IN_PRODUCT__SORTING_PLANS_PRODUCING, EndProductInProduct.class, msgs);
				return basicSetOutputProduct((EndProductInProduct)otherEnd, msgs);
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
			case cptspPackage.END_PRODUCT_SORTING_PLAN_OUTPUT__SORTING_PLAN:
				return basicSetSortingPlan(null, msgs);
			case cptspPackage.END_PRODUCT_SORTING_PLAN_OUTPUT__OUTPUT_PRODUCT:
				return basicSetOutputProduct(null, msgs);
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
			case cptspPackage.END_PRODUCT_SORTING_PLAN_OUTPUT__SORTING_PLAN:
				return eInternalContainer().eInverseRemove(this, cptspPackage.END_PRODUCT_SORTING_PLAN__OUTPUTS, EndProductSortingPlan.class, msgs);
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
			case cptspPackage.END_PRODUCT_SORTING_PLAN_OUTPUT__SORTING_PLAN:
				return getSortingPlan();
			case cptspPackage.END_PRODUCT_SORTING_PLAN_OUTPUT__OUTPUT_PRODUCT:
				if (resolve) return getOutputProduct();
				return basicGetOutputProduct();
			case cptspPackage.END_PRODUCT_SORTING_PLAN_OUTPUT__SORTING_PLAN_OUTPUT:
				if (resolve) return getSortingPlanOutput();
				return basicGetSortingPlanOutput();
			case cptspPackage.END_PRODUCT_SORTING_PLAN_OUTPUT__SELECTED:
				return isSelected();
			case cptspPackage.END_PRODUCT_SORTING_PLAN_OUTPUT__DESCRIPTION:
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
			case cptspPackage.END_PRODUCT_SORTING_PLAN_OUTPUT__SORTING_PLAN:
				setSortingPlan((EndProductSortingPlan)newValue);
				return;
			case cptspPackage.END_PRODUCT_SORTING_PLAN_OUTPUT__OUTPUT_PRODUCT:
				setOutputProduct((EndProductInProduct)newValue);
				return;
			case cptspPackage.END_PRODUCT_SORTING_PLAN_OUTPUT__SORTING_PLAN_OUTPUT:
				setSortingPlanOutput((SortingPlanOutput)newValue);
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
			case cptspPackage.END_PRODUCT_SORTING_PLAN_OUTPUT__SORTING_PLAN:
				setSortingPlan((EndProductSortingPlan)null);
				return;
			case cptspPackage.END_PRODUCT_SORTING_PLAN_OUTPUT__OUTPUT_PRODUCT:
				setOutputProduct((EndProductInProduct)null);
				return;
			case cptspPackage.END_PRODUCT_SORTING_PLAN_OUTPUT__SORTING_PLAN_OUTPUT:
				setSortingPlanOutput((SortingPlanOutput)null);
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
			case cptspPackage.END_PRODUCT_SORTING_PLAN_OUTPUT__SORTING_PLAN:
				return getSortingPlan() != null;
			case cptspPackage.END_PRODUCT_SORTING_PLAN_OUTPUT__OUTPUT_PRODUCT:
				return outputProduct != null;
			case cptspPackage.END_PRODUCT_SORTING_PLAN_OUTPUT__SORTING_PLAN_OUTPUT:
				return sortingPlanOutput != null;
			case cptspPackage.END_PRODUCT_SORTING_PLAN_OUTPUT__SELECTED:
				return isSelected() != SELECTED_EDEFAULT;
			case cptspPackage.END_PRODUCT_SORTING_PLAN_OUTPUT__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? getDescription() != null : !DESCRIPTION_EDEFAULT.equals(getDescription());
		}
		return super.eIsSet(featureID);
	}

} //EndProductSortingPlanOutputImpl
