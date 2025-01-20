/**
 */
package vendingMachineUAQ.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import vendingMachineUAQ.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see vendingMachineUAQ.VendingMachineUAQPackage
 * @generated
 */
public class VendingMachineUAQSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static VendingMachineUAQPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VendingMachineUAQSwitch() {
		if (modelPackage == null) {
			modelPackage = VendingMachineUAQPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case VendingMachineUAQPackage.NAMED_ENTITY: {
			NamedEntity namedEntity = (NamedEntity) theEObject;
			T result = caseNamedEntity(namedEntity);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case VendingMachineUAQPackage.VENDING_MACHINE: {
			VendingMachine vendingMachine = (VendingMachine) theEObject;
			T result = caseVendingMachine(vendingMachine);
			if (result == null)
				result = caseNamedEntity(vendingMachine);
			if (result == null)
				result = caseHasId(vendingMachine);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case VendingMachineUAQPackage.LOCATION: {
			Location location = (Location) theEObject;
			T result = caseLocation(location);
			if (result == null)
				result = caseNamedEntity(location);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case VendingMachineUAQPackage.HAS_ID: {
			HasId hasId = (HasId) theEObject;
			T result = caseHasId(hasId);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case VendingMachineUAQPackage.KEYPAD: {
			Keypad keypad = (Keypad) theEObject;
			T result = caseKeypad(keypad);
			if (result == null)
				result = caseHasOperation(keypad);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case VendingMachineUAQPackage.HAS_OPERATION: {
			HasOperation hasOperation = (HasOperation) theEObject;
			T result = caseHasOperation(hasOperation);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case VendingMachineUAQPackage.ITEM_PROCESSOR: {
			ItemProcessor itemProcessor = (ItemProcessor) theEObject;
			T result = caseItemProcessor(itemProcessor);
			if (result == null)
				result = caseHasOperation(itemProcessor);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case VendingMachineUAQPackage.STATE: {
			State state = (State) theEObject;
			T result = caseState(state);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case VendingMachineUAQPackage.PAYMENT_PROCESSOR: {
			PaymentProcessor paymentProcessor = (PaymentProcessor) theEObject;
			T result = casePaymentProcessor(paymentProcessor);
			if (result == null)
				result = caseHasOperation(paymentProcessor);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case VendingMachineUAQPackage.ITEM_GROUP: {
			ItemGroup itemGroup = (ItemGroup) theEObject;
			T result = caseItemGroup(itemGroup);
			if (result == null)
				result = caseHasId(itemGroup);
			if (result == null)
				result = caseNamedEntity(itemGroup);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case VendingMachineUAQPackage.ITEM: {
			Item item = (Item) theEObject;
			T result = caseItem(item);
			if (result == null)
				result = caseHasId(item);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case VendingMachineUAQPackage.INVENTORY: {
			Inventory inventory = (Inventory) theEObject;
			T result = caseInventory(inventory);
			if (result == null)
				result = caseHasId(inventory);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedEntity(NamedEntity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Vending Machine</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Vending Machine</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVendingMachine(VendingMachine object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Location</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Location</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLocation(Location object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Has Id</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Has Id</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHasId(HasId object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Keypad</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Keypad</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKeypad(Keypad object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Has Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Has Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHasOperation(HasOperation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Item Processor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Item Processor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseItemProcessor(ItemProcessor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>State</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>State</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseState(State object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Payment Processor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Payment Processor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePaymentProcessor(PaymentProcessor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Item Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Item Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseItemGroup(ItemGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseItem(Item object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Inventory</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Inventory</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInventory(Inventory object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //VendingMachineUAQSwitch
