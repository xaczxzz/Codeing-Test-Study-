import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
class Main{

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = 0;
        int [] arr =new int [5];
        for(int i=0; i<5; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            num += n;
            arr[i] = n;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(num/5);
        sb.append("\n");
        Arrays.sort(arr);
        sb.append(arr[2]);
        sb.append("\n");
        System.out.println(sb);
    }
}