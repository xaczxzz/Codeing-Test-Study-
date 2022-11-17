import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

class Main {
    static int [] x_ = {-1,1,0,0};
    static int [] y_ = {0,0,-1,1};
    static boolean [][] flag;
    static int [][] arr;
    static int N,M,cnt;
    static int day;
    static Queue <int []> que = new LinkedList<>();
    static private void bfs(){

        while (!que.isEmpty()){
            int [] now = que.poll();
            int x = now[0];
            int y = now[1];
            cnt = arr[x][y];
            for(int i=0; i<4; i++){
                int now_x = x+x_[i];
                int now_y = y+y_[i];
                if((now_x>=0&&now_y>=0)&&(now_x<N&&now_y<M)){
                    if(!flag[now_x][now_y]&&arr[now_x][now_y]==0){
                        arr[now_x][now_y] =arr[x][y]+1;
                        flag[now_x][now_y] = true;
                        que.add(new int [] {now_x,now_y});

                    }
                }
            }

        }

    }
    static private void result (){
        for(int i=0; i<N; i++){
            for(int j=0; j<M; j++){
                if(arr[i][j]==0){
                    System.out.println(-1);
                    System.exit(0);
                }
                else if(arr[i][j]==1){
                    continue;
                }
            }
        }
        System.out.println(cnt-1);
    }
    public static void main(String[] args)  throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st= new StringTokenizer(br.readLine());


         M = Integer.parseInt(st.nextToken()); //6
         N = Integer.parseInt(st.nextToken()); //4

        arr = new int [N][M]; //4,6
        flag = new boolean [N][M];

        for(int i=0; i<N; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j<M; j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
                if(arr[i][j] ==1){
                    que.add(new int [] {i,j});
                }
            }
        }
        bfs();
        result();

    }

}
