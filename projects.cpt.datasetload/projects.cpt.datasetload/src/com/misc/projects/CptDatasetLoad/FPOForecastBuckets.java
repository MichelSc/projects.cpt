/**
 */
package com.misc.projects.CptDatasetLoad;

import com.misc.common.moplaf.datasetload.Table;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>FPO Forecast Buckets</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.misc.projects.CptDatasetLoad.FPOForecastBuckets#getForecastRows <em>Forecast Rows</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.misc.projects.CptDatasetLoad.CptDatasetLoadPackage#getFPOForecastBuckets()
 * @model
 * @generated
 */
public interface FPOForecastBuckets extends Table {

	/**
	 * Returns the value of the '<em><b>Forecast Rows</b></em>' containment reference list.
	 * The list contents are of type {@link com.misc.projects.CptDatasetLoad.FPOForecastBucket}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Forecast Rows</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Forecast Rows</em>' containment reference list.
	 * @see com.misc.projects.CptDatasetLoad.CptDatasetLoadPackage#getFPOForecastBuckets_ForecastRows()
	 * @model containment="true"
	 * @generated
	 */
	EList<FPOForecastBucket> getForecastRows();
} // FPOForecastBuckets
