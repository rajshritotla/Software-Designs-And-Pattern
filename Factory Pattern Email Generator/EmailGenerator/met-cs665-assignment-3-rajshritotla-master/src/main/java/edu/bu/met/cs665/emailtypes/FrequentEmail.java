package edu.bu.met.cs665.emailtypes;

/** 
 * Class to generate email format for Frequent mailing list. 
 * It inherits features from TemplateEmail. <br>
 * Contains two variables: <br>
 * frequentEmailSubject : Email Subject for Frequent mailing list <br>
 * frequentEmailBody : Email Body for Frequent mailing list <br>
*/
public class FrequentEmail extends TemplateEmail {
  private String frequentEmailSubject = "Frequent";
  private String frequentEmailBody = "Frequent Email";
  
  /**
  * Set inherited subject variable to frequentEmailSubject using setSubject() method.
  * Set inherited body variable to frequentEmailBody using setBody() method.
  */
  public FrequentEmail() {
    super();
    this.setSubject(frequentEmailSubject);
    this.setBody(frequentEmailBody);
  }

  /**
  * Override parent class method to set behavior for Frequent mailing list.
  * General format to send email to all recipients.
  */
  @Override
  public void sendEmail() {
    System.out.println("Email sent to FREQUENT RECIPIENTS");
  }

  /**
   * Override parent class method to set behavior for Frequent mailing list.
   * Overloaded method.
   * Send email to new recipient.
   * @param newRecipient name of new recipient
   */
  @Override
  public void sendEmail(String newRecipient) {
    System.out.println("Email sent to _" 
        + newRecipient
        + "_ Frequent Recipient");
  }

  /**
  * Override parent class method to set behavior for Frequent mailing list.
  * Adds new recipient to mailing list.
  * @param newRecipient name of new recipient
  */
  @Override
  public void addRecipient(String newRecipient) {
    this.recipient.add(newRecipient);
    System.out.println("Recipient _" + newRecipient 
        + "_ added to "
        + " Frequent mailing list");
  }

  

}
