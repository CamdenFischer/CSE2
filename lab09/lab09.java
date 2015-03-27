import java.util.Scanner;
public class lab09 {
    public static void main(String[] args){
        Scanner scan = new Scanner (System.in);
        int n = 0;
        while (n == 0){
            System.out.print("The "+adj()+" "+adj()+" "+sub()+" "+verb()+" the "+adj()+" "+obj());
            System.out.println("\nEnter 0 to go again, any other int to stop.");
            n = scan.nextInt();
        }//end of while

        }//end of main method
        
        
        public static String adj(){
            double x = Math.random()*10;
            int rand = (int) x;
            String adj = "";
            switch (rand){
                case 0: adj = "blind";
                break;
                case 1: adj = "slow";
                break;
                case 2: adj = "fat";
                break;
                case 3: adj = "dumb";
                break;
                case 4: adj = "smart";
                break;
                case 5: adj = "tall";
                break;
                case 6: adj = "funny";
                break;
                case 7: adj = "fast";
                break;
                case 8: adj = "sly";
                break;
                case 9: adj = "sleeping";
                break;
            }
            return(adj);
        }//end of adjective class
        
        public static String sub(){
            double x = Math.random()*10;
            int rand = (int) x;
            String sub = "";
                switch (rand){
                case 0: sub = "cat";
                break;
                case 1: sub = "tree";
                break;
                case 2: sub = "car";
                break;
                case 3: sub = "house";
                break;
                case 4: sub = "monster";
                break;
                case 5: sub = "alien";
                break;
                case 6: sub = "mom";
                break;
                case 7: sub = "lawyer";
                break;
                case 8: sub = "pencil";
                break;
                case 9: sub = "thief";
                break;
                }
                return sub;
        }//end of subject class
        
        public static String verb(){
            double x = Math.random()*10;
            int rand = (int) x;
            String verb = "";
                switch (rand){
                case 0: verb = "ran";
                break;
                case 1: verb = "ate";
                break;
                case 2: verb = "slept";
                break;
                case 3: verb = "tripped";
                break;
                case 4: verb = "cried";
                break;
                case 5: verb = "fought";
                break;
                case 6: verb = "played";
                break;
                case 7: verb = "tripped";
                break;
                case 8: verb = "jumped";
                break;
                case 9: verb = "yelled";
                break;
                }
                return verb;
        }//end of verb class
        
        public static String obj(){
            double x = Math.random()*10;
            int rand = (int) x;
            String obj = "";
                switch (rand){
                case 0: obj = "coffee cup";
                break;
                case 1: obj = "dog";
                break;
                case 2: obj = "car";
                break;
                case 3: obj = "pencil";
                break;
                case 4: obj = "desk";
                break;
                case 5: obj = "television";
                break;
                case 6: obj = "window";
                break;
                case 7: obj = "movie";
                break;
                case 8: obj = "cell phone";
                break;
                case 9: obj = "girlfriend";
                break;
                }
                return obj;
        }//end of object class
}//end of class