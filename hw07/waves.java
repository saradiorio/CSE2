//hw07
//Sara D'Iorio
//Number Waves

//import scanner method
//Ask user for integer between 1 and 30 inclusive
//print out display that depends on value entered...

//use loops to create each of the 3 stacks of numbers
    //for the stacks - 
        //print out the number of lines corresponding to number
            //starting at 1
        //repeat the number an incrementing time
            //until the number is printed THAT number of times
        //then decrease the printing by 1
            // continue until down to printing number once
        //then move to the next number and continue until have reached number input    
            

//Print out "For Loop:"
//STACK 1
    //using ONLY FOR LOOPS

//Print out "While Loop:"
//STACK 2
    //using ONLY DO-WHILE LOOPS

//Print out "Do-While Loop:"
//STACK 3
    //using ONLY DO-WHILE LOOPS
    
    
//import scanner
import java.util.Scanner;

//import and declare class and method
public class waves {
//add main method
    public static void main(String[ ] args) {
        Scanner myScanner = new Scanner(System.in); //define scanner in system
        int n; //number user inputs
        int rowNumber=1; //counter for number of row
        int cellNumber=0; //counter for places/cellNumbers in the row
        int place=0; //counter times the number is printed
        
        System.out.print("Enter a number between 1 and 30: ");
        n=myScanner.nextInt();//accept input
        if  (n >=1 && n<=30) {
            System.out.println("");//make a space
            System.out.println("FOR LOOP:"); //for loop stack
            for (rowNumber=1 ; rowNumber<=n; rowNumber++) {
                    if (rowNumber%2 == 0) { //start even numbers (increase stack)
                        for (cellNumber=0; cellNumber<rowNumber; cellNumber++) {
                            for (place=0; place<=cellNumber; place++) {
                                System.out.print(rowNumber);
                            } //close for loop to end that rowNumber
                            System.out.print('\n');
                        } //close for loop to print new line
                    }//close if for even numbers
                    else {  //start odd number (decrease stack)
                        for (cellNumber=rowNumber; cellNumber>0; cellNumber--) {
                            for (place=cellNumber; place>0; place--) {
                                System.out.print(rowNumber);
                            } //close for loop to end the rowNumber 
                            System.out.print('\n');
                        } //close for loop to print new line    
                    } //close else for odd numbers
            }//close all of nested for loop
            
            System.out.println("");//make a space
            System.out.println("WHILE LOOP:"); //while loop stack
            
            rowNumber=1; //counter for number of row
            cellNumber=0; //counter for places/cellNumbers in the row
            place=0; //counter times the number is printed
            
            while(rowNumber<=n){ //start while loop
                if (rowNumber%2 == 0) { //for even numbers increment
                    while(cellNumber<rowNumber){ //cell number < 0
                        place = 0; //place = 0
                        while(place<=cellNumber){ 
                            System.out.print(rowNumber);
                            place++;
                        } 
                        System.out.print('\n');
                        cellNumber++;
                    }//close while
                } //close if 
                else{ //odd numbers
                    cellNumber=rowNumber; //establish cell=row
                    while(cellNumber>0){ //
                        place=cellNumber;
                        while(place>0){
                            System.out.print(rowNumber);
                            place--;
                        }
                        System.out.print('\n');
                        cellNumber--;
                    } 
                }
                rowNumber++;
            }//End of while
            
            System.out.println("");//make a space
            System.out.println("DO-WHILE LOOP:"); //while loop stack
            
            rowNumber=1; //counter for number of row
            cellNumber=0; //counter for places/cellNumbers in the row
            place=0; //counter times the number is printed
            
            do{ //do while
                if (rowNumber%2 == 0) { //even numbers
                    do{
                        place = 0; //establish counter
                        do{
                            System.out.print(rowNumber);
                            place++;
                        }while(place<=cellNumber); //
                        System.out.print('\n');
                        cellNumber++;
                    }while(cellNumber<rowNumber);
                }
                else{ //odd numbers
                    cellNumber=rowNumber;
                    do{
                        place=cellNumber;
                        do{
                            System.out.print(rowNumber);
                            place--;
                        }while(place>0);
                        System.out.print('\n');
                        cellNumber--;
                    }while(cellNumber>0);
                }
                rowNumber++;
            }while(rowNumber<=n); //while
        }//close 'if' for meeting conditions [1,30]
        else {
            System.out.println("Invalid input, leaving program");
        }//close else
        
    }//end main method
}//end class