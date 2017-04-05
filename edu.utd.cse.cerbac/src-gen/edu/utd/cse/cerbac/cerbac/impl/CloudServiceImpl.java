/**
 */
package edu.utd.cse.cerbac.cerbac.impl;

import edu.utd.cse.cerbac.cerbac.CerbacPackage;
import edu.utd.cse.cerbac.cerbac.CloudService;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cloud Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class CloudServiceImpl extends CloudResourceImpl implements CloudService {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CloudServiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CerbacPackage.Literals.CLOUD_SERVICE;
	}

} //CloudServiceImpl
