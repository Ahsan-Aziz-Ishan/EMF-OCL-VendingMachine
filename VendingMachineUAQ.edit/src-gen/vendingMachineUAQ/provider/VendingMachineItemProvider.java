/**
 */
package vendingMachineUAQ.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;

import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import vendingMachineUAQ.VendingMachine;
import vendingMachineUAQ.VendingMachineUAQPackage;

/**
 * This is the item provider adapter for a {@link vendingMachineUAQ.VendingMachine} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class VendingMachineItemProvider extends NamedEntityItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VendingMachineItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addIdPropertyDescriptor(object);
			addLocationPropertyDescriptor(object);
			addStatePropertyDescriptor(object);
			addKeypadPropertyDescriptor(object);
			addPaymentProcessorPropertyDescriptor(object);
			addItemProcessorPropertyDescriptor(object);
			addInventoryPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Id feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIdPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_HasId_id_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_HasId_id_feature", "_UI_HasId_type"),
						VendingMachineUAQPackage.Literals.HAS_ID__ID, true, false, false,
						ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Location feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLocationPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_VendingMachine_location_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_VendingMachine_location_feature",
								"_UI_VendingMachine_type"),
						VendingMachineUAQPackage.Literals.VENDING_MACHINE__LOCATION, true, false, true, null, null,
						null));
	}

	/**
	 * This adds a property descriptor for the State feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStatePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_VendingMachine_state_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_VendingMachine_state_feature",
								"_UI_VendingMachine_type"),
						VendingMachineUAQPackage.Literals.VENDING_MACHINE__STATE, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Keypad feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addKeypadPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_VendingMachine_keypad_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_VendingMachine_keypad_feature",
								"_UI_VendingMachine_type"),
						VendingMachineUAQPackage.Literals.VENDING_MACHINE__KEYPAD, true, false, true, null, null,
						null));
	}

	/**
	 * This adds a property descriptor for the Payment Processor feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPaymentProcessorPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_VendingMachine_paymentProcessor_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_VendingMachine_paymentProcessor_feature",
								"_UI_VendingMachine_type"),
						VendingMachineUAQPackage.Literals.VENDING_MACHINE__PAYMENT_PROCESSOR, true, false, true, null,
						null, null));
	}

	/**
	 * This adds a property descriptor for the Item Processor feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addItemProcessorPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_VendingMachine_itemProcessor_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_VendingMachine_itemProcessor_feature",
						"_UI_VendingMachine_type"),
				VendingMachineUAQPackage.Literals.VENDING_MACHINE__ITEM_PROCESSOR, true, false, true, null, null,
				null));
	}

	/**
	 * This adds a property descriptor for the Inventory feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInventoryPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_VendingMachine_inventory_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_VendingMachine_inventory_feature",
						"_UI_VendingMachine_type"),
				VendingMachineUAQPackage.Literals.VENDING_MACHINE__INVENTORY, true, false, true, null, null, null));
	}

	/**
	 * This returns VendingMachine.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/VendingMachine"));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean shouldComposeCreationImage() {
		return true;
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((VendingMachine) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_VendingMachine_type")
				: getString("_UI_VendingMachine_type") + " " + label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(VendingMachine.class)) {
		case VendingMachineUAQPackage.VENDING_MACHINE__ID:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);
	}

}
