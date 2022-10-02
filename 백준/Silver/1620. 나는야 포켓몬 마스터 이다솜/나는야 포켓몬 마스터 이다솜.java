import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    private static boolean isNumber(String num){
        try{
            Double.parseDouble(num);
            return true;
        }catch (NumberFormatException e){
            return false;
        }
    }
        public static void main (String[]args) throws Exception {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st = new StringTokenizer(br.readLine());
            HashMap<String, Integer> Stringmap = new HashMap<>();
            HashMap <Integer, String> intmap = new HashMap<>();
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());
            int cnt = 0;
            StringBuilder sb = new StringBuilder();

            for(int i=1; i< N+1; i++){
                String name = br.readLine();
                Stringmap.put(name,i);
                intmap.put(i,name);
            }
            for(int j=0; j<M; j++){
                String poketmon = br.readLine();
                if(isNumber(poketmon)){
                    sb.append(intmap.get(Integer.parseInt(poketmon)));
                    sb.append("\n");
                }
                else{
                    sb.append((Stringmap.get(poketmon)));
                    sb.append("\n");
                }
            }
            System.out.println(sb);


        }
    }
