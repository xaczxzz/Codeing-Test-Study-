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

        int minNum = 0;
        while (true) {
            int M = sc.nextInt();
            if(M == 0){
                break;
            }
            int result = 0;
            for (int i = M+1; i <= 2*M; i++) {

                if (PrimeNumber(i) == true) {
                    result +=1;
                }
            }
            System.out.println(result);
        }
    }

}

