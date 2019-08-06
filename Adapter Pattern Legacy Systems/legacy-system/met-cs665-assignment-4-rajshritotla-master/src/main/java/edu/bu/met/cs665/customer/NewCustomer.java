package edu.bu.met.cs665.customer;

/**
 * Class defining NEW SYSTEM Customer object features.
 */
public class NewCustomer extends Customer {
  
  /** Customer type. */
  private String custType;

  public NewCustomer() {
    super();
  }
  
  public NewCustomer(int id, String name, String type) {
    super(id, name);
    custType = type;
  }

  /**
   * Getter Method Customer Type.
   * @return custType
   */
  public String getCustType() {
    return custType;
  }

  /**
   * Setter Method Customer Type.
   * @param type Customer Type
   */
  public void setCustType(String type) {
    custType = type;
  }

  
}
