package com.misc.projects.SortingPlans.calc;


import com.misc.common.moplaf.propagator.PropagatorFunctionAdapter;
import com.misc.common.moplaf.propagator.PropagatorFunctionAdapters;
import com.misc.common.moplaf.propagator.Util;
import com.misc.projects.SortingPlans.Scenario;

public class PropagatorLayerEndProductRefreshSortingPlans extends PropagatorFunctionAdapter {

	@Override
	protected PropagatorFunctionAdapter getParent() {
		Scenario scenario = (Scenario)this.target;
		PropagatorFunctionAdapter parent = Util.getPropagatorFunctionAdapter(scenario, PropagatorScopeScenario.class);
		return parent;
	}

	@Override
	protected PropagatorFunctionAdapters getAntecedents() {
		PropagatorFunctionAdapters antecedents = super.getAntecedents();
		Scenario scenario = (Scenario)this.target;
		
		PropagatorFunctionAdapter calcScenarioRefreshEndProducts = Util.getPropagatorFunctionAdapter(scenario, PropagatorCalcScenarioRefreshEndProducts.class );
		antecedents.add(calcScenarioRefreshEndProducts);
		
		return antecedents;
	}
	

};

