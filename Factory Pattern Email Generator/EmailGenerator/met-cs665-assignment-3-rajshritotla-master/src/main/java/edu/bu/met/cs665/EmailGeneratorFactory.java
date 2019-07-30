package edu.bu.met.cs665;

import edu.bu.met.cs665.emailtypes.TemplateEmail;

/** This interface signifies the Creator, declaration of factory method.  */
public interface EmailGeneratorFactory {
  
  /**
   * Create email for the type of customers or recipient received.
   * @param recipientType is the type of recipient 
     { business,frequent, invalid, new, returning, template, vip}
   * @return recipient type specific email to all recipients
   */

  public TemplateEmail createEmail(String recipientType);
  
  /**
   * Add a new recipient to a specific type.
   * @param recipientType is the type of mailing list
   * @param recipientName name of the new recipient
   * @return recipient type specific email to new recipient
   */
  
  public TemplateEmail createEmail(String recipientType, String recipientName);
  
}
