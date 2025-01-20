/**
 */
package vendingMachineUAQ;

import java.util.Date;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link vendingMachineUAQ.Item#getExpiry <em>Expiry</em>}</li>
 *   <li>{@link vendingMachineUAQ.Item#getItemGroup <em>Item Group</em>}</li>
 * </ul>
 *
 * @see vendingMachineUAQ.VendingMachineUAQPackage#getItem()
 * @model
 * @generated
 */
public interface Item extends HasId {
	/**
	 * Returns the value of the '<em><b>Expiry</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expiry</em>' attribute.
	 * @see #setExpiry(Date)
	 * @see vendingMachineUAQ.VendingMachineUAQPackage#getItem_Expiry()
	 * @model required="true"
	 * @generated
	 */
	Date getExpiry();

	/**
	 * Sets the value of the '{@link vendingMachineUAQ.Item#getExpiry <em>Expiry</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expiry</em>' attribute.
	 * @see #getExpiry()
	 * @generated
	 */
	void setExpiry(Date value);

	/**
	 * Returns the value of the '<em><b>Item Group</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link vendingMachineUAQ.ItemGroup#getItems <em>Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Item Group</em>' container reference.
	 * @see #setItemGroup(ItemGroup)
	 * @see vendingMachineUAQ.VendingMachineUAQPackage#getItem_ItemGroup()
	 * @see vendingMachineUAQ.ItemGroup#getItems
	 * @model opposite="items" required="true" transient="false"
	 * @generated
	 */
	ItemGroup getItemGroup();

	/**
	 * Sets the value of the '{@link vendingMachineUAQ.Item#getItemGroup <em>Item Group</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Item Group</em>' container reference.
	 * @see #getItemGroup()
	 * @generated
	 */
	void setItemGroup(ItemGroup value);

} // Item
