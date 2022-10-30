import java.util.*;
public class Main {
    static int cnt;
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        sb.append(1);
        sb.append("\n");
        for(int i=2; i<10000;i++){
            boolean flag = false;

            for(int j=1; j<i; j++){
                int num =0;
                String str = String.valueOf(j);

                for(int k=0; k<str.length();k++){
                    num+=Integer.parseInt(String.valueOf(str.charAt(k)));
                }
                if(j+num==i){
                    flag = true;
                }
            }
            if(!flag){
                sb.append(i);
                sb.append("\n");
            }
        }
        System.out.println(sb);
    }
}






