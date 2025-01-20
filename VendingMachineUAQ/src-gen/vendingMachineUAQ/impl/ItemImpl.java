/**
 */
package vendingMachineUAQ.impl;

import java.util.Date;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;
import vendingMachineUAQ.Item;
import vendingMachineUAQ.ItemGroup;
import vendingMachineUAQ.VendingMachineUAQPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link vendingMachineUAQ.impl.ItemImpl#getExpiry <em>Expiry</em>}</li>
 *   <li>{@link vendingMachineUAQ.impl.ItemImpl#getItemGroup <em>Item Group</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ItemImpl extends HasIdImpl implements Item {
	/**
	 * The default value of the '{@link #getExpiry() <em>Expiry</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpiry()
	 * @generated
	 * @ordered
	 */
	protected static final Date EXPIRY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExpiry() <em>Expiry</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpiry()
	 * @generated
	 * @ordered
	 */
	protected Date expiry = EXPIRY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VendingMachineUAQPackage.Literals.ITEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getExpiry() {
		return expiry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExpiry(Date newExpiry) {
		Date oldExpiry = expiry;
		expiry = newExpiry;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VendingMachineUAQPackage.ITEM__EXPIRY, oldExpiry,
					expiry));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ItemGroup getItemGroup() {
		if (eContainerFeatureID() != VendingMachineUAQPackage.ITEM__ITEM_GROUP)
			return null;
		return (ItemGroup) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetItemGroup(ItemGroup newItemGroup, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newItemGroup, VendingMachineUAQPackage.ITEM__ITEM_GROUP, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setItemGroup(ItemGroup newItemGroup) {
		if (newItemGroup != eInternalContainer()
				|| (eContainerFeatureID() != VendingMachineUAQPackage.ITEM__ITEM_GROUP && newItemGroup != null)) {
			if (EcoreUtil.isAncestor(this, newItemGroup))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newItemGroup != null)
				msgs = ((InternalEObject) newItemGroup).eInverseAdd(this, VendingMachineUAQPackage.ITEM_GROUP__ITEMS,
						ItemGroup.class, msgs);
			msgs = basicSetItemGroup(newItemGroup, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VendingMachineUAQPackage.ITEM__ITEM_GROUP,
					newItemGroup, newItemGroup));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case VendingMachineUAQPackage.ITEM__ITEM_GROUP:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetItemGroup((ItemGroup) otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case VendingMachineUAQPackage.ITEM__ITEM_GROUP:
			return basicSetItemGroup(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
		case VendingMachineUAQPackage.ITEM__ITEM_GROUP:
			return eInternalContainer().eInverseRemove(this, VendingMachineUAQPackage.ITEM_GROUP__ITEMS,
					ItemGroup.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case VendingMachineUAQPackage.ITEM__EXPIRY:
			return getExpiry();
		case VendingMachineUAQPackage.ITEM__ITEM_GROUP:
			return getItemGroup();
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
		case VendingMachineUAQPackage.ITEM__EXPIRY:
			setExpiry((Date) newValue);
			return;
		case VendingMachineUAQPackage.ITEM__ITEM_GROUP:
			setItemGroup((ItemGroup) newValue);
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
		case VendingMachineUAQPackage.ITEM__EXPIRY:
			setExpiry(EXPIRY_EDEFAULT);
			return;
		case VendingMachineUAQPackage.ITEM__ITEM_GROUP:
			setItemGroup((ItemGroup) null);
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
		case VendingMachineUAQPackage.ITEM__EXPIRY:
			return EXPIRY_EDEFAULT == null ? expiry != null : !EXPIRY_EDEFAULT.equals(expiry);
		case VendingMachineUAQPackage.ITEM__ITEM_GROUP:
			return getItemGroup() != null;
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
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (expiry: ");
		result.append(expiry);
		result.append(')');
		return result.toString();
	}

} //ItemImpl
