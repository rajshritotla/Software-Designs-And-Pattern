package edu.bu.met.cs665.customer;

import java.util.ArrayList;
import java.util.List;

/**  */
public class NewCustomerData {
  
  private static final int totalOldData = 2; 
  
  private List<NewCustomer> customerlist = new ArrayList<NewCustomer>();

  public void addCustomer(NewCustomer c) {
    customerlist.add(c);
  }
  
  public NewCustomer getCustomer(int customerID) {
    if (customerID < 1) {
      return null;
    }
    return customerlist.get(customerID - totalOldData);
  }

  public List<NewCustomer> getCustomerlist() {
    return customerlist;
  }

  public void setCustomerlist(List<NewCustomer> customerlist) {
    this.customerlist = customerlist;
  }
}
