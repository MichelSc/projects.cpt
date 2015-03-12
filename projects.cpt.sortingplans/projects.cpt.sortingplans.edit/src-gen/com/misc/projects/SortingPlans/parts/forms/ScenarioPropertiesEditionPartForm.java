/**
 * Generated with Acceleo
 */
package com.misc.projects.SortingPlans.parts.forms;

// Start of user code for imports
import com.misc.projects.SortingPlans.parts.ScenarioPropertiesEditionPart;
import com.misc.projects.SortingPlans.parts.SortingPlansViewsRepository;

import com.misc.projects.SortingPlans.providers.SortingPlansMessages;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.ecore.EObject;

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

import org.eclipse.emf.eef.runtime.ui.utils.EditingUtils;

import org.eclipse.emf.eef.runtime.ui.widgets.FormUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable;

import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable.ReferencesTableListener;

import org.eclipse.emf.eef.runtime.ui.widgets.TabElementTreeSelectionDialog;

import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableContentProvider;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;

import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.ViewerFilter;

import org.eclipse.swt.SWT;

import org.eclipse.swt.events.FocusAdapter;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.KeyAdapter;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;

import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;

import org.eclipse.ui.forms.widgets.Form;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;
import org.eclipse.ui.forms.widgets.Section;

// End of user code

/**
 * 
 * 
 */
public class ScenarioPropertiesEditionPartForm extends SectionPropertiesEditingPart implements IFormPropertiesEditionPart, ScenarioPropertiesEditionPart {

	protected Text name;
	protected ReferencesTable sortingLevelsWithDestination;
	protected List<ViewerFilter> sortingLevelsWithDestinationBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> sortingLevelsWithDestinationFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable selectedSortingPlans;
	protected List<ViewerFilter> selectedSortingPlansBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> selectedSortingPlansFilters = new ArrayList<ViewerFilter>();



	/**
	 * For {@link ISection} use only.
	 */
	public ScenarioPropertiesEditionPartForm() { super(); }

	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public ScenarioPropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence scenarioStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = scenarioStep.addStep(SortingPlansViewsRepository.Scenario.Properties.class);
		propertiesStep.addStep(SortingPlansViewsRepository.Scenario.Properties.name);
		propertiesStep.addStep(SortingPlansViewsRepository.Scenario.Properties.sortingLevelsWithDestination);
		propertiesStep.addStep(SortingPlansViewsRepository.Scenario.Properties.selectedSortingPlans);
		
		
		composer = new PartComposer(scenarioStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == SortingPlansViewsRepository.Scenario.Properties.class) {
					return createPropertiesGroup(widgetFactory, parent);
				}
				if (key == SortingPlansViewsRepository.Scenario.Properties.name) {
					return createNameText(widgetFactory, parent);
				}
				if (key == SortingPlansViewsRepository.Scenario.Properties.sortingLevelsWithDestination) {
					return createSortingLevelsWithDestinationReferencesTable(widgetFactory, parent);
				}
				if (key == SortingPlansViewsRepository.Scenario.Properties.selectedSortingPlans) {
					return createSelectedSortingPlansReferencesTable(widgetFactory, parent);
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
		propertiesSection.setText(SortingPlansMessages.ScenarioPropertiesEditionPart_PropertiesGroupLabel);
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

	
	protected Composite createNameText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, SortingPlansViewsRepository.Scenario.Properties.name, SortingPlansMessages.ScenarioPropertiesEditionPart_NameLabel);
		name = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		name.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData nameData = new GridData(GridData.FILL_HORIZONTAL);
		name.setLayoutData(nameData);
		name.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							ScenarioPropertiesEditionPartForm.this,
							SortingPlansViewsRepository.Scenario.Properties.name,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									ScenarioPropertiesEditionPartForm.this,
									SortingPlansViewsRepository.Scenario.Properties.name,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, name.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									ScenarioPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		name.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ScenarioPropertiesEditionPartForm.this, SortingPlansViewsRepository.Scenario.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
				}
			}
		});
		EditingUtils.setID(name, SortingPlansViewsRepository.Scenario.Properties.name);
		EditingUtils.setEEFtype(name, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(SortingPlansViewsRepository.Scenario.Properties.name, SortingPlansViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createNameText

		// End of user code
		return parent;
	}

	/**
	 * 
	 */
	protected Composite createSortingLevelsWithDestinationReferencesTable(FormToolkit widgetFactory, Composite parent) {
		this.sortingLevelsWithDestination = new ReferencesTable(getDescription(SortingPlansViewsRepository.Scenario.Properties.sortingLevelsWithDestination, SortingPlansMessages.ScenarioPropertiesEditionPart_SortingLevelsWithDestinationLabel), new ReferencesTableListener	() {
			public void handleAdd() { addSortingLevelsWithDestination(); }
			public void handleEdit(EObject element) { editSortingLevelsWithDestination(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveSortingLevelsWithDestination(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromSortingLevelsWithDestination(element); }
			public void navigateTo(EObject element) { }
		});
		this.sortingLevelsWithDestination.setHelpText(propertiesEditionComponent.getHelpContent(SortingPlansViewsRepository.Scenario.Properties.sortingLevelsWithDestination, SortingPlansViewsRepository.FORM_KIND));
		this.sortingLevelsWithDestination.createControls(parent, widgetFactory);
		this.sortingLevelsWithDestination.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ScenarioPropertiesEditionPartForm.this, SortingPlansViewsRepository.Scenario.Properties.sortingLevelsWithDestination, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData sortingLevelsWithDestinationData = new GridData(GridData.FILL_HORIZONTAL);
		sortingLevelsWithDestinationData.horizontalSpan = 3;
		this.sortingLevelsWithDestination.setLayoutData(sortingLevelsWithDestinationData);
		this.sortingLevelsWithDestination.disableMove();
		sortingLevelsWithDestination.setID(SortingPlansViewsRepository.Scenario.Properties.sortingLevelsWithDestination);
		sortingLevelsWithDestination.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		// Start of user code for createSortingLevelsWithDestinationReferencesTable

		// End of user code
		return parent;
	}

	/**
	 * 
	 */
	protected void addSortingLevelsWithDestination() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(sortingLevelsWithDestination.getInput(), sortingLevelsWithDestinationFilters, sortingLevelsWithDestinationBusinessFilters,
		"SortingLevelsWithDestination", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ScenarioPropertiesEditionPartForm.this, SortingPlansViewsRepository.Scenario.Properties.sortingLevelsWithDestination,
						PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				sortingLevelsWithDestination.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveSortingLevelsWithDestination(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ScenarioPropertiesEditionPartForm.this, SortingPlansViewsRepository.Scenario.Properties.sortingLevelsWithDestination, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		sortingLevelsWithDestination.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromSortingLevelsWithDestination(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ScenarioPropertiesEditionPartForm.this, SortingPlansViewsRepository.Scenario.Properties.sortingLevelsWithDestination, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		sortingLevelsWithDestination.refresh();
	}

	/**
	 * 
	 */
	protected void editSortingLevelsWithDestination(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				sortingLevelsWithDestination.refresh();
			}
		}
	}

	/**
	 * 
	 */
	protected Composite createSelectedSortingPlansReferencesTable(FormToolkit widgetFactory, Composite parent) {
		this.selectedSortingPlans = new ReferencesTable(getDescription(SortingPlansViewsRepository.Scenario.Properties.selectedSortingPlans, SortingPlansMessages.ScenarioPropertiesEditionPart_SelectedSortingPlansLabel), new ReferencesTableListener	() {
			public void handleAdd() { addSelectedSortingPlans(); }
			public void handleEdit(EObject element) { editSelectedSortingPlans(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveSelectedSortingPlans(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromSelectedSortingPlans(element); }
			public void navigateTo(EObject element) { }
		});
		this.selectedSortingPlans.setHelpText(propertiesEditionComponent.getHelpContent(SortingPlansViewsRepository.Scenario.Properties.selectedSortingPlans, SortingPlansViewsRepository.FORM_KIND));
		this.selectedSortingPlans.createControls(parent, widgetFactory);
		this.selectedSortingPlans.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ScenarioPropertiesEditionPartForm.this, SortingPlansViewsRepository.Scenario.Properties.selectedSortingPlans, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData selectedSortingPlansData = new GridData(GridData.FILL_HORIZONTAL);
		selectedSortingPlansData.horizontalSpan = 3;
		this.selectedSortingPlans.setLayoutData(selectedSortingPlansData);
		this.selectedSortingPlans.disableMove();
		selectedSortingPlans.setID(SortingPlansViewsRepository.Scenario.Properties.selectedSortingPlans);
		selectedSortingPlans.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		// Start of user code for createSelectedSortingPlansReferencesTable

		// End of user code
		return parent;
	}

	/**
	 * 
	 */
	protected void addSelectedSortingPlans() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(selectedSortingPlans.getInput(), selectedSortingPlansFilters, selectedSortingPlansBusinessFilters,
		"SelectedSortingPlans", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ScenarioPropertiesEditionPartForm.this, SortingPlansViewsRepository.Scenario.Properties.selectedSortingPlans,
						PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				selectedSortingPlans.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveSelectedSortingPlans(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ScenarioPropertiesEditionPartForm.this, SortingPlansViewsRepository.Scenario.Properties.selectedSortingPlans, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		selectedSortingPlans.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromSelectedSortingPlans(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ScenarioPropertiesEditionPartForm.this, SortingPlansViewsRepository.Scenario.Properties.selectedSortingPlans, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		selectedSortingPlans.refresh();
	}

	/**
	 * 
	 */
	protected void editSelectedSortingPlans(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				selectedSortingPlans.refresh();
			}
		}
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
	 * @see com.misc.projects.SortingPlans.parts.ScenarioPropertiesEditionPart#getName()
	 * 
	 */
	public String getName() {
		return name.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.misc.projects.SortingPlans.parts.ScenarioPropertiesEditionPart#setName(String newValue)
	 * 
	 */
	public void setName(String newValue) {
		if (newValue != null) {
			name.setText(newValue);
		} else {
			name.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(SortingPlansViewsRepository.Scenario.Properties.name);
		if (eefElementEditorReadOnlyState && name.isEnabled()) {
			name.setEnabled(false);
			name.setToolTipText(SortingPlansMessages.Scenario_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !name.isEnabled()) {
			name.setEnabled(true);
		}	
		
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see com.misc.projects.SortingPlans.parts.ScenarioPropertiesEditionPart#initSortingLevelsWithDestination(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initSortingLevelsWithDestination(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		sortingLevelsWithDestination.setContentProvider(contentProvider);
		sortingLevelsWithDestination.setInput(settings);
		boolean eefElementEditorReadOnlyState = isReadOnly(SortingPlansViewsRepository.Scenario.Properties.sortingLevelsWithDestination);
		if (eefElementEditorReadOnlyState && sortingLevelsWithDestination.getTable().isEnabled()) {
			sortingLevelsWithDestination.setEnabled(false);
			sortingLevelsWithDestination.setToolTipText(SortingPlansMessages.Scenario_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !sortingLevelsWithDestination.getTable().isEnabled()) {
			sortingLevelsWithDestination.setEnabled(true);
		}
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.misc.projects.SortingPlans.parts.ScenarioPropertiesEditionPart#updateSortingLevelsWithDestination()
	 * 
	 */
	public void updateSortingLevelsWithDestination() {
	sortingLevelsWithDestination.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.misc.projects.SortingPlans.parts.ScenarioPropertiesEditionPart#addFilterSortingLevelsWithDestination(ViewerFilter filter)
	 * 
	 */
	public void addFilterToSortingLevelsWithDestination(ViewerFilter filter) {
		sortingLevelsWithDestinationFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.misc.projects.SortingPlans.parts.ScenarioPropertiesEditionPart#addBusinessFilterSortingLevelsWithDestination(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToSortingLevelsWithDestination(ViewerFilter filter) {
		sortingLevelsWithDestinationBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.misc.projects.SortingPlans.parts.ScenarioPropertiesEditionPart#isContainedInSortingLevelsWithDestinationTable(EObject element)
	 * 
	 */
	public boolean isContainedInSortingLevelsWithDestinationTable(EObject element) {
		return ((ReferencesTableSettings)sortingLevelsWithDestination.getInput()).contains(element);
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see com.misc.projects.SortingPlans.parts.ScenarioPropertiesEditionPart#initSelectedSortingPlans(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initSelectedSortingPlans(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		selectedSortingPlans.setContentProvider(contentProvider);
		selectedSortingPlans.setInput(settings);
		boolean eefElementEditorReadOnlyState = isReadOnly(SortingPlansViewsRepository.Scenario.Properties.selectedSortingPlans);
		if (eefElementEditorReadOnlyState && selectedSortingPlans.getTable().isEnabled()) {
			selectedSortingPlans.setEnabled(false);
			selectedSortingPlans.setToolTipText(SortingPlansMessages.Scenario_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !selectedSortingPlans.getTable().isEnabled()) {
			selectedSortingPlans.setEnabled(true);
		}
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.misc.projects.SortingPlans.parts.ScenarioPropertiesEditionPart#updateSelectedSortingPlans()
	 * 
	 */
	public void updateSelectedSortingPlans() {
	selectedSortingPlans.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.misc.projects.SortingPlans.parts.ScenarioPropertiesEditionPart#addFilterSelectedSortingPlans(ViewerFilter filter)
	 * 
	 */
	public void addFilterToSelectedSortingPlans(ViewerFilter filter) {
		selectedSortingPlansFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.misc.projects.SortingPlans.parts.ScenarioPropertiesEditionPart#addBusinessFilterSelectedSortingPlans(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToSelectedSortingPlans(ViewerFilter filter) {
		selectedSortingPlansBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.misc.projects.SortingPlans.parts.ScenarioPropertiesEditionPart#isContainedInSelectedSortingPlansTable(EObject element)
	 * 
	 */
	public boolean isContainedInSelectedSortingPlansTable(EObject element) {
		return ((ReferencesTableSettings)selectedSortingPlans.getInput()).contains(element);
	}






	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return SortingPlansMessages.Scenario_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
