package edu.bu.met.cs665.customer;

/**
 * Class defining Customer object features.
 */
public class Customer {
  
  /**
   * Every customer have a unique id.
   */
  protected int id;

  /**
   * Customer name.
   */
  protected String name;
  
  /** Empty constructor. */
  public Customer(){    
  }

  /** Constructor to explicit set value for this application. */
  public Customer(int id, String name) {
    this.id = id;
    this.name = name;
  }
  
  /**
   * Getter function customer id.
   * @return id 
   */
  public int getId() {
    return id;
  }

  /**
   * Setter function customer id.
   * @param custId 
   */
  public void setId(int custId) {
    id = custId;
  }

  /**
   * Getter function customer name.
   * @return name 
   */
  public String getName() {
    return name;
  }

  /**
   * Setter function.
   * @param name customer 
   */
  public void setName(String name) {
    this.name = name;
  }
  
  

}
