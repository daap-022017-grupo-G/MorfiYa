package fixture;

import model.App;
import model.Client;
import model.Menu;
import model.Order;

class ChinoVirtualApp {
	
	static Menu p;
	static Menu p2;
	static Menu p3;
	static Menu p4;
	static Menu p5;
	static Client c1;
	static Client c2;
	static Client c3;
	
	static App morfi;
	
	public static void main(String[] args) {
		p = new Menu();
		p.setDescription("Empanadas");
		p.setValue(10);
		//		("Bebible", "Manaos", " Si tomas demasiado te convertiras en una tortuga ninja", 20, 1, 1);
		p.setImagen("images/empanadas.jpg");
		
		p2 = new Menu();
		p2.setDescription("Pizza");
		p2.setValue(90);
		p2.setImagen("images/pizza.jpg");
		
		p3 = new Menu();
		p3.setDescription("Ensalada");
		p3.setValue(75);
		p3.setImagen("images/salad.jpg");
		
		p3 = new Menu();
		p3.setDescription("Sandwich");
		p3.setValue(10);
		p3.setImagen("images/samdwich.jpg");
		
		
		morfi = new App();
		
		c1 = new Client();
				
		c2 = new Client();
				
		c3 = new Client();
				
		morfi.addClient(c1);
		morfi.addClient(c2);
		morfi.addClient(c3);
		morfi.addMenu(p);
		morfi.addMenu(p2);
		morfi.addMenu(p3);
		morfi.addMenu(p4);
		morfi.addMenu(p5);
		
	}
}