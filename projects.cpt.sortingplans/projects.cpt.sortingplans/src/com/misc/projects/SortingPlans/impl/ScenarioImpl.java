/**
 */
package com.misc.projects.SortingPlans.impl;


import com.misc.common.moplaf.propagator.ObjectWithPropagatorFunctionAdapterScope;
import com.misc.common.moplaf.propagator.PropagatorFunctionAdapter;
import com.misc.common.moplaf.propagator.PropagatorPackage;
import com.misc.common.moplaf.propagator.Util;
import com.misc.projects.CptDatasetLoad.SortingLevelRow;
import com.misc.projects.CptDatasetLoad.SortingPlanInputRow;
import com.misc.projects.CptDatasetLoad.SortingPlanOutputRow;
import com.misc.projects.CptDatasetLoad.SortingPlanRow;
import com.misc.projects.SortingPlans.EndProduct;
import com.misc.projects.SortingPlans.EndProductInProduct;
import com.misc.projects.SortingPlans.EndProductSortingPlan;
import com.misc.projects.SortingPlans.Scenario;
import com.misc.projects.SortingPlans.SortingPath;
import com.misc.projects.SortingPlans.SortingPlan;
import com.misc.projects.SortingPlans.SortingPlanInput;
import com.misc.projects.SortingPlans.SortingPlanOutput;
import com.misc.projects.SortingPlans.SortingPlanProduct;
import com.misc.projects.SortingPlans.cptspFactory;
import com.misc.projects.SortingPlans.cptspPackage;
import com.misc.projects.SortingPlans.calc.PropagatorCalcScenarioRefreshEndProducts;
import com.misc.projects.SortingPlans.calc.PropagatorCalcScenarioRefreshSelectedSortingPlan;
import com.misc.projects.SortingPlans.calc.PropagatorCalcScenarioRefreshSortingPlanProducts;
import com.misc.projects.SortingPlans.calc.PropagatorLayerEndProductRefreshSortingPlans;
import com.misc.projects.SortingPlans.calc.PropagatorLayerSortingPlansRefresh;
import com.misc.projects.SortingPlans.calc.PropagatorScopeScenario;

import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.eclipse.emf.common.CommonPlugin;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Scenario</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.projects.SortingPlans.impl.ScenarioImpl#getSortingPlans <em>Sorting Plans</em>}</li>
 *   <li>{@link com.misc.projects.SortingPlans.impl.ScenarioImpl#getEndProducts <em>End Products</em>}</li>
 *   <li>{@link com.misc.projects.SortingPlans.impl.ScenarioImpl#getSortingPlanProducts <em>Sorting Plan Products</em>}</li>
 *   <li>{@link com.misc.projects.SortingPlans.impl.ScenarioImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.misc.projects.SortingPlans.impl.ScenarioImpl#getSortingLevelsWithDestination <em>Sorting Levels With Destination</em>}</li>
 *   <li>{@link com.misc.projects.SortingPlans.impl.ScenarioImpl#getSelectedSortingPlans <em>Selected Sorting Plans</em>}</li>
 *   <li>{@link com.misc.projects.SortingPlans.impl.ScenarioImpl#getSelectedEndProducts <em>Selected End Products</em>}</li>
 *   <li>{@link com.misc.projects.SortingPlans.impl.ScenarioImpl#getPrimaryProductsSelected <em>Primary Products Selected</em>}</li>
 *   <li>{@link com.misc.projects.SortingPlans.impl.ScenarioImpl#getRemarks <em>Remarks</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ScenarioImpl extends MinimalEObjectImpl.Container implements Scenario {
	/**
	 * The cached value of the '{@link #getSortingPlans() <em>Sorting Plans</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSortingPlans()
	 * @generated
	 * @ordered
	 */
	protected EList<SortingPlan> sortingPlans;

	/**
	 * The cached value of the '{@link #getEndProducts() <em>End Products</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndProducts()
	 * @generated
	 * @ordered
	 */
	protected EList<EndProduct> endProducts;

	/**
	 * The cached value of the '{@link #getSortingPlanProducts() <em>Sorting Plan Products</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSortingPlanProducts()
	 * @generated
	 * @ordered
	 */
	protected EList<SortingPlanProduct> sortingPlanProducts;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSortingLevelsWithDestination() <em>Sorting Levels With Destination</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSortingLevelsWithDestination()
	 * @generated
	 * @ordered
	 */
	protected EList<SortingLevelRow> sortingLevelsWithDestination;

	/**
	 * The cached value of the '{@link #getSelectedSortingPlans() <em>Selected Sorting Plans</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelectedSortingPlans()
	 * @generated
	 * @ordered
	 */
	protected EList<SortingPlanRow> selectedSortingPlans;

	/**
	 * The cached value of the '{@link #getSelectedEndProducts() <em>Selected End Products</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelectedEndProducts()
	 * @generated
	 * @ordered
	 */
	protected EList<EndProduct> selectedEndProducts;

	/**
	 * The cached value of the '{@link #getPrimaryProductsSelected() <em>Primary Products Selected</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrimaryProductsSelected()
	 * @generated
	 * @ordered
	 */
	protected EList<SortingPlanProduct> primaryProductsSelected;

	/**
	 * The default value of the '{@link #getRemarks() <em>Remarks</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemarks()
	 * @generated
	 * @ordered
	 */
	protected static final String REMARKS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRemarks() <em>Remarks</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemarks()
	 * @generated
	 * @ordered
	 */
	protected String remarks = REMARKS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ScenarioImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return cptspPackage.Literals.SCENARIO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SortingPlan> getSortingPlans() {
		if (sortingPlans == null) {
			sortingPlans = new EObjectContainmentWithInverseEList<SortingPlan>(SortingPlan.class, this, cptspPackage.SCENARIO__SORTING_PLANS, cptspPackage.SORTING_PLAN__SCENARIO);
		}
		return sortingPlans;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EndProduct> getEndProducts() {
		if (endProducts == null) {
			endProducts = new EObjectContainmentWithInverseEList<EndProduct>(EndProduct.class, this, cptspPackage.SCENARIO__END_PRODUCTS, cptspPackage.END_PRODUCT__SCENARIO);
		}
		return endProducts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SortingPlanProduct> getSortingPlanProducts() {
		if (sortingPlanProducts == null) {
			sortingPlanProducts = new EObjectContainmentEList<SortingPlanProduct>(SortingPlanProduct.class, this, cptspPackage.SCENARIO__SORTING_PLAN_PRODUCTS);
		}
		return sortingPlanProducts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, cptspPackage.SCENARIO__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SortingLevelRow> getSortingLevelsWithDestination() {
		if (sortingLevelsWithDestination == null) {
			sortingLevelsWithDestination = new EObjectResolvingEList<SortingLevelRow>(SortingLevelRow.class, this, cptspPackage.SCENARIO__SORTING_LEVELS_WITH_DESTINATION);
		}
		return sortingLevelsWithDestination;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SortingPlanRow> getSelectedSortingPlans() {
		if (selectedSortingPlans == null) {
			selectedSortingPlans = new EObjectResolvingEList<SortingPlanRow>(SortingPlanRow.class, this, cptspPackage.SCENARIO__SELECTED_SORTING_PLANS);
		}
		return selectedSortingPlans;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EndProduct> getSelectedEndProducts() {
		if (selectedEndProducts == null) {
			selectedEndProducts = new EObjectWithInverseResolvingEList<EndProduct>(EndProduct.class, this, cptspPackage.SCENARIO__SELECTED_END_PRODUCTS, cptspPackage.END_PRODUCT__SCENARIO_AS_SELECTED);
		}
		return selectedEndProducts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SortingPlanProduct> getPrimaryProductsSelected() {
		if (primaryProductsSelected == null) {
			primaryProductsSelected = new EObjectResolvingEList<SortingPlanProduct>(SortingPlanProduct.class, this, cptspPackage.SCENARIO__PRIMARY_PRODUCTS_SELECTED);
		}
		return primaryProductsSelected;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRemarks() {
		return remarks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRemarks(String newRemarks) {
		String oldRemarks = remarks;
		remarks = newRemarks;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, cptspPackage.SCENARIO__REMARKS, oldRemarks, remarks));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void refreshSelectedSortingPlans() {
		// calculate the difference
		HashSet<SortingPlanRow> sprToCreate = new HashSet<SortingPlanRow>(this.getSelectedSortingPlans());
		HashSet<SortingPlan> spToDelete = new HashSet<SortingPlan>();
		for ( SortingPlan sp : this.getSortingPlans()){
			SortingPlanRow spr = sp.getFPDSortingPlan();
			if ( spr==null){
				spToDelete.add(sp);
			} else if ( sprToCreate.contains(spr)){
				sprToCreate.remove(sp.getFPDSortingPlan());
			} else {
				spToDelete.add(sp);
			}
		}
		
		// create
		for ( SortingPlanRow spr : sprToCreate){
			SortingPlan sp = cptspFactory.eINSTANCE.createSortingPlan();
			sp.setFPDSortingPlan(spr);
			this.getSortingPlans().add(sp); // owning
		}
			
		// remove
		for ( SortingPlan sp : spToDelete){
			EcoreUtil.delete(sp, true);
		}
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void refresh() {
		 CommonPlugin.INSTANCE.log( "..: scenario "+ this.getName());
		 
		 PropagatorFunctionAdapter scope = Util.getPropagatorFunctionAdapter(this, PropagatorScopeScenario.class);
		 if ( scope !=null){
			 CommonPlugin.INSTANCE.log( "..: refresh");
			 scope.refresh();
			 CommonPlugin.INSTANCE.log( "..: refreshed");
		 }
	}

	private class SortingPlanProductKey {
		// fields
		private BigDecimal mechanizationLevelSk;
		private BigDecimal sortingLevelSk;
		private BigDecimal throughputTypeSk;
		private BigDecimal destinationSk;
		
		// constructor
		public SortingPlanProductKey(BigDecimal mechanizationLevelSk,
					                       BigDecimal sortingLevelSk,
					                       BigDecimal throughputTypeSk,
					                       BigDecimal destinationSk){
			this.mechanizationLevelSk = mechanizationLevelSk;
			this.sortingLevelSk       = sortingLevelSk;
			this.throughputTypeSk     = throughputTypeSk;
			this.destinationSk        = destinationSk;
		}
		
		// equals
		public boolean equals(Object other){
		  
			if (other == null) { return false; }
			if (other == this) { return true; }
			if (other.getClass() != getClass()) {
				return false;
			}
			SortingPlanProductKey otherKey = (SortingPlanProductKey) other;
		    EqualsBuilder equalsBuilder = new EqualsBuilder();
		    equalsBuilder.append(this.mechanizationLevelSk, otherKey.mechanizationLevelSk);
		    equalsBuilder.append(this.sortingLevelSk      , otherKey.sortingLevelSk);
		    equalsBuilder.append(this.throughputTypeSk    , otherKey.throughputTypeSk);
		    equalsBuilder.append(this.destinationSk       , otherKey.destinationSk);
		    return equalsBuilder.isEquals();
		   
		}
		
		// hashCode
		public int hashCode(){
		     HashCodeBuilder hashBuilder = new HashCodeBuilder(17, 37);
	    	 hashBuilder.append(this.mechanizationLevelSk);
	    	 hashBuilder.append(this.sortingLevelSk);
	    	 hashBuilder.append(this.throughputTypeSk);
	    	 hashBuilder.append(this.destinationSk);
			 return hashBuilder.toHashCode();
		}

	}
	
	private BigDecimal getDestination(SortingLevelRow sortingLevel, BigDecimal destination) {
		if ( this.getSortingLevelsWithDestination().indexOf(sortingLevel)<0){
			return BigDecimal.ZERO;
		}
		return destination;
	}
	
	private SortingPlanProduct getOrCreateSortingPlanProduct
	                                    (HashMap<SortingPlanProductKey, SortingPlanProduct> mapspp,
										 SortingLevelRow slrow,
										 BigDecimal ml,
										 BigDecimal sl,
										 BigDecimal tt,
										 BigDecimal de){
		// get the destination
		BigDecimal destination = this.getDestination(slrow, de);
		
		// get the product
		SortingPlanProductKey sppkey = new SortingPlanProductKey(ml , sl, tt, destination);
        SortingPlanProduct spp = mapspp.get(sppkey);
        
        // create the product
        if ( spp == null) {
        	spp = cptspFactory.eINSTANCE.createSortingPlanProduct();
        	spp.setMechanizationLevelSk(ml);
        	spp.setSortingLevelAVCSSk(sl);
        	spp.setThroughputTypeSk(tt);
        	spp.setDestinationSk(destination);
        	spp.setFPDSortingLevel(slrow);
        	this.getSortingPlanProducts().add(spp);
        	mapspp.put(sppkey, spp);
        } // if not product
        return spp;
	}
										 
			                        

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void refreshSortingPlanProduct() {
		// intialize the map
		HashMap<SortingPlanProductKey, SortingPlanProduct> mapspp = new HashMap<SortingPlanProductKey, SortingPlanProduct>(); 
		for ( SortingPlanProduct spp : this.getSortingPlanProducts()){
			mapspp.put(new SortingPlanProductKey(spp.getMechanizationLevelSk(), 
					                             spp.getSortingLevelAVCSSk(),
					                             spp.getThroughputTypeSk(),
					                             spp.getDestinationSk()),
					   spp);          
		} // traverse the spp asis
		
		// create the missing sorting plan products
		for (SortingPlan sortingplan : this.getSortingPlans()){
			for ( SortingPlanInput sortingplaninput : sortingplan.getInputs()){
				// get or create the product
				SortingPlanInputRow fpdinput = sortingplaninput.getFPDSortingPlanInput();
				SortingPlanProduct spp = this.getOrCreateSortingPlanProduct(mapspp, 
															                fpdinput.getSortingLevel(), 
															                fpdinput.getMechanizationLevelSk(), 
						                                                    fpdinput.getSortingLevelAVCSSk(),
						                                                    fpdinput.getThroughputTypeSk(),
						                                                    BigDecimal.ZERO);
	        	sortingplaninput.setInputProduct(spp);
			} // traverse the inputs

			for ( SortingPlanOutput sortingplanoutput : sortingplan.getOutputs()){
				// get or create the product
				SortingPlanOutputRow fpdoutput = sortingplanoutput.getFPDSortingPlanOutput();
				SortingPlanProduct spp = this.getOrCreateSortingPlanProduct(mapspp, 
						                                                    fpdoutput.getSortingLevel(), 
						                                                    fpdoutput.getMechanizationLevelSk(),
						                                                    fpdoutput.getSortingLevelAVCSSk(),
						                                                    fpdoutput.getThroughputTypeSk(),
						                                                    fpdoutput.getDestinationSk());
	            sortingplanoutput.setOutputProduct(spp);
			} // traverse the outputs
		}  // traverse the sorting plans

		// remove the too many sorting plans products
		BasicEList<SortingPlanProduct> sppToRemove = new BasicEList<SortingPlanProduct>();
		for ( SortingPlanProduct spp : this.getSortingPlanProducts()){
			if (   spp.getSortingPlansAccepting().size()==0
				&& spp.getSortingPlansProducing().size()==0 ){
				spp.setEndProduct(null);
				sppToRemove.add(spp);
			}
		} //traverse the spp's
		this.getSortingPlanProducts().removeAll(sppToRemove);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void refreshEndProducts() {
		BasicEList<EndProduct> epToRemove = new BasicEList<EndProduct>();
		for ( SortingPlanProduct sortingPlanProduct : this.getSortingPlanProducts()){
			boolean endProductToBe = sortingPlanProduct.getSortingPlansAccepting().size()==0;
			EndProduct endProductAsIs = sortingPlanProduct.getEndProduct();
			if ( endProductToBe && endProductAsIs==null) {
				// create
	        	EndProduct ep = cptspFactory.eINSTANCE.createEndProduct();
	        	ep.setSortingPlanProduct(sortingPlanProduct);
	        	ep.setFPDSortingLevel(sortingPlanProduct.getFPDSortingLevel());
	        	this.getEndProducts().add(ep); // owning
			}
			else if ( !endProductToBe && endProductAsIs!=null){
				// remove delayed
				//sortingPlanProduct.setEndProduct(null);
				endProductAsIs.setSortingPlanProduct(null);
				endProductAsIs.setScenarioAsSelected(null);
				// dispose the endProduct
				// this should be done by EndProduct.refreshSortingPlans
				// so we comment it out
				/*
				for (SortingPlanEndProduct sortingplanendproduct : endProductAsIs.getSortingPlans()){
					sortingplanendproduct.getOutput().clear();
				}
				endProductAsIs.getSortingPlans().clear();
				*/
				epToRemove.add(endProductAsIs);
			}
		} // traverse the SortingPlanProducts
		for ( EndProduct endProduct : this.getEndProducts()){
			if ( endProduct.getSortingPlanProduct()==null){
				epToRemove.add(endProduct);
			}
		}
		// remove
		this.getEndProducts().removeAll(epToRemove);
	}

	// ------------------------------------------------------------------------
	// refresh sorting pahts logic
	// ------------------------------------------------------------------------
	
	// nested classed ---------------------------------------------------------
	@SuppressWarnings("serial")
	private class SetEndProducts extends HashSet<EndProduct>{
		public SetEndProducts(Collection<EndProduct> aSet){
			super(aSet);
		}
		public SetEndProducts(){
			super();
		}
	}
	
	private class ToDo{
		public ToDo(SortingPath path, SortingPlanOutput output){
			this.path = path;
			this.output = output;
		}
		public SortingPath path;
		public SortingPlanOutput output;
	}
	
	@SuppressWarnings("serial")
	private class ToDos extends LinkedList<ToDo>{
	};

	@SuppressWarnings("serial")
	private class SortingPaths extends HashSet<SortingPath>{
	};

	// sortingpath methods ----------------------------------------------------
	private void sortingPathSetSortedProducts(SortingPath aPath, SetEndProducts aSet){
		SetEndProducts asis = new SetEndProducts(aPath.getSortedEndProducts());
		asis.removeAll(aSet); // to remove 
		aSet.removeAll(aPath.getSortedEndProducts()); // to add
		
		// apply the delta's
		aPath.getSortedEndProducts().removeAll(asis);
		aPath.getSortedEndProducts().addAll(aSet);
	}
	
	private void sortingPathPropagate(SortingPath aPath, ToDos toDos){
		SortingPlanProduct inputProduct = aPath.getProduct();
		for ( SortingPlanInput input : inputProduct.getSortingPlansAccepting()){
			SortingPlan sortingPlan = input.getSortingPlan();
			for ( SortingPlanOutput output : sortingPlan.getOutputs()){
				ToDo newToDo = new ToDo(aPath, output);
				toDos.add(newToDo);
			}
		}
	}
	
	// object management ------------------------------------------------------
	private SortingPath getOrCreateSortingPath(SortingPlanProduct product,
									           SortingPlanOutput output, 
									           SortingPath input,
									           SortingPaths toRemove){
		// get or create
		// do the get
		SortingPath path = null;
		for ( SortingPath p : product.getSortingPaths()){
			if ( p.getOutputLastSegment()!=output) { continue; }
			if ( p.getBeforeLastSegment()!=input) { continue; }
			path = p; 
			toRemove.remove(p);
			break;
			} 
		// traverse the sorting paths
		if ( path == null){
			// do the create create
			path = cptspFactory.eINSTANCE.createSortingPath();
			path.setOutputLastSegment(output);
			path.setBeforeLastSegment(input);
			product.getSortingPaths().add(path);
		}
	return path;
	}
	
	// the algorithm ----------------------------------------------------------
	private SetEndProducts getSortedEndProducts(SortingPlanOutput output, SortingPath input){
		// calulate the set of end products
		SetEndProducts inputEndProducts = new SetEndProducts(input.getSortedEndProducts());
		// end products for this output	
		SetEndProducts outputEndProducts = new SetEndProducts();
		SortingPlan sortingPlan = output.getSortingPlan();
		for ( EndProductSortingPlan spep : sortingPlan.getEndProducts()){
			if ( spep.getSelectedOutput().getSortingPlanOutput()==output){
				outputEndProducts.add(spep.getEndProduct());
			}
		}
		outputEndProducts.retainAll(inputEndProducts);

		// calculate the delta's
		return outputEndProducts;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void refreshSortingPaths() {
		 CommonPlugin.INSTANCE.log( "RefreshSortingPaths, scenario "+ this.getName());
		 SortingPaths toRemove = new SortingPaths();
		for ( SortingPlanProduct p: this.getSortingPlanProducts()){
			for ( SortingPath path : p.getSortingPaths()){
				toRemove.add(path);
			}
		}
		
		CommonPlugin.INSTANCE.log( "RefreshSortingPaths, asis "+ toRemove.size());
		ToDos toDos = new ToDos();
		
		// initialization
		for ( SortingPlanProduct primaryProduct: this.getPrimaryProductsSelected()){
			SetEndProducts endProducts = new SetEndProducts();
			for ( EndProductInProduct ep : primaryProduct.getEndProducts()){
				endProducts.add(ep.getEndProductsContained());
			}
			SortingPath path = this.getOrCreateSortingPath(primaryProduct, null, null, toRemove);
			this.sortingPathSetSortedProducts(path, endProducts);
			this.sortingPathPropagate(path, toDos);
		}
		
		CommonPlugin.INSTANCE.log( "RefreshSortingPaths, intialised ");
		// iterate
		int iteration = 0;
		while ( !toDos.isEmpty() ){
			// do the toDo
			iteration++;
			if ( iteration % 1000 == 0 ){
				CommonPlugin.INSTANCE.log( "RefreshSortingPaths, iteration="+ iteration+", todos="+ toDos.size()+", ");
			}
			ToDo toDo = toDos.remove();
			SortingPlanOutput output = toDo.output;
			SortingPath input = toDo.path;
			SortingPlanProduct product = output.getOutputProduct();
			SetEndProducts endProducts = this.getSortedEndProducts(output, input);
			SortingPath newPath = this.getOrCreateSortingPath(product, output, input, toRemove);
			boolean emptyOutput = endProducts.isEmpty();
			boolean fullOutput  = endProducts.size()==input.getSortedEndProducts().size();
			this.sortingPathSetSortedProducts(newPath, endProducts);
			if ( !emptyOutput && !fullOutput ){  // this must block cycling
				this.sortingPathPropagate(newPath, toDos);
			}
		}
		
		CommonPlugin.INSTANCE.log( "RefreshSortingPaths, done, to clean up "+ toRemove.size());
		// clean up
		for ( SortingPath pathToRemove : toRemove){
			pathToRemove.setBeforeLastSegment(null);
			pathToRemove.setOutputLastSegment(null);
			pathToRemove.setProduct(null);  // owning
		}
		CommonPlugin.INSTANCE.log( "RefreshSortingPaths, done, to cleaned up ");
	}
	
	// ------------------------------------------------------------------------

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void test() {
		this.refreshSortingPaths();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void addPropagatorFunctionAdapter() {
		Util.adapt(this, PropagatorCalcScenarioRefreshSelectedSortingPlan.class);
		Util.adapt(this, PropagatorLayerSortingPlansRefresh.class);
		Util.adapt(this, PropagatorCalcScenarioRefreshSortingPlanProducts.class);
		Util.adapt(this, PropagatorCalcScenarioRefreshEndProducts.class);
		Util.adapt(this, PropagatorLayerEndProductRefreshSortingPlans.class);
		
		Util.adapt(this, PropagatorScopeScenario.class);
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
			case cptspPackage.SCENARIO__SORTING_PLANS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSortingPlans()).basicAdd(otherEnd, msgs);
			case cptspPackage.SCENARIO__END_PRODUCTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getEndProducts()).basicAdd(otherEnd, msgs);
			case cptspPackage.SCENARIO__SELECTED_END_PRODUCTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSelectedEndProducts()).basicAdd(otherEnd, msgs);
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
			case cptspPackage.SCENARIO__SORTING_PLANS:
				return ((InternalEList<?>)getSortingPlans()).basicRemove(otherEnd, msgs);
			case cptspPackage.SCENARIO__END_PRODUCTS:
				return ((InternalEList<?>)getEndProducts()).basicRemove(otherEnd, msgs);
			case cptspPackage.SCENARIO__SORTING_PLAN_PRODUCTS:
				return ((InternalEList<?>)getSortingPlanProducts()).basicRemove(otherEnd, msgs);
			case cptspPackage.SCENARIO__SELECTED_END_PRODUCTS:
				return ((InternalEList<?>)getSelectedEndProducts()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case cptspPackage.SCENARIO__SORTING_PLANS:
				return getSortingPlans();
			case cptspPackage.SCENARIO__END_PRODUCTS:
				return getEndProducts();
			case cptspPackage.SCENARIO__SORTING_PLAN_PRODUCTS:
				return getSortingPlanProducts();
			case cptspPackage.SCENARIO__NAME:
				return getName();
			case cptspPackage.SCENARIO__SORTING_LEVELS_WITH_DESTINATION:
				return getSortingLevelsWithDestination();
			case cptspPackage.SCENARIO__SELECTED_SORTING_PLANS:
				return getSelectedSortingPlans();
			case cptspPackage.SCENARIO__SELECTED_END_PRODUCTS:
				return getSelectedEndProducts();
			case cptspPackage.SCENARIO__PRIMARY_PRODUCTS_SELECTED:
				return getPrimaryProductsSelected();
			case cptspPackage.SCENARIO__REMARKS:
				return getRemarks();
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
			case cptspPackage.SCENARIO__SORTING_PLANS:
				getSortingPlans().clear();
				getSortingPlans().addAll((Collection<? extends SortingPlan>)newValue);
				return;
			case cptspPackage.SCENARIO__END_PRODUCTS:
				getEndProducts().clear();
				getEndProducts().addAll((Collection<? extends EndProduct>)newValue);
				return;
			case cptspPackage.SCENARIO__SORTING_PLAN_PRODUCTS:
				getSortingPlanProducts().clear();
				getSortingPlanProducts().addAll((Collection<? extends SortingPlanProduct>)newValue);
				return;
			case cptspPackage.SCENARIO__NAME:
				setName((String)newValue);
				return;
			case cptspPackage.SCENARIO__SORTING_LEVELS_WITH_DESTINATION:
				getSortingLevelsWithDestination().clear();
				getSortingLevelsWithDestination().addAll((Collection<? extends SortingLevelRow>)newValue);
				return;
			case cptspPackage.SCENARIO__SELECTED_SORTING_PLANS:
				getSelectedSortingPlans().clear();
				getSelectedSortingPlans().addAll((Collection<? extends SortingPlanRow>)newValue);
				return;
			case cptspPackage.SCENARIO__SELECTED_END_PRODUCTS:
				getSelectedEndProducts().clear();
				getSelectedEndProducts().addAll((Collection<? extends EndProduct>)newValue);
				return;
			case cptspPackage.SCENARIO__PRIMARY_PRODUCTS_SELECTED:
				getPrimaryProductsSelected().clear();
				getPrimaryProductsSelected().addAll((Collection<? extends SortingPlanProduct>)newValue);
				return;
			case cptspPackage.SCENARIO__REMARKS:
				setRemarks((String)newValue);
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
			case cptspPackage.SCENARIO__SORTING_PLANS:
				getSortingPlans().clear();
				return;
			case cptspPackage.SCENARIO__END_PRODUCTS:
				getEndProducts().clear();
				return;
			case cptspPackage.SCENARIO__SORTING_PLAN_PRODUCTS:
				getSortingPlanProducts().clear();
				return;
			case cptspPackage.SCENARIO__NAME:
				setName(NAME_EDEFAULT);
				return;
			case cptspPackage.SCENARIO__SORTING_LEVELS_WITH_DESTINATION:
				getSortingLevelsWithDestination().clear();
				return;
			case cptspPackage.SCENARIO__SELECTED_SORTING_PLANS:
				getSelectedSortingPlans().clear();
				return;
			case cptspPackage.SCENARIO__SELECTED_END_PRODUCTS:
				getSelectedEndProducts().clear();
				return;
			case cptspPackage.SCENARIO__PRIMARY_PRODUCTS_SELECTED:
				getPrimaryProductsSelected().clear();
				return;
			case cptspPackage.SCENARIO__REMARKS:
				setRemarks(REMARKS_EDEFAULT);
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
			case cptspPackage.SCENARIO__SORTING_PLANS:
				return sortingPlans != null && !sortingPlans.isEmpty();
			case cptspPackage.SCENARIO__END_PRODUCTS:
				return endProducts != null && !endProducts.isEmpty();
			case cptspPackage.SCENARIO__SORTING_PLAN_PRODUCTS:
				return sortingPlanProducts != null && !sortingPlanProducts.isEmpty();
			case cptspPackage.SCENARIO__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case cptspPackage.SCENARIO__SORTING_LEVELS_WITH_DESTINATION:
				return sortingLevelsWithDestination != null && !sortingLevelsWithDestination.isEmpty();
			case cptspPackage.SCENARIO__SELECTED_SORTING_PLANS:
				return selectedSortingPlans != null && !selectedSortingPlans.isEmpty();
			case cptspPackage.SCENARIO__SELECTED_END_PRODUCTS:
				return selectedEndProducts != null && !selectedEndProducts.isEmpty();
			case cptspPackage.SCENARIO__PRIMARY_PRODUCTS_SELECTED:
				return primaryProductsSelected != null && !primaryProductsSelected.isEmpty();
			case cptspPackage.SCENARIO__REMARKS:
				return REMARKS_EDEFAULT == null ? remarks != null : !REMARKS_EDEFAULT.equals(remarks);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == ObjectWithPropagatorFunctionAdapterScope.class) {
			switch (baseOperationID) {
				case PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTION_ADAPTER_SCOPE___REFRESH: return cptspPackage.SCENARIO___REFRESH;
				default: return -1;
			}
		}
		return super.eDerivedOperationID(baseOperationID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case cptspPackage.SCENARIO___REFRESH_SELECTED_SORTING_PLANS:
				refreshSelectedSortingPlans();
				return null;
			case cptspPackage.SCENARIO___REFRESH:
				refresh();
				return null;
			case cptspPackage.SCENARIO___REFRESH_SORTING_PLAN_PRODUCT:
				refreshSortingPlanProduct();
				return null;
			case cptspPackage.SCENARIO___REFRESH_END_PRODUCTS:
				refreshEndProducts();
				return null;
			case cptspPackage.SCENARIO___REFRESH_SORTING_PATHS:
				refreshSortingPaths();
				return null;
			case cptspPackage.SCENARIO___TEST:
				test();
				return null;
			case cptspPackage.SCENARIO___ADD_PROPAGATOR_FUNCTION_ADAPTER:
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
		result.append(" (Name: ");
		result.append(name);
		result.append(", Remarks: ");
		result.append(remarks);
		result.append(')');
		return result.toString();
	}

} //ScenarioImpl
