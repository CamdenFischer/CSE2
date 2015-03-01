import java.util.Scanner;
public class GetIntegers{
    public static void main(String[] args){
        Scanner myScanner;
        myScanner = new Scanner ( System.in );
        int count = 0;
        int sum = 0;
        System.out.println("Please enter 5 non-negative numbers");        
        while (count < 5){
            int number = 0;
            if (myScanner.hasNextInt()){
                int num = myScanner.nextInt();
                if (num >= 0){
                sum+=num;
                count++;
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
        }//end of while
        System.out.println("The sum is "+sum+ "\n");
    }//end of method
}//end of class