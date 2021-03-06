package com.misc.projects.SortingPlans.calc;


import com.misc.common.moplaf.propagator.PropagatorDependencyAdapter;
import com.misc.common.moplaf.propagator.PropagatorFunctionAdapter;
import com.misc.common.moplaf.propagator.Util;
import com.misc.projects.SortingPlans.EndProduct;
import com.misc.projects.SortingPlans.Scenario;
import com.misc.projects.SortingPlans.cptspPackage;

public class PropagatorCalcEndProductRefreshSortingPlans extends PropagatorFunctionAdapter {

	@Override
	protected PropagatorFunctionAdapter getParent() {
		EndProduct endProduct = (EndProduct)this.target;
		Scenario scenario = (Scenario)endProduct.eContainer();
		PropagatorFunctionAdapter parent = Util.getPropagatorFunctionAdapter(scenario, PropagatorLayerEndProductRefreshSortingPlans.class);
		return parent;
	}

	@Override
	protected void calculate() {
		EndProduct endProduct = (EndProduct)this.target;
		endProduct.refreshSortingPlans();
	}

	@Override
	protected void addBindings() {
		super.addBindings();
//		this.addNavigationFeatureListener(cptspPackage.Literals.END_PRODUCT__SCENARIO, DependencyScenario.class);
//		this.addFeatureListener(cptspPackage.Literals.END_PRODUCT__SCENARIO_AS_SELECTED);
		this.addInboundBindingNavigationFeature(cptspPackage.Literals.END_PRODUCT__SCENARIO_AS_SELECTED, DependencyScenario.class);
	}

	static public class DependencyScenario extends PropagatorDependencyAdapter{
		protected void addBindings() {
			super.addBindings();
			this.addInboundBindingNavigationFeature(cptspPackage.Literals.SCENARIO__SORTING_PLANS, DependencySortingPlan.class);
		}

		static public class DependencySortingPlan extends PropagatorDependencyAdapter{
			protected void addBindings() {
				super.addBindings();
				this.addInboundBindingFeature(cptspPackage.Literals.SORTING_PLAN__INPUTS);
				this.addInboundBindingFeature(cptspPackage.Literals.SORTING_PLAN__OUTPUTS);
			}
		}; 
	}; 
};

