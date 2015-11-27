/**
 */
package com.misc.projects.SortingPlans;

import com.misc.common.moplaf.propagator.ObjectWithPropagatorFunctionAdapter;
import com.misc.projects.CptDatasetLoad.SortingLevelRow;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>End Product</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.projects.SortingPlans.EndProduct#getFPDSortingLevel <em>FPD Sorting Level</em>}</li>
 *   <li>{@link com.misc.projects.SortingPlans.EndProduct#getSortingPlanProduct <em>Sorting Plan Product</em>}</li>
 *   <li>{@link com.misc.projects.SortingPlans.EndProduct#getDescription <em>Description</em>}</li>
 *   <li>{@link com.misc.projects.SortingPlans.EndProduct#getSortingPlans <em>Sorting Plans</em>}</li>
 *   <li>{@link com.misc.projects.SortingPlans.EndProduct#getScenario <em>Scenario</em>}</li>
 *   <li>{@link com.misc.projects.SortingPlans.EndProduct#getScenarioAsSelected <em>Scenario As Selected</em>}</li>
 *   <li>{@link com.misc.projects.SortingPlans.EndProduct#getProductsContaining <em>Products Containing</em>}</li>
 * </ul>
 *
 * @see com.misc.projects.SortingPlans.cptspPackage#getEndProduct()
 * @model
 * @generated
 */
public interface EndProduct extends ObjectWithPropagatorFunctionAdapter {
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
	 * @see com.misc.projects.SortingPlans.cptspPackage#getEndProduct_FPDSortingLevel()
	 * @model
	 * @generated
	 */
	SortingLevelRow getFPDSortingLevel();

	/**
	 * Sets the value of the '{@link com.misc.projects.SortingPlans.EndProduct#getFPDSortingLevel <em>FPD Sorting Level</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>FPD Sorting Level</em>' reference.
	 * @see #getFPDSortingLevel()
	 * @generated
	 */
	void setFPDSortingLevel(SortingLevelRow value);

	/**
	 * Returns the value of the '<em><b>Sorting Plan Product</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link com.misc.projects.SortingPlans.SortingPlanProduct#getEndProduct <em>End Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sorting Plan Product</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sorting Plan Product</em>' reference.
	 * @see #setSortingPlanProduct(SortingPlanProduct)
	 * @see com.misc.projects.SortingPlans.cptspPackage#getEndProduct_SortingPlanProduct()
	 * @see com.misc.projects.SortingPlans.SortingPlanProduct#getEndProduct
	 * @model opposite="EndProduct" required="true"
	 * @generated
	 */
	SortingPlanProduct getSortingPlanProduct();

	/**
	 * Sets the value of the '{@link com.misc.projects.SortingPlans.EndProduct#getSortingPlanProduct <em>Sorting Plan Product</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sorting Plan Product</em>' reference.
	 * @see #getSortingPlanProduct()
	 * @generated
	 */
	void setSortingPlanProduct(SortingPlanProduct value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see com.misc.projects.SortingPlans.cptspPackage#getEndProduct_Description()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	String getDescription();

	/**
	 * Returns the value of the '<em><b>Sorting Plans</b></em>' containment reference list.
	 * The list contents are of type {@link com.misc.projects.SortingPlans.EndProductSortingPlan}.
	 * It is bidirectional and its opposite is '{@link com.misc.projects.SortingPlans.EndProductSortingPlan#getEndProduct <em>End Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sorting Plans</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sorting Plans</em>' containment reference list.
	 * @see com.misc.projects.SortingPlans.cptspPackage#getEndProduct_SortingPlans()
	 * @see com.misc.projects.SortingPlans.EndProductSortingPlan#getEndProduct
	 * @model opposite="EndProduct" containment="true"
	 * @generated
	 */
	EList<EndProductSortingPlan> getSortingPlans();

	/**
	 * Returns the value of the '<em><b>Scenario</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link com.misc.projects.SortingPlans.Scenario#getEndProducts <em>End Products</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scenario</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scenario</em>' container reference.
	 * @see #setScenario(Scenario)
	 * @see com.misc.projects.SortingPlans.cptspPackage#getEndProduct_Scenario()
	 * @see com.misc.projects.SortingPlans.Scenario#getEndProducts
	 * @model opposite="EndProducts" transient="false"
	 * @generated
	 */
	Scenario getScenario();

	/**
	 * Sets the value of the '{@link com.misc.projects.SortingPlans.EndProduct#getScenario <em>Scenario</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scenario</em>' container reference.
	 * @see #getScenario()
	 * @generated
	 */
	void setScenario(Scenario value);

	/**
	 * Returns the value of the '<em><b>Scenario As Selected</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link com.misc.projects.SortingPlans.Scenario#getSelectedEndProducts <em>Selected End Products</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scenario As Selected</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scenario As Selected</em>' reference.
	 * @see #setScenarioAsSelected(Scenario)
	 * @see com.misc.projects.SortingPlans.cptspPackage#getEndProduct_ScenarioAsSelected()
	 * @see com.misc.projects.SortingPlans.Scenario#getSelectedEndProducts
	 * @model opposite="SelectedEndProducts"
	 * @generated
	 */
	Scenario getScenarioAsSelected();

	/**
	 * Sets the value of the '{@link com.misc.projects.SortingPlans.EndProduct#getScenarioAsSelected <em>Scenario As Selected</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scenario As Selected</em>' reference.
	 * @see #getScenarioAsSelected()
	 * @generated
	 */
	void setScenarioAsSelected(Scenario value);

	/**
	 * Returns the value of the '<em><b>Products Containing</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link com.misc.projects.SortingPlans.EndProductInProduct#getEndProductsContained <em>End Products Contained</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Products Containing</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Products Containing</em>' containment reference.
	 * @see #setProductsContaining(EndProductInProduct)
	 * @see com.misc.projects.SortingPlans.cptspPackage#getEndProduct_ProductsContaining()
	 * @see com.misc.projects.SortingPlans.EndProductInProduct#getEndProductsContained
	 * @model opposite="EndProductsContained" containment="true"
	 * @generated
	 */
	EndProductInProduct getProductsContaining();

	/**
	 * Sets the value of the '{@link com.misc.projects.SortingPlans.EndProduct#getProductsContaining <em>Products Containing</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Products Containing</em>' containment reference.
	 * @see #getProductsContaining()
	 * @generated
	 */
	void setProductsContaining(EndProductInProduct value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void refreshSortingPlans();

} // EndProduct
