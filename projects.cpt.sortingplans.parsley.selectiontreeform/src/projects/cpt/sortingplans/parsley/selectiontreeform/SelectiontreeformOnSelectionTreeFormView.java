package projects.cpt.sortingplans.parsley.selectiontreeform;

import org.eclipse.emf.parsley.menus.ViewerContextMenuHelper;
import org.eclipse.swt.widgets.Composite;

import com.google.inject.Inject;


public class SelectiontreeformOnSelectionTreeFormView extends org.eclipse.emf.parsley.views.OnSelectionTreeFormView {

	@Override
	public void createPartControl(Composite parent) {
		super.createPartControl(parent);
		contextMenuHelper.addViewerContextMenu(this.treeFormDetailComposite.getViewer());
	}

	@Inject 
	protected ViewerContextMenuHelper contextMenuHelper;
	
	
	
	
}
