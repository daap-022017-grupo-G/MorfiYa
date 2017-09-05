package model;

import java.util.Date;

public class ProviderService extends UserService {
	private Provider provider;
	private Date dateOfSale;
	private Boolean wantDelivery;
	
	
	public Provider getProvider() {
		return provider;
	}

	public void setProvider(Provider provider) {
		this.provider = provider;
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
