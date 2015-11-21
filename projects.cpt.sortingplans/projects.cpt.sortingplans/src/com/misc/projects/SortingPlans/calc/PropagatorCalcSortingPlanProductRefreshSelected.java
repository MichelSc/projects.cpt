package com.misc.projects.SortingPlans.calc;

import com.misc.common.moplaf.propagator.PropagatorDependencyAdapter;
import com.misc.common.moplaf.propagator.PropagatorFunctionAdapter;
import com.misc.common.moplaf.propagator.Util;
import com.misc.projects.SortingPlans.Scenario;
import com.misc.projects.SortingPlans.SortingPlanProduct;
import com.misc.projects.SortingPlans.cptspPackage;

public class PropagatorCalcSortingPlanProductRefreshSelected extends PropagatorFunctionAdapter {

	@Override
	protected PropagatorFunctionAdapter getParent() {
		SortingPlanProduct spp = (SortingPlanProduct)this.target;
		Scenario scenario = (Scenario) spp.eContainer();
		PropagatorFunctionAdapter parent = Util.getPropagatorFunctionAdapter(scenario, PropagatorLayerSortingPlanProductRefreshSelected.class);
		return parent;
	}
	
	@Override
	protected void calculate() {
		SortingPlanProduct spp = (SortingPlanProduct)this.target;
		spp.refreshSelected();
	}

	@Override
	protected void addListeners() {
		super.addListeners();
		this.addNavigationFeatureListener(cptspPackage.Literals.SORTING_PLAN_PRODUCT__SORTING_PLANS_ACCEPTING, DependencySortingPlanInput.class);
		this.addNavigationFeatureListener(cptspPackage.Literals.SORTING_PLAN_PRODUCT__SORTING_PLANS_PRODUCING, DependencySortingPlanOutput.class);
	}

	static public class DependencySortingPlanInput extends PropagatorDependencyAdapter{
		protected void addListeners() {
			super.addListeners();
			this.addFeatureListener(cptspPackage.Literals.SORTING_PLAN_INPUT__SELECTED);
		}
	}
	static public class DependencySortingPlanOutput extends PropagatorDependencyAdapter{
		protected void addListeners() {
			super.addListeners();
			this.addFeatureListener(cptspPackage.Literals.SORTING_PLAN_OUTPUT__SELECTED);
		}
	}
}
