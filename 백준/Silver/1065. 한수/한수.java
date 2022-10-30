import java.util.*;

public class Main {
    static int cnt;

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int target = sc.nextInt();
        int cnt = 0;


        for (int i = 1; i <= target; i++) {
            String str = String.valueOf(i);
            if(i<=99){
                cnt++;
            }
            else if (i <= 999) {
                String [] num = str.split("");
                if(Integer.parseInt(num[1])-Integer.parseInt(num[0])==Integer.parseInt(num[2])-Integer.parseInt(num[1])){
                    cnt++;

                }
            }

        }
        System.out.println(cnt);
    }
}






