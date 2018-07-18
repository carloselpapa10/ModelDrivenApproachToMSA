/**
 */
package micro;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>API</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link micro.API#getEvents <em>Events</em>}</li>
 *   <li>{@link micro.API#getCommands <em>Commands</em>}</li>
 *   <li>{@link micro.API#getInfos <em>Infos</em>}</li>
 * </ul>
 *
 * @see micro.MicroPackage#getAPI()
 * @model
 * @generated
 */
public interface API extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Events</b></em>' containment reference list.
	 * The list contents are of type {@link micro.Event}.
	 * It is bidirectional and its opposite is '{@link micro.Event#getApi <em>Api</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Events</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Events</em>' containment reference list.
	 * @see micro.MicroPackage#getAPI_Events()
	 * @see micro.Event#getApi
	 * @model opposite="api" containment="true" required="true"
	 * @generated
	 */
	EList<Event> getEvents();

	/**
	 * Returns the value of the '<em><b>Commands</b></em>' containment reference list.
	 * The list contents are of type {@link micro.Command}.
	 * It is bidirectional and its opposite is '{@link micro.Command#getApi <em>Api</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Commands</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Commands</em>' containment reference list.
	 * @see micro.MicroPackage#getAPI_Commands()
	 * @see micro.Command#getApi
	 * @model opposite="api" containment="true" required="true"
	 * @generated
	 */
	EList<Command> getCommands();

	/**
	 * Returns the value of the '<em><b>Infos</b></em>' containment reference list.
	 * The list contents are of type {@link micro.Info}.
	 * It is bidirectional and its opposite is '{@link micro.Info#getApi <em>Api</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Infos</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Infos</em>' containment reference list.
	 * @see micro.MicroPackage#getAPI_Infos()
	 * @see micro.Info#getApi
	 * @model opposite="api" containment="true" required="true"
	 * @generated
	 */
	EList<Info> getInfos();

} // API
