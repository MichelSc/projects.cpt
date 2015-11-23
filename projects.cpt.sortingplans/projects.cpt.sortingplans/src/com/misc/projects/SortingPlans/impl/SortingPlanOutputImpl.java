/**
 */
package com.misc.projects.SortingPlans.impl;

import com.misc.common.moplaf.propagator.Util;
import com.misc.projects.CptDatasetLoad.SortingPlanOutputRow;
import com.misc.projects.SortingPlans.SortingPlan;
import com.misc.projects.SortingPlans.SortingPlanEndProduct;
import com.misc.projects.SortingPlans.SortingPlanOutput;
import com.misc.projects.SortingPlans.SortingPlanProduct;
import com.misc.projects.SortingPlans.cptspPackage;
import com.misc.projects.SortingPlans.calc.PropagatorCalcSortingPlanOutputRefreshSelected;
import com.misc.projects.SortingPlans.calc.PropagatorCalcSortingPlanOutputRefreshSelectedNotShortest;

import java.lang.reflect.InvocationTargetException;
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
 * An implementation of the model object '<em><b>Sorting Plan Output</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.projects.SortingPlans.impl.SortingPlanOutputImpl#getFPDSortingPlanOutput <em>FPD Sorting Plan Output</em>}</li>
 *   <li>{@link com.misc.projects.SortingPlans.impl.SortingPlanOutputImpl#getOutputProduct <em>Output Product</em>}</li>
 *   <li>{@link com.misc.projects.SortingPlans.impl.SortingPlanOutputImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link com.misc.projects.SortingPlans.impl.SortingPlanOutputImpl#getSortingPlanEndProduct <em>Sorting Plan End Product</em>}</li>
 *   <li>{@link com.misc.projects.SortingPlans.impl.SortingPlanOutputImpl#getSortingPlan <em>Sorting Plan</em>}</li>
 *   <li>{@link com.misc.projects.SortingPlans.impl.SortingPlanOutputImpl#isSelected <em>Selected</em>}</li>
 *   <li>{@link com.misc.projects.SortingPlans.impl.SortingPlanOutputImpl#isSelectedNotShortest <em>Selected Not Shortest</em>}</li>
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
	 * The cached value of the '{@link #getSortingPlanEndProduct() <em>Sorting Plan End Product</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSortingPlanEndProduct()
	 * @generated
	 * @ordered
	 */
	protected EList<SortingPlanEndProduct> sortingPlanEndProduct;

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
	 * The default value of the '{@link #isSelectedNotShortest() <em>Selected Not Shortest</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSelectedNotShortest()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SELECTED_NOT_SHORTEST_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isSelectedNotShortest() <em>Selected Not Shortest</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSelectedNotShortest()
	 * @generated
	 * @ordered
	 */
	protected boolean selectedNotShortest = SELECTED_NOT_SHORTEST_EDEFAULT;

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
	public EList<SortingPlanEndProduct> getSortingPlanEndProduct() {
		if (sortingPlanEndProduct == null) {
			sortingPlanEndProduct = new EObjectWithInverseResolvingEList<SortingPlanEndProduct>(SortingPlanEndProduct.class, this, cptspPackage.SORTING_PLAN_OUTPUT__SORTING_PLAN_END_PRODUCT, cptspPackage.SORTING_PLAN_END_PRODUCT__OUTPUT);
		}
		return sortingPlanEndProduct;
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
			eNotify(new ENotificationImpl(this, Notification.SET, cptspPackage.SORTING_PLAN_OUTPUT__SELECTED, oldSelected, selected));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSelectedNotShortest() {
		return selectedNotShortest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSelectedNotShortest(boolean newSelectedNotShortest) {
		boolean oldSelectedNotShortest = selectedNotShortest;
		selectedNotShortest = newSelectedNotShortest;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, cptspPackage.SORTING_PLAN_OUTPUT__SELECTED_NOT_SHORTEST, oldSelectedNotShortest, selectedNotShortest));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void refreshSelected() {
		boolean selected = this.getSortingPlanEndProduct().size()>0;
		this.setSelected(selected);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void refreshSelectedNotShortest() {
		SortingPlanProduct outputProduct = this.getOutputProduct();
		boolean selected = !this.isSelected() && outputProduct.isSelected();
		this.setSelectedNotShortest(selected);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void addPropagatorFunctionAdapter() {
		Util.adapt(this, PropagatorCalcSortingPlanOutputRefreshSelected.class);
		Util.adapt(this, PropagatorCalcSortingPlanOutputRefreshSelectedNotShortest.class);
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
			case cptspPackage.SORTING_PLAN_OUTPUT__SORTING_PLAN_END_PRODUCT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSortingPlanEndProduct()).basicAdd(otherEnd, msgs);
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
			case cptspPackage.SORTING_PLAN_OUTPUT__SORTING_PLAN_END_PRODUCT:
				return ((InternalEList<?>)getSortingPlanEndProduct()).basicRemove(otherEnd, msgs);
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
			case cptspPackage.SORTING_PLAN_OUTPUT__SORTING_PLAN_END_PRODUCT:
				return getSortingPlanEndProduct();
			case cptspPackage.SORTING_PLAN_OUTPUT__SORTING_PLAN:
				return getSortingPlan();
			case cptspPackage.SORTING_PLAN_OUTPUT__SELECTED:
				return isSelected();
			case cptspPackage.SORTING_PLAN_OUTPUT__SELECTED_NOT_SHORTEST:
				return isSelectedNotShortest();
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
			case cptspPackage.SORTING_PLAN_OUTPUT__SORTING_PLAN_END_PRODUCT:
				getSortingPlanEndProduct().clear();
				getSortingPlanEndProduct().addAll((Collection<? extends SortingPlanEndProduct>)newValue);
				return;
			case cptspPackage.SORTING_PLAN_OUTPUT__SORTING_PLAN:
				setSortingPlan((SortingPlan)newValue);
				return;
			case cptspPackage.SORTING_PLAN_OUTPUT__SELECTED:
				setSelected((Boolean)newValue);
				return;
			case cptspPackage.SORTING_PLAN_OUTPUT__SELECTED_NOT_SHORTEST:
				setSelectedNotShortest((Boolean)newValue);
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
			case cptspPackage.SORTING_PLAN_OUTPUT__SORTING_PLAN_END_PRODUCT:
				getSortingPlanEndProduct().clear();
				return;
			case cptspPackage.SORTING_PLAN_OUTPUT__SORTING_PLAN:
				setSortingPlan((SortingPlan)null);
				return;
			case cptspPackage.SORTING_PLAN_OUTPUT__SELECTED:
				setSelected(SELECTED_EDEFAULT);
				return;
			case cptspPackage.SORTING_PLAN_OUTPUT__SELECTED_NOT_SHORTEST:
				setSelectedNotShortest(SELECTED_NOT_SHORTEST_EDEFAULT);
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
			case cptspPackage.SORTING_PLAN_OUTPUT__SORTING_PLAN_END_PRODUCT:
				return sortingPlanEndProduct != null && !sortingPlanEndProduct.isEmpty();
			case cptspPackage.SORTING_PLAN_OUTPUT__SORTING_PLAN:
				return getSortingPlan() != null;
			case cptspPackage.SORTING_PLAN_OUTPUT__SELECTED:
				return selected != SELECTED_EDEFAULT;
			case cptspPackage.SORTING_PLAN_OUTPUT__SELECTED_NOT_SHORTEST:
				return selectedNotShortest != SELECTED_NOT_SHORTEST_EDEFAULT;
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
			case cptspPackage.SORTING_PLAN_OUTPUT___REFRESH_SELECTED:
				refreshSelected();
				return null;
			case cptspPackage.SORTING_PLAN_OUTPUT___REFRESH_SELECTED_NOT_SHORTEST:
				refreshSelectedNotShortest();
				return null;
			case cptspPackage.SORTING_PLAN_OUTPUT___ADD_PROPAGATOR_FUNCTION_ADAPTER:
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
		result.append(", selectedNotShortest: ");
		result.append(selectedNotShortest);
		result.append(')');
		return result.toString();
	}

} //SortingPlanOutputImpl
