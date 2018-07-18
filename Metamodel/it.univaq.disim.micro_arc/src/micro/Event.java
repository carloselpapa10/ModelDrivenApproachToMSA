/**
 */
package micro;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link micro.Event#getApi <em>Api</em>}</li>
 * </ul>
 *
 * @see micro.MicroPackage#getEvent()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='EventNameMustBeUnique'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot EventNameMustBeUnique='api.events-&gt;select(e : Event | e.name = self.name)-&gt;size() = 1'"
 * @generated
 */
public interface Event extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Api</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link micro.API#getEvents <em>Events</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Api</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Api</em>' container reference.
	 * @see #setApi(API)
	 * @see micro.MicroPackage#getEvent_Api()
	 * @see micro.API#getEvents
	 * @model opposite="events" transient="false" ordered="false"
	 * @generated
	 */
	API getApi();

	/**
	 * Sets the value of the '{@link micro.Event#getApi <em>Api</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Api</em>' container reference.
	 * @see #getApi()
	 * @generated
	 */
	void setApi(API value);

} // Event
