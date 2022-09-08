
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;


public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList <Integer> wegiht = new ArrayList<>();
        ArrayList <Integer> height = new ArrayList<>();

        int N = Integer.parseInt(br.readLine());
        for(int i=0; i<N; i++){
            String Input = br.readLine();
            StringTokenizer st = new StringTokenizer(Input);
            wegiht.add(Integer.parseInt(st.nextToken()));
            height.add(Integer.parseInt(st.nextToken()));

        }
        for(int i=0; i<N; i++){
            int rank =1;
            for(int j= 0; j<N; j++){
                if(i==j){
                    continue;
                }
                if(wegiht.get(i)<wegiht.get(j)&&height.get(i)<height.get(j)){
                    rank++;
                }
            }
            System.out.println(rank);
        }

    }
}



