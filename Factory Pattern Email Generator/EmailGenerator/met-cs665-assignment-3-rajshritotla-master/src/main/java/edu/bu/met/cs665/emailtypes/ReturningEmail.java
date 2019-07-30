package edu.bu.met.cs665.emailtypes;

/** 
 * Class to generate email format for Returning mailing list. 
 * It inherits features from TemplateEmail.<br>
 * Contains two variables: <br>
 * returningEmailSubject : Email Subject for Returning mailing list <br>
 * returningEmailBody : Email Body for Returning mailing list <br>
*/
public class ReturningEmail extends TemplateEmail {
  private String returningEmailSubject = "Returning";
  private String returningEmailBody = "Returning Email";
  
  /**
  * Set inherited subject variable to returningEmailSubject using setSubject() method.
  * Set inherited body variable to returningEmailBody using setBody() method.
  */
  public ReturningEmail() {
    super();
    this.setSubject(returningEmailSubject);
    this.setBody(returningEmailBody);
  }
  
  /**
  * Override parent class method to set behavior for Returning mailing list.
  * General format to send email to all recipients.
  */
  @Override
  public void sendEmail() {
    System.out.println("Email sent to RETURNING RECIPIENTS");
  }

  /**
   * Override parent class method to set behavior for Returning mailing list.
   * Overloaded method.
   * Send email to new recipient.
   * @param newRecipient name of new recipient
   */
  @Override
  public void sendEmail(String newRecipient) {
    System.out.println("Email sent to _" 
        + newRecipient
        + "_ Returning Recipient");
  }

  /**
  * Override parent class method to set behavior for Returning mailing list.
  * Adds new recipient to mailing list.
  * @param newRecipient name of new recipient
  */  
  @Override
  public void addRecipient(String newRecipient) {
    this.recipient.add(newRecipient);
    System.out.println("Recipient _" + newRecipient 
        + "_ added to "
        + " Returning mailing list");
  }

  
  
}
