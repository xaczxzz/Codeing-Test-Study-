import java.io.BufferedReader;

import java.io.InputStreamReader;
import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception{
        HashMap <String, Integer> map = new HashMap<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        ArrayList <String> arr = new ArrayList<>();

        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        for(int i = 0; i < N+M; i++){
            String name = br.readLine();

            if(i>=N){

                if(map.containsKey(name)){
                    arr.add(name);
                    sb.append(name);
                    sb.append("\n");
                }
            }
            else{
                map.put(name, i);
            }
        }
        arr.sort(Comparator.naturalOrder());

        System.out.println(arr.size());
        for(String s : arr){
            System.out.println(s);
        }
    }
}
