//lab08 
//Methods
//Factorials

//import scanner
import java.util.Scanner;

//import and declare class and method
public class Factorials {
    //factorial method 1
    public static int factorial(int input) {
        int num = 1; //number to mulitply
        for (int i=1; i<=input; i++) {
            num *= i; //multiply the number by the increasing i
        }
        return num;
    }
    
    //second method to print out number 
    public static void print(int input, int sum) {
        System.out.println("The super factorial of "+input+" is "+sum);
    } 
    
    public static void main(String [] args) {
        Scanner scan= new Scanner(System.in); 
        System.out.print("Enter a positive number: ");
        int x = scan.nextInt();
        int sum = 0; //sum
        for (int y=1; y<=x; y++) {
            sum += factorial(y); 
            if (y==x) {
                System.out.println(factorial(y)); //print the factorial amount
            } 
        }
        print(x,sum);
    }
}