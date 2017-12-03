package web.rest.post;


import java.util.List;

import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;

import org.apache.commons.lang.StringUtils;

import model.Client;
import model.Menu;
import repository.ClientRepository;


@Path("/clients")
public class ClientsRest {
    public static final int NUMBER_OF_CLIENT = 10;
	private ClientRepository clientRepository;
	


	/**
     * IMPORTANTE!! - Acá deben inyectar el servicio de la aplicación y este
     * servicio REST solo debe hacer un delegate simple.
     */
    
    @GET
    @Path("/{from}")
    @Produces("application/json")
    public Client findClientId(@PathParam("from") final Integer from) {
    	return clientRepository.findById(from);
        //return new ArrayList<Client>();
    }

    @GET
    @Path("/clients")
    @Produces("application/json")
    public Response findAllClients(@PathParam("id") final String id) {
        List<Client> clients = clientRepository.findAll();
        if (clients.isEmpty()) {
            return Response.status(Response.Status.NOT_FOUND).build();
        }
        return Response.ok(clients).build();
    }

    @GET
    @Path("/count")
    @Produces("application/json")
    public Integer countClientsId(@DefaultValue(StringUtils.EMPTY) @QueryParam("name") final String name) {
        return clientRepository.getCount(name);
    }

    public void setClientRepository(final ClientRepository clientDAO) {
        clientRepository = clientDAO;
    }
    
    @GET
    @Path("/Menus")
	public Response getMenu(){
    	List<Menu> menus = clientRepository.getMenus();
         if (menus.isEmpty()) {
             return Response.status(Response.Status.NOT_FOUND).build();
         }
         return Response.ok(menus).build();
	}
    
}
