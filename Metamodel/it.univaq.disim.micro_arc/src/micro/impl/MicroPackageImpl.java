/**
 */
package micro.impl;

import micro.AggregateService;
import micro.Attribute;
import micro.AttributePrimitiveValue;
import micro.CRUDOperation;
import micro.Command;
import micro.CommandType;
import micro.Data;
import micro.Event;
import micro.Info;
import micro.MicroFactory;
import micro.MicroPackage;
import micro.MicroserviceArchitecture;
import micro.Model;
import micro.ModelEvent;
import micro.NamedElement;
import micro.Operation;
import micro.PrimitiveTypeAttribute;
import micro.ReferenceAttribute;
import micro.Saga;
import micro.Service;
import micro.Step;
import micro.ViewService;

import micro.util.MicroValidator;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MicroPackageImpl extends EPackageImpl implements MicroPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass microserviceArchitectureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aggregateServiceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass viewServiceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass apiEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass commandEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass infoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sagaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass referenceAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass primitiveTypeAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum crudOperationEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum commandTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum attributePrimitiveValueEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see micro.MicroPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private MicroPackageImpl() {
		super(eNS_URI, MicroFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link MicroPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static MicroPackage init() {
		if (isInited) return (MicroPackage)EPackage.Registry.INSTANCE.getEPackage(MicroPackage.eNS_URI);

		// Obtain or create and register package
		MicroPackageImpl theMicroPackage = (MicroPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof MicroPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new MicroPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theMicroPackage.createPackageContents();

		// Initialize created meta-data
		theMicroPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theMicroPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return MicroValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theMicroPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(MicroPackage.eNS_URI, theMicroPackage);
		return theMicroPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMicroserviceArchitecture() {
		return microserviceArchitectureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMicroserviceArchitecture_Services() {
		return (EReference)microserviceArchitectureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMicroserviceArchitecture_Models() {
		return (EReference)microserviceArchitectureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getService() {
		return serviceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getService_Fullname() {
		return (EAttribute)serviceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getService_Description() {
		return (EAttribute)serviceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getService_Shortname() {
		return (EAttribute)serviceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getService_Port() {
		return (EAttribute)serviceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModel() {
		return modelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModel_Attributes() {
		return (EReference)modelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModelEvent() {
		return modelEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelEvent_Model() {
		return (EReference)modelEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelEvent_AggregateService() {
		return (EReference)modelEventEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAggregateService() {
		return aggregateServiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAggregateService_ModelEvents() {
		return (EReference)aggregateServiceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAggregateService_Operation() {
		return (EReference)aggregateServiceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAggregateService_Api() {
		return (EReference)aggregateServiceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAggregateService_HandleModelEvents() {
		return (EReference)aggregateServiceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAggregateService_Models() {
		return (EReference)aggregateServiceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getViewService() {
		return viewServiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getViewService_ReplicateServices() {
		return (EReference)viewServiceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOperation() {
		return operationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperation_OperationType() {
		return (EAttribute)operationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperation_Publish() {
		return (EReference)operationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperation_Saga() {
		return (EReference)operationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperation_Model() {
		return (EReference)operationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperation_IsMethodController() {
		return (EAttribute)operationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperation_AggregateService() {
		return (EReference)operationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNamedElement() {
		return namedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNamedElement_Name() {
		return (EAttribute)namedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAPI() {
		return apiEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAPI_Events() {
		return (EReference)apiEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAPI_Commands() {
		return (EReference)apiEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAPI_Infos() {
		return (EReference)apiEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCommand() {
		return commandEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCommand_CommandType() {
		return (EAttribute)commandEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommand_ReplyInfo() {
		return (EReference)commandEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCommand_IsReplyInfoMany() {
		return (EAttribute)commandEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommand_Api() {
		return (EReference)commandEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEvent() {
		return eventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEvent_Api() {
		return (EReference)eventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInfo() {
		return infoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInfo_Dto() {
		return (EReference)infoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInfo_Api() {
		return (EReference)infoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStep() {
		return stepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStep_Commands() {
		return (EReference)stepEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSaga() {
		return sagaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSaga_Steps() {
		return (EReference)sagaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSaga_Data() {
		return (EReference)sagaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getData() {
		return dataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttribute() {
		return attributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttribute_Name() {
		return (EAttribute)attributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttribute_IsMany() {
		return (EAttribute)attributeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttribute_IsId() {
		return (EAttribute)attributeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttribute_IsGenerated() {
		return (EAttribute)attributeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttribute_Model() {
		return (EReference)attributeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReferenceAttribute() {
		return referenceAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReferenceAttribute_Type() {
		return (EReference)referenceAttributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPrimitiveTypeAttribute() {
		return primitiveTypeAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPrimitiveTypeAttribute_Type() {
		return (EAttribute)primitiveTypeAttributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPrimitiveTypeAttribute_ModelToView() {
		return (EReference)primitiveTypeAttributeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCRUDOperation() {
		return crudOperationEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCommandType() {
		return commandTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAttributePrimitiveValue() {
		return attributePrimitiveValueEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MicroFactory getMicroFactory() {
		return (MicroFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		microserviceArchitectureEClass = createEClass(MICROSERVICE_ARCHITECTURE);
		createEReference(microserviceArchitectureEClass, MICROSERVICE_ARCHITECTURE__SERVICES);
		createEReference(microserviceArchitectureEClass, MICROSERVICE_ARCHITECTURE__MODELS);

		serviceEClass = createEClass(SERVICE);
		createEAttribute(serviceEClass, SERVICE__FULLNAME);
		createEAttribute(serviceEClass, SERVICE__DESCRIPTION);
		createEAttribute(serviceEClass, SERVICE__SHORTNAME);
		createEAttribute(serviceEClass, SERVICE__PORT);

		modelEClass = createEClass(MODEL);
		createEReference(modelEClass, MODEL__ATTRIBUTES);

		modelEventEClass = createEClass(MODEL_EVENT);
		createEReference(modelEventEClass, MODEL_EVENT__MODEL);
		createEReference(modelEventEClass, MODEL_EVENT__AGGREGATE_SERVICE);

		aggregateServiceEClass = createEClass(AGGREGATE_SERVICE);
		createEReference(aggregateServiceEClass, AGGREGATE_SERVICE__MODEL_EVENTS);
		createEReference(aggregateServiceEClass, AGGREGATE_SERVICE__OPERATION);
		createEReference(aggregateServiceEClass, AGGREGATE_SERVICE__API);
		createEReference(aggregateServiceEClass, AGGREGATE_SERVICE__HANDLE_MODEL_EVENTS);
		createEReference(aggregateServiceEClass, AGGREGATE_SERVICE__MODELS);

		viewServiceEClass = createEClass(VIEW_SERVICE);
		createEReference(viewServiceEClass, VIEW_SERVICE__REPLICATE_SERVICES);

		operationEClass = createEClass(OPERATION);
		createEAttribute(operationEClass, OPERATION__OPERATION_TYPE);
		createEReference(operationEClass, OPERATION__PUBLISH);
		createEReference(operationEClass, OPERATION__SAGA);
		createEReference(operationEClass, OPERATION__MODEL);
		createEAttribute(operationEClass, OPERATION__IS_METHOD_CONTROLLER);
		createEReference(operationEClass, OPERATION__AGGREGATE_SERVICE);

		namedElementEClass = createEClass(NAMED_ELEMENT);
		createEAttribute(namedElementEClass, NAMED_ELEMENT__NAME);

		apiEClass = createEClass(API);
		createEReference(apiEClass, API__EVENTS);
		createEReference(apiEClass, API__COMMANDS);
		createEReference(apiEClass, API__INFOS);

		commandEClass = createEClass(COMMAND);
		createEAttribute(commandEClass, COMMAND__COMMAND_TYPE);
		createEReference(commandEClass, COMMAND__REPLY_INFO);
		createEAttribute(commandEClass, COMMAND__IS_REPLY_INFO_MANY);
		createEReference(commandEClass, COMMAND__API);

		eventEClass = createEClass(EVENT);
		createEReference(eventEClass, EVENT__API);

		infoEClass = createEClass(INFO);
		createEReference(infoEClass, INFO__DTO);
		createEReference(infoEClass, INFO__API);

		stepEClass = createEClass(STEP);
		createEReference(stepEClass, STEP__COMMANDS);

		sagaEClass = createEClass(SAGA);
		createEReference(sagaEClass, SAGA__STEPS);
		createEReference(sagaEClass, SAGA__DATA);

		dataEClass = createEClass(DATA);

		attributeEClass = createEClass(ATTRIBUTE);
		createEAttribute(attributeEClass, ATTRIBUTE__NAME);
		createEAttribute(attributeEClass, ATTRIBUTE__IS_MANY);
		createEAttribute(attributeEClass, ATTRIBUTE__IS_ID);
		createEAttribute(attributeEClass, ATTRIBUTE__IS_GENERATED);
		createEReference(attributeEClass, ATTRIBUTE__MODEL);

		referenceAttributeEClass = createEClass(REFERENCE_ATTRIBUTE);
		createEReference(referenceAttributeEClass, REFERENCE_ATTRIBUTE__TYPE);

		primitiveTypeAttributeEClass = createEClass(PRIMITIVE_TYPE_ATTRIBUTE);
		createEAttribute(primitiveTypeAttributeEClass, PRIMITIVE_TYPE_ATTRIBUTE__TYPE);
		createEReference(primitiveTypeAttributeEClass, PRIMITIVE_TYPE_ATTRIBUTE__MODEL_TO_VIEW);

		// Create enums
		crudOperationEEnum = createEEnum(CRUD_OPERATION);
		commandTypeEEnum = createEEnum(COMMAND_TYPE);
		attributePrimitiveValueEEnum = createEEnum(ATTRIBUTE_PRIMITIVE_VALUE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		microserviceArchitectureEClass.getESuperTypes().add(this.getNamedElement());
		serviceEClass.getESuperTypes().add(this.getNamedElement());
		modelEClass.getESuperTypes().add(this.getNamedElement());
		modelEventEClass.getESuperTypes().add(this.getNamedElement());
		aggregateServiceEClass.getESuperTypes().add(this.getService());
		viewServiceEClass.getESuperTypes().add(this.getService());
		operationEClass.getESuperTypes().add(this.getNamedElement());
		apiEClass.getESuperTypes().add(this.getNamedElement());
		commandEClass.getESuperTypes().add(this.getNamedElement());
		eventEClass.getESuperTypes().add(this.getNamedElement());
		infoEClass.getESuperTypes().add(this.getNamedElement());
		stepEClass.getESuperTypes().add(this.getNamedElement());
		sagaEClass.getESuperTypes().add(this.getNamedElement());
		dataEClass.getESuperTypes().add(this.getNamedElement());
		referenceAttributeEClass.getESuperTypes().add(this.getAttribute());
		primitiveTypeAttributeEClass.getESuperTypes().add(this.getAttribute());

		// Initialize classes, features, and operations; add parameters
		initEClass(microserviceArchitectureEClass, MicroserviceArchitecture.class, "MicroserviceArchitecture", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMicroserviceArchitecture_Services(), this.getService(), null, "services", null, 0, -1, MicroserviceArchitecture.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMicroserviceArchitecture_Models(), this.getModel(), null, "models", null, 0, -1, MicroserviceArchitecture.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serviceEClass, Service.class, "Service", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getService_Fullname(), ecorePackage.getEString(), "fullname", "", 0, 1, Service.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getService_Description(), ecorePackage.getEString(), "description", null, 0, 1, Service.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getService_Shortname(), ecorePackage.getEString(), "shortname", null, 0, 1, Service.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getService_Port(), ecorePackage.getEInt(), "port", "8888", 0, 1, Service.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(modelEClass, Model.class, "Model", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModel_Attributes(), this.getAttribute(), this.getAttribute_Model(), "attributes", null, 1, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(modelEventEClass, ModelEvent.class, "ModelEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModelEvent_Model(), this.getModel(), null, "model", null, 1, 1, ModelEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModelEvent_AggregateService(), this.getAggregateService(), this.getAggregateService_ModelEvents(), "aggregateService", null, 0, 1, ModelEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(aggregateServiceEClass, AggregateService.class, "AggregateService", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAggregateService_ModelEvents(), this.getModelEvent(), this.getModelEvent_AggregateService(), "modelEvents", null, 1, -1, AggregateService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAggregateService_Operation(), this.getOperation(), this.getOperation_AggregateService(), "operation", null, 1, -1, AggregateService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAggregateService_Api(), this.getAPI(), null, "api", null, 1, 1, AggregateService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAggregateService_HandleModelEvents(), this.getModelEvent(), null, "handleModelEvents", null, 0, -1, AggregateService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAggregateService_Models(), this.getModel(), null, "models", null, 1, -1, AggregateService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(viewServiceEClass, ViewService.class, "ViewService", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getViewService_ReplicateServices(), this.getAggregateService(), null, "replicateServices", null, 0, -1, ViewService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(operationEClass, Operation.class, "Operation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOperation_OperationType(), this.getCRUDOperation(), "operationType", null, 0, 1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOperation_Publish(), this.getEvent(), null, "publish", null, 0, 1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOperation_Saga(), this.getSaga(), null, "Saga", null, 0, 1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOperation_Model(), this.getModel(), null, "model", null, 1, 1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOperation_IsMethodController(), ecorePackage.getEBoolean(), "isMethodController", null, 0, 1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOperation_AggregateService(), this.getAggregateService(), this.getAggregateService_Operation(), "aggregateService", null, 0, 1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(namedElementEClass, NamedElement.class, "NamedElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNamedElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, NamedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(apiEClass, micro.API.class, "API", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAPI_Events(), this.getEvent(), this.getEvent_Api(), "events", null, 1, -1, micro.API.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAPI_Commands(), this.getCommand(), this.getCommand_Api(), "commands", null, 1, -1, micro.API.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAPI_Infos(), this.getInfo(), this.getInfo_Api(), "infos", null, 1, -1, micro.API.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(commandEClass, Command.class, "Command", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCommand_CommandType(), this.getCommandType(), "commandType", null, 0, 1, Command.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCommand_ReplyInfo(), this.getInfo(), null, "replyInfo", null, 0, 1, Command.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCommand_IsReplyInfoMany(), ecorePackage.getEBoolean(), "isReplyInfoMany", null, 0, 1, Command.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCommand_Api(), this.getAPI(), this.getAPI_Commands(), "api", null, 0, 1, Command.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(eventEClass, Event.class, "Event", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEvent_Api(), this.getAPI(), this.getAPI_Events(), "api", null, 0, 1, Event.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(infoEClass, Info.class, "Info", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInfo_Dto(), this.getModel(), null, "dto", null, 0, 1, Info.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInfo_Api(), this.getAPI(), this.getAPI_Infos(), "api", null, 0, 1, Info.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(stepEClass, Step.class, "Step", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStep_Commands(), this.getCommand(), null, "commands", null, 1, -1, Step.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sagaEClass, Saga.class, "Saga", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSaga_Steps(), this.getStep(), null, "Steps", null, 1, -1, Saga.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSaga_Data(), this.getData(), null, "Data", null, 1, 1, Saga.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataEClass, Data.class, "Data", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(attributeEClass, Attribute.class, "Attribute", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAttribute_Name(), ecorePackage.getEString(), "name", null, 0, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttribute_IsMany(), ecorePackage.getEBoolean(), "isMany", null, 0, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttribute_IsId(), ecorePackage.getEBoolean(), "isId", null, 0, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttribute_IsGenerated(), ecorePackage.getEBoolean(), "isGenerated", null, 0, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAttribute_Model(), this.getModel(), this.getModel_Attributes(), "model", null, 0, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(referenceAttributeEClass, ReferenceAttribute.class, "ReferenceAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReferenceAttribute_Type(), this.getModel(), null, "type", null, 1, 1, ReferenceAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(primitiveTypeAttributeEClass, PrimitiveTypeAttribute.class, "PrimitiveTypeAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPrimitiveTypeAttribute_Type(), this.getAttributePrimitiveValue(), "type", null, 1, 1, PrimitiveTypeAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPrimitiveTypeAttribute_ModelToView(), this.getModel(), null, "ModelToView", null, 0, 1, PrimitiveTypeAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(crudOperationEEnum, CRUDOperation.class, "CRUDOperation");
		addEEnumLiteral(crudOperationEEnum, CRUDOperation.CREATE);
		addEEnumLiteral(crudOperationEEnum, CRUDOperation.UPDATE);
		addEEnumLiteral(crudOperationEEnum, CRUDOperation.DELETE);
		addEEnumLiteral(crudOperationEEnum, CRUDOperation.RETRIEVE);

		initEEnum(commandTypeEEnum, CommandType.class, "CommandType");
		addEEnumLiteral(commandTypeEEnum, CommandType.COMPENSATE);
		addEEnumLiteral(commandTypeEEnum, CommandType.INVOKE);
		addEEnumLiteral(commandTypeEEnum, CommandType.REPLY);

		initEEnum(attributePrimitiveValueEEnum, AttributePrimitiveValue.class, "AttributePrimitiveValue");
		addEEnumLiteral(attributePrimitiveValueEEnum, AttributePrimitiveValue.STRING);
		addEEnumLiteral(attributePrimitiveValueEEnum, AttributePrimitiveValue.INT);
		addEEnumLiteral(attributePrimitiveValueEEnum, AttributePrimitiveValue.BOOLEAN);
		addEEnumLiteral(attributePrimitiveValueEEnum, AttributePrimitiveValue.CHAR);
		addEEnumLiteral(attributePrimitiveValueEEnum, AttributePrimitiveValue.FLOAT);
		addEEnumLiteral(attributePrimitiveValueEEnum, AttributePrimitiveValue.LONG);
		addEEnumLiteral(attributePrimitiveValueEEnum, AttributePrimitiveValue.SHORT);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot
		createPivotAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "invocationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
			 "settingDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
			 "validationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot"
		   });	
		addAnnotation
		  (serviceEClass, 
		   source, 
		   new String[] {
			 "constraints", "ServiceNameMustBeUnique ServiceFullnameMustBeUnique ServiceShortNameMustBeUnique ServicePortMustBeUnique ServiceReservedPortNumbers MustHaveFullname FullnameMustNotContainWhiteSpace MustHaveShortname ShortnameMustNotContainWhiteSpace"
		   });	
		addAnnotation
		  (modelEClass, 
		   source, 
		   new String[] {
			 "constraints", "ModelNameMustBeUnique ModelMustBeContainedInOneAggService"
		   });	
		addAnnotation
		  (modelEventEClass, 
		   source, 
		   new String[] {
			 "constraints", "ModelEventNameMustBeUnique ModelMustBelongToCurrentAggregateService"
		   });	
		addAnnotation
		  (operationEClass, 
		   source, 
		   new String[] {
			 "constraints", "SagaNameMustBeUnique OperationNameMustBeUnique OperationModelMustBelongToSameAggregateService OperationMustPublishEvent OperationEventPublishedMustBelongToCurrentAggregateService"
		   });	
		addAnnotation
		  (namedElementEClass, 
		   source, 
		   new String[] {
			 "constraints", "NameMustNotContainWhiteSpace NameMustNotBeEmpty"
		   });	
		addAnnotation
		  (commandEClass, 
		   source, 
		   new String[] {
			 "constraints", "CommandNameMustBeUnique CommandReplyMustHaveReplyInfo CommandReplyInfoMustBelongToCurrentAggregateService"
		   });	
		addAnnotation
		  (eventEClass, 
		   source, 
		   new String[] {
			 "constraints", "EventNameMustBeUnique"
		   });	
		addAnnotation
		  (infoEClass, 
		   source, 
		   new String[] {
			 "constraints", "InfoNameMustBeUnique"
		   });	
		addAnnotation
		  (attributeEClass, 
		   source, 
		   new String[] {
			 "constraints", "ModelAttributeNameMustBeUnique ModelAttributeIdMustBeUnique ModelAttributeIdMustBeNoList ModelAttributeIsGeneratedOnlyWithId"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createPivotAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot";	
		addAnnotation
		  (serviceEClass, 
		   source, 
		   new String[] {
			 "ServiceNameMustBeUnique", "MicroserviceArchitecture.allInstances().services->select(s : Service | s.name = self.name)->size() = 1",
			 "ServiceFullnameMustBeUnique", "MicroserviceArchitecture.allInstances().services->select(s : Service | s.fullname = self.fullname)->size() = 1",
			 "ServiceShortNameMustBeUnique", "MicroserviceArchitecture.allInstances().services->select(s : Service | s.shortname = self.shortname)->size() = 1",
			 "ServicePortMustBeUnique", "MicroserviceArchitecture.allInstances().services->select(s : Service | s.port = self.port)->size() = 1",
			 "ServiceReservedPortNumbers", "MicroserviceArchitecture.allInstances().services->select(s : Service | (s = self and (s.port.toString() = \'27017\' or s.port.toString() = \'8099\' or s.port.toString() = \'3306\' or s.port.toString() = \'9092\' or s.port.toString() = \'2888\' or s.port.toString() = \'3888\' or s.port.toString() = \'5020\')))->size() = 0",
			 "MustHaveFullname", "fullname <> \'\'",
			 "FullnameMustNotContainWhiteSpace", "fullname.toString().characters()->select(c : String | c = \' \')->size() = 0",
			 "MustHaveShortname", "shortname <> \'\'",
			 "ShortnameMustNotContainWhiteSpace", "shortname.toString().characters()->select(c : String | c = \' \')->size() = 0"
		   });	
		addAnnotation
		  (modelEClass, 
		   source, 
		   new String[] {
			 "ModelNameMustBeUnique", "MicroserviceArchitecture.allInstances().models->select(s : Model | s.name = self.name)->size() = 1",
			 "ModelMustBeContainedInOneAggService", "MicroserviceArchitecture.allInstances().services->select(s : Service | s.oclIsTypeOf(AggregateService)).oclAsType(AggregateService).models->select(m : Model | m = self)->size() = 1"
		   });	
		addAnnotation
		  (modelEventEClass, 
		   source, 
		   new String[] {
			 "ModelEventNameMustBeUnique", "aggregateService.modelEvents->select(m : ModelEvent | m.name = self.name)->size() = 1",
			 "ModelMustBelongToCurrentAggregateService", "MicroserviceArchitecture.allInstances().services->select(s : Service | s.name = aggregateService.name).oclAsType(AggregateService).models->select(m : Model | m = self.model)->size() = 1"
		   });	
		addAnnotation
		  (operationEClass, 
		   source, 
		   new String[] {
			 "SagaNameMustBeUnique", "aggregateService.operation->select(o : Operation | (o.Saga.oclIsUndefined() = false and self.Saga.oclIsUndefined() = false))->select(s : Operation | (s.Saga.name = self.Saga.name))->size() <= 1",
			 "OperationNameMustBeUnique", "aggregateService.operation->select(o : Operation | (o.name = self.name and o.operationType.toString() = self.operationType.toString()))->size() = 1",
			 "OperationModelMustBelongToSameAggregateService", "aggregateService.models->select(m : Model | m.name = self.model.name)->size() = 1",
			 "OperationMustPublishEvent", "self.operationType.toString() <> CRUDOperation::retrieve.toString() and self.publish <> null or self.operationType.toString() = CRUDOperation::retrieve.toString() or self.operationType.toString() = CRUDOperation::update.toString() and self.Saga.oclIsUndefined() = false",
			 "OperationEventPublishedMustBelongToCurrentAggregateService", "aggregateService.api.events->select(e : Event | (self.publish <> null and self.publish.name = e.name))->size() = 1 or self.operationType.toString() = CRUDOperation::retrieve.toString() or self.operationType.toString() = CRUDOperation::update.toString() and self.Saga.oclIsUndefined() = false"
		   });	
		addAnnotation
		  (namedElementEClass, 
		   source, 
		   new String[] {
			 "NameMustNotContainWhiteSpace", "name.toString().characters()->select(c : String | c = \' \')->size() = 0",
			 "NameMustNotBeEmpty", "name <> \'\'"
		   });	
		addAnnotation
		  (commandEClass, 
		   source, 
		   new String[] {
			 "CommandNameMustBeUnique", "api.commands->select(c : Command | c.name = self.name)->size() = 1",
			 "CommandReplyMustHaveReplyInfo", "commandType.toString() = CommandType::reply.toString() and replyInfo <> null or commandType.toString() <> CommandType::reply.toString()",
			 "CommandReplyInfoMustBelongToCurrentAggregateService", "api.infos->select(i : Info | i.name = replyInfo.name)->size() = 1 or commandType.toString() <> CommandType::reply.toString()"
		   });	
		addAnnotation
		  (eventEClass, 
		   source, 
		   new String[] {
			 "EventNameMustBeUnique", "api.events->select(e : Event | e.name = self.name)->size() = 1"
		   });	
		addAnnotation
		  (infoEClass, 
		   source, 
		   new String[] {
			 "InfoNameMustBeUnique", "api.infos->select(i : Info | i.name = self.name)->size() = 1"
		   });	
		addAnnotation
		  (attributeEClass, 
		   source, 
		   new String[] {
			 "ModelAttributeNameMustBeUnique", "model.attributes->select(a : Attribute | a.name = self.name)->size() = 1",
			 "ModelAttributeIdMustBeUnique", "model.attributes->select(a : Attribute | a.isId = true)->size() = 1",
			 "ModelAttributeIdMustBeNoList", "model.attributes->select(a : Attribute | (a.isId = true and a.isMany = false))->size() = 1",
			 "ModelAttributeIsGeneratedOnlyWithId", "model.attributes->select(a : Attribute | (a.isId = false and a.isGenerated = true))->size() = 0"
		   });
	}

} //MicroPackageImpl
