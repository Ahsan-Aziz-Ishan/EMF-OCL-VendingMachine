/**
 */
package vendingMachineUAQ.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import vendingMachineUAQ.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class VendingMachineUAQFactoryImpl extends EFactoryImpl implements VendingMachineUAQFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static VendingMachineUAQFactory init() {
		try {
			VendingMachineUAQFactory theVendingMachineUAQFactory = (VendingMachineUAQFactory) EPackage.Registry.INSTANCE
					.getEFactory(VendingMachineUAQPackage.eNS_URI);
			if (theVendingMachineUAQFactory != null) {
				return theVendingMachineUAQFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new VendingMachineUAQFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VendingMachineUAQFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case VendingMachineUAQPackage.VENDING_MACHINE:
			return createVendingMachine();
		case VendingMachineUAQPackage.LOCATION:
			return createLocation();
		case VendingMachineUAQPackage.KEYPAD:
			return createKeypad();
		case VendingMachineUAQPackage.HAS_OPERATION:
			return createHasOperation();
		case VendingMachineUAQPackage.ITEM_PROCESSOR:
			return createItemProcessor();
		case VendingMachineUAQPackage.STATE:
			return createState();
		case VendingMachineUAQPackage.PAYMENT_PROCESSOR:
			return createPaymentProcessor();
		case VendingMachineUAQPackage.ITEM_GROUP:
			return createItemGroup();
		case VendingMachineUAQPackage.ITEM:
			return createItem();
		case VendingMachineUAQPackage.INVENTORY:
			return createInventory();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
		case VendingMachineUAQPackage.STATE_OPERATIONS:
			return createSTATE_OPERATIONSFromString(eDataType, initialValue);
		case VendingMachineUAQPackage.PAYMENT_METHODS:
			return createPAYMENT_METHODSFromString(eDataType, initialValue);
		case VendingMachineUAQPackage.STATES:
			return createSTATESFromString(eDataType, initialValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
		case VendingMachineUAQPackage.STATE_OPERATIONS:
			return convertSTATE_OPERATIONSToString(eDataType, instanceValue);
		case VendingMachineUAQPackage.PAYMENT_METHODS:
			return convertPAYMENT_METHODSToString(eDataType, instanceValue);
		case VendingMachineUAQPackage.STATES:
			return convertSTATESToString(eDataType, instanceValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VendingMachine createVendingMachine() {
		VendingMachineImpl vendingMachine = new VendingMachineImpl();
		return vendingMachine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Location createLocation() {
		LocationImpl location = new LocationImpl();
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Keypad createKeypad() {
		KeypadImpl keypad = new KeypadImpl();
		return keypad;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HasOperation createHasOperation() {
		HasOperationImpl hasOperation = new HasOperationImpl();
		return hasOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ItemProcessor createItemProcessor() {
		ItemProcessorImpl itemProcessor = new ItemProcessorImpl();
		return itemProcessor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public State createState() {
		StateImpl state = new StateImpl();
		return state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PaymentProcessor createPaymentProcessor() {
		PaymentProcessorImpl paymentProcessor = new PaymentProcessorImpl();
		return paymentProcessor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ItemGroup createItemGroup() {
		ItemGroupImpl itemGroup = new ItemGroupImpl();
		return itemGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Item createItem() {
		ItemImpl item = new ItemImpl();
		return item;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Inventory createInventory() {
		InventoryImpl inventory = new InventoryImpl();
		return inventory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public STATE_OPERATIONS createSTATE_OPERATIONSFromString(EDataType eDataType, String initialValue) {
		STATE_OPERATIONS result = STATE_OPERATIONS.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSTATE_OPERATIONSToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PAYMENT_METHODS createPAYMENT_METHODSFromString(EDataType eDataType, String initialValue) {
		PAYMENT_METHODS result = PAYMENT_METHODS.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPAYMENT_METHODSToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public STATES createSTATESFromString(EDataType eDataType, String initialValue) {
		STATES result = STATES.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSTATESToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VendingMachineUAQPackage getVendingMachineUAQPackage() {
		return (VendingMachineUAQPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static VendingMachineUAQPackage getPackage() {
		return VendingMachineUAQPackage.eINSTANCE;
	}

} //VendingMachineUAQFactoryImpl
