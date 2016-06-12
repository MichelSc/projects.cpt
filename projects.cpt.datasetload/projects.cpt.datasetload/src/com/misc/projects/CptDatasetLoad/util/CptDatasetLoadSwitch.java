/**
 */
package com.misc.projects.CptDatasetLoad.util;

import com.misc.common.moplaf.dbsynch.DataSource;
import com.misc.common.moplaf.dbsynch.DataSourceJdbc;
import com.misc.common.moplaf.dbsynch.DbSynchUnit;
import com.misc.common.moplaf.dbsynch.DbSynchUnitAbstract;
import com.misc.common.moplaf.dbsynch.Table;
import com.misc.common.moplaf.dbsynch.TableRow;
import com.misc.common.moplaf.dbsynch.dbsynchora.DataSourceJdbcOraThin;
import com.misc.projects.CptDatasetLoad.*;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see com.misc.projects.CptDatasetLoad.CptDatasetLoadPackage
 * @generated
 */
public class CptDatasetLoadSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CptDatasetLoadPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CptDatasetLoadSwitch() {
		if (modelPackage == null) {
			modelPackage = CptDatasetLoadPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case CptDatasetLoadPackage.FPD: {
				FPD fpd = (FPD)theEObject;
				T result = caseFPD(fpd);
				if (result == null) result = caseDataSourceJdbcOraThin(fpd);
				if (result == null) result = caseDataSourceJdbc(fpd);
				if (result == null) result = caseDataSource(fpd);
				if (result == null) result = caseDbSynchUnitAbstract(fpd);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CptDatasetLoadPackage.FPD_TABLE_GROUP: {
				FPDTableGroup fpdTableGroup = (FPDTableGroup)theEObject;
				T result = caseFPDTableGroup(fpdTableGroup);
				if (result == null) result = caseDbSynchUnit(fpdTableGroup);
				if (result == null) result = caseDbSynchUnitAbstract(fpdTableGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CptDatasetLoadPackage.FPD_MASTER_DATA: {
				FPDMasterData fpdMasterData = (FPDMasterData)theEObject;
				T result = caseFPDMasterData(fpdMasterData);
				if (result == null) result = caseFPDTableGroup(fpdMasterData);
				if (result == null) result = caseDbSynchUnit(fpdMasterData);
				if (result == null) result = caseDbSynchUnitAbstract(fpdMasterData);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CptDatasetLoadPackage.FPD_SORTING_PLANS_SET: {
				FPDSortingPlansSet fpdSortingPlansSet = (FPDSortingPlansSet)theEObject;
				T result = caseFPDSortingPlansSet(fpdSortingPlansSet);
				if (result == null) result = caseFPDTableGroup(fpdSortingPlansSet);
				if (result == null) result = caseDbSynchUnit(fpdSortingPlansSet);
				if (result == null) result = caseDbSynchUnitAbstract(fpdSortingPlansSet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CptDatasetLoadPackage.FPD_SORTING_PAN_ROW: {
				FPDSortingPanRow fpdSortingPanRow = (FPDSortingPanRow)theEObject;
				T result = caseFPDSortingPanRow(fpdSortingPanRow);
				if (result == null) result = caseTableRow(fpdSortingPanRow);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CptDatasetLoadPackage.FPD_SORTING_PLAN_TABLE: {
				FPDSortingPlanTable fpdSortingPlanTable = (FPDSortingPlanTable)theEObject;
				T result = caseFPDSortingPlanTable(fpdSortingPlanTable);
				if (result == null) result = caseTable(fpdSortingPlanTable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CptDatasetLoadPackage.MASTER_DATA_TABLE: {
				MasterDataTable masterDataTable = (MasterDataTable)theEObject;
				T result = caseMasterDataTable(masterDataTable);
				if (result == null) result = caseTable(masterDataTable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CptDatasetLoadPackage.SORTING_LEVELS_TABLE: {
				SortingLevelsTable sortingLevelsTable = (SortingLevelsTable)theEObject;
				T result = caseSortingLevelsTable(sortingLevelsTable);
				if (result == null) result = caseMasterDataTable(sortingLevelsTable);
				if (result == null) result = caseTable(sortingLevelsTable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CptDatasetLoadPackage.SORTING_PLANS_TABLE: {
				SortingPlansTable sortingPlansTable = (SortingPlansTable)theEObject;
				T result = caseSortingPlansTable(sortingPlansTable);
				if (result == null) result = caseFPDSortingPlanTable(sortingPlansTable);
				if (result == null) result = caseTable(sortingPlansTable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CptDatasetLoadPackage.SORTING_PLAN_INPUT_TABLE: {
				SortingPlanInputTable sortingPlanInputTable = (SortingPlanInputTable)theEObject;
				T result = caseSortingPlanInputTable(sortingPlanInputTable);
				if (result == null) result = caseFPDSortingPlanTable(sortingPlanInputTable);
				if (result == null) result = caseTable(sortingPlanInputTable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CptDatasetLoadPackage.SORTING_PLAN_OUTPUT_TABLE: {
				SortingPlanOutputTable sortingPlanOutputTable = (SortingPlanOutputTable)theEObject;
				T result = caseSortingPlanOutputTable(sortingPlanOutputTable);
				if (result == null) result = caseFPDSortingPlanTable(sortingPlanOutputTable);
				if (result == null) result = caseTable(sortingPlanOutputTable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CptDatasetLoadPackage.SORTING_LEVEL_ROW: {
				SortingLevelRow sortingLevelRow = (SortingLevelRow)theEObject;
				T result = caseSortingLevelRow(sortingLevelRow);
				if (result == null) result = caseTableRow(sortingLevelRow);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CptDatasetLoadPackage.SORTING_PLAN_ROW: {
				SortingPlanRow sortingPlanRow = (SortingPlanRow)theEObject;
				T result = caseSortingPlanRow(sortingPlanRow);
				if (result == null) result = caseFPDSortingPanRow(sortingPlanRow);
				if (result == null) result = caseTableRow(sortingPlanRow);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CptDatasetLoadPackage.SORTING_PLAN_OUTPUT_ROW: {
				SortingPlanOutputRow sortingPlanOutputRow = (SortingPlanOutputRow)theEObject;
				T result = caseSortingPlanOutputRow(sortingPlanOutputRow);
				if (result == null) result = caseFPDSortingPanRow(sortingPlanOutputRow);
				if (result == null) result = caseTableRow(sortingPlanOutputRow);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CptDatasetLoadPackage.SORTING_PLAN_INPUT_ROW: {
				SortingPlanInputRow sortingPlanInputRow = (SortingPlanInputRow)theEObject;
				T result = caseSortingPlanInputRow(sortingPlanInputRow);
				if (result == null) result = caseFPDSortingPanRow(sortingPlanInputRow);
				if (result == null) result = caseTableRow(sortingPlanInputRow);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CptDatasetLoadPackage.FPO: {
				FPO fpo = (FPO)theEObject;
				T result = caseFPO(fpo);
				if (result == null) result = caseDataSourceJdbcOraThin(fpo);
				if (result == null) result = caseDataSourceJdbc(fpo);
				if (result == null) result = caseDataSource(fpo);
				if (result == null) result = caseDbSynchUnitAbstract(fpo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CptDatasetLoadPackage.FPO_FORECAST_UPLOAD: {
				FPOForecastUpload fpoForecastUpload = (FPOForecastUpload)theEObject;
				T result = caseFPOForecastUpload(fpoForecastUpload);
				if (result == null) result = caseTableRow(fpoForecastUpload);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CptDatasetLoadPackage.FPO_FORECAST_BUCKET: {
				FPOForecastBucket fpoForecastBucket = (FPOForecastBucket)theEObject;
				T result = caseFPOForecastBucket(fpoForecastBucket);
				if (result == null) result = caseTableRow(fpoForecastBucket);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CptDatasetLoadPackage.FPO_FORECAST_BUCKETS: {
				FPOForecastBuckets fpoForecastBuckets = (FPOForecastBuckets)theEObject;
				T result = caseFPOForecastBuckets(fpoForecastBuckets);
				if (result == null) result = caseTable(fpoForecastBuckets);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>FPD</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>FPD</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFPD(FPD object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>FPD Sorting Plans Set</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>FPD Sorting Plans Set</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFPDSortingPlansSet(FPDSortingPlansSet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sorting Plans Table</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sorting Plans Table</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSortingPlansTable(SortingPlansTable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sorting Plan Input Table</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sorting Plan Input Table</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSortingPlanInputTable(SortingPlanInputTable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sorting Plan Row</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sorting Plan Row</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSortingPlanRow(SortingPlanRow object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sorting Plan Output Table</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sorting Plan Output Table</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSortingPlanOutputTable(SortingPlanOutputTable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sorting Plan Output Row</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sorting Plan Output Row</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSortingPlanOutputRow(SortingPlanOutputRow object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sorting Plan Input Row</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sorting Plan Input Row</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSortingPlanInputRow(SortingPlanInputRow object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>FPO</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>FPO</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFPO(FPO object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>FPO Forecast Upload</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>FPO Forecast Upload</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFPOForecastUpload(FPOForecastUpload object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>FPO Forecast Bucket</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>FPO Forecast Bucket</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFPOForecastBucket(FPOForecastBucket object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>FPO Forecast Buckets</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>FPO Forecast Buckets</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFPOForecastBuckets(FPOForecastBuckets object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unit Abstract</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unit Abstract</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDbSynchUnitAbstract(DbSynchUnitAbstract object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Source</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Source</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataSource(DataSource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Source Jdbc</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Source Jdbc</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataSourceJdbc(DataSourceJdbc object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Source Jdbc Ora Thin</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Source Jdbc Ora Thin</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataSourceJdbcOraThin(DataSourceJdbcOraThin object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDbSynchUnit(DbSynchUnit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Table Row</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Table Row</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTableRow(TableRow object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Table</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Table</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTable(Table object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sorting Levels Table</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sorting Levels Table</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSortingLevelsTable(SortingLevelsTable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sorting Level Row</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sorting Level Row</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSortingLevelRow(SortingLevelRow object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>FPD Sorting Plan Table</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>FPD Sorting Plan Table</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFPDSortingPlanTable(FPDSortingPlanTable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>FPD Sorting Pan Row</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>FPD Sorting Pan Row</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFPDSortingPanRow(FPDSortingPanRow object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>FPD Master Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>FPD Master Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFPDMasterData(FPDMasterData object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Master Data Table</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Master Data Table</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMasterDataTable(MasterDataTable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>FPD Table Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>FPD Table Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFPDTableGroup(FPDTableGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //CptDatasetLoadSwitch
