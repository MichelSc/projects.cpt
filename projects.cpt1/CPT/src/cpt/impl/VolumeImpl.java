/**
 */
package cpt.impl;

import cpt.CptPackage;
import cpt.SortingSplit;
import cpt.UnsortedProduct;
import cpt.Volume;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Volume</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link cpt.impl.VolumeImpl#getProduct <em>Product</em>}</li>
 *   <li>{@link cpt.impl.VolumeImpl#getVolume <em>Volume</em>}</li>
 *   <li>{@link cpt.impl.VolumeImpl#getSortingSplit <em>Sorting Split</em>}</li>
 *   <li>{@link cpt.impl.VolumeImpl#getSourceTime <em>Source Time</em>}</li>
 *   <li>{@link cpt.impl.VolumeImpl#getDeliveryDate <em>Delivery Date</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VolumeImpl extends MinimalEObjectImpl.Container implements Volume {
	/**
	 * The cached value of the '{@link #getProduct() <em>Product</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProduct()
	 * @generated
	 * @ordered
	 */
	protected UnsortedProduct product;

	/**
	 * The default value of the '{@link #getVolume() <em>Volume</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVolume()
	 * @generated
	 * @ordered
	 */
	protected static final float VOLUME_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getVolume() <em>Volume</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVolume()
	 * @generated
	 * @ordered
	 */
	protected float volume = VOLUME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSortingSplit() <em>Sorting Split</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSortingSplit()
	 * @generated
	 * @ordered
	 */
	protected SortingSplit sortingSplit;

	/**
	 * The default value of the '{@link #getSourceTime() <em>Source Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceTime()
	 * @generated
	 * @ordered
	 */
	protected static final Date SOURCE_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSourceTime() <em>Source Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceTime()
	 * @generated
	 * @ordered
	 */
	protected Date sourceTime = SOURCE_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getDeliveryDate() <em>Delivery Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeliveryDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date DELIVERY_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDeliveryDate() <em>Delivery Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeliveryDate()
	 * @generated
	 * @ordered
	 */
	protected Date deliveryDate = DELIVERY_DATE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VolumeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CptPackage.Literals.VOLUME;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnsortedProduct getProduct() {
		if (product != null && product.eIsProxy()) {
			InternalEObject oldProduct = (InternalEObject)product;
			product = (UnsortedProduct)eResolveProxy(oldProduct);
			if (product != oldProduct) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CptPackage.VOLUME__PRODUCT, oldProduct, product));
			}
		}
		return product;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnsortedProduct basicGetProduct() {
		return product;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProduct(UnsortedProduct newProduct) {
		UnsortedProduct oldProduct = product;
		product = newProduct;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CptPackage.VOLUME__PRODUCT, oldProduct, product));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getVolume() {
		return volume;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVolume(float newVolume) {
		float oldVolume = volume;
		volume = newVolume;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CptPackage.VOLUME__VOLUME, oldVolume, volume));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SortingSplit getSortingSplit() {
		if (sortingSplit != null && sortingSplit.eIsProxy()) {
			InternalEObject oldSortingSplit = (InternalEObject)sortingSplit;
			sortingSplit = (SortingSplit)eResolveProxy(oldSortingSplit);
			if (sortingSplit != oldSortingSplit) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CptPackage.VOLUME__SORTING_SPLIT, oldSortingSplit, sortingSplit));
			}
		}
		return sortingSplit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SortingSplit basicGetSortingSplit() {
		return sortingSplit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSortingSplit(SortingSplit newSortingSplit) {
		SortingSplit oldSortingSplit = sortingSplit;
		sortingSplit = newSortingSplit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CptPackage.VOLUME__SORTING_SPLIT, oldSortingSplit, sortingSplit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getSourceTime() {
		return sourceTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceTime(Date newSourceTime) {
		Date oldSourceTime = sourceTime;
		sourceTime = newSourceTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CptPackage.VOLUME__SOURCE_TIME, oldSourceTime, sourceTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getDeliveryDate() {
		return deliveryDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeliveryDate(Date newDeliveryDate) {
		Date oldDeliveryDate = deliveryDate;
		deliveryDate = newDeliveryDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CptPackage.VOLUME__DELIVERY_DATE, oldDeliveryDate, deliveryDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CptPackage.VOLUME__PRODUCT:
				if (resolve) return getProduct();
				return basicGetProduct();
			case CptPackage.VOLUME__VOLUME:
				return getVolume();
			case CptPackage.VOLUME__SORTING_SPLIT:
				if (resolve) return getSortingSplit();
				return basicGetSortingSplit();
			case CptPackage.VOLUME__SOURCE_TIME:
				return getSourceTime();
			case CptPackage.VOLUME__DELIVERY_DATE:
				return getDeliveryDate();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CptPackage.VOLUME__PRODUCT:
				setProduct((UnsortedProduct)newValue);
				return;
			case CptPackage.VOLUME__VOLUME:
				setVolume((Float)newValue);
				return;
			case CptPackage.VOLUME__SORTING_SPLIT:
				setSortingSplit((SortingSplit)newValue);
				return;
			case CptPackage.VOLUME__SOURCE_TIME:
				setSourceTime((Date)newValue);
				return;
			case CptPackage.VOLUME__DELIVERY_DATE:
				setDeliveryDate((Date)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case CptPackage.VOLUME__PRODUCT:
				setProduct((UnsortedProduct)null);
				return;
			case CptPackage.VOLUME__VOLUME:
				setVolume(VOLUME_EDEFAULT);
				return;
			case CptPackage.VOLUME__SORTING_SPLIT:
				setSortingSplit((SortingSplit)null);
				return;
			case CptPackage.VOLUME__SOURCE_TIME:
				setSourceTime(SOURCE_TIME_EDEFAULT);
				return;
			case CptPackage.VOLUME__DELIVERY_DATE:
				setDeliveryDate(DELIVERY_DATE_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case CptPackage.VOLUME__PRODUCT:
				return product != null;
			case CptPackage.VOLUME__VOLUME:
				return volume != VOLUME_EDEFAULT;
			case CptPackage.VOLUME__SORTING_SPLIT:
				return sortingSplit != null;
			case CptPackage.VOLUME__SOURCE_TIME:
				return SOURCE_TIME_EDEFAULT == null ? sourceTime != null : !SOURCE_TIME_EDEFAULT.equals(sourceTime);
			case CptPackage.VOLUME__DELIVERY_DATE:
				return DELIVERY_DATE_EDEFAULT == null ? deliveryDate != null : !DELIVERY_DATE_EDEFAULT.equals(deliveryDate);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (Volume: ");
		result.append(volume);
		result.append(", SourceTime: ");
		result.append(sourceTime);
		result.append(", DeliveryDate: ");
		result.append(deliveryDate);
		result.append(')');
		return result.toString();
	}

} //VolumeImpl
