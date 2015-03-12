/**
 */
package cpt.impl;

import cpt.CptPackage;
import cpt.DataSet;
import cpt.Domain;
import cpt.Problem;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Domain</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link cpt.impl.DomainImpl#getName <em>Name</em>}</li>
 *   <li>{@link cpt.impl.DomainImpl#getDataSets <em>Data Sets</em>}</li>
 *   <li>{@link cpt.impl.DomainImpl#getProblems <em>Problems</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DomainImpl extends MinimalEObjectImpl.Container implements Domain {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDataSets() <em>Data Sets</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataSets()
	 * @generated
	 * @ordered
	 */
	protected EList<DataSet> dataSets;

	/**
	 * The cached value of the '{@link #getProblems() <em>Problems</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProblems()
	 * @generated
	 * @ordered
	 */
	protected Problem problems;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DomainImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CptPackage.Literals.DOMAIN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CptPackage.DOMAIN__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataSet> getDataSets() {
		if (dataSets == null) {
			dataSets = new EObjectContainmentEList<DataSet>(DataSet.class, this, CptPackage.DOMAIN__DATA_SETS);
		}
		return dataSets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Problem getProblems() {
		return problems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProblems(Problem newProblems, NotificationChain msgs) {
		Problem oldProblems = problems;
		problems = newProblems;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CptPackage.DOMAIN__PROBLEMS, oldProblems, newProblems);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProblems(Problem newProblems) {
		if (newProblems != problems) {
			NotificationChain msgs = null;
			if (problems != null)
				msgs = ((InternalEObject)problems).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CptPackage.DOMAIN__PROBLEMS, null, msgs);
			if (newProblems != null)
				msgs = ((InternalEObject)newProblems).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CptPackage.DOMAIN__PROBLEMS, null, msgs);
			msgs = basicSetProblems(newProblems, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CptPackage.DOMAIN__PROBLEMS, newProblems, newProblems));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CptPackage.DOMAIN__DATA_SETS:
				return ((InternalEList<?>)getDataSets()).basicRemove(otherEnd, msgs);
			case CptPackage.DOMAIN__PROBLEMS:
				return basicSetProblems(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CptPackage.DOMAIN__NAME:
				return getName();
			case CptPackage.DOMAIN__DATA_SETS:
				return getDataSets();
			case CptPackage.DOMAIN__PROBLEMS:
				return getProblems();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CptPackage.DOMAIN__NAME:
				setName((String)newValue);
				return;
			case CptPackage.DOMAIN__DATA_SETS:
				getDataSets().clear();
				getDataSets().addAll((Collection<? extends DataSet>)newValue);
				return;
			case CptPackage.DOMAIN__PROBLEMS:
				setProblems((Problem)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case CptPackage.DOMAIN__NAME:
				setName(NAME_EDEFAULT);
				return;
			case CptPackage.DOMAIN__DATA_SETS:
				getDataSets().clear();
				return;
			case CptPackage.DOMAIN__PROBLEMS:
				setProblems((Problem)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case CptPackage.DOMAIN__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case CptPackage.DOMAIN__DATA_SETS:
				return dataSets != null && !dataSets.isEmpty();
			case CptPackage.DOMAIN__PROBLEMS:
				return problems != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (Name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //DomainImpl
