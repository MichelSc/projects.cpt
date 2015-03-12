package com.misc.projects.SortingPlans.provider;

import java.util.Collection;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EStructuralFeature;

import com.misc.projects.SortingPlans.SortingPlanProduct;
import com.misc.projects.SortingPlans.cptspPackage;

public class SortingPlanProductSortingPlansProducingItemProvider extends
		TransientSortingPlanProductItemProvider {

	public SortingPlanProductSortingPlansProducingItemProvider(AdapterFactory adapterFactory,
                                			SortingPlanProduct sortingPlanProduct) {
		super(adapterFactory, sortingPlanProduct);
	}
	
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(cptspPackage.Literals.SORTING_PLAN_PRODUCT__SORTING_PLANS_PRODUCING);
		}
		return childrenFeatures;
	}
	
	@Override
	public String getText(Object object) {
		return "Productors";
	}

}
