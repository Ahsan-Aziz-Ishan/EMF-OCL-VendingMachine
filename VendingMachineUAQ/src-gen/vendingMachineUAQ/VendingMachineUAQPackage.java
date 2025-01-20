/**
 */
package vendingMachineUAQ;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see vendingMachineUAQ.VendingMachineUAQFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore"
 * @generated
 */
public interface VendingMachineUAQPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "vendingMachineUAQ";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/vendingMachineUAQ";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "vendingMachineUAQ";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	VendingMachineUAQPackage eINSTANCE = vendingMachineUAQ.impl.VendingMachineUAQPackageImpl.init();

	/**
	 * The meta object id for the '{@link vendingMachineUAQ.impl.NamedEntityImpl <em>Named Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vendingMachineUAQ.impl.NamedEntityImpl
	 * @see vendingMachineUAQ.impl.VendingMachineUAQPackageImpl#getNamedEntity()
	 * @generated
	 */
	int NAMED_ENTITY = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ENTITY__NAME = 0;

	/**
	 * The number of structural features of the '<em>Named Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ENTITY_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Named Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ENTITY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link vendingMachineUAQ.impl.VendingMachineImpl <em>Vending Machine</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vendingMachineUAQ.impl.VendingMachineImpl
	 * @see vendingMachineUAQ.impl.VendingMachineUAQPackageImpl#getVendingMachine()
	 * @generated
	 */
	int VENDING_MACHINE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VENDING_MACHINE__NAME = NAMED_ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VENDING_MACHINE__ID = NAMED_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VENDING_MACHINE__LOCATION = NAMED_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>State</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VENDING_MACHINE__STATE = NAMED_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Keypad</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VENDING_MACHINE__KEYPAD = NAMED_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Payment Processor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VENDING_MACHINE__PAYMENT_PROCESSOR = NAMED_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Item Processor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VENDING_MACHINE__ITEM_PROCESSOR = NAMED_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Inventory</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VENDING_MACHINE__INVENTORY = NAMED_ENTITY_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Vending Machine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VENDING_MACHINE_FEATURE_COUNT = NAMED_ENTITY_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Vending Machine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VENDING_MACHINE_OPERATION_COUNT = NAMED_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link vendingMachineUAQ.impl.LocationImpl <em>Location</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vendingMachineUAQ.impl.LocationImpl
	 * @see vendingMachineUAQ.impl.VendingMachineUAQPackageImpl#getLocation()
	 * @generated
	 */
	int LOCATION = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__NAME = NAMED_ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Lat</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__LAT = NAMED_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Long</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__LONG = NAMED_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_FEATURE_COUNT = NAMED_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Valid Coordinates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION___VALID_COORDINATES__DIAGNOSTICCHAIN_MAP = NAMED_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_OPERATION_COUNT = NAMED_ENTITY_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link vendingMachineUAQ.impl.HasIdImpl <em>Has Id</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vendingMachineUAQ.impl.HasIdImpl
	 * @see vendingMachineUAQ.impl.VendingMachineUAQPackageImpl#getHasId()
	 * @generated
	 */
	int HAS_ID = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAS_ID__ID = 0;

	/**
	 * The number of structural features of the '<em>Has Id</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAS_ID_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Has Id</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAS_ID_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link vendingMachineUAQ.impl.KeypadImpl <em>Keypad</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vendingMachineUAQ.impl.KeypadImpl
	 * @see vendingMachineUAQ.impl.VendingMachineUAQPackageImpl#getKeypad()
	 * @generated
	 */
	int KEYPAD = 4;

	/**
	 * The meta object id for the '{@link vendingMachineUAQ.impl.HasOperationImpl <em>Has Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vendingMachineUAQ.impl.HasOperationImpl
	 * @see vendingMachineUAQ.impl.VendingMachineUAQPackageImpl#getHasOperation()
	 * @generated
	 */
	int HAS_OPERATION = 5;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAS_OPERATION__OPERATION = 0;

	/**
	 * The number of structural features of the '<em>Has Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAS_OPERATION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Has Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAS_OPERATION_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEYPAD__OPERATION = HAS_OPERATION__OPERATION;

	/**
	 * The feature id for the '<em><b>Input</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEYPAD__INPUT = HAS_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Keypad</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEYPAD_FEATURE_COUNT = HAS_OPERATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Keypad</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEYPAD_OPERATION_COUNT = HAS_OPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link vendingMachineUAQ.impl.ItemProcessorImpl <em>Item Processor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vendingMachineUAQ.impl.ItemProcessorImpl
	 * @see vendingMachineUAQ.impl.VendingMachineUAQPackageImpl#getItemProcessor()
	 * @generated
	 */
	int ITEM_PROCESSOR = 6;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_PROCESSOR__OPERATION = HAS_OPERATION__OPERATION;

	/**
	 * The feature id for the '<em><b>State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_PROCESSOR__STATE = HAS_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Current Stage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_PROCESSOR__CURRENT_STAGE = HAS_OPERATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Item Processor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_PROCESSOR_FEATURE_COUNT = HAS_OPERATION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Item Processor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_PROCESSOR_OPERATION_COUNT = HAS_OPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link vendingMachineUAQ.impl.StateImpl <em>State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vendingMachineUAQ.impl.StateImpl
	 * @see vendingMachineUAQ.impl.VendingMachineUAQPackageImpl#getState()
	 * @generated
	 */
	int STATE = 7;

	/**
	 * The feature id for the '<em><b>Stage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__STAGE = 0;

	/**
	 * The number of structural features of the '<em>State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link vendingMachineUAQ.impl.PaymentProcessorImpl <em>Payment Processor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vendingMachineUAQ.impl.PaymentProcessorImpl
	 * @see vendingMachineUAQ.impl.VendingMachineUAQPackageImpl#getPaymentProcessor()
	 * @generated
	 */
	int PAYMENT_PROCESSOR = 8;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_PROCESSOR__OPERATION = HAS_OPERATION__OPERATION;

	/**
	 * The feature id for the '<em><b>Amound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_PROCESSOR__AMOUND = HAS_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Payment Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_PROCESSOR__PAYMENT_METHOD = HAS_OPERATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_PROCESSOR__STATE = HAS_OPERATION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Payment Processor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_PROCESSOR_FEATURE_COUNT = HAS_OPERATION_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Is Payment Complete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_PROCESSOR___IS_PAYMENT_COMPLETE = HAS_OPERATION_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Payment Processor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_PROCESSOR_OPERATION_COUNT = HAS_OPERATION_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link vendingMachineUAQ.impl.ItemGroupImpl <em>Item Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vendingMachineUAQ.impl.ItemGroupImpl
	 * @see vendingMachineUAQ.impl.VendingMachineUAQPackageImpl#getItemGroup()
	 * @generated
	 */
	int ITEM_GROUP = 9;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_GROUP__ID = HAS_ID__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_GROUP__NAME = HAS_ID_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_GROUP__QUANTITY = HAS_ID_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_GROUP__PRICE = HAS_ID_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_GROUP__IMAGE = HAS_ID_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_GROUP__ITEMS = HAS_ID_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Item Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_GROUP_FEATURE_COUNT = HAS_ID_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>Positive Quantity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_GROUP___POSITIVE_QUANTITY__DIAGNOSTICCHAIN_MAP = HAS_ID_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Item Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_GROUP_OPERATION_COUNT = HAS_ID_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link vendingMachineUAQ.impl.ItemImpl <em>Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vendingMachineUAQ.impl.ItemImpl
	 * @see vendingMachineUAQ.impl.VendingMachineUAQPackageImpl#getItem()
	 * @generated
	 */
	int ITEM = 10;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__ID = HAS_ID__ID;

	/**
	 * The feature id for the '<em><b>Expiry</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__EXPIRY = HAS_ID_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Item Group</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__ITEM_GROUP = HAS_ID_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_FEATURE_COUNT = HAS_ID_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_OPERATION_COUNT = HAS_ID_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link vendingMachineUAQ.impl.InventoryImpl <em>Inventory</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vendingMachineUAQ.impl.InventoryImpl
	 * @see vendingMachineUAQ.impl.VendingMachineUAQPackageImpl#getInventory()
	 * @generated
	 */
	int INVENTORY = 11;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY__ID = HAS_ID__ID;

	/**
	 * The feature id for the '<em><b>Item Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY__ITEM_GROUPS = HAS_ID_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY__CAPACITY = HAS_ID_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Restocked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY__LAST_RESTOCKED = HAS_ID_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Available Slots</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY__AVAILABLE_SLOTS = HAS_ID_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Inventory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY_FEATURE_COUNT = HAS_ID_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Calculate Total Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY___CALCULATE_TOTAL_VALUE = HAS_ID_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Non Negative Capacity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY___NON_NEGATIVE_CAPACITY__DIAGNOSTICCHAIN_MAP = HAS_ID_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Inventory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY_OPERATION_COUNT = HAS_ID_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link vendingMachineUAQ.STATE_OPERATIONS <em>STATE OPERATIONS</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vendingMachineUAQ.STATE_OPERATIONS
	 * @see vendingMachineUAQ.impl.VendingMachineUAQPackageImpl#getSTATE_OPERATIONS()
	 * @generated
	 */
	int STATE_OPERATIONS = 12;

	/**
	 * The meta object id for the '{@link vendingMachineUAQ.PAYMENT_METHODS <em>PAYMENT METHODS</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vendingMachineUAQ.PAYMENT_METHODS
	 * @see vendingMachineUAQ.impl.VendingMachineUAQPackageImpl#getPAYMENT_METHODS()
	 * @generated
	 */
	int PAYMENT_METHODS = 13;

	/**
	 * The meta object id for the '{@link vendingMachineUAQ.STATES <em>STATES</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vendingMachineUAQ.STATES
	 * @see vendingMachineUAQ.impl.VendingMachineUAQPackageImpl#getSTATES()
	 * @generated
	 */
	int STATES = 14;

	/**
	 * Returns the meta object for class '{@link vendingMachineUAQ.NamedEntity <em>Named Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Entity</em>'.
	 * @see vendingMachineUAQ.NamedEntity
	 * @generated
	 */
	EClass getNamedEntity();

	/**
	 * Returns the meta object for the attribute '{@link vendingMachineUAQ.NamedEntity#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see vendingMachineUAQ.NamedEntity#getName()
	 * @see #getNamedEntity()
	 * @generated
	 */
	EAttribute getNamedEntity_Name();

	/**
	 * Returns the meta object for class '{@link vendingMachineUAQ.VendingMachine <em>Vending Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vending Machine</em>'.
	 * @see vendingMachineUAQ.VendingMachine
	 * @generated
	 */
	EClass getVendingMachine();

	/**
	 * Returns the meta object for the containment reference '{@link vendingMachineUAQ.VendingMachine#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Location</em>'.
	 * @see vendingMachineUAQ.VendingMachine#getLocation()
	 * @see #getVendingMachine()
	 * @generated
	 */
	EReference getVendingMachine_Location();

	/**
	 * Returns the meta object for the containment reference '{@link vendingMachineUAQ.VendingMachine#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>State</em>'.
	 * @see vendingMachineUAQ.VendingMachine#getState()
	 * @see #getVendingMachine()
	 * @generated
	 */
	EReference getVendingMachine_State();

	/**
	 * Returns the meta object for the containment reference '{@link vendingMachineUAQ.VendingMachine#getKeypad <em>Keypad</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Keypad</em>'.
	 * @see vendingMachineUAQ.VendingMachine#getKeypad()
	 * @see #getVendingMachine()
	 * @generated
	 */
	EReference getVendingMachine_Keypad();

	/**
	 * Returns the meta object for the containment reference '{@link vendingMachineUAQ.VendingMachine#getPaymentProcessor <em>Payment Processor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Payment Processor</em>'.
	 * @see vendingMachineUAQ.VendingMachine#getPaymentProcessor()
	 * @see #getVendingMachine()
	 * @generated
	 */
	EReference getVendingMachine_PaymentProcessor();

	/**
	 * Returns the meta object for the containment reference '{@link vendingMachineUAQ.VendingMachine#getItemProcessor <em>Item Processor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Item Processor</em>'.
	 * @see vendingMachineUAQ.VendingMachine#getItemProcessor()
	 * @see #getVendingMachine()
	 * @generated
	 */
	EReference getVendingMachine_ItemProcessor();

	/**
	 * Returns the meta object for the containment reference '{@link vendingMachineUAQ.VendingMachine#getInventory <em>Inventory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Inventory</em>'.
	 * @see vendingMachineUAQ.VendingMachine#getInventory()
	 * @see #getVendingMachine()
	 * @generated
	 */
	EReference getVendingMachine_Inventory();

	/**
	 * Returns the meta object for class '{@link vendingMachineUAQ.Location <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Location</em>'.
	 * @see vendingMachineUAQ.Location
	 * @generated
	 */
	EClass getLocation();

	/**
	 * Returns the meta object for the attribute '{@link vendingMachineUAQ.Location#getLat <em>Lat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lat</em>'.
	 * @see vendingMachineUAQ.Location#getLat()
	 * @see #getLocation()
	 * @generated
	 */
	EAttribute getLocation_Lat();

	/**
	 * Returns the meta object for the attribute '{@link vendingMachineUAQ.Location#getLong <em>Long</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Long</em>'.
	 * @see vendingMachineUAQ.Location#getLong()
	 * @see #getLocation()
	 * @generated
	 */
	EAttribute getLocation_Long();

	/**
	 * Returns the meta object for the '{@link vendingMachineUAQ.Location#ValidCoordinates(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Valid Coordinates</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Valid Coordinates</em>' operation.
	 * @see vendingMachineUAQ.Location#ValidCoordinates(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getLocation__ValidCoordinates__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link vendingMachineUAQ.HasId <em>Has Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Has Id</em>'.
	 * @see vendingMachineUAQ.HasId
	 * @generated
	 */
	EClass getHasId();

	/**
	 * Returns the meta object for the attribute '{@link vendingMachineUAQ.HasId#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see vendingMachineUAQ.HasId#getId()
	 * @see #getHasId()
	 * @generated
	 */
	EAttribute getHasId_Id();

	/**
	 * Returns the meta object for class '{@link vendingMachineUAQ.Keypad <em>Keypad</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Keypad</em>'.
	 * @see vendingMachineUAQ.Keypad
	 * @generated
	 */
	EClass getKeypad();

	/**
	 * Returns the meta object for the attribute '{@link vendingMachineUAQ.Keypad#getInput <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Input</em>'.
	 * @see vendingMachineUAQ.Keypad#getInput()
	 * @see #getKeypad()
	 * @generated
	 */
	EAttribute getKeypad_Input();

	/**
	 * Returns the meta object for class '{@link vendingMachineUAQ.HasOperation <em>Has Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Has Operation</em>'.
	 * @see vendingMachineUAQ.HasOperation
	 * @generated
	 */
	EClass getHasOperation();

	/**
	 * Returns the meta object for the attribute '{@link vendingMachineUAQ.HasOperation#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operation</em>'.
	 * @see vendingMachineUAQ.HasOperation#getOperation()
	 * @see #getHasOperation()
	 * @generated
	 */
	EAttribute getHasOperation_Operation();

	/**
	 * Returns the meta object for class '{@link vendingMachineUAQ.ItemProcessor <em>Item Processor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Item Processor</em>'.
	 * @see vendingMachineUAQ.ItemProcessor
	 * @generated
	 */
	EClass getItemProcessor();

	/**
	 * Returns the meta object for the reference '{@link vendingMachineUAQ.ItemProcessor#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>State</em>'.
	 * @see vendingMachineUAQ.ItemProcessor#getState()
	 * @see #getItemProcessor()
	 * @generated
	 */
	EReference getItemProcessor_State();

	/**
	 * Returns the meta object for the attribute '{@link vendingMachineUAQ.ItemProcessor#getCurrentStage <em>Current Stage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Current Stage</em>'.
	 * @see vendingMachineUAQ.ItemProcessor#getCurrentStage()
	 * @see #getItemProcessor()
	 * @generated
	 */
	EAttribute getItemProcessor_CurrentStage();

	/**
	 * Returns the meta object for class '{@link vendingMachineUAQ.State <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State</em>'.
	 * @see vendingMachineUAQ.State
	 * @generated
	 */
	EClass getState();

	/**
	 * Returns the meta object for the attribute '{@link vendingMachineUAQ.State#getStage <em>Stage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stage</em>'.
	 * @see vendingMachineUAQ.State#getStage()
	 * @see #getState()
	 * @generated
	 */
	EAttribute getState_Stage();

	/**
	 * Returns the meta object for class '{@link vendingMachineUAQ.PaymentProcessor <em>Payment Processor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Payment Processor</em>'.
	 * @see vendingMachineUAQ.PaymentProcessor
	 * @generated
	 */
	EClass getPaymentProcessor();

	/**
	 * Returns the meta object for the attribute '{@link vendingMachineUAQ.PaymentProcessor#getAmound <em>Amound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Amound</em>'.
	 * @see vendingMachineUAQ.PaymentProcessor#getAmound()
	 * @see #getPaymentProcessor()
	 * @generated
	 */
	EAttribute getPaymentProcessor_Amound();

	/**
	 * Returns the meta object for the attribute '{@link vendingMachineUAQ.PaymentProcessor#getPaymentMethod <em>Payment Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Payment Method</em>'.
	 * @see vendingMachineUAQ.PaymentProcessor#getPaymentMethod()
	 * @see #getPaymentProcessor()
	 * @generated
	 */
	EAttribute getPaymentProcessor_PaymentMethod();

	/**
	 * Returns the meta object for the reference '{@link vendingMachineUAQ.PaymentProcessor#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>State</em>'.
	 * @see vendingMachineUAQ.PaymentProcessor#getState()
	 * @see #getPaymentProcessor()
	 * @generated
	 */
	EReference getPaymentProcessor_State();

	/**
	 * Returns the meta object for the '{@link vendingMachineUAQ.PaymentProcessor#isPaymentComplete() <em>Is Payment Complete</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Payment Complete</em>' operation.
	 * @see vendingMachineUAQ.PaymentProcessor#isPaymentComplete()
	 * @generated
	 */
	EOperation getPaymentProcessor__IsPaymentComplete();

	/**
	 * Returns the meta object for class '{@link vendingMachineUAQ.ItemGroup <em>Item Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Item Group</em>'.
	 * @see vendingMachineUAQ.ItemGroup
	 * @generated
	 */
	EClass getItemGroup();

	/**
	 * Returns the meta object for the attribute '{@link vendingMachineUAQ.ItemGroup#getQuantity <em>Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Quantity</em>'.
	 * @see vendingMachineUAQ.ItemGroup#getQuantity()
	 * @see #getItemGroup()
	 * @generated
	 */
	EAttribute getItemGroup_Quantity();

	/**
	 * Returns the meta object for the attribute '{@link vendingMachineUAQ.ItemGroup#getPrice <em>Price</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Price</em>'.
	 * @see vendingMachineUAQ.ItemGroup#getPrice()
	 * @see #getItemGroup()
	 * @generated
	 */
	EAttribute getItemGroup_Price();

	/**
	 * Returns the meta object for the attribute '{@link vendingMachineUAQ.ItemGroup#getImage <em>Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Image</em>'.
	 * @see vendingMachineUAQ.ItemGroup#getImage()
	 * @see #getItemGroup()
	 * @generated
	 */
	EAttribute getItemGroup_Image();

	/**
	 * Returns the meta object for the containment reference list '{@link vendingMachineUAQ.ItemGroup#getItems <em>Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Items</em>'.
	 * @see vendingMachineUAQ.ItemGroup#getItems()
	 * @see #getItemGroup()
	 * @generated
	 */
	EReference getItemGroup_Items();

	/**
	 * Returns the meta object for the '{@link vendingMachineUAQ.ItemGroup#PositiveQuantity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Positive Quantity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Positive Quantity</em>' operation.
	 * @see vendingMachineUAQ.ItemGroup#PositiveQuantity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getItemGroup__PositiveQuantity__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link vendingMachineUAQ.Item <em>Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Item</em>'.
	 * @see vendingMachineUAQ.Item
	 * @generated
	 */
	EClass getItem();

	/**
	 * Returns the meta object for the attribute '{@link vendingMachineUAQ.Item#getExpiry <em>Expiry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expiry</em>'.
	 * @see vendingMachineUAQ.Item#getExpiry()
	 * @see #getItem()
	 * @generated
	 */
	EAttribute getItem_Expiry();

	/**
	 * Returns the meta object for the container reference '{@link vendingMachineUAQ.Item#getItemGroup <em>Item Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Item Group</em>'.
	 * @see vendingMachineUAQ.Item#getItemGroup()
	 * @see #getItem()
	 * @generated
	 */
	EReference getItem_ItemGroup();

	/**
	 * Returns the meta object for class '{@link vendingMachineUAQ.Inventory <em>Inventory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Inventory</em>'.
	 * @see vendingMachineUAQ.Inventory
	 * @generated
	 */
	EClass getInventory();

	/**
	 * Returns the meta object for the containment reference list '{@link vendingMachineUAQ.Inventory#getItemGroups <em>Item Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Item Groups</em>'.
	 * @see vendingMachineUAQ.Inventory#getItemGroups()
	 * @see #getInventory()
	 * @generated
	 */
	EReference getInventory_ItemGroups();

	/**
	 * Returns the meta object for the attribute '{@link vendingMachineUAQ.Inventory#getCapacity <em>Capacity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Capacity</em>'.
	 * @see vendingMachineUAQ.Inventory#getCapacity()
	 * @see #getInventory()
	 * @generated
	 */
	EAttribute getInventory_Capacity();

	/**
	 * Returns the meta object for the attribute '{@link vendingMachineUAQ.Inventory#getLastRestocked <em>Last Restocked</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Restocked</em>'.
	 * @see vendingMachineUAQ.Inventory#getLastRestocked()
	 * @see #getInventory()
	 * @generated
	 */
	EAttribute getInventory_LastRestocked();

	/**
	 * Returns the meta object for the attribute '{@link vendingMachineUAQ.Inventory#getAvailableSlots <em>Available Slots</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Available Slots</em>'.
	 * @see vendingMachineUAQ.Inventory#getAvailableSlots()
	 * @see #getInventory()
	 * @generated
	 */
	EAttribute getInventory_AvailableSlots();

	/**
	 * Returns the meta object for the '{@link vendingMachineUAQ.Inventory#calculateTotalValue() <em>Calculate Total Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Calculate Total Value</em>' operation.
	 * @see vendingMachineUAQ.Inventory#calculateTotalValue()
	 * @generated
	 */
	EOperation getInventory__CalculateTotalValue();

	/**
	 * Returns the meta object for the '{@link vendingMachineUAQ.Inventory#NonNegativeCapacity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Non Negative Capacity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Non Negative Capacity</em>' operation.
	 * @see vendingMachineUAQ.Inventory#NonNegativeCapacity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getInventory__NonNegativeCapacity__DiagnosticChain_Map();

	/**
	 * Returns the meta object for enum '{@link vendingMachineUAQ.STATE_OPERATIONS <em>STATE OPERATIONS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>STATE OPERATIONS</em>'.
	 * @see vendingMachineUAQ.STATE_OPERATIONS
	 * @generated
	 */
	EEnum getSTATE_OPERATIONS();

	/**
	 * Returns the meta object for enum '{@link vendingMachineUAQ.PAYMENT_METHODS <em>PAYMENT METHODS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>PAYMENT METHODS</em>'.
	 * @see vendingMachineUAQ.PAYMENT_METHODS
	 * @generated
	 */
	EEnum getPAYMENT_METHODS();

	/**
	 * Returns the meta object for enum '{@link vendingMachineUAQ.STATES <em>STATES</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>STATES</em>'.
	 * @see vendingMachineUAQ.STATES
	 * @generated
	 */
	EEnum getSTATES();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	VendingMachineUAQFactory getVendingMachineUAQFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link vendingMachineUAQ.impl.NamedEntityImpl <em>Named Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vendingMachineUAQ.impl.NamedEntityImpl
		 * @see vendingMachineUAQ.impl.VendingMachineUAQPackageImpl#getNamedEntity()
		 * @generated
		 */
		EClass NAMED_ENTITY = eINSTANCE.getNamedEntity();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ENTITY__NAME = eINSTANCE.getNamedEntity_Name();

		/**
		 * The meta object literal for the '{@link vendingMachineUAQ.impl.VendingMachineImpl <em>Vending Machine</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vendingMachineUAQ.impl.VendingMachineImpl
		 * @see vendingMachineUAQ.impl.VendingMachineUAQPackageImpl#getVendingMachine()
		 * @generated
		 */
		EClass VENDING_MACHINE = eINSTANCE.getVendingMachine();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VENDING_MACHINE__LOCATION = eINSTANCE.getVendingMachine_Location();

		/**
		 * The meta object literal for the '<em><b>State</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VENDING_MACHINE__STATE = eINSTANCE.getVendingMachine_State();

		/**
		 * The meta object literal for the '<em><b>Keypad</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VENDING_MACHINE__KEYPAD = eINSTANCE.getVendingMachine_Keypad();

		/**
		 * The meta object literal for the '<em><b>Payment Processor</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VENDING_MACHINE__PAYMENT_PROCESSOR = eINSTANCE.getVendingMachine_PaymentProcessor();

		/**
		 * The meta object literal for the '<em><b>Item Processor</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VENDING_MACHINE__ITEM_PROCESSOR = eINSTANCE.getVendingMachine_ItemProcessor();

		/**
		 * The meta object literal for the '<em><b>Inventory</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VENDING_MACHINE__INVENTORY = eINSTANCE.getVendingMachine_Inventory();

		/**
		 * The meta object literal for the '{@link vendingMachineUAQ.impl.LocationImpl <em>Location</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vendingMachineUAQ.impl.LocationImpl
		 * @see vendingMachineUAQ.impl.VendingMachineUAQPackageImpl#getLocation()
		 * @generated
		 */
		EClass LOCATION = eINSTANCE.getLocation();

		/**
		 * The meta object literal for the '<em><b>Lat</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCATION__LAT = eINSTANCE.getLocation_Lat();

		/**
		 * The meta object literal for the '<em><b>Long</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCATION__LONG = eINSTANCE.getLocation_Long();

		/**
		 * The meta object literal for the '<em><b>Valid Coordinates</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LOCATION___VALID_COORDINATES__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getLocation__ValidCoordinates__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link vendingMachineUAQ.impl.HasIdImpl <em>Has Id</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vendingMachineUAQ.impl.HasIdImpl
		 * @see vendingMachineUAQ.impl.VendingMachineUAQPackageImpl#getHasId()
		 * @generated
		 */
		EClass HAS_ID = eINSTANCE.getHasId();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HAS_ID__ID = eINSTANCE.getHasId_Id();

		/**
		 * The meta object literal for the '{@link vendingMachineUAQ.impl.KeypadImpl <em>Keypad</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vendingMachineUAQ.impl.KeypadImpl
		 * @see vendingMachineUAQ.impl.VendingMachineUAQPackageImpl#getKeypad()
		 * @generated
		 */
		EClass KEYPAD = eINSTANCE.getKeypad();

		/**
		 * The meta object literal for the '<em><b>Input</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KEYPAD__INPUT = eINSTANCE.getKeypad_Input();

		/**
		 * The meta object literal for the '{@link vendingMachineUAQ.impl.HasOperationImpl <em>Has Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vendingMachineUAQ.impl.HasOperationImpl
		 * @see vendingMachineUAQ.impl.VendingMachineUAQPackageImpl#getHasOperation()
		 * @generated
		 */
		EClass HAS_OPERATION = eINSTANCE.getHasOperation();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HAS_OPERATION__OPERATION = eINSTANCE.getHasOperation_Operation();

		/**
		 * The meta object literal for the '{@link vendingMachineUAQ.impl.ItemProcessorImpl <em>Item Processor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vendingMachineUAQ.impl.ItemProcessorImpl
		 * @see vendingMachineUAQ.impl.VendingMachineUAQPackageImpl#getItemProcessor()
		 * @generated
		 */
		EClass ITEM_PROCESSOR = eINSTANCE.getItemProcessor();

		/**
		 * The meta object literal for the '<em><b>State</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ITEM_PROCESSOR__STATE = eINSTANCE.getItemProcessor_State();

		/**
		 * The meta object literal for the '<em><b>Current Stage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITEM_PROCESSOR__CURRENT_STAGE = eINSTANCE.getItemProcessor_CurrentStage();

		/**
		 * The meta object literal for the '{@link vendingMachineUAQ.impl.StateImpl <em>State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vendingMachineUAQ.impl.StateImpl
		 * @see vendingMachineUAQ.impl.VendingMachineUAQPackageImpl#getState()
		 * @generated
		 */
		EClass STATE = eINSTANCE.getState();

		/**
		 * The meta object literal for the '<em><b>Stage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATE__STAGE = eINSTANCE.getState_Stage();

		/**
		 * The meta object literal for the '{@link vendingMachineUAQ.impl.PaymentProcessorImpl <em>Payment Processor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vendingMachineUAQ.impl.PaymentProcessorImpl
		 * @see vendingMachineUAQ.impl.VendingMachineUAQPackageImpl#getPaymentProcessor()
		 * @generated
		 */
		EClass PAYMENT_PROCESSOR = eINSTANCE.getPaymentProcessor();

		/**
		 * The meta object literal for the '<em><b>Amound</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYMENT_PROCESSOR__AMOUND = eINSTANCE.getPaymentProcessor_Amound();

		/**
		 * The meta object literal for the '<em><b>Payment Method</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYMENT_PROCESSOR__PAYMENT_METHOD = eINSTANCE.getPaymentProcessor_PaymentMethod();

		/**
		 * The meta object literal for the '<em><b>State</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAYMENT_PROCESSOR__STATE = eINSTANCE.getPaymentProcessor_State();

		/**
		 * The meta object literal for the '<em><b>Is Payment Complete</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PAYMENT_PROCESSOR___IS_PAYMENT_COMPLETE = eINSTANCE.getPaymentProcessor__IsPaymentComplete();

		/**
		 * The meta object literal for the '{@link vendingMachineUAQ.impl.ItemGroupImpl <em>Item Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vendingMachineUAQ.impl.ItemGroupImpl
		 * @see vendingMachineUAQ.impl.VendingMachineUAQPackageImpl#getItemGroup()
		 * @generated
		 */
		EClass ITEM_GROUP = eINSTANCE.getItemGroup();

		/**
		 * The meta object literal for the '<em><b>Quantity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITEM_GROUP__QUANTITY = eINSTANCE.getItemGroup_Quantity();

		/**
		 * The meta object literal for the '<em><b>Price</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITEM_GROUP__PRICE = eINSTANCE.getItemGroup_Price();

		/**
		 * The meta object literal for the '<em><b>Image</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITEM_GROUP__IMAGE = eINSTANCE.getItemGroup_Image();

		/**
		 * The meta object literal for the '<em><b>Items</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ITEM_GROUP__ITEMS = eINSTANCE.getItemGroup_Items();

		/**
		 * The meta object literal for the '<em><b>Positive Quantity</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ITEM_GROUP___POSITIVE_QUANTITY__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getItemGroup__PositiveQuantity__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link vendingMachineUAQ.impl.ItemImpl <em>Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vendingMachineUAQ.impl.ItemImpl
		 * @see vendingMachineUAQ.impl.VendingMachineUAQPackageImpl#getItem()
		 * @generated
		 */
		EClass ITEM = eINSTANCE.getItem();

		/**
		 * The meta object literal for the '<em><b>Expiry</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITEM__EXPIRY = eINSTANCE.getItem_Expiry();

		/**
		 * The meta object literal for the '<em><b>Item Group</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ITEM__ITEM_GROUP = eINSTANCE.getItem_ItemGroup();

		/**
		 * The meta object literal for the '{@link vendingMachineUAQ.impl.InventoryImpl <em>Inventory</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vendingMachineUAQ.impl.InventoryImpl
		 * @see vendingMachineUAQ.impl.VendingMachineUAQPackageImpl#getInventory()
		 * @generated
		 */
		EClass INVENTORY = eINSTANCE.getInventory();

		/**
		 * The meta object literal for the '<em><b>Item Groups</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVENTORY__ITEM_GROUPS = eINSTANCE.getInventory_ItemGroups();

		/**
		 * The meta object literal for the '<em><b>Capacity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVENTORY__CAPACITY = eINSTANCE.getInventory_Capacity();

		/**
		 * The meta object literal for the '<em><b>Last Restocked</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVENTORY__LAST_RESTOCKED = eINSTANCE.getInventory_LastRestocked();

		/**
		 * The meta object literal for the '<em><b>Available Slots</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVENTORY__AVAILABLE_SLOTS = eINSTANCE.getInventory_AvailableSlots();

		/**
		 * The meta object literal for the '<em><b>Calculate Total Value</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INVENTORY___CALCULATE_TOTAL_VALUE = eINSTANCE.getInventory__CalculateTotalValue();

		/**
		 * The meta object literal for the '<em><b>Non Negative Capacity</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INVENTORY___NON_NEGATIVE_CAPACITY__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getInventory__NonNegativeCapacity__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link vendingMachineUAQ.STATE_OPERATIONS <em>STATE OPERATIONS</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vendingMachineUAQ.STATE_OPERATIONS
		 * @see vendingMachineUAQ.impl.VendingMachineUAQPackageImpl#getSTATE_OPERATIONS()
		 * @generated
		 */
		EEnum STATE_OPERATIONS = eINSTANCE.getSTATE_OPERATIONS();

		/**
		 * The meta object literal for the '{@link vendingMachineUAQ.PAYMENT_METHODS <em>PAYMENT METHODS</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vendingMachineUAQ.PAYMENT_METHODS
		 * @see vendingMachineUAQ.impl.VendingMachineUAQPackageImpl#getPAYMENT_METHODS()
		 * @generated
		 */
		EEnum PAYMENT_METHODS = eINSTANCE.getPAYMENT_METHODS();

		/**
		 * The meta object literal for the '{@link vendingMachineUAQ.STATES <em>STATES</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vendingMachineUAQ.STATES
		 * @see vendingMachineUAQ.impl.VendingMachineUAQPackageImpl#getSTATES()
		 * @generated
		 */
		EEnum STATES = eINSTANCE.getSTATES();

	}

} //VendingMachineUAQPackage
