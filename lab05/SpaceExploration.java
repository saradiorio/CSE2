//Sara D'Iorio
//lab05

//find random number between 2000-2010 decade
    //use (int)(Math.random()*...)
//then output all the events in the timeline
//that have occurred up to and including that year
//if year isn't listed in chart:
    //output N/A for events that occurred during that year
// use switch statements

//import and declare class and main method
public class SpaceExploration {
//add main method
    public static void main(String[ ] args) {
    
      //use (int)(Math.random()*(upperBound+1))+baseNum;
        int year = (int)(Math.random()*(11)) + 2000;

//Print statement telling user what the program is going to do
    System.out.println("Here is a timeline of space exploration from "+year+" to 2000:");
    
//use switch statement to print correct data
        switch(year) {   
            case 2010: 
                System.out.println("2010: SpaceX sucessfully sends spacecraft to orbit and back");
                //print out years acheivement (N/A if none)
                //no break statement so it prints all prior to the year too
            case 2009: 
                System.out.println("2009: N/A");
                //print out years acheivement (N/A if none)
                //no break statement so it prints all prior to the year too    
            case 2008: 
                System.out.println("2008: Kepler launched to study deep space");
                //print out years acheivement (N/A if none)
                //no break statement so it prints all prior to the year too   
            case 2007: 
                System.out.println("2007: N/A");
                //print out years acheivement (N/A if none)
                //no break statement so it prints all prior to the year too 
            case 2006: 
                System.out.println("2006: Spacecraft returns with collections from a comet");
                //print out years acheivement (N/A if none)
                //no break statement so it prints all prior to the year too 
            case 2005: 
                System.out.println("2005: Spacecraft collides with comet");
                //print out years acheivement (N/A if none)
                //no break statement so it prints all prior to the year too    
            case 2004: 
                System.out.println("2004: N/A");
                //print out years acheivement (N/A if none)
                //no break statement so it prints all prior to the year too  
            case 2003: 
                System.out.println("2003: Largest infrared telescope");
                //print out years acheivement (N/A if none)
                //no break statement so it prints all prior to the year too
            case 2002: 
                System.out.println("2002: N/A");
                //print out years acheivement (N/A if none)
                //no break statement so it prints all prior to the year too 
            case 2001: 
                System.out.println("2001: First spacecraft lands on asteroid");
                //print out years acheivement (N/A if none)
                //no break statement so it prints all prior to the year too 
            case 2000: 
                System.out.println("2000: First spacecraft orbits an asteroid");
                //print out years acheivement (N/A if none)
                break;
                //break here because this is the lowest we get in years for acheivements
            default:
                System.out.println("Something strange happened with our numbers...we are sorry!");
                //default statement
                
        } //end switch    
    
    }
}