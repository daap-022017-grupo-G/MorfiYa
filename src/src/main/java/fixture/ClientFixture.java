/**
 * 
 */
package fixture;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import model.Client;


public class ClientFixture {

	public static List<Client> createClients() {
		List<Client> clients = new ArrayList<Client>();
		clients.add(ClientFixture.createClients("1-234-5",10));
		clients.add(ClientFixture.createAnotherClients("cliente1","1-11111-1","clienteuno@clienteuno.com"));
		clients.add(ClientFixture.createClients("6-789-10",20));
		clients.add(ClientFixture.createClients("11-121314-15",30));
		clients.add(ClientFixture.createAnotherClients("cliente2","2-22222-2","clientedos@otroclienteuno.com"));
		clients.add(ClientFixture.createClients("16-171819-20",40));
		return clients;
	}

	public static Client createClients(String cuit, int credit) {
		Client client = new Client();
		client.setCUIT(cuit);
		client.setCredit(credit);
		return client;
	}

	public static Client createAnotherClients(String name, String cuit, String email) {
		Client client = new Client();
		client.setName(name);
		client.setCUIT(cuit);
		client.setEmail(email);
		return client;
	}

	
}
