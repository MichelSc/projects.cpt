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
public interface EndProductPropertiesEditionPart {

	/**
	 * @return the FPDSortingLevel
	 * 
	 */
	public EObject getFPDSortingLevel();

	/**
	 * Init the FPDSortingLevel
	 * @param settings the combo setting
	 */
	public void initFPDSortingLevel(EObjectFlatComboSettings settings);

	/**
	 * Defines a new FPDSortingLevel
	 * @param newValue the new FPDSortingLevel to set
	 * 
	 */
	public void setFPDSortingLevel(EObject newValue);

	/**
	 * Defines the button mode
	 * @param newValue the new mode to set
	 * 
	 */
	public void setFPDSortingLevelButtonMode(ButtonsModeEnum newValue);

	/**
	 * Adds the given filter to the FPDSortingLevel edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToFPDSortingLevel(ViewerFilter filter);

	/**
	 * Adds the given filter to the FPDSortingLevel edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToFPDSortingLevel(ViewerFilter filter);


	/**
	 * @return the SortingPlanProduct
	 * 
	 */
	public EObject getSortingPlanProduct();

	/**
	 * Init the SortingPlanProduct
	 * @param settings the combo setting
	 */
	public void initSortingPlanProduct(EObjectFlatComboSettings settings);

	/**
	 * Defines a new SortingPlanProduct
	 * @param newValue the new SortingPlanProduct to set
	 * 
	 */
	public void setSortingPlanProduct(EObject newValue);

	/**
	 * Defines the button mode
	 * @param newValue the new mode to set
	 * 
	 */
	public void setSortingPlanProductButtonMode(ButtonsModeEnum newValue);

	/**
	 * Adds the given filter to the SortingPlanProduct edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToSortingPlanProduct(ViewerFilter filter);

	/**
	 * Adds the given filter to the SortingPlanProduct edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToSortingPlanProduct(ViewerFilter filter);


	/**
	 * @return the whichSortingPlans
	 * 
	 */
	public Boolean getWhichSortingPlans();

	/**
	 * Defines a new whichSortingPlans
	 * @param newValue the new whichSortingPlans to set
	 * 
	 */
	public void setWhichSortingPlans(Boolean newValue);


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
