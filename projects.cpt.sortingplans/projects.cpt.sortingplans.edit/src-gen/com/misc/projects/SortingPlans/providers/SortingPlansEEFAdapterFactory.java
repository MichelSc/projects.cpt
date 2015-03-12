/**
 * Generated with Acceleo
 */
package com.misc.projects.SortingPlans.providers;

import com.misc.projects.SortingPlans.util.cptspAdapterFactory;

import org.eclipse.emf.common.notify.Adapter;

/**
 * 
 * 
 */
public class SortingPlansEEFAdapterFactory extends cptspAdapterFactory {

	/**
	 * {@inheritDoc}
	 * @see com.misc.projects.SortingPlans.util.cptspAdapterFactory#createScenariosAdapter()
	 * 
	 */
	public Adapter createScenariosAdapter() {
		return new ScenariosPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see com.misc.projects.SortingPlans.util.cptspAdapterFactory#createScenarioAdapter()
	 * 
	 */
	public Adapter createScenarioAdapter() {
		return new ScenarioPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see com.misc.projects.SortingPlans.util.cptspAdapterFactory#createSortingPlanAdapter()
	 * 
	 */
	public Adapter createSortingPlanAdapter() {
		return new SortingPlanPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see com.misc.projects.SortingPlans.util.cptspAdapterFactory#createEndProductAdapter()
	 * 
	 */
	public Adapter createEndProductAdapter() {
		return new EndProductPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see com.misc.projects.SortingPlans.util.cptspAdapterFactory#createSortingPlanProductAdapter()
	 * 
	 */
	public Adapter createSortingPlanProductAdapter() {
		return new SortingPlanProductPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see com.misc.projects.SortingPlans.util.cptspAdapterFactory#createSortingPlanEndProductAdapter()
	 * 
	 */
	public Adapter createSortingPlanEndProductAdapter() {
		return new SortingPlanEndProductPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see com.misc.projects.SortingPlans.util.cptspAdapterFactory#createSortingPlanOutputAdapter()
	 * 
	 */
	public Adapter createSortingPlanOutputAdapter() {
		return new SortingPlanOutputPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see com.misc.projects.SortingPlans.util.cptspAdapterFactory#createSortingPlanInputAdapter()
	 * 
	 */
	public Adapter createSortingPlanInputAdapter() {
		return new SortingPlanInputPropertiesEditionProvider();
	}

}
