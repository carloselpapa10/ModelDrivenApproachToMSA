/**
 */
package micro;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Command</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link micro.Command#getCommandType <em>Command Type</em>}</li>
 *   <li>{@link micro.Command#getReplyInfo <em>Reply Info</em>}</li>
 *   <li>{@link micro.Command#isIsReplyInfoMany <em>Is Reply Info Many</em>}</li>
 *   <li>{@link micro.Command#getApi <em>Api</em>}</li>
 * </ul>
 *
 * @see micro.MicroPackage#getCommand()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='CommandNameMustBeUnique CommandReplyMustHaveReplyInfo CommandReplyInfoMustBelongToCurrentAggregateService'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot CommandNameMustBeUnique='api.commands-&gt;select(c : Command | c.name = self.name)-&gt;size() = 1' CommandReplyMustHaveReplyInfo='commandType.toString() = CommandType::reply.toString() and replyInfo &lt;&gt; null or commandType.toString() &lt;&gt; CommandType::reply.toString()' CommandReplyInfoMustBelongToCurrentAggregateService='api.infos-&gt;select(i : Info | i.name = replyInfo.name)-&gt;size() = 1 or commandType.toString() &lt;&gt; CommandType::reply.toString()'"
 * @generated
 */
public interface Command extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Command Type</b></em>' attribute.
	 * The literals are from the enumeration {@link micro.CommandType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Command Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Command Type</em>' attribute.
	 * @see micro.CommandType
	 * @see #setCommandType(CommandType)
	 * @see micro.MicroPackage#getCommand_CommandType()
	 * @model
	 * @generated
	 */
	CommandType getCommandType();

	/**
	 * Sets the value of the '{@link micro.Command#getCommandType <em>Command Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Command Type</em>' attribute.
	 * @see micro.CommandType
	 * @see #getCommandType()
	 * @generated
	 */
	void setCommandType(CommandType value);

	/**
	 * Returns the value of the '<em><b>Reply Info</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reply Info</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reply Info</em>' reference.
	 * @see #setReplyInfo(Info)
	 * @see micro.MicroPackage#getCommand_ReplyInfo()
	 * @model
	 * @generated
	 */
	Info getReplyInfo();

	/**
	 * Sets the value of the '{@link micro.Command#getReplyInfo <em>Reply Info</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reply Info</em>' reference.
	 * @see #getReplyInfo()
	 * @generated
	 */
	void setReplyInfo(Info value);

	/**
	 * Returns the value of the '<em><b>Is Reply Info Many</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Reply Info Many</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Reply Info Many</em>' attribute.
	 * @see #setIsReplyInfoMany(boolean)
	 * @see micro.MicroPackage#getCommand_IsReplyInfoMany()
	 * @model
	 * @generated
	 */
	boolean isIsReplyInfoMany();

	/**
	 * Sets the value of the '{@link micro.Command#isIsReplyInfoMany <em>Is Reply Info Many</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Reply Info Many</em>' attribute.
	 * @see #isIsReplyInfoMany()
	 * @generated
	 */
	void setIsReplyInfoMany(boolean value);

	/**
	 * Returns the value of the '<em><b>Api</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link micro.API#getCommands <em>Commands</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Api</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Api</em>' container reference.
	 * @see #setApi(API)
	 * @see micro.MicroPackage#getCommand_Api()
	 * @see micro.API#getCommands
	 * @model opposite="commands" transient="false" ordered="false"
	 * @generated
	 */
	API getApi();

	/**
	 * Sets the value of the '{@link micro.Command#getApi <em>Api</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Api</em>' container reference.
	 * @see #getApi()
	 * @generated
	 */
	void setApi(API value);

} // Command
