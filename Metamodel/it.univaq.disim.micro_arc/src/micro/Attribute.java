/**
 */
package micro;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link micro.Attribute#getName <em>Name</em>}</li>
 *   <li>{@link micro.Attribute#isIsMany <em>Is Many</em>}</li>
 *   <li>{@link micro.Attribute#isIsId <em>Is Id</em>}</li>
 *   <li>{@link micro.Attribute#isIsGenerated <em>Is Generated</em>}</li>
 *   <li>{@link micro.Attribute#getModel <em>Model</em>}</li>
 * </ul>
 *
 * @see micro.MicroPackage#getAttribute()
 * @model abstract="true"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='ModelAttributeNameMustBeUnique ModelAttributeIdMustBeUnique ModelAttributeIdMustBeNoList ModelAttributeIsGeneratedOnlyWithId'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot ModelAttributeNameMustBeUnique='model.attributes-&gt;select(a : Attribute | a.name = self.name)-&gt;size() = 1' ModelAttributeIdMustBeUnique='model.attributes-&gt;select(a : Attribute | a.isId = true)-&gt;size() = 1' ModelAttributeIdMustBeNoList='model.attributes-&gt;select(a : Attribute | (a.isId = true and a.isMany = false))-&gt;size() = 1' ModelAttributeIsGeneratedOnlyWithId='model.attributes-&gt;select(a : Attribute | (a.isId = false and a.isGenerated = true))-&gt;size() = 0'"
 * @generated
 */
public interface Attribute extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see micro.MicroPackage#getAttribute_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link micro.Attribute#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Is Many</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Many</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Many</em>' attribute.
	 * @see #setIsMany(boolean)
	 * @see micro.MicroPackage#getAttribute_IsMany()
	 * @model
	 * @generated
	 */
	boolean isIsMany();

	/**
	 * Sets the value of the '{@link micro.Attribute#isIsMany <em>Is Many</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Many</em>' attribute.
	 * @see #isIsMany()
	 * @generated
	 */
	void setIsMany(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Id</em>' attribute.
	 * @see #setIsId(boolean)
	 * @see micro.MicroPackage#getAttribute_IsId()
	 * @model
	 * @generated
	 */
	boolean isIsId();

	/**
	 * Sets the value of the '{@link micro.Attribute#isIsId <em>Is Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Id</em>' attribute.
	 * @see #isIsId()
	 * @generated
	 */
	void setIsId(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Generated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Generated</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Generated</em>' attribute.
	 * @see #setIsGenerated(boolean)
	 * @see micro.MicroPackage#getAttribute_IsGenerated()
	 * @model
	 * @generated
	 */
	boolean isIsGenerated();

	/**
	 * Sets the value of the '{@link micro.Attribute#isIsGenerated <em>Is Generated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Generated</em>' attribute.
	 * @see #isIsGenerated()
	 * @generated
	 */
	void setIsGenerated(boolean value);

	/**
	 * Returns the value of the '<em><b>Model</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link micro.Model#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Model</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model</em>' container reference.
	 * @see #setModel(Model)
	 * @see micro.MicroPackage#getAttribute_Model()
	 * @see micro.Model#getAttributes
	 * @model opposite="attributes" transient="false" ordered="false"
	 * @generated
	 */
	Model getModel();

	/**
	 * Sets the value of the '{@link micro.Attribute#getModel <em>Model</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model</em>' container reference.
	 * @see #getModel()
	 * @generated
	 */
	void setModel(Model value);

} // Attribute
