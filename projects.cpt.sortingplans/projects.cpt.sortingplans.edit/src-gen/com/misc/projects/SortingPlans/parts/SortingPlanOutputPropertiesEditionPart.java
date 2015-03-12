/**
 * Generated with Acceleo
 */
package com.misc.projects.SortingPlans.parts;

// Start of user code for imports
import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;

import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;

import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;

import org.eclipse.jface.viewers.ViewerFilter;


// End of user code

/**
 * 
 * 
 */
public interface SortingPlanOutputPropertiesEditionPart {

	/**
	 * @return the FPDSortingPlanOutput
	 * 
	 */
	public EObject getFPDSortingPlanOutput();

	/**
	 * Init the FPDSortingPlanOutput
	 * @param settings the combo setting
	 */
	public void initFPDSortingPlanOutput(EObjectFlatComboSettings settings);

	/**
	 * Defines a new FPDSortingPlanOutput
	 * @param newValue the new FPDSortingPlanOutput to set
	 * 
	 */
	public void setFPDSortingPlanOutput(EObject newValue);

	/**
	 * Defines the button mode
	 * @param newValue the new mode to set
	 * 
	 */
	public void setFPDSortingPlanOutputButtonMode(ButtonsModeEnum newValue);

	/**
	 * Adds the given filter to the FPDSortingPlanOutput edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToFPDSortingPlanOutput(ViewerFilter filter);

	/**
	 * Adds the given filter to the FPDSortingPlanOutput edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToFPDSortingPlanOutput(ViewerFilter filter);


	/**
	 * @return the OutputProduct
	 * 
	 */
	public EObject getOutputProduct();

	/**
	 * Init the OutputProduct
	 * @param settings the combo setting
	 */
	public void initOutputProduct(EObjectFlatComboSettings settings);

	/**
	 * Defines a new OutputProduct
	 * @param newValue the new OutputProduct to set
	 * 
	 */
	public void setOutputProduct(EObject newValue);

	/**
	 * Defines the button mode
	 * @param newValue the new mode to set
	 * 
	 */
	public void setOutputProductButtonMode(ButtonsModeEnum newValue);

	/**
	 * Adds the given filter to the OutputProduct edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToOutputProduct(ViewerFilter filter);

	/**
	 * Adds the given filter to the OutputProduct edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToOutputProduct(ViewerFilter filter);




	/**
	 * Init the SortingPlanEndProduct
	 * @param settings settings for the SortingPlanEndProduct ReferencesTable 
	 */
	public void initSortingPlanEndProduct(ReferencesTableSettings settings);

	/**
	 * Update the SortingPlanEndProduct
	 * @param newValue the SortingPlanEndProduct to update
	 * 
	 */
	public void updateSortingPlanEndProduct();

	/**
	 * Adds the given filter to the SortingPlanEndProduct edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToSortingPlanEndProduct(ViewerFilter filter);

	/**
	 * Adds the given filter to the SortingPlanEndProduct edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToSortingPlanEndProduct(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the SortingPlanEndProduct table
	 * 
	 */
	public boolean isContainedInSortingPlanEndProductTable(EObject element);


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
