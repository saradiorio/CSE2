import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class Arrayinputs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter an integer for the size of an array: ");
        if(!input.hasNextInt()) {
            
            System.out.println("Sorry, you didn't enter an integer");
            System.out.print("Please enter a positive integer: ");

        }
        else{
        int x = input.nextInt();
        int a[] = new int [x];
        
        System.out.println("Enter "+x+ " positive integers: ");
        

        for(int i=0; i<a.length; i++) {
            a[i]=input.nextInt();
        }
        for (int i: a) {
            System.out.println(i);
        }
}
}
}

