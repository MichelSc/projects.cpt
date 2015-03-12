/**
 */
package cpt;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sorting Split</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link cpt.SortingSplit#getEndProducts <em>End Products</em>}</li>
 *   <li>{@link cpt.SortingSplit#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see cpt.CptPackage#getSortingSplit()
 * @model
 * @generated
 */
public interface SortingSplit extends EObject {
	/**
	 * Returns the value of the '<em><b>End Products</b></em>' containment reference list.
	 * The list contents are of type {@link cpt.SortingSplitProduct}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End Products</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Products</em>' containment reference list.
	 * @see cpt.CptPackage#getSortingSplit_EndProducts()
	 * @model containment="true"
	 * @generated
	 */
	EList<SortingSplitProduct> getEndProducts();

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
	 * @see cpt.CptPackage#getSortingSplit_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link cpt.SortingSplit#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // SortingSplit
