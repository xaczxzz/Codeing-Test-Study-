import java.util.Scanner;
import java.util.*;
public class Main {
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextInt();
		long b = sc.nextInt();
		long c = sc.nextInt();
		if(b>=c) {
			System.out.println(-1);
			System.exit(0);
		}
		long count =0;
		long result = c-b;
		while(true) {
			if(result*count>a) {
				System.out.println(count);
				System.exit(0);
			}
			count++;
		}
		
	}
}