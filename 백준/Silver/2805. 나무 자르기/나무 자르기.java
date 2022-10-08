import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int [] arr;
    static int N;
    static  int M;

    public static int binSearch(int left, int right) {

        int pl = left;
        int pr = right;

        while(pl<=pr){
            int pc = (pl + pr) / 2;

            long sum = 0;
            for (int i = 0; i < N; i++) {
                if (arr[i] > pc)
                    sum += arr[i] - pc;
            }

            if (sum >= M)
                pl = pc + 1;
            else
                pr = pc - 1;
        }

        return pr;

    }
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
         N = sc.nextInt();
         M = sc.nextInt();
         arr = new int [N];
         for(int i=0; i<N; i++){
             arr[i] = sc.nextInt();
         }
         Arrays.sort(arr);
         System.out.println( binSearch(0,arr[N-1]));
    }
}
