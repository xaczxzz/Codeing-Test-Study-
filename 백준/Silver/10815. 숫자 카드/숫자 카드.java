import java.util.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    private static int binarySerach(int [] arr, int left, int key, int right) {
        int mid;
        if (left <= right) {
            mid = left+(right - left) / 2;
            if (arr[mid] == key) {
                return 1;
            } else if (arr[mid] > key) {
                return binarySerach(arr, left, key, mid - 1);
            } else {
                return binarySerach(arr, mid + 1, key, right);
            }
        }
        return 0;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int [] arr = new int[num];
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < num; i++) {
            arr[i]=(Integer.parseInt(st.nextToken()));
        }
        Arrays.sort(arr);
        int time = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < time; i++) {
            int key = Integer.parseInt(st.nextToken());
            sb.append(binarySerach(arr ,0, key, arr.length-1));
            sb.append(" ");
        }
        System.out.println(sb);


    }
}
