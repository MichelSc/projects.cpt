/**
 */
package com.misc.projects.Forecast;

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
 * @see com.misc.projects.Forecast.ForecastFactory
 * @model kind="package"
 * @generated
 */
public interface ForecastPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Forecast";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://com.misc.projects.cpt.forecast";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "cptfc";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ForecastPackage eINSTANCE = com.misc.projects.Forecast.impl.ForecastPackageImpl.init();

	/**
	 * The meta object id for the '{@link com.misc.projects.Forecast.impl.ScenarioImpl <em>Scenario</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.projects.Forecast.impl.ScenarioImpl
	 * @see com.misc.projects.Forecast.impl.ForecastPackageImpl#getScenario()
	 * @generated
	 */
	int SCENARIO = 0;

	/**
	 * The feature id for the '<em><b>Selections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO__SELECTIONS = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO__NAME = 1;

	/**
	 * The feature id for the '<em><b>Mappings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO__MAPPINGS = 2;

	/**
	 * The feature id for the '<em><b>Child Scenarios</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO__CHILD_SCENARIOS = 3;

	/**
	 * The feature id for the '<em><b>Mapping Results</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO__MAPPING_RESULTS = 4;

	/**
	 * The number of structural features of the '<em>Scenario</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Scenario</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.misc.projects.Forecast.impl.FPOForecastBucketsSelectionImpl <em>FPO Forecast Buckets Selection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.projects.Forecast.impl.FPOForecastBucketsSelectionImpl
	 * @see com.misc.projects.Forecast.impl.ForecastPackageImpl#getFPOForecastBucketsSelection()
	 * @generated
	 */
	int FPO_FORECAST_BUCKETS_SELECTION = 1;

	/**
	 * The feature id for the '<em><b>Upload</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPO_FORECAST_BUCKETS_SELECTION__UPLOAD = 0;

	/**
	 * The feature id for the '<em><b>Selected Buckets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPO_FORECAST_BUCKETS_SELECTION__SELECTED_BUCKETS = 1;

	/**
	 * The feature id for the '<em><b>Select Bucket Dates</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPO_FORECAST_BUCKETS_SELECTION__SELECT_BUCKET_DATES = 2;

	/**
	 * The feature id for the '<em><b>Select Throughput Types</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPO_FORECAST_BUCKETS_SELECTION__SELECT_THROUGHPUT_TYPES = 3;

	/**
	 * The feature id for the '<em><b>Select Mechanization Level</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPO_FORECAST_BUCKETS_SELECTION__SELECT_MECHANIZATION_LEVEL = 4;

	/**
	 * The feature id for the '<em><b>Select Sorting Level AG Gs</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPO_FORECAST_BUCKETS_SELECTION__SELECT_SORTING_LEVEL_AG_GS = 5;

	/**
	 * The feature id for the '<em><b>Select First Sorting IM Cs</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPO_FORECAST_BUCKETS_SELECTION__SELECT_FIRST_SORTING_IM_CS = 6;

	/**
	 * The feature id for the '<em><b>Selection Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPO_FORECAST_BUCKETS_SELECTION__SELECTION_SIZE = 7;

	/**
	 * The number of structural features of the '<em>FPO Forecast Buckets Selection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPO_FORECAST_BUCKETS_SELECTION_FEATURE_COUNT = 8;

	/**
	 * The operation id for the '<em>Is Selected</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPO_FORECAST_BUCKETS_SELECTION___IS_SELECTED__FPOFORECASTBUCKET = 0;

	/**
	 * The operation id for the '<em>Refresh Selected Buckets</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPO_FORECAST_BUCKETS_SELECTION___REFRESH_SELECTED_BUCKETS = 1;

	/**
	 * The operation id for the '<em>Sort Selected Buckets</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPO_FORECAST_BUCKETS_SELECTION___SORT_SELECTED_BUCKETS = 2;

	/**
	 * The number of operations of the '<em>FPO Forecast Buckets Selection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPO_FORECAST_BUCKETS_SELECTION_OPERATION_COUNT = 3;


	/**
	 * The meta object id for the '{@link com.misc.projects.Forecast.impl.SourceBucketImpl <em>Source Bucket</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.projects.Forecast.impl.SourceBucketImpl
	 * @see com.misc.projects.Forecast.impl.ForecastPackageImpl#getSourceBucket()
	 * @generated
	 */
	int SOURCE_BUCKET = 2;

	/**
	 * The feature id for the '<em><b>Bucket Begin Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_BUCKET__BUCKET_BEGIN_TIME = 0;

	/**
	 * The feature id for the '<em><b>Bucket End Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_BUCKET__BUCKET_END_TIME = 1;

	/**
	 * The feature id for the '<em><b>Volume</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_BUCKET__VOLUME = 2;

	/**
	 * The feature id for the '<em><b>Throughput Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_BUCKET__THROUGHPUT_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Sorting Level AVCS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_BUCKET__SORTING_LEVEL_AVCS = 4;

	/**
	 * The feature id for the '<em><b>Mechanization Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_BUCKET__MECHANIZATION_LEVEL = 5;

	/**
	 * The feature id for the '<em><b>Sorting Imc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_BUCKET__SORTING_IMC = 6;

	/**
	 * The feature id for the '<em><b>Delivery Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_BUCKET__DELIVERY_DATE = 7;

	/**
	 * The number of structural features of the '<em>Source Bucket</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_BUCKET_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Source Bucket</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_BUCKET_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.misc.projects.Forecast.impl.ForecastMappingImpl <em>Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.projects.Forecast.impl.ForecastMappingImpl
	 * @see com.misc.projects.Forecast.impl.ForecastPackageImpl#getForecastMapping()
	 * @generated
	 */
	int FORECAST_MAPPING = 3;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORECAST_MAPPING__ELEMENTS = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORECAST_MAPPING__NAME = 1;

	/**
	 * The number of structural features of the '<em>Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORECAST_MAPPING_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORECAST_MAPPING_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.misc.projects.Forecast.impl.ForecastMappingElementImpl <em>Mapping Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.projects.Forecast.impl.ForecastMappingElementImpl
	 * @see com.misc.projects.Forecast.impl.ForecastPackageImpl#getForecastMappingElement()
	 * @generated
	 */
	int FORECAST_MAPPING_ELEMENT = 4;

	/**
	 * The feature id for the '<em><b>From Customer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORECAST_MAPPING_ELEMENT__FROM_CUSTOMER = 0;

	/**
	 * The feature id for the '<em><b>From First Sorting Imc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORECAST_MAPPING_ELEMENT__FROM_FIRST_SORTING_IMC = 1;

	/**
	 * The feature id for the '<em><b>From Intake Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORECAST_MAPPING_ELEMENT__FROM_INTAKE_LOCATION = 2;

	/**
	 * The feature id for the '<em><b>From Sorting Level AGG</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORECAST_MAPPING_ELEMENT__FROM_SORTING_LEVEL_AGG = 3;

	/**
	 * The feature id for the '<em><b>To Sorting Imc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORECAST_MAPPING_ELEMENT__TO_SORTING_IMC = 4;

	/**
	 * The feature id for the '<em><b>To Sorting Level AVCS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORECAST_MAPPING_ELEMENT__TO_SORTING_LEVEL_AVCS = 5;

	/**
	 * The number of structural features of the '<em>Mapping Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORECAST_MAPPING_ELEMENT_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Mapping Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORECAST_MAPPING_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.misc.projects.Forecast.impl.MappingResultImpl <em>Mapping Result</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.projects.Forecast.impl.MappingResultImpl
	 * @see com.misc.projects.Forecast.impl.ForecastPackageImpl#getMappingResult()
	 * @generated
	 */
	int MAPPING_RESULT = 5;

	/**
	 * The feature id for the '<em><b>Forecast Mapping</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_RESULT__FORECAST_MAPPING = 0;

	/**
	 * The feature id for the '<em><b>Forecast Selection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_RESULT__FORECAST_SELECTION = 1;

	/**
	 * The feature id for the '<em><b>Sources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_RESULT__SOURCES = 2;

	/**
	 * The feature id for the '<em><b>Number Of Buckets Mapped</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_RESULT__NUMBER_OF_BUCKETS_MAPPED = 3;

	/**
	 * The feature id for the '<em><b>Number Of Buckets To Map</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_RESULT__NUMBER_OF_BUCKETS_TO_MAP = 4;

	/**
	 * The feature id for the '<em><b>Mapped</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_RESULT__MAPPED = 5;

	/**
	 * The number of structural features of the '<em>Mapping Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_RESULT_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Mapping Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_RESULT_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link com.misc.projects.Forecast.Scenario <em>Scenario</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scenario</em>'.
	 * @see com.misc.projects.Forecast.Scenario
	 * @generated
	 */
	EClass getScenario();

	/**
	 * Returns the meta object for the containment reference list '{@link com.misc.projects.Forecast.Scenario#getSelections <em>Selections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Selections</em>'.
	 * @see com.misc.projects.Forecast.Scenario#getSelections()
	 * @see #getScenario()
	 * @generated
	 */
	EReference getScenario_Selections();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.projects.Forecast.Scenario#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.misc.projects.Forecast.Scenario#getName()
	 * @see #getScenario()
	 * @generated
	 */
	EAttribute getScenario_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link com.misc.projects.Forecast.Scenario#getMappings <em>Mappings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Mappings</em>'.
	 * @see com.misc.projects.Forecast.Scenario#getMappings()
	 * @see #getScenario()
	 * @generated
	 */
	EReference getScenario_Mappings();

	/**
	 * Returns the meta object for the containment reference list '{@link com.misc.projects.Forecast.Scenario#getChildScenarios <em>Child Scenarios</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Child Scenarios</em>'.
	 * @see com.misc.projects.Forecast.Scenario#getChildScenarios()
	 * @see #getScenario()
	 * @generated
	 */
	EReference getScenario_ChildScenarios();

	/**
	 * Returns the meta object for the containment reference list '{@link com.misc.projects.Forecast.Scenario#getMappingResults <em>Mapping Results</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Mapping Results</em>'.
	 * @see com.misc.projects.Forecast.Scenario#getMappingResults()
	 * @see #getScenario()
	 * @generated
	 */
	EReference getScenario_MappingResults();

	/**
	 * Returns the meta object for class '{@link com.misc.projects.Forecast.FPOForecastBucketsSelection <em>FPO Forecast Buckets Selection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>FPO Forecast Buckets Selection</em>'.
	 * @see com.misc.projects.Forecast.FPOForecastBucketsSelection
	 * @generated
	 */
	EClass getFPOForecastBucketsSelection();

	/**
	 * Returns the meta object for the reference '{@link com.misc.projects.Forecast.FPOForecastBucketsSelection#getUpload <em>Upload</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Upload</em>'.
	 * @see com.misc.projects.Forecast.FPOForecastBucketsSelection#getUpload()
	 * @see #getFPOForecastBucketsSelection()
	 * @generated
	 */
	EReference getFPOForecastBucketsSelection_Upload();

	/**
	 * Returns the meta object for the reference list '{@link com.misc.projects.Forecast.FPOForecastBucketsSelection#getSelectedBuckets <em>Selected Buckets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Selected Buckets</em>'.
	 * @see com.misc.projects.Forecast.FPOForecastBucketsSelection#getSelectedBuckets()
	 * @see #getFPOForecastBucketsSelection()
	 * @generated
	 */
	EReference getFPOForecastBucketsSelection_SelectedBuckets();

	/**
	 * Returns the meta object for the attribute list '{@link com.misc.projects.Forecast.FPOForecastBucketsSelection#getSelectBucketDates <em>Select Bucket Dates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Select Bucket Dates</em>'.
	 * @see com.misc.projects.Forecast.FPOForecastBucketsSelection#getSelectBucketDates()
	 * @see #getFPOForecastBucketsSelection()
	 * @generated
	 */
	EAttribute getFPOForecastBucketsSelection_SelectBucketDates();

	/**
	 * Returns the meta object for the attribute list '{@link com.misc.projects.Forecast.FPOForecastBucketsSelection#getSelectThroughputTypes <em>Select Throughput Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Select Throughput Types</em>'.
	 * @see com.misc.projects.Forecast.FPOForecastBucketsSelection#getSelectThroughputTypes()
	 * @see #getFPOForecastBucketsSelection()
	 * @generated
	 */
	EAttribute getFPOForecastBucketsSelection_SelectThroughputTypes();

	/**
	 * Returns the meta object for the attribute list '{@link com.misc.projects.Forecast.FPOForecastBucketsSelection#getSelectMechanizationLevel <em>Select Mechanization Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Select Mechanization Level</em>'.
	 * @see com.misc.projects.Forecast.FPOForecastBucketsSelection#getSelectMechanizationLevel()
	 * @see #getFPOForecastBucketsSelection()
	 * @generated
	 */
	EAttribute getFPOForecastBucketsSelection_SelectMechanizationLevel();

	/**
	 * Returns the meta object for the attribute list '{@link com.misc.projects.Forecast.FPOForecastBucketsSelection#getSelectSortingLevelAGGs <em>Select Sorting Level AG Gs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Select Sorting Level AG Gs</em>'.
	 * @see com.misc.projects.Forecast.FPOForecastBucketsSelection#getSelectSortingLevelAGGs()
	 * @see #getFPOForecastBucketsSelection()
	 * @generated
	 */
	EAttribute getFPOForecastBucketsSelection_SelectSortingLevelAGGs();

	/**
	 * Returns the meta object for the attribute list '{@link com.misc.projects.Forecast.FPOForecastBucketsSelection#getSelectFirstSortingIMCs <em>Select First Sorting IM Cs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Select First Sorting IM Cs</em>'.
	 * @see com.misc.projects.Forecast.FPOForecastBucketsSelection#getSelectFirstSortingIMCs()
	 * @see #getFPOForecastBucketsSelection()
	 * @generated
	 */
	EAttribute getFPOForecastBucketsSelection_SelectFirstSortingIMCs();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.projects.Forecast.FPOForecastBucketsSelection#getSelectionSize <em>Selection Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Selection Size</em>'.
	 * @see com.misc.projects.Forecast.FPOForecastBucketsSelection#getSelectionSize()
	 * @see #getFPOForecastBucketsSelection()
	 * @generated
	 */
	EAttribute getFPOForecastBucketsSelection_SelectionSize();

	/**
	 * Returns the meta object for the '{@link com.misc.projects.Forecast.FPOForecastBucketsSelection#isSelected(com.misc.projects.CptDatasetLoad.FPOForecastBucket) <em>Is Selected</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Selected</em>' operation.
	 * @see com.misc.projects.Forecast.FPOForecastBucketsSelection#isSelected(com.misc.projects.CptDatasetLoad.FPOForecastBucket)
	 * @generated
	 */
	EOperation getFPOForecastBucketsSelection__IsSelected__FPOForecastBucket();

	/**
	 * Returns the meta object for the '{@link com.misc.projects.Forecast.FPOForecastBucketsSelection#refreshSelectedBuckets() <em>Refresh Selected Buckets</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Refresh Selected Buckets</em>' operation.
	 * @see com.misc.projects.Forecast.FPOForecastBucketsSelection#refreshSelectedBuckets()
	 * @generated
	 */
	EOperation getFPOForecastBucketsSelection__RefreshSelectedBuckets();

	/**
	 * Returns the meta object for the '{@link com.misc.projects.Forecast.FPOForecastBucketsSelection#sortSelectedBuckets() <em>Sort Selected Buckets</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Sort Selected Buckets</em>' operation.
	 * @see com.misc.projects.Forecast.FPOForecastBucketsSelection#sortSelectedBuckets()
	 * @generated
	 */
	EOperation getFPOForecastBucketsSelection__SortSelectedBuckets();

	/**
	 * Returns the meta object for class '{@link com.misc.projects.Forecast.SourceBucket <em>Source Bucket</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Source Bucket</em>'.
	 * @see com.misc.projects.Forecast.SourceBucket
	 * @generated
	 */
	EClass getSourceBucket();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.projects.Forecast.SourceBucket#getBucketBeginTime <em>Bucket Begin Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bucket Begin Time</em>'.
	 * @see com.misc.projects.Forecast.SourceBucket#getBucketBeginTime()
	 * @see #getSourceBucket()
	 * @generated
	 */
	EAttribute getSourceBucket_BucketBeginTime();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.projects.Forecast.SourceBucket#getBucketEndTime <em>Bucket End Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bucket End Time</em>'.
	 * @see com.misc.projects.Forecast.SourceBucket#getBucketEndTime()
	 * @see #getSourceBucket()
	 * @generated
	 */
	EAttribute getSourceBucket_BucketEndTime();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.projects.Forecast.SourceBucket#getVolume <em>Volume</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Volume</em>'.
	 * @see com.misc.projects.Forecast.SourceBucket#getVolume()
	 * @see #getSourceBucket()
	 * @generated
	 */
	EAttribute getSourceBucket_Volume();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.projects.Forecast.SourceBucket#getThroughputType <em>Throughput Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Throughput Type</em>'.
	 * @see com.misc.projects.Forecast.SourceBucket#getThroughputType()
	 * @see #getSourceBucket()
	 * @generated
	 */
	EAttribute getSourceBucket_ThroughputType();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.projects.Forecast.SourceBucket#getSortingLevelAVCS <em>Sorting Level AVCS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sorting Level AVCS</em>'.
	 * @see com.misc.projects.Forecast.SourceBucket#getSortingLevelAVCS()
	 * @see #getSourceBucket()
	 * @generated
	 */
	EAttribute getSourceBucket_SortingLevelAVCS();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.projects.Forecast.SourceBucket#getMechanizationLevel <em>Mechanization Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mechanization Level</em>'.
	 * @see com.misc.projects.Forecast.SourceBucket#getMechanizationLevel()
	 * @see #getSourceBucket()
	 * @generated
	 */
	EAttribute getSourceBucket_MechanizationLevel();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.projects.Forecast.SourceBucket#getSortingImc <em>Sorting Imc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sorting Imc</em>'.
	 * @see com.misc.projects.Forecast.SourceBucket#getSortingImc()
	 * @see #getSourceBucket()
	 * @generated
	 */
	EAttribute getSourceBucket_SortingImc();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.projects.Forecast.SourceBucket#getDeliveryDate <em>Delivery Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Delivery Date</em>'.
	 * @see com.misc.projects.Forecast.SourceBucket#getDeliveryDate()
	 * @see #getSourceBucket()
	 * @generated
	 */
	EAttribute getSourceBucket_DeliveryDate();

	/**
	 * Returns the meta object for class '{@link com.misc.projects.Forecast.ForecastMapping <em>Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mapping</em>'.
	 * @see com.misc.projects.Forecast.ForecastMapping
	 * @generated
	 */
	EClass getForecastMapping();

	/**
	 * Returns the meta object for the containment reference list '{@link com.misc.projects.Forecast.ForecastMapping#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see com.misc.projects.Forecast.ForecastMapping#getElements()
	 * @see #getForecastMapping()
	 * @generated
	 */
	EReference getForecastMapping_Elements();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.projects.Forecast.ForecastMapping#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.misc.projects.Forecast.ForecastMapping#getName()
	 * @see #getForecastMapping()
	 * @generated
	 */
	EAttribute getForecastMapping_Name();

	/**
	 * Returns the meta object for class '{@link com.misc.projects.Forecast.ForecastMappingElement <em>Mapping Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mapping Element</em>'.
	 * @see com.misc.projects.Forecast.ForecastMappingElement
	 * @generated
	 */
	EClass getForecastMappingElement();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.projects.Forecast.ForecastMappingElement#getFromCustomer <em>From Customer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From Customer</em>'.
	 * @see com.misc.projects.Forecast.ForecastMappingElement#getFromCustomer()
	 * @see #getForecastMappingElement()
	 * @generated
	 */
	EAttribute getForecastMappingElement_FromCustomer();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.projects.Forecast.ForecastMappingElement#getFromFirstSortingImc <em>From First Sorting Imc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From First Sorting Imc</em>'.
	 * @see com.misc.projects.Forecast.ForecastMappingElement#getFromFirstSortingImc()
	 * @see #getForecastMappingElement()
	 * @generated
	 */
	EAttribute getForecastMappingElement_FromFirstSortingImc();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.projects.Forecast.ForecastMappingElement#getFromIntakeLocation <em>From Intake Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From Intake Location</em>'.
	 * @see com.misc.projects.Forecast.ForecastMappingElement#getFromIntakeLocation()
	 * @see #getForecastMappingElement()
	 * @generated
	 */
	EAttribute getForecastMappingElement_FromIntakeLocation();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.projects.Forecast.ForecastMappingElement#getFromSortingLevelAGG <em>From Sorting Level AGG</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From Sorting Level AGG</em>'.
	 * @see com.misc.projects.Forecast.ForecastMappingElement#getFromSortingLevelAGG()
	 * @see #getForecastMappingElement()
	 * @generated
	 */
	EAttribute getForecastMappingElement_FromSortingLevelAGG();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.projects.Forecast.ForecastMappingElement#getToSortingImc <em>To Sorting Imc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>To Sorting Imc</em>'.
	 * @see com.misc.projects.Forecast.ForecastMappingElement#getToSortingImc()
	 * @see #getForecastMappingElement()
	 * @generated
	 */
	EAttribute getForecastMappingElement_ToSortingImc();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.projects.Forecast.ForecastMappingElement#getToSortingLevelAVCS <em>To Sorting Level AVCS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>To Sorting Level AVCS</em>'.
	 * @see com.misc.projects.Forecast.ForecastMappingElement#getToSortingLevelAVCS()
	 * @see #getForecastMappingElement()
	 * @generated
	 */
	EAttribute getForecastMappingElement_ToSortingLevelAVCS();

	/**
	 * Returns the meta object for class '{@link com.misc.projects.Forecast.MappingResult <em>Mapping Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mapping Result</em>'.
	 * @see com.misc.projects.Forecast.MappingResult
	 * @generated
	 */
	EClass getMappingResult();

	/**
	 * Returns the meta object for the reference '{@link com.misc.projects.Forecast.MappingResult#getForecastMapping <em>Forecast Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Forecast Mapping</em>'.
	 * @see com.misc.projects.Forecast.MappingResult#getForecastMapping()
	 * @see #getMappingResult()
	 * @generated
	 */
	EReference getMappingResult_ForecastMapping();

	/**
	 * Returns the meta object for the reference '{@link com.misc.projects.Forecast.MappingResult#getForecastSelection <em>Forecast Selection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Forecast Selection</em>'.
	 * @see com.misc.projects.Forecast.MappingResult#getForecastSelection()
	 * @see #getMappingResult()
	 * @generated
	 */
	EReference getMappingResult_ForecastSelection();

	/**
	 * Returns the meta object for the containment reference list '{@link com.misc.projects.Forecast.MappingResult#getSources <em>Sources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sources</em>'.
	 * @see com.misc.projects.Forecast.MappingResult#getSources()
	 * @see #getMappingResult()
	 * @generated
	 */
	EReference getMappingResult_Sources();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.projects.Forecast.MappingResult#getNumberOfBucketsMapped <em>Number Of Buckets Mapped</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Of Buckets Mapped</em>'.
	 * @see com.misc.projects.Forecast.MappingResult#getNumberOfBucketsMapped()
	 * @see #getMappingResult()
	 * @generated
	 */
	EAttribute getMappingResult_NumberOfBucketsMapped();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.projects.Forecast.MappingResult#getNumberOfBucketsToMap <em>Number Of Buckets To Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Of Buckets To Map</em>'.
	 * @see com.misc.projects.Forecast.MappingResult#getNumberOfBucketsToMap()
	 * @see #getMappingResult()
	 * @generated
	 */
	EAttribute getMappingResult_NumberOfBucketsToMap();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.projects.Forecast.MappingResult#getMapped <em>Mapped</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mapped</em>'.
	 * @see com.misc.projects.Forecast.MappingResult#getMapped()
	 * @see #getMappingResult()
	 * @generated
	 */
	EAttribute getMappingResult_Mapped();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ForecastFactory getForecastFactory();

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
		 * The meta object literal for the '{@link com.misc.projects.Forecast.impl.ScenarioImpl <em>Scenario</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.projects.Forecast.impl.ScenarioImpl
		 * @see com.misc.projects.Forecast.impl.ForecastPackageImpl#getScenario()
		 * @generated
		 */
		EClass SCENARIO = eINSTANCE.getScenario();

		/**
		 * The meta object literal for the '<em><b>Selections</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCENARIO__SELECTIONS = eINSTANCE.getScenario_Selections();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCENARIO__NAME = eINSTANCE.getScenario_Name();

		/**
		 * The meta object literal for the '<em><b>Mappings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCENARIO__MAPPINGS = eINSTANCE.getScenario_Mappings();

		/**
		 * The meta object literal for the '<em><b>Child Scenarios</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCENARIO__CHILD_SCENARIOS = eINSTANCE.getScenario_ChildScenarios();

		/**
		 * The meta object literal for the '<em><b>Mapping Results</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCENARIO__MAPPING_RESULTS = eINSTANCE.getScenario_MappingResults();

		/**
		 * The meta object literal for the '{@link com.misc.projects.Forecast.impl.FPOForecastBucketsSelectionImpl <em>FPO Forecast Buckets Selection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.projects.Forecast.impl.FPOForecastBucketsSelectionImpl
		 * @see com.misc.projects.Forecast.impl.ForecastPackageImpl#getFPOForecastBucketsSelection()
		 * @generated
		 */
		EClass FPO_FORECAST_BUCKETS_SELECTION = eINSTANCE.getFPOForecastBucketsSelection();

		/**
		 * The meta object literal for the '<em><b>Upload</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FPO_FORECAST_BUCKETS_SELECTION__UPLOAD = eINSTANCE.getFPOForecastBucketsSelection_Upload();

		/**
		 * The meta object literal for the '<em><b>Selected Buckets</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FPO_FORECAST_BUCKETS_SELECTION__SELECTED_BUCKETS = eINSTANCE.getFPOForecastBucketsSelection_SelectedBuckets();

		/**
		 * The meta object literal for the '<em><b>Select Bucket Dates</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FPO_FORECAST_BUCKETS_SELECTION__SELECT_BUCKET_DATES = eINSTANCE.getFPOForecastBucketsSelection_SelectBucketDates();

		/**
		 * The meta object literal for the '<em><b>Select Throughput Types</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FPO_FORECAST_BUCKETS_SELECTION__SELECT_THROUGHPUT_TYPES = eINSTANCE.getFPOForecastBucketsSelection_SelectThroughputTypes();

		/**
		 * The meta object literal for the '<em><b>Select Mechanization Level</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FPO_FORECAST_BUCKETS_SELECTION__SELECT_MECHANIZATION_LEVEL = eINSTANCE.getFPOForecastBucketsSelection_SelectMechanizationLevel();

		/**
		 * The meta object literal for the '<em><b>Select Sorting Level AG Gs</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FPO_FORECAST_BUCKETS_SELECTION__SELECT_SORTING_LEVEL_AG_GS = eINSTANCE.getFPOForecastBucketsSelection_SelectSortingLevelAGGs();

		/**
		 * The meta object literal for the '<em><b>Select First Sorting IM Cs</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FPO_FORECAST_BUCKETS_SELECTION__SELECT_FIRST_SORTING_IM_CS = eINSTANCE.getFPOForecastBucketsSelection_SelectFirstSortingIMCs();

		/**
		 * The meta object literal for the '<em><b>Selection Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FPO_FORECAST_BUCKETS_SELECTION__SELECTION_SIZE = eINSTANCE.getFPOForecastBucketsSelection_SelectionSize();

		/**
		 * The meta object literal for the '<em><b>Is Selected</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation FPO_FORECAST_BUCKETS_SELECTION___IS_SELECTED__FPOFORECASTBUCKET = eINSTANCE.getFPOForecastBucketsSelection__IsSelected__FPOForecastBucket();

		/**
		 * The meta object literal for the '<em><b>Refresh Selected Buckets</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation FPO_FORECAST_BUCKETS_SELECTION___REFRESH_SELECTED_BUCKETS = eINSTANCE.getFPOForecastBucketsSelection__RefreshSelectedBuckets();

		/**
		 * The meta object literal for the '<em><b>Sort Selected Buckets</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation FPO_FORECAST_BUCKETS_SELECTION___SORT_SELECTED_BUCKETS = eINSTANCE.getFPOForecastBucketsSelection__SortSelectedBuckets();

		/**
		 * The meta object literal for the '{@link com.misc.projects.Forecast.impl.SourceBucketImpl <em>Source Bucket</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.projects.Forecast.impl.SourceBucketImpl
		 * @see com.misc.projects.Forecast.impl.ForecastPackageImpl#getSourceBucket()
		 * @generated
		 */
		EClass SOURCE_BUCKET = eINSTANCE.getSourceBucket();

		/**
		 * The meta object literal for the '<em><b>Bucket Begin Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOURCE_BUCKET__BUCKET_BEGIN_TIME = eINSTANCE.getSourceBucket_BucketBeginTime();

		/**
		 * The meta object literal for the '<em><b>Bucket End Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOURCE_BUCKET__BUCKET_END_TIME = eINSTANCE.getSourceBucket_BucketEndTime();

		/**
		 * The meta object literal for the '<em><b>Volume</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOURCE_BUCKET__VOLUME = eINSTANCE.getSourceBucket_Volume();

		/**
		 * The meta object literal for the '<em><b>Throughput Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOURCE_BUCKET__THROUGHPUT_TYPE = eINSTANCE.getSourceBucket_ThroughputType();

		/**
		 * The meta object literal for the '<em><b>Sorting Level AVCS</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOURCE_BUCKET__SORTING_LEVEL_AVCS = eINSTANCE.getSourceBucket_SortingLevelAVCS();

		/**
		 * The meta object literal for the '<em><b>Mechanization Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOURCE_BUCKET__MECHANIZATION_LEVEL = eINSTANCE.getSourceBucket_MechanizationLevel();

		/**
		 * The meta object literal for the '<em><b>Sorting Imc</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOURCE_BUCKET__SORTING_IMC = eINSTANCE.getSourceBucket_SortingImc();

		/**
		 * The meta object literal for the '<em><b>Delivery Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOURCE_BUCKET__DELIVERY_DATE = eINSTANCE.getSourceBucket_DeliveryDate();

		/**
		 * The meta object literal for the '{@link com.misc.projects.Forecast.impl.ForecastMappingImpl <em>Mapping</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.projects.Forecast.impl.ForecastMappingImpl
		 * @see com.misc.projects.Forecast.impl.ForecastPackageImpl#getForecastMapping()
		 * @generated
		 */
		EClass FORECAST_MAPPING = eINSTANCE.getForecastMapping();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORECAST_MAPPING__ELEMENTS = eINSTANCE.getForecastMapping_Elements();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORECAST_MAPPING__NAME = eINSTANCE.getForecastMapping_Name();

		/**
		 * The meta object literal for the '{@link com.misc.projects.Forecast.impl.ForecastMappingElementImpl <em>Mapping Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.projects.Forecast.impl.ForecastMappingElementImpl
		 * @see com.misc.projects.Forecast.impl.ForecastPackageImpl#getForecastMappingElement()
		 * @generated
		 */
		EClass FORECAST_MAPPING_ELEMENT = eINSTANCE.getForecastMappingElement();

		/**
		 * The meta object literal for the '<em><b>From Customer</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORECAST_MAPPING_ELEMENT__FROM_CUSTOMER = eINSTANCE.getForecastMappingElement_FromCustomer();

		/**
		 * The meta object literal for the '<em><b>From First Sorting Imc</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORECAST_MAPPING_ELEMENT__FROM_FIRST_SORTING_IMC = eINSTANCE.getForecastMappingElement_FromFirstSortingImc();

		/**
		 * The meta object literal for the '<em><b>From Intake Location</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORECAST_MAPPING_ELEMENT__FROM_INTAKE_LOCATION = eINSTANCE.getForecastMappingElement_FromIntakeLocation();

		/**
		 * The meta object literal for the '<em><b>From Sorting Level AGG</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORECAST_MAPPING_ELEMENT__FROM_SORTING_LEVEL_AGG = eINSTANCE.getForecastMappingElement_FromSortingLevelAGG();

		/**
		 * The meta object literal for the '<em><b>To Sorting Imc</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORECAST_MAPPING_ELEMENT__TO_SORTING_IMC = eINSTANCE.getForecastMappingElement_ToSortingImc();

		/**
		 * The meta object literal for the '<em><b>To Sorting Level AVCS</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORECAST_MAPPING_ELEMENT__TO_SORTING_LEVEL_AVCS = eINSTANCE.getForecastMappingElement_ToSortingLevelAVCS();

		/**
		 * The meta object literal for the '{@link com.misc.projects.Forecast.impl.MappingResultImpl <em>Mapping Result</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.projects.Forecast.impl.MappingResultImpl
		 * @see com.misc.projects.Forecast.impl.ForecastPackageImpl#getMappingResult()
		 * @generated
		 */
		EClass MAPPING_RESULT = eINSTANCE.getMappingResult();

		/**
		 * The meta object literal for the '<em><b>Forecast Mapping</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAPPING_RESULT__FORECAST_MAPPING = eINSTANCE.getMappingResult_ForecastMapping();

		/**
		 * The meta object literal for the '<em><b>Forecast Selection</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAPPING_RESULT__FORECAST_SELECTION = eINSTANCE.getMappingResult_ForecastSelection();

		/**
		 * The meta object literal for the '<em><b>Sources</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAPPING_RESULT__SOURCES = eINSTANCE.getMappingResult_Sources();

		/**
		 * The meta object literal for the '<em><b>Number Of Buckets Mapped</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAPPING_RESULT__NUMBER_OF_BUCKETS_MAPPED = eINSTANCE.getMappingResult_NumberOfBucketsMapped();

		/**
		 * The meta object literal for the '<em><b>Number Of Buckets To Map</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAPPING_RESULT__NUMBER_OF_BUCKETS_TO_MAP = eINSTANCE.getMappingResult_NumberOfBucketsToMap();

		/**
		 * The meta object literal for the '<em><b>Mapped</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAPPING_RESULT__MAPPED = eINSTANCE.getMappingResult_Mapped();

	}

} //ForecastPackage
