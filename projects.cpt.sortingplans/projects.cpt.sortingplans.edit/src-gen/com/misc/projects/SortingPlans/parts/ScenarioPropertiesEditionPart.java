/**
 * Generated with Acceleo
 */
package com.misc.projects.SortingPlans.parts;

// Start of user code for imports
import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;

import org.eclipse.jface.viewers.ViewerFilter;


// End of user code

/**
 * 
 * 
 */
public interface ScenarioPropertiesEditionPart {

	/**
	 * @return the Name
	 * 
	 */
	public String getName();

	/**
	 * Defines a new Name
	 * @param newValue the new Name to set
	 * 
	 */
	public void setName(String newValue);




	/**
	 * Init the SortingLevelsWithDestination
	 * @param settings settings for the SortingLevelsWithDestination ReferencesTable 
	 */
	public void initSortingLevelsWithDestination(ReferencesTableSettings settings);

	/**
	 * Update the SortingLevelsWithDestination
	 * @param newValue the SortingLevelsWithDestination to update
	 * 
	 */
	public void updateSortingLevelsWithDestination();

	/**
	 * Adds the given filter to the SortingLevelsWithDestination edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToSortingLevelsWithDestination(ViewerFilter filter);

	/**
	 * Adds the given filter to the SortingLevelsWithDestination edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToSortingLevelsWithDestination(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the SortingLevelsWithDestination table
	 * 
	 */
	public boolean isContainedInSortingLevelsWithDestinationTable(EObject element);




	/**
	 * Init the SelectedSortingPlans
	 * @param settings settings for the SelectedSortingPlans ReferencesTable 
	 */
	public void initSelectedSortingPlans(ReferencesTableSettings settings);

	/**
	 * Update the SelectedSortingPlans
	 * @param newValue the SelectedSortingPlans to update
	 * 
	 */
	public void updateSelectedSortingPlans();

	/**
	 * Adds the given filter to the SelectedSortingPlans edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToSelectedSortingPlans(ViewerFilter filter);

	/**
	 * Adds the given filter to the SelectedSortingPlans edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToSelectedSortingPlans(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the SelectedSortingPlans table
	 * 
	 */
	public boolean isContainedInSelectedSortingPlansTable(EObject element);





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
