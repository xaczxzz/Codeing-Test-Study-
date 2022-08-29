import java.util.*;
public class Main {
	public static void main (String []args)  {
		Scanner sc = new Scanner(System.in);
		int time = sc.nextInt();
		for(int i =0; i<time; i++) {
			int count =1;
			int H  = sc.nextInt();
			int W = sc.nextInt();
			int N = sc.nextInt();
			int j = 0;

			int num = N/ H;
			j += num;
			int flow = N % H;
			if (flow == 0) {
				flow = H;
			}
			else {
				j +=1;
			}

			System.out.println(j+(flow*100));
		}
	}
}