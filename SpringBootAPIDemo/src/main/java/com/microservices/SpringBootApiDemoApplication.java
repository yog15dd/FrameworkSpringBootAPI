package com.microservices;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.microservices.call.utility.CallShoppingGeneralConstants;
import com.microservices.pre.utility.PreOnboardingWealthConstants;

@SpringBootApplication
public class SpringBootApiDemoApplication {

	public static void main(String[] args) throws IOException {
		SpringApplication.run(SpringBootApiDemoApplication.class, args);
		
		 FileInputStream onboardingFileStream = new FileInputStream(System.getProperty("user.dir") + "//src//main//java//com//microservices//pre//properties//PreOnboardingWealth.properties");
	       
		 FileInputStream shoppingFileStream = new FileInputStream(System.getProperty("user.dir") + "//src//main//java//com//microservices//call//properties//CallShoppingGeneral.properties");
		 
				 
		    System.out.println(System.getProperty("user.dir"));
		    CallShoppingGeneralConstants.CallShoppingGeneralOR = new Properties();
		    CallShoppingGeneralConstants.CallShoppingGeneralOR.load(shoppingFileStream);
		    PreOnboardingWealthConstants.PreOnboardingWealthOR = new Properties();
	        PreOnboardingWealthConstants.PreOnboardingWealthOR.load(onboardingFileStream);
	}

}
