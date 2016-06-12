/**
 */
package com.misc.projects.CptDatasetLoad;

import com.misc.common.moplaf.dbsynch.TableRow;
import java.util.Date;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>FPO Forecast Upload</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.projects.CptDatasetLoad.FPOForecastUpload#getFromDate <em>From Date</em>}</li>
 *   <li>{@link com.misc.projects.CptDatasetLoad.FPOForecastUpload#getToDate <em>To Date</em>}</li>
 *   <li>{@link com.misc.projects.CptDatasetLoad.FPOForecastUpload#getKind <em>Kind</em>}</li>
 *   <li>{@link com.misc.projects.CptDatasetLoad.FPOForecastUpload#getForecastTable <em>Forecast Table</em>}</li>
 * </ul>
 *
 * @see com.misc.projects.CptDatasetLoad.CptDatasetLoadPackage#getFPOForecastUpload()
 * @model
 * @generated
 */
public interface FPOForecastUpload extends TableRow {
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
	 * @see com.misc.projects.CptDatasetLoad.CptDatasetLoadPackage#getFPOForecastUpload_FromDate()
	 * @model
	 * @generated
	 */
	Date getFromDate();

	/**
	 * Sets the value of the '{@link com.misc.projects.CptDatasetLoad.FPOForecastUpload#getFromDate <em>From Date</em>}' attribute.
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
	 * @see com.misc.projects.CptDatasetLoad.CptDatasetLoadPackage#getFPOForecastUpload_ToDate()
	 * @model
	 * @generated
	 */
	Date getToDate();

	/**
	 * Sets the value of the '{@link com.misc.projects.CptDatasetLoad.FPOForecastUpload#getToDate <em>To Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To Date</em>' attribute.
	 * @see #getToDate()
	 * @generated
	 */
	void setToDate(Date value);

	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see #setKind(String)
	 * @see com.misc.projects.CptDatasetLoad.CptDatasetLoadPackage#getFPOForecastUpload_Kind()
	 * @model
	 * @generated
	 */
	String getKind();

	/**
	 * Sets the value of the '{@link com.misc.projects.CptDatasetLoad.FPOForecastUpload#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see #getKind()
	 * @generated
	 */
	void setKind(String value);

	/**
	 * Returns the value of the '<em><b>Forecast Table</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Forecast Table</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Forecast Table</em>' containment reference.
	 * @see #setForecastTable(FPOForecastBuckets)
	 * @see com.misc.projects.CptDatasetLoad.CptDatasetLoadPackage#getFPOForecastUpload_ForecastTable()
	 * @model containment="true" required="true"
	 * @generated
	 */
	FPOForecastBuckets getForecastTable();

	/**
	 * Sets the value of the '{@link com.misc.projects.CptDatasetLoad.FPOForecastUpload#getForecastTable <em>Forecast Table</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Forecast Table</em>' containment reference.
	 * @see #getForecastTable()
	 * @generated
	 */
	void setForecastTable(FPOForecastBuckets value);

} // FPOForecastUpload
