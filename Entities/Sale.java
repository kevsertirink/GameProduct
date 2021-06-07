package Entities;

public class Sale{
	private String productSaleName;

	public Sale(String productSaleName) {
		super();
		this.productSaleName = productSaleName;
	}

	public String getProductSaleName() {
		return productSaleName;
	}

	public void setProductSaleName(String productSaleName) {
		this.productSaleName = productSaleName;
	}

}
