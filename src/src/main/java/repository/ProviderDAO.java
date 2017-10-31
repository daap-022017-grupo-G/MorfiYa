package repository;

import model.Client;
import model.Provider;

import java.io.Serializable;
import java.util.List;

public class ProviderDAO implements GenericRepository<Provider> {

    private List<Provider> clients;

    public ProviderDAO() {
        //clients = PostFixture.createPosts();
    }

    @Override
    public void save(Provider entity) {

    }

    @Override
    public void delete(Provider entity) {

    }

    @Override
    public void update(Provider entity) {

    }

    @Override
    public Provider findById(Serializable id) {
        return null;
    }

    @Override
    public List<Provider> findAll() {
        return null;
    }

    @Override
    public void deleteById(Serializable id) {

    }

    @Override
    public int count() {
        return 0;
    }

    @Override
    public List<Provider> findByExample(Provider exampleObject) {
        return null;
    }
}


