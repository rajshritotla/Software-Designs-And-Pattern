package edu.bu.met.cs665.emailtypes;

/** 
 * Class to generate email format for New mailing list. 
 * It inherits features from TemplateEmail. <br>
 * Contains two variables: <br>
 * newEmailSubject : Email Subject for New mailing list <br>
 * newEmailBody : Email Body for New mailing list <br>
*/
public class NewEmail extends TemplateEmail {
  private String newEmailSubject = "New";
  private String newEmailBody = "New Email";
  
  /**
  * Set inherited subject variable to newEmailSubject using setSubject() method.
  * Set inherited body variable to newEmailBody using setBody() method.
  */
  public NewEmail() {
    super();
    this.setSubject(newEmailSubject);
    this.setBody(newEmailBody);
  }

  /**
  * Override parent class method to set behavior for New mailing list.
  * General format to send email to all recipients.
  */
  @Override
  public void sendEmail() {
    System.out.println("Email sent to NEW RECIPIENTS");
  }

  /**
   * Override parent class method to set behavior for New mailing list.
   * Overloaded method.
   * Send email to new recipient.
   * @param newRecipient name of new recipient
   */
  @Override
  public void sendEmail(String newRecipient) {
    System.out.println("Email sent to _" 
        + newRecipient
        + "_ New Recipient");
  }

  /**
  * Override parent class method to set behavior for New mailing list.
  * Adds new recipient to mailing list.
  * @param newRecipient name of new recipient
  */  
  @Override
  public void addRecipient(String newRecipient) {
    this.recipient.add(newRecipient);
    System.out.println("Recipient _" + newRecipient 
        + "_ added to "
        + " new recipient mailing list");
  }

 

  
}
