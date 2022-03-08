package com.microservices;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.microservices.pre.utility.Constants;

@SpringBootApplication
public class SpringBootApiDemoApplication {

	public static void main(String[] args) throws IOException {
		SpringApplication.run(SpringBootApiDemoApplication.class, args);
		
		 FileInputStream fs = new FileInputStream(System.getProperty("user.dir") + "//src//main//java//com//microservices//pre//properties//PreOnboardingWealth.properties");
	       
		    System.out.println(System.getProperty("user.dir"));
		    Constants.PreOnboardingWealthOR = new Properties();
	        Constants.PreOnboardingWealthOR.load(fs);
	}

}
