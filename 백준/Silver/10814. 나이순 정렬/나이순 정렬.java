import java.util.*;
public class Main {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String[][] list = new String[N][2];
        for (int i = 0; i < N; i++) {
            String age = sc.next();
            String name = sc.next();
            list[i][0] = age;
            list[i][1] = name;
        }
        Arrays.sort(list, new Comparator<String[]>() {
            @Override
            public int compare(String[] g1, String[] g2) {
                if(g1[0] == g2[0]){
                    return 1;
                }
                else{
                    return Integer.parseInt(g1[0])-Integer.parseInt(g2[0]);
                }
            }
        });
        for(int i = 0; i < list.length; i++){
            System.out.println(list[i][0]+" "+list[i][1]);
        }
    }
}

