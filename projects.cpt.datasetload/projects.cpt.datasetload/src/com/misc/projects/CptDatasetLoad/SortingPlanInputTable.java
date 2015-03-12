/**
 */
package com.misc.projects.CptDatasetLoad;

import java.math.BigDecimal;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sorting Plan Input Table</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.misc.projects.CptDatasetLoad.SortingPlanInputTable#getSortingPlanInputRow <em>Sorting Plan Input Row</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.misc.projects.CptDatasetLoad.CptDatasetLoadPackage#getSortingPlanInputTable()
 * @model
 * @generated
 */
public interface SortingPlanInputTable extends FPDSortingPlanTable {
	/**
	 * Returns the value of the '<em><b>Sorting Plan Input Row</b></em>' containment reference list.
	 * The list contents are of type {@link com.misc.projects.CptDatasetLoad.SortingPlanInputRow}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sorting Plan Input Row</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sorting Plan Input Row</em>' containment reference list.
	 * @see com.misc.projects.CptDatasetLoad.CptDatasetLoadPackage#getSortingPlanInputTable_SortingPlanInputRow()
	 * @model containment="true"
	 * @generated
	 */
	EList<SortingPlanInputRow> getSortingPlanInputRow();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	SortingPlanOutputRow getRow(BigDecimal sortingPlanSk, BigDecimal sortingLevelSk, BigDecimal mechanizationLevelSk, BigDecimal throughputTypeSk);

} // SortingPlanInputTable
