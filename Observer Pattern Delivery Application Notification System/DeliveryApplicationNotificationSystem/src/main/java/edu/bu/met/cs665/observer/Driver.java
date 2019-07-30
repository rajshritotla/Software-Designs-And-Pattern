package edu.bu.met.cs665.observer;

public class Driver implements StoreOrderDeliveryObserver, StoreOrderDetails {

  protected String orderStoreName;
  protected String pickupAddress;
  protected String dropAddress;
  protected double orderRate;

  @Override
  public void update(
      String orderStoreName,
      String orderStoreAddress,
      String orderCustomerAddress,
      double orderRate) {

    this.orderStoreName = orderStoreName;
    this.pickupAddress = orderStoreAddress;
    this.dropAddress = orderCustomerAddress;
    this.orderRate = orderRate;

    this.orderDetailMessage();
  }

  @Override
  public void orderDetailMessage() {
    System.out.println();
    System.out.println(
        "Hello! [D] Order Available >>  Store Name: "
            + this.orderStoreName
            + " StoreAddress/Pickup  "
            + this.pickupAddress
            + " Cutsomer Address/Drop "
            + this.dropAddress
            + " Payment Amount "
            + this.orderRate);
  }
}
