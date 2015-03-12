/**
 */
package com.misc.projects.CptDatasetLoad;

import com.misc.common.moplaf.DatasetLoadOra.DatasetLoadJdbcOraThin;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>FPD</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.misc.projects.CptDatasetLoad.FPD#getMasterData <em>Master Data</em>}</li>
 *   <li>{@link com.misc.projects.CptDatasetLoad.FPD#getSortingPlansSets <em>Sorting Plans Sets</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.misc.projects.CptDatasetLoad.CptDatasetLoadPackage#getFPD()
 * @model
 * @generated
 */
public interface FPD extends DatasetLoadJdbcOraThin {

	/**
	 * Returns the value of the '<em><b>Master Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Master Data</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Master Data</em>' containment reference.
	 * @see #setMasterData(FPDMasterData)
	 * @see com.misc.projects.CptDatasetLoad.CptDatasetLoadPackage#getFPD_MasterData()
	 * @model containment="true"
	 * @generated
	 */
	FPDMasterData getMasterData();

	/**
	 * Sets the value of the '{@link com.misc.projects.CptDatasetLoad.FPD#getMasterData <em>Master Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Master Data</em>' containment reference.
	 * @see #getMasterData()
	 * @generated
	 */
	void setMasterData(FPDMasterData value);

	/**
	 * Returns the value of the '<em><b>Sorting Plans Sets</b></em>' containment reference list.
	 * The list contents are of type {@link com.misc.projects.CptDatasetLoad.FPDSortingPlansSet}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sorting Plans Sets</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sorting Plans Sets</em>' containment reference list.
	 * @see com.misc.projects.CptDatasetLoad.CptDatasetLoadPackage#getFPD_SortingPlansSets()
	 * @model containment="true"
	 * @generated
	 */
	EList<FPDSortingPlansSet> getSortingPlansSets();
} // FPD
