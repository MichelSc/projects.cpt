/**
 */
package cpt.impl;

import cpt.CptPackage;
import cpt.DataSet;
import cpt.Product;
import cpt.SortingPlan;
import cpt.SortingSplit;
import cpt.Volume;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Set</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link cpt.impl.DataSetImpl#getName <em>Name</em>}</li>
 *   <li>{@link cpt.impl.DataSetImpl#getProducts <em>Products</em>}</li>
 *   <li>{@link cpt.impl.DataSetImpl#getSortingPlans <em>Sorting Plans</em>}</li>
 *   <li>{@link cpt.impl.DataSetImpl#getSortingSplits <em>Sorting Splits</em>}</li>
 *   <li>{@link cpt.impl.DataSetImpl#getVolumes <em>Volumes</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DataSetImpl extends MinimalEObjectImpl.Container implements DataSet {
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
	 * The cached value of the '{@link #getProducts() <em>Products</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProducts()
	 * @generated
	 * @ordered
	 */
	protected EList<Product> products;

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
	 * The cached value of the '{@link #getSortingSplits() <em>Sorting Splits</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSortingSplits()
	 * @generated
	 * @ordered
	 */
	protected EList<SortingSplit> sortingSplits;

	/**
	 * The cached value of the '{@link #getVolumes() <em>Volumes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVolumes()
	 * @generated
	 * @ordered
	 */
	protected Volume volumes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataSetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CptPackage.Literals.DATA_SET;
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
			eNotify(new ENotificationImpl(this, Notification.SET, CptPackage.DATA_SET__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Product> getProducts() {
		if (products == null) {
			products = new EObjectContainmentEList<Product>(Product.class, this, CptPackage.DATA_SET__PRODUCTS);
		}
		return products;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SortingPlan> getSortingPlans() {
		if (sortingPlans == null) {
			sortingPlans = new EObjectContainmentEList<SortingPlan>(SortingPlan.class, this, CptPackage.DATA_SET__SORTING_PLANS);
		}
		return sortingPlans;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SortingSplit> getSortingSplits() {
		if (sortingSplits == null) {
			sortingSplits = new EObjectContainmentEList<SortingSplit>(SortingSplit.class, this, CptPackage.DATA_SET__SORTING_SPLITS);
		}
		return sortingSplits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Volume getVolumes() {
		return volumes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVolumes(Volume newVolumes, NotificationChain msgs) {
		Volume oldVolumes = volumes;
		volumes = newVolumes;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CptPackage.DATA_SET__VOLUMES, oldVolumes, newVolumes);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVolumes(Volume newVolumes) {
		if (newVolumes != volumes) {
			NotificationChain msgs = null;
			if (volumes != null)
				msgs = ((InternalEObject)volumes).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CptPackage.DATA_SET__VOLUMES, null, msgs);
			if (newVolumes != null)
				msgs = ((InternalEObject)newVolumes).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CptPackage.DATA_SET__VOLUMES, null, msgs);
			msgs = basicSetVolumes(newVolumes, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CptPackage.DATA_SET__VOLUMES, newVolumes, newVolumes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CptPackage.DATA_SET__PRODUCTS:
				return ((InternalEList<?>)getProducts()).basicRemove(otherEnd, msgs);
			case CptPackage.DATA_SET__SORTING_PLANS:
				return ((InternalEList<?>)getSortingPlans()).basicRemove(otherEnd, msgs);
			case CptPackage.DATA_SET__SORTING_SPLITS:
				return ((InternalEList<?>)getSortingSplits()).basicRemove(otherEnd, msgs);
			case CptPackage.DATA_SET__VOLUMES:
				return basicSetVolumes(null, msgs);
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
			case CptPackage.DATA_SET__NAME:
				return getName();
			case CptPackage.DATA_SET__PRODUCTS:
				return getProducts();
			case CptPackage.DATA_SET__SORTING_PLANS:
				return getSortingPlans();
			case CptPackage.DATA_SET__SORTING_SPLITS:
				return getSortingSplits();
			case CptPackage.DATA_SET__VOLUMES:
				return getVolumes();
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
			case CptPackage.DATA_SET__NAME:
				setName((String)newValue);
				return;
			case CptPackage.DATA_SET__PRODUCTS:
				getProducts().clear();
				getProducts().addAll((Collection<? extends Product>)newValue);
				return;
			case CptPackage.DATA_SET__SORTING_PLANS:
				getSortingPlans().clear();
				getSortingPlans().addAll((Collection<? extends SortingPlan>)newValue);
				return;
			case CptPackage.DATA_SET__SORTING_SPLITS:
				getSortingSplits().clear();
				getSortingSplits().addAll((Collection<? extends SortingSplit>)newValue);
				return;
			case CptPackage.DATA_SET__VOLUMES:
				setVolumes((Volume)newValue);
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
			case CptPackage.DATA_SET__NAME:
				setName(NAME_EDEFAULT);
				return;
			case CptPackage.DATA_SET__PRODUCTS:
				getProducts().clear();
				return;
			case CptPackage.DATA_SET__SORTING_PLANS:
				getSortingPlans().clear();
				return;
			case CptPackage.DATA_SET__SORTING_SPLITS:
				getSortingSplits().clear();
				return;
			case CptPackage.DATA_SET__VOLUMES:
				setVolumes((Volume)null);
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
			case CptPackage.DATA_SET__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case CptPackage.DATA_SET__PRODUCTS:
				return products != null && !products.isEmpty();
			case CptPackage.DATA_SET__SORTING_PLANS:
				return sortingPlans != null && !sortingPlans.isEmpty();
			case CptPackage.DATA_SET__SORTING_SPLITS:
				return sortingSplits != null && !sortingSplits.isEmpty();
			case CptPackage.DATA_SET__VOLUMES:
				return volumes != null;
		}
		return super.eIsSet(featureID);
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
		result.append(')');
		return result.toString();
	}

} //DataSetImpl
