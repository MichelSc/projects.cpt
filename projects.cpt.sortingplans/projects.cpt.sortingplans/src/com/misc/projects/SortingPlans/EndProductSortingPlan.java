/**
 */
package com.misc.projects.SortingPlans;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>End Product Sorting Plan</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.projects.SortingPlans.EndProductSortingPlan#getEndProduct <em>End Product</em>}</li>
 *   <li>{@link com.misc.projects.SortingPlans.EndProductSortingPlan#getSortingPlan <em>Sorting Plan</em>}</li>
 *   <li>{@link com.misc.projects.SortingPlans.EndProductSortingPlan#getDescription <em>Description</em>}</li>
 *   <li>{@link com.misc.projects.SortingPlans.EndProductSortingPlan#getOutputs <em>Outputs</em>}</li>
 *   <li>{@link com.misc.projects.SortingPlans.EndProductSortingPlan#getInputs <em>Inputs</em>}</li>
 *   <li>{@link com.misc.projects.SortingPlans.EndProductSortingPlan#getSelectedOutput <em>Selected Output</em>}</li>
 *   <li>{@link com.misc.projects.SortingPlans.EndProductSortingPlan#getSortingDistance <em>Sorting Distance</em>}</li>
 * </ul>
 *
 * @see com.misc.projects.SortingPlans.cptspPackage#getEndProductSortingPlan()
 * @model
 * @generated
 */
public interface EndProductSortingPlan extends EObject {
	/**
	 * Returns the value of the '<em><b>End Product</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link com.misc.projects.SortingPlans.EndProduct#getSortingPlans <em>Sorting Plans</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End Product</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Product</em>' container reference.
	 * @see #setEndProduct(EndProduct)
	 * @see com.misc.projects.SortingPlans.cptspPackage#getEndProductSortingPlan_EndProduct()
	 * @see com.misc.projects.SortingPlans.EndProduct#getSortingPlans
	 * @model opposite="SortingPlans" required="true" transient="false"
	 * @generated
	 */
	EndProduct getEndProduct();

	/**
	 * Sets the value of the '{@link com.misc.projects.SortingPlans.EndProductSortingPlan#getEndProduct <em>End Product</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Product</em>' container reference.
	 * @see #getEndProduct()
	 * @generated
	 */
	void setEndProduct(EndProduct value);

	/**
	 * Returns the value of the '<em><b>Sorting Plan</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link com.misc.projects.SortingPlans.SortingPlan#getEndProducts <em>End Products</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sorting Plan</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sorting Plan</em>' reference.
	 * @see #setSortingPlan(SortingPlan)
	 * @see com.misc.projects.SortingPlans.cptspPackage#getEndProductSortingPlan_SortingPlan()
	 * @see com.misc.projects.SortingPlans.SortingPlan#getEndProducts
	 * @model opposite="EndProducts" required="true"
	 * @generated
	 */
	SortingPlan getSortingPlan();

	/**
	 * Sets the value of the '{@link com.misc.projects.SortingPlans.EndProductSortingPlan#getSortingPlan <em>Sorting Plan</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sorting Plan</em>' reference.
	 * @see #getSortingPlan()
	 * @generated
	 */
	void setSortingPlan(SortingPlan value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see com.misc.projects.SortingPlans.cptspPackage#getEndProductSortingPlan_Description()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	String getDescription();

	/**
	 * Returns the value of the '<em><b>Outputs</b></em>' containment reference list.
	 * The list contents are of type {@link com.misc.projects.SortingPlans.EndProductSortingPlanOutput}.
	 * It is bidirectional and its opposite is '{@link com.misc.projects.SortingPlans.EndProductSortingPlanOutput#getSortingPlan <em>Sorting Plan</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outputs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outputs</em>' containment reference list.
	 * @see com.misc.projects.SortingPlans.cptspPackage#getEndProductSortingPlan_Outputs()
	 * @see com.misc.projects.SortingPlans.EndProductSortingPlanOutput#getSortingPlan
	 * @model opposite="SortingPlan" containment="true"
	 * @generated
	 */
	EList<EndProductSortingPlanOutput> getOutputs();

	/**
	 * Returns the value of the '<em><b>Inputs</b></em>' containment reference list.
	 * The list contents are of type {@link com.misc.projects.SortingPlans.EndProductSortingPlanInput}.
	 * It is bidirectional and its opposite is '{@link com.misc.projects.SortingPlans.EndProductSortingPlanInput#getSortingPlan <em>Sorting Plan</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inputs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inputs</em>' containment reference list.
	 * @see com.misc.projects.SortingPlans.cptspPackage#getEndProductSortingPlan_Inputs()
	 * @see com.misc.projects.SortingPlans.EndProductSortingPlanInput#getSortingPlan
	 * @model opposite="SortingPlan" containment="true"
	 * @generated
	 */
	EList<EndProductSortingPlanInput> getInputs();

	/**
	 * Returns the value of the '<em><b>Selected Output</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Selected Output</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Selected Output</em>' reference.
	 * @see #setSelectedOutput(EndProductSortingPlanOutput)
	 * @see com.misc.projects.SortingPlans.cptspPackage#getEndProductSortingPlan_SelectedOutput()
	 * @model required="true"
	 * @generated
	 */
	EndProductSortingPlanOutput getSelectedOutput();

	/**
	 * Sets the value of the '{@link com.misc.projects.SortingPlans.EndProductSortingPlan#getSelectedOutput <em>Selected Output</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Selected Output</em>' reference.
	 * @see #getSelectedOutput()
	 * @generated
	 */
	void setSelectedOutput(EndProductSortingPlanOutput value);

	/**
	 * Returns the value of the '<em><b>Sorting Distance</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sorting Distance</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sorting Distance</em>' attribute.
	 * @see #setSortingDistance(int)
	 * @see com.misc.projects.SortingPlans.cptspPackage#getEndProductSortingPlan_SortingDistance()
	 * @model default="0"
	 * @generated
	 */
	int getSortingDistance();

	/**
	 * Sets the value of the '{@link com.misc.projects.SortingPlans.EndProductSortingPlan#getSortingDistance <em>Sorting Distance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sorting Distance</em>' attribute.
	 * @see #getSortingDistance()
	 * @generated
	 */
	void setSortingDistance(int value);

} // EndProductSortingPlan
