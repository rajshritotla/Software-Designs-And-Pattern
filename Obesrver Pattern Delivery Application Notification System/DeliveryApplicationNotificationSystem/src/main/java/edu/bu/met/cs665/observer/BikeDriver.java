package edu.bu.met.cs665.observer;

public class BikeDriver extends Driver {

  @Override
  public void orderDetailMessage() {
    System.out.println();
    System.out.println(
        "Hi [BIKER]! Order Available >> Store Name: "
            + this.orderStoreName
            + " StoreAddress/Pickup  "
            + this.pickupAddress
            + " Cutsomer Address/Drop "
            + this.dropAddress
            + " Payment Amount "
            + this.orderRate);
  }
}
