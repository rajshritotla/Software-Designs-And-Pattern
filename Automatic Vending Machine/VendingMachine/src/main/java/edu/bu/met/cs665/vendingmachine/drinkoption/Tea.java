package edu.bu.met.cs665.vendingmachine.drinkoption;

import edu.bu.met.cs665.vendingmachine.VendingMachineController;

public class Tea extends Beverage {

  public Tea() {
    super();
    addTypesOfBeverage();
  }

  public void inStartPrepState(int type, int milk, int sugar) {
    if (askBeverageType(type) && addMilk(milk) && addSugar(sugar)) {
      inPreparingState();
    } else {
      return;
    }
  }

  protected void inPreparingState() {
    System.out.println("Brewing your " + typesAvailable.get(orderType) + " with " + milkLevel 
        + " milk amount and " + sugarLevel + " sugar level. " + "Please wait...");
    inServingState();
  }
  
  protected void inServingState() {
    System.out.println("**** Enjoy your Tea!! ****");
    new VendingMachineController();    
  }

  /* Add types of available tea option */
  protected void addTypesOfBeverage() {
    typesAvailable.add("Black Tea");
    typesAvailable.add("Green Tea");
    typesAvailable.add("Yellow Tea");
  }

}
