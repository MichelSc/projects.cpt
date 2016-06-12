/**
 */
package com.misc.projects.CptDatasetLoad.impl;

import com.misc.common.moplaf.dbsynch.dbsynchora.impl.DataSourceJdbcOraThinImpl;
import com.misc.projects.CptDatasetLoad.CptDatasetLoadPackage;
import com.misc.projects.CptDatasetLoad.FPD;
import com.misc.projects.CptDatasetLoad.FPDMasterData;
import com.misc.projects.CptDatasetLoad.FPDSortingPlansSet;
import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>FPD</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.projects.CptDatasetLoad.impl.FPDImpl#getMasterData <em>Master Data</em>}</li>
 *   <li>{@link com.misc.projects.CptDatasetLoad.impl.FPDImpl#getSortingPlansSets <em>Sorting Plans Sets</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FPDImpl extends DataSourceJdbcOraThinImpl implements FPD {
	/**
	 * The cached value of the '{@link #getMasterData() <em>Master Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMasterData()
	 * @generated
	 * @ordered
	 */
	protected FPDMasterData masterData;
	/**
	 * The cached value of the '{@link #getSortingPlansSets() <em>Sorting Plans Sets</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSortingPlansSets()
	 * @generated
	 * @ordered
	 */
	protected EList<FPDSortingPlansSet> sortingPlansSets;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FPDImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CptDatasetLoadPackage.Literals.FPD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FPDMasterData getMasterData() {
		return masterData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMasterData(FPDMasterData newMasterData, NotificationChain msgs) {
		FPDMasterData oldMasterData = masterData;
		masterData = newMasterData;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CptDatasetLoadPackage.FPD__MASTER_DATA, oldMasterData, newMasterData);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMasterData(FPDMasterData newMasterData) {
		if (newMasterData != masterData) {
			NotificationChain msgs = null;
			if (masterData != null)
				msgs = ((InternalEObject)masterData).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CptDatasetLoadPackage.FPD__MASTER_DATA, null, msgs);
			if (newMasterData != null)
				msgs = ((InternalEObject)newMasterData).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CptDatasetLoadPackage.FPD__MASTER_DATA, null, msgs);
			msgs = basicSetMasterData(newMasterData, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CptDatasetLoadPackage.FPD__MASTER_DATA, newMasterData, newMasterData));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FPDSortingPlansSet> getSortingPlansSets() {
		if (sortingPlansSets == null) {
			sortingPlansSets = new EObjectContainmentEList<FPDSortingPlansSet>(FPDSortingPlansSet.class, this, CptDatasetLoadPackage.FPD__SORTING_PLANS_SETS);
		}
		return sortingPlansSets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CptDatasetLoadPackage.FPD__MASTER_DATA:
				return basicSetMasterData(null, msgs);
			case CptDatasetLoadPackage.FPD__SORTING_PLANS_SETS:
				return ((InternalEList<?>)getSortingPlansSets()).basicRemove(otherEnd, msgs);
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
			case CptDatasetLoadPackage.FPD__MASTER_DATA:
				return getMasterData();
			case CptDatasetLoadPackage.FPD__SORTING_PLANS_SETS:
				return getSortingPlansSets();
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
			case CptDatasetLoadPackage.FPD__MASTER_DATA:
				setMasterData((FPDMasterData)newValue);
				return;
			case CptDatasetLoadPackage.FPD__SORTING_PLANS_SETS:
				getSortingPlansSets().clear();
				getSortingPlansSets().addAll((Collection<? extends FPDSortingPlansSet>)newValue);
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
			case CptDatasetLoadPackage.FPD__MASTER_DATA:
				setMasterData((FPDMasterData)null);
				return;
			case CptDatasetLoadPackage.FPD__SORTING_PLANS_SETS:
				getSortingPlansSets().clear();
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
			case CptDatasetLoadPackage.FPD__MASTER_DATA:
				return masterData != null;
			case CptDatasetLoadPackage.FPD__SORTING_PLANS_SETS:
				return sortingPlansSets != null && !sortingPlansSets.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //FPDImpl
