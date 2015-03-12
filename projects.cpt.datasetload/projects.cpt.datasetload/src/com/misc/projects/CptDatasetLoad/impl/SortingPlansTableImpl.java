/**
 */
package com.misc.projects.CptDatasetLoad.impl;

import com.misc.common.moplaf.datasetload.TableRow;
import com.misc.common.moplaf.datasetload.impl.TableRowKeyImpl;
import com.misc.projects.CptDatasetLoad.CptDatasetLoadFactory;
import com.misc.projects.CptDatasetLoad.CptDatasetLoadPackage;
import com.misc.projects.CptDatasetLoad.SortingPlanRow;
import com.misc.projects.CptDatasetLoad.SortingPlansTable;
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
 * An implementation of the model object '<em><b>Sorting Plans Table</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.misc.projects.CptDatasetLoad.impl.SortingPlansTableImpl#getSortingPlansRow <em>Sorting Plans Row</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SortingPlansTableImpl extends FPDSortingPlanTableImpl implements SortingPlansTable {
	/**
	 * The cached value of the '{@link #getSortingPlansRow() <em>Sorting Plans Row</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSortingPlansRow()
	 * @generated
	 * @ordered
	 */
	protected EList<SortingPlanRow> sortingPlansRow;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SortingPlansTableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CptDatasetLoadPackage.Literals.SORTING_PLANS_TABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SortingPlanRow> getSortingPlansRow() {
		if (sortingPlansRow == null) {
			sortingPlansRow = new EObjectContainmentEList<SortingPlanRow>(SortingPlanRow.class, this, CptDatasetLoadPackage.SORTING_PLANS_TABLE__SORTING_PLANS_ROW);
		}
		return sortingPlansRow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public SortingPlanRow getRow(BigDecimal sk) {
    	Object[] keyObjects = new Object[1];
   		keyObjects[0] = sk;
    	TableRowKeyImpl key = new TableRowKeyImpl(keyObjects);
    	TableRow row = this.getRow(key);
    	return (SortingPlanRow) row;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CptDatasetLoadPackage.SORTING_PLANS_TABLE__SORTING_PLANS_ROW:
				return ((InternalEList<?>)getSortingPlansRow()).basicRemove(otherEnd, msgs);
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
			case CptDatasetLoadPackage.SORTING_PLANS_TABLE__SORTING_PLANS_ROW:
				return getSortingPlansRow();
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
			case CptDatasetLoadPackage.SORTING_PLANS_TABLE__SORTING_PLANS_ROW:
				getSortingPlansRow().clear();
				getSortingPlansRow().addAll((Collection<? extends SortingPlanRow>)newValue);
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
			case CptDatasetLoadPackage.SORTING_PLANS_TABLE__SORTING_PLANS_ROW:
				getSortingPlansRow().clear();
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
			case CptDatasetLoadPackage.SORTING_PLANS_TABLE__SORTING_PLANS_ROW:
				return sortingPlansRow != null && !sortingPlansRow.isEmpty();
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
			case CptDatasetLoadPackage.SORTING_PLANS_TABLE___GET_ROW__BIGDECIMAL:
				return getRow((BigDecimal)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	/* (non-Javadoc)
	 * @see com.misc.common.moplaf.datasetload.impl.TableImpl#NewRow()
	 */
	@Override
	public TableRow newRow() {
		SortingPlanRow newSortingPlanRow = CptDatasetLoadFactory.eINSTANCE.createSortingPlanRow();
		this.getSortingPlansRow().add(newSortingPlanRow);
		return newSortingPlanRow;
	}

	
	/* (non-Javadoc)
	 * @see com.misc.common.moplaf.datasetload.impl.TableImpl#getName()
	 */
	@Override
	public String getName() {
		return "V_SORTING_PLAN";
	}

	/* (non-Javadoc)
	 * @see com.misc.common.moplaf.datasetload.impl.TableImpl#getSQLStatement()
	 */
	@Override
	public String getSQLStatement() {
		String sqlStatement = 
				"select sp.sorting_plan_sk "
			+	"     , sp.SORTING_PLAN_SHORT_NAME "
			+	"     , sp.PL_AGGR_SRTNG_LVL_SK "
			+	"from v_sorting_plan             sp "
            ;
		return sqlStatement;
	}
	
	/* (non-Javadoc)
	 * @see com.misc.common.moplaf.datasetload.impl.TableImpl#getColumnTableRowAttributes()
	 */
	@Override
	public EList<EAttribute> getColumnTableRowAttributes() {
		EList<EAttribute> columnAttributes = new BasicEList<EAttribute>();
		columnAttributes.add(CptDatasetLoadPackage.Literals.SORTING_PLAN_ROW__SORTING_PLAN_SK);
		columnAttributes.add(CptDatasetLoadPackage.Literals.SORTING_PLAN_ROW__SORTING_PLAN_NAME);
		columnAttributes.add(CptDatasetLoadPackage.Literals.SORTING_PLAN_ROW__SORTING_LEVEL_PLAGG_SK);
		return columnAttributes;
	}

	/* (non-Javadoc)
	 * @see com.misc.common.moplaf.datasetload.impl.TableImpl#getKeyColumns()
	 */
	@Override
	public EList<Integer> getKeyColumns() {
		EList<Integer> keyColumns = new BasicEList<Integer>();
		keyColumns.add(0); // zero based
		return keyColumns;
	}


} //SortingPlansTableImpl
