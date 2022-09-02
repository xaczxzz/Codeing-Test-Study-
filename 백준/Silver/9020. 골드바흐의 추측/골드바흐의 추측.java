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
        int time = sc.nextInt();
        for (int j = 0; j < time; j++) {

            int M = sc.nextInt();
            int result1 = M / 2;
            int result2 = M / 2;
            while (true) {
                int total = result1 + result2;
                if (PrimeNumber(result1) == true && PrimeNumber(result2) == true) {
                    System.out.println(result1 + " " + result2);
                    break;
                }
                result1--;
                result2++;
            }

        }
        sc.close();
    }
}


