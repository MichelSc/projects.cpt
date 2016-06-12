/**
 */
package com.misc.projects.CptDatasetLoad.impl;

import com.misc.common.moplaf.dbsynch.DbSynchPackage;
import com.misc.common.moplaf.dbsynch.dbsynchora.DbsynchoraPackage;
import com.misc.projects.CptDatasetLoad.CptDatasetLoadFactory;
import com.misc.projects.CptDatasetLoad.CptDatasetLoadPackage;
import com.misc.projects.CptDatasetLoad.FPDMasterData;
import com.misc.projects.CptDatasetLoad.FPDSortingPanRow;
import com.misc.projects.CptDatasetLoad.FPDSortingPlanTable;
import com.misc.projects.CptDatasetLoad.FPDSortingPlansSet;
import com.misc.projects.CptDatasetLoad.FPDTableGroup;
import com.misc.projects.CptDatasetLoad.FPOForecastBucket;
import com.misc.projects.CptDatasetLoad.FPOForecastBuckets;
import com.misc.projects.CptDatasetLoad.FPOForecastUpload;
import com.misc.projects.CptDatasetLoad.MasterDataTable;
import com.misc.projects.CptDatasetLoad.SortingLevelRow;
import com.misc.projects.CptDatasetLoad.SortingLevelsTable;
import com.misc.projects.CptDatasetLoad.SortingPlanInputRow;
import com.misc.projects.CptDatasetLoad.SortingPlanInputTable;
import com.misc.projects.CptDatasetLoad.SortingPlanOutputRow;
import com.misc.projects.CptDatasetLoad.SortingPlanOutputTable;
import com.misc.projects.CptDatasetLoad.SortingPlanRow;
import com.misc.projects.CptDatasetLoad.SortingPlansTable;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CptDatasetLoadPackageImpl extends EPackageImpl implements CptDatasetLoadPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fpdEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fpdSortingPlansSetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sortingPlansTableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sortingPlanInputTableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sortingPlanRowEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sortingPlanOutputTableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sortingPlanOutputRowEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sortingPlanInputRowEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fpoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fpoForecastUploadEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fpoForecastBucketEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fpoForecastBucketsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sortingLevelsTableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sortingLevelRowEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fpdSortingPlanTableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fpdSortingPanRowEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fpdMasterDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass masterDataTableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fpdTableGroupEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see com.misc.projects.CptDatasetLoad.CptDatasetLoadPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CptDatasetLoadPackageImpl() {
		super(eNS_URI, CptDatasetLoadFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link CptDatasetLoadPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CptDatasetLoadPackage init() {
		if (isInited) return (CptDatasetLoadPackage)EPackage.Registry.INSTANCE.getEPackage(CptDatasetLoadPackage.eNS_URI);

		// Obtain or create and register package
		CptDatasetLoadPackageImpl theCptDatasetLoadPackage = (CptDatasetLoadPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof CptDatasetLoadPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new CptDatasetLoadPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		DbsynchoraPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theCptDatasetLoadPackage.createPackageContents();

		// Initialize created meta-data
		theCptDatasetLoadPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theCptDatasetLoadPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CptDatasetLoadPackage.eNS_URI, theCptDatasetLoadPackage);
		return theCptDatasetLoadPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFPD() {
		return fpdEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFPD_MasterData() {
		return (EReference)fpdEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFPD_SortingPlansSets() {
		return (EReference)fpdEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFPDSortingPlansSet() {
		return fpdSortingPlansSetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFPDSortingPlansSet_FromDate() {
		return (EAttribute)fpdSortingPlansSetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFPDSortingPlansSet_ToDate() {
		return (EAttribute)fpdSortingPlansSetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFPDSortingPlansSet_SortingPlansTable() {
		return (EReference)fpdSortingPlansSetEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFPDSortingPlansSet_SortingPlanOutputsTable() {
		return (EReference)fpdSortingPlansSetEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFPDSortingPlansSet_SortingPlanInputsTable() {
		return (EReference)fpdSortingPlansSetEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSortingPlansTable() {
		return sortingPlansTableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSortingPlansTable_SortingPlansRow() {
		return (EReference)sortingPlansTableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSortingPlansTable__GetRow__BigDecimal() {
		return sortingPlansTableEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSortingPlanInputTable() {
		return sortingPlanInputTableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSortingPlanInputTable_SortingPlanInputRow() {
		return (EReference)sortingPlanInputTableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSortingPlanInputTable__GetRow__BigDecimal_BigDecimal_BigDecimal_BigDecimal() {
		return sortingPlanInputTableEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSortingPlanRow() {
		return sortingPlanRowEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSortingPlanRow_SortingPlanSk() {
		return (EAttribute)sortingPlanRowEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSortingPlanRow_SortingPlanName() {
		return (EAttribute)sortingPlanRowEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSortingPlanRow_SortingLevelPLAGGSk() {
		return (EAttribute)sortingPlanRowEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSortingPlanRow_Inputs() {
		return (EReference)sortingPlanRowEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSortingPlanRow_Outputs() {
		return (EReference)sortingPlanRowEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSortingPlanRow_Description() {
		return (EAttribute)sortingPlanRowEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSortingPlanOutputTable() {
		return sortingPlanOutputTableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSortingPlanOutputTable_SortingPlanOutputRow() {
		return (EReference)sortingPlanOutputTableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSortingPlanOutputTable__GetRow__BigDecimal_BigDecimal_BigDecimal_BigDecimal_BigDecimal() {
		return sortingPlanOutputTableEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSortingPlanOutputRow() {
		return sortingPlanOutputRowEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSortingPlanOutputRow_SortingPlanSk() {
		return (EAttribute)sortingPlanOutputRowEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSortingPlanOutputRow_SortingLevelAVCSSk() {
		return (EAttribute)sortingPlanOutputRowEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSortingPlanOutputRow_MechanizationLevelSk() {
		return (EAttribute)sortingPlanOutputRowEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSortingPlanOutputRow_ThroughputTypeSk() {
		return (EAttribute)sortingPlanOutputRowEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSortingPlanOutputRow_DestinationSk() {
		return (EAttribute)sortingPlanOutputRowEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSortingPlanOutputRow_SortingPlan() {
		return (EReference)sortingPlanOutputRowEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSortingPlanOutputRow_SortingLevel() {
		return (EReference)sortingPlanOutputRowEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSortingPlanOutputRow_Description() {
		return (EAttribute)sortingPlanOutputRowEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSortingPlanInputRow() {
		return sortingPlanInputRowEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSortingPlanInputRow_SortingPlanSk() {
		return (EAttribute)sortingPlanInputRowEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSortingPlanInputRow_SortingLevelAVCSSk() {
		return (EAttribute)sortingPlanInputRowEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSortingPlanInputRow_MechanizationLevelSk() {
		return (EAttribute)sortingPlanInputRowEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSortingPlanInputRow_ThroughputTypeSk() {
		return (EAttribute)sortingPlanInputRowEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSortingPlanInputRow_SortingPlan() {
		return (EReference)sortingPlanInputRowEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSortingPlanInputRow_SortingLevel() {
		return (EReference)sortingPlanInputRowEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSortingPlanInputRow_Description() {
		return (EAttribute)sortingPlanInputRowEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFPO() {
		return fpoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFPO_ForecastUploads() {
		return (EReference)fpoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFPOForecastUpload() {
		return fpoForecastUploadEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFPOForecastUpload_FromDate() {
		return (EAttribute)fpoForecastUploadEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFPOForecastUpload_ToDate() {
		return (EAttribute)fpoForecastUploadEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFPOForecastUpload_Kind() {
		return (EAttribute)fpoForecastUploadEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFPOForecastUpload_ForecastTable() {
		return (EReference)fpoForecastUploadEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFPOForecastBucket() {
		return fpoForecastBucketEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFPOForecastBucket_BucketDate() {
		return (EAttribute)fpoForecastBucketEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFPOForecastBucket_BucketBeginTime() {
		return (EAttribute)fpoForecastBucketEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFPOForecastBucket_BucketEndTime() {
		return (EAttribute)fpoForecastBucketEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFPOForecastBucket_BucketHour() {
		return (EAttribute)fpoForecastBucketEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFPOForecastBucket_Customer() {
		return (EAttribute)fpoForecastBucketEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFPOForecastBucket_FirstSortingImc() {
		return (EAttribute)fpoForecastBucketEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFPOForecastBucket_IntakeChannel() {
		return (EAttribute)fpoForecastBucketEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFPOForecastBucket_IntakeLocation() {
		return (EAttribute)fpoForecastBucketEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFPOForecastBucket_DayPlus() {
		return (EAttribute)fpoForecastBucketEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFPOForecastBucket_ThroughputType() {
		return (EAttribute)fpoForecastBucketEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFPOForecastBucket_MechanizationLevel() {
		return (EAttribute)fpoForecastBucketEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFPOForecastBucket_SortingLevelAGG() {
		return (EAttribute)fpoForecastBucketEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFPOForecastBucket_Volume() {
		return (EAttribute)fpoForecastBucketEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFPOForecastBucket_PublicationID() {
		return (EAttribute)fpoForecastBucketEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFPOForecastBucket_TimeSeriesID() {
		return (EAttribute)fpoForecastBucketEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFPOForecastBucket_BucketID() {
		return (EAttribute)fpoForecastBucketEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFPOForecastBuckets() {
		return fpoForecastBucketsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFPOForecastBuckets_ForecastRows() {
		return (EReference)fpoForecastBucketsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSortingLevelsTable() {
		return sortingLevelsTableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSortingLevelsTable_SortinglevelRow() {
		return (EReference)sortingLevelsTableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSortingLevelsTable__GetRow__BigDecimal() {
		return sortingLevelsTableEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSortingLevelRow() {
		return sortingLevelRowEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSortingLevelRow_SortingLevelSk() {
		return (EAttribute)sortingLevelRowEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSortingLevelRow_SortingLevelName() {
		return (EAttribute)sortingLevelRowEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSortingLevelRow_Description() {
		return (EAttribute)sortingLevelRowEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFPDSortingPlanTable() {
		return fpdSortingPlanTableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFPDSortingPlanTable_FPDSortingPlansSet() {
		return (EReference)fpdSortingPlanTableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFPDSortingPanRow() {
		return fpdSortingPanRowEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFPDSortingPanRow_FPDSortingPlanTable() {
		return (EReference)fpdSortingPanRowEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFPDMasterData() {
		return fpdMasterDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFPDMasterData_SortingLevelTable() {
		return (EReference)fpdMasterDataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMasterDataTable() {
		return masterDataTableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFPDTableGroup() {
		return fpdTableGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFPDTableGroup_FPD() {
		return (EReference)fpdTableGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CptDatasetLoadFactory getCptDatasetLoadFactory() {
		return (CptDatasetLoadFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		fpdEClass = createEClass(FPD);
		createEReference(fpdEClass, FPD__MASTER_DATA);
		createEReference(fpdEClass, FPD__SORTING_PLANS_SETS);

		fpdTableGroupEClass = createEClass(FPD_TABLE_GROUP);
		createEReference(fpdTableGroupEClass, FPD_TABLE_GROUP__FPD);

		fpdMasterDataEClass = createEClass(FPD_MASTER_DATA);
		createEReference(fpdMasterDataEClass, FPD_MASTER_DATA__SORTING_LEVEL_TABLE);

		fpdSortingPlansSetEClass = createEClass(FPD_SORTING_PLANS_SET);
		createEAttribute(fpdSortingPlansSetEClass, FPD_SORTING_PLANS_SET__FROM_DATE);
		createEAttribute(fpdSortingPlansSetEClass, FPD_SORTING_PLANS_SET__TO_DATE);
		createEReference(fpdSortingPlansSetEClass, FPD_SORTING_PLANS_SET__SORTING_PLANS_TABLE);
		createEReference(fpdSortingPlansSetEClass, FPD_SORTING_PLANS_SET__SORTING_PLAN_OUTPUTS_TABLE);
		createEReference(fpdSortingPlansSetEClass, FPD_SORTING_PLANS_SET__SORTING_PLAN_INPUTS_TABLE);

		fpdSortingPanRowEClass = createEClass(FPD_SORTING_PAN_ROW);
		createEReference(fpdSortingPanRowEClass, FPD_SORTING_PAN_ROW__FPD_SORTING_PLAN_TABLE);

		fpdSortingPlanTableEClass = createEClass(FPD_SORTING_PLAN_TABLE);
		createEReference(fpdSortingPlanTableEClass, FPD_SORTING_PLAN_TABLE__FPD_SORTING_PLANS_SET);

		masterDataTableEClass = createEClass(MASTER_DATA_TABLE);

		sortingLevelsTableEClass = createEClass(SORTING_LEVELS_TABLE);
		createEReference(sortingLevelsTableEClass, SORTING_LEVELS_TABLE__SORTINGLEVEL_ROW);
		createEOperation(sortingLevelsTableEClass, SORTING_LEVELS_TABLE___GET_ROW__BIGDECIMAL);

		sortingPlansTableEClass = createEClass(SORTING_PLANS_TABLE);
		createEReference(sortingPlansTableEClass, SORTING_PLANS_TABLE__SORTING_PLANS_ROW);
		createEOperation(sortingPlansTableEClass, SORTING_PLANS_TABLE___GET_ROW__BIGDECIMAL);

		sortingPlanInputTableEClass = createEClass(SORTING_PLAN_INPUT_TABLE);
		createEReference(sortingPlanInputTableEClass, SORTING_PLAN_INPUT_TABLE__SORTING_PLAN_INPUT_ROW);
		createEOperation(sortingPlanInputTableEClass, SORTING_PLAN_INPUT_TABLE___GET_ROW__BIGDECIMAL_BIGDECIMAL_BIGDECIMAL_BIGDECIMAL);

		sortingPlanOutputTableEClass = createEClass(SORTING_PLAN_OUTPUT_TABLE);
		createEReference(sortingPlanOutputTableEClass, SORTING_PLAN_OUTPUT_TABLE__SORTING_PLAN_OUTPUT_ROW);
		createEOperation(sortingPlanOutputTableEClass, SORTING_PLAN_OUTPUT_TABLE___GET_ROW__BIGDECIMAL_BIGDECIMAL_BIGDECIMAL_BIGDECIMAL_BIGDECIMAL);

		sortingLevelRowEClass = createEClass(SORTING_LEVEL_ROW);
		createEAttribute(sortingLevelRowEClass, SORTING_LEVEL_ROW__SORTING_LEVEL_SK);
		createEAttribute(sortingLevelRowEClass, SORTING_LEVEL_ROW__SORTING_LEVEL_NAME);
		createEAttribute(sortingLevelRowEClass, SORTING_LEVEL_ROW__DESCRIPTION);

		sortingPlanRowEClass = createEClass(SORTING_PLAN_ROW);
		createEAttribute(sortingPlanRowEClass, SORTING_PLAN_ROW__SORTING_PLAN_SK);
		createEAttribute(sortingPlanRowEClass, SORTING_PLAN_ROW__SORTING_PLAN_NAME);
		createEAttribute(sortingPlanRowEClass, SORTING_PLAN_ROW__SORTING_LEVEL_PLAGG_SK);
		createEReference(sortingPlanRowEClass, SORTING_PLAN_ROW__INPUTS);
		createEReference(sortingPlanRowEClass, SORTING_PLAN_ROW__OUTPUTS);
		createEAttribute(sortingPlanRowEClass, SORTING_PLAN_ROW__DESCRIPTION);

		sortingPlanOutputRowEClass = createEClass(SORTING_PLAN_OUTPUT_ROW);
		createEAttribute(sortingPlanOutputRowEClass, SORTING_PLAN_OUTPUT_ROW__SORTING_PLAN_SK);
		createEAttribute(sortingPlanOutputRowEClass, SORTING_PLAN_OUTPUT_ROW__SORTING_LEVEL_AVCS_SK);
		createEAttribute(sortingPlanOutputRowEClass, SORTING_PLAN_OUTPUT_ROW__MECHANIZATION_LEVEL_SK);
		createEAttribute(sortingPlanOutputRowEClass, SORTING_PLAN_OUTPUT_ROW__THROUGHPUT_TYPE_SK);
		createEAttribute(sortingPlanOutputRowEClass, SORTING_PLAN_OUTPUT_ROW__DESTINATION_SK);
		createEReference(sortingPlanOutputRowEClass, SORTING_PLAN_OUTPUT_ROW__SORTING_PLAN);
		createEReference(sortingPlanOutputRowEClass, SORTING_PLAN_OUTPUT_ROW__SORTING_LEVEL);
		createEAttribute(sortingPlanOutputRowEClass, SORTING_PLAN_OUTPUT_ROW__DESCRIPTION);

		sortingPlanInputRowEClass = createEClass(SORTING_PLAN_INPUT_ROW);
		createEAttribute(sortingPlanInputRowEClass, SORTING_PLAN_INPUT_ROW__SORTING_PLAN_SK);
		createEAttribute(sortingPlanInputRowEClass, SORTING_PLAN_INPUT_ROW__SORTING_LEVEL_AVCS_SK);
		createEAttribute(sortingPlanInputRowEClass, SORTING_PLAN_INPUT_ROW__MECHANIZATION_LEVEL_SK);
		createEAttribute(sortingPlanInputRowEClass, SORTING_PLAN_INPUT_ROW__THROUGHPUT_TYPE_SK);
		createEReference(sortingPlanInputRowEClass, SORTING_PLAN_INPUT_ROW__SORTING_PLAN);
		createEReference(sortingPlanInputRowEClass, SORTING_PLAN_INPUT_ROW__SORTING_LEVEL);
		createEAttribute(sortingPlanInputRowEClass, SORTING_PLAN_INPUT_ROW__DESCRIPTION);

		fpoEClass = createEClass(FPO);
		createEReference(fpoEClass, FPO__FORECAST_UPLOADS);

		fpoForecastUploadEClass = createEClass(FPO_FORECAST_UPLOAD);
		createEAttribute(fpoForecastUploadEClass, FPO_FORECAST_UPLOAD__FROM_DATE);
		createEAttribute(fpoForecastUploadEClass, FPO_FORECAST_UPLOAD__TO_DATE);
		createEAttribute(fpoForecastUploadEClass, FPO_FORECAST_UPLOAD__KIND);
		createEReference(fpoForecastUploadEClass, FPO_FORECAST_UPLOAD__FORECAST_TABLE);

		fpoForecastBucketEClass = createEClass(FPO_FORECAST_BUCKET);
		createEAttribute(fpoForecastBucketEClass, FPO_FORECAST_BUCKET__BUCKET_DATE);
		createEAttribute(fpoForecastBucketEClass, FPO_FORECAST_BUCKET__BUCKET_BEGIN_TIME);
		createEAttribute(fpoForecastBucketEClass, FPO_FORECAST_BUCKET__BUCKET_END_TIME);
		createEAttribute(fpoForecastBucketEClass, FPO_FORECAST_BUCKET__BUCKET_HOUR);
		createEAttribute(fpoForecastBucketEClass, FPO_FORECAST_BUCKET__CUSTOMER);
		createEAttribute(fpoForecastBucketEClass, FPO_FORECAST_BUCKET__FIRST_SORTING_IMC);
		createEAttribute(fpoForecastBucketEClass, FPO_FORECAST_BUCKET__INTAKE_CHANNEL);
		createEAttribute(fpoForecastBucketEClass, FPO_FORECAST_BUCKET__INTAKE_LOCATION);
		createEAttribute(fpoForecastBucketEClass, FPO_FORECAST_BUCKET__DAY_PLUS);
		createEAttribute(fpoForecastBucketEClass, FPO_FORECAST_BUCKET__THROUGHPUT_TYPE);
		createEAttribute(fpoForecastBucketEClass, FPO_FORECAST_BUCKET__MECHANIZATION_LEVEL);
		createEAttribute(fpoForecastBucketEClass, FPO_FORECAST_BUCKET__SORTING_LEVEL_AGG);
		createEAttribute(fpoForecastBucketEClass, FPO_FORECAST_BUCKET__VOLUME);
		createEAttribute(fpoForecastBucketEClass, FPO_FORECAST_BUCKET__PUBLICATION_ID);
		createEAttribute(fpoForecastBucketEClass, FPO_FORECAST_BUCKET__TIME_SERIES_ID);
		createEAttribute(fpoForecastBucketEClass, FPO_FORECAST_BUCKET__BUCKET_ID);

		fpoForecastBucketsEClass = createEClass(FPO_FORECAST_BUCKETS);
		createEReference(fpoForecastBucketsEClass, FPO_FORECAST_BUCKETS__FORECAST_ROWS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		DbsynchoraPackage theDbsynchoraPackage = (DbsynchoraPackage)EPackage.Registry.INSTANCE.getEPackage(DbsynchoraPackage.eNS_URI);
		DbSynchPackage theDbSynchPackage = (DbSynchPackage)EPackage.Registry.INSTANCE.getEPackage(DbSynchPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		fpdEClass.getESuperTypes().add(theDbsynchoraPackage.getDataSourceJdbcOraThin());
		fpdTableGroupEClass.getESuperTypes().add(theDbSynchPackage.getDbSynchUnit());
		fpdMasterDataEClass.getESuperTypes().add(this.getFPDTableGroup());
		fpdSortingPlansSetEClass.getESuperTypes().add(this.getFPDTableGroup());
		fpdSortingPanRowEClass.getESuperTypes().add(theDbSynchPackage.getTableRow());
		fpdSortingPlanTableEClass.getESuperTypes().add(theDbSynchPackage.getTable());
		masterDataTableEClass.getESuperTypes().add(theDbSynchPackage.getTable());
		sortingLevelsTableEClass.getESuperTypes().add(this.getMasterDataTable());
		sortingPlansTableEClass.getESuperTypes().add(this.getFPDSortingPlanTable());
		sortingPlanInputTableEClass.getESuperTypes().add(this.getFPDSortingPlanTable());
		sortingPlanOutputTableEClass.getESuperTypes().add(this.getFPDSortingPlanTable());
		sortingLevelRowEClass.getESuperTypes().add(theDbSynchPackage.getTableRow());
		sortingPlanRowEClass.getESuperTypes().add(this.getFPDSortingPanRow());
		sortingPlanOutputRowEClass.getESuperTypes().add(this.getFPDSortingPanRow());
		sortingPlanInputRowEClass.getESuperTypes().add(this.getFPDSortingPanRow());
		fpoEClass.getESuperTypes().add(theDbsynchoraPackage.getDataSourceJdbcOraThin());
		fpoForecastUploadEClass.getESuperTypes().add(theDbSynchPackage.getTableRow());
		fpoForecastBucketEClass.getESuperTypes().add(theDbSynchPackage.getTableRow());
		fpoForecastBucketsEClass.getESuperTypes().add(theDbSynchPackage.getTable());

		// Initialize classes, features, and operations; add parameters
		initEClass(fpdEClass, com.misc.projects.CptDatasetLoad.FPD.class, "FPD", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFPD_MasterData(), this.getFPDMasterData(), null, "MasterData", null, 0, 1, com.misc.projects.CptDatasetLoad.FPD.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFPD_SortingPlansSets(), this.getFPDSortingPlansSet(), null, "SortingPlansSets", null, 0, -1, com.misc.projects.CptDatasetLoad.FPD.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fpdTableGroupEClass, FPDTableGroup.class, "FPDTableGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFPDTableGroup_FPD(), this.getFPD(), null, "FPD", null, 0, 1, FPDTableGroup.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(fpdMasterDataEClass, FPDMasterData.class, "FPDMasterData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFPDMasterData_SortingLevelTable(), this.getSortingLevelsTable(), null, "SortingLevelTable", null, 0, 1, FPDMasterData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fpdSortingPlansSetEClass, FPDSortingPlansSet.class, "FPDSortingPlansSet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFPDSortingPlansSet_FromDate(), ecorePackage.getEDate(), "FromDate", null, 0, 1, FPDSortingPlansSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFPDSortingPlansSet_ToDate(), ecorePackage.getEDate(), "ToDate", null, 0, 1, FPDSortingPlansSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFPDSortingPlansSet_SortingPlansTable(), this.getSortingPlansTable(), null, "SortingPlansTable", null, 0, 1, FPDSortingPlansSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFPDSortingPlansSet_SortingPlanOutputsTable(), this.getSortingPlanOutputTable(), null, "SortingPlanOutputsTable", null, 0, 1, FPDSortingPlansSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFPDSortingPlansSet_SortingPlanInputsTable(), this.getSortingPlanInputTable(), null, "SortingPlanInputsTable", null, 0, 1, FPDSortingPlansSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fpdSortingPanRowEClass, FPDSortingPanRow.class, "FPDSortingPanRow", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFPDSortingPanRow_FPDSortingPlanTable(), this.getFPDSortingPlanTable(), null, "FPDSortingPlanTable", null, 0, 1, FPDSortingPanRow.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(fpdSortingPlanTableEClass, FPDSortingPlanTable.class, "FPDSortingPlanTable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFPDSortingPlanTable_FPDSortingPlansSet(), this.getFPDSortingPlansSet(), null, "FPDSortingPlansSet", null, 0, 1, FPDSortingPlanTable.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(masterDataTableEClass, MasterDataTable.class, "MasterDataTable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(sortingLevelsTableEClass, SortingLevelsTable.class, "SortingLevelsTable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSortingLevelsTable_SortinglevelRow(), this.getSortingLevelRow(), null, "SortinglevelRow", null, 0, -1, SortingLevelsTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getSortingLevelsTable__GetRow__BigDecimal(), this.getSortingLevelRow(), "getRow", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBigDecimal(), "sk", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(sortingPlansTableEClass, SortingPlansTable.class, "SortingPlansTable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSortingPlansTable_SortingPlansRow(), this.getSortingPlanRow(), null, "SortingPlansRow", null, 0, -1, SortingPlansTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getSortingPlansTable__GetRow__BigDecimal(), this.getSortingPlanRow(), "getRow", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBigDecimal(), "sk", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(sortingPlanInputTableEClass, SortingPlanInputTable.class, "SortingPlanInputTable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSortingPlanInputTable_SortingPlanInputRow(), this.getSortingPlanInputRow(), null, "SortingPlanInputRow", null, 0, -1, SortingPlanInputTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getSortingPlanInputTable__GetRow__BigDecimal_BigDecimal_BigDecimal_BigDecimal(), this.getSortingPlanOutputRow(), "getRow", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBigDecimal(), "sortingPlanSk", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBigDecimal(), "sortingLevelSk", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBigDecimal(), "mechanizationLevelSk", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBigDecimal(), "throughputTypeSk", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(sortingPlanOutputTableEClass, SortingPlanOutputTable.class, "SortingPlanOutputTable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSortingPlanOutputTable_SortingPlanOutputRow(), this.getSortingPlanOutputRow(), null, "SortingPlanOutputRow", null, 0, -1, SortingPlanOutputTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getSortingPlanOutputTable__GetRow__BigDecimal_BigDecimal_BigDecimal_BigDecimal_BigDecimal(), this.getSortingPlanOutputRow(), "getRow", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBigDecimal(), "sortingPlanSk", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBigDecimal(), "sortingLevelSk", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBigDecimal(), "mechanizationLevelSk", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBigDecimal(), "throughputTypeSk", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBigDecimal(), "destination", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(sortingLevelRowEClass, SortingLevelRow.class, "SortingLevelRow", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSortingLevelRow_SortingLevelSk(), ecorePackage.getEBigDecimal(), "SortingLevelSk", null, 0, 1, SortingLevelRow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSortingLevelRow_SortingLevelName(), ecorePackage.getEString(), "SortingLevelName", null, 0, 1, SortingLevelRow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSortingLevelRow_Description(), ecorePackage.getEString(), "Description", null, 0, 1, SortingLevelRow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sortingPlanRowEClass, SortingPlanRow.class, "SortingPlanRow", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSortingPlanRow_SortingPlanSk(), ecorePackage.getEBigDecimal(), "SortingPlanSk", null, 0, 1, SortingPlanRow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSortingPlanRow_SortingPlanName(), ecorePackage.getEString(), "SortingPlanName", null, 0, 1, SortingPlanRow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSortingPlanRow_SortingLevelPLAGGSk(), ecorePackage.getEBigDecimal(), "SortingLevelPLAGGSk", null, 0, 1, SortingPlanRow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSortingPlanRow_Inputs(), this.getSortingPlanInputRow(), this.getSortingPlanInputRow_SortingPlan(), "Inputs", null, 0, -1, SortingPlanRow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSortingPlanRow_Outputs(), this.getSortingPlanOutputRow(), this.getSortingPlanOutputRow_SortingPlan(), "Outputs", null, 0, -1, SortingPlanRow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSortingPlanRow_Description(), ecorePackage.getEString(), "Description", null, 0, 1, SortingPlanRow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sortingPlanOutputRowEClass, SortingPlanOutputRow.class, "SortingPlanOutputRow", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSortingPlanOutputRow_SortingPlanSk(), ecorePackage.getEBigDecimal(), "SortingPlanSk", null, 0, 1, SortingPlanOutputRow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSortingPlanOutputRow_SortingLevelAVCSSk(), ecorePackage.getEBigDecimal(), "SortingLevelAVCSSk", null, 0, 1, SortingPlanOutputRow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSortingPlanOutputRow_MechanizationLevelSk(), ecorePackage.getEBigDecimal(), "MechanizationLevelSk", null, 0, 1, SortingPlanOutputRow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSortingPlanOutputRow_ThroughputTypeSk(), ecorePackage.getEBigDecimal(), "ThroughputTypeSk", null, 0, 1, SortingPlanOutputRow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSortingPlanOutputRow_DestinationSk(), ecorePackage.getEBigDecimal(), "DestinationSk", null, 0, 1, SortingPlanOutputRow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSortingPlanOutputRow_SortingPlan(), this.getSortingPlanRow(), this.getSortingPlanRow_Outputs(), "SortingPlan", null, 0, 1, SortingPlanOutputRow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSortingPlanOutputRow_SortingLevel(), this.getSortingLevelRow(), null, "SortingLevel", null, 0, 1, SortingPlanOutputRow.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getSortingPlanOutputRow_Description(), ecorePackage.getEString(), "Description", null, 0, 1, SortingPlanOutputRow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sortingPlanInputRowEClass, SortingPlanInputRow.class, "SortingPlanInputRow", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSortingPlanInputRow_SortingPlanSk(), ecorePackage.getEBigDecimal(), "SortingPlanSk", null, 0, 1, SortingPlanInputRow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSortingPlanInputRow_SortingLevelAVCSSk(), ecorePackage.getEBigDecimal(), "SortingLevelAVCSSk", null, 0, 1, SortingPlanInputRow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSortingPlanInputRow_MechanizationLevelSk(), ecorePackage.getEBigDecimal(), "MechanizationLevelSk", null, 0, 1, SortingPlanInputRow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSortingPlanInputRow_ThroughputTypeSk(), ecorePackage.getEBigDecimal(), "ThroughputTypeSk", null, 0, 1, SortingPlanInputRow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSortingPlanInputRow_SortingPlan(), this.getSortingPlanRow(), this.getSortingPlanRow_Inputs(), "SortingPlan", null, 0, 1, SortingPlanInputRow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSortingPlanInputRow_SortingLevel(), this.getSortingLevelRow(), null, "SortingLevel", null, 0, 1, SortingPlanInputRow.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getSortingPlanInputRow_Description(), ecorePackage.getEString(), "Description", null, 0, 1, SortingPlanInputRow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fpoEClass, com.misc.projects.CptDatasetLoad.FPO.class, "FPO", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFPO_ForecastUploads(), this.getFPOForecastUpload(), null, "ForecastUploads", null, 0, -1, com.misc.projects.CptDatasetLoad.FPO.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fpoForecastUploadEClass, FPOForecastUpload.class, "FPOForecastUpload", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFPOForecastUpload_FromDate(), ecorePackage.getEDate(), "FromDate", null, 0, 1, FPOForecastUpload.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFPOForecastUpload_ToDate(), ecorePackage.getEDate(), "ToDate", null, 0, 1, FPOForecastUpload.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFPOForecastUpload_Kind(), ecorePackage.getEString(), "Kind", null, 0, 1, FPOForecastUpload.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFPOForecastUpload_ForecastTable(), this.getFPOForecastBuckets(), null, "ForecastTable", null, 1, 1, FPOForecastUpload.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fpoForecastBucketEClass, FPOForecastBucket.class, "FPOForecastBucket", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFPOForecastBucket_BucketDate(), ecorePackage.getEDate(), "BucketDate", null, 0, 1, FPOForecastBucket.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFPOForecastBucket_BucketBeginTime(), ecorePackage.getEDate(), "BucketBeginTime", null, 0, 1, FPOForecastBucket.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFPOForecastBucket_BucketEndTime(), ecorePackage.getEDate(), "BucketEndTime", null, 0, 1, FPOForecastBucket.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFPOForecastBucket_BucketHour(), ecorePackage.getEBigDecimal(), "BucketHour", null, 0, 1, FPOForecastBucket.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFPOForecastBucket_Customer(), ecorePackage.getEBigDecimal(), "Customer", null, 0, 1, FPOForecastBucket.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFPOForecastBucket_FirstSortingImc(), ecorePackage.getEBigDecimal(), "FirstSortingImc", null, 0, 1, FPOForecastBucket.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFPOForecastBucket_IntakeChannel(), ecorePackage.getEBigDecimal(), "IntakeChannel", null, 0, 1, FPOForecastBucket.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFPOForecastBucket_IntakeLocation(), ecorePackage.getEBigDecimal(), "IntakeLocation", null, 0, 1, FPOForecastBucket.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFPOForecastBucket_DayPlus(), ecorePackage.getEBigDecimal(), "DayPlus", null, 0, 1, FPOForecastBucket.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFPOForecastBucket_ThroughputType(), ecorePackage.getEBigDecimal(), "ThroughputType", null, 0, 1, FPOForecastBucket.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFPOForecastBucket_MechanizationLevel(), ecorePackage.getEBigDecimal(), "MechanizationLevel", null, 0, 1, FPOForecastBucket.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFPOForecastBucket_SortingLevelAGG(), ecorePackage.getEBigDecimal(), "SortingLevelAGG", null, 0, 1, FPOForecastBucket.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFPOForecastBucket_Volume(), ecorePackage.getEBigDecimal(), "Volume", null, 0, 1, FPOForecastBucket.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFPOForecastBucket_PublicationID(), ecorePackage.getEString(), "PublicationID", null, 0, 1, FPOForecastBucket.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFPOForecastBucket_TimeSeriesID(), ecorePackage.getEString(), "TimeSeriesID", null, 0, 1, FPOForecastBucket.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFPOForecastBucket_BucketID(), ecorePackage.getEString(), "BucketID", null, 0, 1, FPOForecastBucket.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fpoForecastBucketsEClass, FPOForecastBuckets.class, "FPOForecastBuckets", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFPOForecastBuckets_ForecastRows(), this.getFPOForecastBucket(), null, "ForecastRows", null, 0, -1, FPOForecastBuckets.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //CptDatasetLoadPackageImpl
