import java.util.Scanner;

public class Main {
    static StringBuilder sb =new StringBuilder();
    static int [] solve;
    private static void backTracking(int cnt,int N ,int M){
        if(cnt ==M){
            for(int i=0; i< M;i++){
                sb.append(solve[i]+" ");
            }
            sb.append("\n");
            return;
        }
        for(int i = 1; i < N+1; i++){
            solve[cnt] = i;
            backTracking(cnt+1,N,M);
        }
    }

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

       int N = sc.nextInt();
       int M = sc.nextInt();

       solve = new int [M+1];
       backTracking(0,N,M);
        System.out.println(sb);
    }

}