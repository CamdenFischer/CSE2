public class Arithmetic {
    public static void main(String[] args) {
        int nSocks=3; //Number of pairs of socks
        double sockCost$=2.58; //Cost for a pair of socks
        int nGlasses=6; //Number of drinking glasses
        double glassCost$=2.58; //Cost for a drinking glass
        int nEnvelopes=1; //Number of boxes of envelopes
        double envelopeCost$=3.25; //Cost of a box of envelopes
        double taxPercent=0.06;
        // calculate cost without tax for each item separately
        // "first" means before tax
        double firstSockCost$=nSocks*sockCost$; //Cost of socks without tax
        double firstGlassesCost$=nGlasses*glassCost$; //Cost of glasses without tax
        double firstEnvelopeCost$=nEnvelopes*envelopeCost$; //Cost of envelopes without tax
        // calculate sales tax for each item
        double taxSocks=firstSockCost$*taxPercent;
        double taxGlasses=firstGlassesCost$*taxPercent;
        double taxEnvelopes=firstEnvelopeCost$*taxPercent;
        //Total cost for each item
        double totalSockCost=firstSockCost$+taxSocks;
        double totalGlassesCost=firstGlassesCost$+taxGlasses;
        double totalEnvelopesCost=firstEnvelopeCost$+taxGlasses;
    
        double firstTotalCost=firstSockCost$+firstGlassesCost$+firstEnvelopeCost$; //total cost without tax
        double totalTax=firstTotalCost*taxPercent; //total tax
        double totalCost=firstTotalCost+totalTax; //total cost with tax
        //Now i need to multiply many of my doubles by 100, cast to int, 
        //then divide by 100 so they come out as clean decimals
        //the variable name "hundred" represents that it is 100 times its acutal value
        taxSocks=taxSocks*100;                  //tax socks
        int hundredTaxSocks= (int) taxSocks;    //tax socks
        int intTaxSocks = hundredTaxSocks/100;  //tax socks
        
        totalSockCost=totalSockCost*100;           //total sock cost
        int hundredSockCost= (int) sockCost$;        //total sock cost
        int intTotalSockCost=hundredSockCost/100;    //total sock cost
        
        taxGlasses=taxGlasses*100;                  //tax glasses
        int hundredTaxGlasses = (int) taxGlasses;   //tax glasses
        int intTaxGlasses = hundredTaxGlasses/100;  //tax glasses
        
        totalGlassesCost=totalGlassesCost*100;          //total glasses cost
        int hundredGlassesCost= (int) totalGlassesCost; //total glasses cost
        int intTotalGlassesCost=hundredGlassesCost/100;      //total glasses cost
        
        taxEnvelopes=taxEnvelopes*100;              //taxEnvelope
        int hundredTaxEnvelope=(int) taxEnvelopes;  //tax envelope
        int intTaxEnvelopes=hundredTaxEnvelope/100;  //tax envelope
    
        totalEnvelopesCost=totalEnvelopesCost*100;          //total envelope cost
        int hundredEnvelopesCost=(int) totalEnvelopesCost;  //total envelope cost
        int intTotalEnvelopesCost=hundredEnvelopesCost/100; //total envelope cost
        
        totalTax=totalTax*100;
        int hundredTotalTax=(int) totalTax;
        int intTotalTax=hundredTotalTax/100;
        
        
        
        //print out, on separate lines:
        //the item being bought
        //how many of the item was bought
        //the cost per item
        //then compute and display the cost of each item 
        //and the sales tax for that item
        //Then compute and display the total cost of purchases(before tax)
        //the total sales tax
        //and the total cost with tax  
        
        //print out each item and how much of it was bought and how many
        //socks
        System.out.println("--All decimals are rounded down--");
        System.out.println("Item: Socks");
        System.out.println("Cost: "+sockCost$+"$ per pair");
        System.out.println("Quantity: "+nSocks+" pairs");
        System.out.println("Sales tax: "+intTaxSocks+"$");
        System.out.println("Total cost (Socks): "+intTotalSockCost+"$");
        //Glasses
        System.out.println("Item: Glasses");
        System.out.println("Cost: "+glassCost$+"$");
        System.out.println("Quantity: "+nGlasses+" glasses");
        System.out.println("Sales tax: "+intTaxGlasses+"$");
        System.out.println("Total Cost (glasses): "+intTotalGlassesCost+"$");
        //Envelopes
        System.out.println("Item: Box of Envelopes");
        System.out.println("Cost: "+envelopeCost$+"$");
        System.out.println("Quantity: "+nEnvelopes+" boxes");
        System.out.println("Sales tax: "+intTaxEnvelopes+"$");
        System.out.println("Total Cost (Envelopes): "+intTotalEnvelopesCost+"$");
        //totals
        System.out.println("Total cost without tax: "+firstTotalCost+"$"); //total cost without tax
        System.out.println("Total tax: "+intTotalTax+"$"); //total tax
        System.out.println("Final cost: "+totalCost+"$"); //total cost with tax
        
        
        
        
    }
}