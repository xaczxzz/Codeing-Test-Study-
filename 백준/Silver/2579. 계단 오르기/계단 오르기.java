import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args)  throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int [] arr = new int [301];
        int [] sum = new int [301];

        for(int i=0; i<N; i++){
            arr[i]  = Integer.parseInt(br.readLine());
        }
        sum[0]= arr[0];
        sum[1] = arr[1] + arr[0];
        sum[2] = Math.max(arr[0],arr[1]) + arr[2];
        for(int i = 3; i<N; i++){
            sum[i] = Math.max(sum[i-3]+arr[i-1],sum[i-2]) + arr[i];
        }
        System.out.println(sum[N-1]);

    }

}
