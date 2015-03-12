/**
 */
package cpt;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unsorted Product</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link cpt.UnsortedProduct#getEndProducts <em>End Products</em>}</li>
 * </ul>
 * </p>
 *
 * @see cpt.CptPackage#getUnsortedProduct()
 * @model
 * @generated
 */
public interface UnsortedProduct extends Product {
	/**
	 * Returns the value of the '<em><b>End Products</b></em>' reference list.
	 * The list contents are of type {@link cpt.EndProduct}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End Products</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Products</em>' reference list.
	 * @see cpt.CptPackage#getUnsortedProduct_EndProducts()
	 * @model
	 * @generated
	 */
	EList<EndProduct> getEndProducts();

} // UnsortedProduct
