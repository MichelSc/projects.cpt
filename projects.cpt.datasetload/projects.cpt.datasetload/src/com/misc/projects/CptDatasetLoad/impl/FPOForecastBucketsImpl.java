/**
 */
package com.misc.projects.CptDatasetLoad.impl;

import com.misc.common.moplaf.datasetload.TableRow;
import com.misc.common.moplaf.datasetload.impl.TableImpl;
import com.misc.common.moplaf.datasetload.impl.TableRowKeyImpl;
import com.misc.projects.CptDatasetLoad.CptDatasetLoadFactory;
import com.misc.projects.CptDatasetLoad.CptDatasetLoadPackage;
import com.misc.projects.CptDatasetLoad.FPOForecastBucket;
import com.misc.projects.CptDatasetLoad.FPOForecastBuckets;
import java.math.BigDecimal;
import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>FPO Forecast Buckets</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.misc.projects.CptDatasetLoad.impl.FPOForecastBucketsImpl#getForecastRows <em>Forecast Rows</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FPOForecastBucketsImpl extends TableImpl implements FPOForecastBuckets {
	/**
	 * The cached value of the '{@link #getForecastRows() <em>Forecast Rows</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForecastRows()
	 * @generated
	 * @ordered
	 */
	protected EList<FPOForecastBucket> forecastRows;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FPOForecastBucketsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CptDatasetLoadPackage.Literals.FPO_FORECAST_BUCKETS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FPOForecastBucket> getForecastRows() {
		if (forecastRows == null) {
			forecastRows = new EObjectContainmentEList<FPOForecastBucket>(FPOForecastBucket.class, this, CptDatasetLoadPackage.FPO_FORECAST_BUCKETS__FORECAST_ROWS);
		}
		return forecastRows;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CptDatasetLoadPackage.FPO_FORECAST_BUCKETS__FORECAST_ROWS:
				return ((InternalEList<?>)getForecastRows()).basicRemove(otherEnd, msgs);
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
			case CptDatasetLoadPackage.FPO_FORECAST_BUCKETS__FORECAST_ROWS:
				return getForecastRows();
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
			case CptDatasetLoadPackage.FPO_FORECAST_BUCKETS__FORECAST_ROWS:
				getForecastRows().clear();
				getForecastRows().addAll((Collection<? extends FPOForecastBucket>)newValue);
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
			case CptDatasetLoadPackage.FPO_FORECAST_BUCKETS__FORECAST_ROWS:
				getForecastRows().clear();
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
			case CptDatasetLoadPackage.FPO_FORECAST_BUCKETS__FORECAST_ROWS:
				return forecastRows != null && !forecastRows.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public FPOForecastBucket getRow(BigDecimal pubid, BigDecimal tsid, BigDecimal buid) {
    	Object[] keyObjects = new Object[3];
   		keyObjects[0] = pubid;
   		keyObjects[1] = tsid;
   		keyObjects[2] = buid;
    	TableRowKeyImpl key = new TableRowKeyImpl(keyObjects);
    	TableRow row = this.getRow(key);
    	return (FPOForecastBucket) row;
	}


	
	/* (non-Javadoc)
	 * @see com.misc.common.moplaf.datasetload.impl.TableImpl#NewRow()
	 */
	@Override
	public TableRow newRow() {
		FPOForecastBucket newForecastBucket = CptDatasetLoadFactory.eINSTANCE.createFPOForecastBucket();
		this.getForecastRows().add(newForecastBucket);
		return newForecastBucket;
	}

	
	/* (non-Javadoc)
	 * @see com.misc.common.moplaf.datasetload.impl.TableImpl#getName()
	 */
	@Override
	public String getName() {
		return "V_PL_FORECASTBUCKET";
	}

	/* (non-Javadoc)
	 * @see com.misc.common.moplaf.datasetload.impl.TableImpl#getSQLStatement()
	 */
	@Override
	public String getSQLStatement() {
		String sqlStatement = 
					  "select  \"PublicationID\" "
					  + "    , \"TimeSeriesID\" "
					  + "    , \"BucketID\" "
//					  + "    , \"PublicationKind\" "
					  + "    , \"BucketDate\" "
					  + "    , \"BucketBeginTime\" "
					  + "    , \"BucketEndTime\" "
					  + "    , \"BucketHour\" "
					  + "    , \"Customer\" "
					  + "    , \"DayPlus\" "
//					  + "    , \"DayPlusFC\" "
//					  + "    , \"DayPlusCertain\" "
					  + "    , \"IntakeChannelFPD\" "
					  + "    , \"FirstSortingIMCFPD\" "
//					  + "    , \"IntakeLocationFC\" "
					  + "    , \"IntakeLocationFPD\" "
					  + "    , \"MechanizationLevelFPD\" "
					  + "    , \"SortingLevelFPD\" "
					  + "    , \"ThroughputTypeFPD\" "
					  + "    , \"TotalVolume\" "
					  +	"from V_PL_FORECASTBUCKET "
					  +	"where  \"BucketDate\" >= ? "
					  +	"and    \"BucketDate\" <= ? "
            ;
		return sqlStatement;
	}
	
	/* (non-Javadoc)
	 * @see com.misc.common.moplaf.datasetload.impl.TableImpl#getColumnTableRowAttributes()
	 */
	@Override
	public EList<EAttribute> getColumnTableRowAttributes() {
		EList<EAttribute> columnAttributes = new BasicEList<EAttribute>();
		columnAttributes.add(CptDatasetLoadPackage.Literals.FPO_FORECAST_BUCKET__PUBLICATION_ID);
		columnAttributes.add(CptDatasetLoadPackage.Literals.FPO_FORECAST_BUCKET__TIME_SERIES_ID);
		columnAttributes.add(CptDatasetLoadPackage.Literals.FPO_FORECAST_BUCKET__BUCKET_ID);
		columnAttributes.add(CptDatasetLoadPackage.Literals.FPO_FORECAST_BUCKET__BUCKET_DATE);
		columnAttributes.add(CptDatasetLoadPackage.Literals.FPO_FORECAST_BUCKET__BUCKET_BEGIN_TIME);
		columnAttributes.add(CptDatasetLoadPackage.Literals.FPO_FORECAST_BUCKET__BUCKET_END_TIME);
		columnAttributes.add(CptDatasetLoadPackage.Literals.FPO_FORECAST_BUCKET__BUCKET_HOUR);
		columnAttributes.add(CptDatasetLoadPackage.Literals.FPO_FORECAST_BUCKET__CUSTOMER);
		columnAttributes.add(CptDatasetLoadPackage.Literals.FPO_FORECAST_BUCKET__DAY_PLUS);
		columnAttributes.add(CptDatasetLoadPackage.Literals.FPO_FORECAST_BUCKET__INTAKE_CHANNEL);
		columnAttributes.add(CptDatasetLoadPackage.Literals.FPO_FORECAST_BUCKET__FIRST_SORTING_IMC);
		columnAttributes.add(CptDatasetLoadPackage.Literals.FPO_FORECAST_BUCKET__INTAKE_LOCATION);
		columnAttributes.add(CptDatasetLoadPackage.Literals.FPO_FORECAST_BUCKET__MECHANIZATION_LEVEL);
		columnAttributes.add(CptDatasetLoadPackage.Literals.FPO_FORECAST_BUCKET__SORTING_LEVEL_AGG);
		columnAttributes.add(CptDatasetLoadPackage.Literals.FPO_FORECAST_BUCKET__THROUGHPUT_TYPE);
		columnAttributes.add(CptDatasetLoadPackage.Literals.FPO_FORECAST_BUCKET__VOLUME);
		return columnAttributes;
	}
	
	

	/* (non-Javadoc)
	 * @see com.misc.common.moplaf.datasetload.impl.TableImpl#getParamTableGroupAttributes()
	 */
	@Override
	public EList<EAttribute> getParamTableGroupAttributes() {
		EList<EAttribute> columnAttributes = new BasicEList<EAttribute>();
		columnAttributes.add(CptDatasetLoadPackage.Literals.FPO_FORECAST_UPLOAD__FROM_DATE);
		columnAttributes.add(CptDatasetLoadPackage.Literals.FPO_FORECAST_UPLOAD__TO_DATE);
		return columnAttributes;
	}

	/* (non-Javadoc)
	 * @see com.misc.common.moplaf.datasetload.impl.TableImpl#getKeyColumns()
	 */
	@Override
	public EList<Integer> getKeyColumns() {
		EList<Integer> keyColumns = new BasicEList<Integer>();
		keyColumns.add(0); // zero based
		keyColumns.add(1); // zero based
		keyColumns.add(2); // zero based
		return keyColumns;
	}

} //FPOForecastBucketsImpl
