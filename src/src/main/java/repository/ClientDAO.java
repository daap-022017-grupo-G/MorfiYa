package repository;

import model.Client;

import java.io.Serializable;
import java.util.List;

public class ClientDAO implements GenericRepository<Client>{

        private List<Client> clients;

        public ClientDAO() {
            //clients = PostFixture.createPosts();
        }


    @Override
    public void save(Client entity) {

    }

    @Override
    public void delete(Client entity) {

    }

    @Override
    public void update(Client entity) {

    }

    @Override
    public Client findById(Serializable id) {
        return null;
    }

    @Override
    public List<Client> findAll() {
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
    public List<Client> findByExample(Client exampleObject) {
        return null;
    }
}
