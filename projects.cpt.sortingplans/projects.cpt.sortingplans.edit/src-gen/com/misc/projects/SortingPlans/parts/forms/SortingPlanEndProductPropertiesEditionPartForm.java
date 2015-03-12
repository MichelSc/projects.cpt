/**
 * Generated with Acceleo
 */
package com.misc.projects.SortingPlans.parts.forms;

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

import org.eclipse.emf.eef.runtime.api.parts.IFormPropertiesEditionPart;

import org.eclipse.emf.eef.runtime.context.impl.EObjectPropertiesEditionContext;

import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;

import org.eclipse.emf.eef.runtime.part.impl.SectionPropertiesEditingPart;

import org.eclipse.emf.eef.runtime.policies.PropertiesEditingPolicy;

import org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider;

import org.eclipse.emf.eef.runtime.ui.parts.PartComposer;

import org.eclipse.emf.eef.runtime.ui.parts.sequence.BindingCompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionStep;

import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;
import org.eclipse.emf.eef.runtime.ui.widgets.EObjectFlatComboViewer;
import org.eclipse.emf.eef.runtime.ui.widgets.FormUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable;

import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable.ReferencesTableListener;

import org.eclipse.emf.eef.runtime.ui.widgets.TabElementTreeSelectionDialog;

import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;

import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableContentProvider;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;

import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.ViewerFilter;

import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;

import org.eclipse.swt.widgets.Composite;

import org.eclipse.ui.forms.widgets.Form;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;
import org.eclipse.ui.forms.widgets.Section;

// End of user code

/**
 * 
 * 
 */
public class SortingPlanEndProductPropertiesEditionPartForm extends SectionPropertiesEditingPart implements IFormPropertiesEditionPart, SortingPlanEndProductPropertiesEditionPart {

	protected ReferencesTable output;
	protected List<ViewerFilter> outputBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> outputFilters = new ArrayList<ViewerFilter>();
	protected EObjectFlatComboViewer endProduct;
	protected EObjectFlatComboViewer sortingPlan;



	/**
	 * For {@link ISection} use only.
	 */
	public SortingPlanEndProductPropertiesEditionPartForm() { super(); }

	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public SortingPlanEndProductPropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
		super(editionComponent);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.parts.IFormPropertiesEditionPart#
	 *  createFigure(org.eclipse.swt.widgets.Composite, org.eclipse.ui.forms.widgets.FormToolkit)
	 * 
	 */
	public Composite createFigure(final Composite parent, final FormToolkit widgetFactory) {
		ScrolledForm scrolledForm = widgetFactory.createScrolledForm(parent);
		Form form = scrolledForm.getForm();
		view = form.getBody();
		GridLayout layout = new GridLayout();
		layout.numColumns = 3;
		view.setLayout(layout);
		createControls(widgetFactory, view);
		return scrolledForm;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.parts.IFormPropertiesEditionPart#
	 *  createControls(org.eclipse.ui.forms.widgets.FormToolkit, org.eclipse.swt.widgets.Composite)
	 * 
	 */
	public void createControls(final FormToolkit widgetFactory, Composite view) {
		CompositionSequence sortingPlanEndProductStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = sortingPlanEndProductStep.addStep(SortingPlansViewsRepository.SortingPlanEndProduct.Properties.class);
		propertiesStep.addStep(SortingPlansViewsRepository.SortingPlanEndProduct.Properties.output);
		propertiesStep.addStep(SortingPlansViewsRepository.SortingPlanEndProduct.Properties.endProduct);
		propertiesStep.addStep(SortingPlansViewsRepository.SortingPlanEndProduct.Properties.sortingPlan);
		
		
		composer = new PartComposer(sortingPlanEndProductStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == SortingPlansViewsRepository.SortingPlanEndProduct.Properties.class) {
					return createPropertiesGroup(widgetFactory, parent);
				}
				if (key == SortingPlansViewsRepository.SortingPlanEndProduct.Properties.output) {
					return createOutputReferencesTable(widgetFactory, parent);
				}
				if (key == SortingPlansViewsRepository.SortingPlanEndProduct.Properties.endProduct) {
					return createEndProductFlatComboViewer(parent, widgetFactory);
				}
				if (key == SortingPlansViewsRepository.SortingPlanEndProduct.Properties.sortingPlan) {
					return createSortingPlanFlatComboViewer(parent, widgetFactory);
				}
				return parent;
			}
		};
		composer.compose(view);
	}
	/**
	 * 
	 */
	protected Composite createPropertiesGroup(FormToolkit widgetFactory, final Composite parent) {
		Section propertiesSection = widgetFactory.createSection(parent, Section.TITLE_BAR | Section.TWISTIE | Section.EXPANDED);
		propertiesSection.setText(SortingPlansMessages.SortingPlanEndProductPropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesSectionData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesSectionData.horizontalSpan = 3;
		propertiesSection.setLayoutData(propertiesSectionData);
		Composite propertiesGroup = widgetFactory.createComposite(propertiesSection);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		propertiesSection.setClient(propertiesGroup);
		return propertiesGroup;
	}

	/**
	 * 
	 */
	protected Composite createOutputReferencesTable(FormToolkit widgetFactory, Composite parent) {
		this.output = new ReferencesTable(getDescription(SortingPlansViewsRepository.SortingPlanEndProduct.Properties.output, SortingPlansMessages.SortingPlanEndProductPropertiesEditionPart_OutputLabel), new ReferencesTableListener	() {
			public void handleAdd() { addOutput(); }
			public void handleEdit(EObject element) { editOutput(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveOutput(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromOutput(element); }
			public void navigateTo(EObject element) { }
		});
		this.output.setHelpText(propertiesEditionComponent.getHelpContent(SortingPlansViewsRepository.SortingPlanEndProduct.Properties.output, SortingPlansViewsRepository.FORM_KIND));
		this.output.createControls(parent, widgetFactory);
		this.output.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SortingPlanEndProductPropertiesEditionPartForm.this, SortingPlansViewsRepository.SortingPlanEndProduct.Properties.output, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData outputData = new GridData(GridData.FILL_HORIZONTAL);
		outputData.horizontalSpan = 3;
		this.output.setLayoutData(outputData);
		this.output.disableMove();
		output.setID(SortingPlansViewsRepository.SortingPlanEndProduct.Properties.output);
		output.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		// Start of user code for createOutputReferencesTable

		// End of user code
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SortingPlanEndProductPropertiesEditionPartForm.this, SortingPlansViewsRepository.SortingPlanEndProduct.Properties.output,
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
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SortingPlanEndProductPropertiesEditionPartForm.this, SortingPlansViewsRepository.SortingPlanEndProduct.Properties.output, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		output.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromOutput(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SortingPlanEndProductPropertiesEditionPartForm.this, SortingPlansViewsRepository.SortingPlanEndProduct.Properties.output, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
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
	 * @param widgetFactory factory to use to instanciante widget of the form
	 * 
	 */
	protected Composite createEndProductFlatComboViewer(Composite parent, FormToolkit widgetFactory) {
		createDescription(parent, SortingPlansViewsRepository.SortingPlanEndProduct.Properties.endProduct, SortingPlansMessages.SortingPlanEndProductPropertiesEditionPart_EndProductLabel);
		endProduct = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(SortingPlansViewsRepository.SortingPlanEndProduct.Properties.endProduct, SortingPlansViewsRepository.FORM_KIND));
		widgetFactory.adapt(endProduct);
		endProduct.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
		GridData endProductData = new GridData(GridData.FILL_HORIZONTAL);
		endProduct.setLayoutData(endProductData);
		endProduct.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SortingPlanEndProductPropertiesEditionPartForm.this, SortingPlansViewsRepository.SortingPlanEndProduct.Properties.endProduct, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getEndProduct()));
			}

		});
		endProduct.setID(SortingPlansViewsRepository.SortingPlanEndProduct.Properties.endProduct);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(SortingPlansViewsRepository.SortingPlanEndProduct.Properties.endProduct, SortingPlansViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createEndProductFlatComboViewer

		// End of user code
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * @param widgetFactory factory to use to instanciante widget of the form
	 * 
	 */
	protected Composite createSortingPlanFlatComboViewer(Composite parent, FormToolkit widgetFactory) {
		createDescription(parent, SortingPlansViewsRepository.SortingPlanEndProduct.Properties.sortingPlan, SortingPlansMessages.SortingPlanEndProductPropertiesEditionPart_SortingPlanLabel);
		sortingPlan = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(SortingPlansViewsRepository.SortingPlanEndProduct.Properties.sortingPlan, SortingPlansViewsRepository.FORM_KIND));
		widgetFactory.adapt(sortingPlan);
		sortingPlan.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
		GridData sortingPlanData = new GridData(GridData.FILL_HORIZONTAL);
		sortingPlan.setLayoutData(sortingPlanData);
		sortingPlan.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SortingPlanEndProductPropertiesEditionPartForm.this, SortingPlansViewsRepository.SortingPlanEndProduct.Properties.sortingPlan, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getSortingPlan()));
			}

		});
		sortingPlan.setID(SortingPlansViewsRepository.SortingPlanEndProduct.Properties.sortingPlan);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(SortingPlansViewsRepository.SortingPlanEndProduct.Properties.sortingPlan, SortingPlansViewsRepository.FORM_KIND), null); //$NON-NLS-1$
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
