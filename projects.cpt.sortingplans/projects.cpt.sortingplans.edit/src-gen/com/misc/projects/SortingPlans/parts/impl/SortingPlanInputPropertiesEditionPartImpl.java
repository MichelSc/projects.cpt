/**
 * Generated with Acceleo
 */
package com.misc.projects.SortingPlans.parts.impl;

// Start of user code for imports
import com.misc.projects.SortingPlans.parts.SortingPlanInputPropertiesEditionPart;
import com.misc.projects.SortingPlans.parts.SortingPlansViewsRepository;

import com.misc.projects.SortingPlans.providers.SortingPlansMessages;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;

import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;

import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;

import org.eclipse.emf.eef.runtime.api.parts.ISWTPropertiesEditionPart;

import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;

import org.eclipse.emf.eef.runtime.impl.parts.CompositePropertiesEditionPart;

import org.eclipse.emf.eef.runtime.ui.parts.PartComposer;

import org.eclipse.emf.eef.runtime.ui.parts.sequence.BindingCompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionStep;

import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;
import org.eclipse.emf.eef.runtime.ui.widgets.EObjectFlatComboViewer;
import org.eclipse.emf.eef.runtime.ui.widgets.SWTUtils;

import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;

import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.ViewerFilter;

import org.eclipse.swt.SWT;

import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;

import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;

// End of user code

/**
 * 
 * 
 */
public class SortingPlanInputPropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, SortingPlanInputPropertiesEditionPart {

	protected EObjectFlatComboViewer inputProduct;
	protected EObjectFlatComboViewer fPDSortingPlanInput;
	protected EObjectFlatComboViewer sortingPlan;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public SortingPlanInputPropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence sortingPlanInputStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = sortingPlanInputStep.addStep(SortingPlansViewsRepository.SortingPlanInput.Properties.class);
		propertiesStep.addStep(SortingPlansViewsRepository.SortingPlanInput.Properties.inputProduct);
		propertiesStep.addStep(SortingPlansViewsRepository.SortingPlanInput.Properties.fPDSortingPlanInput);
		propertiesStep.addStep(SortingPlansViewsRepository.SortingPlanInput.Properties.sortingPlan);
		
		
		composer = new PartComposer(sortingPlanInputStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == SortingPlansViewsRepository.SortingPlanInput.Properties.class) {
					return createPropertiesGroup(parent);
				}
				if (key == SortingPlansViewsRepository.SortingPlanInput.Properties.inputProduct) {
					return createInputProductFlatComboViewer(parent);
				}
				if (key == SortingPlansViewsRepository.SortingPlanInput.Properties.fPDSortingPlanInput) {
					return createFPDSortingPlanInputFlatComboViewer(parent);
				}
				if (key == SortingPlansViewsRepository.SortingPlanInput.Properties.sortingPlan) {
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
		propertiesGroup.setText(SortingPlansMessages.SortingPlanInputPropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesGroupData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesGroupData.horizontalSpan = 3;
		propertiesGroup.setLayoutData(propertiesGroupData);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		return propertiesGroup;
	}

	/**
	 * @param parent the parent composite
	 * 
	 */
	protected Composite createInputProductFlatComboViewer(Composite parent) {
		createDescription(parent, SortingPlansViewsRepository.SortingPlanInput.Properties.inputProduct, SortingPlansMessages.SortingPlanInputPropertiesEditionPart_InputProductLabel);
		inputProduct = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(SortingPlansViewsRepository.SortingPlanInput.Properties.inputProduct, SortingPlansViewsRepository.SWT_KIND));
		inputProduct.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		inputProduct.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SortingPlanInputPropertiesEditionPartImpl.this, SortingPlansViewsRepository.SortingPlanInput.Properties.inputProduct, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getInputProduct()));
			}

		});
		GridData inputProductData = new GridData(GridData.FILL_HORIZONTAL);
		inputProduct.setLayoutData(inputProductData);
		inputProduct.setID(SortingPlansViewsRepository.SortingPlanInput.Properties.inputProduct);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(SortingPlansViewsRepository.SortingPlanInput.Properties.inputProduct, SortingPlansViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createInputProductFlatComboViewer

		// End of user code
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * 
	 */
	protected Composite createFPDSortingPlanInputFlatComboViewer(Composite parent) {
		createDescription(parent, SortingPlansViewsRepository.SortingPlanInput.Properties.fPDSortingPlanInput, SortingPlansMessages.SortingPlanInputPropertiesEditionPart_FPDSortingPlanInputLabel);
		fPDSortingPlanInput = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(SortingPlansViewsRepository.SortingPlanInput.Properties.fPDSortingPlanInput, SortingPlansViewsRepository.SWT_KIND));
		fPDSortingPlanInput.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		fPDSortingPlanInput.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SortingPlanInputPropertiesEditionPartImpl.this, SortingPlansViewsRepository.SortingPlanInput.Properties.fPDSortingPlanInput, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getFPDSortingPlanInput()));
			}

		});
		GridData fPDSortingPlanInputData = new GridData(GridData.FILL_HORIZONTAL);
		fPDSortingPlanInput.setLayoutData(fPDSortingPlanInputData);
		fPDSortingPlanInput.setID(SortingPlansViewsRepository.SortingPlanInput.Properties.fPDSortingPlanInput);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(SortingPlansViewsRepository.SortingPlanInput.Properties.fPDSortingPlanInput, SortingPlansViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createFPDSortingPlanInputFlatComboViewer

		// End of user code
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * 
	 */
	protected Composite createSortingPlanFlatComboViewer(Composite parent) {
		createDescription(parent, SortingPlansViewsRepository.SortingPlanInput.Properties.sortingPlan, SortingPlansMessages.SortingPlanInputPropertiesEditionPart_SortingPlanLabel);
		sortingPlan = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(SortingPlansViewsRepository.SortingPlanInput.Properties.sortingPlan, SortingPlansViewsRepository.SWT_KIND));
		sortingPlan.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		sortingPlan.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SortingPlanInputPropertiesEditionPartImpl.this, SortingPlansViewsRepository.SortingPlanInput.Properties.sortingPlan, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getSortingPlan()));
			}

		});
		GridData sortingPlanData = new GridData(GridData.FILL_HORIZONTAL);
		sortingPlan.setLayoutData(sortingPlanData);
		sortingPlan.setID(SortingPlansViewsRepository.SortingPlanInput.Properties.sortingPlan);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(SortingPlansViewsRepository.SortingPlanInput.Properties.sortingPlan, SortingPlansViewsRepository.SWT_KIND), null); //$NON-NLS-1$
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
