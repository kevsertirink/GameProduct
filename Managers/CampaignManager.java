package Managers;

import Entities.Campaign;
import Interfaces.CampaignService;

public class CampaignManager implements CampaignService{

	@Override
	public void add(Campaign campaign) {
    System.out.println("'" + campaign.getCampaignsName()+"'"+"adli kampanya girisi yapildi+indirim oraniniz: % "
	+ campaign.getDiscountRate());		
	}

	@Override
	public void delete(Campaign campaign) {
    System.out.println( "'"+ campaign.getCampaignsName() + "'" +" adli kampanyaniz silinmistir.");		
	}

	@Override
	public void update(Campaign campaign) {
	    System.out.println( "'"+ campaign.getCampaignsName() + "'" +" adli kampanyaniz guncellenmistir.");		

	}

}
