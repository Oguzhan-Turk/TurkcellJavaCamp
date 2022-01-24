package com.oguzhanturk.adapters;

import com.oguzhanturk.entity.Customer;
import com.oguzhanturk.service.api.CustomerCheckService;

import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements CustomerCheckService {

	@Override
	public boolean checkIfRealPerson(Customer customer) throws Exception {
		KPSPublicSoapProxy proxy = new KPSPublicSoapProxy();

		return proxy.TCKimlikNoDogrula(Long.parseLong(customer.getNationalityID()),
				customer.getFirstName().toUpperCase(), customer.getLastName().toUpperCase(),
				customer.getDateOfBirth().getYear());
	}
}
