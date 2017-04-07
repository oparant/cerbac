package edu.utd.cse.cerbac.validation;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.validation.AbstractModelConstraint;
import org.eclipse.emf.validation.IValidationContext;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.util.UMLUtil;

import edu.utd.cse.cerbac.cerbac.CerbacPolicy;

public class CerbacRulesConstraint extends AbstractModelConstraint {

	@Override
	public IStatus validate(IValidationContext context) {
		System.out.println("<<context::" + context);
		
		EObject target = context.getTarget();
		System.out.println("<<Type of Target::" + target.getClass());
		
	
		if (target instanceof Element) {
			Element element = (Element) target;
			if (UMLUtil.getStereotypeApplication(element, CerbacPolicy.class) != null) {
				System.out.println("<<CerbacPolicy Element Found>>");
			}else{
				return context.createFailureStatus();
			}
			
		}
		return context.createSuccessStatus();
	
	}

}
