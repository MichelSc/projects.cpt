/**
 */
package com.misc.projects.CptDatasetLoad.util;

import com.misc.common.moplaf.dbsynch.DataSource;
import com.misc.common.moplaf.dbsynch.DataSourceJdbc;
import com.misc.common.moplaf.dbsynch.DbSynchUnit;
import com.misc.common.moplaf.dbsynch.DbSynchUnitAbstract;
import com.misc.common.moplaf.dbsynch.Table;
import com.misc.common.moplaf.dbsynch.TableRow;
import com.misc.common.moplaf.dbsynch.dbsynchora.DataSourceJdbcOraThin;
import com.misc.projects.CptDatasetLoad.*;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see com.misc.projects.CptDatasetLoad.CptDatasetLoadPackage
 * @generated
 */
public class CptDatasetLoadAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CptDatasetLoadPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CptDatasetLoadAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = CptDatasetLoadPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CptDatasetLoadSwitch<Adapter> modelSwitch =
		new CptDatasetLoadSwitch<Adapter>() {
			@Override
			public Adapter caseFPD(FPD object) {
				return createFPDAdapter();
			}
			@Override
			public Adapter caseFPDTableGroup(FPDTableGroup object) {
				return createFPDTableGroupAdapter();
			}
			@Override
			public Adapter caseFPDMasterData(FPDMasterData object) {
				return createFPDMasterDataAdapter();
			}
			@Override
			public Adapter caseFPDSortingPlansSet(FPDSortingPlansSet object) {
				return createFPDSortingPlansSetAdapter();
			}
			@Override
			public Adapter caseFPDSortingPanRow(FPDSortingPanRow object) {
				return createFPDSortingPanRowAdapter();
			}
			@Override
			public Adapter caseFPDSortingPlanTable(FPDSortingPlanTable object) {
				return createFPDSortingPlanTableAdapter();
			}
			@Override
			public Adapter caseMasterDataTable(MasterDataTable object) {
				return createMasterDataTableAdapter();
			}
			@Override
			public Adapter caseSortingLevelsTable(SortingLevelsTable object) {
				return createSortingLevelsTableAdapter();
			}
			@Override
			public Adapter caseSortingPlansTable(SortingPlansTable object) {
				return createSortingPlansTableAdapter();
			}
			@Override
			public Adapter caseSortingPlanInputTable(SortingPlanInputTable object) {
				return createSortingPlanInputTableAdapter();
			}
			@Override
			public Adapter caseSortingPlanOutputTable(SortingPlanOutputTable object) {
				return createSortingPlanOutputTableAdapter();
			}
			@Override
			public Adapter caseSortingLevelRow(SortingLevelRow object) {
				return createSortingLevelRowAdapter();
			}
			@Override
			public Adapter caseSortingPlanRow(SortingPlanRow object) {
				return createSortingPlanRowAdapter();
			}
			@Override
			public Adapter caseSortingPlanOutputRow(SortingPlanOutputRow object) {
				return createSortingPlanOutputRowAdapter();
			}
			@Override
			public Adapter caseSortingPlanInputRow(SortingPlanInputRow object) {
				return createSortingPlanInputRowAdapter();
			}
			@Override
			public Adapter caseFPO(FPO object) {
				return createFPOAdapter();
			}
			@Override
			public Adapter caseFPOForecastUpload(FPOForecastUpload object) {
				return createFPOForecastUploadAdapter();
			}
			@Override
			public Adapter caseFPOForecastBucket(FPOForecastBucket object) {
				return createFPOForecastBucketAdapter();
			}
			@Override
			public Adapter caseFPOForecastBuckets(FPOForecastBuckets object) {
				return createFPOForecastBucketsAdapter();
			}
			@Override
			public Adapter caseDbSynchUnitAbstract(DbSynchUnitAbstract object) {
				return createDbSynchUnitAbstractAdapter();
			}
			@Override
			public Adapter caseDataSource(DataSource object) {
				return createDataSourceAdapter();
			}
			@Override
			public Adapter caseDataSourceJdbc(DataSourceJdbc object) {
				return createDataSourceJdbcAdapter();
			}
			@Override
			public Adapter caseDataSourceJdbcOraThin(DataSourceJdbcOraThin object) {
				return createDataSourceJdbcOraThinAdapter();
			}
			@Override
			public Adapter caseDbSynchUnit(DbSynchUnit object) {
				return createDbSynchUnitAdapter();
			}
			@Override
			public Adapter caseTableRow(TableRow object) {
				return createTableRowAdapter();
			}
			@Override
			public Adapter caseTable(Table object) {
				return createTableAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link com.misc.projects.CptDatasetLoad.FPD <em>FPD</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.projects.CptDatasetLoad.FPD
	 * @generated
	 */
	public Adapter createFPDAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.projects.CptDatasetLoad.FPDSortingPlansSet <em>FPD Sorting Plans Set</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.projects.CptDatasetLoad.FPDSortingPlansSet
	 * @generated
	 */
	public Adapter createFPDSortingPlansSetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.projects.CptDatasetLoad.SortingPlansTable <em>Sorting Plans Table</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.projects.CptDatasetLoad.SortingPlansTable
	 * @generated
	 */
	public Adapter createSortingPlansTableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.projects.CptDatasetLoad.SortingPlanInputTable <em>Sorting Plan Input Table</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.projects.CptDatasetLoad.SortingPlanInputTable
	 * @generated
	 */
	public Adapter createSortingPlanInputTableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.projects.CptDatasetLoad.SortingPlanRow <em>Sorting Plan Row</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.projects.CptDatasetLoad.SortingPlanRow
	 * @generated
	 */
	public Adapter createSortingPlanRowAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.projects.CptDatasetLoad.SortingPlanOutputTable <em>Sorting Plan Output Table</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.projects.CptDatasetLoad.SortingPlanOutputTable
	 * @generated
	 */
	public Adapter createSortingPlanOutputTableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.projects.CptDatasetLoad.SortingPlanOutputRow <em>Sorting Plan Output Row</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.projects.CptDatasetLoad.SortingPlanOutputRow
	 * @generated
	 */
	public Adapter createSortingPlanOutputRowAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.projects.CptDatasetLoad.SortingPlanInputRow <em>Sorting Plan Input Row</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.projects.CptDatasetLoad.SortingPlanInputRow
	 * @generated
	 */
	public Adapter createSortingPlanInputRowAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.projects.CptDatasetLoad.FPO <em>FPO</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.projects.CptDatasetLoad.FPO
	 * @generated
	 */
	public Adapter createFPOAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.projects.CptDatasetLoad.FPOForecastUpload <em>FPO Forecast Upload</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.projects.CptDatasetLoad.FPOForecastUpload
	 * @generated
	 */
	public Adapter createFPOForecastUploadAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.projects.CptDatasetLoad.FPOForecastBucket <em>FPO Forecast Bucket</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.projects.CptDatasetLoad.FPOForecastBucket
	 * @generated
	 */
	public Adapter createFPOForecastBucketAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.projects.CptDatasetLoad.FPOForecastBuckets <em>FPO Forecast Buckets</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.projects.CptDatasetLoad.FPOForecastBuckets
	 * @generated
	 */
	public Adapter createFPOForecastBucketsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.dbsynch.DbSynchUnitAbstract <em>Unit Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.dbsynch.DbSynchUnitAbstract
	 * @generated
	 */
	public Adapter createDbSynchUnitAbstractAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.projects.CptDatasetLoad.SortingLevelsTable <em>Sorting Levels Table</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.projects.CptDatasetLoad.SortingLevelsTable
	 * @generated
	 */
	public Adapter createSortingLevelsTableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.projects.CptDatasetLoad.SortingLevelRow <em>Sorting Level Row</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.projects.CptDatasetLoad.SortingLevelRow
	 * @generated
	 */
	public Adapter createSortingLevelRowAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.projects.CptDatasetLoad.FPDSortingPlanTable <em>FPD Sorting Plan Table</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.projects.CptDatasetLoad.FPDSortingPlanTable
	 * @generated
	 */
	public Adapter createFPDSortingPlanTableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.projects.CptDatasetLoad.FPDSortingPanRow <em>FPD Sorting Pan Row</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.projects.CptDatasetLoad.FPDSortingPanRow
	 * @generated
	 */
	public Adapter createFPDSortingPanRowAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.projects.CptDatasetLoad.FPDMasterData <em>FPD Master Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.projects.CptDatasetLoad.FPDMasterData
	 * @generated
	 */
	public Adapter createFPDMasterDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.projects.CptDatasetLoad.MasterDataTable <em>Master Data Table</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.projects.CptDatasetLoad.MasterDataTable
	 * @generated
	 */
	public Adapter createMasterDataTableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.projects.CptDatasetLoad.FPDTableGroup <em>FPD Table Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.projects.CptDatasetLoad.FPDTableGroup
	 * @generated
	 */
	public Adapter createFPDTableGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.dbsynch.DataSource <em>Data Source</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.dbsynch.DataSource
	 * @generated
	 */
	public Adapter createDataSourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.dbsynch.DataSourceJdbc <em>Data Source Jdbc</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.dbsynch.DataSourceJdbc
	 * @generated
	 */
	public Adapter createDataSourceJdbcAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.dbsynch.dbsynchora.DataSourceJdbcOraThin <em>Data Source Jdbc Ora Thin</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.dbsynch.dbsynchora.DataSourceJdbcOraThin
	 * @generated
	 */
	public Adapter createDataSourceJdbcOraThinAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.dbsynch.DbSynchUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.dbsynch.DbSynchUnit
	 * @generated
	 */
	public Adapter createDbSynchUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.dbsynch.Table <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.dbsynch.Table
	 * @generated
	 */
	public Adapter createTableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.dbsynch.TableRow <em>Table Row</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.dbsynch.TableRow
	 * @generated
	 */
	public Adapter createTableRowAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //CptDatasetLoadAdapterFactory
