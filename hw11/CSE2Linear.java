import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;


public class CSE2Linear {
        
    public static int binarySearch(int[] a, int search) {
        int low = 0; //lowest index in array
        int high = a.length - 1; //highest point of array
        int i = 0; //iteration counter
        while (low<=high && i<5) {
            int middle = (low + high)/2; //find middle point to divide and conquer!
            if (a[middle] == search) {
                System.out.println(search+" was found in the list with "+(i+1)+ " iteration(s)");    
                return middle;
            } else if (a[middle]<search) {
                low = middle + 1;
            } else {
                high = middle-1;
            }
            i++;
            
        }
        System.out.println(search + " was not found in the list with 4 iterations");
        return 0;
        
    }
    
    public static int[] scrambledArray(int[] a) {
        Random randGen = new Random(); //random number generator
        
        for (int i=0; i<a.length; i++) {
            int randPos = randGen.nextInt(a.length); //find random number to swap
            //swap valies
            int temp = a[i];
            a[i] = a[randPos];
            a[randPos] = temp;
        } 
        return a;
    }
    
    public static int linearSearch(int[] a, int search) {
        int i = 0; //counter for numbers in array (index's)
        boolean foundit = false; 
        for (i=0; i<a.length; i++) {
            if(a[i] == search) {
                foundit = true;
                break;
            }
        }
        //it is equal and 'found', so print that it's in the array
        if (foundit) {
            System.out.println(search+ " was found in the list with "+(i+1)+" iteration(s)");
        } else {
            System.out.println(search+ "was not found in this list. All 15 grades were checked, and none matched.");
        }
        return 0;
    }
    
    public static void main(String [] args) {
        int numbers[] = new int [15];
        Scanner q = new Scanner(System.in);

        System.out.println("Enter 15 ints for final grades in CSE2: ");
        int i=0;
        i++;
        while(i<numbers.length) {
            if (!q.hasNextInt()) {
                System.out.println("Error - not int");
                System.exit(0);
            } else if (q.nextInt()<0 || q.nextInt()>100) {
                System.out.println("Error- out of range");
                System.exit(0);
            } else if (i!=0){
                while(numbers[i]>=numbers[i-1]) {
                System.out.println("Error - must be greater than previous number");
                System.exit(0);
            } continue;
            }
            numbers[i] = q.nextInt();
                i++;
        }    
 
        System.out.print("The grades, sorted, are: ");
        for(int j=0; j<numbers.length; j++){
            System.out.print(numbers[j]+" ");
        }
        System.out.println();
        System.out.print("Enter a grade to search for: ");
        int search = q.nextInt();
        
        //x is the variable for searching for binary
        int x = binarySearch(numbers, search); //binary search

        numbers = scrambledArray(numbers);
        System.out.println("Scrambled: "); 
        for(int j=0; j<numbers.length; j++){
            System.out.print(numbers[j]+" ");
        }    
        System.out.println();
        
        System.out.print("Enter a grade to search for: ");
        int findScramb = q.nextInt();
        //y is variable for linear search
        //call method linearSearch
        int y = linearSearch(numbers, findScramb); //linear search
        
        
        
        
        
        
    }
}
}