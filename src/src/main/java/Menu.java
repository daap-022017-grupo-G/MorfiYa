import custom_exceptions.MenuDescriptionNoLongEnoughException;
import custom_exceptions.MenuDescriptionNoShortEnoughException;
import custom_exceptions.MenuNameNoLongEnoughException;
import custom_exceptions.MenuNameNoShortEnoughException;
import custom_exceptions.MenusDeliverysCostNotCheapEnoughException;
import custom_exceptions.MenusDeliverysCostNotExpensiveEnoughException;

public class Menu {

	private String name = "";
	private String description = "";
	private Integer deliveryCost;

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

}
