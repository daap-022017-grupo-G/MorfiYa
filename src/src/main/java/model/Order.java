package model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.joda.time.TimeOfDay;

import custom_exceptions.NotEnoughtCreditException;

public class Order extends SerializableObject {
	
	private Provider provider;
	private Client client;
	private List<Menu> menus;
	//private Object typeOfDelivery;
	private Date dateOfDelivery;
	private TimeOfDay timeOfDelivery;
	private Boolean delivered;

	public Order(){
		this.menus = new ArrayList<Menu>();
		this.delivered = Boolean.FALSE;
	}

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
//	public Object getTypeOfDelivery() {
//		return typeOfDelivery;
//	}
//	public void setTypeOfDelivery(Object typeOfDelivery) {
//		this.typeOfDelivery = typeOfDelivery;
//	}
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
	
	/*al comprar, al cliente se le descuenta del saldo el valor de la compra
	 * y al proveedor se le debe acreditar dicho valor en su saldo*/
	public void buy() {
		Integer clientCredit = this.client.getCredit();
		Integer providerCredit = this.provider.getCredit();
		Integer orderValue = 0;
		for (int i =0 ; i < this.menus.size();i++) {
			orderValue += this.menus.get(i).getValue();
		}
		if (clientCredit < orderValue) {
			throw new NotEnoughtCreditException("debe su monto es insuficiente para esta operacion");
		}
		else {
			providerCredit = providerCredit + orderValue;
			clientCredit = clientCredit - orderValue;
			this.client.setCredit(clientCredit);
			this.provider.setCredit(providerCredit);			
		}
	}

	public void wasDelivered() {
		//cuando ya se entrego la orden
		this.delivered = Boolean.TRUE;
	}

	public void addNewMenu(Menu food) {
		// agrega un pedido mas a la lista
		this.menus.add(food);
	}
}
