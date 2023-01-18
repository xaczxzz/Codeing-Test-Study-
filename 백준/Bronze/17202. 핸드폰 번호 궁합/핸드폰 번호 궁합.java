import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String [] arr = (st.nextToken().split(""));
        st = new StringTokenizer(br.readLine());
        String [] arr2 = (st.nextToken().split(("")));

        String answer ="";
        for(int i=0; i<arr.length; i++){
            answer += arr[i];
            answer += arr2[i];
        }

        String answer2 ="";
        int cnt =15;
        while(cnt -->1){
            for(int i=1; i<answer.length();i++){
                answer2 += (Integer.parseInt(String.valueOf(answer.charAt(i))) + Integer.parseInt(String.valueOf(answer.charAt(i - 1))))%10;
            }
            answer = answer2;
            answer2= "";
        }
        System.out.println(answer);
    }
}