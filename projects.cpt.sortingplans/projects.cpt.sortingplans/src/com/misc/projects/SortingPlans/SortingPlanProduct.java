/**
 */
package com.misc.projects.SortingPlans;

import com.misc.common.moplaf.propagator.ObjectWithPropagatorFunctionAdapter;
import com.misc.projects.CptDatasetLoad.SortingLevelRow;

import java.math.BigDecimal;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sorting Plan Product</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.projects.SortingPlans.SortingPlanProduct#getFPDSortingLevel <em>FPD Sorting Level</em>}</li>
 *   <li>{@link com.misc.projects.SortingPlans.SortingPlanProduct#getSortingPlansProducing <em>Sorting Plans Producing</em>}</li>
 *   <li>{@link com.misc.projects.SortingPlans.SortingPlanProduct#getSortingPlansAccepting <em>Sorting Plans Accepting</em>}</li>
 *   <li>{@link com.misc.projects.SortingPlans.SortingPlanProduct#getSortingLevelAVCSSk <em>Sorting Level AVCS Sk</em>}</li>
 *   <li>{@link com.misc.projects.SortingPlans.SortingPlanProduct#getMechanizationLevelSk <em>Mechanization Level Sk</em>}</li>
 *   <li>{@link com.misc.projects.SortingPlans.SortingPlanProduct#getThroughputTypeSk <em>Throughput Type Sk</em>}</li>
 *   <li>{@link com.misc.projects.SortingPlans.SortingPlanProduct#getDestinationSk <em>Destination Sk</em>}</li>
 *   <li>{@link com.misc.projects.SortingPlans.SortingPlanProduct#getDescription <em>Description</em>}</li>
 *   <li>{@link com.misc.projects.SortingPlans.SortingPlanProduct#getEndProduct <em>End Product</em>}</li>
 *   <li>{@link com.misc.projects.SortingPlans.SortingPlanProduct#getSortingPaths <em>Sorting Paths</em>}</li>
 *   <li>{@link com.misc.projects.SortingPlans.SortingPlanProduct#getEndProducts <em>End Products</em>}</li>
 * </ul>
 *
 * @see com.misc.projects.SortingPlans.cptspPackage#getSortingPlanProduct()
 * @model
 * @generated
 */
public interface SortingPlanProduct extends ObjectWithPropagatorFunctionAdapter {
	/**
	 * Returns the value of the '<em><b>FPD Sorting Level</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>FPD Sorting Level</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>FPD Sorting Level</em>' reference.
	 * @see #setFPDSortingLevel(SortingLevelRow)
	 * @see com.misc.projects.SortingPlans.cptspPackage#getSortingPlanProduct_FPDSortingLevel()
	 * @model
	 * @generated
	 */
	SortingLevelRow getFPDSortingLevel();

	/**
	 * Sets the value of the '{@link com.misc.projects.SortingPlans.SortingPlanProduct#getFPDSortingLevel <em>FPD Sorting Level</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>FPD Sorting Level</em>' reference.
	 * @see #getFPDSortingLevel()
	 * @generated
	 */
	void setFPDSortingLevel(SortingLevelRow value);

	/**
	 * Returns the value of the '<em><b>Sorting Plans Producing</b></em>' reference list.
	 * The list contents are of type {@link com.misc.projects.SortingPlans.SortingPlanOutput}.
	 * It is bidirectional and its opposite is '{@link com.misc.projects.SortingPlans.SortingPlanOutput#getOutputProduct <em>Output Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sorting Plans Producing</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sorting Plans Producing</em>' reference list.
	 * @see com.misc.projects.SortingPlans.cptspPackage#getSortingPlanProduct_SortingPlansProducing()
	 * @see com.misc.projects.SortingPlans.SortingPlanOutput#getOutputProduct
	 * @model opposite="OutputProduct"
	 * @generated
	 */
	EList<SortingPlanOutput> getSortingPlansProducing();

	/**
	 * Returns the value of the '<em><b>Sorting Plans Accepting</b></em>' reference list.
	 * The list contents are of type {@link com.misc.projects.SortingPlans.SortingPlanInput}.
	 * It is bidirectional and its opposite is '{@link com.misc.projects.SortingPlans.SortingPlanInput#getInputProduct <em>Input Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sorting Plans Accepting</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sorting Plans Accepting</em>' reference list.
	 * @see com.misc.projects.SortingPlans.cptspPackage#getSortingPlanProduct_SortingPlansAccepting()
	 * @see com.misc.projects.SortingPlans.SortingPlanInput#getInputProduct
	 * @model opposite="InputProduct"
	 * @generated
	 */
	EList<SortingPlanInput> getSortingPlansAccepting();

	/**
	 * Returns the value of the '<em><b>Sorting Level AVCS Sk</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sorting Level AVCS Sk</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sorting Level AVCS Sk</em>' attribute.
	 * @see #setSortingLevelAVCSSk(BigDecimal)
	 * @see com.misc.projects.SortingPlans.cptspPackage#getSortingPlanProduct_SortingLevelAVCSSk()
	 * @model
	 * @generated
	 */
	BigDecimal getSortingLevelAVCSSk();

	/**
	 * Sets the value of the '{@link com.misc.projects.SortingPlans.SortingPlanProduct#getSortingLevelAVCSSk <em>Sorting Level AVCS Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sorting Level AVCS Sk</em>' attribute.
	 * @see #getSortingLevelAVCSSk()
	 * @generated
	 */
	void setSortingLevelAVCSSk(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Mechanization Level Sk</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mechanization Level Sk</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mechanization Level Sk</em>' attribute.
	 * @see #setMechanizationLevelSk(BigDecimal)
	 * @see com.misc.projects.SortingPlans.cptspPackage#getSortingPlanProduct_MechanizationLevelSk()
	 * @model
	 * @generated
	 */
	BigDecimal getMechanizationLevelSk();

	/**
	 * Sets the value of the '{@link com.misc.projects.SortingPlans.SortingPlanProduct#getMechanizationLevelSk <em>Mechanization Level Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mechanization Level Sk</em>' attribute.
	 * @see #getMechanizationLevelSk()
	 * @generated
	 */
	void setMechanizationLevelSk(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Throughput Type Sk</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Throughput Type Sk</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Throughput Type Sk</em>' attribute.
	 * @see #setThroughputTypeSk(BigDecimal)
	 * @see com.misc.projects.SortingPlans.cptspPackage#getSortingPlanProduct_ThroughputTypeSk()
	 * @model
	 * @generated
	 */
	BigDecimal getThroughputTypeSk();

	/**
	 * Sets the value of the '{@link com.misc.projects.SortingPlans.SortingPlanProduct#getThroughputTypeSk <em>Throughput Type Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Throughput Type Sk</em>' attribute.
	 * @see #getThroughputTypeSk()
	 * @generated
	 */
	void setThroughputTypeSk(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Destination Sk</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Destination Sk</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Destination Sk</em>' attribute.
	 * @see #setDestinationSk(BigDecimal)
	 * @see com.misc.projects.SortingPlans.cptspPackage#getSortingPlanProduct_DestinationSk()
	 * @model
	 * @generated
	 */
	BigDecimal getDestinationSk();

	/**
	 * Sets the value of the '{@link com.misc.projects.SortingPlans.SortingPlanProduct#getDestinationSk <em>Destination Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Destination Sk</em>' attribute.
	 * @see #getDestinationSk()
	 * @generated
	 */
	void setDestinationSk(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see com.misc.projects.SortingPlans.cptspPackage#getSortingPlanProduct_Description()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	String getDescription();

	/**
	 * Returns the value of the '<em><b>End Product</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link com.misc.projects.SortingPlans.EndProduct#getSortingPlanProduct <em>Sorting Plan Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End Product</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Product</em>' reference.
	 * @see #setEndProduct(EndProduct)
	 * @see com.misc.projects.SortingPlans.cptspPackage#getSortingPlanProduct_EndProduct()
	 * @see com.misc.projects.SortingPlans.EndProduct#getSortingPlanProduct
	 * @model opposite="SortingPlanProduct"
	 * @generated
	 */
	EndProduct getEndProduct();

	/**
	 * Sets the value of the '{@link com.misc.projects.SortingPlans.SortingPlanProduct#getEndProduct <em>End Product</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Product</em>' reference.
	 * @see #getEndProduct()
	 * @generated
	 */
	void setEndProduct(EndProduct value);

	/**
	 * Returns the value of the '<em><b>Sorting Paths</b></em>' containment reference list.
	 * The list contents are of type {@link com.misc.projects.SortingPlans.SortingPath}.
	 * It is bidirectional and its opposite is '{@link com.misc.projects.SortingPlans.SortingPath#getProduct <em>Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sorting Paths</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sorting Paths</em>' containment reference list.
	 * @see com.misc.projects.SortingPlans.cptspPackage#getSortingPlanProduct_SortingPaths()
	 * @see com.misc.projects.SortingPlans.SortingPath#getProduct
	 * @model opposite="Product" containment="true"
	 * @generated
	 */
	EList<SortingPath> getSortingPaths();

	/**
	 * Returns the value of the '<em><b>End Products</b></em>' reference list.
	 * The list contents are of type {@link com.misc.projects.SortingPlans.EndProductInProduct}.
	 * It is bidirectional and its opposite is '{@link com.misc.projects.SortingPlans.EndProductInProduct#getProduct <em>Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End Products</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Products</em>' reference list.
	 * @see com.misc.projects.SortingPlans.cptspPackage#getSortingPlanProduct_EndProducts()
	 * @see com.misc.projects.SortingPlans.EndProductInProduct#getProduct
	 * @model opposite="Product"
	 * @generated
	 */
	EList<EndProductInProduct> getEndProducts();

} // SortingPlanProduct
