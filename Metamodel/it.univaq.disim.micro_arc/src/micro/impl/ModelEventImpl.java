/**
 */
package micro.impl;

import micro.AggregateService;
import micro.MicroPackage;
import micro.Model;
import micro.ModelEvent;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link micro.impl.ModelEventImpl#getModel <em>Model</em>}</li>
 *   <li>{@link micro.impl.ModelEventImpl#getAggregateService <em>Aggregate Service</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModelEventImpl extends NamedElementImpl implements ModelEvent {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelEventImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MicroPackage.Literals.MODEL_EVENT;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MicroPackage.MODEL_EVENT__MODEL, oldModel, model));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MicroPackage.MODEL_EVENT__MODEL, oldModel, model));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AggregateService getAggregateService() {
		if (eContainerFeatureID() != MicroPackage.MODEL_EVENT__AGGREGATE_SERVICE) return null;
		return (AggregateService)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAggregateService(AggregateService newAggregateService, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newAggregateService, MicroPackage.MODEL_EVENT__AGGREGATE_SERVICE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAggregateService(AggregateService newAggregateService) {
		if (newAggregateService != eInternalContainer() || (eContainerFeatureID() != MicroPackage.MODEL_EVENT__AGGREGATE_SERVICE && newAggregateService != null)) {
			if (EcoreUtil.isAncestor(this, newAggregateService))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newAggregateService != null)
				msgs = ((InternalEObject)newAggregateService).eInverseAdd(this, MicroPackage.AGGREGATE_SERVICE__MODEL_EVENTS, AggregateService.class, msgs);
			msgs = basicSetAggregateService(newAggregateService, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MicroPackage.MODEL_EVENT__AGGREGATE_SERVICE, newAggregateService, newAggregateService));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MicroPackage.MODEL_EVENT__AGGREGATE_SERVICE:
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
			case MicroPackage.MODEL_EVENT__AGGREGATE_SERVICE:
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
			case MicroPackage.MODEL_EVENT__AGGREGATE_SERVICE:
				return eInternalContainer().eInverseRemove(this, MicroPackage.AGGREGATE_SERVICE__MODEL_EVENTS, AggregateService.class, msgs);
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
			case MicroPackage.MODEL_EVENT__MODEL:
				if (resolve) return getModel();
				return basicGetModel();
			case MicroPackage.MODEL_EVENT__AGGREGATE_SERVICE:
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
			case MicroPackage.MODEL_EVENT__MODEL:
				setModel((Model)newValue);
				return;
			case MicroPackage.MODEL_EVENT__AGGREGATE_SERVICE:
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
			case MicroPackage.MODEL_EVENT__MODEL:
				setModel((Model)null);
				return;
			case MicroPackage.MODEL_EVENT__AGGREGATE_SERVICE:
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
			case MicroPackage.MODEL_EVENT__MODEL:
				return model != null;
			case MicroPackage.MODEL_EVENT__AGGREGATE_SERVICE:
				return getAggregateService() != null;
		}
		return super.eIsSet(featureID);
	}

} //ModelEventImpl
