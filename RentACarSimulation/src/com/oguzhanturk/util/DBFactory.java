package com.oguzhanturk.util;

import com.oguzhanturk.repository.CarMsSqlRepo;
import com.oguzhanturk.repository.CarOracleRepo;
import com.oguzhanturk.repository.CarRepo;

public class DBFactory {

	public static CarRepo create(String dbImpl) {
		switch (dbImpl) {
		case "MSSQL":
			return new CarMsSqlRepo();
		case "ORACLE":
			return new CarOracleRepo();
		}
		return null;
	}
}
