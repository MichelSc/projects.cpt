/**
 */
package com.misc.projects.CptDatasetLoad;

import com.misc.common.moplaf.dbsynch.DbSynchPackage;
import com.misc.common.moplaf.dbsynch.dbsynchora.DbsynchoraPackage;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see com.misc.projects.CptDatasetLoad.CptDatasetLoadFactory
 * @model kind="package"
 * @generated
 */
public interface CptDatasetLoadPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "CptDatasetLoad";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://com.misc.projects.cpt.datasetload";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "cptload";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CptDatasetLoadPackage eINSTANCE = com.misc.projects.CptDatasetLoad.impl.CptDatasetLoadPackageImpl.init();

	/**
	 * The meta object id for the '{@link com.misc.projects.CptDatasetLoad.impl.FPDImpl <em>FPD</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.projects.CptDatasetLoad.impl.FPDImpl
	 * @see com.misc.projects.CptDatasetLoad.impl.CptDatasetLoadPackageImpl#getFPD()
	 * @generated
	 */
	int FPD = 0;

	/**
	 * The feature id for the '<em><b>Tables</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD__TABLES = DbsynchoraPackage.DATA_SOURCE_JDBC_ORA_THIN__TABLES;

	/**
	 * The feature id for the '<em><b>Data Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD__DATA_SOURCE = DbsynchoraPackage.DATA_SOURCE_JDBC_ORA_THIN__DATA_SOURCE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD__NAME = DbsynchoraPackage.DATA_SOURCE_JDBC_ORA_THIN__NAME;

	/**
	 * The feature id for the '<em><b>Child Units</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD__CHILD_UNITS = DbsynchoraPackage.DATA_SOURCE_JDBC_ORA_THIN__CHILD_UNITS;

	/**
	 * The feature id for the '<em><b>Connected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD__CONNECTED = DbsynchoraPackage.DATA_SOURCE_JDBC_ORA_THIN__CONNECTED;

	/**
	 * The feature id for the '<em><b>Data Base User</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD__DATA_BASE_USER = DbsynchoraPackage.DATA_SOURCE_JDBC_ORA_THIN__DATA_BASE_USER;

	/**
	 * The feature id for the '<em><b>Data Base User Pwd</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD__DATA_BASE_USER_PWD = DbsynchoraPackage.DATA_SOURCE_JDBC_ORA_THIN__DATA_BASE_USER_PWD;

	/**
	 * The feature id for the '<em><b>Default Schema</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD__DEFAULT_SCHEMA = DbsynchoraPackage.DATA_SOURCE_JDBC_ORA_THIN__DEFAULT_SCHEMA;

	/**
	 * The feature id for the '<em><b>Host</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD__HOST = DbsynchoraPackage.DATA_SOURCE_JDBC_ORA_THIN__HOST;

	/**
	 * The feature id for the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD__PORT = DbsynchoraPackage.DATA_SOURCE_JDBC_ORA_THIN__PORT;

	/**
	 * The feature id for the '<em><b>Data Base</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD__DATA_BASE = DbsynchoraPackage.DATA_SOURCE_JDBC_ORA_THIN__DATA_BASE;

	/**
	 * The feature id for the '<em><b>Master Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD__MASTER_DATA = DbsynchoraPackage.DATA_SOURCE_JDBC_ORA_THIN_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Sorting Plans Sets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD__SORTING_PLANS_SETS = DbsynchoraPackage.DATA_SOURCE_JDBC_ORA_THIN_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>FPD</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD_FEATURE_COUNT = DbsynchoraPackage.DATA_SOURCE_JDBC_ORA_THIN_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Refresh Meta Data</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD___REFRESH_META_DATA = DbsynchoraPackage.DATA_SOURCE_JDBC_ORA_THIN___REFRESH_META_DATA;

	/**
	 * The operation id for the '<em>Synch Up</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD___SYNCH_UP = DbsynchoraPackage.DATA_SOURCE_JDBC_ORA_THIN___SYNCH_UP;

	/**
	 * The operation id for the '<em>Synch Down</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD___SYNCH_DOWN = DbsynchoraPackage.DATA_SOURCE_JDBC_ORA_THIN___SYNCH_DOWN;

	/**
	 * The operation id for the '<em>Get Param Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD___GET_PARAM_VALUE__EATTRIBUTE = DbsynchoraPackage.DATA_SOURCE_JDBC_ORA_THIN___GET_PARAM_VALUE__EATTRIBUTE;

	/**
	 * The operation id for the '<em>Get Param Attributes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD___GET_PARAM_ATTRIBUTES = DbsynchoraPackage.DATA_SOURCE_JDBC_ORA_THIN___GET_PARAM_ATTRIBUTES;

	/**
	 * The operation id for the '<em>Connect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD___CONNECT = DbsynchoraPackage.DATA_SOURCE_JDBC_ORA_THIN___CONNECT;

	/**
	 * The operation id for the '<em>Disconnect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD___DISCONNECT = DbsynchoraPackage.DATA_SOURCE_JDBC_ORA_THIN___DISCONNECT;

	/**
	 * The operation id for the '<em>Synch Down Table Impl</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD___SYNCH_DOWN_TABLE_IMPL__TABLE = DbsynchoraPackage.DATA_SOURCE_JDBC_ORA_THIN___SYNCH_DOWN_TABLE_IMPL__TABLE;

	/**
	 * The operation id for the '<em>Synch Up Table Impl</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD___SYNCH_UP_TABLE_IMPL__TABLE = DbsynchoraPackage.DATA_SOURCE_JDBC_ORA_THIN___SYNCH_UP_TABLE_IMPL__TABLE;

	/**
	 * The number of operations of the '<em>FPD</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD_OPERATION_COUNT = DbsynchoraPackage.DATA_SOURCE_JDBC_ORA_THIN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.misc.projects.CptDatasetLoad.impl.FPDTableGroupImpl <em>FPD Table Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.projects.CptDatasetLoad.impl.FPDTableGroupImpl
	 * @see com.misc.projects.CptDatasetLoad.impl.CptDatasetLoadPackageImpl#getFPDTableGroup()
	 * @generated
	 */
	int FPD_TABLE_GROUP = 1;

	/**
	 * The feature id for the '<em><b>Tables</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD_TABLE_GROUP__TABLES = DbSynchPackage.DB_SYNCH_UNIT__TABLES;

	/**
	 * The feature id for the '<em><b>Data Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD_TABLE_GROUP__DATA_SOURCE = DbSynchPackage.DB_SYNCH_UNIT__DATA_SOURCE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD_TABLE_GROUP__NAME = DbSynchPackage.DB_SYNCH_UNIT__NAME;

	/**
	 * The feature id for the '<em><b>Child Units</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD_TABLE_GROUP__CHILD_UNITS = DbSynchPackage.DB_SYNCH_UNIT__CHILD_UNITS;

	/**
	 * The feature id for the '<em><b>Parent Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD_TABLE_GROUP__PARENT_UNIT = DbSynchPackage.DB_SYNCH_UNIT__PARENT_UNIT;

	/**
	 * The feature id for the '<em><b>FPD</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD_TABLE_GROUP__FPD = DbSynchPackage.DB_SYNCH_UNIT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>FPD Table Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD_TABLE_GROUP_FEATURE_COUNT = DbSynchPackage.DB_SYNCH_UNIT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Refresh Meta Data</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD_TABLE_GROUP___REFRESH_META_DATA = DbSynchPackage.DB_SYNCH_UNIT___REFRESH_META_DATA;

	/**
	 * The operation id for the '<em>Synch Up</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD_TABLE_GROUP___SYNCH_UP = DbSynchPackage.DB_SYNCH_UNIT___SYNCH_UP;

	/**
	 * The operation id for the '<em>Synch Down</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD_TABLE_GROUP___SYNCH_DOWN = DbSynchPackage.DB_SYNCH_UNIT___SYNCH_DOWN;

	/**
	 * The operation id for the '<em>Get Param Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD_TABLE_GROUP___GET_PARAM_VALUE__EATTRIBUTE = DbSynchPackage.DB_SYNCH_UNIT___GET_PARAM_VALUE__EATTRIBUTE;

	/**
	 * The operation id for the '<em>Get Param Attributes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD_TABLE_GROUP___GET_PARAM_ATTRIBUTES = DbSynchPackage.DB_SYNCH_UNIT___GET_PARAM_ATTRIBUTES;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD_TABLE_GROUP___REFRESH = DbSynchPackage.DB_SYNCH_UNIT___REFRESH;

	/**
	 * The number of operations of the '<em>FPD Table Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD_TABLE_GROUP_OPERATION_COUNT = DbSynchPackage.DB_SYNCH_UNIT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.misc.projects.CptDatasetLoad.impl.FPDSortingPlansSetImpl <em>FPD Sorting Plans Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.projects.CptDatasetLoad.impl.FPDSortingPlansSetImpl
	 * @see com.misc.projects.CptDatasetLoad.impl.CptDatasetLoadPackageImpl#getFPDSortingPlansSet()
	 * @generated
	 */
	int FPD_SORTING_PLANS_SET = 3;

	/**
	 * The meta object id for the '{@link com.misc.projects.CptDatasetLoad.impl.FPDSortingPlanTableImpl <em>FPD Sorting Plan Table</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.projects.CptDatasetLoad.impl.FPDSortingPlanTableImpl
	 * @see com.misc.projects.CptDatasetLoad.impl.CptDatasetLoadPackageImpl#getFPDSortingPlanTable()
	 * @generated
	 */
	int FPD_SORTING_PLAN_TABLE = 5;

	/**
	 * The meta object id for the '{@link com.misc.projects.CptDatasetLoad.impl.SortingPlansTableImpl <em>Sorting Plans Table</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.projects.CptDatasetLoad.impl.SortingPlansTableImpl
	 * @see com.misc.projects.CptDatasetLoad.impl.CptDatasetLoadPackageImpl#getSortingPlansTable()
	 * @generated
	 */
	int SORTING_PLANS_TABLE = 8;

	/**
	 * The meta object id for the '{@link com.misc.projects.CptDatasetLoad.impl.SortingPlanInputTableImpl <em>Sorting Plan Input Table</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.projects.CptDatasetLoad.impl.SortingPlanInputTableImpl
	 * @see com.misc.projects.CptDatasetLoad.impl.CptDatasetLoadPackageImpl#getSortingPlanInputTable()
	 * @generated
	 */
	int SORTING_PLAN_INPUT_TABLE = 9;

	/**
	 * The meta object id for the '{@link com.misc.projects.CptDatasetLoad.impl.FPDSortingPanRowImpl <em>FPD Sorting Pan Row</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.projects.CptDatasetLoad.impl.FPDSortingPanRowImpl
	 * @see com.misc.projects.CptDatasetLoad.impl.CptDatasetLoadPackageImpl#getFPDSortingPanRow()
	 * @generated
	 */
	int FPD_SORTING_PAN_ROW = 4;

	/**
	 * The meta object id for the '{@link com.misc.projects.CptDatasetLoad.impl.SortingPlanRowImpl <em>Sorting Plan Row</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.projects.CptDatasetLoad.impl.SortingPlanRowImpl
	 * @see com.misc.projects.CptDatasetLoad.impl.CptDatasetLoadPackageImpl#getSortingPlanRow()
	 * @generated
	 */
	int SORTING_PLAN_ROW = 12;

	/**
	 * The meta object id for the '{@link com.misc.projects.CptDatasetLoad.impl.SortingPlanOutputTableImpl <em>Sorting Plan Output Table</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.projects.CptDatasetLoad.impl.SortingPlanOutputTableImpl
	 * @see com.misc.projects.CptDatasetLoad.impl.CptDatasetLoadPackageImpl#getSortingPlanOutputTable()
	 * @generated
	 */
	int SORTING_PLAN_OUTPUT_TABLE = 10;

	/**
	 * The meta object id for the '{@link com.misc.projects.CptDatasetLoad.impl.SortingPlanOutputRowImpl <em>Sorting Plan Output Row</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.projects.CptDatasetLoad.impl.SortingPlanOutputRowImpl
	 * @see com.misc.projects.CptDatasetLoad.impl.CptDatasetLoadPackageImpl#getSortingPlanOutputRow()
	 * @generated
	 */
	int SORTING_PLAN_OUTPUT_ROW = 13;

	/**
	 * The meta object id for the '{@link com.misc.projects.CptDatasetLoad.impl.SortingPlanInputRowImpl <em>Sorting Plan Input Row</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.projects.CptDatasetLoad.impl.SortingPlanInputRowImpl
	 * @see com.misc.projects.CptDatasetLoad.impl.CptDatasetLoadPackageImpl#getSortingPlanInputRow()
	 * @generated
	 */
	int SORTING_PLAN_INPUT_ROW = 14;

	/**
	 * The meta object id for the '{@link com.misc.projects.CptDatasetLoad.impl.MasterDataTableImpl <em>Master Data Table</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.projects.CptDatasetLoad.impl.MasterDataTableImpl
	 * @see com.misc.projects.CptDatasetLoad.impl.CptDatasetLoadPackageImpl#getMasterDataTable()
	 * @generated
	 */
	int MASTER_DATA_TABLE = 6;

	/**
	 * The meta object id for the '{@link com.misc.projects.CptDatasetLoad.impl.SortingLevelsTableImpl <em>Sorting Levels Table</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.projects.CptDatasetLoad.impl.SortingLevelsTableImpl
	 * @see com.misc.projects.CptDatasetLoad.impl.CptDatasetLoadPackageImpl#getSortingLevelsTable()
	 * @generated
	 */
	int SORTING_LEVELS_TABLE = 7;

	/**
	 * The meta object id for the '{@link com.misc.projects.CptDatasetLoad.impl.SortingLevelRowImpl <em>Sorting Level Row</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.projects.CptDatasetLoad.impl.SortingLevelRowImpl
	 * @see com.misc.projects.CptDatasetLoad.impl.CptDatasetLoadPackageImpl#getSortingLevelRow()
	 * @generated
	 */
	int SORTING_LEVEL_ROW = 11;

	/**
	 * The meta object id for the '{@link com.misc.projects.CptDatasetLoad.impl.FPDMasterDataImpl <em>FPD Master Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.projects.CptDatasetLoad.impl.FPDMasterDataImpl
	 * @see com.misc.projects.CptDatasetLoad.impl.CptDatasetLoadPackageImpl#getFPDMasterData()
	 * @generated
	 */
	int FPD_MASTER_DATA = 2;

	/**
	 * The feature id for the '<em><b>Tables</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD_MASTER_DATA__TABLES = FPD_TABLE_GROUP__TABLES;

	/**
	 * The feature id for the '<em><b>Data Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD_MASTER_DATA__DATA_SOURCE = FPD_TABLE_GROUP__DATA_SOURCE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD_MASTER_DATA__NAME = FPD_TABLE_GROUP__NAME;

	/**
	 * The feature id for the '<em><b>Child Units</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD_MASTER_DATA__CHILD_UNITS = FPD_TABLE_GROUP__CHILD_UNITS;

	/**
	 * The feature id for the '<em><b>Parent Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD_MASTER_DATA__PARENT_UNIT = FPD_TABLE_GROUP__PARENT_UNIT;

	/**
	 * The feature id for the '<em><b>FPD</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD_MASTER_DATA__FPD = FPD_TABLE_GROUP__FPD;

	/**
	 * The feature id for the '<em><b>Sorting Level Table</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD_MASTER_DATA__SORTING_LEVEL_TABLE = FPD_TABLE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>FPD Master Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD_MASTER_DATA_FEATURE_COUNT = FPD_TABLE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Refresh Meta Data</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD_MASTER_DATA___REFRESH_META_DATA = FPD_TABLE_GROUP___REFRESH_META_DATA;

	/**
	 * The operation id for the '<em>Synch Up</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD_MASTER_DATA___SYNCH_UP = FPD_TABLE_GROUP___SYNCH_UP;

	/**
	 * The operation id for the '<em>Synch Down</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD_MASTER_DATA___SYNCH_DOWN = FPD_TABLE_GROUP___SYNCH_DOWN;

	/**
	 * The operation id for the '<em>Get Param Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD_MASTER_DATA___GET_PARAM_VALUE__EATTRIBUTE = FPD_TABLE_GROUP___GET_PARAM_VALUE__EATTRIBUTE;

	/**
	 * The operation id for the '<em>Get Param Attributes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD_MASTER_DATA___GET_PARAM_ATTRIBUTES = FPD_TABLE_GROUP___GET_PARAM_ATTRIBUTES;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD_MASTER_DATA___REFRESH = FPD_TABLE_GROUP___REFRESH;

	/**
	 * The number of operations of the '<em>FPD Master Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD_MASTER_DATA_OPERATION_COUNT = FPD_TABLE_GROUP_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Tables</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD_SORTING_PLANS_SET__TABLES = FPD_TABLE_GROUP__TABLES;

	/**
	 * The feature id for the '<em><b>Data Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD_SORTING_PLANS_SET__DATA_SOURCE = FPD_TABLE_GROUP__DATA_SOURCE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD_SORTING_PLANS_SET__NAME = FPD_TABLE_GROUP__NAME;

	/**
	 * The feature id for the '<em><b>Child Units</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD_SORTING_PLANS_SET__CHILD_UNITS = FPD_TABLE_GROUP__CHILD_UNITS;

	/**
	 * The feature id for the '<em><b>Parent Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD_SORTING_PLANS_SET__PARENT_UNIT = FPD_TABLE_GROUP__PARENT_UNIT;

	/**
	 * The feature id for the '<em><b>FPD</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD_SORTING_PLANS_SET__FPD = FPD_TABLE_GROUP__FPD;

	/**
	 * The feature id for the '<em><b>From Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD_SORTING_PLANS_SET__FROM_DATE = FPD_TABLE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>To Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD_SORTING_PLANS_SET__TO_DATE = FPD_TABLE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Sorting Plans Table</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD_SORTING_PLANS_SET__SORTING_PLANS_TABLE = FPD_TABLE_GROUP_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Sorting Plan Outputs Table</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD_SORTING_PLANS_SET__SORTING_PLAN_OUTPUTS_TABLE = FPD_TABLE_GROUP_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Sorting Plan Inputs Table</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD_SORTING_PLANS_SET__SORTING_PLAN_INPUTS_TABLE = FPD_TABLE_GROUP_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>FPD Sorting Plans Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD_SORTING_PLANS_SET_FEATURE_COUNT = FPD_TABLE_GROUP_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>Refresh Meta Data</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD_SORTING_PLANS_SET___REFRESH_META_DATA = FPD_TABLE_GROUP___REFRESH_META_DATA;

	/**
	 * The operation id for the '<em>Synch Up</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD_SORTING_PLANS_SET___SYNCH_UP = FPD_TABLE_GROUP___SYNCH_UP;

	/**
	 * The operation id for the '<em>Synch Down</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD_SORTING_PLANS_SET___SYNCH_DOWN = FPD_TABLE_GROUP___SYNCH_DOWN;

	/**
	 * The operation id for the '<em>Get Param Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD_SORTING_PLANS_SET___GET_PARAM_VALUE__EATTRIBUTE = FPD_TABLE_GROUP___GET_PARAM_VALUE__EATTRIBUTE;

	/**
	 * The operation id for the '<em>Get Param Attributes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD_SORTING_PLANS_SET___GET_PARAM_ATTRIBUTES = FPD_TABLE_GROUP___GET_PARAM_ATTRIBUTES;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD_SORTING_PLANS_SET___REFRESH = FPD_TABLE_GROUP___REFRESH;

	/**
	 * The number of operations of the '<em>FPD Sorting Plans Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD_SORTING_PLANS_SET_OPERATION_COUNT = FPD_TABLE_GROUP_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Table</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD_SORTING_PAN_ROW__TABLE = DbSynchPackage.TABLE_ROW__TABLE;

	/**
	 * The feature id for the '<em><b>Current Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD_SORTING_PAN_ROW__CURRENT_KEY = DbSynchPackage.TABLE_ROW__CURRENT_KEY;

	/**
	 * The feature id for the '<em><b>Deleted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD_SORTING_PAN_ROW__DELETED = DbSynchPackage.TABLE_ROW__DELETED;

	/**
	 * The feature id for the '<em><b>Index Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD_SORTING_PAN_ROW__INDEX_KEY = DbSynchPackage.TABLE_ROW__INDEX_KEY;

	/**
	 * The feature id for the '<em><b>Last Synch Down Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD_SORTING_PAN_ROW__LAST_SYNCH_DOWN_KEY = DbSynchPackage.TABLE_ROW__LAST_SYNCH_DOWN_KEY;

	/**
	 * The feature id for the '<em><b>Last Synch Down Deleted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD_SORTING_PAN_ROW__LAST_SYNCH_DOWN_DELETED = DbSynchPackage.TABLE_ROW__LAST_SYNCH_DOWN_DELETED;

	/**
	 * The feature id for the '<em><b>Modification Last Synch Up</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD_SORTING_PAN_ROW__MODIFICATION_LAST_SYNCH_UP = DbSynchPackage.TABLE_ROW__MODIFICATION_LAST_SYNCH_UP;

	/**
	 * The feature id for the '<em><b>Modification Next Synch Down</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD_SORTING_PAN_ROW__MODIFICATION_NEXT_SYNCH_DOWN = DbSynchPackage.TABLE_ROW__MODIFICATION_NEXT_SYNCH_DOWN;

	/**
	 * The feature id for the '<em><b>FPD Sorting Plan Table</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD_SORTING_PAN_ROW__FPD_SORTING_PLAN_TABLE = DbSynchPackage.TABLE_ROW_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>FPD Sorting Pan Row</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD_SORTING_PAN_ROW_FEATURE_COUNT = DbSynchPackage.TABLE_ROW_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD_SORTING_PAN_ROW___REFRESH = DbSynchPackage.TABLE_ROW___REFRESH;

	/**
	 * The number of operations of the '<em>FPD Sorting Pan Row</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD_SORTING_PAN_ROW_OPERATION_COUNT = DbSynchPackage.TABLE_ROW_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Synch Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD_SORTING_PLAN_TABLE__SYNCH_UNIT = DbSynchPackage.TABLE__SYNCH_UNIT;

	/**
	 * The feature id for the '<em><b>Columns</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD_SORTING_PLAN_TABLE__COLUMNS = DbSynchPackage.TABLE__COLUMNS;

	/**
	 * The feature id for the '<em><b>Key Columns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD_SORTING_PLAN_TABLE__KEY_COLUMNS = DbSynchPackage.TABLE__KEY_COLUMNS;

	/**
	 * The feature id for the '<em><b>Data Columns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD_SORTING_PLAN_TABLE__DATA_COLUMNS = DbSynchPackage.TABLE__DATA_COLUMNS;

	/**
	 * The feature id for the '<em><b>Table Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD_SORTING_PLAN_TABLE__TABLE_NAME = DbSynchPackage.TABLE__TABLE_NAME;

	/**
	 * The feature id for the '<em><b>Where Clause</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD_SORTING_PLAN_TABLE__WHERE_CLAUSE = DbSynchPackage.TABLE__WHERE_CLAUSE;

	/**
	 * The feature id for the '<em><b>Param Db Synch Unit Attributes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD_SORTING_PLAN_TABLE__PARAM_DB_SYNCH_UNIT_ATTRIBUTES = DbSynchPackage.TABLE__PARAM_DB_SYNCH_UNIT_ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Rows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD_SORTING_PLAN_TABLE__ROWS = DbSynchPackage.TABLE__ROWS;

	/**
	 * The feature id for the '<em><b>Select Sql Statement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD_SORTING_PLAN_TABLE__SELECT_SQL_STATEMENT = DbSynchPackage.TABLE__SELECT_SQL_STATEMENT;

	/**
	 * The feature id for the '<em><b>Insert Sql Statement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD_SORTING_PLAN_TABLE__INSERT_SQL_STATEMENT = DbSynchPackage.TABLE__INSERT_SQL_STATEMENT;

	/**
	 * The feature id for the '<em><b>Update Sql Statement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD_SORTING_PLAN_TABLE__UPDATE_SQL_STATEMENT = DbSynchPackage.TABLE__UPDATE_SQL_STATEMENT;

	/**
	 * The feature id for the '<em><b>Delete Sql Statement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD_SORTING_PLAN_TABLE__DELETE_SQL_STATEMENT = DbSynchPackage.TABLE__DELETE_SQL_STATEMENT;

	/**
	 * The feature id for the '<em><b>Number Of Rows</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD_SORTING_PLAN_TABLE__NUMBER_OF_ROWS = DbSynchPackage.TABLE__NUMBER_OF_ROWS;

	/**
	 * The feature id for the '<em><b>Last Synch Down</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD_SORTING_PLAN_TABLE__LAST_SYNCH_DOWN = DbSynchPackage.TABLE__LAST_SYNCH_DOWN;

	/**
	 * The feature id for the '<em><b>Last Synch Up</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD_SORTING_PLAN_TABLE__LAST_SYNCH_UP = DbSynchPackage.TABLE__LAST_SYNCH_UP;

	/**
	 * The feature id for the '<em><b>FPD Sorting Plans Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD_SORTING_PLAN_TABLE__FPD_SORTING_PLANS_SET = DbSynchPackage.TABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>FPD Sorting Plan Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD_SORTING_PLAN_TABLE_FEATURE_COUNT = DbSynchPackage.TABLE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Add Column</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD_SORTING_PLAN_TABLE___ADD_COLUMN__BOOLEAN_STRING_ENUMCOLUMNTYPE_EATTRIBUTE = DbSynchPackage.TABLE___ADD_COLUMN__BOOLEAN_STRING_ENUMCOLUMNTYPE_EATTRIBUTE;

	/**
	 * The operation id for the '<em>Add Param</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD_SORTING_PLAN_TABLE___ADD_PARAM__EATTRIBUTE = DbSynchPackage.TABLE___ADD_PARAM__EATTRIBUTE;

	/**
	 * The operation id for the '<em>Refresh Meta Data</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD_SORTING_PLAN_TABLE___REFRESH_META_DATA = DbSynchPackage.TABLE___REFRESH_META_DATA;

	/**
	 * The operation id for the '<em>Synch Down</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD_SORTING_PLAN_TABLE___SYNCH_DOWN = DbSynchPackage.TABLE___SYNCH_DOWN;

	/**
	 * The operation id for the '<em>Synch Up</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD_SORTING_PLAN_TABLE___SYNCH_UP = DbSynchPackage.TABLE___SYNCH_UP;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD_SORTING_PLAN_TABLE___REFRESH = DbSynchPackage.TABLE___REFRESH;

	/**
	 * The operation id for the '<em>Get Row</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD_SORTING_PLAN_TABLE___GET_ROW__TABLEROWKEYIMPL = DbSynchPackage.TABLE___GET_ROW__TABLEROWKEYIMPL;

	/**
	 * The operation id for the '<em>Construct Row</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD_SORTING_PLAN_TABLE___CONSTRUCT_ROW = DbSynchPackage.TABLE___CONSTRUCT_ROW;

	/**
	 * The operation id for the '<em>Index Row</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD_SORTING_PLAN_TABLE___INDEX_ROW__TABLEROW = DbSynchPackage.TABLE___INDEX_ROW__TABLEROW;

	/**
	 * The operation id for the '<em>Unindex Row</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD_SORTING_PLAN_TABLE___UNINDEX_ROW__TABLEROW = DbSynchPackage.TABLE___UNINDEX_ROW__TABLEROW;

	/**
	 * The operation id for the '<em>Refresh Index</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD_SORTING_PLAN_TABLE___REFRESH_INDEX = DbSynchPackage.TABLE___REFRESH_INDEX;

	/**
	 * The number of operations of the '<em>FPD Sorting Plan Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD_SORTING_PLAN_TABLE_OPERATION_COUNT = DbSynchPackage.TABLE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Synch Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASTER_DATA_TABLE__SYNCH_UNIT = DbSynchPackage.TABLE__SYNCH_UNIT;

	/**
	 * The feature id for the '<em><b>Columns</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASTER_DATA_TABLE__COLUMNS = DbSynchPackage.TABLE__COLUMNS;

	/**
	 * The feature id for the '<em><b>Key Columns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASTER_DATA_TABLE__KEY_COLUMNS = DbSynchPackage.TABLE__KEY_COLUMNS;

	/**
	 * The feature id for the '<em><b>Data Columns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASTER_DATA_TABLE__DATA_COLUMNS = DbSynchPackage.TABLE__DATA_COLUMNS;

	/**
	 * The feature id for the '<em><b>Table Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASTER_DATA_TABLE__TABLE_NAME = DbSynchPackage.TABLE__TABLE_NAME;

	/**
	 * The feature id for the '<em><b>Where Clause</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASTER_DATA_TABLE__WHERE_CLAUSE = DbSynchPackage.TABLE__WHERE_CLAUSE;

	/**
	 * The feature id for the '<em><b>Param Db Synch Unit Attributes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASTER_DATA_TABLE__PARAM_DB_SYNCH_UNIT_ATTRIBUTES = DbSynchPackage.TABLE__PARAM_DB_SYNCH_UNIT_ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Rows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASTER_DATA_TABLE__ROWS = DbSynchPackage.TABLE__ROWS;

	/**
	 * The feature id for the '<em><b>Select Sql Statement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASTER_DATA_TABLE__SELECT_SQL_STATEMENT = DbSynchPackage.TABLE__SELECT_SQL_STATEMENT;

	/**
	 * The feature id for the '<em><b>Insert Sql Statement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASTER_DATA_TABLE__INSERT_SQL_STATEMENT = DbSynchPackage.TABLE__INSERT_SQL_STATEMENT;

	/**
	 * The feature id for the '<em><b>Update Sql Statement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASTER_DATA_TABLE__UPDATE_SQL_STATEMENT = DbSynchPackage.TABLE__UPDATE_SQL_STATEMENT;

	/**
	 * The feature id for the '<em><b>Delete Sql Statement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASTER_DATA_TABLE__DELETE_SQL_STATEMENT = DbSynchPackage.TABLE__DELETE_SQL_STATEMENT;

	/**
	 * The feature id for the '<em><b>Number Of Rows</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASTER_DATA_TABLE__NUMBER_OF_ROWS = DbSynchPackage.TABLE__NUMBER_OF_ROWS;

	/**
	 * The feature id for the '<em><b>Last Synch Down</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASTER_DATA_TABLE__LAST_SYNCH_DOWN = DbSynchPackage.TABLE__LAST_SYNCH_DOWN;

	/**
	 * The feature id for the '<em><b>Last Synch Up</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASTER_DATA_TABLE__LAST_SYNCH_UP = DbSynchPackage.TABLE__LAST_SYNCH_UP;

	/**
	 * The number of structural features of the '<em>Master Data Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASTER_DATA_TABLE_FEATURE_COUNT = DbSynchPackage.TABLE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Add Column</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASTER_DATA_TABLE___ADD_COLUMN__BOOLEAN_STRING_ENUMCOLUMNTYPE_EATTRIBUTE = DbSynchPackage.TABLE___ADD_COLUMN__BOOLEAN_STRING_ENUMCOLUMNTYPE_EATTRIBUTE;

	/**
	 * The operation id for the '<em>Add Param</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASTER_DATA_TABLE___ADD_PARAM__EATTRIBUTE = DbSynchPackage.TABLE___ADD_PARAM__EATTRIBUTE;

	/**
	 * The operation id for the '<em>Refresh Meta Data</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASTER_DATA_TABLE___REFRESH_META_DATA = DbSynchPackage.TABLE___REFRESH_META_DATA;

	/**
	 * The operation id for the '<em>Synch Down</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASTER_DATA_TABLE___SYNCH_DOWN = DbSynchPackage.TABLE___SYNCH_DOWN;

	/**
	 * The operation id for the '<em>Synch Up</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASTER_DATA_TABLE___SYNCH_UP = DbSynchPackage.TABLE___SYNCH_UP;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASTER_DATA_TABLE___REFRESH = DbSynchPackage.TABLE___REFRESH;

	/**
	 * The operation id for the '<em>Get Row</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASTER_DATA_TABLE___GET_ROW__TABLEROWKEYIMPL = DbSynchPackage.TABLE___GET_ROW__TABLEROWKEYIMPL;

	/**
	 * The operation id for the '<em>Construct Row</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASTER_DATA_TABLE___CONSTRUCT_ROW = DbSynchPackage.TABLE___CONSTRUCT_ROW;

	/**
	 * The operation id for the '<em>Index Row</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASTER_DATA_TABLE___INDEX_ROW__TABLEROW = DbSynchPackage.TABLE___INDEX_ROW__TABLEROW;

	/**
	 * The operation id for the '<em>Unindex Row</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASTER_DATA_TABLE___UNINDEX_ROW__TABLEROW = DbSynchPackage.TABLE___UNINDEX_ROW__TABLEROW;

	/**
	 * The operation id for the '<em>Refresh Index</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASTER_DATA_TABLE___REFRESH_INDEX = DbSynchPackage.TABLE___REFRESH_INDEX;

	/**
	 * The number of operations of the '<em>Master Data Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASTER_DATA_TABLE_OPERATION_COUNT = DbSynchPackage.TABLE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Synch Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTING_LEVELS_TABLE__SYNCH_UNIT = MASTER_DATA_TABLE__SYNCH_UNIT;

	/**
	 * The feature id for the '<em><b>Columns</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTING_LEVELS_TABLE__COLUMNS = MASTER_DATA_TABLE__COLUMNS;

	/**
	 * The feature id for the '<em><b>Key Columns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTING_LEVELS_TABLE__KEY_COLUMNS = MASTER_DATA_TABLE__KEY_COLUMNS;

	/**
	 * The feature id for the '<em><b>Data Columns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTING_LEVELS_TABLE__DATA_COLUMNS = MASTER_DATA_TABLE__DATA_COLUMNS;

	/**
	 * The feature id for the '<em><b>Table Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTING_LEVELS_TABLE__TABLE_NAME = MASTER_DATA_TABLE__TABLE_NAME;

	/**
	 * The feature id for the '<em><b>Where Clause</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTING_LEVELS_TABLE__WHERE_CLAUSE = MASTER_DATA_TABLE__WHERE_CLAUSE;

	/**
	 * The feature id for the '<em><b>Param Db Synch Unit Attributes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTING_LEVELS_TABLE__PARAM_DB_SYNCH_UNIT_ATTRIBUTES = MASTER_DATA_TABLE__PARAM_DB_SYNCH_UNIT_ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Rows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTING_LEVELS_TABLE__ROWS = MASTER_DATA_TABLE__ROWS;

	/**
	 * The feature id for the '<em><b>Select Sql Statement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTING_LEVELS_TABLE__SELECT_SQL_STATEMENT = MASTER_DATA_TABLE__SELECT_SQL_STATEMENT;

	/**
	 * The feature id for the '<em><b>Insert Sql Statement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTING_LEVELS_TABLE__INSERT_SQL_STATEMENT = MASTER_DATA_TABLE__INSERT_SQL_STATEMENT;

	/**
	 * The feature id for the '<em><b>Update Sql Statement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTING_LEVELS_TABLE__UPDATE_SQL_STATEMENT = MASTER_DATA_TABLE__UPDATE_SQL_STATEMENT;

	/**
	 * The feature id for the '<em><b>Delete Sql Statement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTING_LEVELS_TABLE__DELETE_SQL_STATEMENT = MASTER_DATA_TABLE__DELETE_SQL_STATEMENT;

	/**
	 * The feature id for the '<em><b>Number Of Rows</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTING_LEVELS_TABLE__NUMBER_OF_ROWS = MASTER_DATA_TABLE__NUMBER_OF_ROWS;

	/**
	 * The feature id for the '<em><b>Last Synch Down</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTING_LEVELS_TABLE__LAST_SYNCH_DOWN = MASTER_DATA_TABLE__LAST_SYNCH_DOWN;

	/**
	 * The feature id for the '<em><b>Last Synch Up</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTING_LEVELS_TABLE__LAST_SYNCH_UP = MASTER_DATA_TABLE__LAST_SYNCH_UP;

	/**
	 * The feature id for the '<em><b>Sortinglevel Row</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTING_LEVELS_TABLE__SORTINGLEVEL_ROW = MASTER_DATA_TABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Sorting Levels Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTING_LEVELS_TABLE_FEATURE_COUNT = MASTER_DATA_TABLE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Add Column</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTING_LEVELS_TABLE___ADD_COLUMN__BOOLEAN_STRING_ENUMCOLUMNTYPE_EATTRIBUTE = MASTER_DATA_TABLE___ADD_COLUMN__BOOLEAN_STRING_ENUMCOLUMNTYPE_EATTRIBUTE;

	/**
	 * The operation id for the '<em>Add Param</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTING_LEVELS_TABLE___ADD_PARAM__EATTRIBUTE = MASTER_DATA_TABLE___ADD_PARAM__EATTRIBUTE;

	/**
	 * The operation id for the '<em>Refresh Meta Data</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTING_LEVELS_TABLE___REFRESH_META_DATA = MASTER_DATA_TABLE___REFRESH_META_DATA;

	/**
	 * The operation id for the '<em>Synch Down</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTING_LEVELS_TABLE___SYNCH_DOWN = MASTER_DATA_TABLE___SYNCH_DOWN;

	/**
	 * The operation id for the '<em>Synch Up</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTING_LEVELS_TABLE___SYNCH_UP = MASTER_DATA_TABLE___SYNCH_UP;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTING_LEVELS_TABLE___REFRESH = MASTER_DATA_TABLE___REFRESH;

	/**
	 * The operation id for the '<em>Get Row</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTING_LEVELS_TABLE___GET_ROW__TABLEROWKEYIMPL = MASTER_DATA_TABLE___GET_ROW__TABLEROWKEYIMPL;

	/**
	 * The operation id for the '<em>Construct Row</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTING_LEVELS_TABLE___CONSTRUCT_ROW = MASTER_DATA_TABLE___CONSTRUCT_ROW;

	/**
	 * The operation id for the '<em>Index Row</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTING_LEVELS_TABLE___INDEX_ROW__TABLEROW = MASTER_DATA_TABLE___INDEX_ROW__TABLEROW;

	/**
	 * The operation id for the '<em>Unindex Row</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTING_LEVELS_TABLE___UNINDEX_ROW__TABLEROW = MASTER_DATA_TABLE___UNINDEX_ROW__TABLEROW;

	/**
	 * The operation id for the '<em>Refresh Index</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTING_LEVELS_TABLE___REFRESH_INDEX = MASTER_DATA_TABLE___REFRESH_INDEX;

	/**
	 * The operation id for the '<em>Get Row</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTING_LEVELS_TABLE___GET_ROW__BIGDECIMAL = MASTER_DATA_TABLE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Sorting Levels Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTING_LEVELS_TABLE_OPERATION_COUNT = MASTER_DATA_TABLE_OPERATION_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Synch Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTING_PLANS_TABLE__SYNCH_UNIT = FPD_SORTING_PLAN_TABLE__SYNCH_UNIT;

	/**
	 * The feature id for the '<em><b>Columns</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTING_PLANS_TABLE__COLUMNS = FPD_SORTING_PLAN_TABLE__COLUMNS;

	/**
	 * The feature id for the '<em><b>Key Columns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTING_PLANS_TABLE__KEY_COLUMNS = FPD_SORTING_PLAN_TABLE__KEY_COLUMNS;

	/**
	 * The feature id for the '<em><b>Data Columns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTING_PLANS_TABLE__DATA_COLUMNS = FPD_SORTING_PLAN_TABLE__DATA_COLUMNS;

	/**
	 * The feature id for the '<em><b>Table Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTING_PLANS_TABLE__TABLE_NAME = FPD_SORTING_PLAN_TABLE__TABLE_NAME;

	/**
	 * The feature id for the '<em><b>Where Clause</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTING_PLANS_TABLE__WHERE_CLAUSE = FPD_SORTING_PLAN_TABLE__WHERE_CLAUSE;

	/**
	 * The feature id for the '<em><b>Param Db Synch Unit Attributes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTING_PLANS_TABLE__PARAM_DB_SYNCH_UNIT_ATTRIBUTES = FPD_SORTING_PLAN_TABLE__PARAM_DB_SYNCH_UNIT_ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Rows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTING_PLANS_TABLE__ROWS = FPD_SORTING_PLAN_TABLE__ROWS;

	/**
	 * The feature id for the '<em><b>Select Sql Statement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTING_PLANS_TABLE__SELECT_SQL_STATEMENT = FPD_SORTING_PLAN_TABLE__SELECT_SQL_STATEMENT;

	/**
	 * The feature id for the '<em><b>Insert Sql Statement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTING_PLANS_TABLE__INSERT_SQL_STATEMENT = FPD_SORTING_PLAN_TABLE__INSERT_SQL_STATEMENT;

	/**
	 * The feature id for the '<em><b>Update Sql Statement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTING_PLANS_TABLE__UPDATE_SQL_STATEMENT = FPD_SORTING_PLAN_TABLE__UPDATE_SQL_STATEMENT;

	/**
	 * The feature id for the '<em><b>Delete Sql Statement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTING_PLANS_TABLE__DELETE_SQL_STATEMENT = FPD_SORTING_PLAN_TABLE__DELETE_SQL_STATEMENT;

	/**
	 * The feature id for the '<em><b>Number Of Rows</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTING_PLANS_TABLE__NUMBER_OF_ROWS = FPD_SORTING_PLAN_TABLE__NUMBER_OF_ROWS;

	/**
	 * The feature id for the '<em><b>Last Synch Down</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTING_PLANS_TABLE__LAST_SYNCH_DOWN = FPD_SORTING_PLAN_TABLE__LAST_SYNCH_DOWN;

	/**
	 * The feature id for the '<em><b>Last Synch Up</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTING_PLANS_TABLE__LAST_SYNCH_UP = FPD_SORTING_PLAN_TABLE__LAST_SYNCH_UP;

	/**
	 * The feature id for the '<em><b>FPD Sorting Plans Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTING_PLANS_TABLE__FPD_SORTING_PLANS_SET = FPD_SORTING_PLAN_TABLE__FPD_SORTING_PLANS_SET;

	/**
	 * The feature id for the '<em><b>Sorting Plans Row</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTING_PLANS_TABLE__SORTING_PLANS_ROW = FPD_SORTING_PLAN_TABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Sorting Plans Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTING_PLANS_TABLE_FEATURE_COUNT = FPD_SORTING_PLAN_TABLE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Add Column</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTING_PLANS_TABLE___ADD_COLUMN__BOOLEAN_STRING_ENUMCOLUMNTYPE_EATTRIBUTE = FPD_SORTING_PLAN_TABLE___ADD_COLUMN__BOOLEAN_STRING_ENUMCOLUMNTYPE_EATTRIBUTE;

	/**
	 * The operation id for the '<em>Add Param</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTING_PLANS_TABLE___ADD_PARAM__EATTRIBUTE = FPD_SORTING_PLAN_TABLE___ADD_PARAM__EATTRIBUTE;

	/**
	 * The operation id for the '<em>Refresh Meta Data</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTING_PLANS_TABLE___REFRESH_META_DATA = FPD_SORTING_PLAN_TABLE___REFRESH_META_DATA;

	/**
	 * The operation id for the '<em>Synch Down</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTING_PLANS_TABLE___SYNCH_DOWN = FPD_SORTING_PLAN_TABLE___SYNCH_DOWN;

	/**
	 * The operation id for the '<em>Synch Up</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTING_PLANS_TABLE___SYNCH_UP = FPD_SORTING_PLAN_TABLE___SYNCH_UP;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTING_PLANS_TABLE___REFRESH = FPD_SORTING_PLAN_TABLE___REFRESH;

	/**
	 * The operation id for the '<em>Get Row</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTING_PLANS_TABLE___GET_ROW__TABLEROWKEYIMPL = FPD_SORTING_PLAN_TABLE___GET_ROW__TABLEROWKEYIMPL;

	/**
	 * The operation id for the '<em>Construct Row</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTING_PLANS_TABLE___CONSTRUCT_ROW = FPD_SORTING_PLAN_TABLE___CONSTRUCT_ROW;

	/**
	 * The operation id for the '<em>Index Row</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTING_PLANS_TABLE___INDEX_ROW__TABLEROW = FPD_SORTING_PLAN_TABLE___INDEX_ROW__TABLEROW;

	/**
	 * The operation id for the '<em>Unindex Row</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTING_PLANS_TABLE___UNINDEX_ROW__TABLEROW = FPD_SORTING_PLAN_TABLE___UNINDEX_ROW__TABLEROW;

	/**
	 * The operation id for the '<em>Refresh Index</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTING_PLANS_TABLE___REFRESH_INDEX = FPD_SORTING_PLAN_TABLE___REFRESH_INDEX;

	/**
	 * The operation id for the '<em>Get Row</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTING_PLANS_TABLE___GET_ROW__BIGDECIMAL = FPD_SORTING_PLAN_TABLE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Sorting Plans Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTING_PLANS_TABLE_OPERATION_COUNT = FPD_SORTING_PLAN_TABLE_OPERATION_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Synch Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTING_PLAN_INPUT_TABLE__SYNCH_UNIT = FPD_SORTING_PLAN_TABLE__SYNCH_UNIT;

	/**
	 * The feature id for the '<em><b>Columns</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTING_PLAN_INPUT_TABLE__COLUMNS = FPD_SORTING_PLAN_TABLE__COLUMNS;

	/**
	 * The feature id for the '<em><b>Key Columns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTING_PLAN_INPUT_TABLE__KEY_COLUMNS = FPD_SORTING_PLAN_TABLE__KEY_COLUMNS;

	/**
	 * The feature id for the '<em><b>Data Columns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTING_PLAN_INPUT_TABLE__DATA_COLUMNS = FPD_SORTING_PLAN_TABLE__DATA_COLUMNS;

	/**
	 * The feature id for the '<em><b>Table Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTING_PLAN_INPUT_TABLE__TABLE_NAME = FPD_SORTING_PLAN_TABLE__TABLE_NAME;

	/**
	 * The feature id for the '<em><b>Where Clause</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTING_PLAN_INPUT_TABLE__WHERE_CLAUSE = FPD_SORTING_PLAN_TABLE__WHERE_CLAUSE;

	/**
	 * The feature id for the '<em><b>Param Db Synch Unit Attributes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTING_PLAN_INPUT_TABLE__PARAM_DB_SYNCH_UNIT_ATTRIBUTES = FPD_SORTING_PLAN_TABLE__PARAM_DB_SYNCH_UNIT_ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Rows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTING_PLAN_INPUT_TABLE__ROWS = FPD_SORTING_PLAN_TABLE__ROWS;

	/**
	 * The feature id for the '<em><b>Select Sql Statement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTING_PLAN_INPUT_TABLE__SELECT_SQL_STATEMENT = FPD_SORTING_PLAN_TABLE__SELECT_SQL_STATEMENT;

	/**
	 * The feature id for the '<em><b>Insert Sql Statement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTING_PLAN_INPUT_TABLE__INSERT_SQL_STATEMENT = FPD_SORTING_PLAN_TABLE__INSERT_SQL_STATEMENT;

	/**
	 * The feature id for the '<em><b>Update Sql Statement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTING_PLAN_INPUT_TABLE__UPDATE_SQL_STATEMENT = FPD_SORTING_PLAN_TABLE__UPDATE_SQL_STATEMENT;

	/**
	 * The feature id for the '<em><b>Delete Sql Statement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTING_PLAN_INPUT_TABLE__DELETE_SQL_STATEMENT = FPD_SORTING_PLAN_TABLE__DELETE_SQL_STATEMENT;

	/**
	 * The feature id for the '<em><b>Number Of Rows</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTING_PLAN_INPUT_TABLE__NUMBER_OF_ROWS = FPD_SORTING_PLAN_TABLE__NUMBER_OF_ROWS;

	/**
	 * The feature id for the '<em><b>Last Synch Down</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTING_PLAN_INPUT_TABLE__LAST_SYNCH_DOWN = FPD_SORTING_PLAN_TABLE__LAST_SYNCH_DOWN;

	/**
	 * The feature id for the '<em><b>Last Synch Up</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTING_PLAN_INPUT_TABLE__LAST_SYNCH_UP = FPD_SORTING_PLAN_TABLE__LAST_SYNCH_UP;

	/**
	 * The feature id for the '<em><b>FPD Sorting Plans Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTING_PLAN_INPUT_TABLE__FPD_SORTING_PLANS_SET = FPD_SORTING_PLAN_TABLE__FPD_SORTING_PLANS_SET;

	/**
	 * The feature id for the '<em><b>Sorting Plan Input Row</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTING_PLAN_INPUT_TABLE__SORTING_PLAN_INPUT_ROW = FPD_SORTING_PLAN_TABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Sorting Plan Input Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTING_PLAN_INPUT_TABLE_FEATURE_COUNT = FPD_SORTING_PLAN_TABLE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Add Column</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTING_PLAN_INPUT_TABLE___ADD_COLUMN__BOOLEAN_STRING_ENUMCOLUMNTYPE_EATTRIBUTE = FPD_SORTING_PLAN_TABLE___ADD_COLUMN__BOOLEAN_STRING_ENUMCOLUMNTYPE_EATTRIBUTE;

	/**
	 * The operation id for the '<em>Add Param</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTING_PLAN_INPUT_TABLE___ADD_PARAM__EATTRIBUTE = FPD_SORTING_PLAN_TABLE___ADD_PARAM__EATTRIBUTE;

	/**
	 * The operation id for the '<em>Refresh Meta Data</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTING_PLAN_INPUT_TABLE___REFRESH_META_DATA = FPD_SORTING_PLAN_TABLE___REFRESH_META_DATA;

	/**
	 * The operation id for the '<em>Synch Down</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTING_PLAN_INPUT_TABLE___SYNCH_DOWN = FPD_SORTING_PLAN_TABLE___SYNCH_DOWN;

	/**
	 * The operation id for the '<em>Synch Up</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTING_PLAN_INPUT_TABLE___SYNCH_UP = FPD_SORTING_PLAN_TABLE___SYNCH_UP;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTING_PLAN_INPUT_TABLE___REFRESH = FPD_SORTING_PLAN_TABLE___REFRESH;

	/**
	 * The operation id for the '<em>Get Row</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTING_PLAN_INPUT_TABLE___GET_ROW__TABLEROWKEYIMPL = FPD_SORTING_PLAN_TABLE___GET_ROW__TABLEROWKEYIMPL;

	/**
	 * The operation id for the '<em>Construct Row</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTING_PLAN_INPUT_TABLE___CONSTRUCT_ROW = FPD_SORTING_PLAN_TABLE___CONSTRUCT_ROW;

	/**
	 * The operation id for the '<em>Index Row</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTING_PLAN_INPUT_TABLE___INDEX_ROW__TABLEROW = FPD_SORTING_PLAN_TABLE___INDEX_ROW__TABLEROW;

	/**
	 * The operation id for the '<em>Unindex Row</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTING_PLAN_INPUT_TABLE___UNINDEX_ROW__TABLEROW = FPD_SORTING_PLAN_TABLE___UNINDEX_ROW__TABLEROW;

	/**
	 * The operation id for the '<em>Refresh Index</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTING_PLAN_INPUT_TABLE___REFRESH_INDEX = FPD_SORTING_PLAN_TABLE___REFRESH_INDEX;

	/**
	 * The operation id for the '<em>Get Row</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTING_PLAN_INPUT_TABLE___GET_ROW__BIGDECIMAL_BIGDECIMAL_BIGDECIMAL_BIGDECIMAL = FPD_SORTING_PLAN_TABLE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Sorting Plan Input Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTING_PLAN_INPUT_TABLE_OPERATION_COUNT = FPD_SORTING_PLAN_TABLE_OPERATION_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Synch Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTING_PLAN_OUTPUT_TABLE__SYNCH_UNIT = FPD_SORTING_PLAN_TABLE__SYNCH_UNIT;

	/**
	 * The feature id for the '<em><b>Columns</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTING_PLAN_OUTPUT_TABLE__COLUMNS = FPD_SORTING_PLAN_TABLE__COLUMNS;

	/**
	 * The feature id for the '<em><b>Key Columns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTING_PLAN_OUTPUT_TABLE__KEY_COLUMNS = FPD_SORTING_PLAN_TABLE__KEY_COLUMNS;

	/**
	 * The feature id for the '<em><b>Data Columns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTING_PLAN_OUTPUT_TABLE__DATA_COLUMNS = FPD_SORTING_PLAN_TABLE__DATA_COLUMNS;

	/**
	 * The feature id for the '<em><b>Table Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTING_PLAN_OUTPUT_TABLE__TABLE_NAME = FPD_SORTING_PLAN_TABLE__TABLE_NAME;

	/**
	 * The feature id for the '<em><b>Where Clause</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTING_PLAN_OUTPUT_TABLE__WHERE_CLAUSE = FPD_SORTING_PLAN_TABLE__WHERE_CLAUSE;

	/**
	 * The feature id for the '<em><b>Param Db Synch Unit Attributes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTING_PLAN_OUTPUT_TABLE__PARAM_DB_SYNCH_UNIT_ATTRIBUTES = FPD_SORTING_PLAN_TABLE__PARAM_DB_SYNCH_UNIT_ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Rows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTING_PLAN_OUTPUT_TABLE__ROWS = FPD_SORTING_PLAN_TABLE__ROWS;

	/**
	 * The feature id for the '<em><b>Select Sql Statement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTING_PLAN_OUTPUT_TABLE__SELECT_SQL_STATEMENT = FPD_SORTING_PLAN_TABLE__SELECT_SQL_STATEMENT;

	/**
	 * The feature id for the '<em><b>Insert Sql Statement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTING_PLAN_OUTPUT_TABLE__INSERT_SQL_STATEMENT = FPD_SORTING_PLAN_TABLE__INSERT_SQL_STATEMENT;

	/**
	 * The feature id for the '<em><b>Update Sql Statement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTING_PLAN_OUTPUT_TABLE__UPDATE_SQL_STATEMENT = FPD_SORTING_PLAN_TABLE__UPDATE_SQL_STATEMENT;

	/**
	 * The feature id for the '<em><b>Delete Sql Statement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTING_PLAN_OUTPUT_TABLE__DELETE_SQL_STATEMENT = FPD_SORTING_PLAN_TABLE__DELETE_SQL_STATEMENT;

	/**
	 * The feature id for the '<em><b>Number Of Rows</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTING_PLAN_OUTPUT_TABLE__NUMBER_OF_ROWS = FPD_SORTING_PLAN_TABLE__NUMBER_OF_ROWS;

	/**
	 * The feature id for the '<em><b>Last Synch Down</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTING_PLAN_OUTPUT_TABLE__LAST_SYNCH_DOWN = FPD_SORTING_PLAN_TABLE__LAST_SYNCH_DOWN;

	/**
	 * The feature id for the '<em><b>Last Synch Up</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTING_PLAN_OUTPUT_TABLE__LAST_SYNCH_UP = FPD_SORTING_PLAN_TABLE__LAST_SYNCH_UP;

	/**
	 * The feature id for the '<em><b>FPD Sorting Plans Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTING_PLAN_OUTPUT_TABLE__FPD_SORTING_PLANS_SET = FPD_SORTING_PLAN_TABLE__FPD_SORTING_PLANS_SET;

	/**
	 * The feature id for the '<em><b>Sorting Plan Output Row</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTING_PLAN_OUTPUT_TABLE__SORTING_PLAN_OUTPUT_ROW = FPD_SORTING_PLAN_TABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Sorting Plan Output Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTING_PLAN_OUTPUT_TABLE_FEATURE_COUNT = FPD_SORTING_PLAN_TABLE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Add Column</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTING_PLAN_OUTPUT_TABLE___ADD_COLUMN__BOOLEAN_STRING_ENUMCOLUMNTYPE_EATTRIBUTE = FPD_SORTING_PLAN_TABLE___ADD_COLUMN__BOOLEAN_STRING_ENUMCOLUMNTYPE_EATTRIBUTE;

	/**
	 * The operation id for the '<em>Add Param</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTING_PLAN_OUTPUT_TABLE___ADD_PARAM__EATTRIBUTE = FPD_SORTING_PLAN_TABLE___ADD_PARAM__EATTRIBUTE;

	/**
	 * The operation id for the '<em>Refresh Meta Data</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTING_PLAN_OUTPUT_TABLE___REFRESH_META_DATA = FPD_SORTING_PLAN_TABLE___REFRESH_META_DATA;

	/**
	 * The operation id for the '<em>Synch Down</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTING_PLAN_OUTPUT_TABLE___SYNCH_DOWN = FPD_SORTING_PLAN_TABLE___SYNCH_DOWN;

	/**
	 * The operation id for the '<em>Synch Up</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTING_PLAN_OUTPUT_TABLE___SYNCH_UP = FPD_SORTING_PLAN_TABLE___SYNCH_UP;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTING_PLAN_OUTPUT_TABLE___REFRESH = FPD_SORTING_PLAN_TABLE___REFRESH;

	/**
	 * The operation id for the '<em>Get Row</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTING_PLAN_OUTPUT_TABLE___GET_ROW__TABLEROWKEYIMPL = FPD_SORTING_PLAN_TABLE___GET_ROW__TABLEROWKEYIMPL;

	/**
	 * The operation id for the '<em>Construct Row</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTING_PLAN_OUTPUT_TABLE___CONSTRUCT_ROW = FPD_SORTING_PLAN_TABLE___CONSTRUCT_ROW;

	/**
	 * The operation id for the '<em>Index Row</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTING_PLAN_OUTPUT_TABLE___INDEX_ROW__TABLEROW = FPD_SORTING_PLAN_TABLE___INDEX_ROW__TABLEROW;

	/**
	 * The operation id for the '<em>Unindex Row</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTING_PLAN_OUTPUT_TABLE___UNINDEX_ROW__TABLEROW = FPD_SORTING_PLAN_TABLE___UNINDEX_ROW__TABLEROW;

	/**
	 * The operation id for the '<em>Refresh Index</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTING_PLAN_OUTPUT_TABLE___REFRESH_INDEX = FPD_SORTING_PLAN_TABLE___REFRESH_INDEX;

	/**
	 * The operation id for the '<em>Get Row</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTING_PLAN_OUTPUT_TABLE___GET_ROW__BIGDECIMAL_BIGDECIMAL_BIGDECIMAL_BIGDECIMAL_BIGDECIMAL = FPD_SORTING_PLAN_TABLE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Sorting Plan Output Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTING_PLAN_OUTPUT_TABLE_OPERATION_COUNT = FPD_SORTING_PLAN_TABLE_OPERATION_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Table</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTING_LEVEL_ROW__TABLE = DbSynchPackage.TABLE_ROW__TABLE;

	/**
	 * The feature id for the '<em><b>Current Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTING_LEVEL_ROW__CURRENT_KEY = DbSynchPackage.TABLE_ROW__CURRENT_KEY;

	/**
	 * The feature id for the '<em><b>Deleted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTING_LEVEL_ROW__DELETED = DbSynchPackage.TABLE_ROW__DELETED;

	/**
	 * The feature id for the '<em><b>Index Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTING_LEVEL_ROW__INDEX_KEY = DbSynchPackage.TABLE_ROW__INDEX_KEY;

	/**
	 * The feature id for the '<em><b>Last Synch Down Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTING_LEVEL_ROW__LAST_SYNCH_DOWN_KEY = DbSynchPackage.TABLE_ROW__LAST_SYNCH_DOWN_KEY;

	/**
	 * The feature id for the '<em><b>Last Synch Down Deleted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTING_LEVEL_ROW__LAST_SYNCH_DOWN_DELETED = DbSynchPackage.TABLE_ROW__LAST_SYNCH_DOWN_DELETED;

	/**
	 * The feature id for the '<em><b>Modification Last Synch Up</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTING_LEVEL_ROW__MODIFICATION_LAST_SYNCH_UP = DbSynchPackage.TABLE_ROW__MODIFICATION_LAST_SYNCH_UP;

	/**
	 * The feature id for the '<em><b>Modification Next Synch Down</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTING_LEVEL_ROW__MODIFICATION_NEXT_SYNCH_DOWN = DbSynchPackage.TABLE_ROW__MODIFICATION_NEXT_SYNCH_DOWN;

	/**
	 * The feature id for the '<em><b>Sorting Level Sk</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTING_LEVEL_ROW__SORTING_LEVEL_SK = DbSynchPackage.TABLE_ROW_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Sorting Level Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTING_LEVEL_ROW__SORTING_LEVEL_NAME = DbSynchPackage.TABLE_ROW_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTING_LEVEL_ROW__DESCRIPTION = DbSynchPackage.TABLE_ROW_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Sorting Level Row</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTING_LEVEL_ROW_FEATURE_COUNT = DbSynchPackage.TABLE_ROW_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTING_LEVEL_ROW___REFRESH = DbSynchPackage.TABLE_ROW___REFRESH;

	/**
	 * The number of operations of the '<em>Sorting Level Row</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTING_LEVEL_ROW_OPERATION_COUNT = DbSynchPackage.TABLE_ROW_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Table</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTING_PLAN_ROW__TABLE = FPD_SORTING_PAN_ROW__TABLE;

	/**
	 * The feature id for the '<em><b>Current Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTING_PLAN_ROW__CURRENT_KEY = FPD_SORTING_PAN_ROW__CURRENT_KEY;

	/**
	 * The feature id for the '<em><b>Deleted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTING_PLAN_ROW__DELETED = FPD_SORTING_PAN_ROW__DELETED;

	/**
	 * The feature id for the '<em><b>Index Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTING_PLAN_ROW__INDEX_KEY = FPD_SORTING_PAN_ROW__INDEX_KEY;

	/**
	 * The feature id for the '<em><b>Last Synch Down Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTING_PLAN_ROW__LAST_SYNCH_DOWN_KEY = FPD_SORTING_PAN_ROW__LAST_SYNCH_DOWN_KEY;

	/**
	 * The feature id for the '<em><b>Last Synch Down Deleted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTING_PLAN_ROW__LAST_SYNCH_DOWN_DELETED = FPD_SORTING_PAN_ROW__LAST_SYNCH_DOWN_DELETED;

	/**
	 * The feature id for the '<em><b>Modification Last Synch Up</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTING_PLAN_ROW__MODIFICATION_LAST_SYNCH_UP = FPD_SORTING_PAN_ROW__MODIFICATION_LAST_SYNCH_UP;

	/**
	 * The feature id for the '<em><b>Modification Next Synch Down</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTING_PLAN_ROW__MODIFICATION_NEXT_SYNCH_DOWN = FPD_SORTING_PAN_ROW__MODIFICATION_NEXT_SYNCH_DOWN;

	/**
	 * The feature id for the '<em><b>FPD Sorting Plan Table</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTING_PLAN_ROW__FPD_SORTING_PLAN_TABLE = FPD_SORTING_PAN_ROW__FPD_SORTING_PLAN_TABLE;

	/**
	 * The feature id for the '<em><b>Sorting Plan Sk</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTING_PLAN_ROW__SORTING_PLAN_SK = FPD_SORTING_PAN_ROW_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Sorting Plan Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTING_PLAN_ROW__SORTING_PLAN_NAME = FPD_SORTING_PAN_ROW_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Sorting Level PLAGG Sk</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTING_PLAN_ROW__SORTING_LEVEL_PLAGG_SK = FPD_SORTING_PAN_ROW_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Inputs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTING_PLAN_ROW__INPUTS = FPD_SORTING_PAN_ROW_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Outputs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTING_PLAN_ROW__OUTPUTS = FPD_SORTING_PAN_ROW_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTING_PLAN_ROW__DESCRIPTION = FPD_SORTING_PAN_ROW_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Sorting Plan Row</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTING_PLAN_ROW_FEATURE_COUNT = FPD_SORTING_PAN_ROW_FEATURE_COUNT + 6;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTING_PLAN_ROW___REFRESH = FPD_SORTING_PAN_ROW___REFRESH;

	/**
	 * The number of operations of the '<em>Sorting Plan Row</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTING_PLAN_ROW_OPERATION_COUNT = FPD_SORTING_PAN_ROW_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Table</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTING_PLAN_OUTPUT_ROW__TABLE = FPD_SORTING_PAN_ROW__TABLE;

	/**
	 * The feature id for the '<em><b>Current Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTING_PLAN_OUTPUT_ROW__CURRENT_KEY = FPD_SORTING_PAN_ROW__CURRENT_KEY;

	/**
	 * The feature id for the '<em><b>Deleted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTING_PLAN_OUTPUT_ROW__DELETED = FPD_SORTING_PAN_ROW__DELETED;

	/**
	 * The feature id for the '<em><b>Index Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTING_PLAN_OUTPUT_ROW__INDEX_KEY = FPD_SORTING_PAN_ROW__INDEX_KEY;

	/**
	 * The feature id for the '<em><b>Last Synch Down Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTING_PLAN_OUTPUT_ROW__LAST_SYNCH_DOWN_KEY = FPD_SORTING_PAN_ROW__LAST_SYNCH_DOWN_KEY;

	/**
	 * The feature id for the '<em><b>Last Synch Down Deleted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTING_PLAN_OUTPUT_ROW__LAST_SYNCH_DOWN_DELETED = FPD_SORTING_PAN_ROW__LAST_SYNCH_DOWN_DELETED;

	/**
	 * The feature id for the '<em><b>Modification Last Synch Up</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTING_PLAN_OUTPUT_ROW__MODIFICATION_LAST_SYNCH_UP = FPD_SORTING_PAN_ROW__MODIFICATION_LAST_SYNCH_UP;

	/**
	 * The feature id for the '<em><b>Modification Next Synch Down</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTING_PLAN_OUTPUT_ROW__MODIFICATION_NEXT_SYNCH_DOWN = FPD_SORTING_PAN_ROW__MODIFICATION_NEXT_SYNCH_DOWN;

	/**
	 * The feature id for the '<em><b>FPD Sorting Plan Table</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTING_PLAN_OUTPUT_ROW__FPD_SORTING_PLAN_TABLE = FPD_SORTING_PAN_ROW__FPD_SORTING_PLAN_TABLE;

	/**
	 * The feature id for the '<em><b>Sorting Plan Sk</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTING_PLAN_OUTPUT_ROW__SORTING_PLAN_SK = FPD_SORTING_PAN_ROW_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Sorting Level AVCS Sk</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTING_PLAN_OUTPUT_ROW__SORTING_LEVEL_AVCS_SK = FPD_SORTING_PAN_ROW_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Mechanization Level Sk</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTING_PLAN_OUTPUT_ROW__MECHANIZATION_LEVEL_SK = FPD_SORTING_PAN_ROW_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Throughput Type Sk</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTING_PLAN_OUTPUT_ROW__THROUGHPUT_TYPE_SK = FPD_SORTING_PAN_ROW_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Destination Sk</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTING_PLAN_OUTPUT_ROW__DESTINATION_SK = FPD_SORTING_PAN_ROW_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Sorting Plan</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTING_PLAN_OUTPUT_ROW__SORTING_PLAN = FPD_SORTING_PAN_ROW_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Sorting Level</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTING_PLAN_OUTPUT_ROW__SORTING_LEVEL = FPD_SORTING_PAN_ROW_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTING_PLAN_OUTPUT_ROW__DESCRIPTION = FPD_SORTING_PAN_ROW_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Sorting Plan Output Row</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTING_PLAN_OUTPUT_ROW_FEATURE_COUNT = FPD_SORTING_PAN_ROW_FEATURE_COUNT + 8;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTING_PLAN_OUTPUT_ROW___REFRESH = FPD_SORTING_PAN_ROW___REFRESH;

	/**
	 * The number of operations of the '<em>Sorting Plan Output Row</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTING_PLAN_OUTPUT_ROW_OPERATION_COUNT = FPD_SORTING_PAN_ROW_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Table</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTING_PLAN_INPUT_ROW__TABLE = FPD_SORTING_PAN_ROW__TABLE;

	/**
	 * The feature id for the '<em><b>Current Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTING_PLAN_INPUT_ROW__CURRENT_KEY = FPD_SORTING_PAN_ROW__CURRENT_KEY;

	/**
	 * The feature id for the '<em><b>Deleted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTING_PLAN_INPUT_ROW__DELETED = FPD_SORTING_PAN_ROW__DELETED;

	/**
	 * The feature id for the '<em><b>Index Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTING_PLAN_INPUT_ROW__INDEX_KEY = FPD_SORTING_PAN_ROW__INDEX_KEY;

	/**
	 * The feature id for the '<em><b>Last Synch Down Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTING_PLAN_INPUT_ROW__LAST_SYNCH_DOWN_KEY = FPD_SORTING_PAN_ROW__LAST_SYNCH_DOWN_KEY;

	/**
	 * The feature id for the '<em><b>Last Synch Down Deleted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTING_PLAN_INPUT_ROW__LAST_SYNCH_DOWN_DELETED = FPD_SORTING_PAN_ROW__LAST_SYNCH_DOWN_DELETED;

	/**
	 * The feature id for the '<em><b>Modification Last Synch Up</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTING_PLAN_INPUT_ROW__MODIFICATION_LAST_SYNCH_UP = FPD_SORTING_PAN_ROW__MODIFICATION_LAST_SYNCH_UP;

	/**
	 * The feature id for the '<em><b>Modification Next Synch Down</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTING_PLAN_INPUT_ROW__MODIFICATION_NEXT_SYNCH_DOWN = FPD_SORTING_PAN_ROW__MODIFICATION_NEXT_SYNCH_DOWN;

	/**
	 * The feature id for the '<em><b>FPD Sorting Plan Table</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTING_PLAN_INPUT_ROW__FPD_SORTING_PLAN_TABLE = FPD_SORTING_PAN_ROW__FPD_SORTING_PLAN_TABLE;

	/**
	 * The feature id for the '<em><b>Sorting Plan Sk</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTING_PLAN_INPUT_ROW__SORTING_PLAN_SK = FPD_SORTING_PAN_ROW_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Sorting Level AVCS Sk</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTING_PLAN_INPUT_ROW__SORTING_LEVEL_AVCS_SK = FPD_SORTING_PAN_ROW_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Mechanization Level Sk</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTING_PLAN_INPUT_ROW__MECHANIZATION_LEVEL_SK = FPD_SORTING_PAN_ROW_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Throughput Type Sk</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTING_PLAN_INPUT_ROW__THROUGHPUT_TYPE_SK = FPD_SORTING_PAN_ROW_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Sorting Plan</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTING_PLAN_INPUT_ROW__SORTING_PLAN = FPD_SORTING_PAN_ROW_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Sorting Level</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTING_PLAN_INPUT_ROW__SORTING_LEVEL = FPD_SORTING_PAN_ROW_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTING_PLAN_INPUT_ROW__DESCRIPTION = FPD_SORTING_PAN_ROW_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Sorting Plan Input Row</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTING_PLAN_INPUT_ROW_FEATURE_COUNT = FPD_SORTING_PAN_ROW_FEATURE_COUNT + 7;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTING_PLAN_INPUT_ROW___REFRESH = FPD_SORTING_PAN_ROW___REFRESH;

	/**
	 * The number of operations of the '<em>Sorting Plan Input Row</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTING_PLAN_INPUT_ROW_OPERATION_COUNT = FPD_SORTING_PAN_ROW_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.misc.projects.CptDatasetLoad.impl.FPOImpl <em>FPO</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.projects.CptDatasetLoad.impl.FPOImpl
	 * @see com.misc.projects.CptDatasetLoad.impl.CptDatasetLoadPackageImpl#getFPO()
	 * @generated
	 */
	int FPO = 15;

	/**
	 * The feature id for the '<em><b>Tables</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPO__TABLES = DbsynchoraPackage.DATA_SOURCE_JDBC_ORA_THIN__TABLES;

	/**
	 * The feature id for the '<em><b>Data Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPO__DATA_SOURCE = DbsynchoraPackage.DATA_SOURCE_JDBC_ORA_THIN__DATA_SOURCE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPO__NAME = DbsynchoraPackage.DATA_SOURCE_JDBC_ORA_THIN__NAME;

	/**
	 * The feature id for the '<em><b>Child Units</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPO__CHILD_UNITS = DbsynchoraPackage.DATA_SOURCE_JDBC_ORA_THIN__CHILD_UNITS;

	/**
	 * The feature id for the '<em><b>Connected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPO__CONNECTED = DbsynchoraPackage.DATA_SOURCE_JDBC_ORA_THIN__CONNECTED;

	/**
	 * The feature id for the '<em><b>Data Base User</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPO__DATA_BASE_USER = DbsynchoraPackage.DATA_SOURCE_JDBC_ORA_THIN__DATA_BASE_USER;

	/**
	 * The feature id for the '<em><b>Data Base User Pwd</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPO__DATA_BASE_USER_PWD = DbsynchoraPackage.DATA_SOURCE_JDBC_ORA_THIN__DATA_BASE_USER_PWD;

	/**
	 * The feature id for the '<em><b>Default Schema</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPO__DEFAULT_SCHEMA = DbsynchoraPackage.DATA_SOURCE_JDBC_ORA_THIN__DEFAULT_SCHEMA;

	/**
	 * The feature id for the '<em><b>Host</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPO__HOST = DbsynchoraPackage.DATA_SOURCE_JDBC_ORA_THIN__HOST;

	/**
	 * The feature id for the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPO__PORT = DbsynchoraPackage.DATA_SOURCE_JDBC_ORA_THIN__PORT;

	/**
	 * The feature id for the '<em><b>Data Base</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPO__DATA_BASE = DbsynchoraPackage.DATA_SOURCE_JDBC_ORA_THIN__DATA_BASE;

	/**
	 * The feature id for the '<em><b>Forecast Uploads</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPO__FORECAST_UPLOADS = DbsynchoraPackage.DATA_SOURCE_JDBC_ORA_THIN_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>FPO</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPO_FEATURE_COUNT = DbsynchoraPackage.DATA_SOURCE_JDBC_ORA_THIN_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Refresh Meta Data</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPO___REFRESH_META_DATA = DbsynchoraPackage.DATA_SOURCE_JDBC_ORA_THIN___REFRESH_META_DATA;

	/**
	 * The operation id for the '<em>Synch Up</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPO___SYNCH_UP = DbsynchoraPackage.DATA_SOURCE_JDBC_ORA_THIN___SYNCH_UP;

	/**
	 * The operation id for the '<em>Synch Down</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPO___SYNCH_DOWN = DbsynchoraPackage.DATA_SOURCE_JDBC_ORA_THIN___SYNCH_DOWN;

	/**
	 * The operation id for the '<em>Get Param Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPO___GET_PARAM_VALUE__EATTRIBUTE = DbsynchoraPackage.DATA_SOURCE_JDBC_ORA_THIN___GET_PARAM_VALUE__EATTRIBUTE;

	/**
	 * The operation id for the '<em>Get Param Attributes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPO___GET_PARAM_ATTRIBUTES = DbsynchoraPackage.DATA_SOURCE_JDBC_ORA_THIN___GET_PARAM_ATTRIBUTES;

	/**
	 * The operation id for the '<em>Connect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPO___CONNECT = DbsynchoraPackage.DATA_SOURCE_JDBC_ORA_THIN___CONNECT;

	/**
	 * The operation id for the '<em>Disconnect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPO___DISCONNECT = DbsynchoraPackage.DATA_SOURCE_JDBC_ORA_THIN___DISCONNECT;

	/**
	 * The operation id for the '<em>Synch Down Table Impl</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPO___SYNCH_DOWN_TABLE_IMPL__TABLE = DbsynchoraPackage.DATA_SOURCE_JDBC_ORA_THIN___SYNCH_DOWN_TABLE_IMPL__TABLE;

	/**
	 * The operation id for the '<em>Synch Up Table Impl</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPO___SYNCH_UP_TABLE_IMPL__TABLE = DbsynchoraPackage.DATA_SOURCE_JDBC_ORA_THIN___SYNCH_UP_TABLE_IMPL__TABLE;

	/**
	 * The number of operations of the '<em>FPO</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPO_OPERATION_COUNT = DbsynchoraPackage.DATA_SOURCE_JDBC_ORA_THIN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.misc.projects.CptDatasetLoad.impl.FPOForecastUploadImpl <em>FPO Forecast Upload</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.projects.CptDatasetLoad.impl.FPOForecastUploadImpl
	 * @see com.misc.projects.CptDatasetLoad.impl.CptDatasetLoadPackageImpl#getFPOForecastUpload()
	 * @generated
	 */
	int FPO_FORECAST_UPLOAD = 16;

	/**
	 * The feature id for the '<em><b>Table</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPO_FORECAST_UPLOAD__TABLE = DbSynchPackage.TABLE_ROW__TABLE;

	/**
	 * The feature id for the '<em><b>Current Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPO_FORECAST_UPLOAD__CURRENT_KEY = DbSynchPackage.TABLE_ROW__CURRENT_KEY;

	/**
	 * The feature id for the '<em><b>Deleted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPO_FORECAST_UPLOAD__DELETED = DbSynchPackage.TABLE_ROW__DELETED;

	/**
	 * The feature id for the '<em><b>Index Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPO_FORECAST_UPLOAD__INDEX_KEY = DbSynchPackage.TABLE_ROW__INDEX_KEY;

	/**
	 * The feature id for the '<em><b>Last Synch Down Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPO_FORECAST_UPLOAD__LAST_SYNCH_DOWN_KEY = DbSynchPackage.TABLE_ROW__LAST_SYNCH_DOWN_KEY;

	/**
	 * The feature id for the '<em><b>Last Synch Down Deleted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPO_FORECAST_UPLOAD__LAST_SYNCH_DOWN_DELETED = DbSynchPackage.TABLE_ROW__LAST_SYNCH_DOWN_DELETED;

	/**
	 * The feature id for the '<em><b>Modification Last Synch Up</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPO_FORECAST_UPLOAD__MODIFICATION_LAST_SYNCH_UP = DbSynchPackage.TABLE_ROW__MODIFICATION_LAST_SYNCH_UP;

	/**
	 * The feature id for the '<em><b>Modification Next Synch Down</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPO_FORECAST_UPLOAD__MODIFICATION_NEXT_SYNCH_DOWN = DbSynchPackage.TABLE_ROW__MODIFICATION_NEXT_SYNCH_DOWN;

	/**
	 * The feature id for the '<em><b>From Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPO_FORECAST_UPLOAD__FROM_DATE = DbSynchPackage.TABLE_ROW_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>To Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPO_FORECAST_UPLOAD__TO_DATE = DbSynchPackage.TABLE_ROW_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPO_FORECAST_UPLOAD__KIND = DbSynchPackage.TABLE_ROW_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Forecast Table</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPO_FORECAST_UPLOAD__FORECAST_TABLE = DbSynchPackage.TABLE_ROW_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>FPO Forecast Upload</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPO_FORECAST_UPLOAD_FEATURE_COUNT = DbSynchPackage.TABLE_ROW_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPO_FORECAST_UPLOAD___REFRESH = DbSynchPackage.TABLE_ROW___REFRESH;

	/**
	 * The number of operations of the '<em>FPO Forecast Upload</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPO_FORECAST_UPLOAD_OPERATION_COUNT = DbSynchPackage.TABLE_ROW_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.misc.projects.CptDatasetLoad.impl.FPOForecastBucketImpl <em>FPO Forecast Bucket</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.projects.CptDatasetLoad.impl.FPOForecastBucketImpl
	 * @see com.misc.projects.CptDatasetLoad.impl.CptDatasetLoadPackageImpl#getFPOForecastBucket()
	 * @generated
	 */
	int FPO_FORECAST_BUCKET = 17;

	/**
	 * The feature id for the '<em><b>Table</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPO_FORECAST_BUCKET__TABLE = DbSynchPackage.TABLE_ROW__TABLE;

	/**
	 * The feature id for the '<em><b>Current Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPO_FORECAST_BUCKET__CURRENT_KEY = DbSynchPackage.TABLE_ROW__CURRENT_KEY;

	/**
	 * The feature id for the '<em><b>Deleted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPO_FORECAST_BUCKET__DELETED = DbSynchPackage.TABLE_ROW__DELETED;

	/**
	 * The feature id for the '<em><b>Index Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPO_FORECAST_BUCKET__INDEX_KEY = DbSynchPackage.TABLE_ROW__INDEX_KEY;

	/**
	 * The feature id for the '<em><b>Last Synch Down Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPO_FORECAST_BUCKET__LAST_SYNCH_DOWN_KEY = DbSynchPackage.TABLE_ROW__LAST_SYNCH_DOWN_KEY;

	/**
	 * The feature id for the '<em><b>Last Synch Down Deleted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPO_FORECAST_BUCKET__LAST_SYNCH_DOWN_DELETED = DbSynchPackage.TABLE_ROW__LAST_SYNCH_DOWN_DELETED;

	/**
	 * The feature id for the '<em><b>Modification Last Synch Up</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPO_FORECAST_BUCKET__MODIFICATION_LAST_SYNCH_UP = DbSynchPackage.TABLE_ROW__MODIFICATION_LAST_SYNCH_UP;

	/**
	 * The feature id for the '<em><b>Modification Next Synch Down</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPO_FORECAST_BUCKET__MODIFICATION_NEXT_SYNCH_DOWN = DbSynchPackage.TABLE_ROW__MODIFICATION_NEXT_SYNCH_DOWN;

	/**
	 * The feature id for the '<em><b>Bucket Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPO_FORECAST_BUCKET__BUCKET_DATE = DbSynchPackage.TABLE_ROW_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Bucket Begin Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPO_FORECAST_BUCKET__BUCKET_BEGIN_TIME = DbSynchPackage.TABLE_ROW_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Bucket End Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPO_FORECAST_BUCKET__BUCKET_END_TIME = DbSynchPackage.TABLE_ROW_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Bucket Hour</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPO_FORECAST_BUCKET__BUCKET_HOUR = DbSynchPackage.TABLE_ROW_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Customer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPO_FORECAST_BUCKET__CUSTOMER = DbSynchPackage.TABLE_ROW_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>First Sorting Imc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPO_FORECAST_BUCKET__FIRST_SORTING_IMC = DbSynchPackage.TABLE_ROW_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Intake Channel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPO_FORECAST_BUCKET__INTAKE_CHANNEL = DbSynchPackage.TABLE_ROW_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Intake Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPO_FORECAST_BUCKET__INTAKE_LOCATION = DbSynchPackage.TABLE_ROW_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Day Plus</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPO_FORECAST_BUCKET__DAY_PLUS = DbSynchPackage.TABLE_ROW_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Throughput Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPO_FORECAST_BUCKET__THROUGHPUT_TYPE = DbSynchPackage.TABLE_ROW_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Mechanization Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPO_FORECAST_BUCKET__MECHANIZATION_LEVEL = DbSynchPackage.TABLE_ROW_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Sorting Level AGG</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPO_FORECAST_BUCKET__SORTING_LEVEL_AGG = DbSynchPackage.TABLE_ROW_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Volume</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPO_FORECAST_BUCKET__VOLUME = DbSynchPackage.TABLE_ROW_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Publication ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPO_FORECAST_BUCKET__PUBLICATION_ID = DbSynchPackage.TABLE_ROW_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Time Series ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPO_FORECAST_BUCKET__TIME_SERIES_ID = DbSynchPackage.TABLE_ROW_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Bucket ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPO_FORECAST_BUCKET__BUCKET_ID = DbSynchPackage.TABLE_ROW_FEATURE_COUNT + 15;

	/**
	 * The number of structural features of the '<em>FPO Forecast Bucket</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPO_FORECAST_BUCKET_FEATURE_COUNT = DbSynchPackage.TABLE_ROW_FEATURE_COUNT + 16;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPO_FORECAST_BUCKET___REFRESH = DbSynchPackage.TABLE_ROW___REFRESH;

	/**
	 * The number of operations of the '<em>FPO Forecast Bucket</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPO_FORECAST_BUCKET_OPERATION_COUNT = DbSynchPackage.TABLE_ROW_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.misc.projects.CptDatasetLoad.impl.FPOForecastBucketsImpl <em>FPO Forecast Buckets</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.projects.CptDatasetLoad.impl.FPOForecastBucketsImpl
	 * @see com.misc.projects.CptDatasetLoad.impl.CptDatasetLoadPackageImpl#getFPOForecastBuckets()
	 * @generated
	 */
	int FPO_FORECAST_BUCKETS = 18;

	/**
	 * The feature id for the '<em><b>Synch Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPO_FORECAST_BUCKETS__SYNCH_UNIT = DbSynchPackage.TABLE__SYNCH_UNIT;

	/**
	 * The feature id for the '<em><b>Columns</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPO_FORECAST_BUCKETS__COLUMNS = DbSynchPackage.TABLE__COLUMNS;

	/**
	 * The feature id for the '<em><b>Key Columns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPO_FORECAST_BUCKETS__KEY_COLUMNS = DbSynchPackage.TABLE__KEY_COLUMNS;

	/**
	 * The feature id for the '<em><b>Data Columns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPO_FORECAST_BUCKETS__DATA_COLUMNS = DbSynchPackage.TABLE__DATA_COLUMNS;

	/**
	 * The feature id for the '<em><b>Table Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPO_FORECAST_BUCKETS__TABLE_NAME = DbSynchPackage.TABLE__TABLE_NAME;

	/**
	 * The feature id for the '<em><b>Where Clause</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPO_FORECAST_BUCKETS__WHERE_CLAUSE = DbSynchPackage.TABLE__WHERE_CLAUSE;

	/**
	 * The feature id for the '<em><b>Param Db Synch Unit Attributes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPO_FORECAST_BUCKETS__PARAM_DB_SYNCH_UNIT_ATTRIBUTES = DbSynchPackage.TABLE__PARAM_DB_SYNCH_UNIT_ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Rows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPO_FORECAST_BUCKETS__ROWS = DbSynchPackage.TABLE__ROWS;

	/**
	 * The feature id for the '<em><b>Select Sql Statement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPO_FORECAST_BUCKETS__SELECT_SQL_STATEMENT = DbSynchPackage.TABLE__SELECT_SQL_STATEMENT;

	/**
	 * The feature id for the '<em><b>Insert Sql Statement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPO_FORECAST_BUCKETS__INSERT_SQL_STATEMENT = DbSynchPackage.TABLE__INSERT_SQL_STATEMENT;

	/**
	 * The feature id for the '<em><b>Update Sql Statement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPO_FORECAST_BUCKETS__UPDATE_SQL_STATEMENT = DbSynchPackage.TABLE__UPDATE_SQL_STATEMENT;

	/**
	 * The feature id for the '<em><b>Delete Sql Statement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPO_FORECAST_BUCKETS__DELETE_SQL_STATEMENT = DbSynchPackage.TABLE__DELETE_SQL_STATEMENT;

	/**
	 * The feature id for the '<em><b>Number Of Rows</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPO_FORECAST_BUCKETS__NUMBER_OF_ROWS = DbSynchPackage.TABLE__NUMBER_OF_ROWS;

	/**
	 * The feature id for the '<em><b>Last Synch Down</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPO_FORECAST_BUCKETS__LAST_SYNCH_DOWN = DbSynchPackage.TABLE__LAST_SYNCH_DOWN;

	/**
	 * The feature id for the '<em><b>Last Synch Up</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPO_FORECAST_BUCKETS__LAST_SYNCH_UP = DbSynchPackage.TABLE__LAST_SYNCH_UP;

	/**
	 * The feature id for the '<em><b>Forecast Rows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPO_FORECAST_BUCKETS__FORECAST_ROWS = DbSynchPackage.TABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>FPO Forecast Buckets</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPO_FORECAST_BUCKETS_FEATURE_COUNT = DbSynchPackage.TABLE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Add Column</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPO_FORECAST_BUCKETS___ADD_COLUMN__BOOLEAN_STRING_ENUMCOLUMNTYPE_EATTRIBUTE = DbSynchPackage.TABLE___ADD_COLUMN__BOOLEAN_STRING_ENUMCOLUMNTYPE_EATTRIBUTE;

	/**
	 * The operation id for the '<em>Add Param</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPO_FORECAST_BUCKETS___ADD_PARAM__EATTRIBUTE = DbSynchPackage.TABLE___ADD_PARAM__EATTRIBUTE;

	/**
	 * The operation id for the '<em>Refresh Meta Data</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPO_FORECAST_BUCKETS___REFRESH_META_DATA = DbSynchPackage.TABLE___REFRESH_META_DATA;

	/**
	 * The operation id for the '<em>Synch Down</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPO_FORECAST_BUCKETS___SYNCH_DOWN = DbSynchPackage.TABLE___SYNCH_DOWN;

	/**
	 * The operation id for the '<em>Synch Up</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPO_FORECAST_BUCKETS___SYNCH_UP = DbSynchPackage.TABLE___SYNCH_UP;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPO_FORECAST_BUCKETS___REFRESH = DbSynchPackage.TABLE___REFRESH;

	/**
	 * The operation id for the '<em>Get Row</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPO_FORECAST_BUCKETS___GET_ROW__TABLEROWKEYIMPL = DbSynchPackage.TABLE___GET_ROW__TABLEROWKEYIMPL;

	/**
	 * The operation id for the '<em>Construct Row</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPO_FORECAST_BUCKETS___CONSTRUCT_ROW = DbSynchPackage.TABLE___CONSTRUCT_ROW;

	/**
	 * The operation id for the '<em>Index Row</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPO_FORECAST_BUCKETS___INDEX_ROW__TABLEROW = DbSynchPackage.TABLE___INDEX_ROW__TABLEROW;

	/**
	 * The operation id for the '<em>Unindex Row</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPO_FORECAST_BUCKETS___UNINDEX_ROW__TABLEROW = DbSynchPackage.TABLE___UNINDEX_ROW__TABLEROW;

	/**
	 * The operation id for the '<em>Refresh Index</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPO_FORECAST_BUCKETS___REFRESH_INDEX = DbSynchPackage.TABLE___REFRESH_INDEX;

	/**
	 * The number of operations of the '<em>FPO Forecast Buckets</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPO_FORECAST_BUCKETS_OPERATION_COUNT = DbSynchPackage.TABLE_OPERATION_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link com.misc.projects.CptDatasetLoad.FPD <em>FPD</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>FPD</em>'.
	 * @see com.misc.projects.CptDatasetLoad.FPD
	 * @generated
	 */
	EClass getFPD();

	/**
	 * Returns the meta object for the containment reference '{@link com.misc.projects.CptDatasetLoad.FPD#getMasterData <em>Master Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Master Data</em>'.
	 * @see com.misc.projects.CptDatasetLoad.FPD#getMasterData()
	 * @see #getFPD()
	 * @generated
	 */
	EReference getFPD_MasterData();

	/**
	 * Returns the meta object for the containment reference list '{@link com.misc.projects.CptDatasetLoad.FPD#getSortingPlansSets <em>Sorting Plans Sets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sorting Plans Sets</em>'.
	 * @see com.misc.projects.CptDatasetLoad.FPD#getSortingPlansSets()
	 * @see #getFPD()
	 * @generated
	 */
	EReference getFPD_SortingPlansSets();

	/**
	 * Returns the meta object for class '{@link com.misc.projects.CptDatasetLoad.FPDSortingPlansSet <em>FPD Sorting Plans Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>FPD Sorting Plans Set</em>'.
	 * @see com.misc.projects.CptDatasetLoad.FPDSortingPlansSet
	 * @generated
	 */
	EClass getFPDSortingPlansSet();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.projects.CptDatasetLoad.FPDSortingPlansSet#getFromDate <em>From Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From Date</em>'.
	 * @see com.misc.projects.CptDatasetLoad.FPDSortingPlansSet#getFromDate()
	 * @see #getFPDSortingPlansSet()
	 * @generated
	 */
	EAttribute getFPDSortingPlansSet_FromDate();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.projects.CptDatasetLoad.FPDSortingPlansSet#getToDate <em>To Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>To Date</em>'.
	 * @see com.misc.projects.CptDatasetLoad.FPDSortingPlansSet#getToDate()
	 * @see #getFPDSortingPlansSet()
	 * @generated
	 */
	EAttribute getFPDSortingPlansSet_ToDate();

	/**
	 * Returns the meta object for the containment reference '{@link com.misc.projects.CptDatasetLoad.FPDSortingPlansSet#getSortingPlansTable <em>Sorting Plans Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sorting Plans Table</em>'.
	 * @see com.misc.projects.CptDatasetLoad.FPDSortingPlansSet#getSortingPlansTable()
	 * @see #getFPDSortingPlansSet()
	 * @generated
	 */
	EReference getFPDSortingPlansSet_SortingPlansTable();

	/**
	 * Returns the meta object for the containment reference '{@link com.misc.projects.CptDatasetLoad.FPDSortingPlansSet#getSortingPlanOutputsTable <em>Sorting Plan Outputs Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sorting Plan Outputs Table</em>'.
	 * @see com.misc.projects.CptDatasetLoad.FPDSortingPlansSet#getSortingPlanOutputsTable()
	 * @see #getFPDSortingPlansSet()
	 * @generated
	 */
	EReference getFPDSortingPlansSet_SortingPlanOutputsTable();

	/**
	 * Returns the meta object for the containment reference '{@link com.misc.projects.CptDatasetLoad.FPDSortingPlansSet#getSortingPlanInputsTable <em>Sorting Plan Inputs Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sorting Plan Inputs Table</em>'.
	 * @see com.misc.projects.CptDatasetLoad.FPDSortingPlansSet#getSortingPlanInputsTable()
	 * @see #getFPDSortingPlansSet()
	 * @generated
	 */
	EReference getFPDSortingPlansSet_SortingPlanInputsTable();

	/**
	 * Returns the meta object for class '{@link com.misc.projects.CptDatasetLoad.SortingPlansTable <em>Sorting Plans Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sorting Plans Table</em>'.
	 * @see com.misc.projects.CptDatasetLoad.SortingPlansTable
	 * @generated
	 */
	EClass getSortingPlansTable();

	/**
	 * Returns the meta object for the containment reference list '{@link com.misc.projects.CptDatasetLoad.SortingPlansTable#getSortingPlansRow <em>Sorting Plans Row</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sorting Plans Row</em>'.
	 * @see com.misc.projects.CptDatasetLoad.SortingPlansTable#getSortingPlansRow()
	 * @see #getSortingPlansTable()
	 * @generated
	 */
	EReference getSortingPlansTable_SortingPlansRow();

	/**
	 * Returns the meta object for the '{@link com.misc.projects.CptDatasetLoad.SortingPlansTable#getRow(java.math.BigDecimal) <em>Get Row</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Row</em>' operation.
	 * @see com.misc.projects.CptDatasetLoad.SortingPlansTable#getRow(java.math.BigDecimal)
	 * @generated
	 */
	EOperation getSortingPlansTable__GetRow__BigDecimal();

	/**
	 * Returns the meta object for class '{@link com.misc.projects.CptDatasetLoad.SortingPlanInputTable <em>Sorting Plan Input Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sorting Plan Input Table</em>'.
	 * @see com.misc.projects.CptDatasetLoad.SortingPlanInputTable
	 * @generated
	 */
	EClass getSortingPlanInputTable();

	/**
	 * Returns the meta object for the containment reference list '{@link com.misc.projects.CptDatasetLoad.SortingPlanInputTable#getSortingPlanInputRow <em>Sorting Plan Input Row</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sorting Plan Input Row</em>'.
	 * @see com.misc.projects.CptDatasetLoad.SortingPlanInputTable#getSortingPlanInputRow()
	 * @see #getSortingPlanInputTable()
	 * @generated
	 */
	EReference getSortingPlanInputTable_SortingPlanInputRow();

	/**
	 * Returns the meta object for the '{@link com.misc.projects.CptDatasetLoad.SortingPlanInputTable#getRow(java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal) <em>Get Row</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Row</em>' operation.
	 * @see com.misc.projects.CptDatasetLoad.SortingPlanInputTable#getRow(java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal)
	 * @generated
	 */
	EOperation getSortingPlanInputTable__GetRow__BigDecimal_BigDecimal_BigDecimal_BigDecimal();

	/**
	 * Returns the meta object for class '{@link com.misc.projects.CptDatasetLoad.SortingPlanRow <em>Sorting Plan Row</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sorting Plan Row</em>'.
	 * @see com.misc.projects.CptDatasetLoad.SortingPlanRow
	 * @generated
	 */
	EClass getSortingPlanRow();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.projects.CptDatasetLoad.SortingPlanRow#getSortingPlanSk <em>Sorting Plan Sk</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sorting Plan Sk</em>'.
	 * @see com.misc.projects.CptDatasetLoad.SortingPlanRow#getSortingPlanSk()
	 * @see #getSortingPlanRow()
	 * @generated
	 */
	EAttribute getSortingPlanRow_SortingPlanSk();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.projects.CptDatasetLoad.SortingPlanRow#getSortingPlanName <em>Sorting Plan Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sorting Plan Name</em>'.
	 * @see com.misc.projects.CptDatasetLoad.SortingPlanRow#getSortingPlanName()
	 * @see #getSortingPlanRow()
	 * @generated
	 */
	EAttribute getSortingPlanRow_SortingPlanName();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.projects.CptDatasetLoad.SortingPlanRow#getSortingLevelPLAGGSk <em>Sorting Level PLAGG Sk</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sorting Level PLAGG Sk</em>'.
	 * @see com.misc.projects.CptDatasetLoad.SortingPlanRow#getSortingLevelPLAGGSk()
	 * @see #getSortingPlanRow()
	 * @generated
	 */
	EAttribute getSortingPlanRow_SortingLevelPLAGGSk();

	/**
	 * Returns the meta object for the reference list '{@link com.misc.projects.CptDatasetLoad.SortingPlanRow#getInputs <em>Inputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Inputs</em>'.
	 * @see com.misc.projects.CptDatasetLoad.SortingPlanRow#getInputs()
	 * @see #getSortingPlanRow()
	 * @generated
	 */
	EReference getSortingPlanRow_Inputs();

	/**
	 * Returns the meta object for the reference list '{@link com.misc.projects.CptDatasetLoad.SortingPlanRow#getOutputs <em>Outputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Outputs</em>'.
	 * @see com.misc.projects.CptDatasetLoad.SortingPlanRow#getOutputs()
	 * @see #getSortingPlanRow()
	 * @generated
	 */
	EReference getSortingPlanRow_Outputs();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.projects.CptDatasetLoad.SortingPlanRow#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see com.misc.projects.CptDatasetLoad.SortingPlanRow#getDescription()
	 * @see #getSortingPlanRow()
	 * @generated
	 */
	EAttribute getSortingPlanRow_Description();

	/**
	 * Returns the meta object for class '{@link com.misc.projects.CptDatasetLoad.SortingPlanOutputTable <em>Sorting Plan Output Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sorting Plan Output Table</em>'.
	 * @see com.misc.projects.CptDatasetLoad.SortingPlanOutputTable
	 * @generated
	 */
	EClass getSortingPlanOutputTable();

	/**
	 * Returns the meta object for the containment reference list '{@link com.misc.projects.CptDatasetLoad.SortingPlanOutputTable#getSortingPlanOutputRow <em>Sorting Plan Output Row</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sorting Plan Output Row</em>'.
	 * @see com.misc.projects.CptDatasetLoad.SortingPlanOutputTable#getSortingPlanOutputRow()
	 * @see #getSortingPlanOutputTable()
	 * @generated
	 */
	EReference getSortingPlanOutputTable_SortingPlanOutputRow();

	/**
	 * Returns the meta object for the '{@link com.misc.projects.CptDatasetLoad.SortingPlanOutputTable#getRow(java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal) <em>Get Row</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Row</em>' operation.
	 * @see com.misc.projects.CptDatasetLoad.SortingPlanOutputTable#getRow(java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal)
	 * @generated
	 */
	EOperation getSortingPlanOutputTable__GetRow__BigDecimal_BigDecimal_BigDecimal_BigDecimal_BigDecimal();

	/**
	 * Returns the meta object for class '{@link com.misc.projects.CptDatasetLoad.SortingPlanOutputRow <em>Sorting Plan Output Row</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sorting Plan Output Row</em>'.
	 * @see com.misc.projects.CptDatasetLoad.SortingPlanOutputRow
	 * @generated
	 */
	EClass getSortingPlanOutputRow();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.projects.CptDatasetLoad.SortingPlanOutputRow#getSortingPlanSk <em>Sorting Plan Sk</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sorting Plan Sk</em>'.
	 * @see com.misc.projects.CptDatasetLoad.SortingPlanOutputRow#getSortingPlanSk()
	 * @see #getSortingPlanOutputRow()
	 * @generated
	 */
	EAttribute getSortingPlanOutputRow_SortingPlanSk();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.projects.CptDatasetLoad.SortingPlanOutputRow#getSortingLevelAVCSSk <em>Sorting Level AVCS Sk</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sorting Level AVCS Sk</em>'.
	 * @see com.misc.projects.CptDatasetLoad.SortingPlanOutputRow#getSortingLevelAVCSSk()
	 * @see #getSortingPlanOutputRow()
	 * @generated
	 */
	EAttribute getSortingPlanOutputRow_SortingLevelAVCSSk();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.projects.CptDatasetLoad.SortingPlanOutputRow#getMechanizationLevelSk <em>Mechanization Level Sk</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mechanization Level Sk</em>'.
	 * @see com.misc.projects.CptDatasetLoad.SortingPlanOutputRow#getMechanizationLevelSk()
	 * @see #getSortingPlanOutputRow()
	 * @generated
	 */
	EAttribute getSortingPlanOutputRow_MechanizationLevelSk();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.projects.CptDatasetLoad.SortingPlanOutputRow#getThroughputTypeSk <em>Throughput Type Sk</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Throughput Type Sk</em>'.
	 * @see com.misc.projects.CptDatasetLoad.SortingPlanOutputRow#getThroughputTypeSk()
	 * @see #getSortingPlanOutputRow()
	 * @generated
	 */
	EAttribute getSortingPlanOutputRow_ThroughputTypeSk();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.projects.CptDatasetLoad.SortingPlanOutputRow#getDestinationSk <em>Destination Sk</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Destination Sk</em>'.
	 * @see com.misc.projects.CptDatasetLoad.SortingPlanOutputRow#getDestinationSk()
	 * @see #getSortingPlanOutputRow()
	 * @generated
	 */
	EAttribute getSortingPlanOutputRow_DestinationSk();

	/**
	 * Returns the meta object for the reference '{@link com.misc.projects.CptDatasetLoad.SortingPlanOutputRow#getSortingPlan <em>Sorting Plan</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sorting Plan</em>'.
	 * @see com.misc.projects.CptDatasetLoad.SortingPlanOutputRow#getSortingPlan()
	 * @see #getSortingPlanOutputRow()
	 * @generated
	 */
	EReference getSortingPlanOutputRow_SortingPlan();

	/**
	 * Returns the meta object for the reference '{@link com.misc.projects.CptDatasetLoad.SortingPlanOutputRow#getSortingLevel <em>Sorting Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sorting Level</em>'.
	 * @see com.misc.projects.CptDatasetLoad.SortingPlanOutputRow#getSortingLevel()
	 * @see #getSortingPlanOutputRow()
	 * @generated
	 */
	EReference getSortingPlanOutputRow_SortingLevel();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.projects.CptDatasetLoad.SortingPlanOutputRow#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see com.misc.projects.CptDatasetLoad.SortingPlanOutputRow#getDescription()
	 * @see #getSortingPlanOutputRow()
	 * @generated
	 */
	EAttribute getSortingPlanOutputRow_Description();

	/**
	 * Returns the meta object for class '{@link com.misc.projects.CptDatasetLoad.SortingPlanInputRow <em>Sorting Plan Input Row</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sorting Plan Input Row</em>'.
	 * @see com.misc.projects.CptDatasetLoad.SortingPlanInputRow
	 * @generated
	 */
	EClass getSortingPlanInputRow();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.projects.CptDatasetLoad.SortingPlanInputRow#getSortingPlanSk <em>Sorting Plan Sk</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sorting Plan Sk</em>'.
	 * @see com.misc.projects.CptDatasetLoad.SortingPlanInputRow#getSortingPlanSk()
	 * @see #getSortingPlanInputRow()
	 * @generated
	 */
	EAttribute getSortingPlanInputRow_SortingPlanSk();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.projects.CptDatasetLoad.SortingPlanInputRow#getSortingLevelAVCSSk <em>Sorting Level AVCS Sk</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sorting Level AVCS Sk</em>'.
	 * @see com.misc.projects.CptDatasetLoad.SortingPlanInputRow#getSortingLevelAVCSSk()
	 * @see #getSortingPlanInputRow()
	 * @generated
	 */
	EAttribute getSortingPlanInputRow_SortingLevelAVCSSk();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.projects.CptDatasetLoad.SortingPlanInputRow#getMechanizationLevelSk <em>Mechanization Level Sk</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mechanization Level Sk</em>'.
	 * @see com.misc.projects.CptDatasetLoad.SortingPlanInputRow#getMechanizationLevelSk()
	 * @see #getSortingPlanInputRow()
	 * @generated
	 */
	EAttribute getSortingPlanInputRow_MechanizationLevelSk();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.projects.CptDatasetLoad.SortingPlanInputRow#getThroughputTypeSk <em>Throughput Type Sk</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Throughput Type Sk</em>'.
	 * @see com.misc.projects.CptDatasetLoad.SortingPlanInputRow#getThroughputTypeSk()
	 * @see #getSortingPlanInputRow()
	 * @generated
	 */
	EAttribute getSortingPlanInputRow_ThroughputTypeSk();

	/**
	 * Returns the meta object for the reference '{@link com.misc.projects.CptDatasetLoad.SortingPlanInputRow#getSortingPlan <em>Sorting Plan</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sorting Plan</em>'.
	 * @see com.misc.projects.CptDatasetLoad.SortingPlanInputRow#getSortingPlan()
	 * @see #getSortingPlanInputRow()
	 * @generated
	 */
	EReference getSortingPlanInputRow_SortingPlan();

	/**
	 * Returns the meta object for the reference '{@link com.misc.projects.CptDatasetLoad.SortingPlanInputRow#getSortingLevel <em>Sorting Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sorting Level</em>'.
	 * @see com.misc.projects.CptDatasetLoad.SortingPlanInputRow#getSortingLevel()
	 * @see #getSortingPlanInputRow()
	 * @generated
	 */
	EReference getSortingPlanInputRow_SortingLevel();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.projects.CptDatasetLoad.SortingPlanInputRow#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see com.misc.projects.CptDatasetLoad.SortingPlanInputRow#getDescription()
	 * @see #getSortingPlanInputRow()
	 * @generated
	 */
	EAttribute getSortingPlanInputRow_Description();

	/**
	 * Returns the meta object for class '{@link com.misc.projects.CptDatasetLoad.FPO <em>FPO</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>FPO</em>'.
	 * @see com.misc.projects.CptDatasetLoad.FPO
	 * @generated
	 */
	EClass getFPO();

	/**
	 * Returns the meta object for the containment reference list '{@link com.misc.projects.CptDatasetLoad.FPO#getForecastUploads <em>Forecast Uploads</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Forecast Uploads</em>'.
	 * @see com.misc.projects.CptDatasetLoad.FPO#getForecastUploads()
	 * @see #getFPO()
	 * @generated
	 */
	EReference getFPO_ForecastUploads();

	/**
	 * Returns the meta object for class '{@link com.misc.projects.CptDatasetLoad.FPOForecastUpload <em>FPO Forecast Upload</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>FPO Forecast Upload</em>'.
	 * @see com.misc.projects.CptDatasetLoad.FPOForecastUpload
	 * @generated
	 */
	EClass getFPOForecastUpload();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.projects.CptDatasetLoad.FPOForecastUpload#getFromDate <em>From Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From Date</em>'.
	 * @see com.misc.projects.CptDatasetLoad.FPOForecastUpload#getFromDate()
	 * @see #getFPOForecastUpload()
	 * @generated
	 */
	EAttribute getFPOForecastUpload_FromDate();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.projects.CptDatasetLoad.FPOForecastUpload#getToDate <em>To Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>To Date</em>'.
	 * @see com.misc.projects.CptDatasetLoad.FPOForecastUpload#getToDate()
	 * @see #getFPOForecastUpload()
	 * @generated
	 */
	EAttribute getFPOForecastUpload_ToDate();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.projects.CptDatasetLoad.FPOForecastUpload#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see com.misc.projects.CptDatasetLoad.FPOForecastUpload#getKind()
	 * @see #getFPOForecastUpload()
	 * @generated
	 */
	EAttribute getFPOForecastUpload_Kind();

	/**
	 * Returns the meta object for the containment reference '{@link com.misc.projects.CptDatasetLoad.FPOForecastUpload#getForecastTable <em>Forecast Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Forecast Table</em>'.
	 * @see com.misc.projects.CptDatasetLoad.FPOForecastUpload#getForecastTable()
	 * @see #getFPOForecastUpload()
	 * @generated
	 */
	EReference getFPOForecastUpload_ForecastTable();

	/**
	 * Returns the meta object for class '{@link com.misc.projects.CptDatasetLoad.FPOForecastBucket <em>FPO Forecast Bucket</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>FPO Forecast Bucket</em>'.
	 * @see com.misc.projects.CptDatasetLoad.FPOForecastBucket
	 * @generated
	 */
	EClass getFPOForecastBucket();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.projects.CptDatasetLoad.FPOForecastBucket#getBucketDate <em>Bucket Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bucket Date</em>'.
	 * @see com.misc.projects.CptDatasetLoad.FPOForecastBucket#getBucketDate()
	 * @see #getFPOForecastBucket()
	 * @generated
	 */
	EAttribute getFPOForecastBucket_BucketDate();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.projects.CptDatasetLoad.FPOForecastBucket#getBucketBeginTime <em>Bucket Begin Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bucket Begin Time</em>'.
	 * @see com.misc.projects.CptDatasetLoad.FPOForecastBucket#getBucketBeginTime()
	 * @see #getFPOForecastBucket()
	 * @generated
	 */
	EAttribute getFPOForecastBucket_BucketBeginTime();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.projects.CptDatasetLoad.FPOForecastBucket#getBucketEndTime <em>Bucket End Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bucket End Time</em>'.
	 * @see com.misc.projects.CptDatasetLoad.FPOForecastBucket#getBucketEndTime()
	 * @see #getFPOForecastBucket()
	 * @generated
	 */
	EAttribute getFPOForecastBucket_BucketEndTime();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.projects.CptDatasetLoad.FPOForecastBucket#getBucketHour <em>Bucket Hour</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bucket Hour</em>'.
	 * @see com.misc.projects.CptDatasetLoad.FPOForecastBucket#getBucketHour()
	 * @see #getFPOForecastBucket()
	 * @generated
	 */
	EAttribute getFPOForecastBucket_BucketHour();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.projects.CptDatasetLoad.FPOForecastBucket#getCustomer <em>Customer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Customer</em>'.
	 * @see com.misc.projects.CptDatasetLoad.FPOForecastBucket#getCustomer()
	 * @see #getFPOForecastBucket()
	 * @generated
	 */
	EAttribute getFPOForecastBucket_Customer();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.projects.CptDatasetLoad.FPOForecastBucket#getFirstSortingImc <em>First Sorting Imc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>First Sorting Imc</em>'.
	 * @see com.misc.projects.CptDatasetLoad.FPOForecastBucket#getFirstSortingImc()
	 * @see #getFPOForecastBucket()
	 * @generated
	 */
	EAttribute getFPOForecastBucket_FirstSortingImc();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.projects.CptDatasetLoad.FPOForecastBucket#getIntakeChannel <em>Intake Channel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Intake Channel</em>'.
	 * @see com.misc.projects.CptDatasetLoad.FPOForecastBucket#getIntakeChannel()
	 * @see #getFPOForecastBucket()
	 * @generated
	 */
	EAttribute getFPOForecastBucket_IntakeChannel();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.projects.CptDatasetLoad.FPOForecastBucket#getIntakeLocation <em>Intake Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Intake Location</em>'.
	 * @see com.misc.projects.CptDatasetLoad.FPOForecastBucket#getIntakeLocation()
	 * @see #getFPOForecastBucket()
	 * @generated
	 */
	EAttribute getFPOForecastBucket_IntakeLocation();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.projects.CptDatasetLoad.FPOForecastBucket#getDayPlus <em>Day Plus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Day Plus</em>'.
	 * @see com.misc.projects.CptDatasetLoad.FPOForecastBucket#getDayPlus()
	 * @see #getFPOForecastBucket()
	 * @generated
	 */
	EAttribute getFPOForecastBucket_DayPlus();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.projects.CptDatasetLoad.FPOForecastBucket#getThroughputType <em>Throughput Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Throughput Type</em>'.
	 * @see com.misc.projects.CptDatasetLoad.FPOForecastBucket#getThroughputType()
	 * @see #getFPOForecastBucket()
	 * @generated
	 */
	EAttribute getFPOForecastBucket_ThroughputType();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.projects.CptDatasetLoad.FPOForecastBucket#getMechanizationLevel <em>Mechanization Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mechanization Level</em>'.
	 * @see com.misc.projects.CptDatasetLoad.FPOForecastBucket#getMechanizationLevel()
	 * @see #getFPOForecastBucket()
	 * @generated
	 */
	EAttribute getFPOForecastBucket_MechanizationLevel();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.projects.CptDatasetLoad.FPOForecastBucket#getSortingLevelAGG <em>Sorting Level AGG</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sorting Level AGG</em>'.
	 * @see com.misc.projects.CptDatasetLoad.FPOForecastBucket#getSortingLevelAGG()
	 * @see #getFPOForecastBucket()
	 * @generated
	 */
	EAttribute getFPOForecastBucket_SortingLevelAGG();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.projects.CptDatasetLoad.FPOForecastBucket#getVolume <em>Volume</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Volume</em>'.
	 * @see com.misc.projects.CptDatasetLoad.FPOForecastBucket#getVolume()
	 * @see #getFPOForecastBucket()
	 * @generated
	 */
	EAttribute getFPOForecastBucket_Volume();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.projects.CptDatasetLoad.FPOForecastBucket#getPublicationID <em>Publication ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Publication ID</em>'.
	 * @see com.misc.projects.CptDatasetLoad.FPOForecastBucket#getPublicationID()
	 * @see #getFPOForecastBucket()
	 * @generated
	 */
	EAttribute getFPOForecastBucket_PublicationID();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.projects.CptDatasetLoad.FPOForecastBucket#getTimeSeriesID <em>Time Series ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time Series ID</em>'.
	 * @see com.misc.projects.CptDatasetLoad.FPOForecastBucket#getTimeSeriesID()
	 * @see #getFPOForecastBucket()
	 * @generated
	 */
	EAttribute getFPOForecastBucket_TimeSeriesID();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.projects.CptDatasetLoad.FPOForecastBucket#getBucketID <em>Bucket ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bucket ID</em>'.
	 * @see com.misc.projects.CptDatasetLoad.FPOForecastBucket#getBucketID()
	 * @see #getFPOForecastBucket()
	 * @generated
	 */
	EAttribute getFPOForecastBucket_BucketID();

	/**
	 * Returns the meta object for class '{@link com.misc.projects.CptDatasetLoad.FPOForecastBuckets <em>FPO Forecast Buckets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>FPO Forecast Buckets</em>'.
	 * @see com.misc.projects.CptDatasetLoad.FPOForecastBuckets
	 * @generated
	 */
	EClass getFPOForecastBuckets();

	/**
	 * Returns the meta object for the containment reference list '{@link com.misc.projects.CptDatasetLoad.FPOForecastBuckets#getForecastRows <em>Forecast Rows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Forecast Rows</em>'.
	 * @see com.misc.projects.CptDatasetLoad.FPOForecastBuckets#getForecastRows()
	 * @see #getFPOForecastBuckets()
	 * @generated
	 */
	EReference getFPOForecastBuckets_ForecastRows();

	/**
	 * Returns the meta object for class '{@link com.misc.projects.CptDatasetLoad.SortingLevelsTable <em>Sorting Levels Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sorting Levels Table</em>'.
	 * @see com.misc.projects.CptDatasetLoad.SortingLevelsTable
	 * @generated
	 */
	EClass getSortingLevelsTable();

	/**
	 * Returns the meta object for the containment reference list '{@link com.misc.projects.CptDatasetLoad.SortingLevelsTable#getSortinglevelRow <em>Sortinglevel Row</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sortinglevel Row</em>'.
	 * @see com.misc.projects.CptDatasetLoad.SortingLevelsTable#getSortinglevelRow()
	 * @see #getSortingLevelsTable()
	 * @generated
	 */
	EReference getSortingLevelsTable_SortinglevelRow();

	/**
	 * Returns the meta object for the '{@link com.misc.projects.CptDatasetLoad.SortingLevelsTable#getRow(java.math.BigDecimal) <em>Get Row</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Row</em>' operation.
	 * @see com.misc.projects.CptDatasetLoad.SortingLevelsTable#getRow(java.math.BigDecimal)
	 * @generated
	 */
	EOperation getSortingLevelsTable__GetRow__BigDecimal();

	/**
	 * Returns the meta object for class '{@link com.misc.projects.CptDatasetLoad.SortingLevelRow <em>Sorting Level Row</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sorting Level Row</em>'.
	 * @see com.misc.projects.CptDatasetLoad.SortingLevelRow
	 * @generated
	 */
	EClass getSortingLevelRow();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.projects.CptDatasetLoad.SortingLevelRow#getSortingLevelSk <em>Sorting Level Sk</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sorting Level Sk</em>'.
	 * @see com.misc.projects.CptDatasetLoad.SortingLevelRow#getSortingLevelSk()
	 * @see #getSortingLevelRow()
	 * @generated
	 */
	EAttribute getSortingLevelRow_SortingLevelSk();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.projects.CptDatasetLoad.SortingLevelRow#getSortingLevelName <em>Sorting Level Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sorting Level Name</em>'.
	 * @see com.misc.projects.CptDatasetLoad.SortingLevelRow#getSortingLevelName()
	 * @see #getSortingLevelRow()
	 * @generated
	 */
	EAttribute getSortingLevelRow_SortingLevelName();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.projects.CptDatasetLoad.SortingLevelRow#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see com.misc.projects.CptDatasetLoad.SortingLevelRow#getDescription()
	 * @see #getSortingLevelRow()
	 * @generated
	 */
	EAttribute getSortingLevelRow_Description();

	/**
	 * Returns the meta object for class '{@link com.misc.projects.CptDatasetLoad.FPDSortingPlanTable <em>FPD Sorting Plan Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>FPD Sorting Plan Table</em>'.
	 * @see com.misc.projects.CptDatasetLoad.FPDSortingPlanTable
	 * @generated
	 */
	EClass getFPDSortingPlanTable();

	/**
	 * Returns the meta object for the reference '{@link com.misc.projects.CptDatasetLoad.FPDSortingPlanTable#getFPDSortingPlansSet <em>FPD Sorting Plans Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>FPD Sorting Plans Set</em>'.
	 * @see com.misc.projects.CptDatasetLoad.FPDSortingPlanTable#getFPDSortingPlansSet()
	 * @see #getFPDSortingPlanTable()
	 * @generated
	 */
	EReference getFPDSortingPlanTable_FPDSortingPlansSet();

	/**
	 * Returns the meta object for class '{@link com.misc.projects.CptDatasetLoad.FPDSortingPanRow <em>FPD Sorting Pan Row</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>FPD Sorting Pan Row</em>'.
	 * @see com.misc.projects.CptDatasetLoad.FPDSortingPanRow
	 * @generated
	 */
	EClass getFPDSortingPanRow();

	/**
	 * Returns the meta object for the reference '{@link com.misc.projects.CptDatasetLoad.FPDSortingPanRow#getFPDSortingPlanTable <em>FPD Sorting Plan Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>FPD Sorting Plan Table</em>'.
	 * @see com.misc.projects.CptDatasetLoad.FPDSortingPanRow#getFPDSortingPlanTable()
	 * @see #getFPDSortingPanRow()
	 * @generated
	 */
	EReference getFPDSortingPanRow_FPDSortingPlanTable();

	/**
	 * Returns the meta object for class '{@link com.misc.projects.CptDatasetLoad.FPDMasterData <em>FPD Master Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>FPD Master Data</em>'.
	 * @see com.misc.projects.CptDatasetLoad.FPDMasterData
	 * @generated
	 */
	EClass getFPDMasterData();

	/**
	 * Returns the meta object for the containment reference '{@link com.misc.projects.CptDatasetLoad.FPDMasterData#getSortingLevelTable <em>Sorting Level Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sorting Level Table</em>'.
	 * @see com.misc.projects.CptDatasetLoad.FPDMasterData#getSortingLevelTable()
	 * @see #getFPDMasterData()
	 * @generated
	 */
	EReference getFPDMasterData_SortingLevelTable();

	/**
	 * Returns the meta object for class '{@link com.misc.projects.CptDatasetLoad.MasterDataTable <em>Master Data Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Master Data Table</em>'.
	 * @see com.misc.projects.CptDatasetLoad.MasterDataTable
	 * @generated
	 */
	EClass getMasterDataTable();

	/**
	 * Returns the meta object for class '{@link com.misc.projects.CptDatasetLoad.FPDTableGroup <em>FPD Table Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>FPD Table Group</em>'.
	 * @see com.misc.projects.CptDatasetLoad.FPDTableGroup
	 * @generated
	 */
	EClass getFPDTableGroup();

	/**
	 * Returns the meta object for the reference '{@link com.misc.projects.CptDatasetLoad.FPDTableGroup#getFPD <em>FPD</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>FPD</em>'.
	 * @see com.misc.projects.CptDatasetLoad.FPDTableGroup#getFPD()
	 * @see #getFPDTableGroup()
	 * @generated
	 */
	EReference getFPDTableGroup_FPD();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CptDatasetLoadFactory getCptDatasetLoadFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link com.misc.projects.CptDatasetLoad.impl.FPDImpl <em>FPD</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.projects.CptDatasetLoad.impl.FPDImpl
		 * @see com.misc.projects.CptDatasetLoad.impl.CptDatasetLoadPackageImpl#getFPD()
		 * @generated
		 */
		EClass FPD = eINSTANCE.getFPD();

		/**
		 * The meta object literal for the '<em><b>Master Data</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FPD__MASTER_DATA = eINSTANCE.getFPD_MasterData();

		/**
		 * The meta object literal for the '<em><b>Sorting Plans Sets</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FPD__SORTING_PLANS_SETS = eINSTANCE.getFPD_SortingPlansSets();

		/**
		 * The meta object literal for the '{@link com.misc.projects.CptDatasetLoad.impl.FPDSortingPlansSetImpl <em>FPD Sorting Plans Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.projects.CptDatasetLoad.impl.FPDSortingPlansSetImpl
		 * @see com.misc.projects.CptDatasetLoad.impl.CptDatasetLoadPackageImpl#getFPDSortingPlansSet()
		 * @generated
		 */
		EClass FPD_SORTING_PLANS_SET = eINSTANCE.getFPDSortingPlansSet();

		/**
		 * The meta object literal for the '<em><b>From Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FPD_SORTING_PLANS_SET__FROM_DATE = eINSTANCE.getFPDSortingPlansSet_FromDate();

		/**
		 * The meta object literal for the '<em><b>To Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FPD_SORTING_PLANS_SET__TO_DATE = eINSTANCE.getFPDSortingPlansSet_ToDate();

		/**
		 * The meta object literal for the '<em><b>Sorting Plans Table</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FPD_SORTING_PLANS_SET__SORTING_PLANS_TABLE = eINSTANCE.getFPDSortingPlansSet_SortingPlansTable();

		/**
		 * The meta object literal for the '<em><b>Sorting Plan Outputs Table</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FPD_SORTING_PLANS_SET__SORTING_PLAN_OUTPUTS_TABLE = eINSTANCE.getFPDSortingPlansSet_SortingPlanOutputsTable();

		/**
		 * The meta object literal for the '<em><b>Sorting Plan Inputs Table</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FPD_SORTING_PLANS_SET__SORTING_PLAN_INPUTS_TABLE = eINSTANCE.getFPDSortingPlansSet_SortingPlanInputsTable();

		/**
		 * The meta object literal for the '{@link com.misc.projects.CptDatasetLoad.impl.SortingPlansTableImpl <em>Sorting Plans Table</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.projects.CptDatasetLoad.impl.SortingPlansTableImpl
		 * @see com.misc.projects.CptDatasetLoad.impl.CptDatasetLoadPackageImpl#getSortingPlansTable()
		 * @generated
		 */
		EClass SORTING_PLANS_TABLE = eINSTANCE.getSortingPlansTable();

		/**
		 * The meta object literal for the '<em><b>Sorting Plans Row</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SORTING_PLANS_TABLE__SORTING_PLANS_ROW = eINSTANCE.getSortingPlansTable_SortingPlansRow();

		/**
		 * The meta object literal for the '<em><b>Get Row</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SORTING_PLANS_TABLE___GET_ROW__BIGDECIMAL = eINSTANCE.getSortingPlansTable__GetRow__BigDecimal();

		/**
		 * The meta object literal for the '{@link com.misc.projects.CptDatasetLoad.impl.SortingPlanInputTableImpl <em>Sorting Plan Input Table</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.projects.CptDatasetLoad.impl.SortingPlanInputTableImpl
		 * @see com.misc.projects.CptDatasetLoad.impl.CptDatasetLoadPackageImpl#getSortingPlanInputTable()
		 * @generated
		 */
		EClass SORTING_PLAN_INPUT_TABLE = eINSTANCE.getSortingPlanInputTable();

		/**
		 * The meta object literal for the '<em><b>Sorting Plan Input Row</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SORTING_PLAN_INPUT_TABLE__SORTING_PLAN_INPUT_ROW = eINSTANCE.getSortingPlanInputTable_SortingPlanInputRow();

		/**
		 * The meta object literal for the '<em><b>Get Row</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SORTING_PLAN_INPUT_TABLE___GET_ROW__BIGDECIMAL_BIGDECIMAL_BIGDECIMAL_BIGDECIMAL = eINSTANCE.getSortingPlanInputTable__GetRow__BigDecimal_BigDecimal_BigDecimal_BigDecimal();

		/**
		 * The meta object literal for the '{@link com.misc.projects.CptDatasetLoad.impl.SortingPlanRowImpl <em>Sorting Plan Row</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.projects.CptDatasetLoad.impl.SortingPlanRowImpl
		 * @see com.misc.projects.CptDatasetLoad.impl.CptDatasetLoadPackageImpl#getSortingPlanRow()
		 * @generated
		 */
		EClass SORTING_PLAN_ROW = eINSTANCE.getSortingPlanRow();

		/**
		 * The meta object literal for the '<em><b>Sorting Plan Sk</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SORTING_PLAN_ROW__SORTING_PLAN_SK = eINSTANCE.getSortingPlanRow_SortingPlanSk();

		/**
		 * The meta object literal for the '<em><b>Sorting Plan Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SORTING_PLAN_ROW__SORTING_PLAN_NAME = eINSTANCE.getSortingPlanRow_SortingPlanName();

		/**
		 * The meta object literal for the '<em><b>Sorting Level PLAGG Sk</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SORTING_PLAN_ROW__SORTING_LEVEL_PLAGG_SK = eINSTANCE.getSortingPlanRow_SortingLevelPLAGGSk();

		/**
		 * The meta object literal for the '<em><b>Inputs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SORTING_PLAN_ROW__INPUTS = eINSTANCE.getSortingPlanRow_Inputs();

		/**
		 * The meta object literal for the '<em><b>Outputs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SORTING_PLAN_ROW__OUTPUTS = eINSTANCE.getSortingPlanRow_Outputs();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SORTING_PLAN_ROW__DESCRIPTION = eINSTANCE.getSortingPlanRow_Description();

		/**
		 * The meta object literal for the '{@link com.misc.projects.CptDatasetLoad.impl.SortingPlanOutputTableImpl <em>Sorting Plan Output Table</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.projects.CptDatasetLoad.impl.SortingPlanOutputTableImpl
		 * @see com.misc.projects.CptDatasetLoad.impl.CptDatasetLoadPackageImpl#getSortingPlanOutputTable()
		 * @generated
		 */
		EClass SORTING_PLAN_OUTPUT_TABLE = eINSTANCE.getSortingPlanOutputTable();

		/**
		 * The meta object literal for the '<em><b>Sorting Plan Output Row</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SORTING_PLAN_OUTPUT_TABLE__SORTING_PLAN_OUTPUT_ROW = eINSTANCE.getSortingPlanOutputTable_SortingPlanOutputRow();

		/**
		 * The meta object literal for the '<em><b>Get Row</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SORTING_PLAN_OUTPUT_TABLE___GET_ROW__BIGDECIMAL_BIGDECIMAL_BIGDECIMAL_BIGDECIMAL_BIGDECIMAL = eINSTANCE.getSortingPlanOutputTable__GetRow__BigDecimal_BigDecimal_BigDecimal_BigDecimal_BigDecimal();

		/**
		 * The meta object literal for the '{@link com.misc.projects.CptDatasetLoad.impl.SortingPlanOutputRowImpl <em>Sorting Plan Output Row</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.projects.CptDatasetLoad.impl.SortingPlanOutputRowImpl
		 * @see com.misc.projects.CptDatasetLoad.impl.CptDatasetLoadPackageImpl#getSortingPlanOutputRow()
		 * @generated
		 */
		EClass SORTING_PLAN_OUTPUT_ROW = eINSTANCE.getSortingPlanOutputRow();

		/**
		 * The meta object literal for the '<em><b>Sorting Plan Sk</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SORTING_PLAN_OUTPUT_ROW__SORTING_PLAN_SK = eINSTANCE.getSortingPlanOutputRow_SortingPlanSk();

		/**
		 * The meta object literal for the '<em><b>Sorting Level AVCS Sk</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SORTING_PLAN_OUTPUT_ROW__SORTING_LEVEL_AVCS_SK = eINSTANCE.getSortingPlanOutputRow_SortingLevelAVCSSk();

		/**
		 * The meta object literal for the '<em><b>Mechanization Level Sk</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SORTING_PLAN_OUTPUT_ROW__MECHANIZATION_LEVEL_SK = eINSTANCE.getSortingPlanOutputRow_MechanizationLevelSk();

		/**
		 * The meta object literal for the '<em><b>Throughput Type Sk</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SORTING_PLAN_OUTPUT_ROW__THROUGHPUT_TYPE_SK = eINSTANCE.getSortingPlanOutputRow_ThroughputTypeSk();

		/**
		 * The meta object literal for the '<em><b>Destination Sk</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SORTING_PLAN_OUTPUT_ROW__DESTINATION_SK = eINSTANCE.getSortingPlanOutputRow_DestinationSk();

		/**
		 * The meta object literal for the '<em><b>Sorting Plan</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SORTING_PLAN_OUTPUT_ROW__SORTING_PLAN = eINSTANCE.getSortingPlanOutputRow_SortingPlan();

		/**
		 * The meta object literal for the '<em><b>Sorting Level</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SORTING_PLAN_OUTPUT_ROW__SORTING_LEVEL = eINSTANCE.getSortingPlanOutputRow_SortingLevel();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SORTING_PLAN_OUTPUT_ROW__DESCRIPTION = eINSTANCE.getSortingPlanOutputRow_Description();

		/**
		 * The meta object literal for the '{@link com.misc.projects.CptDatasetLoad.impl.SortingPlanInputRowImpl <em>Sorting Plan Input Row</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.projects.CptDatasetLoad.impl.SortingPlanInputRowImpl
		 * @see com.misc.projects.CptDatasetLoad.impl.CptDatasetLoadPackageImpl#getSortingPlanInputRow()
		 * @generated
		 */
		EClass SORTING_PLAN_INPUT_ROW = eINSTANCE.getSortingPlanInputRow();

		/**
		 * The meta object literal for the '<em><b>Sorting Plan Sk</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SORTING_PLAN_INPUT_ROW__SORTING_PLAN_SK = eINSTANCE.getSortingPlanInputRow_SortingPlanSk();

		/**
		 * The meta object literal for the '<em><b>Sorting Level AVCS Sk</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SORTING_PLAN_INPUT_ROW__SORTING_LEVEL_AVCS_SK = eINSTANCE.getSortingPlanInputRow_SortingLevelAVCSSk();

		/**
		 * The meta object literal for the '<em><b>Mechanization Level Sk</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SORTING_PLAN_INPUT_ROW__MECHANIZATION_LEVEL_SK = eINSTANCE.getSortingPlanInputRow_MechanizationLevelSk();

		/**
		 * The meta object literal for the '<em><b>Throughput Type Sk</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SORTING_PLAN_INPUT_ROW__THROUGHPUT_TYPE_SK = eINSTANCE.getSortingPlanInputRow_ThroughputTypeSk();

		/**
		 * The meta object literal for the '<em><b>Sorting Plan</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SORTING_PLAN_INPUT_ROW__SORTING_PLAN = eINSTANCE.getSortingPlanInputRow_SortingPlan();

		/**
		 * The meta object literal for the '<em><b>Sorting Level</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SORTING_PLAN_INPUT_ROW__SORTING_LEVEL = eINSTANCE.getSortingPlanInputRow_SortingLevel();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SORTING_PLAN_INPUT_ROW__DESCRIPTION = eINSTANCE.getSortingPlanInputRow_Description();

		/**
		 * The meta object literal for the '{@link com.misc.projects.CptDatasetLoad.impl.FPOImpl <em>FPO</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.projects.CptDatasetLoad.impl.FPOImpl
		 * @see com.misc.projects.CptDatasetLoad.impl.CptDatasetLoadPackageImpl#getFPO()
		 * @generated
		 */
		EClass FPO = eINSTANCE.getFPO();

		/**
		 * The meta object literal for the '<em><b>Forecast Uploads</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FPO__FORECAST_UPLOADS = eINSTANCE.getFPO_ForecastUploads();

		/**
		 * The meta object literal for the '{@link com.misc.projects.CptDatasetLoad.impl.FPOForecastUploadImpl <em>FPO Forecast Upload</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.projects.CptDatasetLoad.impl.FPOForecastUploadImpl
		 * @see com.misc.projects.CptDatasetLoad.impl.CptDatasetLoadPackageImpl#getFPOForecastUpload()
		 * @generated
		 */
		EClass FPO_FORECAST_UPLOAD = eINSTANCE.getFPOForecastUpload();

		/**
		 * The meta object literal for the '<em><b>From Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FPO_FORECAST_UPLOAD__FROM_DATE = eINSTANCE.getFPOForecastUpload_FromDate();

		/**
		 * The meta object literal for the '<em><b>To Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FPO_FORECAST_UPLOAD__TO_DATE = eINSTANCE.getFPOForecastUpload_ToDate();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FPO_FORECAST_UPLOAD__KIND = eINSTANCE.getFPOForecastUpload_Kind();

		/**
		 * The meta object literal for the '<em><b>Forecast Table</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FPO_FORECAST_UPLOAD__FORECAST_TABLE = eINSTANCE.getFPOForecastUpload_ForecastTable();

		/**
		 * The meta object literal for the '{@link com.misc.projects.CptDatasetLoad.impl.FPOForecastBucketImpl <em>FPO Forecast Bucket</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.projects.CptDatasetLoad.impl.FPOForecastBucketImpl
		 * @see com.misc.projects.CptDatasetLoad.impl.CptDatasetLoadPackageImpl#getFPOForecastBucket()
		 * @generated
		 */
		EClass FPO_FORECAST_BUCKET = eINSTANCE.getFPOForecastBucket();

		/**
		 * The meta object literal for the '<em><b>Bucket Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FPO_FORECAST_BUCKET__BUCKET_DATE = eINSTANCE.getFPOForecastBucket_BucketDate();

		/**
		 * The meta object literal for the '<em><b>Bucket Begin Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FPO_FORECAST_BUCKET__BUCKET_BEGIN_TIME = eINSTANCE.getFPOForecastBucket_BucketBeginTime();

		/**
		 * The meta object literal for the '<em><b>Bucket End Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FPO_FORECAST_BUCKET__BUCKET_END_TIME = eINSTANCE.getFPOForecastBucket_BucketEndTime();

		/**
		 * The meta object literal for the '<em><b>Bucket Hour</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FPO_FORECAST_BUCKET__BUCKET_HOUR = eINSTANCE.getFPOForecastBucket_BucketHour();

		/**
		 * The meta object literal for the '<em><b>Customer</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FPO_FORECAST_BUCKET__CUSTOMER = eINSTANCE.getFPOForecastBucket_Customer();

		/**
		 * The meta object literal for the '<em><b>First Sorting Imc</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FPO_FORECAST_BUCKET__FIRST_SORTING_IMC = eINSTANCE.getFPOForecastBucket_FirstSortingImc();

		/**
		 * The meta object literal for the '<em><b>Intake Channel</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FPO_FORECAST_BUCKET__INTAKE_CHANNEL = eINSTANCE.getFPOForecastBucket_IntakeChannel();

		/**
		 * The meta object literal for the '<em><b>Intake Location</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FPO_FORECAST_BUCKET__INTAKE_LOCATION = eINSTANCE.getFPOForecastBucket_IntakeLocation();

		/**
		 * The meta object literal for the '<em><b>Day Plus</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FPO_FORECAST_BUCKET__DAY_PLUS = eINSTANCE.getFPOForecastBucket_DayPlus();

		/**
		 * The meta object literal for the '<em><b>Throughput Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FPO_FORECAST_BUCKET__THROUGHPUT_TYPE = eINSTANCE.getFPOForecastBucket_ThroughputType();

		/**
		 * The meta object literal for the '<em><b>Mechanization Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FPO_FORECAST_BUCKET__MECHANIZATION_LEVEL = eINSTANCE.getFPOForecastBucket_MechanizationLevel();

		/**
		 * The meta object literal for the '<em><b>Sorting Level AGG</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FPO_FORECAST_BUCKET__SORTING_LEVEL_AGG = eINSTANCE.getFPOForecastBucket_SortingLevelAGG();

		/**
		 * The meta object literal for the '<em><b>Volume</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FPO_FORECAST_BUCKET__VOLUME = eINSTANCE.getFPOForecastBucket_Volume();

		/**
		 * The meta object literal for the '<em><b>Publication ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FPO_FORECAST_BUCKET__PUBLICATION_ID = eINSTANCE.getFPOForecastBucket_PublicationID();

		/**
		 * The meta object literal for the '<em><b>Time Series ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FPO_FORECAST_BUCKET__TIME_SERIES_ID = eINSTANCE.getFPOForecastBucket_TimeSeriesID();

		/**
		 * The meta object literal for the '<em><b>Bucket ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FPO_FORECAST_BUCKET__BUCKET_ID = eINSTANCE.getFPOForecastBucket_BucketID();

		/**
		 * The meta object literal for the '{@link com.misc.projects.CptDatasetLoad.impl.FPOForecastBucketsImpl <em>FPO Forecast Buckets</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.projects.CptDatasetLoad.impl.FPOForecastBucketsImpl
		 * @see com.misc.projects.CptDatasetLoad.impl.CptDatasetLoadPackageImpl#getFPOForecastBuckets()
		 * @generated
		 */
		EClass FPO_FORECAST_BUCKETS = eINSTANCE.getFPOForecastBuckets();

		/**
		 * The meta object literal for the '<em><b>Forecast Rows</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FPO_FORECAST_BUCKETS__FORECAST_ROWS = eINSTANCE.getFPOForecastBuckets_ForecastRows();

		/**
		 * The meta object literal for the '{@link com.misc.projects.CptDatasetLoad.impl.SortingLevelsTableImpl <em>Sorting Levels Table</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.projects.CptDatasetLoad.impl.SortingLevelsTableImpl
		 * @see com.misc.projects.CptDatasetLoad.impl.CptDatasetLoadPackageImpl#getSortingLevelsTable()
		 * @generated
		 */
		EClass SORTING_LEVELS_TABLE = eINSTANCE.getSortingLevelsTable();

		/**
		 * The meta object literal for the '<em><b>Sortinglevel Row</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SORTING_LEVELS_TABLE__SORTINGLEVEL_ROW = eINSTANCE.getSortingLevelsTable_SortinglevelRow();

		/**
		 * The meta object literal for the '<em><b>Get Row</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SORTING_LEVELS_TABLE___GET_ROW__BIGDECIMAL = eINSTANCE.getSortingLevelsTable__GetRow__BigDecimal();

		/**
		 * The meta object literal for the '{@link com.misc.projects.CptDatasetLoad.impl.SortingLevelRowImpl <em>Sorting Level Row</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.projects.CptDatasetLoad.impl.SortingLevelRowImpl
		 * @see com.misc.projects.CptDatasetLoad.impl.CptDatasetLoadPackageImpl#getSortingLevelRow()
		 * @generated
		 */
		EClass SORTING_LEVEL_ROW = eINSTANCE.getSortingLevelRow();

		/**
		 * The meta object literal for the '<em><b>Sorting Level Sk</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SORTING_LEVEL_ROW__SORTING_LEVEL_SK = eINSTANCE.getSortingLevelRow_SortingLevelSk();

		/**
		 * The meta object literal for the '<em><b>Sorting Level Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SORTING_LEVEL_ROW__SORTING_LEVEL_NAME = eINSTANCE.getSortingLevelRow_SortingLevelName();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SORTING_LEVEL_ROW__DESCRIPTION = eINSTANCE.getSortingLevelRow_Description();

		/**
		 * The meta object literal for the '{@link com.misc.projects.CptDatasetLoad.impl.FPDSortingPlanTableImpl <em>FPD Sorting Plan Table</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.projects.CptDatasetLoad.impl.FPDSortingPlanTableImpl
		 * @see com.misc.projects.CptDatasetLoad.impl.CptDatasetLoadPackageImpl#getFPDSortingPlanTable()
		 * @generated
		 */
		EClass FPD_SORTING_PLAN_TABLE = eINSTANCE.getFPDSortingPlanTable();

		/**
		 * The meta object literal for the '<em><b>FPD Sorting Plans Set</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FPD_SORTING_PLAN_TABLE__FPD_SORTING_PLANS_SET = eINSTANCE.getFPDSortingPlanTable_FPDSortingPlansSet();

		/**
		 * The meta object literal for the '{@link com.misc.projects.CptDatasetLoad.impl.FPDSortingPanRowImpl <em>FPD Sorting Pan Row</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.projects.CptDatasetLoad.impl.FPDSortingPanRowImpl
		 * @see com.misc.projects.CptDatasetLoad.impl.CptDatasetLoadPackageImpl#getFPDSortingPanRow()
		 * @generated
		 */
		EClass FPD_SORTING_PAN_ROW = eINSTANCE.getFPDSortingPanRow();

		/**
		 * The meta object literal for the '<em><b>FPD Sorting Plan Table</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FPD_SORTING_PAN_ROW__FPD_SORTING_PLAN_TABLE = eINSTANCE.getFPDSortingPanRow_FPDSortingPlanTable();

		/**
		 * The meta object literal for the '{@link com.misc.projects.CptDatasetLoad.impl.FPDMasterDataImpl <em>FPD Master Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.projects.CptDatasetLoad.impl.FPDMasterDataImpl
		 * @see com.misc.projects.CptDatasetLoad.impl.CptDatasetLoadPackageImpl#getFPDMasterData()
		 * @generated
		 */
		EClass FPD_MASTER_DATA = eINSTANCE.getFPDMasterData();

		/**
		 * The meta object literal for the '<em><b>Sorting Level Table</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FPD_MASTER_DATA__SORTING_LEVEL_TABLE = eINSTANCE.getFPDMasterData_SortingLevelTable();

		/**
		 * The meta object literal for the '{@link com.misc.projects.CptDatasetLoad.impl.MasterDataTableImpl <em>Master Data Table</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.projects.CptDatasetLoad.impl.MasterDataTableImpl
		 * @see com.misc.projects.CptDatasetLoad.impl.CptDatasetLoadPackageImpl#getMasterDataTable()
		 * @generated
		 */
		EClass MASTER_DATA_TABLE = eINSTANCE.getMasterDataTable();

		/**
		 * The meta object literal for the '{@link com.misc.projects.CptDatasetLoad.impl.FPDTableGroupImpl <em>FPD Table Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.projects.CptDatasetLoad.impl.FPDTableGroupImpl
		 * @see com.misc.projects.CptDatasetLoad.impl.CptDatasetLoadPackageImpl#getFPDTableGroup()
		 * @generated
		 */
		EClass FPD_TABLE_GROUP = eINSTANCE.getFPDTableGroup();

		/**
		 * The meta object literal for the '<em><b>FPD</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FPD_TABLE_GROUP__FPD = eINSTANCE.getFPDTableGroup_FPD();

	}

} //CptDatasetLoadPackage
