/**
 */
package com.misc.projects.CptDatasetLoad.impl;

import com.misc.common.moplaf.datasetload.impl.TableRowImpl;

import com.misc.projects.CptDatasetLoad.CptDatasetLoadPackage;
import com.misc.projects.CptDatasetLoad.FPDSortingPanRow;
import com.misc.projects.CptDatasetLoad.FPDSortingPlanTable;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>FPD Sorting Pan Row</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.misc.projects.CptDatasetLoad.impl.FPDSortingPanRowImpl#getFPDSortingPlanTable <em>FPD Sorting Plan Table</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FPDSortingPanRowImpl extends TableRowImpl implements FPDSortingPanRow {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FPDSortingPanRowImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CptDatasetLoadPackage.Literals.FPD_SORTING_PAN_ROW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FPDSortingPlanTable getFPDSortingPlanTable() {
		FPDSortingPlanTable fpdSortingPlanTable = basicGetFPDSortingPlanTable();
		return fpdSortingPlanTable != null && fpdSortingPlanTable.eIsProxy() ? (FPDSortingPlanTable)eResolveProxy((InternalEObject)fpdSortingPlanTable) : fpdSortingPlanTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public FPDSortingPlanTable basicGetFPDSortingPlanTable() {
		FPDSortingPlanTable table = (FPDSortingPlanTable)this.getTable();
		return table;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CptDatasetLoadPackage.FPD_SORTING_PAN_ROW__FPD_SORTING_PLAN_TABLE:
				if (resolve) return getFPDSortingPlanTable();
				return basicGetFPDSortingPlanTable();
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
			case CptDatasetLoadPackage.FPD_SORTING_PAN_ROW__FPD_SORTING_PLAN_TABLE:
				return basicGetFPDSortingPlanTable() != null;
		}
		return super.eIsSet(featureID);
	}

} //FPDSortingPanRowImpl
