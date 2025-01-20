/**
 */
package vendingMachineUAQ.impl;

import java.lang.reflect.InvocationTargetException;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.ocl.pivot.ids.EnumerationLiteralId;
import org.eclipse.ocl.pivot.utilities.ClassUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.InvalidValueException;
import vendingMachineUAQ.PAYMENT_METHODS;
import vendingMachineUAQ.PaymentProcessor;
import vendingMachineUAQ.STATES;
import vendingMachineUAQ.State;
import vendingMachineUAQ.VendingMachineUAQPackage;
import vendingMachineUAQ.VendingMachineUAQTables;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Payment Processor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link vendingMachineUAQ.impl.PaymentProcessorImpl#getAmound <em>Amound</em>}</li>
 *   <li>{@link vendingMachineUAQ.impl.PaymentProcessorImpl#getPaymentMethod <em>Payment Method</em>}</li>
 *   <li>{@link vendingMachineUAQ.impl.PaymentProcessorImpl#getState <em>State</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PaymentProcessorImpl extends HasOperationImpl implements PaymentProcessor {
	/**
	 * The default value of the '{@link #getAmound() <em>Amound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmound()
	 * @generated
	 * @ordered
	 */
	protected static final float AMOUND_EDEFAULT = 0.0F;
	/**
	 * The cached value of the '{@link #getAmound() <em>Amound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmound()
	 * @generated
	 * @ordered
	 */
	protected float amound = AMOUND_EDEFAULT;
	/**
	 * The default value of the '{@link #getPaymentMethod() <em>Payment Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaymentMethod()
	 * @generated
	 * @ordered
	 */
	protected static final PAYMENT_METHODS PAYMENT_METHOD_EDEFAULT = PAYMENT_METHODS.COIN;
	/**
	 * The cached value of the '{@link #getPaymentMethod() <em>Payment Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaymentMethod()
	 * @generated
	 * @ordered
	 */
	protected PAYMENT_METHODS paymentMethod = PAYMENT_METHOD_EDEFAULT;
	/**
	 * The cached value of the '{@link #getState() <em>State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected State state;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PaymentProcessorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VendingMachineUAQPackage.Literals.PAYMENT_PROCESSOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public float getAmound() {
		return amound;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAmound(float newAmound) {
		float oldAmound = amound;
		amound = newAmound;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VendingMachineUAQPackage.PAYMENT_PROCESSOR__AMOUND,
					oldAmound, amound));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PAYMENT_METHODS getPaymentMethod() {
		return paymentMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPaymentMethod(PAYMENT_METHODS newPaymentMethod) {
		PAYMENT_METHODS oldPaymentMethod = paymentMethod;
		paymentMethod = newPaymentMethod == null ? PAYMENT_METHOD_EDEFAULT : newPaymentMethod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					VendingMachineUAQPackage.PAYMENT_PROCESSOR__PAYMENT_METHOD, oldPaymentMethod, paymentMethod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public State getState() {
		if (state != null && state.eIsProxy()) {
			InternalEObject oldState = (InternalEObject) state;
			state = (State) eResolveProxy(oldState);
			if (state != oldState) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							VendingMachineUAQPackage.PAYMENT_PROCESSOR__STATE, oldState, state));
			}
		}
		return state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State basicGetState() {
		return state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setState(State newState) {
		State oldState = state;
		state = newState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VendingMachineUAQPackage.PAYMENT_PROCESSOR__STATE,
					oldState, state));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isPaymentComplete() {
		/**
		 * self.state.stage = STATES::PROCESSING_PAYMENT and
		 * not self.paymentMethod.oclIsUndefined()
		 */
		final /*@NonInvalid*/ State state = this.getState();
		final /*@NonInvalid*/ STATES stage = state.getStage();
		final /*@NonInvalid*/ EnumerationLiteralId BOXED_stage = VendingMachineUAQTables.ENUMid_STATES
				.getEnumerationLiteralId(ClassUtil.nonNullState(stage.getName()));
		final /*@NonInvalid*/ boolean eq = BOXED_stage == VendingMachineUAQTables.ELITid_PROCESSING_PAYMENT;
		final /*@Thrown*/ Boolean and;
		if (!eq) {
			and = ValueUtil.FALSE_VALUE;
		} else {
			final /*@NonInvalid*/ Boolean not = ValueUtil.TRUE_VALUE;
			if (not == ValueUtil.FALSE_VALUE) {
				and = ValueUtil.FALSE_VALUE;
			} else {
				if (not == null) {
					and = null;
				} else {
					and = ValueUtil.TRUE_VALUE;
				}
			}
		}
		if (and == null) {
			throw new InvalidValueException(
					"Null body for \'vendingMachineUAQ::PaymentProcessor::isPaymentComplete() : Boolean[1]\'");
		}
		return and;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case VendingMachineUAQPackage.PAYMENT_PROCESSOR__AMOUND:
			return getAmound();
		case VendingMachineUAQPackage.PAYMENT_PROCESSOR__PAYMENT_METHOD:
			return getPaymentMethod();
		case VendingMachineUAQPackage.PAYMENT_PROCESSOR__STATE:
			if (resolve)
				return getState();
			return basicGetState();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case VendingMachineUAQPackage.PAYMENT_PROCESSOR__AMOUND:
			setAmound((Float) newValue);
			return;
		case VendingMachineUAQPackage.PAYMENT_PROCESSOR__PAYMENT_METHOD:
			setPaymentMethod((PAYMENT_METHODS) newValue);
			return;
		case VendingMachineUAQPackage.PAYMENT_PROCESSOR__STATE:
			setState((State) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case VendingMachineUAQPackage.PAYMENT_PROCESSOR__AMOUND:
			setAmound(AMOUND_EDEFAULT);
			return;
		case VendingMachineUAQPackage.PAYMENT_PROCESSOR__PAYMENT_METHOD:
			setPaymentMethod(PAYMENT_METHOD_EDEFAULT);
			return;
		case VendingMachineUAQPackage.PAYMENT_PROCESSOR__STATE:
			setState((State) null);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case VendingMachineUAQPackage.PAYMENT_PROCESSOR__AMOUND:
			return amound != AMOUND_EDEFAULT;
		case VendingMachineUAQPackage.PAYMENT_PROCESSOR__PAYMENT_METHOD:
			return paymentMethod != PAYMENT_METHOD_EDEFAULT;
		case VendingMachineUAQPackage.PAYMENT_PROCESSOR__STATE:
			return state != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case VendingMachineUAQPackage.PAYMENT_PROCESSOR___IS_PAYMENT_COMPLETE:
			return isPaymentComplete();
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (amound: ");
		result.append(amound);
		result.append(", paymentMethod: ");
		result.append(paymentMethod);
		result.append(')');
		return result.toString();
	}

} //PaymentProcessorImpl
