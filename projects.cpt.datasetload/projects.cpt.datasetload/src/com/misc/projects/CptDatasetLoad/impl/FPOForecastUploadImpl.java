/**
 */
package com.misc.projects.CptDatasetLoad.impl;

import com.misc.common.moplaf.dbsynch.impl.TableRowImpl;
import com.misc.projects.CptDatasetLoad.CptDatasetLoadPackage;
import com.misc.projects.CptDatasetLoad.FPOForecastBuckets;
import com.misc.projects.CptDatasetLoad.FPOForecastUpload;
import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>FPO Forecast Upload</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.projects.CptDatasetLoad.impl.FPOForecastUploadImpl#getFromDate <em>From Date</em>}</li>
 *   <li>{@link com.misc.projects.CptDatasetLoad.impl.FPOForecastUploadImpl#getToDate <em>To Date</em>}</li>
 *   <li>{@link com.misc.projects.CptDatasetLoad.impl.FPOForecastUploadImpl#getKind <em>Kind</em>}</li>
 *   <li>{@link com.misc.projects.CptDatasetLoad.impl.FPOForecastUploadImpl#getForecastTable <em>Forecast Table</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FPOForecastUploadImpl extends TableRowImpl implements FPOForecastUpload {
	/**
	 * The default value of the '{@link #getFromDate() <em>From Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date FROM_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFromDate() <em>From Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromDate()
	 * @generated
	 * @ordered
	 */
	protected Date fromDate = FROM_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getToDate() <em>To Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date TO_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getToDate() <em>To Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToDate()
	 * @generated
	 * @ordered
	 */
	protected Date toDate = TO_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected static final String KIND_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected String kind = KIND_EDEFAULT;

	/**
	 * The cached value of the '{@link #getForecastTable() <em>Forecast Table</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForecastTable()
	 * @generated
	 * @ordered
	 */
	protected FPOForecastBuckets forecastTable;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FPOForecastUploadImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CptDatasetLoadPackage.Literals.FPO_FORECAST_UPLOAD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getFromDate() {
		return fromDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFromDate(Date newFromDate) {
		Date oldFromDate = fromDate;
		fromDate = newFromDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CptDatasetLoadPackage.FPO_FORECAST_UPLOAD__FROM_DATE, oldFromDate, fromDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getToDate() {
		return toDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setToDate(Date newToDate) {
		Date oldToDate = toDate;
		toDate = newToDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CptDatasetLoadPackage.FPO_FORECAST_UPLOAD__TO_DATE, oldToDate, toDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getKind() {
		return kind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKind(String newKind) {
		String oldKind = kind;
		kind = newKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CptDatasetLoadPackage.FPO_FORECAST_UPLOAD__KIND, oldKind, kind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FPOForecastBuckets getForecastTable() {
		return forecastTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetForecastTable(FPOForecastBuckets newForecastTable, NotificationChain msgs) {
		FPOForecastBuckets oldForecastTable = forecastTable;
		forecastTable = newForecastTable;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CptDatasetLoadPackage.FPO_FORECAST_UPLOAD__FORECAST_TABLE, oldForecastTable, newForecastTable);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setForecastTable(FPOForecastBuckets newForecastTable) {
		if (newForecastTable != forecastTable) {
			NotificationChain msgs = null;
			if (forecastTable != null)
				msgs = ((InternalEObject)forecastTable).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CptDatasetLoadPackage.FPO_FORECAST_UPLOAD__FORECAST_TABLE, null, msgs);
			if (newForecastTable != null)
				msgs = ((InternalEObject)newForecastTable).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CptDatasetLoadPackage.FPO_FORECAST_UPLOAD__FORECAST_TABLE, null, msgs);
			msgs = basicSetForecastTable(newForecastTable, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CptDatasetLoadPackage.FPO_FORECAST_UPLOAD__FORECAST_TABLE, newForecastTable, newForecastTable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CptDatasetLoadPackage.FPO_FORECAST_UPLOAD__FORECAST_TABLE:
				return basicSetForecastTable(null, msgs);
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
			case CptDatasetLoadPackage.FPO_FORECAST_UPLOAD__FROM_DATE:
				return getFromDate();
			case CptDatasetLoadPackage.FPO_FORECAST_UPLOAD__TO_DATE:
				return getToDate();
			case CptDatasetLoadPackage.FPO_FORECAST_UPLOAD__KIND:
				return getKind();
			case CptDatasetLoadPackage.FPO_FORECAST_UPLOAD__FORECAST_TABLE:
				return getForecastTable();
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
			case CptDatasetLoadPackage.FPO_FORECAST_UPLOAD__FROM_DATE:
				setFromDate((Date)newValue);
				return;
			case CptDatasetLoadPackage.FPO_FORECAST_UPLOAD__TO_DATE:
				setToDate((Date)newValue);
				return;
			case CptDatasetLoadPackage.FPO_FORECAST_UPLOAD__KIND:
				setKind((String)newValue);
				return;
			case CptDatasetLoadPackage.FPO_FORECAST_UPLOAD__FORECAST_TABLE:
				setForecastTable((FPOForecastBuckets)newValue);
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
			case CptDatasetLoadPackage.FPO_FORECAST_UPLOAD__FROM_DATE:
				setFromDate(FROM_DATE_EDEFAULT);
				return;
			case CptDatasetLoadPackage.FPO_FORECAST_UPLOAD__TO_DATE:
				setToDate(TO_DATE_EDEFAULT);
				return;
			case CptDatasetLoadPackage.FPO_FORECAST_UPLOAD__KIND:
				setKind(KIND_EDEFAULT);
				return;
			case CptDatasetLoadPackage.FPO_FORECAST_UPLOAD__FORECAST_TABLE:
				setForecastTable((FPOForecastBuckets)null);
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
			case CptDatasetLoadPackage.FPO_FORECAST_UPLOAD__FROM_DATE:
				return FROM_DATE_EDEFAULT == null ? fromDate != null : !FROM_DATE_EDEFAULT.equals(fromDate);
			case CptDatasetLoadPackage.FPO_FORECAST_UPLOAD__TO_DATE:
				return TO_DATE_EDEFAULT == null ? toDate != null : !TO_DATE_EDEFAULT.equals(toDate);
			case CptDatasetLoadPackage.FPO_FORECAST_UPLOAD__KIND:
				return KIND_EDEFAULT == null ? kind != null : !KIND_EDEFAULT.equals(kind);
			case CptDatasetLoadPackage.FPO_FORECAST_UPLOAD__FORECAST_TABLE:
				return forecastTable != null;
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
		result.append(" (FromDate: ");
		result.append(fromDate);
		result.append(", ToDate: ");
		result.append(toDate);
		result.append(", Kind: ");
		result.append(kind);
		result.append(')');
		return result.toString();
	}

} //FPOForecastUploadImpl
