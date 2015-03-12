/**
 * Generated with Acceleo
 */
package com.misc.projects.SortingPlans.parts.forms;

// Start of user code for imports
import com.misc.projects.SortingPlans.parts.SortingPlanOutputPropertiesEditionPart;
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
public class SortingPlanOutputPropertiesEditionPartForm extends SectionPropertiesEditingPart implements IFormPropertiesEditionPart, SortingPlanOutputPropertiesEditionPart {

	protected EObjectFlatComboViewer fPDSortingPlanOutput;
	protected EObjectFlatComboViewer outputProduct;
	protected ReferencesTable sortingPlanEndProduct;
	protected List<ViewerFilter> sortingPlanEndProductBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> sortingPlanEndProductFilters = new ArrayList<ViewerFilter>();
	protected EObjectFlatComboViewer sortingPlan;



	/**
	 * For {@link ISection} use only.
	 */
	public SortingPlanOutputPropertiesEditionPartForm() { super(); }

	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public SortingPlanOutputPropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence sortingPlanOutputStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = sortingPlanOutputStep.addStep(SortingPlansViewsRepository.SortingPlanOutput.Properties.class);
		propertiesStep.addStep(SortingPlansViewsRepository.SortingPlanOutput.Properties.fPDSortingPlanOutput);
		propertiesStep.addStep(SortingPlansViewsRepository.SortingPlanOutput.Properties.outputProduct);
		propertiesStep.addStep(SortingPlansViewsRepository.SortingPlanOutput.Properties.sortingPlanEndProduct);
		propertiesStep.addStep(SortingPlansViewsRepository.SortingPlanOutput.Properties.sortingPlan);
		
		
		composer = new PartComposer(sortingPlanOutputStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == SortingPlansViewsRepository.SortingPlanOutput.Properties.class) {
					return createPropertiesGroup(widgetFactory, parent);
				}
				if (key == SortingPlansViewsRepository.SortingPlanOutput.Properties.fPDSortingPlanOutput) {
					return createFPDSortingPlanOutputFlatComboViewer(parent, widgetFactory);
				}
				if (key == SortingPlansViewsRepository.SortingPlanOutput.Properties.outputProduct) {
					return createOutputProductFlatComboViewer(parent, widgetFactory);
				}
				if (key == SortingPlansViewsRepository.SortingPlanOutput.Properties.sortingPlanEndProduct) {
					return createSortingPlanEndProductReferencesTable(widgetFactory, parent);
				}
				if (key == SortingPlansViewsRepository.SortingPlanOutput.Properties.sortingPlan) {
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
		propertiesSection.setText(SortingPlansMessages.SortingPlanOutputPropertiesEditionPart_PropertiesGroupLabel);
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
	 * @param parent the parent composite
	 * @param widgetFactory factory to use to instanciante widget of the form
	 * 
	 */
	protected Composite createFPDSortingPlanOutputFlatComboViewer(Composite parent, FormToolkit widgetFactory) {
		createDescription(parent, SortingPlansViewsRepository.SortingPlanOutput.Properties.fPDSortingPlanOutput, SortingPlansMessages.SortingPlanOutputPropertiesEditionPart_FPDSortingPlanOutputLabel);
		fPDSortingPlanOutput = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(SortingPlansViewsRepository.SortingPlanOutput.Properties.fPDSortingPlanOutput, SortingPlansViewsRepository.FORM_KIND));
		widgetFactory.adapt(fPDSortingPlanOutput);
		fPDSortingPlanOutput.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
		GridData fPDSortingPlanOutputData = new GridData(GridData.FILL_HORIZONTAL);
		fPDSortingPlanOutput.setLayoutData(fPDSortingPlanOutputData);
		fPDSortingPlanOutput.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SortingPlanOutputPropertiesEditionPartForm.this, SortingPlansViewsRepository.SortingPlanOutput.Properties.fPDSortingPlanOutput, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getFPDSortingPlanOutput()));
			}

		});
		fPDSortingPlanOutput.setID(SortingPlansViewsRepository.SortingPlanOutput.Properties.fPDSortingPlanOutput);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(SortingPlansViewsRepository.SortingPlanOutput.Properties.fPDSortingPlanOutput, SortingPlansViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createFPDSortingPlanOutputFlatComboViewer

		// End of user code
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * @param widgetFactory factory to use to instanciante widget of the form
	 * 
	 */
	protected Composite createOutputProductFlatComboViewer(Composite parent, FormToolkit widgetFactory) {
		createDescription(parent, SortingPlansViewsRepository.SortingPlanOutput.Properties.outputProduct, SortingPlansMessages.SortingPlanOutputPropertiesEditionPart_OutputProductLabel);
		outputProduct = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(SortingPlansViewsRepository.SortingPlanOutput.Properties.outputProduct, SortingPlansViewsRepository.FORM_KIND));
		widgetFactory.adapt(outputProduct);
		outputProduct.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
		GridData outputProductData = new GridData(GridData.FILL_HORIZONTAL);
		outputProduct.setLayoutData(outputProductData);
		outputProduct.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SortingPlanOutputPropertiesEditionPartForm.this, SortingPlansViewsRepository.SortingPlanOutput.Properties.outputProduct, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getOutputProduct()));
			}

		});
		outputProduct.setID(SortingPlansViewsRepository.SortingPlanOutput.Properties.outputProduct);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(SortingPlansViewsRepository.SortingPlanOutput.Properties.outputProduct, SortingPlansViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createOutputProductFlatComboViewer

		// End of user code
		return parent;
	}

	/**
	 * 
	 */
	protected Composite createSortingPlanEndProductReferencesTable(FormToolkit widgetFactory, Composite parent) {
		this.sortingPlanEndProduct = new ReferencesTable(getDescription(SortingPlansViewsRepository.SortingPlanOutput.Properties.sortingPlanEndProduct, SortingPlansMessages.SortingPlanOutputPropertiesEditionPart_SortingPlanEndProductLabel), new ReferencesTableListener	() {
			public void handleAdd() { addSortingPlanEndProduct(); }
			public void handleEdit(EObject element) { editSortingPlanEndProduct(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveSortingPlanEndProduct(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromSortingPlanEndProduct(element); }
			public void navigateTo(EObject element) { }
		});
		this.sortingPlanEndProduct.setHelpText(propertiesEditionComponent.getHelpContent(SortingPlansViewsRepository.SortingPlanOutput.Properties.sortingPlanEndProduct, SortingPlansViewsRepository.FORM_KIND));
		this.sortingPlanEndProduct.createControls(parent, widgetFactory);
		this.sortingPlanEndProduct.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SortingPlanOutputPropertiesEditionPartForm.this, SortingPlansViewsRepository.SortingPlanOutput.Properties.sortingPlanEndProduct, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData sortingPlanEndProductData = new GridData(GridData.FILL_HORIZONTAL);
		sortingPlanEndProductData.horizontalSpan = 3;
		this.sortingPlanEndProduct.setLayoutData(sortingPlanEndProductData);
		this.sortingPlanEndProduct.disableMove();
		sortingPlanEndProduct.setID(SortingPlansViewsRepository.SortingPlanOutput.Properties.sortingPlanEndProduct);
		sortingPlanEndProduct.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		// Start of user code for createSortingPlanEndProductReferencesTable

		// End of user code
		return parent;
	}

	/**
	 * 
	 */
	protected void addSortingPlanEndProduct() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(sortingPlanEndProduct.getInput(), sortingPlanEndProductFilters, sortingPlanEndProductBusinessFilters,
		"SortingPlanEndProduct", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SortingPlanOutputPropertiesEditionPartForm.this, SortingPlansViewsRepository.SortingPlanOutput.Properties.sortingPlanEndProduct,
						PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				sortingPlanEndProduct.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveSortingPlanEndProduct(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SortingPlanOutputPropertiesEditionPartForm.this, SortingPlansViewsRepository.SortingPlanOutput.Properties.sortingPlanEndProduct, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		sortingPlanEndProduct.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromSortingPlanEndProduct(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SortingPlanOutputPropertiesEditionPartForm.this, SortingPlansViewsRepository.SortingPlanOutput.Properties.sortingPlanEndProduct, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		sortingPlanEndProduct.refresh();
	}

	/**
	 * 
	 */
	protected void editSortingPlanEndProduct(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				sortingPlanEndProduct.refresh();
			}
		}
	}

	/**
	 * @param parent the parent composite
	 * @param widgetFactory factory to use to instanciante widget of the form
	 * 
	 */
	protected Composite createSortingPlanFlatComboViewer(Composite parent, FormToolkit widgetFactory) {
		createDescription(parent, SortingPlansViewsRepository.SortingPlanOutput.Properties.sortingPlan, SortingPlansMessages.SortingPlanOutputPropertiesEditionPart_SortingPlanLabel);
		sortingPlan = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(SortingPlansViewsRepository.SortingPlanOutput.Properties.sortingPlan, SortingPlansViewsRepository.FORM_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SortingPlanOutputPropertiesEditionPartForm.this, SortingPlansViewsRepository.SortingPlanOutput.Properties.sortingPlan, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getSortingPlan()));
			}

		});
		sortingPlan.setID(SortingPlansViewsRepository.SortingPlanOutput.Properties.sortingPlan);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(SortingPlansViewsRepository.SortingPlanOutput.Properties.sortingPlan, SortingPlansViewsRepository.FORM_KIND), null); //$NON-NLS-1$
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
	 * @see com.misc.projects.SortingPlans.parts.SortingPlanOutputPropertiesEditionPart#getFPDSortingPlanOutput()
	 * 
	 */
	public EObject getFPDSortingPlanOutput() {
		if (fPDSortingPlanOutput.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) fPDSortingPlanOutput.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.misc.projects.SortingPlans.parts.SortingPlanOutputPropertiesEditionPart#initFPDSortingPlanOutput(EObjectFlatComboSettings)
	 */
	public void initFPDSortingPlanOutput(EObjectFlatComboSettings settings) {
		fPDSortingPlanOutput.setInput(settings);
		if (current != null) {
			fPDSortingPlanOutput.setSelection(new StructuredSelection(settings.getValue()));
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(SortingPlansViewsRepository.SortingPlanOutput.Properties.fPDSortingPlanOutput);
		if (eefElementEditorReadOnlyState && fPDSortingPlanOutput.isEnabled()) {
			fPDSortingPlanOutput.setEnabled(false);
			fPDSortingPlanOutput.setToolTipText(SortingPlansMessages.SortingPlanOutput_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !fPDSortingPlanOutput.isEnabled()) {
			fPDSortingPlanOutput.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.misc.projects.SortingPlans.parts.SortingPlanOutputPropertiesEditionPart#setFPDSortingPlanOutput(EObject newValue)
	 * 
	 */
	public void setFPDSortingPlanOutput(EObject newValue) {
		if (newValue != null) {
			fPDSortingPlanOutput.setSelection(new StructuredSelection(newValue));
		} else {
			fPDSortingPlanOutput.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(SortingPlansViewsRepository.SortingPlanOutput.Properties.fPDSortingPlanOutput);
		if (eefElementEditorReadOnlyState && fPDSortingPlanOutput.isEnabled()) {
			fPDSortingPlanOutput.setEnabled(false);
			fPDSortingPlanOutput.setToolTipText(SortingPlansMessages.SortingPlanOutput_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !fPDSortingPlanOutput.isEnabled()) {
			fPDSortingPlanOutput.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.misc.projects.SortingPlans.parts.SortingPlanOutputPropertiesEditionPart#setFPDSortingPlanOutputButtonMode(ButtonsModeEnum newValue)
	 */
	public void setFPDSortingPlanOutputButtonMode(ButtonsModeEnum newValue) {
		fPDSortingPlanOutput.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.misc.projects.SortingPlans.parts.SortingPlanOutputPropertiesEditionPart#addFilterFPDSortingPlanOutput(ViewerFilter filter)
	 * 
	 */
	public void addFilterToFPDSortingPlanOutput(ViewerFilter filter) {
		fPDSortingPlanOutput.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.misc.projects.SortingPlans.parts.SortingPlanOutputPropertiesEditionPart#addBusinessFilterFPDSortingPlanOutput(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToFPDSortingPlanOutput(ViewerFilter filter) {
		fPDSortingPlanOutput.addBusinessRuleFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.misc.projects.SortingPlans.parts.SortingPlanOutputPropertiesEditionPart#getOutputProduct()
	 * 
	 */
	public EObject getOutputProduct() {
		if (outputProduct.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) outputProduct.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.misc.projects.SortingPlans.parts.SortingPlanOutputPropertiesEditionPart#initOutputProduct(EObjectFlatComboSettings)
	 */
	public void initOutputProduct(EObjectFlatComboSettings settings) {
		outputProduct.setInput(settings);
		if (current != null) {
			outputProduct.setSelection(new StructuredSelection(settings.getValue()));
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(SortingPlansViewsRepository.SortingPlanOutput.Properties.outputProduct);
		if (eefElementEditorReadOnlyState && outputProduct.isEnabled()) {
			outputProduct.setEnabled(false);
			outputProduct.setToolTipText(SortingPlansMessages.SortingPlanOutput_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !outputProduct.isEnabled()) {
			outputProduct.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.misc.projects.SortingPlans.parts.SortingPlanOutputPropertiesEditionPart#setOutputProduct(EObject newValue)
	 * 
	 */
	public void setOutputProduct(EObject newValue) {
		if (newValue != null) {
			outputProduct.setSelection(new StructuredSelection(newValue));
		} else {
			outputProduct.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(SortingPlansViewsRepository.SortingPlanOutput.Properties.outputProduct);
		if (eefElementEditorReadOnlyState && outputProduct.isEnabled()) {
			outputProduct.setEnabled(false);
			outputProduct.setToolTipText(SortingPlansMessages.SortingPlanOutput_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !outputProduct.isEnabled()) {
			outputProduct.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.misc.projects.SortingPlans.parts.SortingPlanOutputPropertiesEditionPart#setOutputProductButtonMode(ButtonsModeEnum newValue)
	 */
	public void setOutputProductButtonMode(ButtonsModeEnum newValue) {
		outputProduct.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.misc.projects.SortingPlans.parts.SortingPlanOutputPropertiesEditionPart#addFilterOutputProduct(ViewerFilter filter)
	 * 
	 */
	public void addFilterToOutputProduct(ViewerFilter filter) {
		outputProduct.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.misc.projects.SortingPlans.parts.SortingPlanOutputPropertiesEditionPart#addBusinessFilterOutputProduct(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToOutputProduct(ViewerFilter filter) {
		outputProduct.addBusinessRuleFilter(filter);
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see com.misc.projects.SortingPlans.parts.SortingPlanOutputPropertiesEditionPart#initSortingPlanEndProduct(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initSortingPlanEndProduct(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		sortingPlanEndProduct.setContentProvider(contentProvider);
		sortingPlanEndProduct.setInput(settings);
		boolean eefElementEditorReadOnlyState = isReadOnly(SortingPlansViewsRepository.SortingPlanOutput.Properties.sortingPlanEndProduct);
		if (eefElementEditorReadOnlyState && sortingPlanEndProduct.getTable().isEnabled()) {
			sortingPlanEndProduct.setEnabled(false);
			sortingPlanEndProduct.setToolTipText(SortingPlansMessages.SortingPlanOutput_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !sortingPlanEndProduct.getTable().isEnabled()) {
			sortingPlanEndProduct.setEnabled(true);
		}
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.misc.projects.SortingPlans.parts.SortingPlanOutputPropertiesEditionPart#updateSortingPlanEndProduct()
	 * 
	 */
	public void updateSortingPlanEndProduct() {
	sortingPlanEndProduct.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.misc.projects.SortingPlans.parts.SortingPlanOutputPropertiesEditionPart#addFilterSortingPlanEndProduct(ViewerFilter filter)
	 * 
	 */
	public void addFilterToSortingPlanEndProduct(ViewerFilter filter) {
		sortingPlanEndProductFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.misc.projects.SortingPlans.parts.SortingPlanOutputPropertiesEditionPart#addBusinessFilterSortingPlanEndProduct(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToSortingPlanEndProduct(ViewerFilter filter) {
		sortingPlanEndProductBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.misc.projects.SortingPlans.parts.SortingPlanOutputPropertiesEditionPart#isContainedInSortingPlanEndProductTable(EObject element)
	 * 
	 */
	public boolean isContainedInSortingPlanEndProductTable(EObject element) {
		return ((ReferencesTableSettings)sortingPlanEndProduct.getInput()).contains(element);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.misc.projects.SortingPlans.parts.SortingPlanOutputPropertiesEditionPart#getSortingPlan()
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
	 * @see com.misc.projects.SortingPlans.parts.SortingPlanOutputPropertiesEditionPart#initSortingPlan(EObjectFlatComboSettings)
	 */
	public void initSortingPlan(EObjectFlatComboSettings settings) {
		sortingPlan.setInput(settings);
		if (current != null) {
			sortingPlan.setSelection(new StructuredSelection(settings.getValue()));
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(SortingPlansViewsRepository.SortingPlanOutput.Properties.sortingPlan);
		if (eefElementEditorReadOnlyState && sortingPlan.isEnabled()) {
			sortingPlan.setEnabled(false);
			sortingPlan.setToolTipText(SortingPlansMessages.SortingPlanOutput_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !sortingPlan.isEnabled()) {
			sortingPlan.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.misc.projects.SortingPlans.parts.SortingPlanOutputPropertiesEditionPart#setSortingPlan(EObject newValue)
	 * 
	 */
	public void setSortingPlan(EObject newValue) {
		if (newValue != null) {
			sortingPlan.setSelection(new StructuredSelection(newValue));
		} else {
			sortingPlan.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(SortingPlansViewsRepository.SortingPlanOutput.Properties.sortingPlan);
		if (eefElementEditorReadOnlyState && sortingPlan.isEnabled()) {
			sortingPlan.setEnabled(false);
			sortingPlan.setToolTipText(SortingPlansMessages.SortingPlanOutput_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !sortingPlan.isEnabled()) {
			sortingPlan.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.misc.projects.SortingPlans.parts.SortingPlanOutputPropertiesEditionPart#setSortingPlanButtonMode(ButtonsModeEnum newValue)
	 */
	public void setSortingPlanButtonMode(ButtonsModeEnum newValue) {
		sortingPlan.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.misc.projects.SortingPlans.parts.SortingPlanOutputPropertiesEditionPart#addFilterSortingPlan(ViewerFilter filter)
	 * 
	 */
	public void addFilterToSortingPlan(ViewerFilter filter) {
		sortingPlan.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.misc.projects.SortingPlans.parts.SortingPlanOutputPropertiesEditionPart#addBusinessFilterSortingPlan(ViewerFilter filter)
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
		return SortingPlansMessages.SortingPlanOutput_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
