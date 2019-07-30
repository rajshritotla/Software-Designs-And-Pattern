package edu.bu.met.cs665;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import edu.bu.met.cs665.emailtypes.*;

public class TestEmailGenerator {

  public TestEmailGenerator() {}
  
  @Test
  public void testSetBody() {
    NewEmail n = new NewEmail();
    assertEquals("New Email", n.getBody());
  }
  
  @Test
  public void testSetSubject() {
    NewEmail n = new NewEmail();
    assertEquals("New", n.getSubject());
  }
  
  @Test
  public void testCreateEmail() {
    EmailAdvertismentClientFactory e = new EmailAdvertismentClientFactory();
    assertEquals("Frequent", e.createEmail("frequent").getSubject());
  }
  
  @Test
  public void testBusinessEmailBySubject() {
    BusinessEmail b = new BusinessEmail();
    assertEquals("Business", b.getSubject());
  }
  
  @Test
  public void testFrequentEmailBySubject() {
    FrequentEmail f = new FrequentEmail();
    assertEquals("Frequent", f.getSubject());
  }
  
  @Test
  public void testNewEmailBySubject() {
    NewEmail n = new NewEmail();
    assertEquals("New", n.getSubject());
  }
  
  @Test
  public void testReturningEmailBySubject() {
    ReturningEmail r = new ReturningEmail();
    assertEquals("Returning", r.getSubject());
  }
  
  @Test
  public void testVipEmailBySubject() {
    VipEmail v = new VipEmail();
    assertEquals("Vip", v.getSubject());
  }
  
}
