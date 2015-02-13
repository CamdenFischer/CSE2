import java.util.Scanner;
public class Cookies {
    public static void main(String[] args) {
        Scanner myScanner;
        myScanner = new Scanner ( System.in );
        System.out.print("Enter the number of people: ");
        if(myScanner.hasNextInt()){ //first
            int nPeople = myScanner.nextInt(); //number of people
            System.out.print("Enter the number of cookies you are planning to buy: ");
            if(myScanner.hasNextInt()){ //second
                int nCookies = myScanner.nextInt(); //number of total cookies
                System.out.print("Enter the number of cookies you want each person to have ");
                if(myScanner.hasNextInt()){ //third
                    int nPerPerson = myScanner.nextInt(); //number of cookies per person
                    int nNeeded = nPeople * nPerPerson; //number of cookies needed
                    if ((nPeople < 0) || (nCookies < 0) || (nPerPerson < 0)) {  //stop the program if a negative number is entered
                        System.out.println("You cannot enter a negative number"); }
                    else if ((nPeople >= 0) && (nPeople >= 0) && (nPerPerson >=0)) { //if all values are greater or equal to 0
                        if ( nCookies >= nNeeded ) { //if you have enough cookies
                            if ( nCookies % nPeople == 0) {
                            System.out.println("You have enough cookies for each person and the amount will divide evenly"); }
                            else {
                                System.out.println("You have enough cookies for each person but the amount will not divide evenly"); }
                        }            
                        else if ( nCookies < nNeeded ) { //not enough cookies
                            System.out.println("You will not have enough cookies. You need to but at least " +(nNeeded-nCookies)+ " more"); }
                    }
                } //third hasnextint
                else {
                    System.out.println("You must enter an integer");
                }
            }//second hasnextint
            else {
                    System.out.println("You must enter an integer");
                }
        } //first hasnextint
        else {
                    System.out.println("You must enter an integer");
                }
    } //end of method
} //end of class
