import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;


class Main {
    static int [][] arr;
    static int x,y,white,blue;

    static public void recursion(int num,int x, int y){

        if(flag(num,x,y)){
            if(arr[x][y]==1){
                blue++;
                return;
            }
            else{
                white++;
                return;
            }
        }

        int size = num/2;
        recursion(size,x,y);
        recursion(size,x+size,y);
        recursion(size,x+size,y+size);
        recursion(size,x,y+size);
    }
    static public boolean flag(int num, int x, int y){
        int now = arr[x][y];
        for(int i=x; i<x+num; i++){
            for(int j=y; j<y+num;j++){
                if(arr[i][j] != now){
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        arr = new int [N][N];
        for(int i=0; i<N ; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j<N ; j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        recursion(N,0,0);
        System.out.println(white);
        System.out.println(blue);



    }
}
