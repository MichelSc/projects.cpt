/**
 */
package com.misc.projects.Forecast.provider;


import com.misc.projects.Forecast.ForecastMappingElement;
import com.misc.projects.Forecast.ForecastPackage;

import java.math.BigDecimal;

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
 * This is the item provider adapter for a {@link com.misc.projects.Forecast.ForecastMappingElement} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ForecastMappingElementItemProvider 
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
	public ForecastMappingElementItemProvider(AdapterFactory adapterFactory) {
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

			addFromCustomerPropertyDescriptor(object);
			addFromFirstSortingImcPropertyDescriptor(object);
			addFromIntakeLocationPropertyDescriptor(object);
			addFromSortingLevelAGGPropertyDescriptor(object);
			addToSortingImcPropertyDescriptor(object);
			addToSortingLevelAVCSPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the From Customer feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFromCustomerPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ForecastMappingElement_FromCustomer_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ForecastMappingElement_FromCustomer_feature", "_UI_ForecastMappingElement_type"),
				 ForecastPackage.Literals.FORECAST_MAPPING_ELEMENT__FROM_CUSTOMER,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI__1fromPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the From First Sorting Imc feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFromFirstSortingImcPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ForecastMappingElement_FromFirstSortingImc_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ForecastMappingElement_FromFirstSortingImc_feature", "_UI_ForecastMappingElement_type"),
				 ForecastPackage.Literals.FORECAST_MAPPING_ELEMENT__FROM_FIRST_SORTING_IMC,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI__1fromPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the From Intake Location feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFromIntakeLocationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ForecastMappingElement_FromIntakeLocation_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ForecastMappingElement_FromIntakeLocation_feature", "_UI_ForecastMappingElement_type"),
				 ForecastPackage.Literals.FORECAST_MAPPING_ELEMENT__FROM_INTAKE_LOCATION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI__1fromPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the From Sorting Level AGG feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFromSortingLevelAGGPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ForecastMappingElement_FromSortingLevelAGG_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ForecastMappingElement_FromSortingLevelAGG_feature", "_UI_ForecastMappingElement_type"),
				 ForecastPackage.Literals.FORECAST_MAPPING_ELEMENT__FROM_SORTING_LEVEL_AGG,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI__1fromPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the To Sorting Imc feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addToSortingImcPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ForecastMappingElement_ToSortingImc_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ForecastMappingElement_ToSortingImc_feature", "_UI_ForecastMappingElement_type"),
				 ForecastPackage.Literals.FORECAST_MAPPING_ELEMENT__TO_SORTING_IMC,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI__2toPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the To Sorting Level AVCS feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addToSortingLevelAVCSPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ForecastMappingElement_ToSortingLevelAVCS_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ForecastMappingElement_ToSortingLevelAVCS_feature", "_UI_ForecastMappingElement_type"),
				 ForecastPackage.Literals.FORECAST_MAPPING_ELEMENT__TO_SORTING_LEVEL_AVCS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI__2toPropertyCategory"),
				 null));
	}

	/**
	 * This returns ForecastMappingElement.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ForecastMappingElement"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		BigDecimal labelValue = ((ForecastMappingElement)object).getFromCustomer();
		String label = labelValue == null ? null : labelValue.toString();
		return label == null || label.length() == 0 ?
			getString("_UI_ForecastMappingElement_type") :
			getString("_UI_ForecastMappingElement_type") + " " + label;
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

		switch (notification.getFeatureID(ForecastMappingElement.class)) {
			case ForecastPackage.FORECAST_MAPPING_ELEMENT__FROM_CUSTOMER:
			case ForecastPackage.FORECAST_MAPPING_ELEMENT__FROM_FIRST_SORTING_IMC:
			case ForecastPackage.FORECAST_MAPPING_ELEMENT__FROM_INTAKE_LOCATION:
			case ForecastPackage.FORECAST_MAPPING_ELEMENT__FROM_SORTING_LEVEL_AGG:
			case ForecastPackage.FORECAST_MAPPING_ELEMENT__TO_SORTING_IMC:
			case ForecastPackage.FORECAST_MAPPING_ELEMENT__TO_SORTING_LEVEL_AVCS:
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
		return ForecastEditPlugin.INSTANCE;
	}

}
