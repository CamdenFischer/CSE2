//Camden Fischer
//3/24/15/
//You are designing a GAME! YES! 
//The main method is provided as below. Please read it carefully and write the missing methods. Please do not change the main method
import java.util.Scanner;
public class HW8{
    public static void main(String[] args) {
        char option;
        Scanner scan;
        scan = new Scanner ( System.in );
        System.out.println("Welcome to MG's adventure world. Now your journey begins. Good luck!");
        System.out.println("Please hit 'C' or 'c' to continue, anything else to quit-");
        String input = getInput(scan, "Cc");
        System.out.println("You are in a dead valley.");
        System.out.println("Please hit 'C' or 'c' to continue, anything else to quit-");
        input = getInput(scan, "Cc");
        System.out.println("You walked and walked and walked and you saw a cave!");
        cave();
        System.out.println("Please hit 'C' or 'c' to continue, anything else to quit-");
        input = getInput(scan, "Cc");
        System.out.println("You entered a cave!");
        System.out.println("Please hit 'C' or 'c' to continue, anything else to quit-");
        input = getInput(scan, "Cc");
        System.out.println("Unfortunately, you ran into a GIANT!");
        giant();
        System.out.println("Enter 'A' or 'a' to Attack, 'E' or 'E' to Escape, ANYTHING else is to YIELD");
        input = getInput(scan, "AaEe", 10);
        System.out.println("Congratulations! You SURVIVED! Get your REWARD!");
        System.out.println("There are three 3 tressure box in front of you! Enter the box number you want to open!");
        box();
        input = getInput(scan);
        System.out.println("Hero! Have a good day!");
    }//end of main method
    public static void giant() {
        System.out.println("                                 ---------                    ");
        System.out.println("                                |  /    \\|                   ");
        System.out.println("                      ZZZZZH    |    O    |    HZZZZZ             ");
        System.out.println("                           H     -----------   H              ");
        System.out.println("                      ZZZZZHHHHHHHHHHHHHHHHHHHHHZZZZZ                   ");
        System.out.println("                           H    HHHHHHHHHHH    H                      ");
        System.out.println("                      ZZZZZH    HHHHHHHHHHH    HZZZZZ               ");
        System.out.println("                                HHHHHHHHHHH                   ");
        System.out.println("                                HHH     HHH                   ");
        System.out.println("                               HHH       HHH                   ");
    }
    public static void cave() {
        System.out.println("                              *****   * * * * * * * *        ");
        System.out.println("                         ***         ***                      ");
        System.out.println("                      ***               ***                   ");
        System.out.println("                 |    ***               ***                   ");
        System.out.println("                 |    ***               ***                   ");
        System.out.println("             O __|__  ***               ***                   ");
        System.out.println("           ******l    ***               ***                   ");
        System.out.println("            * *       ***               ***                   ");
        System.out.println("           *   *      ********************* * * * * * *       ");
    }
    public static void box(){
        System.out.println("                      *********************     *********************    *********************             ");
        System.out.println("                     ***               ***     ***               ***    ***               ***              ");
        System.out.println("                     ***       1       ***     ***       2       ***    ***       3       ***              ");
        System.out.println("                     ***               ***     ***               ***    ***               ***              ");
        System.out.println("                     *********************     *********************    *********************               "); 
    }
    
    
    public static String getInput (Scanner scan, String string){
        String input = scan.next();
        if (input.equals("c")||input.equals("C")){
            return "go";
        }
        else {
            System.out.println("Yea right LOSER!");
            System.exit(0);
            return("k");
        }
    }//end of get input 
    
    
    public static String getInput (Scanner scan, String string, int trial){
        int end = 0;
        int attacks = 0;
        while (attacks < 10){
                String input = scan.next();
                if (input.equals("a")||input.equals("A")){
                    double chance = Math.random()*1;
                    if (Math.round(chance) == 0){
                        attacks+=1;
                        System.out.println("Critical Hit!");
                        System.out.println("Enter 'A' or 'a' to Attack, 'E' or 'E' to Escape, ANYTHING else is to YIELD");
                    }
                    else {
                        System.out.println("Gosh! How do you miss!");
                        System.out.println("Enter 'A' or 'a' to Attack, 'E' or 'E' to Escape, ANYTHING else is to YIELD");
                    }
                }
                else if (input.equals("e")||input.equals("E")){
                    double chanceE = Math.random()*11;
                    int chanceE1 = (int) chanceE;
                    if (chanceE1 == 10){
                        System.out.println("You escaped!");      
                        System.exit(0);
                    }
                    else {
                        System.out.println("You failed to escape!");
                        System.out.println("Enter 'A' or 'a' to Attack, 'E' or 'E' to Escape, ANYTHING else is to YIELD");
                    }
                }
                else { 
                    System.out.println("Executed by giant! Game over!");
                    System.exit(0);
                }

        }
        return("k");
    }//end of second get input
    public static String getInput(Scanner scan){
        int num = scan.nextInt();
        switch (num){
            case 1: System.out.println("You found $20!");
            break;
            case 2: System.out.println("You found $10!");
            break;
            case 3: System.out.println("You found $50!");
            break;
            default: System.out.println("A Wrong Number! You get nothing! Better restart the game LOL");
            break;
        }//end of switch
        return("k");
    }
    
    
    
}//end of class


