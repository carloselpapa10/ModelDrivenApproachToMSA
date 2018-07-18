/**
 */
package micro.impl;

import micro.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MicroFactoryImpl extends EFactoryImpl implements MicroFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MicroFactory init() {
		try {
			MicroFactory theMicroFactory = (MicroFactory)EPackage.Registry.INSTANCE.getEFactory(MicroPackage.eNS_URI);
			if (theMicroFactory != null) {
				return theMicroFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new MicroFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MicroFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case MicroPackage.MICROSERVICE_ARCHITECTURE: return createMicroserviceArchitecture();
			case MicroPackage.MODEL: return createModel();
			case MicroPackage.MODEL_EVENT: return createModelEvent();
			case MicroPackage.AGGREGATE_SERVICE: return createAggregateService();
			case MicroPackage.VIEW_SERVICE: return createViewService();
			case MicroPackage.OPERATION: return createOperation();
			case MicroPackage.NAMED_ELEMENT: return createNamedElement();
			case MicroPackage.API: return createAPI();
			case MicroPackage.COMMAND: return createCommand();
			case MicroPackage.EVENT: return createEvent();
			case MicroPackage.INFO: return createInfo();
			case MicroPackage.STEP: return createStep();
			case MicroPackage.SAGA: return createSaga();
			case MicroPackage.DATA: return createData();
			case MicroPackage.REFERENCE_ATTRIBUTE: return createReferenceAttribute();
			case MicroPackage.PRIMITIVE_TYPE_ATTRIBUTE: return createPrimitiveTypeAttribute();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case MicroPackage.CRUD_OPERATION:
				return createCRUDOperationFromString(eDataType, initialValue);
			case MicroPackage.COMMAND_TYPE:
				return createCommandTypeFromString(eDataType, initialValue);
			case MicroPackage.ATTRIBUTE_PRIMITIVE_VALUE:
				return createAttributePrimitiveValueFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case MicroPackage.CRUD_OPERATION:
				return convertCRUDOperationToString(eDataType, instanceValue);
			case MicroPackage.COMMAND_TYPE:
				return convertCommandTypeToString(eDataType, instanceValue);
			case MicroPackage.ATTRIBUTE_PRIMITIVE_VALUE:
				return convertAttributePrimitiveValueToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MicroserviceArchitecture createMicroserviceArchitecture() {
		MicroserviceArchitectureImpl microserviceArchitecture = new MicroserviceArchitectureImpl();
		return microserviceArchitecture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Model createModel() {
		ModelImpl model = new ModelImpl();
		return model;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelEvent createModelEvent() {
		ModelEventImpl modelEvent = new ModelEventImpl();
		return modelEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AggregateService createAggregateService() {
		AggregateServiceImpl aggregateService = new AggregateServiceImpl();
		return aggregateService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ViewService createViewService() {
		ViewServiceImpl viewService = new ViewServiceImpl();
		return viewService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation createOperation() {
		OperationImpl operation = new OperationImpl();
		return operation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamedElement createNamedElement() {
		NamedElementImpl namedElement = new NamedElementImpl();
		return namedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public API createAPI() {
		APIImpl api = new APIImpl();
		return api;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Command createCommand() {
		CommandImpl command = new CommandImpl();
		return command;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Event createEvent() {
		EventImpl event = new EventImpl();
		return event;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Info createInfo() {
		InfoImpl info = new InfoImpl();
		return info;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Step createStep() {
		StepImpl step = new StepImpl();
		return step;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Saga createSaga() {
		SagaImpl saga = new SagaImpl();
		return saga;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Data createData() {
		DataImpl data = new DataImpl();
		return data;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferenceAttribute createReferenceAttribute() {
		ReferenceAttributeImpl referenceAttribute = new ReferenceAttributeImpl();
		return referenceAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimitiveTypeAttribute createPrimitiveTypeAttribute() {
		PrimitiveTypeAttributeImpl primitiveTypeAttribute = new PrimitiveTypeAttributeImpl();
		return primitiveTypeAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CRUDOperation createCRUDOperationFromString(EDataType eDataType, String initialValue) {
		CRUDOperation result = CRUDOperation.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCRUDOperationToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommandType createCommandTypeFromString(EDataType eDataType, String initialValue) {
		CommandType result = CommandType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCommandTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributePrimitiveValue createAttributePrimitiveValueFromString(EDataType eDataType, String initialValue) {
		AttributePrimitiveValue result = AttributePrimitiveValue.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAttributePrimitiveValueToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MicroPackage getMicroPackage() {
		return (MicroPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static MicroPackage getPackage() {
		return MicroPackage.eINSTANCE;
	}

} //MicroFactoryImpl
