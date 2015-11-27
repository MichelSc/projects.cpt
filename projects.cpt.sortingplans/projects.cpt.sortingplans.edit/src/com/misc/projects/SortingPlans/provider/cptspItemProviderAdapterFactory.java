/**
 */
package com.misc.projects.SortingPlans.provider;

import com.misc.common.moplaf.emf.edit.ui.provider.IItemRelativesProvider;
import com.misc.projects.SortingPlans.util.cptspAdapterFactory;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.Disposable;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class cptspItemProviderAdapterFactory extends cptspAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the item providers created, so that they can be {@link #dispose disposed}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Disposable disposable = new Disposable();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public cptspItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
		supportedTypes.add(IItemRelativesProvider.class);
		}

	/**
	 * This keeps track of the one adapter used for all {@link com.misc.projects.SortingPlans.Scenarios} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ScenariosItemProvider scenariosItemProvider;

	/**
	 * This creates an adapter for a {@link com.misc.projects.SortingPlans.Scenarios}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createScenariosAdapter() {
		if (scenariosItemProvider == null) {
			scenariosItemProvider = new ScenariosItemProvider(this);
		}

		return scenariosItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.misc.projects.SortingPlans.Scenario} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ScenarioItemProvider scenarioItemProvider;

	/**
	 * This creates an adapter for a {@link com.misc.projects.SortingPlans.Scenario}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createScenarioAdapter() {
		if (scenarioItemProvider == null) {
			scenarioItemProvider = new ScenarioItemProvider(this);
		}

		return scenarioItemProvider;
	}

	/**
	 * This creates an adapter for a {@link com.misc.projects.SortingPlans.SortingPlan}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSortingPlanAdapter() {
		return new SortingPlanItemProvider(this);
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.misc.projects.SortingPlans.EndProduct} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EndProductItemProvider endProductItemProvider;

	/**
	 * This creates an adapter for a {@link com.misc.projects.SortingPlans.EndProduct}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEndProductAdapter() {
		if (endProductItemProvider == null) {
			endProductItemProvider = new EndProductItemProvider(this);
		}

		return endProductItemProvider;
	}

	/**
	 * This creates an adapter for a {@link com.misc.projects.SortingPlans.SortingPlanProduct}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSortingPlanProductAdapter() {
		return new SortingPlanProductItemProvider(this);
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.misc.projects.SortingPlans.SortingPlanOutput} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SortingPlanOutputItemProvider sortingPlanOutputItemProvider;

	/**
	 * This creates an adapter for a {@link com.misc.projects.SortingPlans.SortingPlanOutput}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSortingPlanOutputAdapter() {
		if (sortingPlanOutputItemProvider == null) {
			sortingPlanOutputItemProvider = new SortingPlanOutputItemProvider(this);
		}

		return sortingPlanOutputItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.misc.projects.SortingPlans.SortingPlanInput} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SortingPlanInputItemProvider sortingPlanInputItemProvider;

	/**
	 * This creates an adapter for a {@link com.misc.projects.SortingPlans.SortingPlanInput}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSortingPlanInputAdapter() {
		if (sortingPlanInputItemProvider == null) {
			sortingPlanInputItemProvider = new SortingPlanInputItemProvider(this);
		}

		return sortingPlanInputItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.misc.projects.SortingPlans.EndProductSortingPlan} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EndProductSortingPlanItemProvider endProductSortingPlanItemProvider;

	/**
	 * This creates an adapter for a {@link com.misc.projects.SortingPlans.EndProductSortingPlan}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEndProductSortingPlanAdapter() {
		if (endProductSortingPlanItemProvider == null) {
			endProductSortingPlanItemProvider = new EndProductSortingPlanItemProvider(this);
		}

		return endProductSortingPlanItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.misc.projects.SortingPlans.EndProductSortingPlanInput} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EndProductSortingPlanInputItemProvider endProductSortingPlanInputItemProvider;

	/**
	 * This creates an adapter for a {@link com.misc.projects.SortingPlans.EndProductSortingPlanInput}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEndProductSortingPlanInputAdapter() {
		if (endProductSortingPlanInputItemProvider == null) {
			endProductSortingPlanInputItemProvider = new EndProductSortingPlanInputItemProvider(this);
		}

		return endProductSortingPlanInputItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.misc.projects.SortingPlans.EndProductSortingPlanOutput} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EndProductSortingPlanOutputItemProvider endProductSortingPlanOutputItemProvider;

	/**
	 * This creates an adapter for a {@link com.misc.projects.SortingPlans.EndProductSortingPlanOutput}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEndProductSortingPlanOutputAdapter() {
		if (endProductSortingPlanOutputItemProvider == null) {
			endProductSortingPlanOutputItemProvider = new EndProductSortingPlanOutputItemProvider(this);
		}

		return endProductSortingPlanOutputItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.misc.projects.SortingPlans.EndProductInProduct} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EndProductInProductItemProvider endProductInProductItemProvider;

	/**
	 * This creates an adapter for a {@link com.misc.projects.SortingPlans.EndProductInProduct}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEndProductInProductAdapter() {
		if (endProductInProductItemProvider == null) {
			endProductInProductItemProvider = new EndProductInProductItemProvider(this);
		}

		return endProductInProductItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * Associates an adapter with a notifier via the base implementation, then records it to ensure it will be disposed.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void associate(Adapter adapter, Notifier target) {
		super.associate(adapter, target);
		if (adapter != null) {
			disposable.add(adapter);
		}
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		disposable.dispose();
	}

}
