package repository;

import model.Client;
import model.Menu;

import java.util.List;
import java.util.Set;


public interface ClientRepository extends GenericRepository<Client>{

	List<Client> getClients(Integer from, int numberOfClient, String string) ;
	
    Integer getCount(String name);

    Set<String> getNames();

    List<Client> getClients(String name);

	List<Client> findAll();
	
	List<Menu> getMenus();

}