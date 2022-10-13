import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int[] arr = new int[2];
		int[] arr2 = new int[2];

		int x_num;
		int y_num;

		int cnt=0;
		int cnt2=0;

		for (int i = 0; i < 3; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int num = Integer.parseInt(st.nextToken());
			int num2 = Integer.parseInt(st.nextToken());
			if (i == 0) {
				x_num = num;
				arr[0] = x_num;
				y_num = num2;
				arr2[0] = y_num;
			} else {
				if (arr[0] != num) {
					arr[1] = num;
					cnt++;
				}
				if (arr2[0] != num2) {
					arr2[1] = num2;
					cnt2++;
				}
			}
			
		}
		if(cnt <=1) {
			x_num = arr[1];
		}
		else {
			x_num =arr[0];
		}
		if(cnt2 <=1) {
			y_num = arr2[1];
		}
		else {
			y_num = arr2[0];
		}
		System.out.println(x_num+" "+y_num);
	}
}
	

