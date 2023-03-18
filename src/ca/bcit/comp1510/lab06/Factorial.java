package ca.bcit.comp1510.lab06;

import java.util.Scanner;

/**
 * Factorial class computes the factorial of a non-negative integer.
 * It validates the input to ensure it is a non-negative integer.
 * 
 * @author soheehwang
 * @version 2023
 */
public class Factorial {
    
    /**
     * Description.
     * @param args
     *          unused.
     */
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        int num = readNonNegativeInt(scan);
        
        int factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }
        
        System.out.println(num + "! = " + factorial);
        
        scan.close();
        
    }
    
    /**
     * Reads a non-negative integer from the given Scanner object.
     * Prompts the user to enter a new value if the input is invalid.
     * 
     * @param scan - the Scanner object to read from
     * @return a non-negative integer
     */
    private static int readNonNegativeInt(Scanner scan) {
        int num = 0;
        boolean valid = false;
        
        while (!valid) {
            System.out.print("Enter a non-negative integer: ");
            if (scan.hasNextInt()) {
                num = scan.nextInt();
                if (num >= 0) {
                    valid = true;
                } else {
                    System.out.println("Error: The number "
                            + "must be non-negative.");
                }
            } else {
                String input = scan.next();
                System.out.println("Error: \"" + input + "\" is not a number.");
            }
        }
        
        return num;
    }

}
