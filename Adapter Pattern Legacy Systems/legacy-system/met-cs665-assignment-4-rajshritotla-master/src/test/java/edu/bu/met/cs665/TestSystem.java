package edu.bu.met.cs665;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import edu.bu.met.cs665.customer.NewCustomer;
import edu.bu.met.cs665.customer.NewCustomerData;
import edu.bu.met.cs665.newsystem.UseNewSystem;

public class TestSystem {

  public TestSystem() {}

  @Test
  public void testNewCustomer() {
    NewCustomer n1 = new NewCustomer(3, "Harry", "VIP");
    assertEquals("Harry", n1.getName());
  }

  @Test
  public void testNewCustomerData() {
    NewCustomer n1 = new NewCustomer(3, "Harry", "VIP");
    NewCustomer n2 = new NewCustomer(4, "Noddy", "Regular");
    NewCustomerData newData = new NewCustomerData();
    newData.addCustomer(n1);
    newData.addCustomer(n2);
    assertEquals(2, newData.getCustomerlist().size());
  }
  
  @Test
  public void testRetrieveNewCustomerData() {
    NewCustomer n1 = new NewCustomer(3, "Harry", "VIP");
    NewCustomer n2 = new NewCustomer(4, "Noddy", "Regular");
    NewCustomerData newData = new NewCustomerData();
    newData.addCustomer(n1);
    newData.addCustomer(n2);
    assertEquals("Harry", newData.getCustomer(1).getName());
  }

  @Test
  public void testIdAllocation() {
    NewCustomer n2 = new NewCustomer(2, "Noddy", "Regular");
    assertEquals(2, n2.getId());
  }
  
  @Test
  public void testNewSystem() {
    NewCustomer n1 = new NewCustomer(3, "Harry", "VIP");
    NewCustomer n2 = new NewCustomer(4, "Noddy", "Regular");
    NewCustomerData newData = new NewCustomerData();
    newData.addCustomer(n1);
    newData.addCustomer(n2);
    UseNewSystem newSys = new UseNewSystem(newData);
    newSys.getCustomer_WithHttpsConnect(n2.getId());
    System.out.println(newSys.customer.getName());
    assertEquals("Regular", newSys.customer.getCustType());
  }

}
