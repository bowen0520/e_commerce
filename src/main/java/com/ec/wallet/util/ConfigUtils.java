package com.ec.wallet.util;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.Properties;

public class ConfigUtils {
	private static ConfigUtils configUtils = new ConfigUtils();
	
	private static Properties props;
	
	private ConfigUtils() {
		InputStream in = this.getClass().getResourceAsStream("/config.properties");
		Properties props = new Properties();
		InputStreamReader inputStreamReader;
		try {
			inputStreamReader = new InputStreamReader(in, "UTF-8");
			props.load(inputStreamReader);
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static String getPropertie(String key) {
		return (String) props.get(key);
	}
}
