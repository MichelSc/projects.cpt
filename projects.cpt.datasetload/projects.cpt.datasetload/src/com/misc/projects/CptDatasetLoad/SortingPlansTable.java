/**
 */
package com.misc.projects.CptDatasetLoad;

import java.math.BigDecimal;
import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sorting Plans Table</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.projects.CptDatasetLoad.SortingPlansTable#getSortingPlansRow <em>Sorting Plans Row</em>}</li>
 * </ul>
 *
 * @see com.misc.projects.CptDatasetLoad.CptDatasetLoadPackage#getSortingPlansTable()
 * @model
 * @generated
 */
public interface SortingPlansTable extends FPDSortingPlanTable {

	/**
	 * Returns the value of the '<em><b>Sorting Plans Row</b></em>' containment reference list.
	 * The list contents are of type {@link com.misc.projects.CptDatasetLoad.SortingPlanRow}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sorting Plans Row</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sorting Plans Row</em>' containment reference list.
	 * @see com.misc.projects.CptDatasetLoad.CptDatasetLoadPackage#getSortingPlansTable_SortingPlansRow()
	 * @model containment="true"
	 * @generated
	 */
	EList<SortingPlanRow> getSortingPlansRow();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	SortingPlanRow getRow(BigDecimal sk);
} // SortingPlansTable
