//Camden Fischer
//you need to use do-while loops and the random number generator to
//generate an integer between 0 and 100. You will first need to 
//print out the number. If the number is even, you will then print 
//out that number of “*” characters; if the number is odd, then you will 
//print out that number of “&” characters.
public class MakeSymbols{
    public static void main(String[] args){
        double num = Math.random()*100;
        int int1 = (int) num;
        int count = 0;
        System.out.println("Random number generated: "+int1);
        if (num % 2 != 0){
        do{
            System.out.print("&");
            count++;
            }while(count<num);
        }
         else {
             do{
                 System.out.print("*");
                 count++;
             }while(count<num);
         }   
    }//end of container
}//end of class