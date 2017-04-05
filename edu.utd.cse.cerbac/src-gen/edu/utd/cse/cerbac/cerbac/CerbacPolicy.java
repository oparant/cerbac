/**
 */
package edu.utd.cse.cerbac.cerbac;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Policy</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.utd.cse.cerbac.cerbac.CerbacPolicy#getAction <em>Action</em>}</li>
 *   <li>{@link edu.utd.cse.cerbac.cerbac.CerbacPolicy#getWho <em>Who</em>}</li>
 *   <li>{@link edu.utd.cse.cerbac.cerbac.CerbacPolicy#getWhere <em>Where</em>}</li>
 *   <li>{@link edu.utd.cse.cerbac.cerbac.CerbacPolicy#getWhy <em>Why</em>}</li>
 *   <li>{@link edu.utd.cse.cerbac.cerbac.CerbacPolicy#getHow <em>How</em>}</li>
 *   <li>{@link edu.utd.cse.cerbac.cerbac.CerbacPolicy#getWhen <em>When</em>}</li>
 *   <li>{@link edu.utd.cse.cerbac.cerbac.CerbacPolicy#getWhat <em>What</em>}</li>
 * </ul>
 *
 * @see edu.utd.cse.cerbac.cerbac.CerbacPackage#getCerbacPolicy()
 * @model abstract="true"
 * @generated
 */
public interface CerbacPolicy extends CloudSecurityAndPrivacyPolicy {
	/**
	 * Returns the value of the '<em><b>Action</b></em>' reference list.
	 * The list contents are of type {@link edu.utd.cse.cerbac.cerbac.Action}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Action</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action</em>' reference list.
	 * @see edu.utd.cse.cerbac.cerbac.CerbacPackage#getCerbacPolicy_Action()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EList<Action> getAction();

	/**
	 * Returns the value of the '<em><b>Who</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Who</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Who</em>' reference.
	 * @see #setWho(Who)
	 * @see edu.utd.cse.cerbac.cerbac.CerbacPackage#getCerbacPolicy_Who()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Who getWho();

	/**
	 * Sets the value of the '{@link edu.utd.cse.cerbac.cerbac.CerbacPolicy#getWho <em>Who</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Who</em>' reference.
	 * @see #getWho()
	 * @generated
	 */
	void setWho(Who value);

	/**
	 * Returns the value of the '<em><b>Where</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Where</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Where</em>' reference.
	 * @see #setWhere(Where)
	 * @see edu.utd.cse.cerbac.cerbac.CerbacPackage#getCerbacPolicy_Where()
	 * @model ordered="false"
	 * @generated
	 */
	Where getWhere();

	/**
	 * Sets the value of the '{@link edu.utd.cse.cerbac.cerbac.CerbacPolicy#getWhere <em>Where</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Where</em>' reference.
	 * @see #getWhere()
	 * @generated
	 */
	void setWhere(Where value);

	/**
	 * Returns the value of the '<em><b>Why</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Why</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Why</em>' reference.
	 * @see #setWhy(Why)
	 * @see edu.utd.cse.cerbac.cerbac.CerbacPackage#getCerbacPolicy_Why()
	 * @model ordered="false"
	 * @generated
	 */
	Why getWhy();

	/**
	 * Sets the value of the '{@link edu.utd.cse.cerbac.cerbac.CerbacPolicy#getWhy <em>Why</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Why</em>' reference.
	 * @see #getWhy()
	 * @generated
	 */
	void setWhy(Why value);

	/**
	 * Returns the value of the '<em><b>How</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>How</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>How</em>' reference.
	 * @see #setHow(How)
	 * @see edu.utd.cse.cerbac.cerbac.CerbacPackage#getCerbacPolicy_How()
	 * @model ordered="false"
	 * @generated
	 */
	How getHow();

	/**
	 * Sets the value of the '{@link edu.utd.cse.cerbac.cerbac.CerbacPolicy#getHow <em>How</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>How</em>' reference.
	 * @see #getHow()
	 * @generated
	 */
	void setHow(How value);

	/**
	 * Returns the value of the '<em><b>When</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>When</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>When</em>' reference.
	 * @see #setWhen(When)
	 * @see edu.utd.cse.cerbac.cerbac.CerbacPackage#getCerbacPolicy_When()
	 * @model ordered="false"
	 * @generated
	 */
	When getWhen();

	/**
	 * Sets the value of the '{@link edu.utd.cse.cerbac.cerbac.CerbacPolicy#getWhen <em>When</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>When</em>' reference.
	 * @see #getWhen()
	 * @generated
	 */
	void setWhen(When value);

	/**
	 * Returns the value of the '<em><b>What</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>What</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>What</em>' reference.
	 * @see #setWhat(What)
	 * @see edu.utd.cse.cerbac.cerbac.CerbacPackage#getCerbacPolicy_What()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	What getWhat();

	/**
	 * Sets the value of the '{@link edu.utd.cse.cerbac.cerbac.CerbacPolicy#getWhat <em>What</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>What</em>' reference.
	 * @see #getWhat()
	 * @generated
	 */
	void setWhat(What value);

} // CerbacPolicy
