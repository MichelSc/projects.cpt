/**
 */
package com.misc.projects.SortingPlans;

import com.misc.common.moplaf.propagator.PropagatorPackage;
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
 * @see com.misc.projects.SortingPlans.cptspFactory
 * @model kind="package"
 * @generated
 */
public interface cptspPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "SortingPlans";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://com.misc.projects.cpt.sortingplans";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "cptsp";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	cptspPackage eINSTANCE = com.misc.projects.SortingPlans.impl.cptspPackageImpl.init();

	/**
	 * The meta object id for the '{@link com.misc.projects.SortingPlans.impl.ScenariosImpl <em>Scenarios</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.projects.SortingPlans.impl.ScenariosImpl
	 * @see com.misc.projects.SortingPlans.impl.cptspPackageImpl#getScenarios()
	 * @generated
	 */
	int SCENARIOS = 0;

	/**
	 * The feature id for the '<em><b>Scenarios</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIOS__SCENARIOS = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIOS__NAME = 1;

	/**
	 * The number of structural features of the '<em>Scenarios</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIOS_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Scenarios</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIOS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.misc.projects.SortingPlans.impl.ScenarioImpl <em>Scenario</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.projects.SortingPlans.impl.ScenarioImpl
	 * @see com.misc.projects.SortingPlans.impl.cptspPackageImpl#getScenario()
	 * @generated
	 */
	int SCENARIO = 1;

	/**
	 * The feature id for the '<em><b>Sorting Plans</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO__SORTING_PLANS = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTION_ADAPTER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>End Products</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO__END_PRODUCTS = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTION_ADAPTER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Sorting Plan Products</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO__SORTING_PLAN_PRODUCTS = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTION_ADAPTER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO__NAME = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTION_ADAPTER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Sorting Levels With Destination</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO__SORTING_LEVELS_WITH_DESTINATION = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTION_ADAPTER_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Selected Sorting Plans</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO__SELECTED_SORTING_PLANS = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTION_ADAPTER_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Selected End Products</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO__SELECTED_END_PRODUCTS = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTION_ADAPTER_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Primary Products Selected</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO__PRIMARY_PRODUCTS_SELECTED = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTION_ADAPTER_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Scenario</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO_FEATURE_COUNT = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTION_ADAPTER_FEATURE_COUNT + 8;

	/**
	 * The operation id for the '<em>Add Propagator Function Adapter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO___ADD_PROPAGATOR_FUNCTION_ADAPTER = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTION_ADAPTER___ADD_PROPAGATOR_FUNCTION_ADAPTER;

	/**
	 * The operation id for the '<em>Refresh Selected Sorting Plans</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO___REFRESH_SELECTED_SORTING_PLANS = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTION_ADAPTER_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO___REFRESH = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTION_ADAPTER_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Refresh Sorting Plan Product</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO___REFRESH_SORTING_PLAN_PRODUCT = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTION_ADAPTER_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Refresh End Products</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO___REFRESH_END_PRODUCTS = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTION_ADAPTER_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Refresh Sorting Paths</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO___REFRESH_SORTING_PATHS = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTION_ADAPTER_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Test</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO___TEST = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTION_ADAPTER_OPERATION_COUNT + 6;

	/**
	 * The number of operations of the '<em>Scenario</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO_OPERATION_COUNT = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTION_ADAPTER_OPERATION_COUNT + 7;

	/**
	 * The meta object id for the '{@link com.misc.projects.SortingPlans.impl.SortingPlanImpl <em>Sorting Plan</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.projects.SortingPlans.impl.SortingPlanImpl
	 * @see com.misc.projects.SortingPlans.impl.cptspPackageImpl#getSortingPlan()
	 * @generated
	 */
	int SORTING_PLAN = 2;

	/**
	 * The feature id for the '<em><b>Outputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTING_PLAN__OUTPUTS = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTION_ADAPTER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>End Products</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTING_PLAN__END_PRODUCTS = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTION_ADAPTER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>FPD Sorting Plan</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTING_PLAN__FPD_SORTING_PLAN = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTION_ADAPTER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Inputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTING_PLAN__INPUTS = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTION_ADAPTER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Scenario</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTING_PLAN__SCENARIO = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTION_ADAPTER_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTING_PLAN__DESCRIPTION = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTION_ADAPTER_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Selected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTING_PLAN__SELECTED = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTION_ADAPTER_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Sorting Plan</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTING_PLAN_FEATURE_COUNT = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTION_ADAPTER_FEATURE_COUNT + 7;

	/**
	 * The operation id for the '<em>Add Propagator Function Adapter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTING_PLAN___ADD_PROPAGATOR_FUNCTION_ADAPTER = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTION_ADAPTER___ADD_PROPAGATOR_FUNCTION_ADAPTER;

	/**
	 * The operation id for the '<em>Refresh Inputs</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTING_PLAN___REFRESH_INPUTS = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTION_ADAPTER_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Refresh Outputs</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTING_PLAN___REFRESH_OUTPUTS = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTION_ADAPTER_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTING_PLAN___REFRESH = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTION_ADAPTER_OPERATION_COUNT + 2;

	/**
	 * The number of operations of the '<em>Sorting Plan</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTING_PLAN_OPERATION_COUNT = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTION_ADAPTER_OPERATION_COUNT + 3;

	/**
	 * The meta object id for the '{@link com.misc.projects.SortingPlans.impl.EndProductImpl <em>End Product</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.projects.SortingPlans.impl.EndProductImpl
	 * @see com.misc.projects.SortingPlans.impl.cptspPackageImpl#getEndProduct()
	 * @generated
	 */
	int END_PRODUCT = 3;

	/**
	 * The feature id for the '<em><b>FPD Sorting Level</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_PRODUCT__FPD_SORTING_LEVEL = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTION_ADAPTER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Sorting Plan Product</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_PRODUCT__SORTING_PLAN_PRODUCT = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTION_ADAPTER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_PRODUCT__DESCRIPTION = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTION_ADAPTER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Sorting Plans</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_PRODUCT__SORTING_PLANS = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTION_ADAPTER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Scenario</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_PRODUCT__SCENARIO = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTION_ADAPTER_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Scenario As Selected</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_PRODUCT__SCENARIO_AS_SELECTED = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTION_ADAPTER_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Products Containing</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_PRODUCT__PRODUCTS_CONTAINING = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTION_ADAPTER_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Selected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_PRODUCT__SELECTED = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTION_ADAPTER_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>End Product</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_PRODUCT_FEATURE_COUNT = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTION_ADAPTER_FEATURE_COUNT + 8;

	/**
	 * The operation id for the '<em>Add Propagator Function Adapter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_PRODUCT___ADD_PROPAGATOR_FUNCTION_ADAPTER = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTION_ADAPTER___ADD_PROPAGATOR_FUNCTION_ADAPTER;

	/**
	 * The operation id for the '<em>Refresh Sorting Plans</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_PRODUCT___REFRESH_SORTING_PLANS = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTION_ADAPTER_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>End Product</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_PRODUCT_OPERATION_COUNT = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTION_ADAPTER_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link com.misc.projects.SortingPlans.impl.SortingPlanProductImpl <em>Sorting Plan Product</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.projects.SortingPlans.impl.SortingPlanProductImpl
	 * @see com.misc.projects.SortingPlans.impl.cptspPackageImpl#getSortingPlanProduct()
	 * @generated
	 */
	int SORTING_PLAN_PRODUCT = 4;

	/**
	 * The feature id for the '<em><b>FPD Sorting Level</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTING_PLAN_PRODUCT__FPD_SORTING_LEVEL = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTION_ADAPTER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Sorting Plans Producing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTING_PLAN_PRODUCT__SORTING_PLANS_PRODUCING = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTION_ADAPTER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Sorting Plans Accepting</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTING_PLAN_PRODUCT__SORTING_PLANS_ACCEPTING = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTION_ADAPTER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Sorting Level AVCS Sk</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTING_PLAN_PRODUCT__SORTING_LEVEL_AVCS_SK = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTION_ADAPTER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Mechanization Level Sk</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTING_PLAN_PRODUCT__MECHANIZATION_LEVEL_SK = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTION_ADAPTER_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Throughput Type Sk</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTING_PLAN_PRODUCT__THROUGHPUT_TYPE_SK = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTION_ADAPTER_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Destination Sk</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTING_PLAN_PRODUCT__DESTINATION_SK = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTION_ADAPTER_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTING_PLAN_PRODUCT__DESCRIPTION = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTION_ADAPTER_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>End Product</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTING_PLAN_PRODUCT__END_PRODUCT = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTION_ADAPTER_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Sorting Paths</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTING_PLAN_PRODUCT__SORTING_PATHS = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTION_ADAPTER_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>End Products</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTING_PLAN_PRODUCT__END_PRODUCTS = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTION_ADAPTER_FEATURE_COUNT + 10;

	/**
	 * The number of structural features of the '<em>Sorting Plan Product</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTING_PLAN_PRODUCT_FEATURE_COUNT = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTION_ADAPTER_FEATURE_COUNT + 11;

	/**
	 * The operation id for the '<em>Add Propagator Function Adapter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTING_PLAN_PRODUCT___ADD_PROPAGATOR_FUNCTION_ADAPTER = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTION_ADAPTER___ADD_PROPAGATOR_FUNCTION_ADAPTER;

	/**
	 * The number of operations of the '<em>Sorting Plan Product</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTING_PLAN_PRODUCT_OPERATION_COUNT = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTION_ADAPTER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.misc.projects.SortingPlans.impl.SortingPlanOutputImpl <em>Sorting Plan Output</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.projects.SortingPlans.impl.SortingPlanOutputImpl
	 * @see com.misc.projects.SortingPlans.impl.cptspPackageImpl#getSortingPlanOutput()
	 * @generated
	 */
	int SORTING_PLAN_OUTPUT = 5;

	/**
	 * The meta object id for the '{@link com.misc.projects.SortingPlans.impl.SortingPlanInputImpl <em>Sorting Plan Input</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.projects.SortingPlans.impl.SortingPlanInputImpl
	 * @see com.misc.projects.SortingPlans.impl.cptspPackageImpl#getSortingPlanInput()
	 * @generated
	 */
	int SORTING_PLAN_INPUT = 6;

	/**
	 * The feature id for the '<em><b>FPD Sorting Plan Output</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTING_PLAN_OUTPUT__FPD_SORTING_PLAN_OUTPUT = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTION_ADAPTER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Output Product</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTING_PLAN_OUTPUT__OUTPUT_PRODUCT = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTION_ADAPTER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTING_PLAN_OUTPUT__DESCRIPTION = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTION_ADAPTER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Sorting Plan</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTING_PLAN_OUTPUT__SORTING_PLAN = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTION_ADAPTER_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Sorting Plan Output</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTING_PLAN_OUTPUT_FEATURE_COUNT = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTION_ADAPTER_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Add Propagator Function Adapter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTING_PLAN_OUTPUT___ADD_PROPAGATOR_FUNCTION_ADAPTER = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTION_ADAPTER___ADD_PROPAGATOR_FUNCTION_ADAPTER;

	/**
	 * The operation id for the '<em>Refesh Sorted End Products</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTING_PLAN_OUTPUT___REFESH_SORTED_END_PRODUCTS = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTION_ADAPTER_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Sorting Plan Output</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTING_PLAN_OUTPUT_OPERATION_COUNT = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTION_ADAPTER_OPERATION_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Input Product</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTING_PLAN_INPUT__INPUT_PRODUCT = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTION_ADAPTER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>FPD Sorting Plan Input</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTING_PLAN_INPUT__FPD_SORTING_PLAN_INPUT = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTION_ADAPTER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTING_PLAN_INPUT__DESCRIPTION = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTION_ADAPTER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Sorting Plan</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTING_PLAN_INPUT__SORTING_PLAN = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTION_ADAPTER_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Sorting Plan Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTING_PLAN_INPUT_FEATURE_COUNT = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTION_ADAPTER_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Add Propagator Function Adapter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTING_PLAN_INPUT___ADD_PROPAGATOR_FUNCTION_ADAPTER = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTION_ADAPTER___ADD_PROPAGATOR_FUNCTION_ADAPTER;

	/**
	 * The number of operations of the '<em>Sorting Plan Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTING_PLAN_INPUT_OPERATION_COUNT = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTION_ADAPTER_OPERATION_COUNT + 0;


	/**
	 * The meta object id for the '{@link com.misc.projects.SortingPlans.impl.EndProductSortingPlanImpl <em>End Product Sorting Plan</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.projects.SortingPlans.impl.EndProductSortingPlanImpl
	 * @see com.misc.projects.SortingPlans.impl.cptspPackageImpl#getEndProductSortingPlan()
	 * @generated
	 */
	int END_PRODUCT_SORTING_PLAN = 7;

	/**
	 * The feature id for the '<em><b>End Product</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_PRODUCT_SORTING_PLAN__END_PRODUCT = 0;

	/**
	 * The feature id for the '<em><b>Sorting Plan</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_PRODUCT_SORTING_PLAN__SORTING_PLAN = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_PRODUCT_SORTING_PLAN__DESCRIPTION = 2;

	/**
	 * The feature id for the '<em><b>Outputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_PRODUCT_SORTING_PLAN__OUTPUTS = 3;

	/**
	 * The feature id for the '<em><b>Inputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_PRODUCT_SORTING_PLAN__INPUTS = 4;

	/**
	 * The feature id for the '<em><b>Selected Output</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_PRODUCT_SORTING_PLAN__SELECTED_OUTPUT = 5;

	/**
	 * The feature id for the '<em><b>Sorting Distance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_PRODUCT_SORTING_PLAN__SORTING_DISTANCE = 6;

	/**
	 * The number of structural features of the '<em>End Product Sorting Plan</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_PRODUCT_SORTING_PLAN_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>End Product Sorting Plan</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_PRODUCT_SORTING_PLAN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.misc.projects.SortingPlans.impl.EndProductSortingPlanInputImpl <em>End Product Sorting Plan Input</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.projects.SortingPlans.impl.EndProductSortingPlanInputImpl
	 * @see com.misc.projects.SortingPlans.impl.cptspPackageImpl#getEndProductSortingPlanInput()
	 * @generated
	 */
	int END_PRODUCT_SORTING_PLAN_INPUT = 8;

	/**
	 * The feature id for the '<em><b>Sorting Plan</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_PRODUCT_SORTING_PLAN_INPUT__SORTING_PLAN = 0;

	/**
	 * The feature id for the '<em><b>Input Product</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_PRODUCT_SORTING_PLAN_INPUT__INPUT_PRODUCT = 1;

	/**
	 * The feature id for the '<em><b>Sorting Plan Input</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_PRODUCT_SORTING_PLAN_INPUT__SORTING_PLAN_INPUT = 2;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_PRODUCT_SORTING_PLAN_INPUT__DESCRIPTION = 3;

	/**
	 * The number of structural features of the '<em>End Product Sorting Plan Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_PRODUCT_SORTING_PLAN_INPUT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>End Product Sorting Plan Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_PRODUCT_SORTING_PLAN_INPUT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.misc.projects.SortingPlans.impl.EndProductSortingPlanOutputImpl <em>End Product Sorting Plan Output</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.projects.SortingPlans.impl.EndProductSortingPlanOutputImpl
	 * @see com.misc.projects.SortingPlans.impl.cptspPackageImpl#getEndProductSortingPlanOutput()
	 * @generated
	 */
	int END_PRODUCT_SORTING_PLAN_OUTPUT = 9;

	/**
	 * The feature id for the '<em><b>Sorting Plan</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_PRODUCT_SORTING_PLAN_OUTPUT__SORTING_PLAN = 0;

	/**
	 * The feature id for the '<em><b>Output Product</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_PRODUCT_SORTING_PLAN_OUTPUT__OUTPUT_PRODUCT = 1;

	/**
	 * The feature id for the '<em><b>Sorting Plan Output</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_PRODUCT_SORTING_PLAN_OUTPUT__SORTING_PLAN_OUTPUT = 2;

	/**
	 * The feature id for the '<em><b>Selected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_PRODUCT_SORTING_PLAN_OUTPUT__SELECTED = 3;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_PRODUCT_SORTING_PLAN_OUTPUT__DESCRIPTION = 4;

	/**
	 * The number of structural features of the '<em>End Product Sorting Plan Output</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_PRODUCT_SORTING_PLAN_OUTPUT_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>End Product Sorting Plan Output</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_PRODUCT_SORTING_PLAN_OUTPUT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.misc.projects.SortingPlans.impl.EndProductInProductImpl <em>End Product In Product</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.projects.SortingPlans.impl.EndProductInProductImpl
	 * @see com.misc.projects.SortingPlans.impl.cptspPackageImpl#getEndProductInProduct()
	 * @generated
	 */
	int END_PRODUCT_IN_PRODUCT = 10;

	/**
	 * The feature id for the '<em><b>End Products Contained</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_PRODUCT_IN_PRODUCT__END_PRODUCTS_CONTAINED = 0;

	/**
	 * The feature id for the '<em><b>Sorting Plans Producing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_PRODUCT_IN_PRODUCT__SORTING_PLANS_PRODUCING = 1;

	/**
	 * The feature id for the '<em><b>Sorting Plans Accepting</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_PRODUCT_IN_PRODUCT__SORTING_PLANS_ACCEPTING = 2;

	/**
	 * The feature id for the '<em><b>Product</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_PRODUCT_IN_PRODUCT__PRODUCT = 3;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_PRODUCT_IN_PRODUCT__DESCRIPTION = 4;

	/**
	 * The number of structural features of the '<em>End Product In Product</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_PRODUCT_IN_PRODUCT_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>End Product In Product</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_PRODUCT_IN_PRODUCT_OPERATION_COUNT = 0;


	/**
	 * The meta object id for the '{@link com.misc.projects.SortingPlans.impl.SortingPathImpl <em>Sorting Path</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.projects.SortingPlans.impl.SortingPathImpl
	 * @see com.misc.projects.SortingPlans.impl.cptspPackageImpl#getSortingPath()
	 * @generated
	 */
	int SORTING_PATH = 11;

	/**
	 * The feature id for the '<em><b>Output Last Segment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTING_PATH__OUTPUT_LAST_SEGMENT = 0;

	/**
	 * The feature id for the '<em><b>Before Last Segment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTING_PATH__BEFORE_LAST_SEGMENT = 1;

	/**
	 * The feature id for the '<em><b>Sorted End Products</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTING_PATH__SORTED_END_PRODUCTS = 2;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTING_PATH__DESCRIPTION = 3;

	/**
	 * The feature id for the '<em><b>Product</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTING_PATH__PRODUCT = 4;

	/**
	 * The number of structural features of the '<em>Sorting Path</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTING_PATH_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Sorting Path</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTING_PATH_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link com.misc.projects.SortingPlans.Scenarios <em>Scenarios</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scenarios</em>'.
	 * @see com.misc.projects.SortingPlans.Scenarios
	 * @generated
	 */
	EClass getScenarios();

	/**
	 * Returns the meta object for the containment reference list '{@link com.misc.projects.SortingPlans.Scenarios#getScenarios <em>Scenarios</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Scenarios</em>'.
	 * @see com.misc.projects.SortingPlans.Scenarios#getScenarios()
	 * @see #getScenarios()
	 * @generated
	 */
	EReference getScenarios_Scenarios();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.projects.SortingPlans.Scenarios#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.misc.projects.SortingPlans.Scenarios#getName()
	 * @see #getScenarios()
	 * @generated
	 */
	EAttribute getScenarios_Name();

	/**
	 * Returns the meta object for class '{@link com.misc.projects.SortingPlans.Scenario <em>Scenario</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scenario</em>'.
	 * @see com.misc.projects.SortingPlans.Scenario
	 * @generated
	 */
	EClass getScenario();

	/**
	 * Returns the meta object for the containment reference list '{@link com.misc.projects.SortingPlans.Scenario#getSortingPlans <em>Sorting Plans</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sorting Plans</em>'.
	 * @see com.misc.projects.SortingPlans.Scenario#getSortingPlans()
	 * @see #getScenario()
	 * @generated
	 */
	EReference getScenario_SortingPlans();

	/**
	 * Returns the meta object for the containment reference list '{@link com.misc.projects.SortingPlans.Scenario#getEndProducts <em>End Products</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>End Products</em>'.
	 * @see com.misc.projects.SortingPlans.Scenario#getEndProducts()
	 * @see #getScenario()
	 * @generated
	 */
	EReference getScenario_EndProducts();

	/**
	 * Returns the meta object for the containment reference list '{@link com.misc.projects.SortingPlans.Scenario#getSortingPlanProducts <em>Sorting Plan Products</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sorting Plan Products</em>'.
	 * @see com.misc.projects.SortingPlans.Scenario#getSortingPlanProducts()
	 * @see #getScenario()
	 * @generated
	 */
	EReference getScenario_SortingPlanProducts();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.projects.SortingPlans.Scenario#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.misc.projects.SortingPlans.Scenario#getName()
	 * @see #getScenario()
	 * @generated
	 */
	EAttribute getScenario_Name();

	/**
	 * Returns the meta object for the reference list '{@link com.misc.projects.SortingPlans.Scenario#getSortingLevelsWithDestination <em>Sorting Levels With Destination</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Sorting Levels With Destination</em>'.
	 * @see com.misc.projects.SortingPlans.Scenario#getSortingLevelsWithDestination()
	 * @see #getScenario()
	 * @generated
	 */
	EReference getScenario_SortingLevelsWithDestination();

	/**
	 * Returns the meta object for the reference list '{@link com.misc.projects.SortingPlans.Scenario#getSelectedSortingPlans <em>Selected Sorting Plans</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Selected Sorting Plans</em>'.
	 * @see com.misc.projects.SortingPlans.Scenario#getSelectedSortingPlans()
	 * @see #getScenario()
	 * @generated
	 */
	EReference getScenario_SelectedSortingPlans();

	/**
	 * Returns the meta object for the reference list '{@link com.misc.projects.SortingPlans.Scenario#getSelectedEndProducts <em>Selected End Products</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Selected End Products</em>'.
	 * @see com.misc.projects.SortingPlans.Scenario#getSelectedEndProducts()
	 * @see #getScenario()
	 * @generated
	 */
	EReference getScenario_SelectedEndProducts();

	/**
	 * Returns the meta object for the reference list '{@link com.misc.projects.SortingPlans.Scenario#getPrimaryProductsSelected <em>Primary Products Selected</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Primary Products Selected</em>'.
	 * @see com.misc.projects.SortingPlans.Scenario#getPrimaryProductsSelected()
	 * @see #getScenario()
	 * @generated
	 */
	EReference getScenario_PrimaryProductsSelected();

	/**
	 * Returns the meta object for the '{@link com.misc.projects.SortingPlans.Scenario#refreshSelectedSortingPlans() <em>Refresh Selected Sorting Plans</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Refresh Selected Sorting Plans</em>' operation.
	 * @see com.misc.projects.SortingPlans.Scenario#refreshSelectedSortingPlans()
	 * @generated
	 */
	EOperation getScenario__RefreshSelectedSortingPlans();

	/**
	 * Returns the meta object for the '{@link com.misc.projects.SortingPlans.Scenario#refresh() <em>Refresh</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Refresh</em>' operation.
	 * @see com.misc.projects.SortingPlans.Scenario#refresh()
	 * @generated
	 */
	EOperation getScenario__Refresh();

	/**
	 * Returns the meta object for the '{@link com.misc.projects.SortingPlans.Scenario#refreshSortingPlanProduct() <em>Refresh Sorting Plan Product</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Refresh Sorting Plan Product</em>' operation.
	 * @see com.misc.projects.SortingPlans.Scenario#refreshSortingPlanProduct()
	 * @generated
	 */
	EOperation getScenario__RefreshSortingPlanProduct();

	/**
	 * Returns the meta object for the '{@link com.misc.projects.SortingPlans.Scenario#refreshEndProducts() <em>Refresh End Products</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Refresh End Products</em>' operation.
	 * @see com.misc.projects.SortingPlans.Scenario#refreshEndProducts()
	 * @generated
	 */
	EOperation getScenario__RefreshEndProducts();

	/**
	 * Returns the meta object for the '{@link com.misc.projects.SortingPlans.Scenario#refreshSortingPaths() <em>Refresh Sorting Paths</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Refresh Sorting Paths</em>' operation.
	 * @see com.misc.projects.SortingPlans.Scenario#refreshSortingPaths()
	 * @generated
	 */
	EOperation getScenario__RefreshSortingPaths();

	/**
	 * Returns the meta object for the '{@link com.misc.projects.SortingPlans.Scenario#test() <em>Test</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Test</em>' operation.
	 * @see com.misc.projects.SortingPlans.Scenario#test()
	 * @generated
	 */
	EOperation getScenario__Test();

	/**
	 * Returns the meta object for class '{@link com.misc.projects.SortingPlans.SortingPlan <em>Sorting Plan</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sorting Plan</em>'.
	 * @see com.misc.projects.SortingPlans.SortingPlan
	 * @generated
	 */
	EClass getSortingPlan();

	/**
	 * Returns the meta object for the containment reference list '{@link com.misc.projects.SortingPlans.SortingPlan#getOutputs <em>Outputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Outputs</em>'.
	 * @see com.misc.projects.SortingPlans.SortingPlan#getOutputs()
	 * @see #getSortingPlan()
	 * @generated
	 */
	EReference getSortingPlan_Outputs();

	/**
	 * Returns the meta object for the containment reference list '{@link com.misc.projects.SortingPlans.SortingPlan#getInputs <em>Inputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Inputs</em>'.
	 * @see com.misc.projects.SortingPlans.SortingPlan#getInputs()
	 * @see #getSortingPlan()
	 * @generated
	 */
	EReference getSortingPlan_Inputs();

	/**
	 * Returns the meta object for the container reference '{@link com.misc.projects.SortingPlans.SortingPlan#getScenario <em>Scenario</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Scenario</em>'.
	 * @see com.misc.projects.SortingPlans.SortingPlan#getScenario()
	 * @see #getSortingPlan()
	 * @generated
	 */
	EReference getSortingPlan_Scenario();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.projects.SortingPlans.SortingPlan#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see com.misc.projects.SortingPlans.SortingPlan#getDescription()
	 * @see #getSortingPlan()
	 * @generated
	 */
	EAttribute getSortingPlan_Description();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.projects.SortingPlans.SortingPlan#isSelected <em>Selected</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Selected</em>'.
	 * @see com.misc.projects.SortingPlans.SortingPlan#isSelected()
	 * @see #getSortingPlan()
	 * @generated
	 */
	EAttribute getSortingPlan_Selected();

	/**
	 * Returns the meta object for the '{@link com.misc.projects.SortingPlans.SortingPlan#refreshInputs() <em>Refresh Inputs</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Refresh Inputs</em>' operation.
	 * @see com.misc.projects.SortingPlans.SortingPlan#refreshInputs()
	 * @generated
	 */
	EOperation getSortingPlan__RefreshInputs();

	/**
	 * Returns the meta object for the '{@link com.misc.projects.SortingPlans.SortingPlan#refreshOutputs() <em>Refresh Outputs</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Refresh Outputs</em>' operation.
	 * @see com.misc.projects.SortingPlans.SortingPlan#refreshOutputs()
	 * @generated
	 */
	EOperation getSortingPlan__RefreshOutputs();

	/**
	 * Returns the meta object for the '{@link com.misc.projects.SortingPlans.SortingPlan#refresh() <em>Refresh</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Refresh</em>' operation.
	 * @see com.misc.projects.SortingPlans.SortingPlan#refresh()
	 * @generated
	 */
	EOperation getSortingPlan__Refresh();

	/**
	 * Returns the meta object for the reference list '{@link com.misc.projects.SortingPlans.SortingPlan#getEndProducts <em>End Products</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>End Products</em>'.
	 * @see com.misc.projects.SortingPlans.SortingPlan#getEndProducts()
	 * @see #getSortingPlan()
	 * @generated
	 */
	EReference getSortingPlan_EndProducts();

	/**
	 * Returns the meta object for the reference '{@link com.misc.projects.SortingPlans.SortingPlan#getFPDSortingPlan <em>FPD Sorting Plan</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>FPD Sorting Plan</em>'.
	 * @see com.misc.projects.SortingPlans.SortingPlan#getFPDSortingPlan()
	 * @see #getSortingPlan()
	 * @generated
	 */
	EReference getSortingPlan_FPDSortingPlan();

	/**
	 * Returns the meta object for class '{@link com.misc.projects.SortingPlans.EndProduct <em>End Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>End Product</em>'.
	 * @see com.misc.projects.SortingPlans.EndProduct
	 * @generated
	 */
	EClass getEndProduct();

	/**
	 * Returns the meta object for the reference '{@link com.misc.projects.SortingPlans.EndProduct#getFPDSortingLevel <em>FPD Sorting Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>FPD Sorting Level</em>'.
	 * @see com.misc.projects.SortingPlans.EndProduct#getFPDSortingLevel()
	 * @see #getEndProduct()
	 * @generated
	 */
	EReference getEndProduct_FPDSortingLevel();

	/**
	 * Returns the meta object for the reference '{@link com.misc.projects.SortingPlans.EndProduct#getSortingPlanProduct <em>Sorting Plan Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sorting Plan Product</em>'.
	 * @see com.misc.projects.SortingPlans.EndProduct#getSortingPlanProduct()
	 * @see #getEndProduct()
	 * @generated
	 */
	EReference getEndProduct_SortingPlanProduct();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.projects.SortingPlans.EndProduct#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see com.misc.projects.SortingPlans.EndProduct#getDescription()
	 * @see #getEndProduct()
	 * @generated
	 */
	EAttribute getEndProduct_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link com.misc.projects.SortingPlans.EndProduct#getSortingPlans <em>Sorting Plans</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sorting Plans</em>'.
	 * @see com.misc.projects.SortingPlans.EndProduct#getSortingPlans()
	 * @see #getEndProduct()
	 * @generated
	 */
	EReference getEndProduct_SortingPlans();

	/**
	 * Returns the meta object for the container reference '{@link com.misc.projects.SortingPlans.EndProduct#getScenario <em>Scenario</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Scenario</em>'.
	 * @see com.misc.projects.SortingPlans.EndProduct#getScenario()
	 * @see #getEndProduct()
	 * @generated
	 */
	EReference getEndProduct_Scenario();

	/**
	 * Returns the meta object for the reference '{@link com.misc.projects.SortingPlans.EndProduct#getScenarioAsSelected <em>Scenario As Selected</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Scenario As Selected</em>'.
	 * @see com.misc.projects.SortingPlans.EndProduct#getScenarioAsSelected()
	 * @see #getEndProduct()
	 * @generated
	 */
	EReference getEndProduct_ScenarioAsSelected();

	/**
	 * Returns the meta object for the containment reference list '{@link com.misc.projects.SortingPlans.EndProduct#getProductsContaining <em>Products Containing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Products Containing</em>'.
	 * @see com.misc.projects.SortingPlans.EndProduct#getProductsContaining()
	 * @see #getEndProduct()
	 * @generated
	 */
	EReference getEndProduct_ProductsContaining();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.projects.SortingPlans.EndProduct#isSelected <em>Selected</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Selected</em>'.
	 * @see com.misc.projects.SortingPlans.EndProduct#isSelected()
	 * @see #getEndProduct()
	 * @generated
	 */
	EAttribute getEndProduct_Selected();

	/**
	 * Returns the meta object for the '{@link com.misc.projects.SortingPlans.EndProduct#refreshSortingPlans() <em>Refresh Sorting Plans</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Refresh Sorting Plans</em>' operation.
	 * @see com.misc.projects.SortingPlans.EndProduct#refreshSortingPlans()
	 * @generated
	 */
	EOperation getEndProduct__RefreshSortingPlans();

	/**
	 * Returns the meta object for class '{@link com.misc.projects.SortingPlans.SortingPlanProduct <em>Sorting Plan Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sorting Plan Product</em>'.
	 * @see com.misc.projects.SortingPlans.SortingPlanProduct
	 * @generated
	 */
	EClass getSortingPlanProduct();

	/**
	 * Returns the meta object for the reference '{@link com.misc.projects.SortingPlans.SortingPlanProduct#getFPDSortingLevel <em>FPD Sorting Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>FPD Sorting Level</em>'.
	 * @see com.misc.projects.SortingPlans.SortingPlanProduct#getFPDSortingLevel()
	 * @see #getSortingPlanProduct()
	 * @generated
	 */
	EReference getSortingPlanProduct_FPDSortingLevel();

	/**
	 * Returns the meta object for the reference list '{@link com.misc.projects.SortingPlans.SortingPlanProduct#getSortingPlansProducing <em>Sorting Plans Producing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Sorting Plans Producing</em>'.
	 * @see com.misc.projects.SortingPlans.SortingPlanProduct#getSortingPlansProducing()
	 * @see #getSortingPlanProduct()
	 * @generated
	 */
	EReference getSortingPlanProduct_SortingPlansProducing();

	/**
	 * Returns the meta object for the reference list '{@link com.misc.projects.SortingPlans.SortingPlanProduct#getSortingPlansAccepting <em>Sorting Plans Accepting</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Sorting Plans Accepting</em>'.
	 * @see com.misc.projects.SortingPlans.SortingPlanProduct#getSortingPlansAccepting()
	 * @see #getSortingPlanProduct()
	 * @generated
	 */
	EReference getSortingPlanProduct_SortingPlansAccepting();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.projects.SortingPlans.SortingPlanProduct#getSortingLevelAVCSSk <em>Sorting Level AVCS Sk</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sorting Level AVCS Sk</em>'.
	 * @see com.misc.projects.SortingPlans.SortingPlanProduct#getSortingLevelAVCSSk()
	 * @see #getSortingPlanProduct()
	 * @generated
	 */
	EAttribute getSortingPlanProduct_SortingLevelAVCSSk();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.projects.SortingPlans.SortingPlanProduct#getMechanizationLevelSk <em>Mechanization Level Sk</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mechanization Level Sk</em>'.
	 * @see com.misc.projects.SortingPlans.SortingPlanProduct#getMechanizationLevelSk()
	 * @see #getSortingPlanProduct()
	 * @generated
	 */
	EAttribute getSortingPlanProduct_MechanizationLevelSk();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.projects.SortingPlans.SortingPlanProduct#getThroughputTypeSk <em>Throughput Type Sk</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Throughput Type Sk</em>'.
	 * @see com.misc.projects.SortingPlans.SortingPlanProduct#getThroughputTypeSk()
	 * @see #getSortingPlanProduct()
	 * @generated
	 */
	EAttribute getSortingPlanProduct_ThroughputTypeSk();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.projects.SortingPlans.SortingPlanProduct#getDestinationSk <em>Destination Sk</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Destination Sk</em>'.
	 * @see com.misc.projects.SortingPlans.SortingPlanProduct#getDestinationSk()
	 * @see #getSortingPlanProduct()
	 * @generated
	 */
	EAttribute getSortingPlanProduct_DestinationSk();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.projects.SortingPlans.SortingPlanProduct#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see com.misc.projects.SortingPlans.SortingPlanProduct#getDescription()
	 * @see #getSortingPlanProduct()
	 * @generated
	 */
	EAttribute getSortingPlanProduct_Description();

	/**
	 * Returns the meta object for the reference '{@link com.misc.projects.SortingPlans.SortingPlanProduct#getEndProduct <em>End Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>End Product</em>'.
	 * @see com.misc.projects.SortingPlans.SortingPlanProduct#getEndProduct()
	 * @see #getSortingPlanProduct()
	 * @generated
	 */
	EReference getSortingPlanProduct_EndProduct();

	/**
	 * Returns the meta object for the containment reference list '{@link com.misc.projects.SortingPlans.SortingPlanProduct#getSortingPaths <em>Sorting Paths</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sorting Paths</em>'.
	 * @see com.misc.projects.SortingPlans.SortingPlanProduct#getSortingPaths()
	 * @see #getSortingPlanProduct()
	 * @generated
	 */
	EReference getSortingPlanProduct_SortingPaths();

	/**
	 * Returns the meta object for the reference list '{@link com.misc.projects.SortingPlans.SortingPlanProduct#getEndProducts <em>End Products</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>End Products</em>'.
	 * @see com.misc.projects.SortingPlans.SortingPlanProduct#getEndProducts()
	 * @see #getSortingPlanProduct()
	 * @generated
	 */
	EReference getSortingPlanProduct_EndProducts();

	/**
	 * Returns the meta object for class '{@link com.misc.projects.SortingPlans.SortingPlanOutput <em>Sorting Plan Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sorting Plan Output</em>'.
	 * @see com.misc.projects.SortingPlans.SortingPlanOutput
	 * @generated
	 */
	EClass getSortingPlanOutput();

	/**
	 * Returns the meta object for the reference '{@link com.misc.projects.SortingPlans.SortingPlanOutput#getFPDSortingPlanOutput <em>FPD Sorting Plan Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>FPD Sorting Plan Output</em>'.
	 * @see com.misc.projects.SortingPlans.SortingPlanOutput#getFPDSortingPlanOutput()
	 * @see #getSortingPlanOutput()
	 * @generated
	 */
	EReference getSortingPlanOutput_FPDSortingPlanOutput();

	/**
	 * Returns the meta object for the reference '{@link com.misc.projects.SortingPlans.SortingPlanOutput#getOutputProduct <em>Output Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output Product</em>'.
	 * @see com.misc.projects.SortingPlans.SortingPlanOutput#getOutputProduct()
	 * @see #getSortingPlanOutput()
	 * @generated
	 */
	EReference getSortingPlanOutput_OutputProduct();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.projects.SortingPlans.SortingPlanOutput#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see com.misc.projects.SortingPlans.SortingPlanOutput#getDescription()
	 * @see #getSortingPlanOutput()
	 * @generated
	 */
	EAttribute getSortingPlanOutput_Description();

	/**
	 * Returns the meta object for the container reference '{@link com.misc.projects.SortingPlans.SortingPlanOutput#getSortingPlan <em>Sorting Plan</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Sorting Plan</em>'.
	 * @see com.misc.projects.SortingPlans.SortingPlanOutput#getSortingPlan()
	 * @see #getSortingPlanOutput()
	 * @generated
	 */
	EReference getSortingPlanOutput_SortingPlan();

	/**
	 * Returns the meta object for the '{@link com.misc.projects.SortingPlans.SortingPlanOutput#refeshSortedEndProducts() <em>Refesh Sorted End Products</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Refesh Sorted End Products</em>' operation.
	 * @see com.misc.projects.SortingPlans.SortingPlanOutput#refeshSortedEndProducts()
	 * @generated
	 */
	EOperation getSortingPlanOutput__RefeshSortedEndProducts();

	/**
	 * Returns the meta object for class '{@link com.misc.projects.SortingPlans.SortingPlanInput <em>Sorting Plan Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sorting Plan Input</em>'.
	 * @see com.misc.projects.SortingPlans.SortingPlanInput
	 * @generated
	 */
	EClass getSortingPlanInput();

	/**
	 * Returns the meta object for the reference '{@link com.misc.projects.SortingPlans.SortingPlanInput#getInputProduct <em>Input Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input Product</em>'.
	 * @see com.misc.projects.SortingPlans.SortingPlanInput#getInputProduct()
	 * @see #getSortingPlanInput()
	 * @generated
	 */
	EReference getSortingPlanInput_InputProduct();

	/**
	 * Returns the meta object for the reference '{@link com.misc.projects.SortingPlans.SortingPlanInput#getFPDSortingPlanInput <em>FPD Sorting Plan Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>FPD Sorting Plan Input</em>'.
	 * @see com.misc.projects.SortingPlans.SortingPlanInput#getFPDSortingPlanInput()
	 * @see #getSortingPlanInput()
	 * @generated
	 */
	EReference getSortingPlanInput_FPDSortingPlanInput();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.projects.SortingPlans.SortingPlanInput#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see com.misc.projects.SortingPlans.SortingPlanInput#getDescription()
	 * @see #getSortingPlanInput()
	 * @generated
	 */
	EAttribute getSortingPlanInput_Description();

	/**
	 * Returns the meta object for the container reference '{@link com.misc.projects.SortingPlans.SortingPlanInput#getSortingPlan <em>Sorting Plan</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Sorting Plan</em>'.
	 * @see com.misc.projects.SortingPlans.SortingPlanInput#getSortingPlan()
	 * @see #getSortingPlanInput()
	 * @generated
	 */
	EReference getSortingPlanInput_SortingPlan();

	/**
	 * Returns the meta object for class '{@link com.misc.projects.SortingPlans.EndProductSortingPlan <em>End Product Sorting Plan</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>End Product Sorting Plan</em>'.
	 * @see com.misc.projects.SortingPlans.EndProductSortingPlan
	 * @generated
	 */
	EClass getEndProductSortingPlan();

	/**
	 * Returns the meta object for the container reference '{@link com.misc.projects.SortingPlans.EndProductSortingPlan#getEndProduct <em>End Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>End Product</em>'.
	 * @see com.misc.projects.SortingPlans.EndProductSortingPlan#getEndProduct()
	 * @see #getEndProductSortingPlan()
	 * @generated
	 */
	EReference getEndProductSortingPlan_EndProduct();

	/**
	 * Returns the meta object for the reference '{@link com.misc.projects.SortingPlans.EndProductSortingPlan#getSortingPlan <em>Sorting Plan</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sorting Plan</em>'.
	 * @see com.misc.projects.SortingPlans.EndProductSortingPlan#getSortingPlan()
	 * @see #getEndProductSortingPlan()
	 * @generated
	 */
	EReference getEndProductSortingPlan_SortingPlan();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.projects.SortingPlans.EndProductSortingPlan#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see com.misc.projects.SortingPlans.EndProductSortingPlan#getDescription()
	 * @see #getEndProductSortingPlan()
	 * @generated
	 */
	EAttribute getEndProductSortingPlan_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link com.misc.projects.SortingPlans.EndProductSortingPlan#getOutputs <em>Outputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Outputs</em>'.
	 * @see com.misc.projects.SortingPlans.EndProductSortingPlan#getOutputs()
	 * @see #getEndProductSortingPlan()
	 * @generated
	 */
	EReference getEndProductSortingPlan_Outputs();

	/**
	 * Returns the meta object for the containment reference list '{@link com.misc.projects.SortingPlans.EndProductSortingPlan#getInputs <em>Inputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Inputs</em>'.
	 * @see com.misc.projects.SortingPlans.EndProductSortingPlan#getInputs()
	 * @see #getEndProductSortingPlan()
	 * @generated
	 */
	EReference getEndProductSortingPlan_Inputs();

	/**
	 * Returns the meta object for the reference '{@link com.misc.projects.SortingPlans.EndProductSortingPlan#getSelectedOutput <em>Selected Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Selected Output</em>'.
	 * @see com.misc.projects.SortingPlans.EndProductSortingPlan#getSelectedOutput()
	 * @see #getEndProductSortingPlan()
	 * @generated
	 */
	EReference getEndProductSortingPlan_SelectedOutput();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.projects.SortingPlans.EndProductSortingPlan#getSortingDistance <em>Sorting Distance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sorting Distance</em>'.
	 * @see com.misc.projects.SortingPlans.EndProductSortingPlan#getSortingDistance()
	 * @see #getEndProductSortingPlan()
	 * @generated
	 */
	EAttribute getEndProductSortingPlan_SortingDistance();

	/**
	 * Returns the meta object for class '{@link com.misc.projects.SortingPlans.EndProductSortingPlanInput <em>End Product Sorting Plan Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>End Product Sorting Plan Input</em>'.
	 * @see com.misc.projects.SortingPlans.EndProductSortingPlanInput
	 * @generated
	 */
	EClass getEndProductSortingPlanInput();

	/**
	 * Returns the meta object for the container reference '{@link com.misc.projects.SortingPlans.EndProductSortingPlanInput#getSortingPlan <em>Sorting Plan</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Sorting Plan</em>'.
	 * @see com.misc.projects.SortingPlans.EndProductSortingPlanInput#getSortingPlan()
	 * @see #getEndProductSortingPlanInput()
	 * @generated
	 */
	EReference getEndProductSortingPlanInput_SortingPlan();

	/**
	 * Returns the meta object for the reference '{@link com.misc.projects.SortingPlans.EndProductSortingPlanInput#getInputProduct <em>Input Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input Product</em>'.
	 * @see com.misc.projects.SortingPlans.EndProductSortingPlanInput#getInputProduct()
	 * @see #getEndProductSortingPlanInput()
	 * @generated
	 */
	EReference getEndProductSortingPlanInput_InputProduct();

	/**
	 * Returns the meta object for the reference '{@link com.misc.projects.SortingPlans.EndProductSortingPlanInput#getSortingPlanInput <em>Sorting Plan Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sorting Plan Input</em>'.
	 * @see com.misc.projects.SortingPlans.EndProductSortingPlanInput#getSortingPlanInput()
	 * @see #getEndProductSortingPlanInput()
	 * @generated
	 */
	EReference getEndProductSortingPlanInput_SortingPlanInput();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.projects.SortingPlans.EndProductSortingPlanInput#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see com.misc.projects.SortingPlans.EndProductSortingPlanInput#getDescription()
	 * @see #getEndProductSortingPlanInput()
	 * @generated
	 */
	EAttribute getEndProductSortingPlanInput_Description();

	/**
	 * Returns the meta object for class '{@link com.misc.projects.SortingPlans.EndProductSortingPlanOutput <em>End Product Sorting Plan Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>End Product Sorting Plan Output</em>'.
	 * @see com.misc.projects.SortingPlans.EndProductSortingPlanOutput
	 * @generated
	 */
	EClass getEndProductSortingPlanOutput();

	/**
	 * Returns the meta object for the container reference '{@link com.misc.projects.SortingPlans.EndProductSortingPlanOutput#getSortingPlan <em>Sorting Plan</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Sorting Plan</em>'.
	 * @see com.misc.projects.SortingPlans.EndProductSortingPlanOutput#getSortingPlan()
	 * @see #getEndProductSortingPlanOutput()
	 * @generated
	 */
	EReference getEndProductSortingPlanOutput_SortingPlan();

	/**
	 * Returns the meta object for the reference '{@link com.misc.projects.SortingPlans.EndProductSortingPlanOutput#getOutputProduct <em>Output Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output Product</em>'.
	 * @see com.misc.projects.SortingPlans.EndProductSortingPlanOutput#getOutputProduct()
	 * @see #getEndProductSortingPlanOutput()
	 * @generated
	 */
	EReference getEndProductSortingPlanOutput_OutputProduct();

	/**
	 * Returns the meta object for the reference '{@link com.misc.projects.SortingPlans.EndProductSortingPlanOutput#getSortingPlanOutput <em>Sorting Plan Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sorting Plan Output</em>'.
	 * @see com.misc.projects.SortingPlans.EndProductSortingPlanOutput#getSortingPlanOutput()
	 * @see #getEndProductSortingPlanOutput()
	 * @generated
	 */
	EReference getEndProductSortingPlanOutput_SortingPlanOutput();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.projects.SortingPlans.EndProductSortingPlanOutput#isSelected <em>Selected</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Selected</em>'.
	 * @see com.misc.projects.SortingPlans.EndProductSortingPlanOutput#isSelected()
	 * @see #getEndProductSortingPlanOutput()
	 * @generated
	 */
	EAttribute getEndProductSortingPlanOutput_Selected();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.projects.SortingPlans.EndProductSortingPlanOutput#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see com.misc.projects.SortingPlans.EndProductSortingPlanOutput#getDescription()
	 * @see #getEndProductSortingPlanOutput()
	 * @generated
	 */
	EAttribute getEndProductSortingPlanOutput_Description();

	/**
	 * Returns the meta object for class '{@link com.misc.projects.SortingPlans.EndProductInProduct <em>End Product In Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>End Product In Product</em>'.
	 * @see com.misc.projects.SortingPlans.EndProductInProduct
	 * @generated
	 */
	EClass getEndProductInProduct();

	/**
	 * Returns the meta object for the container reference '{@link com.misc.projects.SortingPlans.EndProductInProduct#getEndProductsContained <em>End Products Contained</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>End Products Contained</em>'.
	 * @see com.misc.projects.SortingPlans.EndProductInProduct#getEndProductsContained()
	 * @see #getEndProductInProduct()
	 * @generated
	 */
	EReference getEndProductInProduct_EndProductsContained();

	/**
	 * Returns the meta object for the reference list '{@link com.misc.projects.SortingPlans.EndProductInProduct#getSortingPlansProducing <em>Sorting Plans Producing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Sorting Plans Producing</em>'.
	 * @see com.misc.projects.SortingPlans.EndProductInProduct#getSortingPlansProducing()
	 * @see #getEndProductInProduct()
	 * @generated
	 */
	EReference getEndProductInProduct_SortingPlansProducing();

	/**
	 * Returns the meta object for the reference list '{@link com.misc.projects.SortingPlans.EndProductInProduct#getSortingPlansAccepting <em>Sorting Plans Accepting</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Sorting Plans Accepting</em>'.
	 * @see com.misc.projects.SortingPlans.EndProductInProduct#getSortingPlansAccepting()
	 * @see #getEndProductInProduct()
	 * @generated
	 */
	EReference getEndProductInProduct_SortingPlansAccepting();

	/**
	 * Returns the meta object for the reference '{@link com.misc.projects.SortingPlans.EndProductInProduct#getProduct <em>Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Product</em>'.
	 * @see com.misc.projects.SortingPlans.EndProductInProduct#getProduct()
	 * @see #getEndProductInProduct()
	 * @generated
	 */
	EReference getEndProductInProduct_Product();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.projects.SortingPlans.EndProductInProduct#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see com.misc.projects.SortingPlans.EndProductInProduct#getDescription()
	 * @see #getEndProductInProduct()
	 * @generated
	 */
	EAttribute getEndProductInProduct_Description();

	/**
	 * Returns the meta object for class '{@link com.misc.projects.SortingPlans.SortingPath <em>Sorting Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sorting Path</em>'.
	 * @see com.misc.projects.SortingPlans.SortingPath
	 * @generated
	 */
	EClass getSortingPath();

	/**
	 * Returns the meta object for the reference '{@link com.misc.projects.SortingPlans.SortingPath#getOutputLastSegment <em>Output Last Segment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output Last Segment</em>'.
	 * @see com.misc.projects.SortingPlans.SortingPath#getOutputLastSegment()
	 * @see #getSortingPath()
	 * @generated
	 */
	EReference getSortingPath_OutputLastSegment();

	/**
	 * Returns the meta object for the reference '{@link com.misc.projects.SortingPlans.SortingPath#getBeforeLastSegment <em>Before Last Segment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Before Last Segment</em>'.
	 * @see com.misc.projects.SortingPlans.SortingPath#getBeforeLastSegment()
	 * @see #getSortingPath()
	 * @generated
	 */
	EReference getSortingPath_BeforeLastSegment();

	/**
	 * Returns the meta object for the reference list '{@link com.misc.projects.SortingPlans.SortingPath#getSortedEndProducts <em>Sorted End Products</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Sorted End Products</em>'.
	 * @see com.misc.projects.SortingPlans.SortingPath#getSortedEndProducts()
	 * @see #getSortingPath()
	 * @generated
	 */
	EReference getSortingPath_SortedEndProducts();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.projects.SortingPlans.SortingPath#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see com.misc.projects.SortingPlans.SortingPath#getDescription()
	 * @see #getSortingPath()
	 * @generated
	 */
	EAttribute getSortingPath_Description();

	/**
	 * Returns the meta object for the container reference '{@link com.misc.projects.SortingPlans.SortingPath#getProduct <em>Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Product</em>'.
	 * @see com.misc.projects.SortingPlans.SortingPath#getProduct()
	 * @see #getSortingPath()
	 * @generated
	 */
	EReference getSortingPath_Product();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	cptspFactory getcptspFactory();

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
		 * The meta object literal for the '{@link com.misc.projects.SortingPlans.impl.ScenariosImpl <em>Scenarios</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.projects.SortingPlans.impl.ScenariosImpl
		 * @see com.misc.projects.SortingPlans.impl.cptspPackageImpl#getScenarios()
		 * @generated
		 */
		EClass SCENARIOS = eINSTANCE.getScenarios();

		/**
		 * The meta object literal for the '<em><b>Scenarios</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCENARIOS__SCENARIOS = eINSTANCE.getScenarios_Scenarios();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCENARIOS__NAME = eINSTANCE.getScenarios_Name();

		/**
		 * The meta object literal for the '{@link com.misc.projects.SortingPlans.impl.ScenarioImpl <em>Scenario</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.projects.SortingPlans.impl.ScenarioImpl
		 * @see com.misc.projects.SortingPlans.impl.cptspPackageImpl#getScenario()
		 * @generated
		 */
		EClass SCENARIO = eINSTANCE.getScenario();

		/**
		 * The meta object literal for the '<em><b>Sorting Plans</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCENARIO__SORTING_PLANS = eINSTANCE.getScenario_SortingPlans();

		/**
		 * The meta object literal for the '<em><b>End Products</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCENARIO__END_PRODUCTS = eINSTANCE.getScenario_EndProducts();

		/**
		 * The meta object literal for the '<em><b>Sorting Plan Products</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCENARIO__SORTING_PLAN_PRODUCTS = eINSTANCE.getScenario_SortingPlanProducts();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCENARIO__NAME = eINSTANCE.getScenario_Name();

		/**
		 * The meta object literal for the '<em><b>Sorting Levels With Destination</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCENARIO__SORTING_LEVELS_WITH_DESTINATION = eINSTANCE.getScenario_SortingLevelsWithDestination();

		/**
		 * The meta object literal for the '<em><b>Selected Sorting Plans</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCENARIO__SELECTED_SORTING_PLANS = eINSTANCE.getScenario_SelectedSortingPlans();

		/**
		 * The meta object literal for the '<em><b>Selected End Products</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCENARIO__SELECTED_END_PRODUCTS = eINSTANCE.getScenario_SelectedEndProducts();

		/**
		 * The meta object literal for the '<em><b>Primary Products Selected</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCENARIO__PRIMARY_PRODUCTS_SELECTED = eINSTANCE.getScenario_PrimaryProductsSelected();

		/**
		 * The meta object literal for the '<em><b>Refresh Selected Sorting Plans</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SCENARIO___REFRESH_SELECTED_SORTING_PLANS = eINSTANCE.getScenario__RefreshSelectedSortingPlans();

		/**
		 * The meta object literal for the '<em><b>Refresh</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SCENARIO___REFRESH = eINSTANCE.getScenario__Refresh();

		/**
		 * The meta object literal for the '<em><b>Refresh Sorting Plan Product</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SCENARIO___REFRESH_SORTING_PLAN_PRODUCT = eINSTANCE.getScenario__RefreshSortingPlanProduct();

		/**
		 * The meta object literal for the '<em><b>Refresh End Products</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SCENARIO___REFRESH_END_PRODUCTS = eINSTANCE.getScenario__RefreshEndProducts();

		/**
		 * The meta object literal for the '<em><b>Refresh Sorting Paths</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SCENARIO___REFRESH_SORTING_PATHS = eINSTANCE.getScenario__RefreshSortingPaths();

		/**
		 * The meta object literal for the '<em><b>Test</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SCENARIO___TEST = eINSTANCE.getScenario__Test();

		/**
		 * The meta object literal for the '{@link com.misc.projects.SortingPlans.impl.SortingPlanImpl <em>Sorting Plan</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.projects.SortingPlans.impl.SortingPlanImpl
		 * @see com.misc.projects.SortingPlans.impl.cptspPackageImpl#getSortingPlan()
		 * @generated
		 */
		EClass SORTING_PLAN = eINSTANCE.getSortingPlan();

		/**
		 * The meta object literal for the '<em><b>Outputs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SORTING_PLAN__OUTPUTS = eINSTANCE.getSortingPlan_Outputs();

		/**
		 * The meta object literal for the '<em><b>Inputs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SORTING_PLAN__INPUTS = eINSTANCE.getSortingPlan_Inputs();

		/**
		 * The meta object literal for the '<em><b>Scenario</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SORTING_PLAN__SCENARIO = eINSTANCE.getSortingPlan_Scenario();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SORTING_PLAN__DESCRIPTION = eINSTANCE.getSortingPlan_Description();

		/**
		 * The meta object literal for the '<em><b>Selected</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SORTING_PLAN__SELECTED = eINSTANCE.getSortingPlan_Selected();

		/**
		 * The meta object literal for the '<em><b>Refresh Inputs</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SORTING_PLAN___REFRESH_INPUTS = eINSTANCE.getSortingPlan__RefreshInputs();

		/**
		 * The meta object literal for the '<em><b>Refresh Outputs</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SORTING_PLAN___REFRESH_OUTPUTS = eINSTANCE.getSortingPlan__RefreshOutputs();

		/**
		 * The meta object literal for the '<em><b>Refresh</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SORTING_PLAN___REFRESH = eINSTANCE.getSortingPlan__Refresh();

		/**
		 * The meta object literal for the '<em><b>End Products</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SORTING_PLAN__END_PRODUCTS = eINSTANCE.getSortingPlan_EndProducts();

		/**
		 * The meta object literal for the '<em><b>FPD Sorting Plan</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SORTING_PLAN__FPD_SORTING_PLAN = eINSTANCE.getSortingPlan_FPDSortingPlan();

		/**
		 * The meta object literal for the '{@link com.misc.projects.SortingPlans.impl.EndProductImpl <em>End Product</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.projects.SortingPlans.impl.EndProductImpl
		 * @see com.misc.projects.SortingPlans.impl.cptspPackageImpl#getEndProduct()
		 * @generated
		 */
		EClass END_PRODUCT = eINSTANCE.getEndProduct();

		/**
		 * The meta object literal for the '<em><b>FPD Sorting Level</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference END_PRODUCT__FPD_SORTING_LEVEL = eINSTANCE.getEndProduct_FPDSortingLevel();

		/**
		 * The meta object literal for the '<em><b>Sorting Plan Product</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference END_PRODUCT__SORTING_PLAN_PRODUCT = eINSTANCE.getEndProduct_SortingPlanProduct();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute END_PRODUCT__DESCRIPTION = eINSTANCE.getEndProduct_Description();

		/**
		 * The meta object literal for the '<em><b>Sorting Plans</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference END_PRODUCT__SORTING_PLANS = eINSTANCE.getEndProduct_SortingPlans();

		/**
		 * The meta object literal for the '<em><b>Scenario</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference END_PRODUCT__SCENARIO = eINSTANCE.getEndProduct_Scenario();

		/**
		 * The meta object literal for the '<em><b>Scenario As Selected</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference END_PRODUCT__SCENARIO_AS_SELECTED = eINSTANCE.getEndProduct_ScenarioAsSelected();

		/**
		 * The meta object literal for the '<em><b>Products Containing</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference END_PRODUCT__PRODUCTS_CONTAINING = eINSTANCE.getEndProduct_ProductsContaining();

		/**
		 * The meta object literal for the '<em><b>Selected</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute END_PRODUCT__SELECTED = eINSTANCE.getEndProduct_Selected();

		/**
		 * The meta object literal for the '<em><b>Refresh Sorting Plans</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation END_PRODUCT___REFRESH_SORTING_PLANS = eINSTANCE.getEndProduct__RefreshSortingPlans();

		/**
		 * The meta object literal for the '{@link com.misc.projects.SortingPlans.impl.SortingPlanProductImpl <em>Sorting Plan Product</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.projects.SortingPlans.impl.SortingPlanProductImpl
		 * @see com.misc.projects.SortingPlans.impl.cptspPackageImpl#getSortingPlanProduct()
		 * @generated
		 */
		EClass SORTING_PLAN_PRODUCT = eINSTANCE.getSortingPlanProduct();

		/**
		 * The meta object literal for the '<em><b>FPD Sorting Level</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SORTING_PLAN_PRODUCT__FPD_SORTING_LEVEL = eINSTANCE.getSortingPlanProduct_FPDSortingLevel();

		/**
		 * The meta object literal for the '<em><b>Sorting Plans Producing</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SORTING_PLAN_PRODUCT__SORTING_PLANS_PRODUCING = eINSTANCE.getSortingPlanProduct_SortingPlansProducing();

		/**
		 * The meta object literal for the '<em><b>Sorting Plans Accepting</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SORTING_PLAN_PRODUCT__SORTING_PLANS_ACCEPTING = eINSTANCE.getSortingPlanProduct_SortingPlansAccepting();

		/**
		 * The meta object literal for the '<em><b>Sorting Level AVCS Sk</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SORTING_PLAN_PRODUCT__SORTING_LEVEL_AVCS_SK = eINSTANCE.getSortingPlanProduct_SortingLevelAVCSSk();

		/**
		 * The meta object literal for the '<em><b>Mechanization Level Sk</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SORTING_PLAN_PRODUCT__MECHANIZATION_LEVEL_SK = eINSTANCE.getSortingPlanProduct_MechanizationLevelSk();

		/**
		 * The meta object literal for the '<em><b>Throughput Type Sk</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SORTING_PLAN_PRODUCT__THROUGHPUT_TYPE_SK = eINSTANCE.getSortingPlanProduct_ThroughputTypeSk();

		/**
		 * The meta object literal for the '<em><b>Destination Sk</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SORTING_PLAN_PRODUCT__DESTINATION_SK = eINSTANCE.getSortingPlanProduct_DestinationSk();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SORTING_PLAN_PRODUCT__DESCRIPTION = eINSTANCE.getSortingPlanProduct_Description();

		/**
		 * The meta object literal for the '<em><b>End Product</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SORTING_PLAN_PRODUCT__END_PRODUCT = eINSTANCE.getSortingPlanProduct_EndProduct();

		/**
		 * The meta object literal for the '<em><b>Sorting Paths</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SORTING_PLAN_PRODUCT__SORTING_PATHS = eINSTANCE.getSortingPlanProduct_SortingPaths();

		/**
		 * The meta object literal for the '<em><b>End Products</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SORTING_PLAN_PRODUCT__END_PRODUCTS = eINSTANCE.getSortingPlanProduct_EndProducts();

		/**
		 * The meta object literal for the '{@link com.misc.projects.SortingPlans.impl.SortingPlanOutputImpl <em>Sorting Plan Output</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.projects.SortingPlans.impl.SortingPlanOutputImpl
		 * @see com.misc.projects.SortingPlans.impl.cptspPackageImpl#getSortingPlanOutput()
		 * @generated
		 */
		EClass SORTING_PLAN_OUTPUT = eINSTANCE.getSortingPlanOutput();

		/**
		 * The meta object literal for the '<em><b>FPD Sorting Plan Output</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SORTING_PLAN_OUTPUT__FPD_SORTING_PLAN_OUTPUT = eINSTANCE.getSortingPlanOutput_FPDSortingPlanOutput();

		/**
		 * The meta object literal for the '<em><b>Output Product</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SORTING_PLAN_OUTPUT__OUTPUT_PRODUCT = eINSTANCE.getSortingPlanOutput_OutputProduct();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SORTING_PLAN_OUTPUT__DESCRIPTION = eINSTANCE.getSortingPlanOutput_Description();

		/**
		 * The meta object literal for the '<em><b>Sorting Plan</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SORTING_PLAN_OUTPUT__SORTING_PLAN = eINSTANCE.getSortingPlanOutput_SortingPlan();

		/**
		 * The meta object literal for the '<em><b>Refesh Sorted End Products</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SORTING_PLAN_OUTPUT___REFESH_SORTED_END_PRODUCTS = eINSTANCE.getSortingPlanOutput__RefeshSortedEndProducts();

		/**
		 * The meta object literal for the '{@link com.misc.projects.SortingPlans.impl.SortingPlanInputImpl <em>Sorting Plan Input</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.projects.SortingPlans.impl.SortingPlanInputImpl
		 * @see com.misc.projects.SortingPlans.impl.cptspPackageImpl#getSortingPlanInput()
		 * @generated
		 */
		EClass SORTING_PLAN_INPUT = eINSTANCE.getSortingPlanInput();

		/**
		 * The meta object literal for the '<em><b>Input Product</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SORTING_PLAN_INPUT__INPUT_PRODUCT = eINSTANCE.getSortingPlanInput_InputProduct();

		/**
		 * The meta object literal for the '<em><b>FPD Sorting Plan Input</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SORTING_PLAN_INPUT__FPD_SORTING_PLAN_INPUT = eINSTANCE.getSortingPlanInput_FPDSortingPlanInput();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SORTING_PLAN_INPUT__DESCRIPTION = eINSTANCE.getSortingPlanInput_Description();

		/**
		 * The meta object literal for the '<em><b>Sorting Plan</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SORTING_PLAN_INPUT__SORTING_PLAN = eINSTANCE.getSortingPlanInput_SortingPlan();

		/**
		 * The meta object literal for the '{@link com.misc.projects.SortingPlans.impl.EndProductSortingPlanImpl <em>End Product Sorting Plan</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.projects.SortingPlans.impl.EndProductSortingPlanImpl
		 * @see com.misc.projects.SortingPlans.impl.cptspPackageImpl#getEndProductSortingPlan()
		 * @generated
		 */
		EClass END_PRODUCT_SORTING_PLAN = eINSTANCE.getEndProductSortingPlan();

		/**
		 * The meta object literal for the '<em><b>End Product</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference END_PRODUCT_SORTING_PLAN__END_PRODUCT = eINSTANCE.getEndProductSortingPlan_EndProduct();

		/**
		 * The meta object literal for the '<em><b>Sorting Plan</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference END_PRODUCT_SORTING_PLAN__SORTING_PLAN = eINSTANCE.getEndProductSortingPlan_SortingPlan();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute END_PRODUCT_SORTING_PLAN__DESCRIPTION = eINSTANCE.getEndProductSortingPlan_Description();

		/**
		 * The meta object literal for the '<em><b>Outputs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference END_PRODUCT_SORTING_PLAN__OUTPUTS = eINSTANCE.getEndProductSortingPlan_Outputs();

		/**
		 * The meta object literal for the '<em><b>Inputs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference END_PRODUCT_SORTING_PLAN__INPUTS = eINSTANCE.getEndProductSortingPlan_Inputs();

		/**
		 * The meta object literal for the '<em><b>Selected Output</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference END_PRODUCT_SORTING_PLAN__SELECTED_OUTPUT = eINSTANCE.getEndProductSortingPlan_SelectedOutput();

		/**
		 * The meta object literal for the '<em><b>Sorting Distance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute END_PRODUCT_SORTING_PLAN__SORTING_DISTANCE = eINSTANCE.getEndProductSortingPlan_SortingDistance();

		/**
		 * The meta object literal for the '{@link com.misc.projects.SortingPlans.impl.EndProductSortingPlanInputImpl <em>End Product Sorting Plan Input</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.projects.SortingPlans.impl.EndProductSortingPlanInputImpl
		 * @see com.misc.projects.SortingPlans.impl.cptspPackageImpl#getEndProductSortingPlanInput()
		 * @generated
		 */
		EClass END_PRODUCT_SORTING_PLAN_INPUT = eINSTANCE.getEndProductSortingPlanInput();

		/**
		 * The meta object literal for the '<em><b>Sorting Plan</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference END_PRODUCT_SORTING_PLAN_INPUT__SORTING_PLAN = eINSTANCE.getEndProductSortingPlanInput_SortingPlan();

		/**
		 * The meta object literal for the '<em><b>Input Product</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference END_PRODUCT_SORTING_PLAN_INPUT__INPUT_PRODUCT = eINSTANCE.getEndProductSortingPlanInput_InputProduct();

		/**
		 * The meta object literal for the '<em><b>Sorting Plan Input</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference END_PRODUCT_SORTING_PLAN_INPUT__SORTING_PLAN_INPUT = eINSTANCE.getEndProductSortingPlanInput_SortingPlanInput();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute END_PRODUCT_SORTING_PLAN_INPUT__DESCRIPTION = eINSTANCE.getEndProductSortingPlanInput_Description();

		/**
		 * The meta object literal for the '{@link com.misc.projects.SortingPlans.impl.EndProductSortingPlanOutputImpl <em>End Product Sorting Plan Output</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.projects.SortingPlans.impl.EndProductSortingPlanOutputImpl
		 * @see com.misc.projects.SortingPlans.impl.cptspPackageImpl#getEndProductSortingPlanOutput()
		 * @generated
		 */
		EClass END_PRODUCT_SORTING_PLAN_OUTPUT = eINSTANCE.getEndProductSortingPlanOutput();

		/**
		 * The meta object literal for the '<em><b>Sorting Plan</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference END_PRODUCT_SORTING_PLAN_OUTPUT__SORTING_PLAN = eINSTANCE.getEndProductSortingPlanOutput_SortingPlan();

		/**
		 * The meta object literal for the '<em><b>Output Product</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference END_PRODUCT_SORTING_PLAN_OUTPUT__OUTPUT_PRODUCT = eINSTANCE.getEndProductSortingPlanOutput_OutputProduct();

		/**
		 * The meta object literal for the '<em><b>Sorting Plan Output</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference END_PRODUCT_SORTING_PLAN_OUTPUT__SORTING_PLAN_OUTPUT = eINSTANCE.getEndProductSortingPlanOutput_SortingPlanOutput();

		/**
		 * The meta object literal for the '<em><b>Selected</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute END_PRODUCT_SORTING_PLAN_OUTPUT__SELECTED = eINSTANCE.getEndProductSortingPlanOutput_Selected();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute END_PRODUCT_SORTING_PLAN_OUTPUT__DESCRIPTION = eINSTANCE.getEndProductSortingPlanOutput_Description();

		/**
		 * The meta object literal for the '{@link com.misc.projects.SortingPlans.impl.EndProductInProductImpl <em>End Product In Product</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.projects.SortingPlans.impl.EndProductInProductImpl
		 * @see com.misc.projects.SortingPlans.impl.cptspPackageImpl#getEndProductInProduct()
		 * @generated
		 */
		EClass END_PRODUCT_IN_PRODUCT = eINSTANCE.getEndProductInProduct();

		/**
		 * The meta object literal for the '<em><b>End Products Contained</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference END_PRODUCT_IN_PRODUCT__END_PRODUCTS_CONTAINED = eINSTANCE.getEndProductInProduct_EndProductsContained();

		/**
		 * The meta object literal for the '<em><b>Sorting Plans Producing</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference END_PRODUCT_IN_PRODUCT__SORTING_PLANS_PRODUCING = eINSTANCE.getEndProductInProduct_SortingPlansProducing();

		/**
		 * The meta object literal for the '<em><b>Sorting Plans Accepting</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference END_PRODUCT_IN_PRODUCT__SORTING_PLANS_ACCEPTING = eINSTANCE.getEndProductInProduct_SortingPlansAccepting();

		/**
		 * The meta object literal for the '<em><b>Product</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference END_PRODUCT_IN_PRODUCT__PRODUCT = eINSTANCE.getEndProductInProduct_Product();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute END_PRODUCT_IN_PRODUCT__DESCRIPTION = eINSTANCE.getEndProductInProduct_Description();

		/**
		 * The meta object literal for the '{@link com.misc.projects.SortingPlans.impl.SortingPathImpl <em>Sorting Path</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.projects.SortingPlans.impl.SortingPathImpl
		 * @see com.misc.projects.SortingPlans.impl.cptspPackageImpl#getSortingPath()
		 * @generated
		 */
		EClass SORTING_PATH = eINSTANCE.getSortingPath();

		/**
		 * The meta object literal for the '<em><b>Output Last Segment</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SORTING_PATH__OUTPUT_LAST_SEGMENT = eINSTANCE.getSortingPath_OutputLastSegment();

		/**
		 * The meta object literal for the '<em><b>Before Last Segment</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SORTING_PATH__BEFORE_LAST_SEGMENT = eINSTANCE.getSortingPath_BeforeLastSegment();

		/**
		 * The meta object literal for the '<em><b>Sorted End Products</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SORTING_PATH__SORTED_END_PRODUCTS = eINSTANCE.getSortingPath_SortedEndProducts();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SORTING_PATH__DESCRIPTION = eINSTANCE.getSortingPath_Description();

		/**
		 * The meta object literal for the '<em><b>Product</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SORTING_PATH__PRODUCT = eINSTANCE.getSortingPath_Product();

	}

} //cptspPackage
