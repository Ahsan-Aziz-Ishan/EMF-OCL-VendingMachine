/**
 */
package vendingMachineUAQ;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Location</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link vendingMachineUAQ.Location#getLat <em>Lat</em>}</li>
 *   <li>{@link vendingMachineUAQ.Location#getLong <em>Long</em>}</li>
 * </ul>
 *
 * @see vendingMachineUAQ.VendingMachineUAQPackage#getLocation()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='ValidCoordinates'"
 * @generated
 */
public interface Location extends NamedEntity {

	/**
	 * Returns the value of the '<em><b>Lat</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lat</em>' attribute.
	 * @see #setLat(float)
	 * @see vendingMachineUAQ.VendingMachineUAQPackage#getLocation_Lat()
	 * @model required="true"
	 * @generated
	 */
	float getLat();

	/**
	 * Sets the value of the '{@link vendingMachineUAQ.Location#getLat <em>Lat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lat</em>' attribute.
	 * @see #getLat()
	 * @generated
	 */
	void setLat(float value);

	/**
	 * Returns the value of the '<em><b>Long</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Long</em>' attribute.
	 * @see #setLong(float)
	 * @see vendingMachineUAQ.VendingMachineUAQPackage#getLocation_Long()
	 * @model required="true"
	 * @generated
	 */
	float getLong();

	/**
	 * Sets the value of the '{@link vendingMachineUAQ.Location#getLong <em>Long</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Long</em>' attribute.
	 * @see #getLong()
	 * @generated
	 */
	void setLong(float value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.lat &gt;= -90 and self.lat &lt;= 90 and self.long &gt;= -180 and self.long &lt;= 180'"
	 * @generated
	 */
	boolean ValidCoordinates(DiagnosticChain diagnostics, Map<Object, Object> context);
} // Location
