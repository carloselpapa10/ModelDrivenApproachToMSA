/**
 */
package micro;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link micro.Model#getAttributes <em>Attributes</em>}</li>
 * </ul>
 *
 * @see micro.MicroPackage#getModel()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='ModelNameMustBeUnique ModelMustBeContainedInOneAggService'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot ModelNameMustBeUnique='MicroserviceArchitecture.allInstances().models-&gt;select(s : Model | s.name = self.name)-&gt;size() = 1' ModelMustBeContainedInOneAggService='MicroserviceArchitecture.allInstances().services-&gt;select(s : Service | s.oclIsTypeOf(AggregateService)).oclAsType(AggregateService).models-&gt;select(m : Model | m = self)-&gt;size() = 1'"
 * @generated
 */
public interface Model extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Attributes</b></em>' containment reference list.
	 * The list contents are of type {@link micro.Attribute}.
	 * It is bidirectional and its opposite is '{@link micro.Attribute#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attributes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributes</em>' containment reference list.
	 * @see micro.MicroPackage#getModel_Attributes()
	 * @see micro.Attribute#getModel
	 * @model opposite="model" containment="true" required="true"
	 * @generated
	 */
	EList<Attribute> getAttributes();

} // Model
