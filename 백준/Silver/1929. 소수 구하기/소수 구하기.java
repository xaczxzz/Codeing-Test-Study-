import java.util.*;

public class Main {
    public static boolean PrimeNumber(int K) {
        if (K < 2) {
            return false;
        } else if (K == 2) {
            return true;
        }
        for (int i = 2; i <= Math.sqrt(K); i++) {
            if (K % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int N = sc.nextInt();
        int minNum = 0;
        int result = 0;
        for (int i = M; i <= N; i++) {
            if (PrimeNumber(i) == true) {
                System.out.println(i);

            }
        }
    }
}

