package model;

import java.util.Date;

public class ProviderService {
	private Date dateOfSale;
	private Boolean wantDelivery;
	
	public ProviderService() {
		
	}

	public Date getDateOfSale() {
		return dateOfSale;
	}

	public void setDateOfSale(Date dateOfSale) {
		this.dateOfSale = dateOfSale;
	}

	public Boolean getWantDelivery() {
		return wantDelivery;
	}

	public void setWantDelivery(Boolean wantDelivery) {
		this.wantDelivery = wantDelivery;
	}
	
}
