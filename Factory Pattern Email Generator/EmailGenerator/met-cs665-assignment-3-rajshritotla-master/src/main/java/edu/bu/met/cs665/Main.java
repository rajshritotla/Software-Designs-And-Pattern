package edu.bu.met.cs665;

import edu.bu.met.cs665.emailtypes.TemplateEmail;

public class Main {
  /**
   * A main method to run examples.
   *
   * @param args not used
   */
  
  public static void main(String[] args) {
    
    EmailGeneratorFactory emailGenerator = new EmailAdvertismentClientFactory();
    
    System.out.println();
    
    /* Business Email */
    TemplateEmail businessEmail = emailGenerator.createEmail("business");
    System.out.println("Subject:    " 
        + businessEmail.getSubject());
    System.out.println("Email Body: " 
        + businessEmail.getBody());
    businessEmail.sendEmail();

    System.out.println();
    /* Adding new recipient to business mailing list */
    businessEmail = emailGenerator.createEmail("business","krishna");
    businessEmail.sendEmail("krishna");

    System.out.println();
    /* Frequent Recipients Email */
    TemplateEmail frequentEmail = emailGenerator.createEmail("frequent");
    System.out.println("Subject:    " 
        + frequentEmail.getSubject());
    System.out.println("Email Body: " 
        + frequentEmail.getBody());
    frequentEmail.sendEmail();
    
    System.out.println();
    /* New Recipient Email */
    TemplateEmail newEmail = emailGenerator.createEmail("new");
    System.out.println("Subject:    " 
        + newEmail.getSubject());
    System.out.println("Email Body: " 
        + newEmail.getBody());
    newEmail.sendEmail();
    
    System.out.println();
    /* Returning email */
    TemplateEmail returningEmail = emailGenerator.createEmail("returning");
    System.out.println("Subject:    " 
        + returningEmail.getSubject());
    System.out.println("Email Body: " 
        + returningEmail.getBody());
    returningEmail.sendEmail();

    System.out.println();
    /* Adding new recipient to returning mailing list */
    returningEmail = emailGenerator.createEmail("returning","radha");
    returningEmail.sendEmail("radha");
    
    System.out.println();
    /* VIP email */
    TemplateEmail vipEmail = emailGenerator.createEmail("vip");
    System.out.println("Subject:    " 
        + vipEmail.getSubject());
    System.out.println("Email Body: " 
        + vipEmail.getBody());
    vipEmail.sendEmail();

    System.out.println();
    /* Invalid or not defined email recipient type */
    TemplateEmail anyEmail = emailGenerator.createEmail("anything"); 
    System.out.println("Subject:    " 
        + anyEmail.getSubject());
    
    System.out.println();
    /* super doesn't exist so should give error */
    anyEmail = emailGenerator.createEmail("super","henry"); 
    System.out.println("Subject:    " 
        + anyEmail.getSubject());
    

  }


}
