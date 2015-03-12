/**
 * Generated with Acceleo
 */
package com.misc.projects.SortingPlans.components;

// Start of user code for imports
import com.misc.projects.CptDatasetLoad.CptDatasetLoadFactory;
import com.misc.projects.CptDatasetLoad.SortingPlanRow;

import com.misc.projects.SortingPlans.Scenario;
import com.misc.projects.SortingPlans.SortingPlan;
import com.misc.projects.SortingPlans.SortingPlanEndProduct;
import com.misc.projects.SortingPlans.cptspFactory;
import com.misc.projects.SortingPlans.cptspPackage;

import com.misc.projects.SortingPlans.parts.SortingPlanPropertiesEditionPart;
import com.misc.projects.SortingPlans.parts.SortingPlansViewsRepository;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.WrappedException;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.ecore.resource.ResourceSet;

import org.eclipse.emf.ecore.util.EcoreUtil;

import org.eclipse.emf.eef.runtime.api.notify.EStructuralFeatureNotificationFilter;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.api.notify.NotificationFilter;

import org.eclipse.emf.eef.runtime.context.PropertiesEditingContext;

import org.eclipse.emf.eef.runtime.context.impl.EObjectPropertiesEditionContext;

import org.eclipse.emf.eef.runtime.impl.components.SinglePartPropertiesEditingComponent;

import org.eclipse.emf.eef.runtime.impl.filters.EObjectFilter;

import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;

import org.eclipse.emf.eef.runtime.impl.utils.EEFConverterUtil;

import org.eclipse.emf.eef.runtime.policies.PropertiesEditingPolicy;

import org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider;

import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;

import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;

import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;

import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;


// End of user code

/**
 * 
 * 
 */
public class SortingPlanPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	/**
	 * Settings for EndProducts ReferencesTable
	 */
	private ReferencesTableSettings endProductsSettings;
	
	/**
	 * Settings for FPDSortingPlan EObjectFlatComboViewer
	 */
	private EObjectFlatComboSettings fPDSortingPlanSettings;
	
	/**
	 * Settings for Scenario EObjectFlatComboViewer
	 */
	private EObjectFlatComboSettings scenarioSettings;
	
	
	/**
	 * Default constructor
	 * 
	 */
	public SortingPlanPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject sortingPlan, String editing_mode) {
		super(editingContext, sortingPlan, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = SortingPlansViewsRepository.class;
		partKey = SortingPlansViewsRepository.SortingPlan.class;
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
			
			final SortingPlan sortingPlan = (SortingPlan)elt;
			final SortingPlanPropertiesEditionPart basePart = (SortingPlanPropertiesEditionPart)editingPart;
			// init values
			if (isAccessible(SortingPlansViewsRepository.SortingPlan.Properties.endProducts)) {
				endProductsSettings = new ReferencesTableSettings(sortingPlan, cptspPackage.eINSTANCE.getSortingPlan_EndProducts());
				basePart.initEndProducts(endProductsSettings);
			}
			if (isAccessible(SortingPlansViewsRepository.SortingPlan.Properties.fPDSortingPlan)) {
				// init part
				fPDSortingPlanSettings = new EObjectFlatComboSettings(sortingPlan, cptspPackage.eINSTANCE.getSortingPlan_FPDSortingPlan());
				basePart.initFPDSortingPlan(fPDSortingPlanSettings);
				// set the button mode
				basePart.setFPDSortingPlanButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (isAccessible(SortingPlansViewsRepository.SortingPlan.Properties.scenario)) {
				// init part
				scenarioSettings = new EObjectFlatComboSettings(sortingPlan, cptspPackage.eINSTANCE.getSortingPlan_Scenario());
				basePart.initScenario(scenarioSettings);
				// set the button mode
				basePart.setScenarioButtonMode(ButtonsModeEnum.BROWSE);
			}
			// init filters
			if (isAccessible(SortingPlansViewsRepository.SortingPlan.Properties.endProducts)) {
				basePart.addFilterToEndProducts(new EObjectFilter(cptspPackage.Literals.SORTING_PLAN_END_PRODUCT));
				// Start of user code for additional businessfilters for EndProducts
				// End of user code
			}
			if (isAccessible(SortingPlansViewsRepository.SortingPlan.Properties.fPDSortingPlan)) {
				basePart.addFilterToFPDSortingPlan(new ViewerFilter() {
				
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof String && element.equals("")) || (element instanceof SortingPlanRow); //$NON-NLS-1$ 
					}
					
				});
				// Start of user code for additional businessfilters for FPDSortingPlan
				// End of user code
			}
			if (isAccessible(SortingPlansViewsRepository.SortingPlan.Properties.scenario)) {
				basePart.addFilterToScenario(new ViewerFilter() {
				
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof Scenario);
					}
					
				});
				// Start of user code for additional businessfilters for Scenario
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
		if (editorKey == SortingPlansViewsRepository.SortingPlan.Properties.endProducts) {
			return cptspPackage.eINSTANCE.getSortingPlan_EndProducts();
		}
		if (editorKey == SortingPlansViewsRepository.SortingPlan.Properties.fPDSortingPlan) {
			return cptspPackage.eINSTANCE.getSortingPlan_FPDSortingPlan();
		}
		if (editorKey == SortingPlansViewsRepository.SortingPlan.Properties.scenario) {
			return cptspPackage.eINSTANCE.getSortingPlan_Scenario();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		SortingPlan sortingPlan = (SortingPlan)semanticObject;
		if (SortingPlansViewsRepository.SortingPlan.Properties.endProducts == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof SortingPlanEndProduct) {
					endProductsSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				endProductsSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				endProductsSettings.move(event.getNewIndex(), (SortingPlanEndProduct) event.getNewValue());
			}
		}
		if (SortingPlansViewsRepository.SortingPlan.Properties.fPDSortingPlan == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				fPDSortingPlanSettings.setToReference((SortingPlanRow)event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.ADD) {
				SortingPlanRow eObject = CptDatasetLoadFactory.eINSTANCE.createSortingPlanRow();
				EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, eObject, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(eObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy != null) {
						policy.execute();
					}
				}
				fPDSortingPlanSettings.setToReference(eObject);
			}
		}
		if (SortingPlansViewsRepository.SortingPlan.Properties.scenario == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				scenarioSettings.setToReference((Scenario)event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.ADD) {
				Scenario eObject = cptspFactory.eINSTANCE.createScenario();
				EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, eObject, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(eObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy != null) {
						policy.execute();
					}
				}
				scenarioSettings.setToReference(eObject);
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
			SortingPlanPropertiesEditionPart basePart = (SortingPlanPropertiesEditionPart)editingPart;
			if (cptspPackage.eINSTANCE.getSortingPlan_EndProducts().equals(msg.getFeature())  && isAccessible(SortingPlansViewsRepository.SortingPlan.Properties.endProducts))
				basePart.updateEndProducts();
			if (cptspPackage.eINSTANCE.getSortingPlan_FPDSortingPlan().equals(msg.getFeature()) && basePart != null && isAccessible(SortingPlansViewsRepository.SortingPlan.Properties.fPDSortingPlan))
				basePart.setFPDSortingPlan((EObject)msg.getNewValue());
			if (cptspPackage.eINSTANCE.getSortingPlan_Scenario().equals(msg.getFeature()) && basePart != null && isAccessible(SortingPlansViewsRepository.SortingPlan.Properties.scenario))
				basePart.setScenario((EObject)msg.getNewValue());
			
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
			cptspPackage.eINSTANCE.getSortingPlan_EndProducts(),
			cptspPackage.eINSTANCE.getSortingPlan_FPDSortingPlan(),
			cptspPackage.eINSTANCE.getSortingPlan_Scenario()		);
		return new NotificationFilter[] {filter,};
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#isRequired(java.lang.Object, int)
	 * 
	 */
	public boolean isRequired(Object key, int kind) {
		return key == SortingPlansViewsRepository.SortingPlan.Properties.scenario;
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
			} catch (IllegalArgumentException iae) {
				ret = BasicDiagnostic.toDiagnostic(iae);
			} catch (WrappedException we) {
				ret = BasicDiagnostic.toDiagnostic(we);
			}
		}
		return ret;
	}


	

	

}
