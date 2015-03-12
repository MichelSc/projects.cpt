/**
 */
package com.misc.projects.SortingPlans;

import com.misc.projects.CptDatasetLoad.SortingLevelRow;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Intermediary Product</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.misc.projects.SortingPlans.IntermediaryProduct#getSortingPlansAccepting <em>Sorting Plans Accepting</em>}</li>
 *   <li>{@link com.misc.projects.SortingPlans.IntermediaryProduct#getSortingPlansProducing <em>Sorting Plans Producing</em>}</li>
 *   <li>{@link com.misc.projects.SortingPlans.IntermediaryProduct#getFPDSortingLevel <em>FPD Sorting Level</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.misc.projects.SortingPlans.cptspPackage#getIntermediaryProduct()
 * @model
 * @generated
 */
public interface IntermediaryProduct extends EObject {
	/**
	 * Returns the value of the '<em><b>Sorting Plans Accepting</b></em>' reference list.
	 * The list contents are of type {@link com.misc.projects.SortingPlans.SortingPlanInputIntermediary}.
	 * It is bidirectional and its opposite is '{@link com.misc.projects.SortingPlans.SortingPlanInputIntermediary#getIntermediaryProduct <em>Intermediary Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sorting Plans Accepting</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sorting Plans Accepting</em>' reference list.
	 * @see com.misc.projects.SortingPlans.cptspPackage#getIntermediaryProduct_SortingPlansAccepting()
	 * @see com.misc.projects.SortingPlans.SortingPlanInputIntermediary#getIntermediaryProduct
	 * @model opposite="IntermediaryProduct"
	 * @generated
	 */
	EList<SortingPlanInputIntermediary> getSortingPlansAccepting();

	/**
	 * Returns the value of the '<em><b>Sorting Plans Producing</b></em>' reference list.
	 * The list contents are of type {@link com.misc.projects.SortingPlans.SortingPlanOutputIntermediary}.
	 * It is bidirectional and its opposite is '{@link com.misc.projects.SortingPlans.SortingPlanOutputIntermediary#getIntermediaryProduct <em>Intermediary Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sorting Plans Producing</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sorting Plans Producing</em>' reference list.
	 * @see com.misc.projects.SortingPlans.cptspPackage#getIntermediaryProduct_SortingPlansProducing()
	 * @see com.misc.projects.SortingPlans.SortingPlanOutputIntermediary#getIntermediaryProduct
	 * @model opposite="IntermediaryProduct"
	 * @generated
	 */
	EList<SortingPlanOutputIntermediary> getSortingPlansProducing();

	/**
	 * Returns the value of the '<em><b>FPD Sorting Level</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>FPD Sorting Level</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>FPD Sorting Level</em>' reference.
	 * @see #setFPDSortingLevel(SortingLevelRow)
	 * @see com.misc.projects.SortingPlans.cptspPackage#getIntermediaryProduct_FPDSortingLevel()
	 * @model
	 * @generated
	 */
	SortingLevelRow getFPDSortingLevel();

	/**
	 * Sets the value of the '{@link com.misc.projects.SortingPlans.IntermediaryProduct#getFPDSortingLevel <em>FPD Sorting Level</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>FPD Sorting Level</em>' reference.
	 * @see #getFPDSortingLevel()
	 * @generated
	 */
	void setFPDSortingLevel(SortingLevelRow value);

} // IntermediaryProduct
