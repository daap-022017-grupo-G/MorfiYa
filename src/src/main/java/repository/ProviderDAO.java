package repository;


import model.Provider;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.apache.commons.lang.StringUtils;
import org.hibernate.SessionFactory;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.collections.Predicate;

import fixture.ProviderFixture;


public class ProviderDAO implements ProviderRepository {
	
	 private List<Provider> providers;

	 public SessionFactory sessionFactory;

	 public List<Provider> getProviders() {
		return providers;
	}


	public void setProviders(List<Provider> provider) {
		this.providers = provider;
	}


	public ProviderDAO() {
	    providers = ProviderFixture.createProviders();
	 }


	@Override
	public List<Provider> getProviders(Integer from, int numberOfProvider, String string) {
        List<Provider> result = this.getProvidersByName(string);
        int to = from + numberOfProvider > result.size() ? result.size() : from + numberOfProvider;
        return result.subList(from, to);
	}

	@Override
	public Integer getCount(final String name) {
		List<Provider> result = this.getProvidersByName(name);
		return result.size();
	}

	private List<Provider> getProvidersByName(String name) {
		List<Provider> result = new ArrayList<Provider>();
        if (!StringUtils.isEmpty(name)) {
            for (Provider provider : providers) {
                if (provider.getName().contains(name)) {
                    result.add(provider);
                }
            }
        } else {
            result.addAll(providers);
        }
        return result;
	}


	@Override
	public Set<String> getNames() {
        Set<String> names = new HashSet<String>();
        for (Provider provider : providers) {
            names.add(provider.getName());
        }
        return names;

	}

	@Override
	public List<Provider> getProviders(String name) {
        return (List<Provider>) CollectionUtils.select(providers, new Predicate() {

            @Override
            public boolean evaluate(final Object arg0) {
                return ((Provider) arg0).getName().equals(name);
            }
        });
        // return providers.
    }
	
	


	@Override
	public List<Provider> findAll() {
		List<Provider> result = new ArrayList<Provider>();
        for (Provider provider : providers) {
            result.add(provider);
        }
        return result;
	}
	
	 public void setSessionFactory(SessionFactory sessionFactory){
	     this.sessionFactory = sessionFactory;
	  }


	@Override
	public void save(Provider entity) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void delete(Provider entity) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void update(Provider entity) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public Provider findById(Serializable id) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public void deleteById(Serializable id) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public int count() {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public List<Provider> findByExample(Provider exampleObject) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
  