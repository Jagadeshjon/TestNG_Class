package org.Configuration.Helper.Dress;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Configration_Reader_Dress {
	public static Properties p;

	public Configration_Reader_Dress() throws IOException {
		File f = new File("C:\\Users\\Naveen kumar\\eclipse-workspace\\Maven_Project_Class\\Dress.properties");
		FileInputStream fis = new FileInputStream(f);
		p = new Properties();
		p.load(fis);

	}

	public static String get_url() {
		String property = p.getProperty("url");
		return property;
	}
	public static String get_email() {
		String string = p.getProperty("email");
		return string;

	}
	public static String get_password() {
		String string = p.getProperty("password");
		return string;

	}

}