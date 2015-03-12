/**
 */
package com.misc.projects.CptDatasetLoad.tests;

import com.misc.projects.CptDatasetLoad.CptDatasetLoadFactory;
import com.misc.projects.CptDatasetLoad.SortingPlanRow;
import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Sorting Plan Row</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SortingPlanRowTest extends FPDSortingPanRowTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SortingPlanRowTest.class);
	}

	/**
	 * Constructs a new Sorting Plan Row test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SortingPlanRowTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Sorting Plan Row test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected SortingPlanRow getFixture() {
		return (SortingPlanRow)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(CptDatasetLoadFactory.eINSTANCE.createSortingPlanRow());
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

} //SortingPlanRowTest
