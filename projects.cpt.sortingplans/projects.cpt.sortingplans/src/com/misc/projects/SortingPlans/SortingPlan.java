/**
 */
package com.misc.projects.SortingPlans;

import com.misc.common.moplaf.propagator.ObjectWithPropagatorFunctionAdapter;
import com.misc.projects.CptDatasetLoad.SortingPlanRow;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sorting Plan</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.projects.SortingPlans.SortingPlan#getOutputs <em>Outputs</em>}</li>
 *   <li>{@link com.misc.projects.SortingPlans.SortingPlan#getEndProducts <em>End Products</em>}</li>
 *   <li>{@link com.misc.projects.SortingPlans.SortingPlan#getFPDSortingPlan <em>FPD Sorting Plan</em>}</li>
 *   <li>{@link com.misc.projects.SortingPlans.SortingPlan#getInputs <em>Inputs</em>}</li>
 *   <li>{@link com.misc.projects.SortingPlans.SortingPlan#getScenario <em>Scenario</em>}</li>
 *   <li>{@link com.misc.projects.SortingPlans.SortingPlan#getDescription <em>Description</em>}</li>
 *   <li>{@link com.misc.projects.SortingPlans.SortingPlan#isSelected <em>Selected</em>}</li>
 * </ul>
 *
 * @see com.misc.projects.SortingPlans.cptspPackage#getSortingPlan()
 * @model
 * @generated
 */
public interface SortingPlan extends ObjectWithPropagatorFunctionAdapter {
	/**
	 * Returns the value of the '<em><b>Outputs</b></em>' containment reference list.
	 * The list contents are of type {@link com.misc.projects.SortingPlans.SortingPlanOutput}.
	 * It is bidirectional and its opposite is '{@link com.misc.projects.SortingPlans.SortingPlanOutput#getSortingPlan <em>Sorting Plan</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outputs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outputs</em>' containment reference list.
	 * @see com.misc.projects.SortingPlans.cptspPackage#getSortingPlan_Outputs()
	 * @see com.misc.projects.SortingPlans.SortingPlanOutput#getSortingPlan
	 * @model opposite="SortingPlan" containment="true"
	 * @generated
	 */
	EList<SortingPlanOutput> getOutputs();

	/**
	 * Returns the value of the '<em><b>Inputs</b></em>' containment reference list.
	 * The list contents are of type {@link com.misc.projects.SortingPlans.SortingPlanInput}.
	 * It is bidirectional and its opposite is '{@link com.misc.projects.SortingPlans.SortingPlanInput#getSortingPlan <em>Sorting Plan</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inputs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inputs</em>' containment reference list.
	 * @see com.misc.projects.SortingPlans.cptspPackage#getSortingPlan_Inputs()
	 * @see com.misc.projects.SortingPlans.SortingPlanInput#getSortingPlan
	 * @model opposite="SortingPlan" containment="true"
	 * @generated
	 */
	EList<SortingPlanInput> getInputs();

	/**
	 * Returns the value of the '<em><b>Scenario</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link com.misc.projects.SortingPlans.Scenario#getSortingPlans <em>Sorting Plans</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scenario</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scenario</em>' container reference.
	 * @see #setScenario(Scenario)
	 * @see com.misc.projects.SortingPlans.cptspPackage#getSortingPlan_Scenario()
	 * @see com.misc.projects.SortingPlans.Scenario#getSortingPlans
	 * @model opposite="SortingPlans" required="true" transient="false"
	 * @generated
	 */
	Scenario getScenario();

	/**
	 * Sets the value of the '{@link com.misc.projects.SortingPlans.SortingPlan#getScenario <em>Scenario</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scenario</em>' container reference.
	 * @see #getScenario()
	 * @generated
	 */
	void setScenario(Scenario value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see com.misc.projects.SortingPlans.cptspPackage#getSortingPlan_Description()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	String getDescription();

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
	 * @see com.misc.projects.SortingPlans.cptspPackage#getSortingPlan_Selected()
	 * @model
	 * @generated
	 */
	boolean isSelected();

	/**
	 * Sets the value of the '{@link com.misc.projects.SortingPlans.SortingPlan#isSelected <em>Selected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Selected</em>' attribute.
	 * @see #isSelected()
	 * @generated
	 */
	void setSelected(boolean value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void refreshInputs();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void refreshOutputs();

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
	void refreshSelected();

	/**
	 * Returns the value of the '<em><b>End Products</b></em>' reference list.
	 * The list contents are of type {@link com.misc.projects.SortingPlans.SortingPlanEndProduct}.
	 * It is bidirectional and its opposite is '{@link com.misc.projects.SortingPlans.SortingPlanEndProduct#getSortingPlan <em>Sorting Plan</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End Products</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Products</em>' reference list.
	 * @see com.misc.projects.SortingPlans.cptspPackage#getSortingPlan_EndProducts()
	 * @see com.misc.projects.SortingPlans.SortingPlanEndProduct#getSortingPlan
	 * @model opposite="SortingPlan"
	 * @generated
	 */
	EList<SortingPlanEndProduct> getEndProducts();

	/**
	 * Returns the value of the '<em><b>FPD Sorting Plan</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>FPD Sorting Plan</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>FPD Sorting Plan</em>' reference.
	 * @see #setFPDSortingPlan(SortingPlanRow)
	 * @see com.misc.projects.SortingPlans.cptspPackage#getSortingPlan_FPDSortingPlan()
	 * @model
	 * @generated
	 */
	SortingPlanRow getFPDSortingPlan();

	/**
	 * Sets the value of the '{@link com.misc.projects.SortingPlans.SortingPlan#getFPDSortingPlan <em>FPD Sorting Plan</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>FPD Sorting Plan</em>' reference.
	 * @see #getFPDSortingPlan()
	 * @generated
	 */
	void setFPDSortingPlan(SortingPlanRow value);

} // SortingPlan
