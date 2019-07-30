package edu.bu.met.cs665.emailtypes;

import java.util.ArrayList;
import java.util.List;

/**
 * Abstract class for the Product of factory method.
 * Creator class EmailGeneratorFractory creates its object.
 */

public abstract class TemplateEmail {
    
  protected String subject;
  protected String body;
  
  protected List<String> recipient = new ArrayList<String>();
  
  public TemplateEmail() {
    body = "body";
    subject = "subject";
  }

  /**
   * To get the email subject.
   * @return email subject
   */
  public String getSubject() {
    return subject;
  }

  /**
   * To set the subject for the email.
   * @param subject email subject
   */
  public void setSubject(String subject) {
    this.subject = subject;
  }

  /**
   * To get the email content.
   * @return email content
   */
  public String getBody() {
    return body;
  }

  /**
   * To set email body or content.
   * @param body email content
   */
  public void setBody(String body) {
    this.body = body;
  }

  /**
   * To get recipients for each mailing list.
   * @return lists of recipient
   */
  public List<String> getRecipient() {
    return recipient;
  }

  /**
   * Not being used in this application but could used be used later to set recipient.
   * @param recipient lists of recipient to be added or updated
   */
  public void setRecipient(List<String> recipient) {
    this.recipient = recipient;
  }

  /**
   * General method to send email.
   */
  public void sendEmail() {
    System.out.println("Email Sent");
  }  

  /**
   * Overloaded method.
   * Send email to new recipient.
   * @param newRecipient name of new recipient
   */
  public void sendEmail(String newRecipient) {
    System.out.println("Email Sent to " + newRecipient);
  }  

  /**
   * Adds new recipient to mailing list.
   * @param newRecipient name of new recipient
   */
  public void addRecipient(String newRecipient) {
    this.recipient.add(newRecipient);
  } 
  
}
