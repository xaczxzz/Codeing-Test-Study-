import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static HashSet <Integer> set = new HashSet<>();
    public static void main(String[] args) throws Exception {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb =new StringBuilder();
        int M = Integer.parseInt(st.nextToken());
        for(int i=0; i<M; i++){
            st = new StringTokenizer(br.readLine());
            String cmd = st.nextToken();
            if(cmd.equals("add")){
                int n = Integer.parseInt(st.nextToken());
                set.add(n);
            }
            else if(cmd.equals("check")){
                int n = Integer.parseInt(st.nextToken());
                if(set.contains(n)){
                    sb.append(1);
                    sb.append("\n");
                }
                else{
                    sb.append(0);
                    sb.append("\n");
                }
            }
            else if(cmd.equals("remove")){
                int n = Integer.parseInt(st.nextToken());
                if(set.contains(n)){
                    set.remove(n);
                }
            }
            else if(cmd.equals("toggle")){
                int n = Integer.parseInt(st.nextToken());
                if(set.contains(n)){
                    set.remove(n);
                }
                else{
                    set.add(n);
                }
            }
            else if(cmd.equals("all")){
                for(int j=1; j<21;j++){
                    set.add(j);
                }
            }
            else if(cmd.equals("empty")){
                set.clear();
            }
        }
        System.out.println(sb);
    }
}
