import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int cnt;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Queue <Integer> que = new LinkedList<>();

        int num = Integer.parseInt(br.readLine());
        int index = num;
        int [] arr = new int[num+1];
        que.add(num);
        while(!que.isEmpty()){
            num = que.poll();
            if(num==1){
                break;
            }
            if(num%2==0&& arr[num/2]==0){
                que.add(num/2);
                arr[num/2] = arr[num]+1;
            }
            if(num%3==0&& arr[num/3]==0){
                que.add(num/3);
                arr[num/3] = arr[num]+1;
            }
            if(arr[num-1]==0){
                que.add(num-1);
                arr[num-1] = arr[num]+1;

            }

        }
        System.out.println(arr[1]);
        }
    }







