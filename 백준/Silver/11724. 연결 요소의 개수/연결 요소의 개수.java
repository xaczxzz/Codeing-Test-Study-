import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class Main {
    static int cnt;
    static int N,M,index1,index2;
    static int [][] arr;

    static boolean []flag;

    private static void bfs(int num) {
        Queue<Integer> que = new LinkedList<>();
        que.add(num);
        flag[num] = true;
        while(!que.isEmpty()){
            int now = que.poll();
            for(int i=1; i<=N; i++){
                if(arr[now][i]==1&&!flag[i]){
                    flag[i] = true;
                    que.add(i);
                }
            }
        }

    }


    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        arr = new int [N+1][N+1];
        flag = new boolean[N+1];

        for(int i=0; i<M; i++){
            st = new StringTokenizer(br.readLine());
             index1=Integer.parseInt(st.nextToken());
             index2=Integer.parseInt(st.nextToken());

            arr[index1][index2]= 1;
            arr[index2][index1] = 1;

        }
        for(int i =1; i<=N; i++){
            if(!flag[i]){
                bfs(i);
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
