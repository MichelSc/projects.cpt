/**
 */
package cpt;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Volume</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link cpt.Volume#getProduct <em>Product</em>}</li>
 *   <li>{@link cpt.Volume#getVolume <em>Volume</em>}</li>
 *   <li>{@link cpt.Volume#getSortingSplit <em>Sorting Split</em>}</li>
 *   <li>{@link cpt.Volume#getSourceTime <em>Source Time</em>}</li>
 *   <li>{@link cpt.Volume#getDeliveryDate <em>Delivery Date</em>}</li>
 * </ul>
 * </p>
 *
 * @see cpt.CptPackage#getVolume()
 * @model
 * @generated
 */
public interface Volume extends EObject {
	/**
	 * Returns the value of the '<em><b>Product</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product</em>' reference.
	 * @see #setProduct(UnsortedProduct)
	 * @see cpt.CptPackage#getVolume_Product()
	 * @model required="true"
	 * @generated
	 */
	UnsortedProduct getProduct();

	/**
	 * Sets the value of the '{@link cpt.Volume#getProduct <em>Product</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product</em>' reference.
	 * @see #getProduct()
	 * @generated
	 */
	void setProduct(UnsortedProduct value);

	/**
	 * Returns the value of the '<em><b>Volume</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Volume</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Volume</em>' attribute.
	 * @see #setVolume(float)
	 * @see cpt.CptPackage#getVolume_Volume()
	 * @model
	 * @generated
	 */
	float getVolume();

	/**
	 * Sets the value of the '{@link cpt.Volume#getVolume <em>Volume</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Volume</em>' attribute.
	 * @see #getVolume()
	 * @generated
	 */
	void setVolume(float value);

	/**
	 * Returns the value of the '<em><b>Sorting Split</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sorting Split</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sorting Split</em>' reference.
	 * @see #setSortingSplit(SortingSplit)
	 * @see cpt.CptPackage#getVolume_SortingSplit()
	 * @model required="true"
	 * @generated
	 */
	SortingSplit getSortingSplit();

	/**
	 * Sets the value of the '{@link cpt.Volume#getSortingSplit <em>Sorting Split</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sorting Split</em>' reference.
	 * @see #getSortingSplit()
	 * @generated
	 */
	void setSortingSplit(SortingSplit value);

	/**
	 * Returns the value of the '<em><b>Source Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Time</em>' attribute.
	 * @see #setSourceTime(Date)
	 * @see cpt.CptPackage#getVolume_SourceTime()
	 * @model
	 * @generated
	 */
	Date getSourceTime();

	/**
	 * Sets the value of the '{@link cpt.Volume#getSourceTime <em>Source Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Time</em>' attribute.
	 * @see #getSourceTime()
	 * @generated
	 */
	void setSourceTime(Date value);

	/**
	 * Returns the value of the '<em><b>Delivery Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Delivery Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delivery Date</em>' attribute.
	 * @see #setDeliveryDate(Date)
	 * @see cpt.CptPackage#getVolume_DeliveryDate()
	 * @model
	 * @generated
	 */
	Date getDeliveryDate();

	/**
	 * Sets the value of the '{@link cpt.Volume#getDeliveryDate <em>Delivery Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delivery Date</em>' attribute.
	 * @see #getDeliveryDate()
	 * @generated
	 */
	void setDeliveryDate(Date value);

} // Volume
