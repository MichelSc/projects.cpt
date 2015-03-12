/**
 * Generated with Acceleo
 */
package com.misc.projects.SortingPlans.parts.forms;

// Start of user code for imports
import com.misc.projects.SortingPlans.parts.SortingPlanInputPropertiesEditionPart;
import com.misc.projects.SortingPlans.parts.SortingPlansViewsRepository;

import com.misc.projects.SortingPlans.providers.SortingPlansMessages;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;

import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;

import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;

import org.eclipse.emf.eef.runtime.api.parts.IFormPropertiesEditionPart;

import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;

import org.eclipse.emf.eef.runtime.part.impl.SectionPropertiesEditingPart;

import org.eclipse.emf.eef.runtime.ui.parts.PartComposer;

import org.eclipse.emf.eef.runtime.ui.parts.sequence.BindingCompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionStep;

import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;
import org.eclipse.emf.eef.runtime.ui.widgets.EObjectFlatComboViewer;
import org.eclipse.emf.eef.runtime.ui.widgets.FormUtils;

import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;

import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.ViewerFilter;

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
public class SortingPlanInputPropertiesEditionPartForm extends SectionPropertiesEditingPart implements IFormPropertiesEditionPart, SortingPlanInputPropertiesEditionPart {

	protected EObjectFlatComboViewer inputProduct;
	protected EObjectFlatComboViewer fPDSortingPlanInput;
	protected EObjectFlatComboViewer sortingPlan;



	/**
	 * For {@link ISection} use only.
	 */
	public SortingPlanInputPropertiesEditionPartForm() { super(); }

	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public SortingPlanInputPropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence sortingPlanInputStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = sortingPlanInputStep.addStep(SortingPlansViewsRepository.SortingPlanInput.Properties.class);
		propertiesStep.addStep(SortingPlansViewsRepository.SortingPlanInput.Properties.inputProduct);
		propertiesStep.addStep(SortingPlansViewsRepository.SortingPlanInput.Properties.fPDSortingPlanInput);
		propertiesStep.addStep(SortingPlansViewsRepository.SortingPlanInput.Properties.sortingPlan);
		
		
		composer = new PartComposer(sortingPlanInputStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == SortingPlansViewsRepository.SortingPlanInput.Properties.class) {
					return createPropertiesGroup(widgetFactory, parent);
				}
				if (key == SortingPlansViewsRepository.SortingPlanInput.Properties.inputProduct) {
					return createInputProductFlatComboViewer(parent, widgetFactory);
				}
				if (key == SortingPlansViewsRepository.SortingPlanInput.Properties.fPDSortingPlanInput) {
					return createFPDSortingPlanInputFlatComboViewer(parent, widgetFactory);
				}
				if (key == SortingPlansViewsRepository.SortingPlanInput.Properties.sortingPlan) {
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
		propertiesSection.setText(SortingPlansMessages.SortingPlanInputPropertiesEditionPart_PropertiesGroupLabel);
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
	protected Composite createInputProductFlatComboViewer(Composite parent, FormToolkit widgetFactory) {
		createDescription(parent, SortingPlansViewsRepository.SortingPlanInput.Properties.inputProduct, SortingPlansMessages.SortingPlanInputPropertiesEditionPart_InputProductLabel);
		inputProduct = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(SortingPlansViewsRepository.SortingPlanInput.Properties.inputProduct, SortingPlansViewsRepository.FORM_KIND));
		widgetFactory.adapt(inputProduct);
		inputProduct.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
		GridData inputProductData = new GridData(GridData.FILL_HORIZONTAL);
		inputProduct.setLayoutData(inputProductData);
		inputProduct.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SortingPlanInputPropertiesEditionPartForm.this, SortingPlansViewsRepository.SortingPlanInput.Properties.inputProduct, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getInputProduct()));
			}

		});
		inputProduct.setID(SortingPlansViewsRepository.SortingPlanInput.Properties.inputProduct);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(SortingPlansViewsRepository.SortingPlanInput.Properties.inputProduct, SortingPlansViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createInputProductFlatComboViewer

		// End of user code
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * @param widgetFactory factory to use to instanciante widget of the form
	 * 
	 */
	protected Composite createFPDSortingPlanInputFlatComboViewer(Composite parent, FormToolkit widgetFactory) {
		createDescription(parent, SortingPlansViewsRepository.SortingPlanInput.Properties.fPDSortingPlanInput, SortingPlansMessages.SortingPlanInputPropertiesEditionPart_FPDSortingPlanInputLabel);
		fPDSortingPlanInput = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(SortingPlansViewsRepository.SortingPlanInput.Properties.fPDSortingPlanInput, SortingPlansViewsRepository.FORM_KIND));
		widgetFactory.adapt(fPDSortingPlanInput);
		fPDSortingPlanInput.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
		GridData fPDSortingPlanInputData = new GridData(GridData.FILL_HORIZONTAL);
		fPDSortingPlanInput.setLayoutData(fPDSortingPlanInputData);
		fPDSortingPlanInput.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SortingPlanInputPropertiesEditionPartForm.this, SortingPlansViewsRepository.SortingPlanInput.Properties.fPDSortingPlanInput, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getFPDSortingPlanInput()));
			}

		});
		fPDSortingPlanInput.setID(SortingPlansViewsRepository.SortingPlanInput.Properties.fPDSortingPlanInput);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(SortingPlansViewsRepository.SortingPlanInput.Properties.fPDSortingPlanInput, SortingPlansViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createFPDSortingPlanInputFlatComboViewer

		// End of user code
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * @param widgetFactory factory to use to instanciante widget of the form
	 * 
	 */
	protected Composite createSortingPlanFlatComboViewer(Composite parent, FormToolkit widgetFactory) {
		createDescription(parent, SortingPlansViewsRepository.SortingPlanInput.Properties.sortingPlan, SortingPlansMessages.SortingPlanInputPropertiesEditionPart_SortingPlanLabel);
		sortingPlan = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(SortingPlansViewsRepository.SortingPlanInput.Properties.sortingPlan, SortingPlansViewsRepository.FORM_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SortingPlanInputPropertiesEditionPartForm.this, SortingPlansViewsRepository.SortingPlanInput.Properties.sortingPlan, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getSortingPlan()));
			}

		});
		sortingPlan.setID(SortingPlansViewsRepository.SortingPlanInput.Properties.sortingPlan);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(SortingPlansViewsRepository.SortingPlanInput.Properties.sortingPlan, SortingPlansViewsRepository.FORM_KIND), null); //$NON-NLS-1$
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
	 * @see com.misc.projects.SortingPlans.parts.SortingPlanInputPropertiesEditionPart#getInputProduct()
	 * 
	 */
	public EObject getInputProduct() {
		if (inputProduct.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) inputProduct.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.misc.projects.SortingPlans.parts.SortingPlanInputPropertiesEditionPart#initInputProduct(EObjectFlatComboSettings)
	 */
	public void initInputProduct(EObjectFlatComboSettings settings) {
		inputProduct.setInput(settings);
		if (current != null) {
			inputProduct.setSelection(new StructuredSelection(settings.getValue()));
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(SortingPlansViewsRepository.SortingPlanInput.Properties.inputProduct);
		if (eefElementEditorReadOnlyState && inputProduct.isEnabled()) {
			inputProduct.setEnabled(false);
			inputProduct.setToolTipText(SortingPlansMessages.SortingPlanInput_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !inputProduct.isEnabled()) {
			inputProduct.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.misc.projects.SortingPlans.parts.SortingPlanInputPropertiesEditionPart#setInputProduct(EObject newValue)
	 * 
	 */
	public void setInputProduct(EObject newValue) {
		if (newValue != null) {
			inputProduct.setSelection(new StructuredSelection(newValue));
		} else {
			inputProduct.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(SortingPlansViewsRepository.SortingPlanInput.Properties.inputProduct);
		if (eefElementEditorReadOnlyState && inputProduct.isEnabled()) {
			inputProduct.setEnabled(false);
			inputProduct.setToolTipText(SortingPlansMessages.SortingPlanInput_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !inputProduct.isEnabled()) {
			inputProduct.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.misc.projects.SortingPlans.parts.SortingPlanInputPropertiesEditionPart#setInputProductButtonMode(ButtonsModeEnum newValue)
	 */
	public void setInputProductButtonMode(ButtonsModeEnum newValue) {
		inputProduct.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.misc.projects.SortingPlans.parts.SortingPlanInputPropertiesEditionPart#addFilterInputProduct(ViewerFilter filter)
	 * 
	 */
	public void addFilterToInputProduct(ViewerFilter filter) {
		inputProduct.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.misc.projects.SortingPlans.parts.SortingPlanInputPropertiesEditionPart#addBusinessFilterInputProduct(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToInputProduct(ViewerFilter filter) {
		inputProduct.addBusinessRuleFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.misc.projects.SortingPlans.parts.SortingPlanInputPropertiesEditionPart#getFPDSortingPlanInput()
	 * 
	 */
	public EObject getFPDSortingPlanInput() {
		if (fPDSortingPlanInput.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) fPDSortingPlanInput.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.misc.projects.SortingPlans.parts.SortingPlanInputPropertiesEditionPart#initFPDSortingPlanInput(EObjectFlatComboSettings)
	 */
	public void initFPDSortingPlanInput(EObjectFlatComboSettings settings) {
		fPDSortingPlanInput.setInput(settings);
		if (current != null) {
			fPDSortingPlanInput.setSelection(new StructuredSelection(settings.getValue()));
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(SortingPlansViewsRepository.SortingPlanInput.Properties.fPDSortingPlanInput);
		if (eefElementEditorReadOnlyState && fPDSortingPlanInput.isEnabled()) {
			fPDSortingPlanInput.setEnabled(false);
			fPDSortingPlanInput.setToolTipText(SortingPlansMessages.SortingPlanInput_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !fPDSortingPlanInput.isEnabled()) {
			fPDSortingPlanInput.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.misc.projects.SortingPlans.parts.SortingPlanInputPropertiesEditionPart#setFPDSortingPlanInput(EObject newValue)
	 * 
	 */
	public void setFPDSortingPlanInput(EObject newValue) {
		if (newValue != null) {
			fPDSortingPlanInput.setSelection(new StructuredSelection(newValue));
		} else {
			fPDSortingPlanInput.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(SortingPlansViewsRepository.SortingPlanInput.Properties.fPDSortingPlanInput);
		if (eefElementEditorReadOnlyState && fPDSortingPlanInput.isEnabled()) {
			fPDSortingPlanInput.setEnabled(false);
			fPDSortingPlanInput.setToolTipText(SortingPlansMessages.SortingPlanInput_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !fPDSortingPlanInput.isEnabled()) {
			fPDSortingPlanInput.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.misc.projects.SortingPlans.parts.SortingPlanInputPropertiesEditionPart#setFPDSortingPlanInputButtonMode(ButtonsModeEnum newValue)
	 */
	public void setFPDSortingPlanInputButtonMode(ButtonsModeEnum newValue) {
		fPDSortingPlanInput.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.misc.projects.SortingPlans.parts.SortingPlanInputPropertiesEditionPart#addFilterFPDSortingPlanInput(ViewerFilter filter)
	 * 
	 */
	public void addFilterToFPDSortingPlanInput(ViewerFilter filter) {
		fPDSortingPlanInput.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.misc.projects.SortingPlans.parts.SortingPlanInputPropertiesEditionPart#addBusinessFilterFPDSortingPlanInput(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToFPDSortingPlanInput(ViewerFilter filter) {
		fPDSortingPlanInput.addBusinessRuleFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.misc.projects.SortingPlans.parts.SortingPlanInputPropertiesEditionPart#getSortingPlan()
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
	 * @see com.misc.projects.SortingPlans.parts.SortingPlanInputPropertiesEditionPart#initSortingPlan(EObjectFlatComboSettings)
	 */
	public void initSortingPlan(EObjectFlatComboSettings settings) {
		sortingPlan.setInput(settings);
		if (current != null) {
			sortingPlan.setSelection(new StructuredSelection(settings.getValue()));
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(SortingPlansViewsRepository.SortingPlanInput.Properties.sortingPlan);
		if (eefElementEditorReadOnlyState && sortingPlan.isEnabled()) {
			sortingPlan.setEnabled(false);
			sortingPlan.setToolTipText(SortingPlansMessages.SortingPlanInput_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !sortingPlan.isEnabled()) {
			sortingPlan.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.misc.projects.SortingPlans.parts.SortingPlanInputPropertiesEditionPart#setSortingPlan(EObject newValue)
	 * 
	 */
	public void setSortingPlan(EObject newValue) {
		if (newValue != null) {
			sortingPlan.setSelection(new StructuredSelection(newValue));
		} else {
			sortingPlan.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(SortingPlansViewsRepository.SortingPlanInput.Properties.sortingPlan);
		if (eefElementEditorReadOnlyState && sortingPlan.isEnabled()) {
			sortingPlan.setEnabled(false);
			sortingPlan.setToolTipText(SortingPlansMessages.SortingPlanInput_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !sortingPlan.isEnabled()) {
			sortingPlan.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.misc.projects.SortingPlans.parts.SortingPlanInputPropertiesEditionPart#setSortingPlanButtonMode(ButtonsModeEnum newValue)
	 */
	public void setSortingPlanButtonMode(ButtonsModeEnum newValue) {
		sortingPlan.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.misc.projects.SortingPlans.parts.SortingPlanInputPropertiesEditionPart#addFilterSortingPlan(ViewerFilter filter)
	 * 
	 */
	public void addFilterToSortingPlan(ViewerFilter filter) {
		sortingPlan.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.misc.projects.SortingPlans.parts.SortingPlanInputPropertiesEditionPart#addBusinessFilterSortingPlan(ViewerFilter filter)
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
		return SortingPlansMessages.SortingPlanInput_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
