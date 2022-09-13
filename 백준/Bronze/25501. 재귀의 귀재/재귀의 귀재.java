
import java.util.Scanner;

public class Main {
    static int time=0;
    public static int recursion(String s, int l, int r){
        if(l >= r) return 1;
        else if(s.charAt(l) != s.charAt(r)) return 0;
        else
            time++;
            return recursion(s, l+1, r-1);
    }
    public static int isPalindrome(String s){
        time++;
        return recursion(s, 0, s.length()-1);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            String M  =sc.next();
            System.out.println(isPalindrome(M)+" "+time);
            time =0;
        }
    }
}