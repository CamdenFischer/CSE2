import java.util.Scanner;
public class Factorials {
    public static void main(String[] args) {
        Scanner scan;
        scan = new Scanner ( System.in );
        System.out.println("Enter a number:");
        System.out.println("");
        if (scan.hasNextInt()){
            int n = scan.nextInt();
            int factN = Factorial(n);
            System.out.println("The factorial of "+n+" is "+factN);
            int sFactN = print(n);
            System.out.println("The super factorial is "+sFactN);
        }//end of hasnextint
    }//end of main method
    
    
    public static int Factorial(int input){
        int fact = 1;
        while (input > 0){
            fact *=input;
            input--;
        }//end of while
        return fact;
    }//end of factorial class
    
    
    public static int print(int input){
        int fact = 1;
        int superF = 0;
        int n = input;
        while ( n > 0){
            input = n;
            fact = 1;
            while (input > 0){
                fact*=input;
                input--;
            }//end of first while
            superF+=fact;
            n--;
        }//end of second while
        return superF;
    }//end of print class
    
}//end of class