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
public interface SortingPlanEndProductPropertiesEditionPart {



	/**
	 * Init the Output
	 * @param settings settings for the Output ReferencesTable 
	 */
	public void initOutput(ReferencesTableSettings settings);

	/**
	 * Update the Output
	 * @param newValue the Output to update
	 * 
	 */
	public void updateOutput();

	/**
	 * Adds the given filter to the Output edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToOutput(ViewerFilter filter);

	/**
	 * Adds the given filter to the Output edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToOutput(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the Output table
	 * 
	 */
	public boolean isContainedInOutputTable(EObject element);


	/**
	 * @return the EndProduct
	 * 
	 */
	public EObject getEndProduct();

	/**
	 * Init the EndProduct
	 * @param settings the combo setting
	 */
	public void initEndProduct(EObjectFlatComboSettings settings);

	/**
	 * Defines a new EndProduct
	 * @param newValue the new EndProduct to set
	 * 
	 */
	public void setEndProduct(EObject newValue);

	/**
	 * Defines the button mode
	 * @param newValue the new mode to set
	 * 
	 */
	public void setEndProductButtonMode(ButtonsModeEnum newValue);

	/**
	 * Adds the given filter to the EndProduct edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToEndProduct(ViewerFilter filter);

	/**
	 * Adds the given filter to the EndProduct edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToEndProduct(ViewerFilter filter);


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
