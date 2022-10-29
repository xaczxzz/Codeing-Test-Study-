import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
import java.util.StringTokenizer;

public class Main {
    static int cnt;
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
       int N = sc.nextInt();
       int M = sc.nextInt();
       ArrayList<Integer> arr = new ArrayList<>();

       for(int i = 0; i < M; i++){
           int E = sc.nextInt();
           arr.add(E);
       }

        int ch = Math.abs(100-N);
        int cnt =0;
        int min =9999999;

       for(int i=0; i<=999999;i++){
           String str =String.valueOf(i);
           boolean flag = true;
           for(int j=0; j<str.length(); j++){
               if(arr.contains(str.charAt(j)-'0')){
                  flag = false;
                  break;
               }
           }
           if(!flag){
               continue;
           }
           cnt = str.length()+ Math.abs(i-N);

           if(cnt <min){
               min = cnt;
           }

       }
       if(min<ch)ch = min;
       System.out.println(ch);

    }
}






