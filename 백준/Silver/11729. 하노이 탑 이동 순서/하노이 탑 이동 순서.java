
import java.util.*;

public class Main {
    public static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int time = sc.nextInt();
        sb.append((int)(Math.pow(2,time)-1)).append('\n');
        hanoi(time,1,2,3);
        System.out.println(sb);
    }
    public static void hanoi(int k ,int start, int mid , int end){
        if (k == 1){
            sb.append(start +" "+ end + "\n");
            return ;
        }
        hanoi(k-1, start, end, mid);
        sb.append(start +" " + end+"\n");
        hanoi(k-1, mid, start, end);
    }

}

