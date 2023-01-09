import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList <Integer> arr = new ArrayList<>();
       int N = Integer.parseInt(br.readLine());
        boolean [] flag = new boolean[N];
        ArrayList <Integer> arr2 = new ArrayList<>();
        int [] answer = new int [N];
       StringTokenizer st=  new StringTokenizer(br.readLine());
       for(int i=0; i<N; i++){
           arr.add(i);
           int num = Integer.parseInt(st.nextToken());
           arr2.add(num);
           answer[i] = num;
       }
       arr2.sort(Comparator.naturalOrder());
       for(int i=0; i<N; i++){
           if(arr2.get(i)!=arr.get(i)){
               for(int j=0; j<N; j++){
                   if(arr2.get(i)==answer[j]&&!flag[j]){
                       answer[j] = arr.get(i);
                       flag[j] = true;
                       break;
                   }
               }
           }
           else{
               for(int j=0; j<N; j++){
                   if(answer[j]==arr2.get(i)&&!flag[j]){
                        flag[j] = true;
                        break;
                   }
               }
           }
       }
       for(int i=0; i<N; i++){
           System.out.print(answer[i]+" ");
       }






    }

}
