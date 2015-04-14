import java.util.Scanner;
public class lab11{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int array1[] = new int[50];
        int array2[] = new int[50];
        int max1 = 0;
        int min1 = 100;
        for (int i = 0; i < 50; i++){
            double n = Math.random() * 100;
            int t = (int) n;
            array1[i] = t;
            if (t > max1){
                max1 = t;
            }
            if (t<min1){
                min1 = t;
            }
        }
        int x1 = 0;
        int x2 = 100;
        int max2 = 0;
        int min2 = 9999999;
        for (int i = 0; i < 50; i++){
            double n = (Math.random() + x1)*x2;
            int t = (int) n;
            array2[i] = t;
            if ( t > max2){
                max2 = t;
            }
            if ( t < min2){
                min2 = t;
            }
            x1+=100;
            x2+=100;
        }
        System.out.println(array2.length);
        System.out.println("The maximum of array1 is: "+max1+
        "\n The minimum of array1 is: "+min1);
        System.out.println("The maximum of array2 is: "+max2+
        "\n The minimum of array2 is: "+min2);
        System.out.println("Enter an int");
        int search = scan.nextInt();
        boolean check;
        if (search > 0){
            if (array2[50/2] != search){
              //  if array2[(50/2)-]
            }
            else {
                check = true;
            }
        }
    }//end of main method  
}//end of class