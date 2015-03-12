/**
 */
package com.misc.projects.CptDatasetLoad.impl;

import com.misc.projects.CptDatasetLoad.CptDatasetLoadPackage;
import com.misc.projects.CptDatasetLoad.SortingPlanInputRow;
import com.misc.projects.CptDatasetLoad.SortingPlanOutputRow;
import com.misc.projects.CptDatasetLoad.SortingPlanRow;
import java.math.BigDecimal;
import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sorting Plan Row</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.misc.projects.CptDatasetLoad.impl.SortingPlanRowImpl#getSortingPlanSk <em>Sorting Plan Sk</em>}</li>
 *   <li>{@link com.misc.projects.CptDatasetLoad.impl.SortingPlanRowImpl#getSortingPlanName <em>Sorting Plan Name</em>}</li>
 *   <li>{@link com.misc.projects.CptDatasetLoad.impl.SortingPlanRowImpl#getSortingLevelPLAGGSk <em>Sorting Level PLAGG Sk</em>}</li>
 *   <li>{@link com.misc.projects.CptDatasetLoad.impl.SortingPlanRowImpl#getInputs <em>Inputs</em>}</li>
 *   <li>{@link com.misc.projects.CptDatasetLoad.impl.SortingPlanRowImpl#getOutputs <em>Outputs</em>}</li>
 *   <li>{@link com.misc.projects.CptDatasetLoad.impl.SortingPlanRowImpl#getDescription <em>Description</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SortingPlanRowImpl extends FPDSortingPanRowImpl implements SortingPlanRow {
	/**
	 * The default value of the '{@link #getSortingPlanSk() <em>Sorting Plan Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSortingPlanSk()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal SORTING_PLAN_SK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSortingPlanSk() <em>Sorting Plan Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSortingPlanSk()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal sortingPlanSk = SORTING_PLAN_SK_EDEFAULT;

	/**
	 * The default value of the '{@link #getSortingPlanName() <em>Sorting Plan Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSortingPlanName()
	 * @generated
	 * @ordered
	 */
	protected static final String SORTING_PLAN_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSortingPlanName() <em>Sorting Plan Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSortingPlanName()
	 * @generated
	 * @ordered
	 */
	protected String sortingPlanName = SORTING_PLAN_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getSortingLevelPLAGGSk() <em>Sorting Level PLAGG Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSortingLevelPLAGGSk()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal SORTING_LEVEL_PLAGG_SK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSortingLevelPLAGGSk() <em>Sorting Level PLAGG Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSortingLevelPLAGGSk()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal sortingLevelPLAGGSk = SORTING_LEVEL_PLAGG_SK_EDEFAULT;

	/**
	 * The cached value of the '{@link #getInputs() <em>Inputs</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputs()
	 * @generated
	 * @ordered
	 */
	protected EList<SortingPlanInputRow> inputs;

	/**
	 * The cached value of the '{@link #getOutputs() <em>Outputs</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputs()
	 * @generated
	 * @ordered
	 */
	protected EList<SortingPlanOutputRow> outputs;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SortingPlanRowImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CptDatasetLoadPackage.Literals.SORTING_PLAN_ROW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal getSortingPlanSk() {
		return sortingPlanSk;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSortingPlanSk(BigDecimal newSortingPlanSk) {
		BigDecimal oldSortingPlanSk = sortingPlanSk;
		sortingPlanSk = newSortingPlanSk;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CptDatasetLoadPackage.SORTING_PLAN_ROW__SORTING_PLAN_SK, oldSortingPlanSk, sortingPlanSk));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSortingPlanName() {
		return sortingPlanName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSortingPlanName(String newSortingPlanName) {
		String oldSortingPlanName = sortingPlanName;
		sortingPlanName = newSortingPlanName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CptDatasetLoadPackage.SORTING_PLAN_ROW__SORTING_PLAN_NAME, oldSortingPlanName, sortingPlanName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal getSortingLevelPLAGGSk() {
		return sortingLevelPLAGGSk;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSortingLevelPLAGGSk(BigDecimal newSortingLevelPLAGGSk) {
		BigDecimal oldSortingLevelPLAGGSk = sortingLevelPLAGGSk;
		sortingLevelPLAGGSk = newSortingLevelPLAGGSk;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CptDatasetLoadPackage.SORTING_PLAN_ROW__SORTING_LEVEL_PLAGG_SK, oldSortingLevelPLAGGSk, sortingLevelPLAGGSk));
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SortingPlanInputRow> getInputs() {
		if (inputs == null) {
			inputs = new EObjectWithInverseResolvingEList<SortingPlanInputRow>(SortingPlanInputRow.class, this, CptDatasetLoadPackage.SORTING_PLAN_ROW__INPUTS, CptDatasetLoadPackage.SORTING_PLAN_INPUT_ROW__SORTING_PLAN);
		}
		return inputs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SortingPlanOutputRow> getOutputs() {
		if (outputs == null) {
			outputs = new EObjectWithInverseResolvingEList<SortingPlanOutputRow>(SortingPlanOutputRow.class, this, CptDatasetLoadPackage.SORTING_PLAN_ROW__OUTPUTS, CptDatasetLoadPackage.SORTING_PLAN_OUTPUT_ROW__SORTING_PLAN);
		}
		return outputs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CptDatasetLoadPackage.SORTING_PLAN_ROW__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CptDatasetLoadPackage.SORTING_PLAN_ROW__INPUTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getInputs()).basicAdd(otherEnd, msgs);
			case CptDatasetLoadPackage.SORTING_PLAN_ROW__OUTPUTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOutputs()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CptDatasetLoadPackage.SORTING_PLAN_ROW__INPUTS:
				return ((InternalEList<?>)getInputs()).basicRemove(otherEnd, msgs);
			case CptDatasetLoadPackage.SORTING_PLAN_ROW__OUTPUTS:
				return ((InternalEList<?>)getOutputs()).basicRemove(otherEnd, msgs);
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
			case CptDatasetLoadPackage.SORTING_PLAN_ROW__SORTING_PLAN_SK:
				return getSortingPlanSk();
			case CptDatasetLoadPackage.SORTING_PLAN_ROW__SORTING_PLAN_NAME:
				return getSortingPlanName();
			case CptDatasetLoadPackage.SORTING_PLAN_ROW__SORTING_LEVEL_PLAGG_SK:
				return getSortingLevelPLAGGSk();
			case CptDatasetLoadPackage.SORTING_PLAN_ROW__INPUTS:
				return getInputs();
			case CptDatasetLoadPackage.SORTING_PLAN_ROW__OUTPUTS:
				return getOutputs();
			case CptDatasetLoadPackage.SORTING_PLAN_ROW__DESCRIPTION:
				return getDescription();
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
			case CptDatasetLoadPackage.SORTING_PLAN_ROW__SORTING_PLAN_SK:
				setSortingPlanSk((BigDecimal)newValue);
				return;
			case CptDatasetLoadPackage.SORTING_PLAN_ROW__SORTING_PLAN_NAME:
				setSortingPlanName((String)newValue);
				return;
			case CptDatasetLoadPackage.SORTING_PLAN_ROW__SORTING_LEVEL_PLAGG_SK:
				setSortingLevelPLAGGSk((BigDecimal)newValue);
				return;
			case CptDatasetLoadPackage.SORTING_PLAN_ROW__INPUTS:
				getInputs().clear();
				getInputs().addAll((Collection<? extends SortingPlanInputRow>)newValue);
				return;
			case CptDatasetLoadPackage.SORTING_PLAN_ROW__OUTPUTS:
				getOutputs().clear();
				getOutputs().addAll((Collection<? extends SortingPlanOutputRow>)newValue);
				return;
			case CptDatasetLoadPackage.SORTING_PLAN_ROW__DESCRIPTION:
				setDescription((String)newValue);
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
			case CptDatasetLoadPackage.SORTING_PLAN_ROW__SORTING_PLAN_SK:
				setSortingPlanSk(SORTING_PLAN_SK_EDEFAULT);
				return;
			case CptDatasetLoadPackage.SORTING_PLAN_ROW__SORTING_PLAN_NAME:
				setSortingPlanName(SORTING_PLAN_NAME_EDEFAULT);
				return;
			case CptDatasetLoadPackage.SORTING_PLAN_ROW__SORTING_LEVEL_PLAGG_SK:
				setSortingLevelPLAGGSk(SORTING_LEVEL_PLAGG_SK_EDEFAULT);
				return;
			case CptDatasetLoadPackage.SORTING_PLAN_ROW__INPUTS:
				getInputs().clear();
				return;
			case CptDatasetLoadPackage.SORTING_PLAN_ROW__OUTPUTS:
				getOutputs().clear();
				return;
			case CptDatasetLoadPackage.SORTING_PLAN_ROW__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
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
			case CptDatasetLoadPackage.SORTING_PLAN_ROW__SORTING_PLAN_SK:
				return SORTING_PLAN_SK_EDEFAULT == null ? sortingPlanSk != null : !SORTING_PLAN_SK_EDEFAULT.equals(sortingPlanSk);
			case CptDatasetLoadPackage.SORTING_PLAN_ROW__SORTING_PLAN_NAME:
				return SORTING_PLAN_NAME_EDEFAULT == null ? sortingPlanName != null : !SORTING_PLAN_NAME_EDEFAULT.equals(sortingPlanName);
			case CptDatasetLoadPackage.SORTING_PLAN_ROW__SORTING_LEVEL_PLAGG_SK:
				return SORTING_LEVEL_PLAGG_SK_EDEFAULT == null ? sortingLevelPLAGGSk != null : !SORTING_LEVEL_PLAGG_SK_EDEFAULT.equals(sortingLevelPLAGGSk);
			case CptDatasetLoadPackage.SORTING_PLAN_ROW__INPUTS:
				return inputs != null && !inputs.isEmpty();
			case CptDatasetLoadPackage.SORTING_PLAN_ROW__OUTPUTS:
				return outputs != null && !outputs.isEmpty();
			case CptDatasetLoadPackage.SORTING_PLAN_ROW__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
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
		result.append(" (SortingPlanSk: ");
		result.append(sortingPlanSk);
		result.append(", SortingPlanName: ");
		result.append(sortingPlanName);
		result.append(", SortingLevelPLAGGSk: ");
		result.append(sortingLevelPLAGGSk);
		result.append(", Description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

	/* (non-Javadoc)
	 * @see com.misc.common.moplaf.datasetload.impl.TableRowImpl#refresh()
	 */
	@Override
	public void refresh() {
		super.refresh();
		// description 
		String desc = String.format("%s", this.getSortingPlanName());
		this.setDescription(desc);
	}
} //SortingPlanRowImpl
