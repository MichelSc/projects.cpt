/**
 */
package com.misc.projects.SortingPlans;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sorting Plan End Product</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.projects.SortingPlans.SortingPlanEndProduct#getOutput <em>Output</em>}</li>
 *   <li>{@link com.misc.projects.SortingPlans.SortingPlanEndProduct#getEndProduct <em>End Product</em>}</li>
 *   <li>{@link com.misc.projects.SortingPlans.SortingPlanEndProduct#getSortingPlan <em>Sorting Plan</em>}</li>
 *   <li>{@link com.misc.projects.SortingPlans.SortingPlanEndProduct#getDescription <em>Description</em>}</li>
 *   <li>{@link com.misc.projects.SortingPlans.SortingPlanEndProduct#getSortingDistance <em>Sorting Distance</em>}</li>
 * </ul>
 *
 * @see com.misc.projects.SortingPlans.cptspPackage#getSortingPlanEndProduct()
 * @model
 * @generated
 */
public interface SortingPlanEndProduct extends EObject {
	/**
	 * Returns the value of the '<em><b>Output</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link com.misc.projects.SortingPlans.SortingPlanOutput#getSortingPlanEndProduct <em>Sorting Plan End Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output</em>' reference.
	 * @see #setOutput(SortingPlanOutput)
	 * @see com.misc.projects.SortingPlans.cptspPackage#getSortingPlanEndProduct_Output()
	 * @see com.misc.projects.SortingPlans.SortingPlanOutput#getSortingPlanEndProduct
	 * @model opposite="SortingPlanEndProduct" required="true"
	 * @generated
	 */
	SortingPlanOutput getOutput();

	/**
	 * Sets the value of the '{@link com.misc.projects.SortingPlans.SortingPlanEndProduct#getOutput <em>Output</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output</em>' reference.
	 * @see #getOutput()
	 * @generated
	 */
	void setOutput(SortingPlanOutput value);

	/**
	 * Returns the value of the '<em><b>End Product</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link com.misc.projects.SortingPlans.EndProduct#getSortingPlans <em>Sorting Plans</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End Product</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Product</em>' container reference.
	 * @see #setEndProduct(EndProduct)
	 * @see com.misc.projects.SortingPlans.cptspPackage#getSortingPlanEndProduct_EndProduct()
	 * @see com.misc.projects.SortingPlans.EndProduct#getSortingPlans
	 * @model opposite="SortingPlans" required="true" transient="false"
	 * @generated
	 */
	EndProduct getEndProduct();

	/**
	 * Sets the value of the '{@link com.misc.projects.SortingPlans.SortingPlanEndProduct#getEndProduct <em>End Product</em>}' container reference.
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
	 * If the meaning of the '<em>Sorting Plan</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sorting Plan</em>' reference.
	 * @see #setSortingPlan(SortingPlan)
	 * @see com.misc.projects.SortingPlans.cptspPackage#getSortingPlanEndProduct_SortingPlan()
	 * @see com.misc.projects.SortingPlans.SortingPlan#getEndProducts
	 * @model opposite="EndProducts" required="true"
	 * @generated
	 */
	SortingPlan getSortingPlan();

	/**
	 * Sets the value of the '{@link com.misc.projects.SortingPlans.SortingPlanEndProduct#getSortingPlan <em>Sorting Plan</em>}' reference.
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
	 * @see com.misc.projects.SortingPlans.cptspPackage#getSortingPlanEndProduct_Description()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	String getDescription();

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
	 * @see com.misc.projects.SortingPlans.cptspPackage#getSortingPlanEndProduct_SortingDistance()
	 * @model default="0"
	 * @generated
	 */
	int getSortingDistance();

	/**
	 * Sets the value of the '{@link com.misc.projects.SortingPlans.SortingPlanEndProduct#getSortingDistance <em>Sorting Distance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sorting Distance</em>' attribute.
	 * @see #getSortingDistance()
	 * @generated
	 */
	void setSortingDistance(int value);

} // SortingPlanEndProduct
