import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int [6];

        int N = Integer.parseInt(br.readLine());

        int x_num = 0;
        int y_num = 0;

        int x_index =0;
        int y_index=0;

        for(int i=0; i<6;i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int locate = Integer.parseInt(st.nextToken());
            int size = Integer.parseInt(st.nextToken());
            arr[i] = size;
            if(locate == 1 || locate ==2){
                if(x_num <arr[i]){
                    x_num = size;
                    x_index = i;
                }
            }
            else{
                if(y_num < arr[i]){
                    y_num = size;
                    y_index = i;
                }
            }

        }
        int total = x_num*y_num;
        int total2 = arr[(x_index+3)%6] * arr[(y_index + 3)%6];
        System.out.println((total - total2)*N);

    }

}





