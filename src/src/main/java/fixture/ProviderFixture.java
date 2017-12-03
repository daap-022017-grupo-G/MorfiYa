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
		providers.add(ProviderFixture.createBasicProvider("1-234-5",10));
		providers.add(ProviderFixture.createCompleteProvider("providere1","1-11111-1","providereuno@providereuno.com"));
		providers.add(ProviderFixture.createBasicProvider("6-789-10",20));
		providers.add(ProviderFixture.createBasicProvider("11-121314-15",30));
		providers.add(ProviderFixture.createCompleteProvider("providere2","2-22222-2","provideredos@otroprovidereuno.com"));
		providers.add(ProviderFixture.createBasicProvider("16-171819-20",40));
		return providers;
	}

	public static Provider createBasicProvider(String cuit, int credit) {
		Provider provider = new Provider();
		provider.setCredit(credit);
		return provider;
	}

	public static Provider createCompleteProvider(String name, String cuit, String email) {
		Provider provider = new Provider();
		provider.setName(name);
		provider.setEmail(email);
		return provider;
	}

	
}
