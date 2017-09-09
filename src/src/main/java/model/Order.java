package model;

import java.util.Date;
import java.util.List;

import org.joda.time.TimeOfDay;

public class Order {
	
	private Provider provider;
	private Client client;
	private List<Menu> menus;
	private Object typeOfDelivery;
	private Date dateOfDelivery;
	private TimeOfDay timeOfDelivery;
	private Boolean delivered;
	public Provider getProvider() {
		return provider;
	}
	public void setProvider(Provider provider) {
		this.provider = provider;
	}
	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}
	public List<Menu> getMenus() {
		return menus;
	}
	public void setMenus(List<Menu> menus) {
		this.menus = menus;
	}
	public Object getTypeOfDelivery() {
		return typeOfDelivery;
	}
	public void setTypeOfDelivery(Object typeOfDelivery) {
		this.typeOfDelivery = typeOfDelivery;
	}
	public Date getDateOfDelivery() {
		return dateOfDelivery;
	}
	public void setDateOfDelivery(Date dateOfDelivery) {
		this.dateOfDelivery = dateOfDelivery;
	}
	public TimeOfDay getTimeOfDelivery() {
		return timeOfDelivery;
	}
	public void setTimeOfDelivery(TimeOfDay timeOfDelivery) {
		this.timeOfDelivery = timeOfDelivery;
	}
	public Boolean getDelivered() {
		return delivered;
	}
	public void setDelivered(Boolean delivered) {
		this.delivered = delivered;
	}
	
	
	
}
