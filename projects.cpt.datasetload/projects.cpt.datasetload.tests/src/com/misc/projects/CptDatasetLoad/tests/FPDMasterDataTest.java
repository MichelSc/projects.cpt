/**
 */
package com.misc.projects.CptDatasetLoad.tests;

import com.misc.projects.CptDatasetLoad.CptDatasetLoadFactory;
import com.misc.projects.CptDatasetLoad.FPDMasterData;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>FPD Master Data</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class FPDMasterDataTest extends FPDTableGroupTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(FPDMasterDataTest.class);
	}

	/**
	 * Constructs a new FPD Master Data test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FPDMasterDataTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this FPD Master Data test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected FPDMasterData getFixture() {
		return (FPDMasterData)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(CptDatasetLoadFactory.eINSTANCE.createFPDMasterData());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //FPDMasterDataTest
