import java.util.*;

public class Main {
    public static int TotalSum(int k) {
        if (k==0||k == 1 || k == 2 ) {
            if (k==2){
                return 1;
            }
            return k;
        } else {
            return TotalSum(k - 1) + TotalSum(k - 2);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = 0;
        total = TotalSum(sc.nextInt());
        System.out.println(total);
        sc.close();
    }
}
