/**
 * 
 */
package fixture;

import java.util.ArrayList;
import java.util.List;

import model.Client;
import model.Menu;
import model.Order;


public class ClientFixture {
	private static Integer id = 0;

	public static List<Client> createClients() {
		List<Client> clients = new ArrayList<Client>();
		clients.add(ClientFixture.createBasicClient("1-234-5",10));
		clients.add(ClientFixture.createCompleteClient("cliente1","1-11111-1","clienteuno@clienteuno.com","sandwich de Milanesa"));
		clients.add(ClientFixture.createBasicClient("6-789-10",20));
		clients.add(ClientFixture.createBasicClient("11-121314-15",30));
		clients.add(ClientFixture.createCompleteClient("cliente2","2-22222-2","clientedos@otroclienteuno.com","ravioles a los cuatro quesos"));
		clients.add(ClientFixture.createBasicClient("16-171819-20",40));
		return clients;
	}

	public static Client createBasicClient(String cuit, int credit) {
		Client client = new Client();
		client.setCUIT(cuit);
		client.setCredit(credit);
		client.setId(id);
		id= id +1;
		return client;
	}

	public static Client createCompleteClient(String name, String cuit, String email, String orden) {
		Menu menu = new Menu();
		Order order = new Order();
		menu.setName(orden);
		order.addNewMenu(menu);
		Client client = new Client();
		client.setName(name);
		client.setCUIT(cuit);
		client.setEmail(email);
		client.setId(id);
		id = id + 1;
		client.makeOrder(order);
		return client;
	}

	
}
