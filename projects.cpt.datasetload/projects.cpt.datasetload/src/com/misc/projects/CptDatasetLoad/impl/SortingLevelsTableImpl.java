/**
 */
package com.misc.projects.CptDatasetLoad.impl;

import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;
import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import com.misc.common.moplaf.dbsynch.EnumColumnType;
import com.misc.common.moplaf.dbsynch.TableRow;
import com.misc.common.moplaf.dbsynch.impl.TableRowKeyImpl;
import com.misc.projects.CptDatasetLoad.CptDatasetLoadFactory;
import com.misc.projects.CptDatasetLoad.CptDatasetLoadPackage;
import com.misc.projects.CptDatasetLoad.SortingLevelRow;
import com.misc.projects.CptDatasetLoad.SortingLevelsTable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sorting Levels Table</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.projects.CptDatasetLoad.impl.SortingLevelsTableImpl#getSortinglevelRow <em>Sortinglevel Row</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SortingLevelsTableImpl extends MasterDataTableImpl implements SortingLevelsTable {
	/**
	 * The cached value of the '{@link #getSortinglevelRow() <em>Sortinglevel Row</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSortinglevelRow()
	 * @generated
	 * @ordered
	 */
	protected EList<SortingLevelRow> sortinglevelRow;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SortingLevelsTableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CptDatasetLoadPackage.Literals.SORTING_LEVELS_TABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SortingLevelRow> getSortinglevelRow() {
		if (sortinglevelRow == null) {
			sortinglevelRow = new EObjectContainmentEList<SortingLevelRow>(SortingLevelRow.class, this, CptDatasetLoadPackage.SORTING_LEVELS_TABLE__SORTINGLEVEL_ROW);
		}
		return sortinglevelRow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public SortingLevelRow getRow(BigDecimal sk) {
    	Object[] keyObjects = new Object[1];
   		keyObjects[0] = sk;
    	TableRowKeyImpl key = new TableRowKeyImpl(keyObjects);
    	TableRow row = this.getRow(key);
    	return (SortingLevelRow) row;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CptDatasetLoadPackage.SORTING_LEVELS_TABLE__SORTINGLEVEL_ROW:
				return ((InternalEList<?>)getSortinglevelRow()).basicRemove(otherEnd, msgs);
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
			case CptDatasetLoadPackage.SORTING_LEVELS_TABLE__SORTINGLEVEL_ROW:
				return getSortinglevelRow();
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
			case CptDatasetLoadPackage.SORTING_LEVELS_TABLE__SORTINGLEVEL_ROW:
				getSortinglevelRow().clear();
				getSortinglevelRow().addAll((Collection<? extends SortingLevelRow>)newValue);
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
			case CptDatasetLoadPackage.SORTING_LEVELS_TABLE__SORTINGLEVEL_ROW:
				getSortinglevelRow().clear();
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
			case CptDatasetLoadPackage.SORTING_LEVELS_TABLE__SORTINGLEVEL_ROW:
				return sortinglevelRow != null && !sortinglevelRow.isEmpty();
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
			case CptDatasetLoadPackage.SORTING_LEVELS_TABLE___GET_ROW__BIGDECIMAL:
				return getRow((BigDecimal)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	/* (non-Javadoc)
	 * @see com.misc.common.moplaf.datasetload.impl.TableImpl#NewRow()
	 */
	@Override
	public TableRow constructRow() {
		SortingLevelRow newSortingLevelRow = CptDatasetLoadFactory.eINSTANCE.createSortingLevelRow();
		this.getSortinglevelRow().add(newSortingLevelRow);
		return newSortingLevelRow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	@Override
	protected void refreshMetaDataImpl() {
		this.setTableName("v_avcs_sorting");
		this.addColumn(true,  "AVCS_SORTING_LEVEL_SK", EnumColumnType.ENUM_COLUMN_TYPE_BIGFLOAT, CptDatasetLoadPackage.Literals.SORTING_LEVEL_ROW__SORTING_LEVEL_SK);
		this.addColumn(false, "AVCS_SORTING_LEVEL",    EnumColumnType.ENUM_COLUMN_TYPE_CHAR,     CptDatasetLoadPackage.Literals.SORTING_LEVEL_ROW__SORTING_LEVEL_NAME);
	}
	
} //SortingLevelsTableImpl
