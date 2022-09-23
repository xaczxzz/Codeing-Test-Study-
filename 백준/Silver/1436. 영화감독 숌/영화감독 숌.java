import java.io.BufferedReader;
import java.util.*;
import java.io.InputStreamReader;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int time = Integer.parseInt(st.nextToken());
        int num = 666;
        int count = 1;

        while(time !=count){
                num++;
                if(String.valueOf(num).contains("666")){
                    count ++;
                }
        }
    System.out.println(num);

    }
}