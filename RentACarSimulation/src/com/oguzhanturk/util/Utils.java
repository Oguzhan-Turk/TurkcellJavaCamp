package com.oguzhanturk.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Utils {

	public static String getPropertyForDBImpl() {
		Properties properties = new Properties();
		String propertyFileName = "./properties/properties.config";

		try (FileInputStream fileInputStream = new FileInputStream(propertyFileName)) {
			properties.load(fileInputStream);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		String db = properties.getProperty("DB");
		return db;

	}

}
