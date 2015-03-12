/**
 */
package com.misc.projects.SortingPlans.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>SortingPlans</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class cptspTests extends TestSuite {

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
		TestSuite suite = new cptspTests("SortingPlans Tests");
		suite.addTestSuite(ScenariosTest.class);
		suite.addTestSuite(ScenarioTest.class);
		suite.addTestSuite(SortingPlanTest.class);
		suite.addTestSuite(EndProductTest.class);
		suite.addTestSuite(SortingPlanProductTest.class);
		suite.addTestSuite(SortingPlanEndProductTest.class);
		suite.addTestSuite(SortingPlanOutputTest.class);
		suite.addTestSuite(SortingPlanInputTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public cptspTests(String name) {
		super(name);
	}

} //cptspTests
