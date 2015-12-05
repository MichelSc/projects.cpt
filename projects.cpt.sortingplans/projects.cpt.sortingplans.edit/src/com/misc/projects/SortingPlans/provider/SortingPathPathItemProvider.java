package com.misc.projects.SortingPlans.provider;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.AdapterFactory;

import com.misc.projects.SortingPlans.SortingPath;
import com.misc.projects.SortingPlans.SortingPlanOutput;

public class SortingPathPathItemProvider extends
		TransientSortingPathItemProvider {

	public SortingPathPathItemProvider(AdapterFactory adapterFactory,
                                			SortingPath sortingPath) {
		super(adapterFactory, sortingPath);
	}
	
	@Override
	public Collection<?> getChildren(Object object) {
		SortingPath pathItem = (SortingPath)this.target;
		ArrayList<Object> result = new ArrayList<Object>();
		while ( pathItem!=null){
			SortingPlanOutput output = pathItem.getOutputLastSegment();
			if ( output!=null){
				result.add(output);
			}
			pathItem = pathItem.getBeforeLastSegment();
		}
		
		return result;
	}
	
	@Override
	public String getText(Object object) {
		return "Path";
	}

}
