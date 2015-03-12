/**
 */
package com.misc.projects.SortingPlans;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sorting Plan End Product</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.misc.projects.SortingPlans.SortingPlanEndProduct#getOutput <em>Output</em>}</li>
 *   <li>{@link com.misc.projects.SortingPlans.SortingPlanEndProduct#getEndProduct <em>End Product</em>}</li>
 *   <li>{@link com.misc.projects.SortingPlans.SortingPlanEndProduct#getSortingPlan <em>Sorting Plan</em>}</li>
 *   <li>{@link com.misc.projects.SortingPlans.SortingPlanEndProduct#getDescription <em>Description</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.misc.projects.SortingPlans.cptspPackage#getSortingPlanEndProduct()
 * @model
 * @generated
 */
public interface SortingPlanEndProduct extends EObject {
	/**
	 * Returns the value of the '<em><b>Output</b></em>' reference list.
	 * The list contents are of type {@link com.misc.projects.SortingPlans.SortingPlanOutput}.
	 * It is bidirectional and its opposite is '{@link com.misc.projects.SortingPlans.SortingPlanOutput#getSortingPlanEndProduct <em>Sorting Plan End Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output</em>' reference list.
	 * @see com.misc.projects.SortingPlans.cptspPackage#getSortingPlanEndProduct_Output()
	 * @see com.misc.projects.SortingPlans.SortingPlanOutput#getSortingPlanEndProduct
	 * @model opposite="SortingPlanEndProduct"
	 * @generated
	 */
	EList<SortingPlanOutput> getOutput();

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

} // SortingPlanEndProduct
