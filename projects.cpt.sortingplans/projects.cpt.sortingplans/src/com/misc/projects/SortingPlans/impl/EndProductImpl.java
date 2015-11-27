/**
 */
package com.misc.projects.SortingPlans.impl;


import com.misc.common.moplaf.propagator.Util;
import com.misc.projects.CptDatasetLoad.SortingLevelRow;
import com.misc.projects.SortingPlans.EndProduct;
import com.misc.projects.SortingPlans.EndProductInProduct;
import com.misc.projects.SortingPlans.EndProductSortingPlan;
import com.misc.projects.SortingPlans.Scenario;
import com.misc.projects.SortingPlans.SortingPlan;
import com.misc.projects.SortingPlans.SortingPlanInput;
import com.misc.projects.SortingPlans.SortingPlanOutput;
import com.misc.projects.SortingPlans.SortingPlanProduct;
import com.misc.projects.SortingPlans.cptspFactory;
import com.misc.projects.SortingPlans.cptspPackage;
import com.misc.projects.SortingPlans.calc.PropagatorCalcEndProductRefreshSortingPlans;
import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.HashMap;
import java.util.PriorityQueue;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
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
 * An implementation of the model object '<em><b>End Product</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.projects.SortingPlans.impl.EndProductImpl#getFPDSortingLevel <em>FPD Sorting Level</em>}</li>
 *   <li>{@link com.misc.projects.SortingPlans.impl.EndProductImpl#getSortingPlanProduct <em>Sorting Plan Product</em>}</li>
 *   <li>{@link com.misc.projects.SortingPlans.impl.EndProductImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link com.misc.projects.SortingPlans.impl.EndProductImpl#getSortingPlans <em>Sorting Plans</em>}</li>
 *   <li>{@link com.misc.projects.SortingPlans.impl.EndProductImpl#getScenario <em>Scenario</em>}</li>
 *   <li>{@link com.misc.projects.SortingPlans.impl.EndProductImpl#getScenarioAsSelected <em>Scenario As Selected</em>}</li>
 *   <li>{@link com.misc.projects.SortingPlans.impl.EndProductImpl#getProductsContaining <em>Products Containing</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EndProductImpl extends MinimalEObjectImpl.Container implements EndProduct {
	/**
	 * The cached value of the '{@link #getFPDSortingLevel() <em>FPD Sorting Level</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFPDSortingLevel()
	 * @generated
	 * @ordered
	 */
	protected SortingLevelRow fpdSortingLevel;

	/**
	 * The cached value of the '{@link #getSortingPlanProduct() <em>Sorting Plan Product</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSortingPlanProduct()
	 * @generated
	 * @ordered
	 */
	protected SortingPlanProduct sortingPlanProduct;

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
	 * The cached value of the '{@link #getSortingPlans() <em>Sorting Plans</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSortingPlans()
	 * @generated
	 * @ordered
	 */
	protected EList<EndProductSortingPlan> sortingPlans;

	/**
	 * The cached value of the '{@link #getScenarioAsSelected() <em>Scenario As Selected</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScenarioAsSelected()
	 * @generated
	 * @ordered
	 */
	protected Scenario scenarioAsSelected;

	/**
	 * The cached value of the '{@link #getProductsContaining() <em>Products Containing</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductsContaining()
	 * @generated
	 * @ordered
	 */
	protected EndProductInProduct productsContaining;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EndProductImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return cptspPackage.Literals.END_PRODUCT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SortingLevelRow getFPDSortingLevel() {
		if (fpdSortingLevel != null && fpdSortingLevel.eIsProxy()) {
			InternalEObject oldFPDSortingLevel = (InternalEObject)fpdSortingLevel;
			fpdSortingLevel = (SortingLevelRow)eResolveProxy(oldFPDSortingLevel);
			if (fpdSortingLevel != oldFPDSortingLevel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, cptspPackage.END_PRODUCT__FPD_SORTING_LEVEL, oldFPDSortingLevel, fpdSortingLevel));
			}
		}
		return fpdSortingLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SortingLevelRow basicGetFPDSortingLevel() {
		return fpdSortingLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFPDSortingLevel(SortingLevelRow newFPDSortingLevel) {
		SortingLevelRow oldFPDSortingLevel = fpdSortingLevel;
		fpdSortingLevel = newFPDSortingLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, cptspPackage.END_PRODUCT__FPD_SORTING_LEVEL, oldFPDSortingLevel, fpdSortingLevel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SortingPlanProduct getSortingPlanProduct() {
		if (sortingPlanProduct != null && sortingPlanProduct.eIsProxy()) {
			InternalEObject oldSortingPlanProduct = (InternalEObject)sortingPlanProduct;
			sortingPlanProduct = (SortingPlanProduct)eResolveProxy(oldSortingPlanProduct);
			if (sortingPlanProduct != oldSortingPlanProduct) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, cptspPackage.END_PRODUCT__SORTING_PLAN_PRODUCT, oldSortingPlanProduct, sortingPlanProduct));
			}
		}
		return sortingPlanProduct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SortingPlanProduct basicGetSortingPlanProduct() {
		return sortingPlanProduct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSortingPlanProduct(SortingPlanProduct newSortingPlanProduct, NotificationChain msgs) {
		SortingPlanProduct oldSortingPlanProduct = sortingPlanProduct;
		sortingPlanProduct = newSortingPlanProduct;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, cptspPackage.END_PRODUCT__SORTING_PLAN_PRODUCT, oldSortingPlanProduct, newSortingPlanProduct);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSortingPlanProduct(SortingPlanProduct newSortingPlanProduct) {
		if (newSortingPlanProduct != sortingPlanProduct) {
			NotificationChain msgs = null;
			if (sortingPlanProduct != null)
				msgs = ((InternalEObject)sortingPlanProduct).eInverseRemove(this, cptspPackage.SORTING_PLAN_PRODUCT__END_PRODUCT, SortingPlanProduct.class, msgs);
			if (newSortingPlanProduct != null)
				msgs = ((InternalEObject)newSortingPlanProduct).eInverseAdd(this, cptspPackage.SORTING_PLAN_PRODUCT__END_PRODUCT, SortingPlanProduct.class, msgs);
			msgs = basicSetSortingPlanProduct(newSortingPlanProduct, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, cptspPackage.END_PRODUCT__SORTING_PLAN_PRODUCT, newSortingPlanProduct, newSortingPlanProduct));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public String getDescription() {
		String description = this.getSortingPlanProduct()==null?"null":this.getSortingPlanProduct().getDescription();
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EndProductSortingPlan> getSortingPlans() {
		if (sortingPlans == null) {
			sortingPlans = new EObjectContainmentWithInverseEList<EndProductSortingPlan>(EndProductSortingPlan.class, this, cptspPackage.END_PRODUCT__SORTING_PLANS, cptspPackage.END_PRODUCT_SORTING_PLAN__END_PRODUCT);
		}
		return sortingPlans;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Scenario getScenario() {
		if (eContainerFeatureID() != cptspPackage.END_PRODUCT__SCENARIO) return null;
		return (Scenario)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetScenario(Scenario newScenario, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newScenario, cptspPackage.END_PRODUCT__SCENARIO, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScenario(Scenario newScenario) {
		if (newScenario != eInternalContainer() || (eContainerFeatureID() != cptspPackage.END_PRODUCT__SCENARIO && newScenario != null)) {
			if (EcoreUtil.isAncestor(this, newScenario))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newScenario != null)
				msgs = ((InternalEObject)newScenario).eInverseAdd(this, cptspPackage.SCENARIO__END_PRODUCTS, Scenario.class, msgs);
			msgs = basicSetScenario(newScenario, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, cptspPackage.END_PRODUCT__SCENARIO, newScenario, newScenario));
	}

	 /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Scenario getScenarioAsSelected() {
		if (scenarioAsSelected != null && scenarioAsSelected.eIsProxy()) {
			InternalEObject oldScenarioAsSelected = (InternalEObject)scenarioAsSelected;
			scenarioAsSelected = (Scenario)eResolveProxy(oldScenarioAsSelected);
			if (scenarioAsSelected != oldScenarioAsSelected) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, cptspPackage.END_PRODUCT__SCENARIO_AS_SELECTED, oldScenarioAsSelected, scenarioAsSelected));
			}
		}
		return scenarioAsSelected;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Scenario basicGetScenarioAsSelected() {
		return scenarioAsSelected;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetScenarioAsSelected(Scenario newScenarioAsSelected, NotificationChain msgs) {
		Scenario oldScenarioAsSelected = scenarioAsSelected;
		scenarioAsSelected = newScenarioAsSelected;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, cptspPackage.END_PRODUCT__SCENARIO_AS_SELECTED, oldScenarioAsSelected, newScenarioAsSelected);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScenarioAsSelected(Scenario newScenarioAsSelected) {
		if (newScenarioAsSelected != scenarioAsSelected) {
			NotificationChain msgs = null;
			if (scenarioAsSelected != null)
				msgs = ((InternalEObject)scenarioAsSelected).eInverseRemove(this, cptspPackage.SCENARIO__SELECTED_END_PRODUCTS, Scenario.class, msgs);
			if (newScenarioAsSelected != null)
				msgs = ((InternalEObject)newScenarioAsSelected).eInverseAdd(this, cptspPackage.SCENARIO__SELECTED_END_PRODUCTS, Scenario.class, msgs);
			msgs = basicSetScenarioAsSelected(newScenarioAsSelected, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, cptspPackage.END_PRODUCT__SCENARIO_AS_SELECTED, newScenarioAsSelected, newScenarioAsSelected));
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EndProductInProduct getProductsContaining() {
		return productsContaining;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProductsContaining(EndProductInProduct newProductsContaining, NotificationChain msgs) {
		EndProductInProduct oldProductsContaining = productsContaining;
		productsContaining = newProductsContaining;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, cptspPackage.END_PRODUCT__PRODUCTS_CONTAINING, oldProductsContaining, newProductsContaining);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProductsContaining(EndProductInProduct newProductsContaining) {
		if (newProductsContaining != productsContaining) {
			NotificationChain msgs = null;
			if (productsContaining != null)
				msgs = ((InternalEObject)productsContaining).eInverseRemove(this, cptspPackage.END_PRODUCT_IN_PRODUCT__END_PRODUCTS_CONTAINED, EndProductInProduct.class, msgs);
			if (newProductsContaining != null)
				msgs = ((InternalEObject)newProductsContaining).eInverseAdd(this, cptspPackage.END_PRODUCT_IN_PRODUCT__END_PRODUCTS_CONTAINED, EndProductInProduct.class, msgs);
			msgs = basicSetProductsContaining(newProductsContaining, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, cptspPackage.END_PRODUCT__PRODUCTS_CONTAINING, newProductsContaining, newProductsContaining));
	}

		private class AlgorithmSortingPlan implements Comparable<AlgorithmSortingPlan>{
		 public SortingPlanOutput sortingPlanOut;
		 public int distanceSorting;
		 
		 public AlgorithmSortingPlan (SortingPlanOutput sortingPlanOut, int distanceSorting){
			 this.sortingPlanOut = sortingPlanOut;
			 this.distanceSorting = distanceSorting;
		 }
		 
		@Override
		public int compareTo(AlgorithmSortingPlan o) {
			if      ( this.distanceSorting < o.distanceSorting ) return -1;
			else if ( this.distanceSorting > o.distanceSorting ) return +1; 
			return 0;
		}
	 };
	 
	 @SuppressWarnings("serial")
	 private class AlgorithmQueue extends PriorityQueue<AlgorithmSortingPlan>{};
	 
	 @SuppressWarnings("serial")
	 private class AlgorithmResult extends HashMap<SortingPlan, AlgorithmSortingPlan>{};
	 
	 private void algorithmUpdate(AlgorithmQueue queue, AlgorithmResult result, SortingPlanOutput spout, int distance){
		 // spout becomes optimal
		 SortingPlan sp = spout.getSortingPlan();
		 for ( SortingPlanInput spin : sp.getInputs()){
			 SortingPlanProduct spp = spin.getInputProduct();
			 for ( SortingPlanOutput newspout : spp.getSortingPlansProducing()){
				 SortingPlan newsp = newspout.getSortingPlan();
				 AlgorithmSortingPlan algsp = result.get(newsp);
				 if ( algsp == null ){
					 // new (never visited): add and initialize
					 algsp = new AlgorithmSortingPlan(newspout, distance+1);
					 result.put(newsp, algsp);
					 queue.add(algsp);
				 } else {
					 // already visited
					 if ( algsp.distanceSorting>distance+1){
						 // update, is better
						 algsp.distanceSorting = distance;
						 algsp.sortingPlanOut = newspout;
					 } else {
						 // ignore, not better
					 }
				 }
			 }
		 }
	 }

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void refreshSortingPlans() {
		//CommonPlugin.INSTANCE.log("EndProduct "+ this.getDescription()+" begin refresh Sortingplans");

		// calculate the to be
		AlgorithmResult result = new AlgorithmResult();
		AlgorithmQueue  queue  = new AlgorithmQueue(); 
		if (   this.getScenarioAsSelected()!=null 
			&& this.eContainer!=null
			&& this.getSortingPlanProduct()!=null){
			SortingPlanProduct thispp = this.getSortingPlanProduct();
			for ( SortingPlanOutput spout : thispp.getSortingPlansProducing()){
				// insert the spout
				SortingPlan sp = spout.getSortingPlan();
				AlgorithmSortingPlan algsp = new AlgorithmSortingPlan(spout, 0);
				result.put(sp, algsp);
				queue.add(algsp);
			}
		}
		while ( !queue.isEmpty()){
			AlgorithmSortingPlan candidate = queue.remove();
			this.algorithmUpdate(queue, result, candidate.sortingPlanOut, candidate.distanceSorting);
		}
		
		/*
		//traverse the asis
		BasicEList<SortingPlanEndProduct> spepToDelete = new BasicEList<SortingPlanEndProduct>();
		// remove
		for ( SortingPlanEndProduct spepAsIs: this.getSortingPlans()){
			SortingPlan sp = spepAsIs.getSortingPlan();
			AlgorithmSortingPlan tobe = result.get(sp);
			if ( tobe==null){
				// remove spepAsIs
				spepToDelete.add(spepAsIs);
			} else {
				// update
				spepAsIs.setSortingDistance(tobe.distanceSorting);
				spepAsIs.setOutput(tobe.sortingPlanOut);
				result.remove(tobe);
			}
		}
		for (  AlgorithmSortingPlan spepToBe : result.values()	){
			SortingPlanOutput spout = spepToBe.sortingPlanOut;
			SortingPlan sp = spout.getSortingPlan();
			// create 
			SortingPlanEndProduct newspep = cptspFactory.eINSTANCE.createSortingPlanEndProduct();
			newspep.setSortingPlan(sp);   // not owning
			newspep.setOutput(spout);
			newspep.setSortingDistance(spepToBe.distanceSorting);
			newspep.setEndProduct(this);  // owning
		}

		// clean up
		for ( SortingPlanEndProduct spep : spepToDelete){
			spep.setSortingPlan(null);  
			spep.setOutput(null);
			spep.setEndProduct(null);  // owning
		}
		*/
		//CommonPlugin.INSTANCE.log("EndProduct "+ this.getDescription()+" end refresh Sortingplans");
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
			case cptspPackage.END_PRODUCT__SORTING_PLAN_PRODUCT:
				if (sortingPlanProduct != null)
					msgs = ((InternalEObject)sortingPlanProduct).eInverseRemove(this, cptspPackage.SORTING_PLAN_PRODUCT__END_PRODUCT, SortingPlanProduct.class, msgs);
				return basicSetSortingPlanProduct((SortingPlanProduct)otherEnd, msgs);
			case cptspPackage.END_PRODUCT__SORTING_PLANS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSortingPlans()).basicAdd(otherEnd, msgs);
			case cptspPackage.END_PRODUCT__SCENARIO:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetScenario((Scenario)otherEnd, msgs);
			case cptspPackage.END_PRODUCT__SCENARIO_AS_SELECTED:
				if (scenarioAsSelected != null)
					msgs = ((InternalEObject)scenarioAsSelected).eInverseRemove(this, cptspPackage.SCENARIO__SELECTED_END_PRODUCTS, Scenario.class, msgs);
				return basicSetScenarioAsSelected((Scenario)otherEnd, msgs);
			case cptspPackage.END_PRODUCT__PRODUCTS_CONTAINING:
				if (productsContaining != null)
					msgs = ((InternalEObject)productsContaining).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - cptspPackage.END_PRODUCT__PRODUCTS_CONTAINING, null, msgs);
				return basicSetProductsContaining((EndProductInProduct)otherEnd, msgs);
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
			case cptspPackage.END_PRODUCT__SORTING_PLAN_PRODUCT:
				return basicSetSortingPlanProduct(null, msgs);
			case cptspPackage.END_PRODUCT__SORTING_PLANS:
				return ((InternalEList<?>)getSortingPlans()).basicRemove(otherEnd, msgs);
			case cptspPackage.END_PRODUCT__SCENARIO:
				return basicSetScenario(null, msgs);
			case cptspPackage.END_PRODUCT__SCENARIO_AS_SELECTED:
				return basicSetScenarioAsSelected(null, msgs);
			case cptspPackage.END_PRODUCT__PRODUCTS_CONTAINING:
				return basicSetProductsContaining(null, msgs);
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
			case cptspPackage.END_PRODUCT__SCENARIO:
				return eInternalContainer().eInverseRemove(this, cptspPackage.SCENARIO__END_PRODUCTS, Scenario.class, msgs);
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
			case cptspPackage.END_PRODUCT__FPD_SORTING_LEVEL:
				if (resolve) return getFPDSortingLevel();
				return basicGetFPDSortingLevel();
			case cptspPackage.END_PRODUCT__SORTING_PLAN_PRODUCT:
				if (resolve) return getSortingPlanProduct();
				return basicGetSortingPlanProduct();
			case cptspPackage.END_PRODUCT__DESCRIPTION:
				return getDescription();
			case cptspPackage.END_PRODUCT__SORTING_PLANS:
				return getSortingPlans();
			case cptspPackage.END_PRODUCT__SCENARIO:
				return getScenario();
			case cptspPackage.END_PRODUCT__SCENARIO_AS_SELECTED:
				if (resolve) return getScenarioAsSelected();
				return basicGetScenarioAsSelected();
			case cptspPackage.END_PRODUCT__PRODUCTS_CONTAINING:
				return getProductsContaining();
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
			case cptspPackage.END_PRODUCT__FPD_SORTING_LEVEL:
				setFPDSortingLevel((SortingLevelRow)newValue);
				return;
			case cptspPackage.END_PRODUCT__SORTING_PLAN_PRODUCT:
				setSortingPlanProduct((SortingPlanProduct)newValue);
				return;
			case cptspPackage.END_PRODUCT__SORTING_PLANS:
				getSortingPlans().clear();
				getSortingPlans().addAll((Collection<? extends EndProductSortingPlan>)newValue);
				return;
			case cptspPackage.END_PRODUCT__SCENARIO:
				setScenario((Scenario)newValue);
				return;
			case cptspPackage.END_PRODUCT__SCENARIO_AS_SELECTED:
				setScenarioAsSelected((Scenario)newValue);
				return;
			case cptspPackage.END_PRODUCT__PRODUCTS_CONTAINING:
				setProductsContaining((EndProductInProduct)newValue);
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
			case cptspPackage.END_PRODUCT__FPD_SORTING_LEVEL:
				setFPDSortingLevel((SortingLevelRow)null);
				return;
			case cptspPackage.END_PRODUCT__SORTING_PLAN_PRODUCT:
				setSortingPlanProduct((SortingPlanProduct)null);
				return;
			case cptspPackage.END_PRODUCT__SORTING_PLANS:
				getSortingPlans().clear();
				return;
			case cptspPackage.END_PRODUCT__SCENARIO:
				setScenario((Scenario)null);
				return;
			case cptspPackage.END_PRODUCT__SCENARIO_AS_SELECTED:
				setScenarioAsSelected((Scenario)null);
				return;
			case cptspPackage.END_PRODUCT__PRODUCTS_CONTAINING:
				setProductsContaining((EndProductInProduct)null);
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
			case cptspPackage.END_PRODUCT__FPD_SORTING_LEVEL:
				return fpdSortingLevel != null;
			case cptspPackage.END_PRODUCT__SORTING_PLAN_PRODUCT:
				return sortingPlanProduct != null;
			case cptspPackage.END_PRODUCT__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? getDescription() != null : !DESCRIPTION_EDEFAULT.equals(getDescription());
			case cptspPackage.END_PRODUCT__SORTING_PLANS:
				return sortingPlans != null && !sortingPlans.isEmpty();
			case cptspPackage.END_PRODUCT__SCENARIO:
				return getScenario() != null;
			case cptspPackage.END_PRODUCT__SCENARIO_AS_SELECTED:
				return scenarioAsSelected != null;
			case cptspPackage.END_PRODUCT__PRODUCTS_CONTAINING:
				return productsContaining != null;
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
			case cptspPackage.END_PRODUCT___REFRESH_SORTING_PLANS:
				refreshSortingPlans();
				return null;
			case cptspPackage.END_PRODUCT___ADD_PROPAGATOR_FUNCTION_ADAPTER:
				addPropagatorFunctionAdapter();
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void addPropagatorFunctionAdapter() {
		Util.adapt(this, PropagatorCalcEndProductRefreshSortingPlans.class);
	}


} //EndProductImpl
