/**
 * 
 */
package com.microservices.serviceImplementation.pre.onboarding;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microservices.daoInterface.pre.onboarding.PreOnboardingWealthDaoLayer;
import com.microservices.entitiesModel.pre.onbaording.SignupLoginCustomerDetails;
import com.microservices.serviceInterface.pre.onboarding.PreOnboardingWealthServiceLayer;

/**
 * @author 33000005
 *
 */
@Service
public class PreOnboardingWealthServiceLayerImpl implements PreOnboardingWealthServiceLayer {

	/**
	 * 
	 */
	@Autowired
	private PreOnboardingWealthDaoLayer wealthDaoLayer;

	@Override
	public boolean registerCustomer(SignupLoginCustomerDetails customerDetails) {
		// TODO Auto-generated method stub
		return wealthDaoLayer.registerCustomer(customerDetails);
	}

}
