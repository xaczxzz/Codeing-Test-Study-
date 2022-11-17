import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

class Main {
    static int [] x_ = {-1,1,0,0,0,0};
    static int [] y_ = {0,0,-1,1,0,0};
    static int [] z_ = {0,0,0,0,-1,1};
    static boolean [][][] flag;
    static int [][][] arr;
    static int N,M,cnt,H;
    static int day;
    static Queue <int []> que = new LinkedList<>();
    static private void bfs(){
        while (!que.isEmpty()){
            int [] now = que.poll();
            int z = now[0];
            int x= now[1];
            int y = now[2];
            cnt = arr[z][x][y];
            for(int i=0; i<6; i++){
                int nextX = x+x_[i];
                int nextY = y+y_[i];
                int nextZ = z+z_[i];
                if(nextX>=0&&nextY>=0&&nextX<N&&nextY<M&&nextZ>=0&&nextZ<H){
                    if(!flag[nextZ][nextX][nextY]&&arr[nextZ][nextX][nextY]==0){
                        flag[nextZ][nextX][nextY] = true;
                        arr[nextZ][nextX][nextY] =arr[z][x][y]+1;
                        que.add(new int [] {nextZ,nextX,nextY});
                    }
                }
            }
        }
    }
    static private void res(){
        for(int i=0; i<H; i++){
            for(int j=0; j<N; j++){
                for(int k=0; k<M; k++){
                    if(arr[i][j][k]==0){
                       System.out.println(-1);
                       return;
                    }
                    else if(arr[i][j][k] ==1){
                        continue;
                    }
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
        H = Integer.parseInt(st.nextToken());

        arr = new int [H][N][M]; //4,6
        flag = new boolean [H][N][M];

        for(int i=0; i<H; i++){
            for(int j=0; j<N; j++){
                st = new StringTokenizer(br.readLine());
                for(int k=0; k<M;k++){
                    arr[i][j][k] = Integer.parseInt(st.nextToken());
                    if(arr[i][j][k] ==1){
                        que.add(new int [] {i,j,k});
                    }
                }
            }
        }
        bfs();
        res();

    }

}
