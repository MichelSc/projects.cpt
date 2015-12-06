/**
 */
package com.misc.projects.SortingPlans.impl;

import com.misc.common.moplaf.propagator.PropagatorPackage;
import com.misc.projects.CptDatasetLoad.CptDatasetLoadPackage;
import com.misc.projects.SortingPlans.EndProduct;
import com.misc.projects.SortingPlans.EndProductInProduct;
import com.misc.projects.SortingPlans.EndProductSortingPlan;
import com.misc.projects.SortingPlans.EndProductSortingPlanInput;
import com.misc.projects.SortingPlans.EndProductSortingPlanOutput;
import com.misc.projects.SortingPlans.Scenario;
import com.misc.projects.SortingPlans.Scenarios;
import com.misc.projects.SortingPlans.SortingPath;
import com.misc.projects.SortingPlans.SortingPlan;
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
	private EClass sortingPlanOutputEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sortingPlanInputEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass endProductSortingPlanEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass endProductSortingPlanInputEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass endProductSortingPlanOutputEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass endProductInProductEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sortingPathEClass = null;

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
	public EReference getScenario_SelectedEndProducts() {
		return (EReference)scenarioEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScenario_PrimaryProductsSelected() {
		return (EReference)scenarioEClass.getEStructuralFeatures().get(7);
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
	public EOperation getScenario__RefreshSortingPaths() {
		return scenarioEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getScenario__Test() {
		return scenarioEClass.getEOperations().get(5);
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
	public EAttribute getSortingPlan_Selected() {
		return (EAttribute)sortingPlanEClass.getEStructuralFeatures().get(6);
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
	public EReference getEndProduct_Scenario() {
		return (EReference)endProductEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEndProduct_ScenarioAsSelected() {
		return (EReference)endProductEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEndProduct_ProductsContaining() {
		return (EReference)endProductEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEndProduct_Selected() {
		return (EAttribute)endProductEClass.getEStructuralFeatures().get(7);
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
	public EReference getSortingPlanProduct_SortingPaths() {
		return (EReference)sortingPlanProductEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSortingPlanProduct_EndProducts() {
		return (EReference)sortingPlanProductEClass.getEStructuralFeatures().get(10);
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
	public EReference getSortingPlanOutput_SortingPlan() {
		return (EReference)sortingPlanOutputEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSortingPlanOutput__RefeshSortedEndProducts() {
		return sortingPlanOutputEClass.getEOperations().get(0);
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
	public EClass getEndProductSortingPlan() {
		return endProductSortingPlanEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEndProductSortingPlan_EndProduct() {
		return (EReference)endProductSortingPlanEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEndProductSortingPlan_SortingPlan() {
		return (EReference)endProductSortingPlanEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEndProductSortingPlan_Description() {
		return (EAttribute)endProductSortingPlanEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEndProductSortingPlan_Outputs() {
		return (EReference)endProductSortingPlanEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEndProductSortingPlan_Inputs() {
		return (EReference)endProductSortingPlanEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEndProductSortingPlan_SelectedOutput() {
		return (EReference)endProductSortingPlanEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEndProductSortingPlan_SortingDistance() {
		return (EAttribute)endProductSortingPlanEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEndProductSortingPlan_Sorted() {
		return (EAttribute)endProductSortingPlanEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEndProductSortingPlanInput() {
		return endProductSortingPlanInputEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEndProductSortingPlanInput_SortingPlan() {
		return (EReference)endProductSortingPlanInputEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEndProductSortingPlanInput_InputProduct() {
		return (EReference)endProductSortingPlanInputEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEndProductSortingPlanInput_SortingPlanInput() {
		return (EReference)endProductSortingPlanInputEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEndProductSortingPlanInput_Description() {
		return (EAttribute)endProductSortingPlanInputEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEndProductSortingPlanOutput() {
		return endProductSortingPlanOutputEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEndProductSortingPlanOutput_SortingPlan() {
		return (EReference)endProductSortingPlanOutputEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEndProductSortingPlanOutput_OutputProduct() {
		return (EReference)endProductSortingPlanOutputEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEndProductSortingPlanOutput_SortingPlanOutput() {
		return (EReference)endProductSortingPlanOutputEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEndProductSortingPlanOutput_Selected() {
		return (EAttribute)endProductSortingPlanOutputEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEndProductSortingPlanOutput_Description() {
		return (EAttribute)endProductSortingPlanOutputEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEndProductInProduct() {
		return endProductInProductEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEndProductInProduct_EndProductsContained() {
		return (EReference)endProductInProductEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEndProductInProduct_SortingPlansProducing() {
		return (EReference)endProductInProductEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEndProductInProduct_SortingPlansAccepting() {
		return (EReference)endProductInProductEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEndProductInProduct_Product() {
		return (EReference)endProductInProductEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEndProductInProduct_Description() {
		return (EAttribute)endProductInProductEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEndProductInProduct_Sorted() {
		return (EAttribute)endProductInProductEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSortingPath() {
		return sortingPathEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSortingPath_OutputLastSegment() {
		return (EReference)sortingPathEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSortingPath_BeforeLastSegment() {
		return (EReference)sortingPathEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSortingPath_SortedEndProducts() {
		return (EReference)sortingPathEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSortingPath_Description() {
		return (EAttribute)sortingPathEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSortingPath_Product() {
		return (EReference)sortingPathEClass.getEStructuralFeatures().get(4);
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

		scenarioEClass = createEClass(SCENARIO);
		createEReference(scenarioEClass, SCENARIO__SORTING_PLANS);
		createEReference(scenarioEClass, SCENARIO__END_PRODUCTS);
		createEReference(scenarioEClass, SCENARIO__SORTING_PLAN_PRODUCTS);
		createEAttribute(scenarioEClass, SCENARIO__NAME);
		createEReference(scenarioEClass, SCENARIO__SORTING_LEVELS_WITH_DESTINATION);
		createEReference(scenarioEClass, SCENARIO__SELECTED_SORTING_PLANS);
		createEReference(scenarioEClass, SCENARIO__SELECTED_END_PRODUCTS);
		createEReference(scenarioEClass, SCENARIO__PRIMARY_PRODUCTS_SELECTED);
		createEOperation(scenarioEClass, SCENARIO___REFRESH_SELECTED_SORTING_PLANS);
		createEOperation(scenarioEClass, SCENARIO___REFRESH);
		createEOperation(scenarioEClass, SCENARIO___REFRESH_SORTING_PLAN_PRODUCT);
		createEOperation(scenarioEClass, SCENARIO___REFRESH_END_PRODUCTS);
		createEOperation(scenarioEClass, SCENARIO___REFRESH_SORTING_PATHS);
		createEOperation(scenarioEClass, SCENARIO___TEST);

		sortingPlanEClass = createEClass(SORTING_PLAN);
		createEReference(sortingPlanEClass, SORTING_PLAN__OUTPUTS);
		createEReference(sortingPlanEClass, SORTING_PLAN__END_PRODUCTS);
		createEReference(sortingPlanEClass, SORTING_PLAN__FPD_SORTING_PLAN);
		createEReference(sortingPlanEClass, SORTING_PLAN__INPUTS);
		createEReference(sortingPlanEClass, SORTING_PLAN__SCENARIO);
		createEAttribute(sortingPlanEClass, SORTING_PLAN__DESCRIPTION);
		createEAttribute(sortingPlanEClass, SORTING_PLAN__SELECTED);
		createEOperation(sortingPlanEClass, SORTING_PLAN___REFRESH_INPUTS);
		createEOperation(sortingPlanEClass, SORTING_PLAN___REFRESH_OUTPUTS);
		createEOperation(sortingPlanEClass, SORTING_PLAN___REFRESH);

		endProductEClass = createEClass(END_PRODUCT);
		createEReference(endProductEClass, END_PRODUCT__FPD_SORTING_LEVEL);
		createEReference(endProductEClass, END_PRODUCT__SORTING_PLAN_PRODUCT);
		createEAttribute(endProductEClass, END_PRODUCT__DESCRIPTION);
		createEReference(endProductEClass, END_PRODUCT__SORTING_PLANS);
		createEReference(endProductEClass, END_PRODUCT__SCENARIO);
		createEReference(endProductEClass, END_PRODUCT__SCENARIO_AS_SELECTED);
		createEReference(endProductEClass, END_PRODUCT__PRODUCTS_CONTAINING);
		createEAttribute(endProductEClass, END_PRODUCT__SELECTED);
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
		createEReference(sortingPlanProductEClass, SORTING_PLAN_PRODUCT__SORTING_PATHS);
		createEReference(sortingPlanProductEClass, SORTING_PLAN_PRODUCT__END_PRODUCTS);

		sortingPlanOutputEClass = createEClass(SORTING_PLAN_OUTPUT);
		createEReference(sortingPlanOutputEClass, SORTING_PLAN_OUTPUT__FPD_SORTING_PLAN_OUTPUT);
		createEReference(sortingPlanOutputEClass, SORTING_PLAN_OUTPUT__OUTPUT_PRODUCT);
		createEAttribute(sortingPlanOutputEClass, SORTING_PLAN_OUTPUT__DESCRIPTION);
		createEReference(sortingPlanOutputEClass, SORTING_PLAN_OUTPUT__SORTING_PLAN);
		createEOperation(sortingPlanOutputEClass, SORTING_PLAN_OUTPUT___REFESH_SORTED_END_PRODUCTS);

		sortingPlanInputEClass = createEClass(SORTING_PLAN_INPUT);
		createEReference(sortingPlanInputEClass, SORTING_PLAN_INPUT__INPUT_PRODUCT);
		createEReference(sortingPlanInputEClass, SORTING_PLAN_INPUT__FPD_SORTING_PLAN_INPUT);
		createEAttribute(sortingPlanInputEClass, SORTING_PLAN_INPUT__DESCRIPTION);
		createEReference(sortingPlanInputEClass, SORTING_PLAN_INPUT__SORTING_PLAN);

		endProductSortingPlanEClass = createEClass(END_PRODUCT_SORTING_PLAN);
		createEReference(endProductSortingPlanEClass, END_PRODUCT_SORTING_PLAN__END_PRODUCT);
		createEReference(endProductSortingPlanEClass, END_PRODUCT_SORTING_PLAN__SORTING_PLAN);
		createEAttribute(endProductSortingPlanEClass, END_PRODUCT_SORTING_PLAN__DESCRIPTION);
		createEReference(endProductSortingPlanEClass, END_PRODUCT_SORTING_PLAN__OUTPUTS);
		createEReference(endProductSortingPlanEClass, END_PRODUCT_SORTING_PLAN__INPUTS);
		createEReference(endProductSortingPlanEClass, END_PRODUCT_SORTING_PLAN__SELECTED_OUTPUT);
		createEAttribute(endProductSortingPlanEClass, END_PRODUCT_SORTING_PLAN__SORTING_DISTANCE);
		createEAttribute(endProductSortingPlanEClass, END_PRODUCT_SORTING_PLAN__SORTED);

		endProductSortingPlanInputEClass = createEClass(END_PRODUCT_SORTING_PLAN_INPUT);
		createEReference(endProductSortingPlanInputEClass, END_PRODUCT_SORTING_PLAN_INPUT__SORTING_PLAN);
		createEReference(endProductSortingPlanInputEClass, END_PRODUCT_SORTING_PLAN_INPUT__INPUT_PRODUCT);
		createEReference(endProductSortingPlanInputEClass, END_PRODUCT_SORTING_PLAN_INPUT__SORTING_PLAN_INPUT);
		createEAttribute(endProductSortingPlanInputEClass, END_PRODUCT_SORTING_PLAN_INPUT__DESCRIPTION);

		endProductSortingPlanOutputEClass = createEClass(END_PRODUCT_SORTING_PLAN_OUTPUT);
		createEReference(endProductSortingPlanOutputEClass, END_PRODUCT_SORTING_PLAN_OUTPUT__SORTING_PLAN);
		createEReference(endProductSortingPlanOutputEClass, END_PRODUCT_SORTING_PLAN_OUTPUT__OUTPUT_PRODUCT);
		createEReference(endProductSortingPlanOutputEClass, END_PRODUCT_SORTING_PLAN_OUTPUT__SORTING_PLAN_OUTPUT);
		createEAttribute(endProductSortingPlanOutputEClass, END_PRODUCT_SORTING_PLAN_OUTPUT__SELECTED);
		createEAttribute(endProductSortingPlanOutputEClass, END_PRODUCT_SORTING_PLAN_OUTPUT__DESCRIPTION);

		endProductInProductEClass = createEClass(END_PRODUCT_IN_PRODUCT);
		createEReference(endProductInProductEClass, END_PRODUCT_IN_PRODUCT__END_PRODUCTS_CONTAINED);
		createEReference(endProductInProductEClass, END_PRODUCT_IN_PRODUCT__SORTING_PLANS_PRODUCING);
		createEReference(endProductInProductEClass, END_PRODUCT_IN_PRODUCT__SORTING_PLANS_ACCEPTING);
		createEReference(endProductInProductEClass, END_PRODUCT_IN_PRODUCT__PRODUCT);
		createEAttribute(endProductInProductEClass, END_PRODUCT_IN_PRODUCT__DESCRIPTION);
		createEAttribute(endProductInProductEClass, END_PRODUCT_IN_PRODUCT__SORTED);

		sortingPathEClass = createEClass(SORTING_PATH);
		createEReference(sortingPathEClass, SORTING_PATH__OUTPUT_LAST_SEGMENT);
		createEReference(sortingPathEClass, SORTING_PATH__BEFORE_LAST_SEGMENT);
		createEReference(sortingPathEClass, SORTING_PATH__SORTED_END_PRODUCTS);
		createEAttribute(sortingPathEClass, SORTING_PATH__DESCRIPTION);
		createEReference(sortingPathEClass, SORTING_PATH__PRODUCT);
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
		sortingPlanProductEClass.getESuperTypes().add(thePropagatorPackage.getObjectWithPropagatorFunctionAdapter());
		sortingPlanOutputEClass.getESuperTypes().add(thePropagatorPackage.getObjectWithPropagatorFunctionAdapter());
		sortingPlanInputEClass.getESuperTypes().add(thePropagatorPackage.getObjectWithPropagatorFunctionAdapter());

		// Initialize classes, features, and operations; add parameters
		initEClass(scenariosEClass, Scenarios.class, "Scenarios", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getScenarios_Scenarios(), this.getScenario(), null, "Scenarios", null, 0, -1, Scenarios.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getScenarios_Name(), ecorePackage.getEString(), "Name", null, 0, 1, Scenarios.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(scenarioEClass, Scenario.class, "Scenario", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getScenario_SortingPlans(), this.getSortingPlan(), this.getSortingPlan_Scenario(), "SortingPlans", null, 0, -1, Scenario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getScenario_EndProducts(), this.getEndProduct(), this.getEndProduct_Scenario(), "EndProducts", null, 0, -1, Scenario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getScenario_SortingPlanProducts(), this.getSortingPlanProduct(), null, "SortingPlanProducts", null, 0, -1, Scenario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getScenario_Name(), ecorePackage.getEString(), "Name", null, 0, 1, Scenario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getScenario_SortingLevelsWithDestination(), theCptDatasetLoadPackage.getSortingLevelRow(), null, "SortingLevelsWithDestination", null, 0, -1, Scenario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getScenario_SelectedSortingPlans(), theCptDatasetLoadPackage.getSortingPlanRow(), null, "SelectedSortingPlans", null, 0, -1, Scenario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getScenario_SelectedEndProducts(), this.getEndProduct(), this.getEndProduct_ScenarioAsSelected(), "SelectedEndProducts", null, 0, -1, Scenario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getScenario_PrimaryProductsSelected(), this.getSortingPlanProduct(), null, "PrimaryProductsSelected", null, 0, -1, Scenario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getScenario__RefreshSelectedSortingPlans(), null, "refreshSelectedSortingPlans", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getScenario__Refresh(), null, "refresh", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getScenario__RefreshSortingPlanProduct(), null, "refreshSortingPlanProduct", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getScenario__RefreshEndProducts(), null, "refreshEndProducts", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getScenario__RefreshSortingPaths(), null, "refreshSortingPaths", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getScenario__Test(), null, "test", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(sortingPlanEClass, SortingPlan.class, "SortingPlan", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSortingPlan_Outputs(), this.getSortingPlanOutput(), this.getSortingPlanOutput_SortingPlan(), "Outputs", null, 0, -1, SortingPlan.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSortingPlan_EndProducts(), this.getEndProductSortingPlan(), this.getEndProductSortingPlan_SortingPlan(), "EndProducts", null, 0, -1, SortingPlan.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSortingPlan_FPDSortingPlan(), theCptDatasetLoadPackage.getSortingPlanRow(), null, "FPDSortingPlan", null, 0, 1, SortingPlan.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSortingPlan_Inputs(), this.getSortingPlanInput(), this.getSortingPlanInput_SortingPlan(), "Inputs", null, 0, -1, SortingPlan.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSortingPlan_Scenario(), this.getScenario(), this.getScenario_SortingPlans(), "Scenario", null, 1, 1, SortingPlan.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSortingPlan_Description(), ecorePackage.getEString(), "Description", null, 0, 1, SortingPlan.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getSortingPlan_Selected(), ecorePackage.getEBoolean(), "selected", null, 0, 1, SortingPlan.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getSortingPlan__RefreshInputs(), null, "refreshInputs", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getSortingPlan__RefreshOutputs(), null, "refreshOutputs", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getSortingPlan__Refresh(), null, "refresh", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(endProductEClass, EndProduct.class, "EndProduct", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEndProduct_FPDSortingLevel(), theCptDatasetLoadPackage.getSortingLevelRow(), null, "FPDSortingLevel", null, 0, 1, EndProduct.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEndProduct_SortingPlanProduct(), this.getSortingPlanProduct(), this.getSortingPlanProduct_EndProduct(), "SortingPlanProduct", null, 1, 1, EndProduct.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEndProduct_Description(), ecorePackage.getEString(), "Description", null, 0, 1, EndProduct.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getEndProduct_SortingPlans(), this.getEndProductSortingPlan(), this.getEndProductSortingPlan_EndProduct(), "SortingPlans", null, 0, -1, EndProduct.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEndProduct_Scenario(), this.getScenario(), this.getScenario_EndProducts(), "Scenario", null, 1, 1, EndProduct.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEndProduct_ScenarioAsSelected(), this.getScenario(), this.getScenario_SelectedEndProducts(), "ScenarioAsSelected", null, 0, 1, EndProduct.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEndProduct_ProductsContaining(), this.getEndProductInProduct(), this.getEndProductInProduct_EndProductsContained(), "ProductsContaining", null, 0, -1, EndProduct.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEndProduct_Selected(), ecorePackage.getEBoolean(), "Selected", null, 0, 1, EndProduct.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

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
		initEReference(getSortingPlanProduct_SortingPaths(), this.getSortingPath(), this.getSortingPath_Product(), "SortingPaths", null, 0, -1, SortingPlanProduct.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSortingPlanProduct_EndProducts(), this.getEndProductInProduct(), this.getEndProductInProduct_Product(), "EndProducts", null, 0, -1, SortingPlanProduct.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sortingPlanOutputEClass, SortingPlanOutput.class, "SortingPlanOutput", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSortingPlanOutput_FPDSortingPlanOutput(), theCptDatasetLoadPackage.getSortingPlanOutputRow(), null, "FPDSortingPlanOutput", null, 0, 1, SortingPlanOutput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSortingPlanOutput_OutputProduct(), this.getSortingPlanProduct(), this.getSortingPlanProduct_SortingPlansProducing(), "OutputProduct", null, 1, 1, SortingPlanOutput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSortingPlanOutput_Description(), ecorePackage.getEString(), "Description", null, 0, 1, SortingPlanOutput.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getSortingPlanOutput_SortingPlan(), this.getSortingPlan(), this.getSortingPlan_Outputs(), "SortingPlan", null, 1, 1, SortingPlanOutput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getSortingPlanOutput__RefeshSortedEndProducts(), null, "refeshSortedEndProducts", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(sortingPlanInputEClass, SortingPlanInput.class, "SortingPlanInput", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSortingPlanInput_InputProduct(), this.getSortingPlanProduct(), this.getSortingPlanProduct_SortingPlansAccepting(), "InputProduct", null, 1, 1, SortingPlanInput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSortingPlanInput_FPDSortingPlanInput(), theCptDatasetLoadPackage.getSortingPlanInputRow(), null, "FPDSortingPlanInput", null, 0, 1, SortingPlanInput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSortingPlanInput_Description(), ecorePackage.getEString(), "Description", null, 0, 1, SortingPlanInput.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getSortingPlanInput_SortingPlan(), this.getSortingPlan(), this.getSortingPlan_Inputs(), "SortingPlan", null, 1, 1, SortingPlanInput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(endProductSortingPlanEClass, EndProductSortingPlan.class, "EndProductSortingPlan", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEndProductSortingPlan_EndProduct(), this.getEndProduct(), this.getEndProduct_SortingPlans(), "EndProduct", null, 1, 1, EndProductSortingPlan.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEndProductSortingPlan_SortingPlan(), this.getSortingPlan(), this.getSortingPlan_EndProducts(), "SortingPlan", null, 1, 1, EndProductSortingPlan.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEndProductSortingPlan_Description(), ecorePackage.getEString(), "Description", null, 0, 1, EndProductSortingPlan.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getEndProductSortingPlan_Outputs(), this.getEndProductSortingPlanOutput(), this.getEndProductSortingPlanOutput_SortingPlan(), "Outputs", null, 0, -1, EndProductSortingPlan.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEndProductSortingPlan_Inputs(), this.getEndProductSortingPlanInput(), this.getEndProductSortingPlanInput_SortingPlan(), "Inputs", null, 0, -1, EndProductSortingPlan.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEndProductSortingPlan_SelectedOutput(), this.getEndProductSortingPlanOutput(), null, "SelectedOutput", null, 1, 1, EndProductSortingPlan.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEndProductSortingPlan_SortingDistance(), ecorePackage.getEInt(), "SortingDistance", "0", 0, 1, EndProductSortingPlan.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEndProductSortingPlan_Sorted(), ecorePackage.getEBoolean(), "Sorted", null, 0, 1, EndProductSortingPlan.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(endProductSortingPlanInputEClass, EndProductSortingPlanInput.class, "EndProductSortingPlanInput", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEndProductSortingPlanInput_SortingPlan(), this.getEndProductSortingPlan(), this.getEndProductSortingPlan_Inputs(), "SortingPlan", null, 1, 1, EndProductSortingPlanInput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEndProductSortingPlanInput_InputProduct(), this.getEndProductInProduct(), this.getEndProductInProduct_SortingPlansAccepting(), "InputProduct", null, 1, 1, EndProductSortingPlanInput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEndProductSortingPlanInput_SortingPlanInput(), this.getSortingPlanInput(), null, "SortingPlanInput", null, 0, 1, EndProductSortingPlanInput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEndProductSortingPlanInput_Description(), ecorePackage.getEString(), "Description", null, 0, 1, EndProductSortingPlanInput.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(endProductSortingPlanOutputEClass, EndProductSortingPlanOutput.class, "EndProductSortingPlanOutput", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEndProductSortingPlanOutput_SortingPlan(), this.getEndProductSortingPlan(), this.getEndProductSortingPlan_Outputs(), "SortingPlan", null, 1, 1, EndProductSortingPlanOutput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEndProductSortingPlanOutput_OutputProduct(), this.getEndProductInProduct(), this.getEndProductInProduct_SortingPlansProducing(), "OutputProduct", null, 1, 1, EndProductSortingPlanOutput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEndProductSortingPlanOutput_SortingPlanOutput(), this.getSortingPlanOutput(), null, "SortingPlanOutput", null, 0, 1, EndProductSortingPlanOutput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEndProductSortingPlanOutput_Selected(), ecorePackage.getEBoolean(), "Selected", null, 0, 1, EndProductSortingPlanOutput.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getEndProductSortingPlanOutput_Description(), ecorePackage.getEString(), "Description", null, 0, 1, EndProductSortingPlanOutput.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(endProductInProductEClass, EndProductInProduct.class, "EndProductInProduct", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEndProductInProduct_EndProductsContained(), this.getEndProduct(), this.getEndProduct_ProductsContaining(), "EndProductsContained", null, 0, 1, EndProductInProduct.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEndProductInProduct_SortingPlansProducing(), this.getEndProductSortingPlanOutput(), this.getEndProductSortingPlanOutput_OutputProduct(), "SortingPlansProducing", null, 0, -1, EndProductInProduct.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEndProductInProduct_SortingPlansAccepting(), this.getEndProductSortingPlanInput(), this.getEndProductSortingPlanInput_InputProduct(), "SortingPlansAccepting", null, 0, -1, EndProductInProduct.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEndProductInProduct_Product(), this.getSortingPlanProduct(), this.getSortingPlanProduct_EndProducts(), "Product", null, 0, 1, EndProductInProduct.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEndProductInProduct_Description(), ecorePackage.getEString(), "Description", null, 0, 1, EndProductInProduct.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getEndProductInProduct_Sorted(), ecorePackage.getEBoolean(), "Sorted", null, 0, 1, EndProductInProduct.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(sortingPathEClass, SortingPath.class, "SortingPath", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSortingPath_OutputLastSegment(), this.getSortingPlanOutput(), null, "OutputLastSegment", null, 0, 1, SortingPath.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSortingPath_BeforeLastSegment(), this.getSortingPath(), null, "BeforeLastSegment", null, 0, 1, SortingPath.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSortingPath_SortedEndProducts(), this.getEndProduct(), null, "SortedEndProducts", null, 0, -1, SortingPath.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSortingPath_Description(), ecorePackage.getEString(), "Description", null, 0, 1, SortingPath.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getSortingPath_Product(), this.getSortingPlanProduct(), this.getSortingPlanProduct_SortingPaths(), "Product", null, 1, 1, SortingPath.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //cptspPackageImpl
