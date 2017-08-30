import org.junit.Test;

import custom_exceptions.MenuNameNoLongEnoughException;
import custom_exceptions.MenuNameNoShortEnoughException;
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
		String moreThanThirtyChars = "aaaa_bbbb_aaaa_bbbb_aaaa_bbbb_aaaa_bbbb_";
		newMenu.setName(moreThanThirtyChars);
	}
	
	
}
