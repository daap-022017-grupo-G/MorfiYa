package service;

import model.Provider;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

public class ProviderService extends GenericService<Provider> {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private List<Provider> providerDataBase= new ArrayList<Provider>();


    public void addProvider(Provider provider) {
        //agrega el Proveedor en la base de datos.
        this.providerDataBase.add(provider);
        System.out.println("proveedor creado exitosamente");
    }
    public Provider getProviderByName(String name) {
        //recupera el proveedor de la base de datos
        return this.providerDataBase.get(0);
    }

    public void updateProvider(Provider provider) {
        //actualiza el proveedor en la base
        System.out.println("se ha actualizado el proveedor");

    }


    public void deleteProvider(Provider provider) {
        //elimina el proveedor en la base
        System.out.println("proveedor eliminado del sistema");

    }

    @Transactional(readOnly = true)
    public List<Provider> retriveAll() {
        return providerDataBase;
        // return this.getRepository().findAll();
    }

}
