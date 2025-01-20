/**
 */
package vendingMachineUAQ.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import vendingMachineUAQ.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see vendingMachineUAQ.VendingMachineUAQPackage
 * @generated
 */
public class VendingMachineUAQAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static VendingMachineUAQPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VendingMachineUAQAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = VendingMachineUAQPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VendingMachineUAQSwitch<Adapter> modelSwitch = new VendingMachineUAQSwitch<Adapter>() {
		@Override
		public Adapter caseNamedEntity(NamedEntity object) {
			return createNamedEntityAdapter();
		}

		@Override
		public Adapter caseVendingMachine(VendingMachine object) {
			return createVendingMachineAdapter();
		}

		@Override
		public Adapter caseLocation(Location object) {
			return createLocationAdapter();
		}

		@Override
		public Adapter caseHasId(HasId object) {
			return createHasIdAdapter();
		}

		@Override
		public Adapter caseKeypad(Keypad object) {
			return createKeypadAdapter();
		}

		@Override
		public Adapter caseHasOperation(HasOperation object) {
			return createHasOperationAdapter();
		}

		@Override
		public Adapter caseItemProcessor(ItemProcessor object) {
			return createItemProcessorAdapter();
		}

		@Override
		public Adapter caseState(State object) {
			return createStateAdapter();
		}

		@Override
		public Adapter casePaymentProcessor(PaymentProcessor object) {
			return createPaymentProcessorAdapter();
		}

		@Override
		public Adapter caseItemGroup(ItemGroup object) {
			return createItemGroupAdapter();
		}

		@Override
		public Adapter caseItem(Item object) {
			return createItemAdapter();
		}

		@Override
		public Adapter caseInventory(Inventory object) {
			return createInventoryAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link vendingMachineUAQ.NamedEntity <em>Named Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see vendingMachineUAQ.NamedEntity
	 * @generated
	 */
	public Adapter createNamedEntityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link vendingMachineUAQ.VendingMachine <em>Vending Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see vendingMachineUAQ.VendingMachine
	 * @generated
	 */
	public Adapter createVendingMachineAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link vendingMachineUAQ.Location <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see vendingMachineUAQ.Location
	 * @generated
	 */
	public Adapter createLocationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link vendingMachineUAQ.HasId <em>Has Id</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see vendingMachineUAQ.HasId
	 * @generated
	 */
	public Adapter createHasIdAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link vendingMachineUAQ.Keypad <em>Keypad</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see vendingMachineUAQ.Keypad
	 * @generated
	 */
	public Adapter createKeypadAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link vendingMachineUAQ.HasOperation <em>Has Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see vendingMachineUAQ.HasOperation
	 * @generated
	 */
	public Adapter createHasOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link vendingMachineUAQ.ItemProcessor <em>Item Processor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see vendingMachineUAQ.ItemProcessor
	 * @generated
	 */
	public Adapter createItemProcessorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link vendingMachineUAQ.State <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see vendingMachineUAQ.State
	 * @generated
	 */
	public Adapter createStateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link vendingMachineUAQ.PaymentProcessor <em>Payment Processor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see vendingMachineUAQ.PaymentProcessor
	 * @generated
	 */
	public Adapter createPaymentProcessorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link vendingMachineUAQ.ItemGroup <em>Item Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see vendingMachineUAQ.ItemGroup
	 * @generated
	 */
	public Adapter createItemGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link vendingMachineUAQ.Item <em>Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see vendingMachineUAQ.Item
	 * @generated
	 */
	public Adapter createItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link vendingMachineUAQ.Inventory <em>Inventory</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see vendingMachineUAQ.Inventory
	 * @generated
	 */
	public Adapter createInventoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //VendingMachineUAQAdapterFactory
