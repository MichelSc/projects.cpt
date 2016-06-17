/**
 */
package com.misc.projects.CptDatasetLoad.provider;


import com.misc.projects.CptDatasetLoad.CptDatasetLoadPackage;
import com.misc.projects.CptDatasetLoad.SortingPlanOutputRow;
import java.util.Collection;
import java.util.List;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link com.misc.projects.CptDatasetLoad.SortingPlanOutputRow} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SortingPlanOutputRowItemProvider extends FPDSortingPanRowItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SortingPlanOutputRowItemProvider(AdapterFactory adapterFactory) {
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

			addSortingPlanSkPropertyDescriptor(object);
			addSortingLevelAVCSSkPropertyDescriptor(object);
			addMechanizationLevelSkPropertyDescriptor(object);
			addThroughputTypeSkPropertyDescriptor(object);
			addDestinationSkPropertyDescriptor(object);
			addSortingPlanPropertyDescriptor(object);
			addSortingLevelPropertyDescriptor(object);
			addDescriptionPropertyDescriptor(object);
			addValidFromDatePropertyDescriptor(object);
			addValidToDatePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Sorting Plan Sk feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSortingPlanSkPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SortingPlanOutputRow_SortingPlanSk_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SortingPlanOutputRow_SortingPlanSk_feature", "_UI_SortingPlanOutputRow_type"),
				 CptDatasetLoadPackage.Literals.SORTING_PLAN_OUTPUT_ROW__SORTING_PLAN_SK,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
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
				 getString("_UI_SortingPlanOutputRow_SortingLevelAVCSSk_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SortingPlanOutputRow_SortingLevelAVCSSk_feature", "_UI_SortingPlanOutputRow_type"),
				 CptDatasetLoadPackage.Literals.SORTING_PLAN_OUTPUT_ROW__SORTING_LEVEL_AVCS_SK,
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
				 getString("_UI_SortingPlanOutputRow_MechanizationLevelSk_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SortingPlanOutputRow_MechanizationLevelSk_feature", "_UI_SortingPlanOutputRow_type"),
				 CptDatasetLoadPackage.Literals.SORTING_PLAN_OUTPUT_ROW__MECHANIZATION_LEVEL_SK,
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
				 getString("_UI_SortingPlanOutputRow_ThroughputTypeSk_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SortingPlanOutputRow_ThroughputTypeSk_feature", "_UI_SortingPlanOutputRow_type"),
				 CptDatasetLoadPackage.Literals.SORTING_PLAN_OUTPUT_ROW__THROUGHPUT_TYPE_SK,
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
				 getString("_UI_SortingPlanOutputRow_DestinationSk_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SortingPlanOutputRow_DestinationSk_feature", "_UI_SortingPlanOutputRow_type"),
				 CptDatasetLoadPackage.Literals.SORTING_PLAN_OUTPUT_ROW__DESTINATION_SK,
				 true,
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
				 getString("_UI_SortingPlanOutputRow_SortingPlan_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SortingPlanOutputRow_SortingPlan_feature", "_UI_SortingPlanOutputRow_type"),
				 CptDatasetLoadPackage.Literals.SORTING_PLAN_OUTPUT_ROW__SORTING_PLAN,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Sorting Level feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSortingLevelPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SortingPlanOutputRow_SortingLevel_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SortingPlanOutputRow_SortingLevel_feature", "_UI_SortingPlanOutputRow_type"),
				 CptDatasetLoadPackage.Literals.SORTING_PLAN_OUTPUT_ROW__SORTING_LEVEL,
				 false,
				 false,
				 false,
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
				 getString("_UI_SortingPlanOutputRow_Description_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SortingPlanOutputRow_Description_feature", "_UI_SortingPlanOutputRow_type"),
				 CptDatasetLoadPackage.Literals.SORTING_PLAN_OUTPUT_ROW__DESCRIPTION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Valid From Date feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addValidFromDatePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SortingPlanOutputRow_ValidFromDate_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SortingPlanOutputRow_ValidFromDate_feature", "_UI_SortingPlanOutputRow_type"),
				 CptDatasetLoadPackage.Literals.SORTING_PLAN_OUTPUT_ROW__VALID_FROM_DATE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Valid To Date feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addValidToDatePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SortingPlanOutputRow_ValidToDate_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SortingPlanOutputRow_ValidToDate_feature", "_UI_SortingPlanOutputRow_type"),
				 CptDatasetLoadPackage.Literals.SORTING_PLAN_OUTPUT_ROW__VALID_TO_DATE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((SortingPlanOutputRow)object).getDescription();
		return label == null || label.length() == 0 ?
			getString("_UI_SortingPlanOutputRow_type") :
			getString("_UI_SortingPlanOutputRow_type") + " " + label;
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

		switch (notification.getFeatureID(SortingPlanOutputRow.class)) {
			case CptDatasetLoadPackage.SORTING_PLAN_OUTPUT_ROW__SORTING_PLAN_SK:
			case CptDatasetLoadPackage.SORTING_PLAN_OUTPUT_ROW__SORTING_LEVEL_AVCS_SK:
			case CptDatasetLoadPackage.SORTING_PLAN_OUTPUT_ROW__MECHANIZATION_LEVEL_SK:
			case CptDatasetLoadPackage.SORTING_PLAN_OUTPUT_ROW__THROUGHPUT_TYPE_SK:
			case CptDatasetLoadPackage.SORTING_PLAN_OUTPUT_ROW__DESTINATION_SK:
			case CptDatasetLoadPackage.SORTING_PLAN_OUTPUT_ROW__DESCRIPTION:
			case CptDatasetLoadPackage.SORTING_PLAN_OUTPUT_ROW__VALID_FROM_DATE:
			case CptDatasetLoadPackage.SORTING_PLAN_OUTPUT_ROW__VALID_TO_DATE:
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

}
