import java.util.*;
public class Main {
	
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int num2 = sc.nextInt();
		int time =sc.nextInt();
		int num3= 0;
		if((num2+time >=60)){
			num += (num2+time)/60;
			num2 = (num2+time)%60;
			if(num >= 24) {
				num = num%24;
			}
			System.out.println(num+" "+num2);
		}
		else {
			System.out.println(num+" "+(num2+time));
		}
		
	}
}