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
	
}
