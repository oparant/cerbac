/**
 */
package edu.utd.cse.cerbac.cerbac;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see edu.utd.cse.cerbac.cerbac.CerbacFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Cerbac'"
 * @generated
 */
public interface CerbacPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "cerbac";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.utd.edu/cse/Cerbac";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "Cerbac";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CerbacPackage eINSTANCE = edu.utd.cse.cerbac.cerbac.impl.CerbacPackageImpl.init();

	/**
	 * The meta object id for the '{@link edu.utd.cse.cerbac.cerbac.impl.CloudSecurityAndPrivacyPolicyImpl <em>Cloud Security And Privacy Policy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.utd.cse.cerbac.cerbac.impl.CloudSecurityAndPrivacyPolicyImpl
	 * @see edu.utd.cse.cerbac.cerbac.impl.CerbacPackageImpl#getCloudSecurityAndPrivacyPolicy()
	 * @generated
	 */
	int CLOUD_SECURITY_AND_PRIVACY_POLICY = 0;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_SECURITY_AND_PRIVACY_POLICY__BASE_CLASS = 0;

	/**
	 * The number of structural features of the '<em>Cloud Security And Privacy Policy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_SECURITY_AND_PRIVACY_POLICY_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Cloud Security And Privacy Policy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_SECURITY_AND_PRIVACY_POLICY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.utd.cse.cerbac.cerbac.impl.CerbacPolicyImpl <em>Policy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.utd.cse.cerbac.cerbac.impl.CerbacPolicyImpl
	 * @see edu.utd.cse.cerbac.cerbac.impl.CerbacPackageImpl#getCerbacPolicy()
	 * @generated
	 */
	int CERBAC_POLICY = 1;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CERBAC_POLICY__BASE_CLASS = CLOUD_SECURITY_AND_PRIVACY_POLICY__BASE_CLASS;

	/**
	 * The feature id for the '<em><b>Action</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CERBAC_POLICY__ACTION = CLOUD_SECURITY_AND_PRIVACY_POLICY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Who</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CERBAC_POLICY__WHO = CLOUD_SECURITY_AND_PRIVACY_POLICY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Where</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CERBAC_POLICY__WHERE = CLOUD_SECURITY_AND_PRIVACY_POLICY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Why</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CERBAC_POLICY__WHY = CLOUD_SECURITY_AND_PRIVACY_POLICY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>How</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CERBAC_POLICY__HOW = CLOUD_SECURITY_AND_PRIVACY_POLICY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>When</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CERBAC_POLICY__WHEN = CLOUD_SECURITY_AND_PRIVACY_POLICY_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>What</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CERBAC_POLICY__WHAT = CLOUD_SECURITY_AND_PRIVACY_POLICY_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Policy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CERBAC_POLICY_FEATURE_COUNT = CLOUD_SECURITY_AND_PRIVACY_POLICY_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Policy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CERBAC_POLICY_OPERATION_COUNT = CLOUD_SECURITY_AND_PRIVACY_POLICY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.utd.cse.cerbac.cerbac.impl.ActionImpl <em>Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.utd.cse.cerbac.cerbac.impl.ActionImpl
	 * @see edu.utd.cse.cerbac.cerbac.impl.CerbacPackageImpl#getAction()
	 * @generated
	 */
	int ACTION = 2;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__BASE_CLASS = 0;

	/**
	 * The number of structural features of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.utd.cse.cerbac.cerbac.impl.PolicyAttributesImpl <em>Policy Attributes</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.utd.cse.cerbac.cerbac.impl.PolicyAttributesImpl
	 * @see edu.utd.cse.cerbac.cerbac.impl.CerbacPackageImpl#getPolicyAttributes()
	 * @generated
	 */
	int POLICY_ATTRIBUTES = 4;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_ATTRIBUTES__BASE_CLASS = 0;

	/**
	 * The number of structural features of the '<em>Policy Attributes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_ATTRIBUTES_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Policy Attributes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_ATTRIBUTES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.utd.cse.cerbac.cerbac.impl.WhoImpl <em>Who</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.utd.cse.cerbac.cerbac.impl.WhoImpl
	 * @see edu.utd.cse.cerbac.cerbac.impl.CerbacPackageImpl#getWho()
	 * @generated
	 */
	int WHO = 3;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHO__BASE_CLASS = POLICY_ATTRIBUTES__BASE_CLASS;

	/**
	 * The number of structural features of the '<em>Who</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHO_FEATURE_COUNT = POLICY_ATTRIBUTES_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Who</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHO_OPERATION_COUNT = POLICY_ATTRIBUTES_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.utd.cse.cerbac.cerbac.impl.WhereImpl <em>Where</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.utd.cse.cerbac.cerbac.impl.WhereImpl
	 * @see edu.utd.cse.cerbac.cerbac.impl.CerbacPackageImpl#getWhere()
	 * @generated
	 */
	int WHERE = 5;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHERE__BASE_CLASS = POLICY_ATTRIBUTES__BASE_CLASS;

	/**
	 * The number of structural features of the '<em>Where</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHERE_FEATURE_COUNT = POLICY_ATTRIBUTES_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Where</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHERE_OPERATION_COUNT = POLICY_ATTRIBUTES_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.utd.cse.cerbac.cerbac.impl.WhyImpl <em>Why</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.utd.cse.cerbac.cerbac.impl.WhyImpl
	 * @see edu.utd.cse.cerbac.cerbac.impl.CerbacPackageImpl#getWhy()
	 * @generated
	 */
	int WHY = 6;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHY__BASE_CLASS = POLICY_ATTRIBUTES__BASE_CLASS;

	/**
	 * The number of structural features of the '<em>Why</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHY_FEATURE_COUNT = POLICY_ATTRIBUTES_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Why</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHY_OPERATION_COUNT = POLICY_ATTRIBUTES_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.utd.cse.cerbac.cerbac.impl.HowImpl <em>How</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.utd.cse.cerbac.cerbac.impl.HowImpl
	 * @see edu.utd.cse.cerbac.cerbac.impl.CerbacPackageImpl#getHow()
	 * @generated
	 */
	int HOW = 7;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOW__BASE_CLASS = POLICY_ATTRIBUTES__BASE_CLASS;

	/**
	 * The number of structural features of the '<em>How</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOW_FEATURE_COUNT = POLICY_ATTRIBUTES_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>How</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOW_OPERATION_COUNT = POLICY_ATTRIBUTES_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.utd.cse.cerbac.cerbac.impl.WhenImpl <em>When</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.utd.cse.cerbac.cerbac.impl.WhenImpl
	 * @see edu.utd.cse.cerbac.cerbac.impl.CerbacPackageImpl#getWhen()
	 * @generated
	 */
	int WHEN = 8;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHEN__BASE_CLASS = POLICY_ATTRIBUTES__BASE_CLASS;

	/**
	 * The number of structural features of the '<em>When</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHEN_FEATURE_COUNT = POLICY_ATTRIBUTES_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>When</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHEN_OPERATION_COUNT = POLICY_ATTRIBUTES_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.utd.cse.cerbac.cerbac.impl.WhatImpl <em>What</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.utd.cse.cerbac.cerbac.impl.WhatImpl
	 * @see edu.utd.cse.cerbac.cerbac.impl.CerbacPackageImpl#getWhat()
	 * @generated
	 */
	int WHAT = 9;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHAT__BASE_CLASS = POLICY_ATTRIBUTES__BASE_CLASS;

	/**
	 * The number of structural features of the '<em>What</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHAT_FEATURE_COUNT = POLICY_ATTRIBUTES_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>What</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHAT_OPERATION_COUNT = POLICY_ATTRIBUTES_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.utd.cse.cerbac.cerbac.impl.AuthorizationPolicyImpl <em>Authorization Policy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.utd.cse.cerbac.cerbac.impl.AuthorizationPolicyImpl
	 * @see edu.utd.cse.cerbac.cerbac.impl.CerbacPackageImpl#getAuthorizationPolicy()
	 * @generated
	 */
	int AUTHORIZATION_POLICY = 10;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHORIZATION_POLICY__BASE_CLASS = CERBAC_POLICY__BASE_CLASS;

	/**
	 * The feature id for the '<em><b>Action</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHORIZATION_POLICY__ACTION = CERBAC_POLICY__ACTION;

	/**
	 * The feature id for the '<em><b>Who</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHORIZATION_POLICY__WHO = CERBAC_POLICY__WHO;

	/**
	 * The feature id for the '<em><b>Where</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHORIZATION_POLICY__WHERE = CERBAC_POLICY__WHERE;

	/**
	 * The feature id for the '<em><b>Why</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHORIZATION_POLICY__WHY = CERBAC_POLICY__WHY;

	/**
	 * The feature id for the '<em><b>How</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHORIZATION_POLICY__HOW = CERBAC_POLICY__HOW;

	/**
	 * The feature id for the '<em><b>When</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHORIZATION_POLICY__WHEN = CERBAC_POLICY__WHEN;

	/**
	 * The feature id for the '<em><b>What</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHORIZATION_POLICY__WHAT = CERBAC_POLICY__WHAT;

	/**
	 * The number of structural features of the '<em>Authorization Policy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHORIZATION_POLICY_FEATURE_COUNT = CERBAC_POLICY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Authorization Policy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHORIZATION_POLICY_OPERATION_COUNT = CERBAC_POLICY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.utd.cse.cerbac.cerbac.impl.ObligationPolicyImpl <em>Obligation Policy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.utd.cse.cerbac.cerbac.impl.ObligationPolicyImpl
	 * @see edu.utd.cse.cerbac.cerbac.impl.CerbacPackageImpl#getObligationPolicy()
	 * @generated
	 */
	int OBLIGATION_POLICY = 11;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBLIGATION_POLICY__BASE_CLASS = CERBAC_POLICY__BASE_CLASS;

	/**
	 * The feature id for the '<em><b>Action</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBLIGATION_POLICY__ACTION = CERBAC_POLICY__ACTION;

	/**
	 * The feature id for the '<em><b>Who</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBLIGATION_POLICY__WHO = CERBAC_POLICY__WHO;

	/**
	 * The feature id for the '<em><b>Where</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBLIGATION_POLICY__WHERE = CERBAC_POLICY__WHERE;

	/**
	 * The feature id for the '<em><b>Why</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBLIGATION_POLICY__WHY = CERBAC_POLICY__WHY;

	/**
	 * The feature id for the '<em><b>How</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBLIGATION_POLICY__HOW = CERBAC_POLICY__HOW;

	/**
	 * The feature id for the '<em><b>When</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBLIGATION_POLICY__WHEN = CERBAC_POLICY__WHEN;

	/**
	 * The feature id for the '<em><b>What</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBLIGATION_POLICY__WHAT = CERBAC_POLICY__WHAT;

	/**
	 * The number of structural features of the '<em>Obligation Policy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBLIGATION_POLICY_FEATURE_COUNT = CERBAC_POLICY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Obligation Policy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBLIGATION_POLICY_OPERATION_COUNT = CERBAC_POLICY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.utd.cse.cerbac.cerbac.impl.PositiveAuthorizationImpl <em>Positive Authorization</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.utd.cse.cerbac.cerbac.impl.PositiveAuthorizationImpl
	 * @see edu.utd.cse.cerbac.cerbac.impl.CerbacPackageImpl#getPositiveAuthorization()
	 * @generated
	 */
	int POSITIVE_AUTHORIZATION = 12;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITIVE_AUTHORIZATION__BASE_CLASS = AUTHORIZATION_POLICY__BASE_CLASS;

	/**
	 * The feature id for the '<em><b>Action</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITIVE_AUTHORIZATION__ACTION = AUTHORIZATION_POLICY__ACTION;

	/**
	 * The feature id for the '<em><b>Who</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITIVE_AUTHORIZATION__WHO = AUTHORIZATION_POLICY__WHO;

	/**
	 * The feature id for the '<em><b>Where</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITIVE_AUTHORIZATION__WHERE = AUTHORIZATION_POLICY__WHERE;

	/**
	 * The feature id for the '<em><b>Why</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITIVE_AUTHORIZATION__WHY = AUTHORIZATION_POLICY__WHY;

	/**
	 * The feature id for the '<em><b>How</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITIVE_AUTHORIZATION__HOW = AUTHORIZATION_POLICY__HOW;

	/**
	 * The feature id for the '<em><b>When</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITIVE_AUTHORIZATION__WHEN = AUTHORIZATION_POLICY__WHEN;

	/**
	 * The feature id for the '<em><b>What</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITIVE_AUTHORIZATION__WHAT = AUTHORIZATION_POLICY__WHAT;

	/**
	 * The number of structural features of the '<em>Positive Authorization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITIVE_AUTHORIZATION_FEATURE_COUNT = AUTHORIZATION_POLICY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Positive Authorization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITIVE_AUTHORIZATION_OPERATION_COUNT = AUTHORIZATION_POLICY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.utd.cse.cerbac.cerbac.impl.NegativeAuthorizationImpl <em>Negative Authorization</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.utd.cse.cerbac.cerbac.impl.NegativeAuthorizationImpl
	 * @see edu.utd.cse.cerbac.cerbac.impl.CerbacPackageImpl#getNegativeAuthorization()
	 * @generated
	 */
	int NEGATIVE_AUTHORIZATION = 13;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATIVE_AUTHORIZATION__BASE_CLASS = AUTHORIZATION_POLICY__BASE_CLASS;

	/**
	 * The feature id for the '<em><b>Action</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATIVE_AUTHORIZATION__ACTION = AUTHORIZATION_POLICY__ACTION;

	/**
	 * The feature id for the '<em><b>Who</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATIVE_AUTHORIZATION__WHO = AUTHORIZATION_POLICY__WHO;

	/**
	 * The feature id for the '<em><b>Where</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATIVE_AUTHORIZATION__WHERE = AUTHORIZATION_POLICY__WHERE;

	/**
	 * The feature id for the '<em><b>Why</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATIVE_AUTHORIZATION__WHY = AUTHORIZATION_POLICY__WHY;

	/**
	 * The feature id for the '<em><b>How</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATIVE_AUTHORIZATION__HOW = AUTHORIZATION_POLICY__HOW;

	/**
	 * The feature id for the '<em><b>When</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATIVE_AUTHORIZATION__WHEN = AUTHORIZATION_POLICY__WHEN;

	/**
	 * The feature id for the '<em><b>What</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATIVE_AUTHORIZATION__WHAT = AUTHORIZATION_POLICY__WHAT;

	/**
	 * The number of structural features of the '<em>Negative Authorization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATIVE_AUTHORIZATION_FEATURE_COUNT = AUTHORIZATION_POLICY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Negative Authorization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATIVE_AUTHORIZATION_OPERATION_COUNT = AUTHORIZATION_POLICY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.utd.cse.cerbac.cerbac.impl.PositiveObligationImpl <em>Positive Obligation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.utd.cse.cerbac.cerbac.impl.PositiveObligationImpl
	 * @see edu.utd.cse.cerbac.cerbac.impl.CerbacPackageImpl#getPositiveObligation()
	 * @generated
	 */
	int POSITIVE_OBLIGATION = 14;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITIVE_OBLIGATION__BASE_CLASS = OBLIGATION_POLICY__BASE_CLASS;

	/**
	 * The feature id for the '<em><b>Action</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITIVE_OBLIGATION__ACTION = OBLIGATION_POLICY__ACTION;

	/**
	 * The feature id for the '<em><b>Who</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITIVE_OBLIGATION__WHO = OBLIGATION_POLICY__WHO;

	/**
	 * The feature id for the '<em><b>Where</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITIVE_OBLIGATION__WHERE = OBLIGATION_POLICY__WHERE;

	/**
	 * The feature id for the '<em><b>Why</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITIVE_OBLIGATION__WHY = OBLIGATION_POLICY__WHY;

	/**
	 * The feature id for the '<em><b>How</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITIVE_OBLIGATION__HOW = OBLIGATION_POLICY__HOW;

	/**
	 * The feature id for the '<em><b>When</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITIVE_OBLIGATION__WHEN = OBLIGATION_POLICY__WHEN;

	/**
	 * The feature id for the '<em><b>What</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITIVE_OBLIGATION__WHAT = OBLIGATION_POLICY__WHAT;

	/**
	 * The number of structural features of the '<em>Positive Obligation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITIVE_OBLIGATION_FEATURE_COUNT = OBLIGATION_POLICY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Positive Obligation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITIVE_OBLIGATION_OPERATION_COUNT = OBLIGATION_POLICY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.utd.cse.cerbac.cerbac.impl.NegativeObligationImpl <em>Negative Obligation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.utd.cse.cerbac.cerbac.impl.NegativeObligationImpl
	 * @see edu.utd.cse.cerbac.cerbac.impl.CerbacPackageImpl#getNegativeObligation()
	 * @generated
	 */
	int NEGATIVE_OBLIGATION = 15;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATIVE_OBLIGATION__BASE_CLASS = OBLIGATION_POLICY__BASE_CLASS;

	/**
	 * The feature id for the '<em><b>Action</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATIVE_OBLIGATION__ACTION = OBLIGATION_POLICY__ACTION;

	/**
	 * The feature id for the '<em><b>Who</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATIVE_OBLIGATION__WHO = OBLIGATION_POLICY__WHO;

	/**
	 * The feature id for the '<em><b>Where</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATIVE_OBLIGATION__WHERE = OBLIGATION_POLICY__WHERE;

	/**
	 * The feature id for the '<em><b>Why</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATIVE_OBLIGATION__WHY = OBLIGATION_POLICY__WHY;

	/**
	 * The feature id for the '<em><b>How</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATIVE_OBLIGATION__HOW = OBLIGATION_POLICY__HOW;

	/**
	 * The feature id for the '<em><b>When</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATIVE_OBLIGATION__WHEN = OBLIGATION_POLICY__WHEN;

	/**
	 * The feature id for the '<em><b>What</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATIVE_OBLIGATION__WHAT = OBLIGATION_POLICY__WHAT;

	/**
	 * The number of structural features of the '<em>Negative Obligation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATIVE_OBLIGATION_FEATURE_COUNT = OBLIGATION_POLICY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Negative Obligation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATIVE_OBLIGATION_OPERATION_COUNT = OBLIGATION_POLICY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.utd.cse.cerbac.cerbac.impl.PolicyContainerImpl <em>Policy Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.utd.cse.cerbac.cerbac.impl.PolicyContainerImpl
	 * @see edu.utd.cse.cerbac.cerbac.impl.CerbacPackageImpl#getPolicyContainer()
	 * @generated
	 */
	int POLICY_CONTAINER = 16;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_CONTAINER__BASE_CLASS = 0;

	/**
	 * The feature id for the '<em><b>Base Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_CONTAINER__BASE_PACKAGE = 1;

	/**
	 * The number of structural features of the '<em>Policy Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_CONTAINER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Policy Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_CONTAINER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.utd.cse.cerbac.cerbac.impl.CloudResourceImpl <em>Cloud Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.utd.cse.cerbac.cerbac.impl.CloudResourceImpl
	 * @see edu.utd.cse.cerbac.cerbac.impl.CerbacPackageImpl#getCloudResource()
	 * @generated
	 */
	int CLOUD_RESOURCE = 17;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_RESOURCE__BASE_CLASS = 0;

	/**
	 * The number of structural features of the '<em>Cloud Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_RESOURCE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Cloud Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_RESOURCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.utd.cse.cerbac.cerbac.impl.CloudServiceImpl <em>Cloud Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.utd.cse.cerbac.cerbac.impl.CloudServiceImpl
	 * @see edu.utd.cse.cerbac.cerbac.impl.CerbacPackageImpl#getCloudService()
	 * @generated
	 */
	int CLOUD_SERVICE = 18;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_SERVICE__BASE_CLASS = CLOUD_RESOURCE__BASE_CLASS;

	/**
	 * The number of structural features of the '<em>Cloud Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_SERVICE_FEATURE_COUNT = CLOUD_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Cloud Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_SERVICE_OPERATION_COUNT = CLOUD_RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.utd.cse.cerbac.cerbac.impl.HardwareImpl <em>Hardware</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.utd.cse.cerbac.cerbac.impl.HardwareImpl
	 * @see edu.utd.cse.cerbac.cerbac.impl.CerbacPackageImpl#getHardware()
	 * @generated
	 */
	int HARDWARE = 19;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE__BASE_CLASS = CLOUD_RESOURCE__BASE_CLASS;

	/**
	 * The number of structural features of the '<em>Hardware</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_FEATURE_COUNT = CLOUD_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Hardware</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_OPERATION_COUNT = CLOUD_RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.utd.cse.cerbac.cerbac.impl.DataImpl <em>Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.utd.cse.cerbac.cerbac.impl.DataImpl
	 * @see edu.utd.cse.cerbac.cerbac.impl.CerbacPackageImpl#getData()
	 * @generated
	 */
	int DATA = 20;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__BASE_CLASS = CLOUD_RESOURCE__BASE_CLASS;

	/**
	 * The number of structural features of the '<em>Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FEATURE_COUNT = CLOUD_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OPERATION_COUNT = CLOUD_RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.utd.cse.cerbac.cerbac.impl.ComputeServiceImpl <em>Compute Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.utd.cse.cerbac.cerbac.impl.ComputeServiceImpl
	 * @see edu.utd.cse.cerbac.cerbac.impl.CerbacPackageImpl#getComputeService()
	 * @generated
	 */
	int COMPUTE_SERVICE = 21;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTE_SERVICE__BASE_CLASS = CLOUD_SERVICE__BASE_CLASS;

	/**
	 * The number of structural features of the '<em>Compute Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTE_SERVICE_FEATURE_COUNT = CLOUD_SERVICE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Compute Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTE_SERVICE_OPERATION_COUNT = CLOUD_SERVICE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.utd.cse.cerbac.cerbac.impl.NetworkingServiceImpl <em>Networking Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.utd.cse.cerbac.cerbac.impl.NetworkingServiceImpl
	 * @see edu.utd.cse.cerbac.cerbac.impl.CerbacPackageImpl#getNetworkingService()
	 * @generated
	 */
	int NETWORKING_SERVICE = 22;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORKING_SERVICE__BASE_CLASS = CLOUD_SERVICE__BASE_CLASS;

	/**
	 * The number of structural features of the '<em>Networking Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORKING_SERVICE_FEATURE_COUNT = CLOUD_SERVICE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Networking Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORKING_SERVICE_OPERATION_COUNT = CLOUD_SERVICE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.utd.cse.cerbac.cerbac.impl.StorageServiceImpl <em>Storage Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.utd.cse.cerbac.cerbac.impl.StorageServiceImpl
	 * @see edu.utd.cse.cerbac.cerbac.impl.CerbacPackageImpl#getStorageService()
	 * @generated
	 */
	int STORAGE_SERVICE = 23;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_SERVICE__BASE_CLASS = CLOUD_SERVICE__BASE_CLASS;

	/**
	 * The number of structural features of the '<em>Storage Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_SERVICE_FEATURE_COUNT = CLOUD_SERVICE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Storage Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_SERVICE_OPERATION_COUNT = CLOUD_SERVICE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.utd.cse.cerbac.cerbac.impl.StorageImpl <em>Storage</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.utd.cse.cerbac.cerbac.impl.StorageImpl
	 * @see edu.utd.cse.cerbac.cerbac.impl.CerbacPackageImpl#getStorage()
	 * @generated
	 */
	int STORAGE = 24;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE__BASE_CLASS = CLOUD_RESOURCE__BASE_CLASS;

	/**
	 * The number of structural features of the '<em>Storage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_FEATURE_COUNT = CLOUD_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Storage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_OPERATION_COUNT = CLOUD_RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.utd.cse.cerbac.cerbac.impl.ActionLinkImpl <em>Action Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.utd.cse.cerbac.cerbac.impl.ActionLinkImpl
	 * @see edu.utd.cse.cerbac.cerbac.impl.CerbacPackageImpl#getActionLink()
	 * @generated
	 */
	int ACTION_LINK = 25;

	/**
	 * The feature id for the '<em><b>Base Association</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_LINK__BASE_ASSOCIATION = 0;

	/**
	 * The number of structural features of the '<em>Action Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_LINK_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Action Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_LINK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.utd.cse.cerbac.cerbac.impl.HowLinkImpl <em>How Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.utd.cse.cerbac.cerbac.impl.HowLinkImpl
	 * @see edu.utd.cse.cerbac.cerbac.impl.CerbacPackageImpl#getHowLink()
	 * @generated
	 */
	int HOW_LINK = 26;

	/**
	 * The feature id for the '<em><b>Base Association</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOW_LINK__BASE_ASSOCIATION = 0;

	/**
	 * The number of structural features of the '<em>How Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOW_LINK_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>How Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOW_LINK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.utd.cse.cerbac.cerbac.impl.WhatLinkImpl <em>What Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.utd.cse.cerbac.cerbac.impl.WhatLinkImpl
	 * @see edu.utd.cse.cerbac.cerbac.impl.CerbacPackageImpl#getWhatLink()
	 * @generated
	 */
	int WHAT_LINK = 27;

	/**
	 * The feature id for the '<em><b>Base Association</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHAT_LINK__BASE_ASSOCIATION = 0;

	/**
	 * The number of structural features of the '<em>What Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHAT_LINK_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>What Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHAT_LINK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.utd.cse.cerbac.cerbac.impl.WhereLinkImpl <em>Where Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.utd.cse.cerbac.cerbac.impl.WhereLinkImpl
	 * @see edu.utd.cse.cerbac.cerbac.impl.CerbacPackageImpl#getWhereLink()
	 * @generated
	 */
	int WHERE_LINK = 28;

	/**
	 * The feature id for the '<em><b>Base Association</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHERE_LINK__BASE_ASSOCIATION = 0;

	/**
	 * The number of structural features of the '<em>Where Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHERE_LINK_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Where Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHERE_LINK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.utd.cse.cerbac.cerbac.impl.WhoLinkImpl <em>Who Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.utd.cse.cerbac.cerbac.impl.WhoLinkImpl
	 * @see edu.utd.cse.cerbac.cerbac.impl.CerbacPackageImpl#getWhoLink()
	 * @generated
	 */
	int WHO_LINK = 29;

	/**
	 * The feature id for the '<em><b>Base Association</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHO_LINK__BASE_ASSOCIATION = 0;

	/**
	 * The number of structural features of the '<em>Who Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHO_LINK_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Who Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHO_LINK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.utd.cse.cerbac.cerbac.impl.WhenLinkImpl <em>When Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.utd.cse.cerbac.cerbac.impl.WhenLinkImpl
	 * @see edu.utd.cse.cerbac.cerbac.impl.CerbacPackageImpl#getWhenLink()
	 * @generated
	 */
	int WHEN_LINK = 30;

	/**
	 * The feature id for the '<em><b>Base Association</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHEN_LINK__BASE_ASSOCIATION = 0;

	/**
	 * The number of structural features of the '<em>When Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHEN_LINK_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>When Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHEN_LINK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.utd.cse.cerbac.cerbac.impl.WhyLinkImpl <em>Why Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.utd.cse.cerbac.cerbac.impl.WhyLinkImpl
	 * @see edu.utd.cse.cerbac.cerbac.impl.CerbacPackageImpl#getWhyLink()
	 * @generated
	 */
	int WHY_LINK = 31;

	/**
	 * The feature id for the '<em><b>Base Association</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHY_LINK__BASE_ASSOCIATION = 0;

	/**
	 * The number of structural features of the '<em>Why Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHY_LINK_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Why Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHY_LINK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.utd.cse.cerbac.cerbac.impl.PolicyAttributeExtendImpl <em>Policy Attribute Extend</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.utd.cse.cerbac.cerbac.impl.PolicyAttributeExtendImpl
	 * @see edu.utd.cse.cerbac.cerbac.impl.CerbacPackageImpl#getPolicyAttributeExtend()
	 * @generated
	 */
	int POLICY_ATTRIBUTE_EXTEND = 32;

	/**
	 * The feature id for the '<em><b>Base Extension</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_ATTRIBUTE_EXTEND__BASE_EXTENSION = 0;

	/**
	 * The feature id for the '<em><b>Base Generalization</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_ATTRIBUTE_EXTEND__BASE_GENERALIZATION = 1;

	/**
	 * The number of structural features of the '<em>Policy Attribute Extend</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_ATTRIBUTE_EXTEND_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Policy Attribute Extend</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_ATTRIBUTE_EXTEND_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.utd.cse.cerbac.cerbac.impl.PolicyAttributeLinkImpl <em>Policy Attribute Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.utd.cse.cerbac.cerbac.impl.PolicyAttributeLinkImpl
	 * @see edu.utd.cse.cerbac.cerbac.impl.CerbacPackageImpl#getPolicyAttributeLink()
	 * @generated
	 */
	int POLICY_ATTRIBUTE_LINK = 33;

	/**
	 * The feature id for the '<em><b>Base Association</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_ATTRIBUTE_LINK__BASE_ASSOCIATION = 0;

	/**
	 * The number of structural features of the '<em>Policy Attribute Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_ATTRIBUTE_LINK_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Policy Attribute Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_ATTRIBUTE_LINK_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link edu.utd.cse.cerbac.cerbac.CloudSecurityAndPrivacyPolicy <em>Cloud Security And Privacy Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cloud Security And Privacy Policy</em>'.
	 * @see edu.utd.cse.cerbac.cerbac.CloudSecurityAndPrivacyPolicy
	 * @generated
	 */
	EClass getCloudSecurityAndPrivacyPolicy();

	/**
	 * Returns the meta object for the reference '{@link edu.utd.cse.cerbac.cerbac.CloudSecurityAndPrivacyPolicy#getBase_Class <em>Base Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Class</em>'.
	 * @see edu.utd.cse.cerbac.cerbac.CloudSecurityAndPrivacyPolicy#getBase_Class()
	 * @see #getCloudSecurityAndPrivacyPolicy()
	 * @generated
	 */
	EReference getCloudSecurityAndPrivacyPolicy_Base_Class();

	/**
	 * Returns the meta object for class '{@link edu.utd.cse.cerbac.cerbac.CerbacPolicy <em>Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Policy</em>'.
	 * @see edu.utd.cse.cerbac.cerbac.CerbacPolicy
	 * @generated
	 */
	EClass getCerbacPolicy();

	/**
	 * Returns the meta object for the reference list '{@link edu.utd.cse.cerbac.cerbac.CerbacPolicy#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Action</em>'.
	 * @see edu.utd.cse.cerbac.cerbac.CerbacPolicy#getAction()
	 * @see #getCerbacPolicy()
	 * @generated
	 */
	EReference getCerbacPolicy_Action();

	/**
	 * Returns the meta object for the reference '{@link edu.utd.cse.cerbac.cerbac.CerbacPolicy#getWho <em>Who</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Who</em>'.
	 * @see edu.utd.cse.cerbac.cerbac.CerbacPolicy#getWho()
	 * @see #getCerbacPolicy()
	 * @generated
	 */
	EReference getCerbacPolicy_Who();

	/**
	 * Returns the meta object for the reference '{@link edu.utd.cse.cerbac.cerbac.CerbacPolicy#getWhere <em>Where</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Where</em>'.
	 * @see edu.utd.cse.cerbac.cerbac.CerbacPolicy#getWhere()
	 * @see #getCerbacPolicy()
	 * @generated
	 */
	EReference getCerbacPolicy_Where();

	/**
	 * Returns the meta object for the reference '{@link edu.utd.cse.cerbac.cerbac.CerbacPolicy#getWhy <em>Why</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Why</em>'.
	 * @see edu.utd.cse.cerbac.cerbac.CerbacPolicy#getWhy()
	 * @see #getCerbacPolicy()
	 * @generated
	 */
	EReference getCerbacPolicy_Why();

	/**
	 * Returns the meta object for the reference '{@link edu.utd.cse.cerbac.cerbac.CerbacPolicy#getHow <em>How</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>How</em>'.
	 * @see edu.utd.cse.cerbac.cerbac.CerbacPolicy#getHow()
	 * @see #getCerbacPolicy()
	 * @generated
	 */
	EReference getCerbacPolicy_How();

	/**
	 * Returns the meta object for the reference '{@link edu.utd.cse.cerbac.cerbac.CerbacPolicy#getWhen <em>When</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>When</em>'.
	 * @see edu.utd.cse.cerbac.cerbac.CerbacPolicy#getWhen()
	 * @see #getCerbacPolicy()
	 * @generated
	 */
	EReference getCerbacPolicy_When();

	/**
	 * Returns the meta object for the reference '{@link edu.utd.cse.cerbac.cerbac.CerbacPolicy#getWhat <em>What</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>What</em>'.
	 * @see edu.utd.cse.cerbac.cerbac.CerbacPolicy#getWhat()
	 * @see #getCerbacPolicy()
	 * @generated
	 */
	EReference getCerbacPolicy_What();

	/**
	 * Returns the meta object for class '{@link edu.utd.cse.cerbac.cerbac.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action</em>'.
	 * @see edu.utd.cse.cerbac.cerbac.Action
	 * @generated
	 */
	EClass getAction();

	/**
	 * Returns the meta object for the reference '{@link edu.utd.cse.cerbac.cerbac.Action#getBase_Class <em>Base Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Class</em>'.
	 * @see edu.utd.cse.cerbac.cerbac.Action#getBase_Class()
	 * @see #getAction()
	 * @generated
	 */
	EReference getAction_Base_Class();

	/**
	 * Returns the meta object for class '{@link edu.utd.cse.cerbac.cerbac.Who <em>Who</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Who</em>'.
	 * @see edu.utd.cse.cerbac.cerbac.Who
	 * @generated
	 */
	EClass getWho();

	/**
	 * Returns the meta object for class '{@link edu.utd.cse.cerbac.cerbac.PolicyAttributes <em>Policy Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Policy Attributes</em>'.
	 * @see edu.utd.cse.cerbac.cerbac.PolicyAttributes
	 * @generated
	 */
	EClass getPolicyAttributes();

	/**
	 * Returns the meta object for the reference '{@link edu.utd.cse.cerbac.cerbac.PolicyAttributes#getBase_Class <em>Base Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Class</em>'.
	 * @see edu.utd.cse.cerbac.cerbac.PolicyAttributes#getBase_Class()
	 * @see #getPolicyAttributes()
	 * @generated
	 */
	EReference getPolicyAttributes_Base_Class();

	/**
	 * Returns the meta object for class '{@link edu.utd.cse.cerbac.cerbac.Where <em>Where</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Where</em>'.
	 * @see edu.utd.cse.cerbac.cerbac.Where
	 * @generated
	 */
	EClass getWhere();

	/**
	 * Returns the meta object for class '{@link edu.utd.cse.cerbac.cerbac.Why <em>Why</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Why</em>'.
	 * @see edu.utd.cse.cerbac.cerbac.Why
	 * @generated
	 */
	EClass getWhy();

	/**
	 * Returns the meta object for class '{@link edu.utd.cse.cerbac.cerbac.How <em>How</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>How</em>'.
	 * @see edu.utd.cse.cerbac.cerbac.How
	 * @generated
	 */
	EClass getHow();

	/**
	 * Returns the meta object for class '{@link edu.utd.cse.cerbac.cerbac.When <em>When</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>When</em>'.
	 * @see edu.utd.cse.cerbac.cerbac.When
	 * @generated
	 */
	EClass getWhen();

	/**
	 * Returns the meta object for class '{@link edu.utd.cse.cerbac.cerbac.What <em>What</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>What</em>'.
	 * @see edu.utd.cse.cerbac.cerbac.What
	 * @generated
	 */
	EClass getWhat();

	/**
	 * Returns the meta object for class '{@link edu.utd.cse.cerbac.cerbac.AuthorizationPolicy <em>Authorization Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Authorization Policy</em>'.
	 * @see edu.utd.cse.cerbac.cerbac.AuthorizationPolicy
	 * @generated
	 */
	EClass getAuthorizationPolicy();

	/**
	 * Returns the meta object for class '{@link edu.utd.cse.cerbac.cerbac.ObligationPolicy <em>Obligation Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Obligation Policy</em>'.
	 * @see edu.utd.cse.cerbac.cerbac.ObligationPolicy
	 * @generated
	 */
	EClass getObligationPolicy();

	/**
	 * Returns the meta object for class '{@link edu.utd.cse.cerbac.cerbac.PositiveAuthorization <em>Positive Authorization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Positive Authorization</em>'.
	 * @see edu.utd.cse.cerbac.cerbac.PositiveAuthorization
	 * @generated
	 */
	EClass getPositiveAuthorization();

	/**
	 * Returns the meta object for class '{@link edu.utd.cse.cerbac.cerbac.NegativeAuthorization <em>Negative Authorization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Negative Authorization</em>'.
	 * @see edu.utd.cse.cerbac.cerbac.NegativeAuthorization
	 * @generated
	 */
	EClass getNegativeAuthorization();

	/**
	 * Returns the meta object for class '{@link edu.utd.cse.cerbac.cerbac.PositiveObligation <em>Positive Obligation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Positive Obligation</em>'.
	 * @see edu.utd.cse.cerbac.cerbac.PositiveObligation
	 * @generated
	 */
	EClass getPositiveObligation();

	/**
	 * Returns the meta object for class '{@link edu.utd.cse.cerbac.cerbac.NegativeObligation <em>Negative Obligation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Negative Obligation</em>'.
	 * @see edu.utd.cse.cerbac.cerbac.NegativeObligation
	 * @generated
	 */
	EClass getNegativeObligation();

	/**
	 * Returns the meta object for class '{@link edu.utd.cse.cerbac.cerbac.PolicyContainer <em>Policy Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Policy Container</em>'.
	 * @see edu.utd.cse.cerbac.cerbac.PolicyContainer
	 * @generated
	 */
	EClass getPolicyContainer();

	/**
	 * Returns the meta object for the reference '{@link edu.utd.cse.cerbac.cerbac.PolicyContainer#getBase_Class <em>Base Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Class</em>'.
	 * @see edu.utd.cse.cerbac.cerbac.PolicyContainer#getBase_Class()
	 * @see #getPolicyContainer()
	 * @generated
	 */
	EReference getPolicyContainer_Base_Class();

	/**
	 * Returns the meta object for the reference '{@link edu.utd.cse.cerbac.cerbac.PolicyContainer#getBase_Package <em>Base Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Package</em>'.
	 * @see edu.utd.cse.cerbac.cerbac.PolicyContainer#getBase_Package()
	 * @see #getPolicyContainer()
	 * @generated
	 */
	EReference getPolicyContainer_Base_Package();

	/**
	 * Returns the meta object for class '{@link edu.utd.cse.cerbac.cerbac.CloudResource <em>Cloud Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cloud Resource</em>'.
	 * @see edu.utd.cse.cerbac.cerbac.CloudResource
	 * @generated
	 */
	EClass getCloudResource();

	/**
	 * Returns the meta object for the reference '{@link edu.utd.cse.cerbac.cerbac.CloudResource#getBase_Class <em>Base Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Class</em>'.
	 * @see edu.utd.cse.cerbac.cerbac.CloudResource#getBase_Class()
	 * @see #getCloudResource()
	 * @generated
	 */
	EReference getCloudResource_Base_Class();

	/**
	 * Returns the meta object for class '{@link edu.utd.cse.cerbac.cerbac.CloudService <em>Cloud Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cloud Service</em>'.
	 * @see edu.utd.cse.cerbac.cerbac.CloudService
	 * @generated
	 */
	EClass getCloudService();

	/**
	 * Returns the meta object for class '{@link edu.utd.cse.cerbac.cerbac.Hardware <em>Hardware</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hardware</em>'.
	 * @see edu.utd.cse.cerbac.cerbac.Hardware
	 * @generated
	 */
	EClass getHardware();

	/**
	 * Returns the meta object for class '{@link edu.utd.cse.cerbac.cerbac.Data <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data</em>'.
	 * @see edu.utd.cse.cerbac.cerbac.Data
	 * @generated
	 */
	EClass getData();

	/**
	 * Returns the meta object for class '{@link edu.utd.cse.cerbac.cerbac.ComputeService <em>Compute Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Compute Service</em>'.
	 * @see edu.utd.cse.cerbac.cerbac.ComputeService
	 * @generated
	 */
	EClass getComputeService();

	/**
	 * Returns the meta object for class '{@link edu.utd.cse.cerbac.cerbac.NetworkingService <em>Networking Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Networking Service</em>'.
	 * @see edu.utd.cse.cerbac.cerbac.NetworkingService
	 * @generated
	 */
	EClass getNetworkingService();

	/**
	 * Returns the meta object for class '{@link edu.utd.cse.cerbac.cerbac.StorageService <em>Storage Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Storage Service</em>'.
	 * @see edu.utd.cse.cerbac.cerbac.StorageService
	 * @generated
	 */
	EClass getStorageService();

	/**
	 * Returns the meta object for class '{@link edu.utd.cse.cerbac.cerbac.Storage <em>Storage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Storage</em>'.
	 * @see edu.utd.cse.cerbac.cerbac.Storage
	 * @generated
	 */
	EClass getStorage();

	/**
	 * Returns the meta object for class '{@link edu.utd.cse.cerbac.cerbac.ActionLink <em>Action Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action Link</em>'.
	 * @see edu.utd.cse.cerbac.cerbac.ActionLink
	 * @generated
	 */
	EClass getActionLink();

	/**
	 * Returns the meta object for the reference '{@link edu.utd.cse.cerbac.cerbac.ActionLink#getBase_Association <em>Base Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Association</em>'.
	 * @see edu.utd.cse.cerbac.cerbac.ActionLink#getBase_Association()
	 * @see #getActionLink()
	 * @generated
	 */
	EReference getActionLink_Base_Association();

	/**
	 * Returns the meta object for class '{@link edu.utd.cse.cerbac.cerbac.HowLink <em>How Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>How Link</em>'.
	 * @see edu.utd.cse.cerbac.cerbac.HowLink
	 * @generated
	 */
	EClass getHowLink();

	/**
	 * Returns the meta object for the reference '{@link edu.utd.cse.cerbac.cerbac.HowLink#getBase_Association <em>Base Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Association</em>'.
	 * @see edu.utd.cse.cerbac.cerbac.HowLink#getBase_Association()
	 * @see #getHowLink()
	 * @generated
	 */
	EReference getHowLink_Base_Association();

	/**
	 * Returns the meta object for class '{@link edu.utd.cse.cerbac.cerbac.WhatLink <em>What Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>What Link</em>'.
	 * @see edu.utd.cse.cerbac.cerbac.WhatLink
	 * @generated
	 */
	EClass getWhatLink();

	/**
	 * Returns the meta object for the reference '{@link edu.utd.cse.cerbac.cerbac.WhatLink#getBase_Association <em>Base Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Association</em>'.
	 * @see edu.utd.cse.cerbac.cerbac.WhatLink#getBase_Association()
	 * @see #getWhatLink()
	 * @generated
	 */
	EReference getWhatLink_Base_Association();

	/**
	 * Returns the meta object for class '{@link edu.utd.cse.cerbac.cerbac.WhereLink <em>Where Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Where Link</em>'.
	 * @see edu.utd.cse.cerbac.cerbac.WhereLink
	 * @generated
	 */
	EClass getWhereLink();

	/**
	 * Returns the meta object for the reference '{@link edu.utd.cse.cerbac.cerbac.WhereLink#getBase_Association <em>Base Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Association</em>'.
	 * @see edu.utd.cse.cerbac.cerbac.WhereLink#getBase_Association()
	 * @see #getWhereLink()
	 * @generated
	 */
	EReference getWhereLink_Base_Association();

	/**
	 * Returns the meta object for class '{@link edu.utd.cse.cerbac.cerbac.WhoLink <em>Who Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Who Link</em>'.
	 * @see edu.utd.cse.cerbac.cerbac.WhoLink
	 * @generated
	 */
	EClass getWhoLink();

	/**
	 * Returns the meta object for the reference '{@link edu.utd.cse.cerbac.cerbac.WhoLink#getBase_Association <em>Base Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Association</em>'.
	 * @see edu.utd.cse.cerbac.cerbac.WhoLink#getBase_Association()
	 * @see #getWhoLink()
	 * @generated
	 */
	EReference getWhoLink_Base_Association();

	/**
	 * Returns the meta object for class '{@link edu.utd.cse.cerbac.cerbac.WhenLink <em>When Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>When Link</em>'.
	 * @see edu.utd.cse.cerbac.cerbac.WhenLink
	 * @generated
	 */
	EClass getWhenLink();

	/**
	 * Returns the meta object for the reference '{@link edu.utd.cse.cerbac.cerbac.WhenLink#getBase_Association <em>Base Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Association</em>'.
	 * @see edu.utd.cse.cerbac.cerbac.WhenLink#getBase_Association()
	 * @see #getWhenLink()
	 * @generated
	 */
	EReference getWhenLink_Base_Association();

	/**
	 * Returns the meta object for class '{@link edu.utd.cse.cerbac.cerbac.WhyLink <em>Why Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Why Link</em>'.
	 * @see edu.utd.cse.cerbac.cerbac.WhyLink
	 * @generated
	 */
	EClass getWhyLink();

	/**
	 * Returns the meta object for the reference '{@link edu.utd.cse.cerbac.cerbac.WhyLink#getBase_Association <em>Base Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Association</em>'.
	 * @see edu.utd.cse.cerbac.cerbac.WhyLink#getBase_Association()
	 * @see #getWhyLink()
	 * @generated
	 */
	EReference getWhyLink_Base_Association();

	/**
	 * Returns the meta object for class '{@link edu.utd.cse.cerbac.cerbac.PolicyAttributeExtend <em>Policy Attribute Extend</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Policy Attribute Extend</em>'.
	 * @see edu.utd.cse.cerbac.cerbac.PolicyAttributeExtend
	 * @generated
	 */
	EClass getPolicyAttributeExtend();

	/**
	 * Returns the meta object for the reference '{@link edu.utd.cse.cerbac.cerbac.PolicyAttributeExtend#getBase_Extension <em>Base Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Extension</em>'.
	 * @see edu.utd.cse.cerbac.cerbac.PolicyAttributeExtend#getBase_Extension()
	 * @see #getPolicyAttributeExtend()
	 * @generated
	 */
	EReference getPolicyAttributeExtend_Base_Extension();

	/**
	 * Returns the meta object for the reference '{@link edu.utd.cse.cerbac.cerbac.PolicyAttributeExtend#getBase_Generalization <em>Base Generalization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Generalization</em>'.
	 * @see edu.utd.cse.cerbac.cerbac.PolicyAttributeExtend#getBase_Generalization()
	 * @see #getPolicyAttributeExtend()
	 * @generated
	 */
	EReference getPolicyAttributeExtend_Base_Generalization();

	/**
	 * Returns the meta object for class '{@link edu.utd.cse.cerbac.cerbac.PolicyAttributeLink <em>Policy Attribute Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Policy Attribute Link</em>'.
	 * @see edu.utd.cse.cerbac.cerbac.PolicyAttributeLink
	 * @generated
	 */
	EClass getPolicyAttributeLink();

	/**
	 * Returns the meta object for the reference '{@link edu.utd.cse.cerbac.cerbac.PolicyAttributeLink#getBase_Association <em>Base Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Association</em>'.
	 * @see edu.utd.cse.cerbac.cerbac.PolicyAttributeLink#getBase_Association()
	 * @see #getPolicyAttributeLink()
	 * @generated
	 */
	EReference getPolicyAttributeLink_Base_Association();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CerbacFactory getCerbacFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link edu.utd.cse.cerbac.cerbac.impl.CloudSecurityAndPrivacyPolicyImpl <em>Cloud Security And Privacy Policy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.utd.cse.cerbac.cerbac.impl.CloudSecurityAndPrivacyPolicyImpl
		 * @see edu.utd.cse.cerbac.cerbac.impl.CerbacPackageImpl#getCloudSecurityAndPrivacyPolicy()
		 * @generated
		 */
		EClass CLOUD_SECURITY_AND_PRIVACY_POLICY = eINSTANCE.getCloudSecurityAndPrivacyPolicy();

		/**
		 * The meta object literal for the '<em><b>Base Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLOUD_SECURITY_AND_PRIVACY_POLICY__BASE_CLASS = eINSTANCE.getCloudSecurityAndPrivacyPolicy_Base_Class();

		/**
		 * The meta object literal for the '{@link edu.utd.cse.cerbac.cerbac.impl.CerbacPolicyImpl <em>Policy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.utd.cse.cerbac.cerbac.impl.CerbacPolicyImpl
		 * @see edu.utd.cse.cerbac.cerbac.impl.CerbacPackageImpl#getCerbacPolicy()
		 * @generated
		 */
		EClass CERBAC_POLICY = eINSTANCE.getCerbacPolicy();

		/**
		 * The meta object literal for the '<em><b>Action</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CERBAC_POLICY__ACTION = eINSTANCE.getCerbacPolicy_Action();

		/**
		 * The meta object literal for the '<em><b>Who</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CERBAC_POLICY__WHO = eINSTANCE.getCerbacPolicy_Who();

		/**
		 * The meta object literal for the '<em><b>Where</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CERBAC_POLICY__WHERE = eINSTANCE.getCerbacPolicy_Where();

		/**
		 * The meta object literal for the '<em><b>Why</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CERBAC_POLICY__WHY = eINSTANCE.getCerbacPolicy_Why();

		/**
		 * The meta object literal for the '<em><b>How</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CERBAC_POLICY__HOW = eINSTANCE.getCerbacPolicy_How();

		/**
		 * The meta object literal for the '<em><b>When</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CERBAC_POLICY__WHEN = eINSTANCE.getCerbacPolicy_When();

		/**
		 * The meta object literal for the '<em><b>What</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CERBAC_POLICY__WHAT = eINSTANCE.getCerbacPolicy_What();

		/**
		 * The meta object literal for the '{@link edu.utd.cse.cerbac.cerbac.impl.ActionImpl <em>Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.utd.cse.cerbac.cerbac.impl.ActionImpl
		 * @see edu.utd.cse.cerbac.cerbac.impl.CerbacPackageImpl#getAction()
		 * @generated
		 */
		EClass ACTION = eINSTANCE.getAction();

		/**
		 * The meta object literal for the '<em><b>Base Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION__BASE_CLASS = eINSTANCE.getAction_Base_Class();

		/**
		 * The meta object literal for the '{@link edu.utd.cse.cerbac.cerbac.impl.WhoImpl <em>Who</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.utd.cse.cerbac.cerbac.impl.WhoImpl
		 * @see edu.utd.cse.cerbac.cerbac.impl.CerbacPackageImpl#getWho()
		 * @generated
		 */
		EClass WHO = eINSTANCE.getWho();

		/**
		 * The meta object literal for the '{@link edu.utd.cse.cerbac.cerbac.impl.PolicyAttributesImpl <em>Policy Attributes</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.utd.cse.cerbac.cerbac.impl.PolicyAttributesImpl
		 * @see edu.utd.cse.cerbac.cerbac.impl.CerbacPackageImpl#getPolicyAttributes()
		 * @generated
		 */
		EClass POLICY_ATTRIBUTES = eINSTANCE.getPolicyAttributes();

		/**
		 * The meta object literal for the '<em><b>Base Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POLICY_ATTRIBUTES__BASE_CLASS = eINSTANCE.getPolicyAttributes_Base_Class();

		/**
		 * The meta object literal for the '{@link edu.utd.cse.cerbac.cerbac.impl.WhereImpl <em>Where</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.utd.cse.cerbac.cerbac.impl.WhereImpl
		 * @see edu.utd.cse.cerbac.cerbac.impl.CerbacPackageImpl#getWhere()
		 * @generated
		 */
		EClass WHERE = eINSTANCE.getWhere();

		/**
		 * The meta object literal for the '{@link edu.utd.cse.cerbac.cerbac.impl.WhyImpl <em>Why</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.utd.cse.cerbac.cerbac.impl.WhyImpl
		 * @see edu.utd.cse.cerbac.cerbac.impl.CerbacPackageImpl#getWhy()
		 * @generated
		 */
		EClass WHY = eINSTANCE.getWhy();

		/**
		 * The meta object literal for the '{@link edu.utd.cse.cerbac.cerbac.impl.HowImpl <em>How</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.utd.cse.cerbac.cerbac.impl.HowImpl
		 * @see edu.utd.cse.cerbac.cerbac.impl.CerbacPackageImpl#getHow()
		 * @generated
		 */
		EClass HOW = eINSTANCE.getHow();

		/**
		 * The meta object literal for the '{@link edu.utd.cse.cerbac.cerbac.impl.WhenImpl <em>When</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.utd.cse.cerbac.cerbac.impl.WhenImpl
		 * @see edu.utd.cse.cerbac.cerbac.impl.CerbacPackageImpl#getWhen()
		 * @generated
		 */
		EClass WHEN = eINSTANCE.getWhen();

		/**
		 * The meta object literal for the '{@link edu.utd.cse.cerbac.cerbac.impl.WhatImpl <em>What</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.utd.cse.cerbac.cerbac.impl.WhatImpl
		 * @see edu.utd.cse.cerbac.cerbac.impl.CerbacPackageImpl#getWhat()
		 * @generated
		 */
		EClass WHAT = eINSTANCE.getWhat();

		/**
		 * The meta object literal for the '{@link edu.utd.cse.cerbac.cerbac.impl.AuthorizationPolicyImpl <em>Authorization Policy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.utd.cse.cerbac.cerbac.impl.AuthorizationPolicyImpl
		 * @see edu.utd.cse.cerbac.cerbac.impl.CerbacPackageImpl#getAuthorizationPolicy()
		 * @generated
		 */
		EClass AUTHORIZATION_POLICY = eINSTANCE.getAuthorizationPolicy();

		/**
		 * The meta object literal for the '{@link edu.utd.cse.cerbac.cerbac.impl.ObligationPolicyImpl <em>Obligation Policy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.utd.cse.cerbac.cerbac.impl.ObligationPolicyImpl
		 * @see edu.utd.cse.cerbac.cerbac.impl.CerbacPackageImpl#getObligationPolicy()
		 * @generated
		 */
		EClass OBLIGATION_POLICY = eINSTANCE.getObligationPolicy();

		/**
		 * The meta object literal for the '{@link edu.utd.cse.cerbac.cerbac.impl.PositiveAuthorizationImpl <em>Positive Authorization</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.utd.cse.cerbac.cerbac.impl.PositiveAuthorizationImpl
		 * @see edu.utd.cse.cerbac.cerbac.impl.CerbacPackageImpl#getPositiveAuthorization()
		 * @generated
		 */
		EClass POSITIVE_AUTHORIZATION = eINSTANCE.getPositiveAuthorization();

		/**
		 * The meta object literal for the '{@link edu.utd.cse.cerbac.cerbac.impl.NegativeAuthorizationImpl <em>Negative Authorization</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.utd.cse.cerbac.cerbac.impl.NegativeAuthorizationImpl
		 * @see edu.utd.cse.cerbac.cerbac.impl.CerbacPackageImpl#getNegativeAuthorization()
		 * @generated
		 */
		EClass NEGATIVE_AUTHORIZATION = eINSTANCE.getNegativeAuthorization();

		/**
		 * The meta object literal for the '{@link edu.utd.cse.cerbac.cerbac.impl.PositiveObligationImpl <em>Positive Obligation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.utd.cse.cerbac.cerbac.impl.PositiveObligationImpl
		 * @see edu.utd.cse.cerbac.cerbac.impl.CerbacPackageImpl#getPositiveObligation()
		 * @generated
		 */
		EClass POSITIVE_OBLIGATION = eINSTANCE.getPositiveObligation();

		/**
		 * The meta object literal for the '{@link edu.utd.cse.cerbac.cerbac.impl.NegativeObligationImpl <em>Negative Obligation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.utd.cse.cerbac.cerbac.impl.NegativeObligationImpl
		 * @see edu.utd.cse.cerbac.cerbac.impl.CerbacPackageImpl#getNegativeObligation()
		 * @generated
		 */
		EClass NEGATIVE_OBLIGATION = eINSTANCE.getNegativeObligation();

		/**
		 * The meta object literal for the '{@link edu.utd.cse.cerbac.cerbac.impl.PolicyContainerImpl <em>Policy Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.utd.cse.cerbac.cerbac.impl.PolicyContainerImpl
		 * @see edu.utd.cse.cerbac.cerbac.impl.CerbacPackageImpl#getPolicyContainer()
		 * @generated
		 */
		EClass POLICY_CONTAINER = eINSTANCE.getPolicyContainer();

		/**
		 * The meta object literal for the '<em><b>Base Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POLICY_CONTAINER__BASE_CLASS = eINSTANCE.getPolicyContainer_Base_Class();

		/**
		 * The meta object literal for the '<em><b>Base Package</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POLICY_CONTAINER__BASE_PACKAGE = eINSTANCE.getPolicyContainer_Base_Package();

		/**
		 * The meta object literal for the '{@link edu.utd.cse.cerbac.cerbac.impl.CloudResourceImpl <em>Cloud Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.utd.cse.cerbac.cerbac.impl.CloudResourceImpl
		 * @see edu.utd.cse.cerbac.cerbac.impl.CerbacPackageImpl#getCloudResource()
		 * @generated
		 */
		EClass CLOUD_RESOURCE = eINSTANCE.getCloudResource();

		/**
		 * The meta object literal for the '<em><b>Base Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLOUD_RESOURCE__BASE_CLASS = eINSTANCE.getCloudResource_Base_Class();

		/**
		 * The meta object literal for the '{@link edu.utd.cse.cerbac.cerbac.impl.CloudServiceImpl <em>Cloud Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.utd.cse.cerbac.cerbac.impl.CloudServiceImpl
		 * @see edu.utd.cse.cerbac.cerbac.impl.CerbacPackageImpl#getCloudService()
		 * @generated
		 */
		EClass CLOUD_SERVICE = eINSTANCE.getCloudService();

		/**
		 * The meta object literal for the '{@link edu.utd.cse.cerbac.cerbac.impl.HardwareImpl <em>Hardware</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.utd.cse.cerbac.cerbac.impl.HardwareImpl
		 * @see edu.utd.cse.cerbac.cerbac.impl.CerbacPackageImpl#getHardware()
		 * @generated
		 */
		EClass HARDWARE = eINSTANCE.getHardware();

		/**
		 * The meta object literal for the '{@link edu.utd.cse.cerbac.cerbac.impl.DataImpl <em>Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.utd.cse.cerbac.cerbac.impl.DataImpl
		 * @see edu.utd.cse.cerbac.cerbac.impl.CerbacPackageImpl#getData()
		 * @generated
		 */
		EClass DATA = eINSTANCE.getData();

		/**
		 * The meta object literal for the '{@link edu.utd.cse.cerbac.cerbac.impl.ComputeServiceImpl <em>Compute Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.utd.cse.cerbac.cerbac.impl.ComputeServiceImpl
		 * @see edu.utd.cse.cerbac.cerbac.impl.CerbacPackageImpl#getComputeService()
		 * @generated
		 */
		EClass COMPUTE_SERVICE = eINSTANCE.getComputeService();

		/**
		 * The meta object literal for the '{@link edu.utd.cse.cerbac.cerbac.impl.NetworkingServiceImpl <em>Networking Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.utd.cse.cerbac.cerbac.impl.NetworkingServiceImpl
		 * @see edu.utd.cse.cerbac.cerbac.impl.CerbacPackageImpl#getNetworkingService()
		 * @generated
		 */
		EClass NETWORKING_SERVICE = eINSTANCE.getNetworkingService();

		/**
		 * The meta object literal for the '{@link edu.utd.cse.cerbac.cerbac.impl.StorageServiceImpl <em>Storage Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.utd.cse.cerbac.cerbac.impl.StorageServiceImpl
		 * @see edu.utd.cse.cerbac.cerbac.impl.CerbacPackageImpl#getStorageService()
		 * @generated
		 */
		EClass STORAGE_SERVICE = eINSTANCE.getStorageService();

		/**
		 * The meta object literal for the '{@link edu.utd.cse.cerbac.cerbac.impl.StorageImpl <em>Storage</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.utd.cse.cerbac.cerbac.impl.StorageImpl
		 * @see edu.utd.cse.cerbac.cerbac.impl.CerbacPackageImpl#getStorage()
		 * @generated
		 */
		EClass STORAGE = eINSTANCE.getStorage();

		/**
		 * The meta object literal for the '{@link edu.utd.cse.cerbac.cerbac.impl.ActionLinkImpl <em>Action Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.utd.cse.cerbac.cerbac.impl.ActionLinkImpl
		 * @see edu.utd.cse.cerbac.cerbac.impl.CerbacPackageImpl#getActionLink()
		 * @generated
		 */
		EClass ACTION_LINK = eINSTANCE.getActionLink();

		/**
		 * The meta object literal for the '<em><b>Base Association</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION_LINK__BASE_ASSOCIATION = eINSTANCE.getActionLink_Base_Association();

		/**
		 * The meta object literal for the '{@link edu.utd.cse.cerbac.cerbac.impl.HowLinkImpl <em>How Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.utd.cse.cerbac.cerbac.impl.HowLinkImpl
		 * @see edu.utd.cse.cerbac.cerbac.impl.CerbacPackageImpl#getHowLink()
		 * @generated
		 */
		EClass HOW_LINK = eINSTANCE.getHowLink();

		/**
		 * The meta object literal for the '<em><b>Base Association</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HOW_LINK__BASE_ASSOCIATION = eINSTANCE.getHowLink_Base_Association();

		/**
		 * The meta object literal for the '{@link edu.utd.cse.cerbac.cerbac.impl.WhatLinkImpl <em>What Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.utd.cse.cerbac.cerbac.impl.WhatLinkImpl
		 * @see edu.utd.cse.cerbac.cerbac.impl.CerbacPackageImpl#getWhatLink()
		 * @generated
		 */
		EClass WHAT_LINK = eINSTANCE.getWhatLink();

		/**
		 * The meta object literal for the '<em><b>Base Association</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WHAT_LINK__BASE_ASSOCIATION = eINSTANCE.getWhatLink_Base_Association();

		/**
		 * The meta object literal for the '{@link edu.utd.cse.cerbac.cerbac.impl.WhereLinkImpl <em>Where Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.utd.cse.cerbac.cerbac.impl.WhereLinkImpl
		 * @see edu.utd.cse.cerbac.cerbac.impl.CerbacPackageImpl#getWhereLink()
		 * @generated
		 */
		EClass WHERE_LINK = eINSTANCE.getWhereLink();

		/**
		 * The meta object literal for the '<em><b>Base Association</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WHERE_LINK__BASE_ASSOCIATION = eINSTANCE.getWhereLink_Base_Association();

		/**
		 * The meta object literal for the '{@link edu.utd.cse.cerbac.cerbac.impl.WhoLinkImpl <em>Who Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.utd.cse.cerbac.cerbac.impl.WhoLinkImpl
		 * @see edu.utd.cse.cerbac.cerbac.impl.CerbacPackageImpl#getWhoLink()
		 * @generated
		 */
		EClass WHO_LINK = eINSTANCE.getWhoLink();

		/**
		 * The meta object literal for the '<em><b>Base Association</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WHO_LINK__BASE_ASSOCIATION = eINSTANCE.getWhoLink_Base_Association();

		/**
		 * The meta object literal for the '{@link edu.utd.cse.cerbac.cerbac.impl.WhenLinkImpl <em>When Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.utd.cse.cerbac.cerbac.impl.WhenLinkImpl
		 * @see edu.utd.cse.cerbac.cerbac.impl.CerbacPackageImpl#getWhenLink()
		 * @generated
		 */
		EClass WHEN_LINK = eINSTANCE.getWhenLink();

		/**
		 * The meta object literal for the '<em><b>Base Association</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WHEN_LINK__BASE_ASSOCIATION = eINSTANCE.getWhenLink_Base_Association();

		/**
		 * The meta object literal for the '{@link edu.utd.cse.cerbac.cerbac.impl.WhyLinkImpl <em>Why Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.utd.cse.cerbac.cerbac.impl.WhyLinkImpl
		 * @see edu.utd.cse.cerbac.cerbac.impl.CerbacPackageImpl#getWhyLink()
		 * @generated
		 */
		EClass WHY_LINK = eINSTANCE.getWhyLink();

		/**
		 * The meta object literal for the '<em><b>Base Association</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WHY_LINK__BASE_ASSOCIATION = eINSTANCE.getWhyLink_Base_Association();

		/**
		 * The meta object literal for the '{@link edu.utd.cse.cerbac.cerbac.impl.PolicyAttributeExtendImpl <em>Policy Attribute Extend</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.utd.cse.cerbac.cerbac.impl.PolicyAttributeExtendImpl
		 * @see edu.utd.cse.cerbac.cerbac.impl.CerbacPackageImpl#getPolicyAttributeExtend()
		 * @generated
		 */
		EClass POLICY_ATTRIBUTE_EXTEND = eINSTANCE.getPolicyAttributeExtend();

		/**
		 * The meta object literal for the '<em><b>Base Extension</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POLICY_ATTRIBUTE_EXTEND__BASE_EXTENSION = eINSTANCE.getPolicyAttributeExtend_Base_Extension();

		/**
		 * The meta object literal for the '<em><b>Base Generalization</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POLICY_ATTRIBUTE_EXTEND__BASE_GENERALIZATION = eINSTANCE.getPolicyAttributeExtend_Base_Generalization();

		/**
		 * The meta object literal for the '{@link edu.utd.cse.cerbac.cerbac.impl.PolicyAttributeLinkImpl <em>Policy Attribute Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.utd.cse.cerbac.cerbac.impl.PolicyAttributeLinkImpl
		 * @see edu.utd.cse.cerbac.cerbac.impl.CerbacPackageImpl#getPolicyAttributeLink()
		 * @generated
		 */
		EClass POLICY_ATTRIBUTE_LINK = eINSTANCE.getPolicyAttributeLink();

		/**
		 * The meta object literal for the '<em><b>Base Association</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POLICY_ATTRIBUTE_LINK__BASE_ASSOCIATION = eINSTANCE.getPolicyAttributeLink_Base_Association();

	}

} //CerbacPackage
