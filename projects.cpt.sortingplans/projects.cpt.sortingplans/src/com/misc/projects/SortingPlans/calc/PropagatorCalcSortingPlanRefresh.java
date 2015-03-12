package com.misc.projects.SortingPlans.calc;


import com.misc.common.moplaf.propagator.PropagatorDependencyAdapter;
import com.misc.common.moplaf.propagator.PropagatorFunctionAdapter;
import com.misc.common.moplaf.propagator.Util;
import com.misc.projects.CptDatasetLoad.CptDatasetLoadPackage;
import com.misc.projects.SortingPlans.Scenario;
import com.misc.projects.SortingPlans.SortingPlan;
import com.misc.projects.SortingPlans.cptspPackage;

public class PropagatorCalcSortingPlanRefresh extends PropagatorFunctionAdapter {

	@Override
	protected PropagatorFunctionAdapter getParent() {
		SortingPlan sortingPlan = (SortingPlan)this.target;
		Scenario scenario = sortingPlan.getScenario();
		PropagatorFunctionAdapter parent = Util.getPropagatorFunctionAdapter(scenario, PropagatorLayerSortingPlansRefresh.class);
		return parent;
	}


	@Override
	protected void calculate() {
		SortingPlan sortingPlan = (SortingPlan)this.target;
		sortingPlan.refresh();
	}

	@Override
	protected void addListeners() {
		super.addListeners();
		this.addNavigationFeatureListener(cptspPackage.Literals.SORTING_PLAN__FPD_SORTING_PLAN, DependencyFPDSortingPlan.class);
	}

	static public class DependencyFPDSortingPlan extends PropagatorDependencyAdapter{
		protected void addListeners() {
			super.addListeners();
			this.addFeatureListener(CptDatasetLoadPackage.Literals.SORTING_PLAN_ROW__INPUTS);
			this.addFeatureListener(CptDatasetLoadPackage.Literals.SORTING_PLAN_ROW__OUTPUTS);
		}
	}; 
};
