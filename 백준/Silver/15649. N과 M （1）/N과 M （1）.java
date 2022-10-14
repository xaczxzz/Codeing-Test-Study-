import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
import java.util.Vector;
public class Main {
	static boolean [] flag;
	static int [] solve;
	static StringBuilder sb = new StringBuilder();
	private static void back(int cnt , int M, int N) {
		if(cnt ==M) {
			for(int i=0; i<M; i++) {
				sb.append(solve[i]+" "); 
			}
			sb.append("\n");
			return;
		}
		for(int i=1; i<N+1; i++) {
			if(!flag[i]) {
				flag[i] = true;
				solve[cnt] = i;
				back(cnt+1,M,N);
				flag[i] = false;
			}
		}
	}
	public static void main(String []args)throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		flag = new boolean[N+1];
		solve = new int [M];
		back(0,M,N);
		System.out.println(sb);
	}
}
