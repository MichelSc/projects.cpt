package com.misc.projects.SortingPlans.presentation;

import org.eclipse.jface.action.Action;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.views.contentoutline.IContentOutlinePage;

public class SelectInOutlineAction extends Action {
		public final static String ID = "com.misc.projects.cpt.sortingplans.ConnectInOutline";

		ISelection currentSelection = null;
		IWorkbenchPart currentPart = null;

		public SelectInOutlineAction()	{
			setId(ID);
			setText("Select in Outline");
			setToolTipText("Select in Outilie");
			//setImageDescriptor();
		}

		public void selectionChanged(IWorkbenchPart part, ISelection incomingselection) {
			boolean enabled = incomingselection != null && part!=null;
			this.currentSelection = incomingselection;
			this.currentPart = part;
			this.setEnabled(enabled);
		} // selectionChanged method
		
		public void run()	{
			IContentOutlinePage outlinepage = (IContentOutlinePage)this.currentPart.getAdapter(IContentOutlinePage.class);
			if ( outlinepage != null) {
				outlinepage.setSelection(this.currentSelection);
			}
		} // run method
	}  // class ConnectAction
