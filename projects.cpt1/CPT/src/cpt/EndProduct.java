/**
 */
package cpt;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>End Product</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link cpt.EndProduct#getCutOffHours <em>Cut Off Hours</em>}</li>
 * </ul>
 * </p>
 *
 * @see cpt.CptPackage#getEndProduct()
 * @model
 * @generated
 */
public interface EndProduct extends Product {
	/**
	 * Returns the value of the '<em><b>Cut Off Hours</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cut Off Hours</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cut Off Hours</em>' attribute.
	 * @see #setCutOffHours(float)
	 * @see cpt.CptPackage#getEndProduct_CutOffHours()
	 * @model
	 * @generated
	 */
	float getCutOffHours();

	/**
	 * Sets the value of the '{@link cpt.EndProduct#getCutOffHours <em>Cut Off Hours</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cut Off Hours</em>' attribute.
	 * @see #getCutOffHours()
	 * @generated
	 */
	void setCutOffHours(float value);

} // EndProduct
