/**
 */
package com.misc.projects.Forecast;

import com.misc.projects.CptDatasetLoad.FPOForecastBucket;
import com.misc.projects.CptDatasetLoad.FPOForecastUpload;

import java.math.BigDecimal;
import java.util.Date;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>FPO Forecast Buckets Selection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.misc.projects.Forecast.FPOForecastBucketsSelection#getUpload <em>Upload</em>}</li>
 *   <li>{@link com.misc.projects.Forecast.FPOForecastBucketsSelection#getSelectedBuckets <em>Selected Buckets</em>}</li>
 *   <li>{@link com.misc.projects.Forecast.FPOForecastBucketsSelection#getSelectBucketDates <em>Select Bucket Dates</em>}</li>
 *   <li>{@link com.misc.projects.Forecast.FPOForecastBucketsSelection#getSelectThroughputTypes <em>Select Throughput Types</em>}</li>
 *   <li>{@link com.misc.projects.Forecast.FPOForecastBucketsSelection#getSelectMechanizationLevel <em>Select Mechanization Level</em>}</li>
 *   <li>{@link com.misc.projects.Forecast.FPOForecastBucketsSelection#getSelectSortingLevelAGGs <em>Select Sorting Level AG Gs</em>}</li>
 *   <li>{@link com.misc.projects.Forecast.FPOForecastBucketsSelection#getSelectFirstSortingIMCs <em>Select First Sorting IM Cs</em>}</li>
 *   <li>{@link com.misc.projects.Forecast.FPOForecastBucketsSelection#getSelectionSize <em>Selection Size</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.misc.projects.Forecast.ForecastPackage#getFPOForecastBucketsSelection()
 * @model
 * @generated
 */
public interface FPOForecastBucketsSelection extends EObject {
	/**
	 * Returns the value of the '<em><b>Upload</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Upload</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Upload</em>' reference.
	 * @see #setUpload(FPOForecastUpload)
	 * @see com.misc.projects.Forecast.ForecastPackage#getFPOForecastBucketsSelection_Upload()
	 * @model
	 * @generated
	 */
	FPOForecastUpload getUpload();

	/**
	 * Sets the value of the '{@link com.misc.projects.Forecast.FPOForecastBucketsSelection#getUpload <em>Upload</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Upload</em>' reference.
	 * @see #getUpload()
	 * @generated
	 */
	void setUpload(FPOForecastUpload value);

	/**
	 * Returns the value of the '<em><b>Selected Buckets</b></em>' reference list.
	 * The list contents are of type {@link com.misc.projects.CptDatasetLoad.FPOForecastBucket}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Selected Buckets</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Selected Buckets</em>' reference list.
	 * @see com.misc.projects.Forecast.ForecastPackage#getFPOForecastBucketsSelection_SelectedBuckets()
	 * @model
	 * @generated
	 */
	EList<FPOForecastBucket> getSelectedBuckets();

	/**
	 * Returns the value of the '<em><b>Select Bucket Dates</b></em>' attribute list.
	 * The list contents are of type {@link java.util.Date}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Select Bucket Dates</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Select Bucket Dates</em>' attribute list.
	 * @see com.misc.projects.Forecast.ForecastPackage#getFPOForecastBucketsSelection_SelectBucketDates()
	 * @model
	 * @generated
	 */
	EList<Date> getSelectBucketDates();

	/**
	 * Returns the value of the '<em><b>Select Throughput Types</b></em>' attribute list.
	 * The list contents are of type {@link java.math.BigDecimal}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Select Throughput Types</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Select Throughput Types</em>' attribute list.
	 * @see com.misc.projects.Forecast.ForecastPackage#getFPOForecastBucketsSelection_SelectThroughputTypes()
	 * @model
	 * @generated
	 */
	EList<BigDecimal> getSelectThroughputTypes();

	/**
	 * Returns the value of the '<em><b>Select Mechanization Level</b></em>' attribute list.
	 * The list contents are of type {@link java.math.BigDecimal}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Select Mechanization Level</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Select Mechanization Level</em>' attribute list.
	 * @see com.misc.projects.Forecast.ForecastPackage#getFPOForecastBucketsSelection_SelectMechanizationLevel()
	 * @model
	 * @generated
	 */
	EList<BigDecimal> getSelectMechanizationLevel();

	/**
	 * Returns the value of the '<em><b>Select Sorting Level AG Gs</b></em>' attribute list.
	 * The list contents are of type {@link java.math.BigDecimal}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Select Sorting Level AG Gs</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Select Sorting Level AG Gs</em>' attribute list.
	 * @see com.misc.projects.Forecast.ForecastPackage#getFPOForecastBucketsSelection_SelectSortingLevelAGGs()
	 * @model
	 * @generated
	 */
	EList<BigDecimal> getSelectSortingLevelAGGs();

	/**
	 * Returns the value of the '<em><b>Select First Sorting IM Cs</b></em>' attribute list.
	 * The list contents are of type {@link java.math.BigDecimal}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Select First Sorting IM Cs</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Select First Sorting IM Cs</em>' attribute list.
	 * @see com.misc.projects.Forecast.ForecastPackage#getFPOForecastBucketsSelection_SelectFirstSortingIMCs()
	 * @model
	 * @generated
	 */
	EList<BigDecimal> getSelectFirstSortingIMCs();

	/**
	 * Returns the value of the '<em><b>Selection Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Selection Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Selection Size</em>' attribute.
	 * @see #setSelectionSize(int)
	 * @see com.misc.projects.Forecast.ForecastPackage#getFPOForecastBucketsSelection_SelectionSize()
	 * @model
	 * @generated
	 */
	int getSelectionSize();

	/**
	 * Sets the value of the '{@link com.misc.projects.Forecast.FPOForecastBucketsSelection#getSelectionSize <em>Selection Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Selection Size</em>' attribute.
	 * @see #getSelectionSize()
	 * @generated
	 */
	void setSelectionSize(int value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean isSelected(FPOForecastBucket bucket);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void refreshSelectedBuckets();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void sortSelectedBuckets();

} // FPOForecastBucketsSelection
