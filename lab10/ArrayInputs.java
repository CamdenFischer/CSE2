import java.util.Scanner;
public class ArrayInputs{
    public static void main(String[]  args){
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter the size of the array: ");
        int n = scan.nextInt();
        int[] array;
        array = new int[n];
        int i = 0;
        int t = 0;
        while (t == 0){
            while (i < n){
                System.out.println("Enter an int for array["+i+"]");
                int m = scan.nextInt();
                boolean check = check(m);
                if (check==true){
                    array[i]=m;
                }
                else {
                    System.out.println("You have to enter a positive int");
                    break;
                }
                i++;
            }
            if (i == n){
                t =1;
            }
        }
        System.out.println("The array is:");
        for (int o = 0; o<i;o++){
            System.out.println(array[o]);
        }
        
    }
    public static boolean check(int m){
        if ((m > 0)&&(m == (int) m)){
            return true;
        }
        else {
            return false;
        }
    }
}