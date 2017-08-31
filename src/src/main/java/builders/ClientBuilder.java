package builders;

import java.util.Optional;

import custom_exceptions.IncompleteBuildException;
import model.Client;

public class ClientBuilder {
	/*CUIT [Obligatorio]
	 *Nombre y Apellido  [Obligatorio]
	 *Email [Obligatorio, Email valido]
	 *Telefono [Obligatorio]
	 *Localidad y Dirección  [Obligatorio] 
	 */
	
	private Optional<String> cuit;
	private Optional<String> nameAndSurname;
	private Optional<String> email;
	private Optional<String> telephone;
	private Optional<String> address;

	
	public ClientBuilder() {}
	
	public ClientBuilder setCuit(String cuit) {
		this.cuit = Optional.of(cuit);
		return this;
	}
	public ClientBuilder setNameAndSurname(String nameAndSurname) {
		this.nameAndSurname = Optional.of(nameAndSurname);
		return this;
	}
	public ClientBuilder setEmail(String email) {
		this.email = Optional.of(email);
		return this;
	}
	public ClientBuilder setTelefono(String telephone) {
		this.telephone = Optional.of(telephone);
		return this;
	}
	public ClientBuilder setAddress(String address) {
		this.address = Optional.of(address);
		return this;
	}
	
	public Client build() {
		Client client = new Client();
		client.setCUIT(this.cuit.orElseThrow(() -> new IncompleteBuildException("The Client doesn't have cuit")));
		client.setName(this.nameAndSurname.orElseThrow(() -> new IncompleteBuildException("The Client doesn't have name")));
		client.setEmail(this.email.orElseThrow(() -> new IncompleteBuildException("The Client doesn't have email")));
		client.setTelephone(this.telephone.orElseThrow(() -> new IncompleteBuildException("The Client doesn't have telephone")));
		client.setAddress(this.address.orElseThrow(() -> new IncompleteBuildException("The Client doesn't have address")));
		return client;
	}
	
	
}
