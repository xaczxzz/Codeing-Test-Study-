import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static boolean PrimeNumber(int K){
        if ( K <2){
            return false;
        }
        for (int i= 2; i*i <=K; i++){
            if(K %i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int count = 0;
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            int K = Integer.parseInt(st.nextToken());
            if (PrimeNumber(K) == true){
                count++;
            }
           

        }
        System.out.println(count);
    }
}