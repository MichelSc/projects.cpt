/**
 */
package com.misc.projects.SortingPlans.impl;


import com.misc.common.moplaf.propagator.Util;
import com.misc.projects.CptDatasetLoad.SortingLevelRow;
import com.misc.projects.SortingPlans.EndProduct;
import com.misc.projects.SortingPlans.Scenario;
import com.misc.projects.SortingPlans.SortingPlan;
import com.misc.projects.SortingPlans.SortingPlanEndProduct;
import com.misc.projects.SortingPlans.SortingPlanOutput;
import com.misc.projects.SortingPlans.SortingPlanOutputVisitor;
import com.misc.projects.SortingPlans.SortingPlanProduct;
import com.misc.projects.SortingPlans.cptspFactory;
import com.misc.projects.SortingPlans.cptspPackage;
import com.misc.projects.SortingPlans.calc.PropagatorCalcEndProductRefreshSortingPlans;
import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import org.eclipse.emf.common.CommonPlugin;
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
 * <ul>
 *   <li>{@link com.misc.projects.SortingPlans.impl.EndProductImpl#getFPDSortingLevel <em>FPD Sorting Level</em>}</li>
 *   <li>{@link com.misc.projects.SortingPlans.impl.EndProductImpl#getSortingPlanProduct <em>Sorting Plan Product</em>}</li>
 *   <li>{@link com.misc.projects.SortingPlans.impl.EndProductImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link com.misc.projects.SortingPlans.impl.EndProductImpl#getSortingPlans <em>Sorting Plans</em>}</li>
 *   <li>{@link com.misc.projects.SortingPlans.impl.EndProductImpl#isWhichSortingPlans <em>Which Sorting Plans</em>}</li>
 *   <li>{@link com.misc.projects.SortingPlans.impl.EndProductImpl#getScenario <em>Scenario</em>}</li>
 * </ul>
 * </p>
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
	protected EList<SortingPlanEndProduct> sortingPlans;

	/**
	 * The default value of the '{@link #isWhichSortingPlans() <em>Which Sorting Plans</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isWhichSortingPlans()
	 * @generated
	 * @ordered
	 */
	protected static final boolean WHICH_SORTING_PLANS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isWhichSortingPlans() <em>Which Sorting Plans</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isWhichSortingPlans()
	 * @generated
	 * @ordered
	 */
	protected boolean whichSortingPlans = WHICH_SORTING_PLANS_EDEFAULT;

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
	public EList<SortingPlanEndProduct> getSortingPlans() {
		if (sortingPlans == null) {
			sortingPlans = new EObjectContainmentWithInverseEList<SortingPlanEndProduct>(SortingPlanEndProduct.class, this, cptspPackage.END_PRODUCT__SORTING_PLANS, cptspPackage.SORTING_PLAN_END_PRODUCT__END_PRODUCT);
		}
		return sortingPlans;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isWhichSortingPlans() {
		return whichSortingPlans;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWhichSortingPlans(boolean newWhichSortingPlans) {
		boolean oldWhichSortingPlans = whichSortingPlans;
		whichSortingPlans = newWhichSortingPlans;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, cptspPackage.END_PRODUCT__WHICH_SORTING_PLANS, oldWhichSortingPlans, whichSortingPlans));
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
	 */
	public void refreshSortingPlans() {
		CommonPlugin.INSTANCE.log("EndProduct "+ this.getDescription()+" begin refresh Sortingplans");
		// calculate the to be
		HashSet<SortingPlanOutput> spoutsToBe = new HashSet<SortingPlanOutput>();
		if ( this.isWhichSortingPlans() 
			&& this.eContainer!=null
			&& this.getSortingPlanProduct()!=null){
			SortingPlanProduct spp = this.getSortingPlanProduct();
			for ( SortingPlanOutput terminallyProduct : spp.getSortingPlansProducing()){
				SortingPlanOutputVisitor.Util.visit(spoutsToBe, terminallyProduct);                
			}
		}
		//traverse the asis
		// remove
		for ( SortingPlanEndProduct spepAsIs: this.getSortingPlans()){
			BasicEList<SortingPlanOutput> spoutToRemove = new BasicEList<SortingPlanOutput>();
			for (SortingPlanOutput spout : spepAsIs.getOutput()){
				if ( spoutsToBe.contains(spout)){
					spoutsToBe.remove(spout);
				} else {
					spoutToRemove.add(spout);
				}
			}
			spepAsIs.getOutput().removeAll(spoutToRemove);
		}
		// create
		for ( SortingPlanOutput spoutToBe : spoutsToBe){
			SortingPlan sp = spoutToBe.getSortingPlan();
			// get
			SortingPlanEndProduct spep = null;
			Iterator<SortingPlanEndProduct> spepIter = this.getSortingPlans().iterator();
			while ( spepIter.hasNext() && spep==null){
				SortingPlanEndProduct spepTmp = spepIter.next();
				if ( spepTmp.getSortingPlan()==sp){
					spep = spepTmp;
				}
			}
			// create 
			if ( spep==null ){
				spep = cptspFactory.eINSTANCE.createSortingPlanEndProduct();
				spep.setSortingPlan(sp);   // not owning
				spep.setEndProduct(this);  // owning
			}
			spep.getOutput().add(spoutToBe);
			spoutToBe.getSortingPlanEndProduct().add(spep);  // N-ary reference
		}
		// clean up
		BasicEList<SortingPlanEndProduct> spepToDelete = new BasicEList<SortingPlanEndProduct>();
		for ( SortingPlanEndProduct spep : this.getSortingPlans()){
			if ( spep.getOutput().size()==0){
				spepToDelete.add(spep);
			}
		}
		for ( SortingPlanEndProduct spep : spepToDelete){
			spep.setSortingPlan(null);  
			spep.setEndProduct(null);  // owning
		}
		CommonPlugin.INSTANCE.log("EndProduct "+ this.getDescription()+" end refresh Sortingplans");
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
			case cptspPackage.END_PRODUCT__WHICH_SORTING_PLANS:
				return isWhichSortingPlans();
			case cptspPackage.END_PRODUCT__SCENARIO:
				return getScenario();
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
				getSortingPlans().addAll((Collection<? extends SortingPlanEndProduct>)newValue);
				return;
			case cptspPackage.END_PRODUCT__WHICH_SORTING_PLANS:
				setWhichSortingPlans((Boolean)newValue);
				return;
			case cptspPackage.END_PRODUCT__SCENARIO:
				setScenario((Scenario)newValue);
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
			case cptspPackage.END_PRODUCT__WHICH_SORTING_PLANS:
				setWhichSortingPlans(WHICH_SORTING_PLANS_EDEFAULT);
				return;
			case cptspPackage.END_PRODUCT__SCENARIO:
				setScenario((Scenario)null);
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
			case cptspPackage.END_PRODUCT__WHICH_SORTING_PLANS:
				return whichSortingPlans != WHICH_SORTING_PLANS_EDEFAULT;
			case cptspPackage.END_PRODUCT__SCENARIO:
				return getScenario() != null;
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
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (whichSortingPlans: ");
		result.append(whichSortingPlans);
		result.append(')');
		return result.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void addPropagatorFunctionAdapter() {
		Util.adapt(this, PropagatorCalcEndProductRefreshSortingPlans.class);
	}


} //EndProductImpl
