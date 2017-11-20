package service;

import org.hibernate.SessionFactory;

import model.Client;



public class ClientService extends GenericService<Client>{

	private static final long serialVersionUID = 2131359482422367092L;
	
	 public SessionFactory sessionFactory;

	 public void setSessionFactory(SessionFactory sessionFactory){
	     this.sessionFactory = sessionFactory;
	  }


}


