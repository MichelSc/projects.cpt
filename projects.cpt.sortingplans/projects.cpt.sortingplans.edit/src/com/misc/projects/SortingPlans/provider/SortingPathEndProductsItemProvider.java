package com.misc.projects.SortingPlans.provider;

import java.util.Collection;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EStructuralFeature;

import com.misc.projects.SortingPlans.SortingPath;
import com.misc.projects.SortingPlans.cptspPackage;

public class SortingPathEndProductsItemProvider extends
		TransientSortingPathItemProvider {

	public SortingPathEndProductsItemProvider(AdapterFactory adapterFactory,
                                			SortingPath sortingPath) {
		super(adapterFactory, sortingPath);
	}
	
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(cptspPackage.Literals.SORTING_PATH__SORTED_END_PRODUCTS);
		}
		return childrenFeatures;
	}
	
	@Override
	public String getText(Object object) {
		return "EndProducts";
	}

}
