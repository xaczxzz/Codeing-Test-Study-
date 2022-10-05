import java.io.BufferedReader;
import java.util.StringTokenizer;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        HashMap <Integer,Integer> map = new HashMap<>();
        HashMap<Integer,Integer> map2 = new HashMap<>();
        for(int i = 0; i < N; i++){
            map.put(Integer.parseInt(st.nextToken()),i);
        }
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < M; i++){
            map2.put(Integer.parseInt(st.nextToken()),i);
        }
       for(Map.Entry<Integer,Integer> entrySet : map.entrySet()){
           if(map2.containsKey(entrySet.getKey())){
               N--;
           }
       }
        for(Map.Entry<Integer,Integer> entrySet : map2.entrySet()){
            if(map.containsKey(entrySet.getKey())){
                M--;
            }
        }
        
        System.out.println(N+M);

    }
}

