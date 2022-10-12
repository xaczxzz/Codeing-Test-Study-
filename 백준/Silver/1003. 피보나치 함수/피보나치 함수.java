import java.util.*;
public class Main {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long [] fibo00 = new long [41];
		long [] fibo01 = new long [41];
		long [] fibo10 = new long [41];
		long [] fibo11 = new long [41];
		
		for(int i=0; i<N; i++) {
			int M = sc.nextInt();
			fibo00[0] = 1;
			fibo00[1] = 0;
			fibo01[0] =0;
			fibo01[1] = 1;
			for(int j =2; j<=M;j++) {
				fibo00[j] = fibo00[j-1] + fibo00[j-2];
				fibo01[j] = fibo01[j-1] + fibo01[j-2];
			}
			System.out.println(fibo00[M]+" "+ fibo01[M]);
		}
		
		
	
	}
}
