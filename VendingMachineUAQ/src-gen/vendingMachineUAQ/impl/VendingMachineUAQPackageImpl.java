/**
 */
package vendingMachineUAQ.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.impl.EPackageImpl;

import vendingMachineUAQ.HasId;
import vendingMachineUAQ.HasOperation;
import vendingMachineUAQ.Inventory;
import vendingMachineUAQ.Item;
import vendingMachineUAQ.ItemGroup;
import vendingMachineUAQ.ItemProcessor;
import vendingMachineUAQ.Keypad;
import vendingMachineUAQ.Location;
import vendingMachineUAQ.NamedEntity;
import vendingMachineUAQ.PaymentProcessor;
import vendingMachineUAQ.State;
import vendingMachineUAQ.VendingMachine;
import vendingMachineUAQ.VendingMachineUAQFactory;
import vendingMachineUAQ.VendingMachineUAQPackage;
import vendingMachineUAQ.util.VendingMachineUAQValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class VendingMachineUAQPackageImpl extends EPackageImpl implements VendingMachineUAQPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namedEntityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vendingMachineEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass locationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hasIdEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass keypadEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hasOperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass itemProcessorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass paymentProcessorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass itemGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass itemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inventoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum statE_OPERATIONSEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum paymenT_METHODSEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum statesEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see vendingMachineUAQ.VendingMachineUAQPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private VendingMachineUAQPackageImpl() {
		super(eNS_URI, VendingMachineUAQFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link VendingMachineUAQPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static VendingMachineUAQPackage init() {
		if (isInited)
			return (VendingMachineUAQPackage) EPackage.Registry.INSTANCE.getEPackage(VendingMachineUAQPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredVendingMachineUAQPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		VendingMachineUAQPackageImpl theVendingMachineUAQPackage = registeredVendingMachineUAQPackage instanceof VendingMachineUAQPackageImpl
				? (VendingMachineUAQPackageImpl) registeredVendingMachineUAQPackage
				: new VendingMachineUAQPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theVendingMachineUAQPackage.createPackageContents();

		// Initialize created meta-data
		theVendingMachineUAQPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put(theVendingMachineUAQPackage, new EValidator.Descriptor() {
			@Override
			public EValidator getEValidator() {
				return VendingMachineUAQValidator.INSTANCE;
			}
		});

		// Mark meta-data to indicate it can't be changed
		theVendingMachineUAQPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(VendingMachineUAQPackage.eNS_URI, theVendingMachineUAQPackage);
		return theVendingMachineUAQPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNamedEntity() {
		return namedEntityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNamedEntity_Name() {
		return (EAttribute) namedEntityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVendingMachine() {
		return vendingMachineEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVendingMachine_Location() {
		return (EReference) vendingMachineEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVendingMachine_State() {
		return (EReference) vendingMachineEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVendingMachine_Keypad() {
		return (EReference) vendingMachineEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVendingMachine_PaymentProcessor() {
		return (EReference) vendingMachineEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVendingMachine_ItemProcessor() {
		return (EReference) vendingMachineEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVendingMachine_Inventory() {
		return (EReference) vendingMachineEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLocation() {
		return locationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLocation_Lat() {
		return (EAttribute) locationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLocation_Long() {
		return (EAttribute) locationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getLocation__ValidCoordinates__DiagnosticChain_Map() {
		return locationEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHasId() {
		return hasIdEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHasId_Id() {
		return (EAttribute) hasIdEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getKeypad() {
		return keypadEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getKeypad_Input() {
		return (EAttribute) keypadEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHasOperation() {
		return hasOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHasOperation_Operation() {
		return (EAttribute) hasOperationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getItemProcessor() {
		return itemProcessorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getItemProcessor_State() {
		return (EReference) itemProcessorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getItemProcessor_CurrentStage() {
		return (EAttribute) itemProcessorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getState() {
		return stateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getState_Stage() {
		return (EAttribute) stateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPaymentProcessor() {
		return paymentProcessorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPaymentProcessor_Amound() {
		return (EAttribute) paymentProcessorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPaymentProcessor_PaymentMethod() {
		return (EAttribute) paymentProcessorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPaymentProcessor_State() {
		return (EReference) paymentProcessorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPaymentProcessor__IsPaymentComplete() {
		return paymentProcessorEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getItemGroup() {
		return itemGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getItemGroup_Quantity() {
		return (EAttribute) itemGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getItemGroup_Price() {
		return (EAttribute) itemGroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getItemGroup_Image() {
		return (EAttribute) itemGroupEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getItemGroup_Items() {
		return (EReference) itemGroupEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getItemGroup__PositiveQuantity__DiagnosticChain_Map() {
		return itemGroupEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getItem() {
		return itemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getItem_Expiry() {
		return (EAttribute) itemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getItem_ItemGroup() {
		return (EReference) itemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInventory() {
		return inventoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInventory_ItemGroups() {
		return (EReference) inventoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInventory_Capacity() {
		return (EAttribute) inventoryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInventory_LastRestocked() {
		return (EAttribute) inventoryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInventory_AvailableSlots() {
		return (EAttribute) inventoryEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInventory__CalculateTotalValue() {
		return inventoryEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInventory__NonNegativeCapacity__DiagnosticChain_Map() {
		return inventoryEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getSTATE_OPERATIONS() {
		return statE_OPERATIONSEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getPAYMENT_METHODS() {
		return paymenT_METHODSEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getSTATES() {
		return statesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VendingMachineUAQFactory getVendingMachineUAQFactory() {
		return (VendingMachineUAQFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		namedEntityEClass = createEClass(NAMED_ENTITY);
		createEAttribute(namedEntityEClass, NAMED_ENTITY__NAME);

		vendingMachineEClass = createEClass(VENDING_MACHINE);
		createEReference(vendingMachineEClass, VENDING_MACHINE__LOCATION);
		createEReference(vendingMachineEClass, VENDING_MACHINE__STATE);
		createEReference(vendingMachineEClass, VENDING_MACHINE__KEYPAD);
		createEReference(vendingMachineEClass, VENDING_MACHINE__PAYMENT_PROCESSOR);
		createEReference(vendingMachineEClass, VENDING_MACHINE__ITEM_PROCESSOR);
		createEReference(vendingMachineEClass, VENDING_MACHINE__INVENTORY);

		locationEClass = createEClass(LOCATION);
		createEAttribute(locationEClass, LOCATION__LAT);
		createEAttribute(locationEClass, LOCATION__LONG);
		createEOperation(locationEClass, LOCATION___VALID_COORDINATES__DIAGNOSTICCHAIN_MAP);

		hasIdEClass = createEClass(HAS_ID);
		createEAttribute(hasIdEClass, HAS_ID__ID);

		keypadEClass = createEClass(KEYPAD);
		createEAttribute(keypadEClass, KEYPAD__INPUT);

		hasOperationEClass = createEClass(HAS_OPERATION);
		createEAttribute(hasOperationEClass, HAS_OPERATION__OPERATION);

		itemProcessorEClass = createEClass(ITEM_PROCESSOR);
		createEReference(itemProcessorEClass, ITEM_PROCESSOR__STATE);
		createEAttribute(itemProcessorEClass, ITEM_PROCESSOR__CURRENT_STAGE);

		stateEClass = createEClass(STATE);
		createEAttribute(stateEClass, STATE__STAGE);

		paymentProcessorEClass = createEClass(PAYMENT_PROCESSOR);
		createEAttribute(paymentProcessorEClass, PAYMENT_PROCESSOR__AMOUND);
		createEAttribute(paymentProcessorEClass, PAYMENT_PROCESSOR__PAYMENT_METHOD);
		createEReference(paymentProcessorEClass, PAYMENT_PROCESSOR__STATE);
		createEOperation(paymentProcessorEClass, PAYMENT_PROCESSOR___IS_PAYMENT_COMPLETE);

		itemGroupEClass = createEClass(ITEM_GROUP);
		createEAttribute(itemGroupEClass, ITEM_GROUP__QUANTITY);
		createEAttribute(itemGroupEClass, ITEM_GROUP__PRICE);
		createEAttribute(itemGroupEClass, ITEM_GROUP__IMAGE);
		createEReference(itemGroupEClass, ITEM_GROUP__ITEMS);
		createEOperation(itemGroupEClass, ITEM_GROUP___POSITIVE_QUANTITY__DIAGNOSTICCHAIN_MAP);

		itemEClass = createEClass(ITEM);
		createEAttribute(itemEClass, ITEM__EXPIRY);
		createEReference(itemEClass, ITEM__ITEM_GROUP);

		inventoryEClass = createEClass(INVENTORY);
		createEReference(inventoryEClass, INVENTORY__ITEM_GROUPS);
		createEAttribute(inventoryEClass, INVENTORY__CAPACITY);
		createEAttribute(inventoryEClass, INVENTORY__LAST_RESTOCKED);
		createEAttribute(inventoryEClass, INVENTORY__AVAILABLE_SLOTS);
		createEOperation(inventoryEClass, INVENTORY___CALCULATE_TOTAL_VALUE);
		createEOperation(inventoryEClass, INVENTORY___NON_NEGATIVE_CAPACITY__DIAGNOSTICCHAIN_MAP);

		// Create enums
		statE_OPERATIONSEEnum = createEEnum(STATE_OPERATIONS);
		paymenT_METHODSEEnum = createEEnum(PAYMENT_METHODS);
		statesEEnum = createEEnum(STATES);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		vendingMachineEClass.getESuperTypes().add(this.getNamedEntity());
		vendingMachineEClass.getESuperTypes().add(this.getHasId());
		locationEClass.getESuperTypes().add(this.getNamedEntity());
		keypadEClass.getESuperTypes().add(this.getHasOperation());
		itemProcessorEClass.getESuperTypes().add(this.getHasOperation());
		paymentProcessorEClass.getESuperTypes().add(this.getHasOperation());
		itemGroupEClass.getESuperTypes().add(this.getHasId());
		itemGroupEClass.getESuperTypes().add(this.getNamedEntity());
		itemEClass.getESuperTypes().add(this.getHasId());
		inventoryEClass.getESuperTypes().add(this.getHasId());

		// Initialize classes, features, and operations; add parameters
		initEClass(namedEntityEClass, NamedEntity.class, "NamedEntity", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNamedEntity_Name(), ecorePackage.getEString(), "name", null, 0, 1, NamedEntity.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vendingMachineEClass, VendingMachine.class, "VendingMachine", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVendingMachine_Location(), this.getLocation(), null, "location", null, 0, 1,
				VendingMachine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVendingMachine_State(), this.getState(), null, "state", null, 1, 1, VendingMachine.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVendingMachine_Keypad(), this.getKeypad(), null, "keypad", null, 1, 1, VendingMachine.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVendingMachine_PaymentProcessor(), this.getPaymentProcessor(), null, "paymentProcessor", null,
				1, 1, VendingMachine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVendingMachine_ItemProcessor(), this.getItemProcessor(), null, "itemProcessor", null, 1, 1,
				VendingMachine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVendingMachine_Inventory(), this.getInventory(), null, "inventory", null, 1, 1,
				VendingMachine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(locationEClass, Location.class, "Location", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLocation_Lat(), ecorePackage.getEFloat(), "lat", null, 1, 1, Location.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLocation_Long(), ecorePackage.getEFloat(), "long", null, 1, 1, Location.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getLocation__ValidCoordinates__DiagnosticChain_Map(), ecorePackage.getEBoolean(),
				"ValidCoordinates", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		EGenericType g1 = createEGenericType(ecorePackage.getEMap());
		EGenericType g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(hasIdEClass, HasId.class, "HasId", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHasId_Id(), ecorePackage.getEInt(), "id", null, 1, 1, HasId.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(keypadEClass, Keypad.class, "Keypad", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getKeypad_Input(), ecorePackage.getEString(), "input", null, 0, 1, Keypad.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hasOperationEClass, HasOperation.class, "HasOperation", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHasOperation_Operation(), this.getSTATE_OPERATIONS(), "operation", null, 0, 1,
				HasOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(itemProcessorEClass, ItemProcessor.class, "ItemProcessor", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getItemProcessor_State(), this.getState(), null, "state", null, 1, 1, ItemProcessor.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getItemProcessor_CurrentStage(), this.getSTATES(), "currentStage", null, 1, 1,
				ItemProcessor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(stateEClass, State.class, "State", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getState_Stage(), this.getSTATES(), "stage", null, 1, 1, State.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(paymentProcessorEClass, PaymentProcessor.class, "PaymentProcessor", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPaymentProcessor_Amound(), ecorePackage.getEFloat(), "amound", null, 1, 1,
				PaymentProcessor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getPaymentProcessor_PaymentMethod(), this.getPAYMENT_METHODS(), "paymentMethod", null, 1, 1,
				PaymentProcessor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getPaymentProcessor_State(), this.getState(), null, "state", null, 1, 1, PaymentProcessor.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getPaymentProcessor__IsPaymentComplete(), ecorePackage.getEBoolean(), "isPaymentComplete", 1, 1,
				IS_UNIQUE, IS_ORDERED);

		initEClass(itemGroupEClass, ItemGroup.class, "ItemGroup", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getItemGroup_Quantity(), ecorePackage.getEInt(), "quantity", null, 1, 1, ItemGroup.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getItemGroup_Price(), ecorePackage.getEFloat(), "price", null, 1, 1, ItemGroup.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getItemGroup_Image(), ecorePackage.getEString(), "image", null, 1, 1, ItemGroup.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getItemGroup_Items(), this.getItem(), this.getItem_ItemGroup(), "items", null, 0, -1,
				ItemGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getItemGroup__PositiveQuantity__DiagnosticChain_Map(), ecorePackage.getEBoolean(),
				"PositiveQuantity", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(itemEClass, Item.class, "Item", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getItem_Expiry(), ecorePackage.getEDate(), "expiry", null, 1, 1, Item.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getItem_ItemGroup(), this.getItemGroup(), this.getItemGroup_Items(), "itemGroup", null, 1, 1,
				Item.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(inventoryEClass, Inventory.class, "Inventory", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInventory_ItemGroups(), this.getItemGroup(), null, "itemGroups", null, 0, -1, Inventory.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInventory_Capacity(), ecorePackage.getEInt(), "capacity", null, 1, 1, Inventory.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInventory_LastRestocked(), ecorePackage.getEDate(), "lastRestocked", null, 1, 1,
				Inventory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getInventory_AvailableSlots(), ecorePackage.getEInt(), "availableSlots", null, 1, 1,
				Inventory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEOperation(getInventory__CalculateTotalValue(), ecorePackage.getEFloat(), "calculateTotalValue", 1, 1,
				IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getInventory__NonNegativeCapacity__DiagnosticChain_Map(), ecorePackage.getEBoolean(),
				"NonNegativeCapacity", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(statE_OPERATIONSEEnum, vendingMachineUAQ.STATE_OPERATIONS.class, "STATE_OPERATIONS");
		addEEnumLiteral(statE_OPERATIONSEEnum, vendingMachineUAQ.STATE_OPERATIONS.SELECT_ITEM_COLLECT_COIN);
		addEEnumLiteral(statE_OPERATIONSEEnum, vendingMachineUAQ.STATE_OPERATIONS.SELECT_ITEM_SEND_INPUT);
		addEEnumLiteral(statE_OPERATIONSEEnum, vendingMachineUAQ.STATE_OPERATIONS.PROCESSING_ITEM_PROCESS_ITEM);
		addEEnumLiteral(statE_OPERATIONSEEnum, vendingMachineUAQ.STATE_OPERATIONS.ITEM_DISPATCHED_DISPATCH_CHANGE);
		addEEnumLiteral(statE_OPERATIONSEEnum, vendingMachineUAQ.STATE_OPERATIONS.WAIT_FOR_PAYMENT_COLLECT_COIN);

		initEEnum(paymenT_METHODSEEnum, vendingMachineUAQ.PAYMENT_METHODS.class, "PAYMENT_METHODS");
		addEEnumLiteral(paymenT_METHODSEEnum, vendingMachineUAQ.PAYMENT_METHODS.COIN);
		addEEnumLiteral(paymenT_METHODSEEnum, vendingMachineUAQ.PAYMENT_METHODS.APP);
		addEEnumLiteral(paymenT_METHODSEEnum, vendingMachineUAQ.PAYMENT_METHODS.NFC);

		initEEnum(statesEEnum, vendingMachineUAQ.STATES.class, "STATES");
		addEEnumLiteral(statesEEnum, vendingMachineUAQ.STATES.SELECT_ITEM);
		addEEnumLiteral(statesEEnum, vendingMachineUAQ.STATES.WAIT_FOR_PAYMENT);
		addEEnumLiteral(statesEEnum, vendingMachineUAQ.STATES.PROCESSING_PAYMENT);
		addEEnumLiteral(statesEEnum, vendingMachineUAQ.STATES.PROCESSING_ITEM);
		addEEnumLiteral(statesEEnum, vendingMachineUAQ.STATES.ITEM_DESPATCHED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot
		createPivotAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";
		addAnnotation(this, source, new String[] {});
		addAnnotation(locationEClass, source, new String[] { "constraints", "ValidCoordinates" });
		addAnnotation(itemGroupEClass, source, new String[] { "constraints", "PositiveQuantity" });
		addAnnotation(inventoryEClass, source, new String[] { "constraints", "NonNegativeCapacity" });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createPivotAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot";
		addAnnotation(getLocation__ValidCoordinates__DiagnosticChain_Map(), source, new String[] { "body",
				"self.lat >= -90 and self.lat <= 90 and self.long >= -180 and self.long <= 180" });
		addAnnotation(getPaymentProcessor__IsPaymentComplete(), source, new String[] { "body",
				"self.state.stage = STATES::PROCESSING_PAYMENT and not self.paymentMethod.oclIsUndefined()" });
		addAnnotation(getItemGroup__PositiveQuantity__DiagnosticChain_Map(), source,
				new String[] { "body", "self.quantity > 0" });
		addAnnotation(getInventory__CalculateTotalValue(), source,
				new String[] { "body", "self.itemGroups->collect(g | g.quantity * g.price)->sum()" });
		addAnnotation(getInventory__NonNegativeCapacity__DiagnosticChain_Map(), source,
				new String[] { "body", "self.capacity >= 0" });
	}

} //VendingMachineUAQPackageImpl
