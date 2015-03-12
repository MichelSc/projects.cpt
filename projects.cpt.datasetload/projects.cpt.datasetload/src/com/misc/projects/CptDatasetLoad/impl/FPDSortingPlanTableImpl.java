/**
 */
package com.misc.projects.CptDatasetLoad.impl;

import com.misc.common.moplaf.datasetload.impl.TableImpl;

import com.misc.projects.CptDatasetLoad.CptDatasetLoadPackage;
import com.misc.projects.CptDatasetLoad.FPDSortingPlanTable;
import com.misc.projects.CptDatasetLoad.FPDSortingPlansSet;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>FPD Sorting Plan Table</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.misc.projects.CptDatasetLoad.impl.FPDSortingPlanTableImpl#getFPDSortingPlansSet <em>FPD Sorting Plans Set</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FPDSortingPlanTableImpl extends TableImpl implements FPDSortingPlanTable {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FPDSortingPlanTableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CptDatasetLoadPackage.Literals.FPD_SORTING_PLAN_TABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FPDSortingPlansSet getFPDSortingPlansSet() {
		FPDSortingPlansSet fpdSortingPlansSet = basicGetFPDSortingPlansSet();
		return fpdSortingPlansSet != null && fpdSortingPlansSet.eIsProxy() ? (FPDSortingPlansSet)eResolveProxy((InternalEObject)fpdSortingPlansSet) : fpdSortingPlansSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public FPDSortingPlansSet basicGetFPDSortingPlansSet() {
		FPDSortingPlansSet tableGroup = (FPDSortingPlansSet)this.getTableGroup();
		return tableGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CptDatasetLoadPackage.FPD_SORTING_PLAN_TABLE__FPD_SORTING_PLANS_SET:
				if (resolve) return getFPDSortingPlansSet();
				return basicGetFPDSortingPlansSet();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case CptDatasetLoadPackage.FPD_SORTING_PLAN_TABLE__FPD_SORTING_PLANS_SET:
				return basicGetFPDSortingPlansSet() != null;
		}
		return super.eIsSet(featureID);
	}

} //FPDSortingPlanTableImpl
