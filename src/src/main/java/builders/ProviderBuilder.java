package builders;

import java.util.Optional;

import custom_exceptions.BuildIncompletaException;
import model.Provider;

public class ProviderBuilder {
	
	//Obligatorio
	private Optional<String> logo;
	private Optional<String> description;
	
	//Opcional
	private Optional<String> URL;
	private Optional<String> deliveryArea;
	
	public ProviderBuilder() {
		this.logo 			= Optional.empty();
		this.description	= Optional.empty();
		this.URL 			= Optional.empty();
		this.deliveryArea	= Optional.empty();
	}
	
	
	public ProviderBuilder setLogo(String logo){
		this.logo = Optional.of(logo);
		return this;
		
	}
	
	public ProviderBuilder setDescripcion(String description){
		this.description = Optional.of(description);
		return this;
	}
	
	public ProviderBuilder setURL(String URL){
		this.URL = Optional.of(URL);
		return this;
	}

	public ProviderBuilder setdeliveryArea(String deliveryArea){
		this.deliveryArea = Optional.of(deliveryArea);
		return this;
	}
	public Provider build() {
		this.logo.orElseThrow(() -> new BuildIncompletaException("Le falta setear el logo al provider"));
		Provider provider = new Provider();
		provider.setLogo(logo.get());
		return provider;
	}
}
