/**
 * Generated with Acceleo
 */
package com.misc.projects.SortingPlans.parts.impl;

// Start of user code for imports
import com.misc.projects.SortingPlans.parts.SortingPlanPropertiesEditionPart;
import com.misc.projects.SortingPlans.parts.SortingPlansViewsRepository;

import com.misc.projects.SortingPlans.providers.SortingPlansMessages;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;

import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;

import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;

import org.eclipse.emf.eef.runtime.api.parts.ISWTPropertiesEditionPart;

import org.eclipse.emf.eef.runtime.context.impl.EObjectPropertiesEditionContext;

import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;

import org.eclipse.emf.eef.runtime.impl.parts.CompositePropertiesEditionPart;

import org.eclipse.emf.eef.runtime.policies.PropertiesEditingPolicy;

import org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider;

import org.eclipse.emf.eef.runtime.ui.parts.PartComposer;

import org.eclipse.emf.eef.runtime.ui.parts.sequence.BindingCompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionStep;

import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;
import org.eclipse.emf.eef.runtime.ui.widgets.EObjectFlatComboViewer;
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable;

import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable.ReferencesTableListener;

import org.eclipse.emf.eef.runtime.ui.widgets.SWTUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.TabElementTreeSelectionDialog;

import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;

import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableContentProvider;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;

import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.ViewerFilter;

import org.eclipse.swt.SWT;

import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;

import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;

// End of user code

/**
 * 
 * 
 */
public class SortingPlanPropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, SortingPlanPropertiesEditionPart {

	protected ReferencesTable endProducts;
	protected List<ViewerFilter> endProductsBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> endProductsFilters = new ArrayList<ViewerFilter>();
	protected EObjectFlatComboViewer fPDSortingPlan;
	protected EObjectFlatComboViewer scenario;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public SortingPlanPropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
		super(editionComponent);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.parts.ISWTPropertiesEditionPart#
	 * 			createFigure(org.eclipse.swt.widgets.Composite)
	 * 
	 */
	public Composite createFigure(final Composite parent) {
		view = new Composite(parent, SWT.NONE);
		GridLayout layout = new GridLayout();
		layout.numColumns = 3;
		view.setLayout(layout);
		createControls(view);
		return view;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.parts.ISWTPropertiesEditionPart#
	 * 			createControls(org.eclipse.swt.widgets.Composite)
	 * 
	 */
	public void createControls(Composite view) { 
		CompositionSequence sortingPlanStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = sortingPlanStep.addStep(SortingPlansViewsRepository.SortingPlan.Properties.class);
		propertiesStep.addStep(SortingPlansViewsRepository.SortingPlan.Properties.endProducts);
		propertiesStep.addStep(SortingPlansViewsRepository.SortingPlan.Properties.fPDSortingPlan);
		propertiesStep.addStep(SortingPlansViewsRepository.SortingPlan.Properties.scenario);
		
		
		composer = new PartComposer(sortingPlanStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == SortingPlansViewsRepository.SortingPlan.Properties.class) {
					return createPropertiesGroup(parent);
				}
				if (key == SortingPlansViewsRepository.SortingPlan.Properties.endProducts) {
					return createEndProductsAdvancedReferencesTable(parent);
				}
				if (key == SortingPlansViewsRepository.SortingPlan.Properties.fPDSortingPlan) {
					return createFPDSortingPlanFlatComboViewer(parent);
				}
				if (key == SortingPlansViewsRepository.SortingPlan.Properties.scenario) {
					return createScenarioFlatComboViewer(parent);
				}
				return parent;
			}
		};
		composer.compose(view);
	}

	/**
	 * 
	 */
	protected Composite createPropertiesGroup(Composite parent) {
		Group propertiesGroup = new Group(parent, SWT.NONE);
		propertiesGroup.setText(SortingPlansMessages.SortingPlanPropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesGroupData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesGroupData.horizontalSpan = 3;
		propertiesGroup.setLayoutData(propertiesGroupData);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		return propertiesGroup;
	}

	/**
	 * 
	 */
	protected Composite createEndProductsAdvancedReferencesTable(Composite parent) {
		String label = getDescription(SortingPlansViewsRepository.SortingPlan.Properties.endProducts, SortingPlansMessages.SortingPlanPropertiesEditionPart_EndProductsLabel);		 
		this.endProducts = new ReferencesTable(label, new ReferencesTableListener() {
			public void handleAdd() { addEndProducts(); }
			public void handleEdit(EObject element) { editEndProducts(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveEndProducts(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromEndProducts(element); }
			public void navigateTo(EObject element) { }
		});
		this.endProducts.setHelpText(propertiesEditionComponent.getHelpContent(SortingPlansViewsRepository.SortingPlan.Properties.endProducts, SortingPlansViewsRepository.SWT_KIND));
		this.endProducts.createControls(parent);
		this.endProducts.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SortingPlanPropertiesEditionPartImpl.this, SortingPlansViewsRepository.SortingPlan.Properties.endProducts, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData endProductsData = new GridData(GridData.FILL_HORIZONTAL);
		endProductsData.horizontalSpan = 3;
		this.endProducts.setLayoutData(endProductsData);
		this.endProducts.disableMove();
		endProducts.setID(SortingPlansViewsRepository.SortingPlan.Properties.endProducts);
		endProducts.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addEndProducts() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(endProducts.getInput(), endProductsFilters, endProductsBusinessFilters,
		"EndProducts", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SortingPlanPropertiesEditionPartImpl.this, SortingPlansViewsRepository.SortingPlan.Properties.endProducts,
						PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				endProducts.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveEndProducts(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SortingPlanPropertiesEditionPartImpl.this, SortingPlansViewsRepository.SortingPlan.Properties.endProducts, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		endProducts.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromEndProducts(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SortingPlanPropertiesEditionPartImpl.this, SortingPlansViewsRepository.SortingPlan.Properties.endProducts, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		endProducts.refresh();
	}

	/**
	 * 
	 */
	protected void editEndProducts(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				endProducts.refresh();
			}
		}
	}

	/**
	 * @param parent the parent composite
	 * 
	 */
	protected Composite createFPDSortingPlanFlatComboViewer(Composite parent) {
		createDescription(parent, SortingPlansViewsRepository.SortingPlan.Properties.fPDSortingPlan, SortingPlansMessages.SortingPlanPropertiesEditionPart_FPDSortingPlanLabel);
		fPDSortingPlan = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(SortingPlansViewsRepository.SortingPlan.Properties.fPDSortingPlan, SortingPlansViewsRepository.SWT_KIND));
		fPDSortingPlan.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		fPDSortingPlan.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SortingPlanPropertiesEditionPartImpl.this, SortingPlansViewsRepository.SortingPlan.Properties.fPDSortingPlan, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getFPDSortingPlan()));
			}

		});
		GridData fPDSortingPlanData = new GridData(GridData.FILL_HORIZONTAL);
		fPDSortingPlan.setLayoutData(fPDSortingPlanData);
		fPDSortingPlan.setID(SortingPlansViewsRepository.SortingPlan.Properties.fPDSortingPlan);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(SortingPlansViewsRepository.SortingPlan.Properties.fPDSortingPlan, SortingPlansViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createFPDSortingPlanFlatComboViewer

		// End of user code
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * 
	 */
	protected Composite createScenarioFlatComboViewer(Composite parent) {
		createDescription(parent, SortingPlansViewsRepository.SortingPlan.Properties.scenario, SortingPlansMessages.SortingPlanPropertiesEditionPart_ScenarioLabel);
		scenario = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(SortingPlansViewsRepository.SortingPlan.Properties.scenario, SortingPlansViewsRepository.SWT_KIND));
		scenario.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		scenario.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SortingPlanPropertiesEditionPartImpl.this, SortingPlansViewsRepository.SortingPlan.Properties.scenario, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getScenario()));
			}

		});
		GridData scenarioData = new GridData(GridData.FILL_HORIZONTAL);
		scenario.setLayoutData(scenarioData);
		scenario.setID(SortingPlansViewsRepository.SortingPlan.Properties.scenario);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(SortingPlansViewsRepository.SortingPlan.Properties.scenario, SortingPlansViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createScenarioFlatComboViewer

		// End of user code
		return parent;
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionListener#firePropertiesChanged(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void firePropertiesChanged(IPropertiesEditionEvent event) {
		// Start of user code for tab synchronization
		
		// End of user code
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see com.misc.projects.SortingPlans.parts.SortingPlanPropertiesEditionPart#initEndProducts(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initEndProducts(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		endProducts.setContentProvider(contentProvider);
		endProducts.setInput(settings);
		boolean eefElementEditorReadOnlyState = isReadOnly(SortingPlansViewsRepository.SortingPlan.Properties.endProducts);
		if (eefElementEditorReadOnlyState && endProducts.getTable().isEnabled()) {
			endProducts.setEnabled(false);
			endProducts.setToolTipText(SortingPlansMessages.SortingPlan_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !endProducts.getTable().isEnabled()) {
			endProducts.setEnabled(true);
		}
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.misc.projects.SortingPlans.parts.SortingPlanPropertiesEditionPart#updateEndProducts()
	 * 
	 */
	public void updateEndProducts() {
	endProducts.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.misc.projects.SortingPlans.parts.SortingPlanPropertiesEditionPart#addFilterEndProducts(ViewerFilter filter)
	 * 
	 */
	public void addFilterToEndProducts(ViewerFilter filter) {
		endProductsFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.misc.projects.SortingPlans.parts.SortingPlanPropertiesEditionPart#addBusinessFilterEndProducts(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToEndProducts(ViewerFilter filter) {
		endProductsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.misc.projects.SortingPlans.parts.SortingPlanPropertiesEditionPart#isContainedInEndProductsTable(EObject element)
	 * 
	 */
	public boolean isContainedInEndProductsTable(EObject element) {
		return ((ReferencesTableSettings)endProducts.getInput()).contains(element);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.misc.projects.SortingPlans.parts.SortingPlanPropertiesEditionPart#getFPDSortingPlan()
	 * 
	 */
	public EObject getFPDSortingPlan() {
		if (fPDSortingPlan.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) fPDSortingPlan.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.misc.projects.SortingPlans.parts.SortingPlanPropertiesEditionPart#initFPDSortingPlan(EObjectFlatComboSettings)
	 */
	public void initFPDSortingPlan(EObjectFlatComboSettings settings) {
		fPDSortingPlan.setInput(settings);
		if (current != null) {
			fPDSortingPlan.setSelection(new StructuredSelection(settings.getValue()));
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(SortingPlansViewsRepository.SortingPlan.Properties.fPDSortingPlan);
		if (eefElementEditorReadOnlyState && fPDSortingPlan.isEnabled()) {
			fPDSortingPlan.setEnabled(false);
			fPDSortingPlan.setToolTipText(SortingPlansMessages.SortingPlan_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !fPDSortingPlan.isEnabled()) {
			fPDSortingPlan.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.misc.projects.SortingPlans.parts.SortingPlanPropertiesEditionPart#setFPDSortingPlan(EObject newValue)
	 * 
	 */
	public void setFPDSortingPlan(EObject newValue) {
		if (newValue != null) {
			fPDSortingPlan.setSelection(new StructuredSelection(newValue));
		} else {
			fPDSortingPlan.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(SortingPlansViewsRepository.SortingPlan.Properties.fPDSortingPlan);
		if (eefElementEditorReadOnlyState && fPDSortingPlan.isEnabled()) {
			fPDSortingPlan.setEnabled(false);
			fPDSortingPlan.setToolTipText(SortingPlansMessages.SortingPlan_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !fPDSortingPlan.isEnabled()) {
			fPDSortingPlan.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.misc.projects.SortingPlans.parts.SortingPlanPropertiesEditionPart#setFPDSortingPlanButtonMode(ButtonsModeEnum newValue)
	 */
	public void setFPDSortingPlanButtonMode(ButtonsModeEnum newValue) {
		fPDSortingPlan.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.misc.projects.SortingPlans.parts.SortingPlanPropertiesEditionPart#addFilterFPDSortingPlan(ViewerFilter filter)
	 * 
	 */
	public void addFilterToFPDSortingPlan(ViewerFilter filter) {
		fPDSortingPlan.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.misc.projects.SortingPlans.parts.SortingPlanPropertiesEditionPart#addBusinessFilterFPDSortingPlan(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToFPDSortingPlan(ViewerFilter filter) {
		fPDSortingPlan.addBusinessRuleFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.misc.projects.SortingPlans.parts.SortingPlanPropertiesEditionPart#getScenario()
	 * 
	 */
	public EObject getScenario() {
		if (scenario.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) scenario.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.misc.projects.SortingPlans.parts.SortingPlanPropertiesEditionPart#initScenario(EObjectFlatComboSettings)
	 */
	public void initScenario(EObjectFlatComboSettings settings) {
		scenario.setInput(settings);
		if (current != null) {
			scenario.setSelection(new StructuredSelection(settings.getValue()));
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(SortingPlansViewsRepository.SortingPlan.Properties.scenario);
		if (eefElementEditorReadOnlyState && scenario.isEnabled()) {
			scenario.setEnabled(false);
			scenario.setToolTipText(SortingPlansMessages.SortingPlan_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !scenario.isEnabled()) {
			scenario.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.misc.projects.SortingPlans.parts.SortingPlanPropertiesEditionPart#setScenario(EObject newValue)
	 * 
	 */
	public void setScenario(EObject newValue) {
		if (newValue != null) {
			scenario.setSelection(new StructuredSelection(newValue));
		} else {
			scenario.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(SortingPlansViewsRepository.SortingPlan.Properties.scenario);
		if (eefElementEditorReadOnlyState && scenario.isEnabled()) {
			scenario.setEnabled(false);
			scenario.setToolTipText(SortingPlansMessages.SortingPlan_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !scenario.isEnabled()) {
			scenario.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.misc.projects.SortingPlans.parts.SortingPlanPropertiesEditionPart#setScenarioButtonMode(ButtonsModeEnum newValue)
	 */
	public void setScenarioButtonMode(ButtonsModeEnum newValue) {
		scenario.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.misc.projects.SortingPlans.parts.SortingPlanPropertiesEditionPart#addFilterScenario(ViewerFilter filter)
	 * 
	 */
	public void addFilterToScenario(ViewerFilter filter) {
		scenario.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.misc.projects.SortingPlans.parts.SortingPlanPropertiesEditionPart#addBusinessFilterScenario(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToScenario(ViewerFilter filter) {
		scenario.addBusinessRuleFilter(filter);
	}






	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return SortingPlansMessages.SortingPlan_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
