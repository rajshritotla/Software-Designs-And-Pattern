package edu.bu.met.cs665.emailtypes;

/** 
 * Class to generate email format for Business mailing list. 
 * It inherits features from TemplateEmail.<br>
 * Contains two variables: <br>
 * businessEmailSubject : Email Subject for Business mailing list <br>
 * businessEmailBody : Email Body for Business mailing list <br>
*/
public class BusinessEmail extends TemplateEmail {
  
  private String businessEmailSubject = "Business";
  private String businessEmailBody = "Business Email";
  
  /**
  * Set inherited subject variable to businessEmailSubject using setSubject() method.
  * Set inherited body variable to businessEmailBody using setBody() method.
  */
  public BusinessEmail() {
    super();
    this.setSubject(businessEmailSubject);
    this.setBody(businessEmailBody);
  }
  
  /**
  * Override parent class method to set behavior for Business mailing list.
  * General format to send email to all recipients.
  */
  @Override
  public void sendEmail() {
    System.out.println("Email sent to BUSINESS RECIPIENTS");
  }

  /**
   * Override parent class method to set behavior for Business mailing list.
   * Overloaded method.
   * Send email to new recipient.
   * @param newRecipient name of new recipient
   */
  @Override
  public void sendEmail(String newRecipient) {
    System.out.println("Email sent to _" 
        + newRecipient
        + "_ BUSINESS RECIPIENTS");
  }
  
  /**
  * Override parent class method to set behavior for Business mailing list.
  * Adds new recipient to mailing list.
  * @param newRecipient name of new recipient
  */
  @Override
  public void addRecipient(String newRecipient) {
    this.recipient.add(newRecipient);
    System.out.println("Recipient _" + newRecipient 
        + "_ added to "
        + " business mailing list");
  }



}
