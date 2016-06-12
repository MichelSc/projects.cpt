package com.misc.projects.SortingPlans.calc;

import com.misc.common.moplaf.propagator.PropagatorDependencyAdapter;
import com.misc.common.moplaf.propagator.PropagatorFunctionAdapter;
import com.misc.common.moplaf.propagator.PropagatorFunctionAdapters;
import com.misc.common.moplaf.propagator.Util;
import com.misc.projects.SortingPlans.Scenario;
import com.misc.projects.SortingPlans.cptspPackage;

public class PropagatorCalcScenarioRefreshEndProducts extends PropagatorFunctionAdapter {

	@Override
	protected PropagatorFunctionAdapter getParent() {
		Scenario scenario= (Scenario)this.target;
		PropagatorFunctionAdapter parent = Util.getPropagatorFunctionAdapter(scenario, PropagatorScopeScenario.class);
		return parent;
	}
	
	@Override
	protected PropagatorFunctionAdapters getAntecedents() {
		PropagatorFunctionAdapters antecedents = super.getAntecedents();
		Scenario scenario = (Scenario)this.target;
		
		PropagatorFunctionAdapter calcscenariorefreshsortingplans = Util.getPropagatorFunctionAdapter(scenario, PropagatorCalcScenarioRefreshSortingPlanProducts.class );
		antecedents.add(calcscenariorefreshsortingplans);
		
		return antecedents;
	}

	@Override
	protected void calculate() {
		Scenario scenario = (Scenario)this.target;
		scenario.refreshEndProducts();
	}

	@Override
	protected void addBindings() {
		super.addBindings();
		this.addInboundBindingNavigationFeature(cptspPackage.Literals.SCENARIO__SORTING_PLAN_PRODUCTS, DependencySortingPlanProduct.class);
	}

	static public class DependencySortingPlanProduct extends PropagatorDependencyAdapter{
		protected void addBindings() {
			super.addBindings();
			this.addInboundBindingFeature(cptspPackage.Literals.SORTING_PLAN_PRODUCT__SORTING_PLANS_ACCEPTING);
			this.addInboundBindingFeature(cptspPackage.Literals.SORTING_PLAN_PRODUCT__SORTING_PLANS_PRODUCING);
		}
	}; 
}
