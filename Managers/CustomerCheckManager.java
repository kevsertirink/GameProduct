package Managers;

import Entities.Customer;
import Interfaces.CustomerCheckService;

public class CustomerCheckManager implements CustomerCheckService {

	@Override
	public boolean checkIfRealPerson(Customer customer) {
		if(customer.getId()==1 && customer.getFirstName()=="kevser"&& customer.getLastName()=="tirink" && 
				customer.getDateOfBirth()== 2000  && customer.getNationalityId()==4968){
			
			System.out.println("kisi bilgileri dogrulandi");
			return true;
		}
		else {
			System.out.println("kisi bilgileri dogrulanamadi");
			return false;
		}

	}

}
