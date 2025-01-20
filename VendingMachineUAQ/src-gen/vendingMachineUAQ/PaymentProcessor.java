/**
 */
package vendingMachineUAQ;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Payment Processor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link vendingMachineUAQ.PaymentProcessor#getAmound <em>Amound</em>}</li>
 *   <li>{@link vendingMachineUAQ.PaymentProcessor#getPaymentMethod <em>Payment Method</em>}</li>
 *   <li>{@link vendingMachineUAQ.PaymentProcessor#getState <em>State</em>}</li>
 * </ul>
 *
 * @see vendingMachineUAQ.VendingMachineUAQPackage#getPaymentProcessor()
 * @model
 * @generated
 */
public interface PaymentProcessor extends HasOperation {

	/**
	 * Returns the value of the '<em><b>Amound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Amound</em>' attribute.
	 * @see #setAmound(float)
	 * @see vendingMachineUAQ.VendingMachineUAQPackage#getPaymentProcessor_Amound()
	 * @model required="true"
	 * @generated
	 */
	float getAmound();

	/**
	 * Sets the value of the '{@link vendingMachineUAQ.PaymentProcessor#getAmound <em>Amound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Amound</em>' attribute.
	 * @see #getAmound()
	 * @generated
	 */
	void setAmound(float value);

	/**
	 * Returns the value of the '<em><b>Payment Method</b></em>' attribute.
	 * The literals are from the enumeration {@link vendingMachineUAQ.PAYMENT_METHODS}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Payment Method</em>' attribute.
	 * @see vendingMachineUAQ.PAYMENT_METHODS
	 * @see #setPaymentMethod(PAYMENT_METHODS)
	 * @see vendingMachineUAQ.VendingMachineUAQPackage#getPaymentProcessor_PaymentMethod()
	 * @model required="true"
	 * @generated
	 */
	PAYMENT_METHODS getPaymentMethod();

	/**
	 * Sets the value of the '{@link vendingMachineUAQ.PaymentProcessor#getPaymentMethod <em>Payment Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Payment Method</em>' attribute.
	 * @see vendingMachineUAQ.PAYMENT_METHODS
	 * @see #getPaymentMethod()
	 * @generated
	 */
	void setPaymentMethod(PAYMENT_METHODS value);

	/**
	 * Returns the value of the '<em><b>State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State</em>' reference.
	 * @see #setState(State)
	 * @see vendingMachineUAQ.VendingMachineUAQPackage#getPaymentProcessor_State()
	 * @model required="true"
	 * @generated
	 */
	State getState();

	/**
	 * Sets the value of the '{@link vendingMachineUAQ.PaymentProcessor#getState <em>State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State</em>' reference.
	 * @see #getState()
	 * @generated
	 */
	void setState(State value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.state.stage = STATES::PROCESSING_PAYMENT and not self.paymentMethod.oclIsUndefined()'"
	 * @generated
	 */
	boolean isPaymentComplete();
} // PaymentProcessor
