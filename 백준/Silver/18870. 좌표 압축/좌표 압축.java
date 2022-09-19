import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int time =sc.nextInt();
        int [] arr = new int [time];
        int [] arr2 = new int[time];

        HashMap <Integer, Integer> hs = new HashMap<>();
        for(int i = 0; i < time; i++){
            int num = sc.nextInt();
            arr[i] = num;
            arr2[i] = num;
        }
        Arrays.sort(arr2);
        int rank = 0;
        for(int v: arr2){
            if(!hs.containsKey(v)){
                hs.put(v,rank);
                rank++;
            }
        }
        StringBuilder sb =new StringBuilder();
        for(int i = 0; i < time; i++){
            int result=hs.get(arr[i]);
            sb.append(result+" ");
        }
        System.out.println(sb);

    }
}