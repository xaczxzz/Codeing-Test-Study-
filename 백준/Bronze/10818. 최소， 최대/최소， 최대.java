import java.util.Scanner;

public class Main
{
    public static void main(String []args){
        Scanner sc = new Scanner (System.in);
        int N = sc.nextInt();
        int [] intArray;
        intArray = new int[N];
        int min = 10000001;
        int max = -10000001;
        for(int i = 0; i<intArray.length; i++){
            intArray[i] = sc.nextInt();
        }
        for(int i = 0; i<intArray.length; i ++){
            
            if (intArray[i] > max){
                max = intArray[i];
            }
            if (intArray[i] < min){
                min = intArray[i];
            }
        }
        System.out.println(min+" "+max);
    }
}
