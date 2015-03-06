//hw06
//Sara D'Iorio
//Program 1
//Get Integers

//USING NON NESTED FOR-LOOPS
//Ask user for 5 non-negative integers
    //if invalid entered, as again using loop
//pring sum of 5 integers

//import scanner 
import java.util.Scanner;

//import and declare class and method
public class GetIntegers {
//add main method
    public static void main(String[ ] args) {
    Scanner myScanner; 
    myScanner = new Scanner(System.in); //define scanner in system
    int sum=0; //declare count for sum starting at 0
    int i=0; //declare i as number of numbers needed
    int x; //accept user input
    
    System.out.println("Please enter 5 non-negative integers: "); //prompt user for 5 integers

    for(i=0; i<5; i++) { //for the first input, up until 5 inputs, increment input number by 1
        if (myScanner.hasNextInt()) { //check to see if input is integer
            x=myScanner.nextInt(); //accept user input
            if (x<0)  { //if user input is positive
                System.out.println("Invalid input, enter again");
                i--; //subract from i count
            } else { //if positive integer, add to sum
                sum += x;
            } //close else
        } else { //if NOT integer
            String noInt = myScanner.next(); //use string
            System.out.println("Invalid input, enter again"); //invalid input
            i--; //subtract from i count
        } //close else
    } //close for loop
    System.out.println("Sum is "+sum); //print sum
    
    }//end main 
}//end class