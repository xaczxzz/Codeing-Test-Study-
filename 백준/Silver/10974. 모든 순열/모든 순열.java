import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static StringBuilder sb =new StringBuilder();
    static void perm(int[] arr, int[] output, boolean[] visited, int depth, int n, int r) {
        if (depth == r) {
            for(int i=0; i<r; i++){
                sb.append(output[i]+" ");
            }
            sb.append("\n");
        }

        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                visited[i] = true;
                output[depth] = arr[i];
                perm(arr, output, visited, depth + 1, n, r);
                visited[i] = false;
            }
        }
    }
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int [] result = new int[N];
        int [] arr= new int [N];
        boolean [] visit = new boolean[N];
        for(int i=0; i<N; i++){
            arr[i] = i+1;
        }
        perm(arr,result,visit,0,N,N);
        System.out.println(sb);
    }
}