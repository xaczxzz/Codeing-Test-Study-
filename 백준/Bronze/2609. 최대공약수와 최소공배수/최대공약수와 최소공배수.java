import java.util.*;
public class Main {
    static public int Eclidean(int x, int y) {
        if (y == 0) {
            return x;
        } else {
            return Eclidean(y, x % y);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y =sc.nextInt();
        System.out.println(Eclidean(x,y));
        int result =0;
        result = Eclidean(x,y)*x/Eclidean(x,y)*y/Eclidean(x,y);
        System.out.println(result);
    }

}




