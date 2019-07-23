package edu.bu.met.cs665;

import edu.bu.met.cs665.observable.StoreOrderData;
import edu.bu.met.cs665.observable.StoreOrderDeliverySystem;
import edu.bu.met.cs665.observer.BikeDriver;
import edu.bu.met.cs665.observer.CabDriver;
import edu.bu.met.cs665.observer.Driver;
import edu.bu.met.cs665.observer.StoreOrderDeliveryObserver;

public class Main {

  /**
   * A main method to run examples.
   *
   * @param args not used
   */
  public static void main(String[] args) {

    /* Delivery System | Publisher */
    StoreOrderDeliverySystem deliverySystem = new StoreOrderDeliverySystem();

    /* Observables */
    StoreOrderDeliveryObserver driver1 = new Driver();
    StoreOrderDeliveryObserver cabDriver1 = new CabDriver();
    StoreOrderDeliveryObserver bikeDriver1 = new BikeDriver();
    StoreOrderDeliveryObserver cabDriver2 = new CabDriver();
    StoreOrderDeliveryObserver bikeDriver2 = new BikeDriver();

    /* Register Observable*/
    deliverySystem.registerObserver(driver1);
    deliverySystem.registerObserver(cabDriver1);
    deliverySystem.registerObserver(bikeDriver1);
    deliverySystem.registerObserver(cabDriver2);
    deliverySystem.registerObserver(bikeDriver2);

    /* Stores */
    // StoreOrderData(int storeId, String storeName, String storeAddress,
    //                 String customerAddress, double rate)
    StoreOrderData metStoreOrder = new StoreOrderData(1, "MET", "Ara Street", "Gib Street", 10);
    StoreOrderData casStoreOrder = new StoreOrderData(2, "CAS", "Som Street", "Ding Street", 5);

    /* Place order through deliver system */
    System.out.println("----------------- ORDER 1 -----------------");
    deliverySystem.setOrder(metStoreOrder);

    System.out.println();

    /* Removing few Observers*/
    deliverySystem.removeObserver(driver1);
    deliverySystem.removeObserver(cabDriver2);
    deliverySystem.removeObserver(bikeDriver2);
    System.out.println(
        "----------------- " + "ORDER 2 AFTER REMOVING 3 OBSERVERS -----------------");
    deliverySystem.setOrder(casStoreOrder);
  }
}
