/**
 */
package com.misc.projects.Forecast.impl;

import com.misc.projects.Forecast.ForecastPackage;
import com.misc.projects.Forecast.SourceBucket;

import java.math.BigDecimal;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Source Bucket</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.misc.projects.Forecast.impl.SourceBucketImpl#getBucketBeginTime <em>Bucket Begin Time</em>}</li>
 *   <li>{@link com.misc.projects.Forecast.impl.SourceBucketImpl#getBucketEndTime <em>Bucket End Time</em>}</li>
 *   <li>{@link com.misc.projects.Forecast.impl.SourceBucketImpl#getVolume <em>Volume</em>}</li>
 *   <li>{@link com.misc.projects.Forecast.impl.SourceBucketImpl#getThroughputType <em>Throughput Type</em>}</li>
 *   <li>{@link com.misc.projects.Forecast.impl.SourceBucketImpl#getSortingLevelAVCS <em>Sorting Level AVCS</em>}</li>
 *   <li>{@link com.misc.projects.Forecast.impl.SourceBucketImpl#getMechanizationLevel <em>Mechanization Level</em>}</li>
 *   <li>{@link com.misc.projects.Forecast.impl.SourceBucketImpl#getSortingImc <em>Sorting Imc</em>}</li>
 *   <li>{@link com.misc.projects.Forecast.impl.SourceBucketImpl#getDeliveryDate <em>Delivery Date</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SourceBucketImpl extends MinimalEObjectImpl.Container implements SourceBucket {
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
	 * The default value of the '{@link #getSortingLevelAVCS() <em>Sorting Level AVCS</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSortingLevelAVCS()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal SORTING_LEVEL_AVCS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSortingLevelAVCS() <em>Sorting Level AVCS</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSortingLevelAVCS()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal sortingLevelAVCS = SORTING_LEVEL_AVCS_EDEFAULT;

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
	 * The default value of the '{@link #getSortingImc() <em>Sorting Imc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSortingImc()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal SORTING_IMC_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSortingImc() <em>Sorting Imc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSortingImc()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal sortingImc = SORTING_IMC_EDEFAULT;

	/**
	 * The default value of the '{@link #getDeliveryDate() <em>Delivery Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeliveryDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date DELIVERY_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDeliveryDate() <em>Delivery Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeliveryDate()
	 * @generated
	 * @ordered
	 */
	protected Date deliveryDate = DELIVERY_DATE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SourceBucketImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ForecastPackage.Literals.SOURCE_BUCKET;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ForecastPackage.SOURCE_BUCKET__BUCKET_BEGIN_TIME, oldBucketBeginTime, bucketBeginTime));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ForecastPackage.SOURCE_BUCKET__BUCKET_END_TIME, oldBucketEndTime, bucketEndTime));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ForecastPackage.SOURCE_BUCKET__VOLUME, oldVolume, volume));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ForecastPackage.SOURCE_BUCKET__THROUGHPUT_TYPE, oldThroughputType, throughputType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal getSortingLevelAVCS() {
		return sortingLevelAVCS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSortingLevelAVCS(BigDecimal newSortingLevelAVCS) {
		BigDecimal oldSortingLevelAVCS = sortingLevelAVCS;
		sortingLevelAVCS = newSortingLevelAVCS;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ForecastPackage.SOURCE_BUCKET__SORTING_LEVEL_AVCS, oldSortingLevelAVCS, sortingLevelAVCS));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ForecastPackage.SOURCE_BUCKET__MECHANIZATION_LEVEL, oldMechanizationLevel, mechanizationLevel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal getSortingImc() {
		return sortingImc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSortingImc(BigDecimal newSortingImc) {
		BigDecimal oldSortingImc = sortingImc;
		sortingImc = newSortingImc;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ForecastPackage.SOURCE_BUCKET__SORTING_IMC, oldSortingImc, sortingImc));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getDeliveryDate() {
		return deliveryDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeliveryDate(Date newDeliveryDate) {
		Date oldDeliveryDate = deliveryDate;
		deliveryDate = newDeliveryDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ForecastPackage.SOURCE_BUCKET__DELIVERY_DATE, oldDeliveryDate, deliveryDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ForecastPackage.SOURCE_BUCKET__BUCKET_BEGIN_TIME:
				return getBucketBeginTime();
			case ForecastPackage.SOURCE_BUCKET__BUCKET_END_TIME:
				return getBucketEndTime();
			case ForecastPackage.SOURCE_BUCKET__VOLUME:
				return getVolume();
			case ForecastPackage.SOURCE_BUCKET__THROUGHPUT_TYPE:
				return getThroughputType();
			case ForecastPackage.SOURCE_BUCKET__SORTING_LEVEL_AVCS:
				return getSortingLevelAVCS();
			case ForecastPackage.SOURCE_BUCKET__MECHANIZATION_LEVEL:
				return getMechanizationLevel();
			case ForecastPackage.SOURCE_BUCKET__SORTING_IMC:
				return getSortingImc();
			case ForecastPackage.SOURCE_BUCKET__DELIVERY_DATE:
				return getDeliveryDate();
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
			case ForecastPackage.SOURCE_BUCKET__BUCKET_BEGIN_TIME:
				setBucketBeginTime((Date)newValue);
				return;
			case ForecastPackage.SOURCE_BUCKET__BUCKET_END_TIME:
				setBucketEndTime((Date)newValue);
				return;
			case ForecastPackage.SOURCE_BUCKET__VOLUME:
				setVolume((BigDecimal)newValue);
				return;
			case ForecastPackage.SOURCE_BUCKET__THROUGHPUT_TYPE:
				setThroughputType((BigDecimal)newValue);
				return;
			case ForecastPackage.SOURCE_BUCKET__SORTING_LEVEL_AVCS:
				setSortingLevelAVCS((BigDecimal)newValue);
				return;
			case ForecastPackage.SOURCE_BUCKET__MECHANIZATION_LEVEL:
				setMechanizationLevel((BigDecimal)newValue);
				return;
			case ForecastPackage.SOURCE_BUCKET__SORTING_IMC:
				setSortingImc((BigDecimal)newValue);
				return;
			case ForecastPackage.SOURCE_BUCKET__DELIVERY_DATE:
				setDeliveryDate((Date)newValue);
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
			case ForecastPackage.SOURCE_BUCKET__BUCKET_BEGIN_TIME:
				setBucketBeginTime(BUCKET_BEGIN_TIME_EDEFAULT);
				return;
			case ForecastPackage.SOURCE_BUCKET__BUCKET_END_TIME:
				setBucketEndTime(BUCKET_END_TIME_EDEFAULT);
				return;
			case ForecastPackage.SOURCE_BUCKET__VOLUME:
				setVolume(VOLUME_EDEFAULT);
				return;
			case ForecastPackage.SOURCE_BUCKET__THROUGHPUT_TYPE:
				setThroughputType(THROUGHPUT_TYPE_EDEFAULT);
				return;
			case ForecastPackage.SOURCE_BUCKET__SORTING_LEVEL_AVCS:
				setSortingLevelAVCS(SORTING_LEVEL_AVCS_EDEFAULT);
				return;
			case ForecastPackage.SOURCE_BUCKET__MECHANIZATION_LEVEL:
				setMechanizationLevel(MECHANIZATION_LEVEL_EDEFAULT);
				return;
			case ForecastPackage.SOURCE_BUCKET__SORTING_IMC:
				setSortingImc(SORTING_IMC_EDEFAULT);
				return;
			case ForecastPackage.SOURCE_BUCKET__DELIVERY_DATE:
				setDeliveryDate(DELIVERY_DATE_EDEFAULT);
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
			case ForecastPackage.SOURCE_BUCKET__BUCKET_BEGIN_TIME:
				return BUCKET_BEGIN_TIME_EDEFAULT == null ? bucketBeginTime != null : !BUCKET_BEGIN_TIME_EDEFAULT.equals(bucketBeginTime);
			case ForecastPackage.SOURCE_BUCKET__BUCKET_END_TIME:
				return BUCKET_END_TIME_EDEFAULT == null ? bucketEndTime != null : !BUCKET_END_TIME_EDEFAULT.equals(bucketEndTime);
			case ForecastPackage.SOURCE_BUCKET__VOLUME:
				return VOLUME_EDEFAULT == null ? volume != null : !VOLUME_EDEFAULT.equals(volume);
			case ForecastPackage.SOURCE_BUCKET__THROUGHPUT_TYPE:
				return THROUGHPUT_TYPE_EDEFAULT == null ? throughputType != null : !THROUGHPUT_TYPE_EDEFAULT.equals(throughputType);
			case ForecastPackage.SOURCE_BUCKET__SORTING_LEVEL_AVCS:
				return SORTING_LEVEL_AVCS_EDEFAULT == null ? sortingLevelAVCS != null : !SORTING_LEVEL_AVCS_EDEFAULT.equals(sortingLevelAVCS);
			case ForecastPackage.SOURCE_BUCKET__MECHANIZATION_LEVEL:
				return MECHANIZATION_LEVEL_EDEFAULT == null ? mechanizationLevel != null : !MECHANIZATION_LEVEL_EDEFAULT.equals(mechanizationLevel);
			case ForecastPackage.SOURCE_BUCKET__SORTING_IMC:
				return SORTING_IMC_EDEFAULT == null ? sortingImc != null : !SORTING_IMC_EDEFAULT.equals(sortingImc);
			case ForecastPackage.SOURCE_BUCKET__DELIVERY_DATE:
				return DELIVERY_DATE_EDEFAULT == null ? deliveryDate != null : !DELIVERY_DATE_EDEFAULT.equals(deliveryDate);
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
		result.append(" (BucketBeginTime: ");
		result.append(bucketBeginTime);
		result.append(", BucketEndTime: ");
		result.append(bucketEndTime);
		result.append(", Volume: ");
		result.append(volume);
		result.append(", ThroughputType: ");
		result.append(throughputType);
		result.append(", SortingLevelAVCS: ");
		result.append(sortingLevelAVCS);
		result.append(", MechanizationLevel: ");
		result.append(mechanizationLevel);
		result.append(", SortingImc: ");
		result.append(sortingImc);
		result.append(", DeliveryDate: ");
		result.append(deliveryDate);
		result.append(')');
		return result.toString();
	}

} //SourceBucketImpl
