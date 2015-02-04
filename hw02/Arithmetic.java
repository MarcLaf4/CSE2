//Marc Laflamme
//CSE HW 2
// February 3rd 2015
// Arithmetic program: Learn to maipulate variables and math to
// calculate the total cost of a sale including tip

//make class
public class Arithmetic {
    //make main method
    public static void main(String[] args){
    //assign input variables:
     //the # of pairs of socks
    int nSocks=3;
    //Cost per pair of socks
    //with $ as part of the name
    double sockCost$=2.58;

    //the # of drinking glasses
    int nGlasses=6;
    //Cost per glass
    double glassCost$=2.29;

    //the # of boxes of envelopes
    int nEnvelopes=1;
    //cost per box of envelopes
    double envelopeCost$=3.25;
    double taxPercent=0.06;
    // find the total cost for each type of item without tax, then the additional 
    // cost given by tax, then the final cost by adding the two
    
   //Socks:
     double totalSockCost$=(nSocks*sockCost$);   //total cost of socks w/o tax
     double sockTax$=totalSockCost$*taxPercent; // additional tax cost for socks
     double finalSockCost$=totalSockCost$+sockTax$; // cost of socks with tax
         
         //convert each double variable to an int by multiplying by 100, 
         //casting it to an int, then multiply by 100.0
       
        totalSockCost$=totalSockCost$*100;
         sockTax$= sockTax$*100;
         finalSockCost$= finalSockCost$*100;
    
         totalSockCost$=(int)totalSockCost$;
         sockTax$=(int)sockTax$;
        finalSockCost$=(int)finalSockCost$;
        
        totalSockCost$=totalSockCost$/100.0;
         sockTax$= sockTax$/100.0;
         finalSockCost$= finalSockCost$/100.0;
        
        
    
     
   //Glasses
     double totalGlassesCost$=(nGlasses*glassCost$); //total cost of glasses w/o tax
     double glassesTax$=totalGlassesCost$*taxPercent; //additional tax cost for glasses
     double finalGlassesCost$=totalGlassesCost$+glassesTax$; // cost of the glasses with tax
      
        //convert each double to an int by multiplying by 100, casting it to an int, then multiply by 100.0
       
       
        totalGlassesCost$=totalGlassesCost$*100;
        glassesTax$= glassesTax$*100;
        finalGlassesCost$= finalGlassesCost$*100;
    
        totalGlassesCost$=(int)totalGlassesCost$;
        glassesTax$=(int)glassesTax$;
       finalGlassesCost$=(int)finalGlassesCost$;
       
       totalGlassesCost$=totalGlassesCost$/100.0;
        glassesTax$= glassesTax$/100.0;
        finalGlassesCost$= finalGlassesCost$/100.0;
    
    
     
     
   // Envelopes
     double totalEnvelopeCost$=(nEnvelopes*envelopeCost$); //total cost of envelopes w/o tax
     double envelopeTax$=totalEnvelopeCost$*taxPercent; // additional tax cost for envelopes
     double finalEnvelopeCost$=totalEnvelopeCost$+envelopeTax$; //cost of envelopes with tax
            
             //convert each double to an int by multiplying  each variable by 100, 
             //casting it to an int, then multiply by 100.0
             totalEnvelopeCost$=totalEnvelopeCost$*100; 
             envelopeTax$= envelopeTax$*100;
             finalEnvelopeCost$= finalEnvelopeCost$*100;
    
             totalEnvelopeCost$=(int)totalEnvelopeCost$;
             envelopeTax$=(int)envelopeTax$;
             finalEnvelopeCost$=(int)finalEnvelopeCost$;
             
              totalEnvelopeCost$=totalEnvelopeCost$/100.0;
             envelopeTax$= envelopeTax$/100.0;
             finalEnvelopeCost$= finalEnvelopeCost$/100.0;
    
     
     //Total
     double totalTax$=sockTax$+glassesTax$+envelopeTax$; //total tax
     double totalCostWithTax$=finalSockCost$+finalGlassesCost$+finalEnvelopeCost$; // total cost of the purchase
     double totalCostWithoutTax$=totalSockCost$+totalGlassesCost$+totalEnvelopeCost$; // total cost of the purchase
     
     //print out the results for everything
     System.out.println("The cost of the socks without tax is $" + totalSockCost$ ); //print sock cost w/o tax
     System.out.println("The cost of socks with tax is $" + finalSockCost$ + "0");// print sock cost w/ tax and 
     //add a 0 to account for trailing zero that the conversion to int did not show ^
     System.out.println("The cost of the tax on socks is $"  + sockTax$);//print sock tax amount
     
     System.out.println("The cost of glasses without tax is $ " +  totalGlassesCost$); // print glasses cost w/o tax
     System.out.println("The cost of the glasses with tax is $" + finalGlassesCost$); //print glasses cost w/ tax
     System.out.println("The cost of the tax on glasses is $" + glassesTax$ ); //print glasses tax amount
     
     System.out.println("The cost of envelopes without tax is $" + totalEnvelopeCost$); // print envelope cost w/o tax
     System.out.println("The cost of envelopes with tax is $"  + finalEnvelopeCost$); // print envelope cost w/ tax
     System.out.println("The cost of the tax on envelopes is $" + envelopeTax$); // print envelope tax amount 
     
     System.out.println("The final tax amount is $" + totalTax$); // print total tax cost
     System.out.println("The total cost of the purchase without tax is $" + totalCostWithoutTax$); // print total cost of the purchase without tax
     System.out.println("The total cost of the purchase is $"  + totalCostWithTax$ + "0"); // print total cost of the purchase
      //add a 0 to account for trailing zero that the conversion to int did not show ^
     
    }
}