/**
 */
package com.misc.projects.CptDatasetLoad;

import com.misc.common.moplaf.dbsynch.dbsynchora.DataSourceJdbcOraThin;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>FPO</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.projects.CptDatasetLoad.FPO#getForecastUploads <em>Forecast Uploads</em>}</li>
 * </ul>
 *
 * @see com.misc.projects.CptDatasetLoad.CptDatasetLoadPackage#getFPO()
 * @model
 * @generated
 */
public interface FPO extends DataSourceJdbcOraThin {

	/**
	 * Returns the value of the '<em><b>Forecast Uploads</b></em>' containment reference list.
	 * The list contents are of type {@link com.misc.projects.CptDatasetLoad.FPOForecastUpload}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Forecast Uploads</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Forecast Uploads</em>' containment reference list.
	 * @see com.misc.projects.CptDatasetLoad.CptDatasetLoadPackage#getFPO_ForecastUploads()
	 * @model containment="true"
	 * @generated
	 */
	EList<FPOForecastUpload> getForecastUploads();
} // FPO
