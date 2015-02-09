//Sara D'Iorio
//hw03
//Program #3
//Four Digits

//Use scanner class
//import class
//declare instance (object) of the class
//construct instance
//  compile Program #3
//      javac FourDigits.java
//  run the program
//      java FourDigits//

import java.util.Scanner;

//add the class and main method 
public class FourDigits {
//add main method
    public static void main(String [ ] args) {
        Scanner myScanner;
        myScanner = new Scanner(System.in);
//prompt user for a number with 4 decimal places
    System.out.print(
        "Enter a number in the form of xx.xxxx (I will display the four digits to the right of the decimal point): ");
//accept user input
    double userNumber = myScanner.nextDouble ( );
    
//make places integers since we are trying to get rid of decimals
    int place1;
    int place2;
    int place3;
    int place4;
    
//declare variables
//find place by place

    place1=(int)(userNumber*10)%10; //find the tenths place digit
    place2=(int)((userNumber*100)%100-(10*place1)); //find the hundreths place digit
    place3=(int)((userNumber*1000)%1000-(100*place1)-(10*place2)); //find the thousandths place digit
    place4=(int)((userNumber*10000)%10000-(1000*place1)-(100*place2)-(10*place3)); //find the tenthousands place digit
    
    
//print the four digits
    System.out.println("The four digits are "+place1+place2+place3+place4);

    

    }   //end of main method
}   //end of class