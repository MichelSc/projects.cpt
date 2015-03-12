/**
 */
package com.misc.projects.CptDatasetLoad.impl;

import com.misc.common.moplaf.DatasetLoadOra.impl.DatasetLoadJdbcOraThinImpl;

import com.misc.projects.CptDatasetLoad.CptDatasetLoadPackage;
import com.misc.projects.CptDatasetLoad.FPO;

import com.misc.projects.CptDatasetLoad.FPOForecastUpload;
import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>FPO</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.misc.projects.CptDatasetLoad.impl.FPOImpl#getForecastUploads <em>Forecast Uploads</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FPOImpl extends DatasetLoadJdbcOraThinImpl implements FPO {
	/**
	 * The cached value of the '{@link #getForecastUploads() <em>Forecast Uploads</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForecastUploads()
	 * @generated
	 * @ordered
	 */
	protected EList<FPOForecastUpload> forecastUploads;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FPOImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CptDatasetLoadPackage.Literals.FPO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FPOForecastUpload> getForecastUploads() {
		if (forecastUploads == null) {
			forecastUploads = new EObjectContainmentEList<FPOForecastUpload>(FPOForecastUpload.class, this, CptDatasetLoadPackage.FPO__FORECAST_UPLOADS);
		}
		return forecastUploads;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CptDatasetLoadPackage.FPO__FORECAST_UPLOADS:
				return ((InternalEList<?>)getForecastUploads()).basicRemove(otherEnd, msgs);
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
			case CptDatasetLoadPackage.FPO__FORECAST_UPLOADS:
				return getForecastUploads();
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
			case CptDatasetLoadPackage.FPO__FORECAST_UPLOADS:
				getForecastUploads().clear();
				getForecastUploads().addAll((Collection<? extends FPOForecastUpload>)newValue);
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
			case CptDatasetLoadPackage.FPO__FORECAST_UPLOADS:
				getForecastUploads().clear();
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
			case CptDatasetLoadPackage.FPO__FORECAST_UPLOADS:
				return forecastUploads != null && !forecastUploads.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //FPOImpl
