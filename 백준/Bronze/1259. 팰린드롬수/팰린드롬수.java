import java.util.Scanner;
public class Main {
	public static void main(String []args) {
		Scanner sc= new Scanner(System.in);
		while(true) {
			String input = sc.next();
			String reverse ="";
			if(input.equals("0")) {
				break;
			}
			for(int i=input.length()-1; i >=0;i--) {
				reverse = reverse+ input.charAt(i);
			}
			if(input.equals(reverse)) {
				System.out.println("yes");
			}
			else {
				System.out.println("no");
			}
			
		}
	}
}