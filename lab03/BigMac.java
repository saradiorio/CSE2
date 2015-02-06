//Sara D'Iorio
//lab03
//BigMac

//Using the scanner class
//import class
//declare an instance (object) of the class 
//construct the instance
//  first compile the program
//      javac BigMac.java
//  run the program
//      java BigMac//
import java.util.Scanner;

//now add the class and main method
public class BigMac {
//add main method
    public static void main(String[ ] args) {
        Scanner myScanner;
        myScanner = new Scanner(System.in);
//prompt user for number of tickets
        System.out.print(
            "Enter the number of Big Macs (an integer > 0):");
//accept user input
    int nBigMacs = myScanner.nextInt ( );
//prompt for cost of a big mac
    System.out.print("Enter the cost per Big Mac as"+ " a double (in the form xx.xx) : ");
    double bigMac$ = myScanner.nextDouble ( );
//prompt for sales tax
    System.out.print( "Enter the percent tax as a whole number (xx) : ");
    double taxRate = myScanner.nextDouble ( );
    taxRate/=100; //user enters percent, but want it to be a proportion
    
//now with all inputs, need to print the output
    double cost$;
    int dollars, //whole dollar amount of cost
        dimes, pennies; //for storing digits
            //to the right of the decimal point
            //for the cost$
    cost$ = nBigMacs*bigMac$*(1+taxRate);
    //get total amount, dropping decimal fraction
    dollars=(int)cost$;
    //get dimes amount, e.g.
    //(int)(6.73*10) %10 -> 67 % 10 -> 7
    //where % (mod) operator returns the remainder 
    //after the division: 583%100 -> 83, 27%5 -> 2
    dimes=(int)(cost$*100)%10;
    pennies=(int)(cost$*100)%10;
    System.out.println("The total cost of " +nBigMacs +" BigMacs, at $"+bigMac$ +" per bigMac, with a sales tax of "+ (int)(taxRate*100) + "%, is $"+dollars+ '.'+dimes+pennies);
    }   //end of main method
}   //end of class
