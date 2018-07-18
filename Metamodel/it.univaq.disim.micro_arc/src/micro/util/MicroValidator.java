/**
 */
package micro.util;

import java.util.Map;

import micro.*;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see micro.MicroPackage
 * @generated
 */
public class MicroValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final MicroValidator INSTANCE = new MicroValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "micro";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MicroValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return MicroPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case MicroPackage.MICROSERVICE_ARCHITECTURE:
				return validateMicroserviceArchitecture((MicroserviceArchitecture)value, diagnostics, context);
			case MicroPackage.SERVICE:
				return validateService((Service)value, diagnostics, context);
			case MicroPackage.MODEL:
				return validateModel((Model)value, diagnostics, context);
			case MicroPackage.MODEL_EVENT:
				return validateModelEvent((ModelEvent)value, diagnostics, context);
			case MicroPackage.AGGREGATE_SERVICE:
				return validateAggregateService((AggregateService)value, diagnostics, context);
			case MicroPackage.VIEW_SERVICE:
				return validateViewService((ViewService)value, diagnostics, context);
			case MicroPackage.OPERATION:
				return validateOperation((Operation)value, diagnostics, context);
			case MicroPackage.NAMED_ELEMENT:
				return validateNamedElement((NamedElement)value, diagnostics, context);
			case MicroPackage.API:
				return validateAPI((API)value, diagnostics, context);
			case MicroPackage.COMMAND:
				return validateCommand((Command)value, diagnostics, context);
			case MicroPackage.EVENT:
				return validateEvent((Event)value, diagnostics, context);
			case MicroPackage.INFO:
				return validateInfo((Info)value, diagnostics, context);
			case MicroPackage.STEP:
				return validateStep((Step)value, diagnostics, context);
			case MicroPackage.SAGA:
				return validateSaga((Saga)value, diagnostics, context);
			case MicroPackage.DATA:
				return validateData((Data)value, diagnostics, context);
			case MicroPackage.ATTRIBUTE:
				return validateAttribute((Attribute)value, diagnostics, context);
			case MicroPackage.REFERENCE_ATTRIBUTE:
				return validateReferenceAttribute((ReferenceAttribute)value, diagnostics, context);
			case MicroPackage.PRIMITIVE_TYPE_ATTRIBUTE:
				return validatePrimitiveTypeAttribute((PrimitiveTypeAttribute)value, diagnostics, context);
			case MicroPackage.CRUD_OPERATION:
				return validateCRUDOperation((CRUDOperation)value, diagnostics, context);
			case MicroPackage.COMMAND_TYPE:
				return validateCommandType((CommandType)value, diagnostics, context);
			case MicroPackage.ATTRIBUTE_PRIMITIVE_VALUE:
				return validateAttributePrimitiveValue((AttributePrimitiveValue)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMicroserviceArchitecture(MicroserviceArchitecture microserviceArchitecture, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(microserviceArchitecture, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(microserviceArchitecture, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(microserviceArchitecture, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(microserviceArchitecture, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(microserviceArchitecture, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(microserviceArchitecture, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(microserviceArchitecture, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(microserviceArchitecture, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(microserviceArchitecture, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_NameMustNotContainWhiteSpace(microserviceArchitecture, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_NameMustNotBeEmpty(microserviceArchitecture, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateService(Service service, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(service, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(service, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(service, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(service, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(service, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(service, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(service, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(service, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(service, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_NameMustNotContainWhiteSpace(service, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_NameMustNotBeEmpty(service, diagnostics, context);
		if (result || diagnostics != null) result &= validateService_ServiceNameMustBeUnique(service, diagnostics, context);
		if (result || diagnostics != null) result &= validateService_ServiceFullnameMustBeUnique(service, diagnostics, context);
		if (result || diagnostics != null) result &= validateService_ServiceShortNameMustBeUnique(service, diagnostics, context);
		if (result || diagnostics != null) result &= validateService_ServicePortMustBeUnique(service, diagnostics, context);
		if (result || diagnostics != null) result &= validateService_ServiceReservedPortNumbers(service, diagnostics, context);
		if (result || diagnostics != null) result &= validateService_MustHaveFullname(service, diagnostics, context);
		if (result || diagnostics != null) result &= validateService_FullnameMustNotContainWhiteSpace(service, diagnostics, context);
		if (result || diagnostics != null) result &= validateService_MustHaveShortname(service, diagnostics, context);
		if (result || diagnostics != null) result &= validateService_ShortnameMustNotContainWhiteSpace(service, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the ServiceNameMustBeUnique constraint of '<em>Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SERVICE__SERVICE_NAME_MUST_BE_UNIQUE__EEXPRESSION = "MicroserviceArchitecture.allInstances().services->select(s : Service | s.name = self.name)->size() = 1";

	/**
	 * Validates the ServiceNameMustBeUnique constraint of '<em>Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateService_ServiceNameMustBeUnique(Service service, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(MicroPackage.Literals.SERVICE,
				 service,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "ServiceNameMustBeUnique",
				 SERVICE__SERVICE_NAME_MUST_BE_UNIQUE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the ServiceFullnameMustBeUnique constraint of '<em>Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SERVICE__SERVICE_FULLNAME_MUST_BE_UNIQUE__EEXPRESSION = "MicroserviceArchitecture.allInstances().services->select(s : Service | s.fullname = self.fullname)->size() = 1";

	/**
	 * Validates the ServiceFullnameMustBeUnique constraint of '<em>Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateService_ServiceFullnameMustBeUnique(Service service, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(MicroPackage.Literals.SERVICE,
				 service,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "ServiceFullnameMustBeUnique",
				 SERVICE__SERVICE_FULLNAME_MUST_BE_UNIQUE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the ServiceShortNameMustBeUnique constraint of '<em>Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SERVICE__SERVICE_SHORT_NAME_MUST_BE_UNIQUE__EEXPRESSION = "MicroserviceArchitecture.allInstances().services->select(s : Service | s.shortname = self.shortname)->size() = 1";

	/**
	 * Validates the ServiceShortNameMustBeUnique constraint of '<em>Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateService_ServiceShortNameMustBeUnique(Service service, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(MicroPackage.Literals.SERVICE,
				 service,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "ServiceShortNameMustBeUnique",
				 SERVICE__SERVICE_SHORT_NAME_MUST_BE_UNIQUE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the ServicePortMustBeUnique constraint of '<em>Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SERVICE__SERVICE_PORT_MUST_BE_UNIQUE__EEXPRESSION = "MicroserviceArchitecture.allInstances().services->select(s : Service | s.port = self.port)->size() = 1";

	/**
	 * Validates the ServicePortMustBeUnique constraint of '<em>Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateService_ServicePortMustBeUnique(Service service, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(MicroPackage.Literals.SERVICE,
				 service,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "ServicePortMustBeUnique",
				 SERVICE__SERVICE_PORT_MUST_BE_UNIQUE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the ServiceReservedPortNumbers constraint of '<em>Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SERVICE__SERVICE_RESERVED_PORT_NUMBERS__EEXPRESSION = "MicroserviceArchitecture.allInstances().services->select(s : Service | (s = self and (s.port.toString() = '27017' or s.port.toString() = '8099' or s.port.toString() = '3306' or s.port.toString() = '9092' or s.port.toString() = '2888' or s.port.toString() = '3888' or s.port.toString() = '5020')))->size() = 0";

	/**
	 * Validates the ServiceReservedPortNumbers constraint of '<em>Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateService_ServiceReservedPortNumbers(Service service, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(MicroPackage.Literals.SERVICE,
				 service,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "ServiceReservedPortNumbers",
				 SERVICE__SERVICE_RESERVED_PORT_NUMBERS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the MustHaveFullname constraint of '<em>Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SERVICE__MUST_HAVE_FULLNAME__EEXPRESSION = "fullname <> ''";

	/**
	 * Validates the MustHaveFullname constraint of '<em>Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateService_MustHaveFullname(Service service, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(MicroPackage.Literals.SERVICE,
				 service,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "MustHaveFullname",
				 SERVICE__MUST_HAVE_FULLNAME__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the FullnameMustNotContainWhiteSpace constraint of '<em>Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SERVICE__FULLNAME_MUST_NOT_CONTAIN_WHITE_SPACE__EEXPRESSION = "fullname.toString().characters()->select(c : String | c = ' ')->size() = 0";

	/**
	 * Validates the FullnameMustNotContainWhiteSpace constraint of '<em>Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateService_FullnameMustNotContainWhiteSpace(Service service, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(MicroPackage.Literals.SERVICE,
				 service,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "FullnameMustNotContainWhiteSpace",
				 SERVICE__FULLNAME_MUST_NOT_CONTAIN_WHITE_SPACE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the MustHaveShortname constraint of '<em>Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SERVICE__MUST_HAVE_SHORTNAME__EEXPRESSION = "shortname <> ''";

	/**
	 * Validates the MustHaveShortname constraint of '<em>Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateService_MustHaveShortname(Service service, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(MicroPackage.Literals.SERVICE,
				 service,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "MustHaveShortname",
				 SERVICE__MUST_HAVE_SHORTNAME__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the ShortnameMustNotContainWhiteSpace constraint of '<em>Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SERVICE__SHORTNAME_MUST_NOT_CONTAIN_WHITE_SPACE__EEXPRESSION = "shortname.toString().characters()->select(c : String | c = ' ')->size() = 0";

	/**
	 * Validates the ShortnameMustNotContainWhiteSpace constraint of '<em>Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateService_ShortnameMustNotContainWhiteSpace(Service service, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(MicroPackage.Literals.SERVICE,
				 service,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "ShortnameMustNotContainWhiteSpace",
				 SERVICE__SHORTNAME_MUST_NOT_CONTAIN_WHITE_SPACE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateModel(Model model, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(model, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(model, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(model, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(model, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(model, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(model, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(model, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(model, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(model, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_NameMustNotContainWhiteSpace(model, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_NameMustNotBeEmpty(model, diagnostics, context);
		if (result || diagnostics != null) result &= validateModel_ModelNameMustBeUnique(model, diagnostics, context);
		if (result || diagnostics != null) result &= validateModel_ModelMustBeContainedInOneAggService(model, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the ModelNameMustBeUnique constraint of '<em>Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String MODEL__MODEL_NAME_MUST_BE_UNIQUE__EEXPRESSION = "MicroserviceArchitecture.allInstances().models->select(s : Model | s.name = self.name)->size() = 1";

	/**
	 * Validates the ModelNameMustBeUnique constraint of '<em>Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateModel_ModelNameMustBeUnique(Model model, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(MicroPackage.Literals.MODEL,
				 model,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "ModelNameMustBeUnique",
				 MODEL__MODEL_NAME_MUST_BE_UNIQUE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the ModelMustBeContainedInOneAggService constraint of '<em>Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String MODEL__MODEL_MUST_BE_CONTAINED_IN_ONE_AGG_SERVICE__EEXPRESSION = "MicroserviceArchitecture.allInstances().services->select(s : Service | s.oclIsTypeOf(AggregateService)).oclAsType(AggregateService).models->select(m : Model | m = self)->size() = 1";

	/**
	 * Validates the ModelMustBeContainedInOneAggService constraint of '<em>Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateModel_ModelMustBeContainedInOneAggService(Model model, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(MicroPackage.Literals.MODEL,
				 model,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "ModelMustBeContainedInOneAggService",
				 MODEL__MODEL_MUST_BE_CONTAINED_IN_ONE_AGG_SERVICE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateModelEvent(ModelEvent modelEvent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(modelEvent, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(modelEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(modelEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(modelEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(modelEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(modelEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(modelEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(modelEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(modelEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_NameMustNotContainWhiteSpace(modelEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_NameMustNotBeEmpty(modelEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validateModelEvent_ModelEventNameMustBeUnique(modelEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validateModelEvent_ModelMustBelongToCurrentAggregateService(modelEvent, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the ModelEventNameMustBeUnique constraint of '<em>Model Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String MODEL_EVENT__MODEL_EVENT_NAME_MUST_BE_UNIQUE__EEXPRESSION = "aggregateService.modelEvents->select(m : ModelEvent | m.name = self.name)->size() = 1";

	/**
	 * Validates the ModelEventNameMustBeUnique constraint of '<em>Model Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateModelEvent_ModelEventNameMustBeUnique(ModelEvent modelEvent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(MicroPackage.Literals.MODEL_EVENT,
				 modelEvent,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "ModelEventNameMustBeUnique",
				 MODEL_EVENT__MODEL_EVENT_NAME_MUST_BE_UNIQUE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the ModelMustBelongToCurrentAggregateService constraint of '<em>Model Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String MODEL_EVENT__MODEL_MUST_BELONG_TO_CURRENT_AGGREGATE_SERVICE__EEXPRESSION = "MicroserviceArchitecture.allInstances().services->select(s : Service | s.name = aggregateService.name).oclAsType(AggregateService).models->select(m : Model | m = self.model)->size() = 1";

	/**
	 * Validates the ModelMustBelongToCurrentAggregateService constraint of '<em>Model Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateModelEvent_ModelMustBelongToCurrentAggregateService(ModelEvent modelEvent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(MicroPackage.Literals.MODEL_EVENT,
				 modelEvent,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "ModelMustBelongToCurrentAggregateService",
				 MODEL_EVENT__MODEL_MUST_BELONG_TO_CURRENT_AGGREGATE_SERVICE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAggregateService(AggregateService aggregateService, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(aggregateService, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(aggregateService, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(aggregateService, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(aggregateService, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(aggregateService, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(aggregateService, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(aggregateService, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(aggregateService, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(aggregateService, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_NameMustNotContainWhiteSpace(aggregateService, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_NameMustNotBeEmpty(aggregateService, diagnostics, context);
		if (result || diagnostics != null) result &= validateService_ServiceNameMustBeUnique(aggregateService, diagnostics, context);
		if (result || diagnostics != null) result &= validateService_ServiceFullnameMustBeUnique(aggregateService, diagnostics, context);
		if (result || diagnostics != null) result &= validateService_ServiceShortNameMustBeUnique(aggregateService, diagnostics, context);
		if (result || diagnostics != null) result &= validateService_ServicePortMustBeUnique(aggregateService, diagnostics, context);
		if (result || diagnostics != null) result &= validateService_ServiceReservedPortNumbers(aggregateService, diagnostics, context);
		if (result || diagnostics != null) result &= validateService_MustHaveFullname(aggregateService, diagnostics, context);
		if (result || diagnostics != null) result &= validateService_FullnameMustNotContainWhiteSpace(aggregateService, diagnostics, context);
		if (result || diagnostics != null) result &= validateService_MustHaveShortname(aggregateService, diagnostics, context);
		if (result || diagnostics != null) result &= validateService_ShortnameMustNotContainWhiteSpace(aggregateService, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateViewService(ViewService viewService, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(viewService, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(viewService, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(viewService, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(viewService, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(viewService, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(viewService, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(viewService, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(viewService, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(viewService, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_NameMustNotContainWhiteSpace(viewService, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_NameMustNotBeEmpty(viewService, diagnostics, context);
		if (result || diagnostics != null) result &= validateService_ServiceNameMustBeUnique(viewService, diagnostics, context);
		if (result || diagnostics != null) result &= validateService_ServiceFullnameMustBeUnique(viewService, diagnostics, context);
		if (result || diagnostics != null) result &= validateService_ServiceShortNameMustBeUnique(viewService, diagnostics, context);
		if (result || diagnostics != null) result &= validateService_ServicePortMustBeUnique(viewService, diagnostics, context);
		if (result || diagnostics != null) result &= validateService_ServiceReservedPortNumbers(viewService, diagnostics, context);
		if (result || diagnostics != null) result &= validateService_MustHaveFullname(viewService, diagnostics, context);
		if (result || diagnostics != null) result &= validateService_FullnameMustNotContainWhiteSpace(viewService, diagnostics, context);
		if (result || diagnostics != null) result &= validateService_MustHaveShortname(viewService, diagnostics, context);
		if (result || diagnostics != null) result &= validateService_ShortnameMustNotContainWhiteSpace(viewService, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperation(Operation operation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(operation, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(operation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(operation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(operation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(operation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(operation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(operation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(operation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(operation, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_NameMustNotContainWhiteSpace(operation, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_NameMustNotBeEmpty(operation, diagnostics, context);
		if (result || diagnostics != null) result &= validateOperation_SagaNameMustBeUnique(operation, diagnostics, context);
		if (result || diagnostics != null) result &= validateOperation_OperationNameMustBeUnique(operation, diagnostics, context);
		if (result || diagnostics != null) result &= validateOperation_OperationModelMustBelongToSameAggregateService(operation, diagnostics, context);
		if (result || diagnostics != null) result &= validateOperation_OperationMustPublishEvent(operation, diagnostics, context);
		if (result || diagnostics != null) result &= validateOperation_OperationEventPublishedMustBelongToCurrentAggregateService(operation, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the SagaNameMustBeUnique constraint of '<em>Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String OPERATION__SAGA_NAME_MUST_BE_UNIQUE__EEXPRESSION = "aggregateService.operation->select(o : Operation | (o.Saga.oclIsUndefined() = false and self.Saga.oclIsUndefined() = false))->select(s : Operation | (s.Saga.name = self.Saga.name))->size() <= 1";

	/**
	 * Validates the SagaNameMustBeUnique constraint of '<em>Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperation_SagaNameMustBeUnique(Operation operation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(MicroPackage.Literals.OPERATION,
				 operation,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "SagaNameMustBeUnique",
				 OPERATION__SAGA_NAME_MUST_BE_UNIQUE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the OperationNameMustBeUnique constraint of '<em>Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String OPERATION__OPERATION_NAME_MUST_BE_UNIQUE__EEXPRESSION = "aggregateService.operation->select(o : Operation | (o.name = self.name and o.operationType.toString() = self.operationType.toString()))->size() = 1";

	/**
	 * Validates the OperationNameMustBeUnique constraint of '<em>Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperation_OperationNameMustBeUnique(Operation operation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(MicroPackage.Literals.OPERATION,
				 operation,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "OperationNameMustBeUnique",
				 OPERATION__OPERATION_NAME_MUST_BE_UNIQUE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the OperationModelMustBelongToSameAggregateService constraint of '<em>Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String OPERATION__OPERATION_MODEL_MUST_BELONG_TO_SAME_AGGREGATE_SERVICE__EEXPRESSION = "aggregateService.models->select(m : Model | m.name = self.model.name)->size() = 1";

	/**
	 * Validates the OperationModelMustBelongToSameAggregateService constraint of '<em>Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperation_OperationModelMustBelongToSameAggregateService(Operation operation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(MicroPackage.Literals.OPERATION,
				 operation,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "OperationModelMustBelongToSameAggregateService",
				 OPERATION__OPERATION_MODEL_MUST_BELONG_TO_SAME_AGGREGATE_SERVICE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the OperationMustPublishEvent constraint of '<em>Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String OPERATION__OPERATION_MUST_PUBLISH_EVENT__EEXPRESSION = "self.operationType.toString() <> CRUDOperation::retrieve.toString() and self.publish <> null or self.operationType.toString() = CRUDOperation::retrieve.toString() or self.operationType.toString() = CRUDOperation::update.toString() and self.Saga.oclIsUndefined() = false";

	/**
	 * Validates the OperationMustPublishEvent constraint of '<em>Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperation_OperationMustPublishEvent(Operation operation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(MicroPackage.Literals.OPERATION,
				 operation,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "OperationMustPublishEvent",
				 OPERATION__OPERATION_MUST_PUBLISH_EVENT__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the OperationEventPublishedMustBelongToCurrentAggregateService constraint of '<em>Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String OPERATION__OPERATION_EVENT_PUBLISHED_MUST_BELONG_TO_CURRENT_AGGREGATE_SERVICE__EEXPRESSION = "aggregateService.api.events->select(e : Event | (self.publish <> null and self.publish.name = e.name))->size() = 1 or self.operationType.toString() = CRUDOperation::retrieve.toString() or self.operationType.toString() = CRUDOperation::update.toString() and self.Saga.oclIsUndefined() = false";

	/**
	 * Validates the OperationEventPublishedMustBelongToCurrentAggregateService constraint of '<em>Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperation_OperationEventPublishedMustBelongToCurrentAggregateService(Operation operation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(MicroPackage.Literals.OPERATION,
				 operation,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "OperationEventPublishedMustBelongToCurrentAggregateService",
				 OPERATION__OPERATION_EVENT_PUBLISHED_MUST_BELONG_TO_CURRENT_AGGREGATE_SERVICE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNamedElement(NamedElement namedElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(namedElement, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(namedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(namedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(namedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(namedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(namedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(namedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(namedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(namedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_NameMustNotContainWhiteSpace(namedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_NameMustNotBeEmpty(namedElement, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the NameMustNotContainWhiteSpace constraint of '<em>Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String NAMED_ELEMENT__NAME_MUST_NOT_CONTAIN_WHITE_SPACE__EEXPRESSION = "name.toString().characters()->select(c : String | c = ' ')->size() = 0";

	/**
	 * Validates the NameMustNotContainWhiteSpace constraint of '<em>Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNamedElement_NameMustNotContainWhiteSpace(NamedElement namedElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(MicroPackage.Literals.NAMED_ELEMENT,
				 namedElement,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "NameMustNotContainWhiteSpace",
				 NAMED_ELEMENT__NAME_MUST_NOT_CONTAIN_WHITE_SPACE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the NameMustNotBeEmpty constraint of '<em>Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String NAMED_ELEMENT__NAME_MUST_NOT_BE_EMPTY__EEXPRESSION = "name <> ''";

	/**
	 * Validates the NameMustNotBeEmpty constraint of '<em>Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNamedElement_NameMustNotBeEmpty(NamedElement namedElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(MicroPackage.Literals.NAMED_ELEMENT,
				 namedElement,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "NameMustNotBeEmpty",
				 NAMED_ELEMENT__NAME_MUST_NOT_BE_EMPTY__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAPI(API api, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(api, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(api, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(api, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(api, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(api, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(api, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(api, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(api, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(api, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_NameMustNotContainWhiteSpace(api, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_NameMustNotBeEmpty(api, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCommand(Command command, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(command, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(command, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(command, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(command, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(command, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(command, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(command, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(command, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(command, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_NameMustNotContainWhiteSpace(command, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_NameMustNotBeEmpty(command, diagnostics, context);
		if (result || diagnostics != null) result &= validateCommand_CommandNameMustBeUnique(command, diagnostics, context);
		if (result || diagnostics != null) result &= validateCommand_CommandReplyMustHaveReplyInfo(command, diagnostics, context);
		if (result || diagnostics != null) result &= validateCommand_CommandReplyInfoMustBelongToCurrentAggregateService(command, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the CommandNameMustBeUnique constraint of '<em>Command</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String COMMAND__COMMAND_NAME_MUST_BE_UNIQUE__EEXPRESSION = "api.commands->select(c : Command | c.name = self.name)->size() = 1";

	/**
	 * Validates the CommandNameMustBeUnique constraint of '<em>Command</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCommand_CommandNameMustBeUnique(Command command, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(MicroPackage.Literals.COMMAND,
				 command,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "CommandNameMustBeUnique",
				 COMMAND__COMMAND_NAME_MUST_BE_UNIQUE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the CommandReplyMustHaveReplyInfo constraint of '<em>Command</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String COMMAND__COMMAND_REPLY_MUST_HAVE_REPLY_INFO__EEXPRESSION = "commandType.toString() = CommandType::reply.toString() and replyInfo <> null or commandType.toString() <> CommandType::reply.toString()";

	/**
	 * Validates the CommandReplyMustHaveReplyInfo constraint of '<em>Command</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCommand_CommandReplyMustHaveReplyInfo(Command command, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(MicroPackage.Literals.COMMAND,
				 command,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "CommandReplyMustHaveReplyInfo",
				 COMMAND__COMMAND_REPLY_MUST_HAVE_REPLY_INFO__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the CommandReplyInfoMustBelongToCurrentAggregateService constraint of '<em>Command</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String COMMAND__COMMAND_REPLY_INFO_MUST_BELONG_TO_CURRENT_AGGREGATE_SERVICE__EEXPRESSION = "api.infos->select(i : Info | i.name = replyInfo.name)->size() = 1 or commandType.toString() <> CommandType::reply.toString()";

	/**
	 * Validates the CommandReplyInfoMustBelongToCurrentAggregateService constraint of '<em>Command</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCommand_CommandReplyInfoMustBelongToCurrentAggregateService(Command command, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(MicroPackage.Literals.COMMAND,
				 command,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "CommandReplyInfoMustBelongToCurrentAggregateService",
				 COMMAND__COMMAND_REPLY_INFO_MUST_BELONG_TO_CURRENT_AGGREGATE_SERVICE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEvent(Event event, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(event, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(event, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(event, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(event, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(event, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(event, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(event, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(event, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(event, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_NameMustNotContainWhiteSpace(event, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_NameMustNotBeEmpty(event, diagnostics, context);
		if (result || diagnostics != null) result &= validateEvent_EventNameMustBeUnique(event, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the EventNameMustBeUnique constraint of '<em>Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String EVENT__EVENT_NAME_MUST_BE_UNIQUE__EEXPRESSION = "api.events->select(e : Event | e.name = self.name)->size() = 1";

	/**
	 * Validates the EventNameMustBeUnique constraint of '<em>Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEvent_EventNameMustBeUnique(Event event, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(MicroPackage.Literals.EVENT,
				 event,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "EventNameMustBeUnique",
				 EVENT__EVENT_NAME_MUST_BE_UNIQUE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInfo(Info info, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(info, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(info, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(info, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(info, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(info, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(info, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(info, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(info, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(info, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_NameMustNotContainWhiteSpace(info, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_NameMustNotBeEmpty(info, diagnostics, context);
		if (result || diagnostics != null) result &= validateInfo_InfoNameMustBeUnique(info, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the InfoNameMustBeUnique constraint of '<em>Info</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String INFO__INFO_NAME_MUST_BE_UNIQUE__EEXPRESSION = "api.infos->select(i : Info | i.name = self.name)->size() = 1";

	/**
	 * Validates the InfoNameMustBeUnique constraint of '<em>Info</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInfo_InfoNameMustBeUnique(Info info, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(MicroPackage.Literals.INFO,
				 info,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "InfoNameMustBeUnique",
				 INFO__INFO_NAME_MUST_BE_UNIQUE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStep(Step step, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(step, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(step, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(step, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(step, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(step, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(step, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(step, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(step, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(step, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_NameMustNotContainWhiteSpace(step, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_NameMustNotBeEmpty(step, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSaga(Saga saga, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(saga, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(saga, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(saga, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(saga, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(saga, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(saga, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(saga, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(saga, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(saga, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_NameMustNotContainWhiteSpace(saga, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_NameMustNotBeEmpty(saga, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateData(Data data, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(data, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(data, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(data, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(data, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(data, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(data, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(data, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(data, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(data, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_NameMustNotContainWhiteSpace(data, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_NameMustNotBeEmpty(data, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAttribute(Attribute attribute, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(attribute, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(attribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(attribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(attribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(attribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(attribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(attribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(attribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(attribute, diagnostics, context);
		if (result || diagnostics != null) result &= validateAttribute_ModelAttributeNameMustBeUnique(attribute, diagnostics, context);
		if (result || diagnostics != null) result &= validateAttribute_ModelAttributeIdMustBeUnique(attribute, diagnostics, context);
		if (result || diagnostics != null) result &= validateAttribute_ModelAttributeIdMustBeNoList(attribute, diagnostics, context);
		if (result || diagnostics != null) result &= validateAttribute_ModelAttributeIsGeneratedOnlyWithId(attribute, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the ModelAttributeNameMustBeUnique constraint of '<em>Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ATTRIBUTE__MODEL_ATTRIBUTE_NAME_MUST_BE_UNIQUE__EEXPRESSION = "model.attributes->select(a : Attribute | a.name = self.name)->size() = 1";

	/**
	 * Validates the ModelAttributeNameMustBeUnique constraint of '<em>Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAttribute_ModelAttributeNameMustBeUnique(Attribute attribute, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(MicroPackage.Literals.ATTRIBUTE,
				 attribute,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "ModelAttributeNameMustBeUnique",
				 ATTRIBUTE__MODEL_ATTRIBUTE_NAME_MUST_BE_UNIQUE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the ModelAttributeIdMustBeUnique constraint of '<em>Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ATTRIBUTE__MODEL_ATTRIBUTE_ID_MUST_BE_UNIQUE__EEXPRESSION = "model.attributes->select(a : Attribute | a.isId = true)->size() = 1";

	/**
	 * Validates the ModelAttributeIdMustBeUnique constraint of '<em>Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAttribute_ModelAttributeIdMustBeUnique(Attribute attribute, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(MicroPackage.Literals.ATTRIBUTE,
				 attribute,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "ModelAttributeIdMustBeUnique",
				 ATTRIBUTE__MODEL_ATTRIBUTE_ID_MUST_BE_UNIQUE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the ModelAttributeIdMustBeNoList constraint of '<em>Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ATTRIBUTE__MODEL_ATTRIBUTE_ID_MUST_BE_NO_LIST__EEXPRESSION = "model.attributes->select(a : Attribute | (a.isId = true and a.isMany = false))->size() = 1";

	/**
	 * Validates the ModelAttributeIdMustBeNoList constraint of '<em>Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAttribute_ModelAttributeIdMustBeNoList(Attribute attribute, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(MicroPackage.Literals.ATTRIBUTE,
				 attribute,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "ModelAttributeIdMustBeNoList",
				 ATTRIBUTE__MODEL_ATTRIBUTE_ID_MUST_BE_NO_LIST__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the ModelAttributeIsGeneratedOnlyWithId constraint of '<em>Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ATTRIBUTE__MODEL_ATTRIBUTE_IS_GENERATED_ONLY_WITH_ID__EEXPRESSION = "model.attributes->select(a : Attribute | (a.isId = false and a.isGenerated = true))->size() = 0";

	/**
	 * Validates the ModelAttributeIsGeneratedOnlyWithId constraint of '<em>Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAttribute_ModelAttributeIsGeneratedOnlyWithId(Attribute attribute, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(MicroPackage.Literals.ATTRIBUTE,
				 attribute,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "ModelAttributeIsGeneratedOnlyWithId",
				 ATTRIBUTE__MODEL_ATTRIBUTE_IS_GENERATED_ONLY_WITH_ID__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReferenceAttribute(ReferenceAttribute referenceAttribute, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(referenceAttribute, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(referenceAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(referenceAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(referenceAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(referenceAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(referenceAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(referenceAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(referenceAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(referenceAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validateAttribute_ModelAttributeNameMustBeUnique(referenceAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validateAttribute_ModelAttributeIdMustBeUnique(referenceAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validateAttribute_ModelAttributeIdMustBeNoList(referenceAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validateAttribute_ModelAttributeIsGeneratedOnlyWithId(referenceAttribute, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePrimitiveTypeAttribute(PrimitiveTypeAttribute primitiveTypeAttribute, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(primitiveTypeAttribute, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(primitiveTypeAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(primitiveTypeAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(primitiveTypeAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(primitiveTypeAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(primitiveTypeAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(primitiveTypeAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(primitiveTypeAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(primitiveTypeAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validateAttribute_ModelAttributeNameMustBeUnique(primitiveTypeAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validateAttribute_ModelAttributeIdMustBeUnique(primitiveTypeAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validateAttribute_ModelAttributeIdMustBeNoList(primitiveTypeAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validateAttribute_ModelAttributeIsGeneratedOnlyWithId(primitiveTypeAttribute, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCRUDOperation(CRUDOperation crudOperation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCommandType(CommandType commandType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAttributePrimitiveValue(AttributePrimitiveValue attributePrimitiveValue, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //MicroValidator
