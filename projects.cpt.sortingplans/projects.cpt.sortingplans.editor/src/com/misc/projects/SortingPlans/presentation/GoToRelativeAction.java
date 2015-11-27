package com.misc.projects.SortingPlans.presentation;

import java.util.Collection;

import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.ITreeSelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.views.contentoutline.IContentOutlinePage;

import com.misc.common.moplaf.emf.edit.ui.provider.IItemRelativesProvider;

public class GoToRelativeAction extends Action {
		public final static String ID = "com.misc.projects.cpt.sortingplans.GoToRelative";

		private ComposedAdapterFactory adapterFactory = new ComposedAdapterFactory(ComposedAdapterFactory.Descriptor.Registry.INSTANCE);
		private ISelectionProvider currentSelectionProvider = null;
		private Collection<?> relatives = null;
		private IWorkbenchPart currentPart = null;

		public GoToRelativeAction()	{
			setId(ID);
			setText("Go to relative");
			setToolTipText("Go to relative");
			//setImageDescriptor();
		}

		public void selectionChanged(IWorkbenchPart part, ISelection incomingselection) {
			this.currentPart = part;
			boolean enabled = false;
			Collection<?> relatives = null;
			ISelectionProvider currentSelectionProvider = null;
			if ( incomingselection instanceof IStructuredSelection 
				&& part instanceof ISelectionProvider){
				IStructuredSelection structuredSelection = (IStructuredSelection )incomingselection;
				Object selected = structuredSelection.getFirstElement();
				if ( selected != null ){
					// something selected
					IItemRelativesProvider provider = (IItemRelativesProvider)this.adapterFactory.adapt(selected, IItemRelativesProvider.class);
					relatives = provider == null ?  null : provider.getRelatives(selected);
					if ( relatives != null && incomingselection instanceof ITreeSelection ){
						// prune the relatives
						ITreeSelection treeSelection = (ITreeSelection)incomingselection;
						TreePath[] paths = treeSelection.getPathsFor(selected);
						for (TreePath path : paths){
							for (int index = 0; index<path.getSegmentCount(); index++){
								Object node = path.getSegment(index);
								relatives.remove(node);
							} // traverse the path
						}  // traverse the paths
						enabled = ! relatives.isEmpty();	
						currentSelectionProvider = (ISelectionProvider)part;
					}  // there are relatives
				} // something selected
			} // selection is structures
			this.relatives  = relatives;
			this.setEnabled(enabled);
			this.currentSelectionProvider = currentSelectionProvider;
		} // selectionChanged method
		
		public void run()	{
			IContentOutlinePage outlinepage = (IContentOutlinePage)this.currentPart.getAdapter(IContentOutlinePage.class);
			if ( outlinepage != null) {
				StructuredSelection selection = new StructuredSelection(this.relatives.toArray());
				outlinepage.setSelection(selection);
			}
		} // run method
	}  // class ConnectAction
