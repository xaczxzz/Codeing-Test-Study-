import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int [][] arr;
    static  boolean [][] flag;
    static int N,M;
    static int [] dx = {-1,1,0,0};
    static int [] dy = {0,0,-1,1};

    public static void BFS(int x, int y){
        Queue<int []> que = new LinkedList<>();

        que.add(new int [] {x,y});
        while (!que.isEmpty()){
            int [] now = que.poll();
            int nowX = now[0];
            int nowY = now[1];
            for(int i=0; i<4; i++){
                int nextX = nowX+dx[i];
                int nextY = nowY + dy[i];
                if(nextX>=0&&nextY>=0&&nextX<N&&nextY<M){
                    if(!(arr[nextX][nextY] ==0) &&!flag[nextX][nextY]){
                        que.add(new int [] {nextX,nextY});
                        arr[nextX][nextY] =arr[nowX][nowY]+1;
                        flag[nextX][nextY] = true;
                    }
                }
            }

        }
    }
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        arr = new int [N][M];
        flag = new boolean[N][M];

        for(int i=0; i<N;i++){
            st = new StringTokenizer(br.readLine());
            String str = st.nextToken();
            for(int j=0; j<M;j++) {
                arr[i][j] = str.charAt(j) - '0';
            }
        }
        flag[0][0] = true;
        BFS(0,0);
        System.out.println(arr[N-1][M-1]);
    }
}






