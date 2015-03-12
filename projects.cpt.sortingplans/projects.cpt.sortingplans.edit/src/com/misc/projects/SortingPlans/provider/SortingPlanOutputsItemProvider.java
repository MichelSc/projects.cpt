package com.misc.projects.SortingPlans.provider;

import java.util.Collection;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EStructuralFeature;

import com.misc.projects.SortingPlans.SortingPlan;
import com.misc.projects.SortingPlans.cptspFactory;
import com.misc.projects.SortingPlans.cptspPackage;

public class SortingPlanOutputsItemProvider extends
		TransientSortingPlanItemProvider {

	public SortingPlanOutputsItemProvider(AdapterFactory adapterFactory,
                                			SortingPlan sortingPlan) {
		super(adapterFactory, sortingPlan);
	}
	
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(cptspPackage.Literals.SORTING_PLAN__OUTPUTS);
		}
		return childrenFeatures;
	}
	
	@Override
	public String getText(Object object) {
		return "Outputs";
	}

	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
		(createChildParameter
			(cptspPackage.Literals.SORTING_PLAN__OUTPUTS,
			 cptspFactory.eINSTANCE.createSortingPlanOutput()));

	}
}
