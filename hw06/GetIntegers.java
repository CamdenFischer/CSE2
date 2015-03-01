//Camden Fischer
//Ask the user for 5 non-negative integers 
//(if an invalid value is entered, then ask again, using a loop), 
//and print out the sum of the 5 integers. Please write the program 
//using non-nested for-loops.
import java.util.Scanner;
public class GetIntegers{
    public static void main(String[] args){
        Scanner myScanner;
        myScanner = new Scanner ( System.in );
        int sum = 0;
        System.out.println("Please enter 5 non-negative numbers");        
        for (int count = 0; count < 5; count++){
            if (myScanner.hasNextInt()){
                int num = myScanner.nextInt();
                if (num >= 0){
                sum+=num;
                }
                else {
                    System.out.println("You cannot enter a negative number");
                    break;
                }
            }//end of if
            else {
                System.out.println("You did not enter an int");
                break;
            }//end of else
        }//end of for
        System.out.println("The sum is "+sum+ "\n");
    }//end of method
}//end of class