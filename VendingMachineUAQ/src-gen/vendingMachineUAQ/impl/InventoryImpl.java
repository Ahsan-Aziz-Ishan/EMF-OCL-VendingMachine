/**
 */
package vendingMachineUAQ.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.ocl.pivot.evaluation.Executor;
import org.eclipse.ocl.pivot.ids.IdResolver;
import org.eclipse.ocl.pivot.ids.TypeId;
import org.eclipse.ocl.pivot.library.collection.CollectionSumOperation;
import org.eclipse.ocl.pivot.library.numeric.NumericTimesOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableGreaterThanEqualOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;
import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;
import org.eclipse.ocl.pivot.utilities.PivotUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.OrderedSetValue;
import org.eclipse.ocl.pivot.values.RealValue;
import org.eclipse.ocl.pivot.values.SequenceValue;
import org.eclipse.ocl.pivot.values.SequenceValue.Accumulator;
import vendingMachineUAQ.Inventory;
import vendingMachineUAQ.ItemGroup;
import vendingMachineUAQ.VendingMachineUAQPackage;
import vendingMachineUAQ.VendingMachineUAQTables;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Inventory</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link vendingMachineUAQ.impl.InventoryImpl#getItemGroups <em>Item Groups</em>}</li>
 *   <li>{@link vendingMachineUAQ.impl.InventoryImpl#getCapacity <em>Capacity</em>}</li>
 *   <li>{@link vendingMachineUAQ.impl.InventoryImpl#getLastRestocked <em>Last Restocked</em>}</li>
 *   <li>{@link vendingMachineUAQ.impl.InventoryImpl#getAvailableSlots <em>Available Slots</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InventoryImpl extends HasIdImpl implements Inventory {
	/**
	 * The cached value of the '{@link #getItemGroups() <em>Item Groups</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItemGroups()
	 * @generated
	 * @ordered
	 */
	protected EList<ItemGroup> itemGroups;

	/**
	 * The default value of the '{@link #getCapacity() <em>Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapacity()
	 * @generated
	 * @ordered
	 */
	protected static final int CAPACITY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCapacity() <em>Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapacity()
	 * @generated
	 * @ordered
	 */
	protected int capacity = CAPACITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getLastRestocked() <em>Last Restocked</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastRestocked()
	 * @generated
	 * @ordered
	 */
	protected static final Date LAST_RESTOCKED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLastRestocked() <em>Last Restocked</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastRestocked()
	 * @generated
	 * @ordered
	 */
	protected Date lastRestocked = LAST_RESTOCKED_EDEFAULT;

	/**
	 * The default value of the '{@link #getAvailableSlots() <em>Available Slots</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvailableSlots()
	 * @generated
	 * @ordered
	 */
	protected static final int AVAILABLE_SLOTS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getAvailableSlots() <em>Available Slots</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvailableSlots()
	 * @generated
	 * @ordered
	 */
	protected int availableSlots = AVAILABLE_SLOTS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InventoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VendingMachineUAQPackage.Literals.INVENTORY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ItemGroup> getItemGroups() {
		if (itemGroups == null) {
			itemGroups = new EObjectContainmentEList<ItemGroup>(ItemGroup.class, this,
					VendingMachineUAQPackage.INVENTORY__ITEM_GROUPS);
		}
		return itemGroups;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getCapacity() {
		return capacity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCapacity(int newCapacity) {
		int oldCapacity = capacity;
		capacity = newCapacity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VendingMachineUAQPackage.INVENTORY__CAPACITY,
					oldCapacity, capacity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getLastRestocked() {
		return lastRestocked;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLastRestocked(Date newLastRestocked) {
		Date oldLastRestocked = lastRestocked;
		lastRestocked = newLastRestocked;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VendingMachineUAQPackage.INVENTORY__LAST_RESTOCKED,
					oldLastRestocked, lastRestocked));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getAvailableSlots() {
		return availableSlots;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAvailableSlots(int newAvailableSlots) {
		int oldAvailableSlots = availableSlots;
		availableSlots = newAvailableSlots;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VendingMachineUAQPackage.INVENTORY__AVAILABLE_SLOTS,
					oldAvailableSlots, availableSlots));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public float calculateTotalValue() {
		/**
		 * self.itemGroups->collect(g | g.quantity * g.price)->sum()
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
		final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
		final /*@NonInvalid*/ List<ItemGroup> itemGroups = this.getItemGroups();
		final /*@NonInvalid*/ OrderedSetValue BOXED_itemGroups = idResolver
				.createOrderedSetOfAll(VendingMachineUAQTables.ORD_CLSSid_ItemGroup, itemGroups);
		/*@Thrown*/ Accumulator accumulator = ValueUtil
				.createSequenceAccumulatorValue(VendingMachineUAQTables.SEQ_PRIMid_Real);
		Iterator<Object> ITERATOR_g = BOXED_itemGroups.iterator();
		/*@NonInvalid*/ SequenceValue collect;
		while (true) {
			if (!ITERATOR_g.hasNext()) {
				collect = accumulator;
				break;
			}
			/*@NonInvalid*/ ItemGroup g = (ItemGroup) ITERATOR_g.next();
			/**
			 * g.quantity * g.price
			 */
			final /*@NonInvalid*/ int quantity = g.getQuantity();
			final /*@NonInvalid*/ IntegerValue BOXED_quantity = ValueUtil.integerValueOf(quantity);
			final /*@NonInvalid*/ float price = g.getPrice();
			final /*@NonInvalid*/ RealValue BOXED_price = ValueUtil.realValueOf(price);
			final /*@NonInvalid*/ RealValue prod = NumericTimesOperation.INSTANCE.evaluate(BOXED_quantity, BOXED_price);
			//
			accumulator.add(prod);
		}
		final /*@NonInvalid*/ RealValue sum = (RealValue) CollectionSumOperation.INSTANCE.evaluate(executor,
				TypeId.REAL, collect);
		final /*@NonInvalid*/ float ECORE_sum = ValueUtil.floatValueOf(sum);
		return ECORE_sum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean NonNegativeCapacity(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Inventory::NonNegativeCapacity";
		try {
			/**
			 *
			 * inv NonNegativeCapacity:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let result : Boolean[1] = self.capacity >= 0
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					VendingMachineUAQPackage.Literals.INVENTORY___NON_NEGATIVE_CAPACITY__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, VendingMachineUAQTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean IF_le;
			if (le) {
				IF_le = true;
			} else {
				final /*@NonInvalid*/ int capacity = this.getCapacity();
				final /*@NonInvalid*/ IntegerValue BOXED_capacity = ValueUtil.integerValueOf(capacity);
				final /*@NonInvalid*/ boolean result = OclComparableGreaterThanEqualOperation.INSTANCE
						.evaluate(executor, BOXED_capacity, VendingMachineUAQTables.INT_0).booleanValue();
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE
						.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object) null, diagnostics, context,
								(Object) null, severity_0, result, VendingMachineUAQTables.INT_0)
						.booleanValue();
				IF_le = logDiagnostic;
			}
			return IF_le;
		} catch (Throwable e) {
			return ValueUtil.validationFailedDiagnostic(constraintName, this, diagnostics, context, e);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case VendingMachineUAQPackage.INVENTORY__ITEM_GROUPS:
			return ((InternalEList<?>) getItemGroups()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case VendingMachineUAQPackage.INVENTORY__ITEM_GROUPS:
			return getItemGroups();
		case VendingMachineUAQPackage.INVENTORY__CAPACITY:
			return getCapacity();
		case VendingMachineUAQPackage.INVENTORY__LAST_RESTOCKED:
			return getLastRestocked();
		case VendingMachineUAQPackage.INVENTORY__AVAILABLE_SLOTS:
			return getAvailableSlots();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case VendingMachineUAQPackage.INVENTORY__ITEM_GROUPS:
			getItemGroups().clear();
			getItemGroups().addAll((Collection<? extends ItemGroup>) newValue);
			return;
		case VendingMachineUAQPackage.INVENTORY__CAPACITY:
			setCapacity((Integer) newValue);
			return;
		case VendingMachineUAQPackage.INVENTORY__LAST_RESTOCKED:
			setLastRestocked((Date) newValue);
			return;
		case VendingMachineUAQPackage.INVENTORY__AVAILABLE_SLOTS:
			setAvailableSlots((Integer) newValue);
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
		case VendingMachineUAQPackage.INVENTORY__ITEM_GROUPS:
			getItemGroups().clear();
			return;
		case VendingMachineUAQPackage.INVENTORY__CAPACITY:
			setCapacity(CAPACITY_EDEFAULT);
			return;
		case VendingMachineUAQPackage.INVENTORY__LAST_RESTOCKED:
			setLastRestocked(LAST_RESTOCKED_EDEFAULT);
			return;
		case VendingMachineUAQPackage.INVENTORY__AVAILABLE_SLOTS:
			setAvailableSlots(AVAILABLE_SLOTS_EDEFAULT);
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
		case VendingMachineUAQPackage.INVENTORY__ITEM_GROUPS:
			return itemGroups != null && !itemGroups.isEmpty();
		case VendingMachineUAQPackage.INVENTORY__CAPACITY:
			return capacity != CAPACITY_EDEFAULT;
		case VendingMachineUAQPackage.INVENTORY__LAST_RESTOCKED:
			return LAST_RESTOCKED_EDEFAULT == null ? lastRestocked != null
					: !LAST_RESTOCKED_EDEFAULT.equals(lastRestocked);
		case VendingMachineUAQPackage.INVENTORY__AVAILABLE_SLOTS:
			return availableSlots != AVAILABLE_SLOTS_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case VendingMachineUAQPackage.INVENTORY___CALCULATE_TOTAL_VALUE:
			return calculateTotalValue();
		case VendingMachineUAQPackage.INVENTORY___NON_NEGATIVE_CAPACITY__DIAGNOSTICCHAIN_MAP:
			return NonNegativeCapacity((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
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
		result.append(" (capacity: ");
		result.append(capacity);
		result.append(", lastRestocked: ");
		result.append(lastRestocked);
		result.append(", availableSlots: ");
		result.append(availableSlots);
		result.append(')');
		return result.toString();
	}

} //InventoryImpl
