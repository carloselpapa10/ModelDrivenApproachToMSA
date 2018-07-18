/**
 */
package micro.impl;

import java.util.Collection;

import micro.AggregateService;
import micro.MicroPackage;
import micro.ViewService;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>View Service</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link micro.impl.ViewServiceImpl#getReplicateServices <em>Replicate Services</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ViewServiceImpl extends ServiceImpl implements ViewService {
	/**
	 * The cached value of the '{@link #getReplicateServices() <em>Replicate Services</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReplicateServices()
	 * @generated
	 * @ordered
	 */
	protected EList<AggregateService> replicateServices;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ViewServiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MicroPackage.Literals.VIEW_SERVICE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AggregateService> getReplicateServices() {
		if (replicateServices == null) {
			replicateServices = new EObjectResolvingEList<AggregateService>(AggregateService.class, this, MicroPackage.VIEW_SERVICE__REPLICATE_SERVICES);
		}
		return replicateServices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MicroPackage.VIEW_SERVICE__REPLICATE_SERVICES:
				return getReplicateServices();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case MicroPackage.VIEW_SERVICE__REPLICATE_SERVICES:
				getReplicateServices().clear();
				getReplicateServices().addAll((Collection<? extends AggregateService>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case MicroPackage.VIEW_SERVICE__REPLICATE_SERVICES:
				getReplicateServices().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case MicroPackage.VIEW_SERVICE__REPLICATE_SERVICES:
				return replicateServices != null && !replicateServices.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ViewServiceImpl
