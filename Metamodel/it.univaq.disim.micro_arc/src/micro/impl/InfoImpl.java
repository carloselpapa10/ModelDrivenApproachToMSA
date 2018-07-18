/**
 */
package micro.impl;

import micro.API;
import micro.Info;
import micro.MicroPackage;
import micro.Model;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Info</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link micro.impl.InfoImpl#getDto <em>Dto</em>}</li>
 *   <li>{@link micro.impl.InfoImpl#getApi <em>Api</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InfoImpl extends NamedElementImpl implements Info {
	/**
	 * The cached value of the '{@link #getDto() <em>Dto</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDto()
	 * @generated
	 * @ordered
	 */
	protected Model dto;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InfoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MicroPackage.Literals.INFO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Model getDto() {
		if (dto != null && dto.eIsProxy()) {
			InternalEObject oldDto = (InternalEObject)dto;
			dto = (Model)eResolveProxy(oldDto);
			if (dto != oldDto) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MicroPackage.INFO__DTO, oldDto, dto));
			}
		}
		return dto;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Model basicGetDto() {
		return dto;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDto(Model newDto) {
		Model oldDto = dto;
		dto = newDto;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MicroPackage.INFO__DTO, oldDto, dto));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public API getApi() {
		if (eContainerFeatureID() != MicroPackage.INFO__API) return null;
		return (API)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetApi(API newApi, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newApi, MicroPackage.INFO__API, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApi(API newApi) {
		if (newApi != eInternalContainer() || (eContainerFeatureID() != MicroPackage.INFO__API && newApi != null)) {
			if (EcoreUtil.isAncestor(this, newApi))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newApi != null)
				msgs = ((InternalEObject)newApi).eInverseAdd(this, MicroPackage.API__INFOS, API.class, msgs);
			msgs = basicSetApi(newApi, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MicroPackage.INFO__API, newApi, newApi));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MicroPackage.INFO__API:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetApi((API)otherEnd, msgs);
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
			case MicroPackage.INFO__API:
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
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case MicroPackage.INFO__API:
				return eInternalContainer().eInverseRemove(this, MicroPackage.API__INFOS, API.class, msgs);
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
			case MicroPackage.INFO__DTO:
				if (resolve) return getDto();
				return basicGetDto();
			case MicroPackage.INFO__API:
				return getApi();
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
			case MicroPackage.INFO__DTO:
				setDto((Model)newValue);
				return;
			case MicroPackage.INFO__API:
				setApi((API)newValue);
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
			case MicroPackage.INFO__DTO:
				setDto((Model)null);
				return;
			case MicroPackage.INFO__API:
				setApi((API)null);
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
			case MicroPackage.INFO__DTO:
				return dto != null;
			case MicroPackage.INFO__API:
				return getApi() != null;
		}
		return super.eIsSet(featureID);
	}

} //InfoImpl
