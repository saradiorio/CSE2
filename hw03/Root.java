//Sara D'Iorio
//hw03
//Program #2
//Root

//Use scanner class
//import class
//declare instace (object) of the class
//construct instance
//  compile Program #2
//      javac Root.java
//  run the program
//      java Root//

import java.util.Scanner;

//add the class and main method
public class Root {
//add main method
    public static void main(String [ ] args) {
        Scanner myScanner;
        myScanner = new Scanner(System.in);
//prompt user for a number in the form xx.xx
    System.out.print(
        "Enter a number in the form xx.xx: " );
//accept user input
    double x = myScanner.nextDouble ( );

//double to accept decimals 
    double guess;

    double approxOfX;
//now start calculating the roots 
//start by taking a guess of the square root
    guess=x/3;
//then improve guess by replacing "guess" w/ x/3
//  in the expression (guess*guess*guess+x)/(3*guess*guess) 
//  -> this equation will be used through the improving process
    guess=(2*guess*guess*guess+x)/(3*guess*guess);
//continue improvimg estimate 4 more times by subsituting last estimate for 'guess'
//  in the equation above
    guess=(2*guess*guess*guess+x)/(3*guess*guess); //1st of 4 improvements
//
    guess=(2*guess*guess*guess+x)/(3*guess*guess); //2nd of 4 improvements
//
    guess=(2*guess*guess*guess+x)/(3*guess*guess); //3rd of 4 improvements
//
    guess=(2*guess*guess*guess+x)/(3*guess*guess); //4 of 4 improvements

//now compute what guess5 cubed is -> should be approximately x
    approxOfX=(guess*guess*guess);

//now print computations
    System.out.println("The cube root is "+guess+" : "); //print cube root
    System.out.println(" "+guess+" * "+guess+" * "+guess+" = "); //print math
    System.out.println(approxOfX); //print guess5 cubed which approximates x
    
    
    }   //end of main method
}   //end of class