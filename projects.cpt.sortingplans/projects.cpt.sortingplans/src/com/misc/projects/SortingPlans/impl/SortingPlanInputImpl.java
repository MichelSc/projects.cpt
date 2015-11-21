/**
 */
package com.misc.projects.SortingPlans.impl;

import com.misc.projects.CptDatasetLoad.SortingPlanInputRow;
import com.misc.projects.SortingPlans.SortingPlan;
import com.misc.projects.SortingPlans.SortingPlanInput;
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
 * An implementation of the model object '<em><b>Sorting Plan Input</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.projects.SortingPlans.impl.SortingPlanInputImpl#getInputProduct <em>Input Product</em>}</li>
 *   <li>{@link com.misc.projects.SortingPlans.impl.SortingPlanInputImpl#getFPDSortingPlanInput <em>FPD Sorting Plan Input</em>}</li>
 *   <li>{@link com.misc.projects.SortingPlans.impl.SortingPlanInputImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link com.misc.projects.SortingPlans.impl.SortingPlanInputImpl#getSortingPlan <em>Sorting Plan</em>}</li>
 *   <li>{@link com.misc.projects.SortingPlans.impl.SortingPlanInputImpl#isSelected <em>Selected</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SortingPlanInputImpl extends MinimalEObjectImpl.Container implements SortingPlanInput {
	/**
	 * The cached value of the '{@link #getInputProduct() <em>Input Product</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputProduct()
	 * @generated
	 * @ordered
	 */
	protected SortingPlanProduct inputProduct;

	/**
	 * The cached value of the '{@link #getFPDSortingPlanInput() <em>FPD Sorting Plan Input</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFPDSortingPlanInput()
	 * @generated
	 * @ordered
	 */
	protected SortingPlanInputRow fpdSortingPlanInput;

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
	 * The default value of the '{@link #isSelected() <em>Selected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSelected()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SELECTED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isSelected() <em>Selected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSelected()
	 * @generated
	 * @ordered
	 */
	protected boolean selected = SELECTED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SortingPlanInputImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return cptspPackage.Literals.SORTING_PLAN_INPUT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SortingPlanProduct getInputProduct() {
		if (inputProduct != null && inputProduct.eIsProxy()) {
			InternalEObject oldInputProduct = (InternalEObject)inputProduct;
			inputProduct = (SortingPlanProduct)eResolveProxy(oldInputProduct);
			if (inputProduct != oldInputProduct) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, cptspPackage.SORTING_PLAN_INPUT__INPUT_PRODUCT, oldInputProduct, inputProduct));
			}
		}
		return inputProduct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SortingPlanProduct basicGetInputProduct() {
		return inputProduct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInputProduct(SortingPlanProduct newInputProduct, NotificationChain msgs) {
		SortingPlanProduct oldInputProduct = inputProduct;
		inputProduct = newInputProduct;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, cptspPackage.SORTING_PLAN_INPUT__INPUT_PRODUCT, oldInputProduct, newInputProduct);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInputProduct(SortingPlanProduct newInputProduct) {
		if (newInputProduct != inputProduct) {
			NotificationChain msgs = null;
			if (inputProduct != null)
				msgs = ((InternalEObject)inputProduct).eInverseRemove(this, cptspPackage.SORTING_PLAN_PRODUCT__SORTING_PLANS_ACCEPTING, SortingPlanProduct.class, msgs);
			if (newInputProduct != null)
				msgs = ((InternalEObject)newInputProduct).eInverseAdd(this, cptspPackage.SORTING_PLAN_PRODUCT__SORTING_PLANS_ACCEPTING, SortingPlanProduct.class, msgs);
			msgs = basicSetInputProduct(newInputProduct, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, cptspPackage.SORTING_PLAN_INPUT__INPUT_PRODUCT, newInputProduct, newInputProduct));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SortingPlanInputRow getFPDSortingPlanInput() {
		if (fpdSortingPlanInput != null && fpdSortingPlanInput.eIsProxy()) {
			InternalEObject oldFPDSortingPlanInput = (InternalEObject)fpdSortingPlanInput;
			fpdSortingPlanInput = (SortingPlanInputRow)eResolveProxy(oldFPDSortingPlanInput);
			if (fpdSortingPlanInput != oldFPDSortingPlanInput) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, cptspPackage.SORTING_PLAN_INPUT__FPD_SORTING_PLAN_INPUT, oldFPDSortingPlanInput, fpdSortingPlanInput));
			}
		}
		return fpdSortingPlanInput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SortingPlanInputRow basicGetFPDSortingPlanInput() {
		return fpdSortingPlanInput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFPDSortingPlanInput(SortingPlanInputRow newFPDSortingPlanInput) {
		SortingPlanInputRow oldFPDSortingPlanInput = fpdSortingPlanInput;
		fpdSortingPlanInput = newFPDSortingPlanInput;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, cptspPackage.SORTING_PLAN_INPUT__FPD_SORTING_PLAN_INPUT, oldFPDSortingPlanInput, fpdSortingPlanInput));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public String getDescription() {
		SortingPlanInputRow sortingInput = this.getFPDSortingPlanInput();
		String description = sortingInput==null? "null": sortingInput.getDescription();
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SortingPlan getSortingPlan() {
		if (eContainerFeatureID() != cptspPackage.SORTING_PLAN_INPUT__SORTING_PLAN) return null;
		return (SortingPlan)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSortingPlan(SortingPlan newSortingPlan, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newSortingPlan, cptspPackage.SORTING_PLAN_INPUT__SORTING_PLAN, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSortingPlan(SortingPlan newSortingPlan) {
		if (newSortingPlan != eInternalContainer() || (eContainerFeatureID() != cptspPackage.SORTING_PLAN_INPUT__SORTING_PLAN && newSortingPlan != null)) {
			if (EcoreUtil.isAncestor(this, newSortingPlan))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newSortingPlan != null)
				msgs = ((InternalEObject)newSortingPlan).eInverseAdd(this, cptspPackage.SORTING_PLAN__INPUTS, SortingPlan.class, msgs);
			msgs = basicSetSortingPlan(newSortingPlan, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, cptspPackage.SORTING_PLAN_INPUT__SORTING_PLAN, newSortingPlan, newSortingPlan));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSelected() {
		return selected;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSelected(boolean newSelected) {
		boolean oldSelected = selected;
		selected = newSelected;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, cptspPackage.SORTING_PLAN_INPUT__SELECTED, oldSelected, selected));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void refreshSelected() {
		boolean selected = this.getSortingPlan().isSelected();
		this.setSelected(selected);
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
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case cptspPackage.SORTING_PLAN_INPUT__INPUT_PRODUCT:
				if (inputProduct != null)
					msgs = ((InternalEObject)inputProduct).eInverseRemove(this, cptspPackage.SORTING_PLAN_PRODUCT__SORTING_PLANS_ACCEPTING, SortingPlanProduct.class, msgs);
				return basicSetInputProduct((SortingPlanProduct)otherEnd, msgs);
			case cptspPackage.SORTING_PLAN_INPUT__SORTING_PLAN:
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
			case cptspPackage.SORTING_PLAN_INPUT__INPUT_PRODUCT:
				return basicSetInputProduct(null, msgs);
			case cptspPackage.SORTING_PLAN_INPUT__SORTING_PLAN:
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
			case cptspPackage.SORTING_PLAN_INPUT__SORTING_PLAN:
				return eInternalContainer().eInverseRemove(this, cptspPackage.SORTING_PLAN__INPUTS, SortingPlan.class, msgs);
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
			case cptspPackage.SORTING_PLAN_INPUT__INPUT_PRODUCT:
				if (resolve) return getInputProduct();
				return basicGetInputProduct();
			case cptspPackage.SORTING_PLAN_INPUT__FPD_SORTING_PLAN_INPUT:
				if (resolve) return getFPDSortingPlanInput();
				return basicGetFPDSortingPlanInput();
			case cptspPackage.SORTING_PLAN_INPUT__DESCRIPTION:
				return getDescription();
			case cptspPackage.SORTING_PLAN_INPUT__SORTING_PLAN:
				return getSortingPlan();
			case cptspPackage.SORTING_PLAN_INPUT__SELECTED:
				return isSelected();
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
			case cptspPackage.SORTING_PLAN_INPUT__INPUT_PRODUCT:
				setInputProduct((SortingPlanProduct)newValue);
				return;
			case cptspPackage.SORTING_PLAN_INPUT__FPD_SORTING_PLAN_INPUT:
				setFPDSortingPlanInput((SortingPlanInputRow)newValue);
				return;
			case cptspPackage.SORTING_PLAN_INPUT__SORTING_PLAN:
				setSortingPlan((SortingPlan)newValue);
				return;
			case cptspPackage.SORTING_PLAN_INPUT__SELECTED:
				setSelected((Boolean)newValue);
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
			case cptspPackage.SORTING_PLAN_INPUT__INPUT_PRODUCT:
				setInputProduct((SortingPlanProduct)null);
				return;
			case cptspPackage.SORTING_PLAN_INPUT__FPD_SORTING_PLAN_INPUT:
				setFPDSortingPlanInput((SortingPlanInputRow)null);
				return;
			case cptspPackage.SORTING_PLAN_INPUT__SORTING_PLAN:
				setSortingPlan((SortingPlan)null);
				return;
			case cptspPackage.SORTING_PLAN_INPUT__SELECTED:
				setSelected(SELECTED_EDEFAULT);
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
			case cptspPackage.SORTING_PLAN_INPUT__INPUT_PRODUCT:
				return inputProduct != null;
			case cptspPackage.SORTING_PLAN_INPUT__FPD_SORTING_PLAN_INPUT:
				return fpdSortingPlanInput != null;
			case cptspPackage.SORTING_PLAN_INPUT__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? getDescription() != null : !DESCRIPTION_EDEFAULT.equals(getDescription());
			case cptspPackage.SORTING_PLAN_INPUT__SORTING_PLAN:
				return getSortingPlan() != null;
			case cptspPackage.SORTING_PLAN_INPUT__SELECTED:
				return selected != SELECTED_EDEFAULT;
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
			case cptspPackage.SORTING_PLAN_INPUT___REFRESH_SELECTED:
				refreshSelected();
				return null;
			case cptspPackage.SORTING_PLAN_INPUT___ADD_PROPAGATOR_FUNCTION_ADAPTER:
				addPropagatorFunctionAdapter();
				return null;
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (selected: ");
		result.append(selected);
		result.append(')');
		return result.toString();
	}

} //SortingPlanInputImpl
