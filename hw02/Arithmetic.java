/////////////////////
//Sara D'Iorio
//lab02 
//Arithmetic
//
//  first compile the program
//      javac Arithmetic.java
//  run program

// define class
public class Arithmetic{
    
//add main method
    public static void main (String [ ] args) {
        
//Number of pairs of socks
int nSocks=3;
//Cost per pair of socks
//('$' is part of the variable name)
double sockCost$=2.58;

//Number of drinking glasses
int nGlasses=6;
//cost per glass
double glassCost$=2.29;

//number of boxes of envelopes 
int nEnvelopes=1;
//cost per box of envelopes
double envelopeCost$=3.25;
double taxPercent=0.06;

//calculate totals for each kind of item
double totalSockCost$; //total cost of socks
    totalSockCost$=nSocks*sockCost$;
double totalGlassCost$; //total cost of glasses
    totalGlassCost$=nGlasses*glassCost$;
double totalEnvelopeCost$; //total envelope cost
    totalEnvelopeCost$=nEnvelopes*envelopeCost$;
    
//calculate sales tax for each kind of item
double sockTax$; //sock sales tax
    sockTax$=totalSockCost$*taxPercent;
double glassTax$; //glass sales tax
    glassTax$=totalGlassCost$*taxPercent;
double envelopeTax$; //envelope sales tax
    envelopeTax$=totalEnvelopeCost$*taxPercent;
    
//print out the total costs and sales tax
    System.out.println("The total cost of socks is "+(int)(totalSockCost$*100)/100.00+" dollars with a sales tax of "+ (int)(sockTax$*100)/100.00+" dollars");
    System.out.println("The total cost of glasses is "+(int)(totalGlassCost$*100)/100.00+" dollars with a sales tax of "+ (int)(glassTax$*100)/100.00+" dollars");
    System.out.println("The total cost of envelopes is "+(int)(totalEnvelopeCost$*100)/100.00+" dollars with a sales tax of "+ (int)(envelopeTax$*100)/100.00+" dollars");
//use the (int)(x*100)/100.00 to put into 2 decimals

 //calculate the total cost before tax
 double totalCostNoTax$; 
    totalCostNoTax$=totalSockCost$+totalGlassCost$+totalEnvelopeCost$;
    
//print out the total cost no tax
    System.out.println("The total cost of the purchase without tax is "+(int)(totalCostNoTax$*100)/100.00+" dollars");
//use the (int)(x*100)/100.00 to put into 2 decimals

//calculate the total final cost with tax
    double finalTotal$;
    finalTotal$=totalCostNoTax$+sockTax$+glassTax$+envelopeTax$;
    
//print out the total final cost
    System.out.println("The final total cost is "+(int)(finalTotal$*100)/100.00+" dollars");
//use the (int)(x*100)/100.00 to put into 2 decimals


    } //end of main method
} //end of class