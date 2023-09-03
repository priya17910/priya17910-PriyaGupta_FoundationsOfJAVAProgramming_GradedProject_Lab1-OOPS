package com.company.credentialservice;

import java.util.Random;

public class PasswordGenerator {
	private Random random = new Random(); // Random is for generating random numbers
	// GENERATE PASSWORD METHOD IN CREDENTIAL SERVICE CLASS
	public String generatePassword() {
		
		// ALLOWED PASSWORD CHARACTERS
		final String passwordCharacters = 
				"ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()_+=?:";
		StringBuilder password = new StringBuilder();
		
		
		// PASSWORD CHARACTER CONSIDERING OF LENGTH 8
		for (int i = 0; i < 8; i++)
		{
			// RANDOM PASSWORD GENERATION
			int randomIndex = random.nextInt(passwordCharacters.length());
			password.append(passwordCharacters.charAt(randomIndex));
		}
		return password.toString();
	}
}
