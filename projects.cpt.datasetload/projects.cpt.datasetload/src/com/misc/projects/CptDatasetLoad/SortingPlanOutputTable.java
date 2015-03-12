/**
 */
package com.misc.projects.CptDatasetLoad;

import java.math.BigDecimal;
import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sorting Plan Output Table</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.misc.projects.CptDatasetLoad.SortingPlanOutputTable#getSortingPlanOutputRow <em>Sorting Plan Output Row</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.misc.projects.CptDatasetLoad.CptDatasetLoadPackage#getSortingPlanOutputTable()
 * @model
 * @generated
 */
public interface SortingPlanOutputTable extends FPDSortingPlanTable {

	/**
	 * Returns the value of the '<em><b>Sorting Plan Output Row</b></em>' containment reference list.
	 * The list contents are of type {@link com.misc.projects.CptDatasetLoad.SortingPlanOutputRow}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sorting Plan Output Row</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sorting Plan Output Row</em>' containment reference list.
	 * @see com.misc.projects.CptDatasetLoad.CptDatasetLoadPackage#getSortingPlanOutputTable_SortingPlanOutputRow()
	 * @model containment="true"
	 * @generated
	 */
	EList<SortingPlanOutputRow> getSortingPlanOutputRow();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	SortingPlanOutputRow getRow(BigDecimal sortingPlanSk, BigDecimal sortingLevelSk, BigDecimal mechanizationLevelSk, BigDecimal throughputTypeSk, BigDecimal destination);
} // SortingPlanOutputTable
