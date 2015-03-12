/**
 */
package com.misc.projects.CptDatasetLoad.impl;

import com.misc.common.moplaf.datasetload.impl.TableGroupImpl;

import com.misc.projects.CptDatasetLoad.CptDatasetLoadPackage;
import com.misc.projects.CptDatasetLoad.FPD;
import com.misc.projects.CptDatasetLoad.FPDTableGroup;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>FPD Table Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.misc.projects.CptDatasetLoad.impl.FPDTableGroupImpl#getFPD <em>FPD</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FPDTableGroupImpl extends TableGroupImpl implements FPDTableGroup {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FPDTableGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CptDatasetLoadPackage.Literals.FPD_TABLE_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FPD getFPD() {
		FPD fpd = basicGetFPD();
		return fpd != null && fpd.eIsProxy() ? (FPD)eResolveProxy((InternalEObject)fpd) : fpd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public FPD basicGetFPD() {
		FPD fpd = (FPD)this.getDataSource();
		return fpd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CptDatasetLoadPackage.FPD_TABLE_GROUP__FPD:
				if (resolve) return getFPD();
				return basicGetFPD();
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
			case CptDatasetLoadPackage.FPD_TABLE_GROUP__FPD:
				return basicGetFPD() != null;
		}
		return super.eIsSet(featureID);
	}

} //FPDTableGroupImpl
