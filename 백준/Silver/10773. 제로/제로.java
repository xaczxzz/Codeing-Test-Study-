import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        Stack <Integer> arr = new Stack<>();
        for(int i=0; i<num; i++){
            int K = Integer.parseInt(br.readLine());
            if(K==0){
                arr.pop();
            }
            else{
                arr.push(K);
            }
        }
        int result = 0;
        for(int j=0; j<arr.size(); j++){
            result += arr.get(j);
        }
        System.out.println(result);
    }
}
