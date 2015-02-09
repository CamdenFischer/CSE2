// Write a program that prompts the user to enter a double
//and then prints out a crude estimate of the cube root
//of the number and the value of this crude guess when cubed. 
//Save your program in the file Root.java. If x is the number entered. 
//Then start by guessing the square root is x/3. Then improve your 
//estimate by replacing “guess” in the following expression with your 
//first estimate, x/3: (guess*guess*guess+x)/(3*guess*guess) 
//Improve your estimate four more times by continuing to 
//substitute your last estimate for “guess” in the expression above.  
//For example, to find a crude guess for the cube root of 27, guess 27/3=9. 
//Then replace guess with
//(2*guess*guess*guess+x)/(3*guess*guess) = (2*9*9*9+27)/(3*9*9) 
//= (2*729+27)/(243) = 6. (As you can see the early estimates can
//be pretty inaccurate) 
import java.util.Scanner;
public class Root {
    public static void main(String[] args) {
        Scanner myScanner;
        myScanner = new Scanner( System.in ); 
        System.out.print("Enter the number: "); //ask for a double
        double x = myScanner.nextDouble(); //make x the entered double
        double cubertX = x/3; // this is just a guess
        double guess1 = (2*cubertX*cubertX*cubertX+x)/(3*cubertX*cubertX);//make
        double guess2 = (2*guess1*guess1*guess1+x)/(3*guess1*guess1);//     the
        double guess3 = (2*guess2*guess2*guess2+x)/(3*guess2*guess2);//     guess
        double guess4 = (2*guess3*guess3*guess3+x)/(3*guess3*guess3);//     more    
        double guess5 = (2*guess4*guess4*guess4+x)/(3*guess4*guess4);//     accu
        double guess6 = (2*guess5*guess5*guess5+x)/(3*guess5*guess5);//     rate
        double newX = (guess6 * guess6 * guess6);
        System.out.println("The cube root is "+guess4+": "+guess4+"*"+guess4+"*"
        +guess4+"="+newX+"\n");
    }

    
}