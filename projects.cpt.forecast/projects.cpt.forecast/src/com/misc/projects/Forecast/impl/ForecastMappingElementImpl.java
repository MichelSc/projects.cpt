/**
 */
package com.misc.projects.Forecast.impl;

import com.misc.projects.Forecast.ForecastMappingElement;
import com.misc.projects.Forecast.ForecastPackage;

import java.math.BigDecimal;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mapping Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.misc.projects.Forecast.impl.ForecastMappingElementImpl#getFromCustomer <em>From Customer</em>}</li>
 *   <li>{@link com.misc.projects.Forecast.impl.ForecastMappingElementImpl#getFromFirstSortingImc <em>From First Sorting Imc</em>}</li>
 *   <li>{@link com.misc.projects.Forecast.impl.ForecastMappingElementImpl#getFromIntakeLocation <em>From Intake Location</em>}</li>
 *   <li>{@link com.misc.projects.Forecast.impl.ForecastMappingElementImpl#getFromSortingLevelAGG <em>From Sorting Level AGG</em>}</li>
 *   <li>{@link com.misc.projects.Forecast.impl.ForecastMappingElementImpl#getToSortingImc <em>To Sorting Imc</em>}</li>
 *   <li>{@link com.misc.projects.Forecast.impl.ForecastMappingElementImpl#getToSortingLevelAVCS <em>To Sorting Level AVCS</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ForecastMappingElementImpl extends MinimalEObjectImpl.Container implements ForecastMappingElement {
	/**
	 * The default value of the '{@link #getFromCustomer() <em>From Customer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromCustomer()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal FROM_CUSTOMER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFromCustomer() <em>From Customer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromCustomer()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal fromCustomer = FROM_CUSTOMER_EDEFAULT;

	/**
	 * The default value of the '{@link #getFromFirstSortingImc() <em>From First Sorting Imc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromFirstSortingImc()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal FROM_FIRST_SORTING_IMC_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFromFirstSortingImc() <em>From First Sorting Imc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromFirstSortingImc()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal fromFirstSortingImc = FROM_FIRST_SORTING_IMC_EDEFAULT;

	/**
	 * The default value of the '{@link #getFromIntakeLocation() <em>From Intake Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromIntakeLocation()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal FROM_INTAKE_LOCATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFromIntakeLocation() <em>From Intake Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromIntakeLocation()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal fromIntakeLocation = FROM_INTAKE_LOCATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getFromSortingLevelAGG() <em>From Sorting Level AGG</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromSortingLevelAGG()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal FROM_SORTING_LEVEL_AGG_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFromSortingLevelAGG() <em>From Sorting Level AGG</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromSortingLevelAGG()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal fromSortingLevelAGG = FROM_SORTING_LEVEL_AGG_EDEFAULT;

	/**
	 * The default value of the '{@link #getToSortingImc() <em>To Sorting Imc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToSortingImc()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal TO_SORTING_IMC_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getToSortingImc() <em>To Sorting Imc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToSortingImc()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal toSortingImc = TO_SORTING_IMC_EDEFAULT;

	/**
	 * The default value of the '{@link #getToSortingLevelAVCS() <em>To Sorting Level AVCS</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToSortingLevelAVCS()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal TO_SORTING_LEVEL_AVCS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getToSortingLevelAVCS() <em>To Sorting Level AVCS</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToSortingLevelAVCS()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal toSortingLevelAVCS = TO_SORTING_LEVEL_AVCS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ForecastMappingElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ForecastPackage.Literals.FORECAST_MAPPING_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal getFromCustomer() {
		return fromCustomer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFromCustomer(BigDecimal newFromCustomer) {
		BigDecimal oldFromCustomer = fromCustomer;
		fromCustomer = newFromCustomer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ForecastPackage.FORECAST_MAPPING_ELEMENT__FROM_CUSTOMER, oldFromCustomer, fromCustomer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal getFromFirstSortingImc() {
		return fromFirstSortingImc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFromFirstSortingImc(BigDecimal newFromFirstSortingImc) {
		BigDecimal oldFromFirstSortingImc = fromFirstSortingImc;
		fromFirstSortingImc = newFromFirstSortingImc;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ForecastPackage.FORECAST_MAPPING_ELEMENT__FROM_FIRST_SORTING_IMC, oldFromFirstSortingImc, fromFirstSortingImc));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal getFromIntakeLocation() {
		return fromIntakeLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFromIntakeLocation(BigDecimal newFromIntakeLocation) {
		BigDecimal oldFromIntakeLocation = fromIntakeLocation;
		fromIntakeLocation = newFromIntakeLocation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ForecastPackage.FORECAST_MAPPING_ELEMENT__FROM_INTAKE_LOCATION, oldFromIntakeLocation, fromIntakeLocation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal getFromSortingLevelAGG() {
		return fromSortingLevelAGG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFromSortingLevelAGG(BigDecimal newFromSortingLevelAGG) {
		BigDecimal oldFromSortingLevelAGG = fromSortingLevelAGG;
		fromSortingLevelAGG = newFromSortingLevelAGG;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ForecastPackage.FORECAST_MAPPING_ELEMENT__FROM_SORTING_LEVEL_AGG, oldFromSortingLevelAGG, fromSortingLevelAGG));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal getToSortingImc() {
		return toSortingImc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setToSortingImc(BigDecimal newToSortingImc) {
		BigDecimal oldToSortingImc = toSortingImc;
		toSortingImc = newToSortingImc;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ForecastPackage.FORECAST_MAPPING_ELEMENT__TO_SORTING_IMC, oldToSortingImc, toSortingImc));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal getToSortingLevelAVCS() {
		return toSortingLevelAVCS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setToSortingLevelAVCS(BigDecimal newToSortingLevelAVCS) {
		BigDecimal oldToSortingLevelAVCS = toSortingLevelAVCS;
		toSortingLevelAVCS = newToSortingLevelAVCS;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ForecastPackage.FORECAST_MAPPING_ELEMENT__TO_SORTING_LEVEL_AVCS, oldToSortingLevelAVCS, toSortingLevelAVCS));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ForecastPackage.FORECAST_MAPPING_ELEMENT__FROM_CUSTOMER:
				return getFromCustomer();
			case ForecastPackage.FORECAST_MAPPING_ELEMENT__FROM_FIRST_SORTING_IMC:
				return getFromFirstSortingImc();
			case ForecastPackage.FORECAST_MAPPING_ELEMENT__FROM_INTAKE_LOCATION:
				return getFromIntakeLocation();
			case ForecastPackage.FORECAST_MAPPING_ELEMENT__FROM_SORTING_LEVEL_AGG:
				return getFromSortingLevelAGG();
			case ForecastPackage.FORECAST_MAPPING_ELEMENT__TO_SORTING_IMC:
				return getToSortingImc();
			case ForecastPackage.FORECAST_MAPPING_ELEMENT__TO_SORTING_LEVEL_AVCS:
				return getToSortingLevelAVCS();
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
			case ForecastPackage.FORECAST_MAPPING_ELEMENT__FROM_CUSTOMER:
				setFromCustomer((BigDecimal)newValue);
				return;
			case ForecastPackage.FORECAST_MAPPING_ELEMENT__FROM_FIRST_SORTING_IMC:
				setFromFirstSortingImc((BigDecimal)newValue);
				return;
			case ForecastPackage.FORECAST_MAPPING_ELEMENT__FROM_INTAKE_LOCATION:
				setFromIntakeLocation((BigDecimal)newValue);
				return;
			case ForecastPackage.FORECAST_MAPPING_ELEMENT__FROM_SORTING_LEVEL_AGG:
				setFromSortingLevelAGG((BigDecimal)newValue);
				return;
			case ForecastPackage.FORECAST_MAPPING_ELEMENT__TO_SORTING_IMC:
				setToSortingImc((BigDecimal)newValue);
				return;
			case ForecastPackage.FORECAST_MAPPING_ELEMENT__TO_SORTING_LEVEL_AVCS:
				setToSortingLevelAVCS((BigDecimal)newValue);
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
			case ForecastPackage.FORECAST_MAPPING_ELEMENT__FROM_CUSTOMER:
				setFromCustomer(FROM_CUSTOMER_EDEFAULT);
				return;
			case ForecastPackage.FORECAST_MAPPING_ELEMENT__FROM_FIRST_SORTING_IMC:
				setFromFirstSortingImc(FROM_FIRST_SORTING_IMC_EDEFAULT);
				return;
			case ForecastPackage.FORECAST_MAPPING_ELEMENT__FROM_INTAKE_LOCATION:
				setFromIntakeLocation(FROM_INTAKE_LOCATION_EDEFAULT);
				return;
			case ForecastPackage.FORECAST_MAPPING_ELEMENT__FROM_SORTING_LEVEL_AGG:
				setFromSortingLevelAGG(FROM_SORTING_LEVEL_AGG_EDEFAULT);
				return;
			case ForecastPackage.FORECAST_MAPPING_ELEMENT__TO_SORTING_IMC:
				setToSortingImc(TO_SORTING_IMC_EDEFAULT);
				return;
			case ForecastPackage.FORECAST_MAPPING_ELEMENT__TO_SORTING_LEVEL_AVCS:
				setToSortingLevelAVCS(TO_SORTING_LEVEL_AVCS_EDEFAULT);
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
			case ForecastPackage.FORECAST_MAPPING_ELEMENT__FROM_CUSTOMER:
				return FROM_CUSTOMER_EDEFAULT == null ? fromCustomer != null : !FROM_CUSTOMER_EDEFAULT.equals(fromCustomer);
			case ForecastPackage.FORECAST_MAPPING_ELEMENT__FROM_FIRST_SORTING_IMC:
				return FROM_FIRST_SORTING_IMC_EDEFAULT == null ? fromFirstSortingImc != null : !FROM_FIRST_SORTING_IMC_EDEFAULT.equals(fromFirstSortingImc);
			case ForecastPackage.FORECAST_MAPPING_ELEMENT__FROM_INTAKE_LOCATION:
				return FROM_INTAKE_LOCATION_EDEFAULT == null ? fromIntakeLocation != null : !FROM_INTAKE_LOCATION_EDEFAULT.equals(fromIntakeLocation);
			case ForecastPackage.FORECAST_MAPPING_ELEMENT__FROM_SORTING_LEVEL_AGG:
				return FROM_SORTING_LEVEL_AGG_EDEFAULT == null ? fromSortingLevelAGG != null : !FROM_SORTING_LEVEL_AGG_EDEFAULT.equals(fromSortingLevelAGG);
			case ForecastPackage.FORECAST_MAPPING_ELEMENT__TO_SORTING_IMC:
				return TO_SORTING_IMC_EDEFAULT == null ? toSortingImc != null : !TO_SORTING_IMC_EDEFAULT.equals(toSortingImc);
			case ForecastPackage.FORECAST_MAPPING_ELEMENT__TO_SORTING_LEVEL_AVCS:
				return TO_SORTING_LEVEL_AVCS_EDEFAULT == null ? toSortingLevelAVCS != null : !TO_SORTING_LEVEL_AVCS_EDEFAULT.equals(toSortingLevelAVCS);
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
		result.append(" (FromCustomer: ");
		result.append(fromCustomer);
		result.append(", FromFirstSortingImc: ");
		result.append(fromFirstSortingImc);
		result.append(", FromIntakeLocation: ");
		result.append(fromIntakeLocation);
		result.append(", FromSortingLevelAGG: ");
		result.append(fromSortingLevelAGG);
		result.append(", ToSortingImc: ");
		result.append(toSortingImc);
		result.append(", ToSortingLevelAVCS: ");
		result.append(toSortingLevelAVCS);
		result.append(')');
		return result.toString();
	}

} //ForecastMappingElementImpl
