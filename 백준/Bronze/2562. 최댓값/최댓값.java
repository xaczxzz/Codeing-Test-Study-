import java.util.Scanner;

public class Main
{
    public static void main(String []args){
        Scanner sc = new Scanner (System.in);
        int [] intArray;
        intArray = new int [9];
        int count = 0;
        for (int i = 0; i<intArray.length; i++){
            intArray[i] = sc.nextInt();
        }
        int max = -10000001;
        for (int i = 0; i < intArray.length; i++){
            if (intArray[i] > max){
                max = intArray[i];
                count = i+1;
            }
        }
        System.out.println(max);
        System.out.println(count);
    }
}
