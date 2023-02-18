import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int L = Integer.parseInt(st.nextToken());
        boolean flag = false;
        StringBuilder sb = new StringBuilder();
        while (L<=100){
            long s = N/L - (L-1)/2;
            if(s <0){
                break;
            }
            if(N==(s * 2+ L-1)*L/2){
                for(int j=0; j<L; j++){
                    sb.append(s+j+ " ");
                }
                flag =true;
                break;
            }
            L++;
            }
        if(!flag){
            sb.append(-1);
        }
        System.out.println(sb);
    }
}