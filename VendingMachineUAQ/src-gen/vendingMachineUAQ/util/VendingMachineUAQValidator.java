/**
 */
package vendingMachineUAQ.util;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import vendingMachineUAQ.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see vendingMachineUAQ.VendingMachineUAQPackage
 * @generated
 */
public class VendingMachineUAQValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final VendingMachineUAQValidator INSTANCE = new VendingMachineUAQValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "vendingMachineUAQ";

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Valid Coordinates' of 'Location'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int LOCATION__VALID_COORDINATES = 1;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Positive Quantity' of 'Item Group'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ITEM_GROUP__POSITIVE_QUANTITY = 2;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Non Negative Capacity' of 'Inventory'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int INVENTORY__NON_NEGATIVE_CAPACITY = 3;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 3;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VendingMachineUAQValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
		return VendingMachineUAQPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		switch (classifierID) {
		case VendingMachineUAQPackage.NAMED_ENTITY:
			return validateNamedEntity((NamedEntity) value, diagnostics, context);
		case VendingMachineUAQPackage.VENDING_MACHINE:
			return validateVendingMachine((VendingMachine) value, diagnostics, context);
		case VendingMachineUAQPackage.LOCATION:
			return validateLocation((Location) value, diagnostics, context);
		case VendingMachineUAQPackage.HAS_ID:
			return validateHasId((HasId) value, diagnostics, context);
		case VendingMachineUAQPackage.KEYPAD:
			return validateKeypad((Keypad) value, diagnostics, context);
		case VendingMachineUAQPackage.HAS_OPERATION:
			return validateHasOperation((HasOperation) value, diagnostics, context);
		case VendingMachineUAQPackage.ITEM_PROCESSOR:
			return validateItemProcessor((ItemProcessor) value, diagnostics, context);
		case VendingMachineUAQPackage.STATE:
			return validateState((State) value, diagnostics, context);
		case VendingMachineUAQPackage.PAYMENT_PROCESSOR:
			return validatePaymentProcessor((PaymentProcessor) value, diagnostics, context);
		case VendingMachineUAQPackage.ITEM_GROUP:
			return validateItemGroup((ItemGroup) value, diagnostics, context);
		case VendingMachineUAQPackage.ITEM:
			return validateItem((Item) value, diagnostics, context);
		case VendingMachineUAQPackage.INVENTORY:
			return validateInventory((Inventory) value, diagnostics, context);
		case VendingMachineUAQPackage.STATE_OPERATIONS:
			return validateSTATE_OPERATIONS((STATE_OPERATIONS) value, diagnostics, context);
		case VendingMachineUAQPackage.PAYMENT_METHODS:
			return validatePAYMENT_METHODS((PAYMENT_METHODS) value, diagnostics, context);
		case VendingMachineUAQPackage.STATES:
			return validateSTATES((STATES) value, diagnostics, context);
		default:
			return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNamedEntity(NamedEntity namedEntity, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(namedEntity, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVendingMachine(VendingMachine vendingMachine, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(vendingMachine, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLocation(Location location, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(location, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(location, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(location, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(location, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(location, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(location, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(location, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(location, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(location, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateLocation_ValidCoordinates(location, diagnostics, context);
		return result;
	}

	/**
	 * Validates the ValidCoordinates constraint of '<em>Location</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLocation_ValidCoordinates(Location location, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return location.ValidCoordinates(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHasId(HasId hasId, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(hasId, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateKeypad(Keypad keypad, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(keypad, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHasOperation(HasOperation hasOperation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(hasOperation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateItemProcessor(ItemProcessor itemProcessor, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(itemProcessor, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateState(State state, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(state, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePaymentProcessor(PaymentProcessor paymentProcessor, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(paymentProcessor, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateItemGroup(ItemGroup itemGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(itemGroup, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(itemGroup, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(itemGroup, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(itemGroup, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(itemGroup, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(itemGroup, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(itemGroup, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(itemGroup, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(itemGroup, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateItemGroup_PositiveQuantity(itemGroup, diagnostics, context);
		return result;
	}

	/**
	 * Validates the PositiveQuantity constraint of '<em>Item Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateItemGroup_PositiveQuantity(ItemGroup itemGroup, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return itemGroup.PositiveQuantity(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateItem(Item item, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(item, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInventory(Inventory inventory, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(inventory, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(inventory, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(inventory, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(inventory, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(inventory, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(inventory, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(inventory, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(inventory, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(inventory, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateInventory_NonNegativeCapacity(inventory, diagnostics, context);
		return result;
	}

	/**
	 * Validates the NonNegativeCapacity constraint of '<em>Inventory</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInventory_NonNegativeCapacity(Inventory inventory, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return inventory.NonNegativeCapacity(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSTATE_OPERATIONS(STATE_OPERATIONS statE_OPERATIONS, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePAYMENT_METHODS(PAYMENT_METHODS paymenT_METHODS, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSTATES(STATES states, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //VendingMachineUAQValidator
