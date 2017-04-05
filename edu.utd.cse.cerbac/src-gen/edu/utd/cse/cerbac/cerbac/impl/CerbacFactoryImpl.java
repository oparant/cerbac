/**
 */
package edu.utd.cse.cerbac.cerbac.impl;

import edu.utd.cse.cerbac.cerbac.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CerbacFactoryImpl extends EFactoryImpl implements CerbacFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CerbacFactory init() {
		try {
			CerbacFactory theCerbacFactory = (CerbacFactory)EPackage.Registry.INSTANCE.getEFactory(CerbacPackage.eNS_URI);
			if (theCerbacFactory != null) {
				return theCerbacFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CerbacFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CerbacFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case CerbacPackage.ACTION: return createAction();
			case CerbacPackage.WHO: return createWho();
			case CerbacPackage.WHERE: return createWhere();
			case CerbacPackage.WHY: return createWhy();
			case CerbacPackage.HOW: return createHow();
			case CerbacPackage.WHEN: return createWhen();
			case CerbacPackage.WHAT: return createWhat();
			case CerbacPackage.POSITIVE_AUTHORIZATION: return createPositiveAuthorization();
			case CerbacPackage.NEGATIVE_AUTHORIZATION: return createNegativeAuthorization();
			case CerbacPackage.POSITIVE_OBLIGATION: return createPositiveObligation();
			case CerbacPackage.NEGATIVE_OBLIGATION: return createNegativeObligation();
			case CerbacPackage.POLICY_CONTAINER: return createPolicyContainer();
			case CerbacPackage.HARDWARE: return createHardware();
			case CerbacPackage.DATA: return createData();
			case CerbacPackage.COMPUTE_SERVICE: return createComputeService();
			case CerbacPackage.NETWORKING_SERVICE: return createNetworkingService();
			case CerbacPackage.STORAGE_SERVICE: return createStorageService();
			case CerbacPackage.STORAGE: return createStorage();
			case CerbacPackage.ACTION_LINK: return createActionLink();
			case CerbacPackage.HOW_LINK: return createHowLink();
			case CerbacPackage.WHAT_LINK: return createWhatLink();
			case CerbacPackage.WHERE_LINK: return createWhereLink();
			case CerbacPackage.WHO_LINK: return createWhoLink();
			case CerbacPackage.WHEN_LINK: return createWhenLink();
			case CerbacPackage.WHY_LINK: return createWhyLink();
			case CerbacPackage.POLICY_ATTRIBUTE_EXTEND: return createPolicyAttributeExtend();
			case CerbacPackage.POLICY_ATTRIBUTE_LINK: return createPolicyAttributeLink();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Action createAction() {
		ActionImpl action = new ActionImpl();
		return action;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Who createWho() {
		WhoImpl who = new WhoImpl();
		return who;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Where createWhere() {
		WhereImpl where = new WhereImpl();
		return where;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Why createWhy() {
		WhyImpl why = new WhyImpl();
		return why;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public How createHow() {
		HowImpl how = new HowImpl();
		return how;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public When createWhen() {
		WhenImpl when = new WhenImpl();
		return when;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public What createWhat() {
		WhatImpl what = new WhatImpl();
		return what;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PositiveAuthorization createPositiveAuthorization() {
		PositiveAuthorizationImpl positiveAuthorization = new PositiveAuthorizationImpl();
		return positiveAuthorization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NegativeAuthorization createNegativeAuthorization() {
		NegativeAuthorizationImpl negativeAuthorization = new NegativeAuthorizationImpl();
		return negativeAuthorization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PositiveObligation createPositiveObligation() {
		PositiveObligationImpl positiveObligation = new PositiveObligationImpl();
		return positiveObligation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NegativeObligation createNegativeObligation() {
		NegativeObligationImpl negativeObligation = new NegativeObligationImpl();
		return negativeObligation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PolicyContainer createPolicyContainer() {
		PolicyContainerImpl policyContainer = new PolicyContainerImpl();
		return policyContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Hardware createHardware() {
		HardwareImpl hardware = new HardwareImpl();
		return hardware;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Data createData() {
		DataImpl data = new DataImpl();
		return data;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComputeService createComputeService() {
		ComputeServiceImpl computeService = new ComputeServiceImpl();
		return computeService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NetworkingService createNetworkingService() {
		NetworkingServiceImpl networkingService = new NetworkingServiceImpl();
		return networkingService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StorageService createStorageService() {
		StorageServiceImpl storageService = new StorageServiceImpl();
		return storageService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Storage createStorage() {
		StorageImpl storage = new StorageImpl();
		return storage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionLink createActionLink() {
		ActionLinkImpl actionLink = new ActionLinkImpl();
		return actionLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HowLink createHowLink() {
		HowLinkImpl howLink = new HowLinkImpl();
		return howLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WhatLink createWhatLink() {
		WhatLinkImpl whatLink = new WhatLinkImpl();
		return whatLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WhereLink createWhereLink() {
		WhereLinkImpl whereLink = new WhereLinkImpl();
		return whereLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WhoLink createWhoLink() {
		WhoLinkImpl whoLink = new WhoLinkImpl();
		return whoLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WhenLink createWhenLink() {
		WhenLinkImpl whenLink = new WhenLinkImpl();
		return whenLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WhyLink createWhyLink() {
		WhyLinkImpl whyLink = new WhyLinkImpl();
		return whyLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PolicyAttributeExtend createPolicyAttributeExtend() {
		PolicyAttributeExtendImpl policyAttributeExtend = new PolicyAttributeExtendImpl();
		return policyAttributeExtend;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PolicyAttributeLink createPolicyAttributeLink() {
		PolicyAttributeLinkImpl policyAttributeLink = new PolicyAttributeLinkImpl();
		return policyAttributeLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CerbacPackage getCerbacPackage() {
		return (CerbacPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CerbacPackage getPackage() {
		return CerbacPackage.eINSTANCE;
	}

} //CerbacFactoryImpl
