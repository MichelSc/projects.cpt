/**
 */
package com.misc.projects.Forecast;

import java.util.Date;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mapping Result</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.misc.projects.Forecast.MappingResult#getForecastMapping <em>Forecast Mapping</em>}</li>
 *   <li>{@link com.misc.projects.Forecast.MappingResult#getForecastSelection <em>Forecast Selection</em>}</li>
 *   <li>{@link com.misc.projects.Forecast.MappingResult#getSources <em>Sources</em>}</li>
 *   <li>{@link com.misc.projects.Forecast.MappingResult#getNumberOfBucketsMapped <em>Number Of Buckets Mapped</em>}</li>
 *   <li>{@link com.misc.projects.Forecast.MappingResult#getNumberOfBucketsToMap <em>Number Of Buckets To Map</em>}</li>
 *   <li>{@link com.misc.projects.Forecast.MappingResult#getMapped <em>Mapped</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.misc.projects.Forecast.ForecastPackage#getMappingResult()
 * @model
 * @generated
 */
public interface MappingResult extends EObject {
	/**
	 * Returns the value of the '<em><b>Forecast Mapping</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Forecast Mapping</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Forecast Mapping</em>' reference.
	 * @see #setForecastMapping(ForecastMapping)
	 * @see com.misc.projects.Forecast.ForecastPackage#getMappingResult_ForecastMapping()
	 * @model
	 * @generated
	 */
	ForecastMapping getForecastMapping();

	/**
	 * Sets the value of the '{@link com.misc.projects.Forecast.MappingResult#getForecastMapping <em>Forecast Mapping</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Forecast Mapping</em>' reference.
	 * @see #getForecastMapping()
	 * @generated
	 */
	void setForecastMapping(ForecastMapping value);

	/**
	 * Returns the value of the '<em><b>Forecast Selection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Forecast Selection</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Forecast Selection</em>' reference.
	 * @see #setForecastSelection(FPOForecastBucketsSelection)
	 * @see com.misc.projects.Forecast.ForecastPackage#getMappingResult_ForecastSelection()
	 * @model
	 * @generated
	 */
	FPOForecastBucketsSelection getForecastSelection();

	/**
	 * Sets the value of the '{@link com.misc.projects.Forecast.MappingResult#getForecastSelection <em>Forecast Selection</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Forecast Selection</em>' reference.
	 * @see #getForecastSelection()
	 * @generated
	 */
	void setForecastSelection(FPOForecastBucketsSelection value);

	/**
	 * Returns the value of the '<em><b>Sources</b></em>' containment reference list.
	 * The list contents are of type {@link com.misc.projects.Forecast.SourceBucket}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sources</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sources</em>' containment reference list.
	 * @see com.misc.projects.Forecast.ForecastPackage#getMappingResult_Sources()
	 * @model containment="true"
	 * @generated
	 */
	EList<SourceBucket> getSources();

	/**
	 * Returns the value of the '<em><b>Number Of Buckets Mapped</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Number Of Buckets Mapped</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number Of Buckets Mapped</em>' attribute.
	 * @see #setNumberOfBucketsMapped(int)
	 * @see com.misc.projects.Forecast.ForecastPackage#getMappingResult_NumberOfBucketsMapped()
	 * @model
	 * @generated
	 */
	int getNumberOfBucketsMapped();

	/**
	 * Sets the value of the '{@link com.misc.projects.Forecast.MappingResult#getNumberOfBucketsMapped <em>Number Of Buckets Mapped</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Of Buckets Mapped</em>' attribute.
	 * @see #getNumberOfBucketsMapped()
	 * @generated
	 */
	void setNumberOfBucketsMapped(int value);

	/**
	 * Returns the value of the '<em><b>Number Of Buckets To Map</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Number Of Buckets To Map</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number Of Buckets To Map</em>' attribute.
	 * @see #setNumberOfBucketsToMap(int)
	 * @see com.misc.projects.Forecast.ForecastPackage#getMappingResult_NumberOfBucketsToMap()
	 * @model
	 * @generated
	 */
	int getNumberOfBucketsToMap();

	/**
	 * Sets the value of the '{@link com.misc.projects.Forecast.MappingResult#getNumberOfBucketsToMap <em>Number Of Buckets To Map</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Of Buckets To Map</em>' attribute.
	 * @see #getNumberOfBucketsToMap()
	 * @generated
	 */
	void setNumberOfBucketsToMap(int value);

	/**
	 * Returns the value of the '<em><b>Mapped</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mapped</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mapped</em>' attribute.
	 * @see #setMapped(Date)
	 * @see com.misc.projects.Forecast.ForecastPackage#getMappingResult_Mapped()
	 * @model
	 * @generated
	 */
	Date getMapped();

	/**
	 * Sets the value of the '{@link com.misc.projects.Forecast.MappingResult#getMapped <em>Mapped</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mapped</em>' attribute.
	 * @see #getMapped()
	 * @generated
	 */
	void setMapped(Date value);

} // MappingResult
