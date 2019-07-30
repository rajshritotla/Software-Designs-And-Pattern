package edu.bu.met.cs665.emailtypes;

/** 
 * Class to generate email format for VIP mailing list. 
 * It inherits features from TemplateEmail.<br>
 * Contains two variables: <br>
 * vipEmailSubject : Email Subject for VIP mailing list <br>
 * vipEmailBody : Email Body for VIP mailing list <br>
*/
public class VipEmail extends TemplateEmail {

  private String vipEmailSubject = "Vip";
  private String vipEmailBody = "Vip Email";
  
  /**
   * Set inherited subject variable to vipEmailSubject using setSubject() method.
   * Set inherited body variable to vipEmailBody using setBody() method.
   */
  
  public VipEmail() {
    super();
    this.setSubject(vipEmailSubject);
    this.setBody(vipEmailBody);
  }
  
  /**
   * Override parent class method to set behavior for VIP mailing list.
   * General format to send email to all recipients.
   */
  @Override
  public void sendEmail() {
    System.out.println("Email sent to VIP RECIPIENTS");
  }

  /**
   * Override parent class method to set behavior for VIP mailing list.
   * Overloaded method.
   * Send email to new recipient.
   * @param newRecipient name of new recipient
   */
  @Override
  public void sendEmail(String newRecipient) {
    System.out.println("Email sent to _" 
        + newRecipient
        + "_ VIP Recipient");
  }

  /**
   * Override parent class method to set behavior for VIP mailing list.
   * Adds new recipient to mailing list.
   * @param newRecipient name of new recipient
  */
  @Override
  public void addRecipient(String newRecipient) {
    this.recipient.add(newRecipient);
    System.out.println("Recipient _" + newRecipient 
        + "_ added to "
        + " VIP mailing list");
  }

}
