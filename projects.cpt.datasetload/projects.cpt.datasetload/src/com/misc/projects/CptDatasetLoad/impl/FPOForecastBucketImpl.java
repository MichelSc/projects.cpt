/**
 */
package com.misc.projects.CptDatasetLoad.impl;

import com.misc.common.moplaf.datasetload.impl.TableRowImpl;

import com.misc.projects.CptDatasetLoad.CptDatasetLoadPackage;
import com.misc.projects.CptDatasetLoad.FPOForecastBucket;

import java.math.BigDecimal;
import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>FPO Forecast Bucket</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.misc.projects.CptDatasetLoad.impl.FPOForecastBucketImpl#getBucketDate <em>Bucket Date</em>}</li>
 *   <li>{@link com.misc.projects.CptDatasetLoad.impl.FPOForecastBucketImpl#getBucketBeginTime <em>Bucket Begin Time</em>}</li>
 *   <li>{@link com.misc.projects.CptDatasetLoad.impl.FPOForecastBucketImpl#getBucketEndTime <em>Bucket End Time</em>}</li>
 *   <li>{@link com.misc.projects.CptDatasetLoad.impl.FPOForecastBucketImpl#getBucketHour <em>Bucket Hour</em>}</li>
 *   <li>{@link com.misc.projects.CptDatasetLoad.impl.FPOForecastBucketImpl#getCustomer <em>Customer</em>}</li>
 *   <li>{@link com.misc.projects.CptDatasetLoad.impl.FPOForecastBucketImpl#getFirstSortingImc <em>First Sorting Imc</em>}</li>
 *   <li>{@link com.misc.projects.CptDatasetLoad.impl.FPOForecastBucketImpl#getIntakeChannel <em>Intake Channel</em>}</li>
 *   <li>{@link com.misc.projects.CptDatasetLoad.impl.FPOForecastBucketImpl#getIntakeLocation <em>Intake Location</em>}</li>
 *   <li>{@link com.misc.projects.CptDatasetLoad.impl.FPOForecastBucketImpl#getDayPlus <em>Day Plus</em>}</li>
 *   <li>{@link com.misc.projects.CptDatasetLoad.impl.FPOForecastBucketImpl#getThroughputType <em>Throughput Type</em>}</li>
 *   <li>{@link com.misc.projects.CptDatasetLoad.impl.FPOForecastBucketImpl#getMechanizationLevel <em>Mechanization Level</em>}</li>
 *   <li>{@link com.misc.projects.CptDatasetLoad.impl.FPOForecastBucketImpl#getSortingLevelAGG <em>Sorting Level AGG</em>}</li>
 *   <li>{@link com.misc.projects.CptDatasetLoad.impl.FPOForecastBucketImpl#getVolume <em>Volume</em>}</li>
 *   <li>{@link com.misc.projects.CptDatasetLoad.impl.FPOForecastBucketImpl#getPublicationID <em>Publication ID</em>}</li>
 *   <li>{@link com.misc.projects.CptDatasetLoad.impl.FPOForecastBucketImpl#getTimeSeriesID <em>Time Series ID</em>}</li>
 *   <li>{@link com.misc.projects.CptDatasetLoad.impl.FPOForecastBucketImpl#getBucketID <em>Bucket ID</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FPOForecastBucketImpl extends TableRowImpl implements FPOForecastBucket {
	/**
	 * The default value of the '{@link #getBucketDate() <em>Bucket Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBucketDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date BUCKET_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBucketDate() <em>Bucket Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBucketDate()
	 * @generated
	 * @ordered
	 */
	protected Date bucketDate = BUCKET_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getBucketBeginTime() <em>Bucket Begin Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBucketBeginTime()
	 * @generated
	 * @ordered
	 */
	protected static final Date BUCKET_BEGIN_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBucketBeginTime() <em>Bucket Begin Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBucketBeginTime()
	 * @generated
	 * @ordered
	 */
	protected Date bucketBeginTime = BUCKET_BEGIN_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getBucketEndTime() <em>Bucket End Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBucketEndTime()
	 * @generated
	 * @ordered
	 */
	protected static final Date BUCKET_END_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBucketEndTime() <em>Bucket End Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBucketEndTime()
	 * @generated
	 * @ordered
	 */
	protected Date bucketEndTime = BUCKET_END_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getBucketHour() <em>Bucket Hour</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBucketHour()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal BUCKET_HOUR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBucketHour() <em>Bucket Hour</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBucketHour()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal bucketHour = BUCKET_HOUR_EDEFAULT;

	/**
	 * The default value of the '{@link #getCustomer() <em>Customer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomer()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal CUSTOMER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCustomer() <em>Customer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomer()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal customer = CUSTOMER_EDEFAULT;

	/**
	 * The default value of the '{@link #getFirstSortingImc() <em>First Sorting Imc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstSortingImc()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal FIRST_SORTING_IMC_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFirstSortingImc() <em>First Sorting Imc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstSortingImc()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal firstSortingImc = FIRST_SORTING_IMC_EDEFAULT;

	/**
	 * The default value of the '{@link #getIntakeChannel() <em>Intake Channel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntakeChannel()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal INTAKE_CHANNEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIntakeChannel() <em>Intake Channel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntakeChannel()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal intakeChannel = INTAKE_CHANNEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getIntakeLocation() <em>Intake Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntakeLocation()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal INTAKE_LOCATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIntakeLocation() <em>Intake Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntakeLocation()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal intakeLocation = INTAKE_LOCATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getDayPlus() <em>Day Plus</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDayPlus()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal DAY_PLUS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDayPlus() <em>Day Plus</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDayPlus()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal dayPlus = DAY_PLUS_EDEFAULT;

	/**
	 * The default value of the '{@link #getThroughputType() <em>Throughput Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThroughputType()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal THROUGHPUT_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getThroughputType() <em>Throughput Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThroughputType()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal throughputType = THROUGHPUT_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMechanizationLevel() <em>Mechanization Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMechanizationLevel()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal MECHANIZATION_LEVEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMechanizationLevel() <em>Mechanization Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMechanizationLevel()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal mechanizationLevel = MECHANIZATION_LEVEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getSortingLevelAGG() <em>Sorting Level AGG</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSortingLevelAGG()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal SORTING_LEVEL_AGG_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSortingLevelAGG() <em>Sorting Level AGG</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSortingLevelAGG()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal sortingLevelAGG = SORTING_LEVEL_AGG_EDEFAULT;

	/**
	 * The default value of the '{@link #getVolume() <em>Volume</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVolume()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal VOLUME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVolume() <em>Volume</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVolume()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal volume = VOLUME_EDEFAULT;

	/**
	 * The default value of the '{@link #getPublicationID() <em>Publication ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublicationID()
	 * @generated
	 * @ordered
	 */
	protected static final String PUBLICATION_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPublicationID() <em>Publication ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublicationID()
	 * @generated
	 * @ordered
	 */
	protected String publicationID = PUBLICATION_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getTimeSeriesID() <em>Time Series ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeSeriesID()
	 * @generated
	 * @ordered
	 */
	protected static final String TIME_SERIES_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTimeSeriesID() <em>Time Series ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeSeriesID()
	 * @generated
	 * @ordered
	 */
	protected String timeSeriesID = TIME_SERIES_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getBucketID() <em>Bucket ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBucketID()
	 * @generated
	 * @ordered
	 */
	protected static final String BUCKET_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBucketID() <em>Bucket ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBucketID()
	 * @generated
	 * @ordered
	 */
	protected String bucketID = BUCKET_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FPOForecastBucketImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CptDatasetLoadPackage.Literals.FPO_FORECAST_BUCKET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getBucketDate() {
		return bucketDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBucketDate(Date newBucketDate) {
		Date oldBucketDate = bucketDate;
		bucketDate = newBucketDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CptDatasetLoadPackage.FPO_FORECAST_BUCKET__BUCKET_DATE, oldBucketDate, bucketDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getBucketBeginTime() {
		return bucketBeginTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBucketBeginTime(Date newBucketBeginTime) {
		Date oldBucketBeginTime = bucketBeginTime;
		bucketBeginTime = newBucketBeginTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CptDatasetLoadPackage.FPO_FORECAST_BUCKET__BUCKET_BEGIN_TIME, oldBucketBeginTime, bucketBeginTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getBucketEndTime() {
		return bucketEndTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBucketEndTime(Date newBucketEndTime) {
		Date oldBucketEndTime = bucketEndTime;
		bucketEndTime = newBucketEndTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CptDatasetLoadPackage.FPO_FORECAST_BUCKET__BUCKET_END_TIME, oldBucketEndTime, bucketEndTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal getBucketHour() {
		return bucketHour;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBucketHour(BigDecimal newBucketHour) {
		BigDecimal oldBucketHour = bucketHour;
		bucketHour = newBucketHour;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CptDatasetLoadPackage.FPO_FORECAST_BUCKET__BUCKET_HOUR, oldBucketHour, bucketHour));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal getCustomer() {
		return customer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCustomer(BigDecimal newCustomer) {
		BigDecimal oldCustomer = customer;
		customer = newCustomer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CptDatasetLoadPackage.FPO_FORECAST_BUCKET__CUSTOMER, oldCustomer, customer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal getFirstSortingImc() {
		return firstSortingImc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFirstSortingImc(BigDecimal newFirstSortingImc) {
		BigDecimal oldFirstSortingImc = firstSortingImc;
		firstSortingImc = newFirstSortingImc;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CptDatasetLoadPackage.FPO_FORECAST_BUCKET__FIRST_SORTING_IMC, oldFirstSortingImc, firstSortingImc));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal getIntakeChannel() {
		return intakeChannel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIntakeChannel(BigDecimal newIntakeChannel) {
		BigDecimal oldIntakeChannel = intakeChannel;
		intakeChannel = newIntakeChannel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CptDatasetLoadPackage.FPO_FORECAST_BUCKET__INTAKE_CHANNEL, oldIntakeChannel, intakeChannel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal getIntakeLocation() {
		return intakeLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIntakeLocation(BigDecimal newIntakeLocation) {
		BigDecimal oldIntakeLocation = intakeLocation;
		intakeLocation = newIntakeLocation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CptDatasetLoadPackage.FPO_FORECAST_BUCKET__INTAKE_LOCATION, oldIntakeLocation, intakeLocation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal getDayPlus() {
		return dayPlus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDayPlus(BigDecimal newDayPlus) {
		BigDecimal oldDayPlus = dayPlus;
		dayPlus = newDayPlus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CptDatasetLoadPackage.FPO_FORECAST_BUCKET__DAY_PLUS, oldDayPlus, dayPlus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal getThroughputType() {
		return throughputType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThroughputType(BigDecimal newThroughputType) {
		BigDecimal oldThroughputType = throughputType;
		throughputType = newThroughputType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CptDatasetLoadPackage.FPO_FORECAST_BUCKET__THROUGHPUT_TYPE, oldThroughputType, throughputType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal getMechanizationLevel() {
		return mechanizationLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMechanizationLevel(BigDecimal newMechanizationLevel) {
		BigDecimal oldMechanizationLevel = mechanizationLevel;
		mechanizationLevel = newMechanizationLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CptDatasetLoadPackage.FPO_FORECAST_BUCKET__MECHANIZATION_LEVEL, oldMechanizationLevel, mechanizationLevel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal getSortingLevelAGG() {
		return sortingLevelAGG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSortingLevelAGG(BigDecimal newSortingLevelAGG) {
		BigDecimal oldSortingLevelAGG = sortingLevelAGG;
		sortingLevelAGG = newSortingLevelAGG;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CptDatasetLoadPackage.FPO_FORECAST_BUCKET__SORTING_LEVEL_AGG, oldSortingLevelAGG, sortingLevelAGG));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal getVolume() {
		return volume;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVolume(BigDecimal newVolume) {
		BigDecimal oldVolume = volume;
		volume = newVolume;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CptDatasetLoadPackage.FPO_FORECAST_BUCKET__VOLUME, oldVolume, volume));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPublicationID() {
		return publicationID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPublicationID(String newPublicationID) {
		String oldPublicationID = publicationID;
		publicationID = newPublicationID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CptDatasetLoadPackage.FPO_FORECAST_BUCKET__PUBLICATION_ID, oldPublicationID, publicationID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTimeSeriesID() {
		return timeSeriesID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeSeriesID(String newTimeSeriesID) {
		String oldTimeSeriesID = timeSeriesID;
		timeSeriesID = newTimeSeriesID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CptDatasetLoadPackage.FPO_FORECAST_BUCKET__TIME_SERIES_ID, oldTimeSeriesID, timeSeriesID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBucketID() {
		return bucketID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBucketID(String newBucketID) {
		String oldBucketID = bucketID;
		bucketID = newBucketID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CptDatasetLoadPackage.FPO_FORECAST_BUCKET__BUCKET_ID, oldBucketID, bucketID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CptDatasetLoadPackage.FPO_FORECAST_BUCKET__BUCKET_DATE:
				return getBucketDate();
			case CptDatasetLoadPackage.FPO_FORECAST_BUCKET__BUCKET_BEGIN_TIME:
				return getBucketBeginTime();
			case CptDatasetLoadPackage.FPO_FORECAST_BUCKET__BUCKET_END_TIME:
				return getBucketEndTime();
			case CptDatasetLoadPackage.FPO_FORECAST_BUCKET__BUCKET_HOUR:
				return getBucketHour();
			case CptDatasetLoadPackage.FPO_FORECAST_BUCKET__CUSTOMER:
				return getCustomer();
			case CptDatasetLoadPackage.FPO_FORECAST_BUCKET__FIRST_SORTING_IMC:
				return getFirstSortingImc();
			case CptDatasetLoadPackage.FPO_FORECAST_BUCKET__INTAKE_CHANNEL:
				return getIntakeChannel();
			case CptDatasetLoadPackage.FPO_FORECAST_BUCKET__INTAKE_LOCATION:
				return getIntakeLocation();
			case CptDatasetLoadPackage.FPO_FORECAST_BUCKET__DAY_PLUS:
				return getDayPlus();
			case CptDatasetLoadPackage.FPO_FORECAST_BUCKET__THROUGHPUT_TYPE:
				return getThroughputType();
			case CptDatasetLoadPackage.FPO_FORECAST_BUCKET__MECHANIZATION_LEVEL:
				return getMechanizationLevel();
			case CptDatasetLoadPackage.FPO_FORECAST_BUCKET__SORTING_LEVEL_AGG:
				return getSortingLevelAGG();
			case CptDatasetLoadPackage.FPO_FORECAST_BUCKET__VOLUME:
				return getVolume();
			case CptDatasetLoadPackage.FPO_FORECAST_BUCKET__PUBLICATION_ID:
				return getPublicationID();
			case CptDatasetLoadPackage.FPO_FORECAST_BUCKET__TIME_SERIES_ID:
				return getTimeSeriesID();
			case CptDatasetLoadPackage.FPO_FORECAST_BUCKET__BUCKET_ID:
				return getBucketID();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CptDatasetLoadPackage.FPO_FORECAST_BUCKET__BUCKET_DATE:
				setBucketDate((Date)newValue);
				return;
			case CptDatasetLoadPackage.FPO_FORECAST_BUCKET__BUCKET_BEGIN_TIME:
				setBucketBeginTime((Date)newValue);
				return;
			case CptDatasetLoadPackage.FPO_FORECAST_BUCKET__BUCKET_END_TIME:
				setBucketEndTime((Date)newValue);
				return;
			case CptDatasetLoadPackage.FPO_FORECAST_BUCKET__BUCKET_HOUR:
				setBucketHour((BigDecimal)newValue);
				return;
			case CptDatasetLoadPackage.FPO_FORECAST_BUCKET__CUSTOMER:
				setCustomer((BigDecimal)newValue);
				return;
			case CptDatasetLoadPackage.FPO_FORECAST_BUCKET__FIRST_SORTING_IMC:
				setFirstSortingImc((BigDecimal)newValue);
				return;
			case CptDatasetLoadPackage.FPO_FORECAST_BUCKET__INTAKE_CHANNEL:
				setIntakeChannel((BigDecimal)newValue);
				return;
			case CptDatasetLoadPackage.FPO_FORECAST_BUCKET__INTAKE_LOCATION:
				setIntakeLocation((BigDecimal)newValue);
				return;
			case CptDatasetLoadPackage.FPO_FORECAST_BUCKET__DAY_PLUS:
				setDayPlus((BigDecimal)newValue);
				return;
			case CptDatasetLoadPackage.FPO_FORECAST_BUCKET__THROUGHPUT_TYPE:
				setThroughputType((BigDecimal)newValue);
				return;
			case CptDatasetLoadPackage.FPO_FORECAST_BUCKET__MECHANIZATION_LEVEL:
				setMechanizationLevel((BigDecimal)newValue);
				return;
			case CptDatasetLoadPackage.FPO_FORECAST_BUCKET__SORTING_LEVEL_AGG:
				setSortingLevelAGG((BigDecimal)newValue);
				return;
			case CptDatasetLoadPackage.FPO_FORECAST_BUCKET__VOLUME:
				setVolume((BigDecimal)newValue);
				return;
			case CptDatasetLoadPackage.FPO_FORECAST_BUCKET__PUBLICATION_ID:
				setPublicationID((String)newValue);
				return;
			case CptDatasetLoadPackage.FPO_FORECAST_BUCKET__TIME_SERIES_ID:
				setTimeSeriesID((String)newValue);
				return;
			case CptDatasetLoadPackage.FPO_FORECAST_BUCKET__BUCKET_ID:
				setBucketID((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case CptDatasetLoadPackage.FPO_FORECAST_BUCKET__BUCKET_DATE:
				setBucketDate(BUCKET_DATE_EDEFAULT);
				return;
			case CptDatasetLoadPackage.FPO_FORECAST_BUCKET__BUCKET_BEGIN_TIME:
				setBucketBeginTime(BUCKET_BEGIN_TIME_EDEFAULT);
				return;
			case CptDatasetLoadPackage.FPO_FORECAST_BUCKET__BUCKET_END_TIME:
				setBucketEndTime(BUCKET_END_TIME_EDEFAULT);
				return;
			case CptDatasetLoadPackage.FPO_FORECAST_BUCKET__BUCKET_HOUR:
				setBucketHour(BUCKET_HOUR_EDEFAULT);
				return;
			case CptDatasetLoadPackage.FPO_FORECAST_BUCKET__CUSTOMER:
				setCustomer(CUSTOMER_EDEFAULT);
				return;
			case CptDatasetLoadPackage.FPO_FORECAST_BUCKET__FIRST_SORTING_IMC:
				setFirstSortingImc(FIRST_SORTING_IMC_EDEFAULT);
				return;
			case CptDatasetLoadPackage.FPO_FORECAST_BUCKET__INTAKE_CHANNEL:
				setIntakeChannel(INTAKE_CHANNEL_EDEFAULT);
				return;
			case CptDatasetLoadPackage.FPO_FORECAST_BUCKET__INTAKE_LOCATION:
				setIntakeLocation(INTAKE_LOCATION_EDEFAULT);
				return;
			case CptDatasetLoadPackage.FPO_FORECAST_BUCKET__DAY_PLUS:
				setDayPlus(DAY_PLUS_EDEFAULT);
				return;
			case CptDatasetLoadPackage.FPO_FORECAST_BUCKET__THROUGHPUT_TYPE:
				setThroughputType(THROUGHPUT_TYPE_EDEFAULT);
				return;
			case CptDatasetLoadPackage.FPO_FORECAST_BUCKET__MECHANIZATION_LEVEL:
				setMechanizationLevel(MECHANIZATION_LEVEL_EDEFAULT);
				return;
			case CptDatasetLoadPackage.FPO_FORECAST_BUCKET__SORTING_LEVEL_AGG:
				setSortingLevelAGG(SORTING_LEVEL_AGG_EDEFAULT);
				return;
			case CptDatasetLoadPackage.FPO_FORECAST_BUCKET__VOLUME:
				setVolume(VOLUME_EDEFAULT);
				return;
			case CptDatasetLoadPackage.FPO_FORECAST_BUCKET__PUBLICATION_ID:
				setPublicationID(PUBLICATION_ID_EDEFAULT);
				return;
			case CptDatasetLoadPackage.FPO_FORECAST_BUCKET__TIME_SERIES_ID:
				setTimeSeriesID(TIME_SERIES_ID_EDEFAULT);
				return;
			case CptDatasetLoadPackage.FPO_FORECAST_BUCKET__BUCKET_ID:
				setBucketID(BUCKET_ID_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case CptDatasetLoadPackage.FPO_FORECAST_BUCKET__BUCKET_DATE:
				return BUCKET_DATE_EDEFAULT == null ? bucketDate != null : !BUCKET_DATE_EDEFAULT.equals(bucketDate);
			case CptDatasetLoadPackage.FPO_FORECAST_BUCKET__BUCKET_BEGIN_TIME:
				return BUCKET_BEGIN_TIME_EDEFAULT == null ? bucketBeginTime != null : !BUCKET_BEGIN_TIME_EDEFAULT.equals(bucketBeginTime);
			case CptDatasetLoadPackage.FPO_FORECAST_BUCKET__BUCKET_END_TIME:
				return BUCKET_END_TIME_EDEFAULT == null ? bucketEndTime != null : !BUCKET_END_TIME_EDEFAULT.equals(bucketEndTime);
			case CptDatasetLoadPackage.FPO_FORECAST_BUCKET__BUCKET_HOUR:
				return BUCKET_HOUR_EDEFAULT == null ? bucketHour != null : !BUCKET_HOUR_EDEFAULT.equals(bucketHour);
			case CptDatasetLoadPackage.FPO_FORECAST_BUCKET__CUSTOMER:
				return CUSTOMER_EDEFAULT == null ? customer != null : !CUSTOMER_EDEFAULT.equals(customer);
			case CptDatasetLoadPackage.FPO_FORECAST_BUCKET__FIRST_SORTING_IMC:
				return FIRST_SORTING_IMC_EDEFAULT == null ? firstSortingImc != null : !FIRST_SORTING_IMC_EDEFAULT.equals(firstSortingImc);
			case CptDatasetLoadPackage.FPO_FORECAST_BUCKET__INTAKE_CHANNEL:
				return INTAKE_CHANNEL_EDEFAULT == null ? intakeChannel != null : !INTAKE_CHANNEL_EDEFAULT.equals(intakeChannel);
			case CptDatasetLoadPackage.FPO_FORECAST_BUCKET__INTAKE_LOCATION:
				return INTAKE_LOCATION_EDEFAULT == null ? intakeLocation != null : !INTAKE_LOCATION_EDEFAULT.equals(intakeLocation);
			case CptDatasetLoadPackage.FPO_FORECAST_BUCKET__DAY_PLUS:
				return DAY_PLUS_EDEFAULT == null ? dayPlus != null : !DAY_PLUS_EDEFAULT.equals(dayPlus);
			case CptDatasetLoadPackage.FPO_FORECAST_BUCKET__THROUGHPUT_TYPE:
				return THROUGHPUT_TYPE_EDEFAULT == null ? throughputType != null : !THROUGHPUT_TYPE_EDEFAULT.equals(throughputType);
			case CptDatasetLoadPackage.FPO_FORECAST_BUCKET__MECHANIZATION_LEVEL:
				return MECHANIZATION_LEVEL_EDEFAULT == null ? mechanizationLevel != null : !MECHANIZATION_LEVEL_EDEFAULT.equals(mechanizationLevel);
			case CptDatasetLoadPackage.FPO_FORECAST_BUCKET__SORTING_LEVEL_AGG:
				return SORTING_LEVEL_AGG_EDEFAULT == null ? sortingLevelAGG != null : !SORTING_LEVEL_AGG_EDEFAULT.equals(sortingLevelAGG);
			case CptDatasetLoadPackage.FPO_FORECAST_BUCKET__VOLUME:
				return VOLUME_EDEFAULT == null ? volume != null : !VOLUME_EDEFAULT.equals(volume);
			case CptDatasetLoadPackage.FPO_FORECAST_BUCKET__PUBLICATION_ID:
				return PUBLICATION_ID_EDEFAULT == null ? publicationID != null : !PUBLICATION_ID_EDEFAULT.equals(publicationID);
			case CptDatasetLoadPackage.FPO_FORECAST_BUCKET__TIME_SERIES_ID:
				return TIME_SERIES_ID_EDEFAULT == null ? timeSeriesID != null : !TIME_SERIES_ID_EDEFAULT.equals(timeSeriesID);
			case CptDatasetLoadPackage.FPO_FORECAST_BUCKET__BUCKET_ID:
				return BUCKET_ID_EDEFAULT == null ? bucketID != null : !BUCKET_ID_EDEFAULT.equals(bucketID);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (BucketDate: ");
		result.append(bucketDate);
		result.append(", BucketBeginTime: ");
		result.append(bucketBeginTime);
		result.append(", BucketEndTime: ");
		result.append(bucketEndTime);
		result.append(", BucketHour: ");
		result.append(bucketHour);
		result.append(", Customer: ");
		result.append(customer);
		result.append(", FirstSortingImc: ");
		result.append(firstSortingImc);
		result.append(", IntakeChannel: ");
		result.append(intakeChannel);
		result.append(", IntakeLocation: ");
		result.append(intakeLocation);
		result.append(", DayPlus: ");
		result.append(dayPlus);
		result.append(", ThroughputType: ");
		result.append(throughputType);
		result.append(", MechanizationLevel: ");
		result.append(mechanizationLevel);
		result.append(", SortingLevelAGG: ");
		result.append(sortingLevelAGG);
		result.append(", Volume: ");
		result.append(volume);
		result.append(", PublicationID: ");
		result.append(publicationID);
		result.append(", TimeSeriesID: ");
		result.append(timeSeriesID);
		result.append(", BucketID: ");
		result.append(bucketID);
		result.append(')');
		return result.toString();
	}

} //FPOForecastBucketImpl
