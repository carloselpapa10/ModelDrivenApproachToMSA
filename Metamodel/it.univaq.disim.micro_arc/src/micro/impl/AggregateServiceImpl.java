/**
 */
package micro.impl;

import java.util.Collection;

import micro.API;
import micro.AggregateService;
import micro.MicroPackage;
import micro.Model;
import micro.ModelEvent;
import micro.Operation;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Aggregate Service</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link micro.impl.AggregateServiceImpl#getModelEvents <em>Model Events</em>}</li>
 *   <li>{@link micro.impl.AggregateServiceImpl#getOperation <em>Operation</em>}</li>
 *   <li>{@link micro.impl.AggregateServiceImpl#getApi <em>Api</em>}</li>
 *   <li>{@link micro.impl.AggregateServiceImpl#getHandleModelEvents <em>Handle Model Events</em>}</li>
 *   <li>{@link micro.impl.AggregateServiceImpl#getModels <em>Models</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AggregateServiceImpl extends ServiceImpl implements AggregateService {
	/**
	 * The cached value of the '{@link #getModelEvents() <em>Model Events</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelEvents()
	 * @generated
	 * @ordered
	 */
	protected EList<ModelEvent> modelEvents;

	/**
	 * The cached value of the '{@link #getOperation() <em>Operation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperation()
	 * @generated
	 * @ordered
	 */
	protected EList<Operation> operation;

	/**
	 * The cached value of the '{@link #getApi() <em>Api</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApi()
	 * @generated
	 * @ordered
	 */
	protected API api;

	/**
	 * The cached value of the '{@link #getHandleModelEvents() <em>Handle Model Events</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHandleModelEvents()
	 * @generated
	 * @ordered
	 */
	protected EList<ModelEvent> handleModelEvents;

	/**
	 * The cached value of the '{@link #getModels() <em>Models</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModels()
	 * @generated
	 * @ordered
	 */
	protected EList<Model> models;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AggregateServiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MicroPackage.Literals.AGGREGATE_SERVICE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ModelEvent> getModelEvents() {
		if (modelEvents == null) {
			modelEvents = new EObjectContainmentWithInverseEList<ModelEvent>(ModelEvent.class, this, MicroPackage.AGGREGATE_SERVICE__MODEL_EVENTS, MicroPackage.MODEL_EVENT__AGGREGATE_SERVICE);
		}
		return modelEvents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Operation> getOperation() {
		if (operation == null) {
			operation = new EObjectContainmentWithInverseEList<Operation>(Operation.class, this, MicroPackage.AGGREGATE_SERVICE__OPERATION, MicroPackage.OPERATION__AGGREGATE_SERVICE);
		}
		return operation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public API getApi() {
		return api;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetApi(API newApi, NotificationChain msgs) {
		API oldApi = api;
		api = newApi;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MicroPackage.AGGREGATE_SERVICE__API, oldApi, newApi);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApi(API newApi) {
		if (newApi != api) {
			NotificationChain msgs = null;
			if (api != null)
				msgs = ((InternalEObject)api).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MicroPackage.AGGREGATE_SERVICE__API, null, msgs);
			if (newApi != null)
				msgs = ((InternalEObject)newApi).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MicroPackage.AGGREGATE_SERVICE__API, null, msgs);
			msgs = basicSetApi(newApi, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MicroPackage.AGGREGATE_SERVICE__API, newApi, newApi));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ModelEvent> getHandleModelEvents() {
		if (handleModelEvents == null) {
			handleModelEvents = new EObjectResolvingEList<ModelEvent>(ModelEvent.class, this, MicroPackage.AGGREGATE_SERVICE__HANDLE_MODEL_EVENTS);
		}
		return handleModelEvents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Model> getModels() {
		if (models == null) {
			models = new EObjectResolvingEList<Model>(Model.class, this, MicroPackage.AGGREGATE_SERVICE__MODELS);
		}
		return models;
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
			case MicroPackage.AGGREGATE_SERVICE__MODEL_EVENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getModelEvents()).basicAdd(otherEnd, msgs);
			case MicroPackage.AGGREGATE_SERVICE__OPERATION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOperation()).basicAdd(otherEnd, msgs);
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
			case MicroPackage.AGGREGATE_SERVICE__MODEL_EVENTS:
				return ((InternalEList<?>)getModelEvents()).basicRemove(otherEnd, msgs);
			case MicroPackage.AGGREGATE_SERVICE__OPERATION:
				return ((InternalEList<?>)getOperation()).basicRemove(otherEnd, msgs);
			case MicroPackage.AGGREGATE_SERVICE__API:
				return basicSetApi(null, msgs);
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
			case MicroPackage.AGGREGATE_SERVICE__MODEL_EVENTS:
				return getModelEvents();
			case MicroPackage.AGGREGATE_SERVICE__OPERATION:
				return getOperation();
			case MicroPackage.AGGREGATE_SERVICE__API:
				return getApi();
			case MicroPackage.AGGREGATE_SERVICE__HANDLE_MODEL_EVENTS:
				return getHandleModelEvents();
			case MicroPackage.AGGREGATE_SERVICE__MODELS:
				return getModels();
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
			case MicroPackage.AGGREGATE_SERVICE__MODEL_EVENTS:
				getModelEvents().clear();
				getModelEvents().addAll((Collection<? extends ModelEvent>)newValue);
				return;
			case MicroPackage.AGGREGATE_SERVICE__OPERATION:
				getOperation().clear();
				getOperation().addAll((Collection<? extends Operation>)newValue);
				return;
			case MicroPackage.AGGREGATE_SERVICE__API:
				setApi((API)newValue);
				return;
			case MicroPackage.AGGREGATE_SERVICE__HANDLE_MODEL_EVENTS:
				getHandleModelEvents().clear();
				getHandleModelEvents().addAll((Collection<? extends ModelEvent>)newValue);
				return;
			case MicroPackage.AGGREGATE_SERVICE__MODELS:
				getModels().clear();
				getModels().addAll((Collection<? extends Model>)newValue);
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
			case MicroPackage.AGGREGATE_SERVICE__MODEL_EVENTS:
				getModelEvents().clear();
				return;
			case MicroPackage.AGGREGATE_SERVICE__OPERATION:
				getOperation().clear();
				return;
			case MicroPackage.AGGREGATE_SERVICE__API:
				setApi((API)null);
				return;
			case MicroPackage.AGGREGATE_SERVICE__HANDLE_MODEL_EVENTS:
				getHandleModelEvents().clear();
				return;
			case MicroPackage.AGGREGATE_SERVICE__MODELS:
				getModels().clear();
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
			case MicroPackage.AGGREGATE_SERVICE__MODEL_EVENTS:
				return modelEvents != null && !modelEvents.isEmpty();
			case MicroPackage.AGGREGATE_SERVICE__OPERATION:
				return operation != null && !operation.isEmpty();
			case MicroPackage.AGGREGATE_SERVICE__API:
				return api != null;
			case MicroPackage.AGGREGATE_SERVICE__HANDLE_MODEL_EVENTS:
				return handleModelEvents != null && !handleModelEvents.isEmpty();
			case MicroPackage.AGGREGATE_SERVICE__MODELS:
				return models != null && !models.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AggregateServiceImpl
