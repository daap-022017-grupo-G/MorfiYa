package web.rest.post;

import java.util.ArrayList;
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
import repository.ClientRepository;


@Path("/clients")
public class ClientsRest {
	private ClientRepository clientRepository;
	
	public ClientsRest () {
		this.clientRepository = new ClientRepository(); //--
	}

    public ClientRepository getClientRepository() {
		return clientRepository;
	}

	public void setClientRepository(ClientRepository clientRepository) {
		this.clientRepository = clientRepository;
	}

	/**
     * IMPORTANTE!! - Acá deben inyectar el servicio de la aplicación y este
     * servicio REST solo debe hacer un delegate simple.
     */
    
    @GET
    @Path("/{from}")
    @Produces("application/json")
    public List<Client> findClientId(@PathParam("from") final Integer from) {
        return new ArrayList<Client>();
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
    public Integer countClientsId(@DefaultValue(StringUtils.EMPTY) @QueryParam("tag") final String tag) {
        return clientRepository.count();
    }
//
//    @GET
//    @Path("/tags")
//    @Produces("application/json")
//    public Set<String> getTagsByBlogId() {
//        return postRepository.getTags();
//    }
//
}
