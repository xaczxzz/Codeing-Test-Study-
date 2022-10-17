import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int time = Integer.parseInt(br.readLine());

        for(int i = 0; i < time; i++){
            Queue <Integer> que = new LinkedList<>();
            Queue<Integer> indexQue = new LinkedList<>();

            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());
            st= new StringTokenizer(br.readLine());
            for(int j=0; j<N; j++){
                que.offer(Integer.parseInt(st.nextToken()));
                indexQue.offer(j);
            }
            int cnt = 1;
            while(!que.isEmpty()){
                int max = Collections.max(que);
                int now = que.poll();
                int nowIndex = indexQue.poll();

                if(now == max){
                    if(nowIndex == M){
                        System.out.println(cnt);
                        break;
                    }
                    cnt++;
                }
                else{
                    que.offer(now);
                    indexQue.offer(nowIndex);
                }
            }

        }

    }
}

