import java.util.Scanner;
import java.util.*;
public class Main {
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		int count =0;
		int num =sc.nextInt();
		String num2 = sc.next();
		for(int i=0;i<num2.length();i++){
			count += num2.charAt(i)-'0';
		}
		System.out.println(count);
	}
}