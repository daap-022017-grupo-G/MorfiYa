package test_model;


import model.Client;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import service.ClientService;

import java.io.Serializable;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({ "/META-INF/spring-persistence-context.xml", "/META-INF/spring-services-context.xml" })

public class HibernateTest{
    @Autowired
    private ClientService clientService;

    @Test
    public void testSave() {
        clientService.addClient(new Client());
        Assert.assertEquals(1, clientService.retriveAll());
    }

}
