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

import model.Provider;
import repository.ProviderRepository;


@Path("/providers")
public class ProvidersRest {
    public static final int NUMBER_OF_PROVIDER = 10;
	private ProviderRepository providerRepository;
	


	/**
     * IMPORTANTE!! - Acá deben inyectar el servicio de la aplicación y este
     * servicio REST solo debe hacer un delegate simple.
     */
    
    @GET
    @Path("/{from}")
    @Produces("application/json")
    public List<Provider> findProviderId(@PathParam("from") final Integer from) {
    	List<Provider> providers = providerRepository.getProviders(from, NUMBER_OF_PROVIDER, "");
        return providers;
        //return new ArrayList<Provider>();
    }

    @GET
    @Path("/providers")
    @Produces("application/json")
    public Response findAllProviders(@PathParam("id") final String id) {
        List<Provider> providers = providerRepository.findAll();
        if (providers.isEmpty()) {
            return Response.status(Response.Status.NOT_FOUND).build();
        }
        return Response.ok(providers).build();
    }

    @GET
    @Path("/count")
    @Produces("application/json")
    public Integer countProvidersId(@DefaultValue(StringUtils.EMPTY) @QueryParam("name") final String name) {
        return providerRepository.getCount(name);
    }

    public void setProviderRepository(final ProviderRepository providerDAO) {
        providerRepository = providerDAO;
    }
    
}
