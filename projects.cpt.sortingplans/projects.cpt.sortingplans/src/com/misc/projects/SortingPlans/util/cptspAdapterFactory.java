/**
 */
package com.misc.projects.SortingPlans.util;

import com.misc.common.moplaf.propagator.ObjectWithPropagatorFunctionAdapter;
import com.misc.common.moplaf.propagator.ObjectWithPropagatorFunctionAdapterScope;
import com.misc.projects.SortingPlans.*;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see com.misc.projects.SortingPlans.cptspPackage
 * @generated
 */
public class cptspAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static cptspPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public cptspAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = cptspPackage.eINSTANCE;
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
	protected cptspSwitch<Adapter> modelSwitch =
		new cptspSwitch<Adapter>() {
			@Override
			public Adapter caseScenarios(Scenarios object) {
				return createScenariosAdapter();
			}
			@Override
			public Adapter caseScenario(Scenario object) {
				return createScenarioAdapter();
			}
			@Override
			public Adapter caseSortingPlan(SortingPlan object) {
				return createSortingPlanAdapter();
			}
			@Override
			public Adapter caseEndProduct(EndProduct object) {
				return createEndProductAdapter();
			}
			@Override
			public Adapter caseSortingPlanProduct(SortingPlanProduct object) {
				return createSortingPlanProductAdapter();
			}
			@Override
			public Adapter caseSortingPlanEndProduct(SortingPlanEndProduct object) {
				return createSortingPlanEndProductAdapter();
			}
			@Override
			public Adapter caseSortingPlanOutput(SortingPlanOutput object) {
				return createSortingPlanOutputAdapter();
			}
			@Override
			public Adapter caseSortingPlanInput(SortingPlanInput object) {
				return createSortingPlanInputAdapter();
			}
			@Override
			public Adapter caseObjectWithPropagatorFunctionAdapter(ObjectWithPropagatorFunctionAdapter object) {
				return createObjectWithPropagatorFunctionAdapterAdapter();
			}
			@Override
			public Adapter caseObjectWithPropagatorFunctionAdapterScope(ObjectWithPropagatorFunctionAdapterScope object) {
				return createObjectWithPropagatorFunctionAdapterScopeAdapter();
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
	 * Creates a new adapter for an object of class '{@link com.misc.projects.SortingPlans.Scenarios <em>Scenarios</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.projects.SortingPlans.Scenarios
	 * @generated
	 */
	public Adapter createScenariosAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.projects.SortingPlans.Scenario <em>Scenario</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.projects.SortingPlans.Scenario
	 * @generated
	 */
	public Adapter createScenarioAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.projects.SortingPlans.SortingPlan <em>Sorting Plan</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.projects.SortingPlans.SortingPlan
	 * @generated
	 */
	public Adapter createSortingPlanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.projects.SortingPlans.EndProduct <em>End Product</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.projects.SortingPlans.EndProduct
	 * @generated
	 */
	public Adapter createEndProductAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.projects.SortingPlans.SortingPlanProduct <em>Sorting Plan Product</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.projects.SortingPlans.SortingPlanProduct
	 * @generated
	 */
	public Adapter createSortingPlanProductAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.projects.SortingPlans.SortingPlanEndProduct <em>Sorting Plan End Product</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.projects.SortingPlans.SortingPlanEndProduct
	 * @generated
	 */
	public Adapter createSortingPlanEndProductAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.projects.SortingPlans.SortingPlanOutput <em>Sorting Plan Output</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.projects.SortingPlans.SortingPlanOutput
	 * @generated
	 */
	public Adapter createSortingPlanOutputAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.projects.SortingPlans.SortingPlanInput <em>Sorting Plan Input</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.projects.SortingPlans.SortingPlanInput
	 * @generated
	 */
	public Adapter createSortingPlanInputAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.propagator.ObjectWithPropagatorFunctionAdapter <em>Object With Propagator Function Adapter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.propagator.ObjectWithPropagatorFunctionAdapter
	 * @generated
	 */
	public Adapter createObjectWithPropagatorFunctionAdapterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.propagator.ObjectWithPropagatorFunctionAdapterScope <em>Object With Propagator Function Adapter Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.propagator.ObjectWithPropagatorFunctionAdapterScope
	 * @generated
	 */
	public Adapter createObjectWithPropagatorFunctionAdapterScopeAdapter() {
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

} //cptspAdapterFactory
