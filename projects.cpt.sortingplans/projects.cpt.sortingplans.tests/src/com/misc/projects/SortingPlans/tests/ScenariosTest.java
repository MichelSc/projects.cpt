/**
 */
package com.misc.projects.SortingPlans.tests;

import com.misc.projects.SortingPlans.Scenarios;
import com.misc.projects.SortingPlans.cptspFactory;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Scenarios</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ScenariosTest extends TestCase {

	/**
	 * The fixture for this Scenarios test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Scenarios fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ScenariosTest.class);
	}

	/**
	 * Constructs a new Scenarios test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScenariosTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Scenarios test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Scenarios fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Scenarios test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Scenarios getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(cptspFactory.eINSTANCE.createScenarios());
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

} //ScenariosTest
