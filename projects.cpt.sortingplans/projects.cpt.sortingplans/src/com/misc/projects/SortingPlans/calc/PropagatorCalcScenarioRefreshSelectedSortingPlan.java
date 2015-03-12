package com.misc.projects.SortingPlans.calc;

import com.misc.common.moplaf.propagator.PropagatorFunctionAdapter;
import com.misc.common.moplaf.propagator.Util;
import com.misc.projects.SortingPlans.Scenario;
import com.misc.projects.SortingPlans.cptspPackage;

public class PropagatorCalcScenarioRefreshSelectedSortingPlan extends PropagatorFunctionAdapter {

	@Override
	protected PropagatorFunctionAdapter getParent() {
		Scenario scenario= (Scenario)this.target;
		PropagatorFunctionAdapter parent = Util.getPropagatorFunctionAdapter(scenario, PropagatorScopeScenario.class);
		return parent;
	}
	

	@Override
	protected void calculate() {
		Scenario scenario = (Scenario)this.target;
		scenario.refreshSelectedSortingPlans();
	}

	@Override
	protected void addListeners() {
		super.addListeners();
		this.addFeatureListener(cptspPackage.Literals.SCENARIO__SELECTED_SORTING_PLANS);
	}

}
