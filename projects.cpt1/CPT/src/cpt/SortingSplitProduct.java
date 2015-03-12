/**
 */
package cpt;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sorting Split Product</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link cpt.SortingSplitProduct#getEndProduct <em>End Product</em>}</li>
 *   <li>{@link cpt.SortingSplitProduct#getWeight <em>Weight</em>}</li>
 * </ul>
 * </p>
 *
 * @see cpt.CptPackage#getSortingSplitProduct()
 * @model
 * @generated
 */
public interface SortingSplitProduct extends EObject {
	/**
	 * Returns the value of the '<em><b>End Product</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End Product</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Product</em>' reference.
	 * @see #setEndProduct(EndProduct)
	 * @see cpt.CptPackage#getSortingSplitProduct_EndProduct()
	 * @model
	 * @generated
	 */
	EndProduct getEndProduct();

	/**
	 * Sets the value of the '{@link cpt.SortingSplitProduct#getEndProduct <em>End Product</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Product</em>' reference.
	 * @see #getEndProduct()
	 * @generated
	 */
	void setEndProduct(EndProduct value);

	/**
	 * Returns the value of the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Weight</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Weight</em>' attribute.
	 * @see #setWeight(float)
	 * @see cpt.CptPackage#getSortingSplitProduct_Weight()
	 * @model
	 * @generated
	 */
	float getWeight();

	/**
	 * Sets the value of the '{@link cpt.SortingSplitProduct#getWeight <em>Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Weight</em>' attribute.
	 * @see #getWeight()
	 * @generated
	 */
	void setWeight(float value);

} // SortingSplitProduct
