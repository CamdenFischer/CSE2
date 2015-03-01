public class SmileGenerator{
    public static void main(String[] args) {
        for(int n=0; n < 6; n++){
            System.out.print(":)");
        } //end of first for
        System.out.println("\n");
        double rand = Math.random()* 100 +1;
        int i = (int) rand;
        int count1 = 0;
        while (count1 < rand){
            System.out.print(":)");
            count1++;
        }//end of while loop
        System.out.println("\n");
        int count = 0;
        while(count < rand){
            if (rand > 30){
                while (count < 30){
                    System.out.print(":)");
                    count++;
                }
                System.out.println("\n");
                while (count >= 30 && count < 60){
                    System.out.print(":)");
                    count++;
                }
                System.out.println("\n");
                while (count >= 60 && count < 90) {
                    System.out.print(":)");
                    count++;
                }
                System.out.println("\n");
                while (count >= 90 && count <=100){
                    System.out.print(":)");
                    count++;
                }
            }
            else if (rand <= 30){
                System.out.print(":)");
                count++;
            }
        }//end of while loop
        System.out.println("\n");
        int count2 = 0;
        int smilesPerLine = 1;
        while (count2 < 10) {
            switch( smilesPerLine ){
                case 1:
                    System.out.print(":) \n");
                    count2++;
                    break;
                case 2:
                    System.out.print(":):) \n");
                    count2+=2;
                    break;
                case 3:
                    System.out.print(":):):) \n");
                    count2+=3;
                    break;
                case 4:
                    System.out.print(":):):):) \n");
                    count2+=4;
                    break;
                case 5:
                    System.out.print(":):):):):) \n");
                    count2+=5;
                    break;
                case 6:
                    System.out.print(":):):):):):) \n");
                    count2+=6;
                    break;
                case 7:
                    System.out.print(":):):):):):):) \n");
                    count2+=7;
                    break;
                case 8:
                    System.out.print(":):):):):):):):) \n");
                    count2+=8;
                    break;
                case 9:
                    System.out.print(":):):):):):):):):) \n");
                    count2+=9;
                    break;
                case 10:
                    System.out.print(":):):):):):):):):):)\n");
                    count2+=10;
                    break;
                case 11:
                    System.out.print(":):):):):):):):):):):)\n");
                    count2+=11;
                    break;
                case 12:
                    System.out.print(":):):):):):):):):):):):)\n");
                    count2+=12;
                    break;
                case 13:
                    System.out.print(":):):):):):):):):):):):):)\n");
                    count2+=13;
                    return;
            }
            smilesPerLine++;
        }//end of while loop
        
    }//end of method
}//end of class