/**
 * 
 */
package com.microservices.daoImplementation.pre.onboarding;

import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.microservices.daoInterface.pre.onboarding.PreOnboardingWealthDaoLayer;
import com.microservices.entitiesModel.pre.onbaording.SignupLoginCustomerDetails;

import com.microservices.pre.utility.Constants;

/**
 * @author 33000005
 *
 */
@Repository
public class PreOnboardingWealthDaoLayerImpl implements PreOnboardingWealthDaoLayer {

	/**
	 * 
	 */
	@Autowired
	private EntityManager em;

	@Override
	public boolean registerCustomer(SignupLoginCustomerDetails customerDetails) {
		StoredProcedureQuery query = em.createStoredProcedureQuery(Constants.PreOnboardingWealthOR.getProperty("SignupLoginSP"))
				.registerStoredProcedureParameter(Constants.PreOnboardingWealthOR.getProperty("SourceTypeVarSignupLoginSP"), String.class, ParameterMode.IN)
				.registerStoredProcedureParameter(Constants.PreOnboardingWealthOR.getProperty("ClientIdVarSignupLoginSP"), String.class, ParameterMode.IN)
				.registerStoredProcedureParameter(Constants.PreOnboardingWealthOR.getProperty("EmailIdVarSignupLoginSP"), String.class, ParameterMode.IN)
				.registerStoredProcedureParameter(Constants.PreOnboardingWealthOR.getProperty("MobileNoVarSignupLoginSP"), String.class, ParameterMode.IN)
				.registerStoredProcedureParameter(Constants.PreOnboardingWealthOR.getProperty("IdentityVarSignupLoginSP"), String.class, ParameterMode.IN)
				.registerStoredProcedureParameter(Constants.PreOnboardingWealthOR.getProperty("SalutationVarSignupLoginSP"), String.class, ParameterMode.IN)
				.registerStoredProcedureParameter(Constants.PreOnboardingWealthOR.getProperty("FirstNameVarSignupLoginSP"), String.class, ParameterMode.IN)
				.registerStoredProcedureParameter(Constants.PreOnboardingWealthOR.getProperty("MiddleNameVarSignupLoginSP"), String.class, ParameterMode.IN)
				.registerStoredProcedureParameter(Constants.PreOnboardingWealthOR.getProperty("LastNameVarSignupLoginSP"), String.class, ParameterMode.IN)
				.registerStoredProcedureParameter(Constants.PreOnboardingWealthOR.getProperty("GenderVarSignupLoginSP"), String.class, ParameterMode.IN)
				.registerStoredProcedureParameter(Constants.PreOnboardingWealthOR.getProperty("DateOfBirthVarSignupLoginSP"), String.class, ParameterMode.IN)
				.registerStoredProcedureParameter(Constants.PreOnboardingWealthOR.getProperty("CurrencyVarSignupLoginSP"), String.class, ParameterMode.IN)
				.registerStoredProcedureParameter(Constants.PreOnboardingWealthOR.getProperty("LanguageVarSignupLoginSP"), String.class, ParameterMode.IN)
				.registerStoredProcedureParameter(Constants.PreOnboardingWealthOR.getProperty("AddressLine1VarSignupLoginSP"), String.class, ParameterMode.IN)
				.registerStoredProcedureParameter(Constants.PreOnboardingWealthOR.getProperty("AddressLine2VarSignupLoginSP"), String.class, ParameterMode.IN)
				.registerStoredProcedureParameter(Constants.PreOnboardingWealthOR.getProperty("AddressLine3VarSignupLoginSP"), String.class, ParameterMode.IN)
				.registerStoredProcedureParameter(Constants.PreOnboardingWealthOR.getProperty("PincodeVarSignupLoginSP"), String.class, ParameterMode.IN)
				.registerStoredProcedureParameter(Constants.PreOnboardingWealthOR.getProperty("CityVarSignupLoginSP"), String.class, ParameterMode.IN)
				.registerStoredProcedureParameter(Constants.PreOnboardingWealthOR.getProperty("StateVarSignupLoginSP"), String.class, ParameterMode.IN)
				.registerStoredProcedureParameter(Constants.PreOnboardingWealthOR.getProperty("AddressTypeVarSignupLoginSP"), String.class, ParameterMode.IN)
				.setParameter(Constants.PreOnboardingWealthOR.getProperty("SourceTypeVarSignupLoginSP"), customerDetails.getSourceType())
				.setParameter(Constants.PreOnboardingWealthOR.getProperty("ClientIdVarSignupLoginSP"), customerDetails.getClientId())
				.setParameter(Constants.PreOnboardingWealthOR.getProperty("EmailIdVarSignupLoginSP"), customerDetails.getEmailId())
				.setParameter(Constants.PreOnboardingWealthOR.getProperty("MobileNoVarSignupLoginSP"), customerDetails.getMobileNo())
				.setParameter(Constants.PreOnboardingWealthOR.getProperty("IdentityVarSignupLoginSP"), customerDetails.getIdentity())
				.setParameter(Constants.PreOnboardingWealthOR.getProperty("SalutationVarSignupLoginSP"), customerDetails.getSalutation())
				.setParameter(Constants.PreOnboardingWealthOR.getProperty("FirstNameVarSignupLoginSP"), customerDetails.getFirstName())
				.setParameter(Constants.PreOnboardingWealthOR.getProperty("MiddleNameVarSignupLoginSP"), customerDetails.getMiddleName())
				.setParameter(Constants.PreOnboardingWealthOR.getProperty("LastNameVarSignupLoginSP"), customerDetails.getLastName())
				.setParameter(Constants.PreOnboardingWealthOR.getProperty("GenderVarSignupLoginSP"), customerDetails.getGender())
				.setParameter(Constants.PreOnboardingWealthOR.getProperty("DateOfBirthVarSignupLoginSP"), customerDetails.getDateOfBirth())
				.setParameter(Constants.PreOnboardingWealthOR.getProperty("CurrencyVarSignupLoginSP"), customerDetails.getCurrency())
				.setParameter(Constants.PreOnboardingWealthOR.getProperty("LanguageVarSignupLoginSP"), customerDetails.getLanguage())
				.setParameter(Constants.PreOnboardingWealthOR.getProperty("AddressLine1VarSignupLoginSP"), customerDetails.getAddressLine1())
				.setParameter(Constants.PreOnboardingWealthOR.getProperty("AddressLine2VarSignupLoginSP"), customerDetails.getAddressLine2())
				.setParameter(Constants.PreOnboardingWealthOR.getProperty("AddressLine3VarSignupLoginSP"), customerDetails.getAddressLine3())
				.setParameter(Constants.PreOnboardingWealthOR.getProperty("PincodeVarSignupLoginSP"), customerDetails.getPincode())
				.setParameter(Constants.PreOnboardingWealthOR.getProperty("CityVarSignupLoginSP"), customerDetails.getCity())
				.setParameter(Constants.PreOnboardingWealthOR.getProperty("StateVarSignupLoginSP"), customerDetails.getState())
				.setParameter(Constants.PreOnboardingWealthOR.getProperty("AddressTypeVarSignupLoginSP"), customerDetails.getAddressType());
		return query.execute();
	}

}
