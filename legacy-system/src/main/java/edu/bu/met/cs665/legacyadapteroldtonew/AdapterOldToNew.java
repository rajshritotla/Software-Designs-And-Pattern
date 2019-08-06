package edu.bu.met.cs665.legacyadapteroldtonew;

import edu.bu.met.cs665.customer.NewCustomer;
import edu.bu.met.cs665.customer.OldCustomer;
import edu.bu.met.cs665.newsystem.UseNewSystem;



public class AdapterOldToNew extends NewCustomer {
  
  /**
   * The new customer we create from old customer variable.
   * Customer here are objects of their respective system.
   */
  private NewCustomer newCustomer;
  
  /** 
   * Constructor for newCustomer instantiation.
   */
  public AdapterOldToNew() {
    newCustomer = new NewCustomer();
  }
  
  /**
   * Gettter method.
   * @return newCustomer New Customer object
   */
  public NewCustomer getNewCustomer() {
    return newCustomer;
  }
 
  /**
   * Set customer type for old system to NA as it’s the feature of new system.
   * @param custType Customer Type
   */
  @Override
  public void setCustType(String custType) {
    
    System.out.println();
    System.out.println("Log: Invalid! "
        + "OLD system didn't supported customer type"
        + ", create new copy in NEW system");
    System.out.println();
    
    // Change done by adapter
    newCustomer.setCustType(custType);
  }
  
  /**
   * Adapter method.
   * @param o Old customer to be converted to New
   */
  public void adapt(OldCustomer o) {
    this.newCustomer.setId(o.getId());
    this.newCustomer.setName(o.getName());
    
    // Change done by adapter
    this.setCustType("NA");
  }
  
  /**
   * Print the new customer or system object created.
   */
  public void printUsingAdapter() {
    UseNewSystem sys = new UseNewSystem();
    sys.printCustomer(newCustomer);
  }
  
  
  
}
