//lab07
//Zigzag
//Sara D'Iorio

import java.util.Scanner;

public class Zigzag {
    public static void main (String [] args) {
        Scanner myScanner=new Scanner(System.in);
        System.out.print("Enter an int between 3 and 33: ");
        while (myScanner.hasNextInt) {
            
            while(myScanner)
            System.out.println("Didn't Enter an int, try again");
            int nStars=myScanner.nextInt;
        }
            int x=0; //couter
            while (x<nStars) {
                System.out.print("*");
                x++;
            }
            System.out.println("");
            
            int i=0; //space variable
            x=0;
            while(x<nStars) {
                i=x;
                int y=0; //counter
                while(y<i) {
                    System.out.print(" ");
                    y++;
                }
                System.out.println("*"); 
                x++;
            }
            int nStarts=10;
            while (x<nStarts) {
                System.out.print("*");
                x++;
            }
            System.out.println("");
        
    }
}
