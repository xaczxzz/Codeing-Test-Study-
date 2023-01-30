import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static PriorityQueue <Integer> que = new PriorityQueue<>();
    public static void main(String[] args) throws Exception {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb =new StringBuilder();

       int N = Integer.parseInt(st.nextToken());
       int [] arr = new int [N+1];
       if(N==1||N==2){
           if(N==1){
               sb.append(1);
               sb.append("\n");
           }
           else{
               sb.append(2);
               sb.append("\n");
           }
       }
       else{
           arr[0] = 1;
           arr[1] = 2;
           int result=0;
           for(int i=2; i<N; i++){
                arr[i] = (arr[i-1]+arr[i-2])%10007;
                result = arr[i];
           }
           sb.append(result);
           sb.append("\n");
       }
        System.out.println(sb);
    }
}
