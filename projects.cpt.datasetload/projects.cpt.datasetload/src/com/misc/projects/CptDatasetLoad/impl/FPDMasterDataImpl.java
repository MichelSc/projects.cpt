/**
 */
package com.misc.projects.CptDatasetLoad.impl;

import com.misc.common.moplaf.dbsynch.Table;
import com.misc.projects.CptDatasetLoad.CptDatasetLoadPackage;
import com.misc.projects.CptDatasetLoad.FPDMasterData;
import com.misc.projects.CptDatasetLoad.SortingLevelsTable;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>FPD Master Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.projects.CptDatasetLoad.impl.FPDMasterDataImpl#getSortingLevelTable <em>Sorting Level Table</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FPDMasterDataImpl extends FPDTableGroupImpl implements FPDMasterData {
	/**
	 * The cached value of the '{@link #getSortingLevelTable() <em>Sorting Level Table</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSortingLevelTable()
	 * @generated
	 * @ordered
	 */
	protected SortingLevelsTable sortingLevelTable;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FPDMasterDataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CptDatasetLoadPackage.Literals.FPD_MASTER_DATA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SortingLevelsTable getSortingLevelTable() {
		return sortingLevelTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSortingLevelTable(SortingLevelsTable newSortingLevelTable, NotificationChain msgs) {
		SortingLevelsTable oldSortingLevelTable = sortingLevelTable;
		sortingLevelTable = newSortingLevelTable;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CptDatasetLoadPackage.FPD_MASTER_DATA__SORTING_LEVEL_TABLE, oldSortingLevelTable, newSortingLevelTable);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSortingLevelTable(SortingLevelsTable newSortingLevelTable) {
		if (newSortingLevelTable != sortingLevelTable) {
			NotificationChain msgs = null;
			if (sortingLevelTable != null)
				msgs = ((InternalEObject)sortingLevelTable).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CptDatasetLoadPackage.FPD_MASTER_DATA__SORTING_LEVEL_TABLE, null, msgs);
			if (newSortingLevelTable != null)
				msgs = ((InternalEObject)newSortingLevelTable).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CptDatasetLoadPackage.FPD_MASTER_DATA__SORTING_LEVEL_TABLE, null, msgs);
			msgs = basicSetSortingLevelTable(newSortingLevelTable, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CptDatasetLoadPackage.FPD_MASTER_DATA__SORTING_LEVEL_TABLE, newSortingLevelTable, newSortingLevelTable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CptDatasetLoadPackage.FPD_MASTER_DATA__SORTING_LEVEL_TABLE:
				return basicSetSortingLevelTable(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public SortingLevelsTable basicGetSortingLevelTable() {
		SortingLevelsTable sortingLevelTable = null;
		for (  Table table : this.getTables()){
			if ( table instanceof SortingLevelsTable){
				if ( sortingLevelTable==null){
					sortingLevelTable = (SortingLevelsTable)table;
				}
				else {
					// two instances
					throw new UnsupportedOperationException();
				}
			}
			
		}
		if ( sortingLevelTable == null) {
			// no instance
			throw new UnsupportedOperationException();
		}
		
		return sortingLevelTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CptDatasetLoadPackage.FPD_MASTER_DATA__SORTING_LEVEL_TABLE:
				return getSortingLevelTable();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CptDatasetLoadPackage.FPD_MASTER_DATA__SORTING_LEVEL_TABLE:
				setSortingLevelTable((SortingLevelsTable)newValue);
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
			case CptDatasetLoadPackage.FPD_MASTER_DATA__SORTING_LEVEL_TABLE:
				setSortingLevelTable((SortingLevelsTable)null);
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
			case CptDatasetLoadPackage.FPD_MASTER_DATA__SORTING_LEVEL_TABLE:
				return sortingLevelTable != null;
		}
		return super.eIsSet(featureID);
	}

} //FPDMasterDataImpl
