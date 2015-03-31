//hw08
//Sara D'Iorio
//MG's Adventure World

//import scanner
import java.util.Scanner;

//import and declare class and method
public class HW8 {
    public static String getInput(Scanner scan, String string) { //getInput first method
        char x = scan.next().charAt(0); //char x to allow for character input to be accepted
        if(x == string.charAt(0) || x == string.charAt(1)) { //if for string 
           return "DEATH VALLLAAAY"; //return
        } else { //if not C or c
            System.out.println("Yea right LOSER!"); //you're done
            System.exit(0); //QUIT
        }
        return "nothing";
    }
    
    public static String getInput(Scanner scan, String string, int trial) {   //getInput 3 input method
        int i = 0; //counter 
        char x = scan.next().charAt(0); //char x to allow for character input to be accepted
        while(i<trial) { //while to count times you hit giant
            if(x== string.charAt(0) || x==string.charAt(1)) { //A or a
                int number = (int)(Math.random()*(2)); //create number random between 0 and 1
                if (number == 0) { //if 0 not a hit
                    System.out.println("Gosh! How can you miss it!"); 
                } else {
                    System.out.println("Critical Hit!"); //if 1, hit! 
                    i++; //counts toward total hits
                }
            } else if (x==string.charAt(2) || x==string.charAt(3)) { //e and E inputs
                int number = (int)(Math.random()*(10)+1); //random number between 1 and 10
                if (number==10) { //if get 10
                    System.out.println("You escaped successfully GOOD FOR YOU!"); //escape
                    i=trial; //to escape
                }else {
                    System.out.println("Hahaha You're Stuck");
                }
            } else {
                System.out.println("Executed by the GIANT! Game Over!"); //game over 
                System.exit(0); //DONZO
            } 
            if (i<trial) {
                System.out.println("Enter 'A' or 'a' to Attack, 'E' or 'E' to Escape, ANYTHING else is to YIELD");  //keep asking until counter = 10
                x=scan.next().charAt(0);
            }
        } 
        return "game needs to be over";
    }
    
    public static String getInput(Scanner scan) { //switch for treasure chest
        int i = scan.nextInt();
        switch (i){
            case 1: 
                System.out.println("You get to skip all your classes! LUCKY!");
                break;
            case 2: 
                System.out.println("You get soap go shower!");
                break;
            case 3:
                System.out.println("Unfortunately, you're third, so you get the hairy chest!");
                break;
            default: 
                System.out.println("A Wrong Number! You get nothing! Better restart the game LOL");
                break;
        }
        return "nada";
    }
    
    public static void cave() {
        System.out.println("                              *****   * * * * * * * *        ");
        System.out.println("                         ***         ***                      ");
        System.out.println("                      ***               ***                   ");
        System.out.println("                 |    ***               ***                   ");
        System.out.println("                 |    ***               ***                   ");
        System.out.println("             O __|__  ***               ***                   ");
        System.out.println("           ******l    ***               ***                   ");
        System.out.println("            * *       ***               ***                   ");
        System.out.println("           *   *      ********************* * * * * * *       ");
    }
    
    public static void giant() {
        System.out.println("                                 ---------                    ");
        System.out.println("                                |  /    \\|                   ");
        System.out.println("                      ZZZZZH    |    O    |    HZZZZZ             ");
        System.out.println("                           H     -----------   H              ");
        System.out.println("                      ZZZZZHHHHHHHHHHHHHHHHHHHHHZZZZZ                   ");
        System.out.println("                           H    HHHHHHHHHHH    H                      ");
        System.out.println("                      ZZZZZH    HHHHHHHHHHH    HZZZZZ               ");
        System.out.println("                                HHHHHHHHHHH                   ");
        System.out.println("                                HHH     HHH                   ");
        System.out.println("                               HHH       HHH                   ");
    }
    
    public static void box(){
        System.out.println("                      *********************     *********************    *********************             ");
        System.out.println("                     ***               ***     ***               ***    ***               ***              ");
        System.out.println("                     ***       1       ***     ***       2       ***    ***       3       ***              ");
        System.out.println("                     ***               ***     ***               ***    ***               ***              ");
        System.out.println("                     *********************     *********************    *********************               "); 
    }

    public static void main(String[] args) {
            char option;
            Scanner scan = new Scanner(System.in);
            System.out.println("Welcome to MG's adventure world. Now your journey begins. Good luck!");
            System.out.println("Please hit 'C' or 'c' to continue, anything else to quit-");
            String input = getInput(scan, "Cc");
            System.out.println("You are in a dead valley.");
            System.out.println("Please hit 'C' or 'c' to continue, anything else to quit-");
            input = getInput(scan, "Cc");
            System.out.println("You walked and walked and walked and you saw a cave!");
            cave();
            System.out.println("Please hit 'C' or 'c' to continue, anything else to quit-");
            input = getInput(scan, "Cc");
            System.out.println("You entered a cave!");
            System.out.println("Please hit 'C' or 'c' to continue, anything else to quit-");
            input = getInput(scan, "Cc");
            System.out.println("Unfortunately, you ran into a GIANT!");
            giant();
            System.out.println("Enter 'A' or 'a' to Attack, 'E' or 'E' to Escape, ANYTHING else is to YIELD");
            input = getInput(scan, "AaEe", 10);
            System.out.println("Congratulations! You SURVIVED! Get your REWARD!");
            System.out.println("There are three 3 tressure box in front of you! Enter the box number you want to open!");
            box();
            input = getInput(scan);
    } // close main method
} //close class    
