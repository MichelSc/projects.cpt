/**
 */
package com.misc.projects.SortingPlans.impl;

import com.misc.projects.SortingPlans.EndProduct;
import com.misc.projects.SortingPlans.SortingPath;
import com.misc.projects.SortingPlans.SortingPlanOutput;
import com.misc.projects.SortingPlans.SortingPlanProduct;
import com.misc.projects.SortingPlans.cptspPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sorting Path</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.projects.SortingPlans.impl.SortingPathImpl#getOutputLastSegment <em>Output Last Segment</em>}</li>
 *   <li>{@link com.misc.projects.SortingPlans.impl.SortingPathImpl#getBeforeLastSegment <em>Before Last Segment</em>}</li>
 *   <li>{@link com.misc.projects.SortingPlans.impl.SortingPathImpl#getSortedEndProducts <em>Sorted End Products</em>}</li>
 *   <li>{@link com.misc.projects.SortingPlans.impl.SortingPathImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link com.misc.projects.SortingPlans.impl.SortingPathImpl#getProduct <em>Product</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SortingPathImpl extends MinimalEObjectImpl.Container implements SortingPath {
	/**
	 * The cached value of the '{@link #getOutputLastSegment() <em>Output Last Segment</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputLastSegment()
	 * @generated
	 * @ordered
	 */
	protected SortingPlanOutput outputLastSegment;

	/**
	 * The cached value of the '{@link #getBeforeLastSegment() <em>Before Last Segment</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBeforeLastSegment()
	 * @generated
	 * @ordered
	 */
	protected SortingPath beforeLastSegment;

	/**
	 * The cached value of the '{@link #getSortedEndProducts() <em>Sorted End Products</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSortedEndProducts()
	 * @generated
	 * @ordered
	 */
	protected EList<EndProduct> sortedEndProducts;

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
	protected SortingPathImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return cptspPackage.Literals.SORTING_PATH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SortingPlanOutput getOutputLastSegment() {
		if (outputLastSegment != null && outputLastSegment.eIsProxy()) {
			InternalEObject oldOutputLastSegment = (InternalEObject)outputLastSegment;
			outputLastSegment = (SortingPlanOutput)eResolveProxy(oldOutputLastSegment);
			if (outputLastSegment != oldOutputLastSegment) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, cptspPackage.SORTING_PATH__OUTPUT_LAST_SEGMENT, oldOutputLastSegment, outputLastSegment));
			}
		}
		return outputLastSegment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SortingPlanOutput basicGetOutputLastSegment() {
		return outputLastSegment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutputLastSegment(SortingPlanOutput newOutputLastSegment) {
		SortingPlanOutput oldOutputLastSegment = outputLastSegment;
		outputLastSegment = newOutputLastSegment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, cptspPackage.SORTING_PATH__OUTPUT_LAST_SEGMENT, oldOutputLastSegment, outputLastSegment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SortingPath getBeforeLastSegment() {
		if (beforeLastSegment != null && beforeLastSegment.eIsProxy()) {
			InternalEObject oldBeforeLastSegment = (InternalEObject)beforeLastSegment;
			beforeLastSegment = (SortingPath)eResolveProxy(oldBeforeLastSegment);
			if (beforeLastSegment != oldBeforeLastSegment) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, cptspPackage.SORTING_PATH__BEFORE_LAST_SEGMENT, oldBeforeLastSegment, beforeLastSegment));
			}
		}
		return beforeLastSegment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SortingPath basicGetBeforeLastSegment() {
		return beforeLastSegment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBeforeLastSegment(SortingPath newBeforeLastSegment) {
		SortingPath oldBeforeLastSegment = beforeLastSegment;
		beforeLastSegment = newBeforeLastSegment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, cptspPackage.SORTING_PATH__BEFORE_LAST_SEGMENT, oldBeforeLastSegment, beforeLastSegment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EndProduct> getSortedEndProducts() {
		if (sortedEndProducts == null) {
			sortedEndProducts = new EObjectResolvingEList<EndProduct>(EndProduct.class, this, cptspPackage.SORTING_PATH__SORTED_END_PRODUCTS);
		}
		return sortedEndProducts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		// TODO: implement this method to return the 'Description' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SortingPlanProduct getProduct() {
		if (eContainerFeatureID() != cptspPackage.SORTING_PATH__PRODUCT) return null;
		return (SortingPlanProduct)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProduct(SortingPlanProduct newProduct, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newProduct, cptspPackage.SORTING_PATH__PRODUCT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProduct(SortingPlanProduct newProduct) {
		if (newProduct != eInternalContainer() || (eContainerFeatureID() != cptspPackage.SORTING_PATH__PRODUCT && newProduct != null)) {
			if (EcoreUtil.isAncestor(this, newProduct))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newProduct != null)
				msgs = ((InternalEObject)newProduct).eInverseAdd(this, cptspPackage.SORTING_PLAN_PRODUCT__SORTING_PATHS, SortingPlanProduct.class, msgs);
			msgs = basicSetProduct(newProduct, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, cptspPackage.SORTING_PATH__PRODUCT, newProduct, newProduct));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case cptspPackage.SORTING_PATH__PRODUCT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetProduct((SortingPlanProduct)otherEnd, msgs);
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
			case cptspPackage.SORTING_PATH__PRODUCT:
				return basicSetProduct(null, msgs);
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
			case cptspPackage.SORTING_PATH__PRODUCT:
				return eInternalContainer().eInverseRemove(this, cptspPackage.SORTING_PLAN_PRODUCT__SORTING_PATHS, SortingPlanProduct.class, msgs);
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
			case cptspPackage.SORTING_PATH__OUTPUT_LAST_SEGMENT:
				if (resolve) return getOutputLastSegment();
				return basicGetOutputLastSegment();
			case cptspPackage.SORTING_PATH__BEFORE_LAST_SEGMENT:
				if (resolve) return getBeforeLastSegment();
				return basicGetBeforeLastSegment();
			case cptspPackage.SORTING_PATH__SORTED_END_PRODUCTS:
				return getSortedEndProducts();
			case cptspPackage.SORTING_PATH__DESCRIPTION:
				return getDescription();
			case cptspPackage.SORTING_PATH__PRODUCT:
				return getProduct();
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
			case cptspPackage.SORTING_PATH__OUTPUT_LAST_SEGMENT:
				setOutputLastSegment((SortingPlanOutput)newValue);
				return;
			case cptspPackage.SORTING_PATH__BEFORE_LAST_SEGMENT:
				setBeforeLastSegment((SortingPath)newValue);
				return;
			case cptspPackage.SORTING_PATH__SORTED_END_PRODUCTS:
				getSortedEndProducts().clear();
				getSortedEndProducts().addAll((Collection<? extends EndProduct>)newValue);
				return;
			case cptspPackage.SORTING_PATH__PRODUCT:
				setProduct((SortingPlanProduct)newValue);
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
			case cptspPackage.SORTING_PATH__OUTPUT_LAST_SEGMENT:
				setOutputLastSegment((SortingPlanOutput)null);
				return;
			case cptspPackage.SORTING_PATH__BEFORE_LAST_SEGMENT:
				setBeforeLastSegment((SortingPath)null);
				return;
			case cptspPackage.SORTING_PATH__SORTED_END_PRODUCTS:
				getSortedEndProducts().clear();
				return;
			case cptspPackage.SORTING_PATH__PRODUCT:
				setProduct((SortingPlanProduct)null);
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
			case cptspPackage.SORTING_PATH__OUTPUT_LAST_SEGMENT:
				return outputLastSegment != null;
			case cptspPackage.SORTING_PATH__BEFORE_LAST_SEGMENT:
				return beforeLastSegment != null;
			case cptspPackage.SORTING_PATH__SORTED_END_PRODUCTS:
				return sortedEndProducts != null && !sortedEndProducts.isEmpty();
			case cptspPackage.SORTING_PATH__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? getDescription() != null : !DESCRIPTION_EDEFAULT.equals(getDescription());
			case cptspPackage.SORTING_PATH__PRODUCT:
				return getProduct() != null;
		}
		return super.eIsSet(featureID);
	}

} //SortingPathImpl
