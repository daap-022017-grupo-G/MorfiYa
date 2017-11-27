package model;

import java.util.ArrayList;
import java.util.List;

import org.omg.CORBA.UserException;

import custom_exceptions.UserAlreadyExistException;




public class App {
	
	private List<Client> clients;
	private ArrayList<Provider> providers;
	private List<Menu> menus;
	

	public List<Client> getClients() {
		return clients;
	}

	public void deleteClient(int id){
		List<Client> aux = new ArrayList<Client>();
		for (Client p: clients) {
			if (p.getId() != id) {
				aux.add(p);
			}
		}
		this.clients = (ArrayList<Client>) aux;
	}
	
	public void updateClient(Client clienteActualizado){
		this.deleteClient(clienteActualizado.getId());
		this.clients.add(clienteActualizado);
		
	}

	public void setClients(ArrayList<Client> clientes) {
		this.clients = clientes;
	}
	
	public Client getClient(int idcl){
		Client aux = null; 
		for (Client p: clients) {
			if (p.getId() == idcl){
				aux = p;
			}
		}
		return aux;
	}
	
	
	public ArrayList<Provider> getProviders() {
		return providers;
	}



	public void setProviders(ArrayList<Provider> prvdrs) {
		this.providers = prvdrs;
	}
	
	
	
	
	public List<Menu> getMenus() {
		return menus;
	}



	public void setMenus(ArrayList<Menu> productos) {
		this.menus = productos;
	}
	
	



	public App(){
		this.setClients(new ArrayList<Client>());
		this.setProviders(new ArrayList<Provider>());
		this.setMenus(new ArrayList<Menu>());
		}
	
	
	public void verifyUserName(Client unCliente){
		for(Client cl : this.clients){
			if(cl.name == unCliente.name){
				throw new UserAlreadyExistException();
			}
		}
	}
	public void addClient(Client unCliente){
		
		//this.validarNombreClienteUsuario(unCliente);
		unCliente.setId(this.getClients().size());
		this.getClients().add(unCliente);
		//this.addUser(unCliente);
	}
	
	
	public void addProvider(Provider unEmpleado){
		unEmpleado.setId(this.getProviders().size());
		this.getProviders().add(unEmpleado);
		//this.addUser(unEmpleado);
	}
	
	
	public int numberOfClientes(){
		
		return this.getClients().size();
	}
	
	public int numberOfProviders(){
		
		return this.getProviders().size();
	}
	
	
	public int numberOfMenus() {
		
		return this.getMenus().size();
	}
	
	
	public void addMenu(Menu unProducto) {
		this.getMenus().add(unProducto);
		
	}
	
	public boolean availableMenu(Menu menu){
		// Menu disponible o no en la lista de menus de la aplicación.
		return this.getMenus().contains(menu);
	}
		public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}

	

	public void imprimirMenus() {
		for(Menu m : menus) {
			System.out.print("[");
			System.out.print("Description: "+ m.getDescription());
			System.out.println("]");
			
		}
		
	}

}
