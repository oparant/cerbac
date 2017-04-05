/**
 */
package edu.utd.cse.cerbac.cerbac.util;

import edu.utd.cse.cerbac.cerbac.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see edu.utd.cse.cerbac.cerbac.CerbacPackage
 * @generated
 */
public class CerbacAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CerbacPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CerbacAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = CerbacPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CerbacSwitch<Adapter> modelSwitch =
		new CerbacSwitch<Adapter>() {
			@Override
			public Adapter caseCloudSecurityAndPrivacyPolicy(CloudSecurityAndPrivacyPolicy object) {
				return createCloudSecurityAndPrivacyPolicyAdapter();
			}
			@Override
			public Adapter caseCerbacPolicy(CerbacPolicy object) {
				return createCerbacPolicyAdapter();
			}
			@Override
			public Adapter caseAction(Action object) {
				return createActionAdapter();
			}
			@Override
			public Adapter caseWho(Who object) {
				return createWhoAdapter();
			}
			@Override
			public Adapter casePolicyAttributes(PolicyAttributes object) {
				return createPolicyAttributesAdapter();
			}
			@Override
			public Adapter caseWhere(Where object) {
				return createWhereAdapter();
			}
			@Override
			public Adapter caseWhy(Why object) {
				return createWhyAdapter();
			}
			@Override
			public Adapter caseHow(How object) {
				return createHowAdapter();
			}
			@Override
			public Adapter caseWhen(When object) {
				return createWhenAdapter();
			}
			@Override
			public Adapter caseWhat(What object) {
				return createWhatAdapter();
			}
			@Override
			public Adapter caseAuthorizationPolicy(AuthorizationPolicy object) {
				return createAuthorizationPolicyAdapter();
			}
			@Override
			public Adapter caseObligationPolicy(ObligationPolicy object) {
				return createObligationPolicyAdapter();
			}
			@Override
			public Adapter casePositiveAuthorization(PositiveAuthorization object) {
				return createPositiveAuthorizationAdapter();
			}
			@Override
			public Adapter caseNegativeAuthorization(NegativeAuthorization object) {
				return createNegativeAuthorizationAdapter();
			}
			@Override
			public Adapter casePositiveObligation(PositiveObligation object) {
				return createPositiveObligationAdapter();
			}
			@Override
			public Adapter caseNegativeObligation(NegativeObligation object) {
				return createNegativeObligationAdapter();
			}
			@Override
			public Adapter casePolicyContainer(PolicyContainer object) {
				return createPolicyContainerAdapter();
			}
			@Override
			public Adapter caseCloudResource(CloudResource object) {
				return createCloudResourceAdapter();
			}
			@Override
			public Adapter caseCloudService(CloudService object) {
				return createCloudServiceAdapter();
			}
			@Override
			public Adapter caseHardware(Hardware object) {
				return createHardwareAdapter();
			}
			@Override
			public Adapter caseData(Data object) {
				return createDataAdapter();
			}
			@Override
			public Adapter caseComputeService(ComputeService object) {
				return createComputeServiceAdapter();
			}
			@Override
			public Adapter caseNetworkingService(NetworkingService object) {
				return createNetworkingServiceAdapter();
			}
			@Override
			public Adapter caseStorageService(StorageService object) {
				return createStorageServiceAdapter();
			}
			@Override
			public Adapter caseStorage(Storage object) {
				return createStorageAdapter();
			}
			@Override
			public Adapter caseActionLink(ActionLink object) {
				return createActionLinkAdapter();
			}
			@Override
			public Adapter caseHowLink(HowLink object) {
				return createHowLinkAdapter();
			}
			@Override
			public Adapter caseWhatLink(WhatLink object) {
				return createWhatLinkAdapter();
			}
			@Override
			public Adapter caseWhereLink(WhereLink object) {
				return createWhereLinkAdapter();
			}
			@Override
			public Adapter caseWhoLink(WhoLink object) {
				return createWhoLinkAdapter();
			}
			@Override
			public Adapter caseWhenLink(WhenLink object) {
				return createWhenLinkAdapter();
			}
			@Override
			public Adapter caseWhyLink(WhyLink object) {
				return createWhyLinkAdapter();
			}
			@Override
			public Adapter casePolicyAttributeExtend(PolicyAttributeExtend object) {
				return createPolicyAttributeExtendAdapter();
			}
			@Override
			public Adapter casePolicyAttributeLink(PolicyAttributeLink object) {
				return createPolicyAttributeLinkAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link edu.utd.cse.cerbac.cerbac.CloudSecurityAndPrivacyPolicy <em>Cloud Security And Privacy Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.utd.cse.cerbac.cerbac.CloudSecurityAndPrivacyPolicy
	 * @generated
	 */
	public Adapter createCloudSecurityAndPrivacyPolicyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.utd.cse.cerbac.cerbac.CerbacPolicy <em>Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.utd.cse.cerbac.cerbac.CerbacPolicy
	 * @generated
	 */
	public Adapter createCerbacPolicyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.utd.cse.cerbac.cerbac.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.utd.cse.cerbac.cerbac.Action
	 * @generated
	 */
	public Adapter createActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.utd.cse.cerbac.cerbac.Who <em>Who</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.utd.cse.cerbac.cerbac.Who
	 * @generated
	 */
	public Adapter createWhoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.utd.cse.cerbac.cerbac.PolicyAttributes <em>Policy Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.utd.cse.cerbac.cerbac.PolicyAttributes
	 * @generated
	 */
	public Adapter createPolicyAttributesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.utd.cse.cerbac.cerbac.Where <em>Where</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.utd.cse.cerbac.cerbac.Where
	 * @generated
	 */
	public Adapter createWhereAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.utd.cse.cerbac.cerbac.Why <em>Why</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.utd.cse.cerbac.cerbac.Why
	 * @generated
	 */
	public Adapter createWhyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.utd.cse.cerbac.cerbac.How <em>How</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.utd.cse.cerbac.cerbac.How
	 * @generated
	 */
	public Adapter createHowAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.utd.cse.cerbac.cerbac.When <em>When</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.utd.cse.cerbac.cerbac.When
	 * @generated
	 */
	public Adapter createWhenAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.utd.cse.cerbac.cerbac.What <em>What</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.utd.cse.cerbac.cerbac.What
	 * @generated
	 */
	public Adapter createWhatAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.utd.cse.cerbac.cerbac.AuthorizationPolicy <em>Authorization Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.utd.cse.cerbac.cerbac.AuthorizationPolicy
	 * @generated
	 */
	public Adapter createAuthorizationPolicyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.utd.cse.cerbac.cerbac.ObligationPolicy <em>Obligation Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.utd.cse.cerbac.cerbac.ObligationPolicy
	 * @generated
	 */
	public Adapter createObligationPolicyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.utd.cse.cerbac.cerbac.PositiveAuthorization <em>Positive Authorization</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.utd.cse.cerbac.cerbac.PositiveAuthorization
	 * @generated
	 */
	public Adapter createPositiveAuthorizationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.utd.cse.cerbac.cerbac.NegativeAuthorization <em>Negative Authorization</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.utd.cse.cerbac.cerbac.NegativeAuthorization
	 * @generated
	 */
	public Adapter createNegativeAuthorizationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.utd.cse.cerbac.cerbac.PositiveObligation <em>Positive Obligation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.utd.cse.cerbac.cerbac.PositiveObligation
	 * @generated
	 */
	public Adapter createPositiveObligationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.utd.cse.cerbac.cerbac.NegativeObligation <em>Negative Obligation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.utd.cse.cerbac.cerbac.NegativeObligation
	 * @generated
	 */
	public Adapter createNegativeObligationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.utd.cse.cerbac.cerbac.PolicyContainer <em>Policy Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.utd.cse.cerbac.cerbac.PolicyContainer
	 * @generated
	 */
	public Adapter createPolicyContainerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.utd.cse.cerbac.cerbac.CloudResource <em>Cloud Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.utd.cse.cerbac.cerbac.CloudResource
	 * @generated
	 */
	public Adapter createCloudResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.utd.cse.cerbac.cerbac.CloudService <em>Cloud Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.utd.cse.cerbac.cerbac.CloudService
	 * @generated
	 */
	public Adapter createCloudServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.utd.cse.cerbac.cerbac.Hardware <em>Hardware</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.utd.cse.cerbac.cerbac.Hardware
	 * @generated
	 */
	public Adapter createHardwareAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.utd.cse.cerbac.cerbac.Data <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.utd.cse.cerbac.cerbac.Data
	 * @generated
	 */
	public Adapter createDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.utd.cse.cerbac.cerbac.ComputeService <em>Compute Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.utd.cse.cerbac.cerbac.ComputeService
	 * @generated
	 */
	public Adapter createComputeServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.utd.cse.cerbac.cerbac.NetworkingService <em>Networking Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.utd.cse.cerbac.cerbac.NetworkingService
	 * @generated
	 */
	public Adapter createNetworkingServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.utd.cse.cerbac.cerbac.StorageService <em>Storage Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.utd.cse.cerbac.cerbac.StorageService
	 * @generated
	 */
	public Adapter createStorageServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.utd.cse.cerbac.cerbac.Storage <em>Storage</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.utd.cse.cerbac.cerbac.Storage
	 * @generated
	 */
	public Adapter createStorageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.utd.cse.cerbac.cerbac.ActionLink <em>Action Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.utd.cse.cerbac.cerbac.ActionLink
	 * @generated
	 */
	public Adapter createActionLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.utd.cse.cerbac.cerbac.HowLink <em>How Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.utd.cse.cerbac.cerbac.HowLink
	 * @generated
	 */
	public Adapter createHowLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.utd.cse.cerbac.cerbac.WhatLink <em>What Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.utd.cse.cerbac.cerbac.WhatLink
	 * @generated
	 */
	public Adapter createWhatLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.utd.cse.cerbac.cerbac.WhereLink <em>Where Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.utd.cse.cerbac.cerbac.WhereLink
	 * @generated
	 */
	public Adapter createWhereLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.utd.cse.cerbac.cerbac.WhoLink <em>Who Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.utd.cse.cerbac.cerbac.WhoLink
	 * @generated
	 */
	public Adapter createWhoLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.utd.cse.cerbac.cerbac.WhenLink <em>When Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.utd.cse.cerbac.cerbac.WhenLink
	 * @generated
	 */
	public Adapter createWhenLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.utd.cse.cerbac.cerbac.WhyLink <em>Why Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.utd.cse.cerbac.cerbac.WhyLink
	 * @generated
	 */
	public Adapter createWhyLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.utd.cse.cerbac.cerbac.PolicyAttributeExtend <em>Policy Attribute Extend</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.utd.cse.cerbac.cerbac.PolicyAttributeExtend
	 * @generated
	 */
	public Adapter createPolicyAttributeExtendAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.utd.cse.cerbac.cerbac.PolicyAttributeLink <em>Policy Attribute Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.utd.cse.cerbac.cerbac.PolicyAttributeLink
	 * @generated
	 */
	public Adapter createPolicyAttributeLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //CerbacAdapterFactory
