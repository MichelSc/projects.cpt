/**
 */
package com.misc.projects.CptDatasetLoad.provider;


import com.misc.common.moplaf.dbsynch.impl.TableRowKeyImpl;
import com.misc.common.moplaf.dbsynch.provider.TableRowItemProvider;
import com.misc.projects.CptDatasetLoad.CptDatasetLoadPackage;
import com.misc.projects.CptDatasetLoad.FPOForecastBucket;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link com.misc.projects.CptDatasetLoad.FPOForecastBucket} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class FPOForecastBucketItemProvider extends TableRowItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FPOForecastBucketItemProvider(AdapterFactory adapterFactory) {
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

			addBucketDatePropertyDescriptor(object);
			addBucketBeginTimePropertyDescriptor(object);
			addBucketEndTimePropertyDescriptor(object);
			addBucketHourPropertyDescriptor(object);
			addCustomerPropertyDescriptor(object);
			addFirstSortingImcPropertyDescriptor(object);
			addIntakeChannelPropertyDescriptor(object);
			addIntakeLocationPropertyDescriptor(object);
			addDayPlusPropertyDescriptor(object);
			addThroughputTypePropertyDescriptor(object);
			addMechanizationLevelPropertyDescriptor(object);
			addSortingLevelAGGPropertyDescriptor(object);
			addVolumePropertyDescriptor(object);
			addPublicationIDPropertyDescriptor(object);
			addTimeSeriesIDPropertyDescriptor(object);
			addBucketIDPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Bucket Date feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBucketDatePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FPOForecastBucket_BucketDate_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FPOForecastBucket_BucketDate_feature", "_UI_FPOForecastBucket_type"),
				 CptDatasetLoadPackage.Literals.FPO_FORECAST_BUCKET__BUCKET_DATE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI__1TimePropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Bucket Begin Time feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBucketBeginTimePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FPOForecastBucket_BucketBeginTime_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FPOForecastBucket_BucketBeginTime_feature", "_UI_FPOForecastBucket_type"),
				 CptDatasetLoadPackage.Literals.FPO_FORECAST_BUCKET__BUCKET_BEGIN_TIME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI__1TimePropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Bucket End Time feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBucketEndTimePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FPOForecastBucket_BucketEndTime_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FPOForecastBucket_BucketEndTime_feature", "_UI_FPOForecastBucket_type"),
				 CptDatasetLoadPackage.Literals.FPO_FORECAST_BUCKET__BUCKET_END_TIME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI__1TimePropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Bucket Hour feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBucketHourPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FPOForecastBucket_BucketHour_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FPOForecastBucket_BucketHour_feature", "_UI_FPOForecastBucket_type"),
				 CptDatasetLoadPackage.Literals.FPO_FORECAST_BUCKET__BUCKET_HOUR,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI__1TimePropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Customer feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCustomerPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FPOForecastBucket_Customer_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FPOForecastBucket_Customer_feature", "_UI_FPOForecastBucket_type"),
				 CptDatasetLoadPackage.Literals.FPO_FORECAST_BUCKET__CUSTOMER,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI__2ForecastDimensionPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the First Sorting Imc feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFirstSortingImcPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FPOForecastBucket_FirstSortingImc_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FPOForecastBucket_FirstSortingImc_feature", "_UI_FPOForecastBucket_type"),
				 CptDatasetLoadPackage.Literals.FPO_FORECAST_BUCKET__FIRST_SORTING_IMC,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI__2ForecastDimensionPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Intake Channel feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIntakeChannelPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FPOForecastBucket_IntakeChannel_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FPOForecastBucket_IntakeChannel_feature", "_UI_FPOForecastBucket_type"),
				 CptDatasetLoadPackage.Literals.FPO_FORECAST_BUCKET__INTAKE_CHANNEL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI__2ForecastDimensionPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Intake Location feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIntakeLocationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FPOForecastBucket_IntakeLocation_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FPOForecastBucket_IntakeLocation_feature", "_UI_FPOForecastBucket_type"),
				 CptDatasetLoadPackage.Literals.FPO_FORECAST_BUCKET__INTAKE_LOCATION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI__2ForecastDimensionPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Day Plus feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDayPlusPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FPOForecastBucket_DayPlus_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FPOForecastBucket_DayPlus_feature", "_UI_FPOForecastBucket_type"),
				 CptDatasetLoadPackage.Literals.FPO_FORECAST_BUCKET__DAY_PLUS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI__2ForecastDimensionPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Throughput Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addThroughputTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FPOForecastBucket_ThroughputType_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FPOForecastBucket_ThroughputType_feature", "_UI_FPOForecastBucket_type"),
				 CptDatasetLoadPackage.Literals.FPO_FORECAST_BUCKET__THROUGHPUT_TYPE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI__2ForecastDimensionPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Mechanization Level feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMechanizationLevelPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FPOForecastBucket_MechanizationLevel_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FPOForecastBucket_MechanizationLevel_feature", "_UI_FPOForecastBucket_type"),
				 CptDatasetLoadPackage.Literals.FPO_FORECAST_BUCKET__MECHANIZATION_LEVEL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI__2ForecastDimensionPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Sorting Level AGG feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSortingLevelAGGPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FPOForecastBucket_SortingLevelAGG_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FPOForecastBucket_SortingLevelAGG_feature", "_UI_FPOForecastBucket_type"),
				 CptDatasetLoadPackage.Literals.FPO_FORECAST_BUCKET__SORTING_LEVEL_AGG,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI__2ForecastDimensionPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Volume feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVolumePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FPOForecastBucket_Volume_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FPOForecastBucket_Volume_feature", "_UI_FPOForecastBucket_type"),
				 CptDatasetLoadPackage.Literals.FPO_FORECAST_BUCKET__VOLUME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI__3VolumePropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Publication ID feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPublicationIDPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FPOForecastBucket_PublicationID_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FPOForecastBucket_PublicationID_feature", "_UI_FPOForecastBucket_type"),
				 CptDatasetLoadPackage.Literals.FPO_FORECAST_BUCKET__PUBLICATION_ID,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI__0BucketPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Time Series ID feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTimeSeriesIDPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FPOForecastBucket_TimeSeriesID_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FPOForecastBucket_TimeSeriesID_feature", "_UI_FPOForecastBucket_type"),
				 CptDatasetLoadPackage.Literals.FPO_FORECAST_BUCKET__TIME_SERIES_ID,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI__0BucketPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Bucket ID feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBucketIDPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FPOForecastBucket_BucketID_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FPOForecastBucket_BucketID_feature", "_UI_FPOForecastBucket_type"),
				 CptDatasetLoadPackage.Literals.FPO_FORECAST_BUCKET__BUCKET_ID,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI__0BucketPropertyCategory"),
				 null));
	}

	/**
	 * This returns FPOForecastBucket.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/FPOForecastBucket"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		TableRowKeyImpl labelValue = ((FPOForecastBucket)object).getCurrentKey();
		String label = labelValue == null ? null : labelValue.toString();
		return label == null || label.length() == 0 ?
			getString("_UI_FPOForecastBucket_type") :
			getString("_UI_FPOForecastBucket_type") + " " + label;
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

		switch (notification.getFeatureID(FPOForecastBucket.class)) {
			case CptDatasetLoadPackage.FPO_FORECAST_BUCKET__BUCKET_DATE:
			case CptDatasetLoadPackage.FPO_FORECAST_BUCKET__BUCKET_BEGIN_TIME:
			case CptDatasetLoadPackage.FPO_FORECAST_BUCKET__BUCKET_END_TIME:
			case CptDatasetLoadPackage.FPO_FORECAST_BUCKET__BUCKET_HOUR:
			case CptDatasetLoadPackage.FPO_FORECAST_BUCKET__CUSTOMER:
			case CptDatasetLoadPackage.FPO_FORECAST_BUCKET__FIRST_SORTING_IMC:
			case CptDatasetLoadPackage.FPO_FORECAST_BUCKET__INTAKE_CHANNEL:
			case CptDatasetLoadPackage.FPO_FORECAST_BUCKET__INTAKE_LOCATION:
			case CptDatasetLoadPackage.FPO_FORECAST_BUCKET__DAY_PLUS:
			case CptDatasetLoadPackage.FPO_FORECAST_BUCKET__THROUGHPUT_TYPE:
			case CptDatasetLoadPackage.FPO_FORECAST_BUCKET__MECHANIZATION_LEVEL:
			case CptDatasetLoadPackage.FPO_FORECAST_BUCKET__SORTING_LEVEL_AGG:
			case CptDatasetLoadPackage.FPO_FORECAST_BUCKET__VOLUME:
			case CptDatasetLoadPackage.FPO_FORECAST_BUCKET__PUBLICATION_ID:
			case CptDatasetLoadPackage.FPO_FORECAST_BUCKET__TIME_SERIES_ID:
			case CptDatasetLoadPackage.FPO_FORECAST_BUCKET__BUCKET_ID:
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
		return CptdatasetloadEditPlugin.INSTANCE;
	}

}
