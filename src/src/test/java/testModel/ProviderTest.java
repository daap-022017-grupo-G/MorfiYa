package testModel;

import org.junit.Test;

import model.Provider;


public class ProviderTest {
/*Los proveedores podrán subir su negocio/servicio para que los clientes puedan comprarlo. Un servicio se carga con los siguientes datos:*/
	
//Nombre [Obligatorio]
	@Test 
	public void testProviderHasNoName(){
		Provider newProvider = new Provider();
		assert (newProvider.getName().isEmpty());
		
	}
	
	
	
//Logo [Obligatorio]
	@Test 
	public void testProviderHasNoLogo(){
		Provider newProvider = new Provider();
		assert (newProvider.getLogo().isEmpty());
		
	}
	

//Localidad   [Obligatorio]
	@Test 
	public void testProviderHasNoCity(){
		Provider newProvider = new Provider();
		assert (newProvider.getCity().isEmpty());
		
	}
	
	
//Dirección y Ubicación en un mapa (Google Maps preferentemente) [Obligatorio]

	
	
	

//Descripción del tipo de servicio o productos que brinda [Obligatorio,30<=X<=200]]
	@Test 
	public void testProviderHasNoDescription(){
		Provider newProvider = new Provider();
		assert (newProvider.getDescription().isEmpty());
	}
	
	@Test 
	public void testProviderHasNoEnoughtDescription(){
		Provider newProvider = new Provider();
		newProvider.setDescription("insuficiente");
		assert (newProvider.getDescription().length() < 30);		
	}
	
	@Test 
	public void testProviderHasTooEnoughtDescription(){
		String verso = "los productos que les ofrezco son de una calidad inigualable por lo " 
				+ "que les aseguro que tomara una sabia decision el haber elegido productos "
				+ "marca cuchuflito que cuidan su bolsillo";
		Provider newProvider = new Provider();
		newProvider.setDescription(verso);
		assert (newProvider.getDescription().length() > 200);		
	}
	
	@Test 
	public void testProviderHasJustEnoughtDescription(){
		Provider newProvider = new Provider();
		newProvider.setDescription("servicio de lunch para empresas, fiestas y eventos especiales");
		Integer longitud = newProvider.getDescription().length();
		assert (longitud > 29 && longitud < 201);		
	}
	
//Dirección de sitio web o dirección de facebook
	
	
	
	
//Email [Obligatorio, Email valido]
	@Test 
	public void testProviderHasNullEmail(){
		Provider newProvider = new Provider();
		assert newProvider.getEmail().isEmpty();		
	}
	
	@Test 
	public void testProviderHasInvalidEmail(){
		Provider newProvider = new Provider();
		newProvider.setEmail("no tengo");
		assert (newProvider.getEmail().contains("@") == false);
	}
	
	@Test 
	public void testProviderValidEmail(){
		Provider newProvider = new Provider();
		newProvider.setEmail("ventas@puestodechorygourmet.com");
		assert (newProvider.getEmail().contains("@"));		
	}
	
//Teléfono de contacto [Obligatorio, Teléfono válido, +Característica]
/*Los números de teléfono en Argentina tienen diez dígitos si se tienen 
 * en cuenta el código de área (indicativo interurbano) y el número de abonado, 
 * pero sin tener en cuenta el prefijo telefónico internacional.1​ Los códigos de 
 * área pueden tener 2, 3 o 4 dígitos, siendo los 6, 7 u 8 dígitos restantes el 
 * número de teléfono local.*/
	@Test 
	public void testProviderHasNoTelephone(){
		Provider newProvider = new Provider();
		assert (newProvider.getTelephone().isEmpty());
	}

	@Test 
	public void testProviderHasInvalidTel(){
		Provider newProvider = new Provider();
		newProvider.setTelephone("0303456");
		assert (newProvider.getTelephone().length() != 10);		
	}
	
	@Test 
	public void testProviderValidTel(){
		Provider newProvider = new Provider();
		newProvider.setTelephone("0123456789");
		assert (newProvider.getTelephone().length() == 10);
	}
	
//Horario y días de atención [Obligatorio]
	
	
//Localidad de Entregas

}
