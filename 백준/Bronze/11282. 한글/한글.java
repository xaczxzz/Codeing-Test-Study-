import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        N += 44031;
        char w = (char) N;
        System.out.println(w);
    }
}