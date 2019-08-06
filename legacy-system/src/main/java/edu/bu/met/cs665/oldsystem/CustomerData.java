package edu.bu.met.cs665.oldsystem;

import edu.bu.met.cs665.customer.OldCustomer;

/** Functionalities provided by OLD system. */
public interface CustomerData {
  
  /**
   *  Print customer data.
   * @param c customer data
   */  
  void printCustomer(OldCustomer c);
  
  /**
   * Print customer data last retrieved using get function.
   * OldCustomer getCustomerWithUsbConnect(int id);
   */
  void printCustomer();
  
  /**
   *  Get customer data by id.
   * @param id  customer id
   */
  void getCustomerWithUsbConnect(int id);

}
