/**
 */
package vendingMachineUAQ;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link vendingMachineUAQ.State#getStage <em>Stage</em>}</li>
 * </ul>
 *
 * @see vendingMachineUAQ.VendingMachineUAQPackage#getState()
 * @model
 * @generated
 */
public interface State extends EObject {
	/**
	 * Returns the value of the '<em><b>Stage</b></em>' attribute.
	 * The literals are from the enumeration {@link vendingMachineUAQ.STATES}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stage</em>' attribute.
	 * @see vendingMachineUAQ.STATES
	 * @see #setStage(STATES)
	 * @see vendingMachineUAQ.VendingMachineUAQPackage#getState_Stage()
	 * @model required="true"
	 * @generated
	 */
	STATES getStage();

	/**
	 * Sets the value of the '{@link vendingMachineUAQ.State#getStage <em>Stage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stage</em>' attribute.
	 * @see vendingMachineUAQ.STATES
	 * @see #getStage()
	 * @generated
	 */
	void setStage(STATES value);

} // State
