/**
 */
package com.misc.projects.SortingPlans.provider;


import com.misc.projects.SortingPlans.SortingPlanOutput;
import com.misc.projects.SortingPlans.cptspPackage;
import java.util.Collection;
import java.util.List;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EStructuralFeature;
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
 * <!-- end-user-doc -->
 * @generated
 */
public class SortingPlanOutputItemProvider 
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
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
			addSortingPlanEndProductPropertyDescriptor(object);
			addSelectedPropertyDescriptor(object);
			addSelectedNotShortestPropertyDescriptor(object);
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
				 true,
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
				 true,
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
	 * This adds a property descriptor for the Sorting Plan End Product feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSortingPlanEndProductPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SortingPlanOutput_SortingPlanEndProduct_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SortingPlanOutput_SortingPlanEndProduct_feature", "_UI_SortingPlanOutput_type"),
				 cptspPackage.Literals.SORTING_PLAN_OUTPUT__SORTING_PLAN_END_PRODUCT,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Selected feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSelectedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SortingPlanOutput_selected_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SortingPlanOutput_selected_feature", "_UI_SortingPlanOutput_type"),
				 cptspPackage.Literals.SORTING_PLAN_OUTPUT__SELECTED,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Selected Not Shortest feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSelectedNotShortestPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SortingPlanOutput_selectedNotShortest_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SortingPlanOutput_selectedNotShortest_feature", "_UI_SortingPlanOutput_type"),
				 cptspPackage.Literals.SORTING_PLAN_OUTPUT__SELECTED_NOT_SHORTEST,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(cptspPackage.Literals.SORTING_PLAN_OUTPUT__SORTING_PLAN_END_PRODUCT);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns SortingPlanOutput.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/SortingPlanOutput"));
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
			case cptspPackage.SORTING_PLAN_OUTPUT__SELECTED:
			case cptspPackage.SORTING_PLAN_OUTPUT__SELECTED_NOT_SHORTEST:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case cptspPackage.SORTING_PLAN_OUTPUT__SORTING_PLAN_END_PRODUCT:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
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

}
