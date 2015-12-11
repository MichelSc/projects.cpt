package projects.cpt.sortingplans.parsley.savetree;

import org.osgi.framework.Bundle;

import org.eclipse.emf.parsley.EmfParsleyExtensionFactory;
import org.eclipse.emf.parsley.EmfParsleyGuiceModule;

import com.google.inject.Injector;

public class SavetreeExecutableExtensionFactory extends
		EmfParsleyExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return SavetreeActivator.getDefault().getBundle();
	}

	@Override
	protected EmfParsleyGuiceModule getModule() {
		return SavetreeActivator.getDefault().createModule();
	}

	@Override
	protected Injector getInjector() {
		return SavetreeActivator.getDefault().getInjector();
	}
}
