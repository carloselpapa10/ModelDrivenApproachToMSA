/**
 */
package micro.impl;

import micro.MicroPackage;
import micro.Service;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link micro.impl.ServiceImpl#getFullname <em>Fullname</em>}</li>
 *   <li>{@link micro.impl.ServiceImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link micro.impl.ServiceImpl#getShortname <em>Shortname</em>}</li>
 *   <li>{@link micro.impl.ServiceImpl#getPort <em>Port</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ServiceImpl extends NamedElementImpl implements Service {
	/**
	 * The default value of the '{@link #getFullname() <em>Fullname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFullname()
	 * @generated
	 * @ordered
	 */
	protected static final String FULLNAME_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getFullname() <em>Fullname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFullname()
	 * @generated
	 * @ordered
	 */
	protected String fullname = FULLNAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getShortname() <em>Shortname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShortname()
	 * @generated
	 * @ordered
	 */
	protected static final String SHORTNAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getShortname() <em>Shortname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShortname()
	 * @generated
	 * @ordered
	 */
	protected String shortname = SHORTNAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getPort() <em>Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPort()
	 * @generated
	 * @ordered
	 */
	protected static final int PORT_EDEFAULT = 8888;

	/**
	 * The cached value of the '{@link #getPort() <em>Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPort()
	 * @generated
	 * @ordered
	 */
	protected int port = PORT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MicroPackage.Literals.SERVICE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFullname() {
		return fullname;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFullname(String newFullname) {
		String oldFullname = fullname;
		fullname = newFullname;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MicroPackage.SERVICE__FULLNAME, oldFullname, fullname));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MicroPackage.SERVICE__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getShortname() {
		return shortname;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShortname(String newShortname) {
		String oldShortname = shortname;
		shortname = newShortname;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MicroPackage.SERVICE__SHORTNAME, oldShortname, shortname));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPort() {
		return port;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPort(int newPort) {
		int oldPort = port;
		port = newPort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MicroPackage.SERVICE__PORT, oldPort, port));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MicroPackage.SERVICE__FULLNAME:
				return getFullname();
			case MicroPackage.SERVICE__DESCRIPTION:
				return getDescription();
			case MicroPackage.SERVICE__SHORTNAME:
				return getShortname();
			case MicroPackage.SERVICE__PORT:
				return getPort();
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
			case MicroPackage.SERVICE__FULLNAME:
				setFullname((String)newValue);
				return;
			case MicroPackage.SERVICE__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case MicroPackage.SERVICE__SHORTNAME:
				setShortname((String)newValue);
				return;
			case MicroPackage.SERVICE__PORT:
				setPort((Integer)newValue);
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
			case MicroPackage.SERVICE__FULLNAME:
				setFullname(FULLNAME_EDEFAULT);
				return;
			case MicroPackage.SERVICE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case MicroPackage.SERVICE__SHORTNAME:
				setShortname(SHORTNAME_EDEFAULT);
				return;
			case MicroPackage.SERVICE__PORT:
				setPort(PORT_EDEFAULT);
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
			case MicroPackage.SERVICE__FULLNAME:
				return FULLNAME_EDEFAULT == null ? fullname != null : !FULLNAME_EDEFAULT.equals(fullname);
			case MicroPackage.SERVICE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case MicroPackage.SERVICE__SHORTNAME:
				return SHORTNAME_EDEFAULT == null ? shortname != null : !SHORTNAME_EDEFAULT.equals(shortname);
			case MicroPackage.SERVICE__PORT:
				return port != PORT_EDEFAULT;
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
		result.append(" (fullname: ");
		result.append(fullname);
		result.append(", description: ");
		result.append(description);
		result.append(", shortname: ");
		result.append(shortname);
		result.append(", port: ");
		result.append(port);
		result.append(')');
		return result.toString();
	}

} //ServiceImpl
