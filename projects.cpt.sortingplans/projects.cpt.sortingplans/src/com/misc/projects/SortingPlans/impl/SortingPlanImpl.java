/**
 */
package com.misc.projects.SortingPlans.impl;

import com.misc.common.moplaf.propagator.Util;
import com.misc.projects.CptDatasetLoad.SortingPlanInputRow;
import com.misc.projects.CptDatasetLoad.SortingPlanOutputRow;
import com.misc.projects.CptDatasetLoad.SortingPlanRow;
import com.misc.projects.SortingPlans.Scenario;
import com.misc.projects.SortingPlans.SortingPlan;
import com.misc.projects.SortingPlans.SortingPlanEndProduct;
import com.misc.projects.SortingPlans.SortingPlanInput;
import com.misc.projects.SortingPlans.SortingPlanOutput;
import com.misc.projects.SortingPlans.cptspFactory;
import com.misc.projects.SortingPlans.cptspPackage;
import com.misc.projects.SortingPlans.calc.PropagatorCalcSortingPlanRefresh;
import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.HashSet;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sorting Plan</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.projects.SortingPlans.impl.SortingPlanImpl#getOutputs <em>Outputs</em>}</li>
 *   <li>{@link com.misc.projects.SortingPlans.impl.SortingPlanImpl#getEndProducts <em>End Products</em>}</li>
 *   <li>{@link com.misc.projects.SortingPlans.impl.SortingPlanImpl#getFPDSortingPlan <em>FPD Sorting Plan</em>}</li>
 *   <li>{@link com.misc.projects.SortingPlans.impl.SortingPlanImpl#getInputs <em>Inputs</em>}</li>
 *   <li>{@link com.misc.projects.SortingPlans.impl.SortingPlanImpl#getScenario <em>Scenario</em>}</li>
 *   <li>{@link com.misc.projects.SortingPlans.impl.SortingPlanImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link com.misc.projects.SortingPlans.impl.SortingPlanImpl#isSelected <em>Selected</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SortingPlanImpl extends MinimalEObjectImpl.Container implements SortingPlan {
	/**
	 * The cached value of the '{@link #getOutputs() <em>Outputs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputs()
	 * @generated
	 * @ordered
	 */
	protected EList<SortingPlanOutput> outputs;

	/**
	 * The cached value of the '{@link #getEndProducts() <em>End Products</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndProducts()
	 * @generated
	 * @ordered
	 */
	protected EList<SortingPlanEndProduct> endProducts;

	/**
	 * The cached value of the '{@link #getFPDSortingPlan() <em>FPD Sorting Plan</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFPDSortingPlan()
	 * @generated
	 * @ordered
	 */
	protected SortingPlanRow fpdSortingPlan;

	/**
	 * The cached value of the '{@link #getInputs() <em>Inputs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputs()
	 * @ordered
	 */
	protected EList<SortingPlanInput> inputs;

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
	protected SortingPlanImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return cptspPackage.Literals.SORTING_PLAN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SortingPlanOutput> getOutputs() {
		if (outputs == null) {
			outputs = new EObjectContainmentWithInverseEList<SortingPlanOutput>(SortingPlanOutput.class, this, cptspPackage.SORTING_PLAN__OUTPUTS, cptspPackage.SORTING_PLAN_OUTPUT__SORTING_PLAN);
		}
		return outputs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SortingPlanInput> getInputs() {
		if (inputs == null) {
			inputs = new EObjectContainmentWithInverseEList<SortingPlanInput>(SortingPlanInput.class, this, cptspPackage.SORTING_PLAN__INPUTS, cptspPackage.SORTING_PLAN_INPUT__SORTING_PLAN);
		}
		return inputs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Scenario getScenario() {
		if (eContainerFeatureID() != cptspPackage.SORTING_PLAN__SCENARIO) return null;
		return (Scenario)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetScenario(Scenario newScenario, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newScenario, cptspPackage.SORTING_PLAN__SCENARIO, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScenario(Scenario newScenario) {
		if (newScenario != eInternalContainer() || (eContainerFeatureID() != cptspPackage.SORTING_PLAN__SCENARIO && newScenario != null)) {
			if (EcoreUtil.isAncestor(this, newScenario))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newScenario != null)
				msgs = ((InternalEObject)newScenario).eInverseAdd(this, cptspPackage.SCENARIO__SORTING_PLANS, Scenario.class, msgs);
			msgs = basicSetScenario(newScenario, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, cptspPackage.SORTING_PLAN__SCENARIO, newScenario, newScenario));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public String getDescription() {
		SortingPlanRow sortingPlan = this.getFPDSortingPlan();
		String description = sortingPlan==null? "null": sortingPlan.getDescription();
		return description;
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
			eNotify(new ENotificationImpl(this, Notification.SET, cptspPackage.SORTING_PLAN__SELECTED, oldSelected, selected));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void refreshInputs() {
		HashSet<SortingPlanInputRow> tobes = new HashSet<SortingPlanInputRow>();
		SortingPlanRow fpd_sp = this.getFPDSortingPlan();
		if ( fpd_sp!=null){
			tobes.addAll(fpd_sp.getInputs());
		}
		// delete 
		BasicEList<SortingPlanInput> inputToRemove = new BasicEList<SortingPlanInput>();
		for ( SortingPlanInput inputasis : this.getInputs()){
			SortingPlanInputRow rowasis = inputasis.getFPDSortingPlanInput();
			if ( rowasis==null	|| !tobes.contains(rowasis)){
				// remove
				inputToRemove.add(inputasis);
			}
			else {
				tobes.remove(rowasis);
			}
		}
		this.getInputs().removeAll(inputToRemove);
		// create
		for ( SortingPlanInputRow tobe : tobes){
			// create
			SortingPlanInput newSortingPlanInput = cptspFactory.eINSTANCE.createSortingPlanInput();
			newSortingPlanInput.setFPDSortingPlanInput(tobe);
			this.getInputs().add(newSortingPlanInput);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void refreshOutputs() {
		HashSet<SortingPlanOutputRow> tobes = new HashSet<SortingPlanOutputRow>();
		SortingPlanRow fpd_sp = this.getFPDSortingPlan();
		if ( fpd_sp!=null){
			tobes.addAll(fpd_sp.getOutputs());
		}
		// delete 
		BasicEList<SortingPlanOutput> outputToRemove = new BasicEList<SortingPlanOutput>();
		for ( SortingPlanOutput outputasis : this.getOutputs()){
			SortingPlanOutputRow rowasis = outputasis.getFPDSortingPlanOutput();
			if ( rowasis==null	|| !tobes.contains(rowasis)){
				// remove
				outputToRemove.add(outputasis);
			}
			else {
				tobes.remove(rowasis);
			}
		}
		this.getOutputs().removeAll(outputToRemove);
		// create
		for ( SortingPlanOutputRow tobe : tobes){
			SortingPlanOutput newSortingPlanOutput= cptspFactory.eINSTANCE.createSortingPlanOutput();
			newSortingPlanOutput.setFPDSortingPlanOutput(tobe);
			this.getOutputs().add(newSortingPlanOutput);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void refresh() {
		this.refreshInputs();
		this.refreshOutputs();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void refreshSelected() {
		boolean selected = false;
		for ( SortingPlanOutput spout : this.getOutputs()){
			if ( selected ) { break; }
			selected = spout.isSelected();
		}
		this.setSelected(selected);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void addPropagatorFunctionAdapter() {
		Util.adapt(this, PropagatorCalcSortingPlanRefresh.class);
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
			case cptspPackage.SORTING_PLAN__OUTPUTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOutputs()).basicAdd(otherEnd, msgs);
			case cptspPackage.SORTING_PLAN__END_PRODUCTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getEndProducts()).basicAdd(otherEnd, msgs);
			case cptspPackage.SORTING_PLAN__INPUTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getInputs()).basicAdd(otherEnd, msgs);
			case cptspPackage.SORTING_PLAN__SCENARIO:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetScenario((Scenario)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SortingPlanEndProduct> getEndProducts() {
		if (endProducts == null) {
			endProducts = new EObjectWithInverseResolvingEList<SortingPlanEndProduct>(SortingPlanEndProduct.class, this, cptspPackage.SORTING_PLAN__END_PRODUCTS, cptspPackage.SORTING_PLAN_END_PRODUCT__SORTING_PLAN);
		}
		return endProducts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SortingPlanRow getFPDSortingPlan() {
		if (fpdSortingPlan != null && fpdSortingPlan.eIsProxy()) {
			InternalEObject oldFPDSortingPlan = (InternalEObject)fpdSortingPlan;
			fpdSortingPlan = (SortingPlanRow)eResolveProxy(oldFPDSortingPlan);
			if (fpdSortingPlan != oldFPDSortingPlan) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, cptspPackage.SORTING_PLAN__FPD_SORTING_PLAN, oldFPDSortingPlan, fpdSortingPlan));
			}
		}
		return fpdSortingPlan;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SortingPlanRow basicGetFPDSortingPlan() {
		return fpdSortingPlan;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFPDSortingPlan(SortingPlanRow newFPDSortingPlan) {
		SortingPlanRow oldFPDSortingPlan = fpdSortingPlan;
		fpdSortingPlan = newFPDSortingPlan;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, cptspPackage.SORTING_PLAN__FPD_SORTING_PLAN, oldFPDSortingPlan, fpdSortingPlan));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case cptspPackage.SORTING_PLAN__OUTPUTS:
				return ((InternalEList<?>)getOutputs()).basicRemove(otherEnd, msgs);
			case cptspPackage.SORTING_PLAN__END_PRODUCTS:
				return ((InternalEList<?>)getEndProducts()).basicRemove(otherEnd, msgs);
			case cptspPackage.SORTING_PLAN__INPUTS:
				return ((InternalEList<?>)getInputs()).basicRemove(otherEnd, msgs);
			case cptspPackage.SORTING_PLAN__SCENARIO:
				return basicSetScenario(null, msgs);
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
			case cptspPackage.SORTING_PLAN__SCENARIO:
				return eInternalContainer().eInverseRemove(this, cptspPackage.SCENARIO__SORTING_PLANS, Scenario.class, msgs);
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
			case cptspPackage.SORTING_PLAN__OUTPUTS:
				return getOutputs();
			case cptspPackage.SORTING_PLAN__END_PRODUCTS:
				return getEndProducts();
			case cptspPackage.SORTING_PLAN__FPD_SORTING_PLAN:
				if (resolve) return getFPDSortingPlan();
				return basicGetFPDSortingPlan();
			case cptspPackage.SORTING_PLAN__INPUTS:
				return getInputs();
			case cptspPackage.SORTING_PLAN__SCENARIO:
				return getScenario();
			case cptspPackage.SORTING_PLAN__DESCRIPTION:
				return getDescription();
			case cptspPackage.SORTING_PLAN__SELECTED:
				return isSelected();
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
			case cptspPackage.SORTING_PLAN__OUTPUTS:
				getOutputs().clear();
				getOutputs().addAll((Collection<? extends SortingPlanOutput>)newValue);
				return;
			case cptspPackage.SORTING_PLAN__END_PRODUCTS:
				getEndProducts().clear();
				getEndProducts().addAll((Collection<? extends SortingPlanEndProduct>)newValue);
				return;
			case cptspPackage.SORTING_PLAN__FPD_SORTING_PLAN:
				setFPDSortingPlan((SortingPlanRow)newValue);
				return;
			case cptspPackage.SORTING_PLAN__INPUTS:
				getInputs().clear();
				getInputs().addAll((Collection<? extends SortingPlanInput>)newValue);
				return;
			case cptspPackage.SORTING_PLAN__SCENARIO:
				setScenario((Scenario)newValue);
				return;
			case cptspPackage.SORTING_PLAN__SELECTED:
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
			case cptspPackage.SORTING_PLAN__OUTPUTS:
				getOutputs().clear();
				return;
			case cptspPackage.SORTING_PLAN__END_PRODUCTS:
				getEndProducts().clear();
				return;
			case cptspPackage.SORTING_PLAN__FPD_SORTING_PLAN:
				setFPDSortingPlan((SortingPlanRow)null);
				return;
			case cptspPackage.SORTING_PLAN__INPUTS:
				getInputs().clear();
				return;
			case cptspPackage.SORTING_PLAN__SCENARIO:
				setScenario((Scenario)null);
				return;
			case cptspPackage.SORTING_PLAN__SELECTED:
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
			case cptspPackage.SORTING_PLAN__OUTPUTS:
				return outputs != null && !outputs.isEmpty();
			case cptspPackage.SORTING_PLAN__END_PRODUCTS:
				return endProducts != null && !endProducts.isEmpty();
			case cptspPackage.SORTING_PLAN__FPD_SORTING_PLAN:
				return fpdSortingPlan != null;
			case cptspPackage.SORTING_PLAN__INPUTS:
				return inputs != null && !inputs.isEmpty();
			case cptspPackage.SORTING_PLAN__SCENARIO:
				return getScenario() != null;
			case cptspPackage.SORTING_PLAN__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? getDescription() != null : !DESCRIPTION_EDEFAULT.equals(getDescription());
			case cptspPackage.SORTING_PLAN__SELECTED:
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
			case cptspPackage.SORTING_PLAN___REFRESH_INPUTS:
				refreshInputs();
				return null;
			case cptspPackage.SORTING_PLAN___REFRESH_OUTPUTS:
				refreshOutputs();
				return null;
			case cptspPackage.SORTING_PLAN___REFRESH:
				refresh();
				return null;
			case cptspPackage.SORTING_PLAN___REFRESH_SELECTED:
				refreshSelected();
				return null;
			case cptspPackage.SORTING_PLAN___ADD_PROPAGATOR_FUNCTION_ADAPTER:
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

} //SortingPlanImpl
