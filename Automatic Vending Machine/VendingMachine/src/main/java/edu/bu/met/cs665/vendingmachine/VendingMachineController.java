package edu.bu.met.cs665.vendingmachine;

import edu.bu.met.cs665.vendingmachine.drinkoption.Coffee;
import edu.bu.met.cs665.vendingmachine.drinkoption.Tea;

public class VendingMachineController {

  public VendingMachineController() {
    orderInstructions();
  }

  public void placeOrder(int choice, int drink, int type, int milk, int sugar) {
    System.out.println("               OUTPUT                ");
    System.out.println("-----------------------------------------------------------------");
    System.out.println("REQUESTED ORDER: " + choice + " " + drink + " "
        + type + " " + milk + " " + sugar);

    chooseMainFoodType(choice,drink,type,milk,sugar);
  }

  /* Eat or Drink | for now considering only beverages, 
  later input from user could be asked when more options get available */
  /* Thus choice = 1 = drink */
  private void chooseMainFoodType(int choice, int drink, int type, int milk, int sugar) {
    switch (choice) {
      case 1: {
        orderBeverage(drink,type,milk,sugar);
        break;
      }
      default:
        orderInstructions();
    }
  }

  /* Choose from Coffee or Tea */
  private void orderBeverage(int requestDrink, int type, int milk, int sugar) {
    switch (requestDrink) {
      case 1: {
        Coffee coffee = new Coffee();
        coffee.inStartPrepState(type,milk,sugar);
        break;
      }
      case 2: {
        Tea tea = new Tea();
        tea.inStartPrepState(type,milk,sugar);
        break;
      }
      default: {
        System.out.println("Beverage option unavailable");
        orderInstructions();
      }
    }
  }

  public void orderInstructions() {
    System.out.println("");
    System.out.println("-----------------------------------------------------------------");
    System.out.println("            READY FOR ORDER              ");
    System.out.println("-----------------------------------------------------------------");
    System.out.println("Enter the number with spaces for each of your choice");
    System.out.println("");
    System.out.println("I want to order [currently only DRINK "
            + "functionality available, sorry for inconvenience]");
    System.out.println("1. Drink | 2. To eat");
    System.out.println("");
    System.out.println("Enter the DRINK choice : 1. Coffee | 2. Tea");
    System.out.println("");
    System.out.println("Options for COFFEE: ");
    for (int index = 0; index < new Coffee().typesAvailable.size(); index++) {
      System.out.print(index + 1);
      System.out.print(". " + new Coffee().typesAvailable.get(index) + " | ");
    }
    System.out.println("");
    System.out.println("");
    System.out.println("Options for TEA:");
    for (int index = 0; index < new Tea().typesAvailable.size(); index++) {
      System.out.print(index + 1);
      System.out.print(". " + new Tea().typesAvailable.get(index) + " | ");
    }
    System.out.println("");
    System.out.println("");
    System.out.println("MILK choose from 0-3: "
            + "0 = 0% milk | 1 = 25% milk | 2 = 50% milk | 3 = 75% milk");
    System.out.println("");
    System.out.println("SUGAR choose from 0-3: "
            + "0 = no sugar | 1 = mild sweet | 2 = medium sweet | 3 = super sweet");
    System.out.println("-----------------------------------------------------------------");
  }
  

}
