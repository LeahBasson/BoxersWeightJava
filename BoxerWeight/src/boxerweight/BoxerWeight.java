package boxerweight;

import java.util.Scanner;

public class BoxerWeight {

    public static void main(String[] args) {
        // User must enter a weight repeatedly
        // Depending on the weight entered, the category is displayed on the screen.
        // Programs stops when a negative weight is entered.
        // Counts the number of weights entered per category.

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the weight of boxer (negative number to stop) -> ");
        int weight = input.nextInt();
        
//        int fly_counter = 0, fth_counter = 0, lht_counter = 0, unk_counter = 0 ;

        while (weight != 0) {

//            if (weight <= 52) {
//                System.out.println("The boxer is a flyweight.");
//                fly_counter ++;
//            }
//            else if (weight > 52 && weight <= 57){
//                System.out.println("The boxer is a featherweight.");
//                fth_counter ++;
//            }
//            else if (weight <= 63){
//                System.out.println("The boxer is a lightweight.");
//                lht_counter ++;
//            }
//            else {
//                System.out.println("The boxer category is UNKNOWN.");
//                unk_counter ++;
//            }

            System.out.print("Enter the weight of boxer (negative number to stop) -> ");
            weight = input.nextInt();
        }
        
//        System.out.println("Flyweight = " + fly_counter);
//        System.out.println("Featherweight = " + fth_counter);
//        System.out.println("Lightweight = " + lht_counter);
//        System.out.println("Unknownweight = " + unk_counter);
//        
//        System.out.println("Thank you for using the program.");
    }

}
