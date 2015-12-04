/**
 */
package com.misc.projects.SortingPlans;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see com.misc.projects.SortingPlans.cptspPackage
 * @generated
 */
public interface cptspFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	cptspFactory eINSTANCE = com.misc.projects.SortingPlans.impl.cptspFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Scenarios</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Scenarios</em>'.
	 * @generated
	 */
	Scenarios createScenarios();

	/**
	 * Returns a new object of class '<em>Scenario</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Scenario</em>'.
	 * @generated
	 */
	Scenario createScenario();

	/**
	 * Returns a new object of class '<em>Sorting Plan</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sorting Plan</em>'.
	 * @generated
	 */
	SortingPlan createSortingPlan();

	/**
	 * Returns a new object of class '<em>End Product</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>End Product</em>'.
	 * @generated
	 */
	EndProduct createEndProduct();

	/**
	 * Returns a new object of class '<em>Sorting Plan Product</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sorting Plan Product</em>'.
	 * @generated
	 */
	SortingPlanProduct createSortingPlanProduct();

	/**
	 * Returns a new object of class '<em>Sorting Plan Output</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sorting Plan Output</em>'.
	 * @generated
	 */
	SortingPlanOutput createSortingPlanOutput();

	/**
	 * Returns a new object of class '<em>Sorting Plan Input</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sorting Plan Input</em>'.
	 * @generated
	 */
	SortingPlanInput createSortingPlanInput();

	/**
	 * Returns a new object of class '<em>End Product Sorting Plan</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>End Product Sorting Plan</em>'.
	 * @generated
	 */
	EndProductSortingPlan createEndProductSortingPlan();

	/**
	 * Returns a new object of class '<em>End Product Sorting Plan Input</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>End Product Sorting Plan Input</em>'.
	 * @generated
	 */
	EndProductSortingPlanInput createEndProductSortingPlanInput();

	/**
	 * Returns a new object of class '<em>End Product Sorting Plan Output</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>End Product Sorting Plan Output</em>'.
	 * @generated
	 */
	EndProductSortingPlanOutput createEndProductSortingPlanOutput();

	/**
	 * Returns a new object of class '<em>End Product In Product</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>End Product In Product</em>'.
	 * @generated
	 */
	EndProductInProduct createEndProductInProduct();

	/**
	 * Returns a new object of class '<em>Sorting Path</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sorting Path</em>'.
	 * @generated
	 */
	SortingPath createSortingPath();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	cptspPackage getcptspPackage();

} //cptspFactory
