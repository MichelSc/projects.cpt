/**
 */
package com.misc.projects.CptDatasetLoad;

import java.math.BigDecimal;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sorting Plan Row</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.misc.projects.CptDatasetLoad.SortingPlanRow#getSortingPlanSk <em>Sorting Plan Sk</em>}</li>
 *   <li>{@link com.misc.projects.CptDatasetLoad.SortingPlanRow#getSortingPlanName <em>Sorting Plan Name</em>}</li>
 *   <li>{@link com.misc.projects.CptDatasetLoad.SortingPlanRow#getSortingLevelPLAGGSk <em>Sorting Level PLAGG Sk</em>}</li>
 *   <li>{@link com.misc.projects.CptDatasetLoad.SortingPlanRow#getInputs <em>Inputs</em>}</li>
 *   <li>{@link com.misc.projects.CptDatasetLoad.SortingPlanRow#getOutputs <em>Outputs</em>}</li>
 *   <li>{@link com.misc.projects.CptDatasetLoad.SortingPlanRow#getDescription <em>Description</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.misc.projects.CptDatasetLoad.CptDatasetLoadPackage#getSortingPlanRow()
 * @model
 * @generated
 */
public interface SortingPlanRow extends FPDSortingPanRow {
	/**
	 * Returns the value of the '<em><b>Sorting Plan Sk</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sorting Plan Sk</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sorting Plan Sk</em>' attribute.
	 * @see #setSortingPlanSk(BigDecimal)
	 * @see com.misc.projects.CptDatasetLoad.CptDatasetLoadPackage#getSortingPlanRow_SortingPlanSk()
	 * @model
	 * @generated
	 */
	BigDecimal getSortingPlanSk();

	/**
	 * Sets the value of the '{@link com.misc.projects.CptDatasetLoad.SortingPlanRow#getSortingPlanSk <em>Sorting Plan Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sorting Plan Sk</em>' attribute.
	 * @see #getSortingPlanSk()
	 * @generated
	 */
	void setSortingPlanSk(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Sorting Plan Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sorting Plan Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sorting Plan Name</em>' attribute.
	 * @see #setSortingPlanName(String)
	 * @see com.misc.projects.CptDatasetLoad.CptDatasetLoadPackage#getSortingPlanRow_SortingPlanName()
	 * @model
	 * @generated
	 */
	String getSortingPlanName();

	/**
	 * Sets the value of the '{@link com.misc.projects.CptDatasetLoad.SortingPlanRow#getSortingPlanName <em>Sorting Plan Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sorting Plan Name</em>' attribute.
	 * @see #getSortingPlanName()
	 * @generated
	 */
	void setSortingPlanName(String value);

	/**
	 * Returns the value of the '<em><b>Sorting Level PLAGG Sk</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sorting Level PLAGG Sk</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sorting Level PLAGG Sk</em>' attribute.
	 * @see #setSortingLevelPLAGGSk(BigDecimal)
	 * @see com.misc.projects.CptDatasetLoad.CptDatasetLoadPackage#getSortingPlanRow_SortingLevelPLAGGSk()
	 * @model
	 * @generated
	 */
	BigDecimal getSortingLevelPLAGGSk();

	/**
	 * Sets the value of the '{@link com.misc.projects.CptDatasetLoad.SortingPlanRow#getSortingLevelPLAGGSk <em>Sorting Level PLAGG Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sorting Level PLAGG Sk</em>' attribute.
	 * @see #getSortingLevelPLAGGSk()
	 * @generated
	 */
	void setSortingLevelPLAGGSk(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Inputs</b></em>' reference list.
	 * The list contents are of type {@link com.misc.projects.CptDatasetLoad.SortingPlanInputRow}.
	 * It is bidirectional and its opposite is '{@link com.misc.projects.CptDatasetLoad.SortingPlanInputRow#getSortingPlan <em>Sorting Plan</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inputs</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inputs</em>' reference list.
	 * @see com.misc.projects.CptDatasetLoad.CptDatasetLoadPackage#getSortingPlanRow_Inputs()
	 * @see com.misc.projects.CptDatasetLoad.SortingPlanInputRow#getSortingPlan
	 * @model opposite="SortingPlan"
	 * @generated
	 */
	EList<SortingPlanInputRow> getInputs();

	/**
	 * Returns the value of the '<em><b>Outputs</b></em>' reference list.
	 * The list contents are of type {@link com.misc.projects.CptDatasetLoad.SortingPlanOutputRow}.
	 * It is bidirectional and its opposite is '{@link com.misc.projects.CptDatasetLoad.SortingPlanOutputRow#getSortingPlan <em>Sorting Plan</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outputs</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outputs</em>' reference list.
	 * @see com.misc.projects.CptDatasetLoad.CptDatasetLoadPackage#getSortingPlanRow_Outputs()
	 * @see com.misc.projects.CptDatasetLoad.SortingPlanOutputRow#getSortingPlan
	 * @model opposite="SortingPlan"
	 * @generated
	 */
	EList<SortingPlanOutputRow> getOutputs();

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see com.misc.projects.CptDatasetLoad.CptDatasetLoadPackage#getSortingPlanRow_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link com.misc.projects.CptDatasetLoad.SortingPlanRow#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

} // SortingPlanRow
