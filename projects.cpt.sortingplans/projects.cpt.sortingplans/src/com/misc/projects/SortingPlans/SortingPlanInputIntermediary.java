/**
 */
package com.misc.projects.SortingPlans;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sorting Plan Input Intermediary</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.misc.projects.SortingPlans.SortingPlanInputIntermediary#getIntermediaryProduct <em>Intermediary Product</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.misc.projects.SortingPlans.cptspPackage#getSortingPlanInputIntermediary()
 * @model
 * @generated
 */
public interface SortingPlanInputIntermediary extends EObject {
	/**
	 * Returns the value of the '<em><b>Intermediary Product</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link com.misc.projects.SortingPlans.IntermediaryProduct#getSortingPlansAccepting <em>Sorting Plans Accepting</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Intermediary Product</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Intermediary Product</em>' reference.
	 * @see #setIntermediaryProduct(IntermediaryProduct)
	 * @see com.misc.projects.SortingPlans.cptspPackage#getSortingPlanInputIntermediary_IntermediaryProduct()
	 * @see com.misc.projects.SortingPlans.IntermediaryProduct#getSortingPlansAccepting
	 * @model opposite="SortingPlansAccepting" required="true"
	 * @generated
	 */
	IntermediaryProduct getIntermediaryProduct();

	/**
	 * Sets the value of the '{@link com.misc.projects.SortingPlans.SortingPlanInputIntermediary#getIntermediaryProduct <em>Intermediary Product</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Intermediary Product</em>' reference.
	 * @see #getIntermediaryProduct()
	 * @generated
	 */
	void setIntermediaryProduct(IntermediaryProduct value);

} // SortingPlanInputIntermediary
