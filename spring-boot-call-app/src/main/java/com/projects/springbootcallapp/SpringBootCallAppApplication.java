package com.projects.springbootcallapp;

import java.net.URI;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Call;
import com.twilio.type.PhoneNumber;

@SpringBootApplication
public class SpringBootCallAppApplication implements ApplicationRunner  {
	private final static String ACCOUNT_SID = ""; // Make an acoount in Twillio and get this SID
	private final static String AUTH_ID = "";   // Same 
	private final static String FROM_NUMBER="+17753836270";
	private final static String TO_NUMBER ="+918918792255";

	static {
		Twilio.init(ACCOUNT_SID, AUTH_ID);
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringBootCallAppApplication.class, args);
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {
		Call.creator(new PhoneNumber(TO_NUMBER), new PhoneNumber(FROM_NUMBER),
				new URI("http://demo.twilio.com/docs/voice.xml")).create();

	}
}
