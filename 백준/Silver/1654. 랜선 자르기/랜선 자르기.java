import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();

        int arr [] = new int [N];

        long max = 0;
        long min=1;

        for(int i=0; i<N; i++){
            arr[i] = sc.nextInt();
            if(arr[i]>=max){
                max = arr[i];
            }
        }
        while(min<=max){
            long cnt = 0;
            long mid = (max+min)/2;

            for(int i=0; i<N; i++){
                cnt += (arr[i]/mid);
            }
            
            if(cnt < K){
                max = mid-1;
            }
            else{
                min = mid+1;
            }
        }
        System.out.println(max);

    }

}
