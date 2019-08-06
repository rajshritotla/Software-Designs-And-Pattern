package edu.bu.met.cs665;

import edu.bu.met.cs665.customer.NewCustomer;
import edu.bu.met.cs665.customer.NewCustomerData;
import edu.bu.met.cs665.customer.OldCustomer;
import edu.bu.met.cs665.customer.OldCustomerData;
import edu.bu.met.cs665.legacyadapteroldtonew.AdapterOldToNew;
import edu.bu.met.cs665.newsystem.UseNewSystem;
import edu.bu.met.cs665.oldsystem.UseOldSystem;

public class Main {

  /**
   * A main method to run examples.
   *
   * @param args not used
   */
  public static void main(String[] args) {
    
    /** Creating old system data. */
    OldCustomer o1 = new OldCustomer(1, "Old tom");
    OldCustomer o2 = new OldCustomer(2, "Old mickey");
    OldCustomerData oldData = new OldCustomerData();
    oldData.addCustomer(o1);
    oldData.addCustomer(o2);
    
    /** Old system instance. */
    UseOldSystem oldSys = new UseOldSystem(oldData);
    
    // Print an old customer
    oldSys.getCustomerWithUsbConnect(1);
    oldSys.printCustomer();
    
    System.out.println("-----------------"
        + "------------------------------");
        
    /** Creating new system data. */
    NewCustomer n1 = new NewCustomer(1, "Harry", "VIP");
    NewCustomer n2 = new NewCustomer(2, "Noddy", "Regular");
    NewCustomerData newData = new NewCustomerData();
    newData.addCustomer(n1);
    newData.addCustomer(n2);
    
    /** New system instance. */
    UseNewSystem newSys = new UseNewSystem(newData);
    
    // Print a new customer
    newSys.getCustomer_WithHttpsConnect(2);
    newSys.printCustomer();
    
    System.out.println("-----------------"
        + "------------------------------");
    
    // Print old customer using new system
    newSys.getCustomer_WithHttpsConnect(o1);
    newSys.printCustomer();
    
    System.out.println("-----------------"
        + "------------------------------");
    
    // Print old customer using adapter
    System.out.println("NEW system working for old.."
        + "using Adapter directly");
    AdapterOldToNew adapter = new AdapterOldToNew();
    adapter.adapt(o2);
    adapter.printUsingAdapter();
    
  }



 
}
