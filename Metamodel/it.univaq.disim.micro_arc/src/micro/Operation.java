/**
 */
package micro;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link micro.Operation#getOperationType <em>Operation Type</em>}</li>
 *   <li>{@link micro.Operation#getPublish <em>Publish</em>}</li>
 *   <li>{@link micro.Operation#getSaga <em>Saga</em>}</li>
 *   <li>{@link micro.Operation#getModel <em>Model</em>}</li>
 *   <li>{@link micro.Operation#isIsMethodController <em>Is Method Controller</em>}</li>
 *   <li>{@link micro.Operation#getAggregateService <em>Aggregate Service</em>}</li>
 * </ul>
 *
 * @see micro.MicroPackage#getOperation()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='SagaNameMustBeUnique OperationNameMustBeUnique OperationModelMustBelongToSameAggregateService OperationMustPublishEvent OperationEventPublishedMustBelongToCurrentAggregateService'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot SagaNameMustBeUnique='aggregateService.operation-&gt;select(o : Operation | (o.Saga.oclIsUndefined() = false and self.Saga.oclIsUndefined() = false))-&gt;select(s : Operation | (s.Saga.name = self.Saga.name))-&gt;size() &lt;= 1' OperationNameMustBeUnique='aggregateService.operation-&gt;select(o : Operation | (o.name = self.name and o.operationType.toString() = self.operationType.toString()))-&gt;size() = 1' OperationModelMustBelongToSameAggregateService='aggregateService.models-&gt;select(m : Model | m.name = self.model.name)-&gt;size() = 1' OperationMustPublishEvent='self.operationType.toString() &lt;&gt; CRUDOperation::retrieve.toString() and self.publish &lt;&gt; null or self.operationType.toString() = CRUDOperation::retrieve.toString() or self.operationType.toString() = CRUDOperation::update.toString() and self.Saga.oclIsUndefined() = false' OperationEventPublishedMustBelongToCurrentAggregateService='aggregateService.api.events-&gt;select(e : Event | (self.publish &lt;&gt; null and self.publish.name = e.name))-&gt;size() = 1 or self.operationType.toString() = CRUDOperation::retrieve.toString() or self.operationType.toString() = CRUDOperation::update.toString() and self.Saga.oclIsUndefined() = false'"
 * @generated
 */
public interface Operation extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Operation Type</b></em>' attribute.
	 * The literals are from the enumeration {@link micro.CRUDOperation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operation Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation Type</em>' attribute.
	 * @see micro.CRUDOperation
	 * @see #setOperationType(CRUDOperation)
	 * @see micro.MicroPackage#getOperation_OperationType()
	 * @model
	 * @generated
	 */
	CRUDOperation getOperationType();

	/**
	 * Sets the value of the '{@link micro.Operation#getOperationType <em>Operation Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation Type</em>' attribute.
	 * @see micro.CRUDOperation
	 * @see #getOperationType()
	 * @generated
	 */
	void setOperationType(CRUDOperation value);

	/**
	 * Returns the value of the '<em><b>Publish</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Publish</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Publish</em>' reference.
	 * @see #setPublish(Event)
	 * @see micro.MicroPackage#getOperation_Publish()
	 * @model
	 * @generated
	 */
	Event getPublish();

	/**
	 * Sets the value of the '{@link micro.Operation#getPublish <em>Publish</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Publish</em>' reference.
	 * @see #getPublish()
	 * @generated
	 */
	void setPublish(Event value);

	/**
	 * Returns the value of the '<em><b>Saga</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Saga</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Saga</em>' containment reference.
	 * @see #setSaga(Saga)
	 * @see micro.MicroPackage#getOperation_Saga()
	 * @model containment="true"
	 * @generated
	 */
	Saga getSaga();

	/**
	 * Sets the value of the '{@link micro.Operation#getSaga <em>Saga</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Saga</em>' containment reference.
	 * @see #getSaga()
	 * @generated
	 */
	void setSaga(Saga value);

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
	 * @see micro.MicroPackage#getOperation_Model()
	 * @model required="true"
	 * @generated
	 */
	Model getModel();

	/**
	 * Sets the value of the '{@link micro.Operation#getModel <em>Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model</em>' reference.
	 * @see #getModel()
	 * @generated
	 */
	void setModel(Model value);

	/**
	 * Returns the value of the '<em><b>Is Method Controller</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Method Controller</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Method Controller</em>' attribute.
	 * @see #setIsMethodController(boolean)
	 * @see micro.MicroPackage#getOperation_IsMethodController()
	 * @model
	 * @generated
	 */
	boolean isIsMethodController();

	/**
	 * Sets the value of the '{@link micro.Operation#isIsMethodController <em>Is Method Controller</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Method Controller</em>' attribute.
	 * @see #isIsMethodController()
	 * @generated
	 */
	void setIsMethodController(boolean value);

	/**
	 * Returns the value of the '<em><b>Aggregate Service</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link micro.AggregateService#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Aggregate Service</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aggregate Service</em>' container reference.
	 * @see #setAggregateService(AggregateService)
	 * @see micro.MicroPackage#getOperation_AggregateService()
	 * @see micro.AggregateService#getOperation
	 * @model opposite="operation" transient="false" ordered="false"
	 * @generated
	 */
	AggregateService getAggregateService();

	/**
	 * Sets the value of the '{@link micro.Operation#getAggregateService <em>Aggregate Service</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aggregate Service</em>' container reference.
	 * @see #getAggregateService()
	 * @generated
	 */
	void setAggregateService(AggregateService value);

} // Operation
