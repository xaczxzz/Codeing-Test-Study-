
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static int gcd(int a, int b){
        if(b==0) {
            return a;
        }
        else {
            return gcd(b, a % b);
        }
    }
    public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
    int cnt = sc.nextInt();
    for(int i=0; i<cnt; i++){
        int N = sc.nextInt();
        int M = sc.nextInt();
        int num =gcd(N,M);
        System.out.println(N*M/num);
    }
    }
}