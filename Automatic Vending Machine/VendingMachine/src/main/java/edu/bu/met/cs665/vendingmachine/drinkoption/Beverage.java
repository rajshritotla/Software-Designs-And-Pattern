package edu.bu.met.cs665.vendingmachine.drinkoption;

import edu.bu.met.cs665.vendingmachine.VendingMachineController;

import java.util.ArrayList;

public class Beverage {

  public ArrayList<String> typesAvailable = new ArrayList<String>(); /* type of beverages */
  public int orderType; /* type that user choose among all available types */
  public int milkLevel;
  public int sugarLevel;
  
  
  public Beverage() {
    orderType = 0;
    milkLevel = 0;
    sugarLevel = 0;
  }

  public void inStartPrepState(int type, int milk, int sugar) {
  }

  protected void inServingState() {

  }

  protected void inPreparingState() {
  }

  protected void addTypesOfBeverage(){
    
  }

  /* return boolean true for valid orders */
  protected boolean addMilk(int milkLevel) {
    if ((milkLevel < 0) || (milkLevel > 3)) {
      System.out.println("Incorrect milk amount chosen");
      new VendingMachineController();
      return false;
    }
    this.milkLevel = milkLevel;
    return true;
  }

  protected boolean addSugar(int sugarLevel) {
    if ((sugarLevel < 0) || (sugarLevel > 3)) {
      System.out.println("Incorrect sugar amount  chosen");
      new VendingMachineController();
      return false;
    }
    this.sugarLevel = sugarLevel;
    return true;
    
  }

  protected boolean askBeverageType(int orderType) {
    if ((orderType < 0) || (orderType > (typesAvailable.size() - 1))) {
      System.out.println("Incorrect type option choosen");
      new VendingMachineController();
      return false;
    }
    return true;
  }
  
}
