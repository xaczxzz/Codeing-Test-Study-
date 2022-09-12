
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        st =new StringTokenizer(br.readLine());
        ArrayList <Integer> arr =new ArrayList<>();
        for(int i=0; i<N; i++){
            arr.add(Integer.parseInt(st.nextToken()));
        }
        arr.sort(Comparator.reverseOrder());
        for(int i=0; i<k;i++){
            if(i+1 ==k){
                System.out.println(arr.get(i));
            }
        }
    }
}




