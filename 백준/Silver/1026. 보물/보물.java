import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        boolean [] flag = new boolean [N];
        ArrayList <Integer> answer = new ArrayList<>();
        int [] arr = new int[N];
        ArrayList <Integer> arr2 = new ArrayList<>();
        StringTokenizer st =new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++){
            answer.add(Integer.parseInt(st.nextToken()));
        }
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++){
            arr2.add(Integer.parseInt(st.nextToken()));
        }
        answer.sort(Comparator.naturalOrder());
        
        for(int i=0; i<N; i++){
            int bigNum = -1000;
            int index = 0;
            for(int j= 0; j<N; j++){
                if(arr2.get(j) >= bigNum&&!flag[j]){
                    bigNum = arr2.get(j);
                    index = j;
                }
            }
            arr[index] = answer.get(i);
            flag[index] = true;
        }
        int sum = 0;
        for(int i=0; i<N; i++){
            sum += arr[i] * arr2.get(i);
        }
        System.out.println(sum);
    }
}
