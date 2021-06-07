package Entities;

public class Campaign {
    private String campaignsName;
    private int discountRate;
	
    public Campaign(String campaignsName, int discountRate) {
		super();
		this.campaignsName = campaignsName;
		this.discountRate = discountRate;
	}

	public String getCampaignsName() {
		return campaignsName;
	}

	public void setCampaignsName(String campaignsName) {
		this.campaignsName = campaignsName;
	}

	public int getDiscountRate() {
		return discountRate;
	}

	public void setDiscountRate(int discountRate) {
		this.discountRate = discountRate;
	}
     
}
