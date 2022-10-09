import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args)  throws Exception{
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st =new StringTokenizer(br.readLine());
        Scanner sc = new Scanner(System.in);
        HashMap <Integer,Integer> map = new HashMap<>();
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int item = Integer.parseInt(st.nextToken());

        int time = 99999999; //출력: 시간
        int high = 0; //출력: 집의높이

        int cnt = 0;
        int num =0;

        int min = 256;
        int max = 0;

        int [][] arr = new int [N][M];
        for(int i=0; i<N; i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<M; j++){
                int index = Integer.parseInt(st.nextToken());
                arr[i][j] = index;
                if(arr[i][j] >=max){
                    max = arr[i][j];
                }
                if(arr[i][j] <= min) {
                    min = arr[i][j];
                }
            }
        }
        for(int i = min; i <= max; i++) {
            int count = 0;
            int block = item;
           
            for(int j = 0; j < N; j++) {
                for(int k = 0; k < M; k++) {
                    if(i < arr[j][k]) {
                        count += ((arr[j][k] - i) * 2);
                        block += (arr[j][k] - i);
                    }else {
                        count += (i - arr[j][k]);
                        block -= (i - arr[j][k]);
                    }
                }
            }
            if(block < 0) {
                break;
            }

            if(time >= count) {
                time = count;
                high = i;
            }
        }
        System.out.println(time + " " + high);
    }

}
