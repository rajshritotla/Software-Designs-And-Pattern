package edu.bu.met.cs665.customer;

import java.util.ArrayList;
import java.util.List;

public class OldCustomerData {
  
  private List<OldCustomer> customerlist = new ArrayList<OldCustomer>();

  public void addCustomer(OldCustomer c) {
    customerlist.add(c);
  }
  
  public OldCustomer getCustomer(int customerID) {
    if (customerID < 1) {
      return null;
    }
    return customerlist.get(customerID - 1);
  }

  public List<OldCustomer> getCustomerlist() {
    return customerlist;
  }

  public void setCustomerlist(List<OldCustomer> customerlist) {
    this.customerlist = customerlist;
  }
}
