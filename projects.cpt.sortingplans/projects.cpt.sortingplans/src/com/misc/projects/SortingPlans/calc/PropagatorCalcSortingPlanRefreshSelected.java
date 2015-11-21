package com.misc.projects.SortingPlans.calc;

import com.misc.common.moplaf.propagator.PropagatorDependencyAdapter;
import com.misc.common.moplaf.propagator.PropagatorFunctionAdapter;
import com.misc.common.moplaf.propagator.Util;
import com.misc.projects.SortingPlans.Scenario;
import com.misc.projects.SortingPlans.SortingPlan;
import com.misc.projects.SortingPlans.cptspPackage;

public class PropagatorCalcSortingPlanRefreshSelected extends PropagatorFunctionAdapter {

	@Override
	protected PropagatorFunctionAdapter getParent() {
		SortingPlan sp = (SortingPlan)this.target;
		Scenario scenario = sp.getScenario();
		PropagatorFunctionAdapter parent = Util.getPropagatorFunctionAdapter(scenario, PropagatorLayerSortingPlanRefreshSelected.class);
		return parent;
	}
	
	@Override
	protected void calculate() {
		SortingPlan sp = (SortingPlan)this.target;
		sp.refreshSelected();
	}

	@Override
	protected void addListeners() {
		super.addListeners();
		this.addNavigationFeatureListener(cptspPackage.Literals.SORTING_PLAN__OUTPUTS, DependencySortingPlanOutput.class);
	}

	static public class DependencySortingPlanOutput extends PropagatorDependencyAdapter{
		protected void addListeners() {
			super.addListeners();
			this.addFeatureListener(cptspPackage.Literals.SORTING_PLAN_OUTPUT__SELECTED);
		}
	};
}
