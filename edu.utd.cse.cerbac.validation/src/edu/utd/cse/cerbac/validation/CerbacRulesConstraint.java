package edu.utd.cse.cerbac.validation;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.validation.AbstractModelConstraint;
import org.eclipse.emf.validation.IValidationContext;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.uml2.uml.Element;

import edu.utd.cse.cerbac.cerbac.CerbacPolicy;

public class CerbacRulesConstraint extends AbstractModelConstraint {

	@Override
	public IStatus validate(IValidationContext context) {
		
		CerbacPolicy cp = (CerbacPolicy) context.getTarget();
		
		
		EObject target = context.getTarget();
		if (target instanceof Element) {
			Element element = (Element) target;
			
		}
		return context.createSuccessStatus();
	
	}

}
