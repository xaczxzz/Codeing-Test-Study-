import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    static int [][]arr;
    static StringBuilder sb=  new StringBuilder();
    public static boolean possible(int x,int y,int N){
        int num = arr[x][y];
        for(int i=x; i<x+N; i++){
            for(int j=y; j<y+N; j++){
                if(num != arr[i][j]){
                    return false;
                }
            }
        }
        return true;
    }
    public static void search(int x, int y,int N){
        if(possible(x,y,N)){
            sb.append(arr[x][y]);
            return;
        }
        int size = N/2;
        sb.append("(");
        search(x,y,size);
        search(x,y+size,size);
        search(x+size,y,size);
        search(x+size,y+size,size);

        sb.append(")");

    }
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        arr = new int [N][N];
        for(int i=0; i<N; i++){
            String num = br.readLine();
            for(int j=0; j<N; j++){
                arr[i][j] = num.charAt(j)-'0';
            }
        }
        search(0,0,N);
        System.out.println(sb);
    }
}