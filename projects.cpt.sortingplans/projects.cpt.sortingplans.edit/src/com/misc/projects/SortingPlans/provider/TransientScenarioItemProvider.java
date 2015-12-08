package com.misc.projects.SortingPlans.provider;


import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

import com.misc.common.moplaf.emf.edit.ui.provider.TransientItemProviderAdapter;
import com.misc.projects.SortingPlans.Scenario;


abstract public class TransientScenarioItemProvider extends TransientItemProviderAdapter
		implements IEditingDomainItemProvider, 
		           IStructuredItemContentProvider,
		           ITreeItemContentProvider, 
		           IItemLabelProvider, 
		           IItemPropertySource {


	// constructor
	public TransientScenarioItemProvider(AdapterFactory adapterFactory, Scenario scenario) {
		super(adapterFactory);
		scenario.eAdapters().add(this);
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return SortingplansEditPlugin.INSTANCE;
	}
}
