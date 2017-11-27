package service;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.transaction.annotation.Transactional;

import model.Client;



public class ClientService extends GenericService<Client>{

	private static final long serialVersionUID = 2131359482422367092L;
	
	 public SessionFactory sessionFactory;

	 public void setSessionFactory(SessionFactory sessionFactory){
	     this.sessionFactory = sessionFactory;
	  }
	 
	 private List<Client> clientDataBase= new ArrayList<Client>();


	    public void addClient(Client client) {
	        //agrega el cliente en la base de datos.
	        this.clientDataBase.add(client);
	        System.out.println("cliente creado exitosamente");
	    }
	    public Client getClientByName(String name) {
	        //recupera el cliente de la base de datos
	        return this.clientDataBase.get(0);
	    }

	    public void updateClient(Client client) {
	        //actualiza el cliente en la base
	        System.out.println("se ha actualizado el cliente");

	    }


	    public void deleteClient(Client client) {
	        //elimina el cliente en la base
	        System.out.println("cliente eliminado del sistema");

	    }

	    @Transactional(readOnly = true)
	    public List<Client> retriveAll() {
	        return clientDataBase;
	        // return this.getRepository().findAll();
	    }

	}






