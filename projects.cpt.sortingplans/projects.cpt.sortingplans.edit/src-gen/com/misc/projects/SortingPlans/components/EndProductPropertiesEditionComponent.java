/**
 * Generated with Acceleo
 */
package com.misc.projects.SortingPlans.components;

// Start of user code for imports
import com.misc.projects.CptDatasetLoad.CptDatasetLoadFactory;
import com.misc.projects.CptDatasetLoad.SortingLevelRow;

import com.misc.projects.SortingPlans.EndProduct;
import com.misc.projects.SortingPlans.Scenario;
import com.misc.projects.SortingPlans.SortingPlanProduct;
import com.misc.projects.SortingPlans.cptspFactory;
import com.misc.projects.SortingPlans.cptspPackage;

import com.misc.projects.SortingPlans.parts.EndProductPropertiesEditionPart;
import com.misc.projects.SortingPlans.parts.SortingPlansViewsRepository;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.WrappedException;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.ecore.resource.ResourceSet;

import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.util.EcoreUtil;

import org.eclipse.emf.eef.runtime.api.notify.EStructuralFeatureNotificationFilter;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.api.notify.NotificationFilter;

import org.eclipse.emf.eef.runtime.context.PropertiesEditingContext;

import org.eclipse.emf.eef.runtime.context.impl.EObjectPropertiesEditionContext;

import org.eclipse.emf.eef.runtime.impl.components.SinglePartPropertiesEditingComponent;

import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;

import org.eclipse.emf.eef.runtime.impl.utils.EEFConverterUtil;

import org.eclipse.emf.eef.runtime.policies.PropertiesEditingPolicy;

import org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider;

import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;

import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;

import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;


// End of user code

/**
 * 
 * 
 */
public class EndProductPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	/**
	 * Settings for FPDSortingLevel EObjectFlatComboViewer
	 */
	private EObjectFlatComboSettings fPDSortingLevelSettings;
	
	/**
	 * Settings for SortingPlanProduct EObjectFlatComboViewer
	 */
	private EObjectFlatComboSettings sortingPlanProductSettings;
	
	/**
	 * Settings for Scenario EObjectFlatComboViewer
	 */
	private EObjectFlatComboSettings scenarioSettings;
	
	
	/**
	 * Default constructor
	 * 
	 */
	public EndProductPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject endProduct, String editing_mode) {
		super(editingContext, endProduct, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = SortingPlansViewsRepository.class;
		partKey = SortingPlansViewsRepository.EndProduct.class;
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
			
			final EndProduct endProduct = (EndProduct)elt;
			final EndProductPropertiesEditionPart basePart = (EndProductPropertiesEditionPart)editingPart;
			// init values
			if (isAccessible(SortingPlansViewsRepository.EndProduct.Properties.fPDSortingLevel)) {
				// init part
				fPDSortingLevelSettings = new EObjectFlatComboSettings(endProduct, cptspPackage.eINSTANCE.getEndProduct_FPDSortingLevel());
				basePart.initFPDSortingLevel(fPDSortingLevelSettings);
				// set the button mode
				basePart.setFPDSortingLevelButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (isAccessible(SortingPlansViewsRepository.EndProduct.Properties.sortingPlanProduct)) {
				// init part
				sortingPlanProductSettings = new EObjectFlatComboSettings(endProduct, cptspPackage.eINSTANCE.getEndProduct_SortingPlanProduct());
				basePart.initSortingPlanProduct(sortingPlanProductSettings);
				// set the button mode
				basePart.setSortingPlanProductButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (isAccessible(SortingPlansViewsRepository.EndProduct.Properties.whichSortingPlans)) {
				basePart.setWhichSortingPlans(endProduct.isWhichSortingPlans());
			}
			if (isAccessible(SortingPlansViewsRepository.EndProduct.Properties.scenario)) {
				// init part
				scenarioSettings = new EObjectFlatComboSettings(endProduct, cptspPackage.eINSTANCE.getEndProduct_Scenario());
				basePart.initScenario(scenarioSettings);
				// set the button mode
				basePart.setScenarioButtonMode(ButtonsModeEnum.BROWSE);
			}
			// init filters
			if (isAccessible(SortingPlansViewsRepository.EndProduct.Properties.fPDSortingLevel)) {
				basePart.addFilterToFPDSortingLevel(new ViewerFilter() {
				
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof String && element.equals("")) || (element instanceof SortingLevelRow); //$NON-NLS-1$ 
					}
					
				});
				// Start of user code for additional businessfilters for FPDSortingLevel
				// End of user code
			}
			if (isAccessible(SortingPlansViewsRepository.EndProduct.Properties.sortingPlanProduct)) {
				basePart.addFilterToSortingPlanProduct(new ViewerFilter() {
				
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof SortingPlanProduct);
					}
					
				});
				// Start of user code for additional businessfilters for SortingPlanProduct
				// End of user code
			}
			
			if (isAccessible(SortingPlansViewsRepository.EndProduct.Properties.scenario)) {
				basePart.addFilterToScenario(new ViewerFilter() {
				
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof String && element.equals("")) || (element instanceof Scenario); //$NON-NLS-1$ 
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
		if (editorKey == SortingPlansViewsRepository.EndProduct.Properties.fPDSortingLevel) {
			return cptspPackage.eINSTANCE.getEndProduct_FPDSortingLevel();
		}
		if (editorKey == SortingPlansViewsRepository.EndProduct.Properties.sortingPlanProduct) {
			return cptspPackage.eINSTANCE.getEndProduct_SortingPlanProduct();
		}
		if (editorKey == SortingPlansViewsRepository.EndProduct.Properties.whichSortingPlans) {
			return cptspPackage.eINSTANCE.getEndProduct_WhichSortingPlans();
		}
		if (editorKey == SortingPlansViewsRepository.EndProduct.Properties.scenario) {
			return cptspPackage.eINSTANCE.getEndProduct_Scenario();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		EndProduct endProduct = (EndProduct)semanticObject;
		if (SortingPlansViewsRepository.EndProduct.Properties.fPDSortingLevel == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				fPDSortingLevelSettings.setToReference((SortingLevelRow)event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.ADD) {
				SortingLevelRow eObject = CptDatasetLoadFactory.eINSTANCE.createSortingLevelRow();
				EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, eObject, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(eObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy != null) {
						policy.execute();
					}
				}
				fPDSortingLevelSettings.setToReference(eObject);
			}
		}
		if (SortingPlansViewsRepository.EndProduct.Properties.sortingPlanProduct == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				sortingPlanProductSettings.setToReference((SortingPlanProduct)event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.ADD) {
				SortingPlanProduct eObject = cptspFactory.eINSTANCE.createSortingPlanProduct();
				EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, eObject, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(eObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy != null) {
						policy.execute();
					}
				}
				sortingPlanProductSettings.setToReference(eObject);
			}
		}
		if (SortingPlansViewsRepository.EndProduct.Properties.whichSortingPlans == event.getAffectedEditor()) {
			endProduct.setWhichSortingPlans((Boolean)event.getNewValue());
		}
		if (SortingPlansViewsRepository.EndProduct.Properties.scenario == event.getAffectedEditor()) {
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
			EndProductPropertiesEditionPart basePart = (EndProductPropertiesEditionPart)editingPart;
			if (cptspPackage.eINSTANCE.getEndProduct_FPDSortingLevel().equals(msg.getFeature()) && basePart != null && isAccessible(SortingPlansViewsRepository.EndProduct.Properties.fPDSortingLevel))
				basePart.setFPDSortingLevel((EObject)msg.getNewValue());
			if (cptspPackage.eINSTANCE.getEndProduct_SortingPlanProduct().equals(msg.getFeature()) && basePart != null && isAccessible(SortingPlansViewsRepository.EndProduct.Properties.sortingPlanProduct))
				basePart.setSortingPlanProduct((EObject)msg.getNewValue());
			if (cptspPackage.eINSTANCE.getEndProduct_WhichSortingPlans().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(SortingPlansViewsRepository.EndProduct.Properties.whichSortingPlans))
				basePart.setWhichSortingPlans((Boolean)msg.getNewValue());
			
			if (cptspPackage.eINSTANCE.getEndProduct_Scenario().equals(msg.getFeature()) && basePart != null && isAccessible(SortingPlansViewsRepository.EndProduct.Properties.scenario))
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
			cptspPackage.eINSTANCE.getEndProduct_FPDSortingLevel(),
			cptspPackage.eINSTANCE.getEndProduct_SortingPlanProduct(),
			cptspPackage.eINSTANCE.getEndProduct_WhichSortingPlans(),
			cptspPackage.eINSTANCE.getEndProduct_Scenario()		);
		return new NotificationFilter[] {filter,};
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#isRequired(java.lang.Object, int)
	 * 
	 */
	public boolean isRequired(Object key, int kind) {
		return key == SortingPlansViewsRepository.EndProduct.Properties.sortingPlanProduct;
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
				if (SortingPlansViewsRepository.EndProduct.Properties.whichSortingPlans == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(cptspPackage.eINSTANCE.getEndProduct_WhichSortingPlans().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(cptspPackage.eINSTANCE.getEndProduct_WhichSortingPlans().getEAttributeType(), newValue);
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
