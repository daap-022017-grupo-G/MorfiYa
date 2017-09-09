package test_model;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;
import model.Client;


public class ClientTest {
	
/*Los clientes se deben registrar con su usuario de Google, Facebook o utilizando una
 *  cuenta propia. Los datos del registro son:*/
//CUIT [Obligatorio]
	@Test 
	public void testClientHasNoCUIT(){
		Client newClient = new Client();
		assertTrue(newClient.getCUIT().isEmpty());
	}
	
	
//Nombre [Obligatorio]
	@Test 
	public void testClientHasNoName(){
		Client newClient = new Client();
		assertTrue(newClient.getName().isEmpty());
		
	}
	
//Email [Obligatorio, Email valido]
	@Test 
	public void testClientHasNullEmail(){
		Client newClient = new Client();
		assertTrue(newClient.getEmail().isEmpty());		
	}
	
	@Test 
	public void testClientHasInvalidEmail(){
		Client newClient = new Client();
		newClient.setEmail("no tengo");
		assertFalse(newClient.getEmail().contains("@"));
	}
	
	@Test 
	public void testClientValidEmail(){
		Client newClient = new Client();
		newClient.setEmail("cliente@comprador.com");
		assertTrue(newClient.getEmail().contains("@"));		
	}

	
//Telefono [Obligatorio]
/*Los números de teléfono en Argentina tienen diez dígitos si se tienen 
 * en cuenta el código de área (indicativo interurbano) y el número de abonado, 
 * pero sin tener en cuenta el prefijo telefónico internacional.1​ Los códigos de 
 * área pueden tener 2, 3 o 4 dígitos, siendo los 6, 7 u 8 dígitos restantes el 
 * número de teléfono local.*/
	@Test 
	public void testClientHasNoTelephone(){
		Client newClient = new Client();
		assertTrue(newClient.getTelephone().isEmpty());
	}

	@Test 
	public void testClientHasInvalidTel(){
		Client newClient = new Client();
		newClient.setTelephone("0303456");
		assertFalse(newClient.getTelephone().length() == 10);		
		}
	
	@Test 
	public void testClientValidTel(){
		Client newClient = new Client();
		newClient.setTelephone("0123456789");
		assertTrue(newClient.getTelephone().length() == 10);
	}
	

//Localidad   [Obligatorio]
	@Test 
	public void testClientHasNoCity(){
		Client newClient = new Client();
		assertTrue(newClient.getCity().isEmpty());
		
	}
	
	
//Dirección	
	
	
}
