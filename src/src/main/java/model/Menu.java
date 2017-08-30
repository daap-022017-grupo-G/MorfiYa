package model;
import custom_exceptions.MenuNameNoLongEnoughException;
import custom_exceptions.MenuNameNoShortEnoughException;

public class Menu {

	private String name;

	public void setName(String newName){
		if (newName.length() < 4) throw new MenuNameNoLongEnoughException();
		if (newName.length() > 30) throw new MenuNameNoShortEnoughException();
		
		this.name = newName;
	}

}
