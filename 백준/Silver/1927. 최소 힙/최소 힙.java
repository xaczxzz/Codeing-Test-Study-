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
        int cnt = 0;
        for(int i=0; i<N; i++){
            st = new StringTokenizer(br.readLine());
            int cmd = Integer.parseInt(st.nextToken());
            if(cmd>0){
                que.add(cmd);
            }
            else {
                if(!que.isEmpty()){
                    sb.append(que.poll());
                    sb.append("\n");
                }
                else{
                    sb.append(0);
                    sb.append("\n");
                }
            }
        }
        System.out.println(sb);
    }
}
