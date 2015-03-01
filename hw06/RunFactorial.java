//Camden Fischer
//use while-loop to solve factorial programs. 
//Using scanner, you will first input an integer that is 
//between 9 and 16 inclusively. Then you need to calculate the factorial
//of the input number.
import java.util.Scanner;
public class RunFactorial{
    public static void main(String[] args){
        Scanner myScanner;
        myScanner = new Scanner ( System.in );
        System.out.println("Please enter an integer between 9 and 16");
        int numb = myScanner.nextInt();
        int fact = 1;
        if (numb >= 9&&numb <=16){
            while (numb > 0){
                fact *= numb;
                numb--;
            }//end of while
        }//end of if
        else {
            System.out.println("Invalid input");
        }
        System.out.print(fact);
        }//end of method
}//end of class