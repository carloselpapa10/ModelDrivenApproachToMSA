/**
 */
package micro;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Info</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link micro.Info#getDto <em>Dto</em>}</li>
 *   <li>{@link micro.Info#getApi <em>Api</em>}</li>
 * </ul>
 *
 * @see micro.MicroPackage#getInfo()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='InfoNameMustBeUnique'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot InfoNameMustBeUnique='api.infos-&gt;select(i : Info | i.name = self.name)-&gt;size() = 1'"
 * @generated
 */
public interface Info extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Dto</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dto</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dto</em>' reference.
	 * @see #setDto(Model)
	 * @see micro.MicroPackage#getInfo_Dto()
	 * @model
	 * @generated
	 */
	Model getDto();

	/**
	 * Sets the value of the '{@link micro.Info#getDto <em>Dto</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dto</em>' reference.
	 * @see #getDto()
	 * @generated
	 */
	void setDto(Model value);

	/**
	 * Returns the value of the '<em><b>Api</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link micro.API#getInfos <em>Infos</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Api</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Api</em>' container reference.
	 * @see #setApi(API)
	 * @see micro.MicroPackage#getInfo_Api()
	 * @see micro.API#getInfos
	 * @model opposite="infos" transient="false" ordered="false"
	 * @generated
	 */
	API getApi();

	/**
	 * Sets the value of the '{@link micro.Info#getApi <em>Api</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Api</em>' container reference.
	 * @see #getApi()
	 * @generated
	 */
	void setApi(API value);

} // Info
