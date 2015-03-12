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
public interface SortingPlanPropertiesEditionPart {



	/**
	 * Init the EndProducts
	 * @param settings settings for the EndProducts ReferencesTable 
	 */
	public void initEndProducts(ReferencesTableSettings settings);

	/**
	 * Update the EndProducts
	 * @param newValue the EndProducts to update
	 * 
	 */
	public void updateEndProducts();

	/**
	 * Adds the given filter to the EndProducts edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToEndProducts(ViewerFilter filter);

	/**
	 * Adds the given filter to the EndProducts edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToEndProducts(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the EndProducts table
	 * 
	 */
	public boolean isContainedInEndProductsTable(EObject element);


	/**
	 * @return the FPDSortingPlan
	 * 
	 */
	public EObject getFPDSortingPlan();

	/**
	 * Init the FPDSortingPlan
	 * @param settings the combo setting
	 */
	public void initFPDSortingPlan(EObjectFlatComboSettings settings);

	/**
	 * Defines a new FPDSortingPlan
	 * @param newValue the new FPDSortingPlan to set
	 * 
	 */
	public void setFPDSortingPlan(EObject newValue);

	/**
	 * Defines the button mode
	 * @param newValue the new mode to set
	 * 
	 */
	public void setFPDSortingPlanButtonMode(ButtonsModeEnum newValue);

	/**
	 * Adds the given filter to the FPDSortingPlan edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToFPDSortingPlan(ViewerFilter filter);

	/**
	 * Adds the given filter to the FPDSortingPlan edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToFPDSortingPlan(ViewerFilter filter);


	/**
	 * @return the Scenario
	 * 
	 */
	public EObject getScenario();

	/**
	 * Init the Scenario
	 * @param settings the combo setting
	 */
	public void initScenario(EObjectFlatComboSettings settings);

	/**
	 * Defines a new Scenario
	 * @param newValue the new Scenario to set
	 * 
	 */
	public void setScenario(EObject newValue);

	/**
	 * Defines the button mode
	 * @param newValue the new mode to set
	 * 
	 */
	public void setScenarioButtonMode(ButtonsModeEnum newValue);

	/**
	 * Adds the given filter to the Scenario edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToScenario(ViewerFilter filter);

	/**
	 * Adds the given filter to the Scenario edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToScenario(ViewerFilter filter);





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
