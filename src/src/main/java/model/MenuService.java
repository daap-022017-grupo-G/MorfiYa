package model;

public class MenuService {

	public MenuService() {}
	
	public void createMenu(Menu menu) {
		//crea el menu en la base de datos.
		System.out.println("menu creado exitosamente");
	}
	public Menu getMenuByName(String name) {
		//recupera el menu de la base de datos
		return new Menu();
	}
	
	public void updateMenu(Menu menu) {
		//actualiza el menu en la base
		System.out.println("se ha actualizado el menu");
		
	}
	
	public void deleteMenu(Menu menu) {
		//elimina el menu en la base
		System.out.println("menu eliminado del sistema");
		
	}
}
