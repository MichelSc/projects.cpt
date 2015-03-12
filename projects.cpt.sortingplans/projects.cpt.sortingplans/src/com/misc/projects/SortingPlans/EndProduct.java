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
 * <ul>
 *   <li>{@link com.misc.projects.SortingPlans.EndProduct#getFPDSortingLevel <em>FPD Sorting Level</em>}</li>
 *   <li>{@link com.misc.projects.SortingPlans.EndProduct#getSortingPlanProduct <em>Sorting Plan Product</em>}</li>
 *   <li>{@link com.misc.projects.SortingPlans.EndProduct#getDescription <em>Description</em>}</li>
 *   <li>{@link com.misc.projects.SortingPlans.EndProduct#getSortingPlans <em>Sorting Plans</em>}</li>
 *   <li>{@link com.misc.projects.SortingPlans.EndProduct#isWhichSortingPlans <em>Which Sorting Plans</em>}</li>
 *   <li>{@link com.misc.projects.SortingPlans.EndProduct#getScenario <em>Scenario</em>}</li>
 * </ul>
 * </p>
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
	 * The list contents are of type {@link com.misc.projects.SortingPlans.SortingPlanEndProduct}.
	 * It is bidirectional and its opposite is '{@link com.misc.projects.SortingPlans.SortingPlanEndProduct#getEndProduct <em>End Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sorting Plans</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sorting Plans</em>' containment reference list.
	 * @see com.misc.projects.SortingPlans.cptspPackage#getEndProduct_SortingPlans()
	 * @see com.misc.projects.SortingPlans.SortingPlanEndProduct#getEndProduct
	 * @model opposite="EndProduct" containment="true"
	 * @generated
	 */
	EList<SortingPlanEndProduct> getSortingPlans();

	/**
	 * Returns the value of the '<em><b>Which Sorting Plans</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Which Sorting Plans</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Which Sorting Plans</em>' attribute.
	 * @see #setWhichSortingPlans(boolean)
	 * @see com.misc.projects.SortingPlans.cptspPackage#getEndProduct_WhichSortingPlans()
	 * @model
	 * @generated
	 */
	boolean isWhichSortingPlans();

	/**
	 * Sets the value of the '{@link com.misc.projects.SortingPlans.EndProduct#isWhichSortingPlans <em>Which Sorting Plans</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Which Sorting Plans</em>' attribute.
	 * @see #isWhichSortingPlans()
	 * @generated
	 */
	void setWhichSortingPlans(boolean value);

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void refreshSortingPlans();

} // EndProduct
