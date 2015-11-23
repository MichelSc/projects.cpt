package com.misc.projects.SortingPlans.calc;

import com.misc.common.moplaf.propagator.PropagatorDependencyAdapter;
import com.misc.common.moplaf.propagator.PropagatorFunctionAdapter;
import com.misc.common.moplaf.propagator.Util;
import com.misc.projects.SortingPlans.Scenario;
import com.misc.projects.SortingPlans.SortingPlanOutput;
import com.misc.projects.SortingPlans.cptspPackage;

public class PropagatorCalcSortingPlanOutputRefreshSelectedNotShortest extends PropagatorFunctionAdapter {

	@Override
	protected PropagatorFunctionAdapter getParent() {
		SortingPlanOutput spout = (SortingPlanOutput)this.target;
		Scenario scenario = spout.getSortingPlan().getScenario();
		PropagatorFunctionAdapter parent = Util.getPropagatorFunctionAdapter(scenario, PropagatorLayerSortingPlanOutputRefreshSelectedNotShortest.class);
		return parent;
	}
	
	@Override
	protected void calculate() {
		SortingPlanOutput spout = (SortingPlanOutput)this.target;
		spout.refreshSelectedNotShortest();
	}

	@Override
	protected void addListeners() {
		super.addListeners();
		this.addNavigationFeatureListener(cptspPackage.Literals.SORTING_PLAN_OUTPUT__OUTPUT_PRODUCT, DependencySortingPlanProduct.class);
	}

	static public class DependencySortingPlanProduct extends PropagatorDependencyAdapter{
		protected void addListeners() {
			super.addListeners();
			this.addFeatureListener(cptspPackage.Literals.SORTING_PLAN_PRODUCT__SELECTED);
		}
	}
}
