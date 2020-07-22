
package assignment5;
import java.util.Scanner;

public class PizzaParty {

   public static void main(String[] args) {

       Scanner sc = new Scanner(System.in);

       System.out.print("Enter budget for your party:");
       double budget = sc.nextDouble();

       System.out.print("Cost per slice of pizza: ");
       double costPerSlice = sc.nextDouble();

       System.out.print("Cost per whole pizza pie (8 slices): ");
       double costPerPie = sc.nextDouble();

       System.out.print("How many people will be attending your party?: ");
       int people = sc.nextInt();
       sc.nextLine();
       int totalSlices = 0;

       for (int i = 0; i < people; i++) {

           //System.out.print("Enter number of slices for person #" + (i + 1) + ": ");
           //String sliceP = sc.nextLine();
           int number = 0;
           boolean flag = true;
           
           do {
               try {
            	   System.out.print("Enter number of slices for person #" + (i + 1) + ": ");
                   String pizzaSlice = sc.nextLine();
                   number = Integer.parseInt(pizzaSlice);
                   flag = false;
                   if (number >= 0) {
                	   break;
               }
                   System.out.println("Not a valid entry, try again!");
               }
              
               catch (Exception ex) {
            	  // System.out.print("Enter number of slices for person #" + i+1 + ": ");
                  continue;
               
               }
           } while (flag);

           totalSlices += number;
       }
       int pies = totalSlices / 8;

       int slices =  totalSlices - (pies * 8);

       double cost = (pies * costPerPie)+ (slices * costPerSlice);

       if (cost > budget) {

           System.out.println("Your order cannot be completed.");
           System.out.println("You would need to purchase " + pies + "pies and " + slices + " slices");
           System.out.println("This may put you over budget by " + (cost - budget));
       } else if (cost == budget) {

           System.out.println("You should purchase " + pies + " pies and " + slices + " slices");
           System.out.println("Your total cost will be: " + cost);
           if (budget - cost > 0) {
               System.out.println("You will still have " + (budget - cost) + " left after your order");
           } else {
               System.out.println("You will have no money left after your order.");
           }
       } else {

           System.out.println("You should purchase " + pies + " pies and " + slices + " slices");
           System.out.println("Your total cost will be: " + cost);
           if (budget - cost > 0) {
               System.out.println("You will still have " + (budget - cost) + " left after your order");
           } else {
               System.out.println("This would put you over budget by " + (cost - budget));
           }
       }
       sc.close();
   }
   }
   
   
