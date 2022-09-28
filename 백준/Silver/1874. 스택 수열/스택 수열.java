import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Stack<Integer> arr = new Stack<Integer>();
       StringBuilder sb = new StringBuilder();
        int index = 1;
        int [] arr2 = new int [N+1];
        for(int i = 1; i <= N; i++){
            arr2[i]= Integer.parseInt(br.readLine());
        }
        for(int i=1; i<=N;i++){
            arr.push(i);
            sb.append("+");
            sb.append("\n");
            while(!arr.empty()&&arr.peek()==arr2[index]){
                arr.pop();
                sb.append("-");
                sb.append("\n");
                index++;
            }
        }
       if(arr.empty()){
           System.out.println(sb);
       }
       else{
           System.out.println("NO");
       }


    }
}
