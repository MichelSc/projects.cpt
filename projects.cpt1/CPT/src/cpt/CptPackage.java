/**
 */
package cpt;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see cpt.CptFactory
 * @model kind="package"
 * @generated
 */
public interface CptPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "cpt";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "www.michel.be/cpt";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "cpt";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CptPackage eINSTANCE = cpt.impl.CptPackageImpl.init();

	/**
	 * The meta object id for the '{@link cpt.impl.DomainImpl <em>Domain</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cpt.impl.DomainImpl
	 * @see cpt.impl.CptPackageImpl#getDomain()
	 * @generated
	 */
	int DOMAIN = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN__NAME = 0;

	/**
	 * The feature id for the '<em><b>Data Sets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN__DATA_SETS = 1;

	/**
	 * The feature id for the '<em><b>Problems</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN__PROBLEMS = 2;

	/**
	 * The number of structural features of the '<em>Domain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Domain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link cpt.impl.DataSetImpl <em>Data Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cpt.impl.DataSetImpl
	 * @see cpt.impl.CptPackageImpl#getDataSet()
	 * @generated
	 */
	int DATA_SET = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SET__NAME = 0;

	/**
	 * The feature id for the '<em><b>Products</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SET__PRODUCTS = 1;

	/**
	 * The feature id for the '<em><b>Sorting Plans</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SET__SORTING_PLANS = 2;

	/**
	 * The feature id for the '<em><b>Sorting Splits</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SET__SORTING_SPLITS = 3;

	/**
	 * The feature id for the '<em><b>Volumes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SET__VOLUMES = 4;

	/**
	 * The number of structural features of the '<em>Data Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SET_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Data Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SET_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link cpt.impl.ProductImpl <em>Product</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cpt.impl.ProductImpl
	 * @see cpt.impl.CptPackageImpl#getProduct()
	 * @generated
	 */
	int PRODUCT = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Product</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Product</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link cpt.impl.SortingPlanImpl <em>Sorting Plan</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cpt.impl.SortingPlanImpl
	 * @see cpt.impl.CptPackageImpl#getSortingPlan()
	 * @generated
	 */
	int SORTING_PLAN = 3;

	/**
	 * The feature id for the '<em><b>Outputs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTING_PLAN__OUTPUTS = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTING_PLAN__NAME = 1;

	/**
	 * The number of structural features of the '<em>Sorting Plan</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTING_PLAN_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Sorting Plan</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTING_PLAN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link cpt.impl.SortingSplitImpl <em>Sorting Split</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cpt.impl.SortingSplitImpl
	 * @see cpt.impl.CptPackageImpl#getSortingSplit()
	 * @generated
	 */
	int SORTING_SPLIT = 4;

	/**
	 * The feature id for the '<em><b>End Products</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTING_SPLIT__END_PRODUCTS = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTING_SPLIT__NAME = 1;

	/**
	 * The number of structural features of the '<em>Sorting Split</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTING_SPLIT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Sorting Split</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTING_SPLIT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link cpt.impl.VolumeImpl <em>Volume</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cpt.impl.VolumeImpl
	 * @see cpt.impl.CptPackageImpl#getVolume()
	 * @generated
	 */
	int VOLUME = 5;

	/**
	 * The feature id for the '<em><b>Product</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUME__PRODUCT = 0;

	/**
	 * The feature id for the '<em><b>Volume</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUME__VOLUME = 1;

	/**
	 * The feature id for the '<em><b>Sorting Split</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUME__SORTING_SPLIT = 2;

	/**
	 * The feature id for the '<em><b>Source Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUME__SOURCE_TIME = 3;

	/**
	 * The feature id for the '<em><b>Delivery Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUME__DELIVERY_DATE = 4;

	/**
	 * The number of structural features of the '<em>Volume</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUME_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Volume</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUME_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link cpt.impl.SortingSplitProductImpl <em>Sorting Split Product</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cpt.impl.SortingSplitProductImpl
	 * @see cpt.impl.CptPackageImpl#getSortingSplitProduct()
	 * @generated
	 */
	int SORTING_SPLIT_PRODUCT = 6;

	/**
	 * The feature id for the '<em><b>End Product</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTING_SPLIT_PRODUCT__END_PRODUCT = 0;

	/**
	 * The feature id for the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTING_SPLIT_PRODUCT__WEIGHT = 1;

	/**
	 * The number of structural features of the '<em>Sorting Split Product</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTING_SPLIT_PRODUCT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Sorting Split Product</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTING_SPLIT_PRODUCT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link cpt.impl.UnsortedProductImpl <em>Unsorted Product</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cpt.impl.UnsortedProductImpl
	 * @see cpt.impl.CptPackageImpl#getUnsortedProduct()
	 * @generated
	 */
	int UNSORTED_PRODUCT = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSORTED_PRODUCT__NAME = PRODUCT__NAME;

	/**
	 * The feature id for the '<em><b>End Products</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSORTED_PRODUCT__END_PRODUCTS = PRODUCT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Unsorted Product</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSORTED_PRODUCT_FEATURE_COUNT = PRODUCT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Unsorted Product</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSORTED_PRODUCT_OPERATION_COUNT = PRODUCT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cpt.impl.EndProductImpl <em>End Product</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cpt.impl.EndProductImpl
	 * @see cpt.impl.CptPackageImpl#getEndProduct()
	 * @generated
	 */
	int END_PRODUCT = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_PRODUCT__NAME = PRODUCT__NAME;

	/**
	 * The feature id for the '<em><b>Cut Off Hours</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_PRODUCT__CUT_OFF_HOURS = PRODUCT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>End Product</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_PRODUCT_FEATURE_COUNT = PRODUCT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>End Product</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_PRODUCT_OPERATION_COUNT = PRODUCT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cpt.impl.ProblemImpl <em>Problem</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cpt.impl.ProblemImpl
	 * @see cpt.impl.CptPackageImpl#getProblem()
	 * @generated
	 */
	int PROBLEM = 9;

	/**
	 * The feature id for the '<em><b>Sorting Plans</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM__SORTING_PLANS = 0;

	/**
	 * The feature id for the '<em><b>Data Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM__DATA_SET = 1;

	/**
	 * The feature id for the '<em><b>Volumes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM__VOLUMES = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM__NAME = 3;

	/**
	 * The number of structural features of the '<em>Problem</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Problem</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link cpt.Domain <em>Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Domain</em>'.
	 * @see cpt.Domain
	 * @generated
	 */
	EClass getDomain();

	/**
	 * Returns the meta object for the attribute '{@link cpt.Domain#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see cpt.Domain#getName()
	 * @see #getDomain()
	 * @generated
	 */
	EAttribute getDomain_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link cpt.Domain#getDataSets <em>Data Sets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Data Sets</em>'.
	 * @see cpt.Domain#getDataSets()
	 * @see #getDomain()
	 * @generated
	 */
	EReference getDomain_DataSets();

	/**
	 * Returns the meta object for the containment reference '{@link cpt.Domain#getProblems <em>Problems</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Problems</em>'.
	 * @see cpt.Domain#getProblems()
	 * @see #getDomain()
	 * @generated
	 */
	EReference getDomain_Problems();

	/**
	 * Returns the meta object for class '{@link cpt.DataSet <em>Data Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Set</em>'.
	 * @see cpt.DataSet
	 * @generated
	 */
	EClass getDataSet();

	/**
	 * Returns the meta object for the attribute '{@link cpt.DataSet#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see cpt.DataSet#getName()
	 * @see #getDataSet()
	 * @generated
	 */
	EAttribute getDataSet_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link cpt.DataSet#getProducts <em>Products</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Products</em>'.
	 * @see cpt.DataSet#getProducts()
	 * @see #getDataSet()
	 * @generated
	 */
	EReference getDataSet_Products();

	/**
	 * Returns the meta object for the containment reference list '{@link cpt.DataSet#getSortingPlans <em>Sorting Plans</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sorting Plans</em>'.
	 * @see cpt.DataSet#getSortingPlans()
	 * @see #getDataSet()
	 * @generated
	 */
	EReference getDataSet_SortingPlans();

	/**
	 * Returns the meta object for the containment reference list '{@link cpt.DataSet#getSortingSplits <em>Sorting Splits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sorting Splits</em>'.
	 * @see cpt.DataSet#getSortingSplits()
	 * @see #getDataSet()
	 * @generated
	 */
	EReference getDataSet_SortingSplits();

	/**
	 * Returns the meta object for the containment reference '{@link cpt.DataSet#getVolumes <em>Volumes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Volumes</em>'.
	 * @see cpt.DataSet#getVolumes()
	 * @see #getDataSet()
	 * @generated
	 */
	EReference getDataSet_Volumes();

	/**
	 * Returns the meta object for class '{@link cpt.Product <em>Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Product</em>'.
	 * @see cpt.Product
	 * @generated
	 */
	EClass getProduct();

	/**
	 * Returns the meta object for the attribute '{@link cpt.Product#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see cpt.Product#getName()
	 * @see #getProduct()
	 * @generated
	 */
	EAttribute getProduct_Name();

	/**
	 * Returns the meta object for class '{@link cpt.SortingPlan <em>Sorting Plan</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sorting Plan</em>'.
	 * @see cpt.SortingPlan
	 * @generated
	 */
	EClass getSortingPlan();

	/**
	 * Returns the meta object for the reference list '{@link cpt.SortingPlan#getOutputs <em>Outputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Outputs</em>'.
	 * @see cpt.SortingPlan#getOutputs()
	 * @see #getSortingPlan()
	 * @generated
	 */
	EReference getSortingPlan_Outputs();

	/**
	 * Returns the meta object for the attribute '{@link cpt.SortingPlan#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see cpt.SortingPlan#getName()
	 * @see #getSortingPlan()
	 * @generated
	 */
	EAttribute getSortingPlan_Name();

	/**
	 * Returns the meta object for class '{@link cpt.SortingSplit <em>Sorting Split</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sorting Split</em>'.
	 * @see cpt.SortingSplit
	 * @generated
	 */
	EClass getSortingSplit();

	/**
	 * Returns the meta object for the containment reference list '{@link cpt.SortingSplit#getEndProducts <em>End Products</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>End Products</em>'.
	 * @see cpt.SortingSplit#getEndProducts()
	 * @see #getSortingSplit()
	 * @generated
	 */
	EReference getSortingSplit_EndProducts();

	/**
	 * Returns the meta object for the attribute '{@link cpt.SortingSplit#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see cpt.SortingSplit#getName()
	 * @see #getSortingSplit()
	 * @generated
	 */
	EAttribute getSortingSplit_Name();

	/**
	 * Returns the meta object for class '{@link cpt.Volume <em>Volume</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Volume</em>'.
	 * @see cpt.Volume
	 * @generated
	 */
	EClass getVolume();

	/**
	 * Returns the meta object for the reference '{@link cpt.Volume#getProduct <em>Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Product</em>'.
	 * @see cpt.Volume#getProduct()
	 * @see #getVolume()
	 * @generated
	 */
	EReference getVolume_Product();

	/**
	 * Returns the meta object for the attribute '{@link cpt.Volume#getVolume <em>Volume</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Volume</em>'.
	 * @see cpt.Volume#getVolume()
	 * @see #getVolume()
	 * @generated
	 */
	EAttribute getVolume_Volume();

	/**
	 * Returns the meta object for the reference '{@link cpt.Volume#getSortingSplit <em>Sorting Split</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sorting Split</em>'.
	 * @see cpt.Volume#getSortingSplit()
	 * @see #getVolume()
	 * @generated
	 */
	EReference getVolume_SortingSplit();

	/**
	 * Returns the meta object for the attribute '{@link cpt.Volume#getSourceTime <em>Source Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source Time</em>'.
	 * @see cpt.Volume#getSourceTime()
	 * @see #getVolume()
	 * @generated
	 */
	EAttribute getVolume_SourceTime();

	/**
	 * Returns the meta object for the attribute '{@link cpt.Volume#getDeliveryDate <em>Delivery Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Delivery Date</em>'.
	 * @see cpt.Volume#getDeliveryDate()
	 * @see #getVolume()
	 * @generated
	 */
	EAttribute getVolume_DeliveryDate();

	/**
	 * Returns the meta object for class '{@link cpt.SortingSplitProduct <em>Sorting Split Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sorting Split Product</em>'.
	 * @see cpt.SortingSplitProduct
	 * @generated
	 */
	EClass getSortingSplitProduct();

	/**
	 * Returns the meta object for the reference '{@link cpt.SortingSplitProduct#getEndProduct <em>End Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>End Product</em>'.
	 * @see cpt.SortingSplitProduct#getEndProduct()
	 * @see #getSortingSplitProduct()
	 * @generated
	 */
	EReference getSortingSplitProduct_EndProduct();

	/**
	 * Returns the meta object for the attribute '{@link cpt.SortingSplitProduct#getWeight <em>Weight</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Weight</em>'.
	 * @see cpt.SortingSplitProduct#getWeight()
	 * @see #getSortingSplitProduct()
	 * @generated
	 */
	EAttribute getSortingSplitProduct_Weight();

	/**
	 * Returns the meta object for class '{@link cpt.UnsortedProduct <em>Unsorted Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unsorted Product</em>'.
	 * @see cpt.UnsortedProduct
	 * @generated
	 */
	EClass getUnsortedProduct();

	/**
	 * Returns the meta object for the reference list '{@link cpt.UnsortedProduct#getEndProducts <em>End Products</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>End Products</em>'.
	 * @see cpt.UnsortedProduct#getEndProducts()
	 * @see #getUnsortedProduct()
	 * @generated
	 */
	EReference getUnsortedProduct_EndProducts();

	/**
	 * Returns the meta object for class '{@link cpt.EndProduct <em>End Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>End Product</em>'.
	 * @see cpt.EndProduct
	 * @generated
	 */
	EClass getEndProduct();

	/**
	 * Returns the meta object for the attribute '{@link cpt.EndProduct#getCutOffHours <em>Cut Off Hours</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cut Off Hours</em>'.
	 * @see cpt.EndProduct#getCutOffHours()
	 * @see #getEndProduct()
	 * @generated
	 */
	EAttribute getEndProduct_CutOffHours();

	/**
	 * Returns the meta object for class '{@link cpt.Problem <em>Problem</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Problem</em>'.
	 * @see cpt.Problem
	 * @generated
	 */
	EClass getProblem();

	/**
	 * Returns the meta object for the reference list '{@link cpt.Problem#getSortingPlans <em>Sorting Plans</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Sorting Plans</em>'.
	 * @see cpt.Problem#getSortingPlans()
	 * @see #getProblem()
	 * @generated
	 */
	EReference getProblem_SortingPlans();

	/**
	 * Returns the meta object for the reference '{@link cpt.Problem#getDataSet <em>Data Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Data Set</em>'.
	 * @see cpt.Problem#getDataSet()
	 * @see #getProblem()
	 * @generated
	 */
	EReference getProblem_DataSet();

	/**
	 * Returns the meta object for the reference list '{@link cpt.Problem#getVolumes <em>Volumes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Volumes</em>'.
	 * @see cpt.Problem#getVolumes()
	 * @see #getProblem()
	 * @generated
	 */
	EReference getProblem_Volumes();

	/**
	 * Returns the meta object for the attribute '{@link cpt.Problem#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see cpt.Problem#getName()
	 * @see #getProblem()
	 * @generated
	 */
	EAttribute getProblem_Name();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CptFactory getCptFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link cpt.impl.DomainImpl <em>Domain</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cpt.impl.DomainImpl
		 * @see cpt.impl.CptPackageImpl#getDomain()
		 * @generated
		 */
		EClass DOMAIN = eINSTANCE.getDomain();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOMAIN__NAME = eINSTANCE.getDomain_Name();

		/**
		 * The meta object literal for the '<em><b>Data Sets</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN__DATA_SETS = eINSTANCE.getDomain_DataSets();

		/**
		 * The meta object literal for the '<em><b>Problems</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN__PROBLEMS = eINSTANCE.getDomain_Problems();

		/**
		 * The meta object literal for the '{@link cpt.impl.DataSetImpl <em>Data Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cpt.impl.DataSetImpl
		 * @see cpt.impl.CptPackageImpl#getDataSet()
		 * @generated
		 */
		EClass DATA_SET = eINSTANCE.getDataSet();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_SET__NAME = eINSTANCE.getDataSet_Name();

		/**
		 * The meta object literal for the '<em><b>Products</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_SET__PRODUCTS = eINSTANCE.getDataSet_Products();

		/**
		 * The meta object literal for the '<em><b>Sorting Plans</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_SET__SORTING_PLANS = eINSTANCE.getDataSet_SortingPlans();

		/**
		 * The meta object literal for the '<em><b>Sorting Splits</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_SET__SORTING_SPLITS = eINSTANCE.getDataSet_SortingSplits();

		/**
		 * The meta object literal for the '<em><b>Volumes</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_SET__VOLUMES = eINSTANCE.getDataSet_Volumes();

		/**
		 * The meta object literal for the '{@link cpt.impl.ProductImpl <em>Product</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cpt.impl.ProductImpl
		 * @see cpt.impl.CptPackageImpl#getProduct()
		 * @generated
		 */
		EClass PRODUCT = eINSTANCE.getProduct();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT__NAME = eINSTANCE.getProduct_Name();

		/**
		 * The meta object literal for the '{@link cpt.impl.SortingPlanImpl <em>Sorting Plan</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cpt.impl.SortingPlanImpl
		 * @see cpt.impl.CptPackageImpl#getSortingPlan()
		 * @generated
		 */
		EClass SORTING_PLAN = eINSTANCE.getSortingPlan();

		/**
		 * The meta object literal for the '<em><b>Outputs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SORTING_PLAN__OUTPUTS = eINSTANCE.getSortingPlan_Outputs();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SORTING_PLAN__NAME = eINSTANCE.getSortingPlan_Name();

		/**
		 * The meta object literal for the '{@link cpt.impl.SortingSplitImpl <em>Sorting Split</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cpt.impl.SortingSplitImpl
		 * @see cpt.impl.CptPackageImpl#getSortingSplit()
		 * @generated
		 */
		EClass SORTING_SPLIT = eINSTANCE.getSortingSplit();

		/**
		 * The meta object literal for the '<em><b>End Products</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SORTING_SPLIT__END_PRODUCTS = eINSTANCE.getSortingSplit_EndProducts();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SORTING_SPLIT__NAME = eINSTANCE.getSortingSplit_Name();

		/**
		 * The meta object literal for the '{@link cpt.impl.VolumeImpl <em>Volume</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cpt.impl.VolumeImpl
		 * @see cpt.impl.CptPackageImpl#getVolume()
		 * @generated
		 */
		EClass VOLUME = eINSTANCE.getVolume();

		/**
		 * The meta object literal for the '<em><b>Product</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VOLUME__PRODUCT = eINSTANCE.getVolume_Product();

		/**
		 * The meta object literal for the '<em><b>Volume</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VOLUME__VOLUME = eINSTANCE.getVolume_Volume();

		/**
		 * The meta object literal for the '<em><b>Sorting Split</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VOLUME__SORTING_SPLIT = eINSTANCE.getVolume_SortingSplit();

		/**
		 * The meta object literal for the '<em><b>Source Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VOLUME__SOURCE_TIME = eINSTANCE.getVolume_SourceTime();

		/**
		 * The meta object literal for the '<em><b>Delivery Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VOLUME__DELIVERY_DATE = eINSTANCE.getVolume_DeliveryDate();

		/**
		 * The meta object literal for the '{@link cpt.impl.SortingSplitProductImpl <em>Sorting Split Product</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cpt.impl.SortingSplitProductImpl
		 * @see cpt.impl.CptPackageImpl#getSortingSplitProduct()
		 * @generated
		 */
		EClass SORTING_SPLIT_PRODUCT = eINSTANCE.getSortingSplitProduct();

		/**
		 * The meta object literal for the '<em><b>End Product</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SORTING_SPLIT_PRODUCT__END_PRODUCT = eINSTANCE.getSortingSplitProduct_EndProduct();

		/**
		 * The meta object literal for the '<em><b>Weight</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SORTING_SPLIT_PRODUCT__WEIGHT = eINSTANCE.getSortingSplitProduct_Weight();

		/**
		 * The meta object literal for the '{@link cpt.impl.UnsortedProductImpl <em>Unsorted Product</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cpt.impl.UnsortedProductImpl
		 * @see cpt.impl.CptPackageImpl#getUnsortedProduct()
		 * @generated
		 */
		EClass UNSORTED_PRODUCT = eINSTANCE.getUnsortedProduct();

		/**
		 * The meta object literal for the '<em><b>End Products</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNSORTED_PRODUCT__END_PRODUCTS = eINSTANCE.getUnsortedProduct_EndProducts();

		/**
		 * The meta object literal for the '{@link cpt.impl.EndProductImpl <em>End Product</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cpt.impl.EndProductImpl
		 * @see cpt.impl.CptPackageImpl#getEndProduct()
		 * @generated
		 */
		EClass END_PRODUCT = eINSTANCE.getEndProduct();

		/**
		 * The meta object literal for the '<em><b>Cut Off Hours</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute END_PRODUCT__CUT_OFF_HOURS = eINSTANCE.getEndProduct_CutOffHours();

		/**
		 * The meta object literal for the '{@link cpt.impl.ProblemImpl <em>Problem</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cpt.impl.ProblemImpl
		 * @see cpt.impl.CptPackageImpl#getProblem()
		 * @generated
		 */
		EClass PROBLEM = eINSTANCE.getProblem();

		/**
		 * The meta object literal for the '<em><b>Sorting Plans</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROBLEM__SORTING_PLANS = eINSTANCE.getProblem_SortingPlans();

		/**
		 * The meta object literal for the '<em><b>Data Set</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROBLEM__DATA_SET = eINSTANCE.getProblem_DataSet();

		/**
		 * The meta object literal for the '<em><b>Volumes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROBLEM__VOLUMES = eINSTANCE.getProblem_Volumes();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROBLEM__NAME = eINSTANCE.getProblem_Name();

	}

} //CptPackage
