//Sara D'Iorio
//hw05
//ToHex

//use Scanner class
//user enters 3 digits between 0 and 255 
//program takes the 3 digits and check for 
    //0<= user input number <=255
    //user is a number, not anything else
//then take numbers and use if/else and switch statements to make it a hexidecimal number
//go through all if/else statements to properly get numbers in hexidecimals

//import scanner
import java.util.Scanner; 

//import and declare class and main method
public class ToHex {
//add main method
    public static void main(String[] args) {
        Scanner myScanner;
        myScanner = new Scanner(System.in);
//define scanner in system 
//tell user to input the 3 numbers 
        System.out.println("Please enter three numbers representing RGB values:");
//check to make sure the input is an INTEGER        
        if (myScanner.hasNextInt()) {
            int R=myScanner.nextInt(); //if R is an int
            if (myScanner.hasNextInt()) {
                int G=myScanner.nextInt(); //if G is an int
                if (myScanner.hasNextInt()) {
                    int B=myScanner.nextInt(); //if B is an int
                    if((0<=R && R<=255) && (0<=G && G<=255) && (0<=B && B<=255)){ //if all 3 meet the between 0 and 255 criteria
                        int number1=(int)(R/16); //truncate so you only get how many times 16 goes into number
                        int number2=(int)(G/16);
                        int number3=(int)(B/16);
                        int r1=R%16; //find remainder from each of the inputs
                        int r2=G%16;
                        int r3=B%16;
                        String c; //first string for r1
                        if (r1 > 9 && r1 < 16) { //if r is >9, need to change to character
                            switch(r1) { //use switch for r1>9
                                case 10: c = "A"; //A=10
                                    break;
                                case 11: c = "B"; //B=11
                                    break;
                                case 12: c = "C";//C=12
                                    break;
                                case 13: c = "D";//D=13
                                    break;
                                case 14: c = "E";//E=14
                                    break;
                                default: c = "F";//F=15
                                    break;
                            }//end switch
                        } else {
                            c = Integer.toString(r1);//For printing purposes, turn the int value into a string
                        } //end if else for r1
                        String d; //second string for r2
                        if (r2 > 9 && r2 < 16) { //if r is >9, need to change to character
                            switch(r2) {
                                case 10: d = "A"; //A=10
                                    break;
                                case 11: d = "B"; //B=11
                                    break;
                                case 12: d = "C"; //C=12
                                    break;
                                case 13: d = "D"; //D=13
                                    break;
                                case 14: d = "E"; //E=14
                                    break;
                                default: d = "F"; //F=15
                                    break;
                            }//end switch
                        } else {
                            d = Integer.toString(r2); 
                            //For printing purposes, turn the int value into a string
                        } //end if else for r2
                        String e; //third string for r3
                        if (r3 > 9 && r3 < 16) { //if r is >9, need to change to character
                            switch(r3) {
                                case 10: e = "A"; //A=10
                                    break;
                                case 11: e = "B"; //B=11
                                    break;
                                case 12: e = "C"; //C=12
                                    break;
                                case 13: e = "D"; //D=13
                                    break;
                                case 14: e = "E"; //E=14
                                    break;
                                default: e = "F"; //F=15
                                    break;
                            }//end switch
                        } else {
                            e = Integer.toString(r3);
                            //For printing purposes, turn the int value into a string
                        } //end if else for r3
                        String f; //fourth string for number1
                        if (number1 > 9 && number1 < 16) {  //if number is >9, need to change to character
                            switch(number1) {
                                case 10: f = "A"; //A=10
                                    break;
                                case 11: f = "B"; //B=11
                                    break;
                                case 12: f = "C"; //C=12
                                    break;
                                case 13: f = "D"; //D=13
                                    break;
                                case 14: f = "E"; //E=14
                                    break;
                                default: f = "F"; //F=15
                                    break;
                            }//end switch
                        } else {
                            f = Integer.toString(number1);
                            //For printing purposes, turn the int value into a string
                        } //end if else for number1
                        String g; //fifth string for number2
                        if (number2 > 9 && number2 < 16) { //if number is >9, need to change to character
                            switch(number2) {
                                case 10: g = "A"; //A=10
                                    break;
                                case 11: g = "B"; //B=11
                                    break;
                                case 12: g = "C"; //C=12
                                    break;
                                case 13: g = "D"; //D=13
                                    break;
                                case 14: g = "E"; //E=14
                                    break;
                                default: g = "F"; //F=15
                                    break;
                            }//end switch
                        } else {
                            g = Integer.toString(number2);
                            //For printing purposes, turn the int value into a string
                        } //end if else for number2
                        String h; //sixth string for number3
                        if (number3 > 9 && number3 < 16) { //if number is >9, need to change to character
                            switch(number3) {
                                case 10: h = "A"; //A=10
                                    break;
                                case 11: h = "B"; //B=11
                                    break;
                                case 12: h = "C"; //C=12
                                    break;
                                case 13: h = "D"; //D=13
                                    break;
                                case 14: h = "E"; //E=14
                                    break;
                                default: h = "F"; //F=15
                                    break;
                            }//end switch
                        } else {
                            h = Integer.toString(number3);
                            //For printing purposes, turn the int value into a string
                        } //end if else for number3
                        System.out.print("The decimal numbers R:"+R+", G:"+G+", B:"+B+", is represented in hexidecimal as: ");
                        System.out.println(f + c + g + d + h + e + ".");//Print out the Hex number from the strings
                    } else {
                    System.out.println("Sorry you must enter values between 0-255");
                    } //user put in number not in interval
                }
                else {
                System.out.println("Sorry your input must consist of integers.");
                } //'B' not an int
            }
            else {
            System.out.println("Sorry your input must consist of integers.");
            }//'G' not an in
        }
        else {
            System.out.println("Sorry your input must consist of integers.");
        }//'R' not an in
    }//end main method
}//end class