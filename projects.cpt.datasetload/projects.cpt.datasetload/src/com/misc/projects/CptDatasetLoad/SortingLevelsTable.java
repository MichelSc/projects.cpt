/**
 */
package com.misc.projects.CptDatasetLoad;

import java.math.BigDecimal;
import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sorting Levels Table</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.projects.CptDatasetLoad.SortingLevelsTable#getSortinglevelRow <em>Sortinglevel Row</em>}</li>
 * </ul>
 *
 * @see com.misc.projects.CptDatasetLoad.CptDatasetLoadPackage#getSortingLevelsTable()
 * @model
 * @generated
 */
public interface SortingLevelsTable extends MasterDataTable {

	/**
	 * Returns the value of the '<em><b>Sortinglevel Row</b></em>' containment reference list.
	 * The list contents are of type {@link com.misc.projects.CptDatasetLoad.SortingLevelRow}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sortinglevel Row</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sortinglevel Row</em>' containment reference list.
	 * @see com.misc.projects.CptDatasetLoad.CptDatasetLoadPackage#getSortingLevelsTable_SortinglevelRow()
	 * @model containment="true"
	 * @generated
	 */
	EList<SortingLevelRow> getSortinglevelRow();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	SortingLevelRow getRow(BigDecimal sk);
} // SortingLevelsTable
