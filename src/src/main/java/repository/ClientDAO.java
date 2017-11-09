package repository;

import model.Client;


import fixture.ClientFixture;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class ClientDAO implements GenericRepository<Client> {

    //Client aClient = new Client();
    private ArrayList<Client> clients = new ArrayList<Client>();
   
    public ClientDAO() {
        clients = (ArrayList<Client>) ClientFixture.createClients();
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
        return clients;
    }

    @Override
    public void deleteById(Serializable id) {

    }

    @Override
    public int count() {
        return clients.size();
    }

    @Override
    public List<Client> findByExample(Client exampleObject) {
        return null;
    }
}