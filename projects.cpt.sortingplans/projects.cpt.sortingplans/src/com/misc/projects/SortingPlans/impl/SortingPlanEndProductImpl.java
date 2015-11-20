/**
 */
package com.misc.projects.SortingPlans.impl;

import com.misc.projects.SortingPlans.EndProduct;
import com.misc.projects.SortingPlans.SortingPlan;
import com.misc.projects.SortingPlans.SortingPlanEndProduct;
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
 * An implementation of the model object '<em><b>Sorting Plan End Product</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.projects.SortingPlans.impl.SortingPlanEndProductImpl#getOutput <em>Output</em>}</li>
 *   <li>{@link com.misc.projects.SortingPlans.impl.SortingPlanEndProductImpl#getEndProduct <em>End Product</em>}</li>
 *   <li>{@link com.misc.projects.SortingPlans.impl.SortingPlanEndProductImpl#getSortingPlan <em>Sorting Plan</em>}</li>
 *   <li>{@link com.misc.projects.SortingPlans.impl.SortingPlanEndProductImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link com.misc.projects.SortingPlans.impl.SortingPlanEndProductImpl#getSortingDistance <em>Sorting Distance</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SortingPlanEndProductImpl extends MinimalEObjectImpl.Container implements SortingPlanEndProduct {
	/**
	 * The cached value of the '{@link #getOutput() <em>Output</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput()
	 * @generated
	 * @ordered
	 */
	protected SortingPlanOutput output;

	/**
	 * The cached value of the '{@link #getSortingPlan() <em>Sorting Plan</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSortingPlan()
	 * @generated
	 * @ordered
	 */
	protected SortingPlan sortingPlan;

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
	 * The default value of the '{@link #getSortingDistance() <em>Sorting Distance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSortingDistance()
	 * @generated
	 * @ordered
	 */
	protected static final int SORTING_DISTANCE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSortingDistance() <em>Sorting Distance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSortingDistance()
	 * @generated
	 * @ordered
	 */
	protected int sortingDistance = SORTING_DISTANCE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SortingPlanEndProductImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return cptspPackage.Literals.SORTING_PLAN_END_PRODUCT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SortingPlanOutput getOutput() {
		if (output != null && output.eIsProxy()) {
			InternalEObject oldOutput = (InternalEObject)output;
			output = (SortingPlanOutput)eResolveProxy(oldOutput);
			if (output != oldOutput) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, cptspPackage.SORTING_PLAN_END_PRODUCT__OUTPUT, oldOutput, output));
			}
		}
		return output;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SortingPlanOutput basicGetOutput() {
		return output;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOutput(SortingPlanOutput newOutput, NotificationChain msgs) {
		SortingPlanOutput oldOutput = output;
		output = newOutput;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, cptspPackage.SORTING_PLAN_END_PRODUCT__OUTPUT, oldOutput, newOutput);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutput(SortingPlanOutput newOutput) {
		if (newOutput != output) {
			NotificationChain msgs = null;
			if (output != null)
				msgs = ((InternalEObject)output).eInverseRemove(this, cptspPackage.SORTING_PLAN_OUTPUT__SORTING_PLAN_END_PRODUCT, SortingPlanOutput.class, msgs);
			if (newOutput != null)
				msgs = ((InternalEObject)newOutput).eInverseAdd(this, cptspPackage.SORTING_PLAN_OUTPUT__SORTING_PLAN_END_PRODUCT, SortingPlanOutput.class, msgs);
			msgs = basicSetOutput(newOutput, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, cptspPackage.SORTING_PLAN_END_PRODUCT__OUTPUT, newOutput, newOutput));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EndProduct getEndProduct() {
		if (eContainerFeatureID() != cptspPackage.SORTING_PLAN_END_PRODUCT__END_PRODUCT) return null;
		return (EndProduct)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEndProduct(EndProduct newEndProduct, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newEndProduct, cptspPackage.SORTING_PLAN_END_PRODUCT__END_PRODUCT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndProduct(EndProduct newEndProduct) {
		if (newEndProduct != eInternalContainer() || (eContainerFeatureID() != cptspPackage.SORTING_PLAN_END_PRODUCT__END_PRODUCT && newEndProduct != null)) {
			if (EcoreUtil.isAncestor(this, newEndProduct))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newEndProduct != null)
				msgs = ((InternalEObject)newEndProduct).eInverseAdd(this, cptspPackage.END_PRODUCT__SORTING_PLANS, EndProduct.class, msgs);
			msgs = basicSetEndProduct(newEndProduct, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, cptspPackage.SORTING_PLAN_END_PRODUCT__END_PRODUCT, newEndProduct, newEndProduct));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SortingPlan getSortingPlan() {
		if (sortingPlan != null && sortingPlan.eIsProxy()) {
			InternalEObject oldSortingPlan = (InternalEObject)sortingPlan;
			sortingPlan = (SortingPlan)eResolveProxy(oldSortingPlan);
			if (sortingPlan != oldSortingPlan) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, cptspPackage.SORTING_PLAN_END_PRODUCT__SORTING_PLAN, oldSortingPlan, sortingPlan));
			}
		}
		return sortingPlan;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SortingPlan basicGetSortingPlan() {
		return sortingPlan;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSortingPlan(SortingPlan newSortingPlan, NotificationChain msgs) {
		SortingPlan oldSortingPlan = sortingPlan;
		sortingPlan = newSortingPlan;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, cptspPackage.SORTING_PLAN_END_PRODUCT__SORTING_PLAN, oldSortingPlan, newSortingPlan);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSortingPlan(SortingPlan newSortingPlan) {
		if (newSortingPlan != sortingPlan) {
			NotificationChain msgs = null;
			if (sortingPlan != null)
				msgs = ((InternalEObject)sortingPlan).eInverseRemove(this, cptspPackage.SORTING_PLAN__END_PRODUCTS, SortingPlan.class, msgs);
			if (newSortingPlan != null)
				msgs = ((InternalEObject)newSortingPlan).eInverseAdd(this, cptspPackage.SORTING_PLAN__END_PRODUCTS, SortingPlan.class, msgs);
			msgs = basicSetSortingPlan(newSortingPlan, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, cptspPackage.SORTING_PLAN_END_PRODUCT__SORTING_PLAN, newSortingPlan, newSortingPlan));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public String getDescription() {
		String description = this.getEndProduct()==null? "null" : this.getEndProduct().getDescription();
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSortingDistance() {
		return sortingDistance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSortingDistance(int newSortingDistance) {
		int oldSortingDistance = sortingDistance;
		sortingDistance = newSortingDistance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, cptspPackage.SORTING_PLAN_END_PRODUCT__SORTING_DISTANCE, oldSortingDistance, sortingDistance));
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
			case cptspPackage.SORTING_PLAN_END_PRODUCT__OUTPUT:
				if (output != null)
					msgs = ((InternalEObject)output).eInverseRemove(this, cptspPackage.SORTING_PLAN_OUTPUT__SORTING_PLAN_END_PRODUCT, SortingPlanOutput.class, msgs);
				return basicSetOutput((SortingPlanOutput)otherEnd, msgs);
			case cptspPackage.SORTING_PLAN_END_PRODUCT__END_PRODUCT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetEndProduct((EndProduct)otherEnd, msgs);
			case cptspPackage.SORTING_PLAN_END_PRODUCT__SORTING_PLAN:
				if (sortingPlan != null)
					msgs = ((InternalEObject)sortingPlan).eInverseRemove(this, cptspPackage.SORTING_PLAN__END_PRODUCTS, SortingPlan.class, msgs);
				return basicSetSortingPlan((SortingPlan)otherEnd, msgs);
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
			case cptspPackage.SORTING_PLAN_END_PRODUCT__OUTPUT:
				return basicSetOutput(null, msgs);
			case cptspPackage.SORTING_PLAN_END_PRODUCT__END_PRODUCT:
				return basicSetEndProduct(null, msgs);
			case cptspPackage.SORTING_PLAN_END_PRODUCT__SORTING_PLAN:
				return basicSetSortingPlan(null, msgs);
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
			case cptspPackage.SORTING_PLAN_END_PRODUCT__END_PRODUCT:
				return eInternalContainer().eInverseRemove(this, cptspPackage.END_PRODUCT__SORTING_PLANS, EndProduct.class, msgs);
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
			case cptspPackage.SORTING_PLAN_END_PRODUCT__OUTPUT:
				if (resolve) return getOutput();
				return basicGetOutput();
			case cptspPackage.SORTING_PLAN_END_PRODUCT__END_PRODUCT:
				return getEndProduct();
			case cptspPackage.SORTING_PLAN_END_PRODUCT__SORTING_PLAN:
				if (resolve) return getSortingPlan();
				return basicGetSortingPlan();
			case cptspPackage.SORTING_PLAN_END_PRODUCT__DESCRIPTION:
				return getDescription();
			case cptspPackage.SORTING_PLAN_END_PRODUCT__SORTING_DISTANCE:
				return getSortingDistance();
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
			case cptspPackage.SORTING_PLAN_END_PRODUCT__OUTPUT:
				setOutput((SortingPlanOutput)newValue);
				return;
			case cptspPackage.SORTING_PLAN_END_PRODUCT__END_PRODUCT:
				setEndProduct((EndProduct)newValue);
				return;
			case cptspPackage.SORTING_PLAN_END_PRODUCT__SORTING_PLAN:
				setSortingPlan((SortingPlan)newValue);
				return;
			case cptspPackage.SORTING_PLAN_END_PRODUCT__SORTING_DISTANCE:
				setSortingDistance((Integer)newValue);
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
			case cptspPackage.SORTING_PLAN_END_PRODUCT__OUTPUT:
				setOutput((SortingPlanOutput)null);
				return;
			case cptspPackage.SORTING_PLAN_END_PRODUCT__END_PRODUCT:
				setEndProduct((EndProduct)null);
				return;
			case cptspPackage.SORTING_PLAN_END_PRODUCT__SORTING_PLAN:
				setSortingPlan((SortingPlan)null);
				return;
			case cptspPackage.SORTING_PLAN_END_PRODUCT__SORTING_DISTANCE:
				setSortingDistance(SORTING_DISTANCE_EDEFAULT);
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
			case cptspPackage.SORTING_PLAN_END_PRODUCT__OUTPUT:
				return output != null;
			case cptspPackage.SORTING_PLAN_END_PRODUCT__END_PRODUCT:
				return getEndProduct() != null;
			case cptspPackage.SORTING_PLAN_END_PRODUCT__SORTING_PLAN:
				return sortingPlan != null;
			case cptspPackage.SORTING_PLAN_END_PRODUCT__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? getDescription() != null : !DESCRIPTION_EDEFAULT.equals(getDescription());
			case cptspPackage.SORTING_PLAN_END_PRODUCT__SORTING_DISTANCE:
				return sortingDistance != SORTING_DISTANCE_EDEFAULT;
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
		result.append(" (SortingDistance: ");
		result.append(sortingDistance);
		result.append(')');
		return result.toString();
	}

} //SortingPlanEndProductImpl
