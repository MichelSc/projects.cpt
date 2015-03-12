/**
 * Generated with Acceleo
 */
package com.misc.projects.SortingPlans.components;

// Start of user code for imports
import com.misc.projects.CptDatasetLoad.CptDatasetLoadFactory;
import com.misc.projects.CptDatasetLoad.SortingLevelRow;

import com.misc.projects.SortingPlans.EndProduct;
import com.misc.projects.SortingPlans.SortingPlanInput;
import com.misc.projects.SortingPlans.SortingPlanOutput;
import com.misc.projects.SortingPlans.SortingPlanProduct;
import com.misc.projects.SortingPlans.cptspFactory;
import com.misc.projects.SortingPlans.cptspPackage;

import com.misc.projects.SortingPlans.parts.SortingPlanProductPropertiesEditionPart;
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
public class SortingPlanProductPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	/**
	 * Settings for FPDSortingLevel EObjectFlatComboViewer
	 */
	private EObjectFlatComboSettings fPDSortingLevelSettings;
	
	/**
	 * Settings for SortingPlansProducing ReferencesTable
	 */
	private ReferencesTableSettings sortingPlansProducingSettings;
	
	/**
	 * Settings for SortingPlansAccepting ReferencesTable
	 */
	private ReferencesTableSettings sortingPlansAcceptingSettings;
	
	/**
	 * Settings for EndProduct EObjectFlatComboViewer
	 */
	private EObjectFlatComboSettings endProductSettings;
	
	
	/**
	 * Default constructor
	 * 
	 */
	public SortingPlanProductPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject sortingPlanProduct, String editing_mode) {
		super(editingContext, sortingPlanProduct, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = SortingPlansViewsRepository.class;
		partKey = SortingPlansViewsRepository.SortingPlanProduct.class;
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
			
			final SortingPlanProduct sortingPlanProduct = (SortingPlanProduct)elt;
			final SortingPlanProductPropertiesEditionPart basePart = (SortingPlanProductPropertiesEditionPart)editingPart;
			// init values
			if (isAccessible(SortingPlansViewsRepository.SortingPlanProduct.Properties.fPDSortingLevel)) {
				// init part
				fPDSortingLevelSettings = new EObjectFlatComboSettings(sortingPlanProduct, cptspPackage.eINSTANCE.getSortingPlanProduct_FPDSortingLevel());
				basePart.initFPDSortingLevel(fPDSortingLevelSettings);
				// set the button mode
				basePart.setFPDSortingLevelButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (isAccessible(SortingPlansViewsRepository.SortingPlanProduct.Properties.sortingPlansProducing)) {
				sortingPlansProducingSettings = new ReferencesTableSettings(sortingPlanProduct, cptspPackage.eINSTANCE.getSortingPlanProduct_SortingPlansProducing());
				basePart.initSortingPlansProducing(sortingPlansProducingSettings);
			}
			if (isAccessible(SortingPlansViewsRepository.SortingPlanProduct.Properties.sortingPlansAccepting)) {
				sortingPlansAcceptingSettings = new ReferencesTableSettings(sortingPlanProduct, cptspPackage.eINSTANCE.getSortingPlanProduct_SortingPlansAccepting());
				basePart.initSortingPlansAccepting(sortingPlansAcceptingSettings);
			}
			if (isAccessible(SortingPlansViewsRepository.SortingPlanProduct.Properties.sortingLevelAVCSSk))
				basePart.setSortingLevelAVCSSk(EEFConverterUtil.convertToString(EcorePackage.Literals.EBIG_DECIMAL, sortingPlanProduct.getSortingLevelAVCSSk()));
			
			if (isAccessible(SortingPlansViewsRepository.SortingPlanProduct.Properties.mechanizationLevelSk))
				basePart.setMechanizationLevelSk(EEFConverterUtil.convertToString(EcorePackage.Literals.EBIG_DECIMAL, sortingPlanProduct.getMechanizationLevelSk()));
			
			if (isAccessible(SortingPlansViewsRepository.SortingPlanProduct.Properties.throughputTypeSk))
				basePart.setThroughputTypeSk(EEFConverterUtil.convertToString(EcorePackage.Literals.EBIG_DECIMAL, sortingPlanProduct.getThroughputTypeSk()));
			
			if (isAccessible(SortingPlansViewsRepository.SortingPlanProduct.Properties.destinationSk))
				basePart.setDestinationSk(EEFConverterUtil.convertToString(EcorePackage.Literals.EBIG_DECIMAL, sortingPlanProduct.getDestinationSk()));
			
			if (isAccessible(SortingPlansViewsRepository.SortingPlanProduct.Properties.endProduct)) {
				// init part
				endProductSettings = new EObjectFlatComboSettings(sortingPlanProduct, cptspPackage.eINSTANCE.getSortingPlanProduct_EndProduct());
				basePart.initEndProduct(endProductSettings);
				// set the button mode
				basePart.setEndProductButtonMode(ButtonsModeEnum.BROWSE);
			}
			// init filters
			if (isAccessible(SortingPlansViewsRepository.SortingPlanProduct.Properties.fPDSortingLevel)) {
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
			if (isAccessible(SortingPlansViewsRepository.SortingPlanProduct.Properties.sortingPlansProducing)) {
				basePart.addFilterToSortingPlansProducing(new EObjectFilter(cptspPackage.Literals.SORTING_PLAN_OUTPUT));
				// Start of user code for additional businessfilters for SortingPlansProducing
				// End of user code
			}
			if (isAccessible(SortingPlansViewsRepository.SortingPlanProduct.Properties.sortingPlansAccepting)) {
				basePart.addFilterToSortingPlansAccepting(new EObjectFilter(cptspPackage.Literals.SORTING_PLAN_INPUT));
				// Start of user code for additional businessfilters for SortingPlansAccepting
				// End of user code
			}
			
			
			
			
			if (isAccessible(SortingPlansViewsRepository.SortingPlanProduct.Properties.endProduct)) {
				basePart.addFilterToEndProduct(new ViewerFilter() {
				
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof String && element.equals("")) || (element instanceof EndProduct); //$NON-NLS-1$ 
					}
					
				});
				// Start of user code for additional businessfilters for EndProduct
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
		if (editorKey == SortingPlansViewsRepository.SortingPlanProduct.Properties.fPDSortingLevel) {
			return cptspPackage.eINSTANCE.getSortingPlanProduct_FPDSortingLevel();
		}
		if (editorKey == SortingPlansViewsRepository.SortingPlanProduct.Properties.sortingPlansProducing) {
			return cptspPackage.eINSTANCE.getSortingPlanProduct_SortingPlansProducing();
		}
		if (editorKey == SortingPlansViewsRepository.SortingPlanProduct.Properties.sortingPlansAccepting) {
			return cptspPackage.eINSTANCE.getSortingPlanProduct_SortingPlansAccepting();
		}
		if (editorKey == SortingPlansViewsRepository.SortingPlanProduct.Properties.sortingLevelAVCSSk) {
			return cptspPackage.eINSTANCE.getSortingPlanProduct_SortingLevelAVCSSk();
		}
		if (editorKey == SortingPlansViewsRepository.SortingPlanProduct.Properties.mechanizationLevelSk) {
			return cptspPackage.eINSTANCE.getSortingPlanProduct_MechanizationLevelSk();
		}
		if (editorKey == SortingPlansViewsRepository.SortingPlanProduct.Properties.throughputTypeSk) {
			return cptspPackage.eINSTANCE.getSortingPlanProduct_ThroughputTypeSk();
		}
		if (editorKey == SortingPlansViewsRepository.SortingPlanProduct.Properties.destinationSk) {
			return cptspPackage.eINSTANCE.getSortingPlanProduct_DestinationSk();
		}
		if (editorKey == SortingPlansViewsRepository.SortingPlanProduct.Properties.endProduct) {
			return cptspPackage.eINSTANCE.getSortingPlanProduct_EndProduct();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		SortingPlanProduct sortingPlanProduct = (SortingPlanProduct)semanticObject;
		if (SortingPlansViewsRepository.SortingPlanProduct.Properties.fPDSortingLevel == event.getAffectedEditor()) {
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
		if (SortingPlansViewsRepository.SortingPlanProduct.Properties.sortingPlansProducing == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof SortingPlanOutput) {
					sortingPlansProducingSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				sortingPlansProducingSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				sortingPlansProducingSettings.move(event.getNewIndex(), (SortingPlanOutput) event.getNewValue());
			}
		}
		if (SortingPlansViewsRepository.SortingPlanProduct.Properties.sortingPlansAccepting == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof SortingPlanInput) {
					sortingPlansAcceptingSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				sortingPlansAcceptingSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				sortingPlansAcceptingSettings.move(event.getNewIndex(), (SortingPlanInput) event.getNewValue());
			}
		}
		if (SortingPlansViewsRepository.SortingPlanProduct.Properties.sortingLevelAVCSSk == event.getAffectedEditor()) {
			sortingPlanProduct.setSortingLevelAVCSSk((java.math.BigDecimal)EEFConverterUtil.createFromString(EcorePackage.Literals.EBIG_DECIMAL, (String)event.getNewValue()));
		}
		if (SortingPlansViewsRepository.SortingPlanProduct.Properties.mechanizationLevelSk == event.getAffectedEditor()) {
			sortingPlanProduct.setMechanizationLevelSk((java.math.BigDecimal)EEFConverterUtil.createFromString(EcorePackage.Literals.EBIG_DECIMAL, (String)event.getNewValue()));
		}
		if (SortingPlansViewsRepository.SortingPlanProduct.Properties.throughputTypeSk == event.getAffectedEditor()) {
			sortingPlanProduct.setThroughputTypeSk((java.math.BigDecimal)EEFConverterUtil.createFromString(EcorePackage.Literals.EBIG_DECIMAL, (String)event.getNewValue()));
		}
		if (SortingPlansViewsRepository.SortingPlanProduct.Properties.destinationSk == event.getAffectedEditor()) {
			sortingPlanProduct.setDestinationSk((java.math.BigDecimal)EEFConverterUtil.createFromString(EcorePackage.Literals.EBIG_DECIMAL, (String)event.getNewValue()));
		}
		if (SortingPlansViewsRepository.SortingPlanProduct.Properties.endProduct == event.getAffectedEditor()) {
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
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		super.updatePart(msg);
		if (editingPart.isVisible()) {
			SortingPlanProductPropertiesEditionPart basePart = (SortingPlanProductPropertiesEditionPart)editingPart;
			if (cptspPackage.eINSTANCE.getSortingPlanProduct_FPDSortingLevel().equals(msg.getFeature()) && basePart != null && isAccessible(SortingPlansViewsRepository.SortingPlanProduct.Properties.fPDSortingLevel))
				basePart.setFPDSortingLevel((EObject)msg.getNewValue());
			if (cptspPackage.eINSTANCE.getSortingPlanProduct_SortingPlansProducing().equals(msg.getFeature())  && isAccessible(SortingPlansViewsRepository.SortingPlanProduct.Properties.sortingPlansProducing))
				basePart.updateSortingPlansProducing();
			if (cptspPackage.eINSTANCE.getSortingPlanProduct_SortingPlansAccepting().equals(msg.getFeature())  && isAccessible(SortingPlansViewsRepository.SortingPlanProduct.Properties.sortingPlansAccepting))
				basePart.updateSortingPlansAccepting();
			if (cptspPackage.eINSTANCE.getSortingPlanProduct_SortingLevelAVCSSk().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(SortingPlansViewsRepository.SortingPlanProduct.Properties.sortingLevelAVCSSk)) {
				if (msg.getNewValue() != null) {
					basePart.setSortingLevelAVCSSk(EcoreUtil.convertToString(EcorePackage.Literals.EBIG_DECIMAL, msg.getNewValue()));
				} else {
					basePart.setSortingLevelAVCSSk("");
				}
			}
			if (cptspPackage.eINSTANCE.getSortingPlanProduct_MechanizationLevelSk().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(SortingPlansViewsRepository.SortingPlanProduct.Properties.mechanizationLevelSk)) {
				if (msg.getNewValue() != null) {
					basePart.setMechanizationLevelSk(EcoreUtil.convertToString(EcorePackage.Literals.EBIG_DECIMAL, msg.getNewValue()));
				} else {
					basePart.setMechanizationLevelSk("");
				}
			}
			if (cptspPackage.eINSTANCE.getSortingPlanProduct_ThroughputTypeSk().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(SortingPlansViewsRepository.SortingPlanProduct.Properties.throughputTypeSk)) {
				if (msg.getNewValue() != null) {
					basePart.setThroughputTypeSk(EcoreUtil.convertToString(EcorePackage.Literals.EBIG_DECIMAL, msg.getNewValue()));
				} else {
					basePart.setThroughputTypeSk("");
				}
			}
			if (cptspPackage.eINSTANCE.getSortingPlanProduct_DestinationSk().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(SortingPlansViewsRepository.SortingPlanProduct.Properties.destinationSk)) {
				if (msg.getNewValue() != null) {
					basePart.setDestinationSk(EcoreUtil.convertToString(EcorePackage.Literals.EBIG_DECIMAL, msg.getNewValue()));
				} else {
					basePart.setDestinationSk("");
				}
			}
			if (cptspPackage.eINSTANCE.getSortingPlanProduct_EndProduct().equals(msg.getFeature()) && basePart != null && isAccessible(SortingPlansViewsRepository.SortingPlanProduct.Properties.endProduct))
				basePart.setEndProduct((EObject)msg.getNewValue());
			
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
			cptspPackage.eINSTANCE.getSortingPlanProduct_FPDSortingLevel(),
			cptspPackage.eINSTANCE.getSortingPlanProduct_SortingPlansProducing(),
			cptspPackage.eINSTANCE.getSortingPlanProduct_SortingPlansAccepting(),
			cptspPackage.eINSTANCE.getSortingPlanProduct_SortingLevelAVCSSk(),
			cptspPackage.eINSTANCE.getSortingPlanProduct_MechanizationLevelSk(),
			cptspPackage.eINSTANCE.getSortingPlanProduct_ThroughputTypeSk(),
			cptspPackage.eINSTANCE.getSortingPlanProduct_DestinationSk(),
			cptspPackage.eINSTANCE.getSortingPlanProduct_EndProduct()		);
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
				if (SortingPlansViewsRepository.SortingPlanProduct.Properties.sortingLevelAVCSSk == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(cptspPackage.eINSTANCE.getSortingPlanProduct_SortingLevelAVCSSk().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(cptspPackage.eINSTANCE.getSortingPlanProduct_SortingLevelAVCSSk().getEAttributeType(), newValue);
				}
				if (SortingPlansViewsRepository.SortingPlanProduct.Properties.mechanizationLevelSk == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(cptspPackage.eINSTANCE.getSortingPlanProduct_MechanizationLevelSk().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(cptspPackage.eINSTANCE.getSortingPlanProduct_MechanizationLevelSk().getEAttributeType(), newValue);
				}
				if (SortingPlansViewsRepository.SortingPlanProduct.Properties.throughputTypeSk == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(cptspPackage.eINSTANCE.getSortingPlanProduct_ThroughputTypeSk().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(cptspPackage.eINSTANCE.getSortingPlanProduct_ThroughputTypeSk().getEAttributeType(), newValue);
				}
				if (SortingPlansViewsRepository.SortingPlanProduct.Properties.destinationSk == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(cptspPackage.eINSTANCE.getSortingPlanProduct_DestinationSk().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(cptspPackage.eINSTANCE.getSortingPlanProduct_DestinationSk().getEAttributeType(), newValue);
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
