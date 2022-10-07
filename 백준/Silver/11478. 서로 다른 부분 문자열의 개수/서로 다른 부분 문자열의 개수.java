import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashSet <String> map = new HashSet<>();

        String N = br.readLine();
        int cnt = N.length();

       for(int i=0; i<N.length();i++){
           String result ="";
           for(int j=i; j<N.length();j++){

               result+=N.substring(j,j+1);
               
                map.add(result);
           }
       }
       System.out.println(map.size());

    }
}
