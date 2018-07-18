/**
 */
package micro.impl;

import micro.AggregateService;
import micro.CRUDOperation;
import micro.Event;
import micro.MicroPackage;
import micro.Model;
import micro.Operation;
import micro.Saga;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link micro.impl.OperationImpl#getOperationType <em>Operation Type</em>}</li>
 *   <li>{@link micro.impl.OperationImpl#getPublish <em>Publish</em>}</li>
 *   <li>{@link micro.impl.OperationImpl#getSaga <em>Saga</em>}</li>
 *   <li>{@link micro.impl.OperationImpl#getModel <em>Model</em>}</li>
 *   <li>{@link micro.impl.OperationImpl#isIsMethodController <em>Is Method Controller</em>}</li>
 *   <li>{@link micro.impl.OperationImpl#getAggregateService <em>Aggregate Service</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OperationImpl extends NamedElementImpl implements Operation {
	/**
	 * The default value of the '{@link #getOperationType() <em>Operation Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperationType()
	 * @generated
	 * @ordered
	 */
	protected static final CRUDOperation OPERATION_TYPE_EDEFAULT = CRUDOperation.CREATE;

	/**
	 * The cached value of the '{@link #getOperationType() <em>Operation Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperationType()
	 * @generated
	 * @ordered
	 */
	protected CRUDOperation operationType = OPERATION_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPublish() <em>Publish</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublish()
	 * @generated
	 * @ordered
	 */
	protected Event publish;

	/**
	 * The cached value of the '{@link #getSaga() <em>Saga</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSaga()
	 * @generated
	 * @ordered
	 */
	protected Saga saga;

	/**
	 * The cached value of the '{@link #getModel() <em>Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModel()
	 * @generated
	 * @ordered
	 */
	protected Model model;

	/**
	 * The default value of the '{@link #isIsMethodController() <em>Is Method Controller</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsMethodController()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_METHOD_CONTROLLER_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsMethodController() <em>Is Method Controller</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsMethodController()
	 * @generated
	 * @ordered
	 */
	protected boolean isMethodController = IS_METHOD_CONTROLLER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MicroPackage.Literals.OPERATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CRUDOperation getOperationType() {
		return operationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperationType(CRUDOperation newOperationType) {
		CRUDOperation oldOperationType = operationType;
		operationType = newOperationType == null ? OPERATION_TYPE_EDEFAULT : newOperationType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MicroPackage.OPERATION__OPERATION_TYPE, oldOperationType, operationType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Event getPublish() {
		if (publish != null && publish.eIsProxy()) {
			InternalEObject oldPublish = (InternalEObject)publish;
			publish = (Event)eResolveProxy(oldPublish);
			if (publish != oldPublish) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MicroPackage.OPERATION__PUBLISH, oldPublish, publish));
			}
		}
		return publish;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Event basicGetPublish() {
		return publish;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPublish(Event newPublish) {
		Event oldPublish = publish;
		publish = newPublish;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MicroPackage.OPERATION__PUBLISH, oldPublish, publish));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Saga getSaga() {
		return saga;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSaga(Saga newSaga, NotificationChain msgs) {
		Saga oldSaga = saga;
		saga = newSaga;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MicroPackage.OPERATION__SAGA, oldSaga, newSaga);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSaga(Saga newSaga) {
		if (newSaga != saga) {
			NotificationChain msgs = null;
			if (saga != null)
				msgs = ((InternalEObject)saga).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MicroPackage.OPERATION__SAGA, null, msgs);
			if (newSaga != null)
				msgs = ((InternalEObject)newSaga).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MicroPackage.OPERATION__SAGA, null, msgs);
			msgs = basicSetSaga(newSaga, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MicroPackage.OPERATION__SAGA, newSaga, newSaga));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Model getModel() {
		if (model != null && model.eIsProxy()) {
			InternalEObject oldModel = (InternalEObject)model;
			model = (Model)eResolveProxy(oldModel);
			if (model != oldModel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MicroPackage.OPERATION__MODEL, oldModel, model));
			}
		}
		return model;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Model basicGetModel() {
		return model;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModel(Model newModel) {
		Model oldModel = model;
		model = newModel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MicroPackage.OPERATION__MODEL, oldModel, model));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsMethodController() {
		return isMethodController;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsMethodController(boolean newIsMethodController) {
		boolean oldIsMethodController = isMethodController;
		isMethodController = newIsMethodController;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MicroPackage.OPERATION__IS_METHOD_CONTROLLER, oldIsMethodController, isMethodController));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AggregateService getAggregateService() {
		if (eContainerFeatureID() != MicroPackage.OPERATION__AGGREGATE_SERVICE) return null;
		return (AggregateService)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAggregateService(AggregateService newAggregateService, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newAggregateService, MicroPackage.OPERATION__AGGREGATE_SERVICE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAggregateService(AggregateService newAggregateService) {
		if (newAggregateService != eInternalContainer() || (eContainerFeatureID() != MicroPackage.OPERATION__AGGREGATE_SERVICE && newAggregateService != null)) {
			if (EcoreUtil.isAncestor(this, newAggregateService))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newAggregateService != null)
				msgs = ((InternalEObject)newAggregateService).eInverseAdd(this, MicroPackage.AGGREGATE_SERVICE__OPERATION, AggregateService.class, msgs);
			msgs = basicSetAggregateService(newAggregateService, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MicroPackage.OPERATION__AGGREGATE_SERVICE, newAggregateService, newAggregateService));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MicroPackage.OPERATION__AGGREGATE_SERVICE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetAggregateService((AggregateService)otherEnd, msgs);
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
			case MicroPackage.OPERATION__SAGA:
				return basicSetSaga(null, msgs);
			case MicroPackage.OPERATION__AGGREGATE_SERVICE:
				return basicSetAggregateService(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case MicroPackage.OPERATION__AGGREGATE_SERVICE:
				return eInternalContainer().eInverseRemove(this, MicroPackage.AGGREGATE_SERVICE__OPERATION, AggregateService.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MicroPackage.OPERATION__OPERATION_TYPE:
				return getOperationType();
			case MicroPackage.OPERATION__PUBLISH:
				if (resolve) return getPublish();
				return basicGetPublish();
			case MicroPackage.OPERATION__SAGA:
				return getSaga();
			case MicroPackage.OPERATION__MODEL:
				if (resolve) return getModel();
				return basicGetModel();
			case MicroPackage.OPERATION__IS_METHOD_CONTROLLER:
				return isIsMethodController();
			case MicroPackage.OPERATION__AGGREGATE_SERVICE:
				return getAggregateService();
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
			case MicroPackage.OPERATION__OPERATION_TYPE:
				setOperationType((CRUDOperation)newValue);
				return;
			case MicroPackage.OPERATION__PUBLISH:
				setPublish((Event)newValue);
				return;
			case MicroPackage.OPERATION__SAGA:
				setSaga((Saga)newValue);
				return;
			case MicroPackage.OPERATION__MODEL:
				setModel((Model)newValue);
				return;
			case MicroPackage.OPERATION__IS_METHOD_CONTROLLER:
				setIsMethodController((Boolean)newValue);
				return;
			case MicroPackage.OPERATION__AGGREGATE_SERVICE:
				setAggregateService((AggregateService)newValue);
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
			case MicroPackage.OPERATION__OPERATION_TYPE:
				setOperationType(OPERATION_TYPE_EDEFAULT);
				return;
			case MicroPackage.OPERATION__PUBLISH:
				setPublish((Event)null);
				return;
			case MicroPackage.OPERATION__SAGA:
				setSaga((Saga)null);
				return;
			case MicroPackage.OPERATION__MODEL:
				setModel((Model)null);
				return;
			case MicroPackage.OPERATION__IS_METHOD_CONTROLLER:
				setIsMethodController(IS_METHOD_CONTROLLER_EDEFAULT);
				return;
			case MicroPackage.OPERATION__AGGREGATE_SERVICE:
				setAggregateService((AggregateService)null);
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
			case MicroPackage.OPERATION__OPERATION_TYPE:
				return operationType != OPERATION_TYPE_EDEFAULT;
			case MicroPackage.OPERATION__PUBLISH:
				return publish != null;
			case MicroPackage.OPERATION__SAGA:
				return saga != null;
			case MicroPackage.OPERATION__MODEL:
				return model != null;
			case MicroPackage.OPERATION__IS_METHOD_CONTROLLER:
				return isMethodController != IS_METHOD_CONTROLLER_EDEFAULT;
			case MicroPackage.OPERATION__AGGREGATE_SERVICE:
				return getAggregateService() != null;
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
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (operationType: ");
		result.append(operationType);
		result.append(", isMethodController: ");
		result.append(isMethodController);
		result.append(')');
		return result.toString();
	}

} //OperationImpl
