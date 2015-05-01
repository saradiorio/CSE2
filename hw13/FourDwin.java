//Sara D'Iorio
import Scanner.util.java;


public class FourDwin{
    
    public static void statArray(double [][][][] array){
        double sum = 0;
        int count = 0;
        for (int i=0; i<array.length; i++) {
            for (int j=0; j<array[i].length; j++) {
                for (int k=0; k<array[i][j].length; k++) {
                    for (int l=0; l<array[i][j][k].length; k++) {
                        sum += array[i][j][k][l];
                        count ++;
                    }
                }
            }
        }
        double mean = sum/count; 
        System.out.println("Sum: " + sum);
        System.out.println("Mean: " +  )
    }
    
    public static void sort4DArray(){
        
    }  
    
    public static void sort3DArray(){
        
    }
    
    public static void printArray(){
        
    }
    
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        int x = myScanner.nextInt();
        int y = myScanner.nextInt();
        int a = (int)(Math.Random() *(y-x)+y);
        int b = (int)(Math.Random() *(y-x)+y);
        int c = (int)(Math.Random() *(y-x)+y); 
        
        double [][][][] ragged= new double [a][b][c][3];    
        
        statArray(ragged);
        
    }
}