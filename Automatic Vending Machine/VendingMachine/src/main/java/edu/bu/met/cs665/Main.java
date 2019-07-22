package edu.bu.met.cs665;

import edu.bu.met.cs665.example1.Person;

import edu.bu.met.cs665.vendingmachine.VendingMachineController;

import org.apache.log4j.Logger;
// import org.apache.log4j.PropertyConfigurator;

public class Main {

  private static Logger logger = Logger.getLogger(Main.class);


  /**
   * A main method to run examples.
   *
   * @param args not used
   */
  public static void main(String[] args) {

    // This configuration is for setting up the log4j properties file.
    // It is better to set this using java program arguments.
    // PropertyConfigurator.configure("log4j.properties");

    // Let us create an object of the Main class.
    Main m = new Main();
    
    logger.info(m.doIt());
    logger.trace("Trace Message!");
    logger.debug("Debug Message!");
    logger.info("Info Message!");
    logger.warn("Warn Message!");
    logger.error("Error Message!");
    logger.fatal("Fatal Message!");

    System.out.println();
    System.out.println();
    System.out.println();
    
    m.callVendingController();
   
  }

  private void callVendingController() {
    VendingMachineController order = new VendingMachineController();
    /* placeOrder(int choice, int drink, int type, int milk, int sugar) */
    /* TESTS */
    order.placeOrder(1,2,2,2,1);
    order.placeOrder(1,1,1,2,3);
    order.placeOrder(1,2,1,2,4);      /* Incorrect Input for sugar */
    order.placeOrder(1,3,1,2,3);      /* Incorrect Input for drink */
    order.placeOrder(1,1,1,4,3);      /* Incorrect Input for milk */

  }

  private String doIt() {
    Person student = new Person("John", "Doe");
    return student.getLastName() + ',' + student.getLastName();
  }

}
