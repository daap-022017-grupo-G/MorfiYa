package service;

public class GeneralService {

    private ProviderService providerService;

    private ClientService clientService;

    private MenuService menuService;

    public ProviderService getProviderService() {
        return providerService;
    }

    public ClientService getClientService() {
        return clientService;
    }

    public MenuService getMenuService(){
        return menuService;
    }

    public void setProviderService(final ProviderService providerService) {
        this.providerService = providerService;
    }

    public void setClientService(final ClientService clientService) {
        this.clientService = clientService;
    }

    public void setMenuService(final MenuService menuService){
        this.menuService= menuService;
    }

}
