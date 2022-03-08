package com.microservices;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.microservices.utility.call.CallShoppingGeneralConstants;
import com.microservices.utility.pre.PreOnboardingWealthConstants;

@SpringBootApplication
public class SpringBootApiDemoApplication {

	public static void main(String[] args) throws IOException {
		SpringApplication.run(SpringBootApiDemoApplication.class, args);
		
		 FileInputStream onboardingFileStream = new FileInputStream(System.getProperty("user.dir") + "//src//main//java//com//microservices//properties//pre//PreOnboardingWealth.properties");
	       
		 FileInputStream shoppingFileStream = new FileInputStream(System.getProperty("user.dir") + "//src//main//java//com//microservices//properties//call//CallShoppingGeneral.properties");
		 
				 
		    System.out.println(System.getProperty("user.dir"));
		    CallShoppingGeneralConstants.CallShoppingGeneralOR = new Properties();
		    CallShoppingGeneralConstants.CallShoppingGeneralOR.load(shoppingFileStream);
		    PreOnboardingWealthConstants.PreOnboardingWealthOR = new Properties();
	        PreOnboardingWealthConstants.PreOnboardingWealthOR.load(onboardingFileStream);
	}

}
