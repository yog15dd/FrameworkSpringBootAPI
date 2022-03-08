/**
 * 
 */
package com.microservices.daoInterface.pre.onboarding;

import com.microservices.entitiesModel.pre.onbaording.SignupLoginCustomerDetails;

/**
 * @author 33000005
 *
 */
public interface PreOnboardingWealthDaoLayer {

	/**
	 * 
	 */
	public boolean registerCustomer(SignupLoginCustomerDetails customerDetails);

}
