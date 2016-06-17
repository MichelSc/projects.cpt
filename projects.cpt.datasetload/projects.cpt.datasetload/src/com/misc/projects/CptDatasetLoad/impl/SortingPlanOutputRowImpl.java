/**
 */
package com.misc.projects.CptDatasetLoad.impl;

import com.misc.projects.CptDatasetLoad.CptDatasetLoadPackage;
import com.misc.projects.CptDatasetLoad.SortingLevelRow;
import com.misc.projects.CptDatasetLoad.SortingPlanOutputRow;
import com.misc.projects.CptDatasetLoad.SortingPlanRow;
import java.math.BigDecimal;
import java.util.Date;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sorting Plan Output Row</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.projects.CptDatasetLoad.impl.SortingPlanOutputRowImpl#getSortingPlanSk <em>Sorting Plan Sk</em>}</li>
 *   <li>{@link com.misc.projects.CptDatasetLoad.impl.SortingPlanOutputRowImpl#getSortingLevelAVCSSk <em>Sorting Level AVCS Sk</em>}</li>
 *   <li>{@link com.misc.projects.CptDatasetLoad.impl.SortingPlanOutputRowImpl#getMechanizationLevelSk <em>Mechanization Level Sk</em>}</li>
 *   <li>{@link com.misc.projects.CptDatasetLoad.impl.SortingPlanOutputRowImpl#getThroughputTypeSk <em>Throughput Type Sk</em>}</li>
 *   <li>{@link com.misc.projects.CptDatasetLoad.impl.SortingPlanOutputRowImpl#getDestinationSk <em>Destination Sk</em>}</li>
 *   <li>{@link com.misc.projects.CptDatasetLoad.impl.SortingPlanOutputRowImpl#getSortingPlan <em>Sorting Plan</em>}</li>
 *   <li>{@link com.misc.projects.CptDatasetLoad.impl.SortingPlanOutputRowImpl#getSortingLevel <em>Sorting Level</em>}</li>
 *   <li>{@link com.misc.projects.CptDatasetLoad.impl.SortingPlanOutputRowImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link com.misc.projects.CptDatasetLoad.impl.SortingPlanOutputRowImpl#getValidFromDate <em>Valid From Date</em>}</li>
 *   <li>{@link com.misc.projects.CptDatasetLoad.impl.SortingPlanOutputRowImpl#getValidToDate <em>Valid To Date</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SortingPlanOutputRowImpl extends FPDSortingPanRowImpl implements SortingPlanOutputRow {
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
	 * The default value of the '{@link #getSortingLevelAVCSSk() <em>Sorting Level AVCS Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSortingLevelAVCSSk()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal SORTING_LEVEL_AVCS_SK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSortingLevelAVCSSk() <em>Sorting Level AVCS Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSortingLevelAVCSSk()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal sortingLevelAVCSSk = SORTING_LEVEL_AVCS_SK_EDEFAULT;

	/**
	 * The default value of the '{@link #getMechanizationLevelSk() <em>Mechanization Level Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMechanizationLevelSk()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal MECHANIZATION_LEVEL_SK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMechanizationLevelSk() <em>Mechanization Level Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMechanizationLevelSk()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal mechanizationLevelSk = MECHANIZATION_LEVEL_SK_EDEFAULT;

	/**
	 * The default value of the '{@link #getThroughputTypeSk() <em>Throughput Type Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThroughputTypeSk()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal THROUGHPUT_TYPE_SK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getThroughputTypeSk() <em>Throughput Type Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThroughputTypeSk()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal throughputTypeSk = THROUGHPUT_TYPE_SK_EDEFAULT;

	/**
	 * The default value of the '{@link #getDestinationSk() <em>Destination Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestinationSk()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal DESTINATION_SK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDestinationSk() <em>Destination Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestinationSk()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal destinationSk = DESTINATION_SK_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSortingPlan() <em>Sorting Plan</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSortingPlan()
	 * @generated
	 * @ordered
	 */
	protected SortingPlanRow sortingPlan;

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
	 * The default value of the '{@link #getValidFromDate() <em>Valid From Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidFromDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date VALID_FROM_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValidFromDate() <em>Valid From Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidFromDate()
	 * @generated
	 * @ordered
	 */
	protected Date validFromDate = VALID_FROM_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getValidToDate() <em>Valid To Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidToDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date VALID_TO_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValidToDate() <em>Valid To Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidToDate()
	 * @generated
	 * @ordered
	 */
	protected Date validToDate = VALID_TO_DATE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SortingPlanOutputRowImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CptDatasetLoadPackage.Literals.SORTING_PLAN_OUTPUT_ROW;
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
			eNotify(new ENotificationImpl(this, Notification.SET, CptDatasetLoadPackage.SORTING_PLAN_OUTPUT_ROW__SORTING_PLAN_SK, oldSortingPlanSk, sortingPlanSk));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal getSortingLevelAVCSSk() {
		return sortingLevelAVCSSk;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSortingLevelAVCSSk(BigDecimal newSortingLevelAVCSSk) {
		BigDecimal oldSortingLevelAVCSSk = sortingLevelAVCSSk;
		sortingLevelAVCSSk = newSortingLevelAVCSSk;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CptDatasetLoadPackage.SORTING_PLAN_OUTPUT_ROW__SORTING_LEVEL_AVCS_SK, oldSortingLevelAVCSSk, sortingLevelAVCSSk));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal getMechanizationLevelSk() {
		return mechanizationLevelSk;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMechanizationLevelSk(BigDecimal newMechanizationLevelSk) {
		BigDecimal oldMechanizationLevelSk = mechanizationLevelSk;
		mechanizationLevelSk = newMechanizationLevelSk;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CptDatasetLoadPackage.SORTING_PLAN_OUTPUT_ROW__MECHANIZATION_LEVEL_SK, oldMechanizationLevelSk, mechanizationLevelSk));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal getThroughputTypeSk() {
		return throughputTypeSk;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThroughputTypeSk(BigDecimal newThroughputTypeSk) {
		BigDecimal oldThroughputTypeSk = throughputTypeSk;
		throughputTypeSk = newThroughputTypeSk;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CptDatasetLoadPackage.SORTING_PLAN_OUTPUT_ROW__THROUGHPUT_TYPE_SK, oldThroughputTypeSk, throughputTypeSk));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal getDestinationSk() {
		return destinationSk;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDestinationSk(BigDecimal newDestinationSk) {
		BigDecimal oldDestinationSk = destinationSk;
		destinationSk = newDestinationSk;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CptDatasetLoadPackage.SORTING_PLAN_OUTPUT_ROW__DESTINATION_SK, oldDestinationSk, destinationSk));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SortingPlanRow getSortingPlan() {
		if (sortingPlan != null && sortingPlan.eIsProxy()) {
			InternalEObject oldSortingPlan = (InternalEObject)sortingPlan;
			sortingPlan = (SortingPlanRow)eResolveProxy(oldSortingPlan);
			if (sortingPlan != oldSortingPlan) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CptDatasetLoadPackage.SORTING_PLAN_OUTPUT_ROW__SORTING_PLAN, oldSortingPlan, sortingPlan));
			}
		}
		return sortingPlan;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SortingPlanRow basicGetSortingPlan() {
		return sortingPlan;
	}

	/* (non-Javadoc)
	 * @see com.misc.common.moplaf.datasetload.impl.TableRowImpl#refresh()
	 */
	@Override
	public void refresh() {
		super.refresh();
		// sorting plan row
		SortingPlanRow  row = this.getFPDSortingPlanTable().getFPDSortingPlansSet().getSortingPlansTable().getRow(this.getSortingPlanSk());
		this.setSortingPlan(row);
		// description 
		SortingLevelRow sl = this.getSortingLevel();
		String desc = String.format("%d/%d/%s/%d", 
					                this.getThroughputTypeSk().intValue(),
				                    this.getMechanizationLevelSk().intValue(),
									sl==null?"null":sl.getDescription(),
					                this.getDestinationSk().intValue());
		this.setDescription(desc);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSortingPlan(SortingPlanRow newSortingPlan, NotificationChain msgs) {
		SortingPlanRow oldSortingPlan = sortingPlan;
		sortingPlan = newSortingPlan;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CptDatasetLoadPackage.SORTING_PLAN_OUTPUT_ROW__SORTING_PLAN, oldSortingPlan, newSortingPlan);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSortingPlan(SortingPlanRow newSortingPlan) {
		if (newSortingPlan != sortingPlan) {
			NotificationChain msgs = null;
			if (sortingPlan != null)
				msgs = ((InternalEObject)sortingPlan).eInverseRemove(this, CptDatasetLoadPackage.SORTING_PLAN_ROW__OUTPUTS, SortingPlanRow.class, msgs);
			if (newSortingPlan != null)
				msgs = ((InternalEObject)newSortingPlan).eInverseAdd(this, CptDatasetLoadPackage.SORTING_PLAN_ROW__OUTPUTS, SortingPlanRow.class, msgs);
			msgs = basicSetSortingPlan(newSortingPlan, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CptDatasetLoadPackage.SORTING_PLAN_OUTPUT_ROW__SORTING_PLAN, newSortingPlan, newSortingPlan));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SortingLevelRow getSortingLevel() {
		SortingLevelRow sortingLevel = basicGetSortingLevel();
		return sortingLevel != null && sortingLevel.eIsProxy() ? (SortingLevelRow)eResolveProxy((InternalEObject)sortingLevel) : sortingLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public SortingLevelRow basicGetSortingLevel() {
		return this.getFPDSortingPlanTable().getFPDSortingPlansSet().getFPD().getMasterData().getSortingLevelTable().getRow(this.getSortingLevelAVCSSk());
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
			eNotify(new ENotificationImpl(this, Notification.SET, CptDatasetLoadPackage.SORTING_PLAN_OUTPUT_ROW__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getValidFromDate() {
		return validFromDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValidFromDate(Date newValidFromDate) {
		Date oldValidFromDate = validFromDate;
		validFromDate = newValidFromDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CptDatasetLoadPackage.SORTING_PLAN_OUTPUT_ROW__VALID_FROM_DATE, oldValidFromDate, validFromDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getValidToDate() {
		return validToDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValidToDate(Date newValidToDate) {
		Date oldValidToDate = validToDate;
		validToDate = newValidToDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CptDatasetLoadPackage.SORTING_PLAN_OUTPUT_ROW__VALID_TO_DATE, oldValidToDate, validToDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CptDatasetLoadPackage.SORTING_PLAN_OUTPUT_ROW__SORTING_PLAN:
				if (sortingPlan != null)
					msgs = ((InternalEObject)sortingPlan).eInverseRemove(this, CptDatasetLoadPackage.SORTING_PLAN_ROW__OUTPUTS, SortingPlanRow.class, msgs);
				return basicSetSortingPlan((SortingPlanRow)otherEnd, msgs);
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
			case CptDatasetLoadPackage.SORTING_PLAN_OUTPUT_ROW__SORTING_PLAN:
				return basicSetSortingPlan(null, msgs);
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
			case CptDatasetLoadPackage.SORTING_PLAN_OUTPUT_ROW__SORTING_PLAN_SK:
				return getSortingPlanSk();
			case CptDatasetLoadPackage.SORTING_PLAN_OUTPUT_ROW__SORTING_LEVEL_AVCS_SK:
				return getSortingLevelAVCSSk();
			case CptDatasetLoadPackage.SORTING_PLAN_OUTPUT_ROW__MECHANIZATION_LEVEL_SK:
				return getMechanizationLevelSk();
			case CptDatasetLoadPackage.SORTING_PLAN_OUTPUT_ROW__THROUGHPUT_TYPE_SK:
				return getThroughputTypeSk();
			case CptDatasetLoadPackage.SORTING_PLAN_OUTPUT_ROW__DESTINATION_SK:
				return getDestinationSk();
			case CptDatasetLoadPackage.SORTING_PLAN_OUTPUT_ROW__SORTING_PLAN:
				if (resolve) return getSortingPlan();
				return basicGetSortingPlan();
			case CptDatasetLoadPackage.SORTING_PLAN_OUTPUT_ROW__SORTING_LEVEL:
				if (resolve) return getSortingLevel();
				return basicGetSortingLevel();
			case CptDatasetLoadPackage.SORTING_PLAN_OUTPUT_ROW__DESCRIPTION:
				return getDescription();
			case CptDatasetLoadPackage.SORTING_PLAN_OUTPUT_ROW__VALID_FROM_DATE:
				return getValidFromDate();
			case CptDatasetLoadPackage.SORTING_PLAN_OUTPUT_ROW__VALID_TO_DATE:
				return getValidToDate();
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
			case CptDatasetLoadPackage.SORTING_PLAN_OUTPUT_ROW__SORTING_PLAN_SK:
				setSortingPlanSk((BigDecimal)newValue);
				return;
			case CptDatasetLoadPackage.SORTING_PLAN_OUTPUT_ROW__SORTING_LEVEL_AVCS_SK:
				setSortingLevelAVCSSk((BigDecimal)newValue);
				return;
			case CptDatasetLoadPackage.SORTING_PLAN_OUTPUT_ROW__MECHANIZATION_LEVEL_SK:
				setMechanizationLevelSk((BigDecimal)newValue);
				return;
			case CptDatasetLoadPackage.SORTING_PLAN_OUTPUT_ROW__THROUGHPUT_TYPE_SK:
				setThroughputTypeSk((BigDecimal)newValue);
				return;
			case CptDatasetLoadPackage.SORTING_PLAN_OUTPUT_ROW__DESTINATION_SK:
				setDestinationSk((BigDecimal)newValue);
				return;
			case CptDatasetLoadPackage.SORTING_PLAN_OUTPUT_ROW__SORTING_PLAN:
				setSortingPlan((SortingPlanRow)newValue);
				return;
			case CptDatasetLoadPackage.SORTING_PLAN_OUTPUT_ROW__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case CptDatasetLoadPackage.SORTING_PLAN_OUTPUT_ROW__VALID_FROM_DATE:
				setValidFromDate((Date)newValue);
				return;
			case CptDatasetLoadPackage.SORTING_PLAN_OUTPUT_ROW__VALID_TO_DATE:
				setValidToDate((Date)newValue);
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
			case CptDatasetLoadPackage.SORTING_PLAN_OUTPUT_ROW__SORTING_PLAN_SK:
				setSortingPlanSk(SORTING_PLAN_SK_EDEFAULT);
				return;
			case CptDatasetLoadPackage.SORTING_PLAN_OUTPUT_ROW__SORTING_LEVEL_AVCS_SK:
				setSortingLevelAVCSSk(SORTING_LEVEL_AVCS_SK_EDEFAULT);
				return;
			case CptDatasetLoadPackage.SORTING_PLAN_OUTPUT_ROW__MECHANIZATION_LEVEL_SK:
				setMechanizationLevelSk(MECHANIZATION_LEVEL_SK_EDEFAULT);
				return;
			case CptDatasetLoadPackage.SORTING_PLAN_OUTPUT_ROW__THROUGHPUT_TYPE_SK:
				setThroughputTypeSk(THROUGHPUT_TYPE_SK_EDEFAULT);
				return;
			case CptDatasetLoadPackage.SORTING_PLAN_OUTPUT_ROW__DESTINATION_SK:
				setDestinationSk(DESTINATION_SK_EDEFAULT);
				return;
			case CptDatasetLoadPackage.SORTING_PLAN_OUTPUT_ROW__SORTING_PLAN:
				setSortingPlan((SortingPlanRow)null);
				return;
			case CptDatasetLoadPackage.SORTING_PLAN_OUTPUT_ROW__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case CptDatasetLoadPackage.SORTING_PLAN_OUTPUT_ROW__VALID_FROM_DATE:
				setValidFromDate(VALID_FROM_DATE_EDEFAULT);
				return;
			case CptDatasetLoadPackage.SORTING_PLAN_OUTPUT_ROW__VALID_TO_DATE:
				setValidToDate(VALID_TO_DATE_EDEFAULT);
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
			case CptDatasetLoadPackage.SORTING_PLAN_OUTPUT_ROW__SORTING_PLAN_SK:
				return SORTING_PLAN_SK_EDEFAULT == null ? sortingPlanSk != null : !SORTING_PLAN_SK_EDEFAULT.equals(sortingPlanSk);
			case CptDatasetLoadPackage.SORTING_PLAN_OUTPUT_ROW__SORTING_LEVEL_AVCS_SK:
				return SORTING_LEVEL_AVCS_SK_EDEFAULT == null ? sortingLevelAVCSSk != null : !SORTING_LEVEL_AVCS_SK_EDEFAULT.equals(sortingLevelAVCSSk);
			case CptDatasetLoadPackage.SORTING_PLAN_OUTPUT_ROW__MECHANIZATION_LEVEL_SK:
				return MECHANIZATION_LEVEL_SK_EDEFAULT == null ? mechanizationLevelSk != null : !MECHANIZATION_LEVEL_SK_EDEFAULT.equals(mechanizationLevelSk);
			case CptDatasetLoadPackage.SORTING_PLAN_OUTPUT_ROW__THROUGHPUT_TYPE_SK:
				return THROUGHPUT_TYPE_SK_EDEFAULT == null ? throughputTypeSk != null : !THROUGHPUT_TYPE_SK_EDEFAULT.equals(throughputTypeSk);
			case CptDatasetLoadPackage.SORTING_PLAN_OUTPUT_ROW__DESTINATION_SK:
				return DESTINATION_SK_EDEFAULT == null ? destinationSk != null : !DESTINATION_SK_EDEFAULT.equals(destinationSk);
			case CptDatasetLoadPackage.SORTING_PLAN_OUTPUT_ROW__SORTING_PLAN:
				return sortingPlan != null;
			case CptDatasetLoadPackage.SORTING_PLAN_OUTPUT_ROW__SORTING_LEVEL:
				return basicGetSortingLevel() != null;
			case CptDatasetLoadPackage.SORTING_PLAN_OUTPUT_ROW__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case CptDatasetLoadPackage.SORTING_PLAN_OUTPUT_ROW__VALID_FROM_DATE:
				return VALID_FROM_DATE_EDEFAULT == null ? validFromDate != null : !VALID_FROM_DATE_EDEFAULT.equals(validFromDate);
			case CptDatasetLoadPackage.SORTING_PLAN_OUTPUT_ROW__VALID_TO_DATE:
				return VALID_TO_DATE_EDEFAULT == null ? validToDate != null : !VALID_TO_DATE_EDEFAULT.equals(validToDate);
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
		result.append(", SortingLevelAVCSSk: ");
		result.append(sortingLevelAVCSSk);
		result.append(", MechanizationLevelSk: ");
		result.append(mechanizationLevelSk);
		result.append(", ThroughputTypeSk: ");
		result.append(throughputTypeSk);
		result.append(", DestinationSk: ");
		result.append(destinationSk);
		result.append(", Description: ");
		result.append(description);
		result.append(", ValidFromDate: ");
		result.append(validFromDate);
		result.append(", ValidToDate: ");
		result.append(validToDate);
		result.append(')');
		return result.toString();
	}

} //SortingPlanOutputRowImpl
