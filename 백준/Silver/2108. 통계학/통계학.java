import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
    int N = sc.nextInt();
    int [] arr = new int [N];
    double sum = 0;
    for(int i = 0; i < N; i++){
        arr[i] = sc.nextInt();
        sum += arr[i];
    }
    Arrays.sort(arr);
    int count =0;
    int max =-1;
    int mod = arr[0];
    boolean flag = false;
    for(int i = 0; i < N - 1; i++) {
        if(arr[i] == arr[i + 1]) {
            count++;
        }else {
            count = 0;
        }

        if(max < count) {
            max = count;
            mod = arr[i];
            flag = true;
        }else if(max == count && flag == true) {
            mod = arr[i];
            flag = false;
        }
    }
    System.out.println(Math.round(sum/N));
    System.out.println(arr[N/2]);
    System.out.println(mod);
    System.out.println(arr[N-1]-arr[0]);
    }
}