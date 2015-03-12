/**
 */
package cpt;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link cpt.DataSet#getName <em>Name</em>}</li>
 *   <li>{@link cpt.DataSet#getProducts <em>Products</em>}</li>
 *   <li>{@link cpt.DataSet#getSortingPlans <em>Sorting Plans</em>}</li>
 *   <li>{@link cpt.DataSet#getSortingSplits <em>Sorting Splits</em>}</li>
 *   <li>{@link cpt.DataSet#getVolumes <em>Volumes</em>}</li>
 * </ul>
 * </p>
 *
 * @see cpt.CptPackage#getDataSet()
 * @model
 * @generated
 */
public interface DataSet extends EObject {
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
	 * @see cpt.CptPackage#getDataSet_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link cpt.DataSet#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Products</b></em>' containment reference list.
	 * The list contents are of type {@link cpt.Product}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Products</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Products</em>' containment reference list.
	 * @see cpt.CptPackage#getDataSet_Products()
	 * @model containment="true"
	 * @generated
	 */
	EList<Product> getProducts();

	/**
	 * Returns the value of the '<em><b>Sorting Plans</b></em>' containment reference list.
	 * The list contents are of type {@link cpt.SortingPlan}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sorting Plans</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sorting Plans</em>' containment reference list.
	 * @see cpt.CptPackage#getDataSet_SortingPlans()
	 * @model containment="true"
	 * @generated
	 */
	EList<SortingPlan> getSortingPlans();

	/**
	 * Returns the value of the '<em><b>Sorting Splits</b></em>' containment reference list.
	 * The list contents are of type {@link cpt.SortingSplit}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sorting Splits</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sorting Splits</em>' containment reference list.
	 * @see cpt.CptPackage#getDataSet_SortingSplits()
	 * @model containment="true"
	 * @generated
	 */
	EList<SortingSplit> getSortingSplits();

	/**
	 * Returns the value of the '<em><b>Volumes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Volumes</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Volumes</em>' containment reference.
	 * @see #setVolumes(Volume)
	 * @see cpt.CptPackage#getDataSet_Volumes()
	 * @model containment="true"
	 * @generated
	 */
	Volume getVolumes();

	/**
	 * Sets the value of the '{@link cpt.DataSet#getVolumes <em>Volumes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Volumes</em>' containment reference.
	 * @see #getVolumes()
	 * @generated
	 */
	void setVolumes(Volume value);

} // DataSet
