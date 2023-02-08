import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int [] arr;
    public static int search(int left, int right){
        //기저사례 : 판자가 하나만 남은 경우
        if(left==right){
            return arr[left];
        }
        //분할정복을 하기 위해 반으로 나눈다.
        int mid = (left+right)/2;
        //분할한 문제를 각개격파
        int result = Math.max(search(left,mid),(search(mid+1,right)));
        //겹치는 경우
        int lo = mid;
        int hi = mid+1;
        int height = Math.min(arr[lo], arr[hi]);
        result = Math.max(result,height*2);
        //사각형이 입력 전체를 덮을 때 까지 확장한다.
        while(left<lo || hi<right){
            if(hi < right && (lo == left || arr[lo-1] < arr[hi+1])){
                hi++;
                height = Math.min(height,arr[hi]);
            }
            else{
                lo--;
                height = Math.min(height, arr[lo]);
            }
            result = Math.max(result,height *(hi- lo+1));
        }
        return result;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st= new StringTokenizer(br.readLine());
        int C = Integer.parseInt(st.nextToken());
        arr = new int[C+1];
        for(int i=0; i<C; i++){
            st = new StringTokenizer(br.readLine());
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int result = search(0,C);
        System.out.println(result);

    }
}