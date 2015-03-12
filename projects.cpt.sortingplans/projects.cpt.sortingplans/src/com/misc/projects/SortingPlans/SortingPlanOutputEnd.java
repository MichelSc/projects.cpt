/**
 */
package com.misc.projects.SortingPlans;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sorting Plan Output End</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.misc.projects.SortingPlans.SortingPlanOutputEnd#getEndProduct <em>End Product</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.misc.projects.SortingPlans.cptspPackage#getSortingPlanOutputEnd()
 * @model
 * @generated
 */
public interface SortingPlanOutputEnd extends SortingPlanOutput {
	/**
	 * Returns the value of the '<em><b>End Product</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End Product</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Product</em>' reference.
	 * @see #setEndProduct(EndProduct)
	 * @see com.misc.projects.SortingPlans.cptspPackage#getSortingPlanOutputEnd_EndProduct()
	 * @model required="true"
	 * @generated
	 */
	EndProduct getEndProduct();

	/**
	 * Sets the value of the '{@link com.misc.projects.SortingPlans.SortingPlanOutputEnd#getEndProduct <em>End Product</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Product</em>' reference.
	 * @see #getEndProduct()
	 * @generated
	 */
	void setEndProduct(EndProduct value);

} // SortingPlanOutputEnd
