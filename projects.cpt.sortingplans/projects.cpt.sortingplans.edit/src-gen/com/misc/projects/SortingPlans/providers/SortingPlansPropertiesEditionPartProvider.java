/**
 * Generated with Acceleo
 */
package com.misc.projects.SortingPlans.providers;

import com.misc.projects.SortingPlans.parts.SortingPlansViewsRepository;

import com.misc.projects.SortingPlans.parts.forms.EndProductPropertiesEditionPartForm;
import com.misc.projects.SortingPlans.parts.forms.ScenarioPropertiesEditionPartForm;
import com.misc.projects.SortingPlans.parts.forms.ScenariosPropertiesEditionPartForm;
import com.misc.projects.SortingPlans.parts.forms.SortingPlanEndProductPropertiesEditionPartForm;
import com.misc.projects.SortingPlans.parts.forms.SortingPlanInputPropertiesEditionPartForm;
import com.misc.projects.SortingPlans.parts.forms.SortingPlanOutputPropertiesEditionPartForm;
import com.misc.projects.SortingPlans.parts.forms.SortingPlanProductPropertiesEditionPartForm;
import com.misc.projects.SortingPlans.parts.forms.SortingPlanPropertiesEditionPartForm;

import com.misc.projects.SortingPlans.parts.impl.EndProductPropertiesEditionPartImpl;
import com.misc.projects.SortingPlans.parts.impl.ScenarioPropertiesEditionPartImpl;
import com.misc.projects.SortingPlans.parts.impl.ScenariosPropertiesEditionPartImpl;
import com.misc.projects.SortingPlans.parts.impl.SortingPlanEndProductPropertiesEditionPartImpl;
import com.misc.projects.SortingPlans.parts.impl.SortingPlanInputPropertiesEditionPartImpl;
import com.misc.projects.SortingPlans.parts.impl.SortingPlanOutputPropertiesEditionPartImpl;
import com.misc.projects.SortingPlans.parts.impl.SortingPlanProductPropertiesEditionPartImpl;
import com.misc.projects.SortingPlans.parts.impl.SortingPlanPropertiesEditionPartImpl;

import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;

import org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart;

import org.eclipse.emf.eef.runtime.api.providers.IPropertiesEditionPartProvider;

/**
 * 
 * 
 */
public class SortingPlansPropertiesEditionPartProvider implements IPropertiesEditionPartProvider {

	/** 
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPartProvider#provides(java.lang.Object)
	 * 
	 */
	public boolean provides(Object key) {
		return key == SortingPlansViewsRepository.class;
	}

	/** 
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPartProvider#getPropertiesEditionPart(java.lang.Object, int, org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent)
	 * 
	 */
	public IPropertiesEditionPart getPropertiesEditionPart(Object key, int kind, IPropertiesEditionComponent component) {
		if (key == SortingPlansViewsRepository.Scenarios.class) {
			if (kind == SortingPlansViewsRepository.SWT_KIND)
				return new ScenariosPropertiesEditionPartImpl(component);
			if (kind == SortingPlansViewsRepository.FORM_KIND)
				return new ScenariosPropertiesEditionPartForm(component);
		}
		if (key == SortingPlansViewsRepository.Scenario.class) {
			if (kind == SortingPlansViewsRepository.SWT_KIND)
				return new ScenarioPropertiesEditionPartImpl(component);
			if (kind == SortingPlansViewsRepository.FORM_KIND)
				return new ScenarioPropertiesEditionPartForm(component);
		}
		if (key == SortingPlansViewsRepository.SortingPlan.class) {
			if (kind == SortingPlansViewsRepository.SWT_KIND)
				return new SortingPlanPropertiesEditionPartImpl(component);
			if (kind == SortingPlansViewsRepository.FORM_KIND)
				return new SortingPlanPropertiesEditionPartForm(component);
		}
		if (key == SortingPlansViewsRepository.EndProduct.class) {
			if (kind == SortingPlansViewsRepository.SWT_KIND)
				return new EndProductPropertiesEditionPartImpl(component);
			if (kind == SortingPlansViewsRepository.FORM_KIND)
				return new EndProductPropertiesEditionPartForm(component);
		}
		if (key == SortingPlansViewsRepository.SortingPlanProduct.class) {
			if (kind == SortingPlansViewsRepository.SWT_KIND)
				return new SortingPlanProductPropertiesEditionPartImpl(component);
			if (kind == SortingPlansViewsRepository.FORM_KIND)
				return new SortingPlanProductPropertiesEditionPartForm(component);
		}
		if (key == SortingPlansViewsRepository.SortingPlanEndProduct.class) {
			if (kind == SortingPlansViewsRepository.SWT_KIND)
				return new SortingPlanEndProductPropertiesEditionPartImpl(component);
			if (kind == SortingPlansViewsRepository.FORM_KIND)
				return new SortingPlanEndProductPropertiesEditionPartForm(component);
		}
		if (key == SortingPlansViewsRepository.SortingPlanOutput.class) {
			if (kind == SortingPlansViewsRepository.SWT_KIND)
				return new SortingPlanOutputPropertiesEditionPartImpl(component);
			if (kind == SortingPlansViewsRepository.FORM_KIND)
				return new SortingPlanOutputPropertiesEditionPartForm(component);
		}
		if (key == SortingPlansViewsRepository.SortingPlanInput.class) {
			if (kind == SortingPlansViewsRepository.SWT_KIND)
				return new SortingPlanInputPropertiesEditionPartImpl(component);
			if (kind == SortingPlansViewsRepository.FORM_KIND)
				return new SortingPlanInputPropertiesEditionPartForm(component);
		}
		return null;
	}

}
