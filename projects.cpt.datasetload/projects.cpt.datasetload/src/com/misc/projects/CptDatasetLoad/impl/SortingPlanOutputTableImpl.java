/**
 */
package com.misc.projects.CptDatasetLoad.impl;

import com.misc.common.moplaf.datasetload.TableRow;
import com.misc.common.moplaf.datasetload.impl.TableRowKeyImpl;
import com.misc.projects.CptDatasetLoad.CptDatasetLoadFactory;
import com.misc.projects.CptDatasetLoad.CptDatasetLoadPackage;
import com.misc.projects.CptDatasetLoad.SortingPlanOutputRow;
import com.misc.projects.CptDatasetLoad.SortingPlanOutputTable;

import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;
import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sorting Plan Output Table</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.misc.projects.CptDatasetLoad.impl.SortingPlanOutputTableImpl#getSortingPlanOutputRow <em>Sorting Plan Output Row</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SortingPlanOutputTableImpl extends FPDSortingPlanTableImpl implements SortingPlanOutputTable {
	/**
	 * The cached value of the '{@link #getSortingPlanOutputRow() <em>Sorting Plan Output Row</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSortingPlanOutputRow()
	 * @generated
	 * @ordered
	 */
	protected EList<SortingPlanOutputRow> sortingPlanOutputRow;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SortingPlanOutputTableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CptDatasetLoadPackage.Literals.SORTING_PLAN_OUTPUT_TABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SortingPlanOutputRow> getSortingPlanOutputRow() {
		if (sortingPlanOutputRow == null) {
			sortingPlanOutputRow = new EObjectContainmentEList<SortingPlanOutputRow>(SortingPlanOutputRow.class, this, CptDatasetLoadPackage.SORTING_PLAN_OUTPUT_TABLE__SORTING_PLAN_OUTPUT_ROW);
		}
		return sortingPlanOutputRow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public SortingPlanOutputRow getRow(BigDecimal sortingPlanSk, BigDecimal sortingLevelSk, BigDecimal mechanizationLevelSk, BigDecimal throughputTypeSk, BigDecimal destination) {
    	Object[] keyObjects = new Object[5];
   		keyObjects[0] = sortingPlanSk;
   		keyObjects[1] = sortingLevelSk;
   		keyObjects[2] = mechanizationLevelSk;
   		keyObjects[3] = throughputTypeSk;
   		keyObjects[4] = destination;
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
			case CptDatasetLoadPackage.SORTING_PLAN_OUTPUT_TABLE__SORTING_PLAN_OUTPUT_ROW:
				return ((InternalEList<?>)getSortingPlanOutputRow()).basicRemove(otherEnd, msgs);
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
			case CptDatasetLoadPackage.SORTING_PLAN_OUTPUT_TABLE__SORTING_PLAN_OUTPUT_ROW:
				return getSortingPlanOutputRow();
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
			case CptDatasetLoadPackage.SORTING_PLAN_OUTPUT_TABLE__SORTING_PLAN_OUTPUT_ROW:
				getSortingPlanOutputRow().clear();
				getSortingPlanOutputRow().addAll((Collection<? extends SortingPlanOutputRow>)newValue);
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
			case CptDatasetLoadPackage.SORTING_PLAN_OUTPUT_TABLE__SORTING_PLAN_OUTPUT_ROW:
				getSortingPlanOutputRow().clear();
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
			case CptDatasetLoadPackage.SORTING_PLAN_OUTPUT_TABLE__SORTING_PLAN_OUTPUT_ROW:
				return sortingPlanOutputRow != null && !sortingPlanOutputRow.isEmpty();
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
			case CptDatasetLoadPackage.SORTING_PLAN_OUTPUT_TABLE___GET_ROW__BIGDECIMAL_BIGDECIMAL_BIGDECIMAL_BIGDECIMAL_BIGDECIMAL:
				return getRow((BigDecimal)arguments.get(0), (BigDecimal)arguments.get(1), (BigDecimal)arguments.get(2), (BigDecimal)arguments.get(3), (BigDecimal)arguments.get(4));
		}
		return super.eInvoke(operationID, arguments);
	}

	/* (non-Javadoc)
	 * @see com.misc.common.moplaf.datasetload.impl.TableImpl#NewRow()
	 */
	@Override
	public TableRow newRow() {
		SortingPlanOutputRow newSortingPanOutputRow = CptDatasetLoadFactory.eINSTANCE.createSortingPlanOutputRow();
		this.getSortingPlanOutputRow().add(newSortingPanOutputRow);
		return newSortingPanOutputRow;
		
	}

	/* (non-Javadoc)
	 * @see com.misc.common.moplaf.datasetload.impl.TableImpl#getName()
	 */
	@Override
	public String getName() {
		return "V_SORTING_PLAN_DETAIL";
	}

	/* (non-Javadoc)
	 * @see com.misc.common.moplaf.datasetload.impl.TableImpl#getSQLStatement()
	 */
	@Override
	public String getSQLStatement() {
		String sqlStatement =   "select spout.SORTING_PLAN_SK "
							+	"     , spout.OUTPUT_AVCS_SORTING_LEVEL_SK "
							+	"     , spout.MECHANIZATION_LEVEL_SK "
							+	"     , spout.THROUGHPUT_TYPE_SK "
							+	"     , spout.DESTINATION_SK "
							+	"from V_SORTING_PLAN_DETAIL spout"
			                ;
		return sqlStatement;
	}
	
	/* (non-Javadoc)
	 * @see com.misc.common.moplaf.datasetload.impl.TableImpl#getParamTableGroupAttributes()
	 */
	@Override
	public EList<EAttribute> getParamTableGroupAttributes() {
		EList<EAttribute> columnAttributes = new BasicEList<EAttribute>();
		return columnAttributes;
	}
	/* (non-Javadoc)
	 * @see com.misc.common.moplaf.datasetload.impl.TableImpl#getColumnTableRowAttributes()
	 */
	@Override
	public EList<EAttribute> getColumnTableRowAttributes() {
		EList<EAttribute> columnAttributes = new BasicEList<EAttribute>();
		columnAttributes.add(CptDatasetLoadPackage.Literals.SORTING_PLAN_OUTPUT_ROW__SORTING_PLAN_SK);
		columnAttributes.add(CptDatasetLoadPackage.Literals.SORTING_PLAN_OUTPUT_ROW__SORTING_LEVEL_AVCS_SK);
		columnAttributes.add(CptDatasetLoadPackage.Literals.SORTING_PLAN_OUTPUT_ROW__MECHANIZATION_LEVEL_SK);
		columnAttributes.add(CptDatasetLoadPackage.Literals.SORTING_PLAN_OUTPUT_ROW__THROUGHPUT_TYPE_SK);
		columnAttributes.add(CptDatasetLoadPackage.Literals.SORTING_PLAN_OUTPUT_ROW__DESTINATION_SK);
		return columnAttributes;
	}

	/* (non-Javadoc)
	 * @see com.misc.common.moplaf.datasetload.impl.TableImpl#getKeyColumns()
	 */
	@Override
	public EList<Integer> getKeyColumns() {
		EList<Integer> keyColumns = new BasicEList<Integer>();
		// zero based
		keyColumns.add(0); 
		keyColumns.add(1); 
		keyColumns.add(2); 
		keyColumns.add(3); 
		keyColumns.add(4); 
		return keyColumns;
	}

} //SortingPlanOutputTableImpl
