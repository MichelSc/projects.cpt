/**
 * Generated with Acceleo
 */
package com.misc.projects.SortingPlans.components;

// Start of user code for imports
import com.misc.projects.CptDatasetLoad.CptDatasetLoadPackage;
import com.misc.projects.CptDatasetLoad.SortingLevelRow;
import com.misc.projects.CptDatasetLoad.SortingPlanRow;

import com.misc.projects.SortingPlans.Scenario;
import com.misc.projects.SortingPlans.cptspPackage;

import com.misc.projects.SortingPlans.parts.ScenarioPropertiesEditionPart;
import com.misc.projects.SortingPlans.parts.SortingPlansViewsRepository;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.WrappedException;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.resource.ResourceSet;

import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.util.EcoreUtil;

import org.eclipse.emf.eef.runtime.api.notify.EStructuralFeatureNotificationFilter;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.api.notify.NotificationFilter;

import org.eclipse.emf.eef.runtime.context.PropertiesEditingContext;

import org.eclipse.emf.eef.runtime.impl.components.SinglePartPropertiesEditingComponent;

import org.eclipse.emf.eef.runtime.impl.filters.EObjectFilter;

import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;

import org.eclipse.emf.eef.runtime.impl.utils.EEFConverterUtil;

import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;


// End of user code

/**
 * 
 * 
 */
public class ScenarioPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	/**
	 * Settings for SortingLevelsWithDestination ReferencesTable
	 */
	private ReferencesTableSettings sortingLevelsWithDestinationSettings;
	
	/**
	 * Settings for SelectedSortingPlans ReferencesTable
	 */
	private ReferencesTableSettings selectedSortingPlansSettings;
	
	
	/**
	 * Default constructor
	 * 
	 */
	public ScenarioPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject scenario, String editing_mode) {
		super(editingContext, scenario, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = SortingPlansViewsRepository.class;
		partKey = SortingPlansViewsRepository.Scenario.class;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent#initPart(java.lang.Object, int, org.eclipse.emf.ecore.EObject, 
	 *      org.eclipse.emf.ecore.resource.ResourceSet)
	 * 
	 */
	public void initPart(Object key, int kind, EObject elt, ResourceSet allResource) {
		setInitializing(true);
		if (editingPart != null && key == partKey) {
			editingPart.setContext(elt, allResource);
			
			final Scenario scenario = (Scenario)elt;
			final ScenarioPropertiesEditionPart basePart = (ScenarioPropertiesEditionPart)editingPart;
			// init values
			if (isAccessible(SortingPlansViewsRepository.Scenario.Properties.name))
				basePart.setName(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, scenario.getName()));
			
			if (isAccessible(SortingPlansViewsRepository.Scenario.Properties.sortingLevelsWithDestination)) {
				sortingLevelsWithDestinationSettings = new ReferencesTableSettings(scenario, cptspPackage.eINSTANCE.getScenario_SortingLevelsWithDestination());
				basePart.initSortingLevelsWithDestination(sortingLevelsWithDestinationSettings);
			}
			if (isAccessible(SortingPlansViewsRepository.Scenario.Properties.selectedSortingPlans)) {
				selectedSortingPlansSettings = new ReferencesTableSettings(scenario, cptspPackage.eINSTANCE.getScenario_SelectedSortingPlans());
				basePart.initSelectedSortingPlans(selectedSortingPlansSettings);
			}
			// init filters
			
			if (isAccessible(SortingPlansViewsRepository.Scenario.Properties.sortingLevelsWithDestination)) {
				basePart.addFilterToSortingLevelsWithDestination(new EObjectFilter(CptDatasetLoadPackage.Literals.SORTING_LEVEL_ROW));
				// Start of user code for additional businessfilters for SortingLevelsWithDestination
				// End of user code
			}
			if (isAccessible(SortingPlansViewsRepository.Scenario.Properties.selectedSortingPlans)) {
				basePart.addFilterToSelectedSortingPlans(new EObjectFilter(CptDatasetLoadPackage.Literals.SORTING_PLAN_ROW));
				// Start of user code for additional businessfilters for SelectedSortingPlans
				// End of user code
			}
			// init values for referenced views
			
			// init filters for referenced views
			
		}
		setInitializing(false);
	}






	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#associatedFeature(java.lang.Object)
	 */
	public EStructuralFeature associatedFeature(Object editorKey) {
		if (editorKey == SortingPlansViewsRepository.Scenario.Properties.name) {
			return cptspPackage.eINSTANCE.getScenario_Name();
		}
		if (editorKey == SortingPlansViewsRepository.Scenario.Properties.sortingLevelsWithDestination) {
			return cptspPackage.eINSTANCE.getScenario_SortingLevelsWithDestination();
		}
		if (editorKey == SortingPlansViewsRepository.Scenario.Properties.selectedSortingPlans) {
			return cptspPackage.eINSTANCE.getScenario_SelectedSortingPlans();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		Scenario scenario = (Scenario)semanticObject;
		if (SortingPlansViewsRepository.Scenario.Properties.name == event.getAffectedEditor()) {
			scenario.setName((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (SortingPlansViewsRepository.Scenario.Properties.sortingLevelsWithDestination == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof SortingLevelRow) {
					sortingLevelsWithDestinationSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				sortingLevelsWithDestinationSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				sortingLevelsWithDestinationSettings.move(event.getNewIndex(), (SortingLevelRow) event.getNewValue());
			}
		}
		if (SortingPlansViewsRepository.Scenario.Properties.selectedSortingPlans == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof SortingPlanRow) {
					selectedSortingPlansSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				selectedSortingPlansSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				selectedSortingPlansSettings.move(event.getNewIndex(), (SortingPlanRow) event.getNewValue());
			}
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		super.updatePart(msg);
		if (editingPart.isVisible()) {
			ScenarioPropertiesEditionPart basePart = (ScenarioPropertiesEditionPart)editingPart;
			if (cptspPackage.eINSTANCE.getScenario_Name().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(SortingPlansViewsRepository.Scenario.Properties.name)) {
				if (msg.getNewValue() != null) {
					basePart.setName(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setName("");
				}
			}
			if (cptspPackage.eINSTANCE.getScenario_SortingLevelsWithDestination().equals(msg.getFeature())  && isAccessible(SortingPlansViewsRepository.Scenario.Properties.sortingLevelsWithDestination))
				basePart.updateSortingLevelsWithDestination();
			if (cptspPackage.eINSTANCE.getScenario_SelectedSortingPlans().equals(msg.getFeature())  && isAccessible(SortingPlansViewsRepository.Scenario.Properties.selectedSortingPlans))
				basePart.updateSelectedSortingPlans();
			
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#getNotificationFilters()
	 */
	@Override
	protected NotificationFilter[] getNotificationFilters() {
		NotificationFilter filter = new EStructuralFeatureNotificationFilter(
			cptspPackage.eINSTANCE.getScenario_Name(),
			cptspPackage.eINSTANCE.getScenario_SortingLevelsWithDestination(),
			cptspPackage.eINSTANCE.getScenario_SelectedSortingPlans()		);
		return new NotificationFilter[] {filter,};
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent#validateValue(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public Diagnostic validateValue(IPropertiesEditionEvent event) {
		Diagnostic ret = Diagnostic.OK_INSTANCE;
		if (event.getNewValue() != null) {
			try {
				if (SortingPlansViewsRepository.Scenario.Properties.name == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(cptspPackage.eINSTANCE.getScenario_Name().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(cptspPackage.eINSTANCE.getScenario_Name().getEAttributeType(), newValue);
				}
			} catch (IllegalArgumentException iae) {
				ret = BasicDiagnostic.toDiagnostic(iae);
			} catch (WrappedException we) {
				ret = BasicDiagnostic.toDiagnostic(we);
			}
		}
		return ret;
	}


	

	

}
