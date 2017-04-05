/**
 */
package edu.utd.cse.cerbac.cerbac.impl;

import edu.utd.cse.cerbac.cerbac.AuthorizationPolicy;
import edu.utd.cse.cerbac.cerbac.CerbacPackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Authorization Policy</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class AuthorizationPolicyImpl extends CerbacPolicyImpl implements AuthorizationPolicy {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AuthorizationPolicyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CerbacPackage.Literals.AUTHORIZATION_POLICY;
	}

} //AuthorizationPolicyImpl
