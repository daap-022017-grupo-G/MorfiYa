package model;

import java.util.ArrayList;
import java.util.List;

public class Client extends User {
	private String CUIT;
	private Integer credit;
	private List<Order> historicOrders;
	private List<Order> ordersToRate;
	
	public Client() {
		this.CUIT="";
		this.credit = 0;
		this.historicOrders = new ArrayList<Order>();
		this.ordersToRate = new ArrayList<Order>();
	
	}
	

	public String getCUIT() {
		return CUIT;
	}

	public void setCUIT(String cUIT) {
		CUIT = cUIT;
	}

	public Integer getCredit() {
		return credit;
	}

	public void setCredit(Integer credit) {
		this.credit = credit;
	}
	
	public void makeOrder(Order order) {
		this.historicOrders.add(order);
	}
	
	public void receiveOrder(Order order) {
		this.ordersToRate.add(order);
	}
	public void rateOrder(Order order, Integer rate) {
		this.ordersToRate.remove(order);
	}
	
	

}
