package model;

import custom_exceptions.MenuNameNoLongEnoughException;
import custom_exceptions.MenuNameNoShortEnoughException;
import custom_exceptions.MenusDeliverysCostNotCheapEnoughException;
import custom_exceptions.MenusDeliverysCostNotExpensiveEnoughException;
import custom_exceptions.MenuDescriptionNoLongEnoughException;
import custom_exceptions.MenuDescriptionNoShortEnoughException;

public class Menu extends SerializableObject{

	private String name = "";
	private String description = "";
	private Integer deliveryCost = 0;
	private Integer value;
	private String link;

	public void setName(String newName){
		if (newName.length() < 4) throw new MenuNameNoLongEnoughException();
		if (newName.length() > 30) throw new MenuNameNoShortEnoughException();
		
		this.name = newName;
	}
	
	public String getName(){
		return this.name;
	}

	public void setDescription(String newDescription) {
		if (newDescription.length() < 20) throw new MenuDescriptionNoLongEnoughException();
		if (newDescription.length() > 40) throw new MenuDescriptionNoShortEnoughException();
		
		this.description = newDescription;
	}
	
	public String getDescription(){
		return this.description;
	}

	public void setDeliveryCost(Integer newCost) {
		if (newCost < 10) throw new MenusDeliverysCostNotExpensiveEnoughException();
		if (newCost > 40) throw new MenusDeliverysCostNotCheapEnoughException();
		
		this.deliveryCost = newCost;	
	}

	public Integer getDeliveryCost(){
		return this.deliveryCost;
	}

	public Integer getValue() {
		return value + this.deliveryCost;
	}

	public void setValue(Integer value) {
		this.value = value;
	}

	public void setImagen(String string) {
		this.link= string;
		
	}

}
