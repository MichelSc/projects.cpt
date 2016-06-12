/**
 */
package com.misc.projects.CptDatasetLoad.provider;


import com.misc.projects.CptDatasetLoad.CptDatasetLoadFactory;
import com.misc.projects.CptDatasetLoad.CptDatasetLoadPackage;
import com.misc.projects.CptDatasetLoad.FPDSortingPlansSet;
import java.util.Collection;
import java.util.List;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link com.misc.projects.CptDatasetLoad.FPDSortingPlansSet} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class FPDSortingPlansSetItemProvider extends FPDTableGroupItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FPDSortingPlansSetItemProvider(AdapterFactory adapterFactory) {
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

			addFromDatePropertyDescriptor(object);
			addToDatePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the From Date feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFromDatePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FPDSortingPlansSet_FromDate_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FPDSortingPlansSet_FromDate_feature", "_UI_FPDSortingPlansSet_type"),
				 CptDatasetLoadPackage.Literals.FPD_SORTING_PLANS_SET__FROM_DATE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the To Date feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addToDatePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FPDSortingPlansSet_ToDate_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FPDSortingPlansSet_ToDate_feature", "_UI_FPDSortingPlansSet_type"),
				 CptDatasetLoadPackage.Literals.FPD_SORTING_PLANS_SET__TO_DATE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
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
			childrenFeatures.add(CptDatasetLoadPackage.Literals.FPD_SORTING_PLANS_SET__SORTING_PLANS_TABLE);
			childrenFeatures.add(CptDatasetLoadPackage.Literals.FPD_SORTING_PLANS_SET__SORTING_PLAN_OUTPUTS_TABLE);
			childrenFeatures.add(CptDatasetLoadPackage.Literals.FPD_SORTING_PLANS_SET__SORTING_PLAN_INPUTS_TABLE);
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
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((FPDSortingPlansSet)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_FPDSortingPlansSet_type") :
			getString("_UI_FPDSortingPlansSet_type") + " " + label;
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

		switch (notification.getFeatureID(FPDSortingPlansSet.class)) {
			case CptDatasetLoadPackage.FPD_SORTING_PLANS_SET__FROM_DATE:
			case CptDatasetLoadPackage.FPD_SORTING_PLANS_SET__TO_DATE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case CptDatasetLoadPackage.FPD_SORTING_PLANS_SET__SORTING_PLANS_TABLE:
			case CptDatasetLoadPackage.FPD_SORTING_PLANS_SET__SORTING_PLAN_OUTPUTS_TABLE:
			case CptDatasetLoadPackage.FPD_SORTING_PLANS_SET__SORTING_PLAN_INPUTS_TABLE:
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

		newChildDescriptors.add
			(createChildParameter
				(CptDatasetLoadPackage.Literals.FPD_SORTING_PLANS_SET__SORTING_PLANS_TABLE,
				 CptDatasetLoadFactory.eINSTANCE.createSortingPlansTable()));

		newChildDescriptors.add
			(createChildParameter
				(CptDatasetLoadPackage.Literals.FPD_SORTING_PLANS_SET__SORTING_PLAN_OUTPUTS_TABLE,
				 CptDatasetLoadFactory.eINSTANCE.createSortingPlanOutputTable()));

		newChildDescriptors.add
			(createChildParameter
				(CptDatasetLoadPackage.Literals.FPD_SORTING_PLANS_SET__SORTING_PLAN_INPUTS_TABLE,
				 CptDatasetLoadFactory.eINSTANCE.createSortingPlanInputTable()));
	}

}
