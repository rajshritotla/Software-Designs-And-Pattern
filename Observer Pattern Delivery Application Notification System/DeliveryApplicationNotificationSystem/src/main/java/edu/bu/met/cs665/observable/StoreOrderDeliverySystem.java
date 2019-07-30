package edu.bu.met.cs665.observable;

import edu.bu.met.cs665.observer.StoreOrderDeliveryObserver;
import java.util.ArrayList;
import java.util.List;

public class StoreOrderDeliverySystem implements StoreOrderDeliverySubject {

  private StoreOrderData order = new StoreOrderData();

  private List<StoreOrderDeliveryObserver> driverList = new ArrayList<StoreOrderDeliveryObserver>();

  public StoreOrderData getOrder() {
    return order;
  }

  public void setOrder(StoreOrderData order) {
    this.order = order;

    notifyObservers();
  }

  @Override
  public void registerObserver(StoreOrderDeliveryObserver o) {
    driverList.add(o);
  }

  @Override
  public void removeObserver(StoreOrderDeliveryObserver o) {
    driverList.remove(o);
  }

  @Override
  public void notifyObservers() {
    for (StoreOrderDeliveryObserver driver : driverList) {
      driver.update(
          order.getStoreName(),
          order.getStoreAddress(),
          order.getCustomerAddress(),
          order.getRate());
    }
  }

  public List<StoreOrderDeliveryObserver> getDriverList() {
    return driverList;
  }
}
