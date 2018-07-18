/**
 */
package micro;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Primitive Type Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link micro.PrimitiveTypeAttribute#getType <em>Type</em>}</li>
 *   <li>{@link micro.PrimitiveTypeAttribute#getModelToView <em>Model To View</em>}</li>
 * </ul>
 *
 * @see micro.MicroPackage#getPrimitiveTypeAttribute()
 * @model
 * @generated
 */
public interface PrimitiveTypeAttribute extends Attribute {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link micro.AttributePrimitiveValue}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see micro.AttributePrimitiveValue
	 * @see #setType(AttributePrimitiveValue)
	 * @see micro.MicroPackage#getPrimitiveTypeAttribute_Type()
	 * @model required="true"
	 * @generated
	 */
	AttributePrimitiveValue getType();

	/**
	 * Sets the value of the '{@link micro.PrimitiveTypeAttribute#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see micro.AttributePrimitiveValue
	 * @see #getType()
	 * @generated
	 */
	void setType(AttributePrimitiveValue value);

	/**
	 * Returns the value of the '<em><b>Model To View</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Model To View</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model To View</em>' reference.
	 * @see #setModelToView(Model)
	 * @see micro.MicroPackage#getPrimitiveTypeAttribute_ModelToView()
	 * @model
	 * @generated
	 */
	Model getModelToView();

	/**
	 * Sets the value of the '{@link micro.PrimitiveTypeAttribute#getModelToView <em>Model To View</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model To View</em>' reference.
	 * @see #getModelToView()
	 * @generated
	 */
	void setModelToView(Model value);

} // PrimitiveTypeAttribute
