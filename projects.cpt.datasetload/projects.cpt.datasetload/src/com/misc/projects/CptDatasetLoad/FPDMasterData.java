/**
 */
package com.misc.projects.CptDatasetLoad;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>FPD Master Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.misc.projects.CptDatasetLoad.FPDMasterData#getSortingLevelTable <em>Sorting Level Table</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.misc.projects.CptDatasetLoad.CptDatasetLoadPackage#getFPDMasterData()
 * @model
 * @generated
 */
public interface FPDMasterData extends FPDTableGroup {
	/**
	 * Returns the value of the '<em><b>Sorting Level Table</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sorting Level Table</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sorting Level Table</em>' containment reference.
	 * @see #setSortingLevelTable(SortingLevelsTable)
	 * @see com.misc.projects.CptDatasetLoad.CptDatasetLoadPackage#getFPDMasterData_SortingLevelTable()
	 * @model containment="true"
	 * @generated
	 */
	SortingLevelsTable getSortingLevelTable();

	/**
	 * Sets the value of the '{@link com.misc.projects.CptDatasetLoad.FPDMasterData#getSortingLevelTable <em>Sorting Level Table</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sorting Level Table</em>' containment reference.
	 * @see #getSortingLevelTable()
	 * @generated
	 */
	void setSortingLevelTable(SortingLevelsTable value);

} // FPDMasterData
