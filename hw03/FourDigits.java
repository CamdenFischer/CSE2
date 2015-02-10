//Write a program that prompts the user to enter a double 
//and  then prints out the first four digits to the right of the decimal point. 
//Store the program in  FourDigits.java. 
//Hint: Casting the number to an int twice, once before and once after multiplication by 10000, 
//is useful in both samples below. The second sample also requires you to access the individual 
//digits of the int you get by implementing the first line of this hint. 
//Using / and % is useful in extracting the individual digits.
import java.util.Scanner;
public class FourDigits {
    public static void main(String[] args) {
        Scanner myScanner;
        myScanner = new Scanner( System.in ); 
        System.out.print("Enter a double and I display the four digits to the right of the decimal point: ");
        double number = myScanner.nextDouble(); //take in the number
        int firstInt = (int) number; // cast it to an int
        //i then return the remainder of the number divided by the int
        // i add the small decimal because results were sometimes coming too low
        //then i multiply to get rid of the decimal
        double number1 = ((number % firstInt) + 0.000001) * 10000;
        int secondInt = (int) number1;
        //Here i will add zeroes based on how many digits secondInt is
        //If the decimal starts with a 0 then this is needed for the zero to print
        if ( secondInt >= 1000 )
            {
                System.out.println(secondInt); 
            }
        
        
        if (( secondInt < 1000 ) && ( secondInt >= 100 ))
            {
                System.out.println("0"+secondInt+"\n"); 
            }
        
        
        if ( secondInt < 100 )  
            {
                 System.out.println("00"+secondInt+"\n"); 
            }
        
    }
}