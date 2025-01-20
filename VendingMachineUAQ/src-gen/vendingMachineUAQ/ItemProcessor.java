/**
 */
package vendingMachineUAQ;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Item Processor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link vendingMachineUAQ.ItemProcessor#getState <em>State</em>}</li>
 *   <li>{@link vendingMachineUAQ.ItemProcessor#getCurrentStage <em>Current Stage</em>}</li>
 * </ul>
 *
 * @see vendingMachineUAQ.VendingMachineUAQPackage#getItemProcessor()
 * @model
 * @generated
 */
public interface ItemProcessor extends HasOperation {

	/**
	 * Returns the value of the '<em><b>State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State</em>' reference.
	 * @see #setState(State)
	 * @see vendingMachineUAQ.VendingMachineUAQPackage#getItemProcessor_State()
	 * @model required="true"
	 * @generated
	 */
	State getState();

	/**
	 * Sets the value of the '{@link vendingMachineUAQ.ItemProcessor#getState <em>State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State</em>' reference.
	 * @see #getState()
	 * @generated
	 */
	void setState(State value);

	/**
	 * Returns the value of the '<em><b>Current Stage</b></em>' attribute.
	 * The literals are from the enumeration {@link vendingMachineUAQ.STATES}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current Stage</em>' attribute.
	 * @see vendingMachineUAQ.STATES
	 * @see #setCurrentStage(STATES)
	 * @see vendingMachineUAQ.VendingMachineUAQPackage#getItemProcessor_CurrentStage()
	 * @model required="true"
	 * @generated
	 */
	STATES getCurrentStage();

	/**
	 * Sets the value of the '{@link vendingMachineUAQ.ItemProcessor#getCurrentStage <em>Current Stage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current Stage</em>' attribute.
	 * @see vendingMachineUAQ.STATES
	 * @see #getCurrentStage()
	 * @generated
	 */
	void setCurrentStage(STATES value);
} // ItemProcessor
