//Camden Fischer
//Write a program that forces the user to enter an integer between 1 and 30, 
//inclusive, and then prints out displays that depend on the value entered
import java.util.Scanner;
public class waves{
    public static void main(String[] args){
        Scanner myScanner;
        myScanner = new Scanner ( System.in );
        System.out.print("Enter a number between 1 and 30: ");
        if (myScanner.hasNextInt()) {
            int n = myScanner.nextInt();
            int count =0;
            int count2=0;
            int nSpaces = 0;
            int count1=0;
            if ( ( n >=1 ) && ( n<=30 ) ){
                //count up
                System.out.print("For Loop\n");
                for (count1=0; count1<=n; count1++){
                    for (nSpaces=0; nSpaces<count1; nSpaces++){
                        System.out.print(" ");
                    }
                    System.out.print(count1+"\n");
                }
                //now i have it count down
                for (count1-=2; count1>=0; count1--){
                    nSpaces=count1;
                    for (nSpaces=nSpaces-1; nSpaces>=0; nSpaces--){
                        System.out.print(" ");
                    }
                    System.out.print(count1+"\n");
                }
                //count up
                System.out.print("While loop\n");
                while (count<=n){
                    nSpaces = 0;
                    while(nSpaces<=count){
                        System.out.print(" ");
                        nSpaces++;
                    }
                    System.out.print(count+"\n");
                    count++;
                }//end of while
                //now i have it count down
                count-=2;
                while (count>=0){
                    nSpaces=count;
                    while(nSpaces>=0){
                        System.out.print(" ");
                        nSpaces--;
                    }
                    System.out.print(count+"\n");
                    count--;
                }
                //count up
                System.out.print("Do While\n");
                do {
                    nSpaces=0;
                    do{
                        System.out.print(" ");
                        nSpaces++;
                    }while(nSpaces<count2+1);
                    System.out.print(count2+"\n");
                    count2++;
                }while(count2<n+1);
                //now i have it count down
                count2-=2;
                do{
                    nSpaces=count2+1;
                    do{
                       System.out.print(" ");
                       nSpaces--;
                    }while(nSpaces>0);
                    System.out.print(count2+"\n");
                    count2--;
                }while(count2>=0);
                
            
                
            }//if number is between 1 and 30
            else {
                System.out.println("Your number was not between 1 and 30");
            }//end of else
        }//end of hasnextint
        else {
            System.out.println("You did not enter an int");
        }//end of else
        
    }//end of method
}//end of class