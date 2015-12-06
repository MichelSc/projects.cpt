/**
 */
package com.misc.projects.SortingPlans.impl;

import com.misc.projects.SortingPlans.EndProduct;
import com.misc.projects.SortingPlans.EndProductSortingPlan;
import com.misc.projects.SortingPlans.EndProductSortingPlanInput;
import com.misc.projects.SortingPlans.EndProductSortingPlanOutput;
import com.misc.projects.SortingPlans.SortingPlan;
import com.misc.projects.SortingPlans.cptspPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>End Product Sorting Plan</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.projects.SortingPlans.impl.EndProductSortingPlanImpl#getEndProduct <em>End Product</em>}</li>
 *   <li>{@link com.misc.projects.SortingPlans.impl.EndProductSortingPlanImpl#getSortingPlan <em>Sorting Plan</em>}</li>
 *   <li>{@link com.misc.projects.SortingPlans.impl.EndProductSortingPlanImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link com.misc.projects.SortingPlans.impl.EndProductSortingPlanImpl#getOutputs <em>Outputs</em>}</li>
 *   <li>{@link com.misc.projects.SortingPlans.impl.EndProductSortingPlanImpl#getInputs <em>Inputs</em>}</li>
 *   <li>{@link com.misc.projects.SortingPlans.impl.EndProductSortingPlanImpl#getSelectedOutput <em>Selected Output</em>}</li>
 *   <li>{@link com.misc.projects.SortingPlans.impl.EndProductSortingPlanImpl#getSortingDistance <em>Sorting Distance</em>}</li>
 *   <li>{@link com.misc.projects.SortingPlans.impl.EndProductSortingPlanImpl#isSorted <em>Sorted</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EndProductSortingPlanImpl extends MinimalEObjectImpl.Container implements EndProductSortingPlan {
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
	 * The cached value of the '{@link #getOutputs() <em>Outputs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputs()
	 * @generated
	 * @ordered
	 */
	protected EList<EndProductSortingPlanOutput> outputs;

	/**
	 * The cached value of the '{@link #getInputs() <em>Inputs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputs()
	 * @generated
	 * @ordered
	 */
	protected EList<EndProductSortingPlanInput> inputs;

	/**
	 * The cached value of the '{@link #getSelectedOutput() <em>Selected Output</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelectedOutput()
	 * @generated
	 * @ordered
	 */
	protected EndProductSortingPlanOutput selectedOutput;

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
	protected EndProductSortingPlanImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return cptspPackage.Literals.END_PRODUCT_SORTING_PLAN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EndProduct getEndProduct() {
		if (eContainerFeatureID() != cptspPackage.END_PRODUCT_SORTING_PLAN__END_PRODUCT) return null;
		return (EndProduct)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEndProduct(EndProduct newEndProduct, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newEndProduct, cptspPackage.END_PRODUCT_SORTING_PLAN__END_PRODUCT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndProduct(EndProduct newEndProduct) {
		if (newEndProduct != eInternalContainer() || (eContainerFeatureID() != cptspPackage.END_PRODUCT_SORTING_PLAN__END_PRODUCT && newEndProduct != null)) {
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
			eNotify(new ENotificationImpl(this, Notification.SET, cptspPackage.END_PRODUCT_SORTING_PLAN__END_PRODUCT, newEndProduct, newEndProduct));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, cptspPackage.END_PRODUCT_SORTING_PLAN__SORTING_PLAN, oldSortingPlan, sortingPlan));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, cptspPackage.END_PRODUCT_SORTING_PLAN__SORTING_PLAN, oldSortingPlan, newSortingPlan);
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
			eNotify(new ENotificationImpl(this, Notification.SET, cptspPackage.END_PRODUCT_SORTING_PLAN__SORTING_PLAN, newSortingPlan, newSortingPlan));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public String getDescription() {
		SortingPlan sortingPlan = this.getSortingPlan();
		String description = sortingPlan.getDescription();
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EndProductSortingPlanOutput> getOutputs() {
		if (outputs == null) {
			outputs = new EObjectContainmentWithInverseEList<EndProductSortingPlanOutput>(EndProductSortingPlanOutput.class, this, cptspPackage.END_PRODUCT_SORTING_PLAN__OUTPUTS, cptspPackage.END_PRODUCT_SORTING_PLAN_OUTPUT__SORTING_PLAN);
		}
		return outputs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EndProductSortingPlanInput> getInputs() {
		if (inputs == null) {
			inputs = new EObjectContainmentWithInverseEList<EndProductSortingPlanInput>(EndProductSortingPlanInput.class, this, cptspPackage.END_PRODUCT_SORTING_PLAN__INPUTS, cptspPackage.END_PRODUCT_SORTING_PLAN_INPUT__SORTING_PLAN);
		}
		return inputs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EndProductSortingPlanOutput getSelectedOutput() {
		if (selectedOutput != null && selectedOutput.eIsProxy()) {
			InternalEObject oldSelectedOutput = (InternalEObject)selectedOutput;
			selectedOutput = (EndProductSortingPlanOutput)eResolveProxy(oldSelectedOutput);
			if (selectedOutput != oldSelectedOutput) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, cptspPackage.END_PRODUCT_SORTING_PLAN__SELECTED_OUTPUT, oldSelectedOutput, selectedOutput));
			}
		}
		return selectedOutput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EndProductSortingPlanOutput basicGetSelectedOutput() {
		return selectedOutput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSelectedOutput(EndProductSortingPlanOutput newSelectedOutput) {
		EndProductSortingPlanOutput oldSelectedOutput = selectedOutput;
		selectedOutput = newSelectedOutput;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, cptspPackage.END_PRODUCT_SORTING_PLAN__SELECTED_OUTPUT, oldSelectedOutput, selectedOutput));
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
			eNotify(new ENotificationImpl(this, Notification.SET, cptspPackage.END_PRODUCT_SORTING_PLAN__SORTING_DISTANCE, oldSortingDistance, sortingDistance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public boolean isSorted() {
		for (EndProductSortingPlanInput input : this.getInputs()){
			if ( input.getInputProduct().isSorted()){
				return true;
			}
		} // traverse the inputs
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
			case cptspPackage.END_PRODUCT_SORTING_PLAN__END_PRODUCT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetEndProduct((EndProduct)otherEnd, msgs);
			case cptspPackage.END_PRODUCT_SORTING_PLAN__SORTING_PLAN:
				if (sortingPlan != null)
					msgs = ((InternalEObject)sortingPlan).eInverseRemove(this, cptspPackage.SORTING_PLAN__END_PRODUCTS, SortingPlan.class, msgs);
				return basicSetSortingPlan((SortingPlan)otherEnd, msgs);
			case cptspPackage.END_PRODUCT_SORTING_PLAN__OUTPUTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOutputs()).basicAdd(otherEnd, msgs);
			case cptspPackage.END_PRODUCT_SORTING_PLAN__INPUTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getInputs()).basicAdd(otherEnd, msgs);
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
			case cptspPackage.END_PRODUCT_SORTING_PLAN__END_PRODUCT:
				return basicSetEndProduct(null, msgs);
			case cptspPackage.END_PRODUCT_SORTING_PLAN__SORTING_PLAN:
				return basicSetSortingPlan(null, msgs);
			case cptspPackage.END_PRODUCT_SORTING_PLAN__OUTPUTS:
				return ((InternalEList<?>)getOutputs()).basicRemove(otherEnd, msgs);
			case cptspPackage.END_PRODUCT_SORTING_PLAN__INPUTS:
				return ((InternalEList<?>)getInputs()).basicRemove(otherEnd, msgs);
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
			case cptspPackage.END_PRODUCT_SORTING_PLAN__END_PRODUCT:
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
			case cptspPackage.END_PRODUCT_SORTING_PLAN__END_PRODUCT:
				return getEndProduct();
			case cptspPackage.END_PRODUCT_SORTING_PLAN__SORTING_PLAN:
				if (resolve) return getSortingPlan();
				return basicGetSortingPlan();
			case cptspPackage.END_PRODUCT_SORTING_PLAN__DESCRIPTION:
				return getDescription();
			case cptspPackage.END_PRODUCT_SORTING_PLAN__OUTPUTS:
				return getOutputs();
			case cptspPackage.END_PRODUCT_SORTING_PLAN__INPUTS:
				return getInputs();
			case cptspPackage.END_PRODUCT_SORTING_PLAN__SELECTED_OUTPUT:
				if (resolve) return getSelectedOutput();
				return basicGetSelectedOutput();
			case cptspPackage.END_PRODUCT_SORTING_PLAN__SORTING_DISTANCE:
				return getSortingDistance();
			case cptspPackage.END_PRODUCT_SORTING_PLAN__SORTED:
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
			case cptspPackage.END_PRODUCT_SORTING_PLAN__END_PRODUCT:
				setEndProduct((EndProduct)newValue);
				return;
			case cptspPackage.END_PRODUCT_SORTING_PLAN__SORTING_PLAN:
				setSortingPlan((SortingPlan)newValue);
				return;
			case cptspPackage.END_PRODUCT_SORTING_PLAN__OUTPUTS:
				getOutputs().clear();
				getOutputs().addAll((Collection<? extends EndProductSortingPlanOutput>)newValue);
				return;
			case cptspPackage.END_PRODUCT_SORTING_PLAN__INPUTS:
				getInputs().clear();
				getInputs().addAll((Collection<? extends EndProductSortingPlanInput>)newValue);
				return;
			case cptspPackage.END_PRODUCT_SORTING_PLAN__SELECTED_OUTPUT:
				setSelectedOutput((EndProductSortingPlanOutput)newValue);
				return;
			case cptspPackage.END_PRODUCT_SORTING_PLAN__SORTING_DISTANCE:
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
			case cptspPackage.END_PRODUCT_SORTING_PLAN__END_PRODUCT:
				setEndProduct((EndProduct)null);
				return;
			case cptspPackage.END_PRODUCT_SORTING_PLAN__SORTING_PLAN:
				setSortingPlan((SortingPlan)null);
				return;
			case cptspPackage.END_PRODUCT_SORTING_PLAN__OUTPUTS:
				getOutputs().clear();
				return;
			case cptspPackage.END_PRODUCT_SORTING_PLAN__INPUTS:
				getInputs().clear();
				return;
			case cptspPackage.END_PRODUCT_SORTING_PLAN__SELECTED_OUTPUT:
				setSelectedOutput((EndProductSortingPlanOutput)null);
				return;
			case cptspPackage.END_PRODUCT_SORTING_PLAN__SORTING_DISTANCE:
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
			case cptspPackage.END_PRODUCT_SORTING_PLAN__END_PRODUCT:
				return getEndProduct() != null;
			case cptspPackage.END_PRODUCT_SORTING_PLAN__SORTING_PLAN:
				return sortingPlan != null;
			case cptspPackage.END_PRODUCT_SORTING_PLAN__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? getDescription() != null : !DESCRIPTION_EDEFAULT.equals(getDescription());
			case cptspPackage.END_PRODUCT_SORTING_PLAN__OUTPUTS:
				return outputs != null && !outputs.isEmpty();
			case cptspPackage.END_PRODUCT_SORTING_PLAN__INPUTS:
				return inputs != null && !inputs.isEmpty();
			case cptspPackage.END_PRODUCT_SORTING_PLAN__SELECTED_OUTPUT:
				return selectedOutput != null;
			case cptspPackage.END_PRODUCT_SORTING_PLAN__SORTING_DISTANCE:
				return sortingDistance != SORTING_DISTANCE_EDEFAULT;
			case cptspPackage.END_PRODUCT_SORTING_PLAN__SORTED:
				return isSorted() != SORTED_EDEFAULT;
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

} //EndProductSortingPlanImpl
