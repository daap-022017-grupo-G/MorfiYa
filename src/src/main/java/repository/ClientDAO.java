package repository;

import model.Client;
import model.Menu;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.apache.commons.lang.StringUtils;
import org.hibernate.SessionFactory;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.collections.Predicate;

import fixture.ClientFixture;


public class ClientDAO implements ClientRepository {
	
	 private List<Client> clients;

	 public SessionFactory sessionFactory;
	 



	 public List<Client> getClients() {
		return clients;
	}


	public void setClients(List<Client> clients) {
		this.clients = clients;
	}


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
	public Integer getCount(final String name) {
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
	
	


	@Override
	public List<Client> findAll() {
		List<Client> result = new ArrayList<Client>();
        for (Client client : clients) {
            result.add(client);
        }
        return result;
	}
	
	 public void setSessionFactory(SessionFactory sessionFactory){
	     this.sessionFactory = sessionFactory;
	  }


	@Override
	public void save(Client entity) {
		this.sessionFactory.openSession().save(entity);
		
	}


	@Override
	public void delete(Client entity) {
		this.sessionFactory.openSession().delete(entity);
		
	}


	@Override
	public void update(Client entity) {
		this.sessionFactory.openSession().update(entity);
		
	}


	@Override
	public Client findById(Serializable id) {
		Client result = new Client();
		result.setName("no se encontraron resultados");
        for (Client client : clients) {
                if (client.getId() == (Integer)id) {
                    result = client;
                }
            }
         
        return result;
	}


	@Override
	public void deleteById(Serializable id) {
		Client toDelete = this.findById(id);
		this.sessionFactory.openSession().delete(toDelete);
		
	}


	@Override
	public int count() {
		return this.sessionFactory.openSession().createQuery("from Client").list().size();
	}


	@Override
	public List<Client> findByExample(Client exampleObject) {
		List<Client> list = (ArrayList<Client>)this.sessionFactory.openSession().createQuery(exampleObject.getName()).list();
		return list;
	}


	@Override
	public List<Menu> getMenus() {
		List <Menu> result = new ArrayList<Menu>();
		for (Client client : clients) {
                    result.addAll(client.getMenu());
            }
        return result;
	}

	
}
  