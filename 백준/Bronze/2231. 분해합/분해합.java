import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       StringBuilder sb = new StringBuilder();
       int n = sc.nextInt();
       for(int i=0; i<n;i++){
           int cnt = i;
           int test = i;
           while(true){
               cnt += (test %10);
               test = test/10;
               if(test ==0){
                   break;
               }
           }
           if (cnt ==n){
               System.out.println(i);
               System.exit(0);
           }
       }
       System.out.println(0);

    }
}

