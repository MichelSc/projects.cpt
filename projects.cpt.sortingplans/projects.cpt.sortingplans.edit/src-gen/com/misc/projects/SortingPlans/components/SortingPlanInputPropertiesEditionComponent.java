/**
 * Generated with Acceleo
 */
package com.misc.projects.SortingPlans.components;

// Start of user code for imports
import com.misc.projects.CptDatasetLoad.CptDatasetLoadFactory;
import com.misc.projects.CptDatasetLoad.SortingPlanInputRow;

import com.misc.projects.SortingPlans.SortingPlan;
import com.misc.projects.SortingPlans.SortingPlanInput;
import com.misc.projects.SortingPlans.SortingPlanProduct;
import com.misc.projects.SortingPlans.cptspFactory;
import com.misc.projects.SortingPlans.cptspPackage;

import com.misc.projects.SortingPlans.parts.SortingPlanInputPropertiesEditionPart;
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
public class SortingPlanInputPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	/**
	 * Settings for InputProduct EObjectFlatComboViewer
	 */
	private EObjectFlatComboSettings inputProductSettings;
	
	/**
	 * Settings for FPDSortingPlanInput EObjectFlatComboViewer
	 */
	private EObjectFlatComboSettings fPDSortingPlanInputSettings;
	
	/**
	 * Settings for SortingPlan EObjectFlatComboViewer
	 */
	private EObjectFlatComboSettings sortingPlanSettings;
	
	
	/**
	 * Default constructor
	 * 
	 */
	public SortingPlanInputPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject sortingPlanInput, String editing_mode) {
		super(editingContext, sortingPlanInput, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = SortingPlansViewsRepository.class;
		partKey = SortingPlansViewsRepository.SortingPlanInput.class;
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
			
			final SortingPlanInput sortingPlanInput = (SortingPlanInput)elt;
			final SortingPlanInputPropertiesEditionPart basePart = (SortingPlanInputPropertiesEditionPart)editingPart;
			// init values
			if (isAccessible(SortingPlansViewsRepository.SortingPlanInput.Properties.inputProduct)) {
				// init part
				inputProductSettings = new EObjectFlatComboSettings(sortingPlanInput, cptspPackage.eINSTANCE.getSortingPlanInput_InputProduct());
				basePart.initInputProduct(inputProductSettings);
				// set the button mode
				basePart.setInputProductButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (isAccessible(SortingPlansViewsRepository.SortingPlanInput.Properties.fPDSortingPlanInput)) {
				// init part
				fPDSortingPlanInputSettings = new EObjectFlatComboSettings(sortingPlanInput, cptspPackage.eINSTANCE.getSortingPlanInput_FPDSortingPlanInput());
				basePart.initFPDSortingPlanInput(fPDSortingPlanInputSettings);
				// set the button mode
				basePart.setFPDSortingPlanInputButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (isAccessible(SortingPlansViewsRepository.SortingPlanInput.Properties.sortingPlan)) {
				// init part
				sortingPlanSettings = new EObjectFlatComboSettings(sortingPlanInput, cptspPackage.eINSTANCE.getSortingPlanInput_SortingPlan());
				basePart.initSortingPlan(sortingPlanSettings);
				// set the button mode
				basePart.setSortingPlanButtonMode(ButtonsModeEnum.BROWSE);
			}
			// init filters
			if (isAccessible(SortingPlansViewsRepository.SortingPlanInput.Properties.inputProduct)) {
				basePart.addFilterToInputProduct(new ViewerFilter() {
				
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof SortingPlanProduct);
					}
					
				});
				// Start of user code for additional businessfilters for InputProduct
				// End of user code
			}
			if (isAccessible(SortingPlansViewsRepository.SortingPlanInput.Properties.fPDSortingPlanInput)) {
				basePart.addFilterToFPDSortingPlanInput(new ViewerFilter() {
				
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof String && element.equals("")) || (element instanceof SortingPlanInputRow); //$NON-NLS-1$ 
					}
					
				});
				// Start of user code for additional businessfilters for FPDSortingPlanInput
				// End of user code
			}
			if (isAccessible(SortingPlansViewsRepository.SortingPlanInput.Properties.sortingPlan)) {
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
		if (editorKey == SortingPlansViewsRepository.SortingPlanInput.Properties.inputProduct) {
			return cptspPackage.eINSTANCE.getSortingPlanInput_InputProduct();
		}
		if (editorKey == SortingPlansViewsRepository.SortingPlanInput.Properties.fPDSortingPlanInput) {
			return cptspPackage.eINSTANCE.getSortingPlanInput_FPDSortingPlanInput();
		}
		if (editorKey == SortingPlansViewsRepository.SortingPlanInput.Properties.sortingPlan) {
			return cptspPackage.eINSTANCE.getSortingPlanInput_SortingPlan();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		SortingPlanInput sortingPlanInput = (SortingPlanInput)semanticObject;
		if (SortingPlansViewsRepository.SortingPlanInput.Properties.inputProduct == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				inputProductSettings.setToReference((SortingPlanProduct)event.getNewValue());
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
				inputProductSettings.setToReference(eObject);
			}
		}
		if (SortingPlansViewsRepository.SortingPlanInput.Properties.fPDSortingPlanInput == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				fPDSortingPlanInputSettings.setToReference((SortingPlanInputRow)event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.ADD) {
				SortingPlanInputRow eObject = CptDatasetLoadFactory.eINSTANCE.createSortingPlanInputRow();
				EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, eObject, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(eObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy != null) {
						policy.execute();
					}
				}
				fPDSortingPlanInputSettings.setToReference(eObject);
			}
		}
		if (SortingPlansViewsRepository.SortingPlanInput.Properties.sortingPlan == event.getAffectedEditor()) {
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
			SortingPlanInputPropertiesEditionPart basePart = (SortingPlanInputPropertiesEditionPart)editingPart;
			if (cptspPackage.eINSTANCE.getSortingPlanInput_InputProduct().equals(msg.getFeature()) && basePart != null && isAccessible(SortingPlansViewsRepository.SortingPlanInput.Properties.inputProduct))
				basePart.setInputProduct((EObject)msg.getNewValue());
			if (cptspPackage.eINSTANCE.getSortingPlanInput_FPDSortingPlanInput().equals(msg.getFeature()) && basePart != null && isAccessible(SortingPlansViewsRepository.SortingPlanInput.Properties.fPDSortingPlanInput))
				basePart.setFPDSortingPlanInput((EObject)msg.getNewValue());
			if (cptspPackage.eINSTANCE.getSortingPlanInput_SortingPlan().equals(msg.getFeature()) && basePart != null && isAccessible(SortingPlansViewsRepository.SortingPlanInput.Properties.sortingPlan))
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
			cptspPackage.eINSTANCE.getSortingPlanInput_InputProduct(),
			cptspPackage.eINSTANCE.getSortingPlanInput_FPDSortingPlanInput(),
			cptspPackage.eINSTANCE.getSortingPlanInput_SortingPlan()		);
		return new NotificationFilter[] {filter,};
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#isRequired(java.lang.Object, int)
	 * 
	 */
	public boolean isRequired(Object key, int kind) {
		return key == SortingPlansViewsRepository.SortingPlanInput.Properties.inputProduct;
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
