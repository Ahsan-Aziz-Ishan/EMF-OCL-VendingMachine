/**
 */
package vendingMachineUAQ;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Item Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link vendingMachineUAQ.ItemGroup#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link vendingMachineUAQ.ItemGroup#getPrice <em>Price</em>}</li>
 *   <li>{@link vendingMachineUAQ.ItemGroup#getImage <em>Image</em>}</li>
 *   <li>{@link vendingMachineUAQ.ItemGroup#getItems <em>Items</em>}</li>
 * </ul>
 *
 * @see vendingMachineUAQ.VendingMachineUAQPackage#getItemGroup()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='PositiveQuantity'"
 * @generated
 */
public interface ItemGroup extends HasId, NamedEntity {
	/**
	 * Returns the value of the '<em><b>Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quantity</em>' attribute.
	 * @see #setQuantity(int)
	 * @see vendingMachineUAQ.VendingMachineUAQPackage#getItemGroup_Quantity()
	 * @model required="true"
	 * @generated
	 */
	int getQuantity();

	/**
	 * Sets the value of the '{@link vendingMachineUAQ.ItemGroup#getQuantity <em>Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantity</em>' attribute.
	 * @see #getQuantity()
	 * @generated
	 */
	void setQuantity(int value);

	/**
	 * Returns the value of the '<em><b>Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Price</em>' attribute.
	 * @see #setPrice(float)
	 * @see vendingMachineUAQ.VendingMachineUAQPackage#getItemGroup_Price()
	 * @model required="true"
	 * @generated
	 */
	float getPrice();

	/**
	 * Sets the value of the '{@link vendingMachineUAQ.ItemGroup#getPrice <em>Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Price</em>' attribute.
	 * @see #getPrice()
	 * @generated
	 */
	void setPrice(float value);

	/**
	 * Returns the value of the '<em><b>Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Image</em>' attribute.
	 * @see #setImage(String)
	 * @see vendingMachineUAQ.VendingMachineUAQPackage#getItemGroup_Image()
	 * @model required="true"
	 * @generated
	 */
	String getImage();

	/**
	 * Sets the value of the '{@link vendingMachineUAQ.ItemGroup#getImage <em>Image</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Image</em>' attribute.
	 * @see #getImage()
	 * @generated
	 */
	void setImage(String value);

	/**
	 * Returns the value of the '<em><b>Items</b></em>' containment reference list.
	 * The list contents are of type {@link vendingMachineUAQ.Item}.
	 * It is bidirectional and its opposite is '{@link vendingMachineUAQ.Item#getItemGroup <em>Item Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Items</em>' containment reference list.
	 * @see vendingMachineUAQ.VendingMachineUAQPackage#getItemGroup_Items()
	 * @see vendingMachineUAQ.Item#getItemGroup
	 * @model opposite="itemGroup" containment="true"
	 * @generated
	 */
	EList<Item> getItems();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.quantity &gt; 0'"
	 * @generated
	 */
	boolean PositiveQuantity(DiagnosticChain diagnostics, Map<Object, Object> context);

} // ItemGroup
