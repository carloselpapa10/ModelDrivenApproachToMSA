/**
 */
package micro.impl;

import micro.API;
import micro.Command;
import micro.CommandType;
import micro.Info;
import micro.MicroPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Command</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link micro.impl.CommandImpl#getCommandType <em>Command Type</em>}</li>
 *   <li>{@link micro.impl.CommandImpl#getReplyInfo <em>Reply Info</em>}</li>
 *   <li>{@link micro.impl.CommandImpl#isIsReplyInfoMany <em>Is Reply Info Many</em>}</li>
 *   <li>{@link micro.impl.CommandImpl#getApi <em>Api</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CommandImpl extends NamedElementImpl implements Command {
	/**
	 * The default value of the '{@link #getCommandType() <em>Command Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommandType()
	 * @generated
	 * @ordered
	 */
	protected static final CommandType COMMAND_TYPE_EDEFAULT = CommandType.COMPENSATE;

	/**
	 * The cached value of the '{@link #getCommandType() <em>Command Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommandType()
	 * @generated
	 * @ordered
	 */
	protected CommandType commandType = COMMAND_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getReplyInfo() <em>Reply Info</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReplyInfo()
	 * @generated
	 * @ordered
	 */
	protected Info replyInfo;

	/**
	 * The default value of the '{@link #isIsReplyInfoMany() <em>Is Reply Info Many</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsReplyInfoMany()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_REPLY_INFO_MANY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsReplyInfoMany() <em>Is Reply Info Many</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsReplyInfoMany()
	 * @generated
	 * @ordered
	 */
	protected boolean isReplyInfoMany = IS_REPLY_INFO_MANY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CommandImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MicroPackage.Literals.COMMAND;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommandType getCommandType() {
		return commandType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCommandType(CommandType newCommandType) {
		CommandType oldCommandType = commandType;
		commandType = newCommandType == null ? COMMAND_TYPE_EDEFAULT : newCommandType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MicroPackage.COMMAND__COMMAND_TYPE, oldCommandType, commandType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Info getReplyInfo() {
		if (replyInfo != null && replyInfo.eIsProxy()) {
			InternalEObject oldReplyInfo = (InternalEObject)replyInfo;
			replyInfo = (Info)eResolveProxy(oldReplyInfo);
			if (replyInfo != oldReplyInfo) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MicroPackage.COMMAND__REPLY_INFO, oldReplyInfo, replyInfo));
			}
		}
		return replyInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Info basicGetReplyInfo() {
		return replyInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReplyInfo(Info newReplyInfo) {
		Info oldReplyInfo = replyInfo;
		replyInfo = newReplyInfo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MicroPackage.COMMAND__REPLY_INFO, oldReplyInfo, replyInfo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsReplyInfoMany() {
		return isReplyInfoMany;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsReplyInfoMany(boolean newIsReplyInfoMany) {
		boolean oldIsReplyInfoMany = isReplyInfoMany;
		isReplyInfoMany = newIsReplyInfoMany;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MicroPackage.COMMAND__IS_REPLY_INFO_MANY, oldIsReplyInfoMany, isReplyInfoMany));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public API getApi() {
		if (eContainerFeatureID() != MicroPackage.COMMAND__API) return null;
		return (API)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetApi(API newApi, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newApi, MicroPackage.COMMAND__API, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApi(API newApi) {
		if (newApi != eInternalContainer() || (eContainerFeatureID() != MicroPackage.COMMAND__API && newApi != null)) {
			if (EcoreUtil.isAncestor(this, newApi))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newApi != null)
				msgs = ((InternalEObject)newApi).eInverseAdd(this, MicroPackage.API__COMMANDS, API.class, msgs);
			msgs = basicSetApi(newApi, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MicroPackage.COMMAND__API, newApi, newApi));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MicroPackage.COMMAND__API:
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
			case MicroPackage.COMMAND__API:
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
			case MicroPackage.COMMAND__API:
				return eInternalContainer().eInverseRemove(this, MicroPackage.API__COMMANDS, API.class, msgs);
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
			case MicroPackage.COMMAND__COMMAND_TYPE:
				return getCommandType();
			case MicroPackage.COMMAND__REPLY_INFO:
				if (resolve) return getReplyInfo();
				return basicGetReplyInfo();
			case MicroPackage.COMMAND__IS_REPLY_INFO_MANY:
				return isIsReplyInfoMany();
			case MicroPackage.COMMAND__API:
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
			case MicroPackage.COMMAND__COMMAND_TYPE:
				setCommandType((CommandType)newValue);
				return;
			case MicroPackage.COMMAND__REPLY_INFO:
				setReplyInfo((Info)newValue);
				return;
			case MicroPackage.COMMAND__IS_REPLY_INFO_MANY:
				setIsReplyInfoMany((Boolean)newValue);
				return;
			case MicroPackage.COMMAND__API:
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
			case MicroPackage.COMMAND__COMMAND_TYPE:
				setCommandType(COMMAND_TYPE_EDEFAULT);
				return;
			case MicroPackage.COMMAND__REPLY_INFO:
				setReplyInfo((Info)null);
				return;
			case MicroPackage.COMMAND__IS_REPLY_INFO_MANY:
				setIsReplyInfoMany(IS_REPLY_INFO_MANY_EDEFAULT);
				return;
			case MicroPackage.COMMAND__API:
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
			case MicroPackage.COMMAND__COMMAND_TYPE:
				return commandType != COMMAND_TYPE_EDEFAULT;
			case MicroPackage.COMMAND__REPLY_INFO:
				return replyInfo != null;
			case MicroPackage.COMMAND__IS_REPLY_INFO_MANY:
				return isReplyInfoMany != IS_REPLY_INFO_MANY_EDEFAULT;
			case MicroPackage.COMMAND__API:
				return getApi() != null;
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
		result.append(" (commandType: ");
		result.append(commandType);
		result.append(", isReplyInfoMany: ");
		result.append(isReplyInfoMany);
		result.append(')');
		return result.toString();
	}

} //CommandImpl
