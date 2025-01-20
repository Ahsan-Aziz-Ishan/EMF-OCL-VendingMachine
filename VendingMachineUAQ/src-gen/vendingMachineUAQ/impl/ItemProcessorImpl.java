/**
 */
package vendingMachineUAQ.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import vendingMachineUAQ.ItemProcessor;
import vendingMachineUAQ.STATES;
import vendingMachineUAQ.State;
import vendingMachineUAQ.VendingMachineUAQPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Item Processor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link vendingMachineUAQ.impl.ItemProcessorImpl#getState <em>State</em>}</li>
 *   <li>{@link vendingMachineUAQ.impl.ItemProcessorImpl#getCurrentStage <em>Current Stage</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ItemProcessorImpl extends HasOperationImpl implements ItemProcessor {
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
	 * The default value of the '{@link #getCurrentStage() <em>Current Stage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentStage()
	 * @generated
	 * @ordered
	 */
	protected static final STATES CURRENT_STAGE_EDEFAULT = STATES.SELECT_ITEM;
	/**
	 * The cached value of the '{@link #getCurrentStage() <em>Current Stage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentStage()
	 * @generated
	 * @ordered
	 */
	protected STATES currentStage = CURRENT_STAGE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ItemProcessorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VendingMachineUAQPackage.Literals.ITEM_PROCESSOR;
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
							VendingMachineUAQPackage.ITEM_PROCESSOR__STATE, oldState, state));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VendingMachineUAQPackage.ITEM_PROCESSOR__STATE,
					oldState, state));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public STATES getCurrentStage() {
		return currentStage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCurrentStage(STATES newCurrentStage) {
		STATES oldCurrentStage = currentStage;
		currentStage = newCurrentStage == null ? CURRENT_STAGE_EDEFAULT : newCurrentStage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					VendingMachineUAQPackage.ITEM_PROCESSOR__CURRENT_STAGE, oldCurrentStage, currentStage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case VendingMachineUAQPackage.ITEM_PROCESSOR__STATE:
			if (resolve)
				return getState();
			return basicGetState();
		case VendingMachineUAQPackage.ITEM_PROCESSOR__CURRENT_STAGE:
			return getCurrentStage();
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
		case VendingMachineUAQPackage.ITEM_PROCESSOR__STATE:
			setState((State) newValue);
			return;
		case VendingMachineUAQPackage.ITEM_PROCESSOR__CURRENT_STAGE:
			setCurrentStage((STATES) newValue);
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
		case VendingMachineUAQPackage.ITEM_PROCESSOR__STATE:
			setState((State) null);
			return;
		case VendingMachineUAQPackage.ITEM_PROCESSOR__CURRENT_STAGE:
			setCurrentStage(CURRENT_STAGE_EDEFAULT);
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
		case VendingMachineUAQPackage.ITEM_PROCESSOR__STATE:
			return state != null;
		case VendingMachineUAQPackage.ITEM_PROCESSOR__CURRENT_STAGE:
			return currentStage != CURRENT_STAGE_EDEFAULT;
		}
		return super.eIsSet(featureID);
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
		result.append(" (currentStage: ");
		result.append(currentStage);
		result.append(')');
		return result.toString();
	}

} //ItemProcessorImpl
