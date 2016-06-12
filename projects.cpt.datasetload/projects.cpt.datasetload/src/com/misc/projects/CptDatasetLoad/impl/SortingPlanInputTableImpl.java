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
import com.misc.projects.CptDatasetLoad.SortingPlanInputRow;
import com.misc.projects.CptDatasetLoad.SortingPlanInputTable;
import com.misc.projects.CptDatasetLoad.SortingPlanOutputRow;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sorting Plan Input Table</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.projects.CptDatasetLoad.impl.SortingPlanInputTableImpl#getSortingPlanInputRow <em>Sorting Plan Input Row</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SortingPlanInputTableImpl extends FPDSortingPlanTableImpl implements SortingPlanInputTable {
	/**
	 * The cached value of the '{@link #getSortingPlanInputRow() <em>Sorting Plan Input Row</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSortingPlanInputRow()
	 * @generated
	 * @ordered
	 */
	protected EList<SortingPlanInputRow> sortingPlanInputRow;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SortingPlanInputTableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CptDatasetLoadPackage.Literals.SORTING_PLAN_INPUT_TABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SortingPlanInputRow> getSortingPlanInputRow() {
		if (sortingPlanInputRow == null) {
			sortingPlanInputRow = new EObjectContainmentEList<SortingPlanInputRow>(SortingPlanInputRow.class, this, CptDatasetLoadPackage.SORTING_PLAN_INPUT_TABLE__SORTING_PLAN_INPUT_ROW);
		}
		return sortingPlanInputRow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public SortingPlanOutputRow getRow(BigDecimal sortingPlanSk, BigDecimal sortingLevelSk, BigDecimal mechanizationLevelSk, BigDecimal throughputTypeSk) {
    	Object[] keyObjects = new Object[4];
   		keyObjects[0] = sortingPlanSk;
   		keyObjects[1] = sortingLevelSk;
   		keyObjects[2] = mechanizationLevelSk;
   		keyObjects[3] = throughputTypeSk;
    	TableRowKeyImpl key = new TableRowKeyImpl(keyObjects);
    	TableRow row = this.getRow(key);
    	return (SortingPlanOutputRow) row;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CptDatasetLoadPackage.SORTING_PLAN_INPUT_TABLE__SORTING_PLAN_INPUT_ROW:
				return ((InternalEList<?>)getSortingPlanInputRow()).basicRemove(otherEnd, msgs);
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
			case CptDatasetLoadPackage.SORTING_PLAN_INPUT_TABLE__SORTING_PLAN_INPUT_ROW:
				return getSortingPlanInputRow();
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
			case CptDatasetLoadPackage.SORTING_PLAN_INPUT_TABLE__SORTING_PLAN_INPUT_ROW:
				getSortingPlanInputRow().clear();
				getSortingPlanInputRow().addAll((Collection<? extends SortingPlanInputRow>)newValue);
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
			case CptDatasetLoadPackage.SORTING_PLAN_INPUT_TABLE__SORTING_PLAN_INPUT_ROW:
				getSortingPlanInputRow().clear();
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
			case CptDatasetLoadPackage.SORTING_PLAN_INPUT_TABLE__SORTING_PLAN_INPUT_ROW:
				return sortingPlanInputRow != null && !sortingPlanInputRow.isEmpty();
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
			case CptDatasetLoadPackage.SORTING_PLAN_INPUT_TABLE___GET_ROW__BIGDECIMAL_BIGDECIMAL_BIGDECIMAL_BIGDECIMAL:
				return getRow((BigDecimal)arguments.get(0), (BigDecimal)arguments.get(1), (BigDecimal)arguments.get(2), (BigDecimal)arguments.get(3));
		}
		return super.eInvoke(operationID, arguments);
	}
	
	/* (non-Javadoc)
	 * @see com.misc.common.moplaf.datasetload.impl.TableImpl#NewRow()
	 */
	@Override
	public TableRow constructRow() {
		SortingPlanInputRow newSortingPlanInputRow = CptDatasetLoadFactory.eINSTANCE.createSortingPlanInputRow();
		this.getSortingPlanInputRow().add(newSortingPlanInputRow);
		return newSortingPlanInputRow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	@Override
	protected void refreshMetaDataImpl() {
		this.setTableName("V_SORTING_LEVEL_ASSOC_PLAN");
//		this.setWhereClause(" validto > ? and validfrom < ? ");
		this.addColumn(true,  "sorting_plan_sk",       EnumColumnType.ENUM_COLUMN_TYPE_INT, CptDatasetLoadPackage.Literals.SORTING_PLAN_INPUT_ROW__SORTING_PLAN_SK);
		this.addColumn(true, "AVCS_SORTING_LEVEL_SK",  EnumColumnType.ENUM_COLUMN_TYPE_INT, CptDatasetLoadPackage.Literals.SORTING_PLAN_INPUT_ROW__SORTING_LEVEL_AVCS_SK);
		this.addColumn(true, "MECHANIZATION_LEVEL_SK", EnumColumnType.ENUM_COLUMN_TYPE_INT, CptDatasetLoadPackage.Literals.SORTING_PLAN_INPUT_ROW__MECHANIZATION_LEVEL_SK);
		this.addColumn(true, "THROUGHPUT_TYPE_SK",     EnumColumnType.ENUM_COLUMN_TYPE_INT, CptDatasetLoadPackage.Literals.SORTING_PLAN_INPUT_ROW__THROUGHPUT_TYPE_SK);
	}

} //SortingPlanInputTableImpl
