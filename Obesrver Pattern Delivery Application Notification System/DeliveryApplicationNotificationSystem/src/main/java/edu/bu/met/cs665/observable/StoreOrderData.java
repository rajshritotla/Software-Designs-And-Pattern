/* Store */

package edu.bu.met.cs665.observable;

public class StoreOrderData {

  protected int storeId;

  protected String storeName;

  protected String storeAddress;

  protected String customerAddress;

  protected double rate;

  public StoreOrderData() {
    storeId = 0;
    storeName = "name";
    storeAddress = "from address";
    customerAddress = "to address";
    rate = 0.0;
  }

  public StoreOrderData(
      int storeId, String storeName, String storeAddress, String customerAddress, double rate) {
    super();
    this.storeId = storeId;
    this.storeName = storeName;
    this.storeAddress = storeAddress;
    this.customerAddress = customerAddress;
    this.rate = rate;
  }

  public int getStoreId() {
    return storeId;
  }

  public void setStoreId(int storeId) {
    this.storeId = storeId;
  }

  public String getStoreName() {
    return storeName;
  }

  public void setStoreName(String storeName) {
    this.storeName = storeName;
  }

  public String getStoreAddress() {
    return storeAddress;
  }

  public void setStoreAddress(String storeAddress) {
    this.storeAddress = storeAddress;
  }

  public String getCustomerAddress() {
    return customerAddress;
  }

  public void setCustomerAddress(String customerAddress) {
    this.customerAddress = customerAddress;
  }

  public double getRate() {
    return rate;
  }

  public void setRate(double rate) {
    this.rate = rate;
  }
}
