/**
 */
package com.misc.projects.Forecast.impl;

import com.misc.projects.Forecast.FPOForecastBucketsSelection;
import com.misc.projects.Forecast.ForecastMapping;
import com.misc.projects.Forecast.ForecastPackage;
import com.misc.projects.Forecast.MappingResult;
import com.misc.projects.Forecast.Scenario;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Scenario</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.misc.projects.Forecast.impl.ScenarioImpl#getSelections <em>Selections</em>}</li>
 *   <li>{@link com.misc.projects.Forecast.impl.ScenarioImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.misc.projects.Forecast.impl.ScenarioImpl#getMappings <em>Mappings</em>}</li>
 *   <li>{@link com.misc.projects.Forecast.impl.ScenarioImpl#getChildScenarios <em>Child Scenarios</em>}</li>
 *   <li>{@link com.misc.projects.Forecast.impl.ScenarioImpl#getMappingResults <em>Mapping Results</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ScenarioImpl extends MinimalEObjectImpl.Container implements Scenario {
	/**
	 * The cached value of the '{@link #getSelections() <em>Selections</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelections()
	 * @generated
	 * @ordered
	 */
	protected EList<FPOForecastBucketsSelection> selections;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMappings() <em>Mappings</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMappings()
	 * @generated
	 * @ordered
	 */
	protected EList<ForecastMapping> mappings;

	/**
	 * The cached value of the '{@link #getChildScenarios() <em>Child Scenarios</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChildScenarios()
	 * @generated
	 * @ordered
	 */
	protected EList<Scenario> childScenarios;

	/**
	 * The cached value of the '{@link #getMappingResults() <em>Mapping Results</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMappingResults()
	 * @generated
	 * @ordered
	 */
	protected EList<MappingResult> mappingResults;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ScenarioImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ForecastPackage.Literals.SCENARIO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FPOForecastBucketsSelection> getSelections() {
		if (selections == null) {
			selections = new EObjectContainmentEList<FPOForecastBucketsSelection>(FPOForecastBucketsSelection.class, this, ForecastPackage.SCENARIO__SELECTIONS);
		}
		return selections;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ForecastPackage.SCENARIO__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ForecastMapping> getMappings() {
		if (mappings == null) {
			mappings = new EObjectContainmentEList<ForecastMapping>(ForecastMapping.class, this, ForecastPackage.SCENARIO__MAPPINGS);
		}
		return mappings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Scenario> getChildScenarios() {
		if (childScenarios == null) {
			childScenarios = new EObjectContainmentEList<Scenario>(Scenario.class, this, ForecastPackage.SCENARIO__CHILD_SCENARIOS);
		}
		return childScenarios;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MappingResult> getMappingResults() {
		if (mappingResults == null) {
			mappingResults = new EObjectContainmentEList<MappingResult>(MappingResult.class, this, ForecastPackage.SCENARIO__MAPPING_RESULTS);
		}
		return mappingResults;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ForecastPackage.SCENARIO__SELECTIONS:
				return ((InternalEList<?>)getSelections()).basicRemove(otherEnd, msgs);
			case ForecastPackage.SCENARIO__MAPPINGS:
				return ((InternalEList<?>)getMappings()).basicRemove(otherEnd, msgs);
			case ForecastPackage.SCENARIO__CHILD_SCENARIOS:
				return ((InternalEList<?>)getChildScenarios()).basicRemove(otherEnd, msgs);
			case ForecastPackage.SCENARIO__MAPPING_RESULTS:
				return ((InternalEList<?>)getMappingResults()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ForecastPackage.SCENARIO__SELECTIONS:
				return getSelections();
			case ForecastPackage.SCENARIO__NAME:
				return getName();
			case ForecastPackage.SCENARIO__MAPPINGS:
				return getMappings();
			case ForecastPackage.SCENARIO__CHILD_SCENARIOS:
				return getChildScenarios();
			case ForecastPackage.SCENARIO__MAPPING_RESULTS:
				return getMappingResults();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ForecastPackage.SCENARIO__SELECTIONS:
				getSelections().clear();
				getSelections().addAll((Collection<? extends FPOForecastBucketsSelection>)newValue);
				return;
			case ForecastPackage.SCENARIO__NAME:
				setName((String)newValue);
				return;
			case ForecastPackage.SCENARIO__MAPPINGS:
				getMappings().clear();
				getMappings().addAll((Collection<? extends ForecastMapping>)newValue);
				return;
			case ForecastPackage.SCENARIO__CHILD_SCENARIOS:
				getChildScenarios().clear();
				getChildScenarios().addAll((Collection<? extends Scenario>)newValue);
				return;
			case ForecastPackage.SCENARIO__MAPPING_RESULTS:
				getMappingResults().clear();
				getMappingResults().addAll((Collection<? extends MappingResult>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ForecastPackage.SCENARIO__SELECTIONS:
				getSelections().clear();
				return;
			case ForecastPackage.SCENARIO__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ForecastPackage.SCENARIO__MAPPINGS:
				getMappings().clear();
				return;
			case ForecastPackage.SCENARIO__CHILD_SCENARIOS:
				getChildScenarios().clear();
				return;
			case ForecastPackage.SCENARIO__MAPPING_RESULTS:
				getMappingResults().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ForecastPackage.SCENARIO__SELECTIONS:
				return selections != null && !selections.isEmpty();
			case ForecastPackage.SCENARIO__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ForecastPackage.SCENARIO__MAPPINGS:
				return mappings != null && !mappings.isEmpty();
			case ForecastPackage.SCENARIO__CHILD_SCENARIOS:
				return childScenarios != null && !childScenarios.isEmpty();
			case ForecastPackage.SCENARIO__MAPPING_RESULTS:
				return mappingResults != null && !mappingResults.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (Name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //ScenarioImpl
