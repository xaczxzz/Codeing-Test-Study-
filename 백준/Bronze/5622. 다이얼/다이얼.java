import java.util.*;
public class Main {
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		String N = sc.next();
		char result = 0;
		int time =0;
		for(int i=0;i<N.length();i++) {
			result = N.charAt(i);
			if(result =='A' || result =='B'|| result == 'C') {
				time +=3;
			}
			else if(result =='D'||result =='E'||result =='F') {
				time +=4;
			}
			else if(result =='G'||result =='H'||result =='I') {
				time +=5;
			}
			else if(result =='J'||result =='K'||result =='L') {
				time +=6;
			}
			else if(result =='M'||result =='N'||result =='O') {
				time +=7;
			}
			else if(result =='P'||result =='Q'||result =='R'||result =='S') {
				time +=8;
			}
			else if(result =='T'||result =='U'||result =='V') {
				time += 9;
			}
			else if(result =='W'||result =='X'||result =='Y'||result =='Z') {
				time += 10;
			}
		}
		System.out.println(time);
	}
}