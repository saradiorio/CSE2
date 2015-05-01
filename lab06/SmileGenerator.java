//Sara D'Iorio
//lab06
//SmileGenerator


//STEP 1
    //first print 5 smiles using non-nested for loops
        //use system.out.print
    //then use while loops to do the same thing
        //use
    //finally, use do-while loops to do the same as the above
        //use

//STEP 2
    //create second loop to print out a random number of smiley faces
        //use "Math.random()" -- create between 1 and 100 smiley faces

//STEP 3
    //create a third loop that limits the number of smiley faces on any line to 30

//STEP 4
    //creat fourth loop that increases the number of smiley faces on each line by 1
    //...for every new line that is used
        //Use only ONE loop

//import and declare class and main method
public class SmileGenerator {
//add main method
    public static void main(String[ ] args) {
        int count; //declare the parameter 
        final int startNumber = 0; //want only 5 smileys
        final int endNumber = 5;
        
        //for loop
        //STEP 1-1
        for (count = startNumber; count < endNumber; count++) { //start for loop
            System.out.print(":) "); //print out smiley faces
        }//end for loop
        System.out.println("\n"); //print line in between different loops/steps
    
        //STEP 1-2    
        // next, use the WHILE loop
        int count2 = 0; //declare count as 0 instead of startNumber needed for the While loop
        while (count2 < endNumber) { //loop continuation condidtion (count less than 5)
            System.out.print(":) "); //print smiley face
            count2++; //increment count by 1 each time after smiley is printed
        }//end while loop    
        System.out.println("\n"); //print line in between different loops/steps
        
        //STEP 1-3
        //use the DO-WHILE loop
            //loop body executed first, then loop continuation condition is evaluated
                //if evaluation is true, loop body executed again
        int count3; //declare new count for the do-while loop 
        count3=startNumber; //have count3 (the loop parameter) equal to the start number 
        do {
        //loop body    
            System.out.print(":) "); //print smiley faces    
            count3++; //increment count by 1 for next loop run
        } while (count3 < endNumber); //loop continuation condition
        //end do while
        System.out.println("\n"); //print line in between different loops/steps
        
        //STEP 2
        //create second loop to print out a random number of smiley faces
        //create between 1 and 100 smiley faces
        //use (int)(Math.random()*100);
        int endLoop2 = (int)(Math.random()*100); //generate random number between 1 and 100
        //this is amount of smileys
        int countLoop2 = 0; //declare count start at 0 so that it goes up to endNumber2 in :)
        //use while loop
        while (countLoop2 < endLoop2) {
            System.out.print(":) "); //print smiley faces
            
            countLoop2++; //increment by one so it continues printing that smiley 
        }//end while loop
        System.out.println("\n"); //print line in between different loops/steps
        
        //STEP 3
        //if printing more than 30 per line...
        while (countLoop2 < endLoop2) {
            if (countLoop2%30==0) {
            System.out.println(" ");
            }
            System.out.print(":) "); //print smiley faces
            countLoop2++; //increment by one so it continues printing that smiley 
        }//end while loop
        System.out.println("\n"); //print line in between different loops/steps
        
        //STEP 4
        //create 4th loop that increases the number of smiley faces on each line by 1
        int width=0; //smiley counter
        int height= 1; //height counter
        int number3 = (int)(Math.random()*100);
        for (width=0; width<number3; width++) { //start while loop -- while i is less than random number, run loop 
             if (width==height) { //if statement -- height = width
                System.out.println(" "); //break line
                height++; //increase height by 1 (next integer amount)
        } //end if statement
            System.out.print(":) "); //print smiley face

        } //end while loop
        System.out.println("\n"); //print line in between different loops/steps 
        
    }//end main method
}//end class
