/**
 */
package com.misc.projects.Forecast.provider;


import com.misc.projects.Forecast.FPOForecastBucketsSelection;
import com.misc.projects.Forecast.ForecastPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.command.CommandParameter;
import org.eclipse.emf.edit.domain.EditingDomain;
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
 * This is the item provider adapter for a {@link com.misc.projects.Forecast.FPOForecastBucketsSelection} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class FPOForecastBucketsSelectionItemProvider 
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
	public FPOForecastBucketsSelectionItemProvider(AdapterFactory adapterFactory) {
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

			addUploadPropertyDescriptor(object);
			addSelectBucketDatesPropertyDescriptor(object);
			addSelectThroughputTypesPropertyDescriptor(object);
			addSelectMechanizationLevelPropertyDescriptor(object);
			addSelectSortingLevelAGGsPropertyDescriptor(object);
			addSelectFirstSortingIMCsPropertyDescriptor(object);
			addSelectionSizePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Upload feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUploadPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FPOForecastBucketsSelection_Upload_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FPOForecastBucketsSelection_Upload_feature", "_UI_FPOForecastBucketsSelection_type"),
				 ForecastPackage.Literals.FPO_FORECAST_BUCKETS_SELECTION__UPLOAD,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Select Bucket Dates feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSelectBucketDatesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FPOForecastBucketsSelection_SelectBucketDates_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FPOForecastBucketsSelection_SelectBucketDates_feature", "_UI_FPOForecastBucketsSelection_type"),
				 ForecastPackage.Literals.FPO_FORECAST_BUCKETS_SELECTION__SELECT_BUCKET_DATES,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Select Throughput Types feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSelectThroughputTypesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FPOForecastBucketsSelection_SelectThroughputTypes_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FPOForecastBucketsSelection_SelectThroughputTypes_feature", "_UI_FPOForecastBucketsSelection_type"),
				 ForecastPackage.Literals.FPO_FORECAST_BUCKETS_SELECTION__SELECT_THROUGHPUT_TYPES,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Select Mechanization Level feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSelectMechanizationLevelPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FPOForecastBucketsSelection_SelectMechanizationLevel_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FPOForecastBucketsSelection_SelectMechanizationLevel_feature", "_UI_FPOForecastBucketsSelection_type"),
				 ForecastPackage.Literals.FPO_FORECAST_BUCKETS_SELECTION__SELECT_MECHANIZATION_LEVEL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Select Sorting Level AG Gs feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSelectSortingLevelAGGsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FPOForecastBucketsSelection_SelectSortingLevelAGGs_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FPOForecastBucketsSelection_SelectSortingLevelAGGs_feature", "_UI_FPOForecastBucketsSelection_type"),
				 ForecastPackage.Literals.FPO_FORECAST_BUCKETS_SELECTION__SELECT_SORTING_LEVEL_AG_GS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Select First Sorting IM Cs feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSelectFirstSortingIMCsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FPOForecastBucketsSelection_SelectFirstSortingIMCs_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FPOForecastBucketsSelection_SelectFirstSortingIMCs_feature", "_UI_FPOForecastBucketsSelection_type"),
				 ForecastPackage.Literals.FPO_FORECAST_BUCKETS_SELECTION__SELECT_FIRST_SORTING_IM_CS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Selection Size feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSelectionSizePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FPOForecastBucketsSelection_SelectionSize_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FPOForecastBucketsSelection_SelectionSize_feature", "_UI_FPOForecastBucketsSelection_type"),
				 ForecastPackage.Literals.FPO_FORECAST_BUCKETS_SELECTION__SELECTION_SIZE,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
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
			childrenFeatures.add(ForecastPackage.Literals.FPO_FORECAST_BUCKETS_SELECTION__SELECTED_BUCKETS);
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
	 * This returns FPOForecastBucketsSelection.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/FPOForecastBucketsSelection"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		FPOForecastBucketsSelection fpoForecastBucketsSelection = (FPOForecastBucketsSelection)object;
		return getString("_UI_FPOForecastBucketsSelection_type") + " " + fpoForecastBucketsSelection.getSelectionSize();
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

		switch (notification.getFeatureID(FPOForecastBucketsSelection.class)) {
			case ForecastPackage.FPO_FORECAST_BUCKETS_SELECTION__SELECT_BUCKET_DATES:
			case ForecastPackage.FPO_FORECAST_BUCKETS_SELECTION__SELECT_THROUGHPUT_TYPES:
			case ForecastPackage.FPO_FORECAST_BUCKETS_SELECTION__SELECT_MECHANIZATION_LEVEL:
			case ForecastPackage.FPO_FORECAST_BUCKETS_SELECTION__SELECT_SORTING_LEVEL_AG_GS:
			case ForecastPackage.FPO_FORECAST_BUCKETS_SELECTION__SELECT_FIRST_SORTING_IM_CS:
			case ForecastPackage.FPO_FORECAST_BUCKETS_SELECTION__SELECTION_SIZE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case ForecastPackage.FPO_FORECAST_BUCKETS_SELECTION__SELECTED_BUCKETS:
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
		return ForecastEditPlugin.INSTANCE;
	}

	public class SelectionRefreshCommand extends RefreshCommand{
		private FPOForecastBucketsSelection selection;
		
		// constructor
		public SelectionRefreshCommand(FPOForecastBucketsSelection aSelection)	{
			super();
			this.selection = aSelection;
			String tmp = "Refresh the selection";
			String label = "label:"+tmp;
			String description = "desc:"+tmp;
			this.setDescription(description);
			this.setLabel(label);
		}

		@Override
		public void execute() {
			this.selection.refreshSelectedBuckets();
		}
	} // class SelectionRefreshCommand

	public class SelectionSortCommand extends SortCommand{
		private FPOForecastBucketsSelection selection;
		
		// constructor
		public SelectionSortCommand(FPOForecastBucketsSelection aSelection)	{
			super();
			this.selection = aSelection;
			String tmp = "Sort the selection";
			String label = "label:"+tmp;
			String description = "desc:"+tmp;
			this.setDescription(description);
			this.setLabel(label);
		}

		@Override
		public void execute() {
			this.selection.sortSelectedBuckets();
		}
	} // class SelectionSortCommand

	@Override
	public Command createCommand(Object object, EditingDomain domain,
			Class<? extends Command> commandClass,
			CommandParameter commandParameter) {
		if ( commandClass == RefreshCommand.class){
			return new SelectionRefreshCommand((FPOForecastBucketsSelection) object); 
		} else if ( commandClass == SortCommand.class){
			return new SelectionSortCommand((FPOForecastBucketsSelection) object);
		}

		return super.createCommand(object, domain, commandClass, commandParameter);
	} //method createCommand

}
