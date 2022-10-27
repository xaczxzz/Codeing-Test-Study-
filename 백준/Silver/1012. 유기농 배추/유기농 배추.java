import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int row,col,K;
    static int count;
    static int [] dr = {0,-1,0,1};
    static int [] dc = {1,0,-1,0};
    static boolean [][] flag ;
    static int [][] arr;
    public static void dfs(int x, int y){
        flag[x][y] =true;

        for(int i=0; i<4;i++){
            int xr = x+ dr[i];
            int yr = y+ dc[i];
            if(xr>=0&&yr>= 0 && xr<row&&yr <col){
                if(!flag[xr][yr] && arr[xr][yr]==1){
                    dfs(xr,yr);
                }
            }
        }
    }
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int TestCase = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < TestCase; i++){
            count = 0;
            StringTokenizer st = new StringTokenizer(br.readLine());
            row = Integer.parseInt(st.nextToken());
            col = Integer.parseInt(st.nextToken());
            K = Integer.parseInt(st.nextToken());

            arr = new int [row][col];
            flag =new boolean[row][col];

            for(int j=0; j<K; j++){
                st = new StringTokenizer(br.readLine());
                int x_ = Integer.parseInt(st.nextToken());
                int y_ = Integer.parseInt(st.nextToken());
                arr[x_][y_] = 1;
            }
            for(int z = 0; z<row; z++){
                for(int c = 0; c<col;c++){
                    if(arr[z][c] ==1 &&!flag[z][c]){
                        dfs(z,c);
                        count++;
                    }
                }
            }
        sb.append(count);
            sb.append("\n");

        }
        System.out.println(sb);
    }
}






