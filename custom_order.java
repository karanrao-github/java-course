// Code for Beginning Java's Cake & Cupcake Shop Tutorial

import java.util.Scanner; // Needed for the Scanner class to read input

public class custom_order {

  // STEP 1 PRINTING HELLO WORLD TO CONSOLE
  public static void main(String[] args) {

    System.out.println("Hello World!"); // print Hello World to console

    // TEST CODE

    // STEP 2 CREATE A SCANNER OBEJCT, DECLARE VARAIBLES, & PRINT STATEMENTS
    Scanner keyboard = new Scanner(System.in);

    String firstName; // User's First Name
    String itemOrder; // Item Ordered
    String frostingType; // Frosting Ordered
    String fillingType; // Filling Ordered
    String toppings; // Toppings Ordered
    String input; // User Input

    double cost = 15.00; // Cost of cake and cupcakes
    final double TAX_RATE = .08; // Sales tax rate
    double tax; // Amount of tax

    // Introduce shop and prompt user to input first name
    System.out.println("Welcome to Java's Cake and Cupcake Shop!");
    System.out.println("We make custom cake with our secret cake batter!");

    // TEST CODE

    // STEP 3 INPUT YOUR NAME AND PREPARE TO VIEW MENU
    System.out.println("What is your first name?"); // Prompting user to input first name
    firstName = keyboard.nextLine();

    System.out.println(firstName + ", please see our menu below: ");
    System.out.println("\n"); // skips a line

    // TEST CODE

    // STEP 4 DISPLAY MENU
    System.out.println("_________________________________________________");
    System.out.println("    MENU          QUANTITY        BASE    COST");
    System.out.println("_________________________________________________");
    System.out.println("    Cake                           1       $15");
    System.out.println("  Set of Cupcakes   6                      $15");
    System.out.println("-------------------------------------------------");
    System.out.println("Frosting (vanilla, choclate, strawberry, coco)");
    System.out.println("Fillings (mocha, mint, lemon, carmel, vanilla)");
    System.out.println("Toppings (sprinkles, cinnamon, cocoa, nuts)");
    System.out.println("________________________________________________");

    // TEST CODE

    // STEP 5 PROMPT USER TO ORDER
    System.out.println(" Do you want CUPCAKES or a CAKE?");
    itemOrder = keyboard.nextLine();

    // TEST CODE

    // STEP 6 PROMPT USER TO CHOOSE FROSTING
    System.out.println("What type of FROSTING do you want? ");
    System.out.println("Vanilla, Chocolate, Strawberry or Coco");
    frostingType = keyboard.nextLine();

    // TEST CODE

    // STEP 7 PROMPT USER TO CHOOSE FILLING
    System.out.println("What type of FILLING do you wnat? ");
    System.out.println("Mocha, Mint, Lemon, Caramel or Raspberry");
    fillingType = keyboard.nextLine();

    // TEST CODE

    // STEP 8 PROMPT USER TO CHOOSE TOPPINGS
    System.out.println("What type of TOPPINGS do  you want? ");
    System.out.println("Sprinkles, Cinnamon, Coco, Nuts");
    toppings = keyboard.nextLine();

    // TEST CODE

    // STEP 9 DISPLAY ORDER CONFIRMATION
    System.out.println("\n");
    System.out.println(firstName + ", your order is as follows: ");
    System.out.println("__________________________________");
    System.out.println(" Item Ordered: " + itemOrder);
    System.out.println(" Frosting: " + frostingType);
    System.out.println(" Fillings: " + fillingType);
    System.out.println(" Toppings: " + toppings);
    System.out.println("__________________________________");

    // TEST CODE

    // STEP 10 DISPLAY COST AND SALES TAX
    System.out.printf(" The cost of your order is: $%.2f\n", cost);
    tax = cost * TAX_RATE;
    System.out.printf(" The tax is: $%.2f\n", tax);
    System.out.printf(" The total due is: $%.2f\n", (tax + cost));
  }
}