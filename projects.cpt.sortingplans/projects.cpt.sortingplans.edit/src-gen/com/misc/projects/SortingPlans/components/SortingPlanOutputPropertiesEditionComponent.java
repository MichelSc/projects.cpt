/**
 * Generated with Acceleo
 */
package com.misc.projects.SortingPlans.components;

// Start of user code for imports
import com.misc.projects.CptDatasetLoad.CptDatasetLoadFactory;
import com.misc.projects.CptDatasetLoad.SortingPlanOutputRow;

import com.misc.projects.SortingPlans.SortingPlan;
import com.misc.projects.SortingPlans.SortingPlanEndProduct;
import com.misc.projects.SortingPlans.SortingPlanOutput;
import com.misc.projects.SortingPlans.SortingPlanProduct;
import com.misc.projects.SortingPlans.cptspFactory;
import com.misc.projects.SortingPlans.cptspPackage;

import com.misc.projects.SortingPlans.parts.SortingPlanOutputPropertiesEditionPart;
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
public class SortingPlanOutputPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	/**
	 * Settings for FPDSortingPlanOutput EObjectFlatComboViewer
	 */
	private EObjectFlatComboSettings fPDSortingPlanOutputSettings;
	
	/**
	 * Settings for OutputProduct EObjectFlatComboViewer
	 */
	private EObjectFlatComboSettings outputProductSettings;
	
	/**
	 * Settings for SortingPlanEndProduct ReferencesTable
	 */
	private ReferencesTableSettings sortingPlanEndProductSettings;
	
	/**
	 * Settings for SortingPlan EObjectFlatComboViewer
	 */
	private EObjectFlatComboSettings sortingPlanSettings;
	
	
	/**
	 * Default constructor
	 * 
	 */
	public SortingPlanOutputPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject sortingPlanOutput, String editing_mode) {
		super(editingContext, sortingPlanOutput, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = SortingPlansViewsRepository.class;
		partKey = SortingPlansViewsRepository.SortingPlanOutput.class;
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
			
			final SortingPlanOutput sortingPlanOutput = (SortingPlanOutput)elt;
			final SortingPlanOutputPropertiesEditionPart basePart = (SortingPlanOutputPropertiesEditionPart)editingPart;
			// init values
			if (isAccessible(SortingPlansViewsRepository.SortingPlanOutput.Properties.fPDSortingPlanOutput)) {
				// init part
				fPDSortingPlanOutputSettings = new EObjectFlatComboSettings(sortingPlanOutput, cptspPackage.eINSTANCE.getSortingPlanOutput_FPDSortingPlanOutput());
				basePart.initFPDSortingPlanOutput(fPDSortingPlanOutputSettings);
				// set the button mode
				basePart.setFPDSortingPlanOutputButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (isAccessible(SortingPlansViewsRepository.SortingPlanOutput.Properties.outputProduct)) {
				// init part
				outputProductSettings = new EObjectFlatComboSettings(sortingPlanOutput, cptspPackage.eINSTANCE.getSortingPlanOutput_OutputProduct());
				basePart.initOutputProduct(outputProductSettings);
				// set the button mode
				basePart.setOutputProductButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (isAccessible(SortingPlansViewsRepository.SortingPlanOutput.Properties.sortingPlanEndProduct)) {
				sortingPlanEndProductSettings = new ReferencesTableSettings(sortingPlanOutput, cptspPackage.eINSTANCE.getSortingPlanOutput_SortingPlanEndProduct());
				basePart.initSortingPlanEndProduct(sortingPlanEndProductSettings);
			}
			if (isAccessible(SortingPlansViewsRepository.SortingPlanOutput.Properties.sortingPlan)) {
				// init part
				sortingPlanSettings = new EObjectFlatComboSettings(sortingPlanOutput, cptspPackage.eINSTANCE.getSortingPlanOutput_SortingPlan());
				basePart.initSortingPlan(sortingPlanSettings);
				// set the button mode
				basePart.setSortingPlanButtonMode(ButtonsModeEnum.BROWSE);
			}
			// init filters
			if (isAccessible(SortingPlansViewsRepository.SortingPlanOutput.Properties.fPDSortingPlanOutput)) {
				basePart.addFilterToFPDSortingPlanOutput(new ViewerFilter() {
				
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof String && element.equals("")) || (element instanceof SortingPlanOutputRow); //$NON-NLS-1$ 
					}
					
				});
				// Start of user code for additional businessfilters for FPDSortingPlanOutput
				// End of user code
			}
			if (isAccessible(SortingPlansViewsRepository.SortingPlanOutput.Properties.outputProduct)) {
				basePart.addFilterToOutputProduct(new ViewerFilter() {
				
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof SortingPlanProduct);
					}
					
				});
				// Start of user code for additional businessfilters for OutputProduct
				// End of user code
			}
			if (isAccessible(SortingPlansViewsRepository.SortingPlanOutput.Properties.sortingPlanEndProduct)) {
				basePart.addFilterToSortingPlanEndProduct(new EObjectFilter(cptspPackage.Literals.SORTING_PLAN_END_PRODUCT));
				// Start of user code for additional businessfilters for SortingPlanEndProduct
				// End of user code
			}
			if (isAccessible(SortingPlansViewsRepository.SortingPlanOutput.Properties.sortingPlan)) {
				basePart.addFilterToSortingPlan(new ViewerFilter() {
				
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof String && element.equals("")) || (element instanceof SortingPlan); //$NON-NLS-1$ 
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
		if (editorKey == SortingPlansViewsRepository.SortingPlanOutput.Properties.fPDSortingPlanOutput) {
			return cptspPackage.eINSTANCE.getSortingPlanOutput_FPDSortingPlanOutput();
		}
		if (editorKey == SortingPlansViewsRepository.SortingPlanOutput.Properties.outputProduct) {
			return cptspPackage.eINSTANCE.getSortingPlanOutput_OutputProduct();
		}
		if (editorKey == SortingPlansViewsRepository.SortingPlanOutput.Properties.sortingPlanEndProduct) {
			return cptspPackage.eINSTANCE.getSortingPlanOutput_SortingPlanEndProduct();
		}
		if (editorKey == SortingPlansViewsRepository.SortingPlanOutput.Properties.sortingPlan) {
			return cptspPackage.eINSTANCE.getSortingPlanOutput_SortingPlan();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		SortingPlanOutput sortingPlanOutput = (SortingPlanOutput)semanticObject;
		if (SortingPlansViewsRepository.SortingPlanOutput.Properties.fPDSortingPlanOutput == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				fPDSortingPlanOutputSettings.setToReference((SortingPlanOutputRow)event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.ADD) {
				SortingPlanOutputRow eObject = CptDatasetLoadFactory.eINSTANCE.createSortingPlanOutputRow();
				EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, eObject, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(eObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy != null) {
						policy.execute();
					}
				}
				fPDSortingPlanOutputSettings.setToReference(eObject);
			}
		}
		if (SortingPlansViewsRepository.SortingPlanOutput.Properties.outputProduct == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				outputProductSettings.setToReference((SortingPlanProduct)event.getNewValue());
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
				outputProductSettings.setToReference(eObject);
			}
		}
		if (SortingPlansViewsRepository.SortingPlanOutput.Properties.sortingPlanEndProduct == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof SortingPlanEndProduct) {
					sortingPlanEndProductSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				sortingPlanEndProductSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				sortingPlanEndProductSettings.move(event.getNewIndex(), (SortingPlanEndProduct) event.getNewValue());
			}
		}
		if (SortingPlansViewsRepository.SortingPlanOutput.Properties.sortingPlan == event.getAffectedEditor()) {
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
			SortingPlanOutputPropertiesEditionPart basePart = (SortingPlanOutputPropertiesEditionPart)editingPart;
			if (cptspPackage.eINSTANCE.getSortingPlanOutput_FPDSortingPlanOutput().equals(msg.getFeature()) && basePart != null && isAccessible(SortingPlansViewsRepository.SortingPlanOutput.Properties.fPDSortingPlanOutput))
				basePart.setFPDSortingPlanOutput((EObject)msg.getNewValue());
			if (cptspPackage.eINSTANCE.getSortingPlanOutput_OutputProduct().equals(msg.getFeature()) && basePart != null && isAccessible(SortingPlansViewsRepository.SortingPlanOutput.Properties.outputProduct))
				basePart.setOutputProduct((EObject)msg.getNewValue());
			if (cptspPackage.eINSTANCE.getSortingPlanOutput_SortingPlanEndProduct().equals(msg.getFeature())  && isAccessible(SortingPlansViewsRepository.SortingPlanOutput.Properties.sortingPlanEndProduct))
				basePart.updateSortingPlanEndProduct();
			if (cptspPackage.eINSTANCE.getSortingPlanOutput_SortingPlan().equals(msg.getFeature()) && basePart != null && isAccessible(SortingPlansViewsRepository.SortingPlanOutput.Properties.sortingPlan))
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
			cptspPackage.eINSTANCE.getSortingPlanOutput_FPDSortingPlanOutput(),
			cptspPackage.eINSTANCE.getSortingPlanOutput_OutputProduct(),
			cptspPackage.eINSTANCE.getSortingPlanOutput_SortingPlanEndProduct(),
			cptspPackage.eINSTANCE.getSortingPlanOutput_SortingPlan()		);
		return new NotificationFilter[] {filter,};
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#isRequired(java.lang.Object, int)
	 * 
	 */
	public boolean isRequired(Object key, int kind) {
		return key == SortingPlansViewsRepository.SortingPlanOutput.Properties.outputProduct;
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
