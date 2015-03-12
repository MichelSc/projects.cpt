/**
 * Generated with Acceleo
 */
package com.misc.projects.SortingPlans.parts;

/**
 * 
 * 
 */
public class SortingPlansViewsRepository {

	public static final int SWT_KIND = 0;

	public static final int FORM_KIND = 1;


	/**
	 * Scenarios view descriptor
	 * 
	 */
	public static class Scenarios {
		public static class Properties {
	
			
			public static String name = "SortingPlans::Scenarios::properties::Name";
			
	
		}
	
	}

	/**
	 * Scenario view descriptor
	 * 
	 */
	public static class Scenario {
		public static class Properties {
	
			
			public static String name = "SortingPlans::Scenario::properties::Name";
			
			
			public static String sortingLevelsWithDestination = "SortingPlans::Scenario::properties::SortingLevelsWithDestination";
			
			
			public static String selectedSortingPlans = "SortingPlans::Scenario::properties::SelectedSortingPlans";
			
	
		}
	
	}

	/**
	 * SortingPlan view descriptor
	 * 
	 */
	public static class SortingPlan {
		public static class Properties {
	
			
			public static String endProducts = "SortingPlans::SortingPlan::properties::EndProducts";
			
			
			public static String fPDSortingPlan = "SortingPlans::SortingPlan::properties::FPDSortingPlan";
			
			
			public static String scenario = "SortingPlans::SortingPlan::properties::Scenario";
			
	
		}
	
	}

	/**
	 * EndProduct view descriptor
	 * 
	 */
	public static class EndProduct {
		public static class Properties {
	
			
			public static String fPDSortingLevel = "SortingPlans::EndProduct::properties::FPDSortingLevel";
			
			
			public static String sortingPlanProduct = "SortingPlans::EndProduct::properties::SortingPlanProduct";
			
			
			public static String whichSortingPlans = "SortingPlans::EndProduct::properties::whichSortingPlans";
			
			
			public static String scenario = "SortingPlans::EndProduct::properties::Scenario";
			
	
		}
	
	}

	/**
	 * SortingPlanProduct view descriptor
	 * 
	 */
	public static class SortingPlanProduct {
		public static class Properties {
	
			
			public static String fPDSortingLevel = "SortingPlans::SortingPlanProduct::properties::FPDSortingLevel";
			
			
			public static String sortingPlansProducing = "SortingPlans::SortingPlanProduct::properties::SortingPlansProducing";
			
			
			public static String sortingPlansAccepting = "SortingPlans::SortingPlanProduct::properties::SortingPlansAccepting";
			
			
			public static String sortingLevelAVCSSk = "SortingPlans::SortingPlanProduct::properties::SortingLevelAVCSSk";
			
			
			public static String mechanizationLevelSk = "SortingPlans::SortingPlanProduct::properties::MechanizationLevelSk";
			
			
			public static String throughputTypeSk = "SortingPlans::SortingPlanProduct::properties::ThroughputTypeSk";
			
			
			public static String destinationSk = "SortingPlans::SortingPlanProduct::properties::DestinationSk";
			
			
			public static String endProduct = "SortingPlans::SortingPlanProduct::properties::EndProduct";
			
	
		}
	
	}

	/**
	 * SortingPlanEndProduct view descriptor
	 * 
	 */
	public static class SortingPlanEndProduct {
		public static class Properties {
	
			
			public static String output = "SortingPlans::SortingPlanEndProduct::properties::Output";
			
			
			public static String endProduct = "SortingPlans::SortingPlanEndProduct::properties::EndProduct";
			
			
			public static String sortingPlan = "SortingPlans::SortingPlanEndProduct::properties::SortingPlan";
			
	
		}
	
	}

	/**
	 * SortingPlanOutput view descriptor
	 * 
	 */
	public static class SortingPlanOutput {
		public static class Properties {
	
			
			public static String fPDSortingPlanOutput = "SortingPlans::SortingPlanOutput::properties::FPDSortingPlanOutput";
			
			
			public static String outputProduct = "SortingPlans::SortingPlanOutput::properties::OutputProduct";
			
			
			public static String sortingPlanEndProduct = "SortingPlans::SortingPlanOutput::properties::SortingPlanEndProduct";
			
			
			public static String sortingPlan = "SortingPlans::SortingPlanOutput::properties::SortingPlan";
			
	
		}
	
	}

	/**
	 * SortingPlanInput view descriptor
	 * 
	 */
	public static class SortingPlanInput {
		public static class Properties {
	
			
			public static String inputProduct = "SortingPlans::SortingPlanInput::properties::InputProduct";
			
			
			public static String fPDSortingPlanInput = "SortingPlans::SortingPlanInput::properties::FPDSortingPlanInput";
			
			
			public static String sortingPlan = "SortingPlans::SortingPlanInput::properties::SortingPlan";
			
	
		}
	
	}

}
