package builders;


public class ProviderBuilder {
	
	//Obligatorio
	private String logo;
	private String description;
	
	//Opcional
	private String URL;
	private String deliveryArea;
	
	public ProviderBuilder() {
	}
	
	
	public ProviderBuilder setLogo(String logo){
		this.logo = logo;
		return this;
		
	}
	
	public ProviderBuilder setDescripcion(String description){
		this.description = description;
		return this;
	}
	
	public ProviderBuilder setURL(String URL){
		this.URL = URL;
		return this;
	}

	public ProviderBuilder setdeliveryArea(String deliveryArea){
		this.deliveryArea = deliveryArea;
		return this;
	}
	
}
