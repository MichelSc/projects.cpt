/**
 */
package com.misc.projects.SortingPlans.impl;

import com.misc.projects.SortingPlans.*;

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
public class cptspFactoryImpl extends EFactoryImpl implements cptspFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static cptspFactory init() {
		try {
			cptspFactory thecptspFactory = (cptspFactory)EPackage.Registry.INSTANCE.getEFactory(cptspPackage.eNS_URI);
			if (thecptspFactory != null) {
				return thecptspFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new cptspFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public cptspFactoryImpl() {
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
			case cptspPackage.SCENARIOS: return createScenarios();
			case cptspPackage.SCENARIO: return createScenario();
			case cptspPackage.SORTING_PLAN: return createSortingPlan();
			case cptspPackage.END_PRODUCT: return createEndProduct();
			case cptspPackage.SORTING_PLAN_PRODUCT: return createSortingPlanProduct();
			case cptspPackage.SORTING_PLAN_OUTPUT: return createSortingPlanOutput();
			case cptspPackage.SORTING_PLAN_INPUT: return createSortingPlanInput();
			case cptspPackage.END_PRODUCT_SORTING_PLAN: return createEndProductSortingPlan();
			case cptspPackage.END_PRODUCT_SORTING_PLAN_INPUT: return createEndProductSortingPlanInput();
			case cptspPackage.END_PRODUCT_SORTING_PLAN_OUTPUT: return createEndProductSortingPlanOutput();
			case cptspPackage.END_PRODUCT_IN_PRODUCT: return createEndProductInProduct();
			case cptspPackage.SORTING_PATH: return createSortingPath();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Scenarios createScenarios() {
		ScenariosImpl scenarios = new ScenariosImpl();
		return scenarios;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Scenario createScenario() {
		ScenarioImpl scenario = new ScenarioImpl();
		return scenario;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SortingPlan createSortingPlan() {
		SortingPlanImpl sortingPlan = new SortingPlanImpl();
		return sortingPlan;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EndProduct createEndProduct() {
		EndProductImpl endProduct = new EndProductImpl();
		return endProduct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SortingPlanProduct createSortingPlanProduct() {
		SortingPlanProductImpl sortingPlanProduct = new SortingPlanProductImpl();
		return sortingPlanProduct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SortingPlanOutput createSortingPlanOutput() {
		SortingPlanOutputImpl sortingPlanOutput = new SortingPlanOutputImpl();
		return sortingPlanOutput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SortingPlanInput createSortingPlanInput() {
		SortingPlanInputImpl sortingPlanInput = new SortingPlanInputImpl();
		return sortingPlanInput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EndProductSortingPlan createEndProductSortingPlan() {
		EndProductSortingPlanImpl endProductSortingPlan = new EndProductSortingPlanImpl();
		return endProductSortingPlan;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EndProductSortingPlanInput createEndProductSortingPlanInput() {
		EndProductSortingPlanInputImpl endProductSortingPlanInput = new EndProductSortingPlanInputImpl();
		return endProductSortingPlanInput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EndProductSortingPlanOutput createEndProductSortingPlanOutput() {
		EndProductSortingPlanOutputImpl endProductSortingPlanOutput = new EndProductSortingPlanOutputImpl();
		return endProductSortingPlanOutput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EndProductInProduct createEndProductInProduct() {
		EndProductInProductImpl endProductInProduct = new EndProductInProductImpl();
		return endProductInProduct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SortingPath createSortingPath() {
		SortingPathImpl sortingPath = new SortingPathImpl();
		return sortingPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public cptspPackage getcptspPackage() {
		return (cptspPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static cptspPackage getPackage() {
		return cptspPackage.eINSTANCE;
	}

} //cptspFactoryImpl
