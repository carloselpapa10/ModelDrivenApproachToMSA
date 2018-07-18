/**
 */
package micro;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Microservice Architecture</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link micro.MicroserviceArchitecture#getServices <em>Services</em>}</li>
 *   <li>{@link micro.MicroserviceArchitecture#getModels <em>Models</em>}</li>
 * </ul>
 *
 * @see micro.MicroPackage#getMicroserviceArchitecture()
 * @model
 * @generated
 */
public interface MicroserviceArchitecture extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Services</b></em>' containment reference list.
	 * The list contents are of type {@link micro.Service}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Services</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Services</em>' containment reference list.
	 * @see micro.MicroPackage#getMicroserviceArchitecture_Services()
	 * @model containment="true"
	 * @generated
	 */
	EList<Service> getServices();

	/**
	 * Returns the value of the '<em><b>Models</b></em>' containment reference list.
	 * The list contents are of type {@link micro.Model}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Models</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Models</em>' containment reference list.
	 * @see micro.MicroPackage#getMicroserviceArchitecture_Models()
	 * @model containment="true"
	 * @generated
	 */
	EList<Model> getModels();

} // MicroserviceArchitecture
