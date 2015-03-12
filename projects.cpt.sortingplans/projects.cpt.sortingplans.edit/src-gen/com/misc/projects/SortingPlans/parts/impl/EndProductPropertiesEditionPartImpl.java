/**
 * Generated with Acceleo
 */
package com.misc.projects.SortingPlans.parts.impl;

// Start of user code for imports
import com.misc.projects.SortingPlans.parts.EndProductPropertiesEditionPart;
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

import org.eclipse.emf.eef.runtime.ui.utils.EditingUtils;

import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;
import org.eclipse.emf.eef.runtime.ui.widgets.EObjectFlatComboViewer;
import org.eclipse.emf.eef.runtime.ui.widgets.SWTUtils;

import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;

import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.ViewerFilter;

import org.eclipse.swt.SWT;

import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;

import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;

// End of user code

/**
 * 
 * 
 */
public class EndProductPropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, EndProductPropertiesEditionPart {

	protected EObjectFlatComboViewer fPDSortingLevel;
	protected EObjectFlatComboViewer sortingPlanProduct;
	protected Button whichSortingPlans;
	protected EObjectFlatComboViewer scenario;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public EndProductPropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence endProductStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = endProductStep.addStep(SortingPlansViewsRepository.EndProduct.Properties.class);
		propertiesStep.addStep(SortingPlansViewsRepository.EndProduct.Properties.fPDSortingLevel);
		propertiesStep.addStep(SortingPlansViewsRepository.EndProduct.Properties.sortingPlanProduct);
		propertiesStep.addStep(SortingPlansViewsRepository.EndProduct.Properties.whichSortingPlans);
		propertiesStep.addStep(SortingPlansViewsRepository.EndProduct.Properties.scenario);
		
		
		composer = new PartComposer(endProductStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == SortingPlansViewsRepository.EndProduct.Properties.class) {
					return createPropertiesGroup(parent);
				}
				if (key == SortingPlansViewsRepository.EndProduct.Properties.fPDSortingLevel) {
					return createFPDSortingLevelFlatComboViewer(parent);
				}
				if (key == SortingPlansViewsRepository.EndProduct.Properties.sortingPlanProduct) {
					return createSortingPlanProductFlatComboViewer(parent);
				}
				if (key == SortingPlansViewsRepository.EndProduct.Properties.whichSortingPlans) {
					return createWhichSortingPlansCheckbox(parent);
				}
				if (key == SortingPlansViewsRepository.EndProduct.Properties.scenario) {
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
		propertiesGroup.setText(SortingPlansMessages.EndProductPropertiesEditionPart_PropertiesGroupLabel);
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
	protected Composite createFPDSortingLevelFlatComboViewer(Composite parent) {
		createDescription(parent, SortingPlansViewsRepository.EndProduct.Properties.fPDSortingLevel, SortingPlansMessages.EndProductPropertiesEditionPart_FPDSortingLevelLabel);
		fPDSortingLevel = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(SortingPlansViewsRepository.EndProduct.Properties.fPDSortingLevel, SortingPlansViewsRepository.SWT_KIND));
		fPDSortingLevel.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		fPDSortingLevel.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EndProductPropertiesEditionPartImpl.this, SortingPlansViewsRepository.EndProduct.Properties.fPDSortingLevel, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getFPDSortingLevel()));
			}

		});
		GridData fPDSortingLevelData = new GridData(GridData.FILL_HORIZONTAL);
		fPDSortingLevel.setLayoutData(fPDSortingLevelData);
		fPDSortingLevel.setID(SortingPlansViewsRepository.EndProduct.Properties.fPDSortingLevel);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(SortingPlansViewsRepository.EndProduct.Properties.fPDSortingLevel, SortingPlansViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createFPDSortingLevelFlatComboViewer

		// End of user code
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * 
	 */
	protected Composite createSortingPlanProductFlatComboViewer(Composite parent) {
		createDescription(parent, SortingPlansViewsRepository.EndProduct.Properties.sortingPlanProduct, SortingPlansMessages.EndProductPropertiesEditionPart_SortingPlanProductLabel);
		sortingPlanProduct = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(SortingPlansViewsRepository.EndProduct.Properties.sortingPlanProduct, SortingPlansViewsRepository.SWT_KIND));
		sortingPlanProduct.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		sortingPlanProduct.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EndProductPropertiesEditionPartImpl.this, SortingPlansViewsRepository.EndProduct.Properties.sortingPlanProduct, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getSortingPlanProduct()));
			}

		});
		GridData sortingPlanProductData = new GridData(GridData.FILL_HORIZONTAL);
		sortingPlanProduct.setLayoutData(sortingPlanProductData);
		sortingPlanProduct.setID(SortingPlansViewsRepository.EndProduct.Properties.sortingPlanProduct);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(SortingPlansViewsRepository.EndProduct.Properties.sortingPlanProduct, SortingPlansViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createSortingPlanProductFlatComboViewer

		// End of user code
		return parent;
	}

	
	protected Composite createWhichSortingPlansCheckbox(Composite parent) {
		whichSortingPlans = new Button(parent, SWT.CHECK);
		whichSortingPlans.setText(getDescription(SortingPlansViewsRepository.EndProduct.Properties.whichSortingPlans, SortingPlansMessages.EndProductPropertiesEditionPart_WhichSortingPlansLabel));
		whichSortingPlans.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 *
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 * 	
			 */
			public void widgetSelected(SelectionEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EndProductPropertiesEditionPartImpl.this, SortingPlansViewsRepository.EndProduct.Properties.whichSortingPlans, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, new Boolean(whichSortingPlans.getSelection())));
			}

		});
		GridData whichSortingPlansData = new GridData(GridData.FILL_HORIZONTAL);
		whichSortingPlansData.horizontalSpan = 2;
		whichSortingPlans.setLayoutData(whichSortingPlansData);
		EditingUtils.setID(whichSortingPlans, SortingPlansViewsRepository.EndProduct.Properties.whichSortingPlans);
		EditingUtils.setEEFtype(whichSortingPlans, "eef::Checkbox"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(SortingPlansViewsRepository.EndProduct.Properties.whichSortingPlans, SortingPlansViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createWhichSortingPlansCheckbox

		// End of user code
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * 
	 */
	protected Composite createScenarioFlatComboViewer(Composite parent) {
		createDescription(parent, SortingPlansViewsRepository.EndProduct.Properties.scenario, SortingPlansMessages.EndProductPropertiesEditionPart_ScenarioLabel);
		scenario = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(SortingPlansViewsRepository.EndProduct.Properties.scenario, SortingPlansViewsRepository.SWT_KIND));
		scenario.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		scenario.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EndProductPropertiesEditionPartImpl.this, SortingPlansViewsRepository.EndProduct.Properties.scenario, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getScenario()));
			}

		});
		GridData scenarioData = new GridData(GridData.FILL_HORIZONTAL);
		scenario.setLayoutData(scenarioData);
		scenario.setID(SortingPlansViewsRepository.EndProduct.Properties.scenario);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(SortingPlansViewsRepository.EndProduct.Properties.scenario, SortingPlansViewsRepository.SWT_KIND), null); //$NON-NLS-1$
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
	 * @see com.misc.projects.SortingPlans.parts.EndProductPropertiesEditionPart#getFPDSortingLevel()
	 * 
	 */
	public EObject getFPDSortingLevel() {
		if (fPDSortingLevel.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) fPDSortingLevel.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.misc.projects.SortingPlans.parts.EndProductPropertiesEditionPart#initFPDSortingLevel(EObjectFlatComboSettings)
	 */
	public void initFPDSortingLevel(EObjectFlatComboSettings settings) {
		fPDSortingLevel.setInput(settings);
		if (current != null) {
			fPDSortingLevel.setSelection(new StructuredSelection(settings.getValue()));
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(SortingPlansViewsRepository.EndProduct.Properties.fPDSortingLevel);
		if (eefElementEditorReadOnlyState && fPDSortingLevel.isEnabled()) {
			fPDSortingLevel.setEnabled(false);
			fPDSortingLevel.setToolTipText(SortingPlansMessages.EndProduct_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !fPDSortingLevel.isEnabled()) {
			fPDSortingLevel.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.misc.projects.SortingPlans.parts.EndProductPropertiesEditionPart#setFPDSortingLevel(EObject newValue)
	 * 
	 */
	public void setFPDSortingLevel(EObject newValue) {
		if (newValue != null) {
			fPDSortingLevel.setSelection(new StructuredSelection(newValue));
		} else {
			fPDSortingLevel.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(SortingPlansViewsRepository.EndProduct.Properties.fPDSortingLevel);
		if (eefElementEditorReadOnlyState && fPDSortingLevel.isEnabled()) {
			fPDSortingLevel.setEnabled(false);
			fPDSortingLevel.setToolTipText(SortingPlansMessages.EndProduct_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !fPDSortingLevel.isEnabled()) {
			fPDSortingLevel.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.misc.projects.SortingPlans.parts.EndProductPropertiesEditionPart#setFPDSortingLevelButtonMode(ButtonsModeEnum newValue)
	 */
	public void setFPDSortingLevelButtonMode(ButtonsModeEnum newValue) {
		fPDSortingLevel.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.misc.projects.SortingPlans.parts.EndProductPropertiesEditionPart#addFilterFPDSortingLevel(ViewerFilter filter)
	 * 
	 */
	public void addFilterToFPDSortingLevel(ViewerFilter filter) {
		fPDSortingLevel.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.misc.projects.SortingPlans.parts.EndProductPropertiesEditionPart#addBusinessFilterFPDSortingLevel(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToFPDSortingLevel(ViewerFilter filter) {
		fPDSortingLevel.addBusinessRuleFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.misc.projects.SortingPlans.parts.EndProductPropertiesEditionPart#getSortingPlanProduct()
	 * 
	 */
	public EObject getSortingPlanProduct() {
		if (sortingPlanProduct.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) sortingPlanProduct.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.misc.projects.SortingPlans.parts.EndProductPropertiesEditionPart#initSortingPlanProduct(EObjectFlatComboSettings)
	 */
	public void initSortingPlanProduct(EObjectFlatComboSettings settings) {
		sortingPlanProduct.setInput(settings);
		if (current != null) {
			sortingPlanProduct.setSelection(new StructuredSelection(settings.getValue()));
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(SortingPlansViewsRepository.EndProduct.Properties.sortingPlanProduct);
		if (eefElementEditorReadOnlyState && sortingPlanProduct.isEnabled()) {
			sortingPlanProduct.setEnabled(false);
			sortingPlanProduct.setToolTipText(SortingPlansMessages.EndProduct_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !sortingPlanProduct.isEnabled()) {
			sortingPlanProduct.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.misc.projects.SortingPlans.parts.EndProductPropertiesEditionPart#setSortingPlanProduct(EObject newValue)
	 * 
	 */
	public void setSortingPlanProduct(EObject newValue) {
		if (newValue != null) {
			sortingPlanProduct.setSelection(new StructuredSelection(newValue));
		} else {
			sortingPlanProduct.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(SortingPlansViewsRepository.EndProduct.Properties.sortingPlanProduct);
		if (eefElementEditorReadOnlyState && sortingPlanProduct.isEnabled()) {
			sortingPlanProduct.setEnabled(false);
			sortingPlanProduct.setToolTipText(SortingPlansMessages.EndProduct_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !sortingPlanProduct.isEnabled()) {
			sortingPlanProduct.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.misc.projects.SortingPlans.parts.EndProductPropertiesEditionPart#setSortingPlanProductButtonMode(ButtonsModeEnum newValue)
	 */
	public void setSortingPlanProductButtonMode(ButtonsModeEnum newValue) {
		sortingPlanProduct.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.misc.projects.SortingPlans.parts.EndProductPropertiesEditionPart#addFilterSortingPlanProduct(ViewerFilter filter)
	 * 
	 */
	public void addFilterToSortingPlanProduct(ViewerFilter filter) {
		sortingPlanProduct.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.misc.projects.SortingPlans.parts.EndProductPropertiesEditionPart#addBusinessFilterSortingPlanProduct(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToSortingPlanProduct(ViewerFilter filter) {
		sortingPlanProduct.addBusinessRuleFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.misc.projects.SortingPlans.parts.EndProductPropertiesEditionPart#getWhichSortingPlans()
	 * 
	 */
	public Boolean getWhichSortingPlans() {
		return Boolean.valueOf(whichSortingPlans.getSelection());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.misc.projects.SortingPlans.parts.EndProductPropertiesEditionPart#setWhichSortingPlans(Boolean newValue)
	 * 
	 */
	public void setWhichSortingPlans(Boolean newValue) {
		if (newValue != null) {
			whichSortingPlans.setSelection(newValue.booleanValue());
		} else {
			whichSortingPlans.setSelection(false);
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(SortingPlansViewsRepository.EndProduct.Properties.whichSortingPlans);
		if (eefElementEditorReadOnlyState && whichSortingPlans.isEnabled()) {
			whichSortingPlans.setEnabled(false);
			whichSortingPlans.setToolTipText(SortingPlansMessages.EndProduct_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !whichSortingPlans.isEnabled()) {
			whichSortingPlans.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.misc.projects.SortingPlans.parts.EndProductPropertiesEditionPart#getScenario()
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
	 * @see com.misc.projects.SortingPlans.parts.EndProductPropertiesEditionPart#initScenario(EObjectFlatComboSettings)
	 */
	public void initScenario(EObjectFlatComboSettings settings) {
		scenario.setInput(settings);
		if (current != null) {
			scenario.setSelection(new StructuredSelection(settings.getValue()));
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(SortingPlansViewsRepository.EndProduct.Properties.scenario);
		if (eefElementEditorReadOnlyState && scenario.isEnabled()) {
			scenario.setEnabled(false);
			scenario.setToolTipText(SortingPlansMessages.EndProduct_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !scenario.isEnabled()) {
			scenario.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.misc.projects.SortingPlans.parts.EndProductPropertiesEditionPart#setScenario(EObject newValue)
	 * 
	 */
	public void setScenario(EObject newValue) {
		if (newValue != null) {
			scenario.setSelection(new StructuredSelection(newValue));
		} else {
			scenario.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(SortingPlansViewsRepository.EndProduct.Properties.scenario);
		if (eefElementEditorReadOnlyState && scenario.isEnabled()) {
			scenario.setEnabled(false);
			scenario.setToolTipText(SortingPlansMessages.EndProduct_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !scenario.isEnabled()) {
			scenario.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.misc.projects.SortingPlans.parts.EndProductPropertiesEditionPart#setScenarioButtonMode(ButtonsModeEnum newValue)
	 */
	public void setScenarioButtonMode(ButtonsModeEnum newValue) {
		scenario.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.misc.projects.SortingPlans.parts.EndProductPropertiesEditionPart#addFilterScenario(ViewerFilter filter)
	 * 
	 */
	public void addFilterToScenario(ViewerFilter filter) {
		scenario.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.misc.projects.SortingPlans.parts.EndProductPropertiesEditionPart#addBusinessFilterScenario(ViewerFilter filter)
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
		return SortingPlansMessages.EndProduct_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
