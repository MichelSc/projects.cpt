/**
 */
package com.misc.projects.Forecast.tests;

import com.misc.projects.Forecast.ForecastFactory;
import com.misc.projects.Forecast.SourceBucket;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Source Bucket</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SourceBucketTest extends TestCase {

	/**
	 * The fixture for this Source Bucket test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SourceBucket fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SourceBucketTest.class);
	}

	/**
	 * Constructs a new Source Bucket test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SourceBucketTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Source Bucket test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(SourceBucket fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Source Bucket test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SourceBucket getFixture() {
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
		setFixture(ForecastFactory.eINSTANCE.createSourceBucket());
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

} //SourceBucketTest
