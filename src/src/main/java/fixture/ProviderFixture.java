/**
 * 
 */
package fixture;

import java.util.ArrayList;
import java.util.List;

import model.Provider;


public class ProviderFixture {

	public static List<Provider> createProviders() {
		List<Provider> providers = new ArrayList<Provider>();
		providers.add(ProviderFixture.createProviders("1-234-5",10));
		providers.add(ProviderFixture.createAnotherProviders("providere1","1-11111-1","providereuno@providereuno.com"));
		providers.add(ProviderFixture.createProviders("6-789-10",20));
		providers.add(ProviderFixture.createProviders("11-121314-15",30));
		providers.add(ProviderFixture.createAnotherProviders("providere2","2-22222-2","provideredos@otroprovidereuno.com"));
		providers.add(ProviderFixture.createProviders("16-171819-20",40));
		return providers;
	}

	public static Provider createProviders(String cuit, int credit) {
		Provider provider = new Provider();
		provider.setCredit(credit);
		return provider;
	}

	public static Provider createAnotherProviders(String name, String cuit, String email) {
		Provider provider = new Provider();
		provider.setName(name);
		provider.setEmail(email);
		return provider;
	}

	
}
