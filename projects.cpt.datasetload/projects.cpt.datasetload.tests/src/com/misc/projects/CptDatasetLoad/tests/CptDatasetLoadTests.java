/**
 */
package com.misc.projects.CptDatasetLoad.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>CptDatasetLoad</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class CptDatasetLoadTests extends TestSuite {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(suite());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Test suite() {
		TestSuite suite = new CptDatasetLoadTests("CptDatasetLoad Tests");
		suite.addTestSuite(FPDTest.class);
		suite.addTestSuite(FPDTableGroupTest.class);
		suite.addTestSuite(FPDMasterDataTest.class);
		suite.addTestSuite(FPDSortingPlansSetTest.class);
		suite.addTestSuite(FPDSortingPanRowTest.class);
		suite.addTestSuite(FPDSortingPlanTableTest.class);
		suite.addTestSuite(MasterDataTableTest.class);
		suite.addTestSuite(SortingLevelsTableTest.class);
		suite.addTestSuite(SortingPlansTableTest.class);
		suite.addTestSuite(SortingPlanInputTableTest.class);
		suite.addTestSuite(SortingPlanOutputTableTest.class);
		suite.addTestSuite(SortingLevelRowTest.class);
		suite.addTestSuite(SortingPlanRowTest.class);
		suite.addTestSuite(SortingPlanOutputRowTest.class);
		suite.addTestSuite(SortingPlanInputRowTest.class);
		suite.addTestSuite(FPOTest.class);
		suite.addTestSuite(FPOForecastUploadTest.class);
		suite.addTestSuite(FPOForecastBucketTest.class);
		suite.addTestSuite(FPOForecastBucketsTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CptDatasetLoadTests(String name) {
		super(name);
	}

} //CptDatasetLoadTests
