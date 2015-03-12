/**
 */
package com.misc.projects.Forecast.impl;

import com.misc.projects.CptDatasetLoad.CptDatasetLoadPackage;
import com.misc.projects.Forecast.FPOForecastBucketsSelection;
import com.misc.projects.Forecast.ForecastFactory;
import com.misc.projects.Forecast.ForecastMapping;
import com.misc.projects.Forecast.ForecastMappingElement;
import com.misc.projects.Forecast.ForecastPackage;
import com.misc.projects.Forecast.MappingResult;
import com.misc.projects.Forecast.Scenario;
import com.misc.projects.Forecast.SourceBucket;
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
public class ForecastPackageImpl extends EPackageImpl implements ForecastPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scenarioEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fpoForecastBucketsSelectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sourceBucketEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass forecastMappingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass forecastMappingElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mappingResultEClass = null;

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
	 * @see com.misc.projects.Forecast.ForecastPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ForecastPackageImpl() {
		super(eNS_URI, ForecastFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ForecastPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ForecastPackage init() {
		if (isInited) return (ForecastPackage)EPackage.Registry.INSTANCE.getEPackage(ForecastPackage.eNS_URI);

		// Obtain or create and register package
		ForecastPackageImpl theForecastPackage = (ForecastPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ForecastPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ForecastPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		CptDatasetLoadPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theForecastPackage.createPackageContents();

		// Initialize created meta-data
		theForecastPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theForecastPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ForecastPackage.eNS_URI, theForecastPackage);
		return theForecastPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getScenario() {
		return scenarioEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScenario_Selections() {
		return (EReference)scenarioEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getScenario_Name() {
		return (EAttribute)scenarioEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScenario_Mappings() {
		return (EReference)scenarioEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScenario_ChildScenarios() {
		return (EReference)scenarioEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScenario_MappingResults() {
		return (EReference)scenarioEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFPOForecastBucketsSelection() {
		return fpoForecastBucketsSelectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFPOForecastBucketsSelection_Upload() {
		return (EReference)fpoForecastBucketsSelectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFPOForecastBucketsSelection_SelectedBuckets() {
		return (EReference)fpoForecastBucketsSelectionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFPOForecastBucketsSelection_SelectBucketDates() {
		return (EAttribute)fpoForecastBucketsSelectionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFPOForecastBucketsSelection_SelectThroughputTypes() {
		return (EAttribute)fpoForecastBucketsSelectionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFPOForecastBucketsSelection_SelectMechanizationLevel() {
		return (EAttribute)fpoForecastBucketsSelectionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFPOForecastBucketsSelection_SelectSortingLevelAGGs() {
		return (EAttribute)fpoForecastBucketsSelectionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFPOForecastBucketsSelection_SelectFirstSortingIMCs() {
		return (EAttribute)fpoForecastBucketsSelectionEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFPOForecastBucketsSelection_SelectionSize() {
		return (EAttribute)fpoForecastBucketsSelectionEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFPOForecastBucketsSelection__IsSelected__FPOForecastBucket() {
		return fpoForecastBucketsSelectionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFPOForecastBucketsSelection__RefreshSelectedBuckets() {
		return fpoForecastBucketsSelectionEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFPOForecastBucketsSelection__SortSelectedBuckets() {
		return fpoForecastBucketsSelectionEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSourceBucket() {
		return sourceBucketEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSourceBucket_BucketBeginTime() {
		return (EAttribute)sourceBucketEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSourceBucket_BucketEndTime() {
		return (EAttribute)sourceBucketEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSourceBucket_Volume() {
		return (EAttribute)sourceBucketEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSourceBucket_ThroughputType() {
		return (EAttribute)sourceBucketEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSourceBucket_SortingLevelAVCS() {
		return (EAttribute)sourceBucketEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSourceBucket_MechanizationLevel() {
		return (EAttribute)sourceBucketEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSourceBucket_SortingImc() {
		return (EAttribute)sourceBucketEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSourceBucket_DeliveryDate() {
		return (EAttribute)sourceBucketEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getForecastMapping() {
		return forecastMappingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getForecastMapping_Elements() {
		return (EReference)forecastMappingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getForecastMapping_Name() {
		return (EAttribute)forecastMappingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getForecastMappingElement() {
		return forecastMappingElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getForecastMappingElement_FromCustomer() {
		return (EAttribute)forecastMappingElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getForecastMappingElement_FromFirstSortingImc() {
		return (EAttribute)forecastMappingElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getForecastMappingElement_FromIntakeLocation() {
		return (EAttribute)forecastMappingElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getForecastMappingElement_FromSortingLevelAGG() {
		return (EAttribute)forecastMappingElementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getForecastMappingElement_ToSortingImc() {
		return (EAttribute)forecastMappingElementEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getForecastMappingElement_ToSortingLevelAVCS() {
		return (EAttribute)forecastMappingElementEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMappingResult() {
		return mappingResultEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMappingResult_ForecastMapping() {
		return (EReference)mappingResultEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMappingResult_ForecastSelection() {
		return (EReference)mappingResultEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMappingResult_Sources() {
		return (EReference)mappingResultEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMappingResult_NumberOfBucketsMapped() {
		return (EAttribute)mappingResultEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMappingResult_NumberOfBucketsToMap() {
		return (EAttribute)mappingResultEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMappingResult_Mapped() {
		return (EAttribute)mappingResultEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ForecastFactory getForecastFactory() {
		return (ForecastFactory)getEFactoryInstance();
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
		scenarioEClass = createEClass(SCENARIO);
		createEReference(scenarioEClass, SCENARIO__SELECTIONS);
		createEAttribute(scenarioEClass, SCENARIO__NAME);
		createEReference(scenarioEClass, SCENARIO__MAPPINGS);
		createEReference(scenarioEClass, SCENARIO__CHILD_SCENARIOS);
		createEReference(scenarioEClass, SCENARIO__MAPPING_RESULTS);

		fpoForecastBucketsSelectionEClass = createEClass(FPO_FORECAST_BUCKETS_SELECTION);
		createEReference(fpoForecastBucketsSelectionEClass, FPO_FORECAST_BUCKETS_SELECTION__UPLOAD);
		createEReference(fpoForecastBucketsSelectionEClass, FPO_FORECAST_BUCKETS_SELECTION__SELECTED_BUCKETS);
		createEAttribute(fpoForecastBucketsSelectionEClass, FPO_FORECAST_BUCKETS_SELECTION__SELECT_BUCKET_DATES);
		createEAttribute(fpoForecastBucketsSelectionEClass, FPO_FORECAST_BUCKETS_SELECTION__SELECT_THROUGHPUT_TYPES);
		createEAttribute(fpoForecastBucketsSelectionEClass, FPO_FORECAST_BUCKETS_SELECTION__SELECT_MECHANIZATION_LEVEL);
		createEAttribute(fpoForecastBucketsSelectionEClass, FPO_FORECAST_BUCKETS_SELECTION__SELECT_SORTING_LEVEL_AG_GS);
		createEAttribute(fpoForecastBucketsSelectionEClass, FPO_FORECAST_BUCKETS_SELECTION__SELECT_FIRST_SORTING_IM_CS);
		createEAttribute(fpoForecastBucketsSelectionEClass, FPO_FORECAST_BUCKETS_SELECTION__SELECTION_SIZE);
		createEOperation(fpoForecastBucketsSelectionEClass, FPO_FORECAST_BUCKETS_SELECTION___IS_SELECTED__FPOFORECASTBUCKET);
		createEOperation(fpoForecastBucketsSelectionEClass, FPO_FORECAST_BUCKETS_SELECTION___REFRESH_SELECTED_BUCKETS);
		createEOperation(fpoForecastBucketsSelectionEClass, FPO_FORECAST_BUCKETS_SELECTION___SORT_SELECTED_BUCKETS);

		sourceBucketEClass = createEClass(SOURCE_BUCKET);
		createEAttribute(sourceBucketEClass, SOURCE_BUCKET__BUCKET_BEGIN_TIME);
		createEAttribute(sourceBucketEClass, SOURCE_BUCKET__BUCKET_END_TIME);
		createEAttribute(sourceBucketEClass, SOURCE_BUCKET__VOLUME);
		createEAttribute(sourceBucketEClass, SOURCE_BUCKET__THROUGHPUT_TYPE);
		createEAttribute(sourceBucketEClass, SOURCE_BUCKET__SORTING_LEVEL_AVCS);
		createEAttribute(sourceBucketEClass, SOURCE_BUCKET__MECHANIZATION_LEVEL);
		createEAttribute(sourceBucketEClass, SOURCE_BUCKET__SORTING_IMC);
		createEAttribute(sourceBucketEClass, SOURCE_BUCKET__DELIVERY_DATE);

		forecastMappingEClass = createEClass(FORECAST_MAPPING);
		createEReference(forecastMappingEClass, FORECAST_MAPPING__ELEMENTS);
		createEAttribute(forecastMappingEClass, FORECAST_MAPPING__NAME);

		forecastMappingElementEClass = createEClass(FORECAST_MAPPING_ELEMENT);
		createEAttribute(forecastMappingElementEClass, FORECAST_MAPPING_ELEMENT__FROM_CUSTOMER);
		createEAttribute(forecastMappingElementEClass, FORECAST_MAPPING_ELEMENT__FROM_FIRST_SORTING_IMC);
		createEAttribute(forecastMappingElementEClass, FORECAST_MAPPING_ELEMENT__FROM_INTAKE_LOCATION);
		createEAttribute(forecastMappingElementEClass, FORECAST_MAPPING_ELEMENT__FROM_SORTING_LEVEL_AGG);
		createEAttribute(forecastMappingElementEClass, FORECAST_MAPPING_ELEMENT__TO_SORTING_IMC);
		createEAttribute(forecastMappingElementEClass, FORECAST_MAPPING_ELEMENT__TO_SORTING_LEVEL_AVCS);

		mappingResultEClass = createEClass(MAPPING_RESULT);
		createEReference(mappingResultEClass, MAPPING_RESULT__FORECAST_MAPPING);
		createEReference(mappingResultEClass, MAPPING_RESULT__FORECAST_SELECTION);
		createEReference(mappingResultEClass, MAPPING_RESULT__SOURCES);
		createEAttribute(mappingResultEClass, MAPPING_RESULT__NUMBER_OF_BUCKETS_MAPPED);
		createEAttribute(mappingResultEClass, MAPPING_RESULT__NUMBER_OF_BUCKETS_TO_MAP);
		createEAttribute(mappingResultEClass, MAPPING_RESULT__MAPPED);
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
		CptDatasetLoadPackage theCptDatasetLoadPackage = (CptDatasetLoadPackage)EPackage.Registry.INSTANCE.getEPackage(CptDatasetLoadPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(scenarioEClass, Scenario.class, "Scenario", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getScenario_Selections(), this.getFPOForecastBucketsSelection(), null, "Selections", null, 0, -1, Scenario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getScenario_Name(), ecorePackage.getEString(), "Name", null, 0, 1, Scenario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getScenario_Mappings(), this.getForecastMapping(), null, "Mappings", null, 0, -1, Scenario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getScenario_ChildScenarios(), this.getScenario(), null, "ChildScenarios", null, 0, -1, Scenario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getScenario_MappingResults(), this.getMappingResult(), null, "MappingResults", null, 0, -1, Scenario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fpoForecastBucketsSelectionEClass, FPOForecastBucketsSelection.class, "FPOForecastBucketsSelection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFPOForecastBucketsSelection_Upload(), theCptDatasetLoadPackage.getFPOForecastUpload(), null, "Upload", null, 0, 1, FPOForecastBucketsSelection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFPOForecastBucketsSelection_SelectedBuckets(), theCptDatasetLoadPackage.getFPOForecastBucket(), null, "SelectedBuckets", null, 0, -1, FPOForecastBucketsSelection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFPOForecastBucketsSelection_SelectBucketDates(), ecorePackage.getEDate(), "SelectBucketDates", null, 0, -1, FPOForecastBucketsSelection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFPOForecastBucketsSelection_SelectThroughputTypes(), ecorePackage.getEBigDecimal(), "SelectThroughputTypes", null, 0, -1, FPOForecastBucketsSelection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFPOForecastBucketsSelection_SelectMechanizationLevel(), ecorePackage.getEBigDecimal(), "SelectMechanizationLevel", null, 0, -1, FPOForecastBucketsSelection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFPOForecastBucketsSelection_SelectSortingLevelAGGs(), ecorePackage.getEBigDecimal(), "SelectSortingLevelAGGs", null, 0, -1, FPOForecastBucketsSelection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFPOForecastBucketsSelection_SelectFirstSortingIMCs(), ecorePackage.getEBigDecimal(), "SelectFirstSortingIMCs", null, 0, -1, FPOForecastBucketsSelection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFPOForecastBucketsSelection_SelectionSize(), ecorePackage.getEInt(), "SelectionSize", null, 0, 1, FPOForecastBucketsSelection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getFPOForecastBucketsSelection__IsSelected__FPOForecastBucket(), ecorePackage.getEBoolean(), "isSelected", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theCptDatasetLoadPackage.getFPOForecastBucket(), "bucket", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getFPOForecastBucketsSelection__RefreshSelectedBuckets(), null, "refreshSelectedBuckets", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getFPOForecastBucketsSelection__SortSelectedBuckets(), null, "sortSelectedBuckets", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(sourceBucketEClass, SourceBucket.class, "SourceBucket", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSourceBucket_BucketBeginTime(), ecorePackage.getEDate(), "BucketBeginTime", null, 0, 1, SourceBucket.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSourceBucket_BucketEndTime(), ecorePackage.getEDate(), "BucketEndTime", null, 0, 1, SourceBucket.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSourceBucket_Volume(), ecorePackage.getEBigDecimal(), "Volume", null, 0, 1, SourceBucket.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSourceBucket_ThroughputType(), ecorePackage.getEBigDecimal(), "ThroughputType", null, 0, 1, SourceBucket.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSourceBucket_SortingLevelAVCS(), ecorePackage.getEBigDecimal(), "SortingLevelAVCS", null, 0, 1, SourceBucket.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSourceBucket_MechanizationLevel(), ecorePackage.getEBigDecimal(), "MechanizationLevel", null, 0, 1, SourceBucket.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSourceBucket_SortingImc(), ecorePackage.getEBigDecimal(), "SortingImc", null, 0, 1, SourceBucket.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSourceBucket_DeliveryDate(), ecorePackage.getEDate(), "DeliveryDate", null, 0, 1, SourceBucket.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(forecastMappingEClass, ForecastMapping.class, "ForecastMapping", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getForecastMapping_Elements(), this.getForecastMappingElement(), null, "Elements", null, 0, -1, ForecastMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getForecastMapping_Name(), ecorePackage.getEString(), "Name", null, 0, 1, ForecastMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(forecastMappingElementEClass, ForecastMappingElement.class, "ForecastMappingElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getForecastMappingElement_FromCustomer(), ecorePackage.getEBigDecimal(), "FromCustomer", null, 0, 1, ForecastMappingElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getForecastMappingElement_FromFirstSortingImc(), ecorePackage.getEBigDecimal(), "FromFirstSortingImc", null, 0, 1, ForecastMappingElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getForecastMappingElement_FromIntakeLocation(), ecorePackage.getEBigDecimal(), "FromIntakeLocation", null, 0, 1, ForecastMappingElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getForecastMappingElement_FromSortingLevelAGG(), ecorePackage.getEBigDecimal(), "FromSortingLevelAGG", null, 0, 1, ForecastMappingElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getForecastMappingElement_ToSortingImc(), ecorePackage.getEBigDecimal(), "ToSortingImc", null, 0, 1, ForecastMappingElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getForecastMappingElement_ToSortingLevelAVCS(), ecorePackage.getEBigDecimal(), "ToSortingLevelAVCS", null, 0, 1, ForecastMappingElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mappingResultEClass, MappingResult.class, "MappingResult", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMappingResult_ForecastMapping(), this.getForecastMapping(), null, "ForecastMapping", null, 0, 1, MappingResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMappingResult_ForecastSelection(), this.getFPOForecastBucketsSelection(), null, "ForecastSelection", null, 0, 1, MappingResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMappingResult_Sources(), this.getSourceBucket(), null, "Sources", null, 0, -1, MappingResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMappingResult_NumberOfBucketsMapped(), ecorePackage.getEInt(), "NumberOfBucketsMapped", null, 0, 1, MappingResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMappingResult_NumberOfBucketsToMap(), ecorePackage.getEInt(), "NumberOfBucketsToMap", null, 0, 1, MappingResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMappingResult_Mapped(), ecorePackage.getEDate(), "Mapped", null, 0, 1, MappingResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //ForecastPackageImpl
