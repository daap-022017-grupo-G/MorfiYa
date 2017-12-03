package model;

import java.util.ArrayList;
import java.util.List;



public class Client extends User {
	private static final long serialVersionUID = 1L;
	private String CUIT;
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

	
	public void saveOrder(Order order) {
		this.historicOrders.add(order);
	}
	
	public void makeOrder(Order order) {
		this.ordersToRate.add(order);
	}
	public void rateOrder(Order order, Integer rate) {
		this.ordersToRate.remove(order);
	}
	
	public List<Menu> getMenu(){
		List<Menu> menus = new ArrayList <Menu>();
		for (Order order : ordersToRate) {
            menus.addAll(order.getMenus());
        }
		return menus;
	}
	
	

}
