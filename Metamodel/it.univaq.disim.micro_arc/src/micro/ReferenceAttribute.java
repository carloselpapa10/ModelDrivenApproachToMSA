/**
 */
package micro;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reference Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link micro.ReferenceAttribute#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see micro.MicroPackage#getReferenceAttribute()
 * @model
 * @generated
 */
public interface ReferenceAttribute extends Attribute {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(Model)
	 * @see micro.MicroPackage#getReferenceAttribute_Type()
	 * @model required="true"
	 * @generated
	 */
	Model getType();

	/**
	 * Sets the value of the '{@link micro.ReferenceAttribute#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(Model value);

} // ReferenceAttribute
