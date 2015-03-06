//hw06
//Sara D'Iorio
//Program 3
//Make Symbols

//USE DO-WHILE LOOPS
//use random number generator to get int between 0 and 100
    //first print out the number 
    //if number is even 
        //print out that number of "*" 
    //if number is odd
        //print that number of "&" 

//import and declare class and method
public class MakeSymbols{
//add main method
    public static void main(String[ ] args) {        
    
        int number = (int)(Math.random()*100); //generate number from 1-100
        int x = number%2; //find if number is even or not
        int i=0; //counter
        System.out.println("Random number generated:"+number); //print number generated
        System.out.print("The output pattern: "); 
        if (x==0) { //if remainder is 0
            do {
                System.out.print("*"); //print * for even
                i++; //add one to the counter
            } while (i<number); //while counter is not at number
        } else { //else statement
            do { //start do while loop
                System.out.print("&"); //print & for even
                i++; //add one to the counter 
            } while (i<number); //while counter is not at number
        } //close else statement
        System.out.println("");
    } //end main 
} //end class    
        