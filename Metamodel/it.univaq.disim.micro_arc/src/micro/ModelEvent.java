/**
 */
package micro;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link micro.ModelEvent#getModel <em>Model</em>}</li>
 *   <li>{@link micro.ModelEvent#getAggregateService <em>Aggregate Service</em>}</li>
 * </ul>
 *
 * @see micro.MicroPackage#getModelEvent()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='ModelEventNameMustBeUnique ModelMustBelongToCurrentAggregateService'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot ModelEventNameMustBeUnique='aggregateService.modelEvents-&gt;select(m : ModelEvent | m.name = self.name)-&gt;size() = 1' ModelMustBelongToCurrentAggregateService='MicroserviceArchitecture.allInstances().services-&gt;select(s : Service | s.name = aggregateService.name).oclAsType(AggregateService).models-&gt;select(m : Model | m = self.model)-&gt;size() = 1'"
 * @generated
 */
public interface ModelEvent extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Model</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model</em>' reference.
	 * @see #setModel(Model)
	 * @see micro.MicroPackage#getModelEvent_Model()
	 * @model required="true"
	 * @generated
	 */
	Model getModel();

	/**
	 * Sets the value of the '{@link micro.ModelEvent#getModel <em>Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model</em>' reference.
	 * @see #getModel()
	 * @generated
	 */
	void setModel(Model value);

	/**
	 * Returns the value of the '<em><b>Aggregate Service</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link micro.AggregateService#getModelEvents <em>Model Events</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Aggregate Service</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aggregate Service</em>' container reference.
	 * @see #setAggregateService(AggregateService)
	 * @see micro.MicroPackage#getModelEvent_AggregateService()
	 * @see micro.AggregateService#getModelEvents
	 * @model opposite="modelEvents" transient="false" ordered="false"
	 * @generated
	 */
	AggregateService getAggregateService();

	/**
	 * Sets the value of the '{@link micro.ModelEvent#getAggregateService <em>Aggregate Service</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aggregate Service</em>' container reference.
	 * @see #getAggregateService()
	 * @generated
	 */
	void setAggregateService(AggregateService value);

} // ModelEvent
