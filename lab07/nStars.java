import java.util.Scanner;
public class nStars{
    public static void main(String[] args){
        Scanner myScanner;
        myScanner = new Scanner ( System.in );
        do{
            System.out.println("Enter an int between 3 and 33\n");
            if (myScanner.hasNextInt()) {
                int nStars = myScanner.nextInt();
                if ((nStars >= 3)&&(nStars <= 33)){
                    int count = 0;
                    while (count<nStars){
                        System.out.print("*");
                        count++;
                    } //end of first line of stars
                    System.out.println("");
                    int count1 = 0;
                    int nSpaces = 0;
                    while (count1<nStars){
                        nSpaces = 0;
                        while(nSpaces<count1){
                            System.out.print(" ");
                            nSpaces++;
                        }
                        System.out.print("*\n");
                        count1++;
                    }//end of diagnal line
                    int count2=0;
                    while(count2<nStars){
                        System.out.print("*");
                        count2++;
                    }//end of last line of stars
                    System.out.println("");
                }
                else {
                    System.out.print("Invalid input");
                }
            }
            else {
                System.out.print("Invalid input");
            }
            System.out.print("Enter y or Y to go again\n");
            char ch = myScanner.next().charAt(0);
            if ( ch != 'y'){
                break;
            }
        } while(true);
    }//end of method
}//end of class