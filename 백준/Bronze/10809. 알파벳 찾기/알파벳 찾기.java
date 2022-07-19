import java.util.*;
public class Main {
	
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		int [] array = new int [26];
		for(int j=0; j<array.length;j++) {
			array[j] = -1;
		}
		String s = sc.next();
		int [] alpabet = new int [27];
		for(int i=0; i<s.length();i++) {
			char ch =(s.charAt(i));
			if(array[ch-'a']==-1) {
				array[ch-'a'] =i;
			}
			
		}
		for(int i:array) {
			System.out.print(i+" ");
		}
		
		
	}
}