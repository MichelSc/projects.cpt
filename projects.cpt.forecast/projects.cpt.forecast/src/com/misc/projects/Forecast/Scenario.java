/**
 */
package com.misc.projects.Forecast;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Scenario</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.misc.projects.Forecast.Scenario#getSelections <em>Selections</em>}</li>
 *   <li>{@link com.misc.projects.Forecast.Scenario#getName <em>Name</em>}</li>
 *   <li>{@link com.misc.projects.Forecast.Scenario#getMappings <em>Mappings</em>}</li>
 *   <li>{@link com.misc.projects.Forecast.Scenario#getChildScenarios <em>Child Scenarios</em>}</li>
 *   <li>{@link com.misc.projects.Forecast.Scenario#getMappingResults <em>Mapping Results</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.misc.projects.Forecast.ForecastPackage#getScenario()
 * @model
 * @generated
 */
public interface Scenario extends EObject {
	/**
	 * Returns the value of the '<em><b>Selections</b></em>' containment reference list.
	 * The list contents are of type {@link com.misc.projects.Forecast.FPOForecastBucketsSelection}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Selections</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Selections</em>' containment reference list.
	 * @see com.misc.projects.Forecast.ForecastPackage#getScenario_Selections()
	 * @model containment="true"
	 * @generated
	 */
	EList<FPOForecastBucketsSelection> getSelections();

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
	 * @see com.misc.projects.Forecast.ForecastPackage#getScenario_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.misc.projects.Forecast.Scenario#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Mappings</b></em>' containment reference list.
	 * The list contents are of type {@link com.misc.projects.Forecast.ForecastMapping}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mappings</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mappings</em>' containment reference list.
	 * @see com.misc.projects.Forecast.ForecastPackage#getScenario_Mappings()
	 * @model containment="true"
	 * @generated
	 */
	EList<ForecastMapping> getMappings();

	/**
	 * Returns the value of the '<em><b>Child Scenarios</b></em>' containment reference list.
	 * The list contents are of type {@link com.misc.projects.Forecast.Scenario}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Child Scenarios</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Child Scenarios</em>' containment reference list.
	 * @see com.misc.projects.Forecast.ForecastPackage#getScenario_ChildScenarios()
	 * @model containment="true"
	 * @generated
	 */
	EList<Scenario> getChildScenarios();

	/**
	 * Returns the value of the '<em><b>Mapping Results</b></em>' containment reference list.
	 * The list contents are of type {@link com.misc.projects.Forecast.MappingResult}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mapping Results</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mapping Results</em>' containment reference list.
	 * @see com.misc.projects.Forecast.ForecastPackage#getScenario_MappingResults()
	 * @model containment="true"
	 * @generated
	 */
	EList<MappingResult> getMappingResults();

} // Scenario
