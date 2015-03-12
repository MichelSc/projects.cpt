/**
 */
package com.misc.projects.CptDatasetLoad;

import com.misc.common.moplaf.datasetload.TableRow;
import java.math.BigDecimal;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sorting Level Row</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.misc.projects.CptDatasetLoad.SortingLevelRow#getSortingLevelSk <em>Sorting Level Sk</em>}</li>
 *   <li>{@link com.misc.projects.CptDatasetLoad.SortingLevelRow#getSortingLevelName <em>Sorting Level Name</em>}</li>
 *   <li>{@link com.misc.projects.CptDatasetLoad.SortingLevelRow#getDescription <em>Description</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.misc.projects.CptDatasetLoad.CptDatasetLoadPackage#getSortingLevelRow()
 * @model
 * @generated
 */
public interface SortingLevelRow extends TableRow {
	/**
	 * Returns the value of the '<em><b>Sorting Level Sk</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sorting Level Sk</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sorting Level Sk</em>' attribute.
	 * @see #setSortingLevelSk(BigDecimal)
	 * @see com.misc.projects.CptDatasetLoad.CptDatasetLoadPackage#getSortingLevelRow_SortingLevelSk()
	 * @model
	 * @generated
	 */
	BigDecimal getSortingLevelSk();

	/**
	 * Sets the value of the '{@link com.misc.projects.CptDatasetLoad.SortingLevelRow#getSortingLevelSk <em>Sorting Level Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sorting Level Sk</em>' attribute.
	 * @see #getSortingLevelSk()
	 * @generated
	 */
	void setSortingLevelSk(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Sorting Level Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sorting Level Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sorting Level Name</em>' attribute.
	 * @see #setSortingLevelName(String)
	 * @see com.misc.projects.CptDatasetLoad.CptDatasetLoadPackage#getSortingLevelRow_SortingLevelName()
	 * @model
	 * @generated
	 */
	String getSortingLevelName();

	/**
	 * Sets the value of the '{@link com.misc.projects.CptDatasetLoad.SortingLevelRow#getSortingLevelName <em>Sorting Level Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sorting Level Name</em>' attribute.
	 * @see #getSortingLevelName()
	 * @generated
	 */
	void setSortingLevelName(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see com.misc.projects.CptDatasetLoad.CptDatasetLoadPackage#getSortingLevelRow_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link com.misc.projects.CptDatasetLoad.SortingLevelRow#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

} // SortingLevelRow
