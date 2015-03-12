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
public interface SortingPlanProductPropertiesEditionPart {

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
	 * Init the SortingPlansProducing
	 * @param settings settings for the SortingPlansProducing ReferencesTable 
	 */
	public void initSortingPlansProducing(ReferencesTableSettings settings);

	/**
	 * Update the SortingPlansProducing
	 * @param newValue the SortingPlansProducing to update
	 * 
	 */
	public void updateSortingPlansProducing();

	/**
	 * Adds the given filter to the SortingPlansProducing edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToSortingPlansProducing(ViewerFilter filter);

	/**
	 * Adds the given filter to the SortingPlansProducing edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToSortingPlansProducing(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the SortingPlansProducing table
	 * 
	 */
	public boolean isContainedInSortingPlansProducingTable(EObject element);




	/**
	 * Init the SortingPlansAccepting
	 * @param settings settings for the SortingPlansAccepting ReferencesTable 
	 */
	public void initSortingPlansAccepting(ReferencesTableSettings settings);

	/**
	 * Update the SortingPlansAccepting
	 * @param newValue the SortingPlansAccepting to update
	 * 
	 */
	public void updateSortingPlansAccepting();

	/**
	 * Adds the given filter to the SortingPlansAccepting edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToSortingPlansAccepting(ViewerFilter filter);

	/**
	 * Adds the given filter to the SortingPlansAccepting edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToSortingPlansAccepting(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the SortingPlansAccepting table
	 * 
	 */
	public boolean isContainedInSortingPlansAcceptingTable(EObject element);


	/**
	 * @return the SortingLevelAVCSSk
	 * 
	 */
	public String getSortingLevelAVCSSk();

	/**
	 * Defines a new SortingLevelAVCSSk
	 * @param newValue the new SortingLevelAVCSSk to set
	 * 
	 */
	public void setSortingLevelAVCSSk(String newValue);


	/**
	 * @return the MechanizationLevelSk
	 * 
	 */
	public String getMechanizationLevelSk();

	/**
	 * Defines a new MechanizationLevelSk
	 * @param newValue the new MechanizationLevelSk to set
	 * 
	 */
	public void setMechanizationLevelSk(String newValue);


	/**
	 * @return the ThroughputTypeSk
	 * 
	 */
	public String getThroughputTypeSk();

	/**
	 * Defines a new ThroughputTypeSk
	 * @param newValue the new ThroughputTypeSk to set
	 * 
	 */
	public void setThroughputTypeSk(String newValue);


	/**
	 * @return the DestinationSk
	 * 
	 */
	public String getDestinationSk();

	/**
	 * Defines a new DestinationSk
	 * @param newValue the new DestinationSk to set
	 * 
	 */
	public void setDestinationSk(String newValue);


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
	 * Returns the internationalized title text.
	 * 
	 * @return the internationalized title text.
	 * 
	 */
	public String getTitle();

	// Start of user code for additional methods
	
	// End of user code

}
