/**
 */
package micro;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Step</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link micro.Step#getCommands <em>Commands</em>}</li>
 * </ul>
 *
 * @see micro.MicroPackage#getStep()
 * @model
 * @generated
 */
public interface Step extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Commands</b></em>' reference list.
	 * The list contents are of type {@link micro.Command}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Commands</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Commands</em>' reference list.
	 * @see micro.MicroPackage#getStep_Commands()
	 * @model required="true"
	 * @generated
	 */
	EList<Command> getCommands();

} // Step
