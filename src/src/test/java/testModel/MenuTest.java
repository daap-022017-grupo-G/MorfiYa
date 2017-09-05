package testModel;
import org.junit.Test;

import custom_exceptions.MenuDescriptionNoLongEnoughException;
import custom_exceptions.MenuDescriptionNoShortEnoughException;
import custom_exceptions.MenuNameNoLongEnoughException;
import custom_exceptions.MenuNameNoShortEnoughException;
import custom_exceptions.MenusDeliverysCostNotCheapEnoughException;
import custom_exceptions.MenusDeliverysCostNotExpensiveEnoughException;
import model.Menu;

public class MenuTest {
		
	// El nombre del menu debe tener mas de 4 caracteres
	@Test(expected = MenuNameNoLongEnoughException.class) 
	public void test_menu_setNameThrowExceptionIfNewNameHasLessThan_four_chars(){
		Menu newMenu = new Menu();
		String lessThanFourChars = "a";
		newMenu.setName(lessThanFourChars);
	}
	
	// El nombre del menu no debe tener mas de 30 caracteres
	@Test(expected = MenuNameNoShortEnoughException.class) 
	public void test_menu_setNameThrowExceptionIfNewNameHasMoreThan_thirty_chars(){
		Menu newMenu = new Menu();
		String moreThanThirtyChars = "";
		for(int i=0; i < 31; i++){
			moreThanThirtyChars += "a";
		}		
		newMenu.setName(moreThanThirtyChars);
	}
	
	// La descripción del menu debe tener mas de 20 caracteres
	@Test(expected = MenuDescriptionNoLongEnoughException.class) 
	public void test_menu_setDescriptionThrowExceptionIfNewDescriptionHasLessThan_twenty_chars(){
		Menu newMenu = new Menu();
		String lessThanTwentyChars = "";
		for(int i=0; i < 19; i++){
			lessThanTwentyChars += "a";
		}		
		newMenu.setDescription(lessThanTwentyChars);
	}

	// La descripción del menu no debe tener mas de 40 caracteres
	@Test(expected = MenuDescriptionNoShortEnoughException.class) 
	public void test_menu_setDescriptionThrowExceptionIfNewNameHasMoreThan_fourty_chars(){
		Menu newMenu = new Menu();
		String moreThanTFourtyChars = "";
		for(int i=0; i < 41; i++){
			moreThanTFourtyChars += "a";
		}		
		newMenu.setDescription(moreThanTFourtyChars);
	}

	// El valor del delivery del menu no debe ser menor a 10 pesos
	@Test(expected = MenusDeliverysCostNotExpensiveEnoughException.class) 
	public void test_menu_setDeliveryCostThrowExceptionIfDeliveryCostCostLessThan_ten_pesos(){
		Menu newMenu = new Menu();
		Integer lessThanTenPesos = 9;
		newMenu.setDeliveryCost(lessThanTenPesos);
	}
	
	// El valor del delivery del menu no debe ser mayor a 40 pesos
	@Test(expected = MenusDeliverysCostNotCheapEnoughException.class) 
	public void test_menu_setDeliveryCostThrowExceptionIfDeliveryCostCostMoreThan_fourty_pesos(){
		Menu newMenu = new Menu();
		Integer moreThanFourtyPesos = 41;
		newMenu.setDeliveryCost(moreThanFourtyPesos);
	}
}
