import java.util.*;
public class Main {
	
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		int time = sc.nextInt();
		int time2 = sc.nextInt();
		if(time2 < 45) {
			time--;
			time2 = 60-(45-time2);
			if(time<0) {
				time = 23;
			}
			System.out.println(time+" "+time2);
		}
		else {
			System.out.println(time+" "+(time2-45));
		}
	}
}