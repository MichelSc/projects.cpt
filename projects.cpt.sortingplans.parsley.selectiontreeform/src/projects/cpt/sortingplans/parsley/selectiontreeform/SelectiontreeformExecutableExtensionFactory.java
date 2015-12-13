package projects.cpt.sortingplans.parsley.selectiontreeform;

import org.osgi.framework.Bundle;

import org.eclipse.emf.parsley.EmfParsleyExtensionFactory;
import org.eclipse.emf.parsley.EmfParsleyGuiceModule;

import com.google.inject.Injector;

public class SelectiontreeformExecutableExtensionFactory extends
		EmfParsleyExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return SelectiontreeformActivator.getDefault().getBundle();
	}

	@Override
	protected EmfParsleyGuiceModule getModule() {
		return SelectiontreeformActivator.getDefault().createModule();
	}

	@Override
	protected Injector getInjector() {
		return SelectiontreeformActivator.getDefault().getInjector();
	}
}
