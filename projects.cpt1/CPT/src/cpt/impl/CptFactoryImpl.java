/**
 */
package cpt.impl;

import cpt.*;

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
public class CptFactoryImpl extends EFactoryImpl implements CptFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CptFactory init() {
		try {
			CptFactory theCptFactory = (CptFactory)EPackage.Registry.INSTANCE.getEFactory(CptPackage.eNS_URI);
			if (theCptFactory != null) {
				return theCptFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CptFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CptFactoryImpl() {
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
			case CptPackage.DOMAIN: return createDomain();
			case CptPackage.DATA_SET: return createDataSet();
			case CptPackage.PRODUCT: return createProduct();
			case CptPackage.SORTING_PLAN: return createSortingPlan();
			case CptPackage.SORTING_SPLIT: return createSortingSplit();
			case CptPackage.VOLUME: return createVolume();
			case CptPackage.SORTING_SPLIT_PRODUCT: return createSortingSplitProduct();
			case CptPackage.UNSORTED_PRODUCT: return createUnsortedProduct();
			case CptPackage.END_PRODUCT: return createEndProduct();
			case CptPackage.PROBLEM: return createProblem();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Domain createDomain() {
		DomainImpl domain = new DomainImpl();
		return domain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataSet createDataSet() {
		DataSetImpl dataSet = new DataSetImpl();
		return dataSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Product createProduct() {
		ProductImpl product = new ProductImpl();
		return product;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SortingPlan createSortingPlan() {
		SortingPlanImpl sortingPlan = new SortingPlanImpl();
		return sortingPlan;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SortingSplit createSortingSplit() {
		SortingSplitImpl sortingSplit = new SortingSplitImpl();
		return sortingSplit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Volume createVolume() {
		VolumeImpl volume = new VolumeImpl();
		return volume;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SortingSplitProduct createSortingSplitProduct() {
		SortingSplitProductImpl sortingSplitProduct = new SortingSplitProductImpl();
		return sortingSplitProduct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnsortedProduct createUnsortedProduct() {
		UnsortedProductImpl unsortedProduct = new UnsortedProductImpl();
		return unsortedProduct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EndProduct createEndProduct() {
		EndProductImpl endProduct = new EndProductImpl();
		return endProduct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Problem createProblem() {
		ProblemImpl problem = new ProblemImpl();
		return problem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CptPackage getCptPackage() {
		return (CptPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CptPackage getPackage() {
		return CptPackage.eINSTANCE;
	}

} //CptFactoryImpl
