import java.util.*;
public class Main {
	
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		int time = sc.nextInt();
		for(int i=0; i<time; i++) {
			int num = sc.nextInt();
			String num2 = sc.next();
			for(int j=0; j<num2.length();j++) {
				for(int k=0; k<num;k++) {
					System.out.print(num2.charAt(j));
					
				}
				
				
			}
			System.out.println();
		}
		
		
	}
}