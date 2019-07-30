package edu.bu.met.cs665;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import edu.bu.met.cs665.observable.*;
import edu.bu.met.cs665.observer.CabDriver;
import edu.bu.met.cs665.observer.StoreOrderDeliveryObserver;

public class TestSystem {
	
	@Test
  public void testStoreObjectByName() {
		StoreOrderData store = new StoreOrderData();
		assertEquals("name", store.getStoreName());
  }
	
	
	@Test
	public void checkDriverRegister() {
		StoreOrderDeliverySystem store = new StoreOrderDeliverySystem();
		StoreOrderDeliveryObserver o = new CabDriver();
		store.registerObserver(o);
		assertEquals(1, store.getDriverList().size());
	}

	/*
	// string to object comparision not allowed
	@Test
	public void checkBikeMessage(){
		StoreOrderDeliverySystem deliverySystem = new StoreOrderDeliverySystem();
    StoreOrderDeliveryObserver bikeDriver = new BikeDriver();
    deliverySystem.registerObserver(bikeDriver);
		StoreOrderData metStoreOrder = new StoreOrderData(1, "MET", "Ara Street", "Gib Street", 10);
		String expectedOutput = "Hi [BIKER]! Order Available >> Store Name: "
		+ metStoreOrder.getStoreName()
		+ " StoreAddress/Pickup  "
		+ metStoreOrder.getStoreAddress()
		+ " Cutsomer Address/Drop "
		+ metStoreOrder.getCustomerAddress()
		+ " Payment Amount "
		+ metStoreOrder.getRate();
		assertEquals(expectedOutput,deliverySystem.setOrder(metStoreOrder));
	}
	*/
}
