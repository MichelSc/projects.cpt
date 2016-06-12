/**
 */
package com.misc.projects.CptDatasetLoad.impl;

import com.misc.common.moplaf.dbsynch.Table;
import com.misc.projects.CptDatasetLoad.CptDatasetLoadPackage;
import com.misc.projects.CptDatasetLoad.FPDSortingPlansSet;
import com.misc.projects.CptDatasetLoad.SortingPlanInputTable;
import com.misc.projects.CptDatasetLoad.SortingPlanOutputTable;
import com.misc.projects.CptDatasetLoad.SortingPlansTable;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>FPD Sorting Plans Set</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.projects.CptDatasetLoad.impl.FPDSortingPlansSetImpl#getFromDate <em>From Date</em>}</li>
 *   <li>{@link com.misc.projects.CptDatasetLoad.impl.FPDSortingPlansSetImpl#getToDate <em>To Date</em>}</li>
 *   <li>{@link com.misc.projects.CptDatasetLoad.impl.FPDSortingPlansSetImpl#getSortingPlansTable <em>Sorting Plans Table</em>}</li>
 *   <li>{@link com.misc.projects.CptDatasetLoad.impl.FPDSortingPlansSetImpl#getSortingPlanOutputsTable <em>Sorting Plan Outputs Table</em>}</li>
 *   <li>{@link com.misc.projects.CptDatasetLoad.impl.FPDSortingPlansSetImpl#getSortingPlanInputsTable <em>Sorting Plan Inputs Table</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FPDSortingPlansSetImpl extends FPDTableGroupImpl implements FPDSortingPlansSet {
	/**
	 * The default value of the '{@link #getFromDate() <em>From Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date FROM_DATE_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getFromDate() <em>From Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromDate()
	 * @generated
	 * @ordered
	 */
	protected Date fromDate = FROM_DATE_EDEFAULT;
	/**
	 * The default value of the '{@link #getToDate() <em>To Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date TO_DATE_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getToDate() <em>To Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToDate()
	 * @generated
	 * @ordered
	 */
	protected Date toDate = TO_DATE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSortingPlansTable() <em>Sorting Plans Table</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSortingPlansTable()
	 * @generated
	 * @ordered
	 */
	protected SortingPlansTable sortingPlansTable;

	/**
	 * The cached value of the '{@link #getSortingPlanOutputsTable() <em>Sorting Plan Outputs Table</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSortingPlanOutputsTable()
	 * @generated
	 * @ordered
	 */
	protected SortingPlanOutputTable sortingPlanOutputsTable;

	/**
	 * The cached value of the '{@link #getSortingPlanInputsTable() <em>Sorting Plan Inputs Table</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSortingPlanInputsTable()
	 * @generated
	 * @ordered
	 */
	protected SortingPlanInputTable sortingPlanInputsTable;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FPDSortingPlansSetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CptDatasetLoadPackage.Literals.FPD_SORTING_PLANS_SET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getFromDate() {
		return fromDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFromDate(Date newFromDate) {
		Date oldFromDate = fromDate;
		fromDate = newFromDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CptDatasetLoadPackage.FPD_SORTING_PLANS_SET__FROM_DATE, oldFromDate, fromDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getToDate() {
		return toDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setToDate(Date newToDate) {
		Date oldToDate = toDate;
		toDate = newToDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CptDatasetLoadPackage.FPD_SORTING_PLANS_SET__TO_DATE, oldToDate, toDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SortingPlansTable getSortingPlansTable() {
		return sortingPlansTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSortingPlansTable(SortingPlansTable newSortingPlansTable, NotificationChain msgs) {
		SortingPlansTable oldSortingPlansTable = sortingPlansTable;
		sortingPlansTable = newSortingPlansTable;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CptDatasetLoadPackage.FPD_SORTING_PLANS_SET__SORTING_PLANS_TABLE, oldSortingPlansTable, newSortingPlansTable);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSortingPlansTable(SortingPlansTable newSortingPlansTable) {
		if (newSortingPlansTable != sortingPlansTable) {
			NotificationChain msgs = null;
			if (sortingPlansTable != null)
				msgs = ((InternalEObject)sortingPlansTable).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CptDatasetLoadPackage.FPD_SORTING_PLANS_SET__SORTING_PLANS_TABLE, null, msgs);
			if (newSortingPlansTable != null)
				msgs = ((InternalEObject)newSortingPlansTable).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CptDatasetLoadPackage.FPD_SORTING_PLANS_SET__SORTING_PLANS_TABLE, null, msgs);
			msgs = basicSetSortingPlansTable(newSortingPlansTable, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CptDatasetLoadPackage.FPD_SORTING_PLANS_SET__SORTING_PLANS_TABLE, newSortingPlansTable, newSortingPlansTable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SortingPlanOutputTable getSortingPlanOutputsTable() {
		return sortingPlanOutputsTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSortingPlanOutputsTable(SortingPlanOutputTable newSortingPlanOutputsTable, NotificationChain msgs) {
		SortingPlanOutputTable oldSortingPlanOutputsTable = sortingPlanOutputsTable;
		sortingPlanOutputsTable = newSortingPlanOutputsTable;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CptDatasetLoadPackage.FPD_SORTING_PLANS_SET__SORTING_PLAN_OUTPUTS_TABLE, oldSortingPlanOutputsTable, newSortingPlanOutputsTable);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSortingPlanOutputsTable(SortingPlanOutputTable newSortingPlanOutputsTable) {
		if (newSortingPlanOutputsTable != sortingPlanOutputsTable) {
			NotificationChain msgs = null;
			if (sortingPlanOutputsTable != null)
				msgs = ((InternalEObject)sortingPlanOutputsTable).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CptDatasetLoadPackage.FPD_SORTING_PLANS_SET__SORTING_PLAN_OUTPUTS_TABLE, null, msgs);
			if (newSortingPlanOutputsTable != null)
				msgs = ((InternalEObject)newSortingPlanOutputsTable).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CptDatasetLoadPackage.FPD_SORTING_PLANS_SET__SORTING_PLAN_OUTPUTS_TABLE, null, msgs);
			msgs = basicSetSortingPlanOutputsTable(newSortingPlanOutputsTable, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CptDatasetLoadPackage.FPD_SORTING_PLANS_SET__SORTING_PLAN_OUTPUTS_TABLE, newSortingPlanOutputsTable, newSortingPlanOutputsTable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SortingPlanInputTable getSortingPlanInputsTable() {
		return sortingPlanInputsTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSortingPlanInputsTable(SortingPlanInputTable newSortingPlanInputsTable, NotificationChain msgs) {
		SortingPlanInputTable oldSortingPlanInputsTable = sortingPlanInputsTable;
		sortingPlanInputsTable = newSortingPlanInputsTable;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CptDatasetLoadPackage.FPD_SORTING_PLANS_SET__SORTING_PLAN_INPUTS_TABLE, oldSortingPlanInputsTable, newSortingPlanInputsTable);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSortingPlanInputsTable(SortingPlanInputTable newSortingPlanInputsTable) {
		if (newSortingPlanInputsTable != sortingPlanInputsTable) {
			NotificationChain msgs = null;
			if (sortingPlanInputsTable != null)
				msgs = ((InternalEObject)sortingPlanInputsTable).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CptDatasetLoadPackage.FPD_SORTING_PLANS_SET__SORTING_PLAN_INPUTS_TABLE, null, msgs);
			if (newSortingPlanInputsTable != null)
				msgs = ((InternalEObject)newSortingPlanInputsTable).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CptDatasetLoadPackage.FPD_SORTING_PLANS_SET__SORTING_PLAN_INPUTS_TABLE, null, msgs);
			msgs = basicSetSortingPlanInputsTable(newSortingPlanInputsTable, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CptDatasetLoadPackage.FPD_SORTING_PLANS_SET__SORTING_PLAN_INPUTS_TABLE, newSortingPlanInputsTable, newSortingPlanInputsTable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CptDatasetLoadPackage.FPD_SORTING_PLANS_SET__SORTING_PLANS_TABLE:
				return basicSetSortingPlansTable(null, msgs);
			case CptDatasetLoadPackage.FPD_SORTING_PLANS_SET__SORTING_PLAN_OUTPUTS_TABLE:
				return basicSetSortingPlanOutputsTable(null, msgs);
			case CptDatasetLoadPackage.FPD_SORTING_PLANS_SET__SORTING_PLAN_INPUTS_TABLE:
				return basicSetSortingPlanInputsTable(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public SortingPlansTable basicGetSortingPlansTable() {
		SortingPlansTable sortingPlanTable = null;
		for (  Table table : this.getTables()){
			if ( table instanceof SortingPlansTable){
				if ( sortingPlanTable==null){
					sortingPlanTable = (SortingPlansTable)table;
				}
				else {
					// two instances
					throw new UnsupportedOperationException();
				}
			}
			
		}
		if ( sortingPlanTable == null) {
			// no instance
			throw new UnsupportedOperationException();
		}
		
		return sortingPlanTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CptDatasetLoadPackage.FPD_SORTING_PLANS_SET__FROM_DATE:
				return getFromDate();
			case CptDatasetLoadPackage.FPD_SORTING_PLANS_SET__TO_DATE:
				return getToDate();
			case CptDatasetLoadPackage.FPD_SORTING_PLANS_SET__SORTING_PLANS_TABLE:
				return getSortingPlansTable();
			case CptDatasetLoadPackage.FPD_SORTING_PLANS_SET__SORTING_PLAN_OUTPUTS_TABLE:
				return getSortingPlanOutputsTable();
			case CptDatasetLoadPackage.FPD_SORTING_PLANS_SET__SORTING_PLAN_INPUTS_TABLE:
				return getSortingPlanInputsTable();
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
			case CptDatasetLoadPackage.FPD_SORTING_PLANS_SET__FROM_DATE:
				setFromDate((Date)newValue);
				return;
			case CptDatasetLoadPackage.FPD_SORTING_PLANS_SET__TO_DATE:
				setToDate((Date)newValue);
				return;
			case CptDatasetLoadPackage.FPD_SORTING_PLANS_SET__SORTING_PLANS_TABLE:
				setSortingPlansTable((SortingPlansTable)newValue);
				return;
			case CptDatasetLoadPackage.FPD_SORTING_PLANS_SET__SORTING_PLAN_OUTPUTS_TABLE:
				setSortingPlanOutputsTable((SortingPlanOutputTable)newValue);
				return;
			case CptDatasetLoadPackage.FPD_SORTING_PLANS_SET__SORTING_PLAN_INPUTS_TABLE:
				setSortingPlanInputsTable((SortingPlanInputTable)newValue);
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
			case CptDatasetLoadPackage.FPD_SORTING_PLANS_SET__FROM_DATE:
				setFromDate(FROM_DATE_EDEFAULT);
				return;
			case CptDatasetLoadPackage.FPD_SORTING_PLANS_SET__TO_DATE:
				setToDate(TO_DATE_EDEFAULT);
				return;
			case CptDatasetLoadPackage.FPD_SORTING_PLANS_SET__SORTING_PLANS_TABLE:
				setSortingPlansTable((SortingPlansTable)null);
				return;
			case CptDatasetLoadPackage.FPD_SORTING_PLANS_SET__SORTING_PLAN_OUTPUTS_TABLE:
				setSortingPlanOutputsTable((SortingPlanOutputTable)null);
				return;
			case CptDatasetLoadPackage.FPD_SORTING_PLANS_SET__SORTING_PLAN_INPUTS_TABLE:
				setSortingPlanInputsTable((SortingPlanInputTable)null);
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
			case CptDatasetLoadPackage.FPD_SORTING_PLANS_SET__FROM_DATE:
				return FROM_DATE_EDEFAULT == null ? fromDate != null : !FROM_DATE_EDEFAULT.equals(fromDate);
			case CptDatasetLoadPackage.FPD_SORTING_PLANS_SET__TO_DATE:
				return TO_DATE_EDEFAULT == null ? toDate != null : !TO_DATE_EDEFAULT.equals(toDate);
			case CptDatasetLoadPackage.FPD_SORTING_PLANS_SET__SORTING_PLANS_TABLE:
				return sortingPlansTable != null;
			case CptDatasetLoadPackage.FPD_SORTING_PLANS_SET__SORTING_PLAN_OUTPUTS_TABLE:
				return sortingPlanOutputsTable != null;
			case CptDatasetLoadPackage.FPD_SORTING_PLANS_SET__SORTING_PLAN_INPUTS_TABLE:
				return sortingPlanInputsTable != null;
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
		result.append(" (FromDate: ");
		result.append(fromDate);
		result.append(", ToDate: ");
		result.append(toDate);
		result.append(')');
		return result.toString();
	}

} //FPDSortingPlansSetImpl
