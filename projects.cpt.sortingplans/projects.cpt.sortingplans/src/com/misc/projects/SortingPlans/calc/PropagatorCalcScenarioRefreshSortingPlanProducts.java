package com.misc.projects.SortingPlans.calc;

import com.misc.common.moplaf.propagator.PropagatorDependencyAdapter;
import com.misc.common.moplaf.propagator.PropagatorFunctionAdapter;
import com.misc.common.moplaf.propagator.PropagatorFunctionAdapters;
import com.misc.common.moplaf.propagator.Util;
import com.misc.projects.SortingPlans.Scenario;
import com.misc.projects.SortingPlans.cptspPackage;

public class PropagatorCalcScenarioRefreshSortingPlanProducts extends PropagatorFunctionAdapter {

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
		
		PropagatorFunctionAdapter layersortingplansrefresh  = Util.getPropagatorFunctionAdapter(scenario, PropagatorLayerSortingPlansRefresh.class );
		antecedents.add(layersortingplansrefresh);
		
		return antecedents;
	}

	@Override
	protected void calculate() {
		Scenario scenario = (Scenario)this.target;
		scenario.refreshSortingPlanProduct();
	}

	@Override
	protected void addListeners() {
		super.addListeners();
		this.addNavigationFeatureListener(cptspPackage.Literals.SCENARIO__SORTING_PLANS, DependencySortingPlan.class);
	}

	static public class DependencySortingPlan extends PropagatorDependencyAdapter{
		protected void addListeners() {
			super.addListeners();
			this.addFeatureListener(cptspPackage.Literals.SORTING_PLAN__INPUTS);
			this.addFeatureListener(cptspPackage.Literals.SORTING_PLAN__OUTPUTS);
		}
	}; 
}
