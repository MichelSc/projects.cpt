/**
 */
package cpt;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Domain</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link cpt.Domain#getName <em>Name</em>}</li>
 *   <li>{@link cpt.Domain#getDataSets <em>Data Sets</em>}</li>
 *   <li>{@link cpt.Domain#getProblems <em>Problems</em>}</li>
 * </ul>
 * </p>
 *
 * @see cpt.CptPackage#getDomain()
 * @model
 * @generated
 */
public interface Domain extends EObject {
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
	 * @see cpt.CptPackage#getDomain_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link cpt.Domain#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Data Sets</b></em>' containment reference list.
	 * The list contents are of type {@link cpt.DataSet}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Sets</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Sets</em>' containment reference list.
	 * @see cpt.CptPackage#getDomain_DataSets()
	 * @model containment="true"
	 * @generated
	 */
	EList<DataSet> getDataSets();

	/**
	 * Returns the value of the '<em><b>Problems</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Problems</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Problems</em>' containment reference.
	 * @see #setProblems(Problem)
	 * @see cpt.CptPackage#getDomain_Problems()
	 * @model containment="true"
	 * @generated
	 */
	Problem getProblems();

	/**
	 * Sets the value of the '{@link cpt.Domain#getProblems <em>Problems</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Problems</em>' containment reference.
	 * @see #getProblems()
	 * @generated
	 */
	void setProblems(Problem value);

} // Domain
