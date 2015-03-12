/**
 */
package com.misc.projects.Forecast;

import java.math.BigDecimal;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Source Bucket</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.misc.projects.Forecast.SourceBucket#getBucketBeginTime <em>Bucket Begin Time</em>}</li>
 *   <li>{@link com.misc.projects.Forecast.SourceBucket#getBucketEndTime <em>Bucket End Time</em>}</li>
 *   <li>{@link com.misc.projects.Forecast.SourceBucket#getVolume <em>Volume</em>}</li>
 *   <li>{@link com.misc.projects.Forecast.SourceBucket#getThroughputType <em>Throughput Type</em>}</li>
 *   <li>{@link com.misc.projects.Forecast.SourceBucket#getSortingLevelAVCS <em>Sorting Level AVCS</em>}</li>
 *   <li>{@link com.misc.projects.Forecast.SourceBucket#getMechanizationLevel <em>Mechanization Level</em>}</li>
 *   <li>{@link com.misc.projects.Forecast.SourceBucket#getSortingImc <em>Sorting Imc</em>}</li>
 *   <li>{@link com.misc.projects.Forecast.SourceBucket#getDeliveryDate <em>Delivery Date</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.misc.projects.Forecast.ForecastPackage#getSourceBucket()
 * @model
 * @generated
 */
public interface SourceBucket extends EObject {
	/**
	 * Returns the value of the '<em><b>Bucket Begin Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bucket Begin Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bucket Begin Time</em>' attribute.
	 * @see #setBucketBeginTime(Date)
	 * @see com.misc.projects.Forecast.ForecastPackage#getSourceBucket_BucketBeginTime()
	 * @model
	 * @generated
	 */
	Date getBucketBeginTime();

	/**
	 * Sets the value of the '{@link com.misc.projects.Forecast.SourceBucket#getBucketBeginTime <em>Bucket Begin Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bucket Begin Time</em>' attribute.
	 * @see #getBucketBeginTime()
	 * @generated
	 */
	void setBucketBeginTime(Date value);

	/**
	 * Returns the value of the '<em><b>Bucket End Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bucket End Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bucket End Time</em>' attribute.
	 * @see #setBucketEndTime(Date)
	 * @see com.misc.projects.Forecast.ForecastPackage#getSourceBucket_BucketEndTime()
	 * @model
	 * @generated
	 */
	Date getBucketEndTime();

	/**
	 * Sets the value of the '{@link com.misc.projects.Forecast.SourceBucket#getBucketEndTime <em>Bucket End Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bucket End Time</em>' attribute.
	 * @see #getBucketEndTime()
	 * @generated
	 */
	void setBucketEndTime(Date value);

	/**
	 * Returns the value of the '<em><b>Volume</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Volume</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Volume</em>' attribute.
	 * @see #setVolume(BigDecimal)
	 * @see com.misc.projects.Forecast.ForecastPackage#getSourceBucket_Volume()
	 * @model
	 * @generated
	 */
	BigDecimal getVolume();

	/**
	 * Sets the value of the '{@link com.misc.projects.Forecast.SourceBucket#getVolume <em>Volume</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Volume</em>' attribute.
	 * @see #getVolume()
	 * @generated
	 */
	void setVolume(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Throughput Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Throughput Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Throughput Type</em>' attribute.
	 * @see #setThroughputType(BigDecimal)
	 * @see com.misc.projects.Forecast.ForecastPackage#getSourceBucket_ThroughputType()
	 * @model
	 * @generated
	 */
	BigDecimal getThroughputType();

	/**
	 * Sets the value of the '{@link com.misc.projects.Forecast.SourceBucket#getThroughputType <em>Throughput Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Throughput Type</em>' attribute.
	 * @see #getThroughputType()
	 * @generated
	 */
	void setThroughputType(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Sorting Level AVCS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sorting Level AVCS</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sorting Level AVCS</em>' attribute.
	 * @see #setSortingLevelAVCS(BigDecimal)
	 * @see com.misc.projects.Forecast.ForecastPackage#getSourceBucket_SortingLevelAVCS()
	 * @model
	 * @generated
	 */
	BigDecimal getSortingLevelAVCS();

	/**
	 * Sets the value of the '{@link com.misc.projects.Forecast.SourceBucket#getSortingLevelAVCS <em>Sorting Level AVCS</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sorting Level AVCS</em>' attribute.
	 * @see #getSortingLevelAVCS()
	 * @generated
	 */
	void setSortingLevelAVCS(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Mechanization Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mechanization Level</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mechanization Level</em>' attribute.
	 * @see #setMechanizationLevel(BigDecimal)
	 * @see com.misc.projects.Forecast.ForecastPackage#getSourceBucket_MechanizationLevel()
	 * @model
	 * @generated
	 */
	BigDecimal getMechanizationLevel();

	/**
	 * Sets the value of the '{@link com.misc.projects.Forecast.SourceBucket#getMechanizationLevel <em>Mechanization Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mechanization Level</em>' attribute.
	 * @see #getMechanizationLevel()
	 * @generated
	 */
	void setMechanizationLevel(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Sorting Imc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sorting Imc</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sorting Imc</em>' attribute.
	 * @see #setSortingImc(BigDecimal)
	 * @see com.misc.projects.Forecast.ForecastPackage#getSourceBucket_SortingImc()
	 * @model
	 * @generated
	 */
	BigDecimal getSortingImc();

	/**
	 * Sets the value of the '{@link com.misc.projects.Forecast.SourceBucket#getSortingImc <em>Sorting Imc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sorting Imc</em>' attribute.
	 * @see #getSortingImc()
	 * @generated
	 */
	void setSortingImc(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Delivery Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Delivery Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delivery Date</em>' attribute.
	 * @see #setDeliveryDate(Date)
	 * @see com.misc.projects.Forecast.ForecastPackage#getSourceBucket_DeliveryDate()
	 * @model
	 * @generated
	 */
	Date getDeliveryDate();

	/**
	 * Sets the value of the '{@link com.misc.projects.Forecast.SourceBucket#getDeliveryDate <em>Delivery Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delivery Date</em>' attribute.
	 * @see #getDeliveryDate()
	 * @generated
	 */
	void setDeliveryDate(Date value);

} // SourceBucket
