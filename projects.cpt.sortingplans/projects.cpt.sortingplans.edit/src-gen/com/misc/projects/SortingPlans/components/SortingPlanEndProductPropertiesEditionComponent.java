/**
 * Generated with Acceleo
 */
package com.misc.projects.SortingPlans.components;

// Start of user code for imports
import com.misc.projects.SortingPlans.EndProduct;
import com.misc.projects.SortingPlans.SortingPlan;
import com.misc.projects.SortingPlans.SortingPlanEndProduct;
import com.misc.projects.SortingPlans.SortingPlanOutput;
import com.misc.projects.SortingPlans.cptspFactory;
import com.misc.projects.SortingPlans.cptspPackage;

import com.misc.projects.SortingPlans.parts.SortingPlanEndProductPropertiesEditionPart;
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
public class SortingPlanEndProductPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	/**
	 * Settings for Output ReferencesTable
	 */
	private ReferencesTableSettings outputSettings;
	
	/**
	 * Settings for EndProduct EObjectFlatComboViewer
	 */
	private EObjectFlatComboSettings endProductSettings;
	
	/**
	 * Settings for SortingPlan EObjectFlatComboViewer
	 */
	private EObjectFlatComboSettings sortingPlanSettings;
	
	
	/**
	 * Default constructor
	 * 
	 */
	public SortingPlanEndProductPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject sortingPlanEndProduct, String editing_mode) {
		super(editingContext, sortingPlanEndProduct, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = SortingPlansViewsRepository.class;
		partKey = SortingPlansViewsRepository.SortingPlanEndProduct.class;
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
			
			final SortingPlanEndProduct sortingPlanEndProduct = (SortingPlanEndProduct)elt;
			final SortingPlanEndProductPropertiesEditionPart basePart = (SortingPlanEndProductPropertiesEditionPart)editingPart;
			// init values
			if (isAccessible(SortingPlansViewsRepository.SortingPlanEndProduct.Properties.output)) {
				outputSettings = new ReferencesTableSettings(sortingPlanEndProduct, cptspPackage.eINSTANCE.getSortingPlanEndProduct_Output());
				basePart.initOutput(outputSettings);
			}
			if (isAccessible(SortingPlansViewsRepository.SortingPlanEndProduct.Properties.endProduct)) {
				// init part
				endProductSettings = new EObjectFlatComboSettings(sortingPlanEndProduct, cptspPackage.eINSTANCE.getSortingPlanEndProduct_EndProduct());
				basePart.initEndProduct(endProductSettings);
				// set the button mode
				basePart.setEndProductButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (isAccessible(SortingPlansViewsRepository.SortingPlanEndProduct.Properties.sortingPlan)) {
				// init part
				sortingPlanSettings = new EObjectFlatComboSettings(sortingPlanEndProduct, cptspPackage.eINSTANCE.getSortingPlanEndProduct_SortingPlan());
				basePart.initSortingPlan(sortingPlanSettings);
				// set the button mode
				basePart.setSortingPlanButtonMode(ButtonsModeEnum.BROWSE);
			}
			// init filters
			if (isAccessible(SortingPlansViewsRepository.SortingPlanEndProduct.Properties.output)) {
				basePart.addFilterToOutput(new EObjectFilter(cptspPackage.Literals.SORTING_PLAN_OUTPUT));
				// Start of user code for additional businessfilters for Output
				// End of user code
			}
			if (isAccessible(SortingPlansViewsRepository.SortingPlanEndProduct.Properties.endProduct)) {
				basePart.addFilterToEndProduct(new ViewerFilter() {
				
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof EndProduct);
					}
					
				});
				// Start of user code for additional businessfilters for EndProduct
				// End of user code
			}
			if (isAccessible(SortingPlansViewsRepository.SortingPlanEndProduct.Properties.sortingPlan)) {
				basePart.addFilterToSortingPlan(new ViewerFilter() {
				
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof SortingPlan);
					}
					
				});
				// Start of user code for additional businessfilters for SortingPlan
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
		if (editorKey == SortingPlansViewsRepository.SortingPlanEndProduct.Properties.output) {
			return cptspPackage.eINSTANCE.getSortingPlanEndProduct_Output();
		}
		if (editorKey == SortingPlansViewsRepository.SortingPlanEndProduct.Properties.endProduct) {
			return cptspPackage.eINSTANCE.getSortingPlanEndProduct_EndProduct();
		}
		if (editorKey == SortingPlansViewsRepository.SortingPlanEndProduct.Properties.sortingPlan) {
			return cptspPackage.eINSTANCE.getSortingPlanEndProduct_SortingPlan();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		SortingPlanEndProduct sortingPlanEndProduct = (SortingPlanEndProduct)semanticObject;
		if (SortingPlansViewsRepository.SortingPlanEndProduct.Properties.output == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof SortingPlanOutput) {
					outputSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				outputSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				outputSettings.move(event.getNewIndex(), (SortingPlanOutput) event.getNewValue());
			}
		}
		if (SortingPlansViewsRepository.SortingPlanEndProduct.Properties.endProduct == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				endProductSettings.setToReference((EndProduct)event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.ADD) {
				EndProduct eObject = cptspFactory.eINSTANCE.createEndProduct();
				EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, eObject, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(eObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy != null) {
						policy.execute();
					}
				}
				endProductSettings.setToReference(eObject);
			}
		}
		if (SortingPlansViewsRepository.SortingPlanEndProduct.Properties.sortingPlan == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				sortingPlanSettings.setToReference((SortingPlan)event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.ADD) {
				SortingPlan eObject = cptspFactory.eINSTANCE.createSortingPlan();
				EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, eObject, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(eObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy != null) {
						policy.execute();
					}
				}
				sortingPlanSettings.setToReference(eObject);
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
			SortingPlanEndProductPropertiesEditionPart basePart = (SortingPlanEndProductPropertiesEditionPart)editingPart;
			if (cptspPackage.eINSTANCE.getSortingPlanEndProduct_Output().equals(msg.getFeature())  && isAccessible(SortingPlansViewsRepository.SortingPlanEndProduct.Properties.output))
				basePart.updateOutput();
			if (cptspPackage.eINSTANCE.getSortingPlanEndProduct_EndProduct().equals(msg.getFeature()) && basePart != null && isAccessible(SortingPlansViewsRepository.SortingPlanEndProduct.Properties.endProduct))
				basePart.setEndProduct((EObject)msg.getNewValue());
			if (cptspPackage.eINSTANCE.getSortingPlanEndProduct_SortingPlan().equals(msg.getFeature()) && basePart != null && isAccessible(SortingPlansViewsRepository.SortingPlanEndProduct.Properties.sortingPlan))
				basePart.setSortingPlan((EObject)msg.getNewValue());
			
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
			cptspPackage.eINSTANCE.getSortingPlanEndProduct_Output(),
			cptspPackage.eINSTANCE.getSortingPlanEndProduct_EndProduct(),
			cptspPackage.eINSTANCE.getSortingPlanEndProduct_SortingPlan()		);
		return new NotificationFilter[] {filter,};
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#isRequired(java.lang.Object, int)
	 * 
	 */
	public boolean isRequired(Object key, int kind) {
		return key == SortingPlansViewsRepository.SortingPlanEndProduct.Properties.endProduct || key == SortingPlansViewsRepository.SortingPlanEndProduct.Properties.sortingPlan;
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
