package com.oauth.demo.spring_oauthdemo.utils;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class EncrytedPasswordUtils {
  
  // Encryte Password with BCryptPasswordEncoder
  public static String encrytePassword(String password) {
	BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
	return encoder.encode(password);
  }
  
}
