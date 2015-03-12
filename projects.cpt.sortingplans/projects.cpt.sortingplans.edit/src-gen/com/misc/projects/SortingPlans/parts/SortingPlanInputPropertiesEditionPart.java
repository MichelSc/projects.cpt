/**
 * Generated with Acceleo
 */
package com.misc.projects.SortingPlans.parts;

// Start of user code for imports
import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;

import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;

import org.eclipse.jface.viewers.ViewerFilter;


// End of user code

/**
 * 
 * 
 */
public interface SortingPlanInputPropertiesEditionPart {

	/**
	 * @return the InputProduct
	 * 
	 */
	public EObject getInputProduct();

	/**
	 * Init the InputProduct
	 * @param settings the combo setting
	 */
	public void initInputProduct(EObjectFlatComboSettings settings);

	/**
	 * Defines a new InputProduct
	 * @param newValue the new InputProduct to set
	 * 
	 */
	public void setInputProduct(EObject newValue);

	/**
	 * Defines the button mode
	 * @param newValue the new mode to set
	 * 
	 */
	public void setInputProductButtonMode(ButtonsModeEnum newValue);

	/**
	 * Adds the given filter to the InputProduct edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToInputProduct(ViewerFilter filter);

	/**
	 * Adds the given filter to the InputProduct edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToInputProduct(ViewerFilter filter);


	/**
	 * @return the FPDSortingPlanInput
	 * 
	 */
	public EObject getFPDSortingPlanInput();

	/**
	 * Init the FPDSortingPlanInput
	 * @param settings the combo setting
	 */
	public void initFPDSortingPlanInput(EObjectFlatComboSettings settings);

	/**
	 * Defines a new FPDSortingPlanInput
	 * @param newValue the new FPDSortingPlanInput to set
	 * 
	 */
	public void setFPDSortingPlanInput(EObject newValue);

	/**
	 * Defines the button mode
	 * @param newValue the new mode to set
	 * 
	 */
	public void setFPDSortingPlanInputButtonMode(ButtonsModeEnum newValue);

	/**
	 * Adds the given filter to the FPDSortingPlanInput edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToFPDSortingPlanInput(ViewerFilter filter);

	/**
	 * Adds the given filter to the FPDSortingPlanInput edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToFPDSortingPlanInput(ViewerFilter filter);


	/**
	 * @return the SortingPlan
	 * 
	 */
	public EObject getSortingPlan();

	/**
	 * Init the SortingPlan
	 * @param settings the combo setting
	 */
	public void initSortingPlan(EObjectFlatComboSettings settings);

	/**
	 * Defines a new SortingPlan
	 * @param newValue the new SortingPlan to set
	 * 
	 */
	public void setSortingPlan(EObject newValue);

	/**
	 * Defines the button mode
	 * @param newValue the new mode to set
	 * 
	 */
	public void setSortingPlanButtonMode(ButtonsModeEnum newValue);

	/**
	 * Adds the given filter to the SortingPlan edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToSortingPlan(ViewerFilter filter);

	/**
	 * Adds the given filter to the SortingPlan edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToSortingPlan(ViewerFilter filter);





	/**
	 * Returns the internationalized title text.
	 * 
	 * @return the internationalized title text.
	 * 
	 */
	public String getTitle();

	// Start of user code for additional methods
	
	// End of user code

}
