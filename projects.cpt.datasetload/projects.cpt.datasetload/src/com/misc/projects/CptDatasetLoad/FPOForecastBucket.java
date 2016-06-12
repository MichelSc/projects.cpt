/**
 */
package com.misc.projects.CptDatasetLoad;

import com.misc.common.moplaf.dbsynch.TableRow;
import java.math.BigDecimal;
import java.util.Date;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>FPO Forecast Bucket</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.projects.CptDatasetLoad.FPOForecastBucket#getBucketDate <em>Bucket Date</em>}</li>
 *   <li>{@link com.misc.projects.CptDatasetLoad.FPOForecastBucket#getBucketBeginTime <em>Bucket Begin Time</em>}</li>
 *   <li>{@link com.misc.projects.CptDatasetLoad.FPOForecastBucket#getBucketEndTime <em>Bucket End Time</em>}</li>
 *   <li>{@link com.misc.projects.CptDatasetLoad.FPOForecastBucket#getBucketHour <em>Bucket Hour</em>}</li>
 *   <li>{@link com.misc.projects.CptDatasetLoad.FPOForecastBucket#getCustomer <em>Customer</em>}</li>
 *   <li>{@link com.misc.projects.CptDatasetLoad.FPOForecastBucket#getFirstSortingImc <em>First Sorting Imc</em>}</li>
 *   <li>{@link com.misc.projects.CptDatasetLoad.FPOForecastBucket#getIntakeChannel <em>Intake Channel</em>}</li>
 *   <li>{@link com.misc.projects.CptDatasetLoad.FPOForecastBucket#getIntakeLocation <em>Intake Location</em>}</li>
 *   <li>{@link com.misc.projects.CptDatasetLoad.FPOForecastBucket#getDayPlus <em>Day Plus</em>}</li>
 *   <li>{@link com.misc.projects.CptDatasetLoad.FPOForecastBucket#getThroughputType <em>Throughput Type</em>}</li>
 *   <li>{@link com.misc.projects.CptDatasetLoad.FPOForecastBucket#getMechanizationLevel <em>Mechanization Level</em>}</li>
 *   <li>{@link com.misc.projects.CptDatasetLoad.FPOForecastBucket#getSortingLevelAGG <em>Sorting Level AGG</em>}</li>
 *   <li>{@link com.misc.projects.CptDatasetLoad.FPOForecastBucket#getVolume <em>Volume</em>}</li>
 *   <li>{@link com.misc.projects.CptDatasetLoad.FPOForecastBucket#getPublicationID <em>Publication ID</em>}</li>
 *   <li>{@link com.misc.projects.CptDatasetLoad.FPOForecastBucket#getTimeSeriesID <em>Time Series ID</em>}</li>
 *   <li>{@link com.misc.projects.CptDatasetLoad.FPOForecastBucket#getBucketID <em>Bucket ID</em>}</li>
 * </ul>
 *
 * @see com.misc.projects.CptDatasetLoad.CptDatasetLoadPackage#getFPOForecastBucket()
 * @model
 * @generated
 */
public interface FPOForecastBucket extends TableRow {
	/**
	 * Returns the value of the '<em><b>Bucket Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bucket Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bucket Date</em>' attribute.
	 * @see #setBucketDate(Date)
	 * @see com.misc.projects.CptDatasetLoad.CptDatasetLoadPackage#getFPOForecastBucket_BucketDate()
	 * @model
	 * @generated
	 */
	Date getBucketDate();

	/**
	 * Sets the value of the '{@link com.misc.projects.CptDatasetLoad.FPOForecastBucket#getBucketDate <em>Bucket Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bucket Date</em>' attribute.
	 * @see #getBucketDate()
	 * @generated
	 */
	void setBucketDate(Date value);

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
	 * @see com.misc.projects.CptDatasetLoad.CptDatasetLoadPackage#getFPOForecastBucket_BucketBeginTime()
	 * @model
	 * @generated
	 */
	Date getBucketBeginTime();

	/**
	 * Sets the value of the '{@link com.misc.projects.CptDatasetLoad.FPOForecastBucket#getBucketBeginTime <em>Bucket Begin Time</em>}' attribute.
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
	 * @see com.misc.projects.CptDatasetLoad.CptDatasetLoadPackage#getFPOForecastBucket_BucketEndTime()
	 * @model
	 * @generated
	 */
	Date getBucketEndTime();

	/**
	 * Sets the value of the '{@link com.misc.projects.CptDatasetLoad.FPOForecastBucket#getBucketEndTime <em>Bucket End Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bucket End Time</em>' attribute.
	 * @see #getBucketEndTime()
	 * @generated
	 */
	void setBucketEndTime(Date value);

	/**
	 * Returns the value of the '<em><b>Bucket Hour</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bucket Hour</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bucket Hour</em>' attribute.
	 * @see #setBucketHour(BigDecimal)
	 * @see com.misc.projects.CptDatasetLoad.CptDatasetLoadPackage#getFPOForecastBucket_BucketHour()
	 * @model
	 * @generated
	 */
	BigDecimal getBucketHour();

	/**
	 * Sets the value of the '{@link com.misc.projects.CptDatasetLoad.FPOForecastBucket#getBucketHour <em>Bucket Hour</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bucket Hour</em>' attribute.
	 * @see #getBucketHour()
	 * @generated
	 */
	void setBucketHour(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Customer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Customer</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Customer</em>' attribute.
	 * @see #setCustomer(BigDecimal)
	 * @see com.misc.projects.CptDatasetLoad.CptDatasetLoadPackage#getFPOForecastBucket_Customer()
	 * @model
	 * @generated
	 */
	BigDecimal getCustomer();

	/**
	 * Sets the value of the '{@link com.misc.projects.CptDatasetLoad.FPOForecastBucket#getCustomer <em>Customer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Customer</em>' attribute.
	 * @see #getCustomer()
	 * @generated
	 */
	void setCustomer(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>First Sorting Imc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>First Sorting Imc</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>First Sorting Imc</em>' attribute.
	 * @see #setFirstSortingImc(BigDecimal)
	 * @see com.misc.projects.CptDatasetLoad.CptDatasetLoadPackage#getFPOForecastBucket_FirstSortingImc()
	 * @model
	 * @generated
	 */
	BigDecimal getFirstSortingImc();

	/**
	 * Sets the value of the '{@link com.misc.projects.CptDatasetLoad.FPOForecastBucket#getFirstSortingImc <em>First Sorting Imc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>First Sorting Imc</em>' attribute.
	 * @see #getFirstSortingImc()
	 * @generated
	 */
	void setFirstSortingImc(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Intake Channel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Intake Channel</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Intake Channel</em>' attribute.
	 * @see #setIntakeChannel(BigDecimal)
	 * @see com.misc.projects.CptDatasetLoad.CptDatasetLoadPackage#getFPOForecastBucket_IntakeChannel()
	 * @model
	 * @generated
	 */
	BigDecimal getIntakeChannel();

	/**
	 * Sets the value of the '{@link com.misc.projects.CptDatasetLoad.FPOForecastBucket#getIntakeChannel <em>Intake Channel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Intake Channel</em>' attribute.
	 * @see #getIntakeChannel()
	 * @generated
	 */
	void setIntakeChannel(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Intake Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Intake Location</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Intake Location</em>' attribute.
	 * @see #setIntakeLocation(BigDecimal)
	 * @see com.misc.projects.CptDatasetLoad.CptDatasetLoadPackage#getFPOForecastBucket_IntakeLocation()
	 * @model
	 * @generated
	 */
	BigDecimal getIntakeLocation();

	/**
	 * Sets the value of the '{@link com.misc.projects.CptDatasetLoad.FPOForecastBucket#getIntakeLocation <em>Intake Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Intake Location</em>' attribute.
	 * @see #getIntakeLocation()
	 * @generated
	 */
	void setIntakeLocation(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Day Plus</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Day Plus</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Day Plus</em>' attribute.
	 * @see #setDayPlus(BigDecimal)
	 * @see com.misc.projects.CptDatasetLoad.CptDatasetLoadPackage#getFPOForecastBucket_DayPlus()
	 * @model
	 * @generated
	 */
	BigDecimal getDayPlus();

	/**
	 * Sets the value of the '{@link com.misc.projects.CptDatasetLoad.FPOForecastBucket#getDayPlus <em>Day Plus</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Day Plus</em>' attribute.
	 * @see #getDayPlus()
	 * @generated
	 */
	void setDayPlus(BigDecimal value);

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
	 * @see com.misc.projects.CptDatasetLoad.CptDatasetLoadPackage#getFPOForecastBucket_ThroughputType()
	 * @model
	 * @generated
	 */
	BigDecimal getThroughputType();

	/**
	 * Sets the value of the '{@link com.misc.projects.CptDatasetLoad.FPOForecastBucket#getThroughputType <em>Throughput Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Throughput Type</em>' attribute.
	 * @see #getThroughputType()
	 * @generated
	 */
	void setThroughputType(BigDecimal value);

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
	 * @see com.misc.projects.CptDatasetLoad.CptDatasetLoadPackage#getFPOForecastBucket_MechanizationLevel()
	 * @model
	 * @generated
	 */
	BigDecimal getMechanizationLevel();

	/**
	 * Sets the value of the '{@link com.misc.projects.CptDatasetLoad.FPOForecastBucket#getMechanizationLevel <em>Mechanization Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mechanization Level</em>' attribute.
	 * @see #getMechanizationLevel()
	 * @generated
	 */
	void setMechanizationLevel(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Sorting Level AGG</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sorting Level AGG</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sorting Level AGG</em>' attribute.
	 * @see #setSortingLevelAGG(BigDecimal)
	 * @see com.misc.projects.CptDatasetLoad.CptDatasetLoadPackage#getFPOForecastBucket_SortingLevelAGG()
	 * @model
	 * @generated
	 */
	BigDecimal getSortingLevelAGG();

	/**
	 * Sets the value of the '{@link com.misc.projects.CptDatasetLoad.FPOForecastBucket#getSortingLevelAGG <em>Sorting Level AGG</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sorting Level AGG</em>' attribute.
	 * @see #getSortingLevelAGG()
	 * @generated
	 */
	void setSortingLevelAGG(BigDecimal value);

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
	 * @see com.misc.projects.CptDatasetLoad.CptDatasetLoadPackage#getFPOForecastBucket_Volume()
	 * @model
	 * @generated
	 */
	BigDecimal getVolume();

	/**
	 * Sets the value of the '{@link com.misc.projects.CptDatasetLoad.FPOForecastBucket#getVolume <em>Volume</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Volume</em>' attribute.
	 * @see #getVolume()
	 * @generated
	 */
	void setVolume(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Publication ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Publication ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Publication ID</em>' attribute.
	 * @see #setPublicationID(String)
	 * @see com.misc.projects.CptDatasetLoad.CptDatasetLoadPackage#getFPOForecastBucket_PublicationID()
	 * @model
	 * @generated
	 */
	String getPublicationID();

	/**
	 * Sets the value of the '{@link com.misc.projects.CptDatasetLoad.FPOForecastBucket#getPublicationID <em>Publication ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Publication ID</em>' attribute.
	 * @see #getPublicationID()
	 * @generated
	 */
	void setPublicationID(String value);

	/**
	 * Returns the value of the '<em><b>Time Series ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time Series ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Series ID</em>' attribute.
	 * @see #setTimeSeriesID(String)
	 * @see com.misc.projects.CptDatasetLoad.CptDatasetLoadPackage#getFPOForecastBucket_TimeSeriesID()
	 * @model
	 * @generated
	 */
	String getTimeSeriesID();

	/**
	 * Sets the value of the '{@link com.misc.projects.CptDatasetLoad.FPOForecastBucket#getTimeSeriesID <em>Time Series ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Series ID</em>' attribute.
	 * @see #getTimeSeriesID()
	 * @generated
	 */
	void setTimeSeriesID(String value);

	/**
	 * Returns the value of the '<em><b>Bucket ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bucket ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bucket ID</em>' attribute.
	 * @see #setBucketID(String)
	 * @see com.misc.projects.CptDatasetLoad.CptDatasetLoadPackage#getFPOForecastBucket_BucketID()
	 * @model
	 * @generated
	 */
	String getBucketID();

	/**
	 * Sets the value of the '{@link com.misc.projects.CptDatasetLoad.FPOForecastBucket#getBucketID <em>Bucket ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bucket ID</em>' attribute.
	 * @see #getBucketID()
	 * @generated
	 */
	void setBucketID(String value);

} // FPOForecastBucket
