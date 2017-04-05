/**
 */
package edu.utd.cse.cerbac.cerbac;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cloud Security And Privacy Policy</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.utd.cse.cerbac.cerbac.CloudSecurityAndPrivacyPolicy#getBase_Class <em>Base Class</em>}</li>
 * </ul>
 *
 * @see edu.utd.cse.cerbac.cerbac.CerbacPackage#getCloudSecurityAndPrivacyPolicy()
 * @model abstract="true"
 * @generated
 */
public interface CloudSecurityAndPrivacyPolicy extends EObject {
	/**
	 * Returns the value of the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Class</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Class</em>' reference.
	 * @see #setBase_Class(org.eclipse.uml2.uml.Class)
	 * @see edu.utd.cse.cerbac.cerbac.CerbacPackage#getCloudSecurityAndPrivacyPolicy_Base_Class()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	org.eclipse.uml2.uml.Class getBase_Class();

	/**
	 * Sets the value of the '{@link edu.utd.cse.cerbac.cerbac.CloudSecurityAndPrivacyPolicy#getBase_Class <em>Base Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Class</em>' reference.
	 * @see #getBase_Class()
	 * @generated
	 */
	void setBase_Class(org.eclipse.uml2.uml.Class value);

} // CloudSecurityAndPrivacyPolicy
