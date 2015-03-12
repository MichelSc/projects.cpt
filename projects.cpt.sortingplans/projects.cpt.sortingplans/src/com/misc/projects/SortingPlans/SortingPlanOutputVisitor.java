package com.misc.projects.SortingPlans;

import java.util.Set;

public interface SortingPlanOutputVisitor {
	 public void visit(SortingPlanOutput spout);
	 public class Util{
		 static public void visit(
				      SortingPlanOutputVisitor visitor,
				      Set<SortingPlanOutput> visitedSortingPlanOutputs,
				      SortingPlanOutput toVisit){
			 // visit the toVisit
			 visitedSortingPlanOutputs.add(toVisit);
			 visitor.visit(toVisit);
			 // and so further
			 SortingPlan sp = toVisit.getSortingPlan();
			 for ( SortingPlanInput spin : sp.getInputs()){
				 SortingPlanProduct spp = spin.getInputProduct();
				 for ( SortingPlanOutput spout : spp.getSortingPlansProducing()){
					 if ( !visitedSortingPlanOutputs.contains(spout)){
						 Util.visit(visitor, visitedSortingPlanOutputs, spout);
					 } // not yet visited
				 }  // traverse the outputs producing the intput product
			 }  // traverse the inputs accepting the output product
		 }  // method visit
		 static public void visit(Set<SortingPlanOutput> visitedSortingPlanOutputs,
			 						SortingPlanOutput toVisit){
			 SortingPlanOutputVisitor noOpVisitor = new SortingPlanOutputVisitor(){
				 @Override
				 public void visit(SortingPlanOutput spout) {
					 // do nothing
				 }
			 }; 
			 Util.visit(noOpVisitor, visitedSortingPlanOutputs, toVisit);
		 }
	 };  // class Util
}
