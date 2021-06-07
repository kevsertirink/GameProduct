package Managers;

import Entities.Product;
import Interfaces.ProductService;

public class ProductManager implements ProductService  {

	@Override
	public void add(Product product) {
    System.out.println("'"+ product.getProductName()+ "'"+ "isimli urun eklenmistir.");
	}
    

	@Override
	public void delete(Product product) {
	    System.out.println("'"+ product.getProductName()+ "'"+ "isimli urun silinmistir.");
		
	}

	@Override
	public void update(Product product) {
	    System.out.println("'"+ product.getProductName()+ "'"+ "isimli urun guncellenmistir.");
		
	}

}
