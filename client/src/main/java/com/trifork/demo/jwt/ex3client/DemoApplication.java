package com.trifork.demo.jwt.ex3client;

import org.apache.http.auth.UsernamePasswordCredentials;
import org.apache.http.client.CredentialsProvider;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.client.methods.RequestBuilder;
import org.apache.http.impl.client.BasicCredentialsProvider;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {
	private static final Logger logger = LoggerFactory.getLogger(DemoApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args)  {
		logger.info("Hello world!");
		try {
			RestTemplate restTemplate = new RestTemplate();
			ResponseEntity<String> answer = restTemplate.exchange("http://adder:8443/add/2/2", HttpMethod.GET, null, String.class);
			logger.info("The answer is {}", answer.getBody());
		} catch (Exception e) {
			logger.error("Exception:", e);
		}

	}

	private void addAuthentication() {
		String AT = "eyJhbGciOiJSUzI1NiIsInR5cCIgOiAiSldUIiwia2lkIiA6ICJRLUxwZ0VjN1BPa1FzT19SMFlkTllrN3RSUGh2ZFM5bkJwTUNIMk1kWkNFIn0.eyJqdGkiOiIyZTIxMzAxNi1kM2NkLTQ4MDctOWU2NS04YjE2Y2FiZWUyNjgiLCJleHAiOjE1NjkzMDY3OTYsIm5iZiI6MCwiaWF0IjoxNTY5MzA2NDk2LCJpc3MiOiJodHRwczovL3RvcGRhbm1hcmsuaWQ0Mi5kay9hdXRoL3JlYWxtcy9kZW1vIiwiYXVkIjoiYXBpMSIsInN1YiI6ImFlZTJlN2M1LTA1N2QtNDg0Yy1iZmFlLTVhMGEwNGFmZjQ4MiIsInR5cCI6IkJlYXJlciIsImF6cCI6InNlcnZpY2VrbGllbnQiLCJhdXRoX3RpbWUiOjAsInNlc3Npb25fc3RhdGUiOiJkNGEyNWU1Zi1iYjYzLTQ4MDYtOTBlOS0yYzVkNzEwMjhlZmIiLCJhY3IiOiIxIiwic2NvcGUiOiJzZXJ2aWNla2xpZW50IHByb2ZpbGUgZW1haWwiLCJlbWFpbF92ZXJpZmllZCI6ZmFsc2UsImNsaWVudElkIjoic2VydmljZWtsaWVudCIsImNsaWVudEhvc3QiOiIxMjkuMTQyLjE4MS41NDo0ODkwNSIsInByZWZlcnJlZF91c2VybmFtZSI6InNlcnZpY2UtYWNjb3VudC1zZXJ2aWNla2xpZW50IiwiY2xpZW50QWRkcmVzcyI6IjEyOS4xNDIuMTgxLjU0OjQ4OTA1IiwiZW1haWwiOiJzZXJ2aWNlLWFjY291bnQtc2VydmljZWtsaWVudEBwbGFjZWhvbGRlci5vcmcifQ.p6IuUElSZxL0abVoXkoXA4Js3GtRFNBgJyCV-efWDkFCcFPYD6qaxWK3je49l1BQMuKfuuSD_xEdziha0SQ39e_vRp_nykskgJ4rRlqLq6c9qzBCdvo0j16ll_9AVXAOOAPRtUBqv0LadlHokhOt4iDmc9v15g8P2aiwbGlkLeNA2t6TYZjrFWEeMk7cl9yYI1ioTzXeI58iT1dGYz1v7Uxm5GT3OqrUbyCGGnz_FlTcdKWyVtSkMM_6RvX3vntSJXAq5FKKa4pswDl2KCdxagCx6TzhyccKtoQt-fHtIZJj12ue0uoyE0cLeBlBAwgDWIX4TbMRxjCGU7O_Byy15g";
	}
}
