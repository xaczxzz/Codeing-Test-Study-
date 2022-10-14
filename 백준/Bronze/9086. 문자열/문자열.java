import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for (int i = 0 ; i < N ; i++) {
            String M = sc.next();
            int l = M.length();
            String f_ = String.valueOf(M.charAt(0));
            String l_ = String.valueOf(M.charAt(l-1));
            System.out.println(f_+l_);
        }
    }
}