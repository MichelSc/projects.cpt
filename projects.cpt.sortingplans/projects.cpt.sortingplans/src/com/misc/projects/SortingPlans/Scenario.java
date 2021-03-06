/**
 */
package com.misc.projects.SortingPlans;

import com.misc.common.moplaf.propagator.ObjectWithPropagatorFunctionAdapter;
import com.misc.common.moplaf.propagator.ObjectWithPropagatorFunctionAdapterScope;
import com.misc.projects.CptDatasetLoad.SortingLevelRow;
import com.misc.projects.CptDatasetLoad.SortingPlanRow;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Scenario</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.projects.SortingPlans.Scenario#getSortingPlans <em>Sorting Plans</em>}</li>
 *   <li>{@link com.misc.projects.SortingPlans.Scenario#getEndProducts <em>End Products</em>}</li>
 *   <li>{@link com.misc.projects.SortingPlans.Scenario#getSortingPlanProducts <em>Sorting Plan Products</em>}</li>
 *   <li>{@link com.misc.projects.SortingPlans.Scenario#getName <em>Name</em>}</li>
 *   <li>{@link com.misc.projects.SortingPlans.Scenario#getSortingLevelsWithDestination <em>Sorting Levels With Destination</em>}</li>
 *   <li>{@link com.misc.projects.SortingPlans.Scenario#getSelectedSortingPlans <em>Selected Sorting Plans</em>}</li>
 *   <li>{@link com.misc.projects.SortingPlans.Scenario#getSelectedEndProducts <em>Selected End Products</em>}</li>
 *   <li>{@link com.misc.projects.SortingPlans.Scenario#getPrimaryProductsSelected <em>Primary Products Selected</em>}</li>
 *   <li>{@link com.misc.projects.SortingPlans.Scenario#getRemarks <em>Remarks</em>}</li>
 * </ul>
 *
 * @see com.misc.projects.SortingPlans.cptspPackage#getScenario()
 * @model
 * @generated
 */
public interface Scenario extends ObjectWithPropagatorFunctionAdapter, ObjectWithPropagatorFunctionAdapterScope {
	/**
	 * Returns the value of the '<em><b>Sorting Plans</b></em>' containment reference list.
	 * The list contents are of type {@link com.misc.projects.SortingPlans.SortingPlan}.
	 * It is bidirectional and its opposite is '{@link com.misc.projects.SortingPlans.SortingPlan#getScenario <em>Scenario</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sorting Plans</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sorting Plans</em>' containment reference list.
	 * @see com.misc.projects.SortingPlans.cptspPackage#getScenario_SortingPlans()
	 * @see com.misc.projects.SortingPlans.SortingPlan#getScenario
	 * @model opposite="Scenario" containment="true"
	 * @generated
	 */
	EList<SortingPlan> getSortingPlans();

	/**
	 * Returns the value of the '<em><b>End Products</b></em>' containment reference list.
	 * The list contents are of type {@link com.misc.projects.SortingPlans.EndProduct}.
	 * It is bidirectional and its opposite is '{@link com.misc.projects.SortingPlans.EndProduct#getScenario <em>Scenario</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End Products</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Products</em>' containment reference list.
	 * @see com.misc.projects.SortingPlans.cptspPackage#getScenario_EndProducts()
	 * @see com.misc.projects.SortingPlans.EndProduct#getScenario
	 * @model opposite="Scenario" containment="true"
	 * @generated
	 */
	EList<EndProduct> getEndProducts();

	/**
	 * Returns the value of the '<em><b>Sorting Plan Products</b></em>' containment reference list.
	 * The list contents are of type {@link com.misc.projects.SortingPlans.SortingPlanProduct}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sorting Plan Products</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sorting Plan Products</em>' containment reference list.
	 * @see com.misc.projects.SortingPlans.cptspPackage#getScenario_SortingPlanProducts()
	 * @model containment="true"
	 * @generated
	 */
	EList<SortingPlanProduct> getSortingPlanProducts();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see com.misc.projects.SortingPlans.cptspPackage#getScenario_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.misc.projects.SortingPlans.Scenario#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Sorting Levels With Destination</b></em>' reference list.
	 * The list contents are of type {@link com.misc.projects.CptDatasetLoad.SortingLevelRow}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sorting Levels With Destination</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sorting Levels With Destination</em>' reference list.
	 * @see com.misc.projects.SortingPlans.cptspPackage#getScenario_SortingLevelsWithDestination()
	 * @model
	 * @generated
	 */
	EList<SortingLevelRow> getSortingLevelsWithDestination();

	/**
	 * Returns the value of the '<em><b>Selected Sorting Plans</b></em>' reference list.
	 * The list contents are of type {@link com.misc.projects.CptDatasetLoad.SortingPlanRow}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Selected Sorting Plans</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Selected Sorting Plans</em>' reference list.
	 * @see com.misc.projects.SortingPlans.cptspPackage#getScenario_SelectedSortingPlans()
	 * @model
	 * @generated
	 */
	EList<SortingPlanRow> getSelectedSortingPlans();

	/**
	 * Returns the value of the '<em><b>Selected End Products</b></em>' reference list.
	 * The list contents are of type {@link com.misc.projects.SortingPlans.EndProduct}.
	 * It is bidirectional and its opposite is '{@link com.misc.projects.SortingPlans.EndProduct#getScenarioAsSelected <em>Scenario As Selected</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Selected End Products</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Selected End Products</em>' reference list.
	 * @see com.misc.projects.SortingPlans.cptspPackage#getScenario_SelectedEndProducts()
	 * @see com.misc.projects.SortingPlans.EndProduct#getScenarioAsSelected
	 * @model opposite="ScenarioAsSelected"
	 * @generated
	 */
	EList<EndProduct> getSelectedEndProducts();

	/**
	 * Returns the value of the '<em><b>Primary Products Selected</b></em>' reference list.
	 * The list contents are of type {@link com.misc.projects.SortingPlans.SortingPlanProduct}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Primary Products Selected</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Primary Products Selected</em>' reference list.
	 * @see com.misc.projects.SortingPlans.cptspPackage#getScenario_PrimaryProductsSelected()
	 * @model
	 * @generated
	 */
	EList<SortingPlanProduct> getPrimaryProductsSelected();

	/**
	 * Returns the value of the '<em><b>Remarks</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Remarks</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Remarks</em>' attribute.
	 * @see #setRemarks(String)
	 * @see com.misc.projects.SortingPlans.cptspPackage#getScenario_Remarks()
	 * @model
	 * @generated
	 */
	String getRemarks();

	/**
	 * Sets the value of the '{@link com.misc.projects.SortingPlans.Scenario#getRemarks <em>Remarks</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Remarks</em>' attribute.
	 * @see #getRemarks()
	 * @generated
	 */
	void setRemarks(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void refreshSelectedSortingPlans();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void refresh();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void refreshSortingPlanProduct();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void refreshEndProducts();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void refreshSortingPaths();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void test();

} // Scenario
