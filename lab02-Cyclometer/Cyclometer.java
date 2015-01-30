////////////////////
//Sara D'Iorio
//lab02 
//Cyclometer
//
//  first compile the program
//      javac Cyclometer.java
//  run program

// define class
public class Cyclometer{
    
//  add main method
    public static void main (String[ ] args) {
        
// add data from trip one and two
        int secsTrip1=480; //seconds for trip 1
        int secsTrip2=3220; //seconds for trip 2
        int countsTrip1=1561; //counts for trip 1
        int countsTrip2=9037; //counts for trip 2

// variables that are constant needed for outputs
        double wheelDiameter=27.0, //wheel diameter
        PI=3.14159, //pi constant
        feetPerMile=5280, //feet per mile
        inchesPerFoot=12, //constant inches in feet
        secondsPerMinute=60; //constant 60 secs per minute
        double distanceTrip1, distanceTrip2, totalDistance; //

//print out numbers
        System.out.println("Trip 1 took " +
            (secsTrip1/secondsPerMinute) + " minutes and had" +
            countsTrip1 + "counts.");
        System.out.println("Trip 2 took " + 
            (secsTrip2/secondsPerMinute) + " minutes and had" +
            countsTrip2 + " counts.");
            
//run the calculations; store values
//calculating distance of the trips based on wheel spins
//
//
    distanceTrip1=countsTrip1*wheelDiameter*PI/inchesPerFoot/feetPerMile;
    //The above gives distance of trip1 in miles
    distanceTrip2=countsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile;
    totalDistance=distanceTrip1+distanceTrip2; //total distance
    
//print out the output data 
    System.out.println("Trip 1 was "+distanceTrip1+" miles");
    System.out.println("Trip 2 was "+distanceTrip2+" miles");
    System.out.println("The total distance was "+totalDistance+" miles");
        
    } //end of main method
} //end of class
