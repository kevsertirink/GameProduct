package Assignment;

import Entities.Campaign;
import Entities.Customer;
import Entities.Product;
import Entities.Sale;
import Managers.CampaignManager;
import Managers.CustomerCheckManager;
import Managers.CustomerManager;
import Managers.ProductManager;
import Managers.SaleManager;

public class Main {

	public static void main(String[] args) {
    
		
		Customer customer1 = new Customer(1, "kevser", "tirink",2000,4968);
		CustomerManager customerManager = new CustomerManager(new CustomerCheckManager());
		customerManager.add(customer1);
		customerManager.delete(customer1);
		customerManager.update(customer1);
		
		
		Product product1= new Product("kkkk",300);
		ProductManager productManager = new ProductManager();
		productManager.add(product1);
		productManager.delete(product1);
		productManager.update(product1);
		
		Campaign campaign1 = new Campaign("black friday", 20);
		CampaignManager campaignManager = new CampaignManager();
		campaignManager.add(campaign1);
		campaignManager.delete(campaign1);
		campaignManager.update(campaign1);
		
		
		Sale sale1 = new Sale("Satim");
		SaleManager saleManager = new SaleManager(customer1, product1, campaign1);
		saleManager.add(sale1);
		saleManager.delete(sale1);
		
		
		
		
	}

}
