/**
 */
package com.misc.projects.Forecast.impl;

import com.misc.projects.Forecast.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ForecastFactoryImpl extends EFactoryImpl implements ForecastFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ForecastFactory init() {
		try {
			ForecastFactory theForecastFactory = (ForecastFactory)EPackage.Registry.INSTANCE.getEFactory(ForecastPackage.eNS_URI);
			if (theForecastFactory != null) {
				return theForecastFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ForecastFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ForecastFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ForecastPackage.SCENARIO: return createScenario();
			case ForecastPackage.FPO_FORECAST_BUCKETS_SELECTION: return createFPOForecastBucketsSelection();
			case ForecastPackage.SOURCE_BUCKET: return createSourceBucket();
			case ForecastPackage.FORECAST_MAPPING: return createForecastMapping();
			case ForecastPackage.FORECAST_MAPPING_ELEMENT: return createForecastMappingElement();
			case ForecastPackage.MAPPING_RESULT: return createMappingResult();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Scenario createScenario() {
		ScenarioImpl scenario = new ScenarioImpl();
		return scenario;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FPOForecastBucketsSelection createFPOForecastBucketsSelection() {
		FPOForecastBucketsSelectionImpl fpoForecastBucketsSelection = new FPOForecastBucketsSelectionImpl();
		return fpoForecastBucketsSelection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SourceBucket createSourceBucket() {
		SourceBucketImpl sourceBucket = new SourceBucketImpl();
		return sourceBucket;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ForecastMapping createForecastMapping() {
		ForecastMappingImpl forecastMapping = new ForecastMappingImpl();
		return forecastMapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ForecastMappingElement createForecastMappingElement() {
		ForecastMappingElementImpl forecastMappingElement = new ForecastMappingElementImpl();
		return forecastMappingElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MappingResult createMappingResult() {
		MappingResultImpl mappingResult = new MappingResultImpl();
		return mappingResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ForecastPackage getForecastPackage() {
		return (ForecastPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ForecastPackage getPackage() {
		return ForecastPackage.eINSTANCE;
	}

} //ForecastFactoryImpl
