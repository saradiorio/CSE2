//Sara D'Iorio
//hw04
//Program1
//WhichNumber

//User thinks of an int between 1 and 10 (inclusive)
//Program asks questions to figure out what the number is
//Will use scanner class to ask questions
//then use if/else statements to narrow down 
//after go through all if/else
    //compiles, check (if any) errors, and run
    
//import scanner
import java.util.Scanner;

//now import and declare class and main method
public class WhichNumber {
//add main method
    public static void main(String[ ] args) {
        Scanner myScanner;
        myScanner = new Scanner(System.in);
//define scanner in system
        String yes="y", no="n"; //use string to define character variables

            //use character data input
//tell user to think of a number
    System.out.println("Think of a number between 1 and 10 inclusive");
        
    //now start asking user y/n questions to figure out the number
    System.out.println("Is your number even (use y/n)"); //first ask if even
    String input=myScanner.next();  //using string, make the input equal to the user input in the next line
    if(input.equals("y") || input.equals("Y")) {   //start first if statement - if even
        System.out.println("Is it divisible by 3?"); //prompt user to see if divisible by 3
        input=myScanner.next(); //with new input from user, make this the number now stored in input
        
        if(input.equals("y") || input.equals("Y")) { //if the new input is yes, new if statement
            System.out.println("Is your number 6?");    
            input=myScanner.next(); //new input from user 
            
            if(input.equals("y") || input.equals("Y")) {    //figuring out if we guessed the number
                System.out.println("Yay!"); //acknowledge it was correct
            } else if(input.equals("n") || input.equals("N")) {
                System.out.println("You did something wrong --Sorry!"); //the user must have typed in incorrect info
                // you suck
            } else {
                System.out.println("Sorry that's not a valid input"); //user entered an invalid character
            }
            
        } else if(input.equals("n") || input.equals("N")) { //if not divisible by 3
            System.out.println("Is it divisible by 4?");    //then prompt to see if divisible by 4
            input=myScanner.next(); //accept new input
            
            if(input.equals("y") || input.equals("Y")) {    //if it is divisible by 4
                System.out.println("Is the number divided by 4 greater than 1?");   //ask if divisible by 1
                input=myScanner.next(); //accept new input
                
                if(input.equals("y") || input.equals("Y")) {    //if divisible by 1
                    System.out.println("Is your number 8?");    //asking if correct
                    input=myScanner.next(); //accept new input
                    
                    if(input.equals("y") || input.equals("Y")) {    //acknowledging correct guess
                        System.out.println("Yay!");
                    } else if(input.equals("n") || input.equals("N")) { //something went wrong
                        System.out.println("You did something wrong --Sorry!");
                        
                    } else {    //not valid input
                        System.out.println("Sorry that's not a valid input");
                    }
                    //now figure out what to do if its not greater than 1 when divided by 4
                } else if(input.equals("n") || input.equals("N")) { 
                    System.out.println("Is your number 4?");
                    input=myScanner.next();
                    //ask if number is 4
                    if(input.equals("y") || input.equals("Y")) { //if yes
                        System.out.println("Yay!"); //your number is 4 
                    } else if(input.equals("n") || input.equals("N")) {
                        System.out.println("You did something wrong --Sorry!");
                        // you suck
                    } else {
                        System.out.println("Sorry that's not a valid input");
                    }    
                    //acknowledge number being correct or incorrect
                    
                } else {
                    System.out.println("Sorry that's not a valid input");
                }  
                //invalid input if neither y or n if referrence to the question
                
            } else if(input.equals("n") || input.equals("N")) {
                System.out.println("Is it divisible by 5?");
                input=myScanner.next(); //new input
                
                if(input.equals("y") || input.equals("Y")) {
                    System.out.println("Is your number 10?"); //is your number 10?
                    input=myScanner.next(); //new input
                    
                    if(input.equals("y") || input.equals("Y")) {
                        System.out.println("Yay!"); //your number is 10
                    } else if(input.equals("n") || input.equals("N")) {
                        System.out.println("You did something wrong --Sorry!");
                        // you suck
                    } else {
                        System.out.println("Sorry that's not a valid input"); //you used a character other than y/Y/n/N
                    }
                } else if(input.equals("n") || input.equals("N")) { //not divisible by 5?
                    System.out.println("Is your number 2?"); //is your number 2?
                    input=myScanner.next(); //take new input
                    
                    if(input.equals("y") || input.equals("Y")) {    //your number is 2!
                        System.out.println("Yay!");
                    } else if(input.equals("n") || input.equals("N")) { //your number isn't 2 -- you messed up 
                        System.out.println("You did something wrong --Sorry!");
                        // you suck
                    } else {
                        System.out.println("Sorry that's not a valid input"); //you used a character other than y/Y/n/N
                    }    
                } else {
                    System.out.println("Sorry that's not a valid input"); //you used a character other than y/Y/n/N
                }  
                // there's no valid input
            } else {
                System.out.println("Sorry that's not a valid input"); //you used a character other than y/Y/n/N
            }    
            // not divisible by 3
        }
    } else if(input.equals("n") || input.equals("N")) {
        System.out.println("Is it divisible by 3?");
        input=myScanner.next(); //new input data to be used
        
        if (input.equals("y") || input.equals("Y")) {   //it's divisible by 3
            System.out.println("When divided by 3 is the result greater than 1?");
            input=myScanner.next(); //new input to be used
            
            if (input.equals("y") || input.equals("Y")) {  //number >1 when divided by 3
                System.out.println("Is your number 9?"); //is your number 9?
                input=myScanner.next(); //new input data to be used
                //asking if number is 9
                if(input.equals("y") || input.equals("Y")) { //your number is 9!
                    System.out.println("Yay!");
                } else if(input.equals("n") || input.equals("N")) {
                    System.out.println("You did something wrong --Sorry!"); //user had to input incorrect data
                } else {
                    System.out.println("Sorry that's not a valid input"); ////you used a character other than y/Y/n/N
                } //if when divided by 3, result greater than 1, prompt to see if number is 9
                
            } else if (input.equals("n") || input.equals("N")) { //number <=1 when divided by 3
                System.out.println("Is your number 3?"); //is your number 3?
                input=myScanner.next(); //new input data to be used
                    
                if(input.equals("y") || input.equals("Y")) { //your number is 3!
                    System.out.println("Yay!");
                } else if(input.equals("n") || input.equals("N")) { //you did something wrong with your data input 
                    System.out.println("You did something wrong --Sorry!");
                    // you suck
                } else {
                    System.out.println("Sorry that's not a valid input"); //you used a character other than y/Y/n/N
                }
                
            } else {
                System.out.println("Sorry that's not a valid input"); //you used a character other than y/Y/n/N
            }   //if when divided by 3, result not greater than 1, prompt to see if number is 3 
        } else if(input.equals("n") || input.equals("N")) { //not divisible by 3
            System.out.println("Is it greater than 6?"); //number >6?
            input=myScanner.next(); //new data accept from user
            
            if(input.equals("y") || input.equals("Y")) {    //number is >6
                System.out.println("Is your number 7?"); //is your number 7?
                input=myScanner.next(); //new data accept from user
                    
                if(input.equals("y") || input.equals("Y")) { //your number is 7!
                    System.out.println("Yay!");
                } else if(input.equals("n") || input.equals("N")) { 
                    System.out.println("You did something wrong --Sorry!"); //number not 7, user did something wrong with input
                    // you suck
                } else {
                    System.out.println("Sorry that's not a valid input"); //you used a character other than y/Y/n/N
                } //if number is greater than 6, prompt to see if number is 7
            } else if (input.equals("n") || input.equals("N")) { //number isn't >6
                System.out.println("Is it less than 3?");
                input=myScanner.next();
                
                if (input.equals("y") || input.equals("Y")) { //number is less than 3
                    System.out.println("Is your number 1?"); //number 1?
                    input=myScanner.next(); //accept new data from user
                        
                    if(input.equals("y") || input.equals("Y")) { //number IS 1
                        System.out.println("Yay!");
                    } else if(input.equals("n") || input.equals("N")) {
                        System.out.println("You did something wrong --Sorry!"); //number not 1, user did something wrong with input
                        // you suck
                    } else {
                        System.out.println("Sorry that's not a valid input"); //you used a character other than y/Y/n/N
                    } //if number is less than 3
                } else if(input.equals("n") || input.equals("N")); { //number isn't less than 3
                    System.out.println("Is your number 5?"); //is your number 5?
                    input=myScanner.next(); //new user to be accepted from user 
                        
                    if(input.equals("y") || input.equals("Y")) { //your number is 5
                        System.out.println("Yay!");
                    } else if(input.equals("n") || input.equals("N")) {
                        System.out.println("You did something wrong --Sorry!"); //number not 5, user did something wrong with input
                    } else {
                        System.out.println("Sorry that's not a valid input"); //you used a character other than y/Y/n/N
                    } //check and acknowledge if you guessed the number correctly or if they did something wrong
                } //what to do if number is NOT less than three
    
            } else {
                System.out.println("Sorry that's not a valid input"); //you used a character other than y/Y/n/N
            }//invalid, end of if statement
            
        } else {
            System.out.println("Sorry that's not a valid input"); //you used a character other than y/Y/n/N
        }//invalid, end if statement 

    } else {
        System.out.println("Sorry that's not a valid input"); //you used a character other than y/Y/n/N
        }   //invalid, end of if statement
    }    //end of main method
}   //end of class
