import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int time = Integer.parseInt(br.readLine());
        int [] arr = new int [time];
        for(int i=0; i<time; i++){
            arr[i] =(Integer.parseInt(br.readLine()));
        }
        Arrays.sort(arr);
        for(int i=0; i<arr.length;i++){
            System.out.println(arr[i]);
        }
        br.close();
    }

}
