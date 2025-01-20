/**
 */
package vendingMachineUAQ;

import java.util.Date;
import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Inventory</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link vendingMachineUAQ.Inventory#getItemGroups <em>Item Groups</em>}</li>
 *   <li>{@link vendingMachineUAQ.Inventory#getCapacity <em>Capacity</em>}</li>
 *   <li>{@link vendingMachineUAQ.Inventory#getLastRestocked <em>Last Restocked</em>}</li>
 *   <li>{@link vendingMachineUAQ.Inventory#getAvailableSlots <em>Available Slots</em>}</li>
 * </ul>
 *
 * @see vendingMachineUAQ.VendingMachineUAQPackage#getInventory()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='NonNegativeCapacity'"
 * @generated
 */
public interface Inventory extends HasId {
	/**
	 * Returns the value of the '<em><b>Item Groups</b></em>' containment reference list.
	 * The list contents are of type {@link vendingMachineUAQ.ItemGroup}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Item Groups</em>' containment reference list.
	 * @see vendingMachineUAQ.VendingMachineUAQPackage#getInventory_ItemGroups()
	 * @model containment="true"
	 * @generated
	 */
	EList<ItemGroup> getItemGroups();

	/**
	 * Returns the value of the '<em><b>Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Capacity</em>' attribute.
	 * @see #setCapacity(int)
	 * @see vendingMachineUAQ.VendingMachineUAQPackage#getInventory_Capacity()
	 * @model required="true"
	 * @generated
	 */
	int getCapacity();

	/**
	 * Sets the value of the '{@link vendingMachineUAQ.Inventory#getCapacity <em>Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Capacity</em>' attribute.
	 * @see #getCapacity()
	 * @generated
	 */
	void setCapacity(int value);

	/**
	 * Returns the value of the '<em><b>Last Restocked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Restocked</em>' attribute.
	 * @see #setLastRestocked(Date)
	 * @see vendingMachineUAQ.VendingMachineUAQPackage#getInventory_LastRestocked()
	 * @model required="true"
	 * @generated
	 */
	Date getLastRestocked();

	/**
	 * Sets the value of the '{@link vendingMachineUAQ.Inventory#getLastRestocked <em>Last Restocked</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Restocked</em>' attribute.
	 * @see #getLastRestocked()
	 * @generated
	 */
	void setLastRestocked(Date value);

	/**
	 * Returns the value of the '<em><b>Available Slots</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Available Slots</em>' attribute.
	 * @see #setAvailableSlots(int)
	 * @see vendingMachineUAQ.VendingMachineUAQPackage#getInventory_AvailableSlots()
	 * @model required="true"
	 * @generated
	 */
	int getAvailableSlots();

	/**
	 * Sets the value of the '{@link vendingMachineUAQ.Inventory#getAvailableSlots <em>Available Slots</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Available Slots</em>' attribute.
	 * @see #getAvailableSlots()
	 * @generated
	 */
	void setAvailableSlots(int value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.itemGroups-&gt;collect(g | g.quantity * g.price)-&gt;sum()'"
	 * @generated
	 */
	float calculateTotalValue();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.capacity &gt;= 0'"
	 * @generated
	 */
	boolean NonNegativeCapacity(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Inventory
