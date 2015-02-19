//Camden Fischer
//write a program that asks for a double and displays the four digits
//to the right of the decimal place
import java.util.Scanner;
public class FourDigits {
    public static void main (String[] args) {
        Scanner myScanner;
        myScanner = new Scanner ( System.in );
        System.out.println("Enter a double and I display the four digits right of the decimal point");
        double n = myScanner.nextDouble();
        int i = (int) n; //convert double to int
        double y = (double) i; //convert back to double
        double x = (n % y) * 10000; //the double % int * 1000 will bring back the four digits past the decimal
        int finalInt = (int) x; //change final back to int
        //i have to do this to display zeroes if they are there
        if (finalInt >= 1000) {
            System.out.println("The four digits are "+finalInt);
        }
        else if (finalInt < 1000 && finalInt >=100) {
            System.out.println("The four digits are 0"+finalInt);
        }
        else if (finalInt < 100 && finalInt >=10){
            System.out.println("The four digits are 00"+finalInt);
        }
        else {
            System.out.println("The four digits are 000"+finalInt);
        }
    } //end of container
} //end of class