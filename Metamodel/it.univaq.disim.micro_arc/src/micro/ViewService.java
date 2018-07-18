/**
 */
package micro;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>View Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link micro.ViewService#getReplicateServices <em>Replicate Services</em>}</li>
 * </ul>
 *
 * @see micro.MicroPackage#getViewService()
 * @model
 * @generated
 */
public interface ViewService extends Service {
	/**
	 * Returns the value of the '<em><b>Replicate Services</b></em>' reference list.
	 * The list contents are of type {@link micro.AggregateService}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Replicate Services</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Replicate Services</em>' reference list.
	 * @see micro.MicroPackage#getViewService_ReplicateServices()
	 * @model
	 * @generated
	 */
	EList<AggregateService> getReplicateServices();

} // ViewService
