package repository;

import model.Client;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import java.io.Serializable;
import java.util.List;

public class ClientDAO implements GenericRepository<Client>{


    @Override
    public void save(Client entity) {
        Object sessionFactory;
        sessionFactory
    }

    @Override
    public void delete(Client entity) {
        delete(entity);
    }

    @Override
    public void update(Client entity) {
        update(entity);
    }

    @Override
    public Client findById(Serializable id) {
        Client client = (Client) findById(id);
        return client;
    }

    @Override
    public List<Client> findAll() {
        List<Client> clients = (List<Client>) findAll();
        return clients;
    }

    @Override
    public void deleteById(Serializable id) {
        deleteById(id);
    }

    @Override
    public int count() {
        count();
        return 0;
    }

    @Override
    public List<Client> findByExample(Client exampleObject) {
        return null;
    }
}
