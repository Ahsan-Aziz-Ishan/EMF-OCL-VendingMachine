/**
 */
package vendingMachineUAQ;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Vending Machine</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link vendingMachineUAQ.VendingMachine#getLocation <em>Location</em>}</li>
 *   <li>{@link vendingMachineUAQ.VendingMachine#getState <em>State</em>}</li>
 *   <li>{@link vendingMachineUAQ.VendingMachine#getKeypad <em>Keypad</em>}</li>
 *   <li>{@link vendingMachineUAQ.VendingMachine#getPaymentProcessor <em>Payment Processor</em>}</li>
 *   <li>{@link vendingMachineUAQ.VendingMachine#getItemProcessor <em>Item Processor</em>}</li>
 *   <li>{@link vendingMachineUAQ.VendingMachine#getInventory <em>Inventory</em>}</li>
 * </ul>
 *
 * @see vendingMachineUAQ.VendingMachineUAQPackage#getVendingMachine()
 * @model
 * @generated
 */
public interface VendingMachine extends NamedEntity, HasId {

	/**
	 * Returns the value of the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location</em>' containment reference.
	 * @see #setLocation(Location)
	 * @see vendingMachineUAQ.VendingMachineUAQPackage#getVendingMachine_Location()
	 * @model containment="true"
	 * @generated
	 */
	Location getLocation();

	/**
	 * Sets the value of the '{@link vendingMachineUAQ.VendingMachine#getLocation <em>Location</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' containment reference.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(Location value);

	/**
	 * Returns the value of the '<em><b>State</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State</em>' containment reference.
	 * @see #setState(State)
	 * @see vendingMachineUAQ.VendingMachineUAQPackage#getVendingMachine_State()
	 * @model containment="true" required="true"
	 * @generated
	 */
	State getState();

	/**
	 * Sets the value of the '{@link vendingMachineUAQ.VendingMachine#getState <em>State</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State</em>' containment reference.
	 * @see #getState()
	 * @generated
	 */
	void setState(State value);

	/**
	 * Returns the value of the '<em><b>Keypad</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Keypad</em>' containment reference.
	 * @see #setKeypad(Keypad)
	 * @see vendingMachineUAQ.VendingMachineUAQPackage#getVendingMachine_Keypad()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Keypad getKeypad();

	/**
	 * Sets the value of the '{@link vendingMachineUAQ.VendingMachine#getKeypad <em>Keypad</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Keypad</em>' containment reference.
	 * @see #getKeypad()
	 * @generated
	 */
	void setKeypad(Keypad value);

	/**
	 * Returns the value of the '<em><b>Payment Processor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Payment Processor</em>' containment reference.
	 * @see #setPaymentProcessor(PaymentProcessor)
	 * @see vendingMachineUAQ.VendingMachineUAQPackage#getVendingMachine_PaymentProcessor()
	 * @model containment="true" required="true"
	 * @generated
	 */
	PaymentProcessor getPaymentProcessor();

	/**
	 * Sets the value of the '{@link vendingMachineUAQ.VendingMachine#getPaymentProcessor <em>Payment Processor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Payment Processor</em>' containment reference.
	 * @see #getPaymentProcessor()
	 * @generated
	 */
	void setPaymentProcessor(PaymentProcessor value);

	/**
	 * Returns the value of the '<em><b>Item Processor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Item Processor</em>' containment reference.
	 * @see #setItemProcessor(ItemProcessor)
	 * @see vendingMachineUAQ.VendingMachineUAQPackage#getVendingMachine_ItemProcessor()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ItemProcessor getItemProcessor();

	/**
	 * Sets the value of the '{@link vendingMachineUAQ.VendingMachine#getItemProcessor <em>Item Processor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Item Processor</em>' containment reference.
	 * @see #getItemProcessor()
	 * @generated
	 */
	void setItemProcessor(ItemProcessor value);

	/**
	 * Returns the value of the '<em><b>Inventory</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inventory</em>' containment reference.
	 * @see #setInventory(Inventory)
	 * @see vendingMachineUAQ.VendingMachineUAQPackage#getVendingMachine_Inventory()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Inventory getInventory();

	/**
	 * Sets the value of the '{@link vendingMachineUAQ.VendingMachine#getInventory <em>Inventory</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inventory</em>' containment reference.
	 * @see #getInventory()
	 * @generated
	 */
	void setInventory(Inventory value);
} // VendingMachine
