/**
 */
package com.misc.projects.SortingPlans;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sorting Plan Output Intermediary</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.misc.projects.SortingPlans.SortingPlanOutputIntermediary#getIntermediaryProduct <em>Intermediary Product</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.misc.projects.SortingPlans.cptspPackage#getSortingPlanOutputIntermediary()
 * @model
 * @generated
 */
public interface SortingPlanOutputIntermediary extends SortingPlanOutput {
	/**
	 * Returns the value of the '<em><b>Intermediary Product</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link com.misc.projects.SortingPlans.IntermediaryProduct#getSortingPlansProducing <em>Sorting Plans Producing</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Intermediary Product</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Intermediary Product</em>' reference.
	 * @see #setIntermediaryProduct(IntermediaryProduct)
	 * @see com.misc.projects.SortingPlans.cptspPackage#getSortingPlanOutputIntermediary_IntermediaryProduct()
	 * @see com.misc.projects.SortingPlans.IntermediaryProduct#getSortingPlansProducing
	 * @model opposite="SortingPlansProducing" required="true"
	 * @generated
	 */
	IntermediaryProduct getIntermediaryProduct();

	/**
	 * Sets the value of the '{@link com.misc.projects.SortingPlans.SortingPlanOutputIntermediary#getIntermediaryProduct <em>Intermediary Product</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Intermediary Product</em>' reference.
	 * @see #getIntermediaryProduct()
	 * @generated
	 */
	void setIntermediaryProduct(IntermediaryProduct value);

} // SortingPlanOutputIntermediary
