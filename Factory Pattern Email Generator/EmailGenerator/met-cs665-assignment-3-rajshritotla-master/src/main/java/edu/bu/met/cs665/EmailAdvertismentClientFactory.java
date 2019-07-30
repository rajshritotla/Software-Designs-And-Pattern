package edu.bu.met.cs665;

import edu.bu.met.cs665.emailtypes.BusinessEmail;
import edu.bu.met.cs665.emailtypes.FrequentEmail;
import edu.bu.met.cs665.emailtypes.InvalidEmail;
import edu.bu.met.cs665.emailtypes.NewEmail;
import edu.bu.met.cs665.emailtypes.ReturningEmail;
import edu.bu.met.cs665.emailtypes.TemplateEmail;
import edu.bu.met.cs665.emailtypes.VipEmail;

/**
 * Implements the factory method and overides methods.
 */
public class EmailAdvertismentClientFactory implements EmailGeneratorFactory {
  
  /**
   * Create email for the type of customers or recipient received.
   * @param recipientType is the type of recipient 
   { business,frequent, invalid, new, returning, template, vip}
  * @return recipient type specific email to all recipients
  */

  @Override
  public TemplateEmail createEmail(String recipientType) {
    TemplateEmail email = null;
    
    switch (recipientType) {
    
      case "business": {
        email = new BusinessEmail();
        break;
      }
      case "frequent": {
        email = new FrequentEmail();
        break;
      }
      case "new": {
        email = new NewEmail();
        break;
      }
      case "returning": {
        email = new ReturningEmail();
        break;
      }
      case "vip": {
        email = new VipEmail();
        break;
      }  
      default: {
        System.out.println("Invalid recipient type");
        email = new InvalidEmail();
        break;
      }
      
    }
    return email;
  }
  
  /**
   * Overloaded Method of createEmail(recipientType)
   * Add a new recipient to a specific type. 
   * createEmail(recipientType) : called to generate the email format.
   * addRecipient(recipientName) : to add recipient separate method.
   * @param recipientType type of mailing list
   * @param recipientName name of the new recipient
   * @return recipient type specific email to new recipient
   */
    
  @Override
  public TemplateEmail createEmail(String recipientType, String recipientName) {
    TemplateEmail email = createEmail(recipientType);
    email.addRecipient(recipientName);
    return email;
  }
  
}
