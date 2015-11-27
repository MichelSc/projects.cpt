package com.misc.projects.SortingPlans.provider;

import java.util.Collection;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ViewerNotification;

import com.misc.projects.SortingPlans.SortingPlan;
import com.misc.projects.SortingPlans.cptspPackage;

public class SortingPlanEndProductsItemProvider extends
		TransientSortingPlanItemProvider {

	public SortingPlanEndProductsItemProvider(AdapterFactory adapterFactory,
                                			SortingPlan sortingPlan) {
		super(adapterFactory, sortingPlan);
	}
	
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(cptspPackage.Literals.SORTING_PLAN__END_PRODUCTS);
		}
		return childrenFeatures;
	}
	
	@Override
	public String getText(Object object) {
		return "EndProducts";
	}
	
	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(SortingPlan.class)) {
			case cptspPackage.SORTING_PLAN__END_PRODUCTS:
				fireNotifyChanged(new ViewerNotification(notification, 
						                                 notification.getNotifier(), 
						                                 true,  // content refresh 
						                                 true)); // label update
				return;
		}
		super.notifyChanged(notification);
	}
	
	}
