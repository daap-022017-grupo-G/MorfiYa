package repository;

import model.Client;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class ClientDAO implements GenericRepository<Client> {

    Client aClient = new Client();
    ArrayList<Client> clients = new ArrayList<Client>();


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