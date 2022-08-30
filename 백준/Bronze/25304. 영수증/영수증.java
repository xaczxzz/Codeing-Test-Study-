import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int price = sc.nextInt();
        int time = sc.nextInt();
        int result = 0;
        for(int i=0; i<time; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            result += a*b;
        }
        if (price == result){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
        sc.close();
    }
}
