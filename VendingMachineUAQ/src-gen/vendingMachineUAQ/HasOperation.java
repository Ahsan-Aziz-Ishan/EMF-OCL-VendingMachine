/**
 */
package vendingMachineUAQ;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Has Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link vendingMachineUAQ.HasOperation#getOperation <em>Operation</em>}</li>
 * </ul>
 *
 * @see vendingMachineUAQ.VendingMachineUAQPackage#getHasOperation()
 * @model
 * @generated
 */
public interface HasOperation extends EObject {
	/**
	 * Returns the value of the '<em><b>Operation</b></em>' attribute.
	 * The literals are from the enumeration {@link vendingMachineUAQ.STATE_OPERATIONS}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation</em>' attribute.
	 * @see vendingMachineUAQ.STATE_OPERATIONS
	 * @see #setOperation(STATE_OPERATIONS)
	 * @see vendingMachineUAQ.VendingMachineUAQPackage#getHasOperation_Operation()
	 * @model
	 * @generated
	 */
	STATE_OPERATIONS getOperation();

	/**
	 * Sets the value of the '{@link vendingMachineUAQ.HasOperation#getOperation <em>Operation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation</em>' attribute.
	 * @see vendingMachineUAQ.STATE_OPERATIONS
	 * @see #getOperation()
	 * @generated
	 */
	void setOperation(STATE_OPERATIONS value);

} // HasOperation
