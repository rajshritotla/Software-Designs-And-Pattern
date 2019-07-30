package edu.bu.met.cs665.emailtypes;

/** 
 * Class to generate email format for Invalid mailing list. 
 * It inherits features from TemplateEmail. <br>
 * Contains two variables: <br>
 * invalidEmailSubject : Email Subject for Invalid mailing list <br>
 * invalidEmailBody : Email Body for Invalid mailing list <br>
*/
public class InvalidEmail extends TemplateEmail {
  private String invalidEmailSubject = "Invalid";
  private String invalidEmailBody = "Invalid Email";
  
  /**
  * Set inherited subject variable to invalidEmailSubject using setSubject() method.
  * Set inherited body variable to invalidEmailBody using setBody() method.
  */
  public InvalidEmail() {
    super();
    this.setSubject(invalidEmailSubject);
    this.setBody(invalidEmailBody);
  }
  
  /**
  * Override parent class method to set behavior for Invalid mailing list.
  * General format to send email to all recipients.
  */  
  @Override
  public void sendEmail() {
    return;
  }

  /**
   * Override parent class method to set behavior for Invalid mailing list.
   * Overloaded method.
   * Send email to new recipient.
   * @param newRecipient name of new recipient
   */
  @Override
  public void sendEmail(String newRecipient) {
    System.out.println("Email sent to _" 
        + newRecipient
        + "_ Invalid RECIPIENTS");
  }

  /**
  * Override parent class method to set behavior for Invalid mailing list.
  * Adds new recipient to mailing list.
  * @param newRecipient name of new recipient
  */
  @Override
  public void addRecipient(String newRecipient) {
    System.out.println("Invalid request cannot add "
        + newRecipient
        + " to any mailing list");
  }


}
