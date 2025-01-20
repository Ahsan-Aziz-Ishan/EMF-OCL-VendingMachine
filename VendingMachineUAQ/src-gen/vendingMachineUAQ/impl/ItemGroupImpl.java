/**
 */
package vendingMachineUAQ.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.Map;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.ocl.pivot.evaluation.Executor;
import org.eclipse.ocl.pivot.ids.TypeId;
import org.eclipse.ocl.pivot.library.oclany.OclComparableGreaterThanOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;
import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;
import org.eclipse.ocl.pivot.utilities.PivotUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.IntegerValue;
import vendingMachineUAQ.Item;
import vendingMachineUAQ.ItemGroup;
import vendingMachineUAQ.NamedEntity;
import vendingMachineUAQ.VendingMachineUAQPackage;
import vendingMachineUAQ.VendingMachineUAQTables;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Item Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link vendingMachineUAQ.impl.ItemGroupImpl#getName <em>Name</em>}</li>
 *   <li>{@link vendingMachineUAQ.impl.ItemGroupImpl#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link vendingMachineUAQ.impl.ItemGroupImpl#getPrice <em>Price</em>}</li>
 *   <li>{@link vendingMachineUAQ.impl.ItemGroupImpl#getImage <em>Image</em>}</li>
 *   <li>{@link vendingMachineUAQ.impl.ItemGroupImpl#getItems <em>Items</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ItemGroupImpl extends HasIdImpl implements ItemGroup {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getQuantity() <em>Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantity()
	 * @generated
	 * @ordered
	 */
	protected static final int QUANTITY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getQuantity() <em>Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantity()
	 * @generated
	 * @ordered
	 */
	protected int quantity = QUANTITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getPrice() <em>Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrice()
	 * @generated
	 * @ordered
	 */
	protected static final float PRICE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getPrice() <em>Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrice()
	 * @generated
	 * @ordered
	 */
	protected float price = PRICE_EDEFAULT;

	/**
	 * The default value of the '{@link #getImage() <em>Image</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImage()
	 * @generated
	 * @ordered
	 */
	protected static final String IMAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getImage() <em>Image</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImage()
	 * @generated
	 * @ordered
	 */
	protected String image = IMAGE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getItems() <em>Items</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItems()
	 * @generated
	 * @ordered
	 */
	protected EList<Item> items;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ItemGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VendingMachineUAQPackage.Literals.ITEM_GROUP;
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
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VendingMachineUAQPackage.ITEM_GROUP__NAME, oldName,
					name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getQuantity() {
		return quantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setQuantity(int newQuantity) {
		int oldQuantity = quantity;
		quantity = newQuantity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VendingMachineUAQPackage.ITEM_GROUP__QUANTITY,
					oldQuantity, quantity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public float getPrice() {
		return price;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPrice(float newPrice) {
		float oldPrice = price;
		price = newPrice;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VendingMachineUAQPackage.ITEM_GROUP__PRICE, oldPrice,
					price));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getImage() {
		return image;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setImage(String newImage) {
		String oldImage = image;
		image = newImage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VendingMachineUAQPackage.ITEM_GROUP__IMAGE, oldImage,
					image));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Item> getItems() {
		if (items == null) {
			items = new EObjectContainmentWithInverseEList<Item>(Item.class, this,
					VendingMachineUAQPackage.ITEM_GROUP__ITEMS, VendingMachineUAQPackage.ITEM__ITEM_GROUP);
		}
		return items;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean PositiveQuantity(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "ItemGroup::PositiveQuantity";
		try {
			/**
			 *
			 * inv PositiveQuantity:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let result : Boolean[1] = self.quantity > 0
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					VendingMachineUAQPackage.Literals.ITEM_GROUP___POSITIVE_QUANTITY__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, VendingMachineUAQTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean IF_le;
			if (le) {
				IF_le = true;
			} else {
				final /*@NonInvalid*/ int quantity = this.getQuantity();
				final /*@NonInvalid*/ IntegerValue BOXED_quantity = ValueUtil.integerValueOf(quantity);
				final /*@NonInvalid*/ boolean result = OclComparableGreaterThanOperation.INSTANCE
						.evaluate(executor, BOXED_quantity, VendingMachineUAQTables.INT_0).booleanValue();
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
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case VendingMachineUAQPackage.ITEM_GROUP__ITEMS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getItems()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case VendingMachineUAQPackage.ITEM_GROUP__ITEMS:
			return ((InternalEList<?>) getItems()).basicRemove(otherEnd, msgs);
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
		case VendingMachineUAQPackage.ITEM_GROUP__NAME:
			return getName();
		case VendingMachineUAQPackage.ITEM_GROUP__QUANTITY:
			return getQuantity();
		case VendingMachineUAQPackage.ITEM_GROUP__PRICE:
			return getPrice();
		case VendingMachineUAQPackage.ITEM_GROUP__IMAGE:
			return getImage();
		case VendingMachineUAQPackage.ITEM_GROUP__ITEMS:
			return getItems();
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
		case VendingMachineUAQPackage.ITEM_GROUP__NAME:
			setName((String) newValue);
			return;
		case VendingMachineUAQPackage.ITEM_GROUP__QUANTITY:
			setQuantity((Integer) newValue);
			return;
		case VendingMachineUAQPackage.ITEM_GROUP__PRICE:
			setPrice((Float) newValue);
			return;
		case VendingMachineUAQPackage.ITEM_GROUP__IMAGE:
			setImage((String) newValue);
			return;
		case VendingMachineUAQPackage.ITEM_GROUP__ITEMS:
			getItems().clear();
			getItems().addAll((Collection<? extends Item>) newValue);
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
		case VendingMachineUAQPackage.ITEM_GROUP__NAME:
			setName(NAME_EDEFAULT);
			return;
		case VendingMachineUAQPackage.ITEM_GROUP__QUANTITY:
			setQuantity(QUANTITY_EDEFAULT);
			return;
		case VendingMachineUAQPackage.ITEM_GROUP__PRICE:
			setPrice(PRICE_EDEFAULT);
			return;
		case VendingMachineUAQPackage.ITEM_GROUP__IMAGE:
			setImage(IMAGE_EDEFAULT);
			return;
		case VendingMachineUAQPackage.ITEM_GROUP__ITEMS:
			getItems().clear();
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
		case VendingMachineUAQPackage.ITEM_GROUP__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case VendingMachineUAQPackage.ITEM_GROUP__QUANTITY:
			return quantity != QUANTITY_EDEFAULT;
		case VendingMachineUAQPackage.ITEM_GROUP__PRICE:
			return price != PRICE_EDEFAULT;
		case VendingMachineUAQPackage.ITEM_GROUP__IMAGE:
			return IMAGE_EDEFAULT == null ? image != null : !IMAGE_EDEFAULT.equals(image);
		case VendingMachineUAQPackage.ITEM_GROUP__ITEMS:
			return items != null && !items.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == NamedEntity.class) {
			switch (derivedFeatureID) {
			case VendingMachineUAQPackage.ITEM_GROUP__NAME:
				return VendingMachineUAQPackage.NAMED_ENTITY__NAME;
			default:
				return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == NamedEntity.class) {
			switch (baseFeatureID) {
			case VendingMachineUAQPackage.NAMED_ENTITY__NAME:
				return VendingMachineUAQPackage.ITEM_GROUP__NAME;
			default:
				return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		case VendingMachineUAQPackage.ITEM_GROUP___POSITIVE_QUANTITY__DIAGNOSTICCHAIN_MAP:
			return PositiveQuantity((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
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
		result.append(" (name: ");
		result.append(name);
		result.append(", quantity: ");
		result.append(quantity);
		result.append(", price: ");
		result.append(price);
		result.append(", image: ");
		result.append(image);
		result.append(')');
		return result.toString();
	}

} //ItemGroupImpl
