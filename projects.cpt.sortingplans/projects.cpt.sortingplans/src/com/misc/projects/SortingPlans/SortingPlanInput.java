/**
 */
package com.misc.projects.SortingPlans;

import com.misc.common.moplaf.propagator.ObjectWithPropagatorFunctionAdapter;
import com.misc.projects.CptDatasetLoad.SortingPlanInputRow;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sorting Plan Input</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.projects.SortingPlans.SortingPlanInput#getInputProduct <em>Input Product</em>}</li>
 *   <li>{@link com.misc.projects.SortingPlans.SortingPlanInput#getFPDSortingPlanInput <em>FPD Sorting Plan Input</em>}</li>
 *   <li>{@link com.misc.projects.SortingPlans.SortingPlanInput#getDescription <em>Description</em>}</li>
 *   <li>{@link com.misc.projects.SortingPlans.SortingPlanInput#getSortingPlan <em>Sorting Plan</em>}</li>
 * </ul>
 *
 * @see com.misc.projects.SortingPlans.cptspPackage#getSortingPlanInput()
 * @model
 * @generated
 */
public interface SortingPlanInput extends ObjectWithPropagatorFunctionAdapter {
	/**
	 * Returns the value of the '<em><b>Input Product</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link com.misc.projects.SortingPlans.SortingPlanProduct#getSortingPlansAccepting <em>Sorting Plans Accepting</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input Product</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Product</em>' reference.
	 * @see #setInputProduct(SortingPlanProduct)
	 * @see com.misc.projects.SortingPlans.cptspPackage#getSortingPlanInput_InputProduct()
	 * @see com.misc.projects.SortingPlans.SortingPlanProduct#getSortingPlansAccepting
	 * @model opposite="SortingPlansAccepting" required="true"
	 * @generated
	 */
	SortingPlanProduct getInputProduct();

	/**
	 * Sets the value of the '{@link com.misc.projects.SortingPlans.SortingPlanInput#getInputProduct <em>Input Product</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input Product</em>' reference.
	 * @see #getInputProduct()
	 * @generated
	 */
	void setInputProduct(SortingPlanProduct value);

	/**
	 * Returns the value of the '<em><b>FPD Sorting Plan Input</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>FPD Sorting Plan Input</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>FPD Sorting Plan Input</em>' reference.
	 * @see #setFPDSortingPlanInput(SortingPlanInputRow)
	 * @see com.misc.projects.SortingPlans.cptspPackage#getSortingPlanInput_FPDSortingPlanInput()
	 * @model
	 * @generated
	 */
	SortingPlanInputRow getFPDSortingPlanInput();

	/**
	 * Sets the value of the '{@link com.misc.projects.SortingPlans.SortingPlanInput#getFPDSortingPlanInput <em>FPD Sorting Plan Input</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>FPD Sorting Plan Input</em>' reference.
	 * @see #getFPDSortingPlanInput()
	 * @generated
	 */
	void setFPDSortingPlanInput(SortingPlanInputRow value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see com.misc.projects.SortingPlans.cptspPackage#getSortingPlanInput_Description()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	String getDescription();

	/**
	 * Returns the value of the '<em><b>Sorting Plan</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link com.misc.projects.SortingPlans.SortingPlan#getInputs <em>Inputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sorting Plan</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sorting Plan</em>' container reference.
	 * @see #setSortingPlan(SortingPlan)
	 * @see com.misc.projects.SortingPlans.cptspPackage#getSortingPlanInput_SortingPlan()
	 * @see com.misc.projects.SortingPlans.SortingPlan#getInputs
	 * @model opposite="Inputs" required="true" transient="false"
	 * @generated
	 */
	SortingPlan getSortingPlan();

	/**
	 * Sets the value of the '{@link com.misc.projects.SortingPlans.SortingPlanInput#getSortingPlan <em>Sorting Plan</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sorting Plan</em>' container reference.
	 * @see #getSortingPlan()
	 * @generated
	 */
	void setSortingPlan(SortingPlan value);

} // SortingPlanInput
