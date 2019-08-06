package edu.bu.met.cs665.newsystem;

import edu.bu.met.cs665.customer.NewCustomer;
import edu.bu.met.cs665.customer.OldCustomer;

/** Functionalities provided by NEW system. */
public interface CustomerDataOverHttps {
  
  /**
   *  Print customer data.
   * @param n new customer object
   */
  void printCustomer(NewCustomer n);

  /**
   * Print customer data last retrieved using get function.
   * getCustomer_WithHttpsConnect(int id).
   */
  void printCustomer();
  
  /**
   *  Get customer data.
   * @param id customer ID
   */
  void getCustomer_WithHttpsConnect(int id);
  
  /**
   * Get old customer by using adapter class.
   * @param o Old customer object
   */
  void getCustomer_WithHttpsConnect(OldCustomer o);
  
}
