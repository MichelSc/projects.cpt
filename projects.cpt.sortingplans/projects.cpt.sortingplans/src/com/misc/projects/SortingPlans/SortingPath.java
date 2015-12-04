/**
 */
package com.misc.projects.SortingPlans;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sorting Path</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.projects.SortingPlans.SortingPath#getOutputLastSegment <em>Output Last Segment</em>}</li>
 *   <li>{@link com.misc.projects.SortingPlans.SortingPath#getBeforeLastSegment <em>Before Last Segment</em>}</li>
 *   <li>{@link com.misc.projects.SortingPlans.SortingPath#getSortedEndProducts <em>Sorted End Products</em>}</li>
 *   <li>{@link com.misc.projects.SortingPlans.SortingPath#getDescription <em>Description</em>}</li>
 *   <li>{@link com.misc.projects.SortingPlans.SortingPath#getProduct <em>Product</em>}</li>
 * </ul>
 *
 * @see com.misc.projects.SortingPlans.cptspPackage#getSortingPath()
 * @model
 * @generated
 */
public interface SortingPath extends EObject {
	/**
	 * Returns the value of the '<em><b>Output Last Segment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output Last Segment</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output Last Segment</em>' reference.
	 * @see #setOutputLastSegment(SortingPlanOutput)
	 * @see com.misc.projects.SortingPlans.cptspPackage#getSortingPath_OutputLastSegment()
	 * @model
	 * @generated
	 */
	SortingPlanOutput getOutputLastSegment();

	/**
	 * Sets the value of the '{@link com.misc.projects.SortingPlans.SortingPath#getOutputLastSegment <em>Output Last Segment</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output Last Segment</em>' reference.
	 * @see #getOutputLastSegment()
	 * @generated
	 */
	void setOutputLastSegment(SortingPlanOutput value);

	/**
	 * Returns the value of the '<em><b>Before Last Segment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Before Last Segment</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Before Last Segment</em>' reference.
	 * @see #setBeforeLastSegment(SortingPath)
	 * @see com.misc.projects.SortingPlans.cptspPackage#getSortingPath_BeforeLastSegment()
	 * @model
	 * @generated
	 */
	SortingPath getBeforeLastSegment();

	/**
	 * Sets the value of the '{@link com.misc.projects.SortingPlans.SortingPath#getBeforeLastSegment <em>Before Last Segment</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Before Last Segment</em>' reference.
	 * @see #getBeforeLastSegment()
	 * @generated
	 */
	void setBeforeLastSegment(SortingPath value);

	/**
	 * Returns the value of the '<em><b>Sorted End Products</b></em>' reference list.
	 * The list contents are of type {@link com.misc.projects.SortingPlans.EndProduct}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sorted End Products</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sorted End Products</em>' reference list.
	 * @see com.misc.projects.SortingPlans.cptspPackage#getSortingPath_SortedEndProducts()
	 * @model
	 * @generated
	 */
	EList<EndProduct> getSortedEndProducts();

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see com.misc.projects.SortingPlans.cptspPackage#getSortingPath_Description()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	String getDescription();

	/**
	 * Returns the value of the '<em><b>Product</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link com.misc.projects.SortingPlans.SortingPlanProduct#getSortingPaths <em>Sorting Paths</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product</em>' container reference.
	 * @see #setProduct(SortingPlanProduct)
	 * @see com.misc.projects.SortingPlans.cptspPackage#getSortingPath_Product()
	 * @see com.misc.projects.SortingPlans.SortingPlanProduct#getSortingPaths
	 * @model opposite="SortingPaths" required="true" transient="false"
	 * @generated
	 */
	SortingPlanProduct getProduct();

	/**
	 * Sets the value of the '{@link com.misc.projects.SortingPlans.SortingPath#getProduct <em>Product</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product</em>' container reference.
	 * @see #getProduct()
	 * @generated
	 */
	void setProduct(SortingPlanProduct value);

} // SortingPath
