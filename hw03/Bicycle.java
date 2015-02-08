//Sara D'Iorio
//hw03
//Program #1
//Bicycle

//Using the scanner class
//import class
//declare an instance (object) of the class
//construct an instance
//  compile Program #1
//      javac Bicylce.java
//  run the program
//      java Bicycle//
import java.util.Scanner;

//now add the class and main method
public class Bicycle {
//add main method
    public static void main(String [ ] args) {
        Scanner myScanner;
        myScanner = new Scanner(System.in);
//prompt user for number of counts on a cyclometer
    System.out.print(
        "Enter the number of counts on the cyclometer (an integer > 0): ");
//accept user input
    double nCyclometerCount = myScanner.nextDouble ( );
//prompt user for the seconds that the counts occurred in
    System.out.print(
        "Enter the number of seconds it took for the counts to occur (in the form xx): ");
    double totalSeconds = myScanner.nextDouble ( );

//now define and declare all inputs needed to print the output
    double wheelDiameter=27.0, //wheel diameter
    PI=3.14159, //pi constant
    feetPerMile=5280, //feet per mile
    inchesPerFoot=12, //constant inches in feet
    secondsPerMinute=60, //constant 60 seconds per minute
    minutesPerHour=60; //constant 60 minutes per hour
    double distanceTrip, minutesOfTrip, averageMilesPerHour; //used for calculations

//run calculations; store values

    distanceTrip = nCyclometerCount*wheelDiameter*PI/inchesPerFoot/feetPerMile;
        //gives trip distance in miles
    minutesOfTrip = totalSeconds/secondsPerMinute;
        //gives trip time in minutes
    averageMilesPerHour = distanceTrip/(minutesOfTrip/60);
        //computes average miles per hour


//now print the results
    System.out.println("The distance was "+(int)(distanceTrip*100)/100.0+" miles and took "+(int)(minutesOfTrip*100)/100.0+" minutes.");
    System.out.println("The average mph was "+(int)(averageMilesPerHour*100)/100.0+".");
    
    }   //end of main method
} //end of class