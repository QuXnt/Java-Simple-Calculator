/*Simple Math Calculator
* The code below showcases the use of methods, DO..While loop, and conditional statements.
* Using the scanner class to collect the users input of 2 values.
* Performing a mathematically operations based on the selection between, addition, subtraction, multiplication, and division.
* This code also gives an example of casting an int to a double for the division method.
* It also touches on formatting as well as using a boolean to either run and stop the program.
*
* Feel free to reach out to SheCanTech@gmail.com or @SheCanTech on Twitter*/
package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        boolean done = false;
        String selection;
        String design = "******************";
	    int num1;
	    int num2;

	    Scanner scan = new Scanner(System.in);

        System.out.println(design + '\n' + "Calculator" + '\n' + design);
        do {
            System.out.println("Choose to add, subtract, multiple, or divide");
            selection = scan.nextLine();

            System.out.println("Enter your first value: ");
            num1 = scan.nextInt();
            scan.nextLine();
            System.out.println("Enter your second value");
            num2 = scan.nextInt();
            scan.nextLine();

            if (selection.equalsIgnoreCase("add") || selection.equalsIgnoreCase("addition") || selection.equalsIgnoreCase("+")) {
                add(num1, num2);
                System.out.println(add(num1, num2));
            } else if (selection.equalsIgnoreCase("subtract") || selection.equalsIgnoreCase("subtraction") || selection.equalsIgnoreCase("-")) {
                subtract(num1, num2);
                System.out.println(subtract(num1, num2));
            } else if (selection.equalsIgnoreCase("divide") || selection.equalsIgnoreCase("division") || selection.equalsIgnoreCase("/")) {
                division(num1, num2);
                System.out.println(division(num1, num2));
            } else if (selection.equalsIgnoreCase("multiply") || selection.equalsIgnoreCase("multiplication") || selection.equalsIgnoreCase("*")) {
                multiply(num1, num2);
                System.out.println(multiply(num1, num2));
            } else {
                System.out.println("Error: Invalid entry");
            }

            System.out.println("Try again? (Y/N)");
            selection = scan.nextLine();
            if(selection.equalsIgnoreCase("N") || selection.equalsIgnoreCase("No")){
                done = true;
            }
        } while (!done);


    }

    public static int add(int x, int y){
        int result = x + y;
        return result;
    }

    public static int subtract(int x, int y){
        int result = x - y;
        return result;
    }

    public static double division(int x, int y){
        double result = (double)x / y; //converts the integer to a double by casting an int to a double

/*      Prints out the remainder if it is greater than 0
        int remainder = x % y;
        if(remainder > 0){
            System.out.println("Remainder: " + remainder);
        }*/
        return result;
    }

    public static int multiply(int x, int y){
        int result = x * y;
        return result;
    }
}
