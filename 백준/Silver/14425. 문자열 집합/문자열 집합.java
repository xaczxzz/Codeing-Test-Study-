import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        HashMap <String, Integer> map = new HashMap<>();
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int cnt = 0;
        for(int i=0; i<N;i++){
            map.put(br.readLine(),i);
        }
        for(int j=0; j<M; j++){
            if(map.containsKey(br.readLine())){
                cnt++;
            }
            else{
                continue;
            }
        }
        System.out.println(cnt);





    }
}
