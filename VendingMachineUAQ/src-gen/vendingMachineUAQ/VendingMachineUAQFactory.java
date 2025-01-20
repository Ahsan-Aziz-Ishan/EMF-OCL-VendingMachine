/**
 */
package vendingMachineUAQ;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see vendingMachineUAQ.VendingMachineUAQPackage
 * @generated
 */
public interface VendingMachineUAQFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	VendingMachineUAQFactory eINSTANCE = vendingMachineUAQ.impl.VendingMachineUAQFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Vending Machine</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Vending Machine</em>'.
	 * @generated
	 */
	VendingMachine createVendingMachine();

	/**
	 * Returns a new object of class '<em>Location</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Location</em>'.
	 * @generated
	 */
	Location createLocation();

	/**
	 * Returns a new object of class '<em>Keypad</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Keypad</em>'.
	 * @generated
	 */
	Keypad createKeypad();

	/**
	 * Returns a new object of class '<em>Has Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Has Operation</em>'.
	 * @generated
	 */
	HasOperation createHasOperation();

	/**
	 * Returns a new object of class '<em>Item Processor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Item Processor</em>'.
	 * @generated
	 */
	ItemProcessor createItemProcessor();

	/**
	 * Returns a new object of class '<em>State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>State</em>'.
	 * @generated
	 */
	State createState();

	/**
	 * Returns a new object of class '<em>Payment Processor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Payment Processor</em>'.
	 * @generated
	 */
	PaymentProcessor createPaymentProcessor();

	/**
	 * Returns a new object of class '<em>Item Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Item Group</em>'.
	 * @generated
	 */
	ItemGroup createItemGroup();

	/**
	 * Returns a new object of class '<em>Item</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Item</em>'.
	 * @generated
	 */
	Item createItem();

	/**
	 * Returns a new object of class '<em>Inventory</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Inventory</em>'.
	 * @generated
	 */
	Inventory createInventory();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	VendingMachineUAQPackage getVendingMachineUAQPackage();

} //VendingMachineUAQFactory
