package com.misc.projects.SortingPlans.calc;

import com.misc.common.moplaf.propagator.PropagatorDependencyAdapter;
import com.misc.common.moplaf.propagator.PropagatorFunctionAdapter;
import com.misc.common.moplaf.propagator.Util;
import com.misc.projects.SortingPlans.Scenario;
import com.misc.projects.SortingPlans.SortingPlanInput;
import com.misc.projects.SortingPlans.cptspPackage;

public class PropagatorCalcSortingPlanInputRefreshSelected extends PropagatorFunctionAdapter {

	@Override
	protected PropagatorFunctionAdapter getParent() {
		SortingPlanInput spin = (SortingPlanInput)this.target;
		Scenario scenario = spin.getSortingPlan().getScenario();
		PropagatorFunctionAdapter parent = Util.getPropagatorFunctionAdapter(scenario, PropagatorLayerSortingPlanInputRefreshSelected.class);
		return parent;
	}
	
	@Override
	protected void calculate() {
		SortingPlanInput spin = (SortingPlanInput)this.target;
		spin.refreshSelected();
	}

	@Override
	protected void addListeners() {
		super.addListeners();
		this.addNavigationFeatureListener(cptspPackage.Literals.SORTING_PLAN_INPUT__SORTING_PLAN, DependencySortingPlan.class);
	}

	static public class DependencySortingPlan extends PropagatorDependencyAdapter{
		protected void addListeners() {
			super.addListeners();
			this.addFeatureListener(cptspPackage.Literals.SORTING_PLAN__SELECTED);
		}
	}
}
