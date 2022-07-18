import java.util.*;
public class Main {
	static int result =1 ;
	static public int fibo(int a) {
		if(a ==0) {
			System.out.println(result);
			System.exit(0);
		}
			result *= a;
			return fibo(a-1);
	}
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		fibo(num);
		
	}
}