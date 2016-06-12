/**
 */
package com.misc.projects.CptDatasetLoad;

import java.util.Date;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>FPD Sorting Plans Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.projects.CptDatasetLoad.FPDSortingPlansSet#getFromDate <em>From Date</em>}</li>
 *   <li>{@link com.misc.projects.CptDatasetLoad.FPDSortingPlansSet#getToDate <em>To Date</em>}</li>
 *   <li>{@link com.misc.projects.CptDatasetLoad.FPDSortingPlansSet#getSortingPlansTable <em>Sorting Plans Table</em>}</li>
 *   <li>{@link com.misc.projects.CptDatasetLoad.FPDSortingPlansSet#getSortingPlanOutputsTable <em>Sorting Plan Outputs Table</em>}</li>
 *   <li>{@link com.misc.projects.CptDatasetLoad.FPDSortingPlansSet#getSortingPlanInputsTable <em>Sorting Plan Inputs Table</em>}</li>
 * </ul>
 *
 * @see com.misc.projects.CptDatasetLoad.CptDatasetLoadPackage#getFPDSortingPlansSet()
 * @model
 * @generated
 */
public interface FPDSortingPlansSet extends FPDTableGroup {

	/**
	 * Returns the value of the '<em><b>From Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From Date</em>' attribute.
	 * @see #setFromDate(Date)
	 * @see com.misc.projects.CptDatasetLoad.CptDatasetLoadPackage#getFPDSortingPlansSet_FromDate()
	 * @model
	 * @generated
	 */
	Date getFromDate();

	/**
	 * Sets the value of the '{@link com.misc.projects.CptDatasetLoad.FPDSortingPlansSet#getFromDate <em>From Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From Date</em>' attribute.
	 * @see #getFromDate()
	 * @generated
	 */
	void setFromDate(Date value);

	/**
	 * Returns the value of the '<em><b>To Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To Date</em>' attribute.
	 * @see #setToDate(Date)
	 * @see com.misc.projects.CptDatasetLoad.CptDatasetLoadPackage#getFPDSortingPlansSet_ToDate()
	 * @model
	 * @generated
	 */
	Date getToDate();

	/**
	 * Sets the value of the '{@link com.misc.projects.CptDatasetLoad.FPDSortingPlansSet#getToDate <em>To Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To Date</em>' attribute.
	 * @see #getToDate()
	 * @generated
	 */
	void setToDate(Date value);

	/**
	 * Returns the value of the '<em><b>Sorting Plans Table</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sorting Plans Table</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sorting Plans Table</em>' containment reference.
	 * @see #setSortingPlansTable(SortingPlansTable)
	 * @see com.misc.projects.CptDatasetLoad.CptDatasetLoadPackage#getFPDSortingPlansSet_SortingPlansTable()
	 * @model containment="true"
	 * @generated
	 */
	SortingPlansTable getSortingPlansTable();

	/**
	 * Sets the value of the '{@link com.misc.projects.CptDatasetLoad.FPDSortingPlansSet#getSortingPlansTable <em>Sorting Plans Table</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sorting Plans Table</em>' containment reference.
	 * @see #getSortingPlansTable()
	 * @generated
	 */
	void setSortingPlansTable(SortingPlansTable value);

	/**
	 * Returns the value of the '<em><b>Sorting Plan Outputs Table</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sorting Plan Outputs Table</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sorting Plan Outputs Table</em>' containment reference.
	 * @see #setSortingPlanOutputsTable(SortingPlanOutputTable)
	 * @see com.misc.projects.CptDatasetLoad.CptDatasetLoadPackage#getFPDSortingPlansSet_SortingPlanOutputsTable()
	 * @model containment="true"
	 * @generated
	 */
	SortingPlanOutputTable getSortingPlanOutputsTable();

	/**
	 * Sets the value of the '{@link com.misc.projects.CptDatasetLoad.FPDSortingPlansSet#getSortingPlanOutputsTable <em>Sorting Plan Outputs Table</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sorting Plan Outputs Table</em>' containment reference.
	 * @see #getSortingPlanOutputsTable()
	 * @generated
	 */
	void setSortingPlanOutputsTable(SortingPlanOutputTable value);

	/**
	 * Returns the value of the '<em><b>Sorting Plan Inputs Table</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sorting Plan Inputs Table</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sorting Plan Inputs Table</em>' containment reference.
	 * @see #setSortingPlanInputsTable(SortingPlanInputTable)
	 * @see com.misc.projects.CptDatasetLoad.CptDatasetLoadPackage#getFPDSortingPlansSet_SortingPlanInputsTable()
	 * @model containment="true"
	 * @generated
	 */
	SortingPlanInputTable getSortingPlanInputsTable();

	/**
	 * Sets the value of the '{@link com.misc.projects.CptDatasetLoad.FPDSortingPlansSet#getSortingPlanInputsTable <em>Sorting Plan Inputs Table</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sorting Plan Inputs Table</em>' containment reference.
	 * @see #getSortingPlanInputsTable()
	 * @generated
	 */
	void setSortingPlanInputsTable(SortingPlanInputTable value);
} // FPDSortingPlansSet
