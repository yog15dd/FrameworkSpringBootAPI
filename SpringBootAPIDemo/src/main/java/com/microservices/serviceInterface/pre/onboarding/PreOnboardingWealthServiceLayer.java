/**
 * 
 */
package com.microservices.serviceInterface.pre.onboarding;

import com.microservices.entitiesModel.pre.onbaording.SignupLoginCustomerDetails;

/**
 * @author 33000005
 *
 */
public interface PreOnboardingWealthServiceLayer {
	public boolean registerCustomer(SignupLoginCustomerDetails customerDetails);
}
