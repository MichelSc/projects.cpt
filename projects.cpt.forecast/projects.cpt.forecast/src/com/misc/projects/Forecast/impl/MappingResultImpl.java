/**
 */
package com.misc.projects.Forecast.impl;

import com.misc.projects.Forecast.FPOForecastBucketsSelection;
import com.misc.projects.Forecast.ForecastMapping;
import com.misc.projects.Forecast.ForecastPackage;
import com.misc.projects.Forecast.MappingResult;
import com.misc.projects.Forecast.SourceBucket;

import java.util.Collection;

import java.util.Date;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mapping Result</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.misc.projects.Forecast.impl.MappingResultImpl#getForecastMapping <em>Forecast Mapping</em>}</li>
 *   <li>{@link com.misc.projects.Forecast.impl.MappingResultImpl#getForecastSelection <em>Forecast Selection</em>}</li>
 *   <li>{@link com.misc.projects.Forecast.impl.MappingResultImpl#getSources <em>Sources</em>}</li>
 *   <li>{@link com.misc.projects.Forecast.impl.MappingResultImpl#getNumberOfBucketsMapped <em>Number Of Buckets Mapped</em>}</li>
 *   <li>{@link com.misc.projects.Forecast.impl.MappingResultImpl#getNumberOfBucketsToMap <em>Number Of Buckets To Map</em>}</li>
 *   <li>{@link com.misc.projects.Forecast.impl.MappingResultImpl#getMapped <em>Mapped</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MappingResultImpl extends MinimalEObjectImpl.Container implements MappingResult {
	/**
	 * The cached value of the '{@link #getForecastMapping() <em>Forecast Mapping</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForecastMapping()
	 * @generated
	 * @ordered
	 */
	protected ForecastMapping forecastMapping;

	/**
	 * The cached value of the '{@link #getForecastSelection() <em>Forecast Selection</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForecastSelection()
	 * @generated
	 * @ordered
	 */
	protected FPOForecastBucketsSelection forecastSelection;

	/**
	 * The cached value of the '{@link #getSources() <em>Sources</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSources()
	 * @generated
	 * @ordered
	 */
	protected EList<SourceBucket> sources;

	/**
	 * The default value of the '{@link #getNumberOfBucketsMapped() <em>Number Of Buckets Mapped</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfBucketsMapped()
	 * @generated
	 * @ordered
	 */
	protected static final int NUMBER_OF_BUCKETS_MAPPED_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNumberOfBucketsMapped() <em>Number Of Buckets Mapped</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfBucketsMapped()
	 * @generated
	 * @ordered
	 */
	protected int numberOfBucketsMapped = NUMBER_OF_BUCKETS_MAPPED_EDEFAULT;

	/**
	 * The default value of the '{@link #getNumberOfBucketsToMap() <em>Number Of Buckets To Map</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfBucketsToMap()
	 * @generated
	 * @ordered
	 */
	protected static final int NUMBER_OF_BUCKETS_TO_MAP_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNumberOfBucketsToMap() <em>Number Of Buckets To Map</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfBucketsToMap()
	 * @generated
	 * @ordered
	 */
	protected int numberOfBucketsToMap = NUMBER_OF_BUCKETS_TO_MAP_EDEFAULT;

	/**
	 * The default value of the '{@link #getMapped() <em>Mapped</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMapped()
	 * @generated
	 * @ordered
	 */
	protected static final Date MAPPED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMapped() <em>Mapped</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMapped()
	 * @generated
	 * @ordered
	 */
	protected Date mapped = MAPPED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MappingResultImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ForecastPackage.Literals.MAPPING_RESULT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ForecastMapping getForecastMapping() {
		if (forecastMapping != null && forecastMapping.eIsProxy()) {
			InternalEObject oldForecastMapping = (InternalEObject)forecastMapping;
			forecastMapping = (ForecastMapping)eResolveProxy(oldForecastMapping);
			if (forecastMapping != oldForecastMapping) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ForecastPackage.MAPPING_RESULT__FORECAST_MAPPING, oldForecastMapping, forecastMapping));
			}
		}
		return forecastMapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ForecastMapping basicGetForecastMapping() {
		return forecastMapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setForecastMapping(ForecastMapping newForecastMapping) {
		ForecastMapping oldForecastMapping = forecastMapping;
		forecastMapping = newForecastMapping;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ForecastPackage.MAPPING_RESULT__FORECAST_MAPPING, oldForecastMapping, forecastMapping));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FPOForecastBucketsSelection getForecastSelection() {
		if (forecastSelection != null && forecastSelection.eIsProxy()) {
			InternalEObject oldForecastSelection = (InternalEObject)forecastSelection;
			forecastSelection = (FPOForecastBucketsSelection)eResolveProxy(oldForecastSelection);
			if (forecastSelection != oldForecastSelection) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ForecastPackage.MAPPING_RESULT__FORECAST_SELECTION, oldForecastSelection, forecastSelection));
			}
		}
		return forecastSelection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FPOForecastBucketsSelection basicGetForecastSelection() {
		return forecastSelection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setForecastSelection(FPOForecastBucketsSelection newForecastSelection) {
		FPOForecastBucketsSelection oldForecastSelection = forecastSelection;
		forecastSelection = newForecastSelection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ForecastPackage.MAPPING_RESULT__FORECAST_SELECTION, oldForecastSelection, forecastSelection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SourceBucket> getSources() {
		if (sources == null) {
			sources = new EObjectContainmentEList<SourceBucket>(SourceBucket.class, this, ForecastPackage.MAPPING_RESULT__SOURCES);
		}
		return sources;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNumberOfBucketsMapped() {
		return numberOfBucketsMapped;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumberOfBucketsMapped(int newNumberOfBucketsMapped) {
		int oldNumberOfBucketsMapped = numberOfBucketsMapped;
		numberOfBucketsMapped = newNumberOfBucketsMapped;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ForecastPackage.MAPPING_RESULT__NUMBER_OF_BUCKETS_MAPPED, oldNumberOfBucketsMapped, numberOfBucketsMapped));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNumberOfBucketsToMap() {
		return numberOfBucketsToMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumberOfBucketsToMap(int newNumberOfBucketsToMap) {
		int oldNumberOfBucketsToMap = numberOfBucketsToMap;
		numberOfBucketsToMap = newNumberOfBucketsToMap;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ForecastPackage.MAPPING_RESULT__NUMBER_OF_BUCKETS_TO_MAP, oldNumberOfBucketsToMap, numberOfBucketsToMap));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getMapped() {
		return mapped;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMapped(Date newMapped) {
		Date oldMapped = mapped;
		mapped = newMapped;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ForecastPackage.MAPPING_RESULT__MAPPED, oldMapped, mapped));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ForecastPackage.MAPPING_RESULT__SOURCES:
				return ((InternalEList<?>)getSources()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ForecastPackage.MAPPING_RESULT__FORECAST_MAPPING:
				if (resolve) return getForecastMapping();
				return basicGetForecastMapping();
			case ForecastPackage.MAPPING_RESULT__FORECAST_SELECTION:
				if (resolve) return getForecastSelection();
				return basicGetForecastSelection();
			case ForecastPackage.MAPPING_RESULT__SOURCES:
				return getSources();
			case ForecastPackage.MAPPING_RESULT__NUMBER_OF_BUCKETS_MAPPED:
				return getNumberOfBucketsMapped();
			case ForecastPackage.MAPPING_RESULT__NUMBER_OF_BUCKETS_TO_MAP:
				return getNumberOfBucketsToMap();
			case ForecastPackage.MAPPING_RESULT__MAPPED:
				return getMapped();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ForecastPackage.MAPPING_RESULT__FORECAST_MAPPING:
				setForecastMapping((ForecastMapping)newValue);
				return;
			case ForecastPackage.MAPPING_RESULT__FORECAST_SELECTION:
				setForecastSelection((FPOForecastBucketsSelection)newValue);
				return;
			case ForecastPackage.MAPPING_RESULT__SOURCES:
				getSources().clear();
				getSources().addAll((Collection<? extends SourceBucket>)newValue);
				return;
			case ForecastPackage.MAPPING_RESULT__NUMBER_OF_BUCKETS_MAPPED:
				setNumberOfBucketsMapped((Integer)newValue);
				return;
			case ForecastPackage.MAPPING_RESULT__NUMBER_OF_BUCKETS_TO_MAP:
				setNumberOfBucketsToMap((Integer)newValue);
				return;
			case ForecastPackage.MAPPING_RESULT__MAPPED:
				setMapped((Date)newValue);
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
			case ForecastPackage.MAPPING_RESULT__FORECAST_MAPPING:
				setForecastMapping((ForecastMapping)null);
				return;
			case ForecastPackage.MAPPING_RESULT__FORECAST_SELECTION:
				setForecastSelection((FPOForecastBucketsSelection)null);
				return;
			case ForecastPackage.MAPPING_RESULT__SOURCES:
				getSources().clear();
				return;
			case ForecastPackage.MAPPING_RESULT__NUMBER_OF_BUCKETS_MAPPED:
				setNumberOfBucketsMapped(NUMBER_OF_BUCKETS_MAPPED_EDEFAULT);
				return;
			case ForecastPackage.MAPPING_RESULT__NUMBER_OF_BUCKETS_TO_MAP:
				setNumberOfBucketsToMap(NUMBER_OF_BUCKETS_TO_MAP_EDEFAULT);
				return;
			case ForecastPackage.MAPPING_RESULT__MAPPED:
				setMapped(MAPPED_EDEFAULT);
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
			case ForecastPackage.MAPPING_RESULT__FORECAST_MAPPING:
				return forecastMapping != null;
			case ForecastPackage.MAPPING_RESULT__FORECAST_SELECTION:
				return forecastSelection != null;
			case ForecastPackage.MAPPING_RESULT__SOURCES:
				return sources != null && !sources.isEmpty();
			case ForecastPackage.MAPPING_RESULT__NUMBER_OF_BUCKETS_MAPPED:
				return numberOfBucketsMapped != NUMBER_OF_BUCKETS_MAPPED_EDEFAULT;
			case ForecastPackage.MAPPING_RESULT__NUMBER_OF_BUCKETS_TO_MAP:
				return numberOfBucketsToMap != NUMBER_OF_BUCKETS_TO_MAP_EDEFAULT;
			case ForecastPackage.MAPPING_RESULT__MAPPED:
				return MAPPED_EDEFAULT == null ? mapped != null : !MAPPED_EDEFAULT.equals(mapped);
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
		result.append(" (NumberOfBucketsMapped: ");
		result.append(numberOfBucketsMapped);
		result.append(", NumberOfBucketsToMap: ");
		result.append(numberOfBucketsToMap);
		result.append(", Mapped: ");
		result.append(mapped);
		result.append(')');
		return result.toString();
	}

} //MappingResultImpl
