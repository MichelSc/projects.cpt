/**
 */
package com.misc.projects.SortingPlans;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>End Product Sorting Plan Input</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.projects.SortingPlans.EndProductSortingPlanInput#getSortingPlan <em>Sorting Plan</em>}</li>
 *   <li>{@link com.misc.projects.SortingPlans.EndProductSortingPlanInput#getInputProduct <em>Input Product</em>}</li>
 *   <li>{@link com.misc.projects.SortingPlans.EndProductSortingPlanInput#getSortingPlanInput <em>Sorting Plan Input</em>}</li>
 *   <li>{@link com.misc.projects.SortingPlans.EndProductSortingPlanInput#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @see com.misc.projects.SortingPlans.cptspPackage#getEndProductSortingPlanInput()
 * @model
 * @generated
 */
public interface EndProductSortingPlanInput extends EObject {
	/**
	 * Returns the value of the '<em><b>Sorting Plan</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link com.misc.projects.SortingPlans.EndProductSortingPlan#getInputs <em>Inputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sorting Plan</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sorting Plan</em>' container reference.
	 * @see #setSortingPlan(EndProductSortingPlan)
	 * @see com.misc.projects.SortingPlans.cptspPackage#getEndProductSortingPlanInput_SortingPlan()
	 * @see com.misc.projects.SortingPlans.EndProductSortingPlan#getInputs
	 * @model opposite="Inputs" required="true" transient="false"
	 * @generated
	 */
	EndProductSortingPlan getSortingPlan();

	/**
	 * Sets the value of the '{@link com.misc.projects.SortingPlans.EndProductSortingPlanInput#getSortingPlan <em>Sorting Plan</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sorting Plan</em>' container reference.
	 * @see #getSortingPlan()
	 * @generated
	 */
	void setSortingPlan(EndProductSortingPlan value);

	/**
	 * Returns the value of the '<em><b>Input Product</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link com.misc.projects.SortingPlans.EndProductInProduct#getSortingPlansAccepting <em>Sorting Plans Accepting</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input Product</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Product</em>' reference.
	 * @see #setInputProduct(EndProductInProduct)
	 * @see com.misc.projects.SortingPlans.cptspPackage#getEndProductSortingPlanInput_InputProduct()
	 * @see com.misc.projects.SortingPlans.EndProductInProduct#getSortingPlansAccepting
	 * @model opposite="SortingPlansAccepting" required="true"
	 * @generated
	 */
	EndProductInProduct getInputProduct();

	/**
	 * Sets the value of the '{@link com.misc.projects.SortingPlans.EndProductSortingPlanInput#getInputProduct <em>Input Product</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input Product</em>' reference.
	 * @see #getInputProduct()
	 * @generated
	 */
	void setInputProduct(EndProductInProduct value);

	/**
	 * Returns the value of the '<em><b>Sorting Plan Input</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sorting Plan Input</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sorting Plan Input</em>' reference.
	 * @see #setSortingPlanInput(SortingPlanInput)
	 * @see com.misc.projects.SortingPlans.cptspPackage#getEndProductSortingPlanInput_SortingPlanInput()
	 * @model
	 * @generated
	 */
	SortingPlanInput getSortingPlanInput();

	/**
	 * Sets the value of the '{@link com.misc.projects.SortingPlans.EndProductSortingPlanInput#getSortingPlanInput <em>Sorting Plan Input</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sorting Plan Input</em>' reference.
	 * @see #getSortingPlanInput()
	 * @generated
	 */
	void setSortingPlanInput(SortingPlanInput value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see com.misc.projects.SortingPlans.cptspPackage#getEndProductSortingPlanInput_Description()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	String getDescription();

} // EndProductSortingPlanInput
