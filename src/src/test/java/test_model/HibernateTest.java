package test_model;


import model.Client;
import org.junit.Assert;
import org.junit.Test;
import service.ClientService;

//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration({ "/META-INF/spring-persistence-context.xml", "/META-INF/spring-services-context.xml" })

public class HibernateTest{
//    @Autowired
    private ClientService clientService = new ClientService();

    @Test
    public void testSave() {
    	clientService.addClient(new Client());
        Assert.assertEquals(1, clientService.retriveAll());
    }

}
