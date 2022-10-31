import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int N,M,start;
    static int [][] arr;
    static boolean [] flag;
    static StringBuilder sb = new StringBuilder();
    static Queue <Integer> que = new LinkedList<>();
    private static void dfs(int start){
        flag[start] = true;
        sb.append(start+ " ");

        for(int i=0; i<=N;i++){
            if(arr[start][i] == 1&&!flag[i]){
                dfs(i);
            }
        }

    }
    private static void bfs(int start){
        flag[start] = true;
        que.add(start);
        while(!que.isEmpty()){
            start = que.poll();
            sb.append(start+ " ");
            for(int i=1; i<=N; i++){
                if(arr[start][i]==1&&!flag[i]){
                    que.add(i);
                    flag[i] = true;
                }
            }
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        start = Integer.parseInt(st.nextToken());

        arr = new int [N+1][N+1];
        flag = new boolean[N+1];

        for(int i=0; i<M; i++){
            st = new StringTokenizer(br.readLine());
            int index1 =Integer.parseInt(st.nextToken());
            int index2 =Integer.parseInt(st.nextToken());

            arr[index1][index2] = arr[index2][index1] = 1;
        }
        dfs(start);
        sb.append("\n");
        flag = new boolean[N+1];
        bfs(start);

        System.out.println(sb);
    }
}






