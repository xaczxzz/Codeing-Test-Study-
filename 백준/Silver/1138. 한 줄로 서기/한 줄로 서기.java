import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int [] arr =new int[N+1];
        int [] answer =new int [N+1];
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++){
            int sit = Integer.parseInt(st.nextToken());
            for(int j=0; j<N; j++){
                if(sit == 0&answer[j]==0){
                    answer[j]  = i+1;
                    break;
                }
                else if(answer[j] ==0){
                    sit--;
                }
            }

        }
        for(int i=0; i<N; i++){
            System.out.print(answer[i]+" ");
        }
    }
}