/**
 */
package com.misc.projects.CptDatasetLoad.impl;

import com.misc.common.moplaf.datasetload.impl.TableRowImpl;
import com.misc.projects.CptDatasetLoad.CptDatasetLoadPackage;
import com.misc.projects.CptDatasetLoad.SortingLevelRow;
import java.math.BigDecimal;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sorting Level Row</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.misc.projects.CptDatasetLoad.impl.SortingLevelRowImpl#getSortingLevelSk <em>Sorting Level Sk</em>}</li>
 *   <li>{@link com.misc.projects.CptDatasetLoad.impl.SortingLevelRowImpl#getSortingLevelName <em>Sorting Level Name</em>}</li>
 *   <li>{@link com.misc.projects.CptDatasetLoad.impl.SortingLevelRowImpl#getDescription <em>Description</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SortingLevelRowImpl extends TableRowImpl implements SortingLevelRow {
	/**
	 * The default value of the '{@link #getSortingLevelSk() <em>Sorting Level Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSortingLevelSk()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal SORTING_LEVEL_SK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSortingLevelSk() <em>Sorting Level Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSortingLevelSk()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal sortingLevelSk = SORTING_LEVEL_SK_EDEFAULT;

	/**
	 * The default value of the '{@link #getSortingLevelName() <em>Sorting Level Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSortingLevelName()
	 * @generated
	 * @ordered
	 */
	protected static final String SORTING_LEVEL_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSortingLevelName() <em>Sorting Level Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSortingLevelName()
	 * @generated
	 * @ordered
	 */
	protected String sortingLevelName = SORTING_LEVEL_NAME_EDEFAULT;

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
	protected SortingLevelRowImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CptDatasetLoadPackage.Literals.SORTING_LEVEL_ROW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal getSortingLevelSk() {
		return sortingLevelSk;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSortingLevelSk(BigDecimal newSortingLevelSk) {
		BigDecimal oldSortingLevelSk = sortingLevelSk;
		sortingLevelSk = newSortingLevelSk;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CptDatasetLoadPackage.SORTING_LEVEL_ROW__SORTING_LEVEL_SK, oldSortingLevelSk, sortingLevelSk));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSortingLevelName() {
		return sortingLevelName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSortingLevelName(String newSortingLevelName) {
		String oldSortingLevelName = sortingLevelName;
		sortingLevelName = newSortingLevelName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CptDatasetLoadPackage.SORTING_LEVEL_ROW__SORTING_LEVEL_NAME, oldSortingLevelName, sortingLevelName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CptDatasetLoadPackage.SORTING_LEVEL_ROW__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CptDatasetLoadPackage.SORTING_LEVEL_ROW__SORTING_LEVEL_SK:
				return getSortingLevelSk();
			case CptDatasetLoadPackage.SORTING_LEVEL_ROW__SORTING_LEVEL_NAME:
				return getSortingLevelName();
			case CptDatasetLoadPackage.SORTING_LEVEL_ROW__DESCRIPTION:
				return getDescription();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CptDatasetLoadPackage.SORTING_LEVEL_ROW__SORTING_LEVEL_SK:
				setSortingLevelSk((BigDecimal)newValue);
				return;
			case CptDatasetLoadPackage.SORTING_LEVEL_ROW__SORTING_LEVEL_NAME:
				setSortingLevelName((String)newValue);
				return;
			case CptDatasetLoadPackage.SORTING_LEVEL_ROW__DESCRIPTION:
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
			case CptDatasetLoadPackage.SORTING_LEVEL_ROW__SORTING_LEVEL_SK:
				setSortingLevelSk(SORTING_LEVEL_SK_EDEFAULT);
				return;
			case CptDatasetLoadPackage.SORTING_LEVEL_ROW__SORTING_LEVEL_NAME:
				setSortingLevelName(SORTING_LEVEL_NAME_EDEFAULT);
				return;
			case CptDatasetLoadPackage.SORTING_LEVEL_ROW__DESCRIPTION:
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
			case CptDatasetLoadPackage.SORTING_LEVEL_ROW__SORTING_LEVEL_SK:
				return SORTING_LEVEL_SK_EDEFAULT == null ? sortingLevelSk != null : !SORTING_LEVEL_SK_EDEFAULT.equals(sortingLevelSk);
			case CptDatasetLoadPackage.SORTING_LEVEL_ROW__SORTING_LEVEL_NAME:
				return SORTING_LEVEL_NAME_EDEFAULT == null ? sortingLevelName != null : !SORTING_LEVEL_NAME_EDEFAULT.equals(sortingLevelName);
			case CptDatasetLoadPackage.SORTING_LEVEL_ROW__DESCRIPTION:
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
		result.append(" (SortingLevelSk: ");
		result.append(sortingLevelSk);
		result.append(", SortingLevelName: ");
		result.append(sortingLevelName);
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
		String desc = String.format("%s:%d", this.getSortingLevelName(), this.getSortingLevelSk().intValue());
		this.setDescription(desc);
	}
	
	

} //SortingLevelRowImpl
