package com.misc.projects.SortingPlans.provider;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

import com.misc.common.moplaf.emf.edit.ui.provider.TransientItemProviderAdapter;
import com.misc.projects.SortingPlans.SortingPlan;

public class TransientSortingPlanItemProvider extends TransientItemProviderAdapter
		implements IEditingDomainItemProvider, 
		           IStructuredItemContentProvider,
		           ITreeItemContentProvider, 
		           IItemLabelProvider, 
		           IItemPropertySource {

	// constructor
	public TransientSortingPlanItemProvider(AdapterFactory adapterFactory, SortingPlan sortingPlan) {
		super(adapterFactory);
		sortingPlan.eAdapters().add(this);
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return SortingplansEditPlugin.INSTANCE;
	}

}
