import java.util.*;
public class Main {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int [][] list = new int [N][2];
        for(int i = 0; i < N; i++){
            int K = sc.nextInt();
            int J = sc.nextInt();
            list[i][0] = K;
            list[i][1] = J;
        }
        Arrays.sort(list, new Comparator<int[]>() {
            @Override
            public int compare(int[] e1, int[] e2) {
                if(e1[0] == e2[0]) {		// 첫번째 원소가 같다면 두 번째 원소끼리 비교
                    return e1[1] - e2[1];
                }
                else {
                    return e1[0] - e2[0];
                }
            }
        });
        for(int i = 0; i < list.length; i++){
            System.out.println(list[i][0]+ " "+ list[i][1]);
        }
    }
}

