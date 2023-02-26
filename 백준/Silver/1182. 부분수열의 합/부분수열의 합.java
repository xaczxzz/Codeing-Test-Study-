import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int [] arr;
    static boolean [] flag;
    static int cnt;
    static int S;
    static public void search(int length, int result,int N){
        if(length == N){
            if(result ==S )
                cnt++;
            return;
        }
        search(length+1, result+arr[length],N);
        search(length+1, result, N);
    }
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

       int N = Integer.parseInt(st.nextToken());
       S = Integer.parseInt(st.nextToken());

       st = new StringTokenizer(br.readLine());
       arr = new int [N];
       flag = new boolean[N];
       for(int i=0; i<N; i++){
           arr[i] = Integer.parseInt(st.nextToken());
       }
       search(0,0,N);
       if(S == 0){
           cnt--;
       }
       System.out.println(cnt);
    }
}