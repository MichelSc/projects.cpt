/**
 */
package com.misc.projects.Forecast.impl;

import com.misc.projects.CptDatasetLoad.FPOForecastBucket;
import com.misc.projects.CptDatasetLoad.FPOForecastUpload;
import com.misc.projects.Forecast.FPOForecastBucketsSelection;
import com.misc.projects.Forecast.ForecastPackage;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>FPO Forecast Buckets Selection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.misc.projects.Forecast.impl.FPOForecastBucketsSelectionImpl#getUpload <em>Upload</em>}</li>
 *   <li>{@link com.misc.projects.Forecast.impl.FPOForecastBucketsSelectionImpl#getSelectedBuckets <em>Selected Buckets</em>}</li>
 *   <li>{@link com.misc.projects.Forecast.impl.FPOForecastBucketsSelectionImpl#getSelectBucketDates <em>Select Bucket Dates</em>}</li>
 *   <li>{@link com.misc.projects.Forecast.impl.FPOForecastBucketsSelectionImpl#getSelectThroughputTypes <em>Select Throughput Types</em>}</li>
 *   <li>{@link com.misc.projects.Forecast.impl.FPOForecastBucketsSelectionImpl#getSelectMechanizationLevel <em>Select Mechanization Level</em>}</li>
 *   <li>{@link com.misc.projects.Forecast.impl.FPOForecastBucketsSelectionImpl#getSelectSortingLevelAGGs <em>Select Sorting Level AG Gs</em>}</li>
 *   <li>{@link com.misc.projects.Forecast.impl.FPOForecastBucketsSelectionImpl#getSelectFirstSortingIMCs <em>Select First Sorting IM Cs</em>}</li>
 *   <li>{@link com.misc.projects.Forecast.impl.FPOForecastBucketsSelectionImpl#getSelectionSize <em>Selection Size</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FPOForecastBucketsSelectionImpl extends MinimalEObjectImpl.Container implements FPOForecastBucketsSelection {
	/**
	 * The cached value of the '{@link #getUpload() <em>Upload</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpload()
	 * @generated
	 * @ordered
	 */
	protected FPOForecastUpload upload;

	/**
	 * The cached value of the '{@link #getSelectedBuckets() <em>Selected Buckets</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelectedBuckets()
	 * @generated
	 * @ordered
	 */
	protected EList<FPOForecastBucket> selectedBuckets;

	/**
	 * The cached value of the '{@link #getSelectBucketDates() <em>Select Bucket Dates</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelectBucketDates()
	 * @generated
	 * @ordered
	 */
	protected EList<Date> selectBucketDates;

	/**
	 * The cached value of the '{@link #getSelectThroughputTypes() <em>Select Throughput Types</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelectThroughputTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<BigDecimal> selectThroughputTypes;

	/**
	 * The cached value of the '{@link #getSelectMechanizationLevel() <em>Select Mechanization Level</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelectMechanizationLevel()
	 * @generated
	 * @ordered
	 */
	protected EList<BigDecimal> selectMechanizationLevel;

	/**
	 * The cached value of the '{@link #getSelectSortingLevelAGGs() <em>Select Sorting Level AG Gs</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelectSortingLevelAGGs()
	 * @generated
	 * @ordered
	 */
	protected EList<BigDecimal> selectSortingLevelAGGs;

	/**
	 * The cached value of the '{@link #getSelectFirstSortingIMCs() <em>Select First Sorting IM Cs</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelectFirstSortingIMCs()
	 * @generated
	 * @ordered
	 */
	protected EList<BigDecimal> selectFirstSortingIMCs;

	/**
	 * The default value of the '{@link #getSelectionSize() <em>Selection Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelectionSize()
	 * @generated
	 * @ordered
	 */
	protected static final int SELECTION_SIZE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSelectionSize() <em>Selection Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelectionSize()
	 * @generated
	 * @ordered
	 */
	protected int selectionSize = SELECTION_SIZE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FPOForecastBucketsSelectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ForecastPackage.Literals.FPO_FORECAST_BUCKETS_SELECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FPOForecastUpload getUpload() {
		if (upload != null && upload.eIsProxy()) {
			InternalEObject oldUpload = (InternalEObject)upload;
			upload = (FPOForecastUpload)eResolveProxy(oldUpload);
			if (upload != oldUpload) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ForecastPackage.FPO_FORECAST_BUCKETS_SELECTION__UPLOAD, oldUpload, upload));
			}
		}
		return upload;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FPOForecastUpload basicGetUpload() {
		return upload;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUpload(FPOForecastUpload newUpload) {
		FPOForecastUpload oldUpload = upload;
		upload = newUpload;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ForecastPackage.FPO_FORECAST_BUCKETS_SELECTION__UPLOAD, oldUpload, upload));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FPOForecastBucket> getSelectedBuckets() {
		if (selectedBuckets == null) {
			selectedBuckets = new EObjectResolvingEList<FPOForecastBucket>(FPOForecastBucket.class, this, ForecastPackage.FPO_FORECAST_BUCKETS_SELECTION__SELECTED_BUCKETS);
		}
		return selectedBuckets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Date> getSelectBucketDates() {
		if (selectBucketDates == null) {
			selectBucketDates = new EDataTypeUniqueEList<Date>(Date.class, this, ForecastPackage.FPO_FORECAST_BUCKETS_SELECTION__SELECT_BUCKET_DATES);
		}
		return selectBucketDates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BigDecimal> getSelectThroughputTypes() {
		if (selectThroughputTypes == null) {
			selectThroughputTypes = new EDataTypeUniqueEList<BigDecimal>(BigDecimal.class, this, ForecastPackage.FPO_FORECAST_BUCKETS_SELECTION__SELECT_THROUGHPUT_TYPES);
		}
		return selectThroughputTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BigDecimal> getSelectMechanizationLevel() {
		if (selectMechanizationLevel == null) {
			selectMechanizationLevel = new EDataTypeUniqueEList<BigDecimal>(BigDecimal.class, this, ForecastPackage.FPO_FORECAST_BUCKETS_SELECTION__SELECT_MECHANIZATION_LEVEL);
		}
		return selectMechanizationLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BigDecimal> getSelectSortingLevelAGGs() {
		if (selectSortingLevelAGGs == null) {
			selectSortingLevelAGGs = new EDataTypeUniqueEList<BigDecimal>(BigDecimal.class, this, ForecastPackage.FPO_FORECAST_BUCKETS_SELECTION__SELECT_SORTING_LEVEL_AG_GS);
		}
		return selectSortingLevelAGGs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BigDecimal> getSelectFirstSortingIMCs() {
		if (selectFirstSortingIMCs == null) {
			selectFirstSortingIMCs = new EDataTypeUniqueEList<BigDecimal>(BigDecimal.class, this, ForecastPackage.FPO_FORECAST_BUCKETS_SELECTION__SELECT_FIRST_SORTING_IM_CS);
		}
		return selectFirstSortingIMCs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSelectionSize() {
		return selectionSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSelectionSize(int newSelectionSize) {
		int oldSelectionSize = selectionSize;
		selectionSize = newSelectionSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ForecastPackage.FPO_FORECAST_BUCKETS_SELECTION__SELECTION_SIZE, oldSelectionSize, selectionSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public boolean isSelected(FPOForecastBucket bucket) {
		if (  this.getSelectFirstSortingIMCs()!=null 
		  &&  this.getSelectFirstSortingIMCs().size()>0 
		  && !this.getSelectFirstSortingIMCs().contains(bucket.getFirstSortingImc())){
			return false;
		}
		if (    this.getSelectBucketDates()!=null 
			&&  this.getSelectBucketDates().size()>0 
			&& !this.getSelectBucketDates().contains(bucket.getBucketDate())){
			return false;
		}
		if (    this.getSelectMechanizationLevel()!=null
			&&  this.getSelectMechanizationLevel().size()>0
			&& !this.getSelectMechanizationLevel().contains(bucket.getMechanizationLevel())){
			return false;
		}
		if (    this.getSelectSortingLevelAGGs()!=null
			&&  this.getSelectSortingLevelAGGs().size()>0
			&& !this.getSelectSortingLevelAGGs().contains(bucket.getSortingLevelAGG())){
			return false;
		}
		if (    this.getSelectThroughputTypes()!=null
			&&  this.getSelectThroughputTypes().size()>0
			&& !this.getSelectThroughputTypes().contains(bucket.getThroughputType())){
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void refreshSelectedBuckets() {
		HashSet<FPOForecastBucket> tobe = new HashSet<FPOForecastBucket>();
		if ( this.getUpload()!=null){
			for ( FPOForecastBucket bucket : this.getUpload().getForecastTable().getForecastRows()){
				if ( this.isSelected(bucket) ){
					tobe.add(bucket);
				}
			}
		}
		HashSet<FPOForecastBucket> asis = new HashSet<FPOForecastBucket>(this.getSelectedBuckets());
		this.getSelectedBuckets().retainAll(tobe); 
		// selectedBuckets is now the intersection of asis and tobe
		tobe.removeAll(asis);
		// tobe is now the to be added ( tobe - asis)
		this.getSelectedBuckets().addAll(tobe);
		this.setSelectionSize(this.getSelectedBuckets().size());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void sortSelectedBuckets() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ForecastPackage.FPO_FORECAST_BUCKETS_SELECTION__UPLOAD:
				if (resolve) return getUpload();
				return basicGetUpload();
			case ForecastPackage.FPO_FORECAST_BUCKETS_SELECTION__SELECTED_BUCKETS:
				return getSelectedBuckets();
			case ForecastPackage.FPO_FORECAST_BUCKETS_SELECTION__SELECT_BUCKET_DATES:
				return getSelectBucketDates();
			case ForecastPackage.FPO_FORECAST_BUCKETS_SELECTION__SELECT_THROUGHPUT_TYPES:
				return getSelectThroughputTypes();
			case ForecastPackage.FPO_FORECAST_BUCKETS_SELECTION__SELECT_MECHANIZATION_LEVEL:
				return getSelectMechanizationLevel();
			case ForecastPackage.FPO_FORECAST_BUCKETS_SELECTION__SELECT_SORTING_LEVEL_AG_GS:
				return getSelectSortingLevelAGGs();
			case ForecastPackage.FPO_FORECAST_BUCKETS_SELECTION__SELECT_FIRST_SORTING_IM_CS:
				return getSelectFirstSortingIMCs();
			case ForecastPackage.FPO_FORECAST_BUCKETS_SELECTION__SELECTION_SIZE:
				return getSelectionSize();
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
			case ForecastPackage.FPO_FORECAST_BUCKETS_SELECTION__UPLOAD:
				setUpload((FPOForecastUpload)newValue);
				return;
			case ForecastPackage.FPO_FORECAST_BUCKETS_SELECTION__SELECTED_BUCKETS:
				getSelectedBuckets().clear();
				getSelectedBuckets().addAll((Collection<? extends FPOForecastBucket>)newValue);
				return;
			case ForecastPackage.FPO_FORECAST_BUCKETS_SELECTION__SELECT_BUCKET_DATES:
				getSelectBucketDates().clear();
				getSelectBucketDates().addAll((Collection<? extends Date>)newValue);
				return;
			case ForecastPackage.FPO_FORECAST_BUCKETS_SELECTION__SELECT_THROUGHPUT_TYPES:
				getSelectThroughputTypes().clear();
				getSelectThroughputTypes().addAll((Collection<? extends BigDecimal>)newValue);
				return;
			case ForecastPackage.FPO_FORECAST_BUCKETS_SELECTION__SELECT_MECHANIZATION_LEVEL:
				getSelectMechanizationLevel().clear();
				getSelectMechanizationLevel().addAll((Collection<? extends BigDecimal>)newValue);
				return;
			case ForecastPackage.FPO_FORECAST_BUCKETS_SELECTION__SELECT_SORTING_LEVEL_AG_GS:
				getSelectSortingLevelAGGs().clear();
				getSelectSortingLevelAGGs().addAll((Collection<? extends BigDecimal>)newValue);
				return;
			case ForecastPackage.FPO_FORECAST_BUCKETS_SELECTION__SELECT_FIRST_SORTING_IM_CS:
				getSelectFirstSortingIMCs().clear();
				getSelectFirstSortingIMCs().addAll((Collection<? extends BigDecimal>)newValue);
				return;
			case ForecastPackage.FPO_FORECAST_BUCKETS_SELECTION__SELECTION_SIZE:
				setSelectionSize((Integer)newValue);
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
			case ForecastPackage.FPO_FORECAST_BUCKETS_SELECTION__UPLOAD:
				setUpload((FPOForecastUpload)null);
				return;
			case ForecastPackage.FPO_FORECAST_BUCKETS_SELECTION__SELECTED_BUCKETS:
				getSelectedBuckets().clear();
				return;
			case ForecastPackage.FPO_FORECAST_BUCKETS_SELECTION__SELECT_BUCKET_DATES:
				getSelectBucketDates().clear();
				return;
			case ForecastPackage.FPO_FORECAST_BUCKETS_SELECTION__SELECT_THROUGHPUT_TYPES:
				getSelectThroughputTypes().clear();
				return;
			case ForecastPackage.FPO_FORECAST_BUCKETS_SELECTION__SELECT_MECHANIZATION_LEVEL:
				getSelectMechanizationLevel().clear();
				return;
			case ForecastPackage.FPO_FORECAST_BUCKETS_SELECTION__SELECT_SORTING_LEVEL_AG_GS:
				getSelectSortingLevelAGGs().clear();
				return;
			case ForecastPackage.FPO_FORECAST_BUCKETS_SELECTION__SELECT_FIRST_SORTING_IM_CS:
				getSelectFirstSortingIMCs().clear();
				return;
			case ForecastPackage.FPO_FORECAST_BUCKETS_SELECTION__SELECTION_SIZE:
				setSelectionSize(SELECTION_SIZE_EDEFAULT);
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
			case ForecastPackage.FPO_FORECAST_BUCKETS_SELECTION__UPLOAD:
				return upload != null;
			case ForecastPackage.FPO_FORECAST_BUCKETS_SELECTION__SELECTED_BUCKETS:
				return selectedBuckets != null && !selectedBuckets.isEmpty();
			case ForecastPackage.FPO_FORECAST_BUCKETS_SELECTION__SELECT_BUCKET_DATES:
				return selectBucketDates != null && !selectBucketDates.isEmpty();
			case ForecastPackage.FPO_FORECAST_BUCKETS_SELECTION__SELECT_THROUGHPUT_TYPES:
				return selectThroughputTypes != null && !selectThroughputTypes.isEmpty();
			case ForecastPackage.FPO_FORECAST_BUCKETS_SELECTION__SELECT_MECHANIZATION_LEVEL:
				return selectMechanizationLevel != null && !selectMechanizationLevel.isEmpty();
			case ForecastPackage.FPO_FORECAST_BUCKETS_SELECTION__SELECT_SORTING_LEVEL_AG_GS:
				return selectSortingLevelAGGs != null && !selectSortingLevelAGGs.isEmpty();
			case ForecastPackage.FPO_FORECAST_BUCKETS_SELECTION__SELECT_FIRST_SORTING_IM_CS:
				return selectFirstSortingIMCs != null && !selectFirstSortingIMCs.isEmpty();
			case ForecastPackage.FPO_FORECAST_BUCKETS_SELECTION__SELECTION_SIZE:
				return selectionSize != SELECTION_SIZE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ForecastPackage.FPO_FORECAST_BUCKETS_SELECTION___IS_SELECTED__FPOFORECASTBUCKET:
				return isSelected((FPOForecastBucket)arguments.get(0));
			case ForecastPackage.FPO_FORECAST_BUCKETS_SELECTION___REFRESH_SELECTED_BUCKETS:
				refreshSelectedBuckets();
				return null;
			case ForecastPackage.FPO_FORECAST_BUCKETS_SELECTION___SORT_SELECTED_BUCKETS:
				sortSelectedBuckets();
				return null;
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (SelectBucketDates: ");
		result.append(selectBucketDates);
		result.append(", SelectThroughputTypes: ");
		result.append(selectThroughputTypes);
		result.append(", SelectMechanizationLevel: ");
		result.append(selectMechanizationLevel);
		result.append(", SelectSortingLevelAGGs: ");
		result.append(selectSortingLevelAGGs);
		result.append(", SelectFirstSortingIMCs: ");
		result.append(selectFirstSortingIMCs);
		result.append(", SelectionSize: ");
		result.append(selectionSize);
		result.append(')');
		return result.toString();
	}

} //FPOForecastBucketsSelectionImpl
