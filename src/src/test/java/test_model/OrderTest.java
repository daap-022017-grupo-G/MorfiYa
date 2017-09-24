package test_model;

import model.Client;
import model.Menu;
import model.Order;
import model.Provider;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.internal.matchers.Or;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class OrderTest {
    private Provider businessman;
    private Client buyer;
    private Menu food;

    @Before
    public void setUp() {
        businessman = new Provider();
        businessman.setName("Fullop cathering");
        buyer = new Client();
        buyer.setName("anyone");
        food = new Menu();
        food.setName("empanadas");
    }


    @Test
    public void testOrderHasProvider(){
        Order order = new Order();
        order.setProvider(businessman);
        assertTrue(businessman.getName().equalsIgnoreCase("Fullop cathering"));
    }


    @Test
    public void testOrderHasClient() {
        Order order = new Order();
        order.setClient(buyer);
        assertTrue(buyer.getName().equalsIgnoreCase("anyone"));
    }


    @Test
    public void testOrderHasntMenus() {
        Order order = new Order();
        assertTrue(order.getMenus().isEmpty());
    }

    @Test
    public void testOrderContainsAMenu() {
        Order order = new Order();
        List <Menu> littleList = new ArrayList<Menu>();
        List <Menu> resultList = new ArrayList<Menu>();
        littleList.add(food);
        order.setMenus(littleList);
        resultList = order.getMenus();
        assertTrue(resultList.get(0).getName().equalsIgnoreCase("empanadas"));
    }

  /*
    @Test
    public void getTypeOfDelivery() throws Exception {
    }

    @Test
    public void setTypeOfDelivery() throws Exception {
    }

    @Test
    public void getDelivered() throws Exception {
    }

    @Test
    public void setDelivered() throws Exception {
    }

    @Test
    public void buy() throws Exception {
    }
*/
}