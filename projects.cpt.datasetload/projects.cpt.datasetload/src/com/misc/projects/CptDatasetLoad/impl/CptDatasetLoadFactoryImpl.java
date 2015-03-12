/**
 */
package com.misc.projects.CptDatasetLoad.impl;

import com.misc.projects.CptDatasetLoad.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CptDatasetLoadFactoryImpl extends EFactoryImpl implements CptDatasetLoadFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CptDatasetLoadFactory init() {
		try {
			CptDatasetLoadFactory theCptDatasetLoadFactory = (CptDatasetLoadFactory)EPackage.Registry.INSTANCE.getEFactory(CptDatasetLoadPackage.eNS_URI);
			if (theCptDatasetLoadFactory != null) {
				return theCptDatasetLoadFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CptDatasetLoadFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CptDatasetLoadFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case CptDatasetLoadPackage.FPD: return createFPD();
			case CptDatasetLoadPackage.FPD_TABLE_GROUP: return createFPDTableGroup();
			case CptDatasetLoadPackage.FPD_MASTER_DATA: return createFPDMasterData();
			case CptDatasetLoadPackage.FPD_SORTING_PLANS_SET: return createFPDSortingPlansSet();
			case CptDatasetLoadPackage.FPD_SORTING_PAN_ROW: return createFPDSortingPanRow();
			case CptDatasetLoadPackage.FPD_SORTING_PLAN_TABLE: return createFPDSortingPlanTable();
			case CptDatasetLoadPackage.MASTER_DATA_TABLE: return createMasterDataTable();
			case CptDatasetLoadPackage.SORTING_LEVELS_TABLE: return createSortingLevelsTable();
			case CptDatasetLoadPackage.SORTING_PLANS_TABLE: return createSortingPlansTable();
			case CptDatasetLoadPackage.SORTING_PLAN_INPUT_TABLE: return createSortingPlanInputTable();
			case CptDatasetLoadPackage.SORTING_PLAN_OUTPUT_TABLE: return createSortingPlanOutputTable();
			case CptDatasetLoadPackage.SORTING_LEVEL_ROW: return createSortingLevelRow();
			case CptDatasetLoadPackage.SORTING_PLAN_ROW: return createSortingPlanRow();
			case CptDatasetLoadPackage.SORTING_PLAN_OUTPUT_ROW: return createSortingPlanOutputRow();
			case CptDatasetLoadPackage.SORTING_PLAN_INPUT_ROW: return createSortingPlanInputRow();
			case CptDatasetLoadPackage.FPO: return createFPO();
			case CptDatasetLoadPackage.FPO_FORECAST_UPLOAD: return createFPOForecastUpload();
			case CptDatasetLoadPackage.FPO_FORECAST_BUCKET: return createFPOForecastBucket();
			case CptDatasetLoadPackage.FPO_FORECAST_BUCKETS: return createFPOForecastBuckets();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FPD createFPD() {
		FPDImpl fpd = new FPDImpl();
		return fpd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FPDSortingPlansSet createFPDSortingPlansSet() {
		FPDSortingPlansSetImpl fpdSortingPlansSet = new FPDSortingPlansSetImpl();
		return fpdSortingPlansSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SortingPlansTable createSortingPlansTable() {
		SortingPlansTableImpl sortingPlansTable = new SortingPlansTableImpl();
		return sortingPlansTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SortingPlanInputTable createSortingPlanInputTable() {
		SortingPlanInputTableImpl sortingPlanInputTable = new SortingPlanInputTableImpl();
		return sortingPlanInputTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SortingPlanRow createSortingPlanRow() {
		SortingPlanRowImpl sortingPlanRow = new SortingPlanRowImpl();
		return sortingPlanRow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SortingPlanOutputTable createSortingPlanOutputTable() {
		SortingPlanOutputTableImpl sortingPlanOutputTable = new SortingPlanOutputTableImpl();
		return sortingPlanOutputTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SortingPlanOutputRow createSortingPlanOutputRow() {
		SortingPlanOutputRowImpl sortingPlanOutputRow = new SortingPlanOutputRowImpl();
		return sortingPlanOutputRow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SortingPlanInputRow createSortingPlanInputRow() {
		SortingPlanInputRowImpl sortingPlanInputRow = new SortingPlanInputRowImpl();
		return sortingPlanInputRow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FPO createFPO() {
		FPOImpl fpo = new FPOImpl();
		return fpo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FPOForecastUpload createFPOForecastUpload() {
		FPOForecastUploadImpl fpoForecastUpload = new FPOForecastUploadImpl();
		return fpoForecastUpload;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FPOForecastBucket createFPOForecastBucket() {
		FPOForecastBucketImpl fpoForecastBucket = new FPOForecastBucketImpl();
		return fpoForecastBucket;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FPOForecastBuckets createFPOForecastBuckets() {
		FPOForecastBucketsImpl fpoForecastBuckets = new FPOForecastBucketsImpl();
		return fpoForecastBuckets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SortingLevelsTable createSortingLevelsTable() {
		SortingLevelsTableImpl sortingLevelsTable = new SortingLevelsTableImpl();
		return sortingLevelsTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SortingLevelRow createSortingLevelRow() {
		SortingLevelRowImpl sortingLevelRow = new SortingLevelRowImpl();
		return sortingLevelRow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FPDSortingPlanTable createFPDSortingPlanTable() {
		FPDSortingPlanTableImpl fpdSortingPlanTable = new FPDSortingPlanTableImpl();
		return fpdSortingPlanTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FPDSortingPanRow createFPDSortingPanRow() {
		FPDSortingPanRowImpl fpdSortingPanRow = new FPDSortingPanRowImpl();
		return fpdSortingPanRow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FPDMasterData createFPDMasterData() {
		FPDMasterDataImpl fpdMasterData = new FPDMasterDataImpl();
		return fpdMasterData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MasterDataTable createMasterDataTable() {
		MasterDataTableImpl masterDataTable = new MasterDataTableImpl();
		return masterDataTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FPDTableGroup createFPDTableGroup() {
		FPDTableGroupImpl fpdTableGroup = new FPDTableGroupImpl();
		return fpdTableGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CptDatasetLoadPackage getCptDatasetLoadPackage() {
		return (CptDatasetLoadPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CptDatasetLoadPackage getPackage() {
		return CptDatasetLoadPackage.eINSTANCE;
	}

} //CptDatasetLoadFactoryImpl
