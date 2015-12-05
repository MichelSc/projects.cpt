/**
 */
package com.misc.projects.SortingPlans.provider;


import com.misc.projects.SortingPlans.SortingPlanProduct;
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
 * This is the item provider adapter for a {@link com.misc.projects.SortingPlans.SortingPlanProduct} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SortingPlanProductItemProvider 
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
	public SortingPlanProductItemProvider(AdapterFactory adapterFactory) {
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

			addFPDSortingLevelPropertyDescriptor(object);
			addSortingPlansProducingPropertyDescriptor(object);
			addSortingPlansAcceptingPropertyDescriptor(object);
			addSortingLevelAVCSSkPropertyDescriptor(object);
			addMechanizationLevelSkPropertyDescriptor(object);
			addThroughputTypeSkPropertyDescriptor(object);
			addDestinationSkPropertyDescriptor(object);
			addDescriptionPropertyDescriptor(object);
			addEndProductPropertyDescriptor(object);
			addEndProductsPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the FPD Sorting Level feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFPDSortingLevelPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SortingPlanProduct_FPDSortingLevel_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SortingPlanProduct_FPDSortingLevel_feature", "_UI_SortingPlanProduct_type"),
				 cptspPackage.Literals.SORTING_PLAN_PRODUCT__FPD_SORTING_LEVEL,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Sorting Plans Producing feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSortingPlansProducingPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SortingPlanProduct_SortingPlansProducing_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SortingPlanProduct_SortingPlansProducing_feature", "_UI_SortingPlanProduct_type"),
				 cptspPackage.Literals.SORTING_PLAN_PRODUCT__SORTING_PLANS_PRODUCING,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Sorting Plans Accepting feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSortingPlansAcceptingPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SortingPlanProduct_SortingPlansAccepting_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SortingPlanProduct_SortingPlansAccepting_feature", "_UI_SortingPlanProduct_type"),
				 cptspPackage.Literals.SORTING_PLAN_PRODUCT__SORTING_PLANS_ACCEPTING,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Sorting Level AVCS Sk feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSortingLevelAVCSSkPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SortingPlanProduct_SortingLevelAVCSSk_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SortingPlanProduct_SortingLevelAVCSSk_feature", "_UI_SortingPlanProduct_type"),
				 cptspPackage.Literals.SORTING_PLAN_PRODUCT__SORTING_LEVEL_AVCS_SK,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Mechanization Level Sk feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMechanizationLevelSkPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SortingPlanProduct_MechanizationLevelSk_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SortingPlanProduct_MechanizationLevelSk_feature", "_UI_SortingPlanProduct_type"),
				 cptspPackage.Literals.SORTING_PLAN_PRODUCT__MECHANIZATION_LEVEL_SK,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Throughput Type Sk feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addThroughputTypeSkPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SortingPlanProduct_ThroughputTypeSk_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SortingPlanProduct_ThroughputTypeSk_feature", "_UI_SortingPlanProduct_type"),
				 cptspPackage.Literals.SORTING_PLAN_PRODUCT__THROUGHPUT_TYPE_SK,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Destination Sk feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDestinationSkPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SortingPlanProduct_DestinationSk_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SortingPlanProduct_DestinationSk_feature", "_UI_SortingPlanProduct_type"),
				 cptspPackage.Literals.SORTING_PLAN_PRODUCT__DESTINATION_SK,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
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
				 getString("_UI_SortingPlanProduct_Description_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SortingPlanProduct_Description_feature", "_UI_SortingPlanProduct_type"),
				 cptspPackage.Literals.SORTING_PLAN_PRODUCT__DESCRIPTION,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the End Product feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEndProductPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SortingPlanProduct_EndProduct_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SortingPlanProduct_EndProduct_feature", "_UI_SortingPlanProduct_type"),
				 cptspPackage.Literals.SORTING_PLAN_PRODUCT__END_PRODUCT,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the End Products feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEndProductsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SortingPlanProduct_EndProducts_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SortingPlanProduct_EndProducts_feature", "_UI_SortingPlanProduct_type"),
				 cptspPackage.Literals.SORTING_PLAN_PRODUCT__END_PRODUCTS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This returns SortingPlanProduct.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/cpt_p.png"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((SortingPlanProduct)object).getDescription();
		return label == null || label.length() == 0 ?
			getString("_UI_SortingPlanProduct_type") :
			getString("_UI_SortingPlanProduct_type") + " " + label;
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

		switch (notification.getFeatureID(SortingPlanProduct.class)) {
			case cptspPackage.SORTING_PLAN_PRODUCT__SORTING_PLANS_PRODUCING:
			case cptspPackage.SORTING_PLAN_PRODUCT__SORTING_PLANS_ACCEPTING:
			case cptspPackage.SORTING_PLAN_PRODUCT__SORTING_LEVEL_AVCS_SK:
			case cptspPackage.SORTING_PLAN_PRODUCT__MECHANIZATION_LEVEL_SK:
			case cptspPackage.SORTING_PLAN_PRODUCT__THROUGHPUT_TYPE_SK:
			case cptspPackage.SORTING_PLAN_PRODUCT__DESTINATION_SK:
			case cptspPackage.SORTING_PLAN_PRODUCT__DESCRIPTION:
			case cptspPackage.SORTING_PLAN_PRODUCT__END_PRODUCT:
			case cptspPackage.SORTING_PLAN_PRODUCT__SORTING_PATHS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
		}
		super.notifyChanged(notification);
	}

	protected List<Object> children = null;

	/* (non-Javadoc)
	 * @see org.eclipse.emf.edit.provider.ItemProviderAdapter#getChildren(java.lang.Object)
	 */
	@Override
	public Collection<?> getChildren(Object object) {
		Collection<Object> superchildren = (Collection<Object>) super.getChildren(object);
		if ( children == null){
			SortingPlanProduct sortingPlanProduct = (SortingPlanProduct) object;
			children = new ArrayList<Object>();
			children.add(new SortingPlanProductSortingPlansAcceptingItemProvider(adapterFactory, sortingPlanProduct));
			children.add(new SortingPlanProductSortingPlansProducingItemProvider(adapterFactory, sortingPlanProduct));
			children.add(new SortingPlanProductSortingPathsItemProvider(adapterFactory, sortingPlanProduct));
		}
		superchildren.addAll(children);
		return superchildren;
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
