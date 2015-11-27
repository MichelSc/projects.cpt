/**
 */
package com.misc.projects.SortingPlans.impl;

import com.misc.common.moplaf.propagator.Util;
import com.misc.projects.CptDatasetLoad.SortingPlanOutputRow;
import com.misc.projects.SortingPlans.SortingPlan;
import com.misc.projects.SortingPlans.SortingPlanOutput;
import com.misc.projects.SortingPlans.SortingPlanProduct;
import com.misc.projects.SortingPlans.cptspPackage;

import java.lang.reflect.InvocationTargetException;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sorting Plan Output</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.projects.SortingPlans.impl.SortingPlanOutputImpl#getFPDSortingPlanOutput <em>FPD Sorting Plan Output</em>}</li>
 *   <li>{@link com.misc.projects.SortingPlans.impl.SortingPlanOutputImpl#getOutputProduct <em>Output Product</em>}</li>
 *   <li>{@link com.misc.projects.SortingPlans.impl.SortingPlanOutputImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link com.misc.projects.SortingPlans.impl.SortingPlanOutputImpl#getSortingPlan <em>Sorting Plan</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SortingPlanOutputImpl extends MinimalEObjectImpl.Container implements SortingPlanOutput {
	
	
	/**
	 * The cached value of the '{@link #getFPDSortingPlanOutput() <em>FPD Sorting Plan Output</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFPDSortingPlanOutput()
	 * @generated
	 * @ordered
	 */
	protected SortingPlanOutputRow fpdSortingPlanOutput;

	/**
	 * The cached value of the '{@link #getOutputProduct() <em>Output Product</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputProduct()
	 * @generated
	 * @ordered
	 */
	protected SortingPlanProduct outputProduct;

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
	protected SortingPlanOutputImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return cptspPackage.Literals.SORTING_PLAN_OUTPUT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SortingPlanOutputRow getFPDSortingPlanOutput() {
		if (fpdSortingPlanOutput != null && fpdSortingPlanOutput.eIsProxy()) {
			InternalEObject oldFPDSortingPlanOutput = (InternalEObject)fpdSortingPlanOutput;
			fpdSortingPlanOutput = (SortingPlanOutputRow)eResolveProxy(oldFPDSortingPlanOutput);
			if (fpdSortingPlanOutput != oldFPDSortingPlanOutput) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, cptspPackage.SORTING_PLAN_OUTPUT__FPD_SORTING_PLAN_OUTPUT, oldFPDSortingPlanOutput, fpdSortingPlanOutput));
			}
		}
		return fpdSortingPlanOutput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SortingPlanOutputRow basicGetFPDSortingPlanOutput() {
		return fpdSortingPlanOutput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFPDSortingPlanOutput(SortingPlanOutputRow newFPDSortingPlanOutput) {
		SortingPlanOutputRow oldFPDSortingPlanOutput = fpdSortingPlanOutput;
		fpdSortingPlanOutput = newFPDSortingPlanOutput;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, cptspPackage.SORTING_PLAN_OUTPUT__FPD_SORTING_PLAN_OUTPUT, oldFPDSortingPlanOutput, fpdSortingPlanOutput));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SortingPlanProduct getOutputProduct() {
		if (outputProduct != null && outputProduct.eIsProxy()) {
			InternalEObject oldOutputProduct = (InternalEObject)outputProduct;
			outputProduct = (SortingPlanProduct)eResolveProxy(oldOutputProduct);
			if (outputProduct != oldOutputProduct) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, cptspPackage.SORTING_PLAN_OUTPUT__OUTPUT_PRODUCT, oldOutputProduct, outputProduct));
			}
		}
		return outputProduct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SortingPlanProduct basicGetOutputProduct() {
		return outputProduct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOutputProduct(SortingPlanProduct newOutputProduct, NotificationChain msgs) {
		SortingPlanProduct oldOutputProduct = outputProduct;
		outputProduct = newOutputProduct;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, cptspPackage.SORTING_PLAN_OUTPUT__OUTPUT_PRODUCT, oldOutputProduct, newOutputProduct);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutputProduct(SortingPlanProduct newOutputProduct) {
		if (newOutputProduct != outputProduct) {
			NotificationChain msgs = null;
			if (outputProduct != null)
				msgs = ((InternalEObject)outputProduct).eInverseRemove(this, cptspPackage.SORTING_PLAN_PRODUCT__SORTING_PLANS_PRODUCING, SortingPlanProduct.class, msgs);
			if (newOutputProduct != null)
				msgs = ((InternalEObject)newOutputProduct).eInverseAdd(this, cptspPackage.SORTING_PLAN_PRODUCT__SORTING_PLANS_PRODUCING, SortingPlanProduct.class, msgs);
			msgs = basicSetOutputProduct(newOutputProduct, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, cptspPackage.SORTING_PLAN_OUTPUT__OUTPUT_PRODUCT, newOutputProduct, newOutputProduct));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public String getDescription() {
		SortingPlanOutputRow sortingOutput = this.getFPDSortingPlanOutput();
		SortingPlan sp = this.getSortingPlan();
		String descriptionSP = sp==null ? "null" : sp.getDescription();
		String descriptionOutput = sortingOutput==null? "null": sortingOutput.getDescription();
		String description = descriptionSP + " -> " + descriptionOutput;
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SortingPlan getSortingPlan() {
		if (eContainerFeatureID() != cptspPackage.SORTING_PLAN_OUTPUT__SORTING_PLAN) return null;
		return (SortingPlan)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSortingPlan(SortingPlan newSortingPlan, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newSortingPlan, cptspPackage.SORTING_PLAN_OUTPUT__SORTING_PLAN, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSortingPlan(SortingPlan newSortingPlan) {
		if (newSortingPlan != eInternalContainer() || (eContainerFeatureID() != cptspPackage.SORTING_PLAN_OUTPUT__SORTING_PLAN && newSortingPlan != null)) {
			if (EcoreUtil.isAncestor(this, newSortingPlan))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newSortingPlan != null)
				msgs = ((InternalEObject)newSortingPlan).eInverseAdd(this, cptspPackage.SORTING_PLAN__OUTPUTS, SortingPlan.class, msgs);
			msgs = basicSetSortingPlan(newSortingPlan, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, cptspPackage.SORTING_PLAN_OUTPUT__SORTING_PLAN, newSortingPlan, newSortingPlan));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void addPropagatorFunctionAdapter() {
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
			case cptspPackage.SORTING_PLAN_OUTPUT__OUTPUT_PRODUCT:
				if (outputProduct != null)
					msgs = ((InternalEObject)outputProduct).eInverseRemove(this, cptspPackage.SORTING_PLAN_PRODUCT__SORTING_PLANS_PRODUCING, SortingPlanProduct.class, msgs);
				return basicSetOutputProduct((SortingPlanProduct)otherEnd, msgs);
			case cptspPackage.SORTING_PLAN_OUTPUT__SORTING_PLAN:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
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
			case cptspPackage.SORTING_PLAN_OUTPUT__OUTPUT_PRODUCT:
				return basicSetOutputProduct(null, msgs);
			case cptspPackage.SORTING_PLAN_OUTPUT__SORTING_PLAN:
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
			case cptspPackage.SORTING_PLAN_OUTPUT__SORTING_PLAN:
				return eInternalContainer().eInverseRemove(this, cptspPackage.SORTING_PLAN__OUTPUTS, SortingPlan.class, msgs);
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
			case cptspPackage.SORTING_PLAN_OUTPUT__FPD_SORTING_PLAN_OUTPUT:
				if (resolve) return getFPDSortingPlanOutput();
				return basicGetFPDSortingPlanOutput();
			case cptspPackage.SORTING_PLAN_OUTPUT__OUTPUT_PRODUCT:
				if (resolve) return getOutputProduct();
				return basicGetOutputProduct();
			case cptspPackage.SORTING_PLAN_OUTPUT__DESCRIPTION:
				return getDescription();
			case cptspPackage.SORTING_PLAN_OUTPUT__SORTING_PLAN:
				return getSortingPlan();
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
			case cptspPackage.SORTING_PLAN_OUTPUT__FPD_SORTING_PLAN_OUTPUT:
				setFPDSortingPlanOutput((SortingPlanOutputRow)newValue);
				return;
			case cptspPackage.SORTING_PLAN_OUTPUT__OUTPUT_PRODUCT:
				setOutputProduct((SortingPlanProduct)newValue);
				return;
			case cptspPackage.SORTING_PLAN_OUTPUT__SORTING_PLAN:
				setSortingPlan((SortingPlan)newValue);
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
			case cptspPackage.SORTING_PLAN_OUTPUT__FPD_SORTING_PLAN_OUTPUT:
				setFPDSortingPlanOutput((SortingPlanOutputRow)null);
				return;
			case cptspPackage.SORTING_PLAN_OUTPUT__OUTPUT_PRODUCT:
				setOutputProduct((SortingPlanProduct)null);
				return;
			case cptspPackage.SORTING_PLAN_OUTPUT__SORTING_PLAN:
				setSortingPlan((SortingPlan)null);
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
			case cptspPackage.SORTING_PLAN_OUTPUT__FPD_SORTING_PLAN_OUTPUT:
				return fpdSortingPlanOutput != null;
			case cptspPackage.SORTING_PLAN_OUTPUT__OUTPUT_PRODUCT:
				return outputProduct != null;
			case cptspPackage.SORTING_PLAN_OUTPUT__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? getDescription() != null : !DESCRIPTION_EDEFAULT.equals(getDescription());
			case cptspPackage.SORTING_PLAN_OUTPUT__SORTING_PLAN:
				return getSortingPlan() != null;
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
			case cptspPackage.SORTING_PLAN_OUTPUT___ADD_PROPAGATOR_FUNCTION_ADAPTER:
				addPropagatorFunctionAdapter();
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //SortingPlanOutputImpl
