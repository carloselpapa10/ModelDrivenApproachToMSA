/**
 */
package micro.impl;

import micro.AttributePrimitiveValue;
import micro.MicroPackage;
import micro.Model;
import micro.PrimitiveTypeAttribute;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Primitive Type Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link micro.impl.PrimitiveTypeAttributeImpl#getType <em>Type</em>}</li>
 *   <li>{@link micro.impl.PrimitiveTypeAttributeImpl#getModelToView <em>Model To View</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PrimitiveTypeAttributeImpl extends AttributeImpl implements PrimitiveTypeAttribute {
	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final AttributePrimitiveValue TYPE_EDEFAULT = AttributePrimitiveValue.STRING;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected AttributePrimitiveValue type = TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getModelToView() <em>Model To View</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelToView()
	 * @generated
	 * @ordered
	 */
	protected Model modelToView;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PrimitiveTypeAttributeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MicroPackage.Literals.PRIMITIVE_TYPE_ATTRIBUTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributePrimitiveValue getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(AttributePrimitiveValue newType) {
		AttributePrimitiveValue oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MicroPackage.PRIMITIVE_TYPE_ATTRIBUTE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Model getModelToView() {
		if (modelToView != null && modelToView.eIsProxy()) {
			InternalEObject oldModelToView = (InternalEObject)modelToView;
			modelToView = (Model)eResolveProxy(oldModelToView);
			if (modelToView != oldModelToView) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MicroPackage.PRIMITIVE_TYPE_ATTRIBUTE__MODEL_TO_VIEW, oldModelToView, modelToView));
			}
		}
		return modelToView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Model basicGetModelToView() {
		return modelToView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModelToView(Model newModelToView) {
		Model oldModelToView = modelToView;
		modelToView = newModelToView;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MicroPackage.PRIMITIVE_TYPE_ATTRIBUTE__MODEL_TO_VIEW, oldModelToView, modelToView));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MicroPackage.PRIMITIVE_TYPE_ATTRIBUTE__TYPE:
				return getType();
			case MicroPackage.PRIMITIVE_TYPE_ATTRIBUTE__MODEL_TO_VIEW:
				if (resolve) return getModelToView();
				return basicGetModelToView();
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
			case MicroPackage.PRIMITIVE_TYPE_ATTRIBUTE__TYPE:
				setType((AttributePrimitiveValue)newValue);
				return;
			case MicroPackage.PRIMITIVE_TYPE_ATTRIBUTE__MODEL_TO_VIEW:
				setModelToView((Model)newValue);
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
			case MicroPackage.PRIMITIVE_TYPE_ATTRIBUTE__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case MicroPackage.PRIMITIVE_TYPE_ATTRIBUTE__MODEL_TO_VIEW:
				setModelToView((Model)null);
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
			case MicroPackage.PRIMITIVE_TYPE_ATTRIBUTE__TYPE:
				return type != TYPE_EDEFAULT;
			case MicroPackage.PRIMITIVE_TYPE_ATTRIBUTE__MODEL_TO_VIEW:
				return modelToView != null;
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
		result.append(" (type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //PrimitiveTypeAttributeImpl
