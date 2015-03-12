/**
 * Generated with Acceleo
 */
package com.misc.projects.SortingPlans.parts.impl;

// Start of user code for imports
import com.misc.projects.SortingPlans.parts.SortingPlanEndProductPropertiesEditionPart;
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
public class SortingPlanEndProductPropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, SortingPlanEndProductPropertiesEditionPart {

	protected ReferencesTable output;
	protected List<ViewerFilter> outputBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> outputFilters = new ArrayList<ViewerFilter>();
	protected EObjectFlatComboViewer endProduct;
	protected EObjectFlatComboViewer sortingPlan;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public SortingPlanEndProductPropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence sortingPlanEndProductStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = sortingPlanEndProductStep.addStep(SortingPlansViewsRepository.SortingPlanEndProduct.Properties.class);
		propertiesStep.addStep(SortingPlansViewsRepository.SortingPlanEndProduct.Properties.output);
		propertiesStep.addStep(SortingPlansViewsRepository.SortingPlanEndProduct.Properties.endProduct);
		propertiesStep.addStep(SortingPlansViewsRepository.SortingPlanEndProduct.Properties.sortingPlan);
		
		
		composer = new PartComposer(sortingPlanEndProductStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == SortingPlansViewsRepository.SortingPlanEndProduct.Properties.class) {
					return createPropertiesGroup(parent);
				}
				if (key == SortingPlansViewsRepository.SortingPlanEndProduct.Properties.output) {
					return createOutputAdvancedReferencesTable(parent);
				}
				if (key == SortingPlansViewsRepository.SortingPlanEndProduct.Properties.endProduct) {
					return createEndProductFlatComboViewer(parent);
				}
				if (key == SortingPlansViewsRepository.SortingPlanEndProduct.Properties.sortingPlan) {
					return createSortingPlanFlatComboViewer(parent);
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
		propertiesGroup.setText(SortingPlansMessages.SortingPlanEndProductPropertiesEditionPart_PropertiesGroupLabel);
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
	protected Composite createOutputAdvancedReferencesTable(Composite parent) {
		String label = getDescription(SortingPlansViewsRepository.SortingPlanEndProduct.Properties.output, SortingPlansMessages.SortingPlanEndProductPropertiesEditionPart_OutputLabel);		 
		this.output = new ReferencesTable(label, new ReferencesTableListener() {
			public void handleAdd() { addOutput(); }
			public void handleEdit(EObject element) { editOutput(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveOutput(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromOutput(element); }
			public void navigateTo(EObject element) { }
		});
		this.output.setHelpText(propertiesEditionComponent.getHelpContent(SortingPlansViewsRepository.SortingPlanEndProduct.Properties.output, SortingPlansViewsRepository.SWT_KIND));
		this.output.createControls(parent);
		this.output.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SortingPlanEndProductPropertiesEditionPartImpl.this, SortingPlansViewsRepository.SortingPlanEndProduct.Properties.output, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData outputData = new GridData(GridData.FILL_HORIZONTAL);
		outputData.horizontalSpan = 3;
		this.output.setLayoutData(outputData);
		this.output.disableMove();
		output.setID(SortingPlansViewsRepository.SortingPlanEndProduct.Properties.output);
		output.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addOutput() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(output.getInput(), outputFilters, outputBusinessFilters,
		"Output", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SortingPlanEndProductPropertiesEditionPartImpl.this, SortingPlansViewsRepository.SortingPlanEndProduct.Properties.output,
						PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				output.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveOutput(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SortingPlanEndProductPropertiesEditionPartImpl.this, SortingPlansViewsRepository.SortingPlanEndProduct.Properties.output, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		output.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromOutput(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SortingPlanEndProductPropertiesEditionPartImpl.this, SortingPlansViewsRepository.SortingPlanEndProduct.Properties.output, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		output.refresh();
	}

	/**
	 * 
	 */
	protected void editOutput(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				output.refresh();
			}
		}
	}

	/**
	 * @param parent the parent composite
	 * 
	 */
	protected Composite createEndProductFlatComboViewer(Composite parent) {
		createDescription(parent, SortingPlansViewsRepository.SortingPlanEndProduct.Properties.endProduct, SortingPlansMessages.SortingPlanEndProductPropertiesEditionPart_EndProductLabel);
		endProduct = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(SortingPlansViewsRepository.SortingPlanEndProduct.Properties.endProduct, SortingPlansViewsRepository.SWT_KIND));
		endProduct.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		endProduct.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SortingPlanEndProductPropertiesEditionPartImpl.this, SortingPlansViewsRepository.SortingPlanEndProduct.Properties.endProduct, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getEndProduct()));
			}

		});
		GridData endProductData = new GridData(GridData.FILL_HORIZONTAL);
		endProduct.setLayoutData(endProductData);
		endProduct.setID(SortingPlansViewsRepository.SortingPlanEndProduct.Properties.endProduct);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(SortingPlansViewsRepository.SortingPlanEndProduct.Properties.endProduct, SortingPlansViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createEndProductFlatComboViewer

		// End of user code
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * 
	 */
	protected Composite createSortingPlanFlatComboViewer(Composite parent) {
		createDescription(parent, SortingPlansViewsRepository.SortingPlanEndProduct.Properties.sortingPlan, SortingPlansMessages.SortingPlanEndProductPropertiesEditionPart_SortingPlanLabel);
		sortingPlan = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(SortingPlansViewsRepository.SortingPlanEndProduct.Properties.sortingPlan, SortingPlansViewsRepository.SWT_KIND));
		sortingPlan.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		sortingPlan.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SortingPlanEndProductPropertiesEditionPartImpl.this, SortingPlansViewsRepository.SortingPlanEndProduct.Properties.sortingPlan, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getSortingPlan()));
			}

		});
		GridData sortingPlanData = new GridData(GridData.FILL_HORIZONTAL);
		sortingPlan.setLayoutData(sortingPlanData);
		sortingPlan.setID(SortingPlansViewsRepository.SortingPlanEndProduct.Properties.sortingPlan);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(SortingPlansViewsRepository.SortingPlanEndProduct.Properties.sortingPlan, SortingPlansViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createSortingPlanFlatComboViewer

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
	 * @see com.misc.projects.SortingPlans.parts.SortingPlanEndProductPropertiesEditionPart#initOutput(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initOutput(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		output.setContentProvider(contentProvider);
		output.setInput(settings);
		boolean eefElementEditorReadOnlyState = isReadOnly(SortingPlansViewsRepository.SortingPlanEndProduct.Properties.output);
		if (eefElementEditorReadOnlyState && output.getTable().isEnabled()) {
			output.setEnabled(false);
			output.setToolTipText(SortingPlansMessages.SortingPlanEndProduct_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !output.getTable().isEnabled()) {
			output.setEnabled(true);
		}
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.misc.projects.SortingPlans.parts.SortingPlanEndProductPropertiesEditionPart#updateOutput()
	 * 
	 */
	public void updateOutput() {
	output.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.misc.projects.SortingPlans.parts.SortingPlanEndProductPropertiesEditionPart#addFilterOutput(ViewerFilter filter)
	 * 
	 */
	public void addFilterToOutput(ViewerFilter filter) {
		outputFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.misc.projects.SortingPlans.parts.SortingPlanEndProductPropertiesEditionPart#addBusinessFilterOutput(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToOutput(ViewerFilter filter) {
		outputBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.misc.projects.SortingPlans.parts.SortingPlanEndProductPropertiesEditionPart#isContainedInOutputTable(EObject element)
	 * 
	 */
	public boolean isContainedInOutputTable(EObject element) {
		return ((ReferencesTableSettings)output.getInput()).contains(element);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.misc.projects.SortingPlans.parts.SortingPlanEndProductPropertiesEditionPart#getEndProduct()
	 * 
	 */
	public EObject getEndProduct() {
		if (endProduct.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) endProduct.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.misc.projects.SortingPlans.parts.SortingPlanEndProductPropertiesEditionPart#initEndProduct(EObjectFlatComboSettings)
	 */
	public void initEndProduct(EObjectFlatComboSettings settings) {
		endProduct.setInput(settings);
		if (current != null) {
			endProduct.setSelection(new StructuredSelection(settings.getValue()));
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(SortingPlansViewsRepository.SortingPlanEndProduct.Properties.endProduct);
		if (eefElementEditorReadOnlyState && endProduct.isEnabled()) {
			endProduct.setEnabled(false);
			endProduct.setToolTipText(SortingPlansMessages.SortingPlanEndProduct_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !endProduct.isEnabled()) {
			endProduct.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.misc.projects.SortingPlans.parts.SortingPlanEndProductPropertiesEditionPart#setEndProduct(EObject newValue)
	 * 
	 */
	public void setEndProduct(EObject newValue) {
		if (newValue != null) {
			endProduct.setSelection(new StructuredSelection(newValue));
		} else {
			endProduct.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(SortingPlansViewsRepository.SortingPlanEndProduct.Properties.endProduct);
		if (eefElementEditorReadOnlyState && endProduct.isEnabled()) {
			endProduct.setEnabled(false);
			endProduct.setToolTipText(SortingPlansMessages.SortingPlanEndProduct_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !endProduct.isEnabled()) {
			endProduct.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.misc.projects.SortingPlans.parts.SortingPlanEndProductPropertiesEditionPart#setEndProductButtonMode(ButtonsModeEnum newValue)
	 */
	public void setEndProductButtonMode(ButtonsModeEnum newValue) {
		endProduct.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.misc.projects.SortingPlans.parts.SortingPlanEndProductPropertiesEditionPart#addFilterEndProduct(ViewerFilter filter)
	 * 
	 */
	public void addFilterToEndProduct(ViewerFilter filter) {
		endProduct.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.misc.projects.SortingPlans.parts.SortingPlanEndProductPropertiesEditionPart#addBusinessFilterEndProduct(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToEndProduct(ViewerFilter filter) {
		endProduct.addBusinessRuleFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.misc.projects.SortingPlans.parts.SortingPlanEndProductPropertiesEditionPart#getSortingPlan()
	 * 
	 */
	public EObject getSortingPlan() {
		if (sortingPlan.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) sortingPlan.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.misc.projects.SortingPlans.parts.SortingPlanEndProductPropertiesEditionPart#initSortingPlan(EObjectFlatComboSettings)
	 */
	public void initSortingPlan(EObjectFlatComboSettings settings) {
		sortingPlan.setInput(settings);
		if (current != null) {
			sortingPlan.setSelection(new StructuredSelection(settings.getValue()));
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(SortingPlansViewsRepository.SortingPlanEndProduct.Properties.sortingPlan);
		if (eefElementEditorReadOnlyState && sortingPlan.isEnabled()) {
			sortingPlan.setEnabled(false);
			sortingPlan.setToolTipText(SortingPlansMessages.SortingPlanEndProduct_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !sortingPlan.isEnabled()) {
			sortingPlan.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.misc.projects.SortingPlans.parts.SortingPlanEndProductPropertiesEditionPart#setSortingPlan(EObject newValue)
	 * 
	 */
	public void setSortingPlan(EObject newValue) {
		if (newValue != null) {
			sortingPlan.setSelection(new StructuredSelection(newValue));
		} else {
			sortingPlan.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(SortingPlansViewsRepository.SortingPlanEndProduct.Properties.sortingPlan);
		if (eefElementEditorReadOnlyState && sortingPlan.isEnabled()) {
			sortingPlan.setEnabled(false);
			sortingPlan.setToolTipText(SortingPlansMessages.SortingPlanEndProduct_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !sortingPlan.isEnabled()) {
			sortingPlan.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.misc.projects.SortingPlans.parts.SortingPlanEndProductPropertiesEditionPart#setSortingPlanButtonMode(ButtonsModeEnum newValue)
	 */
	public void setSortingPlanButtonMode(ButtonsModeEnum newValue) {
		sortingPlan.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.misc.projects.SortingPlans.parts.SortingPlanEndProductPropertiesEditionPart#addFilterSortingPlan(ViewerFilter filter)
	 * 
	 */
	public void addFilterToSortingPlan(ViewerFilter filter) {
		sortingPlan.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.misc.projects.SortingPlans.parts.SortingPlanEndProductPropertiesEditionPart#addBusinessFilterSortingPlan(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToSortingPlan(ViewerFilter filter) {
		sortingPlan.addBusinessRuleFilter(filter);
	}






	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return SortingPlansMessages.SortingPlanEndProduct_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
