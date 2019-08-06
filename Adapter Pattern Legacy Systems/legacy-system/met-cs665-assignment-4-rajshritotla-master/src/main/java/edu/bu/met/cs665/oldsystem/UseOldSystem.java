package edu.bu.met.cs665.oldsystem;

import edu.bu.met.cs665.customer.OldCustomer;
import edu.bu.met.cs665.customer.OldCustomerData;

public class UseOldSystem implements CustomerData {

  protected OldCustomer customer = new OldCustomer();
  protected OldCustomerData data = new OldCustomerData();
  
  public UseOldSystem(OldCustomerData list) {
    data = list;
  }
  
  
  @Override
  public void getCustomerWithUsbConnect(int id) {
    System.out.println("OLD: Plug in USB, check."
        + " Getting data from disk.");
    customer = data.getCustomer(id);
    
  }
  
  @Override
  public void printCustomer() {
    this.printCustomer(customer);
  }

  @Override
  public void printCustomer(OldCustomer c) {
    System.out.println("Using OLD system");
    System.out.println("Name: " + c.getName());
  }
  
  

}
