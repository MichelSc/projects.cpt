/**
 */
package com.misc.projects.SortingPlans;

import com.misc.common.moplaf.propagator.ObjectWithPropagatorFunctionAdapter;
import com.misc.projects.CptDatasetLoad.SortingPlanOutputRow;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sorting Plan Output</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.projects.SortingPlans.SortingPlanOutput#getFPDSortingPlanOutput <em>FPD Sorting Plan Output</em>}</li>
 *   <li>{@link com.misc.projects.SortingPlans.SortingPlanOutput#getOutputProduct <em>Output Product</em>}</li>
 *   <li>{@link com.misc.projects.SortingPlans.SortingPlanOutput#getDescription <em>Description</em>}</li>
 *   <li>{@link com.misc.projects.SortingPlans.SortingPlanOutput#getSortingPlan <em>Sorting Plan</em>}</li>
 * </ul>
 *
 * @see com.misc.projects.SortingPlans.cptspPackage#getSortingPlanOutput()
 * @model
 * @generated
 */
public interface SortingPlanOutput extends ObjectWithPropagatorFunctionAdapter {
	/**
	 * Returns the value of the '<em><b>FPD Sorting Plan Output</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>FPD Sorting Plan Output</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>FPD Sorting Plan Output</em>' reference.
	 * @see #setFPDSortingPlanOutput(SortingPlanOutputRow)
	 * @see com.misc.projects.SortingPlans.cptspPackage#getSortingPlanOutput_FPDSortingPlanOutput()
	 * @model
	 * @generated
	 */
	SortingPlanOutputRow getFPDSortingPlanOutput();

	/**
	 * Sets the value of the '{@link com.misc.projects.SortingPlans.SortingPlanOutput#getFPDSortingPlanOutput <em>FPD Sorting Plan Output</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>FPD Sorting Plan Output</em>' reference.
	 * @see #getFPDSortingPlanOutput()
	 * @generated
	 */
	void setFPDSortingPlanOutput(SortingPlanOutputRow value);

	/**
	 * Returns the value of the '<em><b>Output Product</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link com.misc.projects.SortingPlans.SortingPlanProduct#getSortingPlansProducing <em>Sorting Plans Producing</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output Product</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output Product</em>' reference.
	 * @see #setOutputProduct(SortingPlanProduct)
	 * @see com.misc.projects.SortingPlans.cptspPackage#getSortingPlanOutput_OutputProduct()
	 * @see com.misc.projects.SortingPlans.SortingPlanProduct#getSortingPlansProducing
	 * @model opposite="SortingPlansProducing" required="true"
	 * @generated
	 */
	SortingPlanProduct getOutputProduct();

	/**
	 * Sets the value of the '{@link com.misc.projects.SortingPlans.SortingPlanOutput#getOutputProduct <em>Output Product</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output Product</em>' reference.
	 * @see #getOutputProduct()
	 * @generated
	 */
	void setOutputProduct(SortingPlanProduct value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see com.misc.projects.SortingPlans.cptspPackage#getSortingPlanOutput_Description()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	String getDescription();

	/**
	 * Returns the value of the '<em><b>Sorting Plan</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link com.misc.projects.SortingPlans.SortingPlan#getOutputs <em>Outputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sorting Plan</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sorting Plan</em>' container reference.
	 * @see #setSortingPlan(SortingPlan)
	 * @see com.misc.projects.SortingPlans.cptspPackage#getSortingPlanOutput_SortingPlan()
	 * @see com.misc.projects.SortingPlans.SortingPlan#getOutputs
	 * @model opposite="Outputs" required="true" transient="false"
	 * @generated
	 */
	SortingPlan getSortingPlan();

	/**
	 * Sets the value of the '{@link com.misc.projects.SortingPlans.SortingPlanOutput#getSortingPlan <em>Sorting Plan</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sorting Plan</em>' container reference.
	 * @see #getSortingPlan()
	 * @generated
	 */
	void setSortingPlan(SortingPlan value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void refeshSortedEndProducts();

} // SortingPlanOutput
