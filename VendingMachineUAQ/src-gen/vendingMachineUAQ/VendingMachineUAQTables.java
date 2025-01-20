/*******************************************************************************
 *************************************************************************
 * This code is 100% auto-generated
 * from:
 *   /VendingMachineUAQ/model/vendingMachineUAQ.ecore
 * using:
 *   /VendingMachineUAQ/model/vendingMachineUAQ.genmodel
 *   org.eclipse.ocl.examples.codegen.oclinecore.OCLinEcoreTables
 *
 * Do not edit it.
 *******************************************************************************/
package vendingMachineUAQ;

import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.ocl.pivot.TemplateParameters;
import org.eclipse.ocl.pivot.ids.ClassId;
import org.eclipse.ocl.pivot.ids.CollectionTypeId;
import org.eclipse.ocl.pivot.ids.DataTypeId;
import org.eclipse.ocl.pivot.ids.EnumerationId;
import org.eclipse.ocl.pivot.ids.EnumerationLiteralId;
import org.eclipse.ocl.pivot.ids.IdManager;
import org.eclipse.ocl.pivot.ids.NsURIPackageId;
import org.eclipse.ocl.pivot.ids.TypeId;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorEnumeration;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorEnumerationLiteral;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorPackage;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorProperty;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorType;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreLibraryOppositeProperty;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorFragment;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorOperation;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorProperty;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorPropertyWithImplementation;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorStandardLibrary;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorType;
import org.eclipse.ocl.pivot.oclstdlib.OCLstdlibTables;
import org.eclipse.ocl.pivot.utilities.AbstractTables;
import org.eclipse.ocl.pivot.utilities.TypeUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.IntegerValue;
// import vendingMachineUAQ.VendingMachineUAQPackage;
// import vendingMachineUAQ.VendingMachineUAQTables;

/**
 * VendingMachineUAQTables provides the dispatch tables for the vendingMachineUAQ for use by the OCL dispatcher.
 *
 * In order to ensure correct static initialization, a top level class element must be accessed
 * before any nested class element. Therefore an access to PACKAGE.getClass() is recommended.
 */
public class VendingMachineUAQTables extends AbstractTables
{
	static {
		Init.initStart();
	}

	/**
	 *	The package descriptor for the package.
	 */
	public static final EcoreExecutorPackage PACKAGE = new EcoreExecutorPackage(VendingMachineUAQPackage.eINSTANCE);

	/**
	 *	The library of all packages and types.
	 */
	public static final ExecutorStandardLibrary LIBRARY = OCLstdlibTables.LIBRARY;

	/**
	 *	Constants used by auto-generated code.
	 */
	public static final /*@NonInvalid*/ NsURIPackageId PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore = IdManager.getNsURIPackageId("http://www.eclipse.org/emf/2002/Ecore", null, EcorePackage.eINSTANCE);
	public static final /*@NonInvalid*/ NsURIPackageId PACKid_http_c_s_s_www_example_org_s_vendingMachineUAQ = IdManager.getNsURIPackageId("http://www.example.org/vendingMachineUAQ", null, VendingMachineUAQPackage.eINSTANCE);
	public static final /*@NonInvalid*/ ClassId CLSSid_Inventory = VendingMachineUAQTables.PACKid_http_c_s_s_www_example_org_s_vendingMachineUAQ.getClassId("Inventory", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Item = VendingMachineUAQTables.PACKid_http_c_s_s_www_example_org_s_vendingMachineUAQ.getClassId("Item", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_ItemGroup = VendingMachineUAQTables.PACKid_http_c_s_s_www_example_org_s_vendingMachineUAQ.getClassId("ItemGroup", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_ItemProcessor = VendingMachineUAQTables.PACKid_http_c_s_s_www_example_org_s_vendingMachineUAQ.getClassId("ItemProcessor", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Keypad = VendingMachineUAQTables.PACKid_http_c_s_s_www_example_org_s_vendingMachineUAQ.getClassId("Keypad", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Location = VendingMachineUAQTables.PACKid_http_c_s_s_www_example_org_s_vendingMachineUAQ.getClassId("Location", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_PaymentProcessor = VendingMachineUAQTables.PACKid_http_c_s_s_www_example_org_s_vendingMachineUAQ.getClassId("PaymentProcessor", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_State = VendingMachineUAQTables.PACKid_http_c_s_s_www_example_org_s_vendingMachineUAQ.getClassId("State", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_VendingMachine = VendingMachineUAQTables.PACKid_http_c_s_s_www_example_org_s_vendingMachineUAQ.getClassId("VendingMachine", 0);
	public static final /*@NonInvalid*/ DataTypeId DATAid_EDate = VendingMachineUAQTables.PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore.getDataTypeId("EDate", 0);
	public static final /*@NonInvalid*/ DataTypeId DATAid_EFloat = VendingMachineUAQTables.PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore.getDataTypeId("EFloat", 0);
	public static final /*@NonInvalid*/ DataTypeId DATAid_EInt = VendingMachineUAQTables.PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore.getDataTypeId("EInt", 0);
	public static final /*@NonInvalid*/ EnumerationId ENUMid_PAYMENT_METHODS = VendingMachineUAQTables.PACKid_http_c_s_s_www_example_org_s_vendingMachineUAQ.getEnumerationId("PAYMENT_METHODS");
	public static final /*@NonInvalid*/ EnumerationId ENUMid_STATES = VendingMachineUAQTables.PACKid_http_c_s_s_www_example_org_s_vendingMachineUAQ.getEnumerationId("STATES");
	public static final /*@NonInvalid*/ EnumerationId ENUMid_STATE_OPERATIONS = VendingMachineUAQTables.PACKid_http_c_s_s_www_example_org_s_vendingMachineUAQ.getEnumerationId("STATE_OPERATIONS");
	public static final /*@NonInvalid*/ IntegerValue INT_0 = ValueUtil.integerValueOf("0");
	public static final /*@NonInvalid*/ IntegerValue INT_180 = ValueUtil.integerValueOf("180");
	public static final /*@NonInvalid*/ IntegerValue INT_90 = ValueUtil.integerValueOf("90");
	public static final /*@NonInvalid*/ CollectionTypeId SEQ_PRIMid_Real = TypeId.SEQUENCE.getSpecializedId(TypeId.REAL, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_ItemProcessor = TypeId.BAG.getSpecializedId(VendingMachineUAQTables.CLSSid_ItemProcessor, false, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_PaymentProcessor = TypeId.BAG.getSpecializedId(VendingMachineUAQTables.CLSSid_PaymentProcessor, false, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ EnumerationLiteralId ELITid_PROCESSING_PAYMENT = VendingMachineUAQTables.ENUMid_STATES.getEnumerationLiteralId("PROCESSING_PAYMENT");
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Item = TypeId.ORDERED_SET.getSpecializedId(VendingMachineUAQTables.CLSSid_Item, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_ItemGroup = TypeId.ORDERED_SET.getSpecializedId(VendingMachineUAQTables.CLSSid_ItemGroup, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId SEQ_DATAid_EInt = TypeId.SEQUENCE.getSpecializedId(VendingMachineUAQTables.DATAid_EInt, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);

	/**
	 *	The type parameters for templated types and operations.
	 */
	public static class TypeParameters {
		static {
			Init.initStart();
			VendingMachineUAQTables.init();
		}

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of VendingMachineUAQTables::TypeParameters and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The type descriptors for each type.
	 */
	public static class Types {
		static {
			Init.initStart();
			TypeParameters.init();
		}

		public static final EcoreExecutorType _HasId = new EcoreExecutorType(VendingMachineUAQPackage.Literals.HAS_ID, PACKAGE, 0 | ExecutorType.ABSTRACT);
		public static final EcoreExecutorType _HasOperation = new EcoreExecutorType(VendingMachineUAQPackage.Literals.HAS_OPERATION, PACKAGE, 0);
		public static final EcoreExecutorType _Inventory = new EcoreExecutorType(VendingMachineUAQPackage.Literals.INVENTORY, PACKAGE, 0);
		public static final EcoreExecutorType _Item = new EcoreExecutorType(VendingMachineUAQPackage.Literals.ITEM, PACKAGE, 0);
		public static final EcoreExecutorType _ItemGroup = new EcoreExecutorType(VendingMachineUAQPackage.Literals.ITEM_GROUP, PACKAGE, 0);
		public static final EcoreExecutorType _ItemProcessor = new EcoreExecutorType(VendingMachineUAQPackage.Literals.ITEM_PROCESSOR, PACKAGE, 0);
		public static final EcoreExecutorType _Keypad = new EcoreExecutorType(VendingMachineUAQPackage.Literals.KEYPAD, PACKAGE, 0);
		public static final EcoreExecutorType _Location = new EcoreExecutorType(VendingMachineUAQPackage.Literals.LOCATION, PACKAGE, 0);
		public static final EcoreExecutorType _NamedEntity = new EcoreExecutorType(VendingMachineUAQPackage.Literals.NAMED_ENTITY, PACKAGE, 0 | ExecutorType.ABSTRACT);
		public static final EcoreExecutorEnumeration _PAYMENT_METHODS = new EcoreExecutorEnumeration(VendingMachineUAQPackage.Literals.PAYMENT_METHODS, PACKAGE, 0);
		public static final EcoreExecutorType _PaymentProcessor = new EcoreExecutorType(VendingMachineUAQPackage.Literals.PAYMENT_PROCESSOR, PACKAGE, 0);
		public static final EcoreExecutorEnumeration _STATES = new EcoreExecutorEnumeration(VendingMachineUAQPackage.Literals.STATES, PACKAGE, 0);
		public static final EcoreExecutorEnumeration _STATE_OPERATIONS = new EcoreExecutorEnumeration(VendingMachineUAQPackage.Literals.STATE_OPERATIONS, PACKAGE, 0);
		public static final EcoreExecutorType _State = new EcoreExecutorType(VendingMachineUAQPackage.Literals.STATE, PACKAGE, 0);
		public static final EcoreExecutorType _VendingMachine = new EcoreExecutorType(VendingMachineUAQPackage.Literals.VENDING_MACHINE, PACKAGE, 0);

		private static final EcoreExecutorType /*@NonNull*/ [] types = {
			_HasId,
			_HasOperation,
			_Inventory,
			_Item,
			_ItemGroup,
			_ItemProcessor,
			_Keypad,
			_Location,
			_NamedEntity,
			_PAYMENT_METHODS,
			_PaymentProcessor,
			_STATES,
			_STATE_OPERATIONS,
			_State,
			_VendingMachine
		};

		/*
		 *	Install the type descriptors in the package descriptor.
		 */
		static {
			PACKAGE.init(LIBRARY, types);
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of VendingMachineUAQTables::Types and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The fragment descriptors for the local elements of each type and its supertypes.
	 */
	public static class Fragments {
		static {
			Init.initStart();
			Types.init();
		}

		private static final ExecutorFragment _HasId__HasId = new ExecutorFragment(Types._HasId, VendingMachineUAQTables.Types._HasId);
		private static final ExecutorFragment _HasId__OclAny = new ExecutorFragment(Types._HasId, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _HasId__OclElement = new ExecutorFragment(Types._HasId, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _HasOperation__HasOperation = new ExecutorFragment(Types._HasOperation, VendingMachineUAQTables.Types._HasOperation);
		private static final ExecutorFragment _HasOperation__OclAny = new ExecutorFragment(Types._HasOperation, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _HasOperation__OclElement = new ExecutorFragment(Types._HasOperation, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Inventory__HasId = new ExecutorFragment(Types._Inventory, VendingMachineUAQTables.Types._HasId);
		private static final ExecutorFragment _Inventory__Inventory = new ExecutorFragment(Types._Inventory, VendingMachineUAQTables.Types._Inventory);
		private static final ExecutorFragment _Inventory__OclAny = new ExecutorFragment(Types._Inventory, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Inventory__OclElement = new ExecutorFragment(Types._Inventory, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Item__HasId = new ExecutorFragment(Types._Item, VendingMachineUAQTables.Types._HasId);
		private static final ExecutorFragment _Item__Item = new ExecutorFragment(Types._Item, VendingMachineUAQTables.Types._Item);
		private static final ExecutorFragment _Item__OclAny = new ExecutorFragment(Types._Item, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Item__OclElement = new ExecutorFragment(Types._Item, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _ItemGroup__HasId = new ExecutorFragment(Types._ItemGroup, VendingMachineUAQTables.Types._HasId);
		private static final ExecutorFragment _ItemGroup__ItemGroup = new ExecutorFragment(Types._ItemGroup, VendingMachineUAQTables.Types._ItemGroup);
		private static final ExecutorFragment _ItemGroup__NamedEntity = new ExecutorFragment(Types._ItemGroup, VendingMachineUAQTables.Types._NamedEntity);
		private static final ExecutorFragment _ItemGroup__OclAny = new ExecutorFragment(Types._ItemGroup, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _ItemGroup__OclElement = new ExecutorFragment(Types._ItemGroup, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _ItemProcessor__HasOperation = new ExecutorFragment(Types._ItemProcessor, VendingMachineUAQTables.Types._HasOperation);
		private static final ExecutorFragment _ItemProcessor__ItemProcessor = new ExecutorFragment(Types._ItemProcessor, VendingMachineUAQTables.Types._ItemProcessor);
		private static final ExecutorFragment _ItemProcessor__OclAny = new ExecutorFragment(Types._ItemProcessor, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _ItemProcessor__OclElement = new ExecutorFragment(Types._ItemProcessor, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Keypad__HasOperation = new ExecutorFragment(Types._Keypad, VendingMachineUAQTables.Types._HasOperation);
		private static final ExecutorFragment _Keypad__Keypad = new ExecutorFragment(Types._Keypad, VendingMachineUAQTables.Types._Keypad);
		private static final ExecutorFragment _Keypad__OclAny = new ExecutorFragment(Types._Keypad, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Keypad__OclElement = new ExecutorFragment(Types._Keypad, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Location__Location = new ExecutorFragment(Types._Location, VendingMachineUAQTables.Types._Location);
		private static final ExecutorFragment _Location__NamedEntity = new ExecutorFragment(Types._Location, VendingMachineUAQTables.Types._NamedEntity);
		private static final ExecutorFragment _Location__OclAny = new ExecutorFragment(Types._Location, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Location__OclElement = new ExecutorFragment(Types._Location, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _NamedEntity__NamedEntity = new ExecutorFragment(Types._NamedEntity, VendingMachineUAQTables.Types._NamedEntity);
		private static final ExecutorFragment _NamedEntity__OclAny = new ExecutorFragment(Types._NamedEntity, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _NamedEntity__OclElement = new ExecutorFragment(Types._NamedEntity, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _PAYMENT_METHODS__OclAny = new ExecutorFragment(Types._PAYMENT_METHODS, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _PAYMENT_METHODS__OclElement = new ExecutorFragment(Types._PAYMENT_METHODS, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _PAYMENT_METHODS__OclEnumeration = new ExecutorFragment(Types._PAYMENT_METHODS, OCLstdlibTables.Types._OclEnumeration);
		private static final ExecutorFragment _PAYMENT_METHODS__OclType = new ExecutorFragment(Types._PAYMENT_METHODS, OCLstdlibTables.Types._OclType);
		private static final ExecutorFragment _PAYMENT_METHODS__PAYMENT_METHODS = new ExecutorFragment(Types._PAYMENT_METHODS, VendingMachineUAQTables.Types._PAYMENT_METHODS);

		private static final ExecutorFragment _PaymentProcessor__HasOperation = new ExecutorFragment(Types._PaymentProcessor, VendingMachineUAQTables.Types._HasOperation);
		private static final ExecutorFragment _PaymentProcessor__OclAny = new ExecutorFragment(Types._PaymentProcessor, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _PaymentProcessor__OclElement = new ExecutorFragment(Types._PaymentProcessor, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _PaymentProcessor__PaymentProcessor = new ExecutorFragment(Types._PaymentProcessor, VendingMachineUAQTables.Types._PaymentProcessor);

		private static final ExecutorFragment _STATES__OclAny = new ExecutorFragment(Types._STATES, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _STATES__OclElement = new ExecutorFragment(Types._STATES, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _STATES__OclEnumeration = new ExecutorFragment(Types._STATES, OCLstdlibTables.Types._OclEnumeration);
		private static final ExecutorFragment _STATES__OclType = new ExecutorFragment(Types._STATES, OCLstdlibTables.Types._OclType);
		private static final ExecutorFragment _STATES__STATES = new ExecutorFragment(Types._STATES, VendingMachineUAQTables.Types._STATES);

		private static final ExecutorFragment _STATE_OPERATIONS__OclAny = new ExecutorFragment(Types._STATE_OPERATIONS, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _STATE_OPERATIONS__OclElement = new ExecutorFragment(Types._STATE_OPERATIONS, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _STATE_OPERATIONS__OclEnumeration = new ExecutorFragment(Types._STATE_OPERATIONS, OCLstdlibTables.Types._OclEnumeration);
		private static final ExecutorFragment _STATE_OPERATIONS__OclType = new ExecutorFragment(Types._STATE_OPERATIONS, OCLstdlibTables.Types._OclType);
		private static final ExecutorFragment _STATE_OPERATIONS__STATE_OPERATIONS = new ExecutorFragment(Types._STATE_OPERATIONS, VendingMachineUAQTables.Types._STATE_OPERATIONS);

		private static final ExecutorFragment _State__OclAny = new ExecutorFragment(Types._State, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _State__OclElement = new ExecutorFragment(Types._State, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _State__State = new ExecutorFragment(Types._State, VendingMachineUAQTables.Types._State);

		private static final ExecutorFragment _VendingMachine__HasId = new ExecutorFragment(Types._VendingMachine, VendingMachineUAQTables.Types._HasId);
		private static final ExecutorFragment _VendingMachine__NamedEntity = new ExecutorFragment(Types._VendingMachine, VendingMachineUAQTables.Types._NamedEntity);
		private static final ExecutorFragment _VendingMachine__OclAny = new ExecutorFragment(Types._VendingMachine, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _VendingMachine__OclElement = new ExecutorFragment(Types._VendingMachine, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _VendingMachine__VendingMachine = new ExecutorFragment(Types._VendingMachine, VendingMachineUAQTables.Types._VendingMachine);

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of VendingMachineUAQTables::Fragments and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The parameter lists shared by operations.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Parameters {
		static {
			Init.initStart();
			Fragments.init();
		}

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of VendingMachineUAQTables::Parameters and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The operation descriptors for each operation of each type.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Operations {
		static {
			Init.initStart();
			Parameters.init();
		}

		public static final ExecutorOperation _Inventory__calculateTotalValue = new ExecutorOperation("calculateTotalValue", TypeUtil.EMPTY_PARAMETER_TYPES, Types._Inventory,
			0, TemplateParameters.EMPTY_LIST, null);

		public static final ExecutorOperation _PaymentProcessor__isPaymentComplete = new ExecutorOperation("isPaymentComplete", TypeUtil.EMPTY_PARAMETER_TYPES, Types._PaymentProcessor,
			0, TemplateParameters.EMPTY_LIST, null);

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of VendingMachineUAQTables::Operations and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The property descriptors for each property of each type.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Properties {
		static {
			Init.initStart();
			Operations.init();
		}

		public static final ExecutorProperty _HasId__id = new EcoreExecutorProperty(VendingMachineUAQPackage.Literals.HAS_ID__ID, Types._HasId, 0);

		public static final ExecutorProperty _HasOperation__operation = new EcoreExecutorProperty(VendingMachineUAQPackage.Literals.HAS_OPERATION__OPERATION, Types._HasOperation, 0);

		public static final ExecutorProperty _Inventory__availableSlots = new EcoreExecutorProperty(VendingMachineUAQPackage.Literals.INVENTORY__AVAILABLE_SLOTS, Types._Inventory, 0);
		public static final ExecutorProperty _Inventory__capacity = new EcoreExecutorProperty(VendingMachineUAQPackage.Literals.INVENTORY__CAPACITY, Types._Inventory, 1);
		public static final ExecutorProperty _Inventory__itemGroups = new EcoreExecutorProperty(VendingMachineUAQPackage.Literals.INVENTORY__ITEM_GROUPS, Types._Inventory, 2);
		public static final ExecutorProperty _Inventory__lastRestocked = new EcoreExecutorProperty(VendingMachineUAQPackage.Literals.INVENTORY__LAST_RESTOCKED, Types._Inventory, 3);
		public static final ExecutorProperty _Inventory__VendingMachine__inventory = new ExecutorPropertyWithImplementation("VendingMachine", Types._Inventory, 4, new EcoreLibraryOppositeProperty(VendingMachineUAQPackage.Literals.VENDING_MACHINE__INVENTORY));

		public static final ExecutorProperty _Item__expiry = new EcoreExecutorProperty(VendingMachineUAQPackage.Literals.ITEM__EXPIRY, Types._Item, 0);
		public static final ExecutorProperty _Item__itemGroup = new EcoreExecutorProperty(VendingMachineUAQPackage.Literals.ITEM__ITEM_GROUP, Types._Item, 1);

		public static final ExecutorProperty _ItemGroup__image = new EcoreExecutorProperty(VendingMachineUAQPackage.Literals.ITEM_GROUP__IMAGE, Types._ItemGroup, 0);
		public static final ExecutorProperty _ItemGroup__items = new EcoreExecutorProperty(VendingMachineUAQPackage.Literals.ITEM_GROUP__ITEMS, Types._ItemGroup, 1);
		public static final ExecutorProperty _ItemGroup__price = new EcoreExecutorProperty(VendingMachineUAQPackage.Literals.ITEM_GROUP__PRICE, Types._ItemGroup, 2);
		public static final ExecutorProperty _ItemGroup__quantity = new EcoreExecutorProperty(VendingMachineUAQPackage.Literals.ITEM_GROUP__QUANTITY, Types._ItemGroup, 3);
		public static final ExecutorProperty _ItemGroup__Inventory__itemGroups = new ExecutorPropertyWithImplementation("Inventory", Types._ItemGroup, 4, new EcoreLibraryOppositeProperty(VendingMachineUAQPackage.Literals.INVENTORY__ITEM_GROUPS));

		public static final ExecutorProperty _ItemProcessor__currentStage = new EcoreExecutorProperty(VendingMachineUAQPackage.Literals.ITEM_PROCESSOR__CURRENT_STAGE, Types._ItemProcessor, 0);
		public static final ExecutorProperty _ItemProcessor__state = new EcoreExecutorProperty(VendingMachineUAQPackage.Literals.ITEM_PROCESSOR__STATE, Types._ItemProcessor, 1);
		public static final ExecutorProperty _ItemProcessor__VendingMachine__itemProcessor = new ExecutorPropertyWithImplementation("VendingMachine", Types._ItemProcessor, 2, new EcoreLibraryOppositeProperty(VendingMachineUAQPackage.Literals.VENDING_MACHINE__ITEM_PROCESSOR));

		public static final ExecutorProperty _Keypad__input = new EcoreExecutorProperty(VendingMachineUAQPackage.Literals.KEYPAD__INPUT, Types._Keypad, 0);
		public static final ExecutorProperty _Keypad__VendingMachine__keypad = new ExecutorPropertyWithImplementation("VendingMachine", Types._Keypad, 1, new EcoreLibraryOppositeProperty(VendingMachineUAQPackage.Literals.VENDING_MACHINE__KEYPAD));

		public static final ExecutorProperty _Location__lat = new EcoreExecutorProperty(VendingMachineUAQPackage.Literals.LOCATION__LAT, Types._Location, 0);
		public static final ExecutorProperty _Location__long = new EcoreExecutorProperty(VendingMachineUAQPackage.Literals.LOCATION__LONG, Types._Location, 1);
		public static final ExecutorProperty _Location__VendingMachine__location = new ExecutorPropertyWithImplementation("VendingMachine", Types._Location, 2, new EcoreLibraryOppositeProperty(VendingMachineUAQPackage.Literals.VENDING_MACHINE__LOCATION));

		public static final ExecutorProperty _NamedEntity__name = new EcoreExecutorProperty(VendingMachineUAQPackage.Literals.NAMED_ENTITY__NAME, Types._NamedEntity, 0);

		public static final ExecutorProperty _PaymentProcessor__amound = new EcoreExecutorProperty(VendingMachineUAQPackage.Literals.PAYMENT_PROCESSOR__AMOUND, Types._PaymentProcessor, 0);
		public static final ExecutorProperty _PaymentProcessor__paymentMethod = new EcoreExecutorProperty(VendingMachineUAQPackage.Literals.PAYMENT_PROCESSOR__PAYMENT_METHOD, Types._PaymentProcessor, 1);
		public static final ExecutorProperty _PaymentProcessor__state = new EcoreExecutorProperty(VendingMachineUAQPackage.Literals.PAYMENT_PROCESSOR__STATE, Types._PaymentProcessor, 2);
		public static final ExecutorProperty _PaymentProcessor__VendingMachine__paymentProcessor = new ExecutorPropertyWithImplementation("VendingMachine", Types._PaymentProcessor, 3, new EcoreLibraryOppositeProperty(VendingMachineUAQPackage.Literals.VENDING_MACHINE__PAYMENT_PROCESSOR));

		public static final ExecutorProperty _State__stage = new EcoreExecutorProperty(VendingMachineUAQPackage.Literals.STATE__STAGE, Types._State, 0);
		public static final ExecutorProperty _State__ItemProcessor__state = new ExecutorPropertyWithImplementation("ItemProcessor", Types._State, 1, new EcoreLibraryOppositeProperty(VendingMachineUAQPackage.Literals.ITEM_PROCESSOR__STATE));
		public static final ExecutorProperty _State__PaymentProcessor__state = new ExecutorPropertyWithImplementation("PaymentProcessor", Types._State, 2, new EcoreLibraryOppositeProperty(VendingMachineUAQPackage.Literals.PAYMENT_PROCESSOR__STATE));
		public static final ExecutorProperty _State__VendingMachine__state = new ExecutorPropertyWithImplementation("VendingMachine", Types._State, 3, new EcoreLibraryOppositeProperty(VendingMachineUAQPackage.Literals.VENDING_MACHINE__STATE));

		public static final ExecutorProperty _VendingMachine__inventory = new EcoreExecutorProperty(VendingMachineUAQPackage.Literals.VENDING_MACHINE__INVENTORY, Types._VendingMachine, 0);
		public static final ExecutorProperty _VendingMachine__itemProcessor = new EcoreExecutorProperty(VendingMachineUAQPackage.Literals.VENDING_MACHINE__ITEM_PROCESSOR, Types._VendingMachine, 1);
		public static final ExecutorProperty _VendingMachine__keypad = new EcoreExecutorProperty(VendingMachineUAQPackage.Literals.VENDING_MACHINE__KEYPAD, Types._VendingMachine, 2);
		public static final ExecutorProperty _VendingMachine__location = new EcoreExecutorProperty(VendingMachineUAQPackage.Literals.VENDING_MACHINE__LOCATION, Types._VendingMachine, 3);
		public static final ExecutorProperty _VendingMachine__paymentProcessor = new EcoreExecutorProperty(VendingMachineUAQPackage.Literals.VENDING_MACHINE__PAYMENT_PROCESSOR, Types._VendingMachine, 4);
		public static final ExecutorProperty _VendingMachine__state = new EcoreExecutorProperty(VendingMachineUAQPackage.Literals.VENDING_MACHINE__STATE, Types._VendingMachine, 5);
		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of VendingMachineUAQTables::Properties and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The fragments for all base types in depth order: OclAny first, OclSelf last.
	 */
	public static class TypeFragments {
		static {
			Init.initStart();
			Properties.init();
		}

		private static final ExecutorFragment /*@NonNull*/ [] _HasId =
			{
				Fragments._HasId__OclAny /* 0 */,
				Fragments._HasId__OclElement /* 1 */,
				Fragments._HasId__HasId /* 2 */
			};
		private static final int /*@NonNull*/ [] __HasId = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _HasOperation =
			{
				Fragments._HasOperation__OclAny /* 0 */,
				Fragments._HasOperation__OclElement /* 1 */,
				Fragments._HasOperation__HasOperation /* 2 */
			};
		private static final int /*@NonNull*/ [] __HasOperation = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Inventory =
			{
				Fragments._Inventory__OclAny /* 0 */,
				Fragments._Inventory__OclElement /* 1 */,
				Fragments._Inventory__HasId /* 2 */,
				Fragments._Inventory__Inventory /* 3 */
			};
		private static final int /*@NonNull*/ [] __Inventory = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Item =
			{
				Fragments._Item__OclAny /* 0 */,
				Fragments._Item__OclElement /* 1 */,
				Fragments._Item__HasId /* 2 */,
				Fragments._Item__Item /* 3 */
			};
		private static final int /*@NonNull*/ [] __Item = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _ItemGroup =
			{
				Fragments._ItemGroup__OclAny /* 0 */,
				Fragments._ItemGroup__OclElement /* 1 */,
				Fragments._ItemGroup__HasId /* 2 */,
				Fragments._ItemGroup__NamedEntity /* 2 */,
				Fragments._ItemGroup__ItemGroup /* 3 */
			};
		private static final int /*@NonNull*/ [] __ItemGroup = { 1,1,2,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _ItemProcessor =
			{
				Fragments._ItemProcessor__OclAny /* 0 */,
				Fragments._ItemProcessor__OclElement /* 1 */,
				Fragments._ItemProcessor__HasOperation /* 2 */,
				Fragments._ItemProcessor__ItemProcessor /* 3 */
			};
		private static final int /*@NonNull*/ [] __ItemProcessor = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Keypad =
			{
				Fragments._Keypad__OclAny /* 0 */,
				Fragments._Keypad__OclElement /* 1 */,
				Fragments._Keypad__HasOperation /* 2 */,
				Fragments._Keypad__Keypad /* 3 */
			};
		private static final int /*@NonNull*/ [] __Keypad = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Location =
			{
				Fragments._Location__OclAny /* 0 */,
				Fragments._Location__OclElement /* 1 */,
				Fragments._Location__NamedEntity /* 2 */,
				Fragments._Location__Location /* 3 */
			};
		private static final int /*@NonNull*/ [] __Location = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _NamedEntity =
			{
				Fragments._NamedEntity__OclAny /* 0 */,
				Fragments._NamedEntity__OclElement /* 1 */,
				Fragments._NamedEntity__NamedEntity /* 2 */
			};
		private static final int /*@NonNull*/ [] __NamedEntity = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _PAYMENT_METHODS =
			{
				Fragments._PAYMENT_METHODS__OclAny /* 0 */,
				Fragments._PAYMENT_METHODS__OclElement /* 1 */,
				Fragments._PAYMENT_METHODS__OclType /* 2 */,
				Fragments._PAYMENT_METHODS__OclEnumeration /* 3 */,
				Fragments._PAYMENT_METHODS__PAYMENT_METHODS /* 4 */
			};
		private static final int /*@NonNull*/ [] __PAYMENT_METHODS = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _PaymentProcessor =
			{
				Fragments._PaymentProcessor__OclAny /* 0 */,
				Fragments._PaymentProcessor__OclElement /* 1 */,
				Fragments._PaymentProcessor__HasOperation /* 2 */,
				Fragments._PaymentProcessor__PaymentProcessor /* 3 */
			};
		private static final int /*@NonNull*/ [] __PaymentProcessor = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _STATES =
			{
				Fragments._STATES__OclAny /* 0 */,
				Fragments._STATES__OclElement /* 1 */,
				Fragments._STATES__OclType /* 2 */,
				Fragments._STATES__OclEnumeration /* 3 */,
				Fragments._STATES__STATES /* 4 */
			};
		private static final int /*@NonNull*/ [] __STATES = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _STATE_OPERATIONS =
			{
				Fragments._STATE_OPERATIONS__OclAny /* 0 */,
				Fragments._STATE_OPERATIONS__OclElement /* 1 */,
				Fragments._STATE_OPERATIONS__OclType /* 2 */,
				Fragments._STATE_OPERATIONS__OclEnumeration /* 3 */,
				Fragments._STATE_OPERATIONS__STATE_OPERATIONS /* 4 */
			};
		private static final int /*@NonNull*/ [] __STATE_OPERATIONS = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _State =
			{
				Fragments._State__OclAny /* 0 */,
				Fragments._State__OclElement /* 1 */,
				Fragments._State__State /* 2 */
			};
		private static final int /*@NonNull*/ [] __State = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _VendingMachine =
			{
				Fragments._VendingMachine__OclAny /* 0 */,
				Fragments._VendingMachine__OclElement /* 1 */,
				Fragments._VendingMachine__HasId /* 2 */,
				Fragments._VendingMachine__NamedEntity /* 2 */,
				Fragments._VendingMachine__VendingMachine /* 3 */
			};
		private static final int /*@NonNull*/ [] __VendingMachine = { 1,1,2,1 };

		/**
		 *	Install the fragment descriptors in the class descriptors.
		 */
		static {
			Types._HasId.initFragments(_HasId, __HasId);
			Types._HasOperation.initFragments(_HasOperation, __HasOperation);
			Types._Inventory.initFragments(_Inventory, __Inventory);
			Types._Item.initFragments(_Item, __Item);
			Types._ItemGroup.initFragments(_ItemGroup, __ItemGroup);
			Types._ItemProcessor.initFragments(_ItemProcessor, __ItemProcessor);
			Types._Keypad.initFragments(_Keypad, __Keypad);
			Types._Location.initFragments(_Location, __Location);
			Types._NamedEntity.initFragments(_NamedEntity, __NamedEntity);
			Types._PAYMENT_METHODS.initFragments(_PAYMENT_METHODS, __PAYMENT_METHODS);
			Types._PaymentProcessor.initFragments(_PaymentProcessor, __PaymentProcessor);
			Types._STATES.initFragments(_STATES, __STATES);
			Types._STATE_OPERATIONS.initFragments(_STATE_OPERATIONS, __STATE_OPERATIONS);
			Types._State.initFragments(_State, __State);
			Types._VendingMachine.initFragments(_VendingMachine, __VendingMachine);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of VendingMachineUAQTables::TypeFragments and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of local operations or local operation overrides for each fragment of each type.
	 */
	public static class FragmentOperations {
		static {
			Init.initStart();
			TypeFragments.init();
		}

		private static final ExecutorOperation /*@NonNull*/ [] _HasId__HasId = {};
		private static final ExecutorOperation /*@NonNull*/ [] _HasId__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _HasId__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _HasOperation__HasOperation = {};
		private static final ExecutorOperation /*@NonNull*/ [] _HasOperation__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _HasOperation__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Inventory__Inventory = {
			VendingMachineUAQTables.Operations._Inventory__calculateTotalValue /* calculateTotalValue() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Inventory__HasId = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Inventory__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Inventory__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Item__Item = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Item__HasId = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Item__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Item__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _ItemGroup__ItemGroup = {};
		private static final ExecutorOperation /*@NonNull*/ [] _ItemGroup__HasId = {};
		private static final ExecutorOperation /*@NonNull*/ [] _ItemGroup__NamedEntity = {};
		private static final ExecutorOperation /*@NonNull*/ [] _ItemGroup__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _ItemGroup__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _ItemProcessor__ItemProcessor = {};
		private static final ExecutorOperation /*@NonNull*/ [] _ItemProcessor__HasOperation = {};
		private static final ExecutorOperation /*@NonNull*/ [] _ItemProcessor__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _ItemProcessor__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Keypad__Keypad = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Keypad__HasOperation = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Keypad__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Keypad__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Location__Location = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Location__NamedEntity = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Location__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Location__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _NamedEntity__NamedEntity = {};
		private static final ExecutorOperation /*@NonNull*/ [] _NamedEntity__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _NamedEntity__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _PAYMENT_METHODS__PAYMENT_METHODS = {};
		private static final ExecutorOperation /*@NonNull*/ [] _PAYMENT_METHODS__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _PAYMENT_METHODS__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _PAYMENT_METHODS__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances(Integer[1]) */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _PAYMENT_METHODS__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _PaymentProcessor__PaymentProcessor = {
			VendingMachineUAQTables.Operations._PaymentProcessor__isPaymentComplete /* isPaymentComplete() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _PaymentProcessor__HasOperation = {};
		private static final ExecutorOperation /*@NonNull*/ [] _PaymentProcessor__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _PaymentProcessor__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _STATES__STATES = {};
		private static final ExecutorOperation /*@NonNull*/ [] _STATES__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _STATES__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _STATES__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances(Integer[1]) */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _STATES__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _STATE_OPERATIONS__STATE_OPERATIONS = {};
		private static final ExecutorOperation /*@NonNull*/ [] _STATE_OPERATIONS__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _STATE_OPERATIONS__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _STATE_OPERATIONS__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances(Integer[1]) */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _STATE_OPERATIONS__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _State__State = {};
		private static final ExecutorOperation /*@NonNull*/ [] _State__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _State__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _VendingMachine__VendingMachine = {};
		private static final ExecutorOperation /*@NonNull*/ [] _VendingMachine__HasId = {};
		private static final ExecutorOperation /*@NonNull*/ [] _VendingMachine__NamedEntity = {};
		private static final ExecutorOperation /*@NonNull*/ [] _VendingMachine__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _VendingMachine__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		/*
		 *	Install the operation descriptors in the fragment descriptors.
		 */
		static {
			Fragments._HasId__HasId.initOperations(_HasId__HasId);
			Fragments._HasId__OclAny.initOperations(_HasId__OclAny);
			Fragments._HasId__OclElement.initOperations(_HasId__OclElement);

			Fragments._HasOperation__HasOperation.initOperations(_HasOperation__HasOperation);
			Fragments._HasOperation__OclAny.initOperations(_HasOperation__OclAny);
			Fragments._HasOperation__OclElement.initOperations(_HasOperation__OclElement);

			Fragments._Inventory__HasId.initOperations(_Inventory__HasId);
			Fragments._Inventory__Inventory.initOperations(_Inventory__Inventory);
			Fragments._Inventory__OclAny.initOperations(_Inventory__OclAny);
			Fragments._Inventory__OclElement.initOperations(_Inventory__OclElement);

			Fragments._Item__HasId.initOperations(_Item__HasId);
			Fragments._Item__Item.initOperations(_Item__Item);
			Fragments._Item__OclAny.initOperations(_Item__OclAny);
			Fragments._Item__OclElement.initOperations(_Item__OclElement);

			Fragments._ItemGroup__HasId.initOperations(_ItemGroup__HasId);
			Fragments._ItemGroup__ItemGroup.initOperations(_ItemGroup__ItemGroup);
			Fragments._ItemGroup__NamedEntity.initOperations(_ItemGroup__NamedEntity);
			Fragments._ItemGroup__OclAny.initOperations(_ItemGroup__OclAny);
			Fragments._ItemGroup__OclElement.initOperations(_ItemGroup__OclElement);

			Fragments._ItemProcessor__HasOperation.initOperations(_ItemProcessor__HasOperation);
			Fragments._ItemProcessor__ItemProcessor.initOperations(_ItemProcessor__ItemProcessor);
			Fragments._ItemProcessor__OclAny.initOperations(_ItemProcessor__OclAny);
			Fragments._ItemProcessor__OclElement.initOperations(_ItemProcessor__OclElement);

			Fragments._Keypad__HasOperation.initOperations(_Keypad__HasOperation);
			Fragments._Keypad__Keypad.initOperations(_Keypad__Keypad);
			Fragments._Keypad__OclAny.initOperations(_Keypad__OclAny);
			Fragments._Keypad__OclElement.initOperations(_Keypad__OclElement);

			Fragments._Location__Location.initOperations(_Location__Location);
			Fragments._Location__NamedEntity.initOperations(_Location__NamedEntity);
			Fragments._Location__OclAny.initOperations(_Location__OclAny);
			Fragments._Location__OclElement.initOperations(_Location__OclElement);

			Fragments._NamedEntity__NamedEntity.initOperations(_NamedEntity__NamedEntity);
			Fragments._NamedEntity__OclAny.initOperations(_NamedEntity__OclAny);
			Fragments._NamedEntity__OclElement.initOperations(_NamedEntity__OclElement);

			Fragments._PAYMENT_METHODS__OclAny.initOperations(_PAYMENT_METHODS__OclAny);
			Fragments._PAYMENT_METHODS__OclElement.initOperations(_PAYMENT_METHODS__OclElement);
			Fragments._PAYMENT_METHODS__OclEnumeration.initOperations(_PAYMENT_METHODS__OclEnumeration);
			Fragments._PAYMENT_METHODS__OclType.initOperations(_PAYMENT_METHODS__OclType);
			Fragments._PAYMENT_METHODS__PAYMENT_METHODS.initOperations(_PAYMENT_METHODS__PAYMENT_METHODS);

			Fragments._PaymentProcessor__HasOperation.initOperations(_PaymentProcessor__HasOperation);
			Fragments._PaymentProcessor__OclAny.initOperations(_PaymentProcessor__OclAny);
			Fragments._PaymentProcessor__OclElement.initOperations(_PaymentProcessor__OclElement);
			Fragments._PaymentProcessor__PaymentProcessor.initOperations(_PaymentProcessor__PaymentProcessor);

			Fragments._STATES__OclAny.initOperations(_STATES__OclAny);
			Fragments._STATES__OclElement.initOperations(_STATES__OclElement);
			Fragments._STATES__OclEnumeration.initOperations(_STATES__OclEnumeration);
			Fragments._STATES__OclType.initOperations(_STATES__OclType);
			Fragments._STATES__STATES.initOperations(_STATES__STATES);

			Fragments._STATE_OPERATIONS__OclAny.initOperations(_STATE_OPERATIONS__OclAny);
			Fragments._STATE_OPERATIONS__OclElement.initOperations(_STATE_OPERATIONS__OclElement);
			Fragments._STATE_OPERATIONS__OclEnumeration.initOperations(_STATE_OPERATIONS__OclEnumeration);
			Fragments._STATE_OPERATIONS__OclType.initOperations(_STATE_OPERATIONS__OclType);
			Fragments._STATE_OPERATIONS__STATE_OPERATIONS.initOperations(_STATE_OPERATIONS__STATE_OPERATIONS);

			Fragments._State__OclAny.initOperations(_State__OclAny);
			Fragments._State__OclElement.initOperations(_State__OclElement);
			Fragments._State__State.initOperations(_State__State);

			Fragments._VendingMachine__HasId.initOperations(_VendingMachine__HasId);
			Fragments._VendingMachine__NamedEntity.initOperations(_VendingMachine__NamedEntity);
			Fragments._VendingMachine__OclAny.initOperations(_VendingMachine__OclAny);
			Fragments._VendingMachine__OclElement.initOperations(_VendingMachine__OclElement);
			Fragments._VendingMachine__VendingMachine.initOperations(_VendingMachine__VendingMachine);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of VendingMachineUAQTables::FragmentOperations and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of local properties for the local fragment of each type.
	 */
	public static class FragmentProperties {
		static {
			Init.initStart();
			FragmentOperations.init();
		}

		private static final ExecutorProperty /*@NonNull*/ [] _HasId = {
			VendingMachineUAQTables.Properties._HasId__id,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _HasOperation = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			VendingMachineUAQTables.Properties._HasOperation__operation
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Inventory = {
			VendingMachineUAQTables.Properties._Inventory__availableSlots,
			VendingMachineUAQTables.Properties._Inventory__capacity,
			VendingMachineUAQTables.Properties._HasId__id,
			VendingMachineUAQTables.Properties._Inventory__itemGroups,
			VendingMachineUAQTables.Properties._Inventory__lastRestocked,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Item = {
			VendingMachineUAQTables.Properties._Item__expiry,
			VendingMachineUAQTables.Properties._HasId__id,
			VendingMachineUAQTables.Properties._Item__itemGroup,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _ItemGroup = {
			VendingMachineUAQTables.Properties._HasId__id,
			VendingMachineUAQTables.Properties._ItemGroup__image,
			VendingMachineUAQTables.Properties._ItemGroup__items,
			VendingMachineUAQTables.Properties._NamedEntity__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			VendingMachineUAQTables.Properties._ItemGroup__price,
			VendingMachineUAQTables.Properties._ItemGroup__quantity
		};

		private static final ExecutorProperty /*@NonNull*/ [] _ItemProcessor = {
			VendingMachineUAQTables.Properties._ItemProcessor__currentStage,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			VendingMachineUAQTables.Properties._HasOperation__operation,
			VendingMachineUAQTables.Properties._ItemProcessor__state
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Keypad = {
			VendingMachineUAQTables.Properties._Keypad__input,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			VendingMachineUAQTables.Properties._HasOperation__operation
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Location = {
			VendingMachineUAQTables.Properties._Location__lat,
			VendingMachineUAQTables.Properties._Location__long,
			VendingMachineUAQTables.Properties._NamedEntity__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _NamedEntity = {
			VendingMachineUAQTables.Properties._NamedEntity__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _PAYMENT_METHODS = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _PaymentProcessor = {
			VendingMachineUAQTables.Properties._PaymentProcessor__amound,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			VendingMachineUAQTables.Properties._HasOperation__operation,
			VendingMachineUAQTables.Properties._PaymentProcessor__paymentMethod,
			VendingMachineUAQTables.Properties._PaymentProcessor__state
		};

		private static final ExecutorProperty /*@NonNull*/ [] _STATES = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _STATE_OPERATIONS = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _State = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			VendingMachineUAQTables.Properties._State__stage
		};

		private static final ExecutorProperty /*@NonNull*/ [] _VendingMachine = {
			VendingMachineUAQTables.Properties._HasId__id,
			VendingMachineUAQTables.Properties._VendingMachine__inventory,
			VendingMachineUAQTables.Properties._VendingMachine__itemProcessor,
			VendingMachineUAQTables.Properties._VendingMachine__keypad,
			VendingMachineUAQTables.Properties._VendingMachine__location,
			VendingMachineUAQTables.Properties._NamedEntity__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			VendingMachineUAQTables.Properties._VendingMachine__paymentProcessor,
			VendingMachineUAQTables.Properties._VendingMachine__state
		};

		/**
		 *	Install the property descriptors in the fragment descriptors.
		 */
		static {
			Fragments._HasId__HasId.initProperties(_HasId);
			Fragments._HasOperation__HasOperation.initProperties(_HasOperation);
			Fragments._Inventory__Inventory.initProperties(_Inventory);
			Fragments._Item__Item.initProperties(_Item);
			Fragments._ItemGroup__ItemGroup.initProperties(_ItemGroup);
			Fragments._ItemProcessor__ItemProcessor.initProperties(_ItemProcessor);
			Fragments._Keypad__Keypad.initProperties(_Keypad);
			Fragments._Location__Location.initProperties(_Location);
			Fragments._NamedEntity__NamedEntity.initProperties(_NamedEntity);
			Fragments._PAYMENT_METHODS__PAYMENT_METHODS.initProperties(_PAYMENT_METHODS);
			Fragments._PaymentProcessor__PaymentProcessor.initProperties(_PaymentProcessor);
			Fragments._STATES__STATES.initProperties(_STATES);
			Fragments._STATE_OPERATIONS__STATE_OPERATIONS.initProperties(_STATE_OPERATIONS);
			Fragments._State__State.initProperties(_State);
			Fragments._VendingMachine__VendingMachine.initProperties(_VendingMachine);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of VendingMachineUAQTables::FragmentProperties and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of enumeration literals for each enumeration.
	 */
	public static class EnumerationLiterals {
		static {
			Init.initStart();
			FragmentProperties.init();
		}

		public static final EcoreExecutorEnumerationLiteral _PAYMENT_METHODS__Coin = new EcoreExecutorEnumerationLiteral(VendingMachineUAQPackage.Literals.PAYMENT_METHODS.getEEnumLiteral("Coin"), Types._PAYMENT_METHODS, 0);
		public static final EcoreExecutorEnumerationLiteral _PAYMENT_METHODS__App = new EcoreExecutorEnumerationLiteral(VendingMachineUAQPackage.Literals.PAYMENT_METHODS.getEEnumLiteral("App"), Types._PAYMENT_METHODS, 1);
		public static final EcoreExecutorEnumerationLiteral _PAYMENT_METHODS__NFC = new EcoreExecutorEnumerationLiteral(VendingMachineUAQPackage.Literals.PAYMENT_METHODS.getEEnumLiteral("NFC"), Types._PAYMENT_METHODS, 2);
		private static final EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _PAYMENT_METHODS = {
			_PAYMENT_METHODS__Coin,
			_PAYMENT_METHODS__App,
			_PAYMENT_METHODS__NFC
		};

		public static final EcoreExecutorEnumerationLiteral _STATES__SELECT_ITEM = new EcoreExecutorEnumerationLiteral(VendingMachineUAQPackage.Literals.STATES.getEEnumLiteral("SELECT_ITEM"), Types._STATES, 0);
		public static final EcoreExecutorEnumerationLiteral _STATES__WAIT_FOR_PAYMENT = new EcoreExecutorEnumerationLiteral(VendingMachineUAQPackage.Literals.STATES.getEEnumLiteral("WAIT_FOR_PAYMENT"), Types._STATES, 1);
		public static final EcoreExecutorEnumerationLiteral _STATES__PROCESSING_PAYMENT = new EcoreExecutorEnumerationLiteral(VendingMachineUAQPackage.Literals.STATES.getEEnumLiteral("PROCESSING_PAYMENT"), Types._STATES, 2);
		public static final EcoreExecutorEnumerationLiteral _STATES__PROCESSING_ITEM = new EcoreExecutorEnumerationLiteral(VendingMachineUAQPackage.Literals.STATES.getEEnumLiteral("PROCESSING_ITEM"), Types._STATES, 3);
		public static final EcoreExecutorEnumerationLiteral _STATES__ITEM_DESPATCHED = new EcoreExecutorEnumerationLiteral(VendingMachineUAQPackage.Literals.STATES.getEEnumLiteral("ITEM_DESPATCHED"), Types._STATES, 4);
		private static final EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _STATES = {
			_STATES__SELECT_ITEM,
			_STATES__WAIT_FOR_PAYMENT,
			_STATES__PROCESSING_PAYMENT,
			_STATES__PROCESSING_ITEM,
			_STATES__ITEM_DESPATCHED
		};

		public static final EcoreExecutorEnumerationLiteral _STATE_OPERATIONS__SELECT_ITEM_collectCoin = new EcoreExecutorEnumerationLiteral(VendingMachineUAQPackage.Literals.STATE_OPERATIONS.getEEnumLiteral("SELECT_ITEM_collectCoin"), Types._STATE_OPERATIONS, 0);
		public static final EcoreExecutorEnumerationLiteral _STATE_OPERATIONS__SELECT_ITEM_sendInput = new EcoreExecutorEnumerationLiteral(VendingMachineUAQPackage.Literals.STATE_OPERATIONS.getEEnumLiteral("SELECT_ITEM_sendInput"), Types._STATE_OPERATIONS, 1);
		public static final EcoreExecutorEnumerationLiteral _STATE_OPERATIONS__PROCESSING_ITEM_processItem = new EcoreExecutorEnumerationLiteral(VendingMachineUAQPackage.Literals.STATE_OPERATIONS.getEEnumLiteral("PROCESSING_ITEM_processItem"), Types._STATE_OPERATIONS, 2);
		public static final EcoreExecutorEnumerationLiteral _STATE_OPERATIONS__ITEM_DISPATCHED_dispatchChange = new EcoreExecutorEnumerationLiteral(VendingMachineUAQPackage.Literals.STATE_OPERATIONS.getEEnumLiteral("ITEM_DISPATCHED_dispatchChange"), Types._STATE_OPERATIONS, 3);
		public static final EcoreExecutorEnumerationLiteral _STATE_OPERATIONS__WAIT_FOR_PAYMENT_collectCoin = new EcoreExecutorEnumerationLiteral(VendingMachineUAQPackage.Literals.STATE_OPERATIONS.getEEnumLiteral("WAIT_FOR_PAYMENT_collectCoin"), Types._STATE_OPERATIONS, 4);
		private static final EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _STATE_OPERATIONS = {
			_STATE_OPERATIONS__SELECT_ITEM_collectCoin,
			_STATE_OPERATIONS__SELECT_ITEM_sendInput,
			_STATE_OPERATIONS__PROCESSING_ITEM_processItem,
			_STATE_OPERATIONS__ITEM_DISPATCHED_dispatchChange,
			_STATE_OPERATIONS__WAIT_FOR_PAYMENT_collectCoin
		};

		/**
		 *	Install the enumeration literals in the enumerations.
		 */
		static {
			Types._PAYMENT_METHODS.initLiterals(_PAYMENT_METHODS);
			Types._STATES.initLiterals(_STATES);
			Types._STATE_OPERATIONS.initLiterals(_STATE_OPERATIONS);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of VendingMachineUAQTables::EnumerationLiterals and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 * The multiple packages above avoid problems with the Java 65536 byte limit but introduce a difficulty in ensuring that
	 * static construction occurs in the disciplined order of the packages when construction may start in any of the packages.
	 * The problem is resolved by ensuring that the static construction of each package first initializes its immediate predecessor.
	 * On completion of predecessor initialization, the residual packages are initialized by starting an initialization in the last package.
	 * This class maintains a count so that the various predecessors can distinguish whether they are the starting point and so
	 * ensure that residual construction occurs just once after all predecessors.
	 */
	private static class Init {
		/**
		 * Counter of nested static constructions. On return to zero residual construction starts. -ve once residual construction started.
		 */
		private static int initCount = 0;

		/**
		 * Invoked at the start of a static construction to defer residual construction until primary constructions complete.
		 */
		private static void initStart() {
			if (initCount >= 0) {
				initCount++;
			}
		}

		/**
		 * Invoked at the end of a static construction to activate residual construction once primary constructions complete.
		 */
		private static void initEnd() {
			if (initCount > 0) {
				if (--initCount == 0) {
					initCount = -1;
					EnumerationLiterals.init();
				}
			}
		}
	}

	static {
		Init.initEnd();
	}

	/*
	 * Force initialization of outer fields. Inner fields are lazily initialized.
	 */
	public static void init() {
		new VendingMachineUAQTables();
	}

	private VendingMachineUAQTables() {
		super(VendingMachineUAQPackage.eNS_URI);
	}
}
