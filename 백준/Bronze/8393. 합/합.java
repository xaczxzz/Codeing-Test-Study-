import java.util.*;
public class Main {
	static int result =0;
	static public int sum(int a) {
		if(a==1) {
			result+=1;
			System.out.println(result);
			return result;
		}
		else {
			result += a;
			a--;
			return sum(a);
		}
	}
	
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sum(n);
	}
}