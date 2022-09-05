import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int time = sc.nextInt();
        String list = sc.next();
        int M =1234567891;
        String [] list_ = list.split("");
        long result =0;
        long pow = 1;
        for(int i=0; i<list_.length;i++){
            int num = (int)list_[i].charAt(0)-96;
            result += num * pow % M;
            pow = pow * 31 %M;
        }
        System.out.println(result%M);


    }

}
