package dataRequired;

import java.io.IOException;

import web_Common_Functions.Properties_Reader;

public class LoginData {
	static String filePath = ".//instagramLogin_Data_Files/logindata.properties";
	
	public static String LoginUsername() throws IOException {
	
	String loginUsername = Properties_Reader.getValue(filePath, "username");
	
	return loginUsername;
	}
	
	
	public static String loginPassword() throws IOException {
		
	return Properties_Reader.getValue(filePath, "password");
	
	}
}
