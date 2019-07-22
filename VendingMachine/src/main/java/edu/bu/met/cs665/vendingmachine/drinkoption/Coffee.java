package edu.bu.met.cs665.vendingmachine.drinkoption;

import edu.bu.met.cs665.vendingmachine.VendingMachineController;

public class Coffee extends Beverage {

  public Coffee() {
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
    System.out.println("**** Enjoy your Coffee!! ****");
    new VendingMachineController();
  }

  /* Add types of available coffee option */
  protected void addTypesOfBeverage() {
    typesAvailable.add("Espresso");
    typesAvailable.add("Americano");
    typesAvailable.add("Latte Macchiato");
  }


}
