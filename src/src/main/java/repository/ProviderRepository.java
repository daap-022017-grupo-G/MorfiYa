package repository;

import model.Provider;


import java.util.List;
import java.util.Set;

public interface ProviderRepository extends GenericRepository<Provider>{

	List<Provider> getProviders(Integer from, int numberOfClient, String string) ;
	
    Integer getCount(String name);

    Set<String> getNames();

    List<Provider> getProviders(String name);

	List<Provider> findAll();

}
