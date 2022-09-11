import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Queue <Integer> que = new LinkedList<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        for(int i=0; i<N; i++){
            que.add(i+1);
        }
       while(true){
           if(que.size() ==1){
               break;
           }
           que.remove();
           que.add(que.peek());
           que.remove();

       }
        System.out.println(que.peek());
    }
}




