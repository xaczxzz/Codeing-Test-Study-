import java.util.*;

public class Main {


    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        long S = sc.nextLong();
        long sum =0;
        int cnt = 0;
        for(int i=1; ; i++){
            if(sum > S){
                break;
            }
            sum += i;
            cnt++;
        }
        System.out.println(cnt-1);
    }
}