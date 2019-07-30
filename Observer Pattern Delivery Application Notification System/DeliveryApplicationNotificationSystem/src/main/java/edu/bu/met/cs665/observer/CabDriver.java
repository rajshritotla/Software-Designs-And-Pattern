package edu.bu.met.cs665.observer;

public class CabDriver extends Driver {

  @Override
  public void orderDetailMessage() {
    System.out.println();
    System.out.println(
        "Hello [CABBIE]! Order Available >> Store Name: "
            + this.orderStoreName
            + " StoreAddress/Pickup  "
            + this.pickupAddress
            + " Cutsomer Address/Drop "
            + this.dropAddress
            + " Payment Amount "
            + this.orderRate);
  }
}
