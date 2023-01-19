import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Queue <Integer> que = new LinkedList<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int num =0;
        int N = Integer.parseInt(st.nextToken());
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<N; i++){
            st = new StringTokenizer(br.readLine());
            String option = "";
            option = st.nextToken();
            if(option.equals("push")){
                num = Integer.parseInt(st.nextToken());
                que.offer(num);
            }
            else if(option.equals("front")){
                if(que.isEmpty()){
                    sb.append(-1);
                    sb.append("\n");
                }
                else{
                    sb.append(que.peek());
                    sb.append("\n");
                }
            }
            else if(option.equals("back")){
                if(que.isEmpty()){
                    sb.append(-1);
                    sb.append("\n");
                }
                else{
                   sb.append(num);
                   sb.append("\n");
                }
            }
            else if(option.equals("size")){
                sb.append(que.size());
                sb.append("\n");
            }
            else if(option.equals("empty")){
                if(que.isEmpty()){
                    sb.append(1);
                    sb.append("\n");
                }
                else{
                    sb.append(0);
                    sb.append("\n");
                }
            }
            else if(option.equals("pop")){
                if(que.isEmpty()){
                    sb.append(-1);
                    sb.append("\n");
                }
                else{
                    sb.append(que.poll());
                    sb.append("\n");
                }
            }
        }
        System.out.println(sb);
    }
}