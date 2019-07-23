/* Observer */

package edu.bu.met.cs665.observer;

public interface StoreOrderDeliveryObserver {

  public void update(
      String orderStoreName,
      String orderStoreAddress,
      String orderCustomerAddress,
      double orderRate);
      
}
