/**
 * Generated with Acceleo
 */
package com.misc.projects.SortingPlans.parts.forms;

// Start of user code for imports
import com.misc.projects.SortingPlans.parts.SortingPlanProductPropertiesEditionPart;
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

import org.eclipse.emf.eef.runtime.ui.utils.EditingUtils;

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
public class SortingPlanProductPropertiesEditionPartForm extends SectionPropertiesEditingPart implements IFormPropertiesEditionPart, SortingPlanProductPropertiesEditionPart {

	protected EObjectFlatComboViewer fPDSortingLevel;
	protected ReferencesTable sortingPlansProducing;
	protected List<ViewerFilter> sortingPlansProducingBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> sortingPlansProducingFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable sortingPlansAccepting;
	protected List<ViewerFilter> sortingPlansAcceptingBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> sortingPlansAcceptingFilters = new ArrayList<ViewerFilter>();
	protected Text sortingLevelAVCSSk;
	protected Text mechanizationLevelSk;
	protected Text throughputTypeSk;
	protected Text destinationSk;
	protected EObjectFlatComboViewer endProduct;



	/**
	 * For {@link ISection} use only.
	 */
	public SortingPlanProductPropertiesEditionPartForm() { super(); }

	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public SortingPlanProductPropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence sortingPlanProductStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = sortingPlanProductStep.addStep(SortingPlansViewsRepository.SortingPlanProduct.Properties.class);
		propertiesStep.addStep(SortingPlansViewsRepository.SortingPlanProduct.Properties.fPDSortingLevel);
		propertiesStep.addStep(SortingPlansViewsRepository.SortingPlanProduct.Properties.sortingPlansProducing);
		propertiesStep.addStep(SortingPlansViewsRepository.SortingPlanProduct.Properties.sortingPlansAccepting);
		propertiesStep.addStep(SortingPlansViewsRepository.SortingPlanProduct.Properties.sortingLevelAVCSSk);
		propertiesStep.addStep(SortingPlansViewsRepository.SortingPlanProduct.Properties.mechanizationLevelSk);
		propertiesStep.addStep(SortingPlansViewsRepository.SortingPlanProduct.Properties.throughputTypeSk);
		propertiesStep.addStep(SortingPlansViewsRepository.SortingPlanProduct.Properties.destinationSk);
		propertiesStep.addStep(SortingPlansViewsRepository.SortingPlanProduct.Properties.endProduct);
		
		
		composer = new PartComposer(sortingPlanProductStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == SortingPlansViewsRepository.SortingPlanProduct.Properties.class) {
					return createPropertiesGroup(widgetFactory, parent);
				}
				if (key == SortingPlansViewsRepository.SortingPlanProduct.Properties.fPDSortingLevel) {
					return createFPDSortingLevelFlatComboViewer(parent, widgetFactory);
				}
				if (key == SortingPlansViewsRepository.SortingPlanProduct.Properties.sortingPlansProducing) {
					return createSortingPlansProducingReferencesTable(widgetFactory, parent);
				}
				if (key == SortingPlansViewsRepository.SortingPlanProduct.Properties.sortingPlansAccepting) {
					return createSortingPlansAcceptingReferencesTable(widgetFactory, parent);
				}
				if (key == SortingPlansViewsRepository.SortingPlanProduct.Properties.sortingLevelAVCSSk) {
					return createSortingLevelAVCSSkText(widgetFactory, parent);
				}
				if (key == SortingPlansViewsRepository.SortingPlanProduct.Properties.mechanizationLevelSk) {
					return createMechanizationLevelSkText(widgetFactory, parent);
				}
				if (key == SortingPlansViewsRepository.SortingPlanProduct.Properties.throughputTypeSk) {
					return createThroughputTypeSkText(widgetFactory, parent);
				}
				if (key == SortingPlansViewsRepository.SortingPlanProduct.Properties.destinationSk) {
					return createDestinationSkText(widgetFactory, parent);
				}
				if (key == SortingPlansViewsRepository.SortingPlanProduct.Properties.endProduct) {
					return createEndProductFlatComboViewer(parent, widgetFactory);
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
		propertiesSection.setText(SortingPlansMessages.SortingPlanProductPropertiesEditionPart_PropertiesGroupLabel);
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
	protected Composite createFPDSortingLevelFlatComboViewer(Composite parent, FormToolkit widgetFactory) {
		createDescription(parent, SortingPlansViewsRepository.SortingPlanProduct.Properties.fPDSortingLevel, SortingPlansMessages.SortingPlanProductPropertiesEditionPart_FPDSortingLevelLabel);
		fPDSortingLevel = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(SortingPlansViewsRepository.SortingPlanProduct.Properties.fPDSortingLevel, SortingPlansViewsRepository.FORM_KIND));
		widgetFactory.adapt(fPDSortingLevel);
		fPDSortingLevel.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
		GridData fPDSortingLevelData = new GridData(GridData.FILL_HORIZONTAL);
		fPDSortingLevel.setLayoutData(fPDSortingLevelData);
		fPDSortingLevel.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SortingPlanProductPropertiesEditionPartForm.this, SortingPlansViewsRepository.SortingPlanProduct.Properties.fPDSortingLevel, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getFPDSortingLevel()));
			}

		});
		fPDSortingLevel.setID(SortingPlansViewsRepository.SortingPlanProduct.Properties.fPDSortingLevel);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(SortingPlansViewsRepository.SortingPlanProduct.Properties.fPDSortingLevel, SortingPlansViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createFPDSortingLevelFlatComboViewer

		// End of user code
		return parent;
	}

	/**
	 * 
	 */
	protected Composite createSortingPlansProducingReferencesTable(FormToolkit widgetFactory, Composite parent) {
		this.sortingPlansProducing = new ReferencesTable(getDescription(SortingPlansViewsRepository.SortingPlanProduct.Properties.sortingPlansProducing, SortingPlansMessages.SortingPlanProductPropertiesEditionPart_SortingPlansProducingLabel), new ReferencesTableListener	() {
			public void handleAdd() { addSortingPlansProducing(); }
			public void handleEdit(EObject element) { editSortingPlansProducing(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveSortingPlansProducing(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromSortingPlansProducing(element); }
			public void navigateTo(EObject element) { }
		});
		this.sortingPlansProducing.setHelpText(propertiesEditionComponent.getHelpContent(SortingPlansViewsRepository.SortingPlanProduct.Properties.sortingPlansProducing, SortingPlansViewsRepository.FORM_KIND));
		this.sortingPlansProducing.createControls(parent, widgetFactory);
		this.sortingPlansProducing.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SortingPlanProductPropertiesEditionPartForm.this, SortingPlansViewsRepository.SortingPlanProduct.Properties.sortingPlansProducing, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData sortingPlansProducingData = new GridData(GridData.FILL_HORIZONTAL);
		sortingPlansProducingData.horizontalSpan = 3;
		this.sortingPlansProducing.setLayoutData(sortingPlansProducingData);
		this.sortingPlansProducing.disableMove();
		sortingPlansProducing.setID(SortingPlansViewsRepository.SortingPlanProduct.Properties.sortingPlansProducing);
		sortingPlansProducing.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		// Start of user code for createSortingPlansProducingReferencesTable

		// End of user code
		return parent;
	}

	/**
	 * 
	 */
	protected void addSortingPlansProducing() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(sortingPlansProducing.getInput(), sortingPlansProducingFilters, sortingPlansProducingBusinessFilters,
		"SortingPlansProducing", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SortingPlanProductPropertiesEditionPartForm.this, SortingPlansViewsRepository.SortingPlanProduct.Properties.sortingPlansProducing,
						PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				sortingPlansProducing.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveSortingPlansProducing(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SortingPlanProductPropertiesEditionPartForm.this, SortingPlansViewsRepository.SortingPlanProduct.Properties.sortingPlansProducing, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		sortingPlansProducing.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromSortingPlansProducing(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SortingPlanProductPropertiesEditionPartForm.this, SortingPlansViewsRepository.SortingPlanProduct.Properties.sortingPlansProducing, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		sortingPlansProducing.refresh();
	}

	/**
	 * 
	 */
	protected void editSortingPlansProducing(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				sortingPlansProducing.refresh();
			}
		}
	}

	/**
	 * 
	 */
	protected Composite createSortingPlansAcceptingReferencesTable(FormToolkit widgetFactory, Composite parent) {
		this.sortingPlansAccepting = new ReferencesTable(getDescription(SortingPlansViewsRepository.SortingPlanProduct.Properties.sortingPlansAccepting, SortingPlansMessages.SortingPlanProductPropertiesEditionPart_SortingPlansAcceptingLabel), new ReferencesTableListener	() {
			public void handleAdd() { addSortingPlansAccepting(); }
			public void handleEdit(EObject element) { editSortingPlansAccepting(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveSortingPlansAccepting(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromSortingPlansAccepting(element); }
			public void navigateTo(EObject element) { }
		});
		this.sortingPlansAccepting.setHelpText(propertiesEditionComponent.getHelpContent(SortingPlansViewsRepository.SortingPlanProduct.Properties.sortingPlansAccepting, SortingPlansViewsRepository.FORM_KIND));
		this.sortingPlansAccepting.createControls(parent, widgetFactory);
		this.sortingPlansAccepting.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SortingPlanProductPropertiesEditionPartForm.this, SortingPlansViewsRepository.SortingPlanProduct.Properties.sortingPlansAccepting, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData sortingPlansAcceptingData = new GridData(GridData.FILL_HORIZONTAL);
		sortingPlansAcceptingData.horizontalSpan = 3;
		this.sortingPlansAccepting.setLayoutData(sortingPlansAcceptingData);
		this.sortingPlansAccepting.disableMove();
		sortingPlansAccepting.setID(SortingPlansViewsRepository.SortingPlanProduct.Properties.sortingPlansAccepting);
		sortingPlansAccepting.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		// Start of user code for createSortingPlansAcceptingReferencesTable

		// End of user code
		return parent;
	}

	/**
	 * 
	 */
	protected void addSortingPlansAccepting() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(sortingPlansAccepting.getInput(), sortingPlansAcceptingFilters, sortingPlansAcceptingBusinessFilters,
		"SortingPlansAccepting", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SortingPlanProductPropertiesEditionPartForm.this, SortingPlansViewsRepository.SortingPlanProduct.Properties.sortingPlansAccepting,
						PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				sortingPlansAccepting.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveSortingPlansAccepting(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SortingPlanProductPropertiesEditionPartForm.this, SortingPlansViewsRepository.SortingPlanProduct.Properties.sortingPlansAccepting, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		sortingPlansAccepting.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromSortingPlansAccepting(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SortingPlanProductPropertiesEditionPartForm.this, SortingPlansViewsRepository.SortingPlanProduct.Properties.sortingPlansAccepting, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		sortingPlansAccepting.refresh();
	}

	/**
	 * 
	 */
	protected void editSortingPlansAccepting(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				sortingPlansAccepting.refresh();
			}
		}
	}

	
	protected Composite createSortingLevelAVCSSkText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, SortingPlansViewsRepository.SortingPlanProduct.Properties.sortingLevelAVCSSk, SortingPlansMessages.SortingPlanProductPropertiesEditionPart_SortingLevelAVCSSkLabel);
		sortingLevelAVCSSk = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		sortingLevelAVCSSk.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData sortingLevelAVCSSkData = new GridData(GridData.FILL_HORIZONTAL);
		sortingLevelAVCSSk.setLayoutData(sortingLevelAVCSSkData);
		sortingLevelAVCSSk.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							SortingPlanProductPropertiesEditionPartForm.this,
							SortingPlansViewsRepository.SortingPlanProduct.Properties.sortingLevelAVCSSk,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, sortingLevelAVCSSk.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									SortingPlanProductPropertiesEditionPartForm.this,
									SortingPlansViewsRepository.SortingPlanProduct.Properties.sortingLevelAVCSSk,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, sortingLevelAVCSSk.getText()));
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
									SortingPlanProductPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		sortingLevelAVCSSk.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SortingPlanProductPropertiesEditionPartForm.this, SortingPlansViewsRepository.SortingPlanProduct.Properties.sortingLevelAVCSSk, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, sortingLevelAVCSSk.getText()));
				}
			}
		});
		EditingUtils.setID(sortingLevelAVCSSk, SortingPlansViewsRepository.SortingPlanProduct.Properties.sortingLevelAVCSSk);
		EditingUtils.setEEFtype(sortingLevelAVCSSk, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(SortingPlansViewsRepository.SortingPlanProduct.Properties.sortingLevelAVCSSk, SortingPlansViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createSortingLevelAVCSSkText

		// End of user code
		return parent;
	}

	
	protected Composite createMechanizationLevelSkText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, SortingPlansViewsRepository.SortingPlanProduct.Properties.mechanizationLevelSk, SortingPlansMessages.SortingPlanProductPropertiesEditionPart_MechanizationLevelSkLabel);
		mechanizationLevelSk = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		mechanizationLevelSk.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData mechanizationLevelSkData = new GridData(GridData.FILL_HORIZONTAL);
		mechanizationLevelSk.setLayoutData(mechanizationLevelSkData);
		mechanizationLevelSk.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							SortingPlanProductPropertiesEditionPartForm.this,
							SortingPlansViewsRepository.SortingPlanProduct.Properties.mechanizationLevelSk,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, mechanizationLevelSk.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									SortingPlanProductPropertiesEditionPartForm.this,
									SortingPlansViewsRepository.SortingPlanProduct.Properties.mechanizationLevelSk,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, mechanizationLevelSk.getText()));
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
									SortingPlanProductPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		mechanizationLevelSk.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SortingPlanProductPropertiesEditionPartForm.this, SortingPlansViewsRepository.SortingPlanProduct.Properties.mechanizationLevelSk, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, mechanizationLevelSk.getText()));
				}
			}
		});
		EditingUtils.setID(mechanizationLevelSk, SortingPlansViewsRepository.SortingPlanProduct.Properties.mechanizationLevelSk);
		EditingUtils.setEEFtype(mechanizationLevelSk, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(SortingPlansViewsRepository.SortingPlanProduct.Properties.mechanizationLevelSk, SortingPlansViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createMechanizationLevelSkText

		// End of user code
		return parent;
	}

	
	protected Composite createThroughputTypeSkText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, SortingPlansViewsRepository.SortingPlanProduct.Properties.throughputTypeSk, SortingPlansMessages.SortingPlanProductPropertiesEditionPart_ThroughputTypeSkLabel);
		throughputTypeSk = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		throughputTypeSk.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData throughputTypeSkData = new GridData(GridData.FILL_HORIZONTAL);
		throughputTypeSk.setLayoutData(throughputTypeSkData);
		throughputTypeSk.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							SortingPlanProductPropertiesEditionPartForm.this,
							SortingPlansViewsRepository.SortingPlanProduct.Properties.throughputTypeSk,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, throughputTypeSk.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									SortingPlanProductPropertiesEditionPartForm.this,
									SortingPlansViewsRepository.SortingPlanProduct.Properties.throughputTypeSk,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, throughputTypeSk.getText()));
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
									SortingPlanProductPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		throughputTypeSk.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SortingPlanProductPropertiesEditionPartForm.this, SortingPlansViewsRepository.SortingPlanProduct.Properties.throughputTypeSk, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, throughputTypeSk.getText()));
				}
			}
		});
		EditingUtils.setID(throughputTypeSk, SortingPlansViewsRepository.SortingPlanProduct.Properties.throughputTypeSk);
		EditingUtils.setEEFtype(throughputTypeSk, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(SortingPlansViewsRepository.SortingPlanProduct.Properties.throughputTypeSk, SortingPlansViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createThroughputTypeSkText

		// End of user code
		return parent;
	}

	
	protected Composite createDestinationSkText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, SortingPlansViewsRepository.SortingPlanProduct.Properties.destinationSk, SortingPlansMessages.SortingPlanProductPropertiesEditionPart_DestinationSkLabel);
		destinationSk = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		destinationSk.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData destinationSkData = new GridData(GridData.FILL_HORIZONTAL);
		destinationSk.setLayoutData(destinationSkData);
		destinationSk.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							SortingPlanProductPropertiesEditionPartForm.this,
							SortingPlansViewsRepository.SortingPlanProduct.Properties.destinationSk,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, destinationSk.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									SortingPlanProductPropertiesEditionPartForm.this,
									SortingPlansViewsRepository.SortingPlanProduct.Properties.destinationSk,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, destinationSk.getText()));
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
									SortingPlanProductPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		destinationSk.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SortingPlanProductPropertiesEditionPartForm.this, SortingPlansViewsRepository.SortingPlanProduct.Properties.destinationSk, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, destinationSk.getText()));
				}
			}
		});
		EditingUtils.setID(destinationSk, SortingPlansViewsRepository.SortingPlanProduct.Properties.destinationSk);
		EditingUtils.setEEFtype(destinationSk, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(SortingPlansViewsRepository.SortingPlanProduct.Properties.destinationSk, SortingPlansViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createDestinationSkText

		// End of user code
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * @param widgetFactory factory to use to instanciante widget of the form
	 * 
	 */
	protected Composite createEndProductFlatComboViewer(Composite parent, FormToolkit widgetFactory) {
		createDescription(parent, SortingPlansViewsRepository.SortingPlanProduct.Properties.endProduct, SortingPlansMessages.SortingPlanProductPropertiesEditionPart_EndProductLabel);
		endProduct = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(SortingPlansViewsRepository.SortingPlanProduct.Properties.endProduct, SortingPlansViewsRepository.FORM_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SortingPlanProductPropertiesEditionPartForm.this, SortingPlansViewsRepository.SortingPlanProduct.Properties.endProduct, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getEndProduct()));
			}

		});
		endProduct.setID(SortingPlansViewsRepository.SortingPlanProduct.Properties.endProduct);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(SortingPlansViewsRepository.SortingPlanProduct.Properties.endProduct, SortingPlansViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createEndProductFlatComboViewer

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
	 * @see com.misc.projects.SortingPlans.parts.SortingPlanProductPropertiesEditionPart#getFPDSortingLevel()
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
	 * @see com.misc.projects.SortingPlans.parts.SortingPlanProductPropertiesEditionPart#initFPDSortingLevel(EObjectFlatComboSettings)
	 */
	public void initFPDSortingLevel(EObjectFlatComboSettings settings) {
		fPDSortingLevel.setInput(settings);
		if (current != null) {
			fPDSortingLevel.setSelection(new StructuredSelection(settings.getValue()));
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(SortingPlansViewsRepository.SortingPlanProduct.Properties.fPDSortingLevel);
		if (eefElementEditorReadOnlyState && fPDSortingLevel.isEnabled()) {
			fPDSortingLevel.setEnabled(false);
			fPDSortingLevel.setToolTipText(SortingPlansMessages.SortingPlanProduct_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !fPDSortingLevel.isEnabled()) {
			fPDSortingLevel.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.misc.projects.SortingPlans.parts.SortingPlanProductPropertiesEditionPart#setFPDSortingLevel(EObject newValue)
	 * 
	 */
	public void setFPDSortingLevel(EObject newValue) {
		if (newValue != null) {
			fPDSortingLevel.setSelection(new StructuredSelection(newValue));
		} else {
			fPDSortingLevel.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(SortingPlansViewsRepository.SortingPlanProduct.Properties.fPDSortingLevel);
		if (eefElementEditorReadOnlyState && fPDSortingLevel.isEnabled()) {
			fPDSortingLevel.setEnabled(false);
			fPDSortingLevel.setToolTipText(SortingPlansMessages.SortingPlanProduct_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !fPDSortingLevel.isEnabled()) {
			fPDSortingLevel.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.misc.projects.SortingPlans.parts.SortingPlanProductPropertiesEditionPart#setFPDSortingLevelButtonMode(ButtonsModeEnum newValue)
	 */
	public void setFPDSortingLevelButtonMode(ButtonsModeEnum newValue) {
		fPDSortingLevel.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.misc.projects.SortingPlans.parts.SortingPlanProductPropertiesEditionPart#addFilterFPDSortingLevel(ViewerFilter filter)
	 * 
	 */
	public void addFilterToFPDSortingLevel(ViewerFilter filter) {
		fPDSortingLevel.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.misc.projects.SortingPlans.parts.SortingPlanProductPropertiesEditionPart#addBusinessFilterFPDSortingLevel(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToFPDSortingLevel(ViewerFilter filter) {
		fPDSortingLevel.addBusinessRuleFilter(filter);
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see com.misc.projects.SortingPlans.parts.SortingPlanProductPropertiesEditionPart#initSortingPlansProducing(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initSortingPlansProducing(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		sortingPlansProducing.setContentProvider(contentProvider);
		sortingPlansProducing.setInput(settings);
		boolean eefElementEditorReadOnlyState = isReadOnly(SortingPlansViewsRepository.SortingPlanProduct.Properties.sortingPlansProducing);
		if (eefElementEditorReadOnlyState && sortingPlansProducing.getTable().isEnabled()) {
			sortingPlansProducing.setEnabled(false);
			sortingPlansProducing.setToolTipText(SortingPlansMessages.SortingPlanProduct_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !sortingPlansProducing.getTable().isEnabled()) {
			sortingPlansProducing.setEnabled(true);
		}
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.misc.projects.SortingPlans.parts.SortingPlanProductPropertiesEditionPart#updateSortingPlansProducing()
	 * 
	 */
	public void updateSortingPlansProducing() {
	sortingPlansProducing.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.misc.projects.SortingPlans.parts.SortingPlanProductPropertiesEditionPart#addFilterSortingPlansProducing(ViewerFilter filter)
	 * 
	 */
	public void addFilterToSortingPlansProducing(ViewerFilter filter) {
		sortingPlansProducingFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.misc.projects.SortingPlans.parts.SortingPlanProductPropertiesEditionPart#addBusinessFilterSortingPlansProducing(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToSortingPlansProducing(ViewerFilter filter) {
		sortingPlansProducingBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.misc.projects.SortingPlans.parts.SortingPlanProductPropertiesEditionPart#isContainedInSortingPlansProducingTable(EObject element)
	 * 
	 */
	public boolean isContainedInSortingPlansProducingTable(EObject element) {
		return ((ReferencesTableSettings)sortingPlansProducing.getInput()).contains(element);
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see com.misc.projects.SortingPlans.parts.SortingPlanProductPropertiesEditionPart#initSortingPlansAccepting(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initSortingPlansAccepting(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		sortingPlansAccepting.setContentProvider(contentProvider);
		sortingPlansAccepting.setInput(settings);
		boolean eefElementEditorReadOnlyState = isReadOnly(SortingPlansViewsRepository.SortingPlanProduct.Properties.sortingPlansAccepting);
		if (eefElementEditorReadOnlyState && sortingPlansAccepting.getTable().isEnabled()) {
			sortingPlansAccepting.setEnabled(false);
			sortingPlansAccepting.setToolTipText(SortingPlansMessages.SortingPlanProduct_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !sortingPlansAccepting.getTable().isEnabled()) {
			sortingPlansAccepting.setEnabled(true);
		}
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.misc.projects.SortingPlans.parts.SortingPlanProductPropertiesEditionPart#updateSortingPlansAccepting()
	 * 
	 */
	public void updateSortingPlansAccepting() {
	sortingPlansAccepting.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.misc.projects.SortingPlans.parts.SortingPlanProductPropertiesEditionPart#addFilterSortingPlansAccepting(ViewerFilter filter)
	 * 
	 */
	public void addFilterToSortingPlansAccepting(ViewerFilter filter) {
		sortingPlansAcceptingFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.misc.projects.SortingPlans.parts.SortingPlanProductPropertiesEditionPart#addBusinessFilterSortingPlansAccepting(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToSortingPlansAccepting(ViewerFilter filter) {
		sortingPlansAcceptingBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.misc.projects.SortingPlans.parts.SortingPlanProductPropertiesEditionPart#isContainedInSortingPlansAcceptingTable(EObject element)
	 * 
	 */
	public boolean isContainedInSortingPlansAcceptingTable(EObject element) {
		return ((ReferencesTableSettings)sortingPlansAccepting.getInput()).contains(element);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.misc.projects.SortingPlans.parts.SortingPlanProductPropertiesEditionPart#getSortingLevelAVCSSk()
	 * 
	 */
	public String getSortingLevelAVCSSk() {
		return sortingLevelAVCSSk.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.misc.projects.SortingPlans.parts.SortingPlanProductPropertiesEditionPart#setSortingLevelAVCSSk(String newValue)
	 * 
	 */
	public void setSortingLevelAVCSSk(String newValue) {
		if (newValue != null) {
			sortingLevelAVCSSk.setText(newValue);
		} else {
			sortingLevelAVCSSk.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(SortingPlansViewsRepository.SortingPlanProduct.Properties.sortingLevelAVCSSk);
		if (eefElementEditorReadOnlyState && sortingLevelAVCSSk.isEnabled()) {
			sortingLevelAVCSSk.setEnabled(false);
			sortingLevelAVCSSk.setToolTipText(SortingPlansMessages.SortingPlanProduct_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !sortingLevelAVCSSk.isEnabled()) {
			sortingLevelAVCSSk.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.misc.projects.SortingPlans.parts.SortingPlanProductPropertiesEditionPart#getMechanizationLevelSk()
	 * 
	 */
	public String getMechanizationLevelSk() {
		return mechanizationLevelSk.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.misc.projects.SortingPlans.parts.SortingPlanProductPropertiesEditionPart#setMechanizationLevelSk(String newValue)
	 * 
	 */
	public void setMechanizationLevelSk(String newValue) {
		if (newValue != null) {
			mechanizationLevelSk.setText(newValue);
		} else {
			mechanizationLevelSk.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(SortingPlansViewsRepository.SortingPlanProduct.Properties.mechanizationLevelSk);
		if (eefElementEditorReadOnlyState && mechanizationLevelSk.isEnabled()) {
			mechanizationLevelSk.setEnabled(false);
			mechanizationLevelSk.setToolTipText(SortingPlansMessages.SortingPlanProduct_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !mechanizationLevelSk.isEnabled()) {
			mechanizationLevelSk.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.misc.projects.SortingPlans.parts.SortingPlanProductPropertiesEditionPart#getThroughputTypeSk()
	 * 
	 */
	public String getThroughputTypeSk() {
		return throughputTypeSk.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.misc.projects.SortingPlans.parts.SortingPlanProductPropertiesEditionPart#setThroughputTypeSk(String newValue)
	 * 
	 */
	public void setThroughputTypeSk(String newValue) {
		if (newValue != null) {
			throughputTypeSk.setText(newValue);
		} else {
			throughputTypeSk.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(SortingPlansViewsRepository.SortingPlanProduct.Properties.throughputTypeSk);
		if (eefElementEditorReadOnlyState && throughputTypeSk.isEnabled()) {
			throughputTypeSk.setEnabled(false);
			throughputTypeSk.setToolTipText(SortingPlansMessages.SortingPlanProduct_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !throughputTypeSk.isEnabled()) {
			throughputTypeSk.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.misc.projects.SortingPlans.parts.SortingPlanProductPropertiesEditionPart#getDestinationSk()
	 * 
	 */
	public String getDestinationSk() {
		return destinationSk.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.misc.projects.SortingPlans.parts.SortingPlanProductPropertiesEditionPart#setDestinationSk(String newValue)
	 * 
	 */
	public void setDestinationSk(String newValue) {
		if (newValue != null) {
			destinationSk.setText(newValue);
		} else {
			destinationSk.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(SortingPlansViewsRepository.SortingPlanProduct.Properties.destinationSk);
		if (eefElementEditorReadOnlyState && destinationSk.isEnabled()) {
			destinationSk.setEnabled(false);
			destinationSk.setToolTipText(SortingPlansMessages.SortingPlanProduct_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !destinationSk.isEnabled()) {
			destinationSk.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.misc.projects.SortingPlans.parts.SortingPlanProductPropertiesEditionPart#getEndProduct()
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
	 * @see com.misc.projects.SortingPlans.parts.SortingPlanProductPropertiesEditionPart#initEndProduct(EObjectFlatComboSettings)
	 */
	public void initEndProduct(EObjectFlatComboSettings settings) {
		endProduct.setInput(settings);
		if (current != null) {
			endProduct.setSelection(new StructuredSelection(settings.getValue()));
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(SortingPlansViewsRepository.SortingPlanProduct.Properties.endProduct);
		if (eefElementEditorReadOnlyState && endProduct.isEnabled()) {
			endProduct.setEnabled(false);
			endProduct.setToolTipText(SortingPlansMessages.SortingPlanProduct_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !endProduct.isEnabled()) {
			endProduct.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.misc.projects.SortingPlans.parts.SortingPlanProductPropertiesEditionPart#setEndProduct(EObject newValue)
	 * 
	 */
	public void setEndProduct(EObject newValue) {
		if (newValue != null) {
			endProduct.setSelection(new StructuredSelection(newValue));
		} else {
			endProduct.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(SortingPlansViewsRepository.SortingPlanProduct.Properties.endProduct);
		if (eefElementEditorReadOnlyState && endProduct.isEnabled()) {
			endProduct.setEnabled(false);
			endProduct.setToolTipText(SortingPlansMessages.SortingPlanProduct_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !endProduct.isEnabled()) {
			endProduct.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.misc.projects.SortingPlans.parts.SortingPlanProductPropertiesEditionPart#setEndProductButtonMode(ButtonsModeEnum newValue)
	 */
	public void setEndProductButtonMode(ButtonsModeEnum newValue) {
		endProduct.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.misc.projects.SortingPlans.parts.SortingPlanProductPropertiesEditionPart#addFilterEndProduct(ViewerFilter filter)
	 * 
	 */
	public void addFilterToEndProduct(ViewerFilter filter) {
		endProduct.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.misc.projects.SortingPlans.parts.SortingPlanProductPropertiesEditionPart#addBusinessFilterEndProduct(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToEndProduct(ViewerFilter filter) {
		endProduct.addBusinessRuleFilter(filter);
	}






	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return SortingPlansMessages.SortingPlanProduct_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
