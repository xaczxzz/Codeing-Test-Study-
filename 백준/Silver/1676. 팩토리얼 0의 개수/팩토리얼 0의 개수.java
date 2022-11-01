import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int cnt =0;

        while (num>=5){
            cnt += num/5;
            num /= 5;
        }
        System.out.println(cnt);
        }
    }







