/**
 */
package com.misc.projects.SortingPlans;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>End Product Sorting Plan Output</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.projects.SortingPlans.EndProductSortingPlanOutput#getSortingPlan <em>Sorting Plan</em>}</li>
 *   <li>{@link com.misc.projects.SortingPlans.EndProductSortingPlanOutput#getOutputProduct <em>Output Product</em>}</li>
 *   <li>{@link com.misc.projects.SortingPlans.EndProductSortingPlanOutput#getSortingPlanOutput <em>Sorting Plan Output</em>}</li>
 *   <li>{@link com.misc.projects.SortingPlans.EndProductSortingPlanOutput#isSelected <em>Selected</em>}</li>
 *   <li>{@link com.misc.projects.SortingPlans.EndProductSortingPlanOutput#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @see com.misc.projects.SortingPlans.cptspPackage#getEndProductSortingPlanOutput()
 * @model
 * @generated
 */
public interface EndProductSortingPlanOutput extends EObject {
	/**
	 * Returns the value of the '<em><b>Sorting Plan</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link com.misc.projects.SortingPlans.EndProductSortingPlan#getOutputs <em>Outputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sorting Plan</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sorting Plan</em>' container reference.
	 * @see #setSortingPlan(EndProductSortingPlan)
	 * @see com.misc.projects.SortingPlans.cptspPackage#getEndProductSortingPlanOutput_SortingPlan()
	 * @see com.misc.projects.SortingPlans.EndProductSortingPlan#getOutputs
	 * @model opposite="Outputs" required="true" transient="false"
	 * @generated
	 */
	EndProductSortingPlan getSortingPlan();

	/**
	 * Sets the value of the '{@link com.misc.projects.SortingPlans.EndProductSortingPlanOutput#getSortingPlan <em>Sorting Plan</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sorting Plan</em>' container reference.
	 * @see #getSortingPlan()
	 * @generated
	 */
	void setSortingPlan(EndProductSortingPlan value);

	/**
	 * Returns the value of the '<em><b>Output Product</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link com.misc.projects.SortingPlans.EndProductInProduct#getSortingPlansProducing <em>Sorting Plans Producing</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output Product</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output Product</em>' reference.
	 * @see #setOutputProduct(EndProductInProduct)
	 * @see com.misc.projects.SortingPlans.cptspPackage#getEndProductSortingPlanOutput_OutputProduct()
	 * @see com.misc.projects.SortingPlans.EndProductInProduct#getSortingPlansProducing
	 * @model opposite="SortingPlansProducing" required="true"
	 * @generated
	 */
	EndProductInProduct getOutputProduct();

	/**
	 * Sets the value of the '{@link com.misc.projects.SortingPlans.EndProductSortingPlanOutput#getOutputProduct <em>Output Product</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output Product</em>' reference.
	 * @see #getOutputProduct()
	 * @generated
	 */
	void setOutputProduct(EndProductInProduct value);

	/**
	 * Returns the value of the '<em><b>Sorting Plan Output</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sorting Plan Output</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sorting Plan Output</em>' reference.
	 * @see #setSortingPlanOutput(SortingPlanOutput)
	 * @see com.misc.projects.SortingPlans.cptspPackage#getEndProductSortingPlanOutput_SortingPlanOutput()
	 * @model
	 * @generated
	 */
	SortingPlanOutput getSortingPlanOutput();

	/**
	 * Sets the value of the '{@link com.misc.projects.SortingPlans.EndProductSortingPlanOutput#getSortingPlanOutput <em>Sorting Plan Output</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sorting Plan Output</em>' reference.
	 * @see #getSortingPlanOutput()
	 * @generated
	 */
	void setSortingPlanOutput(SortingPlanOutput value);

	/**
	 * Returns the value of the '<em><b>Selected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Selected</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Selected</em>' attribute.
	 * @see #setSelected(boolean)
	 * @see com.misc.projects.SortingPlans.cptspPackage#getEndProductSortingPlanOutput_Selected()
	 * @model
	 * @generated
	 */
	boolean isSelected();

	/**
	 * Sets the value of the '{@link com.misc.projects.SortingPlans.EndProductSortingPlanOutput#isSelected <em>Selected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Selected</em>' attribute.
	 * @see #isSelected()
	 * @generated
	 */
	void setSelected(boolean value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see com.misc.projects.SortingPlans.cptspPackage#getEndProductSortingPlanOutput_Description()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	String getDescription();

} // EndProductSortingPlanOutput
