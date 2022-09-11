
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static ArrayList<Integer> arr = new ArrayList<>();
    static int mid;
    static int binarySearch1(int key, int low, int high) {
        try{
            if(low<=high){
                mid = (low+high) /2;
                if(key == arr.get(mid)){
                    return 1;
                }
                else if(key < arr.get(mid)){
                    return binarySearch1(key, low,mid-1);
                }
                else{
                    return binarySearch1(key,mid+1,high);
                }
            }
        }catch ( Exception e){
            return 0;
        }

        return 0;
    }
    


    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int flag = 0;
        for (int i = 0; i < N; i++) {
            arr.add(Integer.parseInt(st.nextToken()));
        }
        st = new StringTokenizer(br.readLine());
        int M = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        ArrayList<Integer> arr2 = new ArrayList<>();
        for (int i = 0; i < M; i++) {
            arr2.add(Integer.parseInt(st.nextToken()));
        }
        arr.sort(Comparator.naturalOrder());
        for(int i=0; i<arr2.size(); i++){
            System.out.println(binarySearch1(arr2.get(i),0,N));
        }


    }
}




