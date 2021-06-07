package Managers;

import Entities.Customer;
import Interfaces.CustomerService;

public class CustomerManager implements CustomerService{
    
	
	public CustomerManager(CustomerCheckManager customerCheckManager) {
	this.customerCheckManager= customerCheckManager;
     }
    CustomerCheckManager customerCheckManager;

	
	@Override
	public void add(Customer customer) {
    if(customerCheckManager.checkIfRealPerson(customer)==true) {
		
		
		System.out.println("'"+ customer.getFirstName()+ "'"+ "isimli kisi sisteme eklendi.");		
	}
}
	@Override
	public void delete(Customer customer) {
    if(customerCheckManager.checkIfRealPerson(customer)==true) {
 
		
		System.out.println("'"+ customer.getFirstName()+ "'"+ "isimli kisi sistemden silindi.");		
		
	}
}
	@Override
	public void update(Customer customer) {
	    System.out.println("'"+ customer.getFirstName()+ "'"+ "isimli kisi güncellendi.");		
		
	}

}
