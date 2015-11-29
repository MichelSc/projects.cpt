/**
 */
package com.misc.projects.SortingPlans.provider;


import com.misc.common.moplaf.emf.edit.ui.provider.IItemRelativesProvider;
import com.misc.projects.SortingPlans.SortingPlanOutput;
import com.misc.projects.SortingPlans.cptspPackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link com.misc.projects.SortingPlans.SortingPlanOutput} object.
 * <!-- begin-user-doc -->
 * @implements IItemRelativesProvider
 * <!-- end-user-doc -->
 * @generated
 */
public class SortingPlanOutputItemProvider 
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider, IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource, IItemRelativesProvider {
	
	/* (non-Javadoc)
	 * @see org.eclipse.emf.edit.provider.ItemProviderAdapter#isAdapterForType(java.lang.Object)
	 */
	@Override
	public boolean isAdapterForType(Object type) {
		if ( super.isAdapterForType(type) ){ return true; }
		if ( type == IItemRelativesProvider.class) { return true; }
		return false;
	}

	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SortingPlanOutputItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addFPDSortingPlanOutputPropertyDescriptor(object);
			addOutputProductPropertyDescriptor(object);
			addDescriptionPropertyDescriptor(object);
			addSortingPlanPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the FPD Sorting Plan Output feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFPDSortingPlanOutputPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SortingPlanOutput_FPDSortingPlanOutput_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SortingPlanOutput_FPDSortingPlanOutput_feature", "_UI_SortingPlanOutput_type"),
				 cptspPackage.Literals.SORTING_PLAN_OUTPUT__FPD_SORTING_PLAN_OUTPUT,
				 false,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Output Product feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOutputProductPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SortingPlanOutput_OutputProduct_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SortingPlanOutput_OutputProduct_feature", "_UI_SortingPlanOutput_type"),
				 cptspPackage.Literals.SORTING_PLAN_OUTPUT__OUTPUT_PRODUCT,
				 false,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Description feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDescriptionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SortingPlanOutput_Description_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SortingPlanOutput_Description_feature", "_UI_SortingPlanOutput_type"),
				 cptspPackage.Literals.SORTING_PLAN_OUTPUT__DESCRIPTION,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Sorting Plan feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSortingPlanPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SortingPlanOutput_SortingPlan_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SortingPlanOutput_SortingPlan_feature", "_UI_SortingPlanOutput_type"),
				 cptspPackage.Literals.SORTING_PLAN_OUTPUT__SORTING_PLAN,
				 false,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This returns SortingPlanOutput.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/cpt_spo.png"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((SortingPlanOutput)object).getDescription();
		return label == null || label.length() == 0 ?
			getString("_UI_SortingPlanOutput_type") :
			getString("_UI_SortingPlanOutput_type") + " " + label;
	}
	
	
	/* (non-Javadoc)
	 * @see org.eclipse.emf.edit.provider.ItemProviderAdapter#getParent(java.lang.Object)
	@Override
	public Object getParent(Object object) {
		Object sortingPlan = super.getParent(object);
		SortingPlanItemProvider sortingPlanItemProvider = (SortingPlanItemProvider)adapterFactory.adapt(sortingPlan,  
				                                                                                        IEditingDomainItemProvider.class);
		return sortingPlanItemProvider != null ? sortingPlanItemProvider.getOutputs() : null;
				                                                                                        
	}
	 */
	
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

		switch (notification.getFeatureID(SortingPlanOutput.class)) {
			case cptspPackage.SORTING_PLAN_OUTPUT__DESCRIPTION:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);
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

	@Override
	public Collection<?> getRelatives(Object object) {
		SortingPlanOutput output = (SortingPlanOutput)object;
		ArrayList<Object> relatives = new ArrayList<Object>();
		relatives.add(output.getSortingPlan());
		relatives.add(output.getOutputProduct());
		return relatives;
	}

}
