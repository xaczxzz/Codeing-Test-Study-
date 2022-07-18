import java.util.Scanner;
import java.util.*;
public class Main {
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		int count =0;
		ArrayList<Integer> arr = new ArrayList<>();
		for(int i=0; i<10; i++) {
			int num = sc.nextInt();
			int result = num%42;
			if(!arr.contains(result)) {
				count ++;
				arr.add(result);
			}
		}
		System.out.println(arr.size());
	}
}
