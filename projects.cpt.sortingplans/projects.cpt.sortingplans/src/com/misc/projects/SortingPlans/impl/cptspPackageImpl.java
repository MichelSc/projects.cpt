/**
 */
package com.misc.projects.SortingPlans.impl;

import com.misc.common.moplaf.propagator.PropagatorPackage;
import com.misc.projects.CptDatasetLoad.CptDatasetLoadPackage;
import com.misc.projects.SortingPlans.EndProduct;
import com.misc.projects.SortingPlans.Scenario;
import com.misc.projects.SortingPlans.Scenarios;
import com.misc.projects.SortingPlans.SortingPlan;
import com.misc.projects.SortingPlans.SortingPlanEndProduct;
import com.misc.projects.SortingPlans.SortingPlanInput;
import com.misc.projects.SortingPlans.SortingPlanOutput;
import com.misc.projects.SortingPlans.SortingPlanProduct;
import com.misc.projects.SortingPlans.cptspFactory;
import com.misc.projects.SortingPlans.cptspPackage;
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
public class cptspPackageImpl extends EPackageImpl implements cptspPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scenariosEClass = null;

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
	private EClass sortingPlanEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass endProductEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sortingPlanProductEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sortingPlanEndProductEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sortingPlanOutputEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sortingPlanInputEClass = null;

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
	 * @see com.misc.projects.SortingPlans.cptspPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private cptspPackageImpl() {
		super(eNS_URI, cptspFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link cptspPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static cptspPackage init() {
		if (isInited) return (cptspPackage)EPackage.Registry.INSTANCE.getEPackage(cptspPackage.eNS_URI);

		// Obtain or create and register package
		cptspPackageImpl thecptspPackage = (cptspPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof cptspPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new cptspPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		CptDatasetLoadPackage.eINSTANCE.eClass();
		PropagatorPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		thecptspPackage.createPackageContents();

		// Initialize created meta-data
		thecptspPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thecptspPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(cptspPackage.eNS_URI, thecptspPackage);
		return thecptspPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getScenarios() {
		return scenariosEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScenarios_Scenarios() {
		return (EReference)scenariosEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getScenarios_Name() {
		return (EAttribute)scenariosEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getScenarios__RefreshSortingPlanProducts() {
		return scenariosEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getScenarios__RefreshEndProducts() {
		return scenariosEClass.getEOperations().get(1);
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
	public EReference getScenario_SortingPlans() {
		return (EReference)scenarioEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScenario_EndProducts() {
		return (EReference)scenarioEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScenario_SortingPlanProducts() {
		return (EReference)scenarioEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getScenario_Name() {
		return (EAttribute)scenarioEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScenario_SortingLevelsWithDestination() {
		return (EReference)scenarioEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScenario_SelectedSortingPlans() {
		return (EReference)scenarioEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getScenario__RefreshSelectedSortingPlans() {
		return scenarioEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getScenario__Refresh() {
		return scenarioEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getScenario__RefreshSortingPlanProduct() {
		return scenarioEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getScenario__RefreshEndProducts() {
		return scenarioEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSortingPlan() {
		return sortingPlanEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSortingPlan_Outputs() {
		return (EReference)sortingPlanEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSortingPlan_Inputs() {
		return (EReference)sortingPlanEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSortingPlan_Scenario() {
		return (EReference)sortingPlanEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSortingPlan_Description() {
		return (EAttribute)sortingPlanEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSortingPlan__RefreshInputs() {
		return sortingPlanEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSortingPlan__RefreshOutputs() {
		return sortingPlanEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSortingPlan__Refresh() {
		return sortingPlanEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSortingPlan_EndProducts() {
		return (EReference)sortingPlanEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSortingPlan_FPDSortingPlan() {
		return (EReference)sortingPlanEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEndProduct() {
		return endProductEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEndProduct_FPDSortingLevel() {
		return (EReference)endProductEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEndProduct_SortingPlanProduct() {
		return (EReference)endProductEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEndProduct_Description() {
		return (EAttribute)endProductEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEndProduct_SortingPlans() {
		return (EReference)endProductEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEndProduct_WhichSortingPlans() {
		return (EAttribute)endProductEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEndProduct_Scenario() {
		return (EReference)endProductEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEndProduct__RefreshSortingPlans() {
		return endProductEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSortingPlanProduct() {
		return sortingPlanProductEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSortingPlanProduct_FPDSortingLevel() {
		return (EReference)sortingPlanProductEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSortingPlanProduct_SortingPlansProducing() {
		return (EReference)sortingPlanProductEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSortingPlanProduct_SortingPlansAccepting() {
		return (EReference)sortingPlanProductEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSortingPlanProduct_SortingLevelAVCSSk() {
		return (EAttribute)sortingPlanProductEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSortingPlanProduct_MechanizationLevelSk() {
		return (EAttribute)sortingPlanProductEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSortingPlanProduct_ThroughputTypeSk() {
		return (EAttribute)sortingPlanProductEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSortingPlanProduct_DestinationSk() {
		return (EAttribute)sortingPlanProductEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSortingPlanProduct_Description() {
		return (EAttribute)sortingPlanProductEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSortingPlanProduct_EndProduct() {
		return (EReference)sortingPlanProductEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSortingPlanEndProduct() {
		return sortingPlanEndProductEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSortingPlanEndProduct_Output() {
		return (EReference)sortingPlanEndProductEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSortingPlanEndProduct_EndProduct() {
		return (EReference)sortingPlanEndProductEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSortingPlanEndProduct_SortingPlan() {
		return (EReference)sortingPlanEndProductEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSortingPlanEndProduct_Description() {
		return (EAttribute)sortingPlanEndProductEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSortingPlanOutput() {
		return sortingPlanOutputEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSortingPlanOutput_FPDSortingPlanOutput() {
		return (EReference)sortingPlanOutputEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSortingPlanOutput_OutputProduct() {
		return (EReference)sortingPlanOutputEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSortingPlanOutput_Description() {
		return (EAttribute)sortingPlanOutputEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSortingPlanOutput_SortingPlanEndProduct() {
		return (EReference)sortingPlanOutputEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSortingPlanOutput_SortingPlan() {
		return (EReference)sortingPlanOutputEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSortingPlanInput() {
		return sortingPlanInputEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSortingPlanInput_InputProduct() {
		return (EReference)sortingPlanInputEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSortingPlanInput_FPDSortingPlanInput() {
		return (EReference)sortingPlanInputEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSortingPlanInput_Description() {
		return (EAttribute)sortingPlanInputEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSortingPlanInput_SortingPlan() {
		return (EReference)sortingPlanInputEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public cptspFactory getcptspFactory() {
		return (cptspFactory)getEFactoryInstance();
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
		scenariosEClass = createEClass(SCENARIOS);
		createEReference(scenariosEClass, SCENARIOS__SCENARIOS);
		createEAttribute(scenariosEClass, SCENARIOS__NAME);
		createEOperation(scenariosEClass, SCENARIOS___REFRESH_SORTING_PLAN_PRODUCTS);
		createEOperation(scenariosEClass, SCENARIOS___REFRESH_END_PRODUCTS);

		scenarioEClass = createEClass(SCENARIO);
		createEReference(scenarioEClass, SCENARIO__SORTING_PLANS);
		createEReference(scenarioEClass, SCENARIO__END_PRODUCTS);
		createEReference(scenarioEClass, SCENARIO__SORTING_PLAN_PRODUCTS);
		createEAttribute(scenarioEClass, SCENARIO__NAME);
		createEReference(scenarioEClass, SCENARIO__SORTING_LEVELS_WITH_DESTINATION);
		createEReference(scenarioEClass, SCENARIO__SELECTED_SORTING_PLANS);
		createEOperation(scenarioEClass, SCENARIO___REFRESH_SELECTED_SORTING_PLANS);
		createEOperation(scenarioEClass, SCENARIO___REFRESH);
		createEOperation(scenarioEClass, SCENARIO___REFRESH_SORTING_PLAN_PRODUCT);
		createEOperation(scenarioEClass, SCENARIO___REFRESH_END_PRODUCTS);

		sortingPlanEClass = createEClass(SORTING_PLAN);
		createEReference(sortingPlanEClass, SORTING_PLAN__OUTPUTS);
		createEReference(sortingPlanEClass, SORTING_PLAN__END_PRODUCTS);
		createEReference(sortingPlanEClass, SORTING_PLAN__FPD_SORTING_PLAN);
		createEReference(sortingPlanEClass, SORTING_PLAN__INPUTS);
		createEReference(sortingPlanEClass, SORTING_PLAN__SCENARIO);
		createEAttribute(sortingPlanEClass, SORTING_PLAN__DESCRIPTION);
		createEOperation(sortingPlanEClass, SORTING_PLAN___REFRESH_INPUTS);
		createEOperation(sortingPlanEClass, SORTING_PLAN___REFRESH_OUTPUTS);
		createEOperation(sortingPlanEClass, SORTING_PLAN___REFRESH);

		endProductEClass = createEClass(END_PRODUCT);
		createEReference(endProductEClass, END_PRODUCT__FPD_SORTING_LEVEL);
		createEReference(endProductEClass, END_PRODUCT__SORTING_PLAN_PRODUCT);
		createEAttribute(endProductEClass, END_PRODUCT__DESCRIPTION);
		createEReference(endProductEClass, END_PRODUCT__SORTING_PLANS);
		createEAttribute(endProductEClass, END_PRODUCT__WHICH_SORTING_PLANS);
		createEReference(endProductEClass, END_PRODUCT__SCENARIO);
		createEOperation(endProductEClass, END_PRODUCT___REFRESH_SORTING_PLANS);

		sortingPlanProductEClass = createEClass(SORTING_PLAN_PRODUCT);
		createEReference(sortingPlanProductEClass, SORTING_PLAN_PRODUCT__FPD_SORTING_LEVEL);
		createEReference(sortingPlanProductEClass, SORTING_PLAN_PRODUCT__SORTING_PLANS_PRODUCING);
		createEReference(sortingPlanProductEClass, SORTING_PLAN_PRODUCT__SORTING_PLANS_ACCEPTING);
		createEAttribute(sortingPlanProductEClass, SORTING_PLAN_PRODUCT__SORTING_LEVEL_AVCS_SK);
		createEAttribute(sortingPlanProductEClass, SORTING_PLAN_PRODUCT__MECHANIZATION_LEVEL_SK);
		createEAttribute(sortingPlanProductEClass, SORTING_PLAN_PRODUCT__THROUGHPUT_TYPE_SK);
		createEAttribute(sortingPlanProductEClass, SORTING_PLAN_PRODUCT__DESTINATION_SK);
		createEAttribute(sortingPlanProductEClass, SORTING_PLAN_PRODUCT__DESCRIPTION);
		createEReference(sortingPlanProductEClass, SORTING_PLAN_PRODUCT__END_PRODUCT);

		sortingPlanEndProductEClass = createEClass(SORTING_PLAN_END_PRODUCT);
		createEReference(sortingPlanEndProductEClass, SORTING_PLAN_END_PRODUCT__OUTPUT);
		createEReference(sortingPlanEndProductEClass, SORTING_PLAN_END_PRODUCT__END_PRODUCT);
		createEReference(sortingPlanEndProductEClass, SORTING_PLAN_END_PRODUCT__SORTING_PLAN);
		createEAttribute(sortingPlanEndProductEClass, SORTING_PLAN_END_PRODUCT__DESCRIPTION);

		sortingPlanOutputEClass = createEClass(SORTING_PLAN_OUTPUT);
		createEReference(sortingPlanOutputEClass, SORTING_PLAN_OUTPUT__FPD_SORTING_PLAN_OUTPUT);
		createEReference(sortingPlanOutputEClass, SORTING_PLAN_OUTPUT__OUTPUT_PRODUCT);
		createEAttribute(sortingPlanOutputEClass, SORTING_PLAN_OUTPUT__DESCRIPTION);
		createEReference(sortingPlanOutputEClass, SORTING_PLAN_OUTPUT__SORTING_PLAN_END_PRODUCT);
		createEReference(sortingPlanOutputEClass, SORTING_PLAN_OUTPUT__SORTING_PLAN);

		sortingPlanInputEClass = createEClass(SORTING_PLAN_INPUT);
		createEReference(sortingPlanInputEClass, SORTING_PLAN_INPUT__INPUT_PRODUCT);
		createEReference(sortingPlanInputEClass, SORTING_PLAN_INPUT__FPD_SORTING_PLAN_INPUT);
		createEAttribute(sortingPlanInputEClass, SORTING_PLAN_INPUT__DESCRIPTION);
		createEReference(sortingPlanInputEClass, SORTING_PLAN_INPUT__SORTING_PLAN);
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
		PropagatorPackage thePropagatorPackage = (PropagatorPackage)EPackage.Registry.INSTANCE.getEPackage(PropagatorPackage.eNS_URI);
		CptDatasetLoadPackage theCptDatasetLoadPackage = (CptDatasetLoadPackage)EPackage.Registry.INSTANCE.getEPackage(CptDatasetLoadPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		scenarioEClass.getESuperTypes().add(thePropagatorPackage.getObjectWithPropagatorFunctionAdapter());
		scenarioEClass.getESuperTypes().add(thePropagatorPackage.getObjectWithPropagatorFunctionAdapterScope());
		sortingPlanEClass.getESuperTypes().add(thePropagatorPackage.getObjectWithPropagatorFunctionAdapter());
		endProductEClass.getESuperTypes().add(thePropagatorPackage.getObjectWithPropagatorFunctionAdapter());

		// Initialize classes, features, and operations; add parameters
		initEClass(scenariosEClass, Scenarios.class, "Scenarios", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getScenarios_Scenarios(), this.getScenario(), null, "Scenarios", null, 0, -1, Scenarios.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getScenarios_Name(), ecorePackage.getEString(), "Name", null, 0, 1, Scenarios.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getScenarios__RefreshSortingPlanProducts(), null, "refreshSortingPlanProducts", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getScenarios__RefreshEndProducts(), null, "refreshEndProducts", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(scenarioEClass, Scenario.class, "Scenario", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getScenario_SortingPlans(), this.getSortingPlan(), this.getSortingPlan_Scenario(), "SortingPlans", null, 0, -1, Scenario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getScenario_EndProducts(), this.getEndProduct(), this.getEndProduct_Scenario(), "EndProducts", null, 0, -1, Scenario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getScenario_SortingPlanProducts(), this.getSortingPlanProduct(), null, "SortingPlanProducts", null, 0, -1, Scenario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getScenario_Name(), ecorePackage.getEString(), "Name", null, 0, 1, Scenario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getScenario_SortingLevelsWithDestination(), theCptDatasetLoadPackage.getSortingLevelRow(), null, "SortingLevelsWithDestination", null, 0, -1, Scenario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getScenario_SelectedSortingPlans(), theCptDatasetLoadPackage.getSortingPlanRow(), null, "SelectedSortingPlans", null, 0, -1, Scenario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getScenario__RefreshSelectedSortingPlans(), null, "refreshSelectedSortingPlans", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getScenario__Refresh(), null, "refresh", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getScenario__RefreshSortingPlanProduct(), null, "refreshSortingPlanProduct", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getScenario__RefreshEndProducts(), null, "refreshEndProducts", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(sortingPlanEClass, SortingPlan.class, "SortingPlan", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSortingPlan_Outputs(), this.getSortingPlanOutput(), this.getSortingPlanOutput_SortingPlan(), "Outputs", null, 0, -1, SortingPlan.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSortingPlan_EndProducts(), this.getSortingPlanEndProduct(), this.getSortingPlanEndProduct_SortingPlan(), "EndProducts", null, 0, -1, SortingPlan.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSortingPlan_FPDSortingPlan(), theCptDatasetLoadPackage.getSortingPlanRow(), null, "FPDSortingPlan", null, 0, 1, SortingPlan.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSortingPlan_Inputs(), this.getSortingPlanInput(), this.getSortingPlanInput_SortingPlan(), "Inputs", null, 0, -1, SortingPlan.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSortingPlan_Scenario(), this.getScenario(), this.getScenario_SortingPlans(), "Scenario", null, 1, 1, SortingPlan.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSortingPlan_Description(), ecorePackage.getEString(), "Description", null, 0, 1, SortingPlan.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEOperation(getSortingPlan__RefreshInputs(), null, "refreshInputs", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getSortingPlan__RefreshOutputs(), null, "refreshOutputs", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getSortingPlan__Refresh(), null, "refresh", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(endProductEClass, EndProduct.class, "EndProduct", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEndProduct_FPDSortingLevel(), theCptDatasetLoadPackage.getSortingLevelRow(), null, "FPDSortingLevel", null, 0, 1, EndProduct.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEndProduct_SortingPlanProduct(), this.getSortingPlanProduct(), this.getSortingPlanProduct_EndProduct(), "SortingPlanProduct", null, 1, 1, EndProduct.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEndProduct_Description(), ecorePackage.getEString(), "Description", null, 0, 1, EndProduct.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getEndProduct_SortingPlans(), this.getSortingPlanEndProduct(), this.getSortingPlanEndProduct_EndProduct(), "SortingPlans", null, 0, -1, EndProduct.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEndProduct_WhichSortingPlans(), ecorePackage.getEBoolean(), "whichSortingPlans", null, 0, 1, EndProduct.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEndProduct_Scenario(), this.getScenario(), this.getScenario_EndProducts(), "Scenario", null, 0, 1, EndProduct.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getEndProduct__RefreshSortingPlans(), null, "refreshSortingPlans", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(sortingPlanProductEClass, SortingPlanProduct.class, "SortingPlanProduct", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSortingPlanProduct_FPDSortingLevel(), theCptDatasetLoadPackage.getSortingLevelRow(), null, "FPDSortingLevel", null, 0, 1, SortingPlanProduct.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSortingPlanProduct_SortingPlansProducing(), this.getSortingPlanOutput(), this.getSortingPlanOutput_OutputProduct(), "SortingPlansProducing", null, 0, -1, SortingPlanProduct.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSortingPlanProduct_SortingPlansAccepting(), this.getSortingPlanInput(), this.getSortingPlanInput_InputProduct(), "SortingPlansAccepting", null, 0, -1, SortingPlanProduct.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSortingPlanProduct_SortingLevelAVCSSk(), ecorePackage.getEBigDecimal(), "SortingLevelAVCSSk", null, 0, 1, SortingPlanProduct.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSortingPlanProduct_MechanizationLevelSk(), ecorePackage.getEBigDecimal(), "MechanizationLevelSk", null, 0, 1, SortingPlanProduct.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSortingPlanProduct_ThroughputTypeSk(), ecorePackage.getEBigDecimal(), "ThroughputTypeSk", null, 0, 1, SortingPlanProduct.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSortingPlanProduct_DestinationSk(), ecorePackage.getEBigDecimal(), "DestinationSk", null, 0, 1, SortingPlanProduct.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSortingPlanProduct_Description(), ecorePackage.getEString(), "Description", null, 0, 1, SortingPlanProduct.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getSortingPlanProduct_EndProduct(), this.getEndProduct(), this.getEndProduct_SortingPlanProduct(), "EndProduct", null, 0, 1, SortingPlanProduct.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sortingPlanEndProductEClass, SortingPlanEndProduct.class, "SortingPlanEndProduct", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSortingPlanEndProduct_Output(), this.getSortingPlanOutput(), this.getSortingPlanOutput_SortingPlanEndProduct(), "Output", null, 0, -1, SortingPlanEndProduct.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSortingPlanEndProduct_EndProduct(), this.getEndProduct(), this.getEndProduct_SortingPlans(), "EndProduct", null, 1, 1, SortingPlanEndProduct.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSortingPlanEndProduct_SortingPlan(), this.getSortingPlan(), this.getSortingPlan_EndProducts(), "SortingPlan", null, 1, 1, SortingPlanEndProduct.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSortingPlanEndProduct_Description(), ecorePackage.getEString(), "Description", null, 0, 1, SortingPlanEndProduct.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(sortingPlanOutputEClass, SortingPlanOutput.class, "SortingPlanOutput", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSortingPlanOutput_FPDSortingPlanOutput(), theCptDatasetLoadPackage.getSortingPlanOutputRow(), null, "FPDSortingPlanOutput", null, 0, 1, SortingPlanOutput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSortingPlanOutput_OutputProduct(), this.getSortingPlanProduct(), this.getSortingPlanProduct_SortingPlansProducing(), "OutputProduct", null, 1, 1, SortingPlanOutput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSortingPlanOutput_Description(), ecorePackage.getEString(), "Description", null, 0, 1, SortingPlanOutput.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getSortingPlanOutput_SortingPlanEndProduct(), this.getSortingPlanEndProduct(), this.getSortingPlanEndProduct_Output(), "SortingPlanEndProduct", null, 0, -1, SortingPlanOutput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSortingPlanOutput_SortingPlan(), this.getSortingPlan(), this.getSortingPlan_Outputs(), "SortingPlan", null, 0, 1, SortingPlanOutput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sortingPlanInputEClass, SortingPlanInput.class, "SortingPlanInput", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSortingPlanInput_InputProduct(), this.getSortingPlanProduct(), this.getSortingPlanProduct_SortingPlansAccepting(), "InputProduct", null, 1, 1, SortingPlanInput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSortingPlanInput_FPDSortingPlanInput(), theCptDatasetLoadPackage.getSortingPlanInputRow(), null, "FPDSortingPlanInput", null, 0, 1, SortingPlanInput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSortingPlanInput_Description(), ecorePackage.getEString(), "Description", null, 0, 1, SortingPlanInput.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getSortingPlanInput_SortingPlan(), this.getSortingPlan(), this.getSortingPlan_Inputs(), "SortingPlan", null, 0, 1, SortingPlanInput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //cptspPackageImpl
