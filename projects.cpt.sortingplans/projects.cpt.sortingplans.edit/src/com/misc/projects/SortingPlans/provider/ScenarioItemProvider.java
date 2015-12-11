/**
 */
package com.misc.projects.SortingPlans.provider;


import com.misc.common.moplaf.emf.edit.command.TestCommand;
import com.misc.projects.CptDatasetLoad.SortingPlanRow;
import com.misc.projects.SortingPlans.Scenario;
import com.misc.projects.SortingPlans.cptspPackage;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import org.eclipse.emf.common.command.AbstractCommand;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CompoundCommand;
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
 * This is the item provider adapter for a {@link com.misc.projects.SortingPlans.Scenario} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ScenarioItemProvider 
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
	public ScenarioItemProvider(AdapterFactory adapterFactory) {
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

			addNamePropertyDescriptor(object);
			addRemarksPropertyDescriptor(object);
			addSortingLevelsWithDestinationPropertyDescriptor(object);
			addSelectedSortingPlansPropertyDescriptor(object);
			addSelectedEndProductsPropertyDescriptor(object);
			addPrimaryProductsSelectedPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Scenario_Name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Scenario_Name_feature", "_UI_Scenario_type"),
				 cptspPackage.Literals.SCENARIO__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Remarks feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRemarksPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Scenario_Remarks_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Scenario_Remarks_feature", "_UI_Scenario_type"),
				 cptspPackage.Literals.SCENARIO__REMARKS,
				 true,
				 true,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Sorting Levels With Destination feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSortingLevelsWithDestinationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Scenario_SortingLevelsWithDestination_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Scenario_SortingLevelsWithDestination_feature", "_UI_Scenario_type"),
				 cptspPackage.Literals.SCENARIO__SORTING_LEVELS_WITH_DESTINATION,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Selected Sorting Plans feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSelectedSortingPlansPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Scenario_SelectedSortingPlans_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Scenario_SelectedSortingPlans_feature", "_UI_Scenario_type"),
				 cptspPackage.Literals.SCENARIO__SELECTED_SORTING_PLANS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Selected End Products feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	protected void addSelectedEndProductsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
		(new ItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Scenario_SelectedEndProducts_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Scenario_SelectedEndProducts_feature", "_UI_Scenario_type"),
				 cptspPackage.Literals.SCENARIO__SELECTED_END_PRODUCTS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null){
			@Override
			public Collection<?> getChoiceOfValues(Object object) {
				Scenario scenario = (Scenario) object;
				return scenario.getEndProducts();
			}
		});
	}

	/**
	 * This adds a property descriptor for the Primary Products Selected feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	protected void addPrimaryProductsSelectedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(new ItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Scenario_PrimaryProductsSelected_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Scenario_PrimaryProductsSelected_feature", "_UI_Scenario_type"),
				 cptspPackage.Literals.SCENARIO__PRIMARY_PRODUCTS_SELECTED,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null){
					@Override
					public Collection<?> getChoiceOfValues(Object object) {
						Scenario scenario = (Scenario) object;
						return scenario.getSortingPlanProducts();
					}
			});
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
			childrenFeatures.add(cptspPackage.Literals.SCENARIO__SORTING_PLANS);
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
	 * This returns Scenario.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Scenario"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Scenario)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Scenario_type") :
			getString("_UI_Scenario_type") + " " + label;
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

		switch (notification.getFeatureID(Scenario.class)) {
			case cptspPackage.SCENARIO__END_PRODUCTS:
			case cptspPackage.SCENARIO__SORTING_PLAN_PRODUCTS:
			case cptspPackage.SCENARIO__NAME:
			case cptspPackage.SCENARIO__REMARKS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case cptspPackage.SCENARIO__SORTING_PLANS:
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
	
	
	protected List<Object> children = null;
	
	private void initChildren(){
		if ( this.children==null){
			children = new ArrayList<Object>();
			Scenario scenario = (Scenario)this.target;
			this.children.add(new ScenarioSortingPlansItemProvider(adapterFactory, scenario));
			this.children.add(new ScenarioSortingPlanProductsItemProvider(adapterFactory, scenario));
			this.children.add(new ScenarioEndProductsItemProvider(adapterFactory, scenario));
		}
	}

	/* (non-Javadoc)
	 * @see org.eclipse.emf.edit.provider.ItemProviderAdapter#getChildren(java.lang.Object)
	 */
	@Override
	public Collection<?> getChildren(Object object) {
		//Collection<Object> superchildren = (Collection<Object>) super.getChildren(object);
		this.initChildren();
		//superchildren.addAll(children);
		//return superchildren;
		return this.children;
	}
	
	public Object getSortingPlans(){
		this.initChildren();
		return this.children.get(0);
	}

	public Object getSortingPlanProducts(){
		return this.children.get(1);
	}

	public Object getEndProducts(){
		return this.children.get(2);
	}
	
	public class AddSortingPlan extends AbstractCommand {
		
		private SortingPlanRow fpdsortingplan;
		private Scenario scenario;
		
		public AddSortingPlan(Scenario aScenario, SortingPlanRow aFPDsp){
			this.scenario = aScenario;
			this.fpdsortingplan = aFPDsp;
		}

		protected boolean prepare(){
			isExecutable = true;
			return isExecutable;
		}

		public boolean canUndo() { 
			return false; 
		}

		@Override
		public void redo() {
			execute();		
		}

		@Override
		public void execute() {
			this.scenario.getSelectedSortingPlans().add(fpdsortingplan);
		}

	} // class addSortingPlan command

	
	
	/* (non-Javadoc)
	 * @see org.eclipse.emf.edit.provider.ItemProviderAdapter#createDragAndDropCommand(org.eclipse.emf.edit.domain.EditingDomain, java.lang.Object, float, int, int, java.util.Collection)
	 */
	@Override
	protected Command createDragAndDropCommand(EditingDomain domain,
												Object owner, 
												float location, 
												int operations, 
												int operation,
												Collection<?> collection) {
		List<Object> otherDroppedThings = new LinkedList<Object>();
		CompoundCommand command = new CompoundCommand();
		Scenario thisscenario = (Scenario) owner;
		for (Object element : collection){
			if ( element instanceof SortingPlanRow){
				command.append(new AddSortingPlan(thisscenario, (SortingPlanRow)element));
			}
			else {
			otherDroppedThings.add(element);
			}
		}
		if ( otherDroppedThings.size()>0){
			command.append(super.createDragAndDropCommand(domain, 
					                                    owner, 
					                                    location, 
					                                    operations,
				                                      	operation, 
				                                      	otherDroppedThings));
		}
		return command;
	} // method createDragAndDropCommand

	public class ScenarioTestCommand extends TestCommand{
		private Scenario scenario;
		
		// constructor
		public ScenarioTestCommand(Scenario aScenario)	{
			super();
			this.scenario = aScenario;
			String tmp = "Test the scenario";
			String label = "label:"+tmp;
			String description = "desc:"+tmp;
			this.setDescription(description);
			this.setLabel(label);
		}

		@Override
		public void execute() {
			this.scenario.test();
		}
	} // class DataSourceConnectCommand

	@Override
	public Command createCommand(Object object, EditingDomain domain,
			Class<? extends Command> commandClass,
			CommandParameter commandParameter) {
		Scenario scenario = (Scenario)object;
		
		if ( commandClass == TestCommand.class){
			return new ScenarioTestCommand(scenario); 
		}

		return super.createCommand(object, domain, commandClass, commandParameter);
	} //method createCommand

}
