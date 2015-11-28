/**
 */
package com.misc.projects.SortingPlans.impl;

import com.misc.projects.CptDatasetLoad.SortingLevelRow;
import com.misc.projects.SortingPlans.EndProduct;
import com.misc.projects.SortingPlans.SortingPlanInput;
import com.misc.projects.SortingPlans.SortingPlanOutput;
import com.misc.projects.SortingPlans.SortingPlanProduct;
import com.misc.projects.SortingPlans.cptspPackage;

import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sorting Plan Product</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.projects.SortingPlans.impl.SortingPlanProductImpl#getFPDSortingLevel <em>FPD Sorting Level</em>}</li>
 *   <li>{@link com.misc.projects.SortingPlans.impl.SortingPlanProductImpl#getSortingPlansProducing <em>Sorting Plans Producing</em>}</li>
 *   <li>{@link com.misc.projects.SortingPlans.impl.SortingPlanProductImpl#getSortingPlansAccepting <em>Sorting Plans Accepting</em>}</li>
 *   <li>{@link com.misc.projects.SortingPlans.impl.SortingPlanProductImpl#getSortingLevelAVCSSk <em>Sorting Level AVCS Sk</em>}</li>
 *   <li>{@link com.misc.projects.SortingPlans.impl.SortingPlanProductImpl#getMechanizationLevelSk <em>Mechanization Level Sk</em>}</li>
 *   <li>{@link com.misc.projects.SortingPlans.impl.SortingPlanProductImpl#getThroughputTypeSk <em>Throughput Type Sk</em>}</li>
 *   <li>{@link com.misc.projects.SortingPlans.impl.SortingPlanProductImpl#getDestinationSk <em>Destination Sk</em>}</li>
 *   <li>{@link com.misc.projects.SortingPlans.impl.SortingPlanProductImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link com.misc.projects.SortingPlans.impl.SortingPlanProductImpl#getEndProduct <em>End Product</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SortingPlanProductImpl extends MinimalEObjectImpl.Container implements SortingPlanProduct {
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
	 * The cached value of the '{@link #getSortingPlansProducing() <em>Sorting Plans Producing</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSortingPlansProducing()
	 * @generated
	 * @ordered
	 */
	protected EList<SortingPlanOutput> sortingPlansProducing;

	/**
	 * The cached value of the '{@link #getSortingPlansAccepting() <em>Sorting Plans Accepting</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSortingPlansAccepting()
	 * @generated
	 * @ordered
	 */
	protected EList<SortingPlanInput> sortingPlansAccepting;

	/**
	 * The default value of the '{@link #getSortingLevelAVCSSk() <em>Sorting Level AVCS Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSortingLevelAVCSSk()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal SORTING_LEVEL_AVCS_SK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSortingLevelAVCSSk() <em>Sorting Level AVCS Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSortingLevelAVCSSk()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal sortingLevelAVCSSk = SORTING_LEVEL_AVCS_SK_EDEFAULT;

	/**
	 * The default value of the '{@link #getMechanizationLevelSk() <em>Mechanization Level Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMechanizationLevelSk()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal MECHANIZATION_LEVEL_SK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMechanizationLevelSk() <em>Mechanization Level Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMechanizationLevelSk()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal mechanizationLevelSk = MECHANIZATION_LEVEL_SK_EDEFAULT;

	/**
	 * The default value of the '{@link #getThroughputTypeSk() <em>Throughput Type Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThroughputTypeSk()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal THROUGHPUT_TYPE_SK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getThroughputTypeSk() <em>Throughput Type Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThroughputTypeSk()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal throughputTypeSk = THROUGHPUT_TYPE_SK_EDEFAULT;

	/**
	 * The default value of the '{@link #getDestinationSk() <em>Destination Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestinationSk()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal DESTINATION_SK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDestinationSk() <em>Destination Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestinationSk()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal destinationSk = DESTINATION_SK_EDEFAULT;

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
	 * The cached value of the '{@link #getEndProduct() <em>End Product</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndProduct()
	 * @generated
	 * @ordered
	 */
	protected EndProduct endProduct;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SortingPlanProductImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return cptspPackage.Literals.SORTING_PLAN_PRODUCT;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, cptspPackage.SORTING_PLAN_PRODUCT__FPD_SORTING_LEVEL, oldFPDSortingLevel, fpdSortingLevel));
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
			eNotify(new ENotificationImpl(this, Notification.SET, cptspPackage.SORTING_PLAN_PRODUCT__FPD_SORTING_LEVEL, oldFPDSortingLevel, fpdSortingLevel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SortingPlanOutput> getSortingPlansProducing() {
		if (sortingPlansProducing == null) {
			sortingPlansProducing = new EObjectWithInverseResolvingEList<SortingPlanOutput>(SortingPlanOutput.class, this, cptspPackage.SORTING_PLAN_PRODUCT__SORTING_PLANS_PRODUCING, cptspPackage.SORTING_PLAN_OUTPUT__OUTPUT_PRODUCT);
		}
		return sortingPlansProducing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SortingPlanInput> getSortingPlansAccepting() {
		if (sortingPlansAccepting == null) {
			sortingPlansAccepting = new EObjectWithInverseResolvingEList<SortingPlanInput>(SortingPlanInput.class, this, cptspPackage.SORTING_PLAN_PRODUCT__SORTING_PLANS_ACCEPTING, cptspPackage.SORTING_PLAN_INPUT__INPUT_PRODUCT);
		}
		return sortingPlansAccepting;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal getSortingLevelAVCSSk() {
		return sortingLevelAVCSSk;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSortingLevelAVCSSk(BigDecimal newSortingLevelAVCSSk) {
		BigDecimal oldSortingLevelAVCSSk = sortingLevelAVCSSk;
		sortingLevelAVCSSk = newSortingLevelAVCSSk;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, cptspPackage.SORTING_PLAN_PRODUCT__SORTING_LEVEL_AVCS_SK, oldSortingLevelAVCSSk, sortingLevelAVCSSk));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal getMechanizationLevelSk() {
		return mechanizationLevelSk;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMechanizationLevelSk(BigDecimal newMechanizationLevelSk) {
		BigDecimal oldMechanizationLevelSk = mechanizationLevelSk;
		mechanizationLevelSk = newMechanizationLevelSk;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, cptspPackage.SORTING_PLAN_PRODUCT__MECHANIZATION_LEVEL_SK, oldMechanizationLevelSk, mechanizationLevelSk));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal getThroughputTypeSk() {
		return throughputTypeSk;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThroughputTypeSk(BigDecimal newThroughputTypeSk) {
		BigDecimal oldThroughputTypeSk = throughputTypeSk;
		throughputTypeSk = newThroughputTypeSk;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, cptspPackage.SORTING_PLAN_PRODUCT__THROUGHPUT_TYPE_SK, oldThroughputTypeSk, throughputTypeSk));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal getDestinationSk() {
		return destinationSk;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDestinationSk(BigDecimal newDestinationSk) {
		BigDecimal oldDestinationSk = destinationSk;
		destinationSk = newDestinationSk;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, cptspPackage.SORTING_PLAN_PRODUCT__DESTINATION_SK, oldDestinationSk, destinationSk));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public String getDescription() {
		SortingLevelRow sl = this.getFPDSortingLevel();
		String desc = String.format("%d/%d/%s/%d", 
                this.getThroughputTypeSk().intValue(),
                this.getMechanizationLevelSk().intValue(),
				sl==null?"null":sl.getDescription(),
                this.getDestinationSk().intValue());
		return desc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EndProduct getEndProduct() {
		if (endProduct != null && endProduct.eIsProxy()) {
			InternalEObject oldEndProduct = (InternalEObject)endProduct;
			endProduct = (EndProduct)eResolveProxy(oldEndProduct);
			if (endProduct != oldEndProduct) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, cptspPackage.SORTING_PLAN_PRODUCT__END_PRODUCT, oldEndProduct, endProduct));
			}
		}
		return endProduct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EndProduct basicGetEndProduct() {
		return endProduct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEndProduct(EndProduct newEndProduct, NotificationChain msgs) {
		EndProduct oldEndProduct = endProduct;
		endProduct = newEndProduct;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, cptspPackage.SORTING_PLAN_PRODUCT__END_PRODUCT, oldEndProduct, newEndProduct);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndProduct(EndProduct newEndProduct) {
		if (newEndProduct != endProduct) {
			NotificationChain msgs = null;
			if (endProduct != null)
				msgs = ((InternalEObject)endProduct).eInverseRemove(this, cptspPackage.END_PRODUCT__SORTING_PLAN_PRODUCT, EndProduct.class, msgs);
			if (newEndProduct != null)
				msgs = ((InternalEObject)newEndProduct).eInverseAdd(this, cptspPackage.END_PRODUCT__SORTING_PLAN_PRODUCT, EndProduct.class, msgs);
			msgs = basicSetEndProduct(newEndProduct, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, cptspPackage.SORTING_PLAN_PRODUCT__END_PRODUCT, newEndProduct, newEndProduct));
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
			case cptspPackage.SORTING_PLAN_PRODUCT__SORTING_PLANS_PRODUCING:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSortingPlansProducing()).basicAdd(otherEnd, msgs);
			case cptspPackage.SORTING_PLAN_PRODUCT__SORTING_PLANS_ACCEPTING:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSortingPlansAccepting()).basicAdd(otherEnd, msgs);
			case cptspPackage.SORTING_PLAN_PRODUCT__END_PRODUCT:
				if (endProduct != null)
					msgs = ((InternalEObject)endProduct).eInverseRemove(this, cptspPackage.END_PRODUCT__SORTING_PLAN_PRODUCT, EndProduct.class, msgs);
				return basicSetEndProduct((EndProduct)otherEnd, msgs);
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
			case cptspPackage.SORTING_PLAN_PRODUCT__SORTING_PLANS_PRODUCING:
				return ((InternalEList<?>)getSortingPlansProducing()).basicRemove(otherEnd, msgs);
			case cptspPackage.SORTING_PLAN_PRODUCT__SORTING_PLANS_ACCEPTING:
				return ((InternalEList<?>)getSortingPlansAccepting()).basicRemove(otherEnd, msgs);
			case cptspPackage.SORTING_PLAN_PRODUCT__END_PRODUCT:
				return basicSetEndProduct(null, msgs);
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
			case cptspPackage.SORTING_PLAN_PRODUCT__FPD_SORTING_LEVEL:
				if (resolve) return getFPDSortingLevel();
				return basicGetFPDSortingLevel();
			case cptspPackage.SORTING_PLAN_PRODUCT__SORTING_PLANS_PRODUCING:
				return getSortingPlansProducing();
			case cptspPackage.SORTING_PLAN_PRODUCT__SORTING_PLANS_ACCEPTING:
				return getSortingPlansAccepting();
			case cptspPackage.SORTING_PLAN_PRODUCT__SORTING_LEVEL_AVCS_SK:
				return getSortingLevelAVCSSk();
			case cptspPackage.SORTING_PLAN_PRODUCT__MECHANIZATION_LEVEL_SK:
				return getMechanizationLevelSk();
			case cptspPackage.SORTING_PLAN_PRODUCT__THROUGHPUT_TYPE_SK:
				return getThroughputTypeSk();
			case cptspPackage.SORTING_PLAN_PRODUCT__DESTINATION_SK:
				return getDestinationSk();
			case cptspPackage.SORTING_PLAN_PRODUCT__DESCRIPTION:
				return getDescription();
			case cptspPackage.SORTING_PLAN_PRODUCT__END_PRODUCT:
				if (resolve) return getEndProduct();
				return basicGetEndProduct();
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
			case cptspPackage.SORTING_PLAN_PRODUCT__FPD_SORTING_LEVEL:
				setFPDSortingLevel((SortingLevelRow)newValue);
				return;
			case cptspPackage.SORTING_PLAN_PRODUCT__SORTING_PLANS_PRODUCING:
				getSortingPlansProducing().clear();
				getSortingPlansProducing().addAll((Collection<? extends SortingPlanOutput>)newValue);
				return;
			case cptspPackage.SORTING_PLAN_PRODUCT__SORTING_PLANS_ACCEPTING:
				getSortingPlansAccepting().clear();
				getSortingPlansAccepting().addAll((Collection<? extends SortingPlanInput>)newValue);
				return;
			case cptspPackage.SORTING_PLAN_PRODUCT__SORTING_LEVEL_AVCS_SK:
				setSortingLevelAVCSSk((BigDecimal)newValue);
				return;
			case cptspPackage.SORTING_PLAN_PRODUCT__MECHANIZATION_LEVEL_SK:
				setMechanizationLevelSk((BigDecimal)newValue);
				return;
			case cptspPackage.SORTING_PLAN_PRODUCT__THROUGHPUT_TYPE_SK:
				setThroughputTypeSk((BigDecimal)newValue);
				return;
			case cptspPackage.SORTING_PLAN_PRODUCT__DESTINATION_SK:
				setDestinationSk((BigDecimal)newValue);
				return;
			case cptspPackage.SORTING_PLAN_PRODUCT__END_PRODUCT:
				setEndProduct((EndProduct)newValue);
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
			case cptspPackage.SORTING_PLAN_PRODUCT__FPD_SORTING_LEVEL:
				setFPDSortingLevel((SortingLevelRow)null);
				return;
			case cptspPackage.SORTING_PLAN_PRODUCT__SORTING_PLANS_PRODUCING:
				getSortingPlansProducing().clear();
				return;
			case cptspPackage.SORTING_PLAN_PRODUCT__SORTING_PLANS_ACCEPTING:
				getSortingPlansAccepting().clear();
				return;
			case cptspPackage.SORTING_PLAN_PRODUCT__SORTING_LEVEL_AVCS_SK:
				setSortingLevelAVCSSk(SORTING_LEVEL_AVCS_SK_EDEFAULT);
				return;
			case cptspPackage.SORTING_PLAN_PRODUCT__MECHANIZATION_LEVEL_SK:
				setMechanizationLevelSk(MECHANIZATION_LEVEL_SK_EDEFAULT);
				return;
			case cptspPackage.SORTING_PLAN_PRODUCT__THROUGHPUT_TYPE_SK:
				setThroughputTypeSk(THROUGHPUT_TYPE_SK_EDEFAULT);
				return;
			case cptspPackage.SORTING_PLAN_PRODUCT__DESTINATION_SK:
				setDestinationSk(DESTINATION_SK_EDEFAULT);
				return;
			case cptspPackage.SORTING_PLAN_PRODUCT__END_PRODUCT:
				setEndProduct((EndProduct)null);
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
			case cptspPackage.SORTING_PLAN_PRODUCT__FPD_SORTING_LEVEL:
				return fpdSortingLevel != null;
			case cptspPackage.SORTING_PLAN_PRODUCT__SORTING_PLANS_PRODUCING:
				return sortingPlansProducing != null && !sortingPlansProducing.isEmpty();
			case cptspPackage.SORTING_PLAN_PRODUCT__SORTING_PLANS_ACCEPTING:
				return sortingPlansAccepting != null && !sortingPlansAccepting.isEmpty();
			case cptspPackage.SORTING_PLAN_PRODUCT__SORTING_LEVEL_AVCS_SK:
				return SORTING_LEVEL_AVCS_SK_EDEFAULT == null ? sortingLevelAVCSSk != null : !SORTING_LEVEL_AVCS_SK_EDEFAULT.equals(sortingLevelAVCSSk);
			case cptspPackage.SORTING_PLAN_PRODUCT__MECHANIZATION_LEVEL_SK:
				return MECHANIZATION_LEVEL_SK_EDEFAULT == null ? mechanizationLevelSk != null : !MECHANIZATION_LEVEL_SK_EDEFAULT.equals(mechanizationLevelSk);
			case cptspPackage.SORTING_PLAN_PRODUCT__THROUGHPUT_TYPE_SK:
				return THROUGHPUT_TYPE_SK_EDEFAULT == null ? throughputTypeSk != null : !THROUGHPUT_TYPE_SK_EDEFAULT.equals(throughputTypeSk);
			case cptspPackage.SORTING_PLAN_PRODUCT__DESTINATION_SK:
				return DESTINATION_SK_EDEFAULT == null ? destinationSk != null : !DESTINATION_SK_EDEFAULT.equals(destinationSk);
			case cptspPackage.SORTING_PLAN_PRODUCT__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? getDescription() != null : !DESCRIPTION_EDEFAULT.equals(getDescription());
			case cptspPackage.SORTING_PLAN_PRODUCT__END_PRODUCT:
				return endProduct != null;
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
			case cptspPackage.SORTING_PLAN_PRODUCT___ADD_PROPAGATOR_FUNCTION_ADAPTER:
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
		result.append(" (SortingLevelAVCSSk: ");
		result.append(sortingLevelAVCSSk);
		result.append(", MechanizationLevelSk: ");
		result.append(mechanizationLevelSk);
		result.append(", ThroughputTypeSk: ");
		result.append(throughputTypeSk);
		result.append(", DestinationSk: ");
		result.append(destinationSk);
		result.append(')');
		return result.toString();
	}

} //SortingPlanProductImpl
