//Sara D'Iorio
//lab04
//Cookies

//The User is responsible for bringing cookies to an event
//Using the scanner class
//Obtain...
//how many cookies user wants, 
//how many people they are buying for 
//and the least amount of cookies per person

//then take input and determine...
//if number of cookies evenly divisible by # people
    //use %
//if not enough, tell user how many more needed

//import scanner
import java.util.Scanner;

//now import and declare class and main method
public class Cookies {
//add main method
    public static void main(String[ ] args) {
        Scanner myScanner;
        myScanner = new Scanner(System.in);
//prompt user for the number of people
        System.out.print(
            "Enter the number of People: ");
//accept user input
        int nPeople; //
        int cookies; //
        int perPerson;//
        int need; //
//check if the user inputs an int using the Scanner method
    if(myScanner.hasNextInt()) {
        nPeople = myScanner.nextInt ( ); //finding true of falso on the statemets
        if (nPeople<0){
            System.out.println("You entered a negative number");
    
        }
        else {
            System.out.print("Enter the number of cookies you are planning to buy: ");
            //number of cookies user wants to buy
            if (myScanner.hasNextInt()) {
                cookies = myScanner.nextInt ( ); //finding true or false
                if (cookies<0){
                    System.out.println("You entered a negative number");
                }
            else {
                System.out.print("How many do you want each person to get? ");
                //how many cookies user wants per person
                if (myScanner.hasNextInt()) {
                    perPerson = myScanner.nextInt (); //getting the integer from user
                    if (perPerson<0){
                        System.out.println("You entered a negative number");
                        
                    }
                    else {
                        if (nPeople*perPerson>cookies){
                            need = (nPeople * perPerson) - cookies;
                            System.out.println("You don't have enough cookies. You need"+need +"more cookies");
                            
                            
                        }
                        else if (cookies%nPeople !=0) {
                            System.out.println("You have enough, but they will not divide evenly");
                            
                            
                        }
                        else {
                            System.out.println("You have enough cookies for each person and the amount will divide evenly");
                            
                        }
                    }
                    
                }
                else {System.outprintln("You didn;t enter an int");
                
                }
            }
            else {
                System.out.println("You didn't enter an int");
            }
        }
    }
    }
    else{
        System.out.println("You didnt not enter an int");
        
    } //program ends
    

    }   //end of main method
}   //end of class
