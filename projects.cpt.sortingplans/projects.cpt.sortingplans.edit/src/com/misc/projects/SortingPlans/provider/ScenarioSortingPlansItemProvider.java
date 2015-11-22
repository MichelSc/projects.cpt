package com.misc.projects.SortingPlans.provider;

import java.util.Collection;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EStructuralFeature;

import com.misc.projects.SortingPlans.Scenario;
import com.misc.projects.SortingPlans.cptspFactory;
import com.misc.projects.SortingPlans.cptspPackage;

public class ScenarioSortingPlansItemProvider extends
		TransientScenarioItemProvider {

	public ScenarioSortingPlansItemProvider(AdapterFactory adapterFactory,
                                			Scenario scenario) {
		super(adapterFactory, scenario);
	}
	
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(cptspPackage.Literals.SCENARIO__SORTING_PLANS);
		}
		return childrenFeatures;
	}
	
	@Override
	public String getText(Object object) {
		return "SortingPlans";
	}

	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
		(createChildParameter
			(cptspPackage.Literals.SCENARIO__SORTING_PLANS,
			 cptspFactory.eINSTANCE.createSortingPlan()));

	}
}
