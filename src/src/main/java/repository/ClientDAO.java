package repository;

import model.Client;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.apache.commons.lang.StringUtils;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.collections.Predicate;

import fixture.ClientFixture;


public class ClientDAO implements ClientRepository {
	
	 private List<Client> clients;

	 public ClientDAO() {
	    clients = ClientFixture.createClients();
	 }


	@Override
	public List<Client> getClients(Integer from, int numberOfClient, String string) {
        List<Client> result = this.getClientsByName(string);
        int to = from + numberOfClient > result.size() ? result.size() : from + numberOfClient;
        return result.subList(from, to);
	}

	@Override
	public Integer getcount(final String name) {
		List<Client> result = this.getClientsByName(name);
		return result.size();
	}

	private List<Client> getClientsByName(String name) {
		List<Client> result = new ArrayList<Client>();
        if (!StringUtils.isEmpty(name)) {
            for (Client client : clients) {
                if (client.getName().contains(name)) {
                    result.add(client);
                }
            }
        } else {
            result.addAll(clients);
        }
        return result;
	}


	@Override
	public Set<String> getNames() {
        Set<String> names = new HashSet<String>();
        for (Client client : clients) {
            names.add(client.getName());
        }
        return names;

	}

	@Override
	public List<Client> getClients(String name) {
        return (List<Client>) CollectionUtils.select(clients, new Predicate() {

            @Override
            public boolean evaluate(final Object arg0) {
                return ((Client) arg0).getName().equals(name);
            }
        });
        // return clients.
    }
	
}
  