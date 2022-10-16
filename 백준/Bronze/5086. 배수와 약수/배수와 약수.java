import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());

            if(N==0 &&M ==0){
                break;
            }
            if(N % M ==0){
                System.out.println("multiple");
            }
            else if( M % N ==0){
                System.out.println("factor");
            }
            else{
                System.out.println("neither");
            }
        }


    }
}

