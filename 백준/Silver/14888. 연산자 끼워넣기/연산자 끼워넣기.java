import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int[] flag;
    static int[] arr;
    static int Max, Min;

    public static int search(int result, int N, int index) {
        if (index == N) {
            Max = Math.max(Max, result);
            Min = Math.min(Min, result);
        }
        for (int i = 0; i < 4; i++) {
            if (flag[i] > 0) {
                flag[i]--;
                switch (i) {
                    case 0:
                        search(result + arr[index], N, index + 1);
                        break;
                    case 1:
                        search(result - arr[index], N, index + 1);
                        break;
                    case 2:
                        search(result * arr[index], N, index + 1);
                        break;
                    case 3:
                        search(result / arr[index], N, index + 1);
                        break;
                }
                flag[i]++;
            }
        }
        return 0;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        flag = new int[4];
        for (int i = 0; i < 4; i++) {
            flag[i] = Integer.parseInt(st.nextToken());
        }
        Max = Integer.MIN_VALUE;
        Min = Integer.MAX_VALUE;
        search(arr[0], N, 1);
        System.out.println(Max);
        System.out.println(Min);
    }
}