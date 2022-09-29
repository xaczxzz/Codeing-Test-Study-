import java.util.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    static int [] arr;
    static boolean [] flag;
    static StringBuilder sb = new StringBuilder();
    private static void backtracking(int cnt, int N ,int M){
        if(cnt == M){
            for(int i=0; i<M; i++){
                sb.append(arr[i]+" ");
            }
            sb.append("\n");
            return;
        }
        for(int i=1; i<N+1; i++){
            if(!flag[i]){
                arr[cnt] = i;
                flag[i] = true;
                backtracking(cnt+1,N,M);

                for(int j=i+1; j<N+1;j++){
                    flag[j] = false;
                }
            }
            }

    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        arr = new int[M];
        flag = new boolean[N+1];
        backtracking(0,N,M);
        System.out.println(sb);
    }
}
