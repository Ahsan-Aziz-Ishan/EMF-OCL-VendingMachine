/**
 */
package vendingMachineUAQ;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>PAYMENT METHODS</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see vendingMachineUAQ.VendingMachineUAQPackage#getPAYMENT_METHODS()
 * @model
 * @generated
 */
public enum PAYMENT_METHODS implements Enumerator {
	/**
	 * The '<em><b>Coin</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COIN_VALUE
	 * @generated
	 * @ordered
	 */
	COIN(0, "Coin", "Coin"),

	/**
	 * The '<em><b>App</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #APP_VALUE
	 * @generated
	 * @ordered
	 */
	APP(1, "App", "App"),

	/**
	 * The '<em><b>NFC</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NFC_VALUE
	 * @generated
	 * @ordered
	 */
	NFC(2, "NFC", "NFC");

	/**
	 * The '<em><b>Coin</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COIN
	 * @model name="Coin"
	 * @generated
	 * @ordered
	 */
	public static final int COIN_VALUE = 0;

	/**
	 * The '<em><b>App</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #APP
	 * @model name="App"
	 * @generated
	 * @ordered
	 */
	public static final int APP_VALUE = 1;

	/**
	 * The '<em><b>NFC</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NFC
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NFC_VALUE = 2;

	/**
	 * An array of all the '<em><b>PAYMENT METHODS</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final PAYMENT_METHODS[] VALUES_ARRAY = new PAYMENT_METHODS[] { COIN, APP, NFC, };

	/**
	 * A public read-only list of all the '<em><b>PAYMENT METHODS</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<PAYMENT_METHODS> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>PAYMENT METHODS</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PAYMENT_METHODS get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PAYMENT_METHODS result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>PAYMENT METHODS</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PAYMENT_METHODS getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PAYMENT_METHODS result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>PAYMENT METHODS</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PAYMENT_METHODS get(int value) {
		switch (value) {
		case COIN_VALUE:
			return COIN;
		case APP_VALUE:
			return APP;
		case NFC_VALUE:
			return NFC;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private PAYMENT_METHODS(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLiteral() {
		return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}

} //PAYMENT_METHODS
