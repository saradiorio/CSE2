//hw06
//Sara D'Iorio
//Program 2
//Run Factorial

//USE WHILE LOOP
//solve factorial programs
//use scanner
    //first input an integer between 9 and 16 INCLUSIVELY
    //then calculate the factorial of the input number 
    
//import scanner 
import java.util.Scanner;

//import and declare class and method
public class RunFactorial {
//add main method
    public static void main(String[ ] args) {
        Scanner myScanner = new Scanner(System.in); //define scanner in system
        int number; //number user inputs
        int i=1; //count for factorials
        int factorial=1; //declare factorial variable
        
        System.out.println("Please enter an integer that is between 9 and 16:");
        if (myScanner.hasNextInt()) { //check to see if value is an int
            number=myScanner.nextInt(); //accept user input
            if (number<=9 || number>=16) {
                System.out.println("Invalid input, enter again!");
            } else {
                while (i <= number) {
                    factorial*=i;
                    i++;
                }
                System.out.println(number+"!="+factorial);
            } //close else
        } else { //if NOT integer
            System.out.println("Invalid input, enter again!");
        }
    } //end main method
}    //end class