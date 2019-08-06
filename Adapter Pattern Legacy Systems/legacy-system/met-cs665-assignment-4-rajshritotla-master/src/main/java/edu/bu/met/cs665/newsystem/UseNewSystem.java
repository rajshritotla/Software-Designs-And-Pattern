package edu.bu.met.cs665.newsystem;

import edu.bu.met.cs665.customer.NewCustomer;
import edu.bu.met.cs665.customer.NewCustomerData;
import edu.bu.met.cs665.customer.OldCustomer;
import edu.bu.met.cs665.legacyadapteroldtonew.AdapterOldToNew;
import edu.bu.met.cs665.newsystem.CustomerDataOverHttps;

/** Class to use NEW SYSTEM. */
public class UseNewSystem implements CustomerDataOverHttps {

  protected NewCustomer customer = new NewCustomer();
  protected NewCustomerData data = new NewCustomerData();

  public UseNewSystem() {
    
  }
  
  /** Updating data in the system. */
  public UseNewSystem(NewCustomerData cd) {
    data = cd;
  }
  
  /** 
   * Print the customer retrieved by
   * getCustomer_WithHttpsConnect(int id).
   */
  @Override
  public void printCustomer() {
    this.printCustomer(customer);
  }

  /**
   * Print customer.
   * @param n New customer object
   */
  @Override
  public void printCustomer(NewCustomer n) {
    System.out.println("Using NEW system");
    System.out.println("Name: " + n.getName());
    System.out.println("Type: " + n.getCustType());
    
  }

  @Override
  public void getCustomer_WithHttpsConnect(int id) {
    System.out.println("NEW: retrieving from cloud "
        + "securely using HTTPS");
    customer = data.getCustomer(id);
  }

  @Override
  public void getCustomer_WithHttpsConnect(OldCustomer o) {
    AdapterOldToNew adapter = new AdapterOldToNew();
    adapter.adapt(o);
    this.customer = adapter.getNewCustomer();
    System.out.println("NEW system working for old..");
  }

}
