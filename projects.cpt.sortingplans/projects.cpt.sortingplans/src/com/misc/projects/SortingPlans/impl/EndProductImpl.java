/**
 */
package com.misc.projects.SortingPlans.impl;


import com.misc.common.moplaf.propagator.Util;
import com.misc.projects.CptDatasetLoad.SortingLevelRow;
import com.misc.projects.SortingPlans.EndProduct;
import com.misc.projects.SortingPlans.EndProductInProduct;
import com.misc.projects.SortingPlans.EndProductSortingPlan;
import com.misc.projects.SortingPlans.EndProductSortingPlanInput;
import com.misc.projects.SortingPlans.EndProductSortingPlanOutput;
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
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map.Entry;
import java.util.PriorityQueue;
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
 *   <li>{@link com.misc.projects.SortingPlans.impl.EndProductImpl#isSelected <em>Selected</em>}</li>
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
	 * The cached value of the '{@link #getProductsContaining() <em>Products Containing</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductsContaining()
	 * @generated
	 * @ordered
	 */
	protected EList<EndProductInProduct> productsContaining;

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
	public EList<EndProductInProduct> getProductsContaining() {
		if (productsContaining == null) {
			productsContaining = new EObjectContainmentWithInverseEList<EndProductInProduct>(EndProductInProduct.class, this, cptspPackage.END_PRODUCT__PRODUCTS_CONTAINING, cptspPackage.END_PRODUCT_IN_PRODUCT__END_PRODUCTS_CONTAINED);
		}
		return productsContaining;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public boolean isSelected() {
		boolean selected = this.getScenarioAsSelected()!=null;
		return selected;
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
		HashSet<SortingPlanProduct> psToBe = new HashSet<SortingPlanProduct>();
		AlgorithmResult result = new AlgorithmResult();
		AlgorithmQueue  queue  = new AlgorithmQueue(); 
		if (   this.getScenarioAsSelected()!=null 
			&& this.eContainer!=null
			&& this.getSortingPlanProduct()!=null){

			// ok we make something
			// this is the dijkstra
			SortingPlanProduct thispp = this.getSortingPlanProduct();
			for ( SortingPlanOutput spout : thispp.getSortingPlansProducing()){
				// insert the spout
				SortingPlan sp = spout.getSortingPlan();
				AlgorithmSortingPlan algsp = new AlgorithmSortingPlan(spout, 1);
				result.put(sp, algsp);
				queue.add(algsp);
			}
			while ( !queue.isEmpty()){
				AlgorithmSortingPlan candidate = queue.remove();
				this.algorithmUpdate(queue, result, candidate.sortingPlanOut, candidate.distanceSorting);
			}
	
			// products to be 
			psToBe.add(this.getSortingPlanProduct());
			for( SortingPlan sortingPlan : result.keySet()){
				for ( SortingPlanInput spi : sortingPlan.getInputs()){
					psToBe.add(spi.getInputProduct());
				}
			}
		}  // if we do something

		// sorting plans to be 
		HashSet<SortingPlan> spsToBe = new HashSet<SortingPlan>(result.keySet());
		
		// we have all the spouts shortest
		// the sp's are all the sp containing the spout
		// the spin's are all the spin's of the sp's
		// the p's are all the spin's
		// the spout not shortest are the spout in the sp's, going to some p in the p's
		
		// compare the asis and the tobe
		// compare the products
		LinkedList<EndProductInProduct>  psToDel  = new LinkedList<EndProductInProduct>(); 
		HashMap<SortingPlanProduct, EndProductInProduct> psAsIs = new HashMap<SortingPlanProduct, EndProductInProduct>();
		for (EndProductInProduct pAsIs : this.getProductsContaining()){
			SortingPlanProduct product = pAsIs.getProduct();
			if ( psToBe.contains(product)){
				psAsIs.put(product, pAsIs);
				psToBe.remove(product);
			} else {
				psToDel.add(pAsIs);
			}
		}
		// create the product
		for ( SortingPlanProduct pToCreate : psToBe){
			EndProductInProduct newProduct = cptspFactory.eINSTANCE.createEndProductInProduct();
			psAsIs.put(pToCreate, newProduct);
			newProduct.setProduct(pToCreate); // ancestor
			this.getProductsContaining().add(newProduct); // owning
		}

		// compare the sorting plans
		LinkedList<EndProductSortingPlan> spsToDel = new LinkedList<EndProductSortingPlan>(); 
		LinkedList<EndProductSortingPlanInput> spinsToDel = new LinkedList<EndProductSortingPlanInput>(); 
		LinkedList<EndProductSortingPlanOutput> spoutsToDel = new LinkedList<EndProductSortingPlanOutput>(); 
		HashMap<SortingPlan, EndProductSortingPlan> spsAsIs = new HashMap<SortingPlan, EndProductSortingPlan>();
		for (EndProductSortingPlan spAsIs: this.getSortingPlans()){
			SortingPlan sortingPlan = spAsIs.getSortingPlan();
			if ( result.containsKey(sortingPlan)) {
				spsAsIs.put(sortingPlan, spAsIs);
				spsToBe.remove(sortingPlan);
			} else {
				spsToDel.add(spAsIs);
				for ( EndProductSortingPlanInput spinToDel : spAsIs.getInputs()){
					spinsToDel.add(spinToDel);
				}
				for ( EndProductSortingPlanOutput spoutToDel : spAsIs.getOutputs()){
					spoutsToDel.add(spoutToDel);
				}
			}
		}
		// create the sorting plans
		for ( SortingPlan sortingPlanToCreate: spsToBe){
			EndProductSortingPlan newSortingPlan = cptspFactory.eINSTANCE.createEndProductSortingPlan();
			spsAsIs.put(sortingPlanToCreate, newSortingPlan);
			newSortingPlan.setSortingPlan(sortingPlanToCreate); // ancestor
			this.getSortingPlans().add(newSortingPlan); // owning
		}
		
		// update the sorting plans
		for ( Entry<SortingPlan, EndProductSortingPlan> mapEntry : spsAsIs.entrySet() ){
			SortingPlan sp = mapEntry.getKey();
			EndProductSortingPlan epsp = mapEntry.getValue();
			AlgorithmSortingPlan spResult = result.get(sp);
			int distance = spResult.distanceSorting;
			SortingPlanOutput shortestOutput = spResult.sortingPlanOut;
			EndProductSortingPlanOutput selectedSortingPlanOutput = null;
			// children outputs
			{
				// calculate to be
				HashSet<SortingPlanOutput> spoutsToBe = new HashSet<SortingPlanOutput>();
				spoutsToBe.add(shortestOutput);
				for ( SortingPlanOutput output : sp.getOutputs() ){
					if ( psAsIs.containsKey(output.getOutputProduct()) ){
						spoutsToBe.add(output);
					}
				}
				// compare with as is 
				for ( EndProductSortingPlanOutput spoutAsIs : epsp.getOutputs()){
					if ( spoutsToBe.contains(spoutAsIs.getSortingPlanOutput())){
						spoutsToBe.remove(spoutAsIs);
						if ( shortestOutput == spoutAsIs.getSortingPlanOutput()){
							selectedSortingPlanOutput = spoutAsIs;
						}
					} else {
						spoutsToDel.add(spoutAsIs);
					}
				}
				// create 
				for ( SortingPlanOutput spoutToCreate : spoutsToBe){
					EndProductSortingPlan esp = spsAsIs.get(spoutToCreate.getSortingPlan());
					EndProductInProduct   ep  = psAsIs.get(spoutToCreate.getOutputProduct());
					EndProductSortingPlanOutput newspout = cptspFactory.eINSTANCE.createEndProductSortingPlanOutput();
					newspout.setSortingPlanOutput(spoutToCreate);  // ancestor
					newspout.setOutputProduct(ep); // other side
					newspout.setSortingPlan(esp); // owner
					if ( shortestOutput == spoutToCreate){
						selectedSortingPlanOutput = newspout;
					}
				}
			}
			// children inputs
			{
				// calculate to be
				HashSet<SortingPlanInput> spinsToBe = new HashSet<SortingPlanInput>(sp.getInputs());
				// compare with as is 
				for ( EndProductSortingPlanInput spinAsIs : epsp.getInputs()){
					if ( spinsToBe.contains(spinAsIs)){
						spinsToBe.remove(spinAsIs);
					} else {
						spinsToDel.add(spinAsIs);
					}
				}
				// create 
				for ( SortingPlanInput spinToCreate : spinsToBe){
					EndProductSortingPlan esp = spsAsIs.get(spinToCreate.getSortingPlan());
					EndProductInProduct   ep  = psAsIs.get(spinToCreate.getInputProduct());
					EndProductSortingPlanInput newspin = cptspFactory.eINSTANCE.createEndProductSortingPlanInput();
					newspin.setSortingPlanInput(spinToCreate);  // ancestor
					newspin.setInputProduct(ep); // other side
					newspin.setSortingPlan(esp); // owner
				} 
			}
			// attributes and references
			epsp.setSortingDistance(distance);
			epsp.setSelectedOutput(selectedSortingPlanOutput);
		}
		
		// remove
		for ( EndProductSortingPlanInput spin : spinsToDel){
			spin.setInputProduct(null);  // other side
			spin.setSortingPlanInput(null); // ancestor
			spin.setSortingPlan(null); // owner
		}
		for ( EndProductSortingPlanOutput spout: spoutsToDel){
			spout.setOutputProduct(null);  // other side
			spout.setSortingPlanOutput(null); // ancestor
			spout.setSortingPlan(null); // owner
		}
		for ( EndProductSortingPlan sp: spsToDel){
			sp.setSortingPlan(null); // ancestor
			sp.setEndProduct(null);  // owner = this
		}
		for ( EndProductInProduct p: psToDel){
			p.setProduct(null); // ancestor
			p.setEndProductsContained(null);  // owner = this
		}
		
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
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getProductsContaining()).basicAdd(otherEnd, msgs);
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
				return ((InternalEList<?>)getProductsContaining()).basicRemove(otherEnd, msgs);
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
			case cptspPackage.END_PRODUCT__SELECTED:
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
				getProductsContaining().clear();
				getProductsContaining().addAll((Collection<? extends EndProductInProduct>)newValue);
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
				getProductsContaining().clear();
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
				return productsContaining != null && !productsContaining.isEmpty();
			case cptspPackage.END_PRODUCT__SELECTED:
				return isSelected() != SELECTED_EDEFAULT;
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
