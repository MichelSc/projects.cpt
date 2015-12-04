/**
 */
package com.misc.projects.SortingPlans;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>End Product In Product</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.projects.SortingPlans.EndProductInProduct#getEndProductsContained <em>End Products Contained</em>}</li>
 *   <li>{@link com.misc.projects.SortingPlans.EndProductInProduct#getSortingPlansProducing <em>Sorting Plans Producing</em>}</li>
 *   <li>{@link com.misc.projects.SortingPlans.EndProductInProduct#getSortingPlansAccepting <em>Sorting Plans Accepting</em>}</li>
 *   <li>{@link com.misc.projects.SortingPlans.EndProductInProduct#getProduct <em>Product</em>}</li>
 *   <li>{@link com.misc.projects.SortingPlans.EndProductInProduct#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @see com.misc.projects.SortingPlans.cptspPackage#getEndProductInProduct()
 * @model
 * @generated
 */
public interface EndProductInProduct extends EObject {
	/**
	 * Returns the value of the '<em><b>End Products Contained</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link com.misc.projects.SortingPlans.EndProduct#getProductsContaining <em>Products Containing</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End Products Contained</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Products Contained</em>' container reference.
	 * @see #setEndProductsContained(EndProduct)
	 * @see com.misc.projects.SortingPlans.cptspPackage#getEndProductInProduct_EndProductsContained()
	 * @see com.misc.projects.SortingPlans.EndProduct#getProductsContaining
	 * @model opposite="ProductsContaining" transient="false"
	 * @generated
	 */
	EndProduct getEndProductsContained();

	/**
	 * Sets the value of the '{@link com.misc.projects.SortingPlans.EndProductInProduct#getEndProductsContained <em>End Products Contained</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Products Contained</em>' container reference.
	 * @see #getEndProductsContained()
	 * @generated
	 */
	void setEndProductsContained(EndProduct value);

	/**
	 * Returns the value of the '<em><b>Sorting Plans Producing</b></em>' reference list.
	 * The list contents are of type {@link com.misc.projects.SortingPlans.EndProductSortingPlanOutput}.
	 * It is bidirectional and its opposite is '{@link com.misc.projects.SortingPlans.EndProductSortingPlanOutput#getOutputProduct <em>Output Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sorting Plans Producing</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sorting Plans Producing</em>' reference list.
	 * @see com.misc.projects.SortingPlans.cptspPackage#getEndProductInProduct_SortingPlansProducing()
	 * @see com.misc.projects.SortingPlans.EndProductSortingPlanOutput#getOutputProduct
	 * @model opposite="OutputProduct"
	 * @generated
	 */
	EList<EndProductSortingPlanOutput> getSortingPlansProducing();

	/**
	 * Returns the value of the '<em><b>Sorting Plans Accepting</b></em>' reference list.
	 * The list contents are of type {@link com.misc.projects.SortingPlans.EndProductSortingPlanInput}.
	 * It is bidirectional and its opposite is '{@link com.misc.projects.SortingPlans.EndProductSortingPlanInput#getInputProduct <em>Input Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sorting Plans Accepting</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sorting Plans Accepting</em>' reference list.
	 * @see com.misc.projects.SortingPlans.cptspPackage#getEndProductInProduct_SortingPlansAccepting()
	 * @see com.misc.projects.SortingPlans.EndProductSortingPlanInput#getInputProduct
	 * @model opposite="InputProduct"
	 * @generated
	 */
	EList<EndProductSortingPlanInput> getSortingPlansAccepting();

	/**
	 * Returns the value of the '<em><b>Product</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link com.misc.projects.SortingPlans.SortingPlanProduct#getEndProducts <em>End Products</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product</em>' reference.
	 * @see #setProduct(SortingPlanProduct)
	 * @see com.misc.projects.SortingPlans.cptspPackage#getEndProductInProduct_Product()
	 * @see com.misc.projects.SortingPlans.SortingPlanProduct#getEndProducts
	 * @model opposite="EndProducts"
	 * @generated
	 */
	SortingPlanProduct getProduct();

	/**
	 * Sets the value of the '{@link com.misc.projects.SortingPlans.EndProductInProduct#getProduct <em>Product</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product</em>' reference.
	 * @see #getProduct()
	 * @generated
	 */
	void setProduct(SortingPlanProduct value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see com.misc.projects.SortingPlans.cptspPackage#getEndProductInProduct_Description()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	String getDescription();

} // EndProductInProduct
