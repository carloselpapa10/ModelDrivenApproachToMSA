/**
 */
package micro;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link micro.Service#getFullname <em>Fullname</em>}</li>
 *   <li>{@link micro.Service#getDescription <em>Description</em>}</li>
 *   <li>{@link micro.Service#getShortname <em>Shortname</em>}</li>
 *   <li>{@link micro.Service#getPort <em>Port</em>}</li>
 * </ul>
 *
 * @see micro.MicroPackage#getService()
 * @model abstract="true"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='ServiceNameMustBeUnique ServiceFullnameMustBeUnique ServiceShortNameMustBeUnique ServicePortMustBeUnique ServiceReservedPortNumbers MustHaveFullname FullnameMustNotContainWhiteSpace MustHaveShortname ShortnameMustNotContainWhiteSpace'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot ServiceNameMustBeUnique='MicroserviceArchitecture.allInstances().services-&gt;select(s : Service | s.name = self.name)-&gt;size() = 1' ServiceFullnameMustBeUnique='MicroserviceArchitecture.allInstances().services-&gt;select(s : Service | s.fullname = self.fullname)-&gt;size() = 1' ServiceShortNameMustBeUnique='MicroserviceArchitecture.allInstances().services-&gt;select(s : Service | s.shortname = self.shortname)-&gt;size() = 1' ServicePortMustBeUnique='MicroserviceArchitecture.allInstances().services-&gt;select(s : Service | s.port = self.port)-&gt;size() = 1' ServiceReservedPortNumbers='MicroserviceArchitecture.allInstances().services-&gt;select(s : Service | (s = self and (s.port.toString() = \'27017\' or s.port.toString() = \'8099\' or s.port.toString() = \'3306\' or s.port.toString() = \'9092\' or s.port.toString() = \'2888\' or s.port.toString() = \'3888\' or s.port.toString() = \'5020\')))-&gt;size() = 0' MustHaveFullname='fullname &lt;&gt; \'\'' FullnameMustNotContainWhiteSpace='fullname.toString().characters()-&gt;select(c : String | c = \' \')-&gt;size() = 0' MustHaveShortname='shortname &lt;&gt; \'\'' ShortnameMustNotContainWhiteSpace='shortname.toString().characters()-&gt;select(c : String | c = \' \')-&gt;size() = 0'"
 * @generated
 */
public interface Service extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Fullname</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fullname</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fullname</em>' attribute.
	 * @see #setFullname(String)
	 * @see micro.MicroPackage#getService_Fullname()
	 * @model default=""
	 * @generated
	 */
	String getFullname();

	/**
	 * Sets the value of the '{@link micro.Service#getFullname <em>Fullname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fullname</em>' attribute.
	 * @see #getFullname()
	 * @generated
	 */
	void setFullname(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see micro.MicroPackage#getService_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link micro.Service#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Shortname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shortname</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shortname</em>' attribute.
	 * @see #setShortname(String)
	 * @see micro.MicroPackage#getService_Shortname()
	 * @model
	 * @generated
	 */
	String getShortname();

	/**
	 * Sets the value of the '{@link micro.Service#getShortname <em>Shortname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shortname</em>' attribute.
	 * @see #getShortname()
	 * @generated
	 */
	void setShortname(String value);

	/**
	 * Returns the value of the '<em><b>Port</b></em>' attribute.
	 * The default value is <code>"8888"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port</em>' attribute.
	 * @see #setPort(int)
	 * @see micro.MicroPackage#getService_Port()
	 * @model default="8888"
	 * @generated
	 */
	int getPort();

	/**
	 * Sets the value of the '{@link micro.Service#getPort <em>Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port</em>' attribute.
	 * @see #getPort()
	 * @generated
	 */
	void setPort(int value);

} // Service
